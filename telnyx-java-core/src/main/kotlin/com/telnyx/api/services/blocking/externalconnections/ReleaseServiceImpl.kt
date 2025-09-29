// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.externalconnections

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.handlers.errorBodyHandler
import com.telnyx.api.core.handlers.errorHandler
import com.telnyx.api.core.handlers.jsonHandler
import com.telnyx.api.core.http.HttpMethod
import com.telnyx.api.core.http.HttpRequest
import com.telnyx.api.core.http.HttpResponse
import com.telnyx.api.core.http.HttpResponse.Handler
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.core.http.parseable
import com.telnyx.api.core.prepare
import com.telnyx.api.models.externalconnections.releases.ReleaseListParams
import com.telnyx.api.models.externalconnections.releases.ReleaseListResponse
import com.telnyx.api.models.externalconnections.releases.ReleaseRetrieveParams
import com.telnyx.api.models.externalconnections.releases.ReleaseRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ReleaseServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ReleaseService {

    private val withRawResponse: ReleaseService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ReleaseService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReleaseService =
        ReleaseServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: ReleaseRetrieveParams,
        requestOptions: RequestOptions,
    ): ReleaseRetrieveResponse =
        // get /external_connections/{id}/releases/{release_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: ReleaseListParams,
        requestOptions: RequestOptions,
    ): ReleaseListResponse =
        // get /external_connections/{id}/releases
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ReleaseService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ReleaseService.WithRawResponse =
            ReleaseServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<ReleaseRetrieveResponse> =
            jsonHandler<ReleaseRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ReleaseRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ReleaseRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("releaseId", params.releaseId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "external_connections",
                        params._pathParam(0),
                        "releases",
                        params._pathParam(1),
                    )
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

        private val listHandler: Handler<ReleaseListResponse> =
            jsonHandler<ReleaseListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ReleaseListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ReleaseListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("external_connections", params._pathParam(0), "releases")
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
