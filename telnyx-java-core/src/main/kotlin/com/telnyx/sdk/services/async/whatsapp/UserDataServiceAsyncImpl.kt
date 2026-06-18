// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.whatsapp

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
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
import com.telnyx.sdk.models.whatsapp.userdata.UserDataRetrieveParams
import com.telnyx.sdk.models.whatsapp.userdata.UserDataRetrieveResponse
import com.telnyx.sdk.models.whatsapp.userdata.UserDataUpdateParams
import com.telnyx.sdk.models.whatsapp.userdata.UserDataUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Manage Whatsapp business accounts */
class UserDataServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    UserDataServiceAsync {

    private val withRawResponse: UserDataServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UserDataServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserDataServiceAsync =
        UserDataServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: UserDataRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UserDataRetrieveResponse> =
        // get /v2/whatsapp/user_data
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: UserDataUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UserDataUpdateResponse> =
        // patch /v2/whatsapp/user_data
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UserDataServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UserDataServiceAsync.WithRawResponse =
            UserDataServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<UserDataRetrieveResponse> =
            jsonHandler<UserDataRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: UserDataRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UserDataRetrieveResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "whatsapp", "user_data")
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

        private val updateHandler: Handler<UserDataUpdateResponse> =
            jsonHandler<UserDataUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: UserDataUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UserDataUpdateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "whatsapp", "user_data")
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
