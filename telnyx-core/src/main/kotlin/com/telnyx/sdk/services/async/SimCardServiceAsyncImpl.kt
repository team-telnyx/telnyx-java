// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.handlers.errorBodyHandler
import com.telnyx.sdk.core.handlers.errorHandler
import com.telnyx.sdk.core.handlers.jsonHandler
import com.telnyx.sdk.core.http.HttpMethod
import com.telnyx.sdk.core.http.HttpRequest
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponse.Handler
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.core.http.json
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepareAsync
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
import com.telnyx.sdk.services.async.simcards.ActionServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SimCardServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SimCardServiceAsync {

    private val withRawResponse: SimCardServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val actions: ActionServiceAsync by lazy { ActionServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): SimCardServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SimCardServiceAsync =
        SimCardServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun actions(): ActionServiceAsync = actions

    override fun retrieve(
        params: SimCardRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimCardRetrieveResponse> =
        // get /sim_cards/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: SimCardUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimCardUpdateResponse> =
        // patch /sim_cards/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: SimCardListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimCardListResponse> =
        // get /sim_cards
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: SimCardDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimCardDeleteResponse> =
        // delete /sim_cards/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun getActivationCode(
        params: SimCardGetActivationCodeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimCardGetActivationCodeResponse> =
        // get /sim_cards/{id}/activation_code
        withRawResponse().getActivationCode(params, requestOptions).thenApply { it.parse() }

    override fun getDeviceDetails(
        params: SimCardGetDeviceDetailsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimCardGetDeviceDetailsResponse> =
        // get /sim_cards/{id}/device_details
        withRawResponse().getDeviceDetails(params, requestOptions).thenApply { it.parse() }

    override fun getPublicIp(
        params: SimCardGetPublicIpParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimCardGetPublicIpResponse> =
        // get /sim_cards/{id}/public_ip
        withRawResponse().getPublicIp(params, requestOptions).thenApply { it.parse() }

    override fun listWirelessConnectivityLogs(
        params: SimCardListWirelessConnectivityLogsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimCardListWirelessConnectivityLogsResponse> =
        // get /sim_cards/{id}/wireless_connectivity_logs
        withRawResponse().listWirelessConnectivityLogs(params, requestOptions).thenApply {
            it.parse()
        }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SimCardServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val actions: ActionServiceAsync.WithRawResponse by lazy {
            ActionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SimCardServiceAsync.WithRawResponse =
            SimCardServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun actions(): ActionServiceAsync.WithRawResponse = actions

        private val retrieveHandler: Handler<SimCardRetrieveResponse> =
            jsonHandler<SimCardRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: SimCardRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimCardRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sim_cards", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<SimCardUpdateResponse> =
            jsonHandler<SimCardUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: SimCardUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimCardUpdateResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<SimCardListResponse> =
            jsonHandler<SimCardListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: SimCardListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimCardListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sim_cards")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteHandler: Handler<SimCardDeleteResponse> =
            jsonHandler<SimCardDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: SimCardDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimCardDeleteResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deleteHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getActivationCodeHandler: Handler<SimCardGetActivationCodeResponse> =
            jsonHandler<SimCardGetActivationCodeResponse>(clientOptions.jsonMapper)

        override fun getActivationCode(
            params: SimCardGetActivationCodeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimCardGetActivationCodeResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sim_cards", params._pathParam(0), "activation_code")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getActivationCodeHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getDeviceDetailsHandler: Handler<SimCardGetDeviceDetailsResponse> =
            jsonHandler<SimCardGetDeviceDetailsResponse>(clientOptions.jsonMapper)

        override fun getDeviceDetails(
            params: SimCardGetDeviceDetailsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimCardGetDeviceDetailsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sim_cards", params._pathParam(0), "device_details")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getDeviceDetailsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getPublicIpHandler: Handler<SimCardGetPublicIpResponse> =
            jsonHandler<SimCardGetPublicIpResponse>(clientOptions.jsonMapper)

        override fun getPublicIp(
            params: SimCardGetPublicIpParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimCardGetPublicIpResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sim_cards", params._pathParam(0), "public_ip")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getPublicIpHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
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
        ): CompletableFuture<HttpResponseFor<SimCardListWirelessConnectivityLogsResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
