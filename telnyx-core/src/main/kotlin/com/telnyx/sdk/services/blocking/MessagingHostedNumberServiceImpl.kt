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
import com.telnyx.sdk.models.messaginghostednumbers.MessagingHostedNumberDeleteParams
import com.telnyx.sdk.models.messaginghostednumbers.MessagingHostedNumberDeleteResponse
import com.telnyx.sdk.models.messaginghostednumbers.MessagingHostedNumberListPage
import com.telnyx.sdk.models.messaginghostednumbers.MessagingHostedNumberListPageResponse
import com.telnyx.sdk.models.messaginghostednumbers.MessagingHostedNumberListParams
import com.telnyx.sdk.models.messaginghostednumbers.MessagingHostedNumberRetrieveParams
import com.telnyx.sdk.models.messaginghostednumbers.MessagingHostedNumberRetrieveResponse
import com.telnyx.sdk.models.messaginghostednumbers.MessagingHostedNumberUpdateParams
import com.telnyx.sdk.models.messaginghostednumbers.MessagingHostedNumberUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class MessagingHostedNumberServiceImpl
internal constructor(private val clientOptions: ClientOptions) : MessagingHostedNumberService {

    private val withRawResponse: MessagingHostedNumberService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MessagingHostedNumberService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): MessagingHostedNumberService =
        MessagingHostedNumberServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: MessagingHostedNumberRetrieveParams,
        requestOptions: RequestOptions,
    ): MessagingHostedNumberRetrieveResponse =
        // get /messaging_hosted_numbers/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: MessagingHostedNumberUpdateParams,
        requestOptions: RequestOptions,
    ): MessagingHostedNumberUpdateResponse =
        // patch /messaging_hosted_numbers/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: MessagingHostedNumberListParams,
        requestOptions: RequestOptions,
    ): MessagingHostedNumberListPage =
        // get /messaging_hosted_numbers
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: MessagingHostedNumberDeleteParams,
        requestOptions: RequestOptions,
    ): MessagingHostedNumberDeleteResponse =
        // delete /messaging_hosted_numbers/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MessagingHostedNumberService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MessagingHostedNumberService.WithRawResponse =
            MessagingHostedNumberServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<MessagingHostedNumberRetrieveResponse> =
            jsonHandler<MessagingHostedNumberRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: MessagingHostedNumberRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessagingHostedNumberRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("messaging_hosted_numbers", params._pathParam(0))
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

        private val updateHandler: Handler<MessagingHostedNumberUpdateResponse> =
            jsonHandler<MessagingHostedNumberUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: MessagingHostedNumberUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessagingHostedNumberUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("messaging_hosted_numbers", params._pathParam(0))
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

        private val listHandler: Handler<MessagingHostedNumberListPageResponse> =
            jsonHandler<MessagingHostedNumberListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: MessagingHostedNumberListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessagingHostedNumberListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("messaging_hosted_numbers")
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
                        MessagingHostedNumberListPage.builder()
                            .service(MessagingHostedNumberServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<MessagingHostedNumberDeleteResponse> =
            jsonHandler<MessagingHostedNumberDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: MessagingHostedNumberDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessagingHostedNumberDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("messaging_hosted_numbers", params._pathParam(0))
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
