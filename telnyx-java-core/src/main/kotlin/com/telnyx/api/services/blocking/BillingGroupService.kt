// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

interface BillingGroupService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BillingGroupService

    /** Create a billing group */
    fun create(): BillingGroupCreateResponse = create(BillingGroupCreateParams.none())

    /** @see create */
    fun create(
        params: BillingGroupCreateParams = BillingGroupCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillingGroupCreateResponse

    /** @see create */
    fun create(
        params: BillingGroupCreateParams = BillingGroupCreateParams.none()
    ): BillingGroupCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): BillingGroupCreateResponse =
        create(BillingGroupCreateParams.none(), requestOptions)

    /** Get a billing group */
    fun retrieve(id: String): BillingGroupRetrieveResponse =
        retrieve(id, BillingGroupRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: BillingGroupRetrieveParams = BillingGroupRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillingGroupRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: BillingGroupRetrieveParams = BillingGroupRetrieveParams.none(),
    ): BillingGroupRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BillingGroupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillingGroupRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: BillingGroupRetrieveParams): BillingGroupRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): BillingGroupRetrieveResponse =
        retrieve(id, BillingGroupRetrieveParams.none(), requestOptions)

    /** Update a billing group */
    fun update(id: String): BillingGroupUpdateResponse = update(id, BillingGroupUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: BillingGroupUpdateParams = BillingGroupUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillingGroupUpdateResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: BillingGroupUpdateParams = BillingGroupUpdateParams.none(),
    ): BillingGroupUpdateResponse = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: BillingGroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillingGroupUpdateResponse

    /** @see update */
    fun update(params: BillingGroupUpdateParams): BillingGroupUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): BillingGroupUpdateResponse =
        update(id, BillingGroupUpdateParams.none(), requestOptions)

    /** List all billing groups */
    fun list(): BillingGroupListResponse = list(BillingGroupListParams.none())

    /** @see list */
    fun list(
        params: BillingGroupListParams = BillingGroupListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillingGroupListResponse

    /** @see list */
    fun list(
        params: BillingGroupListParams = BillingGroupListParams.none()
    ): BillingGroupListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): BillingGroupListResponse =
        list(BillingGroupListParams.none(), requestOptions)

    /** Delete a billing group */
    fun delete(id: String): BillingGroupDeleteResponse = delete(id, BillingGroupDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: BillingGroupDeleteParams = BillingGroupDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillingGroupDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: BillingGroupDeleteParams = BillingGroupDeleteParams.none(),
    ): BillingGroupDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: BillingGroupDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillingGroupDeleteResponse

    /** @see delete */
    fun delete(params: BillingGroupDeleteParams): BillingGroupDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): BillingGroupDeleteResponse =
        delete(id, BillingGroupDeleteParams.none(), requestOptions)

    /**
     * A view of [BillingGroupService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BillingGroupService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /billing_groups`, but is otherwise the same as
         * [BillingGroupService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<BillingGroupCreateResponse> =
            create(BillingGroupCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: BillingGroupCreateParams = BillingGroupCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillingGroupCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            params: BillingGroupCreateParams = BillingGroupCreateParams.none()
        ): HttpResponseFor<BillingGroupCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<BillingGroupCreateResponse> =
            create(BillingGroupCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /billing_groups/{id}`, but is otherwise the same as
         * [BillingGroupService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<BillingGroupRetrieveResponse> =
            retrieve(id, BillingGroupRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: BillingGroupRetrieveParams = BillingGroupRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillingGroupRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: BillingGroupRetrieveParams = BillingGroupRetrieveParams.none(),
        ): HttpResponseFor<BillingGroupRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BillingGroupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillingGroupRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BillingGroupRetrieveParams
        ): HttpResponseFor<BillingGroupRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillingGroupRetrieveResponse> =
            retrieve(id, BillingGroupRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /billing_groups/{id}`, but is otherwise the same
         * as [BillingGroupService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<BillingGroupUpdateResponse> =
            update(id, BillingGroupUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: BillingGroupUpdateParams = BillingGroupUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillingGroupUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: BillingGroupUpdateParams = BillingGroupUpdateParams.none(),
        ): HttpResponseFor<BillingGroupUpdateResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: BillingGroupUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillingGroupUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: BillingGroupUpdateParams): HttpResponseFor<BillingGroupUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillingGroupUpdateResponse> =
            update(id, BillingGroupUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /billing_groups`, but is otherwise the same as
         * [BillingGroupService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<BillingGroupListResponse> = list(BillingGroupListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: BillingGroupListParams = BillingGroupListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillingGroupListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: BillingGroupListParams = BillingGroupListParams.none()
        ): HttpResponseFor<BillingGroupListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<BillingGroupListResponse> =
            list(BillingGroupListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /billing_groups/{id}`, but is otherwise the same
         * as [BillingGroupService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<BillingGroupDeleteResponse> =
            delete(id, BillingGroupDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: BillingGroupDeleteParams = BillingGroupDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillingGroupDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: BillingGroupDeleteParams = BillingGroupDeleteParams.none(),
        ): HttpResponseFor<BillingGroupDeleteResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: BillingGroupDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillingGroupDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: BillingGroupDeleteParams): HttpResponseFor<BillingGroupDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillingGroupDeleteResponse> =
            delete(id, BillingGroupDeleteParams.none(), requestOptions)
    }
}
