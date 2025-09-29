// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

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
import com.telnyx.api.core.http.json
import com.telnyx.api.core.http.parseable
import com.telnyx.api.core.prepareAsync
import com.telnyx.api.models.campaignbuilder.CampaignBuilderCreateParams
import com.telnyx.api.models.campaignbuilder.CampaignBuilderCreateResponse
import com.telnyx.api.services.async.campaignbuilder.BrandServiceAsync
import com.telnyx.api.services.async.campaignbuilder.BrandServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class CampaignBuilderServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : CampaignBuilderServiceAsync {

    private val withRawResponse: CampaignBuilderServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val brand: BrandServiceAsync by lazy { BrandServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): CampaignBuilderServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): CampaignBuilderServiceAsync =
        CampaignBuilderServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun brand(): BrandServiceAsync = brand

    override fun create(
        params: CampaignBuilderCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CampaignBuilderCreateResponse> =
        // post /campaignBuilder
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CampaignBuilderServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val brand: BrandServiceAsync.WithRawResponse by lazy {
            BrandServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CampaignBuilderServiceAsync.WithRawResponse =
            CampaignBuilderServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun brand(): BrandServiceAsync.WithRawResponse = brand

        private val createHandler: Handler<CampaignBuilderCreateResponse> =
            jsonHandler<CampaignBuilderCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: CampaignBuilderCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CampaignBuilderCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("campaignBuilder")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
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
