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

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.telnyx.sdk.model.GenericError;
import com.telnyx.sdk.model.UnauthorizedErrorAllOf;
import com.telnyx.sdk.model.UnauthorizedErrorAllOfMeta;
import com.telnyx.sdk.model.UpdateOutboundChannelsDefaultResponseErrorsInnerSource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * UnauthorizedError
 */
@JsonPropertyOrder({
  UnauthorizedError.JSON_PROPERTY_CODE,
  UnauthorizedError.JSON_PROPERTY_TITLE,
  UnauthorizedError.JSON_PROPERTY_DETAIL,
  UnauthorizedError.JSON_PROPERTY_SOURCE,
  UnauthorizedError.JSON_PROPERTY_META
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UnauthorizedError {
  public static final String JSON_PROPERTY_CODE = "code";
  private JsonNullable<Object> code = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_TITLE = "title";
  private JsonNullable<Object> title = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_DETAIL = "detail";
  private JsonNullable<Object> detail = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SOURCE = "source";
  private UpdateOutboundChannelsDefaultResponseErrorsInnerSource source;

  public static final String JSON_PROPERTY_META = "meta";
  private UnauthorizedErrorAllOfMeta meta;

  public UnauthorizedError() { 
  }

  public UnauthorizedError code(Object code) {
    this.code = JsonNullable.<Object>of(code);
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10009", value = "")
  @JsonIgnore

  public Object getCode() {
        return code.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getCode_JsonNullable() {
    return code;
  }
  
  @JsonProperty(JSON_PROPERTY_CODE)
  public void setCode_JsonNullable(JsonNullable<Object> code) {
    this.code = code;
  }

  public void setCode(Object code) {
    this.code = JsonNullable.<Object>of(code);
  }


  public UnauthorizedError title(Object title) {
    this.title = JsonNullable.<Object>of(title);
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Authentication failed", value = "")
  @JsonIgnore

  public Object getTitle() {
        return title.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getTitle_JsonNullable() {
    return title;
  }
  
  @JsonProperty(JSON_PROPERTY_TITLE)
  public void setTitle_JsonNullable(JsonNullable<Object> title) {
    this.title = title;
  }

  public void setTitle(Object title) {
    this.title = JsonNullable.<Object>of(title);
  }


  public UnauthorizedError detail(Object detail) {
    this.detail = JsonNullable.<Object>of(detail);
    return this;
  }

   /**
   * Get detail
   * @return detail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "The required authentication headers were either invalid or not included in the request.", value = "")
  @JsonIgnore

  public Object getDetail() {
        return detail.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getDetail_JsonNullable() {
    return detail;
  }
  
  @JsonProperty(JSON_PROPERTY_DETAIL)
  public void setDetail_JsonNullable(JsonNullable<Object> detail) {
    this.detail = detail;
  }

  public void setDetail(Object detail) {
    this.detail = JsonNullable.<Object>of(detail);
  }


  public UnauthorizedError source(UpdateOutboundChannelsDefaultResponseErrorsInnerSource source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UpdateOutboundChannelsDefaultResponseErrorsInnerSource getSource() {
    return source;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSource(UpdateOutboundChannelsDefaultResponseErrorsInnerSource source) {
    this.source = source;
  }


  public UnauthorizedError meta(UnauthorizedErrorAllOfMeta meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UnauthorizedErrorAllOfMeta getMeta() {
    return meta;
  }


  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeta(UnauthorizedErrorAllOfMeta meta) {
    this.meta = meta;
  }


  /**
   * Return true if this UnauthorizedError object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnauthorizedError unauthorizedError = (UnauthorizedError) o;
    return equalsNullable(this.code, unauthorizedError.code) &&
        equalsNullable(this.title, unauthorizedError.title) &&
        equalsNullable(this.detail, unauthorizedError.detail) &&
        Objects.equals(this.source, unauthorizedError.source) &&
        Objects.equals(this.meta, unauthorizedError.meta);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(code), hashCodeNullable(title), hashCodeNullable(detail), source, meta);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnauthorizedError {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

