// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emaildomains

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

class DomainsTrackingSettings
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val clickTracking: JsonField<Boolean>,
    private val openTracking: JsonField<Boolean>,
    private val unsubscribeTracking: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("click_tracking")
        @ExcludeMissing
        clickTracking: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("open_tracking")
        @ExcludeMissing
        openTracking: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("unsubscribe_tracking")
        @ExcludeMissing
        unsubscribeTracking: JsonField<Boolean> = JsonMissing.of(),
    ) : this(clickTracking, openTracking, unsubscribeTracking, mutableMapOf())

    /**
     * Rewrite HTML links through a tracking redirect to record click events.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clickTracking(): Optional<Boolean> = clickTracking.getOptional("click_tracking")

    /**
     * Inject a tracking pixel into HTML messages to record open events.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun openTracking(): Optional<Boolean> = openTracking.getOptional("open_tracking")

    /**
     * Add RFC 8058 List-Unsubscribe headers with a signed one-click unsubscribe URL. Enabled by
     * default; Gmail/Yahoo bulk-sender rules require one-click unsubscribe support.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun unsubscribeTracking(): Optional<Boolean> =
        unsubscribeTracking.getOptional("unsubscribe_tracking")

    /**
     * Returns the raw JSON value of [clickTracking].
     *
     * Unlike [clickTracking], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("click_tracking")
    @ExcludeMissing
    fun _clickTracking(): JsonField<Boolean> = clickTracking

    /**
     * Returns the raw JSON value of [openTracking].
     *
     * Unlike [openTracking], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("open_tracking")
    @ExcludeMissing
    fun _openTracking(): JsonField<Boolean> = openTracking

    /**
     * Returns the raw JSON value of [unsubscribeTracking].
     *
     * Unlike [unsubscribeTracking], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("unsubscribe_tracking")
    @ExcludeMissing
    fun _unsubscribeTracking(): JsonField<Boolean> = unsubscribeTracking

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

        /** Returns a mutable builder for constructing an instance of [DomainsTrackingSettings]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DomainsTrackingSettings]. */
    class Builder internal constructor() {

        private var clickTracking: JsonField<Boolean> = JsonMissing.of()
        private var openTracking: JsonField<Boolean> = JsonMissing.of()
        private var unsubscribeTracking: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(domainsTrackingSettings: DomainsTrackingSettings) = apply {
            clickTracking = domainsTrackingSettings.clickTracking
            openTracking = domainsTrackingSettings.openTracking
            unsubscribeTracking = domainsTrackingSettings.unsubscribeTracking
            additionalProperties = domainsTrackingSettings.additionalProperties.toMutableMap()
        }

        /** Rewrite HTML links through a tracking redirect to record click events. */
        fun clickTracking(clickTracking: Boolean) = clickTracking(JsonField.of(clickTracking))

        /**
         * Sets [Builder.clickTracking] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clickTracking] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun clickTracking(clickTracking: JsonField<Boolean>) = apply {
            this.clickTracking = clickTracking
        }

        /** Inject a tracking pixel into HTML messages to record open events. */
        fun openTracking(openTracking: Boolean) = openTracking(JsonField.of(openTracking))

        /**
         * Sets [Builder.openTracking] to an arbitrary JSON value.
         *
         * You should usually call [Builder.openTracking] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun openTracking(openTracking: JsonField<Boolean>) = apply {
            this.openTracking = openTracking
        }

        /**
         * Add RFC 8058 List-Unsubscribe headers with a signed one-click unsubscribe URL. Enabled by
         * default; Gmail/Yahoo bulk-sender rules require one-click unsubscribe support.
         */
        fun unsubscribeTracking(unsubscribeTracking: Boolean) =
            unsubscribeTracking(JsonField.of(unsubscribeTracking))

        /**
         * Sets [Builder.unsubscribeTracking] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unsubscribeTracking] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun unsubscribeTracking(unsubscribeTracking: JsonField<Boolean>) = apply {
            this.unsubscribeTracking = unsubscribeTracking
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
         * Returns an immutable instance of [DomainsTrackingSettings].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): DomainsTrackingSettings =
            DomainsTrackingSettings(
                clickTracking,
                openTracking,
                unsubscribeTracking,
                additionalProperties.toMutableMap(),
            )
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
    fun validate(): DomainsTrackingSettings = apply {
        if (validated) {
            return@apply
        }

        clickTracking()
        openTracking()
        unsubscribeTracking()
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
        (if (clickTracking.asKnown().isPresent) 1 else 0) +
            (if (openTracking.asKnown().isPresent) 1 else 0) +
            (if (unsubscribeTracking.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DomainsTrackingSettings &&
            clickTracking == other.clickTracking &&
            openTracking == other.openTracking &&
            unsubscribeTracking == other.unsubscribeTracking &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(clickTracking, openTracking, unsubscribeTracking, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DomainsTrackingSettings{clickTracking=$clickTracking, openTracking=$openTracking, unsubscribeTracking=$unsubscribeTracking, additionalProperties=$additionalProperties}"
}
