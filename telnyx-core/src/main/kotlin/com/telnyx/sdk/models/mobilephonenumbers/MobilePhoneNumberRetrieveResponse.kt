// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.mobilephonenumbers

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class MobilePhoneNumberRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<Data>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<Data> = data.getOptional("data")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

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
         * Returns a mutable builder for constructing an instance of
         * [MobilePhoneNumberRetrieveResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MobilePhoneNumberRetrieveResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(mobilePhoneNumberRetrieveResponse: MobilePhoneNumberRetrieveResponse) =
            apply {
                data = mobilePhoneNumberRetrieveResponse.data
                additionalProperties =
                    mobilePhoneNumberRetrieveResponse.additionalProperties.toMutableMap()
            }

        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

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
         * Returns an immutable instance of [MobilePhoneNumberRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MobilePhoneNumberRetrieveResponse =
            MobilePhoneNumberRetrieveResponse(data, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): MobilePhoneNumberRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.validate() }
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
    @JvmSynthetic internal fun validity(): Int = (data.asKnown().getOrNull()?.validity() ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val callForwarding: JsonField<CallForwarding>,
        private val callRecording: JsonField<CallRecording>,
        private val callerIdNameEnabled: JsonField<Boolean>,
        private val cnamListing: JsonField<CnamListing>,
        private val connectionId: JsonField<String>,
        private val connectionName: JsonField<String>,
        private val connectionType: JsonField<String>,
        private val countryIsoAlpha2: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val customerReference: JsonField<String>,
        private val inbound: JsonField<Inbound>,
        private val inboundCallScreening: JsonField<InboundCallScreening>,
        private val mobileVoiceEnabled: JsonField<Boolean>,
        private val noiseSuppression: JsonField<NoiseSuppression>,
        private val outbound: JsonField<Outbound>,
        private val phoneNumber: JsonField<String>,
        private val recordType: JsonField<String>,
        private val simCardId: JsonField<String>,
        private val status: JsonField<String>,
        private val tags: JsonField<List<String>>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("call_forwarding")
            @ExcludeMissing
            callForwarding: JsonField<CallForwarding> = JsonMissing.of(),
            @JsonProperty("call_recording")
            @ExcludeMissing
            callRecording: JsonField<CallRecording> = JsonMissing.of(),
            @JsonProperty("caller_id_name_enabled")
            @ExcludeMissing
            callerIdNameEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("cnam_listing")
            @ExcludeMissing
            cnamListing: JsonField<CnamListing> = JsonMissing.of(),
            @JsonProperty("connection_id")
            @ExcludeMissing
            connectionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("connection_name")
            @ExcludeMissing
            connectionName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("connection_type")
            @ExcludeMissing
            connectionType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("country_iso_alpha2")
            @ExcludeMissing
            countryIsoAlpha2: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("customer_reference")
            @ExcludeMissing
            customerReference: JsonField<String> = JsonMissing.of(),
            @JsonProperty("inbound") @ExcludeMissing inbound: JsonField<Inbound> = JsonMissing.of(),
            @JsonProperty("inbound_call_screening")
            @ExcludeMissing
            inboundCallScreening: JsonField<InboundCallScreening> = JsonMissing.of(),
            @JsonProperty("mobile_voice_enabled")
            @ExcludeMissing
            mobileVoiceEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("noise_suppression")
            @ExcludeMissing
            noiseSuppression: JsonField<NoiseSuppression> = JsonMissing.of(),
            @JsonProperty("outbound")
            @ExcludeMissing
            outbound: JsonField<Outbound> = JsonMissing.of(),
            @JsonProperty("phone_number")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sim_card_id")
            @ExcludeMissing
            simCardId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            id,
            callForwarding,
            callRecording,
            callerIdNameEnabled,
            cnamListing,
            connectionId,
            connectionName,
            connectionType,
            countryIsoAlpha2,
            createdAt,
            customerReference,
            inbound,
            inboundCallScreening,
            mobileVoiceEnabled,
            noiseSuppression,
            outbound,
            phoneNumber,
            recordType,
            simCardId,
            status,
            tags,
            updatedAt,
            mutableMapOf(),
        )

        /**
         * Identifies the resource.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun callForwarding(): Optional<CallForwarding> =
            callForwarding.getOptional("call_forwarding")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun callRecording(): Optional<CallRecording> = callRecording.getOptional("call_recording")

        /**
         * Indicates if caller ID name is enabled.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun callerIdNameEnabled(): Optional<Boolean> =
            callerIdNameEnabled.getOptional("caller_id_name_enabled")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cnamListing(): Optional<CnamListing> = cnamListing.getOptional("cnam_listing")

        /**
         * The ID of the connection associated with this number.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun connectionId(): Optional<String> = connectionId.getOptional("connection_id")

        /**
         * The name of the connection.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun connectionName(): Optional<String> = connectionName.getOptional("connection_name")

        /**
         * The type of the connection.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun connectionType(): Optional<String> = connectionType.getOptional("connection_type")

        /**
         * The ISO 3166-1 alpha-2 country code of the number.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun countryIsoAlpha2(): Optional<String> =
            countryIsoAlpha2.getOptional("country_iso_alpha2")

        /**
         * ISO 8601 formatted date indicating when the resource was created.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

        /**
         * A customer reference string.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customerReference(): Optional<String> =
            customerReference.getOptional("customer_reference")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inbound(): Optional<Inbound> = inbound.getOptional("inbound")

        /**
         * The inbound call screening setting.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inboundCallScreening(): Optional<InboundCallScreening> =
            inboundCallScreening.getOptional("inbound_call_screening")

        /**
         * Indicates if mobile voice is enabled.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mobileVoiceEnabled(): Optional<Boolean> =
            mobileVoiceEnabled.getOptional("mobile_voice_enabled")

        /**
         * The noise suppression setting.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun noiseSuppression(): Optional<NoiseSuppression> =
            noiseSuppression.getOptional("noise_suppression")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun outbound(): Optional<Outbound> = outbound.getOptional("outbound")

        /**
         * The +E.164-formatted phone number.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

        /**
         * Identifies the type of the resource.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordType(): Optional<String> = recordType.getOptional("record_type")

        /**
         * The ID of the SIM card associated with this number.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun simCardId(): Optional<String> = simCardId.getOptional("sim_card_id")

        /**
         * The status of the phone number.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun status(): Optional<String> = status.getOptional("status")

        /**
         * A list of tags associated with the number.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tags(): Optional<List<String>> = tags.getOptional("tags")

        /**
         * ISO 8601 formatted date indicating when the resource was last updated.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [callForwarding].
         *
         * Unlike [callForwarding], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("call_forwarding")
        @ExcludeMissing
        fun _callForwarding(): JsonField<CallForwarding> = callForwarding

        /**
         * Returns the raw JSON value of [callRecording].
         *
         * Unlike [callRecording], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("call_recording")
        @ExcludeMissing
        fun _callRecording(): JsonField<CallRecording> = callRecording

        /**
         * Returns the raw JSON value of [callerIdNameEnabled].
         *
         * Unlike [callerIdNameEnabled], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("caller_id_name_enabled")
        @ExcludeMissing
        fun _callerIdNameEnabled(): JsonField<Boolean> = callerIdNameEnabled

        /**
         * Returns the raw JSON value of [cnamListing].
         *
         * Unlike [cnamListing], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cnam_listing")
        @ExcludeMissing
        fun _cnamListing(): JsonField<CnamListing> = cnamListing

        /**
         * Returns the raw JSON value of [connectionId].
         *
         * Unlike [connectionId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("connection_id")
        @ExcludeMissing
        fun _connectionId(): JsonField<String> = connectionId

        /**
         * Returns the raw JSON value of [connectionName].
         *
         * Unlike [connectionName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("connection_name")
        @ExcludeMissing
        fun _connectionName(): JsonField<String> = connectionName

        /**
         * Returns the raw JSON value of [connectionType].
         *
         * Unlike [connectionType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("connection_type")
        @ExcludeMissing
        fun _connectionType(): JsonField<String> = connectionType

        /**
         * Returns the raw JSON value of [countryIsoAlpha2].
         *
         * Unlike [countryIsoAlpha2], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("country_iso_alpha2")
        @ExcludeMissing
        fun _countryIsoAlpha2(): JsonField<String> = countryIsoAlpha2

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [customerReference].
         *
         * Unlike [customerReference], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("customer_reference")
        @ExcludeMissing
        fun _customerReference(): JsonField<String> = customerReference

        /**
         * Returns the raw JSON value of [inbound].
         *
         * Unlike [inbound], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("inbound") @ExcludeMissing fun _inbound(): JsonField<Inbound> = inbound

        /**
         * Returns the raw JSON value of [inboundCallScreening].
         *
         * Unlike [inboundCallScreening], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("inbound_call_screening")
        @ExcludeMissing
        fun _inboundCallScreening(): JsonField<InboundCallScreening> = inboundCallScreening

        /**
         * Returns the raw JSON value of [mobileVoiceEnabled].
         *
         * Unlike [mobileVoiceEnabled], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("mobile_voice_enabled")
        @ExcludeMissing
        fun _mobileVoiceEnabled(): JsonField<Boolean> = mobileVoiceEnabled

        /**
         * Returns the raw JSON value of [noiseSuppression].
         *
         * Unlike [noiseSuppression], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("noise_suppression")
        @ExcludeMissing
        fun _noiseSuppression(): JsonField<NoiseSuppression> = noiseSuppression

        /**
         * Returns the raw JSON value of [outbound].
         *
         * Unlike [outbound], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("outbound") @ExcludeMissing fun _outbound(): JsonField<Outbound> = outbound

        /**
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phone_number")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<String> = recordType

        /**
         * Returns the raw JSON value of [simCardId].
         *
         * Unlike [simCardId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sim_card_id") @ExcludeMissing fun _simCardId(): JsonField<String> = simCardId

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

        /**
         * Returns the raw JSON value of [tags].
         *
         * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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

            /** Returns a mutable builder for constructing an instance of [Data]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var callForwarding: JsonField<CallForwarding> = JsonMissing.of()
            private var callRecording: JsonField<CallRecording> = JsonMissing.of()
            private var callerIdNameEnabled: JsonField<Boolean> = JsonMissing.of()
            private var cnamListing: JsonField<CnamListing> = JsonMissing.of()
            private var connectionId: JsonField<String> = JsonMissing.of()
            private var connectionName: JsonField<String> = JsonMissing.of()
            private var connectionType: JsonField<String> = JsonMissing.of()
            private var countryIsoAlpha2: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var customerReference: JsonField<String> = JsonMissing.of()
            private var inbound: JsonField<Inbound> = JsonMissing.of()
            private var inboundCallScreening: JsonField<InboundCallScreening> = JsonMissing.of()
            private var mobileVoiceEnabled: JsonField<Boolean> = JsonMissing.of()
            private var noiseSuppression: JsonField<NoiseSuppression> = JsonMissing.of()
            private var outbound: JsonField<Outbound> = JsonMissing.of()
            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var recordType: JsonField<String> = JsonMissing.of()
            private var simCardId: JsonField<String> = JsonMissing.of()
            private var status: JsonField<String> = JsonMissing.of()
            private var tags: JsonField<MutableList<String>>? = null
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                callForwarding = data.callForwarding
                callRecording = data.callRecording
                callerIdNameEnabled = data.callerIdNameEnabled
                cnamListing = data.cnamListing
                connectionId = data.connectionId
                connectionName = data.connectionName
                connectionType = data.connectionType
                countryIsoAlpha2 = data.countryIsoAlpha2
                createdAt = data.createdAt
                customerReference = data.customerReference
                inbound = data.inbound
                inboundCallScreening = data.inboundCallScreening
                mobileVoiceEnabled = data.mobileVoiceEnabled
                noiseSuppression = data.noiseSuppression
                outbound = data.outbound
                phoneNumber = data.phoneNumber
                recordType = data.recordType
                simCardId = data.simCardId
                status = data.status
                tags = data.tags.map { it.toMutableList() }
                updatedAt = data.updatedAt
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Identifies the resource. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun callForwarding(callForwarding: CallForwarding) =
                callForwarding(JsonField.of(callForwarding))

            /**
             * Sets [Builder.callForwarding] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callForwarding] with a well-typed [CallForwarding]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun callForwarding(callForwarding: JsonField<CallForwarding>) = apply {
                this.callForwarding = callForwarding
            }

            fun callRecording(callRecording: CallRecording) =
                callRecording(JsonField.of(callRecording))

            /**
             * Sets [Builder.callRecording] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callRecording] with a well-typed [CallRecording]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun callRecording(callRecording: JsonField<CallRecording>) = apply {
                this.callRecording = callRecording
            }

            /** Indicates if caller ID name is enabled. */
            fun callerIdNameEnabled(callerIdNameEnabled: Boolean) =
                callerIdNameEnabled(JsonField.of(callerIdNameEnabled))

            /**
             * Sets [Builder.callerIdNameEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callerIdNameEnabled] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun callerIdNameEnabled(callerIdNameEnabled: JsonField<Boolean>) = apply {
                this.callerIdNameEnabled = callerIdNameEnabled
            }

            fun cnamListing(cnamListing: CnamListing) = cnamListing(JsonField.of(cnamListing))

            /**
             * Sets [Builder.cnamListing] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cnamListing] with a well-typed [CnamListing] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cnamListing(cnamListing: JsonField<CnamListing>) = apply {
                this.cnamListing = cnamListing
            }

            /** The ID of the connection associated with this number. */
            fun connectionId(connectionId: String?) =
                connectionId(JsonField.ofNullable(connectionId))

            /** Alias for calling [Builder.connectionId] with `connectionId.orElse(null)`. */
            fun connectionId(connectionId: Optional<String>) =
                connectionId(connectionId.getOrNull())

            /**
             * Sets [Builder.connectionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.connectionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun connectionId(connectionId: JsonField<String>) = apply {
                this.connectionId = connectionId
            }

            /** The name of the connection. */
            fun connectionName(connectionName: String?) =
                connectionName(JsonField.ofNullable(connectionName))

            /** Alias for calling [Builder.connectionName] with `connectionName.orElse(null)`. */
            fun connectionName(connectionName: Optional<String>) =
                connectionName(connectionName.getOrNull())

            /**
             * Sets [Builder.connectionName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.connectionName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun connectionName(connectionName: JsonField<String>) = apply {
                this.connectionName = connectionName
            }

            /** The type of the connection. */
            fun connectionType(connectionType: String?) =
                connectionType(JsonField.ofNullable(connectionType))

            /** Alias for calling [Builder.connectionType] with `connectionType.orElse(null)`. */
            fun connectionType(connectionType: Optional<String>) =
                connectionType(connectionType.getOrNull())

            /**
             * Sets [Builder.connectionType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.connectionType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun connectionType(connectionType: JsonField<String>) = apply {
                this.connectionType = connectionType
            }

            /** The ISO 3166-1 alpha-2 country code of the number. */
            fun countryIsoAlpha2(countryIsoAlpha2: String) =
                countryIsoAlpha2(JsonField.of(countryIsoAlpha2))

            /**
             * Sets [Builder.countryIsoAlpha2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.countryIsoAlpha2] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun countryIsoAlpha2(countryIsoAlpha2: JsonField<String>) = apply {
                this.countryIsoAlpha2 = countryIsoAlpha2
            }

            /** ISO 8601 formatted date indicating when the resource was created. */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** A customer reference string. */
            fun customerReference(customerReference: String?) =
                customerReference(JsonField.ofNullable(customerReference))

            /**
             * Alias for calling [Builder.customerReference] with `customerReference.orElse(null)`.
             */
            fun customerReference(customerReference: Optional<String>) =
                customerReference(customerReference.getOrNull())

            /**
             * Sets [Builder.customerReference] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerReference] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerReference(customerReference: JsonField<String>) = apply {
                this.customerReference = customerReference
            }

            fun inbound(inbound: Inbound) = inbound(JsonField.of(inbound))

            /**
             * Sets [Builder.inbound] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inbound] with a well-typed [Inbound] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inbound(inbound: JsonField<Inbound>) = apply { this.inbound = inbound }

            /** The inbound call screening setting. */
            fun inboundCallScreening(inboundCallScreening: InboundCallScreening?) =
                inboundCallScreening(JsonField.ofNullable(inboundCallScreening))

            /**
             * Alias for calling [Builder.inboundCallScreening] with
             * `inboundCallScreening.orElse(null)`.
             */
            fun inboundCallScreening(inboundCallScreening: Optional<InboundCallScreening>) =
                inboundCallScreening(inboundCallScreening.getOrNull())

            /**
             * Sets [Builder.inboundCallScreening] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inboundCallScreening] with a well-typed
             * [InboundCallScreening] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun inboundCallScreening(inboundCallScreening: JsonField<InboundCallScreening>) =
                apply {
                    this.inboundCallScreening = inboundCallScreening
                }

            /** Indicates if mobile voice is enabled. */
            fun mobileVoiceEnabled(mobileVoiceEnabled: Boolean) =
                mobileVoiceEnabled(JsonField.of(mobileVoiceEnabled))

            /**
             * Sets [Builder.mobileVoiceEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mobileVoiceEnabled] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun mobileVoiceEnabled(mobileVoiceEnabled: JsonField<Boolean>) = apply {
                this.mobileVoiceEnabled = mobileVoiceEnabled
            }

            /** The noise suppression setting. */
            fun noiseSuppression(noiseSuppression: NoiseSuppression) =
                noiseSuppression(JsonField.of(noiseSuppression))

            /**
             * Sets [Builder.noiseSuppression] to an arbitrary JSON value.
             *
             * You should usually call [Builder.noiseSuppression] with a well-typed
             * [NoiseSuppression] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun noiseSuppression(noiseSuppression: JsonField<NoiseSuppression>) = apply {
                this.noiseSuppression = noiseSuppression
            }

            fun outbound(outbound: Outbound) = outbound(JsonField.of(outbound))

            /**
             * Sets [Builder.outbound] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outbound] with a well-typed [Outbound] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun outbound(outbound: JsonField<Outbound>) = apply { this.outbound = outbound }

            /** The +E.164-formatted phone number. */
            fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

            /**
             * Sets [Builder.phoneNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                this.phoneNumber = phoneNumber
            }

            /** Identifies the type of the resource. */
            fun recordType(recordType: String) = recordType(JsonField.of(recordType))

            /**
             * Sets [Builder.recordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

            /** The ID of the SIM card associated with this number. */
            fun simCardId(simCardId: String) = simCardId(JsonField.of(simCardId))

            /**
             * Sets [Builder.simCardId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.simCardId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun simCardId(simCardId: JsonField<String>) = apply { this.simCardId = simCardId }

            /** The status of the phone number. */
            fun status(status: String) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<String>) = apply { this.status = status }

            /** A list of tags associated with the number. */
            fun tags(tags: List<String>) = tags(JsonField.of(tags))

            /**
             * Sets [Builder.tags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tags] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tags(tags: JsonField<List<String>>) = apply {
                this.tags = tags.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [tags].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTag(tag: String) = apply {
                tags =
                    (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
            }

            /** ISO 8601 formatted date indicating when the resource was last updated. */
            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Data =
                Data(
                    id,
                    callForwarding,
                    callRecording,
                    callerIdNameEnabled,
                    cnamListing,
                    connectionId,
                    connectionName,
                    connectionType,
                    countryIsoAlpha2,
                    createdAt,
                    customerReference,
                    inbound,
                    inboundCallScreening,
                    mobileVoiceEnabled,
                    noiseSuppression,
                    outbound,
                    phoneNumber,
                    recordType,
                    simCardId,
                    status,
                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                    updatedAt,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            id()
            callForwarding().ifPresent { it.validate() }
            callRecording().ifPresent { it.validate() }
            callerIdNameEnabled()
            cnamListing().ifPresent { it.validate() }
            connectionId()
            connectionName()
            connectionType()
            countryIsoAlpha2()
            createdAt()
            customerReference()
            inbound().ifPresent { it.validate() }
            inboundCallScreening().ifPresent { it.validate() }
            mobileVoiceEnabled()
            noiseSuppression().ifPresent { it.validate() }
            outbound().ifPresent { it.validate() }
            phoneNumber()
            recordType()
            simCardId()
            status()
            tags()
            updatedAt()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (id.asKnown().isPresent) 1 else 0) +
                (callForwarding.asKnown().getOrNull()?.validity() ?: 0) +
                (callRecording.asKnown().getOrNull()?.validity() ?: 0) +
                (if (callerIdNameEnabled.asKnown().isPresent) 1 else 0) +
                (cnamListing.asKnown().getOrNull()?.validity() ?: 0) +
                (if (connectionId.asKnown().isPresent) 1 else 0) +
                (if (connectionName.asKnown().isPresent) 1 else 0) +
                (if (connectionType.asKnown().isPresent) 1 else 0) +
                (if (countryIsoAlpha2.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (customerReference.asKnown().isPresent) 1 else 0) +
                (inbound.asKnown().getOrNull()?.validity() ?: 0) +
                (inboundCallScreening.asKnown().getOrNull()?.validity() ?: 0) +
                (if (mobileVoiceEnabled.asKnown().isPresent) 1 else 0) +
                (noiseSuppression.asKnown().getOrNull()?.validity() ?: 0) +
                (outbound.asKnown().getOrNull()?.validity() ?: 0) +
                (if (phoneNumber.asKnown().isPresent) 1 else 0) +
                (if (recordType.asKnown().isPresent) 1 else 0) +
                (if (simCardId.asKnown().isPresent) 1 else 0) +
                (if (status.asKnown().isPresent) 1 else 0) +
                (tags.asKnown().getOrNull()?.size ?: 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0)

        class CallForwarding
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val callForwardingEnabled: JsonField<Boolean>,
            private val forwardingType: JsonField<ForwardingType>,
            private val forwardsTo: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("call_forwarding_enabled")
                @ExcludeMissing
                callForwardingEnabled: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("forwarding_type")
                @ExcludeMissing
                forwardingType: JsonField<ForwardingType> = JsonMissing.of(),
                @JsonProperty("forwards_to")
                @ExcludeMissing
                forwardsTo: JsonField<String> = JsonMissing.of(),
            ) : this(callForwardingEnabled, forwardingType, forwardsTo, mutableMapOf())

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun callForwardingEnabled(): Optional<Boolean> =
                callForwardingEnabled.getOptional("call_forwarding_enabled")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun forwardingType(): Optional<ForwardingType> =
                forwardingType.getOptional("forwarding_type")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun forwardsTo(): Optional<String> = forwardsTo.getOptional("forwards_to")

            /**
             * Returns the raw JSON value of [callForwardingEnabled].
             *
             * Unlike [callForwardingEnabled], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("call_forwarding_enabled")
            @ExcludeMissing
            fun _callForwardingEnabled(): JsonField<Boolean> = callForwardingEnabled

            /**
             * Returns the raw JSON value of [forwardingType].
             *
             * Unlike [forwardingType], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("forwarding_type")
            @ExcludeMissing
            fun _forwardingType(): JsonField<ForwardingType> = forwardingType

            /**
             * Returns the raw JSON value of [forwardsTo].
             *
             * Unlike [forwardsTo], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("forwards_to")
            @ExcludeMissing
            fun _forwardsTo(): JsonField<String> = forwardsTo

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

                /** Returns a mutable builder for constructing an instance of [CallForwarding]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CallForwarding]. */
            class Builder internal constructor() {

                private var callForwardingEnabled: JsonField<Boolean> = JsonMissing.of()
                private var forwardingType: JsonField<ForwardingType> = JsonMissing.of()
                private var forwardsTo: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(callForwarding: CallForwarding) = apply {
                    callForwardingEnabled = callForwarding.callForwardingEnabled
                    forwardingType = callForwarding.forwardingType
                    forwardsTo = callForwarding.forwardsTo
                    additionalProperties = callForwarding.additionalProperties.toMutableMap()
                }

                fun callForwardingEnabled(callForwardingEnabled: Boolean) =
                    callForwardingEnabled(JsonField.of(callForwardingEnabled))

                /**
                 * Sets [Builder.callForwardingEnabled] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.callForwardingEnabled] with a well-typed
                 * [Boolean] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun callForwardingEnabled(callForwardingEnabled: JsonField<Boolean>) = apply {
                    this.callForwardingEnabled = callForwardingEnabled
                }

                fun forwardingType(forwardingType: ForwardingType?) =
                    forwardingType(JsonField.ofNullable(forwardingType))

                /**
                 * Alias for calling [Builder.forwardingType] with `forwardingType.orElse(null)`.
                 */
                fun forwardingType(forwardingType: Optional<ForwardingType>) =
                    forwardingType(forwardingType.getOrNull())

                /**
                 * Sets [Builder.forwardingType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.forwardingType] with a well-typed
                 * [ForwardingType] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun forwardingType(forwardingType: JsonField<ForwardingType>) = apply {
                    this.forwardingType = forwardingType
                }

                fun forwardsTo(forwardsTo: String?) = forwardsTo(JsonField.ofNullable(forwardsTo))

                /** Alias for calling [Builder.forwardsTo] with `forwardsTo.orElse(null)`. */
                fun forwardsTo(forwardsTo: Optional<String>) = forwardsTo(forwardsTo.getOrNull())

                /**
                 * Sets [Builder.forwardsTo] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.forwardsTo] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun forwardsTo(forwardsTo: JsonField<String>) = apply {
                    this.forwardsTo = forwardsTo
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [CallForwarding].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): CallForwarding =
                    CallForwarding(
                        callForwardingEnabled,
                        forwardingType,
                        forwardsTo,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): CallForwarding = apply {
                if (validated) {
                    return@apply
                }

                callForwardingEnabled()
                forwardingType().ifPresent { it.validate() }
                forwardsTo()
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
            @JvmSynthetic
            internal fun validity(): Int =
                (if (callForwardingEnabled.asKnown().isPresent) 1 else 0) +
                    (forwardingType.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (forwardsTo.asKnown().isPresent) 1 else 0)

            class ForwardingType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val ALWAYS = of("always")

                    @JvmField val ON_FAILURE = of("on-failure")

                    @JvmStatic fun of(value: String) = ForwardingType(JsonField.of(value))
                }

                /** An enum containing [ForwardingType]'s known values. */
                enum class Known {
                    ALWAYS,
                    ON_FAILURE,
                }

                /**
                 * An enum containing [ForwardingType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [ForwardingType] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ALWAYS,
                    ON_FAILURE,
                    /**
                     * An enum member indicating that [ForwardingType] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ALWAYS -> Value.ALWAYS
                        ON_FAILURE -> Value.ON_FAILURE
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        ALWAYS -> Known.ALWAYS
                        ON_FAILURE -> Known.ON_FAILURE
                        else -> throw TelnyxInvalidDataException("Unknown ForwardingType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): ForwardingType = apply {
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

                    return other is ForwardingType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CallForwarding &&
                    callForwardingEnabled == other.callForwardingEnabled &&
                    forwardingType == other.forwardingType &&
                    forwardsTo == other.forwardsTo &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    callForwardingEnabled,
                    forwardingType,
                    forwardsTo,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CallForwarding{callForwardingEnabled=$callForwardingEnabled, forwardingType=$forwardingType, forwardsTo=$forwardsTo, additionalProperties=$additionalProperties}"
        }

        class CallRecording
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val inboundCallRecordingChannels: JsonField<InboundCallRecordingChannels>,
            private val inboundCallRecordingEnabled: JsonField<Boolean>,
            private val inboundCallRecordingFormat: JsonField<InboundCallRecordingFormat>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("inbound_call_recording_channels")
                @ExcludeMissing
                inboundCallRecordingChannels: JsonField<InboundCallRecordingChannels> =
                    JsonMissing.of(),
                @JsonProperty("inbound_call_recording_enabled")
                @ExcludeMissing
                inboundCallRecordingEnabled: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("inbound_call_recording_format")
                @ExcludeMissing
                inboundCallRecordingFormat: JsonField<InboundCallRecordingFormat> = JsonMissing.of(),
            ) : this(
                inboundCallRecordingChannels,
                inboundCallRecordingEnabled,
                inboundCallRecordingFormat,
                mutableMapOf(),
            )

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun inboundCallRecordingChannels(): Optional<InboundCallRecordingChannels> =
                inboundCallRecordingChannels.getOptional("inbound_call_recording_channels")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun inboundCallRecordingEnabled(): Optional<Boolean> =
                inboundCallRecordingEnabled.getOptional("inbound_call_recording_enabled")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun inboundCallRecordingFormat(): Optional<InboundCallRecordingFormat> =
                inboundCallRecordingFormat.getOptional("inbound_call_recording_format")

            /**
             * Returns the raw JSON value of [inboundCallRecordingChannels].
             *
             * Unlike [inboundCallRecordingChannels], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("inbound_call_recording_channels")
            @ExcludeMissing
            fun _inboundCallRecordingChannels(): JsonField<InboundCallRecordingChannels> =
                inboundCallRecordingChannels

            /**
             * Returns the raw JSON value of [inboundCallRecordingEnabled].
             *
             * Unlike [inboundCallRecordingEnabled], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("inbound_call_recording_enabled")
            @ExcludeMissing
            fun _inboundCallRecordingEnabled(): JsonField<Boolean> = inboundCallRecordingEnabled

            /**
             * Returns the raw JSON value of [inboundCallRecordingFormat].
             *
             * Unlike [inboundCallRecordingFormat], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("inbound_call_recording_format")
            @ExcludeMissing
            fun _inboundCallRecordingFormat(): JsonField<InboundCallRecordingFormat> =
                inboundCallRecordingFormat

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

                /** Returns a mutable builder for constructing an instance of [CallRecording]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CallRecording]. */
            class Builder internal constructor() {

                private var inboundCallRecordingChannels: JsonField<InboundCallRecordingChannels> =
                    JsonMissing.of()
                private var inboundCallRecordingEnabled: JsonField<Boolean> = JsonMissing.of()
                private var inboundCallRecordingFormat: JsonField<InboundCallRecordingFormat> =
                    JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(callRecording: CallRecording) = apply {
                    inboundCallRecordingChannels = callRecording.inboundCallRecordingChannels
                    inboundCallRecordingEnabled = callRecording.inboundCallRecordingEnabled
                    inboundCallRecordingFormat = callRecording.inboundCallRecordingFormat
                    additionalProperties = callRecording.additionalProperties.toMutableMap()
                }

                fun inboundCallRecordingChannels(
                    inboundCallRecordingChannels: InboundCallRecordingChannels
                ) = inboundCallRecordingChannels(JsonField.of(inboundCallRecordingChannels))

                /**
                 * Sets [Builder.inboundCallRecordingChannels] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.inboundCallRecordingChannels] with a well-typed
                 * [InboundCallRecordingChannels] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun inboundCallRecordingChannels(
                    inboundCallRecordingChannels: JsonField<InboundCallRecordingChannels>
                ) = apply { this.inboundCallRecordingChannels = inboundCallRecordingChannels }

                fun inboundCallRecordingEnabled(inboundCallRecordingEnabled: Boolean) =
                    inboundCallRecordingEnabled(JsonField.of(inboundCallRecordingEnabled))

                /**
                 * Sets [Builder.inboundCallRecordingEnabled] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.inboundCallRecordingEnabled] with a well-typed
                 * [Boolean] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun inboundCallRecordingEnabled(inboundCallRecordingEnabled: JsonField<Boolean>) =
                    apply {
                        this.inboundCallRecordingEnabled = inboundCallRecordingEnabled
                    }

                fun inboundCallRecordingFormat(
                    inboundCallRecordingFormat: InboundCallRecordingFormat
                ) = inboundCallRecordingFormat(JsonField.of(inboundCallRecordingFormat))

                /**
                 * Sets [Builder.inboundCallRecordingFormat] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.inboundCallRecordingFormat] with a well-typed
                 * [InboundCallRecordingFormat] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun inboundCallRecordingFormat(
                    inboundCallRecordingFormat: JsonField<InboundCallRecordingFormat>
                ) = apply { this.inboundCallRecordingFormat = inboundCallRecordingFormat }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [CallRecording].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): CallRecording =
                    CallRecording(
                        inboundCallRecordingChannels,
                        inboundCallRecordingEnabled,
                        inboundCallRecordingFormat,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): CallRecording = apply {
                if (validated) {
                    return@apply
                }

                inboundCallRecordingChannels().ifPresent { it.validate() }
                inboundCallRecordingEnabled()
                inboundCallRecordingFormat().ifPresent { it.validate() }
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
            @JvmSynthetic
            internal fun validity(): Int =
                (inboundCallRecordingChannels.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (inboundCallRecordingEnabled.asKnown().isPresent) 1 else 0) +
                    (inboundCallRecordingFormat.asKnown().getOrNull()?.validity() ?: 0)

            class InboundCallRecordingChannels
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val SINGLE = of("single")

                    @JvmField val DUAL = of("dual")

                    @JvmStatic
                    fun of(value: String) = InboundCallRecordingChannels(JsonField.of(value))
                }

                /** An enum containing [InboundCallRecordingChannels]'s known values. */
                enum class Known {
                    SINGLE,
                    DUAL,
                }

                /**
                 * An enum containing [InboundCallRecordingChannels]'s known values, as well as an
                 * [_UNKNOWN] member.
                 *
                 * An instance of [InboundCallRecordingChannels] can contain an unknown value in a
                 * couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    SINGLE,
                    DUAL,
                    /**
                     * An enum member indicating that [InboundCallRecordingChannels] was
                     * instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        SINGLE -> Value.SINGLE
                        DUAL -> Value.DUAL
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        SINGLE -> Known.SINGLE
                        DUAL -> Known.DUAL
                        else ->
                            throw TelnyxInvalidDataException(
                                "Unknown InboundCallRecordingChannels: $value"
                            )
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): InboundCallRecordingChannels = apply {
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

                    return other is InboundCallRecordingChannels && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class InboundCallRecordingFormat
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val WAV = of("wav")

                    @JvmField val MP3 = of("mp3")

                    @JvmStatic
                    fun of(value: String) = InboundCallRecordingFormat(JsonField.of(value))
                }

                /** An enum containing [InboundCallRecordingFormat]'s known values. */
                enum class Known {
                    WAV,
                    MP3,
                }

                /**
                 * An enum containing [InboundCallRecordingFormat]'s known values, as well as an
                 * [_UNKNOWN] member.
                 *
                 * An instance of [InboundCallRecordingFormat] can contain an unknown value in a
                 * couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    WAV,
                    MP3,
                    /**
                     * An enum member indicating that [InboundCallRecordingFormat] was instantiated
                     * with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        WAV -> Value.WAV
                        MP3 -> Value.MP3
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        WAV -> Known.WAV
                        MP3 -> Known.MP3
                        else ->
                            throw TelnyxInvalidDataException(
                                "Unknown InboundCallRecordingFormat: $value"
                            )
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): InboundCallRecordingFormat = apply {
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

                    return other is InboundCallRecordingFormat && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CallRecording &&
                    inboundCallRecordingChannels == other.inboundCallRecordingChannels &&
                    inboundCallRecordingEnabled == other.inboundCallRecordingEnabled &&
                    inboundCallRecordingFormat == other.inboundCallRecordingFormat &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    inboundCallRecordingChannels,
                    inboundCallRecordingEnabled,
                    inboundCallRecordingFormat,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CallRecording{inboundCallRecordingChannels=$inboundCallRecordingChannels, inboundCallRecordingEnabled=$inboundCallRecordingEnabled, inboundCallRecordingFormat=$inboundCallRecordingFormat, additionalProperties=$additionalProperties}"
        }

        class CnamListing
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val cnamListingDetails: JsonField<String>,
            private val cnamListingEnabled: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("cnam_listing_details")
                @ExcludeMissing
                cnamListingDetails: JsonField<String> = JsonMissing.of(),
                @JsonProperty("cnam_listing_enabled")
                @ExcludeMissing
                cnamListingEnabled: JsonField<Boolean> = JsonMissing.of(),
            ) : this(cnamListingDetails, cnamListingEnabled, mutableMapOf())

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun cnamListingDetails(): Optional<String> =
                cnamListingDetails.getOptional("cnam_listing_details")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun cnamListingEnabled(): Optional<Boolean> =
                cnamListingEnabled.getOptional("cnam_listing_enabled")

            /**
             * Returns the raw JSON value of [cnamListingDetails].
             *
             * Unlike [cnamListingDetails], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("cnam_listing_details")
            @ExcludeMissing
            fun _cnamListingDetails(): JsonField<String> = cnamListingDetails

            /**
             * Returns the raw JSON value of [cnamListingEnabled].
             *
             * Unlike [cnamListingEnabled], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("cnam_listing_enabled")
            @ExcludeMissing
            fun _cnamListingEnabled(): JsonField<Boolean> = cnamListingEnabled

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

                /** Returns a mutable builder for constructing an instance of [CnamListing]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CnamListing]. */
            class Builder internal constructor() {

                private var cnamListingDetails: JsonField<String> = JsonMissing.of()
                private var cnamListingEnabled: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(cnamListing: CnamListing) = apply {
                    cnamListingDetails = cnamListing.cnamListingDetails
                    cnamListingEnabled = cnamListing.cnamListingEnabled
                    additionalProperties = cnamListing.additionalProperties.toMutableMap()
                }

                fun cnamListingDetails(cnamListingDetails: String?) =
                    cnamListingDetails(JsonField.ofNullable(cnamListingDetails))

                /**
                 * Alias for calling [Builder.cnamListingDetails] with
                 * `cnamListingDetails.orElse(null)`.
                 */
                fun cnamListingDetails(cnamListingDetails: Optional<String>) =
                    cnamListingDetails(cnamListingDetails.getOrNull())

                /**
                 * Sets [Builder.cnamListingDetails] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cnamListingDetails] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun cnamListingDetails(cnamListingDetails: JsonField<String>) = apply {
                    this.cnamListingDetails = cnamListingDetails
                }

                fun cnamListingEnabled(cnamListingEnabled: Boolean) =
                    cnamListingEnabled(JsonField.of(cnamListingEnabled))

                /**
                 * Sets [Builder.cnamListingEnabled] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cnamListingEnabled] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun cnamListingEnabled(cnamListingEnabled: JsonField<Boolean>) = apply {
                    this.cnamListingEnabled = cnamListingEnabled
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [CnamListing].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): CnamListing =
                    CnamListing(
                        cnamListingDetails,
                        cnamListingEnabled,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): CnamListing = apply {
                if (validated) {
                    return@apply
                }

                cnamListingDetails()
                cnamListingEnabled()
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
            @JvmSynthetic
            internal fun validity(): Int =
                (if (cnamListingDetails.asKnown().isPresent) 1 else 0) +
                    (if (cnamListingEnabled.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CnamListing &&
                    cnamListingDetails == other.cnamListingDetails &&
                    cnamListingEnabled == other.cnamListingEnabled &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(cnamListingDetails, cnamListingEnabled, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CnamListing{cnamListingDetails=$cnamListingDetails, cnamListingEnabled=$cnamListingEnabled, additionalProperties=$additionalProperties}"
        }

        class Inbound
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val interceptionAppId: JsonField<String>,
            private val interceptionAppName: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("interception_app_id")
                @ExcludeMissing
                interceptionAppId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("interception_app_name")
                @ExcludeMissing
                interceptionAppName: JsonField<String> = JsonMissing.of(),
            ) : this(interceptionAppId, interceptionAppName, mutableMapOf())

            /**
             * The ID of the app that will intercept inbound calls.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun interceptionAppId(): Optional<String> =
                interceptionAppId.getOptional("interception_app_id")

            /**
             * The name of the app that will intercept inbound calls.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun interceptionAppName(): Optional<String> =
                interceptionAppName.getOptional("interception_app_name")

            /**
             * Returns the raw JSON value of [interceptionAppId].
             *
             * Unlike [interceptionAppId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("interception_app_id")
            @ExcludeMissing
            fun _interceptionAppId(): JsonField<String> = interceptionAppId

            /**
             * Returns the raw JSON value of [interceptionAppName].
             *
             * Unlike [interceptionAppName], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("interception_app_name")
            @ExcludeMissing
            fun _interceptionAppName(): JsonField<String> = interceptionAppName

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

                /** Returns a mutable builder for constructing an instance of [Inbound]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Inbound]. */
            class Builder internal constructor() {

                private var interceptionAppId: JsonField<String> = JsonMissing.of()
                private var interceptionAppName: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(inbound: Inbound) = apply {
                    interceptionAppId = inbound.interceptionAppId
                    interceptionAppName = inbound.interceptionAppName
                    additionalProperties = inbound.additionalProperties.toMutableMap()
                }

                /** The ID of the app that will intercept inbound calls. */
                fun interceptionAppId(interceptionAppId: String?) =
                    interceptionAppId(JsonField.ofNullable(interceptionAppId))

                /**
                 * Alias for calling [Builder.interceptionAppId] with
                 * `interceptionAppId.orElse(null)`.
                 */
                fun interceptionAppId(interceptionAppId: Optional<String>) =
                    interceptionAppId(interceptionAppId.getOrNull())

                /**
                 * Sets [Builder.interceptionAppId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.interceptionAppId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun interceptionAppId(interceptionAppId: JsonField<String>) = apply {
                    this.interceptionAppId = interceptionAppId
                }

                /** The name of the app that will intercept inbound calls. */
                fun interceptionAppName(interceptionAppName: String?) =
                    interceptionAppName(JsonField.ofNullable(interceptionAppName))

                /**
                 * Alias for calling [Builder.interceptionAppName] with
                 * `interceptionAppName.orElse(null)`.
                 */
                fun interceptionAppName(interceptionAppName: Optional<String>) =
                    interceptionAppName(interceptionAppName.getOrNull())

                /**
                 * Sets [Builder.interceptionAppName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.interceptionAppName] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun interceptionAppName(interceptionAppName: JsonField<String>) = apply {
                    this.interceptionAppName = interceptionAppName
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Inbound].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Inbound =
                    Inbound(
                        interceptionAppId,
                        interceptionAppName,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Inbound = apply {
                if (validated) {
                    return@apply
                }

                interceptionAppId()
                interceptionAppName()
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
            @JvmSynthetic
            internal fun validity(): Int =
                (if (interceptionAppId.asKnown().isPresent) 1 else 0) +
                    (if (interceptionAppName.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Inbound &&
                    interceptionAppId == other.interceptionAppId &&
                    interceptionAppName == other.interceptionAppName &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(interceptionAppId, interceptionAppName, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Inbound{interceptionAppId=$interceptionAppId, interceptionAppName=$interceptionAppName, additionalProperties=$additionalProperties}"
        }

        /** The inbound call screening setting. */
        class InboundCallScreening
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val DISABLED = of("disabled")

                @JvmField val REJECT_CALLS = of("reject_calls")

                @JvmField val FLAG_CALLS = of("flag_calls")

                @JvmStatic fun of(value: String) = InboundCallScreening(JsonField.of(value))
            }

            /** An enum containing [InboundCallScreening]'s known values. */
            enum class Known {
                DISABLED,
                REJECT_CALLS,
                FLAG_CALLS,
            }

            /**
             * An enum containing [InboundCallScreening]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [InboundCallScreening] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DISABLED,
                REJECT_CALLS,
                FLAG_CALLS,
                /**
                 * An enum member indicating that [InboundCallScreening] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    DISABLED -> Value.DISABLED
                    REJECT_CALLS -> Value.REJECT_CALLS
                    FLAG_CALLS -> Value.FLAG_CALLS
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    DISABLED -> Known.DISABLED
                    REJECT_CALLS -> Known.REJECT_CALLS
                    FLAG_CALLS -> Known.FLAG_CALLS
                    else -> throw TelnyxInvalidDataException("Unknown InboundCallScreening: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): InboundCallScreening = apply {
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

                return other is InboundCallScreening && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The noise suppression setting. */
        class NoiseSuppression
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val INBOUND = of("inbound")

                @JvmField val OUTBOUND = of("outbound")

                @JvmField val BOTH = of("both")

                @JvmField val DISABLED = of("disabled")

                @JvmStatic fun of(value: String) = NoiseSuppression(JsonField.of(value))
            }

            /** An enum containing [NoiseSuppression]'s known values. */
            enum class Known {
                INBOUND,
                OUTBOUND,
                BOTH,
                DISABLED,
            }

            /**
             * An enum containing [NoiseSuppression]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [NoiseSuppression] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                INBOUND,
                OUTBOUND,
                BOTH,
                DISABLED,
                /**
                 * An enum member indicating that [NoiseSuppression] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    INBOUND -> Value.INBOUND
                    OUTBOUND -> Value.OUTBOUND
                    BOTH -> Value.BOTH
                    DISABLED -> Value.DISABLED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    INBOUND -> Known.INBOUND
                    OUTBOUND -> Known.OUTBOUND
                    BOTH -> Known.BOTH
                    DISABLED -> Known.DISABLED
                    else -> throw TelnyxInvalidDataException("Unknown NoiseSuppression: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): NoiseSuppression = apply {
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

                return other is NoiseSuppression && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Outbound
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val interceptionAppId: JsonField<String>,
            private val interceptionAppName: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("interception_app_id")
                @ExcludeMissing
                interceptionAppId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("interception_app_name")
                @ExcludeMissing
                interceptionAppName: JsonField<String> = JsonMissing.of(),
            ) : this(interceptionAppId, interceptionAppName, mutableMapOf())

            /**
             * The ID of the app that will intercept outbound calls.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun interceptionAppId(): Optional<String> =
                interceptionAppId.getOptional("interception_app_id")

            /**
             * The name of the app that will intercept outbound calls.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun interceptionAppName(): Optional<String> =
                interceptionAppName.getOptional("interception_app_name")

            /**
             * Returns the raw JSON value of [interceptionAppId].
             *
             * Unlike [interceptionAppId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("interception_app_id")
            @ExcludeMissing
            fun _interceptionAppId(): JsonField<String> = interceptionAppId

            /**
             * Returns the raw JSON value of [interceptionAppName].
             *
             * Unlike [interceptionAppName], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("interception_app_name")
            @ExcludeMissing
            fun _interceptionAppName(): JsonField<String> = interceptionAppName

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

                /** Returns a mutable builder for constructing an instance of [Outbound]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Outbound]. */
            class Builder internal constructor() {

                private var interceptionAppId: JsonField<String> = JsonMissing.of()
                private var interceptionAppName: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(outbound: Outbound) = apply {
                    interceptionAppId = outbound.interceptionAppId
                    interceptionAppName = outbound.interceptionAppName
                    additionalProperties = outbound.additionalProperties.toMutableMap()
                }

                /** The ID of the app that will intercept outbound calls. */
                fun interceptionAppId(interceptionAppId: String?) =
                    interceptionAppId(JsonField.ofNullable(interceptionAppId))

                /**
                 * Alias for calling [Builder.interceptionAppId] with
                 * `interceptionAppId.orElse(null)`.
                 */
                fun interceptionAppId(interceptionAppId: Optional<String>) =
                    interceptionAppId(interceptionAppId.getOrNull())

                /**
                 * Sets [Builder.interceptionAppId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.interceptionAppId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun interceptionAppId(interceptionAppId: JsonField<String>) = apply {
                    this.interceptionAppId = interceptionAppId
                }

                /** The name of the app that will intercept outbound calls. */
                fun interceptionAppName(interceptionAppName: String?) =
                    interceptionAppName(JsonField.ofNullable(interceptionAppName))

                /**
                 * Alias for calling [Builder.interceptionAppName] with
                 * `interceptionAppName.orElse(null)`.
                 */
                fun interceptionAppName(interceptionAppName: Optional<String>) =
                    interceptionAppName(interceptionAppName.getOrNull())

                /**
                 * Sets [Builder.interceptionAppName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.interceptionAppName] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun interceptionAppName(interceptionAppName: JsonField<String>) = apply {
                    this.interceptionAppName = interceptionAppName
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Outbound].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Outbound =
                    Outbound(
                        interceptionAppId,
                        interceptionAppName,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Outbound = apply {
                if (validated) {
                    return@apply
                }

                interceptionAppId()
                interceptionAppName()
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
            @JvmSynthetic
            internal fun validity(): Int =
                (if (interceptionAppId.asKnown().isPresent) 1 else 0) +
                    (if (interceptionAppName.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Outbound &&
                    interceptionAppId == other.interceptionAppId &&
                    interceptionAppName == other.interceptionAppName &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(interceptionAppId, interceptionAppName, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Outbound{interceptionAppId=$interceptionAppId, interceptionAppName=$interceptionAppName, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                id == other.id &&
                callForwarding == other.callForwarding &&
                callRecording == other.callRecording &&
                callerIdNameEnabled == other.callerIdNameEnabled &&
                cnamListing == other.cnamListing &&
                connectionId == other.connectionId &&
                connectionName == other.connectionName &&
                connectionType == other.connectionType &&
                countryIsoAlpha2 == other.countryIsoAlpha2 &&
                createdAt == other.createdAt &&
                customerReference == other.customerReference &&
                inbound == other.inbound &&
                inboundCallScreening == other.inboundCallScreening &&
                mobileVoiceEnabled == other.mobileVoiceEnabled &&
                noiseSuppression == other.noiseSuppression &&
                outbound == other.outbound &&
                phoneNumber == other.phoneNumber &&
                recordType == other.recordType &&
                simCardId == other.simCardId &&
                status == other.status &&
                tags == other.tags &&
                updatedAt == other.updatedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                callForwarding,
                callRecording,
                callerIdNameEnabled,
                cnamListing,
                connectionId,
                connectionName,
                connectionType,
                countryIsoAlpha2,
                createdAt,
                customerReference,
                inbound,
                inboundCallScreening,
                mobileVoiceEnabled,
                noiseSuppression,
                outbound,
                phoneNumber,
                recordType,
                simCardId,
                status,
                tags,
                updatedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, callForwarding=$callForwarding, callRecording=$callRecording, callerIdNameEnabled=$callerIdNameEnabled, cnamListing=$cnamListing, connectionId=$connectionId, connectionName=$connectionName, connectionType=$connectionType, countryIsoAlpha2=$countryIsoAlpha2, createdAt=$createdAt, customerReference=$customerReference, inbound=$inbound, inboundCallScreening=$inboundCallScreening, mobileVoiceEnabled=$mobileVoiceEnabled, noiseSuppression=$noiseSuppression, outbound=$outbound, phoneNumber=$phoneNumber, recordType=$recordType, simCardId=$simCardId, status=$status, tags=$tags, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MobilePhoneNumberRetrieveResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MobilePhoneNumberRetrieveResponse{data=$data, additionalProperties=$additionalProperties}"
}
