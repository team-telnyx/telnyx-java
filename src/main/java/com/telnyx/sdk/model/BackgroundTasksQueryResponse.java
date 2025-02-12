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
import com.telnyx.sdk.model.BackgroundTaskStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * BackgroundTasksQueryResponse
 */
@JsonPropertyOrder(
    {
        BackgroundTasksQueryResponse.JSON_PROPERTY_USER_ID,
        BackgroundTasksQueryResponse.JSON_PROPERTY_TASK_ID,
        BackgroundTasksQueryResponse.JSON_PROPERTY_TASK_NAME,
        BackgroundTasksQueryResponse.JSON_PROPERTY_STATUS,
        BackgroundTasksQueryResponse.JSON_PROPERTY_CREATED_AT,
        BackgroundTasksQueryResponse.JSON_PROPERTY_FINISHED_AT,
        BackgroundTasksQueryResponse.JSON_PROPERTY_BUCKET,
    }
)
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class BackgroundTasksQueryResponse {

    public static final String JSON_PROPERTY_USER_ID = "user_id";
    private String userId;

    public static final String JSON_PROPERTY_TASK_ID = "task_id";
    private String taskId;

    public static final String JSON_PROPERTY_TASK_NAME = "task_name";
    private String taskName;

    public static final String JSON_PROPERTY_STATUS = "status";
    private BackgroundTaskStatus status;

    public static final String JSON_PROPERTY_CREATED_AT = "created_at";
    private OffsetDateTime createdAt;

    public static final String JSON_PROPERTY_FINISHED_AT = "finished_at";
    private OffsetDateTime finishedAt;

    public static final String JSON_PROPERTY_BUCKET = "bucket";
    private String bucket;

    public BackgroundTasksQueryResponse() {}

    public BackgroundTasksQueryResponse userId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Get userId
     * @return userId
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_USER_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getUserId() {
        return userId;
    }

    @JsonProperty(JSON_PROPERTY_USER_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public BackgroundTasksQueryResponse taskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * Get taskId
     * @return taskId
     **/
    @javax.annotation.Nonnull
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

    public BackgroundTasksQueryResponse taskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * Get taskName
     * @return taskName
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_TASK_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getTaskName() {
        return taskName;
    }

    @JsonProperty(JSON_PROPERTY_TASK_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public BackgroundTasksQueryResponse status(BackgroundTaskStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public BackgroundTaskStatus getStatus() {
        return status;
    }

    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setStatus(BackgroundTaskStatus status) {
        this.status = status;
    }

    public BackgroundTasksQueryResponse createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_CREATED_AT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    @JsonProperty(JSON_PROPERTY_CREATED_AT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public BackgroundTasksQueryResponse finishedAt(OffsetDateTime finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }

    /**
     * Get finishedAt
     * @return finishedAt
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_FINISHED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public OffsetDateTime getFinishedAt() {
        return finishedAt;
    }

    @JsonProperty(JSON_PROPERTY_FINISHED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFinishedAt(OffsetDateTime finishedAt) {
        this.finishedAt = finishedAt;
    }

    public BackgroundTasksQueryResponse bucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * Get bucket
     * @return bucket
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_BUCKET)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getBucket() {
        return bucket;
    }

    @JsonProperty(JSON_PROPERTY_BUCKET)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * Return true if this BackgroundTasksQueryResponse object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BackgroundTasksQueryResponse backgroundTasksQueryResponse =
            (BackgroundTasksQueryResponse) o;
        return (
            Objects.equals(this.userId, backgroundTasksQueryResponse.userId) &&
            Objects.equals(this.taskId, backgroundTasksQueryResponse.taskId) &&
            Objects.equals(
                this.taskName,
                backgroundTasksQueryResponse.taskName
            ) &&
            Objects.equals(this.status, backgroundTasksQueryResponse.status) &&
            Objects.equals(
                this.createdAt,
                backgroundTasksQueryResponse.createdAt
            ) &&
            Objects.equals(
                this.finishedAt,
                backgroundTasksQueryResponse.finishedAt
            ) &&
            Objects.equals(this.bucket, backgroundTasksQueryResponse.bucket)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            userId,
            taskId,
            taskName,
            status,
            createdAt,
            finishedAt,
            bucket
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackgroundTasksQueryResponse {\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb
            .append("    taskName: ")
            .append(toIndentedString(taskName))
            .append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb
            .append("    createdAt: ")
            .append(toIndentedString(createdAt))
            .append("\n");
        sb
            .append("    finishedAt: ")
            .append(toIndentedString(finishedAt))
            .append("\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
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
