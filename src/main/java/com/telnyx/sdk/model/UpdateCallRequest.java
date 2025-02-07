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
 * UpdateCallRequest
 */
@JsonPropertyOrder(
    {
        UpdateCallRequest.JSON_PROPERTY_STATUS,
        UpdateCallRequest.JSON_PROPERTY_URL,
        UpdateCallRequest.JSON_PROPERTY_METHOD,
        UpdateCallRequest.JSON_PROPERTY_FALLBACK_URL,
        UpdateCallRequest.JSON_PROPERTY_FALLBACK_METHOD,
        UpdateCallRequest.JSON_PROPERTY_STATUS_CALLBACK,
        UpdateCallRequest.JSON_PROPERTY_STATUS_CALLBACK_METHOD,
        UpdateCallRequest.JSON_PROPERTY_TEXML,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class UpdateCallRequest {

    public static final String JSON_PROPERTY_STATUS = "Status";
    private String status;

    public static final String JSON_PROPERTY_URL = "Url";
    private String url;

    /**
     * HTTP request type used for &#x60;Url&#x60;.
     */
    public enum MethodEnum {
        GET(String.valueOf("GET")),

        POST(String.valueOf("POST"));

        private String value;

        MethodEnum(String value) {
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
        public static MethodEnum fromValue(String value) {
            for (MethodEnum b : MethodEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_METHOD = "Method";
    private MethodEnum method;

    public static final String JSON_PROPERTY_FALLBACK_URL = "FallbackUrl";
    private String fallbackUrl;

    /**
     * HTTP request type used for &#x60;FallbackUrl&#x60;.
     */
    public enum FallbackMethodEnum {
        GET(String.valueOf("GET")),

        POST(String.valueOf("POST"));

        private String value;

        FallbackMethodEnum(String value) {
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
        public static FallbackMethodEnum fromValue(String value) {
            for (FallbackMethodEnum b : FallbackMethodEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_FALLBACK_METHOD = "FallbackMethod";
    private FallbackMethodEnum fallbackMethod;

    public static final String JSON_PROPERTY_STATUS_CALLBACK = "StatusCallback";
    private String statusCallback;

    /**
     * HTTP request type used for &#x60;StatusCallback&#x60;.
     */
    public enum StatusCallbackMethodEnum {
        GET(String.valueOf("GET")),

        POST(String.valueOf("POST"));

        private String value;

        StatusCallbackMethodEnum(String value) {
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
        public static StatusCallbackMethodEnum fromValue(String value) {
            for (StatusCallbackMethodEnum b : StatusCallbackMethodEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_STATUS_CALLBACK_METHOD =
        "StatusCallbackMethod";
    private StatusCallbackMethodEnum statusCallbackMethod;

    public static final String JSON_PROPERTY_TEXML = "Texml";
    private String texml;

    public UpdateCallRequest() {}

    public UpdateCallRequest status(String status) {
        this.status = status;
        return this;
    }

    /**
     * The value to set the call status to. Setting the status to completed ends the call.
     * @return status
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "completed",
        value = "The value to set the call status to. Setting the status to completed ends the call."
    )
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

    public UpdateCallRequest url(String url) {
        this.url = url;
        return this;
    }

    /**
     * The URL where TeXML will make a request to retrieve a new set of TeXML instructions to continue the call flow.
     * @return url
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "https://www.example.com/intruction-b.xml",
        value = "The URL where TeXML will make a request to retrieve a new set of TeXML instructions to continue the call flow."
    )
    @JsonProperty(JSON_PROPERTY_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getUrl() {
        return url;
    }

    @JsonProperty(JSON_PROPERTY_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setUrl(String url) {
        this.url = url;
    }

    public UpdateCallRequest method(MethodEnum method) {
        this.method = method;
        return this;
    }

    /**
     * HTTP request type used for &#x60;Url&#x60;.
     * @return method
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "GET",
        value = "HTTP request type used for `Url`."
    )
    @JsonProperty(JSON_PROPERTY_METHOD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public MethodEnum getMethod() {
        return method;
    }

    @JsonProperty(JSON_PROPERTY_METHOD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMethod(MethodEnum method) {
        this.method = method;
    }

    public UpdateCallRequest fallbackUrl(String fallbackUrl) {
        this.fallbackUrl = fallbackUrl;
        return this;
    }

    /**
     * A failover URL for which Telnyx will retrieve the TeXML call instructions if the Url is not responding.
     * @return fallbackUrl
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "https://www.example.com/intruction-c.xml",
        value = "A failover URL for which Telnyx will retrieve the TeXML call instructions if the Url is not responding."
    )
    @JsonProperty(JSON_PROPERTY_FALLBACK_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getFallbackUrl() {
        return fallbackUrl;
    }

    @JsonProperty(JSON_PROPERTY_FALLBACK_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFallbackUrl(String fallbackUrl) {
        this.fallbackUrl = fallbackUrl;
    }

    public UpdateCallRequest fallbackMethod(FallbackMethodEnum fallbackMethod) {
        this.fallbackMethod = fallbackMethod;
        return this;
    }

    /**
     * HTTP request type used for &#x60;FallbackUrl&#x60;.
     * @return fallbackMethod
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "GET",
        value = "HTTP request type used for `FallbackUrl`."
    )
    @JsonProperty(JSON_PROPERTY_FALLBACK_METHOD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public FallbackMethodEnum getFallbackMethod() {
        return fallbackMethod;
    }

    @JsonProperty(JSON_PROPERTY_FALLBACK_METHOD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFallbackMethod(FallbackMethodEnum fallbackMethod) {
        this.fallbackMethod = fallbackMethod;
    }

    public UpdateCallRequest statusCallback(String statusCallback) {
        this.statusCallback = statusCallback;
        return this;
    }

    /**
     * URL destination for Telnyx to send status callback events to for the call.
     * @return statusCallback
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "https://www.example.com/callback",
        value = "URL destination for Telnyx to send status callback events to for the call."
    )
    @JsonProperty(JSON_PROPERTY_STATUS_CALLBACK)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getStatusCallback() {
        return statusCallback;
    }

    @JsonProperty(JSON_PROPERTY_STATUS_CALLBACK)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStatusCallback(String statusCallback) {
        this.statusCallback = statusCallback;
    }

    public UpdateCallRequest statusCallbackMethod(
        StatusCallbackMethodEnum statusCallbackMethod
    ) {
        this.statusCallbackMethod = statusCallbackMethod;
        return this;
    }

    /**
     * HTTP request type used for &#x60;StatusCallback&#x60;.
     * @return statusCallbackMethod
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "GET",
        value = "HTTP request type used for `StatusCallback`."
    )
    @JsonProperty(JSON_PROPERTY_STATUS_CALLBACK_METHOD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public StatusCallbackMethodEnum getStatusCallbackMethod() {
        return statusCallbackMethod;
    }

    @JsonProperty(JSON_PROPERTY_STATUS_CALLBACK_METHOD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStatusCallbackMethod(
        StatusCallbackMethodEnum statusCallbackMethod
    ) {
        this.statusCallbackMethod = statusCallbackMethod;
    }

    public UpdateCallRequest texml(String texml) {
        this.texml = texml;
        return this;
    }

    /**
     * TeXML to replace the current one with.
     * @return texml
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Response><Say>Hello</Say></Response>",
        value = "TeXML to replace the current one with."
    )
    @JsonProperty(JSON_PROPERTY_TEXML)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getTexml() {
        return texml;
    }

    @JsonProperty(JSON_PROPERTY_TEXML)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTexml(String texml) {
        this.texml = texml;
    }

    /**
     * Return true if this UpdateCallRequest object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateCallRequest updateCallRequest = (UpdateCallRequest) o;
        return (
            Objects.equals(this.status, updateCallRequest.status) &&
            Objects.equals(this.url, updateCallRequest.url) &&
            Objects.equals(this.method, updateCallRequest.method) &&
            Objects.equals(this.fallbackUrl, updateCallRequest.fallbackUrl) &&
            Objects.equals(
                this.fallbackMethod,
                updateCallRequest.fallbackMethod
            ) &&
            Objects.equals(
                this.statusCallback,
                updateCallRequest.statusCallback
            ) &&
            Objects.equals(
                this.statusCallbackMethod,
                updateCallRequest.statusCallbackMethod
            ) &&
            Objects.equals(this.texml, updateCallRequest.texml)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            status,
            url,
            method,
            fallbackUrl,
            fallbackMethod,
            statusCallback,
            statusCallbackMethod,
            texml
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCallRequest {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb
            .append("    fallbackUrl: ")
            .append(toIndentedString(fallbackUrl))
            .append("\n");
        sb
            .append("    fallbackMethod: ")
            .append(toIndentedString(fallbackMethod))
            .append("\n");
        sb
            .append("    statusCallback: ")
            .append(toIndentedString(statusCallback))
            .append("\n");
        sb
            .append("    statusCallbackMethod: ")
            .append(toIndentedString(statusCallbackMethod))
            .append("\n");
        sb.append("    texml: ").append(toIndentedString(texml)).append("\n");
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
