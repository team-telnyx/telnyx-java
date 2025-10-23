// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.mobilepushcredentials

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MobilePushCredentialListResponseTest {

    @Test
    fun create() {
        val mobilePushCredentialListResponse =
            MobilePushCredentialListResponse.builder()
                .addData(
                    PushCredential.builder()
                        .id("0ccc7b54-4df3-4bcb-a65a-3da1ecc997d7")
                        .alias("LucyCredential")
                        .certificate(
                            "-----BEGIN CERTIFICATE----- MIIGVDCCBTKCAQEAsNlRJVZn9ZvXcECQm65czs... -----END CERTIFICATE-----"
                        )
                        .createdAt(OffsetDateTime.parse("2021-03-26T17:51:59.588408Z"))
                        .privateKey(
                            "-----BEGIN RSA PRIVATE KEY----- MIIEpQIBAAKCAQEAsNlRJVZn9ZvXcECQm65czs... -----END RSA PRIVATE KEY-----"
                        )
                        .projectAccountJsonFile(
                            PushCredential.ProjectAccountJsonFile.builder()
                                .putAdditionalProperty("private_key", JsonValue.from("bar"))
                                .putAdditionalProperty("client_email", JsonValue.from("bar"))
                                .build()
                        )
                        .recordType("push_credential")
                        .type("ios")
                        .updatedAt(OffsetDateTime.parse("2021-03-26T17:51:59.588408Z"))
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(mobilePushCredentialListResponse.data().getOrNull())
            .containsExactly(
                PushCredential.builder()
                    .id("0ccc7b54-4df3-4bcb-a65a-3da1ecc997d7")
                    .alias("LucyCredential")
                    .certificate(
                        "-----BEGIN CERTIFICATE----- MIIGVDCCBTKCAQEAsNlRJVZn9ZvXcECQm65czs... -----END CERTIFICATE-----"
                    )
                    .createdAt(OffsetDateTime.parse("2021-03-26T17:51:59.588408Z"))
                    .privateKey(
                        "-----BEGIN RSA PRIVATE KEY----- MIIEpQIBAAKCAQEAsNlRJVZn9ZvXcECQm65czs... -----END RSA PRIVATE KEY-----"
                    )
                    .projectAccountJsonFile(
                        PushCredential.ProjectAccountJsonFile.builder()
                            .putAdditionalProperty("private_key", JsonValue.from("bar"))
                            .putAdditionalProperty("client_email", JsonValue.from("bar"))
                            .build()
                    )
                    .recordType("push_credential")
                    .type("ios")
                    .updatedAt(OffsetDateTime.parse("2021-03-26T17:51:59.588408Z"))
                    .build()
            )
        assertThat(mobilePushCredentialListResponse.meta())
            .contains(
                PaginationMeta.builder()
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
        val mobilePushCredentialListResponse =
            MobilePushCredentialListResponse.builder()
                .addData(
                    PushCredential.builder()
                        .id("0ccc7b54-4df3-4bcb-a65a-3da1ecc997d7")
                        .alias("LucyCredential")
                        .certificate(
                            "-----BEGIN CERTIFICATE----- MIIGVDCCBTKCAQEAsNlRJVZn9ZvXcECQm65czs... -----END CERTIFICATE-----"
                        )
                        .createdAt(OffsetDateTime.parse("2021-03-26T17:51:59.588408Z"))
                        .privateKey(
                            "-----BEGIN RSA PRIVATE KEY----- MIIEpQIBAAKCAQEAsNlRJVZn9ZvXcECQm65czs... -----END RSA PRIVATE KEY-----"
                        )
                        .projectAccountJsonFile(
                            PushCredential.ProjectAccountJsonFile.builder()
                                .putAdditionalProperty("private_key", JsonValue.from("bar"))
                                .putAdditionalProperty("client_email", JsonValue.from("bar"))
                                .build()
                        )
                        .recordType("push_credential")
                        .type("ios")
                        .updatedAt(OffsetDateTime.parse("2021-03-26T17:51:59.588408Z"))
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedMobilePushCredentialListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mobilePushCredentialListResponse),
                jacksonTypeRef<MobilePushCredentialListResponse>(),
            )

        assertThat(roundtrippedMobilePushCredentialListResponse)
            .isEqualTo(mobilePushCredentialListResponse)
    }
}
