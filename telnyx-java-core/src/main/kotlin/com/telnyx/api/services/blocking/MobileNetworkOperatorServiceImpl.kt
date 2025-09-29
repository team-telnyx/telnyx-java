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
import com.telnyx.api.models.mobilenetworkoperators.MobileNetworkOperatorListParams
import com.telnyx.api.models.mobilenetworkoperators.MobileNetworkOperatorListResponse
import java.util.function.Consumer

class MobileNetworkOperatorServiceImpl
internal constructor(private val clientOptions: ClientOptions) : MobileNetworkOperatorService {

    private val withRawResponse: MobileNetworkOperatorService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MobileNetworkOperatorService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): MobileNetworkOperatorService =
        MobileNetworkOperatorServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: MobileNetworkOperatorListParams,
        requestOptions: RequestOptions,
    ): MobileNetworkOperatorListResponse =
        // get /mobile_network_operators
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MobileNetworkOperatorService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MobileNetworkOperatorService.WithRawResponse =
            MobileNetworkOperatorServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<MobileNetworkOperatorListResponse> =
            jsonHandler<MobileNetworkOperatorListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: MobileNetworkOperatorListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MobileNetworkOperatorListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("mobile_network_operators")
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
