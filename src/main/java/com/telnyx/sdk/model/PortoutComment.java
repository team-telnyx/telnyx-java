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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * PortoutComment
 */
@JsonPropertyOrder({
  PortoutComment.JSON_PROPERTY_ID,
  PortoutComment.JSON_PROPERTY_RECORD_TYPE,
  PortoutComment.JSON_PROPERTY_BODY,
  PortoutComment.JSON_PROPERTY_PORTOUT_ID,
  PortoutComment.JSON_PROPERTY_USER_ID,
  PortoutComment.JSON_PROPERTY_CREATED_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class PortoutComment {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public static final String JSON_PROPERTY_BODY = "body";
  private String body;

  public static final String JSON_PROPERTY_PORTOUT_ID = "portout_id";
  private String portoutId;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private String userId;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public PortoutComment() { 
  }

  @JsonCreator
  public PortoutComment(
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE) String recordType
  ) {
    this();
    this.recordType = recordType;
  }

  public PortoutComment id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0ccc7b54-4df3-4bca-a65a-3da1ecc777f0", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }


   /**
   * Identifies the type of the resource.
   * @return recordType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "portout", value = "Identifies the type of the resource.")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecordType() {
    return recordType;
  }




  public PortoutComment body(String body) {
    this.body = body;
    return this;
  }

   /**
   * Comment body
   * @return body
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "This is a comment", required = true, value = "Comment body")
  @JsonProperty(JSON_PROPERTY_BODY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBody() {
    return body;
  }


  @JsonProperty(JSON_PROPERTY_BODY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBody(String body) {
    this.body = body;
  }


  public PortoutComment portoutId(String portoutId) {
    this.portoutId = portoutId;
    return this;
  }

   /**
   * Identifies the associated port request
   * @return portoutId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0ccc7b54-4df3-4bca-a65a-3da1ecc777f0", value = "Identifies the associated port request")
  @JsonProperty(JSON_PROPERTY_PORTOUT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPortoutId() {
    return portoutId;
  }


  @JsonProperty(JSON_PROPERTY_PORTOUT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPortoutId(String portoutId) {
    this.portoutId = portoutId;
  }


  public PortoutComment userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Identifies the user who created the comment. Will be null if created by Telnyx Admin
   * @return userId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0ccc7b54-4df3-4bca-a65a-3da1ecc777f0", required = true, value = "Identifies the user who created the comment. Will be null if created by Telnyx Admin")
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserId(String userId) {
    this.userId = userId;
  }


  public PortoutComment createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Comment creation timestamp in ISO 8601 format
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2018-02-02T22:25:27.521Z", required = true, value = "Comment creation timestamp in ISO 8601 format")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  /**
   * Return true if this PortoutComment object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortoutComment portoutComment = (PortoutComment) o;
    return Objects.equals(this.id, portoutComment.id) &&
        Objects.equals(this.recordType, portoutComment.recordType) &&
        Objects.equals(this.body, portoutComment.body) &&
        Objects.equals(this.portoutId, portoutComment.portoutId) &&
        Objects.equals(this.userId, portoutComment.userId) &&
        Objects.equals(this.createdAt, portoutComment.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, recordType, body, portoutId, userId, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortoutComment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    portoutId: ").append(toIndentedString(portoutId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

