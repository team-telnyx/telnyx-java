// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.portingorders

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
import com.telnyx.sdk.models.portingorders.phonenumberconfigurations.PhoneNumberConfigurationCreateParams
import com.telnyx.sdk.models.portingorders.phonenumberconfigurations.PhoneNumberConfigurationCreateResponse
import com.telnyx.sdk.models.portingorders.phonenumberconfigurations.PhoneNumberConfigurationListParams
import com.telnyx.sdk.models.portingorders.phonenumberconfigurations.PhoneNumberConfigurationListResponse
import java.util.function.Consumer

class PhoneNumberConfigurationServiceImpl
internal constructor(private val clientOptions: ClientOptions) : PhoneNumberConfigurationService {

    private val withRawResponse: PhoneNumberConfigurationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PhoneNumberConfigurationService.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): PhoneNumberConfigurationService =
        PhoneNumberConfigurationServiceImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun create(
        params: PhoneNumberConfigurationCreateParams,
        requestOptions: RequestOptions,
    ): PhoneNumberConfigurationCreateResponse =
        // post /porting_orders/phone_number_configurations
        withRawResponse().create(params, requestOptions).parse()

    override fun list(
        params: PhoneNumberConfigurationListParams,
        requestOptions: RequestOptions,
    ): PhoneNumberConfigurationListResponse =
        // get /porting_orders/phone_number_configurations
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PhoneNumberConfigurationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PhoneNumberConfigurationService.WithRawResponse =
            PhoneNumberConfigurationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<PhoneNumberConfigurationCreateResponse> =
            jsonHandler<PhoneNumberConfigurationCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: PhoneNumberConfigurationCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhoneNumberConfigurationCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting_orders", "phone_number_configurations")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<PhoneNumberConfigurationListResponse> =
            jsonHandler<PhoneNumberConfigurationListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: PhoneNumberConfigurationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhoneNumberConfigurationListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting_orders", "phone_number_configurations")
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
