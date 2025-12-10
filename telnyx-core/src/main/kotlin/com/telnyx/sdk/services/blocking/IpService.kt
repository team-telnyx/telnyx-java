// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ips.IpCreateParams
import com.telnyx.sdk.models.ips.IpCreateResponse
import com.telnyx.sdk.models.ips.IpDeleteParams
import com.telnyx.sdk.models.ips.IpDeleteResponse
import com.telnyx.sdk.models.ips.IpListPage
import com.telnyx.sdk.models.ips.IpListParams
import com.telnyx.sdk.models.ips.IpRetrieveParams
import com.telnyx.sdk.models.ips.IpRetrieveResponse
import com.telnyx.sdk.models.ips.IpUpdateParams
import com.telnyx.sdk.models.ips.IpUpdateResponse
import java.util.function.Consumer

interface IpService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IpService

    /** Create a new IP object. */
    fun create(params: IpCreateParams): IpCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: IpCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IpCreateResponse

    /** Return the details regarding a specific IP. */
    fun retrieve(id: String): IpRetrieveResponse = retrieve(id, IpRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: IpRetrieveParams = IpRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IpRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: IpRetrieveParams = IpRetrieveParams.none(),
    ): IpRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: IpRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IpRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: IpRetrieveParams): IpRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): IpRetrieveResponse =
        retrieve(id, IpRetrieveParams.none(), requestOptions)

    /** Update the details of a specific IP. */
    fun update(id: String, params: IpUpdateParams): IpUpdateResponse =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: IpUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IpUpdateResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: IpUpdateParams): IpUpdateResponse = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: IpUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IpUpdateResponse

    /** Get all IPs belonging to the user that match the given filters. */
    fun list(): IpListPage = list(IpListParams.none())

    /** @see list */
    fun list(
        params: IpListParams = IpListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IpListPage

    /** @see list */
    fun list(params: IpListParams = IpListParams.none()): IpListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): IpListPage = list(IpListParams.none(), requestOptions)

    /** Delete an IP. */
    fun delete(id: String): IpDeleteResponse = delete(id, IpDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: IpDeleteParams = IpDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IpDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: IpDeleteParams = IpDeleteParams.none()): IpDeleteResponse =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: IpDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IpDeleteResponse

    /** @see delete */
    fun delete(params: IpDeleteParams): IpDeleteResponse = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): IpDeleteResponse =
        delete(id, IpDeleteParams.none(), requestOptions)

    /** A view of [IpService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): IpService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ips`, but is otherwise the same as
         * [IpService.create].
         */
        @MustBeClosed
        fun create(params: IpCreateParams): HttpResponseFor<IpCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: IpCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IpCreateResponse>

        /**
         * Returns a raw HTTP response for `get /ips/{id}`, but is otherwise the same as
         * [IpService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<IpRetrieveResponse> =
            retrieve(id, IpRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: IpRetrieveParams = IpRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IpRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: IpRetrieveParams = IpRetrieveParams.none(),
        ): HttpResponseFor<IpRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: IpRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IpRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: IpRetrieveParams): HttpResponseFor<IpRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IpRetrieveResponse> =
            retrieve(id, IpRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /ips/{id}`, but is otherwise the same as
         * [IpService.update].
         */
        @MustBeClosed
        fun update(id: String, params: IpUpdateParams): HttpResponseFor<IpUpdateResponse> =
            update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: IpUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IpUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: IpUpdateParams): HttpResponseFor<IpUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: IpUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IpUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /ips`, but is otherwise the same as
         * [IpService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<IpListPage> = list(IpListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: IpListParams = IpListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IpListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: IpListParams = IpListParams.none()): HttpResponseFor<IpListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<IpListPage> =
            list(IpListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /ips/{id}`, but is otherwise the same as
         * [IpService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<IpDeleteResponse> =
            delete(id, IpDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: IpDeleteParams = IpDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IpDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: IpDeleteParams = IpDeleteParams.none(),
        ): HttpResponseFor<IpDeleteResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: IpDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IpDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: IpDeleteParams): HttpResponseFor<IpDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponseFor<IpDeleteResponse> =
            delete(id, IpDeleteParams.none(), requestOptions)
    }
}
