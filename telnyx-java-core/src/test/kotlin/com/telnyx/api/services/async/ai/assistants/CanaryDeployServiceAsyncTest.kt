// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.ai.assistants

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.ai.assistants.canarydeploys.CanaryDeploy
import com.telnyx.api.models.ai.assistants.canarydeploys.CanaryDeployCreateParams
import com.telnyx.api.models.ai.assistants.canarydeploys.CanaryDeployUpdateParams
import com.telnyx.api.models.ai.assistants.canarydeploys.VersionConfig
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CanaryDeployServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val canaryDeployServiceAsync = client.ai().assistants().canaryDeploys()

        val canaryDeployResponseFuture =
            canaryDeployServiceAsync.create(
                CanaryDeployCreateParams.builder()
                    .assistantId("assistant_id")
                    .canaryDeploy(
                        CanaryDeploy.builder()
                            .addVersion(
                                VersionConfig.builder()
                                    .percentage(1.0)
                                    .versionId("version_id")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val canaryDeployResponse = canaryDeployResponseFuture.get()
        canaryDeployResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val canaryDeployServiceAsync = client.ai().assistants().canaryDeploys()

        val canaryDeployResponseFuture = canaryDeployServiceAsync.retrieve("assistant_id")

        val canaryDeployResponse = canaryDeployResponseFuture.get()
        canaryDeployResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val canaryDeployServiceAsync = client.ai().assistants().canaryDeploys()

        val canaryDeployResponseFuture =
            canaryDeployServiceAsync.update(
                CanaryDeployUpdateParams.builder()
                    .assistantId("assistant_id")
                    .canaryDeploy(
                        CanaryDeploy.builder()
                            .addVersion(
                                VersionConfig.builder()
                                    .percentage(1.0)
                                    .versionId("version_id")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val canaryDeployResponse = canaryDeployResponseFuture.get()
        canaryDeployResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val canaryDeployServiceAsync = client.ai().assistants().canaryDeploys()

        val future = canaryDeployServiceAsync.delete("assistant_id")

        val response = future.get()
    }
}
