// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.simcardgroups.SimCardGroupCreateParams
import com.telnyx.sdk.models.simcardgroups.SimCardGroupRetrieveParams
import com.telnyx.sdk.models.simcardgroups.SimCardGroupUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SimCardGroupServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val simCardGroupServiceAsync = client.simCardGroups()

        val pageFuture = simCardGroupServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val simCardGroupServiceAsync = client.simCardGroups()

        val simCardGroupFuture =
            simCardGroupServiceAsync.delete("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val simCardGroup = simCardGroupFuture.get()
        simCardGroup.validate()
    }
}
