// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders

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
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import com.telnyx.sdk.models.PortingOrderStatus
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PortingOrder
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val activationSettings: JsonField<PortingOrderActivationSettings>,
    private val additionalSteps: JsonField<List<AdditionalStep>>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val customerGroupReference: JsonField<String>,
    private val customerReference: JsonField<String>,
    private val description: JsonField<String>,
    private val documents: JsonField<PortingOrderDocuments>,
    private val endUser: JsonField<PortingOrderEndUser>,
    private val messaging: JsonField<PortingOrderMessaging>,
    private val misc: JsonField<PortingOrderMisc>,
    private val oldServiceProviderOcn: JsonField<String>,
    private val parentSupportKey: JsonField<String>,
    private val phoneNumberConfiguration: JsonField<PortingOrderPhoneNumberConfiguration>,
    private val phoneNumberType: JsonField<PhoneNumberType>,
    private val portingPhoneNumbersCount: JsonField<Long>,
    private val recordType: JsonField<String>,
    private val requirements: JsonField<List<PortingOrderRequirement>>,
    private val requirementsMet: JsonField<Boolean>,
    private val status: JsonField<PortingOrderStatus>,
    private val supportKey: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val userFeedback: JsonField<PortingOrderUserFeedback>,
    private val userId: JsonField<String>,
    private val webhookUrl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("activation_settings")
        @ExcludeMissing
        activationSettings: JsonField<PortingOrderActivationSettings> = JsonMissing.of(),
        @JsonProperty("additional_steps")
        @ExcludeMissing
        additionalSteps: JsonField<List<AdditionalStep>> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("customer_group_reference")
        @ExcludeMissing
        customerGroupReference: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customer_reference")
        @ExcludeMissing
        customerReference: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("documents")
        @ExcludeMissing
        documents: JsonField<PortingOrderDocuments> = JsonMissing.of(),
        @JsonProperty("end_user")
        @ExcludeMissing
        endUser: JsonField<PortingOrderEndUser> = JsonMissing.of(),
        @JsonProperty("messaging")
        @ExcludeMissing
        messaging: JsonField<PortingOrderMessaging> = JsonMissing.of(),
        @JsonProperty("misc") @ExcludeMissing misc: JsonField<PortingOrderMisc> = JsonMissing.of(),
        @JsonProperty("old_service_provider_ocn")
        @ExcludeMissing
        oldServiceProviderOcn: JsonField<String> = JsonMissing.of(),
        @JsonProperty("parent_support_key")
        @ExcludeMissing
        parentSupportKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phone_number_configuration")
        @ExcludeMissing
        phoneNumberConfiguration: JsonField<PortingOrderPhoneNumberConfiguration> =
            JsonMissing.of(),
        @JsonProperty("phone_number_type")
        @ExcludeMissing
        phoneNumberType: JsonField<PhoneNumberType> = JsonMissing.of(),
        @JsonProperty("porting_phone_numbers_count")
        @ExcludeMissing
        portingPhoneNumbersCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("requirements")
        @ExcludeMissing
        requirements: JsonField<List<PortingOrderRequirement>> = JsonMissing.of(),
        @JsonProperty("requirements_met")
        @ExcludeMissing
        requirementsMet: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<PortingOrderStatus> = JsonMissing.of(),
        @JsonProperty("support_key")
        @ExcludeMissing
        supportKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("user_feedback")
        @ExcludeMissing
        userFeedback: JsonField<PortingOrderUserFeedback> = JsonMissing.of(),
        @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("webhook_url")
        @ExcludeMissing
        webhookUrl: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        activationSettings,
        additionalSteps,
        createdAt,
        customerGroupReference,
        customerReference,
        description,
        documents,
        endUser,
        messaging,
        misc,
        oldServiceProviderOcn,
        parentSupportKey,
        phoneNumberConfiguration,
        phoneNumberType,
        portingPhoneNumbersCount,
        recordType,
        requirements,
        requirementsMet,
        status,
        supportKey,
        updatedAt,
        userFeedback,
        userId,
        webhookUrl,
        mutableMapOf(),
    )

    /**
     * Uniquely identifies this porting order
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun activationSettings(): Optional<PortingOrderActivationSettings> =
        activationSettings.getOptional("activation_settings")

    /**
     * For specific porting orders, we may require additional steps to be taken before submitting
     * the porting order.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun additionalSteps(): Optional<List<AdditionalStep>> =
        additionalSteps.getOptional("additional_steps")

    /**
     * ISO 8601 formatted date indicating when the resource was created.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * A customer-specified group reference for customer bookkeeping purposes
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customerGroupReference(): Optional<String> =
        customerGroupReference.getOptional("customer_group_reference")

    /**
     * A customer-specified reference number for customer bookkeeping purposes
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customerReference(): Optional<String> = customerReference.getOptional("customer_reference")

    /**
     * A description of the porting order
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * Can be specified directly or via the `requirement_group_id` parameter.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun documents(): Optional<PortingOrderDocuments> = documents.getOptional("documents")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endUser(): Optional<PortingOrderEndUser> = endUser.getOptional("end_user")

    /**
     * Information about messaging porting process.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun messaging(): Optional<PortingOrderMessaging> = messaging.getOptional("messaging")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun misc(): Optional<PortingOrderMisc> = misc.getOptional("misc")

    /**
     * Identifies the old service provider
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun oldServiceProviderOcn(): Optional<String> =
        oldServiceProviderOcn.getOptional("old_service_provider_ocn")

    /**
     * A key to reference for the porting order group when contacting Telnyx customer support. This
     * information is not available for porting orders in `draft` state
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parentSupportKey(): Optional<String> = parentSupportKey.getOptional("parent_support_key")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneNumberConfiguration(): Optional<PortingOrderPhoneNumberConfiguration> =
        phoneNumberConfiguration.getOptional("phone_number_configuration")

    /**
     * The type of the phone number
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneNumberType(): Optional<PhoneNumberType> =
        phoneNumberType.getOptional("phone_number_type")

    /**
     * Count of phone numbers associated with this porting order
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun portingPhoneNumbersCount(): Optional<Long> =
        portingPhoneNumbersCount.getOptional("porting_phone_numbers_count")

    /**
     * Identifies the type of the resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<String> = recordType.getOptional("record_type")

    /**
     * List of documentation requirements for porting numbers. Can be set directly or via the
     * `requirement_group_id` parameter.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun requirements(): Optional<List<PortingOrderRequirement>> =
        requirements.getOptional("requirements")

    /**
     * Is true when the required documentation is met
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun requirementsMet(): Optional<Boolean> = requirementsMet.getOptional("requirements_met")

    /**
     * Porting order status
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<PortingOrderStatus> = status.getOptional("status")

    /**
     * A key to reference this porting order when contacting Telnyx customer support. This
     * information is not available in draft porting orders.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun supportKey(): Optional<String> = supportKey.getOptional("support_key")

    /**
     * ISO 8601 formatted date indicating when the resource was created.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userFeedback(): Optional<PortingOrderUserFeedback> =
        userFeedback.getOptional("user_feedback")

    /**
     * Identifies the user (or organization) who requested the porting order
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userId(): Optional<String> = userId.getOptional("user_id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookUrl(): Optional<String> = webhookUrl.getOptional("webhook_url")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [activationSettings].
     *
     * Unlike [activationSettings], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("activation_settings")
    @ExcludeMissing
    fun _activationSettings(): JsonField<PortingOrderActivationSettings> = activationSettings

    /**
     * Returns the raw JSON value of [additionalSteps].
     *
     * Unlike [additionalSteps], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("additional_steps")
    @ExcludeMissing
    fun _additionalSteps(): JsonField<List<AdditionalStep>> = additionalSteps

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [customerGroupReference].
     *
     * Unlike [customerGroupReference], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("customer_group_reference")
    @ExcludeMissing
    fun _customerGroupReference(): JsonField<String> = customerGroupReference

    /**
     * Returns the raw JSON value of [customerReference].
     *
     * Unlike [customerReference], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("customer_reference")
    @ExcludeMissing
    fun _customerReference(): JsonField<String> = customerReference

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [documents].
     *
     * Unlike [documents], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("documents")
    @ExcludeMissing
    fun _documents(): JsonField<PortingOrderDocuments> = documents

    /**
     * Returns the raw JSON value of [endUser].
     *
     * Unlike [endUser], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("end_user")
    @ExcludeMissing
    fun _endUser(): JsonField<PortingOrderEndUser> = endUser

    /**
     * Returns the raw JSON value of [messaging].
     *
     * Unlike [messaging], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("messaging")
    @ExcludeMissing
    fun _messaging(): JsonField<PortingOrderMessaging> = messaging

    /**
     * Returns the raw JSON value of [misc].
     *
     * Unlike [misc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("misc") @ExcludeMissing fun _misc(): JsonField<PortingOrderMisc> = misc

    /**
     * Returns the raw JSON value of [oldServiceProviderOcn].
     *
     * Unlike [oldServiceProviderOcn], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("old_service_provider_ocn")
    @ExcludeMissing
    fun _oldServiceProviderOcn(): JsonField<String> = oldServiceProviderOcn

    /**
     * Returns the raw JSON value of [parentSupportKey].
     *
     * Unlike [parentSupportKey], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("parent_support_key")
    @ExcludeMissing
    fun _parentSupportKey(): JsonField<String> = parentSupportKey

    /**
     * Returns the raw JSON value of [phoneNumberConfiguration].
     *
     * Unlike [phoneNumberConfiguration], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("phone_number_configuration")
    @ExcludeMissing
    fun _phoneNumberConfiguration(): JsonField<PortingOrderPhoneNumberConfiguration> =
        phoneNumberConfiguration

    /**
     * Returns the raw JSON value of [phoneNumberType].
     *
     * Unlike [phoneNumberType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phone_number_type")
    @ExcludeMissing
    fun _phoneNumberType(): JsonField<PhoneNumberType> = phoneNumberType

    /**
     * Returns the raw JSON value of [portingPhoneNumbersCount].
     *
     * Unlike [portingPhoneNumbersCount], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("porting_phone_numbers_count")
    @ExcludeMissing
    fun _portingPhoneNumbersCount(): JsonField<Long> = portingPhoneNumbersCount

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type") @ExcludeMissing fun _recordType(): JsonField<String> = recordType

    /**
     * Returns the raw JSON value of [requirements].
     *
     * Unlike [requirements], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("requirements")
    @ExcludeMissing
    fun _requirements(): JsonField<List<PortingOrderRequirement>> = requirements

    /**
     * Returns the raw JSON value of [requirementsMet].
     *
     * Unlike [requirementsMet], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("requirements_met")
    @ExcludeMissing
    fun _requirementsMet(): JsonField<Boolean> = requirementsMet

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<PortingOrderStatus> = status

    /**
     * Returns the raw JSON value of [supportKey].
     *
     * Unlike [supportKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("support_key") @ExcludeMissing fun _supportKey(): JsonField<String> = supportKey

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [userFeedback].
     *
     * Unlike [userFeedback], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_feedback")
    @ExcludeMissing
    fun _userFeedback(): JsonField<PortingOrderUserFeedback> = userFeedback

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

    /**
     * Returns the raw JSON value of [webhookUrl].
     *
     * Unlike [webhookUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("webhook_url") @ExcludeMissing fun _webhookUrl(): JsonField<String> = webhookUrl

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

        /** Returns a mutable builder for constructing an instance of [PortingOrder]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PortingOrder]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var activationSettings: JsonField<PortingOrderActivationSettings> = JsonMissing.of()
        private var additionalSteps: JsonField<MutableList<AdditionalStep>>? = null
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var customerGroupReference: JsonField<String> = JsonMissing.of()
        private var customerReference: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var documents: JsonField<PortingOrderDocuments> = JsonMissing.of()
        private var endUser: JsonField<PortingOrderEndUser> = JsonMissing.of()
        private var messaging: JsonField<PortingOrderMessaging> = JsonMissing.of()
        private var misc: JsonField<PortingOrderMisc> = JsonMissing.of()
        private var oldServiceProviderOcn: JsonField<String> = JsonMissing.of()
        private var parentSupportKey: JsonField<String> = JsonMissing.of()
        private var phoneNumberConfiguration: JsonField<PortingOrderPhoneNumberConfiguration> =
            JsonMissing.of()
        private var phoneNumberType: JsonField<PhoneNumberType> = JsonMissing.of()
        private var portingPhoneNumbersCount: JsonField<Long> = JsonMissing.of()
        private var recordType: JsonField<String> = JsonMissing.of()
        private var requirements: JsonField<MutableList<PortingOrderRequirement>>? = null
        private var requirementsMet: JsonField<Boolean> = JsonMissing.of()
        private var status: JsonField<PortingOrderStatus> = JsonMissing.of()
        private var supportKey: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var userFeedback: JsonField<PortingOrderUserFeedback> = JsonMissing.of()
        private var userId: JsonField<String> = JsonMissing.of()
        private var webhookUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(portingOrder: PortingOrder) = apply {
            id = portingOrder.id
            activationSettings = portingOrder.activationSettings
            additionalSteps = portingOrder.additionalSteps.map { it.toMutableList() }
            createdAt = portingOrder.createdAt
            customerGroupReference = portingOrder.customerGroupReference
            customerReference = portingOrder.customerReference
            description = portingOrder.description
            documents = portingOrder.documents
            endUser = portingOrder.endUser
            messaging = portingOrder.messaging
            misc = portingOrder.misc
            oldServiceProviderOcn = portingOrder.oldServiceProviderOcn
            parentSupportKey = portingOrder.parentSupportKey
            phoneNumberConfiguration = portingOrder.phoneNumberConfiguration
            phoneNumberType = portingOrder.phoneNumberType
            portingPhoneNumbersCount = portingOrder.portingPhoneNumbersCount
            recordType = portingOrder.recordType
            requirements = portingOrder.requirements.map { it.toMutableList() }
            requirementsMet = portingOrder.requirementsMet
            status = portingOrder.status
            supportKey = portingOrder.supportKey
            updatedAt = portingOrder.updatedAt
            userFeedback = portingOrder.userFeedback
            userId = portingOrder.userId
            webhookUrl = portingOrder.webhookUrl
            additionalProperties = portingOrder.additionalProperties.toMutableMap()
        }

        /** Uniquely identifies this porting order */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun activationSettings(activationSettings: PortingOrderActivationSettings) =
            activationSettings(JsonField.of(activationSettings))

        /**
         * Sets [Builder.activationSettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.activationSettings] with a well-typed
         * [PortingOrderActivationSettings] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun activationSettings(activationSettings: JsonField<PortingOrderActivationSettings>) =
            apply {
                this.activationSettings = activationSettings
            }

        /**
         * For specific porting orders, we may require additional steps to be taken before
         * submitting the porting order.
         */
        fun additionalSteps(additionalSteps: List<AdditionalStep>) =
            additionalSteps(JsonField.of(additionalSteps))

        /**
         * Sets [Builder.additionalSteps] to an arbitrary JSON value.
         *
         * You should usually call [Builder.additionalSteps] with a well-typed
         * `List<AdditionalStep>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun additionalSteps(additionalSteps: JsonField<List<AdditionalStep>>) = apply {
            this.additionalSteps = additionalSteps.map { it.toMutableList() }
        }

        /**
         * Adds a single [AdditionalStep] to [additionalSteps].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAdditionalStep(additionalStep: AdditionalStep) = apply {
            additionalSteps =
                (additionalSteps ?: JsonField.of(mutableListOf())).also {
                    checkKnown("additionalSteps", it).add(additionalStep)
                }
        }

        /** ISO 8601 formatted date indicating when the resource was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** A customer-specified group reference for customer bookkeeping purposes */
        fun customerGroupReference(customerGroupReference: String) =
            customerGroupReference(JsonField.of(customerGroupReference))

        /**
         * Sets [Builder.customerGroupReference] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerGroupReference] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customerGroupReference(customerGroupReference: JsonField<String>) = apply {
            this.customerGroupReference = customerGroupReference
        }

        /** A customer-specified reference number for customer bookkeeping purposes */
        fun customerReference(customerReference: String) =
            customerReference(JsonField.of(customerReference))

        /**
         * Sets [Builder.customerReference] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerReference] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customerReference(customerReference: JsonField<String>) = apply {
            this.customerReference = customerReference
        }

        /** A description of the porting order */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** Can be specified directly or via the `requirement_group_id` parameter. */
        fun documents(documents: PortingOrderDocuments) = documents(JsonField.of(documents))

        /**
         * Sets [Builder.documents] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documents] with a well-typed [PortingOrderDocuments]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun documents(documents: JsonField<PortingOrderDocuments>) = apply {
            this.documents = documents
        }

        fun endUser(endUser: PortingOrderEndUser) = endUser(JsonField.of(endUser))

        /**
         * Sets [Builder.endUser] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endUser] with a well-typed [PortingOrderEndUser] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endUser(endUser: JsonField<PortingOrderEndUser>) = apply { this.endUser = endUser }

        /** Information about messaging porting process. */
        fun messaging(messaging: PortingOrderMessaging) = messaging(JsonField.of(messaging))

        /**
         * Sets [Builder.messaging] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messaging] with a well-typed [PortingOrderMessaging]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun messaging(messaging: JsonField<PortingOrderMessaging>) = apply {
            this.messaging = messaging
        }

        fun misc(misc: PortingOrderMisc) = misc(JsonField.of(misc))

        /**
         * Sets [Builder.misc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.misc] with a well-typed [PortingOrderMisc] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun misc(misc: JsonField<PortingOrderMisc>) = apply { this.misc = misc }

        /** Identifies the old service provider */
        fun oldServiceProviderOcn(oldServiceProviderOcn: String) =
            oldServiceProviderOcn(JsonField.of(oldServiceProviderOcn))

        /**
         * Sets [Builder.oldServiceProviderOcn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.oldServiceProviderOcn] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun oldServiceProviderOcn(oldServiceProviderOcn: JsonField<String>) = apply {
            this.oldServiceProviderOcn = oldServiceProviderOcn
        }

        /**
         * A key to reference for the porting order group when contacting Telnyx customer support.
         * This information is not available for porting orders in `draft` state
         */
        fun parentSupportKey(parentSupportKey: String) =
            parentSupportKey(JsonField.of(parentSupportKey))

        /**
         * Sets [Builder.parentSupportKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parentSupportKey] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun parentSupportKey(parentSupportKey: JsonField<String>) = apply {
            this.parentSupportKey = parentSupportKey
        }

        fun phoneNumberConfiguration(
            phoneNumberConfiguration: PortingOrderPhoneNumberConfiguration
        ) = phoneNumberConfiguration(JsonField.of(phoneNumberConfiguration))

        /**
         * Sets [Builder.phoneNumberConfiguration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumberConfiguration] with a well-typed
         * [PortingOrderPhoneNumberConfiguration] value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun phoneNumberConfiguration(
            phoneNumberConfiguration: JsonField<PortingOrderPhoneNumberConfiguration>
        ) = apply { this.phoneNumberConfiguration = phoneNumberConfiguration }

        /** The type of the phone number */
        fun phoneNumberType(phoneNumberType: PhoneNumberType) =
            phoneNumberType(JsonField.of(phoneNumberType))

        /**
         * Sets [Builder.phoneNumberType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumberType] with a well-typed [PhoneNumberType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun phoneNumberType(phoneNumberType: JsonField<PhoneNumberType>) = apply {
            this.phoneNumberType = phoneNumberType
        }

        /** Count of phone numbers associated with this porting order */
        fun portingPhoneNumbersCount(portingPhoneNumbersCount: Long) =
            portingPhoneNumbersCount(JsonField.of(portingPhoneNumbersCount))

        /**
         * Sets [Builder.portingPhoneNumbersCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.portingPhoneNumbersCount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun portingPhoneNumbersCount(portingPhoneNumbersCount: JsonField<Long>) = apply {
            this.portingPhoneNumbersCount = portingPhoneNumbersCount
        }

        /** Identifies the type of the resource. */
        fun recordType(recordType: String) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

        /**
         * List of documentation requirements for porting numbers. Can be set directly or via the
         * `requirement_group_id` parameter.
         */
        fun requirements(requirements: List<PortingOrderRequirement>) =
            requirements(JsonField.of(requirements))

        /**
         * Sets [Builder.requirements] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requirements] with a well-typed
         * `List<PortingOrderRequirement>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun requirements(requirements: JsonField<List<PortingOrderRequirement>>) = apply {
            this.requirements = requirements.map { it.toMutableList() }
        }

        /**
         * Adds a single [PortingOrderRequirement] to [requirements].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRequirement(requirement: PortingOrderRequirement) = apply {
            requirements =
                (requirements ?: JsonField.of(mutableListOf())).also {
                    checkKnown("requirements", it).add(requirement)
                }
        }

        /** Is true when the required documentation is met */
        fun requirementsMet(requirementsMet: Boolean) =
            requirementsMet(JsonField.of(requirementsMet))

        /**
         * Sets [Builder.requirementsMet] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requirementsMet] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun requirementsMet(requirementsMet: JsonField<Boolean>) = apply {
            this.requirementsMet = requirementsMet
        }

        /** Porting order status */
        fun status(status: PortingOrderStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [PortingOrderStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun status(status: JsonField<PortingOrderStatus>) = apply { this.status = status }

        /**
         * A key to reference this porting order when contacting Telnyx customer support. This
         * information is not available in draft porting orders.
         */
        fun supportKey(supportKey: String) = supportKey(JsonField.of(supportKey))

        /**
         * Sets [Builder.supportKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.supportKey] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun supportKey(supportKey: JsonField<String>) = apply { this.supportKey = supportKey }

        /** ISO 8601 formatted date indicating when the resource was created. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun userFeedback(userFeedback: PortingOrderUserFeedback) =
            userFeedback(JsonField.of(userFeedback))

        /**
         * Sets [Builder.userFeedback] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userFeedback] with a well-typed
         * [PortingOrderUserFeedback] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun userFeedback(userFeedback: JsonField<PortingOrderUserFeedback>) = apply {
            this.userFeedback = userFeedback
        }

        /** Identifies the user (or organization) who requested the porting order */
        fun userId(userId: String) = userId(JsonField.of(userId))

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

        fun webhookUrl(webhookUrl: String) = webhookUrl(JsonField.of(webhookUrl))

        /**
         * Sets [Builder.webhookUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun webhookUrl(webhookUrl: JsonField<String>) = apply { this.webhookUrl = webhookUrl }

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
         * Returns an immutable instance of [PortingOrder].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PortingOrder =
            PortingOrder(
                id,
                activationSettings,
                (additionalSteps ?: JsonMissing.of()).map { it.toImmutable() },
                createdAt,
                customerGroupReference,
                customerReference,
                description,
                documents,
                endUser,
                messaging,
                misc,
                oldServiceProviderOcn,
                parentSupportKey,
                phoneNumberConfiguration,
                phoneNumberType,
                portingPhoneNumbersCount,
                recordType,
                (requirements ?: JsonMissing.of()).map { it.toImmutable() },
                requirementsMet,
                status,
                supportKey,
                updatedAt,
                userFeedback,
                userId,
                webhookUrl,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PortingOrder = apply {
        if (validated) {
            return@apply
        }

        id()
        activationSettings().ifPresent { it.validate() }
        additionalSteps().ifPresent { it.forEach { it.validate() } }
        createdAt()
        customerGroupReference()
        customerReference()
        description()
        documents().ifPresent { it.validate() }
        endUser().ifPresent { it.validate() }
        messaging().ifPresent { it.validate() }
        misc().ifPresent { it.validate() }
        oldServiceProviderOcn()
        parentSupportKey()
        phoneNumberConfiguration().ifPresent { it.validate() }
        phoneNumberType().ifPresent { it.validate() }
        portingPhoneNumbersCount()
        recordType()
        requirements().ifPresent { it.forEach { it.validate() } }
        requirementsMet()
        status().ifPresent { it.validate() }
        supportKey()
        updatedAt()
        userFeedback().ifPresent { it.validate() }
        userId()
        webhookUrl()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (activationSettings.asKnown().getOrNull()?.validity() ?: 0) +
            (additionalSteps.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (customerGroupReference.asKnown().isPresent) 1 else 0) +
            (if (customerReference.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (documents.asKnown().getOrNull()?.validity() ?: 0) +
            (endUser.asKnown().getOrNull()?.validity() ?: 0) +
            (messaging.asKnown().getOrNull()?.validity() ?: 0) +
            (misc.asKnown().getOrNull()?.validity() ?: 0) +
            (if (oldServiceProviderOcn.asKnown().isPresent) 1 else 0) +
            (if (parentSupportKey.asKnown().isPresent) 1 else 0) +
            (phoneNumberConfiguration.asKnown().getOrNull()?.validity() ?: 0) +
            (phoneNumberType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (portingPhoneNumbersCount.asKnown().isPresent) 1 else 0) +
            (if (recordType.asKnown().isPresent) 1 else 0) +
            (requirements.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (requirementsMet.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (supportKey.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (userFeedback.asKnown().getOrNull()?.validity() ?: 0) +
            (if (userId.asKnown().isPresent) 1 else 0) +
            (if (webhookUrl.asKnown().isPresent) 1 else 0)

    class AdditionalStep @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val ASSOCIATED_PHONE_NUMBERS = of("associated_phone_numbers")

            @JvmField val PHONE_NUMBER_VERIFICATION_CODES = of("phone_number_verification_codes")

            @JvmStatic fun of(value: String) = AdditionalStep(JsonField.of(value))
        }

        /** An enum containing [AdditionalStep]'s known values. */
        enum class Known {
            ASSOCIATED_PHONE_NUMBERS,
            PHONE_NUMBER_VERIFICATION_CODES,
        }

        /**
         * An enum containing [AdditionalStep]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AdditionalStep] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ASSOCIATED_PHONE_NUMBERS,
            PHONE_NUMBER_VERIFICATION_CODES,
            /**
             * An enum member indicating that [AdditionalStep] was instantiated with an unknown
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
                ASSOCIATED_PHONE_NUMBERS -> Value.ASSOCIATED_PHONE_NUMBERS
                PHONE_NUMBER_VERIFICATION_CODES -> Value.PHONE_NUMBER_VERIFICATION_CODES
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
                ASSOCIATED_PHONE_NUMBERS -> Known.ASSOCIATED_PHONE_NUMBERS
                PHONE_NUMBER_VERIFICATION_CODES -> Known.PHONE_NUMBER_VERIFICATION_CODES
                else -> throw TelnyxInvalidDataException("Unknown AdditionalStep: $value")
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

        fun validate(): AdditionalStep = apply {
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

            return other is AdditionalStep && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The type of the phone number */
    class PhoneNumberType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val LANDLINE = of("landline")

            @JvmField val LOCAL = of("local")

            @JvmField val MOBILE = of("mobile")

            @JvmField val NATIONAL = of("national")

            @JvmField val SHARED_COST = of("shared_cost")

            @JvmField val TOLL_FREE = of("toll_free")

            @JvmStatic fun of(value: String) = PhoneNumberType(JsonField.of(value))
        }

        /** An enum containing [PhoneNumberType]'s known values. */
        enum class Known {
            LANDLINE,
            LOCAL,
            MOBILE,
            NATIONAL,
            SHARED_COST,
            TOLL_FREE,
        }

        /**
         * An enum containing [PhoneNumberType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PhoneNumberType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            LANDLINE,
            LOCAL,
            MOBILE,
            NATIONAL,
            SHARED_COST,
            TOLL_FREE,
            /**
             * An enum member indicating that [PhoneNumberType] was instantiated with an unknown
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
                LANDLINE -> Value.LANDLINE
                LOCAL -> Value.LOCAL
                MOBILE -> Value.MOBILE
                NATIONAL -> Value.NATIONAL
                SHARED_COST -> Value.SHARED_COST
                TOLL_FREE -> Value.TOLL_FREE
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
                LANDLINE -> Known.LANDLINE
                LOCAL -> Known.LOCAL
                MOBILE -> Known.MOBILE
                NATIONAL -> Known.NATIONAL
                SHARED_COST -> Known.SHARED_COST
                TOLL_FREE -> Known.TOLL_FREE
                else -> throw TelnyxInvalidDataException("Unknown PhoneNumberType: $value")
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

        fun validate(): PhoneNumberType = apply {
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

            return other is PhoneNumberType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PortingOrder &&
            id == other.id &&
            activationSettings == other.activationSettings &&
            additionalSteps == other.additionalSteps &&
            createdAt == other.createdAt &&
            customerGroupReference == other.customerGroupReference &&
            customerReference == other.customerReference &&
            description == other.description &&
            documents == other.documents &&
            endUser == other.endUser &&
            messaging == other.messaging &&
            misc == other.misc &&
            oldServiceProviderOcn == other.oldServiceProviderOcn &&
            parentSupportKey == other.parentSupportKey &&
            phoneNumberConfiguration == other.phoneNumberConfiguration &&
            phoneNumberType == other.phoneNumberType &&
            portingPhoneNumbersCount == other.portingPhoneNumbersCount &&
            recordType == other.recordType &&
            requirements == other.requirements &&
            requirementsMet == other.requirementsMet &&
            status == other.status &&
            supportKey == other.supportKey &&
            updatedAt == other.updatedAt &&
            userFeedback == other.userFeedback &&
            userId == other.userId &&
            webhookUrl == other.webhookUrl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            activationSettings,
            additionalSteps,
            createdAt,
            customerGroupReference,
            customerReference,
            description,
            documents,
            endUser,
            messaging,
            misc,
            oldServiceProviderOcn,
            parentSupportKey,
            phoneNumberConfiguration,
            phoneNumberType,
            portingPhoneNumbersCount,
            recordType,
            requirements,
            requirementsMet,
            status,
            supportKey,
            updatedAt,
            userFeedback,
            userId,
            webhookUrl,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PortingOrder{id=$id, activationSettings=$activationSettings, additionalSteps=$additionalSteps, createdAt=$createdAt, customerGroupReference=$customerGroupReference, customerReference=$customerReference, description=$description, documents=$documents, endUser=$endUser, messaging=$messaging, misc=$misc, oldServiceProviderOcn=$oldServiceProviderOcn, parentSupportKey=$parentSupportKey, phoneNumberConfiguration=$phoneNumberConfiguration, phoneNumberType=$phoneNumberType, portingPhoneNumbersCount=$portingPhoneNumbersCount, recordType=$recordType, requirements=$requirements, requirementsMet=$requirementsMet, status=$status, supportKey=$supportKey, updatedAt=$updatedAt, userFeedback=$userFeedback, userId=$userId, webhookUrl=$webhookUrl, additionalProperties=$additionalProperties}"
}
