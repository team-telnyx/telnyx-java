// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

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
import com.telnyx.sdk.models.mobilepushcredentials.MobilePushCredentialCreateParams
import com.telnyx.sdk.models.mobilepushcredentials.MobilePushCredentialDeleteParams
import com.telnyx.sdk.models.mobilepushcredentials.MobilePushCredentialListPageAsync
import com.telnyx.sdk.models.mobilepushcredentials.MobilePushCredentialListPageResponse
import com.telnyx.sdk.models.mobilepushcredentials.MobilePushCredentialListParams
import com.telnyx.sdk.models.mobilepushcredentials.MobilePushCredentialRetrieveParams
import com.telnyx.sdk.models.mobilepushcredentials.PushCredentialResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Mobile push credential management */
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
    ): CompletableFuture<MobilePushCredentialListPageAsync> =
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

        private val listHandler: Handler<MobilePushCredentialListPageResponse> =
            jsonHandler<MobilePushCredentialListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: MobilePushCredentialListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MobilePushCredentialListPageAsync>> {
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
                            .let {
                                MobilePushCredentialListPageAsync.builder()
                                    .service(MobilePushCredentialServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
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
