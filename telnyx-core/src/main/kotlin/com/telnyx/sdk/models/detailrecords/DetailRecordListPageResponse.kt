// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.detailrecords

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class DetailRecordListPageResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<DetailRecordListResponse>>,
    private val meta: JsonField<Meta>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data")
        @ExcludeMissing
        data: JsonField<List<DetailRecordListResponse>> = JsonMissing.of(),
        @JsonProperty("meta") @ExcludeMissing meta: JsonField<Meta> = JsonMissing.of(),
    ) : this(data, meta, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<List<DetailRecordListResponse>> = data.getOptional("data")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun meta(): Optional<Meta> = meta.getOptional("meta")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data")
    @ExcludeMissing
    fun _data(): JsonField<List<DetailRecordListResponse>> = data

    /**
     * Returns the raw JSON value of [meta].
     *
     * Unlike [meta], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("meta") @ExcludeMissing fun _meta(): JsonField<Meta> = meta

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
         * Returns a mutable builder for constructing an instance of [DetailRecordListPageResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DetailRecordListPageResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<DetailRecordListResponse>>? = null
        private var meta: JsonField<Meta> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(detailRecordListPageResponse: DetailRecordListPageResponse) = apply {
            data = detailRecordListPageResponse.data.map { it.toMutableList() }
            meta = detailRecordListPageResponse.meta
            additionalProperties = detailRecordListPageResponse.additionalProperties.toMutableMap()
        }

        fun data(data: List<DetailRecordListResponse>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed `List<DetailRecordListResponse>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun data(data: JsonField<List<DetailRecordListResponse>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [DetailRecordListResponse] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: DetailRecordListResponse) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
        }

        /**
         * Alias for calling [addData] with
         * `DetailRecordListResponse.ofMessageDetailRecord(messageDetailRecord)`.
         */
        fun addData(messageDetailRecord: DetailRecordListResponse.MessageDetailRecord) =
            addData(DetailRecordListResponse.ofMessageDetailRecord(messageDetailRecord))

        /**
         * Alias for calling [addData] with
         * `DetailRecordListResponse.ofConferenceDetailRecord(conferenceDetailRecord)`.
         */
        fun addData(conferenceDetailRecord: DetailRecordListResponse.ConferenceDetailRecord) =
            addData(DetailRecordListResponse.ofConferenceDetailRecord(conferenceDetailRecord))

        /**
         * Alias for calling [addData] with
         * `DetailRecordListResponse.ofConferenceParticipantDetailRecord(conferenceParticipantDetailRecord)`.
         */
        fun addData(
            conferenceParticipantDetailRecord:
                DetailRecordListResponse.ConferenceParticipantDetailRecord
        ) =
            addData(
                DetailRecordListResponse.ofConferenceParticipantDetailRecord(
                    conferenceParticipantDetailRecord
                )
            )

        /**
         * Alias for calling [addData] with
         * `DetailRecordListResponse.ofAmdDetailRecord(amdDetailRecord)`.
         */
        fun addData(amdDetailRecord: DetailRecordListResponse.AmdDetailRecord) =
            addData(DetailRecordListResponse.ofAmdDetailRecord(amdDetailRecord))

        /**
         * Alias for calling [addData] with
         * `DetailRecordListResponse.ofVerifyDetailRecord(verifyDetailRecord)`.
         */
        fun addData(verifyDetailRecord: DetailRecordListResponse.VerifyDetailRecord) =
            addData(DetailRecordListResponse.ofVerifyDetailRecord(verifyDetailRecord))

        /**
         * Alias for calling [addData] with
         * `DetailRecordListResponse.ofSimCardUsageDetailRecord(simCardUsageDetailRecord)`.
         */
        fun addData(simCardUsageDetailRecord: DetailRecordListResponse.SimCardUsageDetailRecord) =
            addData(DetailRecordListResponse.ofSimCardUsageDetailRecord(simCardUsageDetailRecord))

        /**
         * Alias for calling [addData] with
         * `DetailRecordListResponse.ofMediaStorageDetailRecord(mediaStorageDetailRecord)`.
         */
        fun addData(mediaStorageDetailRecord: DetailRecordListResponse.MediaStorageDetailRecord) =
            addData(DetailRecordListResponse.ofMediaStorageDetailRecord(mediaStorageDetailRecord))

        fun meta(meta: Meta) = meta(JsonField.of(meta))

        /**
         * Sets [Builder.meta] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meta] with a well-typed [Meta] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun meta(meta: JsonField<Meta>) = apply { this.meta = meta }

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
         * Returns an immutable instance of [DetailRecordListPageResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): DetailRecordListPageResponse =
            DetailRecordListPageResponse(
                (data ?: JsonMissing.of()).map { it.toImmutable() },
                meta,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DetailRecordListPageResponse = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.forEach { it.validate() } }
        meta().ifPresent { it.validate() }
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
        (data.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (meta.asKnown().getOrNull()?.validity() ?: 0)

    class Meta
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val pageNumber: JsonField<Int>,
        private val pageSize: JsonField<Int>,
        private val totalPages: JsonField<Int>,
        private val totalResults: JsonField<Int>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("page_number")
            @ExcludeMissing
            pageNumber: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("page_size") @ExcludeMissing pageSize: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("total_pages")
            @ExcludeMissing
            totalPages: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("total_results")
            @ExcludeMissing
            totalResults: JsonField<Int> = JsonMissing.of(),
        ) : this(pageNumber, pageSize, totalPages, totalResults, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pageNumber(): Optional<Int> = pageNumber.getOptional("page_number")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pageSize(): Optional<Int> = pageSize.getOptional("page_size")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun totalPages(): Optional<Int> = totalPages.getOptional("total_pages")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun totalResults(): Optional<Int> = totalResults.getOptional("total_results")

        /**
         * Returns the raw JSON value of [pageNumber].
         *
         * Unlike [pageNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page_number") @ExcludeMissing fun _pageNumber(): JsonField<Int> = pageNumber

        /**
         * Returns the raw JSON value of [pageSize].
         *
         * Unlike [pageSize], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page_size") @ExcludeMissing fun _pageSize(): JsonField<Int> = pageSize

        /**
         * Returns the raw JSON value of [totalPages].
         *
         * Unlike [totalPages], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total_pages") @ExcludeMissing fun _totalPages(): JsonField<Int> = totalPages

        /**
         * Returns the raw JSON value of [totalResults].
         *
         * Unlike [totalResults], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("total_results")
        @ExcludeMissing
        fun _totalResults(): JsonField<Int> = totalResults

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

            /** Returns a mutable builder for constructing an instance of [Meta]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Meta]. */
        class Builder internal constructor() {

            private var pageNumber: JsonField<Int> = JsonMissing.of()
            private var pageSize: JsonField<Int> = JsonMissing.of()
            private var totalPages: JsonField<Int> = JsonMissing.of()
            private var totalResults: JsonField<Int> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(meta: Meta) = apply {
                pageNumber = meta.pageNumber
                pageSize = meta.pageSize
                totalPages = meta.totalPages
                totalResults = meta.totalResults
                additionalProperties = meta.additionalProperties.toMutableMap()
            }

            fun pageNumber(pageNumber: Int) = pageNumber(JsonField.of(pageNumber))

            /**
             * Sets [Builder.pageNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pageNumber] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pageNumber(pageNumber: JsonField<Int>) = apply { this.pageNumber = pageNumber }

            fun pageSize(pageSize: Int) = pageSize(JsonField.of(pageSize))

            /**
             * Sets [Builder.pageSize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pageSize] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pageSize(pageSize: JsonField<Int>) = apply { this.pageSize = pageSize }

            fun totalPages(totalPages: Int) = totalPages(JsonField.of(totalPages))

            /**
             * Sets [Builder.totalPages] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalPages] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalPages(totalPages: JsonField<Int>) = apply { this.totalPages = totalPages }

            fun totalResults(totalResults: Int) = totalResults(JsonField.of(totalResults))

            /**
             * Sets [Builder.totalResults] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalResults] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalResults(totalResults: JsonField<Int>) = apply {
                this.totalResults = totalResults
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
             * Returns an immutable instance of [Meta].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Meta =
                Meta(
                    pageNumber,
                    pageSize,
                    totalPages,
                    totalResults,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Meta = apply {
            if (validated) {
                return@apply
            }

            pageNumber()
            pageSize()
            totalPages()
            totalResults()
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
            (if (pageNumber.asKnown().isPresent) 1 else 0) +
                (if (pageSize.asKnown().isPresent) 1 else 0) +
                (if (totalPages.asKnown().isPresent) 1 else 0) +
                (if (totalResults.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Meta &&
                pageNumber == other.pageNumber &&
                pageSize == other.pageSize &&
                totalPages == other.totalPages &&
                totalResults == other.totalResults &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(pageNumber, pageSize, totalPages, totalResults, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Meta{pageNumber=$pageNumber, pageSize=$pageSize, totalPages=$totalPages, totalResults=$totalResults, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DetailRecordListPageResponse &&
            data == other.data &&
            meta == other.meta &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, meta, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DetailRecordListPageResponse{data=$data, meta=$meta, additionalProperties=$additionalProperties}"
}
