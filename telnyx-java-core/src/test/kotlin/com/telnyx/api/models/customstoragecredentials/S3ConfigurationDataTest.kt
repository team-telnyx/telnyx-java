// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.customstoragecredentials

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class S3ConfigurationDataTest {

    @Test
    fun create() {
        val s3ConfigurationData =
            S3ConfigurationData.builder()
                .awsAccessKeyId("AKIAIOSFODNN7EXAMPLE")
                .awsSecretAccessKey("wJalrXUtnFEMI/K7MDENG/bPxRfiCYEXAMPLEKEY")
                .bucket("example-bucket")
                .region("us-east-1")
                .build()

        assertThat(s3ConfigurationData.awsAccessKeyId()).contains("AKIAIOSFODNN7EXAMPLE")
        assertThat(s3ConfigurationData.awsSecretAccessKey())
            .contains("wJalrXUtnFEMI/K7MDENG/bPxRfiCYEXAMPLEKEY")
        assertThat(s3ConfigurationData.bucket()).contains("example-bucket")
        assertThat(s3ConfigurationData.region()).contains("us-east-1")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val s3ConfigurationData =
            S3ConfigurationData.builder()
                .awsAccessKeyId("AKIAIOSFODNN7EXAMPLE")
                .awsSecretAccessKey("wJalrXUtnFEMI/K7MDENG/bPxRfiCYEXAMPLEKEY")
                .bucket("example-bucket")
                .region("us-east-1")
                .build()

        val roundtrippedS3ConfigurationData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(s3ConfigurationData),
                jacksonTypeRef<S3ConfigurationData>(),
            )

        assertThat(roundtrippedS3ConfigurationData).isEqualTo(s3ConfigurationData)
    }
}
