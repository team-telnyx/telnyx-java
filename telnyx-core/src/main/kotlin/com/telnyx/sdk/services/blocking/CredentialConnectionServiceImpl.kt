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
import com.telnyx.sdk.models.credentialconnections.CredentialConnectionCreateParams
import com.telnyx.sdk.models.credentialconnections.CredentialConnectionCreateResponse
import com.telnyx.sdk.models.credentialconnections.CredentialConnectionDeleteParams
import com.telnyx.sdk.models.credentialconnections.CredentialConnectionDeleteResponse
import com.telnyx.sdk.models.credentialconnections.CredentialConnectionListParams
import com.telnyx.sdk.models.credentialconnections.CredentialConnectionListResponse
import com.telnyx.sdk.models.credentialconnections.CredentialConnectionRetrieveParams
import com.telnyx.sdk.models.credentialconnections.CredentialConnectionRetrieveResponse
import com.telnyx.sdk.models.credentialconnections.CredentialConnectionUpdateParams
import com.telnyx.sdk.models.credentialconnections.CredentialConnectionUpdateResponse
import com.telnyx.sdk.services.blocking.credentialconnections.ActionService
import com.telnyx.sdk.services.blocking.credentialconnections.ActionServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CredentialConnectionServiceImpl
internal constructor(private val clientOptions: ClientOptions) : CredentialConnectionService {

    private val withRawResponse: CredentialConnectionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val actions: ActionService by lazy { ActionServiceImpl(clientOptions) }

    override fun withRawResponse(): CredentialConnectionService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): CredentialConnectionService =
        CredentialConnectionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun actions(): ActionService = actions

    override fun create(
        params: CredentialConnectionCreateParams,
        requestOptions: RequestOptions,
    ): CredentialConnectionCreateResponse =
        // post /credential_connections
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: CredentialConnectionRetrieveParams,
        requestOptions: RequestOptions,
    ): CredentialConnectionRetrieveResponse =
        // get /credential_connections/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: CredentialConnectionUpdateParams,
        requestOptions: RequestOptions,
    ): CredentialConnectionUpdateResponse =
        // patch /credential_connections/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: CredentialConnectionListParams,
        requestOptions: RequestOptions,
    ): CredentialConnectionListResponse =
        // get /credential_connections
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: CredentialConnectionDeleteParams,
        requestOptions: RequestOptions,
    ): CredentialConnectionDeleteResponse =
        // delete /credential_connections/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CredentialConnectionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val actions: ActionService.WithRawResponse by lazy {
            ActionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CredentialConnectionService.WithRawResponse =
            CredentialConnectionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun actions(): ActionService.WithRawResponse = actions

        private val createHandler: Handler<CredentialConnectionCreateResponse> =
            jsonHandler<CredentialConnectionCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: CredentialConnectionCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CredentialConnectionCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("credential_connections")
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

        private val retrieveHandler: Handler<CredentialConnectionRetrieveResponse> =
            jsonHandler<CredentialConnectionRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CredentialConnectionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CredentialConnectionRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("credential_connections", params._pathParam(0))
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

        private val updateHandler: Handler<CredentialConnectionUpdateResponse> =
            jsonHandler<CredentialConnectionUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: CredentialConnectionUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CredentialConnectionUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("credential_connections", params._pathParam(0))
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

        private val listHandler: Handler<CredentialConnectionListResponse> =
            jsonHandler<CredentialConnectionListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CredentialConnectionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CredentialConnectionListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("credential_connections")
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

        private val deleteHandler: Handler<CredentialConnectionDeleteResponse> =
            jsonHandler<CredentialConnectionDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: CredentialConnectionDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CredentialConnectionDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("credential_connections", params._pathParam(0))
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
