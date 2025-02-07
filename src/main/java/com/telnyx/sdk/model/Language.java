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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * Language
 */
@JsonPropertyOrder({
  Language.JSON_PROPERTY_POLICY,
  Language.JSON_PROPERTY_CODE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Language {
  /**
   * The language policy the message should follow
   */
  public enum PolicyEnum {
    FALLBACK("fallback"),
    
    DETERMINISTIC("deterministic");

    private String value;

    PolicyEnum(String value) {
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
    public static PolicyEnum fromValue(String value) {
      for (PolicyEnum b : PolicyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_POLICY = "policy";
  private PolicyEnum policy;

  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public Language() { 
  }

  public Language policy(PolicyEnum policy) {
    this.policy = policy;
    return this;
  }

   /**
   * The language policy the message should follow
   * @return policy
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The language policy the message should follow")
  @JsonProperty(JSON_PROPERTY_POLICY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PolicyEnum getPolicy() {
    return policy;
  }


  @JsonProperty(JSON_PROPERTY_POLICY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPolicy(PolicyEnum policy) {
    this.policy = policy;
  }


  public Language code(String code) {
    this.code = code;
    return this;
  }

   /**
   * The code of the language or locale to use — Accepts both language and language_locale formats (e.g., en and en_US).
   * @return code
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The code of the language or locale to use — Accepts both language and language_locale formats (e.g., en and en_US).")
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCode(String code) {
    this.code = code;
  }


  /**
   * Return true if this Language object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Language language = (Language) o;
    return Objects.equals(this.policy, language.policy) &&
        Objects.equals(this.code, language.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policy, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Language {\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

