// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.enterprises

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
import com.telnyx.sdk.models.enterprises.dir.DirCreateParams
import com.telnyx.sdk.models.enterprises.dir.DirCreateResponse
import com.telnyx.sdk.models.enterprises.dir.DirListPageAsync
import com.telnyx.sdk.models.enterprises.dir.DirListPageResponse
import com.telnyx.sdk.models.enterprises.dir.DirListParams
import com.telnyx.sdk.services.async.enterprises.dir.CommentServiceAsync
import com.telnyx.sdk.services.async.enterprises.dir.CommentServiceAsyncImpl
import com.telnyx.sdk.services.async.enterprises.dir.PhoneNumberBatchServiceAsync
import com.telnyx.sdk.services.async.enterprises.dir.PhoneNumberBatchServiceAsyncImpl
import com.telnyx.sdk.services.async.enterprises.dir.PhoneNumberServiceAsync
import com.telnyx.sdk.services.async.enterprises.dir.PhoneNumberServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * A Display Identity Record (DIR) is the verified calling identity (display name, logo, call
 * reasons) shown to recipients on outbound calls.
 */
class DirServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DirServiceAsync {

    private val withRawResponse: DirServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val comments: CommentServiceAsync by lazy { CommentServiceAsyncImpl(clientOptions) }

    private val phoneNumberBatches: PhoneNumberBatchServiceAsync by lazy {
        PhoneNumberBatchServiceAsyncImpl(clientOptions)
    }

    private val phoneNumbers: PhoneNumberServiceAsync by lazy {
        PhoneNumberServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): DirServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DirServiceAsync =
        DirServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun comments(): CommentServiceAsync = comments

    override fun phoneNumberBatches(): PhoneNumberBatchServiceAsync = phoneNumberBatches

    override fun phoneNumbers(): PhoneNumberServiceAsync = phoneNumbers

    override fun create(
        params: DirCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DirCreateResponse> =
        // post /enterprises/{enterprise_id}/dir
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: DirListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DirListPageAsync> =
        // get /enterprises/{enterprise_id}/dir
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DirServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val comments: CommentServiceAsync.WithRawResponse by lazy {
            CommentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val phoneNumberBatches: PhoneNumberBatchServiceAsync.WithRawResponse by lazy {
            PhoneNumberBatchServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val phoneNumbers: PhoneNumberServiceAsync.WithRawResponse by lazy {
            PhoneNumberServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DirServiceAsync.WithRawResponse =
            DirServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun comments(): CommentServiceAsync.WithRawResponse = comments

        override fun phoneNumberBatches(): PhoneNumberBatchServiceAsync.WithRawResponse =
            phoneNumberBatches

        override fun phoneNumbers(): PhoneNumberServiceAsync.WithRawResponse = phoneNumbers

        private val createHandler: Handler<DirCreateResponse> =
            jsonHandler<DirCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: DirCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DirCreateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("enterpriseId", params.enterpriseId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("enterprises", params._pathParam(0), "dir")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<DirListPageResponse> =
            jsonHandler<DirListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: DirListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DirListPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("enterpriseId", params.enterpriseId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("enterprises", params._pathParam(0), "dir")
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
                                DirListPageAsync.builder()
                                    .service(DirServiceAsyncImpl(clientOptions))
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
