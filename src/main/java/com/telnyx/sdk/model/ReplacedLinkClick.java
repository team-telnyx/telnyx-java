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
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * ReplacedLinkClick
 */
@JsonPropertyOrder(
    {
        ReplacedLinkClick.JSON_PROPERTY_RECORD_TYPE,
        ReplacedLinkClick.JSON_PROPERTY_URL,
        ReplacedLinkClick.JSON_PROPERTY_TO,
        ReplacedLinkClick.JSON_PROPERTY_MESSAGE_ID,
        ReplacedLinkClick.JSON_PROPERTY_TIME_CLICKED,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class ReplacedLinkClick {

    public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
    private String recordType;

    public static final String JSON_PROPERTY_URL = "url";
    private String url;

    public static final String JSON_PROPERTY_TO = "to";
    private String to;

    public static final String JSON_PROPERTY_MESSAGE_ID = "message_id";
    private UUID messageId;

    public static final String JSON_PROPERTY_TIME_CLICKED = "time_clicked";
    private OffsetDateTime timeClicked;

    public ReplacedLinkClick() {}

    public ReplacedLinkClick recordType(String recordType) {
        this.recordType = recordType;
        return this;
    }

    /**
     * Identifies the type of the resource.
     * @return recordType
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "link_clicked",
        value = "Identifies the type of the resource."
    )
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

    public ReplacedLinkClick url(String url) {
        this.url = url;
        return this;
    }

    /**
     * The original link that was sent in the message.
     * @return url
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "link_clicked",
        value = "The original link that was sent in the message."
    )
    @JsonProperty(JSON_PROPERTY_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getUrl() {
        return url;
    }

    @JsonProperty(JSON_PROPERTY_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setUrl(String url) {
        this.url = url;
    }

    public ReplacedLinkClick to(String to) {
        this.to = to;
        return this;
    }

    /**
     * Sending address (+E.164 formatted phone number, alphanumeric sender ID, or short code).
     * @return to
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "Sending address (+E.164 formatted phone number, alphanumeric sender ID, or short code)."
    )
    @JsonProperty(JSON_PROPERTY_TO)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getTo() {
        return to;
    }

    @JsonProperty(JSON_PROPERTY_TO)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTo(String to) {
        this.to = to;
    }

    public ReplacedLinkClick messageId(UUID messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * The message ID associated with the clicked link.
     * @return messageId
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "The message ID associated with the clicked link."
    )
    @JsonProperty(JSON_PROPERTY_MESSAGE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public UUID getMessageId() {
        return messageId;
    }

    @JsonProperty(JSON_PROPERTY_MESSAGE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMessageId(UUID messageId) {
        this.messageId = messageId;
    }

    public ReplacedLinkClick timeClicked(OffsetDateTime timeClicked) {
        this.timeClicked = timeClicked;
        return this;
    }

    /**
     * ISO 8601 formatted date indicating when the message request was received.
     * @return timeClicked
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "ISO 8601 formatted date indicating when the message request was received."
    )
    @JsonProperty(JSON_PROPERTY_TIME_CLICKED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public OffsetDateTime getTimeClicked() {
        return timeClicked;
    }

    @JsonProperty(JSON_PROPERTY_TIME_CLICKED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTimeClicked(OffsetDateTime timeClicked) {
        this.timeClicked = timeClicked;
    }

    /**
     * Return true if this ReplacedLinkClick object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReplacedLinkClick replacedLinkClick = (ReplacedLinkClick) o;
        return (
            Objects.equals(this.recordType, replacedLinkClick.recordType) &&
            Objects.equals(this.url, replacedLinkClick.url) &&
            Objects.equals(this.to, replacedLinkClick.to) &&
            Objects.equals(this.messageId, replacedLinkClick.messageId) &&
            Objects.equals(this.timeClicked, replacedLinkClick.timeClicked)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordType, url, to, messageId, timeClicked);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReplacedLinkClick {\n");
        sb
            .append("    recordType: ")
            .append(toIndentedString(recordType))
            .append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
        sb
            .append("    messageId: ")
            .append(toIndentedString(messageId))
            .append("\n");
        sb
            .append("    timeClicked: ")
            .append(toIndentedString(timeClicked))
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
