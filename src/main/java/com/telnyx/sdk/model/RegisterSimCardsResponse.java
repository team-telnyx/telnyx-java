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
import com.telnyx.sdk.model.Error;
import com.telnyx.sdk.model.SimpleSIMCard;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * RegisterSimCardsResponse
 */
@JsonPropertyOrder({
  RegisterSimCardsResponse.JSON_PROPERTY_DATA,
  RegisterSimCardsResponse.JSON_PROPERTY_ERRORS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RegisterSimCardsResponse {
  public static final String JSON_PROPERTY_DATA = "data";
  private List<SimpleSIMCard> data = null;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<Error> errors = null;

  public RegisterSimCardsResponse() { 
  }

  public RegisterSimCardsResponse data(List<SimpleSIMCard> data) {
    this.data = data;
    return this;
  }

  public RegisterSimCardsResponse addDataItem(SimpleSIMCard dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Successfully registered SIM cards.
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Successfully registered SIM cards.")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SimpleSIMCard> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(List<SimpleSIMCard> data) {
    this.data = data;
  }


  public RegisterSimCardsResponse errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public RegisterSimCardsResponse addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Error> getErrors() {
    return errors;
  }


  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }


  /**
   * Return true if this Register_SimCards_Response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegisterSimCardsResponse registerSimCardsResponse = (RegisterSimCardsResponse) o;
    return Objects.equals(this.data, registerSimCardsResponse.data) &&
        Objects.equals(this.errors, registerSimCardsResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterSimCardsResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

