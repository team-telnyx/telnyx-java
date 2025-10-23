// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.recordings

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.models.recordings.actions.ActionDeleteParams
import java.util.function.Consumer

interface ActionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionService

    /** Permanently deletes a list of call recordings. */
    fun delete(params: ActionDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: ActionDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [ActionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /recordings/actions/delete`, but is otherwise the
         * same as [ActionService.delete].
         */
        @MustBeClosed
        fun delete(params: ActionDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ActionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
