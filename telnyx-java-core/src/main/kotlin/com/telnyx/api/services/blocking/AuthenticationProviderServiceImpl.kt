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
import com.telnyx.api.models.authenticationproviders.AuthenticationProviderCreateParams
import com.telnyx.api.models.authenticationproviders.AuthenticationProviderCreateResponse
import com.telnyx.api.models.authenticationproviders.AuthenticationProviderDeleteParams
import com.telnyx.api.models.authenticationproviders.AuthenticationProviderDeleteResponse
import com.telnyx.api.models.authenticationproviders.AuthenticationProviderListParams
import com.telnyx.api.models.authenticationproviders.AuthenticationProviderListResponse
import com.telnyx.api.models.authenticationproviders.AuthenticationProviderRetrieveParams
import com.telnyx.api.models.authenticationproviders.AuthenticationProviderRetrieveResponse
import com.telnyx.api.models.authenticationproviders.AuthenticationProviderUpdateParams
import com.telnyx.api.models.authenticationproviders.AuthenticationProviderUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AuthenticationProviderServiceImpl
internal constructor(private val clientOptions: ClientOptions) : AuthenticationProviderService {

    private val withRawResponse: AuthenticationProviderService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AuthenticationProviderService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): AuthenticationProviderService =
        AuthenticationProviderServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: AuthenticationProviderCreateParams,
        requestOptions: RequestOptions,
    ): AuthenticationProviderCreateResponse =
        // post /authentication_providers
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: AuthenticationProviderRetrieveParams,
        requestOptions: RequestOptions,
    ): AuthenticationProviderRetrieveResponse =
        // get /authentication_providers/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: AuthenticationProviderUpdateParams,
        requestOptions: RequestOptions,
    ): AuthenticationProviderUpdateResponse =
        // patch /authentication_providers/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: AuthenticationProviderListParams,
        requestOptions: RequestOptions,
    ): AuthenticationProviderListResponse =
        // get /authentication_providers
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: AuthenticationProviderDeleteParams,
        requestOptions: RequestOptions,
    ): AuthenticationProviderDeleteResponse =
        // delete /authentication_providers/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AuthenticationProviderService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AuthenticationProviderService.WithRawResponse =
            AuthenticationProviderServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<AuthenticationProviderCreateResponse> =
            jsonHandler<AuthenticationProviderCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: AuthenticationProviderCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AuthenticationProviderCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("authentication_providers")
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

        private val retrieveHandler: Handler<AuthenticationProviderRetrieveResponse> =
            jsonHandler<AuthenticationProviderRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AuthenticationProviderRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AuthenticationProviderRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("authentication_providers", params._pathParam(0))
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

        private val updateHandler: Handler<AuthenticationProviderUpdateResponse> =
            jsonHandler<AuthenticationProviderUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: AuthenticationProviderUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AuthenticationProviderUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("authentication_providers", params._pathParam(0))
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

        private val listHandler: Handler<AuthenticationProviderListResponse> =
            jsonHandler<AuthenticationProviderListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AuthenticationProviderListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AuthenticationProviderListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("authentication_providers")
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

        private val deleteHandler: Handler<AuthenticationProviderDeleteResponse> =
            jsonHandler<AuthenticationProviderDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: AuthenticationProviderDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AuthenticationProviderDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("authentication_providers", params._pathParam(0))
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
