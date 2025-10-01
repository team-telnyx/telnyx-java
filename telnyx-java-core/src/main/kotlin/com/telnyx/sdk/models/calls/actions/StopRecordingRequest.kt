// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

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

class StopRecordingRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val clientState: JsonField<String>,
    private val commandId: JsonField<String>,
    private val recordingId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("client_state")
        @ExcludeMissing
        clientState: JsonField<String> = JsonMissing.of(),
        @JsonProperty("command_id") @ExcludeMissing commandId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("recording_id")
        @ExcludeMissing
        recordingId: JsonField<String> = JsonMissing.of(),
    ) : this(clientState, commandId, recordingId, mutableMapOf())

    /**
     * Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded
     * string.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clientState(): Optional<String> = clientState.getOptional("client_state")

    /**
     * Use this field to avoid duplicate commands. Telnyx will ignore any command with the same
     * `command_id` for the same `call_control_id`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun commandId(): Optional<String> = commandId.getOptional("command_id")

    /**
     * Uniquely identifies the resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordingId(): Optional<String> = recordingId.getOptional("recording_id")

    /**
     * Returns the raw JSON value of [clientState].
     *
     * Unlike [clientState], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("client_state")
    @ExcludeMissing
    fun _clientState(): JsonField<String> = clientState

    /**
     * Returns the raw JSON value of [commandId].
     *
     * Unlike [commandId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("command_id") @ExcludeMissing fun _commandId(): JsonField<String> = commandId

    /**
     * Returns the raw JSON value of [recordingId].
     *
     * Unlike [recordingId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("recording_id")
    @ExcludeMissing
    fun _recordingId(): JsonField<String> = recordingId

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

        /** Returns a mutable builder for constructing an instance of [StopRecordingRequest]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [StopRecordingRequest]. */
    class Builder internal constructor() {

        private var clientState: JsonField<String> = JsonMissing.of()
        private var commandId: JsonField<String> = JsonMissing.of()
        private var recordingId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(stopRecordingRequest: StopRecordingRequest) = apply {
            clientState = stopRecordingRequest.clientState
            commandId = stopRecordingRequest.commandId
            recordingId = stopRecordingRequest.recordingId
            additionalProperties = stopRecordingRequest.additionalProperties.toMutableMap()
        }

        /**
         * Use this field to add state to every subsequent webhook. It must be a valid Base-64
         * encoded string.
         */
        fun clientState(clientState: String) = clientState(JsonField.of(clientState))

        /**
         * Sets [Builder.clientState] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientState] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun clientState(clientState: JsonField<String>) = apply { this.clientState = clientState }

        /**
         * Use this field to avoid duplicate commands. Telnyx will ignore any command with the same
         * `command_id` for the same `call_control_id`.
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

        /** Uniquely identifies the resource. */
        fun recordingId(recordingId: String) = recordingId(JsonField.of(recordingId))

        /**
         * Sets [Builder.recordingId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordingId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recordingId(recordingId: JsonField<String>) = apply { this.recordingId = recordingId }

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
         * Returns an immutable instance of [StopRecordingRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): StopRecordingRequest =
            StopRecordingRequest(
                clientState,
                commandId,
                recordingId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): StopRecordingRequest = apply {
        if (validated) {
            return@apply
        }

        clientState()
        commandId()
        recordingId()
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
        (if (clientState.asKnown().isPresent) 1 else 0) +
            (if (commandId.asKnown().isPresent) 1 else 0) +
            (if (recordingId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StopRecordingRequest &&
            clientState == other.clientState &&
            commandId == other.commandId &&
            recordingId == other.recordingId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(clientState, commandId, recordingId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "StopRecordingRequest{clientState=$clientState, commandId=$commandId, recordingId=$recordingId, additionalProperties=$additionalProperties}"
}
