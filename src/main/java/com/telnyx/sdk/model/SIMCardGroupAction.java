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
import com.telnyx.sdk.model.SIMCardGroupActionSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * This object represents a SIM card group action request. It allows tracking the current status of an operation that impacts the SIM card group and SIM card in it.
 */
@ApiModel(
    description = "This object represents a SIM card group action request. It allows tracking the current status of an operation that impacts the SIM card group and SIM card in it."
)
@JsonPropertyOrder(
    {
        SIMCardGroupAction.JSON_PROPERTY_ID,
        SIMCardGroupAction.JSON_PROPERTY_RECORD_TYPE,
        SIMCardGroupAction.JSON_PROPERTY_SIM_CARD_GROUP_ID,
        SIMCardGroupAction.JSON_PROPERTY_TYPE,
        SIMCardGroupAction.JSON_PROPERTY_STATUS,
        SIMCardGroupAction.JSON_PROPERTY_SETTINGS,
        SIMCardGroupAction.JSON_PROPERTY_CREATED_AT,
        SIMCardGroupAction.JSON_PROPERTY_UPDATED_AT,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class SIMCardGroupAction {

    public static final String JSON_PROPERTY_ID = "id";
    private UUID id;

    public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
    private String recordType;

    public static final String JSON_PROPERTY_SIM_CARD_GROUP_ID =
        "sim_card_group_id";
    private UUID simCardGroupId;

    /**
     * Represents the type of the operation requested.
     */
    public enum TypeEnum {
        SET_PRIVATE_WIRELESS_GATEWAY(
            String.valueOf("set_private_wireless_gateway")
        ),

        REMOVE_PRIVATE_WIRELESS_GATEWAY(
            String.valueOf("remove_private_wireless_gateway")
        );

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

    /**
     * Gets or Sets status
     */
    public enum StatusEnum {
        IN_PROGRESS(String.valueOf("in-progress")),

        COMPLETED(String.valueOf("completed")),

        FAILED(String.valueOf("failed"));

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

    public static final String JSON_PROPERTY_SETTINGS = "settings";
    private SIMCardGroupActionSettings settings;

    public static final String JSON_PROPERTY_CREATED_AT = "created_at";
    private String createdAt;

    public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
    private String updatedAt;

    public SIMCardGroupAction() {}

    @JsonCreator
    public SIMCardGroupAction(
        @JsonProperty(JSON_PROPERTY_ID) UUID id,
        @JsonProperty(JSON_PROPERTY_RECORD_TYPE) String recordType,
        @JsonProperty(JSON_PROPERTY_CREATED_AT) String createdAt,
        @JsonProperty(JSON_PROPERTY_UPDATED_AT) String updatedAt
    ) {
        this();
        this.id = id;
        this.recordType = recordType;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    /**
     * Identifies the resource.
     * @return id
     **/
    @jakarta.annotation.Nullable
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
    @jakarta.annotation.Nullable
    @ApiModelProperty(example = "sim_card_group_action", value = "")
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getRecordType() {
        return recordType;
    }

    public SIMCardGroupAction simCardGroupId(UUID simCardGroupId) {
        this.simCardGroupId = simCardGroupId;
        return this;
    }

    /**
     * The SIM card group identification.
     * @return simCardGroupId
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "6a09cdc3-8948-47f0-aa62-74ac943d6c58",
        value = "The SIM card group identification."
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

    public SIMCardGroupAction type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Represents the type of the operation requested.
     * @return type
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "set_private_wireless_gateway",
        value = "Represents the type of the operation requested."
    )
    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public TypeEnum getType() {
        return type;
    }

    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setType(TypeEnum type) {
        this.type = type;
    }

    public SIMCardGroupAction status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(example = "in-progress", value = "")
    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public StatusEnum getStatus() {
        return status;
    }

    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public SIMCardGroupAction settings(SIMCardGroupActionSettings settings) {
        this.settings = settings;
        return this;
    }

    /**
     * Get settings
     * @return settings
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_SETTINGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public SIMCardGroupActionSettings getSettings() {
        return settings;
    }

    @JsonProperty(JSON_PROPERTY_SETTINGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSettings(SIMCardGroupActionSettings settings) {
        this.settings = settings;
    }

    /**
     * ISO 8601 formatted date-time indicating when the resource was created.
     * @return createdAt
     **/
    @jakarta.annotation.Nullable
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
    @jakarta.annotation.Nullable
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
     * Return true if this SIMCardGroupAction object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SIMCardGroupAction siMCardGroupAction = (SIMCardGroupAction) o;
        return (
            Objects.equals(this.id, siMCardGroupAction.id) &&
            Objects.equals(this.recordType, siMCardGroupAction.recordType) &&
            Objects.equals(
                this.simCardGroupId,
                siMCardGroupAction.simCardGroupId
            ) &&
            Objects.equals(this.type, siMCardGroupAction.type) &&
            Objects.equals(this.status, siMCardGroupAction.status) &&
            Objects.equals(this.settings, siMCardGroupAction.settings) &&
            Objects.equals(this.createdAt, siMCardGroupAction.createdAt) &&
            Objects.equals(this.updatedAt, siMCardGroupAction.updatedAt)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            recordType,
            simCardGroupId,
            type,
            status,
            settings,
            createdAt,
            updatedAt
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SIMCardGroupAction {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb
            .append("    recordType: ")
            .append(toIndentedString(recordType))
            .append("\n");
        sb
            .append("    simCardGroupId: ")
            .append(toIndentedString(simCardGroupId))
            .append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb
            .append("    settings: ")
            .append(toIndentedString(settings))
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
