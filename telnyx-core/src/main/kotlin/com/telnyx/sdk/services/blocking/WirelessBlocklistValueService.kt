// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.wirelessblocklistvalues.WirelessBlocklistValueListParams
import com.telnyx.sdk.models.wirelessblocklistvalues.WirelessBlocklistValueListResponse
import java.util.function.Consumer

/** Wireless Blocklists operations */
interface WirelessBlocklistValueService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WirelessBlocklistValueService

    /** Retrieve all wireless blocklist values for a given blocklist type. */
    fun list(params: WirelessBlocklistValueListParams): WirelessBlocklistValueListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: WirelessBlocklistValueListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WirelessBlocklistValueListResponse

    /**
     * A view of [WirelessBlocklistValueService] that provides access to raw HTTP responses for each
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
        ): WirelessBlocklistValueService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /wireless_blocklist_values`, but is otherwise the
         * same as [WirelessBlocklistValueService.list].
         */
        @MustBeClosed
        fun list(
            params: WirelessBlocklistValueListParams
        ): HttpResponseFor<WirelessBlocklistValueListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: WirelessBlocklistValueListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WirelessBlocklistValueListResponse>
    }
}
