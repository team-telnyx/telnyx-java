// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.siprecconnectors.SiprecConnectorCreateParams
import com.telnyx.sdk.models.siprecconnectors.SiprecConnectorDeleteParams
import com.telnyx.sdk.models.siprecconnectors.SiprecConnectorResponse
import com.telnyx.sdk.models.siprecconnectors.SiprecConnectorRetrieveParams
import com.telnyx.sdk.models.siprecconnectors.SiprecConnectorUpdateParams
import java.util.function.Consumer

/** SIPREC connectors configuration. */
interface SiprecConnectorService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SiprecConnectorService

    /** Creates a new SIPREC connector configuration. */
    fun create(params: SiprecConnectorCreateParams): SiprecConnectorResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SiprecConnectorCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SiprecConnectorResponse

    /** Returns details of a stored SIPREC connector. */
    fun retrieve(connectorName: String): SiprecConnectorResponse =
        retrieve(connectorName, SiprecConnectorRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        connectorName: String,
        params: SiprecConnectorRetrieveParams = SiprecConnectorRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SiprecConnectorResponse =
        retrieve(params.toBuilder().connectorName(connectorName).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        connectorName: String,
        params: SiprecConnectorRetrieveParams = SiprecConnectorRetrieveParams.none(),
    ): SiprecConnectorResponse = retrieve(connectorName, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SiprecConnectorRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SiprecConnectorResponse

    /** @see retrieve */
    fun retrieve(params: SiprecConnectorRetrieveParams): SiprecConnectorResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(connectorName: String, requestOptions: RequestOptions): SiprecConnectorResponse =
        retrieve(connectorName, SiprecConnectorRetrieveParams.none(), requestOptions)

    /** Updates a stored SIPREC connector configuration. */
    fun update(
        connectorName: String,
        params: SiprecConnectorUpdateParams,
    ): SiprecConnectorResponse = update(connectorName, params, RequestOptions.none())

    /** @see update */
    fun update(
        connectorName: String,
        params: SiprecConnectorUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SiprecConnectorResponse =
        update(params.toBuilder().connectorName(connectorName).build(), requestOptions)

    /** @see update */
    fun update(params: SiprecConnectorUpdateParams): SiprecConnectorResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SiprecConnectorUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SiprecConnectorResponse

    /** Deletes a stored SIPREC connector. */
    fun delete(connectorName: String) = delete(connectorName, SiprecConnectorDeleteParams.none())

    /** @see delete */
    fun delete(
        connectorName: String,
        params: SiprecConnectorDeleteParams = SiprecConnectorDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().connectorName(connectorName).build(), requestOptions)

    /** @see delete */
    fun delete(
        connectorName: String,
        params: SiprecConnectorDeleteParams = SiprecConnectorDeleteParams.none(),
    ) = delete(connectorName, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SiprecConnectorDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: SiprecConnectorDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(connectorName: String, requestOptions: RequestOptions) =
        delete(connectorName, SiprecConnectorDeleteParams.none(), requestOptions)

    /**
     * A view of [SiprecConnectorService] that provides access to raw HTTP responses for each
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
        ): SiprecConnectorService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /siprec_connectors`, but is otherwise the same as
         * [SiprecConnectorService.create].
         */
        @MustBeClosed
        fun create(params: SiprecConnectorCreateParams): HttpResponseFor<SiprecConnectorResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SiprecConnectorCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SiprecConnectorResponse>

        /**
         * Returns a raw HTTP response for `get /siprec_connectors/{connector_name}`, but is
         * otherwise the same as [SiprecConnectorService.retrieve].
         */
        @MustBeClosed
        fun retrieve(connectorName: String): HttpResponseFor<SiprecConnectorResponse> =
            retrieve(connectorName, SiprecConnectorRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            connectorName: String,
            params: SiprecConnectorRetrieveParams = SiprecConnectorRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SiprecConnectorResponse> =
            retrieve(params.toBuilder().connectorName(connectorName).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            connectorName: String,
            params: SiprecConnectorRetrieveParams = SiprecConnectorRetrieveParams.none(),
        ): HttpResponseFor<SiprecConnectorResponse> =
            retrieve(connectorName, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: SiprecConnectorRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SiprecConnectorResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: SiprecConnectorRetrieveParams
        ): HttpResponseFor<SiprecConnectorResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            connectorName: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SiprecConnectorResponse> =
            retrieve(connectorName, SiprecConnectorRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /siprec_connectors/{connector_name}`, but is
         * otherwise the same as [SiprecConnectorService.update].
         */
        @MustBeClosed
        fun update(
            connectorName: String,
            params: SiprecConnectorUpdateParams,
        ): HttpResponseFor<SiprecConnectorResponse> =
            update(connectorName, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            connectorName: String,
            params: SiprecConnectorUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SiprecConnectorResponse> =
            update(params.toBuilder().connectorName(connectorName).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: SiprecConnectorUpdateParams): HttpResponseFor<SiprecConnectorResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: SiprecConnectorUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SiprecConnectorResponse>

        /**
         * Returns a raw HTTP response for `delete /siprec_connectors/{connector_name}`, but is
         * otherwise the same as [SiprecConnectorService.delete].
         */
        @MustBeClosed
        fun delete(connectorName: String): HttpResponse =
            delete(connectorName, SiprecConnectorDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            connectorName: String,
            params: SiprecConnectorDeleteParams = SiprecConnectorDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().connectorName(connectorName).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            connectorName: String,
            params: SiprecConnectorDeleteParams = SiprecConnectorDeleteParams.none(),
        ): HttpResponse = delete(connectorName, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: SiprecConnectorDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: SiprecConnectorDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(connectorName: String, requestOptions: RequestOptions): HttpResponse =
            delete(connectorName, SiprecConnectorDeleteParams.none(), requestOptions)
    }
}
