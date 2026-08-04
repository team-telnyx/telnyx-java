// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes.threads.labels

import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.models.emailinboxes.messages.labels.LabelMutationRequest
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Adds one or more mutable labels to a thread, letting an agent mark a whole conversation (for
 * example `needs_review`) without labelling each message individually.
 *
 * Thread labels are independent of message labels: labelling a thread does not label its messages,
 * and labelling a message does not label its thread. Idempotent and case-sensitive.
 */
class LabelCreateParams
private constructor(
    private val inboxId: String,
    private val threadId: String?,
    private val labelMutationRequest: LabelMutationRequest,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun inboxId(): String = inboxId

    fun threadId(): Optional<String> = Optional.ofNullable(threadId)

    /**
     * Labels to add or remove. Both operations are idempotent set operations, so a retried request
     * converges instead of failing.
     */
    fun labelMutationRequest(): LabelMutationRequest = labelMutationRequest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        labelMutationRequest._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LabelCreateParams].
         *
         * The following fields are required:
         * ```java
         * .inboxId()
         * .labelMutationRequest()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LabelCreateParams]. */
    class Builder internal constructor() {

        private var inboxId: String? = null
        private var threadId: String? = null
        private var labelMutationRequest: LabelMutationRequest? = null
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(labelCreateParams: LabelCreateParams) = apply {
            inboxId = labelCreateParams.inboxId
            threadId = labelCreateParams.threadId
            labelMutationRequest = labelCreateParams.labelMutationRequest
            additionalHeaders = labelCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = labelCreateParams.additionalQueryParams.toBuilder()
        }

        fun inboxId(inboxId: String) = apply { this.inboxId = inboxId }

        fun threadId(threadId: String?) = apply { this.threadId = threadId }

        /** Alias for calling [Builder.threadId] with `threadId.orElse(null)`. */
        fun threadId(threadId: Optional<String>) = threadId(threadId.getOrNull())

        /**
         * Labels to add or remove. Both operations are idempotent set operations, so a retried
         * request converges instead of failing.
         */
        fun labelMutationRequest(labelMutationRequest: LabelMutationRequest) = apply {
            this.labelMutationRequest = labelMutationRequest
        }

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
         * Returns an immutable instance of [LabelCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .inboxId()
         * .labelMutationRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LabelCreateParams =
            LabelCreateParams(
                checkRequired("inboxId", inboxId),
                threadId,
                checkRequired("labelMutationRequest", labelMutationRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): LabelMutationRequest = labelMutationRequest

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> inboxId
            1 -> threadId ?: ""
            else -> ""
        }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LabelCreateParams &&
            inboxId == other.inboxId &&
            threadId == other.threadId &&
            labelMutationRequest == other.labelMutationRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            inboxId,
            threadId,
            labelMutationRequest,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "LabelCreateParams{inboxId=$inboxId, threadId=$threadId, labelMutationRequest=$labelMutationRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
