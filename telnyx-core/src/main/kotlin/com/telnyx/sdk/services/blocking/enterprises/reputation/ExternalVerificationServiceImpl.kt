// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.enterprises.reputation

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
import com.telnyx.sdk.models.enterprises.reputation.externalverification.ExternalVerificationCreateParams
import com.telnyx.sdk.models.enterprises.reputation.externalverification.ExternalVerificationListParams
import com.telnyx.sdk.models.enterprises.reputation.externalverification.ExternalVerificationWrapped
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Phone-number reputation monitoring (spam-score lookup and tracking). */
class ExternalVerificationServiceImpl
internal constructor(private val clientOptions: ClientOptions) : ExternalVerificationService {

    private val withRawResponse: ExternalVerificationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ExternalVerificationService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): ExternalVerificationService =
        ExternalVerificationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: ExternalVerificationCreateParams,
        requestOptions: RequestOptions,
    ): ExternalVerificationWrapped =
        // post /enterprises/{enterprise_id}/reputation/external_verification
        withRawResponse().create(params, requestOptions).parse()

    override fun list(
        params: ExternalVerificationListParams,
        requestOptions: RequestOptions,
    ): ExternalVerificationWrapped =
        // get /enterprises/{enterprise_id}/reputation/external_verification
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExternalVerificationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExternalVerificationService.WithRawResponse =
            ExternalVerificationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<ExternalVerificationWrapped> =
            jsonHandler<ExternalVerificationWrapped>(clientOptions.jsonMapper)

        override fun create(
            params: ExternalVerificationCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalVerificationWrapped> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("enterpriseId", params.enterpriseId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "enterprises",
                        params._pathParam(0),
                        "reputation",
                        "external_verification",
                    )
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

        private val listHandler: Handler<ExternalVerificationWrapped> =
            jsonHandler<ExternalVerificationWrapped>(clientOptions.jsonMapper)

        override fun list(
            params: ExternalVerificationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalVerificationWrapped> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("enterpriseId", params.enterpriseId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "enterprises",
                        params._pathParam(0),
                        "reputation",
                        "external_verification",
                    )
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
    }
}
