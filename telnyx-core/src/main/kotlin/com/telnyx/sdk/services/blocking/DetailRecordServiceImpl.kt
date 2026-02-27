// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.handlers.errorBodyHandler
import com.telnyx.sdk.core.handlers.errorHandler
import com.telnyx.sdk.core.handlers.jsonHandler
import com.telnyx.sdk.core.http.HttpMethod
import com.telnyx.sdk.core.http.HttpRequest
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponse.Handler
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.detailrecords.DetailRecordListPage
import com.telnyx.sdk.models.detailrecords.DetailRecordListPageResponse
import com.telnyx.sdk.models.detailrecords.DetailRecordListParams
import java.util.function.Consumer

/** Detail Records operations */
class DetailRecordServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DetailRecordService {

    private val withRawResponse: DetailRecordService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DetailRecordService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DetailRecordService =
        DetailRecordServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: DetailRecordListParams,
        requestOptions: RequestOptions,
    ): DetailRecordListPage =
        // get /detail_records
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DetailRecordService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DetailRecordService.WithRawResponse =
            DetailRecordServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<DetailRecordListPageResponse> =
            jsonHandler<DetailRecordListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: DetailRecordListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DetailRecordListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("detail_records")
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
                        DetailRecordListPage.builder()
                            .service(DetailRecordServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
