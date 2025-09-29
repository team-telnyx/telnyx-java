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
import com.telnyx.api.core.http.parseable
import com.telnyx.api.core.prepare
import com.telnyx.api.models.virtualcrossconnectscoverage.VirtualCrossConnectsCoverageListParams
import com.telnyx.api.models.virtualcrossconnectscoverage.VirtualCrossConnectsCoverageListResponse
import java.util.function.Consumer

class VirtualCrossConnectsCoverageServiceImpl
internal constructor(private val clientOptions: ClientOptions) :
    VirtualCrossConnectsCoverageService {

    private val withRawResponse: VirtualCrossConnectsCoverageService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): VirtualCrossConnectsCoverageService.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): VirtualCrossConnectsCoverageService =
        VirtualCrossConnectsCoverageServiceImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun list(
        params: VirtualCrossConnectsCoverageListParams,
        requestOptions: RequestOptions,
    ): VirtualCrossConnectsCoverageListResponse =
        // get /virtual_cross_connects_coverage
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VirtualCrossConnectsCoverageService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VirtualCrossConnectsCoverageService.WithRawResponse =
            VirtualCrossConnectsCoverageServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<VirtualCrossConnectsCoverageListResponse> =
            jsonHandler<VirtualCrossConnectsCoverageListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: VirtualCrossConnectsCoverageListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VirtualCrossConnectsCoverageListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("virtual_cross_connects_coverage")
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
