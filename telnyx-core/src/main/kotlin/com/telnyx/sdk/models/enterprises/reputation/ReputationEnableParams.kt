// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
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
import kotlin.jvm.optionals.getOrNull

/**
 * Enable Number Reputation service for an enterprise.
 *
 * **Requirements:**
 * - Signed LOA (Letter of Authorization) document ID
 * - Reputation check frequency (defaults to `business_daily`)
 * - Number Reputation Terms of Service must be accepted
 *
 * **Flow:**
 * 1. Registers the enterprise for reputation monitoring
 * 2. Creates reputation settings with `pending` status
 * 3. Awaits admin approval before monitoring begins
 *
 * **Resubmission After Rejection:** If a previously rejected record exists, this endpoint will
 * delete it and create a new `pending` record.
 *
 * **Available Frequencies:**
 * - `business_daily` — Monday–Friday
 * - `daily` — Every day
 * - `weekly` — Once per week
 * - `biweekly` — Once every two weeks
 * - `monthly` — Once per month
 * - `never` — Manual refresh only
 */
class ReputationEnableParams
private constructor(
    private val enterpriseId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun enterpriseId(): Optional<String> = Optional.ofNullable(enterpriseId)

    /**
     * ID of the signed Letter of Authorization (LOA) document uploaded to the document service
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun loaDocumentId(): String = body.loaDocumentId()

    /**
     * Frequency for automatically refreshing reputation data
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun checkFrequency(): Optional<CheckFrequency> = body.checkFrequency()

    /**
     * Returns the raw JSON value of [loaDocumentId].
     *
     * Unlike [loaDocumentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _loaDocumentId(): JsonField<String> = body._loaDocumentId()

    /**
     * Returns the raw JSON value of [checkFrequency].
     *
     * Unlike [checkFrequency], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _checkFrequency(): JsonField<CheckFrequency> = body._checkFrequency()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ReputationEnableParams].
         *
         * The following fields are required:
         * ```java
         * .loaDocumentId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ReputationEnableParams]. */
    class Builder internal constructor() {

        private var enterpriseId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(reputationEnableParams: ReputationEnableParams) = apply {
            enterpriseId = reputationEnableParams.enterpriseId
            body = reputationEnableParams.body.toBuilder()
            additionalHeaders = reputationEnableParams.additionalHeaders.toBuilder()
            additionalQueryParams = reputationEnableParams.additionalQueryParams.toBuilder()
        }

        fun enterpriseId(enterpriseId: String?) = apply { this.enterpriseId = enterpriseId }

        /** Alias for calling [Builder.enterpriseId] with `enterpriseId.orElse(null)`. */
        fun enterpriseId(enterpriseId: Optional<String>) = enterpriseId(enterpriseId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [loaDocumentId]
         * - [checkFrequency]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * ID of the signed Letter of Authorization (LOA) document uploaded to the document service
         */
        fun loaDocumentId(loaDocumentId: String) = apply { body.loaDocumentId(loaDocumentId) }

        /**
         * Sets [Builder.loaDocumentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.loaDocumentId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun loaDocumentId(loaDocumentId: JsonField<String>) = apply {
            body.loaDocumentId(loaDocumentId)
        }

        /** Frequency for automatically refreshing reputation data */
        fun checkFrequency(checkFrequency: CheckFrequency) = apply {
            body.checkFrequency(checkFrequency)
        }

        /**
         * Sets [Builder.checkFrequency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.checkFrequency] with a well-typed [CheckFrequency] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun checkFrequency(checkFrequency: JsonField<CheckFrequency>) = apply {
            body.checkFrequency(checkFrequency)
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
         * Returns an immutable instance of [ReputationEnableParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .loaDocumentId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ReputationEnableParams =
            ReputationEnableParams(
                enterpriseId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> enterpriseId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val loaDocumentId: JsonField<String>,
        private val checkFrequency: JsonField<CheckFrequency>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("loa_document_id")
            @ExcludeMissing
            loaDocumentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("check_frequency")
            @ExcludeMissing
            checkFrequency: JsonField<CheckFrequency> = JsonMissing.of(),
        ) : this(loaDocumentId, checkFrequency, mutableMapOf())

        /**
         * ID of the signed Letter of Authorization (LOA) document uploaded to the document service
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun loaDocumentId(): String = loaDocumentId.getRequired("loa_document_id")

        /**
         * Frequency for automatically refreshing reputation data
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun checkFrequency(): Optional<CheckFrequency> =
            checkFrequency.getOptional("check_frequency")

        /**
         * Returns the raw JSON value of [loaDocumentId].
         *
         * Unlike [loaDocumentId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("loa_document_id")
        @ExcludeMissing
        fun _loaDocumentId(): JsonField<String> = loaDocumentId

        /**
         * Returns the raw JSON value of [checkFrequency].
         *
         * Unlike [checkFrequency], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("check_frequency")
        @ExcludeMissing
        fun _checkFrequency(): JsonField<CheckFrequency> = checkFrequency

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
             * .loaDocumentId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var loaDocumentId: JsonField<String>? = null
            private var checkFrequency: JsonField<CheckFrequency> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                loaDocumentId = body.loaDocumentId
                checkFrequency = body.checkFrequency
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * ID of the signed Letter of Authorization (LOA) document uploaded to the document
             * service
             */
            fun loaDocumentId(loaDocumentId: String) = loaDocumentId(JsonField.of(loaDocumentId))

            /**
             * Sets [Builder.loaDocumentId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.loaDocumentId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun loaDocumentId(loaDocumentId: JsonField<String>) = apply {
                this.loaDocumentId = loaDocumentId
            }

            /** Frequency for automatically refreshing reputation data */
            fun checkFrequency(checkFrequency: CheckFrequency) =
                checkFrequency(JsonField.of(checkFrequency))

            /**
             * Sets [Builder.checkFrequency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.checkFrequency] with a well-typed [CheckFrequency]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun checkFrequency(checkFrequency: JsonField<CheckFrequency>) = apply {
                this.checkFrequency = checkFrequency
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
             * .loaDocumentId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("loaDocumentId", loaDocumentId),
                    checkFrequency,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            loaDocumentId()
            checkFrequency().ifPresent { it.validate() }
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
            (if (loaDocumentId.asKnown().isPresent) 1 else 0) +
                (checkFrequency.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                loaDocumentId == other.loaDocumentId &&
                checkFrequency == other.checkFrequency &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(loaDocumentId, checkFrequency, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{loaDocumentId=$loaDocumentId, checkFrequency=$checkFrequency, additionalProperties=$additionalProperties}"
    }

    /** Frequency for automatically refreshing reputation data */
    class CheckFrequency @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val BUSINESS_DAILY = of("business_daily")

            @JvmField val DAILY = of("daily")

            @JvmField val WEEKLY = of("weekly")

            @JvmField val BIWEEKLY = of("biweekly")

            @JvmField val MONTHLY = of("monthly")

            @JvmField val NEVER = of("never")

            @JvmStatic fun of(value: String) = CheckFrequency(JsonField.of(value))
        }

        /** An enum containing [CheckFrequency]'s known values. */
        enum class Known {
            BUSINESS_DAILY,
            DAILY,
            WEEKLY,
            BIWEEKLY,
            MONTHLY,
            NEVER,
        }

        /**
         * An enum containing [CheckFrequency]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [CheckFrequency] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BUSINESS_DAILY,
            DAILY,
            WEEKLY,
            BIWEEKLY,
            MONTHLY,
            NEVER,
            /**
             * An enum member indicating that [CheckFrequency] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                BUSINESS_DAILY -> Value.BUSINESS_DAILY
                DAILY -> Value.DAILY
                WEEKLY -> Value.WEEKLY
                BIWEEKLY -> Value.BIWEEKLY
                MONTHLY -> Value.MONTHLY
                NEVER -> Value.NEVER
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                BUSINESS_DAILY -> Known.BUSINESS_DAILY
                DAILY -> Known.DAILY
                WEEKLY -> Known.WEEKLY
                BIWEEKLY -> Known.BIWEEKLY
                MONTHLY -> Known.MONTHLY
                NEVER -> Known.NEVER
                else -> throw TelnyxInvalidDataException("Unknown CheckFrequency: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): CheckFrequency = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CheckFrequency && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ReputationEnableParams &&
            enterpriseId == other.enterpriseId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(enterpriseId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ReputationEnableParams{enterpriseId=$enterpriseId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
