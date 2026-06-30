// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.dir

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.dir.references.ReferenceSubmitParams
import com.telnyx.sdk.models.dir.references.ReferenceUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ReferenceServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val referenceService = client.dir().references()

        val reference =
            referenceService.update(
                ReferenceUpdateParams.builder()
                    .dirId("16635d38-75a6-4481-82e8-69af60e05011")
                    .refType(ReferenceUpdateParams.RefType.BUSINESS)
                    .slot(0L)
                    .email("dana.reyes@example.com")
                    .fullName("Dana Reyes")
                    .jobTitle("VP of Operations")
                    .organization("Acme Logistics")
                    .phoneE164("+14155550123")
                    .relationshipToRegistrant("Supplier")
                    .timezone("America/New_York")
                    .build()
            )

        reference.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val referenceService = client.dir().references()

        val references = referenceService.list("16635d38-75a6-4481-82e8-69af60e05011")

        references.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun submit() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val referenceService = client.dir().references()

        val response =
            referenceService.submit(
                ReferenceSubmitParams.builder()
                    .dirId("16635d38-75a6-4481-82e8-69af60e05011")
                    .addBusinessReference(
                        ReferenceSubmitParams.BusinessReference.builder()
                            .email("dana.reyes@example.com")
                            .fullName("Dana Reyes")
                            .phoneE164("+14155550123")
                            .timezone("America/New_York")
                            .jobTitle("VP of Operations")
                            .organization("Acme Logistics")
                            .relationshipToRegistrant("Supplier")
                            .build()
                    )
                    .addBusinessReference(
                        ReferenceSubmitParams.BusinessReference.builder()
                            .email("dana.reyes@example.com")
                            .fullName("Dana Reyes")
                            .phoneE164("+14155550123")
                            .timezone("America/New_York")
                            .jobTitle("VP of Operations")
                            .organization("Acme Logistics")
                            .relationshipToRegistrant("Supplier")
                            .build()
                    )
                    .financialReference(
                        ReferenceSubmitParams.FinancialReference.builder()
                            .email("dana.reyes@example.com")
                            .fullName("Dana Reyes")
                            .phoneE164("+14155550123")
                            .timezone("America/New_York")
                            .jobTitle("VP of Operations")
                            .organization("Acme Logistics")
                            .relationshipToRegistrant("Supplier")
                            .build()
                    )
                    .build()
            )

        response.validate()
    }
}
