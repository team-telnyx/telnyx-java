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
import com.telnyx.sdk.models.networks.InterfaceStatus
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class NetworkInterface
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val name: JsonField<String>,
    private val networkId: JsonField<String>,
    private val status: JsonField<InterfaceStatus>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("network_id") @ExcludeMissing networkId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<InterfaceStatus> = JsonMissing.of(),
    ) : this(name, networkId, status, mutableMapOf())

    /**
     * A user specified name for the interface.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * The id of the network associated with the interface.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun networkId(): Optional<String> = networkId.getOptional("network_id")

    /**
     * The current status of the interface deployment.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<InterfaceStatus> = status.getOptional("status")

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [networkId].
     *
     * Unlike [networkId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("network_id") @ExcludeMissing fun _networkId(): JsonField<String> = networkId

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<InterfaceStatus> = status

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

        /** Returns a mutable builder for constructing an instance of [NetworkInterface]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NetworkInterface]. */
    class Builder internal constructor() {

        private var name: JsonField<String> = JsonMissing.of()
        private var networkId: JsonField<String> = JsonMissing.of()
        private var status: JsonField<InterfaceStatus> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(networkInterface: NetworkInterface) = apply {
            name = networkInterface.name
            networkId = networkInterface.networkId
            status = networkInterface.status
            additionalProperties = networkInterface.additionalProperties.toMutableMap()
        }

        /** A user specified name for the interface. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The id of the network associated with the interface. */
        fun networkId(networkId: String) = networkId(JsonField.of(networkId))

        /**
         * Sets [Builder.networkId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.networkId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun networkId(networkId: JsonField<String>) = apply { this.networkId = networkId }

        /** The current status of the interface deployment. */
        fun status(status: InterfaceStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [InterfaceStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun status(status: JsonField<InterfaceStatus>) = apply { this.status = status }

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
         * Returns an immutable instance of [NetworkInterface].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): NetworkInterface =
            NetworkInterface(name, networkId, status, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): NetworkInterface = apply {
        if (validated) {
            return@apply
        }

        name()
        networkId()
        status().ifPresent { it.validate() }
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
        (if (name.asKnown().isPresent) 1 else 0) +
            (if (networkId.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NetworkInterface &&
            name == other.name &&
            networkId == other.networkId &&
            status == other.status &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(name, networkId, status, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NetworkInterface{name=$name, networkId=$networkId, status=$status, additionalProperties=$additionalProperties}"
}
