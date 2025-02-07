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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.telnyx.sdk.model.RecordingSource;
import com.telnyx.sdk.model.RecordingTrack;
import com.telnyx.sdk.model.TwimlRecordingChannels;
import java.util.Arrays;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * TexmlCreateCallRecordingResponseBody
 */
@JsonPropertyOrder({
  TexmlCreateCallRecordingResponseBody.JSON_PROPERTY_ACCOUNT_SID,
  TexmlCreateCallRecordingResponseBody.JSON_PROPERTY_CALL_SID,
  TexmlCreateCallRecordingResponseBody.JSON_PROPERTY_CONFERENCE_SID,
  TexmlCreateCallRecordingResponseBody.JSON_PROPERTY_CHANNELS,
  TexmlCreateCallRecordingResponseBody.JSON_PROPERTY_DATE_CREATED,
  TexmlCreateCallRecordingResponseBody.JSON_PROPERTY_DATE_UPDATED,
  TexmlCreateCallRecordingResponseBody.JSON_PROPERTY_START_TIME,
  TexmlCreateCallRecordingResponseBody.JSON_PROPERTY_PRICE,
  TexmlCreateCallRecordingResponseBody.JSON_PROPERTY_PRICE_UNIT,
  TexmlCreateCallRecordingResponseBody.JSON_PROPERTY_DURATION,
  TexmlCreateCallRecordingResponseBody.JSON_PROPERTY_SID,
  TexmlCreateCallRecordingResponseBody.JSON_PROPERTY_SOURCE,
  TexmlCreateCallRecordingResponseBody.JSON_PROPERTY_ERROR_CODE,
  TexmlCreateCallRecordingResponseBody.JSON_PROPERTY_TRACK,
  TexmlCreateCallRecordingResponseBody.JSON_PROPERTY_URI
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class TexmlCreateCallRecordingResponseBody {
  public static final String JSON_PROPERTY_ACCOUNT_SID = "account_sid";
  private String accountSid;

  public static final String JSON_PROPERTY_CALL_SID = "call_sid";
  private String callSid;

  public static final String JSON_PROPERTY_CONFERENCE_SID = "conference_sid";
  private JsonNullable<UUID> conferenceSid = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_CHANNELS = "channels";
  private TwimlRecordingChannels channels = TwimlRecordingChannels.NUMBER_2;

  public static final String JSON_PROPERTY_DATE_CREATED = "date_created";
  private String dateCreated;

  public static final String JSON_PROPERTY_DATE_UPDATED = "date_updated";
  private String dateUpdated;

  public static final String JSON_PROPERTY_START_TIME = "start_time";
  private String startTime;

  public static final String JSON_PROPERTY_PRICE = "price";
  private JsonNullable<String> price = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PRICE_UNIT = "price_unit";
  private JsonNullable<String> priceUnit = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DURATION = "duration";
  private JsonNullable<String> duration = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SID = "sid";
  private String sid;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private RecordingSource source;

  public static final String JSON_PROPERTY_ERROR_CODE = "error_code";
  private JsonNullable<String> errorCode = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TRACK = "track";
  private RecordingTrack track;

  public static final String JSON_PROPERTY_URI = "uri";
  private String uri;

  public TexmlCreateCallRecordingResponseBody() { 
  }

  public TexmlCreateCallRecordingResponseBody accountSid(String accountSid) {
    this.accountSid = accountSid;
    return this;
  }

   /**
   * Get accountSid
   * @return accountSid
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "61bf923e-5e4d-4595-a110-56190ea18a1b", value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_SID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountSid() {
    return accountSid;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_SID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountSid(String accountSid) {
    this.accountSid = accountSid;
  }


  public TexmlCreateCallRecordingResponseBody callSid(String callSid) {
    this.callSid = callSid;
    return this;
  }

   /**
   * Get callSid
   * @return callSid
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA", value = "")
  @JsonProperty(JSON_PROPERTY_CALL_SID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCallSid() {
    return callSid;
  }


  @JsonProperty(JSON_PROPERTY_CALL_SID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCallSid(String callSid) {
    this.callSid = callSid;
  }


  public TexmlCreateCallRecordingResponseBody conferenceSid(UUID conferenceSid) {
    this.conferenceSid = JsonNullable.<UUID>of(conferenceSid);
    return this;
  }

   /**
   * Get conferenceSid
   * @return conferenceSid
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "cd5a70f4-759b-4d5e-9c06-88c00f16f3c1", value = "")
  @JsonIgnore

  public UUID getConferenceSid() {
        return conferenceSid.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONFERENCE_SID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<UUID> getConferenceSid_JsonNullable() {
    return conferenceSid;
  }
  
  @JsonProperty(JSON_PROPERTY_CONFERENCE_SID)
  public void setConferenceSid_JsonNullable(JsonNullable<UUID> conferenceSid) {
    this.conferenceSid = conferenceSid;
  }

  public void setConferenceSid(UUID conferenceSid) {
    this.conferenceSid = JsonNullable.<UUID>of(conferenceSid);
  }


  public TexmlCreateCallRecordingResponseBody channels(TwimlRecordingChannels channels) {
    this.channels = channels;
    return this;
  }

   /**
   * Get channels
   * @return channels
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CHANNELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TwimlRecordingChannels getChannels() {
    return channels;
  }


  @JsonProperty(JSON_PROPERTY_CHANNELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChannels(TwimlRecordingChannels channels) {
    this.channels = channels;
  }


  public TexmlCreateCallRecordingResponseBody dateCreated(String dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Get dateCreated
   * @return dateCreated
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Fri, 11 Aug 2023 19:12:11 +0000", value = "")
  @JsonProperty(JSON_PROPERTY_DATE_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDateCreated() {
    return dateCreated;
  }


  @JsonProperty(JSON_PROPERTY_DATE_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateCreated(String dateCreated) {
    this.dateCreated = dateCreated;
  }


  public TexmlCreateCallRecordingResponseBody dateUpdated(String dateUpdated) {
    this.dateUpdated = dateUpdated;
    return this;
  }

   /**
   * Get dateUpdated
   * @return dateUpdated
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Fri, 11 Aug 2023 19:12:11 +0000", value = "")
  @JsonProperty(JSON_PROPERTY_DATE_UPDATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDateUpdated() {
    return dateUpdated;
  }


  @JsonProperty(JSON_PROPERTY_DATE_UPDATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateUpdated(String dateUpdated) {
    this.dateUpdated = dateUpdated;
  }


  public TexmlCreateCallRecordingResponseBody startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Fri, 11 Aug 2023 19:12:11 +0000", value = "")
  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStartTime() {
    return startTime;
  }


  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public TexmlCreateCallRecordingResponseBody price(String price) {
    this.price = JsonNullable.<String>of(price);
    return this;
  }

   /**
   * The price of this recording, the currency is specified in the price_unit field. 
   * @return price
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "0.10", value = "The price of this recording, the currency is specified in the price_unit field. ")
  @JsonIgnore

  public String getPrice() {
        return price.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPrice_JsonNullable() {
    return price;
  }
  
  @JsonProperty(JSON_PROPERTY_PRICE)
  public void setPrice_JsonNullable(JsonNullable<String> price) {
    this.price = price;
  }

  public void setPrice(String price) {
    this.price = JsonNullable.<String>of(price);
  }


  public TexmlCreateCallRecordingResponseBody priceUnit(String priceUnit) {
    this.priceUnit = JsonNullable.<String>of(priceUnit);
    return this;
  }

   /**
   * The unit in which the price is given.
   * @return priceUnit
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "The unit in which the price is given.")
  @JsonIgnore

  public String getPriceUnit() {
        return priceUnit.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRICE_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPriceUnit_JsonNullable() {
    return priceUnit;
  }
  
  @JsonProperty(JSON_PROPERTY_PRICE_UNIT)
  public void setPriceUnit_JsonNullable(JsonNullable<String> priceUnit) {
    this.priceUnit = priceUnit;
  }

  public void setPriceUnit(String priceUnit) {
    this.priceUnit = JsonNullable.<String>of(priceUnit);
  }


  public TexmlCreateCallRecordingResponseBody duration(String duration) {
    this.duration = JsonNullable.<String>of(duration);
    return this;
  }

   /**
   * The duration of this recording, given in seconds.
   * @return duration
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "12", value = "The duration of this recording, given in seconds.")
  @JsonIgnore

  public String getDuration() {
        return duration.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDuration_JsonNullable() {
    return duration;
  }
  
  @JsonProperty(JSON_PROPERTY_DURATION)
  public void setDuration_JsonNullable(JsonNullable<String> duration) {
    this.duration = duration;
  }

  public void setDuration(String duration) {
    this.duration = JsonNullable.<String>of(duration);
  }


  public TexmlCreateCallRecordingResponseBody sid(String sid) {
    this.sid = sid;
    return this;
  }

   /**
   * Identifier of a resource.
   * @return sid
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "e9cea0be-7dbd-4b98-98b1-c0089d9d43b0", value = "Identifier of a resource.")
  @JsonProperty(JSON_PROPERTY_SID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSid() {
    return sid;
  }


  @JsonProperty(JSON_PROPERTY_SID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSid(String sid) {
    this.sid = sid;
  }


  public TexmlCreateCallRecordingResponseBody source(RecordingSource source) {
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

  public RecordingSource getSource() {
    return source;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSource(RecordingSource source) {
    this.source = source;
  }


  public TexmlCreateCallRecordingResponseBody errorCode(String errorCode) {
    this.errorCode = JsonNullable.<String>of(errorCode);
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getErrorCode() {
        return errorCode.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getErrorCode_JsonNullable() {
    return errorCode;
  }
  
  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  public void setErrorCode_JsonNullable(JsonNullable<String> errorCode) {
    this.errorCode = errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = JsonNullable.<String>of(errorCode);
  }


  public TexmlCreateCallRecordingResponseBody track(RecordingTrack track) {
    this.track = track;
    return this;
  }

   /**
   * Get track
   * @return track
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RecordingTrack getTrack() {
    return track;
  }


  @JsonProperty(JSON_PROPERTY_TRACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrack(RecordingTrack track) {
    this.track = track;
  }


  public TexmlCreateCallRecordingResponseBody uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * The relative URI for this recording resource.
   * @return uri
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Calls/v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA/Recordings/b08f0fa1-a32c-4218-b3b5-9cf78941ccac.json", value = "The relative URI for this recording resource.")
  @JsonProperty(JSON_PROPERTY_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUri() {
    return uri;
  }


  @JsonProperty(JSON_PROPERTY_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUri(String uri) {
    this.uri = uri;
  }


  /**
   * Return true if this TexmlCreateCallRecordingResponseBody object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TexmlCreateCallRecordingResponseBody texmlCreateCallRecordingResponseBody = (TexmlCreateCallRecordingResponseBody) o;
    return Objects.equals(this.accountSid, texmlCreateCallRecordingResponseBody.accountSid) &&
        Objects.equals(this.callSid, texmlCreateCallRecordingResponseBody.callSid) &&
        equalsNullable(this.conferenceSid, texmlCreateCallRecordingResponseBody.conferenceSid) &&
        Objects.equals(this.channels, texmlCreateCallRecordingResponseBody.channels) &&
        Objects.equals(this.dateCreated, texmlCreateCallRecordingResponseBody.dateCreated) &&
        Objects.equals(this.dateUpdated, texmlCreateCallRecordingResponseBody.dateUpdated) &&
        Objects.equals(this.startTime, texmlCreateCallRecordingResponseBody.startTime) &&
        equalsNullable(this.price, texmlCreateCallRecordingResponseBody.price) &&
        equalsNullable(this.priceUnit, texmlCreateCallRecordingResponseBody.priceUnit) &&
        equalsNullable(this.duration, texmlCreateCallRecordingResponseBody.duration) &&
        Objects.equals(this.sid, texmlCreateCallRecordingResponseBody.sid) &&
        Objects.equals(this.source, texmlCreateCallRecordingResponseBody.source) &&
        equalsNullable(this.errorCode, texmlCreateCallRecordingResponseBody.errorCode) &&
        Objects.equals(this.track, texmlCreateCallRecordingResponseBody.track) &&
        Objects.equals(this.uri, texmlCreateCallRecordingResponseBody.uri);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountSid, callSid, hashCodeNullable(conferenceSid), channels, dateCreated, dateUpdated, startTime, hashCodeNullable(price), hashCodeNullable(priceUnit), hashCodeNullable(duration), sid, source, hashCodeNullable(errorCode), track, uri);
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
    sb.append("class TexmlCreateCallRecordingResponseBody {\n");
    sb.append("    accountSid: ").append(toIndentedString(accountSid)).append("\n");
    sb.append("    callSid: ").append(toIndentedString(callSid)).append("\n");
    sb.append("    conferenceSid: ").append(toIndentedString(conferenceSid)).append("\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    priceUnit: ").append(toIndentedString(priceUnit)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    track: ").append(toIndentedString(track)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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

