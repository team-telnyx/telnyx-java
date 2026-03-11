// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.whatsapp

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
import com.telnyx.sdk.models.whatsapp.phonenumbers.PhoneNumberDeleteParams
import com.telnyx.sdk.models.whatsapp.phonenumbers.PhoneNumberListPage
import com.telnyx.sdk.models.whatsapp.phonenumbers.PhoneNumberListPageResponse
import com.telnyx.sdk.models.whatsapp.phonenumbers.PhoneNumberListParams
import com.telnyx.sdk.models.whatsapp.phonenumbers.PhoneNumberResendVerificationParams
import com.telnyx.sdk.models.whatsapp.phonenumbers.PhoneNumberVerifyParams
import com.telnyx.sdk.services.blocking.whatsapp.phonenumbers.CallingSettingService
import com.telnyx.sdk.services.blocking.whatsapp.phonenumbers.CallingSettingServiceImpl
import com.telnyx.sdk.services.blocking.whatsapp.phonenumbers.ProfileService
import com.telnyx.sdk.services.blocking.whatsapp.phonenumbers.ProfileServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Manage Whatsapp phone numbers */
class PhoneNumberServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PhoneNumberService {

    private val withRawResponse: PhoneNumberService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val callingSettings: CallingSettingService by lazy {
        CallingSettingServiceImpl(clientOptions)
    }

    private val profile: ProfileService by lazy { ProfileServiceImpl(clientOptions) }

    override fun withRawResponse(): PhoneNumberService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PhoneNumberService =
        PhoneNumberServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Manage Whatsapp phone numbers */
    override fun callingSettings(): CallingSettingService = callingSettings

    /** Manage Whatsapp phone numbers */
    override fun profile(): ProfileService = profile

    override fun list(
        params: PhoneNumberListParams,
        requestOptions: RequestOptions,
    ): PhoneNumberListPage =
        // get /v2/whatsapp/phone_numbers
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: PhoneNumberDeleteParams, requestOptions: RequestOptions) {
        // delete /v2/whatsapp/phone_numbers/{phone_number}
        withRawResponse().delete(params, requestOptions)
    }

    override fun resendVerification(
        params: PhoneNumberResendVerificationParams,
        requestOptions: RequestOptions,
    ) {
        // post /v2/whatsapp/phone_numbers/{phone_number}/resend_verification
        withRawResponse().resendVerification(params, requestOptions)
    }

    override fun verify(params: PhoneNumberVerifyParams, requestOptions: RequestOptions) {
        // post /v2/whatsapp/phone_numbers/{phone_number}/verify
        withRawResponse().verify(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PhoneNumberService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val callingSettings: CallingSettingService.WithRawResponse by lazy {
            CallingSettingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val profile: ProfileService.WithRawResponse by lazy {
            ProfileServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PhoneNumberService.WithRawResponse =
            PhoneNumberServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Manage Whatsapp phone numbers */
        override fun callingSettings(): CallingSettingService.WithRawResponse = callingSettings

        /** Manage Whatsapp phone numbers */
        override fun profile(): ProfileService.WithRawResponse = profile

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
                    .addPathSegments("v2", "whatsapp", "phone_numbers")
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: PhoneNumberDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("phoneNumber", params.phoneNumber().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "whatsapp", "phone_numbers", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val resendVerificationHandler: Handler<Void?> = emptyHandler()

        override fun resendVerification(
            params: PhoneNumberResendVerificationParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("phoneNumber", params.phoneNumber().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v2",
                        "whatsapp",
                        "phone_numbers",
                        params._pathParam(0),
                        "resend_verification",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { resendVerificationHandler.handle(it) }
            }
        }

        private val verifyHandler: Handler<Void?> = emptyHandler()

        override fun verify(
            params: PhoneNumberVerifyParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("phoneNumber", params.phoneNumber().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v2",
                        "whatsapp",
                        "phone_numbers",
                        params._pathParam(0),
                        "verify",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { verifyHandler.handle(it) }
            }
        }
    }
}
