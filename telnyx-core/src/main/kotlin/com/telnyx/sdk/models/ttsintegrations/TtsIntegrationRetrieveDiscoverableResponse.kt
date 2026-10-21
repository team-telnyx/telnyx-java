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
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class TtsIntegrationRetrieveDiscoverableResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<Data>>,
    private val meta: JsonField<CommunityTtsEngineListMeta>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of(),
        @JsonProperty("meta")
        @ExcludeMissing
        meta: JsonField<CommunityTtsEngineListMeta> = JsonMissing.of(),
    ) : this(data, meta, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): List<Data> = data.getRequired("data")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun meta(): CommunityTtsEngineListMeta = meta.getRequired("meta")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

    /**
     * Returns the raw JSON value of [meta].
     *
     * Unlike [meta], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("meta") @ExcludeMissing fun _meta(): JsonField<CommunityTtsEngineListMeta> = meta

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
         * [TtsIntegrationRetrieveDiscoverableResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * .meta()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TtsIntegrationRetrieveDiscoverableResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var meta: JsonField<CommunityTtsEngineListMeta>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            ttsIntegrationRetrieveDiscoverableResponse: TtsIntegrationRetrieveDiscoverableResponse
        ) = apply {
            data = ttsIntegrationRetrieveDiscoverableResponse.data.map { it.toMutableList() }
            meta = ttsIntegrationRetrieveDiscoverableResponse.meta
            additionalProperties =
                ttsIntegrationRetrieveDiscoverableResponse.additionalProperties.toMutableMap()
        }

        fun data(data: List<Data>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed `List<Data>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<List<Data>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [Data] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: Data) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
        }

        fun meta(meta: CommunityTtsEngineListMeta) = meta(JsonField.of(meta))

        /**
         * Sets [Builder.meta] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meta] with a well-typed [CommunityTtsEngineListMeta]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun meta(meta: JsonField<CommunityTtsEngineListMeta>) = apply { this.meta = meta }

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
         * Returns an immutable instance of [TtsIntegrationRetrieveDiscoverableResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .data()
         * .meta()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TtsIntegrationRetrieveDiscoverableResponse =
            TtsIntegrationRetrieveDiscoverableResponse(
                checkRequired("data", data).map { it.toImmutable() },
                checkRequired("meta", meta),
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
    fun validate(): TtsIntegrationRetrieveDiscoverableResponse = apply {
        if (validated) {
            return@apply
        }

        data().forEach { it.validate() }
        meta().validate()
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
        (data.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (meta.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * What a caller needs to choose an engine. It carries no publisher contact details, review
     * notes or credential references.
     */
    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val name: JsonField<String>,
        private val status: JsonField<CommunityTtsEngineStatus>,
        private val visibility: JsonField<CommunityTtsEngineVisibility>,
        private val capabilities: JsonField<CommunityTtsEngineCapabilities>,
        private val connectTimeoutMs: JsonField<Long>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val dataRetentionPolicyUrl: JsonField<String>,
        private val documentationUrl: JsonField<String>,
        private val supportedAudioFormats: JsonField<List<CommunityTtsAudioFormat>>,
        private val voicesCount: JsonField<Long>,
        private val websocketUrl: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status")
            @ExcludeMissing
            status: JsonField<CommunityTtsEngineStatus> = JsonMissing.of(),
            @JsonProperty("visibility")
            @ExcludeMissing
            visibility: JsonField<CommunityTtsEngineVisibility> = JsonMissing.of(),
            @JsonProperty("capabilities")
            @ExcludeMissing
            capabilities: JsonField<CommunityTtsEngineCapabilities> = JsonMissing.of(),
            @JsonProperty("connect_timeout_ms")
            @ExcludeMissing
            connectTimeoutMs: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("data_retention_policy_url")
            @ExcludeMissing
            dataRetentionPolicyUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("documentation_url")
            @ExcludeMissing
            documentationUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("supported_audio_formats")
            @ExcludeMissing
            supportedAudioFormats: JsonField<List<CommunityTtsAudioFormat>> = JsonMissing.of(),
            @JsonProperty("voices_count")
            @ExcludeMissing
            voicesCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("websocket_url")
            @ExcludeMissing
            websocketUrl: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            name,
            status,
            visibility,
            capabilities,
            connectTimeoutMs,
            createdAt,
            dataRetentionPolicyUrl,
            documentationUrl,
            supportedAudioFormats,
            voicesCount,
            websocketUrl,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Whether the engine can serve traffic right now, independent of `visibility` and
         * `review_status`. `draft`: not yet approved (new and awaiting its first review, rejected
         * and awaiting a fix, or approved earlier and awaiting re-review after a review-sensitive
         * change). `active`: serving traffic. `disabled`: owner-paused, reversible via `enable`.
         * `suspended`: paused by Telnyx (repeated failures of a public engine, or an abuse action);
         * the owner cannot clear this by calling `enable`, and Telnyx can reinstate it.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): CommunityTtsEngineStatus = status.getRequired("status")

        /**
         * `private`: only your organization can use the engine. `public`: any organization can,
         * once it is `active`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun visibility(): CommunityTtsEngineVisibility = visibility.getRequired("visibility")

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
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun supportedAudioFormats(): Optional<List<CommunityTtsAudioFormat>> =
            supportedAudioFormats.getOptional("supported_audio_formats")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun voicesCount(): Optional<Long> = voicesCount.getOptional("voices_count")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun websocketUrl(): Optional<String> = websocketUrl.getOptional("websocket_url")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
         * Returns the raw JSON value of [visibility].
         *
         * Unlike [visibility], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("visibility")
        @ExcludeMissing
        fun _visibility(): JsonField<CommunityTtsEngineVisibility> = visibility

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
         * Returns the raw JSON value of [connectTimeoutMs].
         *
         * Unlike [connectTimeoutMs], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("connect_timeout_ms")
        @ExcludeMissing
        fun _connectTimeoutMs(): JsonField<Long> = connectTimeoutMs

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
         * Returns the raw JSON value of [voicesCount].
         *
         * Unlike [voicesCount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("voices_count")
        @ExcludeMissing
        fun _voicesCount(): JsonField<Long> = voicesCount

        /**
         * Returns the raw JSON value of [websocketUrl].
         *
         * Unlike [websocketUrl], this method doesn't throw if the JSON field has an unexpected
         * type.
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
             * Returns a mutable builder for constructing an instance of [Data].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .name()
             * .status()
             * .visibility()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var status: JsonField<CommunityTtsEngineStatus>? = null
            private var visibility: JsonField<CommunityTtsEngineVisibility>? = null
            private var capabilities: JsonField<CommunityTtsEngineCapabilities> = JsonMissing.of()
            private var connectTimeoutMs: JsonField<Long> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var dataRetentionPolicyUrl: JsonField<String> = JsonMissing.of()
            private var documentationUrl: JsonField<String> = JsonMissing.of()
            private var supportedAudioFormats: JsonField<MutableList<CommunityTtsAudioFormat>>? =
                null
            private var voicesCount: JsonField<Long> = JsonMissing.of()
            private var websocketUrl: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                name = data.name
                status = data.status
                visibility = data.visibility
                capabilities = data.capabilities
                connectTimeoutMs = data.connectTimeoutMs
                createdAt = data.createdAt
                dataRetentionPolicyUrl = data.dataRetentionPolicyUrl
                documentationUrl = data.documentationUrl
                supportedAudioFormats = data.supportedAudioFormats.map { it.toMutableList() }
                voicesCount = data.voicesCount
                websocketUrl = data.websocketUrl
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * Whether the engine can serve traffic right now, independent of `visibility` and
             * `review_status`. `draft`: not yet approved (new and awaiting its first review,
             * rejected and awaiting a fix, or approved earlier and awaiting re-review after a
             * review-sensitive change). `active`: serving traffic. `disabled`: owner-paused,
             * reversible via `enable`. `suspended`: paused by Telnyx (repeated failures of a public
             * engine, or an abuse action); the owner cannot clear this by calling `enable`, and
             * Telnyx can reinstate it.
             */
            fun status(status: CommunityTtsEngineStatus) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [CommunityTtsEngineStatus]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun status(status: JsonField<CommunityTtsEngineStatus>) = apply { this.status = status }

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

            fun voicesCount(voicesCount: Long) = voicesCount(JsonField.of(voicesCount))

            /**
             * Sets [Builder.voicesCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.voicesCount] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun voicesCount(voicesCount: JsonField<Long>) = apply { this.voicesCount = voicesCount }

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
             * .name()
             * .status()
             * .visibility()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("id", id),
                    checkRequired("name", name),
                    checkRequired("status", status),
                    checkRequired("visibility", visibility),
                    capabilities,
                    connectTimeoutMs,
                    createdAt,
                    dataRetentionPolicyUrl,
                    documentationUrl,
                    (supportedAudioFormats ?: JsonMissing.of()).map { it.toImmutable() },
                    voicesCount,
                    websocketUrl,
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
            name()
            status().validate()
            visibility().validate()
            capabilities().ifPresent { it.validate() }
            connectTimeoutMs()
            createdAt()
            dataRetentionPolicyUrl()
            documentationUrl()
            supportedAudioFormats().ifPresent { it.forEach { it.validate() } }
            voicesCount()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (visibility.asKnown().getOrNull()?.validity() ?: 0) +
                (capabilities.asKnown().getOrNull()?.validity() ?: 0) +
                (if (connectTimeoutMs.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (dataRetentionPolicyUrl.asKnown().isPresent) 1 else 0) +
                (if (documentationUrl.asKnown().isPresent) 1 else 0) +
                (supportedAudioFormats.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                    ?: 0) +
                (if (voicesCount.asKnown().isPresent) 1 else 0) +
                (if (websocketUrl.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                id == other.id &&
                name == other.name &&
                status == other.status &&
                visibility == other.visibility &&
                capabilities == other.capabilities &&
                connectTimeoutMs == other.connectTimeoutMs &&
                createdAt == other.createdAt &&
                dataRetentionPolicyUrl == other.dataRetentionPolicyUrl &&
                documentationUrl == other.documentationUrl &&
                supportedAudioFormats == other.supportedAudioFormats &&
                voicesCount == other.voicesCount &&
                websocketUrl == other.websocketUrl &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                name,
                status,
                visibility,
                capabilities,
                connectTimeoutMs,
                createdAt,
                dataRetentionPolicyUrl,
                documentationUrl,
                supportedAudioFormats,
                voicesCount,
                websocketUrl,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, name=$name, status=$status, visibility=$visibility, capabilities=$capabilities, connectTimeoutMs=$connectTimeoutMs, createdAt=$createdAt, dataRetentionPolicyUrl=$dataRetentionPolicyUrl, documentationUrl=$documentationUrl, supportedAudioFormats=$supportedAudioFormats, voicesCount=$voicesCount, websocketUrl=$websocketUrl, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TtsIntegrationRetrieveDiscoverableResponse &&
            data == other.data &&
            meta == other.meta &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, meta, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TtsIntegrationRetrieveDiscoverableResponse{data=$data, meta=$meta, additionalProperties=$additionalProperties}"
}
