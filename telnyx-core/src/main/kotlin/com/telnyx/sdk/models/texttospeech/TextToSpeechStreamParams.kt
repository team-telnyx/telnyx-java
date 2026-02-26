// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texttospeech

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Open a WebSocket connection to stream text and receive synthesized audio in real time.
 * Authentication is provided via the standard `Authorization: Bearer <API_KEY>` header. Send JSON
 * frames with text to synthesize; receive JSON frames containing base64-encoded audio chunks.
 *
 * Supported providers: `aws`, `telnyx`, `azure`, `murfai`, `minimax`, `rime`, `resemble`,
 * `elevenlabs`.
 *
 * **Connection flow:**
 * 1. Open WebSocket with query parameters specifying provider, voice, and model.
 * 2. Send an initial handshake message `{"text": " "}` (single space) with optional
 *    `voice_settings` to initialize the session.
 * 3. Send text messages as `{"text": "Hello world"}`.
 * 4. Receive audio chunks as JSON frames with base64-encoded audio.
 * 5. A final frame with `isFinal: true` indicates the end of audio for the current text.
 *
 * To interrupt and restart synthesis mid-stream, send `{"force": true}` — the current worker is
 * stopped and a new one is started.
 */
class TextToSpeechStreamParams
private constructor(
    private val audioFormat: AudioFormat?,
    private val disableCache: Boolean?,
    private val modelId: String?,
    private val provider: Provider?,
    private val socketId: String?,
    private val voice: String?,
    private val voiceId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Audio output format override. Supported for Telnyx `Natural`/`NaturalHD` models only.
     * Accepted values: `pcm`, `wav`.
     */
    fun audioFormat(): Optional<AudioFormat> = Optional.ofNullable(audioFormat)

    /** When `true`, bypass the audio cache and generate fresh audio. */
    fun disableCache(): Optional<Boolean> = Optional.ofNullable(disableCache)

    /**
     * Model identifier for the chosen provider. Examples: `Natural`, `NaturalHD` (Telnyx);
     * `Polly.Generative` (AWS).
     */
    fun modelId(): Optional<String> = Optional.ofNullable(modelId)

    /** TTS provider. Defaults to `telnyx` if not specified. Ignored when `voice` is provided. */
    fun provider(): Optional<Provider> = Optional.ofNullable(provider)

    /**
     * Client-provided socket identifier for tracking. If not provided, one is generated
     * server-side.
     */
    fun socketId(): Optional<String> = Optional.ofNullable(socketId)

    /**
     * Voice identifier in the format `provider.model_id.voice_id` or `provider.voice_id` (e.g.
     * `telnyx.NaturalHD.Telnyx_Alloy` or `azure.en-US-AvaMultilingualNeural`). When provided, the
     * `provider`, `model_id`, and `voice_id` are extracted automatically. Takes precedence over
     * individual `provider`/`model_id`/`voice_id` parameters.
     */
    fun voice(): Optional<String> = Optional.ofNullable(voice)

    /** Voice identifier for the chosen provider. */
    fun voiceId(): Optional<String> = Optional.ofNullable(voiceId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): TextToSpeechStreamParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [TextToSpeechStreamParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TextToSpeechStreamParams]. */
    class Builder internal constructor() {

        private var audioFormat: AudioFormat? = null
        private var disableCache: Boolean? = null
        private var modelId: String? = null
        private var provider: Provider? = null
        private var socketId: String? = null
        private var voice: String? = null
        private var voiceId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(textToSpeechStreamParams: TextToSpeechStreamParams) = apply {
            audioFormat = textToSpeechStreamParams.audioFormat
            disableCache = textToSpeechStreamParams.disableCache
            modelId = textToSpeechStreamParams.modelId
            provider = textToSpeechStreamParams.provider
            socketId = textToSpeechStreamParams.socketId
            voice = textToSpeechStreamParams.voice
            voiceId = textToSpeechStreamParams.voiceId
            additionalHeaders = textToSpeechStreamParams.additionalHeaders.toBuilder()
            additionalQueryParams = textToSpeechStreamParams.additionalQueryParams.toBuilder()
        }

        /**
         * Audio output format override. Supported for Telnyx `Natural`/`NaturalHD` models only.
         * Accepted values: `pcm`, `wav`.
         */
        fun audioFormat(audioFormat: AudioFormat?) = apply { this.audioFormat = audioFormat }

        /** Alias for calling [Builder.audioFormat] with `audioFormat.orElse(null)`. */
        fun audioFormat(audioFormat: Optional<AudioFormat>) = audioFormat(audioFormat.getOrNull())

        /** When `true`, bypass the audio cache and generate fresh audio. */
        fun disableCache(disableCache: Boolean?) = apply { this.disableCache = disableCache }

        /**
         * Alias for [Builder.disableCache].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun disableCache(disableCache: Boolean) = disableCache(disableCache as Boolean?)

        /** Alias for calling [Builder.disableCache] with `disableCache.orElse(null)`. */
        fun disableCache(disableCache: Optional<Boolean>) = disableCache(disableCache.getOrNull())

        /**
         * Model identifier for the chosen provider. Examples: `Natural`, `NaturalHD` (Telnyx);
         * `Polly.Generative` (AWS).
         */
        fun modelId(modelId: String?) = apply { this.modelId = modelId }

        /** Alias for calling [Builder.modelId] with `modelId.orElse(null)`. */
        fun modelId(modelId: Optional<String>) = modelId(modelId.getOrNull())

        /**
         * TTS provider. Defaults to `telnyx` if not specified. Ignored when `voice` is provided.
         */
        fun provider(provider: Provider?) = apply { this.provider = provider }

        /** Alias for calling [Builder.provider] with `provider.orElse(null)`. */
        fun provider(provider: Optional<Provider>) = provider(provider.getOrNull())

        /**
         * Client-provided socket identifier for tracking. If not provided, one is generated
         * server-side.
         */
        fun socketId(socketId: String?) = apply { this.socketId = socketId }

        /** Alias for calling [Builder.socketId] with `socketId.orElse(null)`. */
        fun socketId(socketId: Optional<String>) = socketId(socketId.getOrNull())

        /**
         * Voice identifier in the format `provider.model_id.voice_id` or `provider.voice_id` (e.g.
         * `telnyx.NaturalHD.Telnyx_Alloy` or `azure.en-US-AvaMultilingualNeural`). When provided,
         * the `provider`, `model_id`, and `voice_id` are extracted automatically. Takes precedence
         * over individual `provider`/`model_id`/`voice_id` parameters.
         */
        fun voice(voice: String?) = apply { this.voice = voice }

        /** Alias for calling [Builder.voice] with `voice.orElse(null)`. */
        fun voice(voice: Optional<String>) = voice(voice.getOrNull())

        /** Voice identifier for the chosen provider. */
        fun voiceId(voiceId: String?) = apply { this.voiceId = voiceId }

        /** Alias for calling [Builder.voiceId] with `voiceId.orElse(null)`. */
        fun voiceId(voiceId: Optional<String>) = voiceId(voiceId.getOrNull())

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
         * Returns an immutable instance of [TextToSpeechStreamParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TextToSpeechStreamParams =
            TextToSpeechStreamParams(
                audioFormat,
                disableCache,
                modelId,
                provider,
                socketId,
                voice,
                voiceId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                audioFormat?.let { put("audio_format", it.toString()) }
                disableCache?.let { put("disable_cache", it.toString()) }
                modelId?.let { put("model_id", it) }
                provider?.let { put("provider", it.toString()) }
                socketId?.let { put("socket_id", it) }
                voice?.let { put("voice", it) }
                voiceId?.let { put("voice_id", it) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Audio output format override. Supported for Telnyx `Natural`/`NaturalHD` models only.
     * Accepted values: `pcm`, `wav`.
     */
    class AudioFormat @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val PCM = of("pcm")

            @JvmField val WAV = of("wav")

            @JvmStatic fun of(value: String) = AudioFormat(JsonField.of(value))
        }

        /** An enum containing [AudioFormat]'s known values. */
        enum class Known {
            PCM,
            WAV,
        }

        /**
         * An enum containing [AudioFormat]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AudioFormat] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PCM,
            WAV,
            /**
             * An enum member indicating that [AudioFormat] was instantiated with an unknown value.
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
                PCM -> Value.PCM
                WAV -> Value.WAV
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
                PCM -> Known.PCM
                WAV -> Known.WAV
                else -> throw TelnyxInvalidDataException("Unknown AudioFormat: $value")
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

        fun validate(): AudioFormat = apply {
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

            return other is AudioFormat && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** TTS provider. Defaults to `telnyx` if not specified. Ignored when `voice` is provided. */
    class Provider @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val AWS = of("aws")

            @JvmField val TELNYX = of("telnyx")

            @JvmField val AZURE = of("azure")

            @JvmField val ELEVENLABS = of("elevenlabs")

            @JvmField val MINIMAX = of("minimax")

            @JvmField val MURFAI = of("murfai")

            @JvmField val RIME = of("rime")

            @JvmField val RESEMBLE = of("resemble")

            @JvmStatic fun of(value: String) = Provider(JsonField.of(value))
        }

        /** An enum containing [Provider]'s known values. */
        enum class Known {
            AWS,
            TELNYX,
            AZURE,
            ELEVENLABS,
            MINIMAX,
            MURFAI,
            RIME,
            RESEMBLE,
        }

        /**
         * An enum containing [Provider]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Provider] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AWS,
            TELNYX,
            AZURE,
            ELEVENLABS,
            MINIMAX,
            MURFAI,
            RIME,
            RESEMBLE,
            /** An enum member indicating that [Provider] was instantiated with an unknown value. */
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
                AWS -> Value.AWS
                TELNYX -> Value.TELNYX
                AZURE -> Value.AZURE
                ELEVENLABS -> Value.ELEVENLABS
                MINIMAX -> Value.MINIMAX
                MURFAI -> Value.MURFAI
                RIME -> Value.RIME
                RESEMBLE -> Value.RESEMBLE
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
                AWS -> Known.AWS
                TELNYX -> Known.TELNYX
                AZURE -> Known.AZURE
                ELEVENLABS -> Known.ELEVENLABS
                MINIMAX -> Known.MINIMAX
                MURFAI -> Known.MURFAI
                RIME -> Known.RIME
                RESEMBLE -> Known.RESEMBLE
                else -> throw TelnyxInvalidDataException("Unknown Provider: $value")
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

        fun validate(): Provider = apply {
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

            return other is Provider && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TextToSpeechStreamParams &&
            audioFormat == other.audioFormat &&
            disableCache == other.disableCache &&
            modelId == other.modelId &&
            provider == other.provider &&
            socketId == other.socketId &&
            voice == other.voice &&
            voiceId == other.voiceId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            audioFormat,
            disableCache,
            modelId,
            provider,
            socketId,
            voice,
            voiceId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "TextToSpeechStreamParams{audioFormat=$audioFormat, disableCache=$disableCache, modelId=$modelId, provider=$provider, socketId=$socketId, voice=$voice, voiceId=$voiceId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
