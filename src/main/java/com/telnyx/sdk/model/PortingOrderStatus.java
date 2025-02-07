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
import com.telnyx.sdk.model.PortingOrdersExceptionType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * Porting order status
 */
@ApiModel(description = "Porting order status")
@JsonPropertyOrder({
  PortingOrderStatus.JSON_PROPERTY_DETAILS,
  PortingOrderStatus.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class PortingOrderStatus {
  public static final String JSON_PROPERTY_DETAILS = "details";
  private List<PortingOrdersExceptionType> details = null;

  /**
   * The current status of the porting order
   */
  public enum ValueEnum {
    DRAFT(String.valueOf("draft")),
    
    IN_PROCESS(String.valueOf("in-process")),
    
    SUBMITTED(String.valueOf("submitted")),
    
    EXCEPTION(String.valueOf("exception")),
    
    FOC_DATE_CONFIRMED(String.valueOf("foc-date-confirmed")),
    
    PORTED(String.valueOf("ported")),
    
    CANCELLED(String.valueOf("cancelled")),
    
    CANCEL_PENDING(String.valueOf("cancel-pending"));

    private String value;

    ValueEnum(String value) {
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
    public static ValueEnum fromValue(String value) {
      for (ValueEnum b : ValueEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_VALUE = "value";
  private ValueEnum value;

  public PortingOrderStatus() { 
  }

  public PortingOrderStatus details(List<PortingOrdersExceptionType> details) {
    this.details = details;
    return this;
  }

  public PortingOrderStatus adddetailsItem(PortingOrdersExceptionType detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * A list of 0 or more details about this porting order&#39;s status
   * @return details
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A list of 0 or more details about this porting order's status")
  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PortingOrdersExceptionType> getDetails() {
    return details;
  }


  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDetails(List<PortingOrdersExceptionType> details) {
    this.details = details;
  }


  public PortingOrderStatus value(ValueEnum value) {
    this.value = value;
    return this;
  }

   /**
   * The current status of the porting order
   * @return value
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "ported", value = "The current status of the porting order")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ValueEnum getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(ValueEnum value) {
    this.value = value;
  }


  /**
   * Return true if this PortingOrderStatus object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortingOrderStatus portingOrderStatus = (PortingOrderStatus) o;
    return Objects.equals(this.details, portingOrderStatus.details) &&
        Objects.equals(this.value, portingOrderStatus.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(details, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortingOrderStatus {\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

