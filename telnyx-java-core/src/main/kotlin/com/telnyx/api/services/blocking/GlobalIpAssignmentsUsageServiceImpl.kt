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
import com.telnyx.api.models.globalipassignmentsusage.GlobalIpAssignmentsUsageRetrieveParams
import com.telnyx.api.models.globalipassignmentsusage.GlobalIpAssignmentsUsageRetrieveResponse
import java.util.function.Consumer

class GlobalIpAssignmentsUsageServiceImpl
internal constructor(private val clientOptions: ClientOptions) : GlobalIpAssignmentsUsageService {

    private val withRawResponse: GlobalIpAssignmentsUsageService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): GlobalIpAssignmentsUsageService.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): GlobalIpAssignmentsUsageService =
        GlobalIpAssignmentsUsageServiceImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun retrieve(
        params: GlobalIpAssignmentsUsageRetrieveParams,
        requestOptions: RequestOptions,
    ): GlobalIpAssignmentsUsageRetrieveResponse =
        // get /global_ip_assignments_usage
        withRawResponse().retrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GlobalIpAssignmentsUsageService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GlobalIpAssignmentsUsageService.WithRawResponse =
            GlobalIpAssignmentsUsageServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<GlobalIpAssignmentsUsageRetrieveResponse> =
            jsonHandler<GlobalIpAssignmentsUsageRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: GlobalIpAssignmentsUsageRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GlobalIpAssignmentsUsageRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("global_ip_assignments_usage")
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
