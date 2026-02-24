// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.globalipassignments.GlobalIpAssignment
import com.telnyx.sdk.models.globalipassignments.GlobalIpAssignmentUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class GlobalIpAssignmentServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val globalIpAssignmentService = client.globalIpAssignments()

        val globalIpAssignment =
            globalIpAssignmentService.create(
                GlobalIpAssignment.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .recordType("sample_record_type")
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .build()
            )

        globalIpAssignment.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val globalIpAssignmentService = client.globalIpAssignments()

        val globalIpAssignment =
            globalIpAssignmentService.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        globalIpAssignment.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val globalIpAssignmentService = client.globalIpAssignments()

        val globalIpAssignment =
            globalIpAssignmentService.update(
                GlobalIpAssignmentUpdateParams.builder()
                    .globalIpAssignmentId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .recordType("sample_record_type")
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .globalIpId("global_ip_id")
                    .wireguardPeerId("wireguard_peer_id")
                    .build()
            )

        globalIpAssignment.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val globalIpAssignmentService = client.globalIpAssignments()

        val page = globalIpAssignmentService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val globalIpAssignmentService = client.globalIpAssignments()

        val globalIpAssignment =
            globalIpAssignmentService.delete("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        globalIpAssignment.validate()
    }
}
