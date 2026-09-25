// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.memory.namespaces

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileDeleteParams
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileIngestParams
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileRecallParams
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileRememberParams
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileRetrieveSummaryParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ProfileServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val profileServiceAsync = client.ai().memory().namespaces().profiles()

        val pageFuture = profileServiceAsync.list("namespace")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val profileServiceAsync = client.ai().memory().namespaces().profiles()

        val profileFuture =
            profileServiceAsync.delete(
                ProfileDeleteParams.builder().namespace("namespace").profileId("profile_id").build()
            )

        val profile = profileFuture.get()
        profile.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun ingest() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val profileServiceAsync = client.ai().memory().namespaces().profiles()

        val responseFuture =
            profileServiceAsync.ingest(
                ProfileIngestParams.builder()
                    .namespace("namespace")
                    .profileId("profile_id")
                    .sessionId("session_id")
                    .body(
                        ProfileIngestParams.Body.UnionMember0.builder()
                            .putAdditionalProperty("messages", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun recall() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val profileServiceAsync = client.ai().memory().namespaces().profiles()

        val responseFuture =
            profileServiceAsync.recall(
                ProfileRecallParams.builder()
                    .namespace("namespace")
                    .profileId("profile_id")
                    .query("where do invoices go?")
                    .topK(5L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun remember() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val profileServiceAsync = client.ai().memory().namespaces().profiles()

        val responseFuture =
            profileServiceAsync.remember(
                ProfileRememberParams.builder()
                    .namespace("namespace")
                    .profileId("profile_id")
                    .text("Prefers window seats and flies out of ORD")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveSummary() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val profileServiceAsync = client.ai().memory().namespaces().profiles()

        val responseFuture =
            profileServiceAsync.retrieveSummary(
                ProfileRetrieveSummaryParams.builder()
                    .namespace("namespace")
                    .profileId("profile_id")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
