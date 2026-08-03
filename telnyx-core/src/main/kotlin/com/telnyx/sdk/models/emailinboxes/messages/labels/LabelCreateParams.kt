// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes.messages.labels

import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Adds one or more mutable labels to a message. Labels carry agent workflow state such as `spam`,
 * `needs_review`, or `processed`.
 *
 * Labels are **not** the same as the send-time `tags` on outbound messages: `tags` are immutable
 * and propagate to Email Detail Records and Mission Control for billing attribution, while labels
 * are mailbox state that never reaches the reporting contract.
 *
 * The operation is an idempotent set union — adding a label the message already carries is a no-op
 * and still returns 200. Labels are case-sensitive, and message labels are independent of thread
 * labels.
 */
class LabelCreateParams
private constructor(
    private val inboxId: String,
    private val messageId: String?,
    private val labelMutationRequest: LabelMutationRequest,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun inboxId(): String = inboxId

    fun messageId(): Optional<String> = Optional.ofNullable(messageId)

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
        private var messageId: String? = null
        private var labelMutationRequest: LabelMutationRequest? = null
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(labelCreateParams: LabelCreateParams) = apply {
            inboxId = labelCreateParams.inboxId
            messageId = labelCreateParams.messageId
            labelMutationRequest = labelCreateParams.labelMutationRequest
            additionalHeaders = labelCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = labelCreateParams.additionalQueryParams.toBuilder()
        }

        fun inboxId(inboxId: String) = apply { this.inboxId = inboxId }

        fun messageId(messageId: String?) = apply { this.messageId = messageId }

        /** Alias for calling [Builder.messageId] with `messageId.orElse(null)`. */
        fun messageId(messageId: Optional<String>) = messageId(messageId.getOrNull())

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
                messageId,
                checkRequired("labelMutationRequest", labelMutationRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): LabelMutationRequest = labelMutationRequest

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> inboxId
            1 -> messageId ?: ""
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
            messageId == other.messageId &&
            labelMutationRequest == other.labelMutationRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            inboxId,
            messageId,
            labelMutationRequest,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "LabelCreateParams{inboxId=$inboxId, messageId=$messageId, labelMutationRequest=$labelMutationRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
