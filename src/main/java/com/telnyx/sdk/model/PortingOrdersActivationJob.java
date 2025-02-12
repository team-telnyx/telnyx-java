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
import com.telnyx.sdk.model.PortingOrdersActivationJobActivationWindowsInner;
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
import java.util.UUID;

/**
 * PortingOrdersActivationJob
 */
@JsonPropertyOrder(
    {
        PortingOrdersActivationJob.JSON_PROPERTY_ID,
        PortingOrdersActivationJob.JSON_PROPERTY_STATUS,
        PortingOrdersActivationJob.JSON_PROPERTY_ACTIVATION_TYPE,
        PortingOrdersActivationJob.JSON_PROPERTY_ACTIVATE_AT,
        PortingOrdersActivationJob.JSON_PROPERTY_ACTIVATION_WINDOWS,
        PortingOrdersActivationJob.JSON_PROPERTY_RECORD_TYPE,
        PortingOrdersActivationJob.JSON_PROPERTY_CREATED_AT,
        PortingOrdersActivationJob.JSON_PROPERTY_UPDATED_AT,
    }
)
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class PortingOrdersActivationJob {

    public static final String JSON_PROPERTY_ID = "id";
    private UUID id;

    /**
     * Specifies the status of this activation job
     */
    public enum StatusEnum {
        CREATED(String.valueOf("created")),

        IN_PROCESS(String.valueOf("in-process")),

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

    /**
     * Specifies the type of this activation job
     */
    public enum ActivationTypeEnum {
        SCHEDULED(String.valueOf("scheduled")),

        ON_DEMAND(String.valueOf("on-demand"));

        private String value;

        ActivationTypeEnum(String value) {
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
        public static ActivationTypeEnum fromValue(String value) {
            for (ActivationTypeEnum b : ActivationTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_ACTIVATION_TYPE =
        "activation_type";
    private ActivationTypeEnum activationType;

    public static final String JSON_PROPERTY_ACTIVATE_AT = "activate_at";
    private OffsetDateTime activateAt;

    public static final String JSON_PROPERTY_ACTIVATION_WINDOWS =
        "activation_windows";
    private List<
        PortingOrdersActivationJobActivationWindowsInner
    > activationWindows = null;

    public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
    private String recordType;

    public static final String JSON_PROPERTY_CREATED_AT = "created_at";
    private OffsetDateTime createdAt;

    public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
    private OffsetDateTime updatedAt;

    public PortingOrdersActivationJob() {}

    @JsonCreator
    public PortingOrdersActivationJob(
        @JsonProperty(JSON_PROPERTY_ID) UUID id,
        @JsonProperty(JSON_PROPERTY_RECORD_TYPE) String recordType,
        @JsonProperty(JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
        @JsonProperty(JSON_PROPERTY_UPDATED_AT) OffsetDateTime updatedAt
    ) {
        this();
        this.id = id;
        this.recordType = recordType;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    /**
     * Uniquely identifies this activation job
     * @return id
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "f1486bae-f067-460c-ad43-73a92848f902",
        value = "Uniquely identifies this activation job"
    )
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public UUID getId() {
        return id;
    }

    public PortingOrdersActivationJob status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Specifies the status of this activation job
     * @return status
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Specifies the status of this activation job")
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

    public PortingOrdersActivationJob activationType(
        ActivationTypeEnum activationType
    ) {
        this.activationType = activationType;
        return this;
    }

    /**
     * Specifies the type of this activation job
     * @return activationType
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Specifies the type of this activation job")
    @JsonProperty(JSON_PROPERTY_ACTIVATION_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public ActivationTypeEnum getActivationType() {
        return activationType;
    }

    @JsonProperty(JSON_PROPERTY_ACTIVATION_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setActivationType(ActivationTypeEnum activationType) {
        this.activationType = activationType;
    }

    public PortingOrdersActivationJob activateAt(OffsetDateTime activateAt) {
        this.activateAt = activateAt;
        return this;
    }

    /**
     * ISO 8601 formatted date indicating when the activation job should be executed. This time should be between some activation window.
     * @return activateAt
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "2021-03-19T10:07:15.527Z",
        value = "ISO 8601 formatted date indicating when the activation job should be executed. This time should be between some activation window."
    )
    @JsonProperty(JSON_PROPERTY_ACTIVATE_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public OffsetDateTime getActivateAt() {
        return activateAt;
    }

    @JsonProperty(JSON_PROPERTY_ACTIVATE_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setActivateAt(OffsetDateTime activateAt) {
        this.activateAt = activateAt;
    }

    public PortingOrdersActivationJob activationWindows(
        List<PortingOrdersActivationJobActivationWindowsInner> activationWindows
    ) {
        this.activationWindows = activationWindows;
        return this;
    }

    public PortingOrdersActivationJob addactivationWindowsItem(
        PortingOrdersActivationJobActivationWindowsInner activationWindowsItem
    ) {
        if (this.activationWindows == null) {
            this.activationWindows = new ArrayList<>();
        }
        this.activationWindows.add(activationWindowsItem);
        return this;
    }

    /**
     * List of allowed activation windows for this activation job
     * @return activationWindows
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        value = "List of allowed activation windows for this activation job"
    )
    @JsonProperty(JSON_PROPERTY_ACTIVATION_WINDOWS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<
        PortingOrdersActivationJobActivationWindowsInner
    > getActivationWindows() {
        return activationWindows;
    }

    @JsonProperty(JSON_PROPERTY_ACTIVATION_WINDOWS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setActivationWindows(
        List<PortingOrdersActivationJobActivationWindowsInner> activationWindows
    ) {
        this.activationWindows = activationWindows;
    }

    /**
     * Identifies the type of the resource.
     * @return recordType
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "porting_activation_job",
        value = "Identifies the type of the resource."
    )
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getRecordType() {
        return recordType;
    }

    /**
     * ISO 8601 formatted date indicating when the resource was created.
     * @return createdAt
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "2021-03-19T10:07:15.527Z",
        value = "ISO 8601 formatted date indicating when the resource was created."
    )
    @JsonProperty(JSON_PROPERTY_CREATED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * ISO 8601 formatted date indicating when the resource was created.
     * @return updatedAt
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "2021-03-19T10:07:15.527Z",
        value = "ISO 8601 formatted date indicating when the resource was created."
    )
    @JsonProperty(JSON_PROPERTY_UPDATED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Return true if this PortingOrdersActivationJob object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PortingOrdersActivationJob portingOrdersActivationJob =
            (PortingOrdersActivationJob) o;
        return (
            Objects.equals(this.id, portingOrdersActivationJob.id) &&
            Objects.equals(this.status, portingOrdersActivationJob.status) &&
            Objects.equals(
                this.activationType,
                portingOrdersActivationJob.activationType
            ) &&
            Objects.equals(
                this.activateAt,
                portingOrdersActivationJob.activateAt
            ) &&
            Objects.equals(
                this.activationWindows,
                portingOrdersActivationJob.activationWindows
            ) &&
            Objects.equals(
                this.recordType,
                portingOrdersActivationJob.recordType
            ) &&
            Objects.equals(
                this.createdAt,
                portingOrdersActivationJob.createdAt
            ) &&
            Objects.equals(this.updatedAt, portingOrdersActivationJob.updatedAt)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            status,
            activationType,
            activateAt,
            activationWindows,
            recordType,
            createdAt,
            updatedAt
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PortingOrdersActivationJob {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb
            .append("    activationType: ")
            .append(toIndentedString(activationType))
            .append("\n");
        sb
            .append("    activateAt: ")
            .append(toIndentedString(activateAt))
            .append("\n");
        sb
            .append("    activationWindows: ")
            .append(toIndentedString(activationWindows))
            .append("\n");
        sb
            .append("    recordType: ")
            .append(toIndentedString(recordType))
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
