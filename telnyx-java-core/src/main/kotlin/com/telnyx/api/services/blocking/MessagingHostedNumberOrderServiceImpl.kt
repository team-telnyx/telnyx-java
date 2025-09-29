// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

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
import com.telnyx.api.models.messaginghostednumberorders.MessagingHostedNumberOrderCheckEligibilityParams
import com.telnyx.api.models.messaginghostednumberorders.MessagingHostedNumberOrderCheckEligibilityResponse
import com.telnyx.api.models.messaginghostednumberorders.MessagingHostedNumberOrderCreateParams
import com.telnyx.api.models.messaginghostednumberorders.MessagingHostedNumberOrderCreateResponse
import com.telnyx.api.models.messaginghostednumberorders.MessagingHostedNumberOrderCreateVerificationCodesParams
import com.telnyx.api.models.messaginghostednumberorders.MessagingHostedNumberOrderCreateVerificationCodesResponse
import com.telnyx.api.models.messaginghostednumberorders.MessagingHostedNumberOrderDeleteParams
import com.telnyx.api.models.messaginghostednumberorders.MessagingHostedNumberOrderDeleteResponse
import com.telnyx.api.models.messaginghostednumberorders.MessagingHostedNumberOrderListParams
import com.telnyx.api.models.messaginghostednumberorders.MessagingHostedNumberOrderListResponse
import com.telnyx.api.models.messaginghostednumberorders.MessagingHostedNumberOrderRetrieveParams
import com.telnyx.api.models.messaginghostednumberorders.MessagingHostedNumberOrderRetrieveResponse
import com.telnyx.api.models.messaginghostednumberorders.MessagingHostedNumberOrderValidateCodesParams
import com.telnyx.api.models.messaginghostednumberorders.MessagingHostedNumberOrderValidateCodesResponse
import com.telnyx.api.services.blocking.messaginghostednumberorders.ActionService
import com.telnyx.api.services.blocking.messaginghostednumberorders.ActionServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class MessagingHostedNumberOrderServiceImpl
internal constructor(private val clientOptions: ClientOptions) : MessagingHostedNumberOrderService {

    private val withRawResponse: MessagingHostedNumberOrderService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val actions: ActionService by lazy { ActionServiceImpl(clientOptions) }

    override fun withRawResponse(): MessagingHostedNumberOrderService.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): MessagingHostedNumberOrderService =
        MessagingHostedNumberOrderServiceImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun actions(): ActionService = actions

    override fun create(
        params: MessagingHostedNumberOrderCreateParams,
        requestOptions: RequestOptions,
    ): MessagingHostedNumberOrderCreateResponse =
        // post /messaging_hosted_number_orders
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: MessagingHostedNumberOrderRetrieveParams,
        requestOptions: RequestOptions,
    ): MessagingHostedNumberOrderRetrieveResponse =
        // get /messaging_hosted_number_orders/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: MessagingHostedNumberOrderListParams,
        requestOptions: RequestOptions,
    ): MessagingHostedNumberOrderListResponse =
        // get /messaging_hosted_number_orders
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: MessagingHostedNumberOrderDeleteParams,
        requestOptions: RequestOptions,
    ): MessagingHostedNumberOrderDeleteResponse =
        // delete /messaging_hosted_number_orders/{id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun checkEligibility(
        params: MessagingHostedNumberOrderCheckEligibilityParams,
        requestOptions: RequestOptions,
    ): MessagingHostedNumberOrderCheckEligibilityResponse =
        // post /messaging_hosted_number_orders/eligibility_numbers_check
        withRawResponse().checkEligibility(params, requestOptions).parse()

    override fun createVerificationCodes(
        params: MessagingHostedNumberOrderCreateVerificationCodesParams,
        requestOptions: RequestOptions,
    ): MessagingHostedNumberOrderCreateVerificationCodesResponse =
        // post /messaging_hosted_number_orders/{id}/verification_codes
        withRawResponse().createVerificationCodes(params, requestOptions).parse()

    override fun validateCodes(
        params: MessagingHostedNumberOrderValidateCodesParams,
        requestOptions: RequestOptions,
    ): MessagingHostedNumberOrderValidateCodesResponse =
        // post /messaging_hosted_number_orders/{id}/validation_codes
        withRawResponse().validateCodes(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MessagingHostedNumberOrderService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val actions: ActionService.WithRawResponse by lazy {
            ActionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MessagingHostedNumberOrderService.WithRawResponse =
            MessagingHostedNumberOrderServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun actions(): ActionService.WithRawResponse = actions

        private val createHandler: Handler<MessagingHostedNumberOrderCreateResponse> =
            jsonHandler<MessagingHostedNumberOrderCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: MessagingHostedNumberOrderCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessagingHostedNumberOrderCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("messaging_hosted_number_orders")
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

        private val retrieveHandler: Handler<MessagingHostedNumberOrderRetrieveResponse> =
            jsonHandler<MessagingHostedNumberOrderRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: MessagingHostedNumberOrderRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessagingHostedNumberOrderRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("messaging_hosted_number_orders", params._pathParam(0))
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

        private val listHandler: Handler<MessagingHostedNumberOrderListResponse> =
            jsonHandler<MessagingHostedNumberOrderListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: MessagingHostedNumberOrderListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessagingHostedNumberOrderListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("messaging_hosted_number_orders")
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

        private val deleteHandler: Handler<MessagingHostedNumberOrderDeleteResponse> =
            jsonHandler<MessagingHostedNumberOrderDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: MessagingHostedNumberOrderDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessagingHostedNumberOrderDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("messaging_hosted_number_orders", params._pathParam(0))
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

        private val checkEligibilityHandler:
            Handler<MessagingHostedNumberOrderCheckEligibilityResponse> =
            jsonHandler<MessagingHostedNumberOrderCheckEligibilityResponse>(
                clientOptions.jsonMapper
            )

        override fun checkEligibility(
            params: MessagingHostedNumberOrderCheckEligibilityParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessagingHostedNumberOrderCheckEligibilityResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("messaging_hosted_number_orders", "eligibility_numbers_check")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { checkEligibilityHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createVerificationCodesHandler:
            Handler<MessagingHostedNumberOrderCreateVerificationCodesResponse> =
            jsonHandler<MessagingHostedNumberOrderCreateVerificationCodesResponse>(
                clientOptions.jsonMapper
            )

        override fun createVerificationCodes(
            params: MessagingHostedNumberOrderCreateVerificationCodesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessagingHostedNumberOrderCreateVerificationCodesResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "messaging_hosted_number_orders",
                        params._pathParam(0),
                        "verification_codes",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createVerificationCodesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val validateCodesHandler: Handler<MessagingHostedNumberOrderValidateCodesResponse> =
            jsonHandler<MessagingHostedNumberOrderValidateCodesResponse>(clientOptions.jsonMapper)

        override fun validateCodes(
            params: MessagingHostedNumberOrderValidateCodesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessagingHostedNumberOrderValidateCodesResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "messaging_hosted_number_orders",
                        params._pathParam(0),
                        "validation_codes",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { validateCodesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
