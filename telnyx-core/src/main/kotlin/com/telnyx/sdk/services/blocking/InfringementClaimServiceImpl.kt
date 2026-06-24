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
import com.telnyx.sdk.core.http.json
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.infringementclaims.InfringementClaimContestParams
import com.telnyx.sdk.models.infringementclaims.InfringementClaimRetrieveParams
import com.telnyx.sdk.models.infringementclaims.InfringementClaimWrapped
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * Trademark or impersonation claims filed against your DIR. Customers may contest a claim with
 * supporting evidence.
 */
class InfringementClaimServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    InfringementClaimService {

    private val withRawResponse: InfringementClaimService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InfringementClaimService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InfringementClaimService =
        InfringementClaimServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: InfringementClaimRetrieveParams,
        requestOptions: RequestOptions,
    ): InfringementClaimWrapped =
        // get /infringement_claims/{claim_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun contest(
        params: InfringementClaimContestParams,
        requestOptions: RequestOptions,
    ): InfringementClaimWrapped =
        // post /infringement_claims/{claim_id}/contest
        withRawResponse().contest(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InfringementClaimService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InfringementClaimService.WithRawResponse =
            InfringementClaimServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<InfringementClaimWrapped> =
            jsonHandler<InfringementClaimWrapped>(clientOptions.jsonMapper)

        override fun retrieve(
            params: InfringementClaimRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InfringementClaimWrapped> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("claimId", params.claimId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("infringement_claims", params._pathParam(0))
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

        private val contestHandler: Handler<InfringementClaimWrapped> =
            jsonHandler<InfringementClaimWrapped>(clientOptions.jsonMapper)

        override fun contest(
            params: InfringementClaimContestParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InfringementClaimWrapped> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("claimId", params.claimId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("infringement_claims", params._pathParam(0), "contest")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { contestHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
