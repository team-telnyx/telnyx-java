// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.phonenumbers

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
import com.telnyx.sdk.models.phonenumbers.messaging.MessagingListParams
import com.telnyx.sdk.models.phonenumbers.messaging.MessagingListResponse
import com.telnyx.sdk.models.phonenumbers.messaging.MessagingRetrieveParams
import com.telnyx.sdk.models.phonenumbers.messaging.MessagingRetrieveResponse
import com.telnyx.sdk.models.phonenumbers.messaging.MessagingUpdateParams
import com.telnyx.sdk.models.phonenumbers.messaging.MessagingUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class MessagingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MessagingService {

    private val withRawResponse: MessagingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MessagingService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessagingService =
        MessagingServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: MessagingRetrieveParams,
        requestOptions: RequestOptions,
    ): MessagingRetrieveResponse =
        // get /phone_numbers/{id}/messaging
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: MessagingUpdateParams,
        requestOptions: RequestOptions,
    ): MessagingUpdateResponse =
        // patch /phone_numbers/{id}/messaging
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: MessagingListParams,
        requestOptions: RequestOptions,
    ): MessagingListResponse =
        // get /phone_numbers/messaging
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MessagingService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MessagingService.WithRawResponse =
            MessagingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<MessagingRetrieveResponse> =
            jsonHandler<MessagingRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: MessagingRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessagingRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("phone_numbers", params._pathParam(0), "messaging")
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

        private val updateHandler: Handler<MessagingUpdateResponse> =
            jsonHandler<MessagingUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: MessagingUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessagingUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("phone_numbers", params._pathParam(0), "messaging")
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

        private val listHandler: Handler<MessagingListResponse> =
            jsonHandler<MessagingListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: MessagingListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessagingListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("phone_numbers", "messaging")
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
    }
}
