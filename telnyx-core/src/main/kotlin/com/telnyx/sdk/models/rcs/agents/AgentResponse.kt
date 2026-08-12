// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rcs.agents

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import com.telnyx.sdk.models.rcs.agents.testdevices.TestDeviceResponse
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AgentResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val agentId: JsonField<String>,
    private val basicsStatus: JsonField<AgentSubmissionStatus>,
    private val billingCategory: JsonField<BillingCategory>,
    private val brandId: JsonField<String>,
    private val campaignStatus: JsonField<AgentSubmissionStatus>,
    private val capabilities: JsonField<CapabilitiesResponse>,
    private val carrierApprovals: JsonField<List<CarrierApprovalResponse>>,
    private val configuration: JsonField<AgentConfiguration>,
    private val displayName: JsonField<String>,
    private val hostingRegion: JsonField<String>,
    private val profileId: JsonField<String>,
    private val status: JsonField<Status>,
    private val testDevices: JsonField<List<TestDeviceResponse>>,
    private val testingStatus: JsonField<AgentSubmissionStatus>,
    private val useCase: JsonField<AgentUseCase>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("agent_id") @ExcludeMissing agentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("basics_status")
        @ExcludeMissing
        basicsStatus: JsonField<AgentSubmissionStatus> = JsonMissing.of(),
        @JsonProperty("billing_category")
        @ExcludeMissing
        billingCategory: JsonField<BillingCategory> = JsonMissing.of(),
        @JsonProperty("brand_id") @ExcludeMissing brandId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("campaign_status")
        @ExcludeMissing
        campaignStatus: JsonField<AgentSubmissionStatus> = JsonMissing.of(),
        @JsonProperty("capabilities")
        @ExcludeMissing
        capabilities: JsonField<CapabilitiesResponse> = JsonMissing.of(),
        @JsonProperty("carrier_approvals")
        @ExcludeMissing
        carrierApprovals: JsonField<List<CarrierApprovalResponse>> = JsonMissing.of(),
        @JsonProperty("configuration")
        @ExcludeMissing
        configuration: JsonField<AgentConfiguration> = JsonMissing.of(),
        @JsonProperty("display_name")
        @ExcludeMissing
        displayName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("hosting_region")
        @ExcludeMissing
        hostingRegion: JsonField<String> = JsonMissing.of(),
        @JsonProperty("profile_id") @ExcludeMissing profileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("test_devices")
        @ExcludeMissing
        testDevices: JsonField<List<TestDeviceResponse>> = JsonMissing.of(),
        @JsonProperty("testing_status")
        @ExcludeMissing
        testingStatus: JsonField<AgentSubmissionStatus> = JsonMissing.of(),
        @JsonProperty("use_case")
        @ExcludeMissing
        useCase: JsonField<AgentUseCase> = JsonMissing.of(),
    ) : this(
        agentId,
        basicsStatus,
        billingCategory,
        brandId,
        campaignStatus,
        capabilities,
        carrierApprovals,
        configuration,
        displayName,
        hostingRegion,
        profileId,
        status,
        testDevices,
        testingStatus,
        useCase,
        mutableMapOf(),
    )

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun agentId(): String = agentId.getRequired("agent_id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun basicsStatus(): Optional<AgentSubmissionStatus> = basicsStatus.getOptional("basics_status")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billingCategory(): Optional<BillingCategory> =
        billingCategory.getOptional("billing_category")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun brandId(): String = brandId.getRequired("brand_id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun campaignStatus(): Optional<AgentSubmissionStatus> =
        campaignStatus.getOptional("campaign_status")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun capabilities(): CapabilitiesResponse = capabilities.getRequired("capabilities")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun carrierApprovals(): List<CarrierApprovalResponse> =
        carrierApprovals.getRequired("carrier_approvals")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun configuration(): AgentConfiguration = configuration.getRequired("configuration")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun displayName(): String = displayName.getRequired("display_name")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hostingRegion(): Optional<String> = hostingRegion.getOptional("hosting_region")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun profileId(): Optional<String> = profileId.getOptional("profile_id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun testDevices(): List<TestDeviceResponse> = testDevices.getRequired("test_devices")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun testingStatus(): Optional<AgentSubmissionStatus> =
        testingStatus.getOptional("testing_status")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun useCase(): AgentUseCase = useCase.getRequired("use_case")

    /**
     * Returns the raw JSON value of [agentId].
     *
     * Unlike [agentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("agent_id") @ExcludeMissing fun _agentId(): JsonField<String> = agentId

    /**
     * Returns the raw JSON value of [basicsStatus].
     *
     * Unlike [basicsStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("basics_status")
    @ExcludeMissing
    fun _basicsStatus(): JsonField<AgentSubmissionStatus> = basicsStatus

    /**
     * Returns the raw JSON value of [billingCategory].
     *
     * Unlike [billingCategory], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("billing_category")
    @ExcludeMissing
    fun _billingCategory(): JsonField<BillingCategory> = billingCategory

    /**
     * Returns the raw JSON value of [brandId].
     *
     * Unlike [brandId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("brand_id") @ExcludeMissing fun _brandId(): JsonField<String> = brandId

    /**
     * Returns the raw JSON value of [campaignStatus].
     *
     * Unlike [campaignStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("campaign_status")
    @ExcludeMissing
    fun _campaignStatus(): JsonField<AgentSubmissionStatus> = campaignStatus

    /**
     * Returns the raw JSON value of [capabilities].
     *
     * Unlike [capabilities], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("capabilities")
    @ExcludeMissing
    fun _capabilities(): JsonField<CapabilitiesResponse> = capabilities

    /**
     * Returns the raw JSON value of [carrierApprovals].
     *
     * Unlike [carrierApprovals], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("carrier_approvals")
    @ExcludeMissing
    fun _carrierApprovals(): JsonField<List<CarrierApprovalResponse>> = carrierApprovals

    /**
     * Returns the raw JSON value of [configuration].
     *
     * Unlike [configuration], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("configuration")
    @ExcludeMissing
    fun _configuration(): JsonField<AgentConfiguration> = configuration

    /**
     * Returns the raw JSON value of [displayName].
     *
     * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("display_name")
    @ExcludeMissing
    fun _displayName(): JsonField<String> = displayName

    /**
     * Returns the raw JSON value of [hostingRegion].
     *
     * Unlike [hostingRegion], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hosting_region")
    @ExcludeMissing
    fun _hostingRegion(): JsonField<String> = hostingRegion

    /**
     * Returns the raw JSON value of [profileId].
     *
     * Unlike [profileId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("profile_id") @ExcludeMissing fun _profileId(): JsonField<String> = profileId

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [testDevices].
     *
     * Unlike [testDevices], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("test_devices")
    @ExcludeMissing
    fun _testDevices(): JsonField<List<TestDeviceResponse>> = testDevices

    /**
     * Returns the raw JSON value of [testingStatus].
     *
     * Unlike [testingStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("testing_status")
    @ExcludeMissing
    fun _testingStatus(): JsonField<AgentSubmissionStatus> = testingStatus

    /**
     * Returns the raw JSON value of [useCase].
     *
     * Unlike [useCase], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("use_case") @ExcludeMissing fun _useCase(): JsonField<AgentUseCase> = useCase

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
         * Returns a mutable builder for constructing an instance of [AgentResponse].
         *
         * The following fields are required:
         * ```java
         * .agentId()
         * .basicsStatus()
         * .billingCategory()
         * .brandId()
         * .campaignStatus()
         * .capabilities()
         * .carrierApprovals()
         * .configuration()
         * .displayName()
         * .hostingRegion()
         * .profileId()
         * .status()
         * .testDevices()
         * .testingStatus()
         * .useCase()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AgentResponse]. */
    class Builder internal constructor() {

        private var agentId: JsonField<String>? = null
        private var basicsStatus: JsonField<AgentSubmissionStatus>? = null
        private var billingCategory: JsonField<BillingCategory>? = null
        private var brandId: JsonField<String>? = null
        private var campaignStatus: JsonField<AgentSubmissionStatus>? = null
        private var capabilities: JsonField<CapabilitiesResponse>? = null
        private var carrierApprovals: JsonField<MutableList<CarrierApprovalResponse>>? = null
        private var configuration: JsonField<AgentConfiguration>? = null
        private var displayName: JsonField<String>? = null
        private var hostingRegion: JsonField<String>? = null
        private var profileId: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var testDevices: JsonField<MutableList<TestDeviceResponse>>? = null
        private var testingStatus: JsonField<AgentSubmissionStatus>? = null
        private var useCase: JsonField<AgentUseCase>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(agentResponse: AgentResponse) = apply {
            agentId = agentResponse.agentId
            basicsStatus = agentResponse.basicsStatus
            billingCategory = agentResponse.billingCategory
            brandId = agentResponse.brandId
            campaignStatus = agentResponse.campaignStatus
            capabilities = agentResponse.capabilities
            carrierApprovals = agentResponse.carrierApprovals.map { it.toMutableList() }
            configuration = agentResponse.configuration
            displayName = agentResponse.displayName
            hostingRegion = agentResponse.hostingRegion
            profileId = agentResponse.profileId
            status = agentResponse.status
            testDevices = agentResponse.testDevices.map { it.toMutableList() }
            testingStatus = agentResponse.testingStatus
            useCase = agentResponse.useCase
            additionalProperties = agentResponse.additionalProperties.toMutableMap()
        }

        fun agentId(agentId: String) = agentId(JsonField.of(agentId))

        /**
         * Sets [Builder.agentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agentId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun agentId(agentId: JsonField<String>) = apply { this.agentId = agentId }

        fun basicsStatus(basicsStatus: AgentSubmissionStatus?) =
            basicsStatus(JsonField.ofNullable(basicsStatus))

        /** Alias for calling [Builder.basicsStatus] with `basicsStatus.orElse(null)`. */
        fun basicsStatus(basicsStatus: Optional<AgentSubmissionStatus>) =
            basicsStatus(basicsStatus.getOrNull())

        /**
         * Sets [Builder.basicsStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.basicsStatus] with a well-typed [AgentSubmissionStatus]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun basicsStatus(basicsStatus: JsonField<AgentSubmissionStatus>) = apply {
            this.basicsStatus = basicsStatus
        }

        fun billingCategory(billingCategory: BillingCategory?) =
            billingCategory(JsonField.ofNullable(billingCategory))

        /** Alias for calling [Builder.billingCategory] with `billingCategory.orElse(null)`. */
        fun billingCategory(billingCategory: Optional<BillingCategory>) =
            billingCategory(billingCategory.getOrNull())

        /**
         * Sets [Builder.billingCategory] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingCategory] with a well-typed [BillingCategory]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun billingCategory(billingCategory: JsonField<BillingCategory>) = apply {
            this.billingCategory = billingCategory
        }

        fun brandId(brandId: String) = brandId(JsonField.of(brandId))

        /**
         * Sets [Builder.brandId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.brandId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun brandId(brandId: JsonField<String>) = apply { this.brandId = brandId }

        fun campaignStatus(campaignStatus: AgentSubmissionStatus?) =
            campaignStatus(JsonField.ofNullable(campaignStatus))

        /** Alias for calling [Builder.campaignStatus] with `campaignStatus.orElse(null)`. */
        fun campaignStatus(campaignStatus: Optional<AgentSubmissionStatus>) =
            campaignStatus(campaignStatus.getOrNull())

        /**
         * Sets [Builder.campaignStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.campaignStatus] with a well-typed
         * [AgentSubmissionStatus] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun campaignStatus(campaignStatus: JsonField<AgentSubmissionStatus>) = apply {
            this.campaignStatus = campaignStatus
        }

        fun capabilities(capabilities: CapabilitiesResponse) =
            capabilities(JsonField.of(capabilities))

        /**
         * Sets [Builder.capabilities] to an arbitrary JSON value.
         *
         * You should usually call [Builder.capabilities] with a well-typed [CapabilitiesResponse]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun capabilities(capabilities: JsonField<CapabilitiesResponse>) = apply {
            this.capabilities = capabilities
        }

        fun carrierApprovals(carrierApprovals: List<CarrierApprovalResponse>) =
            carrierApprovals(JsonField.of(carrierApprovals))

        /**
         * Sets [Builder.carrierApprovals] to an arbitrary JSON value.
         *
         * You should usually call [Builder.carrierApprovals] with a well-typed
         * `List<CarrierApprovalResponse>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun carrierApprovals(carrierApprovals: JsonField<List<CarrierApprovalResponse>>) = apply {
            this.carrierApprovals = carrierApprovals.map { it.toMutableList() }
        }

        /**
         * Adds a single [CarrierApprovalResponse] to [carrierApprovals].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCarrierApproval(carrierApproval: CarrierApprovalResponse) = apply {
            carrierApprovals =
                (carrierApprovals ?: JsonField.of(mutableListOf())).also {
                    checkKnown("carrierApprovals", it).add(carrierApproval)
                }
        }

        fun configuration(configuration: AgentConfiguration) =
            configuration(JsonField.of(configuration))

        /**
         * Sets [Builder.configuration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.configuration] with a well-typed [AgentConfiguration]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun configuration(configuration: JsonField<AgentConfiguration>) = apply {
            this.configuration = configuration
        }

        fun displayName(displayName: String) = displayName(JsonField.of(displayName))

        /**
         * Sets [Builder.displayName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun displayName(displayName: JsonField<String>) = apply { this.displayName = displayName }

        fun hostingRegion(hostingRegion: String?) =
            hostingRegion(JsonField.ofNullable(hostingRegion))

        /** Alias for calling [Builder.hostingRegion] with `hostingRegion.orElse(null)`. */
        fun hostingRegion(hostingRegion: Optional<String>) =
            hostingRegion(hostingRegion.getOrNull())

        /**
         * Sets [Builder.hostingRegion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hostingRegion] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun hostingRegion(hostingRegion: JsonField<String>) = apply {
            this.hostingRegion = hostingRegion
        }

        fun profileId(profileId: String?) = profileId(JsonField.ofNullable(profileId))

        /** Alias for calling [Builder.profileId] with `profileId.orElse(null)`. */
        fun profileId(profileId: Optional<String>) = profileId(profileId.getOrNull())

        /**
         * Sets [Builder.profileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.profileId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun profileId(profileId: JsonField<String>) = apply { this.profileId = profileId }

        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun testDevices(testDevices: List<TestDeviceResponse>) =
            testDevices(JsonField.of(testDevices))

        /**
         * Sets [Builder.testDevices] to an arbitrary JSON value.
         *
         * You should usually call [Builder.testDevices] with a well-typed
         * `List<TestDeviceResponse>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun testDevices(testDevices: JsonField<List<TestDeviceResponse>>) = apply {
            this.testDevices = testDevices.map { it.toMutableList() }
        }

        /**
         * Adds a single [TestDeviceResponse] to [testDevices].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTestDevice(testDevice: TestDeviceResponse) = apply {
            testDevices =
                (testDevices ?: JsonField.of(mutableListOf())).also {
                    checkKnown("testDevices", it).add(testDevice)
                }
        }

        fun testingStatus(testingStatus: AgentSubmissionStatus?) =
            testingStatus(JsonField.ofNullable(testingStatus))

        /** Alias for calling [Builder.testingStatus] with `testingStatus.orElse(null)`. */
        fun testingStatus(testingStatus: Optional<AgentSubmissionStatus>) =
            testingStatus(testingStatus.getOrNull())

        /**
         * Sets [Builder.testingStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.testingStatus] with a well-typed [AgentSubmissionStatus]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun testingStatus(testingStatus: JsonField<AgentSubmissionStatus>) = apply {
            this.testingStatus = testingStatus
        }

        fun useCase(useCase: AgentUseCase) = useCase(JsonField.of(useCase))

        /**
         * Sets [Builder.useCase] to an arbitrary JSON value.
         *
         * You should usually call [Builder.useCase] with a well-typed [AgentUseCase] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun useCase(useCase: JsonField<AgentUseCase>) = apply { this.useCase = useCase }

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
         * Returns an immutable instance of [AgentResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .agentId()
         * .basicsStatus()
         * .billingCategory()
         * .brandId()
         * .campaignStatus()
         * .capabilities()
         * .carrierApprovals()
         * .configuration()
         * .displayName()
         * .hostingRegion()
         * .profileId()
         * .status()
         * .testDevices()
         * .testingStatus()
         * .useCase()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AgentResponse =
            AgentResponse(
                checkRequired("agentId", agentId),
                checkRequired("basicsStatus", basicsStatus),
                checkRequired("billingCategory", billingCategory),
                checkRequired("brandId", brandId),
                checkRequired("campaignStatus", campaignStatus),
                checkRequired("capabilities", capabilities),
                checkRequired("carrierApprovals", carrierApprovals).map { it.toImmutable() },
                checkRequired("configuration", configuration),
                checkRequired("displayName", displayName),
                checkRequired("hostingRegion", hostingRegion),
                checkRequired("profileId", profileId),
                checkRequired("status", status),
                checkRequired("testDevices", testDevices).map { it.toImmutable() },
                checkRequired("testingStatus", testingStatus),
                checkRequired("useCase", useCase),
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
    fun validate(): AgentResponse = apply {
        if (validated) {
            return@apply
        }

        agentId()
        basicsStatus().ifPresent { it.validate() }
        billingCategory().ifPresent { it.validate() }
        brandId()
        campaignStatus().ifPresent { it.validate() }
        capabilities().validate()
        carrierApprovals().forEach { it.validate() }
        configuration().validate()
        displayName()
        hostingRegion()
        profileId()
        status().validate()
        testDevices().forEach { it.validate() }
        testingStatus().ifPresent { it.validate() }
        useCase().validate()
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
        (if (agentId.asKnown().isPresent) 1 else 0) +
            (basicsStatus.asKnown().getOrNull()?.validity() ?: 0) +
            (billingCategory.asKnown().getOrNull()?.validity() ?: 0) +
            (if (brandId.asKnown().isPresent) 1 else 0) +
            (campaignStatus.asKnown().getOrNull()?.validity() ?: 0) +
            (capabilities.asKnown().getOrNull()?.validity() ?: 0) +
            (carrierApprovals.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (configuration.asKnown().getOrNull()?.validity() ?: 0) +
            (if (displayName.asKnown().isPresent) 1 else 0) +
            (if (hostingRegion.asKnown().isPresent) 1 else 0) +
            (if (profileId.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (testDevices.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (testingStatus.asKnown().getOrNull()?.validity() ?: 0) +
            (useCase.asKnown().getOrNull()?.validity() ?: 0)

    class BillingCategory @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val NON_CONVERSATIONAL = of("NON_CONVERSATIONAL")

            @JvmField val CONVERSATIONAL = of("CONVERSATIONAL")

            @JvmStatic fun of(value: String) = BillingCategory(JsonField.of(value))
        }

        /** An enum containing [BillingCategory]'s known values. */
        enum class Known {
            NON_CONVERSATIONAL,
            CONVERSATIONAL,
        }

        /**
         * An enum containing [BillingCategory]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [BillingCategory] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NON_CONVERSATIONAL,
            CONVERSATIONAL,
            /**
             * An enum member indicating that [BillingCategory] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                NON_CONVERSATIONAL -> Value.NON_CONVERSATIONAL
                CONVERSATIONAL -> Value.CONVERSATIONAL
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                NON_CONVERSATIONAL -> Known.NON_CONVERSATIONAL
                CONVERSATIONAL -> Known.CONVERSATIONAL
                else -> throw TelnyxInvalidDataException("Unknown BillingCategory: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): BillingCategory = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BillingCategory && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val CREATED = of("CREATED")

            @JvmField val SUBMITTED = of("SUBMITTED")

            @JvmField val VERIFYING = of("VERIFYING")

            @JvmField val VERIFIED = of("VERIFIED")

            @JvmField val LAUNCHING = of("LAUNCHING")

            @JvmField val LAUNCHED = of("LAUNCHED")

            @JvmField val LIVE = of("LIVE")

            @JvmField val REJECTED = of("REJECTED")

            @JvmField val FAILED = of("FAILED")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            CREATED,
            SUBMITTED,
            VERIFYING,
            VERIFIED,
            LAUNCHING,
            LAUNCHED,
            LIVE,
            REJECTED,
            FAILED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CREATED,
            SUBMITTED,
            VERIFYING,
            VERIFIED,
            LAUNCHING,
            LAUNCHED,
            LIVE,
            REJECTED,
            FAILED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                CREATED -> Value.CREATED
                SUBMITTED -> Value.SUBMITTED
                VERIFYING -> Value.VERIFYING
                VERIFIED -> Value.VERIFIED
                LAUNCHING -> Value.LAUNCHING
                LAUNCHED -> Value.LAUNCHED
                LIVE -> Value.LIVE
                REJECTED -> Value.REJECTED
                FAILED -> Value.FAILED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                CREATED -> Known.CREATED
                SUBMITTED -> Known.SUBMITTED
                VERIFYING -> Known.VERIFYING
                VERIFIED -> Known.VERIFIED
                LAUNCHING -> Known.LAUNCHING
                LAUNCHED -> Known.LAUNCHED
                LIVE -> Known.LIVE
                REJECTED -> Known.REJECTED
                FAILED -> Known.FAILED
                else -> throw TelnyxInvalidDataException("Unknown Status: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Status = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentResponse &&
            agentId == other.agentId &&
            basicsStatus == other.basicsStatus &&
            billingCategory == other.billingCategory &&
            brandId == other.brandId &&
            campaignStatus == other.campaignStatus &&
            capabilities == other.capabilities &&
            carrierApprovals == other.carrierApprovals &&
            configuration == other.configuration &&
            displayName == other.displayName &&
            hostingRegion == other.hostingRegion &&
            profileId == other.profileId &&
            status == other.status &&
            testDevices == other.testDevices &&
            testingStatus == other.testingStatus &&
            useCase == other.useCase &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            agentId,
            basicsStatus,
            billingCategory,
            brandId,
            campaignStatus,
            capabilities,
            carrierApprovals,
            configuration,
            displayName,
            hostingRegion,
            profileId,
            status,
            testDevices,
            testingStatus,
            useCase,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AgentResponse{agentId=$agentId, basicsStatus=$basicsStatus, billingCategory=$billingCategory, brandId=$brandId, campaignStatus=$campaignStatus, capabilities=$capabilities, carrierApprovals=$carrierApprovals, configuration=$configuration, displayName=$displayName, hostingRegion=$hostingRegion, profileId=$profileId, status=$status, testDevices=$testDevices, testingStatus=$testingStatus, useCase=$useCase, additionalProperties=$additionalProperties}"
}
