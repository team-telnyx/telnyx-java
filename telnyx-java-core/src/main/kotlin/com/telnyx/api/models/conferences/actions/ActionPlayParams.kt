// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.conferences.actions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.Params
import com.telnyx.api.core.checkKnown
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import com.telnyx.api.models.calls.actions.Loopcount
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Play audio to all or some participants on a conference call. */
class ActionPlayParams
private constructor(
    private val id: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /**
     * The URL of a file to be played back in the conference. media_name and audio_url cannot be
     * used together in one request.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun audioUrl(): Optional<String> = body.audioUrl()

    /**
     * List of call control ids identifying participants the audio file should be played to. If not
     * given, the audio file will be played to the entire conference.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callControlIds(): Optional<List<String>> = body.callControlIds()

    /**
     * The number of times the audio file should be played. If supplied, the value must be an
     * integer between 1 and 100, or the special string `infinity` for an endless loop.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun loop(): Optional<Loopcount> = body.loop()

    /**
     * The media_name of a file to be played back in the conference. The media_name must point to a
     * file previously uploaded to api.telnyx.com/v2/media by the same user/organization. The file
     * must either be a WAV or MP3 file.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mediaName(): Optional<String> = body.mediaName()

    /**
     * Returns the raw JSON value of [audioUrl].
     *
     * Unlike [audioUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _audioUrl(): JsonField<String> = body._audioUrl()

    /**
     * Returns the raw JSON value of [callControlIds].
     *
     * Unlike [callControlIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _callControlIds(): JsonField<List<String>> = body._callControlIds()

    /**
     * Returns the raw JSON value of [loop].
     *
     * Unlike [loop], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _loop(): JsonField<Loopcount> = body._loop()

    /**
     * Returns the raw JSON value of [mediaName].
     *
     * Unlike [mediaName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _mediaName(): JsonField<String> = body._mediaName()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ActionPlayParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ActionPlayParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ActionPlayParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(actionPlayParams: ActionPlayParams) = apply {
            id = actionPlayParams.id
            body = actionPlayParams.body.toBuilder()
            additionalHeaders = actionPlayParams.additionalHeaders.toBuilder()
            additionalQueryParams = actionPlayParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [audioUrl]
         * - [callControlIds]
         * - [loop]
         * - [mediaName]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * The URL of a file to be played back in the conference. media_name and audio_url cannot be
         * used together in one request.
         */
        fun audioUrl(audioUrl: String) = apply { body.audioUrl(audioUrl) }

        /**
         * Sets [Builder.audioUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.audioUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun audioUrl(audioUrl: JsonField<String>) = apply { body.audioUrl(audioUrl) }

        /**
         * List of call control ids identifying participants the audio file should be played to. If
         * not given, the audio file will be played to the entire conference.
         */
        fun callControlIds(callControlIds: List<String>) = apply {
            body.callControlIds(callControlIds)
        }

        /**
         * Sets [Builder.callControlIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callControlIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun callControlIds(callControlIds: JsonField<List<String>>) = apply {
            body.callControlIds(callControlIds)
        }

        /**
         * Adds a single [String] to [callControlIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCallControlId(callControlId: String) = apply { body.addCallControlId(callControlId) }

        /**
         * The number of times the audio file should be played. If supplied, the value must be an
         * integer between 1 and 100, or the special string `infinity` for an endless loop.
         */
        fun loop(loop: Loopcount) = apply { body.loop(loop) }

        /**
         * Sets [Builder.loop] to an arbitrary JSON value.
         *
         * You should usually call [Builder.loop] with a well-typed [Loopcount] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun loop(loop: JsonField<Loopcount>) = apply { body.loop(loop) }

        /** Alias for calling [loop] with `Loopcount.ofString(string)`. */
        fun loop(string: String) = apply { body.loop(string) }

        /** Alias for calling [loop] with `Loopcount.ofInteger(integer)`. */
        fun loop(integer: Long) = apply { body.loop(integer) }

        /**
         * The media_name of a file to be played back in the conference. The media_name must point
         * to a file previously uploaded to api.telnyx.com/v2/media by the same user/organization.
         * The file must either be a WAV or MP3 file.
         */
        fun mediaName(mediaName: String) = apply { body.mediaName(mediaName) }

        /**
         * Sets [Builder.mediaName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mediaName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun mediaName(mediaName: JsonField<String>) = apply { body.mediaName(mediaName) }

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

        fun additionalHeaders(additionalHeaders: Headers) = apply {
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

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
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

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
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
         * Returns an immutable instance of [ActionPlayParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ActionPlayParams =
            ActionPlayParams(
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

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val audioUrl: JsonField<String>,
        private val callControlIds: JsonField<List<String>>,
        private val loop: JsonField<Loopcount>,
        private val mediaName: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("audio_url")
            @ExcludeMissing
            audioUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("call_control_ids")
            @ExcludeMissing
            callControlIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("loop") @ExcludeMissing loop: JsonField<Loopcount> = JsonMissing.of(),
            @JsonProperty("media_name")
            @ExcludeMissing
            mediaName: JsonField<String> = JsonMissing.of(),
        ) : this(audioUrl, callControlIds, loop, mediaName, mutableMapOf())

        /**
         * The URL of a file to be played back in the conference. media_name and audio_url cannot be
         * used together in one request.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun audioUrl(): Optional<String> = audioUrl.getOptional("audio_url")

        /**
         * List of call control ids identifying participants the audio file should be played to. If
         * not given, the audio file will be played to the entire conference.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun callControlIds(): Optional<List<String>> =
            callControlIds.getOptional("call_control_ids")

        /**
         * The number of times the audio file should be played. If supplied, the value must be an
         * integer between 1 and 100, or the special string `infinity` for an endless loop.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun loop(): Optional<Loopcount> = loop.getOptional("loop")

        /**
         * The media_name of a file to be played back in the conference. The media_name must point
         * to a file previously uploaded to api.telnyx.com/v2/media by the same user/organization.
         * The file must either be a WAV or MP3 file.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mediaName(): Optional<String> = mediaName.getOptional("media_name")

        /**
         * Returns the raw JSON value of [audioUrl].
         *
         * Unlike [audioUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("audio_url") @ExcludeMissing fun _audioUrl(): JsonField<String> = audioUrl

        /**
         * Returns the raw JSON value of [callControlIds].
         *
         * Unlike [callControlIds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("call_control_ids")
        @ExcludeMissing
        fun _callControlIds(): JsonField<List<String>> = callControlIds

        /**
         * Returns the raw JSON value of [loop].
         *
         * Unlike [loop], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("loop") @ExcludeMissing fun _loop(): JsonField<Loopcount> = loop

        /**
         * Returns the raw JSON value of [mediaName].
         *
         * Unlike [mediaName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("media_name") @ExcludeMissing fun _mediaName(): JsonField<String> = mediaName

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

            private var audioUrl: JsonField<String> = JsonMissing.of()
            private var callControlIds: JsonField<MutableList<String>>? = null
            private var loop: JsonField<Loopcount> = JsonMissing.of()
            private var mediaName: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                audioUrl = body.audioUrl
                callControlIds = body.callControlIds.map { it.toMutableList() }
                loop = body.loop
                mediaName = body.mediaName
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The URL of a file to be played back in the conference. media_name and audio_url
             * cannot be used together in one request.
             */
            fun audioUrl(audioUrl: String) = audioUrl(JsonField.of(audioUrl))

            /**
             * Sets [Builder.audioUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.audioUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun audioUrl(audioUrl: JsonField<String>) = apply { this.audioUrl = audioUrl }

            /**
             * List of call control ids identifying participants the audio file should be played to.
             * If not given, the audio file will be played to the entire conference.
             */
            fun callControlIds(callControlIds: List<String>) =
                callControlIds(JsonField.of(callControlIds))

            /**
             * Sets [Builder.callControlIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callControlIds] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun callControlIds(callControlIds: JsonField<List<String>>) = apply {
                this.callControlIds = callControlIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [callControlIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCallControlId(callControlId: String) = apply {
                callControlIds =
                    (callControlIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("callControlIds", it).add(callControlId)
                    }
            }

            /**
             * The number of times the audio file should be played. If supplied, the value must be
             * an integer between 1 and 100, or the special string `infinity` for an endless loop.
             */
            fun loop(loop: Loopcount) = loop(JsonField.of(loop))

            /**
             * Sets [Builder.loop] to an arbitrary JSON value.
             *
             * You should usually call [Builder.loop] with a well-typed [Loopcount] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun loop(loop: JsonField<Loopcount>) = apply { this.loop = loop }

            /** Alias for calling [loop] with `Loopcount.ofString(string)`. */
            fun loop(string: String) = loop(Loopcount.ofString(string))

            /** Alias for calling [loop] with `Loopcount.ofInteger(integer)`. */
            fun loop(integer: Long) = loop(Loopcount.ofInteger(integer))

            /**
             * The media_name of a file to be played back in the conference. The media_name must
             * point to a file previously uploaded to api.telnyx.com/v2/media by the same
             * user/organization. The file must either be a WAV or MP3 file.
             */
            fun mediaName(mediaName: String) = mediaName(JsonField.of(mediaName))

            /**
             * Sets [Builder.mediaName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mediaName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mediaName(mediaName: JsonField<String>) = apply { this.mediaName = mediaName }

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
                    audioUrl,
                    (callControlIds ?: JsonMissing.of()).map { it.toImmutable() },
                    loop,
                    mediaName,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            audioUrl()
            callControlIds()
            loop().ifPresent { it.validate() }
            mediaName()
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
            (if (audioUrl.asKnown().isPresent) 1 else 0) +
                (callControlIds.asKnown().getOrNull()?.size ?: 0) +
                (loop.asKnown().getOrNull()?.validity() ?: 0) +
                (if (mediaName.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                audioUrl == other.audioUrl &&
                callControlIds == other.callControlIds &&
                loop == other.loop &&
                mediaName == other.mediaName &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(audioUrl, callControlIds, loop, mediaName, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{audioUrl=$audioUrl, callControlIds=$callControlIds, loop=$loop, mediaName=$mediaName, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActionPlayParams &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ActionPlayParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
