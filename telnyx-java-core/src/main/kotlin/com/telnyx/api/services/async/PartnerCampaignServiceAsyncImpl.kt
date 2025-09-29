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
import com.telnyx.api.models.partnercampaigns.PartnerCampaignListParams
import com.telnyx.api.models.partnercampaigns.PartnerCampaignListResponse
import com.telnyx.api.models.partnercampaigns.PartnerCampaignListSharedByMeParams
import com.telnyx.api.models.partnercampaigns.PartnerCampaignListSharedByMeResponse
import com.telnyx.api.models.partnercampaigns.PartnerCampaignRetrieveParams
import com.telnyx.api.models.partnercampaigns.PartnerCampaignRetrieveSharingStatusParams
import com.telnyx.api.models.partnercampaigns.PartnerCampaignRetrieveSharingStatusResponse
import com.telnyx.api.models.partnercampaigns.PartnerCampaignUpdateParams
import com.telnyx.api.models.partnercampaigns.TelnyxDownstreamCampaign
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PartnerCampaignServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : PartnerCampaignServiceAsync {

    private val withRawResponse: PartnerCampaignServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PartnerCampaignServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): PartnerCampaignServiceAsync =
        PartnerCampaignServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: PartnerCampaignRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TelnyxDownstreamCampaign> =
        // get /partner_campaigns/{campaignId}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: PartnerCampaignUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TelnyxDownstreamCampaign> =
        // patch /partner_campaigns/{campaignId}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: PartnerCampaignListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PartnerCampaignListResponse> =
        // get /partner_campaigns
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun listSharedByMe(
        params: PartnerCampaignListSharedByMeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PartnerCampaignListSharedByMeResponse> =
        // get /partnerCampaign/sharedByMe
        withRawResponse().listSharedByMe(params, requestOptions).thenApply { it.parse() }

    override fun retrieveSharingStatus(
        params: PartnerCampaignRetrieveSharingStatusParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PartnerCampaignRetrieveSharingStatusResponse> =
        // get /partnerCampaign/{campaignId}/sharing
        withRawResponse().retrieveSharingStatus(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PartnerCampaignServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PartnerCampaignServiceAsync.WithRawResponse =
            PartnerCampaignServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<TelnyxDownstreamCampaign> =
            jsonHandler<TelnyxDownstreamCampaign>(clientOptions.jsonMapper)

        override fun retrieve(
            params: PartnerCampaignRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TelnyxDownstreamCampaign>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("campaignId", params.campaignId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("partner_campaigns", params._pathParam(0))
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

        private val updateHandler: Handler<TelnyxDownstreamCampaign> =
            jsonHandler<TelnyxDownstreamCampaign>(clientOptions.jsonMapper)

        override fun update(
            params: PartnerCampaignUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TelnyxDownstreamCampaign>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("campaignId", params.campaignId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("partner_campaigns", params._pathParam(0))
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

        private val listHandler: Handler<PartnerCampaignListResponse> =
            jsonHandler<PartnerCampaignListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: PartnerCampaignListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PartnerCampaignListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("partner_campaigns")
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

        private val listSharedByMeHandler: Handler<PartnerCampaignListSharedByMeResponse> =
            jsonHandler<PartnerCampaignListSharedByMeResponse>(clientOptions.jsonMapper)

        override fun listSharedByMe(
            params: PartnerCampaignListSharedByMeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PartnerCampaignListSharedByMeResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("partnerCampaign", "sharedByMe")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listSharedByMeHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveSharingStatusHandler:
            Handler<PartnerCampaignRetrieveSharingStatusResponse> =
            jsonHandler<PartnerCampaignRetrieveSharingStatusResponse>(clientOptions.jsonMapper)

        override fun retrieveSharingStatus(
            params: PartnerCampaignRetrieveSharingStatusParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PartnerCampaignRetrieveSharingStatusResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("campaignId", params.campaignId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("partnerCampaign", params._pathParam(0), "sharing")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveSharingStatusHandler.handle(it) }
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
