// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

interface FaxApplicationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FaxApplicationService

    /**
     * Creates a new Fax Application based on the parameters sent in the request. The application
     * name and webhook URL are required. Once created, you can assign phone numbers to your
     * application using the `/phone_numbers` endpoint.
     */
    fun create(params: FaxApplicationCreateParams): FaxApplicationCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: FaxApplicationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FaxApplicationCreateResponse

    /**
     * Return the details of an existing Fax Application inside the 'data' attribute of the
     * response.
     */
    fun retrieve(id: String): FaxApplicationRetrieveResponse =
        retrieve(id, FaxApplicationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: FaxApplicationRetrieveParams = FaxApplicationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FaxApplicationRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: FaxApplicationRetrieveParams = FaxApplicationRetrieveParams.none(),
    ): FaxApplicationRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: FaxApplicationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FaxApplicationRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: FaxApplicationRetrieveParams): FaxApplicationRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): FaxApplicationRetrieveResponse =
        retrieve(id, FaxApplicationRetrieveParams.none(), requestOptions)

    /** Updates settings of an existing Fax Application based on the parameters of the request. */
    fun update(id: String, params: FaxApplicationUpdateParams): FaxApplicationUpdateResponse =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: FaxApplicationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FaxApplicationUpdateResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: FaxApplicationUpdateParams): FaxApplicationUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: FaxApplicationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FaxApplicationUpdateResponse

    /**
     * This endpoint returns a list of your Fax Applications inside the 'data' attribute of the
     * response. You can adjust which applications are listed by using filters. Fax Applications are
     * used to configure how you send and receive faxes using the Programmable Fax API with Telnyx.
     */
    fun list(): FaxApplicationListResponse = list(FaxApplicationListParams.none())

    /** @see list */
    fun list(
        params: FaxApplicationListParams = FaxApplicationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FaxApplicationListResponse

    /** @see list */
    fun list(
        params: FaxApplicationListParams = FaxApplicationListParams.none()
    ): FaxApplicationListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): FaxApplicationListResponse =
        list(FaxApplicationListParams.none(), requestOptions)

    /**
     * Permanently deletes a Fax Application. Deletion may be prevented if the application is in use
     * by phone numbers.
     */
    fun delete(id: String): FaxApplicationDeleteResponse =
        delete(id, FaxApplicationDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: FaxApplicationDeleteParams = FaxApplicationDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FaxApplicationDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: FaxApplicationDeleteParams = FaxApplicationDeleteParams.none(),
    ): FaxApplicationDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: FaxApplicationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FaxApplicationDeleteResponse

    /** @see delete */
    fun delete(params: FaxApplicationDeleteParams): FaxApplicationDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): FaxApplicationDeleteResponse =
        delete(id, FaxApplicationDeleteParams.none(), requestOptions)

    /**
     * A view of [FaxApplicationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FaxApplicationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /fax_applications`, but is otherwise the same as
         * [FaxApplicationService.create].
         */
        @MustBeClosed
        fun create(
            params: FaxApplicationCreateParams
        ): HttpResponseFor<FaxApplicationCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: FaxApplicationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FaxApplicationCreateResponse>

        /**
         * Returns a raw HTTP response for `get /fax_applications/{id}`, but is otherwise the same
         * as [FaxApplicationService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<FaxApplicationRetrieveResponse> =
            retrieve(id, FaxApplicationRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: FaxApplicationRetrieveParams = FaxApplicationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FaxApplicationRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: FaxApplicationRetrieveParams = FaxApplicationRetrieveParams.none(),
        ): HttpResponseFor<FaxApplicationRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: FaxApplicationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FaxApplicationRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: FaxApplicationRetrieveParams
        ): HttpResponseFor<FaxApplicationRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FaxApplicationRetrieveResponse> =
            retrieve(id, FaxApplicationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /fax_applications/{id}`, but is otherwise the same
         * as [FaxApplicationService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: FaxApplicationUpdateParams,
        ): HttpResponseFor<FaxApplicationUpdateResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: FaxApplicationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FaxApplicationUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: FaxApplicationUpdateParams
        ): HttpResponseFor<FaxApplicationUpdateResponse> = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: FaxApplicationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FaxApplicationUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /fax_applications`, but is otherwise the same as
         * [FaxApplicationService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<FaxApplicationListResponse> =
            list(FaxApplicationListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: FaxApplicationListParams = FaxApplicationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FaxApplicationListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: FaxApplicationListParams = FaxApplicationListParams.none()
        ): HttpResponseFor<FaxApplicationListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<FaxApplicationListResponse> =
            list(FaxApplicationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /fax_applications/{id}`, but is otherwise the
         * same as [FaxApplicationService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<FaxApplicationDeleteResponse> =
            delete(id, FaxApplicationDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: FaxApplicationDeleteParams = FaxApplicationDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FaxApplicationDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: FaxApplicationDeleteParams = FaxApplicationDeleteParams.none(),
        ): HttpResponseFor<FaxApplicationDeleteResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: FaxApplicationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FaxApplicationDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: FaxApplicationDeleteParams
        ): HttpResponseFor<FaxApplicationDeleteResponse> = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FaxApplicationDeleteResponse> =
            delete(id, FaxApplicationDeleteParams.none(), requestOptions)
    }
}
