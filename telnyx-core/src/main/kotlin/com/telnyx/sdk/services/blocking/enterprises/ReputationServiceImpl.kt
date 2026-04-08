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
import com.telnyx.sdk.models.enterprises.reputation.ReputationCreateParams
import com.telnyx.sdk.models.enterprises.reputation.ReputationCreateResponse
import com.telnyx.sdk.models.enterprises.reputation.ReputationDeleteAllParams
import com.telnyx.sdk.models.enterprises.reputation.ReputationListParams
import com.telnyx.sdk.models.enterprises.reputation.ReputationListResponse
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

    override fun create(
        params: ReputationCreateParams,
        requestOptions: RequestOptions,
    ): ReputationCreateResponse =
        // post /enterprises/{enterprise_id}/reputation
        withRawResponse().create(params, requestOptions).parse()

    override fun list(
        params: ReputationListParams,
        requestOptions: RequestOptions,
    ): ReputationListResponse =
        // get /enterprises/{enterprise_id}/reputation
        withRawResponse().list(params, requestOptions).parse()

    override fun deleteAll(params: ReputationDeleteAllParams, requestOptions: RequestOptions) {
        // delete /enterprises/{enterprise_id}/reputation
        withRawResponse().deleteAll(params, requestOptions)
    }

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

        private val createHandler: Handler<ReputationCreateResponse> =
            jsonHandler<ReputationCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ReputationCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ReputationCreateResponse> {
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
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<ReputationListResponse> =
            jsonHandler<ReputationListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ReputationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ReputationListResponse> {
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
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteAllHandler: Handler<Void?> = emptyHandler()

        override fun deleteAll(
            params: ReputationDeleteAllParams,
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
                response.use { deleteAllHandler.handle(it) }
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
