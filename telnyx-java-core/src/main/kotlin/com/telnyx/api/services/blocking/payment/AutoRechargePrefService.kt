// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.payment

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.payment.autorechargeprefs.AutoRechargePrefListParams
import com.telnyx.api.models.payment.autorechargeprefs.AutoRechargePrefListResponse
import com.telnyx.api.models.payment.autorechargeprefs.AutoRechargePrefUpdateParams
import com.telnyx.api.models.payment.autorechargeprefs.AutoRechargePrefUpdateResponse
import java.util.function.Consumer

interface AutoRechargePrefService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AutoRechargePrefService

    /** Update payment auto recharge preferences. */
    fun update(): AutoRechargePrefUpdateResponse = update(AutoRechargePrefUpdateParams.none())

    /** @see update */
    fun update(
        params: AutoRechargePrefUpdateParams = AutoRechargePrefUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AutoRechargePrefUpdateResponse

    /** @see update */
    fun update(
        params: AutoRechargePrefUpdateParams = AutoRechargePrefUpdateParams.none()
    ): AutoRechargePrefUpdateResponse = update(params, RequestOptions.none())

    /** @see update */
    fun update(requestOptions: RequestOptions): AutoRechargePrefUpdateResponse =
        update(AutoRechargePrefUpdateParams.none(), requestOptions)

    /** Returns the payment auto recharge preferences. */
    fun list(): AutoRechargePrefListResponse = list(AutoRechargePrefListParams.none())

    /** @see list */
    fun list(
        params: AutoRechargePrefListParams = AutoRechargePrefListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AutoRechargePrefListResponse

    /** @see list */
    fun list(
        params: AutoRechargePrefListParams = AutoRechargePrefListParams.none()
    ): AutoRechargePrefListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): AutoRechargePrefListResponse =
        list(AutoRechargePrefListParams.none(), requestOptions)

    /**
     * A view of [AutoRechargePrefService] that provides access to raw HTTP responses for each
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
        ): AutoRechargePrefService.WithRawResponse

        /**
         * Returns a raw HTTP response for `patch /payment/auto_recharge_prefs`, but is otherwise
         * the same as [AutoRechargePrefService.update].
         */
        @MustBeClosed
        fun update(): HttpResponseFor<AutoRechargePrefUpdateResponse> =
            update(AutoRechargePrefUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: AutoRechargePrefUpdateParams = AutoRechargePrefUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AutoRechargePrefUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(
            params: AutoRechargePrefUpdateParams = AutoRechargePrefUpdateParams.none()
        ): HttpResponseFor<AutoRechargePrefUpdateResponse> = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            requestOptions: RequestOptions
        ): HttpResponseFor<AutoRechargePrefUpdateResponse> =
            update(AutoRechargePrefUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /payment/auto_recharge_prefs`, but is otherwise the
         * same as [AutoRechargePrefService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<AutoRechargePrefListResponse> =
            list(AutoRechargePrefListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AutoRechargePrefListParams = AutoRechargePrefListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AutoRechargePrefListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: AutoRechargePrefListParams = AutoRechargePrefListParams.none()
        ): HttpResponseFor<AutoRechargePrefListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AutoRechargePrefListResponse> =
            list(AutoRechargePrefListParams.none(), requestOptions)
    }
}
