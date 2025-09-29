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
import com.telnyx.sdk.models.verifiednumbers.VerifiedNumberCreateParams
import com.telnyx.sdk.models.verifiednumbers.VerifiedNumberCreateResponse
import com.telnyx.sdk.models.verifiednumbers.VerifiedNumberDataWrapper
import com.telnyx.sdk.models.verifiednumbers.VerifiedNumberDeleteParams
import com.telnyx.sdk.models.verifiednumbers.VerifiedNumberListParams
import com.telnyx.sdk.models.verifiednumbers.VerifiedNumberListResponse
import com.telnyx.sdk.models.verifiednumbers.VerifiedNumberRetrieveParams
import com.telnyx.sdk.services.blocking.verifiednumbers.ActionService
import com.telnyx.sdk.services.blocking.verifiednumbers.ActionServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class VerifiedNumberServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    VerifiedNumberService {

    private val withRawResponse: VerifiedNumberService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val actions: ActionService by lazy { ActionServiceImpl(clientOptions) }

    override fun withRawResponse(): VerifiedNumberService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): VerifiedNumberService =
        VerifiedNumberServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun actions(): ActionService = actions

    override fun create(
        params: VerifiedNumberCreateParams,
        requestOptions: RequestOptions,
    ): VerifiedNumberCreateResponse =
        // post /verified_numbers
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: VerifiedNumberRetrieveParams,
        requestOptions: RequestOptions,
    ): VerifiedNumberDataWrapper =
        // get /verified_numbers/{phone_number}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: VerifiedNumberListParams,
        requestOptions: RequestOptions,
    ): VerifiedNumberListResponse =
        // get /verified_numbers
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: VerifiedNumberDeleteParams,
        requestOptions: RequestOptions,
    ): VerifiedNumberDataWrapper =
        // delete /verified_numbers/{phone_number}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VerifiedNumberService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val actions: ActionService.WithRawResponse by lazy {
            ActionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VerifiedNumberService.WithRawResponse =
            VerifiedNumberServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun actions(): ActionService.WithRawResponse = actions

        private val createHandler: Handler<VerifiedNumberCreateResponse> =
            jsonHandler<VerifiedNumberCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: VerifiedNumberCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerifiedNumberCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("verified_numbers")
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

        private val retrieveHandler: Handler<VerifiedNumberDataWrapper> =
            jsonHandler<VerifiedNumberDataWrapper>(clientOptions.jsonMapper)

        override fun retrieve(
            params: VerifiedNumberRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerifiedNumberDataWrapper> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("phoneNumber", params.phoneNumber().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("verified_numbers", params._pathParam(0))
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

        private val listHandler: Handler<VerifiedNumberListResponse> =
            jsonHandler<VerifiedNumberListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: VerifiedNumberListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerifiedNumberListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("verified_numbers")
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

        private val deleteHandler: Handler<VerifiedNumberDataWrapper> =
            jsonHandler<VerifiedNumberDataWrapper>(clientOptions.jsonMapper)

        override fun delete(
            params: VerifiedNumberDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerifiedNumberDataWrapper> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("phoneNumber", params.phoneNumber().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("verified_numbers", params._pathParam(0))
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
