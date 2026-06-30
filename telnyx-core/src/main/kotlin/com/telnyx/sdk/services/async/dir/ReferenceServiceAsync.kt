// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.dir

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.dir.references.ReferenceCreateParams
import com.telnyx.sdk.models.dir.references.ReferenceList
import com.telnyx.sdk.models.dir.references.ReferenceListParams
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
     * Submit the two business references and one financial reference for a DIR.
     *
     * The DIR's authorizer email must be verified first (see the email-verification endpoint).
     * Until it is, this returns `409` and no references are stored.
     *
     * The request body carries exactly two business references plus one financial reference. On
     * success the references are stored and the response echoes them in the same shape as the GET.
     * Submitting again converges on the already-stored references rather than erroring.
     */
    fun create(dirId: String, params: ReferenceCreateParams): CompletableFuture<ReferenceList> =
        create(dirId, params, RequestOptions.none())

    /** @see create */
    fun create(
        dirId: String,
        params: ReferenceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReferenceList> =
        create(params.toBuilder().dirId(dirId).build(), requestOptions)

    /** @see create */
    fun create(params: ReferenceCreateParams): CompletableFuture<ReferenceList> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ReferenceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReferenceList>

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
    fun list(dirId: String): CompletableFuture<ReferenceList> =
        list(dirId, ReferenceListParams.none())

    /** @see list */
    fun list(
        dirId: String,
        params: ReferenceListParams = ReferenceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReferenceList> =
        list(params.toBuilder().dirId(dirId).build(), requestOptions)

    /** @see list */
    fun list(
        dirId: String,
        params: ReferenceListParams = ReferenceListParams.none(),
    ): CompletableFuture<ReferenceList> = list(dirId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ReferenceListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReferenceList>

    /** @see list */
    fun list(params: ReferenceListParams): CompletableFuture<ReferenceList> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(dirId: String, requestOptions: RequestOptions): CompletableFuture<ReferenceList> =
        list(dirId, ReferenceListParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `post /dir/{dir_id}/references`, but is otherwise the
         * same as [ReferenceServiceAsync.create].
         */
        fun create(
            dirId: String,
            params: ReferenceCreateParams,
        ): CompletableFuture<HttpResponseFor<ReferenceList>> =
            create(dirId, params, RequestOptions.none())

        /** @see create */
        fun create(
            dirId: String,
            params: ReferenceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReferenceList>> =
            create(params.toBuilder().dirId(dirId).build(), requestOptions)

        /** @see create */
        fun create(
            params: ReferenceCreateParams
        ): CompletableFuture<HttpResponseFor<ReferenceList>> = create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ReferenceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReferenceList>>

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
        fun list(dirId: String): CompletableFuture<HttpResponseFor<ReferenceList>> =
            list(dirId, ReferenceListParams.none())

        /** @see list */
        fun list(
            dirId: String,
            params: ReferenceListParams = ReferenceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReferenceList>> =
            list(params.toBuilder().dirId(dirId).build(), requestOptions)

        /** @see list */
        fun list(
            dirId: String,
            params: ReferenceListParams = ReferenceListParams.none(),
        ): CompletableFuture<HttpResponseFor<ReferenceList>> =
            list(dirId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: ReferenceListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReferenceList>>

        /** @see list */
        fun list(params: ReferenceListParams): CompletableFuture<HttpResponseFor<ReferenceList>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            dirId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ReferenceList>> =
            list(dirId, ReferenceListParams.none(), requestOptions)
    }
}
