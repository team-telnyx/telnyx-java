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
 * The settings associated with the authentication provider.
 */
@ApiModel(description = "The settings associated with the authentication provider.")
@JsonPropertyOrder({
  AuthenticationProviderSettings.JSON_PROPERTY_ASSERTION_CONSUMER_SERVICE_URL,
  AuthenticationProviderSettings.JSON_PROPERTY_SERVICE_PROVIDER_ENTITY_ID,
  AuthenticationProviderSettings.JSON_PROPERTY_IDP_ENTITY_ID,
  AuthenticationProviderSettings.JSON_PROPERTY_IDP_SSO_TARGET_URL,
  AuthenticationProviderSettings.JSON_PROPERTY_IDP_CERT_FINGERPRINT,
  AuthenticationProviderSettings.JSON_PROPERTY_IDP_CERT_FINGERPRINT_ALGORITHM,
  AuthenticationProviderSettings.JSON_PROPERTY_NAME_IDENTIFIER_FORMAT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class AuthenticationProviderSettings {
  public static final String JSON_PROPERTY_ASSERTION_CONSUMER_SERVICE_URL = "assertion_consumer_service_url";
  private String assertionConsumerServiceUrl;

  public static final String JSON_PROPERTY_SERVICE_PROVIDER_ENTITY_ID = "service_provider_entity_id";
  private String serviceProviderEntityId;

  public static final String JSON_PROPERTY_IDP_ENTITY_ID = "idp_entity_id";
  private String idpEntityId;

  public static final String JSON_PROPERTY_IDP_SSO_TARGET_URL = "idp_sso_target_url";
  private String idpSsoTargetUrl;

  public static final String JSON_PROPERTY_IDP_CERT_FINGERPRINT = "idp_cert_fingerprint";
  private String idpCertFingerprint;

  /**
   * The algorithm used to generate the identity provider&#39;s (IdP) certificate fingerprint
   */
  public enum IdpCertFingerprintAlgorithmEnum {
    SHA1("sha1"),
    
    SHA256("sha256"),
    
    SHA384("sha384"),
    
    SHA512("sha512");

    private String value;

    IdpCertFingerprintAlgorithmEnum(String value) {
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
    public static IdpCertFingerprintAlgorithmEnum fromValue(String value) {
      for (IdpCertFingerprintAlgorithmEnum b : IdpCertFingerprintAlgorithmEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_IDP_CERT_FINGERPRINT_ALGORITHM = "idp_cert_fingerprint_algorithm";
  private IdpCertFingerprintAlgorithmEnum idpCertFingerprintAlgorithm = IdpCertFingerprintAlgorithmEnum.SHA1;

  public static final String JSON_PROPERTY_NAME_IDENTIFIER_FORMAT = "name_identifier_format";
  private String nameIdentifierFormat;

  public AuthenticationProviderSettings() { 
  }

  public AuthenticationProviderSettings assertionConsumerServiceUrl(String assertionConsumerServiceUrl) {
    this.assertionConsumerServiceUrl = assertionConsumerServiceUrl;
    return this;
  }

   /**
   * The Assertion Consumer Service URL for the service provider (Telnyx).
   * @return assertionConsumerServiceUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://api.telnyx.com/sso/saml/auth/myorg", value = "The Assertion Consumer Service URL for the service provider (Telnyx).")
  @JsonProperty(JSON_PROPERTY_ASSERTION_CONSUMER_SERVICE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAssertionConsumerServiceUrl() {
    return assertionConsumerServiceUrl;
  }


  @JsonProperty(JSON_PROPERTY_ASSERTION_CONSUMER_SERVICE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssertionConsumerServiceUrl(String assertionConsumerServiceUrl) {
    this.assertionConsumerServiceUrl = assertionConsumerServiceUrl;
  }


  public AuthenticationProviderSettings serviceProviderEntityId(String serviceProviderEntityId) {
    this.serviceProviderEntityId = serviceProviderEntityId;
    return this;
  }

   /**
   * The Entity ID for the service provider (Telnyx).
   * @return serviceProviderEntityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://api.telnyx.com/sso/saml/metadata/myorg", value = "The Entity ID for the service provider (Telnyx).")
  @JsonProperty(JSON_PROPERTY_SERVICE_PROVIDER_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServiceProviderEntityId() {
    return serviceProviderEntityId;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_PROVIDER_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceProviderEntityId(String serviceProviderEntityId) {
    this.serviceProviderEntityId = serviceProviderEntityId;
  }


  public AuthenticationProviderSettings idpEntityId(String idpEntityId) {
    this.idpEntityId = idpEntityId;
    return this;
  }

   /**
   * The Entity ID for the identity provider (IdP).
   * @return idpEntityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://myorg.myidp.com/saml/metadata", value = "The Entity ID for the identity provider (IdP).")
  @JsonProperty(JSON_PROPERTY_IDP_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIdpEntityId() {
    return idpEntityId;
  }


  @JsonProperty(JSON_PROPERTY_IDP_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdpEntityId(String idpEntityId) {
    this.idpEntityId = idpEntityId;
  }


  public AuthenticationProviderSettings idpSsoTargetUrl(String idpSsoTargetUrl) {
    this.idpSsoTargetUrl = idpSsoTargetUrl;
    return this;
  }

   /**
   * The SSO target url for the identity provider (IdP).
   * @return idpSsoTargetUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://myorg.myidp.com/trust/saml2/http-post/sso", value = "The SSO target url for the identity provider (IdP).")
  @JsonProperty(JSON_PROPERTY_IDP_SSO_TARGET_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIdpSsoTargetUrl() {
    return idpSsoTargetUrl;
  }


  @JsonProperty(JSON_PROPERTY_IDP_SSO_TARGET_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdpSsoTargetUrl(String idpSsoTargetUrl) {
    this.idpSsoTargetUrl = idpSsoTargetUrl;
  }


  public AuthenticationProviderSettings idpCertFingerprint(String idpCertFingerprint) {
    this.idpCertFingerprint = idpCertFingerprint;
    return this;
  }

   /**
   * The certificate fingerprint for the identity provider (IdP)
   * @return idpCertFingerprint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "13:38:C7:BB:C9:FF:4A:70:38:3A:E3:D9:5C:CD:DB:2E:50:1E:80:A7", value = "The certificate fingerprint for the identity provider (IdP)")
  @JsonProperty(JSON_PROPERTY_IDP_CERT_FINGERPRINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIdpCertFingerprint() {
    return idpCertFingerprint;
  }


  @JsonProperty(JSON_PROPERTY_IDP_CERT_FINGERPRINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdpCertFingerprint(String idpCertFingerprint) {
    this.idpCertFingerprint = idpCertFingerprint;
  }


  public AuthenticationProviderSettings idpCertFingerprintAlgorithm(IdpCertFingerprintAlgorithmEnum idpCertFingerprintAlgorithm) {
    this.idpCertFingerprintAlgorithm = idpCertFingerprintAlgorithm;
    return this;
  }

   /**
   * The algorithm used to generate the identity provider&#39;s (IdP) certificate fingerprint
   * @return idpCertFingerprintAlgorithm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "sha256", value = "The algorithm used to generate the identity provider's (IdP) certificate fingerprint")
  @JsonProperty(JSON_PROPERTY_IDP_CERT_FINGERPRINT_ALGORITHM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IdpCertFingerprintAlgorithmEnum getIdpCertFingerprintAlgorithm() {
    return idpCertFingerprintAlgorithm;
  }


  @JsonProperty(JSON_PROPERTY_IDP_CERT_FINGERPRINT_ALGORITHM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdpCertFingerprintAlgorithm(IdpCertFingerprintAlgorithmEnum idpCertFingerprintAlgorithm) {
    this.idpCertFingerprintAlgorithm = idpCertFingerprintAlgorithm;
  }


  public AuthenticationProviderSettings nameIdentifierFormat(String nameIdentifierFormat) {
    this.nameIdentifierFormat = nameIdentifierFormat;
    return this;
  }

   /**
   * The name identifier format associated with the authentication provider. This must be the same for both the Identity Provider (IdP) and the service provider (Telnyx).
   * @return nameIdentifierFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "urn:oasis:names:tc:SAML:1.1:nameid-format", value = "The name identifier format associated with the authentication provider. This must be the same for both the Identity Provider (IdP) and the service provider (Telnyx).")
  @JsonProperty(JSON_PROPERTY_NAME_IDENTIFIER_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNameIdentifierFormat() {
    return nameIdentifierFormat;
  }


  @JsonProperty(JSON_PROPERTY_NAME_IDENTIFIER_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNameIdentifierFormat(String nameIdentifierFormat) {
    this.nameIdentifierFormat = nameIdentifierFormat;
  }


  /**
   * Return true if this AuthenticationProvider_settings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationProviderSettings authenticationProviderSettings = (AuthenticationProviderSettings) o;
    return Objects.equals(this.assertionConsumerServiceUrl, authenticationProviderSettings.assertionConsumerServiceUrl) &&
        Objects.equals(this.serviceProviderEntityId, authenticationProviderSettings.serviceProviderEntityId) &&
        Objects.equals(this.idpEntityId, authenticationProviderSettings.idpEntityId) &&
        Objects.equals(this.idpSsoTargetUrl, authenticationProviderSettings.idpSsoTargetUrl) &&
        Objects.equals(this.idpCertFingerprint, authenticationProviderSettings.idpCertFingerprint) &&
        Objects.equals(this.idpCertFingerprintAlgorithm, authenticationProviderSettings.idpCertFingerprintAlgorithm) &&
        Objects.equals(this.nameIdentifierFormat, authenticationProviderSettings.nameIdentifierFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assertionConsumerServiceUrl, serviceProviderEntityId, idpEntityId, idpSsoTargetUrl, idpCertFingerprint, idpCertFingerprintAlgorithm, nameIdentifierFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationProviderSettings {\n");
    sb.append("    assertionConsumerServiceUrl: ").append(toIndentedString(assertionConsumerServiceUrl)).append("\n");
    sb.append("    serviceProviderEntityId: ").append(toIndentedString(serviceProviderEntityId)).append("\n");
    sb.append("    idpEntityId: ").append(toIndentedString(idpEntityId)).append("\n");
    sb.append("    idpSsoTargetUrl: ").append(toIndentedString(idpSsoTargetUrl)).append("\n");
    sb.append("    idpCertFingerprint: ").append(toIndentedString(idpCertFingerprint)).append("\n");
    sb.append("    idpCertFingerprintAlgorithm: ").append(toIndentedString(idpCertFingerprintAlgorithm)).append("\n");
    sb.append("    nameIdentifierFormat: ").append(toIndentedString(nameIdentifierFormat)).append("\n");
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

