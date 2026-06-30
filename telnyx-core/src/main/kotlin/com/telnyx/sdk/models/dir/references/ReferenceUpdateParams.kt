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
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Partially update one reference, addressed by the DIR id plus the reference's type (business or
 * financial) and slot.
 *
 * Cosmetic fields (full name, job title, organization, relationship, email) are always editable.
 * The phone number and timezone may only be changed while a scheduled call has not yet been dialed;
 * if a call is in progress or all attempts are complete, those fields are locked. Changing the
 * timezone reschedules any pending call into the new local calling window.
 */
class ReferenceUpdateParams
private constructor(
    private val dirId: String,
    private val refType: RefType,
    private val slot: Long?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun dirId(): String = dirId

    fun refType(): RefType = refType

    fun slot(): Optional<Long> = Optional.ofNullable(slot)

    /**
     * Reference contact email address.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun email(): Optional<String> = body.email()

    /**
     * Full name of the reference contact.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fullName(): Optional<String> = body.fullName()

    /**
     * Job title of the reference contact.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun jobTitle(): Optional<String> = body.jobTitle()

    /**
     * Organization the reference contact belongs to.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun organization(): Optional<String> = body.organization()

    /**
     * Reference phone number in E.164 format.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneE164(): Optional<String> = body.phoneE164()

    /**
     * How the reference contact is related to the registering business.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun relationshipToRegistrant(): Optional<String> = body.relationshipToRegistrant()

    /**
     * IANA timezone id for the reference.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timezone(): Optional<String> = body.timezone()

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _email(): JsonField<String> = body._email()

    /**
     * Returns the raw JSON value of [fullName].
     *
     * Unlike [fullName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _fullName(): JsonField<String> = body._fullName()

    /**
     * Returns the raw JSON value of [jobTitle].
     *
     * Unlike [jobTitle], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _jobTitle(): JsonField<String> = body._jobTitle()

    /**
     * Returns the raw JSON value of [organization].
     *
     * Unlike [organization], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _organization(): JsonField<String> = body._organization()

    /**
     * Returns the raw JSON value of [phoneE164].
     *
     * Unlike [phoneE164], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _phoneE164(): JsonField<String> = body._phoneE164()

    /**
     * Returns the raw JSON value of [relationshipToRegistrant].
     *
     * Unlike [relationshipToRegistrant], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _relationshipToRegistrant(): JsonField<String> = body._relationshipToRegistrant()

    /**
     * Returns the raw JSON value of [timezone].
     *
     * Unlike [timezone], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _timezone(): JsonField<String> = body._timezone()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ReferenceUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .dirId()
         * .refType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ReferenceUpdateParams]. */
    class Builder internal constructor() {

        private var dirId: String? = null
        private var refType: RefType? = null
        private var slot: Long? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(referenceUpdateParams: ReferenceUpdateParams) = apply {
            dirId = referenceUpdateParams.dirId
            refType = referenceUpdateParams.refType
            slot = referenceUpdateParams.slot
            body = referenceUpdateParams.body.toBuilder()
            additionalHeaders = referenceUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = referenceUpdateParams.additionalQueryParams.toBuilder()
        }

        fun dirId(dirId: String) = apply { this.dirId = dirId }

        fun refType(refType: RefType) = apply { this.refType = refType }

        fun slot(slot: Long?) = apply { this.slot = slot }

        /**
         * Alias for [Builder.slot].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun slot(slot: Long) = slot(slot as Long?)

        /** Alias for calling [Builder.slot] with `slot.orElse(null)`. */
        fun slot(slot: Optional<Long>) = slot(slot.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [email]
         * - [fullName]
         * - [jobTitle]
         * - [organization]
         * - [phoneE164]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Reference contact email address. */
        fun email(email: String) = apply { body.email(email) }

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { body.email(email) }

        /** Full name of the reference contact. */
        fun fullName(fullName: String) = apply { body.fullName(fullName) }

        /**
         * Sets [Builder.fullName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fullName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fullName(fullName: JsonField<String>) = apply { body.fullName(fullName) }

        /** Job title of the reference contact. */
        fun jobTitle(jobTitle: String?) = apply { body.jobTitle(jobTitle) }

        /** Alias for calling [Builder.jobTitle] with `jobTitle.orElse(null)`. */
        fun jobTitle(jobTitle: Optional<String>) = jobTitle(jobTitle.getOrNull())

        /**
         * Sets [Builder.jobTitle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jobTitle] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun jobTitle(jobTitle: JsonField<String>) = apply { body.jobTitle(jobTitle) }

        /** Organization the reference contact belongs to. */
        fun organization(organization: String?) = apply { body.organization(organization) }

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
            body.organization(organization)
        }

        /** Reference phone number in E.164 format. */
        fun phoneE164(phoneE164: String) = apply { body.phoneE164(phoneE164) }

        /**
         * Sets [Builder.phoneE164] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneE164] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun phoneE164(phoneE164: JsonField<String>) = apply { body.phoneE164(phoneE164) }

        /** How the reference contact is related to the registering business. */
        fun relationshipToRegistrant(relationshipToRegistrant: String?) = apply {
            body.relationshipToRegistrant(relationshipToRegistrant)
        }

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
            body.relationshipToRegistrant(relationshipToRegistrant)
        }

        /** IANA timezone id for the reference. */
        fun timezone(timezone: String) = apply { body.timezone(timezone) }

        /**
         * Sets [Builder.timezone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timezone] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun timezone(timezone: JsonField<String>) = apply { body.timezone(timezone) }

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
         * Returns an immutable instance of [ReferenceUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .dirId()
         * .refType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ReferenceUpdateParams =
            ReferenceUpdateParams(
                checkRequired("dirId", dirId),
                checkRequired("refType", refType),
                slot,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> dirId
            1 -> refType.toString()
            2 -> slot?.toString() ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Partial update for a single reference; supply at least one field. Cosmetic fields are always
     * editable. phone_e164 and timezone may only be changed while a scheduled call has not yet been
     * dialed.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val email: JsonField<String>,
        private val fullName: JsonField<String>,
        private val jobTitle: JsonField<String>,
        private val organization: JsonField<String>,
        private val phoneE164: JsonField<String>,
        private val relationshipToRegistrant: JsonField<String>,
        private val timezone: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("full_name")
            @ExcludeMissing
            fullName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("job_title")
            @ExcludeMissing
            jobTitle: JsonField<String> = JsonMissing.of(),
            @JsonProperty("organization")
            @ExcludeMissing
            organization: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phone_e164")
            @ExcludeMissing
            phoneE164: JsonField<String> = JsonMissing.of(),
            @JsonProperty("relationship_to_registrant")
            @ExcludeMissing
            relationshipToRegistrant: JsonField<String> = JsonMissing.of(),
            @JsonProperty("timezone") @ExcludeMissing timezone: JsonField<String> = JsonMissing.of(),
        ) : this(
            email,
            fullName,
            jobTitle,
            organization,
            phoneE164,
            relationshipToRegistrant,
            timezone,
            mutableMapOf(),
        )

        /**
         * Reference contact email address.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun email(): Optional<String> = email.getOptional("email")

        /**
         * Full name of the reference contact.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun fullName(): Optional<String> = fullName.getOptional("full_name")

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
         * Reference phone number in E.164 format.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneE164(): Optional<String> = phoneE164.getOptional("phone_e164")

        /**
         * How the reference contact is related to the registering business.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun relationshipToRegistrant(): Optional<String> =
            relationshipToRegistrant.getOptional("relationship_to_registrant")

        /**
         * IANA timezone id for the reference.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timezone(): Optional<String> = timezone.getOptional("timezone")

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
         * Returns the raw JSON value of [phoneE164].
         *
         * Unlike [phoneE164], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phone_e164") @ExcludeMissing fun _phoneE164(): JsonField<String> = phoneE164

        /**
         * Returns the raw JSON value of [relationshipToRegistrant].
         *
         * Unlike [relationshipToRegistrant], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("relationship_to_registrant")
        @ExcludeMissing
        fun _relationshipToRegistrant(): JsonField<String> = relationshipToRegistrant

        /**
         * Returns the raw JSON value of [timezone].
         *
         * Unlike [timezone], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timezone") @ExcludeMissing fun _timezone(): JsonField<String> = timezone

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var email: JsonField<String> = JsonMissing.of()
            private var fullName: JsonField<String> = JsonMissing.of()
            private var jobTitle: JsonField<String> = JsonMissing.of()
            private var organization: JsonField<String> = JsonMissing.of()
            private var phoneE164: JsonField<String> = JsonMissing.of()
            private var relationshipToRegistrant: JsonField<String> = JsonMissing.of()
            private var timezone: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                email = body.email
                fullName = body.fullName
                jobTitle = body.jobTitle
                organization = body.organization
                phoneE164 = body.phoneE164
                relationshipToRegistrant = body.relationshipToRegistrant
                timezone = body.timezone
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Reference contact email address. */
            fun email(email: String) = email(JsonField.of(email))

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

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

            /** IANA timezone id for the reference. */
            fun timezone(timezone: String) = timezone(JsonField.of(timezone))

            /**
             * Sets [Builder.timezone] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timezone] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timezone(timezone: JsonField<String>) = apply { this.timezone = timezone }

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
             */
            fun build(): Body =
                Body(
                    email,
                    fullName,
                    jobTitle,
                    organization,
                    phoneE164,
                    relationshipToRegistrant,
                    timezone,
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            email()
            fullName()
            jobTitle()
            organization()
            phoneE164()
            relationshipToRegistrant()
            timezone()
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
            (if (email.asKnown().isPresent) 1 else 0) +
                (if (fullName.asKnown().isPresent) 1 else 0) +
                (if (jobTitle.asKnown().isPresent) 1 else 0) +
                (if (organization.asKnown().isPresent) 1 else 0) +
                (if (phoneE164.asKnown().isPresent) 1 else 0) +
                (if (relationshipToRegistrant.asKnown().isPresent) 1 else 0) +
                (if (timezone.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                email == other.email &&
                fullName == other.fullName &&
                jobTitle == other.jobTitle &&
                organization == other.organization &&
                phoneE164 == other.phoneE164 &&
                relationshipToRegistrant == other.relationshipToRegistrant &&
                timezone == other.timezone &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                email,
                fullName,
                jobTitle,
                organization,
                phoneE164,
                relationshipToRegistrant,
                timezone,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{email=$email, fullName=$fullName, jobTitle=$jobTitle, organization=$organization, phoneE164=$phoneE164, relationshipToRegistrant=$relationshipToRegistrant, timezone=$timezone, additionalProperties=$additionalProperties}"
    }

    class RefType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BUSINESS,
            FINANCIAL,
            /** An enum member indicating that [RefType] was instantiated with an unknown value. */
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
                BUSINESS -> Value.BUSINESS
                FINANCIAL -> Value.FINANCIAL
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
                BUSINESS -> Known.BUSINESS
                FINANCIAL -> Known.FINANCIAL
                else -> throw TelnyxInvalidDataException("Unknown RefType: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
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

        return other is ReferenceUpdateParams &&
            dirId == other.dirId &&
            refType == other.refType &&
            slot == other.slot &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(dirId, refType, slot, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ReferenceUpdateParams{dirId=$dirId, refType=$refType, slot=$slot, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
