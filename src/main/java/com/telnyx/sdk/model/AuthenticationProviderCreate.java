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
import com.telnyx.sdk.model.Settings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * AuthenticationProviderCreate
 */
@JsonPropertyOrder(
    {
        AuthenticationProviderCreate.JSON_PROPERTY_NAME,
        AuthenticationProviderCreate.JSON_PROPERTY_SHORT_NAME,
        AuthenticationProviderCreate.JSON_PROPERTY_ACTIVE,
        AuthenticationProviderCreate.JSON_PROPERTY_SETTINGS,
        AuthenticationProviderCreate.JSON_PROPERTY_SETTINGS_URL,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class AuthenticationProviderCreate {

    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_SHORT_NAME = "short_name";
    private String shortName;

    public static final String JSON_PROPERTY_ACTIVE = "active";
    private Boolean active = true;

    public static final String JSON_PROPERTY_SETTINGS = "settings";
    private Settings settings;

    public static final String JSON_PROPERTY_SETTINGS_URL = "settings_url";
    private URI settingsUrl;

    public AuthenticationProviderCreate() {}

    public AuthenticationProviderCreate name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name associated with the authentication provider.
     * @return name
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "Okta",
        required = true,
        value = "The name associated with the authentication provider."
    )
    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getName() {
        return name;
    }

    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setName(String name) {
        this.name = name;
    }

    public AuthenticationProviderCreate shortName(String shortName) {
        this.shortName = shortName;
        return this;
    }

    /**
     * The short name associated with the authentication provider. This must be unique and URL-friendly, as it&#39;s going to be part of the login URL.
     * @return shortName
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "myorg",
        required = true,
        value = "The short name associated with the authentication provider. This must be unique and URL-friendly, as it's going to be part of the login URL."
    )
    @JsonProperty(JSON_PROPERTY_SHORT_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getShortName() {
        return shortName;
    }

    @JsonProperty(JSON_PROPERTY_SHORT_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public AuthenticationProviderCreate active(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * The active status of the authentication provider
     * @return active
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "true",
        value = "The active status of the authentication provider"
    )
    @JsonProperty(JSON_PROPERTY_ACTIVE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getActive() {
        return active;
    }

    @JsonProperty(JSON_PROPERTY_ACTIVE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setActive(Boolean active) {
        this.active = active;
    }

    public AuthenticationProviderCreate settings(Settings settings) {
        this.settings = settings;
        return this;
    }

    /**
     * Get settings
     * @return settings
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_SETTINGS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Settings getSettings() {
        return settings;
    }

    @JsonProperty(JSON_PROPERTY_SETTINGS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    public AuthenticationProviderCreate settingsUrl(URI settingsUrl) {
        this.settingsUrl = settingsUrl;
        return this;
    }

    /**
     * The URL for the identity provider metadata file to populate the settings automatically. If the settings attribute is provided, that will be used instead.
     * @return settingsUrl
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "https://myorg.myidp.com/saml/metadata",
        value = "The URL for the identity provider metadata file to populate the settings automatically. If the settings attribute is provided, that will be used instead."
    )
    @JsonProperty(JSON_PROPERTY_SETTINGS_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public URI getSettingsUrl() {
        return settingsUrl;
    }

    @JsonProperty(JSON_PROPERTY_SETTINGS_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSettingsUrl(URI settingsUrl) {
        this.settingsUrl = settingsUrl;
    }

    /**
     * Return true if this AuthenticationProviderCreate object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AuthenticationProviderCreate authenticationProviderCreate =
            (AuthenticationProviderCreate) o;
        return (
            Objects.equals(this.name, authenticationProviderCreate.name) &&
            Objects.equals(
                this.shortName,
                authenticationProviderCreate.shortName
            ) &&
            Objects.equals(this.active, authenticationProviderCreate.active) &&
            Objects.equals(
                this.settings,
                authenticationProviderCreate.settings
            ) &&
            Objects.equals(
                this.settingsUrl,
                authenticationProviderCreate.settingsUrl
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, shortName, active, settings, settingsUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthenticationProviderCreate {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb
            .append("    shortName: ")
            .append(toIndentedString(shortName))
            .append("\n");
        sb.append("    active: ").append(toIndentedString(active)).append("\n");
        sb
            .append("    settings: ")
            .append(toIndentedString(settings))
            .append("\n");
        sb
            .append("    settingsUrl: ")
            .append(toIndentedString(settingsUrl))
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
