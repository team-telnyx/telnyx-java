// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.handlers.errorBodyHandler
import com.telnyx.api.core.handlers.errorHandler
import com.telnyx.api.core.handlers.jsonHandler
import com.telnyx.api.core.http.HttpMethod
import com.telnyx.api.core.http.HttpRequest
import com.telnyx.api.core.http.HttpResponse
import com.telnyx.api.core.http.HttpResponse.Handler
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.core.http.json
import com.telnyx.api.core.http.parseable
import com.telnyx.api.core.prepareAsync
import com.telnyx.api.models.phonenumbercampaigns.PhoneNumberCampaign
import com.telnyx.api.models.phonenumbercampaigns.PhoneNumberCampaignCreateParams
import com.telnyx.api.models.phonenumbercampaigns.PhoneNumberCampaignDeleteParams
import com.telnyx.api.models.phonenumbercampaigns.PhoneNumberCampaignListParams
import com.telnyx.api.models.phonenumbercampaigns.PhoneNumberCampaignListResponse
import com.telnyx.api.models.phonenumbercampaigns.PhoneNumberCampaignRetrieveParams
import com.telnyx.api.models.phonenumbercampaigns.PhoneNumberCampaignUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PhoneNumberCampaignServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : PhoneNumberCampaignServiceAsync {

    private val withRawResponse: PhoneNumberCampaignServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PhoneNumberCampaignServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): PhoneNumberCampaignServiceAsync =
        PhoneNumberCampaignServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun create(
        params: PhoneNumberCampaignCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhoneNumberCampaign> =
        // post /phone_number_campaigns
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: PhoneNumberCampaignRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhoneNumberCampaign> =
        // get /phone_number_campaigns/{phoneNumber}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: PhoneNumberCampaignUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhoneNumberCampaign> =
        // put /phone_number_campaigns/{phoneNumber}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: PhoneNumberCampaignListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhoneNumberCampaignListResponse> =
        // get /phone_number_campaigns
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: PhoneNumberCampaignDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhoneNumberCampaign> =
        // delete /phone_number_campaigns/{phoneNumber}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PhoneNumberCampaignServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PhoneNumberCampaignServiceAsync.WithRawResponse =
            PhoneNumberCampaignServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<PhoneNumberCampaign> =
            jsonHandler<PhoneNumberCampaign>(clientOptions.jsonMapper)

        override fun create(
            params: PhoneNumberCampaignCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PhoneNumberCampaign>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("phone_number_campaigns")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<PhoneNumberCampaign> =
            jsonHandler<PhoneNumberCampaign>(clientOptions.jsonMapper)

        override fun retrieve(
            params: PhoneNumberCampaignRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PhoneNumberCampaign>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("phoneNumber", params.phoneNumber().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("phone_number_campaigns", params._pathParam(0))
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

        private val updateHandler: Handler<PhoneNumberCampaign> =
            jsonHandler<PhoneNumberCampaign>(clientOptions.jsonMapper)

        override fun update(
            params: PhoneNumberCampaignUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PhoneNumberCampaign>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathPhoneNumber", params.pathPhoneNumber().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("phone_number_campaigns", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<PhoneNumberCampaignListResponse> =
            jsonHandler<PhoneNumberCampaignListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: PhoneNumberCampaignListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PhoneNumberCampaignListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("phone_number_campaigns")
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
                    }
                }
        }

        private val deleteHandler: Handler<PhoneNumberCampaign> =
            jsonHandler<PhoneNumberCampaign>(clientOptions.jsonMapper)

        override fun delete(
            params: PhoneNumberCampaignDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PhoneNumberCampaign>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("phoneNumber", params.phoneNumber().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("phone_number_campaigns", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deleteHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
