// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

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
import com.telnyx.sdk.models.requirements.RequirementListPage
import com.telnyx.sdk.models.requirements.RequirementListPageResponse
import com.telnyx.sdk.models.requirements.RequirementListParams
import com.telnyx.sdk.models.requirements.RequirementRetrieveParams
import com.telnyx.sdk.models.requirements.RequirementRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Requirements for international numbers and porting orders */
class RequirementServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    RequirementService {

    private val withRawResponse: RequirementService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RequirementService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RequirementService =
        RequirementServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: RequirementRetrieveParams,
        requestOptions: RequestOptions,
    ): RequirementRetrieveResponse =
        // get /requirements/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: RequirementListParams,
        requestOptions: RequestOptions,
    ): RequirementListPage =
        // get /requirements
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RequirementService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RequirementService.WithRawResponse =
            RequirementServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<RequirementRetrieveResponse> =
            jsonHandler<RequirementRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: RequirementRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RequirementRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("requirements", params._pathParam(0))
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

        private val listHandler: Handler<RequirementListPageResponse> =
            jsonHandler<RequirementListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: RequirementListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RequirementListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("requirements")
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
                        RequirementListPage.builder()
                            .service(RequirementServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
