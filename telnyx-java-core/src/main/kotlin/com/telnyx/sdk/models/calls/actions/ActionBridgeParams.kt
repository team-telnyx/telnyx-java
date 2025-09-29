// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Bridge two call control calls.
 *
 * **Expected Webhooks:**
 * - `call.bridged` for Leg A
 * - `call.bridged` for Leg B
 */
class ActionBridgeParams
private constructor(
    private val pathCallControlId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun pathCallControlId(): Optional<String> = Optional.ofNullable(pathCallControlId)

    /**
     * The Call Control ID of the call you want to bridge with, can't be used together with queue
     * parameter or video_room_id parameter.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun bodyCallControlId(): String = body.bodyCallControlId()

    /**
     * Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded
     * string.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clientState(): Optional<String> = body.clientState()

    /**
     * Use this field to avoid duplicate commands. Telnyx will ignore any command with the same
     * `command_id` for the same `call_control_id`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun commandId(): Optional<String> = body.commandId()

    /**
     * When enabled, DTMF tones are not passed to the call participant. The webhooks containing the
     * DTMF information will be sent.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun muteDtmf(): Optional<MuteDtmf> = body.muteDtmf()

    /**
     * Specifies behavior after the bridge ends (i.e. the opposite leg either hangs up or is
     * transferred). If supplied with the value `self`, the current leg will be parked after
     * unbridge. If not set, the default behavior is to hang up the leg.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parkAfterUnbridge(): Optional<String> = body.parkAfterUnbridge()

    /**
     * Specifies whether to play a ringtone if the call you want to bridge with has not yet been
     * answered.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun playRingtone(): Optional<Boolean> = body.playRingtone()

    /**
     * The name of the queue you want to bridge with, can't be used together with call_control_id
     * parameter or video_room_id parameter. Bridging with a queue means bridging with the first
     * call in the queue. The call will always be removed from the queue regardless of whether
     * bridging succeeds. Returns an error when the queue is empty.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun queue(): Optional<String> = body.queue()

    /**
     * Start recording automatically after an event. Disabled by default.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun record(): Optional<Record> = body.record()

    /**
     * Defines which channel should be recorded ('single' or 'dual') when `record` is specified.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordChannels(): Optional<RecordChannels> = body.recordChannels()

    /**
     * The custom recording file name to be used instead of the default `call_leg_id`. Telnyx will
     * still add a Unix timestamp suffix.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordCustomFileName(): Optional<String> = body.recordCustomFileName()

    /**
     * Defines the format of the recording ('wav' or 'mp3') when `record` is specified.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordFormat(): Optional<RecordFormat> = body.recordFormat()

    /**
     * Defines the maximum length for the recording in seconds when `record` is specified. The
     * minimum value is 0. The maximum value is 43200. The default value is 0 (infinite).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordMaxLength(): Optional<Int> = body.recordMaxLength()

    /**
     * The number of seconds that Telnyx will wait for the recording to be stopped if silence is
     * detected when `record` is specified. The timer only starts when the speech is detected.
     * Please note that call transcription is used to detect silence and the related charge will be
     * applied. The minimum value is 0. The default value is 0 (infinite).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordTimeoutSecs(): Optional<Int> = body.recordTimeoutSecs()

    /**
     * The audio track to be recorded. Can be either `both`, `inbound` or `outbound`. If only single
     * track is specified (`inbound`, `outbound`), `channels` configuration is ignored and it will
     * be recorded as mono (single channel).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordTrack(): Optional<RecordTrack> = body.recordTrack()

    /**
     * When set to `trim-silence`, silence will be removed from the beginning and end of the
     * recording.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordTrim(): Optional<RecordTrim> = body.recordTrim()

    /**
     * Specifies which country ringtone to play when `play_ringtone` is set to `true`. If not set,
     * the US ringtone will be played.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ringtone(): Optional<Ringtone> = body.ringtone()

    /**
     * The additional parameter that will be passed to the video conference. It is a text field and
     * the user can decide how to use it. For example, you can set the participant name or pass JSON
     * text. It can be used only with video_room_id parameter.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun videoRoomContext(): Optional<String> = body.videoRoomContext()

    /**
     * The ID of the video room you want to bridge with, can't be used together with call_control_id
     * parameter or queue parameter.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun videoRoomId(): Optional<String> = body.videoRoomId()

    /**
     * Returns the raw JSON value of [bodyCallControlId].
     *
     * Unlike [bodyCallControlId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _bodyCallControlId(): JsonField<String> = body._bodyCallControlId()

    /**
     * Returns the raw JSON value of [clientState].
     *
     * Unlike [clientState], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _clientState(): JsonField<String> = body._clientState()

    /**
     * Returns the raw JSON value of [commandId].
     *
     * Unlike [commandId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _commandId(): JsonField<String> = body._commandId()

    /**
     * Returns the raw JSON value of [muteDtmf].
     *
     * Unlike [muteDtmf], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _muteDtmf(): JsonField<MuteDtmf> = body._muteDtmf()

    /**
     * Returns the raw JSON value of [parkAfterUnbridge].
     *
     * Unlike [parkAfterUnbridge], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _parkAfterUnbridge(): JsonField<String> = body._parkAfterUnbridge()

    /**
     * Returns the raw JSON value of [playRingtone].
     *
     * Unlike [playRingtone], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _playRingtone(): JsonField<Boolean> = body._playRingtone()

    /**
     * Returns the raw JSON value of [queue].
     *
     * Unlike [queue], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _queue(): JsonField<String> = body._queue()

    /**
     * Returns the raw JSON value of [record].
     *
     * Unlike [record], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _record(): JsonField<Record> = body._record()

    /**
     * Returns the raw JSON value of [recordChannels].
     *
     * Unlike [recordChannels], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _recordChannels(): JsonField<RecordChannels> = body._recordChannels()

    /**
     * Returns the raw JSON value of [recordCustomFileName].
     *
     * Unlike [recordCustomFileName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _recordCustomFileName(): JsonField<String> = body._recordCustomFileName()

    /**
     * Returns the raw JSON value of [recordFormat].
     *
     * Unlike [recordFormat], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _recordFormat(): JsonField<RecordFormat> = body._recordFormat()

    /**
     * Returns the raw JSON value of [recordMaxLength].
     *
     * Unlike [recordMaxLength], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _recordMaxLength(): JsonField<Int> = body._recordMaxLength()

    /**
     * Returns the raw JSON value of [recordTimeoutSecs].
     *
     * Unlike [recordTimeoutSecs], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _recordTimeoutSecs(): JsonField<Int> = body._recordTimeoutSecs()

    /**
     * Returns the raw JSON value of [recordTrack].
     *
     * Unlike [recordTrack], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _recordTrack(): JsonField<RecordTrack> = body._recordTrack()

    /**
     * Returns the raw JSON value of [recordTrim].
     *
     * Unlike [recordTrim], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _recordTrim(): JsonField<RecordTrim> = body._recordTrim()

    /**
     * Returns the raw JSON value of [ringtone].
     *
     * Unlike [ringtone], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _ringtone(): JsonField<Ringtone> = body._ringtone()

    /**
     * Returns the raw JSON value of [videoRoomContext].
     *
     * Unlike [videoRoomContext], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _videoRoomContext(): JsonField<String> = body._videoRoomContext()

    /**
     * Returns the raw JSON value of [videoRoomId].
     *
     * Unlike [videoRoomId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _videoRoomId(): JsonField<String> = body._videoRoomId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ActionBridgeParams].
         *
         * The following fields are required:
         * ```java
         * .bodyCallControlId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ActionBridgeParams]. */
    class Builder internal constructor() {

        private var pathCallControlId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(actionBridgeParams: ActionBridgeParams) = apply {
            pathCallControlId = actionBridgeParams.pathCallControlId
            body = actionBridgeParams.body.toBuilder()
            additionalHeaders = actionBridgeParams.additionalHeaders.toBuilder()
            additionalQueryParams = actionBridgeParams.additionalQueryParams.toBuilder()
        }

        fun pathCallControlId(pathCallControlId: String?) = apply {
            this.pathCallControlId = pathCallControlId
        }

        /** Alias for calling [Builder.pathCallControlId] with `pathCallControlId.orElse(null)`. */
        fun pathCallControlId(pathCallControlId: Optional<String>) =
            pathCallControlId(pathCallControlId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [bodyCallControlId]
         * - [clientState]
         * - [commandId]
         * - [muteDtmf]
         * - [parkAfterUnbridge]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * The Call Control ID of the call you want to bridge with, can't be used together with
         * queue parameter or video_room_id parameter.
         */
        fun bodyCallControlId(bodyCallControlId: String) = apply {
            body.bodyCallControlId(bodyCallControlId)
        }

        /**
         * Sets [Builder.bodyCallControlId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bodyCallControlId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun bodyCallControlId(bodyCallControlId: JsonField<String>) = apply {
            body.bodyCallControlId(bodyCallControlId)
        }

        /**
         * Use this field to add state to every subsequent webhook. It must be a valid Base-64
         * encoded string.
         */
        fun clientState(clientState: String) = apply { body.clientState(clientState) }

        /**
         * Sets [Builder.clientState] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientState] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun clientState(clientState: JsonField<String>) = apply { body.clientState(clientState) }

        /**
         * Use this field to avoid duplicate commands. Telnyx will ignore any command with the same
         * `command_id` for the same `call_control_id`.
         */
        fun commandId(commandId: String) = apply { body.commandId(commandId) }

        /**
         * Sets [Builder.commandId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commandId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun commandId(commandId: JsonField<String>) = apply { body.commandId(commandId) }

        /**
         * When enabled, DTMF tones are not passed to the call participant. The webhooks containing
         * the DTMF information will be sent.
         */
        fun muteDtmf(muteDtmf: MuteDtmf) = apply { body.muteDtmf(muteDtmf) }

        /**
         * Sets [Builder.muteDtmf] to an arbitrary JSON value.
         *
         * You should usually call [Builder.muteDtmf] with a well-typed [MuteDtmf] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun muteDtmf(muteDtmf: JsonField<MuteDtmf>) = apply { body.muteDtmf(muteDtmf) }

        /**
         * Specifies behavior after the bridge ends (i.e. the opposite leg either hangs up or is
         * transferred). If supplied with the value `self`, the current leg will be parked after
         * unbridge. If not set, the default behavior is to hang up the leg.
         */
        fun parkAfterUnbridge(parkAfterUnbridge: String) = apply {
            body.parkAfterUnbridge(parkAfterUnbridge)
        }

        /**
         * Sets [Builder.parkAfterUnbridge] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parkAfterUnbridge] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun parkAfterUnbridge(parkAfterUnbridge: JsonField<String>) = apply {
            body.parkAfterUnbridge(parkAfterUnbridge)
        }

        /**
         * Specifies whether to play a ringtone if the call you want to bridge with has not yet been
         * answered.
         */
        fun playRingtone(playRingtone: Boolean) = apply { body.playRingtone(playRingtone) }

        /**
         * Sets [Builder.playRingtone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.playRingtone] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun playRingtone(playRingtone: JsonField<Boolean>) = apply {
            body.playRingtone(playRingtone)
        }

        /**
         * The name of the queue you want to bridge with, can't be used together with
         * call_control_id parameter or video_room_id parameter. Bridging with a queue means
         * bridging with the first call in the queue. The call will always be removed from the queue
         * regardless of whether bridging succeeds. Returns an error when the queue is empty.
         */
        fun queue(queue: String) = apply { body.queue(queue) }

        /**
         * Sets [Builder.queue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.queue] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun queue(queue: JsonField<String>) = apply { body.queue(queue) }

        /** Start recording automatically after an event. Disabled by default. */
        fun record(record: Record) = apply { body.record(record) }

        /**
         * Sets [Builder.record] to an arbitrary JSON value.
         *
         * You should usually call [Builder.record] with a well-typed [Record] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun record(record: JsonField<Record>) = apply { body.record(record) }

        /**
         * Defines which channel should be recorded ('single' or 'dual') when `record` is specified.
         */
        fun recordChannels(recordChannels: RecordChannels) = apply {
            body.recordChannels(recordChannels)
        }

        /**
         * Sets [Builder.recordChannels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordChannels] with a well-typed [RecordChannels] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recordChannels(recordChannels: JsonField<RecordChannels>) = apply {
            body.recordChannels(recordChannels)
        }

        /**
         * The custom recording file name to be used instead of the default `call_leg_id`. Telnyx
         * will still add a Unix timestamp suffix.
         */
        fun recordCustomFileName(recordCustomFileName: String) = apply {
            body.recordCustomFileName(recordCustomFileName)
        }

        /**
         * Sets [Builder.recordCustomFileName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordCustomFileName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recordCustomFileName(recordCustomFileName: JsonField<String>) = apply {
            body.recordCustomFileName(recordCustomFileName)
        }

        /** Defines the format of the recording ('wav' or 'mp3') when `record` is specified. */
        fun recordFormat(recordFormat: RecordFormat) = apply { body.recordFormat(recordFormat) }

        /**
         * Sets [Builder.recordFormat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordFormat] with a well-typed [RecordFormat] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recordFormat(recordFormat: JsonField<RecordFormat>) = apply {
            body.recordFormat(recordFormat)
        }

        /**
         * Defines the maximum length for the recording in seconds when `record` is specified. The
         * minimum value is 0. The maximum value is 43200. The default value is 0 (infinite).
         */
        fun recordMaxLength(recordMaxLength: Int) = apply { body.recordMaxLength(recordMaxLength) }

        /**
         * Sets [Builder.recordMaxLength] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordMaxLength] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recordMaxLength(recordMaxLength: JsonField<Int>) = apply {
            body.recordMaxLength(recordMaxLength)
        }

        /**
         * The number of seconds that Telnyx will wait for the recording to be stopped if silence is
         * detected when `record` is specified. The timer only starts when the speech is detected.
         * Please note that call transcription is used to detect silence and the related charge will
         * be applied. The minimum value is 0. The default value is 0 (infinite).
         */
        fun recordTimeoutSecs(recordTimeoutSecs: Int) = apply {
            body.recordTimeoutSecs(recordTimeoutSecs)
        }

        /**
         * Sets [Builder.recordTimeoutSecs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordTimeoutSecs] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recordTimeoutSecs(recordTimeoutSecs: JsonField<Int>) = apply {
            body.recordTimeoutSecs(recordTimeoutSecs)
        }

        /**
         * The audio track to be recorded. Can be either `both`, `inbound` or `outbound`. If only
         * single track is specified (`inbound`, `outbound`), `channels` configuration is ignored
         * and it will be recorded as mono (single channel).
         */
        fun recordTrack(recordTrack: RecordTrack) = apply { body.recordTrack(recordTrack) }

        /**
         * Sets [Builder.recordTrack] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordTrack] with a well-typed [RecordTrack] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recordTrack(recordTrack: JsonField<RecordTrack>) = apply {
            body.recordTrack(recordTrack)
        }

        /**
         * When set to `trim-silence`, silence will be removed from the beginning and end of the
         * recording.
         */
        fun recordTrim(recordTrim: RecordTrim) = apply { body.recordTrim(recordTrim) }

        /**
         * Sets [Builder.recordTrim] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordTrim] with a well-typed [RecordTrim] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recordTrim(recordTrim: JsonField<RecordTrim>) = apply { body.recordTrim(recordTrim) }

        /**
         * Specifies which country ringtone to play when `play_ringtone` is set to `true`. If not
         * set, the US ringtone will be played.
         */
        fun ringtone(ringtone: Ringtone) = apply { body.ringtone(ringtone) }

        /**
         * Sets [Builder.ringtone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ringtone] with a well-typed [Ringtone] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ringtone(ringtone: JsonField<Ringtone>) = apply { body.ringtone(ringtone) }

        /**
         * The additional parameter that will be passed to the video conference. It is a text field
         * and the user can decide how to use it. For example, you can set the participant name or
         * pass JSON text. It can be used only with video_room_id parameter.
         */
        fun videoRoomContext(videoRoomContext: String) = apply {
            body.videoRoomContext(videoRoomContext)
        }

        /**
         * Sets [Builder.videoRoomContext] to an arbitrary JSON value.
         *
         * You should usually call [Builder.videoRoomContext] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun videoRoomContext(videoRoomContext: JsonField<String>) = apply {
            body.videoRoomContext(videoRoomContext)
        }

        /**
         * The ID of the video room you want to bridge with, can't be used together with
         * call_control_id parameter or queue parameter.
         */
        fun videoRoomId(videoRoomId: String) = apply { body.videoRoomId(videoRoomId) }

        /**
         * Sets [Builder.videoRoomId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.videoRoomId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun videoRoomId(videoRoomId: JsonField<String>) = apply { body.videoRoomId(videoRoomId) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

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
         * Returns an immutable instance of [ActionBridgeParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .bodyCallControlId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ActionBridgeParams =
            ActionBridgeParams(
                pathCallControlId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> pathCallControlId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val bodyCallControlId: JsonField<String>,
        private val clientState: JsonField<String>,
        private val commandId: JsonField<String>,
        private val muteDtmf: JsonField<MuteDtmf>,
        private val parkAfterUnbridge: JsonField<String>,
        private val playRingtone: JsonField<Boolean>,
        private val queue: JsonField<String>,
        private val record: JsonField<Record>,
        private val recordChannels: JsonField<RecordChannels>,
        private val recordCustomFileName: JsonField<String>,
        private val recordFormat: JsonField<RecordFormat>,
        private val recordMaxLength: JsonField<Int>,
        private val recordTimeoutSecs: JsonField<Int>,
        private val recordTrack: JsonField<RecordTrack>,
        private val recordTrim: JsonField<RecordTrim>,
        private val ringtone: JsonField<Ringtone>,
        private val videoRoomContext: JsonField<String>,
        private val videoRoomId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("call_control_id")
            @ExcludeMissing
            bodyCallControlId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("client_state")
            @ExcludeMissing
            clientState: JsonField<String> = JsonMissing.of(),
            @JsonProperty("command_id")
            @ExcludeMissing
            commandId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("mute_dtmf")
            @ExcludeMissing
            muteDtmf: JsonField<MuteDtmf> = JsonMissing.of(),
            @JsonProperty("park_after_unbridge")
            @ExcludeMissing
            parkAfterUnbridge: JsonField<String> = JsonMissing.of(),
            @JsonProperty("play_ringtone")
            @ExcludeMissing
            playRingtone: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("queue") @ExcludeMissing queue: JsonField<String> = JsonMissing.of(),
            @JsonProperty("record") @ExcludeMissing record: JsonField<Record> = JsonMissing.of(),
            @JsonProperty("record_channels")
            @ExcludeMissing
            recordChannels: JsonField<RecordChannels> = JsonMissing.of(),
            @JsonProperty("record_custom_file_name")
            @ExcludeMissing
            recordCustomFileName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("record_format")
            @ExcludeMissing
            recordFormat: JsonField<RecordFormat> = JsonMissing.of(),
            @JsonProperty("record_max_length")
            @ExcludeMissing
            recordMaxLength: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("record_timeout_secs")
            @ExcludeMissing
            recordTimeoutSecs: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("record_track")
            @ExcludeMissing
            recordTrack: JsonField<RecordTrack> = JsonMissing.of(),
            @JsonProperty("record_trim")
            @ExcludeMissing
            recordTrim: JsonField<RecordTrim> = JsonMissing.of(),
            @JsonProperty("ringtone")
            @ExcludeMissing
            ringtone: JsonField<Ringtone> = JsonMissing.of(),
            @JsonProperty("video_room_context")
            @ExcludeMissing
            videoRoomContext: JsonField<String> = JsonMissing.of(),
            @JsonProperty("video_room_id")
            @ExcludeMissing
            videoRoomId: JsonField<String> = JsonMissing.of(),
        ) : this(
            bodyCallControlId,
            clientState,
            commandId,
            muteDtmf,
            parkAfterUnbridge,
            playRingtone,
            queue,
            record,
            recordChannels,
            recordCustomFileName,
            recordFormat,
            recordMaxLength,
            recordTimeoutSecs,
            recordTrack,
            recordTrim,
            ringtone,
            videoRoomContext,
            videoRoomId,
            mutableMapOf(),
        )

        /**
         * The Call Control ID of the call you want to bridge with, can't be used together with
         * queue parameter or video_room_id parameter.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun bodyCallControlId(): String = bodyCallControlId.getRequired("call_control_id")

        /**
         * Use this field to add state to every subsequent webhook. It must be a valid Base-64
         * encoded string.
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
         * When enabled, DTMF tones are not passed to the call participant. The webhooks containing
         * the DTMF information will be sent.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun muteDtmf(): Optional<MuteDtmf> = muteDtmf.getOptional("mute_dtmf")

        /**
         * Specifies behavior after the bridge ends (i.e. the opposite leg either hangs up or is
         * transferred). If supplied with the value `self`, the current leg will be parked after
         * unbridge. If not set, the default behavior is to hang up the leg.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun parkAfterUnbridge(): Optional<String> =
            parkAfterUnbridge.getOptional("park_after_unbridge")

        /**
         * Specifies whether to play a ringtone if the call you want to bridge with has not yet been
         * answered.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun playRingtone(): Optional<Boolean> = playRingtone.getOptional("play_ringtone")

        /**
         * The name of the queue you want to bridge with, can't be used together with
         * call_control_id parameter or video_room_id parameter. Bridging with a queue means
         * bridging with the first call in the queue. The call will always be removed from the queue
         * regardless of whether bridging succeeds. Returns an error when the queue is empty.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun queue(): Optional<String> = queue.getOptional("queue")

        /**
         * Start recording automatically after an event. Disabled by default.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun record(): Optional<Record> = record.getOptional("record")

        /**
         * Defines which channel should be recorded ('single' or 'dual') when `record` is specified.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordChannels(): Optional<RecordChannels> =
            recordChannels.getOptional("record_channels")

        /**
         * The custom recording file name to be used instead of the default `call_leg_id`. Telnyx
         * will still add a Unix timestamp suffix.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordCustomFileName(): Optional<String> =
            recordCustomFileName.getOptional("record_custom_file_name")

        /**
         * Defines the format of the recording ('wav' or 'mp3') when `record` is specified.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordFormat(): Optional<RecordFormat> = recordFormat.getOptional("record_format")

        /**
         * Defines the maximum length for the recording in seconds when `record` is specified. The
         * minimum value is 0. The maximum value is 43200. The default value is 0 (infinite).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordMaxLength(): Optional<Int> = recordMaxLength.getOptional("record_max_length")

        /**
         * The number of seconds that Telnyx will wait for the recording to be stopped if silence is
         * detected when `record` is specified. The timer only starts when the speech is detected.
         * Please note that call transcription is used to detect silence and the related charge will
         * be applied. The minimum value is 0. The default value is 0 (infinite).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordTimeoutSecs(): Optional<Int> =
            recordTimeoutSecs.getOptional("record_timeout_secs")

        /**
         * The audio track to be recorded. Can be either `both`, `inbound` or `outbound`. If only
         * single track is specified (`inbound`, `outbound`), `channels` configuration is ignored
         * and it will be recorded as mono (single channel).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordTrack(): Optional<RecordTrack> = recordTrack.getOptional("record_track")

        /**
         * When set to `trim-silence`, silence will be removed from the beginning and end of the
         * recording.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordTrim(): Optional<RecordTrim> = recordTrim.getOptional("record_trim")

        /**
         * Specifies which country ringtone to play when `play_ringtone` is set to `true`. If not
         * set, the US ringtone will be played.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ringtone(): Optional<Ringtone> = ringtone.getOptional("ringtone")

        /**
         * The additional parameter that will be passed to the video conference. It is a text field
         * and the user can decide how to use it. For example, you can set the participant name or
         * pass JSON text. It can be used only with video_room_id parameter.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun videoRoomContext(): Optional<String> =
            videoRoomContext.getOptional("video_room_context")

        /**
         * The ID of the video room you want to bridge with, can't be used together with
         * call_control_id parameter or queue parameter.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun videoRoomId(): Optional<String> = videoRoomId.getOptional("video_room_id")

        /**
         * Returns the raw JSON value of [bodyCallControlId].
         *
         * Unlike [bodyCallControlId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("call_control_id")
        @ExcludeMissing
        fun _bodyCallControlId(): JsonField<String> = bodyCallControlId

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
         * Returns the raw JSON value of [muteDtmf].
         *
         * Unlike [muteDtmf], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mute_dtmf") @ExcludeMissing fun _muteDtmf(): JsonField<MuteDtmf> = muteDtmf

        /**
         * Returns the raw JSON value of [parkAfterUnbridge].
         *
         * Unlike [parkAfterUnbridge], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("park_after_unbridge")
        @ExcludeMissing
        fun _parkAfterUnbridge(): JsonField<String> = parkAfterUnbridge

        /**
         * Returns the raw JSON value of [playRingtone].
         *
         * Unlike [playRingtone], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("play_ringtone")
        @ExcludeMissing
        fun _playRingtone(): JsonField<Boolean> = playRingtone

        /**
         * Returns the raw JSON value of [queue].
         *
         * Unlike [queue], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("queue") @ExcludeMissing fun _queue(): JsonField<String> = queue

        /**
         * Returns the raw JSON value of [record].
         *
         * Unlike [record], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record") @ExcludeMissing fun _record(): JsonField<Record> = record

        /**
         * Returns the raw JSON value of [recordChannels].
         *
         * Unlike [recordChannels], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("record_channels")
        @ExcludeMissing
        fun _recordChannels(): JsonField<RecordChannels> = recordChannels

        /**
         * Returns the raw JSON value of [recordCustomFileName].
         *
         * Unlike [recordCustomFileName], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("record_custom_file_name")
        @ExcludeMissing
        fun _recordCustomFileName(): JsonField<String> = recordCustomFileName

        /**
         * Returns the raw JSON value of [recordFormat].
         *
         * Unlike [recordFormat], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("record_format")
        @ExcludeMissing
        fun _recordFormat(): JsonField<RecordFormat> = recordFormat

        /**
         * Returns the raw JSON value of [recordMaxLength].
         *
         * Unlike [recordMaxLength], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("record_max_length")
        @ExcludeMissing
        fun _recordMaxLength(): JsonField<Int> = recordMaxLength

        /**
         * Returns the raw JSON value of [recordTimeoutSecs].
         *
         * Unlike [recordTimeoutSecs], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("record_timeout_secs")
        @ExcludeMissing
        fun _recordTimeoutSecs(): JsonField<Int> = recordTimeoutSecs

        /**
         * Returns the raw JSON value of [recordTrack].
         *
         * Unlike [recordTrack], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_track")
        @ExcludeMissing
        fun _recordTrack(): JsonField<RecordTrack> = recordTrack

        /**
         * Returns the raw JSON value of [recordTrim].
         *
         * Unlike [recordTrim], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_trim")
        @ExcludeMissing
        fun _recordTrim(): JsonField<RecordTrim> = recordTrim

        /**
         * Returns the raw JSON value of [ringtone].
         *
         * Unlike [ringtone], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ringtone") @ExcludeMissing fun _ringtone(): JsonField<Ringtone> = ringtone

        /**
         * Returns the raw JSON value of [videoRoomContext].
         *
         * Unlike [videoRoomContext], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("video_room_context")
        @ExcludeMissing
        fun _videoRoomContext(): JsonField<String> = videoRoomContext

        /**
         * Returns the raw JSON value of [videoRoomId].
         *
         * Unlike [videoRoomId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("video_room_id")
        @ExcludeMissing
        fun _videoRoomId(): JsonField<String> = videoRoomId

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .bodyCallControlId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var bodyCallControlId: JsonField<String>? = null
            private var clientState: JsonField<String> = JsonMissing.of()
            private var commandId: JsonField<String> = JsonMissing.of()
            private var muteDtmf: JsonField<MuteDtmf> = JsonMissing.of()
            private var parkAfterUnbridge: JsonField<String> = JsonMissing.of()
            private var playRingtone: JsonField<Boolean> = JsonMissing.of()
            private var queue: JsonField<String> = JsonMissing.of()
            private var record: JsonField<Record> = JsonMissing.of()
            private var recordChannels: JsonField<RecordChannels> = JsonMissing.of()
            private var recordCustomFileName: JsonField<String> = JsonMissing.of()
            private var recordFormat: JsonField<RecordFormat> = JsonMissing.of()
            private var recordMaxLength: JsonField<Int> = JsonMissing.of()
            private var recordTimeoutSecs: JsonField<Int> = JsonMissing.of()
            private var recordTrack: JsonField<RecordTrack> = JsonMissing.of()
            private var recordTrim: JsonField<RecordTrim> = JsonMissing.of()
            private var ringtone: JsonField<Ringtone> = JsonMissing.of()
            private var videoRoomContext: JsonField<String> = JsonMissing.of()
            private var videoRoomId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                bodyCallControlId = body.bodyCallControlId
                clientState = body.clientState
                commandId = body.commandId
                muteDtmf = body.muteDtmf
                parkAfterUnbridge = body.parkAfterUnbridge
                playRingtone = body.playRingtone
                queue = body.queue
                record = body.record
                recordChannels = body.recordChannels
                recordCustomFileName = body.recordCustomFileName
                recordFormat = body.recordFormat
                recordMaxLength = body.recordMaxLength
                recordTimeoutSecs = body.recordTimeoutSecs
                recordTrack = body.recordTrack
                recordTrim = body.recordTrim
                ringtone = body.ringtone
                videoRoomContext = body.videoRoomContext
                videoRoomId = body.videoRoomId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The Call Control ID of the call you want to bridge with, can't be used together with
             * queue parameter or video_room_id parameter.
             */
            fun bodyCallControlId(bodyCallControlId: String) =
                bodyCallControlId(JsonField.of(bodyCallControlId))

            /**
             * Sets [Builder.bodyCallControlId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bodyCallControlId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bodyCallControlId(bodyCallControlId: JsonField<String>) = apply {
                this.bodyCallControlId = bodyCallControlId
            }

            /**
             * Use this field to add state to every subsequent webhook. It must be a valid Base-64
             * encoded string.
             */
            fun clientState(clientState: String) = clientState(JsonField.of(clientState))

            /**
             * Sets [Builder.clientState] to an arbitrary JSON value.
             *
             * You should usually call [Builder.clientState] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun clientState(clientState: JsonField<String>) = apply {
                this.clientState = clientState
            }

            /**
             * Use this field to avoid duplicate commands. Telnyx will ignore any command with the
             * same `command_id` for the same `call_control_id`.
             */
            fun commandId(commandId: String) = commandId(JsonField.of(commandId))

            /**
             * Sets [Builder.commandId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commandId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun commandId(commandId: JsonField<String>) = apply { this.commandId = commandId }

            /**
             * When enabled, DTMF tones are not passed to the call participant. The webhooks
             * containing the DTMF information will be sent.
             */
            fun muteDtmf(muteDtmf: MuteDtmf) = muteDtmf(JsonField.of(muteDtmf))

            /**
             * Sets [Builder.muteDtmf] to an arbitrary JSON value.
             *
             * You should usually call [Builder.muteDtmf] with a well-typed [MuteDtmf] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun muteDtmf(muteDtmf: JsonField<MuteDtmf>) = apply { this.muteDtmf = muteDtmf }

            /**
             * Specifies behavior after the bridge ends (i.e. the opposite leg either hangs up or is
             * transferred). If supplied with the value `self`, the current leg will be parked after
             * unbridge. If not set, the default behavior is to hang up the leg.
             */
            fun parkAfterUnbridge(parkAfterUnbridge: String) =
                parkAfterUnbridge(JsonField.of(parkAfterUnbridge))

            /**
             * Sets [Builder.parkAfterUnbridge] to an arbitrary JSON value.
             *
             * You should usually call [Builder.parkAfterUnbridge] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun parkAfterUnbridge(parkAfterUnbridge: JsonField<String>) = apply {
                this.parkAfterUnbridge = parkAfterUnbridge
            }

            /**
             * Specifies whether to play a ringtone if the call you want to bridge with has not yet
             * been answered.
             */
            fun playRingtone(playRingtone: Boolean) = playRingtone(JsonField.of(playRingtone))

            /**
             * Sets [Builder.playRingtone] to an arbitrary JSON value.
             *
             * You should usually call [Builder.playRingtone] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun playRingtone(playRingtone: JsonField<Boolean>) = apply {
                this.playRingtone = playRingtone
            }

            /**
             * The name of the queue you want to bridge with, can't be used together with
             * call_control_id parameter or video_room_id parameter. Bridging with a queue means
             * bridging with the first call in the queue. The call will always be removed from the
             * queue regardless of whether bridging succeeds. Returns an error when the queue is
             * empty.
             */
            fun queue(queue: String) = queue(JsonField.of(queue))

            /**
             * Sets [Builder.queue] to an arbitrary JSON value.
             *
             * You should usually call [Builder.queue] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun queue(queue: JsonField<String>) = apply { this.queue = queue }

            /** Start recording automatically after an event. Disabled by default. */
            fun record(record: Record) = record(JsonField.of(record))

            /**
             * Sets [Builder.record] to an arbitrary JSON value.
             *
             * You should usually call [Builder.record] with a well-typed [Record] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun record(record: JsonField<Record>) = apply { this.record = record }

            /**
             * Defines which channel should be recorded ('single' or 'dual') when `record` is
             * specified.
             */
            fun recordChannels(recordChannels: RecordChannels) =
                recordChannels(JsonField.of(recordChannels))

            /**
             * Sets [Builder.recordChannels] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordChannels] with a well-typed [RecordChannels]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun recordChannels(recordChannels: JsonField<RecordChannels>) = apply {
                this.recordChannels = recordChannels
            }

            /**
             * The custom recording file name to be used instead of the default `call_leg_id`.
             * Telnyx will still add a Unix timestamp suffix.
             */
            fun recordCustomFileName(recordCustomFileName: String) =
                recordCustomFileName(JsonField.of(recordCustomFileName))

            /**
             * Sets [Builder.recordCustomFileName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordCustomFileName] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun recordCustomFileName(recordCustomFileName: JsonField<String>) = apply {
                this.recordCustomFileName = recordCustomFileName
            }

            /** Defines the format of the recording ('wav' or 'mp3') when `record` is specified. */
            fun recordFormat(recordFormat: RecordFormat) = recordFormat(JsonField.of(recordFormat))

            /**
             * Sets [Builder.recordFormat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordFormat] with a well-typed [RecordFormat] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordFormat(recordFormat: JsonField<RecordFormat>) = apply {
                this.recordFormat = recordFormat
            }

            /**
             * Defines the maximum length for the recording in seconds when `record` is specified.
             * The minimum value is 0. The maximum value is 43200. The default value is 0
             * (infinite).
             */
            fun recordMaxLength(recordMaxLength: Int) =
                recordMaxLength(JsonField.of(recordMaxLength))

            /**
             * Sets [Builder.recordMaxLength] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordMaxLength] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordMaxLength(recordMaxLength: JsonField<Int>) = apply {
                this.recordMaxLength = recordMaxLength
            }

            /**
             * The number of seconds that Telnyx will wait for the recording to be stopped if
             * silence is detected when `record` is specified. The timer only starts when the speech
             * is detected. Please note that call transcription is used to detect silence and the
             * related charge will be applied. The minimum value is 0. The default value is 0
             * (infinite).
             */
            fun recordTimeoutSecs(recordTimeoutSecs: Int) =
                recordTimeoutSecs(JsonField.of(recordTimeoutSecs))

            /**
             * Sets [Builder.recordTimeoutSecs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordTimeoutSecs] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordTimeoutSecs(recordTimeoutSecs: JsonField<Int>) = apply {
                this.recordTimeoutSecs = recordTimeoutSecs
            }

            /**
             * The audio track to be recorded. Can be either `both`, `inbound` or `outbound`. If
             * only single track is specified (`inbound`, `outbound`), `channels` configuration is
             * ignored and it will be recorded as mono (single channel).
             */
            fun recordTrack(recordTrack: RecordTrack) = recordTrack(JsonField.of(recordTrack))

            /**
             * Sets [Builder.recordTrack] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordTrack] with a well-typed [RecordTrack] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordTrack(recordTrack: JsonField<RecordTrack>) = apply {
                this.recordTrack = recordTrack
            }

            /**
             * When set to `trim-silence`, silence will be removed from the beginning and end of the
             * recording.
             */
            fun recordTrim(recordTrim: RecordTrim) = recordTrim(JsonField.of(recordTrim))

            /**
             * Sets [Builder.recordTrim] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordTrim] with a well-typed [RecordTrim] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordTrim(recordTrim: JsonField<RecordTrim>) = apply {
                this.recordTrim = recordTrim
            }

            /**
             * Specifies which country ringtone to play when `play_ringtone` is set to `true`. If
             * not set, the US ringtone will be played.
             */
            fun ringtone(ringtone: Ringtone) = ringtone(JsonField.of(ringtone))

            /**
             * Sets [Builder.ringtone] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ringtone] with a well-typed [Ringtone] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ringtone(ringtone: JsonField<Ringtone>) = apply { this.ringtone = ringtone }

            /**
             * The additional parameter that will be passed to the video conference. It is a text
             * field and the user can decide how to use it. For example, you can set the participant
             * name or pass JSON text. It can be used only with video_room_id parameter.
             */
            fun videoRoomContext(videoRoomContext: String) =
                videoRoomContext(JsonField.of(videoRoomContext))

            /**
             * Sets [Builder.videoRoomContext] to an arbitrary JSON value.
             *
             * You should usually call [Builder.videoRoomContext] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun videoRoomContext(videoRoomContext: JsonField<String>) = apply {
                this.videoRoomContext = videoRoomContext
            }

            /**
             * The ID of the video room you want to bridge with, can't be used together with
             * call_control_id parameter or queue parameter.
             */
            fun videoRoomId(videoRoomId: String) = videoRoomId(JsonField.of(videoRoomId))

            /**
             * Sets [Builder.videoRoomId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.videoRoomId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun videoRoomId(videoRoomId: JsonField<String>) = apply {
                this.videoRoomId = videoRoomId
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .bodyCallControlId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("bodyCallControlId", bodyCallControlId),
                    clientState,
                    commandId,
                    muteDtmf,
                    parkAfterUnbridge,
                    playRingtone,
                    queue,
                    record,
                    recordChannels,
                    recordCustomFileName,
                    recordFormat,
                    recordMaxLength,
                    recordTimeoutSecs,
                    recordTrack,
                    recordTrim,
                    ringtone,
                    videoRoomContext,
                    videoRoomId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            bodyCallControlId()
            clientState()
            commandId()
            muteDtmf().ifPresent { it.validate() }
            parkAfterUnbridge()
            playRingtone()
            queue()
            record().ifPresent { it.validate() }
            recordChannels().ifPresent { it.validate() }
            recordCustomFileName()
            recordFormat().ifPresent { it.validate() }
            recordMaxLength()
            recordTimeoutSecs()
            recordTrack().ifPresent { it.validate() }
            recordTrim().ifPresent { it.validate() }
            ringtone().ifPresent { it.validate() }
            videoRoomContext()
            videoRoomId()
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
            (if (bodyCallControlId.asKnown().isPresent) 1 else 0) +
                (if (clientState.asKnown().isPresent) 1 else 0) +
                (if (commandId.asKnown().isPresent) 1 else 0) +
                (muteDtmf.asKnown().getOrNull()?.validity() ?: 0) +
                (if (parkAfterUnbridge.asKnown().isPresent) 1 else 0) +
                (if (playRingtone.asKnown().isPresent) 1 else 0) +
                (if (queue.asKnown().isPresent) 1 else 0) +
                (record.asKnown().getOrNull()?.validity() ?: 0) +
                (recordChannels.asKnown().getOrNull()?.validity() ?: 0) +
                (if (recordCustomFileName.asKnown().isPresent) 1 else 0) +
                (recordFormat.asKnown().getOrNull()?.validity() ?: 0) +
                (if (recordMaxLength.asKnown().isPresent) 1 else 0) +
                (if (recordTimeoutSecs.asKnown().isPresent) 1 else 0) +
                (recordTrack.asKnown().getOrNull()?.validity() ?: 0) +
                (recordTrim.asKnown().getOrNull()?.validity() ?: 0) +
                (ringtone.asKnown().getOrNull()?.validity() ?: 0) +
                (if (videoRoomContext.asKnown().isPresent) 1 else 0) +
                (if (videoRoomId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                bodyCallControlId == other.bodyCallControlId &&
                clientState == other.clientState &&
                commandId == other.commandId &&
                muteDtmf == other.muteDtmf &&
                parkAfterUnbridge == other.parkAfterUnbridge &&
                playRingtone == other.playRingtone &&
                queue == other.queue &&
                record == other.record &&
                recordChannels == other.recordChannels &&
                recordCustomFileName == other.recordCustomFileName &&
                recordFormat == other.recordFormat &&
                recordMaxLength == other.recordMaxLength &&
                recordTimeoutSecs == other.recordTimeoutSecs &&
                recordTrack == other.recordTrack &&
                recordTrim == other.recordTrim &&
                ringtone == other.ringtone &&
                videoRoomContext == other.videoRoomContext &&
                videoRoomId == other.videoRoomId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                bodyCallControlId,
                clientState,
                commandId,
                muteDtmf,
                parkAfterUnbridge,
                playRingtone,
                queue,
                record,
                recordChannels,
                recordCustomFileName,
                recordFormat,
                recordMaxLength,
                recordTimeoutSecs,
                recordTrack,
                recordTrim,
                ringtone,
                videoRoomContext,
                videoRoomId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{bodyCallControlId=$bodyCallControlId, clientState=$clientState, commandId=$commandId, muteDtmf=$muteDtmf, parkAfterUnbridge=$parkAfterUnbridge, playRingtone=$playRingtone, queue=$queue, record=$record, recordChannels=$recordChannels, recordCustomFileName=$recordCustomFileName, recordFormat=$recordFormat, recordMaxLength=$recordMaxLength, recordTimeoutSecs=$recordTimeoutSecs, recordTrack=$recordTrack, recordTrim=$recordTrim, ringtone=$ringtone, videoRoomContext=$videoRoomContext, videoRoomId=$videoRoomId, additionalProperties=$additionalProperties}"
    }

    /**
     * When enabled, DTMF tones are not passed to the call participant. The webhooks containing the
     * DTMF information will be sent.
     */
    class MuteDtmf @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val NONE = of("none")

            @JvmField val BOTH = of("both")

            @JvmField val SELF = of("self")

            @JvmField val OPPOSITE = of("opposite")

            @JvmStatic fun of(value: String) = MuteDtmf(JsonField.of(value))
        }

        /** An enum containing [MuteDtmf]'s known values. */
        enum class Known {
            NONE,
            BOTH,
            SELF,
            OPPOSITE,
        }

        /**
         * An enum containing [MuteDtmf]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [MuteDtmf] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NONE,
            BOTH,
            SELF,
            OPPOSITE,
            /** An enum member indicating that [MuteDtmf] was instantiated with an unknown value. */
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
                NONE -> Value.NONE
                BOTH -> Value.BOTH
                SELF -> Value.SELF
                OPPOSITE -> Value.OPPOSITE
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
                NONE -> Known.NONE
                BOTH -> Known.BOTH
                SELF -> Known.SELF
                OPPOSITE -> Known.OPPOSITE
                else -> throw TelnyxInvalidDataException("Unknown MuteDtmf: $value")
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

        fun validate(): MuteDtmf = apply {
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

            return other is MuteDtmf && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Start recording automatically after an event. Disabled by default. */
    class Record @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val RECORD_FROM_ANSWER = of("record-from-answer")

            @JvmStatic fun of(value: String) = Record(JsonField.of(value))
        }

        /** An enum containing [Record]'s known values. */
        enum class Known {
            RECORD_FROM_ANSWER
        }

        /**
         * An enum containing [Record]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Record] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            RECORD_FROM_ANSWER,
            /** An enum member indicating that [Record] was instantiated with an unknown value. */
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
                RECORD_FROM_ANSWER -> Value.RECORD_FROM_ANSWER
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
                RECORD_FROM_ANSWER -> Known.RECORD_FROM_ANSWER
                else -> throw TelnyxInvalidDataException("Unknown Record: $value")
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

        fun validate(): Record = apply {
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

            return other is Record && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Defines which channel should be recorded ('single' or 'dual') when `record` is specified. */
    class RecordChannels @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val SINGLE = of("single")

            @JvmField val DUAL = of("dual")

            @JvmStatic fun of(value: String) = RecordChannels(JsonField.of(value))
        }

        /** An enum containing [RecordChannels]'s known values. */
        enum class Known {
            SINGLE,
            DUAL,
        }

        /**
         * An enum containing [RecordChannels]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RecordChannels] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SINGLE,
            DUAL,
            /**
             * An enum member indicating that [RecordChannels] was instantiated with an unknown
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
                SINGLE -> Value.SINGLE
                DUAL -> Value.DUAL
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
                SINGLE -> Known.SINGLE
                DUAL -> Known.DUAL
                else -> throw TelnyxInvalidDataException("Unknown RecordChannels: $value")
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

        fun validate(): RecordChannels = apply {
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

            return other is RecordChannels && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Defines the format of the recording ('wav' or 'mp3') when `record` is specified. */
    class RecordFormat @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val WAV = of("wav")

            @JvmField val MP3 = of("mp3")

            @JvmStatic fun of(value: String) = RecordFormat(JsonField.of(value))
        }

        /** An enum containing [RecordFormat]'s known values. */
        enum class Known {
            WAV,
            MP3,
        }

        /**
         * An enum containing [RecordFormat]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RecordFormat] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            WAV,
            MP3,
            /**
             * An enum member indicating that [RecordFormat] was instantiated with an unknown value.
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
                WAV -> Value.WAV
                MP3 -> Value.MP3
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
                WAV -> Known.WAV
                MP3 -> Known.MP3
                else -> throw TelnyxInvalidDataException("Unknown RecordFormat: $value")
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

        fun validate(): RecordFormat = apply {
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

            return other is RecordFormat && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The audio track to be recorded. Can be either `both`, `inbound` or `outbound`. If only single
     * track is specified (`inbound`, `outbound`), `channels` configuration is ignored and it will
     * be recorded as mono (single channel).
     */
    class RecordTrack @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val BOTH = of("both")

            @JvmField val INBOUND = of("inbound")

            @JvmField val OUTBOUND = of("outbound")

            @JvmStatic fun of(value: String) = RecordTrack(JsonField.of(value))
        }

        /** An enum containing [RecordTrack]'s known values. */
        enum class Known {
            BOTH,
            INBOUND,
            OUTBOUND,
        }

        /**
         * An enum containing [RecordTrack]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RecordTrack] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BOTH,
            INBOUND,
            OUTBOUND,
            /**
             * An enum member indicating that [RecordTrack] was instantiated with an unknown value.
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
                BOTH -> Value.BOTH
                INBOUND -> Value.INBOUND
                OUTBOUND -> Value.OUTBOUND
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
                BOTH -> Known.BOTH
                INBOUND -> Known.INBOUND
                OUTBOUND -> Known.OUTBOUND
                else -> throw TelnyxInvalidDataException("Unknown RecordTrack: $value")
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

        fun validate(): RecordTrack = apply {
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

            return other is RecordTrack && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * When set to `trim-silence`, silence will be removed from the beginning and end of the
     * recording.
     */
    class RecordTrim @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val TRIM_SILENCE = of("trim-silence")

            @JvmStatic fun of(value: String) = RecordTrim(JsonField.of(value))
        }

        /** An enum containing [RecordTrim]'s known values. */
        enum class Known {
            TRIM_SILENCE
        }

        /**
         * An enum containing [RecordTrim]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RecordTrim] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TRIM_SILENCE,
            /**
             * An enum member indicating that [RecordTrim] was instantiated with an unknown value.
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
                TRIM_SILENCE -> Value.TRIM_SILENCE
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
                TRIM_SILENCE -> Known.TRIM_SILENCE
                else -> throw TelnyxInvalidDataException("Unknown RecordTrim: $value")
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

        fun validate(): RecordTrim = apply {
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

            return other is RecordTrim && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Specifies which country ringtone to play when `play_ringtone` is set to `true`. If not set,
     * the US ringtone will be played.
     */
    class Ringtone @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val AT = of("at")

            @JvmField val AU = of("au")

            @JvmField val BE = of("be")

            @JvmField val BG = of("bg")

            @JvmField val BR = of("br")

            @JvmField val CH = of("ch")

            @JvmField val CL = of("cl")

            @JvmField val CN = of("cn")

            @JvmField val CZ = of("cz")

            @JvmField val DE = of("de")

            @JvmField val DK = of("dk")

            @JvmField val EE = of("ee")

            @JvmField val ES = of("es")

            @JvmField val FI = of("fi")

            @JvmField val FR = of("fr")

            @JvmField val GR = of("gr")

            @JvmField val HU = of("hu")

            @JvmField val IL = of("il")

            @JvmField val IN = of("in")

            @JvmField val IT = of("it")

            @JvmField val JP = of("jp")

            @JvmField val LT = of("lt")

            @JvmField val MX = of("mx")

            @JvmField val MY = of("my")

            @JvmField val NL = of("nl")

            @JvmField val NO = of("no")

            @JvmField val NZ = of("nz")

            @JvmField val PH = of("ph")

            @JvmField val PL = of("pl")

            @JvmField val PT = of("pt")

            @JvmField val RU = of("ru")

            @JvmField val SE = of("se")

            @JvmField val SG = of("sg")

            @JvmField val TH = of("th")

            @JvmField val TW = of("tw")

            @JvmField val UK = of("uk")

            @JvmField val US_OLD = of("us-old")

            @JvmField val US = of("us")

            @JvmField val VE = of("ve")

            @JvmField val ZA = of("za")

            @JvmStatic fun of(value: String) = Ringtone(JsonField.of(value))
        }

        /** An enum containing [Ringtone]'s known values. */
        enum class Known {
            AT,
            AU,
            BE,
            BG,
            BR,
            CH,
            CL,
            CN,
            CZ,
            DE,
            DK,
            EE,
            ES,
            FI,
            FR,
            GR,
            HU,
            IL,
            IN,
            IT,
            JP,
            LT,
            MX,
            MY,
            NL,
            NO,
            NZ,
            PH,
            PL,
            PT,
            RU,
            SE,
            SG,
            TH,
            TW,
            UK,
            US_OLD,
            US,
            VE,
            ZA,
        }

        /**
         * An enum containing [Ringtone]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Ringtone] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AT,
            AU,
            BE,
            BG,
            BR,
            CH,
            CL,
            CN,
            CZ,
            DE,
            DK,
            EE,
            ES,
            FI,
            FR,
            GR,
            HU,
            IL,
            IN,
            IT,
            JP,
            LT,
            MX,
            MY,
            NL,
            NO,
            NZ,
            PH,
            PL,
            PT,
            RU,
            SE,
            SG,
            TH,
            TW,
            UK,
            US_OLD,
            US,
            VE,
            ZA,
            /** An enum member indicating that [Ringtone] was instantiated with an unknown value. */
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
                AT -> Value.AT
                AU -> Value.AU
                BE -> Value.BE
                BG -> Value.BG
                BR -> Value.BR
                CH -> Value.CH
                CL -> Value.CL
                CN -> Value.CN
                CZ -> Value.CZ
                DE -> Value.DE
                DK -> Value.DK
                EE -> Value.EE
                ES -> Value.ES
                FI -> Value.FI
                FR -> Value.FR
                GR -> Value.GR
                HU -> Value.HU
                IL -> Value.IL
                IN -> Value.IN
                IT -> Value.IT
                JP -> Value.JP
                LT -> Value.LT
                MX -> Value.MX
                MY -> Value.MY
                NL -> Value.NL
                NO -> Value.NO
                NZ -> Value.NZ
                PH -> Value.PH
                PL -> Value.PL
                PT -> Value.PT
                RU -> Value.RU
                SE -> Value.SE
                SG -> Value.SG
                TH -> Value.TH
                TW -> Value.TW
                UK -> Value.UK
                US_OLD -> Value.US_OLD
                US -> Value.US
                VE -> Value.VE
                ZA -> Value.ZA
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
                AT -> Known.AT
                AU -> Known.AU
                BE -> Known.BE
                BG -> Known.BG
                BR -> Known.BR
                CH -> Known.CH
                CL -> Known.CL
                CN -> Known.CN
                CZ -> Known.CZ
                DE -> Known.DE
                DK -> Known.DK
                EE -> Known.EE
                ES -> Known.ES
                FI -> Known.FI
                FR -> Known.FR
                GR -> Known.GR
                HU -> Known.HU
                IL -> Known.IL
                IN -> Known.IN
                IT -> Known.IT
                JP -> Known.JP
                LT -> Known.LT
                MX -> Known.MX
                MY -> Known.MY
                NL -> Known.NL
                NO -> Known.NO
                NZ -> Known.NZ
                PH -> Known.PH
                PL -> Known.PL
                PT -> Known.PT
                RU -> Known.RU
                SE -> Known.SE
                SG -> Known.SG
                TH -> Known.TH
                TW -> Known.TW
                UK -> Known.UK
                US_OLD -> Known.US_OLD
                US -> Known.US
                VE -> Known.VE
                ZA -> Known.ZA
                else -> throw TelnyxInvalidDataException("Unknown Ringtone: $value")
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

        fun validate(): Ringtone = apply {
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

            return other is Ringtone && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActionBridgeParams &&
            pathCallControlId == other.pathCallControlId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(pathCallControlId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ActionBridgeParams{pathCallControlId=$pathCallControlId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
