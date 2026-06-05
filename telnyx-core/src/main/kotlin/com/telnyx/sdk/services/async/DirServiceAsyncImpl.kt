// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

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
import com.telnyx.sdk.models.dir.DirDeleteParams
import com.telnyx.sdk.models.dir.DirListDocumentTypesParams
import com.telnyx.sdk.models.dir.DirListDocumentTypesResponse
import com.telnyx.sdk.models.dir.DirListInfringementClaimsPageAsync
import com.telnyx.sdk.models.dir.DirListInfringementClaimsPageResponse
import com.telnyx.sdk.models.dir.DirListInfringementClaimsParams
import com.telnyx.sdk.models.dir.DirListPageAsync
import com.telnyx.sdk.models.dir.DirListPageResponse
import com.telnyx.sdk.models.dir.DirListParams
import com.telnyx.sdk.models.dir.DirRetrieveParams
import com.telnyx.sdk.models.dir.DirRetrieveResponse
import com.telnyx.sdk.models.dir.DirSubmitParams
import com.telnyx.sdk.models.dir.DirSubmitResponse
import com.telnyx.sdk.models.dir.DirUpdateInfringementParams
import com.telnyx.sdk.models.dir.DirUpdateInfringementResponse
import com.telnyx.sdk.models.dir.DirUpdateParams
import com.telnyx.sdk.models.dir.DirUpdateResponse
import com.telnyx.sdk.services.async.dir.CommentServiceAsync
import com.telnyx.sdk.services.async.dir.CommentServiceAsyncImpl
import com.telnyx.sdk.services.async.dir.PhoneNumberBatchServiceAsync
import com.telnyx.sdk.services.async.dir.PhoneNumberBatchServiceAsyncImpl
import com.telnyx.sdk.services.async.dir.PhoneNumberServiceAsync
import com.telnyx.sdk.services.async.dir.PhoneNumberServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

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

    /** Read messages from the Telnyx vetting team and reply with clarifying information. */
    override fun comments(): CommentServiceAsync = comments

    /**
     * Phone numbers are submitted to Telnyx for vetting in batches. Batches group all numbers added
     * in a single request under the same Letter of Authorization.
     */
    override fun phoneNumberBatches(): PhoneNumberBatchServiceAsync = phoneNumberBatches

    /**
     * Associate phone numbers with a verified DIR so calls from those numbers carry the DIR's
     * display identity.
     */
    override fun phoneNumbers(): PhoneNumberServiceAsync = phoneNumbers

    override fun retrieve(
        params: DirRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DirRetrieveResponse> =
        // get /dir/{dir_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: DirUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DirUpdateResponse> =
        // patch /dir/{dir_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: DirListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DirListPageAsync> =
        // get /dir
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: DirDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /dir/{dir_id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun listDocumentTypes(
        params: DirListDocumentTypesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DirListDocumentTypesResponse> =
        // get /dir/document_types
        withRawResponse().listDocumentTypes(params, requestOptions).thenApply { it.parse() }

    override fun listInfringementClaims(
        params: DirListInfringementClaimsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DirListInfringementClaimsPageAsync> =
        // get /dir/{dir_id}/infringement_claims
        withRawResponse().listInfringementClaims(params, requestOptions).thenApply { it.parse() }

    override fun submit(
        params: DirSubmitParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DirSubmitResponse> =
        // post /dir/{dir_id}/submit
        withRawResponse().submit(params, requestOptions).thenApply { it.parse() }

    override fun updateInfringement(
        params: DirUpdateInfringementParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DirUpdateInfringementResponse> =
        // put /dir/{dir_id}/infringement_update
        withRawResponse().updateInfringement(params, requestOptions).thenApply { it.parse() }

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

        /** Read messages from the Telnyx vetting team and reply with clarifying information. */
        override fun comments(): CommentServiceAsync.WithRawResponse = comments

        /**
         * Phone numbers are submitted to Telnyx for vetting in batches. Batches group all numbers
         * added in a single request under the same Letter of Authorization.
         */
        override fun phoneNumberBatches(): PhoneNumberBatchServiceAsync.WithRawResponse =
            phoneNumberBatches

        /**
         * Associate phone numbers with a verified DIR so calls from those numbers carry the DIR's
         * display identity.
         */
        override fun phoneNumbers(): PhoneNumberServiceAsync.WithRawResponse = phoneNumbers

        private val retrieveHandler: Handler<DirRetrieveResponse> =
            jsonHandler<DirRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: DirRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DirRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("dirId", params.dirId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("dir", params._pathParam(0))
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

        private val updateHandler: Handler<DirUpdateResponse> =
            jsonHandler<DirUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: DirUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DirUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("dirId", params.dirId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("dir", params._pathParam(0))
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

        private val listHandler: Handler<DirListPageResponse> =
            jsonHandler<DirListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: DirListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DirListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("dir")
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: DirDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("dirId", params.dirId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("dir", params._pathParam(0))
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

        private val listDocumentTypesHandler: Handler<DirListDocumentTypesResponse> =
            jsonHandler<DirListDocumentTypesResponse>(clientOptions.jsonMapper)

        override fun listDocumentTypes(
            params: DirListDocumentTypesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DirListDocumentTypesResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("dir", "document_types")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listDocumentTypesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listInfringementClaimsHandler: Handler<DirListInfringementClaimsPageResponse> =
            jsonHandler<DirListInfringementClaimsPageResponse>(clientOptions.jsonMapper)

        override fun listInfringementClaims(
            params: DirListInfringementClaimsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DirListInfringementClaimsPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("dirId", params.dirId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("dir", params._pathParam(0), "infringement_claims")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listInfringementClaimsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                DirListInfringementClaimsPageAsync.builder()
                                    .service(DirServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val submitHandler: Handler<DirSubmitResponse> =
            jsonHandler<DirSubmitResponse>(clientOptions.jsonMapper)

        override fun submit(
            params: DirSubmitParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DirSubmitResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("dirId", params.dirId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("dir", params._pathParam(0), "submit")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
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

        private val updateInfringementHandler: Handler<DirUpdateInfringementResponse> =
            jsonHandler<DirUpdateInfringementResponse>(clientOptions.jsonMapper)

        override fun updateInfringement(
            params: DirUpdateInfringementParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DirUpdateInfringementResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("dirId", params.dirId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("dir", params._pathParam(0), "infringement_update")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateInfringementHandler.handle(it) }
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
