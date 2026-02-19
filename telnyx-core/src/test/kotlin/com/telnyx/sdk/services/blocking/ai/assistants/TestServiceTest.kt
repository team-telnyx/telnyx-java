// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.assistants

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.ai.assistants.tests.TelnyxConversationChannel
import com.telnyx.sdk.models.ai.assistants.tests.TestCreateParams
import com.telnyx.sdk.models.ai.assistants.tests.TestUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TestServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val testService = client.ai().assistants().tests()

        val assistantTest =
            testService.create(
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

        assistantTest.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val testService = client.ai().assistants().tests()

        val assistantTest = testService.retrieve("test_id")

        assistantTest.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val testService = client.ai().assistants().tests()

        val assistantTest =
            testService.update(
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

        assistantTest.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val testService = client.ai().assistants().tests()

        val page = testService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val testService = client.ai().assistants().tests()

        testService.delete("test_id")
    }
}
