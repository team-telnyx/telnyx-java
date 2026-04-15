// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.sessionanalysis

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieves a full session analysis tree for a given event, including costs, child events, and
 * product linkages.
 */
class SessionAnalysisRetrieveParams
private constructor(
    private val recordType: String,
    private val eventId: String?,
    private val dateTime: OffsetDateTime?,
    private val expand: Expand?,
    private val includeChildren: Boolean?,
    private val maxDepth: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun recordType(): String = recordType

    fun eventId(): Optional<String> = Optional.ofNullable(eventId)

    /**
     * ISO 8601 timestamp or date to narrow index selection for faster lookups. Accepts full
     * datetime (e.g., 2026-03-17T10:00:00Z) or date-only format (e.g., 2026-03-17).
     */
    fun dateTime(): Optional<OffsetDateTime> = Optional.ofNullable(dateTime)

    /** Controls what data to expand on each event node. */
    fun expand(): Optional<Expand> = Optional.ofNullable(expand)

    /** Whether to include child events in the response. */
    fun includeChildren(): Optional<Boolean> = Optional.ofNullable(includeChildren)

    /** Maximum traversal depth for the event tree. */
    fun maxDepth(): Optional<Long> = Optional.ofNullable(maxDepth)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SessionAnalysisRetrieveParams].
         *
         * The following fields are required:
         * ```java
         * .recordType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SessionAnalysisRetrieveParams]. */
    class Builder internal constructor() {

        private var recordType: String? = null
        private var eventId: String? = null
        private var dateTime: OffsetDateTime? = null
        private var expand: Expand? = null
        private var includeChildren: Boolean? = null
        private var maxDepth: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(sessionAnalysisRetrieveParams: SessionAnalysisRetrieveParams) = apply {
            recordType = sessionAnalysisRetrieveParams.recordType
            eventId = sessionAnalysisRetrieveParams.eventId
            dateTime = sessionAnalysisRetrieveParams.dateTime
            expand = sessionAnalysisRetrieveParams.expand
            includeChildren = sessionAnalysisRetrieveParams.includeChildren
            maxDepth = sessionAnalysisRetrieveParams.maxDepth
            additionalHeaders = sessionAnalysisRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams = sessionAnalysisRetrieveParams.additionalQueryParams.toBuilder()
        }

        fun recordType(recordType: String) = apply { this.recordType = recordType }

        fun eventId(eventId: String?) = apply { this.eventId = eventId }

        /** Alias for calling [Builder.eventId] with `eventId.orElse(null)`. */
        fun eventId(eventId: Optional<String>) = eventId(eventId.getOrNull())

        /**
         * ISO 8601 timestamp or date to narrow index selection for faster lookups. Accepts full
         * datetime (e.g., 2026-03-17T10:00:00Z) or date-only format (e.g., 2026-03-17).
         */
        fun dateTime(dateTime: OffsetDateTime?) = apply { this.dateTime = dateTime }

        /** Alias for calling [Builder.dateTime] with `dateTime.orElse(null)`. */
        fun dateTime(dateTime: Optional<OffsetDateTime>) = dateTime(dateTime.getOrNull())

        /** Controls what data to expand on each event node. */
        fun expand(expand: Expand?) = apply { this.expand = expand }

        /** Alias for calling [Builder.expand] with `expand.orElse(null)`. */
        fun expand(expand: Optional<Expand>) = expand(expand.getOrNull())

        /** Whether to include child events in the response. */
        fun includeChildren(includeChildren: Boolean?) = apply {
            this.includeChildren = includeChildren
        }

        /**
         * Alias for [Builder.includeChildren].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeChildren(includeChildren: Boolean) = includeChildren(includeChildren as Boolean?)

        /** Alias for calling [Builder.includeChildren] with `includeChildren.orElse(null)`. */
        fun includeChildren(includeChildren: Optional<Boolean>) =
            includeChildren(includeChildren.getOrNull())

        /** Maximum traversal depth for the event tree. */
        fun maxDepth(maxDepth: Long?) = apply { this.maxDepth = maxDepth }

        /**
         * Alias for [Builder.maxDepth].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxDepth(maxDepth: Long) = maxDepth(maxDepth as Long?)

        /** Alias for calling [Builder.maxDepth] with `maxDepth.orElse(null)`. */
        fun maxDepth(maxDepth: Optional<Long>) = maxDepth(maxDepth.getOrNull())

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
         * Returns an immutable instance of [SessionAnalysisRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .recordType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SessionAnalysisRetrieveParams =
            SessionAnalysisRetrieveParams(
                checkRequired("recordType", recordType),
                eventId,
                dateTime,
                expand,
                includeChildren,
                maxDepth,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> recordType
            1 -> eventId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                dateTime?.let {
                    put("date_time", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                expand?.let { put("expand", it.toString()) }
                includeChildren?.let { put("include_children", it.toString()) }
                maxDepth?.let { put("max_depth", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Controls what data to expand on each event node. */
    class Expand @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val RECORD = of("record")

            @JvmField val NONE = of("none")

            @JvmStatic fun of(value: String) = Expand(JsonField.of(value))
        }

        /** An enum containing [Expand]'s known values. */
        enum class Known {
            RECORD,
            NONE,
        }

        /**
         * An enum containing [Expand]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Expand] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            RECORD,
            NONE,
            /** An enum member indicating that [Expand] was instantiated with an unknown value. */
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
                RECORD -> Value.RECORD
                NONE -> Value.NONE
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
                RECORD -> Known.RECORD
                NONE -> Known.NONE
                else -> throw TelnyxInvalidDataException("Unknown Expand: $value")
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

        fun validate(): Expand = apply {
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

            return other is Expand && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SessionAnalysisRetrieveParams &&
            recordType == other.recordType &&
            eventId == other.eventId &&
            dateTime == other.dateTime &&
            expand == other.expand &&
            includeChildren == other.includeChildren &&
            maxDepth == other.maxDepth &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            recordType,
            eventId,
            dateTime,
            expand,
            includeChildren,
            maxDepth,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "SessionAnalysisRetrieveParams{recordType=$recordType, eventId=$eventId, dateTime=$dateTime, expand=$expand, includeChildren=$includeChildren, maxDepth=$maxDepth, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
