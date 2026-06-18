// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.conversations

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve a list of all AI conversations configured by the user. Supports
 * [PostgREST-style query parameters](https://postgrest.org/en/stable/api.html#horizontal-filtering-rows)
 * for filtering. Examples are included for the standard metadata fields, but you can filter on any
 * field in the metadata JSON object. For example, to filter by a custom field
 * `metadata->custom_field`, use `metadata->custom_field=eq.value`.
 */
class ConversationListParams
private constructor(
    private val id: String?,
    private val createdAt: String?,
    private val lastMessageAt: String?,
    private val limit: Long?,
    private val metadataAssistantId: String?,
    private val metadataCallControlId: String?,
    private val metadataTelnyxAgentTarget: String?,
    private val metadataTelnyxConversationChannel: String?,
    private val metadataTelnyxEndUserTarget: String?,
    private val name: String?,
    private val or: String?,
    private val order: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Filter by conversation ID (e.g. id=eq.123) */
    fun id(): Optional<String> = Optional.ofNullable(id)

    /** Filter by creation datetime (e.g., `created_at=gte.2025-01-01`) */
    fun createdAt(): Optional<String> = Optional.ofNullable(createdAt)

    /** Filter by last message datetime (e.g., `last_message_at=lte.2025-06-01`) */
    fun lastMessageAt(): Optional<String> = Optional.ofNullable(lastMessageAt)

    /** Limit the number of returned conversations (e.g., `limit=10`) */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Filter by assistant ID (e.g., `metadata->assistant_id=eq.assistant-123`) */
    fun metadataAssistantId(): Optional<String> = Optional.ofNullable(metadataAssistantId)

    /** Filter by call control ID (e.g., `metadata->call_control_id=eq.v3:123`) */
    fun metadataCallControlId(): Optional<String> = Optional.ofNullable(metadataCallControlId)

    /**
     * Filter by the phone number, SIP URI, or other identifier for the agent (e.g.,
     * `metadata->telnyx_agent_target=eq.+13128675309`)
     */
    fun metadataTelnyxAgentTarget(): Optional<String> =
        Optional.ofNullable(metadataTelnyxAgentTarget)

    /**
     * Filter by conversation channel (e.g., `metadata->telnyx_conversation_channel=eq.phone_call`)
     */
    fun metadataTelnyxConversationChannel(): Optional<String> =
        Optional.ofNullable(metadataTelnyxConversationChannel)

    /**
     * Filter by the phone number, SIP URI, or other identifier for the end user (e.g.,
     * `metadata->telnyx_end_user_target=eq.+13128675309`)
     */
    fun metadataTelnyxEndUserTarget(): Optional<String> =
        Optional.ofNullable(metadataTelnyxEndUserTarget)

    /** Filter by conversation Name (e.g. `name=like.Voice%`) */
    fun name(): Optional<String> = Optional.ofNullable(name)

    /**
     * Apply OR conditions using PostgREST syntax (e.g.,
     * `or=(created_at.gte.2025-04-01,last_message_at.gte.2025-04-01)`)
     */
    fun or(): Optional<String> = Optional.ofNullable(or)

    /**
     * Order the results by specific fields (e.g., `order=created_at.desc` or
     * `order=last_message_at.asc`)
     */
    fun order(): Optional<String> = Optional.ofNullable(order)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ConversationListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ConversationListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ConversationListParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var createdAt: String? = null
        private var lastMessageAt: String? = null
        private var limit: Long? = null
        private var metadataAssistantId: String? = null
        private var metadataCallControlId: String? = null
        private var metadataTelnyxAgentTarget: String? = null
        private var metadataTelnyxConversationChannel: String? = null
        private var metadataTelnyxEndUserTarget: String? = null
        private var name: String? = null
        private var or: String? = null
        private var order: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(conversationListParams: ConversationListParams) = apply {
            id = conversationListParams.id
            createdAt = conversationListParams.createdAt
            lastMessageAt = conversationListParams.lastMessageAt
            limit = conversationListParams.limit
            metadataAssistantId = conversationListParams.metadataAssistantId
            metadataCallControlId = conversationListParams.metadataCallControlId
            metadataTelnyxAgentTarget = conversationListParams.metadataTelnyxAgentTarget
            metadataTelnyxConversationChannel =
                conversationListParams.metadataTelnyxConversationChannel
            metadataTelnyxEndUserTarget = conversationListParams.metadataTelnyxEndUserTarget
            name = conversationListParams.name
            or = conversationListParams.or
            order = conversationListParams.order
            additionalHeaders = conversationListParams.additionalHeaders.toBuilder()
            additionalQueryParams = conversationListParams.additionalQueryParams.toBuilder()
        }

        /** Filter by conversation ID (e.g. id=eq.123) */
        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /** Filter by creation datetime (e.g., `created_at=gte.2025-01-01`) */
        fun createdAt(createdAt: String?) = apply { this.createdAt = createdAt }

        /** Alias for calling [Builder.createdAt] with `createdAt.orElse(null)`. */
        fun createdAt(createdAt: Optional<String>) = createdAt(createdAt.getOrNull())

        /** Filter by last message datetime (e.g., `last_message_at=lte.2025-06-01`) */
        fun lastMessageAt(lastMessageAt: String?) = apply { this.lastMessageAt = lastMessageAt }

        /** Alias for calling [Builder.lastMessageAt] with `lastMessageAt.orElse(null)`. */
        fun lastMessageAt(lastMessageAt: Optional<String>) =
            lastMessageAt(lastMessageAt.getOrNull())

        /** Limit the number of returned conversations (e.g., `limit=10`) */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        /** Filter by assistant ID (e.g., `metadata->assistant_id=eq.assistant-123`) */
        fun metadataAssistantId(metadataAssistantId: String?) = apply {
            this.metadataAssistantId = metadataAssistantId
        }

        /**
         * Alias for calling [Builder.metadataAssistantId] with `metadataAssistantId.orElse(null)`.
         */
        fun metadataAssistantId(metadataAssistantId: Optional<String>) =
            metadataAssistantId(metadataAssistantId.getOrNull())

        /** Filter by call control ID (e.g., `metadata->call_control_id=eq.v3:123`) */
        fun metadataCallControlId(metadataCallControlId: String?) = apply {
            this.metadataCallControlId = metadataCallControlId
        }

        /**
         * Alias for calling [Builder.metadataCallControlId] with
         * `metadataCallControlId.orElse(null)`.
         */
        fun metadataCallControlId(metadataCallControlId: Optional<String>) =
            metadataCallControlId(metadataCallControlId.getOrNull())

        /**
         * Filter by the phone number, SIP URI, or other identifier for the agent (e.g.,
         * `metadata->telnyx_agent_target=eq.+13128675309`)
         */
        fun metadataTelnyxAgentTarget(metadataTelnyxAgentTarget: String?) = apply {
            this.metadataTelnyxAgentTarget = metadataTelnyxAgentTarget
        }

        /**
         * Alias for calling [Builder.metadataTelnyxAgentTarget] with
         * `metadataTelnyxAgentTarget.orElse(null)`.
         */
        fun metadataTelnyxAgentTarget(metadataTelnyxAgentTarget: Optional<String>) =
            metadataTelnyxAgentTarget(metadataTelnyxAgentTarget.getOrNull())

        /**
         * Filter by conversation channel (e.g.,
         * `metadata->telnyx_conversation_channel=eq.phone_call`)
         */
        fun metadataTelnyxConversationChannel(metadataTelnyxConversationChannel: String?) = apply {
            this.metadataTelnyxConversationChannel = metadataTelnyxConversationChannel
        }

        /**
         * Alias for calling [Builder.metadataTelnyxConversationChannel] with
         * `metadataTelnyxConversationChannel.orElse(null)`.
         */
        fun metadataTelnyxConversationChannel(metadataTelnyxConversationChannel: Optional<String>) =
            metadataTelnyxConversationChannel(metadataTelnyxConversationChannel.getOrNull())

        /**
         * Filter by the phone number, SIP URI, or other identifier for the end user (e.g.,
         * `metadata->telnyx_end_user_target=eq.+13128675309`)
         */
        fun metadataTelnyxEndUserTarget(metadataTelnyxEndUserTarget: String?) = apply {
            this.metadataTelnyxEndUserTarget = metadataTelnyxEndUserTarget
        }

        /**
         * Alias for calling [Builder.metadataTelnyxEndUserTarget] with
         * `metadataTelnyxEndUserTarget.orElse(null)`.
         */
        fun metadataTelnyxEndUserTarget(metadataTelnyxEndUserTarget: Optional<String>) =
            metadataTelnyxEndUserTarget(metadataTelnyxEndUserTarget.getOrNull())

        /** Filter by conversation Name (e.g. `name=like.Voice%`) */
        fun name(name: String?) = apply { this.name = name }

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /**
         * Apply OR conditions using PostgREST syntax (e.g.,
         * `or=(created_at.gte.2025-04-01,last_message_at.gte.2025-04-01)`)
         */
        fun or(or: String?) = apply { this.or = or }

        /** Alias for calling [Builder.or] with `or.orElse(null)`. */
        fun or(or: Optional<String>) = or(or.getOrNull())

        /**
         * Order the results by specific fields (e.g., `order=created_at.desc` or
         * `order=last_message_at.asc`)
         */
        fun order(order: String?) = apply { this.order = order }

        /** Alias for calling [Builder.order] with `order.orElse(null)`. */
        fun order(order: Optional<String>) = order(order.getOrNull())

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
         * Returns an immutable instance of [ConversationListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ConversationListParams =
            ConversationListParams(
                id,
                createdAt,
                lastMessageAt,
                limit,
                metadataAssistantId,
                metadataCallControlId,
                metadataTelnyxAgentTarget,
                metadataTelnyxConversationChannel,
                metadataTelnyxEndUserTarget,
                name,
                or,
                order,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                id?.let { put("id", it) }
                createdAt?.let { put("created_at", it) }
                lastMessageAt?.let { put("last_message_at", it) }
                limit?.let { put("limit", it.toString()) }
                metadataAssistantId?.let { put("metadata->assistant_id", it) }
                metadataCallControlId?.let { put("metadata->call_control_id", it) }
                metadataTelnyxAgentTarget?.let { put("metadata->telnyx_agent_target", it) }
                metadataTelnyxConversationChannel?.let {
                    put("metadata->telnyx_conversation_channel", it)
                }
                metadataTelnyxEndUserTarget?.let { put("metadata->telnyx_end_user_target", it) }
                name?.let { put("name", it) }
                or?.let { put("or", it) }
                order?.let { put("order", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConversationListParams &&
            id == other.id &&
            createdAt == other.createdAt &&
            lastMessageAt == other.lastMessageAt &&
            limit == other.limit &&
            metadataAssistantId == other.metadataAssistantId &&
            metadataCallControlId == other.metadataCallControlId &&
            metadataTelnyxAgentTarget == other.metadataTelnyxAgentTarget &&
            metadataTelnyxConversationChannel == other.metadataTelnyxConversationChannel &&
            metadataTelnyxEndUserTarget == other.metadataTelnyxEndUserTarget &&
            name == other.name &&
            or == other.or &&
            order == other.order &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            id,
            createdAt,
            lastMessageAt,
            limit,
            metadataAssistantId,
            metadataCallControlId,
            metadataTelnyxAgentTarget,
            metadataTelnyxConversationChannel,
            metadataTelnyxEndUserTarget,
            name,
            or,
            order,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ConversationListParams{id=$id, createdAt=$createdAt, lastMessageAt=$lastMessageAt, limit=$limit, metadataAssistantId=$metadataAssistantId, metadataCallControlId=$metadataCallControlId, metadataTelnyxAgentTarget=$metadataTelnyxAgentTarget, metadataTelnyxConversationChannel=$metadataTelnyxConversationChannel, metadataTelnyxEndUserTarget=$metadataTelnyxEndUserTarget, name=$name, or=$or, order=$order, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
