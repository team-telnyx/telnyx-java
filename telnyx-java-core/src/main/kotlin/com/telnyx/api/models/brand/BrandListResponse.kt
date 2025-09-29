// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.brand

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.Enum
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.checkKnown
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class BrandListResponse
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

        /** Returns a mutable builder for constructing an instance of [BrandListResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BrandListResponse]. */
    class Builder internal constructor() {

        private var page: JsonField<Long> = JsonMissing.of()
        private var records: JsonField<MutableList<Record>>? = null
        private var totalRecords: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(brandListResponse: BrandListResponse) = apply {
            page = brandListResponse.page
            records = brandListResponse.records.map { it.toMutableList() }
            totalRecords = brandListResponse.totalRecords
            additionalProperties = brandListResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [BrandListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BrandListResponse =
            BrandListResponse(
                page,
                (records ?: JsonMissing.of()).map { it.toImmutable() },
                totalRecords,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BrandListResponse = apply {
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

    class Record
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val assignedCampaingsCount: JsonField<Long>,
        private val brandId: JsonField<String>,
        private val companyName: JsonField<String>,
        private val createdAt: JsonField<String>,
        private val displayName: JsonField<String>,
        private val email: JsonField<String>,
        private val entityType: JsonField<EntityType>,
        private val failureReasons: JsonField<String>,
        private val identityStatus: JsonField<BrandIdentityStatus>,
        private val status: JsonField<Status>,
        private val tcrBrandId: JsonField<String>,
        private val updatedAt: JsonField<String>,
        private val website: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("assignedCampaingsCount")
            @ExcludeMissing
            assignedCampaingsCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("brandId") @ExcludeMissing brandId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("companyName")
            @ExcludeMissing
            companyName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("displayName")
            @ExcludeMissing
            displayName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("entityType")
            @ExcludeMissing
            entityType: JsonField<EntityType> = JsonMissing.of(),
            @JsonProperty("failureReasons")
            @ExcludeMissing
            failureReasons: JsonField<String> = JsonMissing.of(),
            @JsonProperty("identityStatus")
            @ExcludeMissing
            identityStatus: JsonField<BrandIdentityStatus> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("tcrBrandId")
            @ExcludeMissing
            tcrBrandId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("updatedAt")
            @ExcludeMissing
            updatedAt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("website") @ExcludeMissing website: JsonField<String> = JsonMissing.of(),
        ) : this(
            assignedCampaingsCount,
            brandId,
            companyName,
            createdAt,
            displayName,
            email,
            entityType,
            failureReasons,
            identityStatus,
            status,
            tcrBrandId,
            updatedAt,
            website,
            mutableMapOf(),
        )

        /**
         * Number of campaigns associated with the brand
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun assignedCampaingsCount(): Optional<Long> =
            assignedCampaingsCount.getOptional("assignedCampaingsCount")

        /**
         * Unique identifier assigned to the brand.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun brandId(): Optional<String> = brandId.getOptional("brandId")

        /**
         * (Required for Non-profit/private/public) Legal company name.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun companyName(): Optional<String> = companyName.getOptional("companyName")

        /**
         * Date and time that the brand was created at.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): Optional<String> = createdAt.getOptional("createdAt")

        /**
         * Display or marketing name of the brand.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun displayName(): Optional<String> = displayName.getOptional("displayName")

        /**
         * Valid email address of brand support contact.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun email(): Optional<String> = email.getOptional("email")

        /**
         * Entity type behind the brand. This is the form of business establishment.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun entityType(): Optional<EntityType> = entityType.getOptional("entityType")

        /**
         * Failure reasons for brand
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun failureReasons(): Optional<String> = failureReasons.getOptional("failureReasons")

        /**
         * The verification status of an active brand
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun identityStatus(): Optional<BrandIdentityStatus> =
            identityStatus.getOptional("identityStatus")

        /**
         * Status of the brand
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun status(): Optional<Status> = status.getOptional("status")

        /**
         * Unique identifier assigned to the brand by the registry.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tcrBrandId(): Optional<String> = tcrBrandId.getOptional("tcrBrandId")

        /**
         * Date and time that the brand was last updated at.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun updatedAt(): Optional<String> = updatedAt.getOptional("updatedAt")

        /**
         * Brand website URL.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun website(): Optional<String> = website.getOptional("website")

        /**
         * Returns the raw JSON value of [assignedCampaingsCount].
         *
         * Unlike [assignedCampaingsCount], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("assignedCampaingsCount")
        @ExcludeMissing
        fun _assignedCampaingsCount(): JsonField<Long> = assignedCampaingsCount

        /**
         * Returns the raw JSON value of [brandId].
         *
         * Unlike [brandId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("brandId") @ExcludeMissing fun _brandId(): JsonField<String> = brandId

        /**
         * Returns the raw JSON value of [companyName].
         *
         * Unlike [companyName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("companyName")
        @ExcludeMissing
        fun _companyName(): JsonField<String> = companyName

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("createdAt") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

        /**
         * Returns the raw JSON value of [displayName].
         *
         * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("displayName")
        @ExcludeMissing
        fun _displayName(): JsonField<String> = displayName

        /**
         * Returns the raw JSON value of [email].
         *
         * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /**
         * Returns the raw JSON value of [entityType].
         *
         * Unlike [entityType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("entityType")
        @ExcludeMissing
        fun _entityType(): JsonField<EntityType> = entityType

        /**
         * Returns the raw JSON value of [failureReasons].
         *
         * Unlike [failureReasons], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("failureReasons")
        @ExcludeMissing
        fun _failureReasons(): JsonField<String> = failureReasons

        /**
         * Returns the raw JSON value of [identityStatus].
         *
         * Unlike [identityStatus], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("identityStatus")
        @ExcludeMissing
        fun _identityStatus(): JsonField<BrandIdentityStatus> = identityStatus

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [tcrBrandId].
         *
         * Unlike [tcrBrandId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tcrBrandId")
        @ExcludeMissing
        fun _tcrBrandId(): JsonField<String> = tcrBrandId

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updatedAt") @ExcludeMissing fun _updatedAt(): JsonField<String> = updatedAt

        /**
         * Returns the raw JSON value of [website].
         *
         * Unlike [website], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("website") @ExcludeMissing fun _website(): JsonField<String> = website

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

            /** Returns a mutable builder for constructing an instance of [Record]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Record]. */
        class Builder internal constructor() {

            private var assignedCampaingsCount: JsonField<Long> = JsonMissing.of()
            private var brandId: JsonField<String> = JsonMissing.of()
            private var companyName: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<String> = JsonMissing.of()
            private var displayName: JsonField<String> = JsonMissing.of()
            private var email: JsonField<String> = JsonMissing.of()
            private var entityType: JsonField<EntityType> = JsonMissing.of()
            private var failureReasons: JsonField<String> = JsonMissing.of()
            private var identityStatus: JsonField<BrandIdentityStatus> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var tcrBrandId: JsonField<String> = JsonMissing.of()
            private var updatedAt: JsonField<String> = JsonMissing.of()
            private var website: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(record: Record) = apply {
                assignedCampaingsCount = record.assignedCampaingsCount
                brandId = record.brandId
                companyName = record.companyName
                createdAt = record.createdAt
                displayName = record.displayName
                email = record.email
                entityType = record.entityType
                failureReasons = record.failureReasons
                identityStatus = record.identityStatus
                status = record.status
                tcrBrandId = record.tcrBrandId
                updatedAt = record.updatedAt
                website = record.website
                additionalProperties = record.additionalProperties.toMutableMap()
            }

            /** Number of campaigns associated with the brand */
            fun assignedCampaingsCount(assignedCampaingsCount: Long) =
                assignedCampaingsCount(JsonField.of(assignedCampaingsCount))

            /**
             * Sets [Builder.assignedCampaingsCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.assignedCampaingsCount] with a well-typed [Long]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun assignedCampaingsCount(assignedCampaingsCount: JsonField<Long>) = apply {
                this.assignedCampaingsCount = assignedCampaingsCount
            }

            /** Unique identifier assigned to the brand. */
            fun brandId(brandId: String) = brandId(JsonField.of(brandId))

            /**
             * Sets [Builder.brandId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.brandId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun brandId(brandId: JsonField<String>) = apply { this.brandId = brandId }

            /** (Required for Non-profit/private/public) Legal company name. */
            fun companyName(companyName: String) = companyName(JsonField.of(companyName))

            /**
             * Sets [Builder.companyName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.companyName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun companyName(companyName: JsonField<String>) = apply {
                this.companyName = companyName
            }

            /** Date and time that the brand was created at. */
            fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

            /** Display or marketing name of the brand. */
            fun displayName(displayName: String) = displayName(JsonField.of(displayName))

            /**
             * Sets [Builder.displayName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.displayName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun displayName(displayName: JsonField<String>) = apply {
                this.displayName = displayName
            }

            /** Valid email address of brand support contact. */
            fun email(email: String) = email(JsonField.of(email))

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            /** Entity type behind the brand. This is the form of business establishment. */
            fun entityType(entityType: EntityType) = entityType(JsonField.of(entityType))

            /**
             * Sets [Builder.entityType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.entityType] with a well-typed [EntityType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entityType(entityType: JsonField<EntityType>) = apply {
                this.entityType = entityType
            }

            /** Failure reasons for brand */
            fun failureReasons(failureReasons: String) =
                failureReasons(JsonField.of(failureReasons))

            /**
             * Sets [Builder.failureReasons] to an arbitrary JSON value.
             *
             * You should usually call [Builder.failureReasons] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun failureReasons(failureReasons: JsonField<String>) = apply {
                this.failureReasons = failureReasons
            }

            /** The verification status of an active brand */
            fun identityStatus(identityStatus: BrandIdentityStatus) =
                identityStatus(JsonField.of(identityStatus))

            /**
             * Sets [Builder.identityStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.identityStatus] with a well-typed
             * [BrandIdentityStatus] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun identityStatus(identityStatus: JsonField<BrandIdentityStatus>) = apply {
                this.identityStatus = identityStatus
            }

            /** Status of the brand */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** Unique identifier assigned to the brand by the registry. */
            fun tcrBrandId(tcrBrandId: String) = tcrBrandId(JsonField.of(tcrBrandId))

            /**
             * Sets [Builder.tcrBrandId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tcrBrandId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tcrBrandId(tcrBrandId: JsonField<String>) = apply { this.tcrBrandId = tcrBrandId }

            /** Date and time that the brand was last updated at. */
            fun updatedAt(updatedAt: String) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<String>) = apply { this.updatedAt = updatedAt }

            /** Brand website URL. */
            fun website(website: String) = website(JsonField.of(website))

            /**
             * Sets [Builder.website] to an arbitrary JSON value.
             *
             * You should usually call [Builder.website] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun website(website: JsonField<String>) = apply { this.website = website }

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
             */
            fun build(): Record =
                Record(
                    assignedCampaingsCount,
                    brandId,
                    companyName,
                    createdAt,
                    displayName,
                    email,
                    entityType,
                    failureReasons,
                    identityStatus,
                    status,
                    tcrBrandId,
                    updatedAt,
                    website,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Record = apply {
            if (validated) {
                return@apply
            }

            assignedCampaingsCount()
            brandId()
            companyName()
            createdAt()
            displayName()
            email()
            entityType().ifPresent { it.validate() }
            failureReasons()
            identityStatus().ifPresent { it.validate() }
            status().ifPresent { it.validate() }
            tcrBrandId()
            updatedAt()
            website()
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
            (if (assignedCampaingsCount.asKnown().isPresent) 1 else 0) +
                (if (brandId.asKnown().isPresent) 1 else 0) +
                (if (companyName.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (displayName.asKnown().isPresent) 1 else 0) +
                (if (email.asKnown().isPresent) 1 else 0) +
                (entityType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (failureReasons.asKnown().isPresent) 1 else 0) +
                (identityStatus.asKnown().getOrNull()?.validity() ?: 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (tcrBrandId.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (if (website.asKnown().isPresent) 1 else 0)

        /** Status of the brand */
        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val OK = of("OK")

                @JvmField val REGISTRATION_PENDING = of("REGISTRATION_PENDING")

                @JvmField val REGISTRATION_FAILED = of("REGISTRATION_FAILED")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                OK,
                REGISTRATION_PENDING,
                REGISTRATION_FAILED,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                OK,
                REGISTRATION_PENDING,
                REGISTRATION_FAILED,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    OK -> Value.OK
                    REGISTRATION_PENDING -> Value.REGISTRATION_PENDING
                    REGISTRATION_FAILED -> Value.REGISTRATION_FAILED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    OK -> Known.OK
                    REGISTRATION_PENDING -> Known.REGISTRATION_PENDING
                    REGISTRATION_FAILED -> Known.REGISTRATION_FAILED
                    else -> throw TelnyxInvalidDataException("Unknown Status: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

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

            return other is Record &&
                assignedCampaingsCount == other.assignedCampaingsCount &&
                brandId == other.brandId &&
                companyName == other.companyName &&
                createdAt == other.createdAt &&
                displayName == other.displayName &&
                email == other.email &&
                entityType == other.entityType &&
                failureReasons == other.failureReasons &&
                identityStatus == other.identityStatus &&
                status == other.status &&
                tcrBrandId == other.tcrBrandId &&
                updatedAt == other.updatedAt &&
                website == other.website &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                assignedCampaingsCount,
                brandId,
                companyName,
                createdAt,
                displayName,
                email,
                entityType,
                failureReasons,
                identityStatus,
                status,
                tcrBrandId,
                updatedAt,
                website,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Record{assignedCampaingsCount=$assignedCampaingsCount, brandId=$brandId, companyName=$companyName, createdAt=$createdAt, displayName=$displayName, email=$email, entityType=$entityType, failureReasons=$failureReasons, identityStatus=$identityStatus, status=$status, tcrBrandId=$tcrBrandId, updatedAt=$updatedAt, website=$website, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BrandListResponse &&
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
        "BrandListResponse{page=$page, records=$records, totalRecords=$totalRecords, additionalProperties=$additionalProperties}"
}
