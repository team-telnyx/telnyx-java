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
import com.telnyx.sdk.models.simcardgroups.SimCardGroupCreateParams
import com.telnyx.sdk.models.simcardgroups.SimCardGroupCreateResponse
import com.telnyx.sdk.models.simcardgroups.SimCardGroupDeleteParams
import com.telnyx.sdk.models.simcardgroups.SimCardGroupDeleteResponse
import com.telnyx.sdk.models.simcardgroups.SimCardGroupListParams
import com.telnyx.sdk.models.simcardgroups.SimCardGroupListResponse
import com.telnyx.sdk.models.simcardgroups.SimCardGroupRetrieveParams
import com.telnyx.sdk.models.simcardgroups.SimCardGroupRetrieveResponse
import com.telnyx.sdk.models.simcardgroups.SimCardGroupUpdateParams
import com.telnyx.sdk.models.simcardgroups.SimCardGroupUpdateResponse
import com.telnyx.sdk.services.blocking.simcardgroups.ActionService
import com.telnyx.sdk.services.blocking.simcardgroups.ActionServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SimCardGroupServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SimCardGroupService {

    private val withRawResponse: SimCardGroupService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val actions: ActionService by lazy { ActionServiceImpl(clientOptions) }

    override fun withRawResponse(): SimCardGroupService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SimCardGroupService =
        SimCardGroupServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun actions(): ActionService = actions

    override fun create(
        params: SimCardGroupCreateParams,
        requestOptions: RequestOptions,
    ): SimCardGroupCreateResponse =
        // post /sim_card_groups
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: SimCardGroupRetrieveParams,
        requestOptions: RequestOptions,
    ): SimCardGroupRetrieveResponse =
        // get /sim_card_groups/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: SimCardGroupUpdateParams,
        requestOptions: RequestOptions,
    ): SimCardGroupUpdateResponse =
        // patch /sim_card_groups/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: SimCardGroupListParams,
        requestOptions: RequestOptions,
    ): SimCardGroupListResponse =
        // get /sim_card_groups
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: SimCardGroupDeleteParams,
        requestOptions: RequestOptions,
    ): SimCardGroupDeleteResponse =
        // delete /sim_card_groups/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SimCardGroupService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val actions: ActionService.WithRawResponse by lazy {
            ActionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SimCardGroupService.WithRawResponse =
            SimCardGroupServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun actions(): ActionService.WithRawResponse = actions

        private val createHandler: Handler<SimCardGroupCreateResponse> =
            jsonHandler<SimCardGroupCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: SimCardGroupCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimCardGroupCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sim_card_groups")
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

        private val retrieveHandler: Handler<SimCardGroupRetrieveResponse> =
            jsonHandler<SimCardGroupRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: SimCardGroupRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimCardGroupRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sim_card_groups", params._pathParam(0))
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

        private val updateHandler: Handler<SimCardGroupUpdateResponse> =
            jsonHandler<SimCardGroupUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: SimCardGroupUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimCardGroupUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sim_card_groups", params._pathParam(0))
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

        private val listHandler: Handler<SimCardGroupListResponse> =
            jsonHandler<SimCardGroupListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: SimCardGroupListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimCardGroupListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sim_card_groups")
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

        private val deleteHandler: Handler<SimCardGroupDeleteResponse> =
            jsonHandler<SimCardGroupDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: SimCardGroupDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimCardGroupDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sim_card_groups", params._pathParam(0))
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
