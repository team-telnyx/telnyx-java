// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.number10dlc

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
import com.telnyx.sdk.services.async.number10dlc.campaign.OsrServiceAsync
import com.telnyx.sdk.services.async.number10dlc.campaign.OsrServiceAsyncImpl
import com.telnyx.sdk.services.async.number10dlc.campaign.UsecaseServiceAsync
import com.telnyx.sdk.services.async.number10dlc.campaign.UsecaseServiceAsyncImpl
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
    ): CompletableFuture<CampaignListResponse> =
        // get /10dlc/campaign
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: CampaignDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CampaignDeleteResponse> =
        // delete /10dlc/campaign/{campaignId}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun appeal(
        params: CampaignAppealParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CampaignAppealResponse> =
        // post /10dlc/campaign/{campaignId}/appeal
        withRawResponse().appeal(params, requestOptions).thenApply { it.parse() }

    override fun retrieveMnoMetadata(
        params: CampaignRetrieveMnoMetadataParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CampaignRetrieveMnoMetadataResponse> =
        // get /10dlc/campaign/{campaignId}/mnoMetadata
        withRawResponse().retrieveMnoMetadata(params, requestOptions).thenApply { it.parse() }

    override fun retrieveOperationStatus(
        params: CampaignRetrieveOperationStatusParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CampaignRetrieveOperationStatusResponse> =
        // get /10dlc/campaign/{campaignId}/operationStatus
        withRawResponse().retrieveOperationStatus(params, requestOptions).thenApply { it.parse() }

    override fun retrieveSharing(
        params: CampaignRetrieveSharingParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CampaignRetrieveSharingResponse> =
        // get /10dlc/campaign/{campaignId}/sharing
        withRawResponse().retrieveSharing(params, requestOptions).thenApply { it.parse() }

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
                    }
                }
        }

        private val deleteHandler: Handler<CampaignDeleteResponse> =
            jsonHandler<CampaignDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: CampaignDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CampaignDeleteResponse>> {
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
                            .use { deleteHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val appealHandler: Handler<CampaignAppealResponse> =
            jsonHandler<CampaignAppealResponse>(clientOptions.jsonMapper)

        override fun appeal(
            params: CampaignAppealParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CampaignAppealResponse>> {
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
                            .use { appealHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveMnoMetadataHandler: Handler<CampaignRetrieveMnoMetadataResponse> =
            jsonHandler<CampaignRetrieveMnoMetadataResponse>(clientOptions.jsonMapper)

        override fun retrieveMnoMetadata(
            params: CampaignRetrieveMnoMetadataParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CampaignRetrieveMnoMetadataResponse>> {
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
                            .use { retrieveMnoMetadataHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
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
        ): CompletableFuture<HttpResponseFor<CampaignRetrieveOperationStatusResponse>> {
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
                            .use { retrieveOperationStatusHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveSharingHandler: Handler<CampaignRetrieveSharingResponse> =
            jsonHandler<CampaignRetrieveSharingResponse>(clientOptions.jsonMapper)

        override fun retrieveSharing(
            params: CampaignRetrieveSharingParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CampaignRetrieveSharingResponse>> {
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
}
