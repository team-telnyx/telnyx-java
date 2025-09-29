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
import com.telnyx.api.core.http.json
import com.telnyx.api.core.http.parseable
import com.telnyx.api.core.prepare
import com.telnyx.api.models.billinggroups.BillingGroupCreateParams
import com.telnyx.api.models.billinggroups.BillingGroupCreateResponse
import com.telnyx.api.models.billinggroups.BillingGroupDeleteParams
import com.telnyx.api.models.billinggroups.BillingGroupDeleteResponse
import com.telnyx.api.models.billinggroups.BillingGroupListParams
import com.telnyx.api.models.billinggroups.BillingGroupListResponse
import com.telnyx.api.models.billinggroups.BillingGroupRetrieveParams
import com.telnyx.api.models.billinggroups.BillingGroupRetrieveResponse
import com.telnyx.api.models.billinggroups.BillingGroupUpdateParams
import com.telnyx.api.models.billinggroups.BillingGroupUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class BillingGroupServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BillingGroupService {

    private val withRawResponse: BillingGroupService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BillingGroupService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BillingGroupService =
        BillingGroupServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: BillingGroupCreateParams,
        requestOptions: RequestOptions,
    ): BillingGroupCreateResponse =
        // post /billing_groups
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: BillingGroupRetrieveParams,
        requestOptions: RequestOptions,
    ): BillingGroupRetrieveResponse =
        // get /billing_groups/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: BillingGroupUpdateParams,
        requestOptions: RequestOptions,
    ): BillingGroupUpdateResponse =
        // patch /billing_groups/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: BillingGroupListParams,
        requestOptions: RequestOptions,
    ): BillingGroupListResponse =
        // get /billing_groups
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: BillingGroupDeleteParams,
        requestOptions: RequestOptions,
    ): BillingGroupDeleteResponse =
        // delete /billing_groups/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BillingGroupService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BillingGroupService.WithRawResponse =
            BillingGroupServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<BillingGroupCreateResponse> =
            jsonHandler<BillingGroupCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: BillingGroupCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillingGroupCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("billing_groups")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<BillingGroupRetrieveResponse> =
            jsonHandler<BillingGroupRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: BillingGroupRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillingGroupRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("billing_groups", params._pathParam(0))
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

        private val updateHandler: Handler<BillingGroupUpdateResponse> =
            jsonHandler<BillingGroupUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: BillingGroupUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillingGroupUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("billing_groups", params._pathParam(0))
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

        private val listHandler: Handler<BillingGroupListResponse> =
            jsonHandler<BillingGroupListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: BillingGroupListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillingGroupListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("billing_groups")
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

        private val deleteHandler: Handler<BillingGroupDeleteResponse> =
            jsonHandler<BillingGroupDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: BillingGroupDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillingGroupDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("billing_groups", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
