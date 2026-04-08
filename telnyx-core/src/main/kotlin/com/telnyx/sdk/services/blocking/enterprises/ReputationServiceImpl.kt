// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.enterprises

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
import com.telnyx.sdk.models.enterprises.reputation.ReputationDisableParams
import com.telnyx.sdk.models.enterprises.reputation.ReputationEnableParams
import com.telnyx.sdk.models.enterprises.reputation.ReputationEnableResponse
import com.telnyx.sdk.models.enterprises.reputation.ReputationRetrieveParams
import com.telnyx.sdk.models.enterprises.reputation.ReputationRetrieveResponse
import com.telnyx.sdk.models.enterprises.reputation.ReputationUpdateFrequencyParams
import com.telnyx.sdk.models.enterprises.reputation.ReputationUpdateFrequencyResponse
import com.telnyx.sdk.services.blocking.enterprises.reputation.NumberService
import com.telnyx.sdk.services.blocking.enterprises.reputation.NumberServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Manage Number Reputation enrollment and check frequency settings for an enterprise */
class ReputationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ReputationService {

    private val withRawResponse: ReputationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val numbers: NumberService by lazy { NumberServiceImpl(clientOptions) }

    override fun withRawResponse(): ReputationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReputationService =
        ReputationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * Associate phone numbers with an enterprise for reputation monitoring and retrieve reputation
     * scores
     */
    override fun numbers(): NumberService = numbers

    override fun retrieve(
        params: ReputationRetrieveParams,
        requestOptions: RequestOptions,
    ): ReputationRetrieveResponse =
        // get /enterprises/{enterprise_id}/reputation
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun disable(params: ReputationDisableParams, requestOptions: RequestOptions) {
        // delete /enterprises/{enterprise_id}/reputation
        withRawResponse().disable(params, requestOptions)
    }

    override fun enable(
        params: ReputationEnableParams,
        requestOptions: RequestOptions,
    ): ReputationEnableResponse =
        // post /enterprises/{enterprise_id}/reputation
        withRawResponse().enable(params, requestOptions).parse()

    override fun updateFrequency(
        params: ReputationUpdateFrequencyParams,
        requestOptions: RequestOptions,
    ): ReputationUpdateFrequencyResponse =
        // patch /enterprises/{enterprise_id}/reputation/frequency
        withRawResponse().updateFrequency(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ReputationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val numbers: NumberService.WithRawResponse by lazy {
            NumberServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ReputationService.WithRawResponse =
            ReputationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * Associate phone numbers with an enterprise for reputation monitoring and retrieve
         * reputation scores
         */
        override fun numbers(): NumberService.WithRawResponse = numbers

        private val retrieveHandler: Handler<ReputationRetrieveResponse> =
            jsonHandler<ReputationRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ReputationRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ReputationRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("enterpriseId", params.enterpriseId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("enterprises", params._pathParam(0), "reputation")
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

        private val disableHandler: Handler<Void?> = emptyHandler()

        override fun disable(
            params: ReputationDisableParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("enterpriseId", params.enterpriseId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("enterprises", params._pathParam(0), "reputation")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { disableHandler.handle(it) }
            }
        }

        private val enableHandler: Handler<ReputationEnableResponse> =
            jsonHandler<ReputationEnableResponse>(clientOptions.jsonMapper)

        override fun enable(
            params: ReputationEnableParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ReputationEnableResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("enterpriseId", params.enterpriseId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("enterprises", params._pathParam(0), "reputation")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { enableHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateFrequencyHandler: Handler<ReputationUpdateFrequencyResponse> =
            jsonHandler<ReputationUpdateFrequencyResponse>(clientOptions.jsonMapper)

        override fun updateFrequency(
            params: ReputationUpdateFrequencyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ReputationUpdateFrequencyResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("enterpriseId", params.enterpriseId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("enterprises", params._pathParam(0), "reputation", "frequency")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateFrequencyHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
