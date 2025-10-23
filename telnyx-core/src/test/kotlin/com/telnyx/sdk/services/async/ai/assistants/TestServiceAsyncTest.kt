// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.assistants

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.ai.assistants.tests.TelnyxConversationChannel
import com.telnyx.sdk.models.ai.assistants.tests.TestCreateParams
import com.telnyx.sdk.models.ai.assistants.tests.TestListParams
import com.telnyx.sdk.models.ai.assistants.tests.TestUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TestServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val testServiceAsync = client.ai().assistants().tests()

        val assistantTestFuture =
            testServiceAsync.create(
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

        val assistantTest = assistantTestFuture.get()
        assistantTest.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val testServiceAsync = client.ai().assistants().tests()

        val assistantTestFuture = testServiceAsync.retrieve("test_id")

        val assistantTest = assistantTestFuture.get()
        assistantTest.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val testServiceAsync = client.ai().assistants().tests()

        val testsFuture =
            testServiceAsync.list(
                TestListParams.builder()
                    .destination("destination")
                    .page(TestListParams.Page.builder().number(1L).size(1L).build())
                    .telnyxConversationChannel("telnyx_conversation_channel")
                    .testSuite("test_suite")
                    .build()
            )

        val tests = testsFuture.get()
        tests.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val testServiceAsync = client.ai().assistants().tests()

        val testFuture = testServiceAsync.delete("test_id")

        val test = testFuture.get()
        test.validate()
    }
}
