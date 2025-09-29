// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.finetuning.jobs

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.Params
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create a new fine tuning job. */
class JobCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The base model that is being fine-tuned.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun model(): String = body.model()

    /**
     * The storage bucket or object used for training.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun trainingFile(): String = body.trainingFile()

    /**
     * The hyperparameters used for the fine-tuning job.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hyperparameters(): Optional<Hyperparameters> = body.hyperparameters()

    /**
     * Optional suffix to append to the fine tuned model's name.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun suffix(): Optional<String> = body.suffix()

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _model(): JsonField<String> = body._model()

    /**
     * Returns the raw JSON value of [trainingFile].
     *
     * Unlike [trainingFile], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _trainingFile(): JsonField<String> = body._trainingFile()

    /**
     * Returns the raw JSON value of [hyperparameters].
     *
     * Unlike [hyperparameters], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _hyperparameters(): JsonField<Hyperparameters> = body._hyperparameters()

    /**
     * Returns the raw JSON value of [suffix].
     *
     * Unlike [suffix], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _suffix(): JsonField<String> = body._suffix()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [JobCreateParams].
         *
         * The following fields are required:
         * ```java
         * .model()
         * .trainingFile()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [JobCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(jobCreateParams: JobCreateParams) = apply {
            body = jobCreateParams.body.toBuilder()
            additionalHeaders = jobCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = jobCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [model]
         * - [trainingFile]
         * - [hyperparameters]
         * - [suffix]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The base model that is being fine-tuned. */
        fun model(model: String) = apply { body.model(model) }

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<String>) = apply { body.model(model) }

        /** The storage bucket or object used for training. */
        fun trainingFile(trainingFile: String) = apply { body.trainingFile(trainingFile) }

        /**
         * Sets [Builder.trainingFile] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trainingFile] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun trainingFile(trainingFile: JsonField<String>) = apply {
            body.trainingFile(trainingFile)
        }

        /** The hyperparameters used for the fine-tuning job. */
        fun hyperparameters(hyperparameters: Hyperparameters) = apply {
            body.hyperparameters(hyperparameters)
        }

        /**
         * Sets [Builder.hyperparameters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hyperparameters] with a well-typed [Hyperparameters]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun hyperparameters(hyperparameters: JsonField<Hyperparameters>) = apply {
            body.hyperparameters(hyperparameters)
        }

        /** Optional suffix to append to the fine tuned model's name. */
        fun suffix(suffix: String) = apply { body.suffix(suffix) }

        /**
         * Sets [Builder.suffix] to an arbitrary JSON value.
         *
         * You should usually call [Builder.suffix] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun suffix(suffix: JsonField<String>) = apply { body.suffix(suffix) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [JobCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .model()
         * .trainingFile()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): JobCreateParams =
            JobCreateParams(body.build(), additionalHeaders.build(), additionalQueryParams.build())
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val model: JsonField<String>,
        private val trainingFile: JsonField<String>,
        private val hyperparameters: JsonField<Hyperparameters>,
        private val suffix: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
            @JsonProperty("training_file")
            @ExcludeMissing
            trainingFile: JsonField<String> = JsonMissing.of(),
            @JsonProperty("hyperparameters")
            @ExcludeMissing
            hyperparameters: JsonField<Hyperparameters> = JsonMissing.of(),
            @JsonProperty("suffix") @ExcludeMissing suffix: JsonField<String> = JsonMissing.of(),
        ) : this(model, trainingFile, hyperparameters, suffix, mutableMapOf())

        /**
         * The base model that is being fine-tuned.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun model(): String = model.getRequired("model")

        /**
         * The storage bucket or object used for training.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun trainingFile(): String = trainingFile.getRequired("training_file")

        /**
         * The hyperparameters used for the fine-tuning job.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun hyperparameters(): Optional<Hyperparameters> =
            hyperparameters.getOptional("hyperparameters")

        /**
         * Optional suffix to append to the fine tuned model's name.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun suffix(): Optional<String> = suffix.getOptional("suffix")

        /**
         * Returns the raw JSON value of [model].
         *
         * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

        /**
         * Returns the raw JSON value of [trainingFile].
         *
         * Unlike [trainingFile], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("training_file")
        @ExcludeMissing
        fun _trainingFile(): JsonField<String> = trainingFile

        /**
         * Returns the raw JSON value of [hyperparameters].
         *
         * Unlike [hyperparameters], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("hyperparameters")
        @ExcludeMissing
        fun _hyperparameters(): JsonField<Hyperparameters> = hyperparameters

        /**
         * Returns the raw JSON value of [suffix].
         *
         * Unlike [suffix], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("suffix") @ExcludeMissing fun _suffix(): JsonField<String> = suffix

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .model()
             * .trainingFile()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var model: JsonField<String>? = null
            private var trainingFile: JsonField<String>? = null
            private var hyperparameters: JsonField<Hyperparameters> = JsonMissing.of()
            private var suffix: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                model = body.model
                trainingFile = body.trainingFile
                hyperparameters = body.hyperparameters
                suffix = body.suffix
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The base model that is being fine-tuned. */
            fun model(model: String) = model(JsonField.of(model))

            /**
             * Sets [Builder.model] to an arbitrary JSON value.
             *
             * You should usually call [Builder.model] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun model(model: JsonField<String>) = apply { this.model = model }

            /** The storage bucket or object used for training. */
            fun trainingFile(trainingFile: String) = trainingFile(JsonField.of(trainingFile))

            /**
             * Sets [Builder.trainingFile] to an arbitrary JSON value.
             *
             * You should usually call [Builder.trainingFile] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun trainingFile(trainingFile: JsonField<String>) = apply {
                this.trainingFile = trainingFile
            }

            /** The hyperparameters used for the fine-tuning job. */
            fun hyperparameters(hyperparameters: Hyperparameters) =
                hyperparameters(JsonField.of(hyperparameters))

            /**
             * Sets [Builder.hyperparameters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hyperparameters] with a well-typed [Hyperparameters]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun hyperparameters(hyperparameters: JsonField<Hyperparameters>) = apply {
                this.hyperparameters = hyperparameters
            }

            /** Optional suffix to append to the fine tuned model's name. */
            fun suffix(suffix: String) = suffix(JsonField.of(suffix))

            /**
             * Sets [Builder.suffix] to an arbitrary JSON value.
             *
             * You should usually call [Builder.suffix] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun suffix(suffix: JsonField<String>) = apply { this.suffix = suffix }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .model()
             * .trainingFile()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("model", model),
                    checkRequired("trainingFile", trainingFile),
                    hyperparameters,
                    suffix,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            model()
            trainingFile()
            hyperparameters().ifPresent { it.validate() }
            suffix()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: TelnyxInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (model.asKnown().isPresent) 1 else 0) +
                (if (trainingFile.asKnown().isPresent) 1 else 0) +
                (hyperparameters.asKnown().getOrNull()?.validity() ?: 0) +
                (if (suffix.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                model == other.model &&
                trainingFile == other.trainingFile &&
                hyperparameters == other.hyperparameters &&
                suffix == other.suffix &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(model, trainingFile, hyperparameters, suffix, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{model=$model, trainingFile=$trainingFile, hyperparameters=$hyperparameters, suffix=$suffix, additionalProperties=$additionalProperties}"
    }

    /** The hyperparameters used for the fine-tuning job. */
    class Hyperparameters
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val nEpochs: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("n_epochs") @ExcludeMissing nEpochs: JsonField<Long> = JsonMissing.of()
        ) : this(nEpochs, mutableMapOf())

        /**
         * The number of epochs to train the model for. An epoch refers to one full cycle through
         * the training dataset. 'auto' decides the optimal number of epochs based on the size of
         * the dataset. If setting the number manually, we support any number between 1 and 50
         * epochs.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun nEpochs(): Optional<Long> = nEpochs.getOptional("n_epochs")

        /**
         * Returns the raw JSON value of [nEpochs].
         *
         * Unlike [nEpochs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("n_epochs") @ExcludeMissing fun _nEpochs(): JsonField<Long> = nEpochs

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Hyperparameters]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Hyperparameters]. */
        class Builder internal constructor() {

            private var nEpochs: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(hyperparameters: Hyperparameters) = apply {
                nEpochs = hyperparameters.nEpochs
                additionalProperties = hyperparameters.additionalProperties.toMutableMap()
            }

            /**
             * The number of epochs to train the model for. An epoch refers to one full cycle
             * through the training dataset. 'auto' decides the optimal number of epochs based on
             * the size of the dataset. If setting the number manually, we support any number
             * between 1 and 50 epochs.
             */
            fun nEpochs(nEpochs: Long) = nEpochs(JsonField.of(nEpochs))

            /**
             * Sets [Builder.nEpochs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nEpochs] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun nEpochs(nEpochs: JsonField<Long>) = apply { this.nEpochs = nEpochs }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Hyperparameters].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Hyperparameters =
                Hyperparameters(nEpochs, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Hyperparameters = apply {
            if (validated) {
                return@apply
            }

            nEpochs()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: TelnyxInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = (if (nEpochs.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Hyperparameters &&
                nEpochs == other.nEpochs &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(nEpochs, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Hyperparameters{nEpochs=$nEpochs, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is JobCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "JobCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
