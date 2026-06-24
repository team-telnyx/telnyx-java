// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.texml.accounts

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.texml.accounts.queues.QueueCreateParams
import com.telnyx.sdk.models.texml.accounts.queues.QueueDeleteParams
import com.telnyx.sdk.models.texml.accounts.queues.QueueListPageAsync
import com.telnyx.sdk.models.texml.accounts.queues.QueueListParams
import com.telnyx.sdk.models.texml.accounts.queues.QueueResource
import com.telnyx.sdk.models.texml.accounts.queues.QueueRetrieveParams
import com.telnyx.sdk.models.texml.accounts.queues.QueueUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** TeXML REST Commands */
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
    fun create(accountSid: String): CompletableFuture<QueueResource> =
        create(accountSid, QueueCreateParams.none())

    /** @see create */
    fun create(
        accountSid: String,
        params: QueueCreateParams = QueueCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<QueueResource> =
        create(params.toBuilder().accountSid(accountSid).build(), requestOptions)

    /** @see create */
    fun create(
        accountSid: String,
        params: QueueCreateParams = QueueCreateParams.none(),
    ): CompletableFuture<QueueResource> = create(accountSid, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: QueueCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<QueueResource>

    /** @see create */
    fun create(params: QueueCreateParams): CompletableFuture<QueueResource> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        accountSid: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<QueueResource> =
        create(accountSid, QueueCreateParams.none(), requestOptions)

    /** Returns a queue resource. */
    fun retrieve(queueSid: String, params: QueueRetrieveParams): CompletableFuture<QueueResource> =
        retrieve(queueSid, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        queueSid: String,
        params: QueueRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<QueueResource> =
        retrieve(params.toBuilder().queueSid(queueSid).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: QueueRetrieveParams): CompletableFuture<QueueResource> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: QueueRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<QueueResource>

    /** Updates a queue resource. */
    fun update(queueSid: String, params: QueueUpdateParams): CompletableFuture<QueueResource> =
        update(queueSid, params, RequestOptions.none())

    /** @see update */
    fun update(
        queueSid: String,
        params: QueueUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<QueueResource> =
        update(params.toBuilder().queueSid(queueSid).build(), requestOptions)

    /** @see update */
    fun update(params: QueueUpdateParams): CompletableFuture<QueueResource> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: QueueUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<QueueResource>

    /** Lists queue resources. */
    fun list(accountSid: String): CompletableFuture<QueueListPageAsync> =
        list(accountSid, QueueListParams.none())

    /** @see list */
    fun list(
        accountSid: String,
        params: QueueListParams = QueueListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<QueueListPageAsync> =
        list(params.toBuilder().accountSid(accountSid).build(), requestOptions)

    /** @see list */
    fun list(
        accountSid: String,
        params: QueueListParams = QueueListParams.none(),
    ): CompletableFuture<QueueListPageAsync> = list(accountSid, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: QueueListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<QueueListPageAsync>

    /** @see list */
    fun list(params: QueueListParams): CompletableFuture<QueueListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        accountSid: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<QueueListPageAsync> =
        list(accountSid, QueueListParams.none(), requestOptions)

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
        fun create(accountSid: String): CompletableFuture<HttpResponseFor<QueueResource>> =
            create(accountSid, QueueCreateParams.none())

        /** @see create */
        fun create(
            accountSid: String,
            params: QueueCreateParams = QueueCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<QueueResource>> =
            create(params.toBuilder().accountSid(accountSid).build(), requestOptions)

        /** @see create */
        fun create(
            accountSid: String,
            params: QueueCreateParams = QueueCreateParams.none(),
        ): CompletableFuture<HttpResponseFor<QueueResource>> =
            create(accountSid, params, RequestOptions.none())

        /** @see create */
        fun create(
            params: QueueCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<QueueResource>>

        /** @see create */
        fun create(params: QueueCreateParams): CompletableFuture<HttpResponseFor<QueueResource>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            accountSid: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<QueueResource>> =
            create(accountSid, QueueCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /texml/Accounts/{account_sid}/Queues/{queue_sid}`,
         * but is otherwise the same as [QueueServiceAsync.retrieve].
         */
        fun retrieve(
            queueSid: String,
            params: QueueRetrieveParams,
        ): CompletableFuture<HttpResponseFor<QueueResource>> =
            retrieve(queueSid, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            queueSid: String,
            params: QueueRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<QueueResource>> =
            retrieve(params.toBuilder().queueSid(queueSid).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: QueueRetrieveParams
        ): CompletableFuture<HttpResponseFor<QueueResource>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: QueueRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<QueueResource>>

        /**
         * Returns a raw HTTP response for `post /texml/Accounts/{account_sid}/Queues/{queue_sid}`,
         * but is otherwise the same as [QueueServiceAsync.update].
         */
        fun update(
            queueSid: String,
            params: QueueUpdateParams,
        ): CompletableFuture<HttpResponseFor<QueueResource>> =
            update(queueSid, params, RequestOptions.none())

        /** @see update */
        fun update(
            queueSid: String,
            params: QueueUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<QueueResource>> =
            update(params.toBuilder().queueSid(queueSid).build(), requestOptions)

        /** @see update */
        fun update(params: QueueUpdateParams): CompletableFuture<HttpResponseFor<QueueResource>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: QueueUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<QueueResource>>

        /**
         * Returns a raw HTTP response for `get /texml/Accounts/{account_sid}/Queues`, but is
         * otherwise the same as [QueueServiceAsync.list].
         */
        fun list(accountSid: String): CompletableFuture<HttpResponseFor<QueueListPageAsync>> =
            list(accountSid, QueueListParams.none())

        /** @see list */
        fun list(
            accountSid: String,
            params: QueueListParams = QueueListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<QueueListPageAsync>> =
            list(params.toBuilder().accountSid(accountSid).build(), requestOptions)

        /** @see list */
        fun list(
            accountSid: String,
            params: QueueListParams = QueueListParams.none(),
        ): CompletableFuture<HttpResponseFor<QueueListPageAsync>> =
            list(accountSid, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: QueueListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<QueueListPageAsync>>

        /** @see list */
        fun list(params: QueueListParams): CompletableFuture<HttpResponseFor<QueueListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            accountSid: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<QueueListPageAsync>> =
            list(accountSid, QueueListParams.none(), requestOptions)

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
