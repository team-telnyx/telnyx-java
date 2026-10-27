// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.email.dedicatedips

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
import com.telnyx.sdk.models.email.dedicatedips.DedicatedIpShowResponse
import com.telnyx.sdk.models.email.dedicatedips.actions.ActionCompleteWarmupParams
import com.telnyx.sdk.models.email.dedicatedips.actions.ActionPauseWarmupParams
import com.telnyx.sdk.models.email.dedicatedips.actions.ActionResumeWarmupParams
import com.telnyx.sdk.models.email.dedicatedips.actions.ActionStartWarmupParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Purchase and manage dedicated sending IP addresses for your Telnyx email traffic. */
class ActionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ActionServiceAsync {

    private val withRawResponse: ActionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ActionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionServiceAsync =
        ActionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun completeWarmup(
        params: ActionCompleteWarmupParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DedicatedIpShowResponse> =
        // post /email/dedicated_ips/{id}/actions/complete_warmup
        withRawResponse().completeWarmup(params, requestOptions).mapCancellable { it.parse() }

    override fun pauseWarmup(
        params: ActionPauseWarmupParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DedicatedIpShowResponse> =
        // post /email/dedicated_ips/{id}/actions/pause_warmup
        withRawResponse().pauseWarmup(params, requestOptions).mapCancellable { it.parse() }

    override fun resumeWarmup(
        params: ActionResumeWarmupParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DedicatedIpShowResponse> =
        // post /email/dedicated_ips/{id}/actions/resume_warmup
        withRawResponse().resumeWarmup(params, requestOptions).mapCancellable { it.parse() }

    override fun startWarmup(
        params: ActionStartWarmupParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DedicatedIpShowResponse> =
        // post /email/dedicated_ips/{id}/actions/start_warmup
        withRawResponse().startWarmup(params, requestOptions).mapCancellable { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ActionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ActionServiceAsync.WithRawResponse =
            ActionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val completeWarmupHandler: Handler<DedicatedIpShowResponse> =
            jsonHandler<DedicatedIpShowResponse>(clientOptions.jsonMapper)

        override fun completeWarmup(
            params: ActionCompleteWarmupParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DedicatedIpShowResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "email",
                        "dedicated_ips",
                        params._pathParam(0),
                        "actions",
                        "complete_warmup",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
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
                            .use { completeWarmupHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val pauseWarmupHandler: Handler<DedicatedIpShowResponse> =
            jsonHandler<DedicatedIpShowResponse>(clientOptions.jsonMapper)

        override fun pauseWarmup(
            params: ActionPauseWarmupParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DedicatedIpShowResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "email",
                        "dedicated_ips",
                        params._pathParam(0),
                        "actions",
                        "pause_warmup",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
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
                            .use { pauseWarmupHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val resumeWarmupHandler: Handler<DedicatedIpShowResponse> =
            jsonHandler<DedicatedIpShowResponse>(clientOptions.jsonMapper)

        override fun resumeWarmup(
            params: ActionResumeWarmupParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DedicatedIpShowResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "email",
                        "dedicated_ips",
                        params._pathParam(0),
                        "actions",
                        "resume_warmup",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
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
                            .use { resumeWarmupHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val startWarmupHandler: Handler<DedicatedIpShowResponse> =
            jsonHandler<DedicatedIpShowResponse>(clientOptions.jsonMapper)

        override fun startWarmup(
            params: ActionStartWarmupParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DedicatedIpShowResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "email",
                        "dedicated_ips",
                        params._pathParam(0),
                        "actions",
                        "start_warmup",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
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
                            .use { startWarmupHandler.handle(it) }
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
