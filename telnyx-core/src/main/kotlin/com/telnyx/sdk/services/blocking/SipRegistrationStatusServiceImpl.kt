// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

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
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.sipregistrationstatus.SipRegistrationStatusRetrieveParams
import com.telnyx.sdk.models.sipregistrationstatus.SipRegistrationStatusRetrieveResponse
import java.util.function.Consumer

/** Look up SIP registration status across credential types */
class SipRegistrationStatusServiceImpl
internal constructor(private val clientOptions: ClientOptions) : SipRegistrationStatusService {

    private val withRawResponse: SipRegistrationStatusService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SipRegistrationStatusService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): SipRegistrationStatusService =
        SipRegistrationStatusServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: SipRegistrationStatusRetrieveParams,
        requestOptions: RequestOptions,
    ): SipRegistrationStatusRetrieveResponse =
        // get /sip_registration_status
        withRawResponse().retrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SipRegistrationStatusService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SipRegistrationStatusService.WithRawResponse =
            SipRegistrationStatusServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<SipRegistrationStatusRetrieveResponse> =
            jsonHandler<SipRegistrationStatusRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: SipRegistrationStatusRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SipRegistrationStatusRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sip_registration_status")
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
    }
}
