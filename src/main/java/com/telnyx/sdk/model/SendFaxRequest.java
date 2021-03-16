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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * SendFaxRequest
 */
@JsonPropertyOrder({
  SendFaxRequest.JSON_PROPERTY_CONNECTION_ID,
  SendFaxRequest.JSON_PROPERTY_MEDIA_URL,
  SendFaxRequest.JSON_PROPERTY_TO,
  SendFaxRequest.JSON_PROPERTY_FROM,
  SendFaxRequest.JSON_PROPERTY_QUALITY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SendFaxRequest {
  public static final String JSON_PROPERTY_CONNECTION_ID = "connection_id";
  private String connectionId;

  public static final String JSON_PROPERTY_MEDIA_URL = "media_url";
  private String mediaUrl;

  public static final String JSON_PROPERTY_TO = "to";
  private String to;

  public static final String JSON_PROPERTY_FROM = "from";
  private String from;

  public static final String JSON_PROPERTY_QUALITY = "quality";
  private String quality = "high";


  public SendFaxRequest connectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }

   /**
   * The connection ID to send the fax with.
   * @return connectionId
  **/
  @ApiModelProperty(example = "234423", required = true, value = "The connection ID to send the fax with.")
  @JsonProperty(JSON_PROPERTY_CONNECTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getConnectionId() {
    return connectionId;
  }


  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }


  public SendFaxRequest mediaUrl(String mediaUrl) {
    this.mediaUrl = mediaUrl;
    return this;
  }

   /**
   * The URL to the PDF used for the fax&#39;s media.
   * @return mediaUrl
  **/
  @ApiModelProperty(example = "https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf", required = true, value = "The URL to the PDF used for the fax's media.")
  @JsonProperty(JSON_PROPERTY_MEDIA_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMediaUrl() {
    return mediaUrl;
  }


  public void setMediaUrl(String mediaUrl) {
    this.mediaUrl = mediaUrl;
  }


  public SendFaxRequest to(String to) {
    this.to = to;
    return this;
  }

   /**
   * The phone number, in E.164 format, the fax will be sent to or SIP URI
   * @return to
  **/
  @ApiModelProperty(example = "+13127367276", required = true, value = "The phone number, in E.164 format, the fax will be sent to or SIP URI")
  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTo() {
    return to;
  }


  public void setTo(String to) {
    this.to = to;
  }


  public SendFaxRequest from(String from) {
    this.from = from;
    return this;
  }

   /**
   * The phone number, in E.164 format, the fax will be sent from.
   * @return from
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "+13125790015", value = "The phone number, in E.164 format, the fax will be sent from.")
  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFrom() {
    return from;
  }


  public void setFrom(String from) {
    this.from = from;
  }


  public SendFaxRequest quality(String quality) {
    this.quality = quality;
    return this;
  }

   /**
   * The quality of the fax. Can be normal, high, very_high
   * @return quality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "high", value = "The quality of the fax. Can be normal, high, very_high")
  @JsonProperty(JSON_PROPERTY_QUALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getQuality() {
    return quality;
  }


  public void setQuality(String quality) {
    this.quality = quality;
  }


  /**
   * Return true if this SendFaxRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendFaxRequest sendFaxRequest = (SendFaxRequest) o;
    return Objects.equals(this.connectionId, sendFaxRequest.connectionId) &&
        Objects.equals(this.mediaUrl, sendFaxRequest.mediaUrl) &&
        Objects.equals(this.to, sendFaxRequest.to) &&
        Objects.equals(this.from, sendFaxRequest.from) &&
        Objects.equals(this.quality, sendFaxRequest.quality);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionId, mediaUrl, to, from, quality);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendFaxRequest {\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    mediaUrl: ").append(toIndentedString(mediaUrl)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
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

