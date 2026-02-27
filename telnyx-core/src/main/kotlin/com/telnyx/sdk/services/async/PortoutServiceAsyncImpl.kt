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
import com.telnyx.sdk.models.portouts.PortoutListPageAsync
import com.telnyx.sdk.models.portouts.PortoutListPageResponse
import com.telnyx.sdk.models.portouts.PortoutListParams
import com.telnyx.sdk.models.portouts.PortoutListRejectionCodesParams
import com.telnyx.sdk.models.portouts.PortoutListRejectionCodesResponse
import com.telnyx.sdk.models.portouts.PortoutRetrieveParams
import com.telnyx.sdk.models.portouts.PortoutRetrieveResponse
import com.telnyx.sdk.models.portouts.PortoutUpdateStatusParams
import com.telnyx.sdk.models.portouts.PortoutUpdateStatusResponse
import com.telnyx.sdk.services.async.portouts.CommentServiceAsync
import com.telnyx.sdk.services.async.portouts.CommentServiceAsyncImpl
import com.telnyx.sdk.services.async.portouts.EventServiceAsync
import com.telnyx.sdk.services.async.portouts.EventServiceAsyncImpl
import com.telnyx.sdk.services.async.portouts.ReportServiceAsync
import com.telnyx.sdk.services.async.portouts.ReportServiceAsyncImpl
import com.telnyx.sdk.services.async.portouts.SupportingDocumentServiceAsync
import com.telnyx.sdk.services.async.portouts.SupportingDocumentServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Number portout operations */
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

    /** Number portout operations */
    override fun events(): EventServiceAsync = events

    /** Number portout operations */
    override fun reports(): ReportServiceAsync = reports

    /** Number portout operations */
    override fun comments(): CommentServiceAsync = comments

    /** Number portout operations */
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
    ): CompletableFuture<PortoutListPageAsync> =
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

        /** Number portout operations */
        override fun events(): EventServiceAsync.WithRawResponse = events

        /** Number portout operations */
        override fun reports(): ReportServiceAsync.WithRawResponse = reports

        /** Number portout operations */
        override fun comments(): CommentServiceAsync.WithRawResponse = comments

        /** Number portout operations */
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

        private val listHandler: Handler<PortoutListPageResponse> =
            jsonHandler<PortoutListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: PortoutListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PortoutListPageAsync>> {
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
                            .let {
                                PortoutListPageAsync.builder()
                                    .service(PortoutServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
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
