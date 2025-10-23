// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.comments

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Retrieve all comments */
class CommentListParams
private constructor(
    private val filter: Filter?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Consolidated filter parameter (deepObject style). Originally: filter[comment_record_type],
     * filter[comment_record_id]
     */
    fun filter(): Optional<Filter> = Optional.ofNullable(filter)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): CommentListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [CommentListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CommentListParams]. */
    class Builder internal constructor() {

        private var filter: Filter? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(commentListParams: CommentListParams) = apply {
            filter = commentListParams.filter
            additionalHeaders = commentListParams.additionalHeaders.toBuilder()
            additionalQueryParams = commentListParams.additionalQueryParams.toBuilder()
        }

        /**
         * Consolidated filter parameter (deepObject style). Originally:
         * filter[comment_record_type], filter[comment_record_id]
         */
        fun filter(filter: Filter?) = apply { this.filter = filter }

        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
        fun filter(filter: Optional<Filter>) = filter(filter.getOrNull())

        fun additionalHeaders(additionalHeaders: Headers) = apply {
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

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
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

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
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
         * Returns an immutable instance of [CommentListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CommentListParams =
            CommentListParams(filter, additionalHeaders.build(), additionalQueryParams.build())
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                filter?.let {
                    it.commentRecordId().ifPresent { put("filter[comment_record_id]", it) }
                    it.commentRecordType().ifPresent {
                        put("filter[comment_record_type]", it.toString())
                    }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("filter[$key]", value)
                        }
                    }
                }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Consolidated filter parameter (deepObject style). Originally: filter[comment_record_type],
     * filter[comment_record_id]
     */
    class Filter
    private constructor(
        private val commentRecordId: String?,
        private val commentRecordType: CommentRecordType?,
        private val additionalProperties: QueryParams,
    ) {

        /** ID of the record the comments relate to */
        fun commentRecordId(): Optional<String> = Optional.ofNullable(commentRecordId)

        /** Record type that the comment relates to */
        fun commentRecordType(): Optional<CommentRecordType> =
            Optional.ofNullable(commentRecordType)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Filter]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filter]. */
        class Builder internal constructor() {

            private var commentRecordId: String? = null
            private var commentRecordType: CommentRecordType? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                commentRecordId = filter.commentRecordId
                commentRecordType = filter.commentRecordType
                additionalProperties = filter.additionalProperties.toBuilder()
            }

            /** ID of the record the comments relate to */
            fun commentRecordId(commentRecordId: String?) = apply {
                this.commentRecordId = commentRecordId
            }

            /** Alias for calling [Builder.commentRecordId] with `commentRecordId.orElse(null)`. */
            fun commentRecordId(commentRecordId: Optional<String>) =
                commentRecordId(commentRecordId.getOrNull())

            /** Record type that the comment relates to */
            fun commentRecordType(commentRecordType: CommentRecordType?) = apply {
                this.commentRecordType = commentRecordType
            }

            /**
             * Alias for calling [Builder.commentRecordType] with `commentRecordType.orElse(null)`.
             */
            fun commentRecordType(commentRecordType: Optional<CommentRecordType>) =
                commentRecordType(commentRecordType.getOrNull())

            fun additionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceAdditionalProperties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAllAdditionalProperties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeAdditionalProperties(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                additionalProperties.removeAll(keys)
            }

            /**
             * Returns an immutable instance of [Filter].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Filter =
                Filter(commentRecordId, commentRecordType, additionalProperties.build())
        }

        /** Record type that the comment relates to */
        class CommentRecordType
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val SUB_NUMBER_ORDER = of("sub_number_order")

                @JvmField val REQUIREMENT_GROUP = of("requirement_group")

                @JvmStatic fun of(value: String) = CommentRecordType(JsonField.of(value))
            }

            /** An enum containing [CommentRecordType]'s known values. */
            enum class Known {
                SUB_NUMBER_ORDER,
                REQUIREMENT_GROUP,
            }

            /**
             * An enum containing [CommentRecordType]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [CommentRecordType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                SUB_NUMBER_ORDER,
                REQUIREMENT_GROUP,
                /**
                 * An enum member indicating that [CommentRecordType] was instantiated with an
                 * unknown value.
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
                    SUB_NUMBER_ORDER -> Value.SUB_NUMBER_ORDER
                    REQUIREMENT_GROUP -> Value.REQUIREMENT_GROUP
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
                    SUB_NUMBER_ORDER -> Known.SUB_NUMBER_ORDER
                    REQUIREMENT_GROUP -> Known.REQUIREMENT_GROUP
                    else -> throw TelnyxInvalidDataException("Unknown CommentRecordType: $value")
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

            fun validate(): CommentRecordType = apply {
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

                return other is CommentRecordType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filter &&
                commentRecordId == other.commentRecordId &&
                commentRecordType == other.commentRecordType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(commentRecordId, commentRecordType, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filter{commentRecordId=$commentRecordId, commentRecordType=$commentRecordType, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CommentListParams &&
            filter == other.filter &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(filter, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CommentListParams{filter=$filter, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
