// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.dir

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
import com.telnyx.sdk.models.dir.references.ReferenceListParams
import com.telnyx.sdk.models.dir.references.ReferenceListResponse
import com.telnyx.sdk.models.dir.references.ReferenceSubmitParams
import com.telnyx.sdk.models.dir.references.ReferenceSubmitResponse
import com.telnyx.sdk.models.dir.references.ReferenceUpdateParams
import com.telnyx.sdk.models.dir.references.ReferenceUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * Submit and manage the two business references and one financial reference that vouch for a DIR.
 * References are contacted to confirm the business identity during vetting.
 */
class ReferenceServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ReferenceServiceAsync {

    private val withRawResponse: ReferenceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ReferenceServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReferenceServiceAsync =
        ReferenceServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun update(
        params: ReferenceUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ReferenceUpdateResponse> =
        // patch /dir/{dir_id}/references/{ref_type}/{slot}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: ReferenceListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ReferenceListResponse> =
        // get /dir/{dir_id}/references
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun submit(
        params: ReferenceSubmitParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ReferenceSubmitResponse> =
        // post /dir/{dir_id}/references
        withRawResponse().submit(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ReferenceServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ReferenceServiceAsync.WithRawResponse =
            ReferenceServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val updateHandler: Handler<ReferenceUpdateResponse> =
            jsonHandler<ReferenceUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: ReferenceUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ReferenceUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("slot", params.slot().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "dir",
                        params._pathParam(0),
                        "references",
                        params._pathParam(1),
                        params._pathParam(2),
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

        private val listHandler: Handler<ReferenceListResponse> =
            jsonHandler<ReferenceListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ReferenceListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ReferenceListResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("dirId", params.dirId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("dir", params._pathParam(0), "references")
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

        private val submitHandler: Handler<ReferenceSubmitResponse> =
            jsonHandler<ReferenceSubmitResponse>(clientOptions.jsonMapper)

        override fun submit(
            params: ReferenceSubmitParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ReferenceSubmitResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("dirId", params.dirId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("dir", params._pathParam(0), "references")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { submitHandler.handle(it) }
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
