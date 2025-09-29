// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.conferences

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
import com.telnyx.api.models.authenticationproviders.PaginationMeta
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ConferenceListParticipantsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<Data>>,
    private val meta: JsonField<PaginationMeta>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of(),
        @JsonProperty("meta") @ExcludeMissing meta: JsonField<PaginationMeta> = JsonMissing.of(),
    ) : this(data, meta, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<List<Data>> = data.getOptional("data")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun meta(): Optional<PaginationMeta> = meta.getOptional("meta")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

    /**
     * Returns the raw JSON value of [meta].
     *
     * Unlike [meta], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("meta") @ExcludeMissing fun _meta(): JsonField<PaginationMeta> = meta

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
         * [ConferenceListParticipantsResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ConferenceListParticipantsResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var meta: JsonField<PaginationMeta> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(conferenceListParticipantsResponse: ConferenceListParticipantsResponse) =
            apply {
                data = conferenceListParticipantsResponse.data.map { it.toMutableList() }
                meta = conferenceListParticipantsResponse.meta
                additionalProperties =
                    conferenceListParticipantsResponse.additionalProperties.toMutableMap()
            }

        fun data(data: List<Data>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed `List<Data>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<List<Data>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [Data] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: Data) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
        }

        fun meta(meta: PaginationMeta) = meta(JsonField.of(meta))

        /**
         * Sets [Builder.meta] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meta] with a well-typed [PaginationMeta] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun meta(meta: JsonField<PaginationMeta>) = apply { this.meta = meta }

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
         * Returns an immutable instance of [ConferenceListParticipantsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ConferenceListParticipantsResponse =
            ConferenceListParticipantsResponse(
                (data ?: JsonMissing.of()).map { it.toImmutable() },
                meta,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ConferenceListParticipantsResponse = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.forEach { it.validate() } }
        meta().ifPresent { it.validate() }
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
        (data.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (meta.asKnown().getOrNull()?.validity() ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val callControlId: JsonField<String>,
        private val callLegId: JsonField<String>,
        private val conference: JsonField<Conference>,
        private val createdAt: JsonField<String>,
        private val endConferenceOnExit: JsonField<Boolean>,
        private val muted: JsonField<Boolean>,
        private val onHold: JsonField<Boolean>,
        private val recordType: JsonField<RecordType>,
        private val softEndConferenceOnExit: JsonField<Boolean>,
        private val status: JsonField<Status>,
        private val updatedAt: JsonField<String>,
        private val whisperCallControlIds: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("call_control_id")
            @ExcludeMissing
            callControlId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("call_leg_id")
            @ExcludeMissing
            callLegId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("conference")
            @ExcludeMissing
            conference: JsonField<Conference> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("end_conference_on_exit")
            @ExcludeMissing
            endConferenceOnExit: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("muted") @ExcludeMissing muted: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("on_hold") @ExcludeMissing onHold: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<RecordType> = JsonMissing.of(),
            @JsonProperty("soft_end_conference_on_exit")
            @ExcludeMissing
            softEndConferenceOnExit: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("whisper_call_control_ids")
            @ExcludeMissing
            whisperCallControlIds: JsonField<List<String>> = JsonMissing.of(),
        ) : this(
            id,
            callControlId,
            callLegId,
            conference,
            createdAt,
            endConferenceOnExit,
            muted,
            onHold,
            recordType,
            softEndConferenceOnExit,
            status,
            updatedAt,
            whisperCallControlIds,
            mutableMapOf(),
        )

        /**
         * Uniquely identifies the participant
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Call Control ID associated with the partiipant of the conference
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun callControlId(): String = callControlId.getRequired("call_control_id")

        /**
         * Uniquely identifies the call leg associated with the participant
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun callLegId(): String = callLegId.getRequired("call_leg_id")

        /**
         * Info about the conference that the participant is in
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun conference(): Conference = conference.getRequired("conference")

        /**
         * ISO 8601 formatted date of when the participant was created
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): String = createdAt.getRequired("created_at")

        /**
         * Whether the conference will end and all remaining participants be hung up after the
         * participant leaves the conference.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun endConferenceOnExit(): Boolean =
            endConferenceOnExit.getRequired("end_conference_on_exit")

        /**
         * Whether the participant is muted.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun muted(): Boolean = muted.getRequired("muted")

        /**
         * Whether the participant is put on_hold.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun onHold(): Boolean = onHold.getRequired("on_hold")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun recordType(): RecordType = recordType.getRequired("record_type")

        /**
         * Whether the conference will end after the participant leaves the conference.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun softEndConferenceOnExit(): Boolean =
            softEndConferenceOnExit.getRequired("soft_end_conference_on_exit")

        /**
         * The status of the participant with respect to the lifecycle within the conference
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * ISO 8601 formatted date of when the participant was last updated
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): String = updatedAt.getRequired("updated_at")

        /**
         * Array of unique call_control_ids the participant can whisper to..
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun whisperCallControlIds(): List<String> =
            whisperCallControlIds.getRequired("whisper_call_control_ids")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [callControlId].
         *
         * Unlike [callControlId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("call_control_id")
        @ExcludeMissing
        fun _callControlId(): JsonField<String> = callControlId

        /**
         * Returns the raw JSON value of [callLegId].
         *
         * Unlike [callLegId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("call_leg_id") @ExcludeMissing fun _callLegId(): JsonField<String> = callLegId

        /**
         * Returns the raw JSON value of [conference].
         *
         * Unlike [conference], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("conference")
        @ExcludeMissing
        fun _conference(): JsonField<Conference> = conference

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

        /**
         * Returns the raw JSON value of [endConferenceOnExit].
         *
         * Unlike [endConferenceOnExit], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("end_conference_on_exit")
        @ExcludeMissing
        fun _endConferenceOnExit(): JsonField<Boolean> = endConferenceOnExit

        /**
         * Returns the raw JSON value of [muted].
         *
         * Unlike [muted], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("muted") @ExcludeMissing fun _muted(): JsonField<Boolean> = muted

        /**
         * Returns the raw JSON value of [onHold].
         *
         * Unlike [onHold], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("on_hold") @ExcludeMissing fun _onHold(): JsonField<Boolean> = onHold

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<RecordType> = recordType

        /**
         * Returns the raw JSON value of [softEndConferenceOnExit].
         *
         * Unlike [softEndConferenceOnExit], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("soft_end_conference_on_exit")
        @ExcludeMissing
        fun _softEndConferenceOnExit(): JsonField<Boolean> = softEndConferenceOnExit

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt(): JsonField<String> = updatedAt

        /**
         * Returns the raw JSON value of [whisperCallControlIds].
         *
         * Unlike [whisperCallControlIds], this method doesn't throw if the JSON field has an
         * unexpected type.
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
             * Returns a mutable builder for constructing an instance of [Data].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .callControlId()
             * .callLegId()
             * .conference()
             * .createdAt()
             * .endConferenceOnExit()
             * .muted()
             * .onHold()
             * .recordType()
             * .softEndConferenceOnExit()
             * .status()
             * .updatedAt()
             * .whisperCallControlIds()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var callControlId: JsonField<String>? = null
            private var callLegId: JsonField<String>? = null
            private var conference: JsonField<Conference>? = null
            private var createdAt: JsonField<String>? = null
            private var endConferenceOnExit: JsonField<Boolean>? = null
            private var muted: JsonField<Boolean>? = null
            private var onHold: JsonField<Boolean>? = null
            private var recordType: JsonField<RecordType>? = null
            private var softEndConferenceOnExit: JsonField<Boolean>? = null
            private var status: JsonField<Status>? = null
            private var updatedAt: JsonField<String>? = null
            private var whisperCallControlIds: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                callControlId = data.callControlId
                callLegId = data.callLegId
                conference = data.conference
                createdAt = data.createdAt
                endConferenceOnExit = data.endConferenceOnExit
                muted = data.muted
                onHold = data.onHold
                recordType = data.recordType
                softEndConferenceOnExit = data.softEndConferenceOnExit
                status = data.status
                updatedAt = data.updatedAt
                whisperCallControlIds = data.whisperCallControlIds.map { it.toMutableList() }
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Uniquely identifies the participant */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Call Control ID associated with the partiipant of the conference */
            fun callControlId(callControlId: String) = callControlId(JsonField.of(callControlId))

            /**
             * Sets [Builder.callControlId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callControlId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun callControlId(callControlId: JsonField<String>) = apply {
                this.callControlId = callControlId
            }

            /** Uniquely identifies the call leg associated with the participant */
            fun callLegId(callLegId: String) = callLegId(JsonField.of(callLegId))

            /**
             * Sets [Builder.callLegId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callLegId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun callLegId(callLegId: JsonField<String>) = apply { this.callLegId = callLegId }

            /** Info about the conference that the participant is in */
            fun conference(conference: Conference) = conference(JsonField.of(conference))

            /**
             * Sets [Builder.conference] to an arbitrary JSON value.
             *
             * You should usually call [Builder.conference] with a well-typed [Conference] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun conference(conference: JsonField<Conference>) = apply {
                this.conference = conference
            }

            /** ISO 8601 formatted date of when the participant was created */
            fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

            /**
             * Whether the conference will end and all remaining participants be hung up after the
             * participant leaves the conference.
             */
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

            /** Whether the participant is muted. */
            fun muted(muted: Boolean) = muted(JsonField.of(muted))

            /**
             * Sets [Builder.muted] to an arbitrary JSON value.
             *
             * You should usually call [Builder.muted] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun muted(muted: JsonField<Boolean>) = apply { this.muted = muted }

            /** Whether the participant is put on_hold. */
            fun onHold(onHold: Boolean) = onHold(JsonField.of(onHold))

            /**
             * Sets [Builder.onHold] to an arbitrary JSON value.
             *
             * You should usually call [Builder.onHold] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun onHold(onHold: JsonField<Boolean>) = apply { this.onHold = onHold }

            fun recordType(recordType: RecordType) = recordType(JsonField.of(recordType))

            /**
             * Sets [Builder.recordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordType] with a well-typed [RecordType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordType(recordType: JsonField<RecordType>) = apply {
                this.recordType = recordType
            }

            /** Whether the conference will end after the participant leaves the conference. */
            fun softEndConferenceOnExit(softEndConferenceOnExit: Boolean) =
                softEndConferenceOnExit(JsonField.of(softEndConferenceOnExit))

            /**
             * Sets [Builder.softEndConferenceOnExit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.softEndConferenceOnExit] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun softEndConferenceOnExit(softEndConferenceOnExit: JsonField<Boolean>) = apply {
                this.softEndConferenceOnExit = softEndConferenceOnExit
            }

            /** The status of the participant with respect to the lifecycle within the conference */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** ISO 8601 formatted date of when the participant was last updated */
            fun updatedAt(updatedAt: String) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<String>) = apply { this.updatedAt = updatedAt }

            /** Array of unique call_control_ids the participant can whisper to.. */
            fun whisperCallControlIds(whisperCallControlIds: List<String>) =
                whisperCallControlIds(JsonField.of(whisperCallControlIds))

            /**
             * Sets [Builder.whisperCallControlIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.whisperCallControlIds] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .callControlId()
             * .callLegId()
             * .conference()
             * .createdAt()
             * .endConferenceOnExit()
             * .muted()
             * .onHold()
             * .recordType()
             * .softEndConferenceOnExit()
             * .status()
             * .updatedAt()
             * .whisperCallControlIds()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("id", id),
                    checkRequired("callControlId", callControlId),
                    checkRequired("callLegId", callLegId),
                    checkRequired("conference", conference),
                    checkRequired("createdAt", createdAt),
                    checkRequired("endConferenceOnExit", endConferenceOnExit),
                    checkRequired("muted", muted),
                    checkRequired("onHold", onHold),
                    checkRequired("recordType", recordType),
                    checkRequired("softEndConferenceOnExit", softEndConferenceOnExit),
                    checkRequired("status", status),
                    checkRequired("updatedAt", updatedAt),
                    checkRequired("whisperCallControlIds", whisperCallControlIds).map {
                        it.toImmutable()
                    },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            id()
            callControlId()
            callLegId()
            conference().validate()
            createdAt()
            endConferenceOnExit()
            muted()
            onHold()
            recordType().validate()
            softEndConferenceOnExit()
            status().validate()
            updatedAt()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (callControlId.asKnown().isPresent) 1 else 0) +
                (if (callLegId.asKnown().isPresent) 1 else 0) +
                (conference.asKnown().getOrNull()?.validity() ?: 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (endConferenceOnExit.asKnown().isPresent) 1 else 0) +
                (if (muted.asKnown().isPresent) 1 else 0) +
                (if (onHold.asKnown().isPresent) 1 else 0) +
                (recordType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (softEndConferenceOnExit.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (whisperCallControlIds.asKnown().getOrNull()?.size ?: 0)

        /** Info about the conference that the participant is in */
        class Conference
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val name: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            ) : this(id, name, mutableMapOf())

            /**
             * Uniquely identifies the conference
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            /**
             * Name of the conference
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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

                /** Returns a mutable builder for constructing an instance of [Conference]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Conference]. */
            class Builder internal constructor() {

                private var id: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(conference: Conference) = apply {
                    id = conference.id
                    name = conference.name
                    additionalProperties = conference.additionalProperties.toMutableMap()
                }

                /** Uniquely identifies the conference */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** Name of the conference */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Conference].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Conference = Conference(id, name, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Conference = apply {
                if (validated) {
                    return@apply
                }

                id()
                name()
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
                (if (id.asKnown().isPresent) 1 else 0) + (if (name.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Conference &&
                    id == other.id &&
                    name == other.name &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(id, name, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Conference{id=$id, name=$name, additionalProperties=$additionalProperties}"
        }

        class RecordType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                @JvmField val PARTICIPANT = of("participant")

                @JvmStatic fun of(value: String) = RecordType(JsonField.of(value))
            }

            /** An enum containing [RecordType]'s known values. */
            enum class Known {
                PARTICIPANT
            }

            /**
             * An enum containing [RecordType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [RecordType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PARTICIPANT,
                /**
                 * An enum member indicating that [RecordType] was instantiated with an unknown
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
                    PARTICIPANT -> Value.PARTICIPANT
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
                    PARTICIPANT -> Known.PARTICIPANT
                    else -> throw TelnyxInvalidDataException("Unknown RecordType: $value")
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

            fun validate(): RecordType = apply {
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

                return other is RecordType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The status of the participant with respect to the lifecycle within the conference */
        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val JOINING = of("joining")

                @JvmField val JOINED = of("joined")

                @JvmField val LEFT = of("left")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                JOINING,
                JOINED,
                LEFT,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                JOINING,
                JOINED,
                LEFT,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
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
                    JOINING -> Value.JOINING
                    JOINED -> Value.JOINED
                    LEFT -> Value.LEFT
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
                    JOINING -> Known.JOINING
                    JOINED -> Known.JOINED
                    LEFT -> Known.LEFT
                    else -> throw TelnyxInvalidDataException("Unknown Status: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                id == other.id &&
                callControlId == other.callControlId &&
                callLegId == other.callLegId &&
                conference == other.conference &&
                createdAt == other.createdAt &&
                endConferenceOnExit == other.endConferenceOnExit &&
                muted == other.muted &&
                onHold == other.onHold &&
                recordType == other.recordType &&
                softEndConferenceOnExit == other.softEndConferenceOnExit &&
                status == other.status &&
                updatedAt == other.updatedAt &&
                whisperCallControlIds == other.whisperCallControlIds &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                callControlId,
                callLegId,
                conference,
                createdAt,
                endConferenceOnExit,
                muted,
                onHold,
                recordType,
                softEndConferenceOnExit,
                status,
                updatedAt,
                whisperCallControlIds,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, callControlId=$callControlId, callLegId=$callLegId, conference=$conference, createdAt=$createdAt, endConferenceOnExit=$endConferenceOnExit, muted=$muted, onHold=$onHold, recordType=$recordType, softEndConferenceOnExit=$softEndConferenceOnExit, status=$status, updatedAt=$updatedAt, whisperCallControlIds=$whisperCallControlIds, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConferenceListParticipantsResponse &&
            data == other.data &&
            meta == other.meta &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, meta, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ConferenceListParticipantsResponse{data=$data, meta=$meta, additionalProperties=$additionalProperties}"
}
