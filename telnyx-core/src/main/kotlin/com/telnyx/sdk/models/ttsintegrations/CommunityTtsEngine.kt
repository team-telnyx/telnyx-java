// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ttsintegrations

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * The full record of a community TTS engine you own. Select its voices by the engine's `name`, as
 * `<name>.<voice_id>`, with your own key for it (`api_key_ref`).
 */
class CommunityTtsEngine
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val capabilities: JsonField<CommunityTtsEngineCapabilities>,
    private val name: JsonField<String>,
    private val status: JsonField<CommunityTtsEngineStatus>,
    private val supportedAudioFormats: JsonField<List<CommunityTtsAudioFormat>>,
    private val visibility: JsonField<CommunityTtsEngineVisibility>,
    private val voicesUrl: JsonField<String>,
    private val websocketUrl: JsonField<String>,
    private val connectTimeoutMs: JsonField<Long>,
    private val contactEmail: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val dataRetentionPolicyUrl: JsonField<String>,
    private val documentationUrl: JsonField<String>,
    private val reviewNotes: JsonField<String>,
    private val reviewStatus: JsonField<ReviewStatus>,
    private val reviewedAt: JsonField<OffsetDateTime>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val voicesApiKeyRef: JsonField<String>,
    private val voicesCount: JsonField<Long>,
    private val voicesDegraded: JsonField<Boolean>,
    private val voicesFetchedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("capabilities")
        @ExcludeMissing
        capabilities: JsonField<CommunityTtsEngineCapabilities> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<CommunityTtsEngineStatus> = JsonMissing.of(),
        @JsonProperty("supported_audio_formats")
        @ExcludeMissing
        supportedAudioFormats: JsonField<List<CommunityTtsAudioFormat>> = JsonMissing.of(),
        @JsonProperty("visibility")
        @ExcludeMissing
        visibility: JsonField<CommunityTtsEngineVisibility> = JsonMissing.of(),
        @JsonProperty("voices_url") @ExcludeMissing voicesUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("websocket_url")
        @ExcludeMissing
        websocketUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("connect_timeout_ms")
        @ExcludeMissing
        connectTimeoutMs: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("contact_email")
        @ExcludeMissing
        contactEmail: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("data_retention_policy_url")
        @ExcludeMissing
        dataRetentionPolicyUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("documentation_url")
        @ExcludeMissing
        documentationUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("review_notes")
        @ExcludeMissing
        reviewNotes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("review_status")
        @ExcludeMissing
        reviewStatus: JsonField<ReviewStatus> = JsonMissing.of(),
        @JsonProperty("reviewed_at")
        @ExcludeMissing
        reviewedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("voices_api_key_ref")
        @ExcludeMissing
        voicesApiKeyRef: JsonField<String> = JsonMissing.of(),
        @JsonProperty("voices_count")
        @ExcludeMissing
        voicesCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("voices_degraded")
        @ExcludeMissing
        voicesDegraded: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("voices_fetched_at")
        @ExcludeMissing
        voicesFetchedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        capabilities,
        name,
        status,
        supportedAudioFormats,
        visibility,
        voicesUrl,
        websocketUrl,
        connectTimeoutMs,
        contactEmail,
        createdAt,
        dataRetentionPolicyUrl,
        documentationUrl,
        reviewNotes,
        reviewStatus,
        reviewedAt,
        updatedAt,
        voicesApiKeyRef,
        voicesCount,
        voicesDegraded,
        voicesFetchedAt,
        mutableMapOf(),
    )

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * What the engine supports. An unknown key is rejected.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun capabilities(): CommunityTtsEngineCapabilities = capabilities.getRequired("capabilities")

    /**
     * The engine's unique name: the first part of its voices.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Whether the engine can serve traffic right now, independent of `visibility` and
     * `review_status`. `draft`: not yet approved (new and awaiting its first review, rejected and
     * awaiting a fix, or approved earlier and awaiting re-review after a review-sensitive change).
     * `active`: serving traffic. `disabled`: owner-paused, reversible via `enable`. `suspended`:
     * paused by Telnyx (repeated failures of a public engine, or an abuse action); the owner cannot
     * clear this by calling `enable`, and Telnyx can reinstate it.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): CommunityTtsEngineStatus = status.getRequired("status")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun supportedAudioFormats(): List<CommunityTtsAudioFormat> =
        supportedAudioFormats.getRequired("supported_audio_formats")

    /**
     * `private`: only your organization can use the engine. `public`: any organization can, once it
     * is `active`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun visibility(): CommunityTtsEngineVisibility = visibility.getRequired("visibility")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun voicesUrl(): String = voicesUrl.getRequired("voices_url")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun websocketUrl(): String = websocketUrl.getRequired("websocket_url")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun connectTimeoutMs(): Optional<Long> = connectTimeoutMs.getOptional("connect_timeout_ms")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contactEmail(): Optional<String> = contactEmail.getOptional("contact_email")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dataRetentionPolicyUrl(): Optional<String> =
        dataRetentionPolicyUrl.getOptional("data_retention_policy_url")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun documentationUrl(): Optional<String> = documentationUrl.getOptional("documentation_url")

    /**
     * The reviewer's notes on a rejection.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reviewNotes(): Optional<String> = reviewNotes.getOptional("review_notes")

    /**
     * `null`: never submitted, or an approved engine whose review-sensitive field changed and
     * awaits re-review. `pending`: submitted. `approved`: approved. `rejected`: rejected, with
     * `review_notes`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reviewStatus(): Optional<ReviewStatus> = reviewStatus.getOptional("review_status")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reviewedAt(): Optional<OffsetDateTime> = reviewedAt.getOptional("reviewed_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun voicesApiKeyRef(): Optional<String> = voicesApiKeyRef.getOptional("voices_api_key_ref")

    /**
     * The number of voices in the stored list.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun voicesCount(): Optional<Long> = voicesCount.getOptional("voices_count")

    /**
     * `true` after three failed reads in a row, until a read succeeds. A degraded engine keeps
     * serving from its last list.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun voicesDegraded(): Optional<Boolean> = voicesDegraded.getOptional("voices_degraded")

    /**
     * When the stored list was last read successfully.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun voicesFetchedAt(): Optional<OffsetDateTime> =
        voicesFetchedAt.getOptional("voices_fetched_at")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [capabilities].
     *
     * Unlike [capabilities], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("capabilities")
    @ExcludeMissing
    fun _capabilities(): JsonField<CommunityTtsEngineCapabilities> = capabilities

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status")
    @ExcludeMissing
    fun _status(): JsonField<CommunityTtsEngineStatus> = status

    /**
     * Returns the raw JSON value of [supportedAudioFormats].
     *
     * Unlike [supportedAudioFormats], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("supported_audio_formats")
    @ExcludeMissing
    fun _supportedAudioFormats(): JsonField<List<CommunityTtsAudioFormat>> = supportedAudioFormats

    /**
     * Returns the raw JSON value of [visibility].
     *
     * Unlike [visibility], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("visibility")
    @ExcludeMissing
    fun _visibility(): JsonField<CommunityTtsEngineVisibility> = visibility

    /**
     * Returns the raw JSON value of [voicesUrl].
     *
     * Unlike [voicesUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("voices_url") @ExcludeMissing fun _voicesUrl(): JsonField<String> = voicesUrl

    /**
     * Returns the raw JSON value of [websocketUrl].
     *
     * Unlike [websocketUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("websocket_url")
    @ExcludeMissing
    fun _websocketUrl(): JsonField<String> = websocketUrl

    /**
     * Returns the raw JSON value of [connectTimeoutMs].
     *
     * Unlike [connectTimeoutMs], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("connect_timeout_ms")
    @ExcludeMissing
    fun _connectTimeoutMs(): JsonField<Long> = connectTimeoutMs

    /**
     * Returns the raw JSON value of [contactEmail].
     *
     * Unlike [contactEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contact_email")
    @ExcludeMissing
    fun _contactEmail(): JsonField<String> = contactEmail

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [dataRetentionPolicyUrl].
     *
     * Unlike [dataRetentionPolicyUrl], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("data_retention_policy_url")
    @ExcludeMissing
    fun _dataRetentionPolicyUrl(): JsonField<String> = dataRetentionPolicyUrl

    /**
     * Returns the raw JSON value of [documentationUrl].
     *
     * Unlike [documentationUrl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("documentation_url")
    @ExcludeMissing
    fun _documentationUrl(): JsonField<String> = documentationUrl

    /**
     * Returns the raw JSON value of [reviewNotes].
     *
     * Unlike [reviewNotes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("review_notes")
    @ExcludeMissing
    fun _reviewNotes(): JsonField<String> = reviewNotes

    /**
     * Returns the raw JSON value of [reviewStatus].
     *
     * Unlike [reviewStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("review_status")
    @ExcludeMissing
    fun _reviewStatus(): JsonField<ReviewStatus> = reviewStatus

    /**
     * Returns the raw JSON value of [reviewedAt].
     *
     * Unlike [reviewedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reviewed_at")
    @ExcludeMissing
    fun _reviewedAt(): JsonField<OffsetDateTime> = reviewedAt

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [voicesApiKeyRef].
     *
     * Unlike [voicesApiKeyRef], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("voices_api_key_ref")
    @ExcludeMissing
    fun _voicesApiKeyRef(): JsonField<String> = voicesApiKeyRef

    /**
     * Returns the raw JSON value of [voicesCount].
     *
     * Unlike [voicesCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("voices_count") @ExcludeMissing fun _voicesCount(): JsonField<Long> = voicesCount

    /**
     * Returns the raw JSON value of [voicesDegraded].
     *
     * Unlike [voicesDegraded], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("voices_degraded")
    @ExcludeMissing
    fun _voicesDegraded(): JsonField<Boolean> = voicesDegraded

    /**
     * Returns the raw JSON value of [voicesFetchedAt].
     *
     * Unlike [voicesFetchedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("voices_fetched_at")
    @ExcludeMissing
    fun _voicesFetchedAt(): JsonField<OffsetDateTime> = voicesFetchedAt

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
         * Returns a mutable builder for constructing an instance of [CommunityTtsEngine].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .capabilities()
         * .name()
         * .status()
         * .supportedAudioFormats()
         * .visibility()
         * .voicesUrl()
         * .websocketUrl()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CommunityTtsEngine]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var capabilities: JsonField<CommunityTtsEngineCapabilities>? = null
        private var name: JsonField<String>? = null
        private var status: JsonField<CommunityTtsEngineStatus>? = null
        private var supportedAudioFormats: JsonField<MutableList<CommunityTtsAudioFormat>>? = null
        private var visibility: JsonField<CommunityTtsEngineVisibility>? = null
        private var voicesUrl: JsonField<String>? = null
        private var websocketUrl: JsonField<String>? = null
        private var connectTimeoutMs: JsonField<Long> = JsonMissing.of()
        private var contactEmail: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dataRetentionPolicyUrl: JsonField<String> = JsonMissing.of()
        private var documentationUrl: JsonField<String> = JsonMissing.of()
        private var reviewNotes: JsonField<String> = JsonMissing.of()
        private var reviewStatus: JsonField<ReviewStatus> = JsonMissing.of()
        private var reviewedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var voicesApiKeyRef: JsonField<String> = JsonMissing.of()
        private var voicesCount: JsonField<Long> = JsonMissing.of()
        private var voicesDegraded: JsonField<Boolean> = JsonMissing.of()
        private var voicesFetchedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(communityTtsEngine: CommunityTtsEngine) = apply {
            id = communityTtsEngine.id
            capabilities = communityTtsEngine.capabilities
            name = communityTtsEngine.name
            status = communityTtsEngine.status
            supportedAudioFormats =
                communityTtsEngine.supportedAudioFormats.map { it.toMutableList() }
            visibility = communityTtsEngine.visibility
            voicesUrl = communityTtsEngine.voicesUrl
            websocketUrl = communityTtsEngine.websocketUrl
            connectTimeoutMs = communityTtsEngine.connectTimeoutMs
            contactEmail = communityTtsEngine.contactEmail
            createdAt = communityTtsEngine.createdAt
            dataRetentionPolicyUrl = communityTtsEngine.dataRetentionPolicyUrl
            documentationUrl = communityTtsEngine.documentationUrl
            reviewNotes = communityTtsEngine.reviewNotes
            reviewStatus = communityTtsEngine.reviewStatus
            reviewedAt = communityTtsEngine.reviewedAt
            updatedAt = communityTtsEngine.updatedAt
            voicesApiKeyRef = communityTtsEngine.voicesApiKeyRef
            voicesCount = communityTtsEngine.voicesCount
            voicesDegraded = communityTtsEngine.voicesDegraded
            voicesFetchedAt = communityTtsEngine.voicesFetchedAt
            additionalProperties = communityTtsEngine.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** What the engine supports. An unknown key is rejected. */
        fun capabilities(capabilities: CommunityTtsEngineCapabilities) =
            capabilities(JsonField.of(capabilities))

        /**
         * Sets [Builder.capabilities] to an arbitrary JSON value.
         *
         * You should usually call [Builder.capabilities] with a well-typed
         * [CommunityTtsEngineCapabilities] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun capabilities(capabilities: JsonField<CommunityTtsEngineCapabilities>) = apply {
            this.capabilities = capabilities
        }

        /** The engine's unique name: the first part of its voices. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * Whether the engine can serve traffic right now, independent of `visibility` and
         * `review_status`. `draft`: not yet approved (new and awaiting its first review, rejected
         * and awaiting a fix, or approved earlier and awaiting re-review after a review-sensitive
         * change). `active`: serving traffic. `disabled`: owner-paused, reversible via `enable`.
         * `suspended`: paused by Telnyx (repeated failures of a public engine, or an abuse action);
         * the owner cannot clear this by calling `enable`, and Telnyx can reinstate it.
         */
        fun status(status: CommunityTtsEngineStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [CommunityTtsEngineStatus]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun status(status: JsonField<CommunityTtsEngineStatus>) = apply { this.status = status }

        fun supportedAudioFormats(supportedAudioFormats: List<CommunityTtsAudioFormat>) =
            supportedAudioFormats(JsonField.of(supportedAudioFormats))

        /**
         * Sets [Builder.supportedAudioFormats] to an arbitrary JSON value.
         *
         * You should usually call [Builder.supportedAudioFormats] with a well-typed
         * `List<CommunityTtsAudioFormat>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun supportedAudioFormats(supportedAudioFormats: JsonField<List<CommunityTtsAudioFormat>>) =
            apply {
                this.supportedAudioFormats = supportedAudioFormats.map { it.toMutableList() }
            }

        /**
         * Adds a single [CommunityTtsAudioFormat] to [supportedAudioFormats].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSupportedAudioFormat(supportedAudioFormat: CommunityTtsAudioFormat) = apply {
            supportedAudioFormats =
                (supportedAudioFormats ?: JsonField.of(mutableListOf())).also {
                    checkKnown("supportedAudioFormats", it).add(supportedAudioFormat)
                }
        }

        /**
         * `private`: only your organization can use the engine. `public`: any organization can,
         * once it is `active`.
         */
        fun visibility(visibility: CommunityTtsEngineVisibility) =
            visibility(JsonField.of(visibility))

        /**
         * Sets [Builder.visibility] to an arbitrary JSON value.
         *
         * You should usually call [Builder.visibility] with a well-typed
         * [CommunityTtsEngineVisibility] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun visibility(visibility: JsonField<CommunityTtsEngineVisibility>) = apply {
            this.visibility = visibility
        }

        fun voicesUrl(voicesUrl: String) = voicesUrl(JsonField.of(voicesUrl))

        /**
         * Sets [Builder.voicesUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voicesUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun voicesUrl(voicesUrl: JsonField<String>) = apply { this.voicesUrl = voicesUrl }

        fun websocketUrl(websocketUrl: String) = websocketUrl(JsonField.of(websocketUrl))

        /**
         * Sets [Builder.websocketUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.websocketUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun websocketUrl(websocketUrl: JsonField<String>) = apply {
            this.websocketUrl = websocketUrl
        }

        fun connectTimeoutMs(connectTimeoutMs: Long) =
            connectTimeoutMs(JsonField.of(connectTimeoutMs))

        /**
         * Sets [Builder.connectTimeoutMs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connectTimeoutMs] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun connectTimeoutMs(connectTimeoutMs: JsonField<Long>) = apply {
            this.connectTimeoutMs = connectTimeoutMs
        }

        fun contactEmail(contactEmail: String?) = contactEmail(JsonField.ofNullable(contactEmail))

        /** Alias for calling [Builder.contactEmail] with `contactEmail.orElse(null)`. */
        fun contactEmail(contactEmail: Optional<String>) = contactEmail(contactEmail.getOrNull())

        /**
         * Sets [Builder.contactEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contactEmail] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contactEmail(contactEmail: JsonField<String>) = apply {
            this.contactEmail = contactEmail
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun dataRetentionPolicyUrl(dataRetentionPolicyUrl: String?) =
            dataRetentionPolicyUrl(JsonField.ofNullable(dataRetentionPolicyUrl))

        /**
         * Alias for calling [Builder.dataRetentionPolicyUrl] with
         * `dataRetentionPolicyUrl.orElse(null)`.
         */
        fun dataRetentionPolicyUrl(dataRetentionPolicyUrl: Optional<String>) =
            dataRetentionPolicyUrl(dataRetentionPolicyUrl.getOrNull())

        /**
         * Sets [Builder.dataRetentionPolicyUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataRetentionPolicyUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dataRetentionPolicyUrl(dataRetentionPolicyUrl: JsonField<String>) = apply {
            this.dataRetentionPolicyUrl = dataRetentionPolicyUrl
        }

        fun documentationUrl(documentationUrl: String?) =
            documentationUrl(JsonField.ofNullable(documentationUrl))

        /** Alias for calling [Builder.documentationUrl] with `documentationUrl.orElse(null)`. */
        fun documentationUrl(documentationUrl: Optional<String>) =
            documentationUrl(documentationUrl.getOrNull())

        /**
         * Sets [Builder.documentationUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documentationUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun documentationUrl(documentationUrl: JsonField<String>) = apply {
            this.documentationUrl = documentationUrl
        }

        /** The reviewer's notes on a rejection. */
        fun reviewNotes(reviewNotes: String?) = reviewNotes(JsonField.ofNullable(reviewNotes))

        /** Alias for calling [Builder.reviewNotes] with `reviewNotes.orElse(null)`. */
        fun reviewNotes(reviewNotes: Optional<String>) = reviewNotes(reviewNotes.getOrNull())

        /**
         * Sets [Builder.reviewNotes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reviewNotes] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun reviewNotes(reviewNotes: JsonField<String>) = apply { this.reviewNotes = reviewNotes }

        /**
         * `null`: never submitted, or an approved engine whose review-sensitive field changed and
         * awaits re-review. `pending`: submitted. `approved`: approved. `rejected`: rejected, with
         * `review_notes`.
         */
        fun reviewStatus(reviewStatus: ReviewStatus?) =
            reviewStatus(JsonField.ofNullable(reviewStatus))

        /** Alias for calling [Builder.reviewStatus] with `reviewStatus.orElse(null)`. */
        fun reviewStatus(reviewStatus: Optional<ReviewStatus>) =
            reviewStatus(reviewStatus.getOrNull())

        /**
         * Sets [Builder.reviewStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reviewStatus] with a well-typed [ReviewStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun reviewStatus(reviewStatus: JsonField<ReviewStatus>) = apply {
            this.reviewStatus = reviewStatus
        }

        fun reviewedAt(reviewedAt: OffsetDateTime?) = reviewedAt(JsonField.ofNullable(reviewedAt))

        /** Alias for calling [Builder.reviewedAt] with `reviewedAt.orElse(null)`. */
        fun reviewedAt(reviewedAt: Optional<OffsetDateTime>) = reviewedAt(reviewedAt.getOrNull())

        /**
         * Sets [Builder.reviewedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reviewedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun reviewedAt(reviewedAt: JsonField<OffsetDateTime>) = apply {
            this.reviewedAt = reviewedAt
        }

        fun updatedAt(updatedAt: OffsetDateTime?) = updatedAt(JsonField.ofNullable(updatedAt))

        /** Alias for calling [Builder.updatedAt] with `updatedAt.orElse(null)`. */
        fun updatedAt(updatedAt: Optional<OffsetDateTime>) = updatedAt(updatedAt.getOrNull())

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun voicesApiKeyRef(voicesApiKeyRef: String?) =
            voicesApiKeyRef(JsonField.ofNullable(voicesApiKeyRef))

        /** Alias for calling [Builder.voicesApiKeyRef] with `voicesApiKeyRef.orElse(null)`. */
        fun voicesApiKeyRef(voicesApiKeyRef: Optional<String>) =
            voicesApiKeyRef(voicesApiKeyRef.getOrNull())

        /**
         * Sets [Builder.voicesApiKeyRef] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voicesApiKeyRef] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun voicesApiKeyRef(voicesApiKeyRef: JsonField<String>) = apply {
            this.voicesApiKeyRef = voicesApiKeyRef
        }

        /** The number of voices in the stored list. */
        fun voicesCount(voicesCount: Long) = voicesCount(JsonField.of(voicesCount))

        /**
         * Sets [Builder.voicesCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voicesCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun voicesCount(voicesCount: JsonField<Long>) = apply { this.voicesCount = voicesCount }

        /**
         * `true` after three failed reads in a row, until a read succeeds. A degraded engine keeps
         * serving from its last list.
         */
        fun voicesDegraded(voicesDegraded: Boolean) = voicesDegraded(JsonField.of(voicesDegraded))

        /**
         * Sets [Builder.voicesDegraded] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voicesDegraded] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun voicesDegraded(voicesDegraded: JsonField<Boolean>) = apply {
            this.voicesDegraded = voicesDegraded
        }

        /** When the stored list was last read successfully. */
        fun voicesFetchedAt(voicesFetchedAt: OffsetDateTime?) =
            voicesFetchedAt(JsonField.ofNullable(voicesFetchedAt))

        /** Alias for calling [Builder.voicesFetchedAt] with `voicesFetchedAt.orElse(null)`. */
        fun voicesFetchedAt(voicesFetchedAt: Optional<OffsetDateTime>) =
            voicesFetchedAt(voicesFetchedAt.getOrNull())

        /**
         * Sets [Builder.voicesFetchedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voicesFetchedAt] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun voicesFetchedAt(voicesFetchedAt: JsonField<OffsetDateTime>) = apply {
            this.voicesFetchedAt = voicesFetchedAt
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
         * Returns an immutable instance of [CommunityTtsEngine].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .capabilities()
         * .name()
         * .status()
         * .supportedAudioFormats()
         * .visibility()
         * .voicesUrl()
         * .websocketUrl()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CommunityTtsEngine =
            CommunityTtsEngine(
                checkRequired("id", id),
                checkRequired("capabilities", capabilities),
                checkRequired("name", name),
                checkRequired("status", status),
                checkRequired("supportedAudioFormats", supportedAudioFormats).map {
                    it.toImmutable()
                },
                checkRequired("visibility", visibility),
                checkRequired("voicesUrl", voicesUrl),
                checkRequired("websocketUrl", websocketUrl),
                connectTimeoutMs,
                contactEmail,
                createdAt,
                dataRetentionPolicyUrl,
                documentationUrl,
                reviewNotes,
                reviewStatus,
                reviewedAt,
                updatedAt,
                voicesApiKeyRef,
                voicesCount,
                voicesDegraded,
                voicesFetchedAt,
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
    fun validate(): CommunityTtsEngine = apply {
        if (validated) {
            return@apply
        }

        id()
        capabilities().validate()
        name()
        status().validate()
        supportedAudioFormats().forEach { it.validate() }
        visibility().validate()
        voicesUrl()
        websocketUrl()
        connectTimeoutMs()
        contactEmail()
        createdAt()
        dataRetentionPolicyUrl()
        documentationUrl()
        reviewNotes()
        reviewStatus().ifPresent { it.validate() }
        reviewedAt()
        updatedAt()
        voicesApiKeyRef()
        voicesCount()
        voicesDegraded()
        voicesFetchedAt()
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
            (capabilities.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (supportedAudioFormats.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (visibility.asKnown().getOrNull()?.validity() ?: 0) +
            (if (voicesUrl.asKnown().isPresent) 1 else 0) +
            (if (websocketUrl.asKnown().isPresent) 1 else 0) +
            (if (connectTimeoutMs.asKnown().isPresent) 1 else 0) +
            (if (contactEmail.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (dataRetentionPolicyUrl.asKnown().isPresent) 1 else 0) +
            (if (documentationUrl.asKnown().isPresent) 1 else 0) +
            (if (reviewNotes.asKnown().isPresent) 1 else 0) +
            (reviewStatus.asKnown().getOrNull()?.validity() ?: 0) +
            (if (reviewedAt.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (voicesApiKeyRef.asKnown().isPresent) 1 else 0) +
            (if (voicesCount.asKnown().isPresent) 1 else 0) +
            (if (voicesDegraded.asKnown().isPresent) 1 else 0) +
            (if (voicesFetchedAt.asKnown().isPresent) 1 else 0)

    /**
     * `null`: never submitted, or an approved engine whose review-sensitive field changed and
     * awaits re-review. `pending`: submitted. `approved`: approved. `rejected`: rejected, with
     * `review_notes`.
     */
    class ReviewStatus @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val PENDING = of("pending")

            @JvmField val APPROVED = of("approved")

            @JvmField val REJECTED = of("rejected")

            @JvmStatic fun of(value: String) = ReviewStatus(JsonField.of(value))
        }

        /** An enum containing [ReviewStatus]'s known values. */
        enum class Known {
            PENDING,
            APPROVED,
            REJECTED,
        }

        /**
         * An enum containing [ReviewStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ReviewStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PENDING,
            APPROVED,
            REJECTED,
            /**
             * An enum member indicating that [ReviewStatus] was instantiated with an unknown value.
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
                PENDING -> Value.PENDING
                APPROVED -> Value.APPROVED
                REJECTED -> Value.REJECTED
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
                PENDING -> Known.PENDING
                APPROVED -> Known.APPROVED
                REJECTED -> Known.REJECTED
                else -> throw TelnyxInvalidDataException("Unknown ReviewStatus: $value")
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
        fun validate(): ReviewStatus = apply {
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

            return other is ReviewStatus && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CommunityTtsEngine &&
            id == other.id &&
            capabilities == other.capabilities &&
            name == other.name &&
            status == other.status &&
            supportedAudioFormats == other.supportedAudioFormats &&
            visibility == other.visibility &&
            voicesUrl == other.voicesUrl &&
            websocketUrl == other.websocketUrl &&
            connectTimeoutMs == other.connectTimeoutMs &&
            contactEmail == other.contactEmail &&
            createdAt == other.createdAt &&
            dataRetentionPolicyUrl == other.dataRetentionPolicyUrl &&
            documentationUrl == other.documentationUrl &&
            reviewNotes == other.reviewNotes &&
            reviewStatus == other.reviewStatus &&
            reviewedAt == other.reviewedAt &&
            updatedAt == other.updatedAt &&
            voicesApiKeyRef == other.voicesApiKeyRef &&
            voicesCount == other.voicesCount &&
            voicesDegraded == other.voicesDegraded &&
            voicesFetchedAt == other.voicesFetchedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            capabilities,
            name,
            status,
            supportedAudioFormats,
            visibility,
            voicesUrl,
            websocketUrl,
            connectTimeoutMs,
            contactEmail,
            createdAt,
            dataRetentionPolicyUrl,
            documentationUrl,
            reviewNotes,
            reviewStatus,
            reviewedAt,
            updatedAt,
            voicesApiKeyRef,
            voicesCount,
            voicesDegraded,
            voicesFetchedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CommunityTtsEngine{id=$id, capabilities=$capabilities, name=$name, status=$status, supportedAudioFormats=$supportedAudioFormats, visibility=$visibility, voicesUrl=$voicesUrl, websocketUrl=$websocketUrl, connectTimeoutMs=$connectTimeoutMs, contactEmail=$contactEmail, createdAt=$createdAt, dataRetentionPolicyUrl=$dataRetentionPolicyUrl, documentationUrl=$documentationUrl, reviewNotes=$reviewNotes, reviewStatus=$reviewStatus, reviewedAt=$reviewedAt, updatedAt=$updatedAt, voicesApiKeyRef=$voicesApiKeyRef, voicesCount=$voicesCount, voicesDegraded=$voicesDegraded, voicesFetchedAt=$voicesFetchedAt, additionalProperties=$additionalProperties}"
}
