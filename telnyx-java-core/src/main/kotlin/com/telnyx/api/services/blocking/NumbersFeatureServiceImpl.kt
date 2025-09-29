// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

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
import com.telnyx.api.core.prepare
import com.telnyx.api.models.numbersfeatures.NumbersFeatureCreateParams
import com.telnyx.api.models.numbersfeatures.NumbersFeatureCreateResponse
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
