// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhookdeliveries

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

/** Lists webhook_deliveries for the authenticated user */
class WebhookDeliveryListParams
private constructor(
    private val filter: Filter?,
    private val pageNumber: Long?,
    private val pageSize: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Consolidated filter parameter (deepObject style). Originally: filter[status][eq],
     * filter[event_type], filter[webhook][contains], filter[attempts][contains],
     * filter[started_at][gte], filter[started_at][lte], filter[finished_at][gte],
     * filter[finished_at][lte]
     */
    fun filter(): Optional<Filter> = Optional.ofNullable(filter)

    fun pageNumber(): Optional<Long> = Optional.ofNullable(pageNumber)

    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): WebhookDeliveryListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [WebhookDeliveryListParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WebhookDeliveryListParams]. */
    class Builder internal constructor() {

        private var filter: Filter? = null
        private var pageNumber: Long? = null
        private var pageSize: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(webhookDeliveryListParams: WebhookDeliveryListParams) = apply {
            filter = webhookDeliveryListParams.filter
            pageNumber = webhookDeliveryListParams.pageNumber
            pageSize = webhookDeliveryListParams.pageSize
            additionalHeaders = webhookDeliveryListParams.additionalHeaders.toBuilder()
            additionalQueryParams = webhookDeliveryListParams.additionalQueryParams.toBuilder()
        }

        /**
         * Consolidated filter parameter (deepObject style). Originally: filter[status][eq],
         * filter[event_type], filter[webhook][contains], filter[attempts][contains],
         * filter[started_at][gte], filter[started_at][lte], filter[finished_at][gte],
         * filter[finished_at][lte]
         */
        fun filter(filter: Filter?) = apply { this.filter = filter }

        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
        fun filter(filter: Optional<Filter>) = filter(filter.getOrNull())

        fun pageNumber(pageNumber: Long?) = apply { this.pageNumber = pageNumber }

        /**
         * Alias for [Builder.pageNumber].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageNumber(pageNumber: Long) = pageNumber(pageNumber as Long?)

        /** Alias for calling [Builder.pageNumber] with `pageNumber.orElse(null)`. */
        fun pageNumber(pageNumber: Optional<Long>) = pageNumber(pageNumber.getOrNull())

        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

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
         * Returns an immutable instance of [WebhookDeliveryListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): WebhookDeliveryListParams =
            WebhookDeliveryListParams(
                filter,
                pageNumber,
                pageSize,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                filter?.let {
                    it.attempts().ifPresent {
                        it.contains().ifPresent { put("filter[attempts][contains]", it) }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[attempts][$key]", value)
                            }
                        }
                    }
                    it.eventType().ifPresent { put("filter[event_type]", it) }
                    it.finishedAt().ifPresent {
                        it.gte().ifPresent { put("filter[finished_at][gte]", it) }
                        it.lte().ifPresent { put("filter[finished_at][lte]", it) }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[finished_at][$key]", value)
                            }
                        }
                    }
                    it.startedAt().ifPresent {
                        it.gte().ifPresent { put("filter[started_at][gte]", it) }
                        it.lte().ifPresent { put("filter[started_at][lte]", it) }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[started_at][$key]", value)
                            }
                        }
                    }
                    it.status().ifPresent {
                        it.eq().ifPresent { put("filter[status][eq]", it.toString()) }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[status][$key]", value)
                            }
                        }
                    }
                    it.webhook().ifPresent {
                        it.contains().ifPresent { put("filter[webhook][contains]", it) }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[webhook][$key]", value)
                            }
                        }
                    }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("filter[$key]", value)
                        }
                    }
                }
                pageNumber?.let { put("page[number]", it.toString()) }
                pageSize?.let { put("page[size]", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Consolidated filter parameter (deepObject style). Originally: filter[status][eq],
     * filter[event_type], filter[webhook][contains], filter[attempts][contains],
     * filter[started_at][gte], filter[started_at][lte], filter[finished_at][gte],
     * filter[finished_at][lte]
     */
    class Filter
    private constructor(
        private val attempts: Attempts?,
        private val eventType: String?,
        private val finishedAt: FinishedAt?,
        private val startedAt: StartedAt?,
        private val status: Status?,
        private val webhook: Webhook?,
        private val additionalProperties: QueryParams,
    ) {

        fun attempts(): Optional<Attempts> = Optional.ofNullable(attempts)

        /**
         * Return only webhook_deliveries matching the given value of `event_type`. Accepts multiple
         * values separated by a `,`.
         */
        fun eventType(): Optional<String> = Optional.ofNullable(eventType)

        fun finishedAt(): Optional<FinishedAt> = Optional.ofNullable(finishedAt)

        fun startedAt(): Optional<StartedAt> = Optional.ofNullable(startedAt)

        fun status(): Optional<Status> = Optional.ofNullable(status)

        fun webhook(): Optional<Webhook> = Optional.ofNullable(webhook)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Filter]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filter]. */
        class Builder internal constructor() {

            private var attempts: Attempts? = null
            private var eventType: String? = null
            private var finishedAt: FinishedAt? = null
            private var startedAt: StartedAt? = null
            private var status: Status? = null
            private var webhook: Webhook? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                attempts = filter.attempts
                eventType = filter.eventType
                finishedAt = filter.finishedAt
                startedAt = filter.startedAt
                status = filter.status
                webhook = filter.webhook
                additionalProperties = filter.additionalProperties.toBuilder()
            }

            fun attempts(attempts: Attempts?) = apply { this.attempts = attempts }

            /** Alias for calling [Builder.attempts] with `attempts.orElse(null)`. */
            fun attempts(attempts: Optional<Attempts>) = attempts(attempts.getOrNull())

            /**
             * Return only webhook_deliveries matching the given value of `event_type`. Accepts
             * multiple values separated by a `,`.
             */
            fun eventType(eventType: String?) = apply { this.eventType = eventType }

            /** Alias for calling [Builder.eventType] with `eventType.orElse(null)`. */
            fun eventType(eventType: Optional<String>) = eventType(eventType.getOrNull())

            fun finishedAt(finishedAt: FinishedAt?) = apply { this.finishedAt = finishedAt }

            /** Alias for calling [Builder.finishedAt] with `finishedAt.orElse(null)`. */
            fun finishedAt(finishedAt: Optional<FinishedAt>) = finishedAt(finishedAt.getOrNull())

            fun startedAt(startedAt: StartedAt?) = apply { this.startedAt = startedAt }

            /** Alias for calling [Builder.startedAt] with `startedAt.orElse(null)`. */
            fun startedAt(startedAt: Optional<StartedAt>) = startedAt(startedAt.getOrNull())

            fun status(status: Status?) = apply { this.status = status }

            /** Alias for calling [Builder.status] with `status.orElse(null)`. */
            fun status(status: Optional<Status>) = status(status.getOrNull())

            fun webhook(webhook: Webhook?) = apply { this.webhook = webhook }

            /** Alias for calling [Builder.webhook] with `webhook.orElse(null)`. */
            fun webhook(webhook: Optional<Webhook>) = webhook(webhook.getOrNull())

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
                    attempts,
                    eventType,
                    finishedAt,
                    startedAt,
                    status,
                    webhook,
                    additionalProperties.build(),
                )
        }

        class Attempts
        private constructor(
            private val contains: String?,
            private val additionalProperties: QueryParams,
        ) {

            /** Return only webhook_deliveries whose `attempts` component contains the given text */
            fun contains(): Optional<String> = Optional.ofNullable(contains)

            /** Query params to send with the request. */
            fun _additionalProperties(): QueryParams = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Attempts]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Attempts]. */
            class Builder internal constructor() {

                private var contains: String? = null
                private var additionalProperties: QueryParams.Builder = QueryParams.builder()

                @JvmSynthetic
                internal fun from(attempts: Attempts) = apply {
                    contains = attempts.contains
                    additionalProperties = attempts.additionalProperties.toBuilder()
                }

                /**
                 * Return only webhook_deliveries whose `attempts` component contains the given text
                 */
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
                 * Returns an immutable instance of [Attempts].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Attempts = Attempts(contains, additionalProperties.build())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Attempts &&
                    contains == other.contains &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(contains, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Attempts{contains=$contains, additionalProperties=$additionalProperties}"
        }

        class FinishedAt
        private constructor(
            private val gte: String?,
            private val lte: String?,
            private val additionalProperties: QueryParams,
        ) {

            /**
             * Return only webhook_deliveries whose delivery finished later than or at given ISO
             * 8601 datetime
             */
            fun gte(): Optional<String> = Optional.ofNullable(gte)

            /**
             * Return only webhook_deliveries whose delivery finished earlier than or at given ISO
             * 8601 datetime
             */
            fun lte(): Optional<String> = Optional.ofNullable(lte)

            /** Query params to send with the request. */
            fun _additionalProperties(): QueryParams = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [FinishedAt]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [FinishedAt]. */
            class Builder internal constructor() {

                private var gte: String? = null
                private var lte: String? = null
                private var additionalProperties: QueryParams.Builder = QueryParams.builder()

                @JvmSynthetic
                internal fun from(finishedAt: FinishedAt) = apply {
                    gte = finishedAt.gte
                    lte = finishedAt.lte
                    additionalProperties = finishedAt.additionalProperties.toBuilder()
                }

                /**
                 * Return only webhook_deliveries whose delivery finished later than or at given ISO
                 * 8601 datetime
                 */
                fun gte(gte: String?) = apply { this.gte = gte }

                /** Alias for calling [Builder.gte] with `gte.orElse(null)`. */
                fun gte(gte: Optional<String>) = gte(gte.getOrNull())

                /**
                 * Return only webhook_deliveries whose delivery finished earlier than or at given
                 * ISO 8601 datetime
                 */
                fun lte(lte: String?) = apply { this.lte = lte }

                /** Alias for calling [Builder.lte] with `lte.orElse(null)`. */
                fun lte(lte: Optional<String>) = lte(lte.getOrNull())

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
                 * Returns an immutable instance of [FinishedAt].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): FinishedAt = FinishedAt(gte, lte, additionalProperties.build())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is FinishedAt &&
                    gte == other.gte &&
                    lte == other.lte &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(gte, lte, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "FinishedAt{gte=$gte, lte=$lte, additionalProperties=$additionalProperties}"
        }

        class StartedAt
        private constructor(
            private val gte: String?,
            private val lte: String?,
            private val additionalProperties: QueryParams,
        ) {

            /**
             * Return only webhook_deliveries whose delivery started later than or at given ISO 8601
             * datetime
             */
            fun gte(): Optional<String> = Optional.ofNullable(gte)

            /**
             * Return only webhook_deliveries whose delivery started earlier than or at given ISO
             * 8601 datetime
             */
            fun lte(): Optional<String> = Optional.ofNullable(lte)

            /** Query params to send with the request. */
            fun _additionalProperties(): QueryParams = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [StartedAt]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [StartedAt]. */
            class Builder internal constructor() {

                private var gte: String? = null
                private var lte: String? = null
                private var additionalProperties: QueryParams.Builder = QueryParams.builder()

                @JvmSynthetic
                internal fun from(startedAt: StartedAt) = apply {
                    gte = startedAt.gte
                    lte = startedAt.lte
                    additionalProperties = startedAt.additionalProperties.toBuilder()
                }

                /**
                 * Return only webhook_deliveries whose delivery started later than or at given ISO
                 * 8601 datetime
                 */
                fun gte(gte: String?) = apply { this.gte = gte }

                /** Alias for calling [Builder.gte] with `gte.orElse(null)`. */
                fun gte(gte: Optional<String>) = gte(gte.getOrNull())

                /**
                 * Return only webhook_deliveries whose delivery started earlier than or at given
                 * ISO 8601 datetime
                 */
                fun lte(lte: String?) = apply { this.lte = lte }

                /** Alias for calling [Builder.lte] with `lte.orElse(null)`. */
                fun lte(lte: Optional<String>) = lte(lte.getOrNull())

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
                 * Returns an immutable instance of [StartedAt].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): StartedAt = StartedAt(gte, lte, additionalProperties.build())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is StartedAt &&
                    gte == other.gte &&
                    lte == other.lte &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(gte, lte, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "StartedAt{gte=$gte, lte=$lte, additionalProperties=$additionalProperties}"
        }

        class Status
        private constructor(private val eq: Eq?, private val additionalProperties: QueryParams) {

            /** Return only webhook_deliveries matching the given `status` */
            fun eq(): Optional<Eq> = Optional.ofNullable(eq)

            /** Query params to send with the request. */
            fun _additionalProperties(): QueryParams = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Status]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Status]. */
            class Builder internal constructor() {

                private var eq: Eq? = null
                private var additionalProperties: QueryParams.Builder = QueryParams.builder()

                @JvmSynthetic
                internal fun from(status: Status) = apply {
                    eq = status.eq
                    additionalProperties = status.additionalProperties.toBuilder()
                }

                /** Return only webhook_deliveries matching the given `status` */
                fun eq(eq: Eq?) = apply { this.eq = eq }

                /** Alias for calling [Builder.eq] with `eq.orElse(null)`. */
                fun eq(eq: Optional<Eq>) = eq(eq.getOrNull())

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
                 * Returns an immutable instance of [Status].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Status = Status(eq, additionalProperties.build())
            }

            /** Return only webhook_deliveries matching the given `status` */
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

                    @JvmField val DELIVERED = of("delivered")

                    @JvmField val FAILED = of("failed")

                    @JvmStatic fun of(value: String) = Eq(JsonField.of(value))
                }

                /** An enum containing [Eq]'s known values. */
                enum class Known {
                    DELIVERED,
                    FAILED,
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
                    DELIVERED,
                    FAILED,
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
                        DELIVERED -> Value.DELIVERED
                        FAILED -> Value.FAILED
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
                        DELIVERED -> Known.DELIVERED
                        FAILED -> Known.FAILED
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

                return other is Status &&
                    eq == other.eq &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(eq, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Status{eq=$eq, additionalProperties=$additionalProperties}"
        }

        class Webhook
        private constructor(
            private val contains: String?,
            private val additionalProperties: QueryParams,
        ) {

            /** Return only webhook deliveries whose `webhook` component contains the given text */
            fun contains(): Optional<String> = Optional.ofNullable(contains)

            /** Query params to send with the request. */
            fun _additionalProperties(): QueryParams = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Webhook]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Webhook]. */
            class Builder internal constructor() {

                private var contains: String? = null
                private var additionalProperties: QueryParams.Builder = QueryParams.builder()

                @JvmSynthetic
                internal fun from(webhook: Webhook) = apply {
                    contains = webhook.contains
                    additionalProperties = webhook.additionalProperties.toBuilder()
                }

                /**
                 * Return only webhook deliveries whose `webhook` component contains the given text
                 */
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
                 * Returns an immutable instance of [Webhook].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Webhook = Webhook(contains, additionalProperties.build())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Webhook &&
                    contains == other.contains &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(contains, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Webhook{contains=$contains, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filter &&
                attempts == other.attempts &&
                eventType == other.eventType &&
                finishedAt == other.finishedAt &&
                startedAt == other.startedAt &&
                status == other.status &&
                webhook == other.webhook &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                attempts,
                eventType,
                finishedAt,
                startedAt,
                status,
                webhook,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filter{attempts=$attempts, eventType=$eventType, finishedAt=$finishedAt, startedAt=$startedAt, status=$status, webhook=$webhook, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WebhookDeliveryListParams &&
            filter == other.filter &&
            pageNumber == other.pageNumber &&
            pageSize == other.pageSize &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(filter, pageNumber, pageSize, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "WebhookDeliveryListParams{filter=$filter, pageNumber=$pageNumber, pageSize=$pageSize, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
