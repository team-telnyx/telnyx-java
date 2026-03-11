// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.whatsapp

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
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.whatsapp.businessaccounts.BusinessAccountDeleteParams
import com.telnyx.sdk.models.whatsapp.businessaccounts.BusinessAccountListPageAsync
import com.telnyx.sdk.models.whatsapp.businessaccounts.BusinessAccountListPageResponse
import com.telnyx.sdk.models.whatsapp.businessaccounts.BusinessAccountListParams
import com.telnyx.sdk.models.whatsapp.businessaccounts.BusinessAccountRetrieveParams
import com.telnyx.sdk.models.whatsapp.businessaccounts.BusinessAccountRetrieveResponse
import com.telnyx.sdk.services.async.whatsapp.businessaccounts.PhoneNumberServiceAsync
import com.telnyx.sdk.services.async.whatsapp.businessaccounts.PhoneNumberServiceAsyncImpl
import com.telnyx.sdk.services.async.whatsapp.businessaccounts.SettingServiceAsync
import com.telnyx.sdk.services.async.whatsapp.businessaccounts.SettingServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Manage Whatsapp business accounts */
class BusinessAccountServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : BusinessAccountServiceAsync {

    private val withRawResponse: BusinessAccountServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val phoneNumbers: PhoneNumberServiceAsync by lazy {
        PhoneNumberServiceAsyncImpl(clientOptions)
    }

    private val settings: SettingServiceAsync by lazy { SettingServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): BusinessAccountServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): BusinessAccountServiceAsync =
        BusinessAccountServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun phoneNumbers(): PhoneNumberServiceAsync = phoneNumbers

    /** Manage Whatsapp business accounts */
    override fun settings(): SettingServiceAsync = settings

    override fun retrieve(
        params: BusinessAccountRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BusinessAccountRetrieveResponse> =
        // get /v2/whatsapp/business_accounts/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: BusinessAccountListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BusinessAccountListPageAsync> =
        // get /v2/whatsapp/business_accounts
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: BusinessAccountDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /v2/whatsapp/business_accounts/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BusinessAccountServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val phoneNumbers: PhoneNumberServiceAsync.WithRawResponse by lazy {
            PhoneNumberServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val settings: SettingServiceAsync.WithRawResponse by lazy {
            SettingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BusinessAccountServiceAsync.WithRawResponse =
            BusinessAccountServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun phoneNumbers(): PhoneNumberServiceAsync.WithRawResponse = phoneNumbers

        /** Manage Whatsapp business accounts */
        override fun settings(): SettingServiceAsync.WithRawResponse = settings

        private val retrieveHandler: Handler<BusinessAccountRetrieveResponse> =
            jsonHandler<BusinessAccountRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: BusinessAccountRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BusinessAccountRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "whatsapp", "business_accounts", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val listHandler: Handler<BusinessAccountListPageResponse> =
            jsonHandler<BusinessAccountListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: BusinessAccountListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BusinessAccountListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "whatsapp", "business_accounts")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                BusinessAccountListPageAsync.builder()
                                    .service(BusinessAccountServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: BusinessAccountDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "whatsapp", "business_accounts", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }
    }
}
