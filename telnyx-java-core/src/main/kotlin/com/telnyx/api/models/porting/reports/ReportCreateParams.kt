// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.porting.reports

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.Enum
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.Params
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** Generate reports about porting operations. */
class ReportCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The parameters for generating a porting orders CSV report.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun params(): ExportPortingOrdersCsvReport = body.params()

    /**
     * Identifies the type of report
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun reportType(): ReportType = body.reportType()

    /**
     * Returns the raw JSON value of [params].
     *
     * Unlike [params], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _params(): JsonField<ExportPortingOrdersCsvReport> = body._params()

    /**
     * Returns the raw JSON value of [reportType].
     *
     * Unlike [reportType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _reportType(): JsonField<ReportType> = body._reportType()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ReportCreateParams].
         *
         * The following fields are required:
         * ```java
         * .params()
         * .reportType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ReportCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(reportCreateParams: ReportCreateParams) = apply {
            body = reportCreateParams.body.toBuilder()
            additionalHeaders = reportCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = reportCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [params]
         * - [reportType]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The parameters for generating a porting orders CSV report. */
        fun params(params: ExportPortingOrdersCsvReport) = apply { body.params(params) }

        /**
         * Sets [Builder.params] to an arbitrary JSON value.
         *
         * You should usually call [Builder.params] with a well-typed [ExportPortingOrdersCsvReport]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun params(params: JsonField<ExportPortingOrdersCsvReport>) = apply { body.params(params) }

        /** Identifies the type of report */
        fun reportType(reportType: ReportType) = apply { body.reportType(reportType) }

        /**
         * Sets [Builder.reportType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reportType] with a well-typed [ReportType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun reportType(reportType: JsonField<ReportType>) = apply { body.reportType(reportType) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
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
         * Returns an immutable instance of [ReportCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .params()
         * .reportType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ReportCreateParams =
            ReportCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** The parameters for generating a new porting related report. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val params: JsonField<ExportPortingOrdersCsvReport>,
        private val reportType: JsonField<ReportType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("params")
            @ExcludeMissing
            params: JsonField<ExportPortingOrdersCsvReport> = JsonMissing.of(),
            @JsonProperty("report_type")
            @ExcludeMissing
            reportType: JsonField<ReportType> = JsonMissing.of(),
        ) : this(params, reportType, mutableMapOf())

        /**
         * The parameters for generating a porting orders CSV report.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun params(): ExportPortingOrdersCsvReport = params.getRequired("params")

        /**
         * Identifies the type of report
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun reportType(): ReportType = reportType.getRequired("report_type")

        /**
         * Returns the raw JSON value of [params].
         *
         * Unlike [params], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("params")
        @ExcludeMissing
        fun _params(): JsonField<ExportPortingOrdersCsvReport> = params

        /**
         * Returns the raw JSON value of [reportType].
         *
         * Unlike [reportType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("report_type")
        @ExcludeMissing
        fun _reportType(): JsonField<ReportType> = reportType

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .params()
             * .reportType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var params: JsonField<ExportPortingOrdersCsvReport>? = null
            private var reportType: JsonField<ReportType>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                params = body.params
                reportType = body.reportType
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The parameters for generating a porting orders CSV report. */
            fun params(params: ExportPortingOrdersCsvReport) = params(JsonField.of(params))

            /**
             * Sets [Builder.params] to an arbitrary JSON value.
             *
             * You should usually call [Builder.params] with a well-typed
             * [ExportPortingOrdersCsvReport] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun params(params: JsonField<ExportPortingOrdersCsvReport>) = apply {
                this.params = params
            }

            /** Identifies the type of report */
            fun reportType(reportType: ReportType) = reportType(JsonField.of(reportType))

            /**
             * Sets [Builder.reportType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reportType] with a well-typed [ReportType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reportType(reportType: JsonField<ReportType>) = apply {
                this.reportType = reportType
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .params()
             * .reportType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("params", params),
                    checkRequired("reportType", reportType),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            params().validate()
            reportType().validate()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (params.asKnown().getOrNull()?.validity() ?: 0) +
                (reportType.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                params == other.params &&
                reportType == other.reportType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(params, reportType, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{params=$params, reportType=$reportType, additionalProperties=$additionalProperties}"
    }

    /** Identifies the type of report */
    class ReportType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val EXPORT_PORTING_ORDERS_CSV = of("export_porting_orders_csv")

            @JvmStatic fun of(value: String) = ReportType(JsonField.of(value))
        }

        /** An enum containing [ReportType]'s known values. */
        enum class Known {
            EXPORT_PORTING_ORDERS_CSV
        }

        /**
         * An enum containing [ReportType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ReportType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            EXPORT_PORTING_ORDERS_CSV,
            /**
             * An enum member indicating that [ReportType] was instantiated with an unknown value.
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
                EXPORT_PORTING_ORDERS_CSV -> Value.EXPORT_PORTING_ORDERS_CSV
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
                EXPORT_PORTING_ORDERS_CSV -> Known.EXPORT_PORTING_ORDERS_CSV
                else -> throw TelnyxInvalidDataException("Unknown ReportType: $value")
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

        fun validate(): ReportType = apply {
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

            return other is ReportType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ReportCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ReportCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
