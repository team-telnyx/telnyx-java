// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texttospeech

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

/** Response when `output_type` is `base64_output`. */
class TextToSpeechGenerateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val base64Audio: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("base64_audio")
        @ExcludeMissing
        base64Audio: JsonField<String> = JsonMissing.of()
    ) : this(base64Audio, mutableMapOf())

    /**
     * Base64-encoded audio data.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun base64Audio(): Optional<String> = base64Audio.getOptional("base64_audio")

    /**
     * Returns the raw JSON value of [base64Audio].
     *
     * Unlike [base64Audio], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("base64_audio")
    @ExcludeMissing
    fun _base64Audio(): JsonField<String> = base64Audio

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
         * Returns a mutable builder for constructing an instance of [TextToSpeechGenerateResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TextToSpeechGenerateResponse]. */
    class Builder internal constructor() {

        private var base64Audio: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(textToSpeechGenerateResponse: TextToSpeechGenerateResponse) = apply {
            base64Audio = textToSpeechGenerateResponse.base64Audio
            additionalProperties = textToSpeechGenerateResponse.additionalProperties.toMutableMap()
        }

        /** Base64-encoded audio data. */
        fun base64Audio(base64Audio: String) = base64Audio(JsonField.of(base64Audio))

        /**
         * Sets [Builder.base64Audio] to an arbitrary JSON value.
         *
         * You should usually call [Builder.base64Audio] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun base64Audio(base64Audio: JsonField<String>) = apply { this.base64Audio = base64Audio }

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
         * Returns an immutable instance of [TextToSpeechGenerateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TextToSpeechGenerateResponse =
            TextToSpeechGenerateResponse(base64Audio, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): TextToSpeechGenerateResponse = apply {
        if (validated) {
            return@apply
        }

        base64Audio()
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
    @JvmSynthetic internal fun validity(): Int = (if (base64Audio.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TextToSpeechGenerateResponse &&
            base64Audio == other.base64Audio &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(base64Audio, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TextToSpeechGenerateResponse{base64Audio=$base64Audio, additionalProperties=$additionalProperties}"
}
