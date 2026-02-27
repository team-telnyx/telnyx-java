// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.phonenumbers

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
import com.telnyx.sdk.models.phonenumbers.actions.ActionChangeBundleStatusParams
import com.telnyx.sdk.models.phonenumbers.actions.ActionChangeBundleStatusResponse
import com.telnyx.sdk.models.phonenumbers.actions.ActionEnableEmergencyParams
import com.telnyx.sdk.models.phonenumbers.actions.ActionEnableEmergencyResponse
import com.telnyx.sdk.models.phonenumbers.actions.ActionVerifyOwnershipParams
import com.telnyx.sdk.models.phonenumbers.actions.ActionVerifyOwnershipResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Configure your phone numbers */
class ActionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ActionService {

    private val withRawResponse: ActionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ActionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionService =
        ActionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun changeBundleStatus(
        params: ActionChangeBundleStatusParams,
        requestOptions: RequestOptions,
    ): ActionChangeBundleStatusResponse =
        // patch /phone_numbers/{id}/actions/bundle_status_change
        withRawResponse().changeBundleStatus(params, requestOptions).parse()

    override fun enableEmergency(
        params: ActionEnableEmergencyParams,
        requestOptions: RequestOptions,
    ): ActionEnableEmergencyResponse =
        // post /phone_numbers/{id}/actions/enable_emergency
        withRawResponse().enableEmergency(params, requestOptions).parse()

    override fun verifyOwnership(
        params: ActionVerifyOwnershipParams,
        requestOptions: RequestOptions,
    ): ActionVerifyOwnershipResponse =
        // post /phone_numbers/actions/verify_ownership
        withRawResponse().verifyOwnership(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ActionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ActionService.WithRawResponse =
            ActionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val changeBundleStatusHandler: Handler<ActionChangeBundleStatusResponse> =
            jsonHandler<ActionChangeBundleStatusResponse>(clientOptions.jsonMapper)

        override fun changeBundleStatus(
            params: ActionChangeBundleStatusParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionChangeBundleStatusResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { changeBundleStatusHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val enableEmergencyHandler: Handler<ActionEnableEmergencyResponse> =
            jsonHandler<ActionEnableEmergencyResponse>(clientOptions.jsonMapper)

        override fun enableEmergency(
            params: ActionEnableEmergencyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionEnableEmergencyResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { enableEmergencyHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val verifyOwnershipHandler: Handler<ActionVerifyOwnershipResponse> =
            jsonHandler<ActionVerifyOwnershipResponse>(clientOptions.jsonMapper)

        override fun verifyOwnership(
            params: ActionVerifyOwnershipParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionVerifyOwnershipResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("phone_numbers", "actions", "verify_ownership")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
