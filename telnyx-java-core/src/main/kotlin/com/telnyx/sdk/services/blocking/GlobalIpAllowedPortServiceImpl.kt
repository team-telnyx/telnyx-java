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
import com.telnyx.sdk.models.globalipallowedports.GlobalIpAllowedPortListParams
import com.telnyx.sdk.models.globalipallowedports.GlobalIpAllowedPortListResponse
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
