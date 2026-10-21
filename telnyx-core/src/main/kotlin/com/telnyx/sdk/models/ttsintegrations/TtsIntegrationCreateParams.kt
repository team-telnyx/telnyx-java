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
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Register a WebSocket text-to-speech engine. Telnyx reads the engine's `voices_url` while it
 * registers the engine and refuses the registration with a `422` if the list is unreachable or
 * invalid. The engine starts at `status: draft` and cannot serve other organizations' traffic until
 * Telnyx approves it (your own organization can try it with its own key meanwhile). It is
 * `visibility: private` unless you set `public`: a private engine can be used only by your
 * organization, a public one by any organization once it is `active`. See the
 * [Community TTS engines guide](/docs/voice/tts/community-engines) for the full review flow.
 *
 * `websocket_url` must be `wss://` and `voices_url` must be `https://`, both on a public host; a
 * plain `ws://` URL is rejected, and so is a credential embedded in either. Callers bring their own
 * key for your engine: Telnyx stores none, so there is nothing to register here for synthesis.
 * `voices_api_key_ref` is optional and used only to read your voice list.
 */
class TtsIntegrationCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * What the engine supports. An unknown key is rejected.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun capabilities(): CommunityTtsEngineCapabilities = body.capabilities()

    /**
     * The engine's unique name, and the first part of its voices (`<name>.<voice_id>`). 1-64
     * characters: lowercase letters, digits, hyphens and underscores, starting with a letter or
     * digit. Built-in vendor names and the generic voice names `male`, `female`, `man`, `woman`,
     * `alice` and `custom` are reserved. Unique across all Telnyx accounts and cannot be changed
     * later. A deleted engine's name stays reserved for the organization that owned it.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * The audio formats the engine can produce, at least one, without duplicates.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun supportedAudioFormats(): List<CommunityTtsAudioFormat> = body.supportedAudioFormats()

    /**
     * The `https://` URL of the engine's voice listing, with the same host rules. It answers `GET`
     * with `{"voices": [{"provider", "name", "voice_id", "language", "gender"}]}`: at most 1000
     * voices, each `voice_id` unique and matching `^[A-Za-z0-9][A-Za-z0-9_-]{0,127}$`, each
     * `language` at most 35 characters. Telnyx reads it when the engine is registered or updated,
     * every 15 minutes, and on `refresh_voices`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun voicesUrl(): String = body.voicesUrl()

    /**
     * The `wss://` URL Telnyx connects to. It must be reachable on the public internet: plain
     * `ws://`, private, loopback, link-local, shared, documentation, multicast and reserved
     * addresses, and internal hostnames are rejected, as are credentials embedded in the URL or in
     * credential-looking query parameters. At most 2048 characters.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun websocketUrl(): String = body.websocketUrl()

    /**
     * How long Telnyx waits for the WebSocket connection to open, from 500 to 10000. Default: 3000.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun connectTimeoutMs(): Optional<Long> = body.connectTimeoutMs()

    /**
     * A contact address stored for the Telnyx platform team. Telnyx does not email it
     * automatically. At most 254 characters.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contactEmail(): Optional<String> = body.contactEmail()

    /**
     * URL of the publisher's data retention policy, at most 2048 characters. It is returned in the
     * discoverable listing.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dataRetentionPolicyUrl(): Optional<String> = body.dataRetentionPolicyUrl()

    /**
     * An `https://` page where callers learn how to get a key for the engine and how to use it,
     * with a host and no credentials in it, at most 2048 characters. It is returned in the
     * discoverable listing.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun documentationUrl(): Optional<String> = body.documentationUrl()

    /**
     * `private`: only your organization can use the engine. `public`: any organization can, once it
     * is `active`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun visibility(): Optional<CommunityTtsEngineVisibility> = body.visibility()

    /**
     * The identifier of an Integration Secret in your organization. When set, Telnyx sends its
     * value as a bearer token when it reads `voices_url`. It is never used for synthesis. Send
     * `null` on an update to clear it. At most 255 characters.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun voicesApiKeyRef(): Optional<String> = body.voicesApiKeyRef()

    /**
     * Returns the raw JSON value of [capabilities].
     *
     * Unlike [capabilities], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _capabilities(): JsonField<CommunityTtsEngineCapabilities> = body._capabilities()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [supportedAudioFormats].
     *
     * Unlike [supportedAudioFormats], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _supportedAudioFormats(): JsonField<List<CommunityTtsAudioFormat>> =
        body._supportedAudioFormats()

    /**
     * Returns the raw JSON value of [voicesUrl].
     *
     * Unlike [voicesUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _voicesUrl(): JsonField<String> = body._voicesUrl()

    /**
     * Returns the raw JSON value of [websocketUrl].
     *
     * Unlike [websocketUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _websocketUrl(): JsonField<String> = body._websocketUrl()

    /**
     * Returns the raw JSON value of [connectTimeoutMs].
     *
     * Unlike [connectTimeoutMs], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _connectTimeoutMs(): JsonField<Long> = body._connectTimeoutMs()

    /**
     * Returns the raw JSON value of [contactEmail].
     *
     * Unlike [contactEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _contactEmail(): JsonField<String> = body._contactEmail()

    /**
     * Returns the raw JSON value of [dataRetentionPolicyUrl].
     *
     * Unlike [dataRetentionPolicyUrl], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _dataRetentionPolicyUrl(): JsonField<String> = body._dataRetentionPolicyUrl()

    /**
     * Returns the raw JSON value of [documentationUrl].
     *
     * Unlike [documentationUrl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _documentationUrl(): JsonField<String> = body._documentationUrl()

    /**
     * Returns the raw JSON value of [visibility].
     *
     * Unlike [visibility], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _visibility(): JsonField<CommunityTtsEngineVisibility> = body._visibility()

    /**
     * Returns the raw JSON value of [voicesApiKeyRef].
     *
     * Unlike [voicesApiKeyRef], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _voicesApiKeyRef(): JsonField<String> = body._voicesApiKeyRef()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TtsIntegrationCreateParams].
         *
         * The following fields are required:
         * ```java
         * .capabilities()
         * .name()
         * .supportedAudioFormats()
         * .voicesUrl()
         * .websocketUrl()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TtsIntegrationCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(ttsIntegrationCreateParams: TtsIntegrationCreateParams) = apply {
            body = ttsIntegrationCreateParams.body.toBuilder()
            additionalHeaders = ttsIntegrationCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = ttsIntegrationCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [capabilities]
         * - [name]
         * - [supportedAudioFormats]
         * - [voicesUrl]
         * - [websocketUrl]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** What the engine supports. An unknown key is rejected. */
        fun capabilities(capabilities: CommunityTtsEngineCapabilities) = apply {
            body.capabilities(capabilities)
        }

        /**
         * Sets [Builder.capabilities] to an arbitrary JSON value.
         *
         * You should usually call [Builder.capabilities] with a well-typed
         * [CommunityTtsEngineCapabilities] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun capabilities(capabilities: JsonField<CommunityTtsEngineCapabilities>) = apply {
            body.capabilities(capabilities)
        }

        /**
         * The engine's unique name, and the first part of its voices (`<name>.<voice_id>`). 1-64
         * characters: lowercase letters, digits, hyphens and underscores, starting with a letter or
         * digit. Built-in vendor names and the generic voice names `male`, `female`, `man`,
         * `woman`, `alice` and `custom` are reserved. Unique across all Telnyx accounts and cannot
         * be changed later. A deleted engine's name stays reserved for the organization that owned
         * it.
         */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** The audio formats the engine can produce, at least one, without duplicates. */
        fun supportedAudioFormats(supportedAudioFormats: List<CommunityTtsAudioFormat>) = apply {
            body.supportedAudioFormats(supportedAudioFormats)
        }

        /**
         * Sets [Builder.supportedAudioFormats] to an arbitrary JSON value.
         *
         * You should usually call [Builder.supportedAudioFormats] with a well-typed
         * `List<CommunityTtsAudioFormat>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun supportedAudioFormats(supportedAudioFormats: JsonField<List<CommunityTtsAudioFormat>>) =
            apply {
                body.supportedAudioFormats(supportedAudioFormats)
            }

        /**
         * Adds a single [CommunityTtsAudioFormat] to [supportedAudioFormats].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSupportedAudioFormat(supportedAudioFormat: CommunityTtsAudioFormat) = apply {
            body.addSupportedAudioFormat(supportedAudioFormat)
        }

        /**
         * The `https://` URL of the engine's voice listing, with the same host rules. It answers
         * `GET` with `{"voices": [{"provider", "name", "voice_id", "language", "gender"}]}`: at
         * most 1000 voices, each `voice_id` unique and matching
         * `^[A-Za-z0-9][A-Za-z0-9_-]{0,127}$`, each `language` at most 35 characters. Telnyx reads
         * it when the engine is registered or updated, every 15 minutes, and on `refresh_voices`.
         */
        fun voicesUrl(voicesUrl: String) = apply { body.voicesUrl(voicesUrl) }

        /**
         * Sets [Builder.voicesUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voicesUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun voicesUrl(voicesUrl: JsonField<String>) = apply { body.voicesUrl(voicesUrl) }

        /**
         * The `wss://` URL Telnyx connects to. It must be reachable on the public internet: plain
         * `ws://`, private, loopback, link-local, shared, documentation, multicast and reserved
         * addresses, and internal hostnames are rejected, as are credentials embedded in the URL or
         * in credential-looking query parameters. At most 2048 characters.
         */
        fun websocketUrl(websocketUrl: String) = apply { body.websocketUrl(websocketUrl) }

        /**
         * Sets [Builder.websocketUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.websocketUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun websocketUrl(websocketUrl: JsonField<String>) = apply {
            body.websocketUrl(websocketUrl)
        }

        /**
         * How long Telnyx waits for the WebSocket connection to open, from 500 to 10000.
         * Default: 3000.
         */
        fun connectTimeoutMs(connectTimeoutMs: Long) = apply {
            body.connectTimeoutMs(connectTimeoutMs)
        }

        /**
         * Sets [Builder.connectTimeoutMs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connectTimeoutMs] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun connectTimeoutMs(connectTimeoutMs: JsonField<Long>) = apply {
            body.connectTimeoutMs(connectTimeoutMs)
        }

        /**
         * A contact address stored for the Telnyx platform team. Telnyx does not email it
         * automatically. At most 254 characters.
         */
        fun contactEmail(contactEmail: String?) = apply { body.contactEmail(contactEmail) }

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
            body.contactEmail(contactEmail)
        }

        /**
         * URL of the publisher's data retention policy, at most 2048 characters. It is returned in
         * the discoverable listing.
         */
        fun dataRetentionPolicyUrl(dataRetentionPolicyUrl: String?) = apply {
            body.dataRetentionPolicyUrl(dataRetentionPolicyUrl)
        }

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
            body.dataRetentionPolicyUrl(dataRetentionPolicyUrl)
        }

        /**
         * An `https://` page where callers learn how to get a key for the engine and how to use it,
         * with a host and no credentials in it, at most 2048 characters. It is returned in the
         * discoverable listing.
         */
        fun documentationUrl(documentationUrl: String?) = apply {
            body.documentationUrl(documentationUrl)
        }

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
            body.documentationUrl(documentationUrl)
        }

        /**
         * `private`: only your organization can use the engine. `public`: any organization can,
         * once it is `active`.
         */
        fun visibility(visibility: CommunityTtsEngineVisibility) = apply {
            body.visibility(visibility)
        }

        /**
         * Sets [Builder.visibility] to an arbitrary JSON value.
         *
         * You should usually call [Builder.visibility] with a well-typed
         * [CommunityTtsEngineVisibility] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun visibility(visibility: JsonField<CommunityTtsEngineVisibility>) = apply {
            body.visibility(visibility)
        }

        /**
         * The identifier of an Integration Secret in your organization. When set, Telnyx sends its
         * value as a bearer token when it reads `voices_url`. It is never used for synthesis. Send
         * `null` on an update to clear it. At most 255 characters.
         */
        fun voicesApiKeyRef(voicesApiKeyRef: String?) = apply {
            body.voicesApiKeyRef(voicesApiKeyRef)
        }

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
            body.voicesApiKeyRef(voicesApiKeyRef)
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
         * Returns an immutable instance of [TtsIntegrationCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .capabilities()
         * .name()
         * .supportedAudioFormats()
         * .voicesUrl()
         * .websocketUrl()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TtsIntegrationCreateParams =
            TtsIntegrationCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val capabilities: JsonField<CommunityTtsEngineCapabilities>,
        private val name: JsonField<String>,
        private val supportedAudioFormats: JsonField<List<CommunityTtsAudioFormat>>,
        private val voicesUrl: JsonField<String>,
        private val websocketUrl: JsonField<String>,
        private val connectTimeoutMs: JsonField<Long>,
        private val contactEmail: JsonField<String>,
        private val dataRetentionPolicyUrl: JsonField<String>,
        private val documentationUrl: JsonField<String>,
        private val visibility: JsonField<CommunityTtsEngineVisibility>,
        private val voicesApiKeyRef: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("capabilities")
            @ExcludeMissing
            capabilities: JsonField<CommunityTtsEngineCapabilities> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("supported_audio_formats")
            @ExcludeMissing
            supportedAudioFormats: JsonField<List<CommunityTtsAudioFormat>> = JsonMissing.of(),
            @JsonProperty("voices_url")
            @ExcludeMissing
            voicesUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("websocket_url")
            @ExcludeMissing
            websocketUrl: JsonField<String> = JsonMissing.of(),
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
            @JsonProperty("visibility")
            @ExcludeMissing
            visibility: JsonField<CommunityTtsEngineVisibility> = JsonMissing.of(),
            @JsonProperty("voices_api_key_ref")
            @ExcludeMissing
            voicesApiKeyRef: JsonField<String> = JsonMissing.of(),
        ) : this(
            capabilities,
            name,
            supportedAudioFormats,
            voicesUrl,
            websocketUrl,
            connectTimeoutMs,
            contactEmail,
            dataRetentionPolicyUrl,
            documentationUrl,
            visibility,
            voicesApiKeyRef,
            mutableMapOf(),
        )

        /**
         * What the engine supports. An unknown key is rejected.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun capabilities(): CommunityTtsEngineCapabilities =
            capabilities.getRequired("capabilities")

        /**
         * The engine's unique name, and the first part of its voices (`<name>.<voice_id>`). 1-64
         * characters: lowercase letters, digits, hyphens and underscores, starting with a letter or
         * digit. Built-in vendor names and the generic voice names `male`, `female`, `man`,
         * `woman`, `alice` and `custom` are reserved. Unique across all Telnyx accounts and cannot
         * be changed later. A deleted engine's name stays reserved for the organization that owned
         * it.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * The audio formats the engine can produce, at least one, without duplicates.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun supportedAudioFormats(): List<CommunityTtsAudioFormat> =
            supportedAudioFormats.getRequired("supported_audio_formats")

        /**
         * The `https://` URL of the engine's voice listing, with the same host rules. It answers
         * `GET` with `{"voices": [{"provider", "name", "voice_id", "language", "gender"}]}`: at
         * most 1000 voices, each `voice_id` unique and matching
         * `^[A-Za-z0-9][A-Za-z0-9_-]{0,127}$`, each `language` at most 35 characters. Telnyx reads
         * it when the engine is registered or updated, every 15 minutes, and on `refresh_voices`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun voicesUrl(): String = voicesUrl.getRequired("voices_url")

        /**
         * The `wss://` URL Telnyx connects to. It must be reachable on the public internet: plain
         * `ws://`, private, loopback, link-local, shared, documentation, multicast and reserved
         * addresses, and internal hostnames are rejected, as are credentials embedded in the URL or
         * in credential-looking query parameters. At most 2048 characters.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun websocketUrl(): String = websocketUrl.getRequired("websocket_url")

        /**
         * How long Telnyx waits for the WebSocket connection to open, from 500 to 10000.
         * Default: 3000.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun connectTimeoutMs(): Optional<Long> = connectTimeoutMs.getOptional("connect_timeout_ms")

        /**
         * A contact address stored for the Telnyx platform team. Telnyx does not email it
         * automatically. At most 254 characters.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun contactEmail(): Optional<String> = contactEmail.getOptional("contact_email")

        /**
         * URL of the publisher's data retention policy, at most 2048 characters. It is returned in
         * the discoverable listing.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dataRetentionPolicyUrl(): Optional<String> =
            dataRetentionPolicyUrl.getOptional("data_retention_policy_url")

        /**
         * An `https://` page where callers learn how to get a key for the engine and how to use it,
         * with a host and no credentials in it, at most 2048 characters. It is returned in the
         * discoverable listing.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun documentationUrl(): Optional<String> = documentationUrl.getOptional("documentation_url")

        /**
         * `private`: only your organization can use the engine. `public`: any organization can,
         * once it is `active`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun visibility(): Optional<CommunityTtsEngineVisibility> =
            visibility.getOptional("visibility")

        /**
         * The identifier of an Integration Secret in your organization. When set, Telnyx sends its
         * value as a bearer token when it reads `voices_url`. It is never used for synthesis. Send
         * `null` on an update to clear it. At most 255 characters.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun voicesApiKeyRef(): Optional<String> = voicesApiKeyRef.getOptional("voices_api_key_ref")

        /**
         * Returns the raw JSON value of [capabilities].
         *
         * Unlike [capabilities], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Returns the raw JSON value of [supportedAudioFormats].
         *
         * Unlike [supportedAudioFormats], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("supported_audio_formats")
        @ExcludeMissing
        fun _supportedAudioFormats(): JsonField<List<CommunityTtsAudioFormat>> =
            supportedAudioFormats

        /**
         * Returns the raw JSON value of [voicesUrl].
         *
         * Unlike [voicesUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("voices_url") @ExcludeMissing fun _voicesUrl(): JsonField<String> = voicesUrl

        /**
         * Returns the raw JSON value of [websocketUrl].
         *
         * Unlike [websocketUrl], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Unlike [contactEmail], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Unlike [voicesApiKeyRef], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("voices_api_key_ref")
        @ExcludeMissing
        fun _voicesApiKeyRef(): JsonField<String> = voicesApiKeyRef

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
             * .capabilities()
             * .name()
             * .supportedAudioFormats()
             * .voicesUrl()
             * .websocketUrl()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var capabilities: JsonField<CommunityTtsEngineCapabilities>? = null
            private var name: JsonField<String>? = null
            private var supportedAudioFormats: JsonField<MutableList<CommunityTtsAudioFormat>>? =
                null
            private var voicesUrl: JsonField<String>? = null
            private var websocketUrl: JsonField<String>? = null
            private var connectTimeoutMs: JsonField<Long> = JsonMissing.of()
            private var contactEmail: JsonField<String> = JsonMissing.of()
            private var dataRetentionPolicyUrl: JsonField<String> = JsonMissing.of()
            private var documentationUrl: JsonField<String> = JsonMissing.of()
            private var visibility: JsonField<CommunityTtsEngineVisibility> = JsonMissing.of()
            private var voicesApiKeyRef: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                capabilities = body.capabilities
                name = body.name
                supportedAudioFormats = body.supportedAudioFormats.map { it.toMutableList() }
                voicesUrl = body.voicesUrl
                websocketUrl = body.websocketUrl
                connectTimeoutMs = body.connectTimeoutMs
                contactEmail = body.contactEmail
                dataRetentionPolicyUrl = body.dataRetentionPolicyUrl
                documentationUrl = body.documentationUrl
                visibility = body.visibility
                voicesApiKeyRef = body.voicesApiKeyRef
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** What the engine supports. An unknown key is rejected. */
            fun capabilities(capabilities: CommunityTtsEngineCapabilities) =
                capabilities(JsonField.of(capabilities))

            /**
             * Sets [Builder.capabilities] to an arbitrary JSON value.
             *
             * You should usually call [Builder.capabilities] with a well-typed
             * [CommunityTtsEngineCapabilities] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun capabilities(capabilities: JsonField<CommunityTtsEngineCapabilities>) = apply {
                this.capabilities = capabilities
            }

            /**
             * The engine's unique name, and the first part of its voices (`<name>.<voice_id>`).
             * 1-64 characters: lowercase letters, digits, hyphens and underscores, starting with a
             * letter or digit. Built-in vendor names and the generic voice names `male`, `female`,
             * `man`, `woman`, `alice` and `custom` are reserved. Unique across all Telnyx accounts
             * and cannot be changed later. A deleted engine's name stays reserved for the
             * organization that owned it.
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

            /** The audio formats the engine can produce, at least one, without duplicates. */
            fun supportedAudioFormats(supportedAudioFormats: List<CommunityTtsAudioFormat>) =
                supportedAudioFormats(JsonField.of(supportedAudioFormats))

            /**
             * Sets [Builder.supportedAudioFormats] to an arbitrary JSON value.
             *
             * You should usually call [Builder.supportedAudioFormats] with a well-typed
             * `List<CommunityTtsAudioFormat>` value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun supportedAudioFormats(
                supportedAudioFormats: JsonField<List<CommunityTtsAudioFormat>>
            ) = apply {
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
             * The `https://` URL of the engine's voice listing, with the same host rules. It
             * answers `GET` with `{"voices":
             * [{"provider", "name", "voice_id", "language", "gender"}]}`: at most 1000 voices, each
             * `voice_id` unique and matching `^[A-Za-z0-9][A-Za-z0-9_-]{0,127}$`, each `language`
             * at most 35 characters. Telnyx reads it when the engine is registered or updated,
             * every 15 minutes, and on `refresh_voices`.
             */
            fun voicesUrl(voicesUrl: String) = voicesUrl(JsonField.of(voicesUrl))

            /**
             * Sets [Builder.voicesUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.voicesUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun voicesUrl(voicesUrl: JsonField<String>) = apply { this.voicesUrl = voicesUrl }

            /**
             * The `wss://` URL Telnyx connects to. It must be reachable on the public internet:
             * plain `ws://`, private, loopback, link-local, shared, documentation, multicast and
             * reserved addresses, and internal hostnames are rejected, as are credentials embedded
             * in the URL or in credential-looking query parameters. At most 2048 characters.
             */
            fun websocketUrl(websocketUrl: String) = websocketUrl(JsonField.of(websocketUrl))

            /**
             * Sets [Builder.websocketUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.websocketUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun websocketUrl(websocketUrl: JsonField<String>) = apply {
                this.websocketUrl = websocketUrl
            }

            /**
             * How long Telnyx waits for the WebSocket connection to open, from 500 to 10000.
             * Default: 3000.
             */
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

            /**
             * A contact address stored for the Telnyx platform team. Telnyx does not email it
             * automatically. At most 254 characters.
             */
            fun contactEmail(contactEmail: String?) =
                contactEmail(JsonField.ofNullable(contactEmail))

            /** Alias for calling [Builder.contactEmail] with `contactEmail.orElse(null)`. */
            fun contactEmail(contactEmail: Optional<String>) =
                contactEmail(contactEmail.getOrNull())

            /**
             * Sets [Builder.contactEmail] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contactEmail] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contactEmail(contactEmail: JsonField<String>) = apply {
                this.contactEmail = contactEmail
            }

            /**
             * URL of the publisher's data retention policy, at most 2048 characters. It is returned
             * in the discoverable listing.
             */
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
             * You should usually call [Builder.dataRetentionPolicyUrl] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun dataRetentionPolicyUrl(dataRetentionPolicyUrl: JsonField<String>) = apply {
                this.dataRetentionPolicyUrl = dataRetentionPolicyUrl
            }

            /**
             * An `https://` page where callers learn how to get a key for the engine and how to use
             * it, with a host and no credentials in it, at most 2048 characters. It is returned in
             * the discoverable listing.
             */
            fun documentationUrl(documentationUrl: String?) =
                documentationUrl(JsonField.ofNullable(documentationUrl))

            /**
             * Alias for calling [Builder.documentationUrl] with `documentationUrl.orElse(null)`.
             */
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
             * [CommunityTtsEngineVisibility] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun visibility(visibility: JsonField<CommunityTtsEngineVisibility>) = apply {
                this.visibility = visibility
            }

            /**
             * The identifier of an Integration Secret in your organization. When set, Telnyx sends
             * its value as a bearer token when it reads `voices_url`. It is never used for
             * synthesis. Send `null` on an update to clear it. At most 255 characters.
             */
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
             * .capabilities()
             * .name()
             * .supportedAudioFormats()
             * .voicesUrl()
             * .websocketUrl()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("capabilities", capabilities),
                    checkRequired("name", name),
                    checkRequired("supportedAudioFormats", supportedAudioFormats).map {
                        it.toImmutable()
                    },
                    checkRequired("voicesUrl", voicesUrl),
                    checkRequired("websocketUrl", websocketUrl),
                    connectTimeoutMs,
                    contactEmail,
                    dataRetentionPolicyUrl,
                    documentationUrl,
                    visibility,
                    voicesApiKeyRef,
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

            capabilities().validate()
            name()
            supportedAudioFormats().forEach { it.validate() }
            voicesUrl()
            websocketUrl()
            connectTimeoutMs()
            contactEmail()
            dataRetentionPolicyUrl()
            documentationUrl()
            visibility().ifPresent { it.validate() }
            voicesApiKeyRef()
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
            (capabilities.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (supportedAudioFormats.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                    ?: 0) +
                (if (voicesUrl.asKnown().isPresent) 1 else 0) +
                (if (websocketUrl.asKnown().isPresent) 1 else 0) +
                (if (connectTimeoutMs.asKnown().isPresent) 1 else 0) +
                (if (contactEmail.asKnown().isPresent) 1 else 0) +
                (if (dataRetentionPolicyUrl.asKnown().isPresent) 1 else 0) +
                (if (documentationUrl.asKnown().isPresent) 1 else 0) +
                (visibility.asKnown().getOrNull()?.validity() ?: 0) +
                (if (voicesApiKeyRef.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                capabilities == other.capabilities &&
                name == other.name &&
                supportedAudioFormats == other.supportedAudioFormats &&
                voicesUrl == other.voicesUrl &&
                websocketUrl == other.websocketUrl &&
                connectTimeoutMs == other.connectTimeoutMs &&
                contactEmail == other.contactEmail &&
                dataRetentionPolicyUrl == other.dataRetentionPolicyUrl &&
                documentationUrl == other.documentationUrl &&
                visibility == other.visibility &&
                voicesApiKeyRef == other.voicesApiKeyRef &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                capabilities,
                name,
                supportedAudioFormats,
                voicesUrl,
                websocketUrl,
                connectTimeoutMs,
                contactEmail,
                dataRetentionPolicyUrl,
                documentationUrl,
                visibility,
                voicesApiKeyRef,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{capabilities=$capabilities, name=$name, supportedAudioFormats=$supportedAudioFormats, voicesUrl=$voicesUrl, websocketUrl=$websocketUrl, connectTimeoutMs=$connectTimeoutMs, contactEmail=$contactEmail, dataRetentionPolicyUrl=$dataRetentionPolicyUrl, documentationUrl=$documentationUrl, visibility=$visibility, voicesApiKeyRef=$voicesApiKeyRef, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TtsIntegrationCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "TtsIntegrationCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
