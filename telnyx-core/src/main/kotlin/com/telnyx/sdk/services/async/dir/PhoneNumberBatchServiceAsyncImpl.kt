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
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.dir.phonenumberbatches.PhoneNumberBatchListPageAsync
import com.telnyx.sdk.models.dir.phonenumberbatches.PhoneNumberBatchListPageResponse
import com.telnyx.sdk.models.dir.phonenumberbatches.PhoneNumberBatchListParams
import com.telnyx.sdk.models.dir.phonenumberbatches.PhoneNumberBatchRetrieveParams
import com.telnyx.sdk.models.dir.phonenumberbatches.PhoneNumberBatchRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * Phone numbers are submitted to Telnyx for vetting in batches. Batches group all numbers added in
 * a single request under the same Letter of Authorization.
 */
class PhoneNumberBatchServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : PhoneNumberBatchServiceAsync {

    private val withRawResponse: PhoneNumberBatchServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PhoneNumberBatchServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): PhoneNumberBatchServiceAsync =
        PhoneNumberBatchServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: PhoneNumberBatchRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhoneNumberBatchRetrieveResponse> =
        // get /dir/{dir_id}/phone_number_batches/{batch_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: PhoneNumberBatchListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhoneNumberBatchListPageAsync> =
        // get /dir/{dir_id}/phone_number_batches
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PhoneNumberBatchServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PhoneNumberBatchServiceAsync.WithRawResponse =
            PhoneNumberBatchServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<PhoneNumberBatchRetrieveResponse> =
            jsonHandler<PhoneNumberBatchRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: PhoneNumberBatchRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PhoneNumberBatchRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("batchId", params.batchId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "dir",
                        params._pathParam(0),
                        "phone_number_batches",
                        params._pathParam(1),
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

        private val listHandler: Handler<PhoneNumberBatchListPageResponse> =
            jsonHandler<PhoneNumberBatchListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: PhoneNumberBatchListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PhoneNumberBatchListPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("dirId", params.dirId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("dir", params._pathParam(0), "phone_number_batches")
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
                                PhoneNumberBatchListPageAsync.builder()
                                    .service(PhoneNumberBatchServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }
    }
}
