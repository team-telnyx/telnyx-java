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
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ModelMetadata
 */
@JsonPropertyOrder(
    {
        ModelMetadata.JSON_PROPERTY_ID,
        ModelMetadata.JSON_PROPERTY_OBJECT,
        ModelMetadata.JSON_PROPERTY_CREATED,
        ModelMetadata.JSON_PROPERTY_OWNED_BY,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class ModelMetadata {

    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_OBJECT = "object";
    private String _object = "model";

    public static final String JSON_PROPERTY_CREATED = "created";
    private Integer created;

    public static final String JSON_PROPERTY_OWNED_BY = "owned_by";
    private String ownedBy;

    public ModelMetadata() {}

    public ModelMetadata id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
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

    public ModelMetadata _object(String _object) {
        this._object = _object;
        return this;
    }

    /**
     * Get _object
     * @return _object
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_OBJECT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getObject() {
        return _object;
    }

    @JsonProperty(JSON_PROPERTY_OBJECT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setObject(String _object) {
        this._object = _object;
    }

    public ModelMetadata created(Integer created) {
        this.created = created;
        return this;
    }

    /**
     * Get created
     * @return created
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_CREATED)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Integer getCreated() {
        return created;
    }

    @JsonProperty(JSON_PROPERTY_CREATED)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCreated(Integer created) {
        this.created = created;
    }

    public ModelMetadata ownedBy(String ownedBy) {
        this.ownedBy = ownedBy;
        return this;
    }

    /**
     * Get ownedBy
     * @return ownedBy
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_OWNED_BY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getOwnedBy() {
        return ownedBy;
    }

    @JsonProperty(JSON_PROPERTY_OWNED_BY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setOwnedBy(String ownedBy) {
        this.ownedBy = ownedBy;
    }

    /**
     * Return true if this ModelMetadata object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModelMetadata modelMetadata = (ModelMetadata) o;
        return (
            Objects.equals(this.id, modelMetadata.id) &&
            Objects.equals(this._object, modelMetadata._object) &&
            Objects.equals(this.created, modelMetadata.created) &&
            Objects.equals(this.ownedBy, modelMetadata.ownedBy)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, _object, created, ownedBy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModelMetadata {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb
            .append("    _object: ")
            .append(toIndentedString(_object))
            .append("\n");
        sb
            .append("    created: ")
            .append(toIndentedString(created))
            .append("\n");
        sb
            .append("    ownedBy: ")
            .append(toIndentedString(ownedBy))
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
