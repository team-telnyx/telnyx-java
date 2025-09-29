// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.ai.assistants

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.ai.assistants.canarydeploys.CanaryDeploy
import com.telnyx.api.models.ai.assistants.canarydeploys.CanaryDeployCreateParams
import com.telnyx.api.models.ai.assistants.canarydeploys.CanaryDeployUpdateParams
import com.telnyx.api.models.ai.assistants.canarydeploys.VersionConfig
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CanaryDeployServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val canaryDeployService = client.ai().assistants().canaryDeploys()

        val canaryDeployResponse =
            canaryDeployService.create(
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

        canaryDeployResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val canaryDeployService = client.ai().assistants().canaryDeploys()

        val canaryDeployResponse = canaryDeployService.retrieve("assistant_id")

        canaryDeployResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val canaryDeployService = client.ai().assistants().canaryDeploys()

        val canaryDeployResponse =
            canaryDeployService.update(
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

        canaryDeployResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val canaryDeployService = client.ai().assistants().canaryDeploys()

        canaryDeployService.delete("assistant_id")
    }
}
