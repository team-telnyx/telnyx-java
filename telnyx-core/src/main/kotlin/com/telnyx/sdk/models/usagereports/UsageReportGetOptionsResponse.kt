// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.usagereports

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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * An object following one of the schemas published in
 * https://developers.telnyx.com/docs/api/v2/detail-records
 */
class UsageReportGetOptionsResponse
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
     * Collection of product description
     *
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

        /**
         * Returns a mutable builder for constructing an instance of
         * [UsageReportGetOptionsResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UsageReportGetOptionsResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(usageReportGetOptionsResponse: UsageReportGetOptionsResponse) = apply {
            data = usageReportGetOptionsResponse.data.map { it.toMutableList() }
            additionalProperties = usageReportGetOptionsResponse.additionalProperties.toMutableMap()
        }

        /** Collection of product description */
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
         * Returns an immutable instance of [UsageReportGetOptionsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UsageReportGetOptionsResponse =
            UsageReportGetOptionsResponse(
                (data ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): UsageReportGetOptionsResponse = apply {
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

    /**
     * An object following one of the schemas published in
     * https://developers.telnyx.com/docs/api/v2/detail-records
     */
    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val product: JsonField<String>,
        private val productDimensions: JsonField<List<String>>,
        private val productMetrics: JsonField<List<String>>,
        private val recordTypes: JsonField<List<RecordType>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("product") @ExcludeMissing product: JsonField<String> = JsonMissing.of(),
            @JsonProperty("product_dimensions")
            @ExcludeMissing
            productDimensions: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("product_metrics")
            @ExcludeMissing
            productMetrics: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("record_types")
            @ExcludeMissing
            recordTypes: JsonField<List<RecordType>> = JsonMissing.of(),
        ) : this(product, productDimensions, productMetrics, recordTypes, mutableMapOf())

        /**
         * Telnyx Product
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun product(): Optional<String> = product.getOptional("product")

        /**
         * Telnyx Product Dimensions
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun productDimensions(): Optional<List<String>> =
            productDimensions.getOptional("product_dimensions")

        /**
         * Telnyx Product Metrics
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun productMetrics(): Optional<List<String>> = productMetrics.getOptional("product_metrics")

        /**
         * Subproducts if applicable
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordTypes(): Optional<List<RecordType>> = recordTypes.getOptional("record_types")

        /**
         * Returns the raw JSON value of [product].
         *
         * Unlike [product], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("product") @ExcludeMissing fun _product(): JsonField<String> = product

        /**
         * Returns the raw JSON value of [productDimensions].
         *
         * Unlike [productDimensions], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("product_dimensions")
        @ExcludeMissing
        fun _productDimensions(): JsonField<List<String>> = productDimensions

        /**
         * Returns the raw JSON value of [productMetrics].
         *
         * Unlike [productMetrics], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("product_metrics")
        @ExcludeMissing
        fun _productMetrics(): JsonField<List<String>> = productMetrics

        /**
         * Returns the raw JSON value of [recordTypes].
         *
         * Unlike [recordTypes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_types")
        @ExcludeMissing
        fun _recordTypes(): JsonField<List<RecordType>> = recordTypes

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

            private var product: JsonField<String> = JsonMissing.of()
            private var productDimensions: JsonField<MutableList<String>>? = null
            private var productMetrics: JsonField<MutableList<String>>? = null
            private var recordTypes: JsonField<MutableList<RecordType>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                product = data.product
                productDimensions = data.productDimensions.map { it.toMutableList() }
                productMetrics = data.productMetrics.map { it.toMutableList() }
                recordTypes = data.recordTypes.map { it.toMutableList() }
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Telnyx Product */
            fun product(product: String) = product(JsonField.of(product))

            /**
             * Sets [Builder.product] to an arbitrary JSON value.
             *
             * You should usually call [Builder.product] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun product(product: JsonField<String>) = apply { this.product = product }

            /** Telnyx Product Dimensions */
            fun productDimensions(productDimensions: List<String>) =
                productDimensions(JsonField.of(productDimensions))

            /**
             * Sets [Builder.productDimensions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productDimensions] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun productDimensions(productDimensions: JsonField<List<String>>) = apply {
                this.productDimensions = productDimensions.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [productDimensions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addProductDimension(productDimension: String) = apply {
                productDimensions =
                    (productDimensions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("productDimensions", it).add(productDimension)
                    }
            }

            /** Telnyx Product Metrics */
            fun productMetrics(productMetrics: List<String>) =
                productMetrics(JsonField.of(productMetrics))

            /**
             * Sets [Builder.productMetrics] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productMetrics] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun productMetrics(productMetrics: JsonField<List<String>>) = apply {
                this.productMetrics = productMetrics.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [productMetrics].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addProductMetric(productMetric: String) = apply {
                productMetrics =
                    (productMetrics ?: JsonField.of(mutableListOf())).also {
                        checkKnown("productMetrics", it).add(productMetric)
                    }
            }

            /** Subproducts if applicable */
            fun recordTypes(recordTypes: List<RecordType>) = recordTypes(JsonField.of(recordTypes))

            /**
             * Sets [Builder.recordTypes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordTypes] with a well-typed `List<RecordType>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun recordTypes(recordTypes: JsonField<List<RecordType>>) = apply {
                this.recordTypes = recordTypes.map { it.toMutableList() }
            }

            /**
             * Adds a single [RecordType] to [recordTypes].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRecordType(recordType: RecordType) = apply {
                recordTypes =
                    (recordTypes ?: JsonField.of(mutableListOf())).also {
                        checkKnown("recordTypes", it).add(recordType)
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Data =
                Data(
                    product,
                    (productDimensions ?: JsonMissing.of()).map { it.toImmutable() },
                    (productMetrics ?: JsonMissing.of()).map { it.toImmutable() },
                    (recordTypes ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            product()
            productDimensions()
            productMetrics()
            recordTypes().ifPresent { it.forEach { it.validate() } }
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
            (if (product.asKnown().isPresent) 1 else 0) +
                (productDimensions.asKnown().getOrNull()?.size ?: 0) +
                (productMetrics.asKnown().getOrNull()?.size ?: 0) +
                (recordTypes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        /**
         * An object following one of the schemas published in
         * https://developers.telnyx.com/docs/api/v2/detail-records
         */
        class RecordType
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val productDimensions: JsonField<List<String>>,
            private val productMetrics: JsonField<List<String>>,
            private val recordType: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("product_dimensions")
                @ExcludeMissing
                productDimensions: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("product_metrics")
                @ExcludeMissing
                productMetrics: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("record_type")
                @ExcludeMissing
                recordType: JsonField<String> = JsonMissing.of(),
            ) : this(productDimensions, productMetrics, recordType, mutableMapOf())

            /**
             * Telnyx Product Dimensions
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun productDimensions(): Optional<List<String>> =
                productDimensions.getOptional("product_dimensions")

            /**
             * Telnyx Product Metrics
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun productMetrics(): Optional<List<String>> =
                productMetrics.getOptional("product_metrics")

            /**
             * Telnyx Product type
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun recordType(): Optional<String> = recordType.getOptional("record_type")

            /**
             * Returns the raw JSON value of [productDimensions].
             *
             * Unlike [productDimensions], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("product_dimensions")
            @ExcludeMissing
            fun _productDimensions(): JsonField<List<String>> = productDimensions

            /**
             * Returns the raw JSON value of [productMetrics].
             *
             * Unlike [productMetrics], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("product_metrics")
            @ExcludeMissing
            fun _productMetrics(): JsonField<List<String>> = productMetrics

            /**
             * Returns the raw JSON value of [recordType].
             *
             * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("record_type")
            @ExcludeMissing
            fun _recordType(): JsonField<String> = recordType

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

                /** Returns a mutable builder for constructing an instance of [RecordType]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [RecordType]. */
            class Builder internal constructor() {

                private var productDimensions: JsonField<MutableList<String>>? = null
                private var productMetrics: JsonField<MutableList<String>>? = null
                private var recordType: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(recordType: RecordType) = apply {
                    productDimensions = recordType.productDimensions.map { it.toMutableList() }
                    productMetrics = recordType.productMetrics.map { it.toMutableList() }
                    this.recordType = recordType.recordType
                    additionalProperties = recordType.additionalProperties.toMutableMap()
                }

                /** Telnyx Product Dimensions */
                fun productDimensions(productDimensions: List<String>) =
                    productDimensions(JsonField.of(productDimensions))

                /**
                 * Sets [Builder.productDimensions] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.productDimensions] with a well-typed
                 * `List<String>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun productDimensions(productDimensions: JsonField<List<String>>) = apply {
                    this.productDimensions = productDimensions.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [productDimensions].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addProductDimension(productDimension: String) = apply {
                    productDimensions =
                        (productDimensions ?: JsonField.of(mutableListOf())).also {
                            checkKnown("productDimensions", it).add(productDimension)
                        }
                }

                /** Telnyx Product Metrics */
                fun productMetrics(productMetrics: List<String>) =
                    productMetrics(JsonField.of(productMetrics))

                /**
                 * Sets [Builder.productMetrics] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.productMetrics] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun productMetrics(productMetrics: JsonField<List<String>>) = apply {
                    this.productMetrics = productMetrics.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [productMetrics].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addProductMetric(productMetric: String) = apply {
                    productMetrics =
                        (productMetrics ?: JsonField.of(mutableListOf())).also {
                            checkKnown("productMetrics", it).add(productMetric)
                        }
                }

                /** Telnyx Product type */
                fun recordType(recordType: String) = recordType(JsonField.of(recordType))

                /**
                 * Sets [Builder.recordType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.recordType] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun recordType(recordType: JsonField<String>) = apply {
                    this.recordType = recordType
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
                 * Returns an immutable instance of [RecordType].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): RecordType =
                    RecordType(
                        (productDimensions ?: JsonMissing.of()).map { it.toImmutable() },
                        (productMetrics ?: JsonMissing.of()).map { it.toImmutable() },
                        recordType,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): RecordType = apply {
                if (validated) {
                    return@apply
                }

                productDimensions()
                productMetrics()
                recordType()
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
                (productDimensions.asKnown().getOrNull()?.size ?: 0) +
                    (productMetrics.asKnown().getOrNull()?.size ?: 0) +
                    (if (recordType.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is RecordType &&
                    productDimensions == other.productDimensions &&
                    productMetrics == other.productMetrics &&
                    recordType == other.recordType &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(productDimensions, productMetrics, recordType, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RecordType{productDimensions=$productDimensions, productMetrics=$productMetrics, recordType=$recordType, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                product == other.product &&
                productDimensions == other.productDimensions &&
                productMetrics == other.productMetrics &&
                recordTypes == other.recordTypes &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                product,
                productDimensions,
                productMetrics,
                recordTypes,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{product=$product, productDimensions=$productDimensions, productMetrics=$productMetrics, recordTypes=$recordTypes, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UsageReportGetOptionsResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UsageReportGetOptionsResponse{data=$data, additionalProperties=$additionalProperties}"
}
