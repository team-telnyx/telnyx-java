// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.sipregistrationstatus.SipRegistrationStatusRetrieveParams
import com.telnyx.sdk.models.sipregistrationstatus.SipRegistrationStatusRetrieveResponse
import java.util.function.Consumer

/** Look up the live SIP registration status of a UAC connection. */
interface SipRegistrationStatusService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SipRegistrationStatusService

    /**
     * Returns the live SIP registration state of a UAC connection: whether it is currently
     * registered, when it last registered, and the last response Telnyx received from the
     * registrar. Only `uac_external_credential` is supported today.
     */
    fun retrieve(
        params: SipRegistrationStatusRetrieveParams
    ): SipRegistrationStatusRetrieveResponse = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SipRegistrationStatusRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SipRegistrationStatusRetrieveResponse

    /**
     * A view of [SipRegistrationStatusService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SipRegistrationStatusService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /sip_registration_status`, but is otherwise the same
         * as [SipRegistrationStatusService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: SipRegistrationStatusRetrieveParams
        ): HttpResponseFor<SipRegistrationStatusRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: SipRegistrationStatusRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SipRegistrationStatusRetrieveResponse>
    }
}
