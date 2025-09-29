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
import com.telnyx.sdk.models.messagingnumbersbulkupdates.MessagingNumbersBulkUpdateCreateParams
import com.telnyx.sdk.models.messagingnumbersbulkupdates.MessagingNumbersBulkUpdateCreateResponse
import com.telnyx.sdk.models.messagingnumbersbulkupdates.MessagingNumbersBulkUpdateRetrieveParams
import com.telnyx.sdk.models.messagingnumbersbulkupdates.MessagingNumbersBulkUpdateRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class MessagingNumbersBulkUpdateServiceImpl
internal constructor(private val clientOptions: ClientOptions) : MessagingNumbersBulkUpdateService {

    private val withRawResponse: MessagingNumbersBulkUpdateService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MessagingNumbersBulkUpdateService.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): MessagingNumbersBulkUpdateService =
        MessagingNumbersBulkUpdateServiceImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun create(
        params: MessagingNumbersBulkUpdateCreateParams,
        requestOptions: RequestOptions,
    ): MessagingNumbersBulkUpdateCreateResponse =
        // post /messaging_numbers_bulk_updates
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: MessagingNumbersBulkUpdateRetrieveParams,
        requestOptions: RequestOptions,
    ): MessagingNumbersBulkUpdateRetrieveResponse =
        // get /messaging_numbers_bulk_updates/{order_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MessagingNumbersBulkUpdateService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MessagingNumbersBulkUpdateService.WithRawResponse =
            MessagingNumbersBulkUpdateServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<MessagingNumbersBulkUpdateCreateResponse> =
            jsonHandler<MessagingNumbersBulkUpdateCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: MessagingNumbersBulkUpdateCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessagingNumbersBulkUpdateCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("messaging_numbers_bulk_updates")
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

        private val retrieveHandler: Handler<MessagingNumbersBulkUpdateRetrieveResponse> =
            jsonHandler<MessagingNumbersBulkUpdateRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: MessagingNumbersBulkUpdateRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessagingNumbersBulkUpdateRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("orderId", params.orderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("messaging_numbers_bulk_updates", params._pathParam(0))
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
    }
}
