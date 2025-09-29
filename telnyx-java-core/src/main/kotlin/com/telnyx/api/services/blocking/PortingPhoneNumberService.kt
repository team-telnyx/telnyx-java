// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.portingphonenumbers.PortingPhoneNumberListParams
import com.telnyx.api.models.portingphonenumbers.PortingPhoneNumberListResponse
import java.util.function.Consumer

interface PortingPhoneNumberService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PortingPhoneNumberService

    /** Returns a list of your porting phone numbers. */
    fun list(): PortingPhoneNumberListResponse = list(PortingPhoneNumberListParams.none())

    /** @see list */
    fun list(
        params: PortingPhoneNumberListParams = PortingPhoneNumberListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortingPhoneNumberListResponse

    /** @see list */
    fun list(
        params: PortingPhoneNumberListParams = PortingPhoneNumberListParams.none()
    ): PortingPhoneNumberListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): PortingPhoneNumberListResponse =
        list(PortingPhoneNumberListParams.none(), requestOptions)

    /**
     * A view of [PortingPhoneNumberService] that provides access to raw HTTP responses for each
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
        ): PortingPhoneNumberService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /porting_phone_numbers`, but is otherwise the same
         * as [PortingPhoneNumberService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<PortingPhoneNumberListResponse> =
            list(PortingPhoneNumberListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PortingPhoneNumberListParams = PortingPhoneNumberListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortingPhoneNumberListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: PortingPhoneNumberListParams = PortingPhoneNumberListParams.none()
        ): HttpResponseFor<PortingPhoneNumberListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PortingPhoneNumberListResponse> =
            list(PortingPhoneNumberListParams.none(), requestOptions)
    }
}
