// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.llmtokengateway.tokenkeys

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import com.telnyx.sdk.models.llmtokengateway.tokengroups.BudgetDuration
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class TokenKey
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val allowedModels: JsonField<List<String>>,
    private val blocked: JsonField<Boolean>,
    private val budgetDuration: JsonField<BudgetDuration>,
    private val budgetStartedAt: JsonField<OffsetDateTime>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val expiresAt: JsonField<OffsetDateTime>,
    private val maxBudget: JsonField<Double>,
    private val name: JsonField<String>,
    private val recordType: JsonValue,
    private val requiredEndUserId: JsonField<Boolean>,
    private val reservedSpend: JsonField<Double>,
    private val resetsAt: JsonField<OffsetDateTime>,
    private val rpmLimit: JsonField<Long>,
    private val spend: JsonField<Double>,
    private val tokenGroupId: JsonField<String>,
    private val tokenUserId: JsonField<String>,
    private val tpmLimit: JsonField<Long>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val version: JsonField<Long>,
    private val maxParallelRequests: JsonField<Long>,
    private val provisioning: JsonField<Provisioning>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("allowed_models")
        @ExcludeMissing
        allowedModels: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("blocked") @ExcludeMissing blocked: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("budget_duration")
        @ExcludeMissing
        budgetDuration: JsonField<BudgetDuration> = JsonMissing.of(),
        @JsonProperty("budget_started_at")
        @ExcludeMissing
        budgetStartedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("expires_at")
        @ExcludeMissing
        expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("max_budget") @ExcludeMissing maxBudget: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("record_type") @ExcludeMissing recordType: JsonValue = JsonMissing.of(),
        @JsonProperty("required_end_user_id")
        @ExcludeMissing
        requiredEndUserId: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("reserved_spend")
        @ExcludeMissing
        reservedSpend: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("resets_at")
        @ExcludeMissing
        resetsAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("rpm_limit") @ExcludeMissing rpmLimit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("spend") @ExcludeMissing spend: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("token_group_id")
        @ExcludeMissing
        tokenGroupId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("token_user_id")
        @ExcludeMissing
        tokenUserId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tpm_limit") @ExcludeMissing tpmLimit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("max_parallel_requests")
        @ExcludeMissing
        maxParallelRequests: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("provisioning")
        @ExcludeMissing
        provisioning: JsonField<Provisioning> = JsonMissing.of(),
    ) : this(
        id,
        allowedModels,
        blocked,
        budgetDuration,
        budgetStartedAt,
        createdAt,
        expiresAt,
        maxBudget,
        name,
        recordType,
        requiredEndUserId,
        reservedSpend,
        resetsAt,
        rpmLimit,
        spend,
        tokenGroupId,
        tokenUserId,
        tpmLimit,
        updatedAt,
        version,
        maxParallelRequests,
        provisioning,
        mutableMapOf(),
    )

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun allowedModels(): Optional<List<String>> = allowedModels.getOptional("allowed_models")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun blocked(): Boolean = blocked.getRequired("blocked")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun budgetDuration(): Optional<BudgetDuration> = budgetDuration.getOptional("budget_duration")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun budgetStartedAt(): Optional<OffsetDateTime> =
        budgetStartedAt.getOptional("budget_started_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

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
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Expected to always return the following:
     * ```java
     * JsonValue.from("token_key")
     * ```
     *
     * However, this method can be useful for debugging and logging (e.g. if the server responded
     * with an unexpected value).
     */
    @JsonProperty("record_type") @ExcludeMissing fun _recordType(): JsonValue = recordType

    /**
     * Require a nonempty caller-asserted end-user ID; not proof of identity.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun requiredEndUserId(): Boolean = requiredEndUserId.getRequired("required_end_user_id")

    /**
     * USD, decimal precision at most 6 places; parse exactly to integer micro-USD, never binary
     * float accounting.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun reservedSpend(): Double = reservedSpend.getRequired("reserved_spend")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun resetsAt(): Optional<OffsetDateTime> = resetsAt.getOptional("resets_at")

    /**
     * Stored key limit; set to the maximum when the key was written without one (on a blocked key,
     * null is kept until the key is unblocked).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rpmLimit(): Optional<Long> = rpmLimit.getOptional("rpm_limit")

    /**
     * USD, decimal precision at most 6 places; parse exactly to integer micro-USD, never binary
     * float accounting.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun spend(): Double = spend.getRequired("spend")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tokenGroupId(): String = tokenGroupId.getRequired("token_group_id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tokenUserId(): Optional<String> = tokenUserId.getOptional("token_user_id")

    /**
     * Stored key limit; set to the maximum when the key was written without one (on a blocked key,
     * null is kept until the key is unblocked).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tpmLimit(): Optional<Long> = tpmLimit.getOptional("tpm_limit")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun version(): Long = version.getRequired("version")

    /**
     * Optional maximum concurrent reserved/dispatched cache misses across replicas. Null means no
     * concurrency cap. Cache hits do not consume slots; unknown usage retains its budget hold
     * without a slot.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxParallelRequests(): Optional<Long> =
        maxParallelRequests.getOptional("max_parallel_requests")

    /**
     * Provisioning state of the key's current policy. `pending`: retry readiness with bounded
     * backoff (treat `unknown` the same). `inactive` and `unsupported` are terminal until the key,
     * group, user or catalog changes. `unavailable` means provisioning is stuck and is retried
     * slowly; surface it. Absent while the gateway runs in compatibility mode.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun provisioning(): Optional<Provisioning> = provisioning.getOptional("provisioning")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [allowedModels].
     *
     * Unlike [allowedModels], this method doesn't throw if the JSON field has an unexpected type.
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
     * Unlike [budgetDuration], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("budget_duration")
    @ExcludeMissing
    fun _budgetDuration(): JsonField<BudgetDuration> = budgetDuration

    /**
     * Returns the raw JSON value of [budgetStartedAt].
     *
     * Unlike [budgetStartedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("budget_started_at")
    @ExcludeMissing
    fun _budgetStartedAt(): JsonField<OffsetDateTime> = budgetStartedAt

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

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
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
     * Returns the raw JSON value of [reservedSpend].
     *
     * Unlike [reservedSpend], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reserved_spend")
    @ExcludeMissing
    fun _reservedSpend(): JsonField<Double> = reservedSpend

    /**
     * Returns the raw JSON value of [resetsAt].
     *
     * Unlike [resetsAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resets_at") @ExcludeMissing fun _resetsAt(): JsonField<OffsetDateTime> = resetsAt

    /**
     * Returns the raw JSON value of [rpmLimit].
     *
     * Unlike [rpmLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rpm_limit") @ExcludeMissing fun _rpmLimit(): JsonField<Long> = rpmLimit

    /**
     * Returns the raw JSON value of [spend].
     *
     * Unlike [spend], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("spend") @ExcludeMissing fun _spend(): JsonField<Double> = spend

    /**
     * Returns the raw JSON value of [tokenGroupId].
     *
     * Unlike [tokenGroupId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token_group_id")
    @ExcludeMissing
    fun _tokenGroupId(): JsonField<String> = tokenGroupId

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

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [version].
     *
     * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

    /**
     * Returns the raw JSON value of [maxParallelRequests].
     *
     * Unlike [maxParallelRequests], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("max_parallel_requests")
    @ExcludeMissing
    fun _maxParallelRequests(): JsonField<Long> = maxParallelRequests

    /**
     * Returns the raw JSON value of [provisioning].
     *
     * Unlike [provisioning], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("provisioning")
    @ExcludeMissing
    fun _provisioning(): JsonField<Provisioning> = provisioning

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
         * Returns a mutable builder for constructing an instance of [TokenKey].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .allowedModels()
         * .blocked()
         * .budgetDuration()
         * .budgetStartedAt()
         * .createdAt()
         * .expiresAt()
         * .maxBudget()
         * .name()
         * .requiredEndUserId()
         * .reservedSpend()
         * .resetsAt()
         * .rpmLimit()
         * .spend()
         * .tokenGroupId()
         * .tokenUserId()
         * .tpmLimit()
         * .updatedAt()
         * .version()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TokenKey]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var allowedModels: JsonField<MutableList<String>>? = null
        private var blocked: JsonField<Boolean>? = null
        private var budgetDuration: JsonField<BudgetDuration>? = null
        private var budgetStartedAt: JsonField<OffsetDateTime>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var expiresAt: JsonField<OffsetDateTime>? = null
        private var maxBudget: JsonField<Double>? = null
        private var name: JsonField<String>? = null
        private var recordType: JsonValue = JsonValue.from("token_key")
        private var requiredEndUserId: JsonField<Boolean>? = null
        private var reservedSpend: JsonField<Double>? = null
        private var resetsAt: JsonField<OffsetDateTime>? = null
        private var rpmLimit: JsonField<Long>? = null
        private var spend: JsonField<Double>? = null
        private var tokenGroupId: JsonField<String>? = null
        private var tokenUserId: JsonField<String>? = null
        private var tpmLimit: JsonField<Long>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var version: JsonField<Long>? = null
        private var maxParallelRequests: JsonField<Long> = JsonMissing.of()
        private var provisioning: JsonField<Provisioning> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(tokenKey: TokenKey) = apply {
            id = tokenKey.id
            allowedModels = tokenKey.allowedModels.map { it.toMutableList() }
            blocked = tokenKey.blocked
            budgetDuration = tokenKey.budgetDuration
            budgetStartedAt = tokenKey.budgetStartedAt
            createdAt = tokenKey.createdAt
            expiresAt = tokenKey.expiresAt
            maxBudget = tokenKey.maxBudget
            name = tokenKey.name
            recordType = tokenKey.recordType
            requiredEndUserId = tokenKey.requiredEndUserId
            reservedSpend = tokenKey.reservedSpend
            resetsAt = tokenKey.resetsAt
            rpmLimit = tokenKey.rpmLimit
            spend = tokenKey.spend
            tokenGroupId = tokenKey.tokenGroupId
            tokenUserId = tokenKey.tokenUserId
            tpmLimit = tokenKey.tpmLimit
            updatedAt = tokenKey.updatedAt
            version = tokenKey.version
            maxParallelRequests = tokenKey.maxParallelRequests
            provisioning = tokenKey.provisioning
            additionalProperties = tokenKey.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun allowedModels(allowedModels: List<String>?) =
            allowedModels(JsonField.ofNullable(allowedModels))

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
         * You should usually call [Builder.blocked] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
         * You should usually call [Builder.budgetDuration] with a well-typed [BudgetDuration] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun budgetDuration(budgetDuration: JsonField<BudgetDuration>) = apply {
            this.budgetDuration = budgetDuration
        }

        fun budgetStartedAt(budgetStartedAt: OffsetDateTime?) =
            budgetStartedAt(JsonField.ofNullable(budgetStartedAt))

        /** Alias for calling [Builder.budgetStartedAt] with `budgetStartedAt.orElse(null)`. */
        fun budgetStartedAt(budgetStartedAt: Optional<OffsetDateTime>) =
            budgetStartedAt(budgetStartedAt.getOrNull())

        /**
         * Sets [Builder.budgetStartedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.budgetStartedAt] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun budgetStartedAt(budgetStartedAt: JsonField<OffsetDateTime>) = apply {
            this.budgetStartedAt = budgetStartedAt
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

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
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { this.expiresAt = expiresAt }

        /**
         * USD, decimal precision at most 6 places; parse exactly to integer micro-USD, never binary
         * float accounting.
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
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxBudget(maxBudget: JsonField<Double>) = apply { this.maxBudget = maxBudget }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * Sets the field to an arbitrary JSON value.
         *
         * It is usually unnecessary to call this method because the field defaults to the
         * following:
         * ```java
         * JsonValue.from("token_key")
         * ```
         *
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recordType(recordType: JsonValue) = apply { this.recordType = recordType }

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
         * USD, decimal precision at most 6 places; parse exactly to integer micro-USD, never binary
         * float accounting.
         */
        fun reservedSpend(reservedSpend: Double) = reservedSpend(JsonField.of(reservedSpend))

        /**
         * Sets [Builder.reservedSpend] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reservedSpend] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun reservedSpend(reservedSpend: JsonField<Double>) = apply {
            this.reservedSpend = reservedSpend
        }

        fun resetsAt(resetsAt: OffsetDateTime?) = resetsAt(JsonField.ofNullable(resetsAt))

        /** Alias for calling [Builder.resetsAt] with `resetsAt.orElse(null)`. */
        fun resetsAt(resetsAt: Optional<OffsetDateTime>) = resetsAt(resetsAt.getOrNull())

        /**
         * Sets [Builder.resetsAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resetsAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun resetsAt(resetsAt: JsonField<OffsetDateTime>) = apply { this.resetsAt = resetsAt }

        /**
         * Stored key limit; set to the maximum when the key was written without one (on a blocked
         * key, null is kept until the key is unblocked).
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
         * You should usually call [Builder.rpmLimit] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rpmLimit(rpmLimit: JsonField<Long>) = apply { this.rpmLimit = rpmLimit }

        /**
         * USD, decimal precision at most 6 places; parse exactly to integer micro-USD, never binary
         * float accounting.
         */
        fun spend(spend: Double) = spend(JsonField.of(spend))

        /**
         * Sets [Builder.spend] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spend] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun spend(spend: JsonField<Double>) = apply { this.spend = spend }

        fun tokenGroupId(tokenGroupId: String) = tokenGroupId(JsonField.of(tokenGroupId))

        /**
         * Sets [Builder.tokenGroupId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tokenGroupId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tokenGroupId(tokenGroupId: JsonField<String>) = apply {
            this.tokenGroupId = tokenGroupId
        }

        fun tokenUserId(tokenUserId: String?) = tokenUserId(JsonField.ofNullable(tokenUserId))

        /** Alias for calling [Builder.tokenUserId] with `tokenUserId.orElse(null)`. */
        fun tokenUserId(tokenUserId: Optional<String>) = tokenUserId(tokenUserId.getOrNull())

        /**
         * Sets [Builder.tokenUserId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tokenUserId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tokenUserId(tokenUserId: JsonField<String>) = apply { this.tokenUserId = tokenUserId }

        /**
         * Stored key limit; set to the maximum when the key was written without one (on a blocked
         * key, null is kept until the key is unblocked).
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
         * You should usually call [Builder.tpmLimit] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tpmLimit(tpmLimit: JsonField<Long>) = apply { this.tpmLimit = tpmLimit }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun version(version: Long) = version(JsonField.of(version))

        /**
         * Sets [Builder.version] to an arbitrary JSON value.
         *
         * You should usually call [Builder.version] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun version(version: JsonField<Long>) = apply { this.version = version }

        /**
         * Optional maximum concurrent reserved/dispatched cache misses across replicas. Null means
         * no concurrency cap. Cache hits do not consume slots; unknown usage retains its budget
         * hold without a slot.
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
            this.maxParallelRequests = maxParallelRequests
        }

        /**
         * Provisioning state of the key's current policy. `pending`: retry readiness with bounded
         * backoff (treat `unknown` the same). `inactive` and `unsupported` are terminal until the
         * key, group, user or catalog changes. `unavailable` means provisioning is stuck and is
         * retried slowly; surface it. Absent while the gateway runs in compatibility mode.
         */
        fun provisioning(provisioning: Provisioning) = provisioning(JsonField.of(provisioning))

        /**
         * Sets [Builder.provisioning] to an arbitrary JSON value.
         *
         * You should usually call [Builder.provisioning] with a well-typed [Provisioning] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun provisioning(provisioning: JsonField<Provisioning>) = apply {
            this.provisioning = provisioning
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
         * Returns an immutable instance of [TokenKey].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .allowedModels()
         * .blocked()
         * .budgetDuration()
         * .budgetStartedAt()
         * .createdAt()
         * .expiresAt()
         * .maxBudget()
         * .name()
         * .requiredEndUserId()
         * .reservedSpend()
         * .resetsAt()
         * .rpmLimit()
         * .spend()
         * .tokenGroupId()
         * .tokenUserId()
         * .tpmLimit()
         * .updatedAt()
         * .version()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TokenKey =
            TokenKey(
                checkRequired("id", id),
                checkRequired("allowedModels", allowedModels).map { it.toImmutable() },
                checkRequired("blocked", blocked),
                checkRequired("budgetDuration", budgetDuration),
                checkRequired("budgetStartedAt", budgetStartedAt),
                checkRequired("createdAt", createdAt),
                checkRequired("expiresAt", expiresAt),
                checkRequired("maxBudget", maxBudget),
                checkRequired("name", name),
                recordType,
                checkRequired("requiredEndUserId", requiredEndUserId),
                checkRequired("reservedSpend", reservedSpend),
                checkRequired("resetsAt", resetsAt),
                checkRequired("rpmLimit", rpmLimit),
                checkRequired("spend", spend),
                checkRequired("tokenGroupId", tokenGroupId),
                checkRequired("tokenUserId", tokenUserId),
                checkRequired("tpmLimit", tpmLimit),
                checkRequired("updatedAt", updatedAt),
                checkRequired("version", version),
                maxParallelRequests,
                provisioning,
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
    fun validate(): TokenKey = apply {
        if (validated) {
            return@apply
        }

        id()
        allowedModels()
        blocked()
        budgetDuration().ifPresent { it.validate() }
        budgetStartedAt()
        createdAt()
        expiresAt()
        maxBudget()
        name()
        _recordType().let {
            if (it != JsonValue.from("token_key")) {
                throw TelnyxInvalidDataException("'recordType' is invalid, received $it")
            }
        }
        requiredEndUserId()
        reservedSpend()
        resetsAt()
        rpmLimit()
        spend()
        tokenGroupId()
        tokenUserId()
        tpmLimit()
        updatedAt()
        version()
        maxParallelRequests()
        provisioning().ifPresent { it.validate() }
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (allowedModels.asKnown().getOrNull()?.size ?: 0) +
            (if (blocked.asKnown().isPresent) 1 else 0) +
            (budgetDuration.asKnown().getOrNull()?.validity() ?: 0) +
            (if (budgetStartedAt.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (expiresAt.asKnown().isPresent) 1 else 0) +
            (if (maxBudget.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            recordType.let { if (it == JsonValue.from("token_key")) 1 else 0 } +
            (if (requiredEndUserId.asKnown().isPresent) 1 else 0) +
            (if (reservedSpend.asKnown().isPresent) 1 else 0) +
            (if (resetsAt.asKnown().isPresent) 1 else 0) +
            (if (rpmLimit.asKnown().isPresent) 1 else 0) +
            (if (spend.asKnown().isPresent) 1 else 0) +
            (if (tokenGroupId.asKnown().isPresent) 1 else 0) +
            (if (tokenUserId.asKnown().isPresent) 1 else 0) +
            (if (tpmLimit.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (version.asKnown().isPresent) 1 else 0) +
            (if (maxParallelRequests.asKnown().isPresent) 1 else 0) +
            (provisioning.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * Provisioning state of the key's current policy. `pending`: retry readiness with bounded
     * backoff (treat `unknown` the same). `inactive` and `unsupported` are terminal until the key,
     * group, user or catalog changes. `unavailable` means provisioning is stuck and is retried
     * slowly; surface it. Absent while the gateway runs in compatibility mode.
     */
    class Provisioning @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val READY = of("ready")

            @JvmField val PENDING = of("pending")

            @JvmField val UNAVAILABLE = of("unavailable")

            @JvmField val INACTIVE = of("inactive")

            @JvmField val UNSUPPORTED = of("unsupported")

            @JvmField val UNKNOWN = of("unknown")

            @JvmStatic fun of(value: String) = Provisioning(JsonField.of(value))
        }

        /** An enum containing [Provisioning]'s known values. */
        enum class Known {
            READY,
            PENDING,
            UNAVAILABLE,
            INACTIVE,
            UNSUPPORTED,
            UNKNOWN,
        }

        /**
         * An enum containing [Provisioning]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Provisioning] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            READY,
            PENDING,
            UNAVAILABLE,
            INACTIVE,
            UNSUPPORTED,
            UNKNOWN,
            /**
             * An enum member indicating that [Provisioning] was instantiated with an unknown value.
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
                READY -> Value.READY
                PENDING -> Value.PENDING
                UNAVAILABLE -> Value.UNAVAILABLE
                INACTIVE -> Value.INACTIVE
                UNSUPPORTED -> Value.UNSUPPORTED
                UNKNOWN -> Value.UNKNOWN
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
                READY -> Known.READY
                PENDING -> Known.PENDING
                UNAVAILABLE -> Known.UNAVAILABLE
                INACTIVE -> Known.INACTIVE
                UNSUPPORTED -> Known.UNSUPPORTED
                UNKNOWN -> Known.UNKNOWN
                else -> throw TelnyxInvalidDataException("Unknown Provisioning: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Provisioning = apply {
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

            return other is Provisioning && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TokenKey &&
            id == other.id &&
            allowedModels == other.allowedModels &&
            blocked == other.blocked &&
            budgetDuration == other.budgetDuration &&
            budgetStartedAt == other.budgetStartedAt &&
            createdAt == other.createdAt &&
            expiresAt == other.expiresAt &&
            maxBudget == other.maxBudget &&
            name == other.name &&
            recordType == other.recordType &&
            requiredEndUserId == other.requiredEndUserId &&
            reservedSpend == other.reservedSpend &&
            resetsAt == other.resetsAt &&
            rpmLimit == other.rpmLimit &&
            spend == other.spend &&
            tokenGroupId == other.tokenGroupId &&
            tokenUserId == other.tokenUserId &&
            tpmLimit == other.tpmLimit &&
            updatedAt == other.updatedAt &&
            version == other.version &&
            maxParallelRequests == other.maxParallelRequests &&
            provisioning == other.provisioning &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            allowedModels,
            blocked,
            budgetDuration,
            budgetStartedAt,
            createdAt,
            expiresAt,
            maxBudget,
            name,
            recordType,
            requiredEndUserId,
            reservedSpend,
            resetsAt,
            rpmLimit,
            spend,
            tokenGroupId,
            tokenUserId,
            tpmLimit,
            updatedAt,
            version,
            maxParallelRequests,
            provisioning,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TokenKey{id=$id, allowedModels=$allowedModels, blocked=$blocked, budgetDuration=$budgetDuration, budgetStartedAt=$budgetStartedAt, createdAt=$createdAt, expiresAt=$expiresAt, maxBudget=$maxBudget, name=$name, recordType=$recordType, requiredEndUserId=$requiredEndUserId, reservedSpend=$reservedSpend, resetsAt=$resetsAt, rpmLimit=$rpmLimit, spend=$spend, tokenGroupId=$tokenGroupId, tokenUserId=$tokenUserId, tpmLimit=$tpmLimit, updatedAt=$updatedAt, version=$version, maxParallelRequests=$maxParallelRequests, provisioning=$provisioning, additionalProperties=$additionalProperties}"
}
