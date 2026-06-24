// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import com.telnyx.sdk.models.dir.phonenumbers.RejectionReason
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Dir
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val authorizerEmail: JsonField<String>,
    private val authorizerName: JsonField<String>,
    private val callReasons: JsonField<List<CallReason>>,
    private val certifyBrandIsAccurate: JsonField<Boolean>,
    private val certifyIpOwnership: JsonField<Boolean>,
    private val certifyNoShaftContent: JsonField<Boolean>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val displayName: JsonField<String>,
    private val documents: JsonField<List<Document>>,
    private val enterpriseId: JsonField<String>,
    private val expiringAt: JsonField<OffsetDateTime>,
    private val logoUrl: JsonField<String>,
    private val rejectedAt: JsonField<OffsetDateTime>,
    private val rejectionReasons: JsonField<List<RejectionReason>>,
    private val reselling: JsonField<Boolean>,
    private val status: JsonField<DirStatus>,
    private val submittedAt: JsonField<OffsetDateTime>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val verifiedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("authorizer_email")
        @ExcludeMissing
        authorizerEmail: JsonField<String> = JsonMissing.of(),
        @JsonProperty("authorizer_name")
        @ExcludeMissing
        authorizerName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("call_reasons")
        @ExcludeMissing
        callReasons: JsonField<List<CallReason>> = JsonMissing.of(),
        @JsonProperty("certify_brand_is_accurate")
        @ExcludeMissing
        certifyBrandIsAccurate: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("certify_ip_ownership")
        @ExcludeMissing
        certifyIpOwnership: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("certify_no_shaft_content")
        @ExcludeMissing
        certifyNoShaftContent: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("display_name")
        @ExcludeMissing
        displayName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("documents")
        @ExcludeMissing
        documents: JsonField<List<Document>> = JsonMissing.of(),
        @JsonProperty("enterprise_id")
        @ExcludeMissing
        enterpriseId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expiring_at")
        @ExcludeMissing
        expiringAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("logo_url") @ExcludeMissing logoUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rejected_at")
        @ExcludeMissing
        rejectedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("rejection_reasons")
        @ExcludeMissing
        rejectionReasons: JsonField<List<RejectionReason>> = JsonMissing.of(),
        @JsonProperty("reselling") @ExcludeMissing reselling: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<DirStatus> = JsonMissing.of(),
        @JsonProperty("submitted_at")
        @ExcludeMissing
        submittedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("verified_at")
        @ExcludeMissing
        verifiedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        authorizerEmail,
        authorizerName,
        callReasons,
        certifyBrandIsAccurate,
        certifyIpOwnership,
        certifyNoShaftContent,
        createdAt,
        displayName,
        documents,
        enterpriseId,
        expiringAt,
        logoUrl,
        rejectedAt,
        rejectionReasons,
        reselling,
        status,
        submittedAt,
        updatedAt,
        verifiedAt,
        mutableMapOf(),
    )

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun authorizerEmail(): Optional<String> = authorizerEmail.getOptional("authorizer_email")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun authorizerName(): Optional<String> = authorizerName.getOptional("authorizer_name")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callReasons(): Optional<List<CallReason>> = callReasons.getOptional("call_reasons")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun certifyBrandIsAccurate(): Optional<Boolean> =
        certifyBrandIsAccurate.getOptional("certify_brand_is_accurate")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun certifyIpOwnership(): Optional<Boolean> =
        certifyIpOwnership.getOptional("certify_ip_ownership")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun certifyNoShaftContent(): Optional<Boolean> =
        certifyNoShaftContent.getOptional("certify_no_shaft_content")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun displayName(): Optional<String> = displayName.getOptional("display_name")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun documents(): Optional<List<Document>> = documents.getOptional("documents")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enterpriseId(): Optional<String> = enterpriseId.getOptional("enterprise_id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expiringAt(): Optional<OffsetDateTime> = expiringAt.getOptional("expiring_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun logoUrl(): Optional<String> = logoUrl.getOptional("logo_url")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rejectedAt(): Optional<OffsetDateTime> = rejectedAt.getOptional("rejected_at")

    /**
     * Populated when `status` is `rejected`; cleared on `/submit` or successful approval.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rejectionReasons(): Optional<List<RejectionReason>> =
        rejectionReasons.getOptional("rejection_reasons")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reselling(): Optional<Boolean> = reselling.getOptional("reselling")

    /**
     * DIR lifecycle status.
     * - `draft` - newly created; editable; not yet submitted.
     * - `submitted` / `in_review` - Telnyx is reviewing.
     * - `verified` - approved; phone numbers may be attached.
     * - `rejected` - Telnyx rejected this submission; `rejection_reasons` is populated; customer
     *   can edit and resubmit.
     * - `unsuccessful` - system-side error during processing; customer can edit and resubmit.
     * - `suspended` - temporarily disabled (e.g. by an active infringement claim).
     * - `expired` - verification expired; customer must resubmit.
     * - `infringement_claimed` - a trademark/impersonation claim is open against this DIR.
     * - `permanently_rejected` - terminal; cannot be resubmitted.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<DirStatus> = status.getOptional("status")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun submittedAt(): Optional<OffsetDateTime> = submittedAt.getOptional("submitted_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun verifiedAt(): Optional<OffsetDateTime> = verifiedAt.getOptional("verified_at")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [authorizerEmail].
     *
     * Unlike [authorizerEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("authorizer_email")
    @ExcludeMissing
    fun _authorizerEmail(): JsonField<String> = authorizerEmail

    /**
     * Returns the raw JSON value of [authorizerName].
     *
     * Unlike [authorizerName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("authorizer_name")
    @ExcludeMissing
    fun _authorizerName(): JsonField<String> = authorizerName

    /**
     * Returns the raw JSON value of [callReasons].
     *
     * Unlike [callReasons], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("call_reasons")
    @ExcludeMissing
    fun _callReasons(): JsonField<List<CallReason>> = callReasons

    /**
     * Returns the raw JSON value of [certifyBrandIsAccurate].
     *
     * Unlike [certifyBrandIsAccurate], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("certify_brand_is_accurate")
    @ExcludeMissing
    fun _certifyBrandIsAccurate(): JsonField<Boolean> = certifyBrandIsAccurate

    /**
     * Returns the raw JSON value of [certifyIpOwnership].
     *
     * Unlike [certifyIpOwnership], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("certify_ip_ownership")
    @ExcludeMissing
    fun _certifyIpOwnership(): JsonField<Boolean> = certifyIpOwnership

    /**
     * Returns the raw JSON value of [certifyNoShaftContent].
     *
     * Unlike [certifyNoShaftContent], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("certify_no_shaft_content")
    @ExcludeMissing
    fun _certifyNoShaftContent(): JsonField<Boolean> = certifyNoShaftContent

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [displayName].
     *
     * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("display_name")
    @ExcludeMissing
    fun _displayName(): JsonField<String> = displayName

    /**
     * Returns the raw JSON value of [documents].
     *
     * Unlike [documents], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("documents")
    @ExcludeMissing
    fun _documents(): JsonField<List<Document>> = documents

    /**
     * Returns the raw JSON value of [enterpriseId].
     *
     * Unlike [enterpriseId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enterprise_id")
    @ExcludeMissing
    fun _enterpriseId(): JsonField<String> = enterpriseId

    /**
     * Returns the raw JSON value of [expiringAt].
     *
     * Unlike [expiringAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expiring_at")
    @ExcludeMissing
    fun _expiringAt(): JsonField<OffsetDateTime> = expiringAt

    /**
     * Returns the raw JSON value of [logoUrl].
     *
     * Unlike [logoUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("logo_url") @ExcludeMissing fun _logoUrl(): JsonField<String> = logoUrl

    /**
     * Returns the raw JSON value of [rejectedAt].
     *
     * Unlike [rejectedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rejected_at")
    @ExcludeMissing
    fun _rejectedAt(): JsonField<OffsetDateTime> = rejectedAt

    /**
     * Returns the raw JSON value of [rejectionReasons].
     *
     * Unlike [rejectionReasons], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("rejection_reasons")
    @ExcludeMissing
    fun _rejectionReasons(): JsonField<List<RejectionReason>> = rejectionReasons

    /**
     * Returns the raw JSON value of [reselling].
     *
     * Unlike [reselling], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reselling") @ExcludeMissing fun _reselling(): JsonField<Boolean> = reselling

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<DirStatus> = status

    /**
     * Returns the raw JSON value of [submittedAt].
     *
     * Unlike [submittedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("submitted_at")
    @ExcludeMissing
    fun _submittedAt(): JsonField<OffsetDateTime> = submittedAt

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [verifiedAt].
     *
     * Unlike [verifiedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("verified_at")
    @ExcludeMissing
    fun _verifiedAt(): JsonField<OffsetDateTime> = verifiedAt

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

        /** Returns a mutable builder for constructing an instance of [Dir]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Dir]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var authorizerEmail: JsonField<String> = JsonMissing.of()
        private var authorizerName: JsonField<String> = JsonMissing.of()
        private var callReasons: JsonField<MutableList<CallReason>>? = null
        private var certifyBrandIsAccurate: JsonField<Boolean> = JsonMissing.of()
        private var certifyIpOwnership: JsonField<Boolean> = JsonMissing.of()
        private var certifyNoShaftContent: JsonField<Boolean> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var displayName: JsonField<String> = JsonMissing.of()
        private var documents: JsonField<MutableList<Document>>? = null
        private var enterpriseId: JsonField<String> = JsonMissing.of()
        private var expiringAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var logoUrl: JsonField<String> = JsonMissing.of()
        private var rejectedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var rejectionReasons: JsonField<MutableList<RejectionReason>>? = null
        private var reselling: JsonField<Boolean> = JsonMissing.of()
        private var status: JsonField<DirStatus> = JsonMissing.of()
        private var submittedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var verifiedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(dir: Dir) = apply {
            id = dir.id
            authorizerEmail = dir.authorizerEmail
            authorizerName = dir.authorizerName
            callReasons = dir.callReasons.map { it.toMutableList() }
            certifyBrandIsAccurate = dir.certifyBrandIsAccurate
            certifyIpOwnership = dir.certifyIpOwnership
            certifyNoShaftContent = dir.certifyNoShaftContent
            createdAt = dir.createdAt
            displayName = dir.displayName
            documents = dir.documents.map { it.toMutableList() }
            enterpriseId = dir.enterpriseId
            expiringAt = dir.expiringAt
            logoUrl = dir.logoUrl
            rejectedAt = dir.rejectedAt
            rejectionReasons = dir.rejectionReasons.map { it.toMutableList() }
            reselling = dir.reselling
            status = dir.status
            submittedAt = dir.submittedAt
            updatedAt = dir.updatedAt
            verifiedAt = dir.verifiedAt
            additionalProperties = dir.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun authorizerEmail(authorizerEmail: String?) =
            authorizerEmail(JsonField.ofNullable(authorizerEmail))

        /** Alias for calling [Builder.authorizerEmail] with `authorizerEmail.orElse(null)`. */
        fun authorizerEmail(authorizerEmail: Optional<String>) =
            authorizerEmail(authorizerEmail.getOrNull())

        /**
         * Sets [Builder.authorizerEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authorizerEmail] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun authorizerEmail(authorizerEmail: JsonField<String>) = apply {
            this.authorizerEmail = authorizerEmail
        }

        fun authorizerName(authorizerName: String?) =
            authorizerName(JsonField.ofNullable(authorizerName))

        /** Alias for calling [Builder.authorizerName] with `authorizerName.orElse(null)`. */
        fun authorizerName(authorizerName: Optional<String>) =
            authorizerName(authorizerName.getOrNull())

        /**
         * Sets [Builder.authorizerName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authorizerName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun authorizerName(authorizerName: JsonField<String>) = apply {
            this.authorizerName = authorizerName
        }

        fun callReasons(callReasons: List<CallReason>) = callReasons(JsonField.of(callReasons))

        /**
         * Sets [Builder.callReasons] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callReasons] with a well-typed `List<CallReason>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun callReasons(callReasons: JsonField<List<CallReason>>) = apply {
            this.callReasons = callReasons.map { it.toMutableList() }
        }

        /**
         * Adds a single [CallReason] to [callReasons].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCallReason(callReason: CallReason) = apply {
            callReasons =
                (callReasons ?: JsonField.of(mutableListOf())).also {
                    checkKnown("callReasons", it).add(callReason)
                }
        }

        fun certifyBrandIsAccurate(certifyBrandIsAccurate: Boolean) =
            certifyBrandIsAccurate(JsonField.of(certifyBrandIsAccurate))

        /**
         * Sets [Builder.certifyBrandIsAccurate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.certifyBrandIsAccurate] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun certifyBrandIsAccurate(certifyBrandIsAccurate: JsonField<Boolean>) = apply {
            this.certifyBrandIsAccurate = certifyBrandIsAccurate
        }

        fun certifyIpOwnership(certifyIpOwnership: Boolean) =
            certifyIpOwnership(JsonField.of(certifyIpOwnership))

        /**
         * Sets [Builder.certifyIpOwnership] to an arbitrary JSON value.
         *
         * You should usually call [Builder.certifyIpOwnership] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun certifyIpOwnership(certifyIpOwnership: JsonField<Boolean>) = apply {
            this.certifyIpOwnership = certifyIpOwnership
        }

        fun certifyNoShaftContent(certifyNoShaftContent: Boolean) =
            certifyNoShaftContent(JsonField.of(certifyNoShaftContent))

        /**
         * Sets [Builder.certifyNoShaftContent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.certifyNoShaftContent] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun certifyNoShaftContent(certifyNoShaftContent: JsonField<Boolean>) = apply {
            this.certifyNoShaftContent = certifyNoShaftContent
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun displayName(displayName: String) = displayName(JsonField.of(displayName))

        /**
         * Sets [Builder.displayName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun displayName(displayName: JsonField<String>) = apply { this.displayName = displayName }

        fun documents(documents: List<Document>?) = documents(JsonField.ofNullable(documents))

        /** Alias for calling [Builder.documents] with `documents.orElse(null)`. */
        fun documents(documents: Optional<List<Document>>) = documents(documents.getOrNull())

        /**
         * Sets [Builder.documents] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documents] with a well-typed `List<Document>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun documents(documents: JsonField<List<Document>>) = apply {
            this.documents = documents.map { it.toMutableList() }
        }

        /**
         * Adds a single [Document] to [documents].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDocument(document: Document) = apply {
            documents =
                (documents ?: JsonField.of(mutableListOf())).also {
                    checkKnown("documents", it).add(document)
                }
        }

        fun enterpriseId(enterpriseId: String) = enterpriseId(JsonField.of(enterpriseId))

        /**
         * Sets [Builder.enterpriseId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enterpriseId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun enterpriseId(enterpriseId: JsonField<String>) = apply {
            this.enterpriseId = enterpriseId
        }

        fun expiringAt(expiringAt: OffsetDateTime?) = expiringAt(JsonField.ofNullable(expiringAt))

        /** Alias for calling [Builder.expiringAt] with `expiringAt.orElse(null)`. */
        fun expiringAt(expiringAt: Optional<OffsetDateTime>) = expiringAt(expiringAt.getOrNull())

        /**
         * Sets [Builder.expiringAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiringAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiringAt(expiringAt: JsonField<OffsetDateTime>) = apply {
            this.expiringAt = expiringAt
        }

        fun logoUrl(logoUrl: String?) = logoUrl(JsonField.ofNullable(logoUrl))

        /** Alias for calling [Builder.logoUrl] with `logoUrl.orElse(null)`. */
        fun logoUrl(logoUrl: Optional<String>) = logoUrl(logoUrl.getOrNull())

        /**
         * Sets [Builder.logoUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logoUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun logoUrl(logoUrl: JsonField<String>) = apply { this.logoUrl = logoUrl }

        fun rejectedAt(rejectedAt: OffsetDateTime?) = rejectedAt(JsonField.ofNullable(rejectedAt))

        /** Alias for calling [Builder.rejectedAt] with `rejectedAt.orElse(null)`. */
        fun rejectedAt(rejectedAt: Optional<OffsetDateTime>) = rejectedAt(rejectedAt.getOrNull())

        /**
         * Sets [Builder.rejectedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rejectedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rejectedAt(rejectedAt: JsonField<OffsetDateTime>) = apply {
            this.rejectedAt = rejectedAt
        }

        /** Populated when `status` is `rejected`; cleared on `/submit` or successful approval. */
        fun rejectionReasons(rejectionReasons: List<RejectionReason>?) =
            rejectionReasons(JsonField.ofNullable(rejectionReasons))

        /** Alias for calling [Builder.rejectionReasons] with `rejectionReasons.orElse(null)`. */
        fun rejectionReasons(rejectionReasons: Optional<List<RejectionReason>>) =
            rejectionReasons(rejectionReasons.getOrNull())

        /**
         * Sets [Builder.rejectionReasons] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rejectionReasons] with a well-typed
         * `List<RejectionReason>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun rejectionReasons(rejectionReasons: JsonField<List<RejectionReason>>) = apply {
            this.rejectionReasons = rejectionReasons.map { it.toMutableList() }
        }

        /**
         * Adds a single [RejectionReason] to [rejectionReasons].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRejectionReason(rejectionReason: RejectionReason) = apply {
            rejectionReasons =
                (rejectionReasons ?: JsonField.of(mutableListOf())).also {
                    checkKnown("rejectionReasons", it).add(rejectionReason)
                }
        }

        fun reselling(reselling: Boolean) = reselling(JsonField.of(reselling))

        /**
         * Sets [Builder.reselling] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reselling] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun reselling(reselling: JsonField<Boolean>) = apply { this.reselling = reselling }

        /**
         * DIR lifecycle status.
         * - `draft` - newly created; editable; not yet submitted.
         * - `submitted` / `in_review` - Telnyx is reviewing.
         * - `verified` - approved; phone numbers may be attached.
         * - `rejected` - Telnyx rejected this submission; `rejection_reasons` is populated;
         *   customer can edit and resubmit.
         * - `unsuccessful` - system-side error during processing; customer can edit and resubmit.
         * - `suspended` - temporarily disabled (e.g. by an active infringement claim).
         * - `expired` - verification expired; customer must resubmit.
         * - `infringement_claimed` - a trademark/impersonation claim is open against this DIR.
         * - `permanently_rejected` - terminal; cannot be resubmitted.
         */
        fun status(status: DirStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [DirStatus] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun status(status: JsonField<DirStatus>) = apply { this.status = status }

        fun submittedAt(submittedAt: OffsetDateTime?) =
            submittedAt(JsonField.ofNullable(submittedAt))

        /** Alias for calling [Builder.submittedAt] with `submittedAt.orElse(null)`. */
        fun submittedAt(submittedAt: Optional<OffsetDateTime>) =
            submittedAt(submittedAt.getOrNull())

        /**
         * Sets [Builder.submittedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.submittedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun submittedAt(submittedAt: JsonField<OffsetDateTime>) = apply {
            this.submittedAt = submittedAt
        }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun verifiedAt(verifiedAt: OffsetDateTime?) = verifiedAt(JsonField.ofNullable(verifiedAt))

        /** Alias for calling [Builder.verifiedAt] with `verifiedAt.orElse(null)`. */
        fun verifiedAt(verifiedAt: Optional<OffsetDateTime>) = verifiedAt(verifiedAt.getOrNull())

        /**
         * Sets [Builder.verifiedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.verifiedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun verifiedAt(verifiedAt: JsonField<OffsetDateTime>) = apply {
            this.verifiedAt = verifiedAt
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
         * Returns an immutable instance of [Dir].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Dir =
            Dir(
                id,
                authorizerEmail,
                authorizerName,
                (callReasons ?: JsonMissing.of()).map { it.toImmutable() },
                certifyBrandIsAccurate,
                certifyIpOwnership,
                certifyNoShaftContent,
                createdAt,
                displayName,
                (documents ?: JsonMissing.of()).map { it.toImmutable() },
                enterpriseId,
                expiringAt,
                logoUrl,
                rejectedAt,
                (rejectionReasons ?: JsonMissing.of()).map { it.toImmutable() },
                reselling,
                status,
                submittedAt,
                updatedAt,
                verifiedAt,
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
    fun validate(): Dir = apply {
        if (validated) {
            return@apply
        }

        id()
        authorizerEmail()
        authorizerName()
        callReasons().ifPresent { it.forEach { it.validate() } }
        certifyBrandIsAccurate()
        certifyIpOwnership()
        certifyNoShaftContent()
        createdAt()
        displayName()
        documents().ifPresent { it.forEach { it.validate() } }
        enterpriseId()
        expiringAt()
        logoUrl()
        rejectedAt()
        rejectionReasons().ifPresent { it.forEach { it.validate() } }
        reselling()
        status().ifPresent { it.validate() }
        submittedAt()
        updatedAt()
        verifiedAt()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (authorizerEmail.asKnown().isPresent) 1 else 0) +
            (if (authorizerName.asKnown().isPresent) 1 else 0) +
            (callReasons.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (certifyBrandIsAccurate.asKnown().isPresent) 1 else 0) +
            (if (certifyIpOwnership.asKnown().isPresent) 1 else 0) +
            (if (certifyNoShaftContent.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (displayName.asKnown().isPresent) 1 else 0) +
            (documents.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (enterpriseId.asKnown().isPresent) 1 else 0) +
            (if (expiringAt.asKnown().isPresent) 1 else 0) +
            (if (logoUrl.asKnown().isPresent) 1 else 0) +
            (if (rejectedAt.asKnown().isPresent) 1 else 0) +
            (rejectionReasons.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (reselling.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (submittedAt.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (verifiedAt.asKnown().isPresent) 1 else 0)

    class CallReason
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val createdAt: JsonField<OffsetDateTime>,
        private val reason: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
        ) : this(createdAt, reason, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun reason(): Optional<String> = reason.getOptional("reason")

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [reason].
         *
         * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

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

            /** Returns a mutable builder for constructing an instance of [CallReason]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CallReason]. */
        class Builder internal constructor() {

            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var reason: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(callReason: CallReason) = apply {
                createdAt = callReason.createdAt
                reason = callReason.reason
                additionalProperties = callReason.additionalProperties.toMutableMap()
            }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun reason(reason: String) = reason(JsonField.of(reason))

            /**
             * Sets [Builder.reason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reason] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reason(reason: JsonField<String>) = apply { this.reason = reason }

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
             * Returns an immutable instance of [CallReason].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CallReason =
                CallReason(createdAt, reason, additionalProperties.toMutableMap())
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
        fun validate(): CallReason = apply {
            if (validated) {
                return@apply
            }

            createdAt()
            reason()
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
            (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (reason.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CallReason &&
                createdAt == other.createdAt &&
                reason == other.reason &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(createdAt, reason, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CallReason{createdAt=$createdAt, reason=$reason, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Dir &&
            id == other.id &&
            authorizerEmail == other.authorizerEmail &&
            authorizerName == other.authorizerName &&
            callReasons == other.callReasons &&
            certifyBrandIsAccurate == other.certifyBrandIsAccurate &&
            certifyIpOwnership == other.certifyIpOwnership &&
            certifyNoShaftContent == other.certifyNoShaftContent &&
            createdAt == other.createdAt &&
            displayName == other.displayName &&
            documents == other.documents &&
            enterpriseId == other.enterpriseId &&
            expiringAt == other.expiringAt &&
            logoUrl == other.logoUrl &&
            rejectedAt == other.rejectedAt &&
            rejectionReasons == other.rejectionReasons &&
            reselling == other.reselling &&
            status == other.status &&
            submittedAt == other.submittedAt &&
            updatedAt == other.updatedAt &&
            verifiedAt == other.verifiedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            authorizerEmail,
            authorizerName,
            callReasons,
            certifyBrandIsAccurate,
            certifyIpOwnership,
            certifyNoShaftContent,
            createdAt,
            displayName,
            documents,
            enterpriseId,
            expiringAt,
            logoUrl,
            rejectedAt,
            rejectionReasons,
            reselling,
            status,
            submittedAt,
            updatedAt,
            verifiedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Dir{id=$id, authorizerEmail=$authorizerEmail, authorizerName=$authorizerName, callReasons=$callReasons, certifyBrandIsAccurate=$certifyBrandIsAccurate, certifyIpOwnership=$certifyIpOwnership, certifyNoShaftContent=$certifyNoShaftContent, createdAt=$createdAt, displayName=$displayName, documents=$documents, enterpriseId=$enterpriseId, expiringAt=$expiringAt, logoUrl=$logoUrl, rejectedAt=$rejectedAt, rejectionReasons=$rejectionReasons, reselling=$reselling, status=$status, submittedAt=$submittedAt, updatedAt=$updatedAt, verifiedAt=$verifiedAt, additionalProperties=$additionalProperties}"
}
