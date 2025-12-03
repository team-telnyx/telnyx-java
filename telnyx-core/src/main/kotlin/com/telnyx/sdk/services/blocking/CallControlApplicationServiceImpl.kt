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
import com.telnyx.sdk.models.callcontrolapplications.CallControlApplicationCreateParams
import com.telnyx.sdk.models.callcontrolapplications.CallControlApplicationCreateResponse
import com.telnyx.sdk.models.callcontrolapplications.CallControlApplicationDeleteParams
import com.telnyx.sdk.models.callcontrolapplications.CallControlApplicationDeleteResponse
import com.telnyx.sdk.models.callcontrolapplications.CallControlApplicationListPage
import com.telnyx.sdk.models.callcontrolapplications.CallControlApplicationListPageResponse
import com.telnyx.sdk.models.callcontrolapplications.CallControlApplicationListParams
import com.telnyx.sdk.models.callcontrolapplications.CallControlApplicationRetrieveParams
import com.telnyx.sdk.models.callcontrolapplications.CallControlApplicationRetrieveResponse
import com.telnyx.sdk.models.callcontrolapplications.CallControlApplicationUpdateParams
import com.telnyx.sdk.models.callcontrolapplications.CallControlApplicationUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CallControlApplicationServiceImpl
internal constructor(private val clientOptions: ClientOptions) : CallControlApplicationService {

    private val withRawResponse: CallControlApplicationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CallControlApplicationService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): CallControlApplicationService =
        CallControlApplicationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: CallControlApplicationCreateParams,
        requestOptions: RequestOptions,
    ): CallControlApplicationCreateResponse =
        // post /call_control_applications
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: CallControlApplicationRetrieveParams,
        requestOptions: RequestOptions,
    ): CallControlApplicationRetrieveResponse =
        // get /call_control_applications/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: CallControlApplicationUpdateParams,
        requestOptions: RequestOptions,
    ): CallControlApplicationUpdateResponse =
        // patch /call_control_applications/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: CallControlApplicationListParams,
        requestOptions: RequestOptions,
    ): CallControlApplicationListPage =
        // get /call_control_applications
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: CallControlApplicationDeleteParams,
        requestOptions: RequestOptions,
    ): CallControlApplicationDeleteResponse =
        // delete /call_control_applications/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CallControlApplicationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CallControlApplicationService.WithRawResponse =
            CallControlApplicationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<CallControlApplicationCreateResponse> =
            jsonHandler<CallControlApplicationCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: CallControlApplicationCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CallControlApplicationCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("call_control_applications")
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

        private val retrieveHandler: Handler<CallControlApplicationRetrieveResponse> =
            jsonHandler<CallControlApplicationRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CallControlApplicationRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CallControlApplicationRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("call_control_applications", params._pathParam(0))
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

        private val updateHandler: Handler<CallControlApplicationUpdateResponse> =
            jsonHandler<CallControlApplicationUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: CallControlApplicationUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CallControlApplicationUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("call_control_applications", params._pathParam(0))
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

        private val listHandler: Handler<CallControlApplicationListPageResponse> =
            jsonHandler<CallControlApplicationListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CallControlApplicationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CallControlApplicationListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("call_control_applications")
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
                        CallControlApplicationListPage.builder()
                            .service(CallControlApplicationServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<CallControlApplicationDeleteResponse> =
            jsonHandler<CallControlApplicationDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: CallControlApplicationDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CallControlApplicationDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("call_control_applications", params._pathParam(0))
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
