// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.handlers.emptyHandler
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
import com.telnyx.api.models.oauth.OAuthGrantsParams
import com.telnyx.api.models.oauth.OAuthGrantsResponse
import com.telnyx.api.models.oauth.OAuthIntrospectParams
import com.telnyx.api.models.oauth.OAuthIntrospectResponse
import com.telnyx.api.models.oauth.OAuthRegisterParams
import com.telnyx.api.models.oauth.OAuthRegisterResponse
import com.telnyx.api.models.oauth.OAuthRetrieveAuthorizeParams
import com.telnyx.api.models.oauth.OAuthRetrieveJwksParams
import com.telnyx.api.models.oauth.OAuthRetrieveJwksResponse
import com.telnyx.api.models.oauth.OAuthRetrieveParams
import com.telnyx.api.models.oauth.OAuthRetrieveResponse
import com.telnyx.api.models.oauth.OAuthTokenParams
import com.telnyx.api.models.oauth.OAuthTokenResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class OAuthServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    OAuthService {

    private val withRawResponse: OAuthService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): OAuthService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OAuthService =
        OAuthServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: OAuthRetrieveParams,
        requestOptions: RequestOptions,
    ): OAuthRetrieveResponse =
        // get /oauth/consent/{consent_token}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun grants(
        params: OAuthGrantsParams,
        requestOptions: RequestOptions,
    ): OAuthGrantsResponse =
        // post /oauth/grants
        withRawResponse().grants(params, requestOptions).parse()

    override fun introspect(
        params: OAuthIntrospectParams,
        requestOptions: RequestOptions,
    ): OAuthIntrospectResponse =
        // post /oauth/introspect
        withRawResponse().introspect(params, requestOptions).parse()

    override fun register(
        params: OAuthRegisterParams,
        requestOptions: RequestOptions,
    ): OAuthRegisterResponse =
        // post /oauth/register
        withRawResponse().register(params, requestOptions).parse()

    override fun retrieveAuthorize(
        params: OAuthRetrieveAuthorizeParams,
        requestOptions: RequestOptions,
    ) {
        // get /oauth/authorize
        withRawResponse().retrieveAuthorize(params, requestOptions)
    }

    override fun retrieveJwks(
        params: OAuthRetrieveJwksParams,
        requestOptions: RequestOptions,
    ): OAuthRetrieveJwksResponse =
        // get /oauth/jwks
        withRawResponse().retrieveJwks(params, requestOptions).parse()

    override fun token(
        params: OAuthTokenParams,
        requestOptions: RequestOptions,
    ): OAuthTokenResponse =
        // post /oauth/token
        withRawResponse().token(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OAuthService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OAuthService.WithRawResponse =
            OAuthServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<OAuthRetrieveResponse> =
            jsonHandler<OAuthRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: OAuthRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OAuthRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("consentToken", params.consentToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("oauth", "consent", params._pathParam(0))
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

        private val grantsHandler: Handler<OAuthGrantsResponse> =
            jsonHandler<OAuthGrantsResponse>(clientOptions.jsonMapper)

        override fun grants(
            params: OAuthGrantsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OAuthGrantsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("oauth", "grants")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { grantsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val introspectHandler: Handler<OAuthIntrospectResponse> =
            jsonHandler<OAuthIntrospectResponse>(clientOptions.jsonMapper)

        override fun introspect(
            params: OAuthIntrospectParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OAuthIntrospectResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("oauth", "introspect")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { introspectHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val registerHandler: Handler<OAuthRegisterResponse> =
            jsonHandler<OAuthRegisterResponse>(clientOptions.jsonMapper)

        override fun register(
            params: OAuthRegisterParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OAuthRegisterResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("oauth", "register")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { registerHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveAuthorizeHandler: Handler<Void?> = emptyHandler()

        override fun retrieveAuthorize(
            params: OAuthRetrieveAuthorizeParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("oauth", "authorize")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { retrieveAuthorizeHandler.handle(it) }
            }
        }

        private val retrieveJwksHandler: Handler<OAuthRetrieveJwksResponse> =
            jsonHandler<OAuthRetrieveJwksResponse>(clientOptions.jsonMapper)

        override fun retrieveJwks(
            params: OAuthRetrieveJwksParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OAuthRetrieveJwksResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("oauth", "jwks")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveJwksHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val tokenHandler: Handler<OAuthTokenResponse> =
            jsonHandler<OAuthTokenResponse>(clientOptions.jsonMapper)

        override fun token(
            params: OAuthTokenParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OAuthTokenResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("oauth", "token")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { tokenHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
