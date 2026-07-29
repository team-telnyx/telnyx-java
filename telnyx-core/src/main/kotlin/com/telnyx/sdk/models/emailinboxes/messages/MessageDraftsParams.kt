// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes.messages

import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.immutableEmptyMap
import com.telnyx.sdk.models.emailinboxes.drafts.EmailDraftRequest
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Creates an unsent reply draft for an inbound message. Unlike the `/actions/reply` endpoint, which
 * sends immediately, this stores a draft that can be reviewed and edited before sending.
 *
 * `reply_to_message_id` and `thread_id` are inherited from the parent message and cannot be set by
 * the caller. The recipient, `Re:` subject and `In-Reply-To`/`References` headers are pre-filled
 * from the parent using the same rules as a live reply, so sending the draft threads identically.
 * Supplying `to` or `subject` explicitly overrides the pre-filled value.
 */
class MessageDraftsParams
private constructor(
    private val inboxId: String,
    private val messageId: String?,
    private val emailDraftRequest: EmailDraftRequest?,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun inboxId(): String = inboxId

    fun messageId(): Optional<String> = Optional.ofNullable(messageId)

    /**
     * All fields are optional — a draft may be saved incomplete. `account_id`, `inbox_id`,
     * `status`, `sent_at`, `sent_message_id`, `reply_to_message_id` and `thread_id` are
     * server-owned and ignored if supplied.
     */
    fun emailDraftRequest(): Optional<EmailDraftRequest> = Optional.ofNullable(emailDraftRequest)

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        emailDraftRequest?._additionalProperties() ?: immutableEmptyMap()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MessageDraftsParams].
         *
         * The following fields are required:
         * ```java
         * .inboxId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MessageDraftsParams]. */
    class Builder internal constructor() {

        private var inboxId: String? = null
        private var messageId: String? = null
        private var emailDraftRequest: EmailDraftRequest? = null
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(messageDraftsParams: MessageDraftsParams) = apply {
            inboxId = messageDraftsParams.inboxId
            messageId = messageDraftsParams.messageId
            emailDraftRequest = messageDraftsParams.emailDraftRequest
            additionalHeaders = messageDraftsParams.additionalHeaders.toBuilder()
            additionalQueryParams = messageDraftsParams.additionalQueryParams.toBuilder()
        }

        fun inboxId(inboxId: String) = apply { this.inboxId = inboxId }

        fun messageId(messageId: String?) = apply { this.messageId = messageId }

        /** Alias for calling [Builder.messageId] with `messageId.orElse(null)`. */
        fun messageId(messageId: Optional<String>) = messageId(messageId.getOrNull())

        /**
         * All fields are optional — a draft may be saved incomplete. `account_id`, `inbox_id`,
         * `status`, `sent_at`, `sent_message_id`, `reply_to_message_id` and `thread_id` are
         * server-owned and ignored if supplied.
         */
        fun emailDraftRequest(emailDraftRequest: EmailDraftRequest?) = apply {
            this.emailDraftRequest = emailDraftRequest
        }

        /** Alias for calling [Builder.emailDraftRequest] with `emailDraftRequest.orElse(null)`. */
        fun emailDraftRequest(emailDraftRequest: Optional<EmailDraftRequest>) =
            emailDraftRequest(emailDraftRequest.getOrNull())

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
         * Returns an immutable instance of [MessageDraftsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .inboxId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MessageDraftsParams =
            MessageDraftsParams(
                checkRequired("inboxId", inboxId),
                messageId,
                emailDraftRequest,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Optional<EmailDraftRequest> = Optional.ofNullable(emailDraftRequest)

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

        return other is MessageDraftsParams &&
            inboxId == other.inboxId &&
            messageId == other.messageId &&
            emailDraftRequest == other.emailDraftRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            inboxId,
            messageId,
            emailDraftRequest,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "MessageDraftsParams{inboxId=$inboxId, messageId=$messageId, emailDraftRequest=$emailDraftRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
