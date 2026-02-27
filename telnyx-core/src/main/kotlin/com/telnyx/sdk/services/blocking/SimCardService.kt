// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
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
import com.telnyx.sdk.models.simcards.SimCardListPage
import com.telnyx.sdk.models.simcards.SimCardListParams
import com.telnyx.sdk.models.simcards.SimCardListWirelessConnectivityLogsPage
import com.telnyx.sdk.models.simcards.SimCardListWirelessConnectivityLogsParams
import com.telnyx.sdk.models.simcards.SimCardRetrieveParams
import com.telnyx.sdk.models.simcards.SimCardRetrieveResponse
import com.telnyx.sdk.models.simcards.SimCardUpdateParams
import com.telnyx.sdk.models.simcards.SimCardUpdateResponse
import com.telnyx.sdk.services.blocking.simcards.ActionService
import java.util.function.Consumer

/** SIM Cards operations */
interface SimCardService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SimCardService

    fun actions(): ActionService

    /** Returns the details regarding a specific SIM card. */
    fun retrieve(id: String): SimCardRetrieveResponse = retrieve(id, SimCardRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: SimCardRetrieveParams = SimCardRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimCardRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: SimCardRetrieveParams = SimCardRetrieveParams.none(),
    ): SimCardRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SimCardRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimCardRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: SimCardRetrieveParams): SimCardRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): SimCardRetrieveResponse =
        retrieve(id, SimCardRetrieveParams.none(), requestOptions)

    /** Updates SIM card data */
    fun update(simCardId: String, params: SimCardUpdateParams): SimCardUpdateResponse =
        update(simCardId, params, RequestOptions.none())

    /** @see update */
    fun update(
        simCardId: String,
        params: SimCardUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimCardUpdateResponse =
        update(params.toBuilder().simCardId(simCardId).build(), requestOptions)

    /** @see update */
    fun update(params: SimCardUpdateParams): SimCardUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SimCardUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimCardUpdateResponse

    /** Get all SIM cards belonging to the user that match the given filters. */
    fun list(): SimCardListPage = list(SimCardListParams.none())

    /** @see list */
    fun list(
        params: SimCardListParams = SimCardListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimCardListPage

    /** @see list */
    fun list(params: SimCardListParams = SimCardListParams.none()): SimCardListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): SimCardListPage =
        list(SimCardListParams.none(), requestOptions)

    /**
     * The SIM card will be decommissioned, removed from your account and you will stop being
     * charged.<br />The SIM card won't be able to connect to the network after the deletion is
     * completed, thus making it impossible to consume data.<br/> Transitioning to the disabled
     * state may take a period of time. Until the transition is completed, the SIM card status will
     * be disabling <code>disabling</code>.<br />In order to re-enable the SIM card, you will need
     * to re-register it.
     */
    fun delete(id: String): SimCardDeleteResponse = delete(id, SimCardDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: SimCardDeleteParams = SimCardDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimCardDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: SimCardDeleteParams = SimCardDeleteParams.none(),
    ): SimCardDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SimCardDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimCardDeleteResponse

    /** @see delete */
    fun delete(params: SimCardDeleteParams): SimCardDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): SimCardDeleteResponse =
        delete(id, SimCardDeleteParams.none(), requestOptions)

    /**
     * It returns the activation code for an eSIM.<br/><br/> This API is only available for eSIMs.
     * If the given SIM is a physical SIM card, or has already been installed, an error will be
     * returned.
     */
    fun getActivationCode(id: String): SimCardGetActivationCodeResponse =
        getActivationCode(id, SimCardGetActivationCodeParams.none())

    /** @see getActivationCode */
    fun getActivationCode(
        id: String,
        params: SimCardGetActivationCodeParams = SimCardGetActivationCodeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimCardGetActivationCodeResponse =
        getActivationCode(params.toBuilder().id(id).build(), requestOptions)

    /** @see getActivationCode */
    fun getActivationCode(
        id: String,
        params: SimCardGetActivationCodeParams = SimCardGetActivationCodeParams.none(),
    ): SimCardGetActivationCodeResponse = getActivationCode(id, params, RequestOptions.none())

    /** @see getActivationCode */
    fun getActivationCode(
        params: SimCardGetActivationCodeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimCardGetActivationCodeResponse

    /** @see getActivationCode */
    fun getActivationCode(
        params: SimCardGetActivationCodeParams
    ): SimCardGetActivationCodeResponse = getActivationCode(params, RequestOptions.none())

    /** @see getActivationCode */
    fun getActivationCode(
        id: String,
        requestOptions: RequestOptions,
    ): SimCardGetActivationCodeResponse =
        getActivationCode(id, SimCardGetActivationCodeParams.none(), requestOptions)

    /** It returns the device details where a SIM card is currently being used. */
    fun getDeviceDetails(id: String): SimCardGetDeviceDetailsResponse =
        getDeviceDetails(id, SimCardGetDeviceDetailsParams.none())

    /** @see getDeviceDetails */
    fun getDeviceDetails(
        id: String,
        params: SimCardGetDeviceDetailsParams = SimCardGetDeviceDetailsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimCardGetDeviceDetailsResponse =
        getDeviceDetails(params.toBuilder().id(id).build(), requestOptions)

    /** @see getDeviceDetails */
    fun getDeviceDetails(
        id: String,
        params: SimCardGetDeviceDetailsParams = SimCardGetDeviceDetailsParams.none(),
    ): SimCardGetDeviceDetailsResponse = getDeviceDetails(id, params, RequestOptions.none())

    /** @see getDeviceDetails */
    fun getDeviceDetails(
        params: SimCardGetDeviceDetailsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimCardGetDeviceDetailsResponse

    /** @see getDeviceDetails */
    fun getDeviceDetails(params: SimCardGetDeviceDetailsParams): SimCardGetDeviceDetailsResponse =
        getDeviceDetails(params, RequestOptions.none())

    /** @see getDeviceDetails */
    fun getDeviceDetails(
        id: String,
        requestOptions: RequestOptions,
    ): SimCardGetDeviceDetailsResponse =
        getDeviceDetails(id, SimCardGetDeviceDetailsParams.none(), requestOptions)

    /** It returns the public IP requested for a SIM card. */
    fun getPublicIp(id: String): SimCardGetPublicIpResponse =
        getPublicIp(id, SimCardGetPublicIpParams.none())

    /** @see getPublicIp */
    fun getPublicIp(
        id: String,
        params: SimCardGetPublicIpParams = SimCardGetPublicIpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimCardGetPublicIpResponse = getPublicIp(params.toBuilder().id(id).build(), requestOptions)

    /** @see getPublicIp */
    fun getPublicIp(
        id: String,
        params: SimCardGetPublicIpParams = SimCardGetPublicIpParams.none(),
    ): SimCardGetPublicIpResponse = getPublicIp(id, params, RequestOptions.none())

    /** @see getPublicIp */
    fun getPublicIp(
        params: SimCardGetPublicIpParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimCardGetPublicIpResponse

    /** @see getPublicIp */
    fun getPublicIp(params: SimCardGetPublicIpParams): SimCardGetPublicIpResponse =
        getPublicIp(params, RequestOptions.none())

    /** @see getPublicIp */
    fun getPublicIp(id: String, requestOptions: RequestOptions): SimCardGetPublicIpResponse =
        getPublicIp(id, SimCardGetPublicIpParams.none(), requestOptions)

    /**
     * This API allows listing a paginated collection of Wireless Connectivity Logs associated with
     * a SIM Card, for troubleshooting purposes.
     */
    fun listWirelessConnectivityLogs(id: String): SimCardListWirelessConnectivityLogsPage =
        listWirelessConnectivityLogs(id, SimCardListWirelessConnectivityLogsParams.none())

    /** @see listWirelessConnectivityLogs */
    fun listWirelessConnectivityLogs(
        id: String,
        params: SimCardListWirelessConnectivityLogsParams =
            SimCardListWirelessConnectivityLogsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimCardListWirelessConnectivityLogsPage =
        listWirelessConnectivityLogs(params.toBuilder().id(id).build(), requestOptions)

    /** @see listWirelessConnectivityLogs */
    fun listWirelessConnectivityLogs(
        id: String,
        params: SimCardListWirelessConnectivityLogsParams =
            SimCardListWirelessConnectivityLogsParams.none(),
    ): SimCardListWirelessConnectivityLogsPage =
        listWirelessConnectivityLogs(id, params, RequestOptions.none())

    /** @see listWirelessConnectivityLogs */
    fun listWirelessConnectivityLogs(
        params: SimCardListWirelessConnectivityLogsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimCardListWirelessConnectivityLogsPage

    /** @see listWirelessConnectivityLogs */
    fun listWirelessConnectivityLogs(
        params: SimCardListWirelessConnectivityLogsParams
    ): SimCardListWirelessConnectivityLogsPage =
        listWirelessConnectivityLogs(params, RequestOptions.none())

    /** @see listWirelessConnectivityLogs */
    fun listWirelessConnectivityLogs(
        id: String,
        requestOptions: RequestOptions,
    ): SimCardListWirelessConnectivityLogsPage =
        listWirelessConnectivityLogs(
            id,
            SimCardListWirelessConnectivityLogsParams.none(),
            requestOptions,
        )

    /** A view of [SimCardService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SimCardService.WithRawResponse

        fun actions(): ActionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /sim_cards/{id}`, but is otherwise the same as
         * [SimCardService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<SimCardRetrieveResponse> =
            retrieve(id, SimCardRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: SimCardRetrieveParams = SimCardRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimCardRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: SimCardRetrieveParams = SimCardRetrieveParams.none(),
        ): HttpResponseFor<SimCardRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: SimCardRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimCardRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: SimCardRetrieveParams): HttpResponseFor<SimCardRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimCardRetrieveResponse> =
            retrieve(id, SimCardRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /sim_cards/{id}`, but is otherwise the same as
         * [SimCardService.update].
         */
        @MustBeClosed
        fun update(
            simCardId: String,
            params: SimCardUpdateParams,
        ): HttpResponseFor<SimCardUpdateResponse> = update(simCardId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            simCardId: String,
            params: SimCardUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimCardUpdateResponse> =
            update(params.toBuilder().simCardId(simCardId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: SimCardUpdateParams): HttpResponseFor<SimCardUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: SimCardUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimCardUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /sim_cards`, but is otherwise the same as
         * [SimCardService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<SimCardListPage> = list(SimCardListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SimCardListParams = SimCardListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimCardListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: SimCardListParams = SimCardListParams.none()
        ): HttpResponseFor<SimCardListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SimCardListPage> =
            list(SimCardListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /sim_cards/{id}`, but is otherwise the same as
         * [SimCardService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<SimCardDeleteResponse> =
            delete(id, SimCardDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: SimCardDeleteParams = SimCardDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimCardDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: SimCardDeleteParams = SimCardDeleteParams.none(),
        ): HttpResponseFor<SimCardDeleteResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: SimCardDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimCardDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: SimCardDeleteParams): HttpResponseFor<SimCardDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimCardDeleteResponse> =
            delete(id, SimCardDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /sim_cards/{id}/activation_code`, but is otherwise
         * the same as [SimCardService.getActivationCode].
         */
        @MustBeClosed
        fun getActivationCode(id: String): HttpResponseFor<SimCardGetActivationCodeResponse> =
            getActivationCode(id, SimCardGetActivationCodeParams.none())

        /** @see getActivationCode */
        @MustBeClosed
        fun getActivationCode(
            id: String,
            params: SimCardGetActivationCodeParams = SimCardGetActivationCodeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimCardGetActivationCodeResponse> =
            getActivationCode(params.toBuilder().id(id).build(), requestOptions)

        /** @see getActivationCode */
        @MustBeClosed
        fun getActivationCode(
            id: String,
            params: SimCardGetActivationCodeParams = SimCardGetActivationCodeParams.none(),
        ): HttpResponseFor<SimCardGetActivationCodeResponse> =
            getActivationCode(id, params, RequestOptions.none())

        /** @see getActivationCode */
        @MustBeClosed
        fun getActivationCode(
            params: SimCardGetActivationCodeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimCardGetActivationCodeResponse>

        /** @see getActivationCode */
        @MustBeClosed
        fun getActivationCode(
            params: SimCardGetActivationCodeParams
        ): HttpResponseFor<SimCardGetActivationCodeResponse> =
            getActivationCode(params, RequestOptions.none())

        /** @see getActivationCode */
        @MustBeClosed
        fun getActivationCode(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimCardGetActivationCodeResponse> =
            getActivationCode(id, SimCardGetActivationCodeParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /sim_cards/{id}/device_details`, but is otherwise
         * the same as [SimCardService.getDeviceDetails].
         */
        @MustBeClosed
        fun getDeviceDetails(id: String): HttpResponseFor<SimCardGetDeviceDetailsResponse> =
            getDeviceDetails(id, SimCardGetDeviceDetailsParams.none())

        /** @see getDeviceDetails */
        @MustBeClosed
        fun getDeviceDetails(
            id: String,
            params: SimCardGetDeviceDetailsParams = SimCardGetDeviceDetailsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimCardGetDeviceDetailsResponse> =
            getDeviceDetails(params.toBuilder().id(id).build(), requestOptions)

        /** @see getDeviceDetails */
        @MustBeClosed
        fun getDeviceDetails(
            id: String,
            params: SimCardGetDeviceDetailsParams = SimCardGetDeviceDetailsParams.none(),
        ): HttpResponseFor<SimCardGetDeviceDetailsResponse> =
            getDeviceDetails(id, params, RequestOptions.none())

        /** @see getDeviceDetails */
        @MustBeClosed
        fun getDeviceDetails(
            params: SimCardGetDeviceDetailsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimCardGetDeviceDetailsResponse>

        /** @see getDeviceDetails */
        @MustBeClosed
        fun getDeviceDetails(
            params: SimCardGetDeviceDetailsParams
        ): HttpResponseFor<SimCardGetDeviceDetailsResponse> =
            getDeviceDetails(params, RequestOptions.none())

        /** @see getDeviceDetails */
        @MustBeClosed
        fun getDeviceDetails(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimCardGetDeviceDetailsResponse> =
            getDeviceDetails(id, SimCardGetDeviceDetailsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /sim_cards/{id}/public_ip`, but is otherwise the
         * same as [SimCardService.getPublicIp].
         */
        @MustBeClosed
        fun getPublicIp(id: String): HttpResponseFor<SimCardGetPublicIpResponse> =
            getPublicIp(id, SimCardGetPublicIpParams.none())

        /** @see getPublicIp */
        @MustBeClosed
        fun getPublicIp(
            id: String,
            params: SimCardGetPublicIpParams = SimCardGetPublicIpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimCardGetPublicIpResponse> =
            getPublicIp(params.toBuilder().id(id).build(), requestOptions)

        /** @see getPublicIp */
        @MustBeClosed
        fun getPublicIp(
            id: String,
            params: SimCardGetPublicIpParams = SimCardGetPublicIpParams.none(),
        ): HttpResponseFor<SimCardGetPublicIpResponse> =
            getPublicIp(id, params, RequestOptions.none())

        /** @see getPublicIp */
        @MustBeClosed
        fun getPublicIp(
            params: SimCardGetPublicIpParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimCardGetPublicIpResponse>

        /** @see getPublicIp */
        @MustBeClosed
        fun getPublicIp(
            params: SimCardGetPublicIpParams
        ): HttpResponseFor<SimCardGetPublicIpResponse> = getPublicIp(params, RequestOptions.none())

        /** @see getPublicIp */
        @MustBeClosed
        fun getPublicIp(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimCardGetPublicIpResponse> =
            getPublicIp(id, SimCardGetPublicIpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /sim_cards/{id}/wireless_connectivity_logs`, but is
         * otherwise the same as [SimCardService.listWirelessConnectivityLogs].
         */
        @MustBeClosed
        fun listWirelessConnectivityLogs(
            id: String
        ): HttpResponseFor<SimCardListWirelessConnectivityLogsPage> =
            listWirelessConnectivityLogs(id, SimCardListWirelessConnectivityLogsParams.none())

        /** @see listWirelessConnectivityLogs */
        @MustBeClosed
        fun listWirelessConnectivityLogs(
            id: String,
            params: SimCardListWirelessConnectivityLogsParams =
                SimCardListWirelessConnectivityLogsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimCardListWirelessConnectivityLogsPage> =
            listWirelessConnectivityLogs(params.toBuilder().id(id).build(), requestOptions)

        /** @see listWirelessConnectivityLogs */
        @MustBeClosed
        fun listWirelessConnectivityLogs(
            id: String,
            params: SimCardListWirelessConnectivityLogsParams =
                SimCardListWirelessConnectivityLogsParams.none(),
        ): HttpResponseFor<SimCardListWirelessConnectivityLogsPage> =
            listWirelessConnectivityLogs(id, params, RequestOptions.none())

        /** @see listWirelessConnectivityLogs */
        @MustBeClosed
        fun listWirelessConnectivityLogs(
            params: SimCardListWirelessConnectivityLogsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimCardListWirelessConnectivityLogsPage>

        /** @see listWirelessConnectivityLogs */
        @MustBeClosed
        fun listWirelessConnectivityLogs(
            params: SimCardListWirelessConnectivityLogsParams
        ): HttpResponseFor<SimCardListWirelessConnectivityLogsPage> =
            listWirelessConnectivityLogs(params, RequestOptions.none())

        /** @see listWirelessConnectivityLogs */
        @MustBeClosed
        fun listWirelessConnectivityLogs(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimCardListWirelessConnectivityLogsPage> =
            listWirelessConnectivityLogs(
                id,
                SimCardListWirelessConnectivityLogsParams.none(),
                requestOptions,
            )
    }
}
