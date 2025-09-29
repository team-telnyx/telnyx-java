// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalconnections.releases

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Returns a list of your Releases for the given external connection. These are automatically
 * created when you change the `connection_id` of a phone number that is currently on Microsoft
 * Teams.
 */
class ReleaseListParams
private constructor(
    private val id: String?,
    private val filter: Filter?,
    private val page: Page?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /**
     * Filter parameter for releases (deepObject style). Supports filtering by status,
     * civic_address_id, location_id, and phone_number with eq/contains operations.
     */
    fun filter(): Optional<Filter> = Optional.ofNullable(filter)

    /** Consolidated page parameter (deepObject style). Originally: page[size], page[number] */
    fun page(): Optional<Page> = Optional.ofNullable(page)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ReleaseListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ReleaseListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ReleaseListParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var filter: Filter? = null
        private var page: Page? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(releaseListParams: ReleaseListParams) = apply {
            id = releaseListParams.id
            filter = releaseListParams.filter
            page = releaseListParams.page
            additionalHeaders = releaseListParams.additionalHeaders.toBuilder()
            additionalQueryParams = releaseListParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Filter parameter for releases (deepObject style). Supports filtering by status,
         * civic_address_id, location_id, and phone_number with eq/contains operations.
         */
        fun filter(filter: Filter?) = apply { this.filter = filter }

        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
        fun filter(filter: Optional<Filter>) = filter(filter.getOrNull())

        /** Consolidated page parameter (deepObject style). Originally: page[size], page[number] */
        fun page(page: Page?) = apply { this.page = page }

        /** Alias for calling [Builder.page] with `page.orElse(null)`. */
        fun page(page: Optional<Page>) = page(page.getOrNull())

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
         * Returns an immutable instance of [ReleaseListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ReleaseListParams =
            ReleaseListParams(
                id,
                filter,
                page,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                filter?.let {
                    it.civicAddressId().ifPresent {
                        it.eq().ifPresent { put("filter[civic_address_id][eq]", it) }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[civic_address_id][$key]", value)
                            }
                        }
                    }
                    it.locationId().ifPresent {
                        it.eq().ifPresent { put("filter[location_id][eq]", it) }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[location_id][$key]", value)
                            }
                        }
                    }
                    it.phoneNumber().ifPresent {
                        it.contains().ifPresent { put("filter[phone_number][contains]", it) }
                        it.eq().ifPresent { put("filter[phone_number][eq]", it) }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[phone_number][$key]", value)
                            }
                        }
                    }
                    it.status().ifPresent {
                        it.eq().ifPresent {
                            put("filter[status][eq]", it.joinToString(",") { it.toString() })
                        }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[status][$key]", value)
                            }
                        }
                    }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("filter[$key]", value)
                        }
                    }
                }
                page?.let {
                    it.number().ifPresent { put("page[number]", it.toString()) }
                    it.size().ifPresent { put("page[size]", it.toString()) }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("page[$key]", value)
                        }
                    }
                }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Filter parameter for releases (deepObject style). Supports filtering by status,
     * civic_address_id, location_id, and phone_number with eq/contains operations.
     */
    class Filter
    private constructor(
        private val civicAddressId: CivicAddressId?,
        private val locationId: LocationId?,
        private val phoneNumber: PhoneNumber?,
        private val status: Status?,
        private val additionalProperties: QueryParams,
    ) {

        fun civicAddressId(): Optional<CivicAddressId> = Optional.ofNullable(civicAddressId)

        fun locationId(): Optional<LocationId> = Optional.ofNullable(locationId)

        /**
         * Phone number filter operations. Use 'eq' for exact matches or 'contains' for partial
         * matches.
         */
        fun phoneNumber(): Optional<PhoneNumber> = Optional.ofNullable(phoneNumber)

        fun status(): Optional<Status> = Optional.ofNullable(status)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Filter]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filter]. */
        class Builder internal constructor() {

            private var civicAddressId: CivicAddressId? = null
            private var locationId: LocationId? = null
            private var phoneNumber: PhoneNumber? = null
            private var status: Status? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                civicAddressId = filter.civicAddressId
                locationId = filter.locationId
                phoneNumber = filter.phoneNumber
                status = filter.status
                additionalProperties = filter.additionalProperties.toBuilder()
            }

            fun civicAddressId(civicAddressId: CivicAddressId?) = apply {
                this.civicAddressId = civicAddressId
            }

            /** Alias for calling [Builder.civicAddressId] with `civicAddressId.orElse(null)`. */
            fun civicAddressId(civicAddressId: Optional<CivicAddressId>) =
                civicAddressId(civicAddressId.getOrNull())

            fun locationId(locationId: LocationId?) = apply { this.locationId = locationId }

            /** Alias for calling [Builder.locationId] with `locationId.orElse(null)`. */
            fun locationId(locationId: Optional<LocationId>) = locationId(locationId.getOrNull())

            /**
             * Phone number filter operations. Use 'eq' for exact matches or 'contains' for partial
             * matches.
             */
            fun phoneNumber(phoneNumber: PhoneNumber?) = apply { this.phoneNumber = phoneNumber }

            /** Alias for calling [Builder.phoneNumber] with `phoneNumber.orElse(null)`. */
            fun phoneNumber(phoneNumber: Optional<PhoneNumber>) =
                phoneNumber(phoneNumber.getOrNull())

            fun status(status: Status?) = apply { this.status = status }

            /** Alias for calling [Builder.status] with `status.orElse(null)`. */
            fun status(status: Optional<Status>) = status(status.getOrNull())

            fun additionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceAdditionalProperties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAllAdditionalProperties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeAdditionalProperties(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                additionalProperties.removeAll(keys)
            }

            /**
             * Returns an immutable instance of [Filter].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Filter =
                Filter(
                    civicAddressId,
                    locationId,
                    phoneNumber,
                    status,
                    additionalProperties.build(),
                )
        }

        class CivicAddressId private constructor(private val eq: String?) {

            /** The civic address ID to filter by */
            fun eq(): Optional<String> = Optional.ofNullable(eq)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [CivicAddressId]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CivicAddressId]. */
            class Builder internal constructor() {

                private var eq: String? = null

                @JvmSynthetic
                internal fun from(civicAddressId: CivicAddressId) = apply { eq = civicAddressId.eq }

                /** The civic address ID to filter by */
                fun eq(eq: String?) = apply { this.eq = eq }

                /** Alias for calling [Builder.eq] with `eq.orElse(null)`. */
                fun eq(eq: Optional<String>) = eq(eq.getOrNull())

                /**
                 * Returns an immutable instance of [CivicAddressId].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): CivicAddressId = CivicAddressId(eq)
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CivicAddressId && eq == other.eq
            }

            private val hashCode: Int by lazy { Objects.hash(eq) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "CivicAddressId{eq=$eq}"
        }

        class LocationId private constructor(private val eq: String?) {

            /** The location ID to filter by */
            fun eq(): Optional<String> = Optional.ofNullable(eq)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [LocationId]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [LocationId]. */
            class Builder internal constructor() {

                private var eq: String? = null

                @JvmSynthetic
                internal fun from(locationId: LocationId) = apply { eq = locationId.eq }

                /** The location ID to filter by */
                fun eq(eq: String?) = apply { this.eq = eq }

                /** Alias for calling [Builder.eq] with `eq.orElse(null)`. */
                fun eq(eq: Optional<String>) = eq(eq.getOrNull())

                /**
                 * Returns an immutable instance of [LocationId].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): LocationId = LocationId(eq)
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is LocationId && eq == other.eq
            }

            private val hashCode: Int by lazy { Objects.hash(eq) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "LocationId{eq=$eq}"
        }

        /**
         * Phone number filter operations. Use 'eq' for exact matches or 'contains' for partial
         * matches.
         */
        class PhoneNumber
        private constructor(private val contains: String?, private val eq: String?) {

            /** The partial phone number to filter by. Requires 3-15 digits. */
            fun contains(): Optional<String> = Optional.ofNullable(contains)

            /** The phone number to filter by */
            fun eq(): Optional<String> = Optional.ofNullable(eq)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [PhoneNumber]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PhoneNumber]. */
            class Builder internal constructor() {

                private var contains: String? = null
                private var eq: String? = null

                @JvmSynthetic
                internal fun from(phoneNumber: PhoneNumber) = apply {
                    contains = phoneNumber.contains
                    eq = phoneNumber.eq
                }

                /** The partial phone number to filter by. Requires 3-15 digits. */
                fun contains(contains: String?) = apply { this.contains = contains }

                /** Alias for calling [Builder.contains] with `contains.orElse(null)`. */
                fun contains(contains: Optional<String>) = contains(contains.getOrNull())

                /** The phone number to filter by */
                fun eq(eq: String?) = apply { this.eq = eq }

                /** Alias for calling [Builder.eq] with `eq.orElse(null)`. */
                fun eq(eq: Optional<String>) = eq(eq.getOrNull())

                /**
                 * Returns an immutable instance of [PhoneNumber].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): PhoneNumber = PhoneNumber(contains, eq)
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PhoneNumber && contains == other.contains && eq == other.eq
            }

            private val hashCode: Int by lazy { Objects.hash(contains, eq) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "PhoneNumber{contains=$contains, eq=$eq}"
        }

        class Status private constructor(private val eq: List<Eq>?) {

            /** The status of the release to filter by */
            fun eq(): Optional<List<Eq>> = Optional.ofNullable(eq)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Status]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Status]. */
            class Builder internal constructor() {

                private var eq: MutableList<Eq>? = null

                @JvmSynthetic
                internal fun from(status: Status) = apply { eq = status.eq?.toMutableList() }

                /** The status of the release to filter by */
                fun eq(eq: List<Eq>?) = apply { this.eq = eq?.toMutableList() }

                /** Alias for calling [Builder.eq] with `eq.orElse(null)`. */
                fun eq(eq: Optional<List<Eq>>) = eq(eq.getOrNull())

                /**
                 * Adds a single [Eq] to [Builder.eq].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addEq(eq: Eq) = apply {
                    this.eq = (this.eq ?: mutableListOf()).apply { add(eq) }
                }

                /**
                 * Returns an immutable instance of [Status].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Status = Status(eq?.toImmutable())
            }

            class Eq @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                    @JvmField val PENDING_UPLOAD = of("pending_upload")

                    @JvmField val PENDING = of("pending")

                    @JvmField val IN_PROGRESS = of("in_progress")

                    @JvmField val COMPLETE = of("complete")

                    @JvmField val FAILED = of("failed")

                    @JvmField val EXPIRED = of("expired")

                    @JvmField val UNKNOWN = of("unknown")

                    @JvmStatic fun of(value: String) = Eq(JsonField.of(value))
                }

                /** An enum containing [Eq]'s known values. */
                enum class Known {
                    PENDING_UPLOAD,
                    PENDING,
                    IN_PROGRESS,
                    COMPLETE,
                    FAILED,
                    EXPIRED,
                    UNKNOWN,
                }

                /**
                 * An enum containing [Eq]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Eq] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PENDING_UPLOAD,
                    PENDING,
                    IN_PROGRESS,
                    COMPLETE,
                    FAILED,
                    EXPIRED,
                    UNKNOWN,
                    /**
                     * An enum member indicating that [Eq] was instantiated with an unknown value.
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
                        PENDING_UPLOAD -> Value.PENDING_UPLOAD
                        PENDING -> Value.PENDING
                        IN_PROGRESS -> Value.IN_PROGRESS
                        COMPLETE -> Value.COMPLETE
                        FAILED -> Value.FAILED
                        EXPIRED -> Value.EXPIRED
                        UNKNOWN -> Value.UNKNOWN
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
                        PENDING_UPLOAD -> Known.PENDING_UPLOAD
                        PENDING -> Known.PENDING
                        IN_PROGRESS -> Known.IN_PROGRESS
                        COMPLETE -> Known.COMPLETE
                        FAILED -> Known.FAILED
                        EXPIRED -> Known.EXPIRED
                        UNKNOWN -> Known.UNKNOWN
                        else -> throw TelnyxInvalidDataException("Unknown Eq: $value")
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

                fun validate(): Eq = apply {
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

                    return other is Eq && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Status && eq == other.eq
            }

            private val hashCode: Int by lazy { Objects.hash(eq) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Status{eq=$eq}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filter &&
                civicAddressId == other.civicAddressId &&
                locationId == other.locationId &&
                phoneNumber == other.phoneNumber &&
                status == other.status &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(civicAddressId, locationId, phoneNumber, status, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filter{civicAddressId=$civicAddressId, locationId=$locationId, phoneNumber=$phoneNumber, status=$status, additionalProperties=$additionalProperties}"
    }

    /** Consolidated page parameter (deepObject style). Originally: page[size], page[number] */
    class Page
    private constructor(
        private val number: Long?,
        private val size: Long?,
        private val additionalProperties: QueryParams,
    ) {

        /** The page number to load */
        fun number(): Optional<Long> = Optional.ofNullable(number)

        /** The size of the page */
        fun size(): Optional<Long> = Optional.ofNullable(size)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Page]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Page]. */
        class Builder internal constructor() {

            private var number: Long? = null
            private var size: Long? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(page: Page) = apply {
                number = page.number
                size = page.size
                additionalProperties = page.additionalProperties.toBuilder()
            }

            /** The page number to load */
            fun number(number: Long?) = apply { this.number = number }

            /**
             * Alias for [Builder.number].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun number(number: Long) = number(number as Long?)

            /** Alias for calling [Builder.number] with `number.orElse(null)`. */
            fun number(number: Optional<Long>) = number(number.getOrNull())

            /** The size of the page */
            fun size(size: Long?) = apply { this.size = size }

            /**
             * Alias for [Builder.size].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun size(size: Long) = size(size as Long?)

            /** Alias for calling [Builder.size] with `size.orElse(null)`. */
            fun size(size: Optional<Long>) = size(size.getOrNull())

            fun additionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceAdditionalProperties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAllAdditionalProperties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeAdditionalProperties(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                additionalProperties.removeAll(keys)
            }

            /**
             * Returns an immutable instance of [Page].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Page = Page(number, size, additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Page &&
                number == other.number &&
                size == other.size &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(number, size, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Page{number=$number, size=$size, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ReleaseListParams &&
            id == other.id &&
            filter == other.filter &&
            page == other.page &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(id, filter, page, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ReleaseListParams{id=$id, filter=$filter, page=$page, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
