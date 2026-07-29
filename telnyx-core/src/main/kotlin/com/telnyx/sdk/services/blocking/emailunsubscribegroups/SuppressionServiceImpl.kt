// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.emailunsubscribegroups

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
import com.telnyx.sdk.models.emailblocks.EmailBlockResponse
import com.telnyx.sdk.models.emailunsubscribegroups.suppressions.SuppressionCreateParams
import com.telnyx.sdk.models.emailunsubscribegroups.suppressions.SuppressionDeleteParams
import com.telnyx.sdk.models.emailunsubscribegroups.suppressions.SuppressionListPage
import com.telnyx.sdk.models.emailunsubscribegroups.suppressions.SuppressionListPageResponse
import com.telnyx.sdk.models.emailunsubscribegroups.suppressions.SuppressionListParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Named groups and group-scoped suppressions. */
class SuppressionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SuppressionService {

    private val withRawResponse: SuppressionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SuppressionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SuppressionService =
        SuppressionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: SuppressionCreateParams,
        requestOptions: RequestOptions,
    ): EmailBlockResponse =
        // post /email_unsubscribe_groups/{id}/suppressions
        withRawResponse().create(params, requestOptions).parse()

    override fun list(
        params: SuppressionListParams,
        requestOptions: RequestOptions,
    ): SuppressionListPage =
        // get /email_unsubscribe_groups/{id}/suppressions
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: SuppressionDeleteParams, requestOptions: RequestOptions) {
        // delete /email_unsubscribe_groups/{id}/suppressions/{email}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SuppressionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SuppressionService.WithRawResponse =
            SuppressionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<EmailBlockResponse> =
            jsonHandler<EmailBlockResponse>(clientOptions.jsonMapper)

        override fun create(
            params: SuppressionCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailBlockResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "email_unsubscribe_groups",
                        params._pathParam(0),
                        "suppressions",
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

        private val listHandler: Handler<SuppressionListPageResponse> =
            jsonHandler<SuppressionListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: SuppressionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SuppressionListPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "email_unsubscribe_groups",
                        params._pathParam(0),
                        "suppressions",
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
                    .let {
                        SuppressionListPage.builder()
                            .service(SuppressionServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: SuppressionDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("email", params.email().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "email_unsubscribe_groups",
                        params._pathParam(0),
                        "suppressions",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }
    }
}
