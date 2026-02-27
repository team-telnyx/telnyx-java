// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

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
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.countrycoverage.CountryCoverageRetrieveCountryParams
import com.telnyx.sdk.models.countrycoverage.CountryCoverageRetrieveCountryResponse
import com.telnyx.sdk.models.countrycoverage.CountryCoverageRetrieveParams
import com.telnyx.sdk.models.countrycoverage.CountryCoverageRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Country Coverage */
class CountryCoverageServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : CountryCoverageServiceAsync {

    private val withRawResponse: CountryCoverageServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CountryCoverageServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): CountryCoverageServiceAsync =
        CountryCoverageServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: CountryCoverageRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CountryCoverageRetrieveResponse> =
        // get /country_coverage
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun retrieveCountry(
        params: CountryCoverageRetrieveCountryParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CountryCoverageRetrieveCountryResponse> =
        // get /country_coverage/countries/{country_code}
        withRawResponse().retrieveCountry(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CountryCoverageServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CountryCoverageServiceAsync.WithRawResponse =
            CountryCoverageServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<CountryCoverageRetrieveResponse> =
            jsonHandler<CountryCoverageRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CountryCoverageRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CountryCoverageRetrieveResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("country_coverage")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveCountryHandler: Handler<CountryCoverageRetrieveCountryResponse> =
            jsonHandler<CountryCoverageRetrieveCountryResponse>(clientOptions.jsonMapper)

        override fun retrieveCountry(
            params: CountryCoverageRetrieveCountryParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CountryCoverageRetrieveCountryResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("countryCode", params.countryCode().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("country_coverage", "countries", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
