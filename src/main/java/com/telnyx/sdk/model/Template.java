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
import com.telnyx.sdk.model.Language;
import com.telnyx.sdk.model.TemplateComponents;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Template
 */
@JsonPropertyOrder(
    {
        Template.JSON_PROPERTY_NAMESPACE,
        Template.JSON_PROPERTY_NAME,
        Template.JSON_PROPERTY_LANGUAGE,
        Template.JSON_PROPERTY_COMPONENTS,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen"
)
public class Template {

    public static final String JSON_PROPERTY_NAMESPACE = "namespace";
    private String namespace;

    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_LANGUAGE = "language";
    private Language language;

    public static final String JSON_PROPERTY_COMPONENTS = "components";
    private List<TemplateComponents> components = null;

    public Template() {}

    public Template namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * Namespace of the template. This must be the namespace associated with the WhatsApp business account that owns the phone number associated with the current WhatsApp Business API client or the message fails to send.
     * @return namespace
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        required = true,
        value = "Namespace of the template. This must be the namespace associated with the WhatsApp business account that owns the phone number associated with the current WhatsApp Business API client or the message fails to send."
    )
    @JsonProperty(JSON_PROPERTY_NAMESPACE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getNamespace() {
        return namespace;
    }

    @JsonProperty(JSON_PROPERTY_NAMESPACE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public Template name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the template.
     * @return name
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(required = true, value = "Name of the template.")
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

    public Template language(Language language) {
        this.language = language;
        return this;
    }

    /**
     * Get language
     * @return language
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_LANGUAGE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Language getLanguage() {
        return language;
    }

    @JsonProperty(JSON_PROPERTY_LANGUAGE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setLanguage(Language language) {
        this.language = language;
    }

    public Template components(List<TemplateComponents> components) {
        this.components = components;
        return this;
    }

    public Template addComponentsItem(TemplateComponents componentsItem) {
        if (this.components == null) {
            this.components = new ArrayList<>();
        }
        this.components.add(componentsItem);
        return this;
    }

    /**
     * Get components
     * @return components
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_COMPONENTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<TemplateComponents> getComponents() {
        return components;
    }

    @JsonProperty(JSON_PROPERTY_COMPONENTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setComponents(List<TemplateComponents> components) {
        this.components = components;
    }

    /**
     * Return true if this Template object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Template template = (Template) o;
        return (
            Objects.equals(this.namespace, template.namespace) &&
            Objects.equals(this.name, template.name) &&
            Objects.equals(this.language, template.language) &&
            Objects.equals(this.components, template.components)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(namespace, name, language, components);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Template {\n");
        sb
            .append("    namespace: ")
            .append(toIndentedString(namespace))
            .append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb
            .append("    language: ")
            .append(toIndentedString(language))
            .append("\n");
        sb
            .append("    components: ")
            .append(toIndentedString(components))
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
