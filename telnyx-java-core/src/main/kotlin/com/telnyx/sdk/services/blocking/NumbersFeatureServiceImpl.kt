// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

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
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.numbersfeatures.NumbersFeatureCreateParams
import com.telnyx.sdk.models.numbersfeatures.NumbersFeatureCreateResponse
import java.util.function.Consumer

class NumbersFeatureServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    NumbersFeatureService {

    private val withRawResponse: NumbersFeatureService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): NumbersFeatureService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): NumbersFeatureService =
        NumbersFeatureServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: NumbersFeatureCreateParams,
        requestOptions: RequestOptions,
    ): NumbersFeatureCreateResponse =
        // post /numbers_features
        withRawResponse().create(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NumbersFeatureService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NumbersFeatureService.WithRawResponse =
            NumbersFeatureServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<NumbersFeatureCreateResponse> =
            jsonHandler<NumbersFeatureCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: NumbersFeatureCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NumbersFeatureCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("numbers_features")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
