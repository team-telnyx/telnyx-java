// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.campaign

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Update a campaign's properties by `campaignId`. **Please note:** only sample messages are
 * editable.
 */
class CampaignUpdateParams
private constructor(
    private val campaignId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun campaignId(): Optional<String> = Optional.ofNullable(campaignId)

    /**
     * Help message of the campaign.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun autoRenewal(): Optional<Boolean> = body.autoRenewal()

    /**
     * Help message of the campaign.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun helpMessage(): Optional<String> = body.helpMessage()

    /**
     * Message flow description.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun messageFlow(): Optional<String> = body.messageFlow()

    /**
     * Alphanumeric identifier of the reseller that you want to associate with this campaign.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun resellerId(): Optional<String> = body.resellerId()

    /**
     * Message sample. Some campaign tiers require 1 or more message samples.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sample1(): Optional<String> = body.sample1()

    /**
     * Message sample. Some campaign tiers require 2 or more message samples.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sample2(): Optional<String> = body.sample2()

    /**
     * Message sample. Some campaign tiers require 3 or more message samples.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sample3(): Optional<String> = body.sample3()

    /**
     * Message sample. Some campaign tiers require 4 or more message samples.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sample4(): Optional<String> = body.sample4()

    /**
     * Message sample. Some campaign tiers require 5 or more message samples.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sample5(): Optional<String> = body.sample5()

    /**
     * Webhook failover to which campaign status updates are sent.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookFailoverUrl(): Optional<String> = body.webhookFailoverUrl()

    /**
     * Webhook to which campaign status updates are sent.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookUrl(): Optional<String> = body.webhookUrl()

    /**
     * Returns the raw JSON value of [autoRenewal].
     *
     * Unlike [autoRenewal], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _autoRenewal(): JsonField<Boolean> = body._autoRenewal()

    /**
     * Returns the raw JSON value of [helpMessage].
     *
     * Unlike [helpMessage], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _helpMessage(): JsonField<String> = body._helpMessage()

    /**
     * Returns the raw JSON value of [messageFlow].
     *
     * Unlike [messageFlow], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _messageFlow(): JsonField<String> = body._messageFlow()

    /**
     * Returns the raw JSON value of [resellerId].
     *
     * Unlike [resellerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _resellerId(): JsonField<String> = body._resellerId()

    /**
     * Returns the raw JSON value of [sample1].
     *
     * Unlike [sample1], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sample1(): JsonField<String> = body._sample1()

    /**
     * Returns the raw JSON value of [sample2].
     *
     * Unlike [sample2], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sample2(): JsonField<String> = body._sample2()

    /**
     * Returns the raw JSON value of [sample3].
     *
     * Unlike [sample3], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sample3(): JsonField<String> = body._sample3()

    /**
     * Returns the raw JSON value of [sample4].
     *
     * Unlike [sample4], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sample4(): JsonField<String> = body._sample4()

    /**
     * Returns the raw JSON value of [sample5].
     *
     * Unlike [sample5], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sample5(): JsonField<String> = body._sample5()

    /**
     * Returns the raw JSON value of [webhookFailoverUrl].
     *
     * Unlike [webhookFailoverUrl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _webhookFailoverUrl(): JsonField<String> = body._webhookFailoverUrl()

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

        @JvmStatic fun none(): CampaignUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [CampaignUpdateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CampaignUpdateParams]. */
    class Builder internal constructor() {

        private var campaignId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(campaignUpdateParams: CampaignUpdateParams) = apply {
            campaignId = campaignUpdateParams.campaignId
            body = campaignUpdateParams.body.toBuilder()
            additionalHeaders = campaignUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = campaignUpdateParams.additionalQueryParams.toBuilder()
        }

        fun campaignId(campaignId: String?) = apply { this.campaignId = campaignId }

        /** Alias for calling [Builder.campaignId] with `campaignId.orElse(null)`. */
        fun campaignId(campaignId: Optional<String>) = campaignId(campaignId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [autoRenewal]
         * - [helpMessage]
         * - [messageFlow]
         * - [resellerId]
         * - [sample1]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Help message of the campaign. */
        fun autoRenewal(autoRenewal: Boolean) = apply { body.autoRenewal(autoRenewal) }

        /**
         * Sets [Builder.autoRenewal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.autoRenewal] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun autoRenewal(autoRenewal: JsonField<Boolean>) = apply { body.autoRenewal(autoRenewal) }

        /** Help message of the campaign. */
        fun helpMessage(helpMessage: String) = apply { body.helpMessage(helpMessage) }

        /**
         * Sets [Builder.helpMessage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.helpMessage] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun helpMessage(helpMessage: JsonField<String>) = apply { body.helpMessage(helpMessage) }

        /** Message flow description. */
        fun messageFlow(messageFlow: String) = apply { body.messageFlow(messageFlow) }

        /**
         * Sets [Builder.messageFlow] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messageFlow] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun messageFlow(messageFlow: JsonField<String>) = apply { body.messageFlow(messageFlow) }

        /**
         * Alphanumeric identifier of the reseller that you want to associate with this campaign.
         */
        fun resellerId(resellerId: String) = apply { body.resellerId(resellerId) }

        /**
         * Sets [Builder.resellerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resellerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun resellerId(resellerId: JsonField<String>) = apply { body.resellerId(resellerId) }

        /** Message sample. Some campaign tiers require 1 or more message samples. */
        fun sample1(sample1: String) = apply { body.sample1(sample1) }

        /**
         * Sets [Builder.sample1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sample1] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sample1(sample1: JsonField<String>) = apply { body.sample1(sample1) }

        /** Message sample. Some campaign tiers require 2 or more message samples. */
        fun sample2(sample2: String) = apply { body.sample2(sample2) }

        /**
         * Sets [Builder.sample2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sample2] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sample2(sample2: JsonField<String>) = apply { body.sample2(sample2) }

        /** Message sample. Some campaign tiers require 3 or more message samples. */
        fun sample3(sample3: String) = apply { body.sample3(sample3) }

        /**
         * Sets [Builder.sample3] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sample3] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sample3(sample3: JsonField<String>) = apply { body.sample3(sample3) }

        /** Message sample. Some campaign tiers require 4 or more message samples. */
        fun sample4(sample4: String) = apply { body.sample4(sample4) }

        /**
         * Sets [Builder.sample4] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sample4] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sample4(sample4: JsonField<String>) = apply { body.sample4(sample4) }

        /** Message sample. Some campaign tiers require 5 or more message samples. */
        fun sample5(sample5: String) = apply { body.sample5(sample5) }

        /**
         * Sets [Builder.sample5] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sample5] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sample5(sample5: JsonField<String>) = apply { body.sample5(sample5) }

        /** Webhook failover to which campaign status updates are sent. */
        fun webhookFailoverUrl(webhookFailoverUrl: String) = apply {
            body.webhookFailoverUrl(webhookFailoverUrl)
        }

        /**
         * Sets [Builder.webhookFailoverUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookFailoverUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun webhookFailoverUrl(webhookFailoverUrl: JsonField<String>) = apply {
            body.webhookFailoverUrl(webhookFailoverUrl)
        }

        /** Webhook to which campaign status updates are sent. */
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
         * Returns an immutable instance of [CampaignUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CampaignUpdateParams =
            CampaignUpdateParams(
                campaignId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> campaignId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val autoRenewal: JsonField<Boolean>,
        private val helpMessage: JsonField<String>,
        private val messageFlow: JsonField<String>,
        private val resellerId: JsonField<String>,
        private val sample1: JsonField<String>,
        private val sample2: JsonField<String>,
        private val sample3: JsonField<String>,
        private val sample4: JsonField<String>,
        private val sample5: JsonField<String>,
        private val webhookFailoverUrl: JsonField<String>,
        private val webhookUrl: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("autoRenewal")
            @ExcludeMissing
            autoRenewal: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("helpMessage")
            @ExcludeMissing
            helpMessage: JsonField<String> = JsonMissing.of(),
            @JsonProperty("messageFlow")
            @ExcludeMissing
            messageFlow: JsonField<String> = JsonMissing.of(),
            @JsonProperty("resellerId")
            @ExcludeMissing
            resellerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sample1") @ExcludeMissing sample1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sample2") @ExcludeMissing sample2: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sample3") @ExcludeMissing sample3: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sample4") @ExcludeMissing sample4: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sample5") @ExcludeMissing sample5: JsonField<String> = JsonMissing.of(),
            @JsonProperty("webhookFailoverURL")
            @ExcludeMissing
            webhookFailoverUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("webhookURL")
            @ExcludeMissing
            webhookUrl: JsonField<String> = JsonMissing.of(),
        ) : this(
            autoRenewal,
            helpMessage,
            messageFlow,
            resellerId,
            sample1,
            sample2,
            sample3,
            sample4,
            sample5,
            webhookFailoverUrl,
            webhookUrl,
            mutableMapOf(),
        )

        /**
         * Help message of the campaign.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun autoRenewal(): Optional<Boolean> = autoRenewal.getOptional("autoRenewal")

        /**
         * Help message of the campaign.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun helpMessage(): Optional<String> = helpMessage.getOptional("helpMessage")

        /**
         * Message flow description.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun messageFlow(): Optional<String> = messageFlow.getOptional("messageFlow")

        /**
         * Alphanumeric identifier of the reseller that you want to associate with this campaign.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun resellerId(): Optional<String> = resellerId.getOptional("resellerId")

        /**
         * Message sample. Some campaign tiers require 1 or more message samples.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sample1(): Optional<String> = sample1.getOptional("sample1")

        /**
         * Message sample. Some campaign tiers require 2 or more message samples.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sample2(): Optional<String> = sample2.getOptional("sample2")

        /**
         * Message sample. Some campaign tiers require 3 or more message samples.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sample3(): Optional<String> = sample3.getOptional("sample3")

        /**
         * Message sample. Some campaign tiers require 4 or more message samples.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sample4(): Optional<String> = sample4.getOptional("sample4")

        /**
         * Message sample. Some campaign tiers require 5 or more message samples.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sample5(): Optional<String> = sample5.getOptional("sample5")

        /**
         * Webhook failover to which campaign status updates are sent.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun webhookFailoverUrl(): Optional<String> =
            webhookFailoverUrl.getOptional("webhookFailoverURL")

        /**
         * Webhook to which campaign status updates are sent.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun webhookUrl(): Optional<String> = webhookUrl.getOptional("webhookURL")

        /**
         * Returns the raw JSON value of [autoRenewal].
         *
         * Unlike [autoRenewal], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("autoRenewal")
        @ExcludeMissing
        fun _autoRenewal(): JsonField<Boolean> = autoRenewal

        /**
         * Returns the raw JSON value of [helpMessage].
         *
         * Unlike [helpMessage], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("helpMessage")
        @ExcludeMissing
        fun _helpMessage(): JsonField<String> = helpMessage

        /**
         * Returns the raw JSON value of [messageFlow].
         *
         * Unlike [messageFlow], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("messageFlow")
        @ExcludeMissing
        fun _messageFlow(): JsonField<String> = messageFlow

        /**
         * Returns the raw JSON value of [resellerId].
         *
         * Unlike [resellerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("resellerId")
        @ExcludeMissing
        fun _resellerId(): JsonField<String> = resellerId

        /**
         * Returns the raw JSON value of [sample1].
         *
         * Unlike [sample1], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sample1") @ExcludeMissing fun _sample1(): JsonField<String> = sample1

        /**
         * Returns the raw JSON value of [sample2].
         *
         * Unlike [sample2], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sample2") @ExcludeMissing fun _sample2(): JsonField<String> = sample2

        /**
         * Returns the raw JSON value of [sample3].
         *
         * Unlike [sample3], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sample3") @ExcludeMissing fun _sample3(): JsonField<String> = sample3

        /**
         * Returns the raw JSON value of [sample4].
         *
         * Unlike [sample4], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sample4") @ExcludeMissing fun _sample4(): JsonField<String> = sample4

        /**
         * Returns the raw JSON value of [sample5].
         *
         * Unlike [sample5], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sample5") @ExcludeMissing fun _sample5(): JsonField<String> = sample5

        /**
         * Returns the raw JSON value of [webhookFailoverUrl].
         *
         * Unlike [webhookFailoverUrl], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("webhookFailoverURL")
        @ExcludeMissing
        fun _webhookFailoverUrl(): JsonField<String> = webhookFailoverUrl

        /**
         * Returns the raw JSON value of [webhookUrl].
         *
         * Unlike [webhookUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("webhookURL")
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

            private var autoRenewal: JsonField<Boolean> = JsonMissing.of()
            private var helpMessage: JsonField<String> = JsonMissing.of()
            private var messageFlow: JsonField<String> = JsonMissing.of()
            private var resellerId: JsonField<String> = JsonMissing.of()
            private var sample1: JsonField<String> = JsonMissing.of()
            private var sample2: JsonField<String> = JsonMissing.of()
            private var sample3: JsonField<String> = JsonMissing.of()
            private var sample4: JsonField<String> = JsonMissing.of()
            private var sample5: JsonField<String> = JsonMissing.of()
            private var webhookFailoverUrl: JsonField<String> = JsonMissing.of()
            private var webhookUrl: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                autoRenewal = body.autoRenewal
                helpMessage = body.helpMessage
                messageFlow = body.messageFlow
                resellerId = body.resellerId
                sample1 = body.sample1
                sample2 = body.sample2
                sample3 = body.sample3
                sample4 = body.sample4
                sample5 = body.sample5
                webhookFailoverUrl = body.webhookFailoverUrl
                webhookUrl = body.webhookUrl
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Help message of the campaign. */
            fun autoRenewal(autoRenewal: Boolean) = autoRenewal(JsonField.of(autoRenewal))

            /**
             * Sets [Builder.autoRenewal] to an arbitrary JSON value.
             *
             * You should usually call [Builder.autoRenewal] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun autoRenewal(autoRenewal: JsonField<Boolean>) = apply {
                this.autoRenewal = autoRenewal
            }

            /** Help message of the campaign. */
            fun helpMessage(helpMessage: String) = helpMessage(JsonField.of(helpMessage))

            /**
             * Sets [Builder.helpMessage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.helpMessage] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun helpMessage(helpMessage: JsonField<String>) = apply {
                this.helpMessage = helpMessage
            }

            /** Message flow description. */
            fun messageFlow(messageFlow: String) = messageFlow(JsonField.of(messageFlow))

            /**
             * Sets [Builder.messageFlow] to an arbitrary JSON value.
             *
             * You should usually call [Builder.messageFlow] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun messageFlow(messageFlow: JsonField<String>) = apply {
                this.messageFlow = messageFlow
            }

            /**
             * Alphanumeric identifier of the reseller that you want to associate with this
             * campaign.
             */
            fun resellerId(resellerId: String) = resellerId(JsonField.of(resellerId))

            /**
             * Sets [Builder.resellerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.resellerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun resellerId(resellerId: JsonField<String>) = apply { this.resellerId = resellerId }

            /** Message sample. Some campaign tiers require 1 or more message samples. */
            fun sample1(sample1: String) = sample1(JsonField.of(sample1))

            /**
             * Sets [Builder.sample1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sample1] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sample1(sample1: JsonField<String>) = apply { this.sample1 = sample1 }

            /** Message sample. Some campaign tiers require 2 or more message samples. */
            fun sample2(sample2: String) = sample2(JsonField.of(sample2))

            /**
             * Sets [Builder.sample2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sample2] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sample2(sample2: JsonField<String>) = apply { this.sample2 = sample2 }

            /** Message sample. Some campaign tiers require 3 or more message samples. */
            fun sample3(sample3: String) = sample3(JsonField.of(sample3))

            /**
             * Sets [Builder.sample3] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sample3] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sample3(sample3: JsonField<String>) = apply { this.sample3 = sample3 }

            /** Message sample. Some campaign tiers require 4 or more message samples. */
            fun sample4(sample4: String) = sample4(JsonField.of(sample4))

            /**
             * Sets [Builder.sample4] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sample4] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sample4(sample4: JsonField<String>) = apply { this.sample4 = sample4 }

            /** Message sample. Some campaign tiers require 5 or more message samples. */
            fun sample5(sample5: String) = sample5(JsonField.of(sample5))

            /**
             * Sets [Builder.sample5] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sample5] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sample5(sample5: JsonField<String>) = apply { this.sample5 = sample5 }

            /** Webhook failover to which campaign status updates are sent. */
            fun webhookFailoverUrl(webhookFailoverUrl: String) =
                webhookFailoverUrl(JsonField.of(webhookFailoverUrl))

            /**
             * Sets [Builder.webhookFailoverUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhookFailoverUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun webhookFailoverUrl(webhookFailoverUrl: JsonField<String>) = apply {
                this.webhookFailoverUrl = webhookFailoverUrl
            }

            /** Webhook to which campaign status updates are sent. */
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
                    autoRenewal,
                    helpMessage,
                    messageFlow,
                    resellerId,
                    sample1,
                    sample2,
                    sample3,
                    sample4,
                    sample5,
                    webhookFailoverUrl,
                    webhookUrl,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            autoRenewal()
            helpMessage()
            messageFlow()
            resellerId()
            sample1()
            sample2()
            sample3()
            sample4()
            sample5()
            webhookFailoverUrl()
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
            (if (autoRenewal.asKnown().isPresent) 1 else 0) +
                (if (helpMessage.asKnown().isPresent) 1 else 0) +
                (if (messageFlow.asKnown().isPresent) 1 else 0) +
                (if (resellerId.asKnown().isPresent) 1 else 0) +
                (if (sample1.asKnown().isPresent) 1 else 0) +
                (if (sample2.asKnown().isPresent) 1 else 0) +
                (if (sample3.asKnown().isPresent) 1 else 0) +
                (if (sample4.asKnown().isPresent) 1 else 0) +
                (if (sample5.asKnown().isPresent) 1 else 0) +
                (if (webhookFailoverUrl.asKnown().isPresent) 1 else 0) +
                (if (webhookUrl.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                autoRenewal == other.autoRenewal &&
                helpMessage == other.helpMessage &&
                messageFlow == other.messageFlow &&
                resellerId == other.resellerId &&
                sample1 == other.sample1 &&
                sample2 == other.sample2 &&
                sample3 == other.sample3 &&
                sample4 == other.sample4 &&
                sample5 == other.sample5 &&
                webhookFailoverUrl == other.webhookFailoverUrl &&
                webhookUrl == other.webhookUrl &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                autoRenewal,
                helpMessage,
                messageFlow,
                resellerId,
                sample1,
                sample2,
                sample3,
                sample4,
                sample5,
                webhookFailoverUrl,
                webhookUrl,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{autoRenewal=$autoRenewal, helpMessage=$helpMessage, messageFlow=$messageFlow, resellerId=$resellerId, sample1=$sample1, sample2=$sample2, sample3=$sample3, sample4=$sample4, sample5=$sample5, webhookFailoverUrl=$webhookFailoverUrl, webhookUrl=$webhookUrl, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CampaignUpdateParams &&
            campaignId == other.campaignId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(campaignId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CampaignUpdateParams{campaignId=$campaignId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
