// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

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

class PrivacySettings
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val dataRetention: JsonField<Boolean>,
    private val inTransitDataLocality: JsonField<Boolean>,
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
    ) : this(dataRetention, inTransitDataLocality, mutableMapOf())

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
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(privacySettings: PrivacySettings) = apply {
            dataRetention = privacySettings.dataRetention
            inTransitDataLocality = privacySettings.inTransitDataLocality
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
            (if (inTransitDataLocality.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PrivacySettings &&
            dataRetention == other.dataRetention &&
            inTransitDataLocality == other.inTransitDataLocality &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(dataRetention, inTransitDataLocality, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PrivacySettings{dataRetention=$dataRetention, inTransitDataLocality=$inTransitDataLocality, additionalProperties=$additionalProperties}"
}
