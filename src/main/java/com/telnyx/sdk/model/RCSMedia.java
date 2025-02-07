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
import com.telnyx.sdk.model.RCSContentInfo;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * A media file within a rich card.
 */
@ApiModel(description = "A media file within a rich card.")
@JsonPropertyOrder({
  RCSMedia.JSON_PROPERTY_HEIGHT,
  RCSMedia.JSON_PROPERTY_CONTENT_INFO
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class RCSMedia {
  /**
   * The height of the media within a rich card with a vertical layout. For a standalone card with horizontal layout, height is not customizable, and this field is ignored.
   */
  public enum HeightEnum {
    HEIGHT_UNSPECIFIED(String.valueOf("HEIGHT_UNSPECIFIED")),
    
    SHORT(String.valueOf("SHORT")),
    
    MEDIUM(String.valueOf("MEDIUM")),
    
    TALL(String.valueOf("TALL"));

    private String value;

    HeightEnum(String value) {
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
    public static HeightEnum fromValue(String value) {
      for (HeightEnum b : HeightEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_HEIGHT = "height";
  private HeightEnum height;

  public static final String JSON_PROPERTY_CONTENT_INFO = "content_info";
  private RCSContentInfo contentInfo;

  public RCSMedia() { 
  }

  public RCSMedia height(HeightEnum height) {
    this.height = height;
    return this;
  }

   /**
   * The height of the media within a rich card with a vertical layout. For a standalone card with horizontal layout, height is not customizable, and this field is ignored.
   * @return height
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "MEDIUM", value = "The height of the media within a rich card with a vertical layout. For a standalone card with horizontal layout, height is not customizable, and this field is ignored.")
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public HeightEnum getHeight() {
    return height;
  }


  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeight(HeightEnum height) {
    this.height = height;
  }


  public RCSMedia contentInfo(RCSContentInfo contentInfo) {
    this.contentInfo = contentInfo;
    return this;
  }

   /**
   * Get contentInfo
   * @return contentInfo
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONTENT_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RCSContentInfo getContentInfo() {
    return contentInfo;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContentInfo(RCSContentInfo contentInfo) {
    this.contentInfo = contentInfo;
  }


  /**
   * Return true if this RCSMedia object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RCSMedia rcSMedia = (RCSMedia) o;
    return Objects.equals(this.height, rcSMedia.height) &&
        Objects.equals(this.contentInfo, rcSMedia.contentInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, contentInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RCSMedia {\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    contentInfo: ").append(toIndentedString(contentInfo)).append("\n");
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

