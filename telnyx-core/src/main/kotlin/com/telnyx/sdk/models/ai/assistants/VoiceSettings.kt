// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

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
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class VoiceSettings
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val voice: JsonField<String>,
    private val apiKeyRef: JsonField<String>,
    private val backgroundAudio: JsonField<BackgroundAudio>,
    private val similarityBoost: JsonField<Double>,
    private val speed: JsonField<Double>,
    private val style: JsonField<Double>,
    private val temperature: JsonField<Double>,
    private val useSpeakerBoost: JsonField<Boolean>,
    private val voiceSpeed: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("voice") @ExcludeMissing voice: JsonField<String> = JsonMissing.of(),
        @JsonProperty("api_key_ref")
        @ExcludeMissing
        apiKeyRef: JsonField<String> = JsonMissing.of(),
        @JsonProperty("background_audio")
        @ExcludeMissing
        backgroundAudio: JsonField<BackgroundAudio> = JsonMissing.of(),
        @JsonProperty("similarity_boost")
        @ExcludeMissing
        similarityBoost: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("speed") @ExcludeMissing speed: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("style") @ExcludeMissing style: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("temperature")
        @ExcludeMissing
        temperature: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("use_speaker_boost")
        @ExcludeMissing
        useSpeakerBoost: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("voice_speed")
        @ExcludeMissing
        voiceSpeed: JsonField<Double> = JsonMissing.of(),
    ) : this(
        voice,
        apiKeyRef,
        backgroundAudio,
        similarityBoost,
        speed,
        style,
        temperature,
        useSpeakerBoost,
        voiceSpeed,
        mutableMapOf(),
    )

    /**
     * The voice to be used by the voice assistant. Check the full list of
     * [available voices](https://developers.telnyx.com/api/call-control/list-text-to-speech-voices)
     * via our voices API. To use ElevenLabs, you must reference your ElevenLabs API key as an
     * integration secret under the `api_key_ref` field. See
     * [integration secrets documentation](https://developers.telnyx.com/api/secrets-manager/integration-secrets/create-integration-secret)
     * for details. For Telnyx voices, use `Telnyx.<model_id>.<voice_id>` (e.g.
     * Telnyx.KokoroTTS.af_heart)
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun voice(): String = voice.getRequired("voice")

    /**
     * The `identifier` for an integration secret
     * [/v2/integration_secrets](https://developers.telnyx.com/api/secrets-manager/integration-secrets/create-integration-secret)
     * that refers to your ElevenLabs API key. Warning: Free plans are unlikely to work with this
     * integration.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun apiKeyRef(): Optional<String> = apiKeyRef.getOptional("api_key_ref")

    /**
     * Optional background audio to play on the call. Use a predefined media bed, or supply a looped
     * MP3 URL. If a media URL is chosen in the portal, customers can preview it before saving.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun backgroundAudio(): Optional<BackgroundAudio> =
        backgroundAudio.getOptional("background_audio")

    /**
     * Determines how closely the AI should adhere to the original voice when attempting to
     * replicate it. Only applicable when using ElevenLabs.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun similarityBoost(): Optional<Double> = similarityBoost.getOptional("similarity_boost")

    /**
     * Adjusts speech velocity. 1.0 is default speed; values less than 1.0 slow speech; values
     * greater than 1.0 accelerate it. Only applicable when using ElevenLabs.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun speed(): Optional<Double> = speed.getOptional("speed")

    /**
     * Determines the style exaggeration of the voice. Amplifies speaker style but consumes
     * additional resources when set above 0. Only applicable when using ElevenLabs.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun style(): Optional<Double> = style.getOptional("style")

    /**
     * Determines how stable the voice is and the randomness between each generation. Lower values
     * create a broader emotional range; higher values produce more consistent, monotonous output.
     * Only applicable when using ElevenLabs.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun temperature(): Optional<Double> = temperature.getOptional("temperature")

    /**
     * Amplifies similarity to the original speaker voice. Increases computational load and latency
     * slightly. Only applicable when using ElevenLabs.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun useSpeakerBoost(): Optional<Boolean> = useSpeakerBoost.getOptional("use_speaker_boost")

    /**
     * The speed of the voice in the range [0.25, 2.0]. 1.0 is deafult speed. Larger numbers make
     * the voice faster, smaller numbers make it slower. This is only applicable for Telnyx Natural
     * voices.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun voiceSpeed(): Optional<Double> = voiceSpeed.getOptional("voice_speed")

    /**
     * Returns the raw JSON value of [voice].
     *
     * Unlike [voice], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("voice") @ExcludeMissing fun _voice(): JsonField<String> = voice

    /**
     * Returns the raw JSON value of [apiKeyRef].
     *
     * Unlike [apiKeyRef], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("api_key_ref") @ExcludeMissing fun _apiKeyRef(): JsonField<String> = apiKeyRef

    /**
     * Returns the raw JSON value of [backgroundAudio].
     *
     * Unlike [backgroundAudio], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("background_audio")
    @ExcludeMissing
    fun _backgroundAudio(): JsonField<BackgroundAudio> = backgroundAudio

    /**
     * Returns the raw JSON value of [similarityBoost].
     *
     * Unlike [similarityBoost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("similarity_boost")
    @ExcludeMissing
    fun _similarityBoost(): JsonField<Double> = similarityBoost

    /**
     * Returns the raw JSON value of [speed].
     *
     * Unlike [speed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("speed") @ExcludeMissing fun _speed(): JsonField<Double> = speed

    /**
     * Returns the raw JSON value of [style].
     *
     * Unlike [style], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("style") @ExcludeMissing fun _style(): JsonField<Double> = style

    /**
     * Returns the raw JSON value of [temperature].
     *
     * Unlike [temperature], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("temperature") @ExcludeMissing fun _temperature(): JsonField<Double> = temperature

    /**
     * Returns the raw JSON value of [useSpeakerBoost].
     *
     * Unlike [useSpeakerBoost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("use_speaker_boost")
    @ExcludeMissing
    fun _useSpeakerBoost(): JsonField<Boolean> = useSpeakerBoost

    /**
     * Returns the raw JSON value of [voiceSpeed].
     *
     * Unlike [voiceSpeed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("voice_speed") @ExcludeMissing fun _voiceSpeed(): JsonField<Double> = voiceSpeed

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
         * Returns a mutable builder for constructing an instance of [VoiceSettings].
         *
         * The following fields are required:
         * ```java
         * .voice()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VoiceSettings]. */
    class Builder internal constructor() {

        private var voice: JsonField<String>? = null
        private var apiKeyRef: JsonField<String> = JsonMissing.of()
        private var backgroundAudio: JsonField<BackgroundAudio> = JsonMissing.of()
        private var similarityBoost: JsonField<Double> = JsonMissing.of()
        private var speed: JsonField<Double> = JsonMissing.of()
        private var style: JsonField<Double> = JsonMissing.of()
        private var temperature: JsonField<Double> = JsonMissing.of()
        private var useSpeakerBoost: JsonField<Boolean> = JsonMissing.of()
        private var voiceSpeed: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(voiceSettings: VoiceSettings) = apply {
            voice = voiceSettings.voice
            apiKeyRef = voiceSettings.apiKeyRef
            backgroundAudio = voiceSettings.backgroundAudio
            similarityBoost = voiceSettings.similarityBoost
            speed = voiceSettings.speed
            style = voiceSettings.style
            temperature = voiceSettings.temperature
            useSpeakerBoost = voiceSettings.useSpeakerBoost
            voiceSpeed = voiceSettings.voiceSpeed
            additionalProperties = voiceSettings.additionalProperties.toMutableMap()
        }

        /**
         * The voice to be used by the voice assistant. Check the full list of
         * [available voices](https://developers.telnyx.com/api/call-control/list-text-to-speech-voices)
         * via our voices API. To use ElevenLabs, you must reference your ElevenLabs API key as an
         * integration secret under the `api_key_ref` field. See
         * [integration secrets documentation](https://developers.telnyx.com/api/secrets-manager/integration-secrets/create-integration-secret)
         * for details. For Telnyx voices, use `Telnyx.<model_id>.<voice_id>` (e.g.
         * Telnyx.KokoroTTS.af_heart)
         */
        fun voice(voice: String) = voice(JsonField.of(voice))

        /**
         * Sets [Builder.voice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voice] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun voice(voice: JsonField<String>) = apply { this.voice = voice }

        /**
         * The `identifier` for an integration secret
         * [/v2/integration_secrets](https://developers.telnyx.com/api/secrets-manager/integration-secrets/create-integration-secret)
         * that refers to your ElevenLabs API key. Warning: Free plans are unlikely to work with
         * this integration.
         */
        fun apiKeyRef(apiKeyRef: String) = apiKeyRef(JsonField.of(apiKeyRef))

        /**
         * Sets [Builder.apiKeyRef] to an arbitrary JSON value.
         *
         * You should usually call [Builder.apiKeyRef] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun apiKeyRef(apiKeyRef: JsonField<String>) = apply { this.apiKeyRef = apiKeyRef }

        /**
         * Optional background audio to play on the call. Use a predefined media bed, or supply a
         * looped MP3 URL. If a media URL is chosen in the portal, customers can preview it before
         * saving.
         */
        fun backgroundAudio(backgroundAudio: BackgroundAudio) =
            backgroundAudio(JsonField.of(backgroundAudio))

        /**
         * Sets [Builder.backgroundAudio] to an arbitrary JSON value.
         *
         * You should usually call [Builder.backgroundAudio] with a well-typed [BackgroundAudio]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun backgroundAudio(backgroundAudio: JsonField<BackgroundAudio>) = apply {
            this.backgroundAudio = backgroundAudio
        }

        /**
         * Alias for calling [backgroundAudio] with
         * `BackgroundAudio.ofPredefinedMedia(predefinedMedia)`.
         */
        fun backgroundAudio(predefinedMedia: BackgroundAudio.PredefinedMedia) =
            backgroundAudio(BackgroundAudio.ofPredefinedMedia(predefinedMedia))

        /**
         * Alias for calling [backgroundAudio] with the following:
         * ```java
         * BackgroundAudio.PredefinedMedia.builder()
         *     .value(value)
         *     .build()
         * ```
         */
        fun predefinedMediaBackgroundAudio(
            value: BackgroundAudio.PredefinedMedia.PredefinedMediaValue
        ) = backgroundAudio(BackgroundAudio.PredefinedMedia.builder().value(value).build())

        /** Alias for calling [backgroundAudio] with `BackgroundAudio.ofMediaUrl(mediaUrl)`. */
        fun backgroundAudio(mediaUrl: BackgroundAudio.MediaUrl) =
            backgroundAudio(BackgroundAudio.ofMediaUrl(mediaUrl))

        /**
         * Alias for calling [backgroundAudio] with the following:
         * ```java
         * BackgroundAudio.MediaUrl.builder()
         *     .value(value)
         *     .build()
         * ```
         */
        fun mediaUrlBackgroundAudio(value: String) =
            backgroundAudio(BackgroundAudio.MediaUrl.builder().value(value).build())

        /** Alias for calling [backgroundAudio] with `BackgroundAudio.ofMediaName(mediaName)`. */
        fun backgroundAudio(mediaName: BackgroundAudio.MediaName) =
            backgroundAudio(BackgroundAudio.ofMediaName(mediaName))

        /**
         * Alias for calling [backgroundAudio] with the following:
         * ```java
         * BackgroundAudio.MediaName.builder()
         *     .value(value)
         *     .build()
         * ```
         */
        fun mediaNameBackgroundAudio(value: String) =
            backgroundAudio(BackgroundAudio.MediaName.builder().value(value).build())

        /**
         * Determines how closely the AI should adhere to the original voice when attempting to
         * replicate it. Only applicable when using ElevenLabs.
         */
        fun similarityBoost(similarityBoost: Double) =
            similarityBoost(JsonField.of(similarityBoost))

        /**
         * Sets [Builder.similarityBoost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.similarityBoost] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun similarityBoost(similarityBoost: JsonField<Double>) = apply {
            this.similarityBoost = similarityBoost
        }

        /**
         * Adjusts speech velocity. 1.0 is default speed; values less than 1.0 slow speech; values
         * greater than 1.0 accelerate it. Only applicable when using ElevenLabs.
         */
        fun speed(speed: Double) = speed(JsonField.of(speed))

        /**
         * Sets [Builder.speed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.speed] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun speed(speed: JsonField<Double>) = apply { this.speed = speed }

        /**
         * Determines the style exaggeration of the voice. Amplifies speaker style but consumes
         * additional resources when set above 0. Only applicable when using ElevenLabs.
         */
        fun style(style: Double) = style(JsonField.of(style))

        /**
         * Sets [Builder.style] to an arbitrary JSON value.
         *
         * You should usually call [Builder.style] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun style(style: JsonField<Double>) = apply { this.style = style }

        /**
         * Determines how stable the voice is and the randomness between each generation. Lower
         * values create a broader emotional range; higher values produce more consistent,
         * monotonous output. Only applicable when using ElevenLabs.
         */
        fun temperature(temperature: Double) = temperature(JsonField.of(temperature))

        /**
         * Sets [Builder.temperature] to an arbitrary JSON value.
         *
         * You should usually call [Builder.temperature] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun temperature(temperature: JsonField<Double>) = apply { this.temperature = temperature }

        /**
         * Amplifies similarity to the original speaker voice. Increases computational load and
         * latency slightly. Only applicable when using ElevenLabs.
         */
        fun useSpeakerBoost(useSpeakerBoost: Boolean) =
            useSpeakerBoost(JsonField.of(useSpeakerBoost))

        /**
         * Sets [Builder.useSpeakerBoost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.useSpeakerBoost] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun useSpeakerBoost(useSpeakerBoost: JsonField<Boolean>) = apply {
            this.useSpeakerBoost = useSpeakerBoost
        }

        /**
         * The speed of the voice in the range [0.25, 2.0]. 1.0 is deafult speed. Larger numbers
         * make the voice faster, smaller numbers make it slower. This is only applicable for Telnyx
         * Natural voices.
         */
        fun voiceSpeed(voiceSpeed: Double) = voiceSpeed(JsonField.of(voiceSpeed))

        /**
         * Sets [Builder.voiceSpeed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voiceSpeed] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun voiceSpeed(voiceSpeed: JsonField<Double>) = apply { this.voiceSpeed = voiceSpeed }

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
         * Returns an immutable instance of [VoiceSettings].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .voice()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VoiceSettings =
            VoiceSettings(
                checkRequired("voice", voice),
                apiKeyRef,
                backgroundAudio,
                similarityBoost,
                speed,
                style,
                temperature,
                useSpeakerBoost,
                voiceSpeed,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): VoiceSettings = apply {
        if (validated) {
            return@apply
        }

        voice()
        apiKeyRef()
        backgroundAudio().ifPresent { it.validate() }
        similarityBoost()
        speed()
        style()
        temperature()
        useSpeakerBoost()
        voiceSpeed()
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
        (if (voice.asKnown().isPresent) 1 else 0) +
            (if (apiKeyRef.asKnown().isPresent) 1 else 0) +
            (backgroundAudio.asKnown().getOrNull()?.validity() ?: 0) +
            (if (similarityBoost.asKnown().isPresent) 1 else 0) +
            (if (speed.asKnown().isPresent) 1 else 0) +
            (if (style.asKnown().isPresent) 1 else 0) +
            (if (temperature.asKnown().isPresent) 1 else 0) +
            (if (useSpeakerBoost.asKnown().isPresent) 1 else 0) +
            (if (voiceSpeed.asKnown().isPresent) 1 else 0)

    /**
     * Optional background audio to play on the call. Use a predefined media bed, or supply a looped
     * MP3 URL. If a media URL is chosen in the portal, customers can preview it before saving.
     */
    @JsonDeserialize(using = BackgroundAudio.Deserializer::class)
    @JsonSerialize(using = BackgroundAudio.Serializer::class)
    class BackgroundAudio
    private constructor(
        private val predefinedMedia: PredefinedMedia? = null,
        private val mediaUrl: MediaUrl? = null,
        private val mediaName: MediaName? = null,
        private val _json: JsonValue? = null,
    ) {

        fun predefinedMedia(): Optional<PredefinedMedia> = Optional.ofNullable(predefinedMedia)

        fun mediaUrl(): Optional<MediaUrl> = Optional.ofNullable(mediaUrl)

        fun mediaName(): Optional<MediaName> = Optional.ofNullable(mediaName)

        fun isPredefinedMedia(): Boolean = predefinedMedia != null

        fun isMediaUrl(): Boolean = mediaUrl != null

        fun isMediaName(): Boolean = mediaName != null

        fun asPredefinedMedia(): PredefinedMedia = predefinedMedia.getOrThrow("predefinedMedia")

        fun asMediaUrl(): MediaUrl = mediaUrl.getOrThrow("mediaUrl")

        fun asMediaName(): MediaName = mediaName.getOrThrow("mediaName")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                predefinedMedia != null -> visitor.visitPredefinedMedia(predefinedMedia)
                mediaUrl != null -> visitor.visitMediaUrl(mediaUrl)
                mediaName != null -> visitor.visitMediaName(mediaName)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): BackgroundAudio = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitPredefinedMedia(predefinedMedia: PredefinedMedia) {
                        predefinedMedia.validate()
                    }

                    override fun visitMediaUrl(mediaUrl: MediaUrl) {
                        mediaUrl.validate()
                    }

                    override fun visitMediaName(mediaName: MediaName) {
                        mediaName.validate()
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
                    override fun visitPredefinedMedia(predefinedMedia: PredefinedMedia) =
                        predefinedMedia.validity()

                    override fun visitMediaUrl(mediaUrl: MediaUrl) = mediaUrl.validity()

                    override fun visitMediaName(mediaName: MediaName) = mediaName.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BackgroundAudio &&
                predefinedMedia == other.predefinedMedia &&
                mediaUrl == other.mediaUrl &&
                mediaName == other.mediaName
        }

        override fun hashCode(): Int = Objects.hash(predefinedMedia, mediaUrl, mediaName)

        override fun toString(): String =
            when {
                predefinedMedia != null -> "BackgroundAudio{predefinedMedia=$predefinedMedia}"
                mediaUrl != null -> "BackgroundAudio{mediaUrl=$mediaUrl}"
                mediaName != null -> "BackgroundAudio{mediaName=$mediaName}"
                _json != null -> "BackgroundAudio{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid BackgroundAudio")
            }

        companion object {

            @JvmStatic
            fun ofPredefinedMedia(predefinedMedia: PredefinedMedia) =
                BackgroundAudio(predefinedMedia = predefinedMedia)

            @JvmStatic fun ofMediaUrl(mediaUrl: MediaUrl) = BackgroundAudio(mediaUrl = mediaUrl)

            @JvmStatic
            fun ofMediaName(mediaName: MediaName) = BackgroundAudio(mediaName = mediaName)
        }

        /**
         * An interface that defines how to map each variant of [BackgroundAudio] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitPredefinedMedia(predefinedMedia: PredefinedMedia): T

            fun visitMediaUrl(mediaUrl: MediaUrl): T

            fun visitMediaName(mediaName: MediaName): T

            /**
             * Maps an unknown variant of [BackgroundAudio] to a value of type [T].
             *
             * An instance of [BackgroundAudio] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the SDK
             * is on an older version than the API, then the API may respond with new variants that
             * the SDK is unaware of.
             *
             * @throws TelnyxInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw TelnyxInvalidDataException("Unknown BackgroundAudio: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<BackgroundAudio>(BackgroundAudio::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): BackgroundAudio {
                val json = JsonValue.fromJsonNode(node)
                val type = json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

                when (type) {
                    "predefined_media" -> {
                        return tryDeserialize(node, jacksonTypeRef<PredefinedMedia>())?.let {
                            BackgroundAudio(predefinedMedia = it, _json = json)
                        } ?: BackgroundAudio(_json = json)
                    }
                    "media_url" -> {
                        return tryDeserialize(node, jacksonTypeRef<MediaUrl>())?.let {
                            BackgroundAudio(mediaUrl = it, _json = json)
                        } ?: BackgroundAudio(_json = json)
                    }
                    "media_name" -> {
                        return tryDeserialize(node, jacksonTypeRef<MediaName>())?.let {
                            BackgroundAudio(mediaName = it, _json = json)
                        } ?: BackgroundAudio(_json = json)
                    }
                }

                return BackgroundAudio(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<BackgroundAudio>(BackgroundAudio::class) {

            override fun serialize(
                value: BackgroundAudio,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.predefinedMedia != null -> generator.writeObject(value.predefinedMedia)
                    value.mediaUrl != null -> generator.writeObject(value.mediaUrl)
                    value.mediaName != null -> generator.writeObject(value.mediaName)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid BackgroundAudio")
                }
            }
        }

        class PredefinedMedia
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val type: JsonValue,
            private val value: JsonField<PredefinedMediaValue>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                @JsonProperty("value")
                @ExcludeMissing
                value: JsonField<PredefinedMediaValue> = JsonMissing.of(),
            ) : this(type, value, mutableMapOf())

            /**
             * Select from predefined media options.
             *
             * Expected to always return the following:
             * ```java
             * JsonValue.from("predefined_media")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

            /**
             * The predefined media to use. `silence` disables background audio.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun value(): PredefinedMediaValue = value.getRequired("value")

            /**
             * Returns the raw JSON value of [value].
             *
             * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("value")
            @ExcludeMissing
            fun _value(): JsonField<PredefinedMediaValue> = value

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
                 * Returns a mutable builder for constructing an instance of [PredefinedMedia].
                 *
                 * The following fields are required:
                 * ```java
                 * .value()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PredefinedMedia]. */
            class Builder internal constructor() {

                private var type: JsonValue = JsonValue.from("predefined_media")
                private var value: JsonField<PredefinedMediaValue>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(predefinedMedia: PredefinedMedia) = apply {
                    type = predefinedMedia.type
                    value = predefinedMedia.value
                    additionalProperties = predefinedMedia.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from("predefined_media")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonValue) = apply { this.type = type }

                /** The predefined media to use. `silence` disables background audio. */
                fun value(value: PredefinedMediaValue) = value(JsonField.of(value))

                /**
                 * Sets [Builder.value] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.value] with a well-typed [PredefinedMediaValue]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun value(value: JsonField<PredefinedMediaValue>) = apply { this.value = value }

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
                 * Returns an immutable instance of [PredefinedMedia].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .value()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): PredefinedMedia =
                    PredefinedMedia(
                        type,
                        checkRequired("value", value),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): PredefinedMedia = apply {
                if (validated) {
                    return@apply
                }

                _type().let {
                    if (it != JsonValue.from("predefined_media")) {
                        throw TelnyxInvalidDataException("'type' is invalid, received $it")
                    }
                }
                value().validate()
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
                type.let { if (it == JsonValue.from("predefined_media")) 1 else 0 } +
                    (value.asKnown().getOrNull()?.validity() ?: 0)

            /** The predefined media to use. `silence` disables background audio. */
            class PredefinedMediaValue
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val SILENCE = of("silence")

                    @JvmField val OFFICE = of("office")

                    @JvmStatic fun of(value: String) = PredefinedMediaValue(JsonField.of(value))
                }

                /** An enum containing [PredefinedMediaValue]'s known values. */
                enum class Known {
                    SILENCE,
                    OFFICE,
                }

                /**
                 * An enum containing [PredefinedMediaValue]'s known values, as well as an
                 * [_UNKNOWN] member.
                 *
                 * An instance of [PredefinedMediaValue] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    SILENCE,
                    OFFICE,
                    /**
                     * An enum member indicating that [PredefinedMediaValue] was instantiated with
                     * an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        SILENCE -> Value.SILENCE
                        OFFICE -> Value.OFFICE
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        SILENCE -> Known.SILENCE
                        OFFICE -> Known.OFFICE
                        else ->
                            throw TelnyxInvalidDataException("Unknown PredefinedMediaValue: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): PredefinedMediaValue = apply {
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

                    return other is PredefinedMediaValue && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PredefinedMedia &&
                    type == other.type &&
                    value == other.value &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(type, value, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PredefinedMedia{type=$type, value=$value, additionalProperties=$additionalProperties}"
        }

        class MediaUrl
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val type: JsonValue,
            private val value: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
            ) : this(type, value, mutableMapOf())

            /**
             * Provide a direct URL to an MP3 file. The audio will loop during the call.
             *
             * Expected to always return the following:
             * ```java
             * JsonValue.from("media_url")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

            /**
             * HTTPS URL to an MP3 file.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun value(): String = value.getRequired("value")

            /**
             * Returns the raw JSON value of [value].
             *
             * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
                 * Returns a mutable builder for constructing an instance of [MediaUrl].
                 *
                 * The following fields are required:
                 * ```java
                 * .value()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [MediaUrl]. */
            class Builder internal constructor() {

                private var type: JsonValue = JsonValue.from("media_url")
                private var value: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(mediaUrl: MediaUrl) = apply {
                    type = mediaUrl.type
                    value = mediaUrl.value
                    additionalProperties = mediaUrl.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from("media_url")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonValue) = apply { this.type = type }

                /** HTTPS URL to an MP3 file. */
                fun value(value: String) = value(JsonField.of(value))

                /**
                 * Sets [Builder.value] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.value] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun value(value: JsonField<String>) = apply { this.value = value }

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
                 * Returns an immutable instance of [MediaUrl].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .value()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): MediaUrl =
                    MediaUrl(
                        type,
                        checkRequired("value", value),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): MediaUrl = apply {
                if (validated) {
                    return@apply
                }

                _type().let {
                    if (it != JsonValue.from("media_url")) {
                        throw TelnyxInvalidDataException("'type' is invalid, received $it")
                    }
                }
                value()
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
                type.let { if (it == JsonValue.from("media_url")) 1 else 0 } +
                    (if (value.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is MediaUrl &&
                    type == other.type &&
                    value == other.value &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(type, value, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "MediaUrl{type=$type, value=$value, additionalProperties=$additionalProperties}"
        }

        class MediaName
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val type: JsonValue,
            private val value: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
            ) : this(type, value, mutableMapOf())

            /**
             * Reference a previously uploaded media by its name from Telnyx Media Storage.
             *
             * Expected to always return the following:
             * ```java
             * JsonValue.from("media_name")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

            /**
             * The `name` of a media asset created via
             * [Media Storage API](https://developers.telnyx.com/api/media-storage/create-media-storage).
             * The audio will loop during the call.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun value(): String = value.getRequired("value")

            /**
             * Returns the raw JSON value of [value].
             *
             * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
                 * Returns a mutable builder for constructing an instance of [MediaName].
                 *
                 * The following fields are required:
                 * ```java
                 * .value()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [MediaName]. */
            class Builder internal constructor() {

                private var type: JsonValue = JsonValue.from("media_name")
                private var value: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(mediaName: MediaName) = apply {
                    type = mediaName.type
                    value = mediaName.value
                    additionalProperties = mediaName.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from("media_name")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonValue) = apply { this.type = type }

                /**
                 * The `name` of a media asset created via
                 * [Media Storage API](https://developers.telnyx.com/api/media-storage/create-media-storage).
                 * The audio will loop during the call.
                 */
                fun value(value: String) = value(JsonField.of(value))

                /**
                 * Sets [Builder.value] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.value] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun value(value: JsonField<String>) = apply { this.value = value }

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
                 * Returns an immutable instance of [MediaName].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .value()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): MediaName =
                    MediaName(
                        type,
                        checkRequired("value", value),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): MediaName = apply {
                if (validated) {
                    return@apply
                }

                _type().let {
                    if (it != JsonValue.from("media_name")) {
                        throw TelnyxInvalidDataException("'type' is invalid, received $it")
                    }
                }
                value()
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
                type.let { if (it == JsonValue.from("media_name")) 1 else 0 } +
                    (if (value.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is MediaName &&
                    type == other.type &&
                    value == other.value &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(type, value, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "MediaName{type=$type, value=$value, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VoiceSettings &&
            voice == other.voice &&
            apiKeyRef == other.apiKeyRef &&
            backgroundAudio == other.backgroundAudio &&
            similarityBoost == other.similarityBoost &&
            speed == other.speed &&
            style == other.style &&
            temperature == other.temperature &&
            useSpeakerBoost == other.useSpeakerBoost &&
            voiceSpeed == other.voiceSpeed &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            voice,
            apiKeyRef,
            backgroundAudio,
            similarityBoost,
            speed,
            style,
            temperature,
            useSpeakerBoost,
            voiceSpeed,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VoiceSettings{voice=$voice, apiKeyRef=$apiKeyRef, backgroundAudio=$backgroundAudio, similarityBoost=$similarityBoost, speed=$speed, style=$style, temperature=$temperature, useSpeakerBoost=$useSpeakerBoost, voiceSpeed=$voiceSpeed, additionalProperties=$additionalProperties}"
}
