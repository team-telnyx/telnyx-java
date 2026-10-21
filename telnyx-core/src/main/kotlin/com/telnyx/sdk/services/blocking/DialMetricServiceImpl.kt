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
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.dialmetrics.DialMetricListPage
import com.telnyx.sdk.models.dialmetrics.DialMetricListPageResponse
import com.telnyx.sdk.models.dialmetrics.DialMetricListParams
import java.util.function.Consumer

/** Call information */
class DialMetricServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DialMetricService {

    private val withRawResponse: DialMetricService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DialMetricService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DialMetricService =
        DialMetricServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: DialMetricListParams,
        requestOptions: RequestOptions,
    ): DialMetricListPage =
        // get /dial_metrics
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DialMetricService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DialMetricService.WithRawResponse =
            DialMetricServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<DialMetricListPageResponse> =
            jsonHandler<DialMetricListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: DialMetricListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DialMetricListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("dial_metrics")
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
                        DialMetricListPage.builder()
                            .service(DialMetricServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
