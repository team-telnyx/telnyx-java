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
 * UpdateConferenceRequest
 */
@JsonPropertyOrder({
  UpdateConferenceRequest.JSON_PROPERTY_STATUS,
  UpdateConferenceRequest.JSON_PROPERTY_ANNOUNCE_URL,
  UpdateConferenceRequest.JSON_PROPERTY_ANNOUNCE_METHOD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class UpdateConferenceRequest {
  public static final String JSON_PROPERTY_STATUS = "Status";
  private String status;

  public static final String JSON_PROPERTY_ANNOUNCE_URL = "AnnounceUrl";
  private String announceUrl;

  /**
   * The HTTP method used to call the &#x60;AnnounceUrl&#x60;. Defaults to &#x60;POST&#x60;.
   */
  public enum AnnounceMethodEnum {
    GET(String.valueOf("GET")),
    
    POST(String.valueOf("POST"));

    private String value;

    AnnounceMethodEnum(String value) {
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
    public static AnnounceMethodEnum fromValue(String value) {
      for (AnnounceMethodEnum b : AnnounceMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ANNOUNCE_METHOD = "AnnounceMethod";
  private AnnounceMethodEnum announceMethod;

  public UpdateConferenceRequest() { 
  }

  public UpdateConferenceRequest status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The new status of the resource. Specifying &#x60;completed&#x60; will end the conference and hang up all participants.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "completed", value = "The new status of the resource. Specifying `completed` will end the conference and hang up all participants.")
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


  public UpdateConferenceRequest announceUrl(String announceUrl) {
    this.announceUrl = announceUrl;
    return this;
  }

   /**
   * The URL we should call to announce something into the conference. The URL may return an MP3 file, a WAV file, or a TwiML document that contains &#x60;&lt;Play&gt;&#x60;, &#x60;&lt;Say&gt;&#x60;, &#x60;&lt;Pause&gt;&#x60;, or &#x60;&lt;Redirect&gt;&#x60; verbs.
   * @return announceUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://www.example.com/announce.xml", value = "The URL we should call to announce something into the conference. The URL may return an MP3 file, a WAV file, or a TwiML document that contains `<Play>`, `<Say>`, `<Pause>`, or `<Redirect>` verbs.")
  @JsonProperty(JSON_PROPERTY_ANNOUNCE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAnnounceUrl() {
    return announceUrl;
  }


  @JsonProperty(JSON_PROPERTY_ANNOUNCE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnnounceUrl(String announceUrl) {
    this.announceUrl = announceUrl;
  }


  public UpdateConferenceRequest announceMethod(AnnounceMethodEnum announceMethod) {
    this.announceMethod = announceMethod;
    return this;
  }

   /**
   * The HTTP method used to call the &#x60;AnnounceUrl&#x60;. Defaults to &#x60;POST&#x60;.
   * @return announceMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "GET", value = "The HTTP method used to call the `AnnounceUrl`. Defaults to `POST`.")
  @JsonProperty(JSON_PROPERTY_ANNOUNCE_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AnnounceMethodEnum getAnnounceMethod() {
    return announceMethod;
  }


  @JsonProperty(JSON_PROPERTY_ANNOUNCE_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnnounceMethod(AnnounceMethodEnum announceMethod) {
    this.announceMethod = announceMethod;
  }


  /**
   * Return true if this UpdateConferenceRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateConferenceRequest updateConferenceRequest = (UpdateConferenceRequest) o;
    return Objects.equals(this.status, updateConferenceRequest.status) &&
        Objects.equals(this.announceUrl, updateConferenceRequest.announceUrl) &&
        Objects.equals(this.announceMethod, updateConferenceRequest.announceMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, announceUrl, announceMethod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateConferenceRequest {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    announceUrl: ").append(toIndentedString(announceUrl)).append("\n");
    sb.append("    announceMethod: ").append(toIndentedString(announceMethod)).append("\n");
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

