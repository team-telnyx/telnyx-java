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
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * GCSConfigurationData
 */
@JsonPropertyOrder(
    {
        GCSConfigurationData.JSON_PROPERTY_CREDENTIALS,
        GCSConfigurationData.JSON_PROPERTY_BUCKET,
    }
)
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class GCSConfigurationData {

    public static final String JSON_PROPERTY_CREDENTIALS = "credentials";
    private String credentials;

    public static final String JSON_PROPERTY_BUCKET = "bucket";
    private String bucket;

    public GCSConfigurationData() {}

    public GCSConfigurationData credentials(String credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * Opaque credential token used to authenticate and authorize with storage provider.
     * @return credentials
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "OPAQUE_CREDENTIALS_TOKEN",
        value = "Opaque credential token used to authenticate and authorize with storage provider."
    )
    @JsonProperty(JSON_PROPERTY_CREDENTIALS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCredentials() {
        return credentials;
    }

    @JsonProperty(JSON_PROPERTY_CREDENTIALS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCredentials(String credentials) {
        this.credentials = credentials;
    }

    public GCSConfigurationData bucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * Name of the bucket to be used to store recording files.
     * @return bucket
     **/
    @javax.annotation.Nullable
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

    /**
     * Return true if this GCSConfigurationData object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GCSConfigurationData gcSConfigurationData = (GCSConfigurationData) o;
        return (
            Objects.equals(
                this.credentials,
                gcSConfigurationData.credentials
            ) &&
            Objects.equals(this.bucket, gcSConfigurationData.bucket)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(credentials, bucket);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GCSConfigurationData {\n");
        sb
            .append("    credentials: ")
            .append(toIndentedString(credentials))
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
