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
 * PushCredential
 */
@JsonPropertyOrder({
  PushCredential.JSON_PROPERTY_ID,
  PushCredential.JSON_PROPERTY_CERTIFICATE,
  PushCredential.JSON_PROPERTY_PRIVATE_KEY,
  PushCredential.JSON_PROPERTY_PROJECT_ACCOUNT_JSON_FILE,
  PushCredential.JSON_PROPERTY_ALIAS,
  PushCredential.JSON_PROPERTY_TYPE,
  PushCredential.JSON_PROPERTY_RECORD_TYPE,
  PushCredential.JSON_PROPERTY_CREATED_AT,
  PushCredential.JSON_PROPERTY_UPDATED_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class PushCredential {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_CERTIFICATE = "certificate";
  private String certificate;

  public static final String JSON_PROPERTY_PRIVATE_KEY = "private_key";
  private String privateKey;

  public static final String JSON_PROPERTY_PROJECT_ACCOUNT_JSON_FILE = "project_account_json_file";
  private Object projectAccountJsonFile;

  public static final String JSON_PROPERTY_ALIAS = "alias";
  private String alias;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public PushCredential() { 
  }

  @JsonCreator
  public PushCredential(
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE) String recordType
  ) {
    this();
    this.recordType = recordType;
  }

  public PushCredential id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of a push credential
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0ccc7b54-4df3-4bcb-a65a-3da1ecc997d7", required = true, value = "Unique identifier of a push credential")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }


  public PushCredential certificate(String certificate) {
    this.certificate = certificate;
    return this;
  }

   /**
   * Apple certificate for sending push notifications. For iOS only
   * @return certificate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "-----BEGIN CERTIFICATE----- MIIGVDCCBTKCAQEAsNlRJVZn9ZvXcECQm65czs... -----END CERTIFICATE-----", required = true, value = "Apple certificate for sending push notifications. For iOS only")
  @JsonProperty(JSON_PROPERTY_CERTIFICATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCertificate() {
    return certificate;
  }


  @JsonProperty(JSON_PROPERTY_CERTIFICATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }


  public PushCredential privateKey(String privateKey) {
    this.privateKey = privateKey;
    return this;
  }

   /**
   * Apple private key for a given certificate for sending push notifications. For iOS only
   * @return privateKey
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "-----BEGIN RSA PRIVATE KEY----- MIIEpQIBAAKCAQEAsNlRJVZn9ZvXcECQm65czs... -----END RSA PRIVATE KEY-----", required = true, value = "Apple private key for a given certificate for sending push notifications. For iOS only")
  @JsonProperty(JSON_PROPERTY_PRIVATE_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPrivateKey() {
    return privateKey;
  }


  @JsonProperty(JSON_PROPERTY_PRIVATE_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPrivateKey(String privateKey) {
    this.privateKey = privateKey;
  }


  public PushCredential projectAccountJsonFile(Object projectAccountJsonFile) {
    this.projectAccountJsonFile = projectAccountJsonFile;
    return this;
  }

   /**
   * Google server key for sending push notifications. For Android only
   * @return projectAccountJsonFile
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "{\"private_key\":\"BBBB0J56jd8kda:APA91vjb11BCjvxx3Jxja...\",\"client_email\":\"account@customer.org\"}", required = true, value = "Google server key for sending push notifications. For Android only")
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


  public PushCredential alias(String alias) {
    this.alias = alias;
    return this;
  }

   /**
   * Alias to uniquely identify a credential
   * @return alias
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "LucyCredential", required = true, value = "Alias to uniquely identify a credential")
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


  public PushCredential type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of mobile push credential. Either &lt;code&gt;ios&lt;/code&gt; or &lt;code&gt;android&lt;/code&gt;
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ios", required = true, value = "Type of mobile push credential. Either <code>ios</code> or <code>android</code>")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(String type) {
    this.type = type;
  }


   /**
   * Get recordType
   * @return recordType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "push_credential", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRecordType() {
    return recordType;
  }




  public PushCredential createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * ISO 8601 timestamp when the room was created
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2021-03-26T17:51:59.588408Z", required = true, value = "ISO 8601 timestamp when the room was created")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public PushCredential updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * ISO 8601 timestamp when the room was updated.
   * @return updatedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2021-03-26T17:51:59.588408Z", required = true, value = "ISO 8601 timestamp when the room was updated.")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  /**
   * Return true if this PushCredential object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PushCredential pushCredential = (PushCredential) o;
    return Objects.equals(this.id, pushCredential.id) &&
        Objects.equals(this.certificate, pushCredential.certificate) &&
        Objects.equals(this.privateKey, pushCredential.privateKey) &&
        Objects.equals(this.projectAccountJsonFile, pushCredential.projectAccountJsonFile) &&
        Objects.equals(this.alias, pushCredential.alias) &&
        Objects.equals(this.type, pushCredential.type) &&
        Objects.equals(this.recordType, pushCredential.recordType) &&
        Objects.equals(this.createdAt, pushCredential.createdAt) &&
        Objects.equals(this.updatedAt, pushCredential.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, certificate, privateKey, projectAccountJsonFile, alias, type, recordType, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PushCredential {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
    sb.append("    projectAccountJsonFile: ").append(toIndentedString(projectAccountJsonFile)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

