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
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class SessionAnalysisRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val cost: JsonField<Cost>,
    private val meta: JsonField<Meta>,
    private val root: JsonField<EventNode>,
    private val sessionId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("cost") @ExcludeMissing cost: JsonField<Cost> = JsonMissing.of(),
        @JsonProperty("meta") @ExcludeMissing meta: JsonField<Meta> = JsonMissing.of(),
        @JsonProperty("root") @ExcludeMissing root: JsonField<EventNode> = JsonMissing.of(),
        @JsonProperty("session_id") @ExcludeMissing sessionId: JsonField<String> = JsonMissing.of(),
    ) : this(cost, meta, root, sessionId, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cost(): Cost = cost.getRequired("cost")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun meta(): Meta = meta.getRequired("meta")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun root(): EventNode = root.getRequired("root")

    /**
     * Identifier for the analyzed session.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sessionId(): String = sessionId.getRequired("session_id")

    /**
     * Returns the raw JSON value of [cost].
     *
     * Unlike [cost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cost") @ExcludeMissing fun _cost(): JsonField<Cost> = cost

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
    @JsonProperty("root") @ExcludeMissing fun _root(): JsonField<EventNode> = root

    /**
     * Returns the raw JSON value of [sessionId].
     *
     * Unlike [sessionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("session_id") @ExcludeMissing fun _sessionId(): JsonField<String> = sessionId

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
         * .meta()
         * .root()
         * .sessionId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SessionAnalysisRetrieveResponse]. */
    class Builder internal constructor() {

        private var cost: JsonField<Cost>? = null
        private var meta: JsonField<Meta>? = null
        private var root: JsonField<EventNode>? = null
        private var sessionId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sessionAnalysisRetrieveResponse: SessionAnalysisRetrieveResponse) =
            apply {
                cost = sessionAnalysisRetrieveResponse.cost
                meta = sessionAnalysisRetrieveResponse.meta
                root = sessionAnalysisRetrieveResponse.root
                sessionId = sessionAnalysisRetrieveResponse.sessionId
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

        fun meta(meta: Meta) = meta(JsonField.of(meta))

        /**
         * Sets [Builder.meta] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meta] with a well-typed [Meta] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun meta(meta: JsonField<Meta>) = apply { this.meta = meta }

        fun root(root: EventNode) = root(JsonField.of(root))

        /**
         * Sets [Builder.root] to an arbitrary JSON value.
         *
         * You should usually call [Builder.root] with a well-typed [EventNode] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun root(root: JsonField<EventNode>) = apply { this.root = root }

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
         * .meta()
         * .root()
         * .sessionId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SessionAnalysisRetrieveResponse =
            SessionAnalysisRetrieveResponse(
                checkRequired("cost", cost),
                checkRequired("meta", meta),
                checkRequired("root", root),
                checkRequired("sessionId", sessionId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SessionAnalysisRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        cost().validate()
        meta().validate()
        root().validate()
        sessionId()
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
            (meta.asKnown().getOrNull()?.validity() ?: 0) +
            (root.asKnown().getOrNull()?.validity() ?: 0) +
            (if (sessionId.asKnown().isPresent) 1 else 0)

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SessionAnalysisRetrieveResponse &&
            cost == other.cost &&
            meta == other.meta &&
            root == other.root &&
            sessionId == other.sessionId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(cost, meta, root, sessionId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SessionAnalysisRetrieveResponse{cost=$cost, meta=$meta, root=$root, sessionId=$sessionId, additionalProperties=$additionalProperties}"
}
