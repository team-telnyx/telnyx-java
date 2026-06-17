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
import com.telnyx.sdk.models.pronunciationdicts.PronunciationDictCreateParams
import com.telnyx.sdk.models.pronunciationdicts.PronunciationDictDeleteParams
import com.telnyx.sdk.models.pronunciationdicts.PronunciationDictListPage
import com.telnyx.sdk.models.pronunciationdicts.PronunciationDictListPageResponse
import com.telnyx.sdk.models.pronunciationdicts.PronunciationDictListParams
import com.telnyx.sdk.models.pronunciationdicts.PronunciationDictResponse
import com.telnyx.sdk.models.pronunciationdicts.PronunciationDictRetrieveParams
import com.telnyx.sdk.models.pronunciationdicts.PronunciationDictUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * Manage pronunciation dictionaries for text-to-speech synthesis. Dictionaries contain alias items
 * (text replacement) and phoneme items (IPA pronunciation notation) that control how specific words
 * are spoken.
 */
class PronunciationDictServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PronunciationDictService {

    private val withRawResponse: PronunciationDictService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PronunciationDictService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PronunciationDictService =
        PronunciationDictServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: PronunciationDictCreateParams,
        requestOptions: RequestOptions,
    ): PronunciationDictResponse =
        // post /pronunciation_dicts
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: PronunciationDictRetrieveParams,
        requestOptions: RequestOptions,
    ): PronunciationDictResponse =
        // get /pronunciation_dicts/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: PronunciationDictUpdateParams,
        requestOptions: RequestOptions,
    ): PronunciationDictResponse =
        // patch /pronunciation_dicts/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: PronunciationDictListParams,
        requestOptions: RequestOptions,
    ): PronunciationDictListPage =
        // get /pronunciation_dicts
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: PronunciationDictDeleteParams, requestOptions: RequestOptions) {
        // delete /pronunciation_dicts/{id}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PronunciationDictService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PronunciationDictService.WithRawResponse =
            PronunciationDictServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<PronunciationDictResponse> =
            jsonHandler<PronunciationDictResponse>(clientOptions.jsonMapper)

        override fun create(
            params: PronunciationDictCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PronunciationDictResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("pronunciation_dicts")
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
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

        private val retrieveHandler: Handler<PronunciationDictResponse> =
            jsonHandler<PronunciationDictResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: PronunciationDictRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PronunciationDictResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("pronunciation_dicts", params._pathParam(0))
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

        private val updateHandler: Handler<PronunciationDictResponse> =
            jsonHandler<PronunciationDictResponse>(clientOptions.jsonMapper)

        override fun update(
            params: PronunciationDictUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PronunciationDictResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("pronunciation_dicts", params._pathParam(0))
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

        private val listHandler: Handler<PronunciationDictListPageResponse> =
            jsonHandler<PronunciationDictListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: PronunciationDictListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PronunciationDictListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("pronunciation_dicts")
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
                        PronunciationDictListPage.builder()
                            .service(PronunciationDictServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: PronunciationDictDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("pronunciation_dicts", params._pathParam(0))
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
