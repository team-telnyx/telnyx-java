// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.inventorycoverage.InventoryCoverageListParams
import com.telnyx.api.models.inventorycoverage.InventoryCoverageListResponse
import java.util.function.Consumer

interface InventoryCoverageService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InventoryCoverageService

    /**
     * Creates an inventory coverage request. If locality, npa or national_destination_code is used
     * in groupBy, and no region or locality filters are used, the whole paginated set is returned.
     */
    fun list(): InventoryCoverageListResponse = list(InventoryCoverageListParams.none())

    /** @see list */
    fun list(
        params: InventoryCoverageListParams = InventoryCoverageListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InventoryCoverageListResponse

    /** @see list */
    fun list(
        params: InventoryCoverageListParams = InventoryCoverageListParams.none()
    ): InventoryCoverageListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): InventoryCoverageListResponse =
        list(InventoryCoverageListParams.none(), requestOptions)

    /**
     * A view of [InventoryCoverageService] that provides access to raw HTTP responses for each
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
        ): InventoryCoverageService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /inventory_coverage`, but is otherwise the same as
         * [InventoryCoverageService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<InventoryCoverageListResponse> =
            list(InventoryCoverageListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: InventoryCoverageListParams = InventoryCoverageListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InventoryCoverageListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: InventoryCoverageListParams = InventoryCoverageListParams.none()
        ): HttpResponseFor<InventoryCoverageListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<InventoryCoverageListResponse> =
            list(InventoryCoverageListParams.none(), requestOptions)
    }
}
