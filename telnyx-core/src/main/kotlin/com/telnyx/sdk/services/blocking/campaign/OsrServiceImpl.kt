// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.campaign

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
import com.telnyx.sdk.models.campaign.osr.OsrGetAttributesParams
import com.telnyx.sdk.models.campaign.osr.OsrGetAttributesResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class OsrServiceImpl internal constructor(private val clientOptions: ClientOptions) : OsrService {

    private val withRawResponse: OsrService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): OsrService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OsrService =
        OsrServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getAttributes(
        params: OsrGetAttributesParams,
        requestOptions: RequestOptions,
    ): OsrGetAttributesResponse =
        // get /campaign/{campaignId}/osr/attributes
        withRawResponse().getAttributes(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OsrService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OsrService.WithRawResponse =
            OsrServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getAttributesHandler: Handler<OsrGetAttributesResponse> =
            jsonHandler<OsrGetAttributesResponse>(clientOptions.jsonMapper)

        override fun getAttributes(
            params: OsrGetAttributesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OsrGetAttributesResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("campaignId", params.campaignId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("campaign", params._pathParam(0), "osr", "attributes")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getAttributesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
