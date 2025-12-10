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
import com.telnyx.sdk.models.mobilephonenumbers.MobilePhoneNumberListPage
import com.telnyx.sdk.models.mobilephonenumbers.MobilePhoneNumberListPageResponse
import com.telnyx.sdk.models.mobilephonenumbers.MobilePhoneNumberListParams
import com.telnyx.sdk.models.mobilephonenumbers.MobilePhoneNumberRetrieveParams
import com.telnyx.sdk.models.mobilephonenumbers.MobilePhoneNumberRetrieveResponse
import com.telnyx.sdk.models.mobilephonenumbers.MobilePhoneNumberUpdateParams
import com.telnyx.sdk.models.mobilephonenumbers.MobilePhoneNumberUpdateResponse
import com.telnyx.sdk.services.blocking.mobilephonenumbers.MessagingService
import com.telnyx.sdk.services.blocking.mobilephonenumbers.MessagingServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class MobilePhoneNumberServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MobilePhoneNumberService {

    private val withRawResponse: MobilePhoneNumberService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val messaging: MessagingService by lazy { MessagingServiceImpl(clientOptions) }

    override fun withRawResponse(): MobilePhoneNumberService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MobilePhoneNumberService =
        MobilePhoneNumberServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun messaging(): MessagingService = messaging

    override fun retrieve(
        params: MobilePhoneNumberRetrieveParams,
        requestOptions: RequestOptions,
    ): MobilePhoneNumberRetrieveResponse =
        // get /v2/mobile_phone_numbers/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: MobilePhoneNumberUpdateParams,
        requestOptions: RequestOptions,
    ): MobilePhoneNumberUpdateResponse =
        // patch /v2/mobile_phone_numbers/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: MobilePhoneNumberListParams,
        requestOptions: RequestOptions,
    ): MobilePhoneNumberListPage =
        // get /v2/mobile_phone_numbers
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MobilePhoneNumberService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val messaging: MessagingService.WithRawResponse by lazy {
            MessagingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MobilePhoneNumberService.WithRawResponse =
            MobilePhoneNumberServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun messaging(): MessagingService.WithRawResponse = messaging

        private val retrieveHandler: Handler<MobilePhoneNumberRetrieveResponse> =
            jsonHandler<MobilePhoneNumberRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: MobilePhoneNumberRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MobilePhoneNumberRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "mobile_phone_numbers", params._pathParam(0))
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

        private val updateHandler: Handler<MobilePhoneNumberUpdateResponse> =
            jsonHandler<MobilePhoneNumberUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: MobilePhoneNumberUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MobilePhoneNumberUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "mobile_phone_numbers", params._pathParam(0))
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

        private val listHandler: Handler<MobilePhoneNumberListPageResponse> =
            jsonHandler<MobilePhoneNumberListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: MobilePhoneNumberListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MobilePhoneNumberListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "mobile_phone_numbers")
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
                        MobilePhoneNumberListPage.builder()
                            .service(MobilePhoneNumberServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
