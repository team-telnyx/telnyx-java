// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.billinggroups.BillingGroupCreateParams
import com.telnyx.sdk.models.billinggroups.BillingGroupCreateResponse
import com.telnyx.sdk.models.billinggroups.BillingGroupDeleteParams
import com.telnyx.sdk.models.billinggroups.BillingGroupDeleteResponse
import com.telnyx.sdk.models.billinggroups.BillingGroupListPageAsync
import com.telnyx.sdk.models.billinggroups.BillingGroupListParams
import com.telnyx.sdk.models.billinggroups.BillingGroupRetrieveParams
import com.telnyx.sdk.models.billinggroups.BillingGroupRetrieveResponse
import com.telnyx.sdk.models.billinggroups.BillingGroupUpdateParams
import com.telnyx.sdk.models.billinggroups.BillingGroupUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Billing groups operations */
interface BillingGroupServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BillingGroupServiceAsync

    /** Create a billing group */
    fun create(): CompletableFuture<BillingGroupCreateResponse> =
        create(BillingGroupCreateParams.none())

    /** @see create */
    fun create(
        params: BillingGroupCreateParams = BillingGroupCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillingGroupCreateResponse>

    /** @see create */
    fun create(
        params: BillingGroupCreateParams = BillingGroupCreateParams.none()
    ): CompletableFuture<BillingGroupCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<BillingGroupCreateResponse> =
        create(BillingGroupCreateParams.none(), requestOptions)

    /** Get a billing group */
    fun retrieve(id: String): CompletableFuture<BillingGroupRetrieveResponse> =
        retrieve(id, BillingGroupRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: BillingGroupRetrieveParams = BillingGroupRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillingGroupRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: BillingGroupRetrieveParams = BillingGroupRetrieveParams.none(),
    ): CompletableFuture<BillingGroupRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BillingGroupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillingGroupRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: BillingGroupRetrieveParams
    ): CompletableFuture<BillingGroupRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillingGroupRetrieveResponse> =
        retrieve(id, BillingGroupRetrieveParams.none(), requestOptions)

    /** Update a billing group */
    fun update(id: String): CompletableFuture<BillingGroupUpdateResponse> =
        update(id, BillingGroupUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: BillingGroupUpdateParams = BillingGroupUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillingGroupUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: BillingGroupUpdateParams = BillingGroupUpdateParams.none(),
    ): CompletableFuture<BillingGroupUpdateResponse> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: BillingGroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillingGroupUpdateResponse>

    /** @see update */
    fun update(params: BillingGroupUpdateParams): CompletableFuture<BillingGroupUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillingGroupUpdateResponse> =
        update(id, BillingGroupUpdateParams.none(), requestOptions)

    /** List all billing groups */
    fun list(): CompletableFuture<BillingGroupListPageAsync> = list(BillingGroupListParams.none())

    /** @see list */
    fun list(
        params: BillingGroupListParams = BillingGroupListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillingGroupListPageAsync>

    /** @see list */
    fun list(
        params: BillingGroupListParams = BillingGroupListParams.none()
    ): CompletableFuture<BillingGroupListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<BillingGroupListPageAsync> =
        list(BillingGroupListParams.none(), requestOptions)

    /** Delete a billing group */
    fun delete(id: String): CompletableFuture<BillingGroupDeleteResponse> =
        delete(id, BillingGroupDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: BillingGroupDeleteParams = BillingGroupDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillingGroupDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: BillingGroupDeleteParams = BillingGroupDeleteParams.none(),
    ): CompletableFuture<BillingGroupDeleteResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: BillingGroupDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillingGroupDeleteResponse>

    /** @see delete */
    fun delete(params: BillingGroupDeleteParams): CompletableFuture<BillingGroupDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillingGroupDeleteResponse> =
        delete(id, BillingGroupDeleteParams.none(), requestOptions)

    /**
     * A view of [BillingGroupServiceAsync] that provides access to raw HTTP responses for each
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
        ): BillingGroupServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /billing_groups`, but is otherwise the same as
         * [BillingGroupServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<BillingGroupCreateResponse>> =
            create(BillingGroupCreateParams.none())

        /** @see create */
        fun create(
            params: BillingGroupCreateParams = BillingGroupCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillingGroupCreateResponse>>

        /** @see create */
        fun create(
            params: BillingGroupCreateParams = BillingGroupCreateParams.none()
        ): CompletableFuture<HttpResponseFor<BillingGroupCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BillingGroupCreateResponse>> =
            create(BillingGroupCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /billing_groups/{id}`, but is otherwise the same as
         * [BillingGroupServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<BillingGroupRetrieveResponse>> =
            retrieve(id, BillingGroupRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: BillingGroupRetrieveParams = BillingGroupRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillingGroupRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: BillingGroupRetrieveParams = BillingGroupRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<BillingGroupRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: BillingGroupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillingGroupRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: BillingGroupRetrieveParams
        ): CompletableFuture<HttpResponseFor<BillingGroupRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BillingGroupRetrieveResponse>> =
            retrieve(id, BillingGroupRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /billing_groups/{id}`, but is otherwise the same
         * as [BillingGroupServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<BillingGroupUpdateResponse>> =
            update(id, BillingGroupUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: BillingGroupUpdateParams = BillingGroupUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillingGroupUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: BillingGroupUpdateParams = BillingGroupUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<BillingGroupUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: BillingGroupUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillingGroupUpdateResponse>>

        /** @see update */
        fun update(
            params: BillingGroupUpdateParams
        ): CompletableFuture<HttpResponseFor<BillingGroupUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BillingGroupUpdateResponse>> =
            update(id, BillingGroupUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /billing_groups`, but is otherwise the same as
         * [BillingGroupServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<BillingGroupListPageAsync>> =
            list(BillingGroupListParams.none())

        /** @see list */
        fun list(
            params: BillingGroupListParams = BillingGroupListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillingGroupListPageAsync>>

        /** @see list */
        fun list(
            params: BillingGroupListParams = BillingGroupListParams.none()
        ): CompletableFuture<HttpResponseFor<BillingGroupListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BillingGroupListPageAsync>> =
            list(BillingGroupListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /billing_groups/{id}`, but is otherwise the same
         * as [BillingGroupServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<BillingGroupDeleteResponse>> =
            delete(id, BillingGroupDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: BillingGroupDeleteParams = BillingGroupDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillingGroupDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: BillingGroupDeleteParams = BillingGroupDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<BillingGroupDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: BillingGroupDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillingGroupDeleteResponse>>

        /** @see delete */
        fun delete(
            params: BillingGroupDeleteParams
        ): CompletableFuture<HttpResponseFor<BillingGroupDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BillingGroupDeleteResponse>> =
            delete(id, BillingGroupDeleteParams.none(), requestOptions)
    }
}
