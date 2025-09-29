// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.externalconnections

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.api.core.Enum
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.Params
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * This endpoint returns a list of your External Connections inside the 'data' attribute of the
 * response. External Connections are used by Telnyx customers to seamless configure SIP trunking
 * integrations with Telnyx Partners, through External Voice Integrations in Mission Control Portal.
 */
class ExternalConnectionListParams
private constructor(
    private val filter: Filter?,
    private val page: Page?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Filter parameter for external connections (deepObject style). Supports filtering by
     * connection_name, external_sip_connection, id, created_at, and phone_number.
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

        @JvmStatic fun none(): ExternalConnectionListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [ExternalConnectionListParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalConnectionListParams]. */
    class Builder internal constructor() {

        private var filter: Filter? = null
        private var page: Page? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(externalConnectionListParams: ExternalConnectionListParams) = apply {
            filter = externalConnectionListParams.filter
            page = externalConnectionListParams.page
            additionalHeaders = externalConnectionListParams.additionalHeaders.toBuilder()
            additionalQueryParams = externalConnectionListParams.additionalQueryParams.toBuilder()
        }

        /**
         * Filter parameter for external connections (deepObject style). Supports filtering by
         * connection_name, external_sip_connection, id, created_at, and phone_number.
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
         * Returns an immutable instance of [ExternalConnectionListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ExternalConnectionListParams =
            ExternalConnectionListParams(
                filter,
                page,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                filter?.let {
                    it.id().ifPresent { put("filter[id]", it) }
                    it.connectionName().ifPresent {
                        it.contains().ifPresent { put("filter[connection_name][contains]", it) }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[connection_name][$key]", value)
                            }
                        }
                    }
                    it.createdAt().ifPresent { put("filter[created_at]", it) }
                    it.externalSipConnection().ifPresent {
                        put("filter[external_sip_connection]", it.toString())
                    }
                    it.phoneNumber().ifPresent {
                        it.contains().ifPresent { put("filter[phone_number][contains]", it) }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[phone_number][$key]", value)
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
     * Filter parameter for external connections (deepObject style). Supports filtering by
     * connection_name, external_sip_connection, id, created_at, and phone_number.
     */
    class Filter
    private constructor(
        private val id: String?,
        private val connectionName: ConnectionName?,
        private val createdAt: String?,
        private val externalSipConnection: ExternalSipConnection?,
        private val phoneNumber: PhoneNumber?,
        private val additionalProperties: QueryParams,
    ) {

        /**
         * If present, connections with <code>id</code> matching the given value will be returned.
         */
        fun id(): Optional<String> = Optional.ofNullable(id)

        fun connectionName(): Optional<ConnectionName> = Optional.ofNullable(connectionName)

        /**
         * If present, connections with <code>created_at</code> date matching the given YYYY-MM-DD
         * date will be returned.
         */
        fun createdAt(): Optional<String> = Optional.ofNullable(createdAt)

        /**
         * If present, connections with <code>external_sip_connection</code> matching the given
         * value will be returned.
         */
        fun externalSipConnection(): Optional<ExternalSipConnection> =
            Optional.ofNullable(externalSipConnection)

        /**
         * Phone number filter for connections. Note: Despite the 'contains' name, this requires a
         * full E164 match per the original specification.
         */
        fun phoneNumber(): Optional<PhoneNumber> = Optional.ofNullable(phoneNumber)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Filter]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filter]. */
        class Builder internal constructor() {

            private var id: String? = null
            private var connectionName: ConnectionName? = null
            private var createdAt: String? = null
            private var externalSipConnection: ExternalSipConnection? = null
            private var phoneNumber: PhoneNumber? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                id = filter.id
                connectionName = filter.connectionName
                createdAt = filter.createdAt
                externalSipConnection = filter.externalSipConnection
                phoneNumber = filter.phoneNumber
                additionalProperties = filter.additionalProperties.toBuilder()
            }

            /**
             * If present, connections with <code>id</code> matching the given value will be
             * returned.
             */
            fun id(id: String?) = apply { this.id = id }

            /** Alias for calling [Builder.id] with `id.orElse(null)`. */
            fun id(id: Optional<String>) = id(id.getOrNull())

            fun connectionName(connectionName: ConnectionName?) = apply {
                this.connectionName = connectionName
            }

            /** Alias for calling [Builder.connectionName] with `connectionName.orElse(null)`. */
            fun connectionName(connectionName: Optional<ConnectionName>) =
                connectionName(connectionName.getOrNull())

            /**
             * If present, connections with <code>created_at</code> date matching the given
             * YYYY-MM-DD date will be returned.
             */
            fun createdAt(createdAt: String?) = apply { this.createdAt = createdAt }

            /** Alias for calling [Builder.createdAt] with `createdAt.orElse(null)`. */
            fun createdAt(createdAt: Optional<String>) = createdAt(createdAt.getOrNull())

            /**
             * If present, connections with <code>external_sip_connection</code> matching the given
             * value will be returned.
             */
            fun externalSipConnection(externalSipConnection: ExternalSipConnection?) = apply {
                this.externalSipConnection = externalSipConnection
            }

            /**
             * Alias for calling [Builder.externalSipConnection] with
             * `externalSipConnection.orElse(null)`.
             */
            fun externalSipConnection(externalSipConnection: Optional<ExternalSipConnection>) =
                externalSipConnection(externalSipConnection.getOrNull())

            /**
             * Phone number filter for connections. Note: Despite the 'contains' name, this requires
             * a full E164 match per the original specification.
             */
            fun phoneNumber(phoneNumber: PhoneNumber?) = apply { this.phoneNumber = phoneNumber }

            /** Alias for calling [Builder.phoneNumber] with `phoneNumber.orElse(null)`. */
            fun phoneNumber(phoneNumber: Optional<PhoneNumber>) =
                phoneNumber(phoneNumber.getOrNull())

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
                    id,
                    connectionName,
                    createdAt,
                    externalSipConnection,
                    phoneNumber,
                    additionalProperties.build(),
                )
        }

        class ConnectionName private constructor(private val contains: String?) {

            /**
             * If present, connections with <code>connection_name</code> containing the given value
             * will be returned. Matching is not case-sensitive. Requires at least three characters.
             */
            fun contains(): Optional<String> = Optional.ofNullable(contains)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [ConnectionName]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ConnectionName]. */
            class Builder internal constructor() {

                private var contains: String? = null

                @JvmSynthetic
                internal fun from(connectionName: ConnectionName) = apply {
                    contains = connectionName.contains
                }

                /**
                 * If present, connections with <code>connection_name</code> containing the given
                 * value will be returned. Matching is not case-sensitive. Requires at least three
                 * characters.
                 */
                fun contains(contains: String?) = apply { this.contains = contains }

                /** Alias for calling [Builder.contains] with `contains.orElse(null)`. */
                fun contains(contains: Optional<String>) = contains(contains.getOrNull())

                /**
                 * Returns an immutable instance of [ConnectionName].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ConnectionName = ConnectionName(contains)
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ConnectionName && contains == other.contains
            }

            private val hashCode: Int by lazy { Objects.hash(contains) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "ConnectionName{contains=$contains}"
        }

        /**
         * If present, connections with <code>external_sip_connection</code> matching the given
         * value will be returned.
         */
        class ExternalSipConnection
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val ZOOM = of("zoom")

                @JvmField val OPERATOR_CONNECT = of("operator_connect")

                @JvmStatic fun of(value: String) = ExternalSipConnection(JsonField.of(value))
            }

            /** An enum containing [ExternalSipConnection]'s known values. */
            enum class Known {
                ZOOM,
                OPERATOR_CONNECT,
            }

            /**
             * An enum containing [ExternalSipConnection]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [ExternalSipConnection] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ZOOM,
                OPERATOR_CONNECT,
                /**
                 * An enum member indicating that [ExternalSipConnection] was instantiated with an
                 * unknown value.
                 */
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
                    ZOOM -> Value.ZOOM
                    OPERATOR_CONNECT -> Value.OPERATOR_CONNECT
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
                    ZOOM -> Known.ZOOM
                    OPERATOR_CONNECT -> Known.OPERATOR_CONNECT
                    else ->
                        throw TelnyxInvalidDataException("Unknown ExternalSipConnection: $value")
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

            fun validate(): ExternalSipConnection = apply {
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

                return other is ExternalSipConnection && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * Phone number filter for connections. Note: Despite the 'contains' name, this requires a
         * full E164 match per the original specification.
         */
        class PhoneNumber private constructor(private val contains: String?) {

            /**
             * If present, connections associated with the given phone_number will be returned. A
             * full match is necessary with a e164 format.
             */
            fun contains(): Optional<String> = Optional.ofNullable(contains)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [PhoneNumber]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PhoneNumber]. */
            class Builder internal constructor() {

                private var contains: String? = null

                @JvmSynthetic
                internal fun from(phoneNumber: PhoneNumber) = apply {
                    contains = phoneNumber.contains
                }

                /**
                 * If present, connections associated with the given phone_number will be returned.
                 * A full match is necessary with a e164 format.
                 */
                fun contains(contains: String?) = apply { this.contains = contains }

                /** Alias for calling [Builder.contains] with `contains.orElse(null)`. */
                fun contains(contains: Optional<String>) = contains(contains.getOrNull())

                /**
                 * Returns an immutable instance of [PhoneNumber].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): PhoneNumber = PhoneNumber(contains)
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PhoneNumber && contains == other.contains
            }

            private val hashCode: Int by lazy { Objects.hash(contains) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "PhoneNumber{contains=$contains}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filter &&
                id == other.id &&
                connectionName == other.connectionName &&
                createdAt == other.createdAt &&
                externalSipConnection == other.externalSipConnection &&
                phoneNumber == other.phoneNumber &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                connectionName,
                createdAt,
                externalSipConnection,
                phoneNumber,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filter{id=$id, connectionName=$connectionName, createdAt=$createdAt, externalSipConnection=$externalSipConnection, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
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

        return other is ExternalConnectionListParams &&
            filter == other.filter &&
            page == other.page &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(filter, page, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ExternalConnectionListParams{filter=$filter, page=$page, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
