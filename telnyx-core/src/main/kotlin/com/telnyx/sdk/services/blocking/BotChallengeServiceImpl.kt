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
import com.telnyx.sdk.core.http.json
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.botchallenge.BotChallengeCreateParams
import com.telnyx.sdk.models.botchallenge.BotChallengeCreateResponse
import java.util.function.Consumer

/**
 * Agentic (bot) signup for Telnyx accounts. An AI agent solves a reverse-CAPTCHA challenge designed
 * to be easy for LLMs and hard for humans, registers an account, and signs in by consuming a magic
 * link emailed to the account owner. All endpoints are public and unauthenticated; signup endpoints
 * are additionally gated by the freemium feature flags and per-country availability.
 */
class BotChallengeServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BotChallengeService {

    private val withRawResponse: BotChallengeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BotChallengeService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BotChallengeService =
        BotChallengeServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: BotChallengeCreateParams,
        requestOptions: RequestOptions,
    ): BotChallengeCreateResponse =
        // post /v2/bot_challenge
        withRawResponse().create(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BotChallengeService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BotChallengeService.WithRawResponse =
            BotChallengeServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<BotChallengeCreateResponse> =
            jsonHandler<BotChallengeCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: BotChallengeCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BotChallengeCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "bot_challenge")
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
