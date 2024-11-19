/*
 * Telnyx API
 * Notifications and Notification Settings.
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * InboundMessagePayloadMediaInner
 */
@JsonPropertyOrder({
  InboundMessagePayloadMediaInner.JSON_PROPERTY_URL,
  InboundMessagePayloadMediaInner.JSON_PROPERTY_CONTENT_TYPE,
  InboundMessagePayloadMediaInner.JSON_PROPERTY_SIZE,
  InboundMessagePayloadMediaInner.JSON_PROPERTY_HASH_SHA256
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class InboundMessagePayloadMediaInner {
  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_CONTENT_TYPE = "content_type";
  private String contentType;

  public static final String JSON_PROPERTY_SIZE = "size";
  private Integer size;

  public static final String JSON_PROPERTY_HASH_SHA256 = "hash_sha256";
  private String hashSha256;

  public InboundMessagePayloadMediaInner() { 
  }

  public InboundMessagePayloadMediaInner url(String url) {
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


  public InboundMessagePayloadMediaInner contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * The MIME type of the requested media.
   * @return contentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The MIME type of the requested media.")
  @JsonProperty(JSON_PROPERTY_CONTENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContentType() {
    return contentType;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  public InboundMessagePayloadMediaInner size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * The size of the requested media.
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The size of the requested media.")
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSize() {
    return size;
  }


  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSize(Integer size) {
    this.size = size;
  }


  public InboundMessagePayloadMediaInner hashSha256(String hashSha256) {
    this.hashSha256 = hashSha256;
    return this;
  }

   /**
   * The SHA256 hash of the requested media.
   * @return hashSha256
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The SHA256 hash of the requested media.")
  @JsonProperty(JSON_PROPERTY_HASH_SHA256)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHashSha256() {
    return hashSha256;
  }


  @JsonProperty(JSON_PROPERTY_HASH_SHA256)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHashSha256(String hashSha256) {
    this.hashSha256 = hashSha256;
  }


  /**
   * Return true if this InboundMessagePayload_media_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InboundMessagePayloadMediaInner inboundMessagePayloadMediaInner = (InboundMessagePayloadMediaInner) o;
    return Objects.equals(this.url, inboundMessagePayloadMediaInner.url) &&
        Objects.equals(this.contentType, inboundMessagePayloadMediaInner.contentType) &&
        Objects.equals(this.size, inboundMessagePayloadMediaInner.size) &&
        Objects.equals(this.hashSha256, inboundMessagePayloadMediaInner.hashSha256);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, contentType, size, hashSha256);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InboundMessagePayloadMediaInner {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    hashSha256: ").append(toIndentedString(hashSha256)).append("\n");
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

