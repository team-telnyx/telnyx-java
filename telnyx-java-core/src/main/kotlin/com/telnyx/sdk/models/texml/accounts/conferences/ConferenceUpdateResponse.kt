// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.conferences

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ConferenceUpdateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accountSid: JsonField<String>,
    private val apiVersion: JsonField<String>,
    private val callSidEndingConference: JsonField<String>,
    private val dateCreated: JsonField<String>,
    private val dateUpdated: JsonField<String>,
    private val friendlyName: JsonField<String>,
    private val reasonConferenceEnded: JsonField<ReasonConferenceEnded>,
    private val region: JsonField<String>,
    private val sid: JsonField<String>,
    private val status: JsonField<Status>,
    private val subresourceUris: JsonField<SubresourceUris>,
    private val uri: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("account_sid")
        @ExcludeMissing
        accountSid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("api_version")
        @ExcludeMissing
        apiVersion: JsonField<String> = JsonMissing.of(),
        @JsonProperty("call_sid_ending_conference")
        @ExcludeMissing
        callSidEndingConference: JsonField<String> = JsonMissing.of(),
        @JsonProperty("date_created")
        @ExcludeMissing
        dateCreated: JsonField<String> = JsonMissing.of(),
        @JsonProperty("date_updated")
        @ExcludeMissing
        dateUpdated: JsonField<String> = JsonMissing.of(),
        @JsonProperty("friendly_name")
        @ExcludeMissing
        friendlyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reason_conference_ended")
        @ExcludeMissing
        reasonConferenceEnded: JsonField<ReasonConferenceEnded> = JsonMissing.of(),
        @JsonProperty("region") @ExcludeMissing region: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sid") @ExcludeMissing sid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("subresource_uris")
        @ExcludeMissing
        subresourceUris: JsonField<SubresourceUris> = JsonMissing.of(),
        @JsonProperty("uri") @ExcludeMissing uri: JsonField<String> = JsonMissing.of(),
    ) : this(
        accountSid,
        apiVersion,
        callSidEndingConference,
        dateCreated,
        dateUpdated,
        friendlyName,
        reasonConferenceEnded,
        region,
        sid,
        status,
        subresourceUris,
        uri,
        mutableMapOf(),
    )

    /**
     * The id of the account the resource belongs to.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountSid(): Optional<String> = accountSid.getOptional("account_sid")

    /**
     * The version of the API that was used to make the request.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun apiVersion(): Optional<String> = apiVersion.getOptional("api_version")

    /**
     * Caller ID, if present.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callSidEndingConference(): Optional<String> =
        callSidEndingConference.getOptional("call_sid_ending_conference")

    /**
     * The timestamp of when the resource was created.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dateCreated(): Optional<String> = dateCreated.getOptional("date_created")

    /**
     * The timestamp of when the resource was last updated.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dateUpdated(): Optional<String> = dateUpdated.getOptional("date_updated")

    /**
     * A string that you assigned to describe this conference room.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun friendlyName(): Optional<String> = friendlyName.getOptional("friendly_name")

    /**
     * The reason why a conference ended. When a conference is in progress, will be null.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reasonConferenceEnded(): Optional<ReasonConferenceEnded> =
        reasonConferenceEnded.getOptional("reason_conference_ended")

    /**
     * A string representing the region where the conference is hosted.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun region(): Optional<String> = region.getOptional("region")

    /**
     * The unique identifier of the conference.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sid(): Optional<String> = sid.getOptional("sid")

    /**
     * The status of this conference.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = status.getOptional("status")

    /**
     * A list of related resources identified by their relative URIs.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subresourceUris(): Optional<SubresourceUris> =
        subresourceUris.getOptional("subresource_uris")

    /**
     * The relative URI for this conference.
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
     * Returns the raw JSON value of [apiVersion].
     *
     * Unlike [apiVersion], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("api_version") @ExcludeMissing fun _apiVersion(): JsonField<String> = apiVersion

    /**
     * Returns the raw JSON value of [callSidEndingConference].
     *
     * Unlike [callSidEndingConference], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("call_sid_ending_conference")
    @ExcludeMissing
    fun _callSidEndingConference(): JsonField<String> = callSidEndingConference

    /**
     * Returns the raw JSON value of [dateCreated].
     *
     * Unlike [dateCreated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("date_created")
    @ExcludeMissing
    fun _dateCreated(): JsonField<String> = dateCreated

    /**
     * Returns the raw JSON value of [dateUpdated].
     *
     * Unlike [dateUpdated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("date_updated")
    @ExcludeMissing
    fun _dateUpdated(): JsonField<String> = dateUpdated

    /**
     * Returns the raw JSON value of [friendlyName].
     *
     * Unlike [friendlyName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("friendly_name")
    @ExcludeMissing
    fun _friendlyName(): JsonField<String> = friendlyName

    /**
     * Returns the raw JSON value of [reasonConferenceEnded].
     *
     * Unlike [reasonConferenceEnded], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("reason_conference_ended")
    @ExcludeMissing
    fun _reasonConferenceEnded(): JsonField<ReasonConferenceEnded> = reasonConferenceEnded

    /**
     * Returns the raw JSON value of [region].
     *
     * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

    /**
     * Returns the raw JSON value of [sid].
     *
     * Unlike [sid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sid") @ExcludeMissing fun _sid(): JsonField<String> = sid

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [subresourceUris].
     *
     * Unlike [subresourceUris], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subresource_uris")
    @ExcludeMissing
    fun _subresourceUris(): JsonField<SubresourceUris> = subresourceUris

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

        /** Returns a mutable builder for constructing an instance of [ConferenceUpdateResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ConferenceUpdateResponse]. */
    class Builder internal constructor() {

        private var accountSid: JsonField<String> = JsonMissing.of()
        private var apiVersion: JsonField<String> = JsonMissing.of()
        private var callSidEndingConference: JsonField<String> = JsonMissing.of()
        private var dateCreated: JsonField<String> = JsonMissing.of()
        private var dateUpdated: JsonField<String> = JsonMissing.of()
        private var friendlyName: JsonField<String> = JsonMissing.of()
        private var reasonConferenceEnded: JsonField<ReasonConferenceEnded> = JsonMissing.of()
        private var region: JsonField<String> = JsonMissing.of()
        private var sid: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var subresourceUris: JsonField<SubresourceUris> = JsonMissing.of()
        private var uri: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(conferenceUpdateResponse: ConferenceUpdateResponse) = apply {
            accountSid = conferenceUpdateResponse.accountSid
            apiVersion = conferenceUpdateResponse.apiVersion
            callSidEndingConference = conferenceUpdateResponse.callSidEndingConference
            dateCreated = conferenceUpdateResponse.dateCreated
            dateUpdated = conferenceUpdateResponse.dateUpdated
            friendlyName = conferenceUpdateResponse.friendlyName
            reasonConferenceEnded = conferenceUpdateResponse.reasonConferenceEnded
            region = conferenceUpdateResponse.region
            sid = conferenceUpdateResponse.sid
            status = conferenceUpdateResponse.status
            subresourceUris = conferenceUpdateResponse.subresourceUris
            uri = conferenceUpdateResponse.uri
            additionalProperties = conferenceUpdateResponse.additionalProperties.toMutableMap()
        }

        /** The id of the account the resource belongs to. */
        fun accountSid(accountSid: String) = accountSid(JsonField.of(accountSid))

        /**
         * Sets [Builder.accountSid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountSid] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountSid(accountSid: JsonField<String>) = apply { this.accountSid = accountSid }

        /** The version of the API that was used to make the request. */
        fun apiVersion(apiVersion: String) = apiVersion(JsonField.of(apiVersion))

        /**
         * Sets [Builder.apiVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.apiVersion] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun apiVersion(apiVersion: JsonField<String>) = apply { this.apiVersion = apiVersion }

        /** Caller ID, if present. */
        fun callSidEndingConference(callSidEndingConference: String) =
            callSidEndingConference(JsonField.of(callSidEndingConference))

        /**
         * Sets [Builder.callSidEndingConference] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callSidEndingConference] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun callSidEndingConference(callSidEndingConference: JsonField<String>) = apply {
            this.callSidEndingConference = callSidEndingConference
        }

        /** The timestamp of when the resource was created. */
        fun dateCreated(dateCreated: String) = dateCreated(JsonField.of(dateCreated))

        /**
         * Sets [Builder.dateCreated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateCreated] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dateCreated(dateCreated: JsonField<String>) = apply { this.dateCreated = dateCreated }

        /** The timestamp of when the resource was last updated. */
        fun dateUpdated(dateUpdated: String) = dateUpdated(JsonField.of(dateUpdated))

        /**
         * Sets [Builder.dateUpdated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateUpdated] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dateUpdated(dateUpdated: JsonField<String>) = apply { this.dateUpdated = dateUpdated }

        /** A string that you assigned to describe this conference room. */
        fun friendlyName(friendlyName: String) = friendlyName(JsonField.of(friendlyName))

        /**
         * Sets [Builder.friendlyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.friendlyName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun friendlyName(friendlyName: JsonField<String>) = apply {
            this.friendlyName = friendlyName
        }

        /** The reason why a conference ended. When a conference is in progress, will be null. */
        fun reasonConferenceEnded(reasonConferenceEnded: ReasonConferenceEnded) =
            reasonConferenceEnded(JsonField.of(reasonConferenceEnded))

        /**
         * Sets [Builder.reasonConferenceEnded] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reasonConferenceEnded] with a well-typed
         * [ReasonConferenceEnded] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun reasonConferenceEnded(reasonConferenceEnded: JsonField<ReasonConferenceEnded>) = apply {
            this.reasonConferenceEnded = reasonConferenceEnded
        }

        /** A string representing the region where the conference is hosted. */
        fun region(region: String) = region(JsonField.of(region))

        /**
         * Sets [Builder.region] to an arbitrary JSON value.
         *
         * You should usually call [Builder.region] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun region(region: JsonField<String>) = apply { this.region = region }

        /** The unique identifier of the conference. */
        fun sid(sid: String) = sid(JsonField.of(sid))

        /**
         * Sets [Builder.sid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sid] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sid(sid: JsonField<String>) = apply { this.sid = sid }

        /** The status of this conference. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** A list of related resources identified by their relative URIs. */
        fun subresourceUris(subresourceUris: SubresourceUris) =
            subresourceUris(JsonField.of(subresourceUris))

        /**
         * Sets [Builder.subresourceUris] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subresourceUris] with a well-typed [SubresourceUris]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun subresourceUris(subresourceUris: JsonField<SubresourceUris>) = apply {
            this.subresourceUris = subresourceUris
        }

        /** The relative URI for this conference. */
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
         * Returns an immutable instance of [ConferenceUpdateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ConferenceUpdateResponse =
            ConferenceUpdateResponse(
                accountSid,
                apiVersion,
                callSidEndingConference,
                dateCreated,
                dateUpdated,
                friendlyName,
                reasonConferenceEnded,
                region,
                sid,
                status,
                subresourceUris,
                uri,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ConferenceUpdateResponse = apply {
        if (validated) {
            return@apply
        }

        accountSid()
        apiVersion()
        callSidEndingConference()
        dateCreated()
        dateUpdated()
        friendlyName()
        reasonConferenceEnded().ifPresent { it.validate() }
        region()
        sid()
        status().ifPresent { it.validate() }
        subresourceUris().ifPresent { it.validate() }
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
            (if (apiVersion.asKnown().isPresent) 1 else 0) +
            (if (callSidEndingConference.asKnown().isPresent) 1 else 0) +
            (if (dateCreated.asKnown().isPresent) 1 else 0) +
            (if (dateUpdated.asKnown().isPresent) 1 else 0) +
            (if (friendlyName.asKnown().isPresent) 1 else 0) +
            (reasonConferenceEnded.asKnown().getOrNull()?.validity() ?: 0) +
            (if (region.asKnown().isPresent) 1 else 0) +
            (if (sid.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (subresourceUris.asKnown().getOrNull()?.validity() ?: 0) +
            (if (uri.asKnown().isPresent) 1 else 0)

    /** The reason why a conference ended. When a conference is in progress, will be null. */
    class ReasonConferenceEnded
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

            @JvmField
            val PARTICIPANT_WITH_END_CONFERENCE_ON_EXIT_LEFT =
                of("participant-with-end-conference-on-exit-left")

            @JvmField val LAST_PARTICIPANT_LEFT = of("last-participant-left")

            @JvmField val CONFERENCE_ENDED_VIA_API = of("conference-ended-via-api")

            @JvmField val TIME_EXCEEDED = of("time-exceeded")

            @JvmStatic fun of(value: String) = ReasonConferenceEnded(JsonField.of(value))
        }

        /** An enum containing [ReasonConferenceEnded]'s known values. */
        enum class Known {
            PARTICIPANT_WITH_END_CONFERENCE_ON_EXIT_LEFT,
            LAST_PARTICIPANT_LEFT,
            CONFERENCE_ENDED_VIA_API,
            TIME_EXCEEDED,
        }

        /**
         * An enum containing [ReasonConferenceEnded]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [ReasonConferenceEnded] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PARTICIPANT_WITH_END_CONFERENCE_ON_EXIT_LEFT,
            LAST_PARTICIPANT_LEFT,
            CONFERENCE_ENDED_VIA_API,
            TIME_EXCEEDED,
            /**
             * An enum member indicating that [ReasonConferenceEnded] was instantiated with an
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
                PARTICIPANT_WITH_END_CONFERENCE_ON_EXIT_LEFT ->
                    Value.PARTICIPANT_WITH_END_CONFERENCE_ON_EXIT_LEFT
                LAST_PARTICIPANT_LEFT -> Value.LAST_PARTICIPANT_LEFT
                CONFERENCE_ENDED_VIA_API -> Value.CONFERENCE_ENDED_VIA_API
                TIME_EXCEEDED -> Value.TIME_EXCEEDED
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
                PARTICIPANT_WITH_END_CONFERENCE_ON_EXIT_LEFT ->
                    Known.PARTICIPANT_WITH_END_CONFERENCE_ON_EXIT_LEFT
                LAST_PARTICIPANT_LEFT -> Known.LAST_PARTICIPANT_LEFT
                CONFERENCE_ENDED_VIA_API -> Known.CONFERENCE_ENDED_VIA_API
                TIME_EXCEEDED -> Known.TIME_EXCEEDED
                else -> throw TelnyxInvalidDataException("Unknown ReasonConferenceEnded: $value")
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

        fun validate(): ReasonConferenceEnded = apply {
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

            return other is ReasonConferenceEnded && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The status of this conference. */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val INIT = of("init")

            @JvmField val IN_PROGRESS = of("in-progress")

            @JvmField val COMPLETED = of("completed")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            INIT,
            IN_PROGRESS,
            COMPLETED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            INIT,
            IN_PROGRESS,
            COMPLETED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                INIT -> Value.INIT
                IN_PROGRESS -> Value.IN_PROGRESS
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
                INIT -> Known.INIT
                IN_PROGRESS -> Known.IN_PROGRESS
                COMPLETED -> Known.COMPLETED
                else -> throw TelnyxInvalidDataException("Unknown Status: $value")
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

        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** A list of related resources identified by their relative URIs. */
    class SubresourceUris
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

            /** Returns a mutable builder for constructing an instance of [SubresourceUris]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SubresourceUris]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(subresourceUris: SubresourceUris) = apply {
                additionalProperties = subresourceUris.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [SubresourceUris].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): SubresourceUris = SubresourceUris(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): SubresourceUris = apply {
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

            return other is SubresourceUris && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "SubresourceUris{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConferenceUpdateResponse &&
            accountSid == other.accountSid &&
            apiVersion == other.apiVersion &&
            callSidEndingConference == other.callSidEndingConference &&
            dateCreated == other.dateCreated &&
            dateUpdated == other.dateUpdated &&
            friendlyName == other.friendlyName &&
            reasonConferenceEnded == other.reasonConferenceEnded &&
            region == other.region &&
            sid == other.sid &&
            status == other.status &&
            subresourceUris == other.subresourceUris &&
            uri == other.uri &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            accountSid,
            apiVersion,
            callSidEndingConference,
            dateCreated,
            dateUpdated,
            friendlyName,
            reasonConferenceEnded,
            region,
            sid,
            status,
            subresourceUris,
            uri,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ConferenceUpdateResponse{accountSid=$accountSid, apiVersion=$apiVersion, callSidEndingConference=$callSidEndingConference, dateCreated=$dateCreated, dateUpdated=$dateUpdated, friendlyName=$friendlyName, reasonConferenceEnded=$reasonConferenceEnded, region=$region, sid=$sid, status=$status, subresourceUris=$subresourceUris, uri=$uri, additionalProperties=$additionalProperties}"
}
