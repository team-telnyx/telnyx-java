// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.billinggroups.BillingGroupCreateParams
import com.telnyx.api.models.billinggroups.BillingGroupCreateResponse
import com.telnyx.api.models.billinggroups.BillingGroupDeleteParams
import com.telnyx.api.models.billinggroups.BillingGroupDeleteResponse
import com.telnyx.api.models.billinggroups.BillingGroupListParams
import com.telnyx.api.models.billinggroups.BillingGroupListResponse
import com.telnyx.api.models.billinggroups.BillingGroupRetrieveParams
import com.telnyx.api.models.billinggroups.BillingGroupRetrieveResponse
import com.telnyx.api.models.billinggroups.BillingGroupUpdateParams
import com.telnyx.api.models.billinggroups.BillingGroupUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

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
    fun list(): CompletableFuture<BillingGroupListResponse> = list(BillingGroupListParams.none())

    /** @see list */
    fun list(
        params: BillingGroupListParams = BillingGroupListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillingGroupListResponse>

    /** @see list */
    fun list(
        params: BillingGroupListParams = BillingGroupListParams.none()
    ): CompletableFuture<BillingGroupListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<BillingGroupListResponse> =
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
        fun list(): CompletableFuture<HttpResponseFor<BillingGroupListResponse>> =
            list(BillingGroupListParams.none())

        /** @see list */
        fun list(
            params: BillingGroupListParams = BillingGroupListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillingGroupListResponse>>

        /** @see list */
        fun list(
            params: BillingGroupListParams = BillingGroupListParams.none()
        ): CompletableFuture<HttpResponseFor<BillingGroupListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BillingGroupListResponse>> =
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
