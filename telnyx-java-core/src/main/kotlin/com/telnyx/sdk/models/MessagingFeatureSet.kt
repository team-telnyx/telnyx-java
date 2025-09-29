// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects

/**
 * The set of features available for a specific messaging use case (SMS or MMS). Features can vary
 * depending on the characteristics the phone number, as well as its current product configuration.
 */
class MessagingFeatureSet
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val domesticTwoWay: JsonField<Boolean>,
    private val internationalInbound: JsonField<Boolean>,
    private val internationalOutbound: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("domestic_two_way")
        @ExcludeMissing
        domesticTwoWay: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("international_inbound")
        @ExcludeMissing
        internationalInbound: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("international_outbound")
        @ExcludeMissing
        internationalOutbound: JsonField<Boolean> = JsonMissing.of(),
    ) : this(domesticTwoWay, internationalInbound, internationalOutbound, mutableMapOf())

    /**
     * Send messages to and receive messages from numbers in the same country.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun domesticTwoWay(): Boolean = domesticTwoWay.getRequired("domestic_two_way")

    /**
     * Receive messages from numbers in other countries.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun internationalInbound(): Boolean = internationalInbound.getRequired("international_inbound")

    /**
     * Send messages to numbers in other countries.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun internationalOutbound(): Boolean =
        internationalOutbound.getRequired("international_outbound")

    /**
     * Returns the raw JSON value of [domesticTwoWay].
     *
     * Unlike [domesticTwoWay], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("domestic_two_way")
    @ExcludeMissing
    fun _domesticTwoWay(): JsonField<Boolean> = domesticTwoWay

    /**
     * Returns the raw JSON value of [internationalInbound].
     *
     * Unlike [internationalInbound], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("international_inbound")
    @ExcludeMissing
    fun _internationalInbound(): JsonField<Boolean> = internationalInbound

    /**
     * Returns the raw JSON value of [internationalOutbound].
     *
     * Unlike [internationalOutbound], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("international_outbound")
    @ExcludeMissing
    fun _internationalOutbound(): JsonField<Boolean> = internationalOutbound

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

        /**
         * Returns a mutable builder for constructing an instance of [MessagingFeatureSet].
         *
         * The following fields are required:
         * ```java
         * .domesticTwoWay()
         * .internationalInbound()
         * .internationalOutbound()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MessagingFeatureSet]. */
    class Builder internal constructor() {

        private var domesticTwoWay: JsonField<Boolean>? = null
        private var internationalInbound: JsonField<Boolean>? = null
        private var internationalOutbound: JsonField<Boolean>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(messagingFeatureSet: MessagingFeatureSet) = apply {
            domesticTwoWay = messagingFeatureSet.domesticTwoWay
            internationalInbound = messagingFeatureSet.internationalInbound
            internationalOutbound = messagingFeatureSet.internationalOutbound
            additionalProperties = messagingFeatureSet.additionalProperties.toMutableMap()
        }

        /** Send messages to and receive messages from numbers in the same country. */
        fun domesticTwoWay(domesticTwoWay: Boolean) = domesticTwoWay(JsonField.of(domesticTwoWay))

        /**
         * Sets [Builder.domesticTwoWay] to an arbitrary JSON value.
         *
         * You should usually call [Builder.domesticTwoWay] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun domesticTwoWay(domesticTwoWay: JsonField<Boolean>) = apply {
            this.domesticTwoWay = domesticTwoWay
        }

        /** Receive messages from numbers in other countries. */
        fun internationalInbound(internationalInbound: Boolean) =
            internationalInbound(JsonField.of(internationalInbound))

        /**
         * Sets [Builder.internationalInbound] to an arbitrary JSON value.
         *
         * You should usually call [Builder.internationalInbound] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun internationalInbound(internationalInbound: JsonField<Boolean>) = apply {
            this.internationalInbound = internationalInbound
        }

        /** Send messages to numbers in other countries. */
        fun internationalOutbound(internationalOutbound: Boolean) =
            internationalOutbound(JsonField.of(internationalOutbound))

        /**
         * Sets [Builder.internationalOutbound] to an arbitrary JSON value.
         *
         * You should usually call [Builder.internationalOutbound] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun internationalOutbound(internationalOutbound: JsonField<Boolean>) = apply {
            this.internationalOutbound = internationalOutbound
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
         * Returns an immutable instance of [MessagingFeatureSet].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .domesticTwoWay()
         * .internationalInbound()
         * .internationalOutbound()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MessagingFeatureSet =
            MessagingFeatureSet(
                checkRequired("domesticTwoWay", domesticTwoWay),
                checkRequired("internationalInbound", internationalInbound),
                checkRequired("internationalOutbound", internationalOutbound),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MessagingFeatureSet = apply {
        if (validated) {
            return@apply
        }

        domesticTwoWay()
        internationalInbound()
        internationalOutbound()
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
        (if (domesticTwoWay.asKnown().isPresent) 1 else 0) +
            (if (internationalInbound.asKnown().isPresent) 1 else 0) +
            (if (internationalOutbound.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MessagingFeatureSet &&
            domesticTwoWay == other.domesticTwoWay &&
            internationalInbound == other.internationalInbound &&
            internationalOutbound == other.internationalOutbound &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            domesticTwoWay,
            internationalInbound,
            internationalOutbound,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MessagingFeatureSet{domesticTwoWay=$domesticTwoWay, internationalInbound=$internationalInbound, internationalOutbound=$internationalOutbound, additionalProperties=$additionalProperties}"
}
