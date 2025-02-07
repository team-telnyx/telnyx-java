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
import com.telnyx.sdk.model.CreateRequirementGroupRequestRegulatoryRequirementsInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * CreateRequirementGroupRequest
 */
@JsonPropertyOrder({
  CreateRequirementGroupRequest.JSON_PROPERTY_COUNTRY_CODE,
  CreateRequirementGroupRequest.JSON_PROPERTY_PHONE_NUMBER_TYPE,
  CreateRequirementGroupRequest.JSON_PROPERTY_ACTION,
  CreateRequirementGroupRequest.JSON_PROPERTY_CUSTOMER_REFERENCE,
  CreateRequirementGroupRequest.JSON_PROPERTY_REGULATORY_REQUIREMENTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class CreateRequirementGroupRequest {
  public static final String JSON_PROPERTY_COUNTRY_CODE = "country_code";
  private String countryCode;

  /**
   * Gets or Sets phoneNumberType
   */
  public enum PhoneNumberTypeEnum {
    LOCAL(String.valueOf("local")),
    
    TOLL_FREE(String.valueOf("toll_free")),
    
    MOBILE(String.valueOf("mobile")),
    
    NATIONAL(String.valueOf("national")),
    
    SHARED_COST(String.valueOf("shared_cost"));

    private String value;

    PhoneNumberTypeEnum(String value) {
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
    public static PhoneNumberTypeEnum fromValue(String value) {
      for (PhoneNumberTypeEnum b : PhoneNumberTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PHONE_NUMBER_TYPE = "phone_number_type";
  private PhoneNumberTypeEnum phoneNumberType;

  /**
   * Gets or Sets action
   */
  public enum ActionEnum {
    ORDERING(String.valueOf("ordering")),
    
    PORTING(String.valueOf("porting"));

    private String value;

    ActionEnum(String value) {
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
    public static ActionEnum fromValue(String value) {
      for (ActionEnum b : ActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ACTION = "action";
  private ActionEnum action;

  public static final String JSON_PROPERTY_CUSTOMER_REFERENCE = "customer_reference";
  private String customerReference;

  public static final String JSON_PROPERTY_REGULATORY_REQUIREMENTS = "regulatory_requirements";
  private List<CreateRequirementGroupRequestRegulatoryRequirementsInner> regulatoryRequirements = null;

  public CreateRequirementGroupRequest() { 
  }

  public CreateRequirementGroupRequest countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * ISO alpha 2 country code
   * @return countryCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "US", required = true, value = "ISO alpha 2 country code")
  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCountryCode() {
    return countryCode;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public CreateRequirementGroupRequest phoneNumberType(PhoneNumberTypeEnum phoneNumberType) {
    this.phoneNumberType = phoneNumberType;
    return this;
  }

   /**
   * Get phoneNumberType
   * @return phoneNumberType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "local", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PhoneNumberTypeEnum getPhoneNumberType() {
    return phoneNumberType;
  }


  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPhoneNumberType(PhoneNumberTypeEnum phoneNumberType) {
    this.phoneNumberType = phoneNumberType;
  }


  public CreateRequirementGroupRequest action(ActionEnum action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ordering", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ActionEnum getAction() {
    return action;
  }


  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAction(ActionEnum action) {
    this.action = action;
  }


  public CreateRequirementGroupRequest customerReference(String customerReference) {
    this.customerReference = customerReference;
    return this;
  }

   /**
   * Get customerReference
   * @return customerReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My Requirement Group", value = "")
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


  public CreateRequirementGroupRequest regulatoryRequirements(List<CreateRequirementGroupRequestRegulatoryRequirementsInner> regulatoryRequirements) {
    this.regulatoryRequirements = regulatoryRequirements;
    return this;
  }

  public CreateRequirementGroupRequest addregulatoryRequirementsItem(CreateRequirementGroupRequestRegulatoryRequirementsInner regulatoryRequirementsItem) {
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REGULATORY_REQUIREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CreateRequirementGroupRequestRegulatoryRequirementsInner> getRegulatoryRequirements() {
    return regulatoryRequirements;
  }


  @JsonProperty(JSON_PROPERTY_REGULATORY_REQUIREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegulatoryRequirements(List<CreateRequirementGroupRequestRegulatoryRequirementsInner> regulatoryRequirements) {
    this.regulatoryRequirements = regulatoryRequirements;
  }


  /**
   * Return true if this CreateRequirementGroup_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRequirementGroupRequest createRequirementGroupRequest = (CreateRequirementGroupRequest) o;
    return Objects.equals(this.countryCode, createRequirementGroupRequest.countryCode) &&
        Objects.equals(this.phoneNumberType, createRequirementGroupRequest.phoneNumberType) &&
        Objects.equals(this.action, createRequirementGroupRequest.action) &&
        Objects.equals(this.customerReference, createRequirementGroupRequest.customerReference) &&
        Objects.equals(this.regulatoryRequirements, createRequirementGroupRequest.regulatoryRequirements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, phoneNumberType, action, customerReference, regulatoryRequirements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRequirementGroupRequest {\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    phoneNumberType: ").append(toIndentedString(phoneNumberType)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
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

