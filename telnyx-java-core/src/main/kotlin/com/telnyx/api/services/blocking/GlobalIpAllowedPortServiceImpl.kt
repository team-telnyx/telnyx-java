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
import com.telnyx.api.models.globalipallowedports.GlobalIpAllowedPortListParams
import com.telnyx.api.models.globalipallowedports.GlobalIpAllowedPortListResponse
import java.util.function.Consumer

class GlobalIpAllowedPortServiceImpl
internal constructor(private val clientOptions: ClientOptions) : GlobalIpAllowedPortService {

    private val withRawResponse: GlobalIpAllowedPortService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): GlobalIpAllowedPortService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): GlobalIpAllowedPortService =
        GlobalIpAllowedPortServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: GlobalIpAllowedPortListParams,
        requestOptions: RequestOptions,
    ): GlobalIpAllowedPortListResponse =
        // get /global_ip_allowed_ports
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GlobalIpAllowedPortService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GlobalIpAllowedPortService.WithRawResponse =
            GlobalIpAllowedPortServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<GlobalIpAllowedPortListResponse> =
            jsonHandler<GlobalIpAllowedPortListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: GlobalIpAllowedPortListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GlobalIpAllowedPortListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("global_ip_allowed_ports")
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
