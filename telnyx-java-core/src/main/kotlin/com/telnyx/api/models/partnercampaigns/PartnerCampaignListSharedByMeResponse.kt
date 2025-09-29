// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.partnercampaigns

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.checkKnown
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PartnerCampaignListSharedByMeResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val page: JsonField<Long>,
    private val records: JsonField<List<Record>>,
    private val totalRecords: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("page") @ExcludeMissing page: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("records")
        @ExcludeMissing
        records: JsonField<List<Record>> = JsonMissing.of(),
        @JsonProperty("totalRecords")
        @ExcludeMissing
        totalRecords: JsonField<Long> = JsonMissing.of(),
    ) : this(page, records, totalRecords, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun page(): Optional<Long> = page.getOptional("page")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun records(): Optional<List<Record>> = records.getOptional("records")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalRecords(): Optional<Long> = totalRecords.getOptional("totalRecords")

    /**
     * Returns the raw JSON value of [page].
     *
     * Unlike [page], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("page") @ExcludeMissing fun _page(): JsonField<Long> = page

    /**
     * Returns the raw JSON value of [records].
     *
     * Unlike [records], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("records") @ExcludeMissing fun _records(): JsonField<List<Record>> = records

    /**
     * Returns the raw JSON value of [totalRecords].
     *
     * Unlike [totalRecords], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("totalRecords")
    @ExcludeMissing
    fun _totalRecords(): JsonField<Long> = totalRecords

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
         * Returns a mutable builder for constructing an instance of
         * [PartnerCampaignListSharedByMeResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PartnerCampaignListSharedByMeResponse]. */
    class Builder internal constructor() {

        private var page: JsonField<Long> = JsonMissing.of()
        private var records: JsonField<MutableList<Record>>? = null
        private var totalRecords: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            partnerCampaignListSharedByMeResponse: PartnerCampaignListSharedByMeResponse
        ) = apply {
            page = partnerCampaignListSharedByMeResponse.page
            records = partnerCampaignListSharedByMeResponse.records.map { it.toMutableList() }
            totalRecords = partnerCampaignListSharedByMeResponse.totalRecords
            additionalProperties =
                partnerCampaignListSharedByMeResponse.additionalProperties.toMutableMap()
        }

        fun page(page: Long) = page(JsonField.of(page))

        /**
         * Sets [Builder.page] to an arbitrary JSON value.
         *
         * You should usually call [Builder.page] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun page(page: JsonField<Long>) = apply { this.page = page }

        fun records(records: List<Record>) = records(JsonField.of(records))

        /**
         * Sets [Builder.records] to an arbitrary JSON value.
         *
         * You should usually call [Builder.records] with a well-typed `List<Record>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun records(records: JsonField<List<Record>>) = apply {
            this.records = records.map { it.toMutableList() }
        }

        /**
         * Adds a single [Record] to [records].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRecord(record: Record) = apply {
            records =
                (records ?: JsonField.of(mutableListOf())).also {
                    checkKnown("records", it).add(record)
                }
        }

        fun totalRecords(totalRecords: Long) = totalRecords(JsonField.of(totalRecords))

        /**
         * Sets [Builder.totalRecords] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalRecords] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalRecords(totalRecords: JsonField<Long>) = apply { this.totalRecords = totalRecords }

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
         * Returns an immutable instance of [PartnerCampaignListSharedByMeResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PartnerCampaignListSharedByMeResponse =
            PartnerCampaignListSharedByMeResponse(
                page,
                (records ?: JsonMissing.of()).map { it.toImmutable() },
                totalRecords,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PartnerCampaignListSharedByMeResponse = apply {
        if (validated) {
            return@apply
        }

        page()
        records().ifPresent { it.forEach { it.validate() } }
        totalRecords()
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
        (if (page.asKnown().isPresent) 1 else 0) +
            (records.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (totalRecords.asKnown().isPresent) 1 else 0)

    /**
     * Campaign is generated by the 10DLC registry once the corresponding campaign request is
     * approved. Each campaign is assigned a unique identifier - **campaignId**. Once a campaign is
     * activated, limited information is published to the NetNumber OSR service for consumption by
     * members of the ecosystem. When a campaign is suspended(reversible) or
     * expired(non-reversible), campaign data is deleted from the OSR service. Most attributes of
     * campaignare immutable, including **usecase**, **vertical**, **brandId** and **cspId**.
     */
    class Record
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val brandId: JsonField<String>,
        private val campaignId: JsonField<String>,
        private val usecase: JsonField<String>,
        private val createDate: JsonField<String>,
        private val status: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("brandId") @ExcludeMissing brandId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("campaignId")
            @ExcludeMissing
            campaignId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("usecase") @ExcludeMissing usecase: JsonField<String> = JsonMissing.of(),
            @JsonProperty("createDate")
            @ExcludeMissing
            createDate: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        ) : this(brandId, campaignId, usecase, createDate, status, mutableMapOf())

        /**
         * Alphanumeric identifier of the brand associated with this campaign.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun brandId(): String = brandId.getRequired("brandId")

        /**
         * Alphanumeric identifier assigned by the registry for a campaign. This identifier is
         * required by the NetNumber OSR SMS enabling process of 10DLC.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun campaignId(): String = campaignId.getRequired("campaignId")

        /**
         * Campaign usecase. Must be of defined valid types. Use `/registry/enum/usecase` operation
         * to retrieve usecases available for given brand.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun usecase(): String = usecase.getRequired("usecase")

        /**
         * Unix timestamp when campaign was created.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createDate(): Optional<String> = createDate.getOptional("createDate")

        /**
         * Current campaign status. Possible values: ACTIVE, EXPIRED. A newly created campaign
         * defaults to ACTIVE status.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun status(): Optional<String> = status.getOptional("status")

        /**
         * Returns the raw JSON value of [brandId].
         *
         * Unlike [brandId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("brandId") @ExcludeMissing fun _brandId(): JsonField<String> = brandId

        /**
         * Returns the raw JSON value of [campaignId].
         *
         * Unlike [campaignId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("campaignId")
        @ExcludeMissing
        fun _campaignId(): JsonField<String> = campaignId

        /**
         * Returns the raw JSON value of [usecase].
         *
         * Unlike [usecase], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("usecase") @ExcludeMissing fun _usecase(): JsonField<String> = usecase

        /**
         * Returns the raw JSON value of [createDate].
         *
         * Unlike [createDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("createDate")
        @ExcludeMissing
        fun _createDate(): JsonField<String> = createDate

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

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
             * Returns a mutable builder for constructing an instance of [Record].
             *
             * The following fields are required:
             * ```java
             * .brandId()
             * .campaignId()
             * .usecase()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Record]. */
        class Builder internal constructor() {

            private var brandId: JsonField<String>? = null
            private var campaignId: JsonField<String>? = null
            private var usecase: JsonField<String>? = null
            private var createDate: JsonField<String> = JsonMissing.of()
            private var status: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(record: Record) = apply {
                brandId = record.brandId
                campaignId = record.campaignId
                usecase = record.usecase
                createDate = record.createDate
                status = record.status
                additionalProperties = record.additionalProperties.toMutableMap()
            }

            /** Alphanumeric identifier of the brand associated with this campaign. */
            fun brandId(brandId: String) = brandId(JsonField.of(brandId))

            /**
             * Sets [Builder.brandId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.brandId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun brandId(brandId: JsonField<String>) = apply { this.brandId = brandId }

            /**
             * Alphanumeric identifier assigned by the registry for a campaign. This identifier is
             * required by the NetNumber OSR SMS enabling process of 10DLC.
             */
            fun campaignId(campaignId: String) = campaignId(JsonField.of(campaignId))

            /**
             * Sets [Builder.campaignId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.campaignId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun campaignId(campaignId: JsonField<String>) = apply { this.campaignId = campaignId }

            /**
             * Campaign usecase. Must be of defined valid types. Use `/registry/enum/usecase`
             * operation to retrieve usecases available for given brand.
             */
            fun usecase(usecase: String) = usecase(JsonField.of(usecase))

            /**
             * Sets [Builder.usecase] to an arbitrary JSON value.
             *
             * You should usually call [Builder.usecase] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun usecase(usecase: JsonField<String>) = apply { this.usecase = usecase }

            /** Unix timestamp when campaign was created. */
            fun createDate(createDate: String) = createDate(JsonField.of(createDate))

            /**
             * Sets [Builder.createDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createDate] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createDate(createDate: JsonField<String>) = apply { this.createDate = createDate }

            /**
             * Current campaign status. Possible values: ACTIVE, EXPIRED. A newly created campaign
             * defaults to ACTIVE status.
             */
            fun status(status: String) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<String>) = apply { this.status = status }

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
             * Returns an immutable instance of [Record].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .brandId()
             * .campaignId()
             * .usecase()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Record =
                Record(
                    checkRequired("brandId", brandId),
                    checkRequired("campaignId", campaignId),
                    checkRequired("usecase", usecase),
                    createDate,
                    status,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Record = apply {
            if (validated) {
                return@apply
            }

            brandId()
            campaignId()
            usecase()
            createDate()
            status()
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
            (if (brandId.asKnown().isPresent) 1 else 0) +
                (if (campaignId.asKnown().isPresent) 1 else 0) +
                (if (usecase.asKnown().isPresent) 1 else 0) +
                (if (createDate.asKnown().isPresent) 1 else 0) +
                (if (status.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Record &&
                brandId == other.brandId &&
                campaignId == other.campaignId &&
                usecase == other.usecase &&
                createDate == other.createDate &&
                status == other.status &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(brandId, campaignId, usecase, createDate, status, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Record{brandId=$brandId, campaignId=$campaignId, usecase=$usecase, createDate=$createDate, status=$status, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PartnerCampaignListSharedByMeResponse &&
            page == other.page &&
            records == other.records &&
            totalRecords == other.totalRecords &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(page, records, totalRecords, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PartnerCampaignListSharedByMeResponse{page=$page, records=$records, totalRecords=$totalRecords, additionalProperties=$additionalProperties}"
}
