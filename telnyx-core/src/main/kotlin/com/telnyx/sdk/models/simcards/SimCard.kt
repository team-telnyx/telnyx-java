// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.simcards

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
import com.telnyx.sdk.models.SimCardStatus
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class SimCard
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val actionsInProgress: JsonField<Boolean>,
    private val authorizedImeis: JsonField<List<String>>,
    private val createdAt: JsonField<String>,
    private val currentBillingPeriodConsumedData: JsonField<CurrentBillingPeriodConsumedData>,
    private val currentDeviceLocation: JsonField<CurrentDeviceLocation>,
    private val currentImei: JsonField<String>,
    private val currentMcc: JsonField<String>,
    private val currentMnc: JsonField<String>,
    private val dataLimit: JsonField<DataLimit>,
    private val eid: JsonField<String>,
    private val esimInstallationStatus: JsonField<EsimInstallationStatus>,
    private val iccid: JsonField<String>,
    private val imsi: JsonField<String>,
    private val ipv4: JsonField<String>,
    private val ipv6: JsonField<String>,
    private val liveDataSession: JsonField<LiveDataSession>,
    private val msisdn: JsonField<String>,
    private val pinPukCodes: JsonField<PinPukCodes>,
    private val recordType: JsonField<String>,
    private val resourcesWithInProgressActions: JsonField<List<ResourcesWithInProgressAction>>,
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
        @JsonProperty("current_device_location")
        @ExcludeMissing
        currentDeviceLocation: JsonField<CurrentDeviceLocation> = JsonMissing.of(),
        @JsonProperty("current_imei")
        @ExcludeMissing
        currentImei: JsonField<String> = JsonMissing.of(),
        @JsonProperty("current_mcc")
        @ExcludeMissing
        currentMcc: JsonField<String> = JsonMissing.of(),
        @JsonProperty("current_mnc")
        @ExcludeMissing
        currentMnc: JsonField<String> = JsonMissing.of(),
        @JsonProperty("data_limit")
        @ExcludeMissing
        dataLimit: JsonField<DataLimit> = JsonMissing.of(),
        @JsonProperty("eid") @ExcludeMissing eid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("esim_installation_status")
        @ExcludeMissing
        esimInstallationStatus: JsonField<EsimInstallationStatus> = JsonMissing.of(),
        @JsonProperty("iccid") @ExcludeMissing iccid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("imsi") @ExcludeMissing imsi: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ipv4") @ExcludeMissing ipv4: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ipv6") @ExcludeMissing ipv6: JsonField<String> = JsonMissing.of(),
        @JsonProperty("live_data_session")
        @ExcludeMissing
        liveDataSession: JsonField<LiveDataSession> = JsonMissing.of(),
        @JsonProperty("msisdn") @ExcludeMissing msisdn: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pin_puk_codes")
        @ExcludeMissing
        pinPukCodes: JsonField<PinPukCodes> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("resources_with_in_progress_actions")
        @ExcludeMissing
        resourcesWithInProgressActions: JsonField<List<ResourcesWithInProgressAction>> =
            JsonMissing.of(),
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
        currentDeviceLocation,
        currentImei,
        currentMcc,
        currentMnc,
        dataLimit,
        eid,
        esimInstallationStatus,
        iccid,
        imsi,
        ipv4,
        ipv6,
        liveDataSession,
        msisdn,
        pinPukCodes,
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
     * Current physical location data of a given SIM card. Accuracy is given in meters.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currentDeviceLocation(): Optional<CurrentDeviceLocation> =
        currentDeviceLocation.getOptional("current_device_location")

    /**
     * IMEI of the device where a given SIM card is currently being used.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currentImei(): Optional<String> = currentImei.getOptional("current_imei")

    /**
     * Mobile Country Code of the current network to which the SIM card is connected. It's a three
     * decimal digit that identifies a country.<br/><br/> This code is commonly seen joined with a
     * Mobile Network Code (MNC) in a tuple that allows identifying a carrier known as PLMN (Public
     * Land Mobile Network) code.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currentMcc(): Optional<String> = currentMcc.getOptional("current_mcc")

    /**
     * Mobile Network Code of the current network to which the SIM card is connected. It's a two to
     * three decimal digits that identify a network.<br/><br/> This code is commonly seen joined
     * with a Mobile Country Code (MCC) in a tuple that allows identifying a carrier known as PLMN
     * (Public Land Mobile Network) code.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currentMnc(): Optional<String> = currentMnc.getOptional("current_mnc")

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
     * The SIM's address in the currently connected network. This IPv4 address is usually obtained
     * dynamically, so it may vary according to the location or new connections.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ipv4(): Optional<String> = ipv4.getOptional("ipv4")

    /**
     * The SIM's address in the currently connected network. This IPv6 address is usually obtained
     * dynamically, so it may vary according to the location or new connections.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ipv6(): Optional<String> = ipv6.getOptional("ipv6")

    /**
     * Indicates whether the device is actively connected to a network and able to run data.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun liveDataSession(): Optional<LiveDataSession> =
        liveDataSession.getOptional("live_data_session")

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
     * PIN and PUK codes for the SIM card. Only available when include_pin_puk_codes=true is set in
     * the request.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pinPukCodes(): Optional<PinPukCodes> = pinPukCodes.getOptional("pin_puk_codes")

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
    fun resourcesWithInProgressActions(): Optional<List<ResourcesWithInProgressAction>> =
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
     * Returns the raw JSON value of [currentDeviceLocation].
     *
     * Unlike [currentDeviceLocation], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("current_device_location")
    @ExcludeMissing
    fun _currentDeviceLocation(): JsonField<CurrentDeviceLocation> = currentDeviceLocation

    /**
     * Returns the raw JSON value of [currentImei].
     *
     * Unlike [currentImei], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("current_imei")
    @ExcludeMissing
    fun _currentImei(): JsonField<String> = currentImei

    /**
     * Returns the raw JSON value of [currentMcc].
     *
     * Unlike [currentMcc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("current_mcc") @ExcludeMissing fun _currentMcc(): JsonField<String> = currentMcc

    /**
     * Returns the raw JSON value of [currentMnc].
     *
     * Unlike [currentMnc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("current_mnc") @ExcludeMissing fun _currentMnc(): JsonField<String> = currentMnc

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
     * Returns the raw JSON value of [ipv4].
     *
     * Unlike [ipv4], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ipv4") @ExcludeMissing fun _ipv4(): JsonField<String> = ipv4

    /**
     * Returns the raw JSON value of [ipv6].
     *
     * Unlike [ipv6], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ipv6") @ExcludeMissing fun _ipv6(): JsonField<String> = ipv6

    /**
     * Returns the raw JSON value of [liveDataSession].
     *
     * Unlike [liveDataSession], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("live_data_session")
    @ExcludeMissing
    fun _liveDataSession(): JsonField<LiveDataSession> = liveDataSession

    /**
     * Returns the raw JSON value of [msisdn].
     *
     * Unlike [msisdn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("msisdn") @ExcludeMissing fun _msisdn(): JsonField<String> = msisdn

    /**
     * Returns the raw JSON value of [pinPukCodes].
     *
     * Unlike [pinPukCodes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pin_puk_codes")
    @ExcludeMissing
    fun _pinPukCodes(): JsonField<PinPukCodes> = pinPukCodes

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
    fun _resourcesWithInProgressActions(): JsonField<List<ResourcesWithInProgressAction>> =
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

        /** Returns a mutable builder for constructing an instance of [SimCard]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SimCard]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var actionsInProgress: JsonField<Boolean> = JsonMissing.of()
        private var authorizedImeis: JsonField<MutableList<String>>? = null
        private var createdAt: JsonField<String> = JsonMissing.of()
        private var currentBillingPeriodConsumedData: JsonField<CurrentBillingPeriodConsumedData> =
            JsonMissing.of()
        private var currentDeviceLocation: JsonField<CurrentDeviceLocation> = JsonMissing.of()
        private var currentImei: JsonField<String> = JsonMissing.of()
        private var currentMcc: JsonField<String> = JsonMissing.of()
        private var currentMnc: JsonField<String> = JsonMissing.of()
        private var dataLimit: JsonField<DataLimit> = JsonMissing.of()
        private var eid: JsonField<String> = JsonMissing.of()
        private var esimInstallationStatus: JsonField<EsimInstallationStatus> = JsonMissing.of()
        private var iccid: JsonField<String> = JsonMissing.of()
        private var imsi: JsonField<String> = JsonMissing.of()
        private var ipv4: JsonField<String> = JsonMissing.of()
        private var ipv6: JsonField<String> = JsonMissing.of()
        private var liveDataSession: JsonField<LiveDataSession> = JsonMissing.of()
        private var msisdn: JsonField<String> = JsonMissing.of()
        private var pinPukCodes: JsonField<PinPukCodes> = JsonMissing.of()
        private var recordType: JsonField<String> = JsonMissing.of()
        private var resourcesWithInProgressActions:
            JsonField<MutableList<ResourcesWithInProgressAction>>? =
            null
        private var simCardGroupId: JsonField<String> = JsonMissing.of()
        private var status: JsonField<SimCardStatus> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var type: JsonField<Type> = JsonMissing.of()
        private var updatedAt: JsonField<String> = JsonMissing.of()
        private var version: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(simCard: SimCard) = apply {
            id = simCard.id
            actionsInProgress = simCard.actionsInProgress
            authorizedImeis = simCard.authorizedImeis.map { it.toMutableList() }
            createdAt = simCard.createdAt
            currentBillingPeriodConsumedData = simCard.currentBillingPeriodConsumedData
            currentDeviceLocation = simCard.currentDeviceLocation
            currentImei = simCard.currentImei
            currentMcc = simCard.currentMcc
            currentMnc = simCard.currentMnc
            dataLimit = simCard.dataLimit
            eid = simCard.eid
            esimInstallationStatus = simCard.esimInstallationStatus
            iccid = simCard.iccid
            imsi = simCard.imsi
            ipv4 = simCard.ipv4
            ipv6 = simCard.ipv6
            liveDataSession = simCard.liveDataSession
            msisdn = simCard.msisdn
            pinPukCodes = simCard.pinPukCodes
            recordType = simCard.recordType
            resourcesWithInProgressActions =
                simCard.resourcesWithInProgressActions.map { it.toMutableList() }
            simCardGroupId = simCard.simCardGroupId
            status = simCard.status
            tags = simCard.tags.map { it.toMutableList() }
            type = simCard.type
            updatedAt = simCard.updatedAt
            version = simCard.version
            additionalProperties = simCard.additionalProperties.toMutableMap()
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

        /** Current physical location data of a given SIM card. Accuracy is given in meters. */
        fun currentDeviceLocation(currentDeviceLocation: CurrentDeviceLocation) =
            currentDeviceLocation(JsonField.of(currentDeviceLocation))

        /**
         * Sets [Builder.currentDeviceLocation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currentDeviceLocation] with a well-typed
         * [CurrentDeviceLocation] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun currentDeviceLocation(currentDeviceLocation: JsonField<CurrentDeviceLocation>) = apply {
            this.currentDeviceLocation = currentDeviceLocation
        }

        /** IMEI of the device where a given SIM card is currently being used. */
        fun currentImei(currentImei: String) = currentImei(JsonField.of(currentImei))

        /**
         * Sets [Builder.currentImei] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currentImei] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currentImei(currentImei: JsonField<String>) = apply { this.currentImei = currentImei }

        /**
         * Mobile Country Code of the current network to which the SIM card is connected. It's a
         * three decimal digit that identifies a country.<br/><br/> This code is commonly seen
         * joined with a Mobile Network Code (MNC) in a tuple that allows identifying a carrier
         * known as PLMN (Public Land Mobile Network) code.
         */
        fun currentMcc(currentMcc: String) = currentMcc(JsonField.of(currentMcc))

        /**
         * Sets [Builder.currentMcc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currentMcc] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currentMcc(currentMcc: JsonField<String>) = apply { this.currentMcc = currentMcc }

        /**
         * Mobile Network Code of the current network to which the SIM card is connected. It's a two
         * to three decimal digits that identify a network.<br/><br/> This code is commonly seen
         * joined with a Mobile Country Code (MCC) in a tuple that allows identifying a carrier
         * known as PLMN (Public Land Mobile Network) code.
         */
        fun currentMnc(currentMnc: String) = currentMnc(JsonField.of(currentMnc))

        /**
         * Sets [Builder.currentMnc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currentMnc] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currentMnc(currentMnc: JsonField<String>) = apply { this.currentMnc = currentMnc }

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
         * The SIM's address in the currently connected network. This IPv4 address is usually
         * obtained dynamically, so it may vary according to the location or new connections.
         */
        fun ipv4(ipv4: String) = ipv4(JsonField.of(ipv4))

        /**
         * Sets [Builder.ipv4] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ipv4] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ipv4(ipv4: JsonField<String>) = apply { this.ipv4 = ipv4 }

        /**
         * The SIM's address in the currently connected network. This IPv6 address is usually
         * obtained dynamically, so it may vary according to the location or new connections.
         */
        fun ipv6(ipv6: String) = ipv6(JsonField.of(ipv6))

        /**
         * Sets [Builder.ipv6] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ipv6] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ipv6(ipv6: JsonField<String>) = apply { this.ipv6 = ipv6 }

        /** Indicates whether the device is actively connected to a network and able to run data. */
        fun liveDataSession(liveDataSession: LiveDataSession) =
            liveDataSession(JsonField.of(liveDataSession))

        /**
         * Sets [Builder.liveDataSession] to an arbitrary JSON value.
         *
         * You should usually call [Builder.liveDataSession] with a well-typed [LiveDataSession]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun liveDataSession(liveDataSession: JsonField<LiveDataSession>) = apply {
            this.liveDataSession = liveDataSession
        }

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

        /**
         * PIN and PUK codes for the SIM card. Only available when include_pin_puk_codes=true is set
         * in the request.
         */
        fun pinPukCodes(pinPukCodes: PinPukCodes) = pinPukCodes(JsonField.of(pinPukCodes))

        /**
         * Sets [Builder.pinPukCodes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pinPukCodes] with a well-typed [PinPukCodes] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pinPukCodes(pinPukCodes: JsonField<PinPukCodes>) = apply {
            this.pinPukCodes = pinPukCodes
        }

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
        fun resourcesWithInProgressActions(
            resourcesWithInProgressActions: List<ResourcesWithInProgressAction>
        ) = resourcesWithInProgressActions(JsonField.of(resourcesWithInProgressActions))

        /**
         * Sets [Builder.resourcesWithInProgressActions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resourcesWithInProgressActions] with a well-typed
         * `List<ResourcesWithInProgressAction>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun resourcesWithInProgressActions(
            resourcesWithInProgressActions: JsonField<List<ResourcesWithInProgressAction>>
        ) = apply {
            this.resourcesWithInProgressActions =
                resourcesWithInProgressActions.map { it.toMutableList() }
        }

        /**
         * Adds a single [ResourcesWithInProgressAction] to [resourcesWithInProgressActions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addResourcesWithInProgressAction(
            resourcesWithInProgressAction: ResourcesWithInProgressAction
        ) = apply {
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
         * Returns an immutable instance of [SimCard].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SimCard =
            SimCard(
                id,
                actionsInProgress,
                (authorizedImeis ?: JsonMissing.of()).map { it.toImmutable() },
                createdAt,
                currentBillingPeriodConsumedData,
                currentDeviceLocation,
                currentImei,
                currentMcc,
                currentMnc,
                dataLimit,
                eid,
                esimInstallationStatus,
                iccid,
                imsi,
                ipv4,
                ipv6,
                liveDataSession,
                msisdn,
                pinPukCodes,
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

    fun validate(): SimCard = apply {
        if (validated) {
            return@apply
        }

        id()
        actionsInProgress()
        authorizedImeis()
        createdAt()
        currentBillingPeriodConsumedData().ifPresent { it.validate() }
        currentDeviceLocation().ifPresent { it.validate() }
        currentImei()
        currentMcc()
        currentMnc()
        dataLimit().ifPresent { it.validate() }
        eid()
        esimInstallationStatus().ifPresent { it.validate() }
        iccid()
        imsi()
        ipv4()
        ipv6()
        liveDataSession().ifPresent { it.validate() }
        msisdn()
        pinPukCodes().ifPresent { it.validate() }
        recordType()
        resourcesWithInProgressActions().ifPresent { it.forEach { it.validate() } }
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
            (currentDeviceLocation.asKnown().getOrNull()?.validity() ?: 0) +
            (if (currentImei.asKnown().isPresent) 1 else 0) +
            (if (currentMcc.asKnown().isPresent) 1 else 0) +
            (if (currentMnc.asKnown().isPresent) 1 else 0) +
            (dataLimit.asKnown().getOrNull()?.validity() ?: 0) +
            (if (eid.asKnown().isPresent) 1 else 0) +
            (esimInstallationStatus.asKnown().getOrNull()?.validity() ?: 0) +
            (if (iccid.asKnown().isPresent) 1 else 0) +
            (if (imsi.asKnown().isPresent) 1 else 0) +
            (if (ipv4.asKnown().isPresent) 1 else 0) +
            (if (ipv6.asKnown().isPresent) 1 else 0) +
            (liveDataSession.asKnown().getOrNull()?.validity() ?: 0) +
            (if (msisdn.asKnown().isPresent) 1 else 0) +
            (pinPukCodes.asKnown().getOrNull()?.validity() ?: 0) +
            (if (recordType.asKnown().isPresent) 1 else 0) +
            (resourcesWithInProgressActions.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                ?: 0) +
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

    /** Current physical location data of a given SIM card. Accuracy is given in meters. */
    class CurrentDeviceLocation
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accuracy: JsonField<Long>,
        private val accuracyUnit: JsonField<String>,
        private val latitude: JsonField<String>,
        private val longitude: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accuracy") @ExcludeMissing accuracy: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("accuracy_unit")
            @ExcludeMissing
            accuracyUnit: JsonField<String> = JsonMissing.of(),
            @JsonProperty("latitude")
            @ExcludeMissing
            latitude: JsonField<String> = JsonMissing.of(),
            @JsonProperty("longitude")
            @ExcludeMissing
            longitude: JsonField<String> = JsonMissing.of(),
        ) : this(accuracy, accuracyUnit, latitude, longitude, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun accuracy(): Optional<Long> = accuracy.getOptional("accuracy")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun accuracyUnit(): Optional<String> = accuracyUnit.getOptional("accuracy_unit")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun latitude(): Optional<String> = latitude.getOptional("latitude")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun longitude(): Optional<String> = longitude.getOptional("longitude")

        /**
         * Returns the raw JSON value of [accuracy].
         *
         * Unlike [accuracy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("accuracy") @ExcludeMissing fun _accuracy(): JsonField<Long> = accuracy

        /**
         * Returns the raw JSON value of [accuracyUnit].
         *
         * Unlike [accuracyUnit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("accuracy_unit")
        @ExcludeMissing
        fun _accuracyUnit(): JsonField<String> = accuracyUnit

        /**
         * Returns the raw JSON value of [latitude].
         *
         * Unlike [latitude], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("latitude") @ExcludeMissing fun _latitude(): JsonField<String> = latitude

        /**
         * Returns the raw JSON value of [longitude].
         *
         * Unlike [longitude], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("longitude") @ExcludeMissing fun _longitude(): JsonField<String> = longitude

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
             * Returns a mutable builder for constructing an instance of [CurrentDeviceLocation].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CurrentDeviceLocation]. */
        class Builder internal constructor() {

            private var accuracy: JsonField<Long> = JsonMissing.of()
            private var accuracyUnit: JsonField<String> = JsonMissing.of()
            private var latitude: JsonField<String> = JsonMissing.of()
            private var longitude: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(currentDeviceLocation: CurrentDeviceLocation) = apply {
                accuracy = currentDeviceLocation.accuracy
                accuracyUnit = currentDeviceLocation.accuracyUnit
                latitude = currentDeviceLocation.latitude
                longitude = currentDeviceLocation.longitude
                additionalProperties = currentDeviceLocation.additionalProperties.toMutableMap()
            }

            fun accuracy(accuracy: Long) = accuracy(JsonField.of(accuracy))

            /**
             * Sets [Builder.accuracy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accuracy] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accuracy(accuracy: JsonField<Long>) = apply { this.accuracy = accuracy }

            fun accuracyUnit(accuracyUnit: String) = accuracyUnit(JsonField.of(accuracyUnit))

            /**
             * Sets [Builder.accuracyUnit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accuracyUnit] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accuracyUnit(accuracyUnit: JsonField<String>) = apply {
                this.accuracyUnit = accuracyUnit
            }

            fun latitude(latitude: String) = latitude(JsonField.of(latitude))

            /**
             * Sets [Builder.latitude] to an arbitrary JSON value.
             *
             * You should usually call [Builder.latitude] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun latitude(latitude: JsonField<String>) = apply { this.latitude = latitude }

            fun longitude(longitude: String) = longitude(JsonField.of(longitude))

            /**
             * Sets [Builder.longitude] to an arbitrary JSON value.
             *
             * You should usually call [Builder.longitude] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun longitude(longitude: JsonField<String>) = apply { this.longitude = longitude }

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
             * Returns an immutable instance of [CurrentDeviceLocation].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CurrentDeviceLocation =
                CurrentDeviceLocation(
                    accuracy,
                    accuracyUnit,
                    latitude,
                    longitude,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): CurrentDeviceLocation = apply {
            if (validated) {
                return@apply
            }

            accuracy()
            accuracyUnit()
            latitude()
            longitude()
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
            (if (accuracy.asKnown().isPresent) 1 else 0) +
                (if (accuracyUnit.asKnown().isPresent) 1 else 0) +
                (if (latitude.asKnown().isPresent) 1 else 0) +
                (if (longitude.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CurrentDeviceLocation &&
                accuracy == other.accuracy &&
                accuracyUnit == other.accuracyUnit &&
                latitude == other.latitude &&
                longitude == other.longitude &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(accuracy, accuracyUnit, latitude, longitude, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CurrentDeviceLocation{accuracy=$accuracy, accuracyUnit=$accuracyUnit, latitude=$latitude, longitude=$longitude, additionalProperties=$additionalProperties}"
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

    /** Indicates whether the device is actively connected to a network and able to run data. */
    class LiveDataSession @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val CONNECTED = of("connected")

            @JvmField val DISCONNECTED = of("disconnected")

            @JvmField val UNKNOWN = of("unknown")

            @JvmStatic fun of(value: String) = LiveDataSession(JsonField.of(value))
        }

        /** An enum containing [LiveDataSession]'s known values. */
        enum class Known {
            CONNECTED,
            DISCONNECTED,
            UNKNOWN,
        }

        /**
         * An enum containing [LiveDataSession]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [LiveDataSession] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CONNECTED,
            DISCONNECTED,
            UNKNOWN,
            /**
             * An enum member indicating that [LiveDataSession] was instantiated with an unknown
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
                CONNECTED -> Value.CONNECTED
                DISCONNECTED -> Value.DISCONNECTED
                UNKNOWN -> Value.UNKNOWN
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
                CONNECTED -> Known.CONNECTED
                DISCONNECTED -> Known.DISCONNECTED
                UNKNOWN -> Known.UNKNOWN
                else -> throw TelnyxInvalidDataException("Unknown LiveDataSession: $value")
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

        fun validate(): LiveDataSession = apply {
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

            return other is LiveDataSession && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * PIN and PUK codes for the SIM card. Only available when include_pin_puk_codes=true is set in
     * the request.
     */
    class PinPukCodes
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val pin1: JsonField<String>,
        private val pin2: JsonField<String>,
        private val puk1: JsonField<String>,
        private val puk2: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("pin1") @ExcludeMissing pin1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pin2") @ExcludeMissing pin2: JsonField<String> = JsonMissing.of(),
            @JsonProperty("puk1") @ExcludeMissing puk1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("puk2") @ExcludeMissing puk2: JsonField<String> = JsonMissing.of(),
        ) : this(pin1, pin2, puk1, puk2, mutableMapOf())

        /**
         * The primary Personal Identification Number (PIN) for the SIM card. This is a 4-digit code
         * used to protect the SIM card from unauthorized use.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pin1(): Optional<String> = pin1.getOptional("pin1")

        /**
         * The secondary Personal Identification Number (PIN2) for the SIM card. This is a 4-digit
         * code used for additional security features.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pin2(): Optional<String> = pin2.getOptional("pin2")

        /**
         * The primary Personal Unblocking Key (PUK1) for the SIM card. This is an 8-digit code used
         * to unlock the SIM card if PIN1 is entered incorrectly multiple times.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun puk1(): Optional<String> = puk1.getOptional("puk1")

        /**
         * The secondary Personal Unblocking Key (PUK2) for the SIM card. This is an 8-digit code
         * used to unlock the SIM card if PIN2 is entered incorrectly multiple times.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun puk2(): Optional<String> = puk2.getOptional("puk2")

        /**
         * Returns the raw JSON value of [pin1].
         *
         * Unlike [pin1], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pin1") @ExcludeMissing fun _pin1(): JsonField<String> = pin1

        /**
         * Returns the raw JSON value of [pin2].
         *
         * Unlike [pin2], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pin2") @ExcludeMissing fun _pin2(): JsonField<String> = pin2

        /**
         * Returns the raw JSON value of [puk1].
         *
         * Unlike [puk1], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("puk1") @ExcludeMissing fun _puk1(): JsonField<String> = puk1

        /**
         * Returns the raw JSON value of [puk2].
         *
         * Unlike [puk2], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("puk2") @ExcludeMissing fun _puk2(): JsonField<String> = puk2

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

            /** Returns a mutable builder for constructing an instance of [PinPukCodes]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PinPukCodes]. */
        class Builder internal constructor() {

            private var pin1: JsonField<String> = JsonMissing.of()
            private var pin2: JsonField<String> = JsonMissing.of()
            private var puk1: JsonField<String> = JsonMissing.of()
            private var puk2: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(pinPukCodes: PinPukCodes) = apply {
                pin1 = pinPukCodes.pin1
                pin2 = pinPukCodes.pin2
                puk1 = pinPukCodes.puk1
                puk2 = pinPukCodes.puk2
                additionalProperties = pinPukCodes.additionalProperties.toMutableMap()
            }

            /**
             * The primary Personal Identification Number (PIN) for the SIM card. This is a 4-digit
             * code used to protect the SIM card from unauthorized use.
             */
            fun pin1(pin1: String) = pin1(JsonField.of(pin1))

            /**
             * Sets [Builder.pin1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pin1] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun pin1(pin1: JsonField<String>) = apply { this.pin1 = pin1 }

            /**
             * The secondary Personal Identification Number (PIN2) for the SIM card. This is a
             * 4-digit code used for additional security features.
             */
            fun pin2(pin2: String) = pin2(JsonField.of(pin2))

            /**
             * Sets [Builder.pin2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pin2] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun pin2(pin2: JsonField<String>) = apply { this.pin2 = pin2 }

            /**
             * The primary Personal Unblocking Key (PUK1) for the SIM card. This is an 8-digit code
             * used to unlock the SIM card if PIN1 is entered incorrectly multiple times.
             */
            fun puk1(puk1: String) = puk1(JsonField.of(puk1))

            /**
             * Sets [Builder.puk1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.puk1] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun puk1(puk1: JsonField<String>) = apply { this.puk1 = puk1 }

            /**
             * The secondary Personal Unblocking Key (PUK2) for the SIM card. This is an 8-digit
             * code used to unlock the SIM card if PIN2 is entered incorrectly multiple times.
             */
            fun puk2(puk2: String) = puk2(JsonField.of(puk2))

            /**
             * Sets [Builder.puk2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.puk2] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun puk2(puk2: JsonField<String>) = apply { this.puk2 = puk2 }

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
             * Returns an immutable instance of [PinPukCodes].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): PinPukCodes =
                PinPukCodes(pin1, pin2, puk1, puk2, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): PinPukCodes = apply {
            if (validated) {
                return@apply
            }

            pin1()
            pin2()
            puk1()
            puk2()
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
            (if (pin1.asKnown().isPresent) 1 else 0) +
                (if (pin2.asKnown().isPresent) 1 else 0) +
                (if (puk1.asKnown().isPresent) 1 else 0) +
                (if (puk2.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PinPukCodes &&
                pin1 == other.pin1 &&
                pin2 == other.pin2 &&
                puk1 == other.puk1 &&
                puk2 == other.puk2 &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(pin1, pin2, puk1, puk2, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PinPukCodes{pin1=$pin1, pin2=$pin2, puk1=$puk1, puk2=$puk2, additionalProperties=$additionalProperties}"
    }

    class ResourcesWithInProgressAction
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [ResourcesWithInProgressAction].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ResourcesWithInProgressAction]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(resourcesWithInProgressAction: ResourcesWithInProgressAction) =
                apply {
                    additionalProperties =
                        resourcesWithInProgressAction.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ResourcesWithInProgressAction].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ResourcesWithInProgressAction =
                ResourcesWithInProgressAction(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): ResourcesWithInProgressAction = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ResourcesWithInProgressAction &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ResourcesWithInProgressAction{additionalProperties=$additionalProperties}"
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

        return other is SimCard &&
            id == other.id &&
            actionsInProgress == other.actionsInProgress &&
            authorizedImeis == other.authorizedImeis &&
            createdAt == other.createdAt &&
            currentBillingPeriodConsumedData == other.currentBillingPeriodConsumedData &&
            currentDeviceLocation == other.currentDeviceLocation &&
            currentImei == other.currentImei &&
            currentMcc == other.currentMcc &&
            currentMnc == other.currentMnc &&
            dataLimit == other.dataLimit &&
            eid == other.eid &&
            esimInstallationStatus == other.esimInstallationStatus &&
            iccid == other.iccid &&
            imsi == other.imsi &&
            ipv4 == other.ipv4 &&
            ipv6 == other.ipv6 &&
            liveDataSession == other.liveDataSession &&
            msisdn == other.msisdn &&
            pinPukCodes == other.pinPukCodes &&
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
            currentDeviceLocation,
            currentImei,
            currentMcc,
            currentMnc,
            dataLimit,
            eid,
            esimInstallationStatus,
            iccid,
            imsi,
            ipv4,
            ipv6,
            liveDataSession,
            msisdn,
            pinPukCodes,
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
        "SimCard{id=$id, actionsInProgress=$actionsInProgress, authorizedImeis=$authorizedImeis, createdAt=$createdAt, currentBillingPeriodConsumedData=$currentBillingPeriodConsumedData, currentDeviceLocation=$currentDeviceLocation, currentImei=$currentImei, currentMcc=$currentMcc, currentMnc=$currentMnc, dataLimit=$dataLimit, eid=$eid, esimInstallationStatus=$esimInstallationStatus, iccid=$iccid, imsi=$imsi, ipv4=$ipv4, ipv6=$ipv6, liveDataSession=$liveDataSession, msisdn=$msisdn, pinPukCodes=$pinPukCodes, recordType=$recordType, resourcesWithInProgressActions=$resourcesWithInProgressActions, simCardGroupId=$simCardGroupId, status=$status, tags=$tags, type=$type, updatedAt=$updatedAt, version=$version, additionalProperties=$additionalProperties}"
}
