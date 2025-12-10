// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.simcardgroups.SimCardGroupCreateParams
import com.telnyx.sdk.models.simcardgroups.SimCardGroupListParams
import com.telnyx.sdk.models.simcardgroups.SimCardGroupRetrieveParams
import com.telnyx.sdk.models.simcardgroups.SimCardGroupUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SimCardGroupServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val simCardGroupService = client.simCardGroups()

        val simCardGroup =
            simCardGroupService.create(
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

        simCardGroup.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val simCardGroupService = client.simCardGroups()

        val simCardGroup =
            simCardGroupService.retrieve(
                SimCardGroupRetrieveParams.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .includeIccids(true)
                    .build()
            )

        simCardGroup.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val simCardGroupService = client.simCardGroups()

        val simCardGroup =
            simCardGroupService.update(
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

        simCardGroup.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val simCardGroupService = client.simCardGroups()

        val simCardGroups =
            simCardGroupService.list(
                SimCardGroupListParams.builder()
                    .filterName("1119e3cb-f39d-4254-ad38-9080d5fe90a9")
                    .filterPrivateWirelessGatewayId("7606c6d3-ff7c-49c1-943d-68879e9d584d")
                    .filterWirelessBlocklistId("0f3f490e-c4d3-4cf5-838a-9970f10ee259")
                    .pageNumber(1L)
                    .pageSize(1L)
                    .build()
            )

        simCardGroups.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val simCardGroupService = client.simCardGroups()

        val simCardGroup = simCardGroupService.delete("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        simCardGroup.validate()
    }
}
