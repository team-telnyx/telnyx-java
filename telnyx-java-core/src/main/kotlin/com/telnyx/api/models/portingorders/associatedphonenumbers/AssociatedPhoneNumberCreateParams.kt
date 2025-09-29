// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.portingorders.associatedphonenumbers

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.Enum
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.Params
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Creates a new associated phone number for a porting order. This is used for partial porting in GB
 * to specify which phone numbers should be kept or disconnected.
 */
class AssociatedPhoneNumberCreateParams
private constructor(
    private val portingOrderId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun portingOrderId(): Optional<String> = Optional.ofNullable(portingOrderId)

    /**
     * Specifies the action to take with this phone number during partial porting.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun action(): Action = body.action()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun phoneNumberRange(): PhoneNumberRange = body.phoneNumberRange()

    /**
     * Returns the raw JSON value of [action].
     *
     * Unlike [action], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _action(): JsonField<Action> = body._action()

    /**
     * Returns the raw JSON value of [phoneNumberRange].
     *
     * Unlike [phoneNumberRange], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _phoneNumberRange(): JsonField<PhoneNumberRange> = body._phoneNumberRange()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [AssociatedPhoneNumberCreateParams].
         *
         * The following fields are required:
         * ```java
         * .action()
         * .phoneNumberRange()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AssociatedPhoneNumberCreateParams]. */
    class Builder internal constructor() {

        private var portingOrderId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(associatedPhoneNumberCreateParams: AssociatedPhoneNumberCreateParams) =
            apply {
                portingOrderId = associatedPhoneNumberCreateParams.portingOrderId
                body = associatedPhoneNumberCreateParams.body.toBuilder()
                additionalHeaders = associatedPhoneNumberCreateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    associatedPhoneNumberCreateParams.additionalQueryParams.toBuilder()
            }

        fun portingOrderId(portingOrderId: String?) = apply { this.portingOrderId = portingOrderId }

        /** Alias for calling [Builder.portingOrderId] with `portingOrderId.orElse(null)`. */
        fun portingOrderId(portingOrderId: Optional<String>) =
            portingOrderId(portingOrderId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [action]
         * - [phoneNumberRange]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Specifies the action to take with this phone number during partial porting. */
        fun action(action: Action) = apply { body.action(action) }

        /**
         * Sets [Builder.action] to an arbitrary JSON value.
         *
         * You should usually call [Builder.action] with a well-typed [Action] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun action(action: JsonField<Action>) = apply { body.action(action) }

        fun phoneNumberRange(phoneNumberRange: PhoneNumberRange) = apply {
            body.phoneNumberRange(phoneNumberRange)
        }

        /**
         * Sets [Builder.phoneNumberRange] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumberRange] with a well-typed [PhoneNumberRange]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun phoneNumberRange(phoneNumberRange: JsonField<PhoneNumberRange>) = apply {
            body.phoneNumberRange(phoneNumberRange)
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
         * Returns an immutable instance of [AssociatedPhoneNumberCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .action()
         * .phoneNumberRange()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AssociatedPhoneNumberCreateParams =
            AssociatedPhoneNumberCreateParams(
                portingOrderId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> portingOrderId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val action: JsonField<Action>,
        private val phoneNumberRange: JsonField<PhoneNumberRange>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("action") @ExcludeMissing action: JsonField<Action> = JsonMissing.of(),
            @JsonProperty("phone_number_range")
            @ExcludeMissing
            phoneNumberRange: JsonField<PhoneNumberRange> = JsonMissing.of(),
        ) : this(action, phoneNumberRange, mutableMapOf())

        /**
         * Specifies the action to take with this phone number during partial porting.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun action(): Action = action.getRequired("action")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun phoneNumberRange(): PhoneNumberRange =
            phoneNumberRange.getRequired("phone_number_range")

        /**
         * Returns the raw JSON value of [action].
         *
         * Unlike [action], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("action") @ExcludeMissing fun _action(): JsonField<Action> = action

        /**
         * Returns the raw JSON value of [phoneNumberRange].
         *
         * Unlike [phoneNumberRange], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("phone_number_range")
        @ExcludeMissing
        fun _phoneNumberRange(): JsonField<PhoneNumberRange> = phoneNumberRange

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
             * .action()
             * .phoneNumberRange()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var action: JsonField<Action>? = null
            private var phoneNumberRange: JsonField<PhoneNumberRange>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                action = body.action
                phoneNumberRange = body.phoneNumberRange
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Specifies the action to take with this phone number during partial porting. */
            fun action(action: Action) = action(JsonField.of(action))

            /**
             * Sets [Builder.action] to an arbitrary JSON value.
             *
             * You should usually call [Builder.action] with a well-typed [Action] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun action(action: JsonField<Action>) = apply { this.action = action }

            fun phoneNumberRange(phoneNumberRange: PhoneNumberRange) =
                phoneNumberRange(JsonField.of(phoneNumberRange))

            /**
             * Sets [Builder.phoneNumberRange] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumberRange] with a well-typed
             * [PhoneNumberRange] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun phoneNumberRange(phoneNumberRange: JsonField<PhoneNumberRange>) = apply {
                this.phoneNumberRange = phoneNumberRange
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
             * .action()
             * .phoneNumberRange()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("action", action),
                    checkRequired("phoneNumberRange", phoneNumberRange),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            action().validate()
            phoneNumberRange().validate()
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
            (action.asKnown().getOrNull()?.validity() ?: 0) +
                (phoneNumberRange.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                action == other.action &&
                phoneNumberRange == other.phoneNumberRange &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(action, phoneNumberRange, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{action=$action, phoneNumberRange=$phoneNumberRange, additionalProperties=$additionalProperties}"
    }

    /** Specifies the action to take with this phone number during partial porting. */
    class Action @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val KEEP = of("keep")

            @JvmField val DISCONNECT = of("disconnect")

            @JvmStatic fun of(value: String) = Action(JsonField.of(value))
        }

        /** An enum containing [Action]'s known values. */
        enum class Known {
            KEEP,
            DISCONNECT,
        }

        /**
         * An enum containing [Action]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Action] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            KEEP,
            DISCONNECT,
            /** An enum member indicating that [Action] was instantiated with an unknown value. */
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
                KEEP -> Value.KEEP
                DISCONNECT -> Value.DISCONNECT
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
                KEEP -> Known.KEEP
                DISCONNECT -> Known.DISCONNECT
                else -> throw TelnyxInvalidDataException("Unknown Action: $value")
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

        fun validate(): Action = apply {
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

            return other is Action && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class PhoneNumberRange
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val endAt: JsonField<String>,
        private val startAt: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("end_at") @ExcludeMissing endAt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("start_at") @ExcludeMissing startAt: JsonField<String> = JsonMissing.of(),
        ) : this(endAt, startAt, mutableMapOf())

        /**
         * Specifies the end of the phone number range for this associated phone number.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endAt(): Optional<String> = endAt.getOptional("end_at")

        /**
         * Specifies the start of the phone number range for this associated phone number.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun startAt(): Optional<String> = startAt.getOptional("start_at")

        /**
         * Returns the raw JSON value of [endAt].
         *
         * Unlike [endAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_at") @ExcludeMissing fun _endAt(): JsonField<String> = endAt

        /**
         * Returns the raw JSON value of [startAt].
         *
         * Unlike [startAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_at") @ExcludeMissing fun _startAt(): JsonField<String> = startAt

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

            /** Returns a mutable builder for constructing an instance of [PhoneNumberRange]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PhoneNumberRange]. */
        class Builder internal constructor() {

            private var endAt: JsonField<String> = JsonMissing.of()
            private var startAt: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(phoneNumberRange: PhoneNumberRange) = apply {
                endAt = phoneNumberRange.endAt
                startAt = phoneNumberRange.startAt
                additionalProperties = phoneNumberRange.additionalProperties.toMutableMap()
            }

            /** Specifies the end of the phone number range for this associated phone number. */
            fun endAt(endAt: String) = endAt(JsonField.of(endAt))

            /**
             * Sets [Builder.endAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endAt] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endAt(endAt: JsonField<String>) = apply { this.endAt = endAt }

            /** Specifies the start of the phone number range for this associated phone number. */
            fun startAt(startAt: String) = startAt(JsonField.of(startAt))

            /**
             * Sets [Builder.startAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startAt] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startAt(startAt: JsonField<String>) = apply { this.startAt = startAt }

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
             * Returns an immutable instance of [PhoneNumberRange].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): PhoneNumberRange =
                PhoneNumberRange(endAt, startAt, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): PhoneNumberRange = apply {
            if (validated) {
                return@apply
            }

            endAt()
            startAt()
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
            (if (endAt.asKnown().isPresent) 1 else 0) + (if (startAt.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PhoneNumberRange &&
                endAt == other.endAt &&
                startAt == other.startAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(endAt, startAt, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PhoneNumberRange{endAt=$endAt, startAt=$startAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AssociatedPhoneNumberCreateParams &&
            portingOrderId == other.portingOrderId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(portingOrderId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AssociatedPhoneNumberCreateParams{portingOrderId=$portingOrderId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
