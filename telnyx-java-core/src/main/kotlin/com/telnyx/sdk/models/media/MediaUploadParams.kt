// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.media

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.MultipartField
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

/** Upload media file to Telnyx so it can be used with other Telnyx services */
class MediaUploadParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The URL where the media to be stored in Telnyx network is currently hosted. The maximum
     * allowed size is 20 MB.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun mediaUrl(): String = body.mediaUrl()

    /**
     * The unique identifier of a file.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mediaName(): Optional<String> = body.mediaName()

    /**
     * The number of seconds after which the media resource will be deleted, defaults to 2 days. The
     * maximum allowed vale is 630720000, which translates to 20 years.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ttlSecs(): Optional<Long> = body.ttlSecs()

    /**
     * Returns the raw multipart value of [mediaUrl].
     *
     * Unlike [mediaUrl], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _mediaUrl(): MultipartField<String> = body._mediaUrl()

    /**
     * Returns the raw multipart value of [mediaName].
     *
     * Unlike [mediaName], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _mediaName(): MultipartField<String> = body._mediaName()

    /**
     * Returns the raw multipart value of [ttlSecs].
     *
     * Unlike [ttlSecs], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _ttlSecs(): MultipartField<Long> = body._ttlSecs()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MediaUploadParams].
         *
         * The following fields are required:
         * ```java
         * .mediaUrl()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MediaUploadParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(mediaUploadParams: MediaUploadParams) = apply {
            body = mediaUploadParams.body.toBuilder()
            additionalHeaders = mediaUploadParams.additionalHeaders.toBuilder()
            additionalQueryParams = mediaUploadParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [mediaUrl]
         * - [mediaName]
         * - [ttlSecs]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * The URL where the media to be stored in Telnyx network is currently hosted. The maximum
         * allowed size is 20 MB.
         */
        fun mediaUrl(mediaUrl: String) = apply { body.mediaUrl(mediaUrl) }

        /**
         * Sets [Builder.mediaUrl] to an arbitrary multipart value.
         *
         * You should usually call [Builder.mediaUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mediaUrl(mediaUrl: MultipartField<String>) = apply { body.mediaUrl(mediaUrl) }

        /** The unique identifier of a file. */
        fun mediaName(mediaName: String) = apply { body.mediaName(mediaName) }

        /**
         * Sets [Builder.mediaName] to an arbitrary multipart value.
         *
         * You should usually call [Builder.mediaName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun mediaName(mediaName: MultipartField<String>) = apply { body.mediaName(mediaName) }

        /**
         * The number of seconds after which the media resource will be deleted, defaults to 2 days.
         * The maximum allowed vale is 630720000, which translates to 20 years.
         */
        fun ttlSecs(ttlSecs: Long) = apply { body.ttlSecs(ttlSecs) }

        /**
         * Sets [Builder.ttlSecs] to an arbitrary multipart value.
         *
         * You should usually call [Builder.ttlSecs] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ttlSecs(ttlSecs: MultipartField<Long>) = apply { body.ttlSecs(ttlSecs) }

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
         * Returns an immutable instance of [MediaUploadParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .mediaUrl()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MediaUploadParams =
            MediaUploadParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Map<String, MultipartField<*>> =
        (mapOf("media_url" to _mediaUrl(), "media_name" to _mediaName(), "ttl_secs" to _ttlSecs()) +
                _additionalBodyProperties().mapValues { (_, value) -> MultipartField.of(value) })
            .toImmutable()

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val mediaUrl: MultipartField<String>,
        private val mediaName: MultipartField<String>,
        private val ttlSecs: MultipartField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        /**
         * The URL where the media to be stored in Telnyx network is currently hosted. The maximum
         * allowed size is 20 MB.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun mediaUrl(): String = mediaUrl.value.getRequired("media_url")

        /**
         * The unique identifier of a file.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mediaName(): Optional<String> = mediaName.value.getOptional("media_name")

        /**
         * The number of seconds after which the media resource will be deleted, defaults to 2 days.
         * The maximum allowed vale is 630720000, which translates to 20 years.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ttlSecs(): Optional<Long> = ttlSecs.value.getOptional("ttl_secs")

        /**
         * Returns the raw multipart value of [mediaUrl].
         *
         * Unlike [mediaUrl], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("media_url")
        @ExcludeMissing
        fun _mediaUrl(): MultipartField<String> = mediaUrl

        /**
         * Returns the raw multipart value of [mediaName].
         *
         * Unlike [mediaName], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("media_name")
        @ExcludeMissing
        fun _mediaName(): MultipartField<String> = mediaName

        /**
         * Returns the raw multipart value of [ttlSecs].
         *
         * Unlike [ttlSecs], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("ttl_secs") @ExcludeMissing fun _ttlSecs(): MultipartField<Long> = ttlSecs

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

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .mediaUrl()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var mediaUrl: MultipartField<String>? = null
            private var mediaName: MultipartField<String> = MultipartField.of(null)
            private var ttlSecs: MultipartField<Long> = MultipartField.of(null)
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                mediaUrl = body.mediaUrl
                mediaName = body.mediaName
                ttlSecs = body.ttlSecs
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The URL where the media to be stored in Telnyx network is currently hosted. The
             * maximum allowed size is 20 MB.
             */
            fun mediaUrl(mediaUrl: String) = mediaUrl(MultipartField.of(mediaUrl))

            /**
             * Sets [Builder.mediaUrl] to an arbitrary multipart value.
             *
             * You should usually call [Builder.mediaUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mediaUrl(mediaUrl: MultipartField<String>) = apply { this.mediaUrl = mediaUrl }

            /** The unique identifier of a file. */
            fun mediaName(mediaName: String) = mediaName(MultipartField.of(mediaName))

            /**
             * Sets [Builder.mediaName] to an arbitrary multipart value.
             *
             * You should usually call [Builder.mediaName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mediaName(mediaName: MultipartField<String>) = apply { this.mediaName = mediaName }

            /**
             * The number of seconds after which the media resource will be deleted, defaults to 2
             * days. The maximum allowed vale is 630720000, which translates to 20 years.
             */
            fun ttlSecs(ttlSecs: Long) = ttlSecs(MultipartField.of(ttlSecs))

            /**
             * Sets [Builder.ttlSecs] to an arbitrary multipart value.
             *
             * You should usually call [Builder.ttlSecs] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ttlSecs(ttlSecs: MultipartField<Long>) = apply { this.ttlSecs = ttlSecs }

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
             *
             * The following fields are required:
             * ```java
             * .mediaUrl()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("mediaUrl", mediaUrl),
                    mediaName,
                    ttlSecs,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            mediaUrl()
            mediaName()
            ttlSecs()
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
                mediaUrl == other.mediaUrl &&
                mediaName == other.mediaName &&
                ttlSecs == other.ttlSecs &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(mediaUrl, mediaName, ttlSecs, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{mediaUrl=$mediaUrl, mediaName=$mediaName, ttlSecs=$ttlSecs, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MediaUploadParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "MediaUploadParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
