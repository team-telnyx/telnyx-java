// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.enterprises.EnterpriseBrandedCallingParams
import com.telnyx.sdk.models.enterprises.EnterpriseCreateParams
import com.telnyx.sdk.models.enterprises.EnterpriseDeleteParams
import com.telnyx.sdk.models.enterprises.EnterpriseListPage
import com.telnyx.sdk.models.enterprises.EnterpriseListParams
import com.telnyx.sdk.models.enterprises.EnterprisePublicWrapped
import com.telnyx.sdk.models.enterprises.EnterpriseRetrieveParams
import com.telnyx.sdk.models.enterprises.EnterpriseUpdateParams
import com.telnyx.sdk.services.blocking.enterprises.DirService
import com.telnyx.sdk.services.blocking.enterprises.ReputationService
import java.util.function.Consumer

/** Manage the legal-entity record that owns your DIRs and phone numbers. */
interface EnterpriseService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EnterpriseService

    /** Phone-number reputation monitoring (spam-score lookup and tracking). */
    fun reputation(): ReputationService

    /**
     * A Display Identity Record (DIR) is the verified calling identity (display name, logo, call
     * reasons) shown to recipients on outbound calls.
     */
    fun dir(): DirService

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
    fun create(params: EnterpriseCreateParams): EnterprisePublicWrapped =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EnterpriseCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnterprisePublicWrapped

    /**
     * Retrieve a single enterprise by id. Returns `404` if the id does not exist or does not belong
     * to your account.
     */
    fun retrieve(enterpriseId: String): EnterprisePublicWrapped =
        retrieve(enterpriseId, EnterpriseRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        enterpriseId: String,
        params: EnterpriseRetrieveParams = EnterpriseRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnterprisePublicWrapped =
        retrieve(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        enterpriseId: String,
        params: EnterpriseRetrieveParams = EnterpriseRetrieveParams.none(),
    ): EnterprisePublicWrapped = retrieve(enterpriseId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EnterpriseRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnterprisePublicWrapped

    /** @see retrieve */
    fun retrieve(params: EnterpriseRetrieveParams): EnterprisePublicWrapped =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(enterpriseId: String, requestOptions: RequestOptions): EnterprisePublicWrapped =
        retrieve(enterpriseId, EnterpriseRetrieveParams.none(), requestOptions)

    /**
     * Replace the enterprise's mutable fields. Only mutable fields may be sent. Server-assigned and
     * immutable fields (`id`, `record_type`, `created_at`, `updated_at`, status fields,
     * `organization_type`, `country_code`, `role_type`) cannot be changed: including any of them in
     * the body is rejected with `400 Bad Request` (`Field 'X' is not allowed in this request`).
     */
    fun update(enterpriseId: String): EnterprisePublicWrapped =
        update(enterpriseId, EnterpriseUpdateParams.none())

    /** @see update */
    fun update(
        enterpriseId: String,
        params: EnterpriseUpdateParams = EnterpriseUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnterprisePublicWrapped =
        update(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

    /** @see update */
    fun update(
        enterpriseId: String,
        params: EnterpriseUpdateParams = EnterpriseUpdateParams.none(),
    ): EnterprisePublicWrapped = update(enterpriseId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: EnterpriseUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnterprisePublicWrapped

    /** @see update */
    fun update(params: EnterpriseUpdateParams): EnterprisePublicWrapped =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(enterpriseId: String, requestOptions: RequestOptions): EnterprisePublicWrapped =
        update(enterpriseId, EnterpriseUpdateParams.none(), requestOptions)

    /**
     * Return the enterprises you own, paginated. The default page size is 20; the maximum is 250.
     */
    fun list(): EnterpriseListPage = list(EnterpriseListParams.none())

    /** @see list */
    fun list(
        params: EnterpriseListParams = EnterpriseListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnterpriseListPage

    /** @see list */
    fun list(params: EnterpriseListParams = EnterpriseListParams.none()): EnterpriseListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): EnterpriseListPage =
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
    fun delete(enterpriseId: String) = delete(enterpriseId, EnterpriseDeleteParams.none())

    /** @see delete */
    fun delete(
        enterpriseId: String,
        params: EnterpriseDeleteParams = EnterpriseDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

    /** @see delete */
    fun delete(
        enterpriseId: String,
        params: EnterpriseDeleteParams = EnterpriseDeleteParams.none(),
    ) = delete(enterpriseId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: EnterpriseDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: EnterpriseDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(enterpriseId: String, requestOptions: RequestOptions) =
        delete(enterpriseId, EnterpriseDeleteParams.none(), requestOptions)

    /**
     * Branded Calling is a paid product that must be activated on each enterprise. Activation is
     * idempotent:
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
     * - `403` - Branded Calling Terms of Service not accepted.
     * - `404` - enterprise does not exist or does not belong to your account.
     *
     * **Pricing:** This is a billable action. See https://telnyx.com/pricing/numbers for current
     * pricing.
     */
    fun brandedCalling(enterpriseId: String): EnterprisePublicWrapped =
        brandedCalling(enterpriseId, EnterpriseBrandedCallingParams.none())

    /** @see brandedCalling */
    fun brandedCalling(
        enterpriseId: String,
        params: EnterpriseBrandedCallingParams = EnterpriseBrandedCallingParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnterprisePublicWrapped =
        brandedCalling(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

    /** @see brandedCalling */
    fun brandedCalling(
        enterpriseId: String,
        params: EnterpriseBrandedCallingParams = EnterpriseBrandedCallingParams.none(),
    ): EnterprisePublicWrapped = brandedCalling(enterpriseId, params, RequestOptions.none())

    /** @see brandedCalling */
    fun brandedCalling(
        params: EnterpriseBrandedCallingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnterprisePublicWrapped

    /** @see brandedCalling */
    fun brandedCalling(params: EnterpriseBrandedCallingParams): EnterprisePublicWrapped =
        brandedCalling(params, RequestOptions.none())

    /** @see brandedCalling */
    fun brandedCalling(
        enterpriseId: String,
        requestOptions: RequestOptions,
    ): EnterprisePublicWrapped =
        brandedCalling(enterpriseId, EnterpriseBrandedCallingParams.none(), requestOptions)

    /** A view of [EnterpriseService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EnterpriseService.WithRawResponse

        /** Phone-number reputation monitoring (spam-score lookup and tracking). */
        fun reputation(): ReputationService.WithRawResponse

        /**
         * A Display Identity Record (DIR) is the verified calling identity (display name, logo,
         * call reasons) shown to recipients on outbound calls.
         */
        fun dir(): DirService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /enterprises`, but is otherwise the same as
         * [EnterpriseService.create].
         */
        @MustBeClosed
        fun create(params: EnterpriseCreateParams): HttpResponseFor<EnterprisePublicWrapped> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: EnterpriseCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnterprisePublicWrapped>

        /**
         * Returns a raw HTTP response for `get /enterprises/{enterprise_id}`, but is otherwise the
         * same as [EnterpriseService.retrieve].
         */
        @MustBeClosed
        fun retrieve(enterpriseId: String): HttpResponseFor<EnterprisePublicWrapped> =
            retrieve(enterpriseId, EnterpriseRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            enterpriseId: String,
            params: EnterpriseRetrieveParams = EnterpriseRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnterprisePublicWrapped> =
            retrieve(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            enterpriseId: String,
            params: EnterpriseRetrieveParams = EnterpriseRetrieveParams.none(),
        ): HttpResponseFor<EnterprisePublicWrapped> =
            retrieve(enterpriseId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: EnterpriseRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnterprisePublicWrapped>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: EnterpriseRetrieveParams): HttpResponseFor<EnterprisePublicWrapped> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            enterpriseId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EnterprisePublicWrapped> =
            retrieve(enterpriseId, EnterpriseRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /enterprises/{enterprise_id}`, but is otherwise the
         * same as [EnterpriseService.update].
         */
        @MustBeClosed
        fun update(enterpriseId: String): HttpResponseFor<EnterprisePublicWrapped> =
            update(enterpriseId, EnterpriseUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            enterpriseId: String,
            params: EnterpriseUpdateParams = EnterpriseUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnterprisePublicWrapped> =
            update(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            enterpriseId: String,
            params: EnterpriseUpdateParams = EnterpriseUpdateParams.none(),
        ): HttpResponseFor<EnterprisePublicWrapped> =
            update(enterpriseId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: EnterpriseUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnterprisePublicWrapped>

        /** @see update */
        @MustBeClosed
        fun update(params: EnterpriseUpdateParams): HttpResponseFor<EnterprisePublicWrapped> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            enterpriseId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EnterprisePublicWrapped> =
            update(enterpriseId, EnterpriseUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /enterprises`, but is otherwise the same as
         * [EnterpriseService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<EnterpriseListPage> = list(EnterpriseListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: EnterpriseListParams = EnterpriseListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnterpriseListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: EnterpriseListParams = EnterpriseListParams.none()
        ): HttpResponseFor<EnterpriseListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<EnterpriseListPage> =
            list(EnterpriseListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /enterprises/{enterprise_id}`, but is otherwise
         * the same as [EnterpriseService.delete].
         */
        @MustBeClosed
        fun delete(enterpriseId: String): HttpResponse =
            delete(enterpriseId, EnterpriseDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            enterpriseId: String,
            params: EnterpriseDeleteParams = EnterpriseDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            enterpriseId: String,
            params: EnterpriseDeleteParams = EnterpriseDeleteParams.none(),
        ): HttpResponse = delete(enterpriseId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: EnterpriseDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: EnterpriseDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(enterpriseId: String, requestOptions: RequestOptions): HttpResponse =
            delete(enterpriseId, EnterpriseDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /enterprises/{enterprise_id}/branded_calling`, but
         * is otherwise the same as [EnterpriseService.brandedCalling].
         */
        @MustBeClosed
        fun brandedCalling(enterpriseId: String): HttpResponseFor<EnterprisePublicWrapped> =
            brandedCalling(enterpriseId, EnterpriseBrandedCallingParams.none())

        /** @see brandedCalling */
        @MustBeClosed
        fun brandedCalling(
            enterpriseId: String,
            params: EnterpriseBrandedCallingParams = EnterpriseBrandedCallingParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnterprisePublicWrapped> =
            brandedCalling(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

        /** @see brandedCalling */
        @MustBeClosed
        fun brandedCalling(
            enterpriseId: String,
            params: EnterpriseBrandedCallingParams = EnterpriseBrandedCallingParams.none(),
        ): HttpResponseFor<EnterprisePublicWrapped> =
            brandedCalling(enterpriseId, params, RequestOptions.none())

        /** @see brandedCalling */
        @MustBeClosed
        fun brandedCalling(
            params: EnterpriseBrandedCallingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnterprisePublicWrapped>

        /** @see brandedCalling */
        @MustBeClosed
        fun brandedCalling(
            params: EnterpriseBrandedCallingParams
        ): HttpResponseFor<EnterprisePublicWrapped> = brandedCalling(params, RequestOptions.none())

        /** @see brandedCalling */
        @MustBeClosed
        fun brandedCalling(
            enterpriseId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EnterprisePublicWrapped> =
            brandedCalling(enterpriseId, EnterpriseBrandedCallingParams.none(), requestOptions)
    }
}
