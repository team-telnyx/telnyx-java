// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes.messages.actions

import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Sends from the inbox address through the standard email send pipeline. The recipient is the
 * original `Reply-To`, falling back to `From`; original Cc recipients are not included. The subject
 * is prefixed with `Re:` unless it already has that prefix.
 *
 * Threading headers are derived from the original message: `In-Reply-To` is set to its RFC
 * Message-ID, and `References` contains the original References values plus that Message-ID,
 * de-duplicated and limited to the most recent 20 values.
 */
class ActionReplyParams
private constructor(
    private val inboxId: String,
    private val messageId: String?,
    private val replyEmailInboxMessageRequest: ReplyEmailInboxMessageRequest,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun inboxId(): String = inboxId

    fun messageId(): Optional<String> = Optional.ofNullable(messageId)

    /**
     * At least one of `text` or `html` must contain a non-whitespace body. Recipients are derived
     * from the source message; caller-supplied `to`, `cc`, or `bcc` values are ignored.
     */
    fun replyEmailInboxMessageRequest(): ReplyEmailInboxMessageRequest =
        replyEmailInboxMessageRequest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        replyEmailInboxMessageRequest._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ActionReplyParams].
         *
         * The following fields are required:
         * ```java
         * .inboxId()
         * .replyEmailInboxMessageRequest()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ActionReplyParams]. */
    class Builder internal constructor() {

        private var inboxId: String? = null
        private var messageId: String? = null
        private var replyEmailInboxMessageRequest: ReplyEmailInboxMessageRequest? = null
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(actionReplyParams: ActionReplyParams) = apply {
            inboxId = actionReplyParams.inboxId
            messageId = actionReplyParams.messageId
            replyEmailInboxMessageRequest = actionReplyParams.replyEmailInboxMessageRequest
            additionalHeaders = actionReplyParams.additionalHeaders.toBuilder()
            additionalQueryParams = actionReplyParams.additionalQueryParams.toBuilder()
        }

        fun inboxId(inboxId: String) = apply { this.inboxId = inboxId }

        fun messageId(messageId: String?) = apply { this.messageId = messageId }

        /** Alias for calling [Builder.messageId] with `messageId.orElse(null)`. */
        fun messageId(messageId: Optional<String>) = messageId(messageId.getOrNull())

        /**
         * At least one of `text` or `html` must contain a non-whitespace body. Recipients are
         * derived from the source message; caller-supplied `to`, `cc`, or `bcc` values are ignored.
         */
        fun replyEmailInboxMessageRequest(
            replyEmailInboxMessageRequest: ReplyEmailInboxMessageRequest
        ) = apply { this.replyEmailInboxMessageRequest = replyEmailInboxMessageRequest }

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
         * Returns an immutable instance of [ActionReplyParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .inboxId()
         * .replyEmailInboxMessageRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ActionReplyParams =
            ActionReplyParams(
                checkRequired("inboxId", inboxId),
                messageId,
                checkRequired("replyEmailInboxMessageRequest", replyEmailInboxMessageRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): ReplyEmailInboxMessageRequest = replyEmailInboxMessageRequest

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

        return other is ActionReplyParams &&
            inboxId == other.inboxId &&
            messageId == other.messageId &&
            replyEmailInboxMessageRequest == other.replyEmailInboxMessageRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            inboxId,
            messageId,
            replyEmailInboxMessageRequest,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ActionReplyParams{inboxId=$inboxId, messageId=$messageId, replyEmailInboxMessageRequest=$replyEmailInboxMessageRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
