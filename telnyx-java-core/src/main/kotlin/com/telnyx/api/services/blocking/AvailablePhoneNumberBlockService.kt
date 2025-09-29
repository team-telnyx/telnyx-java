// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.availablephonenumberblocks.AvailablePhoneNumberBlockListParams
import com.telnyx.api.models.availablephonenumberblocks.AvailablePhoneNumberBlockListResponse
import java.util.function.Consumer

interface AvailablePhoneNumberBlockService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AvailablePhoneNumberBlockService

    /** List available phone number blocks */
    fun list(): AvailablePhoneNumberBlockListResponse =
        list(AvailablePhoneNumberBlockListParams.none())

    /** @see list */
    fun list(
        params: AvailablePhoneNumberBlockListParams = AvailablePhoneNumberBlockListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AvailablePhoneNumberBlockListResponse

    /** @see list */
    fun list(
        params: AvailablePhoneNumberBlockListParams = AvailablePhoneNumberBlockListParams.none()
    ): AvailablePhoneNumberBlockListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): AvailablePhoneNumberBlockListResponse =
        list(AvailablePhoneNumberBlockListParams.none(), requestOptions)

    /**
     * A view of [AvailablePhoneNumberBlockService] that provides access to raw HTTP responses for
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
        ): AvailablePhoneNumberBlockService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /available_phone_number_blocks`, but is otherwise
         * the same as [AvailablePhoneNumberBlockService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<AvailablePhoneNumberBlockListResponse> =
            list(AvailablePhoneNumberBlockListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AvailablePhoneNumberBlockListParams =
                AvailablePhoneNumberBlockListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AvailablePhoneNumberBlockListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: AvailablePhoneNumberBlockListParams = AvailablePhoneNumberBlockListParams.none()
        ): HttpResponseFor<AvailablePhoneNumberBlockListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<AvailablePhoneNumberBlockListResponse> =
            list(AvailablePhoneNumberBlockListParams.none(), requestOptions)
    }
}
