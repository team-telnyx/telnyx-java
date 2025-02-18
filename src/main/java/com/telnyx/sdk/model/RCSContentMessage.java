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
import com.telnyx.sdk.model.RCSContentInfo;
import com.telnyx.sdk.model.RCSRichCard;
import com.telnyx.sdk.model.RCSSuggestion;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * RCSContentMessage
 */
@JsonPropertyOrder(
    {
        RCSContentMessage.JSON_PROPERTY_SUGGESTIONS,
        RCSContentMessage.JSON_PROPERTY_TEXT,
        RCSContentMessage.JSON_PROPERTY_RICH_CARD,
        RCSContentMessage.JSON_PROPERTY_CONTENT_INFO,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class RCSContentMessage {

    public static final String JSON_PROPERTY_SUGGESTIONS = "suggestions";
    private List<RCSSuggestion> suggestions = null;

    public static final String JSON_PROPERTY_TEXT = "text";
    private String text;

    public static final String JSON_PROPERTY_RICH_CARD = "rich_card";
    private RCSRichCard richCard;

    public static final String JSON_PROPERTY_CONTENT_INFO = "content_info";
    private RCSContentInfo contentInfo;

    public RCSContentMessage() {}

    public RCSContentMessage suggestions(List<RCSSuggestion> suggestions) {
        this.suggestions = suggestions;
        return this;
    }

    public RCSContentMessage addsuggestionsItem(RCSSuggestion suggestionsItem) {
        if (this.suggestions == null) {
            this.suggestions = new ArrayList<>();
        }
        this.suggestions.add(suggestionsItem);
        return this;
    }

    /**
     * List of suggested actions and replies
     * @return suggestions
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "List of suggested actions and replies")
    @JsonProperty(JSON_PROPERTY_SUGGESTIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<RCSSuggestion> getSuggestions() {
        return suggestions;
    }

    @JsonProperty(JSON_PROPERTY_SUGGESTIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSuggestions(List<RCSSuggestion> suggestions) {
        this.suggestions = suggestions;
    }

    public RCSContentMessage text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Text (maximum 3072 characters)
     * @return text
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "Hello world!",
        value = "Text (maximum 3072 characters)"
    )
    @JsonProperty(JSON_PROPERTY_TEXT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getText() {
        return text;
    }

    @JsonProperty(JSON_PROPERTY_TEXT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setText(String text) {
        this.text = text;
    }

    public RCSContentMessage richCard(RCSRichCard richCard) {
        this.richCard = richCard;
        return this;
    }

    /**
     * Get richCard
     * @return richCard
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_RICH_CARD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public RCSRichCard getRichCard() {
        return richCard;
    }

    @JsonProperty(JSON_PROPERTY_RICH_CARD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRichCard(RCSRichCard richCard) {
        this.richCard = richCard;
    }

    public RCSContentMessage contentInfo(RCSContentInfo contentInfo) {
        this.contentInfo = contentInfo;
        return this;
    }

    /**
     * Get contentInfo
     * @return contentInfo
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_CONTENT_INFO)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public RCSContentInfo getContentInfo() {
        return contentInfo;
    }

    @JsonProperty(JSON_PROPERTY_CONTENT_INFO)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setContentInfo(RCSContentInfo contentInfo) {
        this.contentInfo = contentInfo;
    }

    /**
     * Return true if this RCSContentMessage object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RCSContentMessage rcSContentMessage = (RCSContentMessage) o;
        return (
            Objects.equals(this.suggestions, rcSContentMessage.suggestions) &&
            Objects.equals(this.text, rcSContentMessage.text) &&
            Objects.equals(this.richCard, rcSContentMessage.richCard) &&
            Objects.equals(this.contentInfo, rcSContentMessage.contentInfo)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(suggestions, text, richCard, contentInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RCSContentMessage {\n");
        sb
            .append("    suggestions: ")
            .append(toIndentedString(suggestions))
            .append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb
            .append("    richCard: ")
            .append(toIndentedString(richCard))
            .append("\n");
        sb
            .append("    contentInfo: ")
            .append(toIndentedString(contentInfo))
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
