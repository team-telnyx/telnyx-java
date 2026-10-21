// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ttsintegrations.actions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** One recorded run of `test_connection`. */
class CommunityTtsConformanceRun
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val checks: JsonField<Checks>,
    private val kind: JsonField<Kind>,
    private val success: JsonField<Boolean>,
    private val error: JsonField<String>,
    private val latencyMs: JsonField<Long>,
    private val startedAt: JsonField<OffsetDateTime>,
    private val timeToFirstAudioMs: JsonField<Long>,
    private val voiceId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("checks") @ExcludeMissing checks: JsonField<Checks> = JsonMissing.of(),
        @JsonProperty("kind") @ExcludeMissing kind: JsonField<Kind> = JsonMissing.of(),
        @JsonProperty("success") @ExcludeMissing success: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("error") @ExcludeMissing error: JsonField<String> = JsonMissing.of(),
        @JsonProperty("latency_ms") @ExcludeMissing latencyMs: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("started_at")
        @ExcludeMissing
        startedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("time_to_first_audio_ms")
        @ExcludeMissing
        timeToFirstAudioMs: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("voice_id") @ExcludeMissing voiceId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        checks,
        kind,
        success,
        error,
        latencyMs,
        startedAt,
        timeToFirstAudioMs,
        voiceId,
        mutableMapOf(),
    )

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Each check is `ok`, `failed` or `skipped`: `voices_url_reachable`, `voices_schema_valid`,
     * `handshake`, `auth`, `init_accepted`, `audio_received`, `final_frame_received`,
     * `clean_close`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun checks(): Checks = checks.getRequired("checks")

    /**
     * `test_connection`: run by the owner. `conformance`: run by Telnyx during review.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun kind(): Kind = kind.getRequired("kind")

    /**
     * `true` when every check is `ok`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun success(): Boolean = success.getRequired("success")

    /**
     * The first failure, in words.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun error(): Optional<String> = error.getOptional("error")

    /**
     * How long the whole run took.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun latencyMs(): Optional<Long> = latencyMs.getOptional("latency_ms")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startedAt(): Optional<OffsetDateTime> = startedAt.getOptional("started_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timeToFirstAudioMs(): Optional<Long> =
        timeToFirstAudioMs.getOptional("time_to_first_audio_ms")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun voiceId(): Optional<String> = voiceId.getOptional("voice_id")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [checks].
     *
     * Unlike [checks], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("checks") @ExcludeMissing fun _checks(): JsonField<Checks> = checks

    /**
     * Returns the raw JSON value of [kind].
     *
     * Unlike [kind], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("kind") @ExcludeMissing fun _kind(): JsonField<Kind> = kind

    /**
     * Returns the raw JSON value of [success].
     *
     * Unlike [success], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("success") @ExcludeMissing fun _success(): JsonField<Boolean> = success

    /**
     * Returns the raw JSON value of [error].
     *
     * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

    /**
     * Returns the raw JSON value of [latencyMs].
     *
     * Unlike [latencyMs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("latency_ms") @ExcludeMissing fun _latencyMs(): JsonField<Long> = latencyMs

    /**
     * Returns the raw JSON value of [startedAt].
     *
     * Unlike [startedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("started_at")
    @ExcludeMissing
    fun _startedAt(): JsonField<OffsetDateTime> = startedAt

    /**
     * Returns the raw JSON value of [timeToFirstAudioMs].
     *
     * Unlike [timeToFirstAudioMs], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("time_to_first_audio_ms")
    @ExcludeMissing
    fun _timeToFirstAudioMs(): JsonField<Long> = timeToFirstAudioMs

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
         * Returns a mutable builder for constructing an instance of [CommunityTtsConformanceRun].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .checks()
         * .kind()
         * .success()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CommunityTtsConformanceRun]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var checks: JsonField<Checks>? = null
        private var kind: JsonField<Kind>? = null
        private var success: JsonField<Boolean>? = null
        private var error: JsonField<String> = JsonMissing.of()
        private var latencyMs: JsonField<Long> = JsonMissing.of()
        private var startedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var timeToFirstAudioMs: JsonField<Long> = JsonMissing.of()
        private var voiceId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(communityTtsConformanceRun: CommunityTtsConformanceRun) = apply {
            id = communityTtsConformanceRun.id
            checks = communityTtsConformanceRun.checks
            kind = communityTtsConformanceRun.kind
            success = communityTtsConformanceRun.success
            error = communityTtsConformanceRun.error
            latencyMs = communityTtsConformanceRun.latencyMs
            startedAt = communityTtsConformanceRun.startedAt
            timeToFirstAudioMs = communityTtsConformanceRun.timeToFirstAudioMs
            voiceId = communityTtsConformanceRun.voiceId
            additionalProperties = communityTtsConformanceRun.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * Each check is `ok`, `failed` or `skipped`: `voices_url_reachable`, `voices_schema_valid`,
         * `handshake`, `auth`, `init_accepted`, `audio_received`, `final_frame_received`,
         * `clean_close`.
         */
        fun checks(checks: Checks) = checks(JsonField.of(checks))

        /**
         * Sets [Builder.checks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.checks] with a well-typed [Checks] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun checks(checks: JsonField<Checks>) = apply { this.checks = checks }

        /** `test_connection`: run by the owner. `conformance`: run by Telnyx during review. */
        fun kind(kind: Kind) = kind(JsonField.of(kind))

        /**
         * Sets [Builder.kind] to an arbitrary JSON value.
         *
         * You should usually call [Builder.kind] with a well-typed [Kind] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun kind(kind: JsonField<Kind>) = apply { this.kind = kind }

        /** `true` when every check is `ok`. */
        fun success(success: Boolean) = success(JsonField.of(success))

        /**
         * Sets [Builder.success] to an arbitrary JSON value.
         *
         * You should usually call [Builder.success] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun success(success: JsonField<Boolean>) = apply { this.success = success }

        /** The first failure, in words. */
        fun error(error: String?) = error(JsonField.ofNullable(error))

        /** Alias for calling [Builder.error] with `error.orElse(null)`. */
        fun error(error: Optional<String>) = error(error.getOrNull())

        /**
         * Sets [Builder.error] to an arbitrary JSON value.
         *
         * You should usually call [Builder.error] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun error(error: JsonField<String>) = apply { this.error = error }

        /** How long the whole run took. */
        fun latencyMs(latencyMs: Long?) = latencyMs(JsonField.ofNullable(latencyMs))

        /**
         * Alias for [Builder.latencyMs].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun latencyMs(latencyMs: Long) = latencyMs(latencyMs as Long?)

        /** Alias for calling [Builder.latencyMs] with `latencyMs.orElse(null)`. */
        fun latencyMs(latencyMs: Optional<Long>) = latencyMs(latencyMs.getOrNull())

        /**
         * Sets [Builder.latencyMs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.latencyMs] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun latencyMs(latencyMs: JsonField<Long>) = apply { this.latencyMs = latencyMs }

        fun startedAt(startedAt: OffsetDateTime) = startedAt(JsonField.of(startedAt))

        /**
         * Sets [Builder.startedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startedAt(startedAt: JsonField<OffsetDateTime>) = apply { this.startedAt = startedAt }

        fun timeToFirstAudioMs(timeToFirstAudioMs: Long?) =
            timeToFirstAudioMs(JsonField.ofNullable(timeToFirstAudioMs))

        /**
         * Alias for [Builder.timeToFirstAudioMs].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun timeToFirstAudioMs(timeToFirstAudioMs: Long) =
            timeToFirstAudioMs(timeToFirstAudioMs as Long?)

        /**
         * Alias for calling [Builder.timeToFirstAudioMs] with `timeToFirstAudioMs.orElse(null)`.
         */
        fun timeToFirstAudioMs(timeToFirstAudioMs: Optional<Long>) =
            timeToFirstAudioMs(timeToFirstAudioMs.getOrNull())

        /**
         * Sets [Builder.timeToFirstAudioMs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeToFirstAudioMs] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun timeToFirstAudioMs(timeToFirstAudioMs: JsonField<Long>) = apply {
            this.timeToFirstAudioMs = timeToFirstAudioMs
        }

        fun voiceId(voiceId: String?) = voiceId(JsonField.ofNullable(voiceId))

        /** Alias for calling [Builder.voiceId] with `voiceId.orElse(null)`. */
        fun voiceId(voiceId: Optional<String>) = voiceId(voiceId.getOrNull())

        /**
         * Sets [Builder.voiceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voiceId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
         * Returns an immutable instance of [CommunityTtsConformanceRun].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .checks()
         * .kind()
         * .success()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CommunityTtsConformanceRun =
            CommunityTtsConformanceRun(
                checkRequired("id", id),
                checkRequired("checks", checks),
                checkRequired("kind", kind),
                checkRequired("success", success),
                error,
                latencyMs,
                startedAt,
                timeToFirstAudioMs,
                voiceId,
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
    fun validate(): CommunityTtsConformanceRun = apply {
        if (validated) {
            return@apply
        }

        id()
        checks().validate()
        kind().validate()
        success()
        error()
        latencyMs()
        startedAt()
        timeToFirstAudioMs()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (checks.asKnown().getOrNull()?.validity() ?: 0) +
            (kind.asKnown().getOrNull()?.validity() ?: 0) +
            (if (success.asKnown().isPresent) 1 else 0) +
            (if (error.asKnown().isPresent) 1 else 0) +
            (if (latencyMs.asKnown().isPresent) 1 else 0) +
            (if (startedAt.asKnown().isPresent) 1 else 0) +
            (if (timeToFirstAudioMs.asKnown().isPresent) 1 else 0) +
            (if (voiceId.asKnown().isPresent) 1 else 0)

    /**
     * Each check is `ok`, `failed` or `skipped`: `voices_url_reachable`, `voices_schema_valid`,
     * `handshake`, `auth`, `init_accepted`, `audio_received`, `final_frame_received`,
     * `clean_close`.
     */
    class Checks
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Checks]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Checks]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(checks: Checks) = apply {
                additionalProperties = checks.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Checks].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Checks = Checks(additionalProperties.toImmutable())
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
        fun validate(): Checks = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Checks && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Checks{additionalProperties=$additionalProperties}"
    }

    /** `test_connection`: run by the owner. `conformance`: run by Telnyx during review. */
    class Kind @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val TEST_CONNECTION = of("test_connection")

            @JvmField val CONFORMANCE = of("conformance")

            @JvmStatic fun of(value: String) = Kind(JsonField.of(value))
        }

        /** An enum containing [Kind]'s known values. */
        enum class Known {
            TEST_CONNECTION,
            CONFORMANCE,
        }

        /**
         * An enum containing [Kind]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Kind] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TEST_CONNECTION,
            CONFORMANCE,
            /** An enum member indicating that [Kind] was instantiated with an unknown value. */
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
                TEST_CONNECTION -> Value.TEST_CONNECTION
                CONFORMANCE -> Value.CONFORMANCE
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
                TEST_CONNECTION -> Known.TEST_CONNECTION
                CONFORMANCE -> Known.CONFORMANCE
                else -> throw TelnyxInvalidDataException("Unknown Kind: $value")
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
        fun validate(): Kind = apply {
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

            return other is Kind && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CommunityTtsConformanceRun &&
            id == other.id &&
            checks == other.checks &&
            kind == other.kind &&
            success == other.success &&
            error == other.error &&
            latencyMs == other.latencyMs &&
            startedAt == other.startedAt &&
            timeToFirstAudioMs == other.timeToFirstAudioMs &&
            voiceId == other.voiceId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            checks,
            kind,
            success,
            error,
            latencyMs,
            startedAt,
            timeToFirstAudioMs,
            voiceId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CommunityTtsConformanceRun{id=$id, checks=$checks, kind=$kind, success=$success, error=$error, latencyMs=$latencyMs, startedAt=$startedAt, timeToFirstAudioMs=$timeToFirstAudioMs, voiceId=$voiceId, additionalProperties=$additionalProperties}"
}
