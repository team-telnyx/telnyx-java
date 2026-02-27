// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.handlers.emptyHandler
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
import com.telnyx.sdk.models.customstoragecredentials.CustomStorageCredentialCreateParams
import com.telnyx.sdk.models.customstoragecredentials.CustomStorageCredentialCreateResponse
import com.telnyx.sdk.models.customstoragecredentials.CustomStorageCredentialDeleteParams
import com.telnyx.sdk.models.customstoragecredentials.CustomStorageCredentialRetrieveParams
import com.telnyx.sdk.models.customstoragecredentials.CustomStorageCredentialRetrieveResponse
import com.telnyx.sdk.models.customstoragecredentials.CustomStorageCredentialUpdateParams
import com.telnyx.sdk.models.customstoragecredentials.CustomStorageCredentialUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Call Recordings operations. */
class CustomStorageCredentialServiceImpl
internal constructor(private val clientOptions: ClientOptions) : CustomStorageCredentialService {

    private val withRawResponse: CustomStorageCredentialService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CustomStorageCredentialService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): CustomStorageCredentialService =
        CustomStorageCredentialServiceImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun create(
        params: CustomStorageCredentialCreateParams,
        requestOptions: RequestOptions,
    ): CustomStorageCredentialCreateResponse =
        // post /custom_storage_credentials/{connection_id}
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: CustomStorageCredentialRetrieveParams,
        requestOptions: RequestOptions,
    ): CustomStorageCredentialRetrieveResponse =
        // get /custom_storage_credentials/{connection_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: CustomStorageCredentialUpdateParams,
        requestOptions: RequestOptions,
    ): CustomStorageCredentialUpdateResponse =
        // put /custom_storage_credentials/{connection_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun delete(
        params: CustomStorageCredentialDeleteParams,
        requestOptions: RequestOptions,
    ) {
        // delete /custom_storage_credentials/{connection_id}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CustomStorageCredentialService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CustomStorageCredentialService.WithRawResponse =
            CustomStorageCredentialServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<CustomStorageCredentialCreateResponse> =
            jsonHandler<CustomStorageCredentialCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: CustomStorageCredentialCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomStorageCredentialCreateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("connectionId", params.connectionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("custom_storage_credentials", params._pathParam(0))
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

        private val retrieveHandler: Handler<CustomStorageCredentialRetrieveResponse> =
            jsonHandler<CustomStorageCredentialRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CustomStorageCredentialRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomStorageCredentialRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("connectionId", params.connectionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("custom_storage_credentials", params._pathParam(0))
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

        private val updateHandler: Handler<CustomStorageCredentialUpdateResponse> =
            jsonHandler<CustomStorageCredentialUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: CustomStorageCredentialUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomStorageCredentialUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("connectionId", params.connectionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("custom_storage_credentials", params._pathParam(0))
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: CustomStorageCredentialDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("connectionId", params.connectionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("custom_storage_credentials", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }
    }
}
