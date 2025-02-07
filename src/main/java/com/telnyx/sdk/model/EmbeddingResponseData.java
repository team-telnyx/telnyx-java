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
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.telnyx.sdk.JSON;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * EmbeddingResponseData
 */
@JsonPropertyOrder(
    {
        EmbeddingResponseData.JSON_PROPERTY_TASK_ID,
        EmbeddingResponseData.JSON_PROPERTY_TASK_NAME,
        EmbeddingResponseData.JSON_PROPERTY_STATUS,
        EmbeddingResponseData.JSON_PROPERTY_CREATED_AT,
        EmbeddingResponseData.JSON_PROPERTY_FINISHED_AT,
        EmbeddingResponseData.JSON_PROPERTY_USER_ID,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class EmbeddingResponseData {

    public static final String JSON_PROPERTY_TASK_ID = "task_id";
    private UUID taskId;

    public static final String JSON_PROPERTY_TASK_NAME = "task_name";
    private String taskName;

    public static final String JSON_PROPERTY_STATUS = "status";
    private String status;

    public static final String JSON_PROPERTY_CREATED_AT = "created_at";
    private String createdAt;

    public static final String JSON_PROPERTY_FINISHED_AT = "finished_at";
    private JsonNullable<String> finishedAt = JsonNullable.<String>undefined();

    public static final String JSON_PROPERTY_USER_ID = "user_id";
    private UUID userId;

    public EmbeddingResponseData() {}

    public EmbeddingResponseData taskId(UUID taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * Get taskId
     * @return taskId
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_TASK_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public UUID getTaskId() {
        return taskId;
    }

    @JsonProperty(JSON_PROPERTY_TASK_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTaskId(UUID taskId) {
        this.taskId = taskId;
    }

    public EmbeddingResponseData taskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * Get taskName
     * @return taskName
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_TASK_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getTaskName() {
        return taskName;
    }

    @JsonProperty(JSON_PROPERTY_TASK_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public EmbeddingResponseData status(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getStatus() {
        return status;
    }

    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStatus(String status) {
        this.status = status;
    }

    public EmbeddingResponseData createdAt(String createdAt) {
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
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty(JSON_PROPERTY_CREATED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public EmbeddingResponseData finishedAt(String finishedAt) {
        this.finishedAt = JsonNullable.<String>of(finishedAt);
        return this;
    }

    /**
     * Get finishedAt
     * @return finishedAt
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonIgnore
    public String getFinishedAt() {
        return finishedAt.orElse(null);
    }

    @JsonProperty(JSON_PROPERTY_FINISHED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public JsonNullable<String> getFinishedAt_JsonNullable() {
        return finishedAt;
    }

    @JsonProperty(JSON_PROPERTY_FINISHED_AT)
    public void setFinishedAt_JsonNullable(JsonNullable<String> finishedAt) {
        this.finishedAt = finishedAt;
    }

    public void setFinishedAt(String finishedAt) {
        this.finishedAt = JsonNullable.<String>of(finishedAt);
    }

    public EmbeddingResponseData userId(UUID userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Get userId
     * @return userId
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_USER_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public UUID getUserId() {
        return userId;
    }

    @JsonProperty(JSON_PROPERTY_USER_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    /**
     * Return true if this EmbeddingResponse_data object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmbeddingResponseData embeddingResponseData = (EmbeddingResponseData) o;
        return (
            Objects.equals(this.taskId, embeddingResponseData.taskId) &&
            Objects.equals(this.taskName, embeddingResponseData.taskName) &&
            Objects.equals(this.status, embeddingResponseData.status) &&
            Objects.equals(this.createdAt, embeddingResponseData.createdAt) &&
            equalsNullable(this.finishedAt, embeddingResponseData.finishedAt) &&
            Objects.equals(this.userId, embeddingResponseData.userId)
        );
    }

    private static <T> boolean equalsNullable(
        JsonNullable<T> a,
        JsonNullable<T> b
    ) {
        return (
            a == b ||
            (a != null &&
                b != null &&
                a.isPresent() &&
                b.isPresent() &&
                Objects.deepEquals(a.get(), b.get()))
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            taskId,
            taskName,
            status,
            createdAt,
            hashCodeNullable(finishedAt),
            userId
        );
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent()
            ? Arrays.deepHashCode(new Object[] { a.get() })
            : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EmbeddingResponseData {\n");
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
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
