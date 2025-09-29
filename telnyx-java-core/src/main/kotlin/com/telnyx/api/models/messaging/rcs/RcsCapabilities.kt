// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.messaging.rcs

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.Enum
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.checkKnown
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class RcsCapabilities
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val agentId: JsonField<String>,
    private val agentName: JsonField<String>,
    private val features: JsonField<List<String>>,
    private val phoneNumber: JsonField<String>,
    private val recordType: JsonField<RecordType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("agent_id") @ExcludeMissing agentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("agent_name") @ExcludeMissing agentName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("features")
        @ExcludeMissing
        features: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("phone_number")
        @ExcludeMissing
        phoneNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<RecordType> = JsonMissing.of(),
    ) : this(agentId, agentName, features, phoneNumber, recordType, mutableMapOf())

    /**
     * RCS agent ID
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun agentId(): Optional<String> = agentId.getOptional("agent_id")

    /**
     * RCS agent name
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun agentName(): Optional<String> = agentName.getOptional("agent_name")

    /**
     * List of RCS capabilities
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun features(): Optional<List<String>> = features.getOptional("features")

    /**
     * Phone number
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

    /**
     * Identifies the type of the resource
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<RecordType> = recordType.getOptional("record_type")

    /**
     * Returns the raw JSON value of [agentId].
     *
     * Unlike [agentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("agent_id") @ExcludeMissing fun _agentId(): JsonField<String> = agentId

    /**
     * Returns the raw JSON value of [agentName].
     *
     * Unlike [agentName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("agent_name") @ExcludeMissing fun _agentName(): JsonField<String> = agentName

    /**
     * Returns the raw JSON value of [features].
     *
     * Unlike [features], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("features") @ExcludeMissing fun _features(): JsonField<List<String>> = features

    /**
     * Returns the raw JSON value of [phoneNumber].
     *
     * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phone_number")
    @ExcludeMissing
    fun _phoneNumber(): JsonField<String> = phoneNumber

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type")
    @ExcludeMissing
    fun _recordType(): JsonField<RecordType> = recordType

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

        /** Returns a mutable builder for constructing an instance of [RcsCapabilities]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RcsCapabilities]. */
    class Builder internal constructor() {

        private var agentId: JsonField<String> = JsonMissing.of()
        private var agentName: JsonField<String> = JsonMissing.of()
        private var features: JsonField<MutableList<String>>? = null
        private var phoneNumber: JsonField<String> = JsonMissing.of()
        private var recordType: JsonField<RecordType> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(rcsCapabilities: RcsCapabilities) = apply {
            agentId = rcsCapabilities.agentId
            agentName = rcsCapabilities.agentName
            features = rcsCapabilities.features.map { it.toMutableList() }
            phoneNumber = rcsCapabilities.phoneNumber
            recordType = rcsCapabilities.recordType
            additionalProperties = rcsCapabilities.additionalProperties.toMutableMap()
        }

        /** RCS agent ID */
        fun agentId(agentId: String) = agentId(JsonField.of(agentId))

        /**
         * Sets [Builder.agentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agentId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun agentId(agentId: JsonField<String>) = apply { this.agentId = agentId }

        /** RCS agent name */
        fun agentName(agentName: String) = agentName(JsonField.of(agentName))

        /**
         * Sets [Builder.agentName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agentName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun agentName(agentName: JsonField<String>) = apply { this.agentName = agentName }

        /** List of RCS capabilities */
        fun features(features: List<String>) = features(JsonField.of(features))

        /**
         * Sets [Builder.features] to an arbitrary JSON value.
         *
         * You should usually call [Builder.features] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun features(features: JsonField<List<String>>) = apply {
            this.features = features.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [features].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFeature(feature: String) = apply {
            features =
                (features ?: JsonField.of(mutableListOf())).also {
                    checkKnown("features", it).add(feature)
                }
        }

        /** Phone number */
        fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

        /**
         * Sets [Builder.phoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun phoneNumber(phoneNumber: JsonField<String>) = apply { this.phoneNumber = phoneNumber }

        /** Identifies the type of the resource */
        fun recordType(recordType: RecordType) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [RecordType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recordType(recordType: JsonField<RecordType>) = apply { this.recordType = recordType }

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
         * Returns an immutable instance of [RcsCapabilities].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RcsCapabilities =
            RcsCapabilities(
                agentId,
                agentName,
                (features ?: JsonMissing.of()).map { it.toImmutable() },
                phoneNumber,
                recordType,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RcsCapabilities = apply {
        if (validated) {
            return@apply
        }

        agentId()
        agentName()
        features()
        phoneNumber()
        recordType().ifPresent { it.validate() }
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
        (if (agentId.asKnown().isPresent) 1 else 0) +
            (if (agentName.asKnown().isPresent) 1 else 0) +
            (features.asKnown().getOrNull()?.size ?: 0) +
            (if (phoneNumber.asKnown().isPresent) 1 else 0) +
            (recordType.asKnown().getOrNull()?.validity() ?: 0)

    /** Identifies the type of the resource */
    class RecordType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val RCS_CAPABILITIES = of("rcs.capabilities")

            @JvmStatic fun of(value: String) = RecordType(JsonField.of(value))
        }

        /** An enum containing [RecordType]'s known values. */
        enum class Known {
            RCS_CAPABILITIES
        }

        /**
         * An enum containing [RecordType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RecordType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            RCS_CAPABILITIES,
            /**
             * An enum member indicating that [RecordType] was instantiated with an unknown value.
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
                RCS_CAPABILITIES -> Value.RCS_CAPABILITIES
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
                RCS_CAPABILITIES -> Known.RCS_CAPABILITIES
                else -> throw TelnyxInvalidDataException("Unknown RecordType: $value")
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

        fun validate(): RecordType = apply {
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

            return other is RecordType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RcsCapabilities &&
            agentId == other.agentId &&
            agentName == other.agentName &&
            features == other.features &&
            phoneNumber == other.phoneNumber &&
            recordType == other.recordType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(agentId, agentName, features, phoneNumber, recordType, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RcsCapabilities{agentId=$agentId, agentName=$agentName, features=$features, phoneNumber=$phoneNumber, recordType=$recordType, additionalProperties=$additionalProperties}"
}
