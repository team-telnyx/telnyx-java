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
import com.telnyx.sdk.JSON;


/**
 * MigrationSourceParamsProviderAuth
 */
@JsonPropertyOrder({
  MigrationSourceParamsProviderAuth.JSON_PROPERTY_ACCESS_KEY,
  MigrationSourceParamsProviderAuth.JSON_PROPERTY_SECRET_ACCESS_KEY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class MigrationSourceParamsProviderAuth {
  public static final String JSON_PROPERTY_ACCESS_KEY = "access_key";
  private String accessKey;

  public static final String JSON_PROPERTY_SECRET_ACCESS_KEY = "secret_access_key";
  private String secretAccessKey;

  public MigrationSourceParamsProviderAuth() { 
  }

  public MigrationSourceParamsProviderAuth accessKey(String accessKey) {
    this.accessKey = accessKey;
    return this;
  }

   /**
   * AWS Access Key.
   * @return accessKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "AWS Access Key.")
  @JsonProperty(JSON_PROPERTY_ACCESS_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccessKey() {
    return accessKey;
  }


  @JsonProperty(JSON_PROPERTY_ACCESS_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccessKey(String accessKey) {
    this.accessKey = accessKey;
  }


  public MigrationSourceParamsProviderAuth secretAccessKey(String secretAccessKey) {
    this.secretAccessKey = secretAccessKey;
    return this;
  }

   /**
   * AWS Secret Access Key.
   * @return secretAccessKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "AWS Secret Access Key.")
  @JsonProperty(JSON_PROPERTY_SECRET_ACCESS_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSecretAccessKey() {
    return secretAccessKey;
  }


  @JsonProperty(JSON_PROPERTY_SECRET_ACCESS_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecretAccessKey(String secretAccessKey) {
    this.secretAccessKey = secretAccessKey;
  }


  /**
   * Return true if this MigrationSourceParams_provider_auth object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MigrationSourceParamsProviderAuth migrationSourceParamsProviderAuth = (MigrationSourceParamsProviderAuth) o;
    return Objects.equals(this.accessKey, migrationSourceParamsProviderAuth.accessKey) &&
        Objects.equals(this.secretAccessKey, migrationSourceParamsProviderAuth.secretAccessKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKey, secretAccessKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigrationSourceParamsProviderAuth {\n");
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
    sb.append("    secretAccessKey: ").append(toIndentedString(secretAccessKey)).append("\n");
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

