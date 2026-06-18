// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.dir

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.dir.phonenumbers.PhoneNumberAddParams
import com.telnyx.sdk.models.dir.phonenumbers.PhoneNumberAddResponse
import com.telnyx.sdk.models.dir.phonenumbers.PhoneNumberListPage
import com.telnyx.sdk.models.dir.phonenumbers.PhoneNumberListParams
import com.telnyx.sdk.models.dir.phonenumbers.PhoneNumberRemoveParams
import com.telnyx.sdk.models.dir.phonenumbers.PhoneNumberRemoveResponse
import java.util.function.Consumer

/**
 * Associate phone numbers with a verified DIR so calls from those numbers carry the DIR's display
 * identity.
 */
interface PhoneNumberService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PhoneNumberService

    /**
     * List the phone numbers registered under a DIR. The enterprise is resolved server-side from
     * the DIR id.
     */
    fun list(dirId: String): PhoneNumberListPage = list(dirId, PhoneNumberListParams.none())

    /** @see list */
    fun list(
        dirId: String,
        params: PhoneNumberListParams = PhoneNumberListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberListPage = list(params.toBuilder().dirId(dirId).build(), requestOptions)

    /** @see list */
    fun list(
        dirId: String,
        params: PhoneNumberListParams = PhoneNumberListParams.none(),
    ): PhoneNumberListPage = list(dirId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: PhoneNumberListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberListPage

    /** @see list */
    fun list(params: PhoneNumberListParams): PhoneNumberListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(dirId: String, requestOptions: RequestOptions): PhoneNumberListPage =
        list(dirId, PhoneNumberListParams.none(), requestOptions)

    /**
     * Register phone numbers under a DIR. The enterprise is resolved server-side from the DIR id.
     * Same body, failure modes, and batch semantics whichever path form you use.
     *
     * **Pricing:** This is a billable action. See https://telnyx.com/pricing/numbers for current
     * pricing.
     */
    fun add(dirId: String, params: PhoneNumberAddParams): PhoneNumberAddResponse =
        add(dirId, params, RequestOptions.none())

    /** @see add */
    fun add(
        dirId: String,
        params: PhoneNumberAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberAddResponse = add(params.toBuilder().dirId(dirId).build(), requestOptions)

    /** @see add */
    fun add(params: PhoneNumberAddParams): PhoneNumberAddResponse =
        add(params, RequestOptions.none())

    /** @see add */
    fun add(
        params: PhoneNumberAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberAddResponse

    /**
     * Deregister phone numbers from a DIR. The enterprise is resolved server-side from the DIR id.
     * Returns a partial-success envelope.
     */
    fun remove(dirId: String, params: PhoneNumberRemoveParams): PhoneNumberRemoveResponse =
        remove(dirId, params, RequestOptions.none())

    /** @see remove */
    fun remove(
        dirId: String,
        params: PhoneNumberRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberRemoveResponse = remove(params.toBuilder().dirId(dirId).build(), requestOptions)

    /** @see remove */
    fun remove(params: PhoneNumberRemoveParams): PhoneNumberRemoveResponse =
        remove(params, RequestOptions.none())

    /** @see remove */
    fun remove(
        params: PhoneNumberRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberRemoveResponse

    /**
     * A view of [PhoneNumberService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PhoneNumberService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /dir/{dir_id}/phone_numbers`, but is otherwise the
         * same as [PhoneNumberService.list].
         */
        @MustBeClosed
        fun list(dirId: String): HttpResponseFor<PhoneNumberListPage> =
            list(dirId, PhoneNumberListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            dirId: String,
            params: PhoneNumberListParams = PhoneNumberListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberListPage> =
            list(params.toBuilder().dirId(dirId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            dirId: String,
            params: PhoneNumberListParams = PhoneNumberListParams.none(),
        ): HttpResponseFor<PhoneNumberListPage> = list(dirId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PhoneNumberListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: PhoneNumberListParams): HttpResponseFor<PhoneNumberListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            dirId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhoneNumberListPage> =
            list(dirId, PhoneNumberListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /dir/{dir_id}/phone_numbers`, but is otherwise the
         * same as [PhoneNumberService.add].
         */
        @MustBeClosed
        fun add(
            dirId: String,
            params: PhoneNumberAddParams,
        ): HttpResponseFor<PhoneNumberAddResponse> = add(dirId, params, RequestOptions.none())

        /** @see add */
        @MustBeClosed
        fun add(
            dirId: String,
            params: PhoneNumberAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberAddResponse> =
            add(params.toBuilder().dirId(dirId).build(), requestOptions)

        /** @see add */
        @MustBeClosed
        fun add(params: PhoneNumberAddParams): HttpResponseFor<PhoneNumberAddResponse> =
            add(params, RequestOptions.none())

        /** @see add */
        @MustBeClosed
        fun add(
            params: PhoneNumberAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberAddResponse>

        /**
         * Returns a raw HTTP response for `delete /dir/{dir_id}/phone_numbers`, but is otherwise
         * the same as [PhoneNumberService.remove].
         */
        @MustBeClosed
        fun remove(
            dirId: String,
            params: PhoneNumberRemoveParams,
        ): HttpResponseFor<PhoneNumberRemoveResponse> = remove(dirId, params, RequestOptions.none())

        /** @see remove */
        @MustBeClosed
        fun remove(
            dirId: String,
            params: PhoneNumberRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberRemoveResponse> =
            remove(params.toBuilder().dirId(dirId).build(), requestOptions)

        /** @see remove */
        @MustBeClosed
        fun remove(params: PhoneNumberRemoveParams): HttpResponseFor<PhoneNumberRemoveResponse> =
            remove(params, RequestOptions.none())

        /** @see remove */
        @MustBeClosed
        fun remove(
            params: PhoneNumberRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberRemoveResponse>
    }
}
