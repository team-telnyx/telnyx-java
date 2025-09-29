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
import com.telnyx.api.models.callcontrolapplications.CallControlApplicationCreateParams
import com.telnyx.api.models.callcontrolapplications.CallControlApplicationCreateResponse
import com.telnyx.api.models.callcontrolapplications.CallControlApplicationDeleteParams
import com.telnyx.api.models.callcontrolapplications.CallControlApplicationDeleteResponse
import com.telnyx.api.models.callcontrolapplications.CallControlApplicationListParams
import com.telnyx.api.models.callcontrolapplications.CallControlApplicationListResponse
import com.telnyx.api.models.callcontrolapplications.CallControlApplicationRetrieveParams
import com.telnyx.api.models.callcontrolapplications.CallControlApplicationRetrieveResponse
import com.telnyx.api.models.callcontrolapplications.CallControlApplicationUpdateParams
import com.telnyx.api.models.callcontrolapplications.CallControlApplicationUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CallControlApplicationServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    CallControlApplicationServiceAsync {

    private val withRawResponse: CallControlApplicationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CallControlApplicationServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): CallControlApplicationServiceAsync =
        CallControlApplicationServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun create(
        params: CallControlApplicationCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CallControlApplicationCreateResponse> =
        // post /call_control_applications
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: CallControlApplicationRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CallControlApplicationRetrieveResponse> =
        // get /call_control_applications/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: CallControlApplicationUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CallControlApplicationUpdateResponse> =
        // patch /call_control_applications/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: CallControlApplicationListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CallControlApplicationListResponse> =
        // get /call_control_applications
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: CallControlApplicationDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CallControlApplicationDeleteResponse> =
        // delete /call_control_applications/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CallControlApplicationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CallControlApplicationServiceAsync.WithRawResponse =
            CallControlApplicationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<CallControlApplicationCreateResponse> =
            jsonHandler<CallControlApplicationCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: CallControlApplicationCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CallControlApplicationCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("call_control_applications")
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

        private val retrieveHandler: Handler<CallControlApplicationRetrieveResponse> =
            jsonHandler<CallControlApplicationRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CallControlApplicationRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CallControlApplicationRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("call_control_applications", params._pathParam(0))
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

        private val updateHandler: Handler<CallControlApplicationUpdateResponse> =
            jsonHandler<CallControlApplicationUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: CallControlApplicationUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CallControlApplicationUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("call_control_applications", params._pathParam(0))
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

        private val listHandler: Handler<CallControlApplicationListResponse> =
            jsonHandler<CallControlApplicationListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CallControlApplicationListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CallControlApplicationListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("call_control_applications")
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

        private val deleteHandler: Handler<CallControlApplicationDeleteResponse> =
            jsonHandler<CallControlApplicationDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: CallControlApplicationDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CallControlApplicationDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("call_control_applications", params._pathParam(0))
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
