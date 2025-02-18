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
import com.telnyx.sdk.model.Region;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * S3ConfigurationData
 */
@JsonPropertyOrder(
    {
        S3ConfigurationData.JSON_PROPERTY_BUCKET,
        S3ConfigurationData.JSON_PROPERTY_REGION,
        S3ConfigurationData.JSON_PROPERTY_AWS_ACCESS_KEY_ID,
        S3ConfigurationData.JSON_PROPERTY_AWS_SECRET_ACCESS_KEY,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class S3ConfigurationData {

    public static final String JSON_PROPERTY_BUCKET = "bucket";
    private String bucket;

    public static final String JSON_PROPERTY_REGION = "region";
    private Region region;

    public static final String JSON_PROPERTY_AWS_ACCESS_KEY_ID =
        "aws_access_key_id";
    private String awsAccessKeyId;

    public static final String JSON_PROPERTY_AWS_SECRET_ACCESS_KEY =
        "aws_secret_access_key";
    private String awsSecretAccessKey;

    public S3ConfigurationData() {}

    public S3ConfigurationData bucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * Name of the bucket to be used to store recording files.
     * @return bucket
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "example-bucket",
        value = "Name of the bucket to be used to store recording files."
    )
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

    public S3ConfigurationData region(Region region) {
        this.region = region;
        return this;
    }

    /**
     * Get region
     * @return region
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_REGION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Region getRegion() {
        return region;
    }

    @JsonProperty(JSON_PROPERTY_REGION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRegion(Region region) {
        this.region = region;
    }

    public S3ConfigurationData awsAccessKeyId(String awsAccessKeyId) {
        this.awsAccessKeyId = awsAccessKeyId;
        return this;
    }

    /**
     * AWS credentials access key id.
     * @return awsAccessKeyId
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "AKIAIOSFODNN7EXAMPLE",
        value = "AWS credentials access key id."
    )
    @JsonProperty(JSON_PROPERTY_AWS_ACCESS_KEY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getAwsAccessKeyId() {
        return awsAccessKeyId;
    }

    @JsonProperty(JSON_PROPERTY_AWS_ACCESS_KEY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAwsAccessKeyId(String awsAccessKeyId) {
        this.awsAccessKeyId = awsAccessKeyId;
    }

    public S3ConfigurationData awsSecretAccessKey(String awsSecretAccessKey) {
        this.awsSecretAccessKey = awsSecretAccessKey;
        return this;
    }

    /**
     * AWS secret access key.
     * @return awsSecretAccessKey
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "wJalrXUtnFEMI/K7MDENG/bPxRfiCYEXAMPLEKEY",
        value = "AWS secret access key."
    )
    @JsonProperty(JSON_PROPERTY_AWS_SECRET_ACCESS_KEY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getAwsSecretAccessKey() {
        return awsSecretAccessKey;
    }

    @JsonProperty(JSON_PROPERTY_AWS_SECRET_ACCESS_KEY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAwsSecretAccessKey(String awsSecretAccessKey) {
        this.awsSecretAccessKey = awsSecretAccessKey;
    }

    /**
     * Return true if this S3ConfigurationData object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        S3ConfigurationData s3ConfigurationData = (S3ConfigurationData) o;
        return (
            Objects.equals(this.bucket, s3ConfigurationData.bucket) &&
            Objects.equals(this.region, s3ConfigurationData.region) &&
            Objects.equals(
                this.awsAccessKeyId,
                s3ConfigurationData.awsAccessKeyId
            ) &&
            Objects.equals(
                this.awsSecretAccessKey,
                s3ConfigurationData.awsSecretAccessKey
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucket, region, awsAccessKeyId, awsSecretAccessKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class S3ConfigurationData {\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb
            .append("    awsAccessKeyId: ")
            .append(toIndentedString(awsAccessKeyId))
            .append("\n");
        sb
            .append("    awsSecretAccessKey: ")
            .append(toIndentedString(awsSecretAccessKey))
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
