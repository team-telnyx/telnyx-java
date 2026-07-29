// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.emailblocks

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
import com.telnyx.sdk.core.http.multipartFormData
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.emailblocks.import_.EmailBlockImportResponse
import com.telnyx.sdk.models.emailblocks.import_.ImportCreateParams
import com.telnyx.sdk.models.emailblocks.import_.ImportRetrieveParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Async CSV import of competitor suppression lists. */
class ImportServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ImportService {

    private val withRawResponse: ImportService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ImportService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ImportService =
        ImportServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: ImportCreateParams,
        requestOptions: RequestOptions,
    ): EmailBlockImportResponse =
        // post /email_blocks/import
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: ImportRetrieveParams,
        requestOptions: RequestOptions,
    ): EmailBlockImportResponse =
        // get /email_blocks/import/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ImportService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ImportService.WithRawResponse =
            ImportServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<EmailBlockImportResponse> =
            jsonHandler<EmailBlockImportResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ImportCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailBlockImportResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_blocks", "import")
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
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

        private val retrieveHandler: Handler<EmailBlockImportResponse> =
            jsonHandler<EmailBlockImportResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ImportRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailBlockImportResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_blocks", "import", params._pathParam(0))
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
    }
}
