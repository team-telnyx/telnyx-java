// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.enterprises.reputation

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
import com.telnyx.sdk.models.enterprises.reputation.remediation.RemediationListPage
import com.telnyx.sdk.models.enterprises.reputation.remediation.RemediationListPageResponse
import com.telnyx.sdk.models.enterprises.reputation.remediation.RemediationListParams
import com.telnyx.sdk.models.enterprises.reputation.remediation.RemediationRetrieveParams
import com.telnyx.sdk.models.enterprises.reputation.remediation.RemediationRetrieveResponse
import com.telnyx.sdk.models.enterprises.reputation.remediation.RemediationSubmitParams
import com.telnyx.sdk.models.enterprises.reputation.remediation.RemediationSubmitResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Phone-number reputation monitoring (spam-score lookup and tracking). */
class RemediationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    RemediationService {

    private val withRawResponse: RemediationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RemediationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RemediationService =
        RemediationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: RemediationRetrieveParams,
        requestOptions: RequestOptions,
    ): RemediationRetrieveResponse =
        // get /enterprises/{enterprise_id}/reputation/remediation/{remediation_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: RemediationListParams,
        requestOptions: RequestOptions,
    ): RemediationListPage =
        // get /enterprises/{enterprise_id}/reputation/remediation
        withRawResponse().list(params, requestOptions).parse()

    override fun submit(
        params: RemediationSubmitParams,
        requestOptions: RequestOptions,
    ): RemediationSubmitResponse =
        // post /enterprises/{enterprise_id}/reputation/remediation
        withRawResponse().submit(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RemediationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RemediationService.WithRawResponse =
            RemediationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<RemediationRetrieveResponse> =
            jsonHandler<RemediationRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: RemediationRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RemediationRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("remediationId", params.remediationId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "enterprises",
                        params._pathParam(0),
                        "reputation",
                        "remediation",
                        params._pathParam(1),
                    )
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

        private val listHandler: Handler<RemediationListPageResponse> =
            jsonHandler<RemediationListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: RemediationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RemediationListPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("enterpriseId", params.enterpriseId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "enterprises",
                        params._pathParam(0),
                        "reputation",
                        "remediation",
                    )
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
                        RemediationListPage.builder()
                            .service(RemediationServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val submitHandler: Handler<RemediationSubmitResponse> =
            jsonHandler<RemediationSubmitResponse>(clientOptions.jsonMapper)

        override fun submit(
            params: RemediationSubmitParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RemediationSubmitResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("enterpriseId", params.enterpriseId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "enterprises",
                        params._pathParam(0),
                        "reputation",
                        "remediation",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { submitHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
