// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingnumbersbulkupdates

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Bulk update phone number profiles */
class MessagingNumbersBulkUpdateCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Configure the messaging profile these phone numbers are assigned to:
     * * Set this field to `""` to unassign each number from their respective messaging profile
     * * Set this field to a quoted UUID of a messaging profile to assign these numbers to that
     *   messaging profile
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun messagingProfileId(): String = body.messagingProfileId()

    /**
     * The list of phone numbers to update.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun numbers(): List<String> = body.numbers()

    /**
     * If true, only assign numbers to the profile without changing other settings.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun assignOnly(): Optional<Boolean> = body.assignOnly()

    /**
     * Returns the raw JSON value of [messagingProfileId].
     *
     * Unlike [messagingProfileId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _messagingProfileId(): JsonField<String> = body._messagingProfileId()

    /**
     * Returns the raw JSON value of [numbers].
     *
     * Unlike [numbers], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _numbers(): JsonField<List<String>> = body._numbers()

    /**
     * Returns the raw JSON value of [assignOnly].
     *
     * Unlike [assignOnly], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _assignOnly(): JsonField<Boolean> = body._assignOnly()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [MessagingNumbersBulkUpdateCreateParams].
         *
         * The following fields are required:
         * ```java
         * .messagingProfileId()
         * .numbers()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MessagingNumbersBulkUpdateCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            messagingNumbersBulkUpdateCreateParams: MessagingNumbersBulkUpdateCreateParams
        ) = apply {
            body = messagingNumbersBulkUpdateCreateParams.body.toBuilder()
            additionalHeaders = messagingNumbersBulkUpdateCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                messagingNumbersBulkUpdateCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [messagingProfileId]
         * - [numbers]
         * - [assignOnly]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Configure the messaging profile these phone numbers are assigned to:
         * * Set this field to `""` to unassign each number from their respective messaging profile
         * * Set this field to a quoted UUID of a messaging profile to assign these numbers to that
         *   messaging profile
         */
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

        /** The list of phone numbers to update. */
        fun numbers(numbers: List<String>) = apply { body.numbers(numbers) }

        /**
         * Sets [Builder.numbers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numbers] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun numbers(numbers: JsonField<List<String>>) = apply { body.numbers(numbers) }

        /**
         * Adds a single [String] to [numbers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addNumber(number: String) = apply { body.addNumber(number) }

        /** If true, only assign numbers to the profile without changing other settings. */
        fun assignOnly(assignOnly: Boolean) = apply { body.assignOnly(assignOnly) }

        /**
         * Sets [Builder.assignOnly] to an arbitrary JSON value.
         *
         * You should usually call [Builder.assignOnly] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun assignOnly(assignOnly: JsonField<Boolean>) = apply { body.assignOnly(assignOnly) }

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
         * Returns an immutable instance of [MessagingNumbersBulkUpdateCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .messagingProfileId()
         * .numbers()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MessagingNumbersBulkUpdateCreateParams =
            MessagingNumbersBulkUpdateCreateParams(
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
        private val messagingProfileId: JsonField<String>,
        private val numbers: JsonField<List<String>>,
        private val assignOnly: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("messaging_profile_id")
            @ExcludeMissing
            messagingProfileId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("numbers")
            @ExcludeMissing
            numbers: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("assign_only")
            @ExcludeMissing
            assignOnly: JsonField<Boolean> = JsonMissing.of(),
        ) : this(messagingProfileId, numbers, assignOnly, mutableMapOf())

        /**
         * Configure the messaging profile these phone numbers are assigned to:
         * * Set this field to `""` to unassign each number from their respective messaging profile
         * * Set this field to a quoted UUID of a messaging profile to assign these numbers to that
         *   messaging profile
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun messagingProfileId(): String = messagingProfileId.getRequired("messaging_profile_id")

        /**
         * The list of phone numbers to update.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun numbers(): List<String> = numbers.getRequired("numbers")

        /**
         * If true, only assign numbers to the profile without changing other settings.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun assignOnly(): Optional<Boolean> = assignOnly.getOptional("assign_only")

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
         * Returns the raw JSON value of [numbers].
         *
         * Unlike [numbers], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("numbers") @ExcludeMissing fun _numbers(): JsonField<List<String>> = numbers

        /**
         * Returns the raw JSON value of [assignOnly].
         *
         * Unlike [assignOnly], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("assign_only")
        @ExcludeMissing
        fun _assignOnly(): JsonField<Boolean> = assignOnly

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
             * .messagingProfileId()
             * .numbers()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var messagingProfileId: JsonField<String>? = null
            private var numbers: JsonField<MutableList<String>>? = null
            private var assignOnly: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                messagingProfileId = body.messagingProfileId
                numbers = body.numbers.map { it.toMutableList() }
                assignOnly = body.assignOnly
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Configure the messaging profile these phone numbers are assigned to:
             * * Set this field to `""` to unassign each number from their respective messaging
             *   profile
             * * Set this field to a quoted UUID of a messaging profile to assign these numbers to
             *   that messaging profile
             */
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

            /** The list of phone numbers to update. */
            fun numbers(numbers: List<String>) = numbers(JsonField.of(numbers))

            /**
             * Sets [Builder.numbers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numbers] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun numbers(numbers: JsonField<List<String>>) = apply {
                this.numbers = numbers.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [numbers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addNumber(number: String) = apply {
                numbers =
                    (numbers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("numbers", it).add(number)
                    }
            }

            /** If true, only assign numbers to the profile without changing other settings. */
            fun assignOnly(assignOnly: Boolean) = assignOnly(JsonField.of(assignOnly))

            /**
             * Sets [Builder.assignOnly] to an arbitrary JSON value.
             *
             * You should usually call [Builder.assignOnly] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun assignOnly(assignOnly: JsonField<Boolean>) = apply { this.assignOnly = assignOnly }

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
             * .messagingProfileId()
             * .numbers()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("messagingProfileId", messagingProfileId),
                    checkRequired("numbers", numbers).map { it.toImmutable() },
                    assignOnly,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            messagingProfileId()
            numbers()
            assignOnly()
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
            (if (messagingProfileId.asKnown().isPresent) 1 else 0) +
                (numbers.asKnown().getOrNull()?.size ?: 0) +
                (if (assignOnly.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                messagingProfileId == other.messagingProfileId &&
                numbers == other.numbers &&
                assignOnly == other.assignOnly &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(messagingProfileId, numbers, assignOnly, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{messagingProfileId=$messagingProfileId, numbers=$numbers, assignOnly=$assignOnly, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MessagingNumbersBulkUpdateCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "MessagingNumbersBulkUpdateCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
