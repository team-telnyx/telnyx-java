// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransferToolTest {

    @Test
    fun create() {
        val transferTool =
            TransferTool.builder()
                .transfer(
                    TransferTool.Transfer.builder()
                        .from("+35319605860")
                        .addTarget(
                            TransferTool.Transfer.Target.builder()
                                .name("Support")
                                .to("+13129457420")
                                .build()
                        )
                        .build()
                )
                .type(TransferTool.Type.TRANSFER)
                .build()

        assertThat(transferTool.transfer())
            .isEqualTo(
                TransferTool.Transfer.builder()
                    .from("+35319605860")
                    .addTarget(
                        TransferTool.Transfer.Target.builder()
                            .name("Support")
                            .to("+13129457420")
                            .build()
                    )
                    .build()
            )
        assertThat(transferTool.type()).isEqualTo(TransferTool.Type.TRANSFER)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transferTool =
            TransferTool.builder()
                .transfer(
                    TransferTool.Transfer.builder()
                        .from("+35319605860")
                        .addTarget(
                            TransferTool.Transfer.Target.builder()
                                .name("Support")
                                .to("+13129457420")
                                .build()
                        )
                        .build()
                )
                .type(TransferTool.Type.TRANSFER)
                .build()

        val roundtrippedTransferTool =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transferTool),
                jacksonTypeRef<TransferTool>(),
            )

        assertThat(roundtrippedTransferTool).isEqualTo(transferTool)
    }
}
