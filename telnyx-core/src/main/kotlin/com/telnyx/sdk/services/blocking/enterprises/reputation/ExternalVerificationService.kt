// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.enterprises.reputation

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.enterprises.reputation.externalverification.ExternalVerificationCreateParams
import com.telnyx.sdk.models.enterprises.reputation.externalverification.ExternalVerificationListParams
import com.telnyx.sdk.models.enterprises.reputation.externalverification.ExternalVerificationWrapped
import java.util.function.Consumer

/** Phone-number reputation monitoring (spam-score lookup and tracking). */
interface ExternalVerificationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExternalVerificationService

    /**
     * Request permission to add phone numbers that the enterprise owns but that are hosted with
     * another provider. Submit one or more uploaded documents proving ownership, such as a carrier
     * invoice or account statement. The request is reviewed once per enterprise. While it is
     * `pending` or `rejected` you can submit again to replace the documents; once `approved` it
     * cannot be changed.
     */
    fun create(
        enterpriseId: String,
        params: ExternalVerificationCreateParams,
    ): ExternalVerificationWrapped = create(enterpriseId, params, RequestOptions.none())

    /** @see create */
    fun create(
        enterpriseId: String,
        params: ExternalVerificationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalVerificationWrapped =
        create(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

    /** @see create */
    fun create(params: ExternalVerificationCreateParams): ExternalVerificationWrapped =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ExternalVerificationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalVerificationWrapped

    /**
     * Get the review status of the enterprise's ownership proof for phone numbers hosted with
     * another provider. Returns 404 when no proof has been submitted.
     */
    fun list(enterpriseId: String): ExternalVerificationWrapped =
        list(enterpriseId, ExternalVerificationListParams.none())

    /** @see list */
    fun list(
        enterpriseId: String,
        params: ExternalVerificationListParams = ExternalVerificationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalVerificationWrapped =
        list(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

    /** @see list */
    fun list(
        enterpriseId: String,
        params: ExternalVerificationListParams = ExternalVerificationListParams.none(),
    ): ExternalVerificationWrapped = list(enterpriseId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ExternalVerificationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalVerificationWrapped

    /** @see list */
    fun list(params: ExternalVerificationListParams): ExternalVerificationWrapped =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(enterpriseId: String, requestOptions: RequestOptions): ExternalVerificationWrapped =
        list(enterpriseId, ExternalVerificationListParams.none(), requestOptions)

    /**
     * A view of [ExternalVerificationService] that provides access to raw HTTP responses for each
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
        ): ExternalVerificationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /enterprises/{enterprise_id}/reputation/external_verification`, but is otherwise the same
         * as [ExternalVerificationService.create].
         */
        @MustBeClosed
        fun create(
            enterpriseId: String,
            params: ExternalVerificationCreateParams,
        ): HttpResponseFor<ExternalVerificationWrapped> =
            create(enterpriseId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            enterpriseId: String,
            params: ExternalVerificationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalVerificationWrapped> =
            create(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            params: ExternalVerificationCreateParams
        ): HttpResponseFor<ExternalVerificationWrapped> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ExternalVerificationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalVerificationWrapped>

        /**
         * Returns a raw HTTP response for `get
         * /enterprises/{enterprise_id}/reputation/external_verification`, but is otherwise the same
         * as [ExternalVerificationService.list].
         */
        @MustBeClosed
        fun list(enterpriseId: String): HttpResponseFor<ExternalVerificationWrapped> =
            list(enterpriseId, ExternalVerificationListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            enterpriseId: String,
            params: ExternalVerificationListParams = ExternalVerificationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalVerificationWrapped> =
            list(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            enterpriseId: String,
            params: ExternalVerificationListParams = ExternalVerificationListParams.none(),
        ): HttpResponseFor<ExternalVerificationWrapped> =
            list(enterpriseId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ExternalVerificationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalVerificationWrapped>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ExternalVerificationListParams
        ): HttpResponseFor<ExternalVerificationWrapped> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            enterpriseId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalVerificationWrapped> =
            list(enterpriseId, ExternalVerificationListParams.none(), requestOptions)
    }
}
