// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.portouts

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
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.portouts.supportingdocuments.SupportingDocumentCreateParams
import com.telnyx.sdk.models.portouts.supportingdocuments.SupportingDocumentCreateResponse
import com.telnyx.sdk.models.portouts.supportingdocuments.SupportingDocumentListParams
import com.telnyx.sdk.models.portouts.supportingdocuments.SupportingDocumentListResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Number portout operations */
class SupportingDocumentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SupportingDocumentService {

    private val withRawResponse: SupportingDocumentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SupportingDocumentService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SupportingDocumentService =
        SupportingDocumentServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: SupportingDocumentCreateParams,
        requestOptions: RequestOptions,
    ): SupportingDocumentCreateResponse =
        // post /portouts/{id}/supporting_documents
        withRawResponse().create(params, requestOptions).parse()

    override fun list(
        params: SupportingDocumentListParams,
        requestOptions: RequestOptions,
    ): SupportingDocumentListResponse =
        // get /portouts/{id}/supporting_documents
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SupportingDocumentService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SupportingDocumentService.WithRawResponse =
            SupportingDocumentServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<SupportingDocumentCreateResponse> =
            jsonHandler<SupportingDocumentCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: SupportingDocumentCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SupportingDocumentCreateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("portouts", params._pathParam(0), "supporting_documents")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<SupportingDocumentListResponse> =
            jsonHandler<SupportingDocumentListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: SupportingDocumentListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SupportingDocumentListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("portouts", params._pathParam(0), "supporting_documents")
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
    }
}
