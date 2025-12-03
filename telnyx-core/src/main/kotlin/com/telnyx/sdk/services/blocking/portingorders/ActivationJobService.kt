// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.portingorders

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.portingorders.activationjobs.ActivationJobListPage
import com.telnyx.sdk.models.portingorders.activationjobs.ActivationJobListParams
import com.telnyx.sdk.models.portingorders.activationjobs.ActivationJobRetrieveParams
import com.telnyx.sdk.models.portingorders.activationjobs.ActivationJobRetrieveResponse
import com.telnyx.sdk.models.portingorders.activationjobs.ActivationJobUpdateParams
import com.telnyx.sdk.models.portingorders.activationjobs.ActivationJobUpdateResponse
import java.util.function.Consumer

interface ActivationJobService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActivationJobService

    /** Returns a porting activation job. */
    fun retrieve(
        activationJobId: String,
        params: ActivationJobRetrieveParams,
    ): ActivationJobRetrieveResponse = retrieve(activationJobId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        activationJobId: String,
        params: ActivationJobRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActivationJobRetrieveResponse =
        retrieve(params.toBuilder().activationJobId(activationJobId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: ActivationJobRetrieveParams): ActivationJobRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ActivationJobRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActivationJobRetrieveResponse

    /** Updates the activation time of a porting activation job. */
    fun update(
        activationJobId: String,
        params: ActivationJobUpdateParams,
    ): ActivationJobUpdateResponse = update(activationJobId, params, RequestOptions.none())

    /** @see update */
    fun update(
        activationJobId: String,
        params: ActivationJobUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActivationJobUpdateResponse =
        update(params.toBuilder().activationJobId(activationJobId).build(), requestOptions)

    /** @see update */
    fun update(params: ActivationJobUpdateParams): ActivationJobUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ActivationJobUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActivationJobUpdateResponse

    /** Returns a list of your porting activation jobs. */
    fun list(id: String): ActivationJobListPage = list(id, ActivationJobListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: ActivationJobListParams = ActivationJobListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActivationJobListPage = list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        id: String,
        params: ActivationJobListParams = ActivationJobListParams.none(),
    ): ActivationJobListPage = list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ActivationJobListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActivationJobListPage

    /** @see list */
    fun list(params: ActivationJobListParams): ActivationJobListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions): ActivationJobListPage =
        list(id, ActivationJobListParams.none(), requestOptions)

    /**
     * A view of [ActivationJobService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ActivationJobService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /porting_orders/{id}/activation_jobs/{activationJobId}`, but is otherwise the same as
         * [ActivationJobService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            activationJobId: String,
            params: ActivationJobRetrieveParams,
        ): HttpResponseFor<ActivationJobRetrieveResponse> =
            retrieve(activationJobId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            activationJobId: String,
            params: ActivationJobRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActivationJobRetrieveResponse> =
            retrieve(params.toBuilder().activationJobId(activationJobId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ActivationJobRetrieveParams
        ): HttpResponseFor<ActivationJobRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ActivationJobRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActivationJobRetrieveResponse>

        /**
         * Returns a raw HTTP response for `patch
         * /porting_orders/{id}/activation_jobs/{activationJobId}`, but is otherwise the same as
         * [ActivationJobService.update].
         */
        @MustBeClosed
        fun update(
            activationJobId: String,
            params: ActivationJobUpdateParams,
        ): HttpResponseFor<ActivationJobUpdateResponse> =
            update(activationJobId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            activationJobId: String,
            params: ActivationJobUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActivationJobUpdateResponse> =
            update(params.toBuilder().activationJobId(activationJobId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: ActivationJobUpdateParams
        ): HttpResponseFor<ActivationJobUpdateResponse> = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ActivationJobUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActivationJobUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /porting_orders/{id}/activation_jobs`, but is
         * otherwise the same as [ActivationJobService.list].
         */
        @MustBeClosed
        fun list(id: String): HttpResponseFor<ActivationJobListPage> =
            list(id, ActivationJobListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: ActivationJobListParams = ActivationJobListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActivationJobListPage> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: ActivationJobListParams = ActivationJobListParams.none(),
        ): HttpResponseFor<ActivationJobListPage> = list(id, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ActivationJobListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActivationJobListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: ActivationJobListParams): HttpResponseFor<ActivationJobListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActivationJobListPage> =
            list(id, ActivationJobListParams.none(), requestOptions)
    }
}
