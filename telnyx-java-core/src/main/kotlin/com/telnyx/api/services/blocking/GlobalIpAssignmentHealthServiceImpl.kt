// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.handlers.errorBodyHandler
import com.telnyx.api.core.handlers.errorHandler
import com.telnyx.api.core.handlers.jsonHandler
import com.telnyx.api.core.http.HttpMethod
import com.telnyx.api.core.http.HttpRequest
import com.telnyx.api.core.http.HttpResponse
import com.telnyx.api.core.http.HttpResponse.Handler
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.core.http.parseable
import com.telnyx.api.core.prepare
import com.telnyx.api.models.globalipassignmenthealth.GlobalIpAssignmentHealthRetrieveParams
import com.telnyx.api.models.globalipassignmenthealth.GlobalIpAssignmentHealthRetrieveResponse
import java.util.function.Consumer

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
