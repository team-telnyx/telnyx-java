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
import com.telnyx.sdk.models.externalconnections.ExternalConnectionCreateParams
import com.telnyx.sdk.models.externalconnections.ExternalConnectionCreateResponse
import com.telnyx.sdk.models.externalconnections.ExternalConnectionDeleteParams
import com.telnyx.sdk.models.externalconnections.ExternalConnectionDeleteResponse
import com.telnyx.sdk.models.externalconnections.ExternalConnectionListParams
import com.telnyx.sdk.models.externalconnections.ExternalConnectionListResponse
import com.telnyx.sdk.models.externalconnections.ExternalConnectionRetrieveParams
import com.telnyx.sdk.models.externalconnections.ExternalConnectionRetrieveResponse
import com.telnyx.sdk.models.externalconnections.ExternalConnectionUpdateLocationParams
import com.telnyx.sdk.models.externalconnections.ExternalConnectionUpdateLocationResponse
import com.telnyx.sdk.models.externalconnections.ExternalConnectionUpdateParams
import com.telnyx.sdk.models.externalconnections.ExternalConnectionUpdateResponse
import com.telnyx.sdk.services.blocking.externalconnections.CivicAddressService
import com.telnyx.sdk.services.blocking.externalconnections.CivicAddressServiceImpl
import com.telnyx.sdk.services.blocking.externalconnections.LogMessageService
import com.telnyx.sdk.services.blocking.externalconnections.LogMessageServiceImpl
import com.telnyx.sdk.services.blocking.externalconnections.PhoneNumberService
import com.telnyx.sdk.services.blocking.externalconnections.PhoneNumberServiceImpl
import com.telnyx.sdk.services.blocking.externalconnections.ReleaseService
import com.telnyx.sdk.services.blocking.externalconnections.ReleaseServiceImpl
import com.telnyx.sdk.services.blocking.externalconnections.UploadService
import com.telnyx.sdk.services.blocking.externalconnections.UploadServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ExternalConnectionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ExternalConnectionService {

    private val withRawResponse: ExternalConnectionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val logMessages: LogMessageService by lazy { LogMessageServiceImpl(clientOptions) }

    private val civicAddresses: CivicAddressService by lazy {
        CivicAddressServiceImpl(clientOptions)
    }

    private val phoneNumbers: PhoneNumberService by lazy { PhoneNumberServiceImpl(clientOptions) }

    private val releases: ReleaseService by lazy { ReleaseServiceImpl(clientOptions) }

    private val uploads: UploadService by lazy { UploadServiceImpl(clientOptions) }

    override fun withRawResponse(): ExternalConnectionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExternalConnectionService =
        ExternalConnectionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun logMessages(): LogMessageService = logMessages

    override fun civicAddresses(): CivicAddressService = civicAddresses

    override fun phoneNumbers(): PhoneNumberService = phoneNumbers

    override fun releases(): ReleaseService = releases

    override fun uploads(): UploadService = uploads

    override fun create(
        params: ExternalConnectionCreateParams,
        requestOptions: RequestOptions,
    ): ExternalConnectionCreateResponse =
        // post /external_connections
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: ExternalConnectionRetrieveParams,
        requestOptions: RequestOptions,
    ): ExternalConnectionRetrieveResponse =
        // get /external_connections/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: ExternalConnectionUpdateParams,
        requestOptions: RequestOptions,
    ): ExternalConnectionUpdateResponse =
        // patch /external_connections/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: ExternalConnectionListParams,
        requestOptions: RequestOptions,
    ): ExternalConnectionListResponse =
        // get /external_connections
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: ExternalConnectionDeleteParams,
        requestOptions: RequestOptions,
    ): ExternalConnectionDeleteResponse =
        // delete /external_connections/{id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun updateLocation(
        params: ExternalConnectionUpdateLocationParams,
        requestOptions: RequestOptions,
    ): ExternalConnectionUpdateLocationResponse =
        // patch /external_connections/{id}/locations/{location_id}
        withRawResponse().updateLocation(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExternalConnectionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val logMessages: LogMessageService.WithRawResponse by lazy {
            LogMessageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val civicAddresses: CivicAddressService.WithRawResponse by lazy {
            CivicAddressServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val phoneNumbers: PhoneNumberService.WithRawResponse by lazy {
            PhoneNumberServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val releases: ReleaseService.WithRawResponse by lazy {
            ReleaseServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val uploads: UploadService.WithRawResponse by lazy {
            UploadServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExternalConnectionService.WithRawResponse =
            ExternalConnectionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun logMessages(): LogMessageService.WithRawResponse = logMessages

        override fun civicAddresses(): CivicAddressService.WithRawResponse = civicAddresses

        override fun phoneNumbers(): PhoneNumberService.WithRawResponse = phoneNumbers

        override fun releases(): ReleaseService.WithRawResponse = releases

        override fun uploads(): UploadService.WithRawResponse = uploads

        private val createHandler: Handler<ExternalConnectionCreateResponse> =
            jsonHandler<ExternalConnectionCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ExternalConnectionCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalConnectionCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("external_connections")
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

        private val retrieveHandler: Handler<ExternalConnectionRetrieveResponse> =
            jsonHandler<ExternalConnectionRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ExternalConnectionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalConnectionRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("external_connections", params._pathParam(0))
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

        private val updateHandler: Handler<ExternalConnectionUpdateResponse> =
            jsonHandler<ExternalConnectionUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: ExternalConnectionUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalConnectionUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("external_connections", params._pathParam(0))
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

        private val listHandler: Handler<ExternalConnectionListResponse> =
            jsonHandler<ExternalConnectionListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ExternalConnectionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalConnectionListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("external_connections")
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

        private val deleteHandler: Handler<ExternalConnectionDeleteResponse> =
            jsonHandler<ExternalConnectionDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: ExternalConnectionDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalConnectionDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("external_connections", params._pathParam(0))
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

        private val updateLocationHandler: Handler<ExternalConnectionUpdateLocationResponse> =
            jsonHandler<ExternalConnectionUpdateLocationResponse>(clientOptions.jsonMapper)

        override fun updateLocation(
            params: ExternalConnectionUpdateLocationParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalConnectionUpdateLocationResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("locationId", params.locationId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "external_connections",
                        params._pathParam(0),
                        "locations",
                        params._pathParam(1),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateLocationHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
