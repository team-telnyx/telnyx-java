// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Splits the conversation between a frontend model that talks to the caller and a backend model
 * that does the work. On the GPT-Live route the frontend model cannot call tools at all — when it
 * needs something done it raises a delegation and waits. On the chat completion route the frontend
 * keeps a single `delegate` tool that returns immediately, so the conversation carries on while the
 * backend works. Either way the backend's answer is spoken as commentary or kept as silent context,
 * depending on `speak_results`. Beta feature.
 */
class DelegationSettings
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val enabled: JsonField<Boolean>,
    private val externalLlm: JsonField<ExternalLlm>,
    private val instructions: JsonField<String>,
    private val llmApiKeyRef: JsonField<String>,
    private val mode: JsonField<Mode>,
    private val model: JsonField<String>,
    private val speakResults: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("enabled") @ExcludeMissing enabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("external_llm")
        @ExcludeMissing
        externalLlm: JsonField<ExternalLlm> = JsonMissing.of(),
        @JsonProperty("instructions")
        @ExcludeMissing
        instructions: JsonField<String> = JsonMissing.of(),
        @JsonProperty("llm_api_key_ref")
        @ExcludeMissing
        llmApiKeyRef: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mode") @ExcludeMissing mode: JsonField<Mode> = JsonMissing.of(),
        @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
        @JsonProperty("speak_results")
        @ExcludeMissing
        speakResults: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        enabled,
        externalLlm,
        instructions,
        llmApiKeyRef,
        mode,
        model,
        speakResults,
        mutableMapOf(),
    )

    /**
     * Whether the assistant delegates work to a backend model. Defaults to `true`: a GPT-Live
     * assistant with delegation disabled can hold a conversation but can never look anything up or
     * run a tool.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enabled(): Optional<Boolean> = enabled.getOptional("enabled")

    /**
     * Run the backend on your own OpenAI-compatible endpoint instead of a Telnyx-hosted model. As
     * above, a raw `api_key` here is rejected — reference an integration secret with
     * `external_llm.llm_api_key_ref` instead.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalLlm(): Optional<ExternalLlm> = externalLlm.getOptional("external_llm")

    /**
     * Extra instructions for the backend model, in addition to the assistant's own. Use this for
     * the business rules the backend needs and the talking model does not.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun instructions(): Optional<String> = instructions.getOptional("instructions")

    /**
     * Integration secret identifier for the backend model's API key. Required for models from
     * providers other than Telnyx, OpenAI and Anthropic. A raw `api_key` is rejected rather than
     * ignored, so that no plaintext credential is stored on the assistant.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun llmApiKeyRef(): Optional<String> = llmApiKeyRef.getOptional("llm_api_key_ref")

    /**
     * Who answers a delegation. `telnyx` runs the backend model on Telnyx with the assistant's own
     * tools, MCP servers and observability. `client` relays the delegation to a server you host
     * over the WebSocket configured in `websocket_settings`: Telnyx sends a
     * `session.delegation.created` frame and waits for your `session.delegation.completed` answer.
     * That answer is text only, since the socket offers no tool vocabulary. If no socket is
     * connected the delegation is refused and the assistant tells the caller it cannot look things
     * up right now. Defaults to `telnyx`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mode(): Optional<Mode> = mode.getOptional("mode")

    /**
     * The backend model that answers delegations. Must be a model available for AI Assistants.
     * Leave unset to use the platform default backend model. Only applies when `mode` is `telnyx`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun model(): Optional<String> = model.getOptional("model")

    /**
     * Whether the backend's answer is spoken to the caller. When `true` the result is appended as
     * commentary and paraphrased aloud; when `false` it is kept as silent context that informs
     * later answers without being read out. Defaults to `true`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun speakResults(): Optional<Boolean> = speakResults.getOptional("speak_results")

    /**
     * Returns the raw JSON value of [enabled].
     *
     * Unlike [enabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

    /**
     * Returns the raw JSON value of [externalLlm].
     *
     * Unlike [externalLlm], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("external_llm")
    @ExcludeMissing
    fun _externalLlm(): JsonField<ExternalLlm> = externalLlm

    /**
     * Returns the raw JSON value of [instructions].
     *
     * Unlike [instructions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("instructions")
    @ExcludeMissing
    fun _instructions(): JsonField<String> = instructions

    /**
     * Returns the raw JSON value of [llmApiKeyRef].
     *
     * Unlike [llmApiKeyRef], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("llm_api_key_ref")
    @ExcludeMissing
    fun _llmApiKeyRef(): JsonField<String> = llmApiKeyRef

    /**
     * Returns the raw JSON value of [mode].
     *
     * Unlike [mode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mode") @ExcludeMissing fun _mode(): JsonField<Mode> = mode

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

    /**
     * Returns the raw JSON value of [speakResults].
     *
     * Unlike [speakResults], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("speak_results")
    @ExcludeMissing
    fun _speakResults(): JsonField<Boolean> = speakResults

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

        /** Returns a mutable builder for constructing an instance of [DelegationSettings]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DelegationSettings]. */
    class Builder internal constructor() {

        private var enabled: JsonField<Boolean> = JsonMissing.of()
        private var externalLlm: JsonField<ExternalLlm> = JsonMissing.of()
        private var instructions: JsonField<String> = JsonMissing.of()
        private var llmApiKeyRef: JsonField<String> = JsonMissing.of()
        private var mode: JsonField<Mode> = JsonMissing.of()
        private var model: JsonField<String> = JsonMissing.of()
        private var speakResults: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(delegationSettings: DelegationSettings) = apply {
            enabled = delegationSettings.enabled
            externalLlm = delegationSettings.externalLlm
            instructions = delegationSettings.instructions
            llmApiKeyRef = delegationSettings.llmApiKeyRef
            mode = delegationSettings.mode
            model = delegationSettings.model
            speakResults = delegationSettings.speakResults
            additionalProperties = delegationSettings.additionalProperties.toMutableMap()
        }

        /**
         * Whether the assistant delegates work to a backend model. Defaults to `true`: a GPT-Live
         * assistant with delegation disabled can hold a conversation but can never look anything up
         * or run a tool.
         */
        fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

        /**
         * Sets [Builder.enabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enabled] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

        /**
         * Run the backend on your own OpenAI-compatible endpoint instead of a Telnyx-hosted model.
         * As above, a raw `api_key` here is rejected — reference an integration secret with
         * `external_llm.llm_api_key_ref` instead.
         */
        fun externalLlm(externalLlm: ExternalLlm) = externalLlm(JsonField.of(externalLlm))

        /**
         * Sets [Builder.externalLlm] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalLlm] with a well-typed [ExternalLlm] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun externalLlm(externalLlm: JsonField<ExternalLlm>) = apply {
            this.externalLlm = externalLlm
        }

        /**
         * Extra instructions for the backend model, in addition to the assistant's own. Use this
         * for the business rules the backend needs and the talking model does not.
         */
        fun instructions(instructions: String) = instructions(JsonField.of(instructions))

        /**
         * Sets [Builder.instructions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instructions] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun instructions(instructions: JsonField<String>) = apply {
            this.instructions = instructions
        }

        /**
         * Integration secret identifier for the backend model's API key. Required for models from
         * providers other than Telnyx, OpenAI and Anthropic. A raw `api_key` is rejected rather
         * than ignored, so that no plaintext credential is stored on the assistant.
         */
        fun llmApiKeyRef(llmApiKeyRef: String) = llmApiKeyRef(JsonField.of(llmApiKeyRef))

        /**
         * Sets [Builder.llmApiKeyRef] to an arbitrary JSON value.
         *
         * You should usually call [Builder.llmApiKeyRef] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun llmApiKeyRef(llmApiKeyRef: JsonField<String>) = apply {
            this.llmApiKeyRef = llmApiKeyRef
        }

        /**
         * Who answers a delegation. `telnyx` runs the backend model on Telnyx with the assistant's
         * own tools, MCP servers and observability. `client` relays the delegation to a server you
         * host over the WebSocket configured in `websocket_settings`: Telnyx sends a
         * `session.delegation.created` frame and waits for your `session.delegation.completed`
         * answer. That answer is text only, since the socket offers no tool vocabulary. If no
         * socket is connected the delegation is refused and the assistant tells the caller it
         * cannot look things up right now. Defaults to `telnyx`.
         */
        fun mode(mode: Mode) = mode(JsonField.of(mode))

        /**
         * Sets [Builder.mode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mode] with a well-typed [Mode] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mode(mode: JsonField<Mode>) = apply { this.mode = mode }

        /**
         * The backend model that answers delegations. Must be a model available for AI Assistants.
         * Leave unset to use the platform default backend model. Only applies when `mode` is
         * `telnyx`.
         */
        fun model(model: String) = model(JsonField.of(model))

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<String>) = apply { this.model = model }

        /**
         * Whether the backend's answer is spoken to the caller. When `true` the result is appended
         * as commentary and paraphrased aloud; when `false` it is kept as silent context that
         * informs later answers without being read out. Defaults to `true`.
         */
        fun speakResults(speakResults: Boolean) = speakResults(JsonField.of(speakResults))

        /**
         * Sets [Builder.speakResults] to an arbitrary JSON value.
         *
         * You should usually call [Builder.speakResults] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun speakResults(speakResults: JsonField<Boolean>) = apply {
            this.speakResults = speakResults
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
         * Returns an immutable instance of [DelegationSettings].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): DelegationSettings =
            DelegationSettings(
                enabled,
                externalLlm,
                instructions,
                llmApiKeyRef,
                mode,
                model,
                speakResults,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): DelegationSettings = apply {
        if (validated) {
            return@apply
        }

        enabled()
        externalLlm().ifPresent { it.validate() }
        instructions()
        llmApiKeyRef()
        mode().ifPresent { it.validate() }
        model()
        speakResults()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (enabled.asKnown().isPresent) 1 else 0) +
            (externalLlm.asKnown().getOrNull()?.validity() ?: 0) +
            (if (instructions.asKnown().isPresent) 1 else 0) +
            (if (llmApiKeyRef.asKnown().isPresent) 1 else 0) +
            (mode.asKnown().getOrNull()?.validity() ?: 0) +
            (if (model.asKnown().isPresent) 1 else 0) +
            (if (speakResults.asKnown().isPresent) 1 else 0)

    /**
     * Who answers a delegation. `telnyx` runs the backend model on Telnyx with the assistant's own
     * tools, MCP servers and observability. `client` relays the delegation to a server you host
     * over the WebSocket configured in `websocket_settings`: Telnyx sends a
     * `session.delegation.created` frame and waits for your `session.delegation.completed` answer.
     * That answer is text only, since the socket offers no tool vocabulary. If no socket is
     * connected the delegation is refused and the assistant tells the caller it cannot look things
     * up right now. Defaults to `telnyx`.
     */
    class Mode @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val CLIENT = of("client")

            @JvmStatic fun of(value: String) = Mode(JsonField.of(value))
        }

        /** An enum containing [Mode]'s known values. */
        enum class Known {
            TELNYX,
            CLIENT,
        }

        /**
         * An enum containing [Mode]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Mode] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TELNYX,
            CLIENT,
            /** An enum member indicating that [Mode] was instantiated with an unknown value. */
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
                CLIENT -> Value.CLIENT
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
                CLIENT -> Known.CLIENT
                else -> throw TelnyxInvalidDataException("Unknown Mode: $value")
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
        fun validate(): Mode = apply {
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

            return other is Mode && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DelegationSettings &&
            enabled == other.enabled &&
            externalLlm == other.externalLlm &&
            instructions == other.instructions &&
            llmApiKeyRef == other.llmApiKeyRef &&
            mode == other.mode &&
            model == other.model &&
            speakResults == other.speakResults &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            enabled,
            externalLlm,
            instructions,
            llmApiKeyRef,
            mode,
            model,
            speakResults,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DelegationSettings{enabled=$enabled, externalLlm=$externalLlm, instructions=$instructions, llmApiKeyRef=$llmApiKeyRef, mode=$mode, model=$model, speakResults=$speakResults, additionalProperties=$additionalProperties}"
}
