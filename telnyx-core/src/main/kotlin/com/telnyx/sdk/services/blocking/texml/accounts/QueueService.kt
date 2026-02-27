// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.texml.accounts

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.texml.accounts.queues.QueueCreateParams
import com.telnyx.sdk.models.texml.accounts.queues.QueueCreateResponse
import com.telnyx.sdk.models.texml.accounts.queues.QueueDeleteParams
import com.telnyx.sdk.models.texml.accounts.queues.QueueListPage
import com.telnyx.sdk.models.texml.accounts.queues.QueueListParams
import com.telnyx.sdk.models.texml.accounts.queues.QueueRetrieveParams
import com.telnyx.sdk.models.texml.accounts.queues.QueueRetrieveResponse
import com.telnyx.sdk.models.texml.accounts.queues.QueueUpdateParams
import com.telnyx.sdk.models.texml.accounts.queues.QueueUpdateResponse
import java.util.function.Consumer

/** TeXML REST Commands */
interface QueueService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): QueueService

    /** Creates a new queue resource. */
    fun create(accountSid: String): QueueCreateResponse =
        create(accountSid, QueueCreateParams.none())

    /** @see create */
    fun create(
        accountSid: String,
        params: QueueCreateParams = QueueCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): QueueCreateResponse =
        create(params.toBuilder().accountSid(accountSid).build(), requestOptions)

    /** @see create */
    fun create(
        accountSid: String,
        params: QueueCreateParams = QueueCreateParams.none(),
    ): QueueCreateResponse = create(accountSid, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: QueueCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): QueueCreateResponse

    /** @see create */
    fun create(params: QueueCreateParams): QueueCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(accountSid: String, requestOptions: RequestOptions): QueueCreateResponse =
        create(accountSid, QueueCreateParams.none(), requestOptions)

    /** Returns a queue resource. */
    fun retrieve(queueSid: String, params: QueueRetrieveParams): QueueRetrieveResponse =
        retrieve(queueSid, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        queueSid: String,
        params: QueueRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): QueueRetrieveResponse =
        retrieve(params.toBuilder().queueSid(queueSid).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: QueueRetrieveParams): QueueRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: QueueRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): QueueRetrieveResponse

    /** Updates a queue resource. */
    fun update(queueSid: String, params: QueueUpdateParams): QueueUpdateResponse =
        update(queueSid, params, RequestOptions.none())

    /** @see update */
    fun update(
        queueSid: String,
        params: QueueUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): QueueUpdateResponse = update(params.toBuilder().queueSid(queueSid).build(), requestOptions)

    /** @see update */
    fun update(params: QueueUpdateParams): QueueUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: QueueUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): QueueUpdateResponse

    /** Lists queue resources. */
    fun list(accountSid: String): QueueListPage = list(accountSid, QueueListParams.none())

    /** @see list */
    fun list(
        accountSid: String,
        params: QueueListParams = QueueListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): QueueListPage = list(params.toBuilder().accountSid(accountSid).build(), requestOptions)

    /** @see list */
    fun list(accountSid: String, params: QueueListParams = QueueListParams.none()): QueueListPage =
        list(accountSid, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: QueueListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): QueueListPage

    /** @see list */
    fun list(params: QueueListParams): QueueListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(accountSid: String, requestOptions: RequestOptions): QueueListPage =
        list(accountSid, QueueListParams.none(), requestOptions)

    /** Delete a queue resource. */
    fun delete(queueSid: String, params: QueueDeleteParams) =
        delete(queueSid, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        queueSid: String,
        params: QueueDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().queueSid(queueSid).build(), requestOptions)

    /** @see delete */
    fun delete(params: QueueDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: QueueDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [QueueService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): QueueService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /texml/Accounts/{account_sid}/Queues`, but is
         * otherwise the same as [QueueService.create].
         */
        @MustBeClosed
        fun create(accountSid: String): HttpResponseFor<QueueCreateResponse> =
            create(accountSid, QueueCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            accountSid: String,
            params: QueueCreateParams = QueueCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<QueueCreateResponse> =
            create(params.toBuilder().accountSid(accountSid).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            accountSid: String,
            params: QueueCreateParams = QueueCreateParams.none(),
        ): HttpResponseFor<QueueCreateResponse> = create(accountSid, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: QueueCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<QueueCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(params: QueueCreateParams): HttpResponseFor<QueueCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            accountSid: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<QueueCreateResponse> =
            create(accountSid, QueueCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /texml/Accounts/{account_sid}/Queues/{queue_sid}`,
         * but is otherwise the same as [QueueService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            queueSid: String,
            params: QueueRetrieveParams,
        ): HttpResponseFor<QueueRetrieveResponse> =
            retrieve(queueSid, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            queueSid: String,
            params: QueueRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<QueueRetrieveResponse> =
            retrieve(params.toBuilder().queueSid(queueSid).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: QueueRetrieveParams): HttpResponseFor<QueueRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: QueueRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<QueueRetrieveResponse>

        /**
         * Returns a raw HTTP response for `post /texml/Accounts/{account_sid}/Queues/{queue_sid}`,
         * but is otherwise the same as [QueueService.update].
         */
        @MustBeClosed
        fun update(
            queueSid: String,
            params: QueueUpdateParams,
        ): HttpResponseFor<QueueUpdateResponse> = update(queueSid, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            queueSid: String,
            params: QueueUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<QueueUpdateResponse> =
            update(params.toBuilder().queueSid(queueSid).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: QueueUpdateParams): HttpResponseFor<QueueUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: QueueUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<QueueUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /texml/Accounts/{account_sid}/Queues`, but is
         * otherwise the same as [QueueService.list].
         */
        @MustBeClosed
        fun list(accountSid: String): HttpResponseFor<QueueListPage> =
            list(accountSid, QueueListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            accountSid: String,
            params: QueueListParams = QueueListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<QueueListPage> =
            list(params.toBuilder().accountSid(accountSid).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            accountSid: String,
            params: QueueListParams = QueueListParams.none(),
        ): HttpResponseFor<QueueListPage> = list(accountSid, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: QueueListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<QueueListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: QueueListParams): HttpResponseFor<QueueListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            accountSid: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<QueueListPage> = list(accountSid, QueueListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /texml/Accounts/{account_sid}/Queues/{queue_sid}`, but is otherwise the same as
         * [QueueService.delete].
         */
        @MustBeClosed
        fun delete(queueSid: String, params: QueueDeleteParams): HttpResponse =
            delete(queueSid, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            queueSid: String,
            params: QueueDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().queueSid(queueSid).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: QueueDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: QueueDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
