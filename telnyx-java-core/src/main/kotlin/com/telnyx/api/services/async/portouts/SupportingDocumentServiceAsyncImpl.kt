// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.portouts

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
import com.telnyx.api.models.portouts.supportingdocuments.SupportingDocumentCreateParams
import com.telnyx.api.models.portouts.supportingdocuments.SupportingDocumentCreateResponse
import com.telnyx.api.models.portouts.supportingdocuments.SupportingDocumentListParams
import com.telnyx.api.models.portouts.supportingdocuments.SupportingDocumentListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SupportingDocumentServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : SupportingDocumentServiceAsync {

    private val withRawResponse: SupportingDocumentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SupportingDocumentServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): SupportingDocumentServiceAsync =
        SupportingDocumentServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun create(
        params: SupportingDocumentCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SupportingDocumentCreateResponse> =
        // post /portouts/{id}/supporting_documents
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: SupportingDocumentListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SupportingDocumentListResponse> =
        // get /portouts/{id}/supporting_documents
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SupportingDocumentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SupportingDocumentServiceAsync.WithRawResponse =
            SupportingDocumentServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<SupportingDocumentCreateResponse> =
            jsonHandler<SupportingDocumentCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: SupportingDocumentCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SupportingDocumentCreateResponse>> {
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

        private val listHandler: Handler<SupportingDocumentListResponse> =
            jsonHandler<SupportingDocumentListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: SupportingDocumentListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SupportingDocumentListResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("portouts", params._pathParam(0), "supporting_documents")
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
    }
}
