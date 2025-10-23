// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers.voice

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

/** The media features settings for a phone number. */
class MediaFeatures
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val acceptAnyRtpPacketsEnabled: JsonField<Boolean>,
    private val rtpAutoAdjustEnabled: JsonField<Boolean>,
    private val t38FaxGatewayEnabled: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("accept_any_rtp_packets_enabled")
        @ExcludeMissing
        acceptAnyRtpPacketsEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("rtp_auto_adjust_enabled")
        @ExcludeMissing
        rtpAutoAdjustEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("t38_fax_gateway_enabled")
        @ExcludeMissing
        t38FaxGatewayEnabled: JsonField<Boolean> = JsonMissing.of(),
    ) : this(acceptAnyRtpPacketsEnabled, rtpAutoAdjustEnabled, t38FaxGatewayEnabled, mutableMapOf())

    /**
     * When enabled, Telnyx will accept RTP packets from any customer-side IP address and port, not
     * just those to which Telnyx is sending RTP.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun acceptAnyRtpPacketsEnabled(): Optional<Boolean> =
        acceptAnyRtpPacketsEnabled.getOptional("accept_any_rtp_packets_enabled")

    /**
     * When RTP Auto-Adjust is enabled, the destination RTP address port will be automatically
     * changed to match the source of the incoming RTP packets.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rtpAutoAdjustEnabled(): Optional<Boolean> =
        rtpAutoAdjustEnabled.getOptional("rtp_auto_adjust_enabled")

    /**
     * Controls whether Telnyx will accept a T.38 re-INVITE for this phone number. Note that Telnyx
     * will not send a T.38 re-INVITE; this option only controls whether one will be accepted.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun t38FaxGatewayEnabled(): Optional<Boolean> =
        t38FaxGatewayEnabled.getOptional("t38_fax_gateway_enabled")

    /**
     * Returns the raw JSON value of [acceptAnyRtpPacketsEnabled].
     *
     * Unlike [acceptAnyRtpPacketsEnabled], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("accept_any_rtp_packets_enabled")
    @ExcludeMissing
    fun _acceptAnyRtpPacketsEnabled(): JsonField<Boolean> = acceptAnyRtpPacketsEnabled

    /**
     * Returns the raw JSON value of [rtpAutoAdjustEnabled].
     *
     * Unlike [rtpAutoAdjustEnabled], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("rtp_auto_adjust_enabled")
    @ExcludeMissing
    fun _rtpAutoAdjustEnabled(): JsonField<Boolean> = rtpAutoAdjustEnabled

    /**
     * Returns the raw JSON value of [t38FaxGatewayEnabled].
     *
     * Unlike [t38FaxGatewayEnabled], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("t38_fax_gateway_enabled")
    @ExcludeMissing
    fun _t38FaxGatewayEnabled(): JsonField<Boolean> = t38FaxGatewayEnabled

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

        /** Returns a mutable builder for constructing an instance of [MediaFeatures]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MediaFeatures]. */
    class Builder internal constructor() {

        private var acceptAnyRtpPacketsEnabled: JsonField<Boolean> = JsonMissing.of()
        private var rtpAutoAdjustEnabled: JsonField<Boolean> = JsonMissing.of()
        private var t38FaxGatewayEnabled: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(mediaFeatures: MediaFeatures) = apply {
            acceptAnyRtpPacketsEnabled = mediaFeatures.acceptAnyRtpPacketsEnabled
            rtpAutoAdjustEnabled = mediaFeatures.rtpAutoAdjustEnabled
            t38FaxGatewayEnabled = mediaFeatures.t38FaxGatewayEnabled
            additionalProperties = mediaFeatures.additionalProperties.toMutableMap()
        }

        /**
         * When enabled, Telnyx will accept RTP packets from any customer-side IP address and port,
         * not just those to which Telnyx is sending RTP.
         */
        fun acceptAnyRtpPacketsEnabled(acceptAnyRtpPacketsEnabled: Boolean) =
            acceptAnyRtpPacketsEnabled(JsonField.of(acceptAnyRtpPacketsEnabled))

        /**
         * Sets [Builder.acceptAnyRtpPacketsEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.acceptAnyRtpPacketsEnabled] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun acceptAnyRtpPacketsEnabled(acceptAnyRtpPacketsEnabled: JsonField<Boolean>) = apply {
            this.acceptAnyRtpPacketsEnabled = acceptAnyRtpPacketsEnabled
        }

        /**
         * When RTP Auto-Adjust is enabled, the destination RTP address port will be automatically
         * changed to match the source of the incoming RTP packets.
         */
        fun rtpAutoAdjustEnabled(rtpAutoAdjustEnabled: Boolean) =
            rtpAutoAdjustEnabled(JsonField.of(rtpAutoAdjustEnabled))

        /**
         * Sets [Builder.rtpAutoAdjustEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rtpAutoAdjustEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rtpAutoAdjustEnabled(rtpAutoAdjustEnabled: JsonField<Boolean>) = apply {
            this.rtpAutoAdjustEnabled = rtpAutoAdjustEnabled
        }

        /**
         * Controls whether Telnyx will accept a T.38 re-INVITE for this phone number. Note that
         * Telnyx will not send a T.38 re-INVITE; this option only controls whether one will be
         * accepted.
         */
        fun t38FaxGatewayEnabled(t38FaxGatewayEnabled: Boolean) =
            t38FaxGatewayEnabled(JsonField.of(t38FaxGatewayEnabled))

        /**
         * Sets [Builder.t38FaxGatewayEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.t38FaxGatewayEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun t38FaxGatewayEnabled(t38FaxGatewayEnabled: JsonField<Boolean>) = apply {
            this.t38FaxGatewayEnabled = t38FaxGatewayEnabled
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
         * Returns an immutable instance of [MediaFeatures].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MediaFeatures =
            MediaFeatures(
                acceptAnyRtpPacketsEnabled,
                rtpAutoAdjustEnabled,
                t38FaxGatewayEnabled,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MediaFeatures = apply {
        if (validated) {
            return@apply
        }

        acceptAnyRtpPacketsEnabled()
        rtpAutoAdjustEnabled()
        t38FaxGatewayEnabled()
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
        (if (acceptAnyRtpPacketsEnabled.asKnown().isPresent) 1 else 0) +
            (if (rtpAutoAdjustEnabled.asKnown().isPresent) 1 else 0) +
            (if (t38FaxGatewayEnabled.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MediaFeatures &&
            acceptAnyRtpPacketsEnabled == other.acceptAnyRtpPacketsEnabled &&
            rtpAutoAdjustEnabled == other.rtpAutoAdjustEnabled &&
            t38FaxGatewayEnabled == other.t38FaxGatewayEnabled &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            acceptAnyRtpPacketsEnabled,
            rtpAutoAdjustEnabled,
            t38FaxGatewayEnabled,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MediaFeatures{acceptAnyRtpPacketsEnabled=$acceptAnyRtpPacketsEnabled, rtpAutoAdjustEnabled=$rtpAutoAdjustEnabled, t38FaxGatewayEnabled=$t38FaxGatewayEnabled, additionalProperties=$additionalProperties}"
}
