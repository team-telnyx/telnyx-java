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
import com.telnyx.sdk.models.messagingurldomains.MessagingUrlDomainListParams
import com.telnyx.sdk.models.messagingurldomains.MessagingUrlDomainListResponse
import java.util.function.Consumer

class MessagingUrlDomainServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MessagingUrlDomainService {

    private val withRawResponse: MessagingUrlDomainService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MessagingUrlDomainService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessagingUrlDomainService =
        MessagingUrlDomainServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: MessagingUrlDomainListParams,
        requestOptions: RequestOptions,
    ): MessagingUrlDomainListResponse =
        // get /messaging_url_domains
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MessagingUrlDomainService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MessagingUrlDomainService.WithRawResponse =
            MessagingUrlDomainServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<MessagingUrlDomainListResponse> =
            jsonHandler<MessagingUrlDomainListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: MessagingUrlDomainListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessagingUrlDomainListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("messaging_url_domains")
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
