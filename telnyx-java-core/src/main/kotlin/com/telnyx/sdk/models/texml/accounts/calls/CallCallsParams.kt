// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.calls

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
 * Initiate an outbound TeXML call. Telnyx will request TeXML from the XML Request URL configured
 * for the connection in the Mission Control Portal.
 */
class CallCallsParams
private constructor(
    private val accountSid: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun accountSid(): Optional<String> = Optional.ofNullable(accountSid)

    /**
     * The ID of the TeXML Application.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun applicationSid(): String = body.applicationSid()

    /**
     * The phone number of the party that initiated the call. Phone numbers are formatted with a `+`
     * and country code.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun from(): String = body.from()

    /**
     * The phone number of the called party. Phone numbers are formatted with a `+` and country
     * code.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun to(): String = body.to()

    /**
     * Select whether to perform answering machine detection in the background. By default execution
     * is blocked until Answering Machine Detection is completed.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun asyncAmd(): Optional<Boolean> = body.asyncAmd()

    /**
     * URL destination for Telnyx to send AMD callback events to for the call.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun asyncAmdStatusCallback(): Optional<String> = body.asyncAmdStatusCallback()

    /**
     * HTTP request type used for `AsyncAmdStatusCallback`. The default value is inherited from
     * TeXML Application setting.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun asyncAmdStatusCallbackMethod(): Optional<AsyncAmdStatusCallbackMethod> =
        body.asyncAmdStatusCallbackMethod()

    /**
     * To be used as the caller id name (SIP From Display Name) presented to the destination (`To`
     * number). The string should have a maximum of 128 characters, containing only letters,
     * numbers, spaces, and `-_~!.+` special characters. If ommited, the display name will be the
     * same as the number in the `From` field.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callerId(): Optional<String> = body.callerId()

    /**
     * Whether to cancel ongoing playback on `greeting ended` detection. Defaults to `true`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cancelPlaybackOnDetectMessageEnd(): Optional<Boolean> =
        body.cancelPlaybackOnDetectMessageEnd()

    /**
     * Whether to cancel ongoing playback on `machine` detection. Defaults to `true`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cancelPlaybackOnMachineDetection(): Optional<Boolean> =
        body.cancelPlaybackOnMachineDetection()

    /**
     * Allows you to chose between Premium and Standard detections.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun detectionMode(): Optional<DetectionMode> = body.detectionMode()

    /**
     * A failover URL for which Telnyx will retrieve the TeXML call instructions if the `Url` is not
     * responding.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fallbackUrl(): Optional<String> = body.fallbackUrl()

    /**
     * Enables Answering Machine Detection.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun machineDetection(): Optional<MachineDetection> = body.machineDetection()

    /**
     * If initial silence duration is greater than this value, consider it a machine. Ignored when
     * `premium` detection is used.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun machineDetectionSilenceTimeout(): Optional<Long> = body.machineDetectionSilenceTimeout()

    /**
     * Silence duration threshold after a greeting message or voice for it be considered human.
     * Ignored when `premium` detection is used.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun machineDetectionSpeechEndThreshold(): Optional<Long> =
        body.machineDetectionSpeechEndThreshold()

    /**
     * Maximum threshold of a human greeting. If greeting longer than this value, considered
     * machine. Ignored when `premium` detection is used.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun machineDetectionSpeechThreshold(): Optional<Long> = body.machineDetectionSpeechThreshold()

    /**
     * Maximum timeout threshold in milliseconds for overall detection.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun machineDetectionTimeout(): Optional<Long> = body.machineDetectionTimeout()

    /**
     * The list of comma-separated codecs to be offered on a call.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun preferredCodecs(): Optional<String> = body.preferredCodecs()

    /**
     * Whether to record the entire participant's call leg. Defaults to `false`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun record(): Optional<Boolean> = body.record()

    /**
     * The number of channels in the final recording. Defaults to `mono`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordingChannels(): Optional<RecordingChannels> = body.recordingChannels()

    /**
     * The URL the recording callbacks will be sent to.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordingStatusCallback(): Optional<String> = body.recordingStatusCallback()

    /**
     * The changes to the recording's state that should generate a call to
     * `RecoridngStatusCallback`. Can be: `in-progress`, `completed` and `absent`. Separate multiple
     * values with a space. Defaults to `completed`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordingStatusCallbackEvent(): Optional<String> = body.recordingStatusCallbackEvent()

    /**
     * HTTP request type used for `RecordingStatusCallback`. Defaults to `POST`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordingStatusCallbackMethod(): Optional<RecordingStatusCallbackMethod> =
        body.recordingStatusCallbackMethod()

    /**
     * The number of seconds that Telnyx will wait for the recording to be stopped if silence is
     * detected. The timer only starts when the speech is detected. Please note that the
     * transcription is used to detect silence and the related charge will be applied. The minimum
     * value is 0. The default value is 0 (infinite)
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordingTimeout(): Optional<Long> = body.recordingTimeout()

    /**
     * The audio track to record for the call. The default is `both`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordingTrack(): Optional<RecordingTrack> = body.recordingTrack()

    /**
     * Whether to send RecordingUrl in webhooks.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sendRecordingUrl(): Optional<Boolean> = body.sendRecordingUrl()

    /**
     * The password to use for SIP authentication.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sipAuthPassword(): Optional<String> = body.sipAuthPassword()

    /**
     * The username to use for SIP authentication.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sipAuthUsername(): Optional<String> = body.sipAuthUsername()

    /**
     * URL destination for Telnyx to send status callback events to for the call.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun statusCallback(): Optional<String> = body.statusCallback()

    /**
     * The call events for which Telnyx should send a webhook. Multiple events can be defined when
     * separated by a space.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun statusCallbackEvent(): Optional<StatusCallbackEvent> = body.statusCallbackEvent()

    /**
     * HTTP request type used for `StatusCallback`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun statusCallbackMethod(): Optional<StatusCallbackMethod> = body.statusCallbackMethod()

    /**
     * Whether to trim any leading and trailing silence from the recording. Defaults to
     * `trim-silence`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun trim(): Optional<Trim> = body.trim()

    /**
     * The URL from which Telnyx will retrieve the TeXML call instructions.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun url(): Optional<String> = body.url()

    /**
     * HTTP request type used for `Url`. The default value is inherited from TeXML Application
     * setting.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun urlMethod(): Optional<UrlMethod> = body.urlMethod()

    /**
     * Returns the raw JSON value of [applicationSid].
     *
     * Unlike [applicationSid], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _applicationSid(): JsonField<String> = body._applicationSid()

    /**
     * Returns the raw JSON value of [from].
     *
     * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _from(): JsonField<String> = body._from()

    /**
     * Returns the raw JSON value of [to].
     *
     * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _to(): JsonField<String> = body._to()

    /**
     * Returns the raw JSON value of [asyncAmd].
     *
     * Unlike [asyncAmd], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _asyncAmd(): JsonField<Boolean> = body._asyncAmd()

    /**
     * Returns the raw JSON value of [asyncAmdStatusCallback].
     *
     * Unlike [asyncAmdStatusCallback], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _asyncAmdStatusCallback(): JsonField<String> = body._asyncAmdStatusCallback()

    /**
     * Returns the raw JSON value of [asyncAmdStatusCallbackMethod].
     *
     * Unlike [asyncAmdStatusCallbackMethod], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _asyncAmdStatusCallbackMethod(): JsonField<AsyncAmdStatusCallbackMethod> =
        body._asyncAmdStatusCallbackMethod()

    /**
     * Returns the raw JSON value of [callerId].
     *
     * Unlike [callerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _callerId(): JsonField<String> = body._callerId()

    /**
     * Returns the raw JSON value of [cancelPlaybackOnDetectMessageEnd].
     *
     * Unlike [cancelPlaybackOnDetectMessageEnd], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _cancelPlaybackOnDetectMessageEnd(): JsonField<Boolean> =
        body._cancelPlaybackOnDetectMessageEnd()

    /**
     * Returns the raw JSON value of [cancelPlaybackOnMachineDetection].
     *
     * Unlike [cancelPlaybackOnMachineDetection], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _cancelPlaybackOnMachineDetection(): JsonField<Boolean> =
        body._cancelPlaybackOnMachineDetection()

    /**
     * Returns the raw JSON value of [detectionMode].
     *
     * Unlike [detectionMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _detectionMode(): JsonField<DetectionMode> = body._detectionMode()

    /**
     * Returns the raw JSON value of [fallbackUrl].
     *
     * Unlike [fallbackUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _fallbackUrl(): JsonField<String> = body._fallbackUrl()

    /**
     * Returns the raw JSON value of [machineDetection].
     *
     * Unlike [machineDetection], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _machineDetection(): JsonField<MachineDetection> = body._machineDetection()

    /**
     * Returns the raw JSON value of [machineDetectionSilenceTimeout].
     *
     * Unlike [machineDetectionSilenceTimeout], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _machineDetectionSilenceTimeout(): JsonField<Long> = body._machineDetectionSilenceTimeout()

    /**
     * Returns the raw JSON value of [machineDetectionSpeechEndThreshold].
     *
     * Unlike [machineDetectionSpeechEndThreshold], this method doesn't throw if the JSON field has
     * an unexpected type.
     */
    fun _machineDetectionSpeechEndThreshold(): JsonField<Long> =
        body._machineDetectionSpeechEndThreshold()

    /**
     * Returns the raw JSON value of [machineDetectionSpeechThreshold].
     *
     * Unlike [machineDetectionSpeechThreshold], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _machineDetectionSpeechThreshold(): JsonField<Long> =
        body._machineDetectionSpeechThreshold()

    /**
     * Returns the raw JSON value of [machineDetectionTimeout].
     *
     * Unlike [machineDetectionTimeout], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _machineDetectionTimeout(): JsonField<Long> = body._machineDetectionTimeout()

    /**
     * Returns the raw JSON value of [preferredCodecs].
     *
     * Unlike [preferredCodecs], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _preferredCodecs(): JsonField<String> = body._preferredCodecs()

    /**
     * Returns the raw JSON value of [record].
     *
     * Unlike [record], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _record(): JsonField<Boolean> = body._record()

    /**
     * Returns the raw JSON value of [recordingChannels].
     *
     * Unlike [recordingChannels], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _recordingChannels(): JsonField<RecordingChannels> = body._recordingChannels()

    /**
     * Returns the raw JSON value of [recordingStatusCallback].
     *
     * Unlike [recordingStatusCallback], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _recordingStatusCallback(): JsonField<String> = body._recordingStatusCallback()

    /**
     * Returns the raw JSON value of [recordingStatusCallbackEvent].
     *
     * Unlike [recordingStatusCallbackEvent], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _recordingStatusCallbackEvent(): JsonField<String> = body._recordingStatusCallbackEvent()

    /**
     * Returns the raw JSON value of [recordingStatusCallbackMethod].
     *
     * Unlike [recordingStatusCallbackMethod], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _recordingStatusCallbackMethod(): JsonField<RecordingStatusCallbackMethod> =
        body._recordingStatusCallbackMethod()

    /**
     * Returns the raw JSON value of [recordingTimeout].
     *
     * Unlike [recordingTimeout], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _recordingTimeout(): JsonField<Long> = body._recordingTimeout()

    /**
     * Returns the raw JSON value of [recordingTrack].
     *
     * Unlike [recordingTrack], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _recordingTrack(): JsonField<RecordingTrack> = body._recordingTrack()

    /**
     * Returns the raw JSON value of [sendRecordingUrl].
     *
     * Unlike [sendRecordingUrl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _sendRecordingUrl(): JsonField<Boolean> = body._sendRecordingUrl()

    /**
     * Returns the raw JSON value of [sipAuthPassword].
     *
     * Unlike [sipAuthPassword], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sipAuthPassword(): JsonField<String> = body._sipAuthPassword()

    /**
     * Returns the raw JSON value of [sipAuthUsername].
     *
     * Unlike [sipAuthUsername], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sipAuthUsername(): JsonField<String> = body._sipAuthUsername()

    /**
     * Returns the raw JSON value of [statusCallback].
     *
     * Unlike [statusCallback], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _statusCallback(): JsonField<String> = body._statusCallback()

    /**
     * Returns the raw JSON value of [statusCallbackEvent].
     *
     * Unlike [statusCallbackEvent], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _statusCallbackEvent(): JsonField<StatusCallbackEvent> = body._statusCallbackEvent()

    /**
     * Returns the raw JSON value of [statusCallbackMethod].
     *
     * Unlike [statusCallbackMethod], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _statusCallbackMethod(): JsonField<StatusCallbackMethod> = body._statusCallbackMethod()

    /**
     * Returns the raw JSON value of [trim].
     *
     * Unlike [trim], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _trim(): JsonField<Trim> = body._trim()

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _url(): JsonField<String> = body._url()

    /**
     * Returns the raw JSON value of [urlMethod].
     *
     * Unlike [urlMethod], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _urlMethod(): JsonField<UrlMethod> = body._urlMethod()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CallCallsParams].
         *
         * The following fields are required:
         * ```java
         * .applicationSid()
         * .from()
         * .to()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CallCallsParams]. */
    class Builder internal constructor() {

        private var accountSid: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(callCallsParams: CallCallsParams) = apply {
            accountSid = callCallsParams.accountSid
            body = callCallsParams.body.toBuilder()
            additionalHeaders = callCallsParams.additionalHeaders.toBuilder()
            additionalQueryParams = callCallsParams.additionalQueryParams.toBuilder()
        }

        fun accountSid(accountSid: String?) = apply { this.accountSid = accountSid }

        /** Alias for calling [Builder.accountSid] with `accountSid.orElse(null)`. */
        fun accountSid(accountSid: Optional<String>) = accountSid(accountSid.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [applicationSid]
         * - [from]
         * - [to]
         * - [asyncAmd]
         * - [asyncAmdStatusCallback]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The ID of the TeXML Application. */
        fun applicationSid(applicationSid: String) = apply { body.applicationSid(applicationSid) }

        /**
         * Sets [Builder.applicationSid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.applicationSid] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun applicationSid(applicationSid: JsonField<String>) = apply {
            body.applicationSid(applicationSid)
        }

        /**
         * The phone number of the party that initiated the call. Phone numbers are formatted with a
         * `+` and country code.
         */
        fun from(from: String) = apply { body.from(from) }

        /**
         * Sets [Builder.from] to an arbitrary JSON value.
         *
         * You should usually call [Builder.from] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun from(from: JsonField<String>) = apply { body.from(from) }

        /**
         * The phone number of the called party. Phone numbers are formatted with a `+` and country
         * code.
         */
        fun to(to: String) = apply { body.to(to) }

        /**
         * Sets [Builder.to] to an arbitrary JSON value.
         *
         * You should usually call [Builder.to] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun to(to: JsonField<String>) = apply { body.to(to) }

        /**
         * Select whether to perform answering machine detection in the background. By default
         * execution is blocked until Answering Machine Detection is completed.
         */
        fun asyncAmd(asyncAmd: Boolean) = apply { body.asyncAmd(asyncAmd) }

        /**
         * Sets [Builder.asyncAmd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.asyncAmd] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun asyncAmd(asyncAmd: JsonField<Boolean>) = apply { body.asyncAmd(asyncAmd) }

        /** URL destination for Telnyx to send AMD callback events to for the call. */
        fun asyncAmdStatusCallback(asyncAmdStatusCallback: String) = apply {
            body.asyncAmdStatusCallback(asyncAmdStatusCallback)
        }

        /**
         * Sets [Builder.asyncAmdStatusCallback] to an arbitrary JSON value.
         *
         * You should usually call [Builder.asyncAmdStatusCallback] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun asyncAmdStatusCallback(asyncAmdStatusCallback: JsonField<String>) = apply {
            body.asyncAmdStatusCallback(asyncAmdStatusCallback)
        }

        /**
         * HTTP request type used for `AsyncAmdStatusCallback`. The default value is inherited from
         * TeXML Application setting.
         */
        fun asyncAmdStatusCallbackMethod(
            asyncAmdStatusCallbackMethod: AsyncAmdStatusCallbackMethod
        ) = apply { body.asyncAmdStatusCallbackMethod(asyncAmdStatusCallbackMethod) }

        /**
         * Sets [Builder.asyncAmdStatusCallbackMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.asyncAmdStatusCallbackMethod] with a well-typed
         * [AsyncAmdStatusCallbackMethod] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun asyncAmdStatusCallbackMethod(
            asyncAmdStatusCallbackMethod: JsonField<AsyncAmdStatusCallbackMethod>
        ) = apply { body.asyncAmdStatusCallbackMethod(asyncAmdStatusCallbackMethod) }

        /**
         * To be used as the caller id name (SIP From Display Name) presented to the destination
         * (`To` number). The string should have a maximum of 128 characters, containing only
         * letters, numbers, spaces, and `-_~!.+` special characters. If ommited, the display name
         * will be the same as the number in the `From` field.
         */
        fun callerId(callerId: String) = apply { body.callerId(callerId) }

        /**
         * Sets [Builder.callerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callerId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun callerId(callerId: JsonField<String>) = apply { body.callerId(callerId) }

        /** Whether to cancel ongoing playback on `greeting ended` detection. Defaults to `true`. */
        fun cancelPlaybackOnDetectMessageEnd(cancelPlaybackOnDetectMessageEnd: Boolean) = apply {
            body.cancelPlaybackOnDetectMessageEnd(cancelPlaybackOnDetectMessageEnd)
        }

        /**
         * Sets [Builder.cancelPlaybackOnDetectMessageEnd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cancelPlaybackOnDetectMessageEnd] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun cancelPlaybackOnDetectMessageEnd(cancelPlaybackOnDetectMessageEnd: JsonField<Boolean>) =
            apply {
                body.cancelPlaybackOnDetectMessageEnd(cancelPlaybackOnDetectMessageEnd)
            }

        /** Whether to cancel ongoing playback on `machine` detection. Defaults to `true`. */
        fun cancelPlaybackOnMachineDetection(cancelPlaybackOnMachineDetection: Boolean) = apply {
            body.cancelPlaybackOnMachineDetection(cancelPlaybackOnMachineDetection)
        }

        /**
         * Sets [Builder.cancelPlaybackOnMachineDetection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cancelPlaybackOnMachineDetection] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun cancelPlaybackOnMachineDetection(cancelPlaybackOnMachineDetection: JsonField<Boolean>) =
            apply {
                body.cancelPlaybackOnMachineDetection(cancelPlaybackOnMachineDetection)
            }

        /** Allows you to chose between Premium and Standard detections. */
        fun detectionMode(detectionMode: DetectionMode) = apply {
            body.detectionMode(detectionMode)
        }

        /**
         * Sets [Builder.detectionMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.detectionMode] with a well-typed [DetectionMode] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun detectionMode(detectionMode: JsonField<DetectionMode>) = apply {
            body.detectionMode(detectionMode)
        }

        /**
         * A failover URL for which Telnyx will retrieve the TeXML call instructions if the `Url` is
         * not responding.
         */
        fun fallbackUrl(fallbackUrl: String) = apply { body.fallbackUrl(fallbackUrl) }

        /**
         * Sets [Builder.fallbackUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fallbackUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fallbackUrl(fallbackUrl: JsonField<String>) = apply { body.fallbackUrl(fallbackUrl) }

        /** Enables Answering Machine Detection. */
        fun machineDetection(machineDetection: MachineDetection) = apply {
            body.machineDetection(machineDetection)
        }

        /**
         * Sets [Builder.machineDetection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.machineDetection] with a well-typed [MachineDetection]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun machineDetection(machineDetection: JsonField<MachineDetection>) = apply {
            body.machineDetection(machineDetection)
        }

        /**
         * If initial silence duration is greater than this value, consider it a machine. Ignored
         * when `premium` detection is used.
         */
        fun machineDetectionSilenceTimeout(machineDetectionSilenceTimeout: Long) = apply {
            body.machineDetectionSilenceTimeout(machineDetectionSilenceTimeout)
        }

        /**
         * Sets [Builder.machineDetectionSilenceTimeout] to an arbitrary JSON value.
         *
         * You should usually call [Builder.machineDetectionSilenceTimeout] with a well-typed [Long]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun machineDetectionSilenceTimeout(machineDetectionSilenceTimeout: JsonField<Long>) =
            apply {
                body.machineDetectionSilenceTimeout(machineDetectionSilenceTimeout)
            }

        /**
         * Silence duration threshold after a greeting message or voice for it be considered human.
         * Ignored when `premium` detection is used.
         */
        fun machineDetectionSpeechEndThreshold(machineDetectionSpeechEndThreshold: Long) = apply {
            body.machineDetectionSpeechEndThreshold(machineDetectionSpeechEndThreshold)
        }

        /**
         * Sets [Builder.machineDetectionSpeechEndThreshold] to an arbitrary JSON value.
         *
         * You should usually call [Builder.machineDetectionSpeechEndThreshold] with a well-typed
         * [Long] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun machineDetectionSpeechEndThreshold(
            machineDetectionSpeechEndThreshold: JsonField<Long>
        ) = apply { body.machineDetectionSpeechEndThreshold(machineDetectionSpeechEndThreshold) }

        /**
         * Maximum threshold of a human greeting. If greeting longer than this value, considered
         * machine. Ignored when `premium` detection is used.
         */
        fun machineDetectionSpeechThreshold(machineDetectionSpeechThreshold: Long) = apply {
            body.machineDetectionSpeechThreshold(machineDetectionSpeechThreshold)
        }

        /**
         * Sets [Builder.machineDetectionSpeechThreshold] to an arbitrary JSON value.
         *
         * You should usually call [Builder.machineDetectionSpeechThreshold] with a well-typed
         * [Long] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun machineDetectionSpeechThreshold(machineDetectionSpeechThreshold: JsonField<Long>) =
            apply {
                body.machineDetectionSpeechThreshold(machineDetectionSpeechThreshold)
            }

        /** Maximum timeout threshold in milliseconds for overall detection. */
        fun machineDetectionTimeout(machineDetectionTimeout: Long) = apply {
            body.machineDetectionTimeout(machineDetectionTimeout)
        }

        /**
         * Sets [Builder.machineDetectionTimeout] to an arbitrary JSON value.
         *
         * You should usually call [Builder.machineDetectionTimeout] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun machineDetectionTimeout(machineDetectionTimeout: JsonField<Long>) = apply {
            body.machineDetectionTimeout(machineDetectionTimeout)
        }

        /** The list of comma-separated codecs to be offered on a call. */
        fun preferredCodecs(preferredCodecs: String) = apply {
            body.preferredCodecs(preferredCodecs)
        }

        /**
         * Sets [Builder.preferredCodecs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.preferredCodecs] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun preferredCodecs(preferredCodecs: JsonField<String>) = apply {
            body.preferredCodecs(preferredCodecs)
        }

        /** Whether to record the entire participant's call leg. Defaults to `false`. */
        fun record(record: Boolean) = apply { body.record(record) }

        /**
         * Sets [Builder.record] to an arbitrary JSON value.
         *
         * You should usually call [Builder.record] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun record(record: JsonField<Boolean>) = apply { body.record(record) }

        /** The number of channels in the final recording. Defaults to `mono`. */
        fun recordingChannels(recordingChannels: RecordingChannels) = apply {
            body.recordingChannels(recordingChannels)
        }

        /**
         * Sets [Builder.recordingChannels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordingChannels] with a well-typed [RecordingChannels]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun recordingChannels(recordingChannels: JsonField<RecordingChannels>) = apply {
            body.recordingChannels(recordingChannels)
        }

        /** The URL the recording callbacks will be sent to. */
        fun recordingStatusCallback(recordingStatusCallback: String) = apply {
            body.recordingStatusCallback(recordingStatusCallback)
        }

        /**
         * Sets [Builder.recordingStatusCallback] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordingStatusCallback] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun recordingStatusCallback(recordingStatusCallback: JsonField<String>) = apply {
            body.recordingStatusCallback(recordingStatusCallback)
        }

        /**
         * The changes to the recording's state that should generate a call to
         * `RecoridngStatusCallback`. Can be: `in-progress`, `completed` and `absent`. Separate
         * multiple values with a space. Defaults to `completed`.
         */
        fun recordingStatusCallbackEvent(recordingStatusCallbackEvent: String) = apply {
            body.recordingStatusCallbackEvent(recordingStatusCallbackEvent)
        }

        /**
         * Sets [Builder.recordingStatusCallbackEvent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordingStatusCallbackEvent] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun recordingStatusCallbackEvent(recordingStatusCallbackEvent: JsonField<String>) = apply {
            body.recordingStatusCallbackEvent(recordingStatusCallbackEvent)
        }

        /** HTTP request type used for `RecordingStatusCallback`. Defaults to `POST`. */
        fun recordingStatusCallbackMethod(
            recordingStatusCallbackMethod: RecordingStatusCallbackMethod
        ) = apply { body.recordingStatusCallbackMethod(recordingStatusCallbackMethod) }

        /**
         * Sets [Builder.recordingStatusCallbackMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordingStatusCallbackMethod] with a well-typed
         * [RecordingStatusCallbackMethod] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun recordingStatusCallbackMethod(
            recordingStatusCallbackMethod: JsonField<RecordingStatusCallbackMethod>
        ) = apply { body.recordingStatusCallbackMethod(recordingStatusCallbackMethod) }

        /**
         * The number of seconds that Telnyx will wait for the recording to be stopped if silence is
         * detected. The timer only starts when the speech is detected. Please note that the
         * transcription is used to detect silence and the related charge will be applied. The
         * minimum value is 0. The default value is 0 (infinite)
         */
        fun recordingTimeout(recordingTimeout: Long) = apply {
            body.recordingTimeout(recordingTimeout)
        }

        /**
         * Sets [Builder.recordingTimeout] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordingTimeout] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recordingTimeout(recordingTimeout: JsonField<Long>) = apply {
            body.recordingTimeout(recordingTimeout)
        }

        /** The audio track to record for the call. The default is `both`. */
        fun recordingTrack(recordingTrack: RecordingTrack) = apply {
            body.recordingTrack(recordingTrack)
        }

        /**
         * Sets [Builder.recordingTrack] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordingTrack] with a well-typed [RecordingTrack] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recordingTrack(recordingTrack: JsonField<RecordingTrack>) = apply {
            body.recordingTrack(recordingTrack)
        }

        /** Whether to send RecordingUrl in webhooks. */
        fun sendRecordingUrl(sendRecordingUrl: Boolean) = apply {
            body.sendRecordingUrl(sendRecordingUrl)
        }

        /**
         * Sets [Builder.sendRecordingUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sendRecordingUrl] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sendRecordingUrl(sendRecordingUrl: JsonField<Boolean>) = apply {
            body.sendRecordingUrl(sendRecordingUrl)
        }

        /** The password to use for SIP authentication. */
        fun sipAuthPassword(sipAuthPassword: String) = apply {
            body.sipAuthPassword(sipAuthPassword)
        }

        /**
         * Sets [Builder.sipAuthPassword] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sipAuthPassword] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sipAuthPassword(sipAuthPassword: JsonField<String>) = apply {
            body.sipAuthPassword(sipAuthPassword)
        }

        /** The username to use for SIP authentication. */
        fun sipAuthUsername(sipAuthUsername: String) = apply {
            body.sipAuthUsername(sipAuthUsername)
        }

        /**
         * Sets [Builder.sipAuthUsername] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sipAuthUsername] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sipAuthUsername(sipAuthUsername: JsonField<String>) = apply {
            body.sipAuthUsername(sipAuthUsername)
        }

        /** URL destination for Telnyx to send status callback events to for the call. */
        fun statusCallback(statusCallback: String) = apply { body.statusCallback(statusCallback) }

        /**
         * Sets [Builder.statusCallback] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statusCallback] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun statusCallback(statusCallback: JsonField<String>) = apply {
            body.statusCallback(statusCallback)
        }

        /**
         * The call events for which Telnyx should send a webhook. Multiple events can be defined
         * when separated by a space.
         */
        fun statusCallbackEvent(statusCallbackEvent: StatusCallbackEvent) = apply {
            body.statusCallbackEvent(statusCallbackEvent)
        }

        /**
         * Sets [Builder.statusCallbackEvent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statusCallbackEvent] with a well-typed
         * [StatusCallbackEvent] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun statusCallbackEvent(statusCallbackEvent: JsonField<StatusCallbackEvent>) = apply {
            body.statusCallbackEvent(statusCallbackEvent)
        }

        /** HTTP request type used for `StatusCallback`. */
        fun statusCallbackMethod(statusCallbackMethod: StatusCallbackMethod) = apply {
            body.statusCallbackMethod(statusCallbackMethod)
        }

        /**
         * Sets [Builder.statusCallbackMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statusCallbackMethod] with a well-typed
         * [StatusCallbackMethod] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun statusCallbackMethod(statusCallbackMethod: JsonField<StatusCallbackMethod>) = apply {
            body.statusCallbackMethod(statusCallbackMethod)
        }

        /**
         * Whether to trim any leading and trailing silence from the recording. Defaults to
         * `trim-silence`.
         */
        fun trim(trim: Trim) = apply { body.trim(trim) }

        /**
         * Sets [Builder.trim] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trim] with a well-typed [Trim] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun trim(trim: JsonField<Trim>) = apply { body.trim(trim) }

        /** The URL from which Telnyx will retrieve the TeXML call instructions. */
        fun url(url: String) = apply { body.url(url) }

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { body.url(url) }

        /**
         * HTTP request type used for `Url`. The default value is inherited from TeXML Application
         * setting.
         */
        fun urlMethod(urlMethod: UrlMethod) = apply { body.urlMethod(urlMethod) }

        /**
         * Sets [Builder.urlMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.urlMethod] with a well-typed [UrlMethod] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun urlMethod(urlMethod: JsonField<UrlMethod>) = apply { body.urlMethod(urlMethod) }

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
         * Returns an immutable instance of [CallCallsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .applicationSid()
         * .from()
         * .to()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CallCallsParams =
            CallCallsParams(
                accountSid,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> accountSid ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val applicationSid: JsonField<String>,
        private val from: JsonField<String>,
        private val to: JsonField<String>,
        private val asyncAmd: JsonField<Boolean>,
        private val asyncAmdStatusCallback: JsonField<String>,
        private val asyncAmdStatusCallbackMethod: JsonField<AsyncAmdStatusCallbackMethod>,
        private val callerId: JsonField<String>,
        private val cancelPlaybackOnDetectMessageEnd: JsonField<Boolean>,
        private val cancelPlaybackOnMachineDetection: JsonField<Boolean>,
        private val detectionMode: JsonField<DetectionMode>,
        private val fallbackUrl: JsonField<String>,
        private val machineDetection: JsonField<MachineDetection>,
        private val machineDetectionSilenceTimeout: JsonField<Long>,
        private val machineDetectionSpeechEndThreshold: JsonField<Long>,
        private val machineDetectionSpeechThreshold: JsonField<Long>,
        private val machineDetectionTimeout: JsonField<Long>,
        private val preferredCodecs: JsonField<String>,
        private val record: JsonField<Boolean>,
        private val recordingChannels: JsonField<RecordingChannels>,
        private val recordingStatusCallback: JsonField<String>,
        private val recordingStatusCallbackEvent: JsonField<String>,
        private val recordingStatusCallbackMethod: JsonField<RecordingStatusCallbackMethod>,
        private val recordingTimeout: JsonField<Long>,
        private val recordingTrack: JsonField<RecordingTrack>,
        private val sendRecordingUrl: JsonField<Boolean>,
        private val sipAuthPassword: JsonField<String>,
        private val sipAuthUsername: JsonField<String>,
        private val statusCallback: JsonField<String>,
        private val statusCallbackEvent: JsonField<StatusCallbackEvent>,
        private val statusCallbackMethod: JsonField<StatusCallbackMethod>,
        private val trim: JsonField<Trim>,
        private val url: JsonField<String>,
        private val urlMethod: JsonField<UrlMethod>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("ApplicationSid")
            @ExcludeMissing
            applicationSid: JsonField<String> = JsonMissing.of(),
            @JsonProperty("From") @ExcludeMissing from: JsonField<String> = JsonMissing.of(),
            @JsonProperty("To") @ExcludeMissing to: JsonField<String> = JsonMissing.of(),
            @JsonProperty("AsyncAmd")
            @ExcludeMissing
            asyncAmd: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("AsyncAmdStatusCallback")
            @ExcludeMissing
            asyncAmdStatusCallback: JsonField<String> = JsonMissing.of(),
            @JsonProperty("AsyncAmdStatusCallbackMethod")
            @ExcludeMissing
            asyncAmdStatusCallbackMethod: JsonField<AsyncAmdStatusCallbackMethod> =
                JsonMissing.of(),
            @JsonProperty("CallerId")
            @ExcludeMissing
            callerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("CancelPlaybackOnDetectMessageEnd")
            @ExcludeMissing
            cancelPlaybackOnDetectMessageEnd: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("CancelPlaybackOnMachineDetection")
            @ExcludeMissing
            cancelPlaybackOnMachineDetection: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("DetectionMode")
            @ExcludeMissing
            detectionMode: JsonField<DetectionMode> = JsonMissing.of(),
            @JsonProperty("FallbackUrl")
            @ExcludeMissing
            fallbackUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("MachineDetection")
            @ExcludeMissing
            machineDetection: JsonField<MachineDetection> = JsonMissing.of(),
            @JsonProperty("MachineDetectionSilenceTimeout")
            @ExcludeMissing
            machineDetectionSilenceTimeout: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("MachineDetectionSpeechEndThreshold")
            @ExcludeMissing
            machineDetectionSpeechEndThreshold: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("MachineDetectionSpeechThreshold")
            @ExcludeMissing
            machineDetectionSpeechThreshold: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("MachineDetectionTimeout")
            @ExcludeMissing
            machineDetectionTimeout: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("PreferredCodecs")
            @ExcludeMissing
            preferredCodecs: JsonField<String> = JsonMissing.of(),
            @JsonProperty("Record") @ExcludeMissing record: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("RecordingChannels")
            @ExcludeMissing
            recordingChannels: JsonField<RecordingChannels> = JsonMissing.of(),
            @JsonProperty("RecordingStatusCallback")
            @ExcludeMissing
            recordingStatusCallback: JsonField<String> = JsonMissing.of(),
            @JsonProperty("RecordingStatusCallbackEvent")
            @ExcludeMissing
            recordingStatusCallbackEvent: JsonField<String> = JsonMissing.of(),
            @JsonProperty("RecordingStatusCallbackMethod")
            @ExcludeMissing
            recordingStatusCallbackMethod: JsonField<RecordingStatusCallbackMethod> =
                JsonMissing.of(),
            @JsonProperty("RecordingTimeout")
            @ExcludeMissing
            recordingTimeout: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("RecordingTrack")
            @ExcludeMissing
            recordingTrack: JsonField<RecordingTrack> = JsonMissing.of(),
            @JsonProperty("SendRecordingUrl")
            @ExcludeMissing
            sendRecordingUrl: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("SipAuthPassword")
            @ExcludeMissing
            sipAuthPassword: JsonField<String> = JsonMissing.of(),
            @JsonProperty("SipAuthUsername")
            @ExcludeMissing
            sipAuthUsername: JsonField<String> = JsonMissing.of(),
            @JsonProperty("StatusCallback")
            @ExcludeMissing
            statusCallback: JsonField<String> = JsonMissing.of(),
            @JsonProperty("StatusCallbackEvent")
            @ExcludeMissing
            statusCallbackEvent: JsonField<StatusCallbackEvent> = JsonMissing.of(),
            @JsonProperty("StatusCallbackMethod")
            @ExcludeMissing
            statusCallbackMethod: JsonField<StatusCallbackMethod> = JsonMissing.of(),
            @JsonProperty("Trim") @ExcludeMissing trim: JsonField<Trim> = JsonMissing.of(),
            @JsonProperty("Url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
            @JsonProperty("UrlMethod")
            @ExcludeMissing
            urlMethod: JsonField<UrlMethod> = JsonMissing.of(),
        ) : this(
            applicationSid,
            from,
            to,
            asyncAmd,
            asyncAmdStatusCallback,
            asyncAmdStatusCallbackMethod,
            callerId,
            cancelPlaybackOnDetectMessageEnd,
            cancelPlaybackOnMachineDetection,
            detectionMode,
            fallbackUrl,
            machineDetection,
            machineDetectionSilenceTimeout,
            machineDetectionSpeechEndThreshold,
            machineDetectionSpeechThreshold,
            machineDetectionTimeout,
            preferredCodecs,
            record,
            recordingChannels,
            recordingStatusCallback,
            recordingStatusCallbackEvent,
            recordingStatusCallbackMethod,
            recordingTimeout,
            recordingTrack,
            sendRecordingUrl,
            sipAuthPassword,
            sipAuthUsername,
            statusCallback,
            statusCallbackEvent,
            statusCallbackMethod,
            trim,
            url,
            urlMethod,
            mutableMapOf(),
        )

        /**
         * The ID of the TeXML Application.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun applicationSid(): String = applicationSid.getRequired("ApplicationSid")

        /**
         * The phone number of the party that initiated the call. Phone numbers are formatted with a
         * `+` and country code.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun from(): String = from.getRequired("From")

        /**
         * The phone number of the called party. Phone numbers are formatted with a `+` and country
         * code.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun to(): String = to.getRequired("To")

        /**
         * Select whether to perform answering machine detection in the background. By default
         * execution is blocked until Answering Machine Detection is completed.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun asyncAmd(): Optional<Boolean> = asyncAmd.getOptional("AsyncAmd")

        /**
         * URL destination for Telnyx to send AMD callback events to for the call.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun asyncAmdStatusCallback(): Optional<String> =
            asyncAmdStatusCallback.getOptional("AsyncAmdStatusCallback")

        /**
         * HTTP request type used for `AsyncAmdStatusCallback`. The default value is inherited from
         * TeXML Application setting.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun asyncAmdStatusCallbackMethod(): Optional<AsyncAmdStatusCallbackMethod> =
            asyncAmdStatusCallbackMethod.getOptional("AsyncAmdStatusCallbackMethod")

        /**
         * To be used as the caller id name (SIP From Display Name) presented to the destination
         * (`To` number). The string should have a maximum of 128 characters, containing only
         * letters, numbers, spaces, and `-_~!.+` special characters. If ommited, the display name
         * will be the same as the number in the `From` field.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun callerId(): Optional<String> = callerId.getOptional("CallerId")

        /**
         * Whether to cancel ongoing playback on `greeting ended` detection. Defaults to `true`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cancelPlaybackOnDetectMessageEnd(): Optional<Boolean> =
            cancelPlaybackOnDetectMessageEnd.getOptional("CancelPlaybackOnDetectMessageEnd")

        /**
         * Whether to cancel ongoing playback on `machine` detection. Defaults to `true`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cancelPlaybackOnMachineDetection(): Optional<Boolean> =
            cancelPlaybackOnMachineDetection.getOptional("CancelPlaybackOnMachineDetection")

        /**
         * Allows you to chose between Premium and Standard detections.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun detectionMode(): Optional<DetectionMode> = detectionMode.getOptional("DetectionMode")

        /**
         * A failover URL for which Telnyx will retrieve the TeXML call instructions if the `Url` is
         * not responding.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun fallbackUrl(): Optional<String> = fallbackUrl.getOptional("FallbackUrl")

        /**
         * Enables Answering Machine Detection.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun machineDetection(): Optional<MachineDetection> =
            machineDetection.getOptional("MachineDetection")

        /**
         * If initial silence duration is greater than this value, consider it a machine. Ignored
         * when `premium` detection is used.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun machineDetectionSilenceTimeout(): Optional<Long> =
            machineDetectionSilenceTimeout.getOptional("MachineDetectionSilenceTimeout")

        /**
         * Silence duration threshold after a greeting message or voice for it be considered human.
         * Ignored when `premium` detection is used.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun machineDetectionSpeechEndThreshold(): Optional<Long> =
            machineDetectionSpeechEndThreshold.getOptional("MachineDetectionSpeechEndThreshold")

        /**
         * Maximum threshold of a human greeting. If greeting longer than this value, considered
         * machine. Ignored when `premium` detection is used.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun machineDetectionSpeechThreshold(): Optional<Long> =
            machineDetectionSpeechThreshold.getOptional("MachineDetectionSpeechThreshold")

        /**
         * Maximum timeout threshold in milliseconds for overall detection.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun machineDetectionTimeout(): Optional<Long> =
            machineDetectionTimeout.getOptional("MachineDetectionTimeout")

        /**
         * The list of comma-separated codecs to be offered on a call.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun preferredCodecs(): Optional<String> = preferredCodecs.getOptional("PreferredCodecs")

        /**
         * Whether to record the entire participant's call leg. Defaults to `false`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun record(): Optional<Boolean> = record.getOptional("Record")

        /**
         * The number of channels in the final recording. Defaults to `mono`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordingChannels(): Optional<RecordingChannels> =
            recordingChannels.getOptional("RecordingChannels")

        /**
         * The URL the recording callbacks will be sent to.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordingStatusCallback(): Optional<String> =
            recordingStatusCallback.getOptional("RecordingStatusCallback")

        /**
         * The changes to the recording's state that should generate a call to
         * `RecoridngStatusCallback`. Can be: `in-progress`, `completed` and `absent`. Separate
         * multiple values with a space. Defaults to `completed`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordingStatusCallbackEvent(): Optional<String> =
            recordingStatusCallbackEvent.getOptional("RecordingStatusCallbackEvent")

        /**
         * HTTP request type used for `RecordingStatusCallback`. Defaults to `POST`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordingStatusCallbackMethod(): Optional<RecordingStatusCallbackMethod> =
            recordingStatusCallbackMethod.getOptional("RecordingStatusCallbackMethod")

        /**
         * The number of seconds that Telnyx will wait for the recording to be stopped if silence is
         * detected. The timer only starts when the speech is detected. Please note that the
         * transcription is used to detect silence and the related charge will be applied. The
         * minimum value is 0. The default value is 0 (infinite)
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordingTimeout(): Optional<Long> = recordingTimeout.getOptional("RecordingTimeout")

        /**
         * The audio track to record for the call. The default is `both`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordingTrack(): Optional<RecordingTrack> =
            recordingTrack.getOptional("RecordingTrack")

        /**
         * Whether to send RecordingUrl in webhooks.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sendRecordingUrl(): Optional<Boolean> = sendRecordingUrl.getOptional("SendRecordingUrl")

        /**
         * The password to use for SIP authentication.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sipAuthPassword(): Optional<String> = sipAuthPassword.getOptional("SipAuthPassword")

        /**
         * The username to use for SIP authentication.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sipAuthUsername(): Optional<String> = sipAuthUsername.getOptional("SipAuthUsername")

        /**
         * URL destination for Telnyx to send status callback events to for the call.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun statusCallback(): Optional<String> = statusCallback.getOptional("StatusCallback")

        /**
         * The call events for which Telnyx should send a webhook. Multiple events can be defined
         * when separated by a space.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun statusCallbackEvent(): Optional<StatusCallbackEvent> =
            statusCallbackEvent.getOptional("StatusCallbackEvent")

        /**
         * HTTP request type used for `StatusCallback`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun statusCallbackMethod(): Optional<StatusCallbackMethod> =
            statusCallbackMethod.getOptional("StatusCallbackMethod")

        /**
         * Whether to trim any leading and trailing silence from the recording. Defaults to
         * `trim-silence`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun trim(): Optional<Trim> = trim.getOptional("Trim")

        /**
         * The URL from which Telnyx will retrieve the TeXML call instructions.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun url(): Optional<String> = url.getOptional("Url")

        /**
         * HTTP request type used for `Url`. The default value is inherited from TeXML Application
         * setting.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun urlMethod(): Optional<UrlMethod> = urlMethod.getOptional("UrlMethod")

        /**
         * Returns the raw JSON value of [applicationSid].
         *
         * Unlike [applicationSid], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ApplicationSid")
        @ExcludeMissing
        fun _applicationSid(): JsonField<String> = applicationSid

        /**
         * Returns the raw JSON value of [from].
         *
         * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("From") @ExcludeMissing fun _from(): JsonField<String> = from

        /**
         * Returns the raw JSON value of [to].
         *
         * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("To") @ExcludeMissing fun _to(): JsonField<String> = to

        /**
         * Returns the raw JSON value of [asyncAmd].
         *
         * Unlike [asyncAmd], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("AsyncAmd") @ExcludeMissing fun _asyncAmd(): JsonField<Boolean> = asyncAmd

        /**
         * Returns the raw JSON value of [asyncAmdStatusCallback].
         *
         * Unlike [asyncAmdStatusCallback], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("AsyncAmdStatusCallback")
        @ExcludeMissing
        fun _asyncAmdStatusCallback(): JsonField<String> = asyncAmdStatusCallback

        /**
         * Returns the raw JSON value of [asyncAmdStatusCallbackMethod].
         *
         * Unlike [asyncAmdStatusCallbackMethod], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("AsyncAmdStatusCallbackMethod")
        @ExcludeMissing
        fun _asyncAmdStatusCallbackMethod(): JsonField<AsyncAmdStatusCallbackMethod> =
            asyncAmdStatusCallbackMethod

        /**
         * Returns the raw JSON value of [callerId].
         *
         * Unlike [callerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("CallerId") @ExcludeMissing fun _callerId(): JsonField<String> = callerId

        /**
         * Returns the raw JSON value of [cancelPlaybackOnDetectMessageEnd].
         *
         * Unlike [cancelPlaybackOnDetectMessageEnd], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("CancelPlaybackOnDetectMessageEnd")
        @ExcludeMissing
        fun _cancelPlaybackOnDetectMessageEnd(): JsonField<Boolean> =
            cancelPlaybackOnDetectMessageEnd

        /**
         * Returns the raw JSON value of [cancelPlaybackOnMachineDetection].
         *
         * Unlike [cancelPlaybackOnMachineDetection], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("CancelPlaybackOnMachineDetection")
        @ExcludeMissing
        fun _cancelPlaybackOnMachineDetection(): JsonField<Boolean> =
            cancelPlaybackOnMachineDetection

        /**
         * Returns the raw JSON value of [detectionMode].
         *
         * Unlike [detectionMode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("DetectionMode")
        @ExcludeMissing
        fun _detectionMode(): JsonField<DetectionMode> = detectionMode

        /**
         * Returns the raw JSON value of [fallbackUrl].
         *
         * Unlike [fallbackUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("FallbackUrl")
        @ExcludeMissing
        fun _fallbackUrl(): JsonField<String> = fallbackUrl

        /**
         * Returns the raw JSON value of [machineDetection].
         *
         * Unlike [machineDetection], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("MachineDetection")
        @ExcludeMissing
        fun _machineDetection(): JsonField<MachineDetection> = machineDetection

        /**
         * Returns the raw JSON value of [machineDetectionSilenceTimeout].
         *
         * Unlike [machineDetectionSilenceTimeout], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("MachineDetectionSilenceTimeout")
        @ExcludeMissing
        fun _machineDetectionSilenceTimeout(): JsonField<Long> = machineDetectionSilenceTimeout

        /**
         * Returns the raw JSON value of [machineDetectionSpeechEndThreshold].
         *
         * Unlike [machineDetectionSpeechEndThreshold], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("MachineDetectionSpeechEndThreshold")
        @ExcludeMissing
        fun _machineDetectionSpeechEndThreshold(): JsonField<Long> =
            machineDetectionSpeechEndThreshold

        /**
         * Returns the raw JSON value of [machineDetectionSpeechThreshold].
         *
         * Unlike [machineDetectionSpeechThreshold], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("MachineDetectionSpeechThreshold")
        @ExcludeMissing
        fun _machineDetectionSpeechThreshold(): JsonField<Long> = machineDetectionSpeechThreshold

        /**
         * Returns the raw JSON value of [machineDetectionTimeout].
         *
         * Unlike [machineDetectionTimeout], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("MachineDetectionTimeout")
        @ExcludeMissing
        fun _machineDetectionTimeout(): JsonField<Long> = machineDetectionTimeout

        /**
         * Returns the raw JSON value of [preferredCodecs].
         *
         * Unlike [preferredCodecs], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("PreferredCodecs")
        @ExcludeMissing
        fun _preferredCodecs(): JsonField<String> = preferredCodecs

        /**
         * Returns the raw JSON value of [record].
         *
         * Unlike [record], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("Record") @ExcludeMissing fun _record(): JsonField<Boolean> = record

        /**
         * Returns the raw JSON value of [recordingChannels].
         *
         * Unlike [recordingChannels], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("RecordingChannels")
        @ExcludeMissing
        fun _recordingChannels(): JsonField<RecordingChannels> = recordingChannels

        /**
         * Returns the raw JSON value of [recordingStatusCallback].
         *
         * Unlike [recordingStatusCallback], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("RecordingStatusCallback")
        @ExcludeMissing
        fun _recordingStatusCallback(): JsonField<String> = recordingStatusCallback

        /**
         * Returns the raw JSON value of [recordingStatusCallbackEvent].
         *
         * Unlike [recordingStatusCallbackEvent], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("RecordingStatusCallbackEvent")
        @ExcludeMissing
        fun _recordingStatusCallbackEvent(): JsonField<String> = recordingStatusCallbackEvent

        /**
         * Returns the raw JSON value of [recordingStatusCallbackMethod].
         *
         * Unlike [recordingStatusCallbackMethod], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("RecordingStatusCallbackMethod")
        @ExcludeMissing
        fun _recordingStatusCallbackMethod(): JsonField<RecordingStatusCallbackMethod> =
            recordingStatusCallbackMethod

        /**
         * Returns the raw JSON value of [recordingTimeout].
         *
         * Unlike [recordingTimeout], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("RecordingTimeout")
        @ExcludeMissing
        fun _recordingTimeout(): JsonField<Long> = recordingTimeout

        /**
         * Returns the raw JSON value of [recordingTrack].
         *
         * Unlike [recordingTrack], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("RecordingTrack")
        @ExcludeMissing
        fun _recordingTrack(): JsonField<RecordingTrack> = recordingTrack

        /**
         * Returns the raw JSON value of [sendRecordingUrl].
         *
         * Unlike [sendRecordingUrl], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("SendRecordingUrl")
        @ExcludeMissing
        fun _sendRecordingUrl(): JsonField<Boolean> = sendRecordingUrl

        /**
         * Returns the raw JSON value of [sipAuthPassword].
         *
         * Unlike [sipAuthPassword], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("SipAuthPassword")
        @ExcludeMissing
        fun _sipAuthPassword(): JsonField<String> = sipAuthPassword

        /**
         * Returns the raw JSON value of [sipAuthUsername].
         *
         * Unlike [sipAuthUsername], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("SipAuthUsername")
        @ExcludeMissing
        fun _sipAuthUsername(): JsonField<String> = sipAuthUsername

        /**
         * Returns the raw JSON value of [statusCallback].
         *
         * Unlike [statusCallback], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("StatusCallback")
        @ExcludeMissing
        fun _statusCallback(): JsonField<String> = statusCallback

        /**
         * Returns the raw JSON value of [statusCallbackEvent].
         *
         * Unlike [statusCallbackEvent], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("StatusCallbackEvent")
        @ExcludeMissing
        fun _statusCallbackEvent(): JsonField<StatusCallbackEvent> = statusCallbackEvent

        /**
         * Returns the raw JSON value of [statusCallbackMethod].
         *
         * Unlike [statusCallbackMethod], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("StatusCallbackMethod")
        @ExcludeMissing
        fun _statusCallbackMethod(): JsonField<StatusCallbackMethod> = statusCallbackMethod

        /**
         * Returns the raw JSON value of [trim].
         *
         * Unlike [trim], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("Trim") @ExcludeMissing fun _trim(): JsonField<Trim> = trim

        /**
         * Returns the raw JSON value of [url].
         *
         * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("Url") @ExcludeMissing fun _url(): JsonField<String> = url

        /**
         * Returns the raw JSON value of [urlMethod].
         *
         * Unlike [urlMethod], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("UrlMethod")
        @ExcludeMissing
        fun _urlMethod(): JsonField<UrlMethod> = urlMethod

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
             * .applicationSid()
             * .from()
             * .to()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var applicationSid: JsonField<String>? = null
            private var from: JsonField<String>? = null
            private var to: JsonField<String>? = null
            private var asyncAmd: JsonField<Boolean> = JsonMissing.of()
            private var asyncAmdStatusCallback: JsonField<String> = JsonMissing.of()
            private var asyncAmdStatusCallbackMethod: JsonField<AsyncAmdStatusCallbackMethod> =
                JsonMissing.of()
            private var callerId: JsonField<String> = JsonMissing.of()
            private var cancelPlaybackOnDetectMessageEnd: JsonField<Boolean> = JsonMissing.of()
            private var cancelPlaybackOnMachineDetection: JsonField<Boolean> = JsonMissing.of()
            private var detectionMode: JsonField<DetectionMode> = JsonMissing.of()
            private var fallbackUrl: JsonField<String> = JsonMissing.of()
            private var machineDetection: JsonField<MachineDetection> = JsonMissing.of()
            private var machineDetectionSilenceTimeout: JsonField<Long> = JsonMissing.of()
            private var machineDetectionSpeechEndThreshold: JsonField<Long> = JsonMissing.of()
            private var machineDetectionSpeechThreshold: JsonField<Long> = JsonMissing.of()
            private var machineDetectionTimeout: JsonField<Long> = JsonMissing.of()
            private var preferredCodecs: JsonField<String> = JsonMissing.of()
            private var record: JsonField<Boolean> = JsonMissing.of()
            private var recordingChannels: JsonField<RecordingChannels> = JsonMissing.of()
            private var recordingStatusCallback: JsonField<String> = JsonMissing.of()
            private var recordingStatusCallbackEvent: JsonField<String> = JsonMissing.of()
            private var recordingStatusCallbackMethod: JsonField<RecordingStatusCallbackMethod> =
                JsonMissing.of()
            private var recordingTimeout: JsonField<Long> = JsonMissing.of()
            private var recordingTrack: JsonField<RecordingTrack> = JsonMissing.of()
            private var sendRecordingUrl: JsonField<Boolean> = JsonMissing.of()
            private var sipAuthPassword: JsonField<String> = JsonMissing.of()
            private var sipAuthUsername: JsonField<String> = JsonMissing.of()
            private var statusCallback: JsonField<String> = JsonMissing.of()
            private var statusCallbackEvent: JsonField<StatusCallbackEvent> = JsonMissing.of()
            private var statusCallbackMethod: JsonField<StatusCallbackMethod> = JsonMissing.of()
            private var trim: JsonField<Trim> = JsonMissing.of()
            private var url: JsonField<String> = JsonMissing.of()
            private var urlMethod: JsonField<UrlMethod> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                applicationSid = body.applicationSid
                from = body.from
                to = body.to
                asyncAmd = body.asyncAmd
                asyncAmdStatusCallback = body.asyncAmdStatusCallback
                asyncAmdStatusCallbackMethod = body.asyncAmdStatusCallbackMethod
                callerId = body.callerId
                cancelPlaybackOnDetectMessageEnd = body.cancelPlaybackOnDetectMessageEnd
                cancelPlaybackOnMachineDetection = body.cancelPlaybackOnMachineDetection
                detectionMode = body.detectionMode
                fallbackUrl = body.fallbackUrl
                machineDetection = body.machineDetection
                machineDetectionSilenceTimeout = body.machineDetectionSilenceTimeout
                machineDetectionSpeechEndThreshold = body.machineDetectionSpeechEndThreshold
                machineDetectionSpeechThreshold = body.machineDetectionSpeechThreshold
                machineDetectionTimeout = body.machineDetectionTimeout
                preferredCodecs = body.preferredCodecs
                record = body.record
                recordingChannels = body.recordingChannels
                recordingStatusCallback = body.recordingStatusCallback
                recordingStatusCallbackEvent = body.recordingStatusCallbackEvent
                recordingStatusCallbackMethod = body.recordingStatusCallbackMethod
                recordingTimeout = body.recordingTimeout
                recordingTrack = body.recordingTrack
                sendRecordingUrl = body.sendRecordingUrl
                sipAuthPassword = body.sipAuthPassword
                sipAuthUsername = body.sipAuthUsername
                statusCallback = body.statusCallback
                statusCallbackEvent = body.statusCallbackEvent
                statusCallbackMethod = body.statusCallbackMethod
                trim = body.trim
                url = body.url
                urlMethod = body.urlMethod
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The ID of the TeXML Application. */
            fun applicationSid(applicationSid: String) =
                applicationSid(JsonField.of(applicationSid))

            /**
             * Sets [Builder.applicationSid] to an arbitrary JSON value.
             *
             * You should usually call [Builder.applicationSid] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun applicationSid(applicationSid: JsonField<String>) = apply {
                this.applicationSid = applicationSid
            }

            /**
             * The phone number of the party that initiated the call. Phone numbers are formatted
             * with a `+` and country code.
             */
            fun from(from: String) = from(JsonField.of(from))

            /**
             * Sets [Builder.from] to an arbitrary JSON value.
             *
             * You should usually call [Builder.from] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun from(from: JsonField<String>) = apply { this.from = from }

            /**
             * The phone number of the called party. Phone numbers are formatted with a `+` and
             * country code.
             */
            fun to(to: String) = to(JsonField.of(to))

            /**
             * Sets [Builder.to] to an arbitrary JSON value.
             *
             * You should usually call [Builder.to] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun to(to: JsonField<String>) = apply { this.to = to }

            /**
             * Select whether to perform answering machine detection in the background. By default
             * execution is blocked until Answering Machine Detection is completed.
             */
            fun asyncAmd(asyncAmd: Boolean) = asyncAmd(JsonField.of(asyncAmd))

            /**
             * Sets [Builder.asyncAmd] to an arbitrary JSON value.
             *
             * You should usually call [Builder.asyncAmd] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun asyncAmd(asyncAmd: JsonField<Boolean>) = apply { this.asyncAmd = asyncAmd }

            /** URL destination for Telnyx to send AMD callback events to for the call. */
            fun asyncAmdStatusCallback(asyncAmdStatusCallback: String) =
                asyncAmdStatusCallback(JsonField.of(asyncAmdStatusCallback))

            /**
             * Sets [Builder.asyncAmdStatusCallback] to an arbitrary JSON value.
             *
             * You should usually call [Builder.asyncAmdStatusCallback] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun asyncAmdStatusCallback(asyncAmdStatusCallback: JsonField<String>) = apply {
                this.asyncAmdStatusCallback = asyncAmdStatusCallback
            }

            /**
             * HTTP request type used for `AsyncAmdStatusCallback`. The default value is inherited
             * from TeXML Application setting.
             */
            fun asyncAmdStatusCallbackMethod(
                asyncAmdStatusCallbackMethod: AsyncAmdStatusCallbackMethod
            ) = asyncAmdStatusCallbackMethod(JsonField.of(asyncAmdStatusCallbackMethod))

            /**
             * Sets [Builder.asyncAmdStatusCallbackMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.asyncAmdStatusCallbackMethod] with a well-typed
             * [AsyncAmdStatusCallbackMethod] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun asyncAmdStatusCallbackMethod(
                asyncAmdStatusCallbackMethod: JsonField<AsyncAmdStatusCallbackMethod>
            ) = apply { this.asyncAmdStatusCallbackMethod = asyncAmdStatusCallbackMethod }

            /**
             * To be used as the caller id name (SIP From Display Name) presented to the destination
             * (`To` number). The string should have a maximum of 128 characters, containing only
             * letters, numbers, spaces, and `-_~!.+` special characters. If ommited, the display
             * name will be the same as the number in the `From` field.
             */
            fun callerId(callerId: String) = callerId(JsonField.of(callerId))

            /**
             * Sets [Builder.callerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callerId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun callerId(callerId: JsonField<String>) = apply { this.callerId = callerId }

            /**
             * Whether to cancel ongoing playback on `greeting ended` detection. Defaults to `true`.
             */
            fun cancelPlaybackOnDetectMessageEnd(cancelPlaybackOnDetectMessageEnd: Boolean) =
                cancelPlaybackOnDetectMessageEnd(JsonField.of(cancelPlaybackOnDetectMessageEnd))

            /**
             * Sets [Builder.cancelPlaybackOnDetectMessageEnd] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cancelPlaybackOnDetectMessageEnd] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun cancelPlaybackOnDetectMessageEnd(
                cancelPlaybackOnDetectMessageEnd: JsonField<Boolean>
            ) = apply { this.cancelPlaybackOnDetectMessageEnd = cancelPlaybackOnDetectMessageEnd }

            /** Whether to cancel ongoing playback on `machine` detection. Defaults to `true`. */
            fun cancelPlaybackOnMachineDetection(cancelPlaybackOnMachineDetection: Boolean) =
                cancelPlaybackOnMachineDetection(JsonField.of(cancelPlaybackOnMachineDetection))

            /**
             * Sets [Builder.cancelPlaybackOnMachineDetection] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cancelPlaybackOnMachineDetection] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun cancelPlaybackOnMachineDetection(
                cancelPlaybackOnMachineDetection: JsonField<Boolean>
            ) = apply { this.cancelPlaybackOnMachineDetection = cancelPlaybackOnMachineDetection }

            /** Allows you to chose between Premium and Standard detections. */
            fun detectionMode(detectionMode: DetectionMode) =
                detectionMode(JsonField.of(detectionMode))

            /**
             * Sets [Builder.detectionMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.detectionMode] with a well-typed [DetectionMode]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun detectionMode(detectionMode: JsonField<DetectionMode>) = apply {
                this.detectionMode = detectionMode
            }

            /**
             * A failover URL for which Telnyx will retrieve the TeXML call instructions if the
             * `Url` is not responding.
             */
            fun fallbackUrl(fallbackUrl: String) = fallbackUrl(JsonField.of(fallbackUrl))

            /**
             * Sets [Builder.fallbackUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fallbackUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fallbackUrl(fallbackUrl: JsonField<String>) = apply {
                this.fallbackUrl = fallbackUrl
            }

            /** Enables Answering Machine Detection. */
            fun machineDetection(machineDetection: MachineDetection) =
                machineDetection(JsonField.of(machineDetection))

            /**
             * Sets [Builder.machineDetection] to an arbitrary JSON value.
             *
             * You should usually call [Builder.machineDetection] with a well-typed
             * [MachineDetection] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun machineDetection(machineDetection: JsonField<MachineDetection>) = apply {
                this.machineDetection = machineDetection
            }

            /**
             * If initial silence duration is greater than this value, consider it a machine.
             * Ignored when `premium` detection is used.
             */
            fun machineDetectionSilenceTimeout(machineDetectionSilenceTimeout: Long) =
                machineDetectionSilenceTimeout(JsonField.of(machineDetectionSilenceTimeout))

            /**
             * Sets [Builder.machineDetectionSilenceTimeout] to an arbitrary JSON value.
             *
             * You should usually call [Builder.machineDetectionSilenceTimeout] with a well-typed
             * [Long] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun machineDetectionSilenceTimeout(machineDetectionSilenceTimeout: JsonField<Long>) =
                apply {
                    this.machineDetectionSilenceTimeout = machineDetectionSilenceTimeout
                }

            /**
             * Silence duration threshold after a greeting message or voice for it be considered
             * human. Ignored when `premium` detection is used.
             */
            fun machineDetectionSpeechEndThreshold(machineDetectionSpeechEndThreshold: Long) =
                machineDetectionSpeechEndThreshold(JsonField.of(machineDetectionSpeechEndThreshold))

            /**
             * Sets [Builder.machineDetectionSpeechEndThreshold] to an arbitrary JSON value.
             *
             * You should usually call [Builder.machineDetectionSpeechEndThreshold] with a
             * well-typed [Long] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun machineDetectionSpeechEndThreshold(
                machineDetectionSpeechEndThreshold: JsonField<Long>
            ) = apply {
                this.machineDetectionSpeechEndThreshold = machineDetectionSpeechEndThreshold
            }

            /**
             * Maximum threshold of a human greeting. If greeting longer than this value, considered
             * machine. Ignored when `premium` detection is used.
             */
            fun machineDetectionSpeechThreshold(machineDetectionSpeechThreshold: Long) =
                machineDetectionSpeechThreshold(JsonField.of(machineDetectionSpeechThreshold))

            /**
             * Sets [Builder.machineDetectionSpeechThreshold] to an arbitrary JSON value.
             *
             * You should usually call [Builder.machineDetectionSpeechThreshold] with a well-typed
             * [Long] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun machineDetectionSpeechThreshold(machineDetectionSpeechThreshold: JsonField<Long>) =
                apply {
                    this.machineDetectionSpeechThreshold = machineDetectionSpeechThreshold
                }

            /** Maximum timeout threshold in milliseconds for overall detection. */
            fun machineDetectionTimeout(machineDetectionTimeout: Long) =
                machineDetectionTimeout(JsonField.of(machineDetectionTimeout))

            /**
             * Sets [Builder.machineDetectionTimeout] to an arbitrary JSON value.
             *
             * You should usually call [Builder.machineDetectionTimeout] with a well-typed [Long]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun machineDetectionTimeout(machineDetectionTimeout: JsonField<Long>) = apply {
                this.machineDetectionTimeout = machineDetectionTimeout
            }

            /** The list of comma-separated codecs to be offered on a call. */
            fun preferredCodecs(preferredCodecs: String) =
                preferredCodecs(JsonField.of(preferredCodecs))

            /**
             * Sets [Builder.preferredCodecs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.preferredCodecs] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun preferredCodecs(preferredCodecs: JsonField<String>) = apply {
                this.preferredCodecs = preferredCodecs
            }

            /** Whether to record the entire participant's call leg. Defaults to `false`. */
            fun record(record: Boolean) = record(JsonField.of(record))

            /**
             * Sets [Builder.record] to an arbitrary JSON value.
             *
             * You should usually call [Builder.record] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun record(record: JsonField<Boolean>) = apply { this.record = record }

            /** The number of channels in the final recording. Defaults to `mono`. */
            fun recordingChannels(recordingChannels: RecordingChannels) =
                recordingChannels(JsonField.of(recordingChannels))

            /**
             * Sets [Builder.recordingChannels] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordingChannels] with a well-typed
             * [RecordingChannels] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun recordingChannels(recordingChannels: JsonField<RecordingChannels>) = apply {
                this.recordingChannels = recordingChannels
            }

            /** The URL the recording callbacks will be sent to. */
            fun recordingStatusCallback(recordingStatusCallback: String) =
                recordingStatusCallback(JsonField.of(recordingStatusCallback))

            /**
             * Sets [Builder.recordingStatusCallback] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordingStatusCallback] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun recordingStatusCallback(recordingStatusCallback: JsonField<String>) = apply {
                this.recordingStatusCallback = recordingStatusCallback
            }

            /**
             * The changes to the recording's state that should generate a call to
             * `RecoridngStatusCallback`. Can be: `in-progress`, `completed` and `absent`. Separate
             * multiple values with a space. Defaults to `completed`.
             */
            fun recordingStatusCallbackEvent(recordingStatusCallbackEvent: String) =
                recordingStatusCallbackEvent(JsonField.of(recordingStatusCallbackEvent))

            /**
             * Sets [Builder.recordingStatusCallbackEvent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordingStatusCallbackEvent] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun recordingStatusCallbackEvent(recordingStatusCallbackEvent: JsonField<String>) =
                apply {
                    this.recordingStatusCallbackEvent = recordingStatusCallbackEvent
                }

            /** HTTP request type used for `RecordingStatusCallback`. Defaults to `POST`. */
            fun recordingStatusCallbackMethod(
                recordingStatusCallbackMethod: RecordingStatusCallbackMethod
            ) = recordingStatusCallbackMethod(JsonField.of(recordingStatusCallbackMethod))

            /**
             * Sets [Builder.recordingStatusCallbackMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordingStatusCallbackMethod] with a well-typed
             * [RecordingStatusCallbackMethod] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun recordingStatusCallbackMethod(
                recordingStatusCallbackMethod: JsonField<RecordingStatusCallbackMethod>
            ) = apply { this.recordingStatusCallbackMethod = recordingStatusCallbackMethod }

            /**
             * The number of seconds that Telnyx will wait for the recording to be stopped if
             * silence is detected. The timer only starts when the speech is detected. Please note
             * that the transcription is used to detect silence and the related charge will be
             * applied. The minimum value is 0. The default value is 0 (infinite)
             */
            fun recordingTimeout(recordingTimeout: Long) =
                recordingTimeout(JsonField.of(recordingTimeout))

            /**
             * Sets [Builder.recordingTimeout] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordingTimeout] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordingTimeout(recordingTimeout: JsonField<Long>) = apply {
                this.recordingTimeout = recordingTimeout
            }

            /** The audio track to record for the call. The default is `both`. */
            fun recordingTrack(recordingTrack: RecordingTrack) =
                recordingTrack(JsonField.of(recordingTrack))

            /**
             * Sets [Builder.recordingTrack] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordingTrack] with a well-typed [RecordingTrack]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun recordingTrack(recordingTrack: JsonField<RecordingTrack>) = apply {
                this.recordingTrack = recordingTrack
            }

            /** Whether to send RecordingUrl in webhooks. */
            fun sendRecordingUrl(sendRecordingUrl: Boolean) =
                sendRecordingUrl(JsonField.of(sendRecordingUrl))

            /**
             * Sets [Builder.sendRecordingUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sendRecordingUrl] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sendRecordingUrl(sendRecordingUrl: JsonField<Boolean>) = apply {
                this.sendRecordingUrl = sendRecordingUrl
            }

            /** The password to use for SIP authentication. */
            fun sipAuthPassword(sipAuthPassword: String) =
                sipAuthPassword(JsonField.of(sipAuthPassword))

            /**
             * Sets [Builder.sipAuthPassword] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sipAuthPassword] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sipAuthPassword(sipAuthPassword: JsonField<String>) = apply {
                this.sipAuthPassword = sipAuthPassword
            }

            /** The username to use for SIP authentication. */
            fun sipAuthUsername(sipAuthUsername: String) =
                sipAuthUsername(JsonField.of(sipAuthUsername))

            /**
             * Sets [Builder.sipAuthUsername] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sipAuthUsername] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sipAuthUsername(sipAuthUsername: JsonField<String>) = apply {
                this.sipAuthUsername = sipAuthUsername
            }

            /** URL destination for Telnyx to send status callback events to for the call. */
            fun statusCallback(statusCallback: String) =
                statusCallback(JsonField.of(statusCallback))

            /**
             * Sets [Builder.statusCallback] to an arbitrary JSON value.
             *
             * You should usually call [Builder.statusCallback] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun statusCallback(statusCallback: JsonField<String>) = apply {
                this.statusCallback = statusCallback
            }

            /**
             * The call events for which Telnyx should send a webhook. Multiple events can be
             * defined when separated by a space.
             */
            fun statusCallbackEvent(statusCallbackEvent: StatusCallbackEvent) =
                statusCallbackEvent(JsonField.of(statusCallbackEvent))

            /**
             * Sets [Builder.statusCallbackEvent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.statusCallbackEvent] with a well-typed
             * [StatusCallbackEvent] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun statusCallbackEvent(statusCallbackEvent: JsonField<StatusCallbackEvent>) = apply {
                this.statusCallbackEvent = statusCallbackEvent
            }

            /** HTTP request type used for `StatusCallback`. */
            fun statusCallbackMethod(statusCallbackMethod: StatusCallbackMethod) =
                statusCallbackMethod(JsonField.of(statusCallbackMethod))

            /**
             * Sets [Builder.statusCallbackMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.statusCallbackMethod] with a well-typed
             * [StatusCallbackMethod] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun statusCallbackMethod(statusCallbackMethod: JsonField<StatusCallbackMethod>) =
                apply {
                    this.statusCallbackMethod = statusCallbackMethod
                }

            /**
             * Whether to trim any leading and trailing silence from the recording. Defaults to
             * `trim-silence`.
             */
            fun trim(trim: Trim) = trim(JsonField.of(trim))

            /**
             * Sets [Builder.trim] to an arbitrary JSON value.
             *
             * You should usually call [Builder.trim] with a well-typed [Trim] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun trim(trim: JsonField<Trim>) = apply { this.trim = trim }

            /** The URL from which Telnyx will retrieve the TeXML call instructions. */
            fun url(url: String) = url(JsonField.of(url))

            /**
             * Sets [Builder.url] to an arbitrary JSON value.
             *
             * You should usually call [Builder.url] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun url(url: JsonField<String>) = apply { this.url = url }

            /**
             * HTTP request type used for `Url`. The default value is inherited from TeXML
             * Application setting.
             */
            fun urlMethod(urlMethod: UrlMethod) = urlMethod(JsonField.of(urlMethod))

            /**
             * Sets [Builder.urlMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.urlMethod] with a well-typed [UrlMethod] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun urlMethod(urlMethod: JsonField<UrlMethod>) = apply { this.urlMethod = urlMethod }

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
             * .applicationSid()
             * .from()
             * .to()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("applicationSid", applicationSid),
                    checkRequired("from", from),
                    checkRequired("to", to),
                    asyncAmd,
                    asyncAmdStatusCallback,
                    asyncAmdStatusCallbackMethod,
                    callerId,
                    cancelPlaybackOnDetectMessageEnd,
                    cancelPlaybackOnMachineDetection,
                    detectionMode,
                    fallbackUrl,
                    machineDetection,
                    machineDetectionSilenceTimeout,
                    machineDetectionSpeechEndThreshold,
                    machineDetectionSpeechThreshold,
                    machineDetectionTimeout,
                    preferredCodecs,
                    record,
                    recordingChannels,
                    recordingStatusCallback,
                    recordingStatusCallbackEvent,
                    recordingStatusCallbackMethod,
                    recordingTimeout,
                    recordingTrack,
                    sendRecordingUrl,
                    sipAuthPassword,
                    sipAuthUsername,
                    statusCallback,
                    statusCallbackEvent,
                    statusCallbackMethod,
                    trim,
                    url,
                    urlMethod,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            applicationSid()
            from()
            to()
            asyncAmd()
            asyncAmdStatusCallback()
            asyncAmdStatusCallbackMethod().ifPresent { it.validate() }
            callerId()
            cancelPlaybackOnDetectMessageEnd()
            cancelPlaybackOnMachineDetection()
            detectionMode().ifPresent { it.validate() }
            fallbackUrl()
            machineDetection().ifPresent { it.validate() }
            machineDetectionSilenceTimeout()
            machineDetectionSpeechEndThreshold()
            machineDetectionSpeechThreshold()
            machineDetectionTimeout()
            preferredCodecs()
            record()
            recordingChannels().ifPresent { it.validate() }
            recordingStatusCallback()
            recordingStatusCallbackEvent()
            recordingStatusCallbackMethod().ifPresent { it.validate() }
            recordingTimeout()
            recordingTrack().ifPresent { it.validate() }
            sendRecordingUrl()
            sipAuthPassword()
            sipAuthUsername()
            statusCallback()
            statusCallbackEvent().ifPresent { it.validate() }
            statusCallbackMethod().ifPresent { it.validate() }
            trim().ifPresent { it.validate() }
            url()
            urlMethod().ifPresent { it.validate() }
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
            (if (applicationSid.asKnown().isPresent) 1 else 0) +
                (if (from.asKnown().isPresent) 1 else 0) +
                (if (to.asKnown().isPresent) 1 else 0) +
                (if (asyncAmd.asKnown().isPresent) 1 else 0) +
                (if (asyncAmdStatusCallback.asKnown().isPresent) 1 else 0) +
                (asyncAmdStatusCallbackMethod.asKnown().getOrNull()?.validity() ?: 0) +
                (if (callerId.asKnown().isPresent) 1 else 0) +
                (if (cancelPlaybackOnDetectMessageEnd.asKnown().isPresent) 1 else 0) +
                (if (cancelPlaybackOnMachineDetection.asKnown().isPresent) 1 else 0) +
                (detectionMode.asKnown().getOrNull()?.validity() ?: 0) +
                (if (fallbackUrl.asKnown().isPresent) 1 else 0) +
                (machineDetection.asKnown().getOrNull()?.validity() ?: 0) +
                (if (machineDetectionSilenceTimeout.asKnown().isPresent) 1 else 0) +
                (if (machineDetectionSpeechEndThreshold.asKnown().isPresent) 1 else 0) +
                (if (machineDetectionSpeechThreshold.asKnown().isPresent) 1 else 0) +
                (if (machineDetectionTimeout.asKnown().isPresent) 1 else 0) +
                (if (preferredCodecs.asKnown().isPresent) 1 else 0) +
                (if (record.asKnown().isPresent) 1 else 0) +
                (recordingChannels.asKnown().getOrNull()?.validity() ?: 0) +
                (if (recordingStatusCallback.asKnown().isPresent) 1 else 0) +
                (if (recordingStatusCallbackEvent.asKnown().isPresent) 1 else 0) +
                (recordingStatusCallbackMethod.asKnown().getOrNull()?.validity() ?: 0) +
                (if (recordingTimeout.asKnown().isPresent) 1 else 0) +
                (recordingTrack.asKnown().getOrNull()?.validity() ?: 0) +
                (if (sendRecordingUrl.asKnown().isPresent) 1 else 0) +
                (if (sipAuthPassword.asKnown().isPresent) 1 else 0) +
                (if (sipAuthUsername.asKnown().isPresent) 1 else 0) +
                (if (statusCallback.asKnown().isPresent) 1 else 0) +
                (statusCallbackEvent.asKnown().getOrNull()?.validity() ?: 0) +
                (statusCallbackMethod.asKnown().getOrNull()?.validity() ?: 0) +
                (trim.asKnown().getOrNull()?.validity() ?: 0) +
                (if (url.asKnown().isPresent) 1 else 0) +
                (urlMethod.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                applicationSid == other.applicationSid &&
                from == other.from &&
                to == other.to &&
                asyncAmd == other.asyncAmd &&
                asyncAmdStatusCallback == other.asyncAmdStatusCallback &&
                asyncAmdStatusCallbackMethod == other.asyncAmdStatusCallbackMethod &&
                callerId == other.callerId &&
                cancelPlaybackOnDetectMessageEnd == other.cancelPlaybackOnDetectMessageEnd &&
                cancelPlaybackOnMachineDetection == other.cancelPlaybackOnMachineDetection &&
                detectionMode == other.detectionMode &&
                fallbackUrl == other.fallbackUrl &&
                machineDetection == other.machineDetection &&
                machineDetectionSilenceTimeout == other.machineDetectionSilenceTimeout &&
                machineDetectionSpeechEndThreshold == other.machineDetectionSpeechEndThreshold &&
                machineDetectionSpeechThreshold == other.machineDetectionSpeechThreshold &&
                machineDetectionTimeout == other.machineDetectionTimeout &&
                preferredCodecs == other.preferredCodecs &&
                record == other.record &&
                recordingChannels == other.recordingChannels &&
                recordingStatusCallback == other.recordingStatusCallback &&
                recordingStatusCallbackEvent == other.recordingStatusCallbackEvent &&
                recordingStatusCallbackMethod == other.recordingStatusCallbackMethod &&
                recordingTimeout == other.recordingTimeout &&
                recordingTrack == other.recordingTrack &&
                sendRecordingUrl == other.sendRecordingUrl &&
                sipAuthPassword == other.sipAuthPassword &&
                sipAuthUsername == other.sipAuthUsername &&
                statusCallback == other.statusCallback &&
                statusCallbackEvent == other.statusCallbackEvent &&
                statusCallbackMethod == other.statusCallbackMethod &&
                trim == other.trim &&
                url == other.url &&
                urlMethod == other.urlMethod &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                applicationSid,
                from,
                to,
                asyncAmd,
                asyncAmdStatusCallback,
                asyncAmdStatusCallbackMethod,
                callerId,
                cancelPlaybackOnDetectMessageEnd,
                cancelPlaybackOnMachineDetection,
                detectionMode,
                fallbackUrl,
                machineDetection,
                machineDetectionSilenceTimeout,
                machineDetectionSpeechEndThreshold,
                machineDetectionSpeechThreshold,
                machineDetectionTimeout,
                preferredCodecs,
                record,
                recordingChannels,
                recordingStatusCallback,
                recordingStatusCallbackEvent,
                recordingStatusCallbackMethod,
                recordingTimeout,
                recordingTrack,
                sendRecordingUrl,
                sipAuthPassword,
                sipAuthUsername,
                statusCallback,
                statusCallbackEvent,
                statusCallbackMethod,
                trim,
                url,
                urlMethod,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{applicationSid=$applicationSid, from=$from, to=$to, asyncAmd=$asyncAmd, asyncAmdStatusCallback=$asyncAmdStatusCallback, asyncAmdStatusCallbackMethod=$asyncAmdStatusCallbackMethod, callerId=$callerId, cancelPlaybackOnDetectMessageEnd=$cancelPlaybackOnDetectMessageEnd, cancelPlaybackOnMachineDetection=$cancelPlaybackOnMachineDetection, detectionMode=$detectionMode, fallbackUrl=$fallbackUrl, machineDetection=$machineDetection, machineDetectionSilenceTimeout=$machineDetectionSilenceTimeout, machineDetectionSpeechEndThreshold=$machineDetectionSpeechEndThreshold, machineDetectionSpeechThreshold=$machineDetectionSpeechThreshold, machineDetectionTimeout=$machineDetectionTimeout, preferredCodecs=$preferredCodecs, record=$record, recordingChannels=$recordingChannels, recordingStatusCallback=$recordingStatusCallback, recordingStatusCallbackEvent=$recordingStatusCallbackEvent, recordingStatusCallbackMethod=$recordingStatusCallbackMethod, recordingTimeout=$recordingTimeout, recordingTrack=$recordingTrack, sendRecordingUrl=$sendRecordingUrl, sipAuthPassword=$sipAuthPassword, sipAuthUsername=$sipAuthUsername, statusCallback=$statusCallback, statusCallbackEvent=$statusCallbackEvent, statusCallbackMethod=$statusCallbackMethod, trim=$trim, url=$url, urlMethod=$urlMethod, additionalProperties=$additionalProperties}"
    }

    /**
     * HTTP request type used for `AsyncAmdStatusCallback`. The default value is inherited from
     * TeXML Application setting.
     */
    class AsyncAmdStatusCallbackMethod
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val GET = of("GET")

            @JvmField val POST = of("POST")

            @JvmStatic fun of(value: String) = AsyncAmdStatusCallbackMethod(JsonField.of(value))
        }

        /** An enum containing [AsyncAmdStatusCallbackMethod]'s known values. */
        enum class Known {
            GET,
            POST,
        }

        /**
         * An enum containing [AsyncAmdStatusCallbackMethod]'s known values, as well as an
         * [_UNKNOWN] member.
         *
         * An instance of [AsyncAmdStatusCallbackMethod] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            GET,
            POST,
            /**
             * An enum member indicating that [AsyncAmdStatusCallbackMethod] was instantiated with
             * an unknown value.
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
                GET -> Value.GET
                POST -> Value.POST
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
                GET -> Known.GET
                POST -> Known.POST
                else ->
                    throw TelnyxInvalidDataException("Unknown AsyncAmdStatusCallbackMethod: $value")
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

        fun validate(): AsyncAmdStatusCallbackMethod = apply {
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

            return other is AsyncAmdStatusCallbackMethod && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Allows you to chose between Premium and Standard detections. */
    class DetectionMode @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val PREMIUM = of("Premium")

            @JvmField val REGULAR = of("Regular")

            @JvmStatic fun of(value: String) = DetectionMode(JsonField.of(value))
        }

        /** An enum containing [DetectionMode]'s known values. */
        enum class Known {
            PREMIUM,
            REGULAR,
        }

        /**
         * An enum containing [DetectionMode]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DetectionMode] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PREMIUM,
            REGULAR,
            /**
             * An enum member indicating that [DetectionMode] was instantiated with an unknown
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
                PREMIUM -> Value.PREMIUM
                REGULAR -> Value.REGULAR
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
                PREMIUM -> Known.PREMIUM
                REGULAR -> Known.REGULAR
                else -> throw TelnyxInvalidDataException("Unknown DetectionMode: $value")
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

        fun validate(): DetectionMode = apply {
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

            return other is DetectionMode && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Enables Answering Machine Detection. */
    class MachineDetection @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val ENABLE = of("Enable")

            @JvmField val DISABLE = of("Disable")

            @JvmField val DETECT_MESSAGE_END = of("DetectMessageEnd")

            @JvmStatic fun of(value: String) = MachineDetection(JsonField.of(value))
        }

        /** An enum containing [MachineDetection]'s known values. */
        enum class Known {
            ENABLE,
            DISABLE,
            DETECT_MESSAGE_END,
        }

        /**
         * An enum containing [MachineDetection]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [MachineDetection] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ENABLE,
            DISABLE,
            DETECT_MESSAGE_END,
            /**
             * An enum member indicating that [MachineDetection] was instantiated with an unknown
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
                ENABLE -> Value.ENABLE
                DISABLE -> Value.DISABLE
                DETECT_MESSAGE_END -> Value.DETECT_MESSAGE_END
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
                ENABLE -> Known.ENABLE
                DISABLE -> Known.DISABLE
                DETECT_MESSAGE_END -> Known.DETECT_MESSAGE_END
                else -> throw TelnyxInvalidDataException("Unknown MachineDetection: $value")
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

        fun validate(): MachineDetection = apply {
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

            return other is MachineDetection && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The number of channels in the final recording. Defaults to `mono`. */
    class RecordingChannels @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val MONO = of("mono")

            @JvmField val DUAL = of("dual")

            @JvmStatic fun of(value: String) = RecordingChannels(JsonField.of(value))
        }

        /** An enum containing [RecordingChannels]'s known values. */
        enum class Known {
            MONO,
            DUAL,
        }

        /**
         * An enum containing [RecordingChannels]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RecordingChannels] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MONO,
            DUAL,
            /**
             * An enum member indicating that [RecordingChannels] was instantiated with an unknown
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
                MONO -> Value.MONO
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
                MONO -> Known.MONO
                DUAL -> Known.DUAL
                else -> throw TelnyxInvalidDataException("Unknown RecordingChannels: $value")
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

        fun validate(): RecordingChannels = apply {
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

            return other is RecordingChannels && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** HTTP request type used for `RecordingStatusCallback`. Defaults to `POST`. */
    class RecordingStatusCallbackMethod
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val GET = of("GET")

            @JvmField val POST = of("POST")

            @JvmStatic fun of(value: String) = RecordingStatusCallbackMethod(JsonField.of(value))
        }

        /** An enum containing [RecordingStatusCallbackMethod]'s known values. */
        enum class Known {
            GET,
            POST,
        }

        /**
         * An enum containing [RecordingStatusCallbackMethod]'s known values, as well as an
         * [_UNKNOWN] member.
         *
         * An instance of [RecordingStatusCallbackMethod] can contain an unknown value in a couple
         * of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            GET,
            POST,
            /**
             * An enum member indicating that [RecordingStatusCallbackMethod] was instantiated with
             * an unknown value.
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
                GET -> Value.GET
                POST -> Value.POST
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
                GET -> Known.GET
                POST -> Known.POST
                else ->
                    throw TelnyxInvalidDataException(
                        "Unknown RecordingStatusCallbackMethod: $value"
                    )
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

        fun validate(): RecordingStatusCallbackMethod = apply {
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

            return other is RecordingStatusCallbackMethod && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The audio track to record for the call. The default is `both`. */
    class RecordingTrack @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val INBOUND = of("inbound")

            @JvmField val OUTBOUND = of("outbound")

            @JvmField val BOTH = of("both")

            @JvmStatic fun of(value: String) = RecordingTrack(JsonField.of(value))
        }

        /** An enum containing [RecordingTrack]'s known values. */
        enum class Known {
            INBOUND,
            OUTBOUND,
            BOTH,
        }

        /**
         * An enum containing [RecordingTrack]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RecordingTrack] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            INBOUND,
            OUTBOUND,
            BOTH,
            /**
             * An enum member indicating that [RecordingTrack] was instantiated with an unknown
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
                INBOUND -> Value.INBOUND
                OUTBOUND -> Value.OUTBOUND
                BOTH -> Value.BOTH
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
                INBOUND -> Known.INBOUND
                OUTBOUND -> Known.OUTBOUND
                BOTH -> Known.BOTH
                else -> throw TelnyxInvalidDataException("Unknown RecordingTrack: $value")
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

        fun validate(): RecordingTrack = apply {
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

            return other is RecordingTrack && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The call events for which Telnyx should send a webhook. Multiple events can be defined when
     * separated by a space.
     */
    class StatusCallbackEvent
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val INITIATED = of("initiated")

            @JvmField val RINGING = of("ringing")

            @JvmField val ANSWERED = of("answered")

            @JvmField val COMPLETED = of("completed")

            @JvmStatic fun of(value: String) = StatusCallbackEvent(JsonField.of(value))
        }

        /** An enum containing [StatusCallbackEvent]'s known values. */
        enum class Known {
            INITIATED,
            RINGING,
            ANSWERED,
            COMPLETED,
        }

        /**
         * An enum containing [StatusCallbackEvent]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [StatusCallbackEvent] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            INITIATED,
            RINGING,
            ANSWERED,
            COMPLETED,
            /**
             * An enum member indicating that [StatusCallbackEvent] was instantiated with an unknown
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
                INITIATED -> Value.INITIATED
                RINGING -> Value.RINGING
                ANSWERED -> Value.ANSWERED
                COMPLETED -> Value.COMPLETED
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
                INITIATED -> Known.INITIATED
                RINGING -> Known.RINGING
                ANSWERED -> Known.ANSWERED
                COMPLETED -> Known.COMPLETED
                else -> throw TelnyxInvalidDataException("Unknown StatusCallbackEvent: $value")
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

        fun validate(): StatusCallbackEvent = apply {
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

            return other is StatusCallbackEvent && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** HTTP request type used for `StatusCallback`. */
    class StatusCallbackMethod
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val GET = of("GET")

            @JvmField val POST = of("POST")

            @JvmStatic fun of(value: String) = StatusCallbackMethod(JsonField.of(value))
        }

        /** An enum containing [StatusCallbackMethod]'s known values. */
        enum class Known {
            GET,
            POST,
        }

        /**
         * An enum containing [StatusCallbackMethod]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [StatusCallbackMethod] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            GET,
            POST,
            /**
             * An enum member indicating that [StatusCallbackMethod] was instantiated with an
             * unknown value.
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
                GET -> Value.GET
                POST -> Value.POST
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
                GET -> Known.GET
                POST -> Known.POST
                else -> throw TelnyxInvalidDataException("Unknown StatusCallbackMethod: $value")
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

        fun validate(): StatusCallbackMethod = apply {
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

            return other is StatusCallbackMethod && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Whether to trim any leading and trailing silence from the recording. Defaults to
     * `trim-silence`.
     */
    class Trim @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val DO_NOT_TRIM = of("do-not-trim")

            @JvmStatic fun of(value: String) = Trim(JsonField.of(value))
        }

        /** An enum containing [Trim]'s known values. */
        enum class Known {
            TRIM_SILENCE,
            DO_NOT_TRIM,
        }

        /**
         * An enum containing [Trim]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Trim] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TRIM_SILENCE,
            DO_NOT_TRIM,
            /** An enum member indicating that [Trim] was instantiated with an unknown value. */
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
                DO_NOT_TRIM -> Value.DO_NOT_TRIM
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
                DO_NOT_TRIM -> Known.DO_NOT_TRIM
                else -> throw TelnyxInvalidDataException("Unknown Trim: $value")
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

        fun validate(): Trim = apply {
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

            return other is Trim && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * HTTP request type used for `Url`. The default value is inherited from TeXML Application
     * setting.
     */
    class UrlMethod @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val GET = of("GET")

            @JvmField val POST = of("POST")

            @JvmStatic fun of(value: String) = UrlMethod(JsonField.of(value))
        }

        /** An enum containing [UrlMethod]'s known values. */
        enum class Known {
            GET,
            POST,
        }

        /**
         * An enum containing [UrlMethod]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [UrlMethod] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            GET,
            POST,
            /**
             * An enum member indicating that [UrlMethod] was instantiated with an unknown value.
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
                GET -> Value.GET
                POST -> Value.POST
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
                GET -> Known.GET
                POST -> Known.POST
                else -> throw TelnyxInvalidDataException("Unknown UrlMethod: $value")
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

        fun validate(): UrlMethod = apply {
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

            return other is UrlMethod && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CallCallsParams &&
            accountSid == other.accountSid &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(accountSid, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CallCallsParams{accountSid=$accountSid, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
