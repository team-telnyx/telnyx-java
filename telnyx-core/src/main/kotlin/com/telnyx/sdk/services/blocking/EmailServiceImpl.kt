// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.blocking.email.DedicatedIpService
import com.telnyx.sdk.services.blocking.email.DedicatedIpServiceImpl
import com.telnyx.sdk.services.blocking.email.IpPoolService
import com.telnyx.sdk.services.blocking.email.IpPoolServiceImpl
import java.util.function.Consumer

class EmailServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EmailService {

    private val withRawResponse: EmailService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val dedicatedIps: DedicatedIpService by lazy { DedicatedIpServiceImpl(clientOptions) }

    private val ipPools: IpPoolService by lazy { IpPoolServiceImpl(clientOptions) }

    override fun withRawResponse(): EmailService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmailService =
        EmailServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Purchase and manage dedicated sending IP addresses for your Telnyx email traffic. */
    override fun dedicatedIps(): DedicatedIpService = dedicatedIps

    /** Group dedicated IPs into pools for sending. */
    override fun ipPools(): IpPoolService = ipPools

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EmailService.WithRawResponse {

        private val dedicatedIps: DedicatedIpService.WithRawResponse by lazy {
            DedicatedIpServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val ipPools: IpPoolService.WithRawResponse by lazy {
            IpPoolServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EmailService.WithRawResponse =
            EmailServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Purchase and manage dedicated sending IP addresses for your Telnyx email traffic. */
        override fun dedicatedIps(): DedicatedIpService.WithRawResponse = dedicatedIps

        /** Group dedicated IPs into pools for sending. */
        override fun ipPools(): IpPoolService.WithRawResponse = ipPools
    }
}
