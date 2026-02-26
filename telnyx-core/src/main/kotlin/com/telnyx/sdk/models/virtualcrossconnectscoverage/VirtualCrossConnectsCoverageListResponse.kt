// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.virtualcrossconnectscoverage

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import com.telnyx.sdk.models.NetappsLocation
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class VirtualCrossConnectsCoverageListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val availableBandwidth: JsonField<List<Double>>,
    private val cloudProvider: JsonField<CloudProvider>,
    private val cloudProviderRegion: JsonField<String>,
    private val location: JsonField<NetappsLocation>,
    private val recordType: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("available_bandwidth")
        @ExcludeMissing
        availableBandwidth: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("cloud_provider")
        @ExcludeMissing
        cloudProvider: JsonField<CloudProvider> = JsonMissing.of(),
        @JsonProperty("cloud_provider_region")
        @ExcludeMissing
        cloudProviderRegion: JsonField<String> = JsonMissing.of(),
        @JsonProperty("location")
        @ExcludeMissing
        location: JsonField<NetappsLocation> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<String> = JsonMissing.of(),
    ) : this(
        availableBandwidth,
        cloudProvider,
        cloudProviderRegion,
        location,
        recordType,
        mutableMapOf(),
    )

    /**
     * The available throughput in Megabits per Second (Mbps) for your Virtual Cross Connect.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun availableBandwidth(): Optional<List<Double>> =
        availableBandwidth.getOptional("available_bandwidth")

    /**
     * The Virtual Private Cloud with which you would like to establish a cross connect.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cloudProvider(): Optional<CloudProvider> = cloudProvider.getOptional("cloud_provider")

    /**
     * The region where your Virtual Private Cloud hosts are located. Should be identical to how the
     * cloud provider names region, i.e. us-east-1 for AWS but Frankfurt for Azure
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cloudProviderRegion(): Optional<String> =
        cloudProviderRegion.getOptional("cloud_provider_region")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun location(): Optional<NetappsLocation> = location.getOptional("location")

    /**
     * Identifies the type of the resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<String> = recordType.getOptional("record_type")

    /**
     * Returns the raw JSON value of [availableBandwidth].
     *
     * Unlike [availableBandwidth], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("available_bandwidth")
    @ExcludeMissing
    fun _availableBandwidth(): JsonField<List<Double>> = availableBandwidth

    /**
     * Returns the raw JSON value of [cloudProvider].
     *
     * Unlike [cloudProvider], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cloud_provider")
    @ExcludeMissing
    fun _cloudProvider(): JsonField<CloudProvider> = cloudProvider

    /**
     * Returns the raw JSON value of [cloudProviderRegion].
     *
     * Unlike [cloudProviderRegion], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("cloud_provider_region")
    @ExcludeMissing
    fun _cloudProviderRegion(): JsonField<String> = cloudProviderRegion

    /**
     * Returns the raw JSON value of [location].
     *
     * Unlike [location], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("location") @ExcludeMissing fun _location(): JsonField<NetappsLocation> = location

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type") @ExcludeMissing fun _recordType(): JsonField<String> = recordType

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
         * [VirtualCrossConnectsCoverageListResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VirtualCrossConnectsCoverageListResponse]. */
    class Builder internal constructor() {

        private var availableBandwidth: JsonField<MutableList<Double>>? = null
        private var cloudProvider: JsonField<CloudProvider> = JsonMissing.of()
        private var cloudProviderRegion: JsonField<String> = JsonMissing.of()
        private var location: JsonField<NetappsLocation> = JsonMissing.of()
        private var recordType: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            virtualCrossConnectsCoverageListResponse: VirtualCrossConnectsCoverageListResponse
        ) = apply {
            availableBandwidth =
                virtualCrossConnectsCoverageListResponse.availableBandwidth.map {
                    it.toMutableList()
                }
            cloudProvider = virtualCrossConnectsCoverageListResponse.cloudProvider
            cloudProviderRegion = virtualCrossConnectsCoverageListResponse.cloudProviderRegion
            location = virtualCrossConnectsCoverageListResponse.location
            recordType = virtualCrossConnectsCoverageListResponse.recordType
            additionalProperties =
                virtualCrossConnectsCoverageListResponse.additionalProperties.toMutableMap()
        }

        /**
         * The available throughput in Megabits per Second (Mbps) for your Virtual Cross Connect.
         */
        fun availableBandwidth(availableBandwidth: List<Double>) =
            availableBandwidth(JsonField.of(availableBandwidth))

        /**
         * Sets [Builder.availableBandwidth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.availableBandwidth] with a well-typed `List<Double>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun availableBandwidth(availableBandwidth: JsonField<List<Double>>) = apply {
            this.availableBandwidth = availableBandwidth.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [Builder.availableBandwidth].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAvailableBandwidth(availableBandwidth: Double) = apply {
            this.availableBandwidth =
                (this.availableBandwidth ?: JsonField.of(mutableListOf())).also {
                    checkKnown("availableBandwidth", it).add(availableBandwidth)
                }
        }

        /** The Virtual Private Cloud with which you would like to establish a cross connect. */
        fun cloudProvider(cloudProvider: CloudProvider) = cloudProvider(JsonField.of(cloudProvider))

        /**
         * Sets [Builder.cloudProvider] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cloudProvider] with a well-typed [CloudProvider] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cloudProvider(cloudProvider: JsonField<CloudProvider>) = apply {
            this.cloudProvider = cloudProvider
        }

        /**
         * The region where your Virtual Private Cloud hosts are located. Should be identical to how
         * the cloud provider names region, i.e. us-east-1 for AWS but Frankfurt for Azure
         */
        fun cloudProviderRegion(cloudProviderRegion: String) =
            cloudProviderRegion(JsonField.of(cloudProviderRegion))

        /**
         * Sets [Builder.cloudProviderRegion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cloudProviderRegion] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cloudProviderRegion(cloudProviderRegion: JsonField<String>) = apply {
            this.cloudProviderRegion = cloudProviderRegion
        }

        fun location(location: NetappsLocation) = location(JsonField.of(location))

        /**
         * Sets [Builder.location] to an arbitrary JSON value.
         *
         * You should usually call [Builder.location] with a well-typed [NetappsLocation] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun location(location: JsonField<NetappsLocation>) = apply { this.location = location }

        /** Identifies the type of the resource. */
        fun recordType(recordType: String) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

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
         * Returns an immutable instance of [VirtualCrossConnectsCoverageListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): VirtualCrossConnectsCoverageListResponse =
            VirtualCrossConnectsCoverageListResponse(
                (availableBandwidth ?: JsonMissing.of()).map { it.toImmutable() },
                cloudProvider,
                cloudProviderRegion,
                location,
                recordType,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): VirtualCrossConnectsCoverageListResponse = apply {
        if (validated) {
            return@apply
        }

        availableBandwidth()
        cloudProvider().ifPresent { it.validate() }
        cloudProviderRegion()
        location().ifPresent { it.validate() }
        recordType()
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
        (availableBandwidth.asKnown().getOrNull()?.size ?: 0) +
            (cloudProvider.asKnown().getOrNull()?.validity() ?: 0) +
            (if (cloudProviderRegion.asKnown().isPresent) 1 else 0) +
            (location.asKnown().getOrNull()?.validity() ?: 0) +
            (if (recordType.asKnown().isPresent) 1 else 0)

    /** The Virtual Private Cloud with which you would like to establish a cross connect. */
    class CloudProvider @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val AWS = of("aws")

            @JvmField val AZURE = of("azure")

            @JvmField val GCE = of("gce")

            @JvmStatic fun of(value: String) = CloudProvider(JsonField.of(value))
        }

        /** An enum containing [CloudProvider]'s known values. */
        enum class Known {
            AWS,
            AZURE,
            GCE,
        }

        /**
         * An enum containing [CloudProvider]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [CloudProvider] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AWS,
            AZURE,
            GCE,
            /**
             * An enum member indicating that [CloudProvider] was instantiated with an unknown
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
                AWS -> Value.AWS
                AZURE -> Value.AZURE
                GCE -> Value.GCE
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
                AWS -> Known.AWS
                AZURE -> Known.AZURE
                GCE -> Known.GCE
                else -> throw TelnyxInvalidDataException("Unknown CloudProvider: $value")
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

        fun validate(): CloudProvider = apply {
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

            return other is CloudProvider && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VirtualCrossConnectsCoverageListResponse &&
            availableBandwidth == other.availableBandwidth &&
            cloudProvider == other.cloudProvider &&
            cloudProviderRegion == other.cloudProviderRegion &&
            location == other.location &&
            recordType == other.recordType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            availableBandwidth,
            cloudProvider,
            cloudProviderRegion,
            location,
            recordType,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VirtualCrossConnectsCoverageListResponse{availableBandwidth=$availableBandwidth, cloudProvider=$cloudProvider, cloudProviderRegion=$cloudProviderRegion, location=$location, recordType=$recordType, additionalProperties=$additionalProperties}"
}
