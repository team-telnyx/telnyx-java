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
import com.telnyx.sdk.models.uacconnections.UacConnectionCreateParams
import com.telnyx.sdk.models.uacconnections.UacConnectionCreateResponse
import com.telnyx.sdk.models.uacconnections.UacConnectionDeleteParams
import com.telnyx.sdk.models.uacconnections.UacConnectionDeleteResponse
import com.telnyx.sdk.models.uacconnections.UacConnectionListPage
import com.telnyx.sdk.models.uacconnections.UacConnectionListPageResponse
import com.telnyx.sdk.models.uacconnections.UacConnectionListParams
import com.telnyx.sdk.models.uacconnections.UacConnectionRetrieveParams
import com.telnyx.sdk.models.uacconnections.UacConnectionRetrieveResponse
import com.telnyx.sdk.models.uacconnections.UacConnectionUpdateParams
import com.telnyx.sdk.models.uacconnections.UacConnectionUpdateResponse
import com.telnyx.sdk.services.blocking.uacconnections.ActionService
import com.telnyx.sdk.services.blocking.uacconnections.ActionServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** UAC connection operations */
class UacConnectionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    UacConnectionService {

    private val withRawResponse: UacConnectionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val actions: ActionService by lazy { ActionServiceImpl(clientOptions) }

    override fun withRawResponse(): UacConnectionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UacConnectionService =
        UacConnectionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** UAC connection operations */
    override fun actions(): ActionService = actions

    override fun create(
        params: UacConnectionCreateParams,
        requestOptions: RequestOptions,
    ): UacConnectionCreateResponse =
        // post /uac_connections
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: UacConnectionRetrieveParams,
        requestOptions: RequestOptions,
    ): UacConnectionRetrieveResponse =
        // get /uac_connections/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: UacConnectionUpdateParams,
        requestOptions: RequestOptions,
    ): UacConnectionUpdateResponse =
        // patch /uac_connections/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: UacConnectionListParams,
        requestOptions: RequestOptions,
    ): UacConnectionListPage =
        // get /uac_connections
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: UacConnectionDeleteParams,
        requestOptions: RequestOptions,
    ): UacConnectionDeleteResponse =
        // delete /uac_connections/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UacConnectionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val actions: ActionService.WithRawResponse by lazy {
            ActionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UacConnectionService.WithRawResponse =
            UacConnectionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** UAC connection operations */
        override fun actions(): ActionService.WithRawResponse = actions

        private val createHandler: Handler<UacConnectionCreateResponse> =
            jsonHandler<UacConnectionCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: UacConnectionCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UacConnectionCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("uac_connections")
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

        private val retrieveHandler: Handler<UacConnectionRetrieveResponse> =
            jsonHandler<UacConnectionRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: UacConnectionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UacConnectionRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("uac_connections", params._pathParam(0))
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

        private val updateHandler: Handler<UacConnectionUpdateResponse> =
            jsonHandler<UacConnectionUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: UacConnectionUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UacConnectionUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("uac_connections", params._pathParam(0))
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

        private val listHandler: Handler<UacConnectionListPageResponse> =
            jsonHandler<UacConnectionListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: UacConnectionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UacConnectionListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("uac_connections")
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
                        UacConnectionListPage.builder()
                            .service(UacConnectionServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<UacConnectionDeleteResponse> =
            jsonHandler<UacConnectionDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: UacConnectionDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UacConnectionDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("uac_connections", params._pathParam(0))
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
