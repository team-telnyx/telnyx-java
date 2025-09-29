// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.verifiednumbers

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

/** A paginated list of Verified Numbers */
class VerifiedNumberListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<VerifiedNumber>>,
    private val meta: JsonField<Meta>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data")
        @ExcludeMissing
        data: JsonField<List<VerifiedNumber>> = JsonMissing.of(),
        @JsonProperty("meta") @ExcludeMissing meta: JsonField<Meta> = JsonMissing.of(),
    ) : this(data, meta, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): List<VerifiedNumber> = data.getRequired("data")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun meta(): Meta = meta.getRequired("meta")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<VerifiedNumber>> = data

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
         * Returns a mutable builder for constructing an instance of [VerifiedNumberListResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * .meta()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VerifiedNumberListResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<VerifiedNumber>>? = null
        private var meta: JsonField<Meta>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(verifiedNumberListResponse: VerifiedNumberListResponse) = apply {
            data = verifiedNumberListResponse.data.map { it.toMutableList() }
            meta = verifiedNumberListResponse.meta
            additionalProperties = verifiedNumberListResponse.additionalProperties.toMutableMap()
        }

        fun data(data: List<VerifiedNumber>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed `List<VerifiedNumber>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun data(data: JsonField<List<VerifiedNumber>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [VerifiedNumber] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: VerifiedNumber) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
        }

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
         * Returns an immutable instance of [VerifiedNumberListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .data()
         * .meta()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VerifiedNumberListResponse =
            VerifiedNumberListResponse(
                checkRequired("data", data).map { it.toImmutable() },
                checkRequired("meta", meta),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): VerifiedNumberListResponse = apply {
        if (validated) {
            return@apply
        }

        data().forEach { it.validate() }
        meta().validate()
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
        private val pageNumber: JsonField<Long>,
        private val pageSize: JsonField<Long>,
        private val totalPages: JsonField<Long>,
        private val totalResults: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("page_number")
            @ExcludeMissing
            pageNumber: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("page_size") @ExcludeMissing pageSize: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("total_pages")
            @ExcludeMissing
            totalPages: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("total_results")
            @ExcludeMissing
            totalResults: JsonField<Long> = JsonMissing.of(),
        ) : this(pageNumber, pageSize, totalPages, totalResults, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pageNumber(): Optional<Long> = pageNumber.getOptional("page_number")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pageSize(): Optional<Long> = pageSize.getOptional("page_size")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun totalPages(): Optional<Long> = totalPages.getOptional("total_pages")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun totalResults(): Optional<Long> = totalResults.getOptional("total_results")

        /**
         * Returns the raw JSON value of [pageNumber].
         *
         * Unlike [pageNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page_number") @ExcludeMissing fun _pageNumber(): JsonField<Long> = pageNumber

        /**
         * Returns the raw JSON value of [pageSize].
         *
         * Unlike [pageSize], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page_size") @ExcludeMissing fun _pageSize(): JsonField<Long> = pageSize

        /**
         * Returns the raw JSON value of [totalPages].
         *
         * Unlike [totalPages], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total_pages") @ExcludeMissing fun _totalPages(): JsonField<Long> = totalPages

        /**
         * Returns the raw JSON value of [totalResults].
         *
         * Unlike [totalResults], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("total_results")
        @ExcludeMissing
        fun _totalResults(): JsonField<Long> = totalResults

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

            private var pageNumber: JsonField<Long> = JsonMissing.of()
            private var pageSize: JsonField<Long> = JsonMissing.of()
            private var totalPages: JsonField<Long> = JsonMissing.of()
            private var totalResults: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(meta: Meta) = apply {
                pageNumber = meta.pageNumber
                pageSize = meta.pageSize
                totalPages = meta.totalPages
                totalResults = meta.totalResults
                additionalProperties = meta.additionalProperties.toMutableMap()
            }

            fun pageNumber(pageNumber: Long) = pageNumber(JsonField.of(pageNumber))

            /**
             * Sets [Builder.pageNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pageNumber] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pageNumber(pageNumber: JsonField<Long>) = apply { this.pageNumber = pageNumber }

            fun pageSize(pageSize: Long) = pageSize(JsonField.of(pageSize))

            /**
             * Sets [Builder.pageSize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pageSize] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pageSize(pageSize: JsonField<Long>) = apply { this.pageSize = pageSize }

            fun totalPages(totalPages: Long) = totalPages(JsonField.of(totalPages))

            /**
             * Sets [Builder.totalPages] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalPages] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalPages(totalPages: JsonField<Long>) = apply { this.totalPages = totalPages }

            fun totalResults(totalResults: Long) = totalResults(JsonField.of(totalResults))

            /**
             * Sets [Builder.totalResults] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalResults] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalResults(totalResults: JsonField<Long>) = apply {
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

        return other is VerifiedNumberListResponse &&
            data == other.data &&
            meta == other.meta &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, meta, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VerifiedNumberListResponse{data=$data, meta=$meta, additionalProperties=$additionalProperties}"
}
