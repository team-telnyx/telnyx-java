// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.simcards

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
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import com.telnyx.api.models.authenticationproviders.PaginationMeta
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class SimCardListWirelessConnectivityLogsResponse
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
         * [SimCardListWirelessConnectivityLogsResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SimCardListWirelessConnectivityLogsResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var meta: JsonField<PaginationMeta> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            simCardListWirelessConnectivityLogsResponse: SimCardListWirelessConnectivityLogsResponse
        ) = apply {
            data = simCardListWirelessConnectivityLogsResponse.data.map { it.toMutableList() }
            meta = simCardListWirelessConnectivityLogsResponse.meta
            additionalProperties =
                simCardListWirelessConnectivityLogsResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [SimCardListWirelessConnectivityLogsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SimCardListWirelessConnectivityLogsResponse =
            SimCardListWirelessConnectivityLogsResponse(
                (data ?: JsonMissing.of()).map { it.toImmutable() },
                meta,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SimCardListWirelessConnectivityLogsResponse = apply {
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

    /**
     * This object represents a wireless connectivity session log that happened through a SIM card.
     * It aids in finding out potential problems when the SIM is not able to attach properly.
     */
    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<Long>,
        private val apn: JsonField<String>,
        private val cellId: JsonField<String>,
        private val createdAt: JsonField<String>,
        private val imei: JsonField<String>,
        private val imsi: JsonField<String>,
        private val ipv4: JsonField<String>,
        private val ipv6: JsonField<String>,
        private val lastSeen: JsonField<String>,
        private val logType: JsonField<LogType>,
        private val mobileCountryCode: JsonField<String>,
        private val mobileNetworkCode: JsonField<String>,
        private val radioAccessTechnology: JsonField<String>,
        private val recordType: JsonField<String>,
        private val simCardId: JsonField<String>,
        private val startTime: JsonField<String>,
        private val state: JsonField<String>,
        private val stopTime: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("apn") @ExcludeMissing apn: JsonField<String> = JsonMissing.of(),
            @JsonProperty("cell_id") @ExcludeMissing cellId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("imei") @ExcludeMissing imei: JsonField<String> = JsonMissing.of(),
            @JsonProperty("imsi") @ExcludeMissing imsi: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ipv4") @ExcludeMissing ipv4: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ipv6") @ExcludeMissing ipv6: JsonField<String> = JsonMissing.of(),
            @JsonProperty("last_seen")
            @ExcludeMissing
            lastSeen: JsonField<String> = JsonMissing.of(),
            @JsonProperty("log_type")
            @ExcludeMissing
            logType: JsonField<LogType> = JsonMissing.of(),
            @JsonProperty("mobile_country_code")
            @ExcludeMissing
            mobileCountryCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("mobile_network_code")
            @ExcludeMissing
            mobileNetworkCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("radio_access_technology")
            @ExcludeMissing
            radioAccessTechnology: JsonField<String> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sim_card_id")
            @ExcludeMissing
            simCardId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("start_time")
            @ExcludeMissing
            startTime: JsonField<String> = JsonMissing.of(),
            @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
            @JsonProperty("stop_time")
            @ExcludeMissing
            stopTime: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            apn,
            cellId,
            createdAt,
            imei,
            imsi,
            ipv4,
            ipv6,
            lastSeen,
            logType,
            mobileCountryCode,
            mobileNetworkCode,
            radioAccessTechnology,
            recordType,
            simCardId,
            startTime,
            state,
            stopTime,
            mutableMapOf(),
        )

        /**
         * Uniquely identifies the session.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<Long> = id.getOptional("id")

        /**
         * The Access Point Name (APN) identifies the packet data network that a mobile data user
         * wants to communicate with.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun apn(): Optional<String> = apn.getOptional("apn")

        /**
         * The cell ID to which the SIM connected.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cellId(): Optional<String> = cellId.getOptional("cell_id")

        /**
         * ISO 8601 formatted date-time indicating when the record was created.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): Optional<String> = createdAt.getOptional("created_at")

        /**
         * The International Mobile Equipment Identity (or IMEI) is a number, usually unique, that
         * identifies the device currently being used connect to the network.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun imei(): Optional<String> = imei.getOptional("imei")

        /**
         * SIM cards are identified on their individual network operators by a unique International
         * Mobile Subscriber Identity (IMSI). <br/> Mobile network operators connect mobile phone
         * calls and communicate with their market SIM cards using their IMSIs. The IMSI is stored
         * in the Subscriber Identity Module (SIM) inside the device and is sent by the device to
         * the appropriate network. It is used to acquire the details of the device in the Home
         * Location Register (HLR) or the Visitor Location Register (VLR).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun imsi(): Optional<String> = imsi.getOptional("imsi")

        /**
         * The SIM's address in the currently connected network. This IPv4 address is usually
         * obtained dynamically, so it may vary according to the location or new connections.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ipv4(): Optional<String> = ipv4.getOptional("ipv4")

        /**
         * The SIM's address in the currently connected network. This IPv6 address is usually
         * obtained dynamically, so it may vary according to the location or new connections.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ipv6(): Optional<String> = ipv6.getOptional("ipv6")

        /**
         * ISO 8601 formatted date-time indicating when the last heartbeat to the device was
         * successfully recorded.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lastSeen(): Optional<String> = lastSeen.getOptional("last_seen")

        /**
         * The type of the session, 'registration' being the initial authentication session and
         * 'data' the actual data transfer sessions.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun logType(): Optional<LogType> = logType.getOptional("log_type")

        /**
         * It's a three decimal digit that identifies a country.<br/><br/> This code is commonly
         * seen joined with a Mobile Network Code (MNC) in a tuple that allows identifying a carrier
         * known as PLMN (Public Land Mobile Network) code.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mobileCountryCode(): Optional<String> =
            mobileCountryCode.getOptional("mobile_country_code")

        /**
         * It's a two to three decimal digits that identify a network.<br/><br/> This code is
         * commonly seen joined with a Mobile Country Code (MCC) in a tuple that allows identifying
         * a carrier known as PLMN (Public Land Mobile Network) code.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mobileNetworkCode(): Optional<String> =
            mobileNetworkCode.getOptional("mobile_network_code")

        /**
         * The radio technology the SIM card used during the session.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun radioAccessTechnology(): Optional<String> =
            radioAccessTechnology.getOptional("radio_access_technology")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordType(): Optional<String> = recordType.getOptional("record_type")

        /**
         * The identification UUID of the related SIM card resource.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun simCardId(): Optional<String> = simCardId.getOptional("sim_card_id")

        /**
         * ISO 8601 formatted date-time indicating when the session started.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun startTime(): Optional<String> = startTime.getOptional("start_time")

        /**
         * The state of the SIM card after when the session happened.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun state(): Optional<String> = state.getOptional("state")

        /**
         * ISO 8601 formatted date-time indicating when the session ended.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun stopTime(): Optional<String> = stopTime.getOptional("stop_time")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Long> = id

        /**
         * Returns the raw JSON value of [apn].
         *
         * Unlike [apn], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("apn") @ExcludeMissing fun _apn(): JsonField<String> = apn

        /**
         * Returns the raw JSON value of [cellId].
         *
         * Unlike [cellId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cell_id") @ExcludeMissing fun _cellId(): JsonField<String> = cellId

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

        /**
         * Returns the raw JSON value of [imei].
         *
         * Unlike [imei], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("imei") @ExcludeMissing fun _imei(): JsonField<String> = imei

        /**
         * Returns the raw JSON value of [imsi].
         *
         * Unlike [imsi], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("imsi") @ExcludeMissing fun _imsi(): JsonField<String> = imsi

        /**
         * Returns the raw JSON value of [ipv4].
         *
         * Unlike [ipv4], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ipv4") @ExcludeMissing fun _ipv4(): JsonField<String> = ipv4

        /**
         * Returns the raw JSON value of [ipv6].
         *
         * Unlike [ipv6], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ipv6") @ExcludeMissing fun _ipv6(): JsonField<String> = ipv6

        /**
         * Returns the raw JSON value of [lastSeen].
         *
         * Unlike [lastSeen], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("last_seen") @ExcludeMissing fun _lastSeen(): JsonField<String> = lastSeen

        /**
         * Returns the raw JSON value of [logType].
         *
         * Unlike [logType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("log_type") @ExcludeMissing fun _logType(): JsonField<LogType> = logType

        /**
         * Returns the raw JSON value of [mobileCountryCode].
         *
         * Unlike [mobileCountryCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("mobile_country_code")
        @ExcludeMissing
        fun _mobileCountryCode(): JsonField<String> = mobileCountryCode

        /**
         * Returns the raw JSON value of [mobileNetworkCode].
         *
         * Unlike [mobileNetworkCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("mobile_network_code")
        @ExcludeMissing
        fun _mobileNetworkCode(): JsonField<String> = mobileNetworkCode

        /**
         * Returns the raw JSON value of [radioAccessTechnology].
         *
         * Unlike [radioAccessTechnology], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("radio_access_technology")
        @ExcludeMissing
        fun _radioAccessTechnology(): JsonField<String> = radioAccessTechnology

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<String> = recordType

        /**
         * Returns the raw JSON value of [simCardId].
         *
         * Unlike [simCardId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sim_card_id") @ExcludeMissing fun _simCardId(): JsonField<String> = simCardId

        /**
         * Returns the raw JSON value of [startTime].
         *
         * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_time") @ExcludeMissing fun _startTime(): JsonField<String> = startTime

        /**
         * Returns the raw JSON value of [state].
         *
         * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

        /**
         * Returns the raw JSON value of [stopTime].
         *
         * Unlike [stopTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("stop_time") @ExcludeMissing fun _stopTime(): JsonField<String> = stopTime

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

            /** Returns a mutable builder for constructing an instance of [Data]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<Long> = JsonMissing.of()
            private var apn: JsonField<String> = JsonMissing.of()
            private var cellId: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<String> = JsonMissing.of()
            private var imei: JsonField<String> = JsonMissing.of()
            private var imsi: JsonField<String> = JsonMissing.of()
            private var ipv4: JsonField<String> = JsonMissing.of()
            private var ipv6: JsonField<String> = JsonMissing.of()
            private var lastSeen: JsonField<String> = JsonMissing.of()
            private var logType: JsonField<LogType> = JsonMissing.of()
            private var mobileCountryCode: JsonField<String> = JsonMissing.of()
            private var mobileNetworkCode: JsonField<String> = JsonMissing.of()
            private var radioAccessTechnology: JsonField<String> = JsonMissing.of()
            private var recordType: JsonField<String> = JsonMissing.of()
            private var simCardId: JsonField<String> = JsonMissing.of()
            private var startTime: JsonField<String> = JsonMissing.of()
            private var state: JsonField<String> = JsonMissing.of()
            private var stopTime: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                apn = data.apn
                cellId = data.cellId
                createdAt = data.createdAt
                imei = data.imei
                imsi = data.imsi
                ipv4 = data.ipv4
                ipv6 = data.ipv6
                lastSeen = data.lastSeen
                logType = data.logType
                mobileCountryCode = data.mobileCountryCode
                mobileNetworkCode = data.mobileNetworkCode
                radioAccessTechnology = data.radioAccessTechnology
                recordType = data.recordType
                simCardId = data.simCardId
                startTime = data.startTime
                state = data.state
                stopTime = data.stopTime
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Uniquely identifies the session. */
            fun id(id: Long) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<Long>) = apply { this.id = id }

            /**
             * The Access Point Name (APN) identifies the packet data network that a mobile data
             * user wants to communicate with.
             */
            fun apn(apn: String) = apn(JsonField.of(apn))

            /**
             * Sets [Builder.apn] to an arbitrary JSON value.
             *
             * You should usually call [Builder.apn] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun apn(apn: JsonField<String>) = apply { this.apn = apn }

            /** The cell ID to which the SIM connected. */
            fun cellId(cellId: String) = cellId(JsonField.of(cellId))

            /**
             * Sets [Builder.cellId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cellId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cellId(cellId: JsonField<String>) = apply { this.cellId = cellId }

            /** ISO 8601 formatted date-time indicating when the record was created. */
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
             * The International Mobile Equipment Identity (or IMEI) is a number, usually unique,
             * that identifies the device currently being used connect to the network.
             */
            fun imei(imei: String) = imei(JsonField.of(imei))

            /**
             * Sets [Builder.imei] to an arbitrary JSON value.
             *
             * You should usually call [Builder.imei] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun imei(imei: JsonField<String>) = apply { this.imei = imei }

            /**
             * SIM cards are identified on their individual network operators by a unique
             * International Mobile Subscriber Identity (IMSI). <br/> Mobile network operators
             * connect mobile phone calls and communicate with their market SIM cards using their
             * IMSIs. The IMSI is stored in the Subscriber Identity Module (SIM) inside the device
             * and is sent by the device to the appropriate network. It is used to acquire the
             * details of the device in the Home Location Register (HLR) or the Visitor Location
             * Register (VLR).
             */
            fun imsi(imsi: String) = imsi(JsonField.of(imsi))

            /**
             * Sets [Builder.imsi] to an arbitrary JSON value.
             *
             * You should usually call [Builder.imsi] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun imsi(imsi: JsonField<String>) = apply { this.imsi = imsi }

            /**
             * The SIM's address in the currently connected network. This IPv4 address is usually
             * obtained dynamically, so it may vary according to the location or new connections.
             */
            fun ipv4(ipv4: String) = ipv4(JsonField.of(ipv4))

            /**
             * Sets [Builder.ipv4] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ipv4] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun ipv4(ipv4: JsonField<String>) = apply { this.ipv4 = ipv4 }

            /**
             * The SIM's address in the currently connected network. This IPv6 address is usually
             * obtained dynamically, so it may vary according to the location or new connections.
             */
            fun ipv6(ipv6: String) = ipv6(JsonField.of(ipv6))

            /**
             * Sets [Builder.ipv6] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ipv6] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun ipv6(ipv6: JsonField<String>) = apply { this.ipv6 = ipv6 }

            /**
             * ISO 8601 formatted date-time indicating when the last heartbeat to the device was
             * successfully recorded.
             */
            fun lastSeen(lastSeen: String) = lastSeen(JsonField.of(lastSeen))

            /**
             * Sets [Builder.lastSeen] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastSeen] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastSeen(lastSeen: JsonField<String>) = apply { this.lastSeen = lastSeen }

            /**
             * The type of the session, 'registration' being the initial authentication session and
             * 'data' the actual data transfer sessions.
             */
            fun logType(logType: LogType) = logType(JsonField.of(logType))

            /**
             * Sets [Builder.logType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.logType] with a well-typed [LogType] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun logType(logType: JsonField<LogType>) = apply { this.logType = logType }

            /**
             * It's a three decimal digit that identifies a country.<br/><br/> This code is commonly
             * seen joined with a Mobile Network Code (MNC) in a tuple that allows identifying a
             * carrier known as PLMN (Public Land Mobile Network) code.
             */
            fun mobileCountryCode(mobileCountryCode: String) =
                mobileCountryCode(JsonField.of(mobileCountryCode))

            /**
             * Sets [Builder.mobileCountryCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mobileCountryCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mobileCountryCode(mobileCountryCode: JsonField<String>) = apply {
                this.mobileCountryCode = mobileCountryCode
            }

            /**
             * It's a two to three decimal digits that identify a network.<br/><br/> This code is
             * commonly seen joined with a Mobile Country Code (MCC) in a tuple that allows
             * identifying a carrier known as PLMN (Public Land Mobile Network) code.
             */
            fun mobileNetworkCode(mobileNetworkCode: String) =
                mobileNetworkCode(JsonField.of(mobileNetworkCode))

            /**
             * Sets [Builder.mobileNetworkCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mobileNetworkCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mobileNetworkCode(mobileNetworkCode: JsonField<String>) = apply {
                this.mobileNetworkCode = mobileNetworkCode
            }

            /** The radio technology the SIM card used during the session. */
            fun radioAccessTechnology(radioAccessTechnology: String) =
                radioAccessTechnology(JsonField.of(radioAccessTechnology))

            /**
             * Sets [Builder.radioAccessTechnology] to an arbitrary JSON value.
             *
             * You should usually call [Builder.radioAccessTechnology] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun radioAccessTechnology(radioAccessTechnology: JsonField<String>) = apply {
                this.radioAccessTechnology = radioAccessTechnology
            }

            fun recordType(recordType: String) = recordType(JsonField.of(recordType))

            /**
             * Sets [Builder.recordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

            /** The identification UUID of the related SIM card resource. */
            fun simCardId(simCardId: String) = simCardId(JsonField.of(simCardId))

            /**
             * Sets [Builder.simCardId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.simCardId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun simCardId(simCardId: JsonField<String>) = apply { this.simCardId = simCardId }

            /** ISO 8601 formatted date-time indicating when the session started. */
            fun startTime(startTime: String) = startTime(JsonField.of(startTime))

            /**
             * Sets [Builder.startTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startTime] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startTime(startTime: JsonField<String>) = apply { this.startTime = startTime }

            /** The state of the SIM card after when the session happened. */
            fun state(state: String) = state(JsonField.of(state))

            /**
             * Sets [Builder.state] to an arbitrary JSON value.
             *
             * You should usually call [Builder.state] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun state(state: JsonField<String>) = apply { this.state = state }

            /** ISO 8601 formatted date-time indicating when the session ended. */
            fun stopTime(stopTime: String) = stopTime(JsonField.of(stopTime))

            /**
             * Sets [Builder.stopTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stopTime] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun stopTime(stopTime: JsonField<String>) = apply { this.stopTime = stopTime }

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
             */
            fun build(): Data =
                Data(
                    id,
                    apn,
                    cellId,
                    createdAt,
                    imei,
                    imsi,
                    ipv4,
                    ipv6,
                    lastSeen,
                    logType,
                    mobileCountryCode,
                    mobileNetworkCode,
                    radioAccessTechnology,
                    recordType,
                    simCardId,
                    startTime,
                    state,
                    stopTime,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            id()
            apn()
            cellId()
            createdAt()
            imei()
            imsi()
            ipv4()
            ipv6()
            lastSeen()
            logType().ifPresent { it.validate() }
            mobileCountryCode()
            mobileNetworkCode()
            radioAccessTechnology()
            recordType()
            simCardId()
            startTime()
            state()
            stopTime()
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
                (if (apn.asKnown().isPresent) 1 else 0) +
                (if (cellId.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (imei.asKnown().isPresent) 1 else 0) +
                (if (imsi.asKnown().isPresent) 1 else 0) +
                (if (ipv4.asKnown().isPresent) 1 else 0) +
                (if (ipv6.asKnown().isPresent) 1 else 0) +
                (if (lastSeen.asKnown().isPresent) 1 else 0) +
                (logType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (mobileCountryCode.asKnown().isPresent) 1 else 0) +
                (if (mobileNetworkCode.asKnown().isPresent) 1 else 0) +
                (if (radioAccessTechnology.asKnown().isPresent) 1 else 0) +
                (if (recordType.asKnown().isPresent) 1 else 0) +
                (if (simCardId.asKnown().isPresent) 1 else 0) +
                (if (startTime.asKnown().isPresent) 1 else 0) +
                (if (state.asKnown().isPresent) 1 else 0) +
                (if (stopTime.asKnown().isPresent) 1 else 0)

        /**
         * The type of the session, 'registration' being the initial authentication session and
         * 'data' the actual data transfer sessions.
         */
        class LogType @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val REGISTRATION = of("registration")

                @JvmField val DATA = of("data")

                @JvmStatic fun of(value: String) = LogType(JsonField.of(value))
            }

            /** An enum containing [LogType]'s known values. */
            enum class Known {
                REGISTRATION,
                DATA,
            }

            /**
             * An enum containing [LogType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [LogType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                REGISTRATION,
                DATA,
                /**
                 * An enum member indicating that [LogType] was instantiated with an unknown value.
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
                    REGISTRATION -> Value.REGISTRATION
                    DATA -> Value.DATA
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
                    REGISTRATION -> Known.REGISTRATION
                    DATA -> Known.DATA
                    else -> throw TelnyxInvalidDataException("Unknown LogType: $value")
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

            fun validate(): LogType = apply {
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

                return other is LogType && value == other.value
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
                apn == other.apn &&
                cellId == other.cellId &&
                createdAt == other.createdAt &&
                imei == other.imei &&
                imsi == other.imsi &&
                ipv4 == other.ipv4 &&
                ipv6 == other.ipv6 &&
                lastSeen == other.lastSeen &&
                logType == other.logType &&
                mobileCountryCode == other.mobileCountryCode &&
                mobileNetworkCode == other.mobileNetworkCode &&
                radioAccessTechnology == other.radioAccessTechnology &&
                recordType == other.recordType &&
                simCardId == other.simCardId &&
                startTime == other.startTime &&
                state == other.state &&
                stopTime == other.stopTime &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                apn,
                cellId,
                createdAt,
                imei,
                imsi,
                ipv4,
                ipv6,
                lastSeen,
                logType,
                mobileCountryCode,
                mobileNetworkCode,
                radioAccessTechnology,
                recordType,
                simCardId,
                startTime,
                state,
                stopTime,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, apn=$apn, cellId=$cellId, createdAt=$createdAt, imei=$imei, imsi=$imsi, ipv4=$ipv4, ipv6=$ipv6, lastSeen=$lastSeen, logType=$logType, mobileCountryCode=$mobileCountryCode, mobileNetworkCode=$mobileNetworkCode, radioAccessTechnology=$radioAccessTechnology, recordType=$recordType, simCardId=$simCardId, startTime=$startTime, state=$state, stopTime=$stopTime, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SimCardListWirelessConnectivityLogsResponse &&
            data == other.data &&
            meta == other.meta &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, meta, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SimCardListWirelessConnectivityLogsResponse{data=$data, meta=$meta, additionalProperties=$additionalProperties}"
}
