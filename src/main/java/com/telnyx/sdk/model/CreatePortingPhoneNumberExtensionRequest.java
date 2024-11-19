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
import com.telnyx.sdk.model.CreatePortingPhoneNumberExtensionRequestActivationRangesInner;
import com.telnyx.sdk.model.CreatePortingPhoneNumberExtensionRequestExtensionRange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * CreatePortingPhoneNumberExtensionRequest
 */
@JsonPropertyOrder({
  CreatePortingPhoneNumberExtensionRequest.JSON_PROPERTY_PORTING_PHONE_NUMBER_ID,
  CreatePortingPhoneNumberExtensionRequest.JSON_PROPERTY_EXTENSION_RANGE,
  CreatePortingPhoneNumberExtensionRequest.JSON_PROPERTY_ACTIVATION_RANGES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class CreatePortingPhoneNumberExtensionRequest {
  public static final String JSON_PROPERTY_PORTING_PHONE_NUMBER_ID = "porting_phone_number_id";
  private UUID portingPhoneNumberId;

  public static final String JSON_PROPERTY_EXTENSION_RANGE = "extension_range";
  private CreatePortingPhoneNumberExtensionRequestExtensionRange extensionRange;

  public static final String JSON_PROPERTY_ACTIVATION_RANGES = "activation_ranges";
  private List<CreatePortingPhoneNumberExtensionRequestActivationRangesInner> activationRanges = new ArrayList<>();

  public CreatePortingPhoneNumberExtensionRequest() { 
  }

  public CreatePortingPhoneNumberExtensionRequest portingPhoneNumberId(UUID portingPhoneNumberId) {
    this.portingPhoneNumberId = portingPhoneNumberId;
    return this;
  }

   /**
   * Identifies the porting phone number associated with this porting phone number extension.
   * @return portingPhoneNumberId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "f24151b6-3389-41d3-8747-7dd8c681e5e2", required = true, value = "Identifies the porting phone number associated with this porting phone number extension.")
  @JsonProperty(JSON_PROPERTY_PORTING_PHONE_NUMBER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getPortingPhoneNumberId() {
    return portingPhoneNumberId;
  }


  @JsonProperty(JSON_PROPERTY_PORTING_PHONE_NUMBER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPortingPhoneNumberId(UUID portingPhoneNumberId) {
    this.portingPhoneNumberId = portingPhoneNumberId;
  }


  public CreatePortingPhoneNumberExtensionRequest extensionRange(CreatePortingPhoneNumberExtensionRequestExtensionRange extensionRange) {
    this.extensionRange = extensionRange;
    return this;
  }

   /**
   * Get extensionRange
   * @return extensionRange
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_EXTENSION_RANGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CreatePortingPhoneNumberExtensionRequestExtensionRange getExtensionRange() {
    return extensionRange;
  }


  @JsonProperty(JSON_PROPERTY_EXTENSION_RANGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExtensionRange(CreatePortingPhoneNumberExtensionRequestExtensionRange extensionRange) {
    this.extensionRange = extensionRange;
  }


  public CreatePortingPhoneNumberExtensionRequest activationRanges(List<CreatePortingPhoneNumberExtensionRequestActivationRangesInner> activationRanges) {
    this.activationRanges = activationRanges;
    return this;
  }

  public CreatePortingPhoneNumberExtensionRequest addactivationRangesItem(CreatePortingPhoneNumberExtensionRequestActivationRangesInner activationRangesItem) {
    this.activationRanges.add(activationRangesItem);
    return this;
  }

   /**
   * Specifies the activation ranges for this porting phone number extension. The activation range must be within the extension range and should not overlap with other activation ranges.
   * @return activationRanges
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the activation ranges for this porting phone number extension. The activation range must be within the extension range and should not overlap with other activation ranges.")
  @JsonProperty(JSON_PROPERTY_ACTIVATION_RANGES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<CreatePortingPhoneNumberExtensionRequestActivationRangesInner> getActivationRanges() {
    return activationRanges;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVATION_RANGES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setActivationRanges(List<CreatePortingPhoneNumberExtensionRequestActivationRangesInner> activationRanges) {
    this.activationRanges = activationRanges;
  }


  /**
   * Return true if this createPortingPhoneNumberExtension_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePortingPhoneNumberExtensionRequest createPortingPhoneNumberExtensionRequest = (CreatePortingPhoneNumberExtensionRequest) o;
    return Objects.equals(this.portingPhoneNumberId, createPortingPhoneNumberExtensionRequest.portingPhoneNumberId) &&
        Objects.equals(this.extensionRange, createPortingPhoneNumberExtensionRequest.extensionRange) &&
        Objects.equals(this.activationRanges, createPortingPhoneNumberExtensionRequest.activationRanges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portingPhoneNumberId, extensionRange, activationRanges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePortingPhoneNumberExtensionRequest {\n");
    sb.append("    portingPhoneNumberId: ").append(toIndentedString(portingPhoneNumberId)).append("\n");
    sb.append("    extensionRange: ").append(toIndentedString(extensionRange)).append("\n");
    sb.append("    activationRanges: ").append(toIndentedString(activationRanges)).append("\n");
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

