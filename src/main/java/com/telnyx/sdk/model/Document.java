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
 * The media object containing a document reference
 */
@ApiModel(description = "The media object containing a document reference")
@JsonPropertyOrder({
  Document.JSON_PROPERTY_ID,
  Document.JSON_PROPERTY_LINK,
  Document.JSON_PROPERTY_CAPTION,
  Document.JSON_PROPERTY_FILENAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Document {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_LINK = "link";
  private String link;

  public static final String JSON_PROPERTY_CAPTION = "caption";
  private String caption;

  public static final String JSON_PROPERTY_FILENAME = "filename";
  private String filename;

  public Document() { 
  }

  public Document id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The media object ID returned when the media is successfully uploaded to the media endpoint.
   * @return id
  **/
  @javax.annotation.Nullable
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


  public Document link(String link) {
    this.link = link;
    return this;
  }

   /**
   * The protocol and URL of the media to be sent. Use only with HTTP/HTTPS URLs. Either id or link must be provided, not both.
   * @return link
  **/
  @javax.annotation.Nullable
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


  public Document caption(String caption) {
    this.caption = caption;
    return this;
  }

   /**
   * Describes the specified media.
   * @return caption
  **/
  @javax.annotation.Nullable
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


  public Document filename(String filename) {
    this.filename = filename;
    return this;
  }

   /**
   * Describes the filename for the specific document.
   * @return filename
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "example.pdf", value = "Describes the filename for the specific document.")
  @JsonProperty(JSON_PROPERTY_FILENAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFilename() {
    return filename;
  }


  @JsonProperty(JSON_PROPERTY_FILENAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilename(String filename) {
    this.filename = filename;
  }


  /**
   * Return true if this Document object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Document document = (Document) o;
    return Objects.equals(this.id, document.id) &&
        Objects.equals(this.link, document.link) &&
        Objects.equals(this.caption, document.caption) &&
        Objects.equals(this.filename, document.filename);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, link, caption, filename);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Document {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
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

