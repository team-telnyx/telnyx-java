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
import com.telnyx.sdk.model.NotificationEventConditionParametersInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * NotificationEventCondition
 */
@JsonPropertyOrder(
    {
        NotificationEventCondition.JSON_PROPERTY_ID,
        NotificationEventCondition.JSON_PROPERTY_NAME,
        NotificationEventCondition.JSON_PROPERTY_DESCRIPTION,
        NotificationEventCondition.JSON_PROPERTY_NOTIFICATION_EVENT_ID,
        NotificationEventCondition.JSON_PROPERTY_ASSOCIATED_RECORD_TYPE,
        NotificationEventCondition.JSON_PROPERTY_PARAMETERS,
        NotificationEventCondition.JSON_PROPERTY_ENABLED,
        NotificationEventCondition.JSON_PROPERTY_ALLOW_MULTIPLE_CHANNELS,
        NotificationEventCondition.JSON_PROPERTY_ASYNCHRONOUS,
        NotificationEventCondition.JSON_PROPERTY_SUPPORTED_CHANNELS,
        NotificationEventCondition.JSON_PROPERTY_CREATED_AT,
        NotificationEventCondition.JSON_PROPERTY_UPDATED_AT,
    }
)
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class NotificationEventCondition {

    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_DESCRIPTION = "description";
    private String description;

    public static final String JSON_PROPERTY_NOTIFICATION_EVENT_ID =
        "notification_event_id";
    private String notificationEventId;

    /**
     * Gets or Sets associatedRecordType
     */
    public enum AssociatedRecordTypeEnum {
        ACCOUNT(String.valueOf("account")),

        PHONE_NUMBER(String.valueOf("phone_number"));

        private String value;

        AssociatedRecordTypeEnum(String value) {
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
        public static AssociatedRecordTypeEnum fromValue(String value) {
            for (AssociatedRecordTypeEnum b : AssociatedRecordTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_ASSOCIATED_RECORD_TYPE =
        "associated_record_type";
    private AssociatedRecordTypeEnum associatedRecordType;

    public static final String JSON_PROPERTY_PARAMETERS = "parameters";
    private List<NotificationEventConditionParametersInner> parameters = null;

    public static final String JSON_PROPERTY_ENABLED = "enabled";
    private Boolean enabled;

    public static final String JSON_PROPERTY_ALLOW_MULTIPLE_CHANNELS =
        "allow_multiple_channels";
    private Boolean allowMultipleChannels;

    public static final String JSON_PROPERTY_ASYNCHRONOUS = "asynchronous";
    private Boolean asynchronous;

    public static final String JSON_PROPERTY_SUPPORTED_CHANNELS =
        "supported_channels";
    private List<String> supportedChannels = null;

    public static final String JSON_PROPERTY_CREATED_AT = "created_at";
    private OffsetDateTime createdAt;

    public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
    private OffsetDateTime updatedAt;

    public NotificationEventCondition() {}

    @JsonCreator
    public NotificationEventCondition(
        @JsonProperty(JSON_PROPERTY_ID) String id
    ) {
        this();
        this.id = id;
    }

    /**
     * A UUID.
     * @return id
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "70c7c5cb-dce2-4124-accb-870d39dbe852",
        value = "A UUID."
    )
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getId() {
        return id;
    }

    public NotificationEventCondition name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "from phone number", value = "")
    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getName() {
        return name;
    }

    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setName(String name) {
        this.name = name;
    }

    public NotificationEventCondition description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "When emergency number dialed from phone number X",
        value = ""
    )
    @JsonProperty(JSON_PROPERTY_DESCRIPTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getDescription() {
        return description;
    }

    @JsonProperty(JSON_PROPERTY_DESCRIPTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDescription(String description) {
        this.description = description;
    }

    public NotificationEventCondition notificationEventId(
        String notificationEventId
    ) {
        this.notificationEventId = notificationEventId;
        return this;
    }

    /**
     * Get notificationEventId
     * @return notificationEventId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "d5c395cd-9864-4609-b5e2-3f9fd4ce201a",
        value = ""
    )
    @JsonProperty(JSON_PROPERTY_NOTIFICATION_EVENT_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getNotificationEventId() {
        return notificationEventId;
    }

    @JsonProperty(JSON_PROPERTY_NOTIFICATION_EVENT_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setNotificationEventId(String notificationEventId) {
        this.notificationEventId = notificationEventId;
    }

    public NotificationEventCondition associatedRecordType(
        AssociatedRecordTypeEnum associatedRecordType
    ) {
        this.associatedRecordType = associatedRecordType;
        return this;
    }

    /**
     * Get associatedRecordType
     * @return associatedRecordType
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "phone_number", value = "")
    @JsonProperty(JSON_PROPERTY_ASSOCIATED_RECORD_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public AssociatedRecordTypeEnum getAssociatedRecordType() {
        return associatedRecordType;
    }

    @JsonProperty(JSON_PROPERTY_ASSOCIATED_RECORD_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAssociatedRecordType(
        AssociatedRecordTypeEnum associatedRecordType
    ) {
        this.associatedRecordType = associatedRecordType;
    }

    public NotificationEventCondition parameters(
        List<NotificationEventConditionParametersInner> parameters
    ) {
        this.parameters = parameters;
        return this;
    }

    public NotificationEventCondition addparametersItem(
        NotificationEventConditionParametersInner parametersItem
    ) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        this.parameters.add(parametersItem);
        return this;
    }

    /**
     * Get parameters
     * @return parameters
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_PARAMETERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<NotificationEventConditionParametersInner> getParameters() {
        return parameters;
    }

    @JsonProperty(JSON_PROPERTY_PARAMETERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setParameters(
        List<NotificationEventConditionParametersInner> parameters
    ) {
        this.parameters = parameters;
    }

    public NotificationEventCondition enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get enabled
     * @return enabled
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "true", value = "")
    @JsonProperty(JSON_PROPERTY_ENABLED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getEnabled() {
        return enabled;
    }

    @JsonProperty(JSON_PROPERTY_ENABLED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public NotificationEventCondition allowMultipleChannels(
        Boolean allowMultipleChannels
    ) {
        this.allowMultipleChannels = allowMultipleChannels;
        return this;
    }

    /**
     * Dictates whether a notification channel id needs to be provided when creating a notficiation setting.
     * @return allowMultipleChannels
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "false",
        value = "Dictates whether a notification channel id needs to be provided when creating a notficiation setting."
    )
    @JsonProperty(JSON_PROPERTY_ALLOW_MULTIPLE_CHANNELS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getAllowMultipleChannels() {
        return allowMultipleChannels;
    }

    @JsonProperty(JSON_PROPERTY_ALLOW_MULTIPLE_CHANNELS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAllowMultipleChannels(Boolean allowMultipleChannels) {
        this.allowMultipleChannels = allowMultipleChannels;
    }

    public NotificationEventCondition asynchronous(Boolean asynchronous) {
        this.asynchronous = asynchronous;
        return this;
    }

    /**
     * Dictates whether a notification setting will take effect immediately.
     * @return asynchronous
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "true",
        value = "Dictates whether a notification setting will take effect immediately."
    )
    @JsonProperty(JSON_PROPERTY_ASYNCHRONOUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getAsynchronous() {
        return asynchronous;
    }

    @JsonProperty(JSON_PROPERTY_ASYNCHRONOUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAsynchronous(Boolean asynchronous) {
        this.asynchronous = asynchronous;
    }

    public NotificationEventCondition supportedChannels(
        List<String> supportedChannels
    ) {
        this.supportedChannels = supportedChannels;
        return this;
    }

    public NotificationEventCondition addsupportedChannelsItem(
        String supportedChannelsItem
    ) {
        if (this.supportedChannels == null) {
            this.supportedChannels = new ArrayList<>();
        }
        this.supportedChannels.add(supportedChannelsItem);
        return this;
    }

    /**
     * Dictates the supported notification channel types that can be emitted.
     * @return supportedChannels
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "[\"webhook\",\"sms\",\"email\",\"voice\"]",
        value = "Dictates the supported notification channel types that can be emitted."
    )
    @JsonProperty(JSON_PROPERTY_SUPPORTED_CHANNELS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getSupportedChannels() {
        return supportedChannels;
    }

    @JsonProperty(JSON_PROPERTY_SUPPORTED_CHANNELS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSupportedChannels(List<String> supportedChannels) {
        this.supportedChannels = supportedChannels;
    }

    public NotificationEventCondition createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * ISO 8601 formatted date indicating when the resource was created.
     * @return createdAt
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "2019-10-15T10:07:15.527Z",
        value = "ISO 8601 formatted date indicating when the resource was created."
    )
    @JsonProperty(JSON_PROPERTY_CREATED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    @JsonProperty(JSON_PROPERTY_CREATED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public NotificationEventCondition updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * ISO 8601 formatted date indicating when the resource was updated.
     * @return updatedAt
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "2019-10-15T10:07:15.527Z",
        value = "ISO 8601 formatted date indicating when the resource was updated."
    )
    @JsonProperty(JSON_PROPERTY_UPDATED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty(JSON_PROPERTY_UPDATED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Return true if this NotificationEventCondition object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NotificationEventCondition notificationEventCondition =
            (NotificationEventCondition) o;
        return (
            Objects.equals(this.id, notificationEventCondition.id) &&
            Objects.equals(this.name, notificationEventCondition.name) &&
            Objects.equals(
                this.description,
                notificationEventCondition.description
            ) &&
            Objects.equals(
                this.notificationEventId,
                notificationEventCondition.notificationEventId
            ) &&
            Objects.equals(
                this.associatedRecordType,
                notificationEventCondition.associatedRecordType
            ) &&
            Objects.equals(
                this.parameters,
                notificationEventCondition.parameters
            ) &&
            Objects.equals(this.enabled, notificationEventCondition.enabled) &&
            Objects.equals(
                this.allowMultipleChannels,
                notificationEventCondition.allowMultipleChannels
            ) &&
            Objects.equals(
                this.asynchronous,
                notificationEventCondition.asynchronous
            ) &&
            Objects.equals(
                this.supportedChannels,
                notificationEventCondition.supportedChannels
            ) &&
            Objects.equals(
                this.createdAt,
                notificationEventCondition.createdAt
            ) &&
            Objects.equals(this.updatedAt, notificationEventCondition.updatedAt)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            name,
            description,
            notificationEventId,
            associatedRecordType,
            parameters,
            enabled,
            allowMultipleChannels,
            asynchronous,
            supportedChannels,
            createdAt,
            updatedAt
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NotificationEventCondition {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb
            .append("    description: ")
            .append(toIndentedString(description))
            .append("\n");
        sb
            .append("    notificationEventId: ")
            .append(toIndentedString(notificationEventId))
            .append("\n");
        sb
            .append("    associatedRecordType: ")
            .append(toIndentedString(associatedRecordType))
            .append("\n");
        sb
            .append("    parameters: ")
            .append(toIndentedString(parameters))
            .append("\n");
        sb
            .append("    enabled: ")
            .append(toIndentedString(enabled))
            .append("\n");
        sb
            .append("    allowMultipleChannels: ")
            .append(toIndentedString(allowMultipleChannels))
            .append("\n");
        sb
            .append("    asynchronous: ")
            .append(toIndentedString(asynchronous))
            .append("\n");
        sb
            .append("    supportedChannels: ")
            .append(toIndentedString(supportedChannels))
            .append("\n");
        sb
            .append("    createdAt: ")
            .append(toIndentedString(createdAt))
            .append("\n");
        sb
            .append("    updatedAt: ")
            .append(toIndentedString(updatedAt))
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
