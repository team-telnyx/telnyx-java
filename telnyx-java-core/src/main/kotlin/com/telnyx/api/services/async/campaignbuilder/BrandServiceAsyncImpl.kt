// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.campaignbuilder

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
import com.telnyx.api.models.campaignbuilder.brand.BrandQualifyByUsecaseParams
import com.telnyx.api.models.campaignbuilder.brand.BrandQualifyByUsecaseResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class BrandServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BrandServiceAsync {

    private val withRawResponse: BrandServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BrandServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BrandServiceAsync =
        BrandServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun qualifyByUsecase(
        params: BrandQualifyByUsecaseParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BrandQualifyByUsecaseResponse> =
        // get /campaignBuilder/brand/{brandId}/usecase/{usecase}
        withRawResponse().qualifyByUsecase(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BrandServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BrandServiceAsync.WithRawResponse =
            BrandServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val qualifyByUsecaseHandler: Handler<BrandQualifyByUsecaseResponse> =
            jsonHandler<BrandQualifyByUsecaseResponse>(clientOptions.jsonMapper)

        override fun qualifyByUsecase(
            params: BrandQualifyByUsecaseParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BrandQualifyByUsecaseResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("usecase", params.usecase().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "campaignBuilder",
                        "brand",
                        params._pathParam(0),
                        "usecase",
                        params._pathParam(1),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { qualifyByUsecaseHandler.handle(it) }
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
