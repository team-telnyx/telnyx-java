// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.messaging10dlc

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
import com.telnyx.sdk.models.messaging10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileAssignParams
import com.telnyx.sdk.models.messaging10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileAssignResponse
import com.telnyx.sdk.models.messaging10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileListPhoneNumberStatusParams
import com.telnyx.sdk.models.messaging10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileListPhoneNumberStatusResponse
import com.telnyx.sdk.models.messaging10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusParams
import com.telnyx.sdk.models.messaging10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse
import com.telnyx.sdk.models.messaging10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileRetrieveStatusParams
import com.telnyx.sdk.models.messaging10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileRetrieveStatusResponse
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

    override fun listPhoneNumberStatus(
        params: PhoneNumberAssignmentByProfileListPhoneNumberStatusParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhoneNumberAssignmentByProfileListPhoneNumberStatusResponse> =
        // get /10dlc/phoneNumberAssignmentByProfile/{taskId}/phoneNumbers
        withRawResponse().listPhoneNumberStatus(params, requestOptions).thenApply { it.parse() }

    override fun retrievePhoneNumberStatus(
        params: PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse> =
        // get /10dlc/phoneNumberAssignmentByProfile/{taskId}/phoneNumbers
        withRawResponse().retrievePhoneNumberStatus(params, requestOptions).thenApply { it.parse() }

    override fun retrieveStatus(
        params: PhoneNumberAssignmentByProfileRetrieveStatusParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhoneNumberAssignmentByProfileRetrieveStatusResponse> =
        // get /10dlc/phoneNumberAssignmentByProfile/{taskId}
        withRawResponse().retrieveStatus(params, requestOptions).thenApply { it.parse() }

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

        private val listPhoneNumberStatusHandler:
            Handler<PhoneNumberAssignmentByProfileListPhoneNumberStatusResponse> =
            jsonHandler<PhoneNumberAssignmentByProfileListPhoneNumberStatusResponse>(
                clientOptions.jsonMapper
            )

        override fun listPhoneNumberStatus(
            params: PhoneNumberAssignmentByProfileListPhoneNumberStatusParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<
            HttpResponseFor<PhoneNumberAssignmentByProfileListPhoneNumberStatusResponse>
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
                            .use { listPhoneNumberStatusHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrievePhoneNumberStatusHandler:
            Handler<PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse> =
            jsonHandler<PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse>(
                clientOptions.jsonMapper
            )

        override fun retrievePhoneNumberStatus(
            params: PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<
            HttpResponseFor<PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse>
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
                            .use { retrievePhoneNumberStatusHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveStatusHandler:
            Handler<PhoneNumberAssignmentByProfileRetrieveStatusResponse> =
            jsonHandler<PhoneNumberAssignmentByProfileRetrieveStatusResponse>(
                clientOptions.jsonMapper
            )

        override fun retrieveStatus(
            params: PhoneNumberAssignmentByProfileRetrieveStatusParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<
            HttpResponseFor<PhoneNumberAssignmentByProfileRetrieveStatusResponse>
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
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveStatusHandler.handle(it) }
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
