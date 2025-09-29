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
import com.telnyx.api.models.globalipusage.GlobalIpUsageRetrieveParams
import com.telnyx.api.models.globalipusage.GlobalIpUsageRetrieveResponse
import java.util.function.Consumer

class GlobalIpUsageServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    GlobalIpUsageService {

    private val withRawResponse: GlobalIpUsageService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): GlobalIpUsageService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): GlobalIpUsageService =
        GlobalIpUsageServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: GlobalIpUsageRetrieveParams,
        requestOptions: RequestOptions,
    ): GlobalIpUsageRetrieveResponse =
        // get /global_ip_usage
        withRawResponse().retrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GlobalIpUsageService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GlobalIpUsageService.WithRawResponse =
            GlobalIpUsageServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<GlobalIpUsageRetrieveResponse> =
            jsonHandler<GlobalIpUsageRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: GlobalIpUsageRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GlobalIpUsageRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("global_ip_usage")
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
