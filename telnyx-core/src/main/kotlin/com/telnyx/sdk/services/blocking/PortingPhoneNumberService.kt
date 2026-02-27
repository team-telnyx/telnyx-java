// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.portingphonenumbers.PortingPhoneNumberListPage
import com.telnyx.sdk.models.portingphonenumbers.PortingPhoneNumberListParams
import java.util.function.Consumer

/** Endpoints related to porting orders management. */
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
    fun list(): PortingPhoneNumberListPage = list(PortingPhoneNumberListParams.none())

    /** @see list */
    fun list(
        params: PortingPhoneNumberListParams = PortingPhoneNumberListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortingPhoneNumberListPage

    /** @see list */
    fun list(
        params: PortingPhoneNumberListParams = PortingPhoneNumberListParams.none()
    ): PortingPhoneNumberListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): PortingPhoneNumberListPage =
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
        fun list(): HttpResponseFor<PortingPhoneNumberListPage> =
            list(PortingPhoneNumberListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PortingPhoneNumberListParams = PortingPhoneNumberListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortingPhoneNumberListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: PortingPhoneNumberListParams = PortingPhoneNumberListParams.none()
        ): HttpResponseFor<PortingPhoneNumberListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PortingPhoneNumberListPage> =
            list(PortingPhoneNumberListParams.none(), requestOptions)
    }
}
