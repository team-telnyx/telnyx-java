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
 * PublicTextClusteringRequest
 */
@JsonPropertyOrder(
    {
        PublicTextClusteringRequest.JSON_PROPERTY_BUCKET,
        PublicTextClusteringRequest.JSON_PROPERTY_PREFIX,
        PublicTextClusteringRequest.JSON_PROPERTY_FILES,
        PublicTextClusteringRequest.JSON_PROPERTY_MIN_CLUSTER_SIZE,
        PublicTextClusteringRequest.JSON_PROPERTY_MIN_SUBCLUSTER_SIZE,
    }
)
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class PublicTextClusteringRequest {

    public static final String JSON_PROPERTY_BUCKET = "bucket";
    private String bucket;

    public static final String JSON_PROPERTY_PREFIX = "prefix";
    private String prefix;

    public static final String JSON_PROPERTY_FILES = "files";
    private List<String> files = null;

    public static final String JSON_PROPERTY_MIN_CLUSTER_SIZE =
        "min_cluster_size";
    private Integer minClusterSize = 25;

    public static final String JSON_PROPERTY_MIN_SUBCLUSTER_SIZE =
        "min_subcluster_size";
    private Integer minSubclusterSize = 5;

    public PublicTextClusteringRequest() {}

    public PublicTextClusteringRequest bucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * The embedded storage bucket to compute the clusters from. The bucket must already be [embedded](https://developers.telnyx.com/api/inference/inference-embedding/post-embedding).
     * @return bucket
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(
        required = true,
        value = "The embedded storage bucket to compute the clusters from. The bucket must already be [embedded](https://developers.telnyx.com/api/inference/inference-embedding/post-embedding)."
    )
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

    public PublicTextClusteringRequest prefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * Prefix to filter whcih files in the buckets are included.
     * @return prefix
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        value = "Prefix to filter whcih files in the buckets are included."
    )
    @JsonProperty(JSON_PROPERTY_PREFIX)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getPrefix() {
        return prefix;
    }

    @JsonProperty(JSON_PROPERTY_PREFIX)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public PublicTextClusteringRequest files(List<String> files) {
        this.files = files;
        return this;
    }

    public PublicTextClusteringRequest addfilesItem(String filesItem) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        this.files.add(filesItem);
        return this;
    }

    /**
     * Array of files to filter which are included.
     * @return files
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Array of files to filter which are included.")
    @JsonProperty(JSON_PROPERTY_FILES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getFiles() {
        return files;
    }

    @JsonProperty(JSON_PROPERTY_FILES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFiles(List<String> files) {
        this.files = files;
    }

    public PublicTextClusteringRequest minClusterSize(Integer minClusterSize) {
        this.minClusterSize = minClusterSize;
        return this;
    }

    /**
     * Smallest number of related text chunks to qualify as a cluster. Top-level clusters should be thought of as identifying broad themes in your data.
     * @return minClusterSize
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        value = "Smallest number of related text chunks to qualify as a cluster. Top-level clusters should be thought of as identifying broad themes in your data."
    )
    @JsonProperty(JSON_PROPERTY_MIN_CLUSTER_SIZE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getMinClusterSize() {
        return minClusterSize;
    }

    @JsonProperty(JSON_PROPERTY_MIN_CLUSTER_SIZE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMinClusterSize(Integer minClusterSize) {
        this.minClusterSize = minClusterSize;
    }

    public PublicTextClusteringRequest minSubclusterSize(
        Integer minSubclusterSize
    ) {
        this.minSubclusterSize = minSubclusterSize;
        return this;
    }

    /**
     * Smallest number of related text chunks to qualify as a sub-cluster. Sub-clusters should be thought of as identifying more specific topics within a broader theme.
     * @return minSubclusterSize
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        value = "Smallest number of related text chunks to qualify as a sub-cluster. Sub-clusters should be thought of as identifying more specific topics within a broader theme."
    )
    @JsonProperty(JSON_PROPERTY_MIN_SUBCLUSTER_SIZE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getMinSubclusterSize() {
        return minSubclusterSize;
    }

    @JsonProperty(JSON_PROPERTY_MIN_SUBCLUSTER_SIZE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMinSubclusterSize(Integer minSubclusterSize) {
        this.minSubclusterSize = minSubclusterSize;
    }

    /**
     * Return true if this PublicTextClusteringRequest object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PublicTextClusteringRequest publicTextClusteringRequest =
            (PublicTextClusteringRequest) o;
        return (
            Objects.equals(this.bucket, publicTextClusteringRequest.bucket) &&
            Objects.equals(this.prefix, publicTextClusteringRequest.prefix) &&
            Objects.equals(this.files, publicTextClusteringRequest.files) &&
            Objects.equals(
                this.minClusterSize,
                publicTextClusteringRequest.minClusterSize
            ) &&
            Objects.equals(
                this.minSubclusterSize,
                publicTextClusteringRequest.minSubclusterSize
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            bucket,
            prefix,
            files,
            minClusterSize,
            minSubclusterSize
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublicTextClusteringRequest {\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
        sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
        sb.append("    files: ").append(toIndentedString(files)).append("\n");
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
