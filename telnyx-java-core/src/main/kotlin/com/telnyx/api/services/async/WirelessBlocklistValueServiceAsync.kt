// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.wirelessblocklistvalues.WirelessBlocklistValueListParams
import com.telnyx.api.models.wirelessblocklistvalues.WirelessBlocklistValueListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface WirelessBlocklistValueServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WirelessBlocklistValueServiceAsync

    /** Retrieve all wireless blocklist values for a given blocklist type. */
    fun list(
        params: WirelessBlocklistValueListParams
    ): CompletableFuture<WirelessBlocklistValueListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: WirelessBlocklistValueListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WirelessBlocklistValueListResponse>

    /**
     * A view of [WirelessBlocklistValueServiceAsync] that provides access to raw HTTP responses for
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
        ): WirelessBlocklistValueServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /wireless_blocklist_values`, but is otherwise the
         * same as [WirelessBlocklistValueServiceAsync.list].
         */
        fun list(
            params: WirelessBlocklistValueListParams
        ): CompletableFuture<HttpResponseFor<WirelessBlocklistValueListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: WirelessBlocklistValueListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WirelessBlocklistValueListResponse>>
    }
}
