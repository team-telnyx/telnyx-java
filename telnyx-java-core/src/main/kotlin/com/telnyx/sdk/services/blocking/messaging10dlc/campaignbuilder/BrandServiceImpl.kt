// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.messaging10dlc.campaignbuilder

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
import com.telnyx.sdk.models.messaging10dlc.campaignbuilder.brand.BrandQualifyByUsecaseParams
import com.telnyx.sdk.models.messaging10dlc.campaignbuilder.brand.BrandQualifyByUsecaseResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Campaign operations */
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
        // get /10dlc/campaignBuilder/brand/{brandId}/usecase/{usecase}
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
                        "10dlc",
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
