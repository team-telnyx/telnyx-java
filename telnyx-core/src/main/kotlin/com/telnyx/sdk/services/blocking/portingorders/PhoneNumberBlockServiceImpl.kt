// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.portingorders

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
import com.telnyx.sdk.models.portingorders.phonenumberblocks.PhoneNumberBlockCreateParams
import com.telnyx.sdk.models.portingorders.phonenumberblocks.PhoneNumberBlockCreateResponse
import com.telnyx.sdk.models.portingorders.phonenumberblocks.PhoneNumberBlockDeleteParams
import com.telnyx.sdk.models.portingorders.phonenumberblocks.PhoneNumberBlockDeleteResponse
import com.telnyx.sdk.models.portingorders.phonenumberblocks.PhoneNumberBlockListPage
import com.telnyx.sdk.models.portingorders.phonenumberblocks.PhoneNumberBlockListPageResponse
import com.telnyx.sdk.models.portingorders.phonenumberblocks.PhoneNumberBlockListParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Endpoints related to porting orders management. */
class PhoneNumberBlockServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PhoneNumberBlockService {

    private val withRawResponse: PhoneNumberBlockService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PhoneNumberBlockService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PhoneNumberBlockService =
        PhoneNumberBlockServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: PhoneNumberBlockCreateParams,
        requestOptions: RequestOptions,
    ): PhoneNumberBlockCreateResponse =
        // post /porting_orders/{porting_order_id}/phone_number_blocks
        withRawResponse().create(params, requestOptions).parse()

    override fun list(
        params: PhoneNumberBlockListParams,
        requestOptions: RequestOptions,
    ): PhoneNumberBlockListPage =
        // get /porting_orders/{porting_order_id}/phone_number_blocks
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: PhoneNumberBlockDeleteParams,
        requestOptions: RequestOptions,
    ): PhoneNumberBlockDeleteResponse =
        // delete /porting_orders/{porting_order_id}/phone_number_blocks/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PhoneNumberBlockService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PhoneNumberBlockService.WithRawResponse =
            PhoneNumberBlockServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<PhoneNumberBlockCreateResponse> =
            jsonHandler<PhoneNumberBlockCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: PhoneNumberBlockCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhoneNumberBlockCreateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("portingOrderId", params.portingOrderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting_orders", params._pathParam(0), "phone_number_blocks")
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

        private val listHandler: Handler<PhoneNumberBlockListPageResponse> =
            jsonHandler<PhoneNumberBlockListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: PhoneNumberBlockListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhoneNumberBlockListPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("portingOrderId", params.portingOrderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting_orders", params._pathParam(0), "phone_number_blocks")
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
                        PhoneNumberBlockListPage.builder()
                            .service(PhoneNumberBlockServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<PhoneNumberBlockDeleteResponse> =
            jsonHandler<PhoneNumberBlockDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: PhoneNumberBlockDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhoneNumberBlockDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "porting_orders",
                        params._pathParam(0),
                        "phone_number_blocks",
                        params._pathParam(1),
                    )
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
