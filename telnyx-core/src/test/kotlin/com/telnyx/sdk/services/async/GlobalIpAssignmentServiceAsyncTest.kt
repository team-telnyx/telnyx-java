// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.globalipassignments.GlobalIpAssignment
import com.telnyx.sdk.models.globalipassignments.GlobalIpAssignmentListParams
import com.telnyx.sdk.models.globalipassignments.GlobalIpAssignmentUpdateParams
import com.telnyx.sdk.models.networks.InterfaceStatus
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class GlobalIpAssignmentServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val globalIpAssignmentServiceAsync = client.globalIpAssignments()

        val globalIpAssignmentFuture =
            globalIpAssignmentServiceAsync.create(
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

        val globalIpAssignment = globalIpAssignmentFuture.get()
        globalIpAssignment.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val globalIpAssignmentServiceAsync = client.globalIpAssignments()

        val globalIpAssignmentFuture =
            globalIpAssignmentServiceAsync.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val globalIpAssignment = globalIpAssignmentFuture.get()
        globalIpAssignment.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val globalIpAssignmentServiceAsync = client.globalIpAssignments()

        val globalIpAssignmentFuture =
            globalIpAssignmentServiceAsync.update(
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

        val globalIpAssignment = globalIpAssignmentFuture.get()
        globalIpAssignment.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val globalIpAssignmentServiceAsync = client.globalIpAssignments()

        val globalIpAssignmentsFuture =
            globalIpAssignmentServiceAsync.list(
                GlobalIpAssignmentListParams.builder()
                    .page(GlobalIpAssignmentListParams.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        val globalIpAssignments = globalIpAssignmentsFuture.get()
        globalIpAssignments.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val globalIpAssignmentServiceAsync = client.globalIpAssignments()

        val globalIpAssignmentFuture =
            globalIpAssignmentServiceAsync.delete("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val globalIpAssignment = globalIpAssignmentFuture.get()
        globalIpAssignment.validate()
    }
}
