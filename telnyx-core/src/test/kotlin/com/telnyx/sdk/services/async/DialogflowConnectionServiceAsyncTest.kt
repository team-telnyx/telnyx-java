// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.dialogflowconnections.DialogflowConnectionCreateParams
import com.telnyx.sdk.models.dialogflowconnections.DialogflowConnectionUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DialogflowConnectionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val dialogflowConnectionServiceAsync = client.dialogflowConnections()

        val dialogflowConnectionFuture =
            dialogflowConnectionServiceAsync.create(
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

        val dialogflowConnection = dialogflowConnectionFuture.get()
        dialogflowConnection.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val dialogflowConnectionServiceAsync = client.dialogflowConnections()

        val dialogflowConnectionFuture = dialogflowConnectionServiceAsync.retrieve("connection_id")

        val dialogflowConnection = dialogflowConnectionFuture.get()
        dialogflowConnection.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val dialogflowConnectionServiceAsync = client.dialogflowConnections()

        val dialogflowConnectionFuture =
            dialogflowConnectionServiceAsync.update(
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

        val dialogflowConnection = dialogflowConnectionFuture.get()
        dialogflowConnection.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val dialogflowConnectionServiceAsync = client.dialogflowConnections()

        val future = dialogflowConnectionServiceAsync.delete("connection_id")

        val response = future.get()
    }
}
