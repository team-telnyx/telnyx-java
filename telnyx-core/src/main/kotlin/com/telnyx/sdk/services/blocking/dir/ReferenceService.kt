// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.dir

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.dir.references.ReferenceListParams
import com.telnyx.sdk.models.dir.references.ReferenceListResponse
import com.telnyx.sdk.models.dir.references.ReferenceSubmitParams
import com.telnyx.sdk.models.dir.references.ReferenceSubmitResponse
import com.telnyx.sdk.models.dir.references.ReferenceUpdateParams
import com.telnyx.sdk.models.dir.references.ReferenceUpdateResponse
import java.util.function.Consumer

/**
 * Submit and manage the two business references and one financial reference that vouch for a DIR.
 * References are contacted to confirm the business identity during vetting.
 */
interface ReferenceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReferenceService

    /**
     * Partially update one reference, addressed by the DIR id plus the reference's type (business
     * or financial) and slot.
     *
     * Cosmetic fields (full name, job title, organization, relationship, email) are always
     * editable. The phone number and timezone may only be changed while a scheduled call has not
     * yet been dialed; if a call is in progress or all attempts are complete, those fields are
     * locked. Changing the timezone reschedules any pending call into the new local calling window.
     */
    fun update(slot: Long, params: ReferenceUpdateParams): ReferenceUpdateResponse =
        update(slot, params, RequestOptions.none())

    /** @see update */
    fun update(
        slot: Long,
        params: ReferenceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReferenceUpdateResponse = update(params.toBuilder().slot(slot).build(), requestOptions)

    /** @see update */
    fun update(params: ReferenceUpdateParams): ReferenceUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ReferenceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReferenceUpdateResponse

    /**
     * List the business and financial references submitted for a DIR.
     *
     * Returns the two business references (slots 0 and 1) followed by the single financial
     * reference. Each entry carries only the customer-supplied details (name, title, organization,
     * relationship, phone, email, timezone). Returns an empty list when no references were
     * submitted.
     */
    fun list(dirId: String): ReferenceListResponse = list(dirId, ReferenceListParams.none())

    /** @see list */
    fun list(
        dirId: String,
        params: ReferenceListParams = ReferenceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReferenceListResponse = list(params.toBuilder().dirId(dirId).build(), requestOptions)

    /** @see list */
    fun list(
        dirId: String,
        params: ReferenceListParams = ReferenceListParams.none(),
    ): ReferenceListResponse = list(dirId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ReferenceListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReferenceListResponse

    /** @see list */
    fun list(params: ReferenceListParams): ReferenceListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(dirId: String, requestOptions: RequestOptions): ReferenceListResponse =
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
    fun submit(dirId: String, params: ReferenceSubmitParams): ReferenceSubmitResponse =
        submit(dirId, params, RequestOptions.none())

    /** @see submit */
    fun submit(
        dirId: String,
        params: ReferenceSubmitParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReferenceSubmitResponse = submit(params.toBuilder().dirId(dirId).build(), requestOptions)

    /** @see submit */
    fun submit(params: ReferenceSubmitParams): ReferenceSubmitResponse =
        submit(params, RequestOptions.none())

    /** @see submit */
    fun submit(
        params: ReferenceSubmitParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReferenceSubmitResponse

    /** A view of [ReferenceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReferenceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `patch /dir/{dir_id}/references/{ref_type}/{slot}`, but
         * is otherwise the same as [ReferenceService.update].
         */
        @MustBeClosed
        fun update(
            slot: Long,
            params: ReferenceUpdateParams,
        ): HttpResponseFor<ReferenceUpdateResponse> = update(slot, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            slot: Long,
            params: ReferenceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReferenceUpdateResponse> =
            update(params.toBuilder().slot(slot).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: ReferenceUpdateParams): HttpResponseFor<ReferenceUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ReferenceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReferenceUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /dir/{dir_id}/references`, but is otherwise the same
         * as [ReferenceService.list].
         */
        @MustBeClosed
        fun list(dirId: String): HttpResponseFor<ReferenceListResponse> =
            list(dirId, ReferenceListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            dirId: String,
            params: ReferenceListParams = ReferenceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReferenceListResponse> =
            list(params.toBuilder().dirId(dirId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            dirId: String,
            params: ReferenceListParams = ReferenceListParams.none(),
        ): HttpResponseFor<ReferenceListResponse> = list(dirId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ReferenceListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReferenceListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: ReferenceListParams): HttpResponseFor<ReferenceListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            dirId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ReferenceListResponse> =
            list(dirId, ReferenceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /dir/{dir_id}/references`, but is otherwise the
         * same as [ReferenceService.submit].
         */
        @MustBeClosed
        fun submit(
            dirId: String,
            params: ReferenceSubmitParams,
        ): HttpResponseFor<ReferenceSubmitResponse> = submit(dirId, params, RequestOptions.none())

        /** @see submit */
        @MustBeClosed
        fun submit(
            dirId: String,
            params: ReferenceSubmitParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReferenceSubmitResponse> =
            submit(params.toBuilder().dirId(dirId).build(), requestOptions)

        /** @see submit */
        @MustBeClosed
        fun submit(params: ReferenceSubmitParams): HttpResponseFor<ReferenceSubmitResponse> =
            submit(params, RequestOptions.none())

        /** @see submit */
        @MustBeClosed
        fun submit(
            params: ReferenceSubmitParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReferenceSubmitResponse>
    }
}
