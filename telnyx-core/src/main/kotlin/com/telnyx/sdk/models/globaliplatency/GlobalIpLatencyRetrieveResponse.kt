// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.globaliplatency

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class GlobalIpLatencyRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<Data>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<List<Data>> = data.getOptional("data")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

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
         * [GlobalIpLatencyRetrieveResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [GlobalIpLatencyRetrieveResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(globalIpLatencyRetrieveResponse: GlobalIpLatencyRetrieveResponse) =
            apply {
                data = globalIpLatencyRetrieveResponse.data.map { it.toMutableList() }
                additionalProperties =
                    globalIpLatencyRetrieveResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [GlobalIpLatencyRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): GlobalIpLatencyRetrieveResponse =
            GlobalIpLatencyRetrieveResponse(
                (data ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): GlobalIpLatencyRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.forEach { it.validate() } }
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
        (data.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val globalIp: JsonField<GlobalIp>,
        private val meanLatency: JsonField<MeanLatency>,
        private val percentileLatency: JsonField<PercentileLatency>,
        private val proberLocation: JsonField<ProberLocation>,
        private val timestamp: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("global_ip")
            @ExcludeMissing
            globalIp: JsonField<GlobalIp> = JsonMissing.of(),
            @JsonProperty("mean_latency")
            @ExcludeMissing
            meanLatency: JsonField<MeanLatency> = JsonMissing.of(),
            @JsonProperty("percentile_latency")
            @ExcludeMissing
            percentileLatency: JsonField<PercentileLatency> = JsonMissing.of(),
            @JsonProperty("prober_location")
            @ExcludeMissing
            proberLocation: JsonField<ProberLocation> = JsonMissing.of(),
            @JsonProperty("timestamp")
            @ExcludeMissing
            timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            globalIp,
            meanLatency,
            percentileLatency,
            proberLocation,
            timestamp,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun globalIp(): Optional<GlobalIp> = globalIp.getOptional("global_ip")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun meanLatency(): Optional<MeanLatency> = meanLatency.getOptional("mean_latency")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun percentileLatency(): Optional<PercentileLatency> =
            percentileLatency.getOptional("percentile_latency")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun proberLocation(): Optional<ProberLocation> =
            proberLocation.getOptional("prober_location")

        /**
         * The timestamp of the metric.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timestamp(): Optional<OffsetDateTime> = timestamp.getOptional("timestamp")

        /**
         * Returns the raw JSON value of [globalIp].
         *
         * Unlike [globalIp], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("global_ip") @ExcludeMissing fun _globalIp(): JsonField<GlobalIp> = globalIp

        /**
         * Returns the raw JSON value of [meanLatency].
         *
         * Unlike [meanLatency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mean_latency")
        @ExcludeMissing
        fun _meanLatency(): JsonField<MeanLatency> = meanLatency

        /**
         * Returns the raw JSON value of [percentileLatency].
         *
         * Unlike [percentileLatency], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("percentile_latency")
        @ExcludeMissing
        fun _percentileLatency(): JsonField<PercentileLatency> = percentileLatency

        /**
         * Returns the raw JSON value of [proberLocation].
         *
         * Unlike [proberLocation], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("prober_location")
        @ExcludeMissing
        fun _proberLocation(): JsonField<ProberLocation> = proberLocation

        /**
         * Returns the raw JSON value of [timestamp].
         *
         * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timestamp")
        @ExcludeMissing
        fun _timestamp(): JsonField<OffsetDateTime> = timestamp

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

            private var globalIp: JsonField<GlobalIp> = JsonMissing.of()
            private var meanLatency: JsonField<MeanLatency> = JsonMissing.of()
            private var percentileLatency: JsonField<PercentileLatency> = JsonMissing.of()
            private var proberLocation: JsonField<ProberLocation> = JsonMissing.of()
            private var timestamp: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                globalIp = data.globalIp
                meanLatency = data.meanLatency
                percentileLatency = data.percentileLatency
                proberLocation = data.proberLocation
                timestamp = data.timestamp
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun globalIp(globalIp: GlobalIp) = globalIp(JsonField.of(globalIp))

            /**
             * Sets [Builder.globalIp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.globalIp] with a well-typed [GlobalIp] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun globalIp(globalIp: JsonField<GlobalIp>) = apply { this.globalIp = globalIp }

            fun meanLatency(meanLatency: MeanLatency) = meanLatency(JsonField.of(meanLatency))

            /**
             * Sets [Builder.meanLatency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.meanLatency] with a well-typed [MeanLatency] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun meanLatency(meanLatency: JsonField<MeanLatency>) = apply {
                this.meanLatency = meanLatency
            }

            fun percentileLatency(percentileLatency: PercentileLatency) =
                percentileLatency(JsonField.of(percentileLatency))

            /**
             * Sets [Builder.percentileLatency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.percentileLatency] with a well-typed
             * [PercentileLatency] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun percentileLatency(percentileLatency: JsonField<PercentileLatency>) = apply {
                this.percentileLatency = percentileLatency
            }

            fun proberLocation(proberLocation: ProberLocation) =
                proberLocation(JsonField.of(proberLocation))

            /**
             * Sets [Builder.proberLocation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.proberLocation] with a well-typed [ProberLocation]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun proberLocation(proberLocation: JsonField<ProberLocation>) = apply {
                this.proberLocation = proberLocation
            }

            /** The timestamp of the metric. */
            fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

            /**
             * Sets [Builder.timestamp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                this.timestamp = timestamp
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
             */
            fun build(): Data =
                Data(
                    globalIp,
                    meanLatency,
                    percentileLatency,
                    proberLocation,
                    timestamp,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            globalIp().ifPresent { it.validate() }
            meanLatency().ifPresent { it.validate() }
            percentileLatency().ifPresent { it.validate() }
            proberLocation().ifPresent { it.validate() }
            timestamp()
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
            (globalIp.asKnown().getOrNull()?.validity() ?: 0) +
                (meanLatency.asKnown().getOrNull()?.validity() ?: 0) +
                (percentileLatency.asKnown().getOrNull()?.validity() ?: 0) +
                (proberLocation.asKnown().getOrNull()?.validity() ?: 0) +
                (if (timestamp.asKnown().isPresent) 1 else 0)

        class GlobalIp
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val ipAddress: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("ip_address")
                @ExcludeMissing
                ipAddress: JsonField<String> = JsonMissing.of(),
            ) : this(id, ipAddress, mutableMapOf())

            /**
             * Global IP ID.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            /**
             * The Global IP address.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun ipAddress(): Optional<String> = ipAddress.getOptional("ip_address")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [ipAddress].
             *
             * Unlike [ipAddress], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("ip_address")
            @ExcludeMissing
            fun _ipAddress(): JsonField<String> = ipAddress

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

                /** Returns a mutable builder for constructing an instance of [GlobalIp]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [GlobalIp]. */
            class Builder internal constructor() {

                private var id: JsonField<String> = JsonMissing.of()
                private var ipAddress: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(globalIp: GlobalIp) = apply {
                    id = globalIp.id
                    ipAddress = globalIp.ipAddress
                    additionalProperties = globalIp.additionalProperties.toMutableMap()
                }

                /** Global IP ID. */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** The Global IP address. */
                fun ipAddress(ipAddress: String) = ipAddress(JsonField.of(ipAddress))

                /**
                 * Sets [Builder.ipAddress] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ipAddress] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun ipAddress(ipAddress: JsonField<String>) = apply { this.ipAddress = ipAddress }

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
                 * Returns an immutable instance of [GlobalIp].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): GlobalIp = GlobalIp(id, ipAddress, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): GlobalIp = apply {
                if (validated) {
                    return@apply
                }

                id()
                ipAddress()
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
                    (if (ipAddress.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is GlobalIp &&
                    id == other.id &&
                    ipAddress == other.ipAddress &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(id, ipAddress, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "GlobalIp{id=$id, ipAddress=$ipAddress, additionalProperties=$additionalProperties}"
        }

        class MeanLatency
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<Double>,
            private val unit: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("unit") @ExcludeMissing unit: JsonField<String> = JsonMissing.of(),
            ) : this(amount, unit, mutableMapOf())

            /**
             * The average latency.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun amount(): Optional<Double> = amount.getOptional("amount")

            /**
             * The unit of the average latency.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun unit(): Optional<String> = unit.getOptional("unit")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

            /**
             * Returns the raw JSON value of [unit].
             *
             * Unlike [unit], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<String> = unit

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

                /** Returns a mutable builder for constructing an instance of [MeanLatency]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [MeanLatency]. */
            class Builder internal constructor() {

                private var amount: JsonField<Double> = JsonMissing.of()
                private var unit: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(meanLatency: MeanLatency) = apply {
                    amount = meanLatency.amount
                    unit = meanLatency.unit
                    additionalProperties = meanLatency.additionalProperties.toMutableMap()
                }

                /** The average latency. */
                fun amount(amount: Double) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                /** The unit of the average latency. */
                fun unit(unit: String) = unit(JsonField.of(unit))

                /**
                 * Sets [Builder.unit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.unit] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun unit(unit: JsonField<String>) = apply { this.unit = unit }

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
                 * Returns an immutable instance of [MeanLatency].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): MeanLatency =
                    MeanLatency(amount, unit, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): MeanLatency = apply {
                if (validated) {
                    return@apply
                }

                amount()
                unit()
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
                (if (amount.asKnown().isPresent) 1 else 0) +
                    (if (unit.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is MeanLatency &&
                    amount == other.amount &&
                    unit == other.unit &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(amount, unit, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "MeanLatency{amount=$amount, unit=$unit, additionalProperties=$additionalProperties}"
        }

        class PercentileLatency
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val p0: JsonField<P0>,
            private val p25: JsonField<P25>,
            private val p50: JsonField<P50>,
            private val p75: JsonField<P75>,
            private val p90: JsonField<P90>,
            private val p99: JsonField<P99>,
            private val p100: JsonField<P100>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("0") @ExcludeMissing p0: JsonField<P0> = JsonMissing.of(),
                @JsonProperty("25") @ExcludeMissing p25: JsonField<P25> = JsonMissing.of(),
                @JsonProperty("50") @ExcludeMissing p50: JsonField<P50> = JsonMissing.of(),
                @JsonProperty("75") @ExcludeMissing p75: JsonField<P75> = JsonMissing.of(),
                @JsonProperty("90") @ExcludeMissing p90: JsonField<P90> = JsonMissing.of(),
                @JsonProperty("99") @ExcludeMissing p99: JsonField<P99> = JsonMissing.of(),
                @JsonProperty("100") @ExcludeMissing p100: JsonField<P100> = JsonMissing.of(),
            ) : this(p0, p25, p50, p75, p90, p99, p100, mutableMapOf())

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun p0(): Optional<P0> = p0.getOptional("0")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun p25(): Optional<P25> = p25.getOptional("25")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun p50(): Optional<P50> = p50.getOptional("50")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun p75(): Optional<P75> = p75.getOptional("75")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun p90(): Optional<P90> = p90.getOptional("90")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun p99(): Optional<P99> = p99.getOptional("99")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun p100(): Optional<P100> = p100.getOptional("100")

            /**
             * Returns the raw JSON value of [p0].
             *
             * Unlike [p0], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("0") @ExcludeMissing fun _p0(): JsonField<P0> = p0

            /**
             * Returns the raw JSON value of [p25].
             *
             * Unlike [p25], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("25") @ExcludeMissing fun _p25(): JsonField<P25> = p25

            /**
             * Returns the raw JSON value of [p50].
             *
             * Unlike [p50], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("50") @ExcludeMissing fun _p50(): JsonField<P50> = p50

            /**
             * Returns the raw JSON value of [p75].
             *
             * Unlike [p75], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("75") @ExcludeMissing fun _p75(): JsonField<P75> = p75

            /**
             * Returns the raw JSON value of [p90].
             *
             * Unlike [p90], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("90") @ExcludeMissing fun _p90(): JsonField<P90> = p90

            /**
             * Returns the raw JSON value of [p99].
             *
             * Unlike [p99], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("99") @ExcludeMissing fun _p99(): JsonField<P99> = p99

            /**
             * Returns the raw JSON value of [p100].
             *
             * Unlike [p100], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("100") @ExcludeMissing fun _p100(): JsonField<P100> = p100

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
                 * Returns a mutable builder for constructing an instance of [PercentileLatency].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PercentileLatency]. */
            class Builder internal constructor() {

                private var p0: JsonField<P0> = JsonMissing.of()
                private var p25: JsonField<P25> = JsonMissing.of()
                private var p50: JsonField<P50> = JsonMissing.of()
                private var p75: JsonField<P75> = JsonMissing.of()
                private var p90: JsonField<P90> = JsonMissing.of()
                private var p99: JsonField<P99> = JsonMissing.of()
                private var p100: JsonField<P100> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(percentileLatency: PercentileLatency) = apply {
                    p0 = percentileLatency.p0
                    p25 = percentileLatency.p25
                    p50 = percentileLatency.p50
                    p75 = percentileLatency.p75
                    p90 = percentileLatency.p90
                    p99 = percentileLatency.p99
                    p100 = percentileLatency.p100
                    additionalProperties = percentileLatency.additionalProperties.toMutableMap()
                }

                fun p0(p0: P0) = p0(JsonField.of(p0))

                /**
                 * Sets [Builder.p0] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.p0] with a well-typed [P0] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun p0(p0: JsonField<P0>) = apply { this.p0 = p0 }

                fun p25(p25: P25) = p25(JsonField.of(p25))

                /**
                 * Sets [Builder.p25] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.p25] with a well-typed [P25] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun p25(p25: JsonField<P25>) = apply { this.p25 = p25 }

                fun p50(p50: P50) = p50(JsonField.of(p50))

                /**
                 * Sets [Builder.p50] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.p50] with a well-typed [P50] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun p50(p50: JsonField<P50>) = apply { this.p50 = p50 }

                fun p75(p75: P75) = p75(JsonField.of(p75))

                /**
                 * Sets [Builder.p75] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.p75] with a well-typed [P75] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun p75(p75: JsonField<P75>) = apply { this.p75 = p75 }

                fun p90(p90: P90) = p90(JsonField.of(p90))

                /**
                 * Sets [Builder.p90] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.p90] with a well-typed [P90] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun p90(p90: JsonField<P90>) = apply { this.p90 = p90 }

                fun p99(p99: P99) = p99(JsonField.of(p99))

                /**
                 * Sets [Builder.p99] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.p99] with a well-typed [P99] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun p99(p99: JsonField<P99>) = apply { this.p99 = p99 }

                fun p100(p100: P100) = p100(JsonField.of(p100))

                /**
                 * Sets [Builder.p100] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.p100] with a well-typed [P100] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun p100(p100: JsonField<P100>) = apply { this.p100 = p100 }

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
                 * Returns an immutable instance of [PercentileLatency].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): PercentileLatency =
                    PercentileLatency(
                        p0,
                        p25,
                        p50,
                        p75,
                        p90,
                        p99,
                        p100,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): PercentileLatency = apply {
                if (validated) {
                    return@apply
                }

                p0().ifPresent { it.validate() }
                p25().ifPresent { it.validate() }
                p50().ifPresent { it.validate() }
                p75().ifPresent { it.validate() }
                p90().ifPresent { it.validate() }
                p99().ifPresent { it.validate() }
                p100().ifPresent { it.validate() }
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
                (p0.asKnown().getOrNull()?.validity() ?: 0) +
                    (p25.asKnown().getOrNull()?.validity() ?: 0) +
                    (p50.asKnown().getOrNull()?.validity() ?: 0) +
                    (p75.asKnown().getOrNull()?.validity() ?: 0) +
                    (p90.asKnown().getOrNull()?.validity() ?: 0) +
                    (p99.asKnown().getOrNull()?.validity() ?: 0) +
                    (p100.asKnown().getOrNull()?.validity() ?: 0)

            class P0
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val amount: JsonField<Double>,
                private val unit: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("unit") @ExcludeMissing unit: JsonField<String> = JsonMissing.of(),
                ) : this(amount, unit, mutableMapOf())

                /**
                 * The minimum latency.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun amount(): Optional<Double> = amount.getOptional("amount")

                /**
                 * The unit of the minimum latency.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun unit(): Optional<String> = unit.getOptional("unit")

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

                /**
                 * Returns the raw JSON value of [unit].
                 *
                 * Unlike [unit], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<String> = unit

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

                    /** Returns a mutable builder for constructing an instance of [P0]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [P0]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Double> = JsonMissing.of()
                    private var unit: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(p0: P0) = apply {
                        amount = p0.amount
                        unit = p0.unit
                        additionalProperties = p0.additionalProperties.toMutableMap()
                    }

                    /** The minimum latency. */
                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    /** The unit of the minimum latency. */
                    fun unit(unit: String) = unit(JsonField.of(unit))

                    /**
                     * Sets [Builder.unit] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.unit] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun unit(unit: JsonField<String>) = apply { this.unit = unit }

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
                     * Returns an immutable instance of [P0].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): P0 = P0(amount, unit, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): P0 = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    unit()
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
                    (if (amount.asKnown().isPresent) 1 else 0) +
                        (if (unit.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is P0 &&
                        amount == other.amount &&
                        unit == other.unit &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(amount, unit, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "P0{amount=$amount, unit=$unit, additionalProperties=$additionalProperties}"
            }

            class P100
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val amount: JsonField<Double>,
                private val unit: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("unit") @ExcludeMissing unit: JsonField<String> = JsonMissing.of(),
                ) : this(amount, unit, mutableMapOf())

                /**
                 * The maximum latency.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun amount(): Optional<Double> = amount.getOptional("amount")

                /**
                 * The unit of the maximum latency.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun unit(): Optional<String> = unit.getOptional("unit")

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

                /**
                 * Returns the raw JSON value of [unit].
                 *
                 * Unlike [unit], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<String> = unit

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

                    /** Returns a mutable builder for constructing an instance of [P100]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [P100]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Double> = JsonMissing.of()
                    private var unit: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(p100: P100) = apply {
                        amount = p100.amount
                        unit = p100.unit
                        additionalProperties = p100.additionalProperties.toMutableMap()
                    }

                    /** The maximum latency. */
                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    /** The unit of the maximum latency. */
                    fun unit(unit: String) = unit(JsonField.of(unit))

                    /**
                     * Sets [Builder.unit] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.unit] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun unit(unit: JsonField<String>) = apply { this.unit = unit }

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
                     * Returns an immutable instance of [P100].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): P100 = P100(amount, unit, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): P100 = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    unit()
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
                    (if (amount.asKnown().isPresent) 1 else 0) +
                        (if (unit.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is P100 &&
                        amount == other.amount &&
                        unit == other.unit &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(amount, unit, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "P100{amount=$amount, unit=$unit, additionalProperties=$additionalProperties}"
            }

            class P25
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val amount: JsonField<Double>,
                private val unit: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("unit") @ExcludeMissing unit: JsonField<String> = JsonMissing.of(),
                ) : this(amount, unit, mutableMapOf())

                /**
                 * The 25th percentile latency.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun amount(): Optional<Double> = amount.getOptional("amount")

                /**
                 * The unit of the 25th percentile latency.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun unit(): Optional<String> = unit.getOptional("unit")

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

                /**
                 * Returns the raw JSON value of [unit].
                 *
                 * Unlike [unit], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<String> = unit

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

                    /** Returns a mutable builder for constructing an instance of [P25]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [P25]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Double> = JsonMissing.of()
                    private var unit: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(p25: P25) = apply {
                        amount = p25.amount
                        unit = p25.unit
                        additionalProperties = p25.additionalProperties.toMutableMap()
                    }

                    /** The 25th percentile latency. */
                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    /** The unit of the 25th percentile latency. */
                    fun unit(unit: String) = unit(JsonField.of(unit))

                    /**
                     * Sets [Builder.unit] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.unit] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun unit(unit: JsonField<String>) = apply { this.unit = unit }

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
                     * Returns an immutable instance of [P25].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): P25 = P25(amount, unit, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): P25 = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    unit()
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
                    (if (amount.asKnown().isPresent) 1 else 0) +
                        (if (unit.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is P25 &&
                        amount == other.amount &&
                        unit == other.unit &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(amount, unit, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "P25{amount=$amount, unit=$unit, additionalProperties=$additionalProperties}"
            }

            class P50
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val amount: JsonField<Double>,
                private val unit: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("unit") @ExcludeMissing unit: JsonField<String> = JsonMissing.of(),
                ) : this(amount, unit, mutableMapOf())

                /**
                 * The 50th percentile latency.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun amount(): Optional<Double> = amount.getOptional("amount")

                /**
                 * The unit of the 50th percentile latency.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun unit(): Optional<String> = unit.getOptional("unit")

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

                /**
                 * Returns the raw JSON value of [unit].
                 *
                 * Unlike [unit], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<String> = unit

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

                    /** Returns a mutable builder for constructing an instance of [P50]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [P50]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Double> = JsonMissing.of()
                    private var unit: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(p50: P50) = apply {
                        amount = p50.amount
                        unit = p50.unit
                        additionalProperties = p50.additionalProperties.toMutableMap()
                    }

                    /** The 50th percentile latency. */
                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    /** The unit of the 50th percentile latency. */
                    fun unit(unit: String) = unit(JsonField.of(unit))

                    /**
                     * Sets [Builder.unit] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.unit] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun unit(unit: JsonField<String>) = apply { this.unit = unit }

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
                     * Returns an immutable instance of [P50].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): P50 = P50(amount, unit, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): P50 = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    unit()
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
                    (if (amount.asKnown().isPresent) 1 else 0) +
                        (if (unit.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is P50 &&
                        amount == other.amount &&
                        unit == other.unit &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(amount, unit, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "P50{amount=$amount, unit=$unit, additionalProperties=$additionalProperties}"
            }

            class P75
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val amount: JsonField<Double>,
                private val unit: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("unit") @ExcludeMissing unit: JsonField<String> = JsonMissing.of(),
                ) : this(amount, unit, mutableMapOf())

                /**
                 * The 75th percentile latency.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun amount(): Optional<Double> = amount.getOptional("amount")

                /**
                 * The unit of the 75th percentile latency.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun unit(): Optional<String> = unit.getOptional("unit")

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

                /**
                 * Returns the raw JSON value of [unit].
                 *
                 * Unlike [unit], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<String> = unit

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

                    /** Returns a mutable builder for constructing an instance of [P75]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [P75]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Double> = JsonMissing.of()
                    private var unit: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(p75: P75) = apply {
                        amount = p75.amount
                        unit = p75.unit
                        additionalProperties = p75.additionalProperties.toMutableMap()
                    }

                    /** The 75th percentile latency. */
                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    /** The unit of the 75th percentile latency. */
                    fun unit(unit: String) = unit(JsonField.of(unit))

                    /**
                     * Sets [Builder.unit] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.unit] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun unit(unit: JsonField<String>) = apply { this.unit = unit }

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
                     * Returns an immutable instance of [P75].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): P75 = P75(amount, unit, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): P75 = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    unit()
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
                    (if (amount.asKnown().isPresent) 1 else 0) +
                        (if (unit.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is P75 &&
                        amount == other.amount &&
                        unit == other.unit &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(amount, unit, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "P75{amount=$amount, unit=$unit, additionalProperties=$additionalProperties}"
            }

            class P90
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val amount: JsonField<Double>,
                private val unit: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("unit") @ExcludeMissing unit: JsonField<String> = JsonMissing.of(),
                ) : this(amount, unit, mutableMapOf())

                /**
                 * The 90th percentile latency.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun amount(): Optional<Double> = amount.getOptional("amount")

                /**
                 * The unit of the 90th percentile latency.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun unit(): Optional<String> = unit.getOptional("unit")

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

                /**
                 * Returns the raw JSON value of [unit].
                 *
                 * Unlike [unit], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<String> = unit

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

                    /** Returns a mutable builder for constructing an instance of [P90]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [P90]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Double> = JsonMissing.of()
                    private var unit: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(p90: P90) = apply {
                        amount = p90.amount
                        unit = p90.unit
                        additionalProperties = p90.additionalProperties.toMutableMap()
                    }

                    /** The 90th percentile latency. */
                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    /** The unit of the 90th percentile latency. */
                    fun unit(unit: String) = unit(JsonField.of(unit))

                    /**
                     * Sets [Builder.unit] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.unit] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun unit(unit: JsonField<String>) = apply { this.unit = unit }

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
                     * Returns an immutable instance of [P90].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): P90 = P90(amount, unit, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): P90 = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    unit()
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
                    (if (amount.asKnown().isPresent) 1 else 0) +
                        (if (unit.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is P90 &&
                        amount == other.amount &&
                        unit == other.unit &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(amount, unit, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "P90{amount=$amount, unit=$unit, additionalProperties=$additionalProperties}"
            }

            class P99
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val amount: JsonField<Double>,
                private val unit: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("unit") @ExcludeMissing unit: JsonField<String> = JsonMissing.of(),
                ) : this(amount, unit, mutableMapOf())

                /**
                 * The 99th percentile latency.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun amount(): Optional<Double> = amount.getOptional("amount")

                /**
                 * The unit of the 99th percentile latency.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun unit(): Optional<String> = unit.getOptional("unit")

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

                /**
                 * Returns the raw JSON value of [unit].
                 *
                 * Unlike [unit], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<String> = unit

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

                    /** Returns a mutable builder for constructing an instance of [P99]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [P99]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Double> = JsonMissing.of()
                    private var unit: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(p99: P99) = apply {
                        amount = p99.amount
                        unit = p99.unit
                        additionalProperties = p99.additionalProperties.toMutableMap()
                    }

                    /** The 99th percentile latency. */
                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    /** The unit of the 99th percentile latency. */
                    fun unit(unit: String) = unit(JsonField.of(unit))

                    /**
                     * Sets [Builder.unit] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.unit] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun unit(unit: JsonField<String>) = apply { this.unit = unit }

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
                     * Returns an immutable instance of [P99].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): P99 = P99(amount, unit, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): P99 = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    unit()
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
                    (if (amount.asKnown().isPresent) 1 else 0) +
                        (if (unit.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is P99 &&
                        amount == other.amount &&
                        unit == other.unit &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(amount, unit, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "P99{amount=$amount, unit=$unit, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PercentileLatency &&
                    p0 == other.p0 &&
                    p25 == other.p25 &&
                    p50 == other.p50 &&
                    p75 == other.p75 &&
                    p90 == other.p90 &&
                    p99 == other.p99 &&
                    p100 == other.p100 &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(p0, p25, p50, p75, p90, p99, p100, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PercentileLatency{p0=$p0, p25=$p25, p50=$p50, p75=$p75, p90=$p90, p99=$p99, p100=$p100, additionalProperties=$additionalProperties}"
        }

        class ProberLocation
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val lat: JsonField<Double>,
            private val lon: JsonField<Double>,
            private val name: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("lat") @ExcludeMissing lat: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("lon") @ExcludeMissing lon: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            ) : this(id, lat, lon, name, mutableMapOf())

            /**
             * Location ID.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            /**
             * Latitude.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun lat(): Optional<Double> = lat.getOptional("lat")

            /**
             * Longitude.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun lon(): Optional<Double> = lon.getOptional("lon")

            /**
             * Location name.
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
             * Returns the raw JSON value of [lat].
             *
             * Unlike [lat], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("lat") @ExcludeMissing fun _lat(): JsonField<Double> = lat

            /**
             * Returns the raw JSON value of [lon].
             *
             * Unlike [lon], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("lon") @ExcludeMissing fun _lon(): JsonField<Double> = lon

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

                /** Returns a mutable builder for constructing an instance of [ProberLocation]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ProberLocation]. */
            class Builder internal constructor() {

                private var id: JsonField<String> = JsonMissing.of()
                private var lat: JsonField<Double> = JsonMissing.of()
                private var lon: JsonField<Double> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(proberLocation: ProberLocation) = apply {
                    id = proberLocation.id
                    lat = proberLocation.lat
                    lon = proberLocation.lon
                    name = proberLocation.name
                    additionalProperties = proberLocation.additionalProperties.toMutableMap()
                }

                /** Location ID. */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** Latitude. */
                fun lat(lat: Double) = lat(JsonField.of(lat))

                /**
                 * Sets [Builder.lat] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lat] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

                /** Longitude. */
                fun lon(lon: Double) = lon(JsonField.of(lon))

                /**
                 * Sets [Builder.lon] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lon] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun lon(lon: JsonField<Double>) = apply { this.lon = lon }

                /** Location name. */
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
                 * Returns an immutable instance of [ProberLocation].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ProberLocation =
                    ProberLocation(id, lat, lon, name, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): ProberLocation = apply {
                if (validated) {
                    return@apply
                }

                id()
                lat()
                lon()
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
                (if (id.asKnown().isPresent) 1 else 0) +
                    (if (lat.asKnown().isPresent) 1 else 0) +
                    (if (lon.asKnown().isPresent) 1 else 0) +
                    (if (name.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ProberLocation &&
                    id == other.id &&
                    lat == other.lat &&
                    lon == other.lon &&
                    name == other.name &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(id, lat, lon, name, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ProberLocation{id=$id, lat=$lat, lon=$lon, name=$name, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                globalIp == other.globalIp &&
                meanLatency == other.meanLatency &&
                percentileLatency == other.percentileLatency &&
                proberLocation == other.proberLocation &&
                timestamp == other.timestamp &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                globalIp,
                meanLatency,
                percentileLatency,
                proberLocation,
                timestamp,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{globalIp=$globalIp, meanLatency=$meanLatency, percentileLatency=$percentileLatency, proberLocation=$proberLocation, timestamp=$timestamp, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is GlobalIpLatencyRetrieveResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "GlobalIpLatencyRetrieveResponse{data=$data, additionalProperties=$additionalProperties}"
}
