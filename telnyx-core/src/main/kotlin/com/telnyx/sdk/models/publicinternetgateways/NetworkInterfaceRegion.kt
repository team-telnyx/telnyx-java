// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.publicinternetgateways

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class NetworkInterfaceRegion
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val regionCode: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("region_code")
        @ExcludeMissing
        regionCode: JsonField<String> = JsonMissing.of()
    ) : this(regionCode, mutableMapOf())

    /**
     * The region the interface should be deployed to.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun regionCode(): Optional<String> = regionCode.getOptional("region_code")

    /**
     * Returns the raw JSON value of [regionCode].
     *
     * Unlike [regionCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("region_code") @ExcludeMissing fun _regionCode(): JsonField<String> = regionCode

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

        /** Returns a mutable builder for constructing an instance of [NetworkInterfaceRegion]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NetworkInterfaceRegion]. */
    class Builder internal constructor() {

        private var regionCode: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(networkInterfaceRegion: NetworkInterfaceRegion) = apply {
            regionCode = networkInterfaceRegion.regionCode
            additionalProperties = networkInterfaceRegion.additionalProperties.toMutableMap()
        }

        /** The region the interface should be deployed to. */
        fun regionCode(regionCode: String) = regionCode(JsonField.of(regionCode))

        /**
         * Sets [Builder.regionCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.regionCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun regionCode(regionCode: JsonField<String>) = apply { this.regionCode = regionCode }

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
         * Returns an immutable instance of [NetworkInterfaceRegion].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): NetworkInterfaceRegion =
            NetworkInterfaceRegion(regionCode, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): NetworkInterfaceRegion = apply {
        if (validated) {
            return@apply
        }

        regionCode()
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
    @JvmSynthetic internal fun validity(): Int = (if (regionCode.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NetworkInterfaceRegion &&
            regionCode == other.regionCode &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(regionCode, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NetworkInterfaceRegion{regionCode=$regionCode, additionalProperties=$additionalProperties}"
}
