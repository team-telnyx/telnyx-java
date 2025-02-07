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
import com.telnyx.sdk.model.CallControlApplicationInbound;
import com.telnyx.sdk.model.CallControlApplicationOutbound;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * CreateCallControlApplicationRequest
 */
@JsonPropertyOrder({
  CreateCallControlApplicationRequest.JSON_PROPERTY_APPLICATION_NAME,
  CreateCallControlApplicationRequest.JSON_PROPERTY_WEBHOOK_EVENT_URL,
  CreateCallControlApplicationRequest.JSON_PROPERTY_ACTIVE,
  CreateCallControlApplicationRequest.JSON_PROPERTY_ANCHORSITE_OVERRIDE,
  CreateCallControlApplicationRequest.JSON_PROPERTY_DTMF_TYPE,
  CreateCallControlApplicationRequest.JSON_PROPERTY_FIRST_COMMAND_TIMEOUT,
  CreateCallControlApplicationRequest.JSON_PROPERTY_FIRST_COMMAND_TIMEOUT_SECS,
  CreateCallControlApplicationRequest.JSON_PROPERTY_INBOUND,
  CreateCallControlApplicationRequest.JSON_PROPERTY_OUTBOUND,
  CreateCallControlApplicationRequest.JSON_PROPERTY_WEBHOOK_API_VERSION,
  CreateCallControlApplicationRequest.JSON_PROPERTY_WEBHOOK_EVENT_FAILOVER_URL,
  CreateCallControlApplicationRequest.JSON_PROPERTY_WEBHOOK_TIMEOUT_SECS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class CreateCallControlApplicationRequest {
  public static final String JSON_PROPERTY_APPLICATION_NAME = "application_name";
  private String applicationName;

  public static final String JSON_PROPERTY_WEBHOOK_EVENT_URL = "webhook_event_url";
  private String webhookEventUrl;

  public static final String JSON_PROPERTY_ACTIVE = "active";
  private Boolean active = true;

  /**
   * &lt;code&gt;Latency&lt;/code&gt; directs Telnyx to route media through the site with the lowest round-trip time to the user&#39;s connection. Telnyx calculates this time using ICMP ping messages. This can be disabled by specifying a site to handle all media. 
   */
  public enum AnchorsiteOverrideEnum {
    _LATENCY_(String.valueOf("\"Latency\"")),
    
    _CHICAGO_IL_(String.valueOf("\"Chicago, IL\"")),
    
    _ASHBURN_VA_(String.valueOf("\"Ashburn, VA\"")),
    
    _SAN_JOSE_CA_(String.valueOf("\"San Jose, CA\""));

    private String value;

    AnchorsiteOverrideEnum(String value) {
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
    public static AnchorsiteOverrideEnum fromValue(String value) {
      for (AnchorsiteOverrideEnum b : AnchorsiteOverrideEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ANCHORSITE_OVERRIDE = "anchorsite_override";
  private AnchorsiteOverrideEnum anchorsiteOverride = AnchorsiteOverrideEnum._LATENCY_;

  /**
   * Sets the type of DTMF digits sent from Telnyx to this Connection. Note that DTMF digits sent to Telnyx will be accepted in all formats.
   */
  public enum DtmfTypeEnum {
    RFC_2833(String.valueOf("RFC 2833")),
    
    INBAND(String.valueOf("Inband")),
    
    SIP_INFO(String.valueOf("SIP INFO"));

    private String value;

    DtmfTypeEnum(String value) {
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
    public static DtmfTypeEnum fromValue(String value) {
      for (DtmfTypeEnum b : DtmfTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DTMF_TYPE = "dtmf_type";
  private DtmfTypeEnum dtmfType = DtmfTypeEnum.RFC_2833;

  public static final String JSON_PROPERTY_FIRST_COMMAND_TIMEOUT = "first_command_timeout";
  private Boolean firstCommandTimeout = false;

  public static final String JSON_PROPERTY_FIRST_COMMAND_TIMEOUT_SECS = "first_command_timeout_secs";
  private Integer firstCommandTimeoutSecs = 30;

  public static final String JSON_PROPERTY_INBOUND = "inbound";
  private CallControlApplicationInbound inbound;

  public static final String JSON_PROPERTY_OUTBOUND = "outbound";
  private CallControlApplicationOutbound outbound;

  /**
   * Determines which webhook format will be used, Telnyx API v1 or v2.
   */
  public enum WebhookApiVersionEnum {
    _1(String.valueOf("1")),
    
    _2(String.valueOf("2"));

    private String value;

    WebhookApiVersionEnum(String value) {
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
    public static WebhookApiVersionEnum fromValue(String value) {
      for (WebhookApiVersionEnum b : WebhookApiVersionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_WEBHOOK_API_VERSION = "webhook_api_version";
  private WebhookApiVersionEnum webhookApiVersion = WebhookApiVersionEnum._1;

  public static final String JSON_PROPERTY_WEBHOOK_EVENT_FAILOVER_URL = "webhook_event_failover_url";
  private JsonNullable<String> webhookEventFailoverUrl = JsonNullable.<String>of("");

  public static final String JSON_PROPERTY_WEBHOOK_TIMEOUT_SECS = "webhook_timeout_secs";
  private JsonNullable<Integer> webhookTimeoutSecs = JsonNullable.<Integer>undefined();

  public CreateCallControlApplicationRequest() { 
  }

  public CreateCallControlApplicationRequest applicationName(String applicationName) {
    this.applicationName = applicationName;
    return this;
  }

   /**
   * A user-assigned name to help manage the application.
   * @return applicationName
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "call-router", required = true, value = "A user-assigned name to help manage the application.")
  @JsonProperty(JSON_PROPERTY_APPLICATION_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getApplicationName() {
    return applicationName;
  }


  @JsonProperty(JSON_PROPERTY_APPLICATION_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setApplicationName(String applicationName) {
    this.applicationName = applicationName;
  }


  public CreateCallControlApplicationRequest webhookEventUrl(String webhookEventUrl) {
    this.webhookEventUrl = webhookEventUrl;
    return this;
  }

   /**
   * The URL where webhooks related to this connection will be sent. Must include a scheme, such as &#39;https&#39;.
   * @return webhookEventUrl
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "https://example.com", required = true, value = "The URL where webhooks related to this connection will be sent. Must include a scheme, such as 'https'.")
  @JsonProperty(JSON_PROPERTY_WEBHOOK_EVENT_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getWebhookEventUrl() {
    return webhookEventUrl;
  }


  @JsonProperty(JSON_PROPERTY_WEBHOOK_EVENT_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWebhookEventUrl(String webhookEventUrl) {
    this.webhookEventUrl = webhookEventUrl;
  }


  public CreateCallControlApplicationRequest active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Specifies whether the connection can be used.
   * @return active
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Specifies whether the connection can be used.")
  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getActive() {
    return active;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActive(Boolean active) {
    this.active = active;
  }


  public CreateCallControlApplicationRequest anchorsiteOverride(AnchorsiteOverrideEnum anchorsiteOverride) {
    this.anchorsiteOverride = anchorsiteOverride;
    return this;
  }

   /**
   * &lt;code&gt;Latency&lt;/code&gt; directs Telnyx to route media through the site with the lowest round-trip time to the user&#39;s connection. Telnyx calculates this time using ICMP ping messages. This can be disabled by specifying a site to handle all media. 
   * @return anchorsiteOverride
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "\"Amsterdam, Netherlands\"", value = "<code>Latency</code> directs Telnyx to route media through the site with the lowest round-trip time to the user's connection. Telnyx calculates this time using ICMP ping messages. This can be disabled by specifying a site to handle all media. ")
  @JsonProperty(JSON_PROPERTY_ANCHORSITE_OVERRIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AnchorsiteOverrideEnum getAnchorsiteOverride() {
    return anchorsiteOverride;
  }


  @JsonProperty(JSON_PROPERTY_ANCHORSITE_OVERRIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnchorsiteOverride(AnchorsiteOverrideEnum anchorsiteOverride) {
    this.anchorsiteOverride = anchorsiteOverride;
  }


  public CreateCallControlApplicationRequest dtmfType(DtmfTypeEnum dtmfType) {
    this.dtmfType = dtmfType;
    return this;
  }

   /**
   * Sets the type of DTMF digits sent from Telnyx to this Connection. Note that DTMF digits sent to Telnyx will be accepted in all formats.
   * @return dtmfType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Inband", value = "Sets the type of DTMF digits sent from Telnyx to this Connection. Note that DTMF digits sent to Telnyx will be accepted in all formats.")
  @JsonProperty(JSON_PROPERTY_DTMF_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DtmfTypeEnum getDtmfType() {
    return dtmfType;
  }


  @JsonProperty(JSON_PROPERTY_DTMF_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDtmfType(DtmfTypeEnum dtmfType) {
    this.dtmfType = dtmfType;
  }


  public CreateCallControlApplicationRequest firstCommandTimeout(Boolean firstCommandTimeout) {
    this.firstCommandTimeout = firstCommandTimeout;
    return this;
  }

   /**
   * Specifies whether calls to phone numbers associated with this connection should hangup after timing out.
   * @return firstCommandTimeout
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Specifies whether calls to phone numbers associated with this connection should hangup after timing out.")
  @JsonProperty(JSON_PROPERTY_FIRST_COMMAND_TIMEOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFirstCommandTimeout() {
    return firstCommandTimeout;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_COMMAND_TIMEOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstCommandTimeout(Boolean firstCommandTimeout) {
    this.firstCommandTimeout = firstCommandTimeout;
  }


  public CreateCallControlApplicationRequest firstCommandTimeoutSecs(Integer firstCommandTimeoutSecs) {
    this.firstCommandTimeoutSecs = firstCommandTimeoutSecs;
    return this;
  }

   /**
   * Specifies how many seconds to wait before timing out a dial command.
   * @return firstCommandTimeoutSecs
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "10", value = "Specifies how many seconds to wait before timing out a dial command.")
  @JsonProperty(JSON_PROPERTY_FIRST_COMMAND_TIMEOUT_SECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFirstCommandTimeoutSecs() {
    return firstCommandTimeoutSecs;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_COMMAND_TIMEOUT_SECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstCommandTimeoutSecs(Integer firstCommandTimeoutSecs) {
    this.firstCommandTimeoutSecs = firstCommandTimeoutSecs;
  }


  public CreateCallControlApplicationRequest inbound(CallControlApplicationInbound inbound) {
    this.inbound = inbound;
    return this;
  }

   /**
   * Get inbound
   * @return inbound
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INBOUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CallControlApplicationInbound getInbound() {
    return inbound;
  }


  @JsonProperty(JSON_PROPERTY_INBOUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInbound(CallControlApplicationInbound inbound) {
    this.inbound = inbound;
  }


  public CreateCallControlApplicationRequest outbound(CallControlApplicationOutbound outbound) {
    this.outbound = outbound;
    return this;
  }

   /**
   * Get outbound
   * @return outbound
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OUTBOUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CallControlApplicationOutbound getOutbound() {
    return outbound;
  }


  @JsonProperty(JSON_PROPERTY_OUTBOUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutbound(CallControlApplicationOutbound outbound) {
    this.outbound = outbound;
  }


  public CreateCallControlApplicationRequest webhookApiVersion(WebhookApiVersionEnum webhookApiVersion) {
    this.webhookApiVersion = webhookApiVersion;
    return this;
  }

   /**
   * Determines which webhook format will be used, Telnyx API v1 or v2.
   * @return webhookApiVersion
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Determines which webhook format will be used, Telnyx API v1 or v2.")
  @JsonProperty(JSON_PROPERTY_WEBHOOK_API_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WebhookApiVersionEnum getWebhookApiVersion() {
    return webhookApiVersion;
  }


  @JsonProperty(JSON_PROPERTY_WEBHOOK_API_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebhookApiVersion(WebhookApiVersionEnum webhookApiVersion) {
    this.webhookApiVersion = webhookApiVersion;
  }


  public CreateCallControlApplicationRequest webhookEventFailoverUrl(String webhookEventFailoverUrl) {
    this.webhookEventFailoverUrl = JsonNullable.<String>of(webhookEventFailoverUrl);
    return this;
  }

   /**
   * The failover URL where webhooks related to this connection will be sent if sending to the primary URL fails. Must include a scheme, such as &#39;https&#39;.
   * @return webhookEventFailoverUrl
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "https://failover.example.com", value = "The failover URL where webhooks related to this connection will be sent if sending to the primary URL fails. Must include a scheme, such as 'https'.")
  @JsonIgnore

  public String getWebhookEventFailoverUrl() {
        return webhookEventFailoverUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WEBHOOK_EVENT_FAILOVER_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getWebhookEventFailoverUrl_JsonNullable() {
    return webhookEventFailoverUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_WEBHOOK_EVENT_FAILOVER_URL)
  public void setWebhookEventFailoverUrl_JsonNullable(JsonNullable<String> webhookEventFailoverUrl) {
    this.webhookEventFailoverUrl = webhookEventFailoverUrl;
  }

  public void setWebhookEventFailoverUrl(String webhookEventFailoverUrl) {
    this.webhookEventFailoverUrl = JsonNullable.<String>of(webhookEventFailoverUrl);
  }


  public CreateCallControlApplicationRequest webhookTimeoutSecs(Integer webhookTimeoutSecs) {
    this.webhookTimeoutSecs = JsonNullable.<Integer>of(webhookTimeoutSecs);
    return this;
  }

   /**
   * Specifies how many seconds to wait before timing out a webhook.
   * minimum: 0
   * maximum: 30
   * @return webhookTimeoutSecs
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "25", value = "Specifies how many seconds to wait before timing out a webhook.")
  @JsonIgnore

  public Integer getWebhookTimeoutSecs() {
        return webhookTimeoutSecs.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WEBHOOK_TIMEOUT_SECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getWebhookTimeoutSecs_JsonNullable() {
    return webhookTimeoutSecs;
  }
  
  @JsonProperty(JSON_PROPERTY_WEBHOOK_TIMEOUT_SECS)
  public void setWebhookTimeoutSecs_JsonNullable(JsonNullable<Integer> webhookTimeoutSecs) {
    this.webhookTimeoutSecs = webhookTimeoutSecs;
  }

  public void setWebhookTimeoutSecs(Integer webhookTimeoutSecs) {
    this.webhookTimeoutSecs = JsonNullable.<Integer>of(webhookTimeoutSecs);
  }


  /**
   * Return true if this CreateCallControlApplicationRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCallControlApplicationRequest createCallControlApplicationRequest = (CreateCallControlApplicationRequest) o;
    return Objects.equals(this.applicationName, createCallControlApplicationRequest.applicationName) &&
        Objects.equals(this.webhookEventUrl, createCallControlApplicationRequest.webhookEventUrl) &&
        Objects.equals(this.active, createCallControlApplicationRequest.active) &&
        Objects.equals(this.anchorsiteOverride, createCallControlApplicationRequest.anchorsiteOverride) &&
        Objects.equals(this.dtmfType, createCallControlApplicationRequest.dtmfType) &&
        Objects.equals(this.firstCommandTimeout, createCallControlApplicationRequest.firstCommandTimeout) &&
        Objects.equals(this.firstCommandTimeoutSecs, createCallControlApplicationRequest.firstCommandTimeoutSecs) &&
        Objects.equals(this.inbound, createCallControlApplicationRequest.inbound) &&
        Objects.equals(this.outbound, createCallControlApplicationRequest.outbound) &&
        Objects.equals(this.webhookApiVersion, createCallControlApplicationRequest.webhookApiVersion) &&
        equalsNullable(this.webhookEventFailoverUrl, createCallControlApplicationRequest.webhookEventFailoverUrl) &&
        equalsNullable(this.webhookTimeoutSecs, createCallControlApplicationRequest.webhookTimeoutSecs);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationName, webhookEventUrl, active, anchorsiteOverride, dtmfType, firstCommandTimeout, firstCommandTimeoutSecs, inbound, outbound, webhookApiVersion, hashCodeNullable(webhookEventFailoverUrl), hashCodeNullable(webhookTimeoutSecs));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCallControlApplicationRequest {\n");
    sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
    sb.append("    webhookEventUrl: ").append(toIndentedString(webhookEventUrl)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    anchorsiteOverride: ").append(toIndentedString(anchorsiteOverride)).append("\n");
    sb.append("    dtmfType: ").append(toIndentedString(dtmfType)).append("\n");
    sb.append("    firstCommandTimeout: ").append(toIndentedString(firstCommandTimeout)).append("\n");
    sb.append("    firstCommandTimeoutSecs: ").append(toIndentedString(firstCommandTimeoutSecs)).append("\n");
    sb.append("    inbound: ").append(toIndentedString(inbound)).append("\n");
    sb.append("    outbound: ").append(toIndentedString(outbound)).append("\n");
    sb.append("    webhookApiVersion: ").append(toIndentedString(webhookApiVersion)).append("\n");
    sb.append("    webhookEventFailoverUrl: ").append(toIndentedString(webhookEventFailoverUrl)).append("\n");
    sb.append("    webhookTimeoutSecs: ").append(toIndentedString(webhookTimeoutSecs)).append("\n");
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

