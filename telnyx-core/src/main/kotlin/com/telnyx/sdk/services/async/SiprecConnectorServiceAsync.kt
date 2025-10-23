// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.siprecconnectors.SiprecConnectorCreateParams
import com.telnyx.sdk.models.siprecconnectors.SiprecConnectorCreateResponse
import com.telnyx.sdk.models.siprecconnectors.SiprecConnectorDeleteParams
import com.telnyx.sdk.models.siprecconnectors.SiprecConnectorRetrieveParams
import com.telnyx.sdk.models.siprecconnectors.SiprecConnectorRetrieveResponse
import com.telnyx.sdk.models.siprecconnectors.SiprecConnectorUpdateParams
import com.telnyx.sdk.models.siprecconnectors.SiprecConnectorUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SiprecConnectorServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SiprecConnectorServiceAsync

    /** Creates a new SIPREC connector configuration. */
    fun create(
        params: SiprecConnectorCreateParams
    ): CompletableFuture<SiprecConnectorCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SiprecConnectorCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SiprecConnectorCreateResponse>

    /** Returns details of a stored SIPREC connector. */
    fun retrieve(connectorName: String): CompletableFuture<SiprecConnectorRetrieveResponse> =
        retrieve(connectorName, SiprecConnectorRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        connectorName: String,
        params: SiprecConnectorRetrieveParams = SiprecConnectorRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SiprecConnectorRetrieveResponse> =
        retrieve(params.toBuilder().connectorName(connectorName).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        connectorName: String,
        params: SiprecConnectorRetrieveParams = SiprecConnectorRetrieveParams.none(),
    ): CompletableFuture<SiprecConnectorRetrieveResponse> =
        retrieve(connectorName, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SiprecConnectorRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SiprecConnectorRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: SiprecConnectorRetrieveParams
    ): CompletableFuture<SiprecConnectorRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        connectorName: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SiprecConnectorRetrieveResponse> =
        retrieve(connectorName, SiprecConnectorRetrieveParams.none(), requestOptions)

    /** Updates a stored SIPREC connector configuration. */
    fun update(
        connectorName: String,
        params: SiprecConnectorUpdateParams,
    ): CompletableFuture<SiprecConnectorUpdateResponse> =
        update(connectorName, params, RequestOptions.none())

    /** @see update */
    fun update(
        connectorName: String,
        params: SiprecConnectorUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SiprecConnectorUpdateResponse> =
        update(params.toBuilder().connectorName(connectorName).build(), requestOptions)

    /** @see update */
    fun update(
        params: SiprecConnectorUpdateParams
    ): CompletableFuture<SiprecConnectorUpdateResponse> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SiprecConnectorUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SiprecConnectorUpdateResponse>

    /** Deletes a stored SIPREC connector. */
    fun delete(connectorName: String): CompletableFuture<Void?> =
        delete(connectorName, SiprecConnectorDeleteParams.none())

    /** @see delete */
    fun delete(
        connectorName: String,
        params: SiprecConnectorDeleteParams = SiprecConnectorDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().connectorName(connectorName).build(), requestOptions)

    /** @see delete */
    fun delete(
        connectorName: String,
        params: SiprecConnectorDeleteParams = SiprecConnectorDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(connectorName, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SiprecConnectorDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: SiprecConnectorDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(connectorName: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(connectorName, SiprecConnectorDeleteParams.none(), requestOptions)

    /**
     * A view of [SiprecConnectorServiceAsync] that provides access to raw HTTP responses for each
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
        ): SiprecConnectorServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /siprec_connectors`, but is otherwise the same as
         * [SiprecConnectorServiceAsync.create].
         */
        fun create(
            params: SiprecConnectorCreateParams
        ): CompletableFuture<HttpResponseFor<SiprecConnectorCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SiprecConnectorCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SiprecConnectorCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /siprec_connectors/{connector_name}`, but is
         * otherwise the same as [SiprecConnectorServiceAsync.retrieve].
         */
        fun retrieve(
            connectorName: String
        ): CompletableFuture<HttpResponseFor<SiprecConnectorRetrieveResponse>> =
            retrieve(connectorName, SiprecConnectorRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            connectorName: String,
            params: SiprecConnectorRetrieveParams = SiprecConnectorRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SiprecConnectorRetrieveResponse>> =
            retrieve(params.toBuilder().connectorName(connectorName).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            connectorName: String,
            params: SiprecConnectorRetrieveParams = SiprecConnectorRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<SiprecConnectorRetrieveResponse>> =
            retrieve(connectorName, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: SiprecConnectorRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SiprecConnectorRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: SiprecConnectorRetrieveParams
        ): CompletableFuture<HttpResponseFor<SiprecConnectorRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            connectorName: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SiprecConnectorRetrieveResponse>> =
            retrieve(connectorName, SiprecConnectorRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /siprec_connectors/{connector_name}`, but is
         * otherwise the same as [SiprecConnectorServiceAsync.update].
         */
        fun update(
            connectorName: String,
            params: SiprecConnectorUpdateParams,
        ): CompletableFuture<HttpResponseFor<SiprecConnectorUpdateResponse>> =
            update(connectorName, params, RequestOptions.none())

        /** @see update */
        fun update(
            connectorName: String,
            params: SiprecConnectorUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SiprecConnectorUpdateResponse>> =
            update(params.toBuilder().connectorName(connectorName).build(), requestOptions)

        /** @see update */
        fun update(
            params: SiprecConnectorUpdateParams
        ): CompletableFuture<HttpResponseFor<SiprecConnectorUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: SiprecConnectorUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SiprecConnectorUpdateResponse>>

        /**
         * Returns a raw HTTP response for `delete /siprec_connectors/{connector_name}`, but is
         * otherwise the same as [SiprecConnectorServiceAsync.delete].
         */
        fun delete(connectorName: String): CompletableFuture<HttpResponse> =
            delete(connectorName, SiprecConnectorDeleteParams.none())

        /** @see delete */
        fun delete(
            connectorName: String,
            params: SiprecConnectorDeleteParams = SiprecConnectorDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().connectorName(connectorName).build(), requestOptions)

        /** @see delete */
        fun delete(
            connectorName: String,
            params: SiprecConnectorDeleteParams = SiprecConnectorDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(connectorName, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: SiprecConnectorDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: SiprecConnectorDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            connectorName: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(connectorName, SiprecConnectorDeleteParams.none(), requestOptions)
    }
}
