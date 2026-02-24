// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.billinggroups.BillingGroupCreateParams
import com.telnyx.sdk.models.billinggroups.BillingGroupUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BillingGroupServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val billingGroupService = client.billingGroups()

        val billingGroup =
            billingGroupService.create(BillingGroupCreateParams.builder().name("string").build())

        billingGroup.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val billingGroupService = client.billingGroups()

        val billingGroup = billingGroupService.retrieve("f5586561-8ff0-4291-a0ac-84fe544797bd")

        billingGroup.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val billingGroupService = client.billingGroups()

        val page = billingGroupService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val billingGroupService = client.billingGroups()

        val billingGroup = billingGroupService.delete("f5586561-8ff0-4291-a0ac-84fe544797bd")

        billingGroup.validate()
    }
}
