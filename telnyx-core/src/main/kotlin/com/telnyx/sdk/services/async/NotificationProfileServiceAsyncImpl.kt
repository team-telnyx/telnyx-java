// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

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
import com.telnyx.sdk.models.notificationprofiles.NotificationProfileCreateParams
import com.telnyx.sdk.models.notificationprofiles.NotificationProfileCreateResponse
import com.telnyx.sdk.models.notificationprofiles.NotificationProfileDeleteParams
import com.telnyx.sdk.models.notificationprofiles.NotificationProfileDeleteResponse
import com.telnyx.sdk.models.notificationprofiles.NotificationProfileListParams
import com.telnyx.sdk.models.notificationprofiles.NotificationProfileListResponse
import com.telnyx.sdk.models.notificationprofiles.NotificationProfileRetrieveParams
import com.telnyx.sdk.models.notificationprofiles.NotificationProfileRetrieveResponse
import com.telnyx.sdk.models.notificationprofiles.NotificationProfileUpdateParams
import com.telnyx.sdk.models.notificationprofiles.NotificationProfileUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class NotificationProfileServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : NotificationProfileServiceAsync {

    private val withRawResponse: NotificationProfileServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): NotificationProfileServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): NotificationProfileServiceAsync =
        NotificationProfileServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun create(
        params: NotificationProfileCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotificationProfileCreateResponse> =
        // post /notification_profiles
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: NotificationProfileRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotificationProfileRetrieveResponse> =
        // get /notification_profiles/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: NotificationProfileUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotificationProfileUpdateResponse> =
        // patch /notification_profiles/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: NotificationProfileListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotificationProfileListResponse> =
        // get /notification_profiles
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: NotificationProfileDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotificationProfileDeleteResponse> =
        // delete /notification_profiles/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NotificationProfileServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NotificationProfileServiceAsync.WithRawResponse =
            NotificationProfileServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<NotificationProfileCreateResponse> =
            jsonHandler<NotificationProfileCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: NotificationProfileCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NotificationProfileCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("notification_profiles")
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

        private val retrieveHandler: Handler<NotificationProfileRetrieveResponse> =
            jsonHandler<NotificationProfileRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: NotificationProfileRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NotificationProfileRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("notification_profiles", params._pathParam(0))
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

        private val updateHandler: Handler<NotificationProfileUpdateResponse> =
            jsonHandler<NotificationProfileUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: NotificationProfileUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NotificationProfileUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("notification_profiles", params._pathParam(0))
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

        private val listHandler: Handler<NotificationProfileListResponse> =
            jsonHandler<NotificationProfileListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: NotificationProfileListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NotificationProfileListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("notification_profiles")
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

        private val deleteHandler: Handler<NotificationProfileDeleteResponse> =
            jsonHandler<NotificationProfileDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: NotificationProfileDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NotificationProfileDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("notification_profiles", params._pathParam(0))
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
