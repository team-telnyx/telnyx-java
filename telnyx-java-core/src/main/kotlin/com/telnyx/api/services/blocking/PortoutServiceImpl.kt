// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

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
import com.telnyx.api.core.prepare
import com.telnyx.api.models.portouts.PortoutListParams
import com.telnyx.api.models.portouts.PortoutListRejectionCodesParams
import com.telnyx.api.models.portouts.PortoutListRejectionCodesResponse
import com.telnyx.api.models.portouts.PortoutListResponse
import com.telnyx.api.models.portouts.PortoutRetrieveParams
import com.telnyx.api.models.portouts.PortoutRetrieveResponse
import com.telnyx.api.models.portouts.PortoutUpdateStatusParams
import com.telnyx.api.models.portouts.PortoutUpdateStatusResponse
import com.telnyx.api.services.blocking.portouts.CommentService
import com.telnyx.api.services.blocking.portouts.CommentServiceImpl
import com.telnyx.api.services.blocking.portouts.EventService
import com.telnyx.api.services.blocking.portouts.EventServiceImpl
import com.telnyx.api.services.blocking.portouts.ReportService
import com.telnyx.api.services.blocking.portouts.ReportServiceImpl
import com.telnyx.api.services.blocking.portouts.SupportingDocumentService
import com.telnyx.api.services.blocking.portouts.SupportingDocumentServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PortoutServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PortoutService {

    private val withRawResponse: PortoutService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val events: EventService by lazy { EventServiceImpl(clientOptions) }

    private val reports: ReportService by lazy { ReportServiceImpl(clientOptions) }

    private val comments: CommentService by lazy { CommentServiceImpl(clientOptions) }

    private val supportingDocuments: SupportingDocumentService by lazy {
        SupportingDocumentServiceImpl(clientOptions)
    }

    override fun withRawResponse(): PortoutService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PortoutService =
        PortoutServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun events(): EventService = events

    override fun reports(): ReportService = reports

    override fun comments(): CommentService = comments

    override fun supportingDocuments(): SupportingDocumentService = supportingDocuments

    override fun retrieve(
        params: PortoutRetrieveParams,
        requestOptions: RequestOptions,
    ): PortoutRetrieveResponse =
        // get /portouts/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: PortoutListParams,
        requestOptions: RequestOptions,
    ): PortoutListResponse =
        // get /portouts
        withRawResponse().list(params, requestOptions).parse()

    override fun listRejectionCodes(
        params: PortoutListRejectionCodesParams,
        requestOptions: RequestOptions,
    ): PortoutListRejectionCodesResponse =
        // get /portouts/rejections/{portout_id}
        withRawResponse().listRejectionCodes(params, requestOptions).parse()

    override fun updateStatus(
        params: PortoutUpdateStatusParams,
        requestOptions: RequestOptions,
    ): PortoutUpdateStatusResponse =
        // patch /portouts/{id}/{status}
        withRawResponse().updateStatus(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PortoutService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val events: EventService.WithRawResponse by lazy {
            EventServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val reports: ReportService.WithRawResponse by lazy {
            ReportServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val comments: CommentService.WithRawResponse by lazy {
            CommentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val supportingDocuments: SupportingDocumentService.WithRawResponse by lazy {
            SupportingDocumentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PortoutService.WithRawResponse =
            PortoutServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun events(): EventService.WithRawResponse = events

        override fun reports(): ReportService.WithRawResponse = reports

        override fun comments(): CommentService.WithRawResponse = comments

        override fun supportingDocuments(): SupportingDocumentService.WithRawResponse =
            supportingDocuments

        private val retrieveHandler: Handler<PortoutRetrieveResponse> =
            jsonHandler<PortoutRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: PortoutRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PortoutRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("portouts", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<PortoutListResponse> =
            jsonHandler<PortoutListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: PortoutListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PortoutListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("portouts")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listRejectionCodesHandler: Handler<PortoutListRejectionCodesResponse> =
            jsonHandler<PortoutListRejectionCodesResponse>(clientOptions.jsonMapper)

        override fun listRejectionCodes(
            params: PortoutListRejectionCodesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PortoutListRejectionCodesResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("portoutId", params.portoutId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("portouts", "rejections", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listRejectionCodesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateStatusHandler: Handler<PortoutUpdateStatusResponse> =
            jsonHandler<PortoutUpdateStatusResponse>(clientOptions.jsonMapper)

        override fun updateStatus(
            params: PortoutUpdateStatusParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PortoutUpdateStatusResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
