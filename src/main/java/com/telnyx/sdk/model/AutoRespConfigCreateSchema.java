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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * AutoRespConfigCreateSchema
 */
@JsonPropertyOrder({
  AutoRespConfigCreateSchema.JSON_PROPERTY_OP,
  AutoRespConfigCreateSchema.JSON_PROPERTY_KEYWORDS,
  AutoRespConfigCreateSchema.JSON_PROPERTY_RESP_TEXT,
  AutoRespConfigCreateSchema.JSON_PROPERTY_COUNTRY_CODE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class AutoRespConfigCreateSchema {
  /**
   * Gets or Sets op
   */
  public enum OpEnum {
    START("start"),
    
    STOP("stop"),
    
    INFO("info");

    private String value;

    OpEnum(String value) {
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
    public static OpEnum fromValue(String value) {
      for (OpEnum b : OpEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_OP = "op";
  private OpEnum op;

  public static final String JSON_PROPERTY_KEYWORDS = "keywords";
  private List<String> keywords = new ArrayList<>();

  public static final String JSON_PROPERTY_RESP_TEXT = "resp_text";
  private String respText;

  public static final String JSON_PROPERTY_COUNTRY_CODE = "country_code";
  private String countryCode;

  public AutoRespConfigCreateSchema() { 
  }

  public AutoRespConfigCreateSchema op(OpEnum op) {
    this.op = op;
    return this;
  }

   /**
   * Get op
   * @return op
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_OP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OpEnum getOp() {
    return op;
  }


  @JsonProperty(JSON_PROPERTY_OP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOp(OpEnum op) {
    this.op = op;
  }


  public AutoRespConfigCreateSchema keywords(List<String> keywords) {
    this.keywords = keywords;
    return this;
  }

  public AutoRespConfigCreateSchema addKeywordsItem(String keywordsItem) {
    this.keywords.add(keywordsItem);
    return this;
  }

   /**
   * Get keywords
   * @return keywords
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "[\"keyword1\",\"keyword2\"]", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_KEYWORDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getKeywords() {
    return keywords;
  }


  @JsonProperty(JSON_PROPERTY_KEYWORDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }


  public AutoRespConfigCreateSchema respText(String respText) {
    this.respText = respText;
    return this;
  }

   /**
   * Get respText
   * @return respText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Thank you for your message", value = "")
  @JsonProperty(JSON_PROPERTY_RESP_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRespText() {
    return respText;
  }


  @JsonProperty(JSON_PROPERTY_RESP_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRespText(String respText) {
    this.respText = respText;
  }


  public AutoRespConfigCreateSchema countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "US", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCountryCode() {
    return countryCode;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  /**
   * Return true if this AutoRespConfigCreateSchema object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoRespConfigCreateSchema autoRespConfigCreateSchema = (AutoRespConfigCreateSchema) o;
    return Objects.equals(this.op, autoRespConfigCreateSchema.op) &&
        Objects.equals(this.keywords, autoRespConfigCreateSchema.keywords) &&
        Objects.equals(this.respText, autoRespConfigCreateSchema.respText) &&
        Objects.equals(this.countryCode, autoRespConfigCreateSchema.countryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(op, keywords, respText, countryCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoRespConfigCreateSchema {\n");
    sb.append("    op: ").append(toIndentedString(op)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    respText: ").append(toIndentedString(respText)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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
