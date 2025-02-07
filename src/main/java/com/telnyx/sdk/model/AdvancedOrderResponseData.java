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
 import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
 import java.util.Arrays;
 import java.util.LinkedHashSet;
 import java.util.Set;
 import java.util.UUID;
 import com.fasterxml.jackson.annotation.JsonPropertyOrder;
 import com.telnyx.sdk.JSON;
 
 /**
  * AdvancedOrderResponseData
  */
 @JsonPropertyOrder({
     AdvancedOrderResponseData.JSON_PROPERTY_COUNTRY_CODE,
     AdvancedOrderResponseData.JSON_PROPERTY_COMMENTS,
     AdvancedOrderResponseData.JSON_PROPERTY_QUANTITY,
     AdvancedOrderResponseData.JSON_PROPERTY_AREA_CODE,
     AdvancedOrderResponseData.JSON_PROPERTY_PHONE_NUMBER_TYPE,
     AdvancedOrderResponseData.JSON_PROPERTY_FEATURES,
     AdvancedOrderResponseData.JSON_PROPERTY_CUSTOMER_REFERENCE,
     AdvancedOrderResponseData.JSON_PROPERTY_ID,
     AdvancedOrderResponseData.JSON_PROPERTY_STATUS,
     AdvancedOrderResponseData.JSON_PROPERTY_ORDERS
 })
 @javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
 public class AdvancedOrderResponseData {
   public static final String JSON_PROPERTY_COUNTRY_CODE = "country_code";
   private String countryCode = "US";
 
   public static final String JSON_PROPERTY_COMMENTS = "comments";
   private String comments = "";
 
   public static final String JSON_PROPERTY_QUANTITY = "quantity";
   private Integer quantity = 1;
 
   public static final String JSON_PROPERTY_AREA_CODE = "area_code";
   private String areaCode = "";
 
   /**
    * Gets or Sets phoneNumberType
    */
   public enum PhoneNumberTypeEnum {
     LOCAL("local"),
     MOBILE("mobile"),
     TOLL_FREE("toll_free"),
     SHARED_COST("shared_cost"),
     NATIONAL("national"),
     LANDLINE("landline");
 
     private String value;
 
     PhoneNumberTypeEnum(String value) {
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
     public static PhoneNumberTypeEnum fromValue(String value) {
       for (PhoneNumberTypeEnum b : PhoneNumberTypeEnum.values()) {
         if (b.value.equals(value)) {
           return b;
         }
       }
       throw new IllegalArgumentException("Unexpected value '" + value + "'");
     }
   }
 
   // Provide a valid default (e.g., LOCAL) or set to null if no default is desired
   public static final String JSON_PROPERTY_PHONE_NUMBER_TYPE = "phone_number_type";
   private PhoneNumberTypeEnum phoneNumberType = PhoneNumberTypeEnum.LOCAL;
 
   /**
    * Gets or Sets features
    */
   public enum FeaturesEnum {
     SMS("sms"),
     MMS("mms"),
     VOICE("voice"),
     FAX("fax"),
     EMERGENCY("emergency");
 
     private String value;
 
     FeaturesEnum(String value) {
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
     public static FeaturesEnum fromValue(String value) {
       for (FeaturesEnum b : FeaturesEnum.values()) {
         if (b.value.equals(value)) {
           return b;
         }
       }
       throw new IllegalArgumentException("Unexpected value '" + value + "'");
     }
   }
 
   public static final String JSON_PROPERTY_FEATURES = "features";
   private Set<FeaturesEnum> features = null;
 
   public static final String JSON_PROPERTY_CUSTOMER_REFERENCE = "customer_reference";
   private String customerReference = "";
 
   public static final String JSON_PROPERTY_ID = "id";
   private UUID id;
 
   /**
    * Gets or Sets status
    */
   public enum StatusEnum {
     PENDING("pending"),
     PROCESSING("processing"),
     ORDERED("ordered");
 
     private String value;
 
     StatusEnum(String value) {
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
     public static StatusEnum fromValue(String value) {
       for (StatusEnum b : StatusEnum.values()) {
         if (b.value.equals(value)) {
           return b;
         }
       }
       throw new IllegalArgumentException("Unexpected value '" + value + "'");
     }
   }
 
   public static final String JSON_PROPERTY_STATUS = "status";
   private StatusEnum status;
 
   public static final String JSON_PROPERTY_ORDERS = "orders";
   private Set<UUID> orders = null;
 
   public AdvancedOrderResponseData() { 
   }
 
   public AdvancedOrderResponseData countryCode(String countryCode) {
     this.countryCode = countryCode;
     return this;
   }
 
   /**
    * Get countryCode
    * @return countryCode
    **/
   @javax.annotation.Nullable
   @ApiModelProperty(value = "")
   @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
   @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
   public String getCountryCode() {
     return countryCode;
   }
 
   @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
   @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
   public void setCountryCode(String countryCode) {
     this.countryCode = countryCode;
   }
 
   public AdvancedOrderResponseData comments(String comments) {
     this.comments = comments;
     return this;
   }
 
   /**
    * Get comments
    * @return comments
    **/
   @javax.annotation.Nullable
   @ApiModelProperty(value = "")
   @JsonProperty(JSON_PROPERTY_COMMENTS)
   @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
   public String getComments() {
     return comments;
   }
 
   @JsonProperty(JSON_PROPERTY_COMMENTS)
   @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
   public void setComments(String comments) {
     this.comments = comments;
   }
 
   public AdvancedOrderResponseData quantity(Integer quantity) {
     this.quantity = quantity;
     return this;
   }
 
   /**
    * Get quantity
    * minimum: 1
    * maximum: 10000
    * @return quantity
    **/
   @javax.annotation.Nullable
   @ApiModelProperty(value = "")
   @JsonProperty(JSON_PROPERTY_QUANTITY)
   @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
   public Integer getQuantity() {
     return quantity;
   }
 
   @JsonProperty(JSON_PROPERTY_QUANTITY)
   @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
   public void setQuantity(Integer quantity) {
     this.quantity = quantity;
   }
 
   public AdvancedOrderResponseData areaCode(String areaCode) {
     this.areaCode = areaCode;
     return this;
   }
 
   /**
    * Get areaCode
    * @return areaCode
    **/
   @javax.annotation.Nullable
   @ApiModelProperty(value = "")
   @JsonProperty(JSON_PROPERTY_AREA_CODE)
   @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
   public String getAreaCode() {
     return areaCode;
   }
 
   @JsonProperty(JSON_PROPERTY_AREA_CODE)
   @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
   public void setAreaCode(String areaCode) {
     this.areaCode = areaCode;
   }
 
   public AdvancedOrderResponseData phoneNumberType(PhoneNumberTypeEnum phoneNumberType) {
     this.phoneNumberType = phoneNumberType;
     return this;
   }
 
   /**
    * Get phoneNumberType
    * @return phoneNumberType
    **/
   @javax.annotation.Nullable
   @ApiModelProperty(value = "")
   @JsonProperty(JSON_PROPERTY_PHONE_NUMBER_TYPE)
   @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
   public PhoneNumberTypeEnum getPhoneNumberType() {
     return phoneNumberType;
   }
 
   @JsonProperty(JSON_PROPERTY_PHONE_NUMBER_TYPE)
   @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
   public void setPhoneNumberType(PhoneNumberTypeEnum phoneNumberType) {
     this.phoneNumberType = phoneNumberType;
   }
 
   public AdvancedOrderResponseData features(Set<FeaturesEnum> features) {
     this.features = features;
     return this;
   }
 
   public AdvancedOrderResponseData addfeaturesItem(FeaturesEnum featuresItem) {
     if (this.features == null) {
       this.features = new LinkedHashSet<>();
     }
     this.features.add(featuresItem);
     return this;
   }
 
   /**
    * Get features
    * @return features
    **/
   @javax.annotation.Nullable
   @ApiModelProperty(value = "")
   @JsonProperty(JSON_PROPERTY_FEATURES)
   @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
   public Set<FeaturesEnum> getFeatures() {
     return features;
   }
 
   @JsonDeserialize(as = LinkedHashSet.class)
   @JsonProperty(JSON_PROPERTY_FEATURES)
   @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
   public void setFeatures(Set<FeaturesEnum> features) {
     this.features = features;
   }
 
   public AdvancedOrderResponseData customerReference(String customerReference) {
     this.customerReference = customerReference;
     return this;
   }
 
   /**
    * Get customerReference
    * @return customerReference
    **/
   @javax.annotation.Nullable
   @ApiModelProperty(value = "")
   @JsonProperty(JSON_PROPERTY_CUSTOMER_REFERENCE)
   @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
   public String getCustomerReference() {
     return customerReference;
   }
 
   @JsonProperty(JSON_PROPERTY_CUSTOMER_REFERENCE)
   @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
   public void setCustomerReference(String customerReference) {
     this.customerReference = customerReference;
   }
 
   public AdvancedOrderResponseData id(UUID id) {
     this.id = id;
     return this;
   }
 
   /**
    * Get id
    * @return id
    **/
   @javax.annotation.Nullable
   @ApiModelProperty(value = "")
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
 
   public AdvancedOrderResponseData status(StatusEnum status) {
     this.status = status;
     return this;
   }
 
   /**
    * Get status
    * @return status
    **/
   @javax.annotation.Nullable
   @ApiModelProperty(value = "")
   @JsonProperty(JSON_PROPERTY_STATUS)
   @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
   public StatusEnum getStatus() {
     return status;
   }
 
   @JsonProperty(JSON_PROPERTY_STATUS)
   @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
   public void setStatus(StatusEnum status) {
     this.status = status;
   }
 
   public AdvancedOrderResponseData orders(Set<UUID> orders) {
     this.orders = orders;
     return this;
   }
 
   public AdvancedOrderResponseData addordersItem(UUID ordersItem) {
     if (this.orders == null) {
       this.orders = new LinkedHashSet<>();
     }
     this.orders.add(ordersItem);
     return this;
   }
 
   /**
    * Get orders
    * @return orders
    **/
   @javax.annotation.Nullable
   @ApiModelProperty(value = "")
   @JsonProperty(JSON_PROPERTY_ORDERS)
   @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
   public Set<UUID> getOrders() {
     return orders;
   }
 
   @JsonDeserialize(as = LinkedHashSet.class)
   @JsonProperty(JSON_PROPERTY_ORDERS)
   @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
   public void setOrders(Set<UUID> orders) {
     this.orders = orders;
   }
 
   /**
    * Return true if this AdvancedOrderResponseData object is equal to o.
    */
   @Override
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if ((o == null) || getClass() != o.getClass()) {
       return false;
     }
     AdvancedOrderResponseData advancedOrderResponseData = (AdvancedOrderResponseData) o;
     return Objects.equals(this.countryCode, advancedOrderResponseData.countryCode) &&
         Objects.equals(this.comments, advancedOrderResponseData.comments) &&
         Objects.equals(this.quantity, advancedOrderResponseData.quantity) &&
         Objects.equals(this.areaCode, advancedOrderResponseData.areaCode) &&
         Objects.equals(this.phoneNumberType, advancedOrderResponseData.phoneNumberType) &&
         Objects.equals(this.features, advancedOrderResponseData.features) &&
         Objects.equals(this.customerReference, advancedOrderResponseData.customerReference) &&
         Objects.equals(this.id, advancedOrderResponseData.id) &&
         Objects.equals(this.status, advancedOrderResponseData.status) &&
         Objects.equals(this.orders, advancedOrderResponseData.orders);
   }
 
   @Override
   public int hashCode() {
     return Objects.hash(
         countryCode, comments, quantity, areaCode, phoneNumberType,
         features, customerReference, id, status, orders
     );
   }
 
   @Override
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class AdvancedOrderResponseData {\n");
     sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
     sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
     sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
     sb.append("    areaCode: ").append(toIndentedString(areaCode)).append("\n");
     sb.append("    phoneNumberType: ").append(toIndentedString(phoneNumberType)).append("\n");
     sb.append("    features: ").append(toIndentedString(features)).append("\n");
     sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
     sb.append("    id: ").append(toIndentedString(id)).append("\n");
     sb.append("    status: ").append(toIndentedString(status)).append("\n");
     sb.append("    orders: ").append(toIndentedString(orders)).append("\n");
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