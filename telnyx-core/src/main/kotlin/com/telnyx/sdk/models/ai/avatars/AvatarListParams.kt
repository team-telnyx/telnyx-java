// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.avatars

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Returns a paginated list of the Telnyx stock avatars and custom avatars available to the
 * authenticated organization. Custom avatars owned by other organizations are never returned. The
 * `image_url` value is suitable for displaying a thumbnail and may be refreshed by listing or
 * retrieving the avatar again. `suggested_voice_id` recommends a compatible Telnyx voice for stock
 * avatars and is an empty string for custom avatars; it does not change an AI Assistant's voice
 * automatically.
 */
class AvatarListParams
private constructor(
    private val filterAvatarType: AvatarType?,
    private val filterId: String?,
    private val filterName: String?,
    private val pageNumber: Long?,
    private val pageSize: Long?,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Return only stock or custom avatars. */
    fun filterAvatarType(): Optional<AvatarType> = Optional.ofNullable(filterAvatarType)

    /** Return the avatar with this exact ID. */
    fun filterId(): Optional<String> = Optional.ofNullable(filterId)

    /** Return avatars whose names contain this value, using case-insensitive matching. */
    fun filterName(): Optional<String> = Optional.ofNullable(filterName)

    /** Page number to retrieve, starting at 1. */
    fun pageNumber(): Optional<Long> = Optional.ofNullable(pageNumber)

    /** Number of avatars to return per page. */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): AvatarListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [AvatarListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AvatarListParams]. */
    class Builder internal constructor() {

        private var filterAvatarType: AvatarType? = null
        private var filterId: String? = null
        private var filterName: String? = null
        private var pageNumber: Long? = null
        private var pageSize: Long? = null
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(avatarListParams: AvatarListParams) = apply {
            filterAvatarType = avatarListParams.filterAvatarType
            filterId = avatarListParams.filterId
            filterName = avatarListParams.filterName
            pageNumber = avatarListParams.pageNumber
            pageSize = avatarListParams.pageSize
            additionalHeaders = avatarListParams.additionalHeaders.toBuilder()
            additionalQueryParams = avatarListParams.additionalQueryParams.toBuilder()
        }

        /** Return only stock or custom avatars. */
        fun filterAvatarType(filterAvatarType: AvatarType?) = apply {
            this.filterAvatarType = filterAvatarType
        }

        /** Alias for calling [Builder.filterAvatarType] with `filterAvatarType.orElse(null)`. */
        fun filterAvatarType(filterAvatarType: Optional<AvatarType>) =
            filterAvatarType(filterAvatarType.getOrNull())

        /** Return the avatar with this exact ID. */
        fun filterId(filterId: String?) = apply { this.filterId = filterId }

        /** Alias for calling [Builder.filterId] with `filterId.orElse(null)`. */
        fun filterId(filterId: Optional<String>) = filterId(filterId.getOrNull())

        /** Return avatars whose names contain this value, using case-insensitive matching. */
        fun filterName(filterName: String?) = apply { this.filterName = filterName }

        /** Alias for calling [Builder.filterName] with `filterName.orElse(null)`. */
        fun filterName(filterName: Optional<String>) = filterName(filterName.getOrNull())

        /** Page number to retrieve, starting at 1. */
        fun pageNumber(pageNumber: Long?) = apply { this.pageNumber = pageNumber }

        /**
         * Alias for [Builder.pageNumber].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageNumber(pageNumber: Long) = pageNumber(pageNumber as Long?)

        /** Alias for calling [Builder.pageNumber] with `pageNumber.orElse(null)`. */
        fun pageNumber(pageNumber: Optional<Long>) = pageNumber(pageNumber.getOrNull())

        /** Number of avatars to return per page. */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

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
         * Returns an immutable instance of [AvatarListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AvatarListParams =
            AvatarListParams(
                filterAvatarType,
                filterId,
                filterName,
                pageNumber,
                pageSize,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                filterAvatarType?.let { put("filter[avatar_type]", it.toString()) }
                filterId?.let { put("filter[id]", it) }
                filterName?.let { put("filter[name]", it) }
                pageNumber?.let { put("page[number]", it.toString()) }
                pageSize?.let { put("page[size]", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AvatarListParams &&
            filterAvatarType == other.filterAvatarType &&
            filterId == other.filterId &&
            filterName == other.filterName &&
            pageNumber == other.pageNumber &&
            pageSize == other.pageSize &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            filterAvatarType,
            filterId,
            filterName,
            pageNumber,
            pageSize,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "AvatarListParams{filterAvatarType=$filterAvatarType, filterId=$filterId, filterName=$filterName, pageNumber=$pageNumber, pageSize=$pageSize, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
