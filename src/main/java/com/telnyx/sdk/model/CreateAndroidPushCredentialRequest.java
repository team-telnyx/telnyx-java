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
 * CreateAndroidPushCredentialRequest
 */
@JsonPropertyOrder({
  CreateAndroidPushCredentialRequest.JSON_PROPERTY_TYPE,
  CreateAndroidPushCredentialRequest.JSON_PROPERTY_PROJECT_ACCOUNT_JSON_FILE,
  CreateAndroidPushCredentialRequest.JSON_PROPERTY_ALIAS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class CreateAndroidPushCredentialRequest {
  /**
   * Type of mobile push credential. Should be &lt;code&gt;android&lt;/code&gt; here
   */
  public enum TypeEnum {
    ANDROID(String.valueOf("android"));

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_PROJECT_ACCOUNT_JSON_FILE = "project_account_json_file";
  private Object projectAccountJsonFile;

  public static final String JSON_PROPERTY_ALIAS = "alias";
  private String alias;

  public CreateAndroidPushCredentialRequest() { 
  }

  public CreateAndroidPushCredentialRequest type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of mobile push credential. Should be &lt;code&gt;android&lt;/code&gt; here
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Type of mobile push credential. Should be <code>android</code> here")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public CreateAndroidPushCredentialRequest projectAccountJsonFile(Object projectAccountJsonFile) {
    this.projectAccountJsonFile = projectAccountJsonFile;
    return this;
  }

   /**
   * Private key file in JSON format
   * @return projectAccountJsonFile
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "{\"private_key\":\"BBBB0J56jd8kda:APA91vjb11BCjvxx3Jxja...\",\"client_email\":\"account@customer.org\"}", required = true, value = "Private key file in JSON format")
  @JsonProperty(JSON_PROPERTY_PROJECT_ACCOUNT_JSON_FILE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getProjectAccountJsonFile() {
    return projectAccountJsonFile;
  }


  @JsonProperty(JSON_PROPERTY_PROJECT_ACCOUNT_JSON_FILE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProjectAccountJsonFile(Object projectAccountJsonFile) {
    this.projectAccountJsonFile = projectAccountJsonFile;
  }


  public CreateAndroidPushCredentialRequest alias(String alias) {
    this.alias = alias;
    return this;
  }

   /**
   * Alias to uniquely identify the credential
   * @return alias
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "LucyAndroidCredential", required = true, value = "Alias to uniquely identify the credential")
  @JsonProperty(JSON_PROPERTY_ALIAS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAlias() {
    return alias;
  }


  @JsonProperty(JSON_PROPERTY_ALIAS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAlias(String alias) {
    this.alias = alias;
  }


  /**
   * Return true if this CreateAndroidPushCredentialRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAndroidPushCredentialRequest createAndroidPushCredentialRequest = (CreateAndroidPushCredentialRequest) o;
    return Objects.equals(this.type, createAndroidPushCredentialRequest.type) &&
        Objects.equals(this.projectAccountJsonFile, createAndroidPushCredentialRequest.projectAccountJsonFile) &&
        Objects.equals(this.alias, createAndroidPushCredentialRequest.alias);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, projectAccountJsonFile, alias);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAndroidPushCredentialRequest {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    projectAccountJsonFile: ").append(toIndentedString(projectAccountJsonFile)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
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

