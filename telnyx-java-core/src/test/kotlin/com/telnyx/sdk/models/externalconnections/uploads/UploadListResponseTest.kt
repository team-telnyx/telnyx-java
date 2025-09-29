// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalconnections.uploads

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.externalconnections.ExternalVoiceIntegrationsPaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UploadListResponseTest {

    @Test
    fun create() {
        val uploadListResponse =
            UploadListResponse.builder()
                .addData(
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
                )
                .meta(
                    ExternalVoiceIntegrationsPaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(uploadListResponse.data().getOrNull())
            .containsExactly(
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
            )
        assertThat(uploadListResponse.meta())
            .contains(
                ExternalVoiceIntegrationsPaginationMeta.builder()
                    .pageNumber(2L)
                    .pageSize(25L)
                    .totalPages(3L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val uploadListResponse =
            UploadListResponse.builder()
                .addData(
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
                )
                .meta(
                    ExternalVoiceIntegrationsPaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedUploadListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(uploadListResponse),
                jacksonTypeRef<UploadListResponse>(),
            )

        assertThat(roundtrippedUploadListResponse).isEqualTo(uploadListResponse)
    }
}
