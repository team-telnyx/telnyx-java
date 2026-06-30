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
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.sessionanalysis.SessionAnalysisRetrieveParams
import com.telnyx.sdk.models.sessionanalysis.SessionAnalysisRetrieveResponse
import com.telnyx.sdk.services.blocking.sessionanalysis.MetadataService
import com.telnyx.sdk.services.blocking.sessionanalysis.MetadataServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Analyze voice AI sessions, costs, and event hierarchies across Telnyx products. */
class SessionAnalysisServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SessionAnalysisService {

    private val withRawResponse: SessionAnalysisService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val metadata: MetadataService by lazy { MetadataServiceImpl(clientOptions) }

    override fun withRawResponse(): SessionAnalysisService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SessionAnalysisService =
        SessionAnalysisServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Analyze voice AI sessions, costs, and event hierarchies across Telnyx products. */
    override fun metadata(): MetadataService = metadata

    override fun retrieve(
        params: SessionAnalysisRetrieveParams,
        requestOptions: RequestOptions,
    ): SessionAnalysisRetrieveResponse =
        // get /session_analysis/{record_type}/{event_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SessionAnalysisService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val metadata: MetadataService.WithRawResponse by lazy {
            MetadataServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SessionAnalysisService.WithRawResponse =
            SessionAnalysisServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Analyze voice AI sessions, costs, and event hierarchies across Telnyx products. */
        override fun metadata(): MetadataService.WithRawResponse = metadata

        private val retrieveHandler: Handler<SessionAnalysisRetrieveResponse> =
            jsonHandler<SessionAnalysisRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: SessionAnalysisRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SessionAnalysisRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("eventId", params.eventId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("session_analysis", params._pathParam(0), params._pathParam(1))
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
    }
}
