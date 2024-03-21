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
import com.telnyx.sdk.model.PortingOrderType;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.telnyx.sdk.JSON;


/**
 * PortingOrderMisc
 */
@JsonPropertyOrder({
  PortingOrderMisc.JSON_PROPERTY_TYPE,
  PortingOrderMisc.JSON_PROPERTY_REMAINING_NUMBERS_ACTION,
  PortingOrderMisc.JSON_PROPERTY_NEW_BILLING_PHONE_NUMBER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class PortingOrderMisc {
  public static final String JSON_PROPERTY_TYPE = "type";
  private PortingOrderType type;

  /**
   * Remaining numbers can be either kept with their current service provider or disconnected. &#39;new_billing_telephone_number&#39; is required when &#39;remaining_numbers_action&#39; is &#39;keep&#39;.
   */
  public enum RemainingNumbersActionEnum {
    KEEP("keep"),
    
    DISCONNECT("disconnect");

    private String value;

    RemainingNumbersActionEnum(String value) {
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
    public static RemainingNumbersActionEnum fromValue(String value) {
      for (RemainingNumbersActionEnum b : RemainingNumbersActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_REMAINING_NUMBERS_ACTION = "remaining_numbers_action";
  private RemainingNumbersActionEnum remainingNumbersAction;

  public static final String JSON_PROPERTY_NEW_BILLING_PHONE_NUMBER = "new_billing_phone_number";
  private String newBillingPhoneNumber;

  public PortingOrderMisc() { 
  }

  public PortingOrderMisc type(PortingOrderType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PortingOrderType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(PortingOrderType type) {
    this.type = type;
  }


  public PortingOrderMisc remainingNumbersAction(RemainingNumbersActionEnum remainingNumbersAction) {
    this.remainingNumbersAction = remainingNumbersAction;
    return this;
  }

   /**
   * Remaining numbers can be either kept with their current service provider or disconnected. &#39;new_billing_telephone_number&#39; is required when &#39;remaining_numbers_action&#39; is &#39;keep&#39;.
   * @return remainingNumbersAction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "disconnect", value = "Remaining numbers can be either kept with their current service provider or disconnected. 'new_billing_telephone_number' is required when 'remaining_numbers_action' is 'keep'.")
  @JsonProperty(JSON_PROPERTY_REMAINING_NUMBERS_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RemainingNumbersActionEnum getRemainingNumbersAction() {
    return remainingNumbersAction;
  }


  @JsonProperty(JSON_PROPERTY_REMAINING_NUMBERS_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemainingNumbersAction(RemainingNumbersActionEnum remainingNumbersAction) {
    this.remainingNumbersAction = remainingNumbersAction;
  }


  public PortingOrderMisc newBillingPhoneNumber(String newBillingPhoneNumber) {
    this.newBillingPhoneNumber = newBillingPhoneNumber;
    return this;
  }

   /**
   * New billing phone number for the remaining numbers. Used in case the current billing phone number is being ported to Telnyx. This will be set on your account with your current service provider and should be one of the numbers remaining on that account.
   * @return newBillingPhoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "New billing phone number for the remaining numbers. Used in case the current billing phone number is being ported to Telnyx. This will be set on your account with your current service provider and should be one of the numbers remaining on that account.")
  @JsonProperty(JSON_PROPERTY_NEW_BILLING_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNewBillingPhoneNumber() {
    return newBillingPhoneNumber;
  }


  @JsonProperty(JSON_PROPERTY_NEW_BILLING_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNewBillingPhoneNumber(String newBillingPhoneNumber) {
    this.newBillingPhoneNumber = newBillingPhoneNumber;
  }


  /**
   * Return true if this PortingOrderMisc object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortingOrderMisc portingOrderMisc = (PortingOrderMisc) o;
    return Objects.equals(this.type, portingOrderMisc.type) &&
        Objects.equals(this.remainingNumbersAction, portingOrderMisc.remainingNumbersAction) &&
        Objects.equals(this.newBillingPhoneNumber, portingOrderMisc.newBillingPhoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, remainingNumbersAction, newBillingPhoneNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortingOrderMisc {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    remainingNumbersAction: ").append(toIndentedString(remainingNumbersAction)).append("\n");
    sb.append("    newBillingPhoneNumber: ").append(toIndentedString(newBillingPhoneNumber)).append("\n");
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

