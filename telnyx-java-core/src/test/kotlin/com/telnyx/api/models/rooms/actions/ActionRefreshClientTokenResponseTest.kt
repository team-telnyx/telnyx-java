// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.rooms.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionRefreshClientTokenResponseTest {

    @Test
    fun create() {
        val actionRefreshClientTokenResponse =
            ActionRefreshClientTokenResponse.builder()
                .data(
                    ActionRefreshClientTokenResponse.Data.builder()
                        .token(
                            "eyJhbGciOiJFZDI1NTE5IiwidHlwIjoiSldUIn0.eyJhdWQiOiJ0ZWxueXhfYWNjZXNzX3Rva2VuIiwiZXhwIjoxNjE5MDk0Mjk1LCJncmFudHMiOlt7ImFjdGlvbnMiOlsiam9pbiJdLCJyZXNvdXJjZXMiOlsidGVsbnl4OnZpZGVvOnJvb21zOjllMmEwY2JlLWNlNjYtNDExZS1hMWFjLTQ2OGYwYjEwM2M5YSJdLCJzdWJqZWN0cyI6WyJ0ZWxueXg6dXNlcnM6NzgyYjJjYmUtODQ2Ni00ZTNmLWE0ZDMtOTc4MWViNTc3ZTUwIl19XSwiZ3JhbnRzX3ZlcnNpb24iOiIxLjAuMCIsImlhdCI6MTYxOTA5MzY5NSwiaXNzIjoidGVsbnl4X2FjY2Vzc190b2tlbiIsImp0aSI6IjllNjIyOTA2LTc1ZTctNDBiNi1iOTAwLTc1NGIxZjNlZDMyZiIsIm5iZiI6MTYxOTA5MzY5NCwic3ViIjoibnVsbCIsInR5cCI6ImFjY2VzcyJ9.1JGK9PyHkTtoP_iMu-8TzXH_fhmnsDtZZOAJLDzLW6DDtAb80wZ93l1VH5yNx5tFqwIFG0t48dRiBKWlW-nzDA"
                        )
                        .tokenExpiresAt(OffsetDateTime.parse("2021-04-22T12:24:55Z"))
                        .build()
                )
                .build()

        assertThat(actionRefreshClientTokenResponse.data())
            .contains(
                ActionRefreshClientTokenResponse.Data.builder()
                    .token(
                        "eyJhbGciOiJFZDI1NTE5IiwidHlwIjoiSldUIn0.eyJhdWQiOiJ0ZWxueXhfYWNjZXNzX3Rva2VuIiwiZXhwIjoxNjE5MDk0Mjk1LCJncmFudHMiOlt7ImFjdGlvbnMiOlsiam9pbiJdLCJyZXNvdXJjZXMiOlsidGVsbnl4OnZpZGVvOnJvb21zOjllMmEwY2JlLWNlNjYtNDExZS1hMWFjLTQ2OGYwYjEwM2M5YSJdLCJzdWJqZWN0cyI6WyJ0ZWxueXg6dXNlcnM6NzgyYjJjYmUtODQ2Ni00ZTNmLWE0ZDMtOTc4MWViNTc3ZTUwIl19XSwiZ3JhbnRzX3ZlcnNpb24iOiIxLjAuMCIsImlhdCI6MTYxOTA5MzY5NSwiaXNzIjoidGVsbnl4X2FjY2Vzc190b2tlbiIsImp0aSI6IjllNjIyOTA2LTc1ZTctNDBiNi1iOTAwLTc1NGIxZjNlZDMyZiIsIm5iZiI6MTYxOTA5MzY5NCwic3ViIjoibnVsbCIsInR5cCI6ImFjY2VzcyJ9.1JGK9PyHkTtoP_iMu-8TzXH_fhmnsDtZZOAJLDzLW6DDtAb80wZ93l1VH5yNx5tFqwIFG0t48dRiBKWlW-nzDA"
                    )
                    .tokenExpiresAt(OffsetDateTime.parse("2021-04-22T12:24:55Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionRefreshClientTokenResponse =
            ActionRefreshClientTokenResponse.builder()
                .data(
                    ActionRefreshClientTokenResponse.Data.builder()
                        .token(
                            "eyJhbGciOiJFZDI1NTE5IiwidHlwIjoiSldUIn0.eyJhdWQiOiJ0ZWxueXhfYWNjZXNzX3Rva2VuIiwiZXhwIjoxNjE5MDk0Mjk1LCJncmFudHMiOlt7ImFjdGlvbnMiOlsiam9pbiJdLCJyZXNvdXJjZXMiOlsidGVsbnl4OnZpZGVvOnJvb21zOjllMmEwY2JlLWNlNjYtNDExZS1hMWFjLTQ2OGYwYjEwM2M5YSJdLCJzdWJqZWN0cyI6WyJ0ZWxueXg6dXNlcnM6NzgyYjJjYmUtODQ2Ni00ZTNmLWE0ZDMtOTc4MWViNTc3ZTUwIl19XSwiZ3JhbnRzX3ZlcnNpb24iOiIxLjAuMCIsImlhdCI6MTYxOTA5MzY5NSwiaXNzIjoidGVsbnl4X2FjY2Vzc190b2tlbiIsImp0aSI6IjllNjIyOTA2LTc1ZTctNDBiNi1iOTAwLTc1NGIxZjNlZDMyZiIsIm5iZiI6MTYxOTA5MzY5NCwic3ViIjoibnVsbCIsInR5cCI6ImFjY2VzcyJ9.1JGK9PyHkTtoP_iMu-8TzXH_fhmnsDtZZOAJLDzLW6DDtAb80wZ93l1VH5yNx5tFqwIFG0t48dRiBKWlW-nzDA"
                        )
                        .tokenExpiresAt(OffsetDateTime.parse("2021-04-22T12:24:55Z"))
                        .build()
                )
                .build()

        val roundtrippedActionRefreshClientTokenResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionRefreshClientTokenResponse),
                jacksonTypeRef<ActionRefreshClientTokenResponse>(),
            )

        assertThat(roundtrippedActionRefreshClientTokenResponse)
            .isEqualTo(actionRefreshClientTokenResponse)
    }
}
