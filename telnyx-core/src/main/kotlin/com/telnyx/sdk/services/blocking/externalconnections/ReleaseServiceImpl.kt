// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.externalconnections

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
import com.telnyx.sdk.models.externalconnections.releases.ReleaseListPage
import com.telnyx.sdk.models.externalconnections.releases.ReleaseListPageResponse
import com.telnyx.sdk.models.externalconnections.releases.ReleaseListParams
import com.telnyx.sdk.models.externalconnections.releases.ReleaseRetrieveParams
import com.telnyx.sdk.models.externalconnections.releases.ReleaseRetrieveResponse
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

    override fun list(params: ReleaseListParams, requestOptions: RequestOptions): ReleaseListPage =
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

        private val listHandler: Handler<ReleaseListPageResponse> =
            jsonHandler<ReleaseListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ReleaseListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ReleaseListPage> {
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
                    .let {
                        ReleaseListPage.builder()
                            .service(ReleaseServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
