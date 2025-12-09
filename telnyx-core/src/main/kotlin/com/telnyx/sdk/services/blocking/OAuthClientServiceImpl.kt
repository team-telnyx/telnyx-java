// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

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
import com.telnyx.sdk.models.oauthclients.OAuthClientCreateParams
import com.telnyx.sdk.models.oauthclients.OAuthClientCreateResponse
import com.telnyx.sdk.models.oauthclients.OAuthClientDeleteParams
import com.telnyx.sdk.models.oauthclients.OAuthClientListPage
import com.telnyx.sdk.models.oauthclients.OAuthClientListPageResponse
import com.telnyx.sdk.models.oauthclients.OAuthClientListParams
import com.telnyx.sdk.models.oauthclients.OAuthClientRetrieveParams
import com.telnyx.sdk.models.oauthclients.OAuthClientRetrieveResponse
import com.telnyx.sdk.models.oauthclients.OAuthClientUpdateParams
import com.telnyx.sdk.models.oauthclients.OAuthClientUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class OAuthClientServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    OAuthClientService {

    private val withRawResponse: OAuthClientService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): OAuthClientService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OAuthClientService =
        OAuthClientServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: OAuthClientCreateParams,
        requestOptions: RequestOptions,
    ): OAuthClientCreateResponse =
        // post /oauth_clients
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: OAuthClientRetrieveParams,
        requestOptions: RequestOptions,
    ): OAuthClientRetrieveResponse =
        // get /oauth_clients/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: OAuthClientUpdateParams,
        requestOptions: RequestOptions,
    ): OAuthClientUpdateResponse =
        // put /oauth_clients/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: OAuthClientListParams,
        requestOptions: RequestOptions,
    ): OAuthClientListPage =
        // get /oauth_clients
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: OAuthClientDeleteParams, requestOptions: RequestOptions) {
        // delete /oauth_clients/{id}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OAuthClientService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OAuthClientService.WithRawResponse =
            OAuthClientServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<OAuthClientCreateResponse> =
            jsonHandler<OAuthClientCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: OAuthClientCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OAuthClientCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("oauth_clients")
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

        private val retrieveHandler: Handler<OAuthClientRetrieveResponse> =
            jsonHandler<OAuthClientRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: OAuthClientRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OAuthClientRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("oauth_clients", params._pathParam(0))
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

        private val updateHandler: Handler<OAuthClientUpdateResponse> =
            jsonHandler<OAuthClientUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: OAuthClientUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OAuthClientUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("oauth_clients", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<OAuthClientListPageResponse> =
            jsonHandler<OAuthClientListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: OAuthClientListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OAuthClientListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("oauth_clients")
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
                        OAuthClientListPage.builder()
                            .service(OAuthClientServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: OAuthClientDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("oauth_clients", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }
    }
}
