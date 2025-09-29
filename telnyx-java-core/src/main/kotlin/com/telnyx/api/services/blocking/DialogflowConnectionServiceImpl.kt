// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.handlers.emptyHandler
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
import com.telnyx.api.models.dialogflowconnections.DialogflowConnectionCreateParams
import com.telnyx.api.models.dialogflowconnections.DialogflowConnectionCreateResponse
import com.telnyx.api.models.dialogflowconnections.DialogflowConnectionDeleteParams
import com.telnyx.api.models.dialogflowconnections.DialogflowConnectionRetrieveParams
import com.telnyx.api.models.dialogflowconnections.DialogflowConnectionRetrieveResponse
import com.telnyx.api.models.dialogflowconnections.DialogflowConnectionUpdateParams
import com.telnyx.api.models.dialogflowconnections.DialogflowConnectionUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class DialogflowConnectionServiceImpl
internal constructor(private val clientOptions: ClientOptions) : DialogflowConnectionService {

    private val withRawResponse: DialogflowConnectionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DialogflowConnectionService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): DialogflowConnectionService =
        DialogflowConnectionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: DialogflowConnectionCreateParams,
        requestOptions: RequestOptions,
    ): DialogflowConnectionCreateResponse =
        // post /dialogflow_connections/{connection_id}
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: DialogflowConnectionRetrieveParams,
        requestOptions: RequestOptions,
    ): DialogflowConnectionRetrieveResponse =
        // get /dialogflow_connections/{connection_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: DialogflowConnectionUpdateParams,
        requestOptions: RequestOptions,
    ): DialogflowConnectionUpdateResponse =
        // put /dialogflow_connections/{connection_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun delete(params: DialogflowConnectionDeleteParams, requestOptions: RequestOptions) {
        // delete /dialogflow_connections/{connection_id}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DialogflowConnectionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DialogflowConnectionService.WithRawResponse =
            DialogflowConnectionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<DialogflowConnectionCreateResponse> =
            jsonHandler<DialogflowConnectionCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: DialogflowConnectionCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DialogflowConnectionCreateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("connectionId", params.connectionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("dialogflow_connections", params._pathParam(0))
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

        private val retrieveHandler: Handler<DialogflowConnectionRetrieveResponse> =
            jsonHandler<DialogflowConnectionRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: DialogflowConnectionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DialogflowConnectionRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("connectionId", params.connectionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("dialogflow_connections", params._pathParam(0))
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

        private val updateHandler: Handler<DialogflowConnectionUpdateResponse> =
            jsonHandler<DialogflowConnectionUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: DialogflowConnectionUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DialogflowConnectionUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("connectionId", params.connectionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("dialogflow_connections", params._pathParam(0))
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: DialogflowConnectionDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("connectionId", params.connectionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("dialogflow_connections", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }
    }
}
