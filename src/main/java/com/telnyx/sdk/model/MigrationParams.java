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
 * MigrationParams
 */
@JsonPropertyOrder({
  MigrationParams.JSON_PROPERTY_ID,
  MigrationParams.JSON_PROPERTY_SOURCE_ID,
  MigrationParams.JSON_PROPERTY_TARGET_BUCKET_NAME,
  MigrationParams.JSON_PROPERTY_TARGET_REGION,
  MigrationParams.JSON_PROPERTY_REFRESH,
  MigrationParams.JSON_PROPERTY_LAST_COPY,
  MigrationParams.JSON_PROPERTY_STATUS,
  MigrationParams.JSON_PROPERTY_BYTES_TO_MIGRATE,
  MigrationParams.JSON_PROPERTY_BYTES_MIGRATED,
  MigrationParams.JSON_PROPERTY_SPEED,
  MigrationParams.JSON_PROPERTY_ETA,
  MigrationParams.JSON_PROPERTY_CREATED_AT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class MigrationParams {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_SOURCE_ID = "source_id";
  private String sourceId;

  public static final String JSON_PROPERTY_TARGET_BUCKET_NAME = "target_bucket_name";
  private String targetBucketName;

  public static final String JSON_PROPERTY_TARGET_REGION = "target_region";
  private String targetRegion;

  public static final String JSON_PROPERTY_REFRESH = "refresh";
  private Boolean refresh;

  public static final String JSON_PROPERTY_LAST_COPY = "last_copy";
  private OffsetDateTime lastCopy;

  /**
   * Status of the migration.
   */
  public enum StatusEnum {
    PENDING(String.valueOf("pending")),
    
    CHECKING(String.valueOf("checking")),
    
    MIGRATING(String.valueOf("migrating")),
    
    COMPLETE(String.valueOf("complete")),
    
    ERROR(String.valueOf("error")),
    
    STOPPED(String.valueOf("stopped"));

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

  public static final String JSON_PROPERTY_BYTES_TO_MIGRATE = "bytes_to_migrate";
  private Integer bytesToMigrate;

  public static final String JSON_PROPERTY_BYTES_MIGRATED = "bytes_migrated";
  private Integer bytesMigrated;

  public static final String JSON_PROPERTY_SPEED = "speed";
  private Integer speed;

  public static final String JSON_PROPERTY_ETA = "eta";
  private OffsetDateTime eta;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public MigrationParams() { 
  }

  @JsonCreator
  public MigrationParams(
    @JsonProperty(JSON_PROPERTY_ID) String id, 
    @JsonProperty(JSON_PROPERTY_LAST_COPY) OffsetDateTime lastCopy, 
    @JsonProperty(JSON_PROPERTY_STATUS) StatusEnum status, 
    @JsonProperty(JSON_PROPERTY_BYTES_TO_MIGRATE) Integer bytesToMigrate, 
    @JsonProperty(JSON_PROPERTY_BYTES_MIGRATED) Integer bytesMigrated, 
    @JsonProperty(JSON_PROPERTY_SPEED) Integer speed, 
    @JsonProperty(JSON_PROPERTY_ETA) OffsetDateTime eta, 
    @JsonProperty(JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt
  ) {
    this();
    this.id = id;
    this.lastCopy = lastCopy;
    this.status = status;
    this.bytesToMigrate = bytesToMigrate;
    this.bytesMigrated = bytesMigrated;
    this.speed = speed;
    this.eta = eta;
    this.createdAt = createdAt;
  }

   /**
   * Unique identifier for the data migration.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier for the data migration.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }




  public MigrationParams sourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
  }

   /**
   * ID of the Migration Source from which to migrate data.
   * @return sourceId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ID of the Migration Source from which to migrate data.")
  @JsonProperty(JSON_PROPERTY_SOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSourceId() {
    return sourceId;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }


  public MigrationParams targetBucketName(String targetBucketName) {
    this.targetBucketName = targetBucketName;
    return this;
  }

   /**
   * Bucket name to migrate the data into. Will default to the same name as the &#x60;source_bucket_name&#x60;.
   * @return targetBucketName
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Bucket name to migrate the data into. Will default to the same name as the `source_bucket_name`.")
  @JsonProperty(JSON_PROPERTY_TARGET_BUCKET_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTargetBucketName() {
    return targetBucketName;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_BUCKET_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTargetBucketName(String targetBucketName) {
    this.targetBucketName = targetBucketName;
  }


  public MigrationParams targetRegion(String targetRegion) {
    this.targetRegion = targetRegion;
    return this;
  }

   /**
   * Telnyx Cloud Storage region to migrate the data to.
   * @return targetRegion
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Telnyx Cloud Storage region to migrate the data to.")
  @JsonProperty(JSON_PROPERTY_TARGET_REGION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTargetRegion() {
    return targetRegion;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_REGION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTargetRegion(String targetRegion) {
    this.targetRegion = targetRegion;
  }


  public MigrationParams refresh(Boolean refresh) {
    this.refresh = refresh;
    return this;
  }

   /**
   * If true, will continue to poll the source bucket to ensure new data is continually migrated over.
   * @return refresh
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "If true, will continue to poll the source bucket to ensure new data is continually migrated over.")
  @JsonProperty(JSON_PROPERTY_REFRESH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRefresh() {
    return refresh;
  }


  @JsonProperty(JSON_PROPERTY_REFRESH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefresh(Boolean refresh) {
    this.refresh = refresh;
  }


   /**
   * Time when data migration was last copied from the source.
   * @return lastCopy
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2020-01-01T00:00Z", value = "Time when data migration was last copied from the source.")
  @JsonProperty(JSON_PROPERTY_LAST_COPY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastCopy() {
    return lastCopy;
  }




   /**
   * Status of the migration.
   * @return status
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Status of the migration.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }




   /**
   * Total amount of data found in source bucket to migrate.
   * @return bytesToMigrate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Total amount of data found in source bucket to migrate.")
  @JsonProperty(JSON_PROPERTY_BYTES_TO_MIGRATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBytesToMigrate() {
    return bytesToMigrate;
  }




   /**
   * Total amount of data that has been succesfully migrated.
   * @return bytesMigrated
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Total amount of data that has been succesfully migrated.")
  @JsonProperty(JSON_PROPERTY_BYTES_MIGRATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBytesMigrated() {
    return bytesMigrated;
  }




   /**
   * Current speed of the migration.
   * @return speed
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Current speed of the migration.")
  @JsonProperty(JSON_PROPERTY_SPEED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSpeed() {
    return speed;
  }




   /**
   * Estimated time the migration will complete.
   * @return eta
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2020-01-01T00:00Z", value = "Estimated time the migration will complete.")
  @JsonProperty(JSON_PROPERTY_ETA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getEta() {
    return eta;
  }




   /**
   * Time when data migration was created
   * @return createdAt
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2020-01-01T00:00Z", value = "Time when data migration was created")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }




  /**
   * Return true if this MigrationParams object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MigrationParams migrationParams = (MigrationParams) o;
    return Objects.equals(this.id, migrationParams.id) &&
        Objects.equals(this.sourceId, migrationParams.sourceId) &&
        Objects.equals(this.targetBucketName, migrationParams.targetBucketName) &&
        Objects.equals(this.targetRegion, migrationParams.targetRegion) &&
        Objects.equals(this.refresh, migrationParams.refresh) &&
        Objects.equals(this.lastCopy, migrationParams.lastCopy) &&
        Objects.equals(this.status, migrationParams.status) &&
        Objects.equals(this.bytesToMigrate, migrationParams.bytesToMigrate) &&
        Objects.equals(this.bytesMigrated, migrationParams.bytesMigrated) &&
        Objects.equals(this.speed, migrationParams.speed) &&
        Objects.equals(this.eta, migrationParams.eta) &&
        Objects.equals(this.createdAt, migrationParams.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, sourceId, targetBucketName, targetRegion, refresh, lastCopy, status, bytesToMigrate, bytesMigrated, speed, eta, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigrationParams {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    targetBucketName: ").append(toIndentedString(targetBucketName)).append("\n");
    sb.append("    targetRegion: ").append(toIndentedString(targetRegion)).append("\n");
    sb.append("    refresh: ").append(toIndentedString(refresh)).append("\n");
    sb.append("    lastCopy: ").append(toIndentedString(lastCopy)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    bytesToMigrate: ").append(toIndentedString(bytesToMigrate)).append("\n");
    sb.append("    bytesMigrated: ").append(toIndentedString(bytesMigrated)).append("\n");
    sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
    sb.append("    eta: ").append(toIndentedString(eta)).append("\n");
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

