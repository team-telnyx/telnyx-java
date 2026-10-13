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
import com.telnyx.sdk.models.sipregistrationstatus.SipRegistrationStatusListParams
import com.telnyx.sdk.models.sipregistrationstatus.SipRegistrationStatusListResponse
import java.util.function.Consumer

/** UAC connection operations */
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

    override fun list(
        params: SipRegistrationStatusListParams,
        requestOptions: RequestOptions,
    ): SipRegistrationStatusListResponse =
        // get /sip_registration_status
        withRawResponse().list(params, requestOptions).parse()

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

        private val listHandler: Handler<SipRegistrationStatusListResponse> =
            jsonHandler<SipRegistrationStatusListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: SipRegistrationStatusListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SipRegistrationStatusListResponse> {
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
