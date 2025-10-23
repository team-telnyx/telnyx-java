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
import com.telnyx.sdk.models.globaliphealthchecktypes.GlobalIpHealthCheckTypeListParams
import com.telnyx.sdk.models.globaliphealthchecktypes.GlobalIpHealthCheckTypeListResponse
import java.util.function.Consumer

class GlobalIpHealthCheckTypeServiceImpl
internal constructor(private val clientOptions: ClientOptions) : GlobalIpHealthCheckTypeService {

    private val withRawResponse: GlobalIpHealthCheckTypeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): GlobalIpHealthCheckTypeService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): GlobalIpHealthCheckTypeService =
        GlobalIpHealthCheckTypeServiceImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun list(
        params: GlobalIpHealthCheckTypeListParams,
        requestOptions: RequestOptions,
    ): GlobalIpHealthCheckTypeListResponse =
        // get /global_ip_health_check_types
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GlobalIpHealthCheckTypeService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GlobalIpHealthCheckTypeService.WithRawResponse =
            GlobalIpHealthCheckTypeServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<GlobalIpHealthCheckTypeListResponse> =
            jsonHandler<GlobalIpHealthCheckTypeListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: GlobalIpHealthCheckTypeListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GlobalIpHealthCheckTypeListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("global_ip_health_check_types")
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
