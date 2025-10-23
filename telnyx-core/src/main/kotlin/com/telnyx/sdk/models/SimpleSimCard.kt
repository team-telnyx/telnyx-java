// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models

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

class SimpleSimCard
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val actionsInProgress: JsonField<Boolean>,
    private val authorizedImeis: JsonField<List<String>>,
    private val createdAt: JsonField<String>,
    private val currentBillingPeriodConsumedData: JsonField<CurrentBillingPeriodConsumedData>,
    private val dataLimit: JsonField<DataLimit>,
    private val eid: JsonField<String>,
    private val esimInstallationStatus: JsonField<EsimInstallationStatus>,
    private val iccid: JsonField<String>,
    private val imsi: JsonField<String>,
    private val msisdn: JsonField<String>,
    private val recordType: JsonField<String>,
    private val resourcesWithInProgressActions: JsonField<List<JsonValue>>,
    private val simCardGroupId: JsonField<String>,
    private val status: JsonField<SimCardStatus>,
    private val tags: JsonField<List<String>>,
    private val type: JsonField<Type>,
    private val updatedAt: JsonField<String>,
    private val version: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("actions_in_progress")
        @ExcludeMissing
        actionsInProgress: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("authorized_imeis")
        @ExcludeMissing
        authorizedImeis: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("current_billing_period_consumed_data")
        @ExcludeMissing
        currentBillingPeriodConsumedData: JsonField<CurrentBillingPeriodConsumedData> =
            JsonMissing.of(),
        @JsonProperty("data_limit")
        @ExcludeMissing
        dataLimit: JsonField<DataLimit> = JsonMissing.of(),
        @JsonProperty("eid") @ExcludeMissing eid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("esim_installation_status")
        @ExcludeMissing
        esimInstallationStatus: JsonField<EsimInstallationStatus> = JsonMissing.of(),
        @JsonProperty("iccid") @ExcludeMissing iccid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("imsi") @ExcludeMissing imsi: JsonField<String> = JsonMissing.of(),
        @JsonProperty("msisdn") @ExcludeMissing msisdn: JsonField<String> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("resources_with_in_progress_actions")
        @ExcludeMissing
        resourcesWithInProgressActions: JsonField<List<JsonValue>> = JsonMissing.of(),
        @JsonProperty("sim_card_group_id")
        @ExcludeMissing
        simCardGroupId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<SimCardStatus> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("updated_at") @ExcludeMissing updatedAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("version") @ExcludeMissing version: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        actionsInProgress,
        authorizedImeis,
        createdAt,
        currentBillingPeriodConsumedData,
        dataLimit,
        eid,
        esimInstallationStatus,
        iccid,
        imsi,
        msisdn,
        recordType,
        resourcesWithInProgressActions,
        simCardGroupId,
        status,
        tags,
        type,
        updatedAt,
        version,
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
     * Indicate whether the SIM card has any pending (in-progress) actions.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun actionsInProgress(): Optional<Boolean> =
        actionsInProgress.getOptional("actions_in_progress")

    /**
     * List of IMEIs authorized to use a given SIM card.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun authorizedImeis(): Optional<List<String>> = authorizedImeis.getOptional("authorized_imeis")

    /**
     * ISO 8601 formatted date-time indicating when the resource was created.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<String> = createdAt.getOptional("created_at")

    /**
     * The SIM card consumption so far in the current billing cycle.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currentBillingPeriodConsumedData(): Optional<CurrentBillingPeriodConsumedData> =
        currentBillingPeriodConsumedData.getOptional("current_billing_period_consumed_data")

    /**
     * The SIM card individual data limit configuration.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dataLimit(): Optional<DataLimit> = dataLimit.getOptional("data_limit")

    /**
     * The Embedded Identity Document (eID) for eSIM cards.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun eid(): Optional<String> = eid.getOptional("eid")

    /**
     * The installation status of the eSIM. Only applicable for eSIM cards.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun esimInstallationStatus(): Optional<EsimInstallationStatus> =
        esimInstallationStatus.getOptional("esim_installation_status")

    /**
     * The ICCID is the identifier of the specific SIM card/chip. Each SIM is internationally
     * identified by its integrated circuit card identifier (ICCID). ICCIDs are stored in the SIM
     * card's memory and are also engraved or printed on the SIM card body during a process called
     * personalization.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun iccid(): Optional<String> = iccid.getOptional("iccid")

    /**
     * SIM cards are identified on their individual network operators by a unique International
     * Mobile Subscriber Identity (IMSI). <br/> Mobile network operators connect mobile phone calls
     * and communicate with their market SIM cards using their IMSIs. The IMSI is stored in the
     * Subscriber Identity Module (SIM) inside the device and is sent by the device to the
     * appropriate network. It is used to acquire the details of the device in the Home Location
     * Register (HLR) or the Visitor Location Register (VLR).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun imsi(): Optional<String> = imsi.getOptional("imsi")

    /**
     * Mobile Station International Subscriber Directory Number (MSISDN) is a number used to
     * identify a mobile phone number internationally. <br/> MSISDN is defined by the E.164
     * numbering plan. It includes a country code and a National Destination Code which identifies
     * the subscriber's operator.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun msisdn(): Optional<String> = msisdn.getOptional("msisdn")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<String> = recordType.getOptional("record_type")

    /**
     * List of resources with actions in progress.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun resourcesWithInProgressActions(): Optional<List<JsonValue>> =
        resourcesWithInProgressActions.getOptional("resources_with_in_progress_actions")

    /**
     * The group SIMCardGroup identification. This attribute can be <code>null</code> when it's
     * present in an associated resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun simCardGroupId(): Optional<String> = simCardGroupId.getOptional("sim_card_group_id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<SimCardStatus> = status.getOptional("status")

    /**
     * Searchable tags associated with the SIM card
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tags(): Optional<List<String>> = tags.getOptional("tags")

    /**
     * The type of SIM card
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): Optional<Type> = type.getOptional("type")

    /**
     * ISO 8601 formatted date-time indicating when the resource was updated.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<String> = updatedAt.getOptional("updated_at")

    /**
     * The version of the SIM card.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun version(): Optional<String> = version.getOptional("version")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [actionsInProgress].
     *
     * Unlike [actionsInProgress], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("actions_in_progress")
    @ExcludeMissing
    fun _actionsInProgress(): JsonField<Boolean> = actionsInProgress

    /**
     * Returns the raw JSON value of [authorizedImeis].
     *
     * Unlike [authorizedImeis], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("authorized_imeis")
    @ExcludeMissing
    fun _authorizedImeis(): JsonField<List<String>> = authorizedImeis

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

    /**
     * Returns the raw JSON value of [currentBillingPeriodConsumedData].
     *
     * Unlike [currentBillingPeriodConsumedData], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("current_billing_period_consumed_data")
    @ExcludeMissing
    fun _currentBillingPeriodConsumedData(): JsonField<CurrentBillingPeriodConsumedData> =
        currentBillingPeriodConsumedData

    /**
     * Returns the raw JSON value of [dataLimit].
     *
     * Unlike [dataLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data_limit") @ExcludeMissing fun _dataLimit(): JsonField<DataLimit> = dataLimit

    /**
     * Returns the raw JSON value of [eid].
     *
     * Unlike [eid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eid") @ExcludeMissing fun _eid(): JsonField<String> = eid

    /**
     * Returns the raw JSON value of [esimInstallationStatus].
     *
     * Unlike [esimInstallationStatus], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("esim_installation_status")
    @ExcludeMissing
    fun _esimInstallationStatus(): JsonField<EsimInstallationStatus> = esimInstallationStatus

    /**
     * Returns the raw JSON value of [iccid].
     *
     * Unlike [iccid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("iccid") @ExcludeMissing fun _iccid(): JsonField<String> = iccid

    /**
     * Returns the raw JSON value of [imsi].
     *
     * Unlike [imsi], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("imsi") @ExcludeMissing fun _imsi(): JsonField<String> = imsi

    /**
     * Returns the raw JSON value of [msisdn].
     *
     * Unlike [msisdn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("msisdn") @ExcludeMissing fun _msisdn(): JsonField<String> = msisdn

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type") @ExcludeMissing fun _recordType(): JsonField<String> = recordType

    /**
     * Returns the raw JSON value of [resourcesWithInProgressActions].
     *
     * Unlike [resourcesWithInProgressActions], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("resources_with_in_progress_actions")
    @ExcludeMissing
    fun _resourcesWithInProgressActions(): JsonField<List<JsonValue>> =
        resourcesWithInProgressActions

    /**
     * Returns the raw JSON value of [simCardGroupId].
     *
     * Unlike [simCardGroupId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sim_card_group_id")
    @ExcludeMissing
    fun _simCardGroupId(): JsonField<String> = simCardGroupId

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<SimCardStatus> = status

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt(): JsonField<String> = updatedAt

    /**
     * Returns the raw JSON value of [version].
     *
     * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<String> = version

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

        /** Returns a mutable builder for constructing an instance of [SimpleSimCard]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SimpleSimCard]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var actionsInProgress: JsonField<Boolean> = JsonMissing.of()
        private var authorizedImeis: JsonField<MutableList<String>>? = null
        private var createdAt: JsonField<String> = JsonMissing.of()
        private var currentBillingPeriodConsumedData: JsonField<CurrentBillingPeriodConsumedData> =
            JsonMissing.of()
        private var dataLimit: JsonField<DataLimit> = JsonMissing.of()
        private var eid: JsonField<String> = JsonMissing.of()
        private var esimInstallationStatus: JsonField<EsimInstallationStatus> = JsonMissing.of()
        private var iccid: JsonField<String> = JsonMissing.of()
        private var imsi: JsonField<String> = JsonMissing.of()
        private var msisdn: JsonField<String> = JsonMissing.of()
        private var recordType: JsonField<String> = JsonMissing.of()
        private var resourcesWithInProgressActions: JsonField<MutableList<JsonValue>>? = null
        private var simCardGroupId: JsonField<String> = JsonMissing.of()
        private var status: JsonField<SimCardStatus> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var type: JsonField<Type> = JsonMissing.of()
        private var updatedAt: JsonField<String> = JsonMissing.of()
        private var version: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(simpleSimCard: SimpleSimCard) = apply {
            id = simpleSimCard.id
            actionsInProgress = simpleSimCard.actionsInProgress
            authorizedImeis = simpleSimCard.authorizedImeis.map { it.toMutableList() }
            createdAt = simpleSimCard.createdAt
            currentBillingPeriodConsumedData = simpleSimCard.currentBillingPeriodConsumedData
            dataLimit = simpleSimCard.dataLimit
            eid = simpleSimCard.eid
            esimInstallationStatus = simpleSimCard.esimInstallationStatus
            iccid = simpleSimCard.iccid
            imsi = simpleSimCard.imsi
            msisdn = simpleSimCard.msisdn
            recordType = simpleSimCard.recordType
            resourcesWithInProgressActions =
                simpleSimCard.resourcesWithInProgressActions.map { it.toMutableList() }
            simCardGroupId = simpleSimCard.simCardGroupId
            status = simpleSimCard.status
            tags = simpleSimCard.tags.map { it.toMutableList() }
            type = simpleSimCard.type
            updatedAt = simpleSimCard.updatedAt
            version = simpleSimCard.version
            additionalProperties = simpleSimCard.additionalProperties.toMutableMap()
        }

        /** Identifies the resource. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Indicate whether the SIM card has any pending (in-progress) actions. */
        fun actionsInProgress(actionsInProgress: Boolean) =
            actionsInProgress(JsonField.of(actionsInProgress))

        /**
         * Sets [Builder.actionsInProgress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actionsInProgress] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun actionsInProgress(actionsInProgress: JsonField<Boolean>) = apply {
            this.actionsInProgress = actionsInProgress
        }

        /** List of IMEIs authorized to use a given SIM card. */
        fun authorizedImeis(authorizedImeis: List<String>?) =
            authorizedImeis(JsonField.ofNullable(authorizedImeis))

        /** Alias for calling [Builder.authorizedImeis] with `authorizedImeis.orElse(null)`. */
        fun authorizedImeis(authorizedImeis: Optional<List<String>>) =
            authorizedImeis(authorizedImeis.getOrNull())

        /**
         * Sets [Builder.authorizedImeis] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authorizedImeis] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun authorizedImeis(authorizedImeis: JsonField<List<String>>) = apply {
            this.authorizedImeis = authorizedImeis.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [authorizedImeis].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAuthorizedImei(authorizedImei: String) = apply {
            authorizedImeis =
                (authorizedImeis ?: JsonField.of(mutableListOf())).also {
                    checkKnown("authorizedImeis", it).add(authorizedImei)
                }
        }

        /** ISO 8601 formatted date-time indicating when the resource was created. */
        fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

        /** The SIM card consumption so far in the current billing cycle. */
        fun currentBillingPeriodConsumedData(
            currentBillingPeriodConsumedData: CurrentBillingPeriodConsumedData
        ) = currentBillingPeriodConsumedData(JsonField.of(currentBillingPeriodConsumedData))

        /**
         * Sets [Builder.currentBillingPeriodConsumedData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currentBillingPeriodConsumedData] with a well-typed
         * [CurrentBillingPeriodConsumedData] value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun currentBillingPeriodConsumedData(
            currentBillingPeriodConsumedData: JsonField<CurrentBillingPeriodConsumedData>
        ) = apply { this.currentBillingPeriodConsumedData = currentBillingPeriodConsumedData }

        /** The SIM card individual data limit configuration. */
        fun dataLimit(dataLimit: DataLimit) = dataLimit(JsonField.of(dataLimit))

        /**
         * Sets [Builder.dataLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataLimit] with a well-typed [DataLimit] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dataLimit(dataLimit: JsonField<DataLimit>) = apply { this.dataLimit = dataLimit }

        /** The Embedded Identity Document (eID) for eSIM cards. */
        fun eid(eid: String?) = eid(JsonField.ofNullable(eid))

        /** Alias for calling [Builder.eid] with `eid.orElse(null)`. */
        fun eid(eid: Optional<String>) = eid(eid.getOrNull())

        /**
         * Sets [Builder.eid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eid] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun eid(eid: JsonField<String>) = apply { this.eid = eid }

        /** The installation status of the eSIM. Only applicable for eSIM cards. */
        fun esimInstallationStatus(esimInstallationStatus: EsimInstallationStatus?) =
            esimInstallationStatus(JsonField.ofNullable(esimInstallationStatus))

        /**
         * Alias for calling [Builder.esimInstallationStatus] with
         * `esimInstallationStatus.orElse(null)`.
         */
        fun esimInstallationStatus(esimInstallationStatus: Optional<EsimInstallationStatus>) =
            esimInstallationStatus(esimInstallationStatus.getOrNull())

        /**
         * Sets [Builder.esimInstallationStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.esimInstallationStatus] with a well-typed
         * [EsimInstallationStatus] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun esimInstallationStatus(esimInstallationStatus: JsonField<EsimInstallationStatus>) =
            apply {
                this.esimInstallationStatus = esimInstallationStatus
            }

        /**
         * The ICCID is the identifier of the specific SIM card/chip. Each SIM is internationally
         * identified by its integrated circuit card identifier (ICCID). ICCIDs are stored in the
         * SIM card's memory and are also engraved or printed on the SIM card body during a process
         * called personalization.
         */
        fun iccid(iccid: String) = iccid(JsonField.of(iccid))

        /**
         * Sets [Builder.iccid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.iccid] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun iccid(iccid: JsonField<String>) = apply { this.iccid = iccid }

        /**
         * SIM cards are identified on their individual network operators by a unique International
         * Mobile Subscriber Identity (IMSI). <br/> Mobile network operators connect mobile phone
         * calls and communicate with their market SIM cards using their IMSIs. The IMSI is stored
         * in the Subscriber Identity Module (SIM) inside the device and is sent by the device to
         * the appropriate network. It is used to acquire the details of the device in the Home
         * Location Register (HLR) or the Visitor Location Register (VLR).
         */
        fun imsi(imsi: String) = imsi(JsonField.of(imsi))

        /**
         * Sets [Builder.imsi] to an arbitrary JSON value.
         *
         * You should usually call [Builder.imsi] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun imsi(imsi: JsonField<String>) = apply { this.imsi = imsi }

        /**
         * Mobile Station International Subscriber Directory Number (MSISDN) is a number used to
         * identify a mobile phone number internationally. <br/> MSISDN is defined by the E.164
         * numbering plan. It includes a country code and a National Destination Code which
         * identifies the subscriber's operator.
         */
        fun msisdn(msisdn: String) = msisdn(JsonField.of(msisdn))

        /**
         * Sets [Builder.msisdn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.msisdn] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun msisdn(msisdn: JsonField<String>) = apply { this.msisdn = msisdn }

        fun recordType(recordType: String) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

        /** List of resources with actions in progress. */
        fun resourcesWithInProgressActions(resourcesWithInProgressActions: List<JsonValue>) =
            resourcesWithInProgressActions(JsonField.of(resourcesWithInProgressActions))

        /**
         * Sets [Builder.resourcesWithInProgressActions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resourcesWithInProgressActions] with a well-typed
         * `List<JsonValue>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun resourcesWithInProgressActions(
            resourcesWithInProgressActions: JsonField<List<JsonValue>>
        ) = apply {
            this.resourcesWithInProgressActions =
                resourcesWithInProgressActions.map { it.toMutableList() }
        }

        /**
         * Adds a single [JsonValue] to [resourcesWithInProgressActions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addResourcesWithInProgressAction(resourcesWithInProgressAction: JsonValue) = apply {
            resourcesWithInProgressActions =
                (resourcesWithInProgressActions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("resourcesWithInProgressActions", it)
                        .add(resourcesWithInProgressAction)
                }
        }

        /**
         * The group SIMCardGroup identification. This attribute can be <code>null</code> when it's
         * present in an associated resource.
         */
        fun simCardGroupId(simCardGroupId: String) = simCardGroupId(JsonField.of(simCardGroupId))

        /**
         * Sets [Builder.simCardGroupId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.simCardGroupId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun simCardGroupId(simCardGroupId: JsonField<String>) = apply {
            this.simCardGroupId = simCardGroupId
        }

        fun status(status: SimCardStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [SimCardStatus] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun status(status: JsonField<SimCardStatus>) = apply { this.status = status }

        /** Searchable tags associated with the SIM card */
        fun tags(tags: List<String>) = tags(JsonField.of(tags))

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
            tags = (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
        }

        /** The type of SIM card */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** ISO 8601 formatted date-time indicating when the resource was updated. */
        fun updatedAt(updatedAt: String) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updatedAt(updatedAt: JsonField<String>) = apply { this.updatedAt = updatedAt }

        /** The version of the SIM card. */
        fun version(version: String) = version(JsonField.of(version))

        /**
         * Sets [Builder.version] to an arbitrary JSON value.
         *
         * You should usually call [Builder.version] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun version(version: JsonField<String>) = apply { this.version = version }

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
         * Returns an immutable instance of [SimpleSimCard].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SimpleSimCard =
            SimpleSimCard(
                id,
                actionsInProgress,
                (authorizedImeis ?: JsonMissing.of()).map { it.toImmutable() },
                createdAt,
                currentBillingPeriodConsumedData,
                dataLimit,
                eid,
                esimInstallationStatus,
                iccid,
                imsi,
                msisdn,
                recordType,
                (resourcesWithInProgressActions ?: JsonMissing.of()).map { it.toImmutable() },
                simCardGroupId,
                status,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                type,
                updatedAt,
                version,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SimpleSimCard = apply {
        if (validated) {
            return@apply
        }

        id()
        actionsInProgress()
        authorizedImeis()
        createdAt()
        currentBillingPeriodConsumedData().ifPresent { it.validate() }
        dataLimit().ifPresent { it.validate() }
        eid()
        esimInstallationStatus().ifPresent { it.validate() }
        iccid()
        imsi()
        msisdn()
        recordType()
        resourcesWithInProgressActions()
        simCardGroupId()
        status().ifPresent { it.validate() }
        tags()
        type().ifPresent { it.validate() }
        updatedAt()
        version()
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
            (if (actionsInProgress.asKnown().isPresent) 1 else 0) +
            (authorizedImeis.asKnown().getOrNull()?.size ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (currentBillingPeriodConsumedData.asKnown().getOrNull()?.validity() ?: 0) +
            (dataLimit.asKnown().getOrNull()?.validity() ?: 0) +
            (if (eid.asKnown().isPresent) 1 else 0) +
            (esimInstallationStatus.asKnown().getOrNull()?.validity() ?: 0) +
            (if (iccid.asKnown().isPresent) 1 else 0) +
            (if (imsi.asKnown().isPresent) 1 else 0) +
            (if (msisdn.asKnown().isPresent) 1 else 0) +
            (if (recordType.asKnown().isPresent) 1 else 0) +
            (resourcesWithInProgressActions.asKnown().getOrNull()?.size ?: 0) +
            (if (simCardGroupId.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (tags.asKnown().getOrNull()?.size ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (version.asKnown().isPresent) 1 else 0)

    /** The SIM card consumption so far in the current billing cycle. */
    class CurrentBillingPeriodConsumedData
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val amount: JsonField<String>,
        private val unit: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("unit") @ExcludeMissing unit: JsonField<String> = JsonMissing.of(),
        ) : this(amount, unit, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun amount(): Optional<String> = amount.getOptional("amount")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun unit(): Optional<String> = unit.getOptional("unit")

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

        /**
         * Returns the raw JSON value of [unit].
         *
         * Unlike [unit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<String> = unit

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
             * [CurrentBillingPeriodConsumedData].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CurrentBillingPeriodConsumedData]. */
        class Builder internal constructor() {

            private var amount: JsonField<String> = JsonMissing.of()
            private var unit: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(currentBillingPeriodConsumedData: CurrentBillingPeriodConsumedData) =
                apply {
                    amount = currentBillingPeriodConsumedData.amount
                    unit = currentBillingPeriodConsumedData.unit
                    additionalProperties =
                        currentBillingPeriodConsumedData.additionalProperties.toMutableMap()
                }

            fun amount(amount: String) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amount(amount: JsonField<String>) = apply { this.amount = amount }

            fun unit(unit: String) = unit(JsonField.of(unit))

            /**
             * Sets [Builder.unit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unit] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun unit(unit: JsonField<String>) = apply { this.unit = unit }

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
             * Returns an immutable instance of [CurrentBillingPeriodConsumedData].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CurrentBillingPeriodConsumedData =
                CurrentBillingPeriodConsumedData(amount, unit, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): CurrentBillingPeriodConsumedData = apply {
            if (validated) {
                return@apply
            }

            amount()
            unit()
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
            (if (amount.asKnown().isPresent) 1 else 0) + (if (unit.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CurrentBillingPeriodConsumedData &&
                amount == other.amount &&
                unit == other.unit &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(amount, unit, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CurrentBillingPeriodConsumedData{amount=$amount, unit=$unit, additionalProperties=$additionalProperties}"
    }

    /** The SIM card individual data limit configuration. */
    class DataLimit
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val amount: JsonField<String>,
        private val unit: JsonField<Unit>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("unit") @ExcludeMissing unit: JsonField<Unit> = JsonMissing.of(),
        ) : this(amount, unit, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun amount(): Optional<String> = amount.getOptional("amount")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun unit(): Optional<Unit> = unit.getOptional("unit")

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

        /**
         * Returns the raw JSON value of [unit].
         *
         * Unlike [unit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<Unit> = unit

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

            /** Returns a mutable builder for constructing an instance of [DataLimit]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DataLimit]. */
        class Builder internal constructor() {

            private var amount: JsonField<String> = JsonMissing.of()
            private var unit: JsonField<Unit> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(dataLimit: DataLimit) = apply {
                amount = dataLimit.amount
                unit = dataLimit.unit
                additionalProperties = dataLimit.additionalProperties.toMutableMap()
            }

            fun amount(amount: String) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amount(amount: JsonField<String>) = apply { this.amount = amount }

            fun unit(unit: Unit) = unit(JsonField.of(unit))

            /**
             * Sets [Builder.unit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unit] with a well-typed [Unit] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun unit(unit: JsonField<Unit>) = apply { this.unit = unit }

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
             * Returns an immutable instance of [DataLimit].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): DataLimit = DataLimit(amount, unit, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): DataLimit = apply {
            if (validated) {
                return@apply
            }

            amount()
            unit().ifPresent { it.validate() }
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
            (if (amount.asKnown().isPresent) 1 else 0) +
                (unit.asKnown().getOrNull()?.validity() ?: 0)

        class Unit @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val MB = of("MB")

                @JvmField val GB = of("GB")

                @JvmStatic fun of(value: String) = Unit(JsonField.of(value))
            }

            /** An enum containing [Unit]'s known values. */
            enum class Known {
                MB,
                GB,
            }

            /**
             * An enum containing [Unit]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Unit] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                MB,
                GB,
                /** An enum member indicating that [Unit] was instantiated with an unknown value. */
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
                    MB -> Value.MB
                    GB -> Value.GB
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
                    MB -> Known.MB
                    GB -> Known.GB
                    else -> throw TelnyxInvalidDataException("Unknown Unit: $value")
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

            fun validate(): Unit = apply {
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

                return other is Unit && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DataLimit &&
                amount == other.amount &&
                unit == other.unit &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(amount, unit, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DataLimit{amount=$amount, unit=$unit, additionalProperties=$additionalProperties}"
    }

    /** The installation status of the eSIM. Only applicable for eSIM cards. */
    class EsimInstallationStatus
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

            @JvmField val RELEASED = of("released")

            @JvmField val DISABLED = of("disabled")

            @JvmStatic fun of(value: String) = EsimInstallationStatus(JsonField.of(value))
        }

        /** An enum containing [EsimInstallationStatus]'s known values. */
        enum class Known {
            RELEASED,
            DISABLED,
        }

        /**
         * An enum containing [EsimInstallationStatus]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [EsimInstallationStatus] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            RELEASED,
            DISABLED,
            /**
             * An enum member indicating that [EsimInstallationStatus] was instantiated with an
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
                RELEASED -> Value.RELEASED
                DISABLED -> Value.DISABLED
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
                RELEASED -> Known.RELEASED
                DISABLED -> Known.DISABLED
                else -> throw TelnyxInvalidDataException("Unknown EsimInstallationStatus: $value")
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

        fun validate(): EsimInstallationStatus = apply {
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

            return other is EsimInstallationStatus && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The type of SIM card */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PHYSICAL = of("physical")

            @JvmField val ESIM = of("esim")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            PHYSICAL,
            ESIM,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PHYSICAL,
            ESIM,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                PHYSICAL -> Value.PHYSICAL
                ESIM -> Value.ESIM
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
                PHYSICAL -> Known.PHYSICAL
                ESIM -> Known.ESIM
                else -> throw TelnyxInvalidDataException("Unknown Type: $value")
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

        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SimpleSimCard &&
            id == other.id &&
            actionsInProgress == other.actionsInProgress &&
            authorizedImeis == other.authorizedImeis &&
            createdAt == other.createdAt &&
            currentBillingPeriodConsumedData == other.currentBillingPeriodConsumedData &&
            dataLimit == other.dataLimit &&
            eid == other.eid &&
            esimInstallationStatus == other.esimInstallationStatus &&
            iccid == other.iccid &&
            imsi == other.imsi &&
            msisdn == other.msisdn &&
            recordType == other.recordType &&
            resourcesWithInProgressActions == other.resourcesWithInProgressActions &&
            simCardGroupId == other.simCardGroupId &&
            status == other.status &&
            tags == other.tags &&
            type == other.type &&
            updatedAt == other.updatedAt &&
            version == other.version &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            actionsInProgress,
            authorizedImeis,
            createdAt,
            currentBillingPeriodConsumedData,
            dataLimit,
            eid,
            esimInstallationStatus,
            iccid,
            imsi,
            msisdn,
            recordType,
            resourcesWithInProgressActions,
            simCardGroupId,
            status,
            tags,
            type,
            updatedAt,
            version,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SimpleSimCard{id=$id, actionsInProgress=$actionsInProgress, authorizedImeis=$authorizedImeis, createdAt=$createdAt, currentBillingPeriodConsumedData=$currentBillingPeriodConsumedData, dataLimit=$dataLimit, eid=$eid, esimInstallationStatus=$esimInstallationStatus, iccid=$iccid, imsi=$imsi, msisdn=$msisdn, recordType=$recordType, resourcesWithInProgressActions=$resourcesWithInProgressActions, simCardGroupId=$simCardGroupId, status=$status, tags=$tags, type=$type, updatedAt=$updatedAt, version=$version, additionalProperties=$additionalProperties}"
}
