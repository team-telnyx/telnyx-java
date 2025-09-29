// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.portingorders

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.handlers.emptyHandler
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
import com.telnyx.api.models.portingorders.additionaldocuments.AdditionalDocumentCreateParams
import com.telnyx.api.models.portingorders.additionaldocuments.AdditionalDocumentCreateResponse
import com.telnyx.api.models.portingorders.additionaldocuments.AdditionalDocumentDeleteParams
import com.telnyx.api.models.portingorders.additionaldocuments.AdditionalDocumentListParams
import com.telnyx.api.models.portingorders.additionaldocuments.AdditionalDocumentListResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AdditionalDocumentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AdditionalDocumentService {

    private val withRawResponse: AdditionalDocumentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AdditionalDocumentService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AdditionalDocumentService =
        AdditionalDocumentServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: AdditionalDocumentCreateParams,
        requestOptions: RequestOptions,
    ): AdditionalDocumentCreateResponse =
        // post /porting_orders/{id}/additional_documents
        withRawResponse().create(params, requestOptions).parse()

    override fun list(
        params: AdditionalDocumentListParams,
        requestOptions: RequestOptions,
    ): AdditionalDocumentListResponse =
        // get /porting_orders/{id}/additional_documents
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: AdditionalDocumentDeleteParams, requestOptions: RequestOptions) {
        // delete /porting_orders/{id}/additional_documents/{additional_document_id}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AdditionalDocumentService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AdditionalDocumentService.WithRawResponse =
            AdditionalDocumentServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<AdditionalDocumentCreateResponse> =
            jsonHandler<AdditionalDocumentCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: AdditionalDocumentCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AdditionalDocumentCreateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting_orders", params._pathParam(0), "additional_documents")
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

        private val listHandler: Handler<AdditionalDocumentListResponse> =
            jsonHandler<AdditionalDocumentListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AdditionalDocumentListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AdditionalDocumentListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting_orders", params._pathParam(0), "additional_documents")
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: AdditionalDocumentDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("additionalDocumentId", params.additionalDocumentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "porting_orders",
                        params._pathParam(0),
                        "additional_documents",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }
    }
}
