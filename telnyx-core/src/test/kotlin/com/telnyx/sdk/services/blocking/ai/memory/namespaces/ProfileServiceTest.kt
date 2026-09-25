// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.memory.namespaces

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileDeleteParams
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileIngestParams
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileRecallParams
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileRememberParams
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileRetrieveSummaryParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ProfileServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val profileService = client.ai().memory().namespaces().profiles()

        val page = profileService.list("namespace")

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val profileService = client.ai().memory().namespaces().profiles()

        val profile =
            profileService.delete(
                ProfileDeleteParams.builder().namespace("namespace").profileId("profile_id").build()
            )

        profile.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun ingest() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val profileService = client.ai().memory().namespaces().profiles()

        val response =
            profileService.ingest(
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

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun recall() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val profileService = client.ai().memory().namespaces().profiles()

        val response =
            profileService.recall(
                ProfileRecallParams.builder()
                    .namespace("namespace")
                    .profileId("profile_id")
                    .query("where do invoices go?")
                    .topK(5L)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun remember() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val profileService = client.ai().memory().namespaces().profiles()

        val response =
            profileService.remember(
                ProfileRememberParams.builder()
                    .namespace("namespace")
                    .profileId("profile_id")
                    .text("Prefers window seats and flies out of ORD")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveSummary() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val profileService = client.ai().memory().namespaces().profiles()

        val response =
            profileService.retrieveSummary(
                ProfileRetrieveSummaryParams.builder()
                    .namespace("namespace")
                    .profileId("profile_id")
                    .build()
            )

        response.validate()
    }
}
