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
import com.telnyx.sdk.core.http.json
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.useraddresses.UserAddressCreateParams
import com.telnyx.sdk.models.useraddresses.UserAddressCreateResponse
import com.telnyx.sdk.models.useraddresses.UserAddressListPage
import com.telnyx.sdk.models.useraddresses.UserAddressListPageResponse
import com.telnyx.sdk.models.useraddresses.UserAddressListParams
import com.telnyx.sdk.models.useraddresses.UserAddressRetrieveParams
import com.telnyx.sdk.models.useraddresses.UserAddressRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * Operations for working with UserAddress records. UserAddress records are stored addresses that
 * users can use for non-emergency-calling purposes, such as for shipping addresses for orders of
 * wireless SIMs (or other physical items). They cannot be used for emergency calling and are
 * distinct from Address records, which are used on phone numbers.
 */
class UserAddressServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    UserAddressService {

    private val withRawResponse: UserAddressService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UserAddressService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserAddressService =
        UserAddressServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: UserAddressCreateParams,
        requestOptions: RequestOptions,
    ): UserAddressCreateResponse =
        // post /user_addresses
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: UserAddressRetrieveParams,
        requestOptions: RequestOptions,
    ): UserAddressRetrieveResponse =
        // get /user_addresses/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: UserAddressListParams,
        requestOptions: RequestOptions,
    ): UserAddressListPage =
        // get /user_addresses
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UserAddressService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UserAddressService.WithRawResponse =
            UserAddressServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<UserAddressCreateResponse> =
            jsonHandler<UserAddressCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: UserAddressCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserAddressCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("user_addresses")
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

        private val retrieveHandler: Handler<UserAddressRetrieveResponse> =
            jsonHandler<UserAddressRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: UserAddressRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserAddressRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("user_addresses", params._pathParam(0))
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

        private val listHandler: Handler<UserAddressListPageResponse> =
            jsonHandler<UserAddressListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: UserAddressListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserAddressListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("user_addresses")
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
                        UserAddressListPage.builder()
                            .service(UserAddressServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
