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
import java.util.Arrays;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * The logo of the LOA configuration
 */
@ApiModel(description = "The logo of the LOA configuration")
@JsonPropertyOrder({
  PreviewLoaConfigurationParamsRequestLogo.JSON_PROPERTY_DOCUMENT_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class PreviewLoaConfigurationParamsRequestLogo {
  public static final String JSON_PROPERTY_DOCUMENT_ID = "document_id";
  private UUID documentId;

  public PreviewLoaConfigurationParamsRequestLogo() { 
  }

  public PreviewLoaConfigurationParamsRequestLogo documentId(UUID documentId) {
    this.documentId = documentId;
    return this;
  }

   /**
   * The document identification
   * @return documentId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The document identification")
  @JsonProperty(JSON_PROPERTY_DOCUMENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getDocumentId() {
    return documentId;
  }


  @JsonProperty(JSON_PROPERTY_DOCUMENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDocumentId(UUID documentId) {
    this.documentId = documentId;
  }


  /**
   * Return true if this PreviewLoaConfigurationParams_request_logo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PreviewLoaConfigurationParamsRequestLogo previewLoaConfigurationParamsRequestLogo = (PreviewLoaConfigurationParamsRequestLogo) o;
    return Objects.equals(this.documentId, previewLoaConfigurationParamsRequestLogo.documentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreviewLoaConfigurationParamsRequestLogo {\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
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

