// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.billinggroups.BillingGroupCreateParams
import com.telnyx.api.models.billinggroups.BillingGroupListParams
import com.telnyx.api.models.billinggroups.BillingGroupUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BillingGroupServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val billingGroupService = client.billingGroups()

        val billingGroup =
            billingGroupService.create(BillingGroupCreateParams.builder().name("string").build())

        billingGroup.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val billingGroupService = client.billingGroups()

        val billingGroup = billingGroupService.retrieve("f5586561-8ff0-4291-a0ac-84fe544797bd")

        billingGroup.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val billingGroupService = client.billingGroups()

        val billingGroup =
            billingGroupService.update(
                BillingGroupUpdateParams.builder()
                    .id("f5586561-8ff0-4291-a0ac-84fe544797bd")
                    .name("string")
                    .build()
            )

        billingGroup.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val billingGroupService = client.billingGroups()

        val billingGroups =
            billingGroupService.list(
                BillingGroupListParams.builder()
                    .page(BillingGroupListParams.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        billingGroups.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val billingGroupService = client.billingGroups()

        val billingGroup = billingGroupService.delete("f5586561-8ff0-4291-a0ac-84fe544797bd")

        billingGroup.validate()
    }
}
