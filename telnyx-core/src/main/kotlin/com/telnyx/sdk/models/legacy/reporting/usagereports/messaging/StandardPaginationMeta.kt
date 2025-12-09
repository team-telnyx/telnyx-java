// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.legacy.reporting.usagereports.messaging

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
import java.util.Optional

class StandardPaginationMeta
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val pageNumber: JsonField<Int>,
    private val totalPages: JsonField<Int>,
    private val pageSize: JsonField<Int>,
    private val totalResults: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("page_number") @ExcludeMissing pageNumber: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("total_pages") @ExcludeMissing totalPages: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("page_size") @ExcludeMissing pageSize: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("total_results")
        @ExcludeMissing
        totalResults: JsonField<Int> = JsonMissing.of(),
    ) : this(pageNumber, totalPages, pageSize, totalResults, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pageNumber(): Int = pageNumber.getRequired("page_number")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun totalPages(): Int = totalPages.getRequired("total_pages")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pageSize(): Optional<Int> = pageSize.getOptional("page_size")

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
     * Returns the raw JSON value of [totalPages].
     *
     * Unlike [totalPages], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_pages") @ExcludeMissing fun _totalPages(): JsonField<Int> = totalPages

    /**
     * Returns the raw JSON value of [pageSize].
     *
     * Unlike [pageSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("page_size") @ExcludeMissing fun _pageSize(): JsonField<Int> = pageSize

    /**
     * Returns the raw JSON value of [totalResults].
     *
     * Unlike [totalResults], this method doesn't throw if the JSON field has an unexpected type.
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

        /**
         * Returns a mutable builder for constructing an instance of [StandardPaginationMeta].
         *
         * The following fields are required:
         * ```java
         * .pageNumber()
         * .totalPages()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [StandardPaginationMeta]. */
    class Builder internal constructor() {

        private var pageNumber: JsonField<Int>? = null
        private var totalPages: JsonField<Int>? = null
        private var pageSize: JsonField<Int> = JsonMissing.of()
        private var totalResults: JsonField<Int> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(standardPaginationMeta: StandardPaginationMeta) = apply {
            pageNumber = standardPaginationMeta.pageNumber
            totalPages = standardPaginationMeta.totalPages
            pageSize = standardPaginationMeta.pageSize
            totalResults = standardPaginationMeta.totalResults
            additionalProperties = standardPaginationMeta.additionalProperties.toMutableMap()
        }

        fun pageNumber(pageNumber: Int) = pageNumber(JsonField.of(pageNumber))

        /**
         * Sets [Builder.pageNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pageNumber] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pageNumber(pageNumber: JsonField<Int>) = apply { this.pageNumber = pageNumber }

        fun totalPages(totalPages: Int) = totalPages(JsonField.of(totalPages))

        /**
         * Sets [Builder.totalPages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalPages] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun totalPages(totalPages: JsonField<Int>) = apply { this.totalPages = totalPages }

        fun pageSize(pageSize: Int) = pageSize(JsonField.of(pageSize))

        /**
         * Sets [Builder.pageSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pageSize] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pageSize(pageSize: JsonField<Int>) = apply { this.pageSize = pageSize }

        fun totalResults(totalResults: Int) = totalResults(JsonField.of(totalResults))

        /**
         * Sets [Builder.totalResults] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalResults] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalResults(totalResults: JsonField<Int>) = apply { this.totalResults = totalResults }

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
         * Returns an immutable instance of [StandardPaginationMeta].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .pageNumber()
         * .totalPages()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): StandardPaginationMeta =
            StandardPaginationMeta(
                checkRequired("pageNumber", pageNumber),
                checkRequired("totalPages", totalPages),
                pageSize,
                totalResults,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): StandardPaginationMeta = apply {
        if (validated) {
            return@apply
        }

        pageNumber()
        totalPages()
        pageSize()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (pageNumber.asKnown().isPresent) 1 else 0) +
            (if (totalPages.asKnown().isPresent) 1 else 0) +
            (if (pageSize.asKnown().isPresent) 1 else 0) +
            (if (totalResults.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StandardPaginationMeta &&
            pageNumber == other.pageNumber &&
            totalPages == other.totalPages &&
            pageSize == other.pageSize &&
            totalResults == other.totalResults &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(pageNumber, totalPages, pageSize, totalResults, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "StandardPaginationMeta{pageNumber=$pageNumber, totalPages=$totalPages, pageSize=$pageSize, totalResults=$totalResults, additionalProperties=$additionalProperties}"
}
