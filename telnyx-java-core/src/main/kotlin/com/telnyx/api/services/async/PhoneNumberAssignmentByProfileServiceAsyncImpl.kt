// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

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
import com.telnyx.api.core.prepareAsync
import com.telnyx.api.models.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileAssignParams
import com.telnyx.api.models.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileAssignResponse
import com.telnyx.api.models.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusParams
import com.telnyx.api.models.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse
import com.telnyx.api.models.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileRetrieveStatusParams
import com.telnyx.api.models.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileRetrieveStatusResponse
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
        // post /phoneNumberAssignmentByProfile
        withRawResponse().assign(params, requestOptions).thenApply { it.parse() }

    override fun retrievePhoneNumberStatus(
        params: PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse> =
        // get /phoneNumberAssignmentByProfile/{taskId}/phoneNumbers
        withRawResponse().retrievePhoneNumberStatus(params, requestOptions).thenApply { it.parse() }

    override fun retrieveStatus(
        params: PhoneNumberAssignmentByProfileRetrieveStatusParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhoneNumberAssignmentByProfileRetrieveStatusResponse> =
        // get /phoneNumberAssignmentByProfile/{taskId}
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
                    .addPathSegments("phoneNumberAssignmentByProfile")
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
                    .addPathSegments("phoneNumberAssignmentByProfile", params._pathParam(0))
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
