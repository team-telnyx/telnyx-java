// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders.phonenumberblocks

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Returns a list of all phone number blocks of a porting order. */
class PhoneNumberBlockListParams
private constructor(
    private val portingOrderId: String?,
    private val filter: Filter?,
    private val page: Page?,
    private val sort: Sort?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun portingOrderId(): Optional<String> = Optional.ofNullable(portingOrderId)

    /**
     * Consolidated filter parameter (deepObject style). Originally: filter[porting_order_id],
     * filter[support_key], filter[status], filter[phone_number], filter[activation_status],
     * filter[portability_status]
     */
    fun filter(): Optional<Filter> = Optional.ofNullable(filter)

    /** Consolidated page parameter (deepObject style). Originally: page[size], page[number] */
    fun page(): Optional<Page> = Optional.ofNullable(page)

    /** Consolidated sort parameter (deepObject style). Originally: sort[value] */
    fun sort(): Optional<Sort> = Optional.ofNullable(sort)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): PhoneNumberBlockListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [PhoneNumberBlockListParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PhoneNumberBlockListParams]. */
    class Builder internal constructor() {

        private var portingOrderId: String? = null
        private var filter: Filter? = null
        private var page: Page? = null
        private var sort: Sort? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(phoneNumberBlockListParams: PhoneNumberBlockListParams) = apply {
            portingOrderId = phoneNumberBlockListParams.portingOrderId
            filter = phoneNumberBlockListParams.filter
            page = phoneNumberBlockListParams.page
            sort = phoneNumberBlockListParams.sort
            additionalHeaders = phoneNumberBlockListParams.additionalHeaders.toBuilder()
            additionalQueryParams = phoneNumberBlockListParams.additionalQueryParams.toBuilder()
        }

        fun portingOrderId(portingOrderId: String?) = apply { this.portingOrderId = portingOrderId }

        /** Alias for calling [Builder.portingOrderId] with `portingOrderId.orElse(null)`. */
        fun portingOrderId(portingOrderId: Optional<String>) =
            portingOrderId(portingOrderId.getOrNull())

        /**
         * Consolidated filter parameter (deepObject style). Originally: filter[porting_order_id],
         * filter[support_key], filter[status], filter[phone_number], filter[activation_status],
         * filter[portability_status]
         */
        fun filter(filter: Filter?) = apply { this.filter = filter }

        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
        fun filter(filter: Optional<Filter>) = filter(filter.getOrNull())

        /** Consolidated page parameter (deepObject style). Originally: page[size], page[number] */
        fun page(page: Page?) = apply { this.page = page }

        /** Alias for calling [Builder.page] with `page.orElse(null)`. */
        fun page(page: Optional<Page>) = page(page.getOrNull())

        /** Consolidated sort parameter (deepObject style). Originally: sort[value] */
        fun sort(sort: Sort?) = apply { this.sort = sort }

        /** Alias for calling [Builder.sort] with `sort.orElse(null)`. */
        fun sort(sort: Optional<Sort>) = sort(sort.getOrNull())

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
         * Returns an immutable instance of [PhoneNumberBlockListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PhoneNumberBlockListParams =
            PhoneNumberBlockListParams(
                portingOrderId,
                filter,
                page,
                sort,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> portingOrderId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                filter?.let {
                    it.activationStatus().ifPresent {
                        put("filter[activation_status]", it.toString())
                    }
                    it.phoneNumber().ifPresent { put("filter[phone_number]", it.joinToString(",")) }
                    it.portabilityStatus().ifPresent {
                        put("filter[portability_status]", it.toString())
                    }
                    it.portingOrderId().ifPresent {
                        put("filter[porting_order_id]", it.joinToString(","))
                    }
                    it.status().ifPresent {
                        it.accept(
                            object : Filter.Status.Visitor<Unit> {
                                override fun visitUnionMember0(
                                    unionMember0: Filter.Status.UnionMember0
                                ) {
                                    put("filter[status]", unionMember0.toString())
                                }

                                override fun visitUnnamedSchemaWithArrayParent2s(
                                    unnamedSchemaWithArrayParent2s:
                                        List<Filter.Status.UnnamedSchemaWithArrayParent2>
                                ) {
                                    put(
                                        "filter[status]",
                                        unnamedSchemaWithArrayParent2s.joinToString(",") {
                                            it.toString()
                                        },
                                    )
                                }
                            }
                        )
                    }
                    it.supportKey().ifPresent {
                        it.accept(
                            object : Filter.SupportKey.Visitor<Unit> {
                                override fun visitString(string: String) {
                                    put("filter[support_key]", string)
                                }

                                override fun visitStrings(strings: List<String>) {
                                    put("filter[support_key]", strings.joinToString(","))
                                }
                            }
                        )
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
                sort?.let {
                    it.value().ifPresent { put("sort[value]", it.toString()) }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("sort[$key]", value)
                        }
                    }
                }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Consolidated filter parameter (deepObject style). Originally: filter[porting_order_id],
     * filter[support_key], filter[status], filter[phone_number], filter[activation_status],
     * filter[portability_status]
     */
    class Filter
    private constructor(
        private val activationStatus: ActivationStatus?,
        private val phoneNumber: List<String>?,
        private val portabilityStatus: PortabilityStatus?,
        private val portingOrderId: List<String>?,
        private val status: Status?,
        private val supportKey: SupportKey?,
        private val additionalProperties: QueryParams,
    ) {

        /** Filter results by activation status */
        fun activationStatus(): Optional<ActivationStatus> = Optional.ofNullable(activationStatus)

        /** Filter results by a list of phone numbers */
        fun phoneNumber(): Optional<List<String>> = Optional.ofNullable(phoneNumber)

        /** Filter results by portability status */
        fun portabilityStatus(): Optional<PortabilityStatus> =
            Optional.ofNullable(portabilityStatus)

        /** Filter results by a list of porting order ids */
        fun portingOrderId(): Optional<List<String>> = Optional.ofNullable(portingOrderId)

        /** Filter porting orders by status(es). Originally: filter[status], filter[status][in][] */
        fun status(): Optional<Status> = Optional.ofNullable(status)

        /**
         * Filter results by support key(s). Originally: filter[support_key][eq],
         * filter[support_key][in][]
         */
        fun supportKey(): Optional<SupportKey> = Optional.ofNullable(supportKey)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Filter]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filter]. */
        class Builder internal constructor() {

            private var activationStatus: ActivationStatus? = null
            private var phoneNumber: MutableList<String>? = null
            private var portabilityStatus: PortabilityStatus? = null
            private var portingOrderId: MutableList<String>? = null
            private var status: Status? = null
            private var supportKey: SupportKey? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                activationStatus = filter.activationStatus
                phoneNumber = filter.phoneNumber?.toMutableList()
                portabilityStatus = filter.portabilityStatus
                portingOrderId = filter.portingOrderId?.toMutableList()
                status = filter.status
                supportKey = filter.supportKey
                additionalProperties = filter.additionalProperties.toBuilder()
            }

            /** Filter results by activation status */
            fun activationStatus(activationStatus: ActivationStatus?) = apply {
                this.activationStatus = activationStatus
            }

            /**
             * Alias for calling [Builder.activationStatus] with `activationStatus.orElse(null)`.
             */
            fun activationStatus(activationStatus: Optional<ActivationStatus>) =
                activationStatus(activationStatus.getOrNull())

            /** Filter results by a list of phone numbers */
            fun phoneNumber(phoneNumber: List<String>?) = apply {
                this.phoneNumber = phoneNumber?.toMutableList()
            }

            /** Alias for calling [Builder.phoneNumber] with `phoneNumber.orElse(null)`. */
            fun phoneNumber(phoneNumber: Optional<List<String>>) =
                phoneNumber(phoneNumber.getOrNull())

            /**
             * Adds a single [String] to [Builder.phoneNumber].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPhoneNumber(phoneNumber: String) = apply {
                this.phoneNumber = (this.phoneNumber ?: mutableListOf()).apply { add(phoneNumber) }
            }

            /** Filter results by portability status */
            fun portabilityStatus(portabilityStatus: PortabilityStatus?) = apply {
                this.portabilityStatus = portabilityStatus
            }

            /**
             * Alias for calling [Builder.portabilityStatus] with `portabilityStatus.orElse(null)`.
             */
            fun portabilityStatus(portabilityStatus: Optional<PortabilityStatus>) =
                portabilityStatus(portabilityStatus.getOrNull())

            /** Filter results by a list of porting order ids */
            fun portingOrderId(portingOrderId: List<String>?) = apply {
                this.portingOrderId = portingOrderId?.toMutableList()
            }

            /** Alias for calling [Builder.portingOrderId] with `portingOrderId.orElse(null)`. */
            fun portingOrderId(portingOrderId: Optional<List<String>>) =
                portingOrderId(portingOrderId.getOrNull())

            /**
             * Adds a single [String] to [Builder.portingOrderId].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPortingOrderId(portingOrderId: String) = apply {
                this.portingOrderId =
                    (this.portingOrderId ?: mutableListOf()).apply { add(portingOrderId) }
            }

            /**
             * Filter porting orders by status(es). Originally: filter[status], filter[status][in][]
             */
            fun status(status: Status?) = apply { this.status = status }

            /** Alias for calling [Builder.status] with `status.orElse(null)`. */
            fun status(status: Optional<Status>) = status(status.getOrNull())

            /** Alias for calling [status] with `Status.ofUnionMember0(unionMember0)`. */
            fun status(unionMember0: Status.UnionMember0) =
                status(Status.ofUnionMember0(unionMember0))

            /**
             * Alias for calling [status] with
             * `Status.ofUnnamedSchemaWithArrayParent2s(unnamedSchemaWithArrayParent2s)`.
             */
            fun statusOfUnnamedSchemaWithArrayParent2s(
                unnamedSchemaWithArrayParent2s: List<Status.UnnamedSchemaWithArrayParent2>
            ) = status(Status.ofUnnamedSchemaWithArrayParent2s(unnamedSchemaWithArrayParent2s))

            /**
             * Filter results by support key(s). Originally: filter[support_key][eq],
             * filter[support_key][in][]
             */
            fun supportKey(supportKey: SupportKey?) = apply { this.supportKey = supportKey }

            /** Alias for calling [Builder.supportKey] with `supportKey.orElse(null)`. */
            fun supportKey(supportKey: Optional<SupportKey>) = supportKey(supportKey.getOrNull())

            /** Alias for calling [supportKey] with `SupportKey.ofString(string)`. */
            fun supportKey(string: String) = supportKey(SupportKey.ofString(string))

            /** Alias for calling [supportKey] with `SupportKey.ofStrings(strings)`. */
            fun supportKeyOfStrings(strings: List<String>) =
                supportKey(SupportKey.ofStrings(strings))

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
                    activationStatus,
                    phoneNumber?.toImmutable(),
                    portabilityStatus,
                    portingOrderId?.toImmutable(),
                    status,
                    supportKey,
                    additionalProperties.build(),
                )
        }

        /** Filter results by activation status */
        class ActivationStatus
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

                @JvmField val NEW = of("New")

                @JvmField val PENDING = of("Pending")

                @JvmField val CONFLICT = of("Conflict")

                @JvmField val CANCEL_PENDING = of("Cancel Pending")

                @JvmField val FAILED = of("Failed")

                @JvmField val CONCURRED = of("Concurred")

                @JvmField val ACTIVATE_RDY = of("Activate RDY")

                @JvmField val DISCONNECT_PENDING = of("Disconnect Pending")

                @JvmField val CONCURRENCE_SENT = of("Concurrence Sent")

                @JvmField val OLD = of("Old")

                @JvmField val SENDING = of("Sending")

                @JvmField val ACTIVE = of("Active")

                @JvmField val CANCELLED = of("Cancelled")

                @JvmStatic fun of(value: String) = ActivationStatus(JsonField.of(value))
            }

            /** An enum containing [ActivationStatus]'s known values. */
            enum class Known {
                NEW,
                PENDING,
                CONFLICT,
                CANCEL_PENDING,
                FAILED,
                CONCURRED,
                ACTIVATE_RDY,
                DISCONNECT_PENDING,
                CONCURRENCE_SENT,
                OLD,
                SENDING,
                ACTIVE,
                CANCELLED,
            }

            /**
             * An enum containing [ActivationStatus]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [ActivationStatus] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                NEW,
                PENDING,
                CONFLICT,
                CANCEL_PENDING,
                FAILED,
                CONCURRED,
                ACTIVATE_RDY,
                DISCONNECT_PENDING,
                CONCURRENCE_SENT,
                OLD,
                SENDING,
                ACTIVE,
                CANCELLED,
                /**
                 * An enum member indicating that [ActivationStatus] was instantiated with an
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
                    NEW -> Value.NEW
                    PENDING -> Value.PENDING
                    CONFLICT -> Value.CONFLICT
                    CANCEL_PENDING -> Value.CANCEL_PENDING
                    FAILED -> Value.FAILED
                    CONCURRED -> Value.CONCURRED
                    ACTIVATE_RDY -> Value.ACTIVATE_RDY
                    DISCONNECT_PENDING -> Value.DISCONNECT_PENDING
                    CONCURRENCE_SENT -> Value.CONCURRENCE_SENT
                    OLD -> Value.OLD
                    SENDING -> Value.SENDING
                    ACTIVE -> Value.ACTIVE
                    CANCELLED -> Value.CANCELLED
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
                    NEW -> Known.NEW
                    PENDING -> Known.PENDING
                    CONFLICT -> Known.CONFLICT
                    CANCEL_PENDING -> Known.CANCEL_PENDING
                    FAILED -> Known.FAILED
                    CONCURRED -> Known.CONCURRED
                    ACTIVATE_RDY -> Known.ACTIVATE_RDY
                    DISCONNECT_PENDING -> Known.DISCONNECT_PENDING
                    CONCURRENCE_SENT -> Known.CONCURRENCE_SENT
                    OLD -> Known.OLD
                    SENDING -> Known.SENDING
                    ACTIVE -> Known.ACTIVE
                    CANCELLED -> Known.CANCELLED
                    else -> throw TelnyxInvalidDataException("Unknown ActivationStatus: $value")
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

            fun validate(): ActivationStatus = apply {
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

                return other is ActivationStatus && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Filter results by portability status */
        class PortabilityStatus
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

                @JvmField val PENDING = of("pending")

                @JvmField val CONFIRMED = of("confirmed")

                @JvmField val PROVISIONAL = of("provisional")

                @JvmStatic fun of(value: String) = PortabilityStatus(JsonField.of(value))
            }

            /** An enum containing [PortabilityStatus]'s known values. */
            enum class Known {
                PENDING,
                CONFIRMED,
                PROVISIONAL,
            }

            /**
             * An enum containing [PortabilityStatus]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [PortabilityStatus] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PENDING,
                CONFIRMED,
                PROVISIONAL,
                /**
                 * An enum member indicating that [PortabilityStatus] was instantiated with an
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
                    PENDING -> Value.PENDING
                    CONFIRMED -> Value.CONFIRMED
                    PROVISIONAL -> Value.PROVISIONAL
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
                    PENDING -> Known.PENDING
                    CONFIRMED -> Known.CONFIRMED
                    PROVISIONAL -> Known.PROVISIONAL
                    else -> throw TelnyxInvalidDataException("Unknown PortabilityStatus: $value")
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

            fun validate(): PortabilityStatus = apply {
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

                return other is PortabilityStatus && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Filter porting orders by status(es). Originally: filter[status], filter[status][in][] */
        class Status
        private constructor(
            private val unionMember0: UnionMember0? = null,
            private val unnamedSchemaWithArrayParent2s: List<UnnamedSchemaWithArrayParent2>? = null,
        ) {

            /** Filter by single status */
            fun unionMember0(): Optional<UnionMember0> = Optional.ofNullable(unionMember0)

            /** Filter by multiple statuses (in operation) */
            fun unnamedSchemaWithArrayParent2s(): Optional<List<UnnamedSchemaWithArrayParent2>> =
                Optional.ofNullable(unnamedSchemaWithArrayParent2s)

            fun isUnionMember0(): Boolean = unionMember0 != null

            fun isUnnamedSchemaWithArrayParent2s(): Boolean = unnamedSchemaWithArrayParent2s != null

            /** Filter by single status */
            fun asUnionMember0(): UnionMember0 = unionMember0.getOrThrow("unionMember0")

            /** Filter by multiple statuses (in operation) */
            fun asUnnamedSchemaWithArrayParent2s(): List<UnnamedSchemaWithArrayParent2> =
                unnamedSchemaWithArrayParent2s.getOrThrow("unnamedSchemaWithArrayParent2s")

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    unionMember0 != null -> visitor.visitUnionMember0(unionMember0)
                    unnamedSchemaWithArrayParent2s != null ->
                        visitor.visitUnnamedSchemaWithArrayParent2s(unnamedSchemaWithArrayParent2s)
                    else -> throw IllegalStateException("Invalid Status")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Status &&
                    unionMember0 == other.unionMember0 &&
                    unnamedSchemaWithArrayParent2s == other.unnamedSchemaWithArrayParent2s
            }

            override fun hashCode(): Int =
                Objects.hash(unionMember0, unnamedSchemaWithArrayParent2s)

            override fun toString(): String =
                when {
                    unionMember0 != null -> "Status{unionMember0=$unionMember0}"
                    unnamedSchemaWithArrayParent2s != null ->
                        "Status{unnamedSchemaWithArrayParent2s=$unnamedSchemaWithArrayParent2s}"
                    else -> throw IllegalStateException("Invalid Status")
                }

            companion object {

                /** Filter by single status */
                @JvmStatic
                fun ofUnionMember0(unionMember0: UnionMember0) = Status(unionMember0 = unionMember0)

                /** Filter by multiple statuses (in operation) */
                @JvmStatic
                fun ofUnnamedSchemaWithArrayParent2s(
                    unnamedSchemaWithArrayParent2s: List<UnnamedSchemaWithArrayParent2>
                ) =
                    Status(
                        unnamedSchemaWithArrayParent2s =
                            unnamedSchemaWithArrayParent2s.toImmutable()
                    )
            }

            /**
             * An interface that defines how to map each variant of [Status] to a value of type [T].
             */
            interface Visitor<out T> {

                /** Filter by single status */
                fun visitUnionMember0(unionMember0: UnionMember0): T

                /** Filter by multiple statuses (in operation) */
                fun visitUnnamedSchemaWithArrayParent2s(
                    unnamedSchemaWithArrayParent2s: List<UnnamedSchemaWithArrayParent2>
                ): T
            }

            /** Filter by single status */
            class UnionMember0
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

                    @JvmField val DRAFT = of("draft")

                    @JvmField val IN_PROCESS = of("in-process")

                    @JvmField val SUBMITTED = of("submitted")

                    @JvmField val EXCEPTION = of("exception")

                    @JvmField val FOC_DATE_CONFIRMED = of("foc-date-confirmed")

                    @JvmField val CANCEL_PENDING = of("cancel-pending")

                    @JvmField val PORTED = of("ported")

                    @JvmField val CANCELLED = of("cancelled")

                    @JvmStatic fun of(value: String) = UnionMember0(JsonField.of(value))
                }

                /** An enum containing [UnionMember0]'s known values. */
                enum class Known {
                    DRAFT,
                    IN_PROCESS,
                    SUBMITTED,
                    EXCEPTION,
                    FOC_DATE_CONFIRMED,
                    CANCEL_PENDING,
                    PORTED,
                    CANCELLED,
                }

                /**
                 * An enum containing [UnionMember0]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [UnionMember0] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    DRAFT,
                    IN_PROCESS,
                    SUBMITTED,
                    EXCEPTION,
                    FOC_DATE_CONFIRMED,
                    CANCEL_PENDING,
                    PORTED,
                    CANCELLED,
                    /**
                     * An enum member indicating that [UnionMember0] was instantiated with an
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
                        DRAFT -> Value.DRAFT
                        IN_PROCESS -> Value.IN_PROCESS
                        SUBMITTED -> Value.SUBMITTED
                        EXCEPTION -> Value.EXCEPTION
                        FOC_DATE_CONFIRMED -> Value.FOC_DATE_CONFIRMED
                        CANCEL_PENDING -> Value.CANCEL_PENDING
                        PORTED -> Value.PORTED
                        CANCELLED -> Value.CANCELLED
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
                        DRAFT -> Known.DRAFT
                        IN_PROCESS -> Known.IN_PROCESS
                        SUBMITTED -> Known.SUBMITTED
                        EXCEPTION -> Known.EXCEPTION
                        FOC_DATE_CONFIRMED -> Known.FOC_DATE_CONFIRMED
                        CANCEL_PENDING -> Known.CANCEL_PENDING
                        PORTED -> Known.PORTED
                        CANCELLED -> Known.CANCELLED
                        else -> throw TelnyxInvalidDataException("Unknown UnionMember0: $value")
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

                fun validate(): UnionMember0 = apply {
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

                    return other is UnionMember0 && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class UnnamedSchemaWithArrayParent2
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

                    @JvmField val DRAFT = of("draft")

                    @JvmField val IN_PROCESS = of("in-process")

                    @JvmField val SUBMITTED = of("submitted")

                    @JvmField val EXCEPTION = of("exception")

                    @JvmField val FOC_DATE_CONFIRMED = of("foc-date-confirmed")

                    @JvmField val CANCEL_PENDING = of("cancel-pending")

                    @JvmField val PORTED = of("ported")

                    @JvmField val CANCELLED = of("cancelled")

                    @JvmStatic
                    fun of(value: String) = UnnamedSchemaWithArrayParent2(JsonField.of(value))
                }

                /** An enum containing [UnnamedSchemaWithArrayParent2]'s known values. */
                enum class Known {
                    DRAFT,
                    IN_PROCESS,
                    SUBMITTED,
                    EXCEPTION,
                    FOC_DATE_CONFIRMED,
                    CANCEL_PENDING,
                    PORTED,
                    CANCELLED,
                }

                /**
                 * An enum containing [UnnamedSchemaWithArrayParent2]'s known values, as well as an
                 * [_UNKNOWN] member.
                 *
                 * An instance of [UnnamedSchemaWithArrayParent2] can contain an unknown value in a
                 * couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    DRAFT,
                    IN_PROCESS,
                    SUBMITTED,
                    EXCEPTION,
                    FOC_DATE_CONFIRMED,
                    CANCEL_PENDING,
                    PORTED,
                    CANCELLED,
                    /**
                     * An enum member indicating that [UnnamedSchemaWithArrayParent2] was
                     * instantiated with an unknown value.
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
                        DRAFT -> Value.DRAFT
                        IN_PROCESS -> Value.IN_PROCESS
                        SUBMITTED -> Value.SUBMITTED
                        EXCEPTION -> Value.EXCEPTION
                        FOC_DATE_CONFIRMED -> Value.FOC_DATE_CONFIRMED
                        CANCEL_PENDING -> Value.CANCEL_PENDING
                        PORTED -> Value.PORTED
                        CANCELLED -> Value.CANCELLED
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
                        DRAFT -> Known.DRAFT
                        IN_PROCESS -> Known.IN_PROCESS
                        SUBMITTED -> Known.SUBMITTED
                        EXCEPTION -> Known.EXCEPTION
                        FOC_DATE_CONFIRMED -> Known.FOC_DATE_CONFIRMED
                        CANCEL_PENDING -> Known.CANCEL_PENDING
                        PORTED -> Known.PORTED
                        CANCELLED -> Known.CANCELLED
                        else ->
                            throw TelnyxInvalidDataException(
                                "Unknown UnnamedSchemaWithArrayParent2: $value"
                            )
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

                fun validate(): UnnamedSchemaWithArrayParent2 = apply {
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

                    return other is UnnamedSchemaWithArrayParent2 && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }
        }

        /**
         * Filter results by support key(s). Originally: filter[support_key][eq],
         * filter[support_key][in][]
         */
        class SupportKey
        private constructor(
            private val string: String? = null,
            private val strings: List<String>? = null,
        ) {

            /** Filter by exact support key match (eq operation) */
            fun string(): Optional<String> = Optional.ofNullable(string)

            /** Filter by multiple support keys (in operation) */
            fun strings(): Optional<List<String>> = Optional.ofNullable(strings)

            fun isString(): Boolean = string != null

            fun isStrings(): Boolean = strings != null

            /** Filter by exact support key match (eq operation) */
            fun asString(): String = string.getOrThrow("string")

            /** Filter by multiple support keys (in operation) */
            fun asStrings(): List<String> = strings.getOrThrow("strings")

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    string != null -> visitor.visitString(string)
                    strings != null -> visitor.visitStrings(strings)
                    else -> throw IllegalStateException("Invalid SupportKey")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is SupportKey && string == other.string && strings == other.strings
            }

            override fun hashCode(): Int = Objects.hash(string, strings)

            override fun toString(): String =
                when {
                    string != null -> "SupportKey{string=$string}"
                    strings != null -> "SupportKey{strings=$strings}"
                    else -> throw IllegalStateException("Invalid SupportKey")
                }

            companion object {

                /** Filter by exact support key match (eq operation) */
                @JvmStatic fun ofString(string: String) = SupportKey(string = string)

                /** Filter by multiple support keys (in operation) */
                @JvmStatic
                fun ofStrings(strings: List<String>) = SupportKey(strings = strings.toImmutable())
            }

            /**
             * An interface that defines how to map each variant of [SupportKey] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                /** Filter by exact support key match (eq operation) */
                fun visitString(string: String): T

                /** Filter by multiple support keys (in operation) */
                fun visitStrings(strings: List<String>): T
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filter &&
                activationStatus == other.activationStatus &&
                phoneNumber == other.phoneNumber &&
                portabilityStatus == other.portabilityStatus &&
                portingOrderId == other.portingOrderId &&
                status == other.status &&
                supportKey == other.supportKey &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                activationStatus,
                phoneNumber,
                portabilityStatus,
                portingOrderId,
                status,
                supportKey,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filter{activationStatus=$activationStatus, phoneNumber=$phoneNumber, portabilityStatus=$portabilityStatus, portingOrderId=$portingOrderId, status=$status, supportKey=$supportKey, additionalProperties=$additionalProperties}"
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

    /** Consolidated sort parameter (deepObject style). Originally: sort[value] */
    class Sort
    private constructor(private val value: Value?, private val additionalProperties: QueryParams) {

        /**
         * Specifies the sort order for results. If not given, results are sorted by created_at in
         * descending order
         */
        fun value(): Optional<Value> = Optional.ofNullable(value)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Sort]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Sort]. */
        class Builder internal constructor() {

            private var value: Value? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(sort: Sort) = apply {
                value = sort.value
                additionalProperties = sort.additionalProperties.toBuilder()
            }

            /**
             * Specifies the sort order for results. If not given, results are sorted by created_at
             * in descending order
             */
            fun value(value: Value?) = apply { this.value = value }

            /** Alias for calling [Builder.value] with `value.orElse(null)`. */
            fun value(value: Optional<Value>) = value(value.getOrNull())

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
             * Returns an immutable instance of [Sort].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Sort = Sort(value, additionalProperties.build())
        }

        /**
         * Specifies the sort order for results. If not given, results are sorted by created_at in
         * descending order
         */
        class Value @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val CREATED_AT_DESC = of("-created_at")

                @JvmField val CREATED_AT = of("created_at")

                @JvmStatic fun of(value: String) = Value(JsonField.of(value))
            }

            /** An enum containing [Value]'s known values. */
            enum class Known {
                CREATED_AT_DESC,
                CREATED_AT,
            }

            /**
             * An enum containing [Value]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Value] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CREATED_AT_DESC,
                CREATED_AT,
                /**
                 * An enum member indicating that [Value] was instantiated with an unknown value.
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
                    CREATED_AT_DESC -> Value.CREATED_AT_DESC
                    CREATED_AT -> Value.CREATED_AT
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
                    CREATED_AT_DESC -> Known.CREATED_AT_DESC
                    CREATED_AT -> Known.CREATED_AT
                    else -> throw TelnyxInvalidDataException("Unknown Value: $value")
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

            fun validate(): Value = apply {
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

                return other is Value && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Sort &&
                value == other.value &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(value, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Sort{value=$value, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PhoneNumberBlockListParams &&
            portingOrderId == other.portingOrderId &&
            filter == other.filter &&
            page == other.page &&
            sort == other.sort &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(portingOrderId, filter, page, sort, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PhoneNumberBlockListParams{portingOrderId=$portingOrderId, filter=$filter, page=$page, sort=$sort, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
