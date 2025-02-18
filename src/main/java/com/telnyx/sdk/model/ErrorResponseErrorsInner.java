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
import com.telnyx.sdk.model.ErrorResponseErrorsInnerMeta;
import com.telnyx.sdk.model.ErrorResponseErrorsInnerSource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ErrorResponseErrorsInner
 */
@JsonPropertyOrder(
    {
        ErrorResponseErrorsInner.JSON_PROPERTY_CODE,
        ErrorResponseErrorsInner.JSON_PROPERTY_DETAIL,
        ErrorResponseErrorsInner.JSON_PROPERTY_META,
        ErrorResponseErrorsInner.JSON_PROPERTY_TITLE,
        ErrorResponseErrorsInner.JSON_PROPERTY_SOURCE,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class ErrorResponseErrorsInner {

    public static final String JSON_PROPERTY_CODE = "code";
    private String code;

    public static final String JSON_PROPERTY_DETAIL = "detail";
    private String detail;

    public static final String JSON_PROPERTY_META = "meta";
    private ErrorResponseErrorsInnerMeta meta;

    public static final String JSON_PROPERTY_TITLE = "title";
    private String title;

    public static final String JSON_PROPERTY_SOURCE = "source";
    private ErrorResponseErrorsInnerSource source;

    public ErrorResponseErrorsInner() {}

    public ErrorResponseErrorsInner code(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get code
     * @return code
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCode() {
        return code;
    }

    @JsonProperty(JSON_PROPERTY_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCode(String code) {
        this.code = code;
    }

    public ErrorResponseErrorsInner detail(String detail) {
        this.detail = detail;
        return this;
    }

    /**
     * Get detail
     * @return detail
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_DETAIL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getDetail() {
        return detail;
    }

    @JsonProperty(JSON_PROPERTY_DETAIL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDetail(String detail) {
        this.detail = detail;
    }

    public ErrorResponseErrorsInner meta(ErrorResponseErrorsInnerMeta meta) {
        this.meta = meta;
        return this;
    }

    /**
     * Get meta
     * @return meta
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_META)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public ErrorResponseErrorsInnerMeta getMeta() {
        return meta;
    }

    @JsonProperty(JSON_PROPERTY_META)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMeta(ErrorResponseErrorsInnerMeta meta) {
        this.meta = meta;
    }

    public ErrorResponseErrorsInner title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get title
     * @return title
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_TITLE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getTitle() {
        return title;
    }

    @JsonProperty(JSON_PROPERTY_TITLE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTitle(String title) {
        this.title = title;
    }

    public ErrorResponseErrorsInner source(
        ErrorResponseErrorsInnerSource source
    ) {
        this.source = source;
        return this;
    }

    /**
     * Get source
     * @return source
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_SOURCE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public ErrorResponseErrorsInnerSource getSource() {
        return source;
    }

    @JsonProperty(JSON_PROPERTY_SOURCE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSource(ErrorResponseErrorsInnerSource source) {
        this.source = source;
    }

    /**
     * Return true if this ErrorResponse_errors_inner object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ErrorResponseErrorsInner errorResponseErrorsInner =
            (ErrorResponseErrorsInner) o;
        return (
            Objects.equals(this.code, errorResponseErrorsInner.code) &&
            Objects.equals(this.detail, errorResponseErrorsInner.detail) &&
            Objects.equals(this.meta, errorResponseErrorsInner.meta) &&
            Objects.equals(this.title, errorResponseErrorsInner.title) &&
            Objects.equals(this.source, errorResponseErrorsInner.source)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, detail, meta, title, source);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ErrorResponseErrorsInner {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
        sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
