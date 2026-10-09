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

/**
 * Streams conversation and telephony events to a WebSocket server you host, and accepts messages
 * injected back into the conversation. Telnyx opens the connection as a client, once per
 * conversation. Delivery is best effort throughout: while the connection is down events are dropped
 * rather than queued, and no socket failure is ever allowed to affect the call. Beta feature.
 */
class WebsocketSettings
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val authRef: JsonField<String>,
    private val enabled: JsonField<Boolean>,
    private val url: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("auth_ref") @ExcludeMissing authRef: JsonField<String> = JsonMissing.of(),
        @JsonProperty("enabled") @ExcludeMissing enabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
    ) : this(authRef, enabled, url, mutableMapOf())

    /**
     * Integration secret identifier whose value Telnyx sends as an `Authorization: Bearer <value>`
     * header on the upgrade request. Resolved on every connection attempt, so a rotated secret is
     * picked up by the next reconnect.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun authRef(): Optional<String> = authRef.getOptional("auth_ref")

    /**
     * Whether Telnyx opens a WebSocket to `url` for each of this assistant's conversations.
     * Defaults to `false`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enabled(): Optional<Boolean> = enabled.getOptional("enabled")

    /**
     * The `ws://` or `wss://` endpoint Telnyx connects to. Required when `enabled` is `true`. Must
     * be externally reachable — localhost, private IP ranges and `.local` domains are rejected.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun url(): Optional<String> = url.getOptional("url")

    /**
     * Returns the raw JSON value of [authRef].
     *
     * Unlike [authRef], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("auth_ref") @ExcludeMissing fun _authRef(): JsonField<String> = authRef

    /**
     * Returns the raw JSON value of [enabled].
     *
     * Unlike [enabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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

        /** Returns a mutable builder for constructing an instance of [WebsocketSettings]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WebsocketSettings]. */
    class Builder internal constructor() {

        private var authRef: JsonField<String> = JsonMissing.of()
        private var enabled: JsonField<Boolean> = JsonMissing.of()
        private var url: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(websocketSettings: WebsocketSettings) = apply {
            authRef = websocketSettings.authRef
            enabled = websocketSettings.enabled
            url = websocketSettings.url
            additionalProperties = websocketSettings.additionalProperties.toMutableMap()
        }

        /**
         * Integration secret identifier whose value Telnyx sends as an `Authorization: Bearer
         * <value>` header on the upgrade request. Resolved on every connection attempt, so a
         * rotated secret is picked up by the next reconnect.
         */
        fun authRef(authRef: String) = authRef(JsonField.of(authRef))

        /**
         * Sets [Builder.authRef] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authRef] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun authRef(authRef: JsonField<String>) = apply { this.authRef = authRef }

        /**
         * Whether Telnyx opens a WebSocket to `url` for each of this assistant's conversations.
         * Defaults to `false`.
         */
        fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

        /**
         * Sets [Builder.enabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enabled] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

        /**
         * The `ws://` or `wss://` endpoint Telnyx connects to. Required when `enabled` is `true`.
         * Must be externally reachable — localhost, private IP ranges and `.local` domains are
         * rejected.
         */
        fun url(url: String) = url(JsonField.of(url))

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { this.url = url }

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
         * Returns an immutable instance of [WebsocketSettings].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): WebsocketSettings =
            WebsocketSettings(authRef, enabled, url, additionalProperties.toMutableMap())
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
    fun validate(): WebsocketSettings = apply {
        if (validated) {
            return@apply
        }

        authRef()
        enabled()
        url()
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
        (if (authRef.asKnown().isPresent) 1 else 0) +
            (if (enabled.asKnown().isPresent) 1 else 0) +
            (if (url.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WebsocketSettings &&
            authRef == other.authRef &&
            enabled == other.enabled &&
            url == other.url &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(authRef, enabled, url, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WebsocketSettings{authRef=$authRef, enabled=$enabled, url=$url, additionalProperties=$additionalProperties}"
}
