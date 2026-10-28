// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.email

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.composeCancellableAsync
import com.telnyx.sdk.core.handlers.emptyHandler
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
import com.telnyx.sdk.core.mapCancellable
import com.telnyx.sdk.core.ownResponse
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.email.ippools.IpPoolCreateParams
import com.telnyx.sdk.models.email.ippools.IpPoolDeleteParams
import com.telnyx.sdk.models.email.ippools.IpPoolListParams
import com.telnyx.sdk.models.email.ippools.IpPoolListResponse
import com.telnyx.sdk.models.email.ippools.IpPoolRetrieveParams
import com.telnyx.sdk.models.email.ippools.IpPoolShowResponse
import com.telnyx.sdk.models.email.ippools.IpPoolUpdateParams
import com.telnyx.sdk.services.async.email.ippools.IpServiceAsync
import com.telnyx.sdk.services.async.email.ippools.IpServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Group dedicated IPs into pools for sending. */
class IpPoolServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    IpPoolServiceAsync {

    private val withRawResponse: IpPoolServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val ips: IpServiceAsync by lazy { IpServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): IpPoolServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): IpPoolServiceAsync =
        IpPoolServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Group dedicated IPs into pools for sending. */
    override fun ips(): IpServiceAsync = ips

    override fun create(
        params: IpPoolCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IpPoolShowResponse> =
        // post /email/ip_pools
        withRawResponse().create(params, requestOptions).mapCancellable { it.parse() }

    override fun retrieve(
        params: IpPoolRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IpPoolShowResponse> =
        // get /email/ip_pools/{id}
        withRawResponse().retrieve(params, requestOptions).mapCancellable { it.parse() }

    override fun update(
        params: IpPoolUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IpPoolShowResponse> =
        // patch /email/ip_pools/{id}
        withRawResponse().update(params, requestOptions).mapCancellable { it.parse() }

    override fun list(
        params: IpPoolListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IpPoolListResponse> =
        // get /email/ip_pools
        withRawResponse().list(params, requestOptions).mapCancellable { it.parse() }

    override fun delete(
        params: IpPoolDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /email/ip_pools/{id}
        withRawResponse().delete(params, requestOptions).mapCancellable { null }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IpPoolServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val ips: IpServiceAsync.WithRawResponse by lazy {
            IpServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IpPoolServiceAsync.WithRawResponse =
            IpPoolServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Group dedicated IPs into pools for sending. */
        override fun ips(): IpServiceAsync.WithRawResponse = ips

        private val createHandler: Handler<IpPoolShowResponse> =
            jsonHandler<IpPoolShowResponse>(clientOptions.jsonMapper)

        override fun create(
            params: IpPoolCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IpPoolShowResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email", "ip_pools")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .composeCancellableAsync {
                    clientOptions.httpClient.executeAsync(it, requestOptions).ownResponse()
                }
                .mapCancellable { response ->
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

        private val retrieveHandler: Handler<IpPoolShowResponse> =
            jsonHandler<IpPoolShowResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: IpPoolRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IpPoolShowResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email", "ip_pools", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .composeCancellableAsync {
                    clientOptions.httpClient.executeAsync(it, requestOptions).ownResponse()
                }
                .mapCancellable { response ->
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

        private val updateHandler: Handler<IpPoolShowResponse> =
            jsonHandler<IpPoolShowResponse>(clientOptions.jsonMapper)

        override fun update(
            params: IpPoolUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IpPoolShowResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email", "ip_pools", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .composeCancellableAsync {
                    clientOptions.httpClient.executeAsync(it, requestOptions).ownResponse()
                }
                .mapCancellable { response ->
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

        private val listHandler: Handler<IpPoolListResponse> =
            jsonHandler<IpPoolListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: IpPoolListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IpPoolListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email", "ip_pools")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .composeCancellableAsync {
                    clientOptions.httpClient.executeAsync(it, requestOptions).ownResponse()
                }
                .mapCancellable { response ->
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: IpPoolDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email", "ip_pools", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .composeCancellableAsync {
                    clientOptions.httpClient.executeAsync(it, requestOptions).ownResponse()
                }
                .mapCancellable { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }
    }
}
