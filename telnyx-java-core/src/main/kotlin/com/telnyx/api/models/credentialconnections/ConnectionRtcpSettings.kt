// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.credentialconnections

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.Enum
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ConnectionRtcpSettings
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val captureEnabled: JsonField<Boolean>,
    private val port: JsonField<Port>,
    private val reportFrequencySecs: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("capture_enabled")
        @ExcludeMissing
        captureEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("port") @ExcludeMissing port: JsonField<Port> = JsonMissing.of(),
        @JsonProperty("report_frequency_secs")
        @ExcludeMissing
        reportFrequencySecs: JsonField<Long> = JsonMissing.of(),
    ) : this(captureEnabled, port, reportFrequencySecs, mutableMapOf())

    /**
     * BETA - Enable the capture and storage of RTCP messages to create QoS reports on the Telnyx
     * Mission Control Portal.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun captureEnabled(): Optional<Boolean> = captureEnabled.getOptional("capture_enabled")

    /**
     * RTCP port by default is rtp+1, it can also be set to rtcp-mux
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun port(): Optional<Port> = port.getOptional("port")

    /**
     * RTCP reports are sent to customers based on the frequency set. Frequency is in seconds and it
     * can be set to values from 5 to 3000 seconds.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reportFrequencySecs(): Optional<Long> =
        reportFrequencySecs.getOptional("report_frequency_secs")

    /**
     * Returns the raw JSON value of [captureEnabled].
     *
     * Unlike [captureEnabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("capture_enabled")
    @ExcludeMissing
    fun _captureEnabled(): JsonField<Boolean> = captureEnabled

    /**
     * Returns the raw JSON value of [port].
     *
     * Unlike [port], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("port") @ExcludeMissing fun _port(): JsonField<Port> = port

    /**
     * Returns the raw JSON value of [reportFrequencySecs].
     *
     * Unlike [reportFrequencySecs], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("report_frequency_secs")
    @ExcludeMissing
    fun _reportFrequencySecs(): JsonField<Long> = reportFrequencySecs

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

        /** Returns a mutable builder for constructing an instance of [ConnectionRtcpSettings]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ConnectionRtcpSettings]. */
    class Builder internal constructor() {

        private var captureEnabled: JsonField<Boolean> = JsonMissing.of()
        private var port: JsonField<Port> = JsonMissing.of()
        private var reportFrequencySecs: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(connectionRtcpSettings: ConnectionRtcpSettings) = apply {
            captureEnabled = connectionRtcpSettings.captureEnabled
            port = connectionRtcpSettings.port
            reportFrequencySecs = connectionRtcpSettings.reportFrequencySecs
            additionalProperties = connectionRtcpSettings.additionalProperties.toMutableMap()
        }

        /**
         * BETA - Enable the capture and storage of RTCP messages to create QoS reports on the
         * Telnyx Mission Control Portal.
         */
        fun captureEnabled(captureEnabled: Boolean) = captureEnabled(JsonField.of(captureEnabled))

        /**
         * Sets [Builder.captureEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.captureEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun captureEnabled(captureEnabled: JsonField<Boolean>) = apply {
            this.captureEnabled = captureEnabled
        }

        /** RTCP port by default is rtp+1, it can also be set to rtcp-mux */
        fun port(port: Port) = port(JsonField.of(port))

        /**
         * Sets [Builder.port] to an arbitrary JSON value.
         *
         * You should usually call [Builder.port] with a well-typed [Port] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun port(port: JsonField<Port>) = apply { this.port = port }

        /**
         * RTCP reports are sent to customers based on the frequency set. Frequency is in seconds
         * and it can be set to values from 5 to 3000 seconds.
         */
        fun reportFrequencySecs(reportFrequencySecs: Long) =
            reportFrequencySecs(JsonField.of(reportFrequencySecs))

        /**
         * Sets [Builder.reportFrequencySecs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reportFrequencySecs] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun reportFrequencySecs(reportFrequencySecs: JsonField<Long>) = apply {
            this.reportFrequencySecs = reportFrequencySecs
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
         * Returns an immutable instance of [ConnectionRtcpSettings].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ConnectionRtcpSettings =
            ConnectionRtcpSettings(
                captureEnabled,
                port,
                reportFrequencySecs,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ConnectionRtcpSettings = apply {
        if (validated) {
            return@apply
        }

        captureEnabled()
        port().ifPresent { it.validate() }
        reportFrequencySecs()
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
        (if (captureEnabled.asKnown().isPresent) 1 else 0) +
            (port.asKnown().getOrNull()?.validity() ?: 0) +
            (if (reportFrequencySecs.asKnown().isPresent) 1 else 0)

    /** RTCP port by default is rtp+1, it can also be set to rtcp-mux */
    class Port @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val RTCP_MUX = of("rtcp-mux")

            @JvmField val RTP_1 = of("rtp+1")

            @JvmStatic fun of(value: String) = Port(JsonField.of(value))
        }

        /** An enum containing [Port]'s known values. */
        enum class Known {
            RTCP_MUX,
            RTP_1,
        }

        /**
         * An enum containing [Port]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Port] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            RTCP_MUX,
            RTP_1,
            /** An enum member indicating that [Port] was instantiated with an unknown value. */
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
                RTCP_MUX -> Value.RTCP_MUX
                RTP_1 -> Value.RTP_1
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
                RTCP_MUX -> Known.RTCP_MUX
                RTP_1 -> Known.RTP_1
                else -> throw TelnyxInvalidDataException("Unknown Port: $value")
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

        fun validate(): Port = apply {
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

            return other is Port && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConnectionRtcpSettings &&
            captureEnabled == other.captureEnabled &&
            port == other.port &&
            reportFrequencySecs == other.reportFrequencySecs &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(captureEnabled, port, reportFrequencySecs, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ConnectionRtcpSettings{captureEnabled=$captureEnabled, port=$port, reportFrequencySecs=$reportFrequencySecs, additionalProperties=$additionalProperties}"
}
