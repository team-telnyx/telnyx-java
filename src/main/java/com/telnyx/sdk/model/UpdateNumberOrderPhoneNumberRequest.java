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
 * UpdateNumberOrderPhoneNumberRequest
 */
@JsonPropertyOrder({
  UpdateNumberOrderPhoneNumberRequest.JSON_PROPERTY_REGULATORY_REQUIREMENTS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class UpdateNumberOrderPhoneNumberRequest {
  public static final String JSON_PROPERTY_REGULATORY_REQUIREMENTS = "regulatory_requirements";
  private List<UpdateRegulatoryRequirement> regulatoryRequirements = null;

  public UpdateNumberOrderPhoneNumberRequest() { 
  }

  public UpdateNumberOrderPhoneNumberRequest regulatoryRequirements(List<UpdateRegulatoryRequirement> regulatoryRequirements) {
    this.regulatoryRequirements = regulatoryRequirements;
    return this;
  }

  public UpdateNumberOrderPhoneNumberRequest addregulatoryRequirementsItem(UpdateRegulatoryRequirement regulatoryRequirementsItem) {
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


  /**
   * Return true if this UpdateNumberOrderPhoneNumberRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateNumberOrderPhoneNumberRequest updateNumberOrderPhoneNumberRequest = (UpdateNumberOrderPhoneNumberRequest) o;
    return Objects.equals(this.regulatoryRequirements, updateNumberOrderPhoneNumberRequest.regulatoryRequirements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regulatoryRequirements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateNumberOrderPhoneNumberRequest {\n");
    sb.append("    regulatoryRequirements: ").append(toIndentedString(regulatoryRequirements)).append("\n");
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

