// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.portingorders

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
import com.telnyx.sdk.models.portingorders.activationjobs.ActivationJobListParams
import com.telnyx.sdk.models.portingorders.activationjobs.ActivationJobListResponse
import com.telnyx.sdk.models.portingorders.activationjobs.ActivationJobRetrieveParams
import com.telnyx.sdk.models.portingorders.activationjobs.ActivationJobRetrieveResponse
import com.telnyx.sdk.models.portingorders.activationjobs.ActivationJobUpdateParams
import com.telnyx.sdk.models.portingorders.activationjobs.ActivationJobUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ActivationJobServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ActivationJobService {

    private val withRawResponse: ActivationJobService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ActivationJobService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActivationJobService =
        ActivationJobServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: ActivationJobRetrieveParams,
        requestOptions: RequestOptions,
    ): ActivationJobRetrieveResponse =
        // get /porting_orders/{id}/activation_jobs/{activationJobId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: ActivationJobUpdateParams,
        requestOptions: RequestOptions,
    ): ActivationJobUpdateResponse =
        // patch /porting_orders/{id}/activation_jobs/{activationJobId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: ActivationJobListParams,
        requestOptions: RequestOptions,
    ): ActivationJobListResponse =
        // get /porting_orders/{id}/activation_jobs
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ActivationJobService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ActivationJobService.WithRawResponse =
            ActivationJobServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<ActivationJobRetrieveResponse> =
            jsonHandler<ActivationJobRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ActivationJobRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActivationJobRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("activationJobId", params.activationJobId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "porting_orders",
                        params._pathParam(0),
                        "activation_jobs",
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

        private val updateHandler: Handler<ActivationJobUpdateResponse> =
            jsonHandler<ActivationJobUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: ActivationJobUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActivationJobUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("activationJobId", params.activationJobId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "porting_orders",
                        params._pathParam(0),
                        "activation_jobs",
                        params._pathParam(1),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<ActivationJobListResponse> =
            jsonHandler<ActivationJobListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ActivationJobListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActivationJobListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting_orders", params._pathParam(0), "activation_jobs")
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
