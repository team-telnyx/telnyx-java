// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
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
import com.telnyx.api.models.simcardorderpreview.SimCardOrderPreviewPreviewParams
import com.telnyx.api.models.simcardorderpreview.SimCardOrderPreviewPreviewResponse
import java.util.function.Consumer

class SimCardOrderPreviewServiceImpl
internal constructor(private val clientOptions: ClientOptions) : SimCardOrderPreviewService {

    private val withRawResponse: SimCardOrderPreviewService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SimCardOrderPreviewService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): SimCardOrderPreviewService =
        SimCardOrderPreviewServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun preview(
        params: SimCardOrderPreviewPreviewParams,
        requestOptions: RequestOptions,
    ): SimCardOrderPreviewPreviewResponse =
        // post /sim_card_order_preview
        withRawResponse().preview(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SimCardOrderPreviewService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SimCardOrderPreviewService.WithRawResponse =
            SimCardOrderPreviewServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val previewHandler: Handler<SimCardOrderPreviewPreviewResponse> =
            jsonHandler<SimCardOrderPreviewPreviewResponse>(clientOptions.jsonMapper)

        override fun preview(
            params: SimCardOrderPreviewPreviewParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimCardOrderPreviewPreviewResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sim_card_order_preview")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { previewHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
