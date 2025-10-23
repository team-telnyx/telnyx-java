// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.phonenumbers

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
import com.telnyx.sdk.models.phonenumbers.actions.ActionChangeBundleStatusParams
import com.telnyx.sdk.models.phonenumbers.actions.ActionChangeBundleStatusResponse
import com.telnyx.sdk.models.phonenumbers.actions.ActionEnableEmergencyParams
import com.telnyx.sdk.models.phonenumbers.actions.ActionEnableEmergencyResponse
import com.telnyx.sdk.models.phonenumbers.actions.ActionVerifyOwnershipParams
import com.telnyx.sdk.models.phonenumbers.actions.ActionVerifyOwnershipResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ActionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ActionServiceAsync {

    private val withRawResponse: ActionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ActionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionServiceAsync =
        ActionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun changeBundleStatus(
        params: ActionChangeBundleStatusParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionChangeBundleStatusResponse> =
        // patch /phone_numbers/{id}/actions/bundle_status_change
        withRawResponse().changeBundleStatus(params, requestOptions).thenApply { it.parse() }

    override fun enableEmergency(
        params: ActionEnableEmergencyParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionEnableEmergencyResponse> =
        // post /phone_numbers/{id}/actions/enable_emergency
        withRawResponse().enableEmergency(params, requestOptions).thenApply { it.parse() }

    override fun verifyOwnership(
        params: ActionVerifyOwnershipParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionVerifyOwnershipResponse> =
        // post /phone_numbers/actions/verify_ownership
        withRawResponse().verifyOwnership(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ActionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ActionServiceAsync.WithRawResponse =
            ActionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val changeBundleStatusHandler: Handler<ActionChangeBundleStatusResponse> =
            jsonHandler<ActionChangeBundleStatusResponse>(clientOptions.jsonMapper)

        override fun changeBundleStatus(
            params: ActionChangeBundleStatusParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionChangeBundleStatusResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "phone_numbers",
                        params._pathParam(0),
                        "actions",
                        "bundle_status_change",
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
                            .use { changeBundleStatusHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val enableEmergencyHandler: Handler<ActionEnableEmergencyResponse> =
            jsonHandler<ActionEnableEmergencyResponse>(clientOptions.jsonMapper)

        override fun enableEmergency(
            params: ActionEnableEmergencyParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionEnableEmergencyResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "phone_numbers",
                        params._pathParam(0),
                        "actions",
                        "enable_emergency",
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
                            .use { enableEmergencyHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val verifyOwnershipHandler: Handler<ActionVerifyOwnershipResponse> =
            jsonHandler<ActionVerifyOwnershipResponse>(clientOptions.jsonMapper)

        override fun verifyOwnership(
            params: ActionVerifyOwnershipParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionVerifyOwnershipResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("phone_numbers", "actions", "verify_ownership")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { verifyOwnershipHandler.handle(it) }
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
