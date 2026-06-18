// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.bundlepricing

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.bundlepricing.userbundles.UserBundleCreateParams
import com.telnyx.sdk.models.bundlepricing.userbundles.UserBundleDeactivateParams
import com.telnyx.sdk.models.bundlepricing.userbundles.UserBundleListResourcesParams
import com.telnyx.sdk.models.bundlepricing.userbundles.UserBundleListUnusedParams
import com.telnyx.sdk.models.bundlepricing.userbundles.UserBundleRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserBundleServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val userBundleService = client.bundlePricing().userBundles()

        val userBundle =
            userBundleService.create(
                UserBundleCreateParams.builder()
                    .authorizationBearer("authorization_bearer")
                    .idempotencyKey("12ade33a-21c0-473b-b055-b3c836e1c292")
                    .addItem(
                        UserBundleCreateParams.Item.builder()
                            .billingBundleId("12ade33a-21c0-473b-b055-b3c836e1c292")
                            .quantity(0L)
                            .build()
                    )
                    .build()
            )

        userBundle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val userBundleService = client.bundlePricing().userBundles()

        val userBundle =
            userBundleService.retrieve(
                UserBundleRetrieveParams.builder()
                    .userBundleId("ca1d2263-d1f1-43ac-ba53-248e7a4bb26a")
                    .authorizationBearer("authorization_bearer")
                    .build()
            )

        userBundle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val userBundleService = client.bundlePricing().userBundles()

        val page = userBundleService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deactivate() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val userBundleService = client.bundlePricing().userBundles()

        val response =
            userBundleService.deactivate(
                UserBundleDeactivateParams.builder()
                    .userBundleId("ca1d2263-d1f1-43ac-ba53-248e7a4bb26a")
                    .authorizationBearer("authorization_bearer")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listResources() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val userBundleService = client.bundlePricing().userBundles()

        val response =
            userBundleService.listResources(
                UserBundleListResourcesParams.builder()
                    .userBundleId("ca1d2263-d1f1-43ac-ba53-248e7a4bb26a")
                    .authorizationBearer("authorization_bearer")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listUnused() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val userBundleService = client.bundlePricing().userBundles()

        val response =
            userBundleService.listUnused(
                UserBundleListUnusedParams.builder()
                    .filter(
                        UserBundleListUnusedParams.Filter.builder()
                            .addCountryIso("US")
                            .addResource("+15617819942")
                            .build()
                    )
                    .authorizationBearer("authorization_bearer")
                    .build()
            )

        response.validate()
    }
}
