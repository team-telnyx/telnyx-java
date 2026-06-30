// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.sipregistrationstatus.SipRegistrationStatusRetrieveParams
import com.telnyx.sdk.models.sipregistrationstatus.SipRegistrationStatusRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** UAC connection operations */
interface SipRegistrationStatusServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SipRegistrationStatusServiceAsync

    /**
     * Returns the live SIP registration state of a UAC connection: whether it is currently
     * registered, when it last registered, and the last response Telnyx received from the
     * registrar. Only `uac_external_credential` is supported today.
     */
    fun retrieve(
        params: SipRegistrationStatusRetrieveParams
    ): CompletableFuture<SipRegistrationStatusRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SipRegistrationStatusRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SipRegistrationStatusRetrieveResponse>

    /**
     * A view of [SipRegistrationStatusServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SipRegistrationStatusServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /sip_registration_status`, but is otherwise the same
         * as [SipRegistrationStatusServiceAsync.retrieve].
         */
        fun retrieve(
            params: SipRegistrationStatusRetrieveParams
        ): CompletableFuture<HttpResponseFor<SipRegistrationStatusRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: SipRegistrationStatusRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SipRegistrationStatusRetrieveResponse>>
    }
}
