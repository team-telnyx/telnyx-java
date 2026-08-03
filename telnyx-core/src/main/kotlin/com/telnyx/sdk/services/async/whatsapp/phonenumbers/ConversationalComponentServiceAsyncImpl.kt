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
import com.telnyx.sdk.models.whatsapp.phonenumbers.conversationalcomponents.ConversationalComponentListParams
import com.telnyx.sdk.models.whatsapp.phonenumbers.conversationalcomponents.ConversationalComponentListResponse
import com.telnyx.sdk.models.whatsapp.phonenumbers.conversationalcomponents.ConversationalComponentPatchAllParams
import com.telnyx.sdk.models.whatsapp.phonenumbers.conversationalcomponents.ConversationalComponentPatchAllResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Manage Whatsapp phone numbers */
class ConversationalComponentServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    ConversationalComponentServiceAsync {

    private val withRawResponse: ConversationalComponentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ConversationalComponentServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): ConversationalComponentServiceAsync =
        ConversationalComponentServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun list(
        params: ConversationalComponentListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConversationalComponentListResponse> =
        // get /v2/whatsapp/phone_numbers/{phone_number}/conversational_components
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun patchAll(
        params: ConversationalComponentPatchAllParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConversationalComponentPatchAllResponse> =
        // patch /v2/whatsapp/phone_numbers/{phone_number}/conversational_components
        withRawResponse().patchAll(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ConversationalComponentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConversationalComponentServiceAsync.WithRawResponse =
            ConversationalComponentServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<ConversationalComponentListResponse> =
            jsonHandler<ConversationalComponentListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ConversationalComponentListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConversationalComponentListResponse>> {
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
                        "conversational_components",
                    )
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
                    }
                }
        }

        private val patchAllHandler: Handler<ConversationalComponentPatchAllResponse> =
            jsonHandler<ConversationalComponentPatchAllResponse>(clientOptions.jsonMapper)

        override fun patchAll(
            params: ConversationalComponentPatchAllParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConversationalComponentPatchAllResponse>> {
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
                        "conversational_components",
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
