// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.sessionanalysis

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class SessionAnalysisRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val cost: JsonField<Cost>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val meta: JsonField<Meta>,
    private val root: JsonField<Root>,
    private val sessionId: JsonField<String>,
    private val status: JsonField<String>,
    private val completedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("cost") @ExcludeMissing cost: JsonField<Cost> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("meta") @ExcludeMissing meta: JsonField<Meta> = JsonMissing.of(),
        @JsonProperty("root") @ExcludeMissing root: JsonField<Root> = JsonMissing.of(),
        @JsonProperty("session_id") @ExcludeMissing sessionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        @JsonProperty("completed_at")
        @ExcludeMissing
        completedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(cost, createdAt, meta, root, sessionId, status, completedAt, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cost(): Cost = cost.getRequired("cost")

    /**
     * When the session started.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun meta(): Meta = meta.getRequired("meta")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun root(): Root = root.getRequired("root")

    /**
     * Identifier for the analyzed session.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sessionId(): String = sessionId.getRequired("session_id")

    /**
     * Analysis status (e.g. "completed").
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): String = status.getRequired("status")

    /**
     * When the session completed.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun completedAt(): Optional<OffsetDateTime> = completedAt.getOptional("completed_at")

    /**
     * Returns the raw JSON value of [cost].
     *
     * Unlike [cost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cost") @ExcludeMissing fun _cost(): JsonField<Cost> = cost

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [meta].
     *
     * Unlike [meta], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("meta") @ExcludeMissing fun _meta(): JsonField<Meta> = meta

    /**
     * Returns the raw JSON value of [root].
     *
     * Unlike [root], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("root") @ExcludeMissing fun _root(): JsonField<Root> = root

    /**
     * Returns the raw JSON value of [sessionId].
     *
     * Unlike [sessionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("session_id") @ExcludeMissing fun _sessionId(): JsonField<String> = sessionId

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

    /**
     * Returns the raw JSON value of [completedAt].
     *
     * Unlike [completedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("completed_at")
    @ExcludeMissing
    fun _completedAt(): JsonField<OffsetDateTime> = completedAt

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
         * [SessionAnalysisRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .cost()
         * .createdAt()
         * .meta()
         * .root()
         * .sessionId()
         * .status()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SessionAnalysisRetrieveResponse]. */
    class Builder internal constructor() {

        private var cost: JsonField<Cost>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var meta: JsonField<Meta>? = null
        private var root: JsonField<Root>? = null
        private var sessionId: JsonField<String>? = null
        private var status: JsonField<String>? = null
        private var completedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sessionAnalysisRetrieveResponse: SessionAnalysisRetrieveResponse) =
            apply {
                cost = sessionAnalysisRetrieveResponse.cost
                createdAt = sessionAnalysisRetrieveResponse.createdAt
                meta = sessionAnalysisRetrieveResponse.meta
                root = sessionAnalysisRetrieveResponse.root
                sessionId = sessionAnalysisRetrieveResponse.sessionId
                status = sessionAnalysisRetrieveResponse.status
                completedAt = sessionAnalysisRetrieveResponse.completedAt
                additionalProperties =
                    sessionAnalysisRetrieveResponse.additionalProperties.toMutableMap()
            }

        fun cost(cost: Cost) = cost(JsonField.of(cost))

        /**
         * Sets [Builder.cost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cost] with a well-typed [Cost] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cost(cost: JsonField<Cost>) = apply { this.cost = cost }

        /** When the session started. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun meta(meta: Meta) = meta(JsonField.of(meta))

        /**
         * Sets [Builder.meta] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meta] with a well-typed [Meta] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun meta(meta: JsonField<Meta>) = apply { this.meta = meta }

        fun root(root: Root) = root(JsonField.of(root))

        /**
         * Sets [Builder.root] to an arbitrary JSON value.
         *
         * You should usually call [Builder.root] with a well-typed [Root] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun root(root: JsonField<Root>) = apply { this.root = root }

        /** Identifier for the analyzed session. */
        fun sessionId(sessionId: String) = sessionId(JsonField.of(sessionId))

        /**
         * Sets [Builder.sessionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sessionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sessionId(sessionId: JsonField<String>) = apply { this.sessionId = sessionId }

        /** Analysis status (e.g. "completed"). */
        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

        /** When the session completed. */
        fun completedAt(completedAt: OffsetDateTime?) =
            completedAt(JsonField.ofNullable(completedAt))

        /** Alias for calling [Builder.completedAt] with `completedAt.orElse(null)`. */
        fun completedAt(completedAt: Optional<OffsetDateTime>) =
            completedAt(completedAt.getOrNull())

        /**
         * Sets [Builder.completedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.completedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun completedAt(completedAt: JsonField<OffsetDateTime>) = apply {
            this.completedAt = completedAt
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
         * Returns an immutable instance of [SessionAnalysisRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .cost()
         * .createdAt()
         * .meta()
         * .root()
         * .sessionId()
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SessionAnalysisRetrieveResponse =
            SessionAnalysisRetrieveResponse(
                checkRequired("cost", cost),
                checkRequired("createdAt", createdAt),
                checkRequired("meta", meta),
                checkRequired("root", root),
                checkRequired("sessionId", sessionId),
                checkRequired("status", status),
                completedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SessionAnalysisRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        cost().validate()
        createdAt()
        meta().validate()
        root().validate()
        sessionId()
        status()
        completedAt()
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
        (cost.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (meta.asKnown().getOrNull()?.validity() ?: 0) +
            (root.asKnown().getOrNull()?.validity() ?: 0) +
            (if (sessionId.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0) +
            (if (completedAt.asKnown().isPresent) 1 else 0)

    class Cost
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val currency: JsonField<String>,
        private val total: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("total") @ExcludeMissing total: JsonField<String> = JsonMissing.of(),
        ) : this(currency, total, mutableMapOf())

        /**
         * ISO 4217 currency code.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): String = currency.getRequired("currency")

        /**
         * Total session cost as a decimal string.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun total(): String = total.getRequired("total")

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [total].
         *
         * Unlike [total], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<String> = total

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
             * Returns a mutable builder for constructing an instance of [Cost].
             *
             * The following fields are required:
             * ```java
             * .currency()
             * .total()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Cost]. */
        class Builder internal constructor() {

            private var currency: JsonField<String>? = null
            private var total: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cost: Cost) = apply {
                currency = cost.currency
                total = cost.total
                additionalProperties = cost.additionalProperties.toMutableMap()
            }

            /** ISO 4217 currency code. */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /** Total session cost as a decimal string. */
            fun total(total: String) = total(JsonField.of(total))

            /**
             * Sets [Builder.total] to an arbitrary JSON value.
             *
             * You should usually call [Builder.total] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun total(total: JsonField<String>) = apply { this.total = total }

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
             * Returns an immutable instance of [Cost].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .currency()
             * .total()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Cost =
                Cost(
                    checkRequired("currency", currency),
                    checkRequired("total", total),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Cost = apply {
            if (validated) {
                return@apply
            }

            currency()
            total()
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
            (if (currency.asKnown().isPresent) 1 else 0) + (if (total.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Cost &&
                currency == other.currency &&
                total == other.total &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(currency, total, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Cost{currency=$currency, total=$total, additionalProperties=$additionalProperties}"
    }

    class Meta
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val eventCount: JsonField<Long>,
        private val products: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("event_count")
            @ExcludeMissing
            eventCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("products")
            @ExcludeMissing
            products: JsonField<List<String>> = JsonMissing.of(),
        ) : this(eventCount, products, mutableMapOf())

        /**
         * Total number of events in the session tree.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun eventCount(): Long = eventCount.getRequired("event_count")

        /**
         * List of distinct products involved in the session.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun products(): List<String> = products.getRequired("products")

        /**
         * Returns the raw JSON value of [eventCount].
         *
         * Unlike [eventCount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("event_count") @ExcludeMissing fun _eventCount(): JsonField<Long> = eventCount

        /**
         * Returns the raw JSON value of [products].
         *
         * Unlike [products], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("products")
        @ExcludeMissing
        fun _products(): JsonField<List<String>> = products

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
             * Returns a mutable builder for constructing an instance of [Meta].
             *
             * The following fields are required:
             * ```java
             * .eventCount()
             * .products()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Meta]. */
        class Builder internal constructor() {

            private var eventCount: JsonField<Long>? = null
            private var products: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(meta: Meta) = apply {
                eventCount = meta.eventCount
                products = meta.products.map { it.toMutableList() }
                additionalProperties = meta.additionalProperties.toMutableMap()
            }

            /** Total number of events in the session tree. */
            fun eventCount(eventCount: Long) = eventCount(JsonField.of(eventCount))

            /**
             * Sets [Builder.eventCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.eventCount] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun eventCount(eventCount: JsonField<Long>) = apply { this.eventCount = eventCount }

            /** List of distinct products involved in the session. */
            fun products(products: List<String>) = products(JsonField.of(products))

            /**
             * Sets [Builder.products] to an arbitrary JSON value.
             *
             * You should usually call [Builder.products] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun products(products: JsonField<List<String>>) = apply {
                this.products = products.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [products].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addProduct(product: String) = apply {
                products =
                    (products ?: JsonField.of(mutableListOf())).also {
                        checkKnown("products", it).add(product)
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
             * Returns an immutable instance of [Meta].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .eventCount()
             * .products()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Meta =
                Meta(
                    checkRequired("eventCount", eventCount),
                    checkRequired("products", products).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Meta = apply {
            if (validated) {
                return@apply
            }

            eventCount()
            products()
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
            (if (eventCount.asKnown().isPresent) 1 else 0) +
                (products.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Meta &&
                eventCount == other.eventCount &&
                products == other.products &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(eventCount, products, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Meta{eventCount=$eventCount, products=$products, additionalProperties=$additionalProperties}"
    }

    class Root
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val children: JsonField<List<JsonValue>>,
        private val cost: JsonField<Cost>,
        private val eventName: JsonField<String>,
        private val links: JsonField<Links>,
        private val product: JsonField<String>,
        private val record: JsonField<Record>,
        private val relationship: JsonField<Relationship>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("children")
            @ExcludeMissing
            children: JsonField<List<JsonValue>> = JsonMissing.of(),
            @JsonProperty("cost") @ExcludeMissing cost: JsonField<Cost> = JsonMissing.of(),
            @JsonProperty("event_name")
            @ExcludeMissing
            eventName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("links") @ExcludeMissing links: JsonField<Links> = JsonMissing.of(),
            @JsonProperty("product") @ExcludeMissing product: JsonField<String> = JsonMissing.of(),
            @JsonProperty("record") @ExcludeMissing record: JsonField<Record> = JsonMissing.of(),
            @JsonProperty("relationship")
            @ExcludeMissing
            relationship: JsonField<Relationship> = JsonMissing.of(),
        ) : this(
            id,
            children,
            cost,
            eventName,
            links,
            product,
            record,
            relationship,
            mutableMapOf(),
        )

        /**
         * Event identifier.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Child events in the session tree.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun children(): List<JsonValue> = children.getRequired("children")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun cost(): Cost = cost.getRequired("cost")

        /**
         * Name of the event type.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun eventName(): String = eventName.getRequired("event_name")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun links(): Links = links.getRequired("links")

        /**
         * Product that generated this event.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun product(): String = product.getRequired("product")

        /**
         * The underlying detail record data. Contents vary by record type.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun record(): Record = record.getRequired("record")

        /**
         * Relationship to the parent node, null for root.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun relationship(): Optional<Relationship> = relationship.getOptional("relationship")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [children].
         *
         * Unlike [children], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("children")
        @ExcludeMissing
        fun _children(): JsonField<List<JsonValue>> = children

        /**
         * Returns the raw JSON value of [cost].
         *
         * Unlike [cost], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cost") @ExcludeMissing fun _cost(): JsonField<Cost> = cost

        /**
         * Returns the raw JSON value of [eventName].
         *
         * Unlike [eventName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("event_name") @ExcludeMissing fun _eventName(): JsonField<String> = eventName

        /**
         * Returns the raw JSON value of [links].
         *
         * Unlike [links], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("links") @ExcludeMissing fun _links(): JsonField<Links> = links

        /**
         * Returns the raw JSON value of [product].
         *
         * Unlike [product], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("product") @ExcludeMissing fun _product(): JsonField<String> = product

        /**
         * Returns the raw JSON value of [record].
         *
         * Unlike [record], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record") @ExcludeMissing fun _record(): JsonField<Record> = record

        /**
         * Returns the raw JSON value of [relationship].
         *
         * Unlike [relationship], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("relationship")
        @ExcludeMissing
        fun _relationship(): JsonField<Relationship> = relationship

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
             * Returns a mutable builder for constructing an instance of [Root].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .children()
             * .cost()
             * .eventName()
             * .links()
             * .product()
             * .record()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Root]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var children: JsonField<MutableList<JsonValue>>? = null
            private var cost: JsonField<Cost>? = null
            private var eventName: JsonField<String>? = null
            private var links: JsonField<Links>? = null
            private var product: JsonField<String>? = null
            private var record: JsonField<Record>? = null
            private var relationship: JsonField<Relationship> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(root: Root) = apply {
                id = root.id
                children = root.children.map { it.toMutableList() }
                cost = root.cost
                eventName = root.eventName
                links = root.links
                product = root.product
                record = root.record
                relationship = root.relationship
                additionalProperties = root.additionalProperties.toMutableMap()
            }

            /** Event identifier. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Child events in the session tree. */
            fun children(children: List<JsonValue>) = children(JsonField.of(children))

            /**
             * Sets [Builder.children] to an arbitrary JSON value.
             *
             * You should usually call [Builder.children] with a well-typed `List<JsonValue>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun children(children: JsonField<List<JsonValue>>) = apply {
                this.children = children.map { it.toMutableList() }
            }

            /**
             * Adds a single [JsonValue] to [children].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addChild(child: JsonValue) = apply {
                children =
                    (children ?: JsonField.of(mutableListOf())).also {
                        checkKnown("children", it).add(child)
                    }
            }

            fun cost(cost: Cost) = cost(JsonField.of(cost))

            /**
             * Sets [Builder.cost] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cost] with a well-typed [Cost] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun cost(cost: JsonField<Cost>) = apply { this.cost = cost }

            /** Name of the event type. */
            fun eventName(eventName: String) = eventName(JsonField.of(eventName))

            /**
             * Sets [Builder.eventName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.eventName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun eventName(eventName: JsonField<String>) = apply { this.eventName = eventName }

            fun links(links: Links) = links(JsonField.of(links))

            /**
             * Sets [Builder.links] to an arbitrary JSON value.
             *
             * You should usually call [Builder.links] with a well-typed [Links] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun links(links: JsonField<Links>) = apply { this.links = links }

            /** Product that generated this event. */
            fun product(product: String) = product(JsonField.of(product))

            /**
             * Sets [Builder.product] to an arbitrary JSON value.
             *
             * You should usually call [Builder.product] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun product(product: JsonField<String>) = apply { this.product = product }

            /** The underlying detail record data. Contents vary by record type. */
            fun record(record: Record) = record(JsonField.of(record))

            /**
             * Sets [Builder.record] to an arbitrary JSON value.
             *
             * You should usually call [Builder.record] with a well-typed [Record] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun record(record: JsonField<Record>) = apply { this.record = record }

            /** Relationship to the parent node, null for root. */
            fun relationship(relationship: Relationship?) =
                relationship(JsonField.ofNullable(relationship))

            /** Alias for calling [Builder.relationship] with `relationship.orElse(null)`. */
            fun relationship(relationship: Optional<Relationship>) =
                relationship(relationship.getOrNull())

            /**
             * Sets [Builder.relationship] to an arbitrary JSON value.
             *
             * You should usually call [Builder.relationship] with a well-typed [Relationship] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun relationship(relationship: JsonField<Relationship>) = apply {
                this.relationship = relationship
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
             * Returns an immutable instance of [Root].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .children()
             * .cost()
             * .eventName()
             * .links()
             * .product()
             * .record()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Root =
                Root(
                    checkRequired("id", id),
                    checkRequired("children", children).map { it.toImmutable() },
                    checkRequired("cost", cost),
                    checkRequired("eventName", eventName),
                    checkRequired("links", links),
                    checkRequired("product", product),
                    checkRequired("record", record),
                    relationship,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Root = apply {
            if (validated) {
                return@apply
            }

            id()
            children()
            cost().validate()
            eventName()
            links().validate()
            product()
            record().validate()
            relationship().ifPresent { it.validate() }
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
                (children.asKnown().getOrNull()?.size ?: 0) +
                (cost.asKnown().getOrNull()?.validity() ?: 0) +
                (if (eventName.asKnown().isPresent) 1 else 0) +
                (links.asKnown().getOrNull()?.validity() ?: 0) +
                (if (product.asKnown().isPresent) 1 else 0) +
                (record.asKnown().getOrNull()?.validity() ?: 0) +
                (relationship.asKnown().getOrNull()?.validity() ?: 0)

        class Cost
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val cumulativeCost: JsonField<String>,
            private val currency: JsonField<String>,
            private val eventCost: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("cumulative_cost")
                @ExcludeMissing
                cumulativeCost: JsonField<String> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<String> = JsonMissing.of(),
                @JsonProperty("event_cost")
                @ExcludeMissing
                eventCost: JsonField<String> = JsonMissing.of(),
            ) : this(cumulativeCost, currency, eventCost, mutableMapOf())

            /**
             * Cumulative cost including all descendants.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun cumulativeCost(): String = cumulativeCost.getRequired("cumulative_cost")

            /**
             * ISO 4217 currency code.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun currency(): String = currency.getRequired("currency")

            /**
             * Cost of this individual event.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun eventCost(): String = eventCost.getRequired("event_cost")

            /**
             * Returns the raw JSON value of [cumulativeCost].
             *
             * Unlike [cumulativeCost], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("cumulative_cost")
            @ExcludeMissing
            fun _cumulativeCost(): JsonField<String> = cumulativeCost

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

            /**
             * Returns the raw JSON value of [eventCost].
             *
             * Unlike [eventCost], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("event_cost")
            @ExcludeMissing
            fun _eventCost(): JsonField<String> = eventCost

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
                 * Returns a mutable builder for constructing an instance of [Cost].
                 *
                 * The following fields are required:
                 * ```java
                 * .cumulativeCost()
                 * .currency()
                 * .eventCost()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Cost]. */
            class Builder internal constructor() {

                private var cumulativeCost: JsonField<String>? = null
                private var currency: JsonField<String>? = null
                private var eventCost: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(cost: Cost) = apply {
                    cumulativeCost = cost.cumulativeCost
                    currency = cost.currency
                    eventCost = cost.eventCost
                    additionalProperties = cost.additionalProperties.toMutableMap()
                }

                /** Cumulative cost including all descendants. */
                fun cumulativeCost(cumulativeCost: String) =
                    cumulativeCost(JsonField.of(cumulativeCost))

                /**
                 * Sets [Builder.cumulativeCost] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cumulativeCost] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun cumulativeCost(cumulativeCost: JsonField<String>) = apply {
                    this.cumulativeCost = cumulativeCost
                }

                /** ISO 4217 currency code. */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** Cost of this individual event. */
                fun eventCost(eventCost: String) = eventCost(JsonField.of(eventCost))

                /**
                 * Sets [Builder.eventCost] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.eventCost] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun eventCost(eventCost: JsonField<String>) = apply { this.eventCost = eventCost }

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
                 * Returns an immutable instance of [Cost].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .cumulativeCost()
                 * .currency()
                 * .eventCost()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Cost =
                    Cost(
                        checkRequired("cumulativeCost", cumulativeCost),
                        checkRequired("currency", currency),
                        checkRequired("eventCost", eventCost),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Cost = apply {
                if (validated) {
                    return@apply
                }

                cumulativeCost()
                currency()
                eventCost()
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
                (if (cumulativeCost.asKnown().isPresent) 1 else 0) +
                    (if (currency.asKnown().isPresent) 1 else 0) +
                    (if (eventCost.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Cost &&
                    cumulativeCost == other.cumulativeCost &&
                    currency == other.currency &&
                    eventCost == other.eventCost &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(cumulativeCost, currency, eventCost, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Cost{cumulativeCost=$cumulativeCost, currency=$currency, eventCost=$eventCost, additionalProperties=$additionalProperties}"
        }

        class Links
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val records: JsonField<String>,
            private val self: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("records")
                @ExcludeMissing
                records: JsonField<String> = JsonMissing.of(),
                @JsonProperty("self") @ExcludeMissing self: JsonField<String> = JsonMissing.of(),
            ) : this(records, self, mutableMapOf())

            /**
             * Link to the underlying detail records.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun records(): String = records.getRequired("records")

            /**
             * Link to this session analysis node.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun self(): String = self.getRequired("self")

            /**
             * Returns the raw JSON value of [records].
             *
             * Unlike [records], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("records") @ExcludeMissing fun _records(): JsonField<String> = records

            /**
             * Returns the raw JSON value of [self].
             *
             * Unlike [self], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("self") @ExcludeMissing fun _self(): JsonField<String> = self

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
                 * Returns a mutable builder for constructing an instance of [Links].
                 *
                 * The following fields are required:
                 * ```java
                 * .records()
                 * .self()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Links]. */
            class Builder internal constructor() {

                private var records: JsonField<String>? = null
                private var self: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(links: Links) = apply {
                    records = links.records
                    self = links.self
                    additionalProperties = links.additionalProperties.toMutableMap()
                }

                /** Link to the underlying detail records. */
                fun records(records: String) = records(JsonField.of(records))

                /**
                 * Sets [Builder.records] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.records] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun records(records: JsonField<String>) = apply { this.records = records }

                /** Link to this session analysis node. */
                fun self(self: String) = self(JsonField.of(self))

                /**
                 * Sets [Builder.self] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.self] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun self(self: JsonField<String>) = apply { this.self = self }

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
                 * Returns an immutable instance of [Links].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .records()
                 * .self()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Links =
                    Links(
                        checkRequired("records", records),
                        checkRequired("self", self),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Links = apply {
                if (validated) {
                    return@apply
                }

                records()
                self()
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
                (if (records.asKnown().isPresent) 1 else 0) +
                    (if (self.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Links &&
                    records == other.records &&
                    self == other.self &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(records, self, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Links{records=$records, self=$self, additionalProperties=$additionalProperties}"
        }

        /** The underlying detail record data. Contents vary by record type. */
        class Record
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

                /** Returns a mutable builder for constructing an instance of [Record]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Record]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(record: Record) = apply {
                    additionalProperties = record.additionalProperties.toMutableMap()
                }

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
                 * Returns an immutable instance of [Record].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Record = Record(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): Record = apply {
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

                return other is Record && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Record{additionalProperties=$additionalProperties}"
        }

        /** Relationship to the parent node, null for root. */
        class Relationship
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val parentId: JsonField<String>,
            private val type: JsonField<String>,
            private val via: JsonField<Via>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("parent_id")
                @ExcludeMissing
                parentId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
                @JsonProperty("via") @ExcludeMissing via: JsonField<Via> = JsonMissing.of(),
            ) : this(parentId, type, via, mutableMapOf())

            /**
             * Identifier of the parent event.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun parentId(): String = parentId.getRequired("parent_id")

            /**
             * Relationship type identifier.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): String = type.getRequired("type")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun via(): Via = via.getRequired("via")

            /**
             * Returns the raw JSON value of [parentId].
             *
             * Unlike [parentId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("parent_id") @ExcludeMissing fun _parentId(): JsonField<String> = parentId

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

            /**
             * Returns the raw JSON value of [via].
             *
             * Unlike [via], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("via") @ExcludeMissing fun _via(): JsonField<Via> = via

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
                 * Returns a mutable builder for constructing an instance of [Relationship].
                 *
                 * The following fields are required:
                 * ```java
                 * .parentId()
                 * .type()
                 * .via()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Relationship]. */
            class Builder internal constructor() {

                private var parentId: JsonField<String>? = null
                private var type: JsonField<String>? = null
                private var via: JsonField<Via>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(relationship: Relationship) = apply {
                    parentId = relationship.parentId
                    type = relationship.type
                    via = relationship.via
                    additionalProperties = relationship.additionalProperties.toMutableMap()
                }

                /** Identifier of the parent event. */
                fun parentId(parentId: String) = parentId(JsonField.of(parentId))

                /**
                 * Sets [Builder.parentId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.parentId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun parentId(parentId: JsonField<String>) = apply { this.parentId = parentId }

                /** Relationship type identifier. */
                fun type(type: String) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<String>) = apply { this.type = type }

                fun via(via: Via) = via(JsonField.of(via))

                /**
                 * Sets [Builder.via] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.via] with a well-typed [Via] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun via(via: JsonField<Via>) = apply { this.via = via }

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
                 * Returns an immutable instance of [Relationship].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .parentId()
                 * .type()
                 * .via()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Relationship =
                    Relationship(
                        checkRequired("parentId", parentId),
                        checkRequired("type", type),
                        checkRequired("via", via),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Relationship = apply {
                if (validated) {
                    return@apply
                }

                parentId()
                type()
                via().validate()
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
                (if (parentId.asKnown().isPresent) 1 else 0) +
                    (if (type.asKnown().isPresent) 1 else 0) +
                    (via.asKnown().getOrNull()?.validity() ?: 0)

            class Via
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val localField: JsonField<String>,
                private val parentField: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("local_field")
                    @ExcludeMissing
                    localField: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("parent_field")
                    @ExcludeMissing
                    parentField: JsonField<String> = JsonMissing.of(),
                ) : this(localField, parentField, mutableMapOf())

                /**
                 * Field name on the child record.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun localField(): String = localField.getRequired("local_field")

                /**
                 * Field name on the parent record.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun parentField(): String = parentField.getRequired("parent_field")

                /**
                 * Returns the raw JSON value of [localField].
                 *
                 * Unlike [localField], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("local_field")
                @ExcludeMissing
                fun _localField(): JsonField<String> = localField

                /**
                 * Returns the raw JSON value of [parentField].
                 *
                 * Unlike [parentField], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("parent_field")
                @ExcludeMissing
                fun _parentField(): JsonField<String> = parentField

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
                     * Returns a mutable builder for constructing an instance of [Via].
                     *
                     * The following fields are required:
                     * ```java
                     * .localField()
                     * .parentField()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Via]. */
                class Builder internal constructor() {

                    private var localField: JsonField<String>? = null
                    private var parentField: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(via: Via) = apply {
                        localField = via.localField
                        parentField = via.parentField
                        additionalProperties = via.additionalProperties.toMutableMap()
                    }

                    /** Field name on the child record. */
                    fun localField(localField: String) = localField(JsonField.of(localField))

                    /**
                     * Sets [Builder.localField] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.localField] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun localField(localField: JsonField<String>) = apply {
                        this.localField = localField
                    }

                    /** Field name on the parent record. */
                    fun parentField(parentField: String) = parentField(JsonField.of(parentField))

                    /**
                     * Sets [Builder.parentField] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.parentField] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun parentField(parentField: JsonField<String>) = apply {
                        this.parentField = parentField
                    }

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
                     * Returns an immutable instance of [Via].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .localField()
                     * .parentField()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Via =
                        Via(
                            checkRequired("localField", localField),
                            checkRequired("parentField", parentField),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Via = apply {
                    if (validated) {
                        return@apply
                    }

                    localField()
                    parentField()
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
                    (if (localField.asKnown().isPresent) 1 else 0) +
                        (if (parentField.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Via &&
                        localField == other.localField &&
                        parentField == other.parentField &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(localField, parentField, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Via{localField=$localField, parentField=$parentField, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Relationship &&
                    parentId == other.parentId &&
                    type == other.type &&
                    via == other.via &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(parentId, type, via, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Relationship{parentId=$parentId, type=$type, via=$via, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Root &&
                id == other.id &&
                children == other.children &&
                cost == other.cost &&
                eventName == other.eventName &&
                links == other.links &&
                product == other.product &&
                record == other.record &&
                relationship == other.relationship &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                children,
                cost,
                eventName,
                links,
                product,
                record,
                relationship,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Root{id=$id, children=$children, cost=$cost, eventName=$eventName, links=$links, product=$product, record=$record, relationship=$relationship, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SessionAnalysisRetrieveResponse &&
            cost == other.cost &&
            createdAt == other.createdAt &&
            meta == other.meta &&
            root == other.root &&
            sessionId == other.sessionId &&
            status == other.status &&
            completedAt == other.completedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            cost,
            createdAt,
            meta,
            root,
            sessionId,
            status,
            completedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SessionAnalysisRetrieveResponse{cost=$cost, createdAt=$createdAt, meta=$meta, root=$root, sessionId=$sessionId, status=$status, completedAt=$completedAt, additionalProperties=$additionalProperties}"
}
