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
import com.telnyx.sdk.model.OutboundCallRecording;
import com.telnyx.sdk.model.ServicePlan;
import com.telnyx.sdk.model.TrafficType;
import com.telnyx.sdk.model.UsagePaymentMethod;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * CreateOutboundVoiceProfileRequest
 */
@JsonPropertyOrder({
  CreateOutboundVoiceProfileRequest.JSON_PROPERTY_NAME,
  CreateOutboundVoiceProfileRequest.JSON_PROPERTY_TRAFFIC_TYPE,
  CreateOutboundVoiceProfileRequest.JSON_PROPERTY_SERVICE_PLAN,
  CreateOutboundVoiceProfileRequest.JSON_PROPERTY_CONCURRENT_CALL_LIMIT,
  CreateOutboundVoiceProfileRequest.JSON_PROPERTY_ENABLED,
  CreateOutboundVoiceProfileRequest.JSON_PROPERTY_TAGS,
  CreateOutboundVoiceProfileRequest.JSON_PROPERTY_USAGE_PAYMENT_METHOD,
  CreateOutboundVoiceProfileRequest.JSON_PROPERTY_WHITELISTED_DESTINATIONS,
  CreateOutboundVoiceProfileRequest.JSON_PROPERTY_MAX_DESTINATION_RATE,
  CreateOutboundVoiceProfileRequest.JSON_PROPERTY_DAILY_SPEND_LIMIT,
  CreateOutboundVoiceProfileRequest.JSON_PROPERTY_DAILY_SPEND_LIMIT_ENABLED,
  CreateOutboundVoiceProfileRequest.JSON_PROPERTY_CALL_RECORDING,
  CreateOutboundVoiceProfileRequest.JSON_PROPERTY_BILLING_GROUP_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class CreateOutboundVoiceProfileRequest {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TRAFFIC_TYPE = "traffic_type";
  private TrafficType trafficType = TrafficType.CONVERSATIONAL;

  public static final String JSON_PROPERTY_SERVICE_PLAN = "service_plan";
  private ServicePlan servicePlan = ServicePlan.GLOBAL;

  public static final String JSON_PROPERTY_CONCURRENT_CALL_LIMIT = "concurrent_call_limit";
  private JsonNullable<Integer> concurrentCallLimit = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled = true;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_USAGE_PAYMENT_METHOD = "usage_payment_method";
  private UsagePaymentMethod usagePaymentMethod = UsagePaymentMethod.RATE_DECK;

  public static final String JSON_PROPERTY_WHITELISTED_DESTINATIONS = "whitelisted_destinations";
  private List<String> whitelistedDestinations = null;

  public static final String JSON_PROPERTY_MAX_DESTINATION_RATE = "max_destination_rate";
  private BigDecimal maxDestinationRate;

  public static final String JSON_PROPERTY_DAILY_SPEND_LIMIT = "daily_spend_limit";
  private String dailySpendLimit;

  public static final String JSON_PROPERTY_DAILY_SPEND_LIMIT_ENABLED = "daily_spend_limit_enabled";
  private Boolean dailySpendLimitEnabled = false;

  public static final String JSON_PROPERTY_CALL_RECORDING = "call_recording";
  private OutboundCallRecording callRecording;

  public static final String JSON_PROPERTY_BILLING_GROUP_ID = "billing_group_id";
  private JsonNullable<UUID> billingGroupId = JsonNullable.<UUID>undefined();

  public CreateOutboundVoiceProfileRequest() { 
  }

  public CreateOutboundVoiceProfileRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A user-supplied name to help with organization.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "office", required = true, value = "A user-supplied name to help with organization.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public CreateOutboundVoiceProfileRequest trafficType(TrafficType trafficType) {
    this.trafficType = trafficType;
    return this;
  }

   /**
   * Get trafficType
   * @return trafficType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRAFFIC_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TrafficType getTrafficType() {
    return trafficType;
  }


  @JsonProperty(JSON_PROPERTY_TRAFFIC_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrafficType(TrafficType trafficType) {
    this.trafficType = trafficType;
  }


  public CreateOutboundVoiceProfileRequest servicePlan(ServicePlan servicePlan) {
    this.servicePlan = servicePlan;
    return this;
  }

   /**
   * Get servicePlan
   * @return servicePlan
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SERVICE_PLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ServicePlan getServicePlan() {
    return servicePlan;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_PLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServicePlan(ServicePlan servicePlan) {
    this.servicePlan = servicePlan;
  }


  public CreateOutboundVoiceProfileRequest concurrentCallLimit(Integer concurrentCallLimit) {
    this.concurrentCallLimit = JsonNullable.<Integer>of(concurrentCallLimit);
    return this;
  }

   /**
   * Must be no more than your global concurrent call limit. Null means no limit.
   * @return concurrentCallLimit
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "10", value = "Must be no more than your global concurrent call limit. Null means no limit.")
  @JsonIgnore

  public Integer getConcurrentCallLimit() {
        return concurrentCallLimit.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONCURRENT_CALL_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getConcurrentCallLimit_JsonNullable() {
    return concurrentCallLimit;
  }
  
  @JsonProperty(JSON_PROPERTY_CONCURRENT_CALL_LIMIT)
  public void setConcurrentCallLimit_JsonNullable(JsonNullable<Integer> concurrentCallLimit) {
    this.concurrentCallLimit = concurrentCallLimit;
  }

  public void setConcurrentCallLimit(Integer concurrentCallLimit) {
    this.concurrentCallLimit = JsonNullable.<Integer>of(concurrentCallLimit);
  }


  public CreateOutboundVoiceProfileRequest enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Specifies whether the outbound voice profile can be used. Disabled profiles will result in outbound calls being blocked for the associated Connections.
   * @return enabled
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Specifies whether the outbound voice profile can be used. Disabled profiles will result in outbound calls being blocked for the associated Connections.")
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public CreateOutboundVoiceProfileRequest tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public CreateOutboundVoiceProfileRequest addtagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "[\"office-profile\"]", value = "")
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public CreateOutboundVoiceProfileRequest usagePaymentMethod(UsagePaymentMethod usagePaymentMethod) {
    this.usagePaymentMethod = usagePaymentMethod;
    return this;
  }

   /**
   * Get usagePaymentMethod
   * @return usagePaymentMethod
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USAGE_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UsagePaymentMethod getUsagePaymentMethod() {
    return usagePaymentMethod;
  }


  @JsonProperty(JSON_PROPERTY_USAGE_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsagePaymentMethod(UsagePaymentMethod usagePaymentMethod) {
    this.usagePaymentMethod = usagePaymentMethod;
  }


  public CreateOutboundVoiceProfileRequest whitelistedDestinations(List<String> whitelistedDestinations) {
    this.whitelistedDestinations = whitelistedDestinations;
    return this;
  }

  public CreateOutboundVoiceProfileRequest addwhitelistedDestinationsItem(String whitelistedDestinationsItem) {
    if (this.whitelistedDestinations == null) {
      this.whitelistedDestinations = new ArrayList<>(Arrays.asList("US", "CA"));
    }
    this.whitelistedDestinations.add(whitelistedDestinationsItem);
    return this;
  }

   /**
   * The list of destinations you want to be able to call using this outbound voice profile formatted in alpha2.
   * @return whitelistedDestinations
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "[\"US\",\"BR\",\"AU\"]", value = "The list of destinations you want to be able to call using this outbound voice profile formatted in alpha2.")
  @JsonProperty(JSON_PROPERTY_WHITELISTED_DESTINATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getWhitelistedDestinations() {
    return whitelistedDestinations;
  }


  @JsonProperty(JSON_PROPERTY_WHITELISTED_DESTINATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWhitelistedDestinations(List<String> whitelistedDestinations) {
    this.whitelistedDestinations = whitelistedDestinations;
  }


  public CreateOutboundVoiceProfileRequest maxDestinationRate(BigDecimal maxDestinationRate) {
    this.maxDestinationRate = maxDestinationRate;
    return this;
  }

   /**
   * Maximum rate (price per minute) for a Destination to be allowed when making outbound calls.
   * @return maxDestinationRate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Maximum rate (price per minute) for a Destination to be allowed when making outbound calls.")
  @JsonProperty(JSON_PROPERTY_MAX_DESTINATION_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getMaxDestinationRate() {
    return maxDestinationRate;
  }


  @JsonProperty(JSON_PROPERTY_MAX_DESTINATION_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxDestinationRate(BigDecimal maxDestinationRate) {
    this.maxDestinationRate = maxDestinationRate;
  }


  public CreateOutboundVoiceProfileRequest dailySpendLimit(String dailySpendLimit) {
    this.dailySpendLimit = dailySpendLimit;
    return this;
  }

   /**
   * The maximum amount of usage charges, in USD, you want Telnyx to allow on this outbound voice profile in a day before disallowing new calls.
   * @return dailySpendLimit
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "100.00", value = "The maximum amount of usage charges, in USD, you want Telnyx to allow on this outbound voice profile in a day before disallowing new calls.")
  @JsonProperty(JSON_PROPERTY_DAILY_SPEND_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDailySpendLimit() {
    return dailySpendLimit;
  }


  @JsonProperty(JSON_PROPERTY_DAILY_SPEND_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDailySpendLimit(String dailySpendLimit) {
    this.dailySpendLimit = dailySpendLimit;
  }


  public CreateOutboundVoiceProfileRequest dailySpendLimitEnabled(Boolean dailySpendLimitEnabled) {
    this.dailySpendLimitEnabled = dailySpendLimitEnabled;
    return this;
  }

   /**
   * Specifies whether to enforce the daily_spend_limit on this outbound voice profile.
   * @return dailySpendLimitEnabled
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Specifies whether to enforce the daily_spend_limit on this outbound voice profile.")
  @JsonProperty(JSON_PROPERTY_DAILY_SPEND_LIMIT_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDailySpendLimitEnabled() {
    return dailySpendLimitEnabled;
  }


  @JsonProperty(JSON_PROPERTY_DAILY_SPEND_LIMIT_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDailySpendLimitEnabled(Boolean dailySpendLimitEnabled) {
    this.dailySpendLimitEnabled = dailySpendLimitEnabled;
  }


  public CreateOutboundVoiceProfileRequest callRecording(OutboundCallRecording callRecording) {
    this.callRecording = callRecording;
    return this;
  }

   /**
   * Get callRecording
   * @return callRecording
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CALL_RECORDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OutboundCallRecording getCallRecording() {
    return callRecording;
  }


  @JsonProperty(JSON_PROPERTY_CALL_RECORDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCallRecording(OutboundCallRecording callRecording) {
    this.callRecording = callRecording;
  }


  public CreateOutboundVoiceProfileRequest billingGroupId(UUID billingGroupId) {
    this.billingGroupId = JsonNullable.<UUID>of(billingGroupId);
    return this;
  }

   /**
   * The ID of the billing group associated with the outbound proflile. Defaults to null (for no group assigned).
   * @return billingGroupId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "6a09cdc3-8948-47f0-aa62-74ac943d6c58", value = "The ID of the billing group associated with the outbound proflile. Defaults to null (for no group assigned).")
  @JsonIgnore

  public UUID getBillingGroupId() {
        return billingGroupId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BILLING_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<UUID> getBillingGroupId_JsonNullable() {
    return billingGroupId;
  }
  
  @JsonProperty(JSON_PROPERTY_BILLING_GROUP_ID)
  public void setBillingGroupId_JsonNullable(JsonNullable<UUID> billingGroupId) {
    this.billingGroupId = billingGroupId;
  }

  public void setBillingGroupId(UUID billingGroupId) {
    this.billingGroupId = JsonNullable.<UUID>of(billingGroupId);
  }


  /**
   * Return true if this CreateOutboundVoiceProfileRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOutboundVoiceProfileRequest createOutboundVoiceProfileRequest = (CreateOutboundVoiceProfileRequest) o;
    return Objects.equals(this.name, createOutboundVoiceProfileRequest.name) &&
        Objects.equals(this.trafficType, createOutboundVoiceProfileRequest.trafficType) &&
        Objects.equals(this.servicePlan, createOutboundVoiceProfileRequest.servicePlan) &&
        equalsNullable(this.concurrentCallLimit, createOutboundVoiceProfileRequest.concurrentCallLimit) &&
        Objects.equals(this.enabled, createOutboundVoiceProfileRequest.enabled) &&
        Objects.equals(this.tags, createOutboundVoiceProfileRequest.tags) &&
        Objects.equals(this.usagePaymentMethod, createOutboundVoiceProfileRequest.usagePaymentMethod) &&
        Objects.equals(this.whitelistedDestinations, createOutboundVoiceProfileRequest.whitelistedDestinations) &&
        Objects.equals(this.maxDestinationRate, createOutboundVoiceProfileRequest.maxDestinationRate) &&
        Objects.equals(this.dailySpendLimit, createOutboundVoiceProfileRequest.dailySpendLimit) &&
        Objects.equals(this.dailySpendLimitEnabled, createOutboundVoiceProfileRequest.dailySpendLimitEnabled) &&
        Objects.equals(this.callRecording, createOutboundVoiceProfileRequest.callRecording) &&
        equalsNullable(this.billingGroupId, createOutboundVoiceProfileRequest.billingGroupId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, trafficType, servicePlan, hashCodeNullable(concurrentCallLimit), enabled, tags, usagePaymentMethod, whitelistedDestinations, maxDestinationRate, dailySpendLimit, dailySpendLimitEnabled, callRecording, hashCodeNullable(billingGroupId));
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
    sb.append("class CreateOutboundVoiceProfileRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    trafficType: ").append(toIndentedString(trafficType)).append("\n");
    sb.append("    servicePlan: ").append(toIndentedString(servicePlan)).append("\n");
    sb.append("    concurrentCallLimit: ").append(toIndentedString(concurrentCallLimit)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    usagePaymentMethod: ").append(toIndentedString(usagePaymentMethod)).append("\n");
    sb.append("    whitelistedDestinations: ").append(toIndentedString(whitelistedDestinations)).append("\n");
    sb.append("    maxDestinationRate: ").append(toIndentedString(maxDestinationRate)).append("\n");
    sb.append("    dailySpendLimit: ").append(toIndentedString(dailySpendLimit)).append("\n");
    sb.append("    dailySpendLimitEnabled: ").append(toIndentedString(dailySpendLimitEnabled)).append("\n");
    sb.append("    callRecording: ").append(toIndentedString(callRecording)).append("\n");
    sb.append("    billingGroupId: ").append(toIndentedString(billingGroupId)).append("\n");
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

