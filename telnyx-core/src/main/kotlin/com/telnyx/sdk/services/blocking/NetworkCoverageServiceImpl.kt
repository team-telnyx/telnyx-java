// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
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
import com.telnyx.sdk.models.networkcoverage.NetworkCoverageListParams
import com.telnyx.sdk.models.networkcoverage.NetworkCoverageListResponse
import java.util.function.Consumer

class NetworkCoverageServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    NetworkCoverageService {

    private val withRawResponse: NetworkCoverageService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): NetworkCoverageService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): NetworkCoverageService =
        NetworkCoverageServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: NetworkCoverageListParams,
        requestOptions: RequestOptions,
    ): NetworkCoverageListResponse =
        // get /network_coverage
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NetworkCoverageService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NetworkCoverageService.WithRawResponse =
            NetworkCoverageServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<NetworkCoverageListResponse> =
            jsonHandler<NetworkCoverageListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: NetworkCoverageListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NetworkCoverageListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("network_coverage")
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
