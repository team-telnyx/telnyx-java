// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.phonenumbers

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
import com.telnyx.sdk.models.phonenumbers.messaging.MessagingListParams
import com.telnyx.sdk.models.phonenumbers.messaging.MessagingListResponse
import com.telnyx.sdk.models.phonenumbers.messaging.MessagingRetrieveParams
import com.telnyx.sdk.models.phonenumbers.messaging.MessagingRetrieveResponse
import com.telnyx.sdk.models.phonenumbers.messaging.MessagingUpdateParams
import com.telnyx.sdk.models.phonenumbers.messaging.MessagingUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class MessagingServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    MessagingServiceAsync {

    private val withRawResponse: MessagingServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MessagingServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessagingServiceAsync =
        MessagingServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: MessagingRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessagingRetrieveResponse> =
        // get /phone_numbers/{id}/messaging
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: MessagingUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessagingUpdateResponse> =
        // patch /phone_numbers/{id}/messaging
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: MessagingListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessagingListResponse> =
        // get /phone_numbers/messaging
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MessagingServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MessagingServiceAsync.WithRawResponse =
            MessagingServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<MessagingRetrieveResponse> =
            jsonHandler<MessagingRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: MessagingRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessagingRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("phone_numbers", params._pathParam(0), "messaging")
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

        private val updateHandler: Handler<MessagingUpdateResponse> =
            jsonHandler<MessagingUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: MessagingUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessagingUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("phone_numbers", params._pathParam(0), "messaging")
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

        private val listHandler: Handler<MessagingListResponse> =
            jsonHandler<MessagingListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: MessagingListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessagingListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("phone_numbers", "messaging")
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
    }
}
