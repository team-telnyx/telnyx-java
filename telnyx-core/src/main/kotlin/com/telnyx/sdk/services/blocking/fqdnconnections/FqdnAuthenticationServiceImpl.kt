// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.fqdnconnections

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
import com.telnyx.sdk.models.fqdnconnections.fqdnauthentication.FqdnAuthenticationListParams
import com.telnyx.sdk.models.fqdnconnections.fqdnauthentication.FqdnAuthenticationListResponse
import com.telnyx.sdk.models.fqdnconnections.fqdnauthentication.FqdnAuthenticationPatchAllParams
import com.telnyx.sdk.models.fqdnconnections.fqdnauthentication.FqdnAuthenticationPatchAllResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** FQDN connection operations */
class FqdnAuthenticationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    FqdnAuthenticationService {

    private val withRawResponse: FqdnAuthenticationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FqdnAuthenticationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FqdnAuthenticationService =
        FqdnAuthenticationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: FqdnAuthenticationListParams,
        requestOptions: RequestOptions,
    ): FqdnAuthenticationListResponse =
        // get /fqdn_connections/{fqdn_connection_id}/fqdn_authentication
        withRawResponse().list(params, requestOptions).parse()

    override fun patchAll(
        params: FqdnAuthenticationPatchAllParams,
        requestOptions: RequestOptions,
    ): FqdnAuthenticationPatchAllResponse =
        // patch /fqdn_connections/{fqdn_connection_id}/fqdn_authentication
        withRawResponse().patchAll(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FqdnAuthenticationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FqdnAuthenticationService.WithRawResponse =
            FqdnAuthenticationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<FqdnAuthenticationListResponse> =
            jsonHandler<FqdnAuthenticationListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: FqdnAuthenticationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FqdnAuthenticationListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("fqdnConnectionId", params.fqdnConnectionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "fqdn_connections",
                        params._pathParam(0),
                        "fqdn_authentication",
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

        private val patchAllHandler: Handler<FqdnAuthenticationPatchAllResponse> =
            jsonHandler<FqdnAuthenticationPatchAllResponse>(clientOptions.jsonMapper)

        override fun patchAll(
            params: FqdnAuthenticationPatchAllParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FqdnAuthenticationPatchAllResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("fqdnConnectionId", params.fqdnConnectionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "fqdn_connections",
                        params._pathParam(0),
                        "fqdn_authentication",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { patchAllHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
