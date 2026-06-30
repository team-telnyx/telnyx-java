// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.externalconnections

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.externalconnections.logmessages.LogMessageDismissParams
import com.telnyx.sdk.models.externalconnections.logmessages.LogMessageDismissResponse
import com.telnyx.sdk.models.externalconnections.logmessages.LogMessageListPageAsync
import com.telnyx.sdk.models.externalconnections.logmessages.LogMessageListParams
import com.telnyx.sdk.models.externalconnections.logmessages.LogMessageRetrieveParams
import com.telnyx.sdk.models.externalconnections.logmessages.LogMessageRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** External Connections operations */
interface LogMessageServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LogMessageServiceAsync

    /** Retrieve a log message for an external connection associated with your account. */
    fun retrieve(id: String): CompletableFuture<LogMessageRetrieveResponse> =
        retrieve(id, LogMessageRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: LogMessageRetrieveParams = LogMessageRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LogMessageRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: LogMessageRetrieveParams = LogMessageRetrieveParams.none(),
    ): CompletableFuture<LogMessageRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: LogMessageRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LogMessageRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: LogMessageRetrieveParams): CompletableFuture<LogMessageRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<LogMessageRetrieveResponse> =
        retrieve(id, LogMessageRetrieveParams.none(), requestOptions)

    /**
     * Retrieve a list of log messages for all external connections associated with your account.
     */
    fun list(): CompletableFuture<LogMessageListPageAsync> = list(LogMessageListParams.none())

    /** @see list */
    fun list(
        params: LogMessageListParams = LogMessageListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LogMessageListPageAsync>

    /** @see list */
    fun list(
        params: LogMessageListParams = LogMessageListParams.none()
    ): CompletableFuture<LogMessageListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<LogMessageListPageAsync> =
        list(LogMessageListParams.none(), requestOptions)

    /** Dismiss a log message for an external connection associated with your account. */
    fun dismiss(id: String): CompletableFuture<LogMessageDismissResponse> =
        dismiss(id, LogMessageDismissParams.none())

    /** @see dismiss */
    fun dismiss(
        id: String,
        params: LogMessageDismissParams = LogMessageDismissParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LogMessageDismissResponse> =
        dismiss(params.toBuilder().id(id).build(), requestOptions)

    /** @see dismiss */
    fun dismiss(
        id: String,
        params: LogMessageDismissParams = LogMessageDismissParams.none(),
    ): CompletableFuture<LogMessageDismissResponse> = dismiss(id, params, RequestOptions.none())

    /** @see dismiss */
    fun dismiss(
        params: LogMessageDismissParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LogMessageDismissResponse>

    /** @see dismiss */
    fun dismiss(params: LogMessageDismissParams): CompletableFuture<LogMessageDismissResponse> =
        dismiss(params, RequestOptions.none())

    /** @see dismiss */
    fun dismiss(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<LogMessageDismissResponse> =
        dismiss(id, LogMessageDismissParams.none(), requestOptions)

    /**
     * A view of [LogMessageServiceAsync] that provides access to raw HTTP responses for each
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
        ): LogMessageServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /external_connections/log_messages/{id}`, but is
         * otherwise the same as [LogMessageServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<LogMessageRetrieveResponse>> =
            retrieve(id, LogMessageRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: LogMessageRetrieveParams = LogMessageRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LogMessageRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: LogMessageRetrieveParams = LogMessageRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<LogMessageRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: LogMessageRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LogMessageRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: LogMessageRetrieveParams
        ): CompletableFuture<HttpResponseFor<LogMessageRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LogMessageRetrieveResponse>> =
            retrieve(id, LogMessageRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /external_connections/log_messages`, but is
         * otherwise the same as [LogMessageServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<LogMessageListPageAsync>> =
            list(LogMessageListParams.none())

        /** @see list */
        fun list(
            params: LogMessageListParams = LogMessageListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LogMessageListPageAsync>>

        /** @see list */
        fun list(
            params: LogMessageListParams = LogMessageListParams.none()
        ): CompletableFuture<HttpResponseFor<LogMessageListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<LogMessageListPageAsync>> =
            list(LogMessageListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /external_connections/log_messages/{id}`, but is
         * otherwise the same as [LogMessageServiceAsync.dismiss].
         */
        fun dismiss(id: String): CompletableFuture<HttpResponseFor<LogMessageDismissResponse>> =
            dismiss(id, LogMessageDismissParams.none())

        /** @see dismiss */
        fun dismiss(
            id: String,
            params: LogMessageDismissParams = LogMessageDismissParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LogMessageDismissResponse>> =
            dismiss(params.toBuilder().id(id).build(), requestOptions)

        /** @see dismiss */
        fun dismiss(
            id: String,
            params: LogMessageDismissParams = LogMessageDismissParams.none(),
        ): CompletableFuture<HttpResponseFor<LogMessageDismissResponse>> =
            dismiss(id, params, RequestOptions.none())

        /** @see dismiss */
        fun dismiss(
            params: LogMessageDismissParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LogMessageDismissResponse>>

        /** @see dismiss */
        fun dismiss(
            params: LogMessageDismissParams
        ): CompletableFuture<HttpResponseFor<LogMessageDismissResponse>> =
            dismiss(params, RequestOptions.none())

        /** @see dismiss */
        fun dismiss(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LogMessageDismissResponse>> =
            dismiss(id, LogMessageDismissParams.none(), requestOptions)
    }
}
