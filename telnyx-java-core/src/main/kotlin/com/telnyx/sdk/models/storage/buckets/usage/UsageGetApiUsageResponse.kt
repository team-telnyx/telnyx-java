// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.buckets.usage

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
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class UsageGetApiUsageResponse
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

        /** Returns a mutable builder for constructing an instance of [UsageGetApiUsageResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UsageGetApiUsageResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(usageGetApiUsageResponse: UsageGetApiUsageResponse) = apply {
            data = usageGetApiUsageResponse.data.map { it.toMutableList() }
            additionalProperties = usageGetApiUsageResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [UsageGetApiUsageResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UsageGetApiUsageResponse =
            UsageGetApiUsageResponse(
                (data ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): UsageGetApiUsageResponse = apply {
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
        private val categories: JsonField<List<Category>>,
        private val timestamp: JsonField<OffsetDateTime>,
        private val total: JsonField<Total>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("categories")
            @ExcludeMissing
            categories: JsonField<List<Category>> = JsonMissing.of(),
            @JsonProperty("timestamp")
            @ExcludeMissing
            timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("total") @ExcludeMissing total: JsonField<Total> = JsonMissing.of(),
        ) : this(categories, timestamp, total, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun categories(): Optional<List<Category>> = categories.getOptional("categories")

        /**
         * The time the usage was recorded
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timestamp(): Optional<OffsetDateTime> = timestamp.getOptional("timestamp")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun total(): Optional<Total> = total.getOptional("total")

        /**
         * Returns the raw JSON value of [categories].
         *
         * Unlike [categories], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("categories")
        @ExcludeMissing
        fun _categories(): JsonField<List<Category>> = categories

        /**
         * Returns the raw JSON value of [timestamp].
         *
         * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timestamp")
        @ExcludeMissing
        fun _timestamp(): JsonField<OffsetDateTime> = timestamp

        /**
         * Returns the raw JSON value of [total].
         *
         * Unlike [total], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<Total> = total

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

            private var categories: JsonField<MutableList<Category>>? = null
            private var timestamp: JsonField<OffsetDateTime> = JsonMissing.of()
            private var total: JsonField<Total> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                categories = data.categories.map { it.toMutableList() }
                timestamp = data.timestamp
                total = data.total
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun categories(categories: List<Category>) = categories(JsonField.of(categories))

            /**
             * Sets [Builder.categories] to an arbitrary JSON value.
             *
             * You should usually call [Builder.categories] with a well-typed `List<Category>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun categories(categories: JsonField<List<Category>>) = apply {
                this.categories = categories.map { it.toMutableList() }
            }

            /**
             * Adds a single [Category] to [categories].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCategory(category: Category) = apply {
                categories =
                    (categories ?: JsonField.of(mutableListOf())).also {
                        checkKnown("categories", it).add(category)
                    }
            }

            /** The time the usage was recorded */
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

            fun total(total: Total) = total(JsonField.of(total))

            /**
             * Sets [Builder.total] to an arbitrary JSON value.
             *
             * You should usually call [Builder.total] with a well-typed [Total] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun total(total: JsonField<Total>) = apply { this.total = total }

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
                    (categories ?: JsonMissing.of()).map { it.toImmutable() },
                    timestamp,
                    total,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            categories().ifPresent { it.forEach { it.validate() } }
            timestamp()
            total().ifPresent { it.validate() }
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
            (categories.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (timestamp.asKnown().isPresent) 1 else 0) +
                (total.asKnown().getOrNull()?.validity() ?: 0)

        class Category
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val bytesReceived: JsonField<Long>,
            private val bytesSent: JsonField<Long>,
            private val category: JsonField<InnerCategory>,
            private val ops: JsonField<Long>,
            private val successfulOps: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("bytes_received")
                @ExcludeMissing
                bytesReceived: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("bytes_sent")
                @ExcludeMissing
                bytesSent: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("category")
                @ExcludeMissing
                category: JsonField<InnerCategory> = JsonMissing.of(),
                @JsonProperty("ops") @ExcludeMissing ops: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("successful_ops")
                @ExcludeMissing
                successfulOps: JsonField<Long> = JsonMissing.of(),
            ) : this(bytesReceived, bytesSent, category, ops, successfulOps, mutableMapOf())

            /**
             * The number of bytes received
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun bytesReceived(): Optional<Long> = bytesReceived.getOptional("bytes_received")

            /**
             * The number of bytes sent
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun bytesSent(): Optional<Long> = bytesSent.getOptional("bytes_sent")

            /**
             * The category of the bucket operation
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun category(): Optional<InnerCategory> = category.getOptional("category")

            /**
             * The number of operations
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun ops(): Optional<Long> = ops.getOptional("ops")

            /**
             * The number of successful operations
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun successfulOps(): Optional<Long> = successfulOps.getOptional("successful_ops")

            /**
             * Returns the raw JSON value of [bytesReceived].
             *
             * Unlike [bytesReceived], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("bytes_received")
            @ExcludeMissing
            fun _bytesReceived(): JsonField<Long> = bytesReceived

            /**
             * Returns the raw JSON value of [bytesSent].
             *
             * Unlike [bytesSent], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("bytes_sent")
            @ExcludeMissing
            fun _bytesSent(): JsonField<Long> = bytesSent

            /**
             * Returns the raw JSON value of [category].
             *
             * Unlike [category], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("category")
            @ExcludeMissing
            fun _category(): JsonField<InnerCategory> = category

            /**
             * Returns the raw JSON value of [ops].
             *
             * Unlike [ops], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("ops") @ExcludeMissing fun _ops(): JsonField<Long> = ops

            /**
             * Returns the raw JSON value of [successfulOps].
             *
             * Unlike [successfulOps], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("successful_ops")
            @ExcludeMissing
            fun _successfulOps(): JsonField<Long> = successfulOps

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

                /** Returns a mutable builder for constructing an instance of [Category]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Category]. */
            class Builder internal constructor() {

                private var bytesReceived: JsonField<Long> = JsonMissing.of()
                private var bytesSent: JsonField<Long> = JsonMissing.of()
                private var category: JsonField<InnerCategory> = JsonMissing.of()
                private var ops: JsonField<Long> = JsonMissing.of()
                private var successfulOps: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(category: Category) = apply {
                    bytesReceived = category.bytesReceived
                    bytesSent = category.bytesSent
                    this.category = category.category
                    ops = category.ops
                    successfulOps = category.successfulOps
                    additionalProperties = category.additionalProperties.toMutableMap()
                }

                /** The number of bytes received */
                fun bytesReceived(bytesReceived: Long) = bytesReceived(JsonField.of(bytesReceived))

                /**
                 * Sets [Builder.bytesReceived] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.bytesReceived] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun bytesReceived(bytesReceived: JsonField<Long>) = apply {
                    this.bytesReceived = bytesReceived
                }

                /** The number of bytes sent */
                fun bytesSent(bytesSent: Long) = bytesSent(JsonField.of(bytesSent))

                /**
                 * Sets [Builder.bytesSent] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.bytesSent] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun bytesSent(bytesSent: JsonField<Long>) = apply { this.bytesSent = bytesSent }

                /** The category of the bucket operation */
                fun category(category: InnerCategory) = category(JsonField.of(category))

                /**
                 * Sets [Builder.category] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.category] with a well-typed [InnerCategory]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun category(category: JsonField<InnerCategory>) = apply {
                    this.category = category
                }

                /** The number of operations */
                fun ops(ops: Long) = ops(JsonField.of(ops))

                /**
                 * Sets [Builder.ops] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ops] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun ops(ops: JsonField<Long>) = apply { this.ops = ops }

                /** The number of successful operations */
                fun successfulOps(successfulOps: Long) = successfulOps(JsonField.of(successfulOps))

                /**
                 * Sets [Builder.successfulOps] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.successfulOps] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun successfulOps(successfulOps: JsonField<Long>) = apply {
                    this.successfulOps = successfulOps
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
                 * Returns an immutable instance of [Category].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Category =
                    Category(
                        bytesReceived,
                        bytesSent,
                        category,
                        ops,
                        successfulOps,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Category = apply {
                if (validated) {
                    return@apply
                }

                bytesReceived()
                bytesSent()
                category().ifPresent { it.validate() }
                ops()
                successfulOps()
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
                (if (bytesReceived.asKnown().isPresent) 1 else 0) +
                    (if (bytesSent.asKnown().isPresent) 1 else 0) +
                    (category.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (ops.asKnown().isPresent) 1 else 0) +
                    (if (successfulOps.asKnown().isPresent) 1 else 0)

            /** The category of the bucket operation */
            class InnerCategory
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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

                    @JvmField val LIST_BUCKET = of("list_bucket")

                    @JvmField val LIST_BUCKETS = of("list_buckets")

                    @JvmField val GET_BUCKET_LOCATION = of("get-bucket_location")

                    @JvmField val CREATE_BUCKET = of("create_bucket")

                    @JvmField val STAT_BUCKET = of("stat_bucket")

                    @JvmField val GET_BUCKET_VERSIONING = of("get_bucket_versioning")

                    @JvmField val SET_BUCKET_VERSIONING = of("set_bucket_versioning")

                    @JvmField val GET_OBJ = of("get_obj")

                    @JvmField val PUT_OBJ = of("put_obj")

                    @JvmField val DELETE_OBJ = of("delete_obj")

                    @JvmStatic fun of(value: String) = InnerCategory(JsonField.of(value))
                }

                /** An enum containing [InnerCategory]'s known values. */
                enum class Known {
                    LIST_BUCKET,
                    LIST_BUCKETS,
                    GET_BUCKET_LOCATION,
                    CREATE_BUCKET,
                    STAT_BUCKET,
                    GET_BUCKET_VERSIONING,
                    SET_BUCKET_VERSIONING,
                    GET_OBJ,
                    PUT_OBJ,
                    DELETE_OBJ,
                }

                /**
                 * An enum containing [InnerCategory]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [InnerCategory] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    LIST_BUCKET,
                    LIST_BUCKETS,
                    GET_BUCKET_LOCATION,
                    CREATE_BUCKET,
                    STAT_BUCKET,
                    GET_BUCKET_VERSIONING,
                    SET_BUCKET_VERSIONING,
                    GET_OBJ,
                    PUT_OBJ,
                    DELETE_OBJ,
                    /**
                     * An enum member indicating that [InnerCategory] was instantiated with an
                     * unknown value.
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
                        LIST_BUCKET -> Value.LIST_BUCKET
                        LIST_BUCKETS -> Value.LIST_BUCKETS
                        GET_BUCKET_LOCATION -> Value.GET_BUCKET_LOCATION
                        CREATE_BUCKET -> Value.CREATE_BUCKET
                        STAT_BUCKET -> Value.STAT_BUCKET
                        GET_BUCKET_VERSIONING -> Value.GET_BUCKET_VERSIONING
                        SET_BUCKET_VERSIONING -> Value.SET_BUCKET_VERSIONING
                        GET_OBJ -> Value.GET_OBJ
                        PUT_OBJ -> Value.PUT_OBJ
                        DELETE_OBJ -> Value.DELETE_OBJ
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
                        LIST_BUCKET -> Known.LIST_BUCKET
                        LIST_BUCKETS -> Known.LIST_BUCKETS
                        GET_BUCKET_LOCATION -> Known.GET_BUCKET_LOCATION
                        CREATE_BUCKET -> Known.CREATE_BUCKET
                        STAT_BUCKET -> Known.STAT_BUCKET
                        GET_BUCKET_VERSIONING -> Known.GET_BUCKET_VERSIONING
                        SET_BUCKET_VERSIONING -> Known.SET_BUCKET_VERSIONING
                        GET_OBJ -> Known.GET_OBJ
                        PUT_OBJ -> Known.PUT_OBJ
                        DELETE_OBJ -> Known.DELETE_OBJ
                        else -> throw TelnyxInvalidDataException("Unknown InnerCategory: $value")
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

                fun validate(): InnerCategory = apply {
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

                    return other is InnerCategory && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Category &&
                    bytesReceived == other.bytesReceived &&
                    bytesSent == other.bytesSent &&
                    category == other.category &&
                    ops == other.ops &&
                    successfulOps == other.successfulOps &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    bytesReceived,
                    bytesSent,
                    category,
                    ops,
                    successfulOps,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Category{bytesReceived=$bytesReceived, bytesSent=$bytesSent, category=$category, ops=$ops, successfulOps=$successfulOps, additionalProperties=$additionalProperties}"
        }

        class Total
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val bytesReceived: JsonField<Long>,
            private val bytesSent: JsonField<Long>,
            private val ops: JsonField<Long>,
            private val successfulOps: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("bytes_received")
                @ExcludeMissing
                bytesReceived: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("bytes_sent")
                @ExcludeMissing
                bytesSent: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("ops") @ExcludeMissing ops: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("successful_ops")
                @ExcludeMissing
                successfulOps: JsonField<Long> = JsonMissing.of(),
            ) : this(bytesReceived, bytesSent, ops, successfulOps, mutableMapOf())

            /**
             * The number of bytes received
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun bytesReceived(): Optional<Long> = bytesReceived.getOptional("bytes_received")

            /**
             * The number of bytes sent
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun bytesSent(): Optional<Long> = bytesSent.getOptional("bytes_sent")

            /**
             * The number of operations
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun ops(): Optional<Long> = ops.getOptional("ops")

            /**
             * The number of successful operations
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun successfulOps(): Optional<Long> = successfulOps.getOptional("successful_ops")

            /**
             * Returns the raw JSON value of [bytesReceived].
             *
             * Unlike [bytesReceived], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("bytes_received")
            @ExcludeMissing
            fun _bytesReceived(): JsonField<Long> = bytesReceived

            /**
             * Returns the raw JSON value of [bytesSent].
             *
             * Unlike [bytesSent], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("bytes_sent")
            @ExcludeMissing
            fun _bytesSent(): JsonField<Long> = bytesSent

            /**
             * Returns the raw JSON value of [ops].
             *
             * Unlike [ops], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("ops") @ExcludeMissing fun _ops(): JsonField<Long> = ops

            /**
             * Returns the raw JSON value of [successfulOps].
             *
             * Unlike [successfulOps], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("successful_ops")
            @ExcludeMissing
            fun _successfulOps(): JsonField<Long> = successfulOps

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

                /** Returns a mutable builder for constructing an instance of [Total]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Total]. */
            class Builder internal constructor() {

                private var bytesReceived: JsonField<Long> = JsonMissing.of()
                private var bytesSent: JsonField<Long> = JsonMissing.of()
                private var ops: JsonField<Long> = JsonMissing.of()
                private var successfulOps: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(total: Total) = apply {
                    bytesReceived = total.bytesReceived
                    bytesSent = total.bytesSent
                    ops = total.ops
                    successfulOps = total.successfulOps
                    additionalProperties = total.additionalProperties.toMutableMap()
                }

                /** The number of bytes received */
                fun bytesReceived(bytesReceived: Long) = bytesReceived(JsonField.of(bytesReceived))

                /**
                 * Sets [Builder.bytesReceived] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.bytesReceived] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun bytesReceived(bytesReceived: JsonField<Long>) = apply {
                    this.bytesReceived = bytesReceived
                }

                /** The number of bytes sent */
                fun bytesSent(bytesSent: Long) = bytesSent(JsonField.of(bytesSent))

                /**
                 * Sets [Builder.bytesSent] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.bytesSent] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun bytesSent(bytesSent: JsonField<Long>) = apply { this.bytesSent = bytesSent }

                /** The number of operations */
                fun ops(ops: Long) = ops(JsonField.of(ops))

                /**
                 * Sets [Builder.ops] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ops] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun ops(ops: JsonField<Long>) = apply { this.ops = ops }

                /** The number of successful operations */
                fun successfulOps(successfulOps: Long) = successfulOps(JsonField.of(successfulOps))

                /**
                 * Sets [Builder.successfulOps] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.successfulOps] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun successfulOps(successfulOps: JsonField<Long>) = apply {
                    this.successfulOps = successfulOps
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
                 * Returns an immutable instance of [Total].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Total =
                    Total(
                        bytesReceived,
                        bytesSent,
                        ops,
                        successfulOps,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Total = apply {
                if (validated) {
                    return@apply
                }

                bytesReceived()
                bytesSent()
                ops()
                successfulOps()
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
                (if (bytesReceived.asKnown().isPresent) 1 else 0) +
                    (if (bytesSent.asKnown().isPresent) 1 else 0) +
                    (if (ops.asKnown().isPresent) 1 else 0) +
                    (if (successfulOps.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Total &&
                    bytesReceived == other.bytesReceived &&
                    bytesSent == other.bytesSent &&
                    ops == other.ops &&
                    successfulOps == other.successfulOps &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(bytesReceived, bytesSent, ops, successfulOps, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Total{bytesReceived=$bytesReceived, bytesSent=$bytesSent, ops=$ops, successfulOps=$successfulOps, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                categories == other.categories &&
                timestamp == other.timestamp &&
                total == other.total &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(categories, timestamp, total, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{categories=$categories, timestamp=$timestamp, total=$total, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UsageGetApiUsageResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UsageGetApiUsageResponse{data=$data, additionalProperties=$additionalProperties}"
}
