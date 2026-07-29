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
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class EmailDomainVerification
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val dkim: JsonField<Dkim>,
    private val dmarc: JsonField<Dmarc>,
    private val mx: JsonField<Mx>,
    private val ownership: JsonField<Ownership>,
    private val spf: JsonField<Spf>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("dkim") @ExcludeMissing dkim: JsonField<Dkim> = JsonMissing.of(),
        @JsonProperty("dmarc") @ExcludeMissing dmarc: JsonField<Dmarc> = JsonMissing.of(),
        @JsonProperty("mx") @ExcludeMissing mx: JsonField<Mx> = JsonMissing.of(),
        @JsonProperty("ownership")
        @ExcludeMissing
        ownership: JsonField<Ownership> = JsonMissing.of(),
        @JsonProperty("spf") @ExcludeMissing spf: JsonField<Spf> = JsonMissing.of(),
    ) : this(dkim, dmarc, mx, ownership, spf, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dkim(): Dkim = dkim.getRequired("dkim")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dmarc(): Dmarc = dmarc.getRequired("dmarc")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun mx(): Mx = mx.getRequired("mx")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ownership(): Ownership = ownership.getRequired("ownership")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun spf(): Spf = spf.getRequired("spf")

    /**
     * Returns the raw JSON value of [dkim].
     *
     * Unlike [dkim], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dkim") @ExcludeMissing fun _dkim(): JsonField<Dkim> = dkim

    /**
     * Returns the raw JSON value of [dmarc].
     *
     * Unlike [dmarc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dmarc") @ExcludeMissing fun _dmarc(): JsonField<Dmarc> = dmarc

    /**
     * Returns the raw JSON value of [mx].
     *
     * Unlike [mx], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mx") @ExcludeMissing fun _mx(): JsonField<Mx> = mx

    /**
     * Returns the raw JSON value of [ownership].
     *
     * Unlike [ownership], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ownership") @ExcludeMissing fun _ownership(): JsonField<Ownership> = ownership

    /**
     * Returns the raw JSON value of [spf].
     *
     * Unlike [spf], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("spf") @ExcludeMissing fun _spf(): JsonField<Spf> = spf

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
         * Returns a mutable builder for constructing an instance of [EmailDomainVerification].
         *
         * The following fields are required:
         * ```java
         * .dkim()
         * .dmarc()
         * .mx()
         * .ownership()
         * .spf()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EmailDomainVerification]. */
    class Builder internal constructor() {

        private var dkim: JsonField<Dkim>? = null
        private var dmarc: JsonField<Dmarc>? = null
        private var mx: JsonField<Mx>? = null
        private var ownership: JsonField<Ownership>? = null
        private var spf: JsonField<Spf>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(emailDomainVerification: EmailDomainVerification) = apply {
            dkim = emailDomainVerification.dkim
            dmarc = emailDomainVerification.dmarc
            mx = emailDomainVerification.mx
            ownership = emailDomainVerification.ownership
            spf = emailDomainVerification.spf
            additionalProperties = emailDomainVerification.additionalProperties.toMutableMap()
        }

        fun dkim(dkim: Dkim) = dkim(JsonField.of(dkim))

        /**
         * Sets [Builder.dkim] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dkim] with a well-typed [Dkim] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dkim(dkim: JsonField<Dkim>) = apply { this.dkim = dkim }

        fun dmarc(dmarc: Dmarc) = dmarc(JsonField.of(dmarc))

        /**
         * Sets [Builder.dmarc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dmarc] with a well-typed [Dmarc] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dmarc(dmarc: JsonField<Dmarc>) = apply { this.dmarc = dmarc }

        fun mx(mx: Mx) = mx(JsonField.of(mx))

        /**
         * Sets [Builder.mx] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mx] with a well-typed [Mx] value instead. This method is
         * primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mx(mx: JsonField<Mx>) = apply { this.mx = mx }

        fun ownership(ownership: Ownership) = ownership(JsonField.of(ownership))

        /**
         * Sets [Builder.ownership] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ownership] with a well-typed [Ownership] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ownership(ownership: JsonField<Ownership>) = apply { this.ownership = ownership }

        fun spf(spf: Spf) = spf(JsonField.of(spf))

        /**
         * Sets [Builder.spf] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spf] with a well-typed [Spf] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun spf(spf: JsonField<Spf>) = apply { this.spf = spf }

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
         * Returns an immutable instance of [EmailDomainVerification].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .dkim()
         * .dmarc()
         * .mx()
         * .ownership()
         * .spf()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EmailDomainVerification =
            EmailDomainVerification(
                checkRequired("dkim", dkim),
                checkRequired("dmarc", dmarc),
                checkRequired("mx", mx),
                checkRequired("ownership", ownership),
                checkRequired("spf", spf),
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
    fun validate(): EmailDomainVerification = apply {
        if (validated) {
            return@apply
        }

        dkim().validate()
        dmarc().validate()
        mx().validate()
        ownership().validate()
        spf().validate()
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
        (dkim.asKnown().getOrNull()?.validity() ?: 0) +
            (dmarc.asKnown().getOrNull()?.validity() ?: 0) +
            (mx.asKnown().getOrNull()?.validity() ?: 0) +
            (ownership.asKnown().getOrNull()?.validity() ?: 0) +
            (spf.asKnown().getOrNull()?.validity() ?: 0)

    class Dkim @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PENDING = of("pending")

            @JvmField val VERIFIED = of("verified")

            @JvmField val FAILED = of("failed")

            @JvmStatic fun of(value: String) = Dkim(JsonField.of(value))
        }

        /** An enum containing [Dkim]'s known values. */
        enum class Known {
            PENDING,
            VERIFIED,
            FAILED,
        }

        /**
         * An enum containing [Dkim]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Dkim] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PENDING,
            VERIFIED,
            FAILED,
            /** An enum member indicating that [Dkim] was instantiated with an unknown value. */
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
                PENDING -> Value.PENDING
                VERIFIED -> Value.VERIFIED
                FAILED -> Value.FAILED
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
                PENDING -> Known.PENDING
                VERIFIED -> Known.VERIFIED
                FAILED -> Known.FAILED
                else -> throw TelnyxInvalidDataException("Unknown Dkim: $value")
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
        fun validate(): Dkim = apply {
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

            return other is Dkim && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Dmarc @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val MISSING_OPTIONAL = of("missing_optional")

            @JvmField val VERIFIED = of("verified")

            @JvmField val FAILED = of("failed")

            @JvmStatic fun of(value: String) = Dmarc(JsonField.of(value))
        }

        /** An enum containing [Dmarc]'s known values. */
        enum class Known {
            MISSING_OPTIONAL,
            VERIFIED,
            FAILED,
        }

        /**
         * An enum containing [Dmarc]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Dmarc] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MISSING_OPTIONAL,
            VERIFIED,
            FAILED,
            /** An enum member indicating that [Dmarc] was instantiated with an unknown value. */
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
                MISSING_OPTIONAL -> Value.MISSING_OPTIONAL
                VERIFIED -> Value.VERIFIED
                FAILED -> Value.FAILED
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
                MISSING_OPTIONAL -> Known.MISSING_OPTIONAL
                VERIFIED -> Known.VERIFIED
                FAILED -> Known.FAILED
                else -> throw TelnyxInvalidDataException("Unknown Dmarc: $value")
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
        fun validate(): Dmarc = apply {
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

            return other is Dmarc && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Mx @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val NOT_REQUIRED = of("not_required")

            @JvmField val PENDING = of("pending")

            @JvmField val VERIFIED = of("verified")

            @JvmField val FAILED = of("failed")

            @JvmStatic fun of(value: String) = Mx(JsonField.of(value))
        }

        /** An enum containing [Mx]'s known values. */
        enum class Known {
            NOT_REQUIRED,
            PENDING,
            VERIFIED,
            FAILED,
        }

        /**
         * An enum containing [Mx]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Mx] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NOT_REQUIRED,
            PENDING,
            VERIFIED,
            FAILED,
            /** An enum member indicating that [Mx] was instantiated with an unknown value. */
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
                NOT_REQUIRED -> Value.NOT_REQUIRED
                PENDING -> Value.PENDING
                VERIFIED -> Value.VERIFIED
                FAILED -> Value.FAILED
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
                NOT_REQUIRED -> Known.NOT_REQUIRED
                PENDING -> Known.PENDING
                VERIFIED -> Known.VERIFIED
                FAILED -> Known.FAILED
                else -> throw TelnyxInvalidDataException("Unknown Mx: $value")
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
        fun validate(): Mx = apply {
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

            return other is Mx && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Ownership @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PENDING = of("pending")

            @JvmField val VERIFIED = of("verified")

            @JvmField val NOT_REQUIRED = of("not_required")

            @JvmStatic fun of(value: String) = Ownership(JsonField.of(value))
        }

        /** An enum containing [Ownership]'s known values. */
        enum class Known {
            PENDING,
            VERIFIED,
            NOT_REQUIRED,
        }

        /**
         * An enum containing [Ownership]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Ownership] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PENDING,
            VERIFIED,
            NOT_REQUIRED,
            /**
             * An enum member indicating that [Ownership] was instantiated with an unknown value.
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
                PENDING -> Value.PENDING
                VERIFIED -> Value.VERIFIED
                NOT_REQUIRED -> Value.NOT_REQUIRED
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
                PENDING -> Known.PENDING
                VERIFIED -> Known.VERIFIED
                NOT_REQUIRED -> Known.NOT_REQUIRED
                else -> throw TelnyxInvalidDataException("Unknown Ownership: $value")
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
        fun validate(): Ownership = apply {
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

            return other is Ownership && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Spf @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val MISSING_OPTIONAL = of("missing_optional")

            @JvmField val VERIFIED = of("verified")

            @JvmField val FAILED = of("failed")

            @JvmField val NOT_REQUIRED = of("not_required")

            @JvmStatic fun of(value: String) = Spf(JsonField.of(value))
        }

        /** An enum containing [Spf]'s known values. */
        enum class Known {
            MISSING_OPTIONAL,
            VERIFIED,
            FAILED,
            NOT_REQUIRED,
        }

        /**
         * An enum containing [Spf]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Spf] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MISSING_OPTIONAL,
            VERIFIED,
            FAILED,
            NOT_REQUIRED,
            /** An enum member indicating that [Spf] was instantiated with an unknown value. */
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
                MISSING_OPTIONAL -> Value.MISSING_OPTIONAL
                VERIFIED -> Value.VERIFIED
                FAILED -> Value.FAILED
                NOT_REQUIRED -> Value.NOT_REQUIRED
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
                MISSING_OPTIONAL -> Known.MISSING_OPTIONAL
                VERIFIED -> Known.VERIFIED
                FAILED -> Known.FAILED
                NOT_REQUIRED -> Known.NOT_REQUIRED
                else -> throw TelnyxInvalidDataException("Unknown Spf: $value")
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
        fun validate(): Spf = apply {
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

            return other is Spf && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailDomainVerification &&
            dkim == other.dkim &&
            dmarc == other.dmarc &&
            mx == other.mx &&
            ownership == other.ownership &&
            spf == other.spf &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(dkim, dmarc, mx, ownership, spf, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EmailDomainVerification{dkim=$dkim, dmarc=$dmarc, mx=$mx, ownership=$ownership, spf=$spf, additionalProperties=$additionalProperties}"
}
