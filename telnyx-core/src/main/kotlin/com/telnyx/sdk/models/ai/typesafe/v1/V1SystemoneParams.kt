// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.typesafe.v1

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.BaseDeserializer
import com.telnyx.sdk.core.BaseSerializer
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.allMaxBy
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * **Beta API.** Choose telnyx/decision-flash for the lowest cost and latency, or
 * telnyx/decision-pro for decisions that require long context, including inputs beyond Jev’s 32k
 * per-decision limit. Omitted model defaults to telnyx/decision-flash.
 *
 * Evaluate shared context using named choice, noul (yes/no), and score questions. Returns TypeSafe
 * System One-compatible answer shapes, the selected public model alias, and token usage. See the
 * [decision model guide](https://developers.telnyx.com/docs/inference/decision-models) for examples
 * and compatibility limits.
 *
 * The supported request subset requires instructions for every question, string descriptions for
 * criteria (or null for choice descriptions), 1–64 questions, and 2–64 options for choice and score
 * questions. The model field accepts only telnyx/decision-flash or telnyx/decision-pro. Unsupported
 * model values and unknown fields are rejected. The endpoint is synchronous and does not stream.
 *
 * Use the TypeSafe Python SDK with base_url set to https://api.telnyx.com/v2/ai/typesafe and a
 * Telnyx API key. The SDK appends /v1/systemone; explicitly set model to a supported Telnyx alias
 * because its own default model is not supported. Compatibility covers this operation and the
 * documented request subset; it does not include TypeSafe model listing. Scores describe relative
 * preference, not calibrated correctness.
 */
class V1SystemoneParams
private constructor(
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Between 1 and 64 named questions. Each key identifies the corresponding answer.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun questions(): Questions = body.questions()

    /**
     * Shared context evaluated by every question.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun state(): State = body.state()

    /**
     * Public model alias. telnyx/decision-flash offers the lowest cost and latency;
     * telnyx/decision-pro supports decisions that require long context, including inputs beyond
     * Jev’s 32k per-decision limit. Applies to every question in the request. Other values are
     * rejected.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun model(): Optional<Model> = body.model()

    /**
     * Returns the raw JSON value of [questions].
     *
     * Unlike [questions], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _questions(): JsonField<Questions> = body._questions()

    /**
     * Returns the raw JSON value of [state].
     *
     * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _state(): JsonField<State> = body._state()

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _model(): JsonField<Model> = body._model()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [V1SystemoneParams].
         *
         * The following fields are required:
         * ```java
         * .questions()
         * .state()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1SystemoneParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(v1SystemoneParams: V1SystemoneParams) = apply {
            body = v1SystemoneParams.body.toBuilder()
            additionalHeaders = v1SystemoneParams.additionalHeaders.toBuilder()
            additionalQueryParams = v1SystemoneParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [questions]
         * - [state]
         * - [model]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Between 1 and 64 named questions. Each key identifies the corresponding answer. */
        fun questions(questions: Questions) = apply { body.questions(questions) }

        /**
         * Sets [Builder.questions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.questions] with a well-typed [Questions] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun questions(questions: JsonField<Questions>) = apply { body.questions(questions) }

        /** Shared context evaluated by every question. */
        fun state(state: State) = apply { body.state(state) }

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [State] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun state(state: JsonField<State>) = apply { body.state(state) }

        /** Alias for calling [state] with `State.ofString(string)`. */
        fun state(string: String) = apply { body.state(string) }

        /** Alias for calling [state] with `State.ofUnionMember1(unionMember1)`. */
        fun state(unionMember1: State.UnionMember1) = apply { body.state(unionMember1) }

        /** Alias for calling [state] with `State.ofJsonValues(jsonValues)`. */
        fun stateOfJsonValues(jsonValues: List<JsonValue>) = apply {
            body.stateOfJsonValues(jsonValues)
        }

        /**
         * Public model alias. telnyx/decision-flash offers the lowest cost and latency;
         * telnyx/decision-pro supports decisions that require long context, including inputs beyond
         * Jev’s 32k per-decision limit. Applies to every question in the request. Other values are
         * rejected.
         */
        fun model(model: Model) = apply { body.model(model) }

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [Model] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<Model>) = apply { body.model(model) }

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

        fun additionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
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

        fun putAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
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

        fun replaceAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) =
            apply {
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
         * Returns an immutable instance of [V1SystemoneParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .questions()
         * .state()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): V1SystemoneParams =
            V1SystemoneParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Decision Models beta request. Choose a public model alias; omitted model defaults to
     * telnyx/decision-flash. Telnyx manages the underlying models behind these aliases.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val questions: JsonField<Questions>,
        private val state: JsonField<State>,
        private val model: JsonField<Model>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("questions")
            @ExcludeMissing
            questions: JsonField<Questions> = JsonMissing.of(),
            @JsonProperty("state") @ExcludeMissing state: JsonField<State> = JsonMissing.of(),
            @JsonProperty("model") @ExcludeMissing model: JsonField<Model> = JsonMissing.of(),
        ) : this(questions, state, model, mutableMapOf())

        /**
         * Between 1 and 64 named questions. Each key identifies the corresponding answer.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun questions(): Questions = questions.getRequired("questions")

        /**
         * Shared context evaluated by every question.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun state(): State = state.getRequired("state")

        /**
         * Public model alias. telnyx/decision-flash offers the lowest cost and latency;
         * telnyx/decision-pro supports decisions that require long context, including inputs beyond
         * Jev’s 32k per-decision limit. Applies to every question in the request. Other values are
         * rejected.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun model(): Optional<Model> = model.getOptional("model")

        /**
         * Returns the raw JSON value of [questions].
         *
         * Unlike [questions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("questions")
        @ExcludeMissing
        fun _questions(): JsonField<Questions> = questions

        /**
         * Returns the raw JSON value of [state].
         *
         * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<State> = state

        /**
         * Returns the raw JSON value of [model].
         *
         * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<Model> = model

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
             * .questions()
             * .state()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var questions: JsonField<Questions>? = null
            private var state: JsonField<State>? = null
            private var model: JsonField<Model> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                questions = body.questions
                state = body.state
                model = body.model
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Between 1 and 64 named questions. Each key identifies the corresponding answer. */
            fun questions(questions: Questions) = questions(JsonField.of(questions))

            /**
             * Sets [Builder.questions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.questions] with a well-typed [Questions] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun questions(questions: JsonField<Questions>) = apply { this.questions = questions }

            /** Shared context evaluated by every question. */
            fun state(state: State) = state(JsonField.of(state))

            /**
             * Sets [Builder.state] to an arbitrary JSON value.
             *
             * You should usually call [Builder.state] with a well-typed [State] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun state(state: JsonField<State>) = apply { this.state = state }

            /** Alias for calling [state] with `State.ofString(string)`. */
            fun state(string: String) = state(State.ofString(string))

            /** Alias for calling [state] with `State.ofUnionMember1(unionMember1)`. */
            fun state(unionMember1: State.UnionMember1) = state(State.ofUnionMember1(unionMember1))

            /** Alias for calling [state] with `State.ofJsonValues(jsonValues)`. */
            fun stateOfJsonValues(jsonValues: List<JsonValue>) =
                state(State.ofJsonValues(jsonValues))

            /**
             * Public model alias. telnyx/decision-flash offers the lowest cost and latency;
             * telnyx/decision-pro supports decisions that require long context, including inputs
             * beyond Jev’s 32k per-decision limit. Applies to every question in the request. Other
             * values are rejected.
             */
            fun model(model: Model) = model(JsonField.of(model))

            /**
             * Sets [Builder.model] to an arbitrary JSON value.
             *
             * You should usually call [Builder.model] with a well-typed [Model] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun model(model: JsonField<Model>) = apply { this.model = model }

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
             * .questions()
             * .state()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("questions", questions),
                    checkRequired("state", state),
                    model,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            questions().validate()
            state().validate()
            model().ifPresent { it.validate() }
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
            (questions.asKnown().getOrNull()?.validity() ?: 0) +
                (state.asKnown().getOrNull()?.validity() ?: 0) +
                (model.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                questions == other.questions &&
                state == other.state &&
                model == other.model &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(questions, state, model, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{questions=$questions, state=$state, model=$model, additionalProperties=$additionalProperties}"
    }

    /** Between 1 and 64 named questions. Each key identifies the corresponding answer. */
    class Questions
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Questions]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Questions]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(questions: Questions) = apply {
                additionalProperties = questions.additionalProperties.toMutableMap()
            }

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
             * Returns an immutable instance of [Questions].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Questions = Questions(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Questions = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Questions && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Questions{additionalProperties=$additionalProperties}"
    }

    /** Shared context evaluated by every question. */
    @JsonDeserialize(using = State.Deserializer::class)
    @JsonSerialize(using = State.Serializer::class)
    class State
    private constructor(
        private val string: String? = null,
        private val unionMember1: UnionMember1? = null,
        private val jsonValues: List<JsonValue>? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun unionMember1(): Optional<UnionMember1> = Optional.ofNullable(unionMember1)

        fun jsonValues(): Optional<List<JsonValue>> = Optional.ofNullable(jsonValues)

        fun isString(): Boolean = string != null

        fun isUnionMember1(): Boolean = unionMember1 != null

        fun isJsonValues(): Boolean = jsonValues != null

        fun asString(): String = string.getOrThrow("string")

        fun asUnionMember1(): UnionMember1 = unionMember1.getOrThrow("unionMember1")

        fun asJsonValues(): List<JsonValue> = jsonValues.getOrThrow("jsonValues")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```java
         * import com.telnyx.sdk.core.JsonValue;
         * import java.util.Optional;
         *
         * Optional<String> result = state.accept(new State.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitString(String string) {
         *         return Optional.of(string.toString());
         *     }
         *
         *     // ...
         *
         *     @Override
         *     public Optional<String> unknown(JsonValue json) {
         *         // Or inspect the `json`.
         *         return Optional.empty();
         *     }
         * });
         * ```
         *
         * @throws TelnyxInvalidDataException if [Visitor.unknown] is not overridden in [visitor]
         *   and the current variant is unknown.
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                string != null -> visitor.visitString(string)
                unionMember1 != null -> visitor.visitUnionMember1(unionMember1)
                jsonValues != null -> visitor.visitJsonValues(jsonValues)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): State = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitUnionMember1(unionMember1: UnionMember1) {
                        unionMember1.validate()
                    }

                    override fun visitJsonValues(jsonValues: List<JsonValue>) {}
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitString(string: String) = 1

                    override fun visitUnionMember1(unionMember1: UnionMember1) =
                        unionMember1.validity()

                    override fun visitJsonValues(jsonValues: List<JsonValue>) = jsonValues.size

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is State &&
                string == other.string &&
                unionMember1 == other.unionMember1 &&
                jsonValues == other.jsonValues
        }

        override fun hashCode(): Int = Objects.hash(string, unionMember1, jsonValues)

        override fun toString(): String =
            when {
                string != null -> "State{string=$string}"
                unionMember1 != null -> "State{unionMember1=$unionMember1}"
                jsonValues != null -> "State{jsonValues=$jsonValues}"
                _json != null -> "State{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid State")
            }

        companion object {

            @JvmStatic fun ofString(string: String) = State(string = string)

            @JvmStatic
            fun ofUnionMember1(unionMember1: UnionMember1) = State(unionMember1 = unionMember1)

            @JvmStatic
            fun ofJsonValues(jsonValues: List<JsonValue>) =
                State(jsonValues = jsonValues.toImmutable())
        }

        /** An interface that defines how to map each variant of [State] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitUnionMember1(unionMember1: UnionMember1): T

            fun visitJsonValues(jsonValues: List<JsonValue>): T

            /**
             * Maps an unknown variant of [State] to a value of type [T].
             *
             * An instance of [State] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws TelnyxInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw TelnyxInvalidDataException("Unknown State: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<State>(State::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): State {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<UnionMember1>())?.let {
                                State(unionMember1 = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                State(string = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<List<JsonValue>>())?.let {
                                State(jsonValues = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> State(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<State>(State::class) {

            override fun serialize(
                value: State,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.unionMember1 != null -> generator.writeObject(value.unionMember1)
                    value.jsonValues != null -> generator.writeObject(value.jsonValues)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid State")
                }
            }
        }

        class UnionMember1
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [UnionMember1]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UnionMember1]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(unionMember1: UnionMember1) = apply {
                    additionalProperties = unionMember1.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [UnionMember1].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): UnionMember1 = UnionMember1(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): UnionMember1 = apply {
                if (validated) {
                    return@apply
                }

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
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UnionMember1 && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "UnionMember1{additionalProperties=$additionalProperties}"
        }
    }

    /**
     * Public model alias. telnyx/decision-flash offers the lowest cost and latency;
     * telnyx/decision-pro supports decisions that require long context, including inputs beyond
     * Jev’s 32k per-decision limit. Applies to every question in the request. Other values are
     * rejected.
     */
    class Model @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val TELNYX_DECISION_FLASH = of("telnyx/decision-flash")

            @JvmField val TELNYX_DECISION_PRO = of("telnyx/decision-pro")

            @JvmStatic fun of(value: String) = Model(JsonField.of(value))
        }

        /** An enum containing [Model]'s known values. */
        enum class Known {
            TELNYX_DECISION_FLASH,
            TELNYX_DECISION_PRO,
        }

        /**
         * An enum containing [Model]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Model] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TELNYX_DECISION_FLASH,
            TELNYX_DECISION_PRO,
            /** An enum member indicating that [Model] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                TELNYX_DECISION_FLASH -> Value.TELNYX_DECISION_FLASH
                TELNYX_DECISION_PRO -> Value.TELNYX_DECISION_PRO
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                TELNYX_DECISION_FLASH -> Known.TELNYX_DECISION_FLASH
                TELNYX_DECISION_PRO -> Known.TELNYX_DECISION_PRO
                else -> throw TelnyxInvalidDataException("Unknown Model: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Model = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Model && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1SystemoneParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "V1SystemoneParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
