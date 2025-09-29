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
import com.telnyx.api.models.messagingprofiles.MessagingProfileCreateParams
import com.telnyx.api.models.messagingprofiles.MessagingProfileCreateResponse
import com.telnyx.api.models.messagingprofiles.MessagingProfileDeleteParams
import com.telnyx.api.models.messagingprofiles.MessagingProfileDeleteResponse
import com.telnyx.api.models.messagingprofiles.MessagingProfileListParams
import com.telnyx.api.models.messagingprofiles.MessagingProfileListPhoneNumbersParams
import com.telnyx.api.models.messagingprofiles.MessagingProfileListPhoneNumbersResponse
import com.telnyx.api.models.messagingprofiles.MessagingProfileListResponse
import com.telnyx.api.models.messagingprofiles.MessagingProfileListShortCodesParams
import com.telnyx.api.models.messagingprofiles.MessagingProfileListShortCodesResponse
import com.telnyx.api.models.messagingprofiles.MessagingProfileRetrieveParams
import com.telnyx.api.models.messagingprofiles.MessagingProfileRetrieveResponse
import com.telnyx.api.models.messagingprofiles.MessagingProfileUpdateParams
import com.telnyx.api.models.messagingprofiles.MessagingProfileUpdateResponse
import com.telnyx.api.services.async.messagingprofiles.AutorespConfigServiceAsync
import com.telnyx.api.services.async.messagingprofiles.AutorespConfigServiceAsyncImpl
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

    override fun withRawResponse(): MessagingProfileServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): MessagingProfileServiceAsync =
        MessagingProfileServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun autorespConfigs(): AutorespConfigServiceAsync = autorespConfigs

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
    ): CompletableFuture<MessagingProfileListResponse> =
        // get /messaging_profiles
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: MessagingProfileDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessagingProfileDeleteResponse> =
        // delete /messaging_profiles/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun listPhoneNumbers(
        params: MessagingProfileListPhoneNumbersParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessagingProfileListPhoneNumbersResponse> =
        // get /messaging_profiles/{id}/phone_numbers
        withRawResponse().listPhoneNumbers(params, requestOptions).thenApply { it.parse() }

    override fun listShortCodes(
        params: MessagingProfileListShortCodesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessagingProfileListShortCodesResponse> =
        // get /messaging_profiles/{id}/short_codes
        withRawResponse().listShortCodes(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MessagingProfileServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val autorespConfigs: AutorespConfigServiceAsync.WithRawResponse by lazy {
            AutorespConfigServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MessagingProfileServiceAsync.WithRawResponse =
            MessagingProfileServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun autorespConfigs(): AutorespConfigServiceAsync.WithRawResponse = autorespConfigs

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
            checkRequired("id", params.id().getOrNull())
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
            checkRequired("pathId", params.pathId().getOrNull())
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

        private val listHandler: Handler<MessagingProfileListResponse> =
            jsonHandler<MessagingProfileListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: MessagingProfileListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessagingProfileListResponse>> {
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
            checkRequired("id", params.id().getOrNull())
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

        private val listPhoneNumbersHandler: Handler<MessagingProfileListPhoneNumbersResponse> =
            jsonHandler<MessagingProfileListPhoneNumbersResponse>(clientOptions.jsonMapper)

        override fun listPhoneNumbers(
            params: MessagingProfileListPhoneNumbersParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessagingProfileListPhoneNumbersResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
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
                    }
                }
        }

        private val listShortCodesHandler: Handler<MessagingProfileListShortCodesResponse> =
            jsonHandler<MessagingProfileListShortCodesResponse>(clientOptions.jsonMapper)

        override fun listShortCodes(
            params: MessagingProfileListShortCodesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessagingProfileListShortCodesResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
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
                    }
                }
        }
    }
}
