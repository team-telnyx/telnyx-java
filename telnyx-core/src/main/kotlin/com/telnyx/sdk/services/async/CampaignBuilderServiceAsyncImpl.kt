// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

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
import com.telnyx.sdk.core.http.json
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.campaign.TelnyxCampaignCsp
import com.telnyx.sdk.models.campaignbuilder.CampaignBuilderCreateParams
import com.telnyx.sdk.services.async.campaignbuilder.BrandServiceAsync
import com.telnyx.sdk.services.async.campaignbuilder.BrandServiceAsyncImpl
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
    ): CompletableFuture<TelnyxCampaignCsp> =
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

        private val createHandler: Handler<TelnyxCampaignCsp> =
            jsonHandler<TelnyxCampaignCsp>(clientOptions.jsonMapper)

        override fun create(
            params: CampaignBuilderCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TelnyxCampaignCsp>> {
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
