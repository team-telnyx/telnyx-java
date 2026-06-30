// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.dir

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
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.dir.references.ReferenceListParams
import com.telnyx.sdk.models.dir.references.ReferenceListResponse
import com.telnyx.sdk.models.dir.references.ReferenceSubmitParams
import com.telnyx.sdk.models.dir.references.ReferenceSubmitResponse
import com.telnyx.sdk.models.dir.references.ReferenceUpdateParams
import com.telnyx.sdk.models.dir.references.ReferenceUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * Submit and manage the two business references and one financial reference that vouch for a DIR.
 * References are contacted to confirm the business identity during vetting.
 */
class ReferenceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ReferenceService {

    private val withRawResponse: ReferenceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ReferenceService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReferenceService =
        ReferenceServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun update(
        params: ReferenceUpdateParams,
        requestOptions: RequestOptions,
    ): ReferenceUpdateResponse =
        // patch /dir/{dir_id}/references/{ref_type}/{slot}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: ReferenceListParams,
        requestOptions: RequestOptions,
    ): ReferenceListResponse =
        // get /dir/{dir_id}/references
        withRawResponse().list(params, requestOptions).parse()

    override fun submit(
        params: ReferenceSubmitParams,
        requestOptions: RequestOptions,
    ): ReferenceSubmitResponse =
        // post /dir/{dir_id}/references
        withRawResponse().submit(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ReferenceService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ReferenceService.WithRawResponse =
            ReferenceServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val updateHandler: Handler<ReferenceUpdateResponse> =
            jsonHandler<ReferenceUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: ReferenceUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ReferenceUpdateResponse> {
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

        private val listHandler: Handler<ReferenceListResponse> =
            jsonHandler<ReferenceListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ReferenceListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ReferenceListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("dirId", params.dirId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("dir", params._pathParam(0), "references")
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
            }
        }

        private val submitHandler: Handler<ReferenceSubmitResponse> =
            jsonHandler<ReferenceSubmitResponse>(clientOptions.jsonMapper)

        override fun submit(
            params: ReferenceSubmitParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ReferenceSubmitResponse> {
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
    }
}
