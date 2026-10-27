// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingprofiles

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

/** MM7 settings for inbound messages */
class Mm7Metadata
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val mm7FailoverWebhookUrl: JsonField<String>,
    private val mm7WebhookUrl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("mm7_failover_webhook_url")
        @ExcludeMissing
        mm7FailoverWebhookUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mm7_webhook_url")
        @ExcludeMissing
        mm7WebhookUrl: JsonField<String> = JsonMissing.of(),
    ) : this(mm7FailoverWebhookUrl, mm7WebhookUrl, mutableMapOf())

    /**
     * Failover webhook URL to receive inbound MM7 traffic
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mm7FailoverWebhookUrl(): Optional<String> =
        mm7FailoverWebhookUrl.getOptional("mm7_failover_webhook_url")

    /**
     * Webhook URL to receive inbound MM7 traffic
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mm7WebhookUrl(): Optional<String> = mm7WebhookUrl.getOptional("mm7_webhook_url")

    /**
     * Returns the raw JSON value of [mm7FailoverWebhookUrl].
     *
     * Unlike [mm7FailoverWebhookUrl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("mm7_failover_webhook_url")
    @ExcludeMissing
    fun _mm7FailoverWebhookUrl(): JsonField<String> = mm7FailoverWebhookUrl

    /**
     * Returns the raw JSON value of [mm7WebhookUrl].
     *
     * Unlike [mm7WebhookUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mm7_webhook_url")
    @ExcludeMissing
    fun _mm7WebhookUrl(): JsonField<String> = mm7WebhookUrl

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

        /** Returns a mutable builder for constructing an instance of [Mm7Metadata]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Mm7Metadata]. */
    class Builder internal constructor() {

        private var mm7FailoverWebhookUrl: JsonField<String> = JsonMissing.of()
        private var mm7WebhookUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(mm7Metadata: Mm7Metadata) = apply {
            mm7FailoverWebhookUrl = mm7Metadata.mm7FailoverWebhookUrl
            mm7WebhookUrl = mm7Metadata.mm7WebhookUrl
            additionalProperties = mm7Metadata.additionalProperties.toMutableMap()
        }

        /** Failover webhook URL to receive inbound MM7 traffic */
        fun mm7FailoverWebhookUrl(mm7FailoverWebhookUrl: String) =
            mm7FailoverWebhookUrl(JsonField.of(mm7FailoverWebhookUrl))

        /**
         * Sets [Builder.mm7FailoverWebhookUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mm7FailoverWebhookUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun mm7FailoverWebhookUrl(mm7FailoverWebhookUrl: JsonField<String>) = apply {
            this.mm7FailoverWebhookUrl = mm7FailoverWebhookUrl
        }

        /** Webhook URL to receive inbound MM7 traffic */
        fun mm7WebhookUrl(mm7WebhookUrl: String) = mm7WebhookUrl(JsonField.of(mm7WebhookUrl))

        /**
         * Sets [Builder.mm7WebhookUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mm7WebhookUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun mm7WebhookUrl(mm7WebhookUrl: JsonField<String>) = apply {
            this.mm7WebhookUrl = mm7WebhookUrl
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
         * Returns an immutable instance of [Mm7Metadata].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Mm7Metadata =
            Mm7Metadata(mm7FailoverWebhookUrl, mm7WebhookUrl, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): Mm7Metadata = apply {
        if (validated) {
            return@apply
        }

        mm7FailoverWebhookUrl()
        mm7WebhookUrl()
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
        (if (mm7FailoverWebhookUrl.asKnown().isPresent) 1 else 0) +
            (if (mm7WebhookUrl.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Mm7Metadata &&
            mm7FailoverWebhookUrl == other.mm7FailoverWebhookUrl &&
            mm7WebhookUrl == other.mm7WebhookUrl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(mm7FailoverWebhookUrl, mm7WebhookUrl, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Mm7Metadata{mm7FailoverWebhookUrl=$mm7FailoverWebhookUrl, mm7WebhookUrl=$mm7WebhookUrl, additionalProperties=$additionalProperties}"
}
