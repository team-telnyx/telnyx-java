// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

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
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.bulksimcardactions.BulkSimCardActionListPage
import com.telnyx.sdk.models.bulksimcardactions.BulkSimCardActionListPageResponse
import com.telnyx.sdk.models.bulksimcardactions.BulkSimCardActionListParams
import com.telnyx.sdk.models.bulksimcardactions.BulkSimCardActionRetrieveParams
import com.telnyx.sdk.models.bulksimcardactions.BulkSimCardActionRetrieveResponse
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
    ): BulkSimCardActionListPage =
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

        private val listHandler: Handler<BulkSimCardActionListPageResponse> =
            jsonHandler<BulkSimCardActionListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: BulkSimCardActionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BulkSimCardActionListPage> {
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
                    .let {
                        BulkSimCardActionListPage.builder()
                            .service(BulkSimCardActionServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
