// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calendarconnections

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
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import com.telnyx.sdk.models.meetingsessions.MeetingSessionRecordingDestination
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Update policy or defaults for future sessions. Supply at least one field. Existing sessions
 * retain their configuration. Null clears nullable overrides. Assistant, recording, and webhook
 * defaults apply to Google Meet and Teams. Assistant defaults require default_barge_in to be false
 * or null and default_voice to be null. Recording=true requires a destination; false rejects one. A
 * non-null default_webhook_url update returns webhook_secret once; save it to verify future session
 * deliveries.
 */
class CalendarConnectionUpdateParams
private constructor(
    private val id: String?,
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /**
     * all_meetings joins eligible events; external_organizer_excluded requires the connected user
     * to be the organizer; per_meeting requires an explicit opt-in.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun autoJoinPolicy(): Optional<AutoJoinPolicy> = body.autoJoinPolicy()

    /**
     * Bot display name; null clears the override.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun botName(): Optional<String> = body.botName()

    /**
     * Default assistant for future calendar-scheduled Google Meet and Teams sessions. The saved
     * configuration must fit within 8 KiB. Use id, audio_gate, dynamic_variables, and leave_on_end;
     * avatar is not accepted. audio_gate defaults to full_duplex.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun defaultAssistant(): Optional<DefaultAssistant> = body.defaultAssistant()

    /**
     * Default manual speech interruption. Cannot be true with default_assistant.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun defaultBargeIn(): Optional<Boolean> = body.defaultBargeIn()

    /**
     * Google Meet and Teams recording intent. When null, recording is enabled only if a destination
     * is set. True requires default_recording_export; false cannot be combined with a destination.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun defaultRecording(): Optional<Boolean> = body.defaultRecording()

    /**
     * Customer-owned Telnyx Storage destination for recording exports. Uses the authenticated
     * organization and user; do not supply credentials, region, organization ID or object key.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun defaultRecordingExport(): Optional<MeetingSessionRecordingDestination> =
        body.defaultRecordingExport()

    /**
     * Generate a summary when each future session transcript finalizes.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun defaultSummarizeOnEnd(): Optional<Boolean> = body.defaultSummarizeOnEnd()

    /**
     * Manual-speech voice; must be null when default_assistant is set.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun defaultVoice(): Optional<String> = body.defaultVoice()

    /**
     * HTTPS destination for future session webhooks. Null clears the default. A non-null update
     * returns webhook_secret once; save it to verify signatures for sessions created with this
     * default. Existing sessions retain their original signing secret.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun defaultWebhookUrl(): Optional<String> = body.defaultWebhookUrl()

    /**
     * Returns the raw JSON value of [autoJoinPolicy].
     *
     * Unlike [autoJoinPolicy], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _autoJoinPolicy(): JsonField<AutoJoinPolicy> = body._autoJoinPolicy()

    /**
     * Returns the raw JSON value of [botName].
     *
     * Unlike [botName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _botName(): JsonField<String> = body._botName()

    /**
     * Returns the raw JSON value of [defaultAssistant].
     *
     * Unlike [defaultAssistant], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _defaultAssistant(): JsonField<DefaultAssistant> = body._defaultAssistant()

    /**
     * Returns the raw JSON value of [defaultBargeIn].
     *
     * Unlike [defaultBargeIn], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _defaultBargeIn(): JsonField<Boolean> = body._defaultBargeIn()

    /**
     * Returns the raw JSON value of [defaultRecording].
     *
     * Unlike [defaultRecording], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _defaultRecording(): JsonField<Boolean> = body._defaultRecording()

    /**
     * Returns the raw JSON value of [defaultRecordingExport].
     *
     * Unlike [defaultRecordingExport], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _defaultRecordingExport(): JsonField<MeetingSessionRecordingDestination> =
        body._defaultRecordingExport()

    /**
     * Returns the raw JSON value of [defaultSummarizeOnEnd].
     *
     * Unlike [defaultSummarizeOnEnd], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _defaultSummarizeOnEnd(): JsonField<Boolean> = body._defaultSummarizeOnEnd()

    /**
     * Returns the raw JSON value of [defaultVoice].
     *
     * Unlike [defaultVoice], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _defaultVoice(): JsonField<String> = body._defaultVoice()

    /**
     * Returns the raw JSON value of [defaultWebhookUrl].
     *
     * Unlike [defaultWebhookUrl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _defaultWebhookUrl(): JsonField<String> = body._defaultWebhookUrl()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): CalendarConnectionUpdateParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [CalendarConnectionUpdateParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CalendarConnectionUpdateParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(calendarConnectionUpdateParams: CalendarConnectionUpdateParams) = apply {
            id = calendarConnectionUpdateParams.id
            body = calendarConnectionUpdateParams.body.toBuilder()
            additionalHeaders = calendarConnectionUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = calendarConnectionUpdateParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [autoJoinPolicy]
         * - [botName]
         * - [defaultAssistant]
         * - [defaultBargeIn]
         * - [defaultRecording]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * all_meetings joins eligible events; external_organizer_excluded requires the connected
         * user to be the organizer; per_meeting requires an explicit opt-in.
         */
        fun autoJoinPolicy(autoJoinPolicy: AutoJoinPolicy) = apply {
            body.autoJoinPolicy(autoJoinPolicy)
        }

        /**
         * Sets [Builder.autoJoinPolicy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.autoJoinPolicy] with a well-typed [AutoJoinPolicy] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun autoJoinPolicy(autoJoinPolicy: JsonField<AutoJoinPolicy>) = apply {
            body.autoJoinPolicy(autoJoinPolicy)
        }

        /** Bot display name; null clears the override. */
        fun botName(botName: String?) = apply { body.botName(botName) }

        /** Alias for calling [Builder.botName] with `botName.orElse(null)`. */
        fun botName(botName: Optional<String>) = botName(botName.getOrNull())

        /**
         * Sets [Builder.botName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.botName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun botName(botName: JsonField<String>) = apply { body.botName(botName) }

        /**
         * Default assistant for future calendar-scheduled Google Meet and Teams sessions. The saved
         * configuration must fit within 8 KiB. Use id, audio_gate, dynamic_variables, and
         * leave_on_end; avatar is not accepted. audio_gate defaults to full_duplex.
         */
        fun defaultAssistant(defaultAssistant: DefaultAssistant?) = apply {
            body.defaultAssistant(defaultAssistant)
        }

        /** Alias for calling [Builder.defaultAssistant] with `defaultAssistant.orElse(null)`. */
        fun defaultAssistant(defaultAssistant: Optional<DefaultAssistant>) =
            defaultAssistant(defaultAssistant.getOrNull())

        /**
         * Sets [Builder.defaultAssistant] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultAssistant] with a well-typed [DefaultAssistant]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun defaultAssistant(defaultAssistant: JsonField<DefaultAssistant>) = apply {
            body.defaultAssistant(defaultAssistant)
        }

        /** Default manual speech interruption. Cannot be true with default_assistant. */
        fun defaultBargeIn(defaultBargeIn: Boolean?) = apply { body.defaultBargeIn(defaultBargeIn) }

        /**
         * Alias for [Builder.defaultBargeIn].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun defaultBargeIn(defaultBargeIn: Boolean) = defaultBargeIn(defaultBargeIn as Boolean?)

        /** Alias for calling [Builder.defaultBargeIn] with `defaultBargeIn.orElse(null)`. */
        fun defaultBargeIn(defaultBargeIn: Optional<Boolean>) =
            defaultBargeIn(defaultBargeIn.getOrNull())

        /**
         * Sets [Builder.defaultBargeIn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultBargeIn] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun defaultBargeIn(defaultBargeIn: JsonField<Boolean>) = apply {
            body.defaultBargeIn(defaultBargeIn)
        }

        /**
         * Google Meet and Teams recording intent. When null, recording is enabled only if a
         * destination is set. True requires default_recording_export; false cannot be combined with
         * a destination.
         */
        fun defaultRecording(defaultRecording: Boolean?) = apply {
            body.defaultRecording(defaultRecording)
        }

        /**
         * Alias for [Builder.defaultRecording].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun defaultRecording(defaultRecording: Boolean) =
            defaultRecording(defaultRecording as Boolean?)

        /** Alias for calling [Builder.defaultRecording] with `defaultRecording.orElse(null)`. */
        fun defaultRecording(defaultRecording: Optional<Boolean>) =
            defaultRecording(defaultRecording.getOrNull())

        /**
         * Sets [Builder.defaultRecording] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultRecording] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun defaultRecording(defaultRecording: JsonField<Boolean>) = apply {
            body.defaultRecording(defaultRecording)
        }

        /**
         * Customer-owned Telnyx Storage destination for recording exports. Uses the authenticated
         * organization and user; do not supply credentials, region, organization ID or object key.
         */
        fun defaultRecordingExport(defaultRecordingExport: MeetingSessionRecordingDestination?) =
            apply {
                body.defaultRecordingExport(defaultRecordingExport)
            }

        /**
         * Alias for calling [Builder.defaultRecordingExport] with
         * `defaultRecordingExport.orElse(null)`.
         */
        fun defaultRecordingExport(
            defaultRecordingExport: Optional<MeetingSessionRecordingDestination>
        ) = defaultRecordingExport(defaultRecordingExport.getOrNull())

        /**
         * Sets [Builder.defaultRecordingExport] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultRecordingExport] with a well-typed
         * [MeetingSessionRecordingDestination] value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun defaultRecordingExport(
            defaultRecordingExport: JsonField<MeetingSessionRecordingDestination>
        ) = apply { body.defaultRecordingExport(defaultRecordingExport) }

        /** Generate a summary when each future session transcript finalizes. */
        fun defaultSummarizeOnEnd(defaultSummarizeOnEnd: Boolean?) = apply {
            body.defaultSummarizeOnEnd(defaultSummarizeOnEnd)
        }

        /**
         * Alias for [Builder.defaultSummarizeOnEnd].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun defaultSummarizeOnEnd(defaultSummarizeOnEnd: Boolean) =
            defaultSummarizeOnEnd(defaultSummarizeOnEnd as Boolean?)

        /**
         * Alias for calling [Builder.defaultSummarizeOnEnd] with
         * `defaultSummarizeOnEnd.orElse(null)`.
         */
        fun defaultSummarizeOnEnd(defaultSummarizeOnEnd: Optional<Boolean>) =
            defaultSummarizeOnEnd(defaultSummarizeOnEnd.getOrNull())

        /**
         * Sets [Builder.defaultSummarizeOnEnd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultSummarizeOnEnd] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun defaultSummarizeOnEnd(defaultSummarizeOnEnd: JsonField<Boolean>) = apply {
            body.defaultSummarizeOnEnd(defaultSummarizeOnEnd)
        }

        /** Manual-speech voice; must be null when default_assistant is set. */
        fun defaultVoice(defaultVoice: String?) = apply { body.defaultVoice(defaultVoice) }

        /** Alias for calling [Builder.defaultVoice] with `defaultVoice.orElse(null)`. */
        fun defaultVoice(defaultVoice: Optional<String>) = defaultVoice(defaultVoice.getOrNull())

        /**
         * Sets [Builder.defaultVoice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultVoice] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun defaultVoice(defaultVoice: JsonField<String>) = apply {
            body.defaultVoice(defaultVoice)
        }

        /**
         * HTTPS destination for future session webhooks. Null clears the default. A non-null update
         * returns webhook_secret once; save it to verify signatures for sessions created with this
         * default. Existing sessions retain their original signing secret.
         */
        fun defaultWebhookUrl(defaultWebhookUrl: String?) = apply {
            body.defaultWebhookUrl(defaultWebhookUrl)
        }

        /** Alias for calling [Builder.defaultWebhookUrl] with `defaultWebhookUrl.orElse(null)`. */
        fun defaultWebhookUrl(defaultWebhookUrl: Optional<String>) =
            defaultWebhookUrl(defaultWebhookUrl.getOrNull())

        /**
         * Sets [Builder.defaultWebhookUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultWebhookUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun defaultWebhookUrl(defaultWebhookUrl: JsonField<String>) = apply {
            body.defaultWebhookUrl(defaultWebhookUrl)
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
         * Returns an immutable instance of [CalendarConnectionUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CalendarConnectionUpdateParams =
            CalendarConnectionUpdateParams(
                id,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val autoJoinPolicy: JsonField<AutoJoinPolicy>,
        private val botName: JsonField<String>,
        private val defaultAssistant: JsonField<DefaultAssistant>,
        private val defaultBargeIn: JsonField<Boolean>,
        private val defaultRecording: JsonField<Boolean>,
        private val defaultRecordingExport: JsonField<MeetingSessionRecordingDestination>,
        private val defaultSummarizeOnEnd: JsonField<Boolean>,
        private val defaultVoice: JsonField<String>,
        private val defaultWebhookUrl: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("auto_join_policy")
            @ExcludeMissing
            autoJoinPolicy: JsonField<AutoJoinPolicy> = JsonMissing.of(),
            @JsonProperty("bot_name") @ExcludeMissing botName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("default_assistant")
            @ExcludeMissing
            defaultAssistant: JsonField<DefaultAssistant> = JsonMissing.of(),
            @JsonProperty("default_barge_in")
            @ExcludeMissing
            defaultBargeIn: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("default_recording")
            @ExcludeMissing
            defaultRecording: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("default_recording_export")
            @ExcludeMissing
            defaultRecordingExport: JsonField<MeetingSessionRecordingDestination> =
                JsonMissing.of(),
            @JsonProperty("default_summarize_on_end")
            @ExcludeMissing
            defaultSummarizeOnEnd: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("default_voice")
            @ExcludeMissing
            defaultVoice: JsonField<String> = JsonMissing.of(),
            @JsonProperty("default_webhook_url")
            @ExcludeMissing
            defaultWebhookUrl: JsonField<String> = JsonMissing.of(),
        ) : this(
            autoJoinPolicy,
            botName,
            defaultAssistant,
            defaultBargeIn,
            defaultRecording,
            defaultRecordingExport,
            defaultSummarizeOnEnd,
            defaultVoice,
            defaultWebhookUrl,
            mutableMapOf(),
        )

        /**
         * all_meetings joins eligible events; external_organizer_excluded requires the connected
         * user to be the organizer; per_meeting requires an explicit opt-in.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun autoJoinPolicy(): Optional<AutoJoinPolicy> =
            autoJoinPolicy.getOptional("auto_join_policy")

        /**
         * Bot display name; null clears the override.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun botName(): Optional<String> = botName.getOptional("bot_name")

        /**
         * Default assistant for future calendar-scheduled Google Meet and Teams sessions. The saved
         * configuration must fit within 8 KiB. Use id, audio_gate, dynamic_variables, and
         * leave_on_end; avatar is not accepted. audio_gate defaults to full_duplex.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun defaultAssistant(): Optional<DefaultAssistant> =
            defaultAssistant.getOptional("default_assistant")

        /**
         * Default manual speech interruption. Cannot be true with default_assistant.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun defaultBargeIn(): Optional<Boolean> = defaultBargeIn.getOptional("default_barge_in")

        /**
         * Google Meet and Teams recording intent. When null, recording is enabled only if a
         * destination is set. True requires default_recording_export; false cannot be combined with
         * a destination.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun defaultRecording(): Optional<Boolean> =
            defaultRecording.getOptional("default_recording")

        /**
         * Customer-owned Telnyx Storage destination for recording exports. Uses the authenticated
         * organization and user; do not supply credentials, region, organization ID or object key.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun defaultRecordingExport(): Optional<MeetingSessionRecordingDestination> =
            defaultRecordingExport.getOptional("default_recording_export")

        /**
         * Generate a summary when each future session transcript finalizes.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun defaultSummarizeOnEnd(): Optional<Boolean> =
            defaultSummarizeOnEnd.getOptional("default_summarize_on_end")

        /**
         * Manual-speech voice; must be null when default_assistant is set.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun defaultVoice(): Optional<String> = defaultVoice.getOptional("default_voice")

        /**
         * HTTPS destination for future session webhooks. Null clears the default. A non-null update
         * returns webhook_secret once; save it to verify signatures for sessions created with this
         * default. Existing sessions retain their original signing secret.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun defaultWebhookUrl(): Optional<String> =
            defaultWebhookUrl.getOptional("default_webhook_url")

        /**
         * Returns the raw JSON value of [autoJoinPolicy].
         *
         * Unlike [autoJoinPolicy], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("auto_join_policy")
        @ExcludeMissing
        fun _autoJoinPolicy(): JsonField<AutoJoinPolicy> = autoJoinPolicy

        /**
         * Returns the raw JSON value of [botName].
         *
         * Unlike [botName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bot_name") @ExcludeMissing fun _botName(): JsonField<String> = botName

        /**
         * Returns the raw JSON value of [defaultAssistant].
         *
         * Unlike [defaultAssistant], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("default_assistant")
        @ExcludeMissing
        fun _defaultAssistant(): JsonField<DefaultAssistant> = defaultAssistant

        /**
         * Returns the raw JSON value of [defaultBargeIn].
         *
         * Unlike [defaultBargeIn], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("default_barge_in")
        @ExcludeMissing
        fun _defaultBargeIn(): JsonField<Boolean> = defaultBargeIn

        /**
         * Returns the raw JSON value of [defaultRecording].
         *
         * Unlike [defaultRecording], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("default_recording")
        @ExcludeMissing
        fun _defaultRecording(): JsonField<Boolean> = defaultRecording

        /**
         * Returns the raw JSON value of [defaultRecordingExport].
         *
         * Unlike [defaultRecordingExport], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("default_recording_export")
        @ExcludeMissing
        fun _defaultRecordingExport(): JsonField<MeetingSessionRecordingDestination> =
            defaultRecordingExport

        /**
         * Returns the raw JSON value of [defaultSummarizeOnEnd].
         *
         * Unlike [defaultSummarizeOnEnd], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("default_summarize_on_end")
        @ExcludeMissing
        fun _defaultSummarizeOnEnd(): JsonField<Boolean> = defaultSummarizeOnEnd

        /**
         * Returns the raw JSON value of [defaultVoice].
         *
         * Unlike [defaultVoice], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("default_voice")
        @ExcludeMissing
        fun _defaultVoice(): JsonField<String> = defaultVoice

        /**
         * Returns the raw JSON value of [defaultWebhookUrl].
         *
         * Unlike [defaultWebhookUrl], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("default_webhook_url")
        @ExcludeMissing
        fun _defaultWebhookUrl(): JsonField<String> = defaultWebhookUrl

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var autoJoinPolicy: JsonField<AutoJoinPolicy> = JsonMissing.of()
            private var botName: JsonField<String> = JsonMissing.of()
            private var defaultAssistant: JsonField<DefaultAssistant> = JsonMissing.of()
            private var defaultBargeIn: JsonField<Boolean> = JsonMissing.of()
            private var defaultRecording: JsonField<Boolean> = JsonMissing.of()
            private var defaultRecordingExport: JsonField<MeetingSessionRecordingDestination> =
                JsonMissing.of()
            private var defaultSummarizeOnEnd: JsonField<Boolean> = JsonMissing.of()
            private var defaultVoice: JsonField<String> = JsonMissing.of()
            private var defaultWebhookUrl: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                autoJoinPolicy = body.autoJoinPolicy
                botName = body.botName
                defaultAssistant = body.defaultAssistant
                defaultBargeIn = body.defaultBargeIn
                defaultRecording = body.defaultRecording
                defaultRecordingExport = body.defaultRecordingExport
                defaultSummarizeOnEnd = body.defaultSummarizeOnEnd
                defaultVoice = body.defaultVoice
                defaultWebhookUrl = body.defaultWebhookUrl
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * all_meetings joins eligible events; external_organizer_excluded requires the
             * connected user to be the organizer; per_meeting requires an explicit opt-in.
             */
            fun autoJoinPolicy(autoJoinPolicy: AutoJoinPolicy) =
                autoJoinPolicy(JsonField.of(autoJoinPolicy))

            /**
             * Sets [Builder.autoJoinPolicy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.autoJoinPolicy] with a well-typed [AutoJoinPolicy]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun autoJoinPolicy(autoJoinPolicy: JsonField<AutoJoinPolicy>) = apply {
                this.autoJoinPolicy = autoJoinPolicy
            }

            /** Bot display name; null clears the override. */
            fun botName(botName: String?) = botName(JsonField.ofNullable(botName))

            /** Alias for calling [Builder.botName] with `botName.orElse(null)`. */
            fun botName(botName: Optional<String>) = botName(botName.getOrNull())

            /**
             * Sets [Builder.botName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.botName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun botName(botName: JsonField<String>) = apply { this.botName = botName }

            /**
             * Default assistant for future calendar-scheduled Google Meet and Teams sessions. The
             * saved configuration must fit within 8 KiB. Use id, audio_gate, dynamic_variables, and
             * leave_on_end; avatar is not accepted. audio_gate defaults to full_duplex.
             */
            fun defaultAssistant(defaultAssistant: DefaultAssistant?) =
                defaultAssistant(JsonField.ofNullable(defaultAssistant))

            /**
             * Alias for calling [Builder.defaultAssistant] with `defaultAssistant.orElse(null)`.
             */
            fun defaultAssistant(defaultAssistant: Optional<DefaultAssistant>) =
                defaultAssistant(defaultAssistant.getOrNull())

            /**
             * Sets [Builder.defaultAssistant] to an arbitrary JSON value.
             *
             * You should usually call [Builder.defaultAssistant] with a well-typed
             * [DefaultAssistant] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun defaultAssistant(defaultAssistant: JsonField<DefaultAssistant>) = apply {
                this.defaultAssistant = defaultAssistant
            }

            /** Default manual speech interruption. Cannot be true with default_assistant. */
            fun defaultBargeIn(defaultBargeIn: Boolean?) =
                defaultBargeIn(JsonField.ofNullable(defaultBargeIn))

            /**
             * Alias for [Builder.defaultBargeIn].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun defaultBargeIn(defaultBargeIn: Boolean) = defaultBargeIn(defaultBargeIn as Boolean?)

            /** Alias for calling [Builder.defaultBargeIn] with `defaultBargeIn.orElse(null)`. */
            fun defaultBargeIn(defaultBargeIn: Optional<Boolean>) =
                defaultBargeIn(defaultBargeIn.getOrNull())

            /**
             * Sets [Builder.defaultBargeIn] to an arbitrary JSON value.
             *
             * You should usually call [Builder.defaultBargeIn] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun defaultBargeIn(defaultBargeIn: JsonField<Boolean>) = apply {
                this.defaultBargeIn = defaultBargeIn
            }

            /**
             * Google Meet and Teams recording intent. When null, recording is enabled only if a
             * destination is set. True requires default_recording_export; false cannot be combined
             * with a destination.
             */
            fun defaultRecording(defaultRecording: Boolean?) =
                defaultRecording(JsonField.ofNullable(defaultRecording))

            /**
             * Alias for [Builder.defaultRecording].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun defaultRecording(defaultRecording: Boolean) =
                defaultRecording(defaultRecording as Boolean?)

            /**
             * Alias for calling [Builder.defaultRecording] with `defaultRecording.orElse(null)`.
             */
            fun defaultRecording(defaultRecording: Optional<Boolean>) =
                defaultRecording(defaultRecording.getOrNull())

            /**
             * Sets [Builder.defaultRecording] to an arbitrary JSON value.
             *
             * You should usually call [Builder.defaultRecording] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun defaultRecording(defaultRecording: JsonField<Boolean>) = apply {
                this.defaultRecording = defaultRecording
            }

            /**
             * Customer-owned Telnyx Storage destination for recording exports. Uses the
             * authenticated organization and user; do not supply credentials, region, organization
             * ID or object key.
             */
            fun defaultRecordingExport(
                defaultRecordingExport: MeetingSessionRecordingDestination?
            ) = defaultRecordingExport(JsonField.ofNullable(defaultRecordingExport))

            /**
             * Alias for calling [Builder.defaultRecordingExport] with
             * `defaultRecordingExport.orElse(null)`.
             */
            fun defaultRecordingExport(
                defaultRecordingExport: Optional<MeetingSessionRecordingDestination>
            ) = defaultRecordingExport(defaultRecordingExport.getOrNull())

            /**
             * Sets [Builder.defaultRecordingExport] to an arbitrary JSON value.
             *
             * You should usually call [Builder.defaultRecordingExport] with a well-typed
             * [MeetingSessionRecordingDestination] value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun defaultRecordingExport(
                defaultRecordingExport: JsonField<MeetingSessionRecordingDestination>
            ) = apply { this.defaultRecordingExport = defaultRecordingExport }

            /** Generate a summary when each future session transcript finalizes. */
            fun defaultSummarizeOnEnd(defaultSummarizeOnEnd: Boolean?) =
                defaultSummarizeOnEnd(JsonField.ofNullable(defaultSummarizeOnEnd))

            /**
             * Alias for [Builder.defaultSummarizeOnEnd].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun defaultSummarizeOnEnd(defaultSummarizeOnEnd: Boolean) =
                defaultSummarizeOnEnd(defaultSummarizeOnEnd as Boolean?)

            /**
             * Alias for calling [Builder.defaultSummarizeOnEnd] with
             * `defaultSummarizeOnEnd.orElse(null)`.
             */
            fun defaultSummarizeOnEnd(defaultSummarizeOnEnd: Optional<Boolean>) =
                defaultSummarizeOnEnd(defaultSummarizeOnEnd.getOrNull())

            /**
             * Sets [Builder.defaultSummarizeOnEnd] to an arbitrary JSON value.
             *
             * You should usually call [Builder.defaultSummarizeOnEnd] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun defaultSummarizeOnEnd(defaultSummarizeOnEnd: JsonField<Boolean>) = apply {
                this.defaultSummarizeOnEnd = defaultSummarizeOnEnd
            }

            /** Manual-speech voice; must be null when default_assistant is set. */
            fun defaultVoice(defaultVoice: String?) =
                defaultVoice(JsonField.ofNullable(defaultVoice))

            /** Alias for calling [Builder.defaultVoice] with `defaultVoice.orElse(null)`. */
            fun defaultVoice(defaultVoice: Optional<String>) =
                defaultVoice(defaultVoice.getOrNull())

            /**
             * Sets [Builder.defaultVoice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.defaultVoice] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun defaultVoice(defaultVoice: JsonField<String>) = apply {
                this.defaultVoice = defaultVoice
            }

            /**
             * HTTPS destination for future session webhooks. Null clears the default. A non-null
             * update returns webhook_secret once; save it to verify signatures for sessions created
             * with this default. Existing sessions retain their original signing secret.
             */
            fun defaultWebhookUrl(defaultWebhookUrl: String?) =
                defaultWebhookUrl(JsonField.ofNullable(defaultWebhookUrl))

            /**
             * Alias for calling [Builder.defaultWebhookUrl] with `defaultWebhookUrl.orElse(null)`.
             */
            fun defaultWebhookUrl(defaultWebhookUrl: Optional<String>) =
                defaultWebhookUrl(defaultWebhookUrl.getOrNull())

            /**
             * Sets [Builder.defaultWebhookUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.defaultWebhookUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun defaultWebhookUrl(defaultWebhookUrl: JsonField<String>) = apply {
                this.defaultWebhookUrl = defaultWebhookUrl
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
             */
            fun build(): Body =
                Body(
                    autoJoinPolicy,
                    botName,
                    defaultAssistant,
                    defaultBargeIn,
                    defaultRecording,
                    defaultRecordingExport,
                    defaultSummarizeOnEnd,
                    defaultVoice,
                    defaultWebhookUrl,
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

            autoJoinPolicy().ifPresent { it.validate() }
            botName()
            defaultAssistant().ifPresent { it.validate() }
            defaultBargeIn()
            defaultRecording()
            defaultRecordingExport().ifPresent { it.validate() }
            defaultSummarizeOnEnd()
            defaultVoice()
            defaultWebhookUrl()
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
            (autoJoinPolicy.asKnown().getOrNull()?.validity() ?: 0) +
                (if (botName.asKnown().isPresent) 1 else 0) +
                (defaultAssistant.asKnown().getOrNull()?.validity() ?: 0) +
                (if (defaultBargeIn.asKnown().isPresent) 1 else 0) +
                (if (defaultRecording.asKnown().isPresent) 1 else 0) +
                (defaultRecordingExport.asKnown().getOrNull()?.validity() ?: 0) +
                (if (defaultSummarizeOnEnd.asKnown().isPresent) 1 else 0) +
                (if (defaultVoice.asKnown().isPresent) 1 else 0) +
                (if (defaultWebhookUrl.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                autoJoinPolicy == other.autoJoinPolicy &&
                botName == other.botName &&
                defaultAssistant == other.defaultAssistant &&
                defaultBargeIn == other.defaultBargeIn &&
                defaultRecording == other.defaultRecording &&
                defaultRecordingExport == other.defaultRecordingExport &&
                defaultSummarizeOnEnd == other.defaultSummarizeOnEnd &&
                defaultVoice == other.defaultVoice &&
                defaultWebhookUrl == other.defaultWebhookUrl &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                autoJoinPolicy,
                botName,
                defaultAssistant,
                defaultBargeIn,
                defaultRecording,
                defaultRecordingExport,
                defaultSummarizeOnEnd,
                defaultVoice,
                defaultWebhookUrl,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{autoJoinPolicy=$autoJoinPolicy, botName=$botName, defaultAssistant=$defaultAssistant, defaultBargeIn=$defaultBargeIn, defaultRecording=$defaultRecording, defaultRecordingExport=$defaultRecordingExport, defaultSummarizeOnEnd=$defaultSummarizeOnEnd, defaultVoice=$defaultVoice, defaultWebhookUrl=$defaultWebhookUrl, additionalProperties=$additionalProperties}"
    }

    /**
     * all_meetings joins eligible events; external_organizer_excluded requires the connected user
     * to be the organizer; per_meeting requires an explicit opt-in.
     */
    class AutoJoinPolicy @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val ALL_MEETINGS = of("all_meetings")

            @JvmField val EXTERNAL_ORGANIZER_EXCLUDED = of("external_organizer_excluded")

            @JvmField val PER_MEETING = of("per_meeting")

            @JvmStatic fun of(value: String) = AutoJoinPolicy(JsonField.of(value))
        }

        /** An enum containing [AutoJoinPolicy]'s known values. */
        enum class Known {
            ALL_MEETINGS,
            EXTERNAL_ORGANIZER_EXCLUDED,
            PER_MEETING,
        }

        /**
         * An enum containing [AutoJoinPolicy]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AutoJoinPolicy] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ALL_MEETINGS,
            EXTERNAL_ORGANIZER_EXCLUDED,
            PER_MEETING,
            /**
             * An enum member indicating that [AutoJoinPolicy] was instantiated with an unknown
             * value.
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
                ALL_MEETINGS -> Value.ALL_MEETINGS
                EXTERNAL_ORGANIZER_EXCLUDED -> Value.EXTERNAL_ORGANIZER_EXCLUDED
                PER_MEETING -> Value.PER_MEETING
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
                ALL_MEETINGS -> Known.ALL_MEETINGS
                EXTERNAL_ORGANIZER_EXCLUDED -> Known.EXTERNAL_ORGANIZER_EXCLUDED
                PER_MEETING -> Known.PER_MEETING
                else -> throw TelnyxInvalidDataException("Unknown AutoJoinPolicy: $value")
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
        fun validate(): AutoJoinPolicy = apply {
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

            return other is AutoJoinPolicy && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Default assistant for future calendar-scheduled Google Meet and Teams sessions. The saved
     * configuration must fit within 8 KiB. Use id, audio_gate, dynamic_variables, and leave_on_end;
     * avatar is not accepted. audio_gate defaults to full_duplex.
     */
    class DefaultAssistant
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val audioGate: JsonField<AudioGate>,
        private val dynamicVariables: JsonField<DynamicVariables>,
        private val leaveOnEnd: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("audio_gate")
            @ExcludeMissing
            audioGate: JsonField<AudioGate> = JsonMissing.of(),
            @JsonProperty("dynamic_variables")
            @ExcludeMissing
            dynamicVariables: JsonField<DynamicVariables> = JsonMissing.of(),
            @JsonProperty("leave_on_end")
            @ExcludeMissing
            leaveOnEnd: JsonField<Boolean> = JsonMissing.of(),
        ) : this(id, audioGate, dynamicVariables, leaveOnEnd, mutableMapOf())

        /**
         * Identifier of the assistant to attach.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Use full_duplex (default) to allow participants to interrupt, or half_duplex to pause
         * listening while the assistant speaks. Full-duplex pricing depends on participant audio
         * usage; see the Meeting pricing guide.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun audioGate(): Optional<AudioGate> = audioGate.getOptional("audio_gate")

        /**
         * Per-conversation values for the
         * [dynamic variables](/docs/inference/ai-assistants/dynamic-variables) used in the
         * Assistant's instructions, greeting, or tools. Delivered before the Assistant's first
         * utterance, so they resolve for the opening line as well as the rest of the conversation.
         * At most 63 entries; keys 1-128 characters; values must be strings. The map is budgeted in
         * aggregate at 1,047,552 bytes (1023 KiB) rather than capped per value. `streaming_audio`,
         * `ai_assistant_streaming_audio` and `meeting_session_id` are reserved and rejected with
         * `400 invalid_request`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dynamicVariables(): Optional<DynamicVariables> =
            dynamicVariables.getOptional("dynamic_variables")

        /**
         * Leave when the assistant conversation ends or fails. Defaults to false. Other
         * leave-policy rules and explicit leave requests still apply.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun leaveOnEnd(): Optional<Boolean> = leaveOnEnd.getOptional("leave_on_end")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [audioGate].
         *
         * Unlike [audioGate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("audio_gate")
        @ExcludeMissing
        fun _audioGate(): JsonField<AudioGate> = audioGate

        /**
         * Returns the raw JSON value of [dynamicVariables].
         *
         * Unlike [dynamicVariables], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dynamic_variables")
        @ExcludeMissing
        fun _dynamicVariables(): JsonField<DynamicVariables> = dynamicVariables

        /**
         * Returns the raw JSON value of [leaveOnEnd].
         *
         * Unlike [leaveOnEnd], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("leave_on_end")
        @ExcludeMissing
        fun _leaveOnEnd(): JsonField<Boolean> = leaveOnEnd

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
             * Returns a mutable builder for constructing an instance of [DefaultAssistant].
             *
             * The following fields are required:
             * ```java
             * .id()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DefaultAssistant]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var audioGate: JsonField<AudioGate> = JsonMissing.of()
            private var dynamicVariables: JsonField<DynamicVariables> = JsonMissing.of()
            private var leaveOnEnd: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(defaultAssistant: DefaultAssistant) = apply {
                id = defaultAssistant.id
                audioGate = defaultAssistant.audioGate
                dynamicVariables = defaultAssistant.dynamicVariables
                leaveOnEnd = defaultAssistant.leaveOnEnd
                additionalProperties = defaultAssistant.additionalProperties.toMutableMap()
            }

            /** Identifier of the assistant to attach. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * Use full_duplex (default) to allow participants to interrupt, or half_duplex to pause
             * listening while the assistant speaks. Full-duplex pricing depends on participant
             * audio usage; see the Meeting pricing guide.
             */
            fun audioGate(audioGate: AudioGate) = audioGate(JsonField.of(audioGate))

            /**
             * Sets [Builder.audioGate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.audioGate] with a well-typed [AudioGate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun audioGate(audioGate: JsonField<AudioGate>) = apply { this.audioGate = audioGate }

            /**
             * Per-conversation values for the
             * [dynamic variables](/docs/inference/ai-assistants/dynamic-variables) used in the
             * Assistant's instructions, greeting, or tools. Delivered before the Assistant's first
             * utterance, so they resolve for the opening line as well as the rest of the
             * conversation. At most 63 entries; keys 1-128 characters; values must be strings. The
             * map is budgeted in aggregate at 1,047,552 bytes (1023 KiB) rather than capped per
             * value. `streaming_audio`, `ai_assistant_streaming_audio` and `meeting_session_id` are
             * reserved and rejected with `400 invalid_request`.
             */
            fun dynamicVariables(dynamicVariables: DynamicVariables) =
                dynamicVariables(JsonField.of(dynamicVariables))

            /**
             * Sets [Builder.dynamicVariables] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dynamicVariables] with a well-typed
             * [DynamicVariables] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun dynamicVariables(dynamicVariables: JsonField<DynamicVariables>) = apply {
                this.dynamicVariables = dynamicVariables
            }

            /**
             * Leave when the assistant conversation ends or fails. Defaults to false. Other
             * leave-policy rules and explicit leave requests still apply.
             */
            fun leaveOnEnd(leaveOnEnd: Boolean) = leaveOnEnd(JsonField.of(leaveOnEnd))

            /**
             * Sets [Builder.leaveOnEnd] to an arbitrary JSON value.
             *
             * You should usually call [Builder.leaveOnEnd] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun leaveOnEnd(leaveOnEnd: JsonField<Boolean>) = apply { this.leaveOnEnd = leaveOnEnd }

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
             * Returns an immutable instance of [DefaultAssistant].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): DefaultAssistant =
                DefaultAssistant(
                    checkRequired("id", id),
                    audioGate,
                    dynamicVariables,
                    leaveOnEnd,
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
        fun validate(): DefaultAssistant = apply {
            if (validated) {
                return@apply
            }

            id()
            audioGate().ifPresent { it.validate() }
            dynamicVariables().ifPresent { it.validate() }
            leaveOnEnd()
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (audioGate.asKnown().getOrNull()?.validity() ?: 0) +
                (dynamicVariables.asKnown().getOrNull()?.validity() ?: 0) +
                (if (leaveOnEnd.asKnown().isPresent) 1 else 0)

        /**
         * Use full_duplex (default) to allow participants to interrupt, or half_duplex to pause
         * listening while the assistant speaks. Full-duplex pricing depends on participant audio
         * usage; see the Meeting pricing guide.
         */
        class AudioGate @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val HALF_DUPLEX = of("half_duplex")

                @JvmField val FULL_DUPLEX = of("full_duplex")

                @JvmStatic fun of(value: String) = AudioGate(JsonField.of(value))
            }

            /** An enum containing [AudioGate]'s known values. */
            enum class Known {
                HALF_DUPLEX,
                FULL_DUPLEX,
            }

            /**
             * An enum containing [AudioGate]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [AudioGate] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                HALF_DUPLEX,
                FULL_DUPLEX,
                /**
                 * An enum member indicating that [AudioGate] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    HALF_DUPLEX -> Value.HALF_DUPLEX
                    FULL_DUPLEX -> Value.FULL_DUPLEX
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    HALF_DUPLEX -> Known.HALF_DUPLEX
                    FULL_DUPLEX -> Known.FULL_DUPLEX
                    else -> throw TelnyxInvalidDataException("Unknown AudioGate: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
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
            fun validate(): AudioGate = apply {
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

                return other is AudioGate && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * Per-conversation values for the
         * [dynamic variables](/docs/inference/ai-assistants/dynamic-variables) used in the
         * Assistant's instructions, greeting, or tools. Delivered before the Assistant's first
         * utterance, so they resolve for the opening line as well as the rest of the conversation.
         * At most 63 entries; keys 1-128 characters; values must be strings. The map is budgeted in
         * aggregate at 1,047,552 bytes (1023 KiB) rather than capped per value. `streaming_audio`,
         * `ai_assistant_streaming_audio` and `meeting_session_id` are reserved and rejected with
         * `400 invalid_request`.
         */
        class DynamicVariables
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

                /** Returns a mutable builder for constructing an instance of [DynamicVariables]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [DynamicVariables]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(dynamicVariables: DynamicVariables) = apply {
                    additionalProperties = dynamicVariables.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [DynamicVariables].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): DynamicVariables = DynamicVariables(additionalProperties.toImmutable())
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
            fun validate(): DynamicVariables = apply {
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

                return other is DynamicVariables &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "DynamicVariables{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DefaultAssistant &&
                id == other.id &&
                audioGate == other.audioGate &&
                dynamicVariables == other.dynamicVariables &&
                leaveOnEnd == other.leaveOnEnd &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(id, audioGate, dynamicVariables, leaveOnEnd, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DefaultAssistant{id=$id, audioGate=$audioGate, dynamicVariables=$dynamicVariables, leaveOnEnd=$leaveOnEnd, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CalendarConnectionUpdateParams &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CalendarConnectionUpdateParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
