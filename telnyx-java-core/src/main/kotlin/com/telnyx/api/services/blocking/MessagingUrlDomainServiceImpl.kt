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
import com.telnyx.api.core.http.parseable
import com.telnyx.api.core.prepare
import com.telnyx.api.models.messagingurldomains.MessagingUrlDomainListParams
import com.telnyx.api.models.messagingurldomains.MessagingUrlDomainListResponse
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
