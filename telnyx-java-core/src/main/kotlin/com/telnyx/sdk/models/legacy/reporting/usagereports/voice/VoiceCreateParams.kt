// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.legacy.reporting.usagereports.voice

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Creates a new legacy usage V2 CDR report request with the specified filters */
class VoiceCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * End time in ISO format
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun endTime(): OffsetDateTime = body.endTime()

    /**
     * Start time in ISO format
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startTime(): OffsetDateTime = body.startTime()

    /**
     * Aggregation type: All = 0, By Connections = 1, By Tags = 2, By Billing Group = 3
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun aggregationType(): Optional<Int> = body.aggregationType()

    /**
     * List of connections to filter by
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun connections(): Optional<List<Long>> = body.connections()

    /**
     * List of managed accounts to include
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun managedAccounts(): Optional<List<String>> = body.managedAccounts()

    /**
     * Product breakdown type: No breakdown = 0, DID vs Toll-free = 1, Country = 2, DID vs Toll-free
     * per Country = 3
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun productBreakdown(): Optional<Int> = body.productBreakdown()

    /**
     * Whether to select all managed accounts
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun selectAllManagedAccounts(): Optional<Boolean> = body.selectAllManagedAccounts()

    /**
     * Returns the raw JSON value of [endTime].
     *
     * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _endTime(): JsonField<OffsetDateTime> = body._endTime()

    /**
     * Returns the raw JSON value of [startTime].
     *
     * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _startTime(): JsonField<OffsetDateTime> = body._startTime()

    /**
     * Returns the raw JSON value of [aggregationType].
     *
     * Unlike [aggregationType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _aggregationType(): JsonField<Int> = body._aggregationType()

    /**
     * Returns the raw JSON value of [connections].
     *
     * Unlike [connections], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _connections(): JsonField<List<Long>> = body._connections()

    /**
     * Returns the raw JSON value of [managedAccounts].
     *
     * Unlike [managedAccounts], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _managedAccounts(): JsonField<List<String>> = body._managedAccounts()

    /**
     * Returns the raw JSON value of [productBreakdown].
     *
     * Unlike [productBreakdown], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _productBreakdown(): JsonField<Int> = body._productBreakdown()

    /**
     * Returns the raw JSON value of [selectAllManagedAccounts].
     *
     * Unlike [selectAllManagedAccounts], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _selectAllManagedAccounts(): JsonField<Boolean> = body._selectAllManagedAccounts()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [VoiceCreateParams].
         *
         * The following fields are required:
         * ```java
         * .endTime()
         * .startTime()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VoiceCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(voiceCreateParams: VoiceCreateParams) = apply {
            body = voiceCreateParams.body.toBuilder()
            additionalHeaders = voiceCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = voiceCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [endTime]
         * - [startTime]
         * - [aggregationType]
         * - [connections]
         * - [managedAccounts]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** End time in ISO format */
        fun endTime(endTime: OffsetDateTime) = apply { body.endTime(endTime) }

        /**
         * Sets [Builder.endTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endTime(endTime: JsonField<OffsetDateTime>) = apply { body.endTime(endTime) }

        /** Start time in ISO format */
        fun startTime(startTime: OffsetDateTime) = apply { body.startTime(startTime) }

        /**
         * Sets [Builder.startTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startTime(startTime: JsonField<OffsetDateTime>) = apply { body.startTime(startTime) }

        /** Aggregation type: All = 0, By Connections = 1, By Tags = 2, By Billing Group = 3 */
        fun aggregationType(aggregationType: Int) = apply { body.aggregationType(aggregationType) }

        /**
         * Sets [Builder.aggregationType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aggregationType] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun aggregationType(aggregationType: JsonField<Int>) = apply {
            body.aggregationType(aggregationType)
        }

        /** List of connections to filter by */
        fun connections(connections: List<Long>) = apply { body.connections(connections) }

        /**
         * Sets [Builder.connections] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connections] with a well-typed `List<Long>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun connections(connections: JsonField<List<Long>>) = apply {
            body.connections(connections)
        }

        /**
         * Adds a single [Long] to [connections].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addConnection(connection: Long) = apply { body.addConnection(connection) }

        /** List of managed accounts to include */
        fun managedAccounts(managedAccounts: List<String>) = apply {
            body.managedAccounts(managedAccounts)
        }

        /**
         * Sets [Builder.managedAccounts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.managedAccounts] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun managedAccounts(managedAccounts: JsonField<List<String>>) = apply {
            body.managedAccounts(managedAccounts)
        }

        /**
         * Adds a single [String] to [managedAccounts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addManagedAccount(managedAccount: String) = apply {
            body.addManagedAccount(managedAccount)
        }

        /**
         * Product breakdown type: No breakdown = 0, DID vs Toll-free = 1, Country = 2, DID vs
         * Toll-free per Country = 3
         */
        fun productBreakdown(productBreakdown: Int) = apply {
            body.productBreakdown(productBreakdown)
        }

        /**
         * Sets [Builder.productBreakdown] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productBreakdown] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun productBreakdown(productBreakdown: JsonField<Int>) = apply {
            body.productBreakdown(productBreakdown)
        }

        /** Whether to select all managed accounts */
        fun selectAllManagedAccounts(selectAllManagedAccounts: Boolean) = apply {
            body.selectAllManagedAccounts(selectAllManagedAccounts)
        }

        /**
         * Sets [Builder.selectAllManagedAccounts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.selectAllManagedAccounts] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun selectAllManagedAccounts(selectAllManagedAccounts: JsonField<Boolean>) = apply {
            body.selectAllManagedAccounts(selectAllManagedAccounts)
        }

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
         * Returns an immutable instance of [VoiceCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .endTime()
         * .startTime()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VoiceCreateParams =
            VoiceCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Request object for CDR usage report */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val endTime: JsonField<OffsetDateTime>,
        private val startTime: JsonField<OffsetDateTime>,
        private val aggregationType: JsonField<Int>,
        private val connections: JsonField<List<Long>>,
        private val managedAccounts: JsonField<List<String>>,
        private val productBreakdown: JsonField<Int>,
        private val selectAllManagedAccounts: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("end_time")
            @ExcludeMissing
            endTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("start_time")
            @ExcludeMissing
            startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("aggregation_type")
            @ExcludeMissing
            aggregationType: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("connections")
            @ExcludeMissing
            connections: JsonField<List<Long>> = JsonMissing.of(),
            @JsonProperty("managed_accounts")
            @ExcludeMissing
            managedAccounts: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("product_breakdown")
            @ExcludeMissing
            productBreakdown: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("select_all_managed_accounts")
            @ExcludeMissing
            selectAllManagedAccounts: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            endTime,
            startTime,
            aggregationType,
            connections,
            managedAccounts,
            productBreakdown,
            selectAllManagedAccounts,
            mutableMapOf(),
        )

        /**
         * End time in ISO format
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun endTime(): OffsetDateTime = endTime.getRequired("end_time")

        /**
         * Start time in ISO format
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startTime(): OffsetDateTime = startTime.getRequired("start_time")

        /**
         * Aggregation type: All = 0, By Connections = 1, By Tags = 2, By Billing Group = 3
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun aggregationType(): Optional<Int> = aggregationType.getOptional("aggregation_type")

        /**
         * List of connections to filter by
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun connections(): Optional<List<Long>> = connections.getOptional("connections")

        /**
         * List of managed accounts to include
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun managedAccounts(): Optional<List<String>> =
            managedAccounts.getOptional("managed_accounts")

        /**
         * Product breakdown type: No breakdown = 0, DID vs Toll-free = 1, Country = 2, DID vs
         * Toll-free per Country = 3
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun productBreakdown(): Optional<Int> = productBreakdown.getOptional("product_breakdown")

        /**
         * Whether to select all managed accounts
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun selectAllManagedAccounts(): Optional<Boolean> =
            selectAllManagedAccounts.getOptional("select_all_managed_accounts")

        /**
         * Returns the raw JSON value of [endTime].
         *
         * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_time")
        @ExcludeMissing
        fun _endTime(): JsonField<OffsetDateTime> = endTime

        /**
         * Returns the raw JSON value of [startTime].
         *
         * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_time")
        @ExcludeMissing
        fun _startTime(): JsonField<OffsetDateTime> = startTime

        /**
         * Returns the raw JSON value of [aggregationType].
         *
         * Unlike [aggregationType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("aggregation_type")
        @ExcludeMissing
        fun _aggregationType(): JsonField<Int> = aggregationType

        /**
         * Returns the raw JSON value of [connections].
         *
         * Unlike [connections], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("connections")
        @ExcludeMissing
        fun _connections(): JsonField<List<Long>> = connections

        /**
         * Returns the raw JSON value of [managedAccounts].
         *
         * Unlike [managedAccounts], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("managed_accounts")
        @ExcludeMissing
        fun _managedAccounts(): JsonField<List<String>> = managedAccounts

        /**
         * Returns the raw JSON value of [productBreakdown].
         *
         * Unlike [productBreakdown], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("product_breakdown")
        @ExcludeMissing
        fun _productBreakdown(): JsonField<Int> = productBreakdown

        /**
         * Returns the raw JSON value of [selectAllManagedAccounts].
         *
         * Unlike [selectAllManagedAccounts], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("select_all_managed_accounts")
        @ExcludeMissing
        fun _selectAllManagedAccounts(): JsonField<Boolean> = selectAllManagedAccounts

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
             * .endTime()
             * .startTime()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var endTime: JsonField<OffsetDateTime>? = null
            private var startTime: JsonField<OffsetDateTime>? = null
            private var aggregationType: JsonField<Int> = JsonMissing.of()
            private var connections: JsonField<MutableList<Long>>? = null
            private var managedAccounts: JsonField<MutableList<String>>? = null
            private var productBreakdown: JsonField<Int> = JsonMissing.of()
            private var selectAllManagedAccounts: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                endTime = body.endTime
                startTime = body.startTime
                aggregationType = body.aggregationType
                connections = body.connections.map { it.toMutableList() }
                managedAccounts = body.managedAccounts.map { it.toMutableList() }
                productBreakdown = body.productBreakdown
                selectAllManagedAccounts = body.selectAllManagedAccounts
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** End time in ISO format */
            fun endTime(endTime: OffsetDateTime) = endTime(JsonField.of(endTime))

            /**
             * Sets [Builder.endTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endTime] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endTime(endTime: JsonField<OffsetDateTime>) = apply { this.endTime = endTime }

            /** Start time in ISO format */
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

            /** Aggregation type: All = 0, By Connections = 1, By Tags = 2, By Billing Group = 3 */
            fun aggregationType(aggregationType: Int) =
                aggregationType(JsonField.of(aggregationType))

            /**
             * Sets [Builder.aggregationType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.aggregationType] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun aggregationType(aggregationType: JsonField<Int>) = apply {
                this.aggregationType = aggregationType
            }

            /** List of connections to filter by */
            fun connections(connections: List<Long>) = connections(JsonField.of(connections))

            /**
             * Sets [Builder.connections] to an arbitrary JSON value.
             *
             * You should usually call [Builder.connections] with a well-typed `List<Long>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun connections(connections: JsonField<List<Long>>) = apply {
                this.connections = connections.map { it.toMutableList() }
            }

            /**
             * Adds a single [Long] to [connections].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addConnection(connection: Long) = apply {
                connections =
                    (connections ?: JsonField.of(mutableListOf())).also {
                        checkKnown("connections", it).add(connection)
                    }
            }

            /** List of managed accounts to include */
            fun managedAccounts(managedAccounts: List<String>) =
                managedAccounts(JsonField.of(managedAccounts))

            /**
             * Sets [Builder.managedAccounts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.managedAccounts] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun managedAccounts(managedAccounts: JsonField<List<String>>) = apply {
                this.managedAccounts = managedAccounts.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [managedAccounts].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addManagedAccount(managedAccount: String) = apply {
                managedAccounts =
                    (managedAccounts ?: JsonField.of(mutableListOf())).also {
                        checkKnown("managedAccounts", it).add(managedAccount)
                    }
            }

            /**
             * Product breakdown type: No breakdown = 0, DID vs Toll-free = 1, Country = 2, DID vs
             * Toll-free per Country = 3
             */
            fun productBreakdown(productBreakdown: Int) =
                productBreakdown(JsonField.of(productBreakdown))

            /**
             * Sets [Builder.productBreakdown] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productBreakdown] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun productBreakdown(productBreakdown: JsonField<Int>) = apply {
                this.productBreakdown = productBreakdown
            }

            /** Whether to select all managed accounts */
            fun selectAllManagedAccounts(selectAllManagedAccounts: Boolean) =
                selectAllManagedAccounts(JsonField.of(selectAllManagedAccounts))

            /**
             * Sets [Builder.selectAllManagedAccounts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.selectAllManagedAccounts] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun selectAllManagedAccounts(selectAllManagedAccounts: JsonField<Boolean>) = apply {
                this.selectAllManagedAccounts = selectAllManagedAccounts
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
             * .endTime()
             * .startTime()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("endTime", endTime),
                    checkRequired("startTime", startTime),
                    aggregationType,
                    (connections ?: JsonMissing.of()).map { it.toImmutable() },
                    (managedAccounts ?: JsonMissing.of()).map { it.toImmutable() },
                    productBreakdown,
                    selectAllManagedAccounts,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            endTime()
            startTime()
            aggregationType()
            connections()
            managedAccounts()
            productBreakdown()
            selectAllManagedAccounts()
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
            (if (endTime.asKnown().isPresent) 1 else 0) +
                (if (startTime.asKnown().isPresent) 1 else 0) +
                (if (aggregationType.asKnown().isPresent) 1 else 0) +
                (connections.asKnown().getOrNull()?.size ?: 0) +
                (managedAccounts.asKnown().getOrNull()?.size ?: 0) +
                (if (productBreakdown.asKnown().isPresent) 1 else 0) +
                (if (selectAllManagedAccounts.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                endTime == other.endTime &&
                startTime == other.startTime &&
                aggregationType == other.aggregationType &&
                connections == other.connections &&
                managedAccounts == other.managedAccounts &&
                productBreakdown == other.productBreakdown &&
                selectAllManagedAccounts == other.selectAllManagedAccounts &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                endTime,
                startTime,
                aggregationType,
                connections,
                managedAccounts,
                productBreakdown,
                selectAllManagedAccounts,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{endTime=$endTime, startTime=$startTime, aggregationType=$aggregationType, connections=$connections, managedAccounts=$managedAccounts, productBreakdown=$productBreakdown, selectAllManagedAccounts=$selectAllManagedAccounts, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VoiceCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "VoiceCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
