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
import com.telnyx.sdk.model.CreateAdditionalDocumentsRequestAdditionalDocumentsInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * CreateAdditionalDocumentsRequest
 */
@JsonPropertyOrder({
  CreateAdditionalDocumentsRequest.JSON_PROPERTY_ADDITIONAL_DOCUMENTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class CreateAdditionalDocumentsRequest {
  public static final String JSON_PROPERTY_ADDITIONAL_DOCUMENTS = "additional_documents";
  private List<CreateAdditionalDocumentsRequestAdditionalDocumentsInner> additionalDocuments = null;

  public CreateAdditionalDocumentsRequest() { 
  }

  public CreateAdditionalDocumentsRequest additionalDocuments(List<CreateAdditionalDocumentsRequestAdditionalDocumentsInner> additionalDocuments) {
    this.additionalDocuments = additionalDocuments;
    return this;
  }

  public CreateAdditionalDocumentsRequest addAdditionalDocumentsItem(CreateAdditionalDocumentsRequestAdditionalDocumentsInner additionalDocumentsItem) {
    if (this.additionalDocuments == null) {
      this.additionalDocuments = new ArrayList<>();
    }
    this.additionalDocuments.add(additionalDocumentsItem);
    return this;
  }

   /**
   * Get additionalDocuments
   * @return additionalDocuments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_DOCUMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CreateAdditionalDocumentsRequestAdditionalDocumentsInner> getAdditionalDocuments() {
    return additionalDocuments;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONAL_DOCUMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalDocuments(List<CreateAdditionalDocumentsRequestAdditionalDocumentsInner> additionalDocuments) {
    this.additionalDocuments = additionalDocuments;
  }


  /**
   * Return true if this CreateAdditionalDocuments_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAdditionalDocumentsRequest createAdditionalDocumentsRequest = (CreateAdditionalDocumentsRequest) o;
    return Objects.equals(this.additionalDocuments, createAdditionalDocumentsRequest.additionalDocuments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalDocuments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAdditionalDocumentsRequest {\n");
    sb.append("    additionalDocuments: ").append(toIndentedString(additionalDocuments)).append("\n");
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

