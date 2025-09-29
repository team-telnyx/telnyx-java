// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponse
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.siprecconnectors.SiprecConnectorCreateParams
import com.telnyx.api.models.siprecconnectors.SiprecConnectorCreateResponse
import com.telnyx.api.models.siprecconnectors.SiprecConnectorDeleteParams
import com.telnyx.api.models.siprecconnectors.SiprecConnectorRetrieveParams
import com.telnyx.api.models.siprecconnectors.SiprecConnectorRetrieveResponse
import com.telnyx.api.models.siprecconnectors.SiprecConnectorUpdateParams
import com.telnyx.api.models.siprecconnectors.SiprecConnectorUpdateResponse
import java.util.function.Consumer

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
    fun create(params: SiprecConnectorCreateParams): SiprecConnectorCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SiprecConnectorCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SiprecConnectorCreateResponse

    /** Returns details of a stored SIPREC connector. */
    fun retrieve(connectorName: String): SiprecConnectorRetrieveResponse =
        retrieve(connectorName, SiprecConnectorRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        connectorName: String,
        params: SiprecConnectorRetrieveParams = SiprecConnectorRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SiprecConnectorRetrieveResponse =
        retrieve(params.toBuilder().connectorName(connectorName).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        connectorName: String,
        params: SiprecConnectorRetrieveParams = SiprecConnectorRetrieveParams.none(),
    ): SiprecConnectorRetrieveResponse = retrieve(connectorName, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SiprecConnectorRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SiprecConnectorRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: SiprecConnectorRetrieveParams): SiprecConnectorRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        connectorName: String,
        requestOptions: RequestOptions,
    ): SiprecConnectorRetrieveResponse =
        retrieve(connectorName, SiprecConnectorRetrieveParams.none(), requestOptions)

    /** Updates a stored SIPREC connector configuration. */
    fun update(
        connectorName: String,
        params: SiprecConnectorUpdateParams,
    ): SiprecConnectorUpdateResponse = update(connectorName, params, RequestOptions.none())

    /** @see update */
    fun update(
        connectorName: String,
        params: SiprecConnectorUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SiprecConnectorUpdateResponse =
        update(params.toBuilder().connectorName(connectorName).build(), requestOptions)

    /** @see update */
    fun update(params: SiprecConnectorUpdateParams): SiprecConnectorUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SiprecConnectorUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SiprecConnectorUpdateResponse

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
        fun create(
            params: SiprecConnectorCreateParams
        ): HttpResponseFor<SiprecConnectorCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SiprecConnectorCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SiprecConnectorCreateResponse>

        /**
         * Returns a raw HTTP response for `get /siprec_connectors/{connector_name}`, but is
         * otherwise the same as [SiprecConnectorService.retrieve].
         */
        @MustBeClosed
        fun retrieve(connectorName: String): HttpResponseFor<SiprecConnectorRetrieveResponse> =
            retrieve(connectorName, SiprecConnectorRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            connectorName: String,
            params: SiprecConnectorRetrieveParams = SiprecConnectorRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SiprecConnectorRetrieveResponse> =
            retrieve(params.toBuilder().connectorName(connectorName).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            connectorName: String,
            params: SiprecConnectorRetrieveParams = SiprecConnectorRetrieveParams.none(),
        ): HttpResponseFor<SiprecConnectorRetrieveResponse> =
            retrieve(connectorName, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: SiprecConnectorRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SiprecConnectorRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: SiprecConnectorRetrieveParams
        ): HttpResponseFor<SiprecConnectorRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            connectorName: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SiprecConnectorRetrieveResponse> =
            retrieve(connectorName, SiprecConnectorRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /siprec_connectors/{connector_name}`, but is
         * otherwise the same as [SiprecConnectorService.update].
         */
        @MustBeClosed
        fun update(
            connectorName: String,
            params: SiprecConnectorUpdateParams,
        ): HttpResponseFor<SiprecConnectorUpdateResponse> =
            update(connectorName, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            connectorName: String,
            params: SiprecConnectorUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SiprecConnectorUpdateResponse> =
            update(params.toBuilder().connectorName(connectorName).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: SiprecConnectorUpdateParams
        ): HttpResponseFor<SiprecConnectorUpdateResponse> = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: SiprecConnectorUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SiprecConnectorUpdateResponse>

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
