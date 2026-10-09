// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.whatsapp.phonenumbers

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.checkRequired
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
import com.telnyx.sdk.models.whatsapp.phonenumbers.callingrouting.CallingRoutingListParams
import com.telnyx.sdk.models.whatsapp.phonenumbers.callingrouting.CallingRoutingListResponse
import com.telnyx.sdk.models.whatsapp.phonenumbers.callingrouting.CallingRoutingPatchAllParams
import com.telnyx.sdk.models.whatsapp.phonenumbers.callingrouting.CallingRoutingPatchAllResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Manage Whatsapp phone numbers */
class CallingRoutingServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : CallingRoutingServiceAsync {

    private val withRawResponse: CallingRoutingServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CallingRoutingServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): CallingRoutingServiceAsync =
        CallingRoutingServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: CallingRoutingListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CallingRoutingListResponse> =
        // get /whatsapp/phone_numbers/{id}/calling_routing
        withRawResponse().list(params, requestOptions).mapCancellable { it.parse() }

    override fun patchAll(
        params: CallingRoutingPatchAllParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CallingRoutingPatchAllResponse> =
        // patch /whatsapp/phone_numbers/{id}/calling_routing
        withRawResponse().patchAll(params, requestOptions).mapCancellable { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CallingRoutingServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CallingRoutingServiceAsync.WithRawResponse =
            CallingRoutingServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<CallingRoutingListResponse> =
            jsonHandler<CallingRoutingListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CallingRoutingListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CallingRoutingListResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "whatsapp",
                        "phone_numbers",
                        params._pathParam(0),
                        "calling_routing",
                    )
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

        private val patchAllHandler: Handler<CallingRoutingPatchAllResponse> =
            jsonHandler<CallingRoutingPatchAllResponse>(clientOptions.jsonMapper)

        override fun patchAll(
            params: CallingRoutingPatchAllParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CallingRoutingPatchAllResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "whatsapp",
                        "phone_numbers",
                        params._pathParam(0),
                        "calling_routing",
                    )
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
