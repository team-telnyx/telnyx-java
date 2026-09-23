// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.machinepayments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MachinePaymentAccountCreditResponseTest {

    @Test
    fun create() {
        val machinePaymentAccountCreditResponse =
            MachinePaymentAccountCreditResponse.builder()
                .data(
                    MachinePaymentAccountCreditResponse.Data.builder()
                        .id("id")
                        .accountId("account_id")
                        .amount("amount")
                        .currency("currency")
                        .paymentSource(
                            MachinePaymentAccountCreditResponse.Data.PaymentSource.MACHINE_PAYMENT
                        )
                        .recordType(
                            MachinePaymentAccountCreditResponse.Data.RecordType
                                .MACHINE_PAYMENT_ACCOUNT_CREDIT
                        )
                        .created(true)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .mppResource("mpp_resource")
                        .paymentIntentId("payment_intent_id")
                        .paymentMethod(
                            MachinePaymentAccountCreditResponse.Data.PaymentMethod.STRIPE_SPT
                        )
                        .provider(MachinePaymentAccountCreditResponse.Data.Provider.STRIPE)
                        .receiptReference("receipt_reference")
                        .status(MachinePaymentAccountCreditResponse.Data.Status.NEW)
                        .build()
                )
                .build()

        assertThat(machinePaymentAccountCreditResponse.data())
            .contains(
                MachinePaymentAccountCreditResponse.Data.builder()
                    .id("id")
                    .accountId("account_id")
                    .amount("amount")
                    .currency("currency")
                    .paymentSource(
                        MachinePaymentAccountCreditResponse.Data.PaymentSource.MACHINE_PAYMENT
                    )
                    .recordType(
                        MachinePaymentAccountCreditResponse.Data.RecordType
                            .MACHINE_PAYMENT_ACCOUNT_CREDIT
                    )
                    .created(true)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .mppResource("mpp_resource")
                    .paymentIntentId("payment_intent_id")
                    .paymentMethod(
                        MachinePaymentAccountCreditResponse.Data.PaymentMethod.STRIPE_SPT
                    )
                    .provider(MachinePaymentAccountCreditResponse.Data.Provider.STRIPE)
                    .receiptReference("receipt_reference")
                    .status(MachinePaymentAccountCreditResponse.Data.Status.NEW)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val machinePaymentAccountCreditResponse =
            MachinePaymentAccountCreditResponse.builder()
                .data(
                    MachinePaymentAccountCreditResponse.Data.builder()
                        .id("id")
                        .accountId("account_id")
                        .amount("amount")
                        .currency("currency")
                        .paymentSource(
                            MachinePaymentAccountCreditResponse.Data.PaymentSource.MACHINE_PAYMENT
                        )
                        .recordType(
                            MachinePaymentAccountCreditResponse.Data.RecordType
                                .MACHINE_PAYMENT_ACCOUNT_CREDIT
                        )
                        .created(true)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .mppResource("mpp_resource")
                        .paymentIntentId("payment_intent_id")
                        .paymentMethod(
                            MachinePaymentAccountCreditResponse.Data.PaymentMethod.STRIPE_SPT
                        )
                        .provider(MachinePaymentAccountCreditResponse.Data.Provider.STRIPE)
                        .receiptReference("receipt_reference")
                        .status(MachinePaymentAccountCreditResponse.Data.Status.NEW)
                        .build()
                )
                .build()

        val roundtrippedMachinePaymentAccountCreditResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(machinePaymentAccountCreditResponse),
                jacksonTypeRef<MachinePaymentAccountCreditResponse>(),
            )

        assertThat(roundtrippedMachinePaymentAccountCreditResponse)
            .isEqualTo(machinePaymentAccountCreditResponse)
    }
}
