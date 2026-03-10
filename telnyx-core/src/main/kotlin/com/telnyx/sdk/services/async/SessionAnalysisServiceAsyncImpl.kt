// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

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
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.sessionanalysis.SessionAnalysisRetrieveParams
import com.telnyx.sdk.models.sessionanalysis.SessionAnalysisRetrieveResponse
import com.telnyx.sdk.services.async.sessionanalysis.MetadataServiceAsync
import com.telnyx.sdk.services.async.sessionanalysis.MetadataServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Analyze voice AI sessions, costs, and event hierarchies across Telnyx products. */
class SessionAnalysisServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : SessionAnalysisServiceAsync {

    private val withRawResponse: SessionAnalysisServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val metadata: MetadataServiceAsync by lazy { MetadataServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): SessionAnalysisServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): SessionAnalysisServiceAsync =
        SessionAnalysisServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Analyze voice AI sessions, costs, and event hierarchies across Telnyx products. */
    override fun metadata(): MetadataServiceAsync = metadata

    override fun retrieve(
        params: SessionAnalysisRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SessionAnalysisRetrieveResponse> =
        // get /session_analysis/{record_type}/{event_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SessionAnalysisServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val metadata: MetadataServiceAsync.WithRawResponse by lazy {
            MetadataServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SessionAnalysisServiceAsync.WithRawResponse =
            SessionAnalysisServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Analyze voice AI sessions, costs, and event hierarchies across Telnyx products. */
        override fun metadata(): MetadataServiceAsync.WithRawResponse = metadata

        private val retrieveHandler: Handler<SessionAnalysisRetrieveResponse> =
            jsonHandler<SessionAnalysisRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: SessionAnalysisRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SessionAnalysisRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("eventId", params.eventId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("session_analysis", params._pathParam(0), params._pathParam(1))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
