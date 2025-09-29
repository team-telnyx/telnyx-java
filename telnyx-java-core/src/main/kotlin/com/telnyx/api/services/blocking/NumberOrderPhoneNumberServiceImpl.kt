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
import com.telnyx.api.models.numberorderphonenumbers.NumberOrderPhoneNumberListParams
import com.telnyx.api.models.numberorderphonenumbers.NumberOrderPhoneNumberListResponse
import com.telnyx.api.models.numberorderphonenumbers.NumberOrderPhoneNumberRetrieveParams
import com.telnyx.api.models.numberorderphonenumbers.NumberOrderPhoneNumberRetrieveResponse
import com.telnyx.api.models.numberorderphonenumbers.NumberOrderPhoneNumberUpdateRequirementGroupParams
import com.telnyx.api.models.numberorderphonenumbers.NumberOrderPhoneNumberUpdateRequirementGroupResponse
import com.telnyx.api.models.numberorderphonenumbers.NumberOrderPhoneNumberUpdateRequirementsParams
import com.telnyx.api.models.numberorderphonenumbers.NumberOrderPhoneNumberUpdateRequirementsResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class NumberOrderPhoneNumberServiceImpl
internal constructor(private val clientOptions: ClientOptions) : NumberOrderPhoneNumberService {

    private val withRawResponse: NumberOrderPhoneNumberService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): NumberOrderPhoneNumberService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): NumberOrderPhoneNumberService =
        NumberOrderPhoneNumberServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: NumberOrderPhoneNumberRetrieveParams,
        requestOptions: RequestOptions,
    ): NumberOrderPhoneNumberRetrieveResponse =
        // get /number_order_phone_numbers/{number_order_phone_number_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: NumberOrderPhoneNumberListParams,
        requestOptions: RequestOptions,
    ): NumberOrderPhoneNumberListResponse =
        // get /number_order_phone_numbers
        withRawResponse().list(params, requestOptions).parse()

    override fun updateRequirementGroup(
        params: NumberOrderPhoneNumberUpdateRequirementGroupParams,
        requestOptions: RequestOptions,
    ): NumberOrderPhoneNumberUpdateRequirementGroupResponse =
        // post /number_order_phone_numbers/{id}/requirement_group
        withRawResponse().updateRequirementGroup(params, requestOptions).parse()

    override fun updateRequirements(
        params: NumberOrderPhoneNumberUpdateRequirementsParams,
        requestOptions: RequestOptions,
    ): NumberOrderPhoneNumberUpdateRequirementsResponse =
        // patch /number_order_phone_numbers/{number_order_phone_number_id}
        withRawResponse().updateRequirements(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NumberOrderPhoneNumberService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NumberOrderPhoneNumberService.WithRawResponse =
            NumberOrderPhoneNumberServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<NumberOrderPhoneNumberRetrieveResponse> =
            jsonHandler<NumberOrderPhoneNumberRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: NumberOrderPhoneNumberRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NumberOrderPhoneNumberRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("numberOrderPhoneNumberId", params.numberOrderPhoneNumberId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("number_order_phone_numbers", params._pathParam(0))
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

        private val listHandler: Handler<NumberOrderPhoneNumberListResponse> =
            jsonHandler<NumberOrderPhoneNumberListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: NumberOrderPhoneNumberListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NumberOrderPhoneNumberListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("number_order_phone_numbers")
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

        private val updateRequirementGroupHandler:
            Handler<NumberOrderPhoneNumberUpdateRequirementGroupResponse> =
            jsonHandler<NumberOrderPhoneNumberUpdateRequirementGroupResponse>(
                clientOptions.jsonMapper
            )

        override fun updateRequirementGroup(
            params: NumberOrderPhoneNumberUpdateRequirementGroupParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NumberOrderPhoneNumberUpdateRequirementGroupResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "number_order_phone_numbers",
                        params._pathParam(0),
                        "requirement_group",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateRequirementGroupHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateRequirementsHandler:
            Handler<NumberOrderPhoneNumberUpdateRequirementsResponse> =
            jsonHandler<NumberOrderPhoneNumberUpdateRequirementsResponse>(clientOptions.jsonMapper)

        override fun updateRequirements(
            params: NumberOrderPhoneNumberUpdateRequirementsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NumberOrderPhoneNumberUpdateRequirementsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("numberOrderPhoneNumberId", params.numberOrderPhoneNumberId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("number_order_phone_numbers", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateRequirementsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
