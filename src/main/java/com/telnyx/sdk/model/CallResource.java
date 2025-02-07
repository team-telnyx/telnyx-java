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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * CallResource
 */
@JsonPropertyOrder({
  CallResource.JSON_PROPERTY_ACCOUNT_SID,
  CallResource.JSON_PROPERTY_ANSWERED_BY,
  CallResource.JSON_PROPERTY_CALLER_NAME,
  CallResource.JSON_PROPERTY_DATE_CREATED,
  CallResource.JSON_PROPERTY_DATE_UPDATED,
  CallResource.JSON_PROPERTY_DIRECTION,
  CallResource.JSON_PROPERTY_DURATION,
  CallResource.JSON_PROPERTY_END_TIME,
  CallResource.JSON_PROPERTY_FROM,
  CallResource.JSON_PROPERTY_FROM_FORMATTED,
  CallResource.JSON_PROPERTY_PRICE,
  CallResource.JSON_PROPERTY_PRICE_UNIT,
  CallResource.JSON_PROPERTY_SID,
  CallResource.JSON_PROPERTY_START_TIME,
  CallResource.JSON_PROPERTY_STATUS,
  CallResource.JSON_PROPERTY_TO,
  CallResource.JSON_PROPERTY_TO_FORMATTED,
  CallResource.JSON_PROPERTY_URI
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class CallResource {
  public static final String JSON_PROPERTY_ACCOUNT_SID = "account_sid";
  private String accountSid;

  /**
   * The value of the answering machine detection result, if this feature was enabled for the call.
   */
  public enum AnsweredByEnum {
    HUMAN(String.valueOf("human")),
    
    MACHINE(String.valueOf("machine")),
    
    NOT_SURE(String.valueOf("not_sure"));

    private String value;

    AnsweredByEnum(String value) {
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
    public static AnsweredByEnum fromValue(String value) {
      for (AnsweredByEnum b : AnsweredByEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ANSWERED_BY = "answered_by";
  private AnsweredByEnum answeredBy;

  public static final String JSON_PROPERTY_CALLER_NAME = "caller_name";
  private String callerName;

  public static final String JSON_PROPERTY_DATE_CREATED = "date_created";
  private String dateCreated;

  public static final String JSON_PROPERTY_DATE_UPDATED = "date_updated";
  private String dateUpdated;

  /**
   * The direction of this call.
   */
  public enum DirectionEnum {
    INBOUND(String.valueOf("inbound")),
    
    OUTBOUND(String.valueOf("outbound"));

    private String value;

    DirectionEnum(String value) {
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
    public static DirectionEnum fromValue(String value) {
      for (DirectionEnum b : DirectionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DIRECTION = "direction";
  private DirectionEnum direction;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private String duration;

  public static final String JSON_PROPERTY_END_TIME = "end_time";
  private String endTime;

  public static final String JSON_PROPERTY_FROM = "from";
  private String from;

  public static final String JSON_PROPERTY_FROM_FORMATTED = "from_formatted";
  private String fromFormatted;

  public static final String JSON_PROPERTY_PRICE = "price";
  private String price;

  public static final String JSON_PROPERTY_PRICE_UNIT = "price_unit";
  private String priceUnit;

  public static final String JSON_PROPERTY_SID = "sid";
  private String sid;

  public static final String JSON_PROPERTY_START_TIME = "start_time";
  private String startTime;

  /**
   * The status of this call.
   */
  public enum StatusEnum {
    RINGING(String.valueOf("ringing")),
    
    IN_PROGRESS(String.valueOf("in-progress")),
    
    CANCELED(String.valueOf("canceled")),
    
    COMPLETED(String.valueOf("completed")),
    
    FAILED(String.valueOf("failed")),
    
    BUSY(String.valueOf("busy")),
    
    NO_ANSWER(String.valueOf("no-answer"));

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public static final String JSON_PROPERTY_TO = "to";
  private String to;

  public static final String JSON_PROPERTY_TO_FORMATTED = "to_formatted";
  private String toFormatted;

  public static final String JSON_PROPERTY_URI = "uri";
  private String uri;

  public CallResource() { 
  }

  public CallResource accountSid(String accountSid) {
    this.accountSid = accountSid;
    return this;
  }

   /**
   * The id of the account the resource belongs to.
   * @return accountSid
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "61bf923e-5e4d-4595-a110-56190ea18a1b", value = "The id of the account the resource belongs to.")
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


  public CallResource answeredBy(AnsweredByEnum answeredBy) {
    this.answeredBy = answeredBy;
    return this;
  }

   /**
   * The value of the answering machine detection result, if this feature was enabled for the call.
   * @return answeredBy
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "human", value = "The value of the answering machine detection result, if this feature was enabled for the call.")
  @JsonProperty(JSON_PROPERTY_ANSWERED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AnsweredByEnum getAnsweredBy() {
    return answeredBy;
  }


  @JsonProperty(JSON_PROPERTY_ANSWERED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnsweredBy(AnsweredByEnum answeredBy) {
    this.answeredBy = answeredBy;
  }


  public CallResource callerName(String callerName) {
    this.callerName = callerName;
    return this;
  }

   /**
   * Caller ID, if present.
   * @return callerName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "CALLER", value = "Caller ID, if present.")
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


  public CallResource dateCreated(String dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * The timestamp of when the resource was created.
   * @return dateCreated
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Thu, 15 Jun 2023 09:56:45 +0000", value = "The timestamp of when the resource was created.")
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


  public CallResource dateUpdated(String dateUpdated) {
    this.dateUpdated = dateUpdated;
    return this;
  }

   /**
   * The timestamp of when the resource was last updated.
   * @return dateUpdated
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Thu, 15 Jun 2023 09:56:45 +0000", value = "The timestamp of when the resource was last updated.")
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


  public CallResource direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }

   /**
   * The direction of this call.
   * @return direction
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "inbound", value = "The direction of this call.")
  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DirectionEnum getDirection() {
    return direction;
  }


  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }


  public CallResource duration(String duration) {
    this.duration = duration;
    return this;
  }

   /**
   * The duration of this call, given in seconds.
   * @return duration
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "12", value = "The duration of this call, given in seconds.")
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDuration() {
    return duration;
  }


  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDuration(String duration) {
    this.duration = duration;
  }


  public CallResource endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * The end time of this call.
   * @return endTime
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Thu, 15 Jun 2023 09:56:45 +0000", value = "The end time of this call.")
  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEndTime() {
    return endTime;
  }


  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public CallResource from(String from) {
    this.from = from;
    return this;
  }

   /**
   * The phone number or SIP address that made this call.
   * @return from
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "+13123456789", value = "The phone number or SIP address that made this call.")
  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFrom() {
    return from;
  }


  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFrom(String from) {
    this.from = from;
  }


  public CallResource fromFormatted(String fromFormatted) {
    this.fromFormatted = fromFormatted;
    return this;
  }

   /**
   * The from number formatted for display.
   * @return fromFormatted
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "(312) 345-6789", value = "The from number formatted for display.")
  @JsonProperty(JSON_PROPERTY_FROM_FORMATTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFromFormatted() {
    return fromFormatted;
  }


  @JsonProperty(JSON_PROPERTY_FROM_FORMATTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFromFormatted(String fromFormatted) {
    this.fromFormatted = fromFormatted;
  }


  public CallResource price(String price) {
    this.price = price;
    return this;
  }

   /**
   * The price of this call, the currency is specified in the price_unit field. Only populated when the call cost feature is enabled for the account.
   * @return price
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "0.10", value = "The price of this call, the currency is specified in the price_unit field. Only populated when the call cost feature is enabled for the account.")
  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrice() {
    return price;
  }


  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrice(String price) {
    this.price = price;
  }


  public CallResource priceUnit(String priceUnit) {
    this.priceUnit = priceUnit;
    return this;
  }

   /**
   * The unit in which the price is given.
   * @return priceUnit
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "The unit in which the price is given.")
  @JsonProperty(JSON_PROPERTY_PRICE_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPriceUnit() {
    return priceUnit;
  }


  @JsonProperty(JSON_PROPERTY_PRICE_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceUnit(String priceUnit) {
    this.priceUnit = priceUnit;
  }


  public CallResource sid(String sid) {
    this.sid = sid;
    return this;
  }

   /**
   * The identifier of this call.
   * @return sid
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA", value = "The identifier of this call.")
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


  public CallResource startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * The start time of this call.
   * @return startTime
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Thu, 15 Jun 2023 09:56:45 +0000", value = "The start time of this call.")
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


  public CallResource status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of this call.
   * @return status
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "completed'", value = "The status of this call.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public CallResource to(String to) {
    this.to = to;
    return this;
  }

   /**
   * The phone number or SIP address that received this call.
   * @return to
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "+13987654321", value = "The phone number or SIP address that received this call.")
  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTo() {
    return to;
  }


  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTo(String to) {
    this.to = to;
  }


  public CallResource toFormatted(String toFormatted) {
    this.toFormatted = toFormatted;
    return this;
  }

   /**
   * The to number formatted for display.
   * @return toFormatted
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "(398) 765-4321", value = "The to number formatted for display.")
  @JsonProperty(JSON_PROPERTY_TO_FORMATTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getToFormatted() {
    return toFormatted;
  }


  @JsonProperty(JSON_PROPERTY_TO_FORMATTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToFormatted(String toFormatted) {
    this.toFormatted = toFormatted;
  }


  public CallResource uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * The relative URI for this call.
   * @return uri
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Calls/v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA.json", value = "The relative URI for this call.")
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
   * Return true if this CallResource object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallResource callResource = (CallResource) o;
    return Objects.equals(this.accountSid, callResource.accountSid) &&
        Objects.equals(this.answeredBy, callResource.answeredBy) &&
        Objects.equals(this.callerName, callResource.callerName) &&
        Objects.equals(this.dateCreated, callResource.dateCreated) &&
        Objects.equals(this.dateUpdated, callResource.dateUpdated) &&
        Objects.equals(this.direction, callResource.direction) &&
        Objects.equals(this.duration, callResource.duration) &&
        Objects.equals(this.endTime, callResource.endTime) &&
        Objects.equals(this.from, callResource.from) &&
        Objects.equals(this.fromFormatted, callResource.fromFormatted) &&
        Objects.equals(this.price, callResource.price) &&
        Objects.equals(this.priceUnit, callResource.priceUnit) &&
        Objects.equals(this.sid, callResource.sid) &&
        Objects.equals(this.startTime, callResource.startTime) &&
        Objects.equals(this.status, callResource.status) &&
        Objects.equals(this.to, callResource.to) &&
        Objects.equals(this.toFormatted, callResource.toFormatted) &&
        Objects.equals(this.uri, callResource.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountSid, answeredBy, callerName, dateCreated, dateUpdated, direction, duration, endTime, from, fromFormatted, price, priceUnit, sid, startTime, status, to, toFormatted, uri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallResource {\n");
    sb.append("    accountSid: ").append(toIndentedString(accountSid)).append("\n");
    sb.append("    answeredBy: ").append(toIndentedString(answeredBy)).append("\n");
    sb.append("    callerName: ").append(toIndentedString(callerName)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    fromFormatted: ").append(toIndentedString(fromFormatted)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    priceUnit: ").append(toIndentedString(priceUnit)).append("\n");
    sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    toFormatted: ").append(toIndentedString(toFormatted)).append("\n");
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

