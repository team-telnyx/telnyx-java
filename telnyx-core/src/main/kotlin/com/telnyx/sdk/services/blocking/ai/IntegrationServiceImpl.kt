// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai

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
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.ai.integrations.IntegrationListParams
import com.telnyx.sdk.models.ai.integrations.IntegrationListResponse
import com.telnyx.sdk.models.ai.integrations.IntegrationRetrieveParams
import com.telnyx.sdk.models.ai.integrations.IntegrationRetrieveResponse
import com.telnyx.sdk.services.blocking.ai.integrations.ConnectionService
import com.telnyx.sdk.services.blocking.ai.integrations.ConnectionServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class IntegrationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    IntegrationService {

    private val withRawResponse: IntegrationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val connections: ConnectionService by lazy { ConnectionServiceImpl(clientOptions) }

    override fun withRawResponse(): IntegrationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): IntegrationService =
        IntegrationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun connections(): ConnectionService = connections

    override fun retrieve(
        params: IntegrationRetrieveParams,
        requestOptions: RequestOptions,
    ): IntegrationRetrieveResponse =
        // get /ai/integrations/{integration_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: IntegrationListParams,
        requestOptions: RequestOptions,
    ): IntegrationListResponse =
        // get /ai/integrations
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IntegrationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val connections: ConnectionService.WithRawResponse by lazy {
            ConnectionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IntegrationService.WithRawResponse =
            IntegrationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun connections(): ConnectionService.WithRawResponse = connections

        private val retrieveHandler: Handler<IntegrationRetrieveResponse> =
            jsonHandler<IntegrationRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: IntegrationRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntegrationRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("integrationId", params.integrationId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "integrations", params._pathParam(0))
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

        private val listHandler: Handler<IntegrationListResponse> =
            jsonHandler<IntegrationListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: IntegrationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntegrationListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "integrations")
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
