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

class TelephonySettings
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val defaultTexmlAppId: JsonField<String>,
    private val supportsUnauthenticatedWebCalls: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("default_texml_app_id")
        @ExcludeMissing
        defaultTexmlAppId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("supports_unauthenticated_web_calls")
        @ExcludeMissing
        supportsUnauthenticatedWebCalls: JsonField<Boolean> = JsonMissing.of(),
    ) : this(defaultTexmlAppId, supportsUnauthenticatedWebCalls, mutableMapOf())

    /**
     * Default Texml App used for voice calls with your assistant. This will be created
     * automatically on assistant creation.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun defaultTexmlAppId(): Optional<String> =
        defaultTexmlAppId.getOptional("default_texml_app_id")

    /**
     * When enabled, allows users to interact with your AI assistant directly from your website
     * without requiring authentication. This is required for FE widgets that work with assistants
     * that have telephony enabled.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun supportsUnauthenticatedWebCalls(): Optional<Boolean> =
        supportsUnauthenticatedWebCalls.getOptional("supports_unauthenticated_web_calls")

    /**
     * Returns the raw JSON value of [defaultTexmlAppId].
     *
     * Unlike [defaultTexmlAppId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("default_texml_app_id")
    @ExcludeMissing
    fun _defaultTexmlAppId(): JsonField<String> = defaultTexmlAppId

    /**
     * Returns the raw JSON value of [supportsUnauthenticatedWebCalls].
     *
     * Unlike [supportsUnauthenticatedWebCalls], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("supports_unauthenticated_web_calls")
    @ExcludeMissing
    fun _supportsUnauthenticatedWebCalls(): JsonField<Boolean> = supportsUnauthenticatedWebCalls

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

        /** Returns a mutable builder for constructing an instance of [TelephonySettings]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TelephonySettings]. */
    class Builder internal constructor() {

        private var defaultTexmlAppId: JsonField<String> = JsonMissing.of()
        private var supportsUnauthenticatedWebCalls: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(telephonySettings: TelephonySettings) = apply {
            defaultTexmlAppId = telephonySettings.defaultTexmlAppId
            supportsUnauthenticatedWebCalls = telephonySettings.supportsUnauthenticatedWebCalls
            additionalProperties = telephonySettings.additionalProperties.toMutableMap()
        }

        /**
         * Default Texml App used for voice calls with your assistant. This will be created
         * automatically on assistant creation.
         */
        fun defaultTexmlAppId(defaultTexmlAppId: String) =
            defaultTexmlAppId(JsonField.of(defaultTexmlAppId))

        /**
         * Sets [Builder.defaultTexmlAppId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultTexmlAppId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun defaultTexmlAppId(defaultTexmlAppId: JsonField<String>) = apply {
            this.defaultTexmlAppId = defaultTexmlAppId
        }

        /**
         * When enabled, allows users to interact with your AI assistant directly from your website
         * without requiring authentication. This is required for FE widgets that work with
         * assistants that have telephony enabled.
         */
        fun supportsUnauthenticatedWebCalls(supportsUnauthenticatedWebCalls: Boolean) =
            supportsUnauthenticatedWebCalls(JsonField.of(supportsUnauthenticatedWebCalls))

        /**
         * Sets [Builder.supportsUnauthenticatedWebCalls] to an arbitrary JSON value.
         *
         * You should usually call [Builder.supportsUnauthenticatedWebCalls] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun supportsUnauthenticatedWebCalls(supportsUnauthenticatedWebCalls: JsonField<Boolean>) =
            apply {
                this.supportsUnauthenticatedWebCalls = supportsUnauthenticatedWebCalls
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
         * Returns an immutable instance of [TelephonySettings].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TelephonySettings =
            TelephonySettings(
                defaultTexmlAppId,
                supportsUnauthenticatedWebCalls,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TelephonySettings = apply {
        if (validated) {
            return@apply
        }

        defaultTexmlAppId()
        supportsUnauthenticatedWebCalls()
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
        (if (defaultTexmlAppId.asKnown().isPresent) 1 else 0) +
            (if (supportsUnauthenticatedWebCalls.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TelephonySettings &&
            defaultTexmlAppId == other.defaultTexmlAppId &&
            supportsUnauthenticatedWebCalls == other.supportsUnauthenticatedWebCalls &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(defaultTexmlAppId, supportsUnauthenticatedWebCalls, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TelephonySettings{defaultTexmlAppId=$defaultTexmlAppId, supportsUnauthenticatedWebCalls=$supportsUnauthenticatedWebCalls, additionalProperties=$additionalProperties}"
}
