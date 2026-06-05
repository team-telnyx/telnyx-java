// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.dir

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.dir.phonenumbers.PhoneNumberAddParams
import com.telnyx.sdk.models.dir.phonenumbers.PhoneNumberAddResponse
import com.telnyx.sdk.models.dir.phonenumbers.PhoneNumberListPageAsync
import com.telnyx.sdk.models.dir.phonenumbers.PhoneNumberListParams
import com.telnyx.sdk.models.dir.phonenumbers.PhoneNumberRemoveParams
import com.telnyx.sdk.models.dir.phonenumbers.PhoneNumberRemoveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Associate phone numbers with a verified DIR so calls from those numbers carry the DIR's display
 * identity.
 */
interface PhoneNumberServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PhoneNumberServiceAsync

    /**
     * List the phone numbers registered under a DIR. The enterprise is resolved server-side from
     * the DIR id.
     */
    fun list(dirId: String): CompletableFuture<PhoneNumberListPageAsync> =
        list(dirId, PhoneNumberListParams.none())

    /** @see list */
    fun list(
        dirId: String,
        params: PhoneNumberListParams = PhoneNumberListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberListPageAsync> =
        list(params.toBuilder().dirId(dirId).build(), requestOptions)

    /** @see list */
    fun list(
        dirId: String,
        params: PhoneNumberListParams = PhoneNumberListParams.none(),
    ): CompletableFuture<PhoneNumberListPageAsync> = list(dirId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: PhoneNumberListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberListPageAsync>

    /** @see list */
    fun list(params: PhoneNumberListParams): CompletableFuture<PhoneNumberListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        dirId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhoneNumberListPageAsync> =
        list(dirId, PhoneNumberListParams.none(), requestOptions)

    /**
     * Register phone numbers under a DIR. The enterprise is resolved server-side from the DIR id.
     * Same body, failure modes, and batch semantics whichever path form you use.
     *
     * **Pricing:** This is a billable action. See https://telnyx.com/pricing/numbers for current
     * pricing.
     */
    fun add(
        dirId: String,
        params: PhoneNumberAddParams,
    ): CompletableFuture<PhoneNumberAddResponse> = add(dirId, params, RequestOptions.none())

    /** @see add */
    fun add(
        dirId: String,
        params: PhoneNumberAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberAddResponse> =
        add(params.toBuilder().dirId(dirId).build(), requestOptions)

    /** @see add */
    fun add(params: PhoneNumberAddParams): CompletableFuture<PhoneNumberAddResponse> =
        add(params, RequestOptions.none())

    /** @see add */
    fun add(
        params: PhoneNumberAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberAddResponse>

    /**
     * Deregister phone numbers from a DIR. The enterprise is resolved server-side from the DIR id.
     * Returns a partial-success envelope.
     */
    fun remove(
        dirId: String,
        params: PhoneNumberRemoveParams,
    ): CompletableFuture<PhoneNumberRemoveResponse> = remove(dirId, params, RequestOptions.none())

    /** @see remove */
    fun remove(
        dirId: String,
        params: PhoneNumberRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberRemoveResponse> =
        remove(params.toBuilder().dirId(dirId).build(), requestOptions)

    /** @see remove */
    fun remove(params: PhoneNumberRemoveParams): CompletableFuture<PhoneNumberRemoveResponse> =
        remove(params, RequestOptions.none())

    /** @see remove */
    fun remove(
        params: PhoneNumberRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberRemoveResponse>

    /**
     * A view of [PhoneNumberServiceAsync] that provides access to raw HTTP responses for each
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
        ): PhoneNumberServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /dir/{dir_id}/phone_numbers`, but is otherwise the
         * same as [PhoneNumberServiceAsync.list].
         */
        fun list(dirId: String): CompletableFuture<HttpResponseFor<PhoneNumberListPageAsync>> =
            list(dirId, PhoneNumberListParams.none())

        /** @see list */
        fun list(
            dirId: String,
            params: PhoneNumberListParams = PhoneNumberListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberListPageAsync>> =
            list(params.toBuilder().dirId(dirId).build(), requestOptions)

        /** @see list */
        fun list(
            dirId: String,
            params: PhoneNumberListParams = PhoneNumberListParams.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberListPageAsync>> =
            list(dirId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: PhoneNumberListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberListPageAsync>>

        /** @see list */
        fun list(
            params: PhoneNumberListParams
        ): CompletableFuture<HttpResponseFor<PhoneNumberListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            dirId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PhoneNumberListPageAsync>> =
            list(dirId, PhoneNumberListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /dir/{dir_id}/phone_numbers`, but is otherwise the
         * same as [PhoneNumberServiceAsync.add].
         */
        fun add(
            dirId: String,
            params: PhoneNumberAddParams,
        ): CompletableFuture<HttpResponseFor<PhoneNumberAddResponse>> =
            add(dirId, params, RequestOptions.none())

        /** @see add */
        fun add(
            dirId: String,
            params: PhoneNumberAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberAddResponse>> =
            add(params.toBuilder().dirId(dirId).build(), requestOptions)

        /** @see add */
        fun add(
            params: PhoneNumberAddParams
        ): CompletableFuture<HttpResponseFor<PhoneNumberAddResponse>> =
            add(params, RequestOptions.none())

        /** @see add */
        fun add(
            params: PhoneNumberAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberAddResponse>>

        /**
         * Returns a raw HTTP response for `delete /dir/{dir_id}/phone_numbers`, but is otherwise
         * the same as [PhoneNumberServiceAsync.remove].
         */
        fun remove(
            dirId: String,
            params: PhoneNumberRemoveParams,
        ): CompletableFuture<HttpResponseFor<PhoneNumberRemoveResponse>> =
            remove(dirId, params, RequestOptions.none())

        /** @see remove */
        fun remove(
            dirId: String,
            params: PhoneNumberRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberRemoveResponse>> =
            remove(params.toBuilder().dirId(dirId).build(), requestOptions)

        /** @see remove */
        fun remove(
            params: PhoneNumberRemoveParams
        ): CompletableFuture<HttpResponseFor<PhoneNumberRemoveResponse>> =
            remove(params, RequestOptions.none())

        /** @see remove */
        fun remove(
            params: PhoneNumberRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberRemoveResponse>>
    }
}
