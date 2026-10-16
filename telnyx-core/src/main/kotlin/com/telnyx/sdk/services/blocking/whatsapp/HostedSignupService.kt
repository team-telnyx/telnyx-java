// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.whatsapp

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.whatsapp.hostedsignups.HostedSignupCreateParams
import com.telnyx.sdk.models.whatsapp.hostedsignups.HostedSignupCreateResponse
import com.telnyx.sdk.models.whatsapp.hostedsignups.HostedSignupListPage
import com.telnyx.sdk.models.whatsapp.hostedsignups.HostedSignupListParams
import com.telnyx.sdk.models.whatsapp.hostedsignups.HostedSignupRetrieveParams
import com.telnyx.sdk.models.whatsapp.hostedsignups.HostedSignupRetrieveResponse
import java.util.function.Consumer

interface HostedSignupService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): HostedSignupService

    /**
     * Create a time-limited onboarding URL on the Telnyx-hosted Embedded Signup page for a Tech
     * Provider's end customer. Set `signup_type` to `coexistence` to launch Meta's WhatsApp
     * Business app coexistence flow instead of standard Cloud API onboarding.
     */
    fun create(params: HostedSignupCreateParams): HostedSignupCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: HostedSignupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HostedSignupCreateResponse

    /** Retrieve a hosted signup and its onboarding URL. */
    fun retrieve(id: String): HostedSignupRetrieveResponse =
        retrieve(id, HostedSignupRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: HostedSignupRetrieveParams = HostedSignupRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HostedSignupRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: HostedSignupRetrieveParams = HostedSignupRetrieveParams.none(),
    ): HostedSignupRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: HostedSignupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HostedSignupRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: HostedSignupRetrieveParams): HostedSignupRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): HostedSignupRetrieveResponse =
        retrieve(id, HostedSignupRetrieveParams.none(), requestOptions)

    /**
     * List hosted signups created by the account, newest first. Expired hosted signups are
     * included.
     */
    fun list(): HostedSignupListPage = list(HostedSignupListParams.none())

    /** @see list */
    fun list(
        params: HostedSignupListParams = HostedSignupListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HostedSignupListPage

    /** @see list */
    fun list(params: HostedSignupListParams = HostedSignupListParams.none()): HostedSignupListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): HostedSignupListPage =
        list(HostedSignupListParams.none(), requestOptions)

    /**
     * A view of [HostedSignupService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): HostedSignupService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /whatsapp/hosted_signups`, but is otherwise the
         * same as [HostedSignupService.create].
         */
        @MustBeClosed
        fun create(params: HostedSignupCreateParams): HttpResponseFor<HostedSignupCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: HostedSignupCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HostedSignupCreateResponse>

        /**
         * Returns a raw HTTP response for `get /whatsapp/hosted_signups/{id}`, but is otherwise the
         * same as [HostedSignupService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<HostedSignupRetrieveResponse> =
            retrieve(id, HostedSignupRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: HostedSignupRetrieveParams = HostedSignupRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HostedSignupRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: HostedSignupRetrieveParams = HostedSignupRetrieveParams.none(),
        ): HttpResponseFor<HostedSignupRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: HostedSignupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HostedSignupRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: HostedSignupRetrieveParams
        ): HttpResponseFor<HostedSignupRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HostedSignupRetrieveResponse> =
            retrieve(id, HostedSignupRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /whatsapp/hosted_signups`, but is otherwise the same
         * as [HostedSignupService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<HostedSignupListPage> = list(HostedSignupListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: HostedSignupListParams = HostedSignupListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HostedSignupListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: HostedSignupListParams = HostedSignupListParams.none()
        ): HttpResponseFor<HostedSignupListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<HostedSignupListPage> =
            list(HostedSignupListParams.none(), requestOptions)
    }
}
