// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.campaignbuilder.brand

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class BrandQualifyByUsecaseResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val annualFee: JsonField<Double>,
    private val maxSubUsecases: JsonField<Long>,
    private val minSubUsecases: JsonField<Long>,
    private val mnoMetadata: JsonField<MnoMetadata>,
    private val monthlyFee: JsonField<Double>,
    private val quarterlyFee: JsonField<Double>,
    private val usecase: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("annualFee") @ExcludeMissing annualFee: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("maxSubUsecases")
        @ExcludeMissing
        maxSubUsecases: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("minSubUsecases")
        @ExcludeMissing
        minSubUsecases: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("mnoMetadata")
        @ExcludeMissing
        mnoMetadata: JsonField<MnoMetadata> = JsonMissing.of(),
        @JsonProperty("monthlyFee")
        @ExcludeMissing
        monthlyFee: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("quarterlyFee")
        @ExcludeMissing
        quarterlyFee: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("usecase") @ExcludeMissing usecase: JsonField<String> = JsonMissing.of(),
    ) : this(
        annualFee,
        maxSubUsecases,
        minSubUsecases,
        mnoMetadata,
        monthlyFee,
        quarterlyFee,
        usecase,
        mutableMapOf(),
    )

    /**
     * Campaign annual subscription fee
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun annualFee(): Optional<Double> = annualFee.getOptional("annualFee")

    /**
     * Maximum number of sub-usecases declaration required.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxSubUsecases(): Optional<Long> = maxSubUsecases.getOptional("maxSubUsecases")

    /**
     * Minimum number of sub-usecases declaration required.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun minSubUsecases(): Optional<Long> = minSubUsecases.getOptional("minSubUsecases")

    /**
     * Map of usecase metadata for each MNO. Key is the network ID of the MNO (e.g. 10017), Value is
     * the mno metadata for the usecase.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mnoMetadata(): Optional<MnoMetadata> = mnoMetadata.getOptional("mnoMetadata")

    /**
     * Campaign monthly subscription fee
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun monthlyFee(): Optional<Double> = monthlyFee.getOptional("monthlyFee")

    /**
     * Campaign quarterly subscription fee
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun quarterlyFee(): Optional<Double> = quarterlyFee.getOptional("quarterlyFee")

    /**
     * Campaign usecase
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun usecase(): Optional<String> = usecase.getOptional("usecase")

    /**
     * Returns the raw JSON value of [annualFee].
     *
     * Unlike [annualFee], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("annualFee") @ExcludeMissing fun _annualFee(): JsonField<Double> = annualFee

    /**
     * Returns the raw JSON value of [maxSubUsecases].
     *
     * Unlike [maxSubUsecases], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("maxSubUsecases")
    @ExcludeMissing
    fun _maxSubUsecases(): JsonField<Long> = maxSubUsecases

    /**
     * Returns the raw JSON value of [minSubUsecases].
     *
     * Unlike [minSubUsecases], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("minSubUsecases")
    @ExcludeMissing
    fun _minSubUsecases(): JsonField<Long> = minSubUsecases

    /**
     * Returns the raw JSON value of [mnoMetadata].
     *
     * Unlike [mnoMetadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mnoMetadata")
    @ExcludeMissing
    fun _mnoMetadata(): JsonField<MnoMetadata> = mnoMetadata

    /**
     * Returns the raw JSON value of [monthlyFee].
     *
     * Unlike [monthlyFee], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("monthlyFee") @ExcludeMissing fun _monthlyFee(): JsonField<Double> = monthlyFee

    /**
     * Returns the raw JSON value of [quarterlyFee].
     *
     * Unlike [quarterlyFee], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("quarterlyFee")
    @ExcludeMissing
    fun _quarterlyFee(): JsonField<Double> = quarterlyFee

    /**
     * Returns the raw JSON value of [usecase].
     *
     * Unlike [usecase], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("usecase") @ExcludeMissing fun _usecase(): JsonField<String> = usecase

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
         * [BrandQualifyByUsecaseResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BrandQualifyByUsecaseResponse]. */
    class Builder internal constructor() {

        private var annualFee: JsonField<Double> = JsonMissing.of()
        private var maxSubUsecases: JsonField<Long> = JsonMissing.of()
        private var minSubUsecases: JsonField<Long> = JsonMissing.of()
        private var mnoMetadata: JsonField<MnoMetadata> = JsonMissing.of()
        private var monthlyFee: JsonField<Double> = JsonMissing.of()
        private var quarterlyFee: JsonField<Double> = JsonMissing.of()
        private var usecase: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(brandQualifyByUsecaseResponse: BrandQualifyByUsecaseResponse) = apply {
            annualFee = brandQualifyByUsecaseResponse.annualFee
            maxSubUsecases = brandQualifyByUsecaseResponse.maxSubUsecases
            minSubUsecases = brandQualifyByUsecaseResponse.minSubUsecases
            mnoMetadata = brandQualifyByUsecaseResponse.mnoMetadata
            monthlyFee = brandQualifyByUsecaseResponse.monthlyFee
            quarterlyFee = brandQualifyByUsecaseResponse.quarterlyFee
            usecase = brandQualifyByUsecaseResponse.usecase
            additionalProperties = brandQualifyByUsecaseResponse.additionalProperties.toMutableMap()
        }

        /** Campaign annual subscription fee */
        fun annualFee(annualFee: Double) = annualFee(JsonField.of(annualFee))

        /**
         * Sets [Builder.annualFee] to an arbitrary JSON value.
         *
         * You should usually call [Builder.annualFee] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun annualFee(annualFee: JsonField<Double>) = apply { this.annualFee = annualFee }

        /** Maximum number of sub-usecases declaration required. */
        fun maxSubUsecases(maxSubUsecases: Long) = maxSubUsecases(JsonField.of(maxSubUsecases))

        /**
         * Sets [Builder.maxSubUsecases] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxSubUsecases] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxSubUsecases(maxSubUsecases: JsonField<Long>) = apply {
            this.maxSubUsecases = maxSubUsecases
        }

        /** Minimum number of sub-usecases declaration required. */
        fun minSubUsecases(minSubUsecases: Long) = minSubUsecases(JsonField.of(minSubUsecases))

        /**
         * Sets [Builder.minSubUsecases] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minSubUsecases] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun minSubUsecases(minSubUsecases: JsonField<Long>) = apply {
            this.minSubUsecases = minSubUsecases
        }

        /**
         * Map of usecase metadata for each MNO. Key is the network ID of the MNO (e.g. 10017),
         * Value is the mno metadata for the usecase.
         */
        fun mnoMetadata(mnoMetadata: MnoMetadata) = mnoMetadata(JsonField.of(mnoMetadata))

        /**
         * Sets [Builder.mnoMetadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mnoMetadata] with a well-typed [MnoMetadata] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun mnoMetadata(mnoMetadata: JsonField<MnoMetadata>) = apply {
            this.mnoMetadata = mnoMetadata
        }

        /** Campaign monthly subscription fee */
        fun monthlyFee(monthlyFee: Double) = monthlyFee(JsonField.of(monthlyFee))

        /**
         * Sets [Builder.monthlyFee] to an arbitrary JSON value.
         *
         * You should usually call [Builder.monthlyFee] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun monthlyFee(monthlyFee: JsonField<Double>) = apply { this.monthlyFee = monthlyFee }

        /** Campaign quarterly subscription fee */
        fun quarterlyFee(quarterlyFee: Double) = quarterlyFee(JsonField.of(quarterlyFee))

        /**
         * Sets [Builder.quarterlyFee] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quarterlyFee] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun quarterlyFee(quarterlyFee: JsonField<Double>) = apply {
            this.quarterlyFee = quarterlyFee
        }

        /** Campaign usecase */
        fun usecase(usecase: String) = usecase(JsonField.of(usecase))

        /**
         * Sets [Builder.usecase] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usecase] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun usecase(usecase: JsonField<String>) = apply { this.usecase = usecase }

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
         * Returns an immutable instance of [BrandQualifyByUsecaseResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BrandQualifyByUsecaseResponse =
            BrandQualifyByUsecaseResponse(
                annualFee,
                maxSubUsecases,
                minSubUsecases,
                mnoMetadata,
                monthlyFee,
                quarterlyFee,
                usecase,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BrandQualifyByUsecaseResponse = apply {
        if (validated) {
            return@apply
        }

        annualFee()
        maxSubUsecases()
        minSubUsecases()
        mnoMetadata().ifPresent { it.validate() }
        monthlyFee()
        quarterlyFee()
        usecase()
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
        (if (annualFee.asKnown().isPresent) 1 else 0) +
            (if (maxSubUsecases.asKnown().isPresent) 1 else 0) +
            (if (minSubUsecases.asKnown().isPresent) 1 else 0) +
            (mnoMetadata.asKnown().getOrNull()?.validity() ?: 0) +
            (if (monthlyFee.asKnown().isPresent) 1 else 0) +
            (if (quarterlyFee.asKnown().isPresent) 1 else 0) +
            (if (usecase.asKnown().isPresent) 1 else 0)

    /**
     * Map of usecase metadata for each MNO. Key is the network ID of the MNO (e.g. 10017), Value is
     * the mno metadata for the usecase.
     */
    class MnoMetadata
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

            /** Returns a mutable builder for constructing an instance of [MnoMetadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [MnoMetadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(mnoMetadata: MnoMetadata) = apply {
                additionalProperties = mnoMetadata.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [MnoMetadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): MnoMetadata = MnoMetadata(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): MnoMetadata = apply {
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

            return other is MnoMetadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "MnoMetadata{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BrandQualifyByUsecaseResponse &&
            annualFee == other.annualFee &&
            maxSubUsecases == other.maxSubUsecases &&
            minSubUsecases == other.minSubUsecases &&
            mnoMetadata == other.mnoMetadata &&
            monthlyFee == other.monthlyFee &&
            quarterlyFee == other.quarterlyFee &&
            usecase == other.usecase &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            annualFee,
            maxSubUsecases,
            minSubUsecases,
            mnoMetadata,
            monthlyFee,
            quarterlyFee,
            usecase,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BrandQualifyByUsecaseResponse{annualFee=$annualFee, maxSubUsecases=$maxSubUsecases, minSubUsecases=$minSubUsecases, mnoMetadata=$mnoMetadata, monthlyFee=$monthlyFee, quarterlyFee=$quarterlyFee, usecase=$usecase, additionalProperties=$additionalProperties}"
}
