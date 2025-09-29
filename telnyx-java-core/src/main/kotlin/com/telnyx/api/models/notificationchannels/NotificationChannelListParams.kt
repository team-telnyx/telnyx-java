// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.notificationchannels

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.api.core.Enum
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.Params
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** List notification channels. */
class NotificationChannelListParams
private constructor(
    private val filter: Filter?,
    private val page: Page?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Consolidated filter parameter (deepObject style). Originally:
     * filter[associated_record_type][eq], filter[channel_type_id][eq],
     * filter[notification_profile_id][eq], filter[notification_channel][eq],
     * filter[notification_event_condition_id][eq], filter[status][eq]
     */
    fun filter(): Optional<Filter> = Optional.ofNullable(filter)

    /** Consolidated page parameter (deepObject style). Originally: page[number], page[size] */
    fun page(): Optional<Page> = Optional.ofNullable(page)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): NotificationChannelListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [NotificationChannelListParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NotificationChannelListParams]. */
    class Builder internal constructor() {

        private var filter: Filter? = null
        private var page: Page? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(notificationChannelListParams: NotificationChannelListParams) = apply {
            filter = notificationChannelListParams.filter
            page = notificationChannelListParams.page
            additionalHeaders = notificationChannelListParams.additionalHeaders.toBuilder()
            additionalQueryParams = notificationChannelListParams.additionalQueryParams.toBuilder()
        }

        /**
         * Consolidated filter parameter (deepObject style). Originally:
         * filter[associated_record_type][eq], filter[channel_type_id][eq],
         * filter[notification_profile_id][eq], filter[notification_channel][eq],
         * filter[notification_event_condition_id][eq], filter[status][eq]
         */
        fun filter(filter: Filter?) = apply { this.filter = filter }

        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
        fun filter(filter: Optional<Filter>) = filter(filter.getOrNull())

        /** Consolidated page parameter (deepObject style). Originally: page[number], page[size] */
        fun page(page: Page?) = apply { this.page = page }

        /** Alias for calling [Builder.page] with `page.orElse(null)`. */
        fun page(page: Optional<Page>) = page(page.getOrNull())

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
         * Returns an immutable instance of [NotificationChannelListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): NotificationChannelListParams =
            NotificationChannelListParams(
                filter,
                page,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                filter?.let {
                    it.associatedRecordType().ifPresent {
                        it.eq().ifPresent {
                            put("filter[associated_record_type][eq]", it.toString())
                        }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[associated_record_type][$key]", value)
                            }
                        }
                    }
                    it.channelTypeId().ifPresent {
                        it.eq().ifPresent { put("filter[channel_type_id][eq]", it.toString()) }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[channel_type_id][$key]", value)
                            }
                        }
                    }
                    it.notificationChannel().ifPresent {
                        it.eq().ifPresent { put("filter[notification_channel][eq]", it) }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[notification_channel][$key]", value)
                            }
                        }
                    }
                    it.notificationEventConditionId().ifPresent {
                        it.eq().ifPresent { put("filter[notification_event_condition_id][eq]", it) }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[notification_event_condition_id][$key]", value)
                            }
                        }
                    }
                    it.notificationProfileId().ifPresent {
                        it.eq().ifPresent { put("filter[notification_profile_id][eq]", it) }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[notification_profile_id][$key]", value)
                            }
                        }
                    }
                    it.status().ifPresent {
                        it.eq().ifPresent { put("filter[status][eq]", it.toString()) }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[status][$key]", value)
                            }
                        }
                    }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("filter[$key]", value)
                        }
                    }
                }
                page?.let {
                    it.number().ifPresent { put("page[number]", it.toString()) }
                    it.size().ifPresent { put("page[size]", it.toString()) }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("page[$key]", value)
                        }
                    }
                }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Consolidated filter parameter (deepObject style). Originally:
     * filter[associated_record_type][eq], filter[channel_type_id][eq],
     * filter[notification_profile_id][eq], filter[notification_channel][eq],
     * filter[notification_event_condition_id][eq], filter[status][eq]
     */
    class Filter
    private constructor(
        private val associatedRecordType: AssociatedRecordType?,
        private val channelTypeId: ChannelTypeId?,
        private val notificationChannel: NotificationChannel?,
        private val notificationEventConditionId: NotificationEventConditionId?,
        private val notificationProfileId: NotificationProfileId?,
        private val status: Status?,
        private val additionalProperties: QueryParams,
    ) {

        fun associatedRecordType(): Optional<AssociatedRecordType> =
            Optional.ofNullable(associatedRecordType)

        fun channelTypeId(): Optional<ChannelTypeId> = Optional.ofNullable(channelTypeId)

        fun notificationChannel(): Optional<NotificationChannel> =
            Optional.ofNullable(notificationChannel)

        fun notificationEventConditionId(): Optional<NotificationEventConditionId> =
            Optional.ofNullable(notificationEventConditionId)

        fun notificationProfileId(): Optional<NotificationProfileId> =
            Optional.ofNullable(notificationProfileId)

        fun status(): Optional<Status> = Optional.ofNullable(status)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Filter]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filter]. */
        class Builder internal constructor() {

            private var associatedRecordType: AssociatedRecordType? = null
            private var channelTypeId: ChannelTypeId? = null
            private var notificationChannel: NotificationChannel? = null
            private var notificationEventConditionId: NotificationEventConditionId? = null
            private var notificationProfileId: NotificationProfileId? = null
            private var status: Status? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                associatedRecordType = filter.associatedRecordType
                channelTypeId = filter.channelTypeId
                notificationChannel = filter.notificationChannel
                notificationEventConditionId = filter.notificationEventConditionId
                notificationProfileId = filter.notificationProfileId
                status = filter.status
                additionalProperties = filter.additionalProperties.toBuilder()
            }

            fun associatedRecordType(associatedRecordType: AssociatedRecordType?) = apply {
                this.associatedRecordType = associatedRecordType
            }

            /**
             * Alias for calling [Builder.associatedRecordType] with
             * `associatedRecordType.orElse(null)`.
             */
            fun associatedRecordType(associatedRecordType: Optional<AssociatedRecordType>) =
                associatedRecordType(associatedRecordType.getOrNull())

            fun channelTypeId(channelTypeId: ChannelTypeId?) = apply {
                this.channelTypeId = channelTypeId
            }

            /** Alias for calling [Builder.channelTypeId] with `channelTypeId.orElse(null)`. */
            fun channelTypeId(channelTypeId: Optional<ChannelTypeId>) =
                channelTypeId(channelTypeId.getOrNull())

            fun notificationChannel(notificationChannel: NotificationChannel?) = apply {
                this.notificationChannel = notificationChannel
            }

            /**
             * Alias for calling [Builder.notificationChannel] with
             * `notificationChannel.orElse(null)`.
             */
            fun notificationChannel(notificationChannel: Optional<NotificationChannel>) =
                notificationChannel(notificationChannel.getOrNull())

            fun notificationEventConditionId(
                notificationEventConditionId: NotificationEventConditionId?
            ) = apply { this.notificationEventConditionId = notificationEventConditionId }

            /**
             * Alias for calling [Builder.notificationEventConditionId] with
             * `notificationEventConditionId.orElse(null)`.
             */
            fun notificationEventConditionId(
                notificationEventConditionId: Optional<NotificationEventConditionId>
            ) = notificationEventConditionId(notificationEventConditionId.getOrNull())

            fun notificationProfileId(notificationProfileId: NotificationProfileId?) = apply {
                this.notificationProfileId = notificationProfileId
            }

            /**
             * Alias for calling [Builder.notificationProfileId] with
             * `notificationProfileId.orElse(null)`.
             */
            fun notificationProfileId(notificationProfileId: Optional<NotificationProfileId>) =
                notificationProfileId(notificationProfileId.getOrNull())

            fun status(status: Status?) = apply { this.status = status }

            /** Alias for calling [Builder.status] with `status.orElse(null)`. */
            fun status(status: Optional<Status>) = status(status.getOrNull())

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
                Filter(
                    associatedRecordType,
                    channelTypeId,
                    notificationChannel,
                    notificationEventConditionId,
                    notificationProfileId,
                    status,
                    additionalProperties.build(),
                )
        }

        class AssociatedRecordType private constructor(private val eq: Eq?) {

            /** Filter by the associated record type */
            fun eq(): Optional<Eq> = Optional.ofNullable(eq)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [AssociatedRecordType].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AssociatedRecordType]. */
            class Builder internal constructor() {

                private var eq: Eq? = null

                @JvmSynthetic
                internal fun from(associatedRecordType: AssociatedRecordType) = apply {
                    eq = associatedRecordType.eq
                }

                /** Filter by the associated record type */
                fun eq(eq: Eq?) = apply { this.eq = eq }

                /** Alias for calling [Builder.eq] with `eq.orElse(null)`. */
                fun eq(eq: Optional<Eq>) = eq(eq.getOrNull())

                /**
                 * Returns an immutable instance of [AssociatedRecordType].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): AssociatedRecordType = AssociatedRecordType(eq)
            }

            /** Filter by the associated record type */
            class Eq @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val ACCOUNT = of("account")

                    @JvmField val PHONE_NUMBER = of("phone_number")

                    @JvmStatic fun of(value: String) = Eq(JsonField.of(value))
                }

                /** An enum containing [Eq]'s known values. */
                enum class Known {
                    ACCOUNT,
                    PHONE_NUMBER,
                }

                /**
                 * An enum containing [Eq]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Eq] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ACCOUNT,
                    PHONE_NUMBER,
                    /**
                     * An enum member indicating that [Eq] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ACCOUNT -> Value.ACCOUNT
                        PHONE_NUMBER -> Value.PHONE_NUMBER
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        ACCOUNT -> Known.ACCOUNT
                        PHONE_NUMBER -> Known.PHONE_NUMBER
                        else -> throw TelnyxInvalidDataException("Unknown Eq: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Eq = apply {
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

                    return other is Eq && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AssociatedRecordType && eq == other.eq
            }

            private val hashCode: Int by lazy { Objects.hash(eq) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "AssociatedRecordType{eq=$eq}"
        }

        class ChannelTypeId private constructor(private val eq: Eq?) {

            /** Filter by the id of a channel type */
            fun eq(): Optional<Eq> = Optional.ofNullable(eq)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [ChannelTypeId]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ChannelTypeId]. */
            class Builder internal constructor() {

                private var eq: Eq? = null

                @JvmSynthetic
                internal fun from(channelTypeId: ChannelTypeId) = apply { eq = channelTypeId.eq }

                /** Filter by the id of a channel type */
                fun eq(eq: Eq?) = apply { this.eq = eq }

                /** Alias for calling [Builder.eq] with `eq.orElse(null)`. */
                fun eq(eq: Optional<Eq>) = eq(eq.getOrNull())

                /**
                 * Returns an immutable instance of [ChannelTypeId].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ChannelTypeId = ChannelTypeId(eq)
            }

            /** Filter by the id of a channel type */
            class Eq @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val WEBHOOK = of("webhook")

                    @JvmField val SMS = of("sms")

                    @JvmField val EMAIL = of("email")

                    @JvmField val VOICE = of("voice")

                    @JvmStatic fun of(value: String) = Eq(JsonField.of(value))
                }

                /** An enum containing [Eq]'s known values. */
                enum class Known {
                    WEBHOOK,
                    SMS,
                    EMAIL,
                    VOICE,
                }

                /**
                 * An enum containing [Eq]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Eq] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    WEBHOOK,
                    SMS,
                    EMAIL,
                    VOICE,
                    /**
                     * An enum member indicating that [Eq] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        WEBHOOK -> Value.WEBHOOK
                        SMS -> Value.SMS
                        EMAIL -> Value.EMAIL
                        VOICE -> Value.VOICE
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        WEBHOOK -> Known.WEBHOOK
                        SMS -> Known.SMS
                        EMAIL -> Known.EMAIL
                        VOICE -> Known.VOICE
                        else -> throw TelnyxInvalidDataException("Unknown Eq: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Eq = apply {
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

                    return other is Eq && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ChannelTypeId && eq == other.eq
            }

            private val hashCode: Int by lazy { Objects.hash(eq) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "ChannelTypeId{eq=$eq}"
        }

        class NotificationChannel private constructor(private val eq: String?) {

            /** Filter by the id of a notification channel */
            fun eq(): Optional<String> = Optional.ofNullable(eq)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [NotificationChannel].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [NotificationChannel]. */
            class Builder internal constructor() {

                private var eq: String? = null

                @JvmSynthetic
                internal fun from(notificationChannel: NotificationChannel) = apply {
                    eq = notificationChannel.eq
                }

                /** Filter by the id of a notification channel */
                fun eq(eq: String?) = apply { this.eq = eq }

                /** Alias for calling [Builder.eq] with `eq.orElse(null)`. */
                fun eq(eq: Optional<String>) = eq(eq.getOrNull())

                /**
                 * Returns an immutable instance of [NotificationChannel].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): NotificationChannel = NotificationChannel(eq)
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is NotificationChannel && eq == other.eq
            }

            private val hashCode: Int by lazy { Objects.hash(eq) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "NotificationChannel{eq=$eq}"
        }

        class NotificationEventConditionId private constructor(private val eq: String?) {

            /** Filter by the id of a notification channel */
            fun eq(): Optional<String> = Optional.ofNullable(eq)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [NotificationEventConditionId].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [NotificationEventConditionId]. */
            class Builder internal constructor() {

                private var eq: String? = null

                @JvmSynthetic
                internal fun from(notificationEventConditionId: NotificationEventConditionId) =
                    apply {
                        eq = notificationEventConditionId.eq
                    }

                /** Filter by the id of a notification channel */
                fun eq(eq: String?) = apply { this.eq = eq }

                /** Alias for calling [Builder.eq] with `eq.orElse(null)`. */
                fun eq(eq: Optional<String>) = eq(eq.getOrNull())

                /**
                 * Returns an immutable instance of [NotificationEventConditionId].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): NotificationEventConditionId = NotificationEventConditionId(eq)
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is NotificationEventConditionId && eq == other.eq
            }

            private val hashCode: Int by lazy { Objects.hash(eq) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "NotificationEventConditionId{eq=$eq}"
        }

        class NotificationProfileId private constructor(private val eq: String?) {

            /** Filter by the id of a notification profile */
            fun eq(): Optional<String> = Optional.ofNullable(eq)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [NotificationProfileId].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [NotificationProfileId]. */
            class Builder internal constructor() {

                private var eq: String? = null

                @JvmSynthetic
                internal fun from(notificationProfileId: NotificationProfileId) = apply {
                    eq = notificationProfileId.eq
                }

                /** Filter by the id of a notification profile */
                fun eq(eq: String?) = apply { this.eq = eq }

                /** Alias for calling [Builder.eq] with `eq.orElse(null)`. */
                fun eq(eq: Optional<String>) = eq(eq.getOrNull())

                /**
                 * Returns an immutable instance of [NotificationProfileId].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): NotificationProfileId = NotificationProfileId(eq)
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is NotificationProfileId && eq == other.eq
            }

            private val hashCode: Int by lazy { Objects.hash(eq) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "NotificationProfileId{eq=$eq}"
        }

        class Status private constructor(private val eq: Eq?) {

            /** The status of a notification setting */
            fun eq(): Optional<Eq> = Optional.ofNullable(eq)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Status]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Status]. */
            class Builder internal constructor() {

                private var eq: Eq? = null

                @JvmSynthetic internal fun from(status: Status) = apply { eq = status.eq }

                /** The status of a notification setting */
                fun eq(eq: Eq?) = apply { this.eq = eq }

                /** Alias for calling [Builder.eq] with `eq.orElse(null)`. */
                fun eq(eq: Optional<Eq>) = eq(eq.getOrNull())

                /**
                 * Returns an immutable instance of [Status].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Status = Status(eq)
            }

            /** The status of a notification setting */
            class Eq @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val ENABLED = of("enabled")

                    @JvmField val ENABLE_RECEIVED = of("enable-received")

                    @JvmField val ENABLE_PENDING = of("enable-pending")

                    @JvmField val ENABLE_SUBMTITED = of("enable-submtited")

                    @JvmField val DELETE_RECEIVED = of("delete-received")

                    @JvmField val DELETE_PENDING = of("delete-pending")

                    @JvmField val DELETE_SUBMITTED = of("delete-submitted")

                    @JvmField val DELETED = of("deleted")

                    @JvmStatic fun of(value: String) = Eq(JsonField.of(value))
                }

                /** An enum containing [Eq]'s known values. */
                enum class Known {
                    ENABLED,
                    ENABLE_RECEIVED,
                    ENABLE_PENDING,
                    ENABLE_SUBMTITED,
                    DELETE_RECEIVED,
                    DELETE_PENDING,
                    DELETE_SUBMITTED,
                    DELETED,
                }

                /**
                 * An enum containing [Eq]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Eq] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ENABLED,
                    ENABLE_RECEIVED,
                    ENABLE_PENDING,
                    ENABLE_SUBMTITED,
                    DELETE_RECEIVED,
                    DELETE_PENDING,
                    DELETE_SUBMITTED,
                    DELETED,
                    /**
                     * An enum member indicating that [Eq] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ENABLED -> Value.ENABLED
                        ENABLE_RECEIVED -> Value.ENABLE_RECEIVED
                        ENABLE_PENDING -> Value.ENABLE_PENDING
                        ENABLE_SUBMTITED -> Value.ENABLE_SUBMTITED
                        DELETE_RECEIVED -> Value.DELETE_RECEIVED
                        DELETE_PENDING -> Value.DELETE_PENDING
                        DELETE_SUBMITTED -> Value.DELETE_SUBMITTED
                        DELETED -> Value.DELETED
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        ENABLED -> Known.ENABLED
                        ENABLE_RECEIVED -> Known.ENABLE_RECEIVED
                        ENABLE_PENDING -> Known.ENABLE_PENDING
                        ENABLE_SUBMTITED -> Known.ENABLE_SUBMTITED
                        DELETE_RECEIVED -> Known.DELETE_RECEIVED
                        DELETE_PENDING -> Known.DELETE_PENDING
                        DELETE_SUBMITTED -> Known.DELETE_SUBMITTED
                        DELETED -> Known.DELETED
                        else -> throw TelnyxInvalidDataException("Unknown Eq: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Eq = apply {
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

                    return other is Eq && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Status && eq == other.eq
            }

            private val hashCode: Int by lazy { Objects.hash(eq) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Status{eq=$eq}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filter &&
                associatedRecordType == other.associatedRecordType &&
                channelTypeId == other.channelTypeId &&
                notificationChannel == other.notificationChannel &&
                notificationEventConditionId == other.notificationEventConditionId &&
                notificationProfileId == other.notificationProfileId &&
                status == other.status &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                associatedRecordType,
                channelTypeId,
                notificationChannel,
                notificationEventConditionId,
                notificationProfileId,
                status,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filter{associatedRecordType=$associatedRecordType, channelTypeId=$channelTypeId, notificationChannel=$notificationChannel, notificationEventConditionId=$notificationEventConditionId, notificationProfileId=$notificationProfileId, status=$status, additionalProperties=$additionalProperties}"
    }

    /** Consolidated page parameter (deepObject style). Originally: page[number], page[size] */
    class Page
    private constructor(
        private val number: Long?,
        private val size: Long?,
        private val additionalProperties: QueryParams,
    ) {

        /** The page number to load */
        fun number(): Optional<Long> = Optional.ofNullable(number)

        /** The size of the page */
        fun size(): Optional<Long> = Optional.ofNullable(size)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Page]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Page]. */
        class Builder internal constructor() {

            private var number: Long? = null
            private var size: Long? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(page: Page) = apply {
                number = page.number
                size = page.size
                additionalProperties = page.additionalProperties.toBuilder()
            }

            /** The page number to load */
            fun number(number: Long?) = apply { this.number = number }

            /**
             * Alias for [Builder.number].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun number(number: Long) = number(number as Long?)

            /** Alias for calling [Builder.number] with `number.orElse(null)`. */
            fun number(number: Optional<Long>) = number(number.getOrNull())

            /** The size of the page */
            fun size(size: Long?) = apply { this.size = size }

            /**
             * Alias for [Builder.size].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun size(size: Long) = size(size as Long?)

            /** Alias for calling [Builder.size] with `size.orElse(null)`. */
            fun size(size: Optional<Long>) = size(size.getOrNull())

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
             * Returns an immutable instance of [Page].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Page = Page(number, size, additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Page &&
                number == other.number &&
                size == other.size &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(number, size, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Page{number=$number, size=$size, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NotificationChannelListParams &&
            filter == other.filter &&
            page == other.page &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(filter, page, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "NotificationChannelListParams{filter=$filter, page=$page, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
