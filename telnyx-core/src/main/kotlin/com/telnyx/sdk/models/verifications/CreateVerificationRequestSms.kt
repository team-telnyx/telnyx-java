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
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** The request body when creating a verification. */
class CreateVerificationRequestSms
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val phoneNumber: JsonField<String>,
    private val verifyProfileId: JsonField<String>,
    private val customCode: JsonField<String>,
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
        @JsonProperty("timeout_secs")
        @ExcludeMissing
        timeoutSecs: JsonField<Long> = JsonMissing.of(),
    ) : this(phoneNumber, verifyProfileId, customCode, timeoutSecs, mutableMapOf())

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
     * Unlike [verifyProfileId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("verify_profile_id")
    @ExcludeMissing
    fun _verifyProfileId(): JsonField<String> = verifyProfileId

    /**
     * Returns the raw JSON value of [customCode].
     *
     * Unlike [customCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("custom_code") @ExcludeMissing fun _customCode(): JsonField<String> = customCode

    /**
     * Returns the raw JSON value of [timeoutSecs].
     *
     * Unlike [timeoutSecs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timeout_secs") @ExcludeMissing fun _timeoutSecs(): JsonField<Long> = timeoutSecs

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
         * Returns a mutable builder for constructing an instance of [CreateVerificationRequestSms].
         *
         * The following fields are required:
         * ```java
         * .phoneNumber()
         * .verifyProfileId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CreateVerificationRequestSms]. */
    class Builder internal constructor() {

        private var phoneNumber: JsonField<String>? = null
        private var verifyProfileId: JsonField<String>? = null
        private var customCode: JsonField<String> = JsonMissing.of()
        private var timeoutSecs: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(createVerificationRequestSms: CreateVerificationRequestSms) = apply {
            phoneNumber = createVerificationRequestSms.phoneNumber
            verifyProfileId = createVerificationRequestSms.verifyProfileId
            customCode = createVerificationRequestSms.customCode
            timeoutSecs = createVerificationRequestSms.timeoutSecs
            additionalProperties = createVerificationRequestSms.additionalProperties.toMutableMap()
        }

        /** +E164 formatted phone number. */
        fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

        /**
         * Sets [Builder.phoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun phoneNumber(phoneNumber: JsonField<String>) = apply { this.phoneNumber = phoneNumber }

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
         * You should usually call [Builder.customCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customCode(customCode: JsonField<String>) = apply { this.customCode = customCode }

        /** The number of seconds the verification code is valid for. */
        fun timeoutSecs(timeoutSecs: Long) = timeoutSecs(JsonField.of(timeoutSecs))

        /**
         * Sets [Builder.timeoutSecs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeoutSecs] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * Returns an immutable instance of [CreateVerificationRequestSms].
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
        fun build(): CreateVerificationRequestSms =
            CreateVerificationRequestSms(
                checkRequired("phoneNumber", phoneNumber),
                checkRequired("verifyProfileId", verifyProfileId),
                customCode,
                timeoutSecs,
                additionalProperties.toMutableMap(),
            )
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
    fun validate(): CreateVerificationRequestSms = apply {
        if (validated) {
            return@apply
        }

        phoneNumber()
        verifyProfileId()
        customCode()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (phoneNumber.asKnown().isPresent) 1 else 0) +
            (if (verifyProfileId.asKnown().isPresent) 1 else 0) +
            (if (customCode.asKnown().isPresent) 1 else 0) +
            (if (timeoutSecs.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreateVerificationRequestSms &&
            phoneNumber == other.phoneNumber &&
            verifyProfileId == other.verifyProfileId &&
            customCode == other.customCode &&
            timeoutSecs == other.timeoutSecs &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(phoneNumber, verifyProfileId, customCode, timeoutSecs, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CreateVerificationRequestSms{phoneNumber=$phoneNumber, verifyProfileId=$verifyProfileId, customCode=$customCode, timeoutSecs=$timeoutSecs, additionalProperties=$additionalProperties}"
}
