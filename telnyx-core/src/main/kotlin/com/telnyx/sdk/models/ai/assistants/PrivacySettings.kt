// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PrivacySettings
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val dataRetention: JsonField<Boolean>,
    private val inTransitDataLocality: JsonField<Boolean>,
    private val piiRedaction: JsonField<PiiRedaction>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data_retention")
        @ExcludeMissing
        dataRetention: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("in_transit_data_locality")
        @ExcludeMissing
        inTransitDataLocality: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("pii_redaction")
        @ExcludeMissing
        piiRedaction: JsonField<PiiRedaction> = JsonMissing.of(),
    ) : this(dataRetention, inTransitDataLocality, piiRedaction, mutableMapOf())

    /**
     * If true, conversation history and insights will be stored. If false, they will not be stored.
     * This in‑tool toggle governs solely the retention of conversation history and insights via the
     * AI assistant. It has no effect on any separate recording, transcription, or storage
     * configuration that you have set at the account, number, or application level. All such
     * external settings remain in force regardless of your selection here.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dataRetention(): Optional<Boolean> = dataRetention.getOptional("data_retention")

    /**
     * Requires every model call made for a web chat turn to be received and served inside your
     * organization's data-locality region, rather than only stored there. Applies to web chat only
     * — voice and messaging assistants are unaffected. Enabling it requires a data-locality region
     * with in-region inference (USA, EU, AUS, UAE; see
     * [Inference regions](https://developers.telnyx.com/docs/inference/models/regions)) and
     * Telnyx-hosted models for the assistant, its fallback, and any conversation-flow node that
     * overrides the model; the request is rejected otherwise. Once enabled, send chat requests to
     * your region's API hostname: a request entering the platform in another region is rejected
     * rather than forwarded, because forwarding it would already have moved the content across the
     * border. Defaults to false.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inTransitDataLocality(): Optional<Boolean> =
        inTransitDataLocality.getOptional("in_transit_data_locality")

    /**
     * Controls redaction of personally identifiable information (PII) from the conversation history
     * that is stored for this assistant. `disabled` (default) stores content as-is. `redact`
     * replaces detected PII with `<PII:type/>` placeholders (e.g. `<PII:name/>`, `<PII:phone/>`) as
     * the stored copies are written: message content (user, assistant, and tool-result messages)
     * and tool-call arguments are redacted when written to conversation history, so the stored
     * transcript, its read-back via the history API, and any insights generated from the stored
     * messages contain the placeholders instead of the PII; response bodies returned by webhook
     * tools are redacted too, as stored in the webhook logs — a per-conversation record separate
     * from the transcript. In the Mission Control Portal this field appears as a "PII Redaction"
     * on/off toggle, where Enabled corresponds to `redact`. Redaction runs when the stored copy is
     * written, after the LLM has generated its reply: the live conversation is not redacted, the
     * assistant's tools keep receiving the full (unredacted) values during the call, and the LLM
     * still sees full content in its context window. Call recordings (including any recording
     * layout configured under telephony settings) and the payloads of messages/webhooks delivered
     * during the call are never redacted by this setting. The set of detected PII types (names,
     * street addresses, phone numbers, email addresses, government identifiers like SSN and
     * driver's license numbers, credit card and bank account numbers, IP addresses, dates of birth,
     * and other identifiers unique to a person) is fixed by Telnyx and cannot be configured or
     * extended per assistant. Assistants with `redact` cannot be used for SMS/WhatsApp messaging
     * (that combination is rejected with a 400 error); voice and web chat are unaffected.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun piiRedaction(): Optional<PiiRedaction> = piiRedaction.getOptional("pii_redaction")

    /**
     * Returns the raw JSON value of [dataRetention].
     *
     * Unlike [dataRetention], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data_retention")
    @ExcludeMissing
    fun _dataRetention(): JsonField<Boolean> = dataRetention

    /**
     * Returns the raw JSON value of [inTransitDataLocality].
     *
     * Unlike [inTransitDataLocality], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("in_transit_data_locality")
    @ExcludeMissing
    fun _inTransitDataLocality(): JsonField<Boolean> = inTransitDataLocality

    /**
     * Returns the raw JSON value of [piiRedaction].
     *
     * Unlike [piiRedaction], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pii_redaction")
    @ExcludeMissing
    fun _piiRedaction(): JsonField<PiiRedaction> = piiRedaction

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

        /** Returns a mutable builder for constructing an instance of [PrivacySettings]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PrivacySettings]. */
    class Builder internal constructor() {

        private var dataRetention: JsonField<Boolean> = JsonMissing.of()
        private var inTransitDataLocality: JsonField<Boolean> = JsonMissing.of()
        private var piiRedaction: JsonField<PiiRedaction> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(privacySettings: PrivacySettings) = apply {
            dataRetention = privacySettings.dataRetention
            inTransitDataLocality = privacySettings.inTransitDataLocality
            piiRedaction = privacySettings.piiRedaction
            additionalProperties = privacySettings.additionalProperties.toMutableMap()
        }

        /**
         * If true, conversation history and insights will be stored. If false, they will not be
         * stored. This in‑tool toggle governs solely the retention of conversation history and
         * insights via the AI assistant. It has no effect on any separate recording, transcription,
         * or storage configuration that you have set at the account, number, or application level.
         * All such external settings remain in force regardless of your selection here.
         */
        fun dataRetention(dataRetention: Boolean) = dataRetention(JsonField.of(dataRetention))

        /**
         * Sets [Builder.dataRetention] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataRetention] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dataRetention(dataRetention: JsonField<Boolean>) = apply {
            this.dataRetention = dataRetention
        }

        /**
         * Requires every model call made for a web chat turn to be received and served inside your
         * organization's data-locality region, rather than only stored there. Applies to web chat
         * only — voice and messaging assistants are unaffected. Enabling it requires a
         * data-locality region with in-region inference (USA, EU, AUS, UAE; see
         * [Inference regions](https://developers.telnyx.com/docs/inference/models/regions)) and
         * Telnyx-hosted models for the assistant, its fallback, and any conversation-flow node that
         * overrides the model; the request is rejected otherwise. Once enabled, send chat requests
         * to your region's API hostname: a request entering the platform in another region is
         * rejected rather than forwarded, because forwarding it would already have moved the
         * content across the border. Defaults to false.
         */
        fun inTransitDataLocality(inTransitDataLocality: Boolean) =
            inTransitDataLocality(JsonField.of(inTransitDataLocality))

        /**
         * Sets [Builder.inTransitDataLocality] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inTransitDataLocality] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun inTransitDataLocality(inTransitDataLocality: JsonField<Boolean>) = apply {
            this.inTransitDataLocality = inTransitDataLocality
        }

        /**
         * Controls redaction of personally identifiable information (PII) from the conversation
         * history that is stored for this assistant. `disabled` (default) stores content as-is.
         * `redact` replaces detected PII with `<PII:type/>` placeholders (e.g. `<PII:name/>`,
         * `<PII:phone/>`) as the stored copies are written: message content (user, assistant, and
         * tool-result messages) and tool-call arguments are redacted when written to conversation
         * history, so the stored transcript, its read-back via the history API, and any insights
         * generated from the stored messages contain the placeholders instead of the PII; response
         * bodies returned by webhook tools are redacted too, as stored in the webhook logs — a
         * per-conversation record separate from the transcript. In the Mission Control Portal this
         * field appears as a "PII Redaction" on/off toggle, where Enabled corresponds to `redact`.
         * Redaction runs when the stored copy is written, after the LLM has generated its reply:
         * the live conversation is not redacted, the assistant's tools keep receiving the full
         * (unredacted) values during the call, and the LLM still sees full content in its context
         * window. Call recordings (including any recording layout configured under telephony
         * settings) and the payloads of messages/webhooks delivered during the call are never
         * redacted by this setting. The set of detected PII types (names, street addresses, phone
         * numbers, email addresses, government identifiers like SSN and driver's license numbers,
         * credit card and bank account numbers, IP addresses, dates of birth, and other identifiers
         * unique to a person) is fixed by Telnyx and cannot be configured or extended per
         * assistant. Assistants with `redact` cannot be used for SMS/WhatsApp messaging (that
         * combination is rejected with a 400 error); voice and web chat are unaffected.
         */
        fun piiRedaction(piiRedaction: PiiRedaction) = piiRedaction(JsonField.of(piiRedaction))

        /**
         * Sets [Builder.piiRedaction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.piiRedaction] with a well-typed [PiiRedaction] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun piiRedaction(piiRedaction: JsonField<PiiRedaction>) = apply {
            this.piiRedaction = piiRedaction
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
         * Returns an immutable instance of [PrivacySettings].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PrivacySettings =
            PrivacySettings(
                dataRetention,
                inTransitDataLocality,
                piiRedaction,
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
    fun validate(): PrivacySettings = apply {
        if (validated) {
            return@apply
        }

        dataRetention()
        inTransitDataLocality()
        piiRedaction().ifPresent { it.validate() }
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
        (if (dataRetention.asKnown().isPresent) 1 else 0) +
            (if (inTransitDataLocality.asKnown().isPresent) 1 else 0) +
            (piiRedaction.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * Controls redaction of personally identifiable information (PII) from the conversation history
     * that is stored for this assistant. `disabled` (default) stores content as-is. `redact`
     * replaces detected PII with `<PII:type/>` placeholders (e.g. `<PII:name/>`, `<PII:phone/>`) as
     * the stored copies are written: message content (user, assistant, and tool-result messages)
     * and tool-call arguments are redacted when written to conversation history, so the stored
     * transcript, its read-back via the history API, and any insights generated from the stored
     * messages contain the placeholders instead of the PII; response bodies returned by webhook
     * tools are redacted too, as stored in the webhook logs — a per-conversation record separate
     * from the transcript. In the Mission Control Portal this field appears as a "PII Redaction"
     * on/off toggle, where Enabled corresponds to `redact`. Redaction runs when the stored copy is
     * written, after the LLM has generated its reply: the live conversation is not redacted, the
     * assistant's tools keep receiving the full (unredacted) values during the call, and the LLM
     * still sees full content in its context window. Call recordings (including any recording
     * layout configured under telephony settings) and the payloads of messages/webhooks delivered
     * during the call are never redacted by this setting. The set of detected PII types (names,
     * street addresses, phone numbers, email addresses, government identifiers like SSN and
     * driver's license numbers, credit card and bank account numbers, IP addresses, dates of birth,
     * and other identifiers unique to a person) is fixed by Telnyx and cannot be configured or
     * extended per assistant. Assistants with `redact` cannot be used for SMS/WhatsApp messaging
     * (that combination is rejected with a 400 error); voice and web chat are unaffected.
     */
    class PiiRedaction @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val DISABLED = of("disabled")

            @JvmField val REDACT = of("redact")

            @JvmStatic fun of(value: String) = PiiRedaction(JsonField.of(value))
        }

        /** An enum containing [PiiRedaction]'s known values. */
        enum class Known {
            DISABLED,
            REDACT,
        }

        /**
         * An enum containing [PiiRedaction]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PiiRedaction] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DISABLED,
            REDACT,
            /**
             * An enum member indicating that [PiiRedaction] was instantiated with an unknown value.
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
                DISABLED -> Value.DISABLED
                REDACT -> Value.REDACT
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
                DISABLED -> Known.DISABLED
                REDACT -> Known.REDACT
                else -> throw TelnyxInvalidDataException("Unknown PiiRedaction: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): PiiRedaction = apply {
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

            return other is PiiRedaction && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PrivacySettings &&
            dataRetention == other.dataRetention &&
            inTransitDataLocality == other.inTransitDataLocality &&
            piiRedaction == other.piiRedaction &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(dataRetention, inTransitDataLocality, piiRedaction, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PrivacySettings{dataRetention=$dataRetention, inTransitDataLocality=$inTransitDataLocality, piiRedaction=$piiRedaction, additionalProperties=$additionalProperties}"
}
