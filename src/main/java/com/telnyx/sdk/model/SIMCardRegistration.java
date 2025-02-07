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
 * SIMCardRegistration
 */
@JsonPropertyOrder(
    {
        SIMCardRegistration.JSON_PROPERTY_SIM_CARD_GROUP_ID,
        SIMCardRegistration.JSON_PROPERTY_TAGS,
        SIMCardRegistration.JSON_PROPERTY_REGISTRATION_CODES,
        SIMCardRegistration.JSON_PROPERTY_STATUS,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class SIMCardRegistration {

    public static final String JSON_PROPERTY_SIM_CARD_GROUP_ID =
        "sim_card_group_id";
    private UUID simCardGroupId;

    public static final String JSON_PROPERTY_TAGS = "tags";
    private List<String> tags = null;

    public static final String JSON_PROPERTY_REGISTRATION_CODES =
        "registration_codes";
    private List<String> registrationCodes = new ArrayList<>();

    /**
     * Status on which the SIM card will be set after being successful registered.
     */
    public enum StatusEnum {
        ENABLED(String.valueOf("enabled")),

        DISABLED(String.valueOf("disabled")),

        STANDBY(String.valueOf("standby"));

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
    private StatusEnum status = StatusEnum.ENABLED;

    public SIMCardRegistration() {}

    public SIMCardRegistration simCardGroupId(UUID simCardGroupId) {
        this.simCardGroupId = simCardGroupId;
        return this;
    }

    /**
     * The group SIMCardGroup identification. This attribute can be &lt;code&gt;null&lt;/code&gt; when it&#39;s present in an associated resource.
     * @return simCardGroupId
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "6a09cdc3-8948-47f0-aa62-74ac943d6c58",
        value = "The group SIMCardGroup identification. This attribute can be <code>null</code> when it's present in an associated resource."
    )
    @JsonProperty(JSON_PROPERTY_SIM_CARD_GROUP_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public UUID getSimCardGroupId() {
        return simCardGroupId;
    }

    @JsonProperty(JSON_PROPERTY_SIM_CARD_GROUP_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSimCardGroupId(UUID simCardGroupId) {
        this.simCardGroupId = simCardGroupId;
    }

    public SIMCardRegistration tags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public SIMCardRegistration addtagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * Searchable tags associated with the SIM card
     * @return tags
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "[\"personal\",\"customers\",\"active-customers\"]",
        value = "Searchable tags associated with the SIM card"
    )
    @JsonProperty(JSON_PROPERTY_TAGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getTags() {
        return tags;
    }

    @JsonProperty(JSON_PROPERTY_TAGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public SIMCardRegistration registrationCodes(
        List<String> registrationCodes
    ) {
        this.registrationCodes = registrationCodes;
        return this;
    }

    public SIMCardRegistration addregistrationCodesItem(
        String registrationCodesItem
    ) {
        this.registrationCodes.add(registrationCodesItem);
        return this;
    }

    /**
     * Get registrationCodes
     * @return registrationCodes
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "[\"0000000001\",\"0000000002\",\"0000000003\"]",
        required = true,
        value = ""
    )
    @JsonProperty(JSON_PROPERTY_REGISTRATION_CODES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<String> getRegistrationCodes() {
        return registrationCodes;
    }

    @JsonProperty(JSON_PROPERTY_REGISTRATION_CODES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setRegistrationCodes(List<String> registrationCodes) {
        this.registrationCodes = registrationCodes;
    }

    public SIMCardRegistration status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Status on which the SIM card will be set after being successful registered.
     * @return status
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "standby",
        value = "Status on which the SIM card will be set after being successful registered."
    )
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

    /**
     * Return true if this SIMCardRegistration object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SIMCardRegistration siMCardRegistration = (SIMCardRegistration) o;
        return (
            Objects.equals(
                this.simCardGroupId,
                siMCardRegistration.simCardGroupId
            ) &&
            Objects.equals(this.tags, siMCardRegistration.tags) &&
            Objects.equals(
                this.registrationCodes,
                siMCardRegistration.registrationCodes
            ) &&
            Objects.equals(this.status, siMCardRegistration.status)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(simCardGroupId, tags, registrationCodes, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SIMCardRegistration {\n");
        sb
            .append("    simCardGroupId: ")
            .append(toIndentedString(simCardGroupId))
            .append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb
            .append("    registrationCodes: ")
            .append(toIndentedString(registrationCodes))
            .append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
