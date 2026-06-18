// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.handlers.emptyHandler
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
import com.telnyx.sdk.models.dialogflowconnections.DialogflowConnectionCreateParams
import com.telnyx.sdk.models.dialogflowconnections.DialogflowConnectionCreateResponse
import com.telnyx.sdk.models.dialogflowconnections.DialogflowConnectionDeleteParams
import com.telnyx.sdk.models.dialogflowconnections.DialogflowConnectionRetrieveParams
import com.telnyx.sdk.models.dialogflowconnections.DialogflowConnectionRetrieveResponse
import com.telnyx.sdk.models.dialogflowconnections.DialogflowConnectionUpdateParams
import com.telnyx.sdk.models.dialogflowconnections.DialogflowConnectionUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Dialogflow Connection Operations. */
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
