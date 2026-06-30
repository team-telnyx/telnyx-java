// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.sessionanalysis

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
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.sessionanalysis.metadata.MetadataRetrieveParams
import com.telnyx.sdk.models.sessionanalysis.metadata.MetadataRetrieveRecordTypeParams
import com.telnyx.sdk.models.sessionanalysis.metadata.MetadataRetrieveRecordTypeResponse
import com.telnyx.sdk.models.sessionanalysis.metadata.MetadataRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Analyze voice AI sessions, costs, and event hierarchies across Telnyx products. */
class MetadataServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MetadataService {

    private val withRawResponse: MetadataService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MetadataService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MetadataService =
        MetadataServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: MetadataRetrieveParams,
        requestOptions: RequestOptions,
    ): MetadataRetrieveResponse =
        // get /session_analysis/metadata
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun retrieveRecordType(
        params: MetadataRetrieveRecordTypeParams,
        requestOptions: RequestOptions,
    ): MetadataRetrieveRecordTypeResponse =
        // get /session_analysis/metadata/{record_type}
        withRawResponse().retrieveRecordType(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MetadataService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MetadataService.WithRawResponse =
            MetadataServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<MetadataRetrieveResponse> =
            jsonHandler<MetadataRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: MetadataRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MetadataRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("session_analysis", "metadata")
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

        private val retrieveRecordTypeHandler: Handler<MetadataRetrieveRecordTypeResponse> =
            jsonHandler<MetadataRetrieveRecordTypeResponse>(clientOptions.jsonMapper)

        override fun retrieveRecordType(
            params: MetadataRetrieveRecordTypeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MetadataRetrieveRecordTypeResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("recordType", params.recordType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("session_analysis", "metadata", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveRecordTypeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
