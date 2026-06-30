// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.faxes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FaxTest {

    @Test
    fun create() {
        val fax =
            Fax.builder()
                .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                .connectionId("c-1")
                .createdAt(OffsetDateTime.parse("2020-05-05T09:59:12Z"))
                .direction(Fax.Direction.OUTBOUND)
                .from("+123")
                .fromDisplayName("Company Name")
                .mediaName("my_media_uploaded_to_media_storage_api")
                .mediaUrl("http://www.example.com/fax.pdf")
                .previewUrl(
                    "https://s3.amazonaws.com/faxes-dev/user-1/cf4a6b52-bf8e-4945-9f49-611d0d2b083b_preview.tiff?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=xxxxxxxxxx%2F20200505%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20200505T095917Z&X-Amz-Expires=7200&X-Amz-SignedHeaders=host&X-Amz-Signature=fac2af40464fcc77673ad762db86e34f9c1b91a82699b5578c5327f53874df51"
                )
                .quality(Fax.Quality.HIGH)
                .recordType(Fax.RecordType.FAX)
                .status(Fax.Status.QUEUED)
                .storeMedia(true)
                .storedMediaUrl(
                    "https://s3.amazonaws.com/faxes-dev/user-1/cf4a6b52-bf8e-4945-9f49-611d0d2b083b.pdf?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=xxxxxxxxxx%2F20200505%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20200505T095917Z&X-Amz-Expires=7200&X-Amz-SignedHeaders=host&X-Amz-Signature=fac2af40464fcc77673ad762db86e34f9c1b91a82699b5578c5327f53874df51"
                )
                .to("+456")
                .updatedAt(OffsetDateTime.parse("2020-05-05T09:59:12Z"))
                .webhookFailoverUrl("")
                .webhookUrl("http://www.example.com/webhooks")
                .build()

        assertThat(fax.id()).contains("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
        assertThat(fax.clientState()).contains("aGF2ZSBhIG5pY2UgZGF5ID1d")
        assertThat(fax.connectionId()).contains("c-1")
        assertThat(fax.createdAt()).contains(OffsetDateTime.parse("2020-05-05T09:59:12Z"))
        assertThat(fax.direction()).contains(Fax.Direction.OUTBOUND)
        assertThat(fax.from()).contains("+123")
        assertThat(fax.fromDisplayName()).contains("Company Name")
        assertThat(fax.mediaName()).contains("my_media_uploaded_to_media_storage_api")
        assertThat(fax.mediaUrl()).contains("http://www.example.com/fax.pdf")
        assertThat(fax.previewUrl())
            .contains(
                "https://s3.amazonaws.com/faxes-dev/user-1/cf4a6b52-bf8e-4945-9f49-611d0d2b083b_preview.tiff?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=xxxxxxxxxx%2F20200505%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20200505T095917Z&X-Amz-Expires=7200&X-Amz-SignedHeaders=host&X-Amz-Signature=fac2af40464fcc77673ad762db86e34f9c1b91a82699b5578c5327f53874df51"
            )
        assertThat(fax.quality()).contains(Fax.Quality.HIGH)
        assertThat(fax.recordType()).contains(Fax.RecordType.FAX)
        assertThat(fax.status()).contains(Fax.Status.QUEUED)
        assertThat(fax.storeMedia()).contains(true)
        assertThat(fax.storedMediaUrl())
            .contains(
                "https://s3.amazonaws.com/faxes-dev/user-1/cf4a6b52-bf8e-4945-9f49-611d0d2b083b.pdf?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=xxxxxxxxxx%2F20200505%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20200505T095917Z&X-Amz-Expires=7200&X-Amz-SignedHeaders=host&X-Amz-Signature=fac2af40464fcc77673ad762db86e34f9c1b91a82699b5578c5327f53874df51"
            )
        assertThat(fax.to()).contains("+456")
        assertThat(fax.updatedAt()).contains(OffsetDateTime.parse("2020-05-05T09:59:12Z"))
        assertThat(fax.webhookFailoverUrl()).contains("")
        assertThat(fax.webhookUrl()).contains("http://www.example.com/webhooks")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fax =
            Fax.builder()
                .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                .connectionId("c-1")
                .createdAt(OffsetDateTime.parse("2020-05-05T09:59:12Z"))
                .direction(Fax.Direction.OUTBOUND)
                .from("+123")
                .fromDisplayName("Company Name")
                .mediaName("my_media_uploaded_to_media_storage_api")
                .mediaUrl("http://www.example.com/fax.pdf")
                .previewUrl(
                    "https://s3.amazonaws.com/faxes-dev/user-1/cf4a6b52-bf8e-4945-9f49-611d0d2b083b_preview.tiff?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=xxxxxxxxxx%2F20200505%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20200505T095917Z&X-Amz-Expires=7200&X-Amz-SignedHeaders=host&X-Amz-Signature=fac2af40464fcc77673ad762db86e34f9c1b91a82699b5578c5327f53874df51"
                )
                .quality(Fax.Quality.HIGH)
                .recordType(Fax.RecordType.FAX)
                .status(Fax.Status.QUEUED)
                .storeMedia(true)
                .storedMediaUrl(
                    "https://s3.amazonaws.com/faxes-dev/user-1/cf4a6b52-bf8e-4945-9f49-611d0d2b083b.pdf?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=xxxxxxxxxx%2F20200505%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20200505T095917Z&X-Amz-Expires=7200&X-Amz-SignedHeaders=host&X-Amz-Signature=fac2af40464fcc77673ad762db86e34f9c1b91a82699b5578c5327f53874df51"
                )
                .to("+456")
                .updatedAt(OffsetDateTime.parse("2020-05-05T09:59:12Z"))
                .webhookFailoverUrl("")
                .webhookUrl("http://www.example.com/webhooks")
                .build()

        val roundtrippedFax =
            jsonMapper.readValue(jsonMapper.writeValueAsString(fax), jacksonTypeRef<Fax>())

        assertThat(roundtrippedFax).isEqualTo(fax)
    }
}
