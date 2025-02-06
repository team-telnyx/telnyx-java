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
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * CreateComment200ResponseData
 */
@JsonPropertyOrder({
  CreateComment200ResponseData.JSON_PROPERTY_ID,
  CreateComment200ResponseData.JSON_PROPERTY_BODY,
  CreateComment200ResponseData.JSON_PROPERTY_COMMENTER,
  CreateComment200ResponseData.JSON_PROPERTY_COMMENTER_TYPE,
  CreateComment200ResponseData.JSON_PROPERTY_COMMENT_RECORD_TYPE,
  CreateComment200ResponseData.JSON_PROPERTY_COMMENT_RECORD_ID,
  CreateComment200ResponseData.JSON_PROPERTY_READ_AT,
  CreateComment200ResponseData.JSON_PROPERTY_CREATED_AT,
  CreateComment200ResponseData.JSON_PROPERTY_UPDATED_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class CreateComment200ResponseData {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_BODY = "body";
  private String body;

  public static final String JSON_PROPERTY_COMMENTER = "commenter";
  private String commenter;

  /**
   * Gets or Sets commenterType
   */
  public enum CommenterTypeEnum {
    ADMIN(String.valueOf("admin")),
    
    USER(String.valueOf("user"));

    private String value;

    CommenterTypeEnum(String value) {
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
    public static CommenterTypeEnum fromValue(String value) {
      for (CommenterTypeEnum b : CommenterTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_COMMENTER_TYPE = "commenter_type";
  private CommenterTypeEnum commenterType;

  /**
   * Gets or Sets commentRecordType
   */
  public enum CommentRecordTypeEnum {
    SUB_NUMBER_ORDER(String.valueOf("sub_number_order")),
    
    REQUIREMENT_GROUP(String.valueOf("requirement_group"));

    private String value;

    CommentRecordTypeEnum(String value) {
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
    public static CommentRecordTypeEnum fromValue(String value) {
      for (CommentRecordTypeEnum b : CommentRecordTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_COMMENT_RECORD_TYPE = "comment_record_type";
  private CommentRecordTypeEnum commentRecordType;

  public static final String JSON_PROPERTY_COMMENT_RECORD_ID = "comment_record_id";
  private UUID commentRecordId;

  public static final String JSON_PROPERTY_READ_AT = "read_at";
  private String readAt;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public CreateComment200ResponseData() { 
  }

  @JsonCreator
  public CreateComment200ResponseData(
    @JsonProperty(JSON_PROPERTY_ID) UUID id, 
    @JsonProperty(JSON_PROPERTY_COMMENTER) String commenter, 
    @JsonProperty(JSON_PROPERTY_COMMENTER_TYPE) CommenterTypeEnum commenterType, 
    @JsonProperty(JSON_PROPERTY_READ_AT) String readAt, 
    @JsonProperty(JSON_PROPERTY_CREATED_AT) String createdAt, 
    @JsonProperty(JSON_PROPERTY_UPDATED_AT) String updatedAt
  ) {
    this();
    this.id = id;
    this.commenter = commenter;
    this.commenterType = commenterType;
    this.readAt = readAt;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12ade33a-21c0-473b-b055-b3c836e1c292", value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }




  public CreateComment200ResponseData body(String body) {
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Hi there, ....", value = "")
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


   /**
   * Get commenter
   * @return commenter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "user@company.com", value = "")
  @JsonProperty(JSON_PROPERTY_COMMENTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCommenter() {
    return commenter;
  }




   /**
   * Get commenterType
   * @return commenterType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "user", value = "")
  @JsonProperty(JSON_PROPERTY_COMMENTER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CommenterTypeEnum getCommenterType() {
    return commenterType;
  }




  public CreateComment200ResponseData commentRecordType(CommentRecordTypeEnum commentRecordType) {
    this.commentRecordType = commentRecordType;
    return this;
  }

   /**
   * Get commentRecordType
   * @return commentRecordType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "sub_number_order", value = "")
  @JsonProperty(JSON_PROPERTY_COMMENT_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CommentRecordTypeEnum getCommentRecordType() {
    return commentRecordType;
  }


  @JsonProperty(JSON_PROPERTY_COMMENT_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCommentRecordType(CommentRecordTypeEnum commentRecordType) {
    this.commentRecordType = commentRecordType;
  }


  public CreateComment200ResponseData commentRecordId(UUID commentRecordId) {
    this.commentRecordId = commentRecordId;
    return this;
  }

   /**
   * Get commentRecordId
   * @return commentRecordId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8ffb3622-7c6b-4ccc-b65f-7a3dc0099576", value = "")
  @JsonProperty(JSON_PROPERTY_COMMENT_RECORD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getCommentRecordId() {
    return commentRecordId;
  }


  @JsonProperty(JSON_PROPERTY_COMMENT_RECORD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCommentRecordId(UUID commentRecordId) {
    this.commentRecordId = commentRecordId;
  }


   /**
   * An ISO 8901 datetime string for when the comment was read.
   * @return readAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-01-01T00:00:00.000000Z", value = "An ISO 8901 datetime string for when the comment was read.")
  @JsonProperty(JSON_PROPERTY_READ_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReadAt() {
    return readAt;
  }




   /**
   * An ISO 8901 datetime string denoting when the comment was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-01-01T00:00:00.000000Z", value = "An ISO 8901 datetime string denoting when the comment was created.")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAt() {
    return createdAt;
  }




   /**
   * An ISO 8901 datetime string for when the comment was updated.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-01-01T00:00:00.000000Z", value = "An ISO 8901 datetime string for when the comment was updated.")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUpdatedAt() {
    return updatedAt;
  }




  /**
   * Return true if this CreateComment_200_response_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateComment200ResponseData createComment200ResponseData = (CreateComment200ResponseData) o;
    return Objects.equals(this.id, createComment200ResponseData.id) &&
        Objects.equals(this.body, createComment200ResponseData.body) &&
        Objects.equals(this.commenter, createComment200ResponseData.commenter) &&
        Objects.equals(this.commenterType, createComment200ResponseData.commenterType) &&
        Objects.equals(this.commentRecordType, createComment200ResponseData.commentRecordType) &&
        Objects.equals(this.commentRecordId, createComment200ResponseData.commentRecordId) &&
        Objects.equals(this.readAt, createComment200ResponseData.readAt) &&
        Objects.equals(this.createdAt, createComment200ResponseData.createdAt) &&
        Objects.equals(this.updatedAt, createComment200ResponseData.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, body, commenter, commenterType, commentRecordType, commentRecordId, readAt, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateComment200ResponseData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    commenter: ").append(toIndentedString(commenter)).append("\n");
    sb.append("    commenterType: ").append(toIndentedString(commenterType)).append("\n");
    sb.append("    commentRecordType: ").append(toIndentedString(commentRecordType)).append("\n");
    sb.append("    commentRecordId: ").append(toIndentedString(commentRecordId)).append("\n");
    sb.append("    readAt: ").append(toIndentedString(readAt)).append("\n");
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

