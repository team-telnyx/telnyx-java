// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.whatsapp.phonenumbers

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
import com.telnyx.sdk.models.whatsapp.phonenumbers.callingsettings.CallingSettingRetrieveParams
import com.telnyx.sdk.models.whatsapp.phonenumbers.callingsettings.CallingSettingRetrieveResponse
import com.telnyx.sdk.models.whatsapp.phonenumbers.callingsettings.CallingSettingUpdateParams
import com.telnyx.sdk.models.whatsapp.phonenumbers.callingsettings.CallingSettingUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Manage Whatsapp phone numbers */
class CallingSettingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CallingSettingService {

    private val withRawResponse: CallingSettingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CallingSettingService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CallingSettingService =
        CallingSettingServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: CallingSettingRetrieveParams,
        requestOptions: RequestOptions,
    ): CallingSettingRetrieveResponse =
        // get /v2/whatsapp/phone_numbers/{phone_number}/calling_settings
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: CallingSettingUpdateParams,
        requestOptions: RequestOptions,
    ): CallingSettingUpdateResponse =
        // patch /v2/whatsapp/phone_numbers/{phone_number}/calling_settings
        withRawResponse().update(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CallingSettingService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CallingSettingService.WithRawResponse =
            CallingSettingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<CallingSettingRetrieveResponse> =
            jsonHandler<CallingSettingRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CallingSettingRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CallingSettingRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("phoneNumber", params.phoneNumber().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v2",
                        "whatsapp",
                        "phone_numbers",
                        params._pathParam(0),
                        "calling_settings",
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

        private val updateHandler: Handler<CallingSettingUpdateResponse> =
            jsonHandler<CallingSettingUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: CallingSettingUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CallingSettingUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("phoneNumber", params.phoneNumber().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v2",
                        "whatsapp",
                        "phone_numbers",
                        params._pathParam(0),
                        "calling_settings",
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
