// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ttsintegrations.actions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Check an engine end to end with your own key, without a call. Telnyx reads the voice list,
 * connects to the engine's `websocket_url` with the Integration Secret named by `api_key_ref`,
 * sends a short text, and checks the answer: the handshake, the credentials, the audio, the final
 * frame and a clean close. The result is recorded (see `conformance_runs`) and returned. A test
 * within 10 seconds of the previous one is refused with `429`, and a `suspended` engine cannot be
 * tested. See
 * [Try your engine before approval](/docs/voice/tts/community-engines#try-your-engine-before-approval).
 */
class ActionTestConnectionParams
private constructor(
    private val id: String?,
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /**
     * The identifier of the Integration Secret in your organization that Telnyx connects to the
     * engine with, as a caller would.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun apiKeyRef(): String = body.apiKeyRef()

    /**
     * The voice to test. Default: the first voice in the engine's list. It must be in the list.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun voiceId(): Optional<String> = body.voiceId()

    /**
     * Returns the raw JSON value of [apiKeyRef].
     *
     * Unlike [apiKeyRef], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _apiKeyRef(): JsonField<String> = body._apiKeyRef()

    /**
     * Returns the raw JSON value of [voiceId].
     *
     * Unlike [voiceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _voiceId(): JsonField<String> = body._voiceId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ActionTestConnectionParams].
         *
         * The following fields are required:
         * ```java
         * .apiKeyRef()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ActionTestConnectionParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(actionTestConnectionParams: ActionTestConnectionParams) = apply {
            id = actionTestConnectionParams.id
            body = actionTestConnectionParams.body.toBuilder()
            additionalHeaders = actionTestConnectionParams.additionalHeaders.toBuilder()
            additionalQueryParams = actionTestConnectionParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [apiKeyRef]
         * - [voiceId]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * The identifier of the Integration Secret in your organization that Telnyx connects to the
         * engine with, as a caller would.
         */
        fun apiKeyRef(apiKeyRef: String) = apply { body.apiKeyRef(apiKeyRef) }

        /**
         * Sets [Builder.apiKeyRef] to an arbitrary JSON value.
         *
         * You should usually call [Builder.apiKeyRef] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun apiKeyRef(apiKeyRef: JsonField<String>) = apply { body.apiKeyRef(apiKeyRef) }

        /**
         * The voice to test. Default: the first voice in the engine's list. It must be in the list.
         */
        fun voiceId(voiceId: String) = apply { body.voiceId(voiceId) }

        /**
         * Sets [Builder.voiceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voiceId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun voiceId(voiceId: JsonField<String>) = apply { body.voiceId(voiceId) }

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
         * Returns an immutable instance of [ActionTestConnectionParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .apiKeyRef()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ActionTestConnectionParams =
            ActionTestConnectionParams(
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
        private val apiKeyRef: JsonField<String>,
        private val voiceId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("api_key_ref")
            @ExcludeMissing
            apiKeyRef: JsonField<String> = JsonMissing.of(),
            @JsonProperty("voice_id") @ExcludeMissing voiceId: JsonField<String> = JsonMissing.of(),
        ) : this(apiKeyRef, voiceId, mutableMapOf())

        /**
         * The identifier of the Integration Secret in your organization that Telnyx connects to the
         * engine with, as a caller would.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun apiKeyRef(): String = apiKeyRef.getRequired("api_key_ref")

        /**
         * The voice to test. Default: the first voice in the engine's list. It must be in the list.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun voiceId(): Optional<String> = voiceId.getOptional("voice_id")

        /**
         * Returns the raw JSON value of [apiKeyRef].
         *
         * Unlike [apiKeyRef], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("api_key_ref") @ExcludeMissing fun _apiKeyRef(): JsonField<String> = apiKeyRef

        /**
         * Returns the raw JSON value of [voiceId].
         *
         * Unlike [voiceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("voice_id") @ExcludeMissing fun _voiceId(): JsonField<String> = voiceId

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
             * .apiKeyRef()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var apiKeyRef: JsonField<String>? = null
            private var voiceId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                apiKeyRef = body.apiKeyRef
                voiceId = body.voiceId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The identifier of the Integration Secret in your organization that Telnyx connects to
             * the engine with, as a caller would.
             */
            fun apiKeyRef(apiKeyRef: String) = apiKeyRef(JsonField.of(apiKeyRef))

            /**
             * Sets [Builder.apiKeyRef] to an arbitrary JSON value.
             *
             * You should usually call [Builder.apiKeyRef] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun apiKeyRef(apiKeyRef: JsonField<String>) = apply { this.apiKeyRef = apiKeyRef }

            /**
             * The voice to test. Default: the first voice in the engine's list. It must be in the
             * list.
             */
            fun voiceId(voiceId: String) = voiceId(JsonField.of(voiceId))

            /**
             * Sets [Builder.voiceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.voiceId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun voiceId(voiceId: JsonField<String>) = apply { this.voiceId = voiceId }

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
             * .apiKeyRef()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("apiKeyRef", apiKeyRef),
                    voiceId,
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

            apiKeyRef()
            voiceId()
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
            (if (apiKeyRef.asKnown().isPresent) 1 else 0) +
                (if (voiceId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                apiKeyRef == other.apiKeyRef &&
                voiceId == other.voiceId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(apiKeyRef, voiceId, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{apiKeyRef=$apiKeyRef, voiceId=$voiceId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActionTestConnectionParams &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ActionTestConnectionParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
