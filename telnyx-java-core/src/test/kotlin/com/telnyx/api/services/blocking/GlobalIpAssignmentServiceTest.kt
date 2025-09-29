// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.globalipassignments.GlobalIpAssignment
import com.telnyx.api.models.globalipassignments.GlobalIpAssignmentListParams
import com.telnyx.api.models.globalipassignments.GlobalIpAssignmentUpdateParams
import com.telnyx.api.models.networks.InterfaceStatus
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class GlobalIpAssignmentServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val globalIpAssignmentService = client.globalIpAssignments()

        val globalIpAssignment =
            globalIpAssignmentService.create(
                GlobalIpAssignment.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .recordType("global_ip_assignment")
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .globalIpId("a836125b-20b6-452e-9c03-2653f09c7ed7")
                    .isAnnounced(true)
                    .isConnected(true)
                    .isInMaintenance(true)
                    .status(InterfaceStatus.PROVISIONED)
                    .wireguardPeerId("e66c496d-4a85-423b-8b2a-8e63fac20320")
                    .build()
            )

        globalIpAssignment.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val globalIpAssignmentService = client.globalIpAssignments()

        val globalIpAssignment =
            globalIpAssignmentService.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        globalIpAssignment.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val globalIpAssignmentService = client.globalIpAssignments()

        val globalIpAssignment =
            globalIpAssignmentService.update(
                GlobalIpAssignmentUpdateParams.builder()
                    .pathId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .recordType("sample_record_type")
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .globalIpId("a836125b-20b6-452e-9c03-2653f09c7ed7")
                    .isAnnounced(true)
                    .isConnected(true)
                    .isInMaintenance(true)
                    .status(InterfaceStatus.PROVISIONED)
                    .wireguardPeerId("e66c496d-4a85-423b-8b2a-8e63fac20320")
                    .build()
            )

        globalIpAssignment.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val globalIpAssignmentService = client.globalIpAssignments()

        val globalIpAssignments =
            globalIpAssignmentService.list(
                GlobalIpAssignmentListParams.builder()
                    .page(GlobalIpAssignmentListParams.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        globalIpAssignments.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val globalIpAssignmentService = client.globalIpAssignments()

        val globalIpAssignment =
            globalIpAssignmentService.delete("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        globalIpAssignment.validate()
    }
}
