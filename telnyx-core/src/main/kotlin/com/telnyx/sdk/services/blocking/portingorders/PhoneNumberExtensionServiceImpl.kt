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
import com.telnyx.sdk.models.portingorders.phonenumberextensions.PhoneNumberExtensionCreateParams
import com.telnyx.sdk.models.portingorders.phonenumberextensions.PhoneNumberExtensionCreateResponse
import com.telnyx.sdk.models.portingorders.phonenumberextensions.PhoneNumberExtensionDeleteParams
import com.telnyx.sdk.models.portingorders.phonenumberextensions.PhoneNumberExtensionDeleteResponse
import com.telnyx.sdk.models.portingorders.phonenumberextensions.PhoneNumberExtensionListParams
import com.telnyx.sdk.models.portingorders.phonenumberextensions.PhoneNumberExtensionListResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PhoneNumberExtensionServiceImpl
internal constructor(private val clientOptions: ClientOptions) : PhoneNumberExtensionService {

    private val withRawResponse: PhoneNumberExtensionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PhoneNumberExtensionService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): PhoneNumberExtensionService =
        PhoneNumberExtensionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: PhoneNumberExtensionCreateParams,
        requestOptions: RequestOptions,
    ): PhoneNumberExtensionCreateResponse =
        // post /porting_orders/{porting_order_id}/phone_number_extensions
        withRawResponse().create(params, requestOptions).parse()

    override fun list(
        params: PhoneNumberExtensionListParams,
        requestOptions: RequestOptions,
    ): PhoneNumberExtensionListResponse =
        // get /porting_orders/{porting_order_id}/phone_number_extensions
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: PhoneNumberExtensionDeleteParams,
        requestOptions: RequestOptions,
    ): PhoneNumberExtensionDeleteResponse =
        // delete /porting_orders/{porting_order_id}/phone_number_extensions/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PhoneNumberExtensionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PhoneNumberExtensionService.WithRawResponse =
            PhoneNumberExtensionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<PhoneNumberExtensionCreateResponse> =
            jsonHandler<PhoneNumberExtensionCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: PhoneNumberExtensionCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhoneNumberExtensionCreateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("portingOrderId", params.portingOrderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "porting_orders",
                        params._pathParam(0),
                        "phone_number_extensions",
                    )
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

        private val listHandler: Handler<PhoneNumberExtensionListResponse> =
            jsonHandler<PhoneNumberExtensionListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: PhoneNumberExtensionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhoneNumberExtensionListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("portingOrderId", params.portingOrderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "porting_orders",
                        params._pathParam(0),
                        "phone_number_extensions",
                    )
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

        private val deleteHandler: Handler<PhoneNumberExtensionDeleteResponse> =
            jsonHandler<PhoneNumberExtensionDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: PhoneNumberExtensionDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhoneNumberExtensionDeleteResponse> {
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
                        "phone_number_extensions",
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
