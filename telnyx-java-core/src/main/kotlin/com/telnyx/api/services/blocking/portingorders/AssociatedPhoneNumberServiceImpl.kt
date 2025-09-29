// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.portingorders

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
import com.telnyx.api.models.portingorders.associatedphonenumbers.AssociatedPhoneNumberCreateParams
import com.telnyx.api.models.portingorders.associatedphonenumbers.AssociatedPhoneNumberCreateResponse
import com.telnyx.api.models.portingorders.associatedphonenumbers.AssociatedPhoneNumberDeleteParams
import com.telnyx.api.models.portingorders.associatedphonenumbers.AssociatedPhoneNumberDeleteResponse
import com.telnyx.api.models.portingorders.associatedphonenumbers.AssociatedPhoneNumberListParams
import com.telnyx.api.models.portingorders.associatedphonenumbers.AssociatedPhoneNumberListResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AssociatedPhoneNumberServiceImpl
internal constructor(private val clientOptions: ClientOptions) : AssociatedPhoneNumberService {

    private val withRawResponse: AssociatedPhoneNumberService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AssociatedPhoneNumberService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): AssociatedPhoneNumberService =
        AssociatedPhoneNumberServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: AssociatedPhoneNumberCreateParams,
        requestOptions: RequestOptions,
    ): AssociatedPhoneNumberCreateResponse =
        // post /porting_orders/{porting_order_id}/associated_phone_numbers
        withRawResponse().create(params, requestOptions).parse()

    override fun list(
        params: AssociatedPhoneNumberListParams,
        requestOptions: RequestOptions,
    ): AssociatedPhoneNumberListResponse =
        // get /porting_orders/{porting_order_id}/associated_phone_numbers
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: AssociatedPhoneNumberDeleteParams,
        requestOptions: RequestOptions,
    ): AssociatedPhoneNumberDeleteResponse =
        // delete /porting_orders/{porting_order_id}/associated_phone_numbers/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AssociatedPhoneNumberService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AssociatedPhoneNumberService.WithRawResponse =
            AssociatedPhoneNumberServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<AssociatedPhoneNumberCreateResponse> =
            jsonHandler<AssociatedPhoneNumberCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: AssociatedPhoneNumberCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssociatedPhoneNumberCreateResponse> {
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
                        "associated_phone_numbers",
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

        private val listHandler: Handler<AssociatedPhoneNumberListResponse> =
            jsonHandler<AssociatedPhoneNumberListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AssociatedPhoneNumberListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssociatedPhoneNumberListResponse> {
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
                        "associated_phone_numbers",
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

        private val deleteHandler: Handler<AssociatedPhoneNumberDeleteResponse> =
            jsonHandler<AssociatedPhoneNumberDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: AssociatedPhoneNumberDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssociatedPhoneNumberDeleteResponse> {
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
                        "associated_phone_numbers",
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
