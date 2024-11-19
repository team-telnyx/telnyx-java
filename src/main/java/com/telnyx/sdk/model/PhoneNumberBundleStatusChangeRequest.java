/*
 * Telnyx API
 * Notifications and Notification Settings.
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
 * PhoneNumberBundleStatusChangeRequest
 */
@JsonPropertyOrder({
  PhoneNumberBundleStatusChangeRequest.JSON_PROPERTY_BUNDLE_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class PhoneNumberBundleStatusChangeRequest {
  public static final String JSON_PROPERTY_BUNDLE_ID = "bundle_id";
  private String bundleId;

  public PhoneNumberBundleStatusChangeRequest() { 
  }

  public PhoneNumberBundleStatusChangeRequest bundleId(String bundleId) {
    this.bundleId = bundleId;
    return this;
  }

   /**
   * The new bundle_id setting for the number. If you are assigning the number to a bundle, this is the unique ID of the bundle you wish to use. If you are removing the number from a bundle, this must be null. You cannot assign a number from one bundle to another directly. You must first remove it from a bundle, and then assign it to a new bundle.
   * @return bundleId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The new bundle_id setting for the number. If you are assigning the number to a bundle, this is the unique ID of the bundle you wish to use. If you are removing the number from a bundle, this must be null. You cannot assign a number from one bundle to another directly. You must first remove it from a bundle, and then assign it to a new bundle.")
  @JsonProperty(JSON_PROPERTY_BUNDLE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBundleId() {
    return bundleId;
  }


  @JsonProperty(JSON_PROPERTY_BUNDLE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBundleId(String bundleId) {
    this.bundleId = bundleId;
  }


  /**
   * Return true if this PhoneNumberBundleStatusChangeRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneNumberBundleStatusChangeRequest phoneNumberBundleStatusChangeRequest = (PhoneNumberBundleStatusChangeRequest) o;
    return Objects.equals(this.bundleId, phoneNumberBundleStatusChangeRequest.bundleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bundleId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneNumberBundleStatusChangeRequest {\n");
    sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
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

