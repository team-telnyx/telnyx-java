// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.portingorders

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.portingorders.phonenumberconfigurations.PhoneNumberConfigurationCreateParams
import com.telnyx.api.models.portingorders.phonenumberconfigurations.PhoneNumberConfigurationCreateResponse
import com.telnyx.api.models.portingorders.phonenumberconfigurations.PhoneNumberConfigurationListParams
import com.telnyx.api.models.portingorders.phonenumberconfigurations.PhoneNumberConfigurationListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PhoneNumberConfigurationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PhoneNumberConfigurationServiceAsync

    /** Creates a list of phone number configurations. */
    fun create(): CompletableFuture<PhoneNumberConfigurationCreateResponse> =
        create(PhoneNumberConfigurationCreateParams.none())

    /** @see create */
    fun create(
        params: PhoneNumberConfigurationCreateParams = PhoneNumberConfigurationCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberConfigurationCreateResponse>

    /** @see create */
    fun create(
        params: PhoneNumberConfigurationCreateParams = PhoneNumberConfigurationCreateParams.none()
    ): CompletableFuture<PhoneNumberConfigurationCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        requestOptions: RequestOptions
    ): CompletableFuture<PhoneNumberConfigurationCreateResponse> =
        create(PhoneNumberConfigurationCreateParams.none(), requestOptions)

    /** Returns a list of phone number configurations paginated. */
    fun list(): CompletableFuture<PhoneNumberConfigurationListResponse> =
        list(PhoneNumberConfigurationListParams.none())

    /** @see list */
    fun list(
        params: PhoneNumberConfigurationListParams = PhoneNumberConfigurationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberConfigurationListResponse>

    /** @see list */
    fun list(
        params: PhoneNumberConfigurationListParams = PhoneNumberConfigurationListParams.none()
    ): CompletableFuture<PhoneNumberConfigurationListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<PhoneNumberConfigurationListResponse> =
        list(PhoneNumberConfigurationListParams.none(), requestOptions)

    /**
     * A view of [PhoneNumberConfigurationServiceAsync] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PhoneNumberConfigurationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /porting_orders/phone_number_configurations`, but
         * is otherwise the same as [PhoneNumberConfigurationServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<PhoneNumberConfigurationCreateResponse>> =
            create(PhoneNumberConfigurationCreateParams.none())

        /** @see create */
        fun create(
            params: PhoneNumberConfigurationCreateParams =
                PhoneNumberConfigurationCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberConfigurationCreateResponse>>

        /** @see create */
        fun create(
            params: PhoneNumberConfigurationCreateParams =
                PhoneNumberConfigurationCreateParams.none()
        ): CompletableFuture<HttpResponseFor<PhoneNumberConfigurationCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PhoneNumberConfigurationCreateResponse>> =
            create(PhoneNumberConfigurationCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /porting_orders/phone_number_configurations`, but is
         * otherwise the same as [PhoneNumberConfigurationServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<PhoneNumberConfigurationListResponse>> =
            list(PhoneNumberConfigurationListParams.none())

        /** @see list */
        fun list(
            params: PhoneNumberConfigurationListParams = PhoneNumberConfigurationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberConfigurationListResponse>>

        /** @see list */
        fun list(
            params: PhoneNumberConfigurationListParams = PhoneNumberConfigurationListParams.none()
        ): CompletableFuture<HttpResponseFor<PhoneNumberConfigurationListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PhoneNumberConfigurationListResponse>> =
            list(PhoneNumberConfigurationListParams.none(), requestOptions)
    }
}
