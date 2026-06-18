// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

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
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.dir.DirCreateLoaParams
import com.telnyx.sdk.models.dir.DirDeleteParams
import com.telnyx.sdk.models.dir.DirListDocumentTypesParams
import com.telnyx.sdk.models.dir.DirListDocumentTypesResponse
import com.telnyx.sdk.models.dir.DirListInfringementClaimsPage
import com.telnyx.sdk.models.dir.DirListInfringementClaimsPageResponse
import com.telnyx.sdk.models.dir.DirListInfringementClaimsParams
import com.telnyx.sdk.models.dir.DirListPage
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
import com.telnyx.sdk.services.blocking.dir.CommentService
import com.telnyx.sdk.services.blocking.dir.CommentServiceImpl
import com.telnyx.sdk.services.blocking.dir.PhoneNumberBatchService
import com.telnyx.sdk.services.blocking.dir.PhoneNumberBatchServiceImpl
import com.telnyx.sdk.services.blocking.dir.PhoneNumberService
import com.telnyx.sdk.services.blocking.dir.PhoneNumberServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class DirServiceImpl internal constructor(private val clientOptions: ClientOptions) : DirService {

    private val withRawResponse: DirService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val comments: CommentService by lazy { CommentServiceImpl(clientOptions) }

    private val phoneNumberBatches: PhoneNumberBatchService by lazy {
        PhoneNumberBatchServiceImpl(clientOptions)
    }

    private val phoneNumbers: PhoneNumberService by lazy { PhoneNumberServiceImpl(clientOptions) }

    override fun withRawResponse(): DirService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DirService =
        DirServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Read messages from the Telnyx vetting team and reply with clarifying information. */
    override fun comments(): CommentService = comments

    /**
     * Phone numbers are submitted to Telnyx for vetting in batches. Batches group all numbers added
     * in a single request under the same Letter of Authorization.
     */
    override fun phoneNumberBatches(): PhoneNumberBatchService = phoneNumberBatches

    /**
     * Associate phone numbers with a verified DIR so calls from those numbers carry the DIR's
     * display identity.
     */
    override fun phoneNumbers(): PhoneNumberService = phoneNumbers

    override fun retrieve(
        params: DirRetrieveParams,
        requestOptions: RequestOptions,
    ): DirRetrieveResponse =
        // get /dir/{dir_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: DirUpdateParams,
        requestOptions: RequestOptions,
    ): DirUpdateResponse =
        // patch /dir/{dir_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: DirListParams, requestOptions: RequestOptions): DirListPage =
        // get /dir
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: DirDeleteParams, requestOptions: RequestOptions) {
        // delete /dir/{dir_id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun createLoa(
        params: DirCreateLoaParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // post /dir/{dir_id}/loa
        withRawResponse().createLoa(params, requestOptions)

    override fun listDocumentTypes(
        params: DirListDocumentTypesParams,
        requestOptions: RequestOptions,
    ): DirListDocumentTypesResponse =
        // get /dir/document_types
        withRawResponse().listDocumentTypes(params, requestOptions).parse()

    override fun listInfringementClaims(
        params: DirListInfringementClaimsParams,
        requestOptions: RequestOptions,
    ): DirListInfringementClaimsPage =
        // get /dir/{dir_id}/infringement_claims
        withRawResponse().listInfringementClaims(params, requestOptions).parse()

    override fun submit(
        params: DirSubmitParams,
        requestOptions: RequestOptions,
    ): DirSubmitResponse =
        // post /dir/{dir_id}/submit
        withRawResponse().submit(params, requestOptions).parse()

    override fun updateInfringement(
        params: DirUpdateInfringementParams,
        requestOptions: RequestOptions,
    ): DirUpdateInfringementResponse =
        // put /dir/{dir_id}/infringement_update
        withRawResponse().updateInfringement(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DirService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val comments: CommentService.WithRawResponse by lazy {
            CommentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val phoneNumberBatches: PhoneNumberBatchService.WithRawResponse by lazy {
            PhoneNumberBatchServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val phoneNumbers: PhoneNumberService.WithRawResponse by lazy {
            PhoneNumberServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DirService.WithRawResponse =
            DirServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Read messages from the Telnyx vetting team and reply with clarifying information. */
        override fun comments(): CommentService.WithRawResponse = comments

        /**
         * Phone numbers are submitted to Telnyx for vetting in batches. Batches group all numbers
         * added in a single request under the same Letter of Authorization.
         */
        override fun phoneNumberBatches(): PhoneNumberBatchService.WithRawResponse =
            phoneNumberBatches

        /**
         * Associate phone numbers with a verified DIR so calls from those numbers carry the DIR's
         * display identity.
         */
        override fun phoneNumbers(): PhoneNumberService.WithRawResponse = phoneNumbers

        private val retrieveHandler: Handler<DirRetrieveResponse> =
            jsonHandler<DirRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: DirRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DirRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("dirId", params.dirId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("dir", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<DirUpdateResponse> =
            jsonHandler<DirUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: DirUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DirUpdateResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<DirListPageResponse> =
            jsonHandler<DirListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: DirListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DirListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("dir")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        DirListPage.builder()
                            .service(DirServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: DirDeleteParams, requestOptions: RequestOptions): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        override fun createLoa(
            params: DirCreateLoaParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("dirId", params.dirId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("dir", params._pathParam(0), "loa")
                    .putHeader("Accept", "application/pdf")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        private val listDocumentTypesHandler: Handler<DirListDocumentTypesResponse> =
            jsonHandler<DirListDocumentTypesResponse>(clientOptions.jsonMapper)

        override fun listDocumentTypes(
            params: DirListDocumentTypesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DirListDocumentTypesResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("dir", "document_types")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listDocumentTypesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listInfringementClaimsHandler: Handler<DirListInfringementClaimsPageResponse> =
            jsonHandler<DirListInfringementClaimsPageResponse>(clientOptions.jsonMapper)

        override fun listInfringementClaims(
            params: DirListInfringementClaimsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DirListInfringementClaimsPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("dirId", params.dirId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("dir", params._pathParam(0), "infringement_claims")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listInfringementClaimsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        DirListInfringementClaimsPage.builder()
                            .service(DirServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val submitHandler: Handler<DirSubmitResponse> =
            jsonHandler<DirSubmitResponse>(clientOptions.jsonMapper)

        override fun submit(
            params: DirSubmitParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DirSubmitResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { submitHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateInfringementHandler: Handler<DirUpdateInfringementResponse> =
            jsonHandler<DirUpdateInfringementResponse>(clientOptions.jsonMapper)

        override fun updateInfringement(
            params: DirUpdateInfringementParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DirUpdateInfringementResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
