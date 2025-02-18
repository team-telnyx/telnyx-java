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
import com.telnyx.sdk.model.ButtonParameter;
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
 * Button
 */
@JsonPropertyOrder(
    {
        Button.JSON_PROPERTY_SUB_TYPE,
        Button.JSON_PROPERTY_INDEX,
        Button.JSON_PROPERTY_PARAMETERS,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen"
)
public class Button {

    public static final String JSON_PROPERTY_SUB_TYPE = "sub_type";
    private Object subType = null;

    public static final String JSON_PROPERTY_INDEX = "index";
    private Integer index;

    public static final String JSON_PROPERTY_PARAMETERS = "parameters";
    private List<ButtonParameter> parameters = new ArrayList<>();

    public Button() {}

    public Button subType(Object subType) {
        this.subType = subType;
        return this;
    }

    /**
     * Type of button being created.
     * @return subType
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(required = true, value = "Type of button being created.")
    @JsonProperty(JSON_PROPERTY_SUB_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Object getSubType() {
        return subType;
    }

    @JsonProperty(JSON_PROPERTY_SUB_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setSubType(Object subType) {
        this.subType = subType;
    }

    public Button index(Integer index) {
        this.index = index;
        return this;
    }

    /**
     * Position index of the button. You can have up to 3 buttons using index values of 0-2.
     * @return index
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        required = true,
        value = "Position index of the button. You can have up to 3 buttons using index values of 0-2."
    )
    @JsonProperty(JSON_PROPERTY_INDEX)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Integer getIndex() {
        return index;
    }

    @JsonProperty(JSON_PROPERTY_INDEX)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setIndex(Integer index) {
        this.index = index;
    }

    public Button parameters(List<ButtonParameter> parameters) {
        this.parameters = parameters;
        return this;
    }

    public Button addParametersItem(ButtonParameter parametersItem) {
        this.parameters.add(parametersItem);
        return this;
    }

    /**
     * The parameters for the button, which are set at creation time in your Business Manager.
     * @return parameters
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        required = true,
        value = "The parameters for the button, which are set at creation time in your Business Manager."
    )
    @JsonProperty(JSON_PROPERTY_PARAMETERS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<ButtonParameter> getParameters() {
        return parameters;
    }

    @JsonProperty(JSON_PROPERTY_PARAMETERS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setParameters(List<ButtonParameter> parameters) {
        this.parameters = parameters;
    }

    /**
     * Return true if this Button object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Button button = (Button) o;
        return (
            Objects.equals(this.subType, button.subType) &&
            Objects.equals(this.index, button.index) &&
            Objects.equals(this.parameters, button.parameters)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(subType, index, parameters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Button {\n");
        sb
            .append("    subType: ")
            .append(toIndentedString(subType))
            .append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb
            .append("    parameters: ")
            .append(toIndentedString(parameters))
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
