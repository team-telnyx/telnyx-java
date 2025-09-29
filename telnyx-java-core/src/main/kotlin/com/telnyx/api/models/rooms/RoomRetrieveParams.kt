// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.rooms

import com.telnyx.api.core.Params
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** View a room. */
class RoomRetrieveParams
private constructor(
    private val roomId: String?,
    private val includeSessions: Boolean?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun roomId(): Optional<String> = Optional.ofNullable(roomId)

    /** To decide if room sessions should be included in the response. */
    fun includeSessions(): Optional<Boolean> = Optional.ofNullable(includeSessions)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): RoomRetrieveParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [RoomRetrieveParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RoomRetrieveParams]. */
    class Builder internal constructor() {

        private var roomId: String? = null
        private var includeSessions: Boolean? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(roomRetrieveParams: RoomRetrieveParams) = apply {
            roomId = roomRetrieveParams.roomId
            includeSessions = roomRetrieveParams.includeSessions
            additionalHeaders = roomRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams = roomRetrieveParams.additionalQueryParams.toBuilder()
        }

        fun roomId(roomId: String?) = apply { this.roomId = roomId }

        /** Alias for calling [Builder.roomId] with `roomId.orElse(null)`. */
        fun roomId(roomId: Optional<String>) = roomId(roomId.getOrNull())

        /** To decide if room sessions should be included in the response. */
        fun includeSessions(includeSessions: Boolean?) = apply {
            this.includeSessions = includeSessions
        }

        /**
         * Alias for [Builder.includeSessions].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeSessions(includeSessions: Boolean) = includeSessions(includeSessions as Boolean?)

        /** Alias for calling [Builder.includeSessions] with `includeSessions.orElse(null)`. */
        fun includeSessions(includeSessions: Optional<Boolean>) =
            includeSessions(includeSessions.getOrNull())

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
         * Returns an immutable instance of [RoomRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RoomRetrieveParams =
            RoomRetrieveParams(
                roomId,
                includeSessions,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> roomId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                includeSessions?.let { put("include_sessions", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RoomRetrieveParams &&
            roomId == other.roomId &&
            includeSessions == other.includeSessions &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(roomId, includeSessions, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "RoomRetrieveParams{roomId=$roomId, includeSessions=$includeSessions, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
