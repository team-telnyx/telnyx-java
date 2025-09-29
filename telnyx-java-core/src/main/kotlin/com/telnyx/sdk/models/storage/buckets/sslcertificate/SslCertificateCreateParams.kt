// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.buckets.sslcertificate

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.MultipartField
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.io.InputStream
import java.nio.file.Path
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.io.path.inputStream
import kotlin.io.path.name
import kotlin.jvm.optionals.getOrNull

/**
 * Uploads an SSL certificate and its matching secret so that you can use Telnyx’s storage as your
 * CDN.
 */
class SslCertificateCreateParams
private constructor(
    private val bucketName: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun bucketName(): Optional<String> = Optional.ofNullable(bucketName)

    /**
     * The SSL certificate file
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun certificate(): Optional<InputStream> = body.certificate()

    /**
     * The private key file
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun privateKey(): Optional<InputStream> = body.privateKey()

    /**
     * Returns the raw multipart value of [certificate].
     *
     * Unlike [certificate], this method doesn't throw if the multipart field has an unexpected
     * type.
     */
    fun _certificate(): MultipartField<InputStream> = body._certificate()

    /**
     * Returns the raw multipart value of [privateKey].
     *
     * Unlike [privateKey], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _privateKey(): MultipartField<InputStream> = body._privateKey()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): SslCertificateCreateParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [SslCertificateCreateParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SslCertificateCreateParams]. */
    class Builder internal constructor() {

        private var bucketName: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(sslCertificateCreateParams: SslCertificateCreateParams) = apply {
            bucketName = sslCertificateCreateParams.bucketName
            body = sslCertificateCreateParams.body.toBuilder()
            additionalHeaders = sslCertificateCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = sslCertificateCreateParams.additionalQueryParams.toBuilder()
        }

        fun bucketName(bucketName: String?) = apply { this.bucketName = bucketName }

        /** Alias for calling [Builder.bucketName] with `bucketName.orElse(null)`. */
        fun bucketName(bucketName: Optional<String>) = bucketName(bucketName.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [certificate]
         * - [privateKey]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The SSL certificate file */
        fun certificate(certificate: InputStream) = apply { body.certificate(certificate) }

        /**
         * Sets [Builder.certificate] to an arbitrary multipart value.
         *
         * You should usually call [Builder.certificate] with a well-typed [InputStream] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun certificate(certificate: MultipartField<InputStream>) = apply {
            body.certificate(certificate)
        }

        /** The SSL certificate file */
        fun certificate(certificate: ByteArray) = apply { body.certificate(certificate) }

        /** The SSL certificate file */
        fun certificate(path: Path) = apply { body.certificate(path) }

        /** The private key file */
        fun privateKey(privateKey: InputStream) = apply { body.privateKey(privateKey) }

        /**
         * Sets [Builder.privateKey] to an arbitrary multipart value.
         *
         * You should usually call [Builder.privateKey] with a well-typed [InputStream] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun privateKey(privateKey: MultipartField<InputStream>) = apply {
            body.privateKey(privateKey)
        }

        /** The private key file */
        fun privateKey(privateKey: ByteArray) = apply { body.privateKey(privateKey) }

        /** The private key file */
        fun privateKey(path: Path) = apply { body.privateKey(path) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [SslCertificateCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SslCertificateCreateParams =
            SslCertificateCreateParams(
                bucketName,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Map<String, MultipartField<*>> =
        (mapOf("certificate" to _certificate(), "private_key" to _privateKey()) +
                _additionalBodyProperties().mapValues { (_, value) -> MultipartField.of(value) })
            .toImmutable()

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> bucketName ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val certificate: MultipartField<InputStream>,
        private val privateKey: MultipartField<InputStream>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        /**
         * The SSL certificate file
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun certificate(): Optional<InputStream> = certificate.value.getOptional("certificate")

        /**
         * The private key file
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun privateKey(): Optional<InputStream> = privateKey.value.getOptional("private_key")

        /**
         * Returns the raw multipart value of [certificate].
         *
         * Unlike [certificate], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("certificate")
        @ExcludeMissing
        fun _certificate(): MultipartField<InputStream> = certificate

        /**
         * Returns the raw multipart value of [privateKey].
         *
         * Unlike [privateKey], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("private_key")
        @ExcludeMissing
        fun _privateKey(): MultipartField<InputStream> = privateKey

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var certificate: MultipartField<InputStream> = MultipartField.of(null)
            private var privateKey: MultipartField<InputStream> = MultipartField.of(null)
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                certificate = body.certificate
                privateKey = body.privateKey
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The SSL certificate file */
            fun certificate(certificate: InputStream) = certificate(MultipartField.of(certificate))

            /**
             * Sets [Builder.certificate] to an arbitrary multipart value.
             *
             * You should usually call [Builder.certificate] with a well-typed [InputStream] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun certificate(certificate: MultipartField<InputStream>) = apply {
                this.certificate = certificate
            }

            /** The SSL certificate file */
            fun certificate(certificate: ByteArray) = certificate(certificate.inputStream())

            /** The SSL certificate file */
            fun certificate(path: Path) =
                certificate(
                    MultipartField.builder<InputStream>()
                        .value(path.inputStream())
                        .filename(path.name)
                        .build()
                )

            /** The private key file */
            fun privateKey(privateKey: InputStream) = privateKey(MultipartField.of(privateKey))

            /**
             * Sets [Builder.privateKey] to an arbitrary multipart value.
             *
             * You should usually call [Builder.privateKey] with a well-typed [InputStream] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun privateKey(privateKey: MultipartField<InputStream>) = apply {
                this.privateKey = privateKey
            }

            /** The private key file */
            fun privateKey(privateKey: ByteArray) = privateKey(privateKey.inputStream())

            /** The private key file */
            fun privateKey(path: Path) =
                privateKey(
                    MultipartField.builder<InputStream>()
                        .value(path.inputStream())
                        .filename(path.name)
                        .build()
                )

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body = Body(certificate, privateKey, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            certificate()
            privateKey()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: TelnyxInvalidDataException) {
                false
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                certificate == other.certificate &&
                privateKey == other.privateKey &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(certificate, privateKey, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{certificate=$certificate, privateKey=$privateKey, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SslCertificateCreateParams &&
            bucketName == other.bucketName &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(bucketName, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "SslCertificateCreateParams{bucketName=$bucketName, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
