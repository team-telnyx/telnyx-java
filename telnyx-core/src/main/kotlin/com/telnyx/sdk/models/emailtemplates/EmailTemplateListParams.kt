// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailtemplates

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Lists templates sorted newest first by `created_at desc, id desc`. Optional filters match a
 * case-insensitive literal name/subject query, stored body presence, and the `strict_variables` and
 * `autoescape` settings. Filters intersect, remain scoped to the authenticated account, and apply
 * before cursor pagination. Invalid filter names or values return 400.
 */
class EmailTemplateListParams
private constructor(
    private val filterAutoescape: FilterAutoescape?,
    private val filterContentType: FilterContentType?,
    private val filterQuery: String?,
    private val filterStrictVariables: FilterStrictVariables?,
    private val pageCursor: String?,
    private val pageSize: Long?,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Exact match on the template's `autoescape` option. Only the exact query strings `true` and
     * `false` are accepted; other values, including blank, return 400.
     */
    fun filterAutoescape(): Optional<FilterAutoescape> = Optional.ofNullable(filterAutoescape)

    /**
     * Matches templates by stored body presence. `html_and_text` requires both an HTML and text
     * body; `html_only` requires HTML and no text body; `text_only` requires text and no HTML body;
     * `no_body` requires neither. `null` and exactly `""` count as absent; whitespace-only strings
     * count as content. An empty or unsupported value returns a 400 response.
     */
    fun filterContentType(): Optional<FilterContentType> = Optional.ofNullable(filterContentType)

    /**
     * Case-insensitive literal substring match over the template `name` or stored `subject` only;
     * bodies are never searched. `%`, `_`, and `\` are literal characters with no wildcard meaning.
     * A blank value is treated as omitted.
     */
    fun filterQuery(): Optional<String> = Optional.ofNullable(filterQuery)

    /**
     * Exact match on the template's `strict_variables` option. Only the exact query strings `true`
     * and `false` are accepted; other values, including blank, return 400.
     */
    fun filterStrictVariables(): Optional<FilterStrictVariables> =
        Optional.ofNullable(filterStrictVariables)

    /** Opaque URL-safe Base64 cursor returned by a previous list response. */
    fun pageCursor(): Optional<String> = Optional.ofNullable(pageCursor)

    /**
     * Number of results to return. Defaults to 25; maximum is 100. Invalid values are clamped to
     * the valid range.
     */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): EmailTemplateListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [EmailTemplateListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EmailTemplateListParams]. */
    class Builder internal constructor() {

        private var filterAutoescape: FilterAutoescape? = null
        private var filterContentType: FilterContentType? = null
        private var filterQuery: String? = null
        private var filterStrictVariables: FilterStrictVariables? = null
        private var pageCursor: String? = null
        private var pageSize: Long? = null
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(emailTemplateListParams: EmailTemplateListParams) = apply {
            filterAutoescape = emailTemplateListParams.filterAutoescape
            filterContentType = emailTemplateListParams.filterContentType
            filterQuery = emailTemplateListParams.filterQuery
            filterStrictVariables = emailTemplateListParams.filterStrictVariables
            pageCursor = emailTemplateListParams.pageCursor
            pageSize = emailTemplateListParams.pageSize
            additionalHeaders = emailTemplateListParams.additionalHeaders.toBuilder()
            additionalQueryParams = emailTemplateListParams.additionalQueryParams.toBuilder()
        }

        /**
         * Exact match on the template's `autoescape` option. Only the exact query strings `true`
         * and `false` are accepted; other values, including blank, return 400.
         */
        fun filterAutoescape(filterAutoescape: FilterAutoescape?) = apply {
            this.filterAutoescape = filterAutoescape
        }

        /** Alias for calling [Builder.filterAutoescape] with `filterAutoescape.orElse(null)`. */
        fun filterAutoescape(filterAutoescape: Optional<FilterAutoescape>) =
            filterAutoescape(filterAutoescape.getOrNull())

        /**
         * Matches templates by stored body presence. `html_and_text` requires both an HTML and text
         * body; `html_only` requires HTML and no text body; `text_only` requires text and no HTML
         * body; `no_body` requires neither. `null` and exactly `""` count as absent;
         * whitespace-only strings count as content. An empty or unsupported value returns a 400
         * response.
         */
        fun filterContentType(filterContentType: FilterContentType?) = apply {
            this.filterContentType = filterContentType
        }

        /** Alias for calling [Builder.filterContentType] with `filterContentType.orElse(null)`. */
        fun filterContentType(filterContentType: Optional<FilterContentType>) =
            filterContentType(filterContentType.getOrNull())

        /**
         * Case-insensitive literal substring match over the template `name` or stored `subject`
         * only; bodies are never searched. `%`, `_`, and `\` are literal characters with no
         * wildcard meaning. A blank value is treated as omitted.
         */
        fun filterQuery(filterQuery: String?) = apply { this.filterQuery = filterQuery }

        /** Alias for calling [Builder.filterQuery] with `filterQuery.orElse(null)`. */
        fun filterQuery(filterQuery: Optional<String>) = filterQuery(filterQuery.getOrNull())

        /**
         * Exact match on the template's `strict_variables` option. Only the exact query strings
         * `true` and `false` are accepted; other values, including blank, return 400.
         */
        fun filterStrictVariables(filterStrictVariables: FilterStrictVariables?) = apply {
            this.filterStrictVariables = filterStrictVariables
        }

        /**
         * Alias for calling [Builder.filterStrictVariables] with
         * `filterStrictVariables.orElse(null)`.
         */
        fun filterStrictVariables(filterStrictVariables: Optional<FilterStrictVariables>) =
            filterStrictVariables(filterStrictVariables.getOrNull())

        /** Opaque URL-safe Base64 cursor returned by a previous list response. */
        fun pageCursor(pageCursor: String?) = apply { this.pageCursor = pageCursor }

        /** Alias for calling [Builder.pageCursor] with `pageCursor.orElse(null)`. */
        fun pageCursor(pageCursor: Optional<String>) = pageCursor(pageCursor.getOrNull())

        /**
         * Number of results to return. Defaults to 25; maximum is 100. Invalid values are clamped
         * to the valid range.
         */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

        fun additionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
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

        fun putAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
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

        fun replaceAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) =
            apply {
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
         * Returns an immutable instance of [EmailTemplateListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): EmailTemplateListParams =
            EmailTemplateListParams(
                filterAutoescape,
                filterContentType,
                filterQuery,
                filterStrictVariables,
                pageCursor,
                pageSize,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                filterAutoescape?.let { put("filter[autoescape]", it.toString()) }
                filterContentType?.let { put("filter[content_type]", it.toString()) }
                filterQuery?.let { put("filter[query]", it) }
                filterStrictVariables?.let { put("filter[strict_variables]", it.toString()) }
                pageCursor?.let { put("page_cursor", it) }
                pageSize?.let { put("page_size", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Exact match on the template's `autoescape` option. Only the exact query strings `true` and
     * `false` are accepted; other values, including blank, return 400.
     */
    class FilterAutoescape @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val TRUE = of("true")

            @JvmField val FALSE = of("false")

            @JvmStatic fun of(value: String) = FilterAutoescape(JsonField.of(value))
        }

        /** An enum containing [FilterAutoescape]'s known values. */
        enum class Known {
            TRUE,
            FALSE,
        }

        /**
         * An enum containing [FilterAutoescape]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [FilterAutoescape] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TRUE,
            FALSE,
            /**
             * An enum member indicating that [FilterAutoescape] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                TRUE -> Value.TRUE
                FALSE -> Value.FALSE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                TRUE -> Known.TRUE
                FALSE -> Known.FALSE
                else -> throw TelnyxInvalidDataException("Unknown FilterAutoescape: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): FilterAutoescape = apply {
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

            return other is FilterAutoescape && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Matches templates by stored body presence. `html_and_text` requires both an HTML and text
     * body; `html_only` requires HTML and no text body; `text_only` requires text and no HTML body;
     * `no_body` requires neither. `null` and exactly `""` count as absent; whitespace-only strings
     * count as content. An empty or unsupported value returns a 400 response.
     */
    class FilterContentType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val HTML_AND_TEXT = of("html_and_text")

            @JvmField val HTML_ONLY = of("html_only")

            @JvmField val TEXT_ONLY = of("text_only")

            @JvmField val NO_BODY = of("no_body")

            @JvmStatic fun of(value: String) = FilterContentType(JsonField.of(value))
        }

        /** An enum containing [FilterContentType]'s known values. */
        enum class Known {
            HTML_AND_TEXT,
            HTML_ONLY,
            TEXT_ONLY,
            NO_BODY,
        }

        /**
         * An enum containing [FilterContentType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [FilterContentType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            HTML_AND_TEXT,
            HTML_ONLY,
            TEXT_ONLY,
            NO_BODY,
            /**
             * An enum member indicating that [FilterContentType] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                HTML_AND_TEXT -> Value.HTML_AND_TEXT
                HTML_ONLY -> Value.HTML_ONLY
                TEXT_ONLY -> Value.TEXT_ONLY
                NO_BODY -> Value.NO_BODY
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                HTML_AND_TEXT -> Known.HTML_AND_TEXT
                HTML_ONLY -> Known.HTML_ONLY
                TEXT_ONLY -> Known.TEXT_ONLY
                NO_BODY -> Known.NO_BODY
                else -> throw TelnyxInvalidDataException("Unknown FilterContentType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): FilterContentType = apply {
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

            return other is FilterContentType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Exact match on the template's `strict_variables` option. Only the exact query strings `true`
     * and `false` are accepted; other values, including blank, return 400.
     */
    class FilterStrictVariables
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val TRUE = of("true")

            @JvmField val FALSE = of("false")

            @JvmStatic fun of(value: String) = FilterStrictVariables(JsonField.of(value))
        }

        /** An enum containing [FilterStrictVariables]'s known values. */
        enum class Known {
            TRUE,
            FALSE,
        }

        /**
         * An enum containing [FilterStrictVariables]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [FilterStrictVariables] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TRUE,
            FALSE,
            /**
             * An enum member indicating that [FilterStrictVariables] was instantiated with an
             * unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                TRUE -> Value.TRUE
                FALSE -> Value.FALSE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                TRUE -> Known.TRUE
                FALSE -> Known.FALSE
                else -> throw TelnyxInvalidDataException("Unknown FilterStrictVariables: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): FilterStrictVariables = apply {
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

            return other is FilterStrictVariables && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailTemplateListParams &&
            filterAutoescape == other.filterAutoescape &&
            filterContentType == other.filterContentType &&
            filterQuery == other.filterQuery &&
            filterStrictVariables == other.filterStrictVariables &&
            pageCursor == other.pageCursor &&
            pageSize == other.pageSize &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            filterAutoescape,
            filterContentType,
            filterQuery,
            filterStrictVariables,
            pageCursor,
            pageSize,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "EmailTemplateListParams{filterAutoescape=$filterAutoescape, filterContentType=$filterContentType, filterQuery=$filterQuery, filterStrictVariables=$filterStrictVariables, pageCursor=$pageCursor, pageSize=$pageSize, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
