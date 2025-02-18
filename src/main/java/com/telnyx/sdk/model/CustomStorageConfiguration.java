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
import com.telnyx.sdk.model.CustomStorageConfigurationConfiguration;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * CustomStorageConfiguration
 */
@JsonPropertyOrder(
    {
        CustomStorageConfiguration.JSON_PROPERTY_BACKEND,
        CustomStorageConfiguration.JSON_PROPERTY_CONFIGURATION,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class CustomStorageConfiguration {

    /**
     * Gets or Sets backend
     */
    public enum BackendEnum {
        GCS(String.valueOf("gcs")),

        S3(String.valueOf("s3")),

        AZURE(String.valueOf("azure"));

        private String value;

        BackendEnum(String value) {
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
        public static BackendEnum fromValue(String value) {
            for (BackendEnum b : BackendEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_BACKEND = "backend";
    private BackendEnum backend;

    public static final String JSON_PROPERTY_CONFIGURATION = "configuration";
    private CustomStorageConfigurationConfiguration _configuration;

    public CustomStorageConfiguration() {}

    public CustomStorageConfiguration backend(BackendEnum backend) {
        this.backend = backend;
        return this;
    }

    /**
     * Get backend
     * @return backend
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(example = "gcs", required = true, value = "")
    @JsonProperty(JSON_PROPERTY_BACKEND)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public BackendEnum getBackend() {
        return backend;
    }

    @JsonProperty(JSON_PROPERTY_BACKEND)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setBackend(BackendEnum backend) {
        this.backend = backend;
    }

    public CustomStorageConfiguration _configuration(
        CustomStorageConfigurationConfiguration _configuration
    ) {
        this._configuration = _configuration;
        return this;
    }

    /**
     * Get _configuration
     * @return _configuration
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_CONFIGURATION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public CustomStorageConfigurationConfiguration getConfiguration() {
        return _configuration;
    }

    @JsonProperty(JSON_PROPERTY_CONFIGURATION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setConfiguration(
        CustomStorageConfigurationConfiguration _configuration
    ) {
        this._configuration = _configuration;
    }

    /**
     * Return true if this CustomStorageConfiguration object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomStorageConfiguration customStorageConfiguration =
            (CustomStorageConfiguration) o;
        return (
            Objects.equals(this.backend, customStorageConfiguration.backend) &&
            Objects.equals(
                this._configuration,
                customStorageConfiguration._configuration
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(backend, _configuration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomStorageConfiguration {\n");
        sb
            .append("    backend: ")
            .append(toIndentedString(backend))
            .append("\n");
        sb
            .append("    _configuration: ")
            .append(toIndentedString(_configuration))
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
