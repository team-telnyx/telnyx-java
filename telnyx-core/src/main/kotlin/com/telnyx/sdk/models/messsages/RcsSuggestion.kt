// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messsages

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class RcsSuggestion
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val action: JsonField<Action>,
    private val reply: JsonField<Reply>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("action") @ExcludeMissing action: JsonField<Action> = JsonMissing.of(),
        @JsonProperty("reply") @ExcludeMissing reply: JsonField<Reply> = JsonMissing.of(),
    ) : this(action, reply, mutableMapOf())

    /**
     * When tapped, initiates the corresponding native action on the device.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun action(): Optional<Action> = action.getOptional("action")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reply(): Optional<Reply> = reply.getOptional("reply")

    /**
     * Returns the raw JSON value of [action].
     *
     * Unlike [action], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("action") @ExcludeMissing fun _action(): JsonField<Action> = action

    /**
     * Returns the raw JSON value of [reply].
     *
     * Unlike [reply], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reply") @ExcludeMissing fun _reply(): JsonField<Reply> = reply

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

        /** Returns a mutable builder for constructing an instance of [RcsSuggestion]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RcsSuggestion]. */
    class Builder internal constructor() {

        private var action: JsonField<Action> = JsonMissing.of()
        private var reply: JsonField<Reply> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(rcsSuggestion: RcsSuggestion) = apply {
            action = rcsSuggestion.action
            reply = rcsSuggestion.reply
            additionalProperties = rcsSuggestion.additionalProperties.toMutableMap()
        }

        /** When tapped, initiates the corresponding native action on the device. */
        fun action(action: Action) = action(JsonField.of(action))

        /**
         * Sets [Builder.action] to an arbitrary JSON value.
         *
         * You should usually call [Builder.action] with a well-typed [Action] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun action(action: JsonField<Action>) = apply { this.action = action }

        fun reply(reply: Reply) = reply(JsonField.of(reply))

        /**
         * Sets [Builder.reply] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reply] with a well-typed [Reply] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun reply(reply: JsonField<Reply>) = apply { this.reply = reply }

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
         * Returns an immutable instance of [RcsSuggestion].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RcsSuggestion =
            RcsSuggestion(action, reply, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): RcsSuggestion = apply {
        if (validated) {
            return@apply
        }

        action().ifPresent { it.validate() }
        reply().ifPresent { it.validate() }
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
        (action.asKnown().getOrNull()?.validity() ?: 0) +
            (reply.asKnown().getOrNull()?.validity() ?: 0)

    /** When tapped, initiates the corresponding native action on the device. */
    class Action
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val createCalendarEventAction: JsonField<CreateCalendarEventAction>,
        private val dialAction: JsonField<DialAction>,
        private val fallbackUrl: JsonField<String>,
        private val openUrlAction: JsonField<OpenUrlAction>,
        private val postbackData: JsonField<String>,
        private val shareLocationAction: JsonField<ShareLocationAction>,
        private val text: JsonField<String>,
        private val viewLocationAction: JsonField<ViewLocationAction>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("create_calendar_event_action")
            @ExcludeMissing
            createCalendarEventAction: JsonField<CreateCalendarEventAction> = JsonMissing.of(),
            @JsonProperty("dial_action")
            @ExcludeMissing
            dialAction: JsonField<DialAction> = JsonMissing.of(),
            @JsonProperty("fallback_url")
            @ExcludeMissing
            fallbackUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("open_url_action")
            @ExcludeMissing
            openUrlAction: JsonField<OpenUrlAction> = JsonMissing.of(),
            @JsonProperty("postback_data")
            @ExcludeMissing
            postbackData: JsonField<String> = JsonMissing.of(),
            @JsonProperty("share_location_action")
            @ExcludeMissing
            shareLocationAction: JsonField<ShareLocationAction> = JsonMissing.of(),
            @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
            @JsonProperty("view_location_action")
            @ExcludeMissing
            viewLocationAction: JsonField<ViewLocationAction> = JsonMissing.of(),
        ) : this(
            createCalendarEventAction,
            dialAction,
            fallbackUrl,
            openUrlAction,
            postbackData,
            shareLocationAction,
            text,
            viewLocationAction,
            mutableMapOf(),
        )

        /**
         * Opens the user's default calendar app and starts the new calendar event flow with the
         * agent-specified event data pre-filled.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createCalendarEventAction(): Optional<CreateCalendarEventAction> =
            createCalendarEventAction.getOptional("create_calendar_event_action")

        /**
         * Opens the user's default dialer app with the agent-specified phone number filled in.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dialAction(): Optional<DialAction> = dialAction.getOptional("dial_action")

        /**
         * Fallback URL to use if a client doesn't support a suggested action. Fallback URLs open in
         * new browser windows. Maximum 2048 characters.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun fallbackUrl(): Optional<String> = fallbackUrl.getOptional("fallback_url")

        /**
         * Opens the user's default web browser app to the specified URL.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun openUrlAction(): Optional<OpenUrlAction> = openUrlAction.getOptional("open_url_action")

        /**
         * Payload (base64 encoded) that will be sent to the agent in the user event that results
         * when the user taps the suggested action. Maximum 2048 characters.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun postbackData(): Optional<String> = postbackData.getOptional("postback_data")

        /**
         * Opens the RCS app's location chooser so the user can pick a location to send back to the
         * agent.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun shareLocationAction(): Optional<ShareLocationAction> =
            shareLocationAction.getOptional("share_location_action")

        /**
         * Text that is shown in the suggested action. Maximum 25 characters.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun text(): Optional<String> = text.getOptional("text")

        /**
         * Opens the user's default map app and selects the agent-specified location.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun viewLocationAction(): Optional<ViewLocationAction> =
            viewLocationAction.getOptional("view_location_action")

        /**
         * Returns the raw JSON value of [createCalendarEventAction].
         *
         * Unlike [createCalendarEventAction], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("create_calendar_event_action")
        @ExcludeMissing
        fun _createCalendarEventAction(): JsonField<CreateCalendarEventAction> =
            createCalendarEventAction

        /**
         * Returns the raw JSON value of [dialAction].
         *
         * Unlike [dialAction], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dial_action")
        @ExcludeMissing
        fun _dialAction(): JsonField<DialAction> = dialAction

        /**
         * Returns the raw JSON value of [fallbackUrl].
         *
         * Unlike [fallbackUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fallback_url")
        @ExcludeMissing
        fun _fallbackUrl(): JsonField<String> = fallbackUrl

        /**
         * Returns the raw JSON value of [openUrlAction].
         *
         * Unlike [openUrlAction], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("open_url_action")
        @ExcludeMissing
        fun _openUrlAction(): JsonField<OpenUrlAction> = openUrlAction

        /**
         * Returns the raw JSON value of [postbackData].
         *
         * Unlike [postbackData], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("postback_data")
        @ExcludeMissing
        fun _postbackData(): JsonField<String> = postbackData

        /**
         * Returns the raw JSON value of [shareLocationAction].
         *
         * Unlike [shareLocationAction], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("share_location_action")
        @ExcludeMissing
        fun _shareLocationAction(): JsonField<ShareLocationAction> = shareLocationAction

        /**
         * Returns the raw JSON value of [text].
         *
         * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

        /**
         * Returns the raw JSON value of [viewLocationAction].
         *
         * Unlike [viewLocationAction], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("view_location_action")
        @ExcludeMissing
        fun _viewLocationAction(): JsonField<ViewLocationAction> = viewLocationAction

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

            /** Returns a mutable builder for constructing an instance of [Action]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Action]. */
        class Builder internal constructor() {

            private var createCalendarEventAction: JsonField<CreateCalendarEventAction> =
                JsonMissing.of()
            private var dialAction: JsonField<DialAction> = JsonMissing.of()
            private var fallbackUrl: JsonField<String> = JsonMissing.of()
            private var openUrlAction: JsonField<OpenUrlAction> = JsonMissing.of()
            private var postbackData: JsonField<String> = JsonMissing.of()
            private var shareLocationAction: JsonField<ShareLocationAction> = JsonMissing.of()
            private var text: JsonField<String> = JsonMissing.of()
            private var viewLocationAction: JsonField<ViewLocationAction> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(action: Action) = apply {
                createCalendarEventAction = action.createCalendarEventAction
                dialAction = action.dialAction
                fallbackUrl = action.fallbackUrl
                openUrlAction = action.openUrlAction
                postbackData = action.postbackData
                shareLocationAction = action.shareLocationAction
                text = action.text
                viewLocationAction = action.viewLocationAction
                additionalProperties = action.additionalProperties.toMutableMap()
            }

            /**
             * Opens the user's default calendar app and starts the new calendar event flow with the
             * agent-specified event data pre-filled.
             */
            fun createCalendarEventAction(createCalendarEventAction: CreateCalendarEventAction) =
                createCalendarEventAction(JsonField.of(createCalendarEventAction))

            /**
             * Sets [Builder.createCalendarEventAction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createCalendarEventAction] with a well-typed
             * [CreateCalendarEventAction] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun createCalendarEventAction(
                createCalendarEventAction: JsonField<CreateCalendarEventAction>
            ) = apply { this.createCalendarEventAction = createCalendarEventAction }

            /**
             * Opens the user's default dialer app with the agent-specified phone number filled in.
             */
            fun dialAction(dialAction: DialAction) = dialAction(JsonField.of(dialAction))

            /**
             * Sets [Builder.dialAction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dialAction] with a well-typed [DialAction] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dialAction(dialAction: JsonField<DialAction>) = apply {
                this.dialAction = dialAction
            }

            /**
             * Fallback URL to use if a client doesn't support a suggested action. Fallback URLs
             * open in new browser windows. Maximum 2048 characters.
             */
            fun fallbackUrl(fallbackUrl: String) = fallbackUrl(JsonField.of(fallbackUrl))

            /**
             * Sets [Builder.fallbackUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fallbackUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fallbackUrl(fallbackUrl: JsonField<String>) = apply {
                this.fallbackUrl = fallbackUrl
            }

            /** Opens the user's default web browser app to the specified URL. */
            fun openUrlAction(openUrlAction: OpenUrlAction) =
                openUrlAction(JsonField.of(openUrlAction))

            /**
             * Sets [Builder.openUrlAction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.openUrlAction] with a well-typed [OpenUrlAction]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun openUrlAction(openUrlAction: JsonField<OpenUrlAction>) = apply {
                this.openUrlAction = openUrlAction
            }

            /**
             * Payload (base64 encoded) that will be sent to the agent in the user event that
             * results when the user taps the suggested action. Maximum 2048 characters.
             */
            fun postbackData(postbackData: String) = postbackData(JsonField.of(postbackData))

            /**
             * Sets [Builder.postbackData] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postbackData] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postbackData(postbackData: JsonField<String>) = apply {
                this.postbackData = postbackData
            }

            /**
             * Opens the RCS app's location chooser so the user can pick a location to send back to
             * the agent.
             */
            fun shareLocationAction(shareLocationAction: ShareLocationAction) =
                shareLocationAction(JsonField.of(shareLocationAction))

            /**
             * Sets [Builder.shareLocationAction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.shareLocationAction] with a well-typed
             * [ShareLocationAction] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun shareLocationAction(shareLocationAction: JsonField<ShareLocationAction>) = apply {
                this.shareLocationAction = shareLocationAction
            }

            /** Text that is shown in the suggested action. Maximum 25 characters. */
            fun text(text: String) = text(JsonField.of(text))

            /**
             * Sets [Builder.text] to an arbitrary JSON value.
             *
             * You should usually call [Builder.text] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun text(text: JsonField<String>) = apply { this.text = text }

            /** Opens the user's default map app and selects the agent-specified location. */
            fun viewLocationAction(viewLocationAction: ViewLocationAction) =
                viewLocationAction(JsonField.of(viewLocationAction))

            /**
             * Sets [Builder.viewLocationAction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.viewLocationAction] with a well-typed
             * [ViewLocationAction] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun viewLocationAction(viewLocationAction: JsonField<ViewLocationAction>) = apply {
                this.viewLocationAction = viewLocationAction
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
             * Returns an immutable instance of [Action].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Action =
                Action(
                    createCalendarEventAction,
                    dialAction,
                    fallbackUrl,
                    openUrlAction,
                    postbackData,
                    shareLocationAction,
                    text,
                    viewLocationAction,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Action = apply {
            if (validated) {
                return@apply
            }

            createCalendarEventAction().ifPresent { it.validate() }
            dialAction().ifPresent { it.validate() }
            fallbackUrl()
            openUrlAction().ifPresent { it.validate() }
            postbackData()
            shareLocationAction().ifPresent { it.validate() }
            text()
            viewLocationAction().ifPresent { it.validate() }
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
            (createCalendarEventAction.asKnown().getOrNull()?.validity() ?: 0) +
                (dialAction.asKnown().getOrNull()?.validity() ?: 0) +
                (if (fallbackUrl.asKnown().isPresent) 1 else 0) +
                (openUrlAction.asKnown().getOrNull()?.validity() ?: 0) +
                (if (postbackData.asKnown().isPresent) 1 else 0) +
                (shareLocationAction.asKnown().getOrNull()?.validity() ?: 0) +
                (if (text.asKnown().isPresent) 1 else 0) +
                (viewLocationAction.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * Opens the user's default calendar app and starts the new calendar event flow with the
         * agent-specified event data pre-filled.
         */
        class CreateCalendarEventAction
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val description: JsonField<String>,
            private val endTime: JsonField<OffsetDateTime>,
            private val startTime: JsonField<OffsetDateTime>,
            private val title: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("end_time")
                @ExcludeMissing
                endTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("start_time")
                @ExcludeMissing
                startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
            ) : this(description, endTime, startTime, title, mutableMapOf())

            /**
             * Event description. Maximum 500 characters.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun description(): Optional<String> = description.getOptional("description")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun endTime(): Optional<OffsetDateTime> = endTime.getOptional("end_time")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun startTime(): Optional<OffsetDateTime> = startTime.getOptional("start_time")

            /**
             * Event title. Maximum 100 characters.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun title(): Optional<String> = title.getOptional("title")

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /**
             * Returns the raw JSON value of [endTime].
             *
             * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("end_time")
            @ExcludeMissing
            fun _endTime(): JsonField<OffsetDateTime> = endTime

            /**
             * Returns the raw JSON value of [startTime].
             *
             * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("start_time")
            @ExcludeMissing
            fun _startTime(): JsonField<OffsetDateTime> = startTime

            /**
             * Returns the raw JSON value of [title].
             *
             * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

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
                 * Returns a mutable builder for constructing an instance of
                 * [CreateCalendarEventAction].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CreateCalendarEventAction]. */
            class Builder internal constructor() {

                private var description: JsonField<String> = JsonMissing.of()
                private var endTime: JsonField<OffsetDateTime> = JsonMissing.of()
                private var startTime: JsonField<OffsetDateTime> = JsonMissing.of()
                private var title: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(createCalendarEventAction: CreateCalendarEventAction) = apply {
                    description = createCalendarEventAction.description
                    endTime = createCalendarEventAction.endTime
                    startTime = createCalendarEventAction.startTime
                    title = createCalendarEventAction.title
                    additionalProperties =
                        createCalendarEventAction.additionalProperties.toMutableMap()
                }

                /** Event description. Maximum 500 characters. */
                fun description(description: String) = description(JsonField.of(description))

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                fun endTime(endTime: OffsetDateTime) = endTime(JsonField.of(endTime))

                /**
                 * Sets [Builder.endTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.endTime] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun endTime(endTime: JsonField<OffsetDateTime>) = apply { this.endTime = endTime }

                fun startTime(startTime: OffsetDateTime) = startTime(JsonField.of(startTime))

                /**
                 * Sets [Builder.startTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.startTime] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun startTime(startTime: JsonField<OffsetDateTime>) = apply {
                    this.startTime = startTime
                }

                /** Event title. Maximum 100 characters. */
                fun title(title: String) = title(JsonField.of(title))

                /**
                 * Sets [Builder.title] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.title] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun title(title: JsonField<String>) = apply { this.title = title }

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
                 * Returns an immutable instance of [CreateCalendarEventAction].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): CreateCalendarEventAction =
                    CreateCalendarEventAction(
                        description,
                        endTime,
                        startTime,
                        title,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): CreateCalendarEventAction = apply {
                if (validated) {
                    return@apply
                }

                description()
                endTime()
                startTime()
                title()
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
                (if (description.asKnown().isPresent) 1 else 0) +
                    (if (endTime.asKnown().isPresent) 1 else 0) +
                    (if (startTime.asKnown().isPresent) 1 else 0) +
                    (if (title.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CreateCalendarEventAction &&
                    description == other.description &&
                    endTime == other.endTime &&
                    startTime == other.startTime &&
                    title == other.title &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(description, endTime, startTime, title, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CreateCalendarEventAction{description=$description, endTime=$endTime, startTime=$startTime, title=$title, additionalProperties=$additionalProperties}"
        }

        /** Opens the user's default dialer app with the agent-specified phone number filled in. */
        class DialAction
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val phoneNumber: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("phone_number")
                @ExcludeMissing
                phoneNumber: JsonField<String> = JsonMissing.of()
            ) : this(phoneNumber, mutableMapOf())

            /**
             * Phone number in +E.164 format
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun phoneNumber(): String = phoneNumber.getRequired("phone_number")

            /**
             * Returns the raw JSON value of [phoneNumber].
             *
             * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("phone_number")
            @ExcludeMissing
            fun _phoneNumber(): JsonField<String> = phoneNumber

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
                 * Returns a mutable builder for constructing an instance of [DialAction].
                 *
                 * The following fields are required:
                 * ```java
                 * .phoneNumber()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [DialAction]. */
            class Builder internal constructor() {

                private var phoneNumber: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(dialAction: DialAction) = apply {
                    phoneNumber = dialAction.phoneNumber
                    additionalProperties = dialAction.additionalProperties.toMutableMap()
                }

                /** Phone number in +E.164 format */
                fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

                /**
                 * Sets [Builder.phoneNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.phoneNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                    this.phoneNumber = phoneNumber
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
                 * Returns an immutable instance of [DialAction].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .phoneNumber()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): DialAction =
                    DialAction(
                        checkRequired("phoneNumber", phoneNumber),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): DialAction = apply {
                if (validated) {
                    return@apply
                }

                phoneNumber()
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
            internal fun validity(): Int = (if (phoneNumber.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is DialAction &&
                    phoneNumber == other.phoneNumber &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(phoneNumber, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DialAction{phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
        }

        /** Opens the user's default web browser app to the specified URL. */
        class OpenUrlAction
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val application: JsonField<Application>,
            private val url: JsonField<String>,
            private val webviewViewMode: JsonField<WebviewViewMode>,
            private val description: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("application")
                @ExcludeMissing
                application: JsonField<Application> = JsonMissing.of(),
                @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
                @JsonProperty("webview_view_mode")
                @ExcludeMissing
                webviewViewMode: JsonField<WebviewViewMode> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
            ) : this(application, url, webviewViewMode, description, mutableMapOf())

            /**
             * URL open application, browser or webview.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun application(): Application = application.getRequired("application")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun url(): String = url.getRequired("url")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun webviewViewMode(): WebviewViewMode =
                webviewViewMode.getRequired("webview_view_mode")

            /**
             * Accessbility description for webview.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun description(): Optional<String> = description.getOptional("description")

            /**
             * Returns the raw JSON value of [application].
             *
             * Unlike [application], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("application")
            @ExcludeMissing
            fun _application(): JsonField<Application> = application

            /**
             * Returns the raw JSON value of [url].
             *
             * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

            /**
             * Returns the raw JSON value of [webviewViewMode].
             *
             * Unlike [webviewViewMode], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("webview_view_mode")
            @ExcludeMissing
            fun _webviewViewMode(): JsonField<WebviewViewMode> = webviewViewMode

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

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
                 * Returns a mutable builder for constructing an instance of [OpenUrlAction].
                 *
                 * The following fields are required:
                 * ```java
                 * .application()
                 * .url()
                 * .webviewViewMode()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [OpenUrlAction]. */
            class Builder internal constructor() {

                private var application: JsonField<Application>? = null
                private var url: JsonField<String>? = null
                private var webviewViewMode: JsonField<WebviewViewMode>? = null
                private var description: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(openUrlAction: OpenUrlAction) = apply {
                    application = openUrlAction.application
                    url = openUrlAction.url
                    webviewViewMode = openUrlAction.webviewViewMode
                    description = openUrlAction.description
                    additionalProperties = openUrlAction.additionalProperties.toMutableMap()
                }

                /** URL open application, browser or webview. */
                fun application(application: Application) = application(JsonField.of(application))

                /**
                 * Sets [Builder.application] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.application] with a well-typed [Application]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun application(application: JsonField<Application>) = apply {
                    this.application = application
                }

                fun url(url: String) = url(JsonField.of(url))

                /**
                 * Sets [Builder.url] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.url] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun url(url: JsonField<String>) = apply { this.url = url }

                fun webviewViewMode(webviewViewMode: WebviewViewMode) =
                    webviewViewMode(JsonField.of(webviewViewMode))

                /**
                 * Sets [Builder.webviewViewMode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.webviewViewMode] with a well-typed
                 * [WebviewViewMode] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun webviewViewMode(webviewViewMode: JsonField<WebviewViewMode>) = apply {
                    this.webviewViewMode = webviewViewMode
                }

                /** Accessbility description for webview. */
                fun description(description: String) = description(JsonField.of(description))

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
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
                 * Returns an immutable instance of [OpenUrlAction].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .application()
                 * .url()
                 * .webviewViewMode()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): OpenUrlAction =
                    OpenUrlAction(
                        checkRequired("application", application),
                        checkRequired("url", url),
                        checkRequired("webviewViewMode", webviewViewMode),
                        description,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): OpenUrlAction = apply {
                if (validated) {
                    return@apply
                }

                application().validate()
                url()
                webviewViewMode().validate()
                description()
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
                (application.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (url.asKnown().isPresent) 1 else 0) +
                    (webviewViewMode.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (description.asKnown().isPresent) 1 else 0)

            /** URL open application, browser or webview. */
            class Application
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField
                    val OPEN_URL_APPLICATION_UNSPECIFIED = of("OPEN_URL_APPLICATION_UNSPECIFIED")

                    @JvmField val BROWSER = of("BROWSER")

                    @JvmField val WEBVIEW = of("WEBVIEW")

                    @JvmStatic fun of(value: String) = Application(JsonField.of(value))
                }

                /** An enum containing [Application]'s known values. */
                enum class Known {
                    OPEN_URL_APPLICATION_UNSPECIFIED,
                    BROWSER,
                    WEBVIEW,
                }

                /**
                 * An enum containing [Application]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Application] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    OPEN_URL_APPLICATION_UNSPECIFIED,
                    BROWSER,
                    WEBVIEW,
                    /**
                     * An enum member indicating that [Application] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        OPEN_URL_APPLICATION_UNSPECIFIED -> Value.OPEN_URL_APPLICATION_UNSPECIFIED
                        BROWSER -> Value.BROWSER
                        WEBVIEW -> Value.WEBVIEW
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        OPEN_URL_APPLICATION_UNSPECIFIED -> Known.OPEN_URL_APPLICATION_UNSPECIFIED
                        BROWSER -> Known.BROWSER
                        WEBVIEW -> Known.WEBVIEW
                        else -> throw TelnyxInvalidDataException("Unknown Application: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Application = apply {
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

                    return other is Application && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class WebviewViewMode
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField
                    val WEBVIEW_VIEW_MODE_UNSPECIFIED = of("WEBVIEW_VIEW_MODE_UNSPECIFIED")

                    @JvmField val FULL = of("FULL")

                    @JvmField val HALF = of("HALF")

                    @JvmField val TALL = of("TALL")

                    @JvmStatic fun of(value: String) = WebviewViewMode(JsonField.of(value))
                }

                /** An enum containing [WebviewViewMode]'s known values. */
                enum class Known {
                    WEBVIEW_VIEW_MODE_UNSPECIFIED,
                    FULL,
                    HALF,
                    TALL,
                }

                /**
                 * An enum containing [WebviewViewMode]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [WebviewViewMode] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    WEBVIEW_VIEW_MODE_UNSPECIFIED,
                    FULL,
                    HALF,
                    TALL,
                    /**
                     * An enum member indicating that [WebviewViewMode] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        WEBVIEW_VIEW_MODE_UNSPECIFIED -> Value.WEBVIEW_VIEW_MODE_UNSPECIFIED
                        FULL -> Value.FULL
                        HALF -> Value.HALF
                        TALL -> Value.TALL
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        WEBVIEW_VIEW_MODE_UNSPECIFIED -> Known.WEBVIEW_VIEW_MODE_UNSPECIFIED
                        FULL -> Known.FULL
                        HALF -> Known.HALF
                        TALL -> Known.TALL
                        else -> throw TelnyxInvalidDataException("Unknown WebviewViewMode: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): WebviewViewMode = apply {
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

                    return other is WebviewViewMode && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is OpenUrlAction &&
                    application == other.application &&
                    url == other.url &&
                    webviewViewMode == other.webviewViewMode &&
                    description == other.description &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(application, url, webviewViewMode, description, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "OpenUrlAction{application=$application, url=$url, webviewViewMode=$webviewViewMode, description=$description, additionalProperties=$additionalProperties}"
        }

        /**
         * Opens the RCS app's location chooser so the user can pick a location to send back to the
         * agent.
         */
        class ShareLocationAction
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

                /**
                 * Returns a mutable builder for constructing an instance of [ShareLocationAction].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ShareLocationAction]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(shareLocationAction: ShareLocationAction) = apply {
                    additionalProperties = shareLocationAction.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [ShareLocationAction].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ShareLocationAction =
                    ShareLocationAction(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): ShareLocationAction = apply {
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

                return other is ShareLocationAction &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ShareLocationAction{additionalProperties=$additionalProperties}"
        }

        /** Opens the user's default map app and selects the agent-specified location. */
        class ViewLocationAction
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val label: JsonField<String>,
            private val latLong: JsonField<LatLong>,
            private val query: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
                @JsonProperty("lat_long")
                @ExcludeMissing
                latLong: JsonField<LatLong> = JsonMissing.of(),
                @JsonProperty("query") @ExcludeMissing query: JsonField<String> = JsonMissing.of(),
            ) : this(label, latLong, query, mutableMapOf())

            /**
             * The label of the pin dropped
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun label(): Optional<String> = label.getOptional("label")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun latLong(): Optional<LatLong> = latLong.getOptional("lat_long")

            /**
             * query string (Android only)
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun query(): Optional<String> = query.getOptional("query")

            /**
             * Returns the raw JSON value of [label].
             *
             * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<String> = label

            /**
             * Returns the raw JSON value of [latLong].
             *
             * Unlike [latLong], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("lat_long") @ExcludeMissing fun _latLong(): JsonField<LatLong> = latLong

            /**
             * Returns the raw JSON value of [query].
             *
             * Unlike [query], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("query") @ExcludeMissing fun _query(): JsonField<String> = query

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
                 * Returns a mutable builder for constructing an instance of [ViewLocationAction].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ViewLocationAction]. */
            class Builder internal constructor() {

                private var label: JsonField<String> = JsonMissing.of()
                private var latLong: JsonField<LatLong> = JsonMissing.of()
                private var query: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(viewLocationAction: ViewLocationAction) = apply {
                    label = viewLocationAction.label
                    latLong = viewLocationAction.latLong
                    query = viewLocationAction.query
                    additionalProperties = viewLocationAction.additionalProperties.toMutableMap()
                }

                /** The label of the pin dropped */
                fun label(label: String) = label(JsonField.of(label))

                /**
                 * Sets [Builder.label] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.label] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun label(label: JsonField<String>) = apply { this.label = label }

                fun latLong(latLong: LatLong) = latLong(JsonField.of(latLong))

                /**
                 * Sets [Builder.latLong] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.latLong] with a well-typed [LatLong] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun latLong(latLong: JsonField<LatLong>) = apply { this.latLong = latLong }

                /** query string (Android only) */
                fun query(query: String) = query(JsonField.of(query))

                /**
                 * Sets [Builder.query] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.query] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun query(query: JsonField<String>) = apply { this.query = query }

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
                 * Returns an immutable instance of [ViewLocationAction].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ViewLocationAction =
                    ViewLocationAction(label, latLong, query, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): ViewLocationAction = apply {
                if (validated) {
                    return@apply
                }

                label()
                latLong().ifPresent { it.validate() }
                query()
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
                (if (label.asKnown().isPresent) 1 else 0) +
                    (latLong.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (query.asKnown().isPresent) 1 else 0)

            class LatLong
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val latitude: JsonField<Double>,
                private val longitude: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("latitude")
                    @ExcludeMissing
                    latitude: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("longitude")
                    @ExcludeMissing
                    longitude: JsonField<Double> = JsonMissing.of(),
                ) : this(latitude, longitude, mutableMapOf())

                /**
                 * The latitude in degrees. It must be in the range [-90.0, +90.0].
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun latitude(): Double = latitude.getRequired("latitude")

                /**
                 * The longitude in degrees. It must be in the range [-180.0, +180.0].
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun longitude(): Double = longitude.getRequired("longitude")

                /**
                 * Returns the raw JSON value of [latitude].
                 *
                 * Unlike [latitude], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("latitude")
                @ExcludeMissing
                fun _latitude(): JsonField<Double> = latitude

                /**
                 * Returns the raw JSON value of [longitude].
                 *
                 * Unlike [longitude], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("longitude")
                @ExcludeMissing
                fun _longitude(): JsonField<Double> = longitude

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
                     * Returns a mutable builder for constructing an instance of [LatLong].
                     *
                     * The following fields are required:
                     * ```java
                     * .latitude()
                     * .longitude()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [LatLong]. */
                class Builder internal constructor() {

                    private var latitude: JsonField<Double>? = null
                    private var longitude: JsonField<Double>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(latLong: LatLong) = apply {
                        latitude = latLong.latitude
                        longitude = latLong.longitude
                        additionalProperties = latLong.additionalProperties.toMutableMap()
                    }

                    /** The latitude in degrees. It must be in the range [-90.0, +90.0]. */
                    fun latitude(latitude: Double) = latitude(JsonField.of(latitude))

                    /**
                     * Sets [Builder.latitude] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.latitude] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun latitude(latitude: JsonField<Double>) = apply { this.latitude = latitude }

                    /** The longitude in degrees. It must be in the range [-180.0, +180.0]. */
                    fun longitude(longitude: Double) = longitude(JsonField.of(longitude))

                    /**
                     * Sets [Builder.longitude] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.longitude] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun longitude(longitude: JsonField<Double>) = apply {
                        this.longitude = longitude
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
                     * Returns an immutable instance of [LatLong].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .latitude()
                     * .longitude()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): LatLong =
                        LatLong(
                            checkRequired("latitude", latitude),
                            checkRequired("longitude", longitude),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): LatLong = apply {
                    if (validated) {
                        return@apply
                    }

                    latitude()
                    longitude()
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
                    (if (latitude.asKnown().isPresent) 1 else 0) +
                        (if (longitude.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is LatLong &&
                        latitude == other.latitude &&
                        longitude == other.longitude &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(latitude, longitude, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "LatLong{latitude=$latitude, longitude=$longitude, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ViewLocationAction &&
                    label == other.label &&
                    latLong == other.latLong &&
                    query == other.query &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(label, latLong, query, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ViewLocationAction{label=$label, latLong=$latLong, query=$query, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Action &&
                createCalendarEventAction == other.createCalendarEventAction &&
                dialAction == other.dialAction &&
                fallbackUrl == other.fallbackUrl &&
                openUrlAction == other.openUrlAction &&
                postbackData == other.postbackData &&
                shareLocationAction == other.shareLocationAction &&
                text == other.text &&
                viewLocationAction == other.viewLocationAction &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                createCalendarEventAction,
                dialAction,
                fallbackUrl,
                openUrlAction,
                postbackData,
                shareLocationAction,
                text,
                viewLocationAction,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Action{createCalendarEventAction=$createCalendarEventAction, dialAction=$dialAction, fallbackUrl=$fallbackUrl, openUrlAction=$openUrlAction, postbackData=$postbackData, shareLocationAction=$shareLocationAction, text=$text, viewLocationAction=$viewLocationAction, additionalProperties=$additionalProperties}"
    }

    class Reply
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val postbackData: JsonField<String>,
        private val text: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("postback_data")
            @ExcludeMissing
            postbackData: JsonField<String> = JsonMissing.of(),
            @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
        ) : this(postbackData, text, mutableMapOf())

        /**
         * Payload (base64 encoded) that will be sent to the agent in the user event that results
         * when the user taps the suggested action. Maximum 2048 characters.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun postbackData(): Optional<String> = postbackData.getOptional("postback_data")

        /**
         * Text that is shown in the suggested reply (maximum 25 characters)
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun text(): Optional<String> = text.getOptional("text")

        /**
         * Returns the raw JSON value of [postbackData].
         *
         * Unlike [postbackData], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("postback_data")
        @ExcludeMissing
        fun _postbackData(): JsonField<String> = postbackData

        /**
         * Returns the raw JSON value of [text].
         *
         * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

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

            /** Returns a mutable builder for constructing an instance of [Reply]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Reply]. */
        class Builder internal constructor() {

            private var postbackData: JsonField<String> = JsonMissing.of()
            private var text: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(reply: Reply) = apply {
                postbackData = reply.postbackData
                text = reply.text
                additionalProperties = reply.additionalProperties.toMutableMap()
            }

            /**
             * Payload (base64 encoded) that will be sent to the agent in the user event that
             * results when the user taps the suggested action. Maximum 2048 characters.
             */
            fun postbackData(postbackData: String) = postbackData(JsonField.of(postbackData))

            /**
             * Sets [Builder.postbackData] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postbackData] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postbackData(postbackData: JsonField<String>) = apply {
                this.postbackData = postbackData
            }

            /** Text that is shown in the suggested reply (maximum 25 characters) */
            fun text(text: String) = text(JsonField.of(text))

            /**
             * Sets [Builder.text] to an arbitrary JSON value.
             *
             * You should usually call [Builder.text] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun text(text: JsonField<String>) = apply { this.text = text }

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
             * Returns an immutable instance of [Reply].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Reply = Reply(postbackData, text, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Reply = apply {
            if (validated) {
                return@apply
            }

            postbackData()
            text()
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
            (if (postbackData.asKnown().isPresent) 1 else 0) +
                (if (text.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Reply &&
                postbackData == other.postbackData &&
                text == other.text &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(postbackData, text, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Reply{postbackData=$postbackData, text=$text, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RcsSuggestion &&
            action == other.action &&
            reply == other.reply &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(action, reply, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RcsSuggestion{action=$action, reply=$reply, additionalProperties=$additionalProperties}"
}
