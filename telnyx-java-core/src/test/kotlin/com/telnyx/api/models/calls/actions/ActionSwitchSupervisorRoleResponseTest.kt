// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionSwitchSupervisorRoleResponseTest {

    @Test
    fun create() {
        val actionSwitchSupervisorRoleResponse =
            ActionSwitchSupervisorRoleResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        assertThat(actionSwitchSupervisorRoleResponse.data())
            .contains(CallControlCommandResult.builder().result("ok").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionSwitchSupervisorRoleResponse =
            ActionSwitchSupervisorRoleResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        val roundtrippedActionSwitchSupervisorRoleResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionSwitchSupervisorRoleResponse),
                jacksonTypeRef<ActionSwitchSupervisorRoleResponse>(),
            )

        assertThat(roundtrippedActionSwitchSupervisorRoleResponse)
            .isEqualTo(actionSwitchSupervisorRoleResponse)
    }
}
