// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.email

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.composeCancellableAsync
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
import com.telnyx.sdk.models.email.dedicatedips.DedicatedIpCreateParams
import com.telnyx.sdk.models.email.dedicatedips.DedicatedIpDeleteParams
import com.telnyx.sdk.models.email.dedicatedips.DedicatedIpListParams
import com.telnyx.sdk.models.email.dedicatedips.DedicatedIpListResponse
import com.telnyx.sdk.models.email.dedicatedips.DedicatedIpRetrieveParams
import com.telnyx.sdk.models.email.dedicatedips.DedicatedIpShowResponse
import com.telnyx.sdk.models.email.dedicatedips.DedicatedIpUpdateParams
import com.telnyx.sdk.services.async.email.dedicatedips.ActionServiceAsync
import com.telnyx.sdk.services.async.email.dedicatedips.ActionServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Purchase and manage dedicated sending IP addresses for your Telnyx email traffic. */
class DedicatedIpServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DedicatedIpServiceAsync {

    private val withRawResponse: DedicatedIpServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val actions: ActionServiceAsync by lazy { ActionServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): DedicatedIpServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DedicatedIpServiceAsync =
        DedicatedIpServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Purchase and manage dedicated sending IP addresses for your Telnyx email traffic. */
    override fun actions(): ActionServiceAsync = actions

    override fun create(
        params: DedicatedIpCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DedicatedIpShowResponse> =
        // post /email/dedicated_ips
        withRawResponse().create(params, requestOptions).mapCancellable { it.parse() }

    override fun retrieve(
        params: DedicatedIpRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DedicatedIpShowResponse> =
        // get /email/dedicated_ips/{id}
        withRawResponse().retrieve(params, requestOptions).mapCancellable { it.parse() }

    override fun update(
        params: DedicatedIpUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DedicatedIpShowResponse> =
        // patch /email/dedicated_ips/{id}
        withRawResponse().update(params, requestOptions).mapCancellable { it.parse() }

    override fun list(
        params: DedicatedIpListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DedicatedIpListResponse> =
        // get /email/dedicated_ips
        withRawResponse().list(params, requestOptions).mapCancellable { it.parse() }

    override fun delete(
        params: DedicatedIpDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DedicatedIpShowResponse> =
        // delete /email/dedicated_ips/{id}
        withRawResponse().delete(params, requestOptions).mapCancellable { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DedicatedIpServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val actions: ActionServiceAsync.WithRawResponse by lazy {
            ActionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DedicatedIpServiceAsync.WithRawResponse =
            DedicatedIpServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Purchase and manage dedicated sending IP addresses for your Telnyx email traffic. */
        override fun actions(): ActionServiceAsync.WithRawResponse = actions

        private val createHandler: Handler<DedicatedIpShowResponse> =
            jsonHandler<DedicatedIpShowResponse>(clientOptions.jsonMapper)

        override fun create(
            params: DedicatedIpCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DedicatedIpShowResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email", "dedicated_ips")
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

        private val retrieveHandler: Handler<DedicatedIpShowResponse> =
            jsonHandler<DedicatedIpShowResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: DedicatedIpRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DedicatedIpShowResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email", "dedicated_ips", params._pathParam(0))
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

        private val updateHandler: Handler<DedicatedIpShowResponse> =
            jsonHandler<DedicatedIpShowResponse>(clientOptions.jsonMapper)

        override fun update(
            params: DedicatedIpUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DedicatedIpShowResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email", "dedicated_ips", params._pathParam(0))
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

        private val listHandler: Handler<DedicatedIpListResponse> =
            jsonHandler<DedicatedIpListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: DedicatedIpListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DedicatedIpListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email", "dedicated_ips")
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

        private val deleteHandler: Handler<DedicatedIpShowResponse> =
            jsonHandler<DedicatedIpShowResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: DedicatedIpDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DedicatedIpShowResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email", "dedicated_ips", params._pathParam(0))
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
