// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.networkcoverage

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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

class NetworkCoverageListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val availableServices: JsonField<List<AvailableService>>,
    private val location: JsonField<NetappsLocation>,
    private val recordType: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("available_services")
        @ExcludeMissing
        availableServices: JsonField<List<AvailableService>> = JsonMissing.of(),
        @JsonProperty("location")
        @ExcludeMissing
        location: JsonField<NetappsLocation> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<String> = JsonMissing.of(),
    ) : this(availableServices, location, recordType, mutableMapOf())

    /**
     * List of interface types supported in this region.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun availableServices(): Optional<List<AvailableService>> =
        availableServices.getOptional("available_services")

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
     * Returns the raw JSON value of [availableServices].
     *
     * Unlike [availableServices], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("available_services")
    @ExcludeMissing
    fun _availableServices(): JsonField<List<AvailableService>> = availableServices

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
         * Returns a mutable builder for constructing an instance of [NetworkCoverageListResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NetworkCoverageListResponse]. */
    class Builder internal constructor() {

        private var availableServices: JsonField<MutableList<AvailableService>>? = null
        private var location: JsonField<NetappsLocation> = JsonMissing.of()
        private var recordType: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(networkCoverageListResponse: NetworkCoverageListResponse) = apply {
            availableServices =
                networkCoverageListResponse.availableServices.map { it.toMutableList() }
            location = networkCoverageListResponse.location
            recordType = networkCoverageListResponse.recordType
            additionalProperties = networkCoverageListResponse.additionalProperties.toMutableMap()
        }

        /** List of interface types supported in this region. */
        fun availableServices(availableServices: List<AvailableService>) =
            availableServices(JsonField.of(availableServices))

        /**
         * Sets [Builder.availableServices] to an arbitrary JSON value.
         *
         * You should usually call [Builder.availableServices] with a well-typed
         * `List<AvailableService>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun availableServices(availableServices: JsonField<List<AvailableService>>) = apply {
            this.availableServices = availableServices.map { it.toMutableList() }
        }

        /**
         * Adds a single [AvailableService] to [availableServices].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAvailableService(availableService: AvailableService) = apply {
            availableServices =
                (availableServices ?: JsonField.of(mutableListOf())).also {
                    checkKnown("availableServices", it).add(availableService)
                }
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
         * Returns an immutable instance of [NetworkCoverageListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): NetworkCoverageListResponse =
            NetworkCoverageListResponse(
                (availableServices ?: JsonMissing.of()).map { it.toImmutable() },
                location,
                recordType,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): NetworkCoverageListResponse = apply {
        if (validated) {
            return@apply
        }

        availableServices().ifPresent { it.forEach { it.validate() } }
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
        (availableServices.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (location.asKnown().getOrNull()?.validity() ?: 0) +
            (if (recordType.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NetworkCoverageListResponse &&
            availableServices == other.availableServices &&
            location == other.location &&
            recordType == other.recordType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(availableServices, location, recordType, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NetworkCoverageListResponse{availableServices=$availableServices, location=$location, recordType=$recordType, additionalProperties=$additionalProperties}"
}
