// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.dir

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.dir.references.ReferenceCreateParams
import com.telnyx.sdk.models.dir.references.ReferenceInput
import com.telnyx.sdk.models.dir.references.ReferenceUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ReferenceServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val referenceServiceAsync = client.dir().references()

        val referenceListFuture =
            referenceServiceAsync.create(
                ReferenceCreateParams.builder()
                    .dirId("16635d38-75a6-4481-82e8-69af60e05011")
                    .addBusinessReference(
                        ReferenceInput.builder()
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
                        ReferenceInput.builder()
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
                        ReferenceInput.builder()
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

        val referenceList = referenceListFuture.get()
        referenceList.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val referenceServiceAsync = client.dir().references()

        val referenceFuture =
            referenceServiceAsync.update(
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

        val reference = referenceFuture.get()
        reference.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val referenceServiceAsync = client.dir().references()

        val referenceListFuture = referenceServiceAsync.list("16635d38-75a6-4481-82e8-69af60e05011")

        val referenceList = referenceListFuture.get()
        referenceList.validate()
    }
}
