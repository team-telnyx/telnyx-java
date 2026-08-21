// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.customstoragecredentials

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class S3GenericConfigurationDataTest {

    @Test
    fun create() {
        val s3GenericConfigurationData =
            S3GenericConfigurationData.builder()
                .awsAccessKeyId("AKIAIOSFODNN7EXAMPLE")
                .awsSecretAccessKey("wJalrXUtnFEMI/K7MDENG/bPxRfiCYEXAMPLEKEY")
                .backend(S3GenericConfigurationData.Backend.S3_GENERIC)
                .bucket("example-bucket")
                .endpoint("https://s3.example.com")
                .region("us-east-1")
                .build()

        assertThat(s3GenericConfigurationData.awsAccessKeyId()).isEqualTo("AKIAIOSFODNN7EXAMPLE")
        assertThat(s3GenericConfigurationData.awsSecretAccessKey())
            .isEqualTo("wJalrXUtnFEMI/K7MDENG/bPxRfiCYEXAMPLEKEY")
        assertThat(s3GenericConfigurationData.backend())
            .isEqualTo(S3GenericConfigurationData.Backend.S3_GENERIC)
        assertThat(s3GenericConfigurationData.bucket()).isEqualTo("example-bucket")
        assertThat(s3GenericConfigurationData.endpoint()).isEqualTo("https://s3.example.com")
        assertThat(s3GenericConfigurationData.region()).isEqualTo("us-east-1")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val s3GenericConfigurationData =
            S3GenericConfigurationData.builder()
                .awsAccessKeyId("AKIAIOSFODNN7EXAMPLE")
                .awsSecretAccessKey("wJalrXUtnFEMI/K7MDENG/bPxRfiCYEXAMPLEKEY")
                .backend(S3GenericConfigurationData.Backend.S3_GENERIC)
                .bucket("example-bucket")
                .endpoint("https://s3.example.com")
                .region("us-east-1")
                .build()

        val roundtrippedS3GenericConfigurationData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(s3GenericConfigurationData),
                jacksonTypeRef<S3GenericConfigurationData>(),
            )

        assertThat(roundtrippedS3GenericConfigurationData).isEqualTo(s3GenericConfigurationData)
    }
}
