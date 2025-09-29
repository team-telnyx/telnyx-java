// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.texml.accounts.conferences.participants

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.Enum
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.Params
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Updates a conference participant */
class ParticipantUpdateParams
private constructor(
    private val accountSid: String,
    private val conferenceSid: String,
    private val callSidOrParticipantLabel: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun accountSid(): String = accountSid

    fun conferenceSid(): String = conferenceSid

    fun callSidOrParticipantLabel(): Optional<String> =
        Optional.ofNullable(callSidOrParticipantLabel)

    /**
     * The HTTP method used to call the `AnnounceUrl`. Defaults to `POST`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun announceMethod(): Optional<AnnounceMethod> = body.announceMethod()

    /**
     * The URL to call to announce something to the participant. The URL may return an MP3 fileo a
     * WAV file, or a TwiML document that contains `<Play>`, `<Say>`, `<Pause>`, or `<Redirect>`
     * verbs.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun announceUrl(): Optional<String> = body.announceUrl()

    /**
     * Whether to play a notification beep to the conference when the participant exits.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun beepOnExit(): Optional<Boolean> = body.beepOnExit()

    /**
     * The SID of the participant who is being coached. The participant being coached is the only
     * participant who can hear the participant who is coaching.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callSidToCoach(): Optional<String> = body.callSidToCoach()

    /**
     * Whether the participant is coaching another call. When `true`, `CallSidToCoach` has to be
     * given.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun coaching(): Optional<Boolean> = body.coaching()

    /**
     * Whether to end the conference when the participant leaves.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endConferenceOnExit(): Optional<Boolean> = body.endConferenceOnExit()

    /**
     * Whether the participant should be on hold.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hold(): Optional<Boolean> = body.hold()

    /**
     * The HTTP method to use when calling the `HoldUrl`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun holdMethod(): Optional<HoldMethod> = body.holdMethod()

    /**
     * The URL to be called using the `HoldMethod` for music that plays when the participant is on
     * hold. The URL may return an MP3 file, a WAV file, or a TwiML document that contains `<Play>`,
     * `<Say>`, `<Pause>`, or `<Redirect>` verbs.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun holdUrl(): Optional<String> = body.holdUrl()

    /**
     * Whether the participant should be muted.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun muted(): Optional<Boolean> = body.muted()

    /**
     * The URL to call for an audio file to play while the participant is waiting for the conference
     * to start.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun waitUrl(): Optional<String> = body.waitUrl()

    /**
     * Returns the raw JSON value of [announceMethod].
     *
     * Unlike [announceMethod], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _announceMethod(): JsonField<AnnounceMethod> = body._announceMethod()

    /**
     * Returns the raw JSON value of [announceUrl].
     *
     * Unlike [announceUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _announceUrl(): JsonField<String> = body._announceUrl()

    /**
     * Returns the raw JSON value of [beepOnExit].
     *
     * Unlike [beepOnExit], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _beepOnExit(): JsonField<Boolean> = body._beepOnExit()

    /**
     * Returns the raw JSON value of [callSidToCoach].
     *
     * Unlike [callSidToCoach], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _callSidToCoach(): JsonField<String> = body._callSidToCoach()

    /**
     * Returns the raw JSON value of [coaching].
     *
     * Unlike [coaching], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _coaching(): JsonField<Boolean> = body._coaching()

    /**
     * Returns the raw JSON value of [endConferenceOnExit].
     *
     * Unlike [endConferenceOnExit], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _endConferenceOnExit(): JsonField<Boolean> = body._endConferenceOnExit()

    /**
     * Returns the raw JSON value of [hold].
     *
     * Unlike [hold], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _hold(): JsonField<Boolean> = body._hold()

    /**
     * Returns the raw JSON value of [holdMethod].
     *
     * Unlike [holdMethod], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _holdMethod(): JsonField<HoldMethod> = body._holdMethod()

    /**
     * Returns the raw JSON value of [holdUrl].
     *
     * Unlike [holdUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _holdUrl(): JsonField<String> = body._holdUrl()

    /**
     * Returns the raw JSON value of [muted].
     *
     * Unlike [muted], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _muted(): JsonField<Boolean> = body._muted()

    /**
     * Returns the raw JSON value of [waitUrl].
     *
     * Unlike [waitUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _waitUrl(): JsonField<String> = body._waitUrl()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ParticipantUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .accountSid()
         * .conferenceSid()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ParticipantUpdateParams]. */
    class Builder internal constructor() {

        private var accountSid: String? = null
        private var conferenceSid: String? = null
        private var callSidOrParticipantLabel: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(participantUpdateParams: ParticipantUpdateParams) = apply {
            accountSid = participantUpdateParams.accountSid
            conferenceSid = participantUpdateParams.conferenceSid
            callSidOrParticipantLabel = participantUpdateParams.callSidOrParticipantLabel
            body = participantUpdateParams.body.toBuilder()
            additionalHeaders = participantUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = participantUpdateParams.additionalQueryParams.toBuilder()
        }

        fun accountSid(accountSid: String) = apply { this.accountSid = accountSid }

        fun conferenceSid(conferenceSid: String) = apply { this.conferenceSid = conferenceSid }

        fun callSidOrParticipantLabel(callSidOrParticipantLabel: String?) = apply {
            this.callSidOrParticipantLabel = callSidOrParticipantLabel
        }

        /**
         * Alias for calling [Builder.callSidOrParticipantLabel] with
         * `callSidOrParticipantLabel.orElse(null)`.
         */
        fun callSidOrParticipantLabel(callSidOrParticipantLabel: Optional<String>) =
            callSidOrParticipantLabel(callSidOrParticipantLabel.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [announceMethod]
         * - [announceUrl]
         * - [beepOnExit]
         * - [callSidToCoach]
         * - [coaching]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The HTTP method used to call the `AnnounceUrl`. Defaults to `POST`. */
        fun announceMethod(announceMethod: AnnounceMethod) = apply {
            body.announceMethod(announceMethod)
        }

        /**
         * Sets [Builder.announceMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.announceMethod] with a well-typed [AnnounceMethod] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun announceMethod(announceMethod: JsonField<AnnounceMethod>) = apply {
            body.announceMethod(announceMethod)
        }

        /**
         * The URL to call to announce something to the participant. The URL may return an MP3 fileo
         * a WAV file, or a TwiML document that contains `<Play>`, `<Say>`, `<Pause>`, or
         * `<Redirect>` verbs.
         */
        fun announceUrl(announceUrl: String) = apply { body.announceUrl(announceUrl) }

        /**
         * Sets [Builder.announceUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.announceUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun announceUrl(announceUrl: JsonField<String>) = apply { body.announceUrl(announceUrl) }

        /** Whether to play a notification beep to the conference when the participant exits. */
        fun beepOnExit(beepOnExit: Boolean) = apply { body.beepOnExit(beepOnExit) }

        /**
         * Sets [Builder.beepOnExit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.beepOnExit] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun beepOnExit(beepOnExit: JsonField<Boolean>) = apply { body.beepOnExit(beepOnExit) }

        /**
         * The SID of the participant who is being coached. The participant being coached is the
         * only participant who can hear the participant who is coaching.
         */
        fun callSidToCoach(callSidToCoach: String) = apply { body.callSidToCoach(callSidToCoach) }

        /**
         * Sets [Builder.callSidToCoach] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callSidToCoach] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun callSidToCoach(callSidToCoach: JsonField<String>) = apply {
            body.callSidToCoach(callSidToCoach)
        }

        /**
         * Whether the participant is coaching another call. When `true`, `CallSidToCoach` has to be
         * given.
         */
        fun coaching(coaching: Boolean) = apply { body.coaching(coaching) }

        /**
         * Sets [Builder.coaching] to an arbitrary JSON value.
         *
         * You should usually call [Builder.coaching] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun coaching(coaching: JsonField<Boolean>) = apply { body.coaching(coaching) }

        /** Whether to end the conference when the participant leaves. */
        fun endConferenceOnExit(endConferenceOnExit: Boolean) = apply {
            body.endConferenceOnExit(endConferenceOnExit)
        }

        /**
         * Sets [Builder.endConferenceOnExit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endConferenceOnExit] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endConferenceOnExit(endConferenceOnExit: JsonField<Boolean>) = apply {
            body.endConferenceOnExit(endConferenceOnExit)
        }

        /** Whether the participant should be on hold. */
        fun hold(hold: Boolean) = apply { body.hold(hold) }

        /**
         * Sets [Builder.hold] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hold] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hold(hold: JsonField<Boolean>) = apply { body.hold(hold) }

        /** The HTTP method to use when calling the `HoldUrl`. */
        fun holdMethod(holdMethod: HoldMethod) = apply { body.holdMethod(holdMethod) }

        /**
         * Sets [Builder.holdMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.holdMethod] with a well-typed [HoldMethod] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun holdMethod(holdMethod: JsonField<HoldMethod>) = apply { body.holdMethod(holdMethod) }

        /**
         * The URL to be called using the `HoldMethod` for music that plays when the participant is
         * on hold. The URL may return an MP3 file, a WAV file, or a TwiML document that contains
         * `<Play>`, `<Say>`, `<Pause>`, or `<Redirect>` verbs.
         */
        fun holdUrl(holdUrl: String) = apply { body.holdUrl(holdUrl) }

        /**
         * Sets [Builder.holdUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.holdUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun holdUrl(holdUrl: JsonField<String>) = apply { body.holdUrl(holdUrl) }

        /** Whether the participant should be muted. */
        fun muted(muted: Boolean) = apply { body.muted(muted) }

        /**
         * Sets [Builder.muted] to an arbitrary JSON value.
         *
         * You should usually call [Builder.muted] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun muted(muted: JsonField<Boolean>) = apply { body.muted(muted) }

        /**
         * The URL to call for an audio file to play while the participant is waiting for the
         * conference to start.
         */
        fun waitUrl(waitUrl: String) = apply { body.waitUrl(waitUrl) }

        /**
         * Sets [Builder.waitUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.waitUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun waitUrl(waitUrl: JsonField<String>) = apply { body.waitUrl(waitUrl) }

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
         * Returns an immutable instance of [ParticipantUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accountSid()
         * .conferenceSid()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ParticipantUpdateParams =
            ParticipantUpdateParams(
                checkRequired("accountSid", accountSid),
                checkRequired("conferenceSid", conferenceSid),
                callSidOrParticipantLabel,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> accountSid
            1 -> conferenceSid
            2 -> callSidOrParticipantLabel ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val announceMethod: JsonField<AnnounceMethod>,
        private val announceUrl: JsonField<String>,
        private val beepOnExit: JsonField<Boolean>,
        private val callSidToCoach: JsonField<String>,
        private val coaching: JsonField<Boolean>,
        private val endConferenceOnExit: JsonField<Boolean>,
        private val hold: JsonField<Boolean>,
        private val holdMethod: JsonField<HoldMethod>,
        private val holdUrl: JsonField<String>,
        private val muted: JsonField<Boolean>,
        private val waitUrl: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("AnnounceMethod")
            @ExcludeMissing
            announceMethod: JsonField<AnnounceMethod> = JsonMissing.of(),
            @JsonProperty("AnnounceUrl")
            @ExcludeMissing
            announceUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("BeepOnExit")
            @ExcludeMissing
            beepOnExit: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("CallSidToCoach")
            @ExcludeMissing
            callSidToCoach: JsonField<String> = JsonMissing.of(),
            @JsonProperty("Coaching")
            @ExcludeMissing
            coaching: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("EndConferenceOnExit")
            @ExcludeMissing
            endConferenceOnExit: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("Hold") @ExcludeMissing hold: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("HoldMethod")
            @ExcludeMissing
            holdMethod: JsonField<HoldMethod> = JsonMissing.of(),
            @JsonProperty("HoldUrl") @ExcludeMissing holdUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("Muted") @ExcludeMissing muted: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("WaitUrl") @ExcludeMissing waitUrl: JsonField<String> = JsonMissing.of(),
        ) : this(
            announceMethod,
            announceUrl,
            beepOnExit,
            callSidToCoach,
            coaching,
            endConferenceOnExit,
            hold,
            holdMethod,
            holdUrl,
            muted,
            waitUrl,
            mutableMapOf(),
        )

        /**
         * The HTTP method used to call the `AnnounceUrl`. Defaults to `POST`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun announceMethod(): Optional<AnnounceMethod> =
            announceMethod.getOptional("AnnounceMethod")

        /**
         * The URL to call to announce something to the participant. The URL may return an MP3 fileo
         * a WAV file, or a TwiML document that contains `<Play>`, `<Say>`, `<Pause>`, or
         * `<Redirect>` verbs.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun announceUrl(): Optional<String> = announceUrl.getOptional("AnnounceUrl")

        /**
         * Whether to play a notification beep to the conference when the participant exits.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun beepOnExit(): Optional<Boolean> = beepOnExit.getOptional("BeepOnExit")

        /**
         * The SID of the participant who is being coached. The participant being coached is the
         * only participant who can hear the participant who is coaching.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun callSidToCoach(): Optional<String> = callSidToCoach.getOptional("CallSidToCoach")

        /**
         * Whether the participant is coaching another call. When `true`, `CallSidToCoach` has to be
         * given.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun coaching(): Optional<Boolean> = coaching.getOptional("Coaching")

        /**
         * Whether to end the conference when the participant leaves.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endConferenceOnExit(): Optional<Boolean> =
            endConferenceOnExit.getOptional("EndConferenceOnExit")

        /**
         * Whether the participant should be on hold.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun hold(): Optional<Boolean> = hold.getOptional("Hold")

        /**
         * The HTTP method to use when calling the `HoldUrl`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun holdMethod(): Optional<HoldMethod> = holdMethod.getOptional("HoldMethod")

        /**
         * The URL to be called using the `HoldMethod` for music that plays when the participant is
         * on hold. The URL may return an MP3 file, a WAV file, or a TwiML document that contains
         * `<Play>`, `<Say>`, `<Pause>`, or `<Redirect>` verbs.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun holdUrl(): Optional<String> = holdUrl.getOptional("HoldUrl")

        /**
         * Whether the participant should be muted.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun muted(): Optional<Boolean> = muted.getOptional("Muted")

        /**
         * The URL to call for an audio file to play while the participant is waiting for the
         * conference to start.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun waitUrl(): Optional<String> = waitUrl.getOptional("WaitUrl")

        /**
         * Returns the raw JSON value of [announceMethod].
         *
         * Unlike [announceMethod], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("AnnounceMethod")
        @ExcludeMissing
        fun _announceMethod(): JsonField<AnnounceMethod> = announceMethod

        /**
         * Returns the raw JSON value of [announceUrl].
         *
         * Unlike [announceUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("AnnounceUrl")
        @ExcludeMissing
        fun _announceUrl(): JsonField<String> = announceUrl

        /**
         * Returns the raw JSON value of [beepOnExit].
         *
         * Unlike [beepOnExit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("BeepOnExit")
        @ExcludeMissing
        fun _beepOnExit(): JsonField<Boolean> = beepOnExit

        /**
         * Returns the raw JSON value of [callSidToCoach].
         *
         * Unlike [callSidToCoach], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("CallSidToCoach")
        @ExcludeMissing
        fun _callSidToCoach(): JsonField<String> = callSidToCoach

        /**
         * Returns the raw JSON value of [coaching].
         *
         * Unlike [coaching], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("Coaching") @ExcludeMissing fun _coaching(): JsonField<Boolean> = coaching

        /**
         * Returns the raw JSON value of [endConferenceOnExit].
         *
         * Unlike [endConferenceOnExit], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("EndConferenceOnExit")
        @ExcludeMissing
        fun _endConferenceOnExit(): JsonField<Boolean> = endConferenceOnExit

        /**
         * Returns the raw JSON value of [hold].
         *
         * Unlike [hold], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("Hold") @ExcludeMissing fun _hold(): JsonField<Boolean> = hold

        /**
         * Returns the raw JSON value of [holdMethod].
         *
         * Unlike [holdMethod], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("HoldMethod")
        @ExcludeMissing
        fun _holdMethod(): JsonField<HoldMethod> = holdMethod

        /**
         * Returns the raw JSON value of [holdUrl].
         *
         * Unlike [holdUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("HoldUrl") @ExcludeMissing fun _holdUrl(): JsonField<String> = holdUrl

        /**
         * Returns the raw JSON value of [muted].
         *
         * Unlike [muted], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("Muted") @ExcludeMissing fun _muted(): JsonField<Boolean> = muted

        /**
         * Returns the raw JSON value of [waitUrl].
         *
         * Unlike [waitUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("WaitUrl") @ExcludeMissing fun _waitUrl(): JsonField<String> = waitUrl

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var announceMethod: JsonField<AnnounceMethod> = JsonMissing.of()
            private var announceUrl: JsonField<String> = JsonMissing.of()
            private var beepOnExit: JsonField<Boolean> = JsonMissing.of()
            private var callSidToCoach: JsonField<String> = JsonMissing.of()
            private var coaching: JsonField<Boolean> = JsonMissing.of()
            private var endConferenceOnExit: JsonField<Boolean> = JsonMissing.of()
            private var hold: JsonField<Boolean> = JsonMissing.of()
            private var holdMethod: JsonField<HoldMethod> = JsonMissing.of()
            private var holdUrl: JsonField<String> = JsonMissing.of()
            private var muted: JsonField<Boolean> = JsonMissing.of()
            private var waitUrl: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                announceMethod = body.announceMethod
                announceUrl = body.announceUrl
                beepOnExit = body.beepOnExit
                callSidToCoach = body.callSidToCoach
                coaching = body.coaching
                endConferenceOnExit = body.endConferenceOnExit
                hold = body.hold
                holdMethod = body.holdMethod
                holdUrl = body.holdUrl
                muted = body.muted
                waitUrl = body.waitUrl
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The HTTP method used to call the `AnnounceUrl`. Defaults to `POST`. */
            fun announceMethod(announceMethod: AnnounceMethod) =
                announceMethod(JsonField.of(announceMethod))

            /**
             * Sets [Builder.announceMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.announceMethod] with a well-typed [AnnounceMethod]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun announceMethod(announceMethod: JsonField<AnnounceMethod>) = apply {
                this.announceMethod = announceMethod
            }

            /**
             * The URL to call to announce something to the participant. The URL may return an MP3
             * fileo a WAV file, or a TwiML document that contains `<Play>`, `<Say>`, `<Pause>`, or
             * `<Redirect>` verbs.
             */
            fun announceUrl(announceUrl: String) = announceUrl(JsonField.of(announceUrl))

            /**
             * Sets [Builder.announceUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.announceUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun announceUrl(announceUrl: JsonField<String>) = apply {
                this.announceUrl = announceUrl
            }

            /** Whether to play a notification beep to the conference when the participant exits. */
            fun beepOnExit(beepOnExit: Boolean) = beepOnExit(JsonField.of(beepOnExit))

            /**
             * Sets [Builder.beepOnExit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.beepOnExit] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun beepOnExit(beepOnExit: JsonField<Boolean>) = apply { this.beepOnExit = beepOnExit }

            /**
             * The SID of the participant who is being coached. The participant being coached is the
             * only participant who can hear the participant who is coaching.
             */
            fun callSidToCoach(callSidToCoach: String) =
                callSidToCoach(JsonField.of(callSidToCoach))

            /**
             * Sets [Builder.callSidToCoach] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callSidToCoach] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun callSidToCoach(callSidToCoach: JsonField<String>) = apply {
                this.callSidToCoach = callSidToCoach
            }

            /**
             * Whether the participant is coaching another call. When `true`, `CallSidToCoach` has
             * to be given.
             */
            fun coaching(coaching: Boolean) = coaching(JsonField.of(coaching))

            /**
             * Sets [Builder.coaching] to an arbitrary JSON value.
             *
             * You should usually call [Builder.coaching] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun coaching(coaching: JsonField<Boolean>) = apply { this.coaching = coaching }

            /** Whether to end the conference when the participant leaves. */
            fun endConferenceOnExit(endConferenceOnExit: Boolean) =
                endConferenceOnExit(JsonField.of(endConferenceOnExit))

            /**
             * Sets [Builder.endConferenceOnExit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endConferenceOnExit] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun endConferenceOnExit(endConferenceOnExit: JsonField<Boolean>) = apply {
                this.endConferenceOnExit = endConferenceOnExit
            }

            /** Whether the participant should be on hold. */
            fun hold(hold: Boolean) = hold(JsonField.of(hold))

            /**
             * Sets [Builder.hold] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hold] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun hold(hold: JsonField<Boolean>) = apply { this.hold = hold }

            /** The HTTP method to use when calling the `HoldUrl`. */
            fun holdMethod(holdMethod: HoldMethod) = holdMethod(JsonField.of(holdMethod))

            /**
             * Sets [Builder.holdMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.holdMethod] with a well-typed [HoldMethod] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun holdMethod(holdMethod: JsonField<HoldMethod>) = apply {
                this.holdMethod = holdMethod
            }

            /**
             * The URL to be called using the `HoldMethod` for music that plays when the participant
             * is on hold. The URL may return an MP3 file, a WAV file, or a TwiML document that
             * contains `<Play>`, `<Say>`, `<Pause>`, or `<Redirect>` verbs.
             */
            fun holdUrl(holdUrl: String) = holdUrl(JsonField.of(holdUrl))

            /**
             * Sets [Builder.holdUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.holdUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun holdUrl(holdUrl: JsonField<String>) = apply { this.holdUrl = holdUrl }

            /** Whether the participant should be muted. */
            fun muted(muted: Boolean) = muted(JsonField.of(muted))

            /**
             * Sets [Builder.muted] to an arbitrary JSON value.
             *
             * You should usually call [Builder.muted] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun muted(muted: JsonField<Boolean>) = apply { this.muted = muted }

            /**
             * The URL to call for an audio file to play while the participant is waiting for the
             * conference to start.
             */
            fun waitUrl(waitUrl: String) = waitUrl(JsonField.of(waitUrl))

            /**
             * Sets [Builder.waitUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.waitUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun waitUrl(waitUrl: JsonField<String>) = apply { this.waitUrl = waitUrl }

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
             */
            fun build(): Body =
                Body(
                    announceMethod,
                    announceUrl,
                    beepOnExit,
                    callSidToCoach,
                    coaching,
                    endConferenceOnExit,
                    hold,
                    holdMethod,
                    holdUrl,
                    muted,
                    waitUrl,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            announceMethod().ifPresent { it.validate() }
            announceUrl()
            beepOnExit()
            callSidToCoach()
            coaching()
            endConferenceOnExit()
            hold()
            holdMethod().ifPresent { it.validate() }
            holdUrl()
            muted()
            waitUrl()
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
            (announceMethod.asKnown().getOrNull()?.validity() ?: 0) +
                (if (announceUrl.asKnown().isPresent) 1 else 0) +
                (if (beepOnExit.asKnown().isPresent) 1 else 0) +
                (if (callSidToCoach.asKnown().isPresent) 1 else 0) +
                (if (coaching.asKnown().isPresent) 1 else 0) +
                (if (endConferenceOnExit.asKnown().isPresent) 1 else 0) +
                (if (hold.asKnown().isPresent) 1 else 0) +
                (holdMethod.asKnown().getOrNull()?.validity() ?: 0) +
                (if (holdUrl.asKnown().isPresent) 1 else 0) +
                (if (muted.asKnown().isPresent) 1 else 0) +
                (if (waitUrl.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                announceMethod == other.announceMethod &&
                announceUrl == other.announceUrl &&
                beepOnExit == other.beepOnExit &&
                callSidToCoach == other.callSidToCoach &&
                coaching == other.coaching &&
                endConferenceOnExit == other.endConferenceOnExit &&
                hold == other.hold &&
                holdMethod == other.holdMethod &&
                holdUrl == other.holdUrl &&
                muted == other.muted &&
                waitUrl == other.waitUrl &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                announceMethod,
                announceUrl,
                beepOnExit,
                callSidToCoach,
                coaching,
                endConferenceOnExit,
                hold,
                holdMethod,
                holdUrl,
                muted,
                waitUrl,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{announceMethod=$announceMethod, announceUrl=$announceUrl, beepOnExit=$beepOnExit, callSidToCoach=$callSidToCoach, coaching=$coaching, endConferenceOnExit=$endConferenceOnExit, hold=$hold, holdMethod=$holdMethod, holdUrl=$holdUrl, muted=$muted, waitUrl=$waitUrl, additionalProperties=$additionalProperties}"
    }

    /** The HTTP method used to call the `AnnounceUrl`. Defaults to `POST`. */
    class AnnounceMethod @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val GET = of("GET")

            @JvmField val POST = of("POST")

            @JvmStatic fun of(value: String) = AnnounceMethod(JsonField.of(value))
        }

        /** An enum containing [AnnounceMethod]'s known values. */
        enum class Known {
            GET,
            POST,
        }

        /**
         * An enum containing [AnnounceMethod]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AnnounceMethod] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            GET,
            POST,
            /**
             * An enum member indicating that [AnnounceMethod] was instantiated with an unknown
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
                else -> throw TelnyxInvalidDataException("Unknown AnnounceMethod: $value")
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

        fun validate(): AnnounceMethod = apply {
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

            return other is AnnounceMethod && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The HTTP method to use when calling the `HoldUrl`. */
    class HoldMethod @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmStatic fun of(value: String) = HoldMethod(JsonField.of(value))
        }

        /** An enum containing [HoldMethod]'s known values. */
        enum class Known {
            GET,
            POST,
        }

        /**
         * An enum containing [HoldMethod]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [HoldMethod] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            GET,
            POST,
            /**
             * An enum member indicating that [HoldMethod] was instantiated with an unknown value.
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
                else -> throw TelnyxInvalidDataException("Unknown HoldMethod: $value")
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

        fun validate(): HoldMethod = apply {
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

            return other is HoldMethod && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ParticipantUpdateParams &&
            accountSid == other.accountSid &&
            conferenceSid == other.conferenceSid &&
            callSidOrParticipantLabel == other.callSidOrParticipantLabel &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            accountSid,
            conferenceSid,
            callSidOrParticipantLabel,
            body,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ParticipantUpdateParams{accountSid=$accountSid, conferenceSid=$conferenceSid, callSidOrParticipantLabel=$callSidOrParticipantLabel, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
