// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.messaginghostednumbers.MessagingHostedNumberDeleteParams
import com.telnyx.sdk.models.messaginghostednumbers.MessagingHostedNumberDeleteResponse
import com.telnyx.sdk.models.messaginghostednumbers.MessagingHostedNumberListPage
import com.telnyx.sdk.models.messaginghostednumbers.MessagingHostedNumberListParams
import com.telnyx.sdk.models.messaginghostednumbers.MessagingHostedNumberRetrieveParams
import com.telnyx.sdk.models.messaginghostednumbers.MessagingHostedNumberRetrieveResponse
import com.telnyx.sdk.models.messaginghostednumbers.MessagingHostedNumberUpdateParams
import com.telnyx.sdk.models.messaginghostednumbers.MessagingHostedNumberUpdateResponse
import java.util.function.Consumer

interface MessagingHostedNumberService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessagingHostedNumberService

    /** Retrieve a specific messaging hosted number by its ID or phone number. */
    fun retrieve(id: String): MessagingHostedNumberRetrieveResponse =
        retrieve(id, MessagingHostedNumberRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MessagingHostedNumberRetrieveParams = MessagingHostedNumberRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingHostedNumberRetrieveResponse =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MessagingHostedNumberRetrieveParams = MessagingHostedNumberRetrieveParams.none(),
    ): MessagingHostedNumberRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MessagingHostedNumberRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingHostedNumberRetrieveResponse

    /** @see retrieve */
    fun retrieve(
        params: MessagingHostedNumberRetrieveParams
    ): MessagingHostedNumberRetrieveResponse = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): MessagingHostedNumberRetrieveResponse =
        retrieve(id, MessagingHostedNumberRetrieveParams.none(), requestOptions)

    /** Update the messaging settings for a hosted number. */
    fun update(id: String): MessagingHostedNumberUpdateResponse =
        update(id, MessagingHostedNumberUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: MessagingHostedNumberUpdateParams = MessagingHostedNumberUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingHostedNumberUpdateResponse =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: MessagingHostedNumberUpdateParams = MessagingHostedNumberUpdateParams.none(),
    ): MessagingHostedNumberUpdateResponse = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: MessagingHostedNumberUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingHostedNumberUpdateResponse

    /** @see update */
    fun update(params: MessagingHostedNumberUpdateParams): MessagingHostedNumberUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): MessagingHostedNumberUpdateResponse =
        update(id, MessagingHostedNumberUpdateParams.none(), requestOptions)

    /** List all hosted numbers associated with the authenticated user. */
    fun list(): MessagingHostedNumberListPage = list(MessagingHostedNumberListParams.none())

    /** @see list */
    fun list(
        params: MessagingHostedNumberListParams = MessagingHostedNumberListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingHostedNumberListPage

    /** @see list */
    fun list(
        params: MessagingHostedNumberListParams = MessagingHostedNumberListParams.none()
    ): MessagingHostedNumberListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): MessagingHostedNumberListPage =
        list(MessagingHostedNumberListParams.none(), requestOptions)

    /** Delete a messaging hosted number */
    fun delete(id: String): MessagingHostedNumberDeleteResponse =
        delete(id, MessagingHostedNumberDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: MessagingHostedNumberDeleteParams = MessagingHostedNumberDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingHostedNumberDeleteResponse =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: MessagingHostedNumberDeleteParams = MessagingHostedNumberDeleteParams.none(),
    ): MessagingHostedNumberDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: MessagingHostedNumberDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingHostedNumberDeleteResponse

    /** @see delete */
    fun delete(params: MessagingHostedNumberDeleteParams): MessagingHostedNumberDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): MessagingHostedNumberDeleteResponse =
        delete(id, MessagingHostedNumberDeleteParams.none(), requestOptions)

    /**
     * A view of [MessagingHostedNumberService] that provides access to raw HTTP responses for each
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
        ): MessagingHostedNumberService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /messaging_hosted_numbers/{id}`, but is otherwise
         * the same as [MessagingHostedNumberService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<MessagingHostedNumberRetrieveResponse> =
            retrieve(id, MessagingHostedNumberRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: MessagingHostedNumberRetrieveParams =
                MessagingHostedNumberRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingHostedNumberRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: MessagingHostedNumberRetrieveParams = MessagingHostedNumberRetrieveParams.none(),
        ): HttpResponseFor<MessagingHostedNumberRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: MessagingHostedNumberRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingHostedNumberRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: MessagingHostedNumberRetrieveParams
        ): HttpResponseFor<MessagingHostedNumberRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessagingHostedNumberRetrieveResponse> =
            retrieve(id, MessagingHostedNumberRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /messaging_hosted_numbers/{id}`, but is otherwise
         * the same as [MessagingHostedNumberService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<MessagingHostedNumberUpdateResponse> =
            update(id, MessagingHostedNumberUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: MessagingHostedNumberUpdateParams = MessagingHostedNumberUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingHostedNumberUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: MessagingHostedNumberUpdateParams = MessagingHostedNumberUpdateParams.none(),
        ): HttpResponseFor<MessagingHostedNumberUpdateResponse> =
            update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: MessagingHostedNumberUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingHostedNumberUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(
            params: MessagingHostedNumberUpdateParams
        ): HttpResponseFor<MessagingHostedNumberUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessagingHostedNumberUpdateResponse> =
            update(id, MessagingHostedNumberUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /messaging_hosted_numbers`, but is otherwise the
         * same as [MessagingHostedNumberService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<MessagingHostedNumberListPage> =
            list(MessagingHostedNumberListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: MessagingHostedNumberListParams = MessagingHostedNumberListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingHostedNumberListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: MessagingHostedNumberListParams = MessagingHostedNumberListParams.none()
        ): HttpResponseFor<MessagingHostedNumberListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<MessagingHostedNumberListPage> =
            list(MessagingHostedNumberListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /messaging_hosted_numbers/{id}`, but is otherwise
         * the same as [MessagingHostedNumberService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<MessagingHostedNumberDeleteResponse> =
            delete(id, MessagingHostedNumberDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: MessagingHostedNumberDeleteParams = MessagingHostedNumberDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingHostedNumberDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: MessagingHostedNumberDeleteParams = MessagingHostedNumberDeleteParams.none(),
        ): HttpResponseFor<MessagingHostedNumberDeleteResponse> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: MessagingHostedNumberDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingHostedNumberDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: MessagingHostedNumberDeleteParams
        ): HttpResponseFor<MessagingHostedNumberDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessagingHostedNumberDeleteResponse> =
            delete(id, MessagingHostedNumberDeleteParams.none(), requestOptions)
    }
}
