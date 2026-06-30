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
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Submit the two business references and one financial reference for a DIR.
 *
 * The DIR's authorizer email must be verified first (see the email-verification endpoint). Until it
 * is, this returns `409` and no references are stored.
 *
 * The request body carries exactly two business references plus one financial reference. On success
 * the references are stored and the response echoes them in the same shape as the GET. Submitting
 * again converges on the already-stored references rather than erroring.
 */
class ReferenceSubmitParams
private constructor(
    private val dirId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun dirId(): Optional<String> = Optional.ofNullable(dirId)

    /**
     * Exactly two business references.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun businessReferences(): List<BusinessReference> = body.businessReferences()

    /**
     * One reference supplied at submit. The reference type is implied by the field that carries it
     * (business_references vs financial_reference).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun financialReference(): FinancialReference = body.financialReference()

    /**
     * Returns the raw JSON value of [businessReferences].
     *
     * Unlike [businessReferences], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _businessReferences(): JsonField<List<BusinessReference>> = body._businessReferences()

    /**
     * Returns the raw JSON value of [financialReference].
     *
     * Unlike [financialReference], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _financialReference(): JsonField<FinancialReference> = body._financialReference()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ReferenceSubmitParams].
         *
         * The following fields are required:
         * ```java
         * .businessReferences()
         * .financialReference()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ReferenceSubmitParams]. */
    class Builder internal constructor() {

        private var dirId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(referenceSubmitParams: ReferenceSubmitParams) = apply {
            dirId = referenceSubmitParams.dirId
            body = referenceSubmitParams.body.toBuilder()
            additionalHeaders = referenceSubmitParams.additionalHeaders.toBuilder()
            additionalQueryParams = referenceSubmitParams.additionalQueryParams.toBuilder()
        }

        fun dirId(dirId: String?) = apply { this.dirId = dirId }

        /** Alias for calling [Builder.dirId] with `dirId.orElse(null)`. */
        fun dirId(dirId: Optional<String>) = dirId(dirId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [businessReferences]
         * - [financialReference]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Exactly two business references. */
        fun businessReferences(businessReferences: List<BusinessReference>) = apply {
            body.businessReferences(businessReferences)
        }

        /**
         * Sets [Builder.businessReferences] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessReferences] with a well-typed
         * `List<BusinessReference>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun businessReferences(businessReferences: JsonField<List<BusinessReference>>) = apply {
            body.businessReferences(businessReferences)
        }

        /**
         * Adds a single [BusinessReference] to [businessReferences].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBusinessReference(businessReference: BusinessReference) = apply {
            body.addBusinessReference(businessReference)
        }

        /**
         * One reference supplied at submit. The reference type is implied by the field that carries
         * it (business_references vs financial_reference).
         */
        fun financialReference(financialReference: FinancialReference) = apply {
            body.financialReference(financialReference)
        }

        /**
         * Sets [Builder.financialReference] to an arbitrary JSON value.
         *
         * You should usually call [Builder.financialReference] with a well-typed
         * [FinancialReference] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun financialReference(financialReference: JsonField<FinancialReference>) = apply {
            body.financialReference(financialReference)
        }

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
         * Returns an immutable instance of [ReferenceSubmitParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .businessReferences()
         * .financialReference()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ReferenceSubmitParams =
            ReferenceSubmitParams(
                dirId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> dirId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Exactly two business references plus one financial reference. The DIR's authorizer email must
     * be verified before this is accepted.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val businessReferences: JsonField<List<BusinessReference>>,
        private val financialReference: JsonField<FinancialReference>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("business_references")
            @ExcludeMissing
            businessReferences: JsonField<List<BusinessReference>> = JsonMissing.of(),
            @JsonProperty("financial_reference")
            @ExcludeMissing
            financialReference: JsonField<FinancialReference> = JsonMissing.of(),
        ) : this(businessReferences, financialReference, mutableMapOf())

        /**
         * Exactly two business references.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun businessReferences(): List<BusinessReference> =
            businessReferences.getRequired("business_references")

        /**
         * One reference supplied at submit. The reference type is implied by the field that carries
         * it (business_references vs financial_reference).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun financialReference(): FinancialReference =
            financialReference.getRequired("financial_reference")

        /**
         * Returns the raw JSON value of [businessReferences].
         *
         * Unlike [businessReferences], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("business_references")
        @ExcludeMissing
        fun _businessReferences(): JsonField<List<BusinessReference>> = businessReferences

        /**
         * Returns the raw JSON value of [financialReference].
         *
         * Unlike [financialReference], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("financial_reference")
        @ExcludeMissing
        fun _financialReference(): JsonField<FinancialReference> = financialReference

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
             * .businessReferences()
             * .financialReference()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var businessReferences: JsonField<MutableList<BusinessReference>>? = null
            private var financialReference: JsonField<FinancialReference>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                businessReferences = body.businessReferences.map { it.toMutableList() }
                financialReference = body.financialReference
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Exactly two business references. */
            fun businessReferences(businessReferences: List<BusinessReference>) =
                businessReferences(JsonField.of(businessReferences))

            /**
             * Sets [Builder.businessReferences] to an arbitrary JSON value.
             *
             * You should usually call [Builder.businessReferences] with a well-typed
             * `List<BusinessReference>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun businessReferences(businessReferences: JsonField<List<BusinessReference>>) = apply {
                this.businessReferences = businessReferences.map { it.toMutableList() }
            }

            /**
             * Adds a single [BusinessReference] to [businessReferences].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addBusinessReference(businessReference: BusinessReference) = apply {
                businessReferences =
                    (businessReferences ?: JsonField.of(mutableListOf())).also {
                        checkKnown("businessReferences", it).add(businessReference)
                    }
            }

            /**
             * One reference supplied at submit. The reference type is implied by the field that
             * carries it (business_references vs financial_reference).
             */
            fun financialReference(financialReference: FinancialReference) =
                financialReference(JsonField.of(financialReference))

            /**
             * Sets [Builder.financialReference] to an arbitrary JSON value.
             *
             * You should usually call [Builder.financialReference] with a well-typed
             * [FinancialReference] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun financialReference(financialReference: JsonField<FinancialReference>) = apply {
                this.financialReference = financialReference
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .businessReferences()
             * .financialReference()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("businessReferences", businessReferences).map {
                        it.toImmutable()
                    },
                    checkRequired("financialReference", financialReference),
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

            businessReferences().forEach { it.validate() }
            financialReference().validate()
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
            (businessReferences.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (financialReference.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                businessReferences == other.businessReferences &&
                financialReference == other.financialReference &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(businessReferences, financialReference, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{businessReferences=$businessReferences, financialReference=$financialReference, additionalProperties=$additionalProperties}"
    }

    /**
     * One reference supplied at submit. The reference type is implied by the field that carries it
     * (business_references vs financial_reference).
     */
    class BusinessReference
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
            @JsonProperty("full_name")
            @ExcludeMissing
            fullName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phone_e164")
            @ExcludeMissing
            phoneE164: JsonField<String> = JsonMissing.of(),
            @JsonProperty("timezone")
            @ExcludeMissing
            timezone: JsonField<String> = JsonMissing.of(),
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
         * Reference contact email address. Required: the reference is emailed scheduling and
         * dial-in notices.
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
         * IANA timezone id for the reference (e.g. America/New_York). Required: calls are only
         * placed within the reference's local 8am-9pm window.
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
             * Returns a mutable builder for constructing an instance of [BusinessReference].
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

        /** A builder for [BusinessReference]. */
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
            internal fun from(businessReference: BusinessReference) = apply {
                email = businessReference.email
                fullName = businessReference.fullName
                phoneE164 = businessReference.phoneE164
                timezone = businessReference.timezone
                jobTitle = businessReference.jobTitle
                organization = businessReference.organization
                relationshipToRegistrant = businessReference.relationshipToRegistrant
                additionalProperties = businessReference.additionalProperties.toMutableMap()
            }

            /**
             * Reference contact email address. Required: the reference is emailed scheduling and
             * dial-in notices.
             */
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

            /** Reference phone number in E.164 format, e.g. +14155550123. */
            fun phoneE164(phoneE164: String) = phoneE164(JsonField.of(phoneE164))

            /**
             * Sets [Builder.phoneE164] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneE164] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * You should usually call [Builder.timezone] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timezone(timezone: JsonField<String>) = apply { this.timezone = timezone }

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
             * Returns an immutable instance of [BusinessReference].
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
            fun build(): BusinessReference =
                BusinessReference(
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
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): BusinessReference = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
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

            return other is BusinessReference &&
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
            "BusinessReference{email=$email, fullName=$fullName, phoneE164=$phoneE164, timezone=$timezone, jobTitle=$jobTitle, organization=$organization, relationshipToRegistrant=$relationshipToRegistrant, additionalProperties=$additionalProperties}"
    }

    /**
     * One reference supplied at submit. The reference type is implied by the field that carries it
     * (business_references vs financial_reference).
     */
    class FinancialReference
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
            @JsonProperty("full_name")
            @ExcludeMissing
            fullName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phone_e164")
            @ExcludeMissing
            phoneE164: JsonField<String> = JsonMissing.of(),
            @JsonProperty("timezone")
            @ExcludeMissing
            timezone: JsonField<String> = JsonMissing.of(),
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
         * Reference contact email address. Required: the reference is emailed scheduling and
         * dial-in notices.
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
         * IANA timezone id for the reference (e.g. America/New_York). Required: calls are only
         * placed within the reference's local 8am-9pm window.
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
             * Returns a mutable builder for constructing an instance of [FinancialReference].
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

        /** A builder for [FinancialReference]. */
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
            internal fun from(financialReference: FinancialReference) = apply {
                email = financialReference.email
                fullName = financialReference.fullName
                phoneE164 = financialReference.phoneE164
                timezone = financialReference.timezone
                jobTitle = financialReference.jobTitle
                organization = financialReference.organization
                relationshipToRegistrant = financialReference.relationshipToRegistrant
                additionalProperties = financialReference.additionalProperties.toMutableMap()
            }

            /**
             * Reference contact email address. Required: the reference is emailed scheduling and
             * dial-in notices.
             */
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

            /** Reference phone number in E.164 format, e.g. +14155550123. */
            fun phoneE164(phoneE164: String) = phoneE164(JsonField.of(phoneE164))

            /**
             * Sets [Builder.phoneE164] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneE164] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * You should usually call [Builder.timezone] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timezone(timezone: JsonField<String>) = apply { this.timezone = timezone }

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
             * Returns an immutable instance of [FinancialReference].
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
            fun build(): FinancialReference =
                FinancialReference(
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
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): FinancialReference = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
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

            return other is FinancialReference &&
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
            "FinancialReference{email=$email, fullName=$fullName, phoneE164=$phoneE164, timezone=$timezone, jobTitle=$jobTitle, organization=$organization, relationshipToRegistrant=$relationshipToRegistrant, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ReferenceSubmitParams &&
            dirId == other.dirId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(dirId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ReferenceSubmitParams{dirId=$dirId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
