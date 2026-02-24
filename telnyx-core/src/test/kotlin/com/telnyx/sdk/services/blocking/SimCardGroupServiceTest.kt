// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.simcardgroups.SimCardGroupCreateParams
import com.telnyx.sdk.models.simcardgroups.SimCardGroupRetrieveParams
import com.telnyx.sdk.models.simcardgroups.SimCardGroupUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SimCardGroupServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val simCardGroupService = client.simCardGroups()

        val page = simCardGroupService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val simCardGroupService = client.simCardGroups()

        val simCardGroup = simCardGroupService.delete("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        simCardGroup.validate()
    }
}
