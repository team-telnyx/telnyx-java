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
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

/**
 * Number Pool allows you to send messages from a pool of numbers of different types, assigning
 * weights to each type. The pool consists of all the long code and toll free numbers assigned to
 * the messaging profile.
 *
 * To disable this feature, set the object field to `null`.
 */
class NumberPoolSettings
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val longCodeWeight: JsonField<Double>,
    private val skipUnhealthy: JsonField<Boolean>,
    private val tollFreeWeight: JsonField<Double>,
    private val geomatch: JsonField<Boolean>,
    private val stickySender: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("long_code_weight")
        @ExcludeMissing
        longCodeWeight: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("skip_unhealthy")
        @ExcludeMissing
        skipUnhealthy: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("toll_free_weight")
        @ExcludeMissing
        tollFreeWeight: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("geomatch") @ExcludeMissing geomatch: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("sticky_sender")
        @ExcludeMissing
        stickySender: JsonField<Boolean> = JsonMissing.of(),
    ) : this(longCodeWeight, skipUnhealthy, tollFreeWeight, geomatch, stickySender, mutableMapOf())

    /**
     * Defines the probability weight for a Long Code number to be selected when sending a message.
     * The higher the weight the higher the probability. The sum of the weights for all number types
     * does not necessarily need to add to 100. Weight must be a non-negative number, and when equal
     * to zero it will remove the number type from the pool.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun longCodeWeight(): Double = longCodeWeight.getRequired("long_code_weight")

    /**
     * If set to true all unhealthy numbers will be automatically excluded from the pool. Health
     * metrics per number are calculated on a regular basis, taking into account the deliverability
     * rate and the amount of messages marked as spam by upstream carriers. Numbers with a
     * deliverability rate below 25% or spam ratio over 75% will be considered unhealthy.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun skipUnhealthy(): Boolean = skipUnhealthy.getRequired("skip_unhealthy")

    /**
     * Defines the probability weight for a Toll Free number to be selected when sending a message.
     * The higher the weight the higher the probability. The sum of the weights for all number types
     * does not necessarily need to add to 100. Weight must be a non-negative number, and when equal
     * to zero it will remove the number type from the pool.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tollFreeWeight(): Double = tollFreeWeight.getRequired("toll_free_weight")

    /**
     * If set to true, Number Pool will try to choose a sending number with the same area code as
     * the destination number. If there are no such numbers available, a nunber with a different
     * area code will be chosen. Currently only NANP numbers are supported.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun geomatch(): Optional<Boolean> = geomatch.getOptional("geomatch")

    /**
     * If set to true, Number Pool will try to choose the same sending number for all messages to a
     * particular recipient. If the sending number becomes unhealthy and `skip_unhealthy` is set to
     * true, a new number will be chosen.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stickySender(): Optional<Boolean> = stickySender.getOptional("sticky_sender")

    /**
     * Returns the raw JSON value of [longCodeWeight].
     *
     * Unlike [longCodeWeight], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("long_code_weight")
    @ExcludeMissing
    fun _longCodeWeight(): JsonField<Double> = longCodeWeight

    /**
     * Returns the raw JSON value of [skipUnhealthy].
     *
     * Unlike [skipUnhealthy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("skip_unhealthy")
    @ExcludeMissing
    fun _skipUnhealthy(): JsonField<Boolean> = skipUnhealthy

    /**
     * Returns the raw JSON value of [tollFreeWeight].
     *
     * Unlike [tollFreeWeight], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("toll_free_weight")
    @ExcludeMissing
    fun _tollFreeWeight(): JsonField<Double> = tollFreeWeight

    /**
     * Returns the raw JSON value of [geomatch].
     *
     * Unlike [geomatch], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("geomatch") @ExcludeMissing fun _geomatch(): JsonField<Boolean> = geomatch

    /**
     * Returns the raw JSON value of [stickySender].
     *
     * Unlike [stickySender], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sticky_sender")
    @ExcludeMissing
    fun _stickySender(): JsonField<Boolean> = stickySender

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
         * Returns a mutable builder for constructing an instance of [NumberPoolSettings].
         *
         * The following fields are required:
         * ```java
         * .longCodeWeight()
         * .skipUnhealthy()
         * .tollFreeWeight()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NumberPoolSettings]. */
    class Builder internal constructor() {

        private var longCodeWeight: JsonField<Double>? = null
        private var skipUnhealthy: JsonField<Boolean>? = null
        private var tollFreeWeight: JsonField<Double>? = null
        private var geomatch: JsonField<Boolean> = JsonMissing.of()
        private var stickySender: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(numberPoolSettings: NumberPoolSettings) = apply {
            longCodeWeight = numberPoolSettings.longCodeWeight
            skipUnhealthy = numberPoolSettings.skipUnhealthy
            tollFreeWeight = numberPoolSettings.tollFreeWeight
            geomatch = numberPoolSettings.geomatch
            stickySender = numberPoolSettings.stickySender
            additionalProperties = numberPoolSettings.additionalProperties.toMutableMap()
        }

        /**
         * Defines the probability weight for a Long Code number to be selected when sending a
         * message. The higher the weight the higher the probability. The sum of the weights for all
         * number types does not necessarily need to add to 100. Weight must be a non-negative
         * number, and when equal to zero it will remove the number type from the pool.
         */
        fun longCodeWeight(longCodeWeight: Double) = longCodeWeight(JsonField.of(longCodeWeight))

        /**
         * Sets [Builder.longCodeWeight] to an arbitrary JSON value.
         *
         * You should usually call [Builder.longCodeWeight] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun longCodeWeight(longCodeWeight: JsonField<Double>) = apply {
            this.longCodeWeight = longCodeWeight
        }

        /**
         * If set to true all unhealthy numbers will be automatically excluded from the pool. Health
         * metrics per number are calculated on a regular basis, taking into account the
         * deliverability rate and the amount of messages marked as spam by upstream carriers.
         * Numbers with a deliverability rate below 25% or spam ratio over 75% will be considered
         * unhealthy.
         */
        fun skipUnhealthy(skipUnhealthy: Boolean) = skipUnhealthy(JsonField.of(skipUnhealthy))

        /**
         * Sets [Builder.skipUnhealthy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.skipUnhealthy] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun skipUnhealthy(skipUnhealthy: JsonField<Boolean>) = apply {
            this.skipUnhealthy = skipUnhealthy
        }

        /**
         * Defines the probability weight for a Toll Free number to be selected when sending a
         * message. The higher the weight the higher the probability. The sum of the weights for all
         * number types does not necessarily need to add to 100. Weight must be a non-negative
         * number, and when equal to zero it will remove the number type from the pool.
         */
        fun tollFreeWeight(tollFreeWeight: Double) = tollFreeWeight(JsonField.of(tollFreeWeight))

        /**
         * Sets [Builder.tollFreeWeight] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tollFreeWeight] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tollFreeWeight(tollFreeWeight: JsonField<Double>) = apply {
            this.tollFreeWeight = tollFreeWeight
        }

        /**
         * If set to true, Number Pool will try to choose a sending number with the same area code
         * as the destination number. If there are no such numbers available, a nunber with a
         * different area code will be chosen. Currently only NANP numbers are supported.
         */
        fun geomatch(geomatch: Boolean) = geomatch(JsonField.of(geomatch))

        /**
         * Sets [Builder.geomatch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.geomatch] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun geomatch(geomatch: JsonField<Boolean>) = apply { this.geomatch = geomatch }

        /**
         * If set to true, Number Pool will try to choose the same sending number for all messages
         * to a particular recipient. If the sending number becomes unhealthy and `skip_unhealthy`
         * is set to true, a new number will be chosen.
         */
        fun stickySender(stickySender: Boolean) = stickySender(JsonField.of(stickySender))

        /**
         * Sets [Builder.stickySender] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stickySender] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun stickySender(stickySender: JsonField<Boolean>) = apply {
            this.stickySender = stickySender
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
         * Returns an immutable instance of [NumberPoolSettings].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .longCodeWeight()
         * .skipUnhealthy()
         * .tollFreeWeight()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): NumberPoolSettings =
            NumberPoolSettings(
                checkRequired("longCodeWeight", longCodeWeight),
                checkRequired("skipUnhealthy", skipUnhealthy),
                checkRequired("tollFreeWeight", tollFreeWeight),
                geomatch,
                stickySender,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): NumberPoolSettings = apply {
        if (validated) {
            return@apply
        }

        longCodeWeight()
        skipUnhealthy()
        tollFreeWeight()
        geomatch()
        stickySender()
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
        (if (longCodeWeight.asKnown().isPresent) 1 else 0) +
            (if (skipUnhealthy.asKnown().isPresent) 1 else 0) +
            (if (tollFreeWeight.asKnown().isPresent) 1 else 0) +
            (if (geomatch.asKnown().isPresent) 1 else 0) +
            (if (stickySender.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NumberPoolSettings &&
            longCodeWeight == other.longCodeWeight &&
            skipUnhealthy == other.skipUnhealthy &&
            tollFreeWeight == other.tollFreeWeight &&
            geomatch == other.geomatch &&
            stickySender == other.stickySender &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            longCodeWeight,
            skipUnhealthy,
            tollFreeWeight,
            geomatch,
            stickySender,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NumberPoolSettings{longCodeWeight=$longCodeWeight, skipUnhealthy=$skipUnhealthy, tollFreeWeight=$tollFreeWeight, geomatch=$geomatch, stickySender=$stickySender, additionalProperties=$additionalProperties}"
}
