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
import com.telnyx.sdk.models.phonenumbers.PhoneNumberDeleteParams
import com.telnyx.sdk.models.phonenumbers.PhoneNumberDeleteResponse
import com.telnyx.sdk.models.phonenumbers.PhoneNumberListPage
import com.telnyx.sdk.models.phonenumbers.PhoneNumberListPageResponse
import com.telnyx.sdk.models.phonenumbers.PhoneNumberListParams
import com.telnyx.sdk.models.phonenumbers.PhoneNumberRetrieveParams
import com.telnyx.sdk.models.phonenumbers.PhoneNumberRetrieveResponse
import com.telnyx.sdk.models.phonenumbers.PhoneNumberSlimListPage
import com.telnyx.sdk.models.phonenumbers.PhoneNumberSlimListPageResponse
import com.telnyx.sdk.models.phonenumbers.PhoneNumberSlimListParams
import com.telnyx.sdk.models.phonenumbers.PhoneNumberUpdateParams
import com.telnyx.sdk.models.phonenumbers.PhoneNumberUpdateResponse
import com.telnyx.sdk.services.blocking.phonenumbers.ActionService
import com.telnyx.sdk.services.blocking.phonenumbers.ActionServiceImpl
import com.telnyx.sdk.services.blocking.phonenumbers.CsvDownloadService
import com.telnyx.sdk.services.blocking.phonenumbers.CsvDownloadServiceImpl
import com.telnyx.sdk.services.blocking.phonenumbers.JobService
import com.telnyx.sdk.services.blocking.phonenumbers.JobServiceImpl
import com.telnyx.sdk.services.blocking.phonenumbers.MessagingService
import com.telnyx.sdk.services.blocking.phonenumbers.MessagingServiceImpl
import com.telnyx.sdk.services.blocking.phonenumbers.VoiceService
import com.telnyx.sdk.services.blocking.phonenumbers.VoiceServiceImpl
import com.telnyx.sdk.services.blocking.phonenumbers.VoicemailService
import com.telnyx.sdk.services.blocking.phonenumbers.VoicemailServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Configure your phone numbers */
class PhoneNumberServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PhoneNumberService {

    private val withRawResponse: PhoneNumberService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val actions: ActionService by lazy { ActionServiceImpl(clientOptions) }

    private val csvDownloads: CsvDownloadService by lazy { CsvDownloadServiceImpl(clientOptions) }

    private val jobs: JobService by lazy { JobServiceImpl(clientOptions) }

    private val messaging: MessagingService by lazy { MessagingServiceImpl(clientOptions) }

    private val voice: VoiceService by lazy { VoiceServiceImpl(clientOptions) }

    private val voicemail: VoicemailService by lazy { VoicemailServiceImpl(clientOptions) }

    override fun withRawResponse(): PhoneNumberService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PhoneNumberService =
        PhoneNumberServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Configure your phone numbers */
    override fun actions(): ActionService = actions

    override fun csvDownloads(): CsvDownloadService = csvDownloads

    /** Background jobs performed over a batch of phone numbers */
    override fun jobs(): JobService = jobs

    /** Configure your phone numbers */
    override fun messaging(): MessagingService = messaging

    /** Configure your phone numbers */
    override fun voice(): VoiceService = voice

    /** Voicemail API */
    override fun voicemail(): VoicemailService = voicemail

    override fun retrieve(
        params: PhoneNumberRetrieveParams,
        requestOptions: RequestOptions,
    ): PhoneNumberRetrieveResponse =
        // get /phone_numbers/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: PhoneNumberUpdateParams,
        requestOptions: RequestOptions,
    ): PhoneNumberUpdateResponse =
        // patch /phone_numbers/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: PhoneNumberListParams,
        requestOptions: RequestOptions,
    ): PhoneNumberListPage =
        // get /phone_numbers
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: PhoneNumberDeleteParams,
        requestOptions: RequestOptions,
    ): PhoneNumberDeleteResponse =
        // delete /phone_numbers/{id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun slimList(
        params: PhoneNumberSlimListParams,
        requestOptions: RequestOptions,
    ): PhoneNumberSlimListPage =
        // get /phone_numbers/slim
        withRawResponse().slimList(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PhoneNumberService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val actions: ActionService.WithRawResponse by lazy {
            ActionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val csvDownloads: CsvDownloadService.WithRawResponse by lazy {
            CsvDownloadServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val jobs: JobService.WithRawResponse by lazy {
            JobServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val messaging: MessagingService.WithRawResponse by lazy {
            MessagingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val voice: VoiceService.WithRawResponse by lazy {
            VoiceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val voicemail: VoicemailService.WithRawResponse by lazy {
            VoicemailServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PhoneNumberService.WithRawResponse =
            PhoneNumberServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Configure your phone numbers */
        override fun actions(): ActionService.WithRawResponse = actions

        override fun csvDownloads(): CsvDownloadService.WithRawResponse = csvDownloads

        /** Background jobs performed over a batch of phone numbers */
        override fun jobs(): JobService.WithRawResponse = jobs

        /** Configure your phone numbers */
        override fun messaging(): MessagingService.WithRawResponse = messaging

        /** Configure your phone numbers */
        override fun voice(): VoiceService.WithRawResponse = voice

        /** Voicemail API */
        override fun voicemail(): VoicemailService.WithRawResponse = voicemail

        private val retrieveHandler: Handler<PhoneNumberRetrieveResponse> =
            jsonHandler<PhoneNumberRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: PhoneNumberRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhoneNumberRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("phone_numbers", params._pathParam(0))
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

        private val updateHandler: Handler<PhoneNumberUpdateResponse> =
            jsonHandler<PhoneNumberUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: PhoneNumberUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhoneNumberUpdateResponse> {
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

        private val listHandler: Handler<PhoneNumberListPageResponse> =
            jsonHandler<PhoneNumberListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: PhoneNumberListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhoneNumberListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("phone_numbers")
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
                        PhoneNumberListPage.builder()
                            .service(PhoneNumberServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<PhoneNumberDeleteResponse> =
            jsonHandler<PhoneNumberDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: PhoneNumberDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhoneNumberDeleteResponse> {
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

        private val slimListHandler: Handler<PhoneNumberSlimListPageResponse> =
            jsonHandler<PhoneNumberSlimListPageResponse>(clientOptions.jsonMapper)

        override fun slimList(
            params: PhoneNumberSlimListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhoneNumberSlimListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("phone_numbers", "slim")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { slimListHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        PhoneNumberSlimListPage.builder()
                            .service(PhoneNumberServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
