// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.campaignbuilder

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
import com.telnyx.api.core.prepare
import com.telnyx.api.models.campaignbuilder.brand.BrandQualifyByUsecaseParams
import com.telnyx.api.models.campaignbuilder.brand.BrandQualifyByUsecaseResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class BrandServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BrandService {

    private val withRawResponse: BrandService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BrandService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BrandService =
        BrandServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun qualifyByUsecase(
        params: BrandQualifyByUsecaseParams,
        requestOptions: RequestOptions,
    ): BrandQualifyByUsecaseResponse =
        // get /campaignBuilder/brand/{brandId}/usecase/{usecase}
        withRawResponse().qualifyByUsecase(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BrandService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BrandService.WithRawResponse =
            BrandServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val qualifyByUsecaseHandler: Handler<BrandQualifyByUsecaseResponse> =
            jsonHandler<BrandQualifyByUsecaseResponse>(clientOptions.jsonMapper)

        override fun qualifyByUsecase(
            params: BrandQualifyByUsecaseParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BrandQualifyByUsecaseResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
