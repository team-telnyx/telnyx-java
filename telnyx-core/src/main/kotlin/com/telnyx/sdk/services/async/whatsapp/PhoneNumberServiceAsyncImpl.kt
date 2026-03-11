// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.whatsapp

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
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.whatsapp.phonenumbers.PhoneNumberDeleteParams
import com.telnyx.sdk.models.whatsapp.phonenumbers.PhoneNumberListPageAsync
import com.telnyx.sdk.models.whatsapp.phonenumbers.PhoneNumberListPageResponse
import com.telnyx.sdk.models.whatsapp.phonenumbers.PhoneNumberListParams
import com.telnyx.sdk.models.whatsapp.phonenumbers.PhoneNumberResendVerificationParams
import com.telnyx.sdk.models.whatsapp.phonenumbers.PhoneNumberVerifyParams
import com.telnyx.sdk.services.async.whatsapp.phonenumbers.CallingSettingServiceAsync
import com.telnyx.sdk.services.async.whatsapp.phonenumbers.CallingSettingServiceAsyncImpl
import com.telnyx.sdk.services.async.whatsapp.phonenumbers.ProfileServiceAsync
import com.telnyx.sdk.services.async.whatsapp.phonenumbers.ProfileServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Manage Whatsapp phone numbers */
class PhoneNumberServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PhoneNumberServiceAsync {

    private val withRawResponse: PhoneNumberServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val callingSettings: CallingSettingServiceAsync by lazy {
        CallingSettingServiceAsyncImpl(clientOptions)
    }

    private val profile: ProfileServiceAsync by lazy { ProfileServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): PhoneNumberServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PhoneNumberServiceAsync =
        PhoneNumberServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Manage Whatsapp phone numbers */
    override fun callingSettings(): CallingSettingServiceAsync = callingSettings

    /** Manage Whatsapp phone numbers */
    override fun profile(): ProfileServiceAsync = profile

    override fun list(
        params: PhoneNumberListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhoneNumberListPageAsync> =
        // get /v2/whatsapp/phone_numbers
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: PhoneNumberDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /v2/whatsapp/phone_numbers/{phone_number}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun resendVerification(
        params: PhoneNumberResendVerificationParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /v2/whatsapp/phone_numbers/{phone_number}/resend_verification
        withRawResponse().resendVerification(params, requestOptions).thenAccept {}

    override fun verify(
        params: PhoneNumberVerifyParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /v2/whatsapp/phone_numbers/{phone_number}/verify
        withRawResponse().verify(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PhoneNumberServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val callingSettings: CallingSettingServiceAsync.WithRawResponse by lazy {
            CallingSettingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val profile: ProfileServiceAsync.WithRawResponse by lazy {
            ProfileServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PhoneNumberServiceAsync.WithRawResponse =
            PhoneNumberServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Manage Whatsapp phone numbers */
        override fun callingSettings(): CallingSettingServiceAsync.WithRawResponse = callingSettings

        /** Manage Whatsapp phone numbers */
        override fun profile(): ProfileServiceAsync.WithRawResponse = profile

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
                    .addPathSegments("v2", "whatsapp", "phone_numbers")
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: PhoneNumberDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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

        private val resendVerificationHandler: Handler<Void?> = emptyHandler()

        override fun resendVerification(
            params: PhoneNumberResendVerificationParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { resendVerificationHandler.handle(it) }
                    }
                }
        }

        private val verifyHandler: Handler<Void?> = emptyHandler()

        override fun verify(
            params: PhoneNumberVerifyParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { verifyHandler.handle(it) }
                    }
                }
        }
    }
}
