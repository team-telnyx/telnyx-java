// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.browsersessions.actions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Click an element identified by observation_id + ref. */
class ClickAction
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val observationId: JsonField<String>,
    private val ref: JsonField<String>,
    private val type: JsonValue,
    private val idempotencyKey: JsonField<String>,
    private val includeObservation: JsonField<Boolean>,
    private val timeoutMs: JsonField<Long>,
    private val wait: JsonField<Wait>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("observation_id")
        @ExcludeMissing
        observationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ref") @ExcludeMissing ref: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        @JsonProperty("idempotency_key")
        @ExcludeMissing
        idempotencyKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("include_observation")
        @ExcludeMissing
        includeObservation: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("timeout_ms") @ExcludeMissing timeoutMs: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("wait") @ExcludeMissing wait: JsonField<Wait> = JsonMissing.of(),
    ) : this(
        observationId,
        ref,
        type,
        idempotencyKey,
        includeObservation,
        timeoutMs,
        wait,
        mutableMapOf(),
    )

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun observationId(): String = observationId.getRequired("observation_id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ref(): String = ref.getRequired("ref")

    /**
     * Expected to always return the following:
     * ```java
     * JsonValue.from("click")
     * ```
     *
     * However, this method can be useful for debugging and logging (e.g. if the server responded
     * with an unexpected value).
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun idempotencyKey(): Optional<String> = idempotencyKey.getOptional("idempotency_key")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun includeObservation(): Optional<Boolean> =
        includeObservation.getOptional("include_observation")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timeoutMs(): Optional<Long> = timeoutMs.getOptional("timeout_ms")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun wait(): Optional<Wait> = wait.getOptional("wait")

    /**
     * Returns the raw JSON value of [observationId].
     *
     * Unlike [observationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("observation_id")
    @ExcludeMissing
    fun _observationId(): JsonField<String> = observationId

    /**
     * Returns the raw JSON value of [ref].
     *
     * Unlike [ref], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ref") @ExcludeMissing fun _ref(): JsonField<String> = ref

    /**
     * Returns the raw JSON value of [idempotencyKey].
     *
     * Unlike [idempotencyKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    fun _idempotencyKey(): JsonField<String> = idempotencyKey

    /**
     * Returns the raw JSON value of [includeObservation].
     *
     * Unlike [includeObservation], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("include_observation")
    @ExcludeMissing
    fun _includeObservation(): JsonField<Boolean> = includeObservation

    /**
     * Returns the raw JSON value of [timeoutMs].
     *
     * Unlike [timeoutMs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timeout_ms") @ExcludeMissing fun _timeoutMs(): JsonField<Long> = timeoutMs

    /**
     * Returns the raw JSON value of [wait].
     *
     * Unlike [wait], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("wait") @ExcludeMissing fun _wait(): JsonField<Wait> = wait

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
         * Returns a mutable builder for constructing an instance of [ClickAction].
         *
         * The following fields are required:
         * ```java
         * .observationId()
         * .ref()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ClickAction]. */
    class Builder internal constructor() {

        private var observationId: JsonField<String>? = null
        private var ref: JsonField<String>? = null
        private var type: JsonValue = JsonValue.from("click")
        private var idempotencyKey: JsonField<String> = JsonMissing.of()
        private var includeObservation: JsonField<Boolean> = JsonMissing.of()
        private var timeoutMs: JsonField<Long> = JsonMissing.of()
        private var wait: JsonField<Wait> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(clickAction: ClickAction) = apply {
            observationId = clickAction.observationId
            ref = clickAction.ref
            type = clickAction.type
            idempotencyKey = clickAction.idempotencyKey
            includeObservation = clickAction.includeObservation
            timeoutMs = clickAction.timeoutMs
            wait = clickAction.wait
            additionalProperties = clickAction.additionalProperties.toMutableMap()
        }

        fun observationId(observationId: String) = observationId(JsonField.of(observationId))

        /**
         * Sets [Builder.observationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.observationId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun observationId(observationId: JsonField<String>) = apply {
            this.observationId = observationId
        }

        fun ref(ref: String) = ref(JsonField.of(ref))

        /**
         * Sets [Builder.ref] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ref] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ref(ref: JsonField<String>) = apply { this.ref = ref }

        /**
         * Sets the field to an arbitrary JSON value.
         *
         * It is usually unnecessary to call this method because the field defaults to the
         * following:
         * ```java
         * JsonValue.from("click")
         * ```
         *
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun type(type: JsonValue) = apply { this.type = type }

        fun idempotencyKey(idempotencyKey: String) = idempotencyKey(JsonField.of(idempotencyKey))

        /**
         * Sets [Builder.idempotencyKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idempotencyKey] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
            this.idempotencyKey = idempotencyKey
        }

        fun includeObservation(includeObservation: Boolean) =
            includeObservation(JsonField.of(includeObservation))

        /**
         * Sets [Builder.includeObservation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.includeObservation] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun includeObservation(includeObservation: JsonField<Boolean>) = apply {
            this.includeObservation = includeObservation
        }

        fun timeoutMs(timeoutMs: Long) = timeoutMs(JsonField.of(timeoutMs))

        /**
         * Sets [Builder.timeoutMs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeoutMs] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun timeoutMs(timeoutMs: JsonField<Long>) = apply { this.timeoutMs = timeoutMs }

        fun wait(wait: Wait) = wait(JsonField.of(wait))

        /**
         * Sets [Builder.wait] to an arbitrary JSON value.
         *
         * You should usually call [Builder.wait] with a well-typed [Wait] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun wait(wait: JsonField<Wait>) = apply { this.wait = wait }

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
         * Returns an immutable instance of [ClickAction].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .observationId()
         * .ref()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ClickAction =
            ClickAction(
                checkRequired("observationId", observationId),
                checkRequired("ref", ref),
                type,
                idempotencyKey,
                includeObservation,
                timeoutMs,
                wait,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): ClickAction = apply {
        if (validated) {
            return@apply
        }

        observationId()
        ref()
        _type().let {
            if (it != JsonValue.from("click")) {
                throw TelnyxInvalidDataException("'type' is invalid, received $it")
            }
        }
        idempotencyKey()
        includeObservation()
        timeoutMs()
        wait().ifPresent { it.validate() }
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (observationId.asKnown().isPresent) 1 else 0) +
            (if (ref.asKnown().isPresent) 1 else 0) +
            type.let { if (it == JsonValue.from("click")) 1 else 0 } +
            (if (idempotencyKey.asKnown().isPresent) 1 else 0) +
            (if (includeObservation.asKnown().isPresent) 1 else 0) +
            (if (timeoutMs.asKnown().isPresent) 1 else 0) +
            (wait.asKnown().getOrNull()?.validity() ?: 0)

    class Wait @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val NO_WAIT = of("no_wait")

            @JvmField val DOM_STABLE = of("dom_stable")

            @JvmField val URL_CHANGE = of("url_change")

            @JvmStatic fun of(value: String) = Wait(JsonField.of(value))
        }

        /** An enum containing [Wait]'s known values. */
        enum class Known {
            NO_WAIT,
            DOM_STABLE,
            URL_CHANGE,
        }

        /**
         * An enum containing [Wait]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Wait] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NO_WAIT,
            DOM_STABLE,
            URL_CHANGE,
            /** An enum member indicating that [Wait] was instantiated with an unknown value. */
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
                NO_WAIT -> Value.NO_WAIT
                DOM_STABLE -> Value.DOM_STABLE
                URL_CHANGE -> Value.URL_CHANGE
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
                NO_WAIT -> Known.NO_WAIT
                DOM_STABLE -> Known.DOM_STABLE
                URL_CHANGE -> Known.URL_CHANGE
                else -> throw TelnyxInvalidDataException("Unknown Wait: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Wait = apply {
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

            return other is Wait && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ClickAction &&
            observationId == other.observationId &&
            ref == other.ref &&
            type == other.type &&
            idempotencyKey == other.idempotencyKey &&
            includeObservation == other.includeObservation &&
            timeoutMs == other.timeoutMs &&
            wait == other.wait &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            observationId,
            ref,
            type,
            idempotencyKey,
            includeObservation,
            timeoutMs,
            wait,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ClickAction{observationId=$observationId, ref=$ref, type=$type, idempotencyKey=$idempotencyKey, includeObservation=$includeObservation, timeoutMs=$timeoutMs, wait=$wait, additionalProperties=$additionalProperties}"
}
