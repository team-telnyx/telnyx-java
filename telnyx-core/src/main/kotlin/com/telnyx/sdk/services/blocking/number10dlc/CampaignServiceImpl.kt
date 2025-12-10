// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.number10dlc

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
import com.telnyx.sdk.models.campaign.TelnyxCampaignCsp
import com.telnyx.sdk.models.number10dlc.campaign.CampaignAppealParams
import com.telnyx.sdk.models.number10dlc.campaign.CampaignAppealResponse
import com.telnyx.sdk.models.number10dlc.campaign.CampaignDeleteParams
import com.telnyx.sdk.models.number10dlc.campaign.CampaignDeleteResponse
import com.telnyx.sdk.models.number10dlc.campaign.CampaignListParams
import com.telnyx.sdk.models.number10dlc.campaign.CampaignListResponse
import com.telnyx.sdk.models.number10dlc.campaign.CampaignRetrieveMnoMetadataParams
import com.telnyx.sdk.models.number10dlc.campaign.CampaignRetrieveMnoMetadataResponse
import com.telnyx.sdk.models.number10dlc.campaign.CampaignRetrieveOperationStatusParams
import com.telnyx.sdk.models.number10dlc.campaign.CampaignRetrieveOperationStatusResponse
import com.telnyx.sdk.models.number10dlc.campaign.CampaignRetrieveParams
import com.telnyx.sdk.models.number10dlc.campaign.CampaignRetrieveSharingParams
import com.telnyx.sdk.models.number10dlc.campaign.CampaignRetrieveSharingResponse
import com.telnyx.sdk.models.number10dlc.campaign.CampaignUpdateParams
import com.telnyx.sdk.services.blocking.number10dlc.campaign.OsrService
import com.telnyx.sdk.services.blocking.number10dlc.campaign.OsrServiceImpl
import com.telnyx.sdk.services.blocking.number10dlc.campaign.UsecaseService
import com.telnyx.sdk.services.blocking.number10dlc.campaign.UsecaseServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CampaignServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CampaignService {

    private val withRawResponse: CampaignService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val usecase: UsecaseService by lazy { UsecaseServiceImpl(clientOptions) }

    private val osr: OsrService by lazy { OsrServiceImpl(clientOptions) }

    override fun withRawResponse(): CampaignService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CampaignService =
        CampaignServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun usecase(): UsecaseService = usecase

    override fun osr(): OsrService = osr

    override fun retrieve(
        params: CampaignRetrieveParams,
        requestOptions: RequestOptions,
    ): TelnyxCampaignCsp =
        // get /10dlc/campaign/{campaignId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: CampaignUpdateParams,
        requestOptions: RequestOptions,
    ): TelnyxCampaignCsp =
        // put /10dlc/campaign/{campaignId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: CampaignListParams,
        requestOptions: RequestOptions,
    ): CampaignListResponse =
        // get /10dlc/campaign
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: CampaignDeleteParams,
        requestOptions: RequestOptions,
    ): CampaignDeleteResponse =
        // delete /10dlc/campaign/{campaignId}
        withRawResponse().delete(params, requestOptions).parse()

    override fun appeal(
        params: CampaignAppealParams,
        requestOptions: RequestOptions,
    ): CampaignAppealResponse =
        // post /10dlc/campaign/{campaignId}/appeal
        withRawResponse().appeal(params, requestOptions).parse()

    override fun retrieveMnoMetadata(
        params: CampaignRetrieveMnoMetadataParams,
        requestOptions: RequestOptions,
    ): CampaignRetrieveMnoMetadataResponse =
        // get /10dlc/campaign/{campaignId}/mnoMetadata
        withRawResponse().retrieveMnoMetadata(params, requestOptions).parse()

    override fun retrieveOperationStatus(
        params: CampaignRetrieveOperationStatusParams,
        requestOptions: RequestOptions,
    ): CampaignRetrieveOperationStatusResponse =
        // get /10dlc/campaign/{campaignId}/operationStatus
        withRawResponse().retrieveOperationStatus(params, requestOptions).parse()

    override fun retrieveSharing(
        params: CampaignRetrieveSharingParams,
        requestOptions: RequestOptions,
    ): CampaignRetrieveSharingResponse =
        // get /10dlc/campaign/{campaignId}/sharing
        withRawResponse().retrieveSharing(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CampaignService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val usecase: UsecaseService.WithRawResponse by lazy {
            UsecaseServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val osr: OsrService.WithRawResponse by lazy {
            OsrServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CampaignService.WithRawResponse =
            CampaignServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun usecase(): UsecaseService.WithRawResponse = usecase

        override fun osr(): OsrService.WithRawResponse = osr

        private val retrieveHandler: Handler<TelnyxCampaignCsp> =
            jsonHandler<TelnyxCampaignCsp>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CampaignRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TelnyxCampaignCsp> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("campaignId", params.campaignId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("10dlc", "campaign", params._pathParam(0))
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

        private val updateHandler: Handler<TelnyxCampaignCsp> =
            jsonHandler<TelnyxCampaignCsp>(clientOptions.jsonMapper)

        override fun update(
            params: CampaignUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TelnyxCampaignCsp> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("campaignId", params.campaignId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("10dlc", "campaign", params._pathParam(0))
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

        private val listHandler: Handler<CampaignListResponse> =
            jsonHandler<CampaignListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CampaignListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CampaignListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("10dlc", "campaign")
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

        private val deleteHandler: Handler<CampaignDeleteResponse> =
            jsonHandler<CampaignDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: CampaignDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CampaignDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("campaignId", params.campaignId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("10dlc", "campaign", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val appealHandler: Handler<CampaignAppealResponse> =
            jsonHandler<CampaignAppealResponse>(clientOptions.jsonMapper)

        override fun appeal(
            params: CampaignAppealParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CampaignAppealResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("campaignId", params.campaignId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("10dlc", "campaign", params._pathParam(0), "appeal")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { appealHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveMnoMetadataHandler: Handler<CampaignRetrieveMnoMetadataResponse> =
            jsonHandler<CampaignRetrieveMnoMetadataResponse>(clientOptions.jsonMapper)

        override fun retrieveMnoMetadata(
            params: CampaignRetrieveMnoMetadataParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CampaignRetrieveMnoMetadataResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("campaignId", params.campaignId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("10dlc", "campaign", params._pathParam(0), "mnoMetadata")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveMnoMetadataHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveOperationStatusHandler:
            Handler<CampaignRetrieveOperationStatusResponse> =
            jsonHandler<CampaignRetrieveOperationStatusResponse>(clientOptions.jsonMapper)

        override fun retrieveOperationStatus(
            params: CampaignRetrieveOperationStatusParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CampaignRetrieveOperationStatusResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("campaignId", params.campaignId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("10dlc", "campaign", params._pathParam(0), "operationStatus")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveOperationStatusHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveSharingHandler: Handler<CampaignRetrieveSharingResponse> =
            jsonHandler<CampaignRetrieveSharingResponse>(clientOptions.jsonMapper)

        override fun retrieveSharing(
            params: CampaignRetrieveSharingParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CampaignRetrieveSharingResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("campaignId", params.campaignId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("10dlc", "campaign", params._pathParam(0), "sharing")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveSharingHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
