// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.faxes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FaxCreateResponseTest {

    @Test
    fun create() {
        val faxCreateResponse =
            FaxCreateResponse.builder()
                .data(
                    Fax.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .connectionId("c-1")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .webhookFailoverUrl("")
                        .webhookUrl("http://www.example.com/webhooks")
                        .build()
                )
                .build()

        assertThat(faxCreateResponse.data())
            .contains(
                Fax.builder()
                    .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .connectionId("c-1")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .webhookFailoverUrl("")
                    .webhookUrl("http://www.example.com/webhooks")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val faxCreateResponse =
            FaxCreateResponse.builder()
                .data(
                    Fax.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .connectionId("c-1")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .webhookFailoverUrl("")
                        .webhookUrl("http://www.example.com/webhooks")
                        .build()
                )
                .build()

        val roundtrippedFaxCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(faxCreateResponse),
                jacksonTypeRef<FaxCreateResponse>(),
            )

        assertThat(roundtrippedFaxCreateResponse).isEqualTo(faxCreateResponse)
    }
}
