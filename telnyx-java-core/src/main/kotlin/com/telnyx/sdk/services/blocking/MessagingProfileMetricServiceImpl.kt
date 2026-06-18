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
import com.telnyx.sdk.models.messagingprofilemetrics.MessagingProfileMetricListParams
import com.telnyx.sdk.models.messagingprofilemetrics.MessagingProfileMetricListResponse
import java.util.function.Consumer

class MessagingProfileMetricServiceImpl
internal constructor(private val clientOptions: ClientOptions) : MessagingProfileMetricService {

    private val withRawResponse: MessagingProfileMetricService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MessagingProfileMetricService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): MessagingProfileMetricService =
        MessagingProfileMetricServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: MessagingProfileMetricListParams,
        requestOptions: RequestOptions,
    ): MessagingProfileMetricListResponse =
        // get /messaging_profile_metrics
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MessagingProfileMetricService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MessagingProfileMetricService.WithRawResponse =
            MessagingProfileMetricServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<MessagingProfileMetricListResponse> =
            jsonHandler<MessagingProfileMetricListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: MessagingProfileMetricListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessagingProfileMetricListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("messaging_profile_metrics")
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
            }
        }
    }
}
