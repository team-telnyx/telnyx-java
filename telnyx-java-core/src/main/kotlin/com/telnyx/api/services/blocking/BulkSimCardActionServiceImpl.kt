// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.checkRequired
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
import com.telnyx.api.models.bulksimcardactions.BulkSimCardActionListParams
import com.telnyx.api.models.bulksimcardactions.BulkSimCardActionListResponse
import com.telnyx.api.models.bulksimcardactions.BulkSimCardActionRetrieveParams
import com.telnyx.api.models.bulksimcardactions.BulkSimCardActionRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class BulkSimCardActionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BulkSimCardActionService {

    private val withRawResponse: BulkSimCardActionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BulkSimCardActionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BulkSimCardActionService =
        BulkSimCardActionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: BulkSimCardActionRetrieveParams,
        requestOptions: RequestOptions,
    ): BulkSimCardActionRetrieveResponse =
        // get /bulk_sim_card_actions/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: BulkSimCardActionListParams,
        requestOptions: RequestOptions,
    ): BulkSimCardActionListResponse =
        // get /bulk_sim_card_actions
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BulkSimCardActionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BulkSimCardActionService.WithRawResponse =
            BulkSimCardActionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<BulkSimCardActionRetrieveResponse> =
            jsonHandler<BulkSimCardActionRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: BulkSimCardActionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BulkSimCardActionRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("bulk_sim_card_actions", params._pathParam(0))
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

        private val listHandler: Handler<BulkSimCardActionListResponse> =
            jsonHandler<BulkSimCardActionListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: BulkSimCardActionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BulkSimCardActionListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("bulk_sim_card_actions")
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
