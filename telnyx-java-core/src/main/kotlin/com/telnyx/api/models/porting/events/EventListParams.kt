// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.porting.events

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.api.core.Enum
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.Params
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Returns a list of all porting events. */
class EventListParams
private constructor(
    private val filter: Filter?,
    private val page: Page?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Consolidated filter parameter (deepObject style). Originally: filter[type],
     * filter[porting_order_id], filter[created_at][gte], filter[created_at][lte]
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

        @JvmStatic fun none(): EventListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [EventListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EventListParams]. */
    class Builder internal constructor() {

        private var filter: Filter? = null
        private var page: Page? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(eventListParams: EventListParams) = apply {
            filter = eventListParams.filter
            page = eventListParams.page
            additionalHeaders = eventListParams.additionalHeaders.toBuilder()
            additionalQueryParams = eventListParams.additionalQueryParams.toBuilder()
        }

        /**
         * Consolidated filter parameter (deepObject style). Originally: filter[type],
         * filter[porting_order_id], filter[created_at][gte], filter[created_at][lte]
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
         * Returns an immutable instance of [EventListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): EventListParams =
            EventListParams(filter, page, additionalHeaders.build(), additionalQueryParams.build())
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                filter?.let {
                    it.createdAt().ifPresent {
                        it.gte().ifPresent {
                            put(
                                "filter[created_at][gte]",
                                DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it),
                            )
                        }
                        it.lte().ifPresent {
                            put(
                                "filter[created_at][lte]",
                                DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it),
                            )
                        }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[created_at][$key]", value)
                            }
                        }
                    }
                    it.portingOrderId().ifPresent { put("filter[porting_order_id]", it) }
                    it.type().ifPresent { put("filter[type]", it.toString()) }
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
     * Consolidated filter parameter (deepObject style). Originally: filter[type],
     * filter[porting_order_id], filter[created_at][gte], filter[created_at][lte]
     */
    class Filter
    private constructor(
        private val createdAt: CreatedAt?,
        private val portingOrderId: String?,
        private val type: Type?,
        private val additionalProperties: QueryParams,
    ) {

        /** Created at date range filtering operations */
        fun createdAt(): Optional<CreatedAt> = Optional.ofNullable(createdAt)

        /** Filter by porting order ID. */
        fun portingOrderId(): Optional<String> = Optional.ofNullable(portingOrderId)

        /** Filter by event type. */
        fun type(): Optional<Type> = Optional.ofNullable(type)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Filter]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filter]. */
        class Builder internal constructor() {

            private var createdAt: CreatedAt? = null
            private var portingOrderId: String? = null
            private var type: Type? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                createdAt = filter.createdAt
                portingOrderId = filter.portingOrderId
                type = filter.type
                additionalProperties = filter.additionalProperties.toBuilder()
            }

            /** Created at date range filtering operations */
            fun createdAt(createdAt: CreatedAt?) = apply { this.createdAt = createdAt }

            /** Alias for calling [Builder.createdAt] with `createdAt.orElse(null)`. */
            fun createdAt(createdAt: Optional<CreatedAt>) = createdAt(createdAt.getOrNull())

            /** Filter by porting order ID. */
            fun portingOrderId(portingOrderId: String?) = apply {
                this.portingOrderId = portingOrderId
            }

            /** Alias for calling [Builder.portingOrderId] with `portingOrderId.orElse(null)`. */
            fun portingOrderId(portingOrderId: Optional<String>) =
                portingOrderId(portingOrderId.getOrNull())

            /** Filter by event type. */
            fun type(type: Type?) = apply { this.type = type }

            /** Alias for calling [Builder.type] with `type.orElse(null)`. */
            fun type(type: Optional<Type>) = type(type.getOrNull())

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
                Filter(createdAt, portingOrderId, type, additionalProperties.build())
        }

        /** Created at date range filtering operations */
        class CreatedAt
        private constructor(private val gte: OffsetDateTime?, private val lte: OffsetDateTime?) {

            /** Filter by created at greater than or equal to. */
            fun gte(): Optional<OffsetDateTime> = Optional.ofNullable(gte)

            /** Filter by created at less than or equal to. */
            fun lte(): Optional<OffsetDateTime> = Optional.ofNullable(lte)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [CreatedAt]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CreatedAt]. */
            class Builder internal constructor() {

                private var gte: OffsetDateTime? = null
                private var lte: OffsetDateTime? = null

                @JvmSynthetic
                internal fun from(createdAt: CreatedAt) = apply {
                    gte = createdAt.gte
                    lte = createdAt.lte
                }

                /** Filter by created at greater than or equal to. */
                fun gte(gte: OffsetDateTime?) = apply { this.gte = gte }

                /** Alias for calling [Builder.gte] with `gte.orElse(null)`. */
                fun gte(gte: Optional<OffsetDateTime>) = gte(gte.getOrNull())

                /** Filter by created at less than or equal to. */
                fun lte(lte: OffsetDateTime?) = apply { this.lte = lte }

                /** Alias for calling [Builder.lte] with `lte.orElse(null)`. */
                fun lte(lte: Optional<OffsetDateTime>) = lte(lte.getOrNull())

                /**
                 * Returns an immutable instance of [CreatedAt].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): CreatedAt = CreatedAt(gte, lte)
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CreatedAt && gte == other.gte && lte == other.lte
            }

            private val hashCode: Int by lazy { Objects.hash(gte, lte) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "CreatedAt{gte=$gte, lte=$lte}"
        }

        /** Filter by event type. */
        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val PORTING_ORDER_DELETED = of("porting_order.deleted")

                @JvmField val PORTING_ORDER_LOA_UPDATED = of("porting_order.loa_updated")

                @JvmField
                val PORTING_ORDER_MESSAGING_CHANGED = of("porting_order.messaging_changed")

                @JvmField val PORTING_ORDER_STATUS_CHANGED = of("porting_order.status_changed")

                @JvmField
                val PORTING_ORDER_SHARING_TOKEN_EXPIRED = of("porting_order.sharing_token_expired")

                @JvmField val PORTING_ORDER_NEW_COMMENT = of("porting_order.new_comment")

                @JvmField val PORTING_ORDER_SPLIT = of("porting_order.split")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                PORTING_ORDER_DELETED,
                PORTING_ORDER_LOA_UPDATED,
                PORTING_ORDER_MESSAGING_CHANGED,
                PORTING_ORDER_STATUS_CHANGED,
                PORTING_ORDER_SHARING_TOKEN_EXPIRED,
                PORTING_ORDER_NEW_COMMENT,
                PORTING_ORDER_SPLIT,
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PORTING_ORDER_DELETED,
                PORTING_ORDER_LOA_UPDATED,
                PORTING_ORDER_MESSAGING_CHANGED,
                PORTING_ORDER_STATUS_CHANGED,
                PORTING_ORDER_SHARING_TOKEN_EXPIRED,
                PORTING_ORDER_NEW_COMMENT,
                PORTING_ORDER_SPLIT,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    PORTING_ORDER_DELETED -> Value.PORTING_ORDER_DELETED
                    PORTING_ORDER_LOA_UPDATED -> Value.PORTING_ORDER_LOA_UPDATED
                    PORTING_ORDER_MESSAGING_CHANGED -> Value.PORTING_ORDER_MESSAGING_CHANGED
                    PORTING_ORDER_STATUS_CHANGED -> Value.PORTING_ORDER_STATUS_CHANGED
                    PORTING_ORDER_SHARING_TOKEN_EXPIRED -> Value.PORTING_ORDER_SHARING_TOKEN_EXPIRED
                    PORTING_ORDER_NEW_COMMENT -> Value.PORTING_ORDER_NEW_COMMENT
                    PORTING_ORDER_SPLIT -> Value.PORTING_ORDER_SPLIT
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    PORTING_ORDER_DELETED -> Known.PORTING_ORDER_DELETED
                    PORTING_ORDER_LOA_UPDATED -> Known.PORTING_ORDER_LOA_UPDATED
                    PORTING_ORDER_MESSAGING_CHANGED -> Known.PORTING_ORDER_MESSAGING_CHANGED
                    PORTING_ORDER_STATUS_CHANGED -> Known.PORTING_ORDER_STATUS_CHANGED
                    PORTING_ORDER_SHARING_TOKEN_EXPIRED -> Known.PORTING_ORDER_SHARING_TOKEN_EXPIRED
                    PORTING_ORDER_NEW_COMMENT -> Known.PORTING_ORDER_NEW_COMMENT
                    PORTING_ORDER_SPLIT -> Known.PORTING_ORDER_SPLIT
                    else -> throw TelnyxInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filter &&
                createdAt == other.createdAt &&
                portingOrderId == other.portingOrderId &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(createdAt, portingOrderId, type, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filter{createdAt=$createdAt, portingOrderId=$portingOrderId, type=$type, additionalProperties=$additionalProperties}"
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

        return other is EventListParams &&
            filter == other.filter &&
            page == other.page &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(filter, page, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "EventListParams{filter=$filter, page=$page, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
