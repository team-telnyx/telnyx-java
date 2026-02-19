// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.organizations

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.organizations.users.UserGetGroupsReportParams
import com.telnyx.sdk.models.organizations.users.UserRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val userService = client.organizations().users()

        val user =
            userService.retrieve(UserRetrieveParams.builder().id("id").includeGroups(true).build())

        user.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val userService = client.organizations().users()

        val page = userService.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getGroupsReport() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val userService = client.organizations().users()

        val response =
            userService.getGroupsReport(
                UserGetGroupsReportParams.builder()
                    .accept(UserGetGroupsReportParams.Accept.APPLICATION_JSON)
                    .build()
            )

        response.validate()
    }
}
