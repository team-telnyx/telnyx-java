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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.telnyx.sdk.JSON;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * EmbeddingMetadata
 */
@JsonPropertyOrder(
    {
        EmbeddingMetadata.JSON_PROPERTY_SOURCE,
        EmbeddingMetadata.JSON_PROPERTY_CHECKSUM,
        EmbeddingMetadata.JSON_PROPERTY_EMBEDDING,
        EmbeddingMetadata.JSON_PROPERTY_FILENAME,
        EmbeddingMetadata.JSON_PROPERTY_CERTAINTY,
        EmbeddingMetadata.JSON_PROPERTY_LOADER_METADATA,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class EmbeddingMetadata {

    public static final String JSON_PROPERTY_SOURCE = "source";
    private String source;

    public static final String JSON_PROPERTY_CHECKSUM = "checksum";
    private String checksum;

    public static final String JSON_PROPERTY_EMBEDDING = "embedding";
    private String embedding;

    public static final String JSON_PROPERTY_FILENAME = "filename";
    private String filename;

    public static final String JSON_PROPERTY_CERTAINTY = "certainty";
    private BigDecimal certainty;

    public static final String JSON_PROPERTY_LOADER_METADATA =
        "loader_metadata";
    private Object loaderMetadata;

    public EmbeddingMetadata() {}

    public EmbeddingMetadata source(String source) {
        this.source = source;
        return this;
    }

    /**
     * Get source
     * @return source
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_SOURCE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getSource() {
        return source;
    }

    @JsonProperty(JSON_PROPERTY_SOURCE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setSource(String source) {
        this.source = source;
    }

    public EmbeddingMetadata checksum(String checksum) {
        this.checksum = checksum;
        return this;
    }

    /**
     * Get checksum
     * @return checksum
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_CHECKSUM)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getChecksum() {
        return checksum;
    }

    @JsonProperty(JSON_PROPERTY_CHECKSUM)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    public EmbeddingMetadata embedding(String embedding) {
        this.embedding = embedding;
        return this;
    }

    /**
     * Get embedding
     * @return embedding
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_EMBEDDING)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getEmbedding() {
        return embedding;
    }

    @JsonProperty(JSON_PROPERTY_EMBEDDING)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setEmbedding(String embedding) {
        this.embedding = embedding;
    }

    public EmbeddingMetadata filename(String filename) {
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

    public EmbeddingMetadata certainty(BigDecimal certainty) {
        this.certainty = certainty;
        return this;
    }

    /**
     * Get certainty
     * @return certainty
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_CERTAINTY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public BigDecimal getCertainty() {
        return certainty;
    }

    @JsonProperty(JSON_PROPERTY_CERTAINTY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCertainty(BigDecimal certainty) {
        this.certainty = certainty;
    }

    public EmbeddingMetadata loaderMetadata(Object loaderMetadata) {
        this.loaderMetadata = loaderMetadata;
        return this;
    }

    /**
     * Get loaderMetadata
     * @return loaderMetadata
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_LOADER_METADATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Object getLoaderMetadata() {
        return loaderMetadata;
    }

    @JsonProperty(JSON_PROPERTY_LOADER_METADATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLoaderMetadata(Object loaderMetadata) {
        this.loaderMetadata = loaderMetadata;
    }

    /**
     * Return true if this EmbeddingMetadata object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmbeddingMetadata embeddingMetadata = (EmbeddingMetadata) o;
        return (
            Objects.equals(this.source, embeddingMetadata.source) &&
            Objects.equals(this.checksum, embeddingMetadata.checksum) &&
            Objects.equals(this.embedding, embeddingMetadata.embedding) &&
            Objects.equals(this.filename, embeddingMetadata.filename) &&
            Objects.equals(this.certainty, embeddingMetadata.certainty) &&
            Objects.equals(
                this.loaderMetadata,
                embeddingMetadata.loaderMetadata
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            source,
            checksum,
            embedding,
            filename,
            certainty,
            loaderMetadata
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EmbeddingMetadata {\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb
            .append("    checksum: ")
            .append(toIndentedString(checksum))
            .append("\n");
        sb
            .append("    embedding: ")
            .append(toIndentedString(embedding))
            .append("\n");
        sb
            .append("    filename: ")
            .append(toIndentedString(filename))
            .append("\n");
        sb
            .append("    certainty: ")
            .append(toIndentedString(certainty))
            .append("\n");
        sb
            .append("    loaderMetadata: ")
            .append(toIndentedString(loaderMetadata))
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
