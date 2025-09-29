// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.texml.accounts

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Subresources details for a recording if available. */
class TexmlRecordingSubresourcesUris
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val transcriptions: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("transcriptions")
        @ExcludeMissing
        transcriptions: JsonField<String> = JsonMissing.of()
    ) : this(transcriptions, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transcriptions(): Optional<String> = transcriptions.getOptional("transcriptions")

    /**
     * Returns the raw JSON value of [transcriptions].
     *
     * Unlike [transcriptions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transcriptions")
    @ExcludeMissing
    fun _transcriptions(): JsonField<String> = transcriptions

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
         * [TexmlRecordingSubresourcesUris].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TexmlRecordingSubresourcesUris]. */
    class Builder internal constructor() {

        private var transcriptions: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(texmlRecordingSubresourcesUris: TexmlRecordingSubresourcesUris) = apply {
            transcriptions = texmlRecordingSubresourcesUris.transcriptions
            additionalProperties =
                texmlRecordingSubresourcesUris.additionalProperties.toMutableMap()
        }

        fun transcriptions(transcriptions: String?) =
            transcriptions(JsonField.ofNullable(transcriptions))

        /** Alias for calling [Builder.transcriptions] with `transcriptions.orElse(null)`. */
        fun transcriptions(transcriptions: Optional<String>) =
            transcriptions(transcriptions.getOrNull())

        /**
         * Sets [Builder.transcriptions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transcriptions] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun transcriptions(transcriptions: JsonField<String>) = apply {
            this.transcriptions = transcriptions
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
         * Returns an immutable instance of [TexmlRecordingSubresourcesUris].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TexmlRecordingSubresourcesUris =
            TexmlRecordingSubresourcesUris(transcriptions, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): TexmlRecordingSubresourcesUris = apply {
        if (validated) {
            return@apply
        }

        transcriptions()
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
    @JvmSynthetic internal fun validity(): Int = (if (transcriptions.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TexmlRecordingSubresourcesUris &&
            transcriptions == other.transcriptions &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(transcriptions, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TexmlRecordingSubresourcesUris{transcriptions=$transcriptions, additionalProperties=$additionalProperties}"
}
