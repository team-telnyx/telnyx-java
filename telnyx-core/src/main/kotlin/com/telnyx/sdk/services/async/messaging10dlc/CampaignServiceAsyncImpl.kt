// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.messaging10dlc

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
import com.telnyx.sdk.core.prepareAsync
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
import com.telnyx.sdk.models.messaging10dlc.campaign.CampaignListPageAsync
import com.telnyx.sdk.models.messaging10dlc.campaign.CampaignListPageResponse
import com.telnyx.sdk.models.messaging10dlc.campaign.CampaignListParams
import com.telnyx.sdk.models.messaging10dlc.campaign.CampaignRetrieveParams
import com.telnyx.sdk.models.messaging10dlc.campaign.CampaignSubmitAppealParams
import com.telnyx.sdk.models.messaging10dlc.campaign.CampaignSubmitAppealResponse
import com.telnyx.sdk.models.messaging10dlc.campaign.CampaignUpdateParams
import com.telnyx.sdk.models.messaging10dlc.campaign.TelnyxCampaignCsp
import com.telnyx.sdk.services.async.messaging10dlc.campaign.OsrServiceAsync
import com.telnyx.sdk.services.async.messaging10dlc.campaign.OsrServiceAsyncImpl
import com.telnyx.sdk.services.async.messaging10dlc.campaign.UsecaseServiceAsync
import com.telnyx.sdk.services.async.messaging10dlc.campaign.UsecaseServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CampaignServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CampaignServiceAsync {

    private val withRawResponse: CampaignServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val usecase: UsecaseServiceAsync by lazy { UsecaseServiceAsyncImpl(clientOptions) }

    private val osr: OsrServiceAsync by lazy { OsrServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): CampaignServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CampaignServiceAsync =
        CampaignServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun usecase(): UsecaseServiceAsync = usecase

    override fun osr(): OsrServiceAsync = osr

    override fun retrieve(
        params: CampaignRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TelnyxCampaignCsp> =
        // get /10dlc/campaign/{campaignId}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: CampaignUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TelnyxCampaignCsp> =
        // put /10dlc/campaign/{campaignId}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: CampaignListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CampaignListPageAsync> =
        // get /10dlc/campaign
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun acceptSharing(
        params: CampaignAcceptSharingParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CampaignAcceptSharingResponse> =
        // post /10dlc/campaign/acceptSharing/{campaignId}
        withRawResponse().acceptSharing(params, requestOptions).thenApply { it.parse() }

    override fun deactivate(
        params: CampaignDeactivateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CampaignDeactivateResponse> =
        // delete /10dlc/campaign/{campaignId}
        withRawResponse().deactivate(params, requestOptions).thenApply { it.parse() }

    override fun getMnoMetadata(
        params: CampaignGetMnoMetadataParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CampaignGetMnoMetadataResponse> =
        // get /10dlc/campaign/{campaignId}/mnoMetadata
        withRawResponse().getMnoMetadata(params, requestOptions).thenApply { it.parse() }

    override fun getOperationStatus(
        params: CampaignGetOperationStatusParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CampaignGetOperationStatusResponse> =
        // get /10dlc/campaign/{campaignId}/operationStatus
        withRawResponse().getOperationStatus(params, requestOptions).thenApply { it.parse() }

    override fun getSharingStatus(
        params: CampaignGetSharingStatusParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CampaignGetSharingStatusResponse> =
        // get /10dlc/campaign/{campaignId}/sharing
        withRawResponse().getSharingStatus(params, requestOptions).thenApply { it.parse() }

    override fun submitAppeal(
        params: CampaignSubmitAppealParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CampaignSubmitAppealResponse> =
        // post /10dlc/campaign/{campaignId}/appeal
        withRawResponse().submitAppeal(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CampaignServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val usecase: UsecaseServiceAsync.WithRawResponse by lazy {
            UsecaseServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val osr: OsrServiceAsync.WithRawResponse by lazy {
            OsrServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CampaignServiceAsync.WithRawResponse =
            CampaignServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun usecase(): UsecaseServiceAsync.WithRawResponse = usecase

        override fun osr(): OsrServiceAsync.WithRawResponse = osr

        private val retrieveHandler: Handler<TelnyxCampaignCsp> =
            jsonHandler<TelnyxCampaignCsp>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CampaignRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TelnyxCampaignCsp>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("campaignId", params.campaignId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("10dlc", "campaign", params._pathParam(0))
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

        private val updateHandler: Handler<TelnyxCampaignCsp> =
            jsonHandler<TelnyxCampaignCsp>(clientOptions.jsonMapper)

        override fun update(
            params: CampaignUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TelnyxCampaignCsp>> {
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

        private val listHandler: Handler<CampaignListPageResponse> =
            jsonHandler<CampaignListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CampaignListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CampaignListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("10dlc", "campaign")
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
                                CampaignListPageAsync.builder()
                                    .service(CampaignServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val acceptSharingHandler: Handler<CampaignAcceptSharingResponse> =
            jsonHandler<CampaignAcceptSharingResponse>(clientOptions.jsonMapper)

        override fun acceptSharing(
            params: CampaignAcceptSharingParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CampaignAcceptSharingResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { acceptSharingHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deactivateHandler: Handler<CampaignDeactivateResponse> =
            jsonHandler<CampaignDeactivateResponse>(clientOptions.jsonMapper)

        override fun deactivate(
            params: CampaignDeactivateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CampaignDeactivateResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deactivateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getMnoMetadataHandler: Handler<CampaignGetMnoMetadataResponse> =
            jsonHandler<CampaignGetMnoMetadataResponse>(clientOptions.jsonMapper)

        override fun getMnoMetadata(
            params: CampaignGetMnoMetadataParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CampaignGetMnoMetadataResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("campaignId", params.campaignId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("10dlc", "campaign", params._pathParam(0), "mnoMetadata")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getMnoMetadataHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getOperationStatusHandler: Handler<CampaignGetOperationStatusResponse> =
            jsonHandler<CampaignGetOperationStatusResponse>(clientOptions.jsonMapper)

        override fun getOperationStatus(
            params: CampaignGetOperationStatusParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CampaignGetOperationStatusResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("campaignId", params.campaignId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("10dlc", "campaign", params._pathParam(0), "operationStatus")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getOperationStatusHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getSharingStatusHandler: Handler<CampaignGetSharingStatusResponse> =
            jsonHandler<CampaignGetSharingStatusResponse>(clientOptions.jsonMapper)

        override fun getSharingStatus(
            params: CampaignGetSharingStatusParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CampaignGetSharingStatusResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("campaignId", params.campaignId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("10dlc", "campaign", params._pathParam(0), "sharing")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getSharingStatusHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val submitAppealHandler: Handler<CampaignSubmitAppealResponse> =
            jsonHandler<CampaignSubmitAppealResponse>(clientOptions.jsonMapper)

        override fun submitAppeal(
            params: CampaignSubmitAppealParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CampaignSubmitAppealResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
