// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.canarydeploys

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RuleOutputTest {

    @Test
    fun create() {
        val ruleOutput =
            RuleOutput.builder()
                .serve(
                    Serve.builder()
                        .addRollout(
                            RolloutSlot.builder().versionId("version_id").weight(0.0).build()
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

        assertThat(ruleOutput.serve())
            .isEqualTo(
                Serve.builder()
                    .addRollout(RolloutSlot.builder().versionId("version_id").weight(0.0).build())
                    .versionId("version_id")
                    .build()
            )
        assertThat(ruleOutput.match().getOrNull())
            .containsExactly(
                Clause.builder()
                    .attribute("attribute")
                    .operator(Clause.Operator.IN)
                    .addValue("string")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ruleOutput =
            RuleOutput.builder()
                .serve(
                    Serve.builder()
                        .addRollout(
                            RolloutSlot.builder().versionId("version_id").weight(0.0).build()
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

        val roundtrippedRuleOutput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ruleOutput),
                jacksonTypeRef<RuleOutput>(),
            )

        assertThat(roundtrippedRuleOutput).isEqualTo(ruleOutput)
    }
}
