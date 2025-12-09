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
import com.telnyx.sdk.models.portingorders.associatedphonenumbers.AssociatedPhoneNumberCreateParams
import com.telnyx.sdk.models.portingorders.associatedphonenumbers.AssociatedPhoneNumberCreateResponse
import com.telnyx.sdk.models.portingorders.associatedphonenumbers.AssociatedPhoneNumberDeleteParams
import com.telnyx.sdk.models.portingorders.associatedphonenumbers.AssociatedPhoneNumberDeleteResponse
import com.telnyx.sdk.models.portingorders.associatedphonenumbers.AssociatedPhoneNumberListPage
import com.telnyx.sdk.models.portingorders.associatedphonenumbers.AssociatedPhoneNumberListPageResponse
import com.telnyx.sdk.models.portingorders.associatedphonenumbers.AssociatedPhoneNumberListParams
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
    ): AssociatedPhoneNumberListPage =
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

        private val listHandler: Handler<AssociatedPhoneNumberListPageResponse> =
            jsonHandler<AssociatedPhoneNumberListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AssociatedPhoneNumberListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssociatedPhoneNumberListPage> {
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
                    .let {
                        AssociatedPhoneNumberListPage.builder()
                            .service(AssociatedPhoneNumberServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
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
