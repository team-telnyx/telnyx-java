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
import com.telnyx.sdk.models.externalconnections.ExternalConnectionCreateParams
import com.telnyx.sdk.models.externalconnections.ExternalConnectionCreateResponse
import com.telnyx.sdk.models.externalconnections.ExternalConnectionDeleteParams
import com.telnyx.sdk.models.externalconnections.ExternalConnectionDeleteResponse
import com.telnyx.sdk.models.externalconnections.ExternalConnectionListPageAsync
import com.telnyx.sdk.models.externalconnections.ExternalConnectionListPageResponse
import com.telnyx.sdk.models.externalconnections.ExternalConnectionListParams
import com.telnyx.sdk.models.externalconnections.ExternalConnectionRetrieveParams
import com.telnyx.sdk.models.externalconnections.ExternalConnectionRetrieveResponse
import com.telnyx.sdk.models.externalconnections.ExternalConnectionUpdateLocationParams
import com.telnyx.sdk.models.externalconnections.ExternalConnectionUpdateLocationResponse
import com.telnyx.sdk.models.externalconnections.ExternalConnectionUpdateParams
import com.telnyx.sdk.models.externalconnections.ExternalConnectionUpdateResponse
import com.telnyx.sdk.services.async.externalconnections.CivicAddressServiceAsync
import com.telnyx.sdk.services.async.externalconnections.CivicAddressServiceAsyncImpl
import com.telnyx.sdk.services.async.externalconnections.LogMessageServiceAsync
import com.telnyx.sdk.services.async.externalconnections.LogMessageServiceAsyncImpl
import com.telnyx.sdk.services.async.externalconnections.PhoneNumberServiceAsync
import com.telnyx.sdk.services.async.externalconnections.PhoneNumberServiceAsyncImpl
import com.telnyx.sdk.services.async.externalconnections.ReleaseServiceAsync
import com.telnyx.sdk.services.async.externalconnections.ReleaseServiceAsyncImpl
import com.telnyx.sdk.services.async.externalconnections.UploadServiceAsync
import com.telnyx.sdk.services.async.externalconnections.UploadServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ExternalConnectionServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : ExternalConnectionServiceAsync {

    private val withRawResponse: ExternalConnectionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val logMessages: LogMessageServiceAsync by lazy {
        LogMessageServiceAsyncImpl(clientOptions)
    }

    private val civicAddresses: CivicAddressServiceAsync by lazy {
        CivicAddressServiceAsyncImpl(clientOptions)
    }

    private val phoneNumbers: PhoneNumberServiceAsync by lazy {
        PhoneNumberServiceAsyncImpl(clientOptions)
    }

    private val releases: ReleaseServiceAsync by lazy { ReleaseServiceAsyncImpl(clientOptions) }

    private val uploads: UploadServiceAsync by lazy { UploadServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ExternalConnectionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): ExternalConnectionServiceAsync =
        ExternalConnectionServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun logMessages(): LogMessageServiceAsync = logMessages

    override fun civicAddresses(): CivicAddressServiceAsync = civicAddresses

    override fun phoneNumbers(): PhoneNumberServiceAsync = phoneNumbers

    override fun releases(): ReleaseServiceAsync = releases

    override fun uploads(): UploadServiceAsync = uploads

    override fun create(
        params: ExternalConnectionCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalConnectionCreateResponse> =
        // post /external_connections
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: ExternalConnectionRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalConnectionRetrieveResponse> =
        // get /external_connections/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: ExternalConnectionUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalConnectionUpdateResponse> =
        // patch /external_connections/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: ExternalConnectionListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalConnectionListPageAsync> =
        // get /external_connections
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: ExternalConnectionDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalConnectionDeleteResponse> =
        // delete /external_connections/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun updateLocation(
        params: ExternalConnectionUpdateLocationParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalConnectionUpdateLocationResponse> =
        // patch /external_connections/{id}/locations/{location_id}
        withRawResponse().updateLocation(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExternalConnectionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val logMessages: LogMessageServiceAsync.WithRawResponse by lazy {
            LogMessageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val civicAddresses: CivicAddressServiceAsync.WithRawResponse by lazy {
            CivicAddressServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val phoneNumbers: PhoneNumberServiceAsync.WithRawResponse by lazy {
            PhoneNumberServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val releases: ReleaseServiceAsync.WithRawResponse by lazy {
            ReleaseServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val uploads: UploadServiceAsync.WithRawResponse by lazy {
            UploadServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExternalConnectionServiceAsync.WithRawResponse =
            ExternalConnectionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun logMessages(): LogMessageServiceAsync.WithRawResponse = logMessages

        override fun civicAddresses(): CivicAddressServiceAsync.WithRawResponse = civicAddresses

        override fun phoneNumbers(): PhoneNumberServiceAsync.WithRawResponse = phoneNumbers

        override fun releases(): ReleaseServiceAsync.WithRawResponse = releases

        override fun uploads(): UploadServiceAsync.WithRawResponse = uploads

        private val createHandler: Handler<ExternalConnectionCreateResponse> =
            jsonHandler<ExternalConnectionCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ExternalConnectionCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalConnectionCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("external_connections")
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

        private val retrieveHandler: Handler<ExternalConnectionRetrieveResponse> =
            jsonHandler<ExternalConnectionRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ExternalConnectionRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalConnectionRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("external_connections", params._pathParam(0))
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

        private val updateHandler: Handler<ExternalConnectionUpdateResponse> =
            jsonHandler<ExternalConnectionUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: ExternalConnectionUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalConnectionUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("external_connections", params._pathParam(0))
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

        private val listHandler: Handler<ExternalConnectionListPageResponse> =
            jsonHandler<ExternalConnectionListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ExternalConnectionListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalConnectionListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("external_connections")
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
                                ExternalConnectionListPageAsync.builder()
                                    .service(ExternalConnectionServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<ExternalConnectionDeleteResponse> =
            jsonHandler<ExternalConnectionDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: ExternalConnectionDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalConnectionDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("external_connections", params._pathParam(0))
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

        private val updateLocationHandler: Handler<ExternalConnectionUpdateLocationResponse> =
            jsonHandler<ExternalConnectionUpdateLocationResponse>(clientOptions.jsonMapper)

        override fun updateLocation(
            params: ExternalConnectionUpdateLocationParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalConnectionUpdateLocationResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("locationId", params.locationId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "external_connections",
                        params._pathParam(0),
                        "locations",
                        params._pathParam(1),
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
                            .use { updateLocationHandler.handle(it) }
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
