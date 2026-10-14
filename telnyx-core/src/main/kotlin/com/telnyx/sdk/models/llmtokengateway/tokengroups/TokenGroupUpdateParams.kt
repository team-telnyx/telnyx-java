// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.llmtokengateway.tokengroups

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Update gateway token group within the authenticated Telnyx account. Foreign and unknown resource
 * IDs return the same 404 response. Omitted fields are preserved. Null clears the optional
 * concurrency, fallback and retry settings. A stale If-Match returns 412; read the resource again
 * before updating.
 */
class TokenGroupUpdateParams
private constructor(
    private val id: String?,
    private val idempotencyKey: String,
    private val ifMatch: String,
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    fun idempotencyKey(): String = idempotencyKey

    fun ifMatch(): String = ifMatch

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
    fun cacheTtl(): Optional<Long> = body.cacheTtl()

    /**
     * Per-group model fallbacks: primary alias -> ordered list of 1..3 other aliases. Every key and
     * listed alias must be in allowed_models (a PATCH removing a referenced alias is 400); a chain
     * never lists its own key; wildcards are rejected. Chains are one level deep (a step's own
     * chain is not expanded). Fallback is attempted only for managed routes, only before the first
     * provider event is forwarded, and only to steps the key may use; each attempt is reserved and
     * recorded. {} and null both disable fallbacks.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fallbacks(): Optional<Fallbacks> = body.fallbacks()

    /**
     * Per-group guardrail policy. Missing actions default to ignore. profiles may be listed with
     * both dlp actions ignore (staged, inactive) but a non-ignore dlp action requires at least one
     * profile. streaming defaults to buffered when any response action is block and passthrough
     * otherwise; passthrough with a response block is 400. Findings are codes and counts only;
     * content is never stored. The stored form is echoed back canonicalised (all actions explicit,
     * profiles sorted); {} is stored as an all-ignore policy, null disables.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun guardrails(): Optional<Guardrails> = body.guardrails()

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
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun providerKeyIds(): Optional<List<String>> = body.providerKeyIds()

    /**
     * Per-group same-route retries. max_attempts counts the first try of each step (the primary and
     * each fallback) and is the ceiling for the x-ltg-max-attempts request header. A step is
     * retried only when its attempt definitely did no provider work (connection failure before
     * dispatch, or 429/529) before the first provider event; an uncertain failure (timeout,
     * 408/500/502/503/504) moves to the next fallback step instead. max_attempts x (1 + the longest
     * fallback chain) must not exceed 8, else 400. The n-th retry waits retry_delay_ms (constant),
     * retry_delay_ms*n (linear) or retry_delay_ms*2^(n-1) (exponential), at most 5 s and never past
     * the request deadline, then jittered uniformly down to half that value so concurrent retries
     * spread out; a provider Retry-After of at most 5 s is honoured and a longer one moves to the
     * next step. request_timeout_ms applies to streaming requests only: it bounds each attempt's
     * time to its first provider event and never applies after it. Non-stream requests keep the
     * per-attempt hop and idle bounds (their headers arrive only with the finished completion).
     * retry_delay_ms and backoff are floors for the request knobs. Each planned attempt is reserved
     * (at most 8 per request); unused reservation is released at settlement. Managed routes only.
     * The stored form is echoed back with defaults filled in; null disables retries.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun retries(): Optional<Retries> = body.retries()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rpmLimit(): Optional<Long> = body.rpmLimit()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tpmLimit(): Optional<Long> = body.tpmLimit()

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
     * Returns the raw JSON value of [cacheTtl].
     *
     * Unlike [cacheTtl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _cacheTtl(): JsonField<Long> = body._cacheTtl()

    /**
     * Returns the raw JSON value of [fallbacks].
     *
     * Unlike [fallbacks], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _fallbacks(): JsonField<Fallbacks> = body._fallbacks()

    /**
     * Returns the raw JSON value of [guardrails].
     *
     * Unlike [guardrails], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _guardrails(): JsonField<Guardrails> = body._guardrails()

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
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [providerKeyIds].
     *
     * Unlike [providerKeyIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _providerKeyIds(): JsonField<List<String>> = body._providerKeyIds()

    /**
     * Returns the raw JSON value of [retries].
     *
     * Unlike [retries], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _retries(): JsonField<Retries> = body._retries()

    /**
     * Returns the raw JSON value of [rpmLimit].
     *
     * Unlike [rpmLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _rpmLimit(): JsonField<Long> = body._rpmLimit()

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
         * Returns a mutable builder for constructing an instance of [TokenGroupUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .idempotencyKey()
         * .ifMatch()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TokenGroupUpdateParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var idempotencyKey: String? = null
        private var ifMatch: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(tokenGroupUpdateParams: TokenGroupUpdateParams) = apply {
            id = tokenGroupUpdateParams.id
            idempotencyKey = tokenGroupUpdateParams.idempotencyKey
            ifMatch = tokenGroupUpdateParams.ifMatch
            body = tokenGroupUpdateParams.body.toBuilder()
            additionalHeaders = tokenGroupUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = tokenGroupUpdateParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        fun idempotencyKey(idempotencyKey: String) = apply { this.idempotencyKey = idempotencyKey }

        fun ifMatch(ifMatch: String) = apply { this.ifMatch = ifMatch }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [allowedModels]
         * - [blocked]
         * - [budgetDuration]
         * - [cacheTtl]
         * - [fallbacks]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun allowedModels(allowedModels: List<String>) = apply { body.allowedModels(allowedModels) }

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

        fun cacheTtl(cacheTtl: Long?) = apply { body.cacheTtl(cacheTtl) }

        /**
         * Alias for [Builder.cacheTtl].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun cacheTtl(cacheTtl: Long) = cacheTtl(cacheTtl as Long?)

        /** Alias for calling [Builder.cacheTtl] with `cacheTtl.orElse(null)`. */
        fun cacheTtl(cacheTtl: Optional<Long>) = cacheTtl(cacheTtl.getOrNull())

        /**
         * Sets [Builder.cacheTtl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cacheTtl] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cacheTtl(cacheTtl: JsonField<Long>) = apply { body.cacheTtl(cacheTtl) }

        /**
         * Per-group model fallbacks: primary alias -> ordered list of 1..3 other aliases. Every key
         * and listed alias must be in allowed_models (a PATCH removing a referenced alias is 400);
         * a chain never lists its own key; wildcards are rejected. Chains are one level deep (a
         * step's own chain is not expanded). Fallback is attempted only for managed routes, only
         * before the first provider event is forwarded, and only to steps the key may use; each
         * attempt is reserved and recorded. {} and null both disable fallbacks.
         */
        fun fallbacks(fallbacks: Fallbacks?) = apply { body.fallbacks(fallbacks) }

        /** Alias for calling [Builder.fallbacks] with `fallbacks.orElse(null)`. */
        fun fallbacks(fallbacks: Optional<Fallbacks>) = fallbacks(fallbacks.getOrNull())

        /**
         * Sets [Builder.fallbacks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fallbacks] with a well-typed [Fallbacks] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fallbacks(fallbacks: JsonField<Fallbacks>) = apply { body.fallbacks(fallbacks) }

        /**
         * Per-group guardrail policy. Missing actions default to ignore. profiles may be listed
         * with both dlp actions ignore (staged, inactive) but a non-ignore dlp action requires at
         * least one profile. streaming defaults to buffered when any response action is block and
         * passthrough otherwise; passthrough with a response block is 400. Findings are codes and
         * counts only; content is never stored. The stored form is echoed back canonicalised (all
         * actions explicit, profiles sorted); {} is stored as an all-ignore policy, null disables.
         */
        fun guardrails(guardrails: Guardrails?) = apply { body.guardrails(guardrails) }

        /** Alias for calling [Builder.guardrails] with `guardrails.orElse(null)`. */
        fun guardrails(guardrails: Optional<Guardrails>) = guardrails(guardrails.getOrNull())

        /**
         * Sets [Builder.guardrails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.guardrails] with a well-typed [Guardrails] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun guardrails(guardrails: JsonField<Guardrails>) = apply { body.guardrails(guardrails) }

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

        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        fun providerKeyIds(providerKeyIds: List<String>) = apply {
            body.providerKeyIds(providerKeyIds)
        }

        /**
         * Sets [Builder.providerKeyIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.providerKeyIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun providerKeyIds(providerKeyIds: JsonField<List<String>>) = apply {
            body.providerKeyIds(providerKeyIds)
        }

        /**
         * Adds a single [String] to [providerKeyIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProviderKeyId(providerKeyId: String) = apply { body.addProviderKeyId(providerKeyId) }

        /**
         * Per-group same-route retries. max_attempts counts the first try of each step (the primary
         * and each fallback) and is the ceiling for the x-ltg-max-attempts request header. A step
         * is retried only when its attempt definitely did no provider work (connection failure
         * before dispatch, or 429/529) before the first provider event; an uncertain failure
         * (timeout, 408/500/502/503/504) moves to the next fallback step instead. max_attempts x
         * (1 + the longest fallback chain) must not exceed 8, else 400. The n-th retry waits
         * retry_delay_ms (constant), retry_delay_ms*n (linear) or retry_delay_ms*2^(n-1)
         * (exponential), at most 5 s and never past the request deadline, then jittered uniformly
         * down to half that value so concurrent retries spread out; a provider Retry-After of at
         * most 5 s is honoured and a longer one moves to the next step. request_timeout_ms applies
         * to streaming requests only: it bounds each attempt's time to its first provider event and
         * never applies after it. Non-stream requests keep the per-attempt hop and idle bounds
         * (their headers arrive only with the finished completion). retry_delay_ms and backoff are
         * floors for the request knobs. Each planned attempt is reserved (at most 8 per request);
         * unused reservation is released at settlement. Managed routes only. The stored form is
         * echoed back with defaults filled in; null disables retries.
         */
        fun retries(retries: Retries?) = apply { body.retries(retries) }

        /** Alias for calling [Builder.retries] with `retries.orElse(null)`. */
        fun retries(retries: Optional<Retries>) = retries(retries.getOrNull())

        /**
         * Sets [Builder.retries] to an arbitrary JSON value.
         *
         * You should usually call [Builder.retries] with a well-typed [Retries] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun retries(retries: JsonField<Retries>) = apply { body.retries(retries) }

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
         * Returns an immutable instance of [TokenGroupUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .idempotencyKey()
         * .ifMatch()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TokenGroupUpdateParams =
            TokenGroupUpdateParams(
                id,
                checkRequired("idempotencyKey", idempotencyKey),
                checkRequired("ifMatch", ifMatch),
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

    override fun _headers(): com.telnyx.sdk.core.http.Headers =
        com.telnyx.sdk.core.http.Headers.builder()
            .apply {
                put("Idempotency-Key", idempotencyKey)
                put("If-Match", ifMatch)
                putAll(additionalHeaders)
            }
            .build()

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val allowedModels: JsonField<List<String>>,
        private val blocked: JsonField<Boolean>,
        private val budgetDuration: JsonField<BudgetDuration>,
        private val cacheTtl: JsonField<Long>,
        private val fallbacks: JsonField<Fallbacks>,
        private val guardrails: JsonField<Guardrails>,
        private val maxBudget: JsonField<Double>,
        private val maxParallelRequests: JsonField<Long>,
        private val name: JsonField<String>,
        private val providerKeyIds: JsonField<List<String>>,
        private val retries: JsonField<Retries>,
        private val rpmLimit: JsonField<Long>,
        private val tpmLimit: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("allowed_models")
            @ExcludeMissing
            allowedModels: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("blocked") @ExcludeMissing blocked: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("budget_duration")
            @ExcludeMissing
            budgetDuration: JsonField<BudgetDuration> = JsonMissing.of(),
            @JsonProperty("cache_ttl") @ExcludeMissing cacheTtl: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("fallbacks")
            @ExcludeMissing
            fallbacks: JsonField<Fallbacks> = JsonMissing.of(),
            @JsonProperty("guardrails")
            @ExcludeMissing
            guardrails: JsonField<Guardrails> = JsonMissing.of(),
            @JsonProperty("max_budget")
            @ExcludeMissing
            maxBudget: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("max_parallel_requests")
            @ExcludeMissing
            maxParallelRequests: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("provider_key_ids")
            @ExcludeMissing
            providerKeyIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("retries") @ExcludeMissing retries: JsonField<Retries> = JsonMissing.of(),
            @JsonProperty("rpm_limit") @ExcludeMissing rpmLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("tpm_limit") @ExcludeMissing tpmLimit: JsonField<Long> = JsonMissing.of(),
        ) : this(
            allowedModels,
            blocked,
            budgetDuration,
            cacheTtl,
            fallbacks,
            guardrails,
            maxBudget,
            maxParallelRequests,
            name,
            providerKeyIds,
            retries,
            rpmLimit,
            tpmLimit,
            mutableMapOf(),
        )

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
        fun cacheTtl(): Optional<Long> = cacheTtl.getOptional("cache_ttl")

        /**
         * Per-group model fallbacks: primary alias -> ordered list of 1..3 other aliases. Every key
         * and listed alias must be in allowed_models (a PATCH removing a referenced alias is 400);
         * a chain never lists its own key; wildcards are rejected. Chains are one level deep (a
         * step's own chain is not expanded). Fallback is attempted only for managed routes, only
         * before the first provider event is forwarded, and only to steps the key may use; each
         * attempt is reserved and recorded. {} and null both disable fallbacks.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun fallbacks(): Optional<Fallbacks> = fallbacks.getOptional("fallbacks")

        /**
         * Per-group guardrail policy. Missing actions default to ignore. profiles may be listed
         * with both dlp actions ignore (staged, inactive) but a non-ignore dlp action requires at
         * least one profile. streaming defaults to buffered when any response action is block and
         * passthrough otherwise; passthrough with a response block is 400. Findings are codes and
         * counts only; content is never stored. The stored form is echoed back canonicalised (all
         * actions explicit, profiles sorted); {} is stored as an all-ignore policy, null disables.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun guardrails(): Optional<Guardrails> = guardrails.getOptional("guardrails")

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
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun providerKeyIds(): Optional<List<String>> =
            providerKeyIds.getOptional("provider_key_ids")

        /**
         * Per-group same-route retries. max_attempts counts the first try of each step (the primary
         * and each fallback) and is the ceiling for the x-ltg-max-attempts request header. A step
         * is retried only when its attempt definitely did no provider work (connection failure
         * before dispatch, or 429/529) before the first provider event; an uncertain failure
         * (timeout, 408/500/502/503/504) moves to the next fallback step instead. max_attempts x
         * (1 + the longest fallback chain) must not exceed 8, else 400. The n-th retry waits
         * retry_delay_ms (constant), retry_delay_ms*n (linear) or retry_delay_ms*2^(n-1)
         * (exponential), at most 5 s and never past the request deadline, then jittered uniformly
         * down to half that value so concurrent retries spread out; a provider Retry-After of at
         * most 5 s is honoured and a longer one moves to the next step. request_timeout_ms applies
         * to streaming requests only: it bounds each attempt's time to its first provider event and
         * never applies after it. Non-stream requests keep the per-attempt hop and idle bounds
         * (their headers arrive only with the finished completion). retry_delay_ms and backoff are
         * floors for the request knobs. Each planned attempt is reserved (at most 8 per request);
         * unused reservation is released at settlement. Managed routes only. The stored form is
         * echoed back with defaults filled in; null disables retries.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun retries(): Optional<Retries> = retries.getOptional("retries")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun rpmLimit(): Optional<Long> = rpmLimit.getOptional("rpm_limit")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tpmLimit(): Optional<Long> = tpmLimit.getOptional("tpm_limit")

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
         * Returns the raw JSON value of [cacheTtl].
         *
         * Unlike [cacheTtl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cache_ttl") @ExcludeMissing fun _cacheTtl(): JsonField<Long> = cacheTtl

        /**
         * Returns the raw JSON value of [fallbacks].
         *
         * Unlike [fallbacks], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fallbacks")
        @ExcludeMissing
        fun _fallbacks(): JsonField<Fallbacks> = fallbacks

        /**
         * Returns the raw JSON value of [guardrails].
         *
         * Unlike [guardrails], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("guardrails")
        @ExcludeMissing
        fun _guardrails(): JsonField<Guardrails> = guardrails

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
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [providerKeyIds].
         *
         * Unlike [providerKeyIds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("provider_key_ids")
        @ExcludeMissing
        fun _providerKeyIds(): JsonField<List<String>> = providerKeyIds

        /**
         * Returns the raw JSON value of [retries].
         *
         * Unlike [retries], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("retries") @ExcludeMissing fun _retries(): JsonField<Retries> = retries

        /**
         * Returns the raw JSON value of [rpmLimit].
         *
         * Unlike [rpmLimit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rpm_limit") @ExcludeMissing fun _rpmLimit(): JsonField<Long> = rpmLimit

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var allowedModels: JsonField<MutableList<String>>? = null
            private var blocked: JsonField<Boolean> = JsonMissing.of()
            private var budgetDuration: JsonField<BudgetDuration> = JsonMissing.of()
            private var cacheTtl: JsonField<Long> = JsonMissing.of()
            private var fallbacks: JsonField<Fallbacks> = JsonMissing.of()
            private var guardrails: JsonField<Guardrails> = JsonMissing.of()
            private var maxBudget: JsonField<Double> = JsonMissing.of()
            private var maxParallelRequests: JsonField<Long> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var providerKeyIds: JsonField<MutableList<String>>? = null
            private var retries: JsonField<Retries> = JsonMissing.of()
            private var rpmLimit: JsonField<Long> = JsonMissing.of()
            private var tpmLimit: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                allowedModels = body.allowedModels.map { it.toMutableList() }
                blocked = body.blocked
                budgetDuration = body.budgetDuration
                cacheTtl = body.cacheTtl
                fallbacks = body.fallbacks
                guardrails = body.guardrails
                maxBudget = body.maxBudget
                maxParallelRequests = body.maxParallelRequests
                name = body.name
                providerKeyIds = body.providerKeyIds.map { it.toMutableList() }
                retries = body.retries
                rpmLimit = body.rpmLimit
                tpmLimit = body.tpmLimit
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun allowedModels(allowedModels: List<String>) =
                allowedModels(JsonField.of(allowedModels))

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

            fun cacheTtl(cacheTtl: Long?) = cacheTtl(JsonField.ofNullable(cacheTtl))

            /**
             * Alias for [Builder.cacheTtl].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun cacheTtl(cacheTtl: Long) = cacheTtl(cacheTtl as Long?)

            /** Alias for calling [Builder.cacheTtl] with `cacheTtl.orElse(null)`. */
            fun cacheTtl(cacheTtl: Optional<Long>) = cacheTtl(cacheTtl.getOrNull())

            /**
             * Sets [Builder.cacheTtl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cacheTtl] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cacheTtl(cacheTtl: JsonField<Long>) = apply { this.cacheTtl = cacheTtl }

            /**
             * Per-group model fallbacks: primary alias -> ordered list of 1..3 other aliases. Every
             * key and listed alias must be in allowed_models (a PATCH removing a referenced alias
             * is 400); a chain never lists its own key; wildcards are rejected. Chains are one
             * level deep (a step's own chain is not expanded). Fallback is attempted only for
             * managed routes, only before the first provider event is forwarded, and only to steps
             * the key may use; each attempt is reserved and recorded. {} and null both disable
             * fallbacks.
             */
            fun fallbacks(fallbacks: Fallbacks?) = fallbacks(JsonField.ofNullable(fallbacks))

            /** Alias for calling [Builder.fallbacks] with `fallbacks.orElse(null)`. */
            fun fallbacks(fallbacks: Optional<Fallbacks>) = fallbacks(fallbacks.getOrNull())

            /**
             * Sets [Builder.fallbacks] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fallbacks] with a well-typed [Fallbacks] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fallbacks(fallbacks: JsonField<Fallbacks>) = apply { this.fallbacks = fallbacks }

            /**
             * Per-group guardrail policy. Missing actions default to ignore. profiles may be listed
             * with both dlp actions ignore (staged, inactive) but a non-ignore dlp action requires
             * at least one profile. streaming defaults to buffered when any response action is
             * block and passthrough otherwise; passthrough with a response block is 400. Findings
             * are codes and counts only; content is never stored. The stored form is echoed back
             * canonicalised (all actions explicit, profiles sorted); {} is stored as an all-ignore
             * policy, null disables.
             */
            fun guardrails(guardrails: Guardrails?) = guardrails(JsonField.ofNullable(guardrails))

            /** Alias for calling [Builder.guardrails] with `guardrails.orElse(null)`. */
            fun guardrails(guardrails: Optional<Guardrails>) = guardrails(guardrails.getOrNull())

            /**
             * Sets [Builder.guardrails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.guardrails] with a well-typed [Guardrails] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun guardrails(guardrails: JsonField<Guardrails>) = apply {
                this.guardrails = guardrails
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

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun providerKeyIds(providerKeyIds: List<String>) =
                providerKeyIds(JsonField.of(providerKeyIds))

            /**
             * Sets [Builder.providerKeyIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.providerKeyIds] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun providerKeyIds(providerKeyIds: JsonField<List<String>>) = apply {
                this.providerKeyIds = providerKeyIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [providerKeyIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addProviderKeyId(providerKeyId: String) = apply {
                providerKeyIds =
                    (providerKeyIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("providerKeyIds", it).add(providerKeyId)
                    }
            }

            /**
             * Per-group same-route retries. max_attempts counts the first try of each step (the
             * primary and each fallback) and is the ceiling for the x-ltg-max-attempts request
             * header. A step is retried only when its attempt definitely did no provider work
             * (connection failure before dispatch, or 429/529) before the first provider event; an
             * uncertain failure (timeout, 408/500/502/503/504) moves to the next fallback step
             * instead. max_attempts x (1 + the longest fallback chain) must not exceed 8, else 400.
             * The n-th retry waits retry_delay_ms (constant), retry_delay_ms*n (linear) or
             * retry_delay_ms*2^(n-1) (exponential), at most 5 s and never past the request
             * deadline, then jittered uniformly down to half that value so concurrent retries
             * spread out; a provider Retry-After of at most 5 s is honoured and a longer one moves
             * to the next step. request_timeout_ms applies to streaming requests only: it bounds
             * each attempt's time to its first provider event and never applies after it.
             * Non-stream requests keep the per-attempt hop and idle bounds (their headers arrive
             * only with the finished completion). retry_delay_ms and backoff are floors for the
             * request knobs. Each planned attempt is reserved (at most 8 per request); unused
             * reservation is released at settlement. Managed routes only. The stored form is echoed
             * back with defaults filled in; null disables retries.
             */
            fun retries(retries: Retries?) = retries(JsonField.ofNullable(retries))

            /** Alias for calling [Builder.retries] with `retries.orElse(null)`. */
            fun retries(retries: Optional<Retries>) = retries(retries.getOrNull())

            /**
             * Sets [Builder.retries] to an arbitrary JSON value.
             *
             * You should usually call [Builder.retries] with a well-typed [Retries] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun retries(retries: JsonField<Retries>) = apply { this.retries = retries }

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
             */
            fun build(): Body =
                Body(
                    (allowedModels ?: JsonMissing.of()).map { it.toImmutable() },
                    blocked,
                    budgetDuration,
                    cacheTtl,
                    fallbacks,
                    guardrails,
                    maxBudget,
                    maxParallelRequests,
                    name,
                    (providerKeyIds ?: JsonMissing.of()).map { it.toImmutable() },
                    retries,
                    rpmLimit,
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

            allowedModels()
            blocked()
            budgetDuration().ifPresent { it.validate() }
            cacheTtl()
            fallbacks().ifPresent { it.validate() }
            guardrails().ifPresent { it.validate() }
            maxBudget()
            maxParallelRequests()
            name()
            providerKeyIds()
            retries().ifPresent { it.validate() }
            rpmLimit()
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
            (allowedModels.asKnown().getOrNull()?.size ?: 0) +
                (if (blocked.asKnown().isPresent) 1 else 0) +
                (budgetDuration.asKnown().getOrNull()?.validity() ?: 0) +
                (if (cacheTtl.asKnown().isPresent) 1 else 0) +
                (fallbacks.asKnown().getOrNull()?.validity() ?: 0) +
                (guardrails.asKnown().getOrNull()?.validity() ?: 0) +
                (if (maxBudget.asKnown().isPresent) 1 else 0) +
                (if (maxParallelRequests.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (providerKeyIds.asKnown().getOrNull()?.size ?: 0) +
                (retries.asKnown().getOrNull()?.validity() ?: 0) +
                (if (rpmLimit.asKnown().isPresent) 1 else 0) +
                (if (tpmLimit.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                allowedModels == other.allowedModels &&
                blocked == other.blocked &&
                budgetDuration == other.budgetDuration &&
                cacheTtl == other.cacheTtl &&
                fallbacks == other.fallbacks &&
                guardrails == other.guardrails &&
                maxBudget == other.maxBudget &&
                maxParallelRequests == other.maxParallelRequests &&
                name == other.name &&
                providerKeyIds == other.providerKeyIds &&
                retries == other.retries &&
                rpmLimit == other.rpmLimit &&
                tpmLimit == other.tpmLimit &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                allowedModels,
                blocked,
                budgetDuration,
                cacheTtl,
                fallbacks,
                guardrails,
                maxBudget,
                maxParallelRequests,
                name,
                providerKeyIds,
                retries,
                rpmLimit,
                tpmLimit,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{allowedModels=$allowedModels, blocked=$blocked, budgetDuration=$budgetDuration, cacheTtl=$cacheTtl, fallbacks=$fallbacks, guardrails=$guardrails, maxBudget=$maxBudget, maxParallelRequests=$maxParallelRequests, name=$name, providerKeyIds=$providerKeyIds, retries=$retries, rpmLimit=$rpmLimit, tpmLimit=$tpmLimit, additionalProperties=$additionalProperties}"
    }

    /**
     * Per-group model fallbacks: primary alias -> ordered list of 1..3 other aliases. Every key and
     * listed alias must be in allowed_models (a PATCH removing a referenced alias is 400); a chain
     * never lists its own key; wildcards are rejected. Chains are one level deep (a step's own
     * chain is not expanded). Fallback is attempted only for managed routes, only before the first
     * provider event is forwarded, and only to steps the key may use; each attempt is reserved and
     * recorded. {} and null both disable fallbacks.
     */
    class Fallbacks
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

            /** Returns a mutable builder for constructing an instance of [Fallbacks]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Fallbacks]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(fallbacks: Fallbacks) = apply {
                additionalProperties = fallbacks.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Fallbacks].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Fallbacks = Fallbacks(additionalProperties.toImmutable())
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
        fun validate(): Fallbacks = apply {
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

            return other is Fallbacks && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Fallbacks{additionalProperties=$additionalProperties}"
    }

    /**
     * Per-group guardrail policy. Missing actions default to ignore. profiles may be listed with
     * both dlp actions ignore (staged, inactive) but a non-ignore dlp action requires at least one
     * profile. streaming defaults to buffered when any response action is block and passthrough
     * otherwise; passthrough with a response block is 400. Findings are codes and counts only;
     * content is never stored. The stored form is echoed back canonicalised (all actions explicit,
     * profiles sorted); {} is stored as an all-ignore policy, null disables.
     */
    class Guardrails
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val dlp: JsonField<Dlp>,
        private val secrets: JsonField<Secrets>,
        private val streaming: JsonField<Streaming>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("dlp") @ExcludeMissing dlp: JsonField<Dlp> = JsonMissing.of(),
            @JsonProperty("secrets") @ExcludeMissing secrets: JsonField<Secrets> = JsonMissing.of(),
            @JsonProperty("streaming")
            @ExcludeMissing
            streaming: JsonField<Streaming> = JsonMissing.of(),
        ) : this(dlp, secrets, streaming, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dlp(): Optional<Dlp> = dlp.getOptional("dlp")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun secrets(): Optional<Secrets> = secrets.getOptional("secrets")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun streaming(): Optional<Streaming> = streaming.getOptional("streaming")

        /**
         * Returns the raw JSON value of [dlp].
         *
         * Unlike [dlp], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dlp") @ExcludeMissing fun _dlp(): JsonField<Dlp> = dlp

        /**
         * Returns the raw JSON value of [secrets].
         *
         * Unlike [secrets], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("secrets") @ExcludeMissing fun _secrets(): JsonField<Secrets> = secrets

        /**
         * Returns the raw JSON value of [streaming].
         *
         * Unlike [streaming], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("streaming")
        @ExcludeMissing
        fun _streaming(): JsonField<Streaming> = streaming

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

            /** Returns a mutable builder for constructing an instance of [Guardrails]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Guardrails]. */
        class Builder internal constructor() {

            private var dlp: JsonField<Dlp> = JsonMissing.of()
            private var secrets: JsonField<Secrets> = JsonMissing.of()
            private var streaming: JsonField<Streaming> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(guardrails: Guardrails) = apply {
                dlp = guardrails.dlp
                secrets = guardrails.secrets
                streaming = guardrails.streaming
                additionalProperties = guardrails.additionalProperties.toMutableMap()
            }

            fun dlp(dlp: Dlp) = dlp(JsonField.of(dlp))

            /**
             * Sets [Builder.dlp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dlp] with a well-typed [Dlp] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun dlp(dlp: JsonField<Dlp>) = apply { this.dlp = dlp }

            fun secrets(secrets: Secrets) = secrets(JsonField.of(secrets))

            /**
             * Sets [Builder.secrets] to an arbitrary JSON value.
             *
             * You should usually call [Builder.secrets] with a well-typed [Secrets] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun secrets(secrets: JsonField<Secrets>) = apply { this.secrets = secrets }

            fun streaming(streaming: Streaming) = streaming(JsonField.of(streaming))

            /**
             * Sets [Builder.streaming] to an arbitrary JSON value.
             *
             * You should usually call [Builder.streaming] with a well-typed [Streaming] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun streaming(streaming: JsonField<Streaming>) = apply { this.streaming = streaming }

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
             * Returns an immutable instance of [Guardrails].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Guardrails =
                Guardrails(dlp, secrets, streaming, additionalProperties.toMutableMap())
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
        fun validate(): Guardrails = apply {
            if (validated) {
                return@apply
            }

            dlp().ifPresent { it.validate() }
            secrets().ifPresent { it.validate() }
            streaming().ifPresent { it.validate() }
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
            (dlp.asKnown().getOrNull()?.validity() ?: 0) +
                (secrets.asKnown().getOrNull()?.validity() ?: 0) +
                (streaming.asKnown().getOrNull()?.validity() ?: 0)

        class Dlp
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val profiles: JsonField<List<Profile>>,
            private val prompt: JsonField<Prompt>,
            private val response: JsonField<Response>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("profiles")
                @ExcludeMissing
                profiles: JsonField<List<Profile>> = JsonMissing.of(),
                @JsonProperty("prompt")
                @ExcludeMissing
                prompt: JsonField<Prompt> = JsonMissing.of(),
                @JsonProperty("response")
                @ExcludeMissing
                response: JsonField<Response> = JsonMissing.of(),
            ) : this(profiles, prompt, response, mutableMapOf())

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun profiles(): Optional<List<Profile>> = profiles.getOptional("profiles")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun prompt(): Optional<Prompt> = prompt.getOptional("prompt")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun response(): Optional<Response> = response.getOptional("response")

            /**
             * Returns the raw JSON value of [profiles].
             *
             * Unlike [profiles], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("profiles")
            @ExcludeMissing
            fun _profiles(): JsonField<List<Profile>> = profiles

            /**
             * Returns the raw JSON value of [prompt].
             *
             * Unlike [prompt], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("prompt") @ExcludeMissing fun _prompt(): JsonField<Prompt> = prompt

            /**
             * Returns the raw JSON value of [response].
             *
             * Unlike [response], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("response")
            @ExcludeMissing
            fun _response(): JsonField<Response> = response

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

                /** Returns a mutable builder for constructing an instance of [Dlp]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Dlp]. */
            class Builder internal constructor() {

                private var profiles: JsonField<MutableList<Profile>>? = null
                private var prompt: JsonField<Prompt> = JsonMissing.of()
                private var response: JsonField<Response> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(dlp: Dlp) = apply {
                    profiles = dlp.profiles.map { it.toMutableList() }
                    prompt = dlp.prompt
                    response = dlp.response
                    additionalProperties = dlp.additionalProperties.toMutableMap()
                }

                fun profiles(profiles: List<Profile>) = profiles(JsonField.of(profiles))

                /**
                 * Sets [Builder.profiles] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.profiles] with a well-typed `List<Profile>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun profiles(profiles: JsonField<List<Profile>>) = apply {
                    this.profiles = profiles.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Profile] to [profiles].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addProfile(profile: Profile) = apply {
                    profiles =
                        (profiles ?: JsonField.of(mutableListOf())).also {
                            checkKnown("profiles", it).add(profile)
                        }
                }

                fun prompt(prompt: Prompt) = prompt(JsonField.of(prompt))

                /**
                 * Sets [Builder.prompt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.prompt] with a well-typed [Prompt] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun prompt(prompt: JsonField<Prompt>) = apply { this.prompt = prompt }

                fun response(response: Response) = response(JsonField.of(response))

                /**
                 * Sets [Builder.response] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.response] with a well-typed [Response] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun response(response: JsonField<Response>) = apply { this.response = response }

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
                 * Returns an immutable instance of [Dlp].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Dlp =
                    Dlp(
                        (profiles ?: JsonMissing.of()).map { it.toImmutable() },
                        prompt,
                        response,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Dlp = apply {
                if (validated) {
                    return@apply
                }

                profiles().ifPresent { it.forEach { it.validate() } }
                prompt().ifPresent { it.validate() }
                response().ifPresent { it.validate() }
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
                (profiles.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (prompt.asKnown().getOrNull()?.validity() ?: 0) +
                    (response.asKnown().getOrNull()?.validity() ?: 0)

            class Profile @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val FINANCIAL = of("financial")

                    @JvmField val GOVERNMENT_ID = of("government_id")

                    @JvmField val CONTACT = of("contact")

                    @JvmStatic fun of(value: String) = Profile(JsonField.of(value))
                }

                /** An enum containing [Profile]'s known values. */
                enum class Known {
                    FINANCIAL,
                    GOVERNMENT_ID,
                    CONTACT,
                }

                /**
                 * An enum containing [Profile]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Profile] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    FINANCIAL,
                    GOVERNMENT_ID,
                    CONTACT,
                    /**
                     * An enum member indicating that [Profile] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        FINANCIAL -> Value.FINANCIAL
                        GOVERNMENT_ID -> Value.GOVERNMENT_ID
                        CONTACT -> Value.CONTACT
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        FINANCIAL -> Known.FINANCIAL
                        GOVERNMENT_ID -> Known.GOVERNMENT_ID
                        CONTACT -> Known.CONTACT
                        else -> throw TelnyxInvalidDataException("Unknown Profile: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Profile = apply {
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

                    return other is Profile && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class Prompt @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val IGNORE = of("ignore")

                    @JvmField val FLAG = of("flag")

                    @JvmField val BLOCK = of("block")

                    @JvmStatic fun of(value: String) = Prompt(JsonField.of(value))
                }

                /** An enum containing [Prompt]'s known values. */
                enum class Known {
                    IGNORE,
                    FLAG,
                    BLOCK,
                }

                /**
                 * An enum containing [Prompt]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Prompt] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    IGNORE,
                    FLAG,
                    BLOCK,
                    /**
                     * An enum member indicating that [Prompt] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        IGNORE -> Value.IGNORE
                        FLAG -> Value.FLAG
                        BLOCK -> Value.BLOCK
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        IGNORE -> Known.IGNORE
                        FLAG -> Known.FLAG
                        BLOCK -> Known.BLOCK
                        else -> throw TelnyxInvalidDataException("Unknown Prompt: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Prompt = apply {
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

                    return other is Prompt && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class Response @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val IGNORE = of("ignore")

                    @JvmField val FLAG = of("flag")

                    @JvmField val BLOCK = of("block")

                    @JvmStatic fun of(value: String) = Response(JsonField.of(value))
                }

                /** An enum containing [Response]'s known values. */
                enum class Known {
                    IGNORE,
                    FLAG,
                    BLOCK,
                }

                /**
                 * An enum containing [Response]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Response] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    IGNORE,
                    FLAG,
                    BLOCK,
                    /**
                     * An enum member indicating that [Response] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        IGNORE -> Value.IGNORE
                        FLAG -> Value.FLAG
                        BLOCK -> Value.BLOCK
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        IGNORE -> Known.IGNORE
                        FLAG -> Known.FLAG
                        BLOCK -> Known.BLOCK
                        else -> throw TelnyxInvalidDataException("Unknown Response: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Response = apply {
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

                    return other is Response && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Dlp &&
                    profiles == other.profiles &&
                    prompt == other.prompt &&
                    response == other.response &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(profiles, prompt, response, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Dlp{profiles=$profiles, prompt=$prompt, response=$response, additionalProperties=$additionalProperties}"
        }

        class Secrets
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val prompt: JsonField<Prompt>,
            private val response: JsonField<Response>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("prompt")
                @ExcludeMissing
                prompt: JsonField<Prompt> = JsonMissing.of(),
                @JsonProperty("response")
                @ExcludeMissing
                response: JsonField<Response> = JsonMissing.of(),
            ) : this(prompt, response, mutableMapOf())

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun prompt(): Optional<Prompt> = prompt.getOptional("prompt")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun response(): Optional<Response> = response.getOptional("response")

            /**
             * Returns the raw JSON value of [prompt].
             *
             * Unlike [prompt], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("prompt") @ExcludeMissing fun _prompt(): JsonField<Prompt> = prompt

            /**
             * Returns the raw JSON value of [response].
             *
             * Unlike [response], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("response")
            @ExcludeMissing
            fun _response(): JsonField<Response> = response

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

                /** Returns a mutable builder for constructing an instance of [Secrets]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Secrets]. */
            class Builder internal constructor() {

                private var prompt: JsonField<Prompt> = JsonMissing.of()
                private var response: JsonField<Response> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(secrets: Secrets) = apply {
                    prompt = secrets.prompt
                    response = secrets.response
                    additionalProperties = secrets.additionalProperties.toMutableMap()
                }

                fun prompt(prompt: Prompt) = prompt(JsonField.of(prompt))

                /**
                 * Sets [Builder.prompt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.prompt] with a well-typed [Prompt] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun prompt(prompt: JsonField<Prompt>) = apply { this.prompt = prompt }

                fun response(response: Response) = response(JsonField.of(response))

                /**
                 * Sets [Builder.response] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.response] with a well-typed [Response] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun response(response: JsonField<Response>) = apply { this.response = response }

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
                 * Returns an immutable instance of [Secrets].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Secrets =
                    Secrets(prompt, response, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Secrets = apply {
                if (validated) {
                    return@apply
                }

                prompt().ifPresent { it.validate() }
                response().ifPresent { it.validate() }
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
                (prompt.asKnown().getOrNull()?.validity() ?: 0) +
                    (response.asKnown().getOrNull()?.validity() ?: 0)

            class Prompt @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val IGNORE = of("ignore")

                    @JvmField val FLAG = of("flag")

                    @JvmField val BLOCK = of("block")

                    @JvmStatic fun of(value: String) = Prompt(JsonField.of(value))
                }

                /** An enum containing [Prompt]'s known values. */
                enum class Known {
                    IGNORE,
                    FLAG,
                    BLOCK,
                }

                /**
                 * An enum containing [Prompt]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Prompt] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    IGNORE,
                    FLAG,
                    BLOCK,
                    /**
                     * An enum member indicating that [Prompt] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        IGNORE -> Value.IGNORE
                        FLAG -> Value.FLAG
                        BLOCK -> Value.BLOCK
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        IGNORE -> Known.IGNORE
                        FLAG -> Known.FLAG
                        BLOCK -> Known.BLOCK
                        else -> throw TelnyxInvalidDataException("Unknown Prompt: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Prompt = apply {
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

                    return other is Prompt && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class Response @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val IGNORE = of("ignore")

                    @JvmField val FLAG = of("flag")

                    @JvmField val BLOCK = of("block")

                    @JvmStatic fun of(value: String) = Response(JsonField.of(value))
                }

                /** An enum containing [Response]'s known values. */
                enum class Known {
                    IGNORE,
                    FLAG,
                    BLOCK,
                }

                /**
                 * An enum containing [Response]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Response] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    IGNORE,
                    FLAG,
                    BLOCK,
                    /**
                     * An enum member indicating that [Response] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        IGNORE -> Value.IGNORE
                        FLAG -> Value.FLAG
                        BLOCK -> Value.BLOCK
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        IGNORE -> Known.IGNORE
                        FLAG -> Known.FLAG
                        BLOCK -> Known.BLOCK
                        else -> throw TelnyxInvalidDataException("Unknown Response: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Response = apply {
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

                    return other is Response && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Secrets &&
                    prompt == other.prompt &&
                    response == other.response &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(prompt, response, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Secrets{prompt=$prompt, response=$response, additionalProperties=$additionalProperties}"
        }

        class Streaming @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val BUFFERED = of("buffered")

                @JvmField val PASSTHROUGH = of("passthrough")

                @JvmStatic fun of(value: String) = Streaming(JsonField.of(value))
            }

            /** An enum containing [Streaming]'s known values. */
            enum class Known {
                BUFFERED,
                PASSTHROUGH,
            }

            /**
             * An enum containing [Streaming]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Streaming] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                BUFFERED,
                PASSTHROUGH,
                /**
                 * An enum member indicating that [Streaming] was instantiated with an unknown
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
                    BUFFERED -> Value.BUFFERED
                    PASSTHROUGH -> Value.PASSTHROUGH
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
                    BUFFERED -> Known.BUFFERED
                    PASSTHROUGH -> Known.PASSTHROUGH
                    else -> throw TelnyxInvalidDataException("Unknown Streaming: $value")
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Streaming = apply {
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

                return other is Streaming && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Guardrails &&
                dlp == other.dlp &&
                secrets == other.secrets &&
                streaming == other.streaming &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(dlp, secrets, streaming, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Guardrails{dlp=$dlp, secrets=$secrets, streaming=$streaming, additionalProperties=$additionalProperties}"
    }

    /**
     * Per-group same-route retries. max_attempts counts the first try of each step (the primary and
     * each fallback) and is the ceiling for the x-ltg-max-attempts request header. A step is
     * retried only when its attempt definitely did no provider work (connection failure before
     * dispatch, or 429/529) before the first provider event; an uncertain failure (timeout,
     * 408/500/502/503/504) moves to the next fallback step instead. max_attempts x (1 + the longest
     * fallback chain) must not exceed 8, else 400. The n-th retry waits retry_delay_ms (constant),
     * retry_delay_ms*n (linear) or retry_delay_ms*2^(n-1) (exponential), at most 5 s and never past
     * the request deadline, then jittered uniformly down to half that value so concurrent retries
     * spread out; a provider Retry-After of at most 5 s is honoured and a longer one moves to the
     * next step. request_timeout_ms applies to streaming requests only: it bounds each attempt's
     * time to its first provider event and never applies after it. Non-stream requests keep the
     * per-attempt hop and idle bounds (their headers arrive only with the finished completion).
     * retry_delay_ms and backoff are floors for the request knobs. Each planned attempt is reserved
     * (at most 8 per request); unused reservation is released at settlement. Managed routes only.
     * The stored form is echoed back with defaults filled in; null disables retries.
     */
    class Retries
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val maxAttempts: JsonField<Long>,
        private val backoff: JsonField<Backoff>,
        private val requestTimeoutMs: JsonField<Long>,
        private val retryDelayMs: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("max_attempts")
            @ExcludeMissing
            maxAttempts: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("backoff") @ExcludeMissing backoff: JsonField<Backoff> = JsonMissing.of(),
            @JsonProperty("request_timeout_ms")
            @ExcludeMissing
            requestTimeoutMs: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("retry_delay_ms")
            @ExcludeMissing
            retryDelayMs: JsonField<Long> = JsonMissing.of(),
        ) : this(maxAttempts, backoff, requestTimeoutMs, retryDelayMs, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun maxAttempts(): Long = maxAttempts.getRequired("max_attempts")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun backoff(): Optional<Backoff> = backoff.getOptional("backoff")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun requestTimeoutMs(): Optional<Long> = requestTimeoutMs.getOptional("request_timeout_ms")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun retryDelayMs(): Optional<Long> = retryDelayMs.getOptional("retry_delay_ms")

        /**
         * Returns the raw JSON value of [maxAttempts].
         *
         * Unlike [maxAttempts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("max_attempts")
        @ExcludeMissing
        fun _maxAttempts(): JsonField<Long> = maxAttempts

        /**
         * Returns the raw JSON value of [backoff].
         *
         * Unlike [backoff], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("backoff") @ExcludeMissing fun _backoff(): JsonField<Backoff> = backoff

        /**
         * Returns the raw JSON value of [requestTimeoutMs].
         *
         * Unlike [requestTimeoutMs], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("request_timeout_ms")
        @ExcludeMissing
        fun _requestTimeoutMs(): JsonField<Long> = requestTimeoutMs

        /**
         * Returns the raw JSON value of [retryDelayMs].
         *
         * Unlike [retryDelayMs], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("retry_delay_ms")
        @ExcludeMissing
        fun _retryDelayMs(): JsonField<Long> = retryDelayMs

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
             * Returns a mutable builder for constructing an instance of [Retries].
             *
             * The following fields are required:
             * ```java
             * .maxAttempts()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Retries]. */
        class Builder internal constructor() {

            private var maxAttempts: JsonField<Long>? = null
            private var backoff: JsonField<Backoff> = JsonMissing.of()
            private var requestTimeoutMs: JsonField<Long> = JsonMissing.of()
            private var retryDelayMs: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(retries: Retries) = apply {
                maxAttempts = retries.maxAttempts
                backoff = retries.backoff
                requestTimeoutMs = retries.requestTimeoutMs
                retryDelayMs = retries.retryDelayMs
                additionalProperties = retries.additionalProperties.toMutableMap()
            }

            fun maxAttempts(maxAttempts: Long) = maxAttempts(JsonField.of(maxAttempts))

            /**
             * Sets [Builder.maxAttempts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxAttempts] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxAttempts(maxAttempts: JsonField<Long>) = apply { this.maxAttempts = maxAttempts }

            fun backoff(backoff: Backoff) = backoff(JsonField.of(backoff))

            /**
             * Sets [Builder.backoff] to an arbitrary JSON value.
             *
             * You should usually call [Builder.backoff] with a well-typed [Backoff] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun backoff(backoff: JsonField<Backoff>) = apply { this.backoff = backoff }

            fun requestTimeoutMs(requestTimeoutMs: Long?) =
                requestTimeoutMs(JsonField.ofNullable(requestTimeoutMs))

            /**
             * Alias for [Builder.requestTimeoutMs].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun requestTimeoutMs(requestTimeoutMs: Long) =
                requestTimeoutMs(requestTimeoutMs as Long?)

            /**
             * Alias for calling [Builder.requestTimeoutMs] with `requestTimeoutMs.orElse(null)`.
             */
            fun requestTimeoutMs(requestTimeoutMs: Optional<Long>) =
                requestTimeoutMs(requestTimeoutMs.getOrNull())

            /**
             * Sets [Builder.requestTimeoutMs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requestTimeoutMs] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun requestTimeoutMs(requestTimeoutMs: JsonField<Long>) = apply {
                this.requestTimeoutMs = requestTimeoutMs
            }

            fun retryDelayMs(retryDelayMs: Long) = retryDelayMs(JsonField.of(retryDelayMs))

            /**
             * Sets [Builder.retryDelayMs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.retryDelayMs] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun retryDelayMs(retryDelayMs: JsonField<Long>) = apply {
                this.retryDelayMs = retryDelayMs
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
             * Returns an immutable instance of [Retries].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .maxAttempts()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Retries =
                Retries(
                    checkRequired("maxAttempts", maxAttempts),
                    backoff,
                    requestTimeoutMs,
                    retryDelayMs,
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
        fun validate(): Retries = apply {
            if (validated) {
                return@apply
            }

            maxAttempts()
            backoff().ifPresent { it.validate() }
            requestTimeoutMs()
            retryDelayMs()
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
            (if (maxAttempts.asKnown().isPresent) 1 else 0) +
                (backoff.asKnown().getOrNull()?.validity() ?: 0) +
                (if (requestTimeoutMs.asKnown().isPresent) 1 else 0) +
                (if (retryDelayMs.asKnown().isPresent) 1 else 0)

        class Backoff @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val CONSTANT = of("constant")

                @JvmField val LINEAR = of("linear")

                @JvmField val EXPONENTIAL = of("exponential")

                @JvmStatic fun of(value: String) = Backoff(JsonField.of(value))
            }

            /** An enum containing [Backoff]'s known values. */
            enum class Known {
                CONSTANT,
                LINEAR,
                EXPONENTIAL,
            }

            /**
             * An enum containing [Backoff]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Backoff] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CONSTANT,
                LINEAR,
                EXPONENTIAL,
                /**
                 * An enum member indicating that [Backoff] was instantiated with an unknown value.
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
                    CONSTANT -> Value.CONSTANT
                    LINEAR -> Value.LINEAR
                    EXPONENTIAL -> Value.EXPONENTIAL
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
                    CONSTANT -> Known.CONSTANT
                    LINEAR -> Known.LINEAR
                    EXPONENTIAL -> Known.EXPONENTIAL
                    else -> throw TelnyxInvalidDataException("Unknown Backoff: $value")
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Backoff = apply {
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

                return other is Backoff && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Retries &&
                maxAttempts == other.maxAttempts &&
                backoff == other.backoff &&
                requestTimeoutMs == other.requestTimeoutMs &&
                retryDelayMs == other.retryDelayMs &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(maxAttempts, backoff, requestTimeoutMs, retryDelayMs, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Retries{maxAttempts=$maxAttempts, backoff=$backoff, requestTimeoutMs=$requestTimeoutMs, retryDelayMs=$retryDelayMs, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TokenGroupUpdateParams &&
            id == other.id &&
            idempotencyKey == other.idempotencyKey &&
            ifMatch == other.ifMatch &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(id, idempotencyKey, ifMatch, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "TokenGroupUpdateParams{id=$id, idempotencyKey=$idempotencyKey, ifMatch=$ifMatch, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
