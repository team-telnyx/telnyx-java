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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * CreateGroupMMSMessageRequest
 */
@JsonPropertyOrder({
  CreateGroupMMSMessageRequest.JSON_PROPERTY_FROM,
  CreateGroupMMSMessageRequest.JSON_PROPERTY_TO,
  CreateGroupMMSMessageRequest.JSON_PROPERTY_TEXT,
  CreateGroupMMSMessageRequest.JSON_PROPERTY_SUBJECT,
  CreateGroupMMSMessageRequest.JSON_PROPERTY_MEDIA_URLS,
  CreateGroupMMSMessageRequest.JSON_PROPERTY_WEBHOOK_URL,
  CreateGroupMMSMessageRequest.JSON_PROPERTY_WEBHOOK_FAILOVER_URL,
  CreateGroupMMSMessageRequest.JSON_PROPERTY_USE_PROFILE_WEBHOOKS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class CreateGroupMMSMessageRequest {
  public static final String JSON_PROPERTY_FROM = "from";
  private String from;

  public static final String JSON_PROPERTY_TO = "to";
  private List<String> to = new ArrayList<>();

  public static final String JSON_PROPERTY_TEXT = "text";
  private String text;

  public static final String JSON_PROPERTY_SUBJECT = "subject";
  private String subject;

  public static final String JSON_PROPERTY_MEDIA_URLS = "media_urls";
  private List<String> mediaUrls = null;

  public static final String JSON_PROPERTY_WEBHOOK_URL = "webhook_url";
  private String webhookUrl;

  public static final String JSON_PROPERTY_WEBHOOK_FAILOVER_URL = "webhook_failover_url";
  private String webhookFailoverUrl;

  public static final String JSON_PROPERTY_USE_PROFILE_WEBHOOKS = "use_profile_webhooks";
  private Boolean useProfileWebhooks = true;

  public CreateGroupMMSMessageRequest() { 
  }

  public CreateGroupMMSMessageRequest from(String from) {
    this.from = from;
    return this;
  }

   /**
   * Phone number, in +E.164 format, used to send the message.
   * @return from
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Phone number, in +E.164 format, used to send the message.")
  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFrom() {
    return from;
  }


  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFrom(String from) {
    this.from = from;
  }


  public CreateGroupMMSMessageRequest to(List<String> to) {
    this.to = to;
    return this;
  }

  public CreateGroupMMSMessageRequest addtoItem(String toItem) {
    this.to.add(toItem);
    return this;
  }

   /**
   * A list of destinations. No more than 8 destinations are allowed.
   * @return to
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of destinations. No more than 8 destinations are allowed.")
  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getTo() {
    return to;
  }


  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTo(List<String> to) {
    this.to = to;
  }


  public CreateGroupMMSMessageRequest text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Message body (i.e., content) as a non-empty string.
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Message body (i.e., content) as a non-empty string.")
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getText() {
    return text;
  }


  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setText(String text) {
    this.text = text;
  }


  public CreateGroupMMSMessageRequest subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Subject of multimedia message
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Subject of multimedia message")
  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubject() {
    return subject;
  }


  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubject(String subject) {
    this.subject = subject;
  }


  public CreateGroupMMSMessageRequest mediaUrls(List<String> mediaUrls) {
    this.mediaUrls = mediaUrls;
    return this;
  }

  public CreateGroupMMSMessageRequest addmediaUrlsItem(String mediaUrlsItem) {
    if (this.mediaUrls == null) {
      this.mediaUrls = new ArrayList<>();
    }
    this.mediaUrls.add(mediaUrlsItem);
    return this;
  }

   /**
   * A list of media URLs. The total media size must be less than 1 MB.
   * @return mediaUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of media URLs. The total media size must be less than 1 MB.")
  @JsonProperty(JSON_PROPERTY_MEDIA_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getMediaUrls() {
    return mediaUrls;
  }


  @JsonProperty(JSON_PROPERTY_MEDIA_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMediaUrls(List<String> mediaUrls) {
    this.mediaUrls = mediaUrls;
  }


  public CreateGroupMMSMessageRequest webhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
    return this;
  }

   /**
   * The URL where webhooks related to this message will be sent.
   * @return webhookUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL where webhooks related to this message will be sent.")
  @JsonProperty(JSON_PROPERTY_WEBHOOK_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWebhookUrl() {
    return webhookUrl;
  }


  @JsonProperty(JSON_PROPERTY_WEBHOOK_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
  }


  public CreateGroupMMSMessageRequest webhookFailoverUrl(String webhookFailoverUrl) {
    this.webhookFailoverUrl = webhookFailoverUrl;
    return this;
  }

   /**
   * The failover URL where webhooks related to this message will be sent if sending to the primary URL fails.
   * @return webhookFailoverUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The failover URL where webhooks related to this message will be sent if sending to the primary URL fails.")
  @JsonProperty(JSON_PROPERTY_WEBHOOK_FAILOVER_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWebhookFailoverUrl() {
    return webhookFailoverUrl;
  }


  @JsonProperty(JSON_PROPERTY_WEBHOOK_FAILOVER_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebhookFailoverUrl(String webhookFailoverUrl) {
    this.webhookFailoverUrl = webhookFailoverUrl;
  }


  public CreateGroupMMSMessageRequest useProfileWebhooks(Boolean useProfileWebhooks) {
    this.useProfileWebhooks = useProfileWebhooks;
    return this;
  }

   /**
   * If the profile this number is associated with has webhooks, use them for delivery notifications. If webhooks are also specified on the message itself, they will be attempted first, then those on the profile.
   * @return useProfileWebhooks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the profile this number is associated with has webhooks, use them for delivery notifications. If webhooks are also specified on the message itself, they will be attempted first, then those on the profile.")
  @JsonProperty(JSON_PROPERTY_USE_PROFILE_WEBHOOKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUseProfileWebhooks() {
    return useProfileWebhooks;
  }


  @JsonProperty(JSON_PROPERTY_USE_PROFILE_WEBHOOKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUseProfileWebhooks(Boolean useProfileWebhooks) {
    this.useProfileWebhooks = useProfileWebhooks;
  }


  /**
   * Return true if this CreateGroupMMSMessageRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateGroupMMSMessageRequest createGroupMMSMessageRequest = (CreateGroupMMSMessageRequest) o;
    return Objects.equals(this.from, createGroupMMSMessageRequest.from) &&
        Objects.equals(this.to, createGroupMMSMessageRequest.to) &&
        Objects.equals(this.text, createGroupMMSMessageRequest.text) &&
        Objects.equals(this.subject, createGroupMMSMessageRequest.subject) &&
        Objects.equals(this.mediaUrls, createGroupMMSMessageRequest.mediaUrls) &&
        Objects.equals(this.webhookUrl, createGroupMMSMessageRequest.webhookUrl) &&
        Objects.equals(this.webhookFailoverUrl, createGroupMMSMessageRequest.webhookFailoverUrl) &&
        Objects.equals(this.useProfileWebhooks, createGroupMMSMessageRequest.useProfileWebhooks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to, text, subject, mediaUrls, webhookUrl, webhookFailoverUrl, useProfileWebhooks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateGroupMMSMessageRequest {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    mediaUrls: ").append(toIndentedString(mediaUrls)).append("\n");
    sb.append("    webhookUrl: ").append(toIndentedString(webhookUrl)).append("\n");
    sb.append("    webhookFailoverUrl: ").append(toIndentedString(webhookFailoverUrl)).append("\n");
    sb.append("    useProfileWebhooks: ").append(toIndentedString(useProfileWebhooks)).append("\n");
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

