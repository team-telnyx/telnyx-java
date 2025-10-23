// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

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
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.numberorderphonenumbers.NumberOrderPhoneNumberListParams
import com.telnyx.sdk.models.numberorderphonenumbers.NumberOrderPhoneNumberListResponse
import com.telnyx.sdk.models.numberorderphonenumbers.NumberOrderPhoneNumberRetrieveParams
import com.telnyx.sdk.models.numberorderphonenumbers.NumberOrderPhoneNumberRetrieveResponse
import com.telnyx.sdk.models.numberorderphonenumbers.NumberOrderPhoneNumberUpdateRequirementGroupParams
import com.telnyx.sdk.models.numberorderphonenumbers.NumberOrderPhoneNumberUpdateRequirementGroupResponse
import com.telnyx.sdk.models.numberorderphonenumbers.NumberOrderPhoneNumberUpdateRequirementsParams
import com.telnyx.sdk.models.numberorderphonenumbers.NumberOrderPhoneNumberUpdateRequirementsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class NumberOrderPhoneNumberServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    NumberOrderPhoneNumberServiceAsync {

    private val withRawResponse: NumberOrderPhoneNumberServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): NumberOrderPhoneNumberServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): NumberOrderPhoneNumberServiceAsync =
        NumberOrderPhoneNumberServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun retrieve(
        params: NumberOrderPhoneNumberRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NumberOrderPhoneNumberRetrieveResponse> =
        // get /number_order_phone_numbers/{number_order_phone_number_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: NumberOrderPhoneNumberListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NumberOrderPhoneNumberListResponse> =
        // get /number_order_phone_numbers
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun updateRequirementGroup(
        params: NumberOrderPhoneNumberUpdateRequirementGroupParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NumberOrderPhoneNumberUpdateRequirementGroupResponse> =
        // post /number_order_phone_numbers/{id}/requirement_group
        withRawResponse().updateRequirementGroup(params, requestOptions).thenApply { it.parse() }

    override fun updateRequirements(
        params: NumberOrderPhoneNumberUpdateRequirementsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NumberOrderPhoneNumberUpdateRequirementsResponse> =
        // patch /number_order_phone_numbers/{number_order_phone_number_id}
        withRawResponse().updateRequirements(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NumberOrderPhoneNumberServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NumberOrderPhoneNumberServiceAsync.WithRawResponse =
            NumberOrderPhoneNumberServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<NumberOrderPhoneNumberRetrieveResponse> =
            jsonHandler<NumberOrderPhoneNumberRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: NumberOrderPhoneNumberRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NumberOrderPhoneNumberRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("numberOrderPhoneNumberId", params.numberOrderPhoneNumberId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("number_order_phone_numbers", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val listHandler: Handler<NumberOrderPhoneNumberListResponse> =
            jsonHandler<NumberOrderPhoneNumberListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: NumberOrderPhoneNumberListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NumberOrderPhoneNumberListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("number_order_phone_numbers")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val updateRequirementGroupHandler:
            Handler<NumberOrderPhoneNumberUpdateRequirementGroupResponse> =
            jsonHandler<NumberOrderPhoneNumberUpdateRequirementGroupResponse>(
                clientOptions.jsonMapper
            )

        override fun updateRequirementGroup(
            params: NumberOrderPhoneNumberUpdateRequirementGroupParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<
            HttpResponseFor<NumberOrderPhoneNumberUpdateRequirementGroupResponse>
        > {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateRequirementGroupHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
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
        ): CompletableFuture<HttpResponseFor<NumberOrderPhoneNumberUpdateRequirementsResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
