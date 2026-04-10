// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.whatsapp.phonenumbers.profile

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
import com.telnyx.sdk.core.http.multipartFormData
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.whatsapp.phonenumbers.profile.photo.PhotoDeleteParams
import com.telnyx.sdk.models.whatsapp.phonenumbers.profile.photo.PhotoRetrieveParams
import com.telnyx.sdk.models.whatsapp.phonenumbers.profile.photo.PhotoRetrieveResponse
import com.telnyx.sdk.models.whatsapp.phonenumbers.profile.photo.PhotoUploadParams
import com.telnyx.sdk.models.whatsapp.phonenumbers.profile.photo.PhotoUploadResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Manage Whatsapp phone numbers */
class PhotoServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PhotoService {

    private val withRawResponse: PhotoService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PhotoService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PhotoService =
        PhotoServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: PhotoRetrieveParams,
        requestOptions: RequestOptions,
    ): PhotoRetrieveResponse =
        // get /v2/whatsapp/phone_numbers/{phone_number}/profile/photo
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun delete(params: PhotoDeleteParams, requestOptions: RequestOptions) {
        // delete /v2/whatsapp/phone_numbers/{phone_number}/profile/photo
        withRawResponse().delete(params, requestOptions)
    }

    override fun upload(
        params: PhotoUploadParams,
        requestOptions: RequestOptions,
    ): PhotoUploadResponse =
        // post /v2/whatsapp/phone_numbers/{phone_number}/profile/photo
        withRawResponse().upload(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PhotoService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PhotoService.WithRawResponse =
            PhotoServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<PhotoRetrieveResponse> =
            jsonHandler<PhotoRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: PhotoRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhotoRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("phoneNumber", params.phoneNumber().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v2",
                        "whatsapp",
                        "phone_numbers",
                        params._pathParam(0),
                        "profile",
                        "photo",
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: PhotoDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("phoneNumber", params.phoneNumber().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v2",
                        "whatsapp",
                        "phone_numbers",
                        params._pathParam(0),
                        "profile",
                        "photo",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val uploadHandler: Handler<PhotoUploadResponse> =
            jsonHandler<PhotoUploadResponse>(clientOptions.jsonMapper)

        override fun upload(
            params: PhotoUploadParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhotoUploadResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("phoneNumber", params.phoneNumber().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v2",
                        "whatsapp",
                        "phone_numbers",
                        params._pathParam(0),
                        "profile",
                        "photo",
                    )
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { uploadHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
