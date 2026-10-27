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
import com.telnyx.sdk.models.browsersessions.BrowserSessionCreateParams
import com.telnyx.sdk.models.browsersessions.BrowserSessionCreateResponse
import com.telnyx.sdk.models.browsersessions.BrowserSessionDeleteParams
import com.telnyx.sdk.models.browsersessions.BrowserSessionDeleteResponse
import com.telnyx.sdk.models.browsersessions.BrowserSessionListParams
import com.telnyx.sdk.models.browsersessions.BrowserSessionListResponse
import com.telnyx.sdk.models.browsersessions.BrowserSessionRetrieveArtifactParams
import com.telnyx.sdk.models.browsersessions.BrowserSessionRetrieveArtifactResponse
import com.telnyx.sdk.models.browsersessions.BrowserSessionRetrieveParams
import com.telnyx.sdk.models.browsersessions.BrowserSessionRetrieveResponse
import com.telnyx.sdk.services.blocking.browsersessions.ActionService
import com.telnyx.sdk.services.blocking.browsersessions.ActionServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class BrowserSessionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BrowserSessionService {

    private val withRawResponse: BrowserSessionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val actions: ActionService by lazy { ActionServiceImpl(clientOptions) }

    override fun withRawResponse(): BrowserSessionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BrowserSessionService =
        BrowserSessionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * Execute browser actions: navigate, observe, click, fill, select, press, scroll, wait_for,
     * screenshot, batch.
     */
    override fun actions(): ActionService = actions

    override fun create(
        params: BrowserSessionCreateParams,
        requestOptions: RequestOptions,
    ): BrowserSessionCreateResponse =
        // post /browser_sessions
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: BrowserSessionRetrieveParams,
        requestOptions: RequestOptions,
    ): BrowserSessionRetrieveResponse =
        // get /browser_sessions/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: BrowserSessionListParams,
        requestOptions: RequestOptions,
    ): BrowserSessionListResponse =
        // get /browser_sessions
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: BrowserSessionDeleteParams,
        requestOptions: RequestOptions,
    ): BrowserSessionDeleteResponse =
        // delete /browser_sessions/{id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun retrieveArtifact(
        params: BrowserSessionRetrieveArtifactParams,
        requestOptions: RequestOptions,
    ): BrowserSessionRetrieveArtifactResponse =
        // get /browser_sessions/{id}/artifacts/{artifactId}
        withRawResponse().retrieveArtifact(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BrowserSessionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val actions: ActionService.WithRawResponse by lazy {
            ActionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BrowserSessionService.WithRawResponse =
            BrowserSessionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * Execute browser actions: navigate, observe, click, fill, select, press, scroll, wait_for,
         * screenshot, batch.
         */
        override fun actions(): ActionService.WithRawResponse = actions

        private val createHandler: Handler<BrowserSessionCreateResponse> =
            jsonHandler<BrowserSessionCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: BrowserSessionCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BrowserSessionCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("browser_sessions")
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

        private val retrieveHandler: Handler<BrowserSessionRetrieveResponse> =
            jsonHandler<BrowserSessionRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: BrowserSessionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BrowserSessionRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("browser_sessions", params._pathParam(0))
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

        private val listHandler: Handler<BrowserSessionListResponse> =
            jsonHandler<BrowserSessionListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: BrowserSessionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BrowserSessionListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("browser_sessions")
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

        private val deleteHandler: Handler<BrowserSessionDeleteResponse> =
            jsonHandler<BrowserSessionDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: BrowserSessionDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BrowserSessionDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("browser_sessions", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveArtifactHandler: Handler<BrowserSessionRetrieveArtifactResponse> =
            jsonHandler<BrowserSessionRetrieveArtifactResponse>(clientOptions.jsonMapper)

        override fun retrieveArtifact(
            params: BrowserSessionRetrieveArtifactParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BrowserSessionRetrieveArtifactResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("artifactId", params.artifactId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "browser_sessions",
                        params._pathParam(0),
                        "artifacts",
                        params._pathParam(1),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveArtifactHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
