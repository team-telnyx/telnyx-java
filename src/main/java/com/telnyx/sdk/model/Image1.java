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
import com.telnyx.sdk.model.Image;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * Contains the media object for this image.
 */
@ApiModel(description = "Contains the media object for this image.")
@JsonPropertyOrder({
  Image1.JSON_PROPERTY_ID,
  Image1.JSON_PROPERTY_LINK,
  Image1.JSON_PROPERTY_CAPTION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Image1 {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_LINK = "link";
  private String link;

  public static final String JSON_PROPERTY_CAPTION = "caption";
  private String caption;

  public Image1() { 
  }

  public Image1 id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The media object ID returned when the media is successfully uploaded to the media endpoint.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "f043afd0-f0ae-4b9c-ab3d-696fb4c8cd68", value = "The media object ID returned when the media is successfully uploaded to the media endpoint.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public Image1 link(String link) {
    this.link = link;
    return this;
  }

   /**
   * The protocol and URL of the media to be sent. Use only with HTTP/HTTPS URLs. Either id or link must be provided, not both.
   * @return link
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "http://www.example.com/file", value = "The protocol and URL of the media to be sent. Use only with HTTP/HTTPS URLs. Either id or link must be provided, not both.")
  @JsonProperty(JSON_PROPERTY_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLink() {
    return link;
  }


  @JsonProperty(JSON_PROPERTY_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLink(String link) {
    this.link = link;
  }


  public Image1 caption(String caption) {
    this.caption = caption;
    return this;
  }

   /**
   * Describes the specified media.
   * @return caption
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "My cool media!", value = "Describes the specified media.")
  @JsonProperty(JSON_PROPERTY_CAPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCaption() {
    return caption;
  }


  @JsonProperty(JSON_PROPERTY_CAPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCaption(String caption) {
    this.caption = caption;
  }


  /**
   * Return true if this Image_1 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Image1 image1 = (Image1) o;
    return Objects.equals(this.id, image1.id) &&
        Objects.equals(this.link, image1.link) &&
        Objects.equals(this.caption, image1.caption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, link, caption);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Image1 {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
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

