// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.voicedesigns

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Creates a new voice design (version 1) when `voice_design_id` is omitted. When `voice_design_id`
 * is provided, adds a new version to the existing design instead. A design can have at most 50
 * versions.
 */
class VoiceDesignCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Natural language description of the voice style, e.g. 'Speak in a warm, friendly tone with a
     * slight British accent'.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun prompt(): String = body.prompt()

    /**
     * Sample text to synthesize for this voice design.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun text(): String = body.text()

    /**
     * Language for synthesis. Supported values: Auto, Chinese, English, Japanese, Korean, German,
     * French, Russian, Portuguese, Spanish, Italian. Defaults to Auto.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun language(): Optional<String> = body.language()

    /**
     * Maximum number of tokens to generate. Default: 2048.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxNewTokens(): Optional<Long> = body.maxNewTokens()

    /**
     * Name for the voice design. Required when creating a new design (`voice_design_id` is not
     * provided); ignored when adding a version. Cannot be a UUID.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * Voice synthesis provider. `telnyx` uses the Qwen3TTS model; `minimax` uses the Minimax speech
     * models. Case-insensitive. Defaults to `telnyx`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun provider(): Optional<Provider> = body.provider()

    /**
     * Repetition penalty to reduce repeated patterns in generated audio. Default: 1.05.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun repetitionPenalty(): Optional<Float> = body.repetitionPenalty()

    /**
     * Sampling temperature controlling randomness. Higher values produce more varied output.
     * Default: 0.9.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun temperature(): Optional<Float> = body.temperature()

    /**
     * Top-k sampling parameter — limits the token vocabulary considered at each step. Default: 50.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun topK(): Optional<Long> = body.topK()

    /**
     * Top-p (nucleus) sampling parameter — cumulative probability cutoff for token selection.
     * Default: 1.0.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun topP(): Optional<Float> = body.topP()

    /**
     * ID of an existing voice design to add a new version to. When provided, a new version is
     * created instead of a new design.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun voiceDesignId(): Optional<String> = body.voiceDesignId()

    /**
     * Returns the raw JSON value of [prompt].
     *
     * Unlike [prompt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _prompt(): JsonField<String> = body._prompt()

    /**
     * Returns the raw JSON value of [text].
     *
     * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _text(): JsonField<String> = body._text()

    /**
     * Returns the raw JSON value of [language].
     *
     * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _language(): JsonField<String> = body._language()

    /**
     * Returns the raw JSON value of [maxNewTokens].
     *
     * Unlike [maxNewTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _maxNewTokens(): JsonField<Long> = body._maxNewTokens()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [provider].
     *
     * Unlike [provider], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _provider(): JsonField<Provider> = body._provider()

    /**
     * Returns the raw JSON value of [repetitionPenalty].
     *
     * Unlike [repetitionPenalty], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _repetitionPenalty(): JsonField<Float> = body._repetitionPenalty()

    /**
     * Returns the raw JSON value of [temperature].
     *
     * Unlike [temperature], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _temperature(): JsonField<Float> = body._temperature()

    /**
     * Returns the raw JSON value of [topK].
     *
     * Unlike [topK], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _topK(): JsonField<Long> = body._topK()

    /**
     * Returns the raw JSON value of [topP].
     *
     * Unlike [topP], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _topP(): JsonField<Float> = body._topP()

    /**
     * Returns the raw JSON value of [voiceDesignId].
     *
     * Unlike [voiceDesignId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _voiceDesignId(): JsonField<String> = body._voiceDesignId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [VoiceDesignCreateParams].
         *
         * The following fields are required:
         * ```java
         * .prompt()
         * .text()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VoiceDesignCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(voiceDesignCreateParams: VoiceDesignCreateParams) = apply {
            body = voiceDesignCreateParams.body.toBuilder()
            additionalHeaders = voiceDesignCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = voiceDesignCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [prompt]
         * - [text]
         * - [language]
         * - [maxNewTokens]
         * - [name]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Natural language description of the voice style, e.g. 'Speak in a warm, friendly tone
         * with a slight British accent'.
         */
        fun prompt(prompt: String) = apply { body.prompt(prompt) }

        /**
         * Sets [Builder.prompt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prompt] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun prompt(prompt: JsonField<String>) = apply { body.prompt(prompt) }

        /** Sample text to synthesize for this voice design. */
        fun text(text: String) = apply { body.text(text) }

        /**
         * Sets [Builder.text] to an arbitrary JSON value.
         *
         * You should usually call [Builder.text] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun text(text: JsonField<String>) = apply { body.text(text) }

        /**
         * Language for synthesis. Supported values: Auto, Chinese, English, Japanese, Korean,
         * German, French, Russian, Portuguese, Spanish, Italian. Defaults to Auto.
         */
        fun language(language: String) = apply { body.language(language) }

        /**
         * Sets [Builder.language] to an arbitrary JSON value.
         *
         * You should usually call [Builder.language] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun language(language: JsonField<String>) = apply { body.language(language) }

        /** Maximum number of tokens to generate. Default: 2048. */
        fun maxNewTokens(maxNewTokens: Long) = apply { body.maxNewTokens(maxNewTokens) }

        /**
         * Sets [Builder.maxNewTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxNewTokens] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxNewTokens(maxNewTokens: JsonField<Long>) = apply { body.maxNewTokens(maxNewTokens) }

        /**
         * Name for the voice design. Required when creating a new design (`voice_design_id` is not
         * provided); ignored when adding a version. Cannot be a UUID.
         */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /**
         * Voice synthesis provider. `telnyx` uses the Qwen3TTS model; `minimax` uses the Minimax
         * speech models. Case-insensitive. Defaults to `telnyx`.
         */
        fun provider(provider: Provider) = apply { body.provider(provider) }

        /**
         * Sets [Builder.provider] to an arbitrary JSON value.
         *
         * You should usually call [Builder.provider] with a well-typed [Provider] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun provider(provider: JsonField<Provider>) = apply { body.provider(provider) }

        /** Repetition penalty to reduce repeated patterns in generated audio. Default: 1.05. */
        fun repetitionPenalty(repetitionPenalty: Float) = apply {
            body.repetitionPenalty(repetitionPenalty)
        }

        /**
         * Sets [Builder.repetitionPenalty] to an arbitrary JSON value.
         *
         * You should usually call [Builder.repetitionPenalty] with a well-typed [Float] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun repetitionPenalty(repetitionPenalty: JsonField<Float>) = apply {
            body.repetitionPenalty(repetitionPenalty)
        }

        /**
         * Sampling temperature controlling randomness. Higher values produce more varied output.
         * Default: 0.9.
         */
        fun temperature(temperature: Float) = apply { body.temperature(temperature) }

        /**
         * Sets [Builder.temperature] to an arbitrary JSON value.
         *
         * You should usually call [Builder.temperature] with a well-typed [Float] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun temperature(temperature: JsonField<Float>) = apply { body.temperature(temperature) }

        /**
         * Top-k sampling parameter — limits the token vocabulary considered at each step.
         * Default: 50.
         */
        fun topK(topK: Long) = apply { body.topK(topK) }

        /**
         * Sets [Builder.topK] to an arbitrary JSON value.
         *
         * You should usually call [Builder.topK] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun topK(topK: JsonField<Long>) = apply { body.topK(topK) }

        /**
         * Top-p (nucleus) sampling parameter — cumulative probability cutoff for token selection.
         * Default: 1.0.
         */
        fun topP(topP: Float) = apply { body.topP(topP) }

        /**
         * Sets [Builder.topP] to an arbitrary JSON value.
         *
         * You should usually call [Builder.topP] with a well-typed [Float] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun topP(topP: JsonField<Float>) = apply { body.topP(topP) }

        /**
         * ID of an existing voice design to add a new version to. When provided, a new version is
         * created instead of a new design.
         */
        fun voiceDesignId(voiceDesignId: String) = apply { body.voiceDesignId(voiceDesignId) }

        /**
         * Sets [Builder.voiceDesignId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voiceDesignId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun voiceDesignId(voiceDesignId: JsonField<String>) = apply {
            body.voiceDesignId(voiceDesignId)
        }

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
         * Returns an immutable instance of [VoiceDesignCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .prompt()
         * .text()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VoiceDesignCreateParams =
            VoiceDesignCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Request body for creating a new voice design or adding a version to an existing one. Omit
     * `voice_design_id` to create a new design; include it to add a new version.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val prompt: JsonField<String>,
        private val text: JsonField<String>,
        private val language: JsonField<String>,
        private val maxNewTokens: JsonField<Long>,
        private val name: JsonField<String>,
        private val provider: JsonField<Provider>,
        private val repetitionPenalty: JsonField<Float>,
        private val temperature: JsonField<Float>,
        private val topK: JsonField<Long>,
        private val topP: JsonField<Float>,
        private val voiceDesignId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("prompt") @ExcludeMissing prompt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
            @JsonProperty("language")
            @ExcludeMissing
            language: JsonField<String> = JsonMissing.of(),
            @JsonProperty("max_new_tokens")
            @ExcludeMissing
            maxNewTokens: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("provider")
            @ExcludeMissing
            provider: JsonField<Provider> = JsonMissing.of(),
            @JsonProperty("repetition_penalty")
            @ExcludeMissing
            repetitionPenalty: JsonField<Float> = JsonMissing.of(),
            @JsonProperty("temperature")
            @ExcludeMissing
            temperature: JsonField<Float> = JsonMissing.of(),
            @JsonProperty("top_k") @ExcludeMissing topK: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("top_p") @ExcludeMissing topP: JsonField<Float> = JsonMissing.of(),
            @JsonProperty("voice_design_id")
            @ExcludeMissing
            voiceDesignId: JsonField<String> = JsonMissing.of(),
        ) : this(
            prompt,
            text,
            language,
            maxNewTokens,
            name,
            provider,
            repetitionPenalty,
            temperature,
            topK,
            topP,
            voiceDesignId,
            mutableMapOf(),
        )

        /**
         * Natural language description of the voice style, e.g. 'Speak in a warm, friendly tone
         * with a slight British accent'.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun prompt(): String = prompt.getRequired("prompt")

        /**
         * Sample text to synthesize for this voice design.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun text(): String = text.getRequired("text")

        /**
         * Language for synthesis. Supported values: Auto, Chinese, English, Japanese, Korean,
         * German, French, Russian, Portuguese, Spanish, Italian. Defaults to Auto.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun language(): Optional<String> = language.getOptional("language")

        /**
         * Maximum number of tokens to generate. Default: 2048.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maxNewTokens(): Optional<Long> = maxNewTokens.getOptional("max_new_tokens")

        /**
         * Name for the voice design. Required when creating a new design (`voice_design_id` is not
         * provided); ignored when adding a version. Cannot be a UUID.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Voice synthesis provider. `telnyx` uses the Qwen3TTS model; `minimax` uses the Minimax
         * speech models. Case-insensitive. Defaults to `telnyx`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun provider(): Optional<Provider> = provider.getOptional("provider")

        /**
         * Repetition penalty to reduce repeated patterns in generated audio. Default: 1.05.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun repetitionPenalty(): Optional<Float> =
            repetitionPenalty.getOptional("repetition_penalty")

        /**
         * Sampling temperature controlling randomness. Higher values produce more varied output.
         * Default: 0.9.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun temperature(): Optional<Float> = temperature.getOptional("temperature")

        /**
         * Top-k sampling parameter — limits the token vocabulary considered at each step.
         * Default: 50.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun topK(): Optional<Long> = topK.getOptional("top_k")

        /**
         * Top-p (nucleus) sampling parameter — cumulative probability cutoff for token selection.
         * Default: 1.0.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun topP(): Optional<Float> = topP.getOptional("top_p")

        /**
         * ID of an existing voice design to add a new version to. When provided, a new version is
         * created instead of a new design.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun voiceDesignId(): Optional<String> = voiceDesignId.getOptional("voice_design_id")

        /**
         * Returns the raw JSON value of [prompt].
         *
         * Unlike [prompt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("prompt") @ExcludeMissing fun _prompt(): JsonField<String> = prompt

        /**
         * Returns the raw JSON value of [text].
         *
         * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

        /**
         * Returns the raw JSON value of [language].
         *
         * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<String> = language

        /**
         * Returns the raw JSON value of [maxNewTokens].
         *
         * Unlike [maxNewTokens], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("max_new_tokens")
        @ExcludeMissing
        fun _maxNewTokens(): JsonField<Long> = maxNewTokens

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [provider].
         *
         * Unlike [provider], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<Provider> = provider

        /**
         * Returns the raw JSON value of [repetitionPenalty].
         *
         * Unlike [repetitionPenalty], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("repetition_penalty")
        @ExcludeMissing
        fun _repetitionPenalty(): JsonField<Float> = repetitionPenalty

        /**
         * Returns the raw JSON value of [temperature].
         *
         * Unlike [temperature], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("temperature")
        @ExcludeMissing
        fun _temperature(): JsonField<Float> = temperature

        /**
         * Returns the raw JSON value of [topK].
         *
         * Unlike [topK], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("top_k") @ExcludeMissing fun _topK(): JsonField<Long> = topK

        /**
         * Returns the raw JSON value of [topP].
         *
         * Unlike [topP], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("top_p") @ExcludeMissing fun _topP(): JsonField<Float> = topP

        /**
         * Returns the raw JSON value of [voiceDesignId].
         *
         * Unlike [voiceDesignId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("voice_design_id")
        @ExcludeMissing
        fun _voiceDesignId(): JsonField<String> = voiceDesignId

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
             * .prompt()
             * .text()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var prompt: JsonField<String>? = null
            private var text: JsonField<String>? = null
            private var language: JsonField<String> = JsonMissing.of()
            private var maxNewTokens: JsonField<Long> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var provider: JsonField<Provider> = JsonMissing.of()
            private var repetitionPenalty: JsonField<Float> = JsonMissing.of()
            private var temperature: JsonField<Float> = JsonMissing.of()
            private var topK: JsonField<Long> = JsonMissing.of()
            private var topP: JsonField<Float> = JsonMissing.of()
            private var voiceDesignId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                prompt = body.prompt
                text = body.text
                language = body.language
                maxNewTokens = body.maxNewTokens
                name = body.name
                provider = body.provider
                repetitionPenalty = body.repetitionPenalty
                temperature = body.temperature
                topK = body.topK
                topP = body.topP
                voiceDesignId = body.voiceDesignId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Natural language description of the voice style, e.g. 'Speak in a warm, friendly tone
             * with a slight British accent'.
             */
            fun prompt(prompt: String) = prompt(JsonField.of(prompt))

            /**
             * Sets [Builder.prompt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.prompt] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun prompt(prompt: JsonField<String>) = apply { this.prompt = prompt }

            /** Sample text to synthesize for this voice design. */
            fun text(text: String) = text(JsonField.of(text))

            /**
             * Sets [Builder.text] to an arbitrary JSON value.
             *
             * You should usually call [Builder.text] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun text(text: JsonField<String>) = apply { this.text = text }

            /**
             * Language for synthesis. Supported values: Auto, Chinese, English, Japanese, Korean,
             * German, French, Russian, Portuguese, Spanish, Italian. Defaults to Auto.
             */
            fun language(language: String) = language(JsonField.of(language))

            /**
             * Sets [Builder.language] to an arbitrary JSON value.
             *
             * You should usually call [Builder.language] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun language(language: JsonField<String>) = apply { this.language = language }

            /** Maximum number of tokens to generate. Default: 2048. */
            fun maxNewTokens(maxNewTokens: Long) = maxNewTokens(JsonField.of(maxNewTokens))

            /**
             * Sets [Builder.maxNewTokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxNewTokens] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxNewTokens(maxNewTokens: JsonField<Long>) = apply {
                this.maxNewTokens = maxNewTokens
            }

            /**
             * Name for the voice design. Required when creating a new design (`voice_design_id` is
             * not provided); ignored when adding a version. Cannot be a UUID.
             */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * Voice synthesis provider. `telnyx` uses the Qwen3TTS model; `minimax` uses the
             * Minimax speech models. Case-insensitive. Defaults to `telnyx`.
             */
            fun provider(provider: Provider) = provider(JsonField.of(provider))

            /**
             * Sets [Builder.provider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.provider] with a well-typed [Provider] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun provider(provider: JsonField<Provider>) = apply { this.provider = provider }

            /** Repetition penalty to reduce repeated patterns in generated audio. Default: 1.05. */
            fun repetitionPenalty(repetitionPenalty: Float) =
                repetitionPenalty(JsonField.of(repetitionPenalty))

            /**
             * Sets [Builder.repetitionPenalty] to an arbitrary JSON value.
             *
             * You should usually call [Builder.repetitionPenalty] with a well-typed [Float] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun repetitionPenalty(repetitionPenalty: JsonField<Float>) = apply {
                this.repetitionPenalty = repetitionPenalty
            }

            /**
             * Sampling temperature controlling randomness. Higher values produce more varied
             * output. Default: 0.9.
             */
            fun temperature(temperature: Float) = temperature(JsonField.of(temperature))

            /**
             * Sets [Builder.temperature] to an arbitrary JSON value.
             *
             * You should usually call [Builder.temperature] with a well-typed [Float] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun temperature(temperature: JsonField<Float>) = apply {
                this.temperature = temperature
            }

            /**
             * Top-k sampling parameter — limits the token vocabulary considered at each step.
             * Default: 50.
             */
            fun topK(topK: Long) = topK(JsonField.of(topK))

            /**
             * Sets [Builder.topK] to an arbitrary JSON value.
             *
             * You should usually call [Builder.topK] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun topK(topK: JsonField<Long>) = apply { this.topK = topK }

            /**
             * Top-p (nucleus) sampling parameter — cumulative probability cutoff for token
             * selection. Default: 1.0.
             */
            fun topP(topP: Float) = topP(JsonField.of(topP))

            /**
             * Sets [Builder.topP] to an arbitrary JSON value.
             *
             * You should usually call [Builder.topP] with a well-typed [Float] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun topP(topP: JsonField<Float>) = apply { this.topP = topP }

            /**
             * ID of an existing voice design to add a new version to. When provided, a new version
             * is created instead of a new design.
             */
            fun voiceDesignId(voiceDesignId: String) = voiceDesignId(JsonField.of(voiceDesignId))

            /**
             * Sets [Builder.voiceDesignId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.voiceDesignId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun voiceDesignId(voiceDesignId: JsonField<String>) = apply {
                this.voiceDesignId = voiceDesignId
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .prompt()
             * .text()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("prompt", prompt),
                    checkRequired("text", text),
                    language,
                    maxNewTokens,
                    name,
                    provider,
                    repetitionPenalty,
                    temperature,
                    topK,
                    topP,
                    voiceDesignId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            prompt()
            text()
            language()
            maxNewTokens()
            name()
            provider().ifPresent { it.validate() }
            repetitionPenalty()
            temperature()
            topK()
            topP()
            voiceDesignId()
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
            (if (prompt.asKnown().isPresent) 1 else 0) +
                (if (text.asKnown().isPresent) 1 else 0) +
                (if (language.asKnown().isPresent) 1 else 0) +
                (if (maxNewTokens.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (provider.asKnown().getOrNull()?.validity() ?: 0) +
                (if (repetitionPenalty.asKnown().isPresent) 1 else 0) +
                (if (temperature.asKnown().isPresent) 1 else 0) +
                (if (topK.asKnown().isPresent) 1 else 0) +
                (if (topP.asKnown().isPresent) 1 else 0) +
                (if (voiceDesignId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                prompt == other.prompt &&
                text == other.text &&
                language == other.language &&
                maxNewTokens == other.maxNewTokens &&
                name == other.name &&
                provider == other.provider &&
                repetitionPenalty == other.repetitionPenalty &&
                temperature == other.temperature &&
                topK == other.topK &&
                topP == other.topP &&
                voiceDesignId == other.voiceDesignId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                prompt,
                text,
                language,
                maxNewTokens,
                name,
                provider,
                repetitionPenalty,
                temperature,
                topK,
                topP,
                voiceDesignId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{prompt=$prompt, text=$text, language=$language, maxNewTokens=$maxNewTokens, name=$name, provider=$provider, repetitionPenalty=$repetitionPenalty, temperature=$temperature, topK=$topK, topP=$topP, voiceDesignId=$voiceDesignId, additionalProperties=$additionalProperties}"
    }

    /**
     * Voice synthesis provider. `telnyx` uses the Qwen3TTS model; `minimax` uses the Minimax speech
     * models. Case-insensitive. Defaults to `telnyx`.
     */
    class Provider @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val TELNYX = of("telnyx")

            @JvmField val MINIMAX = of("minimax")

            @JvmStatic fun of(value: String) = Provider(JsonField.of(value))
        }

        /** An enum containing [Provider]'s known values. */
        enum class Known {
            TELNYX,
            MINIMAX,
        }

        /**
         * An enum containing [Provider]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Provider] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TELNYX,
            MINIMAX,
            /** An enum member indicating that [Provider] was instantiated with an unknown value. */
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
                TELNYX -> Value.TELNYX
                MINIMAX -> Value.MINIMAX
                TELNYX -> Value.TELNYX
                MINIMAX -> Value.MINIMAX
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
                TELNYX -> Known.TELNYX
                MINIMAX -> Known.MINIMAX
                TELNYX -> Known.TELNYX
                MINIMAX -> Known.MINIMAX
                else -> throw TelnyxInvalidDataException("Unknown Provider: $value")
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

        fun validate(): Provider = apply {
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

            return other is Provider && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VoiceDesignCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "VoiceDesignCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
