// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.mobilepushcredentials

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PushCredentialTest {

    @Test
    fun create() {
        val pushCredential =
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

        assertThat(pushCredential.id()).isEqualTo("0ccc7b54-4df3-4bcb-a65a-3da1ecc997d7")
        assertThat(pushCredential.alias()).isEqualTo("LucyCredential")
        assertThat(pushCredential.certificate())
            .isEqualTo(
                "-----BEGIN CERTIFICATE----- MIIGVDCCBTKCAQEAsNlRJVZn9ZvXcECQm65czs... -----END CERTIFICATE-----"
            )
        assertThat(pushCredential.createdAt())
            .isEqualTo(OffsetDateTime.parse("2021-03-26T17:51:59.588408Z"))
        assertThat(pushCredential.privateKey())
            .isEqualTo(
                "-----BEGIN RSA PRIVATE KEY----- MIIEpQIBAAKCAQEAsNlRJVZn9ZvXcECQm65czs... -----END RSA PRIVATE KEY-----"
            )
        assertThat(pushCredential.projectAccountJsonFile())
            .isEqualTo(
                PushCredential.ProjectAccountJsonFile.builder()
                    .putAdditionalProperty("private_key", JsonValue.from("bar"))
                    .putAdditionalProperty("client_email", JsonValue.from("bar"))
                    .build()
            )
        assertThat(pushCredential.recordType()).isEqualTo("push_credential")
        assertThat(pushCredential.type()).isEqualTo("ios")
        assertThat(pushCredential.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2021-03-26T17:51:59.588408Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pushCredential =
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

        val roundtrippedPushCredential =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pushCredential),
                jacksonTypeRef<PushCredential>(),
            )

        assertThat(roundtrippedPushCredential).isEqualTo(pushCredential)
    }
}
