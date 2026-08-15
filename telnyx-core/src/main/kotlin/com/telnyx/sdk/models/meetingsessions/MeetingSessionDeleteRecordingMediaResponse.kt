// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.meetingsessions

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
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class MeetingSessionDeleteRecordingMediaResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<Data>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): Data = data.getRequired("data")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

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
         * [MeetingSessionDeleteRecordingMediaResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MeetingSessionDeleteRecordingMediaResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            meetingSessionDeleteRecordingMediaResponse: MeetingSessionDeleteRecordingMediaResponse
        ) = apply {
            data = meetingSessionDeleteRecordingMediaResponse.data
            additionalProperties =
                meetingSessionDeleteRecordingMediaResponse.additionalProperties.toMutableMap()
        }

        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

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
         * Returns an immutable instance of [MeetingSessionDeleteRecordingMediaResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MeetingSessionDeleteRecordingMediaResponse =
            MeetingSessionDeleteRecordingMediaResponse(
                checkRequired("data", data),
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
    fun validate(): MeetingSessionDeleteRecordingMediaResponse = apply {
        if (validated) {
            return@apply
        }

        data().validate()
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
    @JvmSynthetic internal fun validity(): Int = (data.asKnown().getOrNull()?.validity() ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val deletionStatus: JsonField<DeletionStatus>,
        private val meetingSessionId: JsonField<String>,
        private val provider: JsonValue,
        private val scope: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("deletion_status")
            @ExcludeMissing
            deletionStatus: JsonField<DeletionStatus> = JsonMissing.of(),
            @JsonProperty("meeting_session_id")
            @ExcludeMissing
            meetingSessionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("provider") @ExcludeMissing provider: JsonValue = JsonMissing.of(),
            @JsonProperty("scope") @ExcludeMissing scope: JsonValue = JsonMissing.of(),
        ) : this(deletionStatus, meetingSessionId, provider, scope, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun deletionStatus(): DeletionStatus = deletionStatus.getRequired("deletion_status")

        /**
         * The account-scoped Meeting Session identifier.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun meetingSessionId(): String = meetingSessionId.getRequired("meeting_session_id")

        /**
         * Expected to always return the following:
         * ```java
         * JsonValue.from("recall")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonValue = provider

        /**
         * Expected to always return the following:
         * ```java
         * JsonValue.from("provider_recording_media")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("scope") @ExcludeMissing fun _scope(): JsonValue = scope

        /**
         * Returns the raw JSON value of [deletionStatus].
         *
         * Unlike [deletionStatus], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("deletion_status")
        @ExcludeMissing
        fun _deletionStatus(): JsonField<DeletionStatus> = deletionStatus

        /**
         * Returns the raw JSON value of [meetingSessionId].
         *
         * Unlike [meetingSessionId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("meeting_session_id")
        @ExcludeMissing
        fun _meetingSessionId(): JsonField<String> = meetingSessionId

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
             * Returns a mutable builder for constructing an instance of [Data].
             *
             * The following fields are required:
             * ```java
             * .deletionStatus()
             * .meetingSessionId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var deletionStatus: JsonField<DeletionStatus>? = null
            private var meetingSessionId: JsonField<String>? = null
            private var provider: JsonValue = JsonValue.from("recall")
            private var scope: JsonValue = JsonValue.from("provider_recording_media")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                deletionStatus = data.deletionStatus
                meetingSessionId = data.meetingSessionId
                provider = data.provider
                scope = data.scope
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun deletionStatus(deletionStatus: DeletionStatus) =
                deletionStatus(JsonField.of(deletionStatus))

            /**
             * Sets [Builder.deletionStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deletionStatus] with a well-typed [DeletionStatus]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun deletionStatus(deletionStatus: JsonField<DeletionStatus>) = apply {
                this.deletionStatus = deletionStatus
            }

            /** The account-scoped Meeting Session identifier. */
            fun meetingSessionId(meetingSessionId: String) =
                meetingSessionId(JsonField.of(meetingSessionId))

            /**
             * Sets [Builder.meetingSessionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.meetingSessionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun meetingSessionId(meetingSessionId: JsonField<String>) = apply {
                this.meetingSessionId = meetingSessionId
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```java
             * JsonValue.from("recall")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun provider(provider: JsonValue) = apply { this.provider = provider }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```java
             * JsonValue.from("provider_recording_media")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun scope(scope: JsonValue) = apply { this.scope = scope }

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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .deletionStatus()
             * .meetingSessionId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("deletionStatus", deletionStatus),
                    checkRequired("meetingSessionId", meetingSessionId),
                    provider,
                    scope,
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
        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            deletionStatus().validate()
            meetingSessionId()
            _provider().let {
                if (it != JsonValue.from("recall")) {
                    throw TelnyxInvalidDataException("'provider' is invalid, received $it")
                }
            }
            _scope().let {
                if (it != JsonValue.from("provider_recording_media")) {
                    throw TelnyxInvalidDataException("'scope' is invalid, received $it")
                }
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
            (deletionStatus.asKnown().getOrNull()?.validity() ?: 0) +
                (if (meetingSessionId.asKnown().isPresent) 1 else 0) +
                provider.let { if (it == JsonValue.from("recall")) 1 else 0 } +
                scope.let { if (it == JsonValue.from("provider_recording_media")) 1 else 0 }

        class DeletionStatus
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val REQUESTED = of("requested")

                @JvmField val ALREADY_IN_PROGRESS = of("already_in_progress")

                @JvmStatic fun of(value: String) = DeletionStatus(JsonField.of(value))
            }

            /** An enum containing [DeletionStatus]'s known values. */
            enum class Known {
                REQUESTED,
                ALREADY_IN_PROGRESS,
            }

            /**
             * An enum containing [DeletionStatus]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [DeletionStatus] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                REQUESTED,
                ALREADY_IN_PROGRESS,
                /**
                 * An enum member indicating that [DeletionStatus] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    REQUESTED -> Value.REQUESTED
                    ALREADY_IN_PROGRESS -> Value.ALREADY_IN_PROGRESS
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    REQUESTED -> Known.REQUESTED
                    ALREADY_IN_PROGRESS -> Known.ALREADY_IN_PROGRESS
                    else -> throw TelnyxInvalidDataException("Unknown DeletionStatus: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): DeletionStatus = apply {
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

                return other is DeletionStatus && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                deletionStatus == other.deletionStatus &&
                meetingSessionId == other.meetingSessionId &&
                provider == other.provider &&
                scope == other.scope &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(deletionStatus, meetingSessionId, provider, scope, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{deletionStatus=$deletionStatus, meetingSessionId=$meetingSessionId, provider=$provider, scope=$scope, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MeetingSessionDeleteRecordingMediaResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MeetingSessionDeleteRecordingMediaResponse{data=$data, additionalProperties=$additionalProperties}"
}
