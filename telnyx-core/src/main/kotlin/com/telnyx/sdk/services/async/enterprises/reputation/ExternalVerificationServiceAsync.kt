// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.enterprises.reputation

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.enterprises.reputation.externalverification.ExternalVerificationCreateParams
import com.telnyx.sdk.models.enterprises.reputation.externalverification.ExternalVerificationListParams
import com.telnyx.sdk.models.enterprises.reputation.externalverification.ExternalVerificationWrapped
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Phone-number reputation monitoring (spam-score lookup and tracking). */
interface ExternalVerificationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExternalVerificationServiceAsync

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
    ): CompletableFuture<ExternalVerificationWrapped> =
        create(enterpriseId, params, RequestOptions.none())

    /** @see create */
    fun create(
        enterpriseId: String,
        params: ExternalVerificationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalVerificationWrapped> =
        create(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

    /** @see create */
    fun create(
        params: ExternalVerificationCreateParams
    ): CompletableFuture<ExternalVerificationWrapped> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ExternalVerificationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalVerificationWrapped>

    /**
     * Get the review status of the enterprise's ownership proof for phone numbers hosted with
     * another provider. Returns 404 when no proof has been submitted.
     */
    fun list(enterpriseId: String): CompletableFuture<ExternalVerificationWrapped> =
        list(enterpriseId, ExternalVerificationListParams.none())

    /** @see list */
    fun list(
        enterpriseId: String,
        params: ExternalVerificationListParams = ExternalVerificationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalVerificationWrapped> =
        list(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

    /** @see list */
    fun list(
        enterpriseId: String,
        params: ExternalVerificationListParams = ExternalVerificationListParams.none(),
    ): CompletableFuture<ExternalVerificationWrapped> =
        list(enterpriseId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ExternalVerificationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalVerificationWrapped>

    /** @see list */
    fun list(
        params: ExternalVerificationListParams
    ): CompletableFuture<ExternalVerificationWrapped> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        enterpriseId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalVerificationWrapped> =
        list(enterpriseId, ExternalVerificationListParams.none(), requestOptions)

    /**
     * A view of [ExternalVerificationServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExternalVerificationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /enterprises/{enterprise_id}/reputation/external_verification`, but is otherwise the same
         * as [ExternalVerificationServiceAsync.create].
         */
        fun create(
            enterpriseId: String,
            params: ExternalVerificationCreateParams,
        ): CompletableFuture<HttpResponseFor<ExternalVerificationWrapped>> =
            create(enterpriseId, params, RequestOptions.none())

        /** @see create */
        fun create(
            enterpriseId: String,
            params: ExternalVerificationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalVerificationWrapped>> =
            create(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

        /** @see create */
        fun create(
            params: ExternalVerificationCreateParams
        ): CompletableFuture<HttpResponseFor<ExternalVerificationWrapped>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ExternalVerificationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalVerificationWrapped>>

        /**
         * Returns a raw HTTP response for `get
         * /enterprises/{enterprise_id}/reputation/external_verification`, but is otherwise the same
         * as [ExternalVerificationServiceAsync.list].
         */
        fun list(
            enterpriseId: String
        ): CompletableFuture<HttpResponseFor<ExternalVerificationWrapped>> =
            list(enterpriseId, ExternalVerificationListParams.none())

        /** @see list */
        fun list(
            enterpriseId: String,
            params: ExternalVerificationListParams = ExternalVerificationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalVerificationWrapped>> =
            list(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

        /** @see list */
        fun list(
            enterpriseId: String,
            params: ExternalVerificationListParams = ExternalVerificationListParams.none(),
        ): CompletableFuture<HttpResponseFor<ExternalVerificationWrapped>> =
            list(enterpriseId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: ExternalVerificationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalVerificationWrapped>>

        /** @see list */
        fun list(
            params: ExternalVerificationListParams
        ): CompletableFuture<HttpResponseFor<ExternalVerificationWrapped>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            enterpriseId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalVerificationWrapped>> =
            list(enterpriseId, ExternalVerificationListParams.none(), requestOptions)
    }
}
