// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation.numbers

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class NumberRefreshResponse
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
         * Returns a mutable builder for constructing an instance of [NumberRefreshResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NumberRefreshResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(numberRefreshResponse: NumberRefreshResponse) = apply {
            data = numberRefreshResponse.data
            additionalProperties = numberRefreshResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [NumberRefreshResponse].
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
        fun build(): NumberRefreshResponse =
            NumberRefreshResponse(checkRequired("data", data), additionalProperties.toMutableMap())
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
    fun validate(): NumberRefreshResponse = apply {
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
        private val results: JsonField<List<Result>>,
        private val totalFailed: JsonField<Long>,
        private val totalRequested: JsonField<Long>,
        private val totalSuccessful: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("results")
            @ExcludeMissing
            results: JsonField<List<Result>> = JsonMissing.of(),
            @JsonProperty("total_failed")
            @ExcludeMissing
            totalFailed: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("total_requested")
            @ExcludeMissing
            totalRequested: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("total_successful")
            @ExcludeMissing
            totalSuccessful: JsonField<Long> = JsonMissing.of(),
        ) : this(results, totalFailed, totalRequested, totalSuccessful, mutableMapOf())

        /**
         * Per-number outcome of the refresh.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun results(): List<Result> = results.getRequired("results")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun totalFailed(): Long = totalFailed.getRequired("total_failed")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun totalRequested(): Long = totalRequested.getRequired("total_requested")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun totalSuccessful(): Long = totalSuccessful.getRequired("total_successful")

        /**
         * Returns the raw JSON value of [results].
         *
         * Unlike [results], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("results") @ExcludeMissing fun _results(): JsonField<List<Result>> = results

        /**
         * Returns the raw JSON value of [totalFailed].
         *
         * Unlike [totalFailed], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total_failed")
        @ExcludeMissing
        fun _totalFailed(): JsonField<Long> = totalFailed

        /**
         * Returns the raw JSON value of [totalRequested].
         *
         * Unlike [totalRequested], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("total_requested")
        @ExcludeMissing
        fun _totalRequested(): JsonField<Long> = totalRequested

        /**
         * Returns the raw JSON value of [totalSuccessful].
         *
         * Unlike [totalSuccessful], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("total_successful")
        @ExcludeMissing
        fun _totalSuccessful(): JsonField<Long> = totalSuccessful

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
             * .results()
             * .totalFailed()
             * .totalRequested()
             * .totalSuccessful()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var results: JsonField<MutableList<Result>>? = null
            private var totalFailed: JsonField<Long>? = null
            private var totalRequested: JsonField<Long>? = null
            private var totalSuccessful: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                results = data.results.map { it.toMutableList() }
                totalFailed = data.totalFailed
                totalRequested = data.totalRequested
                totalSuccessful = data.totalSuccessful
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Per-number outcome of the refresh. */
            fun results(results: List<Result>) = results(JsonField.of(results))

            /**
             * Sets [Builder.results] to an arbitrary JSON value.
             *
             * You should usually call [Builder.results] with a well-typed `List<Result>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun results(results: JsonField<List<Result>>) = apply {
                this.results = results.map { it.toMutableList() }
            }

            /**
             * Adds a single [Result] to [results].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addResult(result: Result) = apply {
                results =
                    (results ?: JsonField.of(mutableListOf())).also {
                        checkKnown("results", it).add(result)
                    }
            }

            fun totalFailed(totalFailed: Long) = totalFailed(JsonField.of(totalFailed))

            /**
             * Sets [Builder.totalFailed] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalFailed] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalFailed(totalFailed: JsonField<Long>) = apply { this.totalFailed = totalFailed }

            fun totalRequested(totalRequested: Long) = totalRequested(JsonField.of(totalRequested))

            /**
             * Sets [Builder.totalRequested] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalRequested] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalRequested(totalRequested: JsonField<Long>) = apply {
                this.totalRequested = totalRequested
            }

            fun totalSuccessful(totalSuccessful: Long) =
                totalSuccessful(JsonField.of(totalSuccessful))

            /**
             * Sets [Builder.totalSuccessful] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalSuccessful] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalSuccessful(totalSuccessful: JsonField<Long>) = apply {
                this.totalSuccessful = totalSuccessful
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .results()
             * .totalFailed()
             * .totalRequested()
             * .totalSuccessful()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("results", results).map { it.toImmutable() },
                    checkRequired("totalFailed", totalFailed),
                    checkRequired("totalRequested", totalRequested),
                    checkRequired("totalSuccessful", totalSuccessful),
                    additionalProperties.toMutableMap(),
                )
        }

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
        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            results().forEach { it.validate() }
            totalFailed()
            totalRequested()
            totalSuccessful()
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
            (results.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (totalFailed.asKnown().isPresent) 1 else 0) +
                (if (totalRequested.asKnown().isPresent) 1 else 0) +
                (if (totalSuccessful.asKnown().isPresent) 1 else 0)

        class Result
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val phoneNumber: JsonField<String>,
            private val success: JsonField<Boolean>,
            private val error: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("phone_number")
                @ExcludeMissing
                phoneNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("success")
                @ExcludeMissing
                success: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("error") @ExcludeMissing error: JsonField<String> = JsonMissing.of(),
            ) : this(phoneNumber, success, error, mutableMapOf())

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun phoneNumber(): String = phoneNumber.getRequired("phone_number")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun success(): Boolean = success.getRequired("success")

            /**
             * `null` when `success` is `true`; carries an error message otherwise.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun error(): Optional<String> = error.getOptional("error")

            /**
             * Returns the raw JSON value of [phoneNumber].
             *
             * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("phone_number")
            @ExcludeMissing
            fun _phoneNumber(): JsonField<String> = phoneNumber

            /**
             * Returns the raw JSON value of [success].
             *
             * Unlike [success], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("success") @ExcludeMissing fun _success(): JsonField<Boolean> = success

            /**
             * Returns the raw JSON value of [error].
             *
             * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

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
                 * Returns a mutable builder for constructing an instance of [Result].
                 *
                 * The following fields are required:
                 * ```java
                 * .phoneNumber()
                 * .success()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Result]. */
            class Builder internal constructor() {

                private var phoneNumber: JsonField<String>? = null
                private var success: JsonField<Boolean>? = null
                private var error: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(result: Result) = apply {
                    phoneNumber = result.phoneNumber
                    success = result.success
                    error = result.error
                    additionalProperties = result.additionalProperties.toMutableMap()
                }

                fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

                /**
                 * Sets [Builder.phoneNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.phoneNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                    this.phoneNumber = phoneNumber
                }

                fun success(success: Boolean) = success(JsonField.of(success))

                /**
                 * Sets [Builder.success] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.success] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun success(success: JsonField<Boolean>) = apply { this.success = success }

                /** `null` when `success` is `true`; carries an error message otherwise. */
                fun error(error: String?) = error(JsonField.ofNullable(error))

                /** Alias for calling [Builder.error] with `error.orElse(null)`. */
                fun error(error: Optional<String>) = error(error.getOrNull())

                /**
                 * Sets [Builder.error] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.error] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun error(error: JsonField<String>) = apply { this.error = error }

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
                 * Returns an immutable instance of [Result].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .phoneNumber()
                 * .success()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Result =
                    Result(
                        checkRequired("phoneNumber", phoneNumber),
                        checkRequired("success", success),
                        error,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Result = apply {
                if (validated) {
                    return@apply
                }

                phoneNumber()
                success()
                error()
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
                (if (phoneNumber.asKnown().isPresent) 1 else 0) +
                    (if (success.asKnown().isPresent) 1 else 0) +
                    (if (error.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Result &&
                    phoneNumber == other.phoneNumber &&
                    success == other.success &&
                    error == other.error &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(phoneNumber, success, error, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Result{phoneNumber=$phoneNumber, success=$success, error=$error, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                results == other.results &&
                totalFailed == other.totalFailed &&
                totalRequested == other.totalRequested &&
                totalSuccessful == other.totalSuccessful &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                results,
                totalFailed,
                totalRequested,
                totalSuccessful,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{results=$results, totalFailed=$totalFailed, totalRequested=$totalRequested, totalSuccessful=$totalSuccessful, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NumberRefreshResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NumberRefreshResponse{data=$data, additionalProperties=$additionalProperties}"
}
