// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes.drafts

import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Identical to `PUT`; both apply a partial update to the supplied fields. */
class DraftPatchParams
private constructor(
    private val inboxId: String,
    private val draftId: String?,
    private val emailDraftRequest: EmailDraftRequest,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun inboxId(): String = inboxId

    fun draftId(): Optional<String> = Optional.ofNullable(draftId)

    /**
     * All fields are optional — a draft may be saved incomplete. `account_id`, `inbox_id`,
     * `status`, `sent_at`, `sent_message_id`, `reply_to_message_id` and `thread_id` are
     * server-owned and ignored if supplied.
     */
    fun emailDraftRequest(): EmailDraftRequest = emailDraftRequest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        emailDraftRequest._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DraftPatchParams].
         *
         * The following fields are required:
         * ```java
         * .inboxId()
         * .emailDraftRequest()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DraftPatchParams]. */
    class Builder internal constructor() {

        private var inboxId: String? = null
        private var draftId: String? = null
        private var emailDraftRequest: EmailDraftRequest? = null
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(draftPatchParams: DraftPatchParams) = apply {
            inboxId = draftPatchParams.inboxId
            draftId = draftPatchParams.draftId
            emailDraftRequest = draftPatchParams.emailDraftRequest
            additionalHeaders = draftPatchParams.additionalHeaders.toBuilder()
            additionalQueryParams = draftPatchParams.additionalQueryParams.toBuilder()
        }

        fun inboxId(inboxId: String) = apply { this.inboxId = inboxId }

        fun draftId(draftId: String?) = apply { this.draftId = draftId }

        /** Alias for calling [Builder.draftId] with `draftId.orElse(null)`. */
        fun draftId(draftId: Optional<String>) = draftId(draftId.getOrNull())

        /**
         * All fields are optional — a draft may be saved incomplete. `account_id`, `inbox_id`,
         * `status`, `sent_at`, `sent_message_id`, `reply_to_message_id` and `thread_id` are
         * server-owned and ignored if supplied.
         */
        fun emailDraftRequest(emailDraftRequest: EmailDraftRequest) = apply {
            this.emailDraftRequest = emailDraftRequest
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
         * Returns an immutable instance of [DraftPatchParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .inboxId()
         * .emailDraftRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DraftPatchParams =
            DraftPatchParams(
                checkRequired("inboxId", inboxId),
                draftId,
                checkRequired("emailDraftRequest", emailDraftRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): EmailDraftRequest = emailDraftRequest

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> inboxId
            1 -> draftId ?: ""
            else -> ""
        }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DraftPatchParams &&
            inboxId == other.inboxId &&
            draftId == other.draftId &&
            emailDraftRequest == other.emailDraftRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(inboxId, draftId, emailDraftRequest, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "DraftPatchParams{inboxId=$inboxId, draftId=$draftId, emailDraftRequest=$emailDraftRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
