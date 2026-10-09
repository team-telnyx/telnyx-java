// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.enterprises.EnterpriseBrandedCallingParams
import com.telnyx.sdk.models.enterprises.EnterpriseCreateParams
import com.telnyx.sdk.models.enterprises.EnterpriseDeleteParams
import com.telnyx.sdk.models.enterprises.EnterpriseListPageAsync
import com.telnyx.sdk.models.enterprises.EnterpriseListParams
import com.telnyx.sdk.models.enterprises.EnterprisePublicWrapped
import com.telnyx.sdk.models.enterprises.EnterpriseRetrieveParams
import com.telnyx.sdk.models.enterprises.EnterpriseUpdateParams
import com.telnyx.sdk.services.async.enterprises.DirServiceAsync
import com.telnyx.sdk.services.async.enterprises.ReputationServiceAsync
import com.telnyx.sdk.services.async.enterprises.VerifyEmailServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Manage the legal-entity record that owns your DIRs and phone numbers. */
interface EnterpriseServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EnterpriseServiceAsync

    /** Phone-number reputation monitoring (spam-score lookup and tracking). */
    fun reputation(): ReputationServiceAsync

    /**
     * A Display Identity Record (DIR) is the verified calling identity (display name, logo, call
     * reasons) shown to recipients on outbound calls.
     */
    fun dir(): DirServiceAsync

    /**
     * Verify ownership of a DIR's authorizer email. A short code is emailed and confirmed; the
     * email must be verified before references can be submitted.
     */
    fun verifyEmail(): VerifyEmailServiceAsync

    /**
     * Create the legal entity (enterprise) that represents your business on the Telnyx platform.
     *
     * The response carries a server-assigned `id` you use for every subsequent call. An enterprise
     * is created once and reused; the API collects all required fields up front.
     *
     * Common failure modes:
     * - `422` - a required field is missing or malformed (the response `errors[].source.pointer`
     *   names the field).
     * - `409` - an enterprise with the same identifying details already exists under your account.
     */
    fun create(params: EnterpriseCreateParams): CompletableFuture<EnterprisePublicWrapped> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EnterpriseCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EnterprisePublicWrapped>

    /**
     * Retrieve a single enterprise by id. Returns `404` if the id does not exist or does not belong
     * to your account.
     */
    fun retrieve(enterpriseId: String): CompletableFuture<EnterprisePublicWrapped> =
        retrieve(enterpriseId, EnterpriseRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        enterpriseId: String,
        params: EnterpriseRetrieveParams = EnterpriseRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EnterprisePublicWrapped> =
        retrieve(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        enterpriseId: String,
        params: EnterpriseRetrieveParams = EnterpriseRetrieveParams.none(),
    ): CompletableFuture<EnterprisePublicWrapped> =
        retrieve(enterpriseId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EnterpriseRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EnterprisePublicWrapped>

    /** @see retrieve */
    fun retrieve(params: EnterpriseRetrieveParams): CompletableFuture<EnterprisePublicWrapped> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        enterpriseId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EnterprisePublicWrapped> =
        retrieve(enterpriseId, EnterpriseRetrieveParams.none(), requestOptions)

    /**
     * Replace the enterprise's mutable fields. Only mutable fields may be sent. Server-assigned and
     * immutable fields (`id`, `record_type`, `created_at`, `updated_at`, status fields,
     * `organization_type`, `country_code`, `role_type`) cannot be changed: including any of them in
     * the body is rejected with `400 Bad Request` (`Field 'X' is not allowed in this request`).
     *
     * For an approved BPO enterprise (`role_type` `bpo`), changing any identity field (legal name,
     * DBA, website, FEIN, industry, number of employees, physical address, organization contact,
     * D-U-N-S number, legal type, SIC code, corporate registration number, professional license
     * number, or jurisdiction of incorporation) resets `bpo_verification_status` to `pending` for
     * re-approval and sets every DIR authorization for that BPO to `rejected`. After re-approval,
     * link it again with a newly signed LOA (a new `loa_document_id`); resending the old one keeps
     * the authorization `rejected`. Re-sending an unchanged value does not reset anything.
     *
     * If Number Reputation is enabled on the enterprise, `legal_name`, `doing_business_as`,
     * `website`, `fein`, `industry`, `number_of_employees`, `organization_physical_address`,
     * `organization_contact`, and `dun_bradstreet_number` cannot be changed: the request is
     * rejected with `400`.
     */
    fun update(enterpriseId: String): CompletableFuture<EnterprisePublicWrapped> =
        update(enterpriseId, EnterpriseUpdateParams.none())

    /** @see update */
    fun update(
        enterpriseId: String,
        params: EnterpriseUpdateParams = EnterpriseUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EnterprisePublicWrapped> =
        update(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

    /** @see update */
    fun update(
        enterpriseId: String,
        params: EnterpriseUpdateParams = EnterpriseUpdateParams.none(),
    ): CompletableFuture<EnterprisePublicWrapped> =
        update(enterpriseId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: EnterpriseUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EnterprisePublicWrapped>

    /** @see update */
    fun update(params: EnterpriseUpdateParams): CompletableFuture<EnterprisePublicWrapped> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        enterpriseId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EnterprisePublicWrapped> =
        update(enterpriseId, EnterpriseUpdateParams.none(), requestOptions)

    /**
     * Return the enterprises you own, paginated. The default page size is 20; the maximum is 250.
     */
    fun list(): CompletableFuture<EnterpriseListPageAsync> = list(EnterpriseListParams.none())

    /** @see list */
    fun list(
        params: EnterpriseListParams = EnterpriseListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EnterpriseListPageAsync>

    /** @see list */
    fun list(
        params: EnterpriseListParams = EnterpriseListParams.none()
    ): CompletableFuture<EnterpriseListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<EnterpriseListPageAsync> =
        list(EnterpriseListParams.none(), requestOptions)

    /**
     * Soft-delete an enterprise.
     *
     * Failure modes:
     * - `400` - the enterprise still has dependent resources in a non-deletable state. Remove those
     *   first; the response `detail` identifies what is blocking the delete.
     * - `409` - the enterprise has a dependent resource with an unresolved claim. Resolve it before
     *   deleting.
     * - `404` - the enterprise does not exist or does not belong to your account.
     */
    fun delete(enterpriseId: String): CompletableFuture<Void?> =
        delete(enterpriseId, EnterpriseDeleteParams.none())

    /** @see delete */
    fun delete(
        enterpriseId: String,
        params: EnterpriseDeleteParams = EnterpriseDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

    /** @see delete */
    fun delete(
        enterpriseId: String,
        params: EnterpriseDeleteParams = EnterpriseDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(enterpriseId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: EnterpriseDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: EnterpriseDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(enterpriseId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(enterpriseId, EnterpriseDeleteParams.none(), requestOptions)

    /**
     * Branded Calling must be activated on each enterprise. Activation is idempotent:
     * - First call: marks the enterprise as activated and begins onboarding it with the Branded
     *   Calling platform asynchronously. Returns `200` with `branded_calling_enabled: true`.
     * - Re-call after success: no-op, returns the same enterprise body.
     * - Re-call after a prior failure: re-queues onboarding, returns `200`.
     *
     * Prerequisite: the calling user must have agreed to the Branded Calling Terms of Service
     * (`POST /terms_of_service/branded_calling/agree`). Without that, this endpoint returns `403
     * terms_of_service_not_accepted`.
     *
     * Failure modes:
     * - `400` - the account has no available credit. Add funds and retry.
     * - `400` - the enterprise is not in the United States. Branded Calling is currently available
     *   only to US enterprises.
     * - `403` - Branded Calling Terms of Service not accepted.
     * - `404` - enterprise does not exist or does not belong to your account.
     *
     * **Pricing:** Activation itself is free, but the account must have available credit. Branded
     * Calling fees are charged per DIR and per branded call. See
     * https://telnyx.com/pricing/branded-calling for current pricing.
     */
    fun brandedCalling(enterpriseId: String): CompletableFuture<EnterprisePublicWrapped> =
        brandedCalling(enterpriseId, EnterpriseBrandedCallingParams.none())

    /** @see brandedCalling */
    fun brandedCalling(
        enterpriseId: String,
        params: EnterpriseBrandedCallingParams = EnterpriseBrandedCallingParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EnterprisePublicWrapped> =
        brandedCalling(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

    /** @see brandedCalling */
    fun brandedCalling(
        enterpriseId: String,
        params: EnterpriseBrandedCallingParams = EnterpriseBrandedCallingParams.none(),
    ): CompletableFuture<EnterprisePublicWrapped> =
        brandedCalling(enterpriseId, params, RequestOptions.none())

    /** @see brandedCalling */
    fun brandedCalling(
        params: EnterpriseBrandedCallingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EnterprisePublicWrapped>

    /** @see brandedCalling */
    fun brandedCalling(
        params: EnterpriseBrandedCallingParams
    ): CompletableFuture<EnterprisePublicWrapped> = brandedCalling(params, RequestOptions.none())

    /** @see brandedCalling */
    fun brandedCalling(
        enterpriseId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EnterprisePublicWrapped> =
        brandedCalling(enterpriseId, EnterpriseBrandedCallingParams.none(), requestOptions)

    /**
     * A view of [EnterpriseServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EnterpriseServiceAsync.WithRawResponse

        /** Phone-number reputation monitoring (spam-score lookup and tracking). */
        fun reputation(): ReputationServiceAsync.WithRawResponse

        /**
         * A Display Identity Record (DIR) is the verified calling identity (display name, logo,
         * call reasons) shown to recipients on outbound calls.
         */
        fun dir(): DirServiceAsync.WithRawResponse

        /**
         * Verify ownership of a DIR's authorizer email. A short code is emailed and confirmed; the
         * email must be verified before references can be submitted.
         */
        fun verifyEmail(): VerifyEmailServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /enterprises`, but is otherwise the same as
         * [EnterpriseServiceAsync.create].
         */
        fun create(
            params: EnterpriseCreateParams
        ): CompletableFuture<HttpResponseFor<EnterprisePublicWrapped>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: EnterpriseCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EnterprisePublicWrapped>>

        /**
         * Returns a raw HTTP response for `get /enterprises/{enterprise_id}`, but is otherwise the
         * same as [EnterpriseServiceAsync.retrieve].
         */
        fun retrieve(
            enterpriseId: String
        ): CompletableFuture<HttpResponseFor<EnterprisePublicWrapped>> =
            retrieve(enterpriseId, EnterpriseRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            enterpriseId: String,
            params: EnterpriseRetrieveParams = EnterpriseRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EnterprisePublicWrapped>> =
            retrieve(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            enterpriseId: String,
            params: EnterpriseRetrieveParams = EnterpriseRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<EnterprisePublicWrapped>> =
            retrieve(enterpriseId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: EnterpriseRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EnterprisePublicWrapped>>

        /** @see retrieve */
        fun retrieve(
            params: EnterpriseRetrieveParams
        ): CompletableFuture<HttpResponseFor<EnterprisePublicWrapped>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            enterpriseId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EnterprisePublicWrapped>> =
            retrieve(enterpriseId, EnterpriseRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /enterprises/{enterprise_id}`, but is otherwise the
         * same as [EnterpriseServiceAsync.update].
         */
        fun update(
            enterpriseId: String
        ): CompletableFuture<HttpResponseFor<EnterprisePublicWrapped>> =
            update(enterpriseId, EnterpriseUpdateParams.none())

        /** @see update */
        fun update(
            enterpriseId: String,
            params: EnterpriseUpdateParams = EnterpriseUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EnterprisePublicWrapped>> =
            update(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

        /** @see update */
        fun update(
            enterpriseId: String,
            params: EnterpriseUpdateParams = EnterpriseUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<EnterprisePublicWrapped>> =
            update(enterpriseId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: EnterpriseUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EnterprisePublicWrapped>>

        /** @see update */
        fun update(
            params: EnterpriseUpdateParams
        ): CompletableFuture<HttpResponseFor<EnterprisePublicWrapped>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            enterpriseId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EnterprisePublicWrapped>> =
            update(enterpriseId, EnterpriseUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /enterprises`, but is otherwise the same as
         * [EnterpriseServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<EnterpriseListPageAsync>> =
            list(EnterpriseListParams.none())

        /** @see list */
        fun list(
            params: EnterpriseListParams = EnterpriseListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EnterpriseListPageAsync>>

        /** @see list */
        fun list(
            params: EnterpriseListParams = EnterpriseListParams.none()
        ): CompletableFuture<HttpResponseFor<EnterpriseListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EnterpriseListPageAsync>> =
            list(EnterpriseListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /enterprises/{enterprise_id}`, but is otherwise
         * the same as [EnterpriseServiceAsync.delete].
         */
        fun delete(enterpriseId: String): CompletableFuture<HttpResponse> =
            delete(enterpriseId, EnterpriseDeleteParams.none())

        /** @see delete */
        fun delete(
            enterpriseId: String,
            params: EnterpriseDeleteParams = EnterpriseDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

        /** @see delete */
        fun delete(
            enterpriseId: String,
            params: EnterpriseDeleteParams = EnterpriseDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(enterpriseId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: EnterpriseDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: EnterpriseDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            enterpriseId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(enterpriseId, EnterpriseDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /enterprises/{enterprise_id}/branded_calling`, but
         * is otherwise the same as [EnterpriseServiceAsync.brandedCalling].
         */
        fun brandedCalling(
            enterpriseId: String
        ): CompletableFuture<HttpResponseFor<EnterprisePublicWrapped>> =
            brandedCalling(enterpriseId, EnterpriseBrandedCallingParams.none())

        /** @see brandedCalling */
        fun brandedCalling(
            enterpriseId: String,
            params: EnterpriseBrandedCallingParams = EnterpriseBrandedCallingParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EnterprisePublicWrapped>> =
            brandedCalling(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

        /** @see brandedCalling */
        fun brandedCalling(
            enterpriseId: String,
            params: EnterpriseBrandedCallingParams = EnterpriseBrandedCallingParams.none(),
        ): CompletableFuture<HttpResponseFor<EnterprisePublicWrapped>> =
            brandedCalling(enterpriseId, params, RequestOptions.none())

        /** @see brandedCalling */
        fun brandedCalling(
            params: EnterpriseBrandedCallingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EnterprisePublicWrapped>>

        /** @see brandedCalling */
        fun brandedCalling(
            params: EnterpriseBrandedCallingParams
        ): CompletableFuture<HttpResponseFor<EnterprisePublicWrapped>> =
            brandedCalling(params, RequestOptions.none())

        /** @see brandedCalling */
        fun brandedCalling(
            enterpriseId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EnterprisePublicWrapped>> =
            brandedCalling(enterpriseId, EnterpriseBrandedCallingParams.none(), requestOptions)
    }
}
