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
import com.telnyx.sdk.model.Audio;
import com.telnyx.sdk.model.Document;
import com.telnyx.sdk.model.Image;
import com.telnyx.sdk.model.Location;
import com.telnyx.sdk.model.MessageType;
import com.telnyx.sdk.model.Template;
import com.telnyx.sdk.model.Text;
import com.telnyx.sdk.model.Video;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * CreateWhatsAppMessageRequest
 */
@JsonPropertyOrder({
  CreateWhatsAppMessageRequest.JSON_PROPERTY_WHATSAPP_USER_ID,
  CreateWhatsAppMessageRequest.JSON_PROPERTY_TO,
  CreateWhatsAppMessageRequest.JSON_PROPERTY_TYPE,
  CreateWhatsAppMessageRequest.JSON_PROPERTY_TEXT,
  CreateWhatsAppMessageRequest.JSON_PROPERTY_AUDIO,
  CreateWhatsAppMessageRequest.JSON_PROPERTY_IMAGE,
  CreateWhatsAppMessageRequest.JSON_PROPERTY_DOCUMENT,
  CreateWhatsAppMessageRequest.JSON_PROPERTY_VIDEO,
  CreateWhatsAppMessageRequest.JSON_PROPERTY_LOCATION,
  CreateWhatsAppMessageRequest.JSON_PROPERTY_PREVIEW_URL,
  CreateWhatsAppMessageRequest.JSON_PROPERTY_TEMPLATE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateWhatsAppMessageRequest {
  public static final String JSON_PROPERTY_WHATSAPP_USER_ID = "whatsapp_user_id";
  private String whatsappUserId;

  public static final String JSON_PROPERTY_TO = "to";
  private String to;

  public static final String JSON_PROPERTY_TYPE = "type";
  private MessageType type = MessageType.TEXT;

  public static final String JSON_PROPERTY_TEXT = "text";
  private Text text;

  public static final String JSON_PROPERTY_AUDIO = "audio";
  private Audio audio;

  public static final String JSON_PROPERTY_IMAGE = "image";
  private Image image;

  public static final String JSON_PROPERTY_DOCUMENT = "document";
  private Document document;

  public static final String JSON_PROPERTY_VIDEO = "video";
  private Video video;

  public static final String JSON_PROPERTY_LOCATION = "location";
  private Location location;

  public static final String JSON_PROPERTY_PREVIEW_URL = "preview_url";
  private Boolean previewUrl;

  public static final String JSON_PROPERTY_TEMPLATE = "template";
  private Template template;

  public CreateWhatsAppMessageRequest() { 
  }

  public CreateWhatsAppMessageRequest whatsappUserId(String whatsappUserId) {
    this.whatsappUserId = whatsappUserId;
    return this;
  }

   /**
   * The sender&#39;s WhatsApp ID.
   * @return whatsappUserId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The sender's WhatsApp ID.")
  @JsonProperty(JSON_PROPERTY_WHATSAPP_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getWhatsappUserId() {
    return whatsappUserId;
  }


  @JsonProperty(JSON_PROPERTY_WHATSAPP_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWhatsappUserId(String whatsappUserId) {
    this.whatsappUserId = whatsappUserId;
  }


  public CreateWhatsAppMessageRequest to(String to) {
    this.to = to;
    return this;
  }

   /**
   * The WhatsApp ID (phone number) returned from contacts endpoint.
   * @return to
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The WhatsApp ID (phone number) returned from contacts endpoint.")
  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTo() {
    return to;
  }


  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTo(String to) {
    this.to = to;
  }


  public CreateWhatsAppMessageRequest type(MessageType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MessageType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(MessageType type) {
    this.type = type;
  }


  public CreateWhatsAppMessageRequest text(Text text) {
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Text getText() {
    return text;
  }


  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setText(Text text) {
    this.text = text;
  }


  public CreateWhatsAppMessageRequest audio(Audio audio) {
    this.audio = audio;
    return this;
  }

   /**
   * Get audio
   * @return audio
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUDIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Audio getAudio() {
    return audio;
  }


  @JsonProperty(JSON_PROPERTY_AUDIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAudio(Audio audio) {
    this.audio = audio;
  }


  public CreateWhatsAppMessageRequest image(Image image) {
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Image getImage() {
    return image;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImage(Image image) {
    this.image = image;
  }


  public CreateWhatsAppMessageRequest document(Document document) {
    this.document = document;
    return this;
  }

   /**
   * Get document
   * @return document
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DOCUMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Document getDocument() {
    return document;
  }


  @JsonProperty(JSON_PROPERTY_DOCUMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDocument(Document document) {
    this.document = document;
  }


  public CreateWhatsAppMessageRequest video(Video video) {
    this.video = video;
    return this;
  }

   /**
   * Get video
   * @return video
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VIDEO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Video getVideo() {
    return video;
  }


  @JsonProperty(JSON_PROPERTY_VIDEO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVideo(Video video) {
    this.video = video;
  }


  public CreateWhatsAppMessageRequest location(Location location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Location getLocation() {
    return location;
  }


  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocation(Location location) {
    this.location = location;
  }


  public CreateWhatsAppMessageRequest previewUrl(Boolean previewUrl) {
    this.previewUrl = previewUrl;
    return this;
  }

   /**
   * Specifying preview_url in the request is optional when not including a URL in your message. To include a URL preview, set preview_url to true in the message body and make sure the URL begins with http:// or https://.
   * @return previewUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifying preview_url in the request is optional when not including a URL in your message. To include a URL preview, set preview_url to true in the message body and make sure the URL begins with http:// or https://.")
  @JsonProperty(JSON_PROPERTY_PREVIEW_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPreviewUrl() {
    return previewUrl;
  }


  @JsonProperty(JSON_PROPERTY_PREVIEW_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreviewUrl(Boolean previewUrl) {
    this.previewUrl = previewUrl;
  }


  public CreateWhatsAppMessageRequest template(Template template) {
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Template getTemplate() {
    return template;
  }


  @JsonProperty(JSON_PROPERTY_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTemplate(Template template) {
    this.template = template;
  }


  /**
   * Return true if this CreateWhatsAppMessageRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateWhatsAppMessageRequest createWhatsAppMessageRequest = (CreateWhatsAppMessageRequest) o;
    return Objects.equals(this.whatsappUserId, createWhatsAppMessageRequest.whatsappUserId) &&
        Objects.equals(this.to, createWhatsAppMessageRequest.to) &&
        Objects.equals(this.type, createWhatsAppMessageRequest.type) &&
        Objects.equals(this.text, createWhatsAppMessageRequest.text) &&
        Objects.equals(this.audio, createWhatsAppMessageRequest.audio) &&
        Objects.equals(this.image, createWhatsAppMessageRequest.image) &&
        Objects.equals(this.document, createWhatsAppMessageRequest.document) &&
        Objects.equals(this.video, createWhatsAppMessageRequest.video) &&
        Objects.equals(this.location, createWhatsAppMessageRequest.location) &&
        Objects.equals(this.previewUrl, createWhatsAppMessageRequest.previewUrl) &&
        Objects.equals(this.template, createWhatsAppMessageRequest.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(whatsappUserId, to, type, text, audio, image, document, video, location, previewUrl, template);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateWhatsAppMessageRequest {\n");
    sb.append("    whatsappUserId: ").append(toIndentedString(whatsappUserId)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    audio: ").append(toIndentedString(audio)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    video: ").append(toIndentedString(video)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    previewUrl: ").append(toIndentedString(previewUrl)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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

