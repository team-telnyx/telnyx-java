// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.messages

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.checkRequired
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
import com.telnyx.sdk.models.messages.rcs.RcGenerateDeeplinkParams
import com.telnyx.sdk.models.messages.rcs.RcGenerateDeeplinkResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RcServiceImpl internal constructor(private val clientOptions: ClientOptions) : RcService {

    private val withRawResponse: RcService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RcService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RcService =
        RcServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun generateDeeplink(
        params: RcGenerateDeeplinkParams,
        requestOptions: RequestOptions,
    ): RcGenerateDeeplinkResponse =
        // get /messages/rcs/deeplinks/{agent_id}
        withRawResponse().generateDeeplink(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RcService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RcService.WithRawResponse =
            RcServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val generateDeeplinkHandler: Handler<RcGenerateDeeplinkResponse> =
            jsonHandler<RcGenerateDeeplinkResponse>(clientOptions.jsonMapper)

        override fun generateDeeplink(
            params: RcGenerateDeeplinkParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RcGenerateDeeplinkResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("agentId", params.agentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("messages", "rcs", "deeplinks", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { generateDeeplinkHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
