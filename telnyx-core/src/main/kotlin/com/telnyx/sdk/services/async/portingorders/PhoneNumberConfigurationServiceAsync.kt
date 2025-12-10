// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.portingorders

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.portingorders.phonenumberconfigurations.PhoneNumberConfigurationCreateParams
import com.telnyx.sdk.models.portingorders.phonenumberconfigurations.PhoneNumberConfigurationCreateResponse
import com.telnyx.sdk.models.portingorders.phonenumberconfigurations.PhoneNumberConfigurationListPageAsync
import com.telnyx.sdk.models.portingorders.phonenumberconfigurations.PhoneNumberConfigurationListParams
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
    fun list(): CompletableFuture<PhoneNumberConfigurationListPageAsync> =
        list(PhoneNumberConfigurationListParams.none())

    /** @see list */
    fun list(
        params: PhoneNumberConfigurationListParams = PhoneNumberConfigurationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberConfigurationListPageAsync>

    /** @see list */
    fun list(
        params: PhoneNumberConfigurationListParams = PhoneNumberConfigurationListParams.none()
    ): CompletableFuture<PhoneNumberConfigurationListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<PhoneNumberConfigurationListPageAsync> =
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
        fun list(): CompletableFuture<HttpResponseFor<PhoneNumberConfigurationListPageAsync>> =
            list(PhoneNumberConfigurationListParams.none())

        /** @see list */
        fun list(
            params: PhoneNumberConfigurationListParams = PhoneNumberConfigurationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberConfigurationListPageAsync>>

        /** @see list */
        fun list(
            params: PhoneNumberConfigurationListParams = PhoneNumberConfigurationListParams.none()
        ): CompletableFuture<HttpResponseFor<PhoneNumberConfigurationListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PhoneNumberConfigurationListPageAsync>> =
            list(PhoneNumberConfigurationListParams.none(), requestOptions)
    }
}
