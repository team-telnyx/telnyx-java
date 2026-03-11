// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.whatsapp.businessaccounts

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
import com.telnyx.sdk.models.whatsapp.businessaccounts.settings.SettingRetrieveParams
import com.telnyx.sdk.models.whatsapp.businessaccounts.settings.SettingRetrieveResponse
import com.telnyx.sdk.models.whatsapp.businessaccounts.settings.SettingUpdateParams
import com.telnyx.sdk.models.whatsapp.businessaccounts.settings.SettingUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Manage Whatsapp business accounts */
class SettingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SettingService {

    private val withRawResponse: SettingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SettingService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SettingService =
        SettingServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: SettingRetrieveParams,
        requestOptions: RequestOptions,
    ): SettingRetrieveResponse =
        // get /v2/whatsapp/business_accounts/{id}/settings
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: SettingUpdateParams,
        requestOptions: RequestOptions,
    ): SettingUpdateResponse =
        // patch /v2/whatsapp/business_accounts/{id}/settings
        withRawResponse().update(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SettingService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SettingService.WithRawResponse =
            SettingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<SettingRetrieveResponse> =
            jsonHandler<SettingRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: SettingRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SettingRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v2",
                        "whatsapp",
                        "business_accounts",
                        params._pathParam(0),
                        "settings",
                    )
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

        private val updateHandler: Handler<SettingUpdateResponse> =
            jsonHandler<SettingUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: SettingUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SettingUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v2",
                        "whatsapp",
                        "business_accounts",
                        params._pathParam(0),
                        "settings",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
