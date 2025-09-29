// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

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
import com.telnyx.api.models.countrycoverage.CountryCoverageRetrieveCountryParams
import com.telnyx.api.models.countrycoverage.CountryCoverageRetrieveCountryResponse
import com.telnyx.api.models.countrycoverage.CountryCoverageRetrieveParams
import com.telnyx.api.models.countrycoverage.CountryCoverageRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CountryCoverageServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CountryCoverageService {

    private val withRawResponse: CountryCoverageService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CountryCoverageService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CountryCoverageService =
        CountryCoverageServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: CountryCoverageRetrieveParams,
        requestOptions: RequestOptions,
    ): CountryCoverageRetrieveResponse =
        // get /country_coverage
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun retrieveCountry(
        params: CountryCoverageRetrieveCountryParams,
        requestOptions: RequestOptions,
    ): CountryCoverageRetrieveCountryResponse =
        // get /country_coverage/countries/{country_code}
        withRawResponse().retrieveCountry(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CountryCoverageService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CountryCoverageService.WithRawResponse =
            CountryCoverageServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<CountryCoverageRetrieveResponse> =
            jsonHandler<CountryCoverageRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CountryCoverageRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CountryCoverageRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("country_coverage")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveCountryHandler: Handler<CountryCoverageRetrieveCountryResponse> =
            jsonHandler<CountryCoverageRetrieveCountryResponse>(clientOptions.jsonMapper)

        override fun retrieveCountry(
            params: CountryCoverageRetrieveCountryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CountryCoverageRetrieveCountryResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("countryCode", params.countryCode().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("country_coverage", "countries", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveCountryHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
