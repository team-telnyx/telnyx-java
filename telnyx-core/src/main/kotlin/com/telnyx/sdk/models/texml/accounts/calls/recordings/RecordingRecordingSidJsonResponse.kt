// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.calls.recordings

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class RecordingRecordingSidJsonResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accountSid: JsonField<String>,
    private val callSid: JsonField<String>,
    private val channels: JsonField<Channels>,
    private val conferenceSid: JsonField<String>,
    private val dateCreated: JsonField<OffsetDateTime>,
    private val dateUpdated: JsonField<OffsetDateTime>,
    private val duration: JsonField<String>,
    private val errorCode: JsonField<String>,
    private val price: JsonField<String>,
    private val priceUnit: JsonField<String>,
    private val sid: JsonField<String>,
    private val source: JsonField<Source>,
    private val startTime: JsonField<OffsetDateTime>,
    private val track: JsonField<Track>,
    private val uri: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("account_sid")
        @ExcludeMissing
        accountSid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("call_sid") @ExcludeMissing callSid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("channels") @ExcludeMissing channels: JsonField<Channels> = JsonMissing.of(),
        @JsonProperty("conference_sid")
        @ExcludeMissing
        conferenceSid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("date_created")
        @ExcludeMissing
        dateCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("date_updated")
        @ExcludeMissing
        dateUpdated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("duration") @ExcludeMissing duration: JsonField<String> = JsonMissing.of(),
        @JsonProperty("error_code") @ExcludeMissing errorCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("price") @ExcludeMissing price: JsonField<String> = JsonMissing.of(),
        @JsonProperty("price_unit") @ExcludeMissing priceUnit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sid") @ExcludeMissing sid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<Source> = JsonMissing.of(),
        @JsonProperty("start_time")
        @ExcludeMissing
        startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("track") @ExcludeMissing track: JsonField<Track> = JsonMissing.of(),
        @JsonProperty("uri") @ExcludeMissing uri: JsonField<String> = JsonMissing.of(),
    ) : this(
        accountSid,
        callSid,
        channels,
        conferenceSid,
        dateCreated,
        dateUpdated,
        duration,
        errorCode,
        price,
        priceUnit,
        sid,
        source,
        startTime,
        track,
        uri,
        mutableMapOf(),
    )

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountSid(): Optional<String> = accountSid.getOptional("account_sid")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callSid(): Optional<String> = callSid.getOptional("call_sid")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun channels(): Optional<Channels> = channels.getOptional("channels")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun conferenceSid(): Optional<String> = conferenceSid.getOptional("conference_sid")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dateCreated(): Optional<OffsetDateTime> = dateCreated.getOptional("date_created")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dateUpdated(): Optional<OffsetDateTime> = dateUpdated.getOptional("date_updated")

    /**
     * The duration of this recording, given in seconds.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun duration(): Optional<String> = duration.getOptional("duration")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun errorCode(): Optional<String> = errorCode.getOptional("error_code")

    /**
     * The price of this recording, the currency is specified in the price_unit field.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun price(): Optional<String> = price.getOptional("price")

    /**
     * The unit in which the price is given.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun priceUnit(): Optional<String> = priceUnit.getOptional("price_unit")

    /**
     * Identifier of a resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sid(): Optional<String> = sid.getOptional("sid")

    /**
     * Defines how the recording was created.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun source(): Optional<Source> = source.getOptional("source")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startTime(): Optional<OffsetDateTime> = startTime.getOptional("start_time")

    /**
     * The audio track to record for the call. The default is `both`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun track(): Optional<Track> = track.getOptional("track")

    /**
     * The relative URI for this recording resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun uri(): Optional<String> = uri.getOptional("uri")

    /**
     * Returns the raw JSON value of [accountSid].
     *
     * Unlike [accountSid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_sid") @ExcludeMissing fun _accountSid(): JsonField<String> = accountSid

    /**
     * Returns the raw JSON value of [callSid].
     *
     * Unlike [callSid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("call_sid") @ExcludeMissing fun _callSid(): JsonField<String> = callSid

    /**
     * Returns the raw JSON value of [channels].
     *
     * Unlike [channels], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("channels") @ExcludeMissing fun _channels(): JsonField<Channels> = channels

    /**
     * Returns the raw JSON value of [conferenceSid].
     *
     * Unlike [conferenceSid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("conference_sid")
    @ExcludeMissing
    fun _conferenceSid(): JsonField<String> = conferenceSid

    /**
     * Returns the raw JSON value of [dateCreated].
     *
     * Unlike [dateCreated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("date_created")
    @ExcludeMissing
    fun _dateCreated(): JsonField<OffsetDateTime> = dateCreated

    /**
     * Returns the raw JSON value of [dateUpdated].
     *
     * Unlike [dateUpdated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("date_updated")
    @ExcludeMissing
    fun _dateUpdated(): JsonField<OffsetDateTime> = dateUpdated

    /**
     * Returns the raw JSON value of [duration].
     *
     * Unlike [duration], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<String> = duration

    /**
     * Returns the raw JSON value of [errorCode].
     *
     * Unlike [errorCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error_code") @ExcludeMissing fun _errorCode(): JsonField<String> = errorCode

    /**
     * Returns the raw JSON value of [price].
     *
     * Unlike [price], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<String> = price

    /**
     * Returns the raw JSON value of [priceUnit].
     *
     * Unlike [priceUnit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("price_unit") @ExcludeMissing fun _priceUnit(): JsonField<String> = priceUnit

    /**
     * Returns the raw JSON value of [sid].
     *
     * Unlike [sid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sid") @ExcludeMissing fun _sid(): JsonField<String> = sid

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<Source> = source

    /**
     * Returns the raw JSON value of [startTime].
     *
     * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start_time")
    @ExcludeMissing
    fun _startTime(): JsonField<OffsetDateTime> = startTime

    /**
     * Returns the raw JSON value of [track].
     *
     * Unlike [track], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("track") @ExcludeMissing fun _track(): JsonField<Track> = track

    /**
     * Returns the raw JSON value of [uri].
     *
     * Unlike [uri], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("uri") @ExcludeMissing fun _uri(): JsonField<String> = uri

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
         * [RecordingRecordingSidJsonResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RecordingRecordingSidJsonResponse]. */
    class Builder internal constructor() {

        private var accountSid: JsonField<String> = JsonMissing.of()
        private var callSid: JsonField<String> = JsonMissing.of()
        private var channels: JsonField<Channels> = JsonMissing.of()
        private var conferenceSid: JsonField<String> = JsonMissing.of()
        private var dateCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dateUpdated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var duration: JsonField<String> = JsonMissing.of()
        private var errorCode: JsonField<String> = JsonMissing.of()
        private var price: JsonField<String> = JsonMissing.of()
        private var priceUnit: JsonField<String> = JsonMissing.of()
        private var sid: JsonField<String> = JsonMissing.of()
        private var source: JsonField<Source> = JsonMissing.of()
        private var startTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var track: JsonField<Track> = JsonMissing.of()
        private var uri: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(recordingRecordingSidJsonResponse: RecordingRecordingSidJsonResponse) =
            apply {
                accountSid = recordingRecordingSidJsonResponse.accountSid
                callSid = recordingRecordingSidJsonResponse.callSid
                channels = recordingRecordingSidJsonResponse.channels
                conferenceSid = recordingRecordingSidJsonResponse.conferenceSid
                dateCreated = recordingRecordingSidJsonResponse.dateCreated
                dateUpdated = recordingRecordingSidJsonResponse.dateUpdated
                duration = recordingRecordingSidJsonResponse.duration
                errorCode = recordingRecordingSidJsonResponse.errorCode
                price = recordingRecordingSidJsonResponse.price
                priceUnit = recordingRecordingSidJsonResponse.priceUnit
                sid = recordingRecordingSidJsonResponse.sid
                source = recordingRecordingSidJsonResponse.source
                startTime = recordingRecordingSidJsonResponse.startTime
                track = recordingRecordingSidJsonResponse.track
                uri = recordingRecordingSidJsonResponse.uri
                additionalProperties =
                    recordingRecordingSidJsonResponse.additionalProperties.toMutableMap()
            }

        fun accountSid(accountSid: String) = accountSid(JsonField.of(accountSid))

        /**
         * Sets [Builder.accountSid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountSid] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountSid(accountSid: JsonField<String>) = apply { this.accountSid = accountSid }

        fun callSid(callSid: String) = callSid(JsonField.of(callSid))

        /**
         * Sets [Builder.callSid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callSid] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun callSid(callSid: JsonField<String>) = apply { this.callSid = callSid }

        fun channels(channels: Channels) = channels(JsonField.of(channels))

        /**
         * Sets [Builder.channels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.channels] with a well-typed [Channels] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun channels(channels: JsonField<Channels>) = apply { this.channels = channels }

        fun conferenceSid(conferenceSid: String?) =
            conferenceSid(JsonField.ofNullable(conferenceSid))

        /** Alias for calling [Builder.conferenceSid] with `conferenceSid.orElse(null)`. */
        fun conferenceSid(conferenceSid: Optional<String>) =
            conferenceSid(conferenceSid.getOrNull())

        /**
         * Sets [Builder.conferenceSid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conferenceSid] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun conferenceSid(conferenceSid: JsonField<String>) = apply {
            this.conferenceSid = conferenceSid
        }

        fun dateCreated(dateCreated: OffsetDateTime) = dateCreated(JsonField.of(dateCreated))

        /**
         * Sets [Builder.dateCreated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateCreated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dateCreated(dateCreated: JsonField<OffsetDateTime>) = apply {
            this.dateCreated = dateCreated
        }

        fun dateUpdated(dateUpdated: OffsetDateTime) = dateUpdated(JsonField.of(dateUpdated))

        /**
         * Sets [Builder.dateUpdated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateUpdated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dateUpdated(dateUpdated: JsonField<OffsetDateTime>) = apply {
            this.dateUpdated = dateUpdated
        }

        /** The duration of this recording, given in seconds. */
        fun duration(duration: String?) = duration(JsonField.ofNullable(duration))

        /** Alias for calling [Builder.duration] with `duration.orElse(null)`. */
        fun duration(duration: Optional<String>) = duration(duration.getOrNull())

        /**
         * Sets [Builder.duration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.duration] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun duration(duration: JsonField<String>) = apply { this.duration = duration }

        fun errorCode(errorCode: String?) = errorCode(JsonField.ofNullable(errorCode))

        /** Alias for calling [Builder.errorCode] with `errorCode.orElse(null)`. */
        fun errorCode(errorCode: Optional<String>) = errorCode(errorCode.getOrNull())

        /**
         * Sets [Builder.errorCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errorCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun errorCode(errorCode: JsonField<String>) = apply { this.errorCode = errorCode }

        /** The price of this recording, the currency is specified in the price_unit field. */
        fun price(price: String?) = price(JsonField.ofNullable(price))

        /** Alias for calling [Builder.price] with `price.orElse(null)`. */
        fun price(price: Optional<String>) = price(price.getOrNull())

        /**
         * Sets [Builder.price] to an arbitrary JSON value.
         *
         * You should usually call [Builder.price] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun price(price: JsonField<String>) = apply { this.price = price }

        /** The unit in which the price is given. */
        fun priceUnit(priceUnit: String?) = priceUnit(JsonField.ofNullable(priceUnit))

        /** Alias for calling [Builder.priceUnit] with `priceUnit.orElse(null)`. */
        fun priceUnit(priceUnit: Optional<String>) = priceUnit(priceUnit.getOrNull())

        /**
         * Sets [Builder.priceUnit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.priceUnit] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun priceUnit(priceUnit: JsonField<String>) = apply { this.priceUnit = priceUnit }

        /** Identifier of a resource. */
        fun sid(sid: String) = sid(JsonField.of(sid))

        /**
         * Sets [Builder.sid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sid] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sid(sid: JsonField<String>) = apply { this.sid = sid }

        /** Defines how the recording was created. */
        fun source(source: Source) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [Source] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<Source>) = apply { this.source = source }

        fun startTime(startTime: OffsetDateTime) = startTime(JsonField.of(startTime))

        /**
         * Sets [Builder.startTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startTime(startTime: JsonField<OffsetDateTime>) = apply { this.startTime = startTime }

        /** The audio track to record for the call. The default is `both`. */
        fun track(track: Track) = track(JsonField.of(track))

        /**
         * Sets [Builder.track] to an arbitrary JSON value.
         *
         * You should usually call [Builder.track] with a well-typed [Track] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun track(track: JsonField<Track>) = apply { this.track = track }

        /** The relative URI for this recording resource. */
        fun uri(uri: String) = uri(JsonField.of(uri))

        /**
         * Sets [Builder.uri] to an arbitrary JSON value.
         *
         * You should usually call [Builder.uri] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun uri(uri: JsonField<String>) = apply { this.uri = uri }

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
         * Returns an immutable instance of [RecordingRecordingSidJsonResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RecordingRecordingSidJsonResponse =
            RecordingRecordingSidJsonResponse(
                accountSid,
                callSid,
                channels,
                conferenceSid,
                dateCreated,
                dateUpdated,
                duration,
                errorCode,
                price,
                priceUnit,
                sid,
                source,
                startTime,
                track,
                uri,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RecordingRecordingSidJsonResponse = apply {
        if (validated) {
            return@apply
        }

        accountSid()
        callSid()
        channels().ifPresent { it.validate() }
        conferenceSid()
        dateCreated()
        dateUpdated()
        duration()
        errorCode()
        price()
        priceUnit()
        sid()
        source().ifPresent { it.validate() }
        startTime()
        track().ifPresent { it.validate() }
        uri()
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
        (if (accountSid.asKnown().isPresent) 1 else 0) +
            (if (callSid.asKnown().isPresent) 1 else 0) +
            (channels.asKnown().getOrNull()?.validity() ?: 0) +
            (if (conferenceSid.asKnown().isPresent) 1 else 0) +
            (if (dateCreated.asKnown().isPresent) 1 else 0) +
            (if (dateUpdated.asKnown().isPresent) 1 else 0) +
            (if (duration.asKnown().isPresent) 1 else 0) +
            (if (errorCode.asKnown().isPresent) 1 else 0) +
            (if (price.asKnown().isPresent) 1 else 0) +
            (if (priceUnit.asKnown().isPresent) 1 else 0) +
            (if (sid.asKnown().isPresent) 1 else 0) +
            (source.asKnown().getOrNull()?.validity() ?: 0) +
            (if (startTime.asKnown().isPresent) 1 else 0) +
            (track.asKnown().getOrNull()?.validity() ?: 0) +
            (if (uri.asKnown().isPresent) 1 else 0)

    class Channels @JsonCreator private constructor(private val value: JsonField<Long>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<Long> = value

        companion object {

            @JvmField val CHANNEL_1 = of(1L)

            @JvmField val CHANNEL_2 = of(2L)

            @JvmStatic fun of(value: Long) = Channels(JsonField.of(value))
        }

        /** An enum containing [Channels]'s known values. */
        enum class Known {
            CHANNEL_1,
            CHANNEL_2,
        }

        /**
         * An enum containing [Channels]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Channels] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CHANNEL_1,
            CHANNEL_2,
            /** An enum member indicating that [Channels] was instantiated with an unknown value. */
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
                CHANNEL_1 -> Value.CHANNEL_1
                CHANNEL_2 -> Value.CHANNEL_2
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
                CHANNEL_1 -> Known.CHANNEL_1
                CHANNEL_2 -> Known.CHANNEL_2
                else -> throw TelnyxInvalidDataException("Unknown Channels: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asLong(): Long =
            _value().asNumber().getOrNull()?.let {
                if (it.toDouble() % 1 == 0.0) it.toLong() else null
            } ?: throw TelnyxInvalidDataException("Value is not a Long")

        private var validated: Boolean = false

        fun validate(): Channels = apply {
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

            return other is Channels && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Defines how the recording was created. */
    class Source @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val START_CALL_RECORDING_API = of("StartCallRecordingAPI")

            @JvmField val START_CONFERENCE_RECORDING_API = of("StartConferenceRecordingAPI")

            @JvmField val OUTBOUND_API = of("OutboundAPI")

            @JvmField val DIAL_VERB = of("DialVerb")

            @JvmField val CONFERENCE = of("Conference")

            @JvmField val RECORD_VERB = of("RecordVerb")

            @JvmField val TRUNKING = of("Trunking")

            @JvmStatic fun of(value: String) = Source(JsonField.of(value))
        }

        /** An enum containing [Source]'s known values. */
        enum class Known {
            START_CALL_RECORDING_API,
            START_CONFERENCE_RECORDING_API,
            OUTBOUND_API,
            DIAL_VERB,
            CONFERENCE,
            RECORD_VERB,
            TRUNKING,
        }

        /**
         * An enum containing [Source]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Source] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            START_CALL_RECORDING_API,
            START_CONFERENCE_RECORDING_API,
            OUTBOUND_API,
            DIAL_VERB,
            CONFERENCE,
            RECORD_VERB,
            TRUNKING,
            /** An enum member indicating that [Source] was instantiated with an unknown value. */
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
                START_CALL_RECORDING_API -> Value.START_CALL_RECORDING_API
                START_CONFERENCE_RECORDING_API -> Value.START_CONFERENCE_RECORDING_API
                OUTBOUND_API -> Value.OUTBOUND_API
                DIAL_VERB -> Value.DIAL_VERB
                CONFERENCE -> Value.CONFERENCE
                RECORD_VERB -> Value.RECORD_VERB
                TRUNKING -> Value.TRUNKING
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
                START_CALL_RECORDING_API -> Known.START_CALL_RECORDING_API
                START_CONFERENCE_RECORDING_API -> Known.START_CONFERENCE_RECORDING_API
                OUTBOUND_API -> Known.OUTBOUND_API
                DIAL_VERB -> Known.DIAL_VERB
                CONFERENCE -> Known.CONFERENCE
                RECORD_VERB -> Known.RECORD_VERB
                TRUNKING -> Known.TRUNKING
                else -> throw TelnyxInvalidDataException("Unknown Source: $value")
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

        fun validate(): Source = apply {
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

            return other is Source && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The audio track to record for the call. The default is `both`. */
    class Track @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmStatic fun of(value: String) = Track(JsonField.of(value))
        }

        /** An enum containing [Track]'s known values. */
        enum class Known {
            INBOUND,
            OUTBOUND,
            BOTH,
        }

        /**
         * An enum containing [Track]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Track] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            INBOUND,
            OUTBOUND,
            BOTH,
            /** An enum member indicating that [Track] was instantiated with an unknown value. */
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
                else -> throw TelnyxInvalidDataException("Unknown Track: $value")
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

        fun validate(): Track = apply {
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

            return other is Track && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RecordingRecordingSidJsonResponse &&
            accountSid == other.accountSid &&
            callSid == other.callSid &&
            channels == other.channels &&
            conferenceSid == other.conferenceSid &&
            dateCreated == other.dateCreated &&
            dateUpdated == other.dateUpdated &&
            duration == other.duration &&
            errorCode == other.errorCode &&
            price == other.price &&
            priceUnit == other.priceUnit &&
            sid == other.sid &&
            source == other.source &&
            startTime == other.startTime &&
            track == other.track &&
            uri == other.uri &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            accountSid,
            callSid,
            channels,
            conferenceSid,
            dateCreated,
            dateUpdated,
            duration,
            errorCode,
            price,
            priceUnit,
            sid,
            source,
            startTime,
            track,
            uri,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RecordingRecordingSidJsonResponse{accountSid=$accountSid, callSid=$callSid, channels=$channels, conferenceSid=$conferenceSid, dateCreated=$dateCreated, dateUpdated=$dateUpdated, duration=$duration, errorCode=$errorCode, price=$price, priceUnit=$priceUnit, sid=$sid, source=$source, startTime=$startTime, track=$track, uri=$uri, additionalProperties=$additionalProperties}"
}
