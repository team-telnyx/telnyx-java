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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.telnyx.sdk.JSON;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * LedgerBillingGroupReport
 */
@JsonPropertyOrder(
    {
        LedgerBillingGroupReport.JSON_PROPERTY_RECORD_TYPE,
        LedgerBillingGroupReport.JSON_PROPERTY_ID,
        LedgerBillingGroupReport.JSON_PROPERTY_ORGANIZATION_ID,
        LedgerBillingGroupReport.JSON_PROPERTY_STATUS,
        LedgerBillingGroupReport.JSON_PROPERTY_REPORT_URL,
        LedgerBillingGroupReport.JSON_PROPERTY_CREATED_AT,
        LedgerBillingGroupReport.JSON_PROPERTY_UPDATED_AT,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class LedgerBillingGroupReport {

    /**
     * Identifies the type of the resource.
     */
    public enum RecordTypeEnum {
        LEDGER_BILLING_GROUP_REPORT(
            String.valueOf("ledger_billing_group_report")
        );

        private String value;

        RecordTypeEnum(String value) {
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
        public static RecordTypeEnum fromValue(String value) {
            for (RecordTypeEnum b : RecordTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
    private RecordTypeEnum recordType;

    public static final String JSON_PROPERTY_ID = "id";
    private UUID id;

    public static final String JSON_PROPERTY_ORGANIZATION_ID =
        "organization_id";
    private UUID organizationId;

    /**
     * Status of the ledger billing group report
     */
    public enum StatusEnum {
        PENDING(String.valueOf("pending")),

        COMPLETE(String.valueOf("complete")),

        FAILED(String.valueOf("failed")),

        DELETED(String.valueOf("deleted"));

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
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_STATUS = "status";
    private StatusEnum status;

    public static final String JSON_PROPERTY_REPORT_URL = "report_url";
    private JsonNullable<URI> reportUrl = JsonNullable.<URI>undefined();

    public static final String JSON_PROPERTY_CREATED_AT = "created_at";
    private OffsetDateTime createdAt;

    public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
    private OffsetDateTime updatedAt;

    public LedgerBillingGroupReport() {}

    public LedgerBillingGroupReport recordType(RecordTypeEnum recordType) {
        this.recordType = recordType;
        return this;
    }

    /**
     * Identifies the type of the resource.
     * @return recordType
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "ledger_billing_group_report",
        value = "Identifies the type of the resource."
    )
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public RecordTypeEnum getRecordType() {
        return recordType;
    }

    @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRecordType(RecordTypeEnum recordType) {
        this.recordType = recordType;
    }

    public LedgerBillingGroupReport id(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Identifies the type of resource.
     * @return id
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "Identifies the type of resource.")
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

    public LedgerBillingGroupReport organizationId(UUID organizationId) {
        this.organizationId = organizationId;
        return this;
    }

    /**
     * Uniquely identifies the organization that owns the resource.
     * @return organizationId
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "Uniquely identifies the organization that owns the resource."
    )
    @JsonProperty(JSON_PROPERTY_ORGANIZATION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public UUID getOrganizationId() {
        return organizationId;
    }

    @JsonProperty(JSON_PROPERTY_ORGANIZATION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOrganizationId(UUID organizationId) {
        this.organizationId = organizationId;
    }

    public LedgerBillingGroupReport status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Status of the ledger billing group report
     * @return status
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "Status of the ledger billing group report")
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

    public LedgerBillingGroupReport reportUrl(URI reportUrl) {
        this.reportUrl = JsonNullable.<URI>of(reportUrl);
        return this;
    }

    /**
     * External url of the ledger billing group report, if the status is complete
     * @return reportUrl
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "External url of the ledger billing group report, if the status is complete"
    )
    @JsonIgnore
    public URI getReportUrl() {
        return reportUrl.orElse(null);
    }

    @JsonProperty(JSON_PROPERTY_REPORT_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public JsonNullable<URI> getReportUrl_JsonNullable() {
        return reportUrl;
    }

    @JsonProperty(JSON_PROPERTY_REPORT_URL)
    public void setReportUrl_JsonNullable(JsonNullable<URI> reportUrl) {
        this.reportUrl = reportUrl;
    }

    public void setReportUrl(URI reportUrl) {
        this.reportUrl = JsonNullable.<URI>of(reportUrl);
    }

    public LedgerBillingGroupReport createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * ISO 8601 formatted date indicating when the resource was created.
     * @return createdAt
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "ISO 8601 formatted date indicating when the resource was created."
    )
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

    public LedgerBillingGroupReport updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * ISO 8601 formatted date indicating when the resource was updated.
     * @return updatedAt
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "ISO 8601 formatted date indicating when the resource was updated."
    )
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

    /**
     * Return true if this LedgerBillingGroupReport object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LedgerBillingGroupReport ledgerBillingGroupReport =
            (LedgerBillingGroupReport) o;
        return (
            Objects.equals(
                this.recordType,
                ledgerBillingGroupReport.recordType
            ) &&
            Objects.equals(this.id, ledgerBillingGroupReport.id) &&
            Objects.equals(
                this.organizationId,
                ledgerBillingGroupReport.organizationId
            ) &&
            Objects.equals(this.status, ledgerBillingGroupReport.status) &&
            equalsNullable(
                this.reportUrl,
                ledgerBillingGroupReport.reportUrl
            ) &&
            Objects.equals(
                this.createdAt,
                ledgerBillingGroupReport.createdAt
            ) &&
            Objects.equals(this.updatedAt, ledgerBillingGroupReport.updatedAt)
        );
    }

    private static <T> boolean equalsNullable(
        JsonNullable<T> a,
        JsonNullable<T> b
    ) {
        return (
            a == b ||
            (a != null &&
                b != null &&
                a.isPresent() &&
                b.isPresent() &&
                Objects.deepEquals(a.get(), b.get()))
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            recordType,
            id,
            organizationId,
            status,
            hashCodeNullable(reportUrl),
            createdAt,
            updatedAt
        );
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent()
            ? Arrays.deepHashCode(new Object[] { a.get() })
            : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LedgerBillingGroupReport {\n");
        sb
            .append("    recordType: ")
            .append(toIndentedString(recordType))
            .append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb
            .append("    organizationId: ")
            .append(toIndentedString(organizationId))
            .append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb
            .append("    reportUrl: ")
            .append(toIndentedString(reportUrl))
            .append("\n");
        sb
            .append("    createdAt: ")
            .append(toIndentedString(createdAt))
            .append("\n");
        sb
            .append("    updatedAt: ")
            .append(toIndentedString(updatedAt))
            .append("\n");
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
