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
 * CallerName
 */
@JsonPropertyOrder(
    {
        CallerName.JSON_PROPERTY_CALLER_NAME,
        CallerName.JSON_PROPERTY_ERROR_CODE,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class CallerName {

    public static final String JSON_PROPERTY_CALLER_NAME = "caller_name";
    private String callerName;

    public static final String JSON_PROPERTY_ERROR_CODE = "error_code";
    private String errorCode;

    public CallerName() {}

    public CallerName callerName(String callerName) {
        this.callerName = callerName;
        return this;
    }

    /**
     * The name of the requested phone number&#39;s owner as per the CNAM database
     * @return callerName
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "TELNYX LLC",
        value = "The name of the requested phone number's owner as per the CNAM database"
    )
    @JsonProperty(JSON_PROPERTY_CALLER_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCallerName() {
        return callerName;
    }

    @JsonProperty(JSON_PROPERTY_CALLER_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCallerName(String callerName) {
        this.callerName = callerName;
    }

    public CallerName errorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * A caller-name lookup specific error code, expressed as a stringified 5-digit integer
     * @return errorCode
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "10001",
        value = "A caller-name lookup specific error code, expressed as a stringified 5-digit integer"
    )
    @JsonProperty(JSON_PROPERTY_ERROR_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getErrorCode() {
        return errorCode;
    }

    @JsonProperty(JSON_PROPERTY_ERROR_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Return true if this CallerName object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallerName callerName = (CallerName) o;
        return (
            Objects.equals(this.callerName, callerName.callerName) &&
            Objects.equals(this.errorCode, callerName.errorCode)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(callerName, errorCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CallerName {\n");
        sb
            .append("    callerName: ")
            .append(toIndentedString(callerName))
            .append("\n");
        sb
            .append("    errorCode: ")
            .append(toIndentedString(errorCode))
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
