// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.ai.assistants

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.ai.assistants.tests.TelnyxConversationChannel
import com.telnyx.api.models.ai.assistants.tests.TestCreateParams
import com.telnyx.api.models.ai.assistants.tests.TestListParams
import com.telnyx.api.models.ai.assistants.tests.TestUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TestServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val testService = client.ai().assistants().tests()

        val assistantTest =
            testService.create(
                TestCreateParams.builder()
                    .destination("x")
                    .instructions("x")
                    .name("x")
                    .addRubric(
                        TestCreateParams.Rubric.builder().criteria("criteria").name("name").build()
                    )
                    .description("description")
                    .maxDurationSeconds(1L)
                    .telnyxConversationChannel(TelnyxConversationChannel.PHONE_CALL)
                    .testSuite("test_suite")
                    .build()
            )

        assistantTest.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val testService = client.ai().assistants().tests()

        val assistantTest = testService.retrieve("test_id")

        assistantTest.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val testService = client.ai().assistants().tests()

        val tests =
            testService.list(
                TestListParams.builder()
                    .destination("destination")
                    .page(TestListParams.Page.builder().number(1L).size(1L).build())
                    .telnyxConversationChannel("telnyx_conversation_channel")
                    .testSuite("test_suite")
                    .build()
            )

        tests.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val testService = client.ai().assistants().tests()

        val test = testService.delete("test_id")

        test.validate()
    }
}
