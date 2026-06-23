// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.speechtotext

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
 * Retrieve the canonical list of supported speech-to-text providers, models, accepted language
 * codes, and the service types each model supports.
 *
 * Service types:
 * * `streaming` — standalone WebSocket transcription via `/speech-to-text/transcription`.
 * * `file_based` — file-based transcription via `/ai/audio/transcriptions`.
 * * `in_call` — live call transcription via Call Control `transcription_start`.
 * * `ai_assistant` — STT configured on a Call Control AI Assistant via voice-assistant
 *   `TranscriptionConfig` (covers both live-streaming and non-streaming/batch models).
 *
 * Use this endpoint to discover which (provider, model) combinations are available for the surface
 * you need, and which language codes each accepts. `auto` in a `languages` array indicates the
 * provider performs language detection.
 */
class SpeechToTextListProvidersParams
private constructor(
    private val provider: Provider?,
    private val serviceType: SttServiceType?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Filter to entries for a specific STT provider. The enum mirrors the providers advertised
     * across the speech-to-text spec (including `google` and `telnyx`, which are accepted as
     * WebSocket transcription engines). A provider that has no models currently registered for any
     * service type will return an empty `data` array rather than an error.
     */
    fun provider(): Optional<Provider> = Optional.ofNullable(provider)

    /**
     * Filter to entries that support the given service type. For backward compatibility with the
     * values that briefly shipped before the product-aligned rename, the legacy aliases
     * `file_transcription`, `in_call_transcription`, and `ai_assistant_transcription` are silently
     * accepted and normalized to `file_based`, `in_call`, and `ai_assistant` respectively. The
     * response always emits the canonical (post-rename) values.
     */
    fun serviceType(): Optional<SttServiceType> = Optional.ofNullable(serviceType)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): SpeechToTextListProvidersParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [SpeechToTextListProvidersParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SpeechToTextListProvidersParams]. */
    class Builder internal constructor() {

        private var provider: Provider? = null
        private var serviceType: SttServiceType? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(speechToTextListProvidersParams: SpeechToTextListProvidersParams) =
            apply {
                provider = speechToTextListProvidersParams.provider
                serviceType = speechToTextListProvidersParams.serviceType
                additionalHeaders = speechToTextListProvidersParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    speechToTextListProvidersParams.additionalQueryParams.toBuilder()
            }

        /**
         * Filter to entries for a specific STT provider. The enum mirrors the providers advertised
         * across the speech-to-text spec (including `google` and `telnyx`, which are accepted as
         * WebSocket transcription engines). A provider that has no models currently registered for
         * any service type will return an empty `data` array rather than an error.
         */
        fun provider(provider: Provider?) = apply { this.provider = provider }

        /** Alias for calling [Builder.provider] with `provider.orElse(null)`. */
        fun provider(provider: Optional<Provider>) = provider(provider.getOrNull())

        /**
         * Filter to entries that support the given service type. For backward compatibility with
         * the values that briefly shipped before the product-aligned rename, the legacy aliases
         * `file_transcription`, `in_call_transcription`, and `ai_assistant_transcription` are
         * silently accepted and normalized to `file_based`, `in_call`, and `ai_assistant`
         * respectively. The response always emits the canonical (post-rename) values.
         */
        fun serviceType(serviceType: SttServiceType?) = apply { this.serviceType = serviceType }

        /** Alias for calling [Builder.serviceType] with `serviceType.orElse(null)`. */
        fun serviceType(serviceType: Optional<SttServiceType>) =
            serviceType(serviceType.getOrNull())

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
         * Returns an immutable instance of [SpeechToTextListProvidersParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SpeechToTextListProvidersParams =
            SpeechToTextListProvidersParams(
                provider,
                serviceType,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                provider?.let { put("provider", it.toString()) }
                serviceType?.let { put("service_type", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Filter to entries for a specific STT provider. The enum mirrors the providers advertised
     * across the speech-to-text spec (including `google` and `telnyx`, which are accepted as
     * WebSocket transcription engines). A provider that has no models currently registered for any
     * service type will return an empty `data` array rather than an error.
     */
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

            @JvmField val DEEPGRAM = of("deepgram")

            @JvmField val SPEECHMATICS = of("speechmatics")

            @JvmField val ASSEMBLYAI = of("assemblyai")

            @JvmField val XAI = of("xai")

            @JvmField val SONIOX = of("soniox")

            @JvmField val AZURE = of("azure")

            @JvmField val OPENAI = of("openai")

            @JvmField val GOOGLE = of("google")

            @JvmField val TELNYX = of("telnyx")

            @JvmStatic fun of(value: String) = Provider(JsonField.of(value))
        }

        /** An enum containing [Provider]'s known values. */
        enum class Known {
            DEEPGRAM,
            SPEECHMATICS,
            ASSEMBLYAI,
            XAI,
            SONIOX,
            AZURE,
            OPENAI,
            GOOGLE,
            TELNYX,
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
            DEEPGRAM,
            SPEECHMATICS,
            ASSEMBLYAI,
            XAI,
            SONIOX,
            AZURE,
            OPENAI,
            GOOGLE,
            TELNYX,
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
                DEEPGRAM -> Value.DEEPGRAM
                SPEECHMATICS -> Value.SPEECHMATICS
                ASSEMBLYAI -> Value.ASSEMBLYAI
                XAI -> Value.XAI
                SONIOX -> Value.SONIOX
                AZURE -> Value.AZURE
                OPENAI -> Value.OPENAI
                GOOGLE -> Value.GOOGLE
                TELNYX -> Value.TELNYX
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
                DEEPGRAM -> Known.DEEPGRAM
                SPEECHMATICS -> Known.SPEECHMATICS
                ASSEMBLYAI -> Known.ASSEMBLYAI
                XAI -> Known.XAI
                SONIOX -> Known.SONIOX
                AZURE -> Known.AZURE
                OPENAI -> Known.OPENAI
                GOOGLE -> Known.GOOGLE
                TELNYX -> Known.TELNYX
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

        return other is SpeechToTextListProvidersParams &&
            provider == other.provider &&
            serviceType == other.serviceType &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(provider, serviceType, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "SpeechToTextListProvidersParams{provider=$provider, serviceType=$serviceType, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
