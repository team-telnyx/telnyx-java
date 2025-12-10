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
import com.telnyx.sdk.models.recordings.RecordingDeleteParams
import com.telnyx.sdk.models.recordings.RecordingDeleteResponse
import com.telnyx.sdk.models.recordings.RecordingListPage
import com.telnyx.sdk.models.recordings.RecordingListPageResponse
import com.telnyx.sdk.models.recordings.RecordingListParams
import com.telnyx.sdk.models.recordings.RecordingRetrieveParams
import com.telnyx.sdk.models.recordings.RecordingRetrieveResponse
import com.telnyx.sdk.services.blocking.recordings.ActionService
import com.telnyx.sdk.services.blocking.recordings.ActionServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RecordingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    RecordingService {

    private val withRawResponse: RecordingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val actions: ActionService by lazy { ActionServiceImpl(clientOptions) }

    override fun withRawResponse(): RecordingService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RecordingService =
        RecordingServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun actions(): ActionService = actions

    override fun retrieve(
        params: RecordingRetrieveParams,
        requestOptions: RequestOptions,
    ): RecordingRetrieveResponse =
        // get /recordings/{recording_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: RecordingListParams,
        requestOptions: RequestOptions,
    ): RecordingListPage =
        // get /recordings
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: RecordingDeleteParams,
        requestOptions: RequestOptions,
    ): RecordingDeleteResponse =
        // delete /recordings/{recording_id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RecordingService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val actions: ActionService.WithRawResponse by lazy {
            ActionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RecordingService.WithRawResponse =
            RecordingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun actions(): ActionService.WithRawResponse = actions

        private val retrieveHandler: Handler<RecordingRetrieveResponse> =
            jsonHandler<RecordingRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: RecordingRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RecordingRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("recordingId", params.recordingId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("recordings", params._pathParam(0))
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

        private val listHandler: Handler<RecordingListPageResponse> =
            jsonHandler<RecordingListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: RecordingListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RecordingListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("recordings")
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
                        RecordingListPage.builder()
                            .service(RecordingServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<RecordingDeleteResponse> =
            jsonHandler<RecordingDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: RecordingDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RecordingDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("recordingId", params.recordingId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("recordings", params._pathParam(0))
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
