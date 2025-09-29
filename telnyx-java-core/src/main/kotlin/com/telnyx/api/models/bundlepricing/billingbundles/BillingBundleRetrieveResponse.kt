// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.bundlepricing.billingbundles

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.Enum
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

class BillingBundleRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<Data>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): Data = data.getRequired("data")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

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
         * [BillingBundleRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BillingBundleRetrieveResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(billingBundleRetrieveResponse: BillingBundleRetrieveResponse) = apply {
            data = billingBundleRetrieveResponse.data
            additionalProperties = billingBundleRetrieveResponse.additionalProperties.toMutableMap()
        }

        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

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
         * Returns an immutable instance of [BillingBundleRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BillingBundleRetrieveResponse =
            BillingBundleRetrieveResponse(
                checkRequired("data", data),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BillingBundleRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        data().validate()
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
    @JvmSynthetic internal fun validity(): Int = (data.asKnown().getOrNull()?.validity() ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val active: JsonField<Boolean>,
        private val bundleLimits: JsonField<List<BundleLimit>>,
        private val costCode: JsonField<String>,
        private val createdAt: JsonField<LocalDate>,
        private val isPublic: JsonField<Boolean>,
        private val name: JsonField<String>,
        private val slug: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("active") @ExcludeMissing active: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("bundle_limits")
            @ExcludeMissing
            bundleLimits: JsonField<List<BundleLimit>> = JsonMissing.of(),
            @JsonProperty("cost_code")
            @ExcludeMissing
            costCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("is_public")
            @ExcludeMissing
            isPublic: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("slug") @ExcludeMissing slug: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            active,
            bundleLimits,
            costCode,
            createdAt,
            isPublic,
            name,
            slug,
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
         * If that bundle is active or not.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun active(): Boolean = active.getRequired("active")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun bundleLimits(): List<BundleLimit> = bundleLimits.getRequired("bundle_limits")

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
         * Slugified version of the bundle's name.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun slug(): Optional<String> = slug.getOptional("slug")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [active].
         *
         * Unlike [active], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("active") @ExcludeMissing fun _active(): JsonField<Boolean> = active

        /**
         * Returns the raw JSON value of [bundleLimits].
         *
         * Unlike [bundleLimits], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("bundle_limits")
        @ExcludeMissing
        fun _bundleLimits(): JsonField<List<BundleLimit>> = bundleLimits

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
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<LocalDate> = createdAt

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
         * Returns the raw JSON value of [slug].
         *
         * Unlike [slug], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("slug") @ExcludeMissing fun _slug(): JsonField<String> = slug

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
             * Returns a mutable builder for constructing an instance of [Data].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .active()
             * .bundleLimits()
             * .costCode()
             * .createdAt()
             * .isPublic()
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var active: JsonField<Boolean>? = null
            private var bundleLimits: JsonField<MutableList<BundleLimit>>? = null
            private var costCode: JsonField<String>? = null
            private var createdAt: JsonField<LocalDate>? = null
            private var isPublic: JsonField<Boolean>? = null
            private var name: JsonField<String>? = null
            private var slug: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                active = data.active
                bundleLimits = data.bundleLimits.map { it.toMutableList() }
                costCode = data.costCode
                createdAt = data.createdAt
                isPublic = data.isPublic
                name = data.name
                slug = data.slug
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Bundle's ID, this is used to identify the bundle in the API. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** If that bundle is active or not. */
            fun active(active: Boolean) = active(JsonField.of(active))

            /**
             * Sets [Builder.active] to an arbitrary JSON value.
             *
             * You should usually call [Builder.active] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun active(active: JsonField<Boolean>) = apply { this.active = active }

            fun bundleLimits(bundleLimits: List<BundleLimit>) =
                bundleLimits(JsonField.of(bundleLimits))

            /**
             * Sets [Builder.bundleLimits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bundleLimits] with a well-typed `List<BundleLimit>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun bundleLimits(bundleLimits: JsonField<List<BundleLimit>>) = apply {
                this.bundleLimits = bundleLimits.map { it.toMutableList() }
            }

            /**
             * Adds a single [BundleLimit] to [bundleLimits].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addBundleLimit(bundleLimit: BundleLimit) = apply {
                bundleLimits =
                    (bundleLimits ?: JsonField.of(mutableListOf())).also {
                        checkKnown("bundleLimits", it).add(bundleLimit)
                    }
            }

            /** Bundle's cost code, this is used to identify the bundle in the billing system. */
            fun costCode(costCode: String) = costCode(JsonField.of(costCode))

            /**
             * Sets [Builder.costCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.costCode] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun costCode(costCode: JsonField<String>) = apply { this.costCode = costCode }

            /** Date the bundle was created. */
            fun createdAt(createdAt: LocalDate) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<LocalDate>) = apply { this.createdAt = createdAt }

            /** Available to all customers or only to specific customers. */
            fun isPublic(isPublic: Boolean) = isPublic(JsonField.of(isPublic))

            /**
             * Sets [Builder.isPublic] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isPublic] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isPublic(isPublic: JsonField<Boolean>) = apply { this.isPublic = isPublic }

            /** Bundle's name, this is used to identify the bundle in the UI. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Slugified version of the bundle's name. */
            fun slug(slug: String) = slug(JsonField.of(slug))

            /**
             * Sets [Builder.slug] to an arbitrary JSON value.
             *
             * You should usually call [Builder.slug] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun slug(slug: JsonField<String>) = apply { this.slug = slug }

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
             *
             * The following fields are required:
             * ```java
             * .id()
             * .active()
             * .bundleLimits()
             * .costCode()
             * .createdAt()
             * .isPublic()
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("id", id),
                    checkRequired("active", active),
                    checkRequired("bundleLimits", bundleLimits).map { it.toImmutable() },
                    checkRequired("costCode", costCode),
                    checkRequired("createdAt", createdAt),
                    checkRequired("isPublic", isPublic),
                    checkRequired("name", name),
                    slug,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            id()
            active()
            bundleLimits().forEach { it.validate() }
            costCode()
            createdAt()
            isPublic()
            name()
            slug()
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
                (if (active.asKnown().isPresent) 1 else 0) +
                (bundleLimits.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (costCode.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (isPublic.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (slug.asKnown().isPresent) 1 else 0)

        class BundleLimit
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val createdAt: JsonField<LocalDate>,
            private val metric: JsonField<String>,
            private val service: JsonField<String>,
            private val updatedAt: JsonField<LocalDate>,
            private val billingService: JsonField<String>,
            private val country: JsonField<String>,
            private val countryCode: JsonField<Long>,
            private val countryIso: JsonField<String>,
            private val direction: JsonField<Direction>,
            private val limit: JsonField<Long>,
            private val rate: JsonField<String>,
            private val types: JsonField<List<String>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("created_at")
                @ExcludeMissing
                createdAt: JsonField<LocalDate> = JsonMissing.of(),
                @JsonProperty("metric")
                @ExcludeMissing
                metric: JsonField<String> = JsonMissing.of(),
                @JsonProperty("service")
                @ExcludeMissing
                service: JsonField<String> = JsonMissing.of(),
                @JsonProperty("updated_at")
                @ExcludeMissing
                updatedAt: JsonField<LocalDate> = JsonMissing.of(),
                @JsonProperty("billing_service")
                @ExcludeMissing
                billingService: JsonField<String> = JsonMissing.of(),
                @JsonProperty("country")
                @ExcludeMissing
                country: JsonField<String> = JsonMissing.of(),
                @JsonProperty("country_code")
                @ExcludeMissing
                countryCode: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("country_iso")
                @ExcludeMissing
                countryIso: JsonField<String> = JsonMissing.of(),
                @JsonProperty("direction")
                @ExcludeMissing
                direction: JsonField<Direction> = JsonMissing.of(),
                @JsonProperty("limit") @ExcludeMissing limit: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("rate") @ExcludeMissing rate: JsonField<String> = JsonMissing.of(),
                @JsonProperty("types")
                @ExcludeMissing
                types: JsonField<List<String>> = JsonMissing.of(),
            ) : this(
                id,
                createdAt,
                metric,
                service,
                updatedAt,
                billingService,
                country,
                countryCode,
                countryIso,
                direction,
                limit,
                rate,
                types,
                mutableMapOf(),
            )

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun createdAt(): LocalDate = createdAt.getRequired("created_at")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun metric(): String = metric.getRequired("metric")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun service(): String = service.getRequired("service")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun updatedAt(): LocalDate = updatedAt.getRequired("updated_at")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun billingService(): Optional<String> = billingService.getOptional("billing_service")

            /**
             * Use country_iso instead
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            @Deprecated("deprecated")
            fun country(): Optional<String> = country.getOptional("country")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun countryCode(): Optional<Long> = countryCode.getOptional("country_code")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun countryIso(): Optional<String> = countryIso.getOptional("country_iso")

            /**
             * An enumeration.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun direction(): Optional<Direction> = direction.getOptional("direction")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun limit(): Optional<Long> = limit.getOptional("limit")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun rate(): Optional<String> = rate.getOptional("rate")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun types(): Optional<List<String>> = types.getOptional("types")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [createdAt].
             *
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun _createdAt(): JsonField<LocalDate> = createdAt

            /**
             * Returns the raw JSON value of [metric].
             *
             * Unlike [metric], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("metric") @ExcludeMissing fun _metric(): JsonField<String> = metric

            /**
             * Returns the raw JSON value of [service].
             *
             * Unlike [service], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("service") @ExcludeMissing fun _service(): JsonField<String> = service

            /**
             * Returns the raw JSON value of [updatedAt].
             *
             * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("updated_at")
            @ExcludeMissing
            fun _updatedAt(): JsonField<LocalDate> = updatedAt

            /**
             * Returns the raw JSON value of [billingService].
             *
             * Unlike [billingService], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("billing_service")
            @ExcludeMissing
            fun _billingService(): JsonField<String> = billingService

            /**
             * Returns the raw JSON value of [country].
             *
             * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
             */
            @Deprecated("deprecated")
            @JsonProperty("country")
            @ExcludeMissing
            fun _country(): JsonField<String> = country

            /**
             * Returns the raw JSON value of [countryCode].
             *
             * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("country_code")
            @ExcludeMissing
            fun _countryCode(): JsonField<Long> = countryCode

            /**
             * Returns the raw JSON value of [countryIso].
             *
             * Unlike [countryIso], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("country_iso")
            @ExcludeMissing
            fun _countryIso(): JsonField<String> = countryIso

            /**
             * Returns the raw JSON value of [direction].
             *
             * Unlike [direction], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("direction")
            @ExcludeMissing
            fun _direction(): JsonField<Direction> = direction

            /**
             * Returns the raw JSON value of [limit].
             *
             * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Long> = limit

            /**
             * Returns the raw JSON value of [rate].
             *
             * Unlike [rate], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("rate") @ExcludeMissing fun _rate(): JsonField<String> = rate

            /**
             * Returns the raw JSON value of [types].
             *
             * Unlike [types], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("types") @ExcludeMissing fun _types(): JsonField<List<String>> = types

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
                 * Returns a mutable builder for constructing an instance of [BundleLimit].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .createdAt()
                 * .metric()
                 * .service()
                 * .updatedAt()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [BundleLimit]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var createdAt: JsonField<LocalDate>? = null
                private var metric: JsonField<String>? = null
                private var service: JsonField<String>? = null
                private var updatedAt: JsonField<LocalDate>? = null
                private var billingService: JsonField<String> = JsonMissing.of()
                private var country: JsonField<String> = JsonMissing.of()
                private var countryCode: JsonField<Long> = JsonMissing.of()
                private var countryIso: JsonField<String> = JsonMissing.of()
                private var direction: JsonField<Direction> = JsonMissing.of()
                private var limit: JsonField<Long> = JsonMissing.of()
                private var rate: JsonField<String> = JsonMissing.of()
                private var types: JsonField<MutableList<String>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(bundleLimit: BundleLimit) = apply {
                    id = bundleLimit.id
                    createdAt = bundleLimit.createdAt
                    metric = bundleLimit.metric
                    service = bundleLimit.service
                    updatedAt = bundleLimit.updatedAt
                    billingService = bundleLimit.billingService
                    country = bundleLimit.country
                    countryCode = bundleLimit.countryCode
                    countryIso = bundleLimit.countryIso
                    direction = bundleLimit.direction
                    limit = bundleLimit.limit
                    rate = bundleLimit.rate
                    types = bundleLimit.types.map { it.toMutableList() }
                    additionalProperties = bundleLimit.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun createdAt(createdAt: LocalDate) = createdAt(JsonField.of(createdAt))

                /**
                 * Sets [Builder.createdAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdAt] with a well-typed [LocalDate] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun createdAt(createdAt: JsonField<LocalDate>) = apply {
                    this.createdAt = createdAt
                }

                fun metric(metric: String) = metric(JsonField.of(metric))

                /**
                 * Sets [Builder.metric] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metric] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metric(metric: JsonField<String>) = apply { this.metric = metric }

                fun service(service: String) = service(JsonField.of(service))

                /**
                 * Sets [Builder.service] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.service] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun service(service: JsonField<String>) = apply { this.service = service }

                fun updatedAt(updatedAt: LocalDate) = updatedAt(JsonField.of(updatedAt))

                /**
                 * Sets [Builder.updatedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.updatedAt] with a well-typed [LocalDate] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun updatedAt(updatedAt: JsonField<LocalDate>) = apply {
                    this.updatedAt = updatedAt
                }

                fun billingService(billingService: String) =
                    billingService(JsonField.of(billingService))

                /**
                 * Sets [Builder.billingService] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.billingService] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun billingService(billingService: JsonField<String>) = apply {
                    this.billingService = billingService
                }

                /** Use country_iso instead */
                @Deprecated("deprecated")
                fun country(country: String) = country(JsonField.of(country))

                /**
                 * Sets [Builder.country] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.country] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                @Deprecated("deprecated")
                fun country(country: JsonField<String>) = apply { this.country = country }

                fun countryCode(countryCode: Long) = countryCode(JsonField.of(countryCode))

                /**
                 * Sets [Builder.countryCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.countryCode] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun countryCode(countryCode: JsonField<Long>) = apply {
                    this.countryCode = countryCode
                }

                fun countryIso(countryIso: String) = countryIso(JsonField.of(countryIso))

                /**
                 * Sets [Builder.countryIso] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.countryIso] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun countryIso(countryIso: JsonField<String>) = apply {
                    this.countryIso = countryIso
                }

                /** An enumeration. */
                fun direction(direction: Direction) = direction(JsonField.of(direction))

                /**
                 * Sets [Builder.direction] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.direction] with a well-typed [Direction] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun direction(direction: JsonField<Direction>) = apply {
                    this.direction = direction
                }

                fun limit(limit: Long) = limit(JsonField.of(limit))

                /**
                 * Sets [Builder.limit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.limit] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun limit(limit: JsonField<Long>) = apply { this.limit = limit }

                fun rate(rate: String) = rate(JsonField.of(rate))

                /**
                 * Sets [Builder.rate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.rate] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun rate(rate: JsonField<String>) = apply { this.rate = rate }

                fun types(types: List<String>) = types(JsonField.of(types))

                /**
                 * Sets [Builder.types] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.types] with a well-typed `List<String>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun types(types: JsonField<List<String>>) = apply {
                    this.types = types.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [types].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addType(type: String) = apply {
                    types =
                        (types ?: JsonField.of(mutableListOf())).also {
                            checkKnown("types", it).add(type)
                        }
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
                 * Returns an immutable instance of [BundleLimit].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .createdAt()
                 * .metric()
                 * .service()
                 * .updatedAt()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): BundleLimit =
                    BundleLimit(
                        checkRequired("id", id),
                        checkRequired("createdAt", createdAt),
                        checkRequired("metric", metric),
                        checkRequired("service", service),
                        checkRequired("updatedAt", updatedAt),
                        billingService,
                        country,
                        countryCode,
                        countryIso,
                        direction,
                        limit,
                        rate,
                        (types ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): BundleLimit = apply {
                if (validated) {
                    return@apply
                }

                id()
                createdAt()
                metric()
                service()
                updatedAt()
                billingService()
                country()
                countryCode()
                countryIso()
                direction().ifPresent { it.validate() }
                limit()
                rate()
                types()
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
                    (if (createdAt.asKnown().isPresent) 1 else 0) +
                    (if (metric.asKnown().isPresent) 1 else 0) +
                    (if (service.asKnown().isPresent) 1 else 0) +
                    (if (updatedAt.asKnown().isPresent) 1 else 0) +
                    (if (billingService.asKnown().isPresent) 1 else 0) +
                    (if (country.asKnown().isPresent) 1 else 0) +
                    (if (countryCode.asKnown().isPresent) 1 else 0) +
                    (if (countryIso.asKnown().isPresent) 1 else 0) +
                    (direction.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (limit.asKnown().isPresent) 1 else 0) +
                    (if (rate.asKnown().isPresent) 1 else 0) +
                    (types.asKnown().getOrNull()?.size ?: 0)

            /** An enumeration. */
            class Direction @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val INBOUND = of("inbound")

                    @JvmField val OUTBOUND = of("outbound")

                    @JvmStatic fun of(value: String) = Direction(JsonField.of(value))
                }

                /** An enum containing [Direction]'s known values. */
                enum class Known {
                    INBOUND,
                    OUTBOUND,
                }

                /**
                 * An enum containing [Direction]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Direction] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    INBOUND,
                    OUTBOUND,
                    /**
                     * An enum member indicating that [Direction] was instantiated with an unknown
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
                        INBOUND -> Value.INBOUND
                        OUTBOUND -> Value.OUTBOUND
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
                        INBOUND -> Known.INBOUND
                        OUTBOUND -> Known.OUTBOUND
                        else -> throw TelnyxInvalidDataException("Unknown Direction: $value")
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

                fun validate(): Direction = apply {
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

                    return other is Direction && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BundleLimit &&
                    id == other.id &&
                    createdAt == other.createdAt &&
                    metric == other.metric &&
                    service == other.service &&
                    updatedAt == other.updatedAt &&
                    billingService == other.billingService &&
                    country == other.country &&
                    countryCode == other.countryCode &&
                    countryIso == other.countryIso &&
                    direction == other.direction &&
                    limit == other.limit &&
                    rate == other.rate &&
                    types == other.types &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    createdAt,
                    metric,
                    service,
                    updatedAt,
                    billingService,
                    country,
                    countryCode,
                    countryIso,
                    direction,
                    limit,
                    rate,
                    types,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BundleLimit{id=$id, createdAt=$createdAt, metric=$metric, service=$service, updatedAt=$updatedAt, billingService=$billingService, country=$country, countryCode=$countryCode, countryIso=$countryIso, direction=$direction, limit=$limit, rate=$rate, types=$types, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                id == other.id &&
                active == other.active &&
                bundleLimits == other.bundleLimits &&
                costCode == other.costCode &&
                createdAt == other.createdAt &&
                isPublic == other.isPublic &&
                name == other.name &&
                slug == other.slug &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                active,
                bundleLimits,
                costCode,
                createdAt,
                isPublic,
                name,
                slug,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, active=$active, bundleLimits=$bundleLimits, costCode=$costCode, createdAt=$createdAt, isPublic=$isPublic, name=$name, slug=$slug, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BillingBundleRetrieveResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BillingBundleRetrieveResponse{data=$data, additionalProperties=$additionalProperties}"
}
