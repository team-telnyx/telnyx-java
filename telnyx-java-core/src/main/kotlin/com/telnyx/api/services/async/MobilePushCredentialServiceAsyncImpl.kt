// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.handlers.emptyHandler
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
import com.telnyx.api.models.mobilepushcredentials.MobilePushCredentialCreateParams
import com.telnyx.api.models.mobilepushcredentials.MobilePushCredentialDeleteParams
import com.telnyx.api.models.mobilepushcredentials.MobilePushCredentialListParams
import com.telnyx.api.models.mobilepushcredentials.MobilePushCredentialListResponse
import com.telnyx.api.models.mobilepushcredentials.MobilePushCredentialRetrieveParams
import com.telnyx.api.models.mobilepushcredentials.PushCredentialResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class MobilePushCredentialServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : MobilePushCredentialServiceAsync {

    private val withRawResponse: MobilePushCredentialServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MobilePushCredentialServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): MobilePushCredentialServiceAsync =
        MobilePushCredentialServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun create(
        params: MobilePushCredentialCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PushCredentialResponse> =
        // post /mobile_push_credentials
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: MobilePushCredentialRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PushCredentialResponse> =
        // get /mobile_push_credentials/{push_credential_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: MobilePushCredentialListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MobilePushCredentialListResponse> =
        // get /mobile_push_credentials
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: MobilePushCredentialDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /mobile_push_credentials/{push_credential_id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MobilePushCredentialServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MobilePushCredentialServiceAsync.WithRawResponse =
            MobilePushCredentialServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<PushCredentialResponse> =
            jsonHandler<PushCredentialResponse>(clientOptions.jsonMapper)

        override fun create(
            params: MobilePushCredentialCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PushCredentialResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("mobile_push_credentials")
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

        private val retrieveHandler: Handler<PushCredentialResponse> =
            jsonHandler<PushCredentialResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: MobilePushCredentialRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PushCredentialResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pushCredentialId", params.pushCredentialId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("mobile_push_credentials", params._pathParam(0))
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

        private val listHandler: Handler<MobilePushCredentialListResponse> =
            jsonHandler<MobilePushCredentialListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: MobilePushCredentialListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MobilePushCredentialListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("mobile_push_credentials")
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
            params: MobilePushCredentialDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pushCredentialId", params.pushCredentialId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("mobile_push_credentials", params._pathParam(0))
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
