// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.standardwebhooks.Webhook
import com.standardwebhooks.exceptions.WebhookVerificationException
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.UnwrapWebhookParams
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import com.telnyx.sdk.errors.TelnyxWebhookException
import com.telnyx.sdk.models.webhooks.UnsafeUnwrapWebhookEvent
import com.telnyx.sdk.models.webhooks.UnwrapWebhookEvent
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

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
            try {
                val webhookSecret =
                    checkRequired(
                        "publicKey",
                        unwrapParams.secret().getOrNull() ?: clientOptions.publicKey().getOrNull(),
                    )
                val headersMap =
                    headers.names().associateWith { name -> headers.values(name) }.toMap()

                val webhook = Webhook(webhookSecret)
                webhook.verify(unwrapParams.body(), headersMap)
            } catch (e: WebhookVerificationException) {
                throw TelnyxWebhookException("Could not verify webhook event signature", e)
            }
        }
        return unwrap(unwrapParams.body())
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
}
