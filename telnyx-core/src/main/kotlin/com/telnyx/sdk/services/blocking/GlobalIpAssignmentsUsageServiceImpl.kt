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
import com.telnyx.sdk.models.globalipassignmentsusage.GlobalIpAssignmentsUsageRetrieveParams
import com.telnyx.sdk.models.globalipassignmentsusage.GlobalIpAssignmentsUsageRetrieveResponse
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
