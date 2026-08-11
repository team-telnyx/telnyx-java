// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rcs.agents

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

class CapabilitiesResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val brandEntity: JsonField<Boolean>,
    private val brandVerification: JsonField<Boolean>,
    private val campaigns: JsonField<Boolean>,
    private val distinctLaunchPhase: JsonField<Boolean>,
    private val inviteTestDevices: JsonField<Boolean>,
    private val perCarrierApproval: JsonField<Boolean>,
    private val submissionSections: JsonField<Boolean>,
    private val templates: JsonField<Boolean>,
    private val vendorWebhooks: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("brand_entity")
        @ExcludeMissing
        brandEntity: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("brand_verification")
        @ExcludeMissing
        brandVerification: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("campaigns") @ExcludeMissing campaigns: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("distinct_launch_phase")
        @ExcludeMissing
        distinctLaunchPhase: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("invite_test_devices")
        @ExcludeMissing
        inviteTestDevices: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("per_carrier_approval")
        @ExcludeMissing
        perCarrierApproval: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("submission_sections")
        @ExcludeMissing
        submissionSections: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("templates") @ExcludeMissing templates: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("vendor_webhooks")
        @ExcludeMissing
        vendorWebhooks: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        brandEntity,
        brandVerification,
        campaigns,
        distinctLaunchPhase,
        inviteTestDevices,
        perCarrierApproval,
        submissionSections,
        templates,
        vendorWebhooks,
        mutableMapOf(),
    )

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun brandEntity(): Boolean = brandEntity.getRequired("brand_entity")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun brandVerification(): Boolean = brandVerification.getRequired("brand_verification")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun campaigns(): Boolean = campaigns.getRequired("campaigns")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun distinctLaunchPhase(): Boolean = distinctLaunchPhase.getRequired("distinct_launch_phase")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun inviteTestDevices(): Boolean = inviteTestDevices.getRequired("invite_test_devices")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun perCarrierApproval(): Boolean = perCarrierApproval.getRequired("per_carrier_approval")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun submissionSections(): Boolean = submissionSections.getRequired("submission_sections")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun templates(): Boolean = templates.getRequired("templates")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun vendorWebhooks(): Boolean = vendorWebhooks.getRequired("vendor_webhooks")

    /**
     * Returns the raw JSON value of [brandEntity].
     *
     * Unlike [brandEntity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("brand_entity")
    @ExcludeMissing
    fun _brandEntity(): JsonField<Boolean> = brandEntity

    /**
     * Returns the raw JSON value of [brandVerification].
     *
     * Unlike [brandVerification], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("brand_verification")
    @ExcludeMissing
    fun _brandVerification(): JsonField<Boolean> = brandVerification

    /**
     * Returns the raw JSON value of [campaigns].
     *
     * Unlike [campaigns], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("campaigns") @ExcludeMissing fun _campaigns(): JsonField<Boolean> = campaigns

    /**
     * Returns the raw JSON value of [distinctLaunchPhase].
     *
     * Unlike [distinctLaunchPhase], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("distinct_launch_phase")
    @ExcludeMissing
    fun _distinctLaunchPhase(): JsonField<Boolean> = distinctLaunchPhase

    /**
     * Returns the raw JSON value of [inviteTestDevices].
     *
     * Unlike [inviteTestDevices], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("invite_test_devices")
    @ExcludeMissing
    fun _inviteTestDevices(): JsonField<Boolean> = inviteTestDevices

    /**
     * Returns the raw JSON value of [perCarrierApproval].
     *
     * Unlike [perCarrierApproval], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("per_carrier_approval")
    @ExcludeMissing
    fun _perCarrierApproval(): JsonField<Boolean> = perCarrierApproval

    /**
     * Returns the raw JSON value of [submissionSections].
     *
     * Unlike [submissionSections], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("submission_sections")
    @ExcludeMissing
    fun _submissionSections(): JsonField<Boolean> = submissionSections

    /**
     * Returns the raw JSON value of [templates].
     *
     * Unlike [templates], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("templates") @ExcludeMissing fun _templates(): JsonField<Boolean> = templates

    /**
     * Returns the raw JSON value of [vendorWebhooks].
     *
     * Unlike [vendorWebhooks], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vendor_webhooks")
    @ExcludeMissing
    fun _vendorWebhooks(): JsonField<Boolean> = vendorWebhooks

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
         * Returns a mutable builder for constructing an instance of [CapabilitiesResponse].
         *
         * The following fields are required:
         * ```java
         * .brandEntity()
         * .brandVerification()
         * .campaigns()
         * .distinctLaunchPhase()
         * .inviteTestDevices()
         * .perCarrierApproval()
         * .submissionSections()
         * .templates()
         * .vendorWebhooks()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CapabilitiesResponse]. */
    class Builder internal constructor() {

        private var brandEntity: JsonField<Boolean>? = null
        private var brandVerification: JsonField<Boolean>? = null
        private var campaigns: JsonField<Boolean>? = null
        private var distinctLaunchPhase: JsonField<Boolean>? = null
        private var inviteTestDevices: JsonField<Boolean>? = null
        private var perCarrierApproval: JsonField<Boolean>? = null
        private var submissionSections: JsonField<Boolean>? = null
        private var templates: JsonField<Boolean>? = null
        private var vendorWebhooks: JsonField<Boolean>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(capabilitiesResponse: CapabilitiesResponse) = apply {
            brandEntity = capabilitiesResponse.brandEntity
            brandVerification = capabilitiesResponse.brandVerification
            campaigns = capabilitiesResponse.campaigns
            distinctLaunchPhase = capabilitiesResponse.distinctLaunchPhase
            inviteTestDevices = capabilitiesResponse.inviteTestDevices
            perCarrierApproval = capabilitiesResponse.perCarrierApproval
            submissionSections = capabilitiesResponse.submissionSections
            templates = capabilitiesResponse.templates
            vendorWebhooks = capabilitiesResponse.vendorWebhooks
            additionalProperties = capabilitiesResponse.additionalProperties.toMutableMap()
        }

        fun brandEntity(brandEntity: Boolean) = brandEntity(JsonField.of(brandEntity))

        /**
         * Sets [Builder.brandEntity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.brandEntity] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun brandEntity(brandEntity: JsonField<Boolean>) = apply { this.brandEntity = brandEntity }

        fun brandVerification(brandVerification: Boolean) =
            brandVerification(JsonField.of(brandVerification))

        /**
         * Sets [Builder.brandVerification] to an arbitrary JSON value.
         *
         * You should usually call [Builder.brandVerification] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun brandVerification(brandVerification: JsonField<Boolean>) = apply {
            this.brandVerification = brandVerification
        }

        fun campaigns(campaigns: Boolean) = campaigns(JsonField.of(campaigns))

        /**
         * Sets [Builder.campaigns] to an arbitrary JSON value.
         *
         * You should usually call [Builder.campaigns] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun campaigns(campaigns: JsonField<Boolean>) = apply { this.campaigns = campaigns }

        fun distinctLaunchPhase(distinctLaunchPhase: Boolean) =
            distinctLaunchPhase(JsonField.of(distinctLaunchPhase))

        /**
         * Sets [Builder.distinctLaunchPhase] to an arbitrary JSON value.
         *
         * You should usually call [Builder.distinctLaunchPhase] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun distinctLaunchPhase(distinctLaunchPhase: JsonField<Boolean>) = apply {
            this.distinctLaunchPhase = distinctLaunchPhase
        }

        fun inviteTestDevices(inviteTestDevices: Boolean) =
            inviteTestDevices(JsonField.of(inviteTestDevices))

        /**
         * Sets [Builder.inviteTestDevices] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inviteTestDevices] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun inviteTestDevices(inviteTestDevices: JsonField<Boolean>) = apply {
            this.inviteTestDevices = inviteTestDevices
        }

        fun perCarrierApproval(perCarrierApproval: Boolean) =
            perCarrierApproval(JsonField.of(perCarrierApproval))

        /**
         * Sets [Builder.perCarrierApproval] to an arbitrary JSON value.
         *
         * You should usually call [Builder.perCarrierApproval] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun perCarrierApproval(perCarrierApproval: JsonField<Boolean>) = apply {
            this.perCarrierApproval = perCarrierApproval
        }

        fun submissionSections(submissionSections: Boolean) =
            submissionSections(JsonField.of(submissionSections))

        /**
         * Sets [Builder.submissionSections] to an arbitrary JSON value.
         *
         * You should usually call [Builder.submissionSections] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun submissionSections(submissionSections: JsonField<Boolean>) = apply {
            this.submissionSections = submissionSections
        }

        fun templates(templates: Boolean) = templates(JsonField.of(templates))

        /**
         * Sets [Builder.templates] to an arbitrary JSON value.
         *
         * You should usually call [Builder.templates] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun templates(templates: JsonField<Boolean>) = apply { this.templates = templates }

        fun vendorWebhooks(vendorWebhooks: Boolean) = vendorWebhooks(JsonField.of(vendorWebhooks))

        /**
         * Sets [Builder.vendorWebhooks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vendorWebhooks] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun vendorWebhooks(vendorWebhooks: JsonField<Boolean>) = apply {
            this.vendorWebhooks = vendorWebhooks
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
         * Returns an immutable instance of [CapabilitiesResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .brandEntity()
         * .brandVerification()
         * .campaigns()
         * .distinctLaunchPhase()
         * .inviteTestDevices()
         * .perCarrierApproval()
         * .submissionSections()
         * .templates()
         * .vendorWebhooks()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CapabilitiesResponse =
            CapabilitiesResponse(
                checkRequired("brandEntity", brandEntity),
                checkRequired("brandVerification", brandVerification),
                checkRequired("campaigns", campaigns),
                checkRequired("distinctLaunchPhase", distinctLaunchPhase),
                checkRequired("inviteTestDevices", inviteTestDevices),
                checkRequired("perCarrierApproval", perCarrierApproval),
                checkRequired("submissionSections", submissionSections),
                checkRequired("templates", templates),
                checkRequired("vendorWebhooks", vendorWebhooks),
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
    fun validate(): CapabilitiesResponse = apply {
        if (validated) {
            return@apply
        }

        brandEntity()
        brandVerification()
        campaigns()
        distinctLaunchPhase()
        inviteTestDevices()
        perCarrierApproval()
        submissionSections()
        templates()
        vendorWebhooks()
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
        (if (brandEntity.asKnown().isPresent) 1 else 0) +
            (if (brandVerification.asKnown().isPresent) 1 else 0) +
            (if (campaigns.asKnown().isPresent) 1 else 0) +
            (if (distinctLaunchPhase.asKnown().isPresent) 1 else 0) +
            (if (inviteTestDevices.asKnown().isPresent) 1 else 0) +
            (if (perCarrierApproval.asKnown().isPresent) 1 else 0) +
            (if (submissionSections.asKnown().isPresent) 1 else 0) +
            (if (templates.asKnown().isPresent) 1 else 0) +
            (if (vendorWebhooks.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CapabilitiesResponse &&
            brandEntity == other.brandEntity &&
            brandVerification == other.brandVerification &&
            campaigns == other.campaigns &&
            distinctLaunchPhase == other.distinctLaunchPhase &&
            inviteTestDevices == other.inviteTestDevices &&
            perCarrierApproval == other.perCarrierApproval &&
            submissionSections == other.submissionSections &&
            templates == other.templates &&
            vendorWebhooks == other.vendorWebhooks &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            brandEntity,
            brandVerification,
            campaigns,
            distinctLaunchPhase,
            inviteTestDevices,
            perCarrierApproval,
            submissionSections,
            templates,
            vendorWebhooks,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CapabilitiesResponse{brandEntity=$brandEntity, brandVerification=$brandVerification, campaigns=$campaigns, distinctLaunchPhase=$distinctLaunchPhase, inviteTestDevices=$inviteTestDevices, perCarrierApproval=$perCarrierApproval, submissionSections=$submissionSections, templates=$templates, vendorWebhooks=$vendorWebhooks, additionalProperties=$additionalProperties}"
}
