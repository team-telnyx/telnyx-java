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
import com.telnyx.api.models.campaign.CampaignAcceptSharingParams
import com.telnyx.api.models.campaign.CampaignAcceptSharingResponse
import com.telnyx.api.models.campaign.CampaignDeactivateParams
import com.telnyx.api.models.campaign.CampaignDeactivateResponse
import com.telnyx.api.models.campaign.CampaignGetMnoMetadataParams
import com.telnyx.api.models.campaign.CampaignGetMnoMetadataResponse
import com.telnyx.api.models.campaign.CampaignGetOperationStatusParams
import com.telnyx.api.models.campaign.CampaignGetOperationStatusResponse
import com.telnyx.api.models.campaign.CampaignGetSharingStatusParams
import com.telnyx.api.models.campaign.CampaignGetSharingStatusResponse
import com.telnyx.api.models.campaign.CampaignListParams
import com.telnyx.api.models.campaign.CampaignListResponse
import com.telnyx.api.models.campaign.CampaignRetrieveParams
import com.telnyx.api.models.campaign.CampaignSubmitAppealParams
import com.telnyx.api.models.campaign.CampaignSubmitAppealResponse
import com.telnyx.api.models.campaign.CampaignUpdateParams
import com.telnyx.api.models.campaign.TelnyxCampaignCsp
import com.telnyx.api.services.async.campaign.OsrServiceAsync
import com.telnyx.api.services.async.campaign.OsrServiceAsyncImpl
import com.telnyx.api.services.async.campaign.UsecaseServiceAsync
import com.telnyx.api.services.async.campaign.UsecaseServiceAsyncImpl
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
        // get /campaign/{campaignId}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: CampaignUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TelnyxCampaignCsp> =
        // put /campaign/{campaignId}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: CampaignListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CampaignListResponse> =
        // get /campaign
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun acceptSharing(
        params: CampaignAcceptSharingParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CampaignAcceptSharingResponse> =
        // post /campaign/acceptSharing/{campaignId}
        withRawResponse().acceptSharing(params, requestOptions).thenApply { it.parse() }

    override fun deactivate(
        params: CampaignDeactivateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CampaignDeactivateResponse> =
        // delete /campaign/{campaignId}
        withRawResponse().deactivate(params, requestOptions).thenApply { it.parse() }

    override fun getMnoMetadata(
        params: CampaignGetMnoMetadataParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CampaignGetMnoMetadataResponse> =
        // get /campaign/{campaignId}/mnoMetadata
        withRawResponse().getMnoMetadata(params, requestOptions).thenApply { it.parse() }

    override fun getOperationStatus(
        params: CampaignGetOperationStatusParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CampaignGetOperationStatusResponse> =
        // get /campaign/{campaignId}/operationStatus
        withRawResponse().getOperationStatus(params, requestOptions).thenApply { it.parse() }

    override fun getSharingStatus(
        params: CampaignGetSharingStatusParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CampaignGetSharingStatusResponse> =
        // get /campaign/{campaignId}/sharing
        withRawResponse().getSharingStatus(params, requestOptions).thenApply { it.parse() }

    override fun submitAppeal(
        params: CampaignSubmitAppealParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CampaignSubmitAppealResponse> =
        // post /campaign/{campaignId}/appeal
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
                    .addPathSegments("campaign", params._pathParam(0))
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
                    .addPathSegments("campaign", params._pathParam(0))
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

        private val listHandler: Handler<CampaignListResponse> =
            jsonHandler<CampaignListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CampaignListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CampaignListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("campaign")
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
                    .addPathSegments("campaign", "acceptSharing", params._pathParam(0))
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
                    .addPathSegments("campaign", params._pathParam(0))
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
                    .addPathSegments("campaign", params._pathParam(0), "mnoMetadata")
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
                    .addPathSegments("campaign", params._pathParam(0), "operationStatus")
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
                    .addPathSegments("campaign", params._pathParam(0), "sharing")
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
                    .addPathSegments("campaign", params._pathParam(0), "appeal")
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
