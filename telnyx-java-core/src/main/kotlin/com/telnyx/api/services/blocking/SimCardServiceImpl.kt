// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.handlers.errorBodyHandler
import com.telnyx.api.core.handlers.errorHandler
import com.telnyx.api.core.handlers.jsonHandler
import com.telnyx.api.core.http.HttpMethod
import com.telnyx.api.core.http.HttpRequest
import com.telnyx.api.core.http.HttpResponse
import com.telnyx.api.core.http.HttpResponse.Handler
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.core.http.json
import com.telnyx.api.core.http.parseable
import com.telnyx.api.core.prepare
import com.telnyx.api.models.simcards.SimCardDeleteParams
import com.telnyx.api.models.simcards.SimCardDeleteResponse
import com.telnyx.api.models.simcards.SimCardGetActivationCodeParams
import com.telnyx.api.models.simcards.SimCardGetActivationCodeResponse
import com.telnyx.api.models.simcards.SimCardGetDeviceDetailsParams
import com.telnyx.api.models.simcards.SimCardGetDeviceDetailsResponse
import com.telnyx.api.models.simcards.SimCardGetPublicIpParams
import com.telnyx.api.models.simcards.SimCardGetPublicIpResponse
import com.telnyx.api.models.simcards.SimCardListParams
import com.telnyx.api.models.simcards.SimCardListResponse
import com.telnyx.api.models.simcards.SimCardListWirelessConnectivityLogsParams
import com.telnyx.api.models.simcards.SimCardListWirelessConnectivityLogsResponse
import com.telnyx.api.models.simcards.SimCardRetrieveParams
import com.telnyx.api.models.simcards.SimCardRetrieveResponse
import com.telnyx.api.models.simcards.SimCardUpdateParams
import com.telnyx.api.models.simcards.SimCardUpdateResponse
import com.telnyx.api.services.blocking.simcards.ActionService
import com.telnyx.api.services.blocking.simcards.ActionServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SimCardServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SimCardService {

    private val withRawResponse: SimCardService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val actions: ActionService by lazy { ActionServiceImpl(clientOptions) }

    override fun withRawResponse(): SimCardService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SimCardService =
        SimCardServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun actions(): ActionService = actions

    override fun retrieve(
        params: SimCardRetrieveParams,
        requestOptions: RequestOptions,
    ): SimCardRetrieveResponse =
        // get /sim_cards/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: SimCardUpdateParams,
        requestOptions: RequestOptions,
    ): SimCardUpdateResponse =
        // patch /sim_cards/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: SimCardListParams,
        requestOptions: RequestOptions,
    ): SimCardListResponse =
        // get /sim_cards
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: SimCardDeleteParams,
        requestOptions: RequestOptions,
    ): SimCardDeleteResponse =
        // delete /sim_cards/{id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun getActivationCode(
        params: SimCardGetActivationCodeParams,
        requestOptions: RequestOptions,
    ): SimCardGetActivationCodeResponse =
        // get /sim_cards/{id}/activation_code
        withRawResponse().getActivationCode(params, requestOptions).parse()

    override fun getDeviceDetails(
        params: SimCardGetDeviceDetailsParams,
        requestOptions: RequestOptions,
    ): SimCardGetDeviceDetailsResponse =
        // get /sim_cards/{id}/device_details
        withRawResponse().getDeviceDetails(params, requestOptions).parse()

    override fun getPublicIp(
        params: SimCardGetPublicIpParams,
        requestOptions: RequestOptions,
    ): SimCardGetPublicIpResponse =
        // get /sim_cards/{id}/public_ip
        withRawResponse().getPublicIp(params, requestOptions).parse()

    override fun listWirelessConnectivityLogs(
        params: SimCardListWirelessConnectivityLogsParams,
        requestOptions: RequestOptions,
    ): SimCardListWirelessConnectivityLogsResponse =
        // get /sim_cards/{id}/wireless_connectivity_logs
        withRawResponse().listWirelessConnectivityLogs(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SimCardService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val actions: ActionService.WithRawResponse by lazy {
            ActionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SimCardService.WithRawResponse =
            SimCardServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun actions(): ActionService.WithRawResponse = actions

        private val retrieveHandler: Handler<SimCardRetrieveResponse> =
            jsonHandler<SimCardRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: SimCardRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimCardRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sim_cards", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<SimCardUpdateResponse> =
            jsonHandler<SimCardUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: SimCardUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimCardUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sim_cards", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<SimCardListResponse> =
            jsonHandler<SimCardListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: SimCardListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimCardListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sim_cards")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteHandler: Handler<SimCardDeleteResponse> =
            jsonHandler<SimCardDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: SimCardDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimCardDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sim_cards", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getActivationCodeHandler: Handler<SimCardGetActivationCodeResponse> =
            jsonHandler<SimCardGetActivationCodeResponse>(clientOptions.jsonMapper)

        override fun getActivationCode(
            params: SimCardGetActivationCodeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimCardGetActivationCodeResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sim_cards", params._pathParam(0), "activation_code")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getActivationCodeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getDeviceDetailsHandler: Handler<SimCardGetDeviceDetailsResponse> =
            jsonHandler<SimCardGetDeviceDetailsResponse>(clientOptions.jsonMapper)

        override fun getDeviceDetails(
            params: SimCardGetDeviceDetailsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimCardGetDeviceDetailsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sim_cards", params._pathParam(0), "device_details")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getDeviceDetailsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getPublicIpHandler: Handler<SimCardGetPublicIpResponse> =
            jsonHandler<SimCardGetPublicIpResponse>(clientOptions.jsonMapper)

        override fun getPublicIp(
            params: SimCardGetPublicIpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimCardGetPublicIpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sim_cards", params._pathParam(0), "public_ip")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getPublicIpHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listWirelessConnectivityLogsHandler:
            Handler<SimCardListWirelessConnectivityLogsResponse> =
            jsonHandler<SimCardListWirelessConnectivityLogsResponse>(clientOptions.jsonMapper)

        override fun listWirelessConnectivityLogs(
            params: SimCardListWirelessConnectivityLogsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimCardListWirelessConnectivityLogsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "sim_cards",
                        params._pathParam(0),
                        "wireless_connectivity_logs",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listWirelessConnectivityLogsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
