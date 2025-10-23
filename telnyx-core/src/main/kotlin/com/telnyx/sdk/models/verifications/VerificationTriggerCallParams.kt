// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.verifications

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Trigger Call verification */
class VerificationTriggerCallParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * +E164 formatted phone number.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun phoneNumber(): String = body.phoneNumber()

    /**
     * The identifier of the associated Verify profile.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun verifyProfileId(): String = body.verifyProfileId()

    /**
     * Send a self-generated numeric code to the end-user
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customCode(): Optional<String> = body.customCode()

    /**
     * Optional extension to dial after call is answered using DTMF digits. Valid digits are 0-9,
     * A-D, *, and #. Pauses can be added using w (0.5s) and W (1s).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun extension(): Optional<String> = body.extension()

    /**
     * The number of seconds the verification code is valid for.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timeoutSecs(): Optional<Long> = body.timeoutSecs()

    /**
     * Returns the raw JSON value of [phoneNumber].
     *
     * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _phoneNumber(): JsonField<String> = body._phoneNumber()

    /**
     * Returns the raw JSON value of [verifyProfileId].
     *
     * Unlike [verifyProfileId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _verifyProfileId(): JsonField<String> = body._verifyProfileId()

    /**
     * Returns the raw JSON value of [customCode].
     *
     * Unlike [customCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customCode(): JsonField<String> = body._customCode()

    /**
     * Returns the raw JSON value of [extension].
     *
     * Unlike [extension], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _extension(): JsonField<String> = body._extension()

    /**
     * Returns the raw JSON value of [timeoutSecs].
     *
     * Unlike [timeoutSecs], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _timeoutSecs(): JsonField<Long> = body._timeoutSecs()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [VerificationTriggerCallParams].
         *
         * The following fields are required:
         * ```java
         * .phoneNumber()
         * .verifyProfileId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VerificationTriggerCallParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(verificationTriggerCallParams: VerificationTriggerCallParams) = apply {
            body = verificationTriggerCallParams.body.toBuilder()
            additionalHeaders = verificationTriggerCallParams.additionalHeaders.toBuilder()
            additionalQueryParams = verificationTriggerCallParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [phoneNumber]
         * - [verifyProfileId]
         * - [customCode]
         * - [extension]
         * - [timeoutSecs]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** +E164 formatted phone number. */
        fun phoneNumber(phoneNumber: String) = apply { body.phoneNumber(phoneNumber) }

        /**
         * Sets [Builder.phoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun phoneNumber(phoneNumber: JsonField<String>) = apply { body.phoneNumber(phoneNumber) }

        /** The identifier of the associated Verify profile. */
        fun verifyProfileId(verifyProfileId: String) = apply {
            body.verifyProfileId(verifyProfileId)
        }

        /**
         * Sets [Builder.verifyProfileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.verifyProfileId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun verifyProfileId(verifyProfileId: JsonField<String>) = apply {
            body.verifyProfileId(verifyProfileId)
        }

        /** Send a self-generated numeric code to the end-user */
        fun customCode(customCode: String?) = apply { body.customCode(customCode) }

        /** Alias for calling [Builder.customCode] with `customCode.orElse(null)`. */
        fun customCode(customCode: Optional<String>) = customCode(customCode.getOrNull())

        /**
         * Sets [Builder.customCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customCode(customCode: JsonField<String>) = apply { body.customCode(customCode) }

        /**
         * Optional extension to dial after call is answered using DTMF digits. Valid digits are
         * 0-9, A-D, *, and #. Pauses can be added using w (0.5s) and W (1s).
         */
        fun extension(extension: String?) = apply { body.extension(extension) }

        /** Alias for calling [Builder.extension] with `extension.orElse(null)`. */
        fun extension(extension: Optional<String>) = extension(extension.getOrNull())

        /**
         * Sets [Builder.extension] to an arbitrary JSON value.
         *
         * You should usually call [Builder.extension] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun extension(extension: JsonField<String>) = apply { body.extension(extension) }

        /** The number of seconds the verification code is valid for. */
        fun timeoutSecs(timeoutSecs: Long) = apply { body.timeoutSecs(timeoutSecs) }

        /**
         * Sets [Builder.timeoutSecs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeoutSecs] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun timeoutSecs(timeoutSecs: JsonField<Long>) = apply { body.timeoutSecs(timeoutSecs) }

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
         * Returns an immutable instance of [VerificationTriggerCallParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .phoneNumber()
         * .verifyProfileId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VerificationTriggerCallParams =
            VerificationTriggerCallParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** The request body when creating a verification. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val phoneNumber: JsonField<String>,
        private val verifyProfileId: JsonField<String>,
        private val customCode: JsonField<String>,
        private val extension: JsonField<String>,
        private val timeoutSecs: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("phone_number")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("verify_profile_id")
            @ExcludeMissing
            verifyProfileId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("custom_code")
            @ExcludeMissing
            customCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("extension")
            @ExcludeMissing
            extension: JsonField<String> = JsonMissing.of(),
            @JsonProperty("timeout_secs")
            @ExcludeMissing
            timeoutSecs: JsonField<Long> = JsonMissing.of(),
        ) : this(phoneNumber, verifyProfileId, customCode, extension, timeoutSecs, mutableMapOf())

        /**
         * +E164 formatted phone number.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun phoneNumber(): String = phoneNumber.getRequired("phone_number")

        /**
         * The identifier of the associated Verify profile.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun verifyProfileId(): String = verifyProfileId.getRequired("verify_profile_id")

        /**
         * Send a self-generated numeric code to the end-user
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customCode(): Optional<String> = customCode.getOptional("custom_code")

        /**
         * Optional extension to dial after call is answered using DTMF digits. Valid digits are
         * 0-9, A-D, *, and #. Pauses can be added using w (0.5s) and W (1s).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun extension(): Optional<String> = extension.getOptional("extension")

        /**
         * The number of seconds the verification code is valid for.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timeoutSecs(): Optional<Long> = timeoutSecs.getOptional("timeout_secs")

        /**
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phone_number")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

        /**
         * Returns the raw JSON value of [verifyProfileId].
         *
         * Unlike [verifyProfileId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("verify_profile_id")
        @ExcludeMissing
        fun _verifyProfileId(): JsonField<String> = verifyProfileId

        /**
         * Returns the raw JSON value of [customCode].
         *
         * Unlike [customCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("custom_code")
        @ExcludeMissing
        fun _customCode(): JsonField<String> = customCode

        /**
         * Returns the raw JSON value of [extension].
         *
         * Unlike [extension], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("extension") @ExcludeMissing fun _extension(): JsonField<String> = extension

        /**
         * Returns the raw JSON value of [timeoutSecs].
         *
         * Unlike [timeoutSecs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timeout_secs")
        @ExcludeMissing
        fun _timeoutSecs(): JsonField<Long> = timeoutSecs

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
             * .phoneNumber()
             * .verifyProfileId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var phoneNumber: JsonField<String>? = null
            private var verifyProfileId: JsonField<String>? = null
            private var customCode: JsonField<String> = JsonMissing.of()
            private var extension: JsonField<String> = JsonMissing.of()
            private var timeoutSecs: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                phoneNumber = body.phoneNumber
                verifyProfileId = body.verifyProfileId
                customCode = body.customCode
                extension = body.extension
                timeoutSecs = body.timeoutSecs
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** +E164 formatted phone number. */
            fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

            /**
             * Sets [Builder.phoneNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                this.phoneNumber = phoneNumber
            }

            /** The identifier of the associated Verify profile. */
            fun verifyProfileId(verifyProfileId: String) =
                verifyProfileId(JsonField.of(verifyProfileId))

            /**
             * Sets [Builder.verifyProfileId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.verifyProfileId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun verifyProfileId(verifyProfileId: JsonField<String>) = apply {
                this.verifyProfileId = verifyProfileId
            }

            /** Send a self-generated numeric code to the end-user */
            fun customCode(customCode: String?) = customCode(JsonField.ofNullable(customCode))

            /** Alias for calling [Builder.customCode] with `customCode.orElse(null)`. */
            fun customCode(customCode: Optional<String>) = customCode(customCode.getOrNull())

            /**
             * Sets [Builder.customCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customCode(customCode: JsonField<String>) = apply { this.customCode = customCode }

            /**
             * Optional extension to dial after call is answered using DTMF digits. Valid digits are
             * 0-9, A-D, *, and #. Pauses can be added using w (0.5s) and W (1s).
             */
            fun extension(extension: String?) = extension(JsonField.ofNullable(extension))

            /** Alias for calling [Builder.extension] with `extension.orElse(null)`. */
            fun extension(extension: Optional<String>) = extension(extension.getOrNull())

            /**
             * Sets [Builder.extension] to an arbitrary JSON value.
             *
             * You should usually call [Builder.extension] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun extension(extension: JsonField<String>) = apply { this.extension = extension }

            /** The number of seconds the verification code is valid for. */
            fun timeoutSecs(timeoutSecs: Long) = timeoutSecs(JsonField.of(timeoutSecs))

            /**
             * Sets [Builder.timeoutSecs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeoutSecs] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timeoutSecs(timeoutSecs: JsonField<Long>) = apply { this.timeoutSecs = timeoutSecs }

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
             * .phoneNumber()
             * .verifyProfileId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("phoneNumber", phoneNumber),
                    checkRequired("verifyProfileId", verifyProfileId),
                    customCode,
                    extension,
                    timeoutSecs,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            phoneNumber()
            verifyProfileId()
            customCode()
            extension()
            timeoutSecs()
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
                (if (verifyProfileId.asKnown().isPresent) 1 else 0) +
                (if (customCode.asKnown().isPresent) 1 else 0) +
                (if (extension.asKnown().isPresent) 1 else 0) +
                (if (timeoutSecs.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                phoneNumber == other.phoneNumber &&
                verifyProfileId == other.verifyProfileId &&
                customCode == other.customCode &&
                extension == other.extension &&
                timeoutSecs == other.timeoutSecs &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                phoneNumber,
                verifyProfileId,
                customCode,
                extension,
                timeoutSecs,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{phoneNumber=$phoneNumber, verifyProfileId=$verifyProfileId, customCode=$customCode, extension=$extension, timeoutSecs=$timeoutSecs, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VerificationTriggerCallParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "VerificationTriggerCallParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
