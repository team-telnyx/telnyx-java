// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.chargessummary

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.BaseDeserializer
import com.telnyx.sdk.core.BaseSerializer
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.LocalDate
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ChargesSummaryRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<Data>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): Data = data.getRequired("data")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

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
         * [ChargesSummaryRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ChargesSummaryRetrieveResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(chargesSummaryRetrieveResponse: ChargesSummaryRetrieveResponse) = apply {
            data = chargesSummaryRetrieveResponse.data
            additionalProperties =
                chargesSummaryRetrieveResponse.additionalProperties.toMutableMap()
        }

        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

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
         * Returns an immutable instance of [ChargesSummaryRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ChargesSummaryRetrieveResponse =
            ChargesSummaryRetrieveResponse(
                checkRequired("data", data),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ChargesSummaryRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        data().validate()
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
    @JvmSynthetic internal fun validity(): Int = (data.asKnown().getOrNull()?.validity() ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val currency: JsonField<String>,
        private val endDate: JsonField<LocalDate>,
        private val startDate: JsonField<LocalDate>,
        private val summary: JsonField<Summary>,
        private val total: JsonField<Total>,
        private val userEmail: JsonField<String>,
        private val userId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("end_date")
            @ExcludeMissing
            endDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("start_date")
            @ExcludeMissing
            startDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("summary") @ExcludeMissing summary: JsonField<Summary> = JsonMissing.of(),
            @JsonProperty("total") @ExcludeMissing total: JsonField<Total> = JsonMissing.of(),
            @JsonProperty("user_email")
            @ExcludeMissing
            userEmail: JsonField<String> = JsonMissing.of(),
            @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
        ) : this(currency, endDate, startDate, summary, total, userEmail, userId, mutableMapOf())

        /**
         * Currency code
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): String = currency.getRequired("currency")

        /**
         * End date of the summary period
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun endDate(): LocalDate = endDate.getRequired("end_date")

        /**
         * Start date of the summary period
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startDate(): LocalDate = startDate.getRequired("start_date")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun summary(): Summary = summary.getRequired("summary")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun total(): Total = total.getRequired("total")

        /**
         * User email address
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun userEmail(): String = userEmail.getRequired("user_email")

        /**
         * User identifier
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun userId(): String = userId.getRequired("user_id")

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [endDate].
         *
         * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_date") @ExcludeMissing fun _endDate(): JsonField<LocalDate> = endDate

        /**
         * Returns the raw JSON value of [startDate].
         *
         * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_date")
        @ExcludeMissing
        fun _startDate(): JsonField<LocalDate> = startDate

        /**
         * Returns the raw JSON value of [summary].
         *
         * Unlike [summary], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("summary") @ExcludeMissing fun _summary(): JsonField<Summary> = summary

        /**
         * Returns the raw JSON value of [total].
         *
         * Unlike [total], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<Total> = total

        /**
         * Returns the raw JSON value of [userEmail].
         *
         * Unlike [userEmail], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user_email") @ExcludeMissing fun _userEmail(): JsonField<String> = userEmail

        /**
         * Returns the raw JSON value of [userId].
         *
         * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

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
             * Returns a mutable builder for constructing an instance of [Data].
             *
             * The following fields are required:
             * ```java
             * .currency()
             * .endDate()
             * .startDate()
             * .summary()
             * .total()
             * .userEmail()
             * .userId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var currency: JsonField<String>? = null
            private var endDate: JsonField<LocalDate>? = null
            private var startDate: JsonField<LocalDate>? = null
            private var summary: JsonField<Summary>? = null
            private var total: JsonField<Total>? = null
            private var userEmail: JsonField<String>? = null
            private var userId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                currency = data.currency
                endDate = data.endDate
                startDate = data.startDate
                summary = data.summary
                total = data.total
                userEmail = data.userEmail
                userId = data.userId
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Currency code */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /** End date of the summary period */
            fun endDate(endDate: LocalDate) = endDate(JsonField.of(endDate))

            /**
             * Sets [Builder.endDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endDate(endDate: JsonField<LocalDate>) = apply { this.endDate = endDate }

            /** Start date of the summary period */
            fun startDate(startDate: LocalDate) = startDate(JsonField.of(startDate))

            /**
             * Sets [Builder.startDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startDate(startDate: JsonField<LocalDate>) = apply { this.startDate = startDate }

            fun summary(summary: Summary) = summary(JsonField.of(summary))

            /**
             * Sets [Builder.summary] to an arbitrary JSON value.
             *
             * You should usually call [Builder.summary] with a well-typed [Summary] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun summary(summary: JsonField<Summary>) = apply { this.summary = summary }

            fun total(total: Total) = total(JsonField.of(total))

            /**
             * Sets [Builder.total] to an arbitrary JSON value.
             *
             * You should usually call [Builder.total] with a well-typed [Total] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun total(total: JsonField<Total>) = apply { this.total = total }

            /** User email address */
            fun userEmail(userEmail: String) = userEmail(JsonField.of(userEmail))

            /**
             * Sets [Builder.userEmail] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userEmail] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userEmail(userEmail: JsonField<String>) = apply { this.userEmail = userEmail }

            /** User identifier */
            fun userId(userId: String) = userId(JsonField.of(userId))

            /**
             * Sets [Builder.userId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userId(userId: JsonField<String>) = apply { this.userId = userId }

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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .currency()
             * .endDate()
             * .startDate()
             * .summary()
             * .total()
             * .userEmail()
             * .userId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("currency", currency),
                    checkRequired("endDate", endDate),
                    checkRequired("startDate", startDate),
                    checkRequired("summary", summary),
                    checkRequired("total", total),
                    checkRequired("userEmail", userEmail),
                    checkRequired("userId", userId),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            currency()
            endDate()
            startDate()
            summary().validate()
            total().validate()
            userEmail()
            userId()
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
            (if (currency.asKnown().isPresent) 1 else 0) +
                (if (endDate.asKnown().isPresent) 1 else 0) +
                (if (startDate.asKnown().isPresent) 1 else 0) +
                (summary.asKnown().getOrNull()?.validity() ?: 0) +
                (total.asKnown().getOrNull()?.validity() ?: 0) +
                (if (userEmail.asKnown().isPresent) 1 else 0) +
                (if (userId.asKnown().isPresent) 1 else 0)

        class Summary
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val adjustments: JsonField<List<Adjustment>>,
            private val lines: JsonField<List<Line>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("adjustments")
                @ExcludeMissing
                adjustments: JsonField<List<Adjustment>> = JsonMissing.of(),
                @JsonProperty("lines")
                @ExcludeMissing
                lines: JsonField<List<Line>> = JsonMissing.of(),
            ) : this(adjustments, lines, mutableMapOf())

            /**
             * List of billing adjustments
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun adjustments(): List<Adjustment> = adjustments.getRequired("adjustments")

            /**
             * List of charge summary lines
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun lines(): List<Line> = lines.getRequired("lines")

            /**
             * Returns the raw JSON value of [adjustments].
             *
             * Unlike [adjustments], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("adjustments")
            @ExcludeMissing
            fun _adjustments(): JsonField<List<Adjustment>> = adjustments

            /**
             * Returns the raw JSON value of [lines].
             *
             * Unlike [lines], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("lines") @ExcludeMissing fun _lines(): JsonField<List<Line>> = lines

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
                 * Returns a mutable builder for constructing an instance of [Summary].
                 *
                 * The following fields are required:
                 * ```java
                 * .adjustments()
                 * .lines()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Summary]. */
            class Builder internal constructor() {

                private var adjustments: JsonField<MutableList<Adjustment>>? = null
                private var lines: JsonField<MutableList<Line>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(summary: Summary) = apply {
                    adjustments = summary.adjustments.map { it.toMutableList() }
                    lines = summary.lines.map { it.toMutableList() }
                    additionalProperties = summary.additionalProperties.toMutableMap()
                }

                /** List of billing adjustments */
                fun adjustments(adjustments: List<Adjustment>) =
                    adjustments(JsonField.of(adjustments))

                /**
                 * Sets [Builder.adjustments] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.adjustments] with a well-typed
                 * `List<Adjustment>` value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun adjustments(adjustments: JsonField<List<Adjustment>>) = apply {
                    this.adjustments = adjustments.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Adjustment] to [adjustments].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addAdjustment(adjustment: Adjustment) = apply {
                    adjustments =
                        (adjustments ?: JsonField.of(mutableListOf())).also {
                            checkKnown("adjustments", it).add(adjustment)
                        }
                }

                /** List of charge summary lines */
                fun lines(lines: List<Line>) = lines(JsonField.of(lines))

                /**
                 * Sets [Builder.lines] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lines] with a well-typed `List<Line>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun lines(lines: JsonField<List<Line>>) = apply {
                    this.lines = lines.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Line] to [lines].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addLine(line: Line) = apply {
                    lines =
                        (lines ?: JsonField.of(mutableListOf())).also {
                            checkKnown("lines", it).add(line)
                        }
                }

                /** Alias for calling [addLine] with `Line.ofComparative(comparative)`. */
                fun addLine(comparative: Line.Comparative) =
                    addLine(Line.ofComparative(comparative))

                /** Alias for calling [addLine] with `Line.ofSimple(simple)`. */
                fun addLine(simple: Line.Simple) = addLine(Line.ofSimple(simple))

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Summary].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .adjustments()
                 * .lines()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Summary =
                    Summary(
                        checkRequired("adjustments", adjustments).map { it.toImmutable() },
                        checkRequired("lines", lines).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Summary = apply {
                if (validated) {
                    return@apply
                }

                adjustments().forEach { it.validate() }
                lines().forEach { it.validate() }
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
                (adjustments.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (lines.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            class Adjustment
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val amount: JsonField<String>,
                private val description: JsonField<String>,
                private val eventDate: JsonField<LocalDate>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("description")
                    @ExcludeMissing
                    description: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("event_date")
                    @ExcludeMissing
                    eventDate: JsonField<LocalDate> = JsonMissing.of(),
                ) : this(amount, description, eventDate, mutableMapOf())

                /**
                 * Adjustment amount as decimal string
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun amount(): String = amount.getRequired("amount")

                /**
                 * Description of the adjustment
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun description(): String = description.getRequired("description")

                /**
                 * Date when the adjustment occurred
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun eventDate(): LocalDate = eventDate.getRequired("event_date")

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

                /**
                 * Returns the raw JSON value of [description].
                 *
                 * Unlike [description], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("description")
                @ExcludeMissing
                fun _description(): JsonField<String> = description

                /**
                 * Returns the raw JSON value of [eventDate].
                 *
                 * Unlike [eventDate], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("event_date")
                @ExcludeMissing
                fun _eventDate(): JsonField<LocalDate> = eventDate

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
                     * Returns a mutable builder for constructing an instance of [Adjustment].
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .description()
                     * .eventDate()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Adjustment]. */
                class Builder internal constructor() {

                    private var amount: JsonField<String>? = null
                    private var description: JsonField<String>? = null
                    private var eventDate: JsonField<LocalDate>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(adjustment: Adjustment) = apply {
                        amount = adjustment.amount
                        description = adjustment.description
                        eventDate = adjustment.eventDate
                        additionalProperties = adjustment.additionalProperties.toMutableMap()
                    }

                    /** Adjustment amount as decimal string */
                    fun amount(amount: String) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                    /** Description of the adjustment */
                    fun description(description: String) = description(JsonField.of(description))

                    /**
                     * Sets [Builder.description] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.description] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun description(description: JsonField<String>) = apply {
                        this.description = description
                    }

                    /** Date when the adjustment occurred */
                    fun eventDate(eventDate: LocalDate) = eventDate(JsonField.of(eventDate))

                    /**
                     * Sets [Builder.eventDate] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.eventDate] with a well-typed [LocalDate]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun eventDate(eventDate: JsonField<LocalDate>) = apply {
                        this.eventDate = eventDate
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Adjustment].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .description()
                     * .eventDate()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Adjustment =
                        Adjustment(
                            checkRequired("amount", amount),
                            checkRequired("description", description),
                            checkRequired("eventDate", eventDate),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Adjustment = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    description()
                    eventDate()
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
                    (if (amount.asKnown().isPresent) 1 else 0) +
                        (if (description.asKnown().isPresent) 1 else 0) +
                        (if (eventDate.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Adjustment &&
                        amount == other.amount &&
                        description == other.description &&
                        eventDate == other.eventDate &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(amount, description, eventDate, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Adjustment{amount=$amount, description=$description, eventDate=$eventDate, additionalProperties=$additionalProperties}"
            }

            @JsonDeserialize(using = Line.Deserializer::class)
            @JsonSerialize(using = Line.Serializer::class)
            class Line
            private constructor(
                private val comparative: Comparative? = null,
                private val simple: Simple? = null,
                private val _json: JsonValue? = null,
            ) {

                fun comparative(): Optional<Comparative> = Optional.ofNullable(comparative)

                fun simple(): Optional<Simple> = Optional.ofNullable(simple)

                fun isComparative(): Boolean = comparative != null

                fun isSimple(): Boolean = simple != null

                fun asComparative(): Comparative = comparative.getOrThrow("comparative")

                fun asSimple(): Simple = simple.getOrThrow("simple")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        comparative != null -> visitor.visitComparative(comparative)
                        simple != null -> visitor.visitSimple(simple)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                fun validate(): Line = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitComparative(comparative: Comparative) {
                                comparative.validate()
                            }

                            override fun visitSimple(simple: Simple) {
                                simple.validate()
                            }
                        }
                    )
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
                    accept(
                        object : Visitor<Int> {
                            override fun visitComparative(comparative: Comparative) =
                                comparative.validity()

                            override fun visitSimple(simple: Simple) = simple.validity()

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Line &&
                        comparative == other.comparative &&
                        simple == other.simple
                }

                override fun hashCode(): Int = Objects.hash(comparative, simple)

                override fun toString(): String =
                    when {
                        comparative != null -> "Line{comparative=$comparative}"
                        simple != null -> "Line{simple=$simple}"
                        _json != null -> "Line{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Line")
                    }

                companion object {

                    @JvmStatic
                    fun ofComparative(comparative: Comparative) = Line(comparative = comparative)

                    @JvmStatic fun ofSimple(simple: Simple) = Line(simple = simple)
                }

                /**
                 * An interface that defines how to map each variant of [Line] to a value of type
                 * [T].
                 */
                interface Visitor<out T> {

                    fun visitComparative(comparative: Comparative): T

                    fun visitSimple(simple: Simple): T

                    /**
                     * Maps an unknown variant of [Line] to a value of type [T].
                     *
                     * An instance of [Line] can contain an unknown variant if it was deserialized
                     * from data that doesn't match any known variant. For example, if the SDK is on
                     * an older version than the API, then the API may respond with new variants
                     * that the SDK is unaware of.
                     *
                     * @throws TelnyxInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw TelnyxInvalidDataException("Unknown Line: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<Line>(Line::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Line {
                        val json = JsonValue.fromJsonNode(node)
                        val type = json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

                        when (type) {
                            "comparative" -> {
                                return tryDeserialize(node, jacksonTypeRef<Comparative>())?.let {
                                    Line(comparative = it, _json = json)
                                } ?: Line(_json = json)
                            }
                            "simple" -> {
                                return tryDeserialize(node, jacksonTypeRef<Simple>())?.let {
                                    Line(simple = it, _json = json)
                                } ?: Line(_json = json)
                            }
                        }

                        return Line(_json = json)
                    }
                }

                internal class Serializer : BaseSerializer<Line>(Line::class) {

                    override fun serialize(
                        value: Line,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.comparative != null -> generator.writeObject(value.comparative)
                            value.simple != null -> generator.writeObject(value.simple)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Line")
                        }
                    }
                }

                class Comparative
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val alias: JsonField<String>,
                    private val existingThisMonth: JsonField<MonthDetail>,
                    private val name: JsonField<String>,
                    private val newThisMonth: JsonField<MonthDetail>,
                    private val type: JsonValue,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("alias")
                        @ExcludeMissing
                        alias: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("existing_this_month")
                        @ExcludeMissing
                        existingThisMonth: JsonField<MonthDetail> = JsonMissing.of(),
                        @JsonProperty("name")
                        @ExcludeMissing
                        name: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("new_this_month")
                        @ExcludeMissing
                        newThisMonth: JsonField<MonthDetail> = JsonMissing.of(),
                        @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                    ) : this(alias, existingThisMonth, name, newThisMonth, type, mutableMapOf())

                    /**
                     * Service alias
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun alias(): String = alias.getRequired("alias")

                    /**
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun existingThisMonth(): MonthDetail =
                        existingThisMonth.getRequired("existing_this_month")

                    /**
                     * Service name
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun name(): String = name.getRequired("name")

                    /**
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun newThisMonth(): MonthDetail = newThisMonth.getRequired("new_this_month")

                    /**
                     * Expected to always return the following:
                     * ```java
                     * JsonValue.from("comparative")
                     * ```
                     *
                     * However, this method can be useful for debugging and logging (e.g. if the
                     * server responded with an unexpected value).
                     */
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                    /**
                     * Returns the raw JSON value of [alias].
                     *
                     * Unlike [alias], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("alias") @ExcludeMissing fun _alias(): JsonField<String> = alias

                    /**
                     * Returns the raw JSON value of [existingThisMonth].
                     *
                     * Unlike [existingThisMonth], this method doesn't throw if the JSON field has
                     * an unexpected type.
                     */
                    @JsonProperty("existing_this_month")
                    @ExcludeMissing
                    fun _existingThisMonth(): JsonField<MonthDetail> = existingThisMonth

                    /**
                     * Returns the raw JSON value of [name].
                     *
                     * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                    /**
                     * Returns the raw JSON value of [newThisMonth].
                     *
                     * Unlike [newThisMonth], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("new_this_month")
                    @ExcludeMissing
                    fun _newThisMonth(): JsonField<MonthDetail> = newThisMonth

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
                         * Returns a mutable builder for constructing an instance of [Comparative].
                         *
                         * The following fields are required:
                         * ```java
                         * .alias()
                         * .existingThisMonth()
                         * .name()
                         * .newThisMonth()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Comparative]. */
                    class Builder internal constructor() {

                        private var alias: JsonField<String>? = null
                        private var existingThisMonth: JsonField<MonthDetail>? = null
                        private var name: JsonField<String>? = null
                        private var newThisMonth: JsonField<MonthDetail>? = null
                        private var type: JsonValue = JsonValue.from("comparative")
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(comparative: Comparative) = apply {
                            alias = comparative.alias
                            existingThisMonth = comparative.existingThisMonth
                            name = comparative.name
                            newThisMonth = comparative.newThisMonth
                            type = comparative.type
                            additionalProperties = comparative.additionalProperties.toMutableMap()
                        }

                        /** Service alias */
                        fun alias(alias: String) = alias(JsonField.of(alias))

                        /**
                         * Sets [Builder.alias] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.alias] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun alias(alias: JsonField<String>) = apply { this.alias = alias }

                        fun existingThisMonth(existingThisMonth: MonthDetail) =
                            existingThisMonth(JsonField.of(existingThisMonth))

                        /**
                         * Sets [Builder.existingThisMonth] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.existingThisMonth] with a well-typed
                         * [MonthDetail] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun existingThisMonth(existingThisMonth: JsonField<MonthDetail>) = apply {
                            this.existingThisMonth = existingThisMonth
                        }

                        /** Service name */
                        fun name(name: String) = name(JsonField.of(name))

                        /**
                         * Sets [Builder.name] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.name] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun name(name: JsonField<String>) = apply { this.name = name }

                        fun newThisMonth(newThisMonth: MonthDetail) =
                            newThisMonth(JsonField.of(newThisMonth))

                        /**
                         * Sets [Builder.newThisMonth] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.newThisMonth] with a well-typed
                         * [MonthDetail] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun newThisMonth(newThisMonth: JsonField<MonthDetail>) = apply {
                            this.newThisMonth = newThisMonth
                        }

                        /**
                         * Sets the field to an arbitrary JSON value.
                         *
                         * It is usually unnecessary to call this method because the field defaults
                         * to the following:
                         * ```java
                         * JsonValue.from("comparative")
                         * ```
                         *
                         * This method is primarily for setting the field to an undocumented or not
                         * yet supported value.
                         */
                        fun type(type: JsonValue) = apply { this.type = type }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Comparative].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .alias()
                         * .existingThisMonth()
                         * .name()
                         * .newThisMonth()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Comparative =
                            Comparative(
                                checkRequired("alias", alias),
                                checkRequired("existingThisMonth", existingThisMonth),
                                checkRequired("name", name),
                                checkRequired("newThisMonth", newThisMonth),
                                type,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Comparative = apply {
                        if (validated) {
                            return@apply
                        }

                        alias()
                        existingThisMonth().validate()
                        name()
                        newThisMonth().validate()
                        _type().let {
                            if (it != JsonValue.from("comparative")) {
                                throw TelnyxInvalidDataException("'type' is invalid, received $it")
                            }
                        }
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
                        (if (alias.asKnown().isPresent) 1 else 0) +
                            (existingThisMonth.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (name.asKnown().isPresent) 1 else 0) +
                            (newThisMonth.asKnown().getOrNull()?.validity() ?: 0) +
                            type.let { if (it == JsonValue.from("comparative")) 1 else 0 }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Comparative &&
                            alias == other.alias &&
                            existingThisMonth == other.existingThisMonth &&
                            name == other.name &&
                            newThisMonth == other.newThisMonth &&
                            type == other.type &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(
                            alias,
                            existingThisMonth,
                            name,
                            newThisMonth,
                            type,
                            additionalProperties,
                        )
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Comparative{alias=$alias, existingThisMonth=$existingThisMonth, name=$name, newThisMonth=$newThisMonth, type=$type, additionalProperties=$additionalProperties}"
                }

                class Simple
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val alias: JsonField<String>,
                    private val amount: JsonField<String>,
                    private val name: JsonField<String>,
                    private val quantity: JsonField<Long>,
                    private val type: JsonValue,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("alias")
                        @ExcludeMissing
                        alias: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("amount")
                        @ExcludeMissing
                        amount: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("name")
                        @ExcludeMissing
                        name: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("quantity")
                        @ExcludeMissing
                        quantity: JsonField<Long> = JsonMissing.of(),
                        @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                    ) : this(alias, amount, name, quantity, type, mutableMapOf())

                    /**
                     * Service alias
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun alias(): String = alias.getRequired("alias")

                    /**
                     * Total amount as decimal string
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun amount(): String = amount.getRequired("amount")

                    /**
                     * Service name
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun name(): String = name.getRequired("name")

                    /**
                     * Number of items
                     *
                     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun quantity(): Long = quantity.getRequired("quantity")

                    /**
                     * Expected to always return the following:
                     * ```java
                     * JsonValue.from("simple")
                     * ```
                     *
                     * However, this method can be useful for debugging and logging (e.g. if the
                     * server responded with an unexpected value).
                     */
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                    /**
                     * Returns the raw JSON value of [alias].
                     *
                     * Unlike [alias], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("alias") @ExcludeMissing fun _alias(): JsonField<String> = alias

                    /**
                     * Returns the raw JSON value of [amount].
                     *
                     * Unlike [amount], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun _amount(): JsonField<String> = amount

                    /**
                     * Returns the raw JSON value of [name].
                     *
                     * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                    /**
                     * Returns the raw JSON value of [quantity].
                     *
                     * Unlike [quantity], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("quantity")
                    @ExcludeMissing
                    fun _quantity(): JsonField<Long> = quantity

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
                         * Returns a mutable builder for constructing an instance of [Simple].
                         *
                         * The following fields are required:
                         * ```java
                         * .alias()
                         * .amount()
                         * .name()
                         * .quantity()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Simple]. */
                    class Builder internal constructor() {

                        private var alias: JsonField<String>? = null
                        private var amount: JsonField<String>? = null
                        private var name: JsonField<String>? = null
                        private var quantity: JsonField<Long>? = null
                        private var type: JsonValue = JsonValue.from("simple")
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(simple: Simple) = apply {
                            alias = simple.alias
                            amount = simple.amount
                            name = simple.name
                            quantity = simple.quantity
                            type = simple.type
                            additionalProperties = simple.additionalProperties.toMutableMap()
                        }

                        /** Service alias */
                        fun alias(alias: String) = alias(JsonField.of(alias))

                        /**
                         * Sets [Builder.alias] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.alias] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun alias(alias: JsonField<String>) = apply { this.alias = alias }

                        /** Total amount as decimal string */
                        fun amount(amount: String) = amount(JsonField.of(amount))

                        /**
                         * Sets [Builder.amount] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.amount] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                        /** Service name */
                        fun name(name: String) = name(JsonField.of(name))

                        /**
                         * Sets [Builder.name] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.name] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun name(name: JsonField<String>) = apply { this.name = name }

                        /** Number of items */
                        fun quantity(quantity: Long) = quantity(JsonField.of(quantity))

                        /**
                         * Sets [Builder.quantity] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.quantity] with a well-typed [Long] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun quantity(quantity: JsonField<Long>) = apply { this.quantity = quantity }

                        /**
                         * Sets the field to an arbitrary JSON value.
                         *
                         * It is usually unnecessary to call this method because the field defaults
                         * to the following:
                         * ```java
                         * JsonValue.from("simple")
                         * ```
                         *
                         * This method is primarily for setting the field to an undocumented or not
                         * yet supported value.
                         */
                        fun type(type: JsonValue) = apply { this.type = type }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Simple].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .alias()
                         * .amount()
                         * .name()
                         * .quantity()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Simple =
                            Simple(
                                checkRequired("alias", alias),
                                checkRequired("amount", amount),
                                checkRequired("name", name),
                                checkRequired("quantity", quantity),
                                type,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Simple = apply {
                        if (validated) {
                            return@apply
                        }

                        alias()
                        amount()
                        name()
                        quantity()
                        _type().let {
                            if (it != JsonValue.from("simple")) {
                                throw TelnyxInvalidDataException("'type' is invalid, received $it")
                            }
                        }
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
                        (if (alias.asKnown().isPresent) 1 else 0) +
                            (if (amount.asKnown().isPresent) 1 else 0) +
                            (if (name.asKnown().isPresent) 1 else 0) +
                            (if (quantity.asKnown().isPresent) 1 else 0) +
                            type.let { if (it == JsonValue.from("simple")) 1 else 0 }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Simple &&
                            alias == other.alias &&
                            amount == other.amount &&
                            name == other.name &&
                            quantity == other.quantity &&
                            type == other.type &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(alias, amount, name, quantity, type, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Simple{alias=$alias, amount=$amount, name=$name, quantity=$quantity, type=$type, additionalProperties=$additionalProperties}"
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Summary &&
                    adjustments == other.adjustments &&
                    lines == other.lines &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(adjustments, lines, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Summary{adjustments=$adjustments, lines=$lines, additionalProperties=$additionalProperties}"
        }

        class Total
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val credits: JsonField<String>,
            private val existingMrc: JsonField<String>,
            private val grandTotal: JsonField<String>,
            private val ledgerAdjustments: JsonField<String>,
            private val newMrc: JsonField<String>,
            private val newOtc: JsonField<String>,
            private val other: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("credits")
                @ExcludeMissing
                credits: JsonField<String> = JsonMissing.of(),
                @JsonProperty("existing_mrc")
                @ExcludeMissing
                existingMrc: JsonField<String> = JsonMissing.of(),
                @JsonProperty("grand_total")
                @ExcludeMissing
                grandTotal: JsonField<String> = JsonMissing.of(),
                @JsonProperty("ledger_adjustments")
                @ExcludeMissing
                ledgerAdjustments: JsonField<String> = JsonMissing.of(),
                @JsonProperty("new_mrc")
                @ExcludeMissing
                newMrc: JsonField<String> = JsonMissing.of(),
                @JsonProperty("new_otc")
                @ExcludeMissing
                newOtc: JsonField<String> = JsonMissing.of(),
                @JsonProperty("other") @ExcludeMissing other: JsonField<String> = JsonMissing.of(),
            ) : this(
                credits,
                existingMrc,
                grandTotal,
                ledgerAdjustments,
                newMrc,
                newOtc,
                other,
                mutableMapOf(),
            )

            /**
             * Total credits as decimal string
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun credits(): String = credits.getRequired("credits")

            /**
             * Total existing monthly recurring charges as decimal string
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun existingMrc(): String = existingMrc.getRequired("existing_mrc")

            /**
             * Grand total of all charges as decimal string
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun grandTotal(): String = grandTotal.getRequired("grand_total")

            /**
             * Ledger adjustments as decimal string
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun ledgerAdjustments(): String = ledgerAdjustments.getRequired("ledger_adjustments")

            /**
             * Total new monthly recurring charges as decimal string
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun newMrc(): String = newMrc.getRequired("new_mrc")

            /**
             * Total new one-time charges as decimal string
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun newOtc(): String = newOtc.getRequired("new_otc")

            /**
             * Other charges as decimal string
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun other(): String = other.getRequired("other")

            /**
             * Returns the raw JSON value of [credits].
             *
             * Unlike [credits], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("credits") @ExcludeMissing fun _credits(): JsonField<String> = credits

            /**
             * Returns the raw JSON value of [existingMrc].
             *
             * Unlike [existingMrc], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("existing_mrc")
            @ExcludeMissing
            fun _existingMrc(): JsonField<String> = existingMrc

            /**
             * Returns the raw JSON value of [grandTotal].
             *
             * Unlike [grandTotal], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("grand_total")
            @ExcludeMissing
            fun _grandTotal(): JsonField<String> = grandTotal

            /**
             * Returns the raw JSON value of [ledgerAdjustments].
             *
             * Unlike [ledgerAdjustments], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("ledger_adjustments")
            @ExcludeMissing
            fun _ledgerAdjustments(): JsonField<String> = ledgerAdjustments

            /**
             * Returns the raw JSON value of [newMrc].
             *
             * Unlike [newMrc], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("new_mrc") @ExcludeMissing fun _newMrc(): JsonField<String> = newMrc

            /**
             * Returns the raw JSON value of [newOtc].
             *
             * Unlike [newOtc], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("new_otc") @ExcludeMissing fun _newOtc(): JsonField<String> = newOtc

            /**
             * Returns the raw JSON value of [other].
             *
             * Unlike [other], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("other") @ExcludeMissing fun _other(): JsonField<String> = other

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
                 * Returns a mutable builder for constructing an instance of [Total].
                 *
                 * The following fields are required:
                 * ```java
                 * .credits()
                 * .existingMrc()
                 * .grandTotal()
                 * .ledgerAdjustments()
                 * .newMrc()
                 * .newOtc()
                 * .other()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Total]. */
            class Builder internal constructor() {

                private var credits: JsonField<String>? = null
                private var existingMrc: JsonField<String>? = null
                private var grandTotal: JsonField<String>? = null
                private var ledgerAdjustments: JsonField<String>? = null
                private var newMrc: JsonField<String>? = null
                private var newOtc: JsonField<String>? = null
                private var other: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(total: Total) = apply {
                    credits = total.credits
                    existingMrc = total.existingMrc
                    grandTotal = total.grandTotal
                    ledgerAdjustments = total.ledgerAdjustments
                    newMrc = total.newMrc
                    newOtc = total.newOtc
                    other = total.other
                    additionalProperties = total.additionalProperties.toMutableMap()
                }

                /** Total credits as decimal string */
                fun credits(credits: String) = credits(JsonField.of(credits))

                /**
                 * Sets [Builder.credits] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.credits] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun credits(credits: JsonField<String>) = apply { this.credits = credits }

                /** Total existing monthly recurring charges as decimal string */
                fun existingMrc(existingMrc: String) = existingMrc(JsonField.of(existingMrc))

                /**
                 * Sets [Builder.existingMrc] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.existingMrc] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun existingMrc(existingMrc: JsonField<String>) = apply {
                    this.existingMrc = existingMrc
                }

                /** Grand total of all charges as decimal string */
                fun grandTotal(grandTotal: String) = grandTotal(JsonField.of(grandTotal))

                /**
                 * Sets [Builder.grandTotal] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.grandTotal] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun grandTotal(grandTotal: JsonField<String>) = apply {
                    this.grandTotal = grandTotal
                }

                /** Ledger adjustments as decimal string */
                fun ledgerAdjustments(ledgerAdjustments: String) =
                    ledgerAdjustments(JsonField.of(ledgerAdjustments))

                /**
                 * Sets [Builder.ledgerAdjustments] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ledgerAdjustments] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun ledgerAdjustments(ledgerAdjustments: JsonField<String>) = apply {
                    this.ledgerAdjustments = ledgerAdjustments
                }

                /** Total new monthly recurring charges as decimal string */
                fun newMrc(newMrc: String) = newMrc(JsonField.of(newMrc))

                /**
                 * Sets [Builder.newMrc] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.newMrc] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun newMrc(newMrc: JsonField<String>) = apply { this.newMrc = newMrc }

                /** Total new one-time charges as decimal string */
                fun newOtc(newOtc: String) = newOtc(JsonField.of(newOtc))

                /**
                 * Sets [Builder.newOtc] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.newOtc] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun newOtc(newOtc: JsonField<String>) = apply { this.newOtc = newOtc }

                /** Other charges as decimal string */
                fun other(other: String) = other(JsonField.of(other))

                /**
                 * Sets [Builder.other] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.other] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun other(other: JsonField<String>) = apply { this.other = other }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Total].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .credits()
                 * .existingMrc()
                 * .grandTotal()
                 * .ledgerAdjustments()
                 * .newMrc()
                 * .newOtc()
                 * .other()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Total =
                    Total(
                        checkRequired("credits", credits),
                        checkRequired("existingMrc", existingMrc),
                        checkRequired("grandTotal", grandTotal),
                        checkRequired("ledgerAdjustments", ledgerAdjustments),
                        checkRequired("newMrc", newMrc),
                        checkRequired("newOtc", newOtc),
                        checkRequired("other", other),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Total = apply {
                if (validated) {
                    return@apply
                }

                credits()
                existingMrc()
                grandTotal()
                ledgerAdjustments()
                newMrc()
                newOtc()
                other()
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
                (if (credits.asKnown().isPresent) 1 else 0) +
                    (if (existingMrc.asKnown().isPresent) 1 else 0) +
                    (if (grandTotal.asKnown().isPresent) 1 else 0) +
                    (if (ledgerAdjustments.asKnown().isPresent) 1 else 0) +
                    (if (newMrc.asKnown().isPresent) 1 else 0) +
                    (if (newOtc.asKnown().isPresent) 1 else 0) +
                    (if (other.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Total &&
                    credits == other.credits &&
                    existingMrc == other.existingMrc &&
                    grandTotal == other.grandTotal &&
                    ledgerAdjustments == other.ledgerAdjustments &&
                    newMrc == other.newMrc &&
                    newOtc == other.newOtc &&
                    this.other == other.other &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    credits,
                    existingMrc,
                    grandTotal,
                    ledgerAdjustments,
                    newMrc,
                    newOtc,
                    other,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Total{credits=$credits, existingMrc=$existingMrc, grandTotal=$grandTotal, ledgerAdjustments=$ledgerAdjustments, newMrc=$newMrc, newOtc=$newOtc, other=$other, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                currency == other.currency &&
                endDate == other.endDate &&
                startDate == other.startDate &&
                summary == other.summary &&
                total == other.total &&
                userEmail == other.userEmail &&
                userId == other.userId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                currency,
                endDate,
                startDate,
                summary,
                total,
                userEmail,
                userId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{currency=$currency, endDate=$endDate, startDate=$startDate, summary=$summary, total=$total, userEmail=$userEmail, userId=$userId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ChargesSummaryRetrieveResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ChargesSummaryRetrieveResponse{data=$data, additionalProperties=$additionalProperties}"
}
