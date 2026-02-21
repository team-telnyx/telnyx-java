// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.alphanumericsenderids

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

/** Create a new alphanumeric sender ID associated with a messaging profile. */
class AlphanumericSenderIdCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The alphanumeric sender ID string.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun alphanumericSenderId(): String = body.alphanumericSenderId()

    /**
     * The messaging profile to associate the sender ID with.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun messagingProfileId(): String = body.messagingProfileId()

    /**
     * A US long code number to use as fallback when sending to US destinations.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun usLongCodeFallback(): Optional<String> = body.usLongCodeFallback()

    /**
     * Returns the raw JSON value of [alphanumericSenderId].
     *
     * Unlike [alphanumericSenderId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _alphanumericSenderId(): JsonField<String> = body._alphanumericSenderId()

    /**
     * Returns the raw JSON value of [messagingProfileId].
     *
     * Unlike [messagingProfileId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _messagingProfileId(): JsonField<String> = body._messagingProfileId()

    /**
     * Returns the raw JSON value of [usLongCodeFallback].
     *
     * Unlike [usLongCodeFallback], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _usLongCodeFallback(): JsonField<String> = body._usLongCodeFallback()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [AlphanumericSenderIdCreateParams].
         *
         * The following fields are required:
         * ```java
         * .alphanumericSenderId()
         * .messagingProfileId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AlphanumericSenderIdCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(alphanumericSenderIdCreateParams: AlphanumericSenderIdCreateParams) =
            apply {
                body = alphanumericSenderIdCreateParams.body.toBuilder()
                additionalHeaders = alphanumericSenderIdCreateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    alphanumericSenderIdCreateParams.additionalQueryParams.toBuilder()
            }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [alphanumericSenderId]
         * - [messagingProfileId]
         * - [usLongCodeFallback]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The alphanumeric sender ID string. */
        fun alphanumericSenderId(alphanumericSenderId: String) = apply {
            body.alphanumericSenderId(alphanumericSenderId)
        }

        /**
         * Sets [Builder.alphanumericSenderId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.alphanumericSenderId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun alphanumericSenderId(alphanumericSenderId: JsonField<String>) = apply {
            body.alphanumericSenderId(alphanumericSenderId)
        }

        /** The messaging profile to associate the sender ID with. */
        fun messagingProfileId(messagingProfileId: String) = apply {
            body.messagingProfileId(messagingProfileId)
        }

        /**
         * Sets [Builder.messagingProfileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messagingProfileId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun messagingProfileId(messagingProfileId: JsonField<String>) = apply {
            body.messagingProfileId(messagingProfileId)
        }

        /** A US long code number to use as fallback when sending to US destinations. */
        fun usLongCodeFallback(usLongCodeFallback: String) = apply {
            body.usLongCodeFallback(usLongCodeFallback)
        }

        /**
         * Sets [Builder.usLongCodeFallback] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usLongCodeFallback] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun usLongCodeFallback(usLongCodeFallback: JsonField<String>) = apply {
            body.usLongCodeFallback(usLongCodeFallback)
        }

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
         * Returns an immutable instance of [AlphanumericSenderIdCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .alphanumericSenderId()
         * .messagingProfileId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AlphanumericSenderIdCreateParams =
            AlphanumericSenderIdCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val alphanumericSenderId: JsonField<String>,
        private val messagingProfileId: JsonField<String>,
        private val usLongCodeFallback: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("alphanumeric_sender_id")
            @ExcludeMissing
            alphanumericSenderId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("messaging_profile_id")
            @ExcludeMissing
            messagingProfileId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("us_long_code_fallback")
            @ExcludeMissing
            usLongCodeFallback: JsonField<String> = JsonMissing.of(),
        ) : this(alphanumericSenderId, messagingProfileId, usLongCodeFallback, mutableMapOf())

        /**
         * The alphanumeric sender ID string.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun alphanumericSenderId(): String =
            alphanumericSenderId.getRequired("alphanumeric_sender_id")

        /**
         * The messaging profile to associate the sender ID with.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun messagingProfileId(): String = messagingProfileId.getRequired("messaging_profile_id")

        /**
         * A US long code number to use as fallback when sending to US destinations.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun usLongCodeFallback(): Optional<String> =
            usLongCodeFallback.getOptional("us_long_code_fallback")

        /**
         * Returns the raw JSON value of [alphanumericSenderId].
         *
         * Unlike [alphanumericSenderId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("alphanumeric_sender_id")
        @ExcludeMissing
        fun _alphanumericSenderId(): JsonField<String> = alphanumericSenderId

        /**
         * Returns the raw JSON value of [messagingProfileId].
         *
         * Unlike [messagingProfileId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("messaging_profile_id")
        @ExcludeMissing
        fun _messagingProfileId(): JsonField<String> = messagingProfileId

        /**
         * Returns the raw JSON value of [usLongCodeFallback].
         *
         * Unlike [usLongCodeFallback], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("us_long_code_fallback")
        @ExcludeMissing
        fun _usLongCodeFallback(): JsonField<String> = usLongCodeFallback

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
             * .alphanumericSenderId()
             * .messagingProfileId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var alphanumericSenderId: JsonField<String>? = null
            private var messagingProfileId: JsonField<String>? = null
            private var usLongCodeFallback: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                alphanumericSenderId = body.alphanumericSenderId
                messagingProfileId = body.messagingProfileId
                usLongCodeFallback = body.usLongCodeFallback
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The alphanumeric sender ID string. */
            fun alphanumericSenderId(alphanumericSenderId: String) =
                alphanumericSenderId(JsonField.of(alphanumericSenderId))

            /**
             * Sets [Builder.alphanumericSenderId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.alphanumericSenderId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun alphanumericSenderId(alphanumericSenderId: JsonField<String>) = apply {
                this.alphanumericSenderId = alphanumericSenderId
            }

            /** The messaging profile to associate the sender ID with. */
            fun messagingProfileId(messagingProfileId: String) =
                messagingProfileId(JsonField.of(messagingProfileId))

            /**
             * Sets [Builder.messagingProfileId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.messagingProfileId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun messagingProfileId(messagingProfileId: JsonField<String>) = apply {
                this.messagingProfileId = messagingProfileId
            }

            /** A US long code number to use as fallback when sending to US destinations. */
            fun usLongCodeFallback(usLongCodeFallback: String) =
                usLongCodeFallback(JsonField.of(usLongCodeFallback))

            /**
             * Sets [Builder.usLongCodeFallback] to an arbitrary JSON value.
             *
             * You should usually call [Builder.usLongCodeFallback] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun usLongCodeFallback(usLongCodeFallback: JsonField<String>) = apply {
                this.usLongCodeFallback = usLongCodeFallback
            }

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
             * .alphanumericSenderId()
             * .messagingProfileId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("alphanumericSenderId", alphanumericSenderId),
                    checkRequired("messagingProfileId", messagingProfileId),
                    usLongCodeFallback,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            alphanumericSenderId()
            messagingProfileId()
            usLongCodeFallback()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: TelnyxInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (alphanumericSenderId.asKnown().isPresent) 1 else 0) +
                (if (messagingProfileId.asKnown().isPresent) 1 else 0) +
                (if (usLongCodeFallback.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                alphanumericSenderId == other.alphanumericSenderId &&
                messagingProfileId == other.messagingProfileId &&
                usLongCodeFallback == other.usLongCodeFallback &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                alphanumericSenderId,
                messagingProfileId,
                usLongCodeFallback,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{alphanumericSenderId=$alphanumericSenderId, messagingProfileId=$messagingProfileId, usLongCodeFallback=$usLongCodeFallback, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AlphanumericSenderIdCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AlphanumericSenderIdCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
