// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.UnwrapWebhookParams
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import com.telnyx.sdk.errors.TelnyxWebhookException
import com.telnyx.sdk.models.webhooks.UnsafeUnwrapWebhookEvent
import com.telnyx.sdk.models.webhooks.UnwrapWebhookEvent
import java.security.KeyFactory
import java.security.Signature
import java.security.spec.X509EncodedKeySpec
import java.util.Base64
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull
import kotlin.math.abs

class WebhookServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    WebhookService {

    private val withRawResponse: WebhookService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WebhookService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhookService =
        WebhookServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun unsafeUnwrap(body: String): UnsafeUnwrapWebhookEvent =
        try {
            clientOptions.jsonMapper.readValue(body, jacksonTypeRef<UnsafeUnwrapWebhookEvent>())
        } catch (e: Exception) {
            throw TelnyxInvalidDataException("Error parsing body", e)
        }

    override fun unwrap(body: String): UnwrapWebhookEvent =
        try {
            clientOptions.jsonMapper.readValue(body, jacksonTypeRef<UnwrapWebhookEvent>())
        } catch (e: Exception) {
            throw TelnyxInvalidDataException("Error parsing body", e)
        }

    override fun unwrap(unwrapParams: UnwrapWebhookParams): UnwrapWebhookEvent {
        val headers = unwrapParams.headers().getOrNull()
        if (headers != null) {
            val publicKey =
                checkRequired(
                    "publicKey",
                    unwrapParams.secret().getOrNull() ?: clientOptions.publicKey().getOrNull(),
                )
            verifyWebhookSignature(unwrapParams.body(), headers, publicKey)
        }
        return unwrap(unwrapParams.body())
    }

    private fun verifyWebhookSignature(
        payload: String,
        headers: com.telnyx.sdk.core.http.Headers,
        publicKeyB64: String,
    ) {
        val signature = getHeader(headers, SIGNATURE_HEADER)
        val timestamp = getHeader(headers, TIMESTAMP_HEADER)

        if (signature.isNullOrEmpty()) {
            throw TelnyxWebhookException("Missing required header: $SIGNATURE_HEADER")
        }
        if (timestamp.isNullOrEmpty()) {
            throw TelnyxWebhookException("Missing required header: $TIMESTAMP_HEADER")
        }

        try {
            val webhookTime = timestamp.toLong()
            val currentTime = System.currentTimeMillis() / 1000
            if (abs(currentTime - webhookTime) > TIMESTAMP_TOLERANCE_SECONDS) {
                throw TelnyxWebhookException(
                    "Webhook timestamp is outside the allowed tolerance window"
                )
            }
        } catch (e: NumberFormatException) {
            throw TelnyxWebhookException("Invalid timestamp format", e)
        }

        val publicKeyBytes =
            try {
                Base64.getDecoder().decode(publicKeyB64)
            } catch (e: Exception) {
                throw TelnyxWebhookException("Invalid public key encoding", e)
            }

        if (publicKeyBytes.size != ED25519_PUBLIC_KEY_SIZE) {
            throw TelnyxWebhookException(
                "Invalid public key size: expected $ED25519_PUBLIC_KEY_SIZE bytes, " +
                    "got ${publicKeyBytes.size}"
            )
        }

        val signatureBytes =
            try {
                Base64.getDecoder().decode(signature)
            } catch (e: Exception) {
                throw TelnyxWebhookException("Invalid signature encoding", e)
            }

        if (signatureBytes.size != ED25519_SIGNATURE_SIZE) {
            throw TelnyxWebhookException(
                "Invalid signature size: expected $ED25519_SIGNATURE_SIZE bytes, " +
                    "got ${signatureBytes.size}"
            )
        }

        val signedPayload = "$timestamp|$payload".toByteArray(Charsets.UTF_8)

        try {
            val x509KeyBytes = wrapEd25519PublicKey(publicKeyBytes)
            val keySpec = X509EncodedKeySpec(x509KeyBytes)
            val keyFactory = KeyFactory.getInstance("Ed25519")
            val publicKey = keyFactory.generatePublic(keySpec)

            val sig = Signature.getInstance("Ed25519")
            sig.initVerify(publicKey)
            sig.update(signedPayload)

            if (!sig.verify(signatureBytes)) {
                throw TelnyxWebhookException("Webhook signature verification failed")
            }
        } catch (e: TelnyxWebhookException) {
            throw e
        } catch (e: Exception) {
            throw TelnyxWebhookException(
                "Signature verification failed due to cryptographic error",
                e,
            )
        }
    }

    private fun getHeader(
        headers: com.telnyx.sdk.core.http.Headers,
        name: String,
    ): String? {
        val values = headers.values(name)
        if (values.isNotEmpty()) {
            return values.first()
        }
        for (headerName in headers.names()) {
            if (headerName.equals(name, ignoreCase = true)) {
                val headerValues = headers.values(headerName)
                if (headerValues.isNotEmpty()) {
                    return headerValues.first()
                }
            }
        }
        return null
    }

    private fun wrapEd25519PublicKey(rawKey: ByteArray): ByteArray {
        val header =
            byteArrayOf(
                0x30,
                0x2a,
                0x30,
                0x05,
                0x06,
                0x03,
                0x2b,
                0x65,
                0x70,
                0x03,
                0x21,
                0x00,
            )
        return header + rawKey
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WebhookService.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WebhookService.WithRawResponse =
            WebhookServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }

    companion object {
        private const val SIGNATURE_HEADER = "telnyx-signature-ed25519"
        private const val TIMESTAMP_HEADER = "telnyx-timestamp"
        private const val TIMESTAMP_TOLERANCE_SECONDS = 300L
        private const val ED25519_PUBLIC_KEY_SIZE = 32
        private const val ED25519_SIGNATURE_SIZE = 64
    }
}
