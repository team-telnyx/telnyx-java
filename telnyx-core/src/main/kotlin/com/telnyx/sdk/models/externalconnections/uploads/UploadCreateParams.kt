// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalconnections.uploads

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
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Creates a new Upload request to Microsoft teams with the included phone numbers. Only one of
 * civic_address_id or location_id must be provided, not both. The maximum allowed phone numbers for
 * the numbers_ids array is 1000.
 */
class UploadCreateParams
private constructor(
    private val id: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun numberIds(): List<String> = body.numberIds()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun additionalUsages(): Optional<List<AdditionalUsage>> = body.additionalUsages()

    /**
     * Identifies the civic address to assign all phone numbers to.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun civicAddressId(): Optional<String> = body.civicAddressId()

    /**
     * Identifies the location to assign all phone numbers to.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun locationId(): Optional<String> = body.locationId()

    /**
     * The use case of the upload request. NOTE: `calling_user_assignment` is not supported for toll
     * free numbers.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun usage(): Optional<Usage> = body.usage()

    /**
     * Returns the raw JSON value of [numberIds].
     *
     * Unlike [numberIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _numberIds(): JsonField<List<String>> = body._numberIds()

    /**
     * Returns the raw JSON value of [additionalUsages].
     *
     * Unlike [additionalUsages], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _additionalUsages(): JsonField<List<AdditionalUsage>> = body._additionalUsages()

    /**
     * Returns the raw JSON value of [civicAddressId].
     *
     * Unlike [civicAddressId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _civicAddressId(): JsonField<String> = body._civicAddressId()

    /**
     * Returns the raw JSON value of [locationId].
     *
     * Unlike [locationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _locationId(): JsonField<String> = body._locationId()

    /**
     * Returns the raw JSON value of [usage].
     *
     * Unlike [usage], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _usage(): JsonField<Usage> = body._usage()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UploadCreateParams].
         *
         * The following fields are required:
         * ```java
         * .numberIds()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UploadCreateParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(uploadCreateParams: UploadCreateParams) = apply {
            id = uploadCreateParams.id
            body = uploadCreateParams.body.toBuilder()
            additionalHeaders = uploadCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = uploadCreateParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [numberIds]
         * - [additionalUsages]
         * - [civicAddressId]
         * - [locationId]
         * - [usage]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun numberIds(numberIds: List<String>) = apply { body.numberIds(numberIds) }

        /**
         * Sets [Builder.numberIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numberIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun numberIds(numberIds: JsonField<List<String>>) = apply { body.numberIds(numberIds) }

        /**
         * Adds a single [String] to [numberIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addNumberId(numberId: String) = apply { body.addNumberId(numberId) }

        fun additionalUsages(additionalUsages: List<AdditionalUsage>) = apply {
            body.additionalUsages(additionalUsages)
        }

        /**
         * Sets [Builder.additionalUsages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.additionalUsages] with a well-typed
         * `List<AdditionalUsage>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun additionalUsages(additionalUsages: JsonField<List<AdditionalUsage>>) = apply {
            body.additionalUsages(additionalUsages)
        }

        /**
         * Adds a single [AdditionalUsage] to [additionalUsages].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAdditionalUsage(additionalUsage: AdditionalUsage) = apply {
            body.addAdditionalUsage(additionalUsage)
        }

        /** Identifies the civic address to assign all phone numbers to. */
        fun civicAddressId(civicAddressId: String) = apply { body.civicAddressId(civicAddressId) }

        /**
         * Sets [Builder.civicAddressId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.civicAddressId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun civicAddressId(civicAddressId: JsonField<String>) = apply {
            body.civicAddressId(civicAddressId)
        }

        /** Identifies the location to assign all phone numbers to. */
        fun locationId(locationId: String) = apply { body.locationId(locationId) }

        /**
         * Sets [Builder.locationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.locationId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun locationId(locationId: JsonField<String>) = apply { body.locationId(locationId) }

        /**
         * The use case of the upload request. NOTE: `calling_user_assignment` is not supported for
         * toll free numbers.
         */
        fun usage(usage: Usage) = apply { body.usage(usage) }

        /**
         * Sets [Builder.usage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usage] with a well-typed [Usage] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun usage(usage: JsonField<Usage>) = apply { body.usage(usage) }

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
         * Returns an immutable instance of [UploadCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .numberIds()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UploadCreateParams =
            UploadCreateParams(
                id,
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

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val numberIds: JsonField<List<String>>,
        private val additionalUsages: JsonField<List<AdditionalUsage>>,
        private val civicAddressId: JsonField<String>,
        private val locationId: JsonField<String>,
        private val usage: JsonField<Usage>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("number_ids")
            @ExcludeMissing
            numberIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("additional_usages")
            @ExcludeMissing
            additionalUsages: JsonField<List<AdditionalUsage>> = JsonMissing.of(),
            @JsonProperty("civic_address_id")
            @ExcludeMissing
            civicAddressId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("location_id")
            @ExcludeMissing
            locationId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("usage") @ExcludeMissing usage: JsonField<Usage> = JsonMissing.of(),
        ) : this(numberIds, additionalUsages, civicAddressId, locationId, usage, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun numberIds(): List<String> = numberIds.getRequired("number_ids")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun additionalUsages(): Optional<List<AdditionalUsage>> =
            additionalUsages.getOptional("additional_usages")

        /**
         * Identifies the civic address to assign all phone numbers to.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun civicAddressId(): Optional<String> = civicAddressId.getOptional("civic_address_id")

        /**
         * Identifies the location to assign all phone numbers to.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun locationId(): Optional<String> = locationId.getOptional("location_id")

        /**
         * The use case of the upload request. NOTE: `calling_user_assignment` is not supported for
         * toll free numbers.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun usage(): Optional<Usage> = usage.getOptional("usage")

        /**
         * Returns the raw JSON value of [numberIds].
         *
         * Unlike [numberIds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("number_ids")
        @ExcludeMissing
        fun _numberIds(): JsonField<List<String>> = numberIds

        /**
         * Returns the raw JSON value of [additionalUsages].
         *
         * Unlike [additionalUsages], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("additional_usages")
        @ExcludeMissing
        fun _additionalUsages(): JsonField<List<AdditionalUsage>> = additionalUsages

        /**
         * Returns the raw JSON value of [civicAddressId].
         *
         * Unlike [civicAddressId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("civic_address_id")
        @ExcludeMissing
        fun _civicAddressId(): JsonField<String> = civicAddressId

        /**
         * Returns the raw JSON value of [locationId].
         *
         * Unlike [locationId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("location_id")
        @ExcludeMissing
        fun _locationId(): JsonField<String> = locationId

        /**
         * Returns the raw JSON value of [usage].
         *
         * Unlike [usage], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("usage") @ExcludeMissing fun _usage(): JsonField<Usage> = usage

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .numberIds()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var numberIds: JsonField<MutableList<String>>? = null
            private var additionalUsages: JsonField<MutableList<AdditionalUsage>>? = null
            private var civicAddressId: JsonField<String> = JsonMissing.of()
            private var locationId: JsonField<String> = JsonMissing.of()
            private var usage: JsonField<Usage> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                numberIds = body.numberIds.map { it.toMutableList() }
                additionalUsages = body.additionalUsages.map { it.toMutableList() }
                civicAddressId = body.civicAddressId
                locationId = body.locationId
                usage = body.usage
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun numberIds(numberIds: List<String>) = numberIds(JsonField.of(numberIds))

            /**
             * Sets [Builder.numberIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numberIds] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun numberIds(numberIds: JsonField<List<String>>) = apply {
                this.numberIds = numberIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [numberIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addNumberId(numberId: String) = apply {
                numberIds =
                    (numberIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("numberIds", it).add(numberId)
                    }
            }

            fun additionalUsages(additionalUsages: List<AdditionalUsage>) =
                additionalUsages(JsonField.of(additionalUsages))

            /**
             * Sets [Builder.additionalUsages] to an arbitrary JSON value.
             *
             * You should usually call [Builder.additionalUsages] with a well-typed
             * `List<AdditionalUsage>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun additionalUsages(additionalUsages: JsonField<List<AdditionalUsage>>) = apply {
                this.additionalUsages = additionalUsages.map { it.toMutableList() }
            }

            /**
             * Adds a single [AdditionalUsage] to [additionalUsages].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAdditionalUsage(additionalUsage: AdditionalUsage) = apply {
                additionalUsages =
                    (additionalUsages ?: JsonField.of(mutableListOf())).also {
                        checkKnown("additionalUsages", it).add(additionalUsage)
                    }
            }

            /** Identifies the civic address to assign all phone numbers to. */
            fun civicAddressId(civicAddressId: String) =
                civicAddressId(JsonField.of(civicAddressId))

            /**
             * Sets [Builder.civicAddressId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.civicAddressId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun civicAddressId(civicAddressId: JsonField<String>) = apply {
                this.civicAddressId = civicAddressId
            }

            /** Identifies the location to assign all phone numbers to. */
            fun locationId(locationId: String) = locationId(JsonField.of(locationId))

            /**
             * Sets [Builder.locationId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.locationId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun locationId(locationId: JsonField<String>) = apply { this.locationId = locationId }

            /**
             * The use case of the upload request. NOTE: `calling_user_assignment` is not supported
             * for toll free numbers.
             */
            fun usage(usage: Usage) = usage(JsonField.of(usage))

            /**
             * Sets [Builder.usage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.usage] with a well-typed [Usage] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun usage(usage: JsonField<Usage>) = apply { this.usage = usage }

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
             *
             * The following fields are required:
             * ```java
             * .numberIds()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("numberIds", numberIds).map { it.toImmutable() },
                    (additionalUsages ?: JsonMissing.of()).map { it.toImmutable() },
                    civicAddressId,
                    locationId,
                    usage,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            numberIds()
            additionalUsages().ifPresent { it.forEach { it.validate() } }
            civicAddressId()
            locationId()
            usage().ifPresent { it.validate() }
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
            (numberIds.asKnown().getOrNull()?.size ?: 0) +
                (additionalUsages.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (civicAddressId.asKnown().isPresent) 1 else 0) +
                (if (locationId.asKnown().isPresent) 1 else 0) +
                (usage.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                numberIds == other.numberIds &&
                additionalUsages == other.additionalUsages &&
                civicAddressId == other.civicAddressId &&
                locationId == other.locationId &&
                usage == other.usage &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                numberIds,
                additionalUsages,
                civicAddressId,
                locationId,
                usage,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{numberIds=$numberIds, additionalUsages=$additionalUsages, civicAddressId=$civicAddressId, locationId=$locationId, usage=$usage, additionalProperties=$additionalProperties}"
    }

    /**
     * Additional use cases of the upload request. If not provided, all supported usages will be
     * used.
     */
    class AdditionalUsage @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val CALLING_USER_ASSIGNMENT = of("calling_user_assignment")

            @JvmField val FIRST_PARTY_APP_ASSIGNMENT = of("first_party_app_assignment")

            @JvmStatic fun of(value: String) = AdditionalUsage(JsonField.of(value))
        }

        /** An enum containing [AdditionalUsage]'s known values. */
        enum class Known {
            CALLING_USER_ASSIGNMENT,
            FIRST_PARTY_APP_ASSIGNMENT,
        }

        /**
         * An enum containing [AdditionalUsage]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AdditionalUsage] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CALLING_USER_ASSIGNMENT,
            FIRST_PARTY_APP_ASSIGNMENT,
            /**
             * An enum member indicating that [AdditionalUsage] was instantiated with an unknown
             * value.
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
                CALLING_USER_ASSIGNMENT -> Value.CALLING_USER_ASSIGNMENT
                FIRST_PARTY_APP_ASSIGNMENT -> Value.FIRST_PARTY_APP_ASSIGNMENT
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
                CALLING_USER_ASSIGNMENT -> Known.CALLING_USER_ASSIGNMENT
                FIRST_PARTY_APP_ASSIGNMENT -> Known.FIRST_PARTY_APP_ASSIGNMENT
                else -> throw TelnyxInvalidDataException("Unknown AdditionalUsage: $value")
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

        fun validate(): AdditionalUsage = apply {
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

            return other is AdditionalUsage && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The use case of the upload request. NOTE: `calling_user_assignment` is not supported for toll
     * free numbers.
     */
    class Usage @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val CALLING_USER_ASSIGNMENT = of("calling_user_assignment")

            @JvmField val FIRST_PARTY_APP_ASSIGNMENT = of("first_party_app_assignment")

            @JvmStatic fun of(value: String) = Usage(JsonField.of(value))
        }

        /** An enum containing [Usage]'s known values. */
        enum class Known {
            CALLING_USER_ASSIGNMENT,
            FIRST_PARTY_APP_ASSIGNMENT,
        }

        /**
         * An enum containing [Usage]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Usage] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CALLING_USER_ASSIGNMENT,
            FIRST_PARTY_APP_ASSIGNMENT,
            /** An enum member indicating that [Usage] was instantiated with an unknown value. */
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
                CALLING_USER_ASSIGNMENT -> Value.CALLING_USER_ASSIGNMENT
                FIRST_PARTY_APP_ASSIGNMENT -> Value.FIRST_PARTY_APP_ASSIGNMENT
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
                CALLING_USER_ASSIGNMENT -> Known.CALLING_USER_ASSIGNMENT
                FIRST_PARTY_APP_ASSIGNMENT -> Known.FIRST_PARTY_APP_ASSIGNMENT
                else -> throw TelnyxInvalidDataException("Unknown Usage: $value")
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

        fun validate(): Usage = apply {
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

            return other is Usage && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UploadCreateParams &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "UploadCreateParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
