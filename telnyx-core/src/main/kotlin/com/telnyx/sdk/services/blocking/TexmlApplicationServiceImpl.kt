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
import com.telnyx.sdk.models.texmlapplications.TexmlApplicationCreateParams
import com.telnyx.sdk.models.texmlapplications.TexmlApplicationCreateResponse
import com.telnyx.sdk.models.texmlapplications.TexmlApplicationDeleteParams
import com.telnyx.sdk.models.texmlapplications.TexmlApplicationDeleteResponse
import com.telnyx.sdk.models.texmlapplications.TexmlApplicationListParams
import com.telnyx.sdk.models.texmlapplications.TexmlApplicationListResponse
import com.telnyx.sdk.models.texmlapplications.TexmlApplicationRetrieveParams
import com.telnyx.sdk.models.texmlapplications.TexmlApplicationRetrieveResponse
import com.telnyx.sdk.models.texmlapplications.TexmlApplicationUpdateParams
import com.telnyx.sdk.models.texmlapplications.TexmlApplicationUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class TexmlApplicationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TexmlApplicationService {

    private val withRawResponse: TexmlApplicationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TexmlApplicationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TexmlApplicationService =
        TexmlApplicationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: TexmlApplicationCreateParams,
        requestOptions: RequestOptions,
    ): TexmlApplicationCreateResponse =
        // post /texml_applications
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: TexmlApplicationRetrieveParams,
        requestOptions: RequestOptions,
    ): TexmlApplicationRetrieveResponse =
        // get /texml_applications/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: TexmlApplicationUpdateParams,
        requestOptions: RequestOptions,
    ): TexmlApplicationUpdateResponse =
        // patch /texml_applications/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: TexmlApplicationListParams,
        requestOptions: RequestOptions,
    ): TexmlApplicationListResponse =
        // get /texml_applications
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: TexmlApplicationDeleteParams,
        requestOptions: RequestOptions,
    ): TexmlApplicationDeleteResponse =
        // delete /texml_applications/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TexmlApplicationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TexmlApplicationService.WithRawResponse =
            TexmlApplicationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<TexmlApplicationCreateResponse> =
            jsonHandler<TexmlApplicationCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: TexmlApplicationCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TexmlApplicationCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("texml_applications")
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

        private val retrieveHandler: Handler<TexmlApplicationRetrieveResponse> =
            jsonHandler<TexmlApplicationRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: TexmlApplicationRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TexmlApplicationRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("texml_applications", params._pathParam(0))
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

        private val updateHandler: Handler<TexmlApplicationUpdateResponse> =
            jsonHandler<TexmlApplicationUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: TexmlApplicationUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TexmlApplicationUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("texml_applications", params._pathParam(0))
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

        private val listHandler: Handler<TexmlApplicationListResponse> =
            jsonHandler<TexmlApplicationListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: TexmlApplicationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TexmlApplicationListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("texml_applications")
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

        private val deleteHandler: Handler<TexmlApplicationDeleteResponse> =
            jsonHandler<TexmlApplicationDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: TexmlApplicationDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TexmlApplicationDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("texml_applications", params._pathParam(0))
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
