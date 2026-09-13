// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.compute.funcs

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

class FuncRetrieveMetricAggregatesResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<Data>>,
    private val meta: JsonField<FunctionsObservabilityPaginationMeta>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of(),
        @JsonProperty("meta")
        @ExcludeMissing
        meta: JsonField<FunctionsObservabilityPaginationMeta> = JsonMissing.of(),
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
    fun meta(): Optional<FunctionsObservabilityPaginationMeta> = meta.getOptional("meta")

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
    @JsonProperty("meta")
    @ExcludeMissing
    fun _meta(): JsonField<FunctionsObservabilityPaginationMeta> = meta

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
         * [FuncRetrieveMetricAggregatesResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FuncRetrieveMetricAggregatesResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var meta: JsonField<FunctionsObservabilityPaginationMeta> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            funcRetrieveMetricAggregatesResponse: FuncRetrieveMetricAggregatesResponse
        ) = apply {
            data = funcRetrieveMetricAggregatesResponse.data.map { it.toMutableList() }
            meta = funcRetrieveMetricAggregatesResponse.meta
            additionalProperties =
                funcRetrieveMetricAggregatesResponse.additionalProperties.toMutableMap()
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

        fun meta(meta: FunctionsObservabilityPaginationMeta) = meta(JsonField.of(meta))

        /**
         * Sets [Builder.meta] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meta] with a well-typed
         * [FunctionsObservabilityPaginationMeta] value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun meta(meta: JsonField<FunctionsObservabilityPaginationMeta>) = apply { this.meta = meta }

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
         * Returns an immutable instance of [FuncRetrieveMetricAggregatesResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): FuncRetrieveMetricAggregatesResponse =
            FuncRetrieveMetricAggregatesResponse(
                (data ?: JsonMissing.of()).map { it.toImmutable() },
                meta,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): FuncRetrieveMetricAggregatesResponse = apply {
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
        private val cpuUsedCoresAvg: JsonField<Double>,
        private val cpuUsedCoresMax: JsonField<Double>,
        private val endTime: JsonField<OffsetDateTime>,
        private val functionId: JsonField<String>,
        private val functionName: JsonField<String>,
        private val memoryUsedBytesAvg: JsonField<Double>,
        private val memoryUsedBytesMax: JsonField<Double>,
        private val product: JsonField<String>,
        private val recordType: JsonField<String>,
        private val requestClientErrorRate: JsonField<Double>,
        private val requestCount: JsonField<Double>,
        private val requestErrorRate: JsonField<Double>,
        private val requestLatencyAvgMs: JsonField<Double>,
        private val requestLatencyP50Ms: JsonField<Double>,
        private val requestLatencyP95Ms: JsonField<Double>,
        private val requestLatencyP99Ms: JsonField<Double>,
        private val requestSuccessRate: JsonField<Double>,
        private val startTime: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("cpu_used_cores_avg")
            @ExcludeMissing
            cpuUsedCoresAvg: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("cpu_used_cores_max")
            @ExcludeMissing
            cpuUsedCoresMax: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("end_time")
            @ExcludeMissing
            endTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("function_id")
            @ExcludeMissing
            functionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("function_name")
            @ExcludeMissing
            functionName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("memory_used_bytes_avg")
            @ExcludeMissing
            memoryUsedBytesAvg: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("memory_used_bytes_max")
            @ExcludeMissing
            memoryUsedBytesMax: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("product") @ExcludeMissing product: JsonField<String> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("request_client_error_rate")
            @ExcludeMissing
            requestClientErrorRate: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("request_count")
            @ExcludeMissing
            requestCount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("request_error_rate")
            @ExcludeMissing
            requestErrorRate: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("request_latency_avg_ms")
            @ExcludeMissing
            requestLatencyAvgMs: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("request_latency_p50_ms")
            @ExcludeMissing
            requestLatencyP50Ms: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("request_latency_p95_ms")
            @ExcludeMissing
            requestLatencyP95Ms: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("request_latency_p99_ms")
            @ExcludeMissing
            requestLatencyP99Ms: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("request_success_rate")
            @ExcludeMissing
            requestSuccessRate: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("start_time")
            @ExcludeMissing
            startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            cpuUsedCoresAvg,
            cpuUsedCoresMax,
            endTime,
            functionId,
            functionName,
            memoryUsedBytesAvg,
            memoryUsedBytesMax,
            product,
            recordType,
            requestClientErrorRate,
            requestCount,
            requestErrorRate,
            requestLatencyAvgMs,
            requestLatencyP50Ms,
            requestLatencyP95Ms,
            requestLatencyP99Ms,
            requestSuccessRate,
            startTime,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cpuUsedCoresAvg(): Optional<Double> = cpuUsedCoresAvg.getOptional("cpu_used_cores_avg")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cpuUsedCoresMax(): Optional<Double> = cpuUsedCoresMax.getOptional("cpu_used_cores_max")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endTime(): Optional<OffsetDateTime> = endTime.getOptional("end_time")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun functionId(): Optional<String> = functionId.getOptional("function_id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun functionName(): Optional<String> = functionName.getOptional("function_name")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun memoryUsedBytesAvg(): Optional<Double> =
            memoryUsedBytesAvg.getOptional("memory_used_bytes_avg")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun memoryUsedBytesMax(): Optional<Double> =
            memoryUsedBytesMax.getOptional("memory_used_bytes_max")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun product(): Optional<String> = product.getOptional("product")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordType(): Optional<String> = recordType.getOptional("record_type")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun requestClientErrorRate(): Optional<Double> =
            requestClientErrorRate.getOptional("request_client_error_rate")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun requestCount(): Optional<Double> = requestCount.getOptional("request_count")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun requestErrorRate(): Optional<Double> =
            requestErrorRate.getOptional("request_error_rate")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun requestLatencyAvgMs(): Optional<Double> =
            requestLatencyAvgMs.getOptional("request_latency_avg_ms")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun requestLatencyP50Ms(): Optional<Double> =
            requestLatencyP50Ms.getOptional("request_latency_p50_ms")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun requestLatencyP95Ms(): Optional<Double> =
            requestLatencyP95Ms.getOptional("request_latency_p95_ms")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun requestLatencyP99Ms(): Optional<Double> =
            requestLatencyP99Ms.getOptional("request_latency_p99_ms")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun requestSuccessRate(): Optional<Double> =
            requestSuccessRate.getOptional("request_success_rate")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun startTime(): Optional<OffsetDateTime> = startTime.getOptional("start_time")

        /**
         * Returns the raw JSON value of [cpuUsedCoresAvg].
         *
         * Unlike [cpuUsedCoresAvg], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("cpu_used_cores_avg")
        @ExcludeMissing
        fun _cpuUsedCoresAvg(): JsonField<Double> = cpuUsedCoresAvg

        /**
         * Returns the raw JSON value of [cpuUsedCoresMax].
         *
         * Unlike [cpuUsedCoresMax], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("cpu_used_cores_max")
        @ExcludeMissing
        fun _cpuUsedCoresMax(): JsonField<Double> = cpuUsedCoresMax

        /**
         * Returns the raw JSON value of [endTime].
         *
         * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_time")
        @ExcludeMissing
        fun _endTime(): JsonField<OffsetDateTime> = endTime

        /**
         * Returns the raw JSON value of [functionId].
         *
         * Unlike [functionId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("function_id")
        @ExcludeMissing
        fun _functionId(): JsonField<String> = functionId

        /**
         * Returns the raw JSON value of [functionName].
         *
         * Unlike [functionName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("function_name")
        @ExcludeMissing
        fun _functionName(): JsonField<String> = functionName

        /**
         * Returns the raw JSON value of [memoryUsedBytesAvg].
         *
         * Unlike [memoryUsedBytesAvg], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("memory_used_bytes_avg")
        @ExcludeMissing
        fun _memoryUsedBytesAvg(): JsonField<Double> = memoryUsedBytesAvg

        /**
         * Returns the raw JSON value of [memoryUsedBytesMax].
         *
         * Unlike [memoryUsedBytesMax], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("memory_used_bytes_max")
        @ExcludeMissing
        fun _memoryUsedBytesMax(): JsonField<Double> = memoryUsedBytesMax

        /**
         * Returns the raw JSON value of [product].
         *
         * Unlike [product], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("product") @ExcludeMissing fun _product(): JsonField<String> = product

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<String> = recordType

        /**
         * Returns the raw JSON value of [requestClientErrorRate].
         *
         * Unlike [requestClientErrorRate], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("request_client_error_rate")
        @ExcludeMissing
        fun _requestClientErrorRate(): JsonField<Double> = requestClientErrorRate

        /**
         * Returns the raw JSON value of [requestCount].
         *
         * Unlike [requestCount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("request_count")
        @ExcludeMissing
        fun _requestCount(): JsonField<Double> = requestCount

        /**
         * Returns the raw JSON value of [requestErrorRate].
         *
         * Unlike [requestErrorRate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("request_error_rate")
        @ExcludeMissing
        fun _requestErrorRate(): JsonField<Double> = requestErrorRate

        /**
         * Returns the raw JSON value of [requestLatencyAvgMs].
         *
         * Unlike [requestLatencyAvgMs], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("request_latency_avg_ms")
        @ExcludeMissing
        fun _requestLatencyAvgMs(): JsonField<Double> = requestLatencyAvgMs

        /**
         * Returns the raw JSON value of [requestLatencyP50Ms].
         *
         * Unlike [requestLatencyP50Ms], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("request_latency_p50_ms")
        @ExcludeMissing
        fun _requestLatencyP50Ms(): JsonField<Double> = requestLatencyP50Ms

        /**
         * Returns the raw JSON value of [requestLatencyP95Ms].
         *
         * Unlike [requestLatencyP95Ms], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("request_latency_p95_ms")
        @ExcludeMissing
        fun _requestLatencyP95Ms(): JsonField<Double> = requestLatencyP95Ms

        /**
         * Returns the raw JSON value of [requestLatencyP99Ms].
         *
         * Unlike [requestLatencyP99Ms], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("request_latency_p99_ms")
        @ExcludeMissing
        fun _requestLatencyP99Ms(): JsonField<Double> = requestLatencyP99Ms

        /**
         * Returns the raw JSON value of [requestSuccessRate].
         *
         * Unlike [requestSuccessRate], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("request_success_rate")
        @ExcludeMissing
        fun _requestSuccessRate(): JsonField<Double> = requestSuccessRate

        /**
         * Returns the raw JSON value of [startTime].
         *
         * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_time")
        @ExcludeMissing
        fun _startTime(): JsonField<OffsetDateTime> = startTime

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

            private var cpuUsedCoresAvg: JsonField<Double> = JsonMissing.of()
            private var cpuUsedCoresMax: JsonField<Double> = JsonMissing.of()
            private var endTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var functionId: JsonField<String> = JsonMissing.of()
            private var functionName: JsonField<String> = JsonMissing.of()
            private var memoryUsedBytesAvg: JsonField<Double> = JsonMissing.of()
            private var memoryUsedBytesMax: JsonField<Double> = JsonMissing.of()
            private var product: JsonField<String> = JsonMissing.of()
            private var recordType: JsonField<String> = JsonMissing.of()
            private var requestClientErrorRate: JsonField<Double> = JsonMissing.of()
            private var requestCount: JsonField<Double> = JsonMissing.of()
            private var requestErrorRate: JsonField<Double> = JsonMissing.of()
            private var requestLatencyAvgMs: JsonField<Double> = JsonMissing.of()
            private var requestLatencyP50Ms: JsonField<Double> = JsonMissing.of()
            private var requestLatencyP95Ms: JsonField<Double> = JsonMissing.of()
            private var requestLatencyP99Ms: JsonField<Double> = JsonMissing.of()
            private var requestSuccessRate: JsonField<Double> = JsonMissing.of()
            private var startTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                cpuUsedCoresAvg = data.cpuUsedCoresAvg
                cpuUsedCoresMax = data.cpuUsedCoresMax
                endTime = data.endTime
                functionId = data.functionId
                functionName = data.functionName
                memoryUsedBytesAvg = data.memoryUsedBytesAvg
                memoryUsedBytesMax = data.memoryUsedBytesMax
                product = data.product
                recordType = data.recordType
                requestClientErrorRate = data.requestClientErrorRate
                requestCount = data.requestCount
                requestErrorRate = data.requestErrorRate
                requestLatencyAvgMs = data.requestLatencyAvgMs
                requestLatencyP50Ms = data.requestLatencyP50Ms
                requestLatencyP95Ms = data.requestLatencyP95Ms
                requestLatencyP99Ms = data.requestLatencyP99Ms
                requestSuccessRate = data.requestSuccessRate
                startTime = data.startTime
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun cpuUsedCoresAvg(cpuUsedCoresAvg: Double?) =
                cpuUsedCoresAvg(JsonField.ofNullable(cpuUsedCoresAvg))

            /**
             * Alias for [Builder.cpuUsedCoresAvg].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun cpuUsedCoresAvg(cpuUsedCoresAvg: Double) =
                cpuUsedCoresAvg(cpuUsedCoresAvg as Double?)

            /** Alias for calling [Builder.cpuUsedCoresAvg] with `cpuUsedCoresAvg.orElse(null)`. */
            fun cpuUsedCoresAvg(cpuUsedCoresAvg: Optional<Double>) =
                cpuUsedCoresAvg(cpuUsedCoresAvg.getOrNull())

            /**
             * Sets [Builder.cpuUsedCoresAvg] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cpuUsedCoresAvg] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cpuUsedCoresAvg(cpuUsedCoresAvg: JsonField<Double>) = apply {
                this.cpuUsedCoresAvg = cpuUsedCoresAvg
            }

            fun cpuUsedCoresMax(cpuUsedCoresMax: Double?) =
                cpuUsedCoresMax(JsonField.ofNullable(cpuUsedCoresMax))

            /**
             * Alias for [Builder.cpuUsedCoresMax].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun cpuUsedCoresMax(cpuUsedCoresMax: Double) =
                cpuUsedCoresMax(cpuUsedCoresMax as Double?)

            /** Alias for calling [Builder.cpuUsedCoresMax] with `cpuUsedCoresMax.orElse(null)`. */
            fun cpuUsedCoresMax(cpuUsedCoresMax: Optional<Double>) =
                cpuUsedCoresMax(cpuUsedCoresMax.getOrNull())

            /**
             * Sets [Builder.cpuUsedCoresMax] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cpuUsedCoresMax] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cpuUsedCoresMax(cpuUsedCoresMax: JsonField<Double>) = apply {
                this.cpuUsedCoresMax = cpuUsedCoresMax
            }

            fun endTime(endTime: OffsetDateTime) = endTime(JsonField.of(endTime))

            /**
             * Sets [Builder.endTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endTime] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endTime(endTime: JsonField<OffsetDateTime>) = apply { this.endTime = endTime }

            fun functionId(functionId: String) = functionId(JsonField.of(functionId))

            /**
             * Sets [Builder.functionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.functionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun functionId(functionId: JsonField<String>) = apply { this.functionId = functionId }

            fun functionName(functionName: String) = functionName(JsonField.of(functionName))

            /**
             * Sets [Builder.functionName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.functionName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun functionName(functionName: JsonField<String>) = apply {
                this.functionName = functionName
            }

            fun memoryUsedBytesAvg(memoryUsedBytesAvg: Double?) =
                memoryUsedBytesAvg(JsonField.ofNullable(memoryUsedBytesAvg))

            /**
             * Alias for [Builder.memoryUsedBytesAvg].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun memoryUsedBytesAvg(memoryUsedBytesAvg: Double) =
                memoryUsedBytesAvg(memoryUsedBytesAvg as Double?)

            /**
             * Alias for calling [Builder.memoryUsedBytesAvg] with
             * `memoryUsedBytesAvg.orElse(null)`.
             */
            fun memoryUsedBytesAvg(memoryUsedBytesAvg: Optional<Double>) =
                memoryUsedBytesAvg(memoryUsedBytesAvg.getOrNull())

            /**
             * Sets [Builder.memoryUsedBytesAvg] to an arbitrary JSON value.
             *
             * You should usually call [Builder.memoryUsedBytesAvg] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun memoryUsedBytesAvg(memoryUsedBytesAvg: JsonField<Double>) = apply {
                this.memoryUsedBytesAvg = memoryUsedBytesAvg
            }

            fun memoryUsedBytesMax(memoryUsedBytesMax: Double?) =
                memoryUsedBytesMax(JsonField.ofNullable(memoryUsedBytesMax))

            /**
             * Alias for [Builder.memoryUsedBytesMax].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun memoryUsedBytesMax(memoryUsedBytesMax: Double) =
                memoryUsedBytesMax(memoryUsedBytesMax as Double?)

            /**
             * Alias for calling [Builder.memoryUsedBytesMax] with
             * `memoryUsedBytesMax.orElse(null)`.
             */
            fun memoryUsedBytesMax(memoryUsedBytesMax: Optional<Double>) =
                memoryUsedBytesMax(memoryUsedBytesMax.getOrNull())

            /**
             * Sets [Builder.memoryUsedBytesMax] to an arbitrary JSON value.
             *
             * You should usually call [Builder.memoryUsedBytesMax] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun memoryUsedBytesMax(memoryUsedBytesMax: JsonField<Double>) = apply {
                this.memoryUsedBytesMax = memoryUsedBytesMax
            }

            fun product(product: String) = product(JsonField.of(product))

            /**
             * Sets [Builder.product] to an arbitrary JSON value.
             *
             * You should usually call [Builder.product] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun product(product: JsonField<String>) = apply { this.product = product }

            fun recordType(recordType: String) = recordType(JsonField.of(recordType))

            /**
             * Sets [Builder.recordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

            fun requestClientErrorRate(requestClientErrorRate: Double?) =
                requestClientErrorRate(JsonField.ofNullable(requestClientErrorRate))

            /**
             * Alias for [Builder.requestClientErrorRate].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun requestClientErrorRate(requestClientErrorRate: Double) =
                requestClientErrorRate(requestClientErrorRate as Double?)

            /**
             * Alias for calling [Builder.requestClientErrorRate] with
             * `requestClientErrorRate.orElse(null)`.
             */
            fun requestClientErrorRate(requestClientErrorRate: Optional<Double>) =
                requestClientErrorRate(requestClientErrorRate.getOrNull())

            /**
             * Sets [Builder.requestClientErrorRate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requestClientErrorRate] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun requestClientErrorRate(requestClientErrorRate: JsonField<Double>) = apply {
                this.requestClientErrorRate = requestClientErrorRate
            }

            fun requestCount(requestCount: Double?) =
                requestCount(JsonField.ofNullable(requestCount))

            /**
             * Alias for [Builder.requestCount].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun requestCount(requestCount: Double) = requestCount(requestCount as Double?)

            /** Alias for calling [Builder.requestCount] with `requestCount.orElse(null)`. */
            fun requestCount(requestCount: Optional<Double>) =
                requestCount(requestCount.getOrNull())

            /**
             * Sets [Builder.requestCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requestCount] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun requestCount(requestCount: JsonField<Double>) = apply {
                this.requestCount = requestCount
            }

            fun requestErrorRate(requestErrorRate: Double?) =
                requestErrorRate(JsonField.ofNullable(requestErrorRate))

            /**
             * Alias for [Builder.requestErrorRate].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun requestErrorRate(requestErrorRate: Double) =
                requestErrorRate(requestErrorRate as Double?)

            /**
             * Alias for calling [Builder.requestErrorRate] with `requestErrorRate.orElse(null)`.
             */
            fun requestErrorRate(requestErrorRate: Optional<Double>) =
                requestErrorRate(requestErrorRate.getOrNull())

            /**
             * Sets [Builder.requestErrorRate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requestErrorRate] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun requestErrorRate(requestErrorRate: JsonField<Double>) = apply {
                this.requestErrorRate = requestErrorRate
            }

            fun requestLatencyAvgMs(requestLatencyAvgMs: Double?) =
                requestLatencyAvgMs(JsonField.ofNullable(requestLatencyAvgMs))

            /**
             * Alias for [Builder.requestLatencyAvgMs].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun requestLatencyAvgMs(requestLatencyAvgMs: Double) =
                requestLatencyAvgMs(requestLatencyAvgMs as Double?)

            /**
             * Alias for calling [Builder.requestLatencyAvgMs] with
             * `requestLatencyAvgMs.orElse(null)`.
             */
            fun requestLatencyAvgMs(requestLatencyAvgMs: Optional<Double>) =
                requestLatencyAvgMs(requestLatencyAvgMs.getOrNull())

            /**
             * Sets [Builder.requestLatencyAvgMs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requestLatencyAvgMs] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun requestLatencyAvgMs(requestLatencyAvgMs: JsonField<Double>) = apply {
                this.requestLatencyAvgMs = requestLatencyAvgMs
            }

            fun requestLatencyP50Ms(requestLatencyP50Ms: Double?) =
                requestLatencyP50Ms(JsonField.ofNullable(requestLatencyP50Ms))

            /**
             * Alias for [Builder.requestLatencyP50Ms].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun requestLatencyP50Ms(requestLatencyP50Ms: Double) =
                requestLatencyP50Ms(requestLatencyP50Ms as Double?)

            /**
             * Alias for calling [Builder.requestLatencyP50Ms] with
             * `requestLatencyP50Ms.orElse(null)`.
             */
            fun requestLatencyP50Ms(requestLatencyP50Ms: Optional<Double>) =
                requestLatencyP50Ms(requestLatencyP50Ms.getOrNull())

            /**
             * Sets [Builder.requestLatencyP50Ms] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requestLatencyP50Ms] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun requestLatencyP50Ms(requestLatencyP50Ms: JsonField<Double>) = apply {
                this.requestLatencyP50Ms = requestLatencyP50Ms
            }

            fun requestLatencyP95Ms(requestLatencyP95Ms: Double?) =
                requestLatencyP95Ms(JsonField.ofNullable(requestLatencyP95Ms))

            /**
             * Alias for [Builder.requestLatencyP95Ms].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun requestLatencyP95Ms(requestLatencyP95Ms: Double) =
                requestLatencyP95Ms(requestLatencyP95Ms as Double?)

            /**
             * Alias for calling [Builder.requestLatencyP95Ms] with
             * `requestLatencyP95Ms.orElse(null)`.
             */
            fun requestLatencyP95Ms(requestLatencyP95Ms: Optional<Double>) =
                requestLatencyP95Ms(requestLatencyP95Ms.getOrNull())

            /**
             * Sets [Builder.requestLatencyP95Ms] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requestLatencyP95Ms] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun requestLatencyP95Ms(requestLatencyP95Ms: JsonField<Double>) = apply {
                this.requestLatencyP95Ms = requestLatencyP95Ms
            }

            fun requestLatencyP99Ms(requestLatencyP99Ms: Double?) =
                requestLatencyP99Ms(JsonField.ofNullable(requestLatencyP99Ms))

            /**
             * Alias for [Builder.requestLatencyP99Ms].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun requestLatencyP99Ms(requestLatencyP99Ms: Double) =
                requestLatencyP99Ms(requestLatencyP99Ms as Double?)

            /**
             * Alias for calling [Builder.requestLatencyP99Ms] with
             * `requestLatencyP99Ms.orElse(null)`.
             */
            fun requestLatencyP99Ms(requestLatencyP99Ms: Optional<Double>) =
                requestLatencyP99Ms(requestLatencyP99Ms.getOrNull())

            /**
             * Sets [Builder.requestLatencyP99Ms] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requestLatencyP99Ms] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun requestLatencyP99Ms(requestLatencyP99Ms: JsonField<Double>) = apply {
                this.requestLatencyP99Ms = requestLatencyP99Ms
            }

            fun requestSuccessRate(requestSuccessRate: Double?) =
                requestSuccessRate(JsonField.ofNullable(requestSuccessRate))

            /**
             * Alias for [Builder.requestSuccessRate].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun requestSuccessRate(requestSuccessRate: Double) =
                requestSuccessRate(requestSuccessRate as Double?)

            /**
             * Alias for calling [Builder.requestSuccessRate] with
             * `requestSuccessRate.orElse(null)`.
             */
            fun requestSuccessRate(requestSuccessRate: Optional<Double>) =
                requestSuccessRate(requestSuccessRate.getOrNull())

            /**
             * Sets [Builder.requestSuccessRate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requestSuccessRate] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun requestSuccessRate(requestSuccessRate: JsonField<Double>) = apply {
                this.requestSuccessRate = requestSuccessRate
            }

            fun startTime(startTime: OffsetDateTime) = startTime(JsonField.of(startTime))

            /**
             * Sets [Builder.startTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startTime] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startTime(startTime: JsonField<OffsetDateTime>) = apply {
                this.startTime = startTime
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
                    cpuUsedCoresAvg,
                    cpuUsedCoresMax,
                    endTime,
                    functionId,
                    functionName,
                    memoryUsedBytesAvg,
                    memoryUsedBytesMax,
                    product,
                    recordType,
                    requestClientErrorRate,
                    requestCount,
                    requestErrorRate,
                    requestLatencyAvgMs,
                    requestLatencyP50Ms,
                    requestLatencyP95Ms,
                    requestLatencyP99Ms,
                    requestSuccessRate,
                    startTime,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            cpuUsedCoresAvg()
            cpuUsedCoresMax()
            endTime()
            functionId()
            functionName()
            memoryUsedBytesAvg()
            memoryUsedBytesMax()
            product()
            recordType()
            requestClientErrorRate()
            requestCount()
            requestErrorRate()
            requestLatencyAvgMs()
            requestLatencyP50Ms()
            requestLatencyP95Ms()
            requestLatencyP99Ms()
            requestSuccessRate()
            startTime()
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
            (if (cpuUsedCoresAvg.asKnown().isPresent) 1 else 0) +
                (if (cpuUsedCoresMax.asKnown().isPresent) 1 else 0) +
                (if (endTime.asKnown().isPresent) 1 else 0) +
                (if (functionId.asKnown().isPresent) 1 else 0) +
                (if (functionName.asKnown().isPresent) 1 else 0) +
                (if (memoryUsedBytesAvg.asKnown().isPresent) 1 else 0) +
                (if (memoryUsedBytesMax.asKnown().isPresent) 1 else 0) +
                (if (product.asKnown().isPresent) 1 else 0) +
                (if (recordType.asKnown().isPresent) 1 else 0) +
                (if (requestClientErrorRate.asKnown().isPresent) 1 else 0) +
                (if (requestCount.asKnown().isPresent) 1 else 0) +
                (if (requestErrorRate.asKnown().isPresent) 1 else 0) +
                (if (requestLatencyAvgMs.asKnown().isPresent) 1 else 0) +
                (if (requestLatencyP50Ms.asKnown().isPresent) 1 else 0) +
                (if (requestLatencyP95Ms.asKnown().isPresent) 1 else 0) +
                (if (requestLatencyP99Ms.asKnown().isPresent) 1 else 0) +
                (if (requestSuccessRate.asKnown().isPresent) 1 else 0) +
                (if (startTime.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                cpuUsedCoresAvg == other.cpuUsedCoresAvg &&
                cpuUsedCoresMax == other.cpuUsedCoresMax &&
                endTime == other.endTime &&
                functionId == other.functionId &&
                functionName == other.functionName &&
                memoryUsedBytesAvg == other.memoryUsedBytesAvg &&
                memoryUsedBytesMax == other.memoryUsedBytesMax &&
                product == other.product &&
                recordType == other.recordType &&
                requestClientErrorRate == other.requestClientErrorRate &&
                requestCount == other.requestCount &&
                requestErrorRate == other.requestErrorRate &&
                requestLatencyAvgMs == other.requestLatencyAvgMs &&
                requestLatencyP50Ms == other.requestLatencyP50Ms &&
                requestLatencyP95Ms == other.requestLatencyP95Ms &&
                requestLatencyP99Ms == other.requestLatencyP99Ms &&
                requestSuccessRate == other.requestSuccessRate &&
                startTime == other.startTime &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                cpuUsedCoresAvg,
                cpuUsedCoresMax,
                endTime,
                functionId,
                functionName,
                memoryUsedBytesAvg,
                memoryUsedBytesMax,
                product,
                recordType,
                requestClientErrorRate,
                requestCount,
                requestErrorRate,
                requestLatencyAvgMs,
                requestLatencyP50Ms,
                requestLatencyP95Ms,
                requestLatencyP99Ms,
                requestSuccessRate,
                startTime,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{cpuUsedCoresAvg=$cpuUsedCoresAvg, cpuUsedCoresMax=$cpuUsedCoresMax, endTime=$endTime, functionId=$functionId, functionName=$functionName, memoryUsedBytesAvg=$memoryUsedBytesAvg, memoryUsedBytesMax=$memoryUsedBytesMax, product=$product, recordType=$recordType, requestClientErrorRate=$requestClientErrorRate, requestCount=$requestCount, requestErrorRate=$requestErrorRate, requestLatencyAvgMs=$requestLatencyAvgMs, requestLatencyP50Ms=$requestLatencyP50Ms, requestLatencyP95Ms=$requestLatencyP95Ms, requestLatencyP99Ms=$requestLatencyP99Ms, requestSuccessRate=$requestSuccessRate, startTime=$startTime, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FuncRetrieveMetricAggregatesResponse &&
            data == other.data &&
            meta == other.meta &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, meta, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FuncRetrieveMetricAggregatesResponse{data=$data, meta=$meta, additionalProperties=$additionalProperties}"
}
