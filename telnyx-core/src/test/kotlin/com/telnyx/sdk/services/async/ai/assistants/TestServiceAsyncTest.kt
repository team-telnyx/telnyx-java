// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.assistants

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.ai.assistants.tests.TelnyxConversationChannel
import com.telnyx.sdk.models.ai.assistants.tests.TestCreateParams
import com.telnyx.sdk.models.ai.assistants.tests.TestUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TestServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val testServiceAsync = client.ai().assistants().tests()

        val assistantTestFuture =
            testServiceAsync.create(
                TestCreateParams.builder()
                    .destination("+15551234567")
                    .instructions(
                        "Act as a frustrated customer who received a damaged product. Ask for a refund and escalate if not satisfied with the initial response."
                    )
                    .name("Customer Support Bot Test")
                    .addRubric(
                        TestCreateParams.Rubric.builder()
                            .criteria("Assistant responds within 30 seconds")
                            .name("Response Time")
                            .build()
                    )
                    .addRubric(
                        TestCreateParams.Rubric.builder()
                            .criteria("Provides correct product information")
                            .name("Accuracy")
                            .build()
                    )
                    .description("description")
                    .maxDurationSeconds(1L)
                    .telnyxConversationChannel(TelnyxConversationChannel.WEB_CHAT)
                    .testSuite("test_suite")
                    .build()
            )

        val assistantTest = assistantTestFuture.get()
        assistantTest.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val testServiceAsync = client.ai().assistants().tests()

        val assistantTestFuture = testServiceAsync.retrieve("test_id")

        val assistantTest = assistantTestFuture.get()
        assistantTest.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val testServiceAsync = client.ai().assistants().tests()

        val assistantTestFuture =
            testServiceAsync.update(
                TestUpdateParams.builder()
                    .testId("test_id")
                    .description("description")
                    .destination("x")
                    .instructions("x")
                    .maxDurationSeconds(1L)
                    .name("x")
                    .addRubric(
                        TestUpdateParams.Rubric.builder().criteria("criteria").name("name").build()
                    )
                    .telnyxConversationChannel(TelnyxConversationChannel.PHONE_CALL)
                    .testSuite("test_suite")
                    .build()
            )

        val assistantTest = assistantTestFuture.get()
        assistantTest.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val testServiceAsync = client.ai().assistants().tests()

        val pageFuture = testServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val testServiceAsync = client.ai().assistants().tests()

        val future = testServiceAsync.delete("test_id")

        val response = future.get()
    }
}
