// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.composeCancellableAsync
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
import com.telnyx.sdk.core.mapCancellable
import com.telnyx.sdk.core.ownResponse
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.userprofile.UserProfileListParams
import com.telnyx.sdk.models.userprofile.UserProfileListResponse
import com.telnyx.sdk.models.userprofile.UserProfilePatchAllParams
import com.telnyx.sdk.models.userprofile.UserProfilePatchAllResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Read and update the authenticated user's profile and data locality. */
class UserProfileServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    UserProfileServiceAsync {

    private val withRawResponse: UserProfileServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UserProfileServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserProfileServiceAsync =
        UserProfileServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: UserProfileListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UserProfileListResponse> =
        // get /user_profile
        withRawResponse().list(params, requestOptions).mapCancellable { it.parse() }

    override fun patchAll(
        params: UserProfilePatchAllParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UserProfilePatchAllResponse> =
        // patch /user_profile
        withRawResponse().patchAll(params, requestOptions).mapCancellable { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UserProfileServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UserProfileServiceAsync.WithRawResponse =
            UserProfileServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<UserProfileListResponse> =
            jsonHandler<UserProfileListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: UserProfileListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UserProfileListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("user_profile")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .composeCancellableAsync {
                    clientOptions.httpClient.executeAsync(it, requestOptions).ownResponse()
                }
                .mapCancellable { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val patchAllHandler: Handler<UserProfilePatchAllResponse> =
            jsonHandler<UserProfilePatchAllResponse>(clientOptions.jsonMapper)

        override fun patchAll(
            params: UserProfilePatchAllParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UserProfilePatchAllResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("user_profile")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .composeCancellableAsync {
                    clientOptions.httpClient.executeAsync(it, requestOptions).ownResponse()
                }
                .mapCancellable { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { patchAllHandler.handle(it) }
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
