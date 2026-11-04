// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.userprofile

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserProfilePatchAllResponseTest {

    @Test
    fun create() {
        val userProfilePatchAllResponse =
            UserProfilePatchAllResponse.builder()
                .data(
                    UserProfile.builder()
                        .id(12345L)
                        .address1("123 Example Street")
                        .address2("Suite 100")
                        .businessName("Example Company")
                        .city("Chicago")
                        .country("US")
                        .dataLocality(UserProfile.DataLocality.UAE)
                        .dataLocalityMigrationStatus(
                            UserProfile.DataLocalityMigrationStatus.FINISHED
                        )
                        .dataLocalityUpdatedAt(OffsetDateTime.parse("2026-01-15T10:00:00Z"))
                        .firstName("Alex")
                        .lastName("Taylor")
                        .phoneNumber("+13125550100")
                        .recordType(UserProfile.RecordType.USER_PROFILE)
                        .state("IL")
                        .updatedAt(OffsetDateTime.parse("2026-01-15T10:30:00Z"))
                        .userId("12ade33a-21c0-473b-b055-b3c836e1c292")
                        .zip("60601")
                        .build()
                )
                .build()

        assertThat(userProfilePatchAllResponse.data())
            .isEqualTo(
                UserProfile.builder()
                    .id(12345L)
                    .address1("123 Example Street")
                    .address2("Suite 100")
                    .businessName("Example Company")
                    .city("Chicago")
                    .country("US")
                    .dataLocality(UserProfile.DataLocality.UAE)
                    .dataLocalityMigrationStatus(UserProfile.DataLocalityMigrationStatus.FINISHED)
                    .dataLocalityUpdatedAt(OffsetDateTime.parse("2026-01-15T10:00:00Z"))
                    .firstName("Alex")
                    .lastName("Taylor")
                    .phoneNumber("+13125550100")
                    .recordType(UserProfile.RecordType.USER_PROFILE)
                    .state("IL")
                    .updatedAt(OffsetDateTime.parse("2026-01-15T10:30:00Z"))
                    .userId("12ade33a-21c0-473b-b055-b3c836e1c292")
                    .zip("60601")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userProfilePatchAllResponse =
            UserProfilePatchAllResponse.builder()
                .data(
                    UserProfile.builder()
                        .id(12345L)
                        .address1("123 Example Street")
                        .address2("Suite 100")
                        .businessName("Example Company")
                        .city("Chicago")
                        .country("US")
                        .dataLocality(UserProfile.DataLocality.UAE)
                        .dataLocalityMigrationStatus(
                            UserProfile.DataLocalityMigrationStatus.FINISHED
                        )
                        .dataLocalityUpdatedAt(OffsetDateTime.parse("2026-01-15T10:00:00Z"))
                        .firstName("Alex")
                        .lastName("Taylor")
                        .phoneNumber("+13125550100")
                        .recordType(UserProfile.RecordType.USER_PROFILE)
                        .state("IL")
                        .updatedAt(OffsetDateTime.parse("2026-01-15T10:30:00Z"))
                        .userId("12ade33a-21c0-473b-b055-b3c836e1c292")
                        .zip("60601")
                        .build()
                )
                .build()

        val roundtrippedUserProfilePatchAllResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userProfilePatchAllResponse),
                jacksonTypeRef<UserProfilePatchAllResponse>(),
            )

        assertThat(roundtrippedUserProfilePatchAllResponse).isEqualTo(userProfilePatchAllResponse)
    }
}
