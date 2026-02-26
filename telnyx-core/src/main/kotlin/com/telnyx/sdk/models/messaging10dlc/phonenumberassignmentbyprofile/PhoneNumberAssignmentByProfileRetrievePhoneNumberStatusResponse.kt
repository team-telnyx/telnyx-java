// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messaging10dlc.phonenumberassignmentbyprofile

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
import kotlin.jvm.optionals.getOrNull

class PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val records: JsonField<List<ProfileAssignmentPhoneNumbers>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("records")
        @ExcludeMissing
        records: JsonField<List<ProfileAssignmentPhoneNumbers>> = JsonMissing.of()
    ) : this(records, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun records(): List<ProfileAssignmentPhoneNumbers> = records.getRequired("records")

    /**
     * Returns the raw JSON value of [records].
     *
     * Unlike [records], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("records")
    @ExcludeMissing
    fun _records(): JsonField<List<ProfileAssignmentPhoneNumbers>> = records

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
         * [PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse].
         *
         * The following fields are required:
         * ```java
         * .records()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse]. */
    class Builder internal constructor() {

        private var records: JsonField<MutableList<ProfileAssignmentPhoneNumbers>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            phoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse:
                PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse
        ) = apply {
            records =
                phoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse.records.map {
                    it.toMutableList()
                }
            additionalProperties =
                phoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse.additionalProperties
                    .toMutableMap()
        }

        fun records(records: List<ProfileAssignmentPhoneNumbers>) = records(JsonField.of(records))

        /**
         * Sets [Builder.records] to an arbitrary JSON value.
         *
         * You should usually call [Builder.records] with a well-typed
         * `List<ProfileAssignmentPhoneNumbers>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun records(records: JsonField<List<ProfileAssignmentPhoneNumbers>>) = apply {
            this.records = records.map { it.toMutableList() }
        }

        /**
         * Adds a single [ProfileAssignmentPhoneNumbers] to [records].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRecord(record: ProfileAssignmentPhoneNumbers) = apply {
            records =
                (records ?: JsonField.of(mutableListOf())).also {
                    checkKnown("records", it).add(record)
                }
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
         * Returns an immutable instance of
         * [PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .records()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse =
            PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse(
                checkRequired("records", records).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse = apply {
        if (validated) {
            return@apply
        }

        records().forEach { it.validate() }
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
        (records.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse &&
            records == other.records &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(records, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse{records=$records, additionalProperties=$additionalProperties}"
}
