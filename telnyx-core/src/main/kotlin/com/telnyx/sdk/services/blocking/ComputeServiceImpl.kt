// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

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
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.compute.ComputeRetrieveParams
import com.telnyx.sdk.models.compute.ComputeRetrieveResponse
import com.telnyx.sdk.services.blocking.compute.FuncService
import com.telnyx.sdk.services.blocking.compute.FuncServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Inspect Stateful Actor types */
class ComputeServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ComputeService {

    private val withRawResponse: ComputeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val funcs: FuncService by lazy { FuncServiceImpl(clientOptions) }

    override fun withRawResponse(): ComputeService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ComputeService =
        ComputeServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Manage Edge Compute functions */
    override fun funcs(): FuncService = funcs

    override fun retrieve(
        params: ComputeRetrieveParams,
        requestOptions: RequestOptions,
    ): ComputeRetrieveResponse =
        // get /compute/actors/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ComputeService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val funcs: FuncService.WithRawResponse by lazy {
            FuncServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ComputeService.WithRawResponse =
            ComputeServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Manage Edge Compute functions */
        override fun funcs(): FuncService.WithRawResponse = funcs

        private val retrieveHandler: Handler<ComputeRetrieveResponse> =
            jsonHandler<ComputeRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ComputeRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ComputeRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("compute", "actors", params._pathParam(0))
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
    }
}
