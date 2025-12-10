// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc.campaign

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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CampaignListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val page: JsonField<Long>,
    private val records: JsonField<List<Record>>,
    private val totalRecords: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("page") @ExcludeMissing page: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("records")
        @ExcludeMissing
        records: JsonField<List<Record>> = JsonMissing.of(),
        @JsonProperty("totalRecords")
        @ExcludeMissing
        totalRecords: JsonField<Long> = JsonMissing.of(),
    ) : this(page, records, totalRecords, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun page(): Optional<Long> = page.getOptional("page")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun records(): Optional<List<Record>> = records.getOptional("records")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalRecords(): Optional<Long> = totalRecords.getOptional("totalRecords")

    /**
     * Returns the raw JSON value of [page].
     *
     * Unlike [page], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("page") @ExcludeMissing fun _page(): JsonField<Long> = page

    /**
     * Returns the raw JSON value of [records].
     *
     * Unlike [records], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("records") @ExcludeMissing fun _records(): JsonField<List<Record>> = records

    /**
     * Returns the raw JSON value of [totalRecords].
     *
     * Unlike [totalRecords], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("totalRecords")
    @ExcludeMissing
    fun _totalRecords(): JsonField<Long> = totalRecords

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

        /** Returns a mutable builder for constructing an instance of [CampaignListResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CampaignListResponse]. */
    class Builder internal constructor() {

        private var page: JsonField<Long> = JsonMissing.of()
        private var records: JsonField<MutableList<Record>>? = null
        private var totalRecords: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(campaignListResponse: CampaignListResponse) = apply {
            page = campaignListResponse.page
            records = campaignListResponse.records.map { it.toMutableList() }
            totalRecords = campaignListResponse.totalRecords
            additionalProperties = campaignListResponse.additionalProperties.toMutableMap()
        }

        fun page(page: Long) = page(JsonField.of(page))

        /**
         * Sets [Builder.page] to an arbitrary JSON value.
         *
         * You should usually call [Builder.page] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun page(page: JsonField<Long>) = apply { this.page = page }

        fun records(records: List<Record>) = records(JsonField.of(records))

        /**
         * Sets [Builder.records] to an arbitrary JSON value.
         *
         * You should usually call [Builder.records] with a well-typed `List<Record>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun records(records: JsonField<List<Record>>) = apply {
            this.records = records.map { it.toMutableList() }
        }

        /**
         * Adds a single [Record] to [records].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRecord(record: Record) = apply {
            records =
                (records ?: JsonField.of(mutableListOf())).also {
                    checkKnown("records", it).add(record)
                }
        }

        fun totalRecords(totalRecords: Long) = totalRecords(JsonField.of(totalRecords))

        /**
         * Sets [Builder.totalRecords] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalRecords] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalRecords(totalRecords: JsonField<Long>) = apply { this.totalRecords = totalRecords }

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
         * Returns an immutable instance of [CampaignListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CampaignListResponse =
            CampaignListResponse(
                page,
                (records ?: JsonMissing.of()).map { it.toImmutable() },
                totalRecords,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CampaignListResponse = apply {
        if (validated) {
            return@apply
        }

        page()
        records().ifPresent { it.forEach { it.validate() } }
        totalRecords()
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
        (if (page.asKnown().isPresent) 1 else 0) +
            (records.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (totalRecords.asKnown().isPresent) 1 else 0)

    class Record
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val ageGated: JsonField<Boolean>,
        private val assignedPhoneNumbersCount: JsonField<Double>,
        private val autoRenewal: JsonField<Boolean>,
        private val billedDate: JsonField<String>,
        private val brandDisplayName: JsonField<String>,
        private val brandId: JsonField<String>,
        private val campaignId: JsonField<String>,
        private val campaignStatus: JsonField<CampaignStatus>,
        private val createDate: JsonField<String>,
        private val cspId: JsonField<String>,
        private val description: JsonField<String>,
        private val directLending: JsonField<Boolean>,
        private val embeddedLink: JsonField<Boolean>,
        private val embeddedLinkSample: JsonField<String>,
        private val embeddedPhone: JsonField<Boolean>,
        private val failureReasons: JsonField<String>,
        private val helpKeywords: JsonField<String>,
        private val helpMessage: JsonField<String>,
        private val isTMobileNumberPoolingEnabled: JsonField<Boolean>,
        private val isTMobileRegistered: JsonField<Boolean>,
        private val isTMobileSuspended: JsonField<Boolean>,
        private val messageFlow: JsonField<String>,
        private val mock: JsonField<Boolean>,
        private val nextRenewalOrExpirationDate: JsonField<String>,
        private val numberPool: JsonField<Boolean>,
        private val optinKeywords: JsonField<String>,
        private val optinMessage: JsonField<String>,
        private val optoutKeywords: JsonField<String>,
        private val optoutMessage: JsonField<String>,
        private val privacyPolicyLink: JsonField<String>,
        private val referenceId: JsonField<String>,
        private val resellerId: JsonField<String>,
        private val sample1: JsonField<String>,
        private val sample2: JsonField<String>,
        private val sample3: JsonField<String>,
        private val sample4: JsonField<String>,
        private val sample5: JsonField<String>,
        private val status: JsonField<String>,
        private val submissionStatus: JsonField<SubmissionStatus>,
        private val subscriberHelp: JsonField<Boolean>,
        private val subscriberOptin: JsonField<Boolean>,
        private val subscriberOptout: JsonField<Boolean>,
        private val subUsecases: JsonField<List<String>>,
        private val tcrBrandId: JsonField<String>,
        private val tcrCampaignId: JsonField<String>,
        private val termsAndConditions: JsonField<Boolean>,
        private val termsAndConditionsLink: JsonField<String>,
        private val usecase: JsonField<String>,
        private val vertical: JsonField<String>,
        private val webhookFailoverUrl: JsonField<String>,
        private val webhookUrl: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("ageGated")
            @ExcludeMissing
            ageGated: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("assignedPhoneNumbersCount")
            @ExcludeMissing
            assignedPhoneNumbersCount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("autoRenewal")
            @ExcludeMissing
            autoRenewal: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("billedDate")
            @ExcludeMissing
            billedDate: JsonField<String> = JsonMissing.of(),
            @JsonProperty("brandDisplayName")
            @ExcludeMissing
            brandDisplayName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("brandId") @ExcludeMissing brandId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("campaignId")
            @ExcludeMissing
            campaignId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("campaignStatus")
            @ExcludeMissing
            campaignStatus: JsonField<CampaignStatus> = JsonMissing.of(),
            @JsonProperty("createDate")
            @ExcludeMissing
            createDate: JsonField<String> = JsonMissing.of(),
            @JsonProperty("cspId") @ExcludeMissing cspId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("directLending")
            @ExcludeMissing
            directLending: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("embeddedLink")
            @ExcludeMissing
            embeddedLink: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("embeddedLinkSample")
            @ExcludeMissing
            embeddedLinkSample: JsonField<String> = JsonMissing.of(),
            @JsonProperty("embeddedPhone")
            @ExcludeMissing
            embeddedPhone: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("failureReasons")
            @ExcludeMissing
            failureReasons: JsonField<String> = JsonMissing.of(),
            @JsonProperty("helpKeywords")
            @ExcludeMissing
            helpKeywords: JsonField<String> = JsonMissing.of(),
            @JsonProperty("helpMessage")
            @ExcludeMissing
            helpMessage: JsonField<String> = JsonMissing.of(),
            @JsonProperty("isTMobileNumberPoolingEnabled")
            @ExcludeMissing
            isTMobileNumberPoolingEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("isTMobileRegistered")
            @ExcludeMissing
            isTMobileRegistered: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("isTMobileSuspended")
            @ExcludeMissing
            isTMobileSuspended: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("messageFlow")
            @ExcludeMissing
            messageFlow: JsonField<String> = JsonMissing.of(),
            @JsonProperty("mock") @ExcludeMissing mock: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("nextRenewalOrExpirationDate")
            @ExcludeMissing
            nextRenewalOrExpirationDate: JsonField<String> = JsonMissing.of(),
            @JsonProperty("numberPool")
            @ExcludeMissing
            numberPool: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("optinKeywords")
            @ExcludeMissing
            optinKeywords: JsonField<String> = JsonMissing.of(),
            @JsonProperty("optinMessage")
            @ExcludeMissing
            optinMessage: JsonField<String> = JsonMissing.of(),
            @JsonProperty("optoutKeywords")
            @ExcludeMissing
            optoutKeywords: JsonField<String> = JsonMissing.of(),
            @JsonProperty("optoutMessage")
            @ExcludeMissing
            optoutMessage: JsonField<String> = JsonMissing.of(),
            @JsonProperty("privacyPolicyLink")
            @ExcludeMissing
            privacyPolicyLink: JsonField<String> = JsonMissing.of(),
            @JsonProperty("referenceId")
            @ExcludeMissing
            referenceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("resellerId")
            @ExcludeMissing
            resellerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sample1") @ExcludeMissing sample1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sample2") @ExcludeMissing sample2: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sample3") @ExcludeMissing sample3: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sample4") @ExcludeMissing sample4: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sample5") @ExcludeMissing sample5: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
            @JsonProperty("submissionStatus")
            @ExcludeMissing
            submissionStatus: JsonField<SubmissionStatus> = JsonMissing.of(),
            @JsonProperty("subscriberHelp")
            @ExcludeMissing
            subscriberHelp: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("subscriberOptin")
            @ExcludeMissing
            subscriberOptin: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("subscriberOptout")
            @ExcludeMissing
            subscriberOptout: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("subUsecases")
            @ExcludeMissing
            subUsecases: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("tcrBrandId")
            @ExcludeMissing
            tcrBrandId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tcrCampaignId")
            @ExcludeMissing
            tcrCampaignId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("termsAndConditions")
            @ExcludeMissing
            termsAndConditions: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("termsAndConditionsLink")
            @ExcludeMissing
            termsAndConditionsLink: JsonField<String> = JsonMissing.of(),
            @JsonProperty("usecase") @ExcludeMissing usecase: JsonField<String> = JsonMissing.of(),
            @JsonProperty("vertical")
            @ExcludeMissing
            vertical: JsonField<String> = JsonMissing.of(),
            @JsonProperty("webhookFailoverURL")
            @ExcludeMissing
            webhookFailoverUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("webhookURL")
            @ExcludeMissing
            webhookUrl: JsonField<String> = JsonMissing.of(),
        ) : this(
            ageGated,
            assignedPhoneNumbersCount,
            autoRenewal,
            billedDate,
            brandDisplayName,
            brandId,
            campaignId,
            campaignStatus,
            createDate,
            cspId,
            description,
            directLending,
            embeddedLink,
            embeddedLinkSample,
            embeddedPhone,
            failureReasons,
            helpKeywords,
            helpMessage,
            isTMobileNumberPoolingEnabled,
            isTMobileRegistered,
            isTMobileSuspended,
            messageFlow,
            mock,
            nextRenewalOrExpirationDate,
            numberPool,
            optinKeywords,
            optinMessage,
            optoutKeywords,
            optoutMessage,
            privacyPolicyLink,
            referenceId,
            resellerId,
            sample1,
            sample2,
            sample3,
            sample4,
            sample5,
            status,
            submissionStatus,
            subscriberHelp,
            subscriberOptin,
            subscriberOptout,
            subUsecases,
            tcrBrandId,
            tcrCampaignId,
            termsAndConditions,
            termsAndConditionsLink,
            usecase,
            vertical,
            webhookFailoverUrl,
            webhookUrl,
            mutableMapOf(),
        )

        /**
         * Age gated content in campaign.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ageGated(): Optional<Boolean> = ageGated.getOptional("ageGated")

        /**
         * Number of phone numbers associated with the campaign
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun assignedPhoneNumbersCount(): Optional<Double> =
            assignedPhoneNumbersCount.getOptional("assignedPhoneNumbersCount")

        /**
         * Campaign subscription auto-renewal status.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun autoRenewal(): Optional<Boolean> = autoRenewal.getOptional("autoRenewal")

        /**
         * Campaign recent billed date.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun billedDate(): Optional<String> = billedDate.getOptional("billedDate")

        /**
         * Display or marketing name of the brand.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun brandDisplayName(): Optional<String> = brandDisplayName.getOptional("brandDisplayName")

        /**
         * Unique identifier assigned to the brand.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun brandId(): Optional<String> = brandId.getOptional("brandId")

        /**
         * Unique identifier for a campaign.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun campaignId(): Optional<String> = campaignId.getOptional("campaignId")

        /**
         * Campaign status
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun campaignStatus(): Optional<CampaignStatus> =
            campaignStatus.getOptional("campaignStatus")

        /**
         * Unix timestamp when campaign was created.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createDate(): Optional<String> = createDate.getOptional("createDate")

        /**
         * Alphanumeric identifier of the CSP associated with this campaign.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cspId(): Optional<String> = cspId.getOptional("cspId")

        /**
         * Summary description of this campaign.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun directLending(): Optional<Boolean> = directLending.getOptional("directLending")

        /**
         * Does message generated by the campaign include URL link in SMS?
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun embeddedLink(): Optional<Boolean> = embeddedLink.getOptional("embeddedLink")

        /**
         * Sample of an embedded link that will be sent to subscribers.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun embeddedLinkSample(): Optional<String> =
            embeddedLinkSample.getOptional("embeddedLinkSample")

        /**
         * Does message generated by the campaign include phone number in SMS?
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun embeddedPhone(): Optional<Boolean> = embeddedPhone.getOptional("embeddedPhone")

        /**
         * Failure reasons if campaign submission failed
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun failureReasons(): Optional<String> = failureReasons.getOptional("failureReasons")

        /**
         * Subscriber help keywords. Multiple keywords are comma separated without space.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun helpKeywords(): Optional<String> = helpKeywords.getOptional("helpKeywords")

        /**
         * Help message of the campaign.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun helpMessage(): Optional<String> = helpMessage.getOptional("helpMessage")

        /**
         * Indicates whether the campaign has a T-Mobile number pool ID associated with it.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun isTMobileNumberPoolingEnabled(): Optional<Boolean> =
            isTMobileNumberPoolingEnabled.getOptional("isTMobileNumberPoolingEnabled")

        /**
         * Indicates whether the campaign is registered with T-Mobile.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun isTMobileRegistered(): Optional<Boolean> =
            isTMobileRegistered.getOptional("isTMobileRegistered")

        /**
         * Indicates whether the campaign is suspended with T-Mobile.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun isTMobileSuspended(): Optional<Boolean> =
            isTMobileSuspended.getOptional("isTMobileSuspended")

        /**
         * Message flow description.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun messageFlow(): Optional<String> = messageFlow.getOptional("messageFlow")

        /**
         * Campaign created from mock brand. Mocked campaign cannot be shared with an upstream CNP.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mock(): Optional<Boolean> = mock.getOptional("mock")

        /**
         * When the campaign would be due for its next renew/bill date.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun nextRenewalOrExpirationDate(): Optional<String> =
            nextRenewalOrExpirationDate.getOptional("nextRenewalOrExpirationDate")

        /**
         * Does campaign utilize pool of phone numbers?
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun numberPool(): Optional<Boolean> = numberPool.getOptional("numberPool")

        /**
         * Subscriber opt-in keywords. Multiple keywords are comma separated without space.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun optinKeywords(): Optional<String> = optinKeywords.getOptional("optinKeywords")

        /**
         * Subscriber opt-in message.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun optinMessage(): Optional<String> = optinMessage.getOptional("optinMessage")

        /**
         * Subscriber opt-out keywords. Multiple keywords are comma separated without space.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun optoutKeywords(): Optional<String> = optoutKeywords.getOptional("optoutKeywords")

        /**
         * Subscriber opt-out message.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun optoutMessage(): Optional<String> = optoutMessage.getOptional("optoutMessage")

        /**
         * Link to the campaign's privacy policy.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun privacyPolicyLink(): Optional<String> =
            privacyPolicyLink.getOptional("privacyPolicyLink")

        /**
         * Caller supplied campaign reference ID. If supplied, the value must be unique across all
         * submitted campaigns. Can be used to prevent duplicate campaign registrations.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun referenceId(): Optional<String> = referenceId.getOptional("referenceId")

        /**
         * Alphanumeric identifier of the reseller that you want to associate with this campaign.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun resellerId(): Optional<String> = resellerId.getOptional("resellerId")

        /**
         * Message sample. Some campaign tiers require 1 or more message samples.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sample1(): Optional<String> = sample1.getOptional("sample1")

        /**
         * Message sample. Some campaign tiers require 2 or more message samples.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sample2(): Optional<String> = sample2.getOptional("sample2")

        /**
         * Message sample. Some campaign tiers require 3 or more message samples.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sample3(): Optional<String> = sample3.getOptional("sample3")

        /**
         * Message sample. Some campaign tiers require 4 or more message samples.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sample4(): Optional<String> = sample4.getOptional("sample4")

        /**
         * Message sample. Some campaign tiers require 5 or more message samples.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sample5(): Optional<String> = sample5.getOptional("sample5")

        /**
         * Current campaign status. Possible values: ACTIVE, EXPIRED. A newly created campaign
         * defaults to ACTIVE status.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun status(): Optional<String> = status.getOptional("status")

        /**
         * Campaign submission status
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun submissionStatus(): Optional<SubmissionStatus> =
            submissionStatus.getOptional("submissionStatus")

        /**
         * Does campaign responds to help keyword(s)?
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun subscriberHelp(): Optional<Boolean> = subscriberHelp.getOptional("subscriberHelp")

        /**
         * Does campaign require subscriber to opt-in before SMS is sent to subscriber?
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun subscriberOptin(): Optional<Boolean> = subscriberOptin.getOptional("subscriberOptin")

        /**
         * Does campaign support subscriber opt-out keyword(s)?
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun subscriberOptout(): Optional<Boolean> = subscriberOptout.getOptional("subscriberOptout")

        /**
         * Campaign sub-usecases. Must be of defined valid sub-usecase types. Use
         * `/registry/enum/usecase` operation to retrieve list of valid sub-usecases
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun subUsecases(): Optional<List<String>> = subUsecases.getOptional("subUsecases")

        /**
         * Unique identifier assigned to the brand by the registry.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tcrBrandId(): Optional<String> = tcrBrandId.getOptional("tcrBrandId")

        /**
         * Unique identifier assigned to the campaign by the registry.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tcrCampaignId(): Optional<String> = tcrCampaignId.getOptional("tcrCampaignId")

        /**
         * Is terms & conditions accepted?
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun termsAndConditions(): Optional<Boolean> =
            termsAndConditions.getOptional("termsAndConditions")

        /**
         * Link to the campaign's terms and conditions.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun termsAndConditionsLink(): Optional<String> =
            termsAndConditionsLink.getOptional("termsAndConditionsLink")

        /**
         * Campaign usecase. Must be of defined valid types. Use `/registry/enum/usecase` operation
         * to retrieve usecases available for given brand.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun usecase(): Optional<String> = usecase.getOptional("usecase")

        /**
         * Business/industry segment of this campaign (Deprecated). Must be of defined valid types.
         * Use `/registry/enum/vertical` operation to retrieve verticals available for given brand,
         * vertical combination.
         *
         * This field is deprecated.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun vertical(): Optional<String> = vertical.getOptional("vertical")

        /**
         * Failover webhook to which campaign status updates are sent.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun webhookFailoverUrl(): Optional<String> =
            webhookFailoverUrl.getOptional("webhookFailoverURL")

        /**
         * Webhook to which campaign status updates are sent.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun webhookUrl(): Optional<String> = webhookUrl.getOptional("webhookURL")

        /**
         * Returns the raw JSON value of [ageGated].
         *
         * Unlike [ageGated], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ageGated") @ExcludeMissing fun _ageGated(): JsonField<Boolean> = ageGated

        /**
         * Returns the raw JSON value of [assignedPhoneNumbersCount].
         *
         * Unlike [assignedPhoneNumbersCount], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("assignedPhoneNumbersCount")
        @ExcludeMissing
        fun _assignedPhoneNumbersCount(): JsonField<Double> = assignedPhoneNumbersCount

        /**
         * Returns the raw JSON value of [autoRenewal].
         *
         * Unlike [autoRenewal], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("autoRenewal")
        @ExcludeMissing
        fun _autoRenewal(): JsonField<Boolean> = autoRenewal

        /**
         * Returns the raw JSON value of [billedDate].
         *
         * Unlike [billedDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("billedDate")
        @ExcludeMissing
        fun _billedDate(): JsonField<String> = billedDate

        /**
         * Returns the raw JSON value of [brandDisplayName].
         *
         * Unlike [brandDisplayName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("brandDisplayName")
        @ExcludeMissing
        fun _brandDisplayName(): JsonField<String> = brandDisplayName

        /**
         * Returns the raw JSON value of [brandId].
         *
         * Unlike [brandId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("brandId") @ExcludeMissing fun _brandId(): JsonField<String> = brandId

        /**
         * Returns the raw JSON value of [campaignId].
         *
         * Unlike [campaignId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("campaignId")
        @ExcludeMissing
        fun _campaignId(): JsonField<String> = campaignId

        /**
         * Returns the raw JSON value of [campaignStatus].
         *
         * Unlike [campaignStatus], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("campaignStatus")
        @ExcludeMissing
        fun _campaignStatus(): JsonField<CampaignStatus> = campaignStatus

        /**
         * Returns the raw JSON value of [createDate].
         *
         * Unlike [createDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("createDate")
        @ExcludeMissing
        fun _createDate(): JsonField<String> = createDate

        /**
         * Returns the raw JSON value of [cspId].
         *
         * Unlike [cspId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cspId") @ExcludeMissing fun _cspId(): JsonField<String> = cspId

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [directLending].
         *
         * Unlike [directLending], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("directLending")
        @ExcludeMissing
        fun _directLending(): JsonField<Boolean> = directLending

        /**
         * Returns the raw JSON value of [embeddedLink].
         *
         * Unlike [embeddedLink], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("embeddedLink")
        @ExcludeMissing
        fun _embeddedLink(): JsonField<Boolean> = embeddedLink

        /**
         * Returns the raw JSON value of [embeddedLinkSample].
         *
         * Unlike [embeddedLinkSample], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("embeddedLinkSample")
        @ExcludeMissing
        fun _embeddedLinkSample(): JsonField<String> = embeddedLinkSample

        /**
         * Returns the raw JSON value of [embeddedPhone].
         *
         * Unlike [embeddedPhone], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("embeddedPhone")
        @ExcludeMissing
        fun _embeddedPhone(): JsonField<Boolean> = embeddedPhone

        /**
         * Returns the raw JSON value of [failureReasons].
         *
         * Unlike [failureReasons], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("failureReasons")
        @ExcludeMissing
        fun _failureReasons(): JsonField<String> = failureReasons

        /**
         * Returns the raw JSON value of [helpKeywords].
         *
         * Unlike [helpKeywords], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("helpKeywords")
        @ExcludeMissing
        fun _helpKeywords(): JsonField<String> = helpKeywords

        /**
         * Returns the raw JSON value of [helpMessage].
         *
         * Unlike [helpMessage], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("helpMessage")
        @ExcludeMissing
        fun _helpMessage(): JsonField<String> = helpMessage

        /**
         * Returns the raw JSON value of [isTMobileNumberPoolingEnabled].
         *
         * Unlike [isTMobileNumberPoolingEnabled], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("isTMobileNumberPoolingEnabled")
        @ExcludeMissing
        fun _isTMobileNumberPoolingEnabled(): JsonField<Boolean> = isTMobileNumberPoolingEnabled

        /**
         * Returns the raw JSON value of [isTMobileRegistered].
         *
         * Unlike [isTMobileRegistered], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("isTMobileRegistered")
        @ExcludeMissing
        fun _isTMobileRegistered(): JsonField<Boolean> = isTMobileRegistered

        /**
         * Returns the raw JSON value of [isTMobileSuspended].
         *
         * Unlike [isTMobileSuspended], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("isTMobileSuspended")
        @ExcludeMissing
        fun _isTMobileSuspended(): JsonField<Boolean> = isTMobileSuspended

        /**
         * Returns the raw JSON value of [messageFlow].
         *
         * Unlike [messageFlow], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("messageFlow")
        @ExcludeMissing
        fun _messageFlow(): JsonField<String> = messageFlow

        /**
         * Returns the raw JSON value of [mock].
         *
         * Unlike [mock], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mock") @ExcludeMissing fun _mock(): JsonField<Boolean> = mock

        /**
         * Returns the raw JSON value of [nextRenewalOrExpirationDate].
         *
         * Unlike [nextRenewalOrExpirationDate], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("nextRenewalOrExpirationDate")
        @ExcludeMissing
        fun _nextRenewalOrExpirationDate(): JsonField<String> = nextRenewalOrExpirationDate

        /**
         * Returns the raw JSON value of [numberPool].
         *
         * Unlike [numberPool], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("numberPool")
        @ExcludeMissing
        fun _numberPool(): JsonField<Boolean> = numberPool

        /**
         * Returns the raw JSON value of [optinKeywords].
         *
         * Unlike [optinKeywords], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("optinKeywords")
        @ExcludeMissing
        fun _optinKeywords(): JsonField<String> = optinKeywords

        /**
         * Returns the raw JSON value of [optinMessage].
         *
         * Unlike [optinMessage], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("optinMessage")
        @ExcludeMissing
        fun _optinMessage(): JsonField<String> = optinMessage

        /**
         * Returns the raw JSON value of [optoutKeywords].
         *
         * Unlike [optoutKeywords], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("optoutKeywords")
        @ExcludeMissing
        fun _optoutKeywords(): JsonField<String> = optoutKeywords

        /**
         * Returns the raw JSON value of [optoutMessage].
         *
         * Unlike [optoutMessage], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("optoutMessage")
        @ExcludeMissing
        fun _optoutMessage(): JsonField<String> = optoutMessage

        /**
         * Returns the raw JSON value of [privacyPolicyLink].
         *
         * Unlike [privacyPolicyLink], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("privacyPolicyLink")
        @ExcludeMissing
        fun _privacyPolicyLink(): JsonField<String> = privacyPolicyLink

        /**
         * Returns the raw JSON value of [referenceId].
         *
         * Unlike [referenceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("referenceId")
        @ExcludeMissing
        fun _referenceId(): JsonField<String> = referenceId

        /**
         * Returns the raw JSON value of [resellerId].
         *
         * Unlike [resellerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("resellerId")
        @ExcludeMissing
        fun _resellerId(): JsonField<String> = resellerId

        /**
         * Returns the raw JSON value of [sample1].
         *
         * Unlike [sample1], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sample1") @ExcludeMissing fun _sample1(): JsonField<String> = sample1

        /**
         * Returns the raw JSON value of [sample2].
         *
         * Unlike [sample2], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sample2") @ExcludeMissing fun _sample2(): JsonField<String> = sample2

        /**
         * Returns the raw JSON value of [sample3].
         *
         * Unlike [sample3], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sample3") @ExcludeMissing fun _sample3(): JsonField<String> = sample3

        /**
         * Returns the raw JSON value of [sample4].
         *
         * Unlike [sample4], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sample4") @ExcludeMissing fun _sample4(): JsonField<String> = sample4

        /**
         * Returns the raw JSON value of [sample5].
         *
         * Unlike [sample5], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sample5") @ExcludeMissing fun _sample5(): JsonField<String> = sample5

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

        /**
         * Returns the raw JSON value of [submissionStatus].
         *
         * Unlike [submissionStatus], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("submissionStatus")
        @ExcludeMissing
        fun _submissionStatus(): JsonField<SubmissionStatus> = submissionStatus

        /**
         * Returns the raw JSON value of [subscriberHelp].
         *
         * Unlike [subscriberHelp], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("subscriberHelp")
        @ExcludeMissing
        fun _subscriberHelp(): JsonField<Boolean> = subscriberHelp

        /**
         * Returns the raw JSON value of [subscriberOptin].
         *
         * Unlike [subscriberOptin], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("subscriberOptin")
        @ExcludeMissing
        fun _subscriberOptin(): JsonField<Boolean> = subscriberOptin

        /**
         * Returns the raw JSON value of [subscriberOptout].
         *
         * Unlike [subscriberOptout], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("subscriberOptout")
        @ExcludeMissing
        fun _subscriberOptout(): JsonField<Boolean> = subscriberOptout

        /**
         * Returns the raw JSON value of [subUsecases].
         *
         * Unlike [subUsecases], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("subUsecases")
        @ExcludeMissing
        fun _subUsecases(): JsonField<List<String>> = subUsecases

        /**
         * Returns the raw JSON value of [tcrBrandId].
         *
         * Unlike [tcrBrandId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tcrBrandId")
        @ExcludeMissing
        fun _tcrBrandId(): JsonField<String> = tcrBrandId

        /**
         * Returns the raw JSON value of [tcrCampaignId].
         *
         * Unlike [tcrCampaignId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("tcrCampaignId")
        @ExcludeMissing
        fun _tcrCampaignId(): JsonField<String> = tcrCampaignId

        /**
         * Returns the raw JSON value of [termsAndConditions].
         *
         * Unlike [termsAndConditions], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("termsAndConditions")
        @ExcludeMissing
        fun _termsAndConditions(): JsonField<Boolean> = termsAndConditions

        /**
         * Returns the raw JSON value of [termsAndConditionsLink].
         *
         * Unlike [termsAndConditionsLink], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("termsAndConditionsLink")
        @ExcludeMissing
        fun _termsAndConditionsLink(): JsonField<String> = termsAndConditionsLink

        /**
         * Returns the raw JSON value of [usecase].
         *
         * Unlike [usecase], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("usecase") @ExcludeMissing fun _usecase(): JsonField<String> = usecase

        /**
         * Returns the raw JSON value of [vertical].
         *
         * Unlike [vertical], this method doesn't throw if the JSON field has an unexpected type.
         */
        @Deprecated("deprecated")
        @JsonProperty("vertical")
        @ExcludeMissing
        fun _vertical(): JsonField<String> = vertical

        /**
         * Returns the raw JSON value of [webhookFailoverUrl].
         *
         * Unlike [webhookFailoverUrl], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("webhookFailoverURL")
        @ExcludeMissing
        fun _webhookFailoverUrl(): JsonField<String> = webhookFailoverUrl

        /**
         * Returns the raw JSON value of [webhookUrl].
         *
         * Unlike [webhookUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("webhookURL")
        @ExcludeMissing
        fun _webhookUrl(): JsonField<String> = webhookUrl

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

            /** Returns a mutable builder for constructing an instance of [Record]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Record]. */
        class Builder internal constructor() {

            private var ageGated: JsonField<Boolean> = JsonMissing.of()
            private var assignedPhoneNumbersCount: JsonField<Double> = JsonMissing.of()
            private var autoRenewal: JsonField<Boolean> = JsonMissing.of()
            private var billedDate: JsonField<String> = JsonMissing.of()
            private var brandDisplayName: JsonField<String> = JsonMissing.of()
            private var brandId: JsonField<String> = JsonMissing.of()
            private var campaignId: JsonField<String> = JsonMissing.of()
            private var campaignStatus: JsonField<CampaignStatus> = JsonMissing.of()
            private var createDate: JsonField<String> = JsonMissing.of()
            private var cspId: JsonField<String> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var directLending: JsonField<Boolean> = JsonMissing.of()
            private var embeddedLink: JsonField<Boolean> = JsonMissing.of()
            private var embeddedLinkSample: JsonField<String> = JsonMissing.of()
            private var embeddedPhone: JsonField<Boolean> = JsonMissing.of()
            private var failureReasons: JsonField<String> = JsonMissing.of()
            private var helpKeywords: JsonField<String> = JsonMissing.of()
            private var helpMessage: JsonField<String> = JsonMissing.of()
            private var isTMobileNumberPoolingEnabled: JsonField<Boolean> = JsonMissing.of()
            private var isTMobileRegistered: JsonField<Boolean> = JsonMissing.of()
            private var isTMobileSuspended: JsonField<Boolean> = JsonMissing.of()
            private var messageFlow: JsonField<String> = JsonMissing.of()
            private var mock: JsonField<Boolean> = JsonMissing.of()
            private var nextRenewalOrExpirationDate: JsonField<String> = JsonMissing.of()
            private var numberPool: JsonField<Boolean> = JsonMissing.of()
            private var optinKeywords: JsonField<String> = JsonMissing.of()
            private var optinMessage: JsonField<String> = JsonMissing.of()
            private var optoutKeywords: JsonField<String> = JsonMissing.of()
            private var optoutMessage: JsonField<String> = JsonMissing.of()
            private var privacyPolicyLink: JsonField<String> = JsonMissing.of()
            private var referenceId: JsonField<String> = JsonMissing.of()
            private var resellerId: JsonField<String> = JsonMissing.of()
            private var sample1: JsonField<String> = JsonMissing.of()
            private var sample2: JsonField<String> = JsonMissing.of()
            private var sample3: JsonField<String> = JsonMissing.of()
            private var sample4: JsonField<String> = JsonMissing.of()
            private var sample5: JsonField<String> = JsonMissing.of()
            private var status: JsonField<String> = JsonMissing.of()
            private var submissionStatus: JsonField<SubmissionStatus> = JsonMissing.of()
            private var subscriberHelp: JsonField<Boolean> = JsonMissing.of()
            private var subscriberOptin: JsonField<Boolean> = JsonMissing.of()
            private var subscriberOptout: JsonField<Boolean> = JsonMissing.of()
            private var subUsecases: JsonField<MutableList<String>>? = null
            private var tcrBrandId: JsonField<String> = JsonMissing.of()
            private var tcrCampaignId: JsonField<String> = JsonMissing.of()
            private var termsAndConditions: JsonField<Boolean> = JsonMissing.of()
            private var termsAndConditionsLink: JsonField<String> = JsonMissing.of()
            private var usecase: JsonField<String> = JsonMissing.of()
            private var vertical: JsonField<String> = JsonMissing.of()
            private var webhookFailoverUrl: JsonField<String> = JsonMissing.of()
            private var webhookUrl: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(record: Record) = apply {
                ageGated = record.ageGated
                assignedPhoneNumbersCount = record.assignedPhoneNumbersCount
                autoRenewal = record.autoRenewal
                billedDate = record.billedDate
                brandDisplayName = record.brandDisplayName
                brandId = record.brandId
                campaignId = record.campaignId
                campaignStatus = record.campaignStatus
                createDate = record.createDate
                cspId = record.cspId
                description = record.description
                directLending = record.directLending
                embeddedLink = record.embeddedLink
                embeddedLinkSample = record.embeddedLinkSample
                embeddedPhone = record.embeddedPhone
                failureReasons = record.failureReasons
                helpKeywords = record.helpKeywords
                helpMessage = record.helpMessage
                isTMobileNumberPoolingEnabled = record.isTMobileNumberPoolingEnabled
                isTMobileRegistered = record.isTMobileRegistered
                isTMobileSuspended = record.isTMobileSuspended
                messageFlow = record.messageFlow
                mock = record.mock
                nextRenewalOrExpirationDate = record.nextRenewalOrExpirationDate
                numberPool = record.numberPool
                optinKeywords = record.optinKeywords
                optinMessage = record.optinMessage
                optoutKeywords = record.optoutKeywords
                optoutMessage = record.optoutMessage
                privacyPolicyLink = record.privacyPolicyLink
                referenceId = record.referenceId
                resellerId = record.resellerId
                sample1 = record.sample1
                sample2 = record.sample2
                sample3 = record.sample3
                sample4 = record.sample4
                sample5 = record.sample5
                status = record.status
                submissionStatus = record.submissionStatus
                subscriberHelp = record.subscriberHelp
                subscriberOptin = record.subscriberOptin
                subscriberOptout = record.subscriberOptout
                subUsecases = record.subUsecases.map { it.toMutableList() }
                tcrBrandId = record.tcrBrandId
                tcrCampaignId = record.tcrCampaignId
                termsAndConditions = record.termsAndConditions
                termsAndConditionsLink = record.termsAndConditionsLink
                usecase = record.usecase
                vertical = record.vertical
                webhookFailoverUrl = record.webhookFailoverUrl
                webhookUrl = record.webhookUrl
                additionalProperties = record.additionalProperties.toMutableMap()
            }

            /** Age gated content in campaign. */
            fun ageGated(ageGated: Boolean) = ageGated(JsonField.of(ageGated))

            /**
             * Sets [Builder.ageGated] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ageGated] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ageGated(ageGated: JsonField<Boolean>) = apply { this.ageGated = ageGated }

            /** Number of phone numbers associated with the campaign */
            fun assignedPhoneNumbersCount(assignedPhoneNumbersCount: Double) =
                assignedPhoneNumbersCount(JsonField.of(assignedPhoneNumbersCount))

            /**
             * Sets [Builder.assignedPhoneNumbersCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.assignedPhoneNumbersCount] with a well-typed
             * [Double] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun assignedPhoneNumbersCount(assignedPhoneNumbersCount: JsonField<Double>) = apply {
                this.assignedPhoneNumbersCount = assignedPhoneNumbersCount
            }

            /** Campaign subscription auto-renewal status. */
            fun autoRenewal(autoRenewal: Boolean) = autoRenewal(JsonField.of(autoRenewal))

            /**
             * Sets [Builder.autoRenewal] to an arbitrary JSON value.
             *
             * You should usually call [Builder.autoRenewal] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun autoRenewal(autoRenewal: JsonField<Boolean>) = apply {
                this.autoRenewal = autoRenewal
            }

            /** Campaign recent billed date. */
            fun billedDate(billedDate: String) = billedDate(JsonField.of(billedDate))

            /**
             * Sets [Builder.billedDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billedDate] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun billedDate(billedDate: JsonField<String>) = apply { this.billedDate = billedDate }

            /** Display or marketing name of the brand. */
            fun brandDisplayName(brandDisplayName: String) =
                brandDisplayName(JsonField.of(brandDisplayName))

            /**
             * Sets [Builder.brandDisplayName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.brandDisplayName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun brandDisplayName(brandDisplayName: JsonField<String>) = apply {
                this.brandDisplayName = brandDisplayName
            }

            /** Unique identifier assigned to the brand. */
            fun brandId(brandId: String) = brandId(JsonField.of(brandId))

            /**
             * Sets [Builder.brandId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.brandId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun brandId(brandId: JsonField<String>) = apply { this.brandId = brandId }

            /** Unique identifier for a campaign. */
            fun campaignId(campaignId: String) = campaignId(JsonField.of(campaignId))

            /**
             * Sets [Builder.campaignId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.campaignId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun campaignId(campaignId: JsonField<String>) = apply { this.campaignId = campaignId }

            /** Campaign status */
            fun campaignStatus(campaignStatus: CampaignStatus) =
                campaignStatus(JsonField.of(campaignStatus))

            /**
             * Sets [Builder.campaignStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.campaignStatus] with a well-typed [CampaignStatus]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun campaignStatus(campaignStatus: JsonField<CampaignStatus>) = apply {
                this.campaignStatus = campaignStatus
            }

            /** Unix timestamp when campaign was created. */
            fun createDate(createDate: String) = createDate(JsonField.of(createDate))

            /**
             * Sets [Builder.createDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createDate] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createDate(createDate: JsonField<String>) = apply { this.createDate = createDate }

            /** Alphanumeric identifier of the CSP associated with this campaign. */
            fun cspId(cspId: String) = cspId(JsonField.of(cspId))

            /**
             * Sets [Builder.cspId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cspId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cspId(cspId: JsonField<String>) = apply { this.cspId = cspId }

            /** Summary description of this campaign. */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun directLending(directLending: Boolean) = directLending(JsonField.of(directLending))

            /**
             * Sets [Builder.directLending] to an arbitrary JSON value.
             *
             * You should usually call [Builder.directLending] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun directLending(directLending: JsonField<Boolean>) = apply {
                this.directLending = directLending
            }

            /** Does message generated by the campaign include URL link in SMS? */
            fun embeddedLink(embeddedLink: Boolean) = embeddedLink(JsonField.of(embeddedLink))

            /**
             * Sets [Builder.embeddedLink] to an arbitrary JSON value.
             *
             * You should usually call [Builder.embeddedLink] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun embeddedLink(embeddedLink: JsonField<Boolean>) = apply {
                this.embeddedLink = embeddedLink
            }

            /** Sample of an embedded link that will be sent to subscribers. */
            fun embeddedLinkSample(embeddedLinkSample: String) =
                embeddedLinkSample(JsonField.of(embeddedLinkSample))

            /**
             * Sets [Builder.embeddedLinkSample] to an arbitrary JSON value.
             *
             * You should usually call [Builder.embeddedLinkSample] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun embeddedLinkSample(embeddedLinkSample: JsonField<String>) = apply {
                this.embeddedLinkSample = embeddedLinkSample
            }

            /** Does message generated by the campaign include phone number in SMS? */
            fun embeddedPhone(embeddedPhone: Boolean) = embeddedPhone(JsonField.of(embeddedPhone))

            /**
             * Sets [Builder.embeddedPhone] to an arbitrary JSON value.
             *
             * You should usually call [Builder.embeddedPhone] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun embeddedPhone(embeddedPhone: JsonField<Boolean>) = apply {
                this.embeddedPhone = embeddedPhone
            }

            /** Failure reasons if campaign submission failed */
            fun failureReasons(failureReasons: String) =
                failureReasons(JsonField.of(failureReasons))

            /**
             * Sets [Builder.failureReasons] to an arbitrary JSON value.
             *
             * You should usually call [Builder.failureReasons] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun failureReasons(failureReasons: JsonField<String>) = apply {
                this.failureReasons = failureReasons
            }

            /** Subscriber help keywords. Multiple keywords are comma separated without space. */
            fun helpKeywords(helpKeywords: String) = helpKeywords(JsonField.of(helpKeywords))

            /**
             * Sets [Builder.helpKeywords] to an arbitrary JSON value.
             *
             * You should usually call [Builder.helpKeywords] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun helpKeywords(helpKeywords: JsonField<String>) = apply {
                this.helpKeywords = helpKeywords
            }

            /** Help message of the campaign. */
            fun helpMessage(helpMessage: String) = helpMessage(JsonField.of(helpMessage))

            /**
             * Sets [Builder.helpMessage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.helpMessage] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun helpMessage(helpMessage: JsonField<String>) = apply {
                this.helpMessage = helpMessage
            }

            /** Indicates whether the campaign has a T-Mobile number pool ID associated with it. */
            fun isTMobileNumberPoolingEnabled(isTMobileNumberPoolingEnabled: Boolean) =
                isTMobileNumberPoolingEnabled(JsonField.of(isTMobileNumberPoolingEnabled))

            /**
             * Sets [Builder.isTMobileNumberPoolingEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isTMobileNumberPoolingEnabled] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun isTMobileNumberPoolingEnabled(isTMobileNumberPoolingEnabled: JsonField<Boolean>) =
                apply {
                    this.isTMobileNumberPoolingEnabled = isTMobileNumberPoolingEnabled
                }

            /** Indicates whether the campaign is registered with T-Mobile. */
            fun isTMobileRegistered(isTMobileRegistered: Boolean) =
                isTMobileRegistered(JsonField.of(isTMobileRegistered))

            /**
             * Sets [Builder.isTMobileRegistered] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isTMobileRegistered] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun isTMobileRegistered(isTMobileRegistered: JsonField<Boolean>) = apply {
                this.isTMobileRegistered = isTMobileRegistered
            }

            /** Indicates whether the campaign is suspended with T-Mobile. */
            fun isTMobileSuspended(isTMobileSuspended: Boolean) =
                isTMobileSuspended(JsonField.of(isTMobileSuspended))

            /**
             * Sets [Builder.isTMobileSuspended] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isTMobileSuspended] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun isTMobileSuspended(isTMobileSuspended: JsonField<Boolean>) = apply {
                this.isTMobileSuspended = isTMobileSuspended
            }

            /** Message flow description. */
            fun messageFlow(messageFlow: String) = messageFlow(JsonField.of(messageFlow))

            /**
             * Sets [Builder.messageFlow] to an arbitrary JSON value.
             *
             * You should usually call [Builder.messageFlow] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun messageFlow(messageFlow: JsonField<String>) = apply {
                this.messageFlow = messageFlow
            }

            /**
             * Campaign created from mock brand. Mocked campaign cannot be shared with an upstream
             * CNP.
             */
            fun mock(mock: Boolean) = mock(JsonField.of(mock))

            /**
             * Sets [Builder.mock] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mock] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mock(mock: JsonField<Boolean>) = apply { this.mock = mock }

            /** When the campaign would be due for its next renew/bill date. */
            fun nextRenewalOrExpirationDate(nextRenewalOrExpirationDate: String) =
                nextRenewalOrExpirationDate(JsonField.of(nextRenewalOrExpirationDate))

            /**
             * Sets [Builder.nextRenewalOrExpirationDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nextRenewalOrExpirationDate] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun nextRenewalOrExpirationDate(nextRenewalOrExpirationDate: JsonField<String>) =
                apply {
                    this.nextRenewalOrExpirationDate = nextRenewalOrExpirationDate
                }

            /** Does campaign utilize pool of phone numbers? */
            fun numberPool(numberPool: Boolean) = numberPool(JsonField.of(numberPool))

            /**
             * Sets [Builder.numberPool] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numberPool] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun numberPool(numberPool: JsonField<Boolean>) = apply { this.numberPool = numberPool }

            /** Subscriber opt-in keywords. Multiple keywords are comma separated without space. */
            fun optinKeywords(optinKeywords: String) = optinKeywords(JsonField.of(optinKeywords))

            /**
             * Sets [Builder.optinKeywords] to an arbitrary JSON value.
             *
             * You should usually call [Builder.optinKeywords] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun optinKeywords(optinKeywords: JsonField<String>) = apply {
                this.optinKeywords = optinKeywords
            }

            /** Subscriber opt-in message. */
            fun optinMessage(optinMessage: String) = optinMessage(JsonField.of(optinMessage))

            /**
             * Sets [Builder.optinMessage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.optinMessage] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun optinMessage(optinMessage: JsonField<String>) = apply {
                this.optinMessage = optinMessage
            }

            /** Subscriber opt-out keywords. Multiple keywords are comma separated without space. */
            fun optoutKeywords(optoutKeywords: String) =
                optoutKeywords(JsonField.of(optoutKeywords))

            /**
             * Sets [Builder.optoutKeywords] to an arbitrary JSON value.
             *
             * You should usually call [Builder.optoutKeywords] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun optoutKeywords(optoutKeywords: JsonField<String>) = apply {
                this.optoutKeywords = optoutKeywords
            }

            /** Subscriber opt-out message. */
            fun optoutMessage(optoutMessage: String) = optoutMessage(JsonField.of(optoutMessage))

            /**
             * Sets [Builder.optoutMessage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.optoutMessage] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun optoutMessage(optoutMessage: JsonField<String>) = apply {
                this.optoutMessage = optoutMessage
            }

            /** Link to the campaign's privacy policy. */
            fun privacyPolicyLink(privacyPolicyLink: String) =
                privacyPolicyLink(JsonField.of(privacyPolicyLink))

            /**
             * Sets [Builder.privacyPolicyLink] to an arbitrary JSON value.
             *
             * You should usually call [Builder.privacyPolicyLink] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun privacyPolicyLink(privacyPolicyLink: JsonField<String>) = apply {
                this.privacyPolicyLink = privacyPolicyLink
            }

            /**
             * Caller supplied campaign reference ID. If supplied, the value must be unique across
             * all submitted campaigns. Can be used to prevent duplicate campaign registrations.
             */
            fun referenceId(referenceId: String) = referenceId(JsonField.of(referenceId))

            /**
             * Sets [Builder.referenceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.referenceId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun referenceId(referenceId: JsonField<String>) = apply {
                this.referenceId = referenceId
            }

            /**
             * Alphanumeric identifier of the reseller that you want to associate with this
             * campaign.
             */
            fun resellerId(resellerId: String) = resellerId(JsonField.of(resellerId))

            /**
             * Sets [Builder.resellerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.resellerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun resellerId(resellerId: JsonField<String>) = apply { this.resellerId = resellerId }

            /** Message sample. Some campaign tiers require 1 or more message samples. */
            fun sample1(sample1: String) = sample1(JsonField.of(sample1))

            /**
             * Sets [Builder.sample1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sample1] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sample1(sample1: JsonField<String>) = apply { this.sample1 = sample1 }

            /** Message sample. Some campaign tiers require 2 or more message samples. */
            fun sample2(sample2: String) = sample2(JsonField.of(sample2))

            /**
             * Sets [Builder.sample2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sample2] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sample2(sample2: JsonField<String>) = apply { this.sample2 = sample2 }

            /** Message sample. Some campaign tiers require 3 or more message samples. */
            fun sample3(sample3: String) = sample3(JsonField.of(sample3))

            /**
             * Sets [Builder.sample3] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sample3] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sample3(sample3: JsonField<String>) = apply { this.sample3 = sample3 }

            /** Message sample. Some campaign tiers require 4 or more message samples. */
            fun sample4(sample4: String) = sample4(JsonField.of(sample4))

            /**
             * Sets [Builder.sample4] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sample4] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sample4(sample4: JsonField<String>) = apply { this.sample4 = sample4 }

            /** Message sample. Some campaign tiers require 5 or more message samples. */
            fun sample5(sample5: String) = sample5(JsonField.of(sample5))

            /**
             * Sets [Builder.sample5] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sample5] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sample5(sample5: JsonField<String>) = apply { this.sample5 = sample5 }

            /**
             * Current campaign status. Possible values: ACTIVE, EXPIRED. A newly created campaign
             * defaults to ACTIVE status.
             */
            fun status(status: String) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<String>) = apply { this.status = status }

            /** Campaign submission status */
            fun submissionStatus(submissionStatus: SubmissionStatus) =
                submissionStatus(JsonField.of(submissionStatus))

            /**
             * Sets [Builder.submissionStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.submissionStatus] with a well-typed
             * [SubmissionStatus] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun submissionStatus(submissionStatus: JsonField<SubmissionStatus>) = apply {
                this.submissionStatus = submissionStatus
            }

            /** Does campaign responds to help keyword(s)? */
            fun subscriberHelp(subscriberHelp: Boolean) =
                subscriberHelp(JsonField.of(subscriberHelp))

            /**
             * Sets [Builder.subscriberHelp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subscriberHelp] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subscriberHelp(subscriberHelp: JsonField<Boolean>) = apply {
                this.subscriberHelp = subscriberHelp
            }

            /** Does campaign require subscriber to opt-in before SMS is sent to subscriber? */
            fun subscriberOptin(subscriberOptin: Boolean) =
                subscriberOptin(JsonField.of(subscriberOptin))

            /**
             * Sets [Builder.subscriberOptin] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subscriberOptin] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subscriberOptin(subscriberOptin: JsonField<Boolean>) = apply {
                this.subscriberOptin = subscriberOptin
            }

            /** Does campaign support subscriber opt-out keyword(s)? */
            fun subscriberOptout(subscriberOptout: Boolean) =
                subscriberOptout(JsonField.of(subscriberOptout))

            /**
             * Sets [Builder.subscriberOptout] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subscriberOptout] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subscriberOptout(subscriberOptout: JsonField<Boolean>) = apply {
                this.subscriberOptout = subscriberOptout
            }

            /**
             * Campaign sub-usecases. Must be of defined valid sub-usecase types. Use
             * `/registry/enum/usecase` operation to retrieve list of valid sub-usecases
             */
            fun subUsecases(subUsecases: List<String>) = subUsecases(JsonField.of(subUsecases))

            /**
             * Sets [Builder.subUsecases] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subUsecases] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subUsecases(subUsecases: JsonField<List<String>>) = apply {
                this.subUsecases = subUsecases.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [subUsecases].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSubUsecase(subUsecase: String) = apply {
                subUsecases =
                    (subUsecases ?: JsonField.of(mutableListOf())).also {
                        checkKnown("subUsecases", it).add(subUsecase)
                    }
            }

            /** Unique identifier assigned to the brand by the registry. */
            fun tcrBrandId(tcrBrandId: String) = tcrBrandId(JsonField.of(tcrBrandId))

            /**
             * Sets [Builder.tcrBrandId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tcrBrandId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tcrBrandId(tcrBrandId: JsonField<String>) = apply { this.tcrBrandId = tcrBrandId }

            /** Unique identifier assigned to the campaign by the registry. */
            fun tcrCampaignId(tcrCampaignId: String) = tcrCampaignId(JsonField.of(tcrCampaignId))

            /**
             * Sets [Builder.tcrCampaignId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tcrCampaignId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tcrCampaignId(tcrCampaignId: JsonField<String>) = apply {
                this.tcrCampaignId = tcrCampaignId
            }

            /** Is terms & conditions accepted? */
            fun termsAndConditions(termsAndConditions: Boolean) =
                termsAndConditions(JsonField.of(termsAndConditions))

            /**
             * Sets [Builder.termsAndConditions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.termsAndConditions] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun termsAndConditions(termsAndConditions: JsonField<Boolean>) = apply {
                this.termsAndConditions = termsAndConditions
            }

            /** Link to the campaign's terms and conditions. */
            fun termsAndConditionsLink(termsAndConditionsLink: String) =
                termsAndConditionsLink(JsonField.of(termsAndConditionsLink))

            /**
             * Sets [Builder.termsAndConditionsLink] to an arbitrary JSON value.
             *
             * You should usually call [Builder.termsAndConditionsLink] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun termsAndConditionsLink(termsAndConditionsLink: JsonField<String>) = apply {
                this.termsAndConditionsLink = termsAndConditionsLink
            }

            /**
             * Campaign usecase. Must be of defined valid types. Use `/registry/enum/usecase`
             * operation to retrieve usecases available for given brand.
             */
            fun usecase(usecase: String) = usecase(JsonField.of(usecase))

            /**
             * Sets [Builder.usecase] to an arbitrary JSON value.
             *
             * You should usually call [Builder.usecase] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun usecase(usecase: JsonField<String>) = apply { this.usecase = usecase }

            /**
             * Business/industry segment of this campaign (Deprecated). Must be of defined valid
             * types. Use `/registry/enum/vertical` operation to retrieve verticals available for
             * given brand, vertical combination.
             *
             * This field is deprecated.
             */
            @Deprecated("deprecated")
            fun vertical(vertical: String) = vertical(JsonField.of(vertical))

            /**
             * Sets [Builder.vertical] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vertical] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            @Deprecated("deprecated")
            fun vertical(vertical: JsonField<String>) = apply { this.vertical = vertical }

            /** Failover webhook to which campaign status updates are sent. */
            fun webhookFailoverUrl(webhookFailoverUrl: String) =
                webhookFailoverUrl(JsonField.of(webhookFailoverUrl))

            /**
             * Sets [Builder.webhookFailoverUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhookFailoverUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun webhookFailoverUrl(webhookFailoverUrl: JsonField<String>) = apply {
                this.webhookFailoverUrl = webhookFailoverUrl
            }

            /** Webhook to which campaign status updates are sent. */
            fun webhookUrl(webhookUrl: String) = webhookUrl(JsonField.of(webhookUrl))

            /**
             * Sets [Builder.webhookUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhookUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [Record].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Record =
                Record(
                    ageGated,
                    assignedPhoneNumbersCount,
                    autoRenewal,
                    billedDate,
                    brandDisplayName,
                    brandId,
                    campaignId,
                    campaignStatus,
                    createDate,
                    cspId,
                    description,
                    directLending,
                    embeddedLink,
                    embeddedLinkSample,
                    embeddedPhone,
                    failureReasons,
                    helpKeywords,
                    helpMessage,
                    isTMobileNumberPoolingEnabled,
                    isTMobileRegistered,
                    isTMobileSuspended,
                    messageFlow,
                    mock,
                    nextRenewalOrExpirationDate,
                    numberPool,
                    optinKeywords,
                    optinMessage,
                    optoutKeywords,
                    optoutMessage,
                    privacyPolicyLink,
                    referenceId,
                    resellerId,
                    sample1,
                    sample2,
                    sample3,
                    sample4,
                    sample5,
                    status,
                    submissionStatus,
                    subscriberHelp,
                    subscriberOptin,
                    subscriberOptout,
                    (subUsecases ?: JsonMissing.of()).map { it.toImmutable() },
                    tcrBrandId,
                    tcrCampaignId,
                    termsAndConditions,
                    termsAndConditionsLink,
                    usecase,
                    vertical,
                    webhookFailoverUrl,
                    webhookUrl,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Record = apply {
            if (validated) {
                return@apply
            }

            ageGated()
            assignedPhoneNumbersCount()
            autoRenewal()
            billedDate()
            brandDisplayName()
            brandId()
            campaignId()
            campaignStatus().ifPresent { it.validate() }
            createDate()
            cspId()
            description()
            directLending()
            embeddedLink()
            embeddedLinkSample()
            embeddedPhone()
            failureReasons()
            helpKeywords()
            helpMessage()
            isTMobileNumberPoolingEnabled()
            isTMobileRegistered()
            isTMobileSuspended()
            messageFlow()
            mock()
            nextRenewalOrExpirationDate()
            numberPool()
            optinKeywords()
            optinMessage()
            optoutKeywords()
            optoutMessage()
            privacyPolicyLink()
            referenceId()
            resellerId()
            sample1()
            sample2()
            sample3()
            sample4()
            sample5()
            status()
            submissionStatus().ifPresent { it.validate() }
            subscriberHelp()
            subscriberOptin()
            subscriberOptout()
            subUsecases()
            tcrBrandId()
            tcrCampaignId()
            termsAndConditions()
            termsAndConditionsLink()
            usecase()
            vertical()
            webhookFailoverUrl()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (ageGated.asKnown().isPresent) 1 else 0) +
                (if (assignedPhoneNumbersCount.asKnown().isPresent) 1 else 0) +
                (if (autoRenewal.asKnown().isPresent) 1 else 0) +
                (if (billedDate.asKnown().isPresent) 1 else 0) +
                (if (brandDisplayName.asKnown().isPresent) 1 else 0) +
                (if (brandId.asKnown().isPresent) 1 else 0) +
                (if (campaignId.asKnown().isPresent) 1 else 0) +
                (campaignStatus.asKnown().getOrNull()?.validity() ?: 0) +
                (if (createDate.asKnown().isPresent) 1 else 0) +
                (if (cspId.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (directLending.asKnown().isPresent) 1 else 0) +
                (if (embeddedLink.asKnown().isPresent) 1 else 0) +
                (if (embeddedLinkSample.asKnown().isPresent) 1 else 0) +
                (if (embeddedPhone.asKnown().isPresent) 1 else 0) +
                (if (failureReasons.asKnown().isPresent) 1 else 0) +
                (if (helpKeywords.asKnown().isPresent) 1 else 0) +
                (if (helpMessage.asKnown().isPresent) 1 else 0) +
                (if (isTMobileNumberPoolingEnabled.asKnown().isPresent) 1 else 0) +
                (if (isTMobileRegistered.asKnown().isPresent) 1 else 0) +
                (if (isTMobileSuspended.asKnown().isPresent) 1 else 0) +
                (if (messageFlow.asKnown().isPresent) 1 else 0) +
                (if (mock.asKnown().isPresent) 1 else 0) +
                (if (nextRenewalOrExpirationDate.asKnown().isPresent) 1 else 0) +
                (if (numberPool.asKnown().isPresent) 1 else 0) +
                (if (optinKeywords.asKnown().isPresent) 1 else 0) +
                (if (optinMessage.asKnown().isPresent) 1 else 0) +
                (if (optoutKeywords.asKnown().isPresent) 1 else 0) +
                (if (optoutMessage.asKnown().isPresent) 1 else 0) +
                (if (privacyPolicyLink.asKnown().isPresent) 1 else 0) +
                (if (referenceId.asKnown().isPresent) 1 else 0) +
                (if (resellerId.asKnown().isPresent) 1 else 0) +
                (if (sample1.asKnown().isPresent) 1 else 0) +
                (if (sample2.asKnown().isPresent) 1 else 0) +
                (if (sample3.asKnown().isPresent) 1 else 0) +
                (if (sample4.asKnown().isPresent) 1 else 0) +
                (if (sample5.asKnown().isPresent) 1 else 0) +
                (if (status.asKnown().isPresent) 1 else 0) +
                (submissionStatus.asKnown().getOrNull()?.validity() ?: 0) +
                (if (subscriberHelp.asKnown().isPresent) 1 else 0) +
                (if (subscriberOptin.asKnown().isPresent) 1 else 0) +
                (if (subscriberOptout.asKnown().isPresent) 1 else 0) +
                (subUsecases.asKnown().getOrNull()?.size ?: 0) +
                (if (tcrBrandId.asKnown().isPresent) 1 else 0) +
                (if (tcrCampaignId.asKnown().isPresent) 1 else 0) +
                (if (termsAndConditions.asKnown().isPresent) 1 else 0) +
                (if (termsAndConditionsLink.asKnown().isPresent) 1 else 0) +
                (if (usecase.asKnown().isPresent) 1 else 0) +
                (if (vertical.asKnown().isPresent) 1 else 0) +
                (if (webhookFailoverUrl.asKnown().isPresent) 1 else 0) +
                (if (webhookUrl.asKnown().isPresent) 1 else 0)

        /** Campaign status */
        class CampaignStatus
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

                @JvmField val TCR_PENDING = of("TCR_PENDING")

                @JvmField val TCR_SUSPENDED = of("TCR_SUSPENDED")

                @JvmField val TCR_EXPIRED = of("TCR_EXPIRED")

                @JvmField val TCR_ACCEPTED = of("TCR_ACCEPTED")

                @JvmField val TCR_FAILED = of("TCR_FAILED")

                @JvmField val TELNYX_ACCEPTED = of("TELNYX_ACCEPTED")

                @JvmField val TELNYX_FAILED = of("TELNYX_FAILED")

                @JvmField val MNO_PENDING = of("MNO_PENDING")

                @JvmField val MNO_ACCEPTED = of("MNO_ACCEPTED")

                @JvmField val MNO_REJECTED = of("MNO_REJECTED")

                @JvmField val MNO_PROVISIONED = of("MNO_PROVISIONED")

                @JvmField val MNO_PROVISIONING_FAILED = of("MNO_PROVISIONING_FAILED")

                @JvmStatic fun of(value: String) = CampaignStatus(JsonField.of(value))
            }

            /** An enum containing [CampaignStatus]'s known values. */
            enum class Known {
                TCR_PENDING,
                TCR_SUSPENDED,
                TCR_EXPIRED,
                TCR_ACCEPTED,
                TCR_FAILED,
                TELNYX_ACCEPTED,
                TELNYX_FAILED,
                MNO_PENDING,
                MNO_ACCEPTED,
                MNO_REJECTED,
                MNO_PROVISIONED,
                MNO_PROVISIONING_FAILED,
            }

            /**
             * An enum containing [CampaignStatus]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [CampaignStatus] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                TCR_PENDING,
                TCR_SUSPENDED,
                TCR_EXPIRED,
                TCR_ACCEPTED,
                TCR_FAILED,
                TELNYX_ACCEPTED,
                TELNYX_FAILED,
                MNO_PENDING,
                MNO_ACCEPTED,
                MNO_REJECTED,
                MNO_PROVISIONED,
                MNO_PROVISIONING_FAILED,
                /**
                 * An enum member indicating that [CampaignStatus] was instantiated with an unknown
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
                    TCR_PENDING -> Value.TCR_PENDING
                    TCR_SUSPENDED -> Value.TCR_SUSPENDED
                    TCR_EXPIRED -> Value.TCR_EXPIRED
                    TCR_ACCEPTED -> Value.TCR_ACCEPTED
                    TCR_FAILED -> Value.TCR_FAILED
                    TELNYX_ACCEPTED -> Value.TELNYX_ACCEPTED
                    TELNYX_FAILED -> Value.TELNYX_FAILED
                    MNO_PENDING -> Value.MNO_PENDING
                    MNO_ACCEPTED -> Value.MNO_ACCEPTED
                    MNO_REJECTED -> Value.MNO_REJECTED
                    MNO_PROVISIONED -> Value.MNO_PROVISIONED
                    MNO_PROVISIONING_FAILED -> Value.MNO_PROVISIONING_FAILED
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
                    TCR_PENDING -> Known.TCR_PENDING
                    TCR_SUSPENDED -> Known.TCR_SUSPENDED
                    TCR_EXPIRED -> Known.TCR_EXPIRED
                    TCR_ACCEPTED -> Known.TCR_ACCEPTED
                    TCR_FAILED -> Known.TCR_FAILED
                    TELNYX_ACCEPTED -> Known.TELNYX_ACCEPTED
                    TELNYX_FAILED -> Known.TELNYX_FAILED
                    MNO_PENDING -> Known.MNO_PENDING
                    MNO_ACCEPTED -> Known.MNO_ACCEPTED
                    MNO_REJECTED -> Known.MNO_REJECTED
                    MNO_PROVISIONED -> Known.MNO_PROVISIONED
                    MNO_PROVISIONING_FAILED -> Known.MNO_PROVISIONING_FAILED
                    else -> throw TelnyxInvalidDataException("Unknown CampaignStatus: $value")
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

            fun validate(): CampaignStatus = apply {
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

                return other is CampaignStatus && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Campaign submission status */
        class SubmissionStatus
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

                @JvmField val CREATED = of("CREATED")

                @JvmField val FAILED = of("FAILED")

                @JvmField val PENDING = of("PENDING")

                @JvmStatic fun of(value: String) = SubmissionStatus(JsonField.of(value))
            }

            /** An enum containing [SubmissionStatus]'s known values. */
            enum class Known {
                CREATED,
                FAILED,
                PENDING,
            }

            /**
             * An enum containing [SubmissionStatus]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [SubmissionStatus] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CREATED,
                FAILED,
                PENDING,
                /**
                 * An enum member indicating that [SubmissionStatus] was instantiated with an
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
                    CREATED -> Value.CREATED
                    FAILED -> Value.FAILED
                    PENDING -> Value.PENDING
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
                    CREATED -> Known.CREATED
                    FAILED -> Known.FAILED
                    PENDING -> Known.PENDING
                    else -> throw TelnyxInvalidDataException("Unknown SubmissionStatus: $value")
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

            fun validate(): SubmissionStatus = apply {
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

                return other is SubmissionStatus && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Record &&
                ageGated == other.ageGated &&
                assignedPhoneNumbersCount == other.assignedPhoneNumbersCount &&
                autoRenewal == other.autoRenewal &&
                billedDate == other.billedDate &&
                brandDisplayName == other.brandDisplayName &&
                brandId == other.brandId &&
                campaignId == other.campaignId &&
                campaignStatus == other.campaignStatus &&
                createDate == other.createDate &&
                cspId == other.cspId &&
                description == other.description &&
                directLending == other.directLending &&
                embeddedLink == other.embeddedLink &&
                embeddedLinkSample == other.embeddedLinkSample &&
                embeddedPhone == other.embeddedPhone &&
                failureReasons == other.failureReasons &&
                helpKeywords == other.helpKeywords &&
                helpMessage == other.helpMessage &&
                isTMobileNumberPoolingEnabled == other.isTMobileNumberPoolingEnabled &&
                isTMobileRegistered == other.isTMobileRegistered &&
                isTMobileSuspended == other.isTMobileSuspended &&
                messageFlow == other.messageFlow &&
                mock == other.mock &&
                nextRenewalOrExpirationDate == other.nextRenewalOrExpirationDate &&
                numberPool == other.numberPool &&
                optinKeywords == other.optinKeywords &&
                optinMessage == other.optinMessage &&
                optoutKeywords == other.optoutKeywords &&
                optoutMessage == other.optoutMessage &&
                privacyPolicyLink == other.privacyPolicyLink &&
                referenceId == other.referenceId &&
                resellerId == other.resellerId &&
                sample1 == other.sample1 &&
                sample2 == other.sample2 &&
                sample3 == other.sample3 &&
                sample4 == other.sample4 &&
                sample5 == other.sample5 &&
                status == other.status &&
                submissionStatus == other.submissionStatus &&
                subscriberHelp == other.subscriberHelp &&
                subscriberOptin == other.subscriberOptin &&
                subscriberOptout == other.subscriberOptout &&
                subUsecases == other.subUsecases &&
                tcrBrandId == other.tcrBrandId &&
                tcrCampaignId == other.tcrCampaignId &&
                termsAndConditions == other.termsAndConditions &&
                termsAndConditionsLink == other.termsAndConditionsLink &&
                usecase == other.usecase &&
                vertical == other.vertical &&
                webhookFailoverUrl == other.webhookFailoverUrl &&
                webhookUrl == other.webhookUrl &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                ageGated,
                assignedPhoneNumbersCount,
                autoRenewal,
                billedDate,
                brandDisplayName,
                brandId,
                campaignId,
                campaignStatus,
                createDate,
                cspId,
                description,
                directLending,
                embeddedLink,
                embeddedLinkSample,
                embeddedPhone,
                failureReasons,
                helpKeywords,
                helpMessage,
                isTMobileNumberPoolingEnabled,
                isTMobileRegistered,
                isTMobileSuspended,
                messageFlow,
                mock,
                nextRenewalOrExpirationDate,
                numberPool,
                optinKeywords,
                optinMessage,
                optoutKeywords,
                optoutMessage,
                privacyPolicyLink,
                referenceId,
                resellerId,
                sample1,
                sample2,
                sample3,
                sample4,
                sample5,
                status,
                submissionStatus,
                subscriberHelp,
                subscriberOptin,
                subscriberOptout,
                subUsecases,
                tcrBrandId,
                tcrCampaignId,
                termsAndConditions,
                termsAndConditionsLink,
                usecase,
                vertical,
                webhookFailoverUrl,
                webhookUrl,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Record{ageGated=$ageGated, assignedPhoneNumbersCount=$assignedPhoneNumbersCount, autoRenewal=$autoRenewal, billedDate=$billedDate, brandDisplayName=$brandDisplayName, brandId=$brandId, campaignId=$campaignId, campaignStatus=$campaignStatus, createDate=$createDate, cspId=$cspId, description=$description, directLending=$directLending, embeddedLink=$embeddedLink, embeddedLinkSample=$embeddedLinkSample, embeddedPhone=$embeddedPhone, failureReasons=$failureReasons, helpKeywords=$helpKeywords, helpMessage=$helpMessage, isTMobileNumberPoolingEnabled=$isTMobileNumberPoolingEnabled, isTMobileRegistered=$isTMobileRegistered, isTMobileSuspended=$isTMobileSuspended, messageFlow=$messageFlow, mock=$mock, nextRenewalOrExpirationDate=$nextRenewalOrExpirationDate, numberPool=$numberPool, optinKeywords=$optinKeywords, optinMessage=$optinMessage, optoutKeywords=$optoutKeywords, optoutMessage=$optoutMessage, privacyPolicyLink=$privacyPolicyLink, referenceId=$referenceId, resellerId=$resellerId, sample1=$sample1, sample2=$sample2, sample3=$sample3, sample4=$sample4, sample5=$sample5, status=$status, submissionStatus=$submissionStatus, subscriberHelp=$subscriberHelp, subscriberOptin=$subscriberOptin, subscriberOptout=$subscriberOptout, subUsecases=$subUsecases, tcrBrandId=$tcrBrandId, tcrCampaignId=$tcrCampaignId, termsAndConditions=$termsAndConditions, termsAndConditionsLink=$termsAndConditionsLink, usecase=$usecase, vertical=$vertical, webhookFailoverUrl=$webhookFailoverUrl, webhookUrl=$webhookUrl, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CampaignListResponse &&
            page == other.page &&
            records == other.records &&
            totalRecords == other.totalRecords &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(page, records, totalRecords, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CampaignListResponse{page=$page, records=$records, totalRecords=$totalRecords, additionalProperties=$additionalProperties}"
}
