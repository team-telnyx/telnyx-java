// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.meetingsessions

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Creates a new meeting session. When an idempotency_key is supplied in the request body, replay
 * lookup is scoped to the authenticated account and compares only the key; the request payload is
 * not fingerprinted or compared. If a session with that key already exists for the account, the
 * existing session is replayed (200); otherwise a new session is created (201). Supports
 * bring-your-own-key (BYOK) configuration. The session may enter asynchronous states (e.g. joining,
 * waiting_for_admission) before becoming active. Optional `camera_image` input is write-only and
 * applies only when no Avatar or Assistant webpage output takes precedence. An ignored URL is not
 * fetched. An effective URL source is resolved before bot creation; neither the source URL nor
 * image bytes are persisted, returned, or logged. Treat signed URLs as credentials.
 */
class MeetingSessionCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The meeting URL the bot should join.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun meetingUrl(): String = body.meetingUrl()

    /**
     * Request options for attaching a voice assistant to the session. Routing fields
     * (`call_control_connection_id`, `from`, and `loopback_sip_uri`) are used only to establish the
     * assistant call leg and are omitted from response objects. `audio_gate` is returned with `id`
     * in the assistant response object.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun assistant(): Optional<Assistant> = body.assistant()

    /**
     * Request options for attaching a bring-your-own-key avatar to the session.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun avatar(): Optional<Avatar> = body.avatar()

    /**
     * When enabled, a human participant `speech_on` event interrupts and stops the current bot
     * audio; it does not bypass admission or initiate speech. Assistant sessions reject `barge_in:
     * true`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bargeIn(): Optional<Boolean> = body.bargeIn()

    /**
     * Display name for the bot in the meeting. Defaults to "Meeting Bot".
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun botName(): Optional<String> = body.botName()

    /**
     * Write-only static camera-tile image for this session, not a native account or participant
     * profile photo. Supply exactly one JPEG source. When effective, the image is used as the bot's
     * static camera/video output; presentation varies by meeting platform and recording
     * configuration and is not guaranteed in recordings. An effective Avatar or Assistant webpage
     * output takes precedence, so this input is ignored and a URL source is not fetched.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cameraImage(): Optional<CameraImage> = body.cameraImage()

    /**
     * Client-supplied idempotency key to safely retry creation requests without duplicating
     * sessions. Lookup is scoped to the authenticated account and compares the key only; the
     * request payload is not fingerprinted or compared.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun idempotencyKey(): Optional<String> = body.idempotencyKey()

    /**
     * ISO-8601 timestamp in the future at which the bot should join. If omitted, the bot joins
     * immediately.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun joinAt(): Optional<OffsetDateTime> = body.joinAt()

    /**
     * Arbitrary key-value metadata attached to the session. The serialized JSON representation must
     * not exceed 16384 characters at runtime.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = body.metadata()

    /**
     * Text the bot speaks when it enters the meeting.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun speakOnEnter(): Optional<String> = body.speakOnEnter()

    /**
     * If true, generate a summary artifact when the session ends.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun summarizeOnEnd(): Optional<Boolean> = body.summarizeOnEnd()

    /**
     * Session-default voice identifier used for `speak_on_enter` and ordinary speak actions. A
     * voice supplied on an individual speak action overrides this default for that utterance.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun voice(): Optional<String> = body.voice()

    /**
     * HTTPS endpoint to receive session lifecycle callbacks. Static validation requires HTTPS,
     * rejects embedded credentials and blocked hosts, and enforces egress policy. Validation makes
     * no network request to the endpoint.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookUrl(): Optional<String> = body.webhookUrl()

    /**
     * Returns the raw JSON value of [meetingUrl].
     *
     * Unlike [meetingUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _meetingUrl(): JsonField<String> = body._meetingUrl()

    /**
     * Returns the raw JSON value of [assistant].
     *
     * Unlike [assistant], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _assistant(): JsonField<Assistant> = body._assistant()

    /**
     * Returns the raw JSON value of [avatar].
     *
     * Unlike [avatar], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _avatar(): JsonField<Avatar> = body._avatar()

    /**
     * Returns the raw JSON value of [bargeIn].
     *
     * Unlike [bargeIn], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _bargeIn(): JsonField<Boolean> = body._bargeIn()

    /**
     * Returns the raw JSON value of [botName].
     *
     * Unlike [botName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _botName(): JsonField<String> = body._botName()

    /**
     * Returns the raw JSON value of [cameraImage].
     *
     * Unlike [cameraImage], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _cameraImage(): JsonField<CameraImage> = body._cameraImage()

    /**
     * Returns the raw JSON value of [idempotencyKey].
     *
     * Unlike [idempotencyKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _idempotencyKey(): JsonField<String> = body._idempotencyKey()

    /**
     * Returns the raw JSON value of [joinAt].
     *
     * Unlike [joinAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _joinAt(): JsonField<OffsetDateTime> = body._joinAt()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * Returns the raw JSON value of [speakOnEnter].
     *
     * Unlike [speakOnEnter], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _speakOnEnter(): JsonField<String> = body._speakOnEnter()

    /**
     * Returns the raw JSON value of [summarizeOnEnd].
     *
     * Unlike [summarizeOnEnd], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _summarizeOnEnd(): JsonField<Boolean> = body._summarizeOnEnd()

    /**
     * Returns the raw JSON value of [voice].
     *
     * Unlike [voice], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _voice(): JsonField<String> = body._voice()

    /**
     * Returns the raw JSON value of [webhookUrl].
     *
     * Unlike [webhookUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _webhookUrl(): JsonField<String> = body._webhookUrl()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MeetingSessionCreateParams].
         *
         * The following fields are required:
         * ```java
         * .meetingUrl()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MeetingSessionCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(meetingSessionCreateParams: MeetingSessionCreateParams) = apply {
            body = meetingSessionCreateParams.body.toBuilder()
            additionalHeaders = meetingSessionCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = meetingSessionCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [meetingUrl]
         * - [assistant]
         * - [avatar]
         * - [bargeIn]
         * - [botName]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The meeting URL the bot should join. */
        fun meetingUrl(meetingUrl: String) = apply { body.meetingUrl(meetingUrl) }

        /**
         * Sets [Builder.meetingUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meetingUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun meetingUrl(meetingUrl: JsonField<String>) = apply { body.meetingUrl(meetingUrl) }

        /**
         * Request options for attaching a voice assistant to the session. Routing fields
         * (`call_control_connection_id`, `from`, and `loopback_sip_uri`) are used only to establish
         * the assistant call leg and are omitted from response objects. `audio_gate` is returned
         * with `id` in the assistant response object.
         */
        fun assistant(assistant: Assistant) = apply { body.assistant(assistant) }

        /**
         * Sets [Builder.assistant] to an arbitrary JSON value.
         *
         * You should usually call [Builder.assistant] with a well-typed [Assistant] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun assistant(assistant: JsonField<Assistant>) = apply { body.assistant(assistant) }

        /** Request options for attaching a bring-your-own-key avatar to the session. */
        fun avatar(avatar: Avatar) = apply { body.avatar(avatar) }

        /**
         * Sets [Builder.avatar] to an arbitrary JSON value.
         *
         * You should usually call [Builder.avatar] with a well-typed [Avatar] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun avatar(avatar: JsonField<Avatar>) = apply { body.avatar(avatar) }

        /**
         * When enabled, a human participant `speech_on` event interrupts and stops the current bot
         * audio; it does not bypass admission or initiate speech. Assistant sessions reject
         * `barge_in: true`.
         */
        fun bargeIn(bargeIn: Boolean) = apply { body.bargeIn(bargeIn) }

        /**
         * Sets [Builder.bargeIn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bargeIn] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bargeIn(bargeIn: JsonField<Boolean>) = apply { body.bargeIn(bargeIn) }

        /** Display name for the bot in the meeting. Defaults to "Meeting Bot". */
        fun botName(botName: String) = apply { body.botName(botName) }

        /**
         * Sets [Builder.botName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.botName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun botName(botName: JsonField<String>) = apply { body.botName(botName) }

        /**
         * Write-only static camera-tile image for this session, not a native account or participant
         * profile photo. Supply exactly one JPEG source. When effective, the image is used as the
         * bot's static camera/video output; presentation varies by meeting platform and recording
         * configuration and is not guaranteed in recordings. An effective Avatar or Assistant
         * webpage output takes precedence, so this input is ignored and a URL source is not
         * fetched.
         */
        fun cameraImage(cameraImage: CameraImage) = apply { body.cameraImage(cameraImage) }

        /**
         * Sets [Builder.cameraImage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cameraImage] with a well-typed [CameraImage] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cameraImage(cameraImage: JsonField<CameraImage>) = apply {
            body.cameraImage(cameraImage)
        }

        /**
         * Alias for calling [cameraImage] with
         * `CameraImage.ofMeetingSessionCameraImageBase64Source(meetingSessionCameraImageBase64Source)`.
         */
        fun cameraImage(
            meetingSessionCameraImageBase64Source: CameraImage.MeetingSessionCameraImageBase64Source
        ) = apply { body.cameraImage(meetingSessionCameraImageBase64Source) }

        /**
         * Alias for calling [cameraImage] with
         * `CameraImage.ofMeetingSessionCameraImageUrlSource(meetingSessionCameraImageUrlSource)`.
         */
        fun cameraImage(
            meetingSessionCameraImageUrlSource: CameraImage.MeetingSessionCameraImageUrlSource
        ) = apply { body.cameraImage(meetingSessionCameraImageUrlSource) }

        /**
         * Client-supplied idempotency key to safely retry creation requests without duplicating
         * sessions. Lookup is scoped to the authenticated account and compares the key only; the
         * request payload is not fingerprinted or compared.
         */
        fun idempotencyKey(idempotencyKey: String) = apply { body.idempotencyKey(idempotencyKey) }

        /**
         * Sets [Builder.idempotencyKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idempotencyKey] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
            body.idempotencyKey(idempotencyKey)
        }

        /**
         * ISO-8601 timestamp in the future at which the bot should join. If omitted, the bot joins
         * immediately.
         */
        fun joinAt(joinAt: OffsetDateTime) = apply { body.joinAt(joinAt) }

        /**
         * Sets [Builder.joinAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.joinAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun joinAt(joinAt: JsonField<OffsetDateTime>) = apply { body.joinAt(joinAt) }

        /**
         * Arbitrary key-value metadata attached to the session. The serialized JSON representation
         * must not exceed 16384 characters at runtime.
         */
        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        /** Text the bot speaks when it enters the meeting. */
        fun speakOnEnter(speakOnEnter: String) = apply { body.speakOnEnter(speakOnEnter) }

        /**
         * Sets [Builder.speakOnEnter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.speakOnEnter] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun speakOnEnter(speakOnEnter: JsonField<String>) = apply {
            body.speakOnEnter(speakOnEnter)
        }

        /** If true, generate a summary artifact when the session ends. */
        fun summarizeOnEnd(summarizeOnEnd: Boolean) = apply { body.summarizeOnEnd(summarizeOnEnd) }

        /**
         * Sets [Builder.summarizeOnEnd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.summarizeOnEnd] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun summarizeOnEnd(summarizeOnEnd: JsonField<Boolean>) = apply {
            body.summarizeOnEnd(summarizeOnEnd)
        }

        /**
         * Session-default voice identifier used for `speak_on_enter` and ordinary speak actions. A
         * voice supplied on an individual speak action overrides this default for that utterance.
         */
        fun voice(voice: String) = apply { body.voice(voice) }

        /**
         * Sets [Builder.voice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voice] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun voice(voice: JsonField<String>) = apply { body.voice(voice) }

        /**
         * HTTPS endpoint to receive session lifecycle callbacks. Static validation requires HTTPS,
         * rejects embedded credentials and blocked hosts, and enforces egress policy. Validation
         * makes no network request to the endpoint.
         */
        fun webhookUrl(webhookUrl: String) = apply { body.webhookUrl(webhookUrl) }

        /**
         * Sets [Builder.webhookUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun webhookUrl(webhookUrl: JsonField<String>) = apply { body.webhookUrl(webhookUrl) }

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
         * Returns an immutable instance of [MeetingSessionCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .meetingUrl()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MeetingSessionCreateParams =
            MeetingSessionCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Request body for creating a new meeting session.
     *
     * Cross-field rules:
     * - Neither `avatar` nor `assistant` can be combined with `join_at`; both are available only
     *   for sessions that join immediately.
     * - `assistant` cannot be combined with `barge_in: true`.
     * - The `avatar` and `assistant` options take effect at session creation and cannot be modified
     *   later.
     * - An effective Avatar or Assistant webpage output takes precedence over `camera_image`; the
     *   static image is ignored and a URL source is not fetched.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val meetingUrl: JsonField<String>,
        private val assistant: JsonField<Assistant>,
        private val avatar: JsonField<Avatar>,
        private val bargeIn: JsonField<Boolean>,
        private val botName: JsonField<String>,
        private val cameraImage: JsonField<CameraImage>,
        private val idempotencyKey: JsonField<String>,
        private val joinAt: JsonField<OffsetDateTime>,
        private val metadata: JsonField<Metadata>,
        private val speakOnEnter: JsonField<String>,
        private val summarizeOnEnd: JsonField<Boolean>,
        private val voice: JsonField<String>,
        private val webhookUrl: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("meeting_url")
            @ExcludeMissing
            meetingUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("assistant")
            @ExcludeMissing
            assistant: JsonField<Assistant> = JsonMissing.of(),
            @JsonProperty("avatar") @ExcludeMissing avatar: JsonField<Avatar> = JsonMissing.of(),
            @JsonProperty("barge_in")
            @ExcludeMissing
            bargeIn: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("bot_name") @ExcludeMissing botName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("camera_image")
            @ExcludeMissing
            cameraImage: JsonField<CameraImage> = JsonMissing.of(),
            @JsonProperty("idempotency_key")
            @ExcludeMissing
            idempotencyKey: JsonField<String> = JsonMissing.of(),
            @JsonProperty("join_at")
            @ExcludeMissing
            joinAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("speak_on_enter")
            @ExcludeMissing
            speakOnEnter: JsonField<String> = JsonMissing.of(),
            @JsonProperty("summarize_on_end")
            @ExcludeMissing
            summarizeOnEnd: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("voice") @ExcludeMissing voice: JsonField<String> = JsonMissing.of(),
            @JsonProperty("webhook_url")
            @ExcludeMissing
            webhookUrl: JsonField<String> = JsonMissing.of(),
        ) : this(
            meetingUrl,
            assistant,
            avatar,
            bargeIn,
            botName,
            cameraImage,
            idempotencyKey,
            joinAt,
            metadata,
            speakOnEnter,
            summarizeOnEnd,
            voice,
            webhookUrl,
            mutableMapOf(),
        )

        /**
         * The meeting URL the bot should join.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun meetingUrl(): String = meetingUrl.getRequired("meeting_url")

        /**
         * Request options for attaching a voice assistant to the session. Routing fields
         * (`call_control_connection_id`, `from`, and `loopback_sip_uri`) are used only to establish
         * the assistant call leg and are omitted from response objects. `audio_gate` is returned
         * with `id` in the assistant response object.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun assistant(): Optional<Assistant> = assistant.getOptional("assistant")

        /**
         * Request options for attaching a bring-your-own-key avatar to the session.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun avatar(): Optional<Avatar> = avatar.getOptional("avatar")

        /**
         * When enabled, a human participant `speech_on` event interrupts and stops the current bot
         * audio; it does not bypass admission or initiate speech. Assistant sessions reject
         * `barge_in: true`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun bargeIn(): Optional<Boolean> = bargeIn.getOptional("barge_in")

        /**
         * Display name for the bot in the meeting. Defaults to "Meeting Bot".
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun botName(): Optional<String> = botName.getOptional("bot_name")

        /**
         * Write-only static camera-tile image for this session, not a native account or participant
         * profile photo. Supply exactly one JPEG source. When effective, the image is used as the
         * bot's static camera/video output; presentation varies by meeting platform and recording
         * configuration and is not guaranteed in recordings. An effective Avatar or Assistant
         * webpage output takes precedence, so this input is ignored and a URL source is not
         * fetched.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cameraImage(): Optional<CameraImage> = cameraImage.getOptional("camera_image")

        /**
         * Client-supplied idempotency key to safely retry creation requests without duplicating
         * sessions. Lookup is scoped to the authenticated account and compares the key only; the
         * request payload is not fingerprinted or compared.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun idempotencyKey(): Optional<String> = idempotencyKey.getOptional("idempotency_key")

        /**
         * ISO-8601 timestamp in the future at which the bot should join. If omitted, the bot joins
         * immediately.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun joinAt(): Optional<OffsetDateTime> = joinAt.getOptional("join_at")

        /**
         * Arbitrary key-value metadata attached to the session. The serialized JSON representation
         * must not exceed 16384 characters at runtime.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

        /**
         * Text the bot speaks when it enters the meeting.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun speakOnEnter(): Optional<String> = speakOnEnter.getOptional("speak_on_enter")

        /**
         * If true, generate a summary artifact when the session ends.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun summarizeOnEnd(): Optional<Boolean> = summarizeOnEnd.getOptional("summarize_on_end")

        /**
         * Session-default voice identifier used for `speak_on_enter` and ordinary speak actions. A
         * voice supplied on an individual speak action overrides this default for that utterance.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun voice(): Optional<String> = voice.getOptional("voice")

        /**
         * HTTPS endpoint to receive session lifecycle callbacks. Static validation requires HTTPS,
         * rejects embedded credentials and blocked hosts, and enforces egress policy. Validation
         * makes no network request to the endpoint.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun webhookUrl(): Optional<String> = webhookUrl.getOptional("webhook_url")

        /**
         * Returns the raw JSON value of [meetingUrl].
         *
         * Unlike [meetingUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("meeting_url")
        @ExcludeMissing
        fun _meetingUrl(): JsonField<String> = meetingUrl

        /**
         * Returns the raw JSON value of [assistant].
         *
         * Unlike [assistant], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("assistant")
        @ExcludeMissing
        fun _assistant(): JsonField<Assistant> = assistant

        /**
         * Returns the raw JSON value of [avatar].
         *
         * Unlike [avatar], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("avatar") @ExcludeMissing fun _avatar(): JsonField<Avatar> = avatar

        /**
         * Returns the raw JSON value of [bargeIn].
         *
         * Unlike [bargeIn], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("barge_in") @ExcludeMissing fun _bargeIn(): JsonField<Boolean> = bargeIn

        /**
         * Returns the raw JSON value of [botName].
         *
         * Unlike [botName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bot_name") @ExcludeMissing fun _botName(): JsonField<String> = botName

        /**
         * Returns the raw JSON value of [cameraImage].
         *
         * Unlike [cameraImage], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("camera_image")
        @ExcludeMissing
        fun _cameraImage(): JsonField<CameraImage> = cameraImage

        /**
         * Returns the raw JSON value of [idempotencyKey].
         *
         * Unlike [idempotencyKey], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("idempotency_key")
        @ExcludeMissing
        fun _idempotencyKey(): JsonField<String> = idempotencyKey

        /**
         * Returns the raw JSON value of [joinAt].
         *
         * Unlike [joinAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("join_at") @ExcludeMissing fun _joinAt(): JsonField<OffsetDateTime> = joinAt

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

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

        /**
         * Returns the raw JSON value of [webhookUrl].
         *
         * Unlike [webhookUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("webhook_url")
        @ExcludeMissing
        fun _webhookUrl(): JsonField<String> = webhookUrl

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
             * .meetingUrl()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var meetingUrl: JsonField<String>? = null
            private var assistant: JsonField<Assistant> = JsonMissing.of()
            private var avatar: JsonField<Avatar> = JsonMissing.of()
            private var bargeIn: JsonField<Boolean> = JsonMissing.of()
            private var botName: JsonField<String> = JsonMissing.of()
            private var cameraImage: JsonField<CameraImage> = JsonMissing.of()
            private var idempotencyKey: JsonField<String> = JsonMissing.of()
            private var joinAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var speakOnEnter: JsonField<String> = JsonMissing.of()
            private var summarizeOnEnd: JsonField<Boolean> = JsonMissing.of()
            private var voice: JsonField<String> = JsonMissing.of()
            private var webhookUrl: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                meetingUrl = body.meetingUrl
                assistant = body.assistant
                avatar = body.avatar
                bargeIn = body.bargeIn
                botName = body.botName
                cameraImage = body.cameraImage
                idempotencyKey = body.idempotencyKey
                joinAt = body.joinAt
                metadata = body.metadata
                speakOnEnter = body.speakOnEnter
                summarizeOnEnd = body.summarizeOnEnd
                voice = body.voice
                webhookUrl = body.webhookUrl
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The meeting URL the bot should join. */
            fun meetingUrl(meetingUrl: String) = meetingUrl(JsonField.of(meetingUrl))

            /**
             * Sets [Builder.meetingUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.meetingUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun meetingUrl(meetingUrl: JsonField<String>) = apply { this.meetingUrl = meetingUrl }

            /**
             * Request options for attaching a voice assistant to the session. Routing fields
             * (`call_control_connection_id`, `from`, and `loopback_sip_uri`) are used only to
             * establish the assistant call leg and are omitted from response objects. `audio_gate`
             * is returned with `id` in the assistant response object.
             */
            fun assistant(assistant: Assistant) = assistant(JsonField.of(assistant))

            /**
             * Sets [Builder.assistant] to an arbitrary JSON value.
             *
             * You should usually call [Builder.assistant] with a well-typed [Assistant] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun assistant(assistant: JsonField<Assistant>) = apply { this.assistant = assistant }

            /** Request options for attaching a bring-your-own-key avatar to the session. */
            fun avatar(avatar: Avatar) = avatar(JsonField.of(avatar))

            /**
             * Sets [Builder.avatar] to an arbitrary JSON value.
             *
             * You should usually call [Builder.avatar] with a well-typed [Avatar] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun avatar(avatar: JsonField<Avatar>) = apply { this.avatar = avatar }

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

            /** Display name for the bot in the meeting. Defaults to "Meeting Bot". */
            fun botName(botName: String) = botName(JsonField.of(botName))

            /**
             * Sets [Builder.botName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.botName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun botName(botName: JsonField<String>) = apply { this.botName = botName }

            /**
             * Write-only static camera-tile image for this session, not a native account or
             * participant profile photo. Supply exactly one JPEG source. When effective, the image
             * is used as the bot's static camera/video output; presentation varies by meeting
             * platform and recording configuration and is not guaranteed in recordings. An
             * effective Avatar or Assistant webpage output takes precedence, so this input is
             * ignored and a URL source is not fetched.
             */
            fun cameraImage(cameraImage: CameraImage) = cameraImage(JsonField.of(cameraImage))

            /**
             * Sets [Builder.cameraImage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cameraImage] with a well-typed [CameraImage] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cameraImage(cameraImage: JsonField<CameraImage>) = apply {
                this.cameraImage = cameraImage
            }

            /**
             * Alias for calling [cameraImage] with
             * `CameraImage.ofMeetingSessionCameraImageBase64Source(meetingSessionCameraImageBase64Source)`.
             */
            fun cameraImage(
                meetingSessionCameraImageBase64Source:
                    CameraImage.MeetingSessionCameraImageBase64Source
            ) =
                cameraImage(
                    CameraImage.ofMeetingSessionCameraImageBase64Source(
                        meetingSessionCameraImageBase64Source
                    )
                )

            /**
             * Alias for calling [cameraImage] with
             * `CameraImage.ofMeetingSessionCameraImageUrlSource(meetingSessionCameraImageUrlSource)`.
             */
            fun cameraImage(
                meetingSessionCameraImageUrlSource: CameraImage.MeetingSessionCameraImageUrlSource
            ) =
                cameraImage(
                    CameraImage.ofMeetingSessionCameraImageUrlSource(
                        meetingSessionCameraImageUrlSource
                    )
                )

            /**
             * Client-supplied idempotency key to safely retry creation requests without duplicating
             * sessions. Lookup is scoped to the authenticated account and compares the key only;
             * the request payload is not fingerprinted or compared.
             */
            fun idempotencyKey(idempotencyKey: String) =
                idempotencyKey(JsonField.of(idempotencyKey))

            /**
             * Sets [Builder.idempotencyKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idempotencyKey] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
                this.idempotencyKey = idempotencyKey
            }

            /**
             * ISO-8601 timestamp in the future at which the bot should join. If omitted, the bot
             * joins immediately.
             */
            fun joinAt(joinAt: OffsetDateTime) = joinAt(JsonField.of(joinAt))

            /**
             * Sets [Builder.joinAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.joinAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun joinAt(joinAt: JsonField<OffsetDateTime>) = apply { this.joinAt = joinAt }

            /**
             * Arbitrary key-value metadata attached to the session. The serialized JSON
             * representation must not exceed 16384 characters at runtime.
             */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /** Text the bot speaks when it enters the meeting. */
            fun speakOnEnter(speakOnEnter: String) = speakOnEnter(JsonField.of(speakOnEnter))

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

            /** If true, generate a summary artifact when the session ends. */
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

            /**
             * Session-default voice identifier used for `speak_on_enter` and ordinary speak
             * actions. A voice supplied on an individual speak action overrides this default for
             * that utterance.
             */
            fun voice(voice: String) = voice(JsonField.of(voice))

            /**
             * Sets [Builder.voice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.voice] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun voice(voice: JsonField<String>) = apply { this.voice = voice }

            /**
             * HTTPS endpoint to receive session lifecycle callbacks. Static validation requires
             * HTTPS, rejects embedded credentials and blocked hosts, and enforces egress policy.
             * Validation makes no network request to the endpoint.
             */
            fun webhookUrl(webhookUrl: String) = webhookUrl(JsonField.of(webhookUrl))

            /**
             * Sets [Builder.webhookUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhookUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .meetingUrl()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("meetingUrl", meetingUrl),
                    assistant,
                    avatar,
                    bargeIn,
                    botName,
                    cameraImage,
                    idempotencyKey,
                    joinAt,
                    metadata,
                    speakOnEnter,
                    summarizeOnEnd,
                    voice,
                    webhookUrl,
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

            meetingUrl()
            assistant().ifPresent { it.validate() }
            avatar().ifPresent { it.validate() }
            bargeIn()
            botName()
            cameraImage().ifPresent { it.validate() }
            idempotencyKey()
            joinAt()
            metadata().ifPresent { it.validate() }
            speakOnEnter()
            summarizeOnEnd()
            voice()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (meetingUrl.asKnown().isPresent) 1 else 0) +
                (assistant.asKnown().getOrNull()?.validity() ?: 0) +
                (avatar.asKnown().getOrNull()?.validity() ?: 0) +
                (if (bargeIn.asKnown().isPresent) 1 else 0) +
                (if (botName.asKnown().isPresent) 1 else 0) +
                (cameraImage.asKnown().getOrNull()?.validity() ?: 0) +
                (if (idempotencyKey.asKnown().isPresent) 1 else 0) +
                (if (joinAt.asKnown().isPresent) 1 else 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (if (speakOnEnter.asKnown().isPresent) 1 else 0) +
                (if (summarizeOnEnd.asKnown().isPresent) 1 else 0) +
                (if (voice.asKnown().isPresent) 1 else 0) +
                (if (webhookUrl.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                meetingUrl == other.meetingUrl &&
                assistant == other.assistant &&
                avatar == other.avatar &&
                bargeIn == other.bargeIn &&
                botName == other.botName &&
                cameraImage == other.cameraImage &&
                idempotencyKey == other.idempotencyKey &&
                joinAt == other.joinAt &&
                metadata == other.metadata &&
                speakOnEnter == other.speakOnEnter &&
                summarizeOnEnd == other.summarizeOnEnd &&
                voice == other.voice &&
                webhookUrl == other.webhookUrl &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                meetingUrl,
                assistant,
                avatar,
                bargeIn,
                botName,
                cameraImage,
                idempotencyKey,
                joinAt,
                metadata,
                speakOnEnter,
                summarizeOnEnd,
                voice,
                webhookUrl,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{meetingUrl=$meetingUrl, assistant=$assistant, avatar=$avatar, bargeIn=$bargeIn, botName=$botName, cameraImage=$cameraImage, idempotencyKey=$idempotencyKey, joinAt=$joinAt, metadata=$metadata, speakOnEnter=$speakOnEnter, summarizeOnEnd=$summarizeOnEnd, voice=$voice, webhookUrl=$webhookUrl, additionalProperties=$additionalProperties}"
    }

    /**
     * Request options for attaching a voice assistant to the session. Routing fields
     * (`call_control_connection_id`, `from`, and `loopback_sip_uri`) are used only to establish the
     * assistant call leg and are omitted from response objects. `audio_gate` is returned with `id`
     * in the assistant response object.
     */
    class Assistant
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val callControlConnectionId: JsonField<String>,
        private val from: JsonField<String>,
        private val loopbackSipUri: JsonField<String>,
        private val audioGate: JsonField<AudioGate>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("call_control_connection_id")
            @ExcludeMissing
            callControlConnectionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("from") @ExcludeMissing from: JsonField<String> = JsonMissing.of(),
            @JsonProperty("loopback_sip_uri")
            @ExcludeMissing
            loopbackSipUri: JsonField<String> = JsonMissing.of(),
            @JsonProperty("audio_gate")
            @ExcludeMissing
            audioGate: JsonField<AudioGate> = JsonMissing.of(),
        ) : this(id, callControlConnectionId, from, loopbackSipUri, audioGate, mutableMapOf())

        /**
         * Identifier of the assistant to attach.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Call control connection used to bridge the assistant into the meeting audio.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun callControlConnectionId(): String =
            callControlConnectionId.getRequired("call_control_connection_id")

        /**
         * E.164 calling number used as the originating party for the assistant call leg.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun from(): String = from.getRequired("from")

        /**
         * SIP URI to which the assistant media loopback is established.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun loopbackSipUri(): String = loopbackSipUri.getRequired("loopback_sip_uri")

        /**
         * Audio gating strategy for the assistant call leg.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun audioGate(): Optional<AudioGate> = audioGate.getOptional("audio_gate")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [callControlConnectionId].
         *
         * Unlike [callControlConnectionId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("call_control_connection_id")
        @ExcludeMissing
        fun _callControlConnectionId(): JsonField<String> = callControlConnectionId

        /**
         * Returns the raw JSON value of [from].
         *
         * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("from") @ExcludeMissing fun _from(): JsonField<String> = from

        /**
         * Returns the raw JSON value of [loopbackSipUri].
         *
         * Unlike [loopbackSipUri], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("loopback_sip_uri")
        @ExcludeMissing
        fun _loopbackSipUri(): JsonField<String> = loopbackSipUri

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
             * .callControlConnectionId()
             * .from()
             * .loopbackSipUri()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Assistant]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var callControlConnectionId: JsonField<String>? = null
            private var from: JsonField<String>? = null
            private var loopbackSipUri: JsonField<String>? = null
            private var audioGate: JsonField<AudioGate> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(assistant: Assistant) = apply {
                id = assistant.id
                callControlConnectionId = assistant.callControlConnectionId
                from = assistant.from
                loopbackSipUri = assistant.loopbackSipUri
                audioGate = assistant.audioGate
                additionalProperties = assistant.additionalProperties.toMutableMap()
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

            /** Call control connection used to bridge the assistant into the meeting audio. */
            fun callControlConnectionId(callControlConnectionId: String) =
                callControlConnectionId(JsonField.of(callControlConnectionId))

            /**
             * Sets [Builder.callControlConnectionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callControlConnectionId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun callControlConnectionId(callControlConnectionId: JsonField<String>) = apply {
                this.callControlConnectionId = callControlConnectionId
            }

            /** E.164 calling number used as the originating party for the assistant call leg. */
            fun from(from: String) = from(JsonField.of(from))

            /**
             * Sets [Builder.from] to an arbitrary JSON value.
             *
             * You should usually call [Builder.from] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun from(from: JsonField<String>) = apply { this.from = from }

            /** SIP URI to which the assistant media loopback is established. */
            fun loopbackSipUri(loopbackSipUri: String) =
                loopbackSipUri(JsonField.of(loopbackSipUri))

            /**
             * Sets [Builder.loopbackSipUri] to an arbitrary JSON value.
             *
             * You should usually call [Builder.loopbackSipUri] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun loopbackSipUri(loopbackSipUri: JsonField<String>) = apply {
                this.loopbackSipUri = loopbackSipUri
            }

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
             * .callControlConnectionId()
             * .from()
             * .loopbackSipUri()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Assistant =
                Assistant(
                    checkRequired("id", id),
                    checkRequired("callControlConnectionId", callControlConnectionId),
                    checkRequired("from", from),
                    checkRequired("loopbackSipUri", loopbackSipUri),
                    audioGate,
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
            callControlConnectionId()
            from()
            loopbackSipUri()
            audioGate().ifPresent { it.validate() }
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
                (if (callControlConnectionId.asKnown().isPresent) 1 else 0) +
                (if (from.asKnown().isPresent) 1 else 0) +
                (if (loopbackSipUri.asKnown().isPresent) 1 else 0) +
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
                callControlConnectionId == other.callControlConnectionId &&
                from == other.from &&
                loopbackSipUri == other.loopbackSipUri &&
                audioGate == other.audioGate &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                callControlConnectionId,
                from,
                loopbackSipUri,
                audioGate,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Assistant{id=$id, callControlConnectionId=$callControlConnectionId, from=$from, loopbackSipUri=$loopbackSipUri, audioGate=$audioGate, additionalProperties=$additionalProperties}"
    }

    /** Request options for attaching a bring-your-own-key avatar to the session. */
    class Avatar
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val apiKey: JsonField<String>,
        private val avatarId: JsonField<String>,
        private val provider: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("api_key") @ExcludeMissing apiKey: JsonField<String> = JsonMissing.of(),
            @JsonProperty("avatar_id")
            @ExcludeMissing
            avatarId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("provider") @ExcludeMissing provider: JsonValue = JsonMissing.of(),
        ) : this(apiKey, avatarId, provider, mutableMapOf())

        /**
         * Bring-your-own-key API key for the avatar provider. The key is never stored or returned
         * by the API.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun apiKey(): String = apiKey.getRequired("api_key")

        /**
         * Identifier of the avatar to use.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun avatarId(): String = avatarId.getRequired("avatar_id")

        /**
         * Avatar provider identifier. Currently only "anam" is supported.
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
         * Returns the raw JSON value of [apiKey].
         *
         * Unlike [apiKey], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("api_key") @ExcludeMissing fun _apiKey(): JsonField<String> = apiKey

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
             * .apiKey()
             * .avatarId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Avatar]. */
        class Builder internal constructor() {

            private var apiKey: JsonField<String>? = null
            private var avatarId: JsonField<String>? = null
            private var provider: JsonValue = JsonValue.from("anam")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(avatar: Avatar) = apply {
                apiKey = avatar.apiKey
                avatarId = avatar.avatarId
                provider = avatar.provider
                additionalProperties = avatar.additionalProperties.toMutableMap()
            }

            /**
             * Bring-your-own-key API key for the avatar provider. The key is never stored or
             * returned by the API.
             */
            fun apiKey(apiKey: String) = apiKey(JsonField.of(apiKey))

            /**
             * Sets [Builder.apiKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.apiKey] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun apiKey(apiKey: JsonField<String>) = apply { this.apiKey = apiKey }

            /** Identifier of the avatar to use. */
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
             * .apiKey()
             * .avatarId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Avatar =
                Avatar(
                    checkRequired("apiKey", apiKey),
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

            apiKey()
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
            (if (apiKey.asKnown().isPresent) 1 else 0) +
                (if (avatarId.asKnown().isPresent) 1 else 0) +
                provider.let { if (it == JsonValue.from("anam")) 1 else 0 }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Avatar &&
                apiKey == other.apiKey &&
                avatarId == other.avatarId &&
                provider == other.provider &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(apiKey, avatarId, provider, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Avatar{apiKey=$apiKey, avatarId=$avatarId, provider=$provider, additionalProperties=$additionalProperties}"
    }

    /**
     * Write-only static camera-tile image for this session, not a native account or participant
     * profile photo. Supply exactly one JPEG source. When effective, the image is used as the bot's
     * static camera/video output; presentation varies by meeting platform and recording
     * configuration and is not guaranteed in recordings. An effective Avatar or Assistant webpage
     * output takes precedence, so this input is ignored and a URL source is not fetched.
     */
    @JsonDeserialize(using = CameraImage.Deserializer::class)
    @JsonSerialize(using = CameraImage.Serializer::class)
    class CameraImage
    private constructor(
        private val meetingSessionCameraImageBase64Source: MeetingSessionCameraImageBase64Source? =
            null,
        private val meetingSessionCameraImageUrlSource: MeetingSessionCameraImageUrlSource? = null,
        private val _json: JsonValue? = null,
    ) {

        fun meetingSessionCameraImageBase64Source():
            Optional<MeetingSessionCameraImageBase64Source> =
            Optional.ofNullable(meetingSessionCameraImageBase64Source)

        fun meetingSessionCameraImageUrlSource(): Optional<MeetingSessionCameraImageUrlSource> =
            Optional.ofNullable(meetingSessionCameraImageUrlSource)

        fun isMeetingSessionCameraImageBase64Source(): Boolean =
            meetingSessionCameraImageBase64Source != null

        fun isMeetingSessionCameraImageUrlSource(): Boolean =
            meetingSessionCameraImageUrlSource != null

        fun asMeetingSessionCameraImageBase64Source(): MeetingSessionCameraImageBase64Source =
            meetingSessionCameraImageBase64Source.getOrThrow(
                "meetingSessionCameraImageBase64Source"
            )

        fun asMeetingSessionCameraImageUrlSource(): MeetingSessionCameraImageUrlSource =
            meetingSessionCameraImageUrlSource.getOrThrow("meetingSessionCameraImageUrlSource")

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
         * Optional<String> result = cameraImage.accept(new CameraImage.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitMeetingSessionCameraImageBase64Source(MeetingSessionCameraImageBase64Source meetingSessionCameraImageBase64Source) {
         *         return Optional.of(meetingSessionCameraImageBase64Source.toString());
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
                meetingSessionCameraImageBase64Source != null ->
                    visitor.visitMeetingSessionCameraImageBase64Source(
                        meetingSessionCameraImageBase64Source
                    )
                meetingSessionCameraImageUrlSource != null ->
                    visitor.visitMeetingSessionCameraImageUrlSource(
                        meetingSessionCameraImageUrlSource
                    )
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
        fun validate(): CameraImage = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitMeetingSessionCameraImageBase64Source(
                        meetingSessionCameraImageBase64Source: MeetingSessionCameraImageBase64Source
                    ) {
                        meetingSessionCameraImageBase64Source.validate()
                    }

                    override fun visitMeetingSessionCameraImageUrlSource(
                        meetingSessionCameraImageUrlSource: MeetingSessionCameraImageUrlSource
                    ) {
                        meetingSessionCameraImageUrlSource.validate()
                    }
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
                    override fun visitMeetingSessionCameraImageBase64Source(
                        meetingSessionCameraImageBase64Source: MeetingSessionCameraImageBase64Source
                    ) = meetingSessionCameraImageBase64Source.validity()

                    override fun visitMeetingSessionCameraImageUrlSource(
                        meetingSessionCameraImageUrlSource: MeetingSessionCameraImageUrlSource
                    ) = meetingSessionCameraImageUrlSource.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CameraImage &&
                meetingSessionCameraImageBase64Source ==
                    other.meetingSessionCameraImageBase64Source &&
                meetingSessionCameraImageUrlSource == other.meetingSessionCameraImageUrlSource
        }

        override fun hashCode(): Int =
            Objects.hash(meetingSessionCameraImageBase64Source, meetingSessionCameraImageUrlSource)

        override fun toString(): String =
            when {
                meetingSessionCameraImageBase64Source != null ->
                    "CameraImage{meetingSessionCameraImageBase64Source=$meetingSessionCameraImageBase64Source}"
                meetingSessionCameraImageUrlSource != null ->
                    "CameraImage{meetingSessionCameraImageUrlSource=$meetingSessionCameraImageUrlSource}"
                _json != null -> "CameraImage{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid CameraImage")
            }

        companion object {

            @JvmStatic
            fun ofMeetingSessionCameraImageBase64Source(
                meetingSessionCameraImageBase64Source: MeetingSessionCameraImageBase64Source
            ) =
                CameraImage(
                    meetingSessionCameraImageBase64Source = meetingSessionCameraImageBase64Source
                )

            @JvmStatic
            fun ofMeetingSessionCameraImageUrlSource(
                meetingSessionCameraImageUrlSource: MeetingSessionCameraImageUrlSource
            ) = CameraImage(meetingSessionCameraImageUrlSource = meetingSessionCameraImageUrlSource)
        }

        /**
         * An interface that defines how to map each variant of [CameraImage] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitMeetingSessionCameraImageBase64Source(
                meetingSessionCameraImageBase64Source: MeetingSessionCameraImageBase64Source
            ): T

            fun visitMeetingSessionCameraImageUrlSource(
                meetingSessionCameraImageUrlSource: MeetingSessionCameraImageUrlSource
            ): T

            /**
             * Maps an unknown variant of [CameraImage] to a value of type [T].
             *
             * An instance of [CameraImage] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws TelnyxInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw TelnyxInvalidDataException("Unknown CameraImage: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<CameraImage>(CameraImage::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): CameraImage {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<MeetingSessionCameraImageBase64Source>(),
                                )
                                ?.let {
                                    CameraImage(
                                        meetingSessionCameraImageBase64Source = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<MeetingSessionCameraImageUrlSource>(),
                                )
                                ?.let {
                                    CameraImage(
                                        meetingSessionCameraImageUrlSource = it,
                                        _json = json,
                                    )
                                },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> CameraImage(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<CameraImage>(CameraImage::class) {

            override fun serialize(
                value: CameraImage,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.meetingSessionCameraImageBase64Source != null ->
                        generator.writeObject(value.meetingSessionCameraImageBase64Source)
                    value.meetingSessionCameraImageUrlSource != null ->
                        generator.writeObject(value.meetingSessionCameraImageUrlSource)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid CameraImage")
                }
            }
        }

        class MeetingSessionCameraImageBase64Source
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val base64Data: JsonField<String>,
            private val format: JsonValue,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("base64_data")
                @ExcludeMissing
                base64Data: JsonField<String> = JsonMissing.of(),
                @JsonProperty("format") @ExcludeMissing format: JsonValue = JsonMissing.of(),
            ) : this(base64Data, format, mutableMapOf())

            /**
             * Canonical plain RFC 4648 Base64 for a valid decoded JPEG. Data URIs, whitespace, and
             * the URL-safe alphabet are rejected. The encoded value is limited to 1,835,008
             * characters and the decoded JPEG to 1,363,148 bytes. The JPEG is limited to 4,096
             * pixels per dimension, 4 megapixels, and 128 MB of decoder memory. The image bytes are
             * not persisted, returned, or logged.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun base64Data(): String = base64Data.getRequired("base64_data")

            /**
             * Only JPEG images are accepted.
             *
             * Expected to always return the following:
             * ```java
             * JsonValue.from("jpeg")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("format") @ExcludeMissing fun _format(): JsonValue = format

            /**
             * Returns the raw JSON value of [base64Data].
             *
             * Unlike [base64Data], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("base64_data")
            @ExcludeMissing
            fun _base64Data(): JsonField<String> = base64Data

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
                 * [MeetingSessionCameraImageBase64Source].
                 *
                 * The following fields are required:
                 * ```java
                 * .base64Data()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [MeetingSessionCameraImageBase64Source]. */
            class Builder internal constructor() {

                private var base64Data: JsonField<String>? = null
                private var format: JsonValue = JsonValue.from("jpeg")
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    meetingSessionCameraImageBase64Source: MeetingSessionCameraImageBase64Source
                ) = apply {
                    base64Data = meetingSessionCameraImageBase64Source.base64Data
                    format = meetingSessionCameraImageBase64Source.format
                    additionalProperties =
                        meetingSessionCameraImageBase64Source.additionalProperties.toMutableMap()
                }

                /**
                 * Canonical plain RFC 4648 Base64 for a valid decoded JPEG. Data URIs, whitespace,
                 * and the URL-safe alphabet are rejected. The encoded value is limited to 1,835,008
                 * characters and the decoded JPEG to 1,363,148 bytes. The JPEG is limited to 4,096
                 * pixels per dimension, 4 megapixels, and 128 MB of decoder memory. The image bytes
                 * are not persisted, returned, or logged.
                 */
                fun base64Data(base64Data: String) = base64Data(JsonField.of(base64Data))

                /**
                 * Sets [Builder.base64Data] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.base64Data] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun base64Data(base64Data: JsonField<String>) = apply {
                    this.base64Data = base64Data
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from("jpeg")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun format(format: JsonValue) = apply { this.format = format }

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
                 * Returns an immutable instance of [MeetingSessionCameraImageBase64Source].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .base64Data()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): MeetingSessionCameraImageBase64Source =
                    MeetingSessionCameraImageBase64Source(
                        checkRequired("base64Data", base64Data),
                        format,
                        additionalProperties.toMutableMap(),
                    )
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
            fun validate(): MeetingSessionCameraImageBase64Source = apply {
                if (validated) {
                    return@apply
                }

                base64Data()
                _format().let {
                    if (it != JsonValue.from("jpeg")) {
                        throw TelnyxInvalidDataException("'format' is invalid, received $it")
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
                (if (base64Data.asKnown().isPresent) 1 else 0) +
                    format.let { if (it == JsonValue.from("jpeg")) 1 else 0 }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is MeetingSessionCameraImageBase64Source &&
                    base64Data == other.base64Data &&
                    format == other.format &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(base64Data, format, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "MeetingSessionCameraImageBase64Source{base64Data=$base64Data, format=$format, additionalProperties=$additionalProperties}"
        }

        class MeetingSessionCameraImageUrlSource
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val format: JsonValue,
            private val url: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("format") @ExcludeMissing format: JsonValue = JsonMissing.of(),
                @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
            ) : this(format, url, mutableMapOf())

            /**
             * Only JPEG images are accepted.
             *
             * Expected to always return the following:
             * ```java
             * JsonValue.from("jpeg")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("format") @ExcludeMissing fun _format(): JsonValue = format

            /**
             * Public HTTPS JPEG URL with at most 2,048 characters and no credentials, fragment,
             * surrounding whitespace, raw control characters, or explicit non-default port. Signed
             * queries are allowed but must be treated as credentials. Fetching is limited to public
             * network destinations, a five-second timeout, no redirects, a 2xx image/jpeg response
             * with identity or no content encoding, and a 1,363,148-byte limit enforced against
             * both declared and streamed content. The service resolves the URL before bot creation
             * and does not persist, return, or log the URL or image bytes.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun url(): String = url.getRequired("url")

            /**
             * Returns the raw JSON value of [url].
             *
             * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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
                 * [MeetingSessionCameraImageUrlSource].
                 *
                 * The following fields are required:
                 * ```java
                 * .url()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [MeetingSessionCameraImageUrlSource]. */
            class Builder internal constructor() {

                private var format: JsonValue = JsonValue.from("jpeg")
                private var url: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    meetingSessionCameraImageUrlSource: MeetingSessionCameraImageUrlSource
                ) = apply {
                    format = meetingSessionCameraImageUrlSource.format
                    url = meetingSessionCameraImageUrlSource.url
                    additionalProperties =
                        meetingSessionCameraImageUrlSource.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from("jpeg")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun format(format: JsonValue) = apply { this.format = format }

                /**
                 * Public HTTPS JPEG URL with at most 2,048 characters and no credentials, fragment,
                 * surrounding whitespace, raw control characters, or explicit non-default port.
                 * Signed queries are allowed but must be treated as credentials. Fetching is
                 * limited to public network destinations, a five-second timeout, no redirects, a
                 * 2xx image/jpeg response with identity or no content encoding, and a
                 * 1,363,148-byte limit enforced against both declared and streamed content. The
                 * service resolves the URL before bot creation and does not persist, return, or log
                 * the URL or image bytes.
                 */
                fun url(url: String) = url(JsonField.of(url))

                /**
                 * Sets [Builder.url] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.url] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun url(url: JsonField<String>) = apply { this.url = url }

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
                 * Returns an immutable instance of [MeetingSessionCameraImageUrlSource].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .url()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): MeetingSessionCameraImageUrlSource =
                    MeetingSessionCameraImageUrlSource(
                        format,
                        checkRequired("url", url),
                        additionalProperties.toMutableMap(),
                    )
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
            fun validate(): MeetingSessionCameraImageUrlSource = apply {
                if (validated) {
                    return@apply
                }

                _format().let {
                    if (it != JsonValue.from("jpeg")) {
                        throw TelnyxInvalidDataException("'format' is invalid, received $it")
                    }
                }
                url()
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
                format.let { if (it == JsonValue.from("jpeg")) 1 else 0 } +
                    (if (url.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is MeetingSessionCameraImageUrlSource &&
                    format == other.format &&
                    url == other.url &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(format, url, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "MeetingSessionCameraImageUrlSource{format=$format, url=$url, additionalProperties=$additionalProperties}"
        }
    }

    /**
     * Arbitrary key-value metadata attached to the session. The serialized JSON representation must
     * not exceed 16384 characters at runtime.
     */
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MeetingSessionCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "MeetingSessionCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
