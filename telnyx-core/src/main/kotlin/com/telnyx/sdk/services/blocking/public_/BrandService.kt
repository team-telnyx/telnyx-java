// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.public_

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.blocking.public_.brand.SmsOtpService
import java.util.function.Consumer

interface BrandService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BrandService

    fun smsOtp(): SmsOtpService

    /** A view of [BrandService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BrandService.WithRawResponse

        fun smsOtp(): SmsOtpService.WithRawResponse
    }
}
