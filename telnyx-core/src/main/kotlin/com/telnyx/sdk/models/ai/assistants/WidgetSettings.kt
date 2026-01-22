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

/** Configuration settings for the assistant's web widget. */
class WidgetSettings
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val agentThinkingText: JsonField<String>,
    private val audioVisualizerConfig: JsonField<AudioVisualizerConfig>,
    private val defaultState: JsonField<DefaultState>,
    private val giveFeedbackUrl: JsonField<String>,
    private val logoIconUrl: JsonField<String>,
    private val position: JsonField<Position>,
    private val reportIssueUrl: JsonField<String>,
    private val speakToInterruptText: JsonField<String>,
    private val startCallText: JsonField<String>,
    private val theme: JsonField<Theme>,
    private val viewHistoryUrl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("agent_thinking_text")
        @ExcludeMissing
        agentThinkingText: JsonField<String> = JsonMissing.of(),
        @JsonProperty("audio_visualizer_config")
        @ExcludeMissing
        audioVisualizerConfig: JsonField<AudioVisualizerConfig> = JsonMissing.of(),
        @JsonProperty("default_state")
        @ExcludeMissing
        defaultState: JsonField<DefaultState> = JsonMissing.of(),
        @JsonProperty("give_feedback_url")
        @ExcludeMissing
        giveFeedbackUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("logo_icon_url")
        @ExcludeMissing
        logoIconUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("position") @ExcludeMissing position: JsonField<Position> = JsonMissing.of(),
        @JsonProperty("report_issue_url")
        @ExcludeMissing
        reportIssueUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("speak_to_interrupt_text")
        @ExcludeMissing
        speakToInterruptText: JsonField<String> = JsonMissing.of(),
        @JsonProperty("start_call_text")
        @ExcludeMissing
        startCallText: JsonField<String> = JsonMissing.of(),
        @JsonProperty("theme") @ExcludeMissing theme: JsonField<Theme> = JsonMissing.of(),
        @JsonProperty("view_history_url")
        @ExcludeMissing
        viewHistoryUrl: JsonField<String> = JsonMissing.of(),
    ) : this(
        agentThinkingText,
        audioVisualizerConfig,
        defaultState,
        giveFeedbackUrl,
        logoIconUrl,
        position,
        reportIssueUrl,
        speakToInterruptText,
        startCallText,
        theme,
        viewHistoryUrl,
        mutableMapOf(),
    )

    /**
     * Text displayed while the agent is processing.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun agentThinkingText(): Optional<String> = agentThinkingText.getOptional("agent_thinking_text")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun audioVisualizerConfig(): Optional<AudioVisualizerConfig> =
        audioVisualizerConfig.getOptional("audio_visualizer_config")

    /**
     * The default state of the widget.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun defaultState(): Optional<DefaultState> = defaultState.getOptional("default_state")

    /**
     * URL for users to give feedback.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun giveFeedbackUrl(): Optional<String> = giveFeedbackUrl.getOptional("give_feedback_url")

    /**
     * URL to a custom logo icon for the widget.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun logoIconUrl(): Optional<String> = logoIconUrl.getOptional("logo_icon_url")

    /**
     * The positioning style for the widget.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun position(): Optional<Position> = position.getOptional("position")

    /**
     * URL for users to report issues.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reportIssueUrl(): Optional<String> = reportIssueUrl.getOptional("report_issue_url")

    /**
     * Text prompting users to speak to interrupt.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun speakToInterruptText(): Optional<String> =
        speakToInterruptText.getOptional("speak_to_interrupt_text")

    /**
     * Custom text displayed on the start call button.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startCallText(): Optional<String> = startCallText.getOptional("start_call_text")

    /**
     * The visual theme for the widget.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun theme(): Optional<Theme> = theme.getOptional("theme")

    /**
     * URL to view conversation history.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun viewHistoryUrl(): Optional<String> = viewHistoryUrl.getOptional("view_history_url")

    /**
     * Returns the raw JSON value of [agentThinkingText].
     *
     * Unlike [agentThinkingText], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("agent_thinking_text")
    @ExcludeMissing
    fun _agentThinkingText(): JsonField<String> = agentThinkingText

    /**
     * Returns the raw JSON value of [audioVisualizerConfig].
     *
     * Unlike [audioVisualizerConfig], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("audio_visualizer_config")
    @ExcludeMissing
    fun _audioVisualizerConfig(): JsonField<AudioVisualizerConfig> = audioVisualizerConfig

    /**
     * Returns the raw JSON value of [defaultState].
     *
     * Unlike [defaultState], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("default_state")
    @ExcludeMissing
    fun _defaultState(): JsonField<DefaultState> = defaultState

    /**
     * Returns the raw JSON value of [giveFeedbackUrl].
     *
     * Unlike [giveFeedbackUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("give_feedback_url")
    @ExcludeMissing
    fun _giveFeedbackUrl(): JsonField<String> = giveFeedbackUrl

    /**
     * Returns the raw JSON value of [logoIconUrl].
     *
     * Unlike [logoIconUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("logo_icon_url")
    @ExcludeMissing
    fun _logoIconUrl(): JsonField<String> = logoIconUrl

    /**
     * Returns the raw JSON value of [position].
     *
     * Unlike [position], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("position") @ExcludeMissing fun _position(): JsonField<Position> = position

    /**
     * Returns the raw JSON value of [reportIssueUrl].
     *
     * Unlike [reportIssueUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("report_issue_url")
    @ExcludeMissing
    fun _reportIssueUrl(): JsonField<String> = reportIssueUrl

    /**
     * Returns the raw JSON value of [speakToInterruptText].
     *
     * Unlike [speakToInterruptText], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("speak_to_interrupt_text")
    @ExcludeMissing
    fun _speakToInterruptText(): JsonField<String> = speakToInterruptText

    /**
     * Returns the raw JSON value of [startCallText].
     *
     * Unlike [startCallText], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start_call_text")
    @ExcludeMissing
    fun _startCallText(): JsonField<String> = startCallText

    /**
     * Returns the raw JSON value of [theme].
     *
     * Unlike [theme], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("theme") @ExcludeMissing fun _theme(): JsonField<Theme> = theme

    /**
     * Returns the raw JSON value of [viewHistoryUrl].
     *
     * Unlike [viewHistoryUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("view_history_url")
    @ExcludeMissing
    fun _viewHistoryUrl(): JsonField<String> = viewHistoryUrl

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

        /** Returns a mutable builder for constructing an instance of [WidgetSettings]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WidgetSettings]. */
    class Builder internal constructor() {

        private var agentThinkingText: JsonField<String> = JsonMissing.of()
        private var audioVisualizerConfig: JsonField<AudioVisualizerConfig> = JsonMissing.of()
        private var defaultState: JsonField<DefaultState> = JsonMissing.of()
        private var giveFeedbackUrl: JsonField<String> = JsonMissing.of()
        private var logoIconUrl: JsonField<String> = JsonMissing.of()
        private var position: JsonField<Position> = JsonMissing.of()
        private var reportIssueUrl: JsonField<String> = JsonMissing.of()
        private var speakToInterruptText: JsonField<String> = JsonMissing.of()
        private var startCallText: JsonField<String> = JsonMissing.of()
        private var theme: JsonField<Theme> = JsonMissing.of()
        private var viewHistoryUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(widgetSettings: WidgetSettings) = apply {
            agentThinkingText = widgetSettings.agentThinkingText
            audioVisualizerConfig = widgetSettings.audioVisualizerConfig
            defaultState = widgetSettings.defaultState
            giveFeedbackUrl = widgetSettings.giveFeedbackUrl
            logoIconUrl = widgetSettings.logoIconUrl
            position = widgetSettings.position
            reportIssueUrl = widgetSettings.reportIssueUrl
            speakToInterruptText = widgetSettings.speakToInterruptText
            startCallText = widgetSettings.startCallText
            theme = widgetSettings.theme
            viewHistoryUrl = widgetSettings.viewHistoryUrl
            additionalProperties = widgetSettings.additionalProperties.toMutableMap()
        }

        /** Text displayed while the agent is processing. */
        fun agentThinkingText(agentThinkingText: String) =
            agentThinkingText(JsonField.of(agentThinkingText))

        /**
         * Sets [Builder.agentThinkingText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agentThinkingText] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun agentThinkingText(agentThinkingText: JsonField<String>) = apply {
            this.agentThinkingText = agentThinkingText
        }

        fun audioVisualizerConfig(audioVisualizerConfig: AudioVisualizerConfig) =
            audioVisualizerConfig(JsonField.of(audioVisualizerConfig))

        /**
         * Sets [Builder.audioVisualizerConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.audioVisualizerConfig] with a well-typed
         * [AudioVisualizerConfig] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun audioVisualizerConfig(audioVisualizerConfig: JsonField<AudioVisualizerConfig>) = apply {
            this.audioVisualizerConfig = audioVisualizerConfig
        }

        /** The default state of the widget. */
        fun defaultState(defaultState: DefaultState) = defaultState(JsonField.of(defaultState))

        /**
         * Sets [Builder.defaultState] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultState] with a well-typed [DefaultState] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun defaultState(defaultState: JsonField<DefaultState>) = apply {
            this.defaultState = defaultState
        }

        /** URL for users to give feedback. */
        fun giveFeedbackUrl(giveFeedbackUrl: String?) =
            giveFeedbackUrl(JsonField.ofNullable(giveFeedbackUrl))

        /** Alias for calling [Builder.giveFeedbackUrl] with `giveFeedbackUrl.orElse(null)`. */
        fun giveFeedbackUrl(giveFeedbackUrl: Optional<String>) =
            giveFeedbackUrl(giveFeedbackUrl.getOrNull())

        /**
         * Sets [Builder.giveFeedbackUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.giveFeedbackUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun giveFeedbackUrl(giveFeedbackUrl: JsonField<String>) = apply {
            this.giveFeedbackUrl = giveFeedbackUrl
        }

        /** URL to a custom logo icon for the widget. */
        fun logoIconUrl(logoIconUrl: String?) = logoIconUrl(JsonField.ofNullable(logoIconUrl))

        /** Alias for calling [Builder.logoIconUrl] with `logoIconUrl.orElse(null)`. */
        fun logoIconUrl(logoIconUrl: Optional<String>) = logoIconUrl(logoIconUrl.getOrNull())

        /**
         * Sets [Builder.logoIconUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logoIconUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun logoIconUrl(logoIconUrl: JsonField<String>) = apply { this.logoIconUrl = logoIconUrl }

        /** The positioning style for the widget. */
        fun position(position: Position) = position(JsonField.of(position))

        /**
         * Sets [Builder.position] to an arbitrary JSON value.
         *
         * You should usually call [Builder.position] with a well-typed [Position] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun position(position: JsonField<Position>) = apply { this.position = position }

        /** URL for users to report issues. */
        fun reportIssueUrl(reportIssueUrl: String?) =
            reportIssueUrl(JsonField.ofNullable(reportIssueUrl))

        /** Alias for calling [Builder.reportIssueUrl] with `reportIssueUrl.orElse(null)`. */
        fun reportIssueUrl(reportIssueUrl: Optional<String>) =
            reportIssueUrl(reportIssueUrl.getOrNull())

        /**
         * Sets [Builder.reportIssueUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reportIssueUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun reportIssueUrl(reportIssueUrl: JsonField<String>) = apply {
            this.reportIssueUrl = reportIssueUrl
        }

        /** Text prompting users to speak to interrupt. */
        fun speakToInterruptText(speakToInterruptText: String) =
            speakToInterruptText(JsonField.of(speakToInterruptText))

        /**
         * Sets [Builder.speakToInterruptText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.speakToInterruptText] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun speakToInterruptText(speakToInterruptText: JsonField<String>) = apply {
            this.speakToInterruptText = speakToInterruptText
        }

        /** Custom text displayed on the start call button. */
        fun startCallText(startCallText: String) = startCallText(JsonField.of(startCallText))

        /**
         * Sets [Builder.startCallText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startCallText] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun startCallText(startCallText: JsonField<String>) = apply {
            this.startCallText = startCallText
        }

        /** The visual theme for the widget. */
        fun theme(theme: Theme) = theme(JsonField.of(theme))

        /**
         * Sets [Builder.theme] to an arbitrary JSON value.
         *
         * You should usually call [Builder.theme] with a well-typed [Theme] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun theme(theme: JsonField<Theme>) = apply { this.theme = theme }

        /** URL to view conversation history. */
        fun viewHistoryUrl(viewHistoryUrl: String?) =
            viewHistoryUrl(JsonField.ofNullable(viewHistoryUrl))

        /** Alias for calling [Builder.viewHistoryUrl] with `viewHistoryUrl.orElse(null)`. */
        fun viewHistoryUrl(viewHistoryUrl: Optional<String>) =
            viewHistoryUrl(viewHistoryUrl.getOrNull())

        /**
         * Sets [Builder.viewHistoryUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.viewHistoryUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun viewHistoryUrl(viewHistoryUrl: JsonField<String>) = apply {
            this.viewHistoryUrl = viewHistoryUrl
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
         * Returns an immutable instance of [WidgetSettings].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): WidgetSettings =
            WidgetSettings(
                agentThinkingText,
                audioVisualizerConfig,
                defaultState,
                giveFeedbackUrl,
                logoIconUrl,
                position,
                reportIssueUrl,
                speakToInterruptText,
                startCallText,
                theme,
                viewHistoryUrl,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): WidgetSettings = apply {
        if (validated) {
            return@apply
        }

        agentThinkingText()
        audioVisualizerConfig().ifPresent { it.validate() }
        defaultState().ifPresent { it.validate() }
        giveFeedbackUrl()
        logoIconUrl()
        position().ifPresent { it.validate() }
        reportIssueUrl()
        speakToInterruptText()
        startCallText()
        theme().ifPresent { it.validate() }
        viewHistoryUrl()
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
        (if (agentThinkingText.asKnown().isPresent) 1 else 0) +
            (audioVisualizerConfig.asKnown().getOrNull()?.validity() ?: 0) +
            (defaultState.asKnown().getOrNull()?.validity() ?: 0) +
            (if (giveFeedbackUrl.asKnown().isPresent) 1 else 0) +
            (if (logoIconUrl.asKnown().isPresent) 1 else 0) +
            (position.asKnown().getOrNull()?.validity() ?: 0) +
            (if (reportIssueUrl.asKnown().isPresent) 1 else 0) +
            (if (speakToInterruptText.asKnown().isPresent) 1 else 0) +
            (if (startCallText.asKnown().isPresent) 1 else 0) +
            (theme.asKnown().getOrNull()?.validity() ?: 0) +
            (if (viewHistoryUrl.asKnown().isPresent) 1 else 0)

    /** The default state of the widget. */
    class DefaultState @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val EXPANDED = of("expanded")

            @JvmField val COLLAPSED = of("collapsed")

            @JvmStatic fun of(value: String) = DefaultState(JsonField.of(value))
        }

        /** An enum containing [DefaultState]'s known values. */
        enum class Known {
            EXPANDED,
            COLLAPSED,
        }

        /**
         * An enum containing [DefaultState]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DefaultState] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            EXPANDED,
            COLLAPSED,
            /**
             * An enum member indicating that [DefaultState] was instantiated with an unknown value.
             */
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
                EXPANDED -> Value.EXPANDED
                COLLAPSED -> Value.COLLAPSED
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
                EXPANDED -> Known.EXPANDED
                COLLAPSED -> Known.COLLAPSED
                else -> throw TelnyxInvalidDataException("Unknown DefaultState: $value")
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

        fun validate(): DefaultState = apply {
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

            return other is DefaultState && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The positioning style for the widget. */
    class Position @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val FIXED = of("fixed")

            @JvmField val STATIC = of("static")

            @JvmStatic fun of(value: String) = Position(JsonField.of(value))
        }

        /** An enum containing [Position]'s known values. */
        enum class Known {
            FIXED,
            STATIC,
        }

        /**
         * An enum containing [Position]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Position] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FIXED,
            STATIC,
            /** An enum member indicating that [Position] was instantiated with an unknown value. */
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
                FIXED -> Value.FIXED
                STATIC -> Value.STATIC
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
                FIXED -> Known.FIXED
                STATIC -> Known.STATIC
                else -> throw TelnyxInvalidDataException("Unknown Position: $value")
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

        fun validate(): Position = apply {
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

            return other is Position && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The visual theme for the widget. */
    class Theme @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val LIGHT = of("light")

            @JvmField val DARK = of("dark")

            @JvmStatic fun of(value: String) = Theme(JsonField.of(value))
        }

        /** An enum containing [Theme]'s known values. */
        enum class Known {
            LIGHT,
            DARK,
        }

        /**
         * An enum containing [Theme]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Theme] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            LIGHT,
            DARK,
            /** An enum member indicating that [Theme] was instantiated with an unknown value. */
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
                LIGHT -> Value.LIGHT
                DARK -> Value.DARK
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
                LIGHT -> Known.LIGHT
                DARK -> Known.DARK
                else -> throw TelnyxInvalidDataException("Unknown Theme: $value")
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

        fun validate(): Theme = apply {
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

            return other is Theme && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WidgetSettings &&
            agentThinkingText == other.agentThinkingText &&
            audioVisualizerConfig == other.audioVisualizerConfig &&
            defaultState == other.defaultState &&
            giveFeedbackUrl == other.giveFeedbackUrl &&
            logoIconUrl == other.logoIconUrl &&
            position == other.position &&
            reportIssueUrl == other.reportIssueUrl &&
            speakToInterruptText == other.speakToInterruptText &&
            startCallText == other.startCallText &&
            theme == other.theme &&
            viewHistoryUrl == other.viewHistoryUrl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            agentThinkingText,
            audioVisualizerConfig,
            defaultState,
            giveFeedbackUrl,
            logoIconUrl,
            position,
            reportIssueUrl,
            speakToInterruptText,
            startCallText,
            theme,
            viewHistoryUrl,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WidgetSettings{agentThinkingText=$agentThinkingText, audioVisualizerConfig=$audioVisualizerConfig, defaultState=$defaultState, giveFeedbackUrl=$giveFeedbackUrl, logoIconUrl=$logoIconUrl, position=$position, reportIssueUrl=$reportIssueUrl, speakToInterruptText=$speakToInterruptText, startCallText=$startCallText, theme=$theme, viewHistoryUrl=$viewHistoryUrl, additionalProperties=$additionalProperties}"
}
