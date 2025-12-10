// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalconnections

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

class ExternalVoiceIntegrationsPaginationMeta
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val pageNumber: JsonField<Long>,
    private val totalPages: JsonField<Long>,
    private val pageSize: JsonField<Long>,
    private val totalResults: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("page_number") @ExcludeMissing pageNumber: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("total_pages") @ExcludeMissing totalPages: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("page_size") @ExcludeMissing pageSize: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("total_results")
        @ExcludeMissing
        totalResults: JsonField<Long> = JsonMissing.of(),
    ) : this(pageNumber, totalPages, pageSize, totalResults, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pageNumber(): Long = pageNumber.getRequired("page_number")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun totalPages(): Long = totalPages.getRequired("total_pages")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pageSize(): Optional<Long> = pageSize.getOptional("page_size")

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
     * Returns the raw JSON value of [totalPages].
     *
     * Unlike [totalPages], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_pages") @ExcludeMissing fun _totalPages(): JsonField<Long> = totalPages

    /**
     * Returns the raw JSON value of [pageSize].
     *
     * Unlike [pageSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("page_size") @ExcludeMissing fun _pageSize(): JsonField<Long> = pageSize

    /**
     * Returns the raw JSON value of [totalResults].
     *
     * Unlike [totalResults], this method doesn't throw if the JSON field has an unexpected type.
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

        /**
         * Returns a mutable builder for constructing an instance of
         * [ExternalVoiceIntegrationsPaginationMeta].
         *
         * The following fields are required:
         * ```java
         * .pageNumber()
         * .totalPages()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalVoiceIntegrationsPaginationMeta]. */
    class Builder internal constructor() {

        private var pageNumber: JsonField<Long>? = null
        private var totalPages: JsonField<Long>? = null
        private var pageSize: JsonField<Long> = JsonMissing.of()
        private var totalResults: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            externalVoiceIntegrationsPaginationMeta: ExternalVoiceIntegrationsPaginationMeta
        ) = apply {
            pageNumber = externalVoiceIntegrationsPaginationMeta.pageNumber
            totalPages = externalVoiceIntegrationsPaginationMeta.totalPages
            pageSize = externalVoiceIntegrationsPaginationMeta.pageSize
            totalResults = externalVoiceIntegrationsPaginationMeta.totalResults
            additionalProperties =
                externalVoiceIntegrationsPaginationMeta.additionalProperties.toMutableMap()
        }

        fun pageNumber(pageNumber: Long) = pageNumber(JsonField.of(pageNumber))

        /**
         * Sets [Builder.pageNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pageNumber] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pageNumber(pageNumber: JsonField<Long>) = apply { this.pageNumber = pageNumber }

        fun totalPages(totalPages: Long) = totalPages(JsonField.of(totalPages))

        /**
         * Sets [Builder.totalPages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalPages] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun totalPages(totalPages: JsonField<Long>) = apply { this.totalPages = totalPages }

        fun pageSize(pageSize: Long) = pageSize(JsonField.of(pageSize))

        /**
         * Sets [Builder.pageSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pageSize] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pageSize(pageSize: JsonField<Long>) = apply { this.pageSize = pageSize }

        fun totalResults(totalResults: Long) = totalResults(JsonField.of(totalResults))

        /**
         * Sets [Builder.totalResults] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalResults] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalResults(totalResults: JsonField<Long>) = apply { this.totalResults = totalResults }

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
         * Returns an immutable instance of [ExternalVoiceIntegrationsPaginationMeta].
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
        fun build(): ExternalVoiceIntegrationsPaginationMeta =
            ExternalVoiceIntegrationsPaginationMeta(
                checkRequired("pageNumber", pageNumber),
                checkRequired("totalPages", totalPages),
                pageSize,
                totalResults,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExternalVoiceIntegrationsPaginationMeta = apply {
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

        return other is ExternalVoiceIntegrationsPaginationMeta &&
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
        "ExternalVoiceIntegrationsPaginationMeta{pageNumber=$pageNumber, totalPages=$totalPages, pageSize=$pageSize, totalResults=$totalResults, additionalProperties=$additionalProperties}"
}
