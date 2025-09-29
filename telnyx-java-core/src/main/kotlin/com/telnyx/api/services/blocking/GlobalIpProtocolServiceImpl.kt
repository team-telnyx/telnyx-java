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
import com.telnyx.api.models.globalipprotocols.GlobalIpProtocolListParams
import com.telnyx.api.models.globalipprotocols.GlobalIpProtocolListResponse
import java.util.function.Consumer

class GlobalIpProtocolServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    GlobalIpProtocolService {

    private val withRawResponse: GlobalIpProtocolService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): GlobalIpProtocolService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): GlobalIpProtocolService =
        GlobalIpProtocolServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: GlobalIpProtocolListParams,
        requestOptions: RequestOptions,
    ): GlobalIpProtocolListResponse =
        // get /global_ip_protocols
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GlobalIpProtocolService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GlobalIpProtocolService.WithRawResponse =
            GlobalIpProtocolServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<GlobalIpProtocolListResponse> =
            jsonHandler<GlobalIpProtocolListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: GlobalIpProtocolListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GlobalIpProtocolListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("global_ip_protocols")
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
