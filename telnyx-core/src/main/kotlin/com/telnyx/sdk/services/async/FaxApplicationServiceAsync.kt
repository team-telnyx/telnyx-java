// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.faxapplications.FaxApplicationCreateParams
import com.telnyx.sdk.models.faxapplications.FaxApplicationCreateResponse
import com.telnyx.sdk.models.faxapplications.FaxApplicationDeleteParams
import com.telnyx.sdk.models.faxapplications.FaxApplicationDeleteResponse
import com.telnyx.sdk.models.faxapplications.FaxApplicationListParams
import com.telnyx.sdk.models.faxapplications.FaxApplicationListResponse
import com.telnyx.sdk.models.faxapplications.FaxApplicationRetrieveParams
import com.telnyx.sdk.models.faxapplications.FaxApplicationRetrieveResponse
import com.telnyx.sdk.models.faxapplications.FaxApplicationUpdateParams
import com.telnyx.sdk.models.faxapplications.FaxApplicationUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface FaxApplicationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FaxApplicationServiceAsync

    /**
     * Creates a new Fax Application based on the parameters sent in the request. The application
     * name and webhook URL are required. Once created, you can assign phone numbers to your
     * application using the `/phone_numbers` endpoint.
     */
    fun create(
        params: FaxApplicationCreateParams
    ): CompletableFuture<FaxApplicationCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: FaxApplicationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FaxApplicationCreateResponse>

    /**
     * Return the details of an existing Fax Application inside the 'data' attribute of the
     * response.
     */
    fun retrieve(id: String): CompletableFuture<FaxApplicationRetrieveResponse> =
        retrieve(id, FaxApplicationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: FaxApplicationRetrieveParams = FaxApplicationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FaxApplicationRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: FaxApplicationRetrieveParams = FaxApplicationRetrieveParams.none(),
    ): CompletableFuture<FaxApplicationRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: FaxApplicationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FaxApplicationRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: FaxApplicationRetrieveParams
    ): CompletableFuture<FaxApplicationRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FaxApplicationRetrieveResponse> =
        retrieve(id, FaxApplicationRetrieveParams.none(), requestOptions)

    /** Updates settings of an existing Fax Application based on the parameters of the request. */
    fun update(
        id: String,
        params: FaxApplicationUpdateParams,
    ): CompletableFuture<FaxApplicationUpdateResponse> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: FaxApplicationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FaxApplicationUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        params: FaxApplicationUpdateParams
    ): CompletableFuture<FaxApplicationUpdateResponse> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: FaxApplicationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FaxApplicationUpdateResponse>

    /**
     * This endpoint returns a list of your Fax Applications inside the 'data' attribute of the
     * response. You can adjust which applications are listed by using filters. Fax Applications are
     * used to configure how you send and receive faxes using the Programmable Fax API with Telnyx.
     */
    fun list(): CompletableFuture<FaxApplicationListResponse> =
        list(FaxApplicationListParams.none())

    /** @see list */
    fun list(
        params: FaxApplicationListParams = FaxApplicationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FaxApplicationListResponse>

    /** @see list */
    fun list(
        params: FaxApplicationListParams = FaxApplicationListParams.none()
    ): CompletableFuture<FaxApplicationListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<FaxApplicationListResponse> =
        list(FaxApplicationListParams.none(), requestOptions)

    /**
     * Permanently deletes a Fax Application. Deletion may be prevented if the application is in use
     * by phone numbers.
     */
    fun delete(id: String): CompletableFuture<FaxApplicationDeleteResponse> =
        delete(id, FaxApplicationDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: FaxApplicationDeleteParams = FaxApplicationDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FaxApplicationDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: FaxApplicationDeleteParams = FaxApplicationDeleteParams.none(),
    ): CompletableFuture<FaxApplicationDeleteResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: FaxApplicationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FaxApplicationDeleteResponse>

    /** @see delete */
    fun delete(
        params: FaxApplicationDeleteParams
    ): CompletableFuture<FaxApplicationDeleteResponse> = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FaxApplicationDeleteResponse> =
        delete(id, FaxApplicationDeleteParams.none(), requestOptions)

    /**
     * A view of [FaxApplicationServiceAsync] that provides access to raw HTTP responses for each
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
        ): FaxApplicationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /fax_applications`, but is otherwise the same as
         * [FaxApplicationServiceAsync.create].
         */
        fun create(
            params: FaxApplicationCreateParams
        ): CompletableFuture<HttpResponseFor<FaxApplicationCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: FaxApplicationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FaxApplicationCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /fax_applications/{id}`, but is otherwise the same
         * as [FaxApplicationServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<FaxApplicationRetrieveResponse>> =
            retrieve(id, FaxApplicationRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: FaxApplicationRetrieveParams = FaxApplicationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FaxApplicationRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: FaxApplicationRetrieveParams = FaxApplicationRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<FaxApplicationRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: FaxApplicationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FaxApplicationRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: FaxApplicationRetrieveParams
        ): CompletableFuture<HttpResponseFor<FaxApplicationRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FaxApplicationRetrieveResponse>> =
            retrieve(id, FaxApplicationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /fax_applications/{id}`, but is otherwise the same
         * as [FaxApplicationServiceAsync.update].
         */
        fun update(
            id: String,
            params: FaxApplicationUpdateParams,
        ): CompletableFuture<HttpResponseFor<FaxApplicationUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: FaxApplicationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FaxApplicationUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            params: FaxApplicationUpdateParams
        ): CompletableFuture<HttpResponseFor<FaxApplicationUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: FaxApplicationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FaxApplicationUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /fax_applications`, but is otherwise the same as
         * [FaxApplicationServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<FaxApplicationListResponse>> =
            list(FaxApplicationListParams.none())

        /** @see list */
        fun list(
            params: FaxApplicationListParams = FaxApplicationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FaxApplicationListResponse>>

        /** @see list */
        fun list(
            params: FaxApplicationListParams = FaxApplicationListParams.none()
        ): CompletableFuture<HttpResponseFor<FaxApplicationListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<FaxApplicationListResponse>> =
            list(FaxApplicationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /fax_applications/{id}`, but is otherwise the
         * same as [FaxApplicationServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<FaxApplicationDeleteResponse>> =
            delete(id, FaxApplicationDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: FaxApplicationDeleteParams = FaxApplicationDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FaxApplicationDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: FaxApplicationDeleteParams = FaxApplicationDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<FaxApplicationDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: FaxApplicationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FaxApplicationDeleteResponse>>

        /** @see delete */
        fun delete(
            params: FaxApplicationDeleteParams
        ): CompletableFuture<HttpResponseFor<FaxApplicationDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FaxApplicationDeleteResponse>> =
            delete(id, FaxApplicationDeleteParams.none(), requestOptions)
    }
}
