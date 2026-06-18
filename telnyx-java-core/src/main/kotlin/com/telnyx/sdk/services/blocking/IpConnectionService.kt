// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ipconnections.IpConnectionCreateParams
import com.telnyx.sdk.models.ipconnections.IpConnectionCreateResponse
import com.telnyx.sdk.models.ipconnections.IpConnectionDeleteParams
import com.telnyx.sdk.models.ipconnections.IpConnectionDeleteResponse
import com.telnyx.sdk.models.ipconnections.IpConnectionListPage
import com.telnyx.sdk.models.ipconnections.IpConnectionListParams
import com.telnyx.sdk.models.ipconnections.IpConnectionRetrieveParams
import com.telnyx.sdk.models.ipconnections.IpConnectionRetrieveResponse
import com.telnyx.sdk.models.ipconnections.IpConnectionUpdateParams
import com.telnyx.sdk.models.ipconnections.IpConnectionUpdateResponse
import java.util.function.Consumer

/** IP connection operations */
interface IpConnectionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IpConnectionService

    /** Creates an IP connection. */
    fun create(): IpConnectionCreateResponse = create(IpConnectionCreateParams.none())

    /** @see create */
    fun create(
        params: IpConnectionCreateParams = IpConnectionCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IpConnectionCreateResponse

    /** @see create */
    fun create(
        params: IpConnectionCreateParams = IpConnectionCreateParams.none()
    ): IpConnectionCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): IpConnectionCreateResponse =
        create(IpConnectionCreateParams.none(), requestOptions)

    /** Retrieves the details of an existing ip connection. */
    fun retrieve(id: String): IpConnectionRetrieveResponse =
        retrieve(id, IpConnectionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: IpConnectionRetrieveParams = IpConnectionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IpConnectionRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: IpConnectionRetrieveParams = IpConnectionRetrieveParams.none(),
    ): IpConnectionRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: IpConnectionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IpConnectionRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: IpConnectionRetrieveParams): IpConnectionRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): IpConnectionRetrieveResponse =
        retrieve(id, IpConnectionRetrieveParams.none(), requestOptions)

    /** Updates settings of an existing IP connection. */
    fun update(id: String): IpConnectionUpdateResponse = update(id, IpConnectionUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: IpConnectionUpdateParams = IpConnectionUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IpConnectionUpdateResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: IpConnectionUpdateParams = IpConnectionUpdateParams.none(),
    ): IpConnectionUpdateResponse = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: IpConnectionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IpConnectionUpdateResponse

    /** @see update */
    fun update(params: IpConnectionUpdateParams): IpConnectionUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): IpConnectionUpdateResponse =
        update(id, IpConnectionUpdateParams.none(), requestOptions)

    /** Returns a list of your IP connections. */
    fun list(): IpConnectionListPage = list(IpConnectionListParams.none())

    /** @see list */
    fun list(
        params: IpConnectionListParams = IpConnectionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IpConnectionListPage

    /** @see list */
    fun list(params: IpConnectionListParams = IpConnectionListParams.none()): IpConnectionListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): IpConnectionListPage =
        list(IpConnectionListParams.none(), requestOptions)

    /** Deletes an existing IP connection. */
    fun delete(id: String): IpConnectionDeleteResponse = delete(id, IpConnectionDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: IpConnectionDeleteParams = IpConnectionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IpConnectionDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: IpConnectionDeleteParams = IpConnectionDeleteParams.none(),
    ): IpConnectionDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: IpConnectionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IpConnectionDeleteResponse

    /** @see delete */
    fun delete(params: IpConnectionDeleteParams): IpConnectionDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): IpConnectionDeleteResponse =
        delete(id, IpConnectionDeleteParams.none(), requestOptions)

    /**
     * A view of [IpConnectionService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IpConnectionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ip_connections`, but is otherwise the same as
         * [IpConnectionService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<IpConnectionCreateResponse> =
            create(IpConnectionCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: IpConnectionCreateParams = IpConnectionCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IpConnectionCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            params: IpConnectionCreateParams = IpConnectionCreateParams.none()
        ): HttpResponseFor<IpConnectionCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<IpConnectionCreateResponse> =
            create(IpConnectionCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ip_connections/{id}`, but is otherwise the same as
         * [IpConnectionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<IpConnectionRetrieveResponse> =
            retrieve(id, IpConnectionRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: IpConnectionRetrieveParams = IpConnectionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IpConnectionRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: IpConnectionRetrieveParams = IpConnectionRetrieveParams.none(),
        ): HttpResponseFor<IpConnectionRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: IpConnectionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IpConnectionRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: IpConnectionRetrieveParams
        ): HttpResponseFor<IpConnectionRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IpConnectionRetrieveResponse> =
            retrieve(id, IpConnectionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /ip_connections/{id}`, but is otherwise the same
         * as [IpConnectionService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<IpConnectionUpdateResponse> =
            update(id, IpConnectionUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: IpConnectionUpdateParams = IpConnectionUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IpConnectionUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: IpConnectionUpdateParams = IpConnectionUpdateParams.none(),
        ): HttpResponseFor<IpConnectionUpdateResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: IpConnectionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IpConnectionUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: IpConnectionUpdateParams): HttpResponseFor<IpConnectionUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IpConnectionUpdateResponse> =
            update(id, IpConnectionUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ip_connections`, but is otherwise the same as
         * [IpConnectionService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<IpConnectionListPage> = list(IpConnectionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: IpConnectionListParams = IpConnectionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IpConnectionListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: IpConnectionListParams = IpConnectionListParams.none()
        ): HttpResponseFor<IpConnectionListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<IpConnectionListPage> =
            list(IpConnectionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /ip_connections/{id}`, but is otherwise the same
         * as [IpConnectionService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<IpConnectionDeleteResponse> =
            delete(id, IpConnectionDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: IpConnectionDeleteParams = IpConnectionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IpConnectionDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: IpConnectionDeleteParams = IpConnectionDeleteParams.none(),
        ): HttpResponseFor<IpConnectionDeleteResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: IpConnectionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IpConnectionDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: IpConnectionDeleteParams): HttpResponseFor<IpConnectionDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IpConnectionDeleteResponse> =
            delete(id, IpConnectionDeleteParams.none(), requestOptions)
    }
}
