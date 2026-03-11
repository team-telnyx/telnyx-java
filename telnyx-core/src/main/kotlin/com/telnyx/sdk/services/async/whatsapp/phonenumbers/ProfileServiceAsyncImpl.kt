// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.whatsapp.phonenumbers

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
import com.telnyx.sdk.models.whatsapp.phonenumbers.profile.ProfileRetrieveParams
import com.telnyx.sdk.models.whatsapp.phonenumbers.profile.ProfileRetrieveResponse
import com.telnyx.sdk.models.whatsapp.phonenumbers.profile.ProfileUpdateParams
import com.telnyx.sdk.models.whatsapp.phonenumbers.profile.ProfileUpdateResponse
import com.telnyx.sdk.services.async.whatsapp.phonenumbers.profile.PhotoServiceAsync
import com.telnyx.sdk.services.async.whatsapp.phonenumbers.profile.PhotoServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Manage Whatsapp phone numbers */
class ProfileServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ProfileServiceAsync {

    private val withRawResponse: ProfileServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val photo: PhotoServiceAsync by lazy { PhotoServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ProfileServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProfileServiceAsync =
        ProfileServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Manage Whatsapp phone numbers */
    override fun photo(): PhotoServiceAsync = photo

    override fun retrieve(
        params: ProfileRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProfileRetrieveResponse> =
        // get /v2/whatsapp/phone_numbers/{phone_number}/profile
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: ProfileUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProfileUpdateResponse> =
        // patch /v2/whatsapp/phone_numbers/{phone_number}/profile
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ProfileServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val photo: PhotoServiceAsync.WithRawResponse by lazy {
            PhotoServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ProfileServiceAsync.WithRawResponse =
            ProfileServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Manage Whatsapp phone numbers */
        override fun photo(): PhotoServiceAsync.WithRawResponse = photo

        private val retrieveHandler: Handler<ProfileRetrieveResponse> =
            jsonHandler<ProfileRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ProfileRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProfileRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("phoneNumber", params.phoneNumber().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v2",
                        "whatsapp",
                        "phone_numbers",
                        params._pathParam(0),
                        "profile",
                    )
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

        private val updateHandler: Handler<ProfileUpdateResponse> =
            jsonHandler<ProfileUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: ProfileUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProfileUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("phoneNumber", params.phoneNumber().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v2",
                        "whatsapp",
                        "phone_numbers",
                        params._pathParam(0),
                        "profile",
                    )
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
    }
}
