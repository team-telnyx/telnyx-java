// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.wireguardpeers

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class WireguardPeerPatch
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val publicKey: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("public_key") @ExcludeMissing publicKey: JsonField<String> = JsonMissing.of()
    ) : this(publicKey, mutableMapOf())

    /**
     * The WireGuard `PublicKey`.<br /><br />If you do not provide a Public Key, a new Public and
     * Private key pair will be generated for you.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun publicKey(): Optional<String> = publicKey.getOptional("public_key")

    /**
     * Returns the raw JSON value of [publicKey].
     *
     * Unlike [publicKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("public_key") @ExcludeMissing fun _publicKey(): JsonField<String> = publicKey

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

        /** Returns a mutable builder for constructing an instance of [WireguardPeerPatch]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WireguardPeerPatch]. */
    class Builder internal constructor() {

        private var publicKey: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(wireguardPeerPatch: WireguardPeerPatch) = apply {
            publicKey = wireguardPeerPatch.publicKey
            additionalProperties = wireguardPeerPatch.additionalProperties.toMutableMap()
        }

        /**
         * The WireGuard `PublicKey`.<br /><br />If you do not provide a Public Key, a new Public
         * and Private key pair will be generated for you.
         */
        fun publicKey(publicKey: String) = publicKey(JsonField.of(publicKey))

        /**
         * Sets [Builder.publicKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.publicKey] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun publicKey(publicKey: JsonField<String>) = apply { this.publicKey = publicKey }

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
         * Returns an immutable instance of [WireguardPeerPatch].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): WireguardPeerPatch =
            WireguardPeerPatch(publicKey, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): WireguardPeerPatch = apply {
        if (validated) {
            return@apply
        }

        publicKey()
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
    @JvmSynthetic internal fun validity(): Int = (if (publicKey.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WireguardPeerPatch &&
            publicKey == other.publicKey &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(publicKey, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WireguardPeerPatch{publicKey=$publicKey, additionalProperties=$additionalProperties}"
}
