// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.enterprises.EnterpriseActivateBrandedCallingParams
import com.telnyx.sdk.models.enterprises.EnterpriseActivateBrandedCallingResponse
import com.telnyx.sdk.models.enterprises.EnterpriseCreateParams
import com.telnyx.sdk.models.enterprises.EnterpriseCreateResponse
import com.telnyx.sdk.models.enterprises.EnterpriseDeleteParams
import com.telnyx.sdk.models.enterprises.EnterpriseListPageAsync
import com.telnyx.sdk.models.enterprises.EnterpriseListParams
import com.telnyx.sdk.models.enterprises.EnterpriseRetrieveParams
import com.telnyx.sdk.models.enterprises.EnterpriseRetrieveResponse
import com.telnyx.sdk.models.enterprises.EnterpriseUpdateParams
import com.telnyx.sdk.models.enterprises.EnterpriseUpdateResponse
import com.telnyx.sdk.services.async.enterprises.DirServiceAsync
import com.telnyx.sdk.services.async.enterprises.ReputationServiceAsync
import com.telnyx.sdk.services.async.enterprises.UsageServiceAsync
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

    fun usage(): UsageServiceAsync

    /**
     * Create the legal entity that owns your Number Reputation registrations.
     *
     * The response carries a server-assigned `id` you will use for every subsequent call. After
     * creating an enterprise and agreeing to the Number Reputation Terms of Service (`POST
     * /terms_of_service/number_reputation/agree`), enable reputation monitoring via `POST
     * /enterprises/{enterprise_id}/reputation`.
     *
     * An enterprise is shared across Telnyx products; if you also use Branded Calling, the same
     * enterprise is reused.
     */
    fun create(params: EnterpriseCreateParams): CompletableFuture<EnterpriseCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EnterpriseCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EnterpriseCreateResponse>

    /**
     * Retrieve a single enterprise by id. Returns `404` if the id does not exist or does not belong
     * to your account.
     */
    fun retrieve(enterpriseId: String): CompletableFuture<EnterpriseRetrieveResponse> =
        retrieve(enterpriseId, EnterpriseRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        enterpriseId: String,
        params: EnterpriseRetrieveParams = EnterpriseRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EnterpriseRetrieveResponse> =
        retrieve(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        enterpriseId: String,
        params: EnterpriseRetrieveParams = EnterpriseRetrieveParams.none(),
    ): CompletableFuture<EnterpriseRetrieveResponse> =
        retrieve(enterpriseId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EnterpriseRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EnterpriseRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: EnterpriseRetrieveParams): CompletableFuture<EnterpriseRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        enterpriseId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EnterpriseRetrieveResponse> =
        retrieve(enterpriseId, EnterpriseRetrieveParams.none(), requestOptions)

    /**
     * Replace the enterprise's mutable fields. Only mutable fields may be sent. Server-assigned and
     * immutable fields (`id`, `record_type`, `created_at`, `updated_at`, status fields,
     * `organization_type`, `country_code`, `role_type`) cannot be changed: including any of them in
     * the body is rejected with `400 Bad Request` (`Field 'X' is not allowed in this request`).
     */
    fun update(enterpriseId: String): CompletableFuture<EnterpriseUpdateResponse> =
        update(enterpriseId, EnterpriseUpdateParams.none())

    /** @see update */
    fun update(
        enterpriseId: String,
        params: EnterpriseUpdateParams = EnterpriseUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EnterpriseUpdateResponse> =
        update(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

    /** @see update */
    fun update(
        enterpriseId: String,
        params: EnterpriseUpdateParams = EnterpriseUpdateParams.none(),
    ): CompletableFuture<EnterpriseUpdateResponse> =
        update(enterpriseId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: EnterpriseUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EnterpriseUpdateResponse>

    /** @see update */
    fun update(params: EnterpriseUpdateParams): CompletableFuture<EnterpriseUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        enterpriseId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EnterpriseUpdateResponse> =
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
     * Delete an enterprise. Fails with `400` if the enterprise still has dependent resources (e.g.
     * active reputation settings or registered numbers); remove those first. Returns `404` if the
     * enterprise does not exist or does not belong to your account.
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
     * - `403` — Branded Calling Terms of Service not accepted.
     * - `404` — enterprise does not exist or does not belong to your account.
     *
     * **Pricing:** This is a billable action. See https://telnyx.com/pricing/numbers for current
     * pricing.
     */
    fun activateBrandedCalling(
        enterpriseId: String
    ): CompletableFuture<EnterpriseActivateBrandedCallingResponse> =
        activateBrandedCalling(enterpriseId, EnterpriseActivateBrandedCallingParams.none())

    /** @see activateBrandedCalling */
    fun activateBrandedCalling(
        enterpriseId: String,
        params: EnterpriseActivateBrandedCallingParams =
            EnterpriseActivateBrandedCallingParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EnterpriseActivateBrandedCallingResponse> =
        activateBrandedCalling(
            params.toBuilder().enterpriseId(enterpriseId).build(),
            requestOptions,
        )

    /** @see activateBrandedCalling */
    fun activateBrandedCalling(
        enterpriseId: String,
        params: EnterpriseActivateBrandedCallingParams =
            EnterpriseActivateBrandedCallingParams.none(),
    ): CompletableFuture<EnterpriseActivateBrandedCallingResponse> =
        activateBrandedCalling(enterpriseId, params, RequestOptions.none())

    /** @see activateBrandedCalling */
    fun activateBrandedCalling(
        params: EnterpriseActivateBrandedCallingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EnterpriseActivateBrandedCallingResponse>

    /** @see activateBrandedCalling */
    fun activateBrandedCalling(
        params: EnterpriseActivateBrandedCallingParams
    ): CompletableFuture<EnterpriseActivateBrandedCallingResponse> =
        activateBrandedCalling(params, RequestOptions.none())

    /** @see activateBrandedCalling */
    fun activateBrandedCalling(
        enterpriseId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EnterpriseActivateBrandedCallingResponse> =
        activateBrandedCalling(
            enterpriseId,
            EnterpriseActivateBrandedCallingParams.none(),
            requestOptions,
        )

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

        fun usage(): UsageServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /enterprises`, but is otherwise the same as
         * [EnterpriseServiceAsync.create].
         */
        fun create(
            params: EnterpriseCreateParams
        ): CompletableFuture<HttpResponseFor<EnterpriseCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: EnterpriseCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EnterpriseCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /enterprises/{enterprise_id}`, but is otherwise the
         * same as [EnterpriseServiceAsync.retrieve].
         */
        fun retrieve(
            enterpriseId: String
        ): CompletableFuture<HttpResponseFor<EnterpriseRetrieveResponse>> =
            retrieve(enterpriseId, EnterpriseRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            enterpriseId: String,
            params: EnterpriseRetrieveParams = EnterpriseRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EnterpriseRetrieveResponse>> =
            retrieve(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            enterpriseId: String,
            params: EnterpriseRetrieveParams = EnterpriseRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<EnterpriseRetrieveResponse>> =
            retrieve(enterpriseId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: EnterpriseRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EnterpriseRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: EnterpriseRetrieveParams
        ): CompletableFuture<HttpResponseFor<EnterpriseRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            enterpriseId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EnterpriseRetrieveResponse>> =
            retrieve(enterpriseId, EnterpriseRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /enterprises/{enterprise_id}`, but is otherwise the
         * same as [EnterpriseServiceAsync.update].
         */
        fun update(
            enterpriseId: String
        ): CompletableFuture<HttpResponseFor<EnterpriseUpdateResponse>> =
            update(enterpriseId, EnterpriseUpdateParams.none())

        /** @see update */
        fun update(
            enterpriseId: String,
            params: EnterpriseUpdateParams = EnterpriseUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EnterpriseUpdateResponse>> =
            update(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

        /** @see update */
        fun update(
            enterpriseId: String,
            params: EnterpriseUpdateParams = EnterpriseUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<EnterpriseUpdateResponse>> =
            update(enterpriseId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: EnterpriseUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EnterpriseUpdateResponse>>

        /** @see update */
        fun update(
            params: EnterpriseUpdateParams
        ): CompletableFuture<HttpResponseFor<EnterpriseUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            enterpriseId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EnterpriseUpdateResponse>> =
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
         * is otherwise the same as [EnterpriseServiceAsync.activateBrandedCalling].
         */
        fun activateBrandedCalling(
            enterpriseId: String
        ): CompletableFuture<HttpResponseFor<EnterpriseActivateBrandedCallingResponse>> =
            activateBrandedCalling(enterpriseId, EnterpriseActivateBrandedCallingParams.none())

        /** @see activateBrandedCalling */
        fun activateBrandedCalling(
            enterpriseId: String,
            params: EnterpriseActivateBrandedCallingParams =
                EnterpriseActivateBrandedCallingParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EnterpriseActivateBrandedCallingResponse>> =
            activateBrandedCalling(
                params.toBuilder().enterpriseId(enterpriseId).build(),
                requestOptions,
            )

        /** @see activateBrandedCalling */
        fun activateBrandedCalling(
            enterpriseId: String,
            params: EnterpriseActivateBrandedCallingParams =
                EnterpriseActivateBrandedCallingParams.none(),
        ): CompletableFuture<HttpResponseFor<EnterpriseActivateBrandedCallingResponse>> =
            activateBrandedCalling(enterpriseId, params, RequestOptions.none())

        /** @see activateBrandedCalling */
        fun activateBrandedCalling(
            params: EnterpriseActivateBrandedCallingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EnterpriseActivateBrandedCallingResponse>>

        /** @see activateBrandedCalling */
        fun activateBrandedCalling(
            params: EnterpriseActivateBrandedCallingParams
        ): CompletableFuture<HttpResponseFor<EnterpriseActivateBrandedCallingResponse>> =
            activateBrandedCalling(params, RequestOptions.none())

        /** @see activateBrandedCalling */
        fun activateBrandedCalling(
            enterpriseId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EnterpriseActivateBrandedCallingResponse>> =
            activateBrandedCalling(
                enterpriseId,
                EnterpriseActivateBrandedCallingParams.none(),
                requestOptions,
            )
    }
}
