// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.handlers.errorBodyHandler
import com.telnyx.api.core.handlers.errorHandler
import com.telnyx.api.core.handlers.jsonHandler
import com.telnyx.api.core.handlers.stringHandler
import com.telnyx.api.core.http.HttpMethod
import com.telnyx.api.core.http.HttpRequest
import com.telnyx.api.core.http.HttpResponse
import com.telnyx.api.core.http.HttpResponse.Handler
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.core.http.json
import com.telnyx.api.core.http.parseable
import com.telnyx.api.core.prepareAsync
import com.telnyx.api.models.telephonycredentials.TelephonyCredentialCreateParams
import com.telnyx.api.models.telephonycredentials.TelephonyCredentialCreateResponse
import com.telnyx.api.models.telephonycredentials.TelephonyCredentialCreateTokenParams
import com.telnyx.api.models.telephonycredentials.TelephonyCredentialDeleteParams
import com.telnyx.api.models.telephonycredentials.TelephonyCredentialDeleteResponse
import com.telnyx.api.models.telephonycredentials.TelephonyCredentialListParams
import com.telnyx.api.models.telephonycredentials.TelephonyCredentialListResponse
import com.telnyx.api.models.telephonycredentials.TelephonyCredentialRetrieveParams
import com.telnyx.api.models.telephonycredentials.TelephonyCredentialRetrieveResponse
import com.telnyx.api.models.telephonycredentials.TelephonyCredentialUpdateParams
import com.telnyx.api.models.telephonycredentials.TelephonyCredentialUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class TelephonyCredentialServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : TelephonyCredentialServiceAsync {

    private val withRawResponse: TelephonyCredentialServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TelephonyCredentialServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): TelephonyCredentialServiceAsync =
        TelephonyCredentialServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun create(
        params: TelephonyCredentialCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TelephonyCredentialCreateResponse> =
        // post /telephony_credentials
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: TelephonyCredentialRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TelephonyCredentialRetrieveResponse> =
        // get /telephony_credentials/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: TelephonyCredentialUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TelephonyCredentialUpdateResponse> =
        // patch /telephony_credentials/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: TelephonyCredentialListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TelephonyCredentialListResponse> =
        // get /telephony_credentials
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: TelephonyCredentialDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TelephonyCredentialDeleteResponse> =
        // delete /telephony_credentials/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun createToken(
        params: TelephonyCredentialCreateTokenParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<String> =
        // post /telephony_credentials/{id}/token
        withRawResponse().createToken(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TelephonyCredentialServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TelephonyCredentialServiceAsync.WithRawResponse =
            TelephonyCredentialServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<TelephonyCredentialCreateResponse> =
            jsonHandler<TelephonyCredentialCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: TelephonyCredentialCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TelephonyCredentialCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("telephony_credentials")
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

        private val retrieveHandler: Handler<TelephonyCredentialRetrieveResponse> =
            jsonHandler<TelephonyCredentialRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: TelephonyCredentialRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TelephonyCredentialRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("telephony_credentials", params._pathParam(0))
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

        private val updateHandler: Handler<TelephonyCredentialUpdateResponse> =
            jsonHandler<TelephonyCredentialUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: TelephonyCredentialUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TelephonyCredentialUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("telephony_credentials", params._pathParam(0))
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

        private val listHandler: Handler<TelephonyCredentialListResponse> =
            jsonHandler<TelephonyCredentialListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: TelephonyCredentialListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TelephonyCredentialListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("telephony_credentials")
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

        private val deleteHandler: Handler<TelephonyCredentialDeleteResponse> =
            jsonHandler<TelephonyCredentialDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: TelephonyCredentialDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TelephonyCredentialDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("telephony_credentials", params._pathParam(0))
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

        private val createTokenHandler: Handler<String> = stringHandler()

        override fun createToken(
            params: TelephonyCredentialCreateTokenParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<String>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("telephony_credentials", params._pathParam(0), "token")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { createTokenHandler.handle(it) }
                    }
                }
        }
    }
}
