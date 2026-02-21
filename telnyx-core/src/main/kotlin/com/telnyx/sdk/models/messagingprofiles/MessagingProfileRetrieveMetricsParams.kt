// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingprofiles

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

/** Get detailed metrics for a specific messaging profile, broken down by time interval. */
class MessagingProfileRetrieveMetricsParams
private constructor(
    private val id: String?,
    private val timeFrame: TimeFrame?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /** The time frame for metrics. */
    fun timeFrame(): Optional<TimeFrame> = Optional.ofNullable(timeFrame)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): MessagingProfileRetrieveMetricsParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [MessagingProfileRetrieveMetricsParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MessagingProfileRetrieveMetricsParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var timeFrame: TimeFrame? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            messagingProfileRetrieveMetricsParams: MessagingProfileRetrieveMetricsParams
        ) = apply {
            id = messagingProfileRetrieveMetricsParams.id
            timeFrame = messagingProfileRetrieveMetricsParams.timeFrame
            additionalHeaders = messagingProfileRetrieveMetricsParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                messagingProfileRetrieveMetricsParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /** The time frame for metrics. */
        fun timeFrame(timeFrame: TimeFrame?) = apply { this.timeFrame = timeFrame }

        /** Alias for calling [Builder.timeFrame] with `timeFrame.orElse(null)`. */
        fun timeFrame(timeFrame: Optional<TimeFrame>) = timeFrame(timeFrame.getOrNull())

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
         * Returns an immutable instance of [MessagingProfileRetrieveMetricsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MessagingProfileRetrieveMetricsParams =
            MessagingProfileRetrieveMetricsParams(
                id,
                timeFrame,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                timeFrame?.let { put("time_frame", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /** The time frame for metrics. */
    class TimeFrame @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val _1H = of("1h")

            @JvmField val _3H = of("3h")

            @JvmField val _24H = of("24h")

            @JvmField val _3D = of("3d")

            @JvmField val _7D = of("7d")

            @JvmField val _30D = of("30d")

            @JvmStatic fun of(value: String) = TimeFrame(JsonField.of(value))
        }

        /** An enum containing [TimeFrame]'s known values. */
        enum class Known {
            _1H,
            _3H,
            _24H,
            _3D,
            _7D,
            _30D,
        }

        /**
         * An enum containing [TimeFrame]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TimeFrame] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            _1H,
            _3H,
            _24H,
            _3D,
            _7D,
            _30D,
            /**
             * An enum member indicating that [TimeFrame] was instantiated with an unknown value.
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
                _1H -> Value._1H
                _3H -> Value._3H
                _24H -> Value._24H
                _3D -> Value._3D
                _7D -> Value._7D
                _30D -> Value._30D
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
                _1H -> Known._1H
                _3H -> Known._3H
                _24H -> Known._24H
                _3D -> Known._3D
                _7D -> Known._7D
                _30D -> Known._30D
                else -> throw TelnyxInvalidDataException("Unknown TimeFrame: $value")
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

        fun validate(): TimeFrame = apply {
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

            return other is TimeFrame && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MessagingProfileRetrieveMetricsParams &&
            id == other.id &&
            timeFrame == other.timeFrame &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(id, timeFrame, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "MessagingProfileRetrieveMetricsParams{id=$id, timeFrame=$timeFrame, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
