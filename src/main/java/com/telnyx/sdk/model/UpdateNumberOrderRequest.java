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
import com.telnyx.sdk.model.UpdateRegulatoryRequirement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * UpdateNumberOrderRequest
 */
@JsonPropertyOrder({
  UpdateNumberOrderRequest.JSON_PROPERTY_REGULATORY_REQUIREMENTS,
  UpdateNumberOrderRequest.JSON_PROPERTY_CUSTOMER_REFERENCE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class UpdateNumberOrderRequest {
  public static final String JSON_PROPERTY_REGULATORY_REQUIREMENTS = "regulatory_requirements";
  private List<UpdateRegulatoryRequirement> regulatoryRequirements = null;

  public static final String JSON_PROPERTY_CUSTOMER_REFERENCE = "customer_reference";
  private String customerReference;

  public UpdateNumberOrderRequest() { 
  }

  public UpdateNumberOrderRequest regulatoryRequirements(List<UpdateRegulatoryRequirement> regulatoryRequirements) {
    this.regulatoryRequirements = regulatoryRequirements;
    return this;
  }

  public UpdateNumberOrderRequest addregulatoryRequirementsItem(UpdateRegulatoryRequirement regulatoryRequirementsItem) {
    if (this.regulatoryRequirements == null) {
      this.regulatoryRequirements = new ArrayList<>();
    }
    this.regulatoryRequirements.add(regulatoryRequirementsItem);
    return this;
  }

   /**
   * Get regulatoryRequirements
   * @return regulatoryRequirements
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REGULATORY_REQUIREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UpdateRegulatoryRequirement> getRegulatoryRequirements() {
    return regulatoryRequirements;
  }


  @JsonProperty(JSON_PROPERTY_REGULATORY_REQUIREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegulatoryRequirements(List<UpdateRegulatoryRequirement> regulatoryRequirements) {
    this.regulatoryRequirements = regulatoryRequirements;
  }


  public UpdateNumberOrderRequest customerReference(String customerReference) {
    this.customerReference = customerReference;
    return this;
  }

   /**
   * A customer reference string for customer look ups.
   * @return customerReference
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "MY REF 001", value = "A customer reference string for customer look ups.")
  @JsonProperty(JSON_PROPERTY_CUSTOMER_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomerReference() {
    return customerReference;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * Return true if this UpdateNumberOrderRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateNumberOrderRequest updateNumberOrderRequest = (UpdateNumberOrderRequest) o;
    return Objects.equals(this.regulatoryRequirements, updateNumberOrderRequest.regulatoryRequirements) &&
        Objects.equals(this.customerReference, updateNumberOrderRequest.customerReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regulatoryRequirements, customerReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateNumberOrderRequest {\n");
    sb.append("    regulatoryRequirements: ").append(toIndentedString(regulatoryRequirements)).append("\n");
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
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

