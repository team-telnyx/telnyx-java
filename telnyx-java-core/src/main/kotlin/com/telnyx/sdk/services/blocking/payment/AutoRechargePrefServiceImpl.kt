// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.payment

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
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
import com.telnyx.sdk.models.payment.autorechargeprefs.AutoRechargePrefListParams
import com.telnyx.sdk.models.payment.autorechargeprefs.AutoRechargePrefListResponse
import com.telnyx.sdk.models.payment.autorechargeprefs.AutoRechargePrefUpdateParams
import com.telnyx.sdk.models.payment.autorechargeprefs.AutoRechargePrefUpdateResponse
import java.util.function.Consumer

/** V2 Auto Recharge Preferences API */
class AutoRechargePrefServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AutoRechargePrefService {

    private val withRawResponse: AutoRechargePrefService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AutoRechargePrefService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AutoRechargePrefService =
        AutoRechargePrefServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun update(
        params: AutoRechargePrefUpdateParams,
        requestOptions: RequestOptions,
    ): AutoRechargePrefUpdateResponse =
        // patch /payment/auto_recharge_prefs
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: AutoRechargePrefListParams,
        requestOptions: RequestOptions,
    ): AutoRechargePrefListResponse =
        // get /payment/auto_recharge_prefs
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AutoRechargePrefService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AutoRechargePrefService.WithRawResponse =
            AutoRechargePrefServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val updateHandler: Handler<AutoRechargePrefUpdateResponse> =
            jsonHandler<AutoRechargePrefUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: AutoRechargePrefUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AutoRechargePrefUpdateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("payment", "auto_recharge_prefs")
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

        private val listHandler: Handler<AutoRechargePrefListResponse> =
            jsonHandler<AutoRechargePrefListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AutoRechargePrefListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AutoRechargePrefListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("payment", "auto_recharge_prefs")
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
    }
}
