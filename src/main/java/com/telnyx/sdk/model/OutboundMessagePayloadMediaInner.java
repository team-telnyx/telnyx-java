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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * OutboundMessagePayloadMediaInner
 */
@JsonPropertyOrder({
  OutboundMessagePayloadMediaInner.JSON_PROPERTY_URL,
  OutboundMessagePayloadMediaInner.JSON_PROPERTY_CONTENT_TYPE,
  OutboundMessagePayloadMediaInner.JSON_PROPERTY_SHA256,
  OutboundMessagePayloadMediaInner.JSON_PROPERTY_SIZE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OutboundMessagePayloadMediaInner {
  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_CONTENT_TYPE = "content_type";
  private JsonNullable<String> contentType = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SHA256 = "sha256";
  private JsonNullable<String> sha256 = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SIZE = "size";
  private JsonNullable<Integer> size = JsonNullable.<Integer>undefined();

  public OutboundMessagePayloadMediaInner() { 
  }

  public OutboundMessagePayloadMediaInner url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The url of the media requested to be sent.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The url of the media requested to be sent.")
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


  public OutboundMessagePayloadMediaInner contentType(String contentType) {
    this.contentType = JsonNullable.<String>of(contentType);
    return this;
  }

   /**
   * The MIME type of the requested media.
   * @return contentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The MIME type of the requested media.")
  @JsonIgnore

  public String getContentType() {
        return contentType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONTENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getContentType_JsonNullable() {
    return contentType;
  }
  
  @JsonProperty(JSON_PROPERTY_CONTENT_TYPE)
  public void setContentType_JsonNullable(JsonNullable<String> contentType) {
    this.contentType = contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = JsonNullable.<String>of(contentType);
  }


  public OutboundMessagePayloadMediaInner sha256(String sha256) {
    this.sha256 = JsonNullable.<String>of(sha256);
    return this;
  }

   /**
   * The SHA256 hash of the requested media.
   * @return sha256
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The SHA256 hash of the requested media.")
  @JsonIgnore

  public String getSha256() {
        return sha256.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SHA256)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSha256_JsonNullable() {
    return sha256;
  }
  
  @JsonProperty(JSON_PROPERTY_SHA256)
  public void setSha256_JsonNullable(JsonNullable<String> sha256) {
    this.sha256 = sha256;
  }

  public void setSha256(String sha256) {
    this.sha256 = JsonNullable.<String>of(sha256);
  }


  public OutboundMessagePayloadMediaInner size(Integer size) {
    this.size = JsonNullable.<Integer>of(size);
    return this;
  }

   /**
   * The size of the requested media.
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The size of the requested media.")
  @JsonIgnore

  public Integer getSize() {
        return size.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getSize_JsonNullable() {
    return size;
  }
  
  @JsonProperty(JSON_PROPERTY_SIZE)
  public void setSize_JsonNullable(JsonNullable<Integer> size) {
    this.size = size;
  }

  public void setSize(Integer size) {
    this.size = JsonNullable.<Integer>of(size);
  }


  /**
   * Return true if this OutboundMessagePayload_media_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutboundMessagePayloadMediaInner outboundMessagePayloadMediaInner = (OutboundMessagePayloadMediaInner) o;
    return Objects.equals(this.url, outboundMessagePayloadMediaInner.url) &&
        equalsNullable(this.contentType, outboundMessagePayloadMediaInner.contentType) &&
        equalsNullable(this.sha256, outboundMessagePayloadMediaInner.sha256) &&
        equalsNullable(this.size, outboundMessagePayloadMediaInner.size);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, hashCodeNullable(contentType), hashCodeNullable(sha256), hashCodeNullable(size));
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
    sb.append("class OutboundMessagePayloadMediaInner {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    sha256: ").append(toIndentedString(sha256)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

