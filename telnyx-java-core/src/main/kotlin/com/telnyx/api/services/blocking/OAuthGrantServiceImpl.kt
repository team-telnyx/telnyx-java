// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

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
import com.telnyx.api.core.http.json
import com.telnyx.api.core.http.parseable
import com.telnyx.api.core.prepare
import com.telnyx.api.models.oauthgrants.OAuthGrantDeleteParams
import com.telnyx.api.models.oauthgrants.OAuthGrantDeleteResponse
import com.telnyx.api.models.oauthgrants.OAuthGrantListParams
import com.telnyx.api.models.oauthgrants.OAuthGrantListResponse
import com.telnyx.api.models.oauthgrants.OAuthGrantRetrieveParams
import com.telnyx.api.models.oauthgrants.OAuthGrantRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class OAuthGrantServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    OAuthGrantService {

    private val withRawResponse: OAuthGrantService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): OAuthGrantService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OAuthGrantService =
        OAuthGrantServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: OAuthGrantRetrieveParams,
        requestOptions: RequestOptions,
    ): OAuthGrantRetrieveResponse =
        // get /oauth_grants/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: OAuthGrantListParams,
        requestOptions: RequestOptions,
    ): OAuthGrantListResponse =
        // get /oauth_grants
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: OAuthGrantDeleteParams,
        requestOptions: RequestOptions,
    ): OAuthGrantDeleteResponse =
        // delete /oauth_grants/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OAuthGrantService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OAuthGrantService.WithRawResponse =
            OAuthGrantServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<OAuthGrantRetrieveResponse> =
            jsonHandler<OAuthGrantRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: OAuthGrantRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OAuthGrantRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("oauth_grants", params._pathParam(0))
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

        private val listHandler: Handler<OAuthGrantListResponse> =
            jsonHandler<OAuthGrantListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: OAuthGrantListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OAuthGrantListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("oauth_grants")
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

        private val deleteHandler: Handler<OAuthGrantDeleteResponse> =
            jsonHandler<OAuthGrantDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: OAuthGrantDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OAuthGrantDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("oauth_grants", params._pathParam(0))
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
    }
}
