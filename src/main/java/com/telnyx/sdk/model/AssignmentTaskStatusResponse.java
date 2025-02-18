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
import com.telnyx.sdk.model.TaskStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * AssignmentTaskStatusResponse
 */
@JsonPropertyOrder(
    {
        AssignmentTaskStatusResponse.JSON_PROPERTY_TASK_ID,
        AssignmentTaskStatusResponse.JSON_PROPERTY_STATUS,
        AssignmentTaskStatusResponse.JSON_PROPERTY_CREATED_AT,
        AssignmentTaskStatusResponse.JSON_PROPERTY_UPDATED_AT,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class AssignmentTaskStatusResponse {

    public static final String JSON_PROPERTY_TASK_ID = "taskId";
    private String taskId;

    public static final String JSON_PROPERTY_STATUS = "status";
    private TaskStatus status;

    public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
    private OffsetDateTime createdAt;

    public static final String JSON_PROPERTY_UPDATED_AT = "updatedAt";
    private OffsetDateTime updatedAt;

    public AssignmentTaskStatusResponse() {}

    public AssignmentTaskStatusResponse taskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * Get taskId
     * @return taskId
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_TASK_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getTaskId() {
        return taskId;
    }

    @JsonProperty(JSON_PROPERTY_TASK_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public AssignmentTaskStatusResponse status(TaskStatus status) {
        this.status = status;
        return this;
    }

    /**
     * The status of the task associated with assigning a messaging profile to a campaign.
     * @return status
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        required = true,
        value = "The status of the task associated with assigning a messaging profile to a campaign."
    )
    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public TaskStatus getStatus() {
        return status;
    }

    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public AssignmentTaskStatusResponse createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
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

    public AssignmentTaskStatusResponse updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
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
     * Return true if this AssignmentTaskStatusResponse object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AssignmentTaskStatusResponse assignmentTaskStatusResponse =
            (AssignmentTaskStatusResponse) o;
        return (
            Objects.equals(this.taskId, assignmentTaskStatusResponse.taskId) &&
            Objects.equals(this.status, assignmentTaskStatusResponse.status) &&
            Objects.equals(
                this.createdAt,
                assignmentTaskStatusResponse.createdAt
            ) &&
            Objects.equals(
                this.updatedAt,
                assignmentTaskStatusResponse.updatedAt
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, status, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssignmentTaskStatusResponse {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
