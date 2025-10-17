// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Returns a list of your porting order. */
class PortingOrderListParams
private constructor(
    private val filter: Filter?,
    private val includePhoneNumbers: Boolean?,
    private val page: Page?,
    private val sort: Sort?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Consolidated filter parameter (deepObject style). Originally: filter[customer_reference],
     * filter[customer_group_reference], filter[parent_support_key],
     * filter[phone_numbers.country_code], filter[phone_numbers.carrier_name], filter[misc.type],
     * filter[end_user.admin.entity_name], filter[end_user.admin.auth_person_name],
     * filter[activation_settings.fast_port_eligible],
     * filter[activation_settings.foc_datetime_requested][gt],
     * filter[activation_settings.foc_datetime_requested][lt],
     * filter[phone_numbers.phone_number][contains]
     */
    fun filter(): Optional<Filter> = Optional.ofNullable(filter)

    /** Include the first 50 phone number objects in the results */
    fun includePhoneNumbers(): Optional<Boolean> = Optional.ofNullable(includePhoneNumbers)

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

        @JvmStatic fun none(): PortingOrderListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [PortingOrderListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PortingOrderListParams]. */
    class Builder internal constructor() {

        private var filter: Filter? = null
        private var includePhoneNumbers: Boolean? = null
        private var page: Page? = null
        private var sort: Sort? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(portingOrderListParams: PortingOrderListParams) = apply {
            filter = portingOrderListParams.filter
            includePhoneNumbers = portingOrderListParams.includePhoneNumbers
            page = portingOrderListParams.page
            sort = portingOrderListParams.sort
            additionalHeaders = portingOrderListParams.additionalHeaders.toBuilder()
            additionalQueryParams = portingOrderListParams.additionalQueryParams.toBuilder()
        }

        /**
         * Consolidated filter parameter (deepObject style). Originally: filter[customer_reference],
         * filter[customer_group_reference], filter[parent_support_key],
         * filter[phone_numbers.country_code], filter[phone_numbers.carrier_name],
         * filter[misc.type], filter[end_user.admin.entity_name],
         * filter[end_user.admin.auth_person_name], filter[activation_settings.fast_port_eligible],
         * filter[activation_settings.foc_datetime_requested][gt],
         * filter[activation_settings.foc_datetime_requested][lt],
         * filter[phone_numbers.phone_number][contains]
         */
        fun filter(filter: Filter?) = apply { this.filter = filter }

        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
        fun filter(filter: Optional<Filter>) = filter(filter.getOrNull())

        /** Include the first 50 phone number objects in the results */
        fun includePhoneNumbers(includePhoneNumbers: Boolean?) = apply {
            this.includePhoneNumbers = includePhoneNumbers
        }

        /**
         * Alias for [Builder.includePhoneNumbers].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includePhoneNumbers(includePhoneNumbers: Boolean) =
            includePhoneNumbers(includePhoneNumbers as Boolean?)

        /**
         * Alias for calling [Builder.includePhoneNumbers] with `includePhoneNumbers.orElse(null)`.
         */
        fun includePhoneNumbers(includePhoneNumbers: Optional<Boolean>) =
            includePhoneNumbers(includePhoneNumbers.getOrNull())

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
         * Returns an immutable instance of [PortingOrderListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PortingOrderListParams =
            PortingOrderListParams(
                filter,
                includePhoneNumbers,
                page,
                sort,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                filter?.let {
                    it.activationSettings().ifPresent {
                        it.fastPortEligible().ifPresent {
                            put("filter[activation_settings][fast_port_eligible]", it.toString())
                        }
                        it.focDatetimeRequested().ifPresent {
                            it.gt().ifPresent {
                                put("filter[activation_settings][foc_datetime_requested][gt]", it)
                            }
                            it.lt().ifPresent {
                                put("filter[activation_settings][foc_datetime_requested][lt]", it)
                            }
                            it._additionalProperties().keys().forEach { key ->
                                it._additionalProperties().values(key).forEach { value ->
                                    put(
                                        "filter[activation_settings][foc_datetime_requested][$key]",
                                        value,
                                    )
                                }
                            }
                        }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[activation_settings][$key]", value)
                            }
                        }
                    }
                    it.customerGroupReference().ifPresent {
                        put("filter[customer_group_reference]", it)
                    }
                    it.customerReference().ifPresent { put("filter[customer_reference]", it) }
                    it.endUser().ifPresent {
                        it.admin().ifPresent {
                            it.authPersonName().ifPresent {
                                put("filter[end_user][admin][auth_person_name]", it)
                            }
                            it.entityName().ifPresent {
                                put("filter[end_user][admin][entity_name]", it)
                            }
                            it._additionalProperties().keys().forEach { key ->
                                it._additionalProperties().values(key).forEach { value ->
                                    put("filter[end_user][admin][$key]", value)
                                }
                            }
                        }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[end_user][$key]", value)
                            }
                        }
                    }
                    it.misc().ifPresent {
                        it.type().ifPresent { put("filter[misc][type]", it.toString()) }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[misc][$key]", value)
                            }
                        }
                    }
                    it.parentSupportKey().ifPresent { put("filter[parent_support_key]", it) }
                    it.phoneNumbers().ifPresent {
                        it.carrierName().ifPresent {
                            put("filter[phone_numbers][carrier_name]", it)
                        }
                        it.countryCode().ifPresent {
                            put("filter[phone_numbers][country_code]", it)
                        }
                        it.phoneNumber().ifPresent {
                            it.contains().ifPresent {
                                put("filter[phone_numbers][phone_number][contains]", it)
                            }
                            it._additionalProperties().keys().forEach { key ->
                                it._additionalProperties().values(key).forEach { value ->
                                    put("filter[phone_numbers][phone_number][$key]", value)
                                }
                            }
                        }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[phone_numbers][$key]", value)
                            }
                        }
                    }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("filter[$key]", value)
                        }
                    }
                }
                includePhoneNumbers?.let { put("include_phone_numbers", it.toString()) }
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
     * Consolidated filter parameter (deepObject style). Originally: filter[customer_reference],
     * filter[customer_group_reference], filter[parent_support_key],
     * filter[phone_numbers.country_code], filter[phone_numbers.carrier_name], filter[misc.type],
     * filter[end_user.admin.entity_name], filter[end_user.admin.auth_person_name],
     * filter[activation_settings.fast_port_eligible],
     * filter[activation_settings.foc_datetime_requested][gt],
     * filter[activation_settings.foc_datetime_requested][lt],
     * filter[phone_numbers.phone_number][contains]
     */
    class Filter
    private constructor(
        private val activationSettings: ActivationSettings?,
        private val customerGroupReference: String?,
        private val customerReference: String?,
        private val endUser: EndUser?,
        private val misc: Misc?,
        private val parentSupportKey: String?,
        private val phoneNumbers: PhoneNumbers?,
        private val additionalProperties: QueryParams,
    ) {

        fun activationSettings(): Optional<ActivationSettings> =
            Optional.ofNullable(activationSettings)

        /** Filter results by customer_group_reference */
        fun customerGroupReference(): Optional<String> = Optional.ofNullable(customerGroupReference)

        /** Filter results by customer_reference */
        fun customerReference(): Optional<String> = Optional.ofNullable(customerReference)

        fun endUser(): Optional<EndUser> = Optional.ofNullable(endUser)

        fun misc(): Optional<Misc> = Optional.ofNullable(misc)

        /** Filter results by parent_support_key */
        fun parentSupportKey(): Optional<String> = Optional.ofNullable(parentSupportKey)

        fun phoneNumbers(): Optional<PhoneNumbers> = Optional.ofNullable(phoneNumbers)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Filter]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filter]. */
        class Builder internal constructor() {

            private var activationSettings: ActivationSettings? = null
            private var customerGroupReference: String? = null
            private var customerReference: String? = null
            private var endUser: EndUser? = null
            private var misc: Misc? = null
            private var parentSupportKey: String? = null
            private var phoneNumbers: PhoneNumbers? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                activationSettings = filter.activationSettings
                customerGroupReference = filter.customerGroupReference
                customerReference = filter.customerReference
                endUser = filter.endUser
                misc = filter.misc
                parentSupportKey = filter.parentSupportKey
                phoneNumbers = filter.phoneNumbers
                additionalProperties = filter.additionalProperties.toBuilder()
            }

            fun activationSettings(activationSettings: ActivationSettings?) = apply {
                this.activationSettings = activationSettings
            }

            /**
             * Alias for calling [Builder.activationSettings] with
             * `activationSettings.orElse(null)`.
             */
            fun activationSettings(activationSettings: Optional<ActivationSettings>) =
                activationSettings(activationSettings.getOrNull())

            /** Filter results by customer_group_reference */
            fun customerGroupReference(customerGroupReference: String?) = apply {
                this.customerGroupReference = customerGroupReference
            }

            /**
             * Alias for calling [Builder.customerGroupReference] with
             * `customerGroupReference.orElse(null)`.
             */
            fun customerGroupReference(customerGroupReference: Optional<String>) =
                customerGroupReference(customerGroupReference.getOrNull())

            /** Filter results by customer_reference */
            fun customerReference(customerReference: String?) = apply {
                this.customerReference = customerReference
            }

            /**
             * Alias for calling [Builder.customerReference] with `customerReference.orElse(null)`.
             */
            fun customerReference(customerReference: Optional<String>) =
                customerReference(customerReference.getOrNull())

            fun endUser(endUser: EndUser?) = apply { this.endUser = endUser }

            /** Alias for calling [Builder.endUser] with `endUser.orElse(null)`. */
            fun endUser(endUser: Optional<EndUser>) = endUser(endUser.getOrNull())

            fun misc(misc: Misc?) = apply { this.misc = misc }

            /** Alias for calling [Builder.misc] with `misc.orElse(null)`. */
            fun misc(misc: Optional<Misc>) = misc(misc.getOrNull())

            /** Filter results by parent_support_key */
            fun parentSupportKey(parentSupportKey: String?) = apply {
                this.parentSupportKey = parentSupportKey
            }

            /**
             * Alias for calling [Builder.parentSupportKey] with `parentSupportKey.orElse(null)`.
             */
            fun parentSupportKey(parentSupportKey: Optional<String>) =
                parentSupportKey(parentSupportKey.getOrNull())

            fun phoneNumbers(phoneNumbers: PhoneNumbers?) = apply {
                this.phoneNumbers = phoneNumbers
            }

            /** Alias for calling [Builder.phoneNumbers] with `phoneNumbers.orElse(null)`. */
            fun phoneNumbers(phoneNumbers: Optional<PhoneNumbers>) =
                phoneNumbers(phoneNumbers.getOrNull())

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
                    activationSettings,
                    customerGroupReference,
                    customerReference,
                    endUser,
                    misc,
                    parentSupportKey,
                    phoneNumbers,
                    additionalProperties.build(),
                )
        }

        class ActivationSettings
        private constructor(
            private val fastPortEligible: Boolean?,
            private val focDatetimeRequested: FocDatetimeRequested?,
            private val additionalProperties: QueryParams,
        ) {

            /** Filter results by fast port eligible */
            fun fastPortEligible(): Optional<Boolean> = Optional.ofNullable(fastPortEligible)

            /** FOC datetime range filtering operations */
            fun focDatetimeRequested(): Optional<FocDatetimeRequested> =
                Optional.ofNullable(focDatetimeRequested)

            /** Query params to send with the request. */
            fun _additionalProperties(): QueryParams = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [ActivationSettings].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ActivationSettings]. */
            class Builder internal constructor() {

                private var fastPortEligible: Boolean? = null
                private var focDatetimeRequested: FocDatetimeRequested? = null
                private var additionalProperties: QueryParams.Builder = QueryParams.builder()

                @JvmSynthetic
                internal fun from(activationSettings: ActivationSettings) = apply {
                    fastPortEligible = activationSettings.fastPortEligible
                    focDatetimeRequested = activationSettings.focDatetimeRequested
                    additionalProperties = activationSettings.additionalProperties.toBuilder()
                }

                /** Filter results by fast port eligible */
                fun fastPortEligible(fastPortEligible: Boolean?) = apply {
                    this.fastPortEligible = fastPortEligible
                }

                /**
                 * Alias for [Builder.fastPortEligible].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun fastPortEligible(fastPortEligible: Boolean) =
                    fastPortEligible(fastPortEligible as Boolean?)

                /**
                 * Alias for calling [Builder.fastPortEligible] with
                 * `fastPortEligible.orElse(null)`.
                 */
                fun fastPortEligible(fastPortEligible: Optional<Boolean>) =
                    fastPortEligible(fastPortEligible.getOrNull())

                /** FOC datetime range filtering operations */
                fun focDatetimeRequested(focDatetimeRequested: FocDatetimeRequested?) = apply {
                    this.focDatetimeRequested = focDatetimeRequested
                }

                /**
                 * Alias for calling [Builder.focDatetimeRequested] with
                 * `focDatetimeRequested.orElse(null)`.
                 */
                fun focDatetimeRequested(focDatetimeRequested: Optional<FocDatetimeRequested>) =
                    focDatetimeRequested(focDatetimeRequested.getOrNull())

                fun additionalProperties(additionalProperties: QueryParams) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                    apply {
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

                fun putAllAdditionalProperties(
                    additionalProperties: Map<String, Iterable<String>>
                ) = apply { this.additionalProperties.putAll(additionalProperties) }

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

                fun removeAdditionalProperties(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    additionalProperties.removeAll(keys)
                }

                /**
                 * Returns an immutable instance of [ActivationSettings].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ActivationSettings =
                    ActivationSettings(
                        fastPortEligible,
                        focDatetimeRequested,
                        additionalProperties.build(),
                    )
            }

            /** FOC datetime range filtering operations */
            class FocDatetimeRequested
            private constructor(
                private val gt: String?,
                private val lt: String?,
                private val additionalProperties: QueryParams,
            ) {

                /** Filter results by foc date later than this value */
                fun gt(): Optional<String> = Optional.ofNullable(gt)

                /** Filter results by foc date earlier than this value */
                fun lt(): Optional<String> = Optional.ofNullable(lt)

                /** Query params to send with the request. */
                fun _additionalProperties(): QueryParams = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of
                     * [FocDatetimeRequested].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [FocDatetimeRequested]. */
                class Builder internal constructor() {

                    private var gt: String? = null
                    private var lt: String? = null
                    private var additionalProperties: QueryParams.Builder = QueryParams.builder()

                    @JvmSynthetic
                    internal fun from(focDatetimeRequested: FocDatetimeRequested) = apply {
                        gt = focDatetimeRequested.gt
                        lt = focDatetimeRequested.lt
                        additionalProperties = focDatetimeRequested.additionalProperties.toBuilder()
                    }

                    /** Filter results by foc date later than this value */
                    fun gt(gt: String?) = apply { this.gt = gt }

                    /** Alias for calling [Builder.gt] with `gt.orElse(null)`. */
                    fun gt(gt: Optional<String>) = gt(gt.getOrNull())

                    /** Filter results by foc date earlier than this value */
                    fun lt(lt: String?) = apply { this.lt = lt }

                    /** Alias for calling [Builder.lt] with `lt.orElse(null)`. */
                    fun lt(lt: Optional<String>) = lt(lt.getOrNull())

                    fun additionalProperties(additionalProperties: QueryParams) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                        apply {
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

                    fun putAllAdditionalProperties(
                        additionalProperties: Map<String, Iterable<String>>
                    ) = apply { this.additionalProperties.putAll(additionalProperties) }

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

                    fun removeAdditionalProperties(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        additionalProperties.removeAll(keys)
                    }

                    /**
                     * Returns an immutable instance of [FocDatetimeRequested].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): FocDatetimeRequested =
                        FocDatetimeRequested(gt, lt, additionalProperties.build())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is FocDatetimeRequested &&
                        gt == other.gt &&
                        lt == other.lt &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(gt, lt, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "FocDatetimeRequested{gt=$gt, lt=$lt, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ActivationSettings &&
                    fastPortEligible == other.fastPortEligible &&
                    focDatetimeRequested == other.focDatetimeRequested &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(fastPortEligible, focDatetimeRequested, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ActivationSettings{fastPortEligible=$fastPortEligible, focDatetimeRequested=$focDatetimeRequested, additionalProperties=$additionalProperties}"
        }

        class EndUser
        private constructor(
            private val admin: Admin?,
            private val additionalProperties: QueryParams,
        ) {

            fun admin(): Optional<Admin> = Optional.ofNullable(admin)

            /** Query params to send with the request. */
            fun _additionalProperties(): QueryParams = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [EndUser]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [EndUser]. */
            class Builder internal constructor() {

                private var admin: Admin? = null
                private var additionalProperties: QueryParams.Builder = QueryParams.builder()

                @JvmSynthetic
                internal fun from(endUser: EndUser) = apply {
                    admin = endUser.admin
                    additionalProperties = endUser.additionalProperties.toBuilder()
                }

                fun admin(admin: Admin?) = apply { this.admin = admin }

                /** Alias for calling [Builder.admin] with `admin.orElse(null)`. */
                fun admin(admin: Optional<Admin>) = admin(admin.getOrNull())

                fun additionalProperties(additionalProperties: QueryParams) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                    apply {
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

                fun putAllAdditionalProperties(
                    additionalProperties: Map<String, Iterable<String>>
                ) = apply { this.additionalProperties.putAll(additionalProperties) }

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

                fun removeAdditionalProperties(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    additionalProperties.removeAll(keys)
                }

                /**
                 * Returns an immutable instance of [EndUser].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): EndUser = EndUser(admin, additionalProperties.build())
            }

            class Admin
            private constructor(
                private val authPersonName: String?,
                private val entityName: String?,
                private val additionalProperties: QueryParams,
            ) {

                /** Filter results by authorized person */
                fun authPersonName(): Optional<String> = Optional.ofNullable(authPersonName)

                /** Filter results by person or company name */
                fun entityName(): Optional<String> = Optional.ofNullable(entityName)

                /** Query params to send with the request. */
                fun _additionalProperties(): QueryParams = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Admin]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Admin]. */
                class Builder internal constructor() {

                    private var authPersonName: String? = null
                    private var entityName: String? = null
                    private var additionalProperties: QueryParams.Builder = QueryParams.builder()

                    @JvmSynthetic
                    internal fun from(admin: Admin) = apply {
                        authPersonName = admin.authPersonName
                        entityName = admin.entityName
                        additionalProperties = admin.additionalProperties.toBuilder()
                    }

                    /** Filter results by authorized person */
                    fun authPersonName(authPersonName: String?) = apply {
                        this.authPersonName = authPersonName
                    }

                    /**
                     * Alias for calling [Builder.authPersonName] with
                     * `authPersonName.orElse(null)`.
                     */
                    fun authPersonName(authPersonName: Optional<String>) =
                        authPersonName(authPersonName.getOrNull())

                    /** Filter results by person or company name */
                    fun entityName(entityName: String?) = apply { this.entityName = entityName }

                    /** Alias for calling [Builder.entityName] with `entityName.orElse(null)`. */
                    fun entityName(entityName: Optional<String>) =
                        entityName(entityName.getOrNull())

                    fun additionalProperties(additionalProperties: QueryParams) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                        apply {
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

                    fun putAllAdditionalProperties(
                        additionalProperties: Map<String, Iterable<String>>
                    ) = apply { this.additionalProperties.putAll(additionalProperties) }

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

                    fun removeAdditionalProperties(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        additionalProperties.removeAll(keys)
                    }

                    /**
                     * Returns an immutable instance of [Admin].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Admin =
                        Admin(authPersonName, entityName, additionalProperties.build())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Admin &&
                        authPersonName == other.authPersonName &&
                        entityName == other.entityName &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(authPersonName, entityName, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Admin{authPersonName=$authPersonName, entityName=$entityName, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is EndUser &&
                    admin == other.admin &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(admin, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "EndUser{admin=$admin, additionalProperties=$additionalProperties}"
        }

        class Misc
        private constructor(
            private val type: PortingOrderType?,
            private val additionalProperties: QueryParams,
        ) {

            /** Filter results by porting order type */
            fun type(): Optional<PortingOrderType> = Optional.ofNullable(type)

            /** Query params to send with the request. */
            fun _additionalProperties(): QueryParams = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Misc]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Misc]. */
            class Builder internal constructor() {

                private var type: PortingOrderType? = null
                private var additionalProperties: QueryParams.Builder = QueryParams.builder()

                @JvmSynthetic
                internal fun from(misc: Misc) = apply {
                    type = misc.type
                    additionalProperties = misc.additionalProperties.toBuilder()
                }

                /** Filter results by porting order type */
                fun type(type: PortingOrderType?) = apply { this.type = type }

                /** Alias for calling [Builder.type] with `type.orElse(null)`. */
                fun type(type: Optional<PortingOrderType>) = type(type.getOrNull())

                fun additionalProperties(additionalProperties: QueryParams) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                    apply {
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

                fun putAllAdditionalProperties(
                    additionalProperties: Map<String, Iterable<String>>
                ) = apply { this.additionalProperties.putAll(additionalProperties) }

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

                fun removeAdditionalProperties(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    additionalProperties.removeAll(keys)
                }

                /**
                 * Returns an immutable instance of [Misc].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Misc = Misc(type, additionalProperties.build())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Misc &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(type, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Misc{type=$type, additionalProperties=$additionalProperties}"
        }

        class PhoneNumbers
        private constructor(
            private val carrierName: String?,
            private val countryCode: String?,
            private val phoneNumber: PhoneNumber?,
            private val additionalProperties: QueryParams,
        ) {

            /** Filter results by old service provider */
            fun carrierName(): Optional<String> = Optional.ofNullable(carrierName)

            /** Filter results by country ISO 3166-1 alpha-2 code */
            fun countryCode(): Optional<String> = Optional.ofNullable(countryCode)

            /** Phone number pattern filtering operations */
            fun phoneNumber(): Optional<PhoneNumber> = Optional.ofNullable(phoneNumber)

            /** Query params to send with the request. */
            fun _additionalProperties(): QueryParams = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [PhoneNumbers]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PhoneNumbers]. */
            class Builder internal constructor() {

                private var carrierName: String? = null
                private var countryCode: String? = null
                private var phoneNumber: PhoneNumber? = null
                private var additionalProperties: QueryParams.Builder = QueryParams.builder()

                @JvmSynthetic
                internal fun from(phoneNumbers: PhoneNumbers) = apply {
                    carrierName = phoneNumbers.carrierName
                    countryCode = phoneNumbers.countryCode
                    phoneNumber = phoneNumbers.phoneNumber
                    additionalProperties = phoneNumbers.additionalProperties.toBuilder()
                }

                /** Filter results by old service provider */
                fun carrierName(carrierName: String?) = apply { this.carrierName = carrierName }

                /** Alias for calling [Builder.carrierName] with `carrierName.orElse(null)`. */
                fun carrierName(carrierName: Optional<String>) =
                    carrierName(carrierName.getOrNull())

                /** Filter results by country ISO 3166-1 alpha-2 code */
                fun countryCode(countryCode: String?) = apply { this.countryCode = countryCode }

                /** Alias for calling [Builder.countryCode] with `countryCode.orElse(null)`. */
                fun countryCode(countryCode: Optional<String>) =
                    countryCode(countryCode.getOrNull())

                /** Phone number pattern filtering operations */
                fun phoneNumber(phoneNumber: PhoneNumber?) = apply {
                    this.phoneNumber = phoneNumber
                }

                /** Alias for calling [Builder.phoneNumber] with `phoneNumber.orElse(null)`. */
                fun phoneNumber(phoneNumber: Optional<PhoneNumber>) =
                    phoneNumber(phoneNumber.getOrNull())

                fun additionalProperties(additionalProperties: QueryParams) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                    apply {
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

                fun putAllAdditionalProperties(
                    additionalProperties: Map<String, Iterable<String>>
                ) = apply { this.additionalProperties.putAll(additionalProperties) }

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

                fun removeAdditionalProperties(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    additionalProperties.removeAll(keys)
                }

                /**
                 * Returns an immutable instance of [PhoneNumbers].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): PhoneNumbers =
                    PhoneNumbers(
                        carrierName,
                        countryCode,
                        phoneNumber,
                        additionalProperties.build(),
                    )
            }

            /** Phone number pattern filtering operations */
            class PhoneNumber
            private constructor(
                private val contains: String?,
                private val additionalProperties: QueryParams,
            ) {

                /** Filter results by full or partial phone_number */
                fun contains(): Optional<String> = Optional.ofNullable(contains)

                /** Query params to send with the request. */
                fun _additionalProperties(): QueryParams = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [PhoneNumber]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [PhoneNumber]. */
                class Builder internal constructor() {

                    private var contains: String? = null
                    private var additionalProperties: QueryParams.Builder = QueryParams.builder()

                    @JvmSynthetic
                    internal fun from(phoneNumber: PhoneNumber) = apply {
                        contains = phoneNumber.contains
                        additionalProperties = phoneNumber.additionalProperties.toBuilder()
                    }

                    /** Filter results by full or partial phone_number */
                    fun contains(contains: String?) = apply { this.contains = contains }

                    /** Alias for calling [Builder.contains] with `contains.orElse(null)`. */
                    fun contains(contains: Optional<String>) = contains(contains.getOrNull())

                    fun additionalProperties(additionalProperties: QueryParams) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                        apply {
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

                    fun putAllAdditionalProperties(
                        additionalProperties: Map<String, Iterable<String>>
                    ) = apply { this.additionalProperties.putAll(additionalProperties) }

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

                    fun removeAdditionalProperties(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        additionalProperties.removeAll(keys)
                    }

                    /**
                     * Returns an immutable instance of [PhoneNumber].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): PhoneNumber = PhoneNumber(contains, additionalProperties.build())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PhoneNumber &&
                        contains == other.contains &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(contains, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PhoneNumber{contains=$contains, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PhoneNumbers &&
                    carrierName == other.carrierName &&
                    countryCode == other.countryCode &&
                    phoneNumber == other.phoneNumber &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(carrierName, countryCode, phoneNumber, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PhoneNumbers{carrierName=$carrierName, countryCode=$countryCode, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filter &&
                activationSettings == other.activationSettings &&
                customerGroupReference == other.customerGroupReference &&
                customerReference == other.customerReference &&
                endUser == other.endUser &&
                misc == other.misc &&
                parentSupportKey == other.parentSupportKey &&
                phoneNumbers == other.phoneNumbers &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                activationSettings,
                customerGroupReference,
                customerReference,
                endUser,
                misc,
                parentSupportKey,
                phoneNumbers,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filter{activationSettings=$activationSettings, customerGroupReference=$customerGroupReference, customerReference=$customerReference, endUser=$endUser, misc=$misc, parentSupportKey=$parentSupportKey, phoneNumbers=$phoneNumbers, additionalProperties=$additionalProperties}"
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
         * descending order.
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
             * in descending order.
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
         * descending order.
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

                @JvmField val CREATED_AT = of("created_at")

                @JvmField val CREATED_AT_DESC = of("-created_at")

                @JvmField
                val ACTIVATION_SETTINGS_FOC_DATETIME_REQUESTED =
                    of("activation_settings.foc_datetime_requested")

                @JvmField
                val ACTIVATION_SETTINGS_FOC_DATETIME_REQUESTED_DESC =
                    of("-activation_settings.foc_datetime_requested")

                @JvmStatic fun of(value: String) = Value(JsonField.of(value))
            }

            /** An enum containing [Value]'s known values. */
            enum class Known {
                CREATED_AT,
                CREATED_AT_DESC,
                ACTIVATION_SETTINGS_FOC_DATETIME_REQUESTED,
                ACTIVATION_SETTINGS_FOC_DATETIME_REQUESTED_DESC,
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
                CREATED_AT,
                CREATED_AT_DESC,
                ACTIVATION_SETTINGS_FOC_DATETIME_REQUESTED,
                ACTIVATION_SETTINGS_FOC_DATETIME_REQUESTED_DESC,
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
                    CREATED_AT -> Value.CREATED_AT
                    CREATED_AT_DESC -> Value.CREATED_AT_DESC
                    ACTIVATION_SETTINGS_FOC_DATETIME_REQUESTED ->
                        Value.ACTIVATION_SETTINGS_FOC_DATETIME_REQUESTED
                    ACTIVATION_SETTINGS_FOC_DATETIME_REQUESTED_DESC ->
                        Value.ACTIVATION_SETTINGS_FOC_DATETIME_REQUESTED_DESC
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
                    CREATED_AT -> Known.CREATED_AT
                    CREATED_AT_DESC -> Known.CREATED_AT_DESC
                    ACTIVATION_SETTINGS_FOC_DATETIME_REQUESTED ->
                        Known.ACTIVATION_SETTINGS_FOC_DATETIME_REQUESTED
                    ACTIVATION_SETTINGS_FOC_DATETIME_REQUESTED_DESC ->
                        Known.ACTIVATION_SETTINGS_FOC_DATETIME_REQUESTED_DESC
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

        return other is PortingOrderListParams &&
            filter == other.filter &&
            includePhoneNumbers == other.includePhoneNumbers &&
            page == other.page &&
            sort == other.sort &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            filter,
            includePhoneNumbers,
            page,
            sort,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "PortingOrderListParams{filter=$filter, includePhoneNumbers=$includePhoneNumbers, page=$page, sort=$sort, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
