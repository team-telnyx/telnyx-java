// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.alphanumericsenderids.AlphanumericSenderIdCreateParams
import com.telnyx.sdk.models.alphanumericsenderids.AlphanumericSenderIdCreateResponse
import com.telnyx.sdk.models.alphanumericsenderids.AlphanumericSenderIdDeleteParams
import com.telnyx.sdk.models.alphanumericsenderids.AlphanumericSenderIdDeleteResponse
import com.telnyx.sdk.models.alphanumericsenderids.AlphanumericSenderIdListPage
import com.telnyx.sdk.models.alphanumericsenderids.AlphanumericSenderIdListParams
import com.telnyx.sdk.models.alphanumericsenderids.AlphanumericSenderIdRetrieveParams
import com.telnyx.sdk.models.alphanumericsenderids.AlphanumericSenderIdRetrieveResponse
import java.util.function.Consumer

interface AlphanumericSenderIdService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AlphanumericSenderIdService

    /** Create a new alphanumeric sender ID associated with a messaging profile. */
    fun create(params: AlphanumericSenderIdCreateParams): AlphanumericSenderIdCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AlphanumericSenderIdCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AlphanumericSenderIdCreateResponse

    /** Retrieve a specific alphanumeric sender ID. */
    fun retrieve(id: String): AlphanumericSenderIdRetrieveResponse =
        retrieve(id, AlphanumericSenderIdRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AlphanumericSenderIdRetrieveParams = AlphanumericSenderIdRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AlphanumericSenderIdRetrieveResponse =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AlphanumericSenderIdRetrieveParams = AlphanumericSenderIdRetrieveParams.none(),
    ): AlphanumericSenderIdRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AlphanumericSenderIdRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AlphanumericSenderIdRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: AlphanumericSenderIdRetrieveParams): AlphanumericSenderIdRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): AlphanumericSenderIdRetrieveResponse =
        retrieve(id, AlphanumericSenderIdRetrieveParams.none(), requestOptions)

    /** List all alphanumeric sender IDs for the authenticated user. */
    fun list(): AlphanumericSenderIdListPage = list(AlphanumericSenderIdListParams.none())

    /** @see list */
    fun list(
        params: AlphanumericSenderIdListParams = AlphanumericSenderIdListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AlphanumericSenderIdListPage

    /** @see list */
    fun list(
        params: AlphanumericSenderIdListParams = AlphanumericSenderIdListParams.none()
    ): AlphanumericSenderIdListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): AlphanumericSenderIdListPage =
        list(AlphanumericSenderIdListParams.none(), requestOptions)

    /** Delete an alphanumeric sender ID and disassociate it from its messaging profile. */
    fun delete(id: String): AlphanumericSenderIdDeleteResponse =
        delete(id, AlphanumericSenderIdDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: AlphanumericSenderIdDeleteParams = AlphanumericSenderIdDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AlphanumericSenderIdDeleteResponse =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: AlphanumericSenderIdDeleteParams = AlphanumericSenderIdDeleteParams.none(),
    ): AlphanumericSenderIdDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AlphanumericSenderIdDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AlphanumericSenderIdDeleteResponse

    /** @see delete */
    fun delete(params: AlphanumericSenderIdDeleteParams): AlphanumericSenderIdDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): AlphanumericSenderIdDeleteResponse =
        delete(id, AlphanumericSenderIdDeleteParams.none(), requestOptions)

    /**
     * A view of [AlphanumericSenderIdService] that provides access to raw HTTP responses for each
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
        ): AlphanumericSenderIdService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /alphanumeric_sender_ids`, but is otherwise the
         * same as [AlphanumericSenderIdService.create].
         */
        @MustBeClosed
        fun create(
            params: AlphanumericSenderIdCreateParams
        ): HttpResponseFor<AlphanumericSenderIdCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: AlphanumericSenderIdCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AlphanumericSenderIdCreateResponse>

        /**
         * Returns a raw HTTP response for `get /alphanumeric_sender_ids/{id}`, but is otherwise the
         * same as [AlphanumericSenderIdService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<AlphanumericSenderIdRetrieveResponse> =
            retrieve(id, AlphanumericSenderIdRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: AlphanumericSenderIdRetrieveParams = AlphanumericSenderIdRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AlphanumericSenderIdRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: AlphanumericSenderIdRetrieveParams = AlphanumericSenderIdRetrieveParams.none(),
        ): HttpResponseFor<AlphanumericSenderIdRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AlphanumericSenderIdRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AlphanumericSenderIdRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AlphanumericSenderIdRetrieveParams
        ): HttpResponseFor<AlphanumericSenderIdRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AlphanumericSenderIdRetrieveResponse> =
            retrieve(id, AlphanumericSenderIdRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /alphanumeric_sender_ids`, but is otherwise the same
         * as [AlphanumericSenderIdService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<AlphanumericSenderIdListPage> =
            list(AlphanumericSenderIdListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AlphanumericSenderIdListParams = AlphanumericSenderIdListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AlphanumericSenderIdListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: AlphanumericSenderIdListParams = AlphanumericSenderIdListParams.none()
        ): HttpResponseFor<AlphanumericSenderIdListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AlphanumericSenderIdListPage> =
            list(AlphanumericSenderIdListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /alphanumeric_sender_ids/{id}`, but is otherwise
         * the same as [AlphanumericSenderIdService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<AlphanumericSenderIdDeleteResponse> =
            delete(id, AlphanumericSenderIdDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: AlphanumericSenderIdDeleteParams = AlphanumericSenderIdDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AlphanumericSenderIdDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: AlphanumericSenderIdDeleteParams = AlphanumericSenderIdDeleteParams.none(),
        ): HttpResponseFor<AlphanumericSenderIdDeleteResponse> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: AlphanumericSenderIdDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AlphanumericSenderIdDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: AlphanumericSenderIdDeleteParams
        ): HttpResponseFor<AlphanumericSenderIdDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AlphanumericSenderIdDeleteResponse> =
            delete(id, AlphanumericSenderIdDeleteParams.none(), requestOptions)
    }
}
