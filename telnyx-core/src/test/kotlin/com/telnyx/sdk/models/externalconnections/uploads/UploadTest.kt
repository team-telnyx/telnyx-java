// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalconnections.uploads

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UploadTest {

    @Test
    fun create() {
        val upload =
            Upload.builder()
                .addAvailableUsage(Upload.AvailableUsage.CALLING_USER_ASSIGNMENT)
                .errorCode("error_code")
                .errorMessage("error_message")
                .locationId("c37e5036-1e87-42e6-86a2-b3e8dd39a2ad")
                .status(Upload.Status.ERROR)
                .tenantId("ea175aba-f47c-4702-9400-efaa42688048")
                .ticketId("542c3bca-d247-42bc-8fe7-e01d16ecd761")
                .addTnUploadEntry(
                    TnUploadEntry.builder()
                        .civicAddressId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .errorCode(TnUploadEntry.ErrorCode.INTERNAL_ERROR)
                        .errorMessage("error_message")
                        .internalStatus(TnUploadEntry.InternalStatus.ERROR)
                        .locationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .numberId("542c3bca-d247-42bc-8fe7-e01d16ecd761")
                        .phoneNumber("phone_number")
                        .status(TnUploadEntry.Status.ERROR)
                        .build()
                )
                .build()

        assertThat(upload.availableUsages().getOrNull())
            .containsExactly(Upload.AvailableUsage.CALLING_USER_ASSIGNMENT)
        assertThat(upload.errorCode()).contains("error_code")
        assertThat(upload.errorMessage()).contains("error_message")
        assertThat(upload.locationId()).contains("c37e5036-1e87-42e6-86a2-b3e8dd39a2ad")
        assertThat(upload.status()).contains(Upload.Status.ERROR)
        assertThat(upload.tenantId()).contains("ea175aba-f47c-4702-9400-efaa42688048")
        assertThat(upload.ticketId()).contains("542c3bca-d247-42bc-8fe7-e01d16ecd761")
        assertThat(upload.tnUploadEntries().getOrNull())
            .containsExactly(
                TnUploadEntry.builder()
                    .civicAddressId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .errorCode(TnUploadEntry.ErrorCode.INTERNAL_ERROR)
                    .errorMessage("error_message")
                    .internalStatus(TnUploadEntry.InternalStatus.ERROR)
                    .locationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .numberId("542c3bca-d247-42bc-8fe7-e01d16ecd761")
                    .phoneNumber("phone_number")
                    .status(TnUploadEntry.Status.ERROR)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val upload =
            Upload.builder()
                .addAvailableUsage(Upload.AvailableUsage.CALLING_USER_ASSIGNMENT)
                .errorCode("error_code")
                .errorMessage("error_message")
                .locationId("c37e5036-1e87-42e6-86a2-b3e8dd39a2ad")
                .status(Upload.Status.ERROR)
                .tenantId("ea175aba-f47c-4702-9400-efaa42688048")
                .ticketId("542c3bca-d247-42bc-8fe7-e01d16ecd761")
                .addTnUploadEntry(
                    TnUploadEntry.builder()
                        .civicAddressId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .errorCode(TnUploadEntry.ErrorCode.INTERNAL_ERROR)
                        .errorMessage("error_message")
                        .internalStatus(TnUploadEntry.InternalStatus.ERROR)
                        .locationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .numberId("542c3bca-d247-42bc-8fe7-e01d16ecd761")
                        .phoneNumber("phone_number")
                        .status(TnUploadEntry.Status.ERROR)
                        .build()
                )
                .build()

        val roundtrippedUpload =
            jsonMapper.readValue(jsonMapper.writeValueAsString(upload), jacksonTypeRef<Upload>())

        assertThat(roundtrippedUpload).isEqualTo(upload)
    }
}
