// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.texml.accounts

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.texml.accounts.queues.QueueCreateParams
import com.telnyx.sdk.models.texml.accounts.queues.QueueCreateResponse
import com.telnyx.sdk.models.texml.accounts.queues.QueueDeleteParams
import com.telnyx.sdk.models.texml.accounts.queues.QueueRetrieveParams
import com.telnyx.sdk.models.texml.accounts.queues.QueueRetrieveResponse
import com.telnyx.sdk.models.texml.accounts.queues.QueueUpdateParams
import com.telnyx.sdk.models.texml.accounts.queues.QueueUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface QueueServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): QueueServiceAsync

    /** Creates a new queue resource. */
    fun create(accountSid: String): CompletableFuture<QueueCreateResponse> =
        create(accountSid, QueueCreateParams.none())

    /** @see create */
    fun create(
        accountSid: String,
        params: QueueCreateParams = QueueCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<QueueCreateResponse> =
        create(params.toBuilder().accountSid(accountSid).build(), requestOptions)

    /** @see create */
    fun create(
        accountSid: String,
        params: QueueCreateParams = QueueCreateParams.none(),
    ): CompletableFuture<QueueCreateResponse> = create(accountSid, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: QueueCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<QueueCreateResponse>

    /** @see create */
    fun create(params: QueueCreateParams): CompletableFuture<QueueCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        accountSid: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<QueueCreateResponse> =
        create(accountSid, QueueCreateParams.none(), requestOptions)

    /** Returns a queue resource. */
    fun retrieve(
        queueSid: String,
        params: QueueRetrieveParams,
    ): CompletableFuture<QueueRetrieveResponse> = retrieve(queueSid, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        queueSid: String,
        params: QueueRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<QueueRetrieveResponse> =
        retrieve(params.toBuilder().queueSid(queueSid).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: QueueRetrieveParams): CompletableFuture<QueueRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: QueueRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<QueueRetrieveResponse>

    /** Updates a queue resource. */
    fun update(
        queueSid: String,
        params: QueueUpdateParams,
    ): CompletableFuture<QueueUpdateResponse> = update(queueSid, params, RequestOptions.none())

    /** @see update */
    fun update(
        queueSid: String,
        params: QueueUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<QueueUpdateResponse> =
        update(params.toBuilder().queueSid(queueSid).build(), requestOptions)

    /** @see update */
    fun update(params: QueueUpdateParams): CompletableFuture<QueueUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: QueueUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<QueueUpdateResponse>

    /** Delete a queue resource. */
    fun delete(queueSid: String, params: QueueDeleteParams): CompletableFuture<Void?> =
        delete(queueSid, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        queueSid: String,
        params: QueueDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().queueSid(queueSid).build(), requestOptions)

    /** @see delete */
    fun delete(params: QueueDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: QueueDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** A view of [QueueServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): QueueServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /texml/Accounts/{account_sid}/Queues`, but is
         * otherwise the same as [QueueServiceAsync.create].
         */
        fun create(accountSid: String): CompletableFuture<HttpResponseFor<QueueCreateResponse>> =
            create(accountSid, QueueCreateParams.none())

        /** @see create */
        fun create(
            accountSid: String,
            params: QueueCreateParams = QueueCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<QueueCreateResponse>> =
            create(params.toBuilder().accountSid(accountSid).build(), requestOptions)

        /** @see create */
        fun create(
            accountSid: String,
            params: QueueCreateParams = QueueCreateParams.none(),
        ): CompletableFuture<HttpResponseFor<QueueCreateResponse>> =
            create(accountSid, params, RequestOptions.none())

        /** @see create */
        fun create(
            params: QueueCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<QueueCreateResponse>>

        /** @see create */
        fun create(
            params: QueueCreateParams
        ): CompletableFuture<HttpResponseFor<QueueCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            accountSid: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<QueueCreateResponse>> =
            create(accountSid, QueueCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /texml/Accounts/{account_sid}/Queues/{queue_sid}`,
         * but is otherwise the same as [QueueServiceAsync.retrieve].
         */
        fun retrieve(
            queueSid: String,
            params: QueueRetrieveParams,
        ): CompletableFuture<HttpResponseFor<QueueRetrieveResponse>> =
            retrieve(queueSid, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            queueSid: String,
            params: QueueRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<QueueRetrieveResponse>> =
            retrieve(params.toBuilder().queueSid(queueSid).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: QueueRetrieveParams
        ): CompletableFuture<HttpResponseFor<QueueRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: QueueRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<QueueRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `post /texml/Accounts/{account_sid}/Queues/{queue_sid}`,
         * but is otherwise the same as [QueueServiceAsync.update].
         */
        fun update(
            queueSid: String,
            params: QueueUpdateParams,
        ): CompletableFuture<HttpResponseFor<QueueUpdateResponse>> =
            update(queueSid, params, RequestOptions.none())

        /** @see update */
        fun update(
            queueSid: String,
            params: QueueUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<QueueUpdateResponse>> =
            update(params.toBuilder().queueSid(queueSid).build(), requestOptions)

        /** @see update */
        fun update(
            params: QueueUpdateParams
        ): CompletableFuture<HttpResponseFor<QueueUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: QueueUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<QueueUpdateResponse>>

        /**
         * Returns a raw HTTP response for `delete
         * /texml/Accounts/{account_sid}/Queues/{queue_sid}`, but is otherwise the same as
         * [QueueServiceAsync.delete].
         */
        fun delete(queueSid: String, params: QueueDeleteParams): CompletableFuture<HttpResponse> =
            delete(queueSid, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            queueSid: String,
            params: QueueDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().queueSid(queueSid).build(), requestOptions)

        /** @see delete */
        fun delete(params: QueueDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: QueueDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
