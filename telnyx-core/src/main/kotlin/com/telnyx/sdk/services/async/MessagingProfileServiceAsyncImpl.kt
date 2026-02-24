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
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileCreateParams
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileCreateResponse
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileDeleteParams
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileDeleteResponse
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileListAlphanumericSenderIdsPageAsync
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileListAlphanumericSenderIdsPageResponse
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileListAlphanumericSenderIdsParams
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileListPageAsync
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileListPageResponse
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileListParams
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileListPhoneNumbersPageAsync
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileListPhoneNumbersPageResponse
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileListPhoneNumbersParams
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileListShortCodesPageAsync
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileListShortCodesPageResponse
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileListShortCodesParams
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileRetrieveMetricsParams
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileRetrieveMetricsResponse
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileRetrieveParams
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileRetrieveResponse
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileUpdateParams
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileUpdateResponse
import com.telnyx.sdk.services.async.messagingprofiles.ActionServiceAsync
import com.telnyx.sdk.services.async.messagingprofiles.ActionServiceAsyncImpl
import com.telnyx.sdk.services.async.messagingprofiles.AutorespConfigServiceAsync
import com.telnyx.sdk.services.async.messagingprofiles.AutorespConfigServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class MessagingProfileServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : MessagingProfileServiceAsync {

    private val withRawResponse: MessagingProfileServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val autorespConfigs: AutorespConfigServiceAsync by lazy {
        AutorespConfigServiceAsyncImpl(clientOptions)
    }

    private val actions: ActionServiceAsync by lazy { ActionServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): MessagingProfileServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): MessagingProfileServiceAsync =
        MessagingProfileServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun autorespConfigs(): AutorespConfigServiceAsync = autorespConfigs

    override fun actions(): ActionServiceAsync = actions

    override fun create(
        params: MessagingProfileCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessagingProfileCreateResponse> =
        // post /messaging_profiles
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: MessagingProfileRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessagingProfileRetrieveResponse> =
        // get /messaging_profiles/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: MessagingProfileUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessagingProfileUpdateResponse> =
        // patch /messaging_profiles/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: MessagingProfileListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessagingProfileListPageAsync> =
        // get /messaging_profiles
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: MessagingProfileDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessagingProfileDeleteResponse> =
        // delete /messaging_profiles/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun listAlphanumericSenderIds(
        params: MessagingProfileListAlphanumericSenderIdsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessagingProfileListAlphanumericSenderIdsPageAsync> =
        // get /messaging_profiles/{id}/alphanumeric_sender_ids
        withRawResponse().listAlphanumericSenderIds(params, requestOptions).thenApply { it.parse() }

    override fun listPhoneNumbers(
        params: MessagingProfileListPhoneNumbersParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessagingProfileListPhoneNumbersPageAsync> =
        // get /messaging_profiles/{id}/phone_numbers
        withRawResponse().listPhoneNumbers(params, requestOptions).thenApply { it.parse() }

    override fun listShortCodes(
        params: MessagingProfileListShortCodesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessagingProfileListShortCodesPageAsync> =
        // get /messaging_profiles/{id}/short_codes
        withRawResponse().listShortCodes(params, requestOptions).thenApply { it.parse() }

    override fun retrieveMetrics(
        params: MessagingProfileRetrieveMetricsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessagingProfileRetrieveMetricsResponse> =
        // get /messaging_profiles/{id}/metrics
        withRawResponse().retrieveMetrics(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MessagingProfileServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val autorespConfigs: AutorespConfigServiceAsync.WithRawResponse by lazy {
            AutorespConfigServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val actions: ActionServiceAsync.WithRawResponse by lazy {
            ActionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MessagingProfileServiceAsync.WithRawResponse =
            MessagingProfileServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun autorespConfigs(): AutorespConfigServiceAsync.WithRawResponse = autorespConfigs

        override fun actions(): ActionServiceAsync.WithRawResponse = actions

        private val createHandler: Handler<MessagingProfileCreateResponse> =
            jsonHandler<MessagingProfileCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: MessagingProfileCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessagingProfileCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("messaging_profiles")
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

        private val retrieveHandler: Handler<MessagingProfileRetrieveResponse> =
            jsonHandler<MessagingProfileRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: MessagingProfileRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessagingProfileRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("messagingProfileId", params.messagingProfileId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("messaging_profiles", params._pathParam(0))
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

        private val updateHandler: Handler<MessagingProfileUpdateResponse> =
            jsonHandler<MessagingProfileUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: MessagingProfileUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessagingProfileUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("messagingProfileId", params.messagingProfileId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("messaging_profiles", params._pathParam(0))
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

        private val listHandler: Handler<MessagingProfileListPageResponse> =
            jsonHandler<MessagingProfileListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: MessagingProfileListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessagingProfileListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("messaging_profiles")
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
                                MessagingProfileListPageAsync.builder()
                                    .service(MessagingProfileServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<MessagingProfileDeleteResponse> =
            jsonHandler<MessagingProfileDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: MessagingProfileDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessagingProfileDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("messagingProfileId", params.messagingProfileId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("messaging_profiles", params._pathParam(0))
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

        private val listAlphanumericSenderIdsHandler:
            Handler<MessagingProfileListAlphanumericSenderIdsPageResponse> =
            jsonHandler<MessagingProfileListAlphanumericSenderIdsPageResponse>(
                clientOptions.jsonMapper
            )

        override fun listAlphanumericSenderIds(
            params: MessagingProfileListAlphanumericSenderIdsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessagingProfileListAlphanumericSenderIdsPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "messaging_profiles",
                        params._pathParam(0),
                        "alphanumeric_sender_ids",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listAlphanumericSenderIdsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                MessagingProfileListAlphanumericSenderIdsPageAsync.builder()
                                    .service(MessagingProfileServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val listPhoneNumbersHandler: Handler<MessagingProfileListPhoneNumbersPageResponse> =
            jsonHandler<MessagingProfileListPhoneNumbersPageResponse>(clientOptions.jsonMapper)

        override fun listPhoneNumbers(
            params: MessagingProfileListPhoneNumbersParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessagingProfileListPhoneNumbersPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("messagingProfileId", params.messagingProfileId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("messaging_profiles", params._pathParam(0), "phone_numbers")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listPhoneNumbersHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                MessagingProfileListPhoneNumbersPageAsync.builder()
                                    .service(MessagingProfileServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val listShortCodesHandler: Handler<MessagingProfileListShortCodesPageResponse> =
            jsonHandler<MessagingProfileListShortCodesPageResponse>(clientOptions.jsonMapper)

        override fun listShortCodes(
            params: MessagingProfileListShortCodesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessagingProfileListShortCodesPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("messagingProfileId", params.messagingProfileId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("messaging_profiles", params._pathParam(0), "short_codes")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listShortCodesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                MessagingProfileListShortCodesPageAsync.builder()
                                    .service(MessagingProfileServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val retrieveMetricsHandler: Handler<MessagingProfileRetrieveMetricsResponse> =
            jsonHandler<MessagingProfileRetrieveMetricsResponse>(clientOptions.jsonMapper)

        override fun retrieveMetrics(
            params: MessagingProfileRetrieveMetricsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessagingProfileRetrieveMetricsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("messaging_profiles", params._pathParam(0), "metrics")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveMetricsHandler.handle(it) }
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
