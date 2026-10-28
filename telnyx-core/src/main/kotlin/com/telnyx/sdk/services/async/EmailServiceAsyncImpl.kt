// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.async.email.DedicatedIpServiceAsync
import com.telnyx.sdk.services.async.email.DedicatedIpServiceAsyncImpl
import com.telnyx.sdk.services.async.email.IpPoolServiceAsync
import com.telnyx.sdk.services.async.email.IpPoolServiceAsyncImpl
import java.util.function.Consumer

class EmailServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EmailServiceAsync {

    private val withRawResponse: EmailServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val dedicatedIps: DedicatedIpServiceAsync by lazy {
        DedicatedIpServiceAsyncImpl(clientOptions)
    }

    private val ipPools: IpPoolServiceAsync by lazy { IpPoolServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): EmailServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmailServiceAsync =
        EmailServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Purchase and manage dedicated sending IP addresses for your Telnyx email traffic. */
    override fun dedicatedIps(): DedicatedIpServiceAsync = dedicatedIps

    /** Group dedicated IPs into pools for sending. */
    override fun ipPools(): IpPoolServiceAsync = ipPools

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EmailServiceAsync.WithRawResponse {

        private val dedicatedIps: DedicatedIpServiceAsync.WithRawResponse by lazy {
            DedicatedIpServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val ipPools: IpPoolServiceAsync.WithRawResponse by lazy {
            IpPoolServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EmailServiceAsync.WithRawResponse =
            EmailServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Purchase and manage dedicated sending IP addresses for your Telnyx email traffic. */
        override fun dedicatedIps(): DedicatedIpServiceAsync.WithRawResponse = dedicatedIps

        /** Group dedicated IPs into pools for sending. */
        override fun ipPools(): IpPoolServiceAsync.WithRawResponse = ipPools
    }
}
