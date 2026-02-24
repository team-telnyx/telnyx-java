// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.assistants

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.ai.assistants.canarydeploys.CanaryDeploy
import com.telnyx.sdk.models.ai.assistants.canarydeploys.CanaryDeployCreateParams
import com.telnyx.sdk.models.ai.assistants.canarydeploys.CanaryDeployUpdateParams
import com.telnyx.sdk.models.ai.assistants.canarydeploys.VersionConfig
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CanaryDeployServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val canaryDeployServiceAsync = client.ai().assistants().canaryDeploys()

        val canaryDeployResponseFuture = canaryDeployServiceAsync.retrieve("assistant_id")

        val canaryDeployResponse = canaryDeployResponseFuture.get()
        canaryDeployResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val canaryDeployServiceAsync = client.ai().assistants().canaryDeploys()

        val future = canaryDeployServiceAsync.delete("assistant_id")

        val response = future.get()
    }
}
