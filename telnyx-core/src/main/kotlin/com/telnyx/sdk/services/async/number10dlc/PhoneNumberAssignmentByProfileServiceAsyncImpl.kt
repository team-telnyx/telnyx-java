// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.number10dlc

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
import com.telnyx.sdk.models.number10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileAssignParams
import com.telnyx.sdk.models.number10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileAssignResponse
import com.telnyx.sdk.models.number10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileGetPhoneNumberStatusParams
import com.telnyx.sdk.models.number10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileGetPhoneNumberStatusResponse
import com.telnyx.sdk.models.number10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileGetTaskStatusParams
import com.telnyx.sdk.models.number10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileGetTaskStatusResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PhoneNumberAssignmentByProfileServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    PhoneNumberAssignmentByProfileServiceAsync {

    private val withRawResponse:
        PhoneNumberAssignmentByProfileServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PhoneNumberAssignmentByProfileServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): PhoneNumberAssignmentByProfileServiceAsync =
        PhoneNumberAssignmentByProfileServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun assign(
        params: PhoneNumberAssignmentByProfileAssignParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhoneNumberAssignmentByProfileAssignResponse> =
        // post /10dlc/phoneNumberAssignmentByProfile
        withRawResponse().assign(params, requestOptions).thenApply { it.parse() }

    override fun getPhoneNumberStatus(
        params: PhoneNumberAssignmentByProfileGetPhoneNumberStatusParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhoneNumberAssignmentByProfileGetPhoneNumberStatusResponse> =
        // get /10dlc/phoneNumberAssignmentByProfile/{taskId}/phoneNumbers
        withRawResponse().getPhoneNumberStatus(params, requestOptions).thenApply { it.parse() }

    override fun getTaskStatus(
        params: PhoneNumberAssignmentByProfileGetTaskStatusParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhoneNumberAssignmentByProfileGetTaskStatusResponse> =
        // get /10dlc/phoneNumberAssignmentByProfile/{taskId}
        withRawResponse().getTaskStatus(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PhoneNumberAssignmentByProfileServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PhoneNumberAssignmentByProfileServiceAsync.WithRawResponse =
            PhoneNumberAssignmentByProfileServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val assignHandler: Handler<PhoneNumberAssignmentByProfileAssignResponse> =
            jsonHandler<PhoneNumberAssignmentByProfileAssignResponse>(clientOptions.jsonMapper)

        override fun assign(
            params: PhoneNumberAssignmentByProfileAssignParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PhoneNumberAssignmentByProfileAssignResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("10dlc", "phoneNumberAssignmentByProfile")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { assignHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getPhoneNumberStatusHandler:
            Handler<PhoneNumberAssignmentByProfileGetPhoneNumberStatusResponse> =
            jsonHandler<PhoneNumberAssignmentByProfileGetPhoneNumberStatusResponse>(
                clientOptions.jsonMapper
            )

        override fun getPhoneNumberStatus(
            params: PhoneNumberAssignmentByProfileGetPhoneNumberStatusParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<
            HttpResponseFor<PhoneNumberAssignmentByProfileGetPhoneNumberStatusResponse>
        > {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("taskId", params.taskId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "10dlc",
                        "phoneNumberAssignmentByProfile",
                        params._pathParam(0),
                        "phoneNumbers",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getPhoneNumberStatusHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getTaskStatusHandler:
            Handler<PhoneNumberAssignmentByProfileGetTaskStatusResponse> =
            jsonHandler<PhoneNumberAssignmentByProfileGetTaskStatusResponse>(
                clientOptions.jsonMapper
            )

        override fun getTaskStatus(
            params: PhoneNumberAssignmentByProfileGetTaskStatusParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PhoneNumberAssignmentByProfileGetTaskStatusResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("taskId", params.taskId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "10dlc",
                        "phoneNumberAssignmentByProfile",
                        params._pathParam(0),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getTaskStatusHandler.handle(it) }
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
