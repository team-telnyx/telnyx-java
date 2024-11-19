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
 * CreateIosPushCredentialRequest
 */
@JsonPropertyOrder({
  CreateIosPushCredentialRequest.JSON_PROPERTY_TYPE,
  CreateIosPushCredentialRequest.JSON_PROPERTY_CERTIFICATE,
  CreateIosPushCredentialRequest.JSON_PROPERTY_PRIVATE_KEY,
  CreateIosPushCredentialRequest.JSON_PROPERTY_ALIAS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class CreateIosPushCredentialRequest {
  /**
   * Type of mobile push credential. Should be &lt;code&gt;ios&lt;/code&gt; here
   */
  public enum TypeEnum {
    IOS(String.valueOf("ios"));

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

  public static final String JSON_PROPERTY_CERTIFICATE = "certificate";
  private String certificate;

  public static final String JSON_PROPERTY_PRIVATE_KEY = "private_key";
  private String privateKey;

  public static final String JSON_PROPERTY_ALIAS = "alias";
  private String alias;

  public CreateIosPushCredentialRequest() { 
  }

  public CreateIosPushCredentialRequest type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of mobile push credential. Should be &lt;code&gt;ios&lt;/code&gt; here
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Type of mobile push credential. Should be <code>ios</code> here")
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


  public CreateIosPushCredentialRequest certificate(String certificate) {
    this.certificate = certificate;
    return this;
  }

   /**
   * Certificate as received from APNs
   * @return certificate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "-----BEGIN CERTIFICATE----- MIIGVDCCBTKCAQEAsNlRJVZn9ZvXcECQm65czs... -----END CERTIFICATE-----", required = true, value = "Certificate as received from APNs")
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


  public CreateIosPushCredentialRequest privateKey(String privateKey) {
    this.privateKey = privateKey;
    return this;
  }

   /**
   * Corresponding private key to the certificate as received from APNs
   * @return privateKey
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "-----BEGIN RSA PRIVATE KEY----- MIIEpQIBAAKCAQEAsNlRJVZn9ZvXcECQm65czs... -----END RSA PRIVATE KEY-----", required = true, value = "Corresponding private key to the certificate as received from APNs")
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


  public CreateIosPushCredentialRequest alias(String alias) {
    this.alias = alias;
    return this;
  }

   /**
   * Alias to uniquely identify the credential
   * @return alias
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "LucyIosCredential", required = true, value = "Alias to uniquely identify the credential")
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
   * Return true if this CreateIosPushCredentialRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateIosPushCredentialRequest createIosPushCredentialRequest = (CreateIosPushCredentialRequest) o;
    return Objects.equals(this.type, createIosPushCredentialRequest.type) &&
        Objects.equals(this.certificate, createIosPushCredentialRequest.certificate) &&
        Objects.equals(this.privateKey, createIosPushCredentialRequest.privateKey) &&
        Objects.equals(this.alias, createIosPushCredentialRequest.alias);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, certificate, privateKey, alias);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateIosPushCredentialRequest {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
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

