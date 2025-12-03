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
import com.telnyx.sdk.models.partnercampaigns.PartnerCampaignListPage
import com.telnyx.sdk.models.partnercampaigns.PartnerCampaignListPageResponse
import com.telnyx.sdk.models.partnercampaigns.PartnerCampaignListParams
import com.telnyx.sdk.models.partnercampaigns.PartnerCampaignListSharedByMePage
import com.telnyx.sdk.models.partnercampaigns.PartnerCampaignListSharedByMePageResponse
import com.telnyx.sdk.models.partnercampaigns.PartnerCampaignListSharedByMeParams
import com.telnyx.sdk.models.partnercampaigns.PartnerCampaignRetrieveParams
import com.telnyx.sdk.models.partnercampaigns.PartnerCampaignRetrieveSharingStatusParams
import com.telnyx.sdk.models.partnercampaigns.PartnerCampaignRetrieveSharingStatusResponse
import com.telnyx.sdk.models.partnercampaigns.PartnerCampaignUpdateParams
import com.telnyx.sdk.models.partnercampaigns.TelnyxDownstreamCampaign
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PartnerCampaignServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PartnerCampaignService {

    private val withRawResponse: PartnerCampaignService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PartnerCampaignService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PartnerCampaignService =
        PartnerCampaignServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: PartnerCampaignRetrieveParams,
        requestOptions: RequestOptions,
    ): TelnyxDownstreamCampaign =
        // get /partner_campaigns/{campaignId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: PartnerCampaignUpdateParams,
        requestOptions: RequestOptions,
    ): TelnyxDownstreamCampaign =
        // patch /partner_campaigns/{campaignId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: PartnerCampaignListParams,
        requestOptions: RequestOptions,
    ): PartnerCampaignListPage =
        // get /partner_campaigns
        withRawResponse().list(params, requestOptions).parse()

    override fun listSharedByMe(
        params: PartnerCampaignListSharedByMeParams,
        requestOptions: RequestOptions,
    ): PartnerCampaignListSharedByMePage =
        // get /partnerCampaign/sharedByMe
        withRawResponse().listSharedByMe(params, requestOptions).parse()

    override fun retrieveSharingStatus(
        params: PartnerCampaignRetrieveSharingStatusParams,
        requestOptions: RequestOptions,
    ): PartnerCampaignRetrieveSharingStatusResponse =
        // get /partnerCampaign/{campaignId}/sharing
        withRawResponse().retrieveSharingStatus(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PartnerCampaignService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PartnerCampaignService.WithRawResponse =
            PartnerCampaignServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<TelnyxDownstreamCampaign> =
            jsonHandler<TelnyxDownstreamCampaign>(clientOptions.jsonMapper)

        override fun retrieve(
            params: PartnerCampaignRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TelnyxDownstreamCampaign> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("campaignId", params.campaignId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("partner_campaigns", params._pathParam(0))
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

        private val updateHandler: Handler<TelnyxDownstreamCampaign> =
            jsonHandler<TelnyxDownstreamCampaign>(clientOptions.jsonMapper)

        override fun update(
            params: PartnerCampaignUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TelnyxDownstreamCampaign> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<PartnerCampaignListPageResponse> =
            jsonHandler<PartnerCampaignListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: PartnerCampaignListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PartnerCampaignListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("partner_campaigns")
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
                        PartnerCampaignListPage.builder()
                            .service(PartnerCampaignServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val listSharedByMeHandler: Handler<PartnerCampaignListSharedByMePageResponse> =
            jsonHandler<PartnerCampaignListSharedByMePageResponse>(clientOptions.jsonMapper)

        override fun listSharedByMe(
            params: PartnerCampaignListSharedByMeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PartnerCampaignListSharedByMePage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("partnerCampaign", "sharedByMe")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listSharedByMeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        PartnerCampaignListSharedByMePage.builder()
                            .service(PartnerCampaignServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val retrieveSharingStatusHandler:
            Handler<PartnerCampaignRetrieveSharingStatusResponse> =
            jsonHandler<PartnerCampaignRetrieveSharingStatusResponse>(clientOptions.jsonMapper)

        override fun retrieveSharingStatus(
            params: PartnerCampaignRetrieveSharingStatusParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PartnerCampaignRetrieveSharingStatusResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("campaignId", params.campaignId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("partnerCampaign", params._pathParam(0), "sharing")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
