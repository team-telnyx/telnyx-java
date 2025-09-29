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
import com.telnyx.api.models.texml.TexmlSecretsParams
import com.telnyx.api.models.texml.TexmlSecretsResponse
import com.telnyx.api.services.blocking.texml.AccountService
import com.telnyx.api.services.blocking.texml.AccountServiceImpl
import com.telnyx.api.services.blocking.texml.CallService
import com.telnyx.api.services.blocking.texml.CallServiceImpl
import java.util.function.Consumer

class TexmlServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TexmlService {

    private val withRawResponse: TexmlService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val accounts: AccountService by lazy { AccountServiceImpl(clientOptions) }

    private val calls: CallService by lazy { CallServiceImpl(clientOptions) }

    override fun withRawResponse(): TexmlService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TexmlService =
        TexmlServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun accounts(): AccountService = accounts

    override fun calls(): CallService = calls

    override fun secrets(
        params: TexmlSecretsParams,
        requestOptions: RequestOptions,
    ): TexmlSecretsResponse =
        // post /texml/secrets
        withRawResponse().secrets(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TexmlService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val accounts: AccountService.WithRawResponse by lazy {
            AccountServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val calls: CallService.WithRawResponse by lazy {
            CallServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TexmlService.WithRawResponse =
            TexmlServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun accounts(): AccountService.WithRawResponse = accounts

        override fun calls(): CallService.WithRawResponse = calls

        private val secretsHandler: Handler<TexmlSecretsResponse> =
            jsonHandler<TexmlSecretsResponse>(clientOptions.jsonMapper)

        override fun secrets(
            params: TexmlSecretsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TexmlSecretsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("texml", "secrets")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { secretsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
