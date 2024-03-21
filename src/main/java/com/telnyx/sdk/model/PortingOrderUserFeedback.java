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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.telnyx.sdk.JSON;


/**
 * PortingOrderUserFeedback
 */
@JsonPropertyOrder({
  PortingOrderUserFeedback.JSON_PROPERTY_USER_RATING,
  PortingOrderUserFeedback.JSON_PROPERTY_USER_COMMENT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class PortingOrderUserFeedback {
  public static final String JSON_PROPERTY_USER_RATING = "user_rating";
  private Integer userRating;

  public static final String JSON_PROPERTY_USER_COMMENT = "user_comment";
  private String userComment;

  public PortingOrderUserFeedback() { 
  }

  public PortingOrderUserFeedback userRating(Integer userRating) {
    this.userRating = userRating;
    return this;
  }

   /**
   * Once an order is ported, cancellation is requested or the request is canceled, the user may rate their experience
   * @return userRating
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "Once an order is ported, cancellation is requested or the request is canceled, the user may rate their experience")
  @JsonProperty(JSON_PROPERTY_USER_RATING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUserRating() {
    return userRating;
  }


  @JsonProperty(JSON_PROPERTY_USER_RATING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserRating(Integer userRating) {
    this.userRating = userRating;
  }


  public PortingOrderUserFeedback userComment(String userComment) {
    this.userComment = userComment;
    return this;
  }

   /**
   * A comment related to the customer rating.
   * @return userComment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "I loved my experience porting numbers with Telnyx", value = "A comment related to the customer rating.")
  @JsonProperty(JSON_PROPERTY_USER_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserComment() {
    return userComment;
  }


  @JsonProperty(JSON_PROPERTY_USER_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserComment(String userComment) {
    this.userComment = userComment;
  }


  /**
   * Return true if this PortingOrderUserFeedback object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortingOrderUserFeedback portingOrderUserFeedback = (PortingOrderUserFeedback) o;
    return Objects.equals(this.userRating, portingOrderUserFeedback.userRating) &&
        Objects.equals(this.userComment, portingOrderUserFeedback.userComment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userRating, userComment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortingOrderUserFeedback {\n");
    sb.append("    userRating: ").append(toIndentedString(userRating)).append("\n");
    sb.append("    userComment: ").append(toIndentedString(userComment)).append("\n");
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

