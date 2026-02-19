// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.dialogflowconnections.DialogflowConnectionCreateParams
import com.telnyx.sdk.models.dialogflowconnections.DialogflowConnectionUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DialogflowConnectionServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val dialogflowConnectionService = client.dialogflowConnections()

        val dialogflowConnection =
            dialogflowConnectionService.create(
                DialogflowConnectionCreateParams.builder()
                    .connectionId("connection_id")
                    .serviceAccount(
                        DialogflowConnectionCreateParams.ServiceAccount.builder()
                            .putAdditionalProperty("type", JsonValue.from("bar"))
                            .putAdditionalProperty("project_id", JsonValue.from("bar"))
                            .putAdditionalProperty("private_key_id", JsonValue.from("bar"))
                            .putAdditionalProperty("private_key", JsonValue.from("bar"))
                            .putAdditionalProperty("client_email", JsonValue.from("bar"))
                            .putAdditionalProperty("client_id", JsonValue.from("bar"))
                            .putAdditionalProperty("auth_uri", JsonValue.from("bar"))
                            .putAdditionalProperty("token_uri", JsonValue.from("bar"))
                            .putAdditionalProperty(
                                "auth_provider_x509_cert_url",
                                JsonValue.from("bar"),
                            )
                            .putAdditionalProperty("client_x509_cert_url", JsonValue.from("bar"))
                            .build()
                    )
                    .conversationProfileId("a-VMHLWzTmKjiJw5S6O0-w")
                    .dialogflowApi(DialogflowConnectionCreateParams.DialogflowApi.CX)
                    .environment("development")
                    .location("global")
                    .build()
            )

        dialogflowConnection.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val dialogflowConnectionService = client.dialogflowConnections()

        val dialogflowConnection = dialogflowConnectionService.retrieve("connection_id")

        dialogflowConnection.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val dialogflowConnectionService = client.dialogflowConnections()

        val dialogflowConnection =
            dialogflowConnectionService.update(
                DialogflowConnectionUpdateParams.builder()
                    .connectionId("connection_id")
                    .serviceAccount(
                        DialogflowConnectionUpdateParams.ServiceAccount.builder()
                            .putAdditionalProperty("type", JsonValue.from("bar"))
                            .putAdditionalProperty("project_id", JsonValue.from("bar"))
                            .putAdditionalProperty("private_key_id", JsonValue.from("bar"))
                            .putAdditionalProperty("private_key", JsonValue.from("bar"))
                            .putAdditionalProperty("client_email", JsonValue.from("bar"))
                            .putAdditionalProperty("client_id", JsonValue.from("bar"))
                            .putAdditionalProperty("auth_uri", JsonValue.from("bar"))
                            .putAdditionalProperty("token_uri", JsonValue.from("bar"))
                            .putAdditionalProperty(
                                "auth_provider_x509_cert_url",
                                JsonValue.from("bar"),
                            )
                            .putAdditionalProperty("client_x509_cert_url", JsonValue.from("bar"))
                            .build()
                    )
                    .conversationProfileId("a-VMHLWzTmKjiJw5S6O0-w")
                    .dialogflowApi(DialogflowConnectionUpdateParams.DialogflowApi.CX)
                    .environment("development")
                    .location("global")
                    .build()
            )

        dialogflowConnection.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val dialogflowConnectionService = client.dialogflowConnections()

        dialogflowConnectionService.delete("connection_id")
    }
}
