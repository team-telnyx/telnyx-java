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
import com.telnyx.sdk.models.addresses.AddressCreateParams
import com.telnyx.sdk.models.addresses.AddressCreateResponse
import com.telnyx.sdk.models.addresses.AddressDeleteParams
import com.telnyx.sdk.models.addresses.AddressDeleteResponse
import com.telnyx.sdk.models.addresses.AddressListPage
import com.telnyx.sdk.models.addresses.AddressListPageResponse
import com.telnyx.sdk.models.addresses.AddressListParams
import com.telnyx.sdk.models.addresses.AddressRetrieveParams
import com.telnyx.sdk.models.addresses.AddressRetrieveResponse
import com.telnyx.sdk.services.blocking.addresses.ActionService
import com.telnyx.sdk.services.blocking.addresses.ActionServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AddressServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AddressService {

    private val withRawResponse: AddressService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val actions: ActionService by lazy { ActionServiceImpl(clientOptions) }

    override fun withRawResponse(): AddressService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AddressService =
        AddressServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun actions(): ActionService = actions

    override fun create(
        params: AddressCreateParams,
        requestOptions: RequestOptions,
    ): AddressCreateResponse =
        // post /addresses
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: AddressRetrieveParams,
        requestOptions: RequestOptions,
    ): AddressRetrieveResponse =
        // get /addresses/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: AddressListParams, requestOptions: RequestOptions): AddressListPage =
        // get /addresses
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: AddressDeleteParams,
        requestOptions: RequestOptions,
    ): AddressDeleteResponse =
        // delete /addresses/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AddressService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val actions: ActionService.WithRawResponse by lazy {
            ActionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AddressService.WithRawResponse =
            AddressServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun actions(): ActionService.WithRawResponse = actions

        private val createHandler: Handler<AddressCreateResponse> =
            jsonHandler<AddressCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: AddressCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AddressCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("addresses")
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

        private val retrieveHandler: Handler<AddressRetrieveResponse> =
            jsonHandler<AddressRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AddressRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AddressRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("addresses", params._pathParam(0))
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

        private val listHandler: Handler<AddressListPageResponse> =
            jsonHandler<AddressListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AddressListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AddressListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("addresses")
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
                        AddressListPage.builder()
                            .service(AddressServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<AddressDeleteResponse> =
            jsonHandler<AddressDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: AddressDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AddressDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("addresses", params._pathParam(0))
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
