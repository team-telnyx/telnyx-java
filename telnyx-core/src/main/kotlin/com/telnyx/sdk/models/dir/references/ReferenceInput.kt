// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir.references

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

/**
 * One reference supplied at submit. The reference type is implied by the field that carries it
 * (business_references vs financial_reference).
 */
class ReferenceInput
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val email: JsonField<String>,
    private val fullName: JsonField<String>,
    private val phoneE164: JsonField<String>,
    private val timezone: JsonField<String>,
    private val jobTitle: JsonField<String>,
    private val organization: JsonField<String>,
    private val relationshipToRegistrant: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("full_name") @ExcludeMissing fullName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phone_e164") @ExcludeMissing phoneE164: JsonField<String> = JsonMissing.of(),
        @JsonProperty("timezone") @ExcludeMissing timezone: JsonField<String> = JsonMissing.of(),
        @JsonProperty("job_title") @ExcludeMissing jobTitle: JsonField<String> = JsonMissing.of(),
        @JsonProperty("organization")
        @ExcludeMissing
        organization: JsonField<String> = JsonMissing.of(),
        @JsonProperty("relationship_to_registrant")
        @ExcludeMissing
        relationshipToRegistrant: JsonField<String> = JsonMissing.of(),
    ) : this(
        email,
        fullName,
        phoneE164,
        timezone,
        jobTitle,
        organization,
        relationshipToRegistrant,
        mutableMapOf(),
    )

    /**
     * Reference contact email address. Required: the reference is emailed scheduling and dial-in
     * notices.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun email(): String = email.getRequired("email")

    /**
     * Full name of the reference contact.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fullName(): String = fullName.getRequired("full_name")

    /**
     * Reference phone number in E.164 format, e.g. +14155550123.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun phoneE164(): String = phoneE164.getRequired("phone_e164")

    /**
     * IANA timezone id for the reference (e.g. America/New_York). Required: calls are only placed
     * within the reference's local 8am-9pm window.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timezone(): String = timezone.getRequired("timezone")

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
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

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
     * Returns the raw JSON value of [timezone].
     *
     * Unlike [timezone], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timezone") @ExcludeMissing fun _timezone(): JsonField<String> = timezone

    /**
     * Returns the raw JSON value of [jobTitle].
     *
     * Unlike [jobTitle], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("job_title") @ExcludeMissing fun _jobTitle(): JsonField<String> = jobTitle

    /**
     * Returns the raw JSON value of [organization].
     *
     * Unlike [organization], this method doesn't throw if the JSON field has an unexpected type.
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
         * Returns a mutable builder for constructing an instance of [ReferenceInput].
         *
         * The following fields are required:
         * ```java
         * .email()
         * .fullName()
         * .phoneE164()
         * .timezone()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ReferenceInput]. */
    class Builder internal constructor() {

        private var email: JsonField<String>? = null
        private var fullName: JsonField<String>? = null
        private var phoneE164: JsonField<String>? = null
        private var timezone: JsonField<String>? = null
        private var jobTitle: JsonField<String> = JsonMissing.of()
        private var organization: JsonField<String> = JsonMissing.of()
        private var relationshipToRegistrant: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(referenceInput: ReferenceInput) = apply {
            email = referenceInput.email
            fullName = referenceInput.fullName
            phoneE164 = referenceInput.phoneE164
            timezone = referenceInput.timezone
            jobTitle = referenceInput.jobTitle
            organization = referenceInput.organization
            relationshipToRegistrant = referenceInput.relationshipToRegistrant
            additionalProperties = referenceInput.additionalProperties.toMutableMap()
        }

        /**
         * Reference contact email address. Required: the reference is emailed scheduling and
         * dial-in notices.
         */
        fun email(email: String) = email(JsonField.of(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        /** Full name of the reference contact. */
        fun fullName(fullName: String) = fullName(JsonField.of(fullName))

        /**
         * Sets [Builder.fullName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fullName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fullName(fullName: JsonField<String>) = apply { this.fullName = fullName }

        /** Reference phone number in E.164 format, e.g. +14155550123. */
        fun phoneE164(phoneE164: String) = phoneE164(JsonField.of(phoneE164))

        /**
         * Sets [Builder.phoneE164] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneE164] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun phoneE164(phoneE164: JsonField<String>) = apply { this.phoneE164 = phoneE164 }

        /**
         * IANA timezone id for the reference (e.g. America/New_York). Required: calls are only
         * placed within the reference's local 8am-9pm window.
         */
        fun timezone(timezone: String) = timezone(JsonField.of(timezone))

        /**
         * Sets [Builder.timezone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timezone] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun timezone(timezone: JsonField<String>) = apply { this.timezone = timezone }

        /** Job title of the reference contact. */
        fun jobTitle(jobTitle: String?) = jobTitle(JsonField.ofNullable(jobTitle))

        /** Alias for calling [Builder.jobTitle] with `jobTitle.orElse(null)`. */
        fun jobTitle(jobTitle: Optional<String>) = jobTitle(jobTitle.getOrNull())

        /**
         * Sets [Builder.jobTitle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jobTitle] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun jobTitle(jobTitle: JsonField<String>) = apply { this.jobTitle = jobTitle }

        /** Organization the reference contact belongs to. */
        fun organization(organization: String?) = organization(JsonField.ofNullable(organization))

        /** Alias for calling [Builder.organization] with `organization.orElse(null)`. */
        fun organization(organization: Optional<String>) = organization(organization.getOrNull())

        /**
         * Sets [Builder.organization] to an arbitrary JSON value.
         *
         * You should usually call [Builder.organization] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
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
         * Returns an immutable instance of [ReferenceInput].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .email()
         * .fullName()
         * .phoneE164()
         * .timezone()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ReferenceInput =
            ReferenceInput(
                checkRequired("email", email),
                checkRequired("fullName", fullName),
                checkRequired("phoneE164", phoneE164),
                checkRequired("timezone", timezone),
                jobTitle,
                organization,
                relationshipToRegistrant,
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
    fun validate(): ReferenceInput = apply {
        if (validated) {
            return@apply
        }

        email()
        fullName()
        phoneE164()
        timezone()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (email.asKnown().isPresent) 1 else 0) +
            (if (fullName.asKnown().isPresent) 1 else 0) +
            (if (phoneE164.asKnown().isPresent) 1 else 0) +
            (if (timezone.asKnown().isPresent) 1 else 0) +
            (if (jobTitle.asKnown().isPresent) 1 else 0) +
            (if (organization.asKnown().isPresent) 1 else 0) +
            (if (relationshipToRegistrant.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ReferenceInput &&
            email == other.email &&
            fullName == other.fullName &&
            phoneE164 == other.phoneE164 &&
            timezone == other.timezone &&
            jobTitle == other.jobTitle &&
            organization == other.organization &&
            relationshipToRegistrant == other.relationshipToRegistrant &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            email,
            fullName,
            phoneE164,
            timezone,
            jobTitle,
            organization,
            relationshipToRegistrant,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ReferenceInput{email=$email, fullName=$fullName, phoneE164=$phoneE164, timezone=$timezone, jobTitle=$jobTitle, organization=$organization, relationshipToRegistrant=$relationshipToRegistrant, additionalProperties=$additionalProperties}"
}
