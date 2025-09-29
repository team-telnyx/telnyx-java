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
import com.telnyx.api.core.http.multipartFormData
import com.telnyx.api.core.http.parseable
import com.telnyx.api.core.prepare
import com.telnyx.api.models.media.MediaDeleteParams
import com.telnyx.api.models.media.MediaDownloadParams
import com.telnyx.api.models.media.MediaListParams
import com.telnyx.api.models.media.MediaListResponse
import com.telnyx.api.models.media.MediaRetrieveParams
import com.telnyx.api.models.media.MediaRetrieveResponse
import com.telnyx.api.models.media.MediaUpdateParams
import com.telnyx.api.models.media.MediaUpdateResponse
import com.telnyx.api.models.media.MediaUploadParams
import com.telnyx.api.models.media.MediaUploadResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class MediaServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MediaService {

    private val withRawResponse: MediaService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MediaService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MediaService =
        MediaServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: MediaRetrieveParams,
        requestOptions: RequestOptions,
    ): MediaRetrieveResponse =
        // get /media/{media_name}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: MediaUpdateParams,
        requestOptions: RequestOptions,
    ): MediaUpdateResponse =
        // put /media/{media_name}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: MediaListParams, requestOptions: RequestOptions): MediaListResponse =
        // get /media
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: MediaDeleteParams, requestOptions: RequestOptions) {
        // delete /media/{media_name}
        withRawResponse().delete(params, requestOptions)
    }

    override fun download(
        params: MediaDownloadParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /media/{media_name}/download
        withRawResponse().download(params, requestOptions)

    override fun upload(
        params: MediaUploadParams,
        requestOptions: RequestOptions,
    ): MediaUploadResponse =
        // post /media
        withRawResponse().upload(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MediaService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MediaService.WithRawResponse =
            MediaServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<MediaRetrieveResponse> =
            jsonHandler<MediaRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: MediaRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MediaRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("mediaName", params.mediaName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("media", params._pathParam(0))
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

        private val updateHandler: Handler<MediaUpdateResponse> =
            jsonHandler<MediaUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: MediaUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MediaUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("mediaName", params.mediaName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("media", params._pathParam(0))
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
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

        private val listHandler: Handler<MediaListResponse> =
            jsonHandler<MediaListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: MediaListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MediaListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("media")
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: MediaDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("mediaName", params.mediaName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("media", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        override fun download(
            params: MediaDownloadParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("mediaName", params.mediaName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("media", params._pathParam(0), "download")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        private val uploadHandler: Handler<MediaUploadResponse> =
            jsonHandler<MediaUploadResponse>(clientOptions.jsonMapper)

        override fun upload(
            params: MediaUploadParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MediaUploadResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("media")
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { uploadHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
