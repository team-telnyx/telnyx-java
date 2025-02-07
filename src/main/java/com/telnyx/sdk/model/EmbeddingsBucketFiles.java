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
import java.time.OffsetDateTime;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * EmbeddingsBucketFiles
 */
@JsonPropertyOrder({
  EmbeddingsBucketFiles.JSON_PROPERTY_FILENAME,
  EmbeddingsBucketFiles.JSON_PROPERTY_STATUS,
  EmbeddingsBucketFiles.JSON_PROPERTY_CREATED_AT,
  EmbeddingsBucketFiles.JSON_PROPERTY_UPDATED_AT,
  EmbeddingsBucketFiles.JSON_PROPERTY_LAST_EMBEDDED_AT,
  EmbeddingsBucketFiles.JSON_PROPERTY_ERROR_REASON
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class EmbeddingsBucketFiles {
  public static final String JSON_PROPERTY_FILENAME = "filename";
  private String filename;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public static final String JSON_PROPERTY_LAST_EMBEDDED_AT = "last_embedded_at";
  private OffsetDateTime lastEmbeddedAt;

  public static final String JSON_PROPERTY_ERROR_REASON = "error_reason";
  private String errorReason;

  public EmbeddingsBucketFiles() { 
  }

  public EmbeddingsBucketFiles filename(String filename) {
    this.filename = filename;
    return this;
  }

   /**
   * Get filename
   * @return filename
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_FILENAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFilename() {
    return filename;
  }


  @JsonProperty(JSON_PROPERTY_FILENAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFilename(String filename) {
    this.filename = filename;
  }


  public EmbeddingsBucketFiles status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(String status) {
    this.status = status;
  }


  public EmbeddingsBucketFiles createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public EmbeddingsBucketFiles updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public EmbeddingsBucketFiles lastEmbeddedAt(OffsetDateTime lastEmbeddedAt) {
    this.lastEmbeddedAt = lastEmbeddedAt;
    return this;
  }

   /**
   * Get lastEmbeddedAt
   * @return lastEmbeddedAt
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAST_EMBEDDED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastEmbeddedAt() {
    return lastEmbeddedAt;
  }


  @JsonProperty(JSON_PROPERTY_LAST_EMBEDDED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastEmbeddedAt(OffsetDateTime lastEmbeddedAt) {
    this.lastEmbeddedAt = lastEmbeddedAt;
  }


  public EmbeddingsBucketFiles errorReason(String errorReason) {
    this.errorReason = errorReason;
    return this;
  }

   /**
   * Get errorReason
   * @return errorReason
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ERROR_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorReason() {
    return errorReason;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorReason(String errorReason) {
    this.errorReason = errorReason;
  }


  /**
   * Return true if this EmbeddingsBucketFiles object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmbeddingsBucketFiles embeddingsBucketFiles = (EmbeddingsBucketFiles) o;
    return Objects.equals(this.filename, embeddingsBucketFiles.filename) &&
        Objects.equals(this.status, embeddingsBucketFiles.status) &&
        Objects.equals(this.createdAt, embeddingsBucketFiles.createdAt) &&
        Objects.equals(this.updatedAt, embeddingsBucketFiles.updatedAt) &&
        Objects.equals(this.lastEmbeddedAt, embeddingsBucketFiles.lastEmbeddedAt) &&
        Objects.equals(this.errorReason, embeddingsBucketFiles.errorReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filename, status, createdAt, updatedAt, lastEmbeddedAt, errorReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmbeddingsBucketFiles {\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    lastEmbeddedAt: ").append(toIndentedString(lastEmbeddedAt)).append("\n");
    sb.append("    errorReason: ").append(toIndentedString(errorReason)).append("\n");
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

