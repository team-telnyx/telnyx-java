// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.assistants

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.ai.assistants.canarydeploys.CanaryDeploy
import com.telnyx.sdk.models.ai.assistants.canarydeploys.CanaryDeployCreateParams
import com.telnyx.sdk.models.ai.assistants.canarydeploys.CanaryDeployUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CanaryDeployServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val canaryDeployService = client.ai().assistants().canaryDeploys()

        val canaryDeployResponse =
            canaryDeployService.create(
                CanaryDeployCreateParams.builder()
                    .assistantId("assistant_id")
                    .canaryDeploy(
                        CanaryDeploy.builder()
                            .addRule(
                                CanaryDeploy.Rule.builder()
                                    .serve(
                                        CanaryDeploy.Rule.Serve.builder()
                                            .addRollout(
                                                CanaryDeploy.Rule.Serve.Rollout.builder()
                                                    .versionId("version_id")
                                                    .weight(0.0)
                                                    .build()
                                            )
                                            .versionId("version_id")
                                            .build()
                                    )
                                    .addMatch(
                                        CanaryDeploy.Rule.Match.builder()
                                            .attribute("attribute")
                                            .operator(CanaryDeploy.Rule.Match.Operator.IN)
                                            .addValue("string")
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        canaryDeployResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val canaryDeployService = client.ai().assistants().canaryDeploys()

        val canaryDeployResponse = canaryDeployService.retrieve("assistant_id")

        canaryDeployResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val canaryDeployService = client.ai().assistants().canaryDeploys()

        val canaryDeployResponse =
            canaryDeployService.update(
                CanaryDeployUpdateParams.builder()
                    .assistantId("assistant_id")
                    .canaryDeploy(
                        CanaryDeploy.builder()
                            .addRule(
                                CanaryDeploy.Rule.builder()
                                    .serve(
                                        CanaryDeploy.Rule.Serve.builder()
                                            .addRollout(
                                                CanaryDeploy.Rule.Serve.Rollout.builder()
                                                    .versionId("version_id")
                                                    .weight(0.0)
                                                    .build()
                                            )
                                            .versionId("version_id")
                                            .build()
                                    )
                                    .addMatch(
                                        CanaryDeploy.Rule.Match.builder()
                                            .attribute("attribute")
                                            .operator(CanaryDeploy.Rule.Match.Operator.IN)
                                            .addValue("string")
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        canaryDeployResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val canaryDeployService = client.ai().assistants().canaryDeploys()

        canaryDeployService.delete("assistant_id")
    }
}
