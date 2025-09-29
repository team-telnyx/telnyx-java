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
import com.telnyx.api.models.notificationchannels.NotificationChannelCreateParams
import com.telnyx.api.models.notificationchannels.NotificationChannelCreateResponse
import com.telnyx.api.models.notificationchannels.NotificationChannelDeleteParams
import com.telnyx.api.models.notificationchannels.NotificationChannelDeleteResponse
import com.telnyx.api.models.notificationchannels.NotificationChannelListParams
import com.telnyx.api.models.notificationchannels.NotificationChannelListResponse
import com.telnyx.api.models.notificationchannels.NotificationChannelRetrieveParams
import com.telnyx.api.models.notificationchannels.NotificationChannelRetrieveResponse
import com.telnyx.api.models.notificationchannels.NotificationChannelUpdateParams
import com.telnyx.api.models.notificationchannels.NotificationChannelUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class NotificationChannelServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : NotificationChannelServiceAsync {

    private val withRawResponse: NotificationChannelServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): NotificationChannelServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): NotificationChannelServiceAsync =
        NotificationChannelServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun create(
        params: NotificationChannelCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotificationChannelCreateResponse> =
        // post /notification_channels
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: NotificationChannelRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotificationChannelRetrieveResponse> =
        // get /notification_channels/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: NotificationChannelUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotificationChannelUpdateResponse> =
        // patch /notification_channels/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: NotificationChannelListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotificationChannelListResponse> =
        // get /notification_channels
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: NotificationChannelDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotificationChannelDeleteResponse> =
        // delete /notification_channels/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NotificationChannelServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NotificationChannelServiceAsync.WithRawResponse =
            NotificationChannelServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<NotificationChannelCreateResponse> =
            jsonHandler<NotificationChannelCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: NotificationChannelCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NotificationChannelCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("notification_channels")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
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

        private val retrieveHandler: Handler<NotificationChannelRetrieveResponse> =
            jsonHandler<NotificationChannelRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: NotificationChannelRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NotificationChannelRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("notification_channels", params._pathParam(0))
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

        private val updateHandler: Handler<NotificationChannelUpdateResponse> =
            jsonHandler<NotificationChannelUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: NotificationChannelUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NotificationChannelUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("notification_channels", params._pathParam(0))
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

        private val listHandler: Handler<NotificationChannelListResponse> =
            jsonHandler<NotificationChannelListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: NotificationChannelListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NotificationChannelListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("notification_channels")
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

        private val deleteHandler: Handler<NotificationChannelDeleteResponse> =
            jsonHandler<NotificationChannelDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: NotificationChannelDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NotificationChannelDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("notification_channels", params._pathParam(0))
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
