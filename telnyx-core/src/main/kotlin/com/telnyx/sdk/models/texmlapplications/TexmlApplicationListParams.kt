// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texmlapplications

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Returns a list of your TeXML Applications. */
class TexmlApplicationListParams
private constructor(
    private val filter: Filter?,
    private val pageNumber: Long?,
    private val pageSize: Long?,
    private val sort: Sort?,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Consolidated filter parameter (deepObject style). Originally:
     * filter[outbound_voice_profile_id], filter[friendly_name]
     */
    fun filter(): Optional<Filter> = Optional.ofNullable(filter)

    fun pageNumber(): Optional<Long> = Optional.ofNullable(pageNumber)

    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /**
     * Specifies the sort order for results. By default sorting direction is ascending. To have the
     * results sorted in descending order add the <code> -</code> prefix.<br/><br/> That is: <ul>
     * <li> <code>friendly_name</code>: sorts the result by the <code>friendly_name</code> field in
     *   ascending order. </li>
     * <li> <code>-friendly_name</code>: sorts the result by the <code>friendly_name</code> field in
     *   descending order. </li> </ul> <br/> If not given, results are sorted by
     *   <code>created_at</code> in descending order.
     */
    fun sort(): Optional<Sort> = Optional.ofNullable(sort)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): TexmlApplicationListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [TexmlApplicationListParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TexmlApplicationListParams]. */
    class Builder internal constructor() {

        private var filter: Filter? = null
        private var pageNumber: Long? = null
        private var pageSize: Long? = null
        private var sort: Sort? = null
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(texmlApplicationListParams: TexmlApplicationListParams) = apply {
            filter = texmlApplicationListParams.filter
            pageNumber = texmlApplicationListParams.pageNumber
            pageSize = texmlApplicationListParams.pageSize
            sort = texmlApplicationListParams.sort
            additionalHeaders = texmlApplicationListParams.additionalHeaders.toBuilder()
            additionalQueryParams = texmlApplicationListParams.additionalQueryParams.toBuilder()
        }

        /**
         * Consolidated filter parameter (deepObject style). Originally:
         * filter[outbound_voice_profile_id], filter[friendly_name]
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

        /**
         * Specifies the sort order for results. By default sorting direction is ascending. To have
         * the results sorted in descending order add the <code> -</code> prefix.<br/><br/> That is:
         * <ul>
         * <li> <code>friendly_name</code>: sorts the result by the <code>friendly_name</code> field
         *   in ascending order. </li>
         * <li> <code>-friendly_name</code>: sorts the result by the <code>friendly_name</code>
         *   field in descending order. </li> </ul> <br/> If not given, results are sorted by
         *   <code>created_at</code> in descending order.
         */
        fun sort(sort: Sort?) = apply { this.sort = sort }

        /** Alias for calling [Builder.sort] with `sort.orElse(null)`. */
        fun sort(sort: Optional<Sort>) = sort(sort.getOrNull())

        fun additionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
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

        fun putAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
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

        fun replaceAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) =
            apply {
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
         * Returns an immutable instance of [TexmlApplicationListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TexmlApplicationListParams =
            TexmlApplicationListParams(
                filter,
                pageNumber,
                pageSize,
                sort,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                filter?.let {
                    it.friendlyName().ifPresent {
                        it.accept(
                            object : Filter.FriendlyName.Visitor<Unit> {
                                override fun visitString(string: String) {
                                    put("filter[friendly_name]", string)
                                }

                                override fun visitUnionMember1(
                                    unionMember1: Filter.FriendlyName.UnionMember1
                                ) {
                                    unionMember1.contains().ifPresent {
                                        put("filter[friendly_name][contains]", it)
                                    }
                                    unionMember1.eq().ifPresent {
                                        put("filter[friendly_name][eq]", it)
                                    }
                                    unionMember1._additionalProperties().keys().forEach { key ->
                                        unionMember1._additionalProperties().values(key).forEach {
                                            value ->
                                            put("filter[friendly_name][$key]", value)
                                        }
                                    }
                                }
                            }
                        )
                    }
                    it.outboundVoiceProfileId().ifPresent {
                        it.accept(
                            object : Filter.OutboundVoiceProfileId.Visitor<Unit> {
                                override fun visitString(string: String) {
                                    put("filter[outbound_voice_profile_id]", string)
                                }

                                override fun visitEq(eq: Filter.OutboundVoiceProfileId.Eq) {
                                    eq.eq().ifPresent {
                                        put("filter[outbound_voice_profile_id][eq]", it)
                                    }
                                    eq._additionalProperties().keys().forEach { key ->
                                        eq._additionalProperties().values(key).forEach { value ->
                                            put("filter[outbound_voice_profile_id][$key]", value)
                                        }
                                    }
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
                pageNumber?.let { put("page[number]", it.toString()) }
                pageSize?.let { put("page[size]", it.toString()) }
                sort?.let { put("sort", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Consolidated filter parameter (deepObject style). Originally:
     * filter[outbound_voice_profile_id], filter[friendly_name]
     */
    class Filter
    private constructor(
        private val friendlyName: FriendlyName?,
        private val outboundVoiceProfileId: OutboundVoiceProfileId?,
        private val additionalProperties: QueryParams,
    ) {

        /**
         * If present, applications with <code>friendly_name</code> exactly matching the given value
         * will be returned. Matching is case-sensitive.
         */
        fun friendlyName(): Optional<FriendlyName> = Optional.ofNullable(friendlyName)

        /**
         * If present, only applications associated with the given outbound voice profile will be
         * returned. Matching is exact.
         */
        fun outboundVoiceProfileId(): Optional<OutboundVoiceProfileId> =
            Optional.ofNullable(outboundVoiceProfileId)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Filter]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filter]. */
        class Builder internal constructor() {

            private var friendlyName: FriendlyName? = null
            private var outboundVoiceProfileId: OutboundVoiceProfileId? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                friendlyName = filter.friendlyName
                outboundVoiceProfileId = filter.outboundVoiceProfileId
                additionalProperties = filter.additionalProperties.toBuilder()
            }

            /**
             * If present, applications with <code>friendly_name</code> exactly matching the given
             * value will be returned. Matching is case-sensitive.
             */
            fun friendlyName(friendlyName: FriendlyName?) = apply {
                this.friendlyName = friendlyName
            }

            /** Alias for calling [Builder.friendlyName] with `friendlyName.orElse(null)`. */
            fun friendlyName(friendlyName: Optional<FriendlyName>) =
                friendlyName(friendlyName.getOrNull())

            /** Alias for calling [friendlyName] with `FriendlyName.ofString(string)`. */
            fun friendlyName(string: String) = friendlyName(FriendlyName.ofString(string))

            /**
             * Alias for calling [friendlyName] with `FriendlyName.ofUnionMember1(unionMember1)`.
             */
            fun friendlyName(unionMember1: FriendlyName.UnionMember1) =
                friendlyName(FriendlyName.ofUnionMember1(unionMember1))

            /**
             * If present, only applications associated with the given outbound voice profile will
             * be returned. Matching is exact.
             */
            fun outboundVoiceProfileId(outboundVoiceProfileId: OutboundVoiceProfileId?) = apply {
                this.outboundVoiceProfileId = outboundVoiceProfileId
            }

            /**
             * Alias for calling [Builder.outboundVoiceProfileId] with
             * `outboundVoiceProfileId.orElse(null)`.
             */
            fun outboundVoiceProfileId(outboundVoiceProfileId: Optional<OutboundVoiceProfileId>) =
                outboundVoiceProfileId(outboundVoiceProfileId.getOrNull())

            /**
             * Alias for calling [outboundVoiceProfileId] with
             * `OutboundVoiceProfileId.ofString(string)`.
             */
            fun outboundVoiceProfileId(string: String) =
                outboundVoiceProfileId(OutboundVoiceProfileId.ofString(string))

            /**
             * Alias for calling [outboundVoiceProfileId] with `OutboundVoiceProfileId.ofEq(eq)`.
             */
            fun outboundVoiceProfileId(eq: OutboundVoiceProfileId.Eq) =
                outboundVoiceProfileId(OutboundVoiceProfileId.ofEq(eq))

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
                Filter(friendlyName, outboundVoiceProfileId, additionalProperties.build())
        }

        /**
         * If present, applications with <code>friendly_name</code> exactly matching the given value
         * will be returned. Matching is case-sensitive.
         */
        class FriendlyName
        private constructor(
            private val string: String? = null,
            private val unionMember1: UnionMember1? = null,
        ) {

            /**
             * If present, applications with <code>friendly_name</code> exactly matching the given
             * value will be returned. Matching is case-sensitive.
             */
            fun string(): Optional<String> = Optional.ofNullable(string)

            fun unionMember1(): Optional<UnionMember1> = Optional.ofNullable(unionMember1)

            fun isString(): Boolean = string != null

            fun isUnionMember1(): Boolean = unionMember1 != null

            /**
             * If present, applications with <code>friendly_name</code> exactly matching the given
             * value will be returned. Matching is case-sensitive.
             */
            fun asString(): String = string.getOrThrow("string")

            fun asUnionMember1(): UnionMember1 = unionMember1.getOrThrow("unionMember1")

            /**
             * Maps this instance's current variant to a value of type [T] using the given
             * [visitor].
             */
            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    string != null -> visitor.visitString(string)
                    unionMember1 != null -> visitor.visitUnionMember1(unionMember1)
                    else -> throw IllegalStateException("Invalid FriendlyName")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is FriendlyName &&
                    string == other.string &&
                    unionMember1 == other.unionMember1
            }

            override fun hashCode(): Int = Objects.hash(string, unionMember1)

            override fun toString(): String =
                when {
                    string != null -> "FriendlyName{string=$string}"
                    unionMember1 != null -> "FriendlyName{unionMember1=$unionMember1}"
                    else -> throw IllegalStateException("Invalid FriendlyName")
                }

            companion object {

                /**
                 * If present, applications with <code>friendly_name</code> exactly matching the
                 * given value will be returned. Matching is case-sensitive.
                 */
                @JvmStatic fun ofString(string: String) = FriendlyName(string = string)

                @JvmStatic
                fun ofUnionMember1(unionMember1: UnionMember1) =
                    FriendlyName(unionMember1 = unionMember1)
            }

            /**
             * An interface that defines how to map each variant of [FriendlyName] to a value of
             * type [T].
             */
            interface Visitor<out T> {

                /**
                 * If present, applications with <code>friendly_name</code> exactly matching the
                 * given value will be returned. Matching is case-sensitive.
                 */
                fun visitString(string: String): T

                fun visitUnionMember1(unionMember1: UnionMember1): T
            }

            class UnionMember1
            private constructor(
                private val contains: String?,
                private val eq: String?,
                private val additionalProperties: QueryParams,
            ) {

                /**
                 * If present, applications with <code>friendly_name</code> containing the given
                 * value will be returned. Matching is not case-sensitive.
                 */
                fun contains(): Optional<String> = Optional.ofNullable(contains)

                /** Exact match for friendly_name. Matching is case-sensitive. */
                fun eq(): Optional<String> = Optional.ofNullable(eq)

                /** Query params to send with the request. */
                fun _additionalProperties(): QueryParams = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [UnionMember1]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [UnionMember1]. */
                class Builder internal constructor() {

                    private var contains: String? = null
                    private var eq: String? = null
                    private var additionalProperties: QueryParams.Builder = QueryParams.builder()

                    @JvmSynthetic
                    internal fun from(unionMember1: UnionMember1) = apply {
                        contains = unionMember1.contains
                        eq = unionMember1.eq
                        additionalProperties = unionMember1.additionalProperties.toBuilder()
                    }

                    /**
                     * If present, applications with <code>friendly_name</code> containing the given
                     * value will be returned. Matching is not case-sensitive.
                     */
                    fun contains(contains: String?) = apply { this.contains = contains }

                    /** Alias for calling [Builder.contains] with `contains.orElse(null)`. */
                    fun contains(contains: Optional<String>) = contains(contains.getOrNull())

                    /** Exact match for friendly_name. Matching is case-sensitive. */
                    fun eq(eq: String?) = apply { this.eq = eq }

                    /** Alias for calling [Builder.eq] with `eq.orElse(null)`. */
                    fun eq(eq: Optional<String>) = eq(eq.getOrNull())

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
                     * Returns an immutable instance of [UnionMember1].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): UnionMember1 =
                        UnionMember1(contains, eq, additionalProperties.build())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is UnionMember1 &&
                        contains == other.contains &&
                        eq == other.eq &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(contains, eq, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "UnionMember1{contains=$contains, eq=$eq, additionalProperties=$additionalProperties}"
            }
        }

        /**
         * If present, only applications associated with the given outbound voice profile will be
         * returned. Matching is exact.
         */
        class OutboundVoiceProfileId
        private constructor(private val string: String? = null, private val eq: Eq? = null) {

            /**
             * If present, only applications associated with the given outbound voice profile will
             * be returned. Matching is exact.
             */
            fun string(): Optional<String> = Optional.ofNullable(string)

            fun eq(): Optional<Eq> = Optional.ofNullable(eq)

            fun isString(): Boolean = string != null

            fun isEq(): Boolean = eq != null

            /**
             * If present, only applications associated with the given outbound voice profile will
             * be returned. Matching is exact.
             */
            fun asString(): String = string.getOrThrow("string")

            fun asEq(): Eq = eq.getOrThrow("eq")

            /**
             * Maps this instance's current variant to a value of type [T] using the given
             * [visitor].
             */
            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    string != null -> visitor.visitString(string)
                    eq != null -> visitor.visitEq(eq)
                    else -> throw IllegalStateException("Invalid OutboundVoiceProfileId")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is OutboundVoiceProfileId && string == other.string && eq == other.eq
            }

            override fun hashCode(): Int = Objects.hash(string, eq)

            override fun toString(): String =
                when {
                    string != null -> "OutboundVoiceProfileId{string=$string}"
                    eq != null -> "OutboundVoiceProfileId{eq=$eq}"
                    else -> throw IllegalStateException("Invalid OutboundVoiceProfileId")
                }

            companion object {

                /**
                 * If present, only applications associated with the given outbound voice profile
                 * will be returned. Matching is exact.
                 */
                @JvmStatic fun ofString(string: String) = OutboundVoiceProfileId(string = string)

                @JvmStatic fun ofEq(eq: Eq) = OutboundVoiceProfileId(eq = eq)
            }

            /**
             * An interface that defines how to map each variant of [OutboundVoiceProfileId] to a
             * value of type [T].
             */
            interface Visitor<out T> {

                /**
                 * If present, only applications associated with the given outbound voice profile
                 * will be returned. Matching is exact.
                 */
                fun visitString(string: String): T

                fun visitEq(eq: Eq): T
            }

            class Eq
            private constructor(
                private val eq: String?,
                private val additionalProperties: QueryParams,
            ) {

                /** Exact match for the associated outbound voice profile. */
                fun eq(): Optional<String> = Optional.ofNullable(eq)

                /** Query params to send with the request. */
                fun _additionalProperties(): QueryParams = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Eq]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Eq]. */
                class Builder internal constructor() {

                    private var eq: String? = null
                    private var additionalProperties: QueryParams.Builder = QueryParams.builder()

                    @JvmSynthetic
                    internal fun from(eq: Eq) = apply {
                        this.eq = eq.eq
                        additionalProperties = eq.additionalProperties.toBuilder()
                    }

                    /** Exact match for the associated outbound voice profile. */
                    fun eq(eq: String?) = apply { this.eq = eq }

                    /** Alias for calling [Builder.eq] with `eq.orElse(null)`. */
                    fun eq(eq: Optional<String>) = eq(eq.getOrNull())

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
                     * Returns an immutable instance of [Eq].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Eq = Eq(eq, additionalProperties.build())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Eq &&
                        eq == other.eq &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(eq, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "Eq{eq=$eq, additionalProperties=$additionalProperties}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filter &&
                friendlyName == other.friendlyName &&
                outboundVoiceProfileId == other.outboundVoiceProfileId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(friendlyName, outboundVoiceProfileId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filter{friendlyName=$friendlyName, outboundVoiceProfileId=$outboundVoiceProfileId, additionalProperties=$additionalProperties}"
    }

    /**
     * Specifies the sort order for results. By default sorting direction is ascending. To have the
     * results sorted in descending order add the <code> -</code> prefix.<br/><br/> That is: <ul>
     * <li> <code>friendly_name</code>: sorts the result by the <code>friendly_name</code> field in
     *   ascending order. </li>
     * <li> <code>-friendly_name</code>: sorts the result by the <code>friendly_name</code> field in
     *   descending order. </li> </ul> <br/> If not given, results are sorted by
     *   <code>created_at</code> in descending order.
     */
    class Sort @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val CREATED_AT = of("created_at")

            @JvmField val FRIENDLY_NAME = of("friendly_name")

            @JvmField val ACTIVE = of("active")

            @JvmStatic fun of(value: String) = Sort(JsonField.of(value))
        }

        /** An enum containing [Sort]'s known values. */
        enum class Known {
            CREATED_AT,
            FRIENDLY_NAME,
            ACTIVE,
        }

        /**
         * An enum containing [Sort]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Sort] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CREATED_AT,
            FRIENDLY_NAME,
            ACTIVE,
            /** An enum member indicating that [Sort] was instantiated with an unknown value. */
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
                CREATED_AT -> Value.CREATED_AT
                FRIENDLY_NAME -> Value.FRIENDLY_NAME
                ACTIVE -> Value.ACTIVE
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
                CREATED_AT -> Known.CREATED_AT
                FRIENDLY_NAME -> Known.FRIENDLY_NAME
                ACTIVE -> Known.ACTIVE
                else -> throw TelnyxInvalidDataException("Unknown Sort: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Sort = apply {
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

            return other is Sort && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TexmlApplicationListParams &&
            filter == other.filter &&
            pageNumber == other.pageNumber &&
            pageSize == other.pageSize &&
            sort == other.sort &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(filter, pageNumber, pageSize, sort, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "TexmlApplicationListParams{filter=$filter, pageNumber=$pageNumber, pageSize=$pageSize, sort=$sort, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
