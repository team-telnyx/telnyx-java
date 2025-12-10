// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.externalconnections

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.externalconnections.releases.ReleaseListParams
import com.telnyx.sdk.models.externalconnections.releases.ReleaseRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ReleaseServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val releaseServiceAsync = client.externalConnections().releases()

        val releaseFuture =
            releaseServiceAsync.retrieve(
                ReleaseRetrieveParams.builder()
                    .id("id")
                    .releaseId("7b6a6449-b055-45a6-81f6-f6f0dffa4cc6")
                    .build()
            )

        val release = releaseFuture.get()
        release.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val releaseServiceAsync = client.externalConnections().releases()

        val releasesFuture =
            releaseServiceAsync.list(
                ReleaseListParams.builder()
                    .id("id")
                    .filter(
                        ReleaseListParams.Filter.builder()
                            .civicAddressId(
                                ReleaseListParams.Filter.CivicAddressId.builder()
                                    .eq("19990261512338516954")
                                    .build()
                            )
                            .locationId(
                                ReleaseListParams.Filter.LocationId.builder()
                                    .eq("19995665508264022121")
                                    .build()
                            )
                            .phoneNumber(
                                ReleaseListParams.Filter.PhoneNumber.builder()
                                    .contains("+123")
                                    .eq("+1234567890")
                                    .build()
                            )
                            .status(
                                ReleaseListParams.Filter.Status.builder()
                                    .addEq(ReleaseListParams.Filter.Status.Eq.PENDING)
                                    .addEq(ReleaseListParams.Filter.Status.Eq.IN_PROGRESS)
                                    .build()
                            )
                            .build()
                    )
                    .page(ReleaseListParams.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        val releases = releasesFuture.get()
        releases.validate()
    }
}
