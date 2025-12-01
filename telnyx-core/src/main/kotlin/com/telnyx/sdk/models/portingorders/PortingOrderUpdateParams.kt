// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Edits the details of an existing porting order.
 *
 * Any or all of a porting orders attributes may be included in the resource object included in a
 * PATCH request.
 *
 * If a request does not include all of the attributes for a resource, the system will interpret the
 * missing attributes as if they were included with their current values. To explicitly set
 * something to null, it must be included in the request with a null value.
 */
class PortingOrderUpdateParams
private constructor(
    private val id: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun activationSettings(): Optional<ActivationSettings> = body.activationSettings()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customerGroupReference(): Optional<String> = body.customerGroupReference()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customerReference(): Optional<String> = body.customerReference()

    /**
     * Can be specified directly or via the `requirement_group_id` parameter.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun documents(): Optional<PortingOrderDocuments> = body.documents()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endUser(): Optional<PortingOrderEndUser> = body.endUser()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun messaging(): Optional<Messaging> = body.messaging()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun misc(): Optional<PortingOrderMisc> = body.misc()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneNumberConfiguration(): Optional<PortingOrderPhoneNumberConfiguration> =
        body.phoneNumberConfiguration()

    /**
     * If present, we will read the current values from the specified Requirement Group into the
     * Documents and Requirements for this Porting Order. Note that any future changes in the
     * Requirement Group would have no impact on this Porting Order. We will return an error if a
     * specified Requirement Group conflicts with documents or requirements in the same request.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun requirementGroupId(): Optional<String> = body.requirementGroupId()

    /**
     * List of requirements for porting numbers.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun requirements(): Optional<List<Requirement>> = body.requirements()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userFeedback(): Optional<PortingOrderUserFeedback> = body.userFeedback()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookUrl(): Optional<String> = body.webhookUrl()

    /**
     * Returns the raw JSON value of [activationSettings].
     *
     * Unlike [activationSettings], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _activationSettings(): JsonField<ActivationSettings> = body._activationSettings()

    /**
     * Returns the raw JSON value of [customerGroupReference].
     *
     * Unlike [customerGroupReference], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _customerGroupReference(): JsonField<String> = body._customerGroupReference()

    /**
     * Returns the raw JSON value of [customerReference].
     *
     * Unlike [customerReference], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _customerReference(): JsonField<String> = body._customerReference()

    /**
     * Returns the raw JSON value of [documents].
     *
     * Unlike [documents], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _documents(): JsonField<PortingOrderDocuments> = body._documents()

    /**
     * Returns the raw JSON value of [endUser].
     *
     * Unlike [endUser], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _endUser(): JsonField<PortingOrderEndUser> = body._endUser()

    /**
     * Returns the raw JSON value of [messaging].
     *
     * Unlike [messaging], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _messaging(): JsonField<Messaging> = body._messaging()

    /**
     * Returns the raw JSON value of [misc].
     *
     * Unlike [misc], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _misc(): JsonField<PortingOrderMisc> = body._misc()

    /**
     * Returns the raw JSON value of [phoneNumberConfiguration].
     *
     * Unlike [phoneNumberConfiguration], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _phoneNumberConfiguration(): JsonField<PortingOrderPhoneNumberConfiguration> =
        body._phoneNumberConfiguration()

    /**
     * Returns the raw JSON value of [requirementGroupId].
     *
     * Unlike [requirementGroupId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _requirementGroupId(): JsonField<String> = body._requirementGroupId()

    /**
     * Returns the raw JSON value of [requirements].
     *
     * Unlike [requirements], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _requirements(): JsonField<List<Requirement>> = body._requirements()

    /**
     * Returns the raw JSON value of [userFeedback].
     *
     * Unlike [userFeedback], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _userFeedback(): JsonField<PortingOrderUserFeedback> = body._userFeedback()

    /**
     * Returns the raw JSON value of [webhookUrl].
     *
     * Unlike [webhookUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _webhookUrl(): JsonField<String> = body._webhookUrl()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): PortingOrderUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [PortingOrderUpdateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PortingOrderUpdateParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(portingOrderUpdateParams: PortingOrderUpdateParams) = apply {
            id = portingOrderUpdateParams.id
            body = portingOrderUpdateParams.body.toBuilder()
            additionalHeaders = portingOrderUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = portingOrderUpdateParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [activationSettings]
         * - [customerGroupReference]
         * - [customerReference]
         * - [documents]
         * - [endUser]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun activationSettings(activationSettings: ActivationSettings) = apply {
            body.activationSettings(activationSettings)
        }

        /**
         * Sets [Builder.activationSettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.activationSettings] with a well-typed
         * [ActivationSettings] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun activationSettings(activationSettings: JsonField<ActivationSettings>) = apply {
            body.activationSettings(activationSettings)
        }

        fun customerGroupReference(customerGroupReference: String) = apply {
            body.customerGroupReference(customerGroupReference)
        }

        /**
         * Sets [Builder.customerGroupReference] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerGroupReference] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customerGroupReference(customerGroupReference: JsonField<String>) = apply {
            body.customerGroupReference(customerGroupReference)
        }

        fun customerReference(customerReference: String) = apply {
            body.customerReference(customerReference)
        }

        /**
         * Sets [Builder.customerReference] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerReference] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customerReference(customerReference: JsonField<String>) = apply {
            body.customerReference(customerReference)
        }

        /** Can be specified directly or via the `requirement_group_id` parameter. */
        fun documents(documents: PortingOrderDocuments) = apply { body.documents(documents) }

        /**
         * Sets [Builder.documents] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documents] with a well-typed [PortingOrderDocuments]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun documents(documents: JsonField<PortingOrderDocuments>) = apply {
            body.documents(documents)
        }

        fun endUser(endUser: PortingOrderEndUser) = apply { body.endUser(endUser) }

        /**
         * Sets [Builder.endUser] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endUser] with a well-typed [PortingOrderEndUser] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endUser(endUser: JsonField<PortingOrderEndUser>) = apply { body.endUser(endUser) }

        fun messaging(messaging: Messaging) = apply { body.messaging(messaging) }

        /**
         * Sets [Builder.messaging] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messaging] with a well-typed [Messaging] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun messaging(messaging: JsonField<Messaging>) = apply { body.messaging(messaging) }

        fun misc(misc: PortingOrderMisc?) = apply { body.misc(misc) }

        /** Alias for calling [Builder.misc] with `misc.orElse(null)`. */
        fun misc(misc: Optional<PortingOrderMisc>) = misc(misc.getOrNull())

        /**
         * Sets [Builder.misc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.misc] with a well-typed [PortingOrderMisc] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun misc(misc: JsonField<PortingOrderMisc>) = apply { body.misc(misc) }

        fun phoneNumberConfiguration(
            phoneNumberConfiguration: PortingOrderPhoneNumberConfiguration
        ) = apply { body.phoneNumberConfiguration(phoneNumberConfiguration) }

        /**
         * Sets [Builder.phoneNumberConfiguration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumberConfiguration] with a well-typed
         * [PortingOrderPhoneNumberConfiguration] value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun phoneNumberConfiguration(
            phoneNumberConfiguration: JsonField<PortingOrderPhoneNumberConfiguration>
        ) = apply { body.phoneNumberConfiguration(phoneNumberConfiguration) }

        /**
         * If present, we will read the current values from the specified Requirement Group into the
         * Documents and Requirements for this Porting Order. Note that any future changes in the
         * Requirement Group would have no impact on this Porting Order. We will return an error if
         * a specified Requirement Group conflicts with documents or requirements in the same
         * request.
         */
        fun requirementGroupId(requirementGroupId: String) = apply {
            body.requirementGroupId(requirementGroupId)
        }

        /**
         * Sets [Builder.requirementGroupId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requirementGroupId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun requirementGroupId(requirementGroupId: JsonField<String>) = apply {
            body.requirementGroupId(requirementGroupId)
        }

        /** List of requirements for porting numbers. */
        fun requirements(requirements: List<Requirement>) = apply {
            body.requirements(requirements)
        }

        /**
         * Sets [Builder.requirements] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requirements] with a well-typed `List<Requirement>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun requirements(requirements: JsonField<List<Requirement>>) = apply {
            body.requirements(requirements)
        }

        /**
         * Adds a single [Requirement] to [requirements].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRequirement(requirement: Requirement) = apply { body.addRequirement(requirement) }

        fun userFeedback(userFeedback: PortingOrderUserFeedback) = apply {
            body.userFeedback(userFeedback)
        }

        /**
         * Sets [Builder.userFeedback] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userFeedback] with a well-typed
         * [PortingOrderUserFeedback] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun userFeedback(userFeedback: JsonField<PortingOrderUserFeedback>) = apply {
            body.userFeedback(userFeedback)
        }

        fun webhookUrl(webhookUrl: String) = apply { body.webhookUrl(webhookUrl) }

        /**
         * Sets [Builder.webhookUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun webhookUrl(webhookUrl: JsonField<String>) = apply { body.webhookUrl(webhookUrl) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [PortingOrderUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PortingOrderUpdateParams =
            PortingOrderUpdateParams(
                id,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val activationSettings: JsonField<ActivationSettings>,
        private val customerGroupReference: JsonField<String>,
        private val customerReference: JsonField<String>,
        private val documents: JsonField<PortingOrderDocuments>,
        private val endUser: JsonField<PortingOrderEndUser>,
        private val messaging: JsonField<Messaging>,
        private val misc: JsonField<PortingOrderMisc>,
        private val phoneNumberConfiguration: JsonField<PortingOrderPhoneNumberConfiguration>,
        private val requirementGroupId: JsonField<String>,
        private val requirements: JsonField<List<Requirement>>,
        private val userFeedback: JsonField<PortingOrderUserFeedback>,
        private val webhookUrl: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("activation_settings")
            @ExcludeMissing
            activationSettings: JsonField<ActivationSettings> = JsonMissing.of(),
            @JsonProperty("customer_group_reference")
            @ExcludeMissing
            customerGroupReference: JsonField<String> = JsonMissing.of(),
            @JsonProperty("customer_reference")
            @ExcludeMissing
            customerReference: JsonField<String> = JsonMissing.of(),
            @JsonProperty("documents")
            @ExcludeMissing
            documents: JsonField<PortingOrderDocuments> = JsonMissing.of(),
            @JsonProperty("end_user")
            @ExcludeMissing
            endUser: JsonField<PortingOrderEndUser> = JsonMissing.of(),
            @JsonProperty("messaging")
            @ExcludeMissing
            messaging: JsonField<Messaging> = JsonMissing.of(),
            @JsonProperty("misc")
            @ExcludeMissing
            misc: JsonField<PortingOrderMisc> = JsonMissing.of(),
            @JsonProperty("phone_number_configuration")
            @ExcludeMissing
            phoneNumberConfiguration: JsonField<PortingOrderPhoneNumberConfiguration> =
                JsonMissing.of(),
            @JsonProperty("requirement_group_id")
            @ExcludeMissing
            requirementGroupId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("requirements")
            @ExcludeMissing
            requirements: JsonField<List<Requirement>> = JsonMissing.of(),
            @JsonProperty("user_feedback")
            @ExcludeMissing
            userFeedback: JsonField<PortingOrderUserFeedback> = JsonMissing.of(),
            @JsonProperty("webhook_url")
            @ExcludeMissing
            webhookUrl: JsonField<String> = JsonMissing.of(),
        ) : this(
            activationSettings,
            customerGroupReference,
            customerReference,
            documents,
            endUser,
            messaging,
            misc,
            phoneNumberConfiguration,
            requirementGroupId,
            requirements,
            userFeedback,
            webhookUrl,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun activationSettings(): Optional<ActivationSettings> =
            activationSettings.getOptional("activation_settings")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customerGroupReference(): Optional<String> =
            customerGroupReference.getOptional("customer_group_reference")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customerReference(): Optional<String> =
            customerReference.getOptional("customer_reference")

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
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun messaging(): Optional<Messaging> = messaging.getOptional("messaging")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun misc(): Optional<PortingOrderMisc> = misc.getOptional("misc")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumberConfiguration(): Optional<PortingOrderPhoneNumberConfiguration> =
            phoneNumberConfiguration.getOptional("phone_number_configuration")

        /**
         * If present, we will read the current values from the specified Requirement Group into the
         * Documents and Requirements for this Porting Order. Note that any future changes in the
         * Requirement Group would have no impact on this Porting Order. We will return an error if
         * a specified Requirement Group conflicts with documents or requirements in the same
         * request.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun requirementGroupId(): Optional<String> =
            requirementGroupId.getOptional("requirement_group_id")

        /**
         * List of requirements for porting numbers.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun requirements(): Optional<List<Requirement>> = requirements.getOptional("requirements")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun userFeedback(): Optional<PortingOrderUserFeedback> =
            userFeedback.getOptional("user_feedback")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun webhookUrl(): Optional<String> = webhookUrl.getOptional("webhook_url")

        /**
         * Returns the raw JSON value of [activationSettings].
         *
         * Unlike [activationSettings], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("activation_settings")
        @ExcludeMissing
        fun _activationSettings(): JsonField<ActivationSettings> = activationSettings

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
        fun _messaging(): JsonField<Messaging> = messaging

        /**
         * Returns the raw JSON value of [misc].
         *
         * Unlike [misc], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("misc") @ExcludeMissing fun _misc(): JsonField<PortingOrderMisc> = misc

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
         * Returns the raw JSON value of [requirementGroupId].
         *
         * Unlike [requirementGroupId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("requirement_group_id")
        @ExcludeMissing
        fun _requirementGroupId(): JsonField<String> = requirementGroupId

        /**
         * Returns the raw JSON value of [requirements].
         *
         * Unlike [requirements], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("requirements")
        @ExcludeMissing
        fun _requirements(): JsonField<List<Requirement>> = requirements

        /**
         * Returns the raw JSON value of [userFeedback].
         *
         * Unlike [userFeedback], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("user_feedback")
        @ExcludeMissing
        fun _userFeedback(): JsonField<PortingOrderUserFeedback> = userFeedback

        /**
         * Returns the raw JSON value of [webhookUrl].
         *
         * Unlike [webhookUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("webhook_url")
        @ExcludeMissing
        fun _webhookUrl(): JsonField<String> = webhookUrl

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var activationSettings: JsonField<ActivationSettings> = JsonMissing.of()
            private var customerGroupReference: JsonField<String> = JsonMissing.of()
            private var customerReference: JsonField<String> = JsonMissing.of()
            private var documents: JsonField<PortingOrderDocuments> = JsonMissing.of()
            private var endUser: JsonField<PortingOrderEndUser> = JsonMissing.of()
            private var messaging: JsonField<Messaging> = JsonMissing.of()
            private var misc: JsonField<PortingOrderMisc> = JsonMissing.of()
            private var phoneNumberConfiguration: JsonField<PortingOrderPhoneNumberConfiguration> =
                JsonMissing.of()
            private var requirementGroupId: JsonField<String> = JsonMissing.of()
            private var requirements: JsonField<MutableList<Requirement>>? = null
            private var userFeedback: JsonField<PortingOrderUserFeedback> = JsonMissing.of()
            private var webhookUrl: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                activationSettings = body.activationSettings
                customerGroupReference = body.customerGroupReference
                customerReference = body.customerReference
                documents = body.documents
                endUser = body.endUser
                messaging = body.messaging
                misc = body.misc
                phoneNumberConfiguration = body.phoneNumberConfiguration
                requirementGroupId = body.requirementGroupId
                requirements = body.requirements.map { it.toMutableList() }
                userFeedback = body.userFeedback
                webhookUrl = body.webhookUrl
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun activationSettings(activationSettings: ActivationSettings) =
                activationSettings(JsonField.of(activationSettings))

            /**
             * Sets [Builder.activationSettings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.activationSettings] with a well-typed
             * [ActivationSettings] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun activationSettings(activationSettings: JsonField<ActivationSettings>) = apply {
                this.activationSettings = activationSettings
            }

            fun customerGroupReference(customerGroupReference: String) =
                customerGroupReference(JsonField.of(customerGroupReference))

            /**
             * Sets [Builder.customerGroupReference] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerGroupReference] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun customerGroupReference(customerGroupReference: JsonField<String>) = apply {
                this.customerGroupReference = customerGroupReference
            }

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

            /** Can be specified directly or via the `requirement_group_id` parameter. */
            fun documents(documents: PortingOrderDocuments) = documents(JsonField.of(documents))

            /**
             * Sets [Builder.documents] to an arbitrary JSON value.
             *
             * You should usually call [Builder.documents] with a well-typed [PortingOrderDocuments]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun documents(documents: JsonField<PortingOrderDocuments>) = apply {
                this.documents = documents
            }

            fun endUser(endUser: PortingOrderEndUser) = endUser(JsonField.of(endUser))

            /**
             * Sets [Builder.endUser] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endUser] with a well-typed [PortingOrderEndUser]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun endUser(endUser: JsonField<PortingOrderEndUser>) = apply { this.endUser = endUser }

            fun messaging(messaging: Messaging) = messaging(JsonField.of(messaging))

            /**
             * Sets [Builder.messaging] to an arbitrary JSON value.
             *
             * You should usually call [Builder.messaging] with a well-typed [Messaging] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun messaging(messaging: JsonField<Messaging>) = apply { this.messaging = messaging }

            fun misc(misc: PortingOrderMisc?) = misc(JsonField.ofNullable(misc))

            /** Alias for calling [Builder.misc] with `misc.orElse(null)`. */
            fun misc(misc: Optional<PortingOrderMisc>) = misc(misc.getOrNull())

            /**
             * Sets [Builder.misc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.misc] with a well-typed [PortingOrderMisc] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun misc(misc: JsonField<PortingOrderMisc>) = apply { this.misc = misc }

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

            /**
             * If present, we will read the current values from the specified Requirement Group into
             * the Documents and Requirements for this Porting Order. Note that any future changes
             * in the Requirement Group would have no impact on this Porting Order. We will return
             * an error if a specified Requirement Group conflicts with documents or requirements in
             * the same request.
             */
            fun requirementGroupId(requirementGroupId: String) =
                requirementGroupId(JsonField.of(requirementGroupId))

            /**
             * Sets [Builder.requirementGroupId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requirementGroupId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun requirementGroupId(requirementGroupId: JsonField<String>) = apply {
                this.requirementGroupId = requirementGroupId
            }

            /** List of requirements for porting numbers. */
            fun requirements(requirements: List<Requirement>) =
                requirements(JsonField.of(requirements))

            /**
             * Sets [Builder.requirements] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requirements] with a well-typed `List<Requirement>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun requirements(requirements: JsonField<List<Requirement>>) = apply {
                this.requirements = requirements.map { it.toMutableList() }
            }

            /**
             * Adds a single [Requirement] to [requirements].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRequirement(requirement: Requirement) = apply {
                requirements =
                    (requirements ?: JsonField.of(mutableListOf())).also {
                        checkKnown("requirements", it).add(requirement)
                    }
            }

            fun userFeedback(userFeedback: PortingOrderUserFeedback) =
                userFeedback(JsonField.of(userFeedback))

            /**
             * Sets [Builder.userFeedback] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userFeedback] with a well-typed
             * [PortingOrderUserFeedback] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun userFeedback(userFeedback: JsonField<PortingOrderUserFeedback>) = apply {
                this.userFeedback = userFeedback
            }

            fun webhookUrl(webhookUrl: String) = webhookUrl(JsonField.of(webhookUrl))

            /**
             * Sets [Builder.webhookUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhookUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    activationSettings,
                    customerGroupReference,
                    customerReference,
                    documents,
                    endUser,
                    messaging,
                    misc,
                    phoneNumberConfiguration,
                    requirementGroupId,
                    (requirements ?: JsonMissing.of()).map { it.toImmutable() },
                    userFeedback,
                    webhookUrl,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            activationSettings().ifPresent { it.validate() }
            customerGroupReference()
            customerReference()
            documents().ifPresent { it.validate() }
            endUser().ifPresent { it.validate() }
            messaging().ifPresent { it.validate() }
            misc().ifPresent { it.validate() }
            phoneNumberConfiguration().ifPresent { it.validate() }
            requirementGroupId()
            requirements().ifPresent { it.forEach { it.validate() } }
            userFeedback().ifPresent { it.validate() }
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (activationSettings.asKnown().getOrNull()?.validity() ?: 0) +
                (if (customerGroupReference.asKnown().isPresent) 1 else 0) +
                (if (customerReference.asKnown().isPresent) 1 else 0) +
                (documents.asKnown().getOrNull()?.validity() ?: 0) +
                (endUser.asKnown().getOrNull()?.validity() ?: 0) +
                (messaging.asKnown().getOrNull()?.validity() ?: 0) +
                (misc.asKnown().getOrNull()?.validity() ?: 0) +
                (phoneNumberConfiguration.asKnown().getOrNull()?.validity() ?: 0) +
                (if (requirementGroupId.asKnown().isPresent) 1 else 0) +
                (requirements.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (userFeedback.asKnown().getOrNull()?.validity() ?: 0) +
                (if (webhookUrl.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                activationSettings == other.activationSettings &&
                customerGroupReference == other.customerGroupReference &&
                customerReference == other.customerReference &&
                documents == other.documents &&
                endUser == other.endUser &&
                messaging == other.messaging &&
                misc == other.misc &&
                phoneNumberConfiguration == other.phoneNumberConfiguration &&
                requirementGroupId == other.requirementGroupId &&
                requirements == other.requirements &&
                userFeedback == other.userFeedback &&
                webhookUrl == other.webhookUrl &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                activationSettings,
                customerGroupReference,
                customerReference,
                documents,
                endUser,
                messaging,
                misc,
                phoneNumberConfiguration,
                requirementGroupId,
                requirements,
                userFeedback,
                webhookUrl,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{activationSettings=$activationSettings, customerGroupReference=$customerGroupReference, customerReference=$customerReference, documents=$documents, endUser=$endUser, messaging=$messaging, misc=$misc, phoneNumberConfiguration=$phoneNumberConfiguration, requirementGroupId=$requirementGroupId, requirements=$requirements, userFeedback=$userFeedback, webhookUrl=$webhookUrl, additionalProperties=$additionalProperties}"
    }

    class ActivationSettings
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val focDatetimeRequested: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("foc_datetime_requested")
            @ExcludeMissing
            focDatetimeRequested: JsonField<OffsetDateTime> = JsonMissing.of()
        ) : this(focDatetimeRequested, mutableMapOf())

        /**
         * ISO 8601 formatted Date/Time requested for the FOC date
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun focDatetimeRequested(): Optional<OffsetDateTime> =
            focDatetimeRequested.getOptional("foc_datetime_requested")

        /**
         * Returns the raw JSON value of [focDatetimeRequested].
         *
         * Unlike [focDatetimeRequested], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("foc_datetime_requested")
        @ExcludeMissing
        fun _focDatetimeRequested(): JsonField<OffsetDateTime> = focDatetimeRequested

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

            /** Returns a mutable builder for constructing an instance of [ActivationSettings]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ActivationSettings]. */
        class Builder internal constructor() {

            private var focDatetimeRequested: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(activationSettings: ActivationSettings) = apply {
                focDatetimeRequested = activationSettings.focDatetimeRequested
                additionalProperties = activationSettings.additionalProperties.toMutableMap()
            }

            /** ISO 8601 formatted Date/Time requested for the FOC date */
            fun focDatetimeRequested(focDatetimeRequested: OffsetDateTime) =
                focDatetimeRequested(JsonField.of(focDatetimeRequested))

            /**
             * Sets [Builder.focDatetimeRequested] to an arbitrary JSON value.
             *
             * You should usually call [Builder.focDatetimeRequested] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun focDatetimeRequested(focDatetimeRequested: JsonField<OffsetDateTime>) = apply {
                this.focDatetimeRequested = focDatetimeRequested
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
             * Returns an immutable instance of [ActivationSettings].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ActivationSettings =
                ActivationSettings(focDatetimeRequested, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): ActivationSettings = apply {
            if (validated) {
                return@apply
            }

            focDatetimeRequested()
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
        @JvmSynthetic
        internal fun validity(): Int = (if (focDatetimeRequested.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ActivationSettings &&
                focDatetimeRequested == other.focDatetimeRequested &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(focDatetimeRequested, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ActivationSettings{focDatetimeRequested=$focDatetimeRequested, additionalProperties=$additionalProperties}"
    }

    class Messaging
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val enableMessaging: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("enable_messaging")
            @ExcludeMissing
            enableMessaging: JsonField<Boolean> = JsonMissing.of()
        ) : this(enableMessaging, mutableMapOf())

        /**
         * Indicates whether Telnyx will port messaging capabilities from the losing carrier. If
         * false, any messaging capabilities will stay with their current provider.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun enableMessaging(): Optional<Boolean> = enableMessaging.getOptional("enable_messaging")

        /**
         * Returns the raw JSON value of [enableMessaging].
         *
         * Unlike [enableMessaging], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("enable_messaging")
        @ExcludeMissing
        fun _enableMessaging(): JsonField<Boolean> = enableMessaging

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

            /** Returns a mutable builder for constructing an instance of [Messaging]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Messaging]. */
        class Builder internal constructor() {

            private var enableMessaging: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(messaging: Messaging) = apply {
                enableMessaging = messaging.enableMessaging
                additionalProperties = messaging.additionalProperties.toMutableMap()
            }

            /**
             * Indicates whether Telnyx will port messaging capabilities from the losing carrier. If
             * false, any messaging capabilities will stay with their current provider.
             */
            fun enableMessaging(enableMessaging: Boolean) =
                enableMessaging(JsonField.of(enableMessaging))

            /**
             * Sets [Builder.enableMessaging] to an arbitrary JSON value.
             *
             * You should usually call [Builder.enableMessaging] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun enableMessaging(enableMessaging: JsonField<Boolean>) = apply {
                this.enableMessaging = enableMessaging
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
             * Returns an immutable instance of [Messaging].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Messaging = Messaging(enableMessaging, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Messaging = apply {
            if (validated) {
                return@apply
            }

            enableMessaging()
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
        @JvmSynthetic
        internal fun validity(): Int = (if (enableMessaging.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Messaging &&
                enableMessaging == other.enableMessaging &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(enableMessaging, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Messaging{enableMessaging=$enableMessaging, additionalProperties=$additionalProperties}"
    }

    /** Specifies a value for a requirement on the Porting Order. */
    class Requirement
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val fieldValue: JsonField<String>,
        private val requirementTypeId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("field_value")
            @ExcludeMissing
            fieldValue: JsonField<String> = JsonMissing.of(),
            @JsonProperty("requirement_type_id")
            @ExcludeMissing
            requirementTypeId: JsonField<String> = JsonMissing.of(),
        ) : this(fieldValue, requirementTypeId, mutableMapOf())

        /**
         * identifies the document or provides the text value that satisfies this requirement
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun fieldValue(): String = fieldValue.getRequired("field_value")

        /**
         * Identifies the requirement type that the `field_value` fulfills
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun requirementTypeId(): String = requirementTypeId.getRequired("requirement_type_id")

        /**
         * Returns the raw JSON value of [fieldValue].
         *
         * Unlike [fieldValue], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("field_value")
        @ExcludeMissing
        fun _fieldValue(): JsonField<String> = fieldValue

        /**
         * Returns the raw JSON value of [requirementTypeId].
         *
         * Unlike [requirementTypeId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("requirement_type_id")
        @ExcludeMissing
        fun _requirementTypeId(): JsonField<String> = requirementTypeId

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
             * Returns a mutable builder for constructing an instance of [Requirement].
             *
             * The following fields are required:
             * ```java
             * .fieldValue()
             * .requirementTypeId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Requirement]. */
        class Builder internal constructor() {

            private var fieldValue: JsonField<String>? = null
            private var requirementTypeId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(requirement: Requirement) = apply {
                fieldValue = requirement.fieldValue
                requirementTypeId = requirement.requirementTypeId
                additionalProperties = requirement.additionalProperties.toMutableMap()
            }

            /**
             * identifies the document or provides the text value that satisfies this requirement
             */
            fun fieldValue(fieldValue: String) = fieldValue(JsonField.of(fieldValue))

            /**
             * Sets [Builder.fieldValue] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fieldValue] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fieldValue(fieldValue: JsonField<String>) = apply { this.fieldValue = fieldValue }

            /** Identifies the requirement type that the `field_value` fulfills */
            fun requirementTypeId(requirementTypeId: String) =
                requirementTypeId(JsonField.of(requirementTypeId))

            /**
             * Sets [Builder.requirementTypeId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requirementTypeId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun requirementTypeId(requirementTypeId: JsonField<String>) = apply {
                this.requirementTypeId = requirementTypeId
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
             * Returns an immutable instance of [Requirement].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .fieldValue()
             * .requirementTypeId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Requirement =
                Requirement(
                    checkRequired("fieldValue", fieldValue),
                    checkRequired("requirementTypeId", requirementTypeId),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Requirement = apply {
            if (validated) {
                return@apply
            }

            fieldValue()
            requirementTypeId()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (fieldValue.asKnown().isPresent) 1 else 0) +
                (if (requirementTypeId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Requirement &&
                fieldValue == other.fieldValue &&
                requirementTypeId == other.requirementTypeId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(fieldValue, requirementTypeId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Requirement{fieldValue=$fieldValue, requirementTypeId=$requirementTypeId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PortingOrderUpdateParams &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PortingOrderUpdateParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
