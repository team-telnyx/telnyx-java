// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.reputation

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.handlers.emptyHandler
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
import com.telnyx.sdk.models.reputation.numbers.NumberDeleteParams
import com.telnyx.sdk.models.reputation.numbers.NumberListPage
import com.telnyx.sdk.models.reputation.numbers.NumberListPageResponse
import com.telnyx.sdk.models.reputation.numbers.NumberListParams
import com.telnyx.sdk.models.reputation.numbers.NumberRetrieveParams
import com.telnyx.sdk.models.reputation.numbers.NumberRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * Associate phone numbers with an enterprise for reputation monitoring and retrieve reputation
 * scores
 */
class NumberServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    NumberService {

    private val withRawResponse: NumberService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): NumberService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): NumberService =
        NumberServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: NumberRetrieveParams,
        requestOptions: RequestOptions,
    ): NumberRetrieveResponse =
        // get /reputation/numbers/{phone_number}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: NumberListParams, requestOptions: RequestOptions): NumberListPage =
        // get /reputation/numbers
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: NumberDeleteParams, requestOptions: RequestOptions) {
        // delete /reputation/numbers/{phone_number}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NumberService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NumberService.WithRawResponse =
            NumberServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<NumberRetrieveResponse> =
            jsonHandler<NumberRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: NumberRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NumberRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("phoneNumber", params.phoneNumber().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("reputation", "numbers", params._pathParam(0))
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

        private val listHandler: Handler<NumberListPageResponse> =
            jsonHandler<NumberListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: NumberListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NumberListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("reputation", "numbers")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        NumberListPage.builder()
                            .service(NumberServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: NumberDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("phoneNumber", params.phoneNumber().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("reputation", "numbers", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }
    }
}
