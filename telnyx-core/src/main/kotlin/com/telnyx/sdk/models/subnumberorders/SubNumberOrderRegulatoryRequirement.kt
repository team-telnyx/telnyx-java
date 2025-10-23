// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.subnumberorders

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

class SubNumberOrderRegulatoryRequirement
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val fieldType: JsonField<FieldType>,
    private val recordType: JsonField<String>,
    private val requirementId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("field_type")
        @ExcludeMissing
        fieldType: JsonField<FieldType> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("requirement_id")
        @ExcludeMissing
        requirementId: JsonField<String> = JsonMissing.of(),
    ) : this(fieldType, recordType, requirementId, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fieldType(): Optional<FieldType> = fieldType.getOptional("field_type")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<String> = recordType.getOptional("record_type")

    /**
     * Unique id for a requirement.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun requirementId(): Optional<String> = requirementId.getOptional("requirement_id")

    /**
     * Returns the raw JSON value of [fieldType].
     *
     * Unlike [fieldType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("field_type") @ExcludeMissing fun _fieldType(): JsonField<FieldType> = fieldType

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type") @ExcludeMissing fun _recordType(): JsonField<String> = recordType

    /**
     * Returns the raw JSON value of [requirementId].
     *
     * Unlike [requirementId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("requirement_id")
    @ExcludeMissing
    fun _requirementId(): JsonField<String> = requirementId

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
         * Returns a mutable builder for constructing an instance of
         * [SubNumberOrderRegulatoryRequirement].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SubNumberOrderRegulatoryRequirement]. */
    class Builder internal constructor() {

        private var fieldType: JsonField<FieldType> = JsonMissing.of()
        private var recordType: JsonField<String> = JsonMissing.of()
        private var requirementId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            subNumberOrderRegulatoryRequirement: SubNumberOrderRegulatoryRequirement
        ) = apply {
            fieldType = subNumberOrderRegulatoryRequirement.fieldType
            recordType = subNumberOrderRegulatoryRequirement.recordType
            requirementId = subNumberOrderRegulatoryRequirement.requirementId
            additionalProperties =
                subNumberOrderRegulatoryRequirement.additionalProperties.toMutableMap()
        }

        fun fieldType(fieldType: FieldType) = fieldType(JsonField.of(fieldType))

        /**
         * Sets [Builder.fieldType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fieldType] with a well-typed [FieldType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fieldType(fieldType: JsonField<FieldType>) = apply { this.fieldType = fieldType }

        fun recordType(recordType: String) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

        /** Unique id for a requirement. */
        fun requirementId(requirementId: String) = requirementId(JsonField.of(requirementId))

        /**
         * Sets [Builder.requirementId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requirementId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun requirementId(requirementId: JsonField<String>) = apply {
            this.requirementId = requirementId
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
         * Returns an immutable instance of [SubNumberOrderRegulatoryRequirement].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SubNumberOrderRegulatoryRequirement =
            SubNumberOrderRegulatoryRequirement(
                fieldType,
                recordType,
                requirementId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SubNumberOrderRegulatoryRequirement = apply {
        if (validated) {
            return@apply
        }

        fieldType().ifPresent { it.validate() }
        recordType()
        requirementId()
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
        (fieldType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (recordType.asKnown().isPresent) 1 else 0) +
            (if (requirementId.asKnown().isPresent) 1 else 0)

    class FieldType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val TEXTUAL = of("textual")

            @JvmField val DATETIME = of("datetime")

            @JvmField val ADDRESS = of("address")

            @JvmField val DOCUMENT = of("document")

            @JvmStatic fun of(value: String) = FieldType(JsonField.of(value))
        }

        /** An enum containing [FieldType]'s known values. */
        enum class Known {
            TEXTUAL,
            DATETIME,
            ADDRESS,
            DOCUMENT,
        }

        /**
         * An enum containing [FieldType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [FieldType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TEXTUAL,
            DATETIME,
            ADDRESS,
            DOCUMENT,
            /**
             * An enum member indicating that [FieldType] was instantiated with an unknown value.
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
                TEXTUAL -> Value.TEXTUAL
                DATETIME -> Value.DATETIME
                ADDRESS -> Value.ADDRESS
                DOCUMENT -> Value.DOCUMENT
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
                TEXTUAL -> Known.TEXTUAL
                DATETIME -> Known.DATETIME
                ADDRESS -> Known.ADDRESS
                DOCUMENT -> Known.DOCUMENT
                else -> throw TelnyxInvalidDataException("Unknown FieldType: $value")
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

        fun validate(): FieldType = apply {
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

            return other is FieldType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubNumberOrderRegulatoryRequirement &&
            fieldType == other.fieldType &&
            recordType == other.recordType &&
            requirementId == other.requirementId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(fieldType, recordType, requirementId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SubNumberOrderRegulatoryRequirement{fieldType=$fieldType, recordType=$recordType, requirementId=$requirementId, additionalProperties=$additionalProperties}"
}
