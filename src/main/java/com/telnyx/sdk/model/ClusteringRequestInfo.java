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
 * ClusteringRequestInfo
 */
@JsonPropertyOrder(
    {
        ClusteringRequestInfo.JSON_PROPERTY_TASK_ID,
        ClusteringRequestInfo.JSON_PROPERTY_STATUS,
        ClusteringRequestInfo.JSON_PROPERTY_BUCKET,
        ClusteringRequestInfo.JSON_PROPERTY_CREATED_AT,
        ClusteringRequestInfo.JSON_PROPERTY_FINISHED_AT,
        ClusteringRequestInfo.JSON_PROPERTY_MIN_CLUSTER_SIZE,
        ClusteringRequestInfo.JSON_PROPERTY_MIN_SUBCLUSTER_SIZE,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class ClusteringRequestInfo {

    public static final String JSON_PROPERTY_TASK_ID = "task_id";
    private String taskId;

    public static final String JSON_PROPERTY_STATUS = "status";
    private TaskStatus status;

    public static final String JSON_PROPERTY_BUCKET = "bucket";
    private String bucket;

    public static final String JSON_PROPERTY_CREATED_AT = "created_at";
    private OffsetDateTime createdAt;

    public static final String JSON_PROPERTY_FINISHED_AT = "finished_at";
    private OffsetDateTime finishedAt;

    public static final String JSON_PROPERTY_MIN_CLUSTER_SIZE =
        "min_cluster_size";
    private Integer minClusterSize;

    public static final String JSON_PROPERTY_MIN_SUBCLUSTER_SIZE =
        "min_subcluster_size";
    private Integer minSubclusterSize;

    public ClusteringRequestInfo() {}

    public ClusteringRequestInfo taskId(String taskId) {
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

    public ClusteringRequestInfo status(TaskStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
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

    public ClusteringRequestInfo bucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * Get bucket
     * @return bucket
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_BUCKET)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getBucket() {
        return bucket;
    }

    @JsonProperty(JSON_PROPERTY_BUCKET)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public ClusteringRequestInfo createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     **/
    @jakarta.annotation.Nonnull
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

    public ClusteringRequestInfo finishedAt(OffsetDateTime finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }

    /**
     * Get finishedAt
     * @return finishedAt
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_FINISHED_AT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public OffsetDateTime getFinishedAt() {
        return finishedAt;
    }

    @JsonProperty(JSON_PROPERTY_FINISHED_AT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setFinishedAt(OffsetDateTime finishedAt) {
        this.finishedAt = finishedAt;
    }

    public ClusteringRequestInfo minClusterSize(Integer minClusterSize) {
        this.minClusterSize = minClusterSize;
        return this;
    }

    /**
     * Get minClusterSize
     * @return minClusterSize
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_MIN_CLUSTER_SIZE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Integer getMinClusterSize() {
        return minClusterSize;
    }

    @JsonProperty(JSON_PROPERTY_MIN_CLUSTER_SIZE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setMinClusterSize(Integer minClusterSize) {
        this.minClusterSize = minClusterSize;
    }

    public ClusteringRequestInfo minSubclusterSize(Integer minSubclusterSize) {
        this.minSubclusterSize = minSubclusterSize;
        return this;
    }

    /**
     * Get minSubclusterSize
     * @return minSubclusterSize
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_MIN_SUBCLUSTER_SIZE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Integer getMinSubclusterSize() {
        return minSubclusterSize;
    }

    @JsonProperty(JSON_PROPERTY_MIN_SUBCLUSTER_SIZE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setMinSubclusterSize(Integer minSubclusterSize) {
        this.minSubclusterSize = minSubclusterSize;
    }

    /**
     * Return true if this ClusteringRequestInfo object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClusteringRequestInfo clusteringRequestInfo = (ClusteringRequestInfo) o;
        return (
            Objects.equals(this.taskId, clusteringRequestInfo.taskId) &&
            Objects.equals(this.status, clusteringRequestInfo.status) &&
            Objects.equals(this.bucket, clusteringRequestInfo.bucket) &&
            Objects.equals(this.createdAt, clusteringRequestInfo.createdAt) &&
            Objects.equals(this.finishedAt, clusteringRequestInfo.finishedAt) &&
            Objects.equals(
                this.minClusterSize,
                clusteringRequestInfo.minClusterSize
            ) &&
            Objects.equals(
                this.minSubclusterSize,
                clusteringRequestInfo.minSubclusterSize
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            taskId,
            status,
            bucket,
            createdAt,
            finishedAt,
            minClusterSize,
            minSubclusterSize
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusteringRequestInfo {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
        sb
            .append("    createdAt: ")
            .append(toIndentedString(createdAt))
            .append("\n");
        sb
            .append("    finishedAt: ")
            .append(toIndentedString(finishedAt))
            .append("\n");
        sb
            .append("    minClusterSize: ")
            .append(toIndentedString(minClusterSize))
            .append("\n");
        sb
            .append("    minSubclusterSize: ")
            .append(toIndentedString(minSubclusterSize))
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
