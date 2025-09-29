// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.phonenumbers.actions

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
import com.telnyx.api.models.phonenumbers.voice.CallForwarding
import com.telnyx.api.models.phonenumbers.voice.CallRecording
import com.telnyx.api.models.phonenumbers.voice.CnamListing
import com.telnyx.api.models.phonenumbers.voice.MediaFeatures
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PhoneNumberWithVoiceSettings
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val callForwarding: JsonField<CallForwarding>,
    private val callRecording: JsonField<CallRecording>,
    private val cnamListing: JsonField<CnamListing>,
    private val connectionId: JsonField<String>,
    private val customerReference: JsonField<String>,
    private val emergency: JsonField<Emergency>,
    private val inboundCallScreening: JsonField<InboundCallScreening>,
    private val mediaFeatures: JsonField<MediaFeatures>,
    private val phoneNumber: JsonField<String>,
    private val recordType: JsonField<String>,
    private val techPrefixEnabled: JsonField<Boolean>,
    private val translatedNumber: JsonField<String>,
    private val usagePaymentMethod: JsonField<UsagePaymentMethod>,
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
        @JsonProperty("cnam_listing")
        @ExcludeMissing
        cnamListing: JsonField<CnamListing> = JsonMissing.of(),
        @JsonProperty("connection_id")
        @ExcludeMissing
        connectionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customer_reference")
        @ExcludeMissing
        customerReference: JsonField<String> = JsonMissing.of(),
        @JsonProperty("emergency")
        @ExcludeMissing
        emergency: JsonField<Emergency> = JsonMissing.of(),
        @JsonProperty("inbound_call_screening")
        @ExcludeMissing
        inboundCallScreening: JsonField<InboundCallScreening> = JsonMissing.of(),
        @JsonProperty("media_features")
        @ExcludeMissing
        mediaFeatures: JsonField<MediaFeatures> = JsonMissing.of(),
        @JsonProperty("phone_number")
        @ExcludeMissing
        phoneNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tech_prefix_enabled")
        @ExcludeMissing
        techPrefixEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("translated_number")
        @ExcludeMissing
        translatedNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("usage_payment_method")
        @ExcludeMissing
        usagePaymentMethod: JsonField<UsagePaymentMethod> = JsonMissing.of(),
    ) : this(
        id,
        callForwarding,
        callRecording,
        cnamListing,
        connectionId,
        customerReference,
        emergency,
        inboundCallScreening,
        mediaFeatures,
        phoneNumber,
        recordType,
        techPrefixEnabled,
        translatedNumber,
        usagePaymentMethod,
        mutableMapOf(),
    )

    /**
     * Identifies the type of resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * The call forwarding settings for a phone number.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callForwarding(): Optional<CallForwarding> = callForwarding.getOptional("call_forwarding")

    /**
     * The call recording settings for a phone number.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callRecording(): Optional<CallRecording> = callRecording.getOptional("call_recording")

    /**
     * The CNAM listing settings for a phone number.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cnamListing(): Optional<CnamListing> = cnamListing.getOptional("cnam_listing")

    /**
     * Identifies the connection associated with this phone number.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun connectionId(): Optional<String> = connectionId.getOptional("connection_id")

    /**
     * A customer reference string for customer look ups.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customerReference(): Optional<String> = customerReference.getOptional("customer_reference")

    /**
     * The emergency services settings for a phone number.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun emergency(): Optional<Emergency> = emergency.getOptional("emergency")

    /**
     * The inbound_call_screening setting is a phone number configuration option variable that
     * allows users to configure their settings to block or flag fraudulent calls. It can be set to
     * disabled, reject_calls, or flag_calls. This feature has an additional per-number monthly cost
     * associated with it.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inboundCallScreening(): Optional<InboundCallScreening> =
        inboundCallScreening.getOptional("inbound_call_screening")

    /**
     * The media features settings for a phone number.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mediaFeatures(): Optional<MediaFeatures> = mediaFeatures.getOptional("media_features")

    /**
     * The phone number in +E164 format.
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
     * Controls whether a tech prefix is enabled for this phone number.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun techPrefixEnabled(): Optional<Boolean> =
        techPrefixEnabled.getOptional("tech_prefix_enabled")

    /**
     * This field allows you to rewrite the destination number of an inbound call before the call is
     * routed to you. The value of this field may be any alphanumeric value, and the value will
     * replace the number originally dialed.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun translatedNumber(): Optional<String> = translatedNumber.getOptional("translated_number")

    /**
     * Controls whether a number is billed per minute or uses your concurrent channels.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun usagePaymentMethod(): Optional<UsagePaymentMethod> =
        usagePaymentMethod.getOptional("usage_payment_method")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [callForwarding].
     *
     * Unlike [callForwarding], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("call_forwarding")
    @ExcludeMissing
    fun _callForwarding(): JsonField<CallForwarding> = callForwarding

    /**
     * Returns the raw JSON value of [callRecording].
     *
     * Unlike [callRecording], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("call_recording")
    @ExcludeMissing
    fun _callRecording(): JsonField<CallRecording> = callRecording

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
     * Unlike [connectionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("connection_id")
    @ExcludeMissing
    fun _connectionId(): JsonField<String> = connectionId

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
     * Returns the raw JSON value of [emergency].
     *
     * Unlike [emergency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("emergency") @ExcludeMissing fun _emergency(): JsonField<Emergency> = emergency

    /**
     * Returns the raw JSON value of [inboundCallScreening].
     *
     * Unlike [inboundCallScreening], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("inbound_call_screening")
    @ExcludeMissing
    fun _inboundCallScreening(): JsonField<InboundCallScreening> = inboundCallScreening

    /**
     * Returns the raw JSON value of [mediaFeatures].
     *
     * Unlike [mediaFeatures], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("media_features")
    @ExcludeMissing
    fun _mediaFeatures(): JsonField<MediaFeatures> = mediaFeatures

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
    @JsonProperty("record_type") @ExcludeMissing fun _recordType(): JsonField<String> = recordType

    /**
     * Returns the raw JSON value of [techPrefixEnabled].
     *
     * Unlike [techPrefixEnabled], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("tech_prefix_enabled")
    @ExcludeMissing
    fun _techPrefixEnabled(): JsonField<Boolean> = techPrefixEnabled

    /**
     * Returns the raw JSON value of [translatedNumber].
     *
     * Unlike [translatedNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("translated_number")
    @ExcludeMissing
    fun _translatedNumber(): JsonField<String> = translatedNumber

    /**
     * Returns the raw JSON value of [usagePaymentMethod].
     *
     * Unlike [usagePaymentMethod], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("usage_payment_method")
    @ExcludeMissing
    fun _usagePaymentMethod(): JsonField<UsagePaymentMethod> = usagePaymentMethod

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
         * Returns a mutable builder for constructing an instance of [PhoneNumberWithVoiceSettings].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PhoneNumberWithVoiceSettings]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var callForwarding: JsonField<CallForwarding> = JsonMissing.of()
        private var callRecording: JsonField<CallRecording> = JsonMissing.of()
        private var cnamListing: JsonField<CnamListing> = JsonMissing.of()
        private var connectionId: JsonField<String> = JsonMissing.of()
        private var customerReference: JsonField<String> = JsonMissing.of()
        private var emergency: JsonField<Emergency> = JsonMissing.of()
        private var inboundCallScreening: JsonField<InboundCallScreening> = JsonMissing.of()
        private var mediaFeatures: JsonField<MediaFeatures> = JsonMissing.of()
        private var phoneNumber: JsonField<String> = JsonMissing.of()
        private var recordType: JsonField<String> = JsonMissing.of()
        private var techPrefixEnabled: JsonField<Boolean> = JsonMissing.of()
        private var translatedNumber: JsonField<String> = JsonMissing.of()
        private var usagePaymentMethod: JsonField<UsagePaymentMethod> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(phoneNumberWithVoiceSettings: PhoneNumberWithVoiceSettings) = apply {
            id = phoneNumberWithVoiceSettings.id
            callForwarding = phoneNumberWithVoiceSettings.callForwarding
            callRecording = phoneNumberWithVoiceSettings.callRecording
            cnamListing = phoneNumberWithVoiceSettings.cnamListing
            connectionId = phoneNumberWithVoiceSettings.connectionId
            customerReference = phoneNumberWithVoiceSettings.customerReference
            emergency = phoneNumberWithVoiceSettings.emergency
            inboundCallScreening = phoneNumberWithVoiceSettings.inboundCallScreening
            mediaFeatures = phoneNumberWithVoiceSettings.mediaFeatures
            phoneNumber = phoneNumberWithVoiceSettings.phoneNumber
            recordType = phoneNumberWithVoiceSettings.recordType
            techPrefixEnabled = phoneNumberWithVoiceSettings.techPrefixEnabled
            translatedNumber = phoneNumberWithVoiceSettings.translatedNumber
            usagePaymentMethod = phoneNumberWithVoiceSettings.usagePaymentMethod
            additionalProperties = phoneNumberWithVoiceSettings.additionalProperties.toMutableMap()
        }

        /** Identifies the type of resource. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The call forwarding settings for a phone number. */
        fun callForwarding(callForwarding: CallForwarding) =
            callForwarding(JsonField.of(callForwarding))

        /**
         * Sets [Builder.callForwarding] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callForwarding] with a well-typed [CallForwarding] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun callForwarding(callForwarding: JsonField<CallForwarding>) = apply {
            this.callForwarding = callForwarding
        }

        /** The call recording settings for a phone number. */
        fun callRecording(callRecording: CallRecording) = callRecording(JsonField.of(callRecording))

        /**
         * Sets [Builder.callRecording] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callRecording] with a well-typed [CallRecording] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun callRecording(callRecording: JsonField<CallRecording>) = apply {
            this.callRecording = callRecording
        }

        /** The CNAM listing settings for a phone number. */
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

        /** Identifies the connection associated with this phone number. */
        fun connectionId(connectionId: String) = connectionId(JsonField.of(connectionId))

        /**
         * Sets [Builder.connectionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connectionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun connectionId(connectionId: JsonField<String>) = apply {
            this.connectionId = connectionId
        }

        /** A customer reference string for customer look ups. */
        fun customerReference(customerReference: String) =
            customerReference(JsonField.of(customerReference))

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

        /** The emergency services settings for a phone number. */
        fun emergency(emergency: Emergency) = emergency(JsonField.of(emergency))

        /**
         * Sets [Builder.emergency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emergency] with a well-typed [Emergency] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun emergency(emergency: JsonField<Emergency>) = apply { this.emergency = emergency }

        /**
         * The inbound_call_screening setting is a phone number configuration option variable that
         * allows users to configure their settings to block or flag fraudulent calls. It can be set
         * to disabled, reject_calls, or flag_calls. This feature has an additional per-number
         * monthly cost associated with it.
         */
        fun inboundCallScreening(inboundCallScreening: InboundCallScreening) =
            inboundCallScreening(JsonField.of(inboundCallScreening))

        /**
         * Sets [Builder.inboundCallScreening] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inboundCallScreening] with a well-typed
         * [InboundCallScreening] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun inboundCallScreening(inboundCallScreening: JsonField<InboundCallScreening>) = apply {
            this.inboundCallScreening = inboundCallScreening
        }

        /** The media features settings for a phone number. */
        fun mediaFeatures(mediaFeatures: MediaFeatures) = mediaFeatures(JsonField.of(mediaFeatures))

        /**
         * Sets [Builder.mediaFeatures] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mediaFeatures] with a well-typed [MediaFeatures] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun mediaFeatures(mediaFeatures: JsonField<MediaFeatures>) = apply {
            this.mediaFeatures = mediaFeatures
        }

        /** The phone number in +E164 format. */
        fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

        /**
         * Sets [Builder.phoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun phoneNumber(phoneNumber: JsonField<String>) = apply { this.phoneNumber = phoneNumber }

        /** Identifies the type of the resource. */
        fun recordType(recordType: String) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

        /** Controls whether a tech prefix is enabled for this phone number. */
        fun techPrefixEnabled(techPrefixEnabled: Boolean) =
            techPrefixEnabled(JsonField.of(techPrefixEnabled))

        /**
         * Sets [Builder.techPrefixEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.techPrefixEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun techPrefixEnabled(techPrefixEnabled: JsonField<Boolean>) = apply {
            this.techPrefixEnabled = techPrefixEnabled
        }

        /**
         * This field allows you to rewrite the destination number of an inbound call before the
         * call is routed to you. The value of this field may be any alphanumeric value, and the
         * value will replace the number originally dialed.
         */
        fun translatedNumber(translatedNumber: String) =
            translatedNumber(JsonField.of(translatedNumber))

        /**
         * Sets [Builder.translatedNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.translatedNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun translatedNumber(translatedNumber: JsonField<String>) = apply {
            this.translatedNumber = translatedNumber
        }

        /** Controls whether a number is billed per minute or uses your concurrent channels. */
        fun usagePaymentMethod(usagePaymentMethod: UsagePaymentMethod) =
            usagePaymentMethod(JsonField.of(usagePaymentMethod))

        /**
         * Sets [Builder.usagePaymentMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usagePaymentMethod] with a well-typed
         * [UsagePaymentMethod] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun usagePaymentMethod(usagePaymentMethod: JsonField<UsagePaymentMethod>) = apply {
            this.usagePaymentMethod = usagePaymentMethod
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
         * Returns an immutable instance of [PhoneNumberWithVoiceSettings].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PhoneNumberWithVoiceSettings =
            PhoneNumberWithVoiceSettings(
                id,
                callForwarding,
                callRecording,
                cnamListing,
                connectionId,
                customerReference,
                emergency,
                inboundCallScreening,
                mediaFeatures,
                phoneNumber,
                recordType,
                techPrefixEnabled,
                translatedNumber,
                usagePaymentMethod,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PhoneNumberWithVoiceSettings = apply {
        if (validated) {
            return@apply
        }

        id()
        callForwarding().ifPresent { it.validate() }
        callRecording().ifPresent { it.validate() }
        cnamListing().ifPresent { it.validate() }
        connectionId()
        customerReference()
        emergency().ifPresent { it.validate() }
        inboundCallScreening().ifPresent { it.validate() }
        mediaFeatures().ifPresent { it.validate() }
        phoneNumber()
        recordType()
        techPrefixEnabled()
        translatedNumber()
        usagePaymentMethod().ifPresent { it.validate() }
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (callForwarding.asKnown().getOrNull()?.validity() ?: 0) +
            (callRecording.asKnown().getOrNull()?.validity() ?: 0) +
            (cnamListing.asKnown().getOrNull()?.validity() ?: 0) +
            (if (connectionId.asKnown().isPresent) 1 else 0) +
            (if (customerReference.asKnown().isPresent) 1 else 0) +
            (emergency.asKnown().getOrNull()?.validity() ?: 0) +
            (inboundCallScreening.asKnown().getOrNull()?.validity() ?: 0) +
            (mediaFeatures.asKnown().getOrNull()?.validity() ?: 0) +
            (if (phoneNumber.asKnown().isPresent) 1 else 0) +
            (if (recordType.asKnown().isPresent) 1 else 0) +
            (if (techPrefixEnabled.asKnown().isPresent) 1 else 0) +
            (if (translatedNumber.asKnown().isPresent) 1 else 0) +
            (usagePaymentMethod.asKnown().getOrNull()?.validity() ?: 0)

    /** The emergency services settings for a phone number. */
    class Emergency
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val emergencyAddressId: JsonField<String>,
        private val emergencyEnabled: JsonField<Boolean>,
        private val emergencyStatus: JsonField<EmergencyStatus>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("emergency_address_id")
            @ExcludeMissing
            emergencyAddressId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("emergency_enabled")
            @ExcludeMissing
            emergencyEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("emergency_status")
            @ExcludeMissing
            emergencyStatus: JsonField<EmergencyStatus> = JsonMissing.of(),
        ) : this(emergencyAddressId, emergencyEnabled, emergencyStatus, mutableMapOf())

        /**
         * Identifies the address to be used with emergency services.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun emergencyAddressId(): Optional<String> =
            emergencyAddressId.getOptional("emergency_address_id")

        /**
         * Allows you to enable or disable emergency services on the phone number. In order to
         * enable emergency services, you must also set an emergency_address_id.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun emergencyEnabled(): Optional<Boolean> =
            emergencyEnabled.getOptional("emergency_enabled")

        /**
         * Represents the state of the number regarding emergency activation.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun emergencyStatus(): Optional<EmergencyStatus> =
            emergencyStatus.getOptional("emergency_status")

        /**
         * Returns the raw JSON value of [emergencyAddressId].
         *
         * Unlike [emergencyAddressId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("emergency_address_id")
        @ExcludeMissing
        fun _emergencyAddressId(): JsonField<String> = emergencyAddressId

        /**
         * Returns the raw JSON value of [emergencyEnabled].
         *
         * Unlike [emergencyEnabled], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("emergency_enabled")
        @ExcludeMissing
        fun _emergencyEnabled(): JsonField<Boolean> = emergencyEnabled

        /**
         * Returns the raw JSON value of [emergencyStatus].
         *
         * Unlike [emergencyStatus], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("emergency_status")
        @ExcludeMissing
        fun _emergencyStatus(): JsonField<EmergencyStatus> = emergencyStatus

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

            /** Returns a mutable builder for constructing an instance of [Emergency]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Emergency]. */
        class Builder internal constructor() {

            private var emergencyAddressId: JsonField<String> = JsonMissing.of()
            private var emergencyEnabled: JsonField<Boolean> = JsonMissing.of()
            private var emergencyStatus: JsonField<EmergencyStatus> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(emergency: Emergency) = apply {
                emergencyAddressId = emergency.emergencyAddressId
                emergencyEnabled = emergency.emergencyEnabled
                emergencyStatus = emergency.emergencyStatus
                additionalProperties = emergency.additionalProperties.toMutableMap()
            }

            /** Identifies the address to be used with emergency services. */
            fun emergencyAddressId(emergencyAddressId: String) =
                emergencyAddressId(JsonField.of(emergencyAddressId))

            /**
             * Sets [Builder.emergencyAddressId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.emergencyAddressId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun emergencyAddressId(emergencyAddressId: JsonField<String>) = apply {
                this.emergencyAddressId = emergencyAddressId
            }

            /**
             * Allows you to enable or disable emergency services on the phone number. In order to
             * enable emergency services, you must also set an emergency_address_id.
             */
            fun emergencyEnabled(emergencyEnabled: Boolean) =
                emergencyEnabled(JsonField.of(emergencyEnabled))

            /**
             * Sets [Builder.emergencyEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.emergencyEnabled] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun emergencyEnabled(emergencyEnabled: JsonField<Boolean>) = apply {
                this.emergencyEnabled = emergencyEnabled
            }

            /** Represents the state of the number regarding emergency activation. */
            fun emergencyStatus(emergencyStatus: EmergencyStatus) =
                emergencyStatus(JsonField.of(emergencyStatus))

            /**
             * Sets [Builder.emergencyStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.emergencyStatus] with a well-typed [EmergencyStatus]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun emergencyStatus(emergencyStatus: JsonField<EmergencyStatus>) = apply {
                this.emergencyStatus = emergencyStatus
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
             * Returns an immutable instance of [Emergency].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Emergency =
                Emergency(
                    emergencyAddressId,
                    emergencyEnabled,
                    emergencyStatus,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Emergency = apply {
            if (validated) {
                return@apply
            }

            emergencyAddressId()
            emergencyEnabled()
            emergencyStatus().ifPresent { it.validate() }
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
            (if (emergencyAddressId.asKnown().isPresent) 1 else 0) +
                (if (emergencyEnabled.asKnown().isPresent) 1 else 0) +
                (emergencyStatus.asKnown().getOrNull()?.validity() ?: 0)

        /** Represents the state of the number regarding emergency activation. */
        class EmergencyStatus
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

                @JvmField val ACTIVE = of("active")

                @JvmField val PROVISIONING = of("provisioning")

                @JvmField val DEPROVISIONING = of("deprovisioning")

                @JvmField val PROVISIONING_FAILED = of("provisioning-failed")

                @JvmStatic fun of(value: String) = EmergencyStatus(JsonField.of(value))
            }

            /** An enum containing [EmergencyStatus]'s known values. */
            enum class Known {
                DISABLED,
                ACTIVE,
                PROVISIONING,
                DEPROVISIONING,
                PROVISIONING_FAILED,
            }

            /**
             * An enum containing [EmergencyStatus]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [EmergencyStatus] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DISABLED,
                ACTIVE,
                PROVISIONING,
                DEPROVISIONING,
                PROVISIONING_FAILED,
                /**
                 * An enum member indicating that [EmergencyStatus] was instantiated with an unknown
                 * value.
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
                    ACTIVE -> Value.ACTIVE
                    PROVISIONING -> Value.PROVISIONING
                    DEPROVISIONING -> Value.DEPROVISIONING
                    PROVISIONING_FAILED -> Value.PROVISIONING_FAILED
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
                    ACTIVE -> Known.ACTIVE
                    PROVISIONING -> Known.PROVISIONING
                    DEPROVISIONING -> Known.DEPROVISIONING
                    PROVISIONING_FAILED -> Known.PROVISIONING_FAILED
                    else -> throw TelnyxInvalidDataException("Unknown EmergencyStatus: $value")
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

            fun validate(): EmergencyStatus = apply {
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

                return other is EmergencyStatus && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Emergency &&
                emergencyAddressId == other.emergencyAddressId &&
                emergencyEnabled == other.emergencyEnabled &&
                emergencyStatus == other.emergencyStatus &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                emergencyAddressId,
                emergencyEnabled,
                emergencyStatus,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Emergency{emergencyAddressId=$emergencyAddressId, emergencyEnabled=$emergencyEnabled, emergencyStatus=$emergencyStatus, additionalProperties=$additionalProperties}"
    }

    /**
     * The inbound_call_screening setting is a phone number configuration option variable that
     * allows users to configure their settings to block or flag fraudulent calls. It can be set to
     * disabled, reject_calls, or flag_calls. This feature has an additional per-number monthly cost
     * associated with it.
     */
    class InboundCallScreening
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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
         * An instance of [InboundCallScreening] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
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
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
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
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
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
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

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

    /** Controls whether a number is billed per minute or uses your concurrent channels. */
    class UsagePaymentMethod
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PAY_PER_MINUTE = of("pay-per-minute")

            @JvmField val CHANNEL = of("channel")

            @JvmStatic fun of(value: String) = UsagePaymentMethod(JsonField.of(value))
        }

        /** An enum containing [UsagePaymentMethod]'s known values. */
        enum class Known {
            PAY_PER_MINUTE,
            CHANNEL,
        }

        /**
         * An enum containing [UsagePaymentMethod]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [UsagePaymentMethod] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PAY_PER_MINUTE,
            CHANNEL,
            /**
             * An enum member indicating that [UsagePaymentMethod] was instantiated with an unknown
             * value.
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
                PAY_PER_MINUTE -> Value.PAY_PER_MINUTE
                CHANNEL -> Value.CHANNEL
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
                PAY_PER_MINUTE -> Known.PAY_PER_MINUTE
                CHANNEL -> Known.CHANNEL
                else -> throw TelnyxInvalidDataException("Unknown UsagePaymentMethod: $value")
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

        fun validate(): UsagePaymentMethod = apply {
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

            return other is UsagePaymentMethod && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PhoneNumberWithVoiceSettings &&
            id == other.id &&
            callForwarding == other.callForwarding &&
            callRecording == other.callRecording &&
            cnamListing == other.cnamListing &&
            connectionId == other.connectionId &&
            customerReference == other.customerReference &&
            emergency == other.emergency &&
            inboundCallScreening == other.inboundCallScreening &&
            mediaFeatures == other.mediaFeatures &&
            phoneNumber == other.phoneNumber &&
            recordType == other.recordType &&
            techPrefixEnabled == other.techPrefixEnabled &&
            translatedNumber == other.translatedNumber &&
            usagePaymentMethod == other.usagePaymentMethod &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            callForwarding,
            callRecording,
            cnamListing,
            connectionId,
            customerReference,
            emergency,
            inboundCallScreening,
            mediaFeatures,
            phoneNumber,
            recordType,
            techPrefixEnabled,
            translatedNumber,
            usagePaymentMethod,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PhoneNumberWithVoiceSettings{id=$id, callForwarding=$callForwarding, callRecording=$callRecording, cnamListing=$cnamListing, connectionId=$connectionId, customerReference=$customerReference, emergency=$emergency, inboundCallScreening=$inboundCallScreening, mediaFeatures=$mediaFeatures, phoneNumber=$phoneNumber, recordType=$recordType, techPrefixEnabled=$techPrefixEnabled, translatedNumber=$translatedNumber, usagePaymentMethod=$usagePaymentMethod, additionalProperties=$additionalProperties}"
}
