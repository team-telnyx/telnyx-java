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
 * Opens the user&#39;s default web browser app to the specified URL.
 */
@ApiModel(
    description = "Opens the user's default web browser app to the specified URL."
)
@JsonPropertyOrder(
    {
        RCSOpenUrlAction.JSON_PROPERTY_URL,
        RCSOpenUrlAction.JSON_PROPERTY_APPLICATION,
        RCSOpenUrlAction.JSON_PROPERTY_WEBVIEW_VIEW_MODE,
        RCSOpenUrlAction.JSON_PROPERTY_DESCRIPTION,
    }
)
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class RCSOpenUrlAction {

    public static final String JSON_PROPERTY_URL = "url";
    private String url;

    /**
     * URL open application, browser or webview.
     */
    public enum ApplicationEnum {
        OPEN_URL_APPLICATION_UNSPECIFIED(
            String.valueOf("OPEN_URL_APPLICATION_UNSPECIFIED")
        ),

        BROWSER(String.valueOf("BROWSER")),

        WEBVIEW(String.valueOf("WEBVIEW"));

        private String value;

        ApplicationEnum(String value) {
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
        public static ApplicationEnum fromValue(String value) {
            for (ApplicationEnum b : ApplicationEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_APPLICATION = "application";
    private ApplicationEnum application;

    /**
     * Gets or Sets webviewViewMode
     */
    public enum WebviewViewModeEnum {
        WEBVIEW_VIEW_MODE_UNSPECIFIED(
            String.valueOf("WEBVIEW_VIEW_MODE_UNSPECIFIED")
        ),

        FULL(String.valueOf("FULL")),

        HALF(String.valueOf("HALF")),

        TALL(String.valueOf("TALL"));

        private String value;

        WebviewViewModeEnum(String value) {
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
        public static WebviewViewModeEnum fromValue(String value) {
            for (WebviewViewModeEnum b : WebviewViewModeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_WEBVIEW_VIEW_MODE =
        "webview_view_mode";
    private WebviewViewModeEnum webviewViewMode;

    public static final String JSON_PROPERTY_DESCRIPTION = "description";
    private String description;

    public RCSOpenUrlAction() {}

    public RCSOpenUrlAction url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(
        example = "http://example.com",
        required = true,
        value = ""
    )
    @JsonProperty(JSON_PROPERTY_URL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getUrl() {
        return url;
    }

    @JsonProperty(JSON_PROPERTY_URL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setUrl(String url) {
        this.url = url;
    }

    public RCSOpenUrlAction application(ApplicationEnum application) {
        this.application = application;
        return this;
    }

    /**
     * URL open application, browser or webview.
     * @return application
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(
        example = "BROWSER",
        required = true,
        value = "URL open application, browser or webview."
    )
    @JsonProperty(JSON_PROPERTY_APPLICATION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public ApplicationEnum getApplication() {
        return application;
    }

    @JsonProperty(JSON_PROPERTY_APPLICATION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setApplication(ApplicationEnum application) {
        this.application = application;
    }

    public RCSOpenUrlAction webviewViewMode(
        WebviewViewModeEnum webviewViewMode
    ) {
        this.webviewViewMode = webviewViewMode;
        return this;
    }

    /**
     * Get webviewViewMode
     * @return webviewViewMode
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(example = "HALF", required = true, value = "")
    @JsonProperty(JSON_PROPERTY_WEBVIEW_VIEW_MODE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public WebviewViewModeEnum getWebviewViewMode() {
        return webviewViewMode;
    }

    @JsonProperty(JSON_PROPERTY_WEBVIEW_VIEW_MODE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setWebviewViewMode(WebviewViewModeEnum webviewViewMode) {
        this.webviewViewMode = webviewViewMode;
    }

    public RCSOpenUrlAction description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Accessbility description for webview.
     * @return description
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Accessbility description for webview.")
    @JsonProperty(JSON_PROPERTY_DESCRIPTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getDescription() {
        return description;
    }

    @JsonProperty(JSON_PROPERTY_DESCRIPTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Return true if this RCSOpenUrlAction object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RCSOpenUrlAction rcSOpenUrlAction = (RCSOpenUrlAction) o;
        return (
            Objects.equals(this.url, rcSOpenUrlAction.url) &&
            Objects.equals(this.application, rcSOpenUrlAction.application) &&
            Objects.equals(
                this.webviewViewMode,
                rcSOpenUrlAction.webviewViewMode
            ) &&
            Objects.equals(this.description, rcSOpenUrlAction.description)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, application, webviewViewMode, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RCSOpenUrlAction {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb
            .append("    application: ")
            .append(toIndentedString(application))
            .append("\n");
        sb
            .append("    webviewViewMode: ")
            .append(toIndentedString(webviewViewMode))
            .append("\n");
        sb
            .append("    description: ")
            .append(toIndentedString(description))
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
