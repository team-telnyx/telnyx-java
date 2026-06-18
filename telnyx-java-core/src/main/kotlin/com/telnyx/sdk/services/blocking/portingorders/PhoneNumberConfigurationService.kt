// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.portingorders

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.portingorders.phonenumberconfigurations.PhoneNumberConfigurationCreateParams
import com.telnyx.sdk.models.portingorders.phonenumberconfigurations.PhoneNumberConfigurationCreateResponse
import com.telnyx.sdk.models.portingorders.phonenumberconfigurations.PhoneNumberConfigurationListPage
import com.telnyx.sdk.models.portingorders.phonenumberconfigurations.PhoneNumberConfigurationListParams
import java.util.function.Consumer

/** Endpoints related to porting orders management. */
interface PhoneNumberConfigurationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PhoneNumberConfigurationService

    /** Creates a list of phone number configurations. */
    fun create(): PhoneNumberConfigurationCreateResponse =
        create(PhoneNumberConfigurationCreateParams.none())

    /** @see create */
    fun create(
        params: PhoneNumberConfigurationCreateParams = PhoneNumberConfigurationCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberConfigurationCreateResponse

    /** @see create */
    fun create(
        params: PhoneNumberConfigurationCreateParams = PhoneNumberConfigurationCreateParams.none()
    ): PhoneNumberConfigurationCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): PhoneNumberConfigurationCreateResponse =
        create(PhoneNumberConfigurationCreateParams.none(), requestOptions)

    /** Returns a list of phone number configurations paginated. */
    fun list(): PhoneNumberConfigurationListPage = list(PhoneNumberConfigurationListParams.none())

    /** @see list */
    fun list(
        params: PhoneNumberConfigurationListParams = PhoneNumberConfigurationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberConfigurationListPage

    /** @see list */
    fun list(
        params: PhoneNumberConfigurationListParams = PhoneNumberConfigurationListParams.none()
    ): PhoneNumberConfigurationListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): PhoneNumberConfigurationListPage =
        list(PhoneNumberConfigurationListParams.none(), requestOptions)

    /**
     * A view of [PhoneNumberConfigurationService] that provides access to raw HTTP responses for
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
        ): PhoneNumberConfigurationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /porting_orders/phone_number_configurations`, but
         * is otherwise the same as [PhoneNumberConfigurationService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<PhoneNumberConfigurationCreateResponse> =
            create(PhoneNumberConfigurationCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: PhoneNumberConfigurationCreateParams =
                PhoneNumberConfigurationCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberConfigurationCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            params: PhoneNumberConfigurationCreateParams =
                PhoneNumberConfigurationCreateParams.none()
        ): HttpResponseFor<PhoneNumberConfigurationCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            requestOptions: RequestOptions
        ): HttpResponseFor<PhoneNumberConfigurationCreateResponse> =
            create(PhoneNumberConfigurationCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /porting_orders/phone_number_configurations`, but is
         * otherwise the same as [PhoneNumberConfigurationService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<PhoneNumberConfigurationListPage> =
            list(PhoneNumberConfigurationListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PhoneNumberConfigurationListParams = PhoneNumberConfigurationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberConfigurationListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: PhoneNumberConfigurationListParams = PhoneNumberConfigurationListParams.none()
        ): HttpResponseFor<PhoneNumberConfigurationListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<PhoneNumberConfigurationListPage> =
            list(PhoneNumberConfigurationListParams.none(), requestOptions)
    }
}
