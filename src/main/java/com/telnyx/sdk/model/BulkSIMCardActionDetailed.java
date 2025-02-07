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
import com.telnyx.sdk.model.SIMCardActionsSummary;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * BulkSIMCardActionDetailed
 */
@JsonPropertyOrder({
  BulkSIMCardActionDetailed.JSON_PROPERTY_ID,
  BulkSIMCardActionDetailed.JSON_PROPERTY_RECORD_TYPE,
  BulkSIMCardActionDetailed.JSON_PROPERTY_ACTION_TYPE,
  BulkSIMCardActionDetailed.JSON_PROPERTY_SETTINGS,
  BulkSIMCardActionDetailed.JSON_PROPERTY_SIM_CARD_ACTIONS_SUMMARY,
  BulkSIMCardActionDetailed.JSON_PROPERTY_CREATED_AT,
  BulkSIMCardActionDetailed.JSON_PROPERTY_UPDATED_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class BulkSIMCardActionDetailed {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  /**
   * The operation type. It can be one of the following: &lt;br/&gt; &lt;ul&gt; &lt;li&gt;&lt;code&gt;bulk_set_public_ips&lt;/code&gt; - set a public IP for each specified SIM card.&lt;/li&gt; &lt;/ul&gt;
   */
  public enum ActionTypeEnum {
    BULK_SET_PUBLIC_IPS(String.valueOf("bulk_set_public_ips"));

    private String value;

    ActionTypeEnum(String value) {
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
    public static ActionTypeEnum fromValue(String value) {
      for (ActionTypeEnum b : ActionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ACTION_TYPE = "action_type";
  private ActionTypeEnum actionType;

  public static final String JSON_PROPERTY_SETTINGS = "settings";
  private Object settings;

  public static final String JSON_PROPERTY_SIM_CARD_ACTIONS_SUMMARY = "sim_card_actions_summary";
  private List<SIMCardActionsSummary> simCardActionsSummary = null;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public BulkSIMCardActionDetailed() { 
  }

  @JsonCreator
  public BulkSIMCardActionDetailed(
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE) String recordType, 
    @JsonProperty(JSON_PROPERTY_ACTION_TYPE) ActionTypeEnum actionType, 
    @JsonProperty(JSON_PROPERTY_SETTINGS) Object settings, 
    @JsonProperty(JSON_PROPERTY_CREATED_AT) String createdAt, 
    @JsonProperty(JSON_PROPERTY_UPDATED_AT) String updatedAt
  ) {
    this();
    this.recordType = recordType;
    this.actionType = actionType;
    this.settings = settings;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

  public BulkSIMCardActionDetailed id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Identifies the type of resource.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0ccc7b54-4df3-4bca-a65a-3da1ecc777f0", value = "Identifies the type of resource.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(UUID id) {
    this.id = id;
  }


   /**
   * Get recordType
   * @return recordType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "bulk_sim_card_action", value = "")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecordType() {
    return recordType;
  }




   /**
   * The operation type. It can be one of the following: &lt;br/&gt; &lt;ul&gt; &lt;li&gt;&lt;code&gt;bulk_set_public_ips&lt;/code&gt; - set a public IP for each specified SIM card.&lt;/li&gt; &lt;/ul&gt;
   * @return actionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "bulk_set_public_ips", value = "The operation type. It can be one of the following: <br/> <ul> <li><code>bulk_set_public_ips</code> - set a public IP for each specified SIM card.</li> </ul>")
  @JsonProperty(JSON_PROPERTY_ACTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ActionTypeEnum getActionType() {
    return actionType;
  }




   /**
   * A JSON object representation of the bulk action payload.
   * @return settings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{}", value = "A JSON object representation of the bulk action payload.")
  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getSettings() {
    return settings;
  }




  public BulkSIMCardActionDetailed simCardActionsSummary(List<SIMCardActionsSummary> simCardActionsSummary) {
    this.simCardActionsSummary = simCardActionsSummary;
    return this;
  }

  public BulkSIMCardActionDetailed addsimCardActionsSummaryItem(SIMCardActionsSummary simCardActionsSummaryItem) {
    if (this.simCardActionsSummary == null) {
      this.simCardActionsSummary = new ArrayList<>();
    }
    this.simCardActionsSummary.add(simCardActionsSummaryItem);
    return this;
  }

   /**
   * Get simCardActionsSummary
   * @return simCardActionsSummary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SIM_CARD_ACTIONS_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SIMCardActionsSummary> getSimCardActionsSummary() {
    return simCardActionsSummary;
  }


  @JsonProperty(JSON_PROPERTY_SIM_CARD_ACTIONS_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSimCardActionsSummary(List<SIMCardActionsSummary> simCardActionsSummary) {
    this.simCardActionsSummary = simCardActionsSummary;
  }


   /**
   * ISO 8601 formatted date-time indicating when the resource was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-02-02T22:25:27.521Z", value = "ISO 8601 formatted date-time indicating when the resource was created.")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAt() {
    return createdAt;
  }




   /**
   * ISO 8601 formatted date-time indicating when the resource was updated.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-02-02T22:25:27.521Z", value = "ISO 8601 formatted date-time indicating when the resource was updated.")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUpdatedAt() {
    return updatedAt;
  }




  /**
   * Return true if this BulkSIMCardActionDetailed object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkSIMCardActionDetailed bulkSIMCardActionDetailed = (BulkSIMCardActionDetailed) o;
    return Objects.equals(this.id, bulkSIMCardActionDetailed.id) &&
        Objects.equals(this.recordType, bulkSIMCardActionDetailed.recordType) &&
        Objects.equals(this.actionType, bulkSIMCardActionDetailed.actionType) &&
        Objects.equals(this.settings, bulkSIMCardActionDetailed.settings) &&
        Objects.equals(this.simCardActionsSummary, bulkSIMCardActionDetailed.simCardActionsSummary) &&
        Objects.equals(this.createdAt, bulkSIMCardActionDetailed.createdAt) &&
        Objects.equals(this.updatedAt, bulkSIMCardActionDetailed.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, recordType, actionType, settings, simCardActionsSummary, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkSIMCardActionDetailed {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    simCardActionsSummary: ").append(toIndentedString(simCardActionsSummary)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

