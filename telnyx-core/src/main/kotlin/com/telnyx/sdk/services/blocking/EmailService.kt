// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.blocking.email.DedicatedIpService
import com.telnyx.sdk.services.blocking.email.IpPoolService
import java.util.function.Consumer

interface EmailService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmailService

    /** Purchase and manage dedicated sending IP addresses for your Telnyx email traffic. */
    fun dedicatedIps(): DedicatedIpService

    /** Group dedicated IPs into pools for sending. */
    fun ipPools(): IpPoolService

    /** A view of [EmailService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmailService.WithRawResponse

        /** Purchase and manage dedicated sending IP addresses for your Telnyx email traffic. */
        fun dedicatedIps(): DedicatedIpService.WithRawResponse

        /** Group dedicated IPs into pools for sending. */
        fun ipPools(): IpPoolService.WithRawResponse
    }
}
