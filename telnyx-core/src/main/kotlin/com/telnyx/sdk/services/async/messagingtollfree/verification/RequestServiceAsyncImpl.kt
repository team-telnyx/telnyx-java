// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.messagingtollfree.verification

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.checkRequired
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
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.messagingtollfree.verification.requests.RequestCreateParams
import com.telnyx.sdk.models.messagingtollfree.verification.requests.RequestDeleteParams
import com.telnyx.sdk.models.messagingtollfree.verification.requests.RequestListParams
import com.telnyx.sdk.models.messagingtollfree.verification.requests.RequestListResponse
import com.telnyx.sdk.models.messagingtollfree.verification.requests.RequestRetrieveParams
import com.telnyx.sdk.models.messagingtollfree.verification.requests.RequestUpdateParams
import com.telnyx.sdk.models.messagingtollfree.verification.requests.VerificationRequestEgress
import com.telnyx.sdk.models.messagingtollfree.verification.requests.VerificationRequestStatus
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RequestServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    RequestServiceAsync {

    private val withRawResponse: RequestServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RequestServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RequestServiceAsync =
        RequestServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: RequestCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VerificationRequestEgress> =
        // post /messaging_tollfree/verification/requests
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: RequestRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VerificationRequestStatus> =
        // get /messaging_tollfree/verification/requests/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: RequestUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VerificationRequestEgress> =
        // patch /messaging_tollfree/verification/requests/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: RequestListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RequestListResponse> =
        // get /messaging_tollfree/verification/requests
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: RequestDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /messaging_tollfree/verification/requests/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RequestServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RequestServiceAsync.WithRawResponse =
            RequestServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<VerificationRequestEgress> =
            jsonHandler<VerificationRequestEgress>(clientOptions.jsonMapper)

        override fun create(
            params: RequestCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VerificationRequestEgress>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("messaging_tollfree", "verification", "requests")
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

        private val retrieveHandler: Handler<VerificationRequestStatus> =
            jsonHandler<VerificationRequestStatus>(clientOptions.jsonMapper)

        override fun retrieve(
            params: RequestRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VerificationRequestStatus>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "messaging_tollfree",
                        "verification",
                        "requests",
                        params._pathParam(0),
                    )
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

        private val updateHandler: Handler<VerificationRequestEgress> =
            jsonHandler<VerificationRequestEgress>(clientOptions.jsonMapper)

        override fun update(
            params: RequestUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VerificationRequestEgress>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "messaging_tollfree",
                        "verification",
                        "requests",
                        params._pathParam(0),
                    )
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

        private val listHandler: Handler<RequestListResponse> =
            jsonHandler<RequestListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: RequestListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RequestListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("messaging_tollfree", "verification", "requests")
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: RequestDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "messaging_tollfree",
                        "verification",
                        "requests",
                        params._pathParam(0),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }
    }
}
