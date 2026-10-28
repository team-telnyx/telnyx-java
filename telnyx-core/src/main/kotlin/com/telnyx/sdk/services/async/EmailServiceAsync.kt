// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.async.email.DedicatedIpServiceAsync
import com.telnyx.sdk.services.async.email.IpPoolServiceAsync
import java.util.function.Consumer

interface EmailServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmailServiceAsync

    /** Purchase and manage dedicated sending IP addresses for your Telnyx email traffic. */
    fun dedicatedIps(): DedicatedIpServiceAsync

    /** Group dedicated IPs into pools for sending. */
    fun ipPools(): IpPoolServiceAsync

    /** A view of [EmailServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EmailServiceAsync.WithRawResponse

        /** Purchase and manage dedicated sending IP addresses for your Telnyx email traffic. */
        fun dedicatedIps(): DedicatedIpServiceAsync.WithRawResponse

        /** Group dedicated IPs into pools for sending. */
        fun ipPools(): IpPoolServiceAsync.WithRawResponse
    }
}
