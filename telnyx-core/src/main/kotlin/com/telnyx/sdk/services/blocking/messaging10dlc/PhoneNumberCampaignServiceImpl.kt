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
import com.telnyx.sdk.models.messaging10dlc.phonenumbercampaigns.PhoneNumberCampaign
import com.telnyx.sdk.models.messaging10dlc.phonenumbercampaigns.PhoneNumberCampaignCreateParams
import com.telnyx.sdk.models.messaging10dlc.phonenumbercampaigns.PhoneNumberCampaignDeleteParams
import com.telnyx.sdk.models.messaging10dlc.phonenumbercampaigns.PhoneNumberCampaignListPage
import com.telnyx.sdk.models.messaging10dlc.phonenumbercampaigns.PhoneNumberCampaignListPageResponse
import com.telnyx.sdk.models.messaging10dlc.phonenumbercampaigns.PhoneNumberCampaignListParams
import com.telnyx.sdk.models.messaging10dlc.phonenumbercampaigns.PhoneNumberCampaignRetrieveParams
import com.telnyx.sdk.models.messaging10dlc.phonenumbercampaigns.PhoneNumberCampaignUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PhoneNumberCampaignServiceImpl
internal constructor(private val clientOptions: ClientOptions) : PhoneNumberCampaignService {

    private val withRawResponse: PhoneNumberCampaignService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PhoneNumberCampaignService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): PhoneNumberCampaignService =
        PhoneNumberCampaignServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: PhoneNumberCampaignCreateParams,
        requestOptions: RequestOptions,
    ): PhoneNumberCampaign =
        // post /10dlc/phone_number_campaigns
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: PhoneNumberCampaignRetrieveParams,
        requestOptions: RequestOptions,
    ): PhoneNumberCampaign =
        // get /10dlc/phone_number_campaigns/{phoneNumber}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: PhoneNumberCampaignUpdateParams,
        requestOptions: RequestOptions,
    ): PhoneNumberCampaign =
        // put /10dlc/phone_number_campaigns/{phoneNumber}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: PhoneNumberCampaignListParams,
        requestOptions: RequestOptions,
    ): PhoneNumberCampaignListPage =
        // get /10dlc/phone_number_campaigns
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: PhoneNumberCampaignDeleteParams,
        requestOptions: RequestOptions,
    ): PhoneNumberCampaign =
        // delete /10dlc/phone_number_campaigns/{phoneNumber}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PhoneNumberCampaignService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PhoneNumberCampaignService.WithRawResponse =
            PhoneNumberCampaignServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<PhoneNumberCampaign> =
            jsonHandler<PhoneNumberCampaign>(clientOptions.jsonMapper)

        override fun create(
            params: PhoneNumberCampaignCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhoneNumberCampaign> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("10dlc", "phone_number_campaigns")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<PhoneNumberCampaign> =
            jsonHandler<PhoneNumberCampaign>(clientOptions.jsonMapper)

        override fun retrieve(
            params: PhoneNumberCampaignRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhoneNumberCampaign> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("phoneNumber", params.phoneNumber().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("10dlc", "phone_number_campaigns", params._pathParam(0))
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

        private val updateHandler: Handler<PhoneNumberCampaign> =
            jsonHandler<PhoneNumberCampaign>(clientOptions.jsonMapper)

        override fun update(
            params: PhoneNumberCampaignUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhoneNumberCampaign> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("campaignPhoneNumber", params.campaignPhoneNumber().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("10dlc", "phone_number_campaigns", params._pathParam(0))
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

        private val listHandler: Handler<PhoneNumberCampaignListPageResponse> =
            jsonHandler<PhoneNumberCampaignListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: PhoneNumberCampaignListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhoneNumberCampaignListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("10dlc", "phone_number_campaigns")
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
                        PhoneNumberCampaignListPage.builder()
                            .service(PhoneNumberCampaignServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<PhoneNumberCampaign> =
            jsonHandler<PhoneNumberCampaign>(clientOptions.jsonMapper)

        override fun delete(
            params: PhoneNumberCampaignDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhoneNumberCampaign> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("phoneNumber", params.phoneNumber().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("10dlc", "phone_number_campaigns", params._pathParam(0))
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
    }
}
