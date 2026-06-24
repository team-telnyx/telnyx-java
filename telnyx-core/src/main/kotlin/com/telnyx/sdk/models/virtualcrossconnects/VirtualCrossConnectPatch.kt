// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.virtualcrossconnects

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

class VirtualCrossConnectPatch
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val primaryCloudIp: JsonField<String>,
    private val primaryEnabled: JsonField<Boolean>,
    private val primaryRoutingAnnouncement: JsonField<Boolean>,
    private val secondaryCloudIp: JsonField<String>,
    private val secondaryEnabled: JsonField<Boolean>,
    private val secondaryRoutingAnnouncement: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("primary_cloud_ip")
        @ExcludeMissing
        primaryCloudIp: JsonField<String> = JsonMissing.of(),
        @JsonProperty("primary_enabled")
        @ExcludeMissing
        primaryEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("primary_routing_announcement")
        @ExcludeMissing
        primaryRoutingAnnouncement: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("secondary_cloud_ip")
        @ExcludeMissing
        secondaryCloudIp: JsonField<String> = JsonMissing.of(),
        @JsonProperty("secondary_enabled")
        @ExcludeMissing
        secondaryEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("secondary_routing_announcement")
        @ExcludeMissing
        secondaryRoutingAnnouncement: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        primaryCloudIp,
        primaryEnabled,
        primaryRoutingAnnouncement,
        secondaryCloudIp,
        secondaryEnabled,
        secondaryRoutingAnnouncement,
        mutableMapOf(),
    )

    /**
     * The IP address assigned for your side of the Virtual Cross Connect.<br /><br />If none is
     * provided, one will be generated for you.<br /><br />This value can not be patched once the
     * VXC has bene provisioned.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryCloudIp(): Optional<String> = primaryCloudIp.getOptional("primary_cloud_ip")

    /**
     * Indicates whether the primary circuit is enabled. Setting this to `false` will disable the
     * circuit.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryEnabled(): Optional<Boolean> = primaryEnabled.getOptional("primary_enabled")

    /**
     * Whether the primary BGP route is being announced.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryRoutingAnnouncement(): Optional<Boolean> =
        primaryRoutingAnnouncement.getOptional("primary_routing_announcement")

    /**
     * The IP address assigned for your side of the Virtual Cross Connect.<br /><br />If none is
     * provided, one will be generated for you.<br /><br />This value can not be patched once the
     * VXC has bene provisioned.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun secondaryCloudIp(): Optional<String> = secondaryCloudIp.getOptional("secondary_cloud_ip")

    /**
     * Indicates whether the secondary circuit is enabled. Setting this to `false` will disable the
     * circuit.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun secondaryEnabled(): Optional<Boolean> = secondaryEnabled.getOptional("secondary_enabled")

    /**
     * Whether the secondary BGP route is being announced.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun secondaryRoutingAnnouncement(): Optional<Boolean> =
        secondaryRoutingAnnouncement.getOptional("secondary_routing_announcement")

    /**
     * Returns the raw JSON value of [primaryCloudIp].
     *
     * Unlike [primaryCloudIp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("primary_cloud_ip")
    @ExcludeMissing
    fun _primaryCloudIp(): JsonField<String> = primaryCloudIp

    /**
     * Returns the raw JSON value of [primaryEnabled].
     *
     * Unlike [primaryEnabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("primary_enabled")
    @ExcludeMissing
    fun _primaryEnabled(): JsonField<Boolean> = primaryEnabled

    /**
     * Returns the raw JSON value of [primaryRoutingAnnouncement].
     *
     * Unlike [primaryRoutingAnnouncement], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("primary_routing_announcement")
    @ExcludeMissing
    fun _primaryRoutingAnnouncement(): JsonField<Boolean> = primaryRoutingAnnouncement

    /**
     * Returns the raw JSON value of [secondaryCloudIp].
     *
     * Unlike [secondaryCloudIp], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("secondary_cloud_ip")
    @ExcludeMissing
    fun _secondaryCloudIp(): JsonField<String> = secondaryCloudIp

    /**
     * Returns the raw JSON value of [secondaryEnabled].
     *
     * Unlike [secondaryEnabled], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("secondary_enabled")
    @ExcludeMissing
    fun _secondaryEnabled(): JsonField<Boolean> = secondaryEnabled

    /**
     * Returns the raw JSON value of [secondaryRoutingAnnouncement].
     *
     * Unlike [secondaryRoutingAnnouncement], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("secondary_routing_announcement")
    @ExcludeMissing
    fun _secondaryRoutingAnnouncement(): JsonField<Boolean> = secondaryRoutingAnnouncement

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

        /** Returns a mutable builder for constructing an instance of [VirtualCrossConnectPatch]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VirtualCrossConnectPatch]. */
    class Builder internal constructor() {

        private var primaryCloudIp: JsonField<String> = JsonMissing.of()
        private var primaryEnabled: JsonField<Boolean> = JsonMissing.of()
        private var primaryRoutingAnnouncement: JsonField<Boolean> = JsonMissing.of()
        private var secondaryCloudIp: JsonField<String> = JsonMissing.of()
        private var secondaryEnabled: JsonField<Boolean> = JsonMissing.of()
        private var secondaryRoutingAnnouncement: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(virtualCrossConnectPatch: VirtualCrossConnectPatch) = apply {
            primaryCloudIp = virtualCrossConnectPatch.primaryCloudIp
            primaryEnabled = virtualCrossConnectPatch.primaryEnabled
            primaryRoutingAnnouncement = virtualCrossConnectPatch.primaryRoutingAnnouncement
            secondaryCloudIp = virtualCrossConnectPatch.secondaryCloudIp
            secondaryEnabled = virtualCrossConnectPatch.secondaryEnabled
            secondaryRoutingAnnouncement = virtualCrossConnectPatch.secondaryRoutingAnnouncement
            additionalProperties = virtualCrossConnectPatch.additionalProperties.toMutableMap()
        }

        /**
         * The IP address assigned for your side of the Virtual Cross Connect.<br /><br />If none is
         * provided, one will be generated for you.<br /><br />This value can not be patched once
         * the VXC has bene provisioned.
         */
        fun primaryCloudIp(primaryCloudIp: String) = primaryCloudIp(JsonField.of(primaryCloudIp))

        /**
         * Sets [Builder.primaryCloudIp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryCloudIp] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun primaryCloudIp(primaryCloudIp: JsonField<String>) = apply {
            this.primaryCloudIp = primaryCloudIp
        }

        /**
         * Indicates whether the primary circuit is enabled. Setting this to `false` will disable
         * the circuit.
         */
        fun primaryEnabled(primaryEnabled: Boolean) = primaryEnabled(JsonField.of(primaryEnabled))

        /**
         * Sets [Builder.primaryEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun primaryEnabled(primaryEnabled: JsonField<Boolean>) = apply {
            this.primaryEnabled = primaryEnabled
        }

        /** Whether the primary BGP route is being announced. */
        fun primaryRoutingAnnouncement(primaryRoutingAnnouncement: Boolean) =
            primaryRoutingAnnouncement(JsonField.of(primaryRoutingAnnouncement))

        /**
         * Sets [Builder.primaryRoutingAnnouncement] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryRoutingAnnouncement] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun primaryRoutingAnnouncement(primaryRoutingAnnouncement: JsonField<Boolean>) = apply {
            this.primaryRoutingAnnouncement = primaryRoutingAnnouncement
        }

        /**
         * The IP address assigned for your side of the Virtual Cross Connect.<br /><br />If none is
         * provided, one will be generated for you.<br /><br />This value can not be patched once
         * the VXC has bene provisioned.
         */
        fun secondaryCloudIp(secondaryCloudIp: String) =
            secondaryCloudIp(JsonField.of(secondaryCloudIp))

        /**
         * Sets [Builder.secondaryCloudIp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.secondaryCloudIp] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun secondaryCloudIp(secondaryCloudIp: JsonField<String>) = apply {
            this.secondaryCloudIp = secondaryCloudIp
        }

        /**
         * Indicates whether the secondary circuit is enabled. Setting this to `false` will disable
         * the circuit.
         */
        fun secondaryEnabled(secondaryEnabled: Boolean) =
            secondaryEnabled(JsonField.of(secondaryEnabled))

        /**
         * Sets [Builder.secondaryEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.secondaryEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun secondaryEnabled(secondaryEnabled: JsonField<Boolean>) = apply {
            this.secondaryEnabled = secondaryEnabled
        }

        /** Whether the secondary BGP route is being announced. */
        fun secondaryRoutingAnnouncement(secondaryRoutingAnnouncement: Boolean) =
            secondaryRoutingAnnouncement(JsonField.of(secondaryRoutingAnnouncement))

        /**
         * Sets [Builder.secondaryRoutingAnnouncement] to an arbitrary JSON value.
         *
         * You should usually call [Builder.secondaryRoutingAnnouncement] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun secondaryRoutingAnnouncement(secondaryRoutingAnnouncement: JsonField<Boolean>) = apply {
            this.secondaryRoutingAnnouncement = secondaryRoutingAnnouncement
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
         * Returns an immutable instance of [VirtualCrossConnectPatch].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): VirtualCrossConnectPatch =
            VirtualCrossConnectPatch(
                primaryCloudIp,
                primaryEnabled,
                primaryRoutingAnnouncement,
                secondaryCloudIp,
                secondaryEnabled,
                secondaryRoutingAnnouncement,
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
    fun validate(): VirtualCrossConnectPatch = apply {
        if (validated) {
            return@apply
        }

        primaryCloudIp()
        primaryEnabled()
        primaryRoutingAnnouncement()
        secondaryCloudIp()
        secondaryEnabled()
        secondaryRoutingAnnouncement()
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
        (if (primaryCloudIp.asKnown().isPresent) 1 else 0) +
            (if (primaryEnabled.asKnown().isPresent) 1 else 0) +
            (if (primaryRoutingAnnouncement.asKnown().isPresent) 1 else 0) +
            (if (secondaryCloudIp.asKnown().isPresent) 1 else 0) +
            (if (secondaryEnabled.asKnown().isPresent) 1 else 0) +
            (if (secondaryRoutingAnnouncement.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VirtualCrossConnectPatch &&
            primaryCloudIp == other.primaryCloudIp &&
            primaryEnabled == other.primaryEnabled &&
            primaryRoutingAnnouncement == other.primaryRoutingAnnouncement &&
            secondaryCloudIp == other.secondaryCloudIp &&
            secondaryEnabled == other.secondaryEnabled &&
            secondaryRoutingAnnouncement == other.secondaryRoutingAnnouncement &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            primaryCloudIp,
            primaryEnabled,
            primaryRoutingAnnouncement,
            secondaryCloudIp,
            secondaryEnabled,
            secondaryRoutingAnnouncement,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VirtualCrossConnectPatch{primaryCloudIp=$primaryCloudIp, primaryEnabled=$primaryEnabled, primaryRoutingAnnouncement=$primaryRoutingAnnouncement, secondaryCloudIp=$secondaryCloudIp, secondaryEnabled=$secondaryEnabled, secondaryRoutingAnnouncement=$secondaryRoutingAnnouncement, additionalProperties=$additionalProperties}"
}
