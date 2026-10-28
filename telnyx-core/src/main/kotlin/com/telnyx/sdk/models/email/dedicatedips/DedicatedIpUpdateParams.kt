// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.email.dedicatedips

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Move the IP to another pool, or pause/resume its warm-up ramp. One change applies per request.
 * `pool_id` takes precedence over warm-up changes. Otherwise, use `warmup_paused` or
 * `warmup.paused`; a Boolean `warmup_paused` takes precedence. Moving the last IP out of a pool
 * requires `force: true` and `drain: true`. The PTR hostname is managed by Telnyx: a request that
 * includes `ptr_hostname` returns `422` unless `pool_id` or a warm-up field is present, in which
 * case `ptr_hostname` is ignored.
 */
class DedicatedIpUpdateParams
private constructor(
    private val id: String?,
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /**
     * Set together with `force: true` to move the last IP out of its current pool. Acknowledges
     * that mail routed to the emptied pool is held. Used only with `pool_id`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun drain(): Optional<Boolean> = body.drain()

    /**
     * Set together with `drain: true` to move the last IP out of its current pool. Used only with
     * `pool_id`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun force(): Optional<Boolean> = body.force()

    /**
     * Move the IP to this pool, replacing its current membership. Use the IP's current pool to
     * change only its weight. To take an IP out of a pool, use `DELETE
     * /email/ip_pools/{id}/ips/{ip_id}`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun poolId(): Optional<String> = body.poolId()

    /**
     * Alias for `warmup_paused`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun warmup(): Optional<Warmup> = body.warmup()

    /**
     * Pause (`true`) or resume (`false`) the warm-up ramp; equivalent to the `pause_warmup` and
     * `resume_warmup` actions. A Boolean value takes precedence over `warmup.paused`. When a pause
     * field is present and `pool_id` is absent, supplying neither pause field as a Boolean invokes
     * resume.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun warmupPaused(): Optional<Boolean> = body.warmupPaused()

    /**
     * Routing weight in the target pool. Used only with `pool_id`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun weight(): Optional<Long> = body.weight()

    /**
     * Returns the raw JSON value of [drain].
     *
     * Unlike [drain], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _drain(): JsonField<Boolean> = body._drain()

    /**
     * Returns the raw JSON value of [force].
     *
     * Unlike [force], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _force(): JsonField<Boolean> = body._force()

    /**
     * Returns the raw JSON value of [poolId].
     *
     * Unlike [poolId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _poolId(): JsonField<String> = body._poolId()

    /**
     * Returns the raw JSON value of [warmup].
     *
     * Unlike [warmup], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _warmup(): JsonField<Warmup> = body._warmup()

    /**
     * Returns the raw JSON value of [warmupPaused].
     *
     * Unlike [warmupPaused], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _warmupPaused(): JsonField<Boolean> = body._warmupPaused()

    /**
     * Returns the raw JSON value of [weight].
     *
     * Unlike [weight], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _weight(): JsonField<Long> = body._weight()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): DedicatedIpUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [DedicatedIpUpdateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DedicatedIpUpdateParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(dedicatedIpUpdateParams: DedicatedIpUpdateParams) = apply {
            id = dedicatedIpUpdateParams.id
            body = dedicatedIpUpdateParams.body.toBuilder()
            additionalHeaders = dedicatedIpUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = dedicatedIpUpdateParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [drain]
         * - [force]
         * - [poolId]
         * - [warmup]
         * - [warmupPaused]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Set together with `force: true` to move the last IP out of its current pool. Acknowledges
         * that mail routed to the emptied pool is held. Used only with `pool_id`.
         */
        fun drain(drain: Boolean) = apply { body.drain(drain) }

        /**
         * Sets [Builder.drain] to an arbitrary JSON value.
         *
         * You should usually call [Builder.drain] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun drain(drain: JsonField<Boolean>) = apply { body.drain(drain) }

        /**
         * Set together with `drain: true` to move the last IP out of its current pool. Used only
         * with `pool_id`.
         */
        fun force(force: Boolean) = apply { body.force(force) }

        /**
         * Sets [Builder.force] to an arbitrary JSON value.
         *
         * You should usually call [Builder.force] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun force(force: JsonField<Boolean>) = apply { body.force(force) }

        /**
         * Move the IP to this pool, replacing its current membership. Use the IP's current pool to
         * change only its weight. To take an IP out of a pool, use `DELETE
         * /email/ip_pools/{id}/ips/{ip_id}`.
         */
        fun poolId(poolId: String) = apply { body.poolId(poolId) }

        /**
         * Sets [Builder.poolId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.poolId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun poolId(poolId: JsonField<String>) = apply { body.poolId(poolId) }

        /** Alias for `warmup_paused`. */
        fun warmup(warmup: Warmup) = apply { body.warmup(warmup) }

        /**
         * Sets [Builder.warmup] to an arbitrary JSON value.
         *
         * You should usually call [Builder.warmup] with a well-typed [Warmup] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun warmup(warmup: JsonField<Warmup>) = apply { body.warmup(warmup) }

        /**
         * Pause (`true`) or resume (`false`) the warm-up ramp; equivalent to the `pause_warmup` and
         * `resume_warmup` actions. A Boolean value takes precedence over `warmup.paused`. When a
         * pause field is present and `pool_id` is absent, supplying neither pause field as a
         * Boolean invokes resume.
         */
        fun warmupPaused(warmupPaused: Boolean) = apply { body.warmupPaused(warmupPaused) }

        /**
         * Sets [Builder.warmupPaused] to an arbitrary JSON value.
         *
         * You should usually call [Builder.warmupPaused] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun warmupPaused(warmupPaused: JsonField<Boolean>) = apply {
            body.warmupPaused(warmupPaused)
        }

        /** Routing weight in the target pool. Used only with `pool_id`. */
        fun weight(weight: Long) = apply { body.weight(weight) }

        /**
         * Sets [Builder.weight] to an arbitrary JSON value.
         *
         * You should usually call [Builder.weight] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun weight(weight: JsonField<Long>) = apply { body.weight(weight) }

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

        fun additionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
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

        fun putAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
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

        fun replaceAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) =
            apply {
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
         * Returns an immutable instance of [DedicatedIpUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): DedicatedIpUpdateParams =
            DedicatedIpUpdateParams(
                id,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Applies one change per request. `pool_id` takes precedence over warm-up changes: when it is
     * present, the IP moves to that pool (with `weight`, `force`, and `drain`) and other fields are
     * ignored. Otherwise, use `warmup_paused` or `warmup.paused`; a Boolean `warmup_paused` takes
     * precedence. The PTR hostname is managed by Telnyx and cannot be changed: when neither
     * `pool_id` nor a warm-up field is present, a body that includes `ptr_hostname` (including
     * `null`) returns `422` and the IP is unchanged. A body with none of these fields returns the
     * IP unchanged.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val drain: JsonField<Boolean>,
        private val force: JsonField<Boolean>,
        private val poolId: JsonField<String>,
        private val warmup: JsonField<Warmup>,
        private val warmupPaused: JsonField<Boolean>,
        private val weight: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("drain") @ExcludeMissing drain: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("force") @ExcludeMissing force: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("pool_id") @ExcludeMissing poolId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("warmup") @ExcludeMissing warmup: JsonField<Warmup> = JsonMissing.of(),
            @JsonProperty("warmup_paused")
            @ExcludeMissing
            warmupPaused: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("weight") @ExcludeMissing weight: JsonField<Long> = JsonMissing.of(),
        ) : this(drain, force, poolId, warmup, warmupPaused, weight, mutableMapOf())

        /**
         * Set together with `force: true` to move the last IP out of its current pool. Acknowledges
         * that mail routed to the emptied pool is held. Used only with `pool_id`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun drain(): Optional<Boolean> = drain.getOptional("drain")

        /**
         * Set together with `drain: true` to move the last IP out of its current pool. Used only
         * with `pool_id`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun force(): Optional<Boolean> = force.getOptional("force")

        /**
         * Move the IP to this pool, replacing its current membership. Use the IP's current pool to
         * change only its weight. To take an IP out of a pool, use `DELETE
         * /email/ip_pools/{id}/ips/{ip_id}`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun poolId(): Optional<String> = poolId.getOptional("pool_id")

        /**
         * Alias for `warmup_paused`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun warmup(): Optional<Warmup> = warmup.getOptional("warmup")

        /**
         * Pause (`true`) or resume (`false`) the warm-up ramp; equivalent to the `pause_warmup` and
         * `resume_warmup` actions. A Boolean value takes precedence over `warmup.paused`. When a
         * pause field is present and `pool_id` is absent, supplying neither pause field as a
         * Boolean invokes resume.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun warmupPaused(): Optional<Boolean> = warmupPaused.getOptional("warmup_paused")

        /**
         * Routing weight in the target pool. Used only with `pool_id`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun weight(): Optional<Long> = weight.getOptional("weight")

        /**
         * Returns the raw JSON value of [drain].
         *
         * Unlike [drain], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("drain") @ExcludeMissing fun _drain(): JsonField<Boolean> = drain

        /**
         * Returns the raw JSON value of [force].
         *
         * Unlike [force], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("force") @ExcludeMissing fun _force(): JsonField<Boolean> = force

        /**
         * Returns the raw JSON value of [poolId].
         *
         * Unlike [poolId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pool_id") @ExcludeMissing fun _poolId(): JsonField<String> = poolId

        /**
         * Returns the raw JSON value of [warmup].
         *
         * Unlike [warmup], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("warmup") @ExcludeMissing fun _warmup(): JsonField<Warmup> = warmup

        /**
         * Returns the raw JSON value of [warmupPaused].
         *
         * Unlike [warmupPaused], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("warmup_paused")
        @ExcludeMissing
        fun _warmupPaused(): JsonField<Boolean> = warmupPaused

        /**
         * Returns the raw JSON value of [weight].
         *
         * Unlike [weight], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("weight") @ExcludeMissing fun _weight(): JsonField<Long> = weight

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

            private var drain: JsonField<Boolean> = JsonMissing.of()
            private var force: JsonField<Boolean> = JsonMissing.of()
            private var poolId: JsonField<String> = JsonMissing.of()
            private var warmup: JsonField<Warmup> = JsonMissing.of()
            private var warmupPaused: JsonField<Boolean> = JsonMissing.of()
            private var weight: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                drain = body.drain
                force = body.force
                poolId = body.poolId
                warmup = body.warmup
                warmupPaused = body.warmupPaused
                weight = body.weight
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Set together with `force: true` to move the last IP out of its current pool.
             * Acknowledges that mail routed to the emptied pool is held. Used only with `pool_id`.
             */
            fun drain(drain: Boolean) = drain(JsonField.of(drain))

            /**
             * Sets [Builder.drain] to an arbitrary JSON value.
             *
             * You should usually call [Builder.drain] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun drain(drain: JsonField<Boolean>) = apply { this.drain = drain }

            /**
             * Set together with `drain: true` to move the last IP out of its current pool. Used
             * only with `pool_id`.
             */
            fun force(force: Boolean) = force(JsonField.of(force))

            /**
             * Sets [Builder.force] to an arbitrary JSON value.
             *
             * You should usually call [Builder.force] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun force(force: JsonField<Boolean>) = apply { this.force = force }

            /**
             * Move the IP to this pool, replacing its current membership. Use the IP's current pool
             * to change only its weight. To take an IP out of a pool, use `DELETE
             * /email/ip_pools/{id}/ips/{ip_id}`.
             */
            fun poolId(poolId: String) = poolId(JsonField.of(poolId))

            /**
             * Sets [Builder.poolId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.poolId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun poolId(poolId: JsonField<String>) = apply { this.poolId = poolId }

            /** Alias for `warmup_paused`. */
            fun warmup(warmup: Warmup) = warmup(JsonField.of(warmup))

            /**
             * Sets [Builder.warmup] to an arbitrary JSON value.
             *
             * You should usually call [Builder.warmup] with a well-typed [Warmup] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun warmup(warmup: JsonField<Warmup>) = apply { this.warmup = warmup }

            /**
             * Pause (`true`) or resume (`false`) the warm-up ramp; equivalent to the `pause_warmup`
             * and `resume_warmup` actions. A Boolean value takes precedence over `warmup.paused`.
             * When a pause field is present and `pool_id` is absent, supplying neither pause field
             * as a Boolean invokes resume.
             */
            fun warmupPaused(warmupPaused: Boolean) = warmupPaused(JsonField.of(warmupPaused))

            /**
             * Sets [Builder.warmupPaused] to an arbitrary JSON value.
             *
             * You should usually call [Builder.warmupPaused] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun warmupPaused(warmupPaused: JsonField<Boolean>) = apply {
                this.warmupPaused = warmupPaused
            }

            /** Routing weight in the target pool. Used only with `pool_id`. */
            fun weight(weight: Long) = weight(JsonField.of(weight))

            /**
             * Sets [Builder.weight] to an arbitrary JSON value.
             *
             * You should usually call [Builder.weight] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun weight(weight: JsonField<Long>) = apply { this.weight = weight }

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
                    drain,
                    force,
                    poolId,
                    warmup,
                    warmupPaused,
                    weight,
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            drain()
            force()
            poolId()
            warmup().ifPresent { it.validate() }
            warmupPaused()
            weight()
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
            (if (drain.asKnown().isPresent) 1 else 0) +
                (if (force.asKnown().isPresent) 1 else 0) +
                (if (poolId.asKnown().isPresent) 1 else 0) +
                (warmup.asKnown().getOrNull()?.validity() ?: 0) +
                (if (warmupPaused.asKnown().isPresent) 1 else 0) +
                (if (weight.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                drain == other.drain &&
                force == other.force &&
                poolId == other.poolId &&
                warmup == other.warmup &&
                warmupPaused == other.warmupPaused &&
                weight == other.weight &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(drain, force, poolId, warmup, warmupPaused, weight, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{drain=$drain, force=$force, poolId=$poolId, warmup=$warmup, warmupPaused=$warmupPaused, weight=$weight, additionalProperties=$additionalProperties}"
    }

    /** Alias for `warmup_paused`. */
    class Warmup
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val paused: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("paused") @ExcludeMissing paused: JsonField<Boolean> = JsonMissing.of()
        ) : this(paused, mutableMapOf())

        /**
         * Pause (`true`) or resume (`false`) the warm-up ramp. Used only when `warmup_paused` is
         * not a Boolean.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun paused(): Optional<Boolean> = paused.getOptional("paused")

        /**
         * Returns the raw JSON value of [paused].
         *
         * Unlike [paused], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("paused") @ExcludeMissing fun _paused(): JsonField<Boolean> = paused

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

            /** Returns a mutable builder for constructing an instance of [Warmup]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Warmup]. */
        class Builder internal constructor() {

            private var paused: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(warmup: Warmup) = apply {
                paused = warmup.paused
                additionalProperties = warmup.additionalProperties.toMutableMap()
            }

            /**
             * Pause (`true`) or resume (`false`) the warm-up ramp. Used only when `warmup_paused`
             * is not a Boolean.
             */
            fun paused(paused: Boolean) = paused(JsonField.of(paused))

            /**
             * Sets [Builder.paused] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paused] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun paused(paused: JsonField<Boolean>) = apply { this.paused = paused }

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
             * Returns an immutable instance of [Warmup].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Warmup = Warmup(paused, additionalProperties.toMutableMap())
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
        fun validate(): Warmup = apply {
            if (validated) {
                return@apply
            }

            paused()
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
        @JvmSynthetic internal fun validity(): Int = (if (paused.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Warmup &&
                paused == other.paused &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(paused, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Warmup{paused=$paused, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DedicatedIpUpdateParams &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "DedicatedIpUpdateParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
