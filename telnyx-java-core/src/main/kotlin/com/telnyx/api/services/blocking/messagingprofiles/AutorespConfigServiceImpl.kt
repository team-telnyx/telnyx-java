// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.messagingprofiles

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
import com.telnyx.api.models.messagingprofiles.autorespconfigs.AutoRespConfigResponse
import com.telnyx.api.models.messagingprofiles.autorespconfigs.AutorespConfigCreateParams
import com.telnyx.api.models.messagingprofiles.autorespconfigs.AutorespConfigDeleteParams
import com.telnyx.api.models.messagingprofiles.autorespconfigs.AutorespConfigDeleteResponse
import com.telnyx.api.models.messagingprofiles.autorespconfigs.AutorespConfigListParams
import com.telnyx.api.models.messagingprofiles.autorespconfigs.AutorespConfigListResponse
import com.telnyx.api.models.messagingprofiles.autorespconfigs.AutorespConfigRetrieveParams
import com.telnyx.api.models.messagingprofiles.autorespconfigs.AutorespConfigUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AutorespConfigServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AutorespConfigService {

    private val withRawResponse: AutorespConfigService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AutorespConfigService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AutorespConfigService =
        AutorespConfigServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: AutorespConfigCreateParams,
        requestOptions: RequestOptions,
    ): AutoRespConfigResponse =
        // post /messaging_profiles/{profile_id}/autoresp_configs
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: AutorespConfigRetrieveParams,
        requestOptions: RequestOptions,
    ): AutoRespConfigResponse =
        // get /messaging_profiles/{profile_id}/autoresp_configs/{autoresp_cfg_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: AutorespConfigUpdateParams,
        requestOptions: RequestOptions,
    ): AutoRespConfigResponse =
        // put /messaging_profiles/{profile_id}/autoresp_configs/{autoresp_cfg_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: AutorespConfigListParams,
        requestOptions: RequestOptions,
    ): AutorespConfigListResponse =
        // get /messaging_profiles/{profile_id}/autoresp_configs
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: AutorespConfigDeleteParams,
        requestOptions: RequestOptions,
    ): AutorespConfigDeleteResponse =
        // delete /messaging_profiles/{profile_id}/autoresp_configs/{autoresp_cfg_id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AutorespConfigService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AutorespConfigService.WithRawResponse =
            AutorespConfigServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<AutoRespConfigResponse> =
            jsonHandler<AutoRespConfigResponse>(clientOptions.jsonMapper)

        override fun create(
            params: AutorespConfigCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AutoRespConfigResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("profileId", params.profileId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("messaging_profiles", params._pathParam(0), "autoresp_configs")
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

        private val retrieveHandler: Handler<AutoRespConfigResponse> =
            jsonHandler<AutoRespConfigResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AutorespConfigRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AutoRespConfigResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("autorespCfgId", params.autorespCfgId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "messaging_profiles",
                        params._pathParam(0),
                        "autoresp_configs",
                        params._pathParam(1),
                    )
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

        private val updateHandler: Handler<AutoRespConfigResponse> =
            jsonHandler<AutoRespConfigResponse>(clientOptions.jsonMapper)

        override fun update(
            params: AutorespConfigUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AutoRespConfigResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("autorespCfgId", params.autorespCfgId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "messaging_profiles",
                        params._pathParam(0),
                        "autoresp_configs",
                        params._pathParam(1),
                    )
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

        private val listHandler: Handler<AutorespConfigListResponse> =
            jsonHandler<AutorespConfigListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AutorespConfigListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AutorespConfigListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("profileId", params.profileId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("messaging_profiles", params._pathParam(0), "autoresp_configs")
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

        private val deleteHandler: Handler<AutorespConfigDeleteResponse> =
            jsonHandler<AutorespConfigDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: AutorespConfigDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AutorespConfigDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("autorespCfgId", params.autorespCfgId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "messaging_profiles",
                        params._pathParam(0),
                        "autoresp_configs",
                        params._pathParam(1),
                    )
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
