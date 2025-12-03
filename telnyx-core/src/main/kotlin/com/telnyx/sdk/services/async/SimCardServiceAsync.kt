// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.simcards.SimCardDeleteParams
import com.telnyx.sdk.models.simcards.SimCardDeleteResponse
import com.telnyx.sdk.models.simcards.SimCardGetActivationCodeParams
import com.telnyx.sdk.models.simcards.SimCardGetActivationCodeResponse
import com.telnyx.sdk.models.simcards.SimCardGetDeviceDetailsParams
import com.telnyx.sdk.models.simcards.SimCardGetDeviceDetailsResponse
import com.telnyx.sdk.models.simcards.SimCardGetPublicIpParams
import com.telnyx.sdk.models.simcards.SimCardGetPublicIpResponse
import com.telnyx.sdk.models.simcards.SimCardListParams
import com.telnyx.sdk.models.simcards.SimCardListResponse
import com.telnyx.sdk.models.simcards.SimCardListWirelessConnectivityLogsParams
import com.telnyx.sdk.models.simcards.SimCardListWirelessConnectivityLogsResponse
import com.telnyx.sdk.models.simcards.SimCardRetrieveParams
import com.telnyx.sdk.models.simcards.SimCardRetrieveResponse
import com.telnyx.sdk.models.simcards.SimCardUpdateParams
import com.telnyx.sdk.models.simcards.SimCardUpdateResponse
import com.telnyx.sdk.services.async.simcards.ActionServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SimCardServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SimCardServiceAsync

    fun actions(): ActionServiceAsync

    /** Returns the details regarding a specific SIM card. */
    fun retrieve(id: String): CompletableFuture<SimCardRetrieveResponse> =
        retrieve(id, SimCardRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: SimCardRetrieveParams = SimCardRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimCardRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: SimCardRetrieveParams = SimCardRetrieveParams.none(),
    ): CompletableFuture<SimCardRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SimCardRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimCardRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: SimCardRetrieveParams): CompletableFuture<SimCardRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimCardRetrieveResponse> =
        retrieve(id, SimCardRetrieveParams.none(), requestOptions)

    /** Updates SIM card data */
    fun update(
        pathId: String,
        params: SimCardUpdateParams,
    ): CompletableFuture<SimCardUpdateResponse> = update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: SimCardUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimCardUpdateResponse> =
        update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: SimCardUpdateParams): CompletableFuture<SimCardUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SimCardUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimCardUpdateResponse>

    /** Get all SIM cards belonging to the user that match the given filters. */
    fun list(): CompletableFuture<SimCardListResponse> = list(SimCardListParams.none())

    /** @see list */
    fun list(
        params: SimCardListParams = SimCardListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimCardListResponse>

    /** @see list */
    fun list(
        params: SimCardListParams = SimCardListParams.none()
    ): CompletableFuture<SimCardListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<SimCardListResponse> =
        list(SimCardListParams.none(), requestOptions)

    /**
     * The SIM card will be decommissioned, removed from your account and you will stop being
     * charged.<br />The SIM card won't be able to connect to the network after the deletion is
     * completed, thus making it impossible to consume data.<br/> Transitioning to the disabled
     * state may take a period of time. Until the transition is completed, the SIM card status will
     * be disabling <code>disabling</code>.<br />In order to re-enable the SIM card, you will need
     * to re-register it.
     */
    fun delete(id: String): CompletableFuture<SimCardDeleteResponse> =
        delete(id, SimCardDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: SimCardDeleteParams = SimCardDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimCardDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: SimCardDeleteParams = SimCardDeleteParams.none(),
    ): CompletableFuture<SimCardDeleteResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SimCardDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimCardDeleteResponse>

    /** @see delete */
    fun delete(params: SimCardDeleteParams): CompletableFuture<SimCardDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimCardDeleteResponse> =
        delete(id, SimCardDeleteParams.none(), requestOptions)

    /**
     * It returns the activation code for an eSIM.<br/><br/> This API is only available for eSIMs.
     * If the given SIM is a physical SIM card, or has already been installed, an error will be
     * returned.
     */
    fun getActivationCode(id: String): CompletableFuture<SimCardGetActivationCodeResponse> =
        getActivationCode(id, SimCardGetActivationCodeParams.none())

    /** @see getActivationCode */
    fun getActivationCode(
        id: String,
        params: SimCardGetActivationCodeParams = SimCardGetActivationCodeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimCardGetActivationCodeResponse> =
        getActivationCode(params.toBuilder().id(id).build(), requestOptions)

    /** @see getActivationCode */
    fun getActivationCode(
        id: String,
        params: SimCardGetActivationCodeParams = SimCardGetActivationCodeParams.none(),
    ): CompletableFuture<SimCardGetActivationCodeResponse> =
        getActivationCode(id, params, RequestOptions.none())

    /** @see getActivationCode */
    fun getActivationCode(
        params: SimCardGetActivationCodeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimCardGetActivationCodeResponse>

    /** @see getActivationCode */
    fun getActivationCode(
        params: SimCardGetActivationCodeParams
    ): CompletableFuture<SimCardGetActivationCodeResponse> =
        getActivationCode(params, RequestOptions.none())

    /** @see getActivationCode */
    fun getActivationCode(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimCardGetActivationCodeResponse> =
        getActivationCode(id, SimCardGetActivationCodeParams.none(), requestOptions)

    /** It returns the device details where a SIM card is currently being used. */
    fun getDeviceDetails(id: String): CompletableFuture<SimCardGetDeviceDetailsResponse> =
        getDeviceDetails(id, SimCardGetDeviceDetailsParams.none())

    /** @see getDeviceDetails */
    fun getDeviceDetails(
        id: String,
        params: SimCardGetDeviceDetailsParams = SimCardGetDeviceDetailsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimCardGetDeviceDetailsResponse> =
        getDeviceDetails(params.toBuilder().id(id).build(), requestOptions)

    /** @see getDeviceDetails */
    fun getDeviceDetails(
        id: String,
        params: SimCardGetDeviceDetailsParams = SimCardGetDeviceDetailsParams.none(),
    ): CompletableFuture<SimCardGetDeviceDetailsResponse> =
        getDeviceDetails(id, params, RequestOptions.none())

    /** @see getDeviceDetails */
    fun getDeviceDetails(
        params: SimCardGetDeviceDetailsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimCardGetDeviceDetailsResponse>

    /** @see getDeviceDetails */
    fun getDeviceDetails(
        params: SimCardGetDeviceDetailsParams
    ): CompletableFuture<SimCardGetDeviceDetailsResponse> =
        getDeviceDetails(params, RequestOptions.none())

    /** @see getDeviceDetails */
    fun getDeviceDetails(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimCardGetDeviceDetailsResponse> =
        getDeviceDetails(id, SimCardGetDeviceDetailsParams.none(), requestOptions)

    /** It returns the public IP requested for a SIM card. */
    fun getPublicIp(id: String): CompletableFuture<SimCardGetPublicIpResponse> =
        getPublicIp(id, SimCardGetPublicIpParams.none())

    /** @see getPublicIp */
    fun getPublicIp(
        id: String,
        params: SimCardGetPublicIpParams = SimCardGetPublicIpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimCardGetPublicIpResponse> =
        getPublicIp(params.toBuilder().id(id).build(), requestOptions)

    /** @see getPublicIp */
    fun getPublicIp(
        id: String,
        params: SimCardGetPublicIpParams = SimCardGetPublicIpParams.none(),
    ): CompletableFuture<SimCardGetPublicIpResponse> =
        getPublicIp(id, params, RequestOptions.none())

    /** @see getPublicIp */
    fun getPublicIp(
        params: SimCardGetPublicIpParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimCardGetPublicIpResponse>

    /** @see getPublicIp */
    fun getPublicIp(
        params: SimCardGetPublicIpParams
    ): CompletableFuture<SimCardGetPublicIpResponse> = getPublicIp(params, RequestOptions.none())

    /** @see getPublicIp */
    fun getPublicIp(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimCardGetPublicIpResponse> =
        getPublicIp(id, SimCardGetPublicIpParams.none(), requestOptions)

    /**
     * This API allows listing a paginated collection of Wireless Connectivity Logs associated with
     * a SIM Card, for troubleshooting purposes.
     */
    fun listWirelessConnectivityLogs(
        id: String
    ): CompletableFuture<SimCardListWirelessConnectivityLogsResponse> =
        listWirelessConnectivityLogs(id, SimCardListWirelessConnectivityLogsParams.none())

    /** @see listWirelessConnectivityLogs */
    fun listWirelessConnectivityLogs(
        id: String,
        params: SimCardListWirelessConnectivityLogsParams =
            SimCardListWirelessConnectivityLogsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimCardListWirelessConnectivityLogsResponse> =
        listWirelessConnectivityLogs(params.toBuilder().id(id).build(), requestOptions)

    /** @see listWirelessConnectivityLogs */
    fun listWirelessConnectivityLogs(
        id: String,
        params: SimCardListWirelessConnectivityLogsParams =
            SimCardListWirelessConnectivityLogsParams.none(),
    ): CompletableFuture<SimCardListWirelessConnectivityLogsResponse> =
        listWirelessConnectivityLogs(id, params, RequestOptions.none())

    /** @see listWirelessConnectivityLogs */
    fun listWirelessConnectivityLogs(
        params: SimCardListWirelessConnectivityLogsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimCardListWirelessConnectivityLogsResponse>

    /** @see listWirelessConnectivityLogs */
    fun listWirelessConnectivityLogs(
        params: SimCardListWirelessConnectivityLogsParams
    ): CompletableFuture<SimCardListWirelessConnectivityLogsResponse> =
        listWirelessConnectivityLogs(params, RequestOptions.none())

    /** @see listWirelessConnectivityLogs */
    fun listWirelessConnectivityLogs(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimCardListWirelessConnectivityLogsResponse> =
        listWirelessConnectivityLogs(
            id,
            SimCardListWirelessConnectivityLogsParams.none(),
            requestOptions,
        )

    /**
     * A view of [SimCardServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SimCardServiceAsync.WithRawResponse

        fun actions(): ActionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /sim_cards/{id}`, but is otherwise the same as
         * [SimCardServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<SimCardRetrieveResponse>> =
            retrieve(id, SimCardRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: SimCardRetrieveParams = SimCardRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimCardRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: SimCardRetrieveParams = SimCardRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<SimCardRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: SimCardRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimCardRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: SimCardRetrieveParams
        ): CompletableFuture<HttpResponseFor<SimCardRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimCardRetrieveResponse>> =
            retrieve(id, SimCardRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /sim_cards/{id}`, but is otherwise the same as
         * [SimCardServiceAsync.update].
         */
        fun update(
            pathId: String,
            params: SimCardUpdateParams,
        ): CompletableFuture<HttpResponseFor<SimCardUpdateResponse>> =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: SimCardUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimCardUpdateResponse>> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(
            params: SimCardUpdateParams
        ): CompletableFuture<HttpResponseFor<SimCardUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: SimCardUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimCardUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /sim_cards`, but is otherwise the same as
         * [SimCardServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<SimCardListResponse>> =
            list(SimCardListParams.none())

        /** @see list */
        fun list(
            params: SimCardListParams = SimCardListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimCardListResponse>>

        /** @see list */
        fun list(
            params: SimCardListParams = SimCardListParams.none()
        ): CompletableFuture<HttpResponseFor<SimCardListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SimCardListResponse>> =
            list(SimCardListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /sim_cards/{id}`, but is otherwise the same as
         * [SimCardServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<SimCardDeleteResponse>> =
            delete(id, SimCardDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: SimCardDeleteParams = SimCardDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimCardDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: SimCardDeleteParams = SimCardDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<SimCardDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: SimCardDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimCardDeleteResponse>>

        /** @see delete */
        fun delete(
            params: SimCardDeleteParams
        ): CompletableFuture<HttpResponseFor<SimCardDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimCardDeleteResponse>> =
            delete(id, SimCardDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /sim_cards/{id}/activation_code`, but is otherwise
         * the same as [SimCardServiceAsync.getActivationCode].
         */
        fun getActivationCode(
            id: String
        ): CompletableFuture<HttpResponseFor<SimCardGetActivationCodeResponse>> =
            getActivationCode(id, SimCardGetActivationCodeParams.none())

        /** @see getActivationCode */
        fun getActivationCode(
            id: String,
            params: SimCardGetActivationCodeParams = SimCardGetActivationCodeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimCardGetActivationCodeResponse>> =
            getActivationCode(params.toBuilder().id(id).build(), requestOptions)

        /** @see getActivationCode */
        fun getActivationCode(
            id: String,
            params: SimCardGetActivationCodeParams = SimCardGetActivationCodeParams.none(),
        ): CompletableFuture<HttpResponseFor<SimCardGetActivationCodeResponse>> =
            getActivationCode(id, params, RequestOptions.none())

        /** @see getActivationCode */
        fun getActivationCode(
            params: SimCardGetActivationCodeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimCardGetActivationCodeResponse>>

        /** @see getActivationCode */
        fun getActivationCode(
            params: SimCardGetActivationCodeParams
        ): CompletableFuture<HttpResponseFor<SimCardGetActivationCodeResponse>> =
            getActivationCode(params, RequestOptions.none())

        /** @see getActivationCode */
        fun getActivationCode(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimCardGetActivationCodeResponse>> =
            getActivationCode(id, SimCardGetActivationCodeParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /sim_cards/{id}/device_details`, but is otherwise
         * the same as [SimCardServiceAsync.getDeviceDetails].
         */
        fun getDeviceDetails(
            id: String
        ): CompletableFuture<HttpResponseFor<SimCardGetDeviceDetailsResponse>> =
            getDeviceDetails(id, SimCardGetDeviceDetailsParams.none())

        /** @see getDeviceDetails */
        fun getDeviceDetails(
            id: String,
            params: SimCardGetDeviceDetailsParams = SimCardGetDeviceDetailsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimCardGetDeviceDetailsResponse>> =
            getDeviceDetails(params.toBuilder().id(id).build(), requestOptions)

        /** @see getDeviceDetails */
        fun getDeviceDetails(
            id: String,
            params: SimCardGetDeviceDetailsParams = SimCardGetDeviceDetailsParams.none(),
        ): CompletableFuture<HttpResponseFor<SimCardGetDeviceDetailsResponse>> =
            getDeviceDetails(id, params, RequestOptions.none())

        /** @see getDeviceDetails */
        fun getDeviceDetails(
            params: SimCardGetDeviceDetailsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimCardGetDeviceDetailsResponse>>

        /** @see getDeviceDetails */
        fun getDeviceDetails(
            params: SimCardGetDeviceDetailsParams
        ): CompletableFuture<HttpResponseFor<SimCardGetDeviceDetailsResponse>> =
            getDeviceDetails(params, RequestOptions.none())

        /** @see getDeviceDetails */
        fun getDeviceDetails(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimCardGetDeviceDetailsResponse>> =
            getDeviceDetails(id, SimCardGetDeviceDetailsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /sim_cards/{id}/public_ip`, but is otherwise the
         * same as [SimCardServiceAsync.getPublicIp].
         */
        fun getPublicIp(
            id: String
        ): CompletableFuture<HttpResponseFor<SimCardGetPublicIpResponse>> =
            getPublicIp(id, SimCardGetPublicIpParams.none())

        /** @see getPublicIp */
        fun getPublicIp(
            id: String,
            params: SimCardGetPublicIpParams = SimCardGetPublicIpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimCardGetPublicIpResponse>> =
            getPublicIp(params.toBuilder().id(id).build(), requestOptions)

        /** @see getPublicIp */
        fun getPublicIp(
            id: String,
            params: SimCardGetPublicIpParams = SimCardGetPublicIpParams.none(),
        ): CompletableFuture<HttpResponseFor<SimCardGetPublicIpResponse>> =
            getPublicIp(id, params, RequestOptions.none())

        /** @see getPublicIp */
        fun getPublicIp(
            params: SimCardGetPublicIpParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimCardGetPublicIpResponse>>

        /** @see getPublicIp */
        fun getPublicIp(
            params: SimCardGetPublicIpParams
        ): CompletableFuture<HttpResponseFor<SimCardGetPublicIpResponse>> =
            getPublicIp(params, RequestOptions.none())

        /** @see getPublicIp */
        fun getPublicIp(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimCardGetPublicIpResponse>> =
            getPublicIp(id, SimCardGetPublicIpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /sim_cards/{id}/wireless_connectivity_logs`, but is
         * otherwise the same as [SimCardServiceAsync.listWirelessConnectivityLogs].
         */
        fun listWirelessConnectivityLogs(
            id: String
        ): CompletableFuture<HttpResponseFor<SimCardListWirelessConnectivityLogsResponse>> =
            listWirelessConnectivityLogs(id, SimCardListWirelessConnectivityLogsParams.none())

        /** @see listWirelessConnectivityLogs */
        fun listWirelessConnectivityLogs(
            id: String,
            params: SimCardListWirelessConnectivityLogsParams =
                SimCardListWirelessConnectivityLogsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimCardListWirelessConnectivityLogsResponse>> =
            listWirelessConnectivityLogs(params.toBuilder().id(id).build(), requestOptions)

        /** @see listWirelessConnectivityLogs */
        fun listWirelessConnectivityLogs(
            id: String,
            params: SimCardListWirelessConnectivityLogsParams =
                SimCardListWirelessConnectivityLogsParams.none(),
        ): CompletableFuture<HttpResponseFor<SimCardListWirelessConnectivityLogsResponse>> =
            listWirelessConnectivityLogs(id, params, RequestOptions.none())

        /** @see listWirelessConnectivityLogs */
        fun listWirelessConnectivityLogs(
            params: SimCardListWirelessConnectivityLogsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimCardListWirelessConnectivityLogsResponse>>

        /** @see listWirelessConnectivityLogs */
        fun listWirelessConnectivityLogs(
            params: SimCardListWirelessConnectivityLogsParams
        ): CompletableFuture<HttpResponseFor<SimCardListWirelessConnectivityLogsResponse>> =
            listWirelessConnectivityLogs(params, RequestOptions.none())

        /** @see listWirelessConnectivityLogs */
        fun listWirelessConnectivityLogs(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimCardListWirelessConnectivityLogsResponse>> =
            listWirelessConnectivityLogs(
                id,
                SimCardListWirelessConnectivityLogsParams.none(),
                requestOptions,
            )
    }
}
