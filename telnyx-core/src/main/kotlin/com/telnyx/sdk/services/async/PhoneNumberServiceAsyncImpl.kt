// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

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
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.phonenumbers.PhoneNumberDeleteParams
import com.telnyx.sdk.models.phonenumbers.PhoneNumberDeleteResponse
import com.telnyx.sdk.models.phonenumbers.PhoneNumberListPageAsync
import com.telnyx.sdk.models.phonenumbers.PhoneNumberListPageResponse
import com.telnyx.sdk.models.phonenumbers.PhoneNumberListParams
import com.telnyx.sdk.models.phonenumbers.PhoneNumberRetrieveParams
import com.telnyx.sdk.models.phonenumbers.PhoneNumberRetrieveResponse
import com.telnyx.sdk.models.phonenumbers.PhoneNumberSlimListPageAsync
import com.telnyx.sdk.models.phonenumbers.PhoneNumberSlimListPageResponse
import com.telnyx.sdk.models.phonenumbers.PhoneNumberSlimListParams
import com.telnyx.sdk.models.phonenumbers.PhoneNumberUpdateParams
import com.telnyx.sdk.models.phonenumbers.PhoneNumberUpdateResponse
import com.telnyx.sdk.services.async.phonenumbers.ActionServiceAsync
import com.telnyx.sdk.services.async.phonenumbers.ActionServiceAsyncImpl
import com.telnyx.sdk.services.async.phonenumbers.CsvDownloadServiceAsync
import com.telnyx.sdk.services.async.phonenumbers.CsvDownloadServiceAsyncImpl
import com.telnyx.sdk.services.async.phonenumbers.JobServiceAsync
import com.telnyx.sdk.services.async.phonenumbers.JobServiceAsyncImpl
import com.telnyx.sdk.services.async.phonenumbers.MessagingServiceAsync
import com.telnyx.sdk.services.async.phonenumbers.MessagingServiceAsyncImpl
import com.telnyx.sdk.services.async.phonenumbers.VoiceServiceAsync
import com.telnyx.sdk.services.async.phonenumbers.VoiceServiceAsyncImpl
import com.telnyx.sdk.services.async.phonenumbers.VoicemailServiceAsync
import com.telnyx.sdk.services.async.phonenumbers.VoicemailServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PhoneNumberServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PhoneNumberServiceAsync {

    private val withRawResponse: PhoneNumberServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val actions: ActionServiceAsync by lazy { ActionServiceAsyncImpl(clientOptions) }

    private val csvDownloads: CsvDownloadServiceAsync by lazy {
        CsvDownloadServiceAsyncImpl(clientOptions)
    }

    private val jobs: JobServiceAsync by lazy { JobServiceAsyncImpl(clientOptions) }

    private val messaging: MessagingServiceAsync by lazy {
        MessagingServiceAsyncImpl(clientOptions)
    }

    private val voice: VoiceServiceAsync by lazy { VoiceServiceAsyncImpl(clientOptions) }

    private val voicemail: VoicemailServiceAsync by lazy {
        VoicemailServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): PhoneNumberServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PhoneNumberServiceAsync =
        PhoneNumberServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun actions(): ActionServiceAsync = actions

    override fun csvDownloads(): CsvDownloadServiceAsync = csvDownloads

    override fun jobs(): JobServiceAsync = jobs

    override fun messaging(): MessagingServiceAsync = messaging

    override fun voice(): VoiceServiceAsync = voice

    override fun voicemail(): VoicemailServiceAsync = voicemail

    override fun retrieve(
        params: PhoneNumberRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhoneNumberRetrieveResponse> =
        // get /phone_numbers/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: PhoneNumberUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhoneNumberUpdateResponse> =
        // patch /phone_numbers/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: PhoneNumberListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhoneNumberListPageAsync> =
        // get /phone_numbers
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: PhoneNumberDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhoneNumberDeleteResponse> =
        // delete /phone_numbers/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun slimList(
        params: PhoneNumberSlimListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhoneNumberSlimListPageAsync> =
        // get /phone_numbers/slim
        withRawResponse().slimList(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PhoneNumberServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val actions: ActionServiceAsync.WithRawResponse by lazy {
            ActionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val csvDownloads: CsvDownloadServiceAsync.WithRawResponse by lazy {
            CsvDownloadServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val jobs: JobServiceAsync.WithRawResponse by lazy {
            JobServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val messaging: MessagingServiceAsync.WithRawResponse by lazy {
            MessagingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val voice: VoiceServiceAsync.WithRawResponse by lazy {
            VoiceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val voicemail: VoicemailServiceAsync.WithRawResponse by lazy {
            VoicemailServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PhoneNumberServiceAsync.WithRawResponse =
            PhoneNumberServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun actions(): ActionServiceAsync.WithRawResponse = actions

        override fun csvDownloads(): CsvDownloadServiceAsync.WithRawResponse = csvDownloads

        override fun jobs(): JobServiceAsync.WithRawResponse = jobs

        override fun messaging(): MessagingServiceAsync.WithRawResponse = messaging

        override fun voice(): VoiceServiceAsync.WithRawResponse = voice

        override fun voicemail(): VoicemailServiceAsync.WithRawResponse = voicemail

        private val retrieveHandler: Handler<PhoneNumberRetrieveResponse> =
            jsonHandler<PhoneNumberRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: PhoneNumberRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PhoneNumberRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("phone_numbers", params._pathParam(0))
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

        private val updateHandler: Handler<PhoneNumberUpdateResponse> =
            jsonHandler<PhoneNumberUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: PhoneNumberUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PhoneNumberUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("phoneNumberId", params.phoneNumberId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("phone_numbers", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<PhoneNumberListPageResponse> =
            jsonHandler<PhoneNumberListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: PhoneNumberListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PhoneNumberListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("phone_numbers")
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
                            .let {
                                PhoneNumberListPageAsync.builder()
                                    .service(PhoneNumberServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<PhoneNumberDeleteResponse> =
            jsonHandler<PhoneNumberDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: PhoneNumberDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PhoneNumberDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("phone_numbers", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val slimListHandler: Handler<PhoneNumberSlimListPageResponse> =
            jsonHandler<PhoneNumberSlimListPageResponse>(clientOptions.jsonMapper)

        override fun slimList(
            params: PhoneNumberSlimListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PhoneNumberSlimListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("phone_numbers", "slim")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { slimListHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                PhoneNumberSlimListPageAsync.builder()
                                    .service(PhoneNumberServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }
    }
}
