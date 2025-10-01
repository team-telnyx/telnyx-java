// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.bundlepricing

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.bundlepricing.userbundles.UserBundleCreateParams
import com.telnyx.sdk.models.bundlepricing.userbundles.UserBundleDeactivateParams
import com.telnyx.sdk.models.bundlepricing.userbundles.UserBundleListParams
import com.telnyx.sdk.models.bundlepricing.userbundles.UserBundleListResourcesParams
import com.telnyx.sdk.models.bundlepricing.userbundles.UserBundleListUnusedParams
import com.telnyx.sdk.models.bundlepricing.userbundles.UserBundleRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UserBundleServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userBundleServiceAsync = client.bundlePricing().userBundles()

        val userBundleFuture =
            userBundleServiceAsync.create(
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

        val userBundle = userBundleFuture.get()
        userBundle.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userBundleServiceAsync = client.bundlePricing().userBundles()

        val userBundleFuture =
            userBundleServiceAsync.retrieve(
                UserBundleRetrieveParams.builder()
                    .userBundleId("ca1d2263-d1f1-43ac-ba53-248e7a4bb26a")
                    .authorizationBearer("authorization_bearer")
                    .build()
            )

        val userBundle = userBundleFuture.get()
        userBundle.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userBundleServiceAsync = client.bundlePricing().userBundles()

        val userBundlesFuture =
            userBundleServiceAsync.list(
                UserBundleListParams.builder()
                    .filter(
                        UserBundleListParams.Filter.builder()
                            .addCountryIso("US")
                            .addResource("+15617819942")
                            .build()
                    )
                    .page(UserBundleListParams.Page.builder().number(1L).size(1L).build())
                    .authorizationBearer("authorization_bearer")
                    .build()
            )

        val userBundles = userBundlesFuture.get()
        userBundles.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deactivate() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userBundleServiceAsync = client.bundlePricing().userBundles()

        val responseFuture =
            userBundleServiceAsync.deactivate(
                UserBundleDeactivateParams.builder()
                    .userBundleId("ca1d2263-d1f1-43ac-ba53-248e7a4bb26a")
                    .authorizationBearer("authorization_bearer")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listResources() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userBundleServiceAsync = client.bundlePricing().userBundles()

        val responseFuture =
            userBundleServiceAsync.listResources(
                UserBundleListResourcesParams.builder()
                    .userBundleId("ca1d2263-d1f1-43ac-ba53-248e7a4bb26a")
                    .authorizationBearer("authorization_bearer")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listUnused() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userBundleServiceAsync = client.bundlePricing().userBundles()

        val responseFuture =
            userBundleServiceAsync.listUnused(
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

        val response = responseFuture.get()
        response.validate()
    }
}
