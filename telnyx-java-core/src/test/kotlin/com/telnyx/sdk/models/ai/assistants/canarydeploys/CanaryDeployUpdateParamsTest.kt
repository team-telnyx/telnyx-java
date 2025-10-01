// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.canarydeploys

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CanaryDeployUpdateParamsTest {

    @Test
    fun create() {
        CanaryDeployUpdateParams.builder()
            .assistantId("assistant_id")
            .canaryDeploy(
                CanaryDeploy.builder()
                    .addVersion(
                        VersionConfig.builder().percentage(1.0).versionId("version_id").build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CanaryDeployUpdateParams.builder()
                .assistantId("assistant_id")
                .canaryDeploy(
                    CanaryDeploy.builder()
                        .addVersion(
                            VersionConfig.builder().percentage(1.0).versionId("version_id").build()
                        )
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("assistant_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CanaryDeployUpdateParams.builder()
                .assistantId("assistant_id")
                .canaryDeploy(
                    CanaryDeploy.builder()
                        .addVersion(
                            VersionConfig.builder().percentage(1.0).versionId("version_id").build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CanaryDeploy.builder()
                    .addVersion(
                        VersionConfig.builder().percentage(1.0).versionId("version_id").build()
                    )
                    .build()
            )
    }
}
