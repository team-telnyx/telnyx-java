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
import com.telnyx.sdk.core.http.multipartFormData
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.voiceclones.VoiceCloneCreateFromUploadParams
import com.telnyx.sdk.models.voiceclones.VoiceCloneCreateFromUploadResponse
import com.telnyx.sdk.models.voiceclones.VoiceCloneCreateParams
import com.telnyx.sdk.models.voiceclones.VoiceCloneCreateResponse
import com.telnyx.sdk.models.voiceclones.VoiceCloneDeleteParams
import com.telnyx.sdk.models.voiceclones.VoiceCloneDownloadSampleParams
import com.telnyx.sdk.models.voiceclones.VoiceCloneListPage
import com.telnyx.sdk.models.voiceclones.VoiceCloneListPageResponse
import com.telnyx.sdk.models.voiceclones.VoiceCloneListParams
import com.telnyx.sdk.models.voiceclones.VoiceCloneUpdateParams
import com.telnyx.sdk.models.voiceclones.VoiceCloneUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Capture and manage voice identities as clones for use in text-to-speech synthesis. */
class VoiceCloneServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    VoiceCloneService {

    private val withRawResponse: VoiceCloneService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): VoiceCloneService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): VoiceCloneService =
        VoiceCloneServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: VoiceCloneCreateParams,
        requestOptions: RequestOptions,
    ): VoiceCloneCreateResponse =
        // post /voice_clones
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: VoiceCloneUpdateParams,
        requestOptions: RequestOptions,
    ): VoiceCloneUpdateResponse =
        // patch /voice_clones/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: VoiceCloneListParams,
        requestOptions: RequestOptions,
    ): VoiceCloneListPage =
        // get /voice_clones
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: VoiceCloneDeleteParams, requestOptions: RequestOptions) {
        // delete /voice_clones/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun createFromUpload(
        params: VoiceCloneCreateFromUploadParams,
        requestOptions: RequestOptions,
    ): VoiceCloneCreateFromUploadResponse =
        // post /voice_clones/from_upload
        withRawResponse().createFromUpload(params, requestOptions).parse()

    override fun downloadSample(
        params: VoiceCloneDownloadSampleParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /voice_clones/{id}/sample
        withRawResponse().downloadSample(params, requestOptions)

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VoiceCloneService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VoiceCloneService.WithRawResponse =
            VoiceCloneServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<VoiceCloneCreateResponse> =
            jsonHandler<VoiceCloneCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: VoiceCloneCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VoiceCloneCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("voice_clones")
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

        private val updateHandler: Handler<VoiceCloneUpdateResponse> =
            jsonHandler<VoiceCloneUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: VoiceCloneUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VoiceCloneUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("voice_clones", params._pathParam(0))
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

        private val listHandler: Handler<VoiceCloneListPageResponse> =
            jsonHandler<VoiceCloneListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: VoiceCloneListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VoiceCloneListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("voice_clones")
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
                        VoiceCloneListPage.builder()
                            .service(VoiceCloneServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: VoiceCloneDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("voice_clones", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val createFromUploadHandler: Handler<VoiceCloneCreateFromUploadResponse> =
            jsonHandler<VoiceCloneCreateFromUploadResponse>(clientOptions.jsonMapper)

        override fun createFromUpload(
            params: VoiceCloneCreateFromUploadParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VoiceCloneCreateFromUploadResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("voice_clones", "from_upload")
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createFromUploadHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        override fun downloadSample(
            params: VoiceCloneDownloadSampleParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("voice_clones", params._pathParam(0), "sample")
                    .putHeader("Accept", "audio/wav")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }
    }
}
