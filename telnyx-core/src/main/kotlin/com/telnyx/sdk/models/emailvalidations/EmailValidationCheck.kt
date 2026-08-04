// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailvalidations

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

class EmailValidationCheck
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val pass: JsonField<Boolean>,
    private val details: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("pass") @ExcludeMissing pass: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("details") @ExcludeMissing details: JsonField<String> = JsonMissing.of(),
    ) : this(pass, details, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pass(): Boolean = pass.getRequired("pass")

    /**
     * Human-readable check detail. Omitted when nil.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun details(): Optional<String> = details.getOptional("details")

    /**
     * Returns the raw JSON value of [pass].
     *
     * Unlike [pass], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pass") @ExcludeMissing fun _pass(): JsonField<Boolean> = pass

    /**
     * Returns the raw JSON value of [details].
     *
     * Unlike [details], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("details") @ExcludeMissing fun _details(): JsonField<String> = details

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
         * Returns a mutable builder for constructing an instance of [EmailValidationCheck].
         *
         * The following fields are required:
         * ```java
         * .pass()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EmailValidationCheck]. */
    class Builder internal constructor() {

        private var pass: JsonField<Boolean>? = null
        private var details: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(emailValidationCheck: EmailValidationCheck) = apply {
            pass = emailValidationCheck.pass
            details = emailValidationCheck.details
            additionalProperties = emailValidationCheck.additionalProperties.toMutableMap()
        }

        fun pass(pass: Boolean) = pass(JsonField.of(pass))

        /**
         * Sets [Builder.pass] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pass] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pass(pass: JsonField<Boolean>) = apply { this.pass = pass }

        /** Human-readable check detail. Omitted when nil. */
        fun details(details: String) = details(JsonField.of(details))

        /**
         * Sets [Builder.details] to an arbitrary JSON value.
         *
         * You should usually call [Builder.details] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun details(details: JsonField<String>) = apply { this.details = details }

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
         * Returns an immutable instance of [EmailValidationCheck].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .pass()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EmailValidationCheck =
            EmailValidationCheck(
                checkRequired("pass", pass),
                details,
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
    fun validate(): EmailValidationCheck = apply {
        if (validated) {
            return@apply
        }

        pass()
        details()
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
        (if (pass.asKnown().isPresent) 1 else 0) + (if (details.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailValidationCheck &&
            pass == other.pass &&
            details == other.details &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(pass, details, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EmailValidationCheck{pass=$pass, details=$details, additionalProperties=$additionalProperties}"
}
