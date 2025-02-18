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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * PhoneNumberDetailed
 */
@JsonPropertyOrder(
    {
        PhoneNumberDetailed.JSON_PROPERTY_ID,
        PhoneNumberDetailed.JSON_PROPERTY_RECORD_TYPE,
        PhoneNumberDetailed.JSON_PROPERTY_PHONE_NUMBER,
        PhoneNumberDetailed.JSON_PROPERTY_COUNTRY_ISO_ALPHA2,
        PhoneNumberDetailed.JSON_PROPERTY_STATUS,
        PhoneNumberDetailed.JSON_PROPERTY_TAGS,
        PhoneNumberDetailed.JSON_PROPERTY_EXTERNAL_PIN,
        PhoneNumberDetailed.JSON_PROPERTY_CONNECTION_NAME,
        PhoneNumberDetailed.JSON_PROPERTY_CONNECTION_ID,
        PhoneNumberDetailed.JSON_PROPERTY_CUSTOMER_REFERENCE,
        PhoneNumberDetailed.JSON_PROPERTY_MESSAGING_PROFILE_ID,
        PhoneNumberDetailed.JSON_PROPERTY_MESSAGING_PROFILE_NAME,
        PhoneNumberDetailed.JSON_PROPERTY_BILLING_GROUP_ID,
        PhoneNumberDetailed.JSON_PROPERTY_EMERGENCY_ENABLED,
        PhoneNumberDetailed.JSON_PROPERTY_EMERGENCY_ADDRESS_ID,
        PhoneNumberDetailed.JSON_PROPERTY_EMERGENCY_STATUS,
        PhoneNumberDetailed.JSON_PROPERTY_CALL_FORWARDING_ENABLED,
        PhoneNumberDetailed.JSON_PROPERTY_CNAM_LISTING_ENABLED,
        PhoneNumberDetailed.JSON_PROPERTY_CALLER_ID_NAME_ENABLED,
        PhoneNumberDetailed.JSON_PROPERTY_CALL_RECORDING_ENABLED,
        PhoneNumberDetailed.JSON_PROPERTY_T38_FAX_GATEWAY_ENABLED,
        PhoneNumberDetailed.JSON_PROPERTY_PURCHASED_AT,
        PhoneNumberDetailed.JSON_PROPERTY_CREATED_AT,
        PhoneNumberDetailed.JSON_PROPERTY_PHONE_NUMBER_TYPE,
        PhoneNumberDetailed.JSON_PROPERTY_INBOUND_CALL_SCREENING,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class PhoneNumberDetailed {

    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
    private String recordType;

    public static final String JSON_PROPERTY_PHONE_NUMBER = "phone_number";
    private String phoneNumber;

    public static final String JSON_PROPERTY_COUNTRY_ISO_ALPHA2 =
        "country_iso_alpha2";
    private String countryIsoAlpha2;

    /**
     * The phone number&#39;s current status.
     */
    public enum StatusEnum {
        PURCHASE_PENDING(String.valueOf("purchase-pending")),

        PURCHASE_FAILED(String.valueOf("purchase-failed")),

        PORT_PENDING(String.valueOf("port-pending")),

        PORT_FAILED(String.valueOf("port-failed")),

        ACTIVE(String.valueOf("active")),

        DELETED(String.valueOf("deleted")),

        EMERGENCY_ONLY(String.valueOf("emergency-only")),

        PORTED_OUT(String.valueOf("ported-out")),

        PORT_OUT_PENDING(String.valueOf("port-out-pending")),

        REQUIREMENT_INFO_PENDING(String.valueOf("requirement-info-pending")),

        REQUIREMENT_INFO_UNDER_REVIEW(
            String.valueOf("requirement-info-under-review")
        ),

        REQUIREMENT_INFO_EXCEPTION(
            String.valueOf("requirement-info-exception")
        ),

        PROVISION_PENDING(String.valueOf("provision-pending"));

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            for (StatusEnum b : StatusEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_STATUS = "status";
    private StatusEnum status;

    public static final String JSON_PROPERTY_TAGS = "tags";
    private List<String> tags = null;

    public static final String JSON_PROPERTY_EXTERNAL_PIN = "external_pin";
    private String externalPin;

    public static final String JSON_PROPERTY_CONNECTION_NAME =
        "connection_name";
    private String connectionName;

    public static final String JSON_PROPERTY_CONNECTION_ID = "connection_id";
    private String connectionId;

    public static final String JSON_PROPERTY_CUSTOMER_REFERENCE =
        "customer_reference";
    private String customerReference;

    public static final String JSON_PROPERTY_MESSAGING_PROFILE_ID =
        "messaging_profile_id";
    private String messagingProfileId;

    public static final String JSON_PROPERTY_MESSAGING_PROFILE_NAME =
        "messaging_profile_name";
    private String messagingProfileName;

    public static final String JSON_PROPERTY_BILLING_GROUP_ID =
        "billing_group_id";
    private String billingGroupId;

    public static final String JSON_PROPERTY_EMERGENCY_ENABLED =
        "emergency_enabled";
    private Boolean emergencyEnabled;

    public static final String JSON_PROPERTY_EMERGENCY_ADDRESS_ID =
        "emergency_address_id";
    private String emergencyAddressId;

    /**
     * Indicates the status of the provisioning of emergency services for the phone number. This field contains information about activity that may be ongoing for a number where it either is being provisioned or deprovisioned but is not yet enabled/disabled.
     */
    public enum EmergencyStatusEnum {
        ACTIVE(String.valueOf("active")),

        DEPROVISIONING(String.valueOf("deprovisioning")),

        DISABLED(String.valueOf("disabled")),

        PROVISIONING(String.valueOf("provisioning")),

        PROVISIONING_FAILED(String.valueOf("provisioning-failed"));

        private String value;

        EmergencyStatusEnum(String value) {
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
        public static EmergencyStatusEnum fromValue(String value) {
            for (EmergencyStatusEnum b : EmergencyStatusEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_EMERGENCY_STATUS =
        "emergency_status";
    private EmergencyStatusEnum emergencyStatus;

    public static final String JSON_PROPERTY_CALL_FORWARDING_ENABLED =
        "call_forwarding_enabled";
    private Boolean callForwardingEnabled = true;

    public static final String JSON_PROPERTY_CNAM_LISTING_ENABLED =
        "cnam_listing_enabled";
    private Boolean cnamListingEnabled;

    public static final String JSON_PROPERTY_CALLER_ID_NAME_ENABLED =
        "caller_id_name_enabled";
    private Boolean callerIdNameEnabled;

    public static final String JSON_PROPERTY_CALL_RECORDING_ENABLED =
        "call_recording_enabled";
    private Boolean callRecordingEnabled;

    public static final String JSON_PROPERTY_T38_FAX_GATEWAY_ENABLED =
        "t38_fax_gateway_enabled";
    private Boolean t38FaxGatewayEnabled;

    public static final String JSON_PROPERTY_PURCHASED_AT = "purchased_at";
    private String purchasedAt;

    public static final String JSON_PROPERTY_CREATED_AT = "created_at";
    private String createdAt;

    /**
     * The phone number&#39;s type. Note: For numbers purchased prior to July 2023 or when fetching a number&#39;s details immediately after a purchase completes, the legacy values &#x60;tollfree&#x60;, &#x60;shortcode&#x60; or &#x60;longcode&#x60; may be returned instead.
     */
    public enum PhoneNumberTypeEnum {
        LOCAL(String.valueOf("local")),

        TOLL_FREE(String.valueOf("toll_free")),

        MOBILE(String.valueOf("mobile")),

        NATIONAL(String.valueOf("national")),

        SHARED_COST(String.valueOf("shared_cost")),

        LANDLINE(String.valueOf("landline")),

        TOLLFREE(String.valueOf("tollfree")),

        SHORTCODE(String.valueOf("shortcode")),

        LONGCODE(String.valueOf("longcode"));

        private String value;

        PhoneNumberTypeEnum(String value) {
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
        public static PhoneNumberTypeEnum fromValue(String value) {
            for (PhoneNumberTypeEnum b : PhoneNumberTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_PHONE_NUMBER_TYPE =
        "phone_number_type";
    private PhoneNumberTypeEnum phoneNumberType;

    /**
     * The inbound_call_screening setting is a phone number configuration option variable that allows users to configure their settings to block or flag fraudulent calls. It can be set to disabled, reject_calls, or flag_calls. This feature has an additional per-number monthly cost associated with it.
     */
    public enum InboundCallScreeningEnum {
        DISABLED(String.valueOf("disabled")),

        REJECT_CALLS(String.valueOf("reject_calls")),

        FLAG_CALLS(String.valueOf("flag_calls"));

        private String value;

        InboundCallScreeningEnum(String value) {
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
        public static InboundCallScreeningEnum fromValue(String value) {
            for (InboundCallScreeningEnum b : InboundCallScreeningEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_INBOUND_CALL_SCREENING =
        "inbound_call_screening";
    private InboundCallScreeningEnum inboundCallScreening =
        InboundCallScreeningEnum.DISABLED;

    public PhoneNumberDetailed() {}

    @JsonCreator
    public PhoneNumberDetailed(
        @JsonProperty(JSON_PROPERTY_RECORD_TYPE) String recordType,
        @JsonProperty(JSON_PROPERTY_PHONE_NUMBER) String phoneNumber,
        @JsonProperty(JSON_PROPERTY_COUNTRY_ISO_ALPHA2) String countryIsoAlpha2,
        @JsonProperty(JSON_PROPERTY_STATUS) StatusEnum status,
        @JsonProperty(JSON_PROPERTY_CONNECTION_NAME) String connectionName,
        @JsonProperty(JSON_PROPERTY_EMERGENCY_ENABLED) Boolean emergencyEnabled,
        @JsonProperty(
            JSON_PROPERTY_EMERGENCY_ADDRESS_ID
        ) String emergencyAddressId,
        @JsonProperty(
            JSON_PROPERTY_CALL_FORWARDING_ENABLED
        ) Boolean callForwardingEnabled,
        @JsonProperty(
            JSON_PROPERTY_CNAM_LISTING_ENABLED
        ) Boolean cnamListingEnabled,
        @JsonProperty(
            JSON_PROPERTY_CALLER_ID_NAME_ENABLED
        ) Boolean callerIdNameEnabled,
        @JsonProperty(
            JSON_PROPERTY_CALL_RECORDING_ENABLED
        ) Boolean callRecordingEnabled,
        @JsonProperty(
            JSON_PROPERTY_T38_FAX_GATEWAY_ENABLED
        ) Boolean t38FaxGatewayEnabled,
        @JsonProperty(JSON_PROPERTY_PURCHASED_AT) String purchasedAt,
        @JsonProperty(JSON_PROPERTY_CREATED_AT) String createdAt,
        @JsonProperty(
            JSON_PROPERTY_PHONE_NUMBER_TYPE
        ) PhoneNumberTypeEnum phoneNumberType
    ) {
        this();
        this.recordType = recordType;
        this.phoneNumber = phoneNumber;
        this.countryIsoAlpha2 = countryIsoAlpha2;
        this.status = status;
        this.connectionName = connectionName;
        this.emergencyEnabled = emergencyEnabled;
        this.emergencyAddressId = emergencyAddressId;
        this.callForwardingEnabled = callForwardingEnabled;
        this.cnamListingEnabled = cnamListingEnabled;
        this.callerIdNameEnabled = callerIdNameEnabled;
        this.callRecordingEnabled = callRecordingEnabled;
        this.t38FaxGatewayEnabled = t38FaxGatewayEnabled;
        this.purchasedAt = purchasedAt;
        this.createdAt = createdAt;
        this.phoneNumberType = phoneNumberType;
    }

    public PhoneNumberDetailed id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Uniquely identifies the resource.
     * @return id
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "1293384261075731499",
        value = "Uniquely identifies the resource."
    )
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Identifies the type of the resource.
     * @return recordType
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "phone_number",
        value = "Identifies the type of the resource."
    )
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getRecordType() {
        return recordType;
    }

    /**
     * The +E.164-formatted phone number associated with this record.
     * @return phoneNumber
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "The +E.164-formatted phone number associated with this record."
    )
    @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * The ISO 3166-1 alpha-2 country code of the phone number.
     * @return countryIsoAlpha2
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "US",
        value = "The ISO 3166-1 alpha-2 country code of the phone number."
    )
    @JsonProperty(JSON_PROPERTY_COUNTRY_ISO_ALPHA2)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCountryIsoAlpha2() {
        return countryIsoAlpha2;
    }

    /**
     * The phone number&#39;s current status.
     * @return status
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "The phone number's current status.")
    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public StatusEnum getStatus() {
        return status;
    }

    public PhoneNumberDetailed tags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public PhoneNumberDetailed addtagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * A list of user-assigned tags to help manage the phone number.
     * @return tags
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "A list of user-assigned tags to help manage the phone number."
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

    public PhoneNumberDetailed externalPin(String externalPin) {
        this.externalPin = externalPin;
        return this;
    }

    /**
     * If someone attempts to port your phone number away from Telnyx and your phone number has an external PIN set, Telnyx will attempt to verify that you provided the correct external PIN to the winning carrier. Note that not all carriers cooperate with this security mechanism.
     * @return externalPin
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "If someone attempts to port your phone number away from Telnyx and your phone number has an external PIN set, Telnyx will attempt to verify that you provided the correct external PIN to the winning carrier. Note that not all carriers cooperate with this security mechanism."
    )
    @JsonProperty(JSON_PROPERTY_EXTERNAL_PIN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getExternalPin() {
        return externalPin;
    }

    @JsonProperty(JSON_PROPERTY_EXTERNAL_PIN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setExternalPin(String externalPin) {
        this.externalPin = externalPin;
    }

    /**
     * The user-assigned name of the connection to be associated with this phone number.
     * @return connectionName
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "The user-assigned name of the connection to be associated with this phone number."
    )
    @JsonProperty(JSON_PROPERTY_CONNECTION_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getConnectionName() {
        return connectionName;
    }

    public PhoneNumberDetailed connectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Identifies the connection associated with the phone number.
     * @return connectionId
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "Identifies the connection associated with the phone number."
    )
    @JsonProperty(JSON_PROPERTY_CONNECTION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getConnectionId() {
        return connectionId;
    }

    @JsonProperty(JSON_PROPERTY_CONNECTION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    public PhoneNumberDetailed customerReference(String customerReference) {
        this.customerReference = customerReference;
        return this;
    }

    /**
     * A customer reference string for customer look ups.
     * @return customerReference
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "MY REF 001",
        value = "A customer reference string for customer look ups."
    )
    @JsonProperty(JSON_PROPERTY_CUSTOMER_REFERENCE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCustomerReference() {
        return customerReference;
    }

    @JsonProperty(JSON_PROPERTY_CUSTOMER_REFERENCE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCustomerReference(String customerReference) {
        this.customerReference = customerReference;
    }

    public PhoneNumberDetailed messagingProfileId(String messagingProfileId) {
        this.messagingProfileId = messagingProfileId;
        return this;
    }

    /**
     * Identifies the messaging profile associated with the phone number.
     * @return messagingProfileId
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "Identifies the messaging profile associated with the phone number."
    )
    @JsonProperty(JSON_PROPERTY_MESSAGING_PROFILE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getMessagingProfileId() {
        return messagingProfileId;
    }

    @JsonProperty(JSON_PROPERTY_MESSAGING_PROFILE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMessagingProfileId(String messagingProfileId) {
        this.messagingProfileId = messagingProfileId;
    }

    public PhoneNumberDetailed messagingProfileName(
        String messagingProfileName
    ) {
        this.messagingProfileName = messagingProfileName;
        return this;
    }

    /**
     * The name of the messaging profile associated with the phone number.
     * @return messagingProfileName
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "regional-customers",
        value = "The name of the messaging profile associated with the phone number."
    )
    @JsonProperty(JSON_PROPERTY_MESSAGING_PROFILE_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getMessagingProfileName() {
        return messagingProfileName;
    }

    @JsonProperty(JSON_PROPERTY_MESSAGING_PROFILE_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMessagingProfileName(String messagingProfileName) {
        this.messagingProfileName = messagingProfileName;
    }

    public PhoneNumberDetailed billingGroupId(String billingGroupId) {
        this.billingGroupId = billingGroupId;
        return this;
    }

    /**
     * Identifies the billing group associated with the phone number.
     * @return billingGroupId
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "Identifies the billing group associated with the phone number."
    )
    @JsonProperty(JSON_PROPERTY_BILLING_GROUP_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getBillingGroupId() {
        return billingGroupId;
    }

    @JsonProperty(JSON_PROPERTY_BILLING_GROUP_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setBillingGroupId(String billingGroupId) {
        this.billingGroupId = billingGroupId;
    }

    /**
     * Indicates whether emergency services are enabled for this number.
     * @return emergencyEnabled
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "Indicates whether emergency services are enabled for this number."
    )
    @JsonProperty(JSON_PROPERTY_EMERGENCY_ENABLED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getEmergencyEnabled() {
        return emergencyEnabled;
    }

    /**
     * Identifies the emergency address associated with the phone number.
     * @return emergencyAddressId
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "Identifies the emergency address associated with the phone number."
    )
    @JsonProperty(JSON_PROPERTY_EMERGENCY_ADDRESS_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getEmergencyAddressId() {
        return emergencyAddressId;
    }

    public PhoneNumberDetailed emergencyStatus(
        EmergencyStatusEnum emergencyStatus
    ) {
        this.emergencyStatus = emergencyStatus;
        return this;
    }

    /**
     * Indicates the status of the provisioning of emergency services for the phone number. This field contains information about activity that may be ongoing for a number where it either is being provisioned or deprovisioned but is not yet enabled/disabled.
     * @return emergencyStatus
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "Indicates the status of the provisioning of emergency services for the phone number. This field contains information about activity that may be ongoing for a number where it either is being provisioned or deprovisioned but is not yet enabled/disabled."
    )
    @JsonProperty(JSON_PROPERTY_EMERGENCY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public EmergencyStatusEnum getEmergencyStatus() {
        return emergencyStatus;
    }

    @JsonProperty(JSON_PROPERTY_EMERGENCY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEmergencyStatus(EmergencyStatusEnum emergencyStatus) {
        this.emergencyStatus = emergencyStatus;
    }

    /**
     * Indicates if call forwarding will be enabled for this number if forwards_to and forwarding_type are filled in. Defaults to true for backwards compatibility with APIV1 use of numbers endpoints.
     * @return callForwardingEnabled
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "Indicates if call forwarding will be enabled for this number if forwards_to and forwarding_type are filled in. Defaults to true for backwards compatibility with APIV1 use of numbers endpoints."
    )
    @JsonProperty(JSON_PROPERTY_CALL_FORWARDING_ENABLED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getCallForwardingEnabled() {
        return callForwardingEnabled;
    }

    /**
     * Indicates whether a CNAM listing is enabled for this number.
     * @return cnamListingEnabled
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "Indicates whether a CNAM listing is enabled for this number."
    )
    @JsonProperty(JSON_PROPERTY_CNAM_LISTING_ENABLED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getCnamListingEnabled() {
        return cnamListingEnabled;
    }

    /**
     * Indicates whether caller ID is enabled for this number.
     * @return callerIdNameEnabled
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "Indicates whether caller ID is enabled for this number."
    )
    @JsonProperty(JSON_PROPERTY_CALLER_ID_NAME_ENABLED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getCallerIdNameEnabled() {
        return callerIdNameEnabled;
    }

    /**
     * Indicates whether call recording is enabled for this number.
     * @return callRecordingEnabled
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "Indicates whether call recording is enabled for this number."
    )
    @JsonProperty(JSON_PROPERTY_CALL_RECORDING_ENABLED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getCallRecordingEnabled() {
        return callRecordingEnabled;
    }

    /**
     * Indicates whether T38 Fax Gateway for inbound calls to this number.
     * @return t38FaxGatewayEnabled
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "Indicates whether T38 Fax Gateway for inbound calls to this number."
    )
    @JsonProperty(JSON_PROPERTY_T38_FAX_GATEWAY_ENABLED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getT38FaxGatewayEnabled() {
        return t38FaxGatewayEnabled;
    }

    /**
     * ISO 8601 formatted date indicating when the resource was purchased.
     * @return purchasedAt
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "ISO 8601 formatted date indicating when the resource was purchased."
    )
    @JsonProperty(JSON_PROPERTY_PURCHASED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getPurchasedAt() {
        return purchasedAt;
    }

    /**
     * ISO 8601 formatted date indicating when the resource was created.
     * @return createdAt
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "ISO 8601 formatted date indicating when the resource was created."
    )
    @JsonProperty(JSON_PROPERTY_CREATED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * The phone number&#39;s type. Note: For numbers purchased prior to July 2023 or when fetching a number&#39;s details immediately after a purchase completes, the legacy values &#x60;tollfree&#x60;, &#x60;shortcode&#x60; or &#x60;longcode&#x60; may be returned instead.
     * @return phoneNumberType
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "The phone number's type. Note: For numbers purchased prior to July 2023 or when fetching a number's details immediately after a purchase completes, the legacy values `tollfree`, `shortcode` or `longcode` may be returned instead."
    )
    @JsonProperty(JSON_PROPERTY_PHONE_NUMBER_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public PhoneNumberTypeEnum getPhoneNumberType() {
        return phoneNumberType;
    }

    public PhoneNumberDetailed inboundCallScreening(
        InboundCallScreeningEnum inboundCallScreening
    ) {
        this.inboundCallScreening = inboundCallScreening;
        return this;
    }

    /**
     * The inbound_call_screening setting is a phone number configuration option variable that allows users to configure their settings to block or flag fraudulent calls. It can be set to disabled, reject_calls, or flag_calls. This feature has an additional per-number monthly cost associated with it.
     * @return inboundCallScreening
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "The inbound_call_screening setting is a phone number configuration option variable that allows users to configure their settings to block or flag fraudulent calls. It can be set to disabled, reject_calls, or flag_calls. This feature has an additional per-number monthly cost associated with it."
    )
    @JsonProperty(JSON_PROPERTY_INBOUND_CALL_SCREENING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public InboundCallScreeningEnum getInboundCallScreening() {
        return inboundCallScreening;
    }

    @JsonProperty(JSON_PROPERTY_INBOUND_CALL_SCREENING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setInboundCallScreening(
        InboundCallScreeningEnum inboundCallScreening
    ) {
        this.inboundCallScreening = inboundCallScreening;
    }

    /**
     * Return true if this PhoneNumberDetailed object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PhoneNumberDetailed phoneNumberDetailed = (PhoneNumberDetailed) o;
        return (
            Objects.equals(this.id, phoneNumberDetailed.id) &&
            Objects.equals(this.recordType, phoneNumberDetailed.recordType) &&
            Objects.equals(this.phoneNumber, phoneNumberDetailed.phoneNumber) &&
            Objects.equals(
                this.countryIsoAlpha2,
                phoneNumberDetailed.countryIsoAlpha2
            ) &&
            Objects.equals(this.status, phoneNumberDetailed.status) &&
            Objects.equals(this.tags, phoneNumberDetailed.tags) &&
            Objects.equals(this.externalPin, phoneNumberDetailed.externalPin) &&
            Objects.equals(
                this.connectionName,
                phoneNumberDetailed.connectionName
            ) &&
            Objects.equals(
                this.connectionId,
                phoneNumberDetailed.connectionId
            ) &&
            Objects.equals(
                this.customerReference,
                phoneNumberDetailed.customerReference
            ) &&
            Objects.equals(
                this.messagingProfileId,
                phoneNumberDetailed.messagingProfileId
            ) &&
            Objects.equals(
                this.messagingProfileName,
                phoneNumberDetailed.messagingProfileName
            ) &&
            Objects.equals(
                this.billingGroupId,
                phoneNumberDetailed.billingGroupId
            ) &&
            Objects.equals(
                this.emergencyEnabled,
                phoneNumberDetailed.emergencyEnabled
            ) &&
            Objects.equals(
                this.emergencyAddressId,
                phoneNumberDetailed.emergencyAddressId
            ) &&
            Objects.equals(
                this.emergencyStatus,
                phoneNumberDetailed.emergencyStatus
            ) &&
            Objects.equals(
                this.callForwardingEnabled,
                phoneNumberDetailed.callForwardingEnabled
            ) &&
            Objects.equals(
                this.cnamListingEnabled,
                phoneNumberDetailed.cnamListingEnabled
            ) &&
            Objects.equals(
                this.callerIdNameEnabled,
                phoneNumberDetailed.callerIdNameEnabled
            ) &&
            Objects.equals(
                this.callRecordingEnabled,
                phoneNumberDetailed.callRecordingEnabled
            ) &&
            Objects.equals(
                this.t38FaxGatewayEnabled,
                phoneNumberDetailed.t38FaxGatewayEnabled
            ) &&
            Objects.equals(this.purchasedAt, phoneNumberDetailed.purchasedAt) &&
            Objects.equals(this.createdAt, phoneNumberDetailed.createdAt) &&
            Objects.equals(
                this.phoneNumberType,
                phoneNumberDetailed.phoneNumberType
            ) &&
            Objects.equals(
                this.inboundCallScreening,
                phoneNumberDetailed.inboundCallScreening
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            recordType,
            phoneNumber,
            countryIsoAlpha2,
            status,
            tags,
            externalPin,
            connectionName,
            connectionId,
            customerReference,
            messagingProfileId,
            messagingProfileName,
            billingGroupId,
            emergencyEnabled,
            emergencyAddressId,
            emergencyStatus,
            callForwardingEnabled,
            cnamListingEnabled,
            callerIdNameEnabled,
            callRecordingEnabled,
            t38FaxGatewayEnabled,
            purchasedAt,
            createdAt,
            phoneNumberType,
            inboundCallScreening
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PhoneNumberDetailed {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb
            .append("    recordType: ")
            .append(toIndentedString(recordType))
            .append("\n");
        sb
            .append("    phoneNumber: ")
            .append(toIndentedString(phoneNumber))
            .append("\n");
        sb
            .append("    countryIsoAlpha2: ")
            .append(toIndentedString(countryIsoAlpha2))
            .append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb
            .append("    externalPin: ")
            .append(toIndentedString(externalPin))
            .append("\n");
        sb
            .append("    connectionName: ")
            .append(toIndentedString(connectionName))
            .append("\n");
        sb
            .append("    connectionId: ")
            .append(toIndentedString(connectionId))
            .append("\n");
        sb
            .append("    customerReference: ")
            .append(toIndentedString(customerReference))
            .append("\n");
        sb
            .append("    messagingProfileId: ")
            .append(toIndentedString(messagingProfileId))
            .append("\n");
        sb
            .append("    messagingProfileName: ")
            .append(toIndentedString(messagingProfileName))
            .append("\n");
        sb
            .append("    billingGroupId: ")
            .append(toIndentedString(billingGroupId))
            .append("\n");
        sb
            .append("    emergencyEnabled: ")
            .append(toIndentedString(emergencyEnabled))
            .append("\n");
        sb
            .append("    emergencyAddressId: ")
            .append(toIndentedString(emergencyAddressId))
            .append("\n");
        sb
            .append("    emergencyStatus: ")
            .append(toIndentedString(emergencyStatus))
            .append("\n");
        sb
            .append("    callForwardingEnabled: ")
            .append(toIndentedString(callForwardingEnabled))
            .append("\n");
        sb
            .append("    cnamListingEnabled: ")
            .append(toIndentedString(cnamListingEnabled))
            .append("\n");
        sb
            .append("    callerIdNameEnabled: ")
            .append(toIndentedString(callerIdNameEnabled))
            .append("\n");
        sb
            .append("    callRecordingEnabled: ")
            .append(toIndentedString(callRecordingEnabled))
            .append("\n");
        sb
            .append("    t38FaxGatewayEnabled: ")
            .append(toIndentedString(t38FaxGatewayEnabled))
            .append("\n");
        sb
            .append("    purchasedAt: ")
            .append(toIndentedString(purchasedAt))
            .append("\n");
        sb
            .append("    createdAt: ")
            .append(toIndentedString(createdAt))
            .append("\n");
        sb
            .append("    phoneNumberType: ")
            .append(toIndentedString(phoneNumberType))
            .append("\n");
        sb
            .append("    inboundCallScreening: ")
            .append(toIndentedString(inboundCallScreening))
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
