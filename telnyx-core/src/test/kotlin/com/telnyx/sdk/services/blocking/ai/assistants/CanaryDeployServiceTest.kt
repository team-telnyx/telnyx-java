// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.assistants

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.ai.assistants.canarydeploys.CanaryDeploy
import com.telnyx.sdk.models.ai.assistants.canarydeploys.CanaryDeployCreateParams
import com.telnyx.sdk.models.ai.assistants.canarydeploys.CanaryDeployUpdateParams
import com.telnyx.sdk.models.ai.assistants.canarydeploys.Clause
import com.telnyx.sdk.models.ai.assistants.canarydeploys.RolloutSlot
import com.telnyx.sdk.models.ai.assistants.canarydeploys.RuleInput
import com.telnyx.sdk.models.ai.assistants.canarydeploys.Serve
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
                                RuleInput.builder()
                                    .serve(
                                        Serve.builder()
                                            .addRollout(
                                                RolloutSlot.builder()
                                                    .versionId("version_id")
                                                    .weight(0.0)
                                                    .build()
                                            )
                                            .versionId("version_id")
                                            .build()
                                    )
                                    .addMatch(
                                        Clause.builder()
                                            .attribute("attribute")
                                            .operator(Clause.Operator.IN)
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
                                RuleInput.builder()
                                    .serve(
                                        Serve.builder()
                                            .addRollout(
                                                RolloutSlot.builder()
                                                    .versionId("version_id")
                                                    .weight(0.0)
                                                    .build()
                                            )
                                            .versionId("version_id")
                                            .build()
                                    )
                                    .addMatch(
                                        Clause.builder()
                                            .attribute("attribute")
                                            .operator(Clause.Operator.IN)
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
