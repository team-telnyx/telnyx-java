// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.detailrecords.DetailRecordListPage
import com.telnyx.sdk.models.detailrecords.DetailRecordListParams
import java.util.function.Consumer

interface DetailRecordService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DetailRecordService

    /** Search for any detail record across the Telnyx Platform */
    fun list(): DetailRecordListPage = list(DetailRecordListParams.none())

    /** @see list */
    fun list(
        params: DetailRecordListParams = DetailRecordListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DetailRecordListPage

    /** @see list */
    fun list(params: DetailRecordListParams = DetailRecordListParams.none()): DetailRecordListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): DetailRecordListPage =
        list(DetailRecordListParams.none(), requestOptions)

    /**
     * A view of [DetailRecordService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DetailRecordService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /detail_records`, but is otherwise the same as
         * [DetailRecordService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<DetailRecordListPage> = list(DetailRecordListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: DetailRecordListParams = DetailRecordListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DetailRecordListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: DetailRecordListParams = DetailRecordListParams.none()
        ): HttpResponseFor<DetailRecordListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<DetailRecordListPage> =
            list(DetailRecordListParams.none(), requestOptions)
    }
}
