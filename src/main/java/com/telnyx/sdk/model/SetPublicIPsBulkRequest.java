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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * SetPublicIPsBulkRequest
 */
@JsonPropertyOrder({ SetPublicIPsBulkRequest.JSON_PROPERTY_SIM_CARD_IDS })
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class SetPublicIPsBulkRequest {

    public static final String JSON_PROPERTY_SIM_CARD_IDS = "sim_card_ids";
    private List<UUID> simCardIds = new ArrayList<>();

    public SetPublicIPsBulkRequest() {}

    public SetPublicIPsBulkRequest simCardIds(List<UUID> simCardIds) {
        this.simCardIds = simCardIds;
        return this;
    }

    public SetPublicIPsBulkRequest addsimCardIdsItem(UUID simCardIdsItem) {
        this.simCardIds.add(simCardIdsItem);
        return this;
    }

    /**
     * Get simCardIds
     * @return simCardIds
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "[\"6b14e151-8493-4fa1-8664-1cc4e6d14158\"]",
        required = true,
        value = ""
    )
    @JsonProperty(JSON_PROPERTY_SIM_CARD_IDS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<UUID> getSimCardIds() {
        return simCardIds;
    }

    @JsonProperty(JSON_PROPERTY_SIM_CARD_IDS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setSimCardIds(List<UUID> simCardIds) {
        this.simCardIds = simCardIds;
    }

    /**
     * Return true if this SetPublicIPsBulk_request object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SetPublicIPsBulkRequest setPublicIPsBulkRequest =
            (SetPublicIPsBulkRequest) o;
        return Objects.equals(
            this.simCardIds,
            setPublicIPsBulkRequest.simCardIds
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(simCardIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetPublicIPsBulkRequest {\n");
        sb
            .append("    simCardIds: ")
            .append(toIndentedString(simCardIds))
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
