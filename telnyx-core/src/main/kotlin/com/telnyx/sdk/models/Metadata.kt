// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models

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

class Metadata
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val pageNumber: JsonField<Double>,
    private val totalPages: JsonField<Double>,
    private val pageSize: JsonField<Double>,
    private val totalResults: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("page_number")
        @ExcludeMissing
        pageNumber: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("total_pages")
        @ExcludeMissing
        totalPages: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("page_size") @ExcludeMissing pageSize: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("total_results")
        @ExcludeMissing
        totalResults: JsonField<Double> = JsonMissing.of(),
    ) : this(pageNumber, totalPages, pageSize, totalResults, mutableMapOf())

    /**
     * Current Page based on pagination settings (included when defaults are used.)
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pageNumber(): Double = pageNumber.getRequired("page_number")

    /**
     * Total number of pages based on pagination settings
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun totalPages(): Double = totalPages.getRequired("total_pages")

    /**
     * Number of results to return per page based on pagination settings (included when defaults are
     * used.)
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pageSize(): Optional<Double> = pageSize.getOptional("page_size")

    /**
     * Total number of results
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalResults(): Optional<Double> = totalResults.getOptional("total_results")

    /**
     * Returns the raw JSON value of [pageNumber].
     *
     * Unlike [pageNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("page_number") @ExcludeMissing fun _pageNumber(): JsonField<Double> = pageNumber

    /**
     * Returns the raw JSON value of [totalPages].
     *
     * Unlike [totalPages], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_pages") @ExcludeMissing fun _totalPages(): JsonField<Double> = totalPages

    /**
     * Returns the raw JSON value of [pageSize].
     *
     * Unlike [pageSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("page_size") @ExcludeMissing fun _pageSize(): JsonField<Double> = pageSize

    /**
     * Returns the raw JSON value of [totalResults].
     *
     * Unlike [totalResults], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_results")
    @ExcludeMissing
    fun _totalResults(): JsonField<Double> = totalResults

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
         * Returns a mutable builder for constructing an instance of [Metadata].
         *
         * The following fields are required:
         * ```java
         * .pageNumber()
         * .totalPages()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Metadata]. */
    class Builder internal constructor() {

        private var pageNumber: JsonField<Double>? = null
        private var totalPages: JsonField<Double>? = null
        private var pageSize: JsonField<Double> = JsonMissing.of()
        private var totalResults: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(metadata: Metadata) = apply {
            pageNumber = metadata.pageNumber
            totalPages = metadata.totalPages
            pageSize = metadata.pageSize
            totalResults = metadata.totalResults
            additionalProperties = metadata.additionalProperties.toMutableMap()
        }

        /** Current Page based on pagination settings (included when defaults are used.) */
        fun pageNumber(pageNumber: Double) = pageNumber(JsonField.of(pageNumber))

        /**
         * Sets [Builder.pageNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pageNumber] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pageNumber(pageNumber: JsonField<Double>) = apply { this.pageNumber = pageNumber }

        /** Total number of pages based on pagination settings */
        fun totalPages(totalPages: Double) = totalPages(JsonField.of(totalPages))

        /**
         * Sets [Builder.totalPages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalPages] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalPages(totalPages: JsonField<Double>) = apply { this.totalPages = totalPages }

        /**
         * Number of results to return per page based on pagination settings (included when defaults
         * are used.)
         */
        fun pageSize(pageSize: Double) = pageSize(JsonField.of(pageSize))

        /**
         * Sets [Builder.pageSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pageSize] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pageSize(pageSize: JsonField<Double>) = apply { this.pageSize = pageSize }

        /** Total number of results */
        fun totalResults(totalResults: Double) = totalResults(JsonField.of(totalResults))

        /**
         * Sets [Builder.totalResults] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalResults] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalResults(totalResults: JsonField<Double>) = apply {
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
         * Returns an immutable instance of [Metadata].
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
        fun build(): Metadata =
            Metadata(
                checkRequired("pageNumber", pageNumber),
                checkRequired("totalPages", totalPages),
                pageSize,
                totalResults,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Metadata = apply {
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

        return other is Metadata &&
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
        "Metadata{pageNumber=$pageNumber, totalPages=$totalPages, pageSize=$pageSize, totalResults=$totalResults, additionalProperties=$additionalProperties}"
}
