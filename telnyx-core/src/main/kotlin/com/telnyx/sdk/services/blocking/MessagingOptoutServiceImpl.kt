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
import com.telnyx.sdk.models.messagingoptouts.MessagingOptoutListPage
import com.telnyx.sdk.models.messagingoptouts.MessagingOptoutListPageResponse
import com.telnyx.sdk.models.messagingoptouts.MessagingOptoutListParams
import java.util.function.Consumer

/** Opt-Out Management */
class MessagingOptoutServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MessagingOptoutService {

    private val withRawResponse: MessagingOptoutService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MessagingOptoutService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessagingOptoutService =
        MessagingOptoutServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: MessagingOptoutListParams,
        requestOptions: RequestOptions,
    ): MessagingOptoutListPage =
        // get /messaging_optouts
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MessagingOptoutService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MessagingOptoutService.WithRawResponse =
            MessagingOptoutServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<MessagingOptoutListPageResponse> =
            jsonHandler<MessagingOptoutListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: MessagingOptoutListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessagingOptoutListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("messaging_optouts")
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
                        MessagingOptoutListPage.builder()
                            .service(MessagingOptoutServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
