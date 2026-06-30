// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir.references

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
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

class ReferenceSubmitResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<Data>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): List<Data> = data.getRequired("data")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

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
         * Returns a mutable builder for constructing an instance of [ReferenceSubmitResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ReferenceSubmitResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(referenceSubmitResponse: ReferenceSubmitResponse) = apply {
            data = referenceSubmitResponse.data.map { it.toMutableList() }
            additionalProperties = referenceSubmitResponse.additionalProperties.toMutableMap()
        }

        fun data(data: List<Data>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed `List<Data>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<List<Data>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [Data] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: Data) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
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
         * Returns an immutable instance of [ReferenceSubmitResponse].
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
        fun build(): ReferenceSubmitResponse =
            ReferenceSubmitResponse(
                checkRequired("data", data).map { it.toImmutable() },
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
    fun validate(): ReferenceSubmitResponse = apply {
        if (validated) {
            return@apply
        }

        data().forEach { it.validate() }
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
        (data.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    /**
     * A reference (business or financial) on a DIR, in the customer-facing shape. No internal
     * identifiers are exposed.
     */
    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val fullName: JsonField<String>,
        private val phoneE164: JsonField<String>,
        private val recordType: JsonField<RecordType>,
        private val refType: JsonField<RefType>,
        private val slot: JsonField<Long>,
        private val timezone: JsonField<String>,
        private val email: JsonField<String>,
        private val jobTitle: JsonField<String>,
        private val organization: JsonField<String>,
        private val relationshipToRegistrant: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("full_name")
            @ExcludeMissing
            fullName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phone_e164")
            @ExcludeMissing
            phoneE164: JsonField<String> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<RecordType> = JsonMissing.of(),
            @JsonProperty("ref_type")
            @ExcludeMissing
            refType: JsonField<RefType> = JsonMissing.of(),
            @JsonProperty("slot") @ExcludeMissing slot: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("timezone")
            @ExcludeMissing
            timezone: JsonField<String> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("job_title")
            @ExcludeMissing
            jobTitle: JsonField<String> = JsonMissing.of(),
            @JsonProperty("organization")
            @ExcludeMissing
            organization: JsonField<String> = JsonMissing.of(),
            @JsonProperty("relationship_to_registrant")
            @ExcludeMissing
            relationshipToRegistrant: JsonField<String> = JsonMissing.of(),
        ) : this(
            fullName,
            phoneE164,
            recordType,
            refType,
            slot,
            timezone,
            email,
            jobTitle,
            organization,
            relationshipToRegistrant,
            mutableMapOf(),
        )

        /**
         * Full name of the reference contact.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun fullName(): String = fullName.getRequired("full_name")

        /**
         * Reference phone number in E.164 format.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun phoneE164(): String = phoneE164.getRequired("phone_e164")

        /**
         * Always `dir_reference`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun recordType(): RecordType = recordType.getRequired("record_type")

        /**
         * Whether this is a business reference or the financial reference.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun refType(): RefType = refType.getRequired("ref_type")

        /**
         * Position within the reference type. Business references occupy slots 0 and 1; the
         * financial reference occupies slot 0.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun slot(): Long = slot.getRequired("slot")

        /**
         * IANA timezone id for the reference. Calls are only placed within the reference's local
         * 8am-9pm window.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun timezone(): String = timezone.getRequired("timezone")

        /**
         * Reference contact email address.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun email(): Optional<String> = email.getOptional("email")

        /**
         * Job title of the reference contact.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun jobTitle(): Optional<String> = jobTitle.getOptional("job_title")

        /**
         * Organization the reference contact belongs to.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun organization(): Optional<String> = organization.getOptional("organization")

        /**
         * How the reference contact is related to the registering business.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun relationshipToRegistrant(): Optional<String> =
            relationshipToRegistrant.getOptional("relationship_to_registrant")

        /**
         * Returns the raw JSON value of [fullName].
         *
         * Unlike [fullName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("full_name") @ExcludeMissing fun _fullName(): JsonField<String> = fullName

        /**
         * Returns the raw JSON value of [phoneE164].
         *
         * Unlike [phoneE164], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phone_e164") @ExcludeMissing fun _phoneE164(): JsonField<String> = phoneE164

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<RecordType> = recordType

        /**
         * Returns the raw JSON value of [refType].
         *
         * Unlike [refType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ref_type") @ExcludeMissing fun _refType(): JsonField<RefType> = refType

        /**
         * Returns the raw JSON value of [slot].
         *
         * Unlike [slot], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("slot") @ExcludeMissing fun _slot(): JsonField<Long> = slot

        /**
         * Returns the raw JSON value of [timezone].
         *
         * Unlike [timezone], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timezone") @ExcludeMissing fun _timezone(): JsonField<String> = timezone

        /**
         * Returns the raw JSON value of [email].
         *
         * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /**
         * Returns the raw JSON value of [jobTitle].
         *
         * Unlike [jobTitle], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("job_title") @ExcludeMissing fun _jobTitle(): JsonField<String> = jobTitle

        /**
         * Returns the raw JSON value of [organization].
         *
         * Unlike [organization], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("organization")
        @ExcludeMissing
        fun _organization(): JsonField<String> = organization

        /**
         * Returns the raw JSON value of [relationshipToRegistrant].
         *
         * Unlike [relationshipToRegistrant], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("relationship_to_registrant")
        @ExcludeMissing
        fun _relationshipToRegistrant(): JsonField<String> = relationshipToRegistrant

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
             * .fullName()
             * .phoneE164()
             * .recordType()
             * .refType()
             * .slot()
             * .timezone()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var fullName: JsonField<String>? = null
            private var phoneE164: JsonField<String>? = null
            private var recordType: JsonField<RecordType>? = null
            private var refType: JsonField<RefType>? = null
            private var slot: JsonField<Long>? = null
            private var timezone: JsonField<String>? = null
            private var email: JsonField<String> = JsonMissing.of()
            private var jobTitle: JsonField<String> = JsonMissing.of()
            private var organization: JsonField<String> = JsonMissing.of()
            private var relationshipToRegistrant: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                fullName = data.fullName
                phoneE164 = data.phoneE164
                recordType = data.recordType
                refType = data.refType
                slot = data.slot
                timezone = data.timezone
                email = data.email
                jobTitle = data.jobTitle
                organization = data.organization
                relationshipToRegistrant = data.relationshipToRegistrant
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Full name of the reference contact. */
            fun fullName(fullName: String) = fullName(JsonField.of(fullName))

            /**
             * Sets [Builder.fullName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fullName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fullName(fullName: JsonField<String>) = apply { this.fullName = fullName }

            /** Reference phone number in E.164 format. */
            fun phoneE164(phoneE164: String) = phoneE164(JsonField.of(phoneE164))

            /**
             * Sets [Builder.phoneE164] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneE164] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneE164(phoneE164: JsonField<String>) = apply { this.phoneE164 = phoneE164 }

            /** Always `dir_reference`. */
            fun recordType(recordType: RecordType) = recordType(JsonField.of(recordType))

            /**
             * Sets [Builder.recordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordType] with a well-typed [RecordType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordType(recordType: JsonField<RecordType>) = apply {
                this.recordType = recordType
            }

            /** Whether this is a business reference or the financial reference. */
            fun refType(refType: RefType) = refType(JsonField.of(refType))

            /**
             * Sets [Builder.refType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.refType] with a well-typed [RefType] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun refType(refType: JsonField<RefType>) = apply { this.refType = refType }

            /**
             * Position within the reference type. Business references occupy slots 0 and 1; the
             * financial reference occupies slot 0.
             */
            fun slot(slot: Long) = slot(JsonField.of(slot))

            /**
             * Sets [Builder.slot] to an arbitrary JSON value.
             *
             * You should usually call [Builder.slot] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun slot(slot: JsonField<Long>) = apply { this.slot = slot }

            /**
             * IANA timezone id for the reference. Calls are only placed within the reference's
             * local 8am-9pm window.
             */
            fun timezone(timezone: String) = timezone(JsonField.of(timezone))

            /**
             * Sets [Builder.timezone] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timezone] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timezone(timezone: JsonField<String>) = apply { this.timezone = timezone }

            /** Reference contact email address. */
            fun email(email: String?) = email(JsonField.ofNullable(email))

            /** Alias for calling [Builder.email] with `email.orElse(null)`. */
            fun email(email: Optional<String>) = email(email.getOrNull())

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            /** Job title of the reference contact. */
            fun jobTitle(jobTitle: String?) = jobTitle(JsonField.ofNullable(jobTitle))

            /** Alias for calling [Builder.jobTitle] with `jobTitle.orElse(null)`. */
            fun jobTitle(jobTitle: Optional<String>) = jobTitle(jobTitle.getOrNull())

            /**
             * Sets [Builder.jobTitle] to an arbitrary JSON value.
             *
             * You should usually call [Builder.jobTitle] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun jobTitle(jobTitle: JsonField<String>) = apply { this.jobTitle = jobTitle }

            /** Organization the reference contact belongs to. */
            fun organization(organization: String?) =
                organization(JsonField.ofNullable(organization))

            /** Alias for calling [Builder.organization] with `organization.orElse(null)`. */
            fun organization(organization: Optional<String>) =
                organization(organization.getOrNull())

            /**
             * Sets [Builder.organization] to an arbitrary JSON value.
             *
             * You should usually call [Builder.organization] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun organization(organization: JsonField<String>) = apply {
                this.organization = organization
            }

            /** How the reference contact is related to the registering business. */
            fun relationshipToRegistrant(relationshipToRegistrant: String?) =
                relationshipToRegistrant(JsonField.ofNullable(relationshipToRegistrant))

            /**
             * Alias for calling [Builder.relationshipToRegistrant] with
             * `relationshipToRegistrant.orElse(null)`.
             */
            fun relationshipToRegistrant(relationshipToRegistrant: Optional<String>) =
                relationshipToRegistrant(relationshipToRegistrant.getOrNull())

            /**
             * Sets [Builder.relationshipToRegistrant] to an arbitrary JSON value.
             *
             * You should usually call [Builder.relationshipToRegistrant] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun relationshipToRegistrant(relationshipToRegistrant: JsonField<String>) = apply {
                this.relationshipToRegistrant = relationshipToRegistrant
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
             * .fullName()
             * .phoneE164()
             * .recordType()
             * .refType()
             * .slot()
             * .timezone()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("fullName", fullName),
                    checkRequired("phoneE164", phoneE164),
                    checkRequired("recordType", recordType),
                    checkRequired("refType", refType),
                    checkRequired("slot", slot),
                    checkRequired("timezone", timezone),
                    email,
                    jobTitle,
                    organization,
                    relationshipToRegistrant,
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

            fullName()
            phoneE164()
            recordType().validate()
            refType().validate()
            slot()
            timezone()
            email()
            jobTitle()
            organization()
            relationshipToRegistrant()
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
            (if (fullName.asKnown().isPresent) 1 else 0) +
                (if (phoneE164.asKnown().isPresent) 1 else 0) +
                (recordType.asKnown().getOrNull()?.validity() ?: 0) +
                (refType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (slot.asKnown().isPresent) 1 else 0) +
                (if (timezone.asKnown().isPresent) 1 else 0) +
                (if (email.asKnown().isPresent) 1 else 0) +
                (if (jobTitle.asKnown().isPresent) 1 else 0) +
                (if (organization.asKnown().isPresent) 1 else 0) +
                (if (relationshipToRegistrant.asKnown().isPresent) 1 else 0)

        /** Always `dir_reference`. */
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

                @JvmField val DIR_REFERENCE = of("dir_reference")

                @JvmStatic fun of(value: String) = RecordType(JsonField.of(value))
            }

            /** An enum containing [RecordType]'s known values. */
            enum class Known {
                DIR_REFERENCE
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
                DIR_REFERENCE,
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
                    DIR_REFERENCE -> Value.DIR_REFERENCE
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
                    DIR_REFERENCE -> Known.DIR_REFERENCE
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

        /** Whether this is a business reference or the financial reference. */
        class RefType @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val BUSINESS = of("business")

                @JvmField val FINANCIAL = of("financial")

                @JvmStatic fun of(value: String) = RefType(JsonField.of(value))
            }

            /** An enum containing [RefType]'s known values. */
            enum class Known {
                BUSINESS,
                FINANCIAL,
            }

            /**
             * An enum containing [RefType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [RefType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                BUSINESS,
                FINANCIAL,
                /**
                 * An enum member indicating that [RefType] was instantiated with an unknown value.
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
                    BUSINESS -> Value.BUSINESS
                    FINANCIAL -> Value.FINANCIAL
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
                    BUSINESS -> Known.BUSINESS
                    FINANCIAL -> Known.FINANCIAL
                    else -> throw TelnyxInvalidDataException("Unknown RefType: $value")
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
            fun validate(): RefType = apply {
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

                return other is RefType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                fullName == other.fullName &&
                phoneE164 == other.phoneE164 &&
                recordType == other.recordType &&
                refType == other.refType &&
                slot == other.slot &&
                timezone == other.timezone &&
                email == other.email &&
                jobTitle == other.jobTitle &&
                organization == other.organization &&
                relationshipToRegistrant == other.relationshipToRegistrant &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                fullName,
                phoneE164,
                recordType,
                refType,
                slot,
                timezone,
                email,
                jobTitle,
                organization,
                relationshipToRegistrant,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{fullName=$fullName, phoneE164=$phoneE164, recordType=$recordType, refType=$refType, slot=$slot, timezone=$timezone, email=$email, jobTitle=$jobTitle, organization=$organization, relationshipToRegistrant=$relationshipToRegistrant, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ReferenceSubmitResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ReferenceSubmitResponse{data=$data, additionalProperties=$additionalProperties}"
}
