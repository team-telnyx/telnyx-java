// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.dir

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.dir.references.ReferenceListParams
import com.telnyx.sdk.models.dir.references.ReferenceListResponse
import com.telnyx.sdk.models.dir.references.ReferenceSubmitParams
import com.telnyx.sdk.models.dir.references.ReferenceSubmitResponse
import com.telnyx.sdk.models.dir.references.ReferenceUpdateParams
import com.telnyx.sdk.models.dir.references.ReferenceUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Submit and manage the two business references and one financial reference that vouch for a DIR.
 * References are contacted to confirm the business identity during vetting.
 */
interface ReferenceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReferenceServiceAsync

    /**
     * Partially update one reference, addressed by the DIR id plus the reference's type (business
     * or financial) and slot.
     *
     * Cosmetic fields (full name, job title, organization, relationship, email) are always
     * editable. The phone number and timezone may only be changed while a scheduled call has not
     * yet been dialed; if a call is in progress or all attempts are complete, those fields are
     * locked. Changing the timezone reschedules any pending call into the new local calling window.
     */
    fun update(
        slot: Long,
        params: ReferenceUpdateParams,
    ): CompletableFuture<ReferenceUpdateResponse> = update(slot, params, RequestOptions.none())

    /** @see update */
    fun update(
        slot: Long,
        params: ReferenceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReferenceUpdateResponse> =
        update(params.toBuilder().slot(slot).build(), requestOptions)

    /** @see update */
    fun update(params: ReferenceUpdateParams): CompletableFuture<ReferenceUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ReferenceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReferenceUpdateResponse>

    /**
     * List the business and financial references submitted for a DIR.
     *
     * Returns the two business references (slots 0 and 1) followed by the single financial
     * reference. Each entry carries only the customer-supplied details (name, title, organization,
     * relationship, phone, email, timezone). Returns an empty list when no references were
     * submitted.
     */
    fun list(dirId: String): CompletableFuture<ReferenceListResponse> =
        list(dirId, ReferenceListParams.none())

    /** @see list */
    fun list(
        dirId: String,
        params: ReferenceListParams = ReferenceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReferenceListResponse> =
        list(params.toBuilder().dirId(dirId).build(), requestOptions)

    /** @see list */
    fun list(
        dirId: String,
        params: ReferenceListParams = ReferenceListParams.none(),
    ): CompletableFuture<ReferenceListResponse> = list(dirId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ReferenceListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReferenceListResponse>

    /** @see list */
    fun list(params: ReferenceListParams): CompletableFuture<ReferenceListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        dirId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ReferenceListResponse> =
        list(dirId, ReferenceListParams.none(), requestOptions)

    /**
     * Submit the two business references and one financial reference for a DIR.
     *
     * The DIR's authorizer email must be verified first (see the email-verification endpoint).
     * Until it is, this returns `409` and no references are stored.
     *
     * The request body carries exactly two business references plus one financial reference. On
     * success the references are stored and the response echoes them in the same shape as the GET.
     * Submitting again converges on the already-stored references rather than erroring.
     */
    fun submit(
        dirId: String,
        params: ReferenceSubmitParams,
    ): CompletableFuture<ReferenceSubmitResponse> = submit(dirId, params, RequestOptions.none())

    /** @see submit */
    fun submit(
        dirId: String,
        params: ReferenceSubmitParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReferenceSubmitResponse> =
        submit(params.toBuilder().dirId(dirId).build(), requestOptions)

    /** @see submit */
    fun submit(params: ReferenceSubmitParams): CompletableFuture<ReferenceSubmitResponse> =
        submit(params, RequestOptions.none())

    /** @see submit */
    fun submit(
        params: ReferenceSubmitParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReferenceSubmitResponse>

    /**
     * A view of [ReferenceServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ReferenceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `patch /dir/{dir_id}/references/{ref_type}/{slot}`, but
         * is otherwise the same as [ReferenceServiceAsync.update].
         */
        fun update(
            slot: Long,
            params: ReferenceUpdateParams,
        ): CompletableFuture<HttpResponseFor<ReferenceUpdateResponse>> =
            update(slot, params, RequestOptions.none())

        /** @see update */
        fun update(
            slot: Long,
            params: ReferenceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReferenceUpdateResponse>> =
            update(params.toBuilder().slot(slot).build(), requestOptions)

        /** @see update */
        fun update(
            params: ReferenceUpdateParams
        ): CompletableFuture<HttpResponseFor<ReferenceUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ReferenceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReferenceUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /dir/{dir_id}/references`, but is otherwise the same
         * as [ReferenceServiceAsync.list].
         */
        fun list(dirId: String): CompletableFuture<HttpResponseFor<ReferenceListResponse>> =
            list(dirId, ReferenceListParams.none())

        /** @see list */
        fun list(
            dirId: String,
            params: ReferenceListParams = ReferenceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReferenceListResponse>> =
            list(params.toBuilder().dirId(dirId).build(), requestOptions)

        /** @see list */
        fun list(
            dirId: String,
            params: ReferenceListParams = ReferenceListParams.none(),
        ): CompletableFuture<HttpResponseFor<ReferenceListResponse>> =
            list(dirId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: ReferenceListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReferenceListResponse>>

        /** @see list */
        fun list(
            params: ReferenceListParams
        ): CompletableFuture<HttpResponseFor<ReferenceListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            dirId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ReferenceListResponse>> =
            list(dirId, ReferenceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /dir/{dir_id}/references`, but is otherwise the
         * same as [ReferenceServiceAsync.submit].
         */
        fun submit(
            dirId: String,
            params: ReferenceSubmitParams,
        ): CompletableFuture<HttpResponseFor<ReferenceSubmitResponse>> =
            submit(dirId, params, RequestOptions.none())

        /** @see submit */
        fun submit(
            dirId: String,
            params: ReferenceSubmitParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReferenceSubmitResponse>> =
            submit(params.toBuilder().dirId(dirId).build(), requestOptions)

        /** @see submit */
        fun submit(
            params: ReferenceSubmitParams
        ): CompletableFuture<HttpResponseFor<ReferenceSubmitResponse>> =
            submit(params, RequestOptions.none())

        /** @see submit */
        fun submit(
            params: ReferenceSubmitParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReferenceSubmitResponse>>
    }
}
