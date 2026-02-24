// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.globalipassignments.GlobalIpAssignment
import com.telnyx.sdk.models.globalipassignments.GlobalIpAssignmentUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class GlobalIpAssignmentServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val globalIpAssignmentServiceAsync = client.globalIpAssignments()

        val globalIpAssignmentFuture =
            globalIpAssignmentServiceAsync.create(
                GlobalIpAssignment.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .recordType("sample_record_type")
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .build()
            )

        val globalIpAssignment = globalIpAssignmentFuture.get()
        globalIpAssignment.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val globalIpAssignmentServiceAsync = client.globalIpAssignments()

        val globalIpAssignmentFuture =
            globalIpAssignmentServiceAsync.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val globalIpAssignment = globalIpAssignmentFuture.get()
        globalIpAssignment.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val globalIpAssignmentServiceAsync = client.globalIpAssignments()

        val globalIpAssignmentFuture =
            globalIpAssignmentServiceAsync.update(
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

        val globalIpAssignment = globalIpAssignmentFuture.get()
        globalIpAssignment.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val globalIpAssignmentServiceAsync = client.globalIpAssignments()

        val pageFuture = globalIpAssignmentServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val globalIpAssignmentServiceAsync = client.globalIpAssignments()

        val globalIpAssignmentFuture =
            globalIpAssignmentServiceAsync.delete("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val globalIpAssignment = globalIpAssignmentFuture.get()
        globalIpAssignment.validate()
    }
}
