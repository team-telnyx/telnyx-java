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
import com.telnyx.sdk.core.http.multipartFormData
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.faxes.FaxCreateParams
import com.telnyx.sdk.models.faxes.FaxCreateResponse
import com.telnyx.sdk.models.faxes.FaxDeleteParams
import com.telnyx.sdk.models.faxes.FaxListPage
import com.telnyx.sdk.models.faxes.FaxListPageResponse
import com.telnyx.sdk.models.faxes.FaxListParams
import com.telnyx.sdk.models.faxes.FaxRetrieveParams
import com.telnyx.sdk.models.faxes.FaxRetrieveResponse
import com.telnyx.sdk.services.blocking.faxes.ActionService
import com.telnyx.sdk.services.blocking.faxes.ActionServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Programmable fax command operations */
class FaxServiceImpl internal constructor(private val clientOptions: ClientOptions) : FaxService {

    private val withRawResponse: FaxService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val actions: ActionService by lazy { ActionServiceImpl(clientOptions) }

    override fun withRawResponse(): FaxService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FaxService =
        FaxServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Programmable fax command operations */
    override fun actions(): ActionService = actions

    override fun create(
        params: FaxCreateParams,
        requestOptions: RequestOptions,
    ): FaxCreateResponse =
        // post /faxes
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: FaxRetrieveParams,
        requestOptions: RequestOptions,
    ): FaxRetrieveResponse =
        // get /faxes/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: FaxListParams, requestOptions: RequestOptions): FaxListPage =
        // get /faxes
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: FaxDeleteParams, requestOptions: RequestOptions) {
        // delete /faxes/{id}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FaxService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val actions: ActionService.WithRawResponse by lazy {
            ActionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FaxService.WithRawResponse =
            FaxServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Programmable fax command operations */
        override fun actions(): ActionService.WithRawResponse = actions

        private val createHandler: Handler<FaxCreateResponse> =
            jsonHandler<FaxCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: FaxCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FaxCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("faxes")
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
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

        private val retrieveHandler: Handler<FaxRetrieveResponse> =
            jsonHandler<FaxRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: FaxRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FaxRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("faxes", params._pathParam(0))
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

        private val listHandler: Handler<FaxListPageResponse> =
            jsonHandler<FaxListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: FaxListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FaxListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("faxes")
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
                        FaxListPage.builder()
                            .service(FaxServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: FaxDeleteParams, requestOptions: RequestOptions): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("faxes", params._pathParam(0))
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
