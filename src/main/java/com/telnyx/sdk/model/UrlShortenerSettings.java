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
 * The URL shortener feature allows automatic replacement of URLs that were generated using a public URL shortener service. Some examples include bit.do, bit.ly, goo.gl, ht.ly, is.gd, ow.ly, rebrand.ly, t.co, tiny.cc, and tinyurl.com. Such URLs are replaced with with links generated by Telnyx. The use of custom links can improve branding and message deliverability.  To disable this feature, set the object field to &#x60;null&#x60;. 
 */
@ApiModel(description = "The URL shortener feature allows automatic replacement of URLs that were generated using a public URL shortener service. Some examples include bit.do, bit.ly, goo.gl, ht.ly, is.gd, ow.ly, rebrand.ly, t.co, tiny.cc, and tinyurl.com. Such URLs are replaced with with links generated by Telnyx. The use of custom links can improve branding and message deliverability.  To disable this feature, set the object field to `null`. ")
@JsonPropertyOrder({
  UrlShortenerSettings.JSON_PROPERTY_DOMAIN,
  UrlShortenerSettings.JSON_PROPERTY_PREFIX,
  UrlShortenerSettings.JSON_PROPERTY_REPLACE_BLACKLIST_ONLY,
  UrlShortenerSettings.JSON_PROPERTY_SEND_WEBHOOKS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class UrlShortenerSettings {
  public static final String JSON_PROPERTY_DOMAIN = "domain";
  private String domain;

  public static final String JSON_PROPERTY_PREFIX = "prefix";
  private String prefix;

  public static final String JSON_PROPERTY_REPLACE_BLACKLIST_ONLY = "replace_blacklist_only";
  private Boolean replaceBlacklistOnly;

  public static final String JSON_PROPERTY_SEND_WEBHOOKS = "send_webhooks";
  private Boolean sendWebhooks;

  public UrlShortenerSettings() { 
  }

  public UrlShortenerSettings domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * One of the domains provided by the Telnyx URL shortener service. 
   * @return domain
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "acct.fyi", required = true, value = "One of the domains provided by the Telnyx URL shortener service. ")
  @JsonProperty(JSON_PROPERTY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDomain() {
    return domain;
  }


  @JsonProperty(JSON_PROPERTY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDomain(String domain) {
    this.domain = domain;
  }


  public UrlShortenerSettings prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

   /**
   * Optional prefix that can be used to identify your brand, and will appear in the Telnyx generated URLs after the domain name. 
   * @return prefix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "", value = "Optional prefix that can be used to identify your brand, and will appear in the Telnyx generated URLs after the domain name. ")
  @JsonProperty(JSON_PROPERTY_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrefix() {
    return prefix;
  }


  @JsonProperty(JSON_PROPERTY_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }


  public UrlShortenerSettings replaceBlacklistOnly(Boolean replaceBlacklistOnly) {
    this.replaceBlacklistOnly = replaceBlacklistOnly;
    return this;
  }

   /**
   * Use the link replacement tool only for links that are specifically blacklisted by Telnyx. 
   * @return replaceBlacklistOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Use the link replacement tool only for links that are specifically blacklisted by Telnyx. ")
  @JsonProperty(JSON_PROPERTY_REPLACE_BLACKLIST_ONLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getReplaceBlacklistOnly() {
    return replaceBlacklistOnly;
  }


  @JsonProperty(JSON_PROPERTY_REPLACE_BLACKLIST_ONLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReplaceBlacklistOnly(Boolean replaceBlacklistOnly) {
    this.replaceBlacklistOnly = replaceBlacklistOnly;
  }


  public UrlShortenerSettings sendWebhooks(Boolean sendWebhooks) {
    this.sendWebhooks = sendWebhooks;
    return this;
  }

   /**
   * Receive webhooks for when your replaced links are clicked. Webhooks are sent to the webhooks on the messaging profile. 
   * @return sendWebhooks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Receive webhooks for when your replaced links are clicked. Webhooks are sent to the webhooks on the messaging profile. ")
  @JsonProperty(JSON_PROPERTY_SEND_WEBHOOKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSendWebhooks() {
    return sendWebhooks;
  }


  @JsonProperty(JSON_PROPERTY_SEND_WEBHOOKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSendWebhooks(Boolean sendWebhooks) {
    this.sendWebhooks = sendWebhooks;
  }


  /**
   * Return true if this UrlShortenerSettings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UrlShortenerSettings urlShortenerSettings = (UrlShortenerSettings) o;
    return Objects.equals(this.domain, urlShortenerSettings.domain) &&
        Objects.equals(this.prefix, urlShortenerSettings.prefix) &&
        Objects.equals(this.replaceBlacklistOnly, urlShortenerSettings.replaceBlacklistOnly) &&
        Objects.equals(this.sendWebhooks, urlShortenerSettings.sendWebhooks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, prefix, replaceBlacklistOnly, sendWebhooks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UrlShortenerSettings {\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    replaceBlacklistOnly: ").append(toIndentedString(replaceBlacklistOnly)).append("\n");
    sb.append("    sendWebhooks: ").append(toIndentedString(sendWebhooks)).append("\n");
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

