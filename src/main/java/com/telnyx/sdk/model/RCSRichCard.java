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
import com.telnyx.sdk.model.RCSCarouselCard;
import com.telnyx.sdk.model.RCSStandaloneCard;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * RCSRichCard
 */
@JsonPropertyOrder({
  RCSRichCard.JSON_PROPERTY_CAROUSEL_CARD,
  RCSRichCard.JSON_PROPERTY_STANDALONE_CARD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class RCSRichCard {
  public static final String JSON_PROPERTY_CAROUSEL_CARD = "carousel_card";
  private RCSCarouselCard carouselCard;

  public static final String JSON_PROPERTY_STANDALONE_CARD = "standalone_card";
  private RCSStandaloneCard standaloneCard;

  public RCSRichCard() { 
  }

  public RCSRichCard carouselCard(RCSCarouselCard carouselCard) {
    this.carouselCard = carouselCard;
    return this;
  }

   /**
   * Get carouselCard
   * @return carouselCard
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAROUSEL_CARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RCSCarouselCard getCarouselCard() {
    return carouselCard;
  }


  @JsonProperty(JSON_PROPERTY_CAROUSEL_CARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCarouselCard(RCSCarouselCard carouselCard) {
    this.carouselCard = carouselCard;
  }


  public RCSRichCard standaloneCard(RCSStandaloneCard standaloneCard) {
    this.standaloneCard = standaloneCard;
    return this;
  }

   /**
   * Get standaloneCard
   * @return standaloneCard
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STANDALONE_CARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RCSStandaloneCard getStandaloneCard() {
    return standaloneCard;
  }


  @JsonProperty(JSON_PROPERTY_STANDALONE_CARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStandaloneCard(RCSStandaloneCard standaloneCard) {
    this.standaloneCard = standaloneCard;
  }


  /**
   * Return true if this RCSRichCard object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RCSRichCard rcSRichCard = (RCSRichCard) o;
    return Objects.equals(this.carouselCard, rcSRichCard.carouselCard) &&
        Objects.equals(this.standaloneCard, rcSRichCard.standaloneCard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carouselCard, standaloneCard);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RCSRichCard {\n");
    sb.append("    carouselCard: ").append(toIndentedString(carouselCard)).append("\n");
    sb.append("    standaloneCard: ").append(toIndentedString(standaloneCard)).append("\n");
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

