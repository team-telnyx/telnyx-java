// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class MessagingSettings
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val conversationInactivityMinutes: JsonField<Long>,
    private val defaultMessagingProfileId: JsonField<String>,
    private val deliveryStatusWebhookUrl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("conversation_inactivity_minutes")
        @ExcludeMissing
        conversationInactivityMinutes: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("default_messaging_profile_id")
        @ExcludeMissing
        defaultMessagingProfileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("delivery_status_webhook_url")
        @ExcludeMissing
        deliveryStatusWebhookUrl: JsonField<String> = JsonMissing.of(),
    ) : this(
        conversationInactivityMinutes,
        defaultMessagingProfileId,
        deliveryStatusWebhookUrl,
        mutableMapOf(),
    )

    /**
     * If more than this many minutes have passed since the last message, the assistant will start a
     * new conversation instead of continuing the existing one.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun conversationInactivityMinutes(): Optional<Long> =
        conversationInactivityMinutes.getOptional("conversation_inactivity_minutes")

    /**
     * Default Messaging Profile used for messaging exchanges with your assistant. This will be
     * created automatically on assistant creation.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun defaultMessagingProfileId(): Optional<String> =
        defaultMessagingProfileId.getOptional("default_messaging_profile_id")

    /**
     * The URL where webhooks related to delivery statused for assistant messages will be sent.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deliveryStatusWebhookUrl(): Optional<String> =
        deliveryStatusWebhookUrl.getOptional("delivery_status_webhook_url")

    /**
     * Returns the raw JSON value of [conversationInactivityMinutes].
     *
     * Unlike [conversationInactivityMinutes], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("conversation_inactivity_minutes")
    @ExcludeMissing
    fun _conversationInactivityMinutes(): JsonField<Long> = conversationInactivityMinutes

    /**
     * Returns the raw JSON value of [defaultMessagingProfileId].
     *
     * Unlike [defaultMessagingProfileId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("default_messaging_profile_id")
    @ExcludeMissing
    fun _defaultMessagingProfileId(): JsonField<String> = defaultMessagingProfileId

    /**
     * Returns the raw JSON value of [deliveryStatusWebhookUrl].
     *
     * Unlike [deliveryStatusWebhookUrl], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("delivery_status_webhook_url")
    @ExcludeMissing
    fun _deliveryStatusWebhookUrl(): JsonField<String> = deliveryStatusWebhookUrl

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [MessagingSettings]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MessagingSettings]. */
    class Builder internal constructor() {

        private var conversationInactivityMinutes: JsonField<Long> = JsonMissing.of()
        private var defaultMessagingProfileId: JsonField<String> = JsonMissing.of()
        private var deliveryStatusWebhookUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(messagingSettings: MessagingSettings) = apply {
            conversationInactivityMinutes = messagingSettings.conversationInactivityMinutes
            defaultMessagingProfileId = messagingSettings.defaultMessagingProfileId
            deliveryStatusWebhookUrl = messagingSettings.deliveryStatusWebhookUrl
            additionalProperties = messagingSettings.additionalProperties.toMutableMap()
        }

        /**
         * If more than this many minutes have passed since the last message, the assistant will
         * start a new conversation instead of continuing the existing one.
         */
        fun conversationInactivityMinutes(conversationInactivityMinutes: Long) =
            conversationInactivityMinutes(JsonField.of(conversationInactivityMinutes))

        /**
         * Sets [Builder.conversationInactivityMinutes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conversationInactivityMinutes] with a well-typed [Long]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun conversationInactivityMinutes(conversationInactivityMinutes: JsonField<Long>) = apply {
            this.conversationInactivityMinutes = conversationInactivityMinutes
        }

        /**
         * Default Messaging Profile used for messaging exchanges with your assistant. This will be
         * created automatically on assistant creation.
         */
        fun defaultMessagingProfileId(defaultMessagingProfileId: String) =
            defaultMessagingProfileId(JsonField.of(defaultMessagingProfileId))

        /**
         * Sets [Builder.defaultMessagingProfileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultMessagingProfileId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun defaultMessagingProfileId(defaultMessagingProfileId: JsonField<String>) = apply {
            this.defaultMessagingProfileId = defaultMessagingProfileId
        }

        /**
         * The URL where webhooks related to delivery statused for assistant messages will be sent.
         */
        fun deliveryStatusWebhookUrl(deliveryStatusWebhookUrl: String) =
            deliveryStatusWebhookUrl(JsonField.of(deliveryStatusWebhookUrl))

        /**
         * Sets [Builder.deliveryStatusWebhookUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deliveryStatusWebhookUrl] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun deliveryStatusWebhookUrl(deliveryStatusWebhookUrl: JsonField<String>) = apply {
            this.deliveryStatusWebhookUrl = deliveryStatusWebhookUrl
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [MessagingSettings].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MessagingSettings =
            MessagingSettings(
                conversationInactivityMinutes,
                defaultMessagingProfileId,
                deliveryStatusWebhookUrl,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MessagingSettings = apply {
        if (validated) {
            return@apply
        }

        conversationInactivityMinutes()
        defaultMessagingProfileId()
        deliveryStatusWebhookUrl()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (conversationInactivityMinutes.asKnown().isPresent) 1 else 0) +
            (if (defaultMessagingProfileId.asKnown().isPresent) 1 else 0) +
            (if (deliveryStatusWebhookUrl.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MessagingSettings &&
            conversationInactivityMinutes == other.conversationInactivityMinutes &&
            defaultMessagingProfileId == other.defaultMessagingProfileId &&
            deliveryStatusWebhookUrl == other.deliveryStatusWebhookUrl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            conversationInactivityMinutes,
            defaultMessagingProfileId,
            deliveryStatusWebhookUrl,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MessagingSettings{conversationInactivityMinutes=$conversationInactivityMinutes, defaultMessagingProfileId=$defaultMessagingProfileId, deliveryStatusWebhookUrl=$deliveryStatusWebhookUrl, additionalProperties=$additionalProperties}"
}
