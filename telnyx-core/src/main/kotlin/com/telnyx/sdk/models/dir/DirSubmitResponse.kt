// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class DirSubmitResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<Data>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): Data = data.getRequired("data")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

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
         * Returns a mutable builder for constructing an instance of [DirSubmitResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DirSubmitResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(dirSubmitResponse: DirSubmitResponse) = apply {
            data = dirSubmitResponse.data
            additionalProperties = dirSubmitResponse.additionalProperties.toMutableMap()
        }

        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

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
         * Returns an immutable instance of [DirSubmitResponse].
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
        fun build(): DirSubmitResponse =
            DirSubmitResponse(checkRequired("data", data), additionalProperties.toMutableMap())
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
    fun validate(): DirSubmitResponse = apply {
        if (validated) {
            return@apply
        }

        data().validate()
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
    @JvmSynthetic internal fun validity(): Int = (data.asKnown().getOrNull()?.validity() ?: 0)

    class Data
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
        private val status: JsonField<Status>,
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
            @JsonProperty("reselling")
            @ExcludeMissing
            reselling: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
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
         * - `draft` — newly created; editable; not yet submitted.
         * - `submitted` / `in_review` — Telnyx is reviewing.
         * - `verified` — approved; phone numbers may be attached.
         * - `rejected` — Telnyx rejected this submission; `rejection_reasons` is populated;
         *   customer can edit and resubmit.
         * - `unsuccessful` — system-side error during processing; customer can edit and resubmit.
         * - `suspended` — temporarily disabled (e.g. by an active infringement claim).
         * - `expired` — verification expired; customer must resubmit.
         * - `infringement_claimed` — a trademark/impersonation claim is open against this DIR.
         * - `permanently_rejected` — terminal; cannot be resubmitted.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun status(): Optional<Status> = status.getOptional("status")

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
         * Unlike [authorizerEmail], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("authorizer_email")
        @ExcludeMissing
        fun _authorizerEmail(): JsonField<String> = authorizerEmail

        /**
         * Returns the raw JSON value of [authorizerName].
         *
         * Unlike [authorizerName], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Unlike [certifyIpOwnership], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("certify_ip_ownership")
        @ExcludeMissing
        fun _certifyIpOwnership(): JsonField<Boolean> = certifyIpOwnership

        /**
         * Returns the raw JSON value of [certifyNoShaftContent].
         *
         * Unlike [certifyNoShaftContent], this method doesn't throw if the JSON field has an
         * unexpected type.
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
         * Unlike [enterpriseId], this method doesn't throw if the JSON field has an unexpected
         * type.
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
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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

            /** Returns a mutable builder for constructing an instance of [Data]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
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
            private var status: JsonField<Status> = JsonMissing.of()
            private var submittedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var verifiedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                authorizerEmail = data.authorizerEmail
                authorizerName = data.authorizerName
                callReasons = data.callReasons.map { it.toMutableList() }
                certifyBrandIsAccurate = data.certifyBrandIsAccurate
                certifyIpOwnership = data.certifyIpOwnership
                certifyNoShaftContent = data.certifyNoShaftContent
                createdAt = data.createdAt
                displayName = data.displayName
                documents = data.documents.map { it.toMutableList() }
                enterpriseId = data.enterpriseId
                expiringAt = data.expiringAt
                logoUrl = data.logoUrl
                rejectedAt = data.rejectedAt
                rejectionReasons = data.rejectionReasons.map { it.toMutableList() }
                reselling = data.reselling
                status = data.status
                submittedAt = data.submittedAt
                updatedAt = data.updatedAt
                verifiedAt = data.verifiedAt
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
             * You should usually call [Builder.callReasons] with a well-typed `List<CallReason>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun certifyBrandIsAccurate(certifyBrandIsAccurate: JsonField<Boolean>) = apply {
                this.certifyBrandIsAccurate = certifyBrandIsAccurate
            }

            fun certifyIpOwnership(certifyIpOwnership: Boolean) =
                certifyIpOwnership(JsonField.of(certifyIpOwnership))

            /**
             * Sets [Builder.certifyIpOwnership] to an arbitrary JSON value.
             *
             * You should usually call [Builder.certifyIpOwnership] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun certifyIpOwnership(certifyIpOwnership: JsonField<Boolean>) = apply {
                this.certifyIpOwnership = certifyIpOwnership
            }

            fun certifyNoShaftContent(certifyNoShaftContent: Boolean) =
                certifyNoShaftContent(JsonField.of(certifyNoShaftContent))

            /**
             * Sets [Builder.certifyNoShaftContent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.certifyNoShaftContent] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun displayName(displayName: String) = displayName(JsonField.of(displayName))

            /**
             * Sets [Builder.displayName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.displayName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun displayName(displayName: JsonField<String>) = apply {
                this.displayName = displayName
            }

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
             * You should usually call [Builder.enterpriseId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun enterpriseId(enterpriseId: JsonField<String>) = apply {
                this.enterpriseId = enterpriseId
            }

            fun expiringAt(expiringAt: OffsetDateTime?) =
                expiringAt(JsonField.ofNullable(expiringAt))

            /** Alias for calling [Builder.expiringAt] with `expiringAt.orElse(null)`. */
            fun expiringAt(expiringAt: Optional<OffsetDateTime>) =
                expiringAt(expiringAt.getOrNull())

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
             * You should usually call [Builder.logoUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun logoUrl(logoUrl: JsonField<String>) = apply { this.logoUrl = logoUrl }

            fun rejectedAt(rejectedAt: OffsetDateTime?) =
                rejectedAt(JsonField.ofNullable(rejectedAt))

            /** Alias for calling [Builder.rejectedAt] with `rejectedAt.orElse(null)`. */
            fun rejectedAt(rejectedAt: Optional<OffsetDateTime>) =
                rejectedAt(rejectedAt.getOrNull())

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

            /**
             * Populated when `status` is `rejected`; cleared on `/submit` or successful approval.
             */
            fun rejectionReasons(rejectionReasons: List<RejectionReason>?) =
                rejectionReasons(JsonField.ofNullable(rejectionReasons))

            /**
             * Alias for calling [Builder.rejectionReasons] with `rejectionReasons.orElse(null)`.
             */
            fun rejectionReasons(rejectionReasons: Optional<List<RejectionReason>>) =
                rejectionReasons(rejectionReasons.getOrNull())

            /**
             * Sets [Builder.rejectionReasons] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rejectionReasons] with a well-typed
             * `List<RejectionReason>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
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
             * You should usually call [Builder.reselling] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reselling(reselling: JsonField<Boolean>) = apply { this.reselling = reselling }

            /**
             * DIR lifecycle status.
             * - `draft` — newly created; editable; not yet submitted.
             * - `submitted` / `in_review` — Telnyx is reviewing.
             * - `verified` — approved; phone numbers may be attached.
             * - `rejected` — Telnyx rejected this submission; `rejection_reasons` is populated;
             *   customer can edit and resubmit.
             * - `unsuccessful` — system-side error during processing; customer can edit and
             *   resubmit.
             * - `suspended` — temporarily disabled (e.g. by an active infringement claim).
             * - `expired` — verification expired; customer must resubmit.
             * - `infringement_claimed` — a trademark/impersonation claim is open against this DIR.
             * - `permanently_rejected` — terminal; cannot be resubmitted.
             */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            fun submittedAt(submittedAt: OffsetDateTime?) =
                submittedAt(JsonField.ofNullable(submittedAt))

            /** Alias for calling [Builder.submittedAt] with `submittedAt.orElse(null)`. */
            fun submittedAt(submittedAt: Optional<OffsetDateTime>) =
                submittedAt(submittedAt.getOrNull())

            /**
             * Sets [Builder.submittedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.submittedAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            fun verifiedAt(verifiedAt: OffsetDateTime?) =
                verifiedAt(JsonField.ofNullable(verifiedAt))

            /** Alias for calling [Builder.verifiedAt] with `verifiedAt.orElse(null)`. */
            fun verifiedAt(verifiedAt: Optional<OffsetDateTime>) =
                verifiedAt(verifiedAt.getOrNull())

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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Data =
                Data(
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
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
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun reason(): Optional<String> = reason.getOptional("reason")

            /**
             * Returns the raw JSON value of [createdAt].
             *
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
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
                 * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                fun reason(reason: String) = reason(JsonField.of(reason))

                /**
                 * Sets [Builder.reason] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reason] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reason(reason: JsonField<String>) = apply { this.reason = reason }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

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
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
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

            private val hashCode: Int by lazy {
                Objects.hash(createdAt, reason, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CallReason{createdAt=$createdAt, reason=$reason, additionalProperties=$additionalProperties}"
        }

        class Document
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val documentId: JsonField<String>,
            private val documentType: JsonField<DocumentType>,
            private val description: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("document_id")
                @ExcludeMissing
                documentId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("document_type")
                @ExcludeMissing
                documentType: JsonField<DocumentType> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
            ) : this(documentId, documentType, description, mutableMapOf())

            /**
             * Id returned by the Telnyx Documents API after you upload the file (upload via `POST
             * /v2/documents`; see https://developers.telnyx.com/api/documents).
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun documentId(): String = documentId.getRequired("document_id")

            /**
             * Type of supporting document. Pick the closest match to what the file actually
             * contains; `other` triggers manual vetting and may slow approval. The matching
             * short_name reference list is at `GET /v2/dir/document_types`.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun documentType(): DocumentType = documentType.getRequired("document_type")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun description(): Optional<String> = description.getOptional("description")

            /**
             * Returns the raw JSON value of [documentId].
             *
             * Unlike [documentId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("document_id")
            @ExcludeMissing
            fun _documentId(): JsonField<String> = documentId

            /**
             * Returns the raw JSON value of [documentType].
             *
             * Unlike [documentType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("document_type")
            @ExcludeMissing
            fun _documentType(): JsonField<DocumentType> = documentType

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

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
                 * Returns a mutable builder for constructing an instance of [Document].
                 *
                 * The following fields are required:
                 * ```java
                 * .documentId()
                 * .documentType()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Document]. */
            class Builder internal constructor() {

                private var documentId: JsonField<String>? = null
                private var documentType: JsonField<DocumentType>? = null
                private var description: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(document: Document) = apply {
                    documentId = document.documentId
                    documentType = document.documentType
                    description = document.description
                    additionalProperties = document.additionalProperties.toMutableMap()
                }

                /**
                 * Id returned by the Telnyx Documents API after you upload the file (upload via
                 * `POST /v2/documents`; see https://developers.telnyx.com/api/documents).
                 */
                fun documentId(documentId: String) = documentId(JsonField.of(documentId))

                /**
                 * Sets [Builder.documentId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.documentId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun documentId(documentId: JsonField<String>) = apply {
                    this.documentId = documentId
                }

                /**
                 * Type of supporting document. Pick the closest match to what the file actually
                 * contains; `other` triggers manual vetting and may slow approval. The matching
                 * short_name reference list is at `GET /v2/dir/document_types`.
                 */
                fun documentType(documentType: DocumentType) =
                    documentType(JsonField.of(documentType))

                /**
                 * Sets [Builder.documentType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.documentType] with a well-typed [DocumentType]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun documentType(documentType: JsonField<DocumentType>) = apply {
                    this.documentType = documentType
                }

                fun description(description: String) = description(JsonField.of(description))

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Document].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .documentId()
                 * .documentType()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Document =
                    Document(
                        checkRequired("documentId", documentId),
                        checkRequired("documentType", documentType),
                        description,
                        additionalProperties.toMutableMap(),
                    )
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
            fun validate(): Document = apply {
                if (validated) {
                    return@apply
                }

                documentId()
                documentType().validate()
                description()
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
                (if (documentId.asKnown().isPresent) 1 else 0) +
                    (documentType.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (description.asKnown().isPresent) 1 else 0)

            /**
             * Type of supporting document. Pick the closest match to what the file actually
             * contains; `other` triggers manual vetting and may slow approval. The matching
             * short_name reference list is at `GET /v2/dir/document_types`.
             */
            class DocumentType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val LETTER_OF_AUTHORIZATION = of("letter_of_authorization")

                    @JvmField val BUSINESS_REGISTRATION = of("business_registration")

                    @JvmField val ARTICLES_OF_INCORPORATION = of("articles_of_incorporation")

                    @JvmField val TAX_DOCUMENT = of("tax_document")

                    @JvmField val EIN_LETTER = of("ein_letter")

                    @JvmField val TRADEMARK_REGISTRATION = of("trademark_registration")

                    @JvmField val WEBSITE_OWNERSHIP = of("website_ownership")

                    @JvmField val BUSINESS_LICENSE = of("business_license")

                    @JvmField val PROFESSIONAL_LICENSE = of("professional_license")

                    @JvmField val GOVERNMENT_ID = of("government_id")

                    @JvmField val UTILITY_BILL = of("utility_bill")

                    @JvmField val BANK_STATEMENT = of("bank_statement")

                    @JvmField val OTHER = of("other")

                    @JvmStatic fun of(value: String) = DocumentType(JsonField.of(value))
                }

                /** An enum containing [DocumentType]'s known values. */
                enum class Known {
                    LETTER_OF_AUTHORIZATION,
                    BUSINESS_REGISTRATION,
                    ARTICLES_OF_INCORPORATION,
                    TAX_DOCUMENT,
                    EIN_LETTER,
                    TRADEMARK_REGISTRATION,
                    WEBSITE_OWNERSHIP,
                    BUSINESS_LICENSE,
                    PROFESSIONAL_LICENSE,
                    GOVERNMENT_ID,
                    UTILITY_BILL,
                    BANK_STATEMENT,
                    OTHER,
                }

                /**
                 * An enum containing [DocumentType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [DocumentType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    LETTER_OF_AUTHORIZATION,
                    BUSINESS_REGISTRATION,
                    ARTICLES_OF_INCORPORATION,
                    TAX_DOCUMENT,
                    EIN_LETTER,
                    TRADEMARK_REGISTRATION,
                    WEBSITE_OWNERSHIP,
                    BUSINESS_LICENSE,
                    PROFESSIONAL_LICENSE,
                    GOVERNMENT_ID,
                    UTILITY_BILL,
                    BANK_STATEMENT,
                    OTHER,
                    /**
                     * An enum member indicating that [DocumentType] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        LETTER_OF_AUTHORIZATION -> Value.LETTER_OF_AUTHORIZATION
                        BUSINESS_REGISTRATION -> Value.BUSINESS_REGISTRATION
                        ARTICLES_OF_INCORPORATION -> Value.ARTICLES_OF_INCORPORATION
                        TAX_DOCUMENT -> Value.TAX_DOCUMENT
                        EIN_LETTER -> Value.EIN_LETTER
                        TRADEMARK_REGISTRATION -> Value.TRADEMARK_REGISTRATION
                        WEBSITE_OWNERSHIP -> Value.WEBSITE_OWNERSHIP
                        BUSINESS_LICENSE -> Value.BUSINESS_LICENSE
                        PROFESSIONAL_LICENSE -> Value.PROFESSIONAL_LICENSE
                        GOVERNMENT_ID -> Value.GOVERNMENT_ID
                        UTILITY_BILL -> Value.UTILITY_BILL
                        BANK_STATEMENT -> Value.BANK_STATEMENT
                        OTHER -> Value.OTHER
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        LETTER_OF_AUTHORIZATION -> Known.LETTER_OF_AUTHORIZATION
                        BUSINESS_REGISTRATION -> Known.BUSINESS_REGISTRATION
                        ARTICLES_OF_INCORPORATION -> Known.ARTICLES_OF_INCORPORATION
                        TAX_DOCUMENT -> Known.TAX_DOCUMENT
                        EIN_LETTER -> Known.EIN_LETTER
                        TRADEMARK_REGISTRATION -> Known.TRADEMARK_REGISTRATION
                        WEBSITE_OWNERSHIP -> Known.WEBSITE_OWNERSHIP
                        BUSINESS_LICENSE -> Known.BUSINESS_LICENSE
                        PROFESSIONAL_LICENSE -> Known.PROFESSIONAL_LICENSE
                        GOVERNMENT_ID -> Known.GOVERNMENT_ID
                        UTILITY_BILL -> Known.UTILITY_BILL
                        BANK_STATEMENT -> Known.BANK_STATEMENT
                        OTHER -> Known.OTHER
                        else -> throw TelnyxInvalidDataException("Unknown DocumentType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): DocumentType = apply {
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

                    return other is DocumentType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Document &&
                    documentId == other.documentId &&
                    documentType == other.documentType &&
                    description == other.description &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(documentId, documentType, description, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Document{documentId=$documentId, documentType=$documentType, description=$description, additionalProperties=$additionalProperties}"
        }

        class RejectionReason
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val code: JsonField<String>,
            private val detail: JsonField<String>,
            private val message: JsonField<String>,
            private val title: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
                @JsonProperty("detail")
                @ExcludeMissing
                detail: JsonField<String> = JsonMissing.of(),
                @JsonProperty("message")
                @ExcludeMissing
                message: JsonField<String> = JsonMissing.of(),
                @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
            ) : this(code, detail, message, title, mutableMapOf())

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun code(): Optional<String> = code.getOptional("code")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun detail(): Optional<String> = detail.getOptional("detail")

            /**
             * Customer-visible free-text comment from the Telnyx vetting team. Only the first entry
             * of `rejection_reasons` carries this; the rest are `null`.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun message(): Optional<String> = message.getOptional("message")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun title(): Optional<String> = title.getOptional("title")

            /**
             * Returns the raw JSON value of [code].
             *
             * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

            /**
             * Returns the raw JSON value of [detail].
             *
             * Unlike [detail], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("detail") @ExcludeMissing fun _detail(): JsonField<String> = detail

            /**
             * Returns the raw JSON value of [message].
             *
             * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

            /**
             * Returns the raw JSON value of [title].
             *
             * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

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

                /** Returns a mutable builder for constructing an instance of [RejectionReason]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [RejectionReason]. */
            class Builder internal constructor() {

                private var code: JsonField<String> = JsonMissing.of()
                private var detail: JsonField<String> = JsonMissing.of()
                private var message: JsonField<String> = JsonMissing.of()
                private var title: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(rejectionReason: RejectionReason) = apply {
                    code = rejectionReason.code
                    detail = rejectionReason.detail
                    message = rejectionReason.message
                    title = rejectionReason.title
                    additionalProperties = rejectionReason.additionalProperties.toMutableMap()
                }

                fun code(code: String) = code(JsonField.of(code))

                /**
                 * Sets [Builder.code] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.code] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun code(code: JsonField<String>) = apply { this.code = code }

                fun detail(detail: String) = detail(JsonField.of(detail))

                /**
                 * Sets [Builder.detail] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.detail] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun detail(detail: JsonField<String>) = apply { this.detail = detail }

                /**
                 * Customer-visible free-text comment from the Telnyx vetting team. Only the first
                 * entry of `rejection_reasons` carries this; the rest are `null`.
                 */
                fun message(message: String?) = message(JsonField.ofNullable(message))

                /** Alias for calling [Builder.message] with `message.orElse(null)`. */
                fun message(message: Optional<String>) = message(message.getOrNull())

                /**
                 * Sets [Builder.message] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.message] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun message(message: JsonField<String>) = apply { this.message = message }

                fun title(title: String) = title(JsonField.of(title))

                /**
                 * Sets [Builder.title] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.title] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun title(title: JsonField<String>) = apply { this.title = title }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [RejectionReason].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): RejectionReason =
                    RejectionReason(
                        code,
                        detail,
                        message,
                        title,
                        additionalProperties.toMutableMap(),
                    )
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
            fun validate(): RejectionReason = apply {
                if (validated) {
                    return@apply
                }

                code()
                detail()
                message()
                title()
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
                (if (code.asKnown().isPresent) 1 else 0) +
                    (if (detail.asKnown().isPresent) 1 else 0) +
                    (if (message.asKnown().isPresent) 1 else 0) +
                    (if (title.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is RejectionReason &&
                    code == other.code &&
                    detail == other.detail &&
                    message == other.message &&
                    title == other.title &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(code, detail, message, title, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RejectionReason{code=$code, detail=$detail, message=$message, title=$title, additionalProperties=$additionalProperties}"
        }

        /**
         * DIR lifecycle status.
         * - `draft` — newly created; editable; not yet submitted.
         * - `submitted` / `in_review` — Telnyx is reviewing.
         * - `verified` — approved; phone numbers may be attached.
         * - `rejected` — Telnyx rejected this submission; `rejection_reasons` is populated;
         *   customer can edit and resubmit.
         * - `unsuccessful` — system-side error during processing; customer can edit and resubmit.
         * - `suspended` — temporarily disabled (e.g. by an active infringement claim).
         * - `expired` — verification expired; customer must resubmit.
         * - `infringement_claimed` — a trademark/impersonation claim is open against this DIR.
         * - `permanently_rejected` — terminal; cannot be resubmitted.
         */
        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val DRAFT = of("draft")

                @JvmField val SUBMITTED = of("submitted")

                @JvmField val IN_REVIEW = of("in_review")

                @JvmField val VERIFIED = of("verified")

                @JvmField val REJECTED = of("rejected")

                @JvmField val UNSUCCESSFUL = of("unsuccessful")

                @JvmField val SUSPENDED = of("suspended")

                @JvmField val EXPIRED = of("expired")

                @JvmField val INFRINGEMENT_CLAIMED = of("infringement_claimed")

                @JvmField val PERMANENTLY_REJECTED = of("permanently_rejected")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                DRAFT,
                SUBMITTED,
                IN_REVIEW,
                VERIFIED,
                REJECTED,
                UNSUCCESSFUL,
                SUSPENDED,
                EXPIRED,
                INFRINGEMENT_CLAIMED,
                PERMANENTLY_REJECTED,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DRAFT,
                SUBMITTED,
                IN_REVIEW,
                VERIFIED,
                REJECTED,
                UNSUCCESSFUL,
                SUSPENDED,
                EXPIRED,
                INFRINGEMENT_CLAIMED,
                PERMANENTLY_REJECTED,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
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
                    DRAFT -> Value.DRAFT
                    SUBMITTED -> Value.SUBMITTED
                    IN_REVIEW -> Value.IN_REVIEW
                    VERIFIED -> Value.VERIFIED
                    REJECTED -> Value.REJECTED
                    UNSUCCESSFUL -> Value.UNSUCCESSFUL
                    SUSPENDED -> Value.SUSPENDED
                    EXPIRED -> Value.EXPIRED
                    INFRINGEMENT_CLAIMED -> Value.INFRINGEMENT_CLAIMED
                    PERMANENTLY_REJECTED -> Value.PERMANENTLY_REJECTED
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
                    DRAFT -> Known.DRAFT
                    SUBMITTED -> Known.SUBMITTED
                    IN_REVIEW -> Known.IN_REVIEW
                    VERIFIED -> Known.VERIFIED
                    REJECTED -> Known.REJECTED
                    UNSUCCESSFUL -> Known.UNSUCCESSFUL
                    SUSPENDED -> Known.SUSPENDED
                    EXPIRED -> Known.EXPIRED
                    INFRINGEMENT_CLAIMED -> Known.INFRINGEMENT_CLAIMED
                    PERMANENTLY_REJECTED -> Known.PERMANENTLY_REJECTED
                    else -> throw TelnyxInvalidDataException("Unknown Status: $value")
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
            fun validate(): Status = apply {
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

                return other is Status && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
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
            "Data{id=$id, authorizerEmail=$authorizerEmail, authorizerName=$authorizerName, callReasons=$callReasons, certifyBrandIsAccurate=$certifyBrandIsAccurate, certifyIpOwnership=$certifyIpOwnership, certifyNoShaftContent=$certifyNoShaftContent, createdAt=$createdAt, displayName=$displayName, documents=$documents, enterpriseId=$enterpriseId, expiringAt=$expiringAt, logoUrl=$logoUrl, rejectedAt=$rejectedAt, rejectionReasons=$rejectionReasons, reselling=$reselling, status=$status, submittedAt=$submittedAt, updatedAt=$updatedAt, verifiedAt=$verifiedAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DirSubmitResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DirSubmitResponse{data=$data, additionalProperties=$additionalProperties}"
}
