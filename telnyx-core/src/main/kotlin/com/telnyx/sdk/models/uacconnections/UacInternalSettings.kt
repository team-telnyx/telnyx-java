// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.uacconnections

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

/** Internal Telnyx-side settings for a UAC connection. */
class UacInternalSettings
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val destinationUri: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("destination_uri")
        @ExcludeMissing
        destinationUri: JsonField<String> = JsonMissing.of()
    ) : this(destinationUri, mutableMapOf())

    /**
     * The SIP URI that Telnyx will call when handling an inbound request from the external peer. Do
     * not include a `sip:` prefix. The value must be in the format
     * `userinfo@<subdomain.>sip.telnyx.com` or `userinfo@<subdomain.>sipdev.telnyx.com`; the
     * userinfo portion may contain only letters, digits, hyphens, and underscores.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun destinationUri(): Optional<String> = destinationUri.getOptional("destination_uri")

    /**
     * Returns the raw JSON value of [destinationUri].
     *
     * Unlike [destinationUri], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("destination_uri")
    @ExcludeMissing
    fun _destinationUri(): JsonField<String> = destinationUri

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

        /** Returns a mutable builder for constructing an instance of [UacInternalSettings]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UacInternalSettings]. */
    class Builder internal constructor() {

        private var destinationUri: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(uacInternalSettings: UacInternalSettings) = apply {
            destinationUri = uacInternalSettings.destinationUri
            additionalProperties = uacInternalSettings.additionalProperties.toMutableMap()
        }

        /**
         * The SIP URI that Telnyx will call when handling an inbound request from the external
         * peer. Do not include a `sip:` prefix. The value must be in the format
         * `userinfo@<subdomain.>sip.telnyx.com` or `userinfo@<subdomain.>sipdev.telnyx.com`; the
         * userinfo portion may contain only letters, digits, hyphens, and underscores.
         */
        fun destinationUri(destinationUri: String) = destinationUri(JsonField.of(destinationUri))

        /**
         * Sets [Builder.destinationUri] to an arbitrary JSON value.
         *
         * You should usually call [Builder.destinationUri] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun destinationUri(destinationUri: JsonField<String>) = apply {
            this.destinationUri = destinationUri
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
         * Returns an immutable instance of [UacInternalSettings].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UacInternalSettings =
            UacInternalSettings(destinationUri, additionalProperties.toMutableMap())
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
    fun validate(): UacInternalSettings = apply {
        if (validated) {
            return@apply
        }

        destinationUri()
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
    @JvmSynthetic internal fun validity(): Int = (if (destinationUri.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UacInternalSettings &&
            destinationUri == other.destinationUri &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(destinationUri, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UacInternalSettings{destinationUri=$destinationUri, additionalProperties=$additionalProperties}"
}
