// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.userprofile

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserProfileTest {

    @Test
    fun create() {
        val userProfile =
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

        assertThat(userProfile.id()).contains(12345L)
        assertThat(userProfile.address1()).contains("123 Example Street")
        assertThat(userProfile.address2()).contains("Suite 100")
        assertThat(userProfile.businessName()).contains("Example Company")
        assertThat(userProfile.city()).contains("Chicago")
        assertThat(userProfile.country()).contains("US")
        assertThat(userProfile.dataLocality()).contains(UserProfile.DataLocality.UAE)
        assertThat(userProfile.dataLocalityMigrationStatus())
            .contains(UserProfile.DataLocalityMigrationStatus.FINISHED)
        assertThat(userProfile.dataLocalityUpdatedAt())
            .contains(OffsetDateTime.parse("2026-01-15T10:00:00Z"))
        assertThat(userProfile.firstName()).contains("Alex")
        assertThat(userProfile.lastName()).contains("Taylor")
        assertThat(userProfile.phoneNumber()).contains("+13125550100")
        assertThat(userProfile.recordType()).contains(UserProfile.RecordType.USER_PROFILE)
        assertThat(userProfile.state()).contains("IL")
        assertThat(userProfile.updatedAt()).contains(OffsetDateTime.parse("2026-01-15T10:30:00Z"))
        assertThat(userProfile.userId()).contains("12ade33a-21c0-473b-b055-b3c836e1c292")
        assertThat(userProfile.zip()).contains("60601")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userProfile =
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

        val roundtrippedUserProfile =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userProfile),
                jacksonTypeRef<UserProfile>(),
            )

        assertThat(roundtrippedUserProfile).isEqualTo(userProfile)
    }
}
