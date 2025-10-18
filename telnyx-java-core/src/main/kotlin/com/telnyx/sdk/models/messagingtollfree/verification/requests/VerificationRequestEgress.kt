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

/** A verification request as it comes out of the database */
class VerificationRequestEgress
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
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
    private val verificationRequestId: JsonField<String>,
    private val ageGatedContent: JsonField<Boolean>,
    private val businessAddr2: JsonField<String>,
    private val businessRegistrationCountry: JsonField<String>,
    private val businessRegistrationNumber: JsonField<String>,
    private val businessRegistrationType: JsonField<String>,
    private val doingBusinessAs: JsonField<String>,
    private val entityType: JsonField<TollFreeVerificationEntityType>,
    private val helpMessageResponse: JsonField<String>,
    private val optInConfirmationResponse: JsonField<String>,
    private val optInKeywords: JsonField<String>,
    private val privacyPolicyUrl: JsonField<String>,
    private val termsAndConditionUrl: JsonField<String>,
    private val verificationStatus: JsonField<TfVerificationStatus>,
    private val webhookUrl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
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
        @JsonProperty("verificationRequestId")
        @ExcludeMissing
        verificationRequestId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ageGatedContent")
        @ExcludeMissing
        ageGatedContent: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("businessAddr2")
        @ExcludeMissing
        businessAddr2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("businessRegistrationCountry")
        @ExcludeMissing
        businessRegistrationCountry: JsonField<String> = JsonMissing.of(),
        @JsonProperty("businessRegistrationNumber")
        @ExcludeMissing
        businessRegistrationNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("businessRegistrationType")
        @ExcludeMissing
        businessRegistrationType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("doingBusinessAs")
        @ExcludeMissing
        doingBusinessAs: JsonField<String> = JsonMissing.of(),
        @JsonProperty("entityType")
        @ExcludeMissing
        entityType: JsonField<TollFreeVerificationEntityType> = JsonMissing.of(),
        @JsonProperty("helpMessageResponse")
        @ExcludeMissing
        helpMessageResponse: JsonField<String> = JsonMissing.of(),
        @JsonProperty("optInConfirmationResponse")
        @ExcludeMissing
        optInConfirmationResponse: JsonField<String> = JsonMissing.of(),
        @JsonProperty("optInKeywords")
        @ExcludeMissing
        optInKeywords: JsonField<String> = JsonMissing.of(),
        @JsonProperty("privacyPolicyURL")
        @ExcludeMissing
        privacyPolicyUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("termsAndConditionURL")
        @ExcludeMissing
        termsAndConditionUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("verificationStatus")
        @ExcludeMissing
        verificationStatus: JsonField<TfVerificationStatus> = JsonMissing.of(),
        @JsonProperty("webhookUrl") @ExcludeMissing webhookUrl: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
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
        verificationRequestId,
        ageGatedContent,
        businessAddr2,
        businessRegistrationCountry,
        businessRegistrationNumber,
        businessRegistrationType,
        doingBusinessAs,
        entityType,
        helpMessageResponse,
        optInConfirmationResponse,
        optInKeywords,
        privacyPolicyUrl,
        termsAndConditionUrl,
        verificationStatus,
        webhookUrl,
        mutableMapOf(),
    )

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun additionalInformation(): String = additionalInformation.getRequired("additionalInformation")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun businessAddr1(): String = businessAddr1.getRequired("businessAddr1")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun businessCity(): String = businessCity.getRequired("businessCity")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun businessContactEmail(): String = businessContactEmail.getRequired("businessContactEmail")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun businessContactFirstName(): String =
        businessContactFirstName.getRequired("businessContactFirstName")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun businessContactLastName(): String =
        businessContactLastName.getRequired("businessContactLastName")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun businessContactPhone(): String = businessContactPhone.getRequired("businessContactPhone")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun businessName(): String = businessName.getRequired("businessName")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun businessState(): String = businessState.getRequired("businessState")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun businessZip(): String = businessZip.getRequired("businessZip")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun corporateWebsite(): String = corporateWebsite.getRequired("corporateWebsite")

    /**
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
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun optInWorkflow(): String = optInWorkflow.getRequired("optInWorkflow")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun optInWorkflowImageUrls(): List<Url> =
        optInWorkflowImageUrls.getRequired("optInWorkflowImageURLs")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun phoneNumbers(): List<TfPhoneNumber> = phoneNumbers.getRequired("phoneNumbers")

    /**
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
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun useCaseSummary(): String = useCaseSummary.getRequired("useCaseSummary")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun verificationRequestId(): String = verificationRequestId.getRequired("verificationRequestId")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ageGatedContent(): Optional<Boolean> = ageGatedContent.getOptional("ageGatedContent")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun businessAddr2(): Optional<String> = businessAddr2.getOptional("businessAddr2")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun businessRegistrationCountry(): Optional<String> =
        businessRegistrationCountry.getOptional("businessRegistrationCountry")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun businessRegistrationNumber(): Optional<String> =
        businessRegistrationNumber.getOptional("businessRegistrationNumber")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun businessRegistrationType(): Optional<String> =
        businessRegistrationType.getOptional("businessRegistrationType")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun doingBusinessAs(): Optional<String> = doingBusinessAs.getOptional("doingBusinessAs")

    /**
     * Business entity classification
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun entityType(): Optional<TollFreeVerificationEntityType> =
        entityType.getOptional("entityType")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun helpMessageResponse(): Optional<String> =
        helpMessageResponse.getOptional("helpMessageResponse")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun optInConfirmationResponse(): Optional<String> =
        optInConfirmationResponse.getOptional("optInConfirmationResponse")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun optInKeywords(): Optional<String> = optInKeywords.getOptional("optInKeywords")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun privacyPolicyUrl(): Optional<String> = privacyPolicyUrl.getOptional("privacyPolicyURL")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun termsAndConditionUrl(): Optional<String> =
        termsAndConditionUrl.getOptional("termsAndConditionURL")

    /**
     * Tollfree verification status
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun verificationStatus(): Optional<TfVerificationStatus> =
        verificationStatus.getOptional("verificationStatus")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookUrl(): Optional<String> = webhookUrl.getOptional("webhookUrl")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
     * Returns the raw JSON value of [verificationRequestId].
     *
     * Unlike [verificationRequestId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("verificationRequestId")
    @ExcludeMissing
    fun _verificationRequestId(): JsonField<String> = verificationRequestId

    /**
     * Returns the raw JSON value of [ageGatedContent].
     *
     * Unlike [ageGatedContent], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ageGatedContent")
    @ExcludeMissing
    fun _ageGatedContent(): JsonField<Boolean> = ageGatedContent

    /**
     * Returns the raw JSON value of [businessAddr2].
     *
     * Unlike [businessAddr2], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("businessAddr2")
    @ExcludeMissing
    fun _businessAddr2(): JsonField<String> = businessAddr2

    /**
     * Returns the raw JSON value of [businessRegistrationCountry].
     *
     * Unlike [businessRegistrationCountry], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("businessRegistrationCountry")
    @ExcludeMissing
    fun _businessRegistrationCountry(): JsonField<String> = businessRegistrationCountry

    /**
     * Returns the raw JSON value of [businessRegistrationNumber].
     *
     * Unlike [businessRegistrationNumber], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("businessRegistrationNumber")
    @ExcludeMissing
    fun _businessRegistrationNumber(): JsonField<String> = businessRegistrationNumber

    /**
     * Returns the raw JSON value of [businessRegistrationType].
     *
     * Unlike [businessRegistrationType], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("businessRegistrationType")
    @ExcludeMissing
    fun _businessRegistrationType(): JsonField<String> = businessRegistrationType

    /**
     * Returns the raw JSON value of [doingBusinessAs].
     *
     * Unlike [doingBusinessAs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("doingBusinessAs")
    @ExcludeMissing
    fun _doingBusinessAs(): JsonField<String> = doingBusinessAs

    /**
     * Returns the raw JSON value of [entityType].
     *
     * Unlike [entityType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("entityType")
    @ExcludeMissing
    fun _entityType(): JsonField<TollFreeVerificationEntityType> = entityType

    /**
     * Returns the raw JSON value of [helpMessageResponse].
     *
     * Unlike [helpMessageResponse], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("helpMessageResponse")
    @ExcludeMissing
    fun _helpMessageResponse(): JsonField<String> = helpMessageResponse

    /**
     * Returns the raw JSON value of [optInConfirmationResponse].
     *
     * Unlike [optInConfirmationResponse], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("optInConfirmationResponse")
    @ExcludeMissing
    fun _optInConfirmationResponse(): JsonField<String> = optInConfirmationResponse

    /**
     * Returns the raw JSON value of [optInKeywords].
     *
     * Unlike [optInKeywords], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("optInKeywords")
    @ExcludeMissing
    fun _optInKeywords(): JsonField<String> = optInKeywords

    /**
     * Returns the raw JSON value of [privacyPolicyUrl].
     *
     * Unlike [privacyPolicyUrl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("privacyPolicyURL")
    @ExcludeMissing
    fun _privacyPolicyUrl(): JsonField<String> = privacyPolicyUrl

    /**
     * Returns the raw JSON value of [termsAndConditionUrl].
     *
     * Unlike [termsAndConditionUrl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("termsAndConditionURL")
    @ExcludeMissing
    fun _termsAndConditionUrl(): JsonField<String> = termsAndConditionUrl

    /**
     * Returns the raw JSON value of [verificationStatus].
     *
     * Unlike [verificationStatus], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("verificationStatus")
    @ExcludeMissing
    fun _verificationStatus(): JsonField<TfVerificationStatus> = verificationStatus

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
         * Returns a mutable builder for constructing an instance of [VerificationRequestEgress].
         *
         * The following fields are required:
         * ```java
         * .id()
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
         * .verificationRequestId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VerificationRequestEgress]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
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
        private var verificationRequestId: JsonField<String>? = null
        private var ageGatedContent: JsonField<Boolean> = JsonMissing.of()
        private var businessAddr2: JsonField<String> = JsonMissing.of()
        private var businessRegistrationCountry: JsonField<String> = JsonMissing.of()
        private var businessRegistrationNumber: JsonField<String> = JsonMissing.of()
        private var businessRegistrationType: JsonField<String> = JsonMissing.of()
        private var doingBusinessAs: JsonField<String> = JsonMissing.of()
        private var entityType: JsonField<TollFreeVerificationEntityType> = JsonMissing.of()
        private var helpMessageResponse: JsonField<String> = JsonMissing.of()
        private var optInConfirmationResponse: JsonField<String> = JsonMissing.of()
        private var optInKeywords: JsonField<String> = JsonMissing.of()
        private var privacyPolicyUrl: JsonField<String> = JsonMissing.of()
        private var termsAndConditionUrl: JsonField<String> = JsonMissing.of()
        private var verificationStatus: JsonField<TfVerificationStatus> = JsonMissing.of()
        private var webhookUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(verificationRequestEgress: VerificationRequestEgress) = apply {
            id = verificationRequestEgress.id
            additionalInformation = verificationRequestEgress.additionalInformation
            businessAddr1 = verificationRequestEgress.businessAddr1
            businessCity = verificationRequestEgress.businessCity
            businessContactEmail = verificationRequestEgress.businessContactEmail
            businessContactFirstName = verificationRequestEgress.businessContactFirstName
            businessContactLastName = verificationRequestEgress.businessContactLastName
            businessContactPhone = verificationRequestEgress.businessContactPhone
            businessName = verificationRequestEgress.businessName
            businessState = verificationRequestEgress.businessState
            businessZip = verificationRequestEgress.businessZip
            corporateWebsite = verificationRequestEgress.corporateWebsite
            isvReseller = verificationRequestEgress.isvReseller
            messageVolume = verificationRequestEgress.messageVolume
            optInWorkflow = verificationRequestEgress.optInWorkflow
            optInWorkflowImageUrls =
                verificationRequestEgress.optInWorkflowImageUrls.map { it.toMutableList() }
            phoneNumbers = verificationRequestEgress.phoneNumbers.map { it.toMutableList() }
            productionMessageContent = verificationRequestEgress.productionMessageContent
            useCase = verificationRequestEgress.useCase
            useCaseSummary = verificationRequestEgress.useCaseSummary
            verificationRequestId = verificationRequestEgress.verificationRequestId
            ageGatedContent = verificationRequestEgress.ageGatedContent
            businessAddr2 = verificationRequestEgress.businessAddr2
            businessRegistrationCountry = verificationRequestEgress.businessRegistrationCountry
            businessRegistrationNumber = verificationRequestEgress.businessRegistrationNumber
            businessRegistrationType = verificationRequestEgress.businessRegistrationType
            doingBusinessAs = verificationRequestEgress.doingBusinessAs
            entityType = verificationRequestEgress.entityType
            helpMessageResponse = verificationRequestEgress.helpMessageResponse
            optInConfirmationResponse = verificationRequestEgress.optInConfirmationResponse
            optInKeywords = verificationRequestEgress.optInKeywords
            privacyPolicyUrl = verificationRequestEgress.privacyPolicyUrl
            termsAndConditionUrl = verificationRequestEgress.termsAndConditionUrl
            verificationStatus = verificationRequestEgress.verificationStatus
            webhookUrl = verificationRequestEgress.webhookUrl
            additionalProperties = verificationRequestEgress.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

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

        fun businessZip(businessZip: String) = businessZip(JsonField.of(businessZip))

        /**
         * Sets [Builder.businessZip] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessZip] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun businessZip(businessZip: JsonField<String>) = apply { this.businessZip = businessZip }

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

        fun verificationRequestId(verificationRequestId: String) =
            verificationRequestId(JsonField.of(verificationRequestId))

        /**
         * Sets [Builder.verificationRequestId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.verificationRequestId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun verificationRequestId(verificationRequestId: JsonField<String>) = apply {
            this.verificationRequestId = verificationRequestId
        }

        fun ageGatedContent(ageGatedContent: Boolean) =
            ageGatedContent(JsonField.of(ageGatedContent))

        /**
         * Sets [Builder.ageGatedContent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ageGatedContent] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ageGatedContent(ageGatedContent: JsonField<Boolean>) = apply {
            this.ageGatedContent = ageGatedContent
        }

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

        fun businessRegistrationCountry(businessRegistrationCountry: String) =
            businessRegistrationCountry(JsonField.of(businessRegistrationCountry))

        /**
         * Sets [Builder.businessRegistrationCountry] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessRegistrationCountry] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun businessRegistrationCountry(businessRegistrationCountry: JsonField<String>) = apply {
            this.businessRegistrationCountry = businessRegistrationCountry
        }

        fun businessRegistrationNumber(businessRegistrationNumber: String) =
            businessRegistrationNumber(JsonField.of(businessRegistrationNumber))

        /**
         * Sets [Builder.businessRegistrationNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessRegistrationNumber] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun businessRegistrationNumber(businessRegistrationNumber: JsonField<String>) = apply {
            this.businessRegistrationNumber = businessRegistrationNumber
        }

        fun businessRegistrationType(businessRegistrationType: String) =
            businessRegistrationType(JsonField.of(businessRegistrationType))

        /**
         * Sets [Builder.businessRegistrationType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessRegistrationType] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun businessRegistrationType(businessRegistrationType: JsonField<String>) = apply {
            this.businessRegistrationType = businessRegistrationType
        }

        fun doingBusinessAs(doingBusinessAs: String) =
            doingBusinessAs(JsonField.of(doingBusinessAs))

        /**
         * Sets [Builder.doingBusinessAs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.doingBusinessAs] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun doingBusinessAs(doingBusinessAs: JsonField<String>) = apply {
            this.doingBusinessAs = doingBusinessAs
        }

        /** Business entity classification */
        fun entityType(entityType: TollFreeVerificationEntityType) =
            entityType(JsonField.of(entityType))

        /**
         * Sets [Builder.entityType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entityType] with a well-typed
         * [TollFreeVerificationEntityType] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun entityType(entityType: JsonField<TollFreeVerificationEntityType>) = apply {
            this.entityType = entityType
        }

        fun helpMessageResponse(helpMessageResponse: String) =
            helpMessageResponse(JsonField.of(helpMessageResponse))

        /**
         * Sets [Builder.helpMessageResponse] to an arbitrary JSON value.
         *
         * You should usually call [Builder.helpMessageResponse] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun helpMessageResponse(helpMessageResponse: JsonField<String>) = apply {
            this.helpMessageResponse = helpMessageResponse
        }

        fun optInConfirmationResponse(optInConfirmationResponse: String) =
            optInConfirmationResponse(JsonField.of(optInConfirmationResponse))

        /**
         * Sets [Builder.optInConfirmationResponse] to an arbitrary JSON value.
         *
         * You should usually call [Builder.optInConfirmationResponse] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun optInConfirmationResponse(optInConfirmationResponse: JsonField<String>) = apply {
            this.optInConfirmationResponse = optInConfirmationResponse
        }

        fun optInKeywords(optInKeywords: String) = optInKeywords(JsonField.of(optInKeywords))

        /**
         * Sets [Builder.optInKeywords] to an arbitrary JSON value.
         *
         * You should usually call [Builder.optInKeywords] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun optInKeywords(optInKeywords: JsonField<String>) = apply {
            this.optInKeywords = optInKeywords
        }

        fun privacyPolicyUrl(privacyPolicyUrl: String) =
            privacyPolicyUrl(JsonField.of(privacyPolicyUrl))

        /**
         * Sets [Builder.privacyPolicyUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.privacyPolicyUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun privacyPolicyUrl(privacyPolicyUrl: JsonField<String>) = apply {
            this.privacyPolicyUrl = privacyPolicyUrl
        }

        fun termsAndConditionUrl(termsAndConditionUrl: String) =
            termsAndConditionUrl(JsonField.of(termsAndConditionUrl))

        /**
         * Sets [Builder.termsAndConditionUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.termsAndConditionUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun termsAndConditionUrl(termsAndConditionUrl: JsonField<String>) = apply {
            this.termsAndConditionUrl = termsAndConditionUrl
        }

        /** Tollfree verification status */
        fun verificationStatus(verificationStatus: TfVerificationStatus) =
            verificationStatus(JsonField.of(verificationStatus))

        /**
         * Sets [Builder.verificationStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.verificationStatus] with a well-typed
         * [TfVerificationStatus] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun verificationStatus(verificationStatus: JsonField<TfVerificationStatus>) = apply {
            this.verificationStatus = verificationStatus
        }

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
         * Returns an immutable instance of [VerificationRequestEgress].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
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
         * .verificationRequestId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VerificationRequestEgress =
            VerificationRequestEgress(
                checkRequired("id", id),
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
                checkRequired("verificationRequestId", verificationRequestId),
                ageGatedContent,
                businessAddr2,
                businessRegistrationCountry,
                businessRegistrationNumber,
                businessRegistrationType,
                doingBusinessAs,
                entityType,
                helpMessageResponse,
                optInConfirmationResponse,
                optInKeywords,
                privacyPolicyUrl,
                termsAndConditionUrl,
                verificationStatus,
                webhookUrl,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): VerificationRequestEgress = apply {
        if (validated) {
            return@apply
        }

        id()
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
        verificationRequestId()
        ageGatedContent()
        businessAddr2()
        businessRegistrationCountry()
        businessRegistrationNumber()
        businessRegistrationType()
        doingBusinessAs()
        entityType().ifPresent { it.validate() }
        helpMessageResponse()
        optInConfirmationResponse()
        optInKeywords()
        privacyPolicyUrl()
        termsAndConditionUrl()
        verificationStatus().ifPresent { it.validate() }
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
        (if (id.asKnown().isPresent) 1 else 0) +
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
            (if (verificationRequestId.asKnown().isPresent) 1 else 0) +
            (if (ageGatedContent.asKnown().isPresent) 1 else 0) +
            (if (businessAddr2.asKnown().isPresent) 1 else 0) +
            (if (businessRegistrationCountry.asKnown().isPresent) 1 else 0) +
            (if (businessRegistrationNumber.asKnown().isPresent) 1 else 0) +
            (if (businessRegistrationType.asKnown().isPresent) 1 else 0) +
            (if (doingBusinessAs.asKnown().isPresent) 1 else 0) +
            (entityType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (helpMessageResponse.asKnown().isPresent) 1 else 0) +
            (if (optInConfirmationResponse.asKnown().isPresent) 1 else 0) +
            (if (optInKeywords.asKnown().isPresent) 1 else 0) +
            (if (privacyPolicyUrl.asKnown().isPresent) 1 else 0) +
            (if (termsAndConditionUrl.asKnown().isPresent) 1 else 0) +
            (verificationStatus.asKnown().getOrNull()?.validity() ?: 0) +
            (if (webhookUrl.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VerificationRequestEgress &&
            id == other.id &&
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
            verificationRequestId == other.verificationRequestId &&
            ageGatedContent == other.ageGatedContent &&
            businessAddr2 == other.businessAddr2 &&
            businessRegistrationCountry == other.businessRegistrationCountry &&
            businessRegistrationNumber == other.businessRegistrationNumber &&
            businessRegistrationType == other.businessRegistrationType &&
            doingBusinessAs == other.doingBusinessAs &&
            entityType == other.entityType &&
            helpMessageResponse == other.helpMessageResponse &&
            optInConfirmationResponse == other.optInConfirmationResponse &&
            optInKeywords == other.optInKeywords &&
            privacyPolicyUrl == other.privacyPolicyUrl &&
            termsAndConditionUrl == other.termsAndConditionUrl &&
            verificationStatus == other.verificationStatus &&
            webhookUrl == other.webhookUrl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
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
            verificationRequestId,
            ageGatedContent,
            businessAddr2,
            businessRegistrationCountry,
            businessRegistrationNumber,
            businessRegistrationType,
            doingBusinessAs,
            entityType,
            helpMessageResponse,
            optInConfirmationResponse,
            optInKeywords,
            privacyPolicyUrl,
            termsAndConditionUrl,
            verificationStatus,
            webhookUrl,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VerificationRequestEgress{id=$id, additionalInformation=$additionalInformation, businessAddr1=$businessAddr1, businessCity=$businessCity, businessContactEmail=$businessContactEmail, businessContactFirstName=$businessContactFirstName, businessContactLastName=$businessContactLastName, businessContactPhone=$businessContactPhone, businessName=$businessName, businessState=$businessState, businessZip=$businessZip, corporateWebsite=$corporateWebsite, isvReseller=$isvReseller, messageVolume=$messageVolume, optInWorkflow=$optInWorkflow, optInWorkflowImageUrls=$optInWorkflowImageUrls, phoneNumbers=$phoneNumbers, productionMessageContent=$productionMessageContent, useCase=$useCase, useCaseSummary=$useCaseSummary, verificationRequestId=$verificationRequestId, ageGatedContent=$ageGatedContent, businessAddr2=$businessAddr2, businessRegistrationCountry=$businessRegistrationCountry, businessRegistrationNumber=$businessRegistrationNumber, businessRegistrationType=$businessRegistrationType, doingBusinessAs=$doingBusinessAs, entityType=$entityType, helpMessageResponse=$helpMessageResponse, optInConfirmationResponse=$optInConfirmationResponse, optInKeywords=$optInKeywords, privacyPolicyUrl=$privacyPolicyUrl, termsAndConditionUrl=$termsAndConditionUrl, verificationStatus=$verificationStatus, webhookUrl=$webhookUrl, additionalProperties=$additionalProperties}"
}
