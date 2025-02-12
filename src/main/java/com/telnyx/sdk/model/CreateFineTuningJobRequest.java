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
import com.telnyx.sdk.model.CreateFineTuningJobRequestHyperparameters;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * CreateFineTuningJobRequest
 */
@JsonPropertyOrder(
    {
        CreateFineTuningJobRequest.JSON_PROPERTY_MODEL,
        CreateFineTuningJobRequest.JSON_PROPERTY_TRAINING_FILE,
        CreateFineTuningJobRequest.JSON_PROPERTY_SUFFIX,
        CreateFineTuningJobRequest.JSON_PROPERTY_HYPERPARAMETERS,
    }
)
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class CreateFineTuningJobRequest {

    public static final String JSON_PROPERTY_MODEL = "model";
    private String model;

    public static final String JSON_PROPERTY_TRAINING_FILE = "training_file";
    private String trainingFile;

    public static final String JSON_PROPERTY_SUFFIX = "suffix";
    private String suffix;

    public static final String JSON_PROPERTY_HYPERPARAMETERS =
        "hyperparameters";
    private CreateFineTuningJobRequestHyperparameters hyperparameters;

    public CreateFineTuningJobRequest() {}

    public CreateFineTuningJobRequest model(String model) {
        this.model = model;
        return this;
    }

    /**
     * The base model that is being fine-tuned.
     * @return model
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(
        required = true,
        value = "The base model that is being fine-tuned."
    )
    @JsonProperty(JSON_PROPERTY_MODEL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getModel() {
        return model;
    }

    @JsonProperty(JSON_PROPERTY_MODEL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setModel(String model) {
        this.model = model;
    }

    public CreateFineTuningJobRequest trainingFile(String trainingFile) {
        this.trainingFile = trainingFile;
        return this;
    }

    /**
     * The storage bucket or object used for training.
     * @return trainingFile
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(
        required = true,
        value = "The storage bucket or object used for training."
    )
    @JsonProperty(JSON_PROPERTY_TRAINING_FILE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getTrainingFile() {
        return trainingFile;
    }

    @JsonProperty(JSON_PROPERTY_TRAINING_FILE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setTrainingFile(String trainingFile) {
        this.trainingFile = trainingFile;
    }

    public CreateFineTuningJobRequest suffix(String suffix) {
        this.suffix = suffix;
        return this;
    }

    /**
     * Optional suffix to append to the fine tuned model&#39;s name.
     * @return suffix
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        value = "Optional suffix to append to the fine tuned model's name."
    )
    @JsonProperty(JSON_PROPERTY_SUFFIX)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getSuffix() {
        return suffix;
    }

    @JsonProperty(JSON_PROPERTY_SUFFIX)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public CreateFineTuningJobRequest hyperparameters(
        CreateFineTuningJobRequestHyperparameters hyperparameters
    ) {
        this.hyperparameters = hyperparameters;
        return this;
    }

    /**
     * Get hyperparameters
     * @return hyperparameters
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_HYPERPARAMETERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CreateFineTuningJobRequestHyperparameters getHyperparameters() {
        return hyperparameters;
    }

    @JsonProperty(JSON_PROPERTY_HYPERPARAMETERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setHyperparameters(
        CreateFineTuningJobRequestHyperparameters hyperparameters
    ) {
        this.hyperparameters = hyperparameters;
    }

    /**
     * Return true if this CreateFineTuningJobRequest object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateFineTuningJobRequest createFineTuningJobRequest =
            (CreateFineTuningJobRequest) o;
        return (
            Objects.equals(this.model, createFineTuningJobRequest.model) &&
            Objects.equals(
                this.trainingFile,
                createFineTuningJobRequest.trainingFile
            ) &&
            Objects.equals(this.suffix, createFineTuningJobRequest.suffix) &&
            Objects.equals(
                this.hyperparameters,
                createFineTuningJobRequest.hyperparameters
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, trainingFile, suffix, hyperparameters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFineTuningJobRequest {\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb
            .append("    trainingFile: ")
            .append(toIndentedString(trainingFile))
            .append("\n");
        sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
        sb
            .append("    hyperparameters: ")
            .append(toIndentedString(hyperparameters))
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
