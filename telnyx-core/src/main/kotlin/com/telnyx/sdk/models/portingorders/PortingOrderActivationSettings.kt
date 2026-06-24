// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import com.telnyx.sdk.models.portingphonenumbers.PortingOrderActivationStatus
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PortingOrderActivationSettings
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val activationStatus: JsonField<PortingOrderActivationStatus>,
    private val fastPortEligible: JsonField<Boolean>,
    private val focDatetimeActual: JsonField<OffsetDateTime>,
    private val focDatetimeRequested: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("activation_status")
        @ExcludeMissing
        activationStatus: JsonField<PortingOrderActivationStatus> = JsonMissing.of(),
        @JsonProperty("fast_port_eligible")
        @ExcludeMissing
        fastPortEligible: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("foc_datetime_actual")
        @ExcludeMissing
        focDatetimeActual: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("foc_datetime_requested")
        @ExcludeMissing
        focDatetimeRequested: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        activationStatus,
        fastPortEligible,
        focDatetimeActual,
        focDatetimeRequested,
        mutableMapOf(),
    )

    /**
     * Activation status
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun activationStatus(): Optional<PortingOrderActivationStatus> =
        activationStatus.getOptional("activation_status")

    /**
     * Indicates whether this porting order is eligible for FastPort
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fastPortEligible(): Optional<Boolean> = fastPortEligible.getOptional("fast_port_eligible")

    /**
     * ISO 8601 formatted Date/Time of the FOC date
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun focDatetimeActual(): Optional<OffsetDateTime> =
        focDatetimeActual.getOptional("foc_datetime_actual")

    /**
     * ISO 8601 formatted Date/Time requested for the FOC date
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun focDatetimeRequested(): Optional<OffsetDateTime> =
        focDatetimeRequested.getOptional("foc_datetime_requested")

    /**
     * Returns the raw JSON value of [activationStatus].
     *
     * Unlike [activationStatus], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("activation_status")
    @ExcludeMissing
    fun _activationStatus(): JsonField<PortingOrderActivationStatus> = activationStatus

    /**
     * Returns the raw JSON value of [fastPortEligible].
     *
     * Unlike [fastPortEligible], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("fast_port_eligible")
    @ExcludeMissing
    fun _fastPortEligible(): JsonField<Boolean> = fastPortEligible

    /**
     * Returns the raw JSON value of [focDatetimeActual].
     *
     * Unlike [focDatetimeActual], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("foc_datetime_actual")
    @ExcludeMissing
    fun _focDatetimeActual(): JsonField<OffsetDateTime> = focDatetimeActual

    /**
     * Returns the raw JSON value of [focDatetimeRequested].
     *
     * Unlike [focDatetimeRequested], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("foc_datetime_requested")
    @ExcludeMissing
    fun _focDatetimeRequested(): JsonField<OffsetDateTime> = focDatetimeRequested

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
         * [PortingOrderActivationSettings].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PortingOrderActivationSettings]. */
    class Builder internal constructor() {

        private var activationStatus: JsonField<PortingOrderActivationStatus> = JsonMissing.of()
        private var fastPortEligible: JsonField<Boolean> = JsonMissing.of()
        private var focDatetimeActual: JsonField<OffsetDateTime> = JsonMissing.of()
        private var focDatetimeRequested: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(portingOrderActivationSettings: PortingOrderActivationSettings) = apply {
            activationStatus = portingOrderActivationSettings.activationStatus
            fastPortEligible = portingOrderActivationSettings.fastPortEligible
            focDatetimeActual = portingOrderActivationSettings.focDatetimeActual
            focDatetimeRequested = portingOrderActivationSettings.focDatetimeRequested
            additionalProperties =
                portingOrderActivationSettings.additionalProperties.toMutableMap()
        }

        /** Activation status */
        fun activationStatus(activationStatus: PortingOrderActivationStatus?) =
            activationStatus(JsonField.ofNullable(activationStatus))

        /** Alias for calling [Builder.activationStatus] with `activationStatus.orElse(null)`. */
        fun activationStatus(activationStatus: Optional<PortingOrderActivationStatus>) =
            activationStatus(activationStatus.getOrNull())

        /**
         * Sets [Builder.activationStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.activationStatus] with a well-typed
         * [PortingOrderActivationStatus] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun activationStatus(activationStatus: JsonField<PortingOrderActivationStatus>) = apply {
            this.activationStatus = activationStatus
        }

        /** Indicates whether this porting order is eligible for FastPort */
        fun fastPortEligible(fastPortEligible: Boolean) =
            fastPortEligible(JsonField.of(fastPortEligible))

        /**
         * Sets [Builder.fastPortEligible] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fastPortEligible] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fastPortEligible(fastPortEligible: JsonField<Boolean>) = apply {
            this.fastPortEligible = fastPortEligible
        }

        /** ISO 8601 formatted Date/Time of the FOC date */
        fun focDatetimeActual(focDatetimeActual: OffsetDateTime?) =
            focDatetimeActual(JsonField.ofNullable(focDatetimeActual))

        /** Alias for calling [Builder.focDatetimeActual] with `focDatetimeActual.orElse(null)`. */
        fun focDatetimeActual(focDatetimeActual: Optional<OffsetDateTime>) =
            focDatetimeActual(focDatetimeActual.getOrNull())

        /**
         * Sets [Builder.focDatetimeActual] to an arbitrary JSON value.
         *
         * You should usually call [Builder.focDatetimeActual] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun focDatetimeActual(focDatetimeActual: JsonField<OffsetDateTime>) = apply {
            this.focDatetimeActual = focDatetimeActual
        }

        /** ISO 8601 formatted Date/Time requested for the FOC date */
        fun focDatetimeRequested(focDatetimeRequested: OffsetDateTime?) =
            focDatetimeRequested(JsonField.ofNullable(focDatetimeRequested))

        /**
         * Alias for calling [Builder.focDatetimeRequested] with
         * `focDatetimeRequested.orElse(null)`.
         */
        fun focDatetimeRequested(focDatetimeRequested: Optional<OffsetDateTime>) =
            focDatetimeRequested(focDatetimeRequested.getOrNull())

        /**
         * Sets [Builder.focDatetimeRequested] to an arbitrary JSON value.
         *
         * You should usually call [Builder.focDatetimeRequested] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun focDatetimeRequested(focDatetimeRequested: JsonField<OffsetDateTime>) = apply {
            this.focDatetimeRequested = focDatetimeRequested
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
         * Returns an immutable instance of [PortingOrderActivationSettings].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PortingOrderActivationSettings =
            PortingOrderActivationSettings(
                activationStatus,
                fastPortEligible,
                focDatetimeActual,
                focDatetimeRequested,
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
    fun validate(): PortingOrderActivationSettings = apply {
        if (validated) {
            return@apply
        }

        activationStatus().ifPresent { it.validate() }
        fastPortEligible()
        focDatetimeActual()
        focDatetimeRequested()
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
        (activationStatus.asKnown().getOrNull()?.validity() ?: 0) +
            (if (fastPortEligible.asKnown().isPresent) 1 else 0) +
            (if (focDatetimeActual.asKnown().isPresent) 1 else 0) +
            (if (focDatetimeRequested.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PortingOrderActivationSettings &&
            activationStatus == other.activationStatus &&
            fastPortEligible == other.fastPortEligible &&
            focDatetimeActual == other.focDatetimeActual &&
            focDatetimeRequested == other.focDatetimeRequested &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            activationStatus,
            fastPortEligible,
            focDatetimeActual,
            focDatetimeRequested,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PortingOrderActivationSettings{activationStatus=$activationStatus, fastPortEligible=$fastPortEligible, focDatetimeActual=$focDatetimeActual, focDatetimeRequested=$focDatetimeRequested, additionalProperties=$additionalProperties}"
}
