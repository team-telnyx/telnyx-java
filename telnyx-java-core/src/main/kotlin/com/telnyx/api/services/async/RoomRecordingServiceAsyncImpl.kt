// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

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
import com.telnyx.api.core.prepareAsync
import com.telnyx.api.models.roomrecordings.RoomRecordingDeleteBulkParams
import com.telnyx.api.models.roomrecordings.RoomRecordingDeleteBulkResponse
import com.telnyx.api.models.roomrecordings.RoomRecordingDeleteParams
import com.telnyx.api.models.roomrecordings.RoomRecordingListParams
import com.telnyx.api.models.roomrecordings.RoomRecordingListResponse
import com.telnyx.api.models.roomrecordings.RoomRecordingRetrieveParams
import com.telnyx.api.models.roomrecordings.RoomRecordingRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RoomRecordingServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    RoomRecordingServiceAsync {

    private val withRawResponse: RoomRecordingServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RoomRecordingServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RoomRecordingServiceAsync =
        RoomRecordingServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: RoomRecordingRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RoomRecordingRetrieveResponse> =
        // get /room_recordings/{room_recording_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: RoomRecordingListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RoomRecordingListResponse> =
        // get /room_recordings
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: RoomRecordingDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /room_recordings/{room_recording_id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun deleteBulk(
        params: RoomRecordingDeleteBulkParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RoomRecordingDeleteBulkResponse> =
        // delete /room_recordings
        withRawResponse().deleteBulk(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RoomRecordingServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RoomRecordingServiceAsync.WithRawResponse =
            RoomRecordingServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<RoomRecordingRetrieveResponse> =
            jsonHandler<RoomRecordingRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: RoomRecordingRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RoomRecordingRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("roomRecordingId", params.roomRecordingId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("room_recordings", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<RoomRecordingListResponse> =
            jsonHandler<RoomRecordingListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: RoomRecordingListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RoomRecordingListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("room_recordings")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: RoomRecordingDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("roomRecordingId", params.roomRecordingId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("room_recordings", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }

        private val deleteBulkHandler: Handler<RoomRecordingDeleteBulkResponse> =
            jsonHandler<RoomRecordingDeleteBulkResponse>(clientOptions.jsonMapper)

        override fun deleteBulk(
            params: RoomRecordingDeleteBulkParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RoomRecordingDeleteBulkResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("room_recordings")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deleteBulkHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
