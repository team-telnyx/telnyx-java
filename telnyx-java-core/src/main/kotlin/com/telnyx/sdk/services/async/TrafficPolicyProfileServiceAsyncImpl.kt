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
import com.telnyx.sdk.models.trafficpolicyprofiles.TrafficPolicyProfileCreateParams
import com.telnyx.sdk.models.trafficpolicyprofiles.TrafficPolicyProfileCreateResponse
import com.telnyx.sdk.models.trafficpolicyprofiles.TrafficPolicyProfileDeleteParams
import com.telnyx.sdk.models.trafficpolicyprofiles.TrafficPolicyProfileDeleteResponse
import com.telnyx.sdk.models.trafficpolicyprofiles.TrafficPolicyProfileListPageAsync
import com.telnyx.sdk.models.trafficpolicyprofiles.TrafficPolicyProfileListPageResponse
import com.telnyx.sdk.models.trafficpolicyprofiles.TrafficPolicyProfileListParams
import com.telnyx.sdk.models.trafficpolicyprofiles.TrafficPolicyProfileListServicesPageAsync
import com.telnyx.sdk.models.trafficpolicyprofiles.TrafficPolicyProfileListServicesPageResponse
import com.telnyx.sdk.models.trafficpolicyprofiles.TrafficPolicyProfileListServicesParams
import com.telnyx.sdk.models.trafficpolicyprofiles.TrafficPolicyProfileRetrieveParams
import com.telnyx.sdk.models.trafficpolicyprofiles.TrafficPolicyProfileRetrieveResponse
import com.telnyx.sdk.models.trafficpolicyprofiles.TrafficPolicyProfileUpdateParams
import com.telnyx.sdk.models.trafficpolicyprofiles.TrafficPolicyProfileUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Traffic Policy Profiles operations */
class TrafficPolicyProfileServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : TrafficPolicyProfileServiceAsync {

    private val withRawResponse: TrafficPolicyProfileServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TrafficPolicyProfileServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): TrafficPolicyProfileServiceAsync =
        TrafficPolicyProfileServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun create(
        params: TrafficPolicyProfileCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TrafficPolicyProfileCreateResponse> =
        // post /traffic_policy_profiles
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: TrafficPolicyProfileRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TrafficPolicyProfileRetrieveResponse> =
        // get /traffic_policy_profiles/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: TrafficPolicyProfileUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TrafficPolicyProfileUpdateResponse> =
        // patch /traffic_policy_profiles/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: TrafficPolicyProfileListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TrafficPolicyProfileListPageAsync> =
        // get /traffic_policy_profiles
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: TrafficPolicyProfileDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TrafficPolicyProfileDeleteResponse> =
        // delete /traffic_policy_profiles/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun listServices(
        params: TrafficPolicyProfileListServicesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TrafficPolicyProfileListServicesPageAsync> =
        // get /traffic_policy_profiles/services
        withRawResponse().listServices(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TrafficPolicyProfileServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TrafficPolicyProfileServiceAsync.WithRawResponse =
            TrafficPolicyProfileServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<TrafficPolicyProfileCreateResponse> =
            jsonHandler<TrafficPolicyProfileCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: TrafficPolicyProfileCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TrafficPolicyProfileCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("traffic_policy_profiles")
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

        private val retrieveHandler: Handler<TrafficPolicyProfileRetrieveResponse> =
            jsonHandler<TrafficPolicyProfileRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: TrafficPolicyProfileRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TrafficPolicyProfileRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("traffic_policy_profiles", params._pathParam(0))
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

        private val updateHandler: Handler<TrafficPolicyProfileUpdateResponse> =
            jsonHandler<TrafficPolicyProfileUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: TrafficPolicyProfileUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TrafficPolicyProfileUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("traffic_policy_profiles", params._pathParam(0))
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

        private val listHandler: Handler<TrafficPolicyProfileListPageResponse> =
            jsonHandler<TrafficPolicyProfileListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: TrafficPolicyProfileListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TrafficPolicyProfileListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("traffic_policy_profiles")
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
                            .let {
                                TrafficPolicyProfileListPageAsync.builder()
                                    .service(TrafficPolicyProfileServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<TrafficPolicyProfileDeleteResponse> =
            jsonHandler<TrafficPolicyProfileDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: TrafficPolicyProfileDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TrafficPolicyProfileDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("traffic_policy_profiles", params._pathParam(0))
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

        private val listServicesHandler: Handler<TrafficPolicyProfileListServicesPageResponse> =
            jsonHandler<TrafficPolicyProfileListServicesPageResponse>(clientOptions.jsonMapper)

        override fun listServices(
            params: TrafficPolicyProfileListServicesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TrafficPolicyProfileListServicesPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("traffic_policy_profiles", "services")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listServicesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                TrafficPolicyProfileListServicesPageAsync.builder()
                                    .service(TrafficPolicyProfileServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }
    }
}
