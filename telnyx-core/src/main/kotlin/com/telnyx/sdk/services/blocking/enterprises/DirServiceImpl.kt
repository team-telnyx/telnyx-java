// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.enterprises

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
import com.telnyx.sdk.models.dir.DirList
import com.telnyx.sdk.models.dir.DirWrapped
import com.telnyx.sdk.models.enterprises.dir.DirCreateParams
import com.telnyx.sdk.models.enterprises.dir.DirListPage
import com.telnyx.sdk.models.enterprises.dir.DirListParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * A Display Identity Record (DIR) is the verified calling identity (display name, logo, call
 * reasons) shown to recipients on outbound calls.
 */
class DirServiceImpl internal constructor(private val clientOptions: ClientOptions) : DirService {

    private val withRawResponse: DirService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DirService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DirService =
        DirServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: DirCreateParams, requestOptions: RequestOptions): DirWrapped =
        // post /enterprises/{enterprise_id}/dir
        withRawResponse().create(params, requestOptions).parse()

    override fun list(params: DirListParams, requestOptions: RequestOptions): DirListPage =
        // get /enterprises/{enterprise_id}/dir
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DirService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DirService.WithRawResponse =
            DirServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<DirWrapped> =
            jsonHandler<DirWrapped>(clientOptions.jsonMapper)

        override fun create(
            params: DirCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DirWrapped> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<DirList> = jsonHandler<DirList>(clientOptions.jsonMapper)

        override fun list(
            params: DirListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DirListPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("enterpriseId", params.enterpriseId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("enterprises", params._pathParam(0), "dir")
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
    }
}
