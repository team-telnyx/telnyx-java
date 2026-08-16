// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.meetingsessions

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

/**
 * Represents a meeting session. All serializer fields are present and required; nullable fields use
 * null when absent. No actor, provider-bot, idempotency, routing, key, or internal fields are
 * exposed.
 */
class MeetingSession
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val accountId: JsonField<String>,
    private val assistant: JsonField<Assistant>,
    private val assistantState: JsonField<AssistantState>,
    private val assistantStateChangedAt: JsonField<OffsetDateTime>,
    private val avatar: JsonField<Avatar>,
    private val avatarState: JsonField<AvatarState>,
    private val avatarStateChangedAt: JsonField<OffsetDateTime>,
    private val botName: JsonField<String>,
    private val config: JsonField<Config>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val endedAt: JsonField<OffsetDateTime>,
    private val failureReason: JsonField<String>,
    private val joinAt: JsonField<OffsetDateTime>,
    private val joinedAt: JsonField<OffsetDateTime>,
    private val meetingUrl: JsonField<String>,
    private val metadata: JsonField<Metadata>,
    private val platform: JsonField<Platform>,
    private val provider: JsonField<String>,
    private val recording: JsonField<Boolean>,
    private val status: JsonField<Status>,
    private val statusDetail: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val webhookUrl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_id") @ExcludeMissing accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("assistant")
        @ExcludeMissing
        assistant: JsonField<Assistant> = JsonMissing.of(),
        @JsonProperty("assistant_state")
        @ExcludeMissing
        assistantState: JsonField<AssistantState> = JsonMissing.of(),
        @JsonProperty("assistant_state_changed_at")
        @ExcludeMissing
        assistantStateChangedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("avatar") @ExcludeMissing avatar: JsonField<Avatar> = JsonMissing.of(),
        @JsonProperty("avatar_state")
        @ExcludeMissing
        avatarState: JsonField<AvatarState> = JsonMissing.of(),
        @JsonProperty("avatar_state_changed_at")
        @ExcludeMissing
        avatarStateChangedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("bot_name") @ExcludeMissing botName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("config") @ExcludeMissing config: JsonField<Config> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("ended_at")
        @ExcludeMissing
        endedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("failure_reason")
        @ExcludeMissing
        failureReason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("join_at")
        @ExcludeMissing
        joinAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("joined_at")
        @ExcludeMissing
        joinedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("meeting_url")
        @ExcludeMissing
        meetingUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("platform") @ExcludeMissing platform: JsonField<Platform> = JsonMissing.of(),
        @JsonProperty("provider") @ExcludeMissing provider: JsonField<String> = JsonMissing.of(),
        @JsonProperty("recording") @ExcludeMissing recording: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("status_detail")
        @ExcludeMissing
        statusDetail: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("webhook_url")
        @ExcludeMissing
        webhookUrl: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        accountId,
        assistant,
        assistantState,
        assistantStateChangedAt,
        avatar,
        avatarState,
        avatarStateChangedAt,
        botName,
        config,
        createdAt,
        endedAt,
        failureReason,
        joinAt,
        joinedAt,
        meetingUrl,
        metadata,
        platform,
        provider,
        recording,
        status,
        statusDetail,
        updatedAt,
        webhookUrl,
        mutableMapOf(),
    )

    /**
     * Unique identifier for the meeting session.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Identifier of the owning account.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountId(): String = accountId.getRequired("account_id")

    /**
     * Assistant configuration if an assistant is attached, otherwise null.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun assistant(): Optional<Assistant> = assistant.getOptional("assistant")

    /**
     * Current state of the assistant, or null if no assistant is attached.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun assistantState(): Optional<AssistantState> = assistantState.getOptional("assistant_state")

    /**
     * Timestamp of the last assistant state change, or null.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun assistantStateChangedAt(): Optional<OffsetDateTime> =
        assistantStateChangedAt.getOptional("assistant_state_changed_at")

    /**
     * Avatar configuration if an avatar is attached, otherwise null.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun avatar(): Optional<Avatar> = avatar.getOptional("avatar")

    /**
     * Current state of the avatar connection, or null if no avatar is attached.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun avatarState(): Optional<AvatarState> = avatarState.getOptional("avatar_state")

    /**
     * Timestamp of the last avatar state change, or null.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun avatarStateChangedAt(): Optional<OffsetDateTime> =
        avatarStateChangedAt.getOptional("avatar_state_changed_at")

    /**
     * Display name of the bot in the meeting.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun botName(): String = botName.getRequired("bot_name")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun config(): Config = config.getRequired("config")

    /**
     * Timestamp when the session was created.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * Timestamp when the session ended, or null if ongoing.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endedAt(): Optional<OffsetDateTime> = endedAt.getOptional("ended_at")

    /**
     * Human-readable failure reason if the session failed, or null.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun failureReason(): Optional<String> = failureReason.getOptional("failure_reason")

    /**
     * Scheduled join time, or null for immediate join.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun joinAt(): Optional<OffsetDateTime> = joinAt.getOptional("join_at")

    /**
     * Timestamp when the session first became `active`, or null if it never became active. This
     * remains positive admission evidence after terminal transitions.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun joinedAt(): Optional<OffsetDateTime> = joinedAt.getOptional("joined_at")

    /**
     * The meeting URL the bot joins.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun meetingUrl(): String = meetingUrl.getRequired("meeting_url")

    /**
     * Arbitrary key-value metadata attached to the session.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /**
     * Detected meeting platform.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun platform(): Platform = platform.getRequired("platform")

    /**
     * Provider handling the meeting session.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun provider(): String = provider.getRequired("provider")

    /**
     * Whether the session is being recorded.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun recording(): Boolean = recording.getRequired("recording")

    /**
     * Lifecycle status. `waiting_for_admission` means the bot reached the meeting lobby and may
     * require host approval. `active` means the bot entered the meeting/media path. `ended` alone
     * does not prove attendance; use non-null `joined_at` as positive evidence that the session
     * became active. `admission_denied` is reserved for an explicit provider denial, while
     * cancellation or another termination can end a never-admitted session as `ended`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * Additional human-readable detail about the status, or null.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun statusDetail(): Optional<String> = statusDetail.getOptional("status_detail")

    /**
     * Timestamp of the last update to the session.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * Webhook endpoint for session lifecycle callbacks, or null if not configured.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookUrl(): Optional<String> = webhookUrl.getOptional("webhook_url")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [accountId].
     *
     * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

    /**
     * Returns the raw JSON value of [assistant].
     *
     * Unlike [assistant], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("assistant") @ExcludeMissing fun _assistant(): JsonField<Assistant> = assistant

    /**
     * Returns the raw JSON value of [assistantState].
     *
     * Unlike [assistantState], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("assistant_state")
    @ExcludeMissing
    fun _assistantState(): JsonField<AssistantState> = assistantState

    /**
     * Returns the raw JSON value of [assistantStateChangedAt].
     *
     * Unlike [assistantStateChangedAt], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("assistant_state_changed_at")
    @ExcludeMissing
    fun _assistantStateChangedAt(): JsonField<OffsetDateTime> = assistantStateChangedAt

    /**
     * Returns the raw JSON value of [avatar].
     *
     * Unlike [avatar], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("avatar") @ExcludeMissing fun _avatar(): JsonField<Avatar> = avatar

    /**
     * Returns the raw JSON value of [avatarState].
     *
     * Unlike [avatarState], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("avatar_state")
    @ExcludeMissing
    fun _avatarState(): JsonField<AvatarState> = avatarState

    /**
     * Returns the raw JSON value of [avatarStateChangedAt].
     *
     * Unlike [avatarStateChangedAt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("avatar_state_changed_at")
    @ExcludeMissing
    fun _avatarStateChangedAt(): JsonField<OffsetDateTime> = avatarStateChangedAt

    /**
     * Returns the raw JSON value of [botName].
     *
     * Unlike [botName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bot_name") @ExcludeMissing fun _botName(): JsonField<String> = botName

    /**
     * Returns the raw JSON value of [config].
     *
     * Unlike [config], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("config") @ExcludeMissing fun _config(): JsonField<Config> = config

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [endedAt].
     *
     * Unlike [endedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ended_at") @ExcludeMissing fun _endedAt(): JsonField<OffsetDateTime> = endedAt

    /**
     * Returns the raw JSON value of [failureReason].
     *
     * Unlike [failureReason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("failure_reason")
    @ExcludeMissing
    fun _failureReason(): JsonField<String> = failureReason

    /**
     * Returns the raw JSON value of [joinAt].
     *
     * Unlike [joinAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("join_at") @ExcludeMissing fun _joinAt(): JsonField<OffsetDateTime> = joinAt

    /**
     * Returns the raw JSON value of [joinedAt].
     *
     * Unlike [joinedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("joined_at") @ExcludeMissing fun _joinedAt(): JsonField<OffsetDateTime> = joinedAt

    /**
     * Returns the raw JSON value of [meetingUrl].
     *
     * Unlike [meetingUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("meeting_url") @ExcludeMissing fun _meetingUrl(): JsonField<String> = meetingUrl

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [platform].
     *
     * Unlike [platform], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("platform") @ExcludeMissing fun _platform(): JsonField<Platform> = platform

    /**
     * Returns the raw JSON value of [provider].
     *
     * Unlike [provider], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<String> = provider

    /**
     * Returns the raw JSON value of [recording].
     *
     * Unlike [recording], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("recording") @ExcludeMissing fun _recording(): JsonField<Boolean> = recording

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [statusDetail].
     *
     * Unlike [statusDetail], this method doesn't throw if the JSON field has an unexpected type.
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
     * Returns the raw JSON value of [webhookUrl].
     *
     * Unlike [webhookUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("webhook_url") @ExcludeMissing fun _webhookUrl(): JsonField<String> = webhookUrl

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
         * Returns a mutable builder for constructing an instance of [MeetingSession].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .accountId()
         * .assistant()
         * .assistantState()
         * .assistantStateChangedAt()
         * .avatar()
         * .avatarState()
         * .avatarStateChangedAt()
         * .botName()
         * .config()
         * .createdAt()
         * .endedAt()
         * .failureReason()
         * .joinAt()
         * .joinedAt()
         * .meetingUrl()
         * .metadata()
         * .platform()
         * .provider()
         * .recording()
         * .status()
         * .statusDetail()
         * .updatedAt()
         * .webhookUrl()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MeetingSession]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var accountId: JsonField<String>? = null
        private var assistant: JsonField<Assistant>? = null
        private var assistantState: JsonField<AssistantState>? = null
        private var assistantStateChangedAt: JsonField<OffsetDateTime>? = null
        private var avatar: JsonField<Avatar>? = null
        private var avatarState: JsonField<AvatarState>? = null
        private var avatarStateChangedAt: JsonField<OffsetDateTime>? = null
        private var botName: JsonField<String>? = null
        private var config: JsonField<Config>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var endedAt: JsonField<OffsetDateTime>? = null
        private var failureReason: JsonField<String>? = null
        private var joinAt: JsonField<OffsetDateTime>? = null
        private var joinedAt: JsonField<OffsetDateTime>? = null
        private var meetingUrl: JsonField<String>? = null
        private var metadata: JsonField<Metadata>? = null
        private var platform: JsonField<Platform>? = null
        private var provider: JsonField<String>? = null
        private var recording: JsonField<Boolean>? = null
        private var status: JsonField<Status>? = null
        private var statusDetail: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var webhookUrl: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(meetingSession: MeetingSession) = apply {
            id = meetingSession.id
            accountId = meetingSession.accountId
            assistant = meetingSession.assistant
            assistantState = meetingSession.assistantState
            assistantStateChangedAt = meetingSession.assistantStateChangedAt
            avatar = meetingSession.avatar
            avatarState = meetingSession.avatarState
            avatarStateChangedAt = meetingSession.avatarStateChangedAt
            botName = meetingSession.botName
            config = meetingSession.config
            createdAt = meetingSession.createdAt
            endedAt = meetingSession.endedAt
            failureReason = meetingSession.failureReason
            joinAt = meetingSession.joinAt
            joinedAt = meetingSession.joinedAt
            meetingUrl = meetingSession.meetingUrl
            metadata = meetingSession.metadata
            platform = meetingSession.platform
            provider = meetingSession.provider
            recording = meetingSession.recording
            status = meetingSession.status
            statusDetail = meetingSession.statusDetail
            updatedAt = meetingSession.updatedAt
            webhookUrl = meetingSession.webhookUrl
            additionalProperties = meetingSession.additionalProperties.toMutableMap()
        }

        /** Unique identifier for the meeting session. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Identifier of the owning account. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /** Assistant configuration if an assistant is attached, otherwise null. */
        fun assistant(assistant: Assistant?) = assistant(JsonField.ofNullable(assistant))

        /** Alias for calling [Builder.assistant] with `assistant.orElse(null)`. */
        fun assistant(assistant: Optional<Assistant>) = assistant(assistant.getOrNull())

        /**
         * Sets [Builder.assistant] to an arbitrary JSON value.
         *
         * You should usually call [Builder.assistant] with a well-typed [Assistant] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun assistant(assistant: JsonField<Assistant>) = apply { this.assistant = assistant }

        /** Current state of the assistant, or null if no assistant is attached. */
        fun assistantState(assistantState: AssistantState?) =
            assistantState(JsonField.ofNullable(assistantState))

        /** Alias for calling [Builder.assistantState] with `assistantState.orElse(null)`. */
        fun assistantState(assistantState: Optional<AssistantState>) =
            assistantState(assistantState.getOrNull())

        /**
         * Sets [Builder.assistantState] to an arbitrary JSON value.
         *
         * You should usually call [Builder.assistantState] with a well-typed [AssistantState] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun assistantState(assistantState: JsonField<AssistantState>) = apply {
            this.assistantState = assistantState
        }

        /** Timestamp of the last assistant state change, or null. */
        fun assistantStateChangedAt(assistantStateChangedAt: OffsetDateTime?) =
            assistantStateChangedAt(JsonField.ofNullable(assistantStateChangedAt))

        /**
         * Alias for calling [Builder.assistantStateChangedAt] with
         * `assistantStateChangedAt.orElse(null)`.
         */
        fun assistantStateChangedAt(assistantStateChangedAt: Optional<OffsetDateTime>) =
            assistantStateChangedAt(assistantStateChangedAt.getOrNull())

        /**
         * Sets [Builder.assistantStateChangedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.assistantStateChangedAt] with a well-typed
         * [OffsetDateTime] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun assistantStateChangedAt(assistantStateChangedAt: JsonField<OffsetDateTime>) = apply {
            this.assistantStateChangedAt = assistantStateChangedAt
        }

        /** Avatar configuration if an avatar is attached, otherwise null. */
        fun avatar(avatar: Avatar?) = avatar(JsonField.ofNullable(avatar))

        /** Alias for calling [Builder.avatar] with `avatar.orElse(null)`. */
        fun avatar(avatar: Optional<Avatar>) = avatar(avatar.getOrNull())

        /**
         * Sets [Builder.avatar] to an arbitrary JSON value.
         *
         * You should usually call [Builder.avatar] with a well-typed [Avatar] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun avatar(avatar: JsonField<Avatar>) = apply { this.avatar = avatar }

        /** Current state of the avatar connection, or null if no avatar is attached. */
        fun avatarState(avatarState: AvatarState?) = avatarState(JsonField.ofNullable(avatarState))

        /** Alias for calling [Builder.avatarState] with `avatarState.orElse(null)`. */
        fun avatarState(avatarState: Optional<AvatarState>) = avatarState(avatarState.getOrNull())

        /**
         * Sets [Builder.avatarState] to an arbitrary JSON value.
         *
         * You should usually call [Builder.avatarState] with a well-typed [AvatarState] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun avatarState(avatarState: JsonField<AvatarState>) = apply {
            this.avatarState = avatarState
        }

        /** Timestamp of the last avatar state change, or null. */
        fun avatarStateChangedAt(avatarStateChangedAt: OffsetDateTime?) =
            avatarStateChangedAt(JsonField.ofNullable(avatarStateChangedAt))

        /**
         * Alias for calling [Builder.avatarStateChangedAt] with
         * `avatarStateChangedAt.orElse(null)`.
         */
        fun avatarStateChangedAt(avatarStateChangedAt: Optional<OffsetDateTime>) =
            avatarStateChangedAt(avatarStateChangedAt.getOrNull())

        /**
         * Sets [Builder.avatarStateChangedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.avatarStateChangedAt] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun avatarStateChangedAt(avatarStateChangedAt: JsonField<OffsetDateTime>) = apply {
            this.avatarStateChangedAt = avatarStateChangedAt
        }

        /** Display name of the bot in the meeting. */
        fun botName(botName: String) = botName(JsonField.of(botName))

        /**
         * Sets [Builder.botName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.botName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun botName(botName: JsonField<String>) = apply { this.botName = botName }

        fun config(config: Config) = config(JsonField.of(config))

        /**
         * Sets [Builder.config] to an arbitrary JSON value.
         *
         * You should usually call [Builder.config] with a well-typed [Config] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun config(config: JsonField<Config>) = apply { this.config = config }

        /** Timestamp when the session was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Timestamp when the session ended, or null if ongoing. */
        fun endedAt(endedAt: OffsetDateTime?) = endedAt(JsonField.ofNullable(endedAt))

        /** Alias for calling [Builder.endedAt] with `endedAt.orElse(null)`. */
        fun endedAt(endedAt: Optional<OffsetDateTime>) = endedAt(endedAt.getOrNull())

        /**
         * Sets [Builder.endedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endedAt(endedAt: JsonField<OffsetDateTime>) = apply { this.endedAt = endedAt }

        /** Human-readable failure reason if the session failed, or null. */
        fun failureReason(failureReason: String?) =
            failureReason(JsonField.ofNullable(failureReason))

        /** Alias for calling [Builder.failureReason] with `failureReason.orElse(null)`. */
        fun failureReason(failureReason: Optional<String>) =
            failureReason(failureReason.getOrNull())

        /**
         * Sets [Builder.failureReason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.failureReason] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun failureReason(failureReason: JsonField<String>) = apply {
            this.failureReason = failureReason
        }

        /** Scheduled join time, or null for immediate join. */
        fun joinAt(joinAt: OffsetDateTime?) = joinAt(JsonField.ofNullable(joinAt))

        /** Alias for calling [Builder.joinAt] with `joinAt.orElse(null)`. */
        fun joinAt(joinAt: Optional<OffsetDateTime>) = joinAt(joinAt.getOrNull())

        /**
         * Sets [Builder.joinAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.joinAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun joinAt(joinAt: JsonField<OffsetDateTime>) = apply { this.joinAt = joinAt }

        /**
         * Timestamp when the session first became `active`, or null if it never became active. This
         * remains positive admission evidence after terminal transitions.
         */
        fun joinedAt(joinedAt: OffsetDateTime?) = joinedAt(JsonField.ofNullable(joinedAt))

        /** Alias for calling [Builder.joinedAt] with `joinedAt.orElse(null)`. */
        fun joinedAt(joinedAt: Optional<OffsetDateTime>) = joinedAt(joinedAt.getOrNull())

        /**
         * Sets [Builder.joinedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.joinedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun joinedAt(joinedAt: JsonField<OffsetDateTime>) = apply { this.joinedAt = joinedAt }

        /** The meeting URL the bot joins. */
        fun meetingUrl(meetingUrl: String) = meetingUrl(JsonField.of(meetingUrl))

        /**
         * Sets [Builder.meetingUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meetingUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun meetingUrl(meetingUrl: JsonField<String>) = apply { this.meetingUrl = meetingUrl }

        /** Arbitrary key-value metadata attached to the session. */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /** Detected meeting platform. */
        fun platform(platform: Platform) = platform(JsonField.of(platform))

        /**
         * Sets [Builder.platform] to an arbitrary JSON value.
         *
         * You should usually call [Builder.platform] with a well-typed [Platform] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun platform(platform: JsonField<Platform>) = apply { this.platform = platform }

        /** Provider handling the meeting session. */
        fun provider(provider: String) = provider(JsonField.of(provider))

        /**
         * Sets [Builder.provider] to an arbitrary JSON value.
         *
         * You should usually call [Builder.provider] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun provider(provider: JsonField<String>) = apply { this.provider = provider }

        /** Whether the session is being recorded. */
        fun recording(recording: Boolean) = recording(JsonField.of(recording))

        /**
         * Sets [Builder.recording] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recording] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recording(recording: JsonField<Boolean>) = apply { this.recording = recording }

        /**
         * Lifecycle status. `waiting_for_admission` means the bot reached the meeting lobby and may
         * require host approval. `active` means the bot entered the meeting/media path. `ended`
         * alone does not prove attendance; use non-null `joined_at` as positive evidence that the
         * session became active. `admission_denied` is reserved for an explicit provider denial,
         * while cancellation or another termination can end a never-admitted session as `ended`.
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** Additional human-readable detail about the status, or null. */
        fun statusDetail(statusDetail: String?) = statusDetail(JsonField.ofNullable(statusDetail))

        /** Alias for calling [Builder.statusDetail] with `statusDetail.orElse(null)`. */
        fun statusDetail(statusDetail: Optional<String>) = statusDetail(statusDetail.getOrNull())

        /**
         * Sets [Builder.statusDetail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statusDetail] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun statusDetail(statusDetail: JsonField<String>) = apply {
            this.statusDetail = statusDetail
        }

        /** Timestamp of the last update to the session. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** Webhook endpoint for session lifecycle callbacks, or null if not configured. */
        fun webhookUrl(webhookUrl: String?) = webhookUrl(JsonField.ofNullable(webhookUrl))

        /** Alias for calling [Builder.webhookUrl] with `webhookUrl.orElse(null)`. */
        fun webhookUrl(webhookUrl: Optional<String>) = webhookUrl(webhookUrl.getOrNull())

        /**
         * Sets [Builder.webhookUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun webhookUrl(webhookUrl: JsonField<String>) = apply { this.webhookUrl = webhookUrl }

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
         * Returns an immutable instance of [MeetingSession].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .accountId()
         * .assistant()
         * .assistantState()
         * .assistantStateChangedAt()
         * .avatar()
         * .avatarState()
         * .avatarStateChangedAt()
         * .botName()
         * .config()
         * .createdAt()
         * .endedAt()
         * .failureReason()
         * .joinAt()
         * .joinedAt()
         * .meetingUrl()
         * .metadata()
         * .platform()
         * .provider()
         * .recording()
         * .status()
         * .statusDetail()
         * .updatedAt()
         * .webhookUrl()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MeetingSession =
            MeetingSession(
                checkRequired("id", id),
                checkRequired("accountId", accountId),
                checkRequired("assistant", assistant),
                checkRequired("assistantState", assistantState),
                checkRequired("assistantStateChangedAt", assistantStateChangedAt),
                checkRequired("avatar", avatar),
                checkRequired("avatarState", avatarState),
                checkRequired("avatarStateChangedAt", avatarStateChangedAt),
                checkRequired("botName", botName),
                checkRequired("config", config),
                checkRequired("createdAt", createdAt),
                checkRequired("endedAt", endedAt),
                checkRequired("failureReason", failureReason),
                checkRequired("joinAt", joinAt),
                checkRequired("joinedAt", joinedAt),
                checkRequired("meetingUrl", meetingUrl),
                checkRequired("metadata", metadata),
                checkRequired("platform", platform),
                checkRequired("provider", provider),
                checkRequired("recording", recording),
                checkRequired("status", status),
                checkRequired("statusDetail", statusDetail),
                checkRequired("updatedAt", updatedAt),
                checkRequired("webhookUrl", webhookUrl),
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
    fun validate(): MeetingSession = apply {
        if (validated) {
            return@apply
        }

        id()
        accountId()
        assistant().ifPresent { it.validate() }
        assistantState().ifPresent { it.validate() }
        assistantStateChangedAt()
        avatar().ifPresent { it.validate() }
        avatarState().ifPresent { it.validate() }
        avatarStateChangedAt()
        botName()
        config().validate()
        createdAt()
        endedAt()
        failureReason()
        joinAt()
        joinedAt()
        meetingUrl()
        metadata().validate()
        platform().validate()
        provider()
        recording()
        status().validate()
        statusDetail()
        updatedAt()
        webhookUrl()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (accountId.asKnown().isPresent) 1 else 0) +
            (assistant.asKnown().getOrNull()?.validity() ?: 0) +
            (assistantState.asKnown().getOrNull()?.validity() ?: 0) +
            (if (assistantStateChangedAt.asKnown().isPresent) 1 else 0) +
            (avatar.asKnown().getOrNull()?.validity() ?: 0) +
            (avatarState.asKnown().getOrNull()?.validity() ?: 0) +
            (if (avatarStateChangedAt.asKnown().isPresent) 1 else 0) +
            (if (botName.asKnown().isPresent) 1 else 0) +
            (config.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (endedAt.asKnown().isPresent) 1 else 0) +
            (if (failureReason.asKnown().isPresent) 1 else 0) +
            (if (joinAt.asKnown().isPresent) 1 else 0) +
            (if (joinedAt.asKnown().isPresent) 1 else 0) +
            (if (meetingUrl.asKnown().isPresent) 1 else 0) +
            (metadata.asKnown().getOrNull()?.validity() ?: 0) +
            (platform.asKnown().getOrNull()?.validity() ?: 0) +
            (if (provider.asKnown().isPresent) 1 else 0) +
            (if (recording.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (statusDetail.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (webhookUrl.asKnown().isPresent) 1 else 0)

    /** Assistant configuration if an assistant is attached, otherwise null. */
    class Assistant
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val audioGate: JsonField<AudioGate>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("audio_gate")
            @ExcludeMissing
            audioGate: JsonField<AudioGate> = JsonMissing.of(),
        ) : this(id, audioGate, mutableMapOf())

        /**
         * Identifier of the assistant.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Audio gating strategy for the assistant call leg.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun audioGate(): AudioGate = audioGate.getRequired("audio_gate")

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
             * Returns a mutable builder for constructing an instance of [Assistant].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .audioGate()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Assistant]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var audioGate: JsonField<AudioGate>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(assistant: Assistant) = apply {
                id = assistant.id
                audioGate = assistant.audioGate
                additionalProperties = assistant.additionalProperties.toMutableMap()
            }

            /** Identifier of the assistant. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Audio gating strategy for the assistant call leg. */
            fun audioGate(audioGate: AudioGate) = audioGate(JsonField.of(audioGate))

            /**
             * Sets [Builder.audioGate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.audioGate] with a well-typed [AudioGate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun audioGate(audioGate: JsonField<AudioGate>) = apply { this.audioGate = audioGate }

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
             * Returns an immutable instance of [Assistant].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .audioGate()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Assistant =
                Assistant(
                    checkRequired("id", id),
                    checkRequired("audioGate", audioGate),
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
        fun validate(): Assistant = apply {
            if (validated) {
                return@apply
            }

            id()
            audioGate().validate()
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
                (audioGate.asKnown().getOrNull()?.validity() ?: 0)

        /** Audio gating strategy for the assistant call leg. */
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

                @JvmField val NONE = of("none")

                @JvmField val HALF_DUPLEX = of("half_duplex")

                @JvmStatic fun of(value: String) = AudioGate(JsonField.of(value))
            }

            /** An enum containing [AudioGate]'s known values. */
            enum class Known {
                NONE,
                HALF_DUPLEX,
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
                NONE,
                HALF_DUPLEX,
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
                    NONE -> Value.NONE
                    HALF_DUPLEX -> Value.HALF_DUPLEX
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
                    NONE -> Known.NONE
                    HALF_DUPLEX -> Known.HALF_DUPLEX
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Assistant &&
                id == other.id &&
                audioGate == other.audioGate &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(id, audioGate, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Assistant{id=$id, audioGate=$audioGate, additionalProperties=$additionalProperties}"
    }

    /** Current state of the assistant, or null if no assistant is attached. */
    class AssistantState @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val STARTING = of("starting")

            @JvmField val CONNECTED = of("connected")

            @JvmField val FAILED = of("failed")

            @JvmField val ENDED = of("ended")

            @JvmStatic fun of(value: String) = AssistantState(JsonField.of(value))
        }

        /** An enum containing [AssistantState]'s known values. */
        enum class Known {
            STARTING,
            CONNECTED,
            FAILED,
            ENDED,
        }

        /**
         * An enum containing [AssistantState]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AssistantState] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            STARTING,
            CONNECTED,
            FAILED,
            ENDED,
            /**
             * An enum member indicating that [AssistantState] was instantiated with an unknown
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
                STARTING -> Value.STARTING
                CONNECTED -> Value.CONNECTED
                FAILED -> Value.FAILED
                ENDED -> Value.ENDED
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
                STARTING -> Known.STARTING
                CONNECTED -> Known.CONNECTED
                FAILED -> Known.FAILED
                ENDED -> Known.ENDED
                else -> throw TelnyxInvalidDataException("Unknown AssistantState: $value")
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
        fun validate(): AssistantState = apply {
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

            return other is AssistantState && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Avatar configuration if an avatar is attached, otherwise null. */
    class Avatar
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val avatarId: JsonField<String>,
        private val provider: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("avatar_id")
            @ExcludeMissing
            avatarId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("provider") @ExcludeMissing provider: JsonValue = JsonMissing.of(),
        ) : this(avatarId, provider, mutableMapOf())

        /**
         * Identifier of the avatar.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun avatarId(): String = avatarId.getRequired("avatar_id")

        /**
         * Avatar provider identifier.
         *
         * Expected to always return the following:
         * ```java
         * JsonValue.from("anam")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonValue = provider

        /**
         * Returns the raw JSON value of [avatarId].
         *
         * Unlike [avatarId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("avatar_id") @ExcludeMissing fun _avatarId(): JsonField<String> = avatarId

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
             * Returns a mutable builder for constructing an instance of [Avatar].
             *
             * The following fields are required:
             * ```java
             * .avatarId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Avatar]. */
        class Builder internal constructor() {

            private var avatarId: JsonField<String>? = null
            private var provider: JsonValue = JsonValue.from("anam")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(avatar: Avatar) = apply {
                avatarId = avatar.avatarId
                provider = avatar.provider
                additionalProperties = avatar.additionalProperties.toMutableMap()
            }

            /** Identifier of the avatar. */
            fun avatarId(avatarId: String) = avatarId(JsonField.of(avatarId))

            /**
             * Sets [Builder.avatarId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.avatarId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun avatarId(avatarId: JsonField<String>) = apply { this.avatarId = avatarId }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```java
             * JsonValue.from("anam")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun provider(provider: JsonValue) = apply { this.provider = provider }

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
             * Returns an immutable instance of [Avatar].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .avatarId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Avatar =
                Avatar(
                    checkRequired("avatarId", avatarId),
                    provider,
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
        fun validate(): Avatar = apply {
            if (validated) {
                return@apply
            }

            avatarId()
            _provider().let {
                if (it != JsonValue.from("anam")) {
                    throw TelnyxInvalidDataException("'provider' is invalid, received $it")
                }
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
            (if (avatarId.asKnown().isPresent) 1 else 0) +
                provider.let { if (it == JsonValue.from("anam")) 1 else 0 }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Avatar &&
                avatarId == other.avatarId &&
                provider == other.provider &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(avatarId, provider, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Avatar{avatarId=$avatarId, provider=$provider, additionalProperties=$additionalProperties}"
    }

    /** Current state of the avatar connection, or null if no avatar is attached. */
    class AvatarState @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val STARTING = of("starting")

            @JvmField val CONNECTED = of("connected")

            @JvmField val DEGRADED = of("degraded")

            @JvmField val DISCONNECTED = of("disconnected")

            @JvmStatic fun of(value: String) = AvatarState(JsonField.of(value))
        }

        /** An enum containing [AvatarState]'s known values. */
        enum class Known {
            STARTING,
            CONNECTED,
            DEGRADED,
            DISCONNECTED,
        }

        /**
         * An enum containing [AvatarState]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AvatarState] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            STARTING,
            CONNECTED,
            DEGRADED,
            DISCONNECTED,
            /**
             * An enum member indicating that [AvatarState] was instantiated with an unknown value.
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
                STARTING -> Value.STARTING
                CONNECTED -> Value.CONNECTED
                DEGRADED -> Value.DEGRADED
                DISCONNECTED -> Value.DISCONNECTED
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
                STARTING -> Known.STARTING
                CONNECTED -> Known.CONNECTED
                DEGRADED -> Known.DEGRADED
                DISCONNECTED -> Known.DISCONNECTED
                else -> throw TelnyxInvalidDataException("Unknown AvatarState: $value")
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
        fun validate(): AvatarState = apply {
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

            return other is AvatarState && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Config
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val bargeIn: JsonField<Boolean>,
        private val speakOnEnter: JsonField<String>,
        private val summarizeOnEnd: JsonField<Boolean>,
        private val voice: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("barge_in")
            @ExcludeMissing
            bargeIn: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("speak_on_enter")
            @ExcludeMissing
            speakOnEnter: JsonField<String> = JsonMissing.of(),
            @JsonProperty("summarize_on_end")
            @ExcludeMissing
            summarizeOnEnd: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("voice") @ExcludeMissing voice: JsonField<String> = JsonMissing.of(),
        ) : this(bargeIn, speakOnEnter, summarizeOnEnd, voice, mutableMapOf())

        /**
         * When enabled, a human participant `speech_on` event interrupts and stops the current bot
         * audio; it does not bypass admission or initiate speech. Assistant sessions reject
         * `barge_in: true`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun bargeIn(): Boolean = bargeIn.getRequired("barge_in")

        /**
         * Text spoken on meeting entry, or null if not set.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun speakOnEnter(): Optional<String> = speakOnEnter.getOptional("speak_on_enter")

        /**
         * Whether a summary artifact is generated on session end.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun summarizeOnEnd(): Boolean = summarizeOnEnd.getRequired("summarize_on_end")

        /**
         * Configured voice identifier, or null if not set.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun voice(): Optional<String> = voice.getOptional("voice")

        /**
         * Returns the raw JSON value of [bargeIn].
         *
         * Unlike [bargeIn], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("barge_in") @ExcludeMissing fun _bargeIn(): JsonField<Boolean> = bargeIn

        /**
         * Returns the raw JSON value of [speakOnEnter].
         *
         * Unlike [speakOnEnter], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("speak_on_enter")
        @ExcludeMissing
        fun _speakOnEnter(): JsonField<String> = speakOnEnter

        /**
         * Returns the raw JSON value of [summarizeOnEnd].
         *
         * Unlike [summarizeOnEnd], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("summarize_on_end")
        @ExcludeMissing
        fun _summarizeOnEnd(): JsonField<Boolean> = summarizeOnEnd

        /**
         * Returns the raw JSON value of [voice].
         *
         * Unlike [voice], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("voice") @ExcludeMissing fun _voice(): JsonField<String> = voice

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
             * Returns a mutable builder for constructing an instance of [Config].
             *
             * The following fields are required:
             * ```java
             * .bargeIn()
             * .speakOnEnter()
             * .summarizeOnEnd()
             * .voice()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Config]. */
        class Builder internal constructor() {

            private var bargeIn: JsonField<Boolean>? = null
            private var speakOnEnter: JsonField<String>? = null
            private var summarizeOnEnd: JsonField<Boolean>? = null
            private var voice: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(config: Config) = apply {
                bargeIn = config.bargeIn
                speakOnEnter = config.speakOnEnter
                summarizeOnEnd = config.summarizeOnEnd
                voice = config.voice
                additionalProperties = config.additionalProperties.toMutableMap()
            }

            /**
             * When enabled, a human participant `speech_on` event interrupts and stops the current
             * bot audio; it does not bypass admission or initiate speech. Assistant sessions reject
             * `barge_in: true`.
             */
            fun bargeIn(bargeIn: Boolean) = bargeIn(JsonField.of(bargeIn))

            /**
             * Sets [Builder.bargeIn] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bargeIn] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bargeIn(bargeIn: JsonField<Boolean>) = apply { this.bargeIn = bargeIn }

            /** Text spoken on meeting entry, or null if not set. */
            fun speakOnEnter(speakOnEnter: String?) =
                speakOnEnter(JsonField.ofNullable(speakOnEnter))

            /** Alias for calling [Builder.speakOnEnter] with `speakOnEnter.orElse(null)`. */
            fun speakOnEnter(speakOnEnter: Optional<String>) =
                speakOnEnter(speakOnEnter.getOrNull())

            /**
             * Sets [Builder.speakOnEnter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.speakOnEnter] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun speakOnEnter(speakOnEnter: JsonField<String>) = apply {
                this.speakOnEnter = speakOnEnter
            }

            /** Whether a summary artifact is generated on session end. */
            fun summarizeOnEnd(summarizeOnEnd: Boolean) =
                summarizeOnEnd(JsonField.of(summarizeOnEnd))

            /**
             * Sets [Builder.summarizeOnEnd] to an arbitrary JSON value.
             *
             * You should usually call [Builder.summarizeOnEnd] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun summarizeOnEnd(summarizeOnEnd: JsonField<Boolean>) = apply {
                this.summarizeOnEnd = summarizeOnEnd
            }

            /** Configured voice identifier, or null if not set. */
            fun voice(voice: String?) = voice(JsonField.ofNullable(voice))

            /** Alias for calling [Builder.voice] with `voice.orElse(null)`. */
            fun voice(voice: Optional<String>) = voice(voice.getOrNull())

            /**
             * Sets [Builder.voice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.voice] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun voice(voice: JsonField<String>) = apply { this.voice = voice }

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
             * Returns an immutable instance of [Config].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .bargeIn()
             * .speakOnEnter()
             * .summarizeOnEnd()
             * .voice()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Config =
                Config(
                    checkRequired("bargeIn", bargeIn),
                    checkRequired("speakOnEnter", speakOnEnter),
                    checkRequired("summarizeOnEnd", summarizeOnEnd),
                    checkRequired("voice", voice),
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
        fun validate(): Config = apply {
            if (validated) {
                return@apply
            }

            bargeIn()
            speakOnEnter()
            summarizeOnEnd()
            voice()
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
            (if (bargeIn.asKnown().isPresent) 1 else 0) +
                (if (speakOnEnter.asKnown().isPresent) 1 else 0) +
                (if (summarizeOnEnd.asKnown().isPresent) 1 else 0) +
                (if (voice.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Config &&
                bargeIn == other.bargeIn &&
                speakOnEnter == other.speakOnEnter &&
                summarizeOnEnd == other.summarizeOnEnd &&
                voice == other.voice &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(bargeIn, speakOnEnter, summarizeOnEnd, voice, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Config{bargeIn=$bargeIn, speakOnEnter=$speakOnEnter, summarizeOnEnd=$summarizeOnEnd, voice=$voice, additionalProperties=$additionalProperties}"
    }

    /** Arbitrary key-value metadata attached to the session. */
    class Metadata
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

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
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
        fun validate(): Metadata = apply {
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

            return other is Metadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    /** Detected meeting platform. */
    class Platform @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ZOOM = of("zoom")

            @JvmField val GOOGLE_MEET = of("google_meet")

            @JvmField val TEAMS = of("teams")

            @JvmField val WEBEX = of("webex")

            @JvmField val UNKNOWN = of("unknown")

            @JvmStatic fun of(value: String) = Platform(JsonField.of(value))
        }

        /** An enum containing [Platform]'s known values. */
        enum class Known {
            ZOOM,
            GOOGLE_MEET,
            TEAMS,
            WEBEX,
            UNKNOWN,
        }

        /**
         * An enum containing [Platform]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Platform] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ZOOM,
            GOOGLE_MEET,
            TEAMS,
            WEBEX,
            UNKNOWN,
            /** An enum member indicating that [Platform] was instantiated with an unknown value. */
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
                ZOOM -> Value.ZOOM
                GOOGLE_MEET -> Value.GOOGLE_MEET
                TEAMS -> Value.TEAMS
                WEBEX -> Value.WEBEX
                UNKNOWN -> Value.UNKNOWN
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
                ZOOM -> Known.ZOOM
                GOOGLE_MEET -> Known.GOOGLE_MEET
                TEAMS -> Known.TEAMS
                WEBEX -> Known.WEBEX
                UNKNOWN -> Known.UNKNOWN
                else -> throw TelnyxInvalidDataException("Unknown Platform: $value")
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

    /**
     * Lifecycle status. `waiting_for_admission` means the bot reached the meeting lobby and may
     * require host approval. `active` means the bot entered the meeting/media path. `ended` alone
     * does not prove attendance; use non-null `joined_at` as positive evidence that the session
     * became active. `admission_denied` is reserved for an explicit provider denial, while
     * cancellation or another termination can end a never-admitted session as `ended`.
     */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val SCHEDULED = of("scheduled")

            @JvmField val JOINING = of("joining")

            @JvmField val WAITING_FOR_ADMISSION = of("waiting_for_admission")

            @JvmField val ACTIVE = of("active")

            @JvmField val LEAVING = of("leaving")

            @JvmField val ENDED = of("ended")

            @JvmField val FAILED = of("failed")

            @JvmField val ADMISSION_DENIED = of("admission_denied")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            SCHEDULED,
            JOINING,
            WAITING_FOR_ADMISSION,
            ACTIVE,
            LEAVING,
            ENDED,
            FAILED,
            ADMISSION_DENIED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SCHEDULED,
            JOINING,
            WAITING_FOR_ADMISSION,
            ACTIVE,
            LEAVING,
            ENDED,
            FAILED,
            ADMISSION_DENIED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                SCHEDULED -> Value.SCHEDULED
                JOINING -> Value.JOINING
                WAITING_FOR_ADMISSION -> Value.WAITING_FOR_ADMISSION
                ACTIVE -> Value.ACTIVE
                LEAVING -> Value.LEAVING
                ENDED -> Value.ENDED
                FAILED -> Value.FAILED
                ADMISSION_DENIED -> Value.ADMISSION_DENIED
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
                SCHEDULED -> Known.SCHEDULED
                JOINING -> Known.JOINING
                WAITING_FOR_ADMISSION -> Known.WAITING_FOR_ADMISSION
                ACTIVE -> Known.ACTIVE
                LEAVING -> Known.LEAVING
                ENDED -> Known.ENDED
                FAILED -> Known.FAILED
                ADMISSION_DENIED -> Known.ADMISSION_DENIED
                else -> throw TelnyxInvalidDataException("Unknown Status: $value")
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

        return other is MeetingSession &&
            id == other.id &&
            accountId == other.accountId &&
            assistant == other.assistant &&
            assistantState == other.assistantState &&
            assistantStateChangedAt == other.assistantStateChangedAt &&
            avatar == other.avatar &&
            avatarState == other.avatarState &&
            avatarStateChangedAt == other.avatarStateChangedAt &&
            botName == other.botName &&
            config == other.config &&
            createdAt == other.createdAt &&
            endedAt == other.endedAt &&
            failureReason == other.failureReason &&
            joinAt == other.joinAt &&
            joinedAt == other.joinedAt &&
            meetingUrl == other.meetingUrl &&
            metadata == other.metadata &&
            platform == other.platform &&
            provider == other.provider &&
            recording == other.recording &&
            status == other.status &&
            statusDetail == other.statusDetail &&
            updatedAt == other.updatedAt &&
            webhookUrl == other.webhookUrl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            accountId,
            assistant,
            assistantState,
            assistantStateChangedAt,
            avatar,
            avatarState,
            avatarStateChangedAt,
            botName,
            config,
            createdAt,
            endedAt,
            failureReason,
            joinAt,
            joinedAt,
            meetingUrl,
            metadata,
            platform,
            provider,
            recording,
            status,
            statusDetail,
            updatedAt,
            webhookUrl,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MeetingSession{id=$id, accountId=$accountId, assistant=$assistant, assistantState=$assistantState, assistantStateChangedAt=$assistantStateChangedAt, avatar=$avatar, avatarState=$avatarState, avatarStateChangedAt=$avatarStateChangedAt, botName=$botName, config=$config, createdAt=$createdAt, endedAt=$endedAt, failureReason=$failureReason, joinAt=$joinAt, joinedAt=$joinedAt, meetingUrl=$meetingUrl, metadata=$metadata, platform=$platform, provider=$provider, recording=$recording, status=$status, statusDetail=$statusDetail, updatedAt=$updatedAt, webhookUrl=$webhookUrl, additionalProperties=$additionalProperties}"
}
