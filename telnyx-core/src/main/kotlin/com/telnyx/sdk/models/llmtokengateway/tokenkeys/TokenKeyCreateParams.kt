// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.llmtokengateway.tokenkeys

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
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import com.telnyx.sdk.models.llmtokengateway.tokengroups.BudgetDuration
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Create gateway token key within the authenticated Telnyx account. Foreign and unknown resource
 * IDs return the same 404 response. The token secret is returned only on the original create
 * response. A replay returns metadata without the secret. Provisioning is advisory; ready is not a
 * guarantee of inference availability.
 */
class TokenKeyCreateParams
private constructor(
    private val idempotencyKey: String,
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun idempotencyKey(): String = idempotencyKey

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tokenGroupId(): String = body.tokenGroupId()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun allowedModels(): Optional<List<String>> = body.allowedModels()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun blocked(): Optional<Boolean> = body.blocked()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun budgetDuration(): Optional<BudgetDuration> = body.budgetDuration()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expiresAt(): Optional<OffsetDateTime> = body.expiresAt()

    /**
     * USD, decimal precision at most 6 places; parse exactly to integer micro-USD, never binary
     * float accounting.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxBudget(): Optional<Double> = body.maxBudget()

    /**
     * Optional maximum concurrent reserved/dispatched cache misses across replicas. Null means no
     * concurrency cap. Cache hits do not consume slots; unknown usage retains its budget hold
     * without a slot.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxParallelRequests(): Optional<Long> = body.maxParallelRequests()

    /**
     * Require a nonempty caller-asserted end-user ID; not proof of identity.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun requiredEndUserId(): Optional<Boolean> = body.requiredEndUserId()

    /**
     * Omitted or null defaults to the maximum (6000) (on a blocked key, null is kept until the key
     * is unblocked); a value below the minimum (1) or above the maximum is rejected with 400
     * limit_out_of_range; a malformed value (negative, wrong type or precision) is 400
     * invalid_request. Block the key (blocked: true) to deny it; blocking is always accepted.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rpmLimit(): Optional<Long> = body.rpmLimit()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tokenUserId(): Optional<String> = body.tokenUserId()

    /**
     * Omitted or null defaults to the maximum (10000000) (on a blocked key, null is kept until the
     * key is unblocked); a value below the minimum (1) or above the maximum is rejected with 400
     * limit_out_of_range; a malformed value (negative, wrong type or precision) is 400
     * invalid_request. Block the key (blocked: true) to deny it; blocking is always accepted.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tpmLimit(): Optional<Long> = body.tpmLimit()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [tokenGroupId].
     *
     * Unlike [tokenGroupId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tokenGroupId(): JsonField<String> = body._tokenGroupId()

    /**
     * Returns the raw JSON value of [allowedModels].
     *
     * Unlike [allowedModels], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _allowedModels(): JsonField<List<String>> = body._allowedModels()

    /**
     * Returns the raw JSON value of [blocked].
     *
     * Unlike [blocked], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _blocked(): JsonField<Boolean> = body._blocked()

    /**
     * Returns the raw JSON value of [budgetDuration].
     *
     * Unlike [budgetDuration], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _budgetDuration(): JsonField<BudgetDuration> = body._budgetDuration()

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _expiresAt(): JsonField<OffsetDateTime> = body._expiresAt()

    /**
     * Returns the raw JSON value of [maxBudget].
     *
     * Unlike [maxBudget], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _maxBudget(): JsonField<Double> = body._maxBudget()

    /**
     * Returns the raw JSON value of [maxParallelRequests].
     *
     * Unlike [maxParallelRequests], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _maxParallelRequests(): JsonField<Long> = body._maxParallelRequests()

    /**
     * Returns the raw JSON value of [requiredEndUserId].
     *
     * Unlike [requiredEndUserId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _requiredEndUserId(): JsonField<Boolean> = body._requiredEndUserId()

    /**
     * Returns the raw JSON value of [rpmLimit].
     *
     * Unlike [rpmLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _rpmLimit(): JsonField<Long> = body._rpmLimit()

    /**
     * Returns the raw JSON value of [tokenUserId].
     *
     * Unlike [tokenUserId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tokenUserId(): JsonField<String> = body._tokenUserId()

    /**
     * Returns the raw JSON value of [tpmLimit].
     *
     * Unlike [tpmLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tpmLimit(): JsonField<Long> = body._tpmLimit()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TokenKeyCreateParams].
         *
         * The following fields are required:
         * ```java
         * .idempotencyKey()
         * .name()
         * .tokenGroupId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TokenKeyCreateParams]. */
    class Builder internal constructor() {

        private var idempotencyKey: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(tokenKeyCreateParams: TokenKeyCreateParams) = apply {
            idempotencyKey = tokenKeyCreateParams.idempotencyKey
            body = tokenKeyCreateParams.body.toBuilder()
            additionalHeaders = tokenKeyCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = tokenKeyCreateParams.additionalQueryParams.toBuilder()
        }

        fun idempotencyKey(idempotencyKey: String) = apply { this.idempotencyKey = idempotencyKey }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [name]
         * - [tokenGroupId]
         * - [allowedModels]
         * - [blocked]
         * - [budgetDuration]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        fun tokenGroupId(tokenGroupId: String) = apply { body.tokenGroupId(tokenGroupId) }

        /**
         * Sets [Builder.tokenGroupId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tokenGroupId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tokenGroupId(tokenGroupId: JsonField<String>) = apply {
            body.tokenGroupId(tokenGroupId)
        }

        fun allowedModels(allowedModels: List<String>?) = apply {
            body.allowedModels(allowedModels)
        }

        /** Alias for calling [Builder.allowedModels] with `allowedModels.orElse(null)`. */
        fun allowedModels(allowedModels: Optional<List<String>>) =
            allowedModels(allowedModels.getOrNull())

        /**
         * Sets [Builder.allowedModels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowedModels] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun allowedModels(allowedModels: JsonField<List<String>>) = apply {
            body.allowedModels(allowedModels)
        }

        /**
         * Adds a single [String] to [allowedModels].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAllowedModel(allowedModel: String) = apply { body.addAllowedModel(allowedModel) }

        fun blocked(blocked: Boolean) = apply { body.blocked(blocked) }

        /**
         * Sets [Builder.blocked] to an arbitrary JSON value.
         *
         * You should usually call [Builder.blocked] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun blocked(blocked: JsonField<Boolean>) = apply { body.blocked(blocked) }

        fun budgetDuration(budgetDuration: BudgetDuration?) = apply {
            body.budgetDuration(budgetDuration)
        }

        /** Alias for calling [Builder.budgetDuration] with `budgetDuration.orElse(null)`. */
        fun budgetDuration(budgetDuration: Optional<BudgetDuration>) =
            budgetDuration(budgetDuration.getOrNull())

        /**
         * Sets [Builder.budgetDuration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.budgetDuration] with a well-typed [BudgetDuration] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun budgetDuration(budgetDuration: JsonField<BudgetDuration>) = apply {
            body.budgetDuration(budgetDuration)
        }

        fun expiresAt(expiresAt: OffsetDateTime?) = apply { body.expiresAt(expiresAt) }

        /** Alias for calling [Builder.expiresAt] with `expiresAt.orElse(null)`. */
        fun expiresAt(expiresAt: Optional<OffsetDateTime>) = expiresAt(expiresAt.getOrNull())

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { body.expiresAt(expiresAt) }

        /**
         * USD, decimal precision at most 6 places; parse exactly to integer micro-USD, never binary
         * float accounting.
         */
        fun maxBudget(maxBudget: Double?) = apply { body.maxBudget(maxBudget) }

        /**
         * Alias for [Builder.maxBudget].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxBudget(maxBudget: Double) = maxBudget(maxBudget as Double?)

        /** Alias for calling [Builder.maxBudget] with `maxBudget.orElse(null)`. */
        fun maxBudget(maxBudget: Optional<Double>) = maxBudget(maxBudget.getOrNull())

        /**
         * Sets [Builder.maxBudget] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxBudget] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxBudget(maxBudget: JsonField<Double>) = apply { body.maxBudget(maxBudget) }

        /**
         * Optional maximum concurrent reserved/dispatched cache misses across replicas. Null means
         * no concurrency cap. Cache hits do not consume slots; unknown usage retains its budget
         * hold without a slot.
         */
        fun maxParallelRequests(maxParallelRequests: Long?) = apply {
            body.maxParallelRequests(maxParallelRequests)
        }

        /**
         * Alias for [Builder.maxParallelRequests].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxParallelRequests(maxParallelRequests: Long) =
            maxParallelRequests(maxParallelRequests as Long?)

        /**
         * Alias for calling [Builder.maxParallelRequests] with `maxParallelRequests.orElse(null)`.
         */
        fun maxParallelRequests(maxParallelRequests: Optional<Long>) =
            maxParallelRequests(maxParallelRequests.getOrNull())

        /**
         * Sets [Builder.maxParallelRequests] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxParallelRequests] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxParallelRequests(maxParallelRequests: JsonField<Long>) = apply {
            body.maxParallelRequests(maxParallelRequests)
        }

        /** Require a nonempty caller-asserted end-user ID; not proof of identity. */
        fun requiredEndUserId(requiredEndUserId: Boolean) = apply {
            body.requiredEndUserId(requiredEndUserId)
        }

        /**
         * Sets [Builder.requiredEndUserId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requiredEndUserId] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun requiredEndUserId(requiredEndUserId: JsonField<Boolean>) = apply {
            body.requiredEndUserId(requiredEndUserId)
        }

        /**
         * Omitted or null defaults to the maximum (6000) (on a blocked key, null is kept until the
         * key is unblocked); a value below the minimum (1) or above the maximum is rejected with
         * 400 limit_out_of_range; a malformed value (negative, wrong type or precision) is 400
         * invalid_request. Block the key (blocked: true) to deny it; blocking is always accepted.
         */
        fun rpmLimit(rpmLimit: Long?) = apply { body.rpmLimit(rpmLimit) }

        /**
         * Alias for [Builder.rpmLimit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun rpmLimit(rpmLimit: Long) = rpmLimit(rpmLimit as Long?)

        /** Alias for calling [Builder.rpmLimit] with `rpmLimit.orElse(null)`. */
        fun rpmLimit(rpmLimit: Optional<Long>) = rpmLimit(rpmLimit.getOrNull())

        /**
         * Sets [Builder.rpmLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rpmLimit] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rpmLimit(rpmLimit: JsonField<Long>) = apply { body.rpmLimit(rpmLimit) }

        fun tokenUserId(tokenUserId: String?) = apply { body.tokenUserId(tokenUserId) }

        /** Alias for calling [Builder.tokenUserId] with `tokenUserId.orElse(null)`. */
        fun tokenUserId(tokenUserId: Optional<String>) = tokenUserId(tokenUserId.getOrNull())

        /**
         * Sets [Builder.tokenUserId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tokenUserId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tokenUserId(tokenUserId: JsonField<String>) = apply { body.tokenUserId(tokenUserId) }

        /**
         * Omitted or null defaults to the maximum (10000000) (on a blocked key, null is kept until
         * the key is unblocked); a value below the minimum (1) or above the maximum is rejected
         * with 400 limit_out_of_range; a malformed value (negative, wrong type or precision) is 400
         * invalid_request. Block the key (blocked: true) to deny it; blocking is always accepted.
         */
        fun tpmLimit(tpmLimit: Long?) = apply { body.tpmLimit(tpmLimit) }

        /**
         * Alias for [Builder.tpmLimit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun tpmLimit(tpmLimit: Long) = tpmLimit(tpmLimit as Long?)

        /** Alias for calling [Builder.tpmLimit] with `tpmLimit.orElse(null)`. */
        fun tpmLimit(tpmLimit: Optional<Long>) = tpmLimit(tpmLimit.getOrNull())

        /**
         * Sets [Builder.tpmLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tpmLimit] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tpmLimit(tpmLimit: JsonField<Long>) = apply { body.tpmLimit(tpmLimit) }

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
         * Returns an immutable instance of [TokenKeyCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .idempotencyKey()
         * .name()
         * .tokenGroupId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TokenKeyCreateParams =
            TokenKeyCreateParams(
                checkRequired("idempotencyKey", idempotencyKey),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): com.telnyx.sdk.core.http.Headers =
        com.telnyx.sdk.core.http.Headers.builder()
            .apply {
                put("Idempotency-Key", idempotencyKey)
                putAll(additionalHeaders)
            }
            .build()

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val tokenGroupId: JsonField<String>,
        private val allowedModels: JsonField<List<String>>,
        private val blocked: JsonField<Boolean>,
        private val budgetDuration: JsonField<BudgetDuration>,
        private val expiresAt: JsonField<OffsetDateTime>,
        private val maxBudget: JsonField<Double>,
        private val maxParallelRequests: JsonField<Long>,
        private val requiredEndUserId: JsonField<Boolean>,
        private val rpmLimit: JsonField<Long>,
        private val tokenUserId: JsonField<String>,
        private val tpmLimit: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("token_group_id")
            @ExcludeMissing
            tokenGroupId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("allowed_models")
            @ExcludeMissing
            allowedModels: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("blocked") @ExcludeMissing blocked: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("budget_duration")
            @ExcludeMissing
            budgetDuration: JsonField<BudgetDuration> = JsonMissing.of(),
            @JsonProperty("expires_at")
            @ExcludeMissing
            expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("max_budget")
            @ExcludeMissing
            maxBudget: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("max_parallel_requests")
            @ExcludeMissing
            maxParallelRequests: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("required_end_user_id")
            @ExcludeMissing
            requiredEndUserId: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("rpm_limit") @ExcludeMissing rpmLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("token_user_id")
            @ExcludeMissing
            tokenUserId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tpm_limit") @ExcludeMissing tpmLimit: JsonField<Long> = JsonMissing.of(),
        ) : this(
            name,
            tokenGroupId,
            allowedModels,
            blocked,
            budgetDuration,
            expiresAt,
            maxBudget,
            maxParallelRequests,
            requiredEndUserId,
            rpmLimit,
            tokenUserId,
            tpmLimit,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun tokenGroupId(): String = tokenGroupId.getRequired("token_group_id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun allowedModels(): Optional<List<String>> = allowedModels.getOptional("allowed_models")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun blocked(): Optional<Boolean> = blocked.getOptional("blocked")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun budgetDuration(): Optional<BudgetDuration> =
            budgetDuration.getOptional("budget_duration")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun expiresAt(): Optional<OffsetDateTime> = expiresAt.getOptional("expires_at")

        /**
         * USD, decimal precision at most 6 places; parse exactly to integer micro-USD, never binary
         * float accounting.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maxBudget(): Optional<Double> = maxBudget.getOptional("max_budget")

        /**
         * Optional maximum concurrent reserved/dispatched cache misses across replicas. Null means
         * no concurrency cap. Cache hits do not consume slots; unknown usage retains its budget
         * hold without a slot.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maxParallelRequests(): Optional<Long> =
            maxParallelRequests.getOptional("max_parallel_requests")

        /**
         * Require a nonempty caller-asserted end-user ID; not proof of identity.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun requiredEndUserId(): Optional<Boolean> =
            requiredEndUserId.getOptional("required_end_user_id")

        /**
         * Omitted or null defaults to the maximum (6000) (on a blocked key, null is kept until the
         * key is unblocked); a value below the minimum (1) or above the maximum is rejected with
         * 400 limit_out_of_range; a malformed value (negative, wrong type or precision) is 400
         * invalid_request. Block the key (blocked: true) to deny it; blocking is always accepted.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun rpmLimit(): Optional<Long> = rpmLimit.getOptional("rpm_limit")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tokenUserId(): Optional<String> = tokenUserId.getOptional("token_user_id")

        /**
         * Omitted or null defaults to the maximum (10000000) (on a blocked key, null is kept until
         * the key is unblocked); a value below the minimum (1) or above the maximum is rejected
         * with 400 limit_out_of_range; a malformed value (negative, wrong type or precision) is 400
         * invalid_request. Block the key (blocked: true) to deny it; blocking is always accepted.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tpmLimit(): Optional<Long> = tpmLimit.getOptional("tpm_limit")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [tokenGroupId].
         *
         * Unlike [tokenGroupId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("token_group_id")
        @ExcludeMissing
        fun _tokenGroupId(): JsonField<String> = tokenGroupId

        /**
         * Returns the raw JSON value of [allowedModels].
         *
         * Unlike [allowedModels], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("allowed_models")
        @ExcludeMissing
        fun _allowedModels(): JsonField<List<String>> = allowedModels

        /**
         * Returns the raw JSON value of [blocked].
         *
         * Unlike [blocked], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("blocked") @ExcludeMissing fun _blocked(): JsonField<Boolean> = blocked

        /**
         * Returns the raw JSON value of [budgetDuration].
         *
         * Unlike [budgetDuration], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("budget_duration")
        @ExcludeMissing
        fun _budgetDuration(): JsonField<BudgetDuration> = budgetDuration

        /**
         * Returns the raw JSON value of [expiresAt].
         *
         * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("expires_at")
        @ExcludeMissing
        fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

        /**
         * Returns the raw JSON value of [maxBudget].
         *
         * Unlike [maxBudget], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("max_budget") @ExcludeMissing fun _maxBudget(): JsonField<Double> = maxBudget

        /**
         * Returns the raw JSON value of [maxParallelRequests].
         *
         * Unlike [maxParallelRequests], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("max_parallel_requests")
        @ExcludeMissing
        fun _maxParallelRequests(): JsonField<Long> = maxParallelRequests

        /**
         * Returns the raw JSON value of [requiredEndUserId].
         *
         * Unlike [requiredEndUserId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("required_end_user_id")
        @ExcludeMissing
        fun _requiredEndUserId(): JsonField<Boolean> = requiredEndUserId

        /**
         * Returns the raw JSON value of [rpmLimit].
         *
         * Unlike [rpmLimit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rpm_limit") @ExcludeMissing fun _rpmLimit(): JsonField<Long> = rpmLimit

        /**
         * Returns the raw JSON value of [tokenUserId].
         *
         * Unlike [tokenUserId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("token_user_id")
        @ExcludeMissing
        fun _tokenUserId(): JsonField<String> = tokenUserId

        /**
         * Returns the raw JSON value of [tpmLimit].
         *
         * Unlike [tpmLimit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tpm_limit") @ExcludeMissing fun _tpmLimit(): JsonField<Long> = tpmLimit

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
             * .name()
             * .tokenGroupId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var tokenGroupId: JsonField<String>? = null
            private var allowedModels: JsonField<MutableList<String>>? = null
            private var blocked: JsonField<Boolean> = JsonMissing.of()
            private var budgetDuration: JsonField<BudgetDuration> = JsonMissing.of()
            private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var maxBudget: JsonField<Double> = JsonMissing.of()
            private var maxParallelRequests: JsonField<Long> = JsonMissing.of()
            private var requiredEndUserId: JsonField<Boolean> = JsonMissing.of()
            private var rpmLimit: JsonField<Long> = JsonMissing.of()
            private var tokenUserId: JsonField<String> = JsonMissing.of()
            private var tpmLimit: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                name = body.name
                tokenGroupId = body.tokenGroupId
                allowedModels = body.allowedModels.map { it.toMutableList() }
                blocked = body.blocked
                budgetDuration = body.budgetDuration
                expiresAt = body.expiresAt
                maxBudget = body.maxBudget
                maxParallelRequests = body.maxParallelRequests
                requiredEndUserId = body.requiredEndUserId
                rpmLimit = body.rpmLimit
                tokenUserId = body.tokenUserId
                tpmLimit = body.tpmLimit
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun tokenGroupId(tokenGroupId: String) = tokenGroupId(JsonField.of(tokenGroupId))

            /**
             * Sets [Builder.tokenGroupId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tokenGroupId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tokenGroupId(tokenGroupId: JsonField<String>) = apply {
                this.tokenGroupId = tokenGroupId
            }

            fun allowedModels(allowedModels: List<String>?) =
                allowedModels(JsonField.ofNullable(allowedModels))

            /** Alias for calling [Builder.allowedModels] with `allowedModels.orElse(null)`. */
            fun allowedModels(allowedModels: Optional<List<String>>) =
                allowedModels(allowedModels.getOrNull())

            /**
             * Sets [Builder.allowedModels] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowedModels] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun allowedModels(allowedModels: JsonField<List<String>>) = apply {
                this.allowedModels = allowedModels.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [allowedModels].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAllowedModel(allowedModel: String) = apply {
                allowedModels =
                    (allowedModels ?: JsonField.of(mutableListOf())).also {
                        checkKnown("allowedModels", it).add(allowedModel)
                    }
            }

            fun blocked(blocked: Boolean) = blocked(JsonField.of(blocked))

            /**
             * Sets [Builder.blocked] to an arbitrary JSON value.
             *
             * You should usually call [Builder.blocked] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun blocked(blocked: JsonField<Boolean>) = apply { this.blocked = blocked }

            fun budgetDuration(budgetDuration: BudgetDuration?) =
                budgetDuration(JsonField.ofNullable(budgetDuration))

            /** Alias for calling [Builder.budgetDuration] with `budgetDuration.orElse(null)`. */
            fun budgetDuration(budgetDuration: Optional<BudgetDuration>) =
                budgetDuration(budgetDuration.getOrNull())

            /**
             * Sets [Builder.budgetDuration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.budgetDuration] with a well-typed [BudgetDuration]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun budgetDuration(budgetDuration: JsonField<BudgetDuration>) = apply {
                this.budgetDuration = budgetDuration
            }

            fun expiresAt(expiresAt: OffsetDateTime?) = expiresAt(JsonField.ofNullable(expiresAt))

            /** Alias for calling [Builder.expiresAt] with `expiresAt.orElse(null)`. */
            fun expiresAt(expiresAt: Optional<OffsetDateTime>) = expiresAt(expiresAt.getOrNull())

            /**
             * Sets [Builder.expiresAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply {
                this.expiresAt = expiresAt
            }

            /**
             * USD, decimal precision at most 6 places; parse exactly to integer micro-USD, never
             * binary float accounting.
             */
            fun maxBudget(maxBudget: Double?) = maxBudget(JsonField.ofNullable(maxBudget))

            /**
             * Alias for [Builder.maxBudget].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun maxBudget(maxBudget: Double) = maxBudget(maxBudget as Double?)

            /** Alias for calling [Builder.maxBudget] with `maxBudget.orElse(null)`. */
            fun maxBudget(maxBudget: Optional<Double>) = maxBudget(maxBudget.getOrNull())

            /**
             * Sets [Builder.maxBudget] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxBudget] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxBudget(maxBudget: JsonField<Double>) = apply { this.maxBudget = maxBudget }

            /**
             * Optional maximum concurrent reserved/dispatched cache misses across replicas. Null
             * means no concurrency cap. Cache hits do not consume slots; unknown usage retains its
             * budget hold without a slot.
             */
            fun maxParallelRequests(maxParallelRequests: Long?) =
                maxParallelRequests(JsonField.ofNullable(maxParallelRequests))

            /**
             * Alias for [Builder.maxParallelRequests].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun maxParallelRequests(maxParallelRequests: Long) =
                maxParallelRequests(maxParallelRequests as Long?)

            /**
             * Alias for calling [Builder.maxParallelRequests] with
             * `maxParallelRequests.orElse(null)`.
             */
            fun maxParallelRequests(maxParallelRequests: Optional<Long>) =
                maxParallelRequests(maxParallelRequests.getOrNull())

            /**
             * Sets [Builder.maxParallelRequests] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxParallelRequests] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxParallelRequests(maxParallelRequests: JsonField<Long>) = apply {
                this.maxParallelRequests = maxParallelRequests
            }

            /** Require a nonempty caller-asserted end-user ID; not proof of identity. */
            fun requiredEndUserId(requiredEndUserId: Boolean) =
                requiredEndUserId(JsonField.of(requiredEndUserId))

            /**
             * Sets [Builder.requiredEndUserId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requiredEndUserId] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun requiredEndUserId(requiredEndUserId: JsonField<Boolean>) = apply {
                this.requiredEndUserId = requiredEndUserId
            }

            /**
             * Omitted or null defaults to the maximum (6000) (on a blocked key, null is kept until
             * the key is unblocked); a value below the minimum (1) or above the maximum is rejected
             * with 400 limit_out_of_range; a malformed value (negative, wrong type or precision) is
             * 400 invalid_request. Block the key (blocked: true) to deny it; blocking is always
             * accepted.
             */
            fun rpmLimit(rpmLimit: Long?) = rpmLimit(JsonField.ofNullable(rpmLimit))

            /**
             * Alias for [Builder.rpmLimit].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun rpmLimit(rpmLimit: Long) = rpmLimit(rpmLimit as Long?)

            /** Alias for calling [Builder.rpmLimit] with `rpmLimit.orElse(null)`. */
            fun rpmLimit(rpmLimit: Optional<Long>) = rpmLimit(rpmLimit.getOrNull())

            /**
             * Sets [Builder.rpmLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rpmLimit] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rpmLimit(rpmLimit: JsonField<Long>) = apply { this.rpmLimit = rpmLimit }

            fun tokenUserId(tokenUserId: String?) = tokenUserId(JsonField.ofNullable(tokenUserId))

            /** Alias for calling [Builder.tokenUserId] with `tokenUserId.orElse(null)`. */
            fun tokenUserId(tokenUserId: Optional<String>) = tokenUserId(tokenUserId.getOrNull())

            /**
             * Sets [Builder.tokenUserId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tokenUserId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tokenUserId(tokenUserId: JsonField<String>) = apply {
                this.tokenUserId = tokenUserId
            }

            /**
             * Omitted or null defaults to the maximum (10000000) (on a blocked key, null is kept
             * until the key is unblocked); a value below the minimum (1) or above the maximum is
             * rejected with 400 limit_out_of_range; a malformed value (negative, wrong type or
             * precision) is 400 invalid_request. Block the key (blocked: true) to deny it; blocking
             * is always accepted.
             */
            fun tpmLimit(tpmLimit: Long?) = tpmLimit(JsonField.ofNullable(tpmLimit))

            /**
             * Alias for [Builder.tpmLimit].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun tpmLimit(tpmLimit: Long) = tpmLimit(tpmLimit as Long?)

            /** Alias for calling [Builder.tpmLimit] with `tpmLimit.orElse(null)`. */
            fun tpmLimit(tpmLimit: Optional<Long>) = tpmLimit(tpmLimit.getOrNull())

            /**
             * Sets [Builder.tpmLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tpmLimit] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tpmLimit(tpmLimit: JsonField<Long>) = apply { this.tpmLimit = tpmLimit }

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
             * .name()
             * .tokenGroupId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("name", name),
                    checkRequired("tokenGroupId", tokenGroupId),
                    (allowedModels ?: JsonMissing.of()).map { it.toImmutable() },
                    blocked,
                    budgetDuration,
                    expiresAt,
                    maxBudget,
                    maxParallelRequests,
                    requiredEndUserId,
                    rpmLimit,
                    tokenUserId,
                    tpmLimit,
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

            name()
            tokenGroupId()
            allowedModels()
            blocked()
            budgetDuration().ifPresent { it.validate() }
            expiresAt()
            maxBudget()
            maxParallelRequests()
            requiredEndUserId()
            rpmLimit()
            tokenUserId()
            tpmLimit()
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
            (if (name.asKnown().isPresent) 1 else 0) +
                (if (tokenGroupId.asKnown().isPresent) 1 else 0) +
                (allowedModels.asKnown().getOrNull()?.size ?: 0) +
                (if (blocked.asKnown().isPresent) 1 else 0) +
                (budgetDuration.asKnown().getOrNull()?.validity() ?: 0) +
                (if (expiresAt.asKnown().isPresent) 1 else 0) +
                (if (maxBudget.asKnown().isPresent) 1 else 0) +
                (if (maxParallelRequests.asKnown().isPresent) 1 else 0) +
                (if (requiredEndUserId.asKnown().isPresent) 1 else 0) +
                (if (rpmLimit.asKnown().isPresent) 1 else 0) +
                (if (tokenUserId.asKnown().isPresent) 1 else 0) +
                (if (tpmLimit.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                name == other.name &&
                tokenGroupId == other.tokenGroupId &&
                allowedModels == other.allowedModels &&
                blocked == other.blocked &&
                budgetDuration == other.budgetDuration &&
                expiresAt == other.expiresAt &&
                maxBudget == other.maxBudget &&
                maxParallelRequests == other.maxParallelRequests &&
                requiredEndUserId == other.requiredEndUserId &&
                rpmLimit == other.rpmLimit &&
                tokenUserId == other.tokenUserId &&
                tpmLimit == other.tpmLimit &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                name,
                tokenGroupId,
                allowedModels,
                blocked,
                budgetDuration,
                expiresAt,
                maxBudget,
                maxParallelRequests,
                requiredEndUserId,
                rpmLimit,
                tokenUserId,
                tpmLimit,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{name=$name, tokenGroupId=$tokenGroupId, allowedModels=$allowedModels, blocked=$blocked, budgetDuration=$budgetDuration, expiresAt=$expiresAt, maxBudget=$maxBudget, maxParallelRequests=$maxParallelRequests, requiredEndUserId=$requiredEndUserId, rpmLimit=$rpmLimit, tokenUserId=$tokenUserId, tpmLimit=$tpmLimit, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TokenKeyCreateParams &&
            idempotencyKey == other.idempotencyKey &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(idempotencyKey, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "TokenKeyCreateParams{idempotencyKey=$idempotencyKey, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
