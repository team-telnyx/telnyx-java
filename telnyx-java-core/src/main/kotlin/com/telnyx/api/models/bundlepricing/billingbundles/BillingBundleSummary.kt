// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.bundlepricing.billingbundles

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.checkKnown
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.time.LocalDate
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class BillingBundleSummary
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val costCode: JsonField<String>,
    private val createdAt: JsonField<LocalDate>,
    private val isPublic: JsonField<Boolean>,
    private val name: JsonField<String>,
    private val currency: JsonField<String>,
    private val mrcPrice: JsonField<Float>,
    private val slug: JsonField<String>,
    private val specs: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cost_code") @ExcludeMissing costCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("is_public") @ExcludeMissing isPublic: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mrc_price") @ExcludeMissing mrcPrice: JsonField<Float> = JsonMissing.of(),
        @JsonProperty("slug") @ExcludeMissing slug: JsonField<String> = JsonMissing.of(),
        @JsonProperty("specs") @ExcludeMissing specs: JsonField<List<String>> = JsonMissing.of(),
    ) : this(
        id,
        costCode,
        createdAt,
        isPublic,
        name,
        currency,
        mrcPrice,
        slug,
        specs,
        mutableMapOf(),
    )

    /**
     * Bundle's ID, this is used to identify the bundle in the API.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Bundle's cost code, this is used to identify the bundle in the billing system.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun costCode(): String = costCode.getRequired("cost_code")

    /**
     * Date the bundle was created.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): LocalDate = createdAt.getRequired("created_at")

    /**
     * Available to all customers or only to specific customers.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isPublic(): Boolean = isPublic.getRequired("is_public")

    /**
     * Bundle's name, this is used to identify the bundle in the UI.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Bundle's currency code.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currency(): Optional<String> = currency.getOptional("currency")

    /**
     * Monthly recurring charge price.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mrcPrice(): Optional<Float> = mrcPrice.getOptional("mrc_price")

    /**
     * Slugified version of the bundle's name.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun slug(): Optional<String> = slug.getOptional("slug")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun specs(): Optional<List<String>> = specs.getOptional("specs")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [costCode].
     *
     * Unlike [costCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cost_code") @ExcludeMissing fun _costCode(): JsonField<String> = costCode

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<LocalDate> = createdAt

    /**
     * Returns the raw JSON value of [isPublic].
     *
     * Unlike [isPublic], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_public") @ExcludeMissing fun _isPublic(): JsonField<Boolean> = isPublic

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /**
     * Returns the raw JSON value of [mrcPrice].
     *
     * Unlike [mrcPrice], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mrc_price") @ExcludeMissing fun _mrcPrice(): JsonField<Float> = mrcPrice

    /**
     * Returns the raw JSON value of [slug].
     *
     * Unlike [slug], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("slug") @ExcludeMissing fun _slug(): JsonField<String> = slug

    /**
     * Returns the raw JSON value of [specs].
     *
     * Unlike [specs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("specs") @ExcludeMissing fun _specs(): JsonField<List<String>> = specs

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
         * Returns a mutable builder for constructing an instance of [BillingBundleSummary].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .costCode()
         * .createdAt()
         * .isPublic()
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BillingBundleSummary]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var costCode: JsonField<String>? = null
        private var createdAt: JsonField<LocalDate>? = null
        private var isPublic: JsonField<Boolean>? = null
        private var name: JsonField<String>? = null
        private var currency: JsonField<String> = JsonMissing.of()
        private var mrcPrice: JsonField<Float> = JsonMissing.of()
        private var slug: JsonField<String> = JsonMissing.of()
        private var specs: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(billingBundleSummary: BillingBundleSummary) = apply {
            id = billingBundleSummary.id
            costCode = billingBundleSummary.costCode
            createdAt = billingBundleSummary.createdAt
            isPublic = billingBundleSummary.isPublic
            name = billingBundleSummary.name
            currency = billingBundleSummary.currency
            mrcPrice = billingBundleSummary.mrcPrice
            slug = billingBundleSummary.slug
            specs = billingBundleSummary.specs.map { it.toMutableList() }
            additionalProperties = billingBundleSummary.additionalProperties.toMutableMap()
        }

        /** Bundle's ID, this is used to identify the bundle in the API. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Bundle's cost code, this is used to identify the bundle in the billing system. */
        fun costCode(costCode: String) = costCode(JsonField.of(costCode))

        /**
         * Sets [Builder.costCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.costCode] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun costCode(costCode: JsonField<String>) = apply { this.costCode = costCode }

        /** Date the bundle was created. */
        fun createdAt(createdAt: LocalDate) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdAt(createdAt: JsonField<LocalDate>) = apply { this.createdAt = createdAt }

        /** Available to all customers or only to specific customers. */
        fun isPublic(isPublic: Boolean) = isPublic(JsonField.of(isPublic))

        /**
         * Sets [Builder.isPublic] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isPublic] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isPublic(isPublic: JsonField<Boolean>) = apply { this.isPublic = isPublic }

        /** Bundle's name, this is used to identify the bundle in the UI. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Bundle's currency code. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /** Monthly recurring charge price. */
        fun mrcPrice(mrcPrice: Float) = mrcPrice(JsonField.of(mrcPrice))

        /**
         * Sets [Builder.mrcPrice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mrcPrice] with a well-typed [Float] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mrcPrice(mrcPrice: JsonField<Float>) = apply { this.mrcPrice = mrcPrice }

        /** Slugified version of the bundle's name. */
        fun slug(slug: String) = slug(JsonField.of(slug))

        /**
         * Sets [Builder.slug] to an arbitrary JSON value.
         *
         * You should usually call [Builder.slug] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun slug(slug: JsonField<String>) = apply { this.slug = slug }

        fun specs(specs: List<String>) = specs(JsonField.of(specs))

        /**
         * Sets [Builder.specs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.specs] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun specs(specs: JsonField<List<String>>) = apply {
            this.specs = specs.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [specs].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSpec(spec: String) = apply {
            specs =
                (specs ?: JsonField.of(mutableListOf())).also { checkKnown("specs", it).add(spec) }
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
         * Returns an immutable instance of [BillingBundleSummary].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .costCode()
         * .createdAt()
         * .isPublic()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BillingBundleSummary =
            BillingBundleSummary(
                checkRequired("id", id),
                checkRequired("costCode", costCode),
                checkRequired("createdAt", createdAt),
                checkRequired("isPublic", isPublic),
                checkRequired("name", name),
                currency,
                mrcPrice,
                slug,
                (specs ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BillingBundleSummary = apply {
        if (validated) {
            return@apply
        }

        id()
        costCode()
        createdAt()
        isPublic()
        name()
        currency()
        mrcPrice()
        slug()
        specs()
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
            (if (costCode.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (isPublic.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (currency.asKnown().isPresent) 1 else 0) +
            (if (mrcPrice.asKnown().isPresent) 1 else 0) +
            (if (slug.asKnown().isPresent) 1 else 0) +
            (specs.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BillingBundleSummary &&
            id == other.id &&
            costCode == other.costCode &&
            createdAt == other.createdAt &&
            isPublic == other.isPublic &&
            name == other.name &&
            currency == other.currency &&
            mrcPrice == other.mrcPrice &&
            slug == other.slug &&
            specs == other.specs &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            costCode,
            createdAt,
            isPublic,
            name,
            currency,
            mrcPrice,
            slug,
            specs,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BillingBundleSummary{id=$id, costCode=$costCode, createdAt=$createdAt, isPublic=$isPublic, name=$name, currency=$currency, mrcPrice=$mrcPrice, slug=$slug, specs=$specs, additionalProperties=$additionalProperties}"
}
