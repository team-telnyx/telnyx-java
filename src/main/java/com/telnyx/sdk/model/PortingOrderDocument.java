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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * PortingOrderDocument
 */
@JsonPropertyOrder({
  PortingOrderDocument.JSON_PROPERTY_ID,
  PortingOrderDocument.JSON_PROPERTY_DOCUMENT_TYPE,
  PortingOrderDocument.JSON_PROPERTY_DOCUMENT_ID,
  PortingOrderDocument.JSON_PROPERTY_RECORD_TYPE,
  PortingOrderDocument.JSON_PROPERTY_CREATED_AT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PortingOrderDocument {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  /**
   * The type of document
   */
  public enum DocumentTypeEnum {
    LOA("loa"),
    
    INVOICE("invoice"),
    
    OTHER("other");

    private String value;

    DocumentTypeEnum(String value) {
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
    public static DocumentTypeEnum fromValue(String value) {
      for (DocumentTypeEnum b : DocumentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DOCUMENT_TYPE = "document_type";
  private DocumentTypeEnum documentType;

  public static final String JSON_PROPERTY_DOCUMENT_ID = "document_id";
  private UUID documentId;

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public PortingOrderDocument() { 
  }

  public PortingOrderDocument id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Uniquely identifies the document in the porting order
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "64ffb720-04c7-455b-92d6-20fcca92e935", value = "Uniquely identifies the document in the porting order")
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


  public PortingOrderDocument documentType(DocumentTypeEnum documentType) {
    this.documentType = documentType;
    return this;
  }

   /**
   * The type of document
   * @return documentType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "loa", value = "The type of document")
  @JsonProperty(JSON_PROPERTY_DOCUMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DocumentTypeEnum getDocumentType() {
    return documentType;
  }


  @JsonProperty(JSON_PROPERTY_DOCUMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDocumentType(DocumentTypeEnum documentType) {
    this.documentType = documentType;
  }


  public PortingOrderDocument documentId(UUID documentId) {
    this.documentId = documentId;
    return this;
  }

   /**
   * Uniquely identifies a document uploaded via the &lt;code&gt;&lt;a href&#x3D;\&quot;https://developers.telnyx.com/docs/api/v2/documents/Documents#createDocument\&quot;&gt;/v2/documents&lt;/a&gt;&lt;/code&gt; endpoint.
   * @return documentId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "ce74b771-d23d-4960-81ec-8741b3862146", value = "Uniquely identifies a document uploaded via the <code><a href=\"https://developers.telnyx.com/docs/api/v2/documents/Documents#createDocument\">/v2/documents</a></code> endpoint.")
  @JsonProperty(JSON_PROPERTY_DOCUMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getDocumentId() {
    return documentId;
  }


  @JsonProperty(JSON_PROPERTY_DOCUMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDocumentId(UUID documentId) {
    this.documentId = documentId;
  }


  public PortingOrderDocument recordType(String recordType) {
    this.recordType = recordType;
    return this;
  }

   /**
   * Identifies the type of the resource.
   * @return recordType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "porting_order_document", value = "Identifies the type of the resource.")
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


  public PortingOrderDocument createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * ISO 8601 formatted date/time when document was associated for the porting order.
   * @return createdAt
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2020-03-19T10:07:15.527Z", value = "ISO 8601 formatted date/time when document was associated for the porting order.")
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
   * Return true if this PortingOrderDocument object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortingOrderDocument portingOrderDocument = (PortingOrderDocument) o;
    return Objects.equals(this.id, portingOrderDocument.id) &&
        Objects.equals(this.documentType, portingOrderDocument.documentType) &&
        Objects.equals(this.documentId, portingOrderDocument.documentId) &&
        Objects.equals(this.recordType, portingOrderDocument.recordType) &&
        Objects.equals(this.createdAt, portingOrderDocument.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, documentType, documentId, recordType, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortingOrderDocument {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
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

