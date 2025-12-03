// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbercampaigns

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class PhoneNumberCampaignListPageResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val page: JsonField<Long>,
    private val records: JsonField<List<PhoneNumberCampaign>>,
    private val totalRecords: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("page") @ExcludeMissing page: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("records")
        @ExcludeMissing
        records: JsonField<List<PhoneNumberCampaign>> = JsonMissing.of(),
        @JsonProperty("totalRecords")
        @ExcludeMissing
        totalRecords: JsonField<Long> = JsonMissing.of(),
    ) : this(page, records, totalRecords, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun page(): Long = page.getRequired("page")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun records(): List<PhoneNumberCampaign> = records.getRequired("records")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun totalRecords(): Long = totalRecords.getRequired("totalRecords")

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
    @JsonProperty("records")
    @ExcludeMissing
    fun _records(): JsonField<List<PhoneNumberCampaign>> = records

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
         * [PhoneNumberCampaignListPageResponse].
         *
         * The following fields are required:
         * ```java
         * .page()
         * .records()
         * .totalRecords()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PhoneNumberCampaignListPageResponse]. */
    class Builder internal constructor() {

        private var page: JsonField<Long>? = null
        private var records: JsonField<MutableList<PhoneNumberCampaign>>? = null
        private var totalRecords: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            phoneNumberCampaignListPageResponse: PhoneNumberCampaignListPageResponse
        ) = apply {
            page = phoneNumberCampaignListPageResponse.page
            records = phoneNumberCampaignListPageResponse.records.map { it.toMutableList() }
            totalRecords = phoneNumberCampaignListPageResponse.totalRecords
            additionalProperties =
                phoneNumberCampaignListPageResponse.additionalProperties.toMutableMap()
        }

        fun page(page: Long) = page(JsonField.of(page))

        /**
         * Sets [Builder.page] to an arbitrary JSON value.
         *
         * You should usually call [Builder.page] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun page(page: JsonField<Long>) = apply { this.page = page }

        fun records(records: List<PhoneNumberCampaign>) = records(JsonField.of(records))

        /**
         * Sets [Builder.records] to an arbitrary JSON value.
         *
         * You should usually call [Builder.records] with a well-typed `List<PhoneNumberCampaign>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun records(records: JsonField<List<PhoneNumberCampaign>>) = apply {
            this.records = records.map { it.toMutableList() }
        }

        /**
         * Adds a single [PhoneNumberCampaign] to [records].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRecord(record: PhoneNumberCampaign) = apply {
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
         * Returns an immutable instance of [PhoneNumberCampaignListPageResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .page()
         * .records()
         * .totalRecords()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PhoneNumberCampaignListPageResponse =
            PhoneNumberCampaignListPageResponse(
                checkRequired("page", page),
                checkRequired("records", records).map { it.toImmutable() },
                checkRequired("totalRecords", totalRecords),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PhoneNumberCampaignListPageResponse = apply {
        if (validated) {
            return@apply
        }

        page()
        records().forEach { it.validate() }
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PhoneNumberCampaignListPageResponse &&
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
        "PhoneNumberCampaignListPageResponse{page=$page, records=$records, totalRecords=$totalRecords, additionalProperties=$additionalProperties}"
}
