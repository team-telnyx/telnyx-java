// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.checkRequired
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
import com.telnyx.sdk.models.texml.TexmlInitiateAiCallParams
import com.telnyx.sdk.models.texml.TexmlInitiateAiCallResponse
import com.telnyx.sdk.models.texml.TexmlSecretsParams
import com.telnyx.sdk.models.texml.TexmlSecretsResponse
import com.telnyx.sdk.services.blocking.texml.AccountService
import com.telnyx.sdk.services.blocking.texml.AccountServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** TeXML REST Commands */
class TexmlServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TexmlService {

    private val withRawResponse: TexmlService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val accounts: AccountService by lazy { AccountServiceImpl(clientOptions) }

    override fun withRawResponse(): TexmlService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TexmlService =
        TexmlServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** TeXML REST Commands */
    override fun accounts(): AccountService = accounts

    override fun initiateAiCall(
        params: TexmlInitiateAiCallParams,
        requestOptions: RequestOptions,
    ): TexmlInitiateAiCallResponse =
        // post /texml/ai_calls/{connection_id}
        withRawResponse().initiateAiCall(params, requestOptions).parse()

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

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TexmlService.WithRawResponse =
            TexmlServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** TeXML REST Commands */
        override fun accounts(): AccountService.WithRawResponse = accounts

        private val initiateAiCallHandler: Handler<TexmlInitiateAiCallResponse> =
            jsonHandler<TexmlInitiateAiCallResponse>(clientOptions.jsonMapper)

        override fun initiateAiCall(
            params: TexmlInitiateAiCallParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TexmlInitiateAiCallResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("connectionId", params.connectionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("texml", "ai_calls", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { initiateAiCallHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

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
