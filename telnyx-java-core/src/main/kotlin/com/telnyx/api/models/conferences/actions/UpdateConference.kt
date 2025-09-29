// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.conferences.actions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.Enum
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.checkKnown
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class UpdateConference
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val callControlId: JsonField<String>,
    private val supervisorRole: JsonField<SupervisorRole>,
    private val commandId: JsonField<String>,
    private val whisperCallControlIds: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("call_control_id")
        @ExcludeMissing
        callControlId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("supervisor_role")
        @ExcludeMissing
        supervisorRole: JsonField<SupervisorRole> = JsonMissing.of(),
        @JsonProperty("command_id") @ExcludeMissing commandId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("whisper_call_control_ids")
        @ExcludeMissing
        whisperCallControlIds: JsonField<List<String>> = JsonMissing.of(),
    ) : this(callControlId, supervisorRole, commandId, whisperCallControlIds, mutableMapOf())

    /**
     * Unique identifier and token for controlling the call
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun callControlId(): String = callControlId.getRequired("call_control_id")

    /**
     * Sets the participant as a supervisor for the conference. A conference can have multiple
     * supervisors. "barge" means the supervisor enters the conference as a normal participant. This
     * is the same as "none". "monitor" means the supervisor is muted but can hear all participants.
     * "whisper" means that only the specified "whisper_call_control_ids" can hear the supervisor.
     * Defaults to "none".
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun supervisorRole(): SupervisorRole = supervisorRole.getRequired("supervisor_role")

    /**
     * Use this field to avoid execution of duplicate commands. Telnyx will ignore subsequent
     * commands with the same `command_id` as one that has already been executed.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun commandId(): Optional<String> = commandId.getOptional("command_id")

    /**
     * Array of unique call_control_ids the supervisor can whisper to. If none provided, the
     * supervisor will join the conference as a monitoring participant only.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun whisperCallControlIds(): Optional<List<String>> =
        whisperCallControlIds.getOptional("whisper_call_control_ids")

    /**
     * Returns the raw JSON value of [callControlId].
     *
     * Unlike [callControlId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("call_control_id")
    @ExcludeMissing
    fun _callControlId(): JsonField<String> = callControlId

    /**
     * Returns the raw JSON value of [supervisorRole].
     *
     * Unlike [supervisorRole], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("supervisor_role")
    @ExcludeMissing
    fun _supervisorRole(): JsonField<SupervisorRole> = supervisorRole

    /**
     * Returns the raw JSON value of [commandId].
     *
     * Unlike [commandId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("command_id") @ExcludeMissing fun _commandId(): JsonField<String> = commandId

    /**
     * Returns the raw JSON value of [whisperCallControlIds].
     *
     * Unlike [whisperCallControlIds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("whisper_call_control_ids")
    @ExcludeMissing
    fun _whisperCallControlIds(): JsonField<List<String>> = whisperCallControlIds

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
         * Returns a mutable builder for constructing an instance of [UpdateConference].
         *
         * The following fields are required:
         * ```java
         * .callControlId()
         * .supervisorRole()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UpdateConference]. */
    class Builder internal constructor() {

        private var callControlId: JsonField<String>? = null
        private var supervisorRole: JsonField<SupervisorRole>? = null
        private var commandId: JsonField<String> = JsonMissing.of()
        private var whisperCallControlIds: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(updateConference: UpdateConference) = apply {
            callControlId = updateConference.callControlId
            supervisorRole = updateConference.supervisorRole
            commandId = updateConference.commandId
            whisperCallControlIds =
                updateConference.whisperCallControlIds.map { it.toMutableList() }
            additionalProperties = updateConference.additionalProperties.toMutableMap()
        }

        /** Unique identifier and token for controlling the call */
        fun callControlId(callControlId: String) = callControlId(JsonField.of(callControlId))

        /**
         * Sets [Builder.callControlId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callControlId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun callControlId(callControlId: JsonField<String>) = apply {
            this.callControlId = callControlId
        }

        /**
         * Sets the participant as a supervisor for the conference. A conference can have multiple
         * supervisors. "barge" means the supervisor enters the conference as a normal participant.
         * This is the same as "none". "monitor" means the supervisor is muted but can hear all
         * participants. "whisper" means that only the specified "whisper_call_control_ids" can hear
         * the supervisor. Defaults to "none".
         */
        fun supervisorRole(supervisorRole: SupervisorRole) =
            supervisorRole(JsonField.of(supervisorRole))

        /**
         * Sets [Builder.supervisorRole] to an arbitrary JSON value.
         *
         * You should usually call [Builder.supervisorRole] with a well-typed [SupervisorRole] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun supervisorRole(supervisorRole: JsonField<SupervisorRole>) = apply {
            this.supervisorRole = supervisorRole
        }

        /**
         * Use this field to avoid execution of duplicate commands. Telnyx will ignore subsequent
         * commands with the same `command_id` as one that has already been executed.
         */
        fun commandId(commandId: String) = commandId(JsonField.of(commandId))

        /**
         * Sets [Builder.commandId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commandId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun commandId(commandId: JsonField<String>) = apply { this.commandId = commandId }

        /**
         * Array of unique call_control_ids the supervisor can whisper to. If none provided, the
         * supervisor will join the conference as a monitoring participant only.
         */
        fun whisperCallControlIds(whisperCallControlIds: List<String>) =
            whisperCallControlIds(JsonField.of(whisperCallControlIds))

        /**
         * Sets [Builder.whisperCallControlIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.whisperCallControlIds] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun whisperCallControlIds(whisperCallControlIds: JsonField<List<String>>) = apply {
            this.whisperCallControlIds = whisperCallControlIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [whisperCallControlIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addWhisperCallControlId(whisperCallControlId: String) = apply {
            whisperCallControlIds =
                (whisperCallControlIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("whisperCallControlIds", it).add(whisperCallControlId)
                }
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
         * Returns an immutable instance of [UpdateConference].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .callControlId()
         * .supervisorRole()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UpdateConference =
            UpdateConference(
                checkRequired("callControlId", callControlId),
                checkRequired("supervisorRole", supervisorRole),
                commandId,
                (whisperCallControlIds ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): UpdateConference = apply {
        if (validated) {
            return@apply
        }

        callControlId()
        supervisorRole().validate()
        commandId()
        whisperCallControlIds()
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
        (if (callControlId.asKnown().isPresent) 1 else 0) +
            (supervisorRole.asKnown().getOrNull()?.validity() ?: 0) +
            (if (commandId.asKnown().isPresent) 1 else 0) +
            (whisperCallControlIds.asKnown().getOrNull()?.size ?: 0)

    /**
     * Sets the participant as a supervisor for the conference. A conference can have multiple
     * supervisors. "barge" means the supervisor enters the conference as a normal participant. This
     * is the same as "none". "monitor" means the supervisor is muted but can hear all participants.
     * "whisper" means that only the specified "whisper_call_control_ids" can hear the supervisor.
     * Defaults to "none".
     */
    class SupervisorRole @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val BARGE = of("barge")

            @JvmField val MONITOR = of("monitor")

            @JvmField val NONE = of("none")

            @JvmField val WHISPER = of("whisper")

            @JvmStatic fun of(value: String) = SupervisorRole(JsonField.of(value))
        }

        /** An enum containing [SupervisorRole]'s known values. */
        enum class Known {
            BARGE,
            MONITOR,
            NONE,
            WHISPER,
        }

        /**
         * An enum containing [SupervisorRole]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SupervisorRole] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BARGE,
            MONITOR,
            NONE,
            WHISPER,
            /**
             * An enum member indicating that [SupervisorRole] was instantiated with an unknown
             * value.
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
                BARGE -> Value.BARGE
                MONITOR -> Value.MONITOR
                NONE -> Value.NONE
                WHISPER -> Value.WHISPER
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
                BARGE -> Known.BARGE
                MONITOR -> Known.MONITOR
                NONE -> Known.NONE
                WHISPER -> Known.WHISPER
                else -> throw TelnyxInvalidDataException("Unknown SupervisorRole: $value")
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

        fun validate(): SupervisorRole = apply {
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

            return other is SupervisorRole && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UpdateConference &&
            callControlId == other.callControlId &&
            supervisorRole == other.supervisorRole &&
            commandId == other.commandId &&
            whisperCallControlIds == other.whisperCallControlIds &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            callControlId,
            supervisorRole,
            commandId,
            whisperCallControlIds,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UpdateConference{callControlId=$callControlId, supervisorRole=$supervisorRole, commandId=$commandId, whisperCallControlIds=$whisperCallControlIds, additionalProperties=$additionalProperties}"
}
