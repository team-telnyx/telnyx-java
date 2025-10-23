// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.simcarddatausagenotifications

import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Updates information for a SIM Card Data Usage Notification. */
class SimCardDataUsageNotificationUpdateParams
private constructor(
    private val pathId: String?,
    private val simCardDataUsageNotification: SimCardDataUsageNotification,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun pathId(): Optional<String> = Optional.ofNullable(pathId)

    /** The SIM card individual data usage notification information. */
    fun simCardDataUsageNotification(): SimCardDataUsageNotification = simCardDataUsageNotification

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        simCardDataUsageNotification._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SimCardDataUsageNotificationUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .simCardDataUsageNotification()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SimCardDataUsageNotificationUpdateParams]. */
    class Builder internal constructor() {

        private var pathId: String? = null
        private var simCardDataUsageNotification: SimCardDataUsageNotification? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            simCardDataUsageNotificationUpdateParams: SimCardDataUsageNotificationUpdateParams
        ) = apply {
            pathId = simCardDataUsageNotificationUpdateParams.pathId
            simCardDataUsageNotification =
                simCardDataUsageNotificationUpdateParams.simCardDataUsageNotification
            additionalHeaders =
                simCardDataUsageNotificationUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                simCardDataUsageNotificationUpdateParams.additionalQueryParams.toBuilder()
        }

        fun pathId(pathId: String?) = apply { this.pathId = pathId }

        /** Alias for calling [Builder.pathId] with `pathId.orElse(null)`. */
        fun pathId(pathId: Optional<String>) = pathId(pathId.getOrNull())

        /** The SIM card individual data usage notification information. */
        fun simCardDataUsageNotification(
            simCardDataUsageNotification: SimCardDataUsageNotification
        ) = apply { this.simCardDataUsageNotification = simCardDataUsageNotification }

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
         * Returns an immutable instance of [SimCardDataUsageNotificationUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .simCardDataUsageNotification()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SimCardDataUsageNotificationUpdateParams =
            SimCardDataUsageNotificationUpdateParams(
                pathId,
                checkRequired("simCardDataUsageNotification", simCardDataUsageNotification),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): SimCardDataUsageNotification = simCardDataUsageNotification

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> pathId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SimCardDataUsageNotificationUpdateParams &&
            pathId == other.pathId &&
            simCardDataUsageNotification == other.simCardDataUsageNotification &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(pathId, simCardDataUsageNotification, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "SimCardDataUsageNotificationUpdateParams{pathId=$pathId, simCardDataUsageNotification=$simCardDataUsageNotification, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
