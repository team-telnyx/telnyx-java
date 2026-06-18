// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rooms.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionGenerateJoinClientTokenResponseTest {

    @Test
    fun create() {
        val actionGenerateJoinClientTokenResponse =
            ActionGenerateJoinClientTokenResponse.builder()
                .data(
                    ActionGenerateJoinClientTokenResponse.Data.builder()
                        .token(
                            "eyJhbGciOiJFZDI1NTE5IiwidHlwIjoiSldUIn0.eyJhdWQiOiJ0ZWxueXhfYWNjZXNzX3Rva2VuIiwiZXhwIjoxNjE5MDk0Mjk1LCJncmFudHMiOlt7ImFjdGlvbnMiOlsiam9pbiJdLCJyZXNvdXJjZXMiOlsidGVsbnl4OnZpZGVvOnJvb21zOjllMmEwY2JlLWNlNjYtNDExZS1hMWFjLTQ2OGYwYjEwM2M5YSJdLCJzdWJqZWN0cyI6WyJ0ZWxueXg6dXNlcnM6NzgyYjJjYmUtODQ2Ni00ZTNmLWE0ZDMtOTc4MWViNTc3ZTUwIl19XSwiZ3JhbnRzX3ZlcnNpb24iOiIxLjAuMCIsImlhdCI6MTYxOTA5MzY5NSwiaXNzIjoidGVsbnl4X2FjY2Vzc190b2tlbiIsImp0aSI6IjllNjIyOTA2LTc1ZTctNDBiNi1iOTAwLTc1NGIxZjNlZDMyZiIsIm5iZiI6MTYxOTA5MzY5NCwic3ViIjoibnVsbCIsInR5cCI6ImFjY2VzcyJ9.1JGK9PyHkTtoP_iMu-8TzXH_fhmnsDtZZOAJLDzLW6DDtAb80wZ93l1VH5yNx5tFqwIFG0t48dRiBKWlW-nzDA"
                        )
                        .refreshToken(
                            "eyJhbGciOiJFZDI1NTE5IiwidHlwIjoiSldUIn0.eyJhdWQiOiJ0ZWxueXhfYWNjZXNzX3Rva2VuIiwiZXhwIjoxNjE5MDkzNzA1LCJncmFudHMiOlt7ImFjdGlvbnMiOlsiam9pbiJdLCJyZXNvdXJjZXMiOlsidGVsbnl4OnZpZGVvOnJvb21zOjllMmEwY2JlLWNlNjYtNDExZS1hMWFjLTQ2OGYwYjEwM2M5YSJdLCJzdWJqZWN0cyI6WyJ0ZWxueXg6dXNlcnM6NzgyYjJjYmUtODQ2Ni00ZTNmLWE0ZDMtOTc4MWViNTc3ZTUwIl19XSwiZ3JhbnRzX3ZlcnNpb24iOiIxLjAuMCIsImlhdCI6MTYxOTA5MzY5NSwiaXNzIjoidGVsbnl4X2FjY2Vzc190b2tlbiIsImp0aSI6ImQ3OWJlMzhjLWFkNTQtNGQ5ZC1hODc4LWExNjVjNTk0MGQwNyIsIm5iZiI6MTYxOTA5MzY5NCwic3ViIjoibnVsbCIsInR5cCI6InJlZnJlc2gifQ.FHsp7KlVXn1E5tTUiKZzmQ4of39gi57AakeQeqI0oAa8hzjFMVb0RGj-mxWTvHVen4GpgsUW_epqqaxK16viCA"
                        )
                        .refreshTokenExpiresAt(OffsetDateTime.parse("2021-04-22T12:15:05Z"))
                        .tokenExpiresAt(OffsetDateTime.parse("2021-04-22T12:24:55Z"))
                        .build()
                )
                .build()

        assertThat(actionGenerateJoinClientTokenResponse.data())
            .contains(
                ActionGenerateJoinClientTokenResponse.Data.builder()
                    .token(
                        "eyJhbGciOiJFZDI1NTE5IiwidHlwIjoiSldUIn0.eyJhdWQiOiJ0ZWxueXhfYWNjZXNzX3Rva2VuIiwiZXhwIjoxNjE5MDk0Mjk1LCJncmFudHMiOlt7ImFjdGlvbnMiOlsiam9pbiJdLCJyZXNvdXJjZXMiOlsidGVsbnl4OnZpZGVvOnJvb21zOjllMmEwY2JlLWNlNjYtNDExZS1hMWFjLTQ2OGYwYjEwM2M5YSJdLCJzdWJqZWN0cyI6WyJ0ZWxueXg6dXNlcnM6NzgyYjJjYmUtODQ2Ni00ZTNmLWE0ZDMtOTc4MWViNTc3ZTUwIl19XSwiZ3JhbnRzX3ZlcnNpb24iOiIxLjAuMCIsImlhdCI6MTYxOTA5MzY5NSwiaXNzIjoidGVsbnl4X2FjY2Vzc190b2tlbiIsImp0aSI6IjllNjIyOTA2LTc1ZTctNDBiNi1iOTAwLTc1NGIxZjNlZDMyZiIsIm5iZiI6MTYxOTA5MzY5NCwic3ViIjoibnVsbCIsInR5cCI6ImFjY2VzcyJ9.1JGK9PyHkTtoP_iMu-8TzXH_fhmnsDtZZOAJLDzLW6DDtAb80wZ93l1VH5yNx5tFqwIFG0t48dRiBKWlW-nzDA"
                    )
                    .refreshToken(
                        "eyJhbGciOiJFZDI1NTE5IiwidHlwIjoiSldUIn0.eyJhdWQiOiJ0ZWxueXhfYWNjZXNzX3Rva2VuIiwiZXhwIjoxNjE5MDkzNzA1LCJncmFudHMiOlt7ImFjdGlvbnMiOlsiam9pbiJdLCJyZXNvdXJjZXMiOlsidGVsbnl4OnZpZGVvOnJvb21zOjllMmEwY2JlLWNlNjYtNDExZS1hMWFjLTQ2OGYwYjEwM2M5YSJdLCJzdWJqZWN0cyI6WyJ0ZWxueXg6dXNlcnM6NzgyYjJjYmUtODQ2Ni00ZTNmLWE0ZDMtOTc4MWViNTc3ZTUwIl19XSwiZ3JhbnRzX3ZlcnNpb24iOiIxLjAuMCIsImlhdCI6MTYxOTA5MzY5NSwiaXNzIjoidGVsbnl4X2FjY2Vzc190b2tlbiIsImp0aSI6ImQ3OWJlMzhjLWFkNTQtNGQ5ZC1hODc4LWExNjVjNTk0MGQwNyIsIm5iZiI6MTYxOTA5MzY5NCwic3ViIjoibnVsbCIsInR5cCI6InJlZnJlc2gifQ.FHsp7KlVXn1E5tTUiKZzmQ4of39gi57AakeQeqI0oAa8hzjFMVb0RGj-mxWTvHVen4GpgsUW_epqqaxK16viCA"
                    )
                    .refreshTokenExpiresAt(OffsetDateTime.parse("2021-04-22T12:15:05Z"))
                    .tokenExpiresAt(OffsetDateTime.parse("2021-04-22T12:24:55Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionGenerateJoinClientTokenResponse =
            ActionGenerateJoinClientTokenResponse.builder()
                .data(
                    ActionGenerateJoinClientTokenResponse.Data.builder()
                        .token(
                            "eyJhbGciOiJFZDI1NTE5IiwidHlwIjoiSldUIn0.eyJhdWQiOiJ0ZWxueXhfYWNjZXNzX3Rva2VuIiwiZXhwIjoxNjE5MDk0Mjk1LCJncmFudHMiOlt7ImFjdGlvbnMiOlsiam9pbiJdLCJyZXNvdXJjZXMiOlsidGVsbnl4OnZpZGVvOnJvb21zOjllMmEwY2JlLWNlNjYtNDExZS1hMWFjLTQ2OGYwYjEwM2M5YSJdLCJzdWJqZWN0cyI6WyJ0ZWxueXg6dXNlcnM6NzgyYjJjYmUtODQ2Ni00ZTNmLWE0ZDMtOTc4MWViNTc3ZTUwIl19XSwiZ3JhbnRzX3ZlcnNpb24iOiIxLjAuMCIsImlhdCI6MTYxOTA5MzY5NSwiaXNzIjoidGVsbnl4X2FjY2Vzc190b2tlbiIsImp0aSI6IjllNjIyOTA2LTc1ZTctNDBiNi1iOTAwLTc1NGIxZjNlZDMyZiIsIm5iZiI6MTYxOTA5MzY5NCwic3ViIjoibnVsbCIsInR5cCI6ImFjY2VzcyJ9.1JGK9PyHkTtoP_iMu-8TzXH_fhmnsDtZZOAJLDzLW6DDtAb80wZ93l1VH5yNx5tFqwIFG0t48dRiBKWlW-nzDA"
                        )
                        .refreshToken(
                            "eyJhbGciOiJFZDI1NTE5IiwidHlwIjoiSldUIn0.eyJhdWQiOiJ0ZWxueXhfYWNjZXNzX3Rva2VuIiwiZXhwIjoxNjE5MDkzNzA1LCJncmFudHMiOlt7ImFjdGlvbnMiOlsiam9pbiJdLCJyZXNvdXJjZXMiOlsidGVsbnl4OnZpZGVvOnJvb21zOjllMmEwY2JlLWNlNjYtNDExZS1hMWFjLTQ2OGYwYjEwM2M5YSJdLCJzdWJqZWN0cyI6WyJ0ZWxueXg6dXNlcnM6NzgyYjJjYmUtODQ2Ni00ZTNmLWE0ZDMtOTc4MWViNTc3ZTUwIl19XSwiZ3JhbnRzX3ZlcnNpb24iOiIxLjAuMCIsImlhdCI6MTYxOTA5MzY5NSwiaXNzIjoidGVsbnl4X2FjY2Vzc190b2tlbiIsImp0aSI6ImQ3OWJlMzhjLWFkNTQtNGQ5ZC1hODc4LWExNjVjNTk0MGQwNyIsIm5iZiI6MTYxOTA5MzY5NCwic3ViIjoibnVsbCIsInR5cCI6InJlZnJlc2gifQ.FHsp7KlVXn1E5tTUiKZzmQ4of39gi57AakeQeqI0oAa8hzjFMVb0RGj-mxWTvHVen4GpgsUW_epqqaxK16viCA"
                        )
                        .refreshTokenExpiresAt(OffsetDateTime.parse("2021-04-22T12:15:05Z"))
                        .tokenExpiresAt(OffsetDateTime.parse("2021-04-22T12:24:55Z"))
                        .build()
                )
                .build()

        val roundtrippedActionGenerateJoinClientTokenResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionGenerateJoinClientTokenResponse),
                jacksonTypeRef<ActionGenerateJoinClientTokenResponse>(),
            )

        assertThat(roundtrippedActionGenerateJoinClientTokenResponse)
            .isEqualTo(actionGenerateJoinClientTokenResponse)
    }
}
