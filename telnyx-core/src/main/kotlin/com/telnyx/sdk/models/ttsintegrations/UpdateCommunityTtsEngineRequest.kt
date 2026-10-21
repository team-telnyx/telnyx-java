// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ttsintegrations

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Only the fields you send change. `name` cannot be changed. Sending `null` for `websocket_url`,
 * `voices_url`, `supported_audio_formats`, `capabilities` or `connect_timeout_ms` is refused.
 * Changing `websocket_url`, `voices_url`, `supported_audio_formats` or `capabilities`, or making a
 * `private` engine `public`, sends the engine back to `status: draft` and clears its review.
 */
class UpdateCommunityTtsEngineRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val capabilities: JsonField<CommunityTtsEngineCapabilities>,
    private val connectTimeoutMs: JsonField<Long>,
    private val contactEmail: JsonField<String>,
    private val dataRetentionPolicyUrl: JsonField<String>,
    private val documentationUrl: JsonField<String>,
    private val supportedAudioFormats: JsonField<List<CommunityTtsAudioFormat>>,
    private val visibility: JsonField<CommunityTtsEngineVisibility>,
    private val voicesApiKeyRef: JsonField<String>,
    private val voicesUrl: JsonField<String>,
    private val websocketUrl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("capabilities")
        @ExcludeMissing
        capabilities: JsonField<CommunityTtsEngineCapabilities> = JsonMissing.of(),
        @JsonProperty("connect_timeout_ms")
        @ExcludeMissing
        connectTimeoutMs: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("contact_email")
        @ExcludeMissing
        contactEmail: JsonField<String> = JsonMissing.of(),
        @JsonProperty("data_retention_policy_url")
        @ExcludeMissing
        dataRetentionPolicyUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("documentation_url")
        @ExcludeMissing
        documentationUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("supported_audio_formats")
        @ExcludeMissing
        supportedAudioFormats: JsonField<List<CommunityTtsAudioFormat>> = JsonMissing.of(),
        @JsonProperty("visibility")
        @ExcludeMissing
        visibility: JsonField<CommunityTtsEngineVisibility> = JsonMissing.of(),
        @JsonProperty("voices_api_key_ref")
        @ExcludeMissing
        voicesApiKeyRef: JsonField<String> = JsonMissing.of(),
        @JsonProperty("voices_url") @ExcludeMissing voicesUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("websocket_url")
        @ExcludeMissing
        websocketUrl: JsonField<String> = JsonMissing.of(),
    ) : this(
        capabilities,
        connectTimeoutMs,
        contactEmail,
        dataRetentionPolicyUrl,
        documentationUrl,
        supportedAudioFormats,
        visibility,
        voicesApiKeyRef,
        voicesUrl,
        websocketUrl,
        mutableMapOf(),
    )

    /**
     * What the engine supports. An unknown key is rejected.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun capabilities(): Optional<CommunityTtsEngineCapabilities> =
        capabilities.getOptional("capabilities")

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
    fun dataRetentionPolicyUrl(): Optional<String> =
        dataRetentionPolicyUrl.getOptional("data_retention_policy_url")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun documentationUrl(): Optional<String> = documentationUrl.getOptional("documentation_url")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun supportedAudioFormats(): Optional<List<CommunityTtsAudioFormat>> =
        supportedAudioFormats.getOptional("supported_audio_formats")

    /**
     * `private`: only your organization can use the engine. `public`: any organization can, once it
     * is `active`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun visibility(): Optional<CommunityTtsEngineVisibility> = visibility.getOptional("visibility")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun voicesApiKeyRef(): Optional<String> = voicesApiKeyRef.getOptional("voices_api_key_ref")

    /**
     * See the create request.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun voicesUrl(): Optional<String> = voicesUrl.getOptional("voices_url")

    /**
     * See the create request.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun websocketUrl(): Optional<String> = websocketUrl.getOptional("websocket_url")

    /**
     * Returns the raw JSON value of [capabilities].
     *
     * Unlike [capabilities], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("capabilities")
    @ExcludeMissing
    fun _capabilities(): JsonField<CommunityTtsEngineCapabilities> = capabilities

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
     * Returns the raw JSON value of [voicesApiKeyRef].
     *
     * Unlike [voicesApiKeyRef], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("voices_api_key_ref")
    @ExcludeMissing
    fun _voicesApiKeyRef(): JsonField<String> = voicesApiKeyRef

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
         * [UpdateCommunityTtsEngineRequest].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UpdateCommunityTtsEngineRequest]. */
    class Builder internal constructor() {

        private var capabilities: JsonField<CommunityTtsEngineCapabilities> = JsonMissing.of()
        private var connectTimeoutMs: JsonField<Long> = JsonMissing.of()
        private var contactEmail: JsonField<String> = JsonMissing.of()
        private var dataRetentionPolicyUrl: JsonField<String> = JsonMissing.of()
        private var documentationUrl: JsonField<String> = JsonMissing.of()
        private var supportedAudioFormats: JsonField<MutableList<CommunityTtsAudioFormat>>? = null
        private var visibility: JsonField<CommunityTtsEngineVisibility> = JsonMissing.of()
        private var voicesApiKeyRef: JsonField<String> = JsonMissing.of()
        private var voicesUrl: JsonField<String> = JsonMissing.of()
        private var websocketUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(updateCommunityTtsEngineRequest: UpdateCommunityTtsEngineRequest) =
            apply {
                capabilities = updateCommunityTtsEngineRequest.capabilities
                connectTimeoutMs = updateCommunityTtsEngineRequest.connectTimeoutMs
                contactEmail = updateCommunityTtsEngineRequest.contactEmail
                dataRetentionPolicyUrl = updateCommunityTtsEngineRequest.dataRetentionPolicyUrl
                documentationUrl = updateCommunityTtsEngineRequest.documentationUrl
                supportedAudioFormats =
                    updateCommunityTtsEngineRequest.supportedAudioFormats.map { it.toMutableList() }
                visibility = updateCommunityTtsEngineRequest.visibility
                voicesApiKeyRef = updateCommunityTtsEngineRequest.voicesApiKeyRef
                voicesUrl = updateCommunityTtsEngineRequest.voicesUrl
                websocketUrl = updateCommunityTtsEngineRequest.websocketUrl
                additionalProperties =
                    updateCommunityTtsEngineRequest.additionalProperties.toMutableMap()
            }

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

        /** See the create request. */
        fun voicesUrl(voicesUrl: String) = voicesUrl(JsonField.of(voicesUrl))

        /**
         * Sets [Builder.voicesUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voicesUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun voicesUrl(voicesUrl: JsonField<String>) = apply { this.voicesUrl = voicesUrl }

        /** See the create request. */
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
         * Returns an immutable instance of [UpdateCommunityTtsEngineRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UpdateCommunityTtsEngineRequest =
            UpdateCommunityTtsEngineRequest(
                capabilities,
                connectTimeoutMs,
                contactEmail,
                dataRetentionPolicyUrl,
                documentationUrl,
                (supportedAudioFormats ?: JsonMissing.of()).map { it.toImmutable() },
                visibility,
                voicesApiKeyRef,
                voicesUrl,
                websocketUrl,
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
    fun validate(): UpdateCommunityTtsEngineRequest = apply {
        if (validated) {
            return@apply
        }

        capabilities().ifPresent { it.validate() }
        connectTimeoutMs()
        contactEmail()
        dataRetentionPolicyUrl()
        documentationUrl()
        supportedAudioFormats().ifPresent { it.forEach { it.validate() } }
        visibility().ifPresent { it.validate() }
        voicesApiKeyRef()
        voicesUrl()
        websocketUrl()
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
        (capabilities.asKnown().getOrNull()?.validity() ?: 0) +
            (if (connectTimeoutMs.asKnown().isPresent) 1 else 0) +
            (if (contactEmail.asKnown().isPresent) 1 else 0) +
            (if (dataRetentionPolicyUrl.asKnown().isPresent) 1 else 0) +
            (if (documentationUrl.asKnown().isPresent) 1 else 0) +
            (supportedAudioFormats.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (visibility.asKnown().getOrNull()?.validity() ?: 0) +
            (if (voicesApiKeyRef.asKnown().isPresent) 1 else 0) +
            (if (voicesUrl.asKnown().isPresent) 1 else 0) +
            (if (websocketUrl.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UpdateCommunityTtsEngineRequest &&
            capabilities == other.capabilities &&
            connectTimeoutMs == other.connectTimeoutMs &&
            contactEmail == other.contactEmail &&
            dataRetentionPolicyUrl == other.dataRetentionPolicyUrl &&
            documentationUrl == other.documentationUrl &&
            supportedAudioFormats == other.supportedAudioFormats &&
            visibility == other.visibility &&
            voicesApiKeyRef == other.voicesApiKeyRef &&
            voicesUrl == other.voicesUrl &&
            websocketUrl == other.websocketUrl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            capabilities,
            connectTimeoutMs,
            contactEmail,
            dataRetentionPolicyUrl,
            documentationUrl,
            supportedAudioFormats,
            visibility,
            voicesApiKeyRef,
            voicesUrl,
            websocketUrl,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UpdateCommunityTtsEngineRequest{capabilities=$capabilities, connectTimeoutMs=$connectTimeoutMs, contactEmail=$contactEmail, dataRetentionPolicyUrl=$dataRetentionPolicyUrl, documentationUrl=$documentationUrl, supportedAudioFormats=$supportedAudioFormats, visibility=$visibility, voicesApiKeyRef=$voicesApiKeyRef, voicesUrl=$voicesUrl, websocketUrl=$websocketUrl, additionalProperties=$additionalProperties}"
}
