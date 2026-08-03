// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emaildomains

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * DMARC policy for a sending domain. Drives the recommended _dmarc.<domain> TXT record. DMARC is
 * advisory and never blocks sending. When omitted or null, the domain uses the advisory default
 * (v=DMARC1; p=none; rua=mailto:dmarc@telnyx.com).
 */
class EmailDmarcPolicy
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val p: JsonField<P>,
    private val pct: JsonField<Long>,
    private val rua: JsonField<String>,
    private val sp: JsonField<Sp>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("p") @ExcludeMissing p: JsonField<P> = JsonMissing.of(),
        @JsonProperty("pct") @ExcludeMissing pct: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("rua") @ExcludeMissing rua: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sp") @ExcludeMissing sp: JsonField<Sp> = JsonMissing.of(),
    ) : this(p, pct, rua, sp, mutableMapOf())

    /**
     * Policy applied to messages that fail alignment.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun p(): Optional<P> = p.getOptional("p")

    /**
     * Percentage of messages the policy applies to. Omitted from the record when 100.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pct(): Optional<Long> = pct.getOptional("pct")

    /**
     * URI for aggregate reports. Defaults to the Telnyx address when absent; null omits it.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rua(): Optional<String> = rua.getOptional("rua")

    /**
     * Policy for subdomains. Omitted from the record when null.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sp(): Optional<Sp> = sp.getOptional("sp")

    /**
     * Returns the raw JSON value of [p].
     *
     * Unlike [p], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("p") @ExcludeMissing fun _p(): JsonField<P> = p

    /**
     * Returns the raw JSON value of [pct].
     *
     * Unlike [pct], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pct") @ExcludeMissing fun _pct(): JsonField<Long> = pct

    /**
     * Returns the raw JSON value of [rua].
     *
     * Unlike [rua], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rua") @ExcludeMissing fun _rua(): JsonField<String> = rua

    /**
     * Returns the raw JSON value of [sp].
     *
     * Unlike [sp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sp") @ExcludeMissing fun _sp(): JsonField<Sp> = sp

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

        /** Returns a mutable builder for constructing an instance of [EmailDmarcPolicy]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EmailDmarcPolicy]. */
    class Builder internal constructor() {

        private var p: JsonField<P> = JsonMissing.of()
        private var pct: JsonField<Long> = JsonMissing.of()
        private var rua: JsonField<String> = JsonMissing.of()
        private var sp: JsonField<Sp> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(emailDmarcPolicy: EmailDmarcPolicy) = apply {
            p = emailDmarcPolicy.p
            pct = emailDmarcPolicy.pct
            rua = emailDmarcPolicy.rua
            sp = emailDmarcPolicy.sp
            additionalProperties = emailDmarcPolicy.additionalProperties.toMutableMap()
        }

        /** Policy applied to messages that fail alignment. */
        fun p(p: P) = p(JsonField.of(p))

        /**
         * Sets [Builder.p] to an arbitrary JSON value.
         *
         * You should usually call [Builder.p] with a well-typed [P] value instead. This method is
         * primarily for setting the field to an undocumented or not yet supported value.
         */
        fun p(p: JsonField<P>) = apply { this.p = p }

        /** Percentage of messages the policy applies to. Omitted from the record when 100. */
        fun pct(pct: Long) = pct(JsonField.of(pct))

        /**
         * Sets [Builder.pct] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pct] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pct(pct: JsonField<Long>) = apply { this.pct = pct }

        /** URI for aggregate reports. Defaults to the Telnyx address when absent; null omits it. */
        fun rua(rua: String?) = rua(JsonField.ofNullable(rua))

        /** Alias for calling [Builder.rua] with `rua.orElse(null)`. */
        fun rua(rua: Optional<String>) = rua(rua.getOrNull())

        /**
         * Sets [Builder.rua] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rua] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rua(rua: JsonField<String>) = apply { this.rua = rua }

        /** Policy for subdomains. Omitted from the record when null. */
        fun sp(sp: Sp?) = sp(JsonField.ofNullable(sp))

        /** Alias for calling [Builder.sp] with `sp.orElse(null)`. */
        fun sp(sp: Optional<Sp>) = sp(sp.getOrNull())

        /**
         * Sets [Builder.sp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sp] with a well-typed [Sp] value instead. This method is
         * primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sp(sp: JsonField<Sp>) = apply { this.sp = sp }

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
         * Returns an immutable instance of [EmailDmarcPolicy].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): EmailDmarcPolicy =
            EmailDmarcPolicy(p, pct, rua, sp, additionalProperties.toMutableMap())
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
    fun validate(): EmailDmarcPolicy = apply {
        if (validated) {
            return@apply
        }

        p().ifPresent { it.validate() }
        pct()
        rua()
        sp().ifPresent { it.validate() }
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
        (p.asKnown().getOrNull()?.validity() ?: 0) +
            (if (pct.asKnown().isPresent) 1 else 0) +
            (if (rua.asKnown().isPresent) 1 else 0) +
            (sp.asKnown().getOrNull()?.validity() ?: 0)

    /** Policy applied to messages that fail alignment. */
    class P @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val NONE = of("none")

            @JvmField val QUARANTINE = of("quarantine")

            @JvmField val REJECT = of("reject")

            @JvmStatic fun of(value: String) = P(JsonField.of(value))
        }

        /** An enum containing [P]'s known values. */
        enum class Known {
            NONE,
            QUARANTINE,
            REJECT,
        }

        /**
         * An enum containing [P]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [P] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NONE,
            QUARANTINE,
            REJECT,
            /** An enum member indicating that [P] was instantiated with an unknown value. */
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
                NONE -> Value.NONE
                QUARANTINE -> Value.QUARANTINE
                REJECT -> Value.REJECT
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
                NONE -> Known.NONE
                QUARANTINE -> Known.QUARANTINE
                REJECT -> Known.REJECT
                else -> throw TelnyxInvalidDataException("Unknown P: $value")
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
        fun validate(): P = apply {
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

            return other is P && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Policy for subdomains. Omitted from the record when null. */
    class Sp @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val NONE = of("none")

            @JvmField val QUARANTINE = of("quarantine")

            @JvmField val REJECT = of("reject")

            @JvmStatic fun of(value: String) = Sp(JsonField.of(value))
        }

        /** An enum containing [Sp]'s known values. */
        enum class Known {
            NONE,
            QUARANTINE,
            REJECT,
        }

        /**
         * An enum containing [Sp]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Sp] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NONE,
            QUARANTINE,
            REJECT,
            /** An enum member indicating that [Sp] was instantiated with an unknown value. */
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
                NONE -> Value.NONE
                QUARANTINE -> Value.QUARANTINE
                REJECT -> Value.REJECT
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
                NONE -> Known.NONE
                QUARANTINE -> Known.QUARANTINE
                REJECT -> Known.REJECT
                else -> throw TelnyxInvalidDataException("Unknown Sp: $value")
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
        fun validate(): Sp = apply {
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

            return other is Sp && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailDmarcPolicy &&
            p == other.p &&
            pct == other.pct &&
            rua == other.rua &&
            sp == other.sp &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(p, pct, rua, sp, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EmailDmarcPolicy{p=$p, pct=$pct, rua=$rua, sp=$sp, additionalProperties=$additionalProperties}"
}
