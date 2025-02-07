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
import com.telnyx.sdk.model.PortingOrderDocuments;
import com.telnyx.sdk.model.PortingOrderEndUser;
import com.telnyx.sdk.model.PortingOrderMisc;
import com.telnyx.sdk.model.PortingOrderPhoneNumberConfiguration;
import com.telnyx.sdk.model.PortingOrderUserFeedback;
import com.telnyx.sdk.model.UpdatePortingOrderActivationSettings;
import com.telnyx.sdk.model.UpdatePortingOrderMessaging;
import com.telnyx.sdk.model.UpdatePortingOrderRequirement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * UpdatePortingOrder
 */
@JsonPropertyOrder(
    {
        UpdatePortingOrder.JSON_PROPERTY_MISC,
        UpdatePortingOrder.JSON_PROPERTY_END_USER,
        UpdatePortingOrder.JSON_PROPERTY_DOCUMENTS,
        UpdatePortingOrder.JSON_PROPERTY_ACTIVATION_SETTINGS,
        UpdatePortingOrder.JSON_PROPERTY_PHONE_NUMBER_CONFIGURATION,
        UpdatePortingOrder.JSON_PROPERTY_REQUIREMENT_GROUP_ID,
        UpdatePortingOrder.JSON_PROPERTY_REQUIREMENTS,
        UpdatePortingOrder.JSON_PROPERTY_USER_FEEDBACK,
        UpdatePortingOrder.JSON_PROPERTY_WEBHOOK_URL,
        UpdatePortingOrder.JSON_PROPERTY_CUSTOMER_REFERENCE,
        UpdatePortingOrder.JSON_PROPERTY_MESSAGING,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class UpdatePortingOrder {

    public static final String JSON_PROPERTY_MISC = "misc";
    private PortingOrderMisc misc;

    public static final String JSON_PROPERTY_END_USER = "end_user";
    private PortingOrderEndUser endUser;

    public static final String JSON_PROPERTY_DOCUMENTS = "documents";
    private PortingOrderDocuments documents;

    public static final String JSON_PROPERTY_ACTIVATION_SETTINGS =
        "activation_settings";
    private UpdatePortingOrderActivationSettings activationSettings;

    public static final String JSON_PROPERTY_PHONE_NUMBER_CONFIGURATION =
        "phone_number_configuration";
    private PortingOrderPhoneNumberConfiguration phoneNumberConfiguration;

    public static final String JSON_PROPERTY_REQUIREMENT_GROUP_ID =
        "requirement_group_id";
    private UUID requirementGroupId;

    public static final String JSON_PROPERTY_REQUIREMENTS = "requirements";
    private List<UpdatePortingOrderRequirement> requirements = null;

    public static final String JSON_PROPERTY_USER_FEEDBACK = "user_feedback";
    private PortingOrderUserFeedback userFeedback;

    public static final String JSON_PROPERTY_WEBHOOK_URL = "webhook_url";
    private URI webhookUrl;

    public static final String JSON_PROPERTY_CUSTOMER_REFERENCE =
        "customer_reference";
    private String customerReference;

    public static final String JSON_PROPERTY_MESSAGING = "messaging";
    private UpdatePortingOrderMessaging messaging;

    public UpdatePortingOrder() {}

    public UpdatePortingOrder misc(PortingOrderMisc misc) {
        this.misc = misc;
        return this;
    }

    /**
     * Get misc
     * @return misc
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_MISC)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public PortingOrderMisc getMisc() {
        return misc;
    }

    @JsonProperty(JSON_PROPERTY_MISC)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMisc(PortingOrderMisc misc) {
        this.misc = misc;
    }

    public UpdatePortingOrder endUser(PortingOrderEndUser endUser) {
        this.endUser = endUser;
        return this;
    }

    /**
     * Get endUser
     * @return endUser
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_END_USER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public PortingOrderEndUser getEndUser() {
        return endUser;
    }

    @JsonProperty(JSON_PROPERTY_END_USER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEndUser(PortingOrderEndUser endUser) {
        this.endUser = endUser;
    }

    public UpdatePortingOrder documents(PortingOrderDocuments documents) {
        this.documents = documents;
        return this;
    }

    /**
     * Get documents
     * @return documents
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_DOCUMENTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public PortingOrderDocuments getDocuments() {
        return documents;
    }

    @JsonProperty(JSON_PROPERTY_DOCUMENTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDocuments(PortingOrderDocuments documents) {
        this.documents = documents;
    }

    public UpdatePortingOrder activationSettings(
        UpdatePortingOrderActivationSettings activationSettings
    ) {
        this.activationSettings = activationSettings;
        return this;
    }

    /**
     * Get activationSettings
     * @return activationSettings
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_ACTIVATION_SETTINGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public UpdatePortingOrderActivationSettings getActivationSettings() {
        return activationSettings;
    }

    @JsonProperty(JSON_PROPERTY_ACTIVATION_SETTINGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setActivationSettings(
        UpdatePortingOrderActivationSettings activationSettings
    ) {
        this.activationSettings = activationSettings;
    }

    public UpdatePortingOrder phoneNumberConfiguration(
        PortingOrderPhoneNumberConfiguration phoneNumberConfiguration
    ) {
        this.phoneNumberConfiguration = phoneNumberConfiguration;
        return this;
    }

    /**
     * Get phoneNumberConfiguration
     * @return phoneNumberConfiguration
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_PHONE_NUMBER_CONFIGURATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public PortingOrderPhoneNumberConfiguration getPhoneNumberConfiguration() {
        return phoneNumberConfiguration;
    }

    @JsonProperty(JSON_PROPERTY_PHONE_NUMBER_CONFIGURATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPhoneNumberConfiguration(
        PortingOrderPhoneNumberConfiguration phoneNumberConfiguration
    ) {
        this.phoneNumberConfiguration = phoneNumberConfiguration;
    }

    public UpdatePortingOrder requirementGroupId(UUID requirementGroupId) {
        this.requirementGroupId = requirementGroupId;
        return this;
    }

    /**
     * If present, we will read the current values from the specified Requirement Group into the Documents and Requirements for this Porting Order. Note that any future changes in the Requirement Group would have no impact on this Porting Order. We will return an error if a specified Requirement Group conflicts with documents or requirements in the same request.
     * @return requirementGroupId
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "de748d99-06fa-4d90-9f9a-f4b62696bada",
        value = "If present, we will read the current values from the specified Requirement Group into the Documents and Requirements for this Porting Order. Note that any future changes in the Requirement Group would have no impact on this Porting Order. We will return an error if a specified Requirement Group conflicts with documents or requirements in the same request."
    )
    @JsonProperty(JSON_PROPERTY_REQUIREMENT_GROUP_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public UUID getRequirementGroupId() {
        return requirementGroupId;
    }

    @JsonProperty(JSON_PROPERTY_REQUIREMENT_GROUP_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRequirementGroupId(UUID requirementGroupId) {
        this.requirementGroupId = requirementGroupId;
    }

    public UpdatePortingOrder requirements(
        List<UpdatePortingOrderRequirement> requirements
    ) {
        this.requirements = requirements;
        return this;
    }

    public UpdatePortingOrder addrequirementsItem(
        UpdatePortingOrderRequirement requirementsItem
    ) {
        if (this.requirements == null) {
            this.requirements = new ArrayList<>();
        }
        this.requirements.add(requirementsItem);
        return this;
    }

    /**
     * List of requirements for porting numbers.
     * @return requirements
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "List of requirements for porting numbers. ")
    @JsonProperty(JSON_PROPERTY_REQUIREMENTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<UpdatePortingOrderRequirement> getRequirements() {
        return requirements;
    }

    @JsonProperty(JSON_PROPERTY_REQUIREMENTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRequirements(
        List<UpdatePortingOrderRequirement> requirements
    ) {
        this.requirements = requirements;
    }

    public UpdatePortingOrder userFeedback(
        PortingOrderUserFeedback userFeedback
    ) {
        this.userFeedback = userFeedback;
        return this;
    }

    /**
     * Get userFeedback
     * @return userFeedback
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_USER_FEEDBACK)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public PortingOrderUserFeedback getUserFeedback() {
        return userFeedback;
    }

    @JsonProperty(JSON_PROPERTY_USER_FEEDBACK)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setUserFeedback(PortingOrderUserFeedback userFeedback) {
        this.userFeedback = userFeedback;
    }

    public UpdatePortingOrder webhookUrl(URI webhookUrl) {
        this.webhookUrl = webhookUrl;
        return this;
    }

    /**
     * Get webhookUrl
     * @return webhookUrl
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_WEBHOOK_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public URI getWebhookUrl() {
        return webhookUrl;
    }

    @JsonProperty(JSON_PROPERTY_WEBHOOK_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setWebhookUrl(URI webhookUrl) {
        this.webhookUrl = webhookUrl;
    }

    public UpdatePortingOrder customerReference(String customerReference) {
        this.customerReference = customerReference;
        return this;
    }

    /**
     * Get customerReference
     * @return customerReference
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
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

    public UpdatePortingOrder messaging(UpdatePortingOrderMessaging messaging) {
        this.messaging = messaging;
        return this;
    }

    /**
     * Get messaging
     * @return messaging
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_MESSAGING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public UpdatePortingOrderMessaging getMessaging() {
        return messaging;
    }

    @JsonProperty(JSON_PROPERTY_MESSAGING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMessaging(UpdatePortingOrderMessaging messaging) {
        this.messaging = messaging;
    }

    /**
     * Return true if this UpdatePortingOrder object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdatePortingOrder updatePortingOrder = (UpdatePortingOrder) o;
        return (
            Objects.equals(this.misc, updatePortingOrder.misc) &&
            Objects.equals(this.endUser, updatePortingOrder.endUser) &&
            Objects.equals(this.documents, updatePortingOrder.documents) &&
            Objects.equals(
                this.activationSettings,
                updatePortingOrder.activationSettings
            ) &&
            Objects.equals(
                this.phoneNumberConfiguration,
                updatePortingOrder.phoneNumberConfiguration
            ) &&
            Objects.equals(
                this.requirementGroupId,
                updatePortingOrder.requirementGroupId
            ) &&
            Objects.equals(
                this.requirements,
                updatePortingOrder.requirements
            ) &&
            Objects.equals(
                this.userFeedback,
                updatePortingOrder.userFeedback
            ) &&
            Objects.equals(this.webhookUrl, updatePortingOrder.webhookUrl) &&
            Objects.equals(
                this.customerReference,
                updatePortingOrder.customerReference
            ) &&
            Objects.equals(this.messaging, updatePortingOrder.messaging)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            misc,
            endUser,
            documents,
            activationSettings,
            phoneNumberConfiguration,
            requirementGroupId,
            requirements,
            userFeedback,
            webhookUrl,
            customerReference,
            messaging
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePortingOrder {\n");
        sb.append("    misc: ").append(toIndentedString(misc)).append("\n");
        sb
            .append("    endUser: ")
            .append(toIndentedString(endUser))
            .append("\n");
        sb
            .append("    documents: ")
            .append(toIndentedString(documents))
            .append("\n");
        sb
            .append("    activationSettings: ")
            .append(toIndentedString(activationSettings))
            .append("\n");
        sb
            .append("    phoneNumberConfiguration: ")
            .append(toIndentedString(phoneNumberConfiguration))
            .append("\n");
        sb
            .append("    requirementGroupId: ")
            .append(toIndentedString(requirementGroupId))
            .append("\n");
        sb
            .append("    requirements: ")
            .append(toIndentedString(requirements))
            .append("\n");
        sb
            .append("    userFeedback: ")
            .append(toIndentedString(userFeedback))
            .append("\n");
        sb
            .append("    webhookUrl: ")
            .append(toIndentedString(webhookUrl))
            .append("\n");
        sb
            .append("    customerReference: ")
            .append(toIndentedString(customerReference))
            .append("\n");
        sb
            .append("    messaging: ")
            .append(toIndentedString(messaging))
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
