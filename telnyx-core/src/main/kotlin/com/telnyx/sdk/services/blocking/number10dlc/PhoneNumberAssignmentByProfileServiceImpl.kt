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
import com.telnyx.sdk.models.number10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfilePhoneNumberAssignmentByProfileParams
import com.telnyx.sdk.models.number10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfilePhoneNumberAssignmentByProfileResponse
import com.telnyx.sdk.models.number10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileRetrieveParams
import com.telnyx.sdk.models.number10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileRetrievePhoneNumbersParams
import com.telnyx.sdk.models.number10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileRetrievePhoneNumbersResponse
import com.telnyx.sdk.models.number10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PhoneNumberAssignmentByProfileServiceImpl
internal constructor(private val clientOptions: ClientOptions) :
    PhoneNumberAssignmentByProfileService {

    private val withRawResponse: PhoneNumberAssignmentByProfileService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PhoneNumberAssignmentByProfileService.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): PhoneNumberAssignmentByProfileService =
        PhoneNumberAssignmentByProfileServiceImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun retrieve(
        params: PhoneNumberAssignmentByProfileRetrieveParams,
        requestOptions: RequestOptions,
    ): PhoneNumberAssignmentByProfileRetrieveResponse =
        // get /10dlc/phoneNumberAssignmentByProfile/{taskId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun phoneNumberAssignmentByProfile(
        params: PhoneNumberAssignmentByProfilePhoneNumberAssignmentByProfileParams,
        requestOptions: RequestOptions,
    ): PhoneNumberAssignmentByProfilePhoneNumberAssignmentByProfileResponse =
        // post /10dlc/phoneNumberAssignmentByProfile
        withRawResponse().phoneNumberAssignmentByProfile(params, requestOptions).parse()

    override fun retrievePhoneNumbers(
        params: PhoneNumberAssignmentByProfileRetrievePhoneNumbersParams,
        requestOptions: RequestOptions,
    ): PhoneNumberAssignmentByProfileRetrievePhoneNumbersResponse =
        // get /10dlc/phoneNumberAssignmentByProfile/{taskId}/phoneNumbers
        withRawResponse().retrievePhoneNumbers(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PhoneNumberAssignmentByProfileService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PhoneNumberAssignmentByProfileService.WithRawResponse =
            PhoneNumberAssignmentByProfileServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<PhoneNumberAssignmentByProfileRetrieveResponse> =
            jsonHandler<PhoneNumberAssignmentByProfileRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: PhoneNumberAssignmentByProfileRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhoneNumberAssignmentByProfileRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("taskId", params.taskId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "10dlc",
                        "phoneNumberAssignmentByProfile",
                        params._pathParam(0),
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

        private val phoneNumberAssignmentByProfileHandler:
            Handler<PhoneNumberAssignmentByProfilePhoneNumberAssignmentByProfileResponse> =
            jsonHandler<PhoneNumberAssignmentByProfilePhoneNumberAssignmentByProfileResponse>(
                clientOptions.jsonMapper
            )

        override fun phoneNumberAssignmentByProfile(
            params: PhoneNumberAssignmentByProfilePhoneNumberAssignmentByProfileParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhoneNumberAssignmentByProfilePhoneNumberAssignmentByProfileResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("10dlc", "phoneNumberAssignmentByProfile")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { phoneNumberAssignmentByProfileHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrievePhoneNumbersHandler:
            Handler<PhoneNumberAssignmentByProfileRetrievePhoneNumbersResponse> =
            jsonHandler<PhoneNumberAssignmentByProfileRetrievePhoneNumbersResponse>(
                clientOptions.jsonMapper
            )

        override fun retrievePhoneNumbers(
            params: PhoneNumberAssignmentByProfileRetrievePhoneNumbersParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhoneNumberAssignmentByProfileRetrievePhoneNumbersResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("taskId", params.taskId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "10dlc",
                        "phoneNumberAssignmentByProfile",
                        params._pathParam(0),
                        "phoneNumbers",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrievePhoneNumbersHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
