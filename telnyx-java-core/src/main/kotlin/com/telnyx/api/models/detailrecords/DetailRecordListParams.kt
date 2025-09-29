// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.detailrecords

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.api.core.Enum
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.Params
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Search for any detail record across the Telnyx Platform */
class DetailRecordListParams
private constructor(
    private val filter: Filter?,
    private val page: Page?,
    private val sort: List<String>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Filter records on a given record attribute and value. <br/>Example: filter[status]=delivered.
     * <br/>Required: filter[record_type] must be specified.
     */
    fun filter(): Optional<Filter> = Optional.ofNullable(filter)

    /** Consolidated page parameter (deepObject style). Originally: page[number], page[size] */
    fun page(): Optional<Page> = Optional.ofNullable(page)

    /** Specifies the sort order for results. <br/>Example: sort=-created_at */
    fun sort(): Optional<List<String>> = Optional.ofNullable(sort)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): DetailRecordListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [DetailRecordListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DetailRecordListParams]. */
    class Builder internal constructor() {

        private var filter: Filter? = null
        private var page: Page? = null
        private var sort: MutableList<String>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(detailRecordListParams: DetailRecordListParams) = apply {
            filter = detailRecordListParams.filter
            page = detailRecordListParams.page
            sort = detailRecordListParams.sort?.toMutableList()
            additionalHeaders = detailRecordListParams.additionalHeaders.toBuilder()
            additionalQueryParams = detailRecordListParams.additionalQueryParams.toBuilder()
        }

        /**
         * Filter records on a given record attribute and value. <br/>Example:
         * filter[status]=delivered. <br/>Required: filter[record_type] must be specified.
         */
        fun filter(filter: Filter?) = apply { this.filter = filter }

        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
        fun filter(filter: Optional<Filter>) = filter(filter.getOrNull())

        /** Consolidated page parameter (deepObject style). Originally: page[number], page[size] */
        fun page(page: Page?) = apply { this.page = page }

        /** Alias for calling [Builder.page] with `page.orElse(null)`. */
        fun page(page: Optional<Page>) = page(page.getOrNull())

        /** Specifies the sort order for results. <br/>Example: sort=-created_at */
        fun sort(sort: List<String>?) = apply { this.sort = sort?.toMutableList() }

        /** Alias for calling [Builder.sort] with `sort.orElse(null)`. */
        fun sort(sort: Optional<List<String>>) = sort(sort.getOrNull())

        /**
         * Adds a single [String] to [Builder.sort].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSort(sort: String) = apply {
            this.sort = (this.sort ?: mutableListOf()).apply { add(sort) }
        }

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
         * Returns an immutable instance of [DetailRecordListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): DetailRecordListParams =
            DetailRecordListParams(
                filter,
                page,
                sort?.toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                filter?.let {
                    put("filter[record_type]", it.recordType().toString())
                    it.dateRange().ifPresent { put("filter[date_range]", it.toString()) }
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
                sort?.let { put("sort", it.joinToString(",")) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Filter records on a given record attribute and value. <br/>Example: filter[status]=delivered.
     * <br/>Required: filter[record_type] must be specified.
     */
    class Filter
    private constructor(
        private val recordType: RecordType,
        private val dateRange: DateRange?,
        private val additionalProperties: QueryParams,
    ) {

        /** Filter by the given record type. */
        fun recordType(): RecordType = recordType

        /**
         * Filter by the given user-friendly date range. You can specify one of the following enum
         * values, or a dynamic one using this format: last_N_days.
         */
        fun dateRange(): Optional<DateRange> = Optional.ofNullable(dateRange)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Filter].
             *
             * The following fields are required:
             * ```java
             * .recordType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filter]. */
        class Builder internal constructor() {

            private var recordType: RecordType? = null
            private var dateRange: DateRange? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                recordType = filter.recordType
                dateRange = filter.dateRange
                additionalProperties = filter.additionalProperties.toBuilder()
            }

            /** Filter by the given record type. */
            fun recordType(recordType: RecordType) = apply { this.recordType = recordType }

            /**
             * Filter by the given user-friendly date range. You can specify one of the following
             * enum values, or a dynamic one using this format: last_N_days.
             */
            fun dateRange(dateRange: DateRange?) = apply { this.dateRange = dateRange }

            /** Alias for calling [Builder.dateRange] with `dateRange.orElse(null)`. */
            fun dateRange(dateRange: Optional<DateRange>) = dateRange(dateRange.getOrNull())

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
             *
             * The following fields are required:
             * ```java
             * .recordType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Filter =
                Filter(
                    checkRequired("recordType", recordType),
                    dateRange,
                    additionalProperties.build(),
                )
        }

        /** Filter by the given record type. */
        class RecordType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                @JvmField val AI_VOICE_ASSISTANT = of("ai-voice-assistant")

                @JvmField val AMD = of("amd")

                @JvmField val CALL_CONTROL = of("call-control")

                @JvmField val CONFERENCE = of("conference")

                @JvmField val CONFERENCE_PARTICIPANT = of("conference-participant")

                @JvmField val EMBEDDING = of("embedding")

                @JvmField val FAX = of("fax")

                @JvmField val INFERENCE = of("inference")

                @JvmField val INFERENCE_SPEECH_TO_TEXT = of("inference-speech-to-text")

                @JvmField val MEDIA_STORAGE = of("media_storage")

                @JvmField val MEDIA_STREAMING = of("media-streaming")

                @JvmField val MESSAGING = of("messaging")

                @JvmField val NOISE_SUPPRESSION = of("noise-suppression")

                @JvmField val RECORDING = of("recording")

                @JvmField val SIP_TRUNKING = of("sip-trunking")

                @JvmField val SIPREC_CLIENT = of("siprec-client")

                @JvmField val STT = of("stt")

                @JvmField val TTS = of("tts")

                @JvmField val VERIFY = of("verify")

                @JvmField val WEBRTC = of("webrtc")

                @JvmField val WIRELESS = of("wireless")

                @JvmStatic fun of(value: String) = RecordType(JsonField.of(value))
            }

            /** An enum containing [RecordType]'s known values. */
            enum class Known {
                AI_VOICE_ASSISTANT,
                AMD,
                CALL_CONTROL,
                CONFERENCE,
                CONFERENCE_PARTICIPANT,
                EMBEDDING,
                FAX,
                INFERENCE,
                INFERENCE_SPEECH_TO_TEXT,
                MEDIA_STORAGE,
                MEDIA_STREAMING,
                MESSAGING,
                NOISE_SUPPRESSION,
                RECORDING,
                SIP_TRUNKING,
                SIPREC_CLIENT,
                STT,
                TTS,
                VERIFY,
                WEBRTC,
                WIRELESS,
            }

            /**
             * An enum containing [RecordType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [RecordType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                AI_VOICE_ASSISTANT,
                AMD,
                CALL_CONTROL,
                CONFERENCE,
                CONFERENCE_PARTICIPANT,
                EMBEDDING,
                FAX,
                INFERENCE,
                INFERENCE_SPEECH_TO_TEXT,
                MEDIA_STORAGE,
                MEDIA_STREAMING,
                MESSAGING,
                NOISE_SUPPRESSION,
                RECORDING,
                SIP_TRUNKING,
                SIPREC_CLIENT,
                STT,
                TTS,
                VERIFY,
                WEBRTC,
                WIRELESS,
                /**
                 * An enum member indicating that [RecordType] was instantiated with an unknown
                 * value.
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
                    AI_VOICE_ASSISTANT -> Value.AI_VOICE_ASSISTANT
                    AMD -> Value.AMD
                    CALL_CONTROL -> Value.CALL_CONTROL
                    CONFERENCE -> Value.CONFERENCE
                    CONFERENCE_PARTICIPANT -> Value.CONFERENCE_PARTICIPANT
                    EMBEDDING -> Value.EMBEDDING
                    FAX -> Value.FAX
                    INFERENCE -> Value.INFERENCE
                    INFERENCE_SPEECH_TO_TEXT -> Value.INFERENCE_SPEECH_TO_TEXT
                    MEDIA_STORAGE -> Value.MEDIA_STORAGE
                    MEDIA_STREAMING -> Value.MEDIA_STREAMING
                    MESSAGING -> Value.MESSAGING
                    NOISE_SUPPRESSION -> Value.NOISE_SUPPRESSION
                    RECORDING -> Value.RECORDING
                    SIP_TRUNKING -> Value.SIP_TRUNKING
                    SIPREC_CLIENT -> Value.SIPREC_CLIENT
                    STT -> Value.STT
                    TTS -> Value.TTS
                    VERIFY -> Value.VERIFY
                    WEBRTC -> Value.WEBRTC
                    WIRELESS -> Value.WIRELESS
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
                    AI_VOICE_ASSISTANT -> Known.AI_VOICE_ASSISTANT
                    AMD -> Known.AMD
                    CALL_CONTROL -> Known.CALL_CONTROL
                    CONFERENCE -> Known.CONFERENCE
                    CONFERENCE_PARTICIPANT -> Known.CONFERENCE_PARTICIPANT
                    EMBEDDING -> Known.EMBEDDING
                    FAX -> Known.FAX
                    INFERENCE -> Known.INFERENCE
                    INFERENCE_SPEECH_TO_TEXT -> Known.INFERENCE_SPEECH_TO_TEXT
                    MEDIA_STORAGE -> Known.MEDIA_STORAGE
                    MEDIA_STREAMING -> Known.MEDIA_STREAMING
                    MESSAGING -> Known.MESSAGING
                    NOISE_SUPPRESSION -> Known.NOISE_SUPPRESSION
                    RECORDING -> Known.RECORDING
                    SIP_TRUNKING -> Known.SIP_TRUNKING
                    SIPREC_CLIENT -> Known.SIPREC_CLIENT
                    STT -> Known.STT
                    TTS -> Known.TTS
                    VERIFY -> Known.VERIFY
                    WEBRTC -> Known.WEBRTC
                    WIRELESS -> Known.WIRELESS
                    else -> throw TelnyxInvalidDataException("Unknown RecordType: $value")
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

            fun validate(): RecordType = apply {
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

                return other is RecordType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * Filter by the given user-friendly date range. You can specify one of the following enum
         * values, or a dynamic one using this format: last_N_days.
         */
        class DateRange @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                @JvmField val YESTERDAY = of("yesterday")

                @JvmField val TODAY = of("today")

                @JvmField val TOMORROW = of("tomorrow")

                @JvmField val LAST_WEEK = of("last_week")

                @JvmField val THIS_WEEK = of("this_week")

                @JvmField val NEXT_WEEK = of("next_week")

                @JvmField val LAST_MONTH = of("last_month")

                @JvmField val THIS_MONTH = of("this_month")

                @JvmField val NEXT_MONTH = of("next_month")

                @JvmStatic fun of(value: String) = DateRange(JsonField.of(value))
            }

            /** An enum containing [DateRange]'s known values. */
            enum class Known {
                YESTERDAY,
                TODAY,
                TOMORROW,
                LAST_WEEK,
                THIS_WEEK,
                NEXT_WEEK,
                LAST_MONTH,
                THIS_MONTH,
                NEXT_MONTH,
            }

            /**
             * An enum containing [DateRange]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [DateRange] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                YESTERDAY,
                TODAY,
                TOMORROW,
                LAST_WEEK,
                THIS_WEEK,
                NEXT_WEEK,
                LAST_MONTH,
                THIS_MONTH,
                NEXT_MONTH,
                /**
                 * An enum member indicating that [DateRange] was instantiated with an unknown
                 * value.
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
                    YESTERDAY -> Value.YESTERDAY
                    TODAY -> Value.TODAY
                    TOMORROW -> Value.TOMORROW
                    LAST_WEEK -> Value.LAST_WEEK
                    THIS_WEEK -> Value.THIS_WEEK
                    NEXT_WEEK -> Value.NEXT_WEEK
                    LAST_MONTH -> Value.LAST_MONTH
                    THIS_MONTH -> Value.THIS_MONTH
                    NEXT_MONTH -> Value.NEXT_MONTH
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
                    YESTERDAY -> Known.YESTERDAY
                    TODAY -> Known.TODAY
                    TOMORROW -> Known.TOMORROW
                    LAST_WEEK -> Known.LAST_WEEK
                    THIS_WEEK -> Known.THIS_WEEK
                    NEXT_WEEK -> Known.NEXT_WEEK
                    LAST_MONTH -> Known.LAST_MONTH
                    THIS_MONTH -> Known.THIS_MONTH
                    NEXT_MONTH -> Known.NEXT_MONTH
                    else -> throw TelnyxInvalidDataException("Unknown DateRange: $value")
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

            fun validate(): DateRange = apply {
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

                return other is DateRange && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filter &&
                recordType == other.recordType &&
                dateRange == other.dateRange &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(recordType, dateRange, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filter{recordType=$recordType, dateRange=$dateRange, additionalProperties=$additionalProperties}"
    }

    /** Consolidated page parameter (deepObject style). Originally: page[number], page[size] */
    class Page
    private constructor(
        private val number: Int?,
        private val size: Int?,
        private val additionalProperties: QueryParams,
    ) {

        /** Page number */
        fun number(): Optional<Int> = Optional.ofNullable(number)

        /** Page size */
        fun size(): Optional<Int> = Optional.ofNullable(size)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Page]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Page]. */
        class Builder internal constructor() {

            private var number: Int? = null
            private var size: Int? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(page: Page) = apply {
                number = page.number
                size = page.size
                additionalProperties = page.additionalProperties.toBuilder()
            }

            /** Page number */
            fun number(number: Int?) = apply { this.number = number }

            /**
             * Alias for [Builder.number].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun number(number: Int) = number(number as Int?)

            /** Alias for calling [Builder.number] with `number.orElse(null)`. */
            fun number(number: Optional<Int>) = number(number.getOrNull())

            /** Page size */
            fun size(size: Int?) = apply { this.size = size }

            /**
             * Alias for [Builder.size].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun size(size: Int) = size(size as Int?)

            /** Alias for calling [Builder.size] with `size.orElse(null)`. */
            fun size(size: Optional<Int>) = size(size.getOrNull())

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

        return other is DetailRecordListParams &&
            filter == other.filter &&
            page == other.page &&
            sort == other.sort &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(filter, page, sort, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "DetailRecordListParams{filter=$filter, page=$page, sort=$sort, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
