// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.simcards

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
import com.telnyx.sdk.models.simcards.actions.ActionBulkSetPublicIpsParams
import com.telnyx.sdk.models.simcards.actions.ActionBulkSetPublicIpsResponse
import com.telnyx.sdk.models.simcards.actions.ActionDisableParams
import com.telnyx.sdk.models.simcards.actions.ActionDisableResponse
import com.telnyx.sdk.models.simcards.actions.ActionEnableParams
import com.telnyx.sdk.models.simcards.actions.ActionEnableResponse
import com.telnyx.sdk.models.simcards.actions.ActionListPage
import com.telnyx.sdk.models.simcards.actions.ActionListPageResponse
import com.telnyx.sdk.models.simcards.actions.ActionListParams
import com.telnyx.sdk.models.simcards.actions.ActionRemovePublicIpParams
import com.telnyx.sdk.models.simcards.actions.ActionRemovePublicIpResponse
import com.telnyx.sdk.models.simcards.actions.ActionRetrieveParams
import com.telnyx.sdk.models.simcards.actions.ActionRetrieveResponse
import com.telnyx.sdk.models.simcards.actions.ActionSetPublicIpParams
import com.telnyx.sdk.models.simcards.actions.ActionSetPublicIpResponse
import com.telnyx.sdk.models.simcards.actions.ActionSetStandbyParams
import com.telnyx.sdk.models.simcards.actions.ActionSetStandbyResponse
import com.telnyx.sdk.models.simcards.actions.ActionValidateRegistrationCodesParams
import com.telnyx.sdk.models.simcards.actions.ActionValidateRegistrationCodesResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ActionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ActionService {

    private val withRawResponse: ActionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ActionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionService =
        ActionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: ActionRetrieveParams,
        requestOptions: RequestOptions,
    ): ActionRetrieveResponse =
        // get /sim_card_actions/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: ActionListParams, requestOptions: RequestOptions): ActionListPage =
        // get /sim_card_actions
        withRawResponse().list(params, requestOptions).parse()

    override fun bulkSetPublicIps(
        params: ActionBulkSetPublicIpsParams,
        requestOptions: RequestOptions,
    ): ActionBulkSetPublicIpsResponse =
        // post /sim_cards/actions/bulk_set_public_ips
        withRawResponse().bulkSetPublicIps(params, requestOptions).parse()

    override fun disable(
        params: ActionDisableParams,
        requestOptions: RequestOptions,
    ): ActionDisableResponse =
        // post /sim_cards/{id}/actions/disable
        withRawResponse().disable(params, requestOptions).parse()

    override fun enable(
        params: ActionEnableParams,
        requestOptions: RequestOptions,
    ): ActionEnableResponse =
        // post /sim_cards/{id}/actions/enable
        withRawResponse().enable(params, requestOptions).parse()

    override fun removePublicIp(
        params: ActionRemovePublicIpParams,
        requestOptions: RequestOptions,
    ): ActionRemovePublicIpResponse =
        // post /sim_cards/{id}/actions/remove_public_ip
        withRawResponse().removePublicIp(params, requestOptions).parse()

    override fun setPublicIp(
        params: ActionSetPublicIpParams,
        requestOptions: RequestOptions,
    ): ActionSetPublicIpResponse =
        // post /sim_cards/{id}/actions/set_public_ip
        withRawResponse().setPublicIp(params, requestOptions).parse()

    override fun setStandby(
        params: ActionSetStandbyParams,
        requestOptions: RequestOptions,
    ): ActionSetStandbyResponse =
        // post /sim_cards/{id}/actions/set_standby
        withRawResponse().setStandby(params, requestOptions).parse()

    override fun validateRegistrationCodes(
        params: ActionValidateRegistrationCodesParams,
        requestOptions: RequestOptions,
    ): ActionValidateRegistrationCodesResponse =
        // post /sim_cards/actions/validate_registration_codes
        withRawResponse().validateRegistrationCodes(params, requestOptions).parse()

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

        private val retrieveHandler: Handler<ActionRetrieveResponse> =
            jsonHandler<ActionRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ActionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sim_card_actions", params._pathParam(0))
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

        private val listHandler: Handler<ActionListPageResponse> =
            jsonHandler<ActionListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ActionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sim_card_actions")
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
                        ActionListPage.builder()
                            .service(ActionServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val bulkSetPublicIpsHandler: Handler<ActionBulkSetPublicIpsResponse> =
            jsonHandler<ActionBulkSetPublicIpsResponse>(clientOptions.jsonMapper)

        override fun bulkSetPublicIps(
            params: ActionBulkSetPublicIpsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionBulkSetPublicIpsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sim_cards", "actions", "bulk_set_public_ips")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { bulkSetPublicIpsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val disableHandler: Handler<ActionDisableResponse> =
            jsonHandler<ActionDisableResponse>(clientOptions.jsonMapper)

        override fun disable(
            params: ActionDisableParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionDisableResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sim_cards", params._pathParam(0), "actions", "disable")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { disableHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val enableHandler: Handler<ActionEnableResponse> =
            jsonHandler<ActionEnableResponse>(clientOptions.jsonMapper)

        override fun enable(
            params: ActionEnableParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionEnableResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sim_cards", params._pathParam(0), "actions", "enable")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { enableHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val removePublicIpHandler: Handler<ActionRemovePublicIpResponse> =
            jsonHandler<ActionRemovePublicIpResponse>(clientOptions.jsonMapper)

        override fun removePublicIp(
            params: ActionRemovePublicIpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionRemovePublicIpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "sim_cards",
                        params._pathParam(0),
                        "actions",
                        "remove_public_ip",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { removePublicIpHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val setPublicIpHandler: Handler<ActionSetPublicIpResponse> =
            jsonHandler<ActionSetPublicIpResponse>(clientOptions.jsonMapper)

        override fun setPublicIp(
            params: ActionSetPublicIpParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionSetPublicIpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sim_cards", params._pathParam(0), "actions", "set_public_ip")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { setPublicIpHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val setStandbyHandler: Handler<ActionSetStandbyResponse> =
            jsonHandler<ActionSetStandbyResponse>(clientOptions.jsonMapper)

        override fun setStandby(
            params: ActionSetStandbyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionSetStandbyResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sim_cards", params._pathParam(0), "actions", "set_standby")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { setStandbyHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val validateRegistrationCodesHandler:
            Handler<ActionValidateRegistrationCodesResponse> =
            jsonHandler<ActionValidateRegistrationCodesResponse>(clientOptions.jsonMapper)

        override fun validateRegistrationCodes(
            params: ActionValidateRegistrationCodesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionValidateRegistrationCodesResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sim_cards", "actions", "validate_registration_codes")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { validateRegistrationCodesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
