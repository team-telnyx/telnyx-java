// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.availablephonenumbers.AvailablePhoneNumberListParams
import com.telnyx.api.models.availablephonenumbers.AvailablePhoneNumberListResponse
import java.util.function.Consumer

interface AvailablePhoneNumberService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AvailablePhoneNumberService

    /** List available phone numbers */
    fun list(): AvailablePhoneNumberListResponse = list(AvailablePhoneNumberListParams.none())

    /** @see list */
    fun list(
        params: AvailablePhoneNumberListParams = AvailablePhoneNumberListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AvailablePhoneNumberListResponse

    /** @see list */
    fun list(
        params: AvailablePhoneNumberListParams = AvailablePhoneNumberListParams.none()
    ): AvailablePhoneNumberListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): AvailablePhoneNumberListResponse =
        list(AvailablePhoneNumberListParams.none(), requestOptions)

    /**
     * A view of [AvailablePhoneNumberService] that provides access to raw HTTP responses for each
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
        ): AvailablePhoneNumberService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /available_phone_numbers`, but is otherwise the same
         * as [AvailablePhoneNumberService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<AvailablePhoneNumberListResponse> =
            list(AvailablePhoneNumberListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AvailablePhoneNumberListParams = AvailablePhoneNumberListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AvailablePhoneNumberListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: AvailablePhoneNumberListParams = AvailablePhoneNumberListParams.none()
        ): HttpResponseFor<AvailablePhoneNumberListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<AvailablePhoneNumberListResponse> =
            list(AvailablePhoneNumberListParams.none(), requestOptions)
    }
}
