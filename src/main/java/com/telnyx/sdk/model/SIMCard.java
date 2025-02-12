/*
 * Telnyx API
 * SIP trunking, SMS, MMS, Call Control and Telephony Data Services.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: support@telnyx.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.telnyx.sdk.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.telnyx.sdk.JSON;
import com.telnyx.sdk.model.SIMCardCurrentDeviceLocation;
import com.telnyx.sdk.model.SIMCardDataLimit;
import com.telnyx.sdk.model.SIMCardStatus;
import com.telnyx.sdk.model.SimpleSIMCardCurrentBillingPeriodConsumedData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * SIMCard
 */
@JsonPropertyOrder(
    {
        SIMCard.JSON_PROPERTY_ID,
        SIMCard.JSON_PROPERTY_RECORD_TYPE,
        SIMCard.JSON_PROPERTY_STATUS,
        SIMCard.JSON_PROPERTY_TYPE,
        SIMCard.JSON_PROPERTY_ICCID,
        SIMCard.JSON_PROPERTY_IMSI,
        SIMCard.JSON_PROPERTY_MSISDN,
        SIMCard.JSON_PROPERTY_SIM_CARD_GROUP_ID,
        SIMCard.JSON_PROPERTY_TAGS,
        SIMCard.JSON_PROPERTY_AUTHORIZED_IMEIS,
        SIMCard.JSON_PROPERTY_CURRENT_IMEI,
        SIMCard.JSON_PROPERTY_DATA_LIMIT,
        SIMCard.JSON_PROPERTY_CURRENT_BILLING_PERIOD_CONSUMED_DATA,
        SIMCard.JSON_PROPERTY_ACTIONS_IN_PROGRESS,
        SIMCard.JSON_PROPERTY_CREATED_AT,
        SIMCard.JSON_PROPERTY_UPDATED_AT,
        SIMCard.JSON_PROPERTY_IPV4,
        SIMCard.JSON_PROPERTY_IPV6,
        SIMCard.JSON_PROPERTY_CURRENT_DEVICE_LOCATION,
        SIMCard.JSON_PROPERTY_CURRENT_MNC,
        SIMCard.JSON_PROPERTY_CURRENT_MCC,
        SIMCard.JSON_PROPERTY_LIVE_DATA_SESSION,
    }
)
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class SIMCard {

    public static final String JSON_PROPERTY_ID = "id";
    private UUID id;

    public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
    private String recordType;

    public static final String JSON_PROPERTY_STATUS = "status";
    private SIMCardStatus status;

    /**
     * The type of SIM card
     */
    public enum TypeEnum {
        PHYSICAL(String.valueOf("physical")),

        ESIM(String.valueOf("esim"));

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromValue(String value) {
            for (TypeEnum b : TypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_TYPE = "type";
    private TypeEnum type;

    public static final String JSON_PROPERTY_ICCID = "iccid";
    private String iccid;

    public static final String JSON_PROPERTY_IMSI = "imsi";
    private String imsi;

    public static final String JSON_PROPERTY_MSISDN = "msisdn";
    private String msisdn;

    public static final String JSON_PROPERTY_SIM_CARD_GROUP_ID =
        "sim_card_group_id";
    private UUID simCardGroupId;

    public static final String JSON_PROPERTY_TAGS = "tags";
    private List<String> tags = null;

    public static final String JSON_PROPERTY_AUTHORIZED_IMEIS =
        "authorized_imeis";
    private List<String> authorizedImeis = null;

    public static final String JSON_PROPERTY_CURRENT_IMEI = "current_imei";
    private String currentImei;

    public static final String JSON_PROPERTY_DATA_LIMIT = "data_limit";
    private SIMCardDataLimit dataLimit;

    public static final String JSON_PROPERTY_CURRENT_BILLING_PERIOD_CONSUMED_DATA =
        "current_billing_period_consumed_data";
    private SimpleSIMCardCurrentBillingPeriodConsumedData currentBillingPeriodConsumedData;

    public static final String JSON_PROPERTY_ACTIONS_IN_PROGRESS =
        "actions_in_progress";
    private Boolean actionsInProgress = false;

    public static final String JSON_PROPERTY_CREATED_AT = "created_at";
    private String createdAt;

    public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
    private String updatedAt;

    public static final String JSON_PROPERTY_IPV4 = "ipv4";
    private String ipv4;

    public static final String JSON_PROPERTY_IPV6 = "ipv6";
    private String ipv6;

    public static final String JSON_PROPERTY_CURRENT_DEVICE_LOCATION =
        "current_device_location";
    private SIMCardCurrentDeviceLocation currentDeviceLocation;

    public static final String JSON_PROPERTY_CURRENT_MNC = "current_mnc";
    private String currentMnc;

    public static final String JSON_PROPERTY_CURRENT_MCC = "current_mcc";
    private String currentMcc;

    /**
     * Indicates whether the device is actively connected to a network and able to run data.
     */
    public enum LiveDataSessionEnum {
        CONNECTED(String.valueOf("connected")),

        DISCONNECTED(String.valueOf("disconnected")),

        UNKNOWN(String.valueOf("unknown"));

        private String value;

        LiveDataSessionEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static LiveDataSessionEnum fromValue(String value) {
            for (LiveDataSessionEnum b : LiveDataSessionEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_LIVE_DATA_SESSION =
        "live_data_session";
    private LiveDataSessionEnum liveDataSession;

    public SIMCard() {}

    @JsonCreator
    public SIMCard(
        @JsonProperty(JSON_PROPERTY_ID) UUID id,
        @JsonProperty(JSON_PROPERTY_RECORD_TYPE) String recordType,
        @JsonProperty(JSON_PROPERTY_TYPE) TypeEnum type,
        @JsonProperty(JSON_PROPERTY_ICCID) String iccid,
        @JsonProperty(JSON_PROPERTY_IMSI) String imsi,
        @JsonProperty(JSON_PROPERTY_MSISDN) String msisdn,
        @JsonProperty(JSON_PROPERTY_CURRENT_IMEI) String currentImei,
        @JsonProperty(
            JSON_PROPERTY_ACTIONS_IN_PROGRESS
        ) Boolean actionsInProgress,
        @JsonProperty(JSON_PROPERTY_CREATED_AT) String createdAt,
        @JsonProperty(JSON_PROPERTY_UPDATED_AT) String updatedAt,
        @JsonProperty(JSON_PROPERTY_IPV4) String ipv4,
        @JsonProperty(JSON_PROPERTY_IPV6) String ipv6,
        @JsonProperty(JSON_PROPERTY_CURRENT_MNC) String currentMnc,
        @JsonProperty(JSON_PROPERTY_CURRENT_MCC) String currentMcc,
        @JsonProperty(
            JSON_PROPERTY_LIVE_DATA_SESSION
        ) LiveDataSessionEnum liveDataSession
    ) {
        this();
        this.id = id;
        this.recordType = recordType;
        this.type = type;
        this.iccid = iccid;
        this.imsi = imsi;
        this.msisdn = msisdn;
        this.currentImei = currentImei;
        this.actionsInProgress = actionsInProgress;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.ipv4 = ipv4;
        this.ipv6 = ipv6;
        this.currentMnc = currentMnc;
        this.currentMcc = currentMcc;
        this.liveDataSession = liveDataSession;
    }

    /**
     * Identifies the resource.
     * @return id
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "6a09cdc3-8948-47f0-aa62-74ac943d6c58",
        value = "Identifies the resource."
    )
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public UUID getId() {
        return id;
    }

    /**
     * Get recordType
     * @return recordType
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "sim_card", value = "")
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getRecordType() {
        return recordType;
    }

    public SIMCard status(SIMCardStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public SIMCardStatus getStatus() {
        return status;
    }

    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStatus(SIMCardStatus status) {
        this.status = status;
    }

    /**
     * The type of SIM card
     * @return type
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "physical", value = "The type of SIM card")
    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public TypeEnum getType() {
        return type;
    }

    /**
     * The ICCID is the identifier of the specific SIM card/chip. Each SIM is internationally identified by its integrated circuit card identifier (ICCID). ICCIDs are stored in the SIM card&#39;s memory and are also engraved or printed on the SIM card body during a process called personalization.
     * @return iccid
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "89310410106543789301",
        value = "The ICCID is the identifier of the specific SIM card/chip. Each SIM is internationally identified by its integrated circuit card identifier (ICCID). ICCIDs are stored in the SIM card's memory and are also engraved or printed on the SIM card body during a process called personalization. "
    )
    @JsonProperty(JSON_PROPERTY_ICCID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getIccid() {
        return iccid;
    }

    /**
     * SIM cards are identified on their individual network operators by a unique International Mobile Subscriber Identity (IMSI). &lt;br/&gt; Mobile network operators connect mobile phone calls and communicate with their market SIM cards using their IMSIs. The IMSI is stored in the Subscriber  Identity Module (SIM) inside the device and is sent by the device to the appropriate network. It is used to acquire the details of the device in the Home  Location Register (HLR) or the Visitor Location Register (VLR).
     * @return imsi
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "081932214823362973",
        value = "SIM cards are identified on their individual network operators by a unique International Mobile Subscriber Identity (IMSI). <br/> Mobile network operators connect mobile phone calls and communicate with their market SIM cards using their IMSIs. The IMSI is stored in the Subscriber  Identity Module (SIM) inside the device and is sent by the device to the appropriate network. It is used to acquire the details of the device in the Home  Location Register (HLR) or the Visitor Location Register (VLR). "
    )
    @JsonProperty(JSON_PROPERTY_IMSI)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getImsi() {
        return imsi;
    }

    /**
     * Mobile Station International Subscriber Directory Number (MSISDN) is a number used to identify a mobile phone number internationally. &lt;br/&gt; MSISDN is defined by the E.164 numbering plan. It includes a country code and a National Destination Code which identifies the subscriber&#39;s operator.
     * @return msisdn
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "+13109976224",
        value = "Mobile Station International Subscriber Directory Number (MSISDN) is a number used to identify a mobile phone number internationally. <br/> MSISDN is defined by the E.164 numbering plan. It includes a country code and a National Destination Code which identifies the subscriber's operator. "
    )
    @JsonProperty(JSON_PROPERTY_MSISDN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getMsisdn() {
        return msisdn;
    }

    public SIMCard simCardGroupId(UUID simCardGroupId) {
        this.simCardGroupId = simCardGroupId;
        return this;
    }

    /**
     * The group SIMCardGroup identification. This attribute can be &lt;code&gt;null&lt;/code&gt; when it&#39;s present in an associated resource.
     * @return simCardGroupId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "6a09cdc3-8948-47f0-aa62-74ac943d6c58",
        value = "The group SIMCardGroup identification. This attribute can be <code>null</code> when it's present in an associated resource."
    )
    @JsonProperty(JSON_PROPERTY_SIM_CARD_GROUP_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public UUID getSimCardGroupId() {
        return simCardGroupId;
    }

    @JsonProperty(JSON_PROPERTY_SIM_CARD_GROUP_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSimCardGroupId(UUID simCardGroupId) {
        this.simCardGroupId = simCardGroupId;
    }

    public SIMCard tags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public SIMCard addtagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * Searchable tags associated with the SIM card
     * @return tags
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "[\"personal\",\"customers\",\"active-customers\"]",
        value = "Searchable tags associated with the SIM card"
    )
    @JsonProperty(JSON_PROPERTY_TAGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getTags() {
        return tags;
    }

    @JsonProperty(JSON_PROPERTY_TAGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public SIMCard authorizedImeis(List<String> authorizedImeis) {
        this.authorizedImeis = authorizedImeis;
        return this;
    }

    public SIMCard addauthorizedImeisItem(String authorizedImeisItem) {
        if (this.authorizedImeis == null) {
            this.authorizedImeis = new ArrayList<>();
        }
        this.authorizedImeis.add(authorizedImeisItem);
        return this;
    }

    /**
     * List of IMEIs authorized to use a given SIM card.
     * @return authorizedImeis
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "[\"106516771852751\",\"534051870479563\",\"508821468377961\"]",
        value = "List of IMEIs authorized to use a given SIM card."
    )
    @JsonProperty(JSON_PROPERTY_AUTHORIZED_IMEIS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getAuthorizedImeis() {
        return authorizedImeis;
    }

    @JsonProperty(JSON_PROPERTY_AUTHORIZED_IMEIS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAuthorizedImeis(List<String> authorizedImeis) {
        this.authorizedImeis = authorizedImeis;
    }

    /**
     * IMEI of the device where a given SIM card is currently being used.
     * @return currentImei
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "457032284023794",
        value = "IMEI of the device where a given SIM card is currently being used."
    )
    @JsonProperty(JSON_PROPERTY_CURRENT_IMEI)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCurrentImei() {
        return currentImei;
    }

    public SIMCard dataLimit(SIMCardDataLimit dataLimit) {
        this.dataLimit = dataLimit;
        return this;
    }

    /**
     * Get dataLimit
     * @return dataLimit
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_DATA_LIMIT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public SIMCardDataLimit getDataLimit() {
        return dataLimit;
    }

    @JsonProperty(JSON_PROPERTY_DATA_LIMIT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDataLimit(SIMCardDataLimit dataLimit) {
        this.dataLimit = dataLimit;
    }

    public SIMCard currentBillingPeriodConsumedData(
        SimpleSIMCardCurrentBillingPeriodConsumedData currentBillingPeriodConsumedData
    ) {
        this.currentBillingPeriodConsumedData =
            currentBillingPeriodConsumedData;
        return this;
    }

    /**
     * Get currentBillingPeriodConsumedData
     * @return currentBillingPeriodConsumedData
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_CURRENT_BILLING_PERIOD_CONSUMED_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public SimpleSIMCardCurrentBillingPeriodConsumedData getCurrentBillingPeriodConsumedData() {
        return currentBillingPeriodConsumedData;
    }

    @JsonProperty(JSON_PROPERTY_CURRENT_BILLING_PERIOD_CONSUMED_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCurrentBillingPeriodConsumedData(
        SimpleSIMCardCurrentBillingPeriodConsumedData currentBillingPeriodConsumedData
    ) {
        this.currentBillingPeriodConsumedData =
            currentBillingPeriodConsumedData;
    }

    /**
     * Indicate whether the SIM card has any pending (in-progress) actions.
     * @return actionsInProgress
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "true",
        value = "Indicate whether the SIM card has any pending (in-progress) actions."
    )
    @JsonProperty(JSON_PROPERTY_ACTIONS_IN_PROGRESS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getActionsInProgress() {
        return actionsInProgress;
    }

    /**
     * ISO 8601 formatted date-time indicating when the resource was created.
     * @return createdAt
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "2018-02-02T22:25:27.521Z",
        value = "ISO 8601 formatted date-time indicating when the resource was created."
    )
    @JsonProperty(JSON_PROPERTY_CREATED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * ISO 8601 formatted date-time indicating when the resource was updated.
     * @return updatedAt
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "2018-02-02T22:25:27.521Z",
        value = "ISO 8601 formatted date-time indicating when the resource was updated."
    )
    @JsonProperty(JSON_PROPERTY_UPDATED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * The SIM&#39;s address in the currently connected network. This IPv4 address is usually obtained dynamically, so it may vary according to the location or new connections.
     * @return ipv4
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "192.168.0.0",
        value = "The SIM's address in the currently connected network. This IPv4 address is usually obtained dynamically, so it may vary according to the location or new connections. "
    )
    @JsonProperty(JSON_PROPERTY_IPV4)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getIpv4() {
        return ipv4;
    }

    /**
     * The SIM&#39;s address in the currently connected network. This IPv6 address is usually obtained dynamically, so it may vary according to the location or new connections.
     * @return ipv6
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "2001:cdba:0000:0000:0000:0000:3257:9652",
        value = "The SIM's address in the currently connected network. This IPv6 address is usually obtained dynamically, so it may vary according to the location or new connections. "
    )
    @JsonProperty(JSON_PROPERTY_IPV6)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getIpv6() {
        return ipv6;
    }

    public SIMCard currentDeviceLocation(
        SIMCardCurrentDeviceLocation currentDeviceLocation
    ) {
        this.currentDeviceLocation = currentDeviceLocation;
        return this;
    }

    /**
     * Get currentDeviceLocation
     * @return currentDeviceLocation
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_CURRENT_DEVICE_LOCATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public SIMCardCurrentDeviceLocation getCurrentDeviceLocation() {
        return currentDeviceLocation;
    }

    @JsonProperty(JSON_PROPERTY_CURRENT_DEVICE_LOCATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCurrentDeviceLocation(
        SIMCardCurrentDeviceLocation currentDeviceLocation
    ) {
        this.currentDeviceLocation = currentDeviceLocation;
    }

    /**
     * Mobile Network Code of the current network to which the SIM card is connected. It&#39;s a two to three decimal digits that identify a network.&lt;br/&gt;&lt;br/&gt;  This code is commonly seen joined with a Mobile Country Code (MCC) in a tuple that allows identifying a carrier known as PLMN (Public Land Mobile Network) code.
     * @return currentMnc
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "260",
        value = "Mobile Network Code of the current network to which the SIM card is connected. It's a two to three decimal digits that identify a network.<br/><br/>  This code is commonly seen joined with a Mobile Country Code (MCC) in a tuple that allows identifying a carrier known as PLMN (Public Land Mobile Network) code."
    )
    @JsonProperty(JSON_PROPERTY_CURRENT_MNC)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCurrentMnc() {
        return currentMnc;
    }

    /**
     * Mobile Country Code of the current network to which the SIM card is connected. It&#39;s a three decimal digit that identifies a country.&lt;br/&gt;&lt;br/&gt; This code is commonly seen joined with a Mobile Network Code (MNC) in a tuple that allows identifying a carrier known as PLMN (Public Land Mobile Network) code.
     * @return currentMcc
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "410",
        value = "Mobile Country Code of the current network to which the SIM card is connected. It's a three decimal digit that identifies a country.<br/><br/> This code is commonly seen joined with a Mobile Network Code (MNC) in a tuple that allows identifying a carrier known as PLMN (Public Land Mobile Network) code."
    )
    @JsonProperty(JSON_PROPERTY_CURRENT_MCC)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCurrentMcc() {
        return currentMcc;
    }

    /**
     * Indicates whether the device is actively connected to a network and able to run data.
     * @return liveDataSession
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "connected",
        value = "Indicates whether the device is actively connected to a network and able to run data."
    )
    @JsonProperty(JSON_PROPERTY_LIVE_DATA_SESSION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public LiveDataSessionEnum getLiveDataSession() {
        return liveDataSession;
    }

    /**
     * Return true if this SIMCard object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SIMCard siMCard = (SIMCard) o;
        return (
            Objects.equals(this.id, siMCard.id) &&
            Objects.equals(this.recordType, siMCard.recordType) &&
            Objects.equals(this.status, siMCard.status) &&
            Objects.equals(this.type, siMCard.type) &&
            Objects.equals(this.iccid, siMCard.iccid) &&
            Objects.equals(this.imsi, siMCard.imsi) &&
            Objects.equals(this.msisdn, siMCard.msisdn) &&
            Objects.equals(this.simCardGroupId, siMCard.simCardGroupId) &&
            Objects.equals(this.tags, siMCard.tags) &&
            Objects.equals(this.authorizedImeis, siMCard.authorizedImeis) &&
            Objects.equals(this.currentImei, siMCard.currentImei) &&
            Objects.equals(this.dataLimit, siMCard.dataLimit) &&
            Objects.equals(
                this.currentBillingPeriodConsumedData,
                siMCard.currentBillingPeriodConsumedData
            ) &&
            Objects.equals(this.actionsInProgress, siMCard.actionsInProgress) &&
            Objects.equals(this.createdAt, siMCard.createdAt) &&
            Objects.equals(this.updatedAt, siMCard.updatedAt) &&
            Objects.equals(this.ipv4, siMCard.ipv4) &&
            Objects.equals(this.ipv6, siMCard.ipv6) &&
            Objects.equals(
                this.currentDeviceLocation,
                siMCard.currentDeviceLocation
            ) &&
            Objects.equals(this.currentMnc, siMCard.currentMnc) &&
            Objects.equals(this.currentMcc, siMCard.currentMcc) &&
            Objects.equals(this.liveDataSession, siMCard.liveDataSession)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            recordType,
            status,
            type,
            iccid,
            imsi,
            msisdn,
            simCardGroupId,
            tags,
            authorizedImeis,
            currentImei,
            dataLimit,
            currentBillingPeriodConsumedData,
            actionsInProgress,
            createdAt,
            updatedAt,
            ipv4,
            ipv6,
            currentDeviceLocation,
            currentMnc,
            currentMcc,
            liveDataSession
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SIMCard {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb
            .append("    recordType: ")
            .append(toIndentedString(recordType))
            .append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    iccid: ").append(toIndentedString(iccid)).append("\n");
        sb.append("    imsi: ").append(toIndentedString(imsi)).append("\n");
        sb.append("    msisdn: ").append(toIndentedString(msisdn)).append("\n");
        sb
            .append("    simCardGroupId: ")
            .append(toIndentedString(simCardGroupId))
            .append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb
            .append("    authorizedImeis: ")
            .append(toIndentedString(authorizedImeis))
            .append("\n");
        sb
            .append("    currentImei: ")
            .append(toIndentedString(currentImei))
            .append("\n");
        sb
            .append("    dataLimit: ")
            .append(toIndentedString(dataLimit))
            .append("\n");
        sb
            .append("    currentBillingPeriodConsumedData: ")
            .append(toIndentedString(currentBillingPeriodConsumedData))
            .append("\n");
        sb
            .append("    actionsInProgress: ")
            .append(toIndentedString(actionsInProgress))
            .append("\n");
        sb
            .append("    createdAt: ")
            .append(toIndentedString(createdAt))
            .append("\n");
        sb
            .append("    updatedAt: ")
            .append(toIndentedString(updatedAt))
            .append("\n");
        sb.append("    ipv4: ").append(toIndentedString(ipv4)).append("\n");
        sb.append("    ipv6: ").append(toIndentedString(ipv6)).append("\n");
        sb
            .append("    currentDeviceLocation: ")
            .append(toIndentedString(currentDeviceLocation))
            .append("\n");
        sb
            .append("    currentMnc: ")
            .append(toIndentedString(currentMnc))
            .append("\n");
        sb
            .append("    currentMcc: ")
            .append(toIndentedString(currentMcc))
            .append("\n");
        sb
            .append("    liveDataSession: ")
            .append(toIndentedString(liveDataSession))
            .append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
