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
import com.telnyx.sdk.model.VerifyPortingVerificationCodesRequestVerificationCodesInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * VerifyPortingVerificationCodesRequest
 */
@JsonPropertyOrder({
  VerifyPortingVerificationCodesRequest.JSON_PROPERTY_VERIFICATION_CODES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class VerifyPortingVerificationCodesRequest {
  public static final String JSON_PROPERTY_VERIFICATION_CODES = "verification_codes";
  private List<VerifyPortingVerificationCodesRequestVerificationCodesInner> verificationCodes = null;

  public VerifyPortingVerificationCodesRequest() { 
  }

  public VerifyPortingVerificationCodesRequest verificationCodes(List<VerifyPortingVerificationCodesRequestVerificationCodesInner> verificationCodes) {
    this.verificationCodes = verificationCodes;
    return this;
  }

  public VerifyPortingVerificationCodesRequest addverificationCodesItem(VerifyPortingVerificationCodesRequestVerificationCodesInner verificationCodesItem) {
    if (this.verificationCodes == null) {
      this.verificationCodes = new ArrayList<>();
    }
    this.verificationCodes.add(verificationCodesItem);
    return this;
  }

   /**
   * Get verificationCodes
   * @return verificationCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VERIFICATION_CODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<VerifyPortingVerificationCodesRequestVerificationCodesInner> getVerificationCodes() {
    return verificationCodes;
  }


  @JsonProperty(JSON_PROPERTY_VERIFICATION_CODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVerificationCodes(List<VerifyPortingVerificationCodesRequestVerificationCodesInner> verificationCodes) {
    this.verificationCodes = verificationCodes;
  }


  /**
   * Return true if this VerifyPortingVerificationCodes_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifyPortingVerificationCodesRequest verifyPortingVerificationCodesRequest = (VerifyPortingVerificationCodesRequest) o;
    return Objects.equals(this.verificationCodes, verifyPortingVerificationCodesRequest.verificationCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(verificationCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyPortingVerificationCodesRequest {\n");
    sb.append("    verificationCodes: ").append(toIndentedString(verificationCodes)).append("\n");
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

