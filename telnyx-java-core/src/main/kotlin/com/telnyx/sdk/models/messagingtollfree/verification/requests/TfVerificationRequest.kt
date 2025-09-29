// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingtollfree.verification.requests

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** The body of a tollfree verification request */
class TfVerificationRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val additionalInformation: JsonField<String>,
    private val businessAddr1: JsonField<String>,
    private val businessCity: JsonField<String>,
    private val businessContactEmail: JsonField<String>,
    private val businessContactFirstName: JsonField<String>,
    private val businessContactLastName: JsonField<String>,
    private val businessContactPhone: JsonField<String>,
    private val businessName: JsonField<String>,
    private val businessState: JsonField<String>,
    private val businessZip: JsonField<String>,
    private val corporateWebsite: JsonField<String>,
    private val isvReseller: JsonField<String>,
    private val messageVolume: JsonField<Volume>,
    private val optInWorkflow: JsonField<String>,
    private val optInWorkflowImageUrls: JsonField<List<Url>>,
    private val phoneNumbers: JsonField<List<TfPhoneNumber>>,
    private val productionMessageContent: JsonField<String>,
    private val useCase: JsonField<UseCaseCategories>,
    private val useCaseSummary: JsonField<String>,
    private val businessAddr2: JsonField<String>,
    private val webhookUrl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("additionalInformation")
        @ExcludeMissing
        additionalInformation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("businessAddr1")
        @ExcludeMissing
        businessAddr1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("businessCity")
        @ExcludeMissing
        businessCity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("businessContactEmail")
        @ExcludeMissing
        businessContactEmail: JsonField<String> = JsonMissing.of(),
        @JsonProperty("businessContactFirstName")
        @ExcludeMissing
        businessContactFirstName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("businessContactLastName")
        @ExcludeMissing
        businessContactLastName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("businessContactPhone")
        @ExcludeMissing
        businessContactPhone: JsonField<String> = JsonMissing.of(),
        @JsonProperty("businessName")
        @ExcludeMissing
        businessName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("businessState")
        @ExcludeMissing
        businessState: JsonField<String> = JsonMissing.of(),
        @JsonProperty("businessZip")
        @ExcludeMissing
        businessZip: JsonField<String> = JsonMissing.of(),
        @JsonProperty("corporateWebsite")
        @ExcludeMissing
        corporateWebsite: JsonField<String> = JsonMissing.of(),
        @JsonProperty("isvReseller")
        @ExcludeMissing
        isvReseller: JsonField<String> = JsonMissing.of(),
        @JsonProperty("messageVolume")
        @ExcludeMissing
        messageVolume: JsonField<Volume> = JsonMissing.of(),
        @JsonProperty("optInWorkflow")
        @ExcludeMissing
        optInWorkflow: JsonField<String> = JsonMissing.of(),
        @JsonProperty("optInWorkflowImageURLs")
        @ExcludeMissing
        optInWorkflowImageUrls: JsonField<List<Url>> = JsonMissing.of(),
        @JsonProperty("phoneNumbers")
        @ExcludeMissing
        phoneNumbers: JsonField<List<TfPhoneNumber>> = JsonMissing.of(),
        @JsonProperty("productionMessageContent")
        @ExcludeMissing
        productionMessageContent: JsonField<String> = JsonMissing.of(),
        @JsonProperty("useCase")
        @ExcludeMissing
        useCase: JsonField<UseCaseCategories> = JsonMissing.of(),
        @JsonProperty("useCaseSummary")
        @ExcludeMissing
        useCaseSummary: JsonField<String> = JsonMissing.of(),
        @JsonProperty("businessAddr2")
        @ExcludeMissing
        businessAddr2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("webhookUrl") @ExcludeMissing webhookUrl: JsonField<String> = JsonMissing.of(),
    ) : this(
        additionalInformation,
        businessAddr1,
        businessCity,
        businessContactEmail,
        businessContactFirstName,
        businessContactLastName,
        businessContactPhone,
        businessName,
        businessState,
        businessZip,
        corporateWebsite,
        isvReseller,
        messageVolume,
        optInWorkflow,
        optInWorkflowImageUrls,
        phoneNumbers,
        productionMessageContent,
        useCase,
        useCaseSummary,
        businessAddr2,
        webhookUrl,
        mutableMapOf(),
    )

    /**
     * Any additional information
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun additionalInformation(): String = additionalInformation.getRequired("additionalInformation")

    /**
     * Line 1 of the business address
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun businessAddr1(): String = businessAddr1.getRequired("businessAddr1")

    /**
     * The city of the business address; the first letter should be capitalized
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun businessCity(): String = businessCity.getRequired("businessCity")

    /**
     * The email address of the business contact
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun businessContactEmail(): String = businessContactEmail.getRequired("businessContactEmail")

    /**
     * First name of the business contact; there are no specific requirements on formatting
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun businessContactFirstName(): String =
        businessContactFirstName.getRequired("businessContactFirstName")

    /**
     * Last name of the business contact; there are no specific requirements on formatting
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun businessContactLastName(): String =
        businessContactLastName.getRequired("businessContactLastName")

    /**
     * The phone number of the business contact in E.164 format
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun businessContactPhone(): String = businessContactPhone.getRequired("businessContactPhone")

    /**
     * Name of the business; there are no specific formatting requirements
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun businessName(): String = businessName.getRequired("businessName")

    /**
     * The full name of the state (not the 2 letter code) of the business address; the first letter
     * should be capitalized
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun businessState(): String = businessState.getRequired("businessState")

    /**
     * The ZIP code of the business address
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun businessZip(): String = businessZip.getRequired("businessZip")

    /**
     * A URL, including the scheme, pointing to the corporate website
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun corporateWebsite(): String = corporateWebsite.getRequired("corporateWebsite")

    /**
     * ISV name
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isvReseller(): String = isvReseller.getRequired("isvReseller")

    /**
     * Message Volume Enums
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun messageVolume(): Volume = messageVolume.getRequired("messageVolume")

    /**
     * Human-readable description of how end users will opt into receiving messages from the given
     * phone numbers
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun optInWorkflow(): String = optInWorkflow.getRequired("optInWorkflow")

    /**
     * Images showing the opt-in workflow
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun optInWorkflowImageUrls(): List<Url> =
        optInWorkflowImageUrls.getRequired("optInWorkflowImageURLs")

    /**
     * The phone numbers to request the verification of
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun phoneNumbers(): List<TfPhoneNumber> = phoneNumbers.getRequired("phoneNumbers")

    /**
     * An example of a message that will be sent from the given phone numbers
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun productionMessageContent(): String =
        productionMessageContent.getRequired("productionMessageContent")

    /**
     * Tollfree usecase categories
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun useCase(): UseCaseCategories = useCase.getRequired("useCase")

    /**
     * Human-readable summary of the desired use-case
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun useCaseSummary(): String = useCaseSummary.getRequired("useCaseSummary")

    /**
     * Line 2 of the business address
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun businessAddr2(): Optional<String> = businessAddr2.getOptional("businessAddr2")

    /**
     * URL that should receive webhooks relating to this verification request
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookUrl(): Optional<String> = webhookUrl.getOptional("webhookUrl")

    /**
     * Returns the raw JSON value of [additionalInformation].
     *
     * Unlike [additionalInformation], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("additionalInformation")
    @ExcludeMissing
    fun _additionalInformation(): JsonField<String> = additionalInformation

    /**
     * Returns the raw JSON value of [businessAddr1].
     *
     * Unlike [businessAddr1], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("businessAddr1")
    @ExcludeMissing
    fun _businessAddr1(): JsonField<String> = businessAddr1

    /**
     * Returns the raw JSON value of [businessCity].
     *
     * Unlike [businessCity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("businessCity")
    @ExcludeMissing
    fun _businessCity(): JsonField<String> = businessCity

    /**
     * Returns the raw JSON value of [businessContactEmail].
     *
     * Unlike [businessContactEmail], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("businessContactEmail")
    @ExcludeMissing
    fun _businessContactEmail(): JsonField<String> = businessContactEmail

    /**
     * Returns the raw JSON value of [businessContactFirstName].
     *
     * Unlike [businessContactFirstName], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("businessContactFirstName")
    @ExcludeMissing
    fun _businessContactFirstName(): JsonField<String> = businessContactFirstName

    /**
     * Returns the raw JSON value of [businessContactLastName].
     *
     * Unlike [businessContactLastName], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("businessContactLastName")
    @ExcludeMissing
    fun _businessContactLastName(): JsonField<String> = businessContactLastName

    /**
     * Returns the raw JSON value of [businessContactPhone].
     *
     * Unlike [businessContactPhone], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("businessContactPhone")
    @ExcludeMissing
    fun _businessContactPhone(): JsonField<String> = businessContactPhone

    /**
     * Returns the raw JSON value of [businessName].
     *
     * Unlike [businessName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("businessName")
    @ExcludeMissing
    fun _businessName(): JsonField<String> = businessName

    /**
     * Returns the raw JSON value of [businessState].
     *
     * Unlike [businessState], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("businessState")
    @ExcludeMissing
    fun _businessState(): JsonField<String> = businessState

    /**
     * Returns the raw JSON value of [businessZip].
     *
     * Unlike [businessZip], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("businessZip") @ExcludeMissing fun _businessZip(): JsonField<String> = businessZip

    /**
     * Returns the raw JSON value of [corporateWebsite].
     *
     * Unlike [corporateWebsite], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("corporateWebsite")
    @ExcludeMissing
    fun _corporateWebsite(): JsonField<String> = corporateWebsite

    /**
     * Returns the raw JSON value of [isvReseller].
     *
     * Unlike [isvReseller], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isvReseller") @ExcludeMissing fun _isvReseller(): JsonField<String> = isvReseller

    /**
     * Returns the raw JSON value of [messageVolume].
     *
     * Unlike [messageVolume], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("messageVolume")
    @ExcludeMissing
    fun _messageVolume(): JsonField<Volume> = messageVolume

    /**
     * Returns the raw JSON value of [optInWorkflow].
     *
     * Unlike [optInWorkflow], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("optInWorkflow")
    @ExcludeMissing
    fun _optInWorkflow(): JsonField<String> = optInWorkflow

    /**
     * Returns the raw JSON value of [optInWorkflowImageUrls].
     *
     * Unlike [optInWorkflowImageUrls], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("optInWorkflowImageURLs")
    @ExcludeMissing
    fun _optInWorkflowImageUrls(): JsonField<List<Url>> = optInWorkflowImageUrls

    /**
     * Returns the raw JSON value of [phoneNumbers].
     *
     * Unlike [phoneNumbers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phoneNumbers")
    @ExcludeMissing
    fun _phoneNumbers(): JsonField<List<TfPhoneNumber>> = phoneNumbers

    /**
     * Returns the raw JSON value of [productionMessageContent].
     *
     * Unlike [productionMessageContent], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("productionMessageContent")
    @ExcludeMissing
    fun _productionMessageContent(): JsonField<String> = productionMessageContent

    /**
     * Returns the raw JSON value of [useCase].
     *
     * Unlike [useCase], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("useCase") @ExcludeMissing fun _useCase(): JsonField<UseCaseCategories> = useCase

    /**
     * Returns the raw JSON value of [useCaseSummary].
     *
     * Unlike [useCaseSummary], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("useCaseSummary")
    @ExcludeMissing
    fun _useCaseSummary(): JsonField<String> = useCaseSummary

    /**
     * Returns the raw JSON value of [businessAddr2].
     *
     * Unlike [businessAddr2], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("businessAddr2")
    @ExcludeMissing
    fun _businessAddr2(): JsonField<String> = businessAddr2

    /**
     * Returns the raw JSON value of [webhookUrl].
     *
     * Unlike [webhookUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("webhookUrl") @ExcludeMissing fun _webhookUrl(): JsonField<String> = webhookUrl

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
         * Returns a mutable builder for constructing an instance of [TfVerificationRequest].
         *
         * The following fields are required:
         * ```java
         * .additionalInformation()
         * .businessAddr1()
         * .businessCity()
         * .businessContactEmail()
         * .businessContactFirstName()
         * .businessContactLastName()
         * .businessContactPhone()
         * .businessName()
         * .businessState()
         * .businessZip()
         * .corporateWebsite()
         * .isvReseller()
         * .messageVolume()
         * .optInWorkflow()
         * .optInWorkflowImageUrls()
         * .phoneNumbers()
         * .productionMessageContent()
         * .useCase()
         * .useCaseSummary()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TfVerificationRequest]. */
    class Builder internal constructor() {

        private var additionalInformation: JsonField<String>? = null
        private var businessAddr1: JsonField<String>? = null
        private var businessCity: JsonField<String>? = null
        private var businessContactEmail: JsonField<String>? = null
        private var businessContactFirstName: JsonField<String>? = null
        private var businessContactLastName: JsonField<String>? = null
        private var businessContactPhone: JsonField<String>? = null
        private var businessName: JsonField<String>? = null
        private var businessState: JsonField<String>? = null
        private var businessZip: JsonField<String>? = null
        private var corporateWebsite: JsonField<String>? = null
        private var isvReseller: JsonField<String>? = null
        private var messageVolume: JsonField<Volume>? = null
        private var optInWorkflow: JsonField<String>? = null
        private var optInWorkflowImageUrls: JsonField<MutableList<Url>>? = null
        private var phoneNumbers: JsonField<MutableList<TfPhoneNumber>>? = null
        private var productionMessageContent: JsonField<String>? = null
        private var useCase: JsonField<UseCaseCategories>? = null
        private var useCaseSummary: JsonField<String>? = null
        private var businessAddr2: JsonField<String> = JsonMissing.of()
        private var webhookUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(tfVerificationRequest: TfVerificationRequest) = apply {
            additionalInformation = tfVerificationRequest.additionalInformation
            businessAddr1 = tfVerificationRequest.businessAddr1
            businessCity = tfVerificationRequest.businessCity
            businessContactEmail = tfVerificationRequest.businessContactEmail
            businessContactFirstName = tfVerificationRequest.businessContactFirstName
            businessContactLastName = tfVerificationRequest.businessContactLastName
            businessContactPhone = tfVerificationRequest.businessContactPhone
            businessName = tfVerificationRequest.businessName
            businessState = tfVerificationRequest.businessState
            businessZip = tfVerificationRequest.businessZip
            corporateWebsite = tfVerificationRequest.corporateWebsite
            isvReseller = tfVerificationRequest.isvReseller
            messageVolume = tfVerificationRequest.messageVolume
            optInWorkflow = tfVerificationRequest.optInWorkflow
            optInWorkflowImageUrls =
                tfVerificationRequest.optInWorkflowImageUrls.map { it.toMutableList() }
            phoneNumbers = tfVerificationRequest.phoneNumbers.map { it.toMutableList() }
            productionMessageContent = tfVerificationRequest.productionMessageContent
            useCase = tfVerificationRequest.useCase
            useCaseSummary = tfVerificationRequest.useCaseSummary
            businessAddr2 = tfVerificationRequest.businessAddr2
            webhookUrl = tfVerificationRequest.webhookUrl
            additionalProperties = tfVerificationRequest.additionalProperties.toMutableMap()
        }

        /** Any additional information */
        fun additionalInformation(additionalInformation: String) =
            additionalInformation(JsonField.of(additionalInformation))

        /**
         * Sets [Builder.additionalInformation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.additionalInformation] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun additionalInformation(additionalInformation: JsonField<String>) = apply {
            this.additionalInformation = additionalInformation
        }

        /** Line 1 of the business address */
        fun businessAddr1(businessAddr1: String) = businessAddr1(JsonField.of(businessAddr1))

        /**
         * Sets [Builder.businessAddr1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessAddr1] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun businessAddr1(businessAddr1: JsonField<String>) = apply {
            this.businessAddr1 = businessAddr1
        }

        /** The city of the business address; the first letter should be capitalized */
        fun businessCity(businessCity: String) = businessCity(JsonField.of(businessCity))

        /**
         * Sets [Builder.businessCity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessCity] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun businessCity(businessCity: JsonField<String>) = apply {
            this.businessCity = businessCity
        }

        /** The email address of the business contact */
        fun businessContactEmail(businessContactEmail: String) =
            businessContactEmail(JsonField.of(businessContactEmail))

        /**
         * Sets [Builder.businessContactEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessContactEmail] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun businessContactEmail(businessContactEmail: JsonField<String>) = apply {
            this.businessContactEmail = businessContactEmail
        }

        /** First name of the business contact; there are no specific requirements on formatting */
        fun businessContactFirstName(businessContactFirstName: String) =
            businessContactFirstName(JsonField.of(businessContactFirstName))

        /**
         * Sets [Builder.businessContactFirstName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessContactFirstName] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun businessContactFirstName(businessContactFirstName: JsonField<String>) = apply {
            this.businessContactFirstName = businessContactFirstName
        }

        /** Last name of the business contact; there are no specific requirements on formatting */
        fun businessContactLastName(businessContactLastName: String) =
            businessContactLastName(JsonField.of(businessContactLastName))

        /**
         * Sets [Builder.businessContactLastName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessContactLastName] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun businessContactLastName(businessContactLastName: JsonField<String>) = apply {
            this.businessContactLastName = businessContactLastName
        }

        /** The phone number of the business contact in E.164 format */
        fun businessContactPhone(businessContactPhone: String) =
            businessContactPhone(JsonField.of(businessContactPhone))

        /**
         * Sets [Builder.businessContactPhone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessContactPhone] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun businessContactPhone(businessContactPhone: JsonField<String>) = apply {
            this.businessContactPhone = businessContactPhone
        }

        /** Name of the business; there are no specific formatting requirements */
        fun businessName(businessName: String) = businessName(JsonField.of(businessName))

        /**
         * Sets [Builder.businessName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun businessName(businessName: JsonField<String>) = apply {
            this.businessName = businessName
        }

        /**
         * The full name of the state (not the 2 letter code) of the business address; the first
         * letter should be capitalized
         */
        fun businessState(businessState: String) = businessState(JsonField.of(businessState))

        /**
         * Sets [Builder.businessState] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessState] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun businessState(businessState: JsonField<String>) = apply {
            this.businessState = businessState
        }

        /** The ZIP code of the business address */
        fun businessZip(businessZip: String) = businessZip(JsonField.of(businessZip))

        /**
         * Sets [Builder.businessZip] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessZip] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun businessZip(businessZip: JsonField<String>) = apply { this.businessZip = businessZip }

        /** A URL, including the scheme, pointing to the corporate website */
        fun corporateWebsite(corporateWebsite: String) =
            corporateWebsite(JsonField.of(corporateWebsite))

        /**
         * Sets [Builder.corporateWebsite] to an arbitrary JSON value.
         *
         * You should usually call [Builder.corporateWebsite] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun corporateWebsite(corporateWebsite: JsonField<String>) = apply {
            this.corporateWebsite = corporateWebsite
        }

        /** ISV name */
        fun isvReseller(isvReseller: String) = isvReseller(JsonField.of(isvReseller))

        /**
         * Sets [Builder.isvReseller] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isvReseller] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isvReseller(isvReseller: JsonField<String>) = apply { this.isvReseller = isvReseller }

        /** Message Volume Enums */
        fun messageVolume(messageVolume: Volume) = messageVolume(JsonField.of(messageVolume))

        /**
         * Sets [Builder.messageVolume] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messageVolume] with a well-typed [Volume] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun messageVolume(messageVolume: JsonField<Volume>) = apply {
            this.messageVolume = messageVolume
        }

        /**
         * Human-readable description of how end users will opt into receiving messages from the
         * given phone numbers
         */
        fun optInWorkflow(optInWorkflow: String) = optInWorkflow(JsonField.of(optInWorkflow))

        /**
         * Sets [Builder.optInWorkflow] to an arbitrary JSON value.
         *
         * You should usually call [Builder.optInWorkflow] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun optInWorkflow(optInWorkflow: JsonField<String>) = apply {
            this.optInWorkflow = optInWorkflow
        }

        /** Images showing the opt-in workflow */
        fun optInWorkflowImageUrls(optInWorkflowImageUrls: List<Url>) =
            optInWorkflowImageUrls(JsonField.of(optInWorkflowImageUrls))

        /**
         * Sets [Builder.optInWorkflowImageUrls] to an arbitrary JSON value.
         *
         * You should usually call [Builder.optInWorkflowImageUrls] with a well-typed `List<Url>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun optInWorkflowImageUrls(optInWorkflowImageUrls: JsonField<List<Url>>) = apply {
            this.optInWorkflowImageUrls = optInWorkflowImageUrls.map { it.toMutableList() }
        }

        /**
         * Adds a single [Url] to [optInWorkflowImageUrls].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOptInWorkflowImageUrl(optInWorkflowImageUrl: Url) = apply {
            optInWorkflowImageUrls =
                (optInWorkflowImageUrls ?: JsonField.of(mutableListOf())).also {
                    checkKnown("optInWorkflowImageUrls", it).add(optInWorkflowImageUrl)
                }
        }

        /** The phone numbers to request the verification of */
        fun phoneNumbers(phoneNumbers: List<TfPhoneNumber>) =
            phoneNumbers(JsonField.of(phoneNumbers))

        /**
         * Sets [Builder.phoneNumbers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumbers] with a well-typed `List<TfPhoneNumber>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun phoneNumbers(phoneNumbers: JsonField<List<TfPhoneNumber>>) = apply {
            this.phoneNumbers = phoneNumbers.map { it.toMutableList() }
        }

        /**
         * Adds a single [TfPhoneNumber] to [phoneNumbers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPhoneNumber(phoneNumber: TfPhoneNumber) = apply {
            phoneNumbers =
                (phoneNumbers ?: JsonField.of(mutableListOf())).also {
                    checkKnown("phoneNumbers", it).add(phoneNumber)
                }
        }

        /** An example of a message that will be sent from the given phone numbers */
        fun productionMessageContent(productionMessageContent: String) =
            productionMessageContent(JsonField.of(productionMessageContent))

        /**
         * Sets [Builder.productionMessageContent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productionMessageContent] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun productionMessageContent(productionMessageContent: JsonField<String>) = apply {
            this.productionMessageContent = productionMessageContent
        }

        /** Tollfree usecase categories */
        fun useCase(useCase: UseCaseCategories) = useCase(JsonField.of(useCase))

        /**
         * Sets [Builder.useCase] to an arbitrary JSON value.
         *
         * You should usually call [Builder.useCase] with a well-typed [UseCaseCategories] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun useCase(useCase: JsonField<UseCaseCategories>) = apply { this.useCase = useCase }

        /** Human-readable summary of the desired use-case */
        fun useCaseSummary(useCaseSummary: String) = useCaseSummary(JsonField.of(useCaseSummary))

        /**
         * Sets [Builder.useCaseSummary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.useCaseSummary] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun useCaseSummary(useCaseSummary: JsonField<String>) = apply {
            this.useCaseSummary = useCaseSummary
        }

        /** Line 2 of the business address */
        fun businessAddr2(businessAddr2: String) = businessAddr2(JsonField.of(businessAddr2))

        /**
         * Sets [Builder.businessAddr2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessAddr2] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun businessAddr2(businessAddr2: JsonField<String>) = apply {
            this.businessAddr2 = businessAddr2
        }

        /** URL that should receive webhooks relating to this verification request */
        fun webhookUrl(webhookUrl: String) = webhookUrl(JsonField.of(webhookUrl))

        /**
         * Sets [Builder.webhookUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun webhookUrl(webhookUrl: JsonField<String>) = apply { this.webhookUrl = webhookUrl }

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
         * Returns an immutable instance of [TfVerificationRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .additionalInformation()
         * .businessAddr1()
         * .businessCity()
         * .businessContactEmail()
         * .businessContactFirstName()
         * .businessContactLastName()
         * .businessContactPhone()
         * .businessName()
         * .businessState()
         * .businessZip()
         * .corporateWebsite()
         * .isvReseller()
         * .messageVolume()
         * .optInWorkflow()
         * .optInWorkflowImageUrls()
         * .phoneNumbers()
         * .productionMessageContent()
         * .useCase()
         * .useCaseSummary()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TfVerificationRequest =
            TfVerificationRequest(
                checkRequired("additionalInformation", additionalInformation),
                checkRequired("businessAddr1", businessAddr1),
                checkRequired("businessCity", businessCity),
                checkRequired("businessContactEmail", businessContactEmail),
                checkRequired("businessContactFirstName", businessContactFirstName),
                checkRequired("businessContactLastName", businessContactLastName),
                checkRequired("businessContactPhone", businessContactPhone),
                checkRequired("businessName", businessName),
                checkRequired("businessState", businessState),
                checkRequired("businessZip", businessZip),
                checkRequired("corporateWebsite", corporateWebsite),
                checkRequired("isvReseller", isvReseller),
                checkRequired("messageVolume", messageVolume),
                checkRequired("optInWorkflow", optInWorkflow),
                checkRequired("optInWorkflowImageUrls", optInWorkflowImageUrls).map {
                    it.toImmutable()
                },
                checkRequired("phoneNumbers", phoneNumbers).map { it.toImmutable() },
                checkRequired("productionMessageContent", productionMessageContent),
                checkRequired("useCase", useCase),
                checkRequired("useCaseSummary", useCaseSummary),
                businessAddr2,
                webhookUrl,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TfVerificationRequest = apply {
        if (validated) {
            return@apply
        }

        additionalInformation()
        businessAddr1()
        businessCity()
        businessContactEmail()
        businessContactFirstName()
        businessContactLastName()
        businessContactPhone()
        businessName()
        businessState()
        businessZip()
        corporateWebsite()
        isvReseller()
        messageVolume().validate()
        optInWorkflow()
        optInWorkflowImageUrls().forEach { it.validate() }
        phoneNumbers().forEach { it.validate() }
        productionMessageContent()
        useCase().validate()
        useCaseSummary()
        businessAddr2()
        webhookUrl()
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
        (if (additionalInformation.asKnown().isPresent) 1 else 0) +
            (if (businessAddr1.asKnown().isPresent) 1 else 0) +
            (if (businessCity.asKnown().isPresent) 1 else 0) +
            (if (businessContactEmail.asKnown().isPresent) 1 else 0) +
            (if (businessContactFirstName.asKnown().isPresent) 1 else 0) +
            (if (businessContactLastName.asKnown().isPresent) 1 else 0) +
            (if (businessContactPhone.asKnown().isPresent) 1 else 0) +
            (if (businessName.asKnown().isPresent) 1 else 0) +
            (if (businessState.asKnown().isPresent) 1 else 0) +
            (if (businessZip.asKnown().isPresent) 1 else 0) +
            (if (corporateWebsite.asKnown().isPresent) 1 else 0) +
            (if (isvReseller.asKnown().isPresent) 1 else 0) +
            (messageVolume.asKnown().getOrNull()?.validity() ?: 0) +
            (if (optInWorkflow.asKnown().isPresent) 1 else 0) +
            (optInWorkflowImageUrls.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (phoneNumbers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (productionMessageContent.asKnown().isPresent) 1 else 0) +
            (useCase.asKnown().getOrNull()?.validity() ?: 0) +
            (if (useCaseSummary.asKnown().isPresent) 1 else 0) +
            (if (businessAddr2.asKnown().isPresent) 1 else 0) +
            (if (webhookUrl.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TfVerificationRequest &&
            additionalInformation == other.additionalInformation &&
            businessAddr1 == other.businessAddr1 &&
            businessCity == other.businessCity &&
            businessContactEmail == other.businessContactEmail &&
            businessContactFirstName == other.businessContactFirstName &&
            businessContactLastName == other.businessContactLastName &&
            businessContactPhone == other.businessContactPhone &&
            businessName == other.businessName &&
            businessState == other.businessState &&
            businessZip == other.businessZip &&
            corporateWebsite == other.corporateWebsite &&
            isvReseller == other.isvReseller &&
            messageVolume == other.messageVolume &&
            optInWorkflow == other.optInWorkflow &&
            optInWorkflowImageUrls == other.optInWorkflowImageUrls &&
            phoneNumbers == other.phoneNumbers &&
            productionMessageContent == other.productionMessageContent &&
            useCase == other.useCase &&
            useCaseSummary == other.useCaseSummary &&
            businessAddr2 == other.businessAddr2 &&
            webhookUrl == other.webhookUrl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            additionalInformation,
            businessAddr1,
            businessCity,
            businessContactEmail,
            businessContactFirstName,
            businessContactLastName,
            businessContactPhone,
            businessName,
            businessState,
            businessZip,
            corporateWebsite,
            isvReseller,
            messageVolume,
            optInWorkflow,
            optInWorkflowImageUrls,
            phoneNumbers,
            productionMessageContent,
            useCase,
            useCaseSummary,
            businessAddr2,
            webhookUrl,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TfVerificationRequest{additionalInformation=$additionalInformation, businessAddr1=$businessAddr1, businessCity=$businessCity, businessContactEmail=$businessContactEmail, businessContactFirstName=$businessContactFirstName, businessContactLastName=$businessContactLastName, businessContactPhone=$businessContactPhone, businessName=$businessName, businessState=$businessState, businessZip=$businessZip, corporateWebsite=$corporateWebsite, isvReseller=$isvReseller, messageVolume=$messageVolume, optInWorkflow=$optInWorkflow, optInWorkflowImageUrls=$optInWorkflowImageUrls, phoneNumbers=$phoneNumbers, productionMessageContent=$productionMessageContent, useCase=$useCase, useCaseSummary=$useCaseSummary, businessAddr2=$businessAddr2, webhookUrl=$webhookUrl, additionalProperties=$additionalProperties}"
}
