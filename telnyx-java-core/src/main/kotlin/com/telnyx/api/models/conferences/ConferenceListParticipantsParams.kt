// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.conferences

import com.telnyx.api.core.Params
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Lists conference participants */
class ConferenceListParticipantsParams
private constructor(
    private val conferenceId: String?,
    private val filter: Filter?,
    private val page: Page?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun conferenceId(): Optional<String> = Optional.ofNullable(conferenceId)

    /**
     * Consolidated filter parameter (deepObject style). Originally: filter[muted], filter[on_hold],
     * filter[whispering]
     */
    fun filter(): Optional<Filter> = Optional.ofNullable(filter)

    /**
     * Consolidated page parameter (deepObject style). Originally: page[after], page[before],
     * page[limit], page[size], page[number]
     */
    fun page(): Optional<Page> = Optional.ofNullable(page)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ConferenceListParticipantsParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [ConferenceListParticipantsParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ConferenceListParticipantsParams]. */
    class Builder internal constructor() {

        private var conferenceId: String? = null
        private var filter: Filter? = null
        private var page: Page? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(conferenceListParticipantsParams: ConferenceListParticipantsParams) =
            apply {
                conferenceId = conferenceListParticipantsParams.conferenceId
                filter = conferenceListParticipantsParams.filter
                page = conferenceListParticipantsParams.page
                additionalHeaders = conferenceListParticipantsParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    conferenceListParticipantsParams.additionalQueryParams.toBuilder()
            }

        fun conferenceId(conferenceId: String?) = apply { this.conferenceId = conferenceId }

        /** Alias for calling [Builder.conferenceId] with `conferenceId.orElse(null)`. */
        fun conferenceId(conferenceId: Optional<String>) = conferenceId(conferenceId.getOrNull())

        /**
         * Consolidated filter parameter (deepObject style). Originally: filter[muted],
         * filter[on_hold], filter[whispering]
         */
        fun filter(filter: Filter?) = apply { this.filter = filter }

        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
        fun filter(filter: Optional<Filter>) = filter(filter.getOrNull())

        /**
         * Consolidated page parameter (deepObject style). Originally: page[after], page[before],
         * page[limit], page[size], page[number]
         */
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
         * Returns an immutable instance of [ConferenceListParticipantsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ConferenceListParticipantsParams =
            ConferenceListParticipantsParams(
                conferenceId,
                filter,
                page,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> conferenceId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                filter?.let {
                    it.muted().ifPresent { put("filter[muted]", it.toString()) }
                    it.onHold().ifPresent { put("filter[on_hold]", it.toString()) }
                    it.whispering().ifPresent { put("filter[whispering]", it.toString()) }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("filter[$key]", value)
                        }
                    }
                }
                page?.let {
                    it.after().ifPresent { put("page[after]", it) }
                    it.before().ifPresent { put("page[before]", it) }
                    it.limit().ifPresent { put("page[limit]", it.toString()) }
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
     * Consolidated filter parameter (deepObject style). Originally: filter[muted], filter[on_hold],
     * filter[whispering]
     */
    class Filter
    private constructor(
        private val muted: Boolean?,
        private val onHold: Boolean?,
        private val whispering: Boolean?,
        private val additionalProperties: QueryParams,
    ) {

        /** If present, participants will be filtered to those who are/are not muted */
        fun muted(): Optional<Boolean> = Optional.ofNullable(muted)

        /** If present, participants will be filtered to those who are/are not put on hold */
        fun onHold(): Optional<Boolean> = Optional.ofNullable(onHold)

        /** If present, participants will be filtered to those who are whispering or are not */
        fun whispering(): Optional<Boolean> = Optional.ofNullable(whispering)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Filter]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filter]. */
        class Builder internal constructor() {

            private var muted: Boolean? = null
            private var onHold: Boolean? = null
            private var whispering: Boolean? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                muted = filter.muted
                onHold = filter.onHold
                whispering = filter.whispering
                additionalProperties = filter.additionalProperties.toBuilder()
            }

            /** If present, participants will be filtered to those who are/are not muted */
            fun muted(muted: Boolean?) = apply { this.muted = muted }

            /**
             * Alias for [Builder.muted].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun muted(muted: Boolean) = muted(muted as Boolean?)

            /** Alias for calling [Builder.muted] with `muted.orElse(null)`. */
            fun muted(muted: Optional<Boolean>) = muted(muted.getOrNull())

            /** If present, participants will be filtered to those who are/are not put on hold */
            fun onHold(onHold: Boolean?) = apply { this.onHold = onHold }

            /**
             * Alias for [Builder.onHold].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun onHold(onHold: Boolean) = onHold(onHold as Boolean?)

            /** Alias for calling [Builder.onHold] with `onHold.orElse(null)`. */
            fun onHold(onHold: Optional<Boolean>) = onHold(onHold.getOrNull())

            /** If present, participants will be filtered to those who are whispering or are not */
            fun whispering(whispering: Boolean?) = apply { this.whispering = whispering }

            /**
             * Alias for [Builder.whispering].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun whispering(whispering: Boolean) = whispering(whispering as Boolean?)

            /** Alias for calling [Builder.whispering] with `whispering.orElse(null)`. */
            fun whispering(whispering: Optional<Boolean>) = whispering(whispering.getOrNull())

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
            fun build(): Filter = Filter(muted, onHold, whispering, additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filter &&
                muted == other.muted &&
                onHold == other.onHold &&
                whispering == other.whispering &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(muted, onHold, whispering, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filter{muted=$muted, onHold=$onHold, whispering=$whispering, additionalProperties=$additionalProperties}"
    }

    /**
     * Consolidated page parameter (deepObject style). Originally: page[after], page[before],
     * page[limit], page[size], page[number]
     */
    class Page
    private constructor(
        private val after: String?,
        private val before: String?,
        private val limit: Long?,
        private val number: Long?,
        private val size: Long?,
        private val additionalProperties: QueryParams,
    ) {

        /** Opaque identifier of next page */
        fun after(): Optional<String> = Optional.ofNullable(after)

        /** Opaque identifier of previous page */
        fun before(): Optional<String> = Optional.ofNullable(before)

        /** Limit of records per single page */
        fun limit(): Optional<Long> = Optional.ofNullable(limit)

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

            private var after: String? = null
            private var before: String? = null
            private var limit: Long? = null
            private var number: Long? = null
            private var size: Long? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(page: Page) = apply {
                after = page.after
                before = page.before
                limit = page.limit
                number = page.number
                size = page.size
                additionalProperties = page.additionalProperties.toBuilder()
            }

            /** Opaque identifier of next page */
            fun after(after: String?) = apply { this.after = after }

            /** Alias for calling [Builder.after] with `after.orElse(null)`. */
            fun after(after: Optional<String>) = after(after.getOrNull())

            /** Opaque identifier of previous page */
            fun before(before: String?) = apply { this.before = before }

            /** Alias for calling [Builder.before] with `before.orElse(null)`. */
            fun before(before: Optional<String>) = before(before.getOrNull())

            /** Limit of records per single page */
            fun limit(limit: Long?) = apply { this.limit = limit }

            /**
             * Alias for [Builder.limit].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun limit(limit: Long) = limit(limit as Long?)

            /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
            fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

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
            fun build(): Page =
                Page(after, before, limit, number, size, additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Page &&
                after == other.after &&
                before == other.before &&
                limit == other.limit &&
                number == other.number &&
                size == other.size &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(after, before, limit, number, size, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Page{after=$after, before=$before, limit=$limit, number=$number, size=$size, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConferenceListParticipantsParams &&
            conferenceId == other.conferenceId &&
            filter == other.filter &&
            page == other.page &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(conferenceId, filter, page, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ConferenceListParticipantsParams{conferenceId=$conferenceId, filter=$filter, page=$page, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
