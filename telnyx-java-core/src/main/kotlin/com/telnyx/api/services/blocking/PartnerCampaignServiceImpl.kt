// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

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
import com.telnyx.api.core.prepare
import com.telnyx.api.models.partnercampaigns.PartnerCampaignListParams
import com.telnyx.api.models.partnercampaigns.PartnerCampaignListResponse
import com.telnyx.api.models.partnercampaigns.PartnerCampaignListSharedByMeParams
import com.telnyx.api.models.partnercampaigns.PartnerCampaignListSharedByMeResponse
import com.telnyx.api.models.partnercampaigns.PartnerCampaignRetrieveParams
import com.telnyx.api.models.partnercampaigns.PartnerCampaignRetrieveSharingStatusParams
import com.telnyx.api.models.partnercampaigns.PartnerCampaignRetrieveSharingStatusResponse
import com.telnyx.api.models.partnercampaigns.PartnerCampaignUpdateParams
import com.telnyx.api.models.partnercampaigns.TelnyxDownstreamCampaign
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
    ): PartnerCampaignListResponse =
        // get /partner_campaigns
        withRawResponse().list(params, requestOptions).parse()

    override fun listSharedByMe(
        params: PartnerCampaignListSharedByMeParams,
        requestOptions: RequestOptions,
    ): PartnerCampaignListSharedByMeResponse =
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

        private val listHandler: Handler<PartnerCampaignListResponse> =
            jsonHandler<PartnerCampaignListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: PartnerCampaignListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PartnerCampaignListResponse> {
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
            }
        }

        private val listSharedByMeHandler: Handler<PartnerCampaignListSharedByMeResponse> =
            jsonHandler<PartnerCampaignListSharedByMeResponse>(clientOptions.jsonMapper)

        override fun listSharedByMe(
            params: PartnerCampaignListSharedByMeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PartnerCampaignListSharedByMeResponse> {
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
