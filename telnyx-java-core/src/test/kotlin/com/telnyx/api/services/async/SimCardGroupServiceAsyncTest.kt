// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.simcardgroups.SimCardGroupCreateParams
import com.telnyx.api.models.simcardgroups.SimCardGroupListParams
import com.telnyx.api.models.simcardgroups.SimCardGroupRetrieveParams
import com.telnyx.api.models.simcardgroups.SimCardGroupUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SimCardGroupServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val simCardGroupServiceAsync = client.simCardGroups()

        val simCardGroupFuture =
            simCardGroupServiceAsync.create(
                SimCardGroupCreateParams.builder()
                    .name("My Test Group")
                    .dataLimit(
                        SimCardGroupCreateParams.DataLimit.builder()
                            .amount("2048.1")
                            .unit("MB")
                            .build()
                    )
                    .build()
            )

        val simCardGroup = simCardGroupFuture.get()
        simCardGroup.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val simCardGroupServiceAsync = client.simCardGroups()

        val simCardGroupFuture =
            simCardGroupServiceAsync.retrieve(
                SimCardGroupRetrieveParams.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .includeIccids(true)
                    .build()
            )

        val simCardGroup = simCardGroupFuture.get()
        simCardGroup.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val simCardGroupServiceAsync = client.simCardGroups()

        val simCardGroupFuture =
            simCardGroupServiceAsync.update(
                SimCardGroupUpdateParams.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .dataLimit(
                        SimCardGroupUpdateParams.DataLimit.builder()
                            .amount("2048.1")
                            .unit("MB")
                            .build()
                    )
                    .name("My Test Group")
                    .build()
            )

        val simCardGroup = simCardGroupFuture.get()
        simCardGroup.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val simCardGroupServiceAsync = client.simCardGroups()

        val simCardGroupsFuture =
            simCardGroupServiceAsync.list(
                SimCardGroupListParams.builder()
                    .filterName("My Test Group")
                    .filterPrivateWirelessGatewayId("7606c6d3-ff7c-49c1-943d-68879e9d584d")
                    .filterWirelessBlocklistId("0f3f490e-c4d3-4cf5-838a-9970f10ee259")
                    .pageNumber(1L)
                    .pageSize(1L)
                    .build()
            )

        val simCardGroups = simCardGroupsFuture.get()
        simCardGroups.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val simCardGroupServiceAsync = client.simCardGroups()

        val simCardGroupFuture =
            simCardGroupServiceAsync.delete("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val simCardGroup = simCardGroupFuture.get()
        simCardGroup.validate()
    }
}
