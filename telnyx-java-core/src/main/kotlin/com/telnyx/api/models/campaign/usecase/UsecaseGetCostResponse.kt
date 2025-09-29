// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.campaign.usecase

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.checkRequired
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects

class UsecaseGetCostResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val campaignUsecase: JsonField<String>,
    private val description: JsonField<String>,
    private val monthlyCost: JsonField<String>,
    private val upFrontCost: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("campaignUsecase")
        @ExcludeMissing
        campaignUsecase: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("monthlyCost")
        @ExcludeMissing
        monthlyCost: JsonField<String> = JsonMissing.of(),
        @JsonProperty("upFrontCost")
        @ExcludeMissing
        upFrontCost: JsonField<String> = JsonMissing.of(),
    ) : this(campaignUsecase, description, monthlyCost, upFrontCost, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun campaignUsecase(): String = campaignUsecase.getRequired("campaignUsecase")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun description(): String = description.getRequired("description")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun monthlyCost(): String = monthlyCost.getRequired("monthlyCost")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun upFrontCost(): String = upFrontCost.getRequired("upFrontCost")

    /**
     * Returns the raw JSON value of [campaignUsecase].
     *
     * Unlike [campaignUsecase], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("campaignUsecase")
    @ExcludeMissing
    fun _campaignUsecase(): JsonField<String> = campaignUsecase

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [monthlyCost].
     *
     * Unlike [monthlyCost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("monthlyCost") @ExcludeMissing fun _monthlyCost(): JsonField<String> = monthlyCost

    /**
     * Returns the raw JSON value of [upFrontCost].
     *
     * Unlike [upFrontCost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("upFrontCost") @ExcludeMissing fun _upFrontCost(): JsonField<String> = upFrontCost

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
         * Returns a mutable builder for constructing an instance of [UsecaseGetCostResponse].
         *
         * The following fields are required:
         * ```java
         * .campaignUsecase()
         * .description()
         * .monthlyCost()
         * .upFrontCost()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UsecaseGetCostResponse]. */
    class Builder internal constructor() {

        private var campaignUsecase: JsonField<String>? = null
        private var description: JsonField<String>? = null
        private var monthlyCost: JsonField<String>? = null
        private var upFrontCost: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(usecaseGetCostResponse: UsecaseGetCostResponse) = apply {
            campaignUsecase = usecaseGetCostResponse.campaignUsecase
            description = usecaseGetCostResponse.description
            monthlyCost = usecaseGetCostResponse.monthlyCost
            upFrontCost = usecaseGetCostResponse.upFrontCost
            additionalProperties = usecaseGetCostResponse.additionalProperties.toMutableMap()
        }

        fun campaignUsecase(campaignUsecase: String) =
            campaignUsecase(JsonField.of(campaignUsecase))

        /**
         * Sets [Builder.campaignUsecase] to an arbitrary JSON value.
         *
         * You should usually call [Builder.campaignUsecase] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun campaignUsecase(campaignUsecase: JsonField<String>) = apply {
            this.campaignUsecase = campaignUsecase
        }

        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun monthlyCost(monthlyCost: String) = monthlyCost(JsonField.of(monthlyCost))

        /**
         * Sets [Builder.monthlyCost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.monthlyCost] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun monthlyCost(monthlyCost: JsonField<String>) = apply { this.monthlyCost = monthlyCost }

        fun upFrontCost(upFrontCost: String) = upFrontCost(JsonField.of(upFrontCost))

        /**
         * Sets [Builder.upFrontCost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.upFrontCost] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun upFrontCost(upFrontCost: JsonField<String>) = apply { this.upFrontCost = upFrontCost }

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
         * Returns an immutable instance of [UsecaseGetCostResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .campaignUsecase()
         * .description()
         * .monthlyCost()
         * .upFrontCost()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UsecaseGetCostResponse =
            UsecaseGetCostResponse(
                checkRequired("campaignUsecase", campaignUsecase),
                checkRequired("description", description),
                checkRequired("monthlyCost", monthlyCost),
                checkRequired("upFrontCost", upFrontCost),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): UsecaseGetCostResponse = apply {
        if (validated) {
            return@apply
        }

        campaignUsecase()
        description()
        monthlyCost()
        upFrontCost()
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
        (if (campaignUsecase.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (monthlyCost.asKnown().isPresent) 1 else 0) +
            (if (upFrontCost.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UsecaseGetCostResponse &&
            campaignUsecase == other.campaignUsecase &&
            description == other.description &&
            monthlyCost == other.monthlyCost &&
            upFrontCost == other.upFrontCost &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(campaignUsecase, description, monthlyCost, upFrontCost, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UsecaseGetCostResponse{campaignUsecase=$campaignUsecase, description=$description, monthlyCost=$monthlyCost, upFrontCost=$upFrontCost, additionalProperties=$additionalProperties}"
}
