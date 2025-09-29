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
import com.telnyx.api.models.wirelessblocklistvalues.WirelessBlocklistValueListParams
import com.telnyx.api.models.wirelessblocklistvalues.WirelessBlocklistValueListResponse
import java.util.function.Consumer

class WirelessBlocklistValueServiceImpl
internal constructor(private val clientOptions: ClientOptions) : WirelessBlocklistValueService {

    private val withRawResponse: WirelessBlocklistValueService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WirelessBlocklistValueService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): WirelessBlocklistValueService =
        WirelessBlocklistValueServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: WirelessBlocklistValueListParams,
        requestOptions: RequestOptions,
    ): WirelessBlocklistValueListResponse =
        // get /wireless_blocklist_values
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WirelessBlocklistValueService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WirelessBlocklistValueService.WithRawResponse =
            WirelessBlocklistValueServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<WirelessBlocklistValueListResponse> =
            jsonHandler<WirelessBlocklistValueListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: WirelessBlocklistValueListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WirelessBlocklistValueListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("wireless_blocklist_values")
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
