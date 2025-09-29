// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.legacy.reporting.batchdetailrecords.voice

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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Available CDR report fields grouped by category */
class VoiceRetrieveFieldsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val billing: JsonField<List<String>>,
    private val interactionData: JsonField<List<String>>,
    private val numberInformation: JsonField<List<String>>,
    private val telephonyData: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("Billing")
        @ExcludeMissing
        billing: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("Interaction Data")
        @ExcludeMissing
        interactionData: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("Number Information")
        @ExcludeMissing
        numberInformation: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("Telephony Data")
        @ExcludeMissing
        telephonyData: JsonField<List<String>> = JsonMissing.of(),
    ) : this(billing, interactionData, numberInformation, telephonyData, mutableMapOf())

    /**
     * Cost and billing related information
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billing(): Optional<List<String>> = billing.getOptional("Billing")

    /**
     * Fields related to call interaction and basic call information
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun interactionData(): Optional<List<String>> = interactionData.getOptional("Interaction Data")

    /**
     * Geographic and routing information for phone numbers
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun numberInformation(): Optional<List<String>> =
        numberInformation.getOptional("Number Information")

    /**
     * Technical telephony and call control information
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun telephonyData(): Optional<List<String>> = telephonyData.getOptional("Telephony Data")

    /**
     * Returns the raw JSON value of [billing].
     *
     * Unlike [billing], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("Billing") @ExcludeMissing fun _billing(): JsonField<List<String>> = billing

    /**
     * Returns the raw JSON value of [interactionData].
     *
     * Unlike [interactionData], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("Interaction Data")
    @ExcludeMissing
    fun _interactionData(): JsonField<List<String>> = interactionData

    /**
     * Returns the raw JSON value of [numberInformation].
     *
     * Unlike [numberInformation], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("Number Information")
    @ExcludeMissing
    fun _numberInformation(): JsonField<List<String>> = numberInformation

    /**
     * Returns the raw JSON value of [telephonyData].
     *
     * Unlike [telephonyData], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("Telephony Data")
    @ExcludeMissing
    fun _telephonyData(): JsonField<List<String>> = telephonyData

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
         * Returns a mutable builder for constructing an instance of [VoiceRetrieveFieldsResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VoiceRetrieveFieldsResponse]. */
    class Builder internal constructor() {

        private var billing: JsonField<MutableList<String>>? = null
        private var interactionData: JsonField<MutableList<String>>? = null
        private var numberInformation: JsonField<MutableList<String>>? = null
        private var telephonyData: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(voiceRetrieveFieldsResponse: VoiceRetrieveFieldsResponse) = apply {
            billing = voiceRetrieveFieldsResponse.billing.map { it.toMutableList() }
            interactionData = voiceRetrieveFieldsResponse.interactionData.map { it.toMutableList() }
            numberInformation =
                voiceRetrieveFieldsResponse.numberInformation.map { it.toMutableList() }
            telephonyData = voiceRetrieveFieldsResponse.telephonyData.map { it.toMutableList() }
            additionalProperties = voiceRetrieveFieldsResponse.additionalProperties.toMutableMap()
        }

        /** Cost and billing related information */
        fun billing(billing: List<String>) = billing(JsonField.of(billing))

        /**
         * Sets [Builder.billing] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billing] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun billing(billing: JsonField<List<String>>) = apply {
            this.billing = billing.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.billing].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBilling(billing: String) = apply {
            this.billing =
                (this.billing ?: JsonField.of(mutableListOf())).also {
                    checkKnown("billing", it).add(billing)
                }
        }

        /** Fields related to call interaction and basic call information */
        fun interactionData(interactionData: List<String>) =
            interactionData(JsonField.of(interactionData))

        /**
         * Sets [Builder.interactionData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.interactionData] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun interactionData(interactionData: JsonField<List<String>>) = apply {
            this.interactionData = interactionData.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.interactionData].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addInteractionData(interactionData: String) = apply {
            this.interactionData =
                (this.interactionData ?: JsonField.of(mutableListOf())).also {
                    checkKnown("interactionData", it).add(interactionData)
                }
        }

        /** Geographic and routing information for phone numbers */
        fun numberInformation(numberInformation: List<String>) =
            numberInformation(JsonField.of(numberInformation))

        /**
         * Sets [Builder.numberInformation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numberInformation] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun numberInformation(numberInformation: JsonField<List<String>>) = apply {
            this.numberInformation = numberInformation.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.numberInformation].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addNumberInformation(numberInformation: String) = apply {
            this.numberInformation =
                (this.numberInformation ?: JsonField.of(mutableListOf())).also {
                    checkKnown("numberInformation", it).add(numberInformation)
                }
        }

        /** Technical telephony and call control information */
        fun telephonyData(telephonyData: List<String>) = telephonyData(JsonField.of(telephonyData))

        /**
         * Sets [Builder.telephonyData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.telephonyData] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun telephonyData(telephonyData: JsonField<List<String>>) = apply {
            this.telephonyData = telephonyData.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.telephonyData].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTelephonyData(telephonyData: String) = apply {
            this.telephonyData =
                (this.telephonyData ?: JsonField.of(mutableListOf())).also {
                    checkKnown("telephonyData", it).add(telephonyData)
                }
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
         * Returns an immutable instance of [VoiceRetrieveFieldsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): VoiceRetrieveFieldsResponse =
            VoiceRetrieveFieldsResponse(
                (billing ?: JsonMissing.of()).map { it.toImmutable() },
                (interactionData ?: JsonMissing.of()).map { it.toImmutable() },
                (numberInformation ?: JsonMissing.of()).map { it.toImmutable() },
                (telephonyData ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): VoiceRetrieveFieldsResponse = apply {
        if (validated) {
            return@apply
        }

        billing()
        interactionData()
        numberInformation()
        telephonyData()
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
        (billing.asKnown().getOrNull()?.size ?: 0) +
            (interactionData.asKnown().getOrNull()?.size ?: 0) +
            (numberInformation.asKnown().getOrNull()?.size ?: 0) +
            (telephonyData.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VoiceRetrieveFieldsResponse &&
            billing == other.billing &&
            interactionData == other.interactionData &&
            numberInformation == other.numberInformation &&
            telephonyData == other.telephonyData &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            billing,
            interactionData,
            numberInformation,
            telephonyData,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VoiceRetrieveFieldsResponse{billing=$billing, interactionData=$interactionData, numberInformation=$numberInformation, telephonyData=$telephonyData, additionalProperties=$additionalProperties}"
}
