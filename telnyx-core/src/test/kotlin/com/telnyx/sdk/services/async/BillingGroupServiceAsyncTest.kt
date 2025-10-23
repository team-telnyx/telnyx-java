// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.billinggroups.BillingGroupCreateParams
import com.telnyx.sdk.models.billinggroups.BillingGroupListParams
import com.telnyx.sdk.models.billinggroups.BillingGroupUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BillingGroupServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val billingGroupServiceAsync = client.billingGroups()

        val billingGroupFuture =
            billingGroupServiceAsync.create(
                BillingGroupCreateParams.builder().name("string").build()
            )

        val billingGroup = billingGroupFuture.get()
        billingGroup.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val billingGroupServiceAsync = client.billingGroups()

        val billingGroupFuture =
            billingGroupServiceAsync.retrieve("f5586561-8ff0-4291-a0ac-84fe544797bd")

        val billingGroup = billingGroupFuture.get()
        billingGroup.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val billingGroupServiceAsync = client.billingGroups()

        val billingGroupFuture =
            billingGroupServiceAsync.update(
                BillingGroupUpdateParams.builder()
                    .id("f5586561-8ff0-4291-a0ac-84fe544797bd")
                    .name("string")
                    .build()
            )

        val billingGroup = billingGroupFuture.get()
        billingGroup.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val billingGroupServiceAsync = client.billingGroups()

        val billingGroupsFuture =
            billingGroupServiceAsync.list(
                BillingGroupListParams.builder()
                    .page(BillingGroupListParams.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        val billingGroups = billingGroupsFuture.get()
        billingGroups.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val billingGroupServiceAsync = client.billingGroups()

        val billingGroupFuture =
            billingGroupServiceAsync.delete("f5586561-8ff0-4291-a0ac-84fe544797bd")

        val billingGroup = billingGroupFuture.get()
        billingGroup.validate()
    }
}
