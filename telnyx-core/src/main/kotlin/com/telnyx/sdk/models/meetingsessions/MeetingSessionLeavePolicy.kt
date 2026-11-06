// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.meetingsessions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Automatic departure settings for Google Meet and Teams. Omitted fields use the default behavior.
 * Set at creation; cannot be changed later. Zoom ignores this policy.
 */
class MeetingSessionLeavePolicy
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val aloneSeconds: JsonField<Long>,
    private val botNameKeywords: JsonField<List<String>>,
    private val hostWaitSeconds: JsonField<Long>,
    private val lobbyWaitSeconds: JsonField<Long>,
    private val maxDurationSeconds: JsonField<Long>,
    private val silenceGraceSeconds: JsonField<Long>,
    private val silenceSeconds: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("alone_seconds")
        @ExcludeMissing
        aloneSeconds: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("bot_name_keywords")
        @ExcludeMissing
        botNameKeywords: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("host_wait_seconds")
        @ExcludeMissing
        hostWaitSeconds: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("lobby_wait_seconds")
        @ExcludeMissing
        lobbyWaitSeconds: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("max_duration_seconds")
        @ExcludeMissing
        maxDurationSeconds: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("silence_grace_seconds")
        @ExcludeMissing
        silenceGraceSeconds: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("silence_seconds")
        @ExcludeMissing
        silenceSeconds: JsonField<Long> = JsonMissing.of(),
    ) : this(
        aloneSeconds,
        botNameKeywords,
        hostWaitSeconds,
        lobbyWaitSeconds,
        maxDurationSeconds,
        silenceGraceSeconds,
        silenceSeconds,
        mutableMapOf(),
    )

    /**
     * Seconds alone after another participant has attended and left. Does not start just because
     * the bot arrives first.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun aloneSeconds(): Optional<Long> = aloneSeconds.getOptional("alone_seconds")

    /**
     * Case-insensitive names or phrases identifying other bots to exclude when deciding whether
     * this bot is alone. Matching splits names on spaces, hyphens and underscores. Null or an empty
     * array disables filtering.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun botNameKeywords(): Optional<List<String>> = botNameKeywords.getOptional("bot_name_keywords")

    /**
     * Seconds to wait for the host to start the meeting.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hostWaitSeconds(): Optional<Long> = hostWaitSeconds.getOptional("host_wait_seconds")

    /**
     * Seconds to wait for lobby admission.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lobbyWaitSeconds(): Optional<Long> = lobbyWaitSeconds.getOptional("lobby_wait_seconds")

    /**
     * Maximum seconds after joining. Null means no per-join duration limit; service safety limits
     * still apply.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxDurationSeconds(): Optional<Long> =
        maxDurationSeconds.getOptional("max_duration_seconds")

    /**
     * Seconds after joining before silence detection starts a fresh inactivity timer.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun silenceGraceSeconds(): Optional<Long> =
        silenceGraceSeconds.getOptional("silence_grace_seconds")

    /**
     * Continuous audio inactivity before departure after the silence grace period.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun silenceSeconds(): Optional<Long> = silenceSeconds.getOptional("silence_seconds")

    /**
     * Returns the raw JSON value of [aloneSeconds].
     *
     * Unlike [aloneSeconds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("alone_seconds")
    @ExcludeMissing
    fun _aloneSeconds(): JsonField<Long> = aloneSeconds

    /**
     * Returns the raw JSON value of [botNameKeywords].
     *
     * Unlike [botNameKeywords], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bot_name_keywords")
    @ExcludeMissing
    fun _botNameKeywords(): JsonField<List<String>> = botNameKeywords

    /**
     * Returns the raw JSON value of [hostWaitSeconds].
     *
     * Unlike [hostWaitSeconds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("host_wait_seconds")
    @ExcludeMissing
    fun _hostWaitSeconds(): JsonField<Long> = hostWaitSeconds

    /**
     * Returns the raw JSON value of [lobbyWaitSeconds].
     *
     * Unlike [lobbyWaitSeconds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("lobby_wait_seconds")
    @ExcludeMissing
    fun _lobbyWaitSeconds(): JsonField<Long> = lobbyWaitSeconds

    /**
     * Returns the raw JSON value of [maxDurationSeconds].
     *
     * Unlike [maxDurationSeconds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("max_duration_seconds")
    @ExcludeMissing
    fun _maxDurationSeconds(): JsonField<Long> = maxDurationSeconds

    /**
     * Returns the raw JSON value of [silenceGraceSeconds].
     *
     * Unlike [silenceGraceSeconds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("silence_grace_seconds")
    @ExcludeMissing
    fun _silenceGraceSeconds(): JsonField<Long> = silenceGraceSeconds

    /**
     * Returns the raw JSON value of [silenceSeconds].
     *
     * Unlike [silenceSeconds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("silence_seconds")
    @ExcludeMissing
    fun _silenceSeconds(): JsonField<Long> = silenceSeconds

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
         * Returns a mutable builder for constructing an instance of [MeetingSessionLeavePolicy].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MeetingSessionLeavePolicy]. */
    class Builder internal constructor() {

        private var aloneSeconds: JsonField<Long> = JsonMissing.of()
        private var botNameKeywords: JsonField<MutableList<String>>? = null
        private var hostWaitSeconds: JsonField<Long> = JsonMissing.of()
        private var lobbyWaitSeconds: JsonField<Long> = JsonMissing.of()
        private var maxDurationSeconds: JsonField<Long> = JsonMissing.of()
        private var silenceGraceSeconds: JsonField<Long> = JsonMissing.of()
        private var silenceSeconds: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(meetingSessionLeavePolicy: MeetingSessionLeavePolicy) = apply {
            aloneSeconds = meetingSessionLeavePolicy.aloneSeconds
            botNameKeywords = meetingSessionLeavePolicy.botNameKeywords.map { it.toMutableList() }
            hostWaitSeconds = meetingSessionLeavePolicy.hostWaitSeconds
            lobbyWaitSeconds = meetingSessionLeavePolicy.lobbyWaitSeconds
            maxDurationSeconds = meetingSessionLeavePolicy.maxDurationSeconds
            silenceGraceSeconds = meetingSessionLeavePolicy.silenceGraceSeconds
            silenceSeconds = meetingSessionLeavePolicy.silenceSeconds
            additionalProperties = meetingSessionLeavePolicy.additionalProperties.toMutableMap()
        }

        /**
         * Seconds alone after another participant has attended and left. Does not start just
         * because the bot arrives first.
         */
        fun aloneSeconds(aloneSeconds: Long) = aloneSeconds(JsonField.of(aloneSeconds))

        /**
         * Sets [Builder.aloneSeconds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aloneSeconds] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun aloneSeconds(aloneSeconds: JsonField<Long>) = apply { this.aloneSeconds = aloneSeconds }

        /**
         * Case-insensitive names or phrases identifying other bots to exclude when deciding whether
         * this bot is alone. Matching splits names on spaces, hyphens and underscores. Null or an
         * empty array disables filtering.
         */
        fun botNameKeywords(botNameKeywords: List<String>?) =
            botNameKeywords(JsonField.ofNullable(botNameKeywords))

        /** Alias for calling [Builder.botNameKeywords] with `botNameKeywords.orElse(null)`. */
        fun botNameKeywords(botNameKeywords: Optional<List<String>>) =
            botNameKeywords(botNameKeywords.getOrNull())

        /**
         * Sets [Builder.botNameKeywords] to an arbitrary JSON value.
         *
         * You should usually call [Builder.botNameKeywords] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun botNameKeywords(botNameKeywords: JsonField<List<String>>) = apply {
            this.botNameKeywords = botNameKeywords.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [botNameKeywords].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBotNameKeyword(botNameKeyword: String) = apply {
            botNameKeywords =
                (botNameKeywords ?: JsonField.of(mutableListOf())).also {
                    checkKnown("botNameKeywords", it).add(botNameKeyword)
                }
        }

        /** Seconds to wait for the host to start the meeting. */
        fun hostWaitSeconds(hostWaitSeconds: Long) = hostWaitSeconds(JsonField.of(hostWaitSeconds))

        /**
         * Sets [Builder.hostWaitSeconds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hostWaitSeconds] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun hostWaitSeconds(hostWaitSeconds: JsonField<Long>) = apply {
            this.hostWaitSeconds = hostWaitSeconds
        }

        /** Seconds to wait for lobby admission. */
        fun lobbyWaitSeconds(lobbyWaitSeconds: Long) =
            lobbyWaitSeconds(JsonField.of(lobbyWaitSeconds))

        /**
         * Sets [Builder.lobbyWaitSeconds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lobbyWaitSeconds] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lobbyWaitSeconds(lobbyWaitSeconds: JsonField<Long>) = apply {
            this.lobbyWaitSeconds = lobbyWaitSeconds
        }

        /**
         * Maximum seconds after joining. Null means no per-join duration limit; service safety
         * limits still apply.
         */
        fun maxDurationSeconds(maxDurationSeconds: Long?) =
            maxDurationSeconds(JsonField.ofNullable(maxDurationSeconds))

        /**
         * Alias for [Builder.maxDurationSeconds].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxDurationSeconds(maxDurationSeconds: Long) =
            maxDurationSeconds(maxDurationSeconds as Long?)

        /**
         * Alias for calling [Builder.maxDurationSeconds] with `maxDurationSeconds.orElse(null)`.
         */
        fun maxDurationSeconds(maxDurationSeconds: Optional<Long>) =
            maxDurationSeconds(maxDurationSeconds.getOrNull())

        /**
         * Sets [Builder.maxDurationSeconds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxDurationSeconds] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxDurationSeconds(maxDurationSeconds: JsonField<Long>) = apply {
            this.maxDurationSeconds = maxDurationSeconds
        }

        /** Seconds after joining before silence detection starts a fresh inactivity timer. */
        fun silenceGraceSeconds(silenceGraceSeconds: Long) =
            silenceGraceSeconds(JsonField.of(silenceGraceSeconds))

        /**
         * Sets [Builder.silenceGraceSeconds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.silenceGraceSeconds] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun silenceGraceSeconds(silenceGraceSeconds: JsonField<Long>) = apply {
            this.silenceGraceSeconds = silenceGraceSeconds
        }

        /** Continuous audio inactivity before departure after the silence grace period. */
        fun silenceSeconds(silenceSeconds: Long) = silenceSeconds(JsonField.of(silenceSeconds))

        /**
         * Sets [Builder.silenceSeconds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.silenceSeconds] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun silenceSeconds(silenceSeconds: JsonField<Long>) = apply {
            this.silenceSeconds = silenceSeconds
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
         * Returns an immutable instance of [MeetingSessionLeavePolicy].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MeetingSessionLeavePolicy =
            MeetingSessionLeavePolicy(
                aloneSeconds,
                (botNameKeywords ?: JsonMissing.of()).map { it.toImmutable() },
                hostWaitSeconds,
                lobbyWaitSeconds,
                maxDurationSeconds,
                silenceGraceSeconds,
                silenceSeconds,
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
    fun validate(): MeetingSessionLeavePolicy = apply {
        if (validated) {
            return@apply
        }

        aloneSeconds()
        botNameKeywords()
        hostWaitSeconds()
        lobbyWaitSeconds()
        maxDurationSeconds()
        silenceGraceSeconds()
        silenceSeconds()
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
        (if (aloneSeconds.asKnown().isPresent) 1 else 0) +
            (botNameKeywords.asKnown().getOrNull()?.size ?: 0) +
            (if (hostWaitSeconds.asKnown().isPresent) 1 else 0) +
            (if (lobbyWaitSeconds.asKnown().isPresent) 1 else 0) +
            (if (maxDurationSeconds.asKnown().isPresent) 1 else 0) +
            (if (silenceGraceSeconds.asKnown().isPresent) 1 else 0) +
            (if (silenceSeconds.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MeetingSessionLeavePolicy &&
            aloneSeconds == other.aloneSeconds &&
            botNameKeywords == other.botNameKeywords &&
            hostWaitSeconds == other.hostWaitSeconds &&
            lobbyWaitSeconds == other.lobbyWaitSeconds &&
            maxDurationSeconds == other.maxDurationSeconds &&
            silenceGraceSeconds == other.silenceGraceSeconds &&
            silenceSeconds == other.silenceSeconds &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            aloneSeconds,
            botNameKeywords,
            hostWaitSeconds,
            lobbyWaitSeconds,
            maxDurationSeconds,
            silenceGraceSeconds,
            silenceSeconds,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MeetingSessionLeavePolicy{aloneSeconds=$aloneSeconds, botNameKeywords=$botNameKeywords, hostWaitSeconds=$hostWaitSeconds, lobbyWaitSeconds=$lobbyWaitSeconds, maxDurationSeconds=$maxDurationSeconds, silenceGraceSeconds=$silenceGraceSeconds, silenceSeconds=$silenceSeconds, additionalProperties=$additionalProperties}"
}
