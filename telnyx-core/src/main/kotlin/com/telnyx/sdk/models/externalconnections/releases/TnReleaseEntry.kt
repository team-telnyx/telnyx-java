// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalconnections.releases

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class TnReleaseEntry
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val numberId: JsonField<String>,
    private val phoneNumber: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("number_id") @ExcludeMissing numberId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phone_number")
        @ExcludeMissing
        phoneNumber: JsonField<String> = JsonMissing.of(),
    ) : this(numberId, phoneNumber, mutableMapOf())

    /**
     * Phone number ID from the Telnyx API.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun numberId(): Optional<String> = numberId.getOptional("number_id")

    /**
     * Phone number in E164 format.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

    /**
     * Returns the raw JSON value of [numberId].
     *
     * Unlike [numberId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("number_id") @ExcludeMissing fun _numberId(): JsonField<String> = numberId

    /**
     * Returns the raw JSON value of [phoneNumber].
     *
     * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phone_number")
    @ExcludeMissing
    fun _phoneNumber(): JsonField<String> = phoneNumber

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

        /** Returns a mutable builder for constructing an instance of [TnReleaseEntry]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TnReleaseEntry]. */
    class Builder internal constructor() {

        private var numberId: JsonField<String> = JsonMissing.of()
        private var phoneNumber: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(tnReleaseEntry: TnReleaseEntry) = apply {
            numberId = tnReleaseEntry.numberId
            phoneNumber = tnReleaseEntry.phoneNumber
            additionalProperties = tnReleaseEntry.additionalProperties.toMutableMap()
        }

        /** Phone number ID from the Telnyx API. */
        fun numberId(numberId: String) = numberId(JsonField.of(numberId))

        /**
         * Sets [Builder.numberId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numberId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numberId(numberId: JsonField<String>) = apply { this.numberId = numberId }

        /** Phone number in E164 format. */
        fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

        /**
         * Sets [Builder.phoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun phoneNumber(phoneNumber: JsonField<String>) = apply { this.phoneNumber = phoneNumber }

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
         * Returns an immutable instance of [TnReleaseEntry].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TnReleaseEntry =
            TnReleaseEntry(numberId, phoneNumber, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): TnReleaseEntry = apply {
        if (validated) {
            return@apply
        }

        numberId()
        phoneNumber()
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
        (if (numberId.asKnown().isPresent) 1 else 0) +
            (if (phoneNumber.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TnReleaseEntry &&
            numberId == other.numberId &&
            phoneNumber == other.phoneNumber &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(numberId, phoneNumber, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TnReleaseEntry{numberId=$numberId, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
}
