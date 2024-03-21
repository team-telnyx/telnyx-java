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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.telnyx.sdk.JSON;


/**
 * BulkCredentialResponseData
 */
@JsonPropertyOrder({
  BulkCredentialResponseData.JSON_PROPERTY_CREDENTIALS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class BulkCredentialResponseData {
  public static final String JSON_PROPERTY_CREDENTIALS = "credentials";
  private Integer credentials;

  public BulkCredentialResponseData() { 
  }

  public BulkCredentialResponseData credentials(Integer credentials) {
    this.credentials = credentials;
    return this;
  }

   /**
   * Amount of credentials affected
   * @return credentials
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "Amount of credentials affected")
  @JsonProperty(JSON_PROPERTY_CREDENTIALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCredentials() {
    return credentials;
  }


  @JsonProperty(JSON_PROPERTY_CREDENTIALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCredentials(Integer credentials) {
    this.credentials = credentials;
  }


  /**
   * Return true if this Bulk_Credential_Response_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkCredentialResponseData bulkCredentialResponseData = (BulkCredentialResponseData) o;
    return Objects.equals(this.credentials, bulkCredentialResponseData.credentials);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentials);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkCredentialResponseData {\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
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

