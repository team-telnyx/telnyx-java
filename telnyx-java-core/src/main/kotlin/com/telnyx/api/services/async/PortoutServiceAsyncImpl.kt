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
import com.telnyx.api.models.portouts.PortoutListParams
import com.telnyx.api.models.portouts.PortoutListRejectionCodesParams
import com.telnyx.api.models.portouts.PortoutListRejectionCodesResponse
import com.telnyx.api.models.portouts.PortoutListResponse
import com.telnyx.api.models.portouts.PortoutRetrieveParams
import com.telnyx.api.models.portouts.PortoutRetrieveResponse
import com.telnyx.api.models.portouts.PortoutUpdateStatusParams
import com.telnyx.api.models.portouts.PortoutUpdateStatusResponse
import com.telnyx.api.services.async.portouts.CommentServiceAsync
import com.telnyx.api.services.async.portouts.CommentServiceAsyncImpl
import com.telnyx.api.services.async.portouts.EventServiceAsync
import com.telnyx.api.services.async.portouts.EventServiceAsyncImpl
import com.telnyx.api.services.async.portouts.ReportServiceAsync
import com.telnyx.api.services.async.portouts.ReportServiceAsyncImpl
import com.telnyx.api.services.async.portouts.SupportingDocumentServiceAsync
import com.telnyx.api.services.async.portouts.SupportingDocumentServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PortoutServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PortoutServiceAsync {

    private val withRawResponse: PortoutServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val events: EventServiceAsync by lazy { EventServiceAsyncImpl(clientOptions) }

    private val reports: ReportServiceAsync by lazy { ReportServiceAsyncImpl(clientOptions) }

    private val comments: CommentServiceAsync by lazy { CommentServiceAsyncImpl(clientOptions) }

    private val supportingDocuments: SupportingDocumentServiceAsync by lazy {
        SupportingDocumentServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): PortoutServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PortoutServiceAsync =
        PortoutServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun events(): EventServiceAsync = events

    override fun reports(): ReportServiceAsync = reports

    override fun comments(): CommentServiceAsync = comments

    override fun supportingDocuments(): SupportingDocumentServiceAsync = supportingDocuments

    override fun retrieve(
        params: PortoutRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PortoutRetrieveResponse> =
        // get /portouts/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: PortoutListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PortoutListResponse> =
        // get /portouts
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun listRejectionCodes(
        params: PortoutListRejectionCodesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PortoutListRejectionCodesResponse> =
        // get /portouts/rejections/{portout_id}
        withRawResponse().listRejectionCodes(params, requestOptions).thenApply { it.parse() }

    override fun updateStatus(
        params: PortoutUpdateStatusParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PortoutUpdateStatusResponse> =
        // patch /portouts/{id}/{status}
        withRawResponse().updateStatus(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PortoutServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val events: EventServiceAsync.WithRawResponse by lazy {
            EventServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val reports: ReportServiceAsync.WithRawResponse by lazy {
            ReportServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val comments: CommentServiceAsync.WithRawResponse by lazy {
            CommentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val supportingDocuments: SupportingDocumentServiceAsync.WithRawResponse by lazy {
            SupportingDocumentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PortoutServiceAsync.WithRawResponse =
            PortoutServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun events(): EventServiceAsync.WithRawResponse = events

        override fun reports(): ReportServiceAsync.WithRawResponse = reports

        override fun comments(): CommentServiceAsync.WithRawResponse = comments

        override fun supportingDocuments(): SupportingDocumentServiceAsync.WithRawResponse =
            supportingDocuments

        private val retrieveHandler: Handler<PortoutRetrieveResponse> =
            jsonHandler<PortoutRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: PortoutRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PortoutRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("portouts", params._pathParam(0))
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

        private val listHandler: Handler<PortoutListResponse> =
            jsonHandler<PortoutListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: PortoutListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PortoutListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("portouts")
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

        private val listRejectionCodesHandler: Handler<PortoutListRejectionCodesResponse> =
            jsonHandler<PortoutListRejectionCodesResponse>(clientOptions.jsonMapper)

        override fun listRejectionCodes(
            params: PortoutListRejectionCodesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PortoutListRejectionCodesResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("portoutId", params.portoutId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("portouts", "rejections", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listRejectionCodesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateStatusHandler: Handler<PortoutUpdateStatusResponse> =
            jsonHandler<PortoutUpdateStatusResponse>(clientOptions.jsonMapper)

        override fun updateStatus(
            params: PortoutUpdateStatusParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PortoutUpdateStatusResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("status", params.status().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("portouts", params._pathParam(0), params._pathParam(1))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateStatusHandler.handle(it) }
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
