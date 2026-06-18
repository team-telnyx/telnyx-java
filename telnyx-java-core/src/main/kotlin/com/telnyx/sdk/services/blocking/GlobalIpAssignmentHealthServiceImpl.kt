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
import com.telnyx.sdk.models.globalipassignmenthealth.GlobalIpAssignmentHealthRetrieveParams
import com.telnyx.sdk.models.globalipassignmenthealth.GlobalIpAssignmentHealthRetrieveResponse
import java.util.function.Consumer

/** Global IPs */
class GlobalIpAssignmentHealthServiceImpl
internal constructor(private val clientOptions: ClientOptions) : GlobalIpAssignmentHealthService {

    private val withRawResponse: GlobalIpAssignmentHealthService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): GlobalIpAssignmentHealthService.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): GlobalIpAssignmentHealthService =
        GlobalIpAssignmentHealthServiceImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun retrieve(
        params: GlobalIpAssignmentHealthRetrieveParams,
        requestOptions: RequestOptions,
    ): GlobalIpAssignmentHealthRetrieveResponse =
        // get /global_ip_assignment_health
        withRawResponse().retrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GlobalIpAssignmentHealthService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GlobalIpAssignmentHealthService.WithRawResponse =
            GlobalIpAssignmentHealthServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<GlobalIpAssignmentHealthRetrieveResponse> =
            jsonHandler<GlobalIpAssignmentHealthRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: GlobalIpAssignmentHealthRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GlobalIpAssignmentHealthRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("global_ip_assignment_health")
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
