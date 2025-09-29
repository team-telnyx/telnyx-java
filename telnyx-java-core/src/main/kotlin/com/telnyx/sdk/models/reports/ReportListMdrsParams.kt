// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.reports

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

/** Fetch all Mdr records */
class ReportListMdrsParams
private constructor(
    private val id: String?,
    private val cld: String?,
    private val cli: String?,
    private val direction: Direction?,
    private val endDate: String?,
    private val messageType: MessageType?,
    private val profile: String?,
    private val startDate: String?,
    private val status: Status?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Message uuid */
    fun id(): Optional<String> = Optional.ofNullable(id)

    /** Destination number */
    fun cld(): Optional<String> = Optional.ofNullable(cld)

    /** Origination number */
    fun cli(): Optional<String> = Optional.ofNullable(cli)

    /** Direction (inbound or outbound) */
    fun direction(): Optional<Direction> = Optional.ofNullable(direction)

    /** Pagination end date */
    fun endDate(): Optional<String> = Optional.ofNullable(endDate)

    /** Type of message */
    fun messageType(): Optional<MessageType> = Optional.ofNullable(messageType)

    /** Name of the profile */
    fun profile(): Optional<String> = Optional.ofNullable(profile)

    /** Pagination start date */
    fun startDate(): Optional<String> = Optional.ofNullable(startDate)

    /** Message status */
    fun status(): Optional<Status> = Optional.ofNullable(status)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ReportListMdrsParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ReportListMdrsParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ReportListMdrsParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var cld: String? = null
        private var cli: String? = null
        private var direction: Direction? = null
        private var endDate: String? = null
        private var messageType: MessageType? = null
        private var profile: String? = null
        private var startDate: String? = null
        private var status: Status? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(reportListMdrsParams: ReportListMdrsParams) = apply {
            id = reportListMdrsParams.id
            cld = reportListMdrsParams.cld
            cli = reportListMdrsParams.cli
            direction = reportListMdrsParams.direction
            endDate = reportListMdrsParams.endDate
            messageType = reportListMdrsParams.messageType
            profile = reportListMdrsParams.profile
            startDate = reportListMdrsParams.startDate
            status = reportListMdrsParams.status
            additionalHeaders = reportListMdrsParams.additionalHeaders.toBuilder()
            additionalQueryParams = reportListMdrsParams.additionalQueryParams.toBuilder()
        }

        /** Message uuid */
        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /** Destination number */
        fun cld(cld: String?) = apply { this.cld = cld }

        /** Alias for calling [Builder.cld] with `cld.orElse(null)`. */
        fun cld(cld: Optional<String>) = cld(cld.getOrNull())

        /** Origination number */
        fun cli(cli: String?) = apply { this.cli = cli }

        /** Alias for calling [Builder.cli] with `cli.orElse(null)`. */
        fun cli(cli: Optional<String>) = cli(cli.getOrNull())

        /** Direction (inbound or outbound) */
        fun direction(direction: Direction?) = apply { this.direction = direction }

        /** Alias for calling [Builder.direction] with `direction.orElse(null)`. */
        fun direction(direction: Optional<Direction>) = direction(direction.getOrNull())

        /** Pagination end date */
        fun endDate(endDate: String?) = apply { this.endDate = endDate }

        /** Alias for calling [Builder.endDate] with `endDate.orElse(null)`. */
        fun endDate(endDate: Optional<String>) = endDate(endDate.getOrNull())

        /** Type of message */
        fun messageType(messageType: MessageType?) = apply { this.messageType = messageType }

        /** Alias for calling [Builder.messageType] with `messageType.orElse(null)`. */
        fun messageType(messageType: Optional<MessageType>) = messageType(messageType.getOrNull())

        /** Name of the profile */
        fun profile(profile: String?) = apply { this.profile = profile }

        /** Alias for calling [Builder.profile] with `profile.orElse(null)`. */
        fun profile(profile: Optional<String>) = profile(profile.getOrNull())

        /** Pagination start date */
        fun startDate(startDate: String?) = apply { this.startDate = startDate }

        /** Alias for calling [Builder.startDate] with `startDate.orElse(null)`. */
        fun startDate(startDate: Optional<String>) = startDate(startDate.getOrNull())

        /** Message status */
        fun status(status: Status?) = apply { this.status = status }

        /** Alias for calling [Builder.status] with `status.orElse(null)`. */
        fun status(status: Optional<Status>) = status(status.getOrNull())

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
         * Returns an immutable instance of [ReportListMdrsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ReportListMdrsParams =
            ReportListMdrsParams(
                id,
                cld,
                cli,
                direction,
                endDate,
                messageType,
                profile,
                startDate,
                status,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                id?.let { put("id", it) }
                cld?.let { put("cld", it) }
                cli?.let { put("cli", it) }
                direction?.let { put("direction", it.toString()) }
                endDate?.let { put("end_date", it) }
                messageType?.let { put("message_type", it.toString()) }
                profile?.let { put("profile", it) }
                startDate?.let { put("start_date", it) }
                status?.let { put("status", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Direction (inbound or outbound) */
    class Direction @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val INBOUND = of("INBOUND")

            @JvmField val OUTBOUND = of("OUTBOUND")

            @JvmStatic fun of(value: String) = Direction(JsonField.of(value))
        }

        /** An enum containing [Direction]'s known values. */
        enum class Known {
            INBOUND,
            OUTBOUND,
        }

        /**
         * An enum containing [Direction]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Direction] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            INBOUND,
            OUTBOUND,
            /**
             * An enum member indicating that [Direction] was instantiated with an unknown value.
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
                INBOUND -> Value.INBOUND
                OUTBOUND -> Value.OUTBOUND
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
                INBOUND -> Known.INBOUND
                OUTBOUND -> Known.OUTBOUND
                else -> throw TelnyxInvalidDataException("Unknown Direction: $value")
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

        fun validate(): Direction = apply {
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

            return other is Direction && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Type of message */
    class MessageType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val SMS = of("SMS")

            @JvmField val MMS = of("MMS")

            @JvmStatic fun of(value: String) = MessageType(JsonField.of(value))
        }

        /** An enum containing [MessageType]'s known values. */
        enum class Known {
            SMS,
            MMS,
        }

        /**
         * An enum containing [MessageType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [MessageType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SMS,
            MMS,
            /**
             * An enum member indicating that [MessageType] was instantiated with an unknown value.
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
                SMS -> Value.SMS
                MMS -> Value.MMS
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
                SMS -> Known.SMS
                MMS -> Known.MMS
                else -> throw TelnyxInvalidDataException("Unknown MessageType: $value")
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

        fun validate(): MessageType = apply {
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

            return other is MessageType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Message status */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val GW_TIMEOUT = of("GW_TIMEOUT")

            @JvmField val DELIVERED = of("DELIVERED")

            @JvmField val DLR_UNCONFIRMED = of("DLR_UNCONFIRMED")

            @JvmField val DLR_TIMEOUT = of("DLR_TIMEOUT")

            @JvmField val RECEIVED = of("RECEIVED")

            @JvmField val GW_REJECT = of("GW_REJECT")

            @JvmField val FAILED = of("FAILED")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            GW_TIMEOUT,
            DELIVERED,
            DLR_UNCONFIRMED,
            DLR_TIMEOUT,
            RECEIVED,
            GW_REJECT,
            FAILED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            GW_TIMEOUT,
            DELIVERED,
            DLR_UNCONFIRMED,
            DLR_TIMEOUT,
            RECEIVED,
            GW_REJECT,
            FAILED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                GW_TIMEOUT -> Value.GW_TIMEOUT
                DELIVERED -> Value.DELIVERED
                DLR_UNCONFIRMED -> Value.DLR_UNCONFIRMED
                DLR_TIMEOUT -> Value.DLR_TIMEOUT
                RECEIVED -> Value.RECEIVED
                GW_REJECT -> Value.GW_REJECT
                FAILED -> Value.FAILED
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
                GW_TIMEOUT -> Known.GW_TIMEOUT
                DELIVERED -> Known.DELIVERED
                DLR_UNCONFIRMED -> Known.DLR_UNCONFIRMED
                DLR_TIMEOUT -> Known.DLR_TIMEOUT
                RECEIVED -> Known.RECEIVED
                GW_REJECT -> Known.GW_REJECT
                FAILED -> Known.FAILED
                else -> throw TelnyxInvalidDataException("Unknown Status: $value")
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

        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ReportListMdrsParams &&
            id == other.id &&
            cld == other.cld &&
            cli == other.cli &&
            direction == other.direction &&
            endDate == other.endDate &&
            messageType == other.messageType &&
            profile == other.profile &&
            startDate == other.startDate &&
            status == other.status &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            id,
            cld,
            cli,
            direction,
            endDate,
            messageType,
            profile,
            startDate,
            status,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ReportListMdrsParams{id=$id, cld=$cld, cli=$cli, direction=$direction, endDate=$endDate, messageType=$messageType, profile=$profile, startDate=$startDate, status=$status, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
