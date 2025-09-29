// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.bundlepricing.userbundles

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.Params
import com.telnyx.api.core.checkKnown
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Creates multiple user bundles for the user. */
class UserBundleCreateParams
private constructor(
    private val authorizationBearer: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Authenticates the request with your Telnyx API V2 KEY */
    fun authorizationBearer(): Optional<String> = Optional.ofNullable(authorizationBearer)

    /**
     * Idempotency key for the request. Can be any UUID, but should always be unique for each
     * request.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun idempotencyKey(): Optional<String> = body.idempotencyKey()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun items(): Optional<List<Item>> = body.items()

    /**
     * Returns the raw JSON value of [idempotencyKey].
     *
     * Unlike [idempotencyKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _idempotencyKey(): JsonField<String> = body._idempotencyKey()

    /**
     * Returns the raw JSON value of [items].
     *
     * Unlike [items], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _items(): JsonField<List<Item>> = body._items()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): UserBundleCreateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [UserBundleCreateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UserBundleCreateParams]. */
    class Builder internal constructor() {

        private var authorizationBearer: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(userBundleCreateParams: UserBundleCreateParams) = apply {
            authorizationBearer = userBundleCreateParams.authorizationBearer
            body = userBundleCreateParams.body.toBuilder()
            additionalHeaders = userBundleCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = userBundleCreateParams.additionalQueryParams.toBuilder()
        }

        /** Authenticates the request with your Telnyx API V2 KEY */
        fun authorizationBearer(authorizationBearer: String?) = apply {
            this.authorizationBearer = authorizationBearer
        }

        /**
         * Alias for calling [Builder.authorizationBearer] with `authorizationBearer.orElse(null)`.
         */
        fun authorizationBearer(authorizationBearer: Optional<String>) =
            authorizationBearer(authorizationBearer.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [idempotencyKey]
         * - [items]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Idempotency key for the request. Can be any UUID, but should always be unique for each
         * request.
         */
        fun idempotencyKey(idempotencyKey: String) = apply { body.idempotencyKey(idempotencyKey) }

        /**
         * Sets [Builder.idempotencyKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idempotencyKey] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
            body.idempotencyKey(idempotencyKey)
        }

        fun items(items: List<Item>) = apply { body.items(items) }

        /**
         * Sets [Builder.items] to an arbitrary JSON value.
         *
         * You should usually call [Builder.items] with a well-typed `List<Item>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun items(items: JsonField<List<Item>>) = apply { body.items(items) }

        /**
         * Adds a single [Item] to [items].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addItem(item: Item) = apply { body.addItem(item) }

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
         * Returns an immutable instance of [UserBundleCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UserBundleCreateParams =
            UserBundleCreateParams(
                authorizationBearer,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers =
        Headers.builder()
            .apply {
                authorizationBearer?.let { put("authorization_bearer", it) }
                putAll(additionalHeaders)
            }
            .build()

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val idempotencyKey: JsonField<String>,
        private val items: JsonField<List<Item>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("idempotency_key")
            @ExcludeMissing
            idempotencyKey: JsonField<String> = JsonMissing.of(),
            @JsonProperty("items") @ExcludeMissing items: JsonField<List<Item>> = JsonMissing.of(),
        ) : this(idempotencyKey, items, mutableMapOf())

        /**
         * Idempotency key for the request. Can be any UUID, but should always be unique for each
         * request.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun idempotencyKey(): Optional<String> = idempotencyKey.getOptional("idempotency_key")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun items(): Optional<List<Item>> = items.getOptional("items")

        /**
         * Returns the raw JSON value of [idempotencyKey].
         *
         * Unlike [idempotencyKey], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("idempotency_key")
        @ExcludeMissing
        fun _idempotencyKey(): JsonField<String> = idempotencyKey

        /**
         * Returns the raw JSON value of [items].
         *
         * Unlike [items], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("items") @ExcludeMissing fun _items(): JsonField<List<Item>> = items

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

            private var idempotencyKey: JsonField<String> = JsonMissing.of()
            private var items: JsonField<MutableList<Item>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                idempotencyKey = body.idempotencyKey
                items = body.items.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Idempotency key for the request. Can be any UUID, but should always be unique for
             * each request.
             */
            fun idempotencyKey(idempotencyKey: String) =
                idempotencyKey(JsonField.of(idempotencyKey))

            /**
             * Sets [Builder.idempotencyKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idempotencyKey] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
                this.idempotencyKey = idempotencyKey
            }

            fun items(items: List<Item>) = items(JsonField.of(items))

            /**
             * Sets [Builder.items] to an arbitrary JSON value.
             *
             * You should usually call [Builder.items] with a well-typed `List<Item>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun items(items: JsonField<List<Item>>) = apply {
                this.items = items.map { it.toMutableList() }
            }

            /**
             * Adds a single [Item] to [items].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addItem(item: Item) = apply {
                items =
                    (items ?: JsonField.of(mutableListOf())).also {
                        checkKnown("items", it).add(item)
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    idempotencyKey,
                    (items ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            idempotencyKey()
            items().ifPresent { it.forEach { it.validate() } }
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
            (if (idempotencyKey.asKnown().isPresent) 1 else 0) +
                (items.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                idempotencyKey == other.idempotencyKey &&
                items == other.items &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(idempotencyKey, items, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{idempotencyKey=$idempotencyKey, items=$items, additionalProperties=$additionalProperties}"
    }

    class Item
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val billingBundleId: JsonField<String>,
        private val quantity: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("billing_bundle_id")
            @ExcludeMissing
            billingBundleId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("quantity") @ExcludeMissing quantity: JsonField<Long> = JsonMissing.of(),
        ) : this(billingBundleId, quantity, mutableMapOf())

        /**
         * Quantity of user bundles to order.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun billingBundleId(): String = billingBundleId.getRequired("billing_bundle_id")

        /**
         * Quantity of user bundles to order.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun quantity(): Long = quantity.getRequired("quantity")

        /**
         * Returns the raw JSON value of [billingBundleId].
         *
         * Unlike [billingBundleId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("billing_bundle_id")
        @ExcludeMissing
        fun _billingBundleId(): JsonField<String> = billingBundleId

        /**
         * Returns the raw JSON value of [quantity].
         *
         * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Long> = quantity

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
             * Returns a mutable builder for constructing an instance of [Item].
             *
             * The following fields are required:
             * ```java
             * .billingBundleId()
             * .quantity()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Item]. */
        class Builder internal constructor() {

            private var billingBundleId: JsonField<String>? = null
            private var quantity: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(item: Item) = apply {
                billingBundleId = item.billingBundleId
                quantity = item.quantity
                additionalProperties = item.additionalProperties.toMutableMap()
            }

            /** Quantity of user bundles to order. */
            fun billingBundleId(billingBundleId: String) =
                billingBundleId(JsonField.of(billingBundleId))

            /**
             * Sets [Builder.billingBundleId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingBundleId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun billingBundleId(billingBundleId: JsonField<String>) = apply {
                this.billingBundleId = billingBundleId
            }

            /** Quantity of user bundles to order. */
            fun quantity(quantity: Long) = quantity(JsonField.of(quantity))

            /**
             * Sets [Builder.quantity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.quantity] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun quantity(quantity: JsonField<Long>) = apply { this.quantity = quantity }

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
             * Returns an immutable instance of [Item].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .billingBundleId()
             * .quantity()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Item =
                Item(
                    checkRequired("billingBundleId", billingBundleId),
                    checkRequired("quantity", quantity),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Item = apply {
            if (validated) {
                return@apply
            }

            billingBundleId()
            quantity()
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
            (if (billingBundleId.asKnown().isPresent) 1 else 0) +
                (if (quantity.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Item &&
                billingBundleId == other.billingBundleId &&
                quantity == other.quantity &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(billingBundleId, quantity, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Item{billingBundleId=$billingBundleId, quantity=$quantity, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UserBundleCreateParams &&
            authorizationBearer == other.authorizationBearer &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(authorizationBearer, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "UserBundleCreateParams{authorizationBearer=$authorizationBearer, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
