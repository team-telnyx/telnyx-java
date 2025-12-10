// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

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
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.messagingurldomains.MessagingUrlDomainListPageAsync
import com.telnyx.sdk.models.messagingurldomains.MessagingUrlDomainListPageResponse
import com.telnyx.sdk.models.messagingurldomains.MessagingUrlDomainListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class MessagingUrlDomainServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : MessagingUrlDomainServiceAsync {

    private val withRawResponse: MessagingUrlDomainServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MessagingUrlDomainServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): MessagingUrlDomainServiceAsync =
        MessagingUrlDomainServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun list(
        params: MessagingUrlDomainListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessagingUrlDomainListPageAsync> =
        // get /messaging_url_domains
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MessagingUrlDomainServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MessagingUrlDomainServiceAsync.WithRawResponse =
            MessagingUrlDomainServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<MessagingUrlDomainListPageResponse> =
            jsonHandler<MessagingUrlDomainListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: MessagingUrlDomainListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessagingUrlDomainListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("messaging_url_domains")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                MessagingUrlDomainListPageAsync.builder()
                                    .service(MessagingUrlDomainServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }
    }
}
