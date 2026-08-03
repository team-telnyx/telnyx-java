// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes.threads

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

class EmailPaginationMeta
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val pageSize: JsonField<Long>,
    private val pageCursor: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("page_size") @ExcludeMissing pageSize: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("page_cursor")
        @ExcludeMissing
        pageCursor: JsonField<String> = JsonMissing.of(),
    ) : this(pageSize, pageCursor, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pageSize(): Long = pageSize.getRequired("page_size")

    /**
     * Cursor for the next page, when more results are available.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pageCursor(): Optional<String> = pageCursor.getOptional("page_cursor")

    /**
     * Returns the raw JSON value of [pageSize].
     *
     * Unlike [pageSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("page_size") @ExcludeMissing fun _pageSize(): JsonField<Long> = pageSize

    /**
     * Returns the raw JSON value of [pageCursor].
     *
     * Unlike [pageCursor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("page_cursor") @ExcludeMissing fun _pageCursor(): JsonField<String> = pageCursor

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
         * Returns a mutable builder for constructing an instance of [EmailPaginationMeta].
         *
         * The following fields are required:
         * ```java
         * .pageSize()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EmailPaginationMeta]. */
    class Builder internal constructor() {

        private var pageSize: JsonField<Long>? = null
        private var pageCursor: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(emailPaginationMeta: EmailPaginationMeta) = apply {
            pageSize = emailPaginationMeta.pageSize
            pageCursor = emailPaginationMeta.pageCursor
            additionalProperties = emailPaginationMeta.additionalProperties.toMutableMap()
        }

        fun pageSize(pageSize: Long) = pageSize(JsonField.of(pageSize))

        /**
         * Sets [Builder.pageSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pageSize] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pageSize(pageSize: JsonField<Long>) = apply { this.pageSize = pageSize }

        /** Cursor for the next page, when more results are available. */
        fun pageCursor(pageCursor: String) = pageCursor(JsonField.of(pageCursor))

        /**
         * Sets [Builder.pageCursor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pageCursor] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pageCursor(pageCursor: JsonField<String>) = apply { this.pageCursor = pageCursor }

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
         * Returns an immutable instance of [EmailPaginationMeta].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .pageSize()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EmailPaginationMeta =
            EmailPaginationMeta(
                checkRequired("pageSize", pageSize),
                pageCursor,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): EmailPaginationMeta = apply {
        if (validated) {
            return@apply
        }

        pageSize()
        pageCursor()
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
        (if (pageSize.asKnown().isPresent) 1 else 0) +
            (if (pageCursor.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailPaginationMeta &&
            pageSize == other.pageSize &&
            pageCursor == other.pageCursor &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(pageSize, pageCursor, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EmailPaginationMeta{pageSize=$pageSize, pageCursor=$pageCursor, additionalProperties=$additionalProperties}"
}
