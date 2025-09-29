// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

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
import com.telnyx.api.core.prepareAsync
import com.telnyx.api.models.simcarddatausagenotifications.SimCardDataUsageNotificationCreateParams
import com.telnyx.api.models.simcarddatausagenotifications.SimCardDataUsageNotificationCreateResponse
import com.telnyx.api.models.simcarddatausagenotifications.SimCardDataUsageNotificationDeleteParams
import com.telnyx.api.models.simcarddatausagenotifications.SimCardDataUsageNotificationDeleteResponse
import com.telnyx.api.models.simcarddatausagenotifications.SimCardDataUsageNotificationListParams
import com.telnyx.api.models.simcarddatausagenotifications.SimCardDataUsageNotificationListResponse
import com.telnyx.api.models.simcarddatausagenotifications.SimCardDataUsageNotificationRetrieveParams
import com.telnyx.api.models.simcarddatausagenotifications.SimCardDataUsageNotificationRetrieveResponse
import com.telnyx.api.models.simcarddatausagenotifications.SimCardDataUsageNotificationUpdateParams
import com.telnyx.api.models.simcarddatausagenotifications.SimCardDataUsageNotificationUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SimCardDataUsageNotificationServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    SimCardDataUsageNotificationServiceAsync {

    private val withRawResponse: SimCardDataUsageNotificationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SimCardDataUsageNotificationServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): SimCardDataUsageNotificationServiceAsync =
        SimCardDataUsageNotificationServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun create(
        params: SimCardDataUsageNotificationCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimCardDataUsageNotificationCreateResponse> =
        // post /sim_card_data_usage_notifications
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: SimCardDataUsageNotificationRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimCardDataUsageNotificationRetrieveResponse> =
        // get /sim_card_data_usage_notifications/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: SimCardDataUsageNotificationUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimCardDataUsageNotificationUpdateResponse> =
        // patch /sim_card_data_usage_notifications/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: SimCardDataUsageNotificationListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimCardDataUsageNotificationListResponse> =
        // get /sim_card_data_usage_notifications
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: SimCardDataUsageNotificationDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimCardDataUsageNotificationDeleteResponse> =
        // delete /sim_card_data_usage_notifications/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SimCardDataUsageNotificationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SimCardDataUsageNotificationServiceAsync.WithRawResponse =
            SimCardDataUsageNotificationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<SimCardDataUsageNotificationCreateResponse> =
            jsonHandler<SimCardDataUsageNotificationCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: SimCardDataUsageNotificationCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimCardDataUsageNotificationCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sim_card_data_usage_notifications")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<SimCardDataUsageNotificationRetrieveResponse> =
            jsonHandler<SimCardDataUsageNotificationRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: SimCardDataUsageNotificationRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimCardDataUsageNotificationRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sim_card_data_usage_notifications", params._pathParam(0))
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

        private val updateHandler: Handler<SimCardDataUsageNotificationUpdateResponse> =
            jsonHandler<SimCardDataUsageNotificationUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: SimCardDataUsageNotificationUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimCardDataUsageNotificationUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sim_card_data_usage_notifications", params._pathParam(0))
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

        private val listHandler: Handler<SimCardDataUsageNotificationListResponse> =
            jsonHandler<SimCardDataUsageNotificationListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: SimCardDataUsageNotificationListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimCardDataUsageNotificationListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sim_card_data_usage_notifications")
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

        private val deleteHandler: Handler<SimCardDataUsageNotificationDeleteResponse> =
            jsonHandler<SimCardDataUsageNotificationDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: SimCardDataUsageNotificationDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimCardDataUsageNotificationDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sim_card_data_usage_notifications", params._pathParam(0))
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
    }
}
