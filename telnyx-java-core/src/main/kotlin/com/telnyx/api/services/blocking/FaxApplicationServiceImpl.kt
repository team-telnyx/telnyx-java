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
import com.telnyx.api.models.faxapplications.FaxApplicationCreateParams
import com.telnyx.api.models.faxapplications.FaxApplicationCreateResponse
import com.telnyx.api.models.faxapplications.FaxApplicationDeleteParams
import com.telnyx.api.models.faxapplications.FaxApplicationDeleteResponse
import com.telnyx.api.models.faxapplications.FaxApplicationListParams
import com.telnyx.api.models.faxapplications.FaxApplicationListResponse
import com.telnyx.api.models.faxapplications.FaxApplicationRetrieveParams
import com.telnyx.api.models.faxapplications.FaxApplicationRetrieveResponse
import com.telnyx.api.models.faxapplications.FaxApplicationUpdateParams
import com.telnyx.api.models.faxapplications.FaxApplicationUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class FaxApplicationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    FaxApplicationService {

    private val withRawResponse: FaxApplicationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FaxApplicationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FaxApplicationService =
        FaxApplicationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: FaxApplicationCreateParams,
        requestOptions: RequestOptions,
    ): FaxApplicationCreateResponse =
        // post /fax_applications
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: FaxApplicationRetrieveParams,
        requestOptions: RequestOptions,
    ): FaxApplicationRetrieveResponse =
        // get /fax_applications/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: FaxApplicationUpdateParams,
        requestOptions: RequestOptions,
    ): FaxApplicationUpdateResponse =
        // patch /fax_applications/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: FaxApplicationListParams,
        requestOptions: RequestOptions,
    ): FaxApplicationListResponse =
        // get /fax_applications
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: FaxApplicationDeleteParams,
        requestOptions: RequestOptions,
    ): FaxApplicationDeleteResponse =
        // delete /fax_applications/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FaxApplicationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FaxApplicationService.WithRawResponse =
            FaxApplicationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<FaxApplicationCreateResponse> =
            jsonHandler<FaxApplicationCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: FaxApplicationCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FaxApplicationCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("fax_applications")
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

        private val retrieveHandler: Handler<FaxApplicationRetrieveResponse> =
            jsonHandler<FaxApplicationRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: FaxApplicationRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FaxApplicationRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("fax_applications", params._pathParam(0))
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

        private val updateHandler: Handler<FaxApplicationUpdateResponse> =
            jsonHandler<FaxApplicationUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: FaxApplicationUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FaxApplicationUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("fax_applications", params._pathParam(0))
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

        private val listHandler: Handler<FaxApplicationListResponse> =
            jsonHandler<FaxApplicationListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: FaxApplicationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FaxApplicationListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("fax_applications")
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

        private val deleteHandler: Handler<FaxApplicationDeleteResponse> =
            jsonHandler<FaxApplicationDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: FaxApplicationDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FaxApplicationDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("fax_applications", params._pathParam(0))
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
