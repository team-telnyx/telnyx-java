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
 * Request details.
 */
@ApiModel(description = "Request details.")
@JsonPropertyOrder(
    { HttpRequest.JSON_PROPERTY_URL, HttpRequest.JSON_PROPERTY_HEADERS }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class HttpRequest {

    public static final String JSON_PROPERTY_URL = "url";
    private String url;

    public static final String JSON_PROPERTY_HEADERS = "headers";
    private List<List<String>> headers = null;

    public HttpRequest() {}

    public HttpRequest url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(example = "https://example.com/webhooks", value = "")
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

    public HttpRequest headers(List<List<String>> headers) {
        this.headers = headers;
        return this;
    }

    public HttpRequest addheadersItem(List<String> headersItem) {
        if (this.headers == null) {
            this.headers = new ArrayList<>();
        }
        this.headers.add(headersItem);
        return this;
    }

    /**
     * List of headers, limited to 10kB.
     * @return headers
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "[[\"header_name\",\"header_value\"]]",
        value = "List of headers, limited to 10kB."
    )
    @JsonProperty(JSON_PROPERTY_HEADERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<List<String>> getHeaders() {
        return headers;
    }

    @JsonProperty(JSON_PROPERTY_HEADERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setHeaders(List<List<String>> headers) {
        this.headers = headers;
    }

    /**
     * Return true if this http_request object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HttpRequest httpRequest = (HttpRequest) o;
        return (
            Objects.equals(this.url, httpRequest.url) &&
            Objects.equals(this.headers, httpRequest.headers)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, headers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HttpRequest {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb
            .append("    headers: ")
            .append(toIndentedString(headers))
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
