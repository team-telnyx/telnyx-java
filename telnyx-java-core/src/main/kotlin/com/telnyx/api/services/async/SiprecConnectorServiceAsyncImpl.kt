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
import com.telnyx.api.models.siprecconnectors.SiprecConnectorCreateParams
import com.telnyx.api.models.siprecconnectors.SiprecConnectorCreateResponse
import com.telnyx.api.models.siprecconnectors.SiprecConnectorDeleteParams
import com.telnyx.api.models.siprecconnectors.SiprecConnectorRetrieveParams
import com.telnyx.api.models.siprecconnectors.SiprecConnectorRetrieveResponse
import com.telnyx.api.models.siprecconnectors.SiprecConnectorUpdateParams
import com.telnyx.api.models.siprecconnectors.SiprecConnectorUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SiprecConnectorServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : SiprecConnectorServiceAsync {

    private val withRawResponse: SiprecConnectorServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SiprecConnectorServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): SiprecConnectorServiceAsync =
        SiprecConnectorServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: SiprecConnectorCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SiprecConnectorCreateResponse> =
        // post /siprec_connectors
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: SiprecConnectorRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SiprecConnectorRetrieveResponse> =
        // get /siprec_connectors/{connector_name}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: SiprecConnectorUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SiprecConnectorUpdateResponse> =
        // put /siprec_connectors/{connector_name}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: SiprecConnectorDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /siprec_connectors/{connector_name}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SiprecConnectorServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SiprecConnectorServiceAsync.WithRawResponse =
            SiprecConnectorServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<SiprecConnectorCreateResponse> =
            jsonHandler<SiprecConnectorCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: SiprecConnectorCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SiprecConnectorCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("siprec_connectors")
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

        private val retrieveHandler: Handler<SiprecConnectorRetrieveResponse> =
            jsonHandler<SiprecConnectorRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: SiprecConnectorRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SiprecConnectorRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("connectorName", params.connectorName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("siprec_connectors", params._pathParam(0))
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

        private val updateHandler: Handler<SiprecConnectorUpdateResponse> =
            jsonHandler<SiprecConnectorUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: SiprecConnectorUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SiprecConnectorUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("connectorName", params.connectorName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("siprec_connectors", params._pathParam(0))
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: SiprecConnectorDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("connectorName", params.connectorName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("siprec_connectors", params._pathParam(0))
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
