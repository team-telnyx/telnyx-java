// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.campaign

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.handlers.errorBodyHandler
import com.telnyx.api.core.handlers.errorHandler
import com.telnyx.api.core.handlers.jsonHandler
import com.telnyx.api.core.http.HttpMethod
import com.telnyx.api.core.http.HttpRequest
import com.telnyx.api.core.http.HttpResponse
import com.telnyx.api.core.http.HttpResponse.Handler
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.core.http.parseable
import com.telnyx.api.core.prepareAsync
import com.telnyx.api.models.campaign.osr.OsrGetAttributesParams
import com.telnyx.api.models.campaign.osr.OsrGetAttributesResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class OsrServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    OsrServiceAsync {

    private val withRawResponse: OsrServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): OsrServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OsrServiceAsync =
        OsrServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getAttributes(
        params: OsrGetAttributesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OsrGetAttributesResponse> =
        // get /campaign/{campaignId}/osr/attributes
        withRawResponse().getAttributes(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OsrServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OsrServiceAsync.WithRawResponse =
            OsrServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getAttributesHandler: Handler<OsrGetAttributesResponse> =
            jsonHandler<OsrGetAttributesResponse>(clientOptions.jsonMapper)

        override fun getAttributes(
            params: OsrGetAttributesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OsrGetAttributesResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("campaignId", params.campaignId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("campaign", params._pathParam(0), "osr", "attributes")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
