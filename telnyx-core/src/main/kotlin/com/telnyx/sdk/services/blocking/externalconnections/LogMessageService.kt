// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.externalconnections

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.externalconnections.logmessages.LogMessageDismissParams
import com.telnyx.sdk.models.externalconnections.logmessages.LogMessageDismissResponse
import com.telnyx.sdk.models.externalconnections.logmessages.LogMessageListPage
import com.telnyx.sdk.models.externalconnections.logmessages.LogMessageListParams
import com.telnyx.sdk.models.externalconnections.logmessages.LogMessageRetrieveParams
import com.telnyx.sdk.models.externalconnections.logmessages.LogMessageRetrieveResponse
import java.util.function.Consumer

/** External Connections operations */
interface LogMessageService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LogMessageService

    /** Retrieve a log message for an external connection associated with your account. */
    fun retrieve(id: String): LogMessageRetrieveResponse =
        retrieve(id, LogMessageRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: LogMessageRetrieveParams = LogMessageRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LogMessageRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: LogMessageRetrieveParams = LogMessageRetrieveParams.none(),
    ): LogMessageRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: LogMessageRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LogMessageRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: LogMessageRetrieveParams): LogMessageRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): LogMessageRetrieveResponse =
        retrieve(id, LogMessageRetrieveParams.none(), requestOptions)

    /**
     * Retrieve a list of log messages for all external connections associated with your account.
     */
    fun list(): LogMessageListPage = list(LogMessageListParams.none())

    /** @see list */
    fun list(
        params: LogMessageListParams = LogMessageListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LogMessageListPage

    /** @see list */
    fun list(params: LogMessageListParams = LogMessageListParams.none()): LogMessageListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): LogMessageListPage =
        list(LogMessageListParams.none(), requestOptions)

    /** Dismiss a log message for an external connection associated with your account. */
    fun dismiss(id: String): LogMessageDismissResponse = dismiss(id, LogMessageDismissParams.none())

    /** @see dismiss */
    fun dismiss(
        id: String,
        params: LogMessageDismissParams = LogMessageDismissParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LogMessageDismissResponse = dismiss(params.toBuilder().id(id).build(), requestOptions)

    /** @see dismiss */
    fun dismiss(
        id: String,
        params: LogMessageDismissParams = LogMessageDismissParams.none(),
    ): LogMessageDismissResponse = dismiss(id, params, RequestOptions.none())

    /** @see dismiss */
    fun dismiss(
        params: LogMessageDismissParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LogMessageDismissResponse

    /** @see dismiss */
    fun dismiss(params: LogMessageDismissParams): LogMessageDismissResponse =
        dismiss(params, RequestOptions.none())

    /** @see dismiss */
    fun dismiss(id: String, requestOptions: RequestOptions): LogMessageDismissResponse =
        dismiss(id, LogMessageDismissParams.none(), requestOptions)

    /** A view of [LogMessageService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LogMessageService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /external_connections/log_messages/{id}`, but is
         * otherwise the same as [LogMessageService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<LogMessageRetrieveResponse> =
            retrieve(id, LogMessageRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: LogMessageRetrieveParams = LogMessageRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LogMessageRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: LogMessageRetrieveParams = LogMessageRetrieveParams.none(),
        ): HttpResponseFor<LogMessageRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: LogMessageRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LogMessageRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: LogMessageRetrieveParams
        ): HttpResponseFor<LogMessageRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LogMessageRetrieveResponse> =
            retrieve(id, LogMessageRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /external_connections/log_messages`, but is
         * otherwise the same as [LogMessageService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<LogMessageListPage> = list(LogMessageListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: LogMessageListParams = LogMessageListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LogMessageListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: LogMessageListParams = LogMessageListParams.none()
        ): HttpResponseFor<LogMessageListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<LogMessageListPage> =
            list(LogMessageListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /external_connections/log_messages/{id}`, but is
         * otherwise the same as [LogMessageService.dismiss].
         */
        @MustBeClosed
        fun dismiss(id: String): HttpResponseFor<LogMessageDismissResponse> =
            dismiss(id, LogMessageDismissParams.none())

        /** @see dismiss */
        @MustBeClosed
        fun dismiss(
            id: String,
            params: LogMessageDismissParams = LogMessageDismissParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LogMessageDismissResponse> =
            dismiss(params.toBuilder().id(id).build(), requestOptions)

        /** @see dismiss */
        @MustBeClosed
        fun dismiss(
            id: String,
            params: LogMessageDismissParams = LogMessageDismissParams.none(),
        ): HttpResponseFor<LogMessageDismissResponse> = dismiss(id, params, RequestOptions.none())

        /** @see dismiss */
        @MustBeClosed
        fun dismiss(
            params: LogMessageDismissParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LogMessageDismissResponse>

        /** @see dismiss */
        @MustBeClosed
        fun dismiss(params: LogMessageDismissParams): HttpResponseFor<LogMessageDismissResponse> =
            dismiss(params, RequestOptions.none())

        /** @see dismiss */
        @MustBeClosed
        fun dismiss(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LogMessageDismissResponse> =
            dismiss(id, LogMessageDismissParams.none(), requestOptions)
    }
}
