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
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * PortingOrdersComment
 */
@JsonPropertyOrder({
  PortingOrdersComment.JSON_PROPERTY_ID,
  PortingOrdersComment.JSON_PROPERTY_BODY,
  PortingOrdersComment.JSON_PROPERTY_PORTING_ORDER_ID,
  PortingOrdersComment.JSON_PROPERTY_USER_TYPE,
  PortingOrdersComment.JSON_PROPERTY_RECORD_TYPE,
  PortingOrdersComment.JSON_PROPERTY_CREATED_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class PortingOrdersComment {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_BODY = "body";
  private String body;

  public static final String JSON_PROPERTY_PORTING_ORDER_ID = "porting_order_id";
  private UUID portingOrderId;

  /**
   * Indicates whether this comment was created by a Telnyx Admin, user, or system
   */
  public enum UserTypeEnum {
    ADMIN(String.valueOf("admin")),
    
    USER(String.valueOf("user")),
    
    SYSTEM(String.valueOf("system"));

    private String value;

    UserTypeEnum(String value) {
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
    public static UserTypeEnum fromValue(String value) {
      for (UserTypeEnum b : UserTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_USER_TYPE = "user_type";
  private UserTypeEnum userType;

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public PortingOrdersComment() { 
  }

  public PortingOrdersComment id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "f1486bae-f067-460c-ad43-73a92848f902", value = "")
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


  public PortingOrdersComment body(String body) {
    this.body = body;
    return this;
  }

   /**
   * Body of comment
   * @return body
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Great experience so far", value = "Body of comment")
  @JsonProperty(JSON_PROPERTY_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBody() {
    return body;
  }


  @JsonProperty(JSON_PROPERTY_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBody(String body) {
    this.body = body;
  }


  public PortingOrdersComment portingOrderId(UUID portingOrderId) {
    this.portingOrderId = portingOrderId;
    return this;
  }

   /**
   * Get portingOrderId
   * @return portingOrderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "f1486bae-f067-460c-ad43-73a92848f902", value = "")
  @JsonProperty(JSON_PROPERTY_PORTING_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getPortingOrderId() {
    return portingOrderId;
  }


  @JsonProperty(JSON_PROPERTY_PORTING_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPortingOrderId(UUID portingOrderId) {
    this.portingOrderId = portingOrderId;
  }


  public PortingOrdersComment userType(UserTypeEnum userType) {
    this.userType = userType;
    return this;
  }

   /**
   * Indicates whether this comment was created by a Telnyx Admin, user, or system
   * @return userType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "user", value = "Indicates whether this comment was created by a Telnyx Admin, user, or system")
  @JsonProperty(JSON_PROPERTY_USER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UserTypeEnum getUserType() {
    return userType;
  }


  @JsonProperty(JSON_PROPERTY_USER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserType(UserTypeEnum userType) {
    this.userType = userType;
  }


  public PortingOrdersComment recordType(String recordType) {
    this.recordType = recordType;
    return this;
  }

   /**
   * Identifies the type of the resource.
   * @return recordType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "porting_comment", value = "Identifies the type of the resource.")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecordType() {
    return recordType;
  }


  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecordType(String recordType) {
    this.recordType = recordType;
  }


  public PortingOrdersComment createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * ISO 8601 formatted date indicating when the resource was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-03-19T10:07:15.527Z", value = "ISO 8601 formatted date indicating when the resource was created.")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  /**
   * Return true if this PortingOrdersComment object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortingOrdersComment portingOrdersComment = (PortingOrdersComment) o;
    return Objects.equals(this.id, portingOrdersComment.id) &&
        Objects.equals(this.body, portingOrdersComment.body) &&
        Objects.equals(this.portingOrderId, portingOrdersComment.portingOrderId) &&
        Objects.equals(this.userType, portingOrdersComment.userType) &&
        Objects.equals(this.recordType, portingOrdersComment.recordType) &&
        Objects.equals(this.createdAt, portingOrdersComment.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, body, portingOrderId, userType, recordType, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortingOrdersComment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    portingOrderId: ").append(toIndentedString(portingOrderId)).append("\n");
    sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

