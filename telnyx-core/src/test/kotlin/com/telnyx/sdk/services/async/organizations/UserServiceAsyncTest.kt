// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.organizations

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.organizations.users.UserGetGroupsReportParams
import com.telnyx.sdk.models.organizations.users.UserRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UserServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userServiceAsync = client.organizations().users()

        val userFuture =
            userServiceAsync.retrieve(
                UserRetrieveParams.builder().id("id").includeGroups(true).build()
            )

        val user = userFuture.get()
        user.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userServiceAsync = client.organizations().users()

        val pageFuture = userServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getGroupsReport() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userServiceAsync = client.organizations().users()

        val responseFuture =
            userServiceAsync.getGroupsReport(
                UserGetGroupsReportParams.builder()
                    .accept(UserGetGroupsReportParams.Accept.APPLICATION_JSON)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
