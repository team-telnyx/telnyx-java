// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dialogflowconnections

import com.telnyx.sdk.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DialogflowConnectionCreateParamsTest {

    @Test
    fun create() {
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
                    .putAdditionalProperty("auth_provider_x509_cert_url", JsonValue.from("bar"))
                    .putAdditionalProperty("client_x509_cert_url", JsonValue.from("bar"))
                    .build()
            )
            .conversationProfileId("a-VMHLWzTmKjiJw5S6O0-w")
            .dialogflowApi(DialogflowConnectionCreateParams.DialogflowApi.CX)
            .environment("development")
            .location("global")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
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
                        .putAdditionalProperty("auth_provider_x509_cert_url", JsonValue.from("bar"))
                        .putAdditionalProperty("client_x509_cert_url", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("connection_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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
                        .putAdditionalProperty("auth_provider_x509_cert_url", JsonValue.from("bar"))
                        .putAdditionalProperty("client_x509_cert_url", JsonValue.from("bar"))
                        .build()
                )
                .conversationProfileId("a-VMHLWzTmKjiJw5S6O0-w")
                .dialogflowApi(DialogflowConnectionCreateParams.DialogflowApi.CX)
                .environment("development")
                .location("global")
                .build()

        val body = params._body()

        assertThat(body.serviceAccount())
            .isEqualTo(
                DialogflowConnectionCreateParams.ServiceAccount.builder()
                    .putAdditionalProperty("type", JsonValue.from("bar"))
                    .putAdditionalProperty("project_id", JsonValue.from("bar"))
                    .putAdditionalProperty("private_key_id", JsonValue.from("bar"))
                    .putAdditionalProperty("private_key", JsonValue.from("bar"))
                    .putAdditionalProperty("client_email", JsonValue.from("bar"))
                    .putAdditionalProperty("client_id", JsonValue.from("bar"))
                    .putAdditionalProperty("auth_uri", JsonValue.from("bar"))
                    .putAdditionalProperty("token_uri", JsonValue.from("bar"))
                    .putAdditionalProperty("auth_provider_x509_cert_url", JsonValue.from("bar"))
                    .putAdditionalProperty("client_x509_cert_url", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.conversationProfileId()).contains("a-VMHLWzTmKjiJw5S6O0-w")
        assertThat(body.dialogflowApi()).contains(DialogflowConnectionCreateParams.DialogflowApi.CX)
        assertThat(body.environment()).contains("development")
        assertThat(body.location()).contains("global")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
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
                        .putAdditionalProperty("auth_provider_x509_cert_url", JsonValue.from("bar"))
                        .putAdditionalProperty("client_x509_cert_url", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.serviceAccount())
            .isEqualTo(
                DialogflowConnectionCreateParams.ServiceAccount.builder()
                    .putAdditionalProperty("type", JsonValue.from("bar"))
                    .putAdditionalProperty("project_id", JsonValue.from("bar"))
                    .putAdditionalProperty("private_key_id", JsonValue.from("bar"))
                    .putAdditionalProperty("private_key", JsonValue.from("bar"))
                    .putAdditionalProperty("client_email", JsonValue.from("bar"))
                    .putAdditionalProperty("client_id", JsonValue.from("bar"))
                    .putAdditionalProperty("auth_uri", JsonValue.from("bar"))
                    .putAdditionalProperty("token_uri", JsonValue.from("bar"))
                    .putAdditionalProperty("auth_provider_x509_cert_url", JsonValue.from("bar"))
                    .putAdditionalProperty("client_x509_cert_url", JsonValue.from("bar"))
                    .build()
            )
    }
}
