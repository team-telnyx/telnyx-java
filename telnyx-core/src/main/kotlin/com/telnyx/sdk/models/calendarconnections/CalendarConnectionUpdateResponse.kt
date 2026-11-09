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
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import com.telnyx.sdk.models.meetingsessions.MeetingSessionRecordingDestination
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CalendarConnectionUpdateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<Data>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): Data = data.getRequired("data")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

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
         * [CalendarConnectionUpdateResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CalendarConnectionUpdateResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(calendarConnectionUpdateResponse: CalendarConnectionUpdateResponse) =
            apply {
                data = calendarConnectionUpdateResponse.data
                additionalProperties =
                    calendarConnectionUpdateResponse.additionalProperties.toMutableMap()
            }

        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

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
         * Returns an immutable instance of [CalendarConnectionUpdateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CalendarConnectionUpdateResponse =
            CalendarConnectionUpdateResponse(
                checkRequired("data", data),
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
    fun validate(): CalendarConnectionUpdateResponse = apply {
        if (validated) {
            return@apply
        }

        data().validate()
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
    @JvmSynthetic internal fun validity(): Int = (data.asKnown().getOrNull()?.validity() ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val autoJoinPolicy: JsonField<AutoJoinPolicy>,
        private val botName: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val defaultAssistant: JsonField<MeetingSessionAssistant>,
        private val defaultBargeIn: JsonField<Boolean>,
        private val defaultRecording: JsonField<Boolean>,
        private val defaultRecordingExport: JsonField<MeetingSessionRecordingDestination>,
        private val defaultSummarizeOnEnd: JsonField<Boolean>,
        private val defaultVoice: JsonField<String>,
        private val defaultWebhookUrl: JsonField<String>,
        private val platform: JsonField<Platform>,
        private val platformEmail: JsonField<String>,
        private val status: JsonField<Status>,
        private val statusDetail: JsonField<String>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val webhookSecret: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("auto_join_policy")
            @ExcludeMissing
            autoJoinPolicy: JsonField<AutoJoinPolicy> = JsonMissing.of(),
            @JsonProperty("bot_name") @ExcludeMissing botName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("default_assistant")
            @ExcludeMissing
            defaultAssistant: JsonField<MeetingSessionAssistant> = JsonMissing.of(),
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
            @JsonProperty("platform")
            @ExcludeMissing
            platform: JsonField<Platform> = JsonMissing.of(),
            @JsonProperty("platform_email")
            @ExcludeMissing
            platformEmail: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("status_detail")
            @ExcludeMissing
            statusDetail: JsonField<String> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("webhook_secret")
            @ExcludeMissing
            webhookSecret: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            autoJoinPolicy,
            botName,
            createdAt,
            defaultAssistant,
            defaultBargeIn,
            defaultRecording,
            defaultRecordingExport,
            defaultSummarizeOnEnd,
            defaultVoice,
            defaultWebhookUrl,
            platform,
            platformEmail,
            status,
            statusDetail,
            updatedAt,
            webhookSecret,
            mutableMapOf(),
        )

        /**
         * Calendar connection ID.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * all_meetings joins eligible events; external_organizer_excluded requires the connected
         * user to be the organizer; per_meeting requires an explicit opt-in.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun autoJoinPolicy(): AutoJoinPolicy = autoJoinPolicy.getRequired("auto_join_policy")

        /**
         * Bot display name; null clears the override.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun botName(): Optional<String> = botName.getOptional("bot_name")

        /**
         * Creation time.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun defaultAssistant(): Optional<MeetingSessionAssistant> =
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
         * Calendar provider: Google Calendar or Microsoft Outlook.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun platform(): Platform = platform.getRequired("platform")

        /**
         * Connected calendar email address.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun platformEmail(): Optional<String> = platformEmail.getOptional("platform_email")

        /**
         * Connection status.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * Additional connection status detail.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun statusDetail(): Optional<String> = statusDetail.getOptional("status_detail")

        /**
         * Last update time.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

        /**
         * Returned only when PATCH supplies a non-null default_webhook_url. Not returned by list or
         * retrieve. Save this secret to verify webhooks for future sessions.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun webhookSecret(): Optional<String> = webhookSecret.getOptional("webhook_secret")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [defaultAssistant].
         *
         * Unlike [defaultAssistant], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("default_assistant")
        @ExcludeMissing
        fun _defaultAssistant(): JsonField<MeetingSessionAssistant> = defaultAssistant

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

        /**
         * Returns the raw JSON value of [platform].
         *
         * Unlike [platform], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("platform") @ExcludeMissing fun _platform(): JsonField<Platform> = platform

        /**
         * Returns the raw JSON value of [platformEmail].
         *
         * Unlike [platformEmail], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("platform_email")
        @ExcludeMissing
        fun _platformEmail(): JsonField<String> = platformEmail

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [statusDetail].
         *
         * Unlike [statusDetail], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("status_detail")
        @ExcludeMissing
        fun _statusDetail(): JsonField<String> = statusDetail

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

        /**
         * Returns the raw JSON value of [webhookSecret].
         *
         * Unlike [webhookSecret], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("webhook_secret")
        @ExcludeMissing
        fun _webhookSecret(): JsonField<String> = webhookSecret

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
             * Returns a mutable builder for constructing an instance of [Data].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .autoJoinPolicy()
             * .botName()
             * .createdAt()
             * .defaultAssistant()
             * .defaultBargeIn()
             * .defaultRecording()
             * .defaultRecordingExport()
             * .defaultSummarizeOnEnd()
             * .defaultVoice()
             * .defaultWebhookUrl()
             * .platform()
             * .platformEmail()
             * .status()
             * .statusDetail()
             * .updatedAt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var autoJoinPolicy: JsonField<AutoJoinPolicy>? = null
            private var botName: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var defaultAssistant: JsonField<MeetingSessionAssistant>? = null
            private var defaultBargeIn: JsonField<Boolean>? = null
            private var defaultRecording: JsonField<Boolean>? = null
            private var defaultRecordingExport: JsonField<MeetingSessionRecordingDestination>? =
                null
            private var defaultSummarizeOnEnd: JsonField<Boolean>? = null
            private var defaultVoice: JsonField<String>? = null
            private var defaultWebhookUrl: JsonField<String>? = null
            private var platform: JsonField<Platform>? = null
            private var platformEmail: JsonField<String>? = null
            private var status: JsonField<Status>? = null
            private var statusDetail: JsonField<String>? = null
            private var updatedAt: JsonField<OffsetDateTime>? = null
            private var webhookSecret: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                autoJoinPolicy = data.autoJoinPolicy
                botName = data.botName
                createdAt = data.createdAt
                defaultAssistant = data.defaultAssistant
                defaultBargeIn = data.defaultBargeIn
                defaultRecording = data.defaultRecording
                defaultRecordingExport = data.defaultRecordingExport
                defaultSummarizeOnEnd = data.defaultSummarizeOnEnd
                defaultVoice = data.defaultVoice
                defaultWebhookUrl = data.defaultWebhookUrl
                platform = data.platform
                platformEmail = data.platformEmail
                status = data.status
                statusDetail = data.statusDetail
                updatedAt = data.updatedAt
                webhookSecret = data.webhookSecret
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Calendar connection ID. */
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

            /** Creation time. */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun defaultAssistant(defaultAssistant: MeetingSessionAssistant?) =
                defaultAssistant(JsonField.ofNullable(defaultAssistant))

            /**
             * Alias for calling [Builder.defaultAssistant] with `defaultAssistant.orElse(null)`.
             */
            fun defaultAssistant(defaultAssistant: Optional<MeetingSessionAssistant>) =
                defaultAssistant(defaultAssistant.getOrNull())

            /**
             * Sets [Builder.defaultAssistant] to an arbitrary JSON value.
             *
             * You should usually call [Builder.defaultAssistant] with a well-typed
             * [MeetingSessionAssistant] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun defaultAssistant(defaultAssistant: JsonField<MeetingSessionAssistant>) = apply {
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

            /** Calendar provider: Google Calendar or Microsoft Outlook. */
            fun platform(platform: Platform) = platform(JsonField.of(platform))

            /**
             * Sets [Builder.platform] to an arbitrary JSON value.
             *
             * You should usually call [Builder.platform] with a well-typed [Platform] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun platform(platform: JsonField<Platform>) = apply { this.platform = platform }

            /** Connected calendar email address. */
            fun platformEmail(platformEmail: String?) =
                platformEmail(JsonField.ofNullable(platformEmail))

            /** Alias for calling [Builder.platformEmail] with `platformEmail.orElse(null)`. */
            fun platformEmail(platformEmail: Optional<String>) =
                platformEmail(platformEmail.getOrNull())

            /**
             * Sets [Builder.platformEmail] to an arbitrary JSON value.
             *
             * You should usually call [Builder.platformEmail] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun platformEmail(platformEmail: JsonField<String>) = apply {
                this.platformEmail = platformEmail
            }

            /** Connection status. */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** Additional connection status detail. */
            fun statusDetail(statusDetail: String?) =
                statusDetail(JsonField.ofNullable(statusDetail))

            /** Alias for calling [Builder.statusDetail] with `statusDetail.orElse(null)`. */
            fun statusDetail(statusDetail: Optional<String>) =
                statusDetail(statusDetail.getOrNull())

            /**
             * Sets [Builder.statusDetail] to an arbitrary JSON value.
             *
             * You should usually call [Builder.statusDetail] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun statusDetail(statusDetail: JsonField<String>) = apply {
                this.statusDetail = statusDetail
            }

            /** Last update time. */
            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            /**
             * Returned only when PATCH supplies a non-null default_webhook_url. Not returned by
             * list or retrieve. Save this secret to verify webhooks for future sessions.
             */
            fun webhookSecret(webhookSecret: String) = webhookSecret(JsonField.of(webhookSecret))

            /**
             * Sets [Builder.webhookSecret] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhookSecret] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun webhookSecret(webhookSecret: JsonField<String>) = apply {
                this.webhookSecret = webhookSecret
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .autoJoinPolicy()
             * .botName()
             * .createdAt()
             * .defaultAssistant()
             * .defaultBargeIn()
             * .defaultRecording()
             * .defaultRecordingExport()
             * .defaultSummarizeOnEnd()
             * .defaultVoice()
             * .defaultWebhookUrl()
             * .platform()
             * .platformEmail()
             * .status()
             * .statusDetail()
             * .updatedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("id", id),
                    checkRequired("autoJoinPolicy", autoJoinPolicy),
                    checkRequired("botName", botName),
                    checkRequired("createdAt", createdAt),
                    checkRequired("defaultAssistant", defaultAssistant),
                    checkRequired("defaultBargeIn", defaultBargeIn),
                    checkRequired("defaultRecording", defaultRecording),
                    checkRequired("defaultRecordingExport", defaultRecordingExport),
                    checkRequired("defaultSummarizeOnEnd", defaultSummarizeOnEnd),
                    checkRequired("defaultVoice", defaultVoice),
                    checkRequired("defaultWebhookUrl", defaultWebhookUrl),
                    checkRequired("platform", platform),
                    checkRequired("platformEmail", platformEmail),
                    checkRequired("status", status),
                    checkRequired("statusDetail", statusDetail),
                    checkRequired("updatedAt", updatedAt),
                    webhookSecret,
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
        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            id()
            autoJoinPolicy().validate()
            botName()
            createdAt()
            defaultAssistant().ifPresent { it.validate() }
            defaultBargeIn()
            defaultRecording()
            defaultRecordingExport().ifPresent { it.validate() }
            defaultSummarizeOnEnd()
            defaultVoice()
            defaultWebhookUrl()
            platform().validate()
            platformEmail()
            status().validate()
            statusDetail()
            updatedAt()
            webhookSecret()
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
                (autoJoinPolicy.asKnown().getOrNull()?.validity() ?: 0) +
                (if (botName.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (defaultAssistant.asKnown().getOrNull()?.validity() ?: 0) +
                (if (defaultBargeIn.asKnown().isPresent) 1 else 0) +
                (if (defaultRecording.asKnown().isPresent) 1 else 0) +
                (defaultRecordingExport.asKnown().getOrNull()?.validity() ?: 0) +
                (if (defaultSummarizeOnEnd.asKnown().isPresent) 1 else 0) +
                (if (defaultVoice.asKnown().isPresent) 1 else 0) +
                (if (defaultWebhookUrl.asKnown().isPresent) 1 else 0) +
                (platform.asKnown().getOrNull()?.validity() ?: 0) +
                (if (platformEmail.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (statusDetail.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (if (webhookSecret.asKnown().isPresent) 1 else 0)

        /**
         * all_meetings joins eligible events; external_organizer_excluded requires the connected
         * user to be the organizer; per_meeting requires an explicit opt-in.
         */
        class AutoJoinPolicy
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
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
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
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

        /** Calendar provider: Google Calendar or Microsoft Outlook. */
        class Platform @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val GOOGLE_CALENDAR = of("google_calendar")

                @JvmField val MICROSOFT_OUTLOOK = of("microsoft_outlook")

                @JvmStatic fun of(value: String) = Platform(JsonField.of(value))
            }

            /** An enum containing [Platform]'s known values. */
            enum class Known {
                GOOGLE_CALENDAR,
                MICROSOFT_OUTLOOK,
            }

            /**
             * An enum containing [Platform]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Platform] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                GOOGLE_CALENDAR,
                MICROSOFT_OUTLOOK,
                /**
                 * An enum member indicating that [Platform] was instantiated with an unknown value.
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
                    GOOGLE_CALENDAR -> Value.GOOGLE_CALENDAR
                    MICROSOFT_OUTLOOK -> Value.MICROSOFT_OUTLOOK
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
                    GOOGLE_CALENDAR -> Known.GOOGLE_CALENDAR
                    MICROSOFT_OUTLOOK -> Known.MICROSOFT_OUTLOOK
                    else -> throw TelnyxInvalidDataException("Unknown Platform: $value")
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
            fun validate(): Platform = apply {
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

                return other is Platform && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Connection status. */
        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val CONNECTED = of("connected")

                @JvmField val DISCONNECTED = of("disconnected")

                @JvmField val ERROR = of("error")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                CONNECTED,
                DISCONNECTED,
                ERROR,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CONNECTED,
                DISCONNECTED,
                ERROR,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
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
                    CONNECTED -> Value.CONNECTED
                    DISCONNECTED -> Value.DISCONNECTED
                    ERROR -> Value.ERROR
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
                    CONNECTED -> Known.CONNECTED
                    DISCONNECTED -> Known.DISCONNECTED
                    ERROR -> Known.ERROR
                    else -> throw TelnyxInvalidDataException("Unknown Status: $value")
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
            fun validate(): Status = apply {
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

                return other is Status && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                id == other.id &&
                autoJoinPolicy == other.autoJoinPolicy &&
                botName == other.botName &&
                createdAt == other.createdAt &&
                defaultAssistant == other.defaultAssistant &&
                defaultBargeIn == other.defaultBargeIn &&
                defaultRecording == other.defaultRecording &&
                defaultRecordingExport == other.defaultRecordingExport &&
                defaultSummarizeOnEnd == other.defaultSummarizeOnEnd &&
                defaultVoice == other.defaultVoice &&
                defaultWebhookUrl == other.defaultWebhookUrl &&
                platform == other.platform &&
                platformEmail == other.platformEmail &&
                status == other.status &&
                statusDetail == other.statusDetail &&
                updatedAt == other.updatedAt &&
                webhookSecret == other.webhookSecret &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                autoJoinPolicy,
                botName,
                createdAt,
                defaultAssistant,
                defaultBargeIn,
                defaultRecording,
                defaultRecordingExport,
                defaultSummarizeOnEnd,
                defaultVoice,
                defaultWebhookUrl,
                platform,
                platformEmail,
                status,
                statusDetail,
                updatedAt,
                webhookSecret,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, autoJoinPolicy=$autoJoinPolicy, botName=$botName, createdAt=$createdAt, defaultAssistant=$defaultAssistant, defaultBargeIn=$defaultBargeIn, defaultRecording=$defaultRecording, defaultRecordingExport=$defaultRecordingExport, defaultSummarizeOnEnd=$defaultSummarizeOnEnd, defaultVoice=$defaultVoice, defaultWebhookUrl=$defaultWebhookUrl, platform=$platform, platformEmail=$platformEmail, status=$status, statusDetail=$statusDetail, updatedAt=$updatedAt, webhookSecret=$webhookSecret, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CalendarConnectionUpdateResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CalendarConnectionUpdateResponse{data=$data, additionalProperties=$additionalProperties}"
}
