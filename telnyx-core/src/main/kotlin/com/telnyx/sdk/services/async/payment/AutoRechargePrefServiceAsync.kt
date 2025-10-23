// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.payment

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.payment.autorechargeprefs.AutoRechargePrefListParams
import com.telnyx.sdk.models.payment.autorechargeprefs.AutoRechargePrefListResponse
import com.telnyx.sdk.models.payment.autorechargeprefs.AutoRechargePrefUpdateParams
import com.telnyx.sdk.models.payment.autorechargeprefs.AutoRechargePrefUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AutoRechargePrefServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AutoRechargePrefServiceAsync

    /** Update payment auto recharge preferences. */
    fun update(): CompletableFuture<AutoRechargePrefUpdateResponse> =
        update(AutoRechargePrefUpdateParams.none())

    /** @see update */
    fun update(
        params: AutoRechargePrefUpdateParams = AutoRechargePrefUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AutoRechargePrefUpdateResponse>

    /** @see update */
    fun update(
        params: AutoRechargePrefUpdateParams = AutoRechargePrefUpdateParams.none()
    ): CompletableFuture<AutoRechargePrefUpdateResponse> = update(params, RequestOptions.none())

    /** @see update */
    fun update(requestOptions: RequestOptions): CompletableFuture<AutoRechargePrefUpdateResponse> =
        update(AutoRechargePrefUpdateParams.none(), requestOptions)

    /** Returns the payment auto recharge preferences. */
    fun list(): CompletableFuture<AutoRechargePrefListResponse> =
        list(AutoRechargePrefListParams.none())

    /** @see list */
    fun list(
        params: AutoRechargePrefListParams = AutoRechargePrefListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AutoRechargePrefListResponse>

    /** @see list */
    fun list(
        params: AutoRechargePrefListParams = AutoRechargePrefListParams.none()
    ): CompletableFuture<AutoRechargePrefListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AutoRechargePrefListResponse> =
        list(AutoRechargePrefListParams.none(), requestOptions)

    /**
     * A view of [AutoRechargePrefServiceAsync] that provides access to raw HTTP responses for each
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
        ): AutoRechargePrefServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `patch /payment/auto_recharge_prefs`, but is otherwise
         * the same as [AutoRechargePrefServiceAsync.update].
         */
        fun update(): CompletableFuture<HttpResponseFor<AutoRechargePrefUpdateResponse>> =
            update(AutoRechargePrefUpdateParams.none())

        /** @see update */
        fun update(
            params: AutoRechargePrefUpdateParams = AutoRechargePrefUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AutoRechargePrefUpdateResponse>>

        /** @see update */
        fun update(
            params: AutoRechargePrefUpdateParams = AutoRechargePrefUpdateParams.none()
        ): CompletableFuture<HttpResponseFor<AutoRechargePrefUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AutoRechargePrefUpdateResponse>> =
            update(AutoRechargePrefUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /payment/auto_recharge_prefs`, but is otherwise the
         * same as [AutoRechargePrefServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AutoRechargePrefListResponse>> =
            list(AutoRechargePrefListParams.none())

        /** @see list */
        fun list(
            params: AutoRechargePrefListParams = AutoRechargePrefListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AutoRechargePrefListResponse>>

        /** @see list */
        fun list(
            params: AutoRechargePrefListParams = AutoRechargePrefListParams.none()
        ): CompletableFuture<HttpResponseFor<AutoRechargePrefListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AutoRechargePrefListResponse>> =
            list(AutoRechargePrefListParams.none(), requestOptions)
    }
}
