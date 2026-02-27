// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.messaging10dlc

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
import com.telnyx.sdk.models.messaging10dlc.campaign.CampaignAcceptSharingParams
import com.telnyx.sdk.models.messaging10dlc.campaign.CampaignAcceptSharingResponse
import com.telnyx.sdk.models.messaging10dlc.campaign.CampaignDeactivateParams
import com.telnyx.sdk.models.messaging10dlc.campaign.CampaignDeactivateResponse
import com.telnyx.sdk.models.messaging10dlc.campaign.CampaignGetMnoMetadataParams
import com.telnyx.sdk.models.messaging10dlc.campaign.CampaignGetMnoMetadataResponse
import com.telnyx.sdk.models.messaging10dlc.campaign.CampaignGetOperationStatusParams
import com.telnyx.sdk.models.messaging10dlc.campaign.CampaignGetOperationStatusResponse
import com.telnyx.sdk.models.messaging10dlc.campaign.CampaignGetSharingStatusParams
import com.telnyx.sdk.models.messaging10dlc.campaign.CampaignGetSharingStatusResponse
import com.telnyx.sdk.models.messaging10dlc.campaign.CampaignListPage
import com.telnyx.sdk.models.messaging10dlc.campaign.CampaignListPageResponse
import com.telnyx.sdk.models.messaging10dlc.campaign.CampaignListParams
import com.telnyx.sdk.models.messaging10dlc.campaign.CampaignRetrieveParams
import com.telnyx.sdk.models.messaging10dlc.campaign.CampaignSubmitAppealParams
import com.telnyx.sdk.models.messaging10dlc.campaign.CampaignSubmitAppealResponse
import com.telnyx.sdk.models.messaging10dlc.campaign.CampaignUpdateParams
import com.telnyx.sdk.models.messaging10dlc.campaign.TelnyxCampaignCsp
import com.telnyx.sdk.services.blocking.messaging10dlc.campaign.OsrService
import com.telnyx.sdk.services.blocking.messaging10dlc.campaign.OsrServiceImpl
import com.telnyx.sdk.services.blocking.messaging10dlc.campaign.UsecaseService
import com.telnyx.sdk.services.blocking.messaging10dlc.campaign.UsecaseServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Campaign operations */
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

    /** Campaign operations */
    override fun usecase(): UsecaseService = usecase

    /** Campaign operations */
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
    ): CampaignListPage =
        // get /10dlc/campaign
        withRawResponse().list(params, requestOptions).parse()

    override fun acceptSharing(
        params: CampaignAcceptSharingParams,
        requestOptions: RequestOptions,
    ): CampaignAcceptSharingResponse =
        // post /10dlc/campaign/acceptSharing/{campaignId}
        withRawResponse().acceptSharing(params, requestOptions).parse()

    override fun deactivate(
        params: CampaignDeactivateParams,
        requestOptions: RequestOptions,
    ): CampaignDeactivateResponse =
        // delete /10dlc/campaign/{campaignId}
        withRawResponse().deactivate(params, requestOptions).parse()

    override fun getMnoMetadata(
        params: CampaignGetMnoMetadataParams,
        requestOptions: RequestOptions,
    ): CampaignGetMnoMetadataResponse =
        // get /10dlc/campaign/{campaignId}/mnoMetadata
        withRawResponse().getMnoMetadata(params, requestOptions).parse()

    override fun getOperationStatus(
        params: CampaignGetOperationStatusParams,
        requestOptions: RequestOptions,
    ): CampaignGetOperationStatusResponse =
        // get /10dlc/campaign/{campaignId}/operationStatus
        withRawResponse().getOperationStatus(params, requestOptions).parse()

    override fun getSharingStatus(
        params: CampaignGetSharingStatusParams,
        requestOptions: RequestOptions,
    ): CampaignGetSharingStatusResponse =
        // get /10dlc/campaign/{campaignId}/sharing
        withRawResponse().getSharingStatus(params, requestOptions).parse()

    override fun submitAppeal(
        params: CampaignSubmitAppealParams,
        requestOptions: RequestOptions,
    ): CampaignSubmitAppealResponse =
        // post /10dlc/campaign/{campaignId}/appeal
        withRawResponse().submitAppeal(params, requestOptions).parse()

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

        /** Campaign operations */
        override fun usecase(): UsecaseService.WithRawResponse = usecase

        /** Campaign operations */
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

        private val listHandler: Handler<CampaignListPageResponse> =
            jsonHandler<CampaignListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CampaignListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CampaignListPage> {
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
                    .let {
                        CampaignListPage.builder()
                            .service(CampaignServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val acceptSharingHandler: Handler<CampaignAcceptSharingResponse> =
            jsonHandler<CampaignAcceptSharingResponse>(clientOptions.jsonMapper)

        override fun acceptSharing(
            params: CampaignAcceptSharingParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CampaignAcceptSharingResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("campaignId", params.campaignId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("10dlc", "campaign", "acceptSharing", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { acceptSharingHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deactivateHandler: Handler<CampaignDeactivateResponse> =
            jsonHandler<CampaignDeactivateResponse>(clientOptions.jsonMapper)

        override fun deactivate(
            params: CampaignDeactivateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CampaignDeactivateResponse> {
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
                    .use { deactivateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getMnoMetadataHandler: Handler<CampaignGetMnoMetadataResponse> =
            jsonHandler<CampaignGetMnoMetadataResponse>(clientOptions.jsonMapper)

        override fun getMnoMetadata(
            params: CampaignGetMnoMetadataParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CampaignGetMnoMetadataResponse> {
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
                    .use { getMnoMetadataHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getOperationStatusHandler: Handler<CampaignGetOperationStatusResponse> =
            jsonHandler<CampaignGetOperationStatusResponse>(clientOptions.jsonMapper)

        override fun getOperationStatus(
            params: CampaignGetOperationStatusParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CampaignGetOperationStatusResponse> {
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
                    .use { getOperationStatusHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getSharingStatusHandler: Handler<CampaignGetSharingStatusResponse> =
            jsonHandler<CampaignGetSharingStatusResponse>(clientOptions.jsonMapper)

        override fun getSharingStatus(
            params: CampaignGetSharingStatusParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CampaignGetSharingStatusResponse> {
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
                    .use { getSharingStatusHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val submitAppealHandler: Handler<CampaignSubmitAppealResponse> =
            jsonHandler<CampaignSubmitAppealResponse>(clientOptions.jsonMapper)

        override fun submitAppeal(
            params: CampaignSubmitAppealParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CampaignSubmitAppealResponse> {
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
                    .use { submitAppealHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
