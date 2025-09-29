// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.calls

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

/** Use this field to modify sound effects, for example adjust the pitch. */
class SoundModifications
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val octaves: JsonField<Double>,
    private val pitch: JsonField<Double>,
    private val semitone: JsonField<Double>,
    private val track: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("octaves") @ExcludeMissing octaves: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("pitch") @ExcludeMissing pitch: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("semitone") @ExcludeMissing semitone: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("track") @ExcludeMissing track: JsonField<String> = JsonMissing.of(),
    ) : this(octaves, pitch, semitone, track, mutableMapOf())

    /**
     * Adjust the pitch in octaves, values should be between -1 and 1, default 0
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun octaves(): Optional<Double> = octaves.getOptional("octaves")

    /**
     * Set the pitch directly, value should be > 0, default 1 (lower = lower tone)
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pitch(): Optional<Double> = pitch.getOptional("pitch")

    /**
     * Adjust the pitch in semitones, values should be between -14 and 14, default 0
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun semitone(): Optional<Double> = semitone.getOptional("semitone")

    /**
     * The track to which the sound modifications will be applied. Accepted values are `inbound` or
     * `outbound`
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun track(): Optional<String> = track.getOptional("track")

    /**
     * Returns the raw JSON value of [octaves].
     *
     * Unlike [octaves], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("octaves") @ExcludeMissing fun _octaves(): JsonField<Double> = octaves

    /**
     * Returns the raw JSON value of [pitch].
     *
     * Unlike [pitch], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pitch") @ExcludeMissing fun _pitch(): JsonField<Double> = pitch

    /**
     * Returns the raw JSON value of [semitone].
     *
     * Unlike [semitone], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("semitone") @ExcludeMissing fun _semitone(): JsonField<Double> = semitone

    /**
     * Returns the raw JSON value of [track].
     *
     * Unlike [track], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("track") @ExcludeMissing fun _track(): JsonField<String> = track

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

        /** Returns a mutable builder for constructing an instance of [SoundModifications]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SoundModifications]. */
    class Builder internal constructor() {

        private var octaves: JsonField<Double> = JsonMissing.of()
        private var pitch: JsonField<Double> = JsonMissing.of()
        private var semitone: JsonField<Double> = JsonMissing.of()
        private var track: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(soundModifications: SoundModifications) = apply {
            octaves = soundModifications.octaves
            pitch = soundModifications.pitch
            semitone = soundModifications.semitone
            track = soundModifications.track
            additionalProperties = soundModifications.additionalProperties.toMutableMap()
        }

        /** Adjust the pitch in octaves, values should be between -1 and 1, default 0 */
        fun octaves(octaves: Double) = octaves(JsonField.of(octaves))

        /**
         * Sets [Builder.octaves] to an arbitrary JSON value.
         *
         * You should usually call [Builder.octaves] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun octaves(octaves: JsonField<Double>) = apply { this.octaves = octaves }

        /** Set the pitch directly, value should be > 0, default 1 (lower = lower tone) */
        fun pitch(pitch: Double) = pitch(JsonField.of(pitch))

        /**
         * Sets [Builder.pitch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pitch] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pitch(pitch: JsonField<Double>) = apply { this.pitch = pitch }

        /** Adjust the pitch in semitones, values should be between -14 and 14, default 0 */
        fun semitone(semitone: Double) = semitone(JsonField.of(semitone))

        /**
         * Sets [Builder.semitone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.semitone] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun semitone(semitone: JsonField<Double>) = apply { this.semitone = semitone }

        /**
         * The track to which the sound modifications will be applied. Accepted values are `inbound`
         * or `outbound`
         */
        fun track(track: String) = track(JsonField.of(track))

        /**
         * Sets [Builder.track] to an arbitrary JSON value.
         *
         * You should usually call [Builder.track] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun track(track: JsonField<String>) = apply { this.track = track }

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
         * Returns an immutable instance of [SoundModifications].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SoundModifications =
            SoundModifications(octaves, pitch, semitone, track, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): SoundModifications = apply {
        if (validated) {
            return@apply
        }

        octaves()
        pitch()
        semitone()
        track()
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
        (if (octaves.asKnown().isPresent) 1 else 0) +
            (if (pitch.asKnown().isPresent) 1 else 0) +
            (if (semitone.asKnown().isPresent) 1 else 0) +
            (if (track.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SoundModifications &&
            octaves == other.octaves &&
            pitch == other.pitch &&
            semitone == other.semitone &&
            track == other.track &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(octaves, pitch, semitone, track, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SoundModifications{octaves=$octaves, pitch=$pitch, semitone=$semitone, track=$track, additionalProperties=$additionalProperties}"
}
