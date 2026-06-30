// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionSwitchSupervisorRoleParamsTest {

    @Test
    fun create() {
        ActionSwitchSupervisorRoleParams.builder()
            .callControlId("call_control_id")
            .role(ActionSwitchSupervisorRoleParams.Role.BARGE)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ActionSwitchSupervisorRoleParams.builder()
                .callControlId("call_control_id")
                .role(ActionSwitchSupervisorRoleParams.Role.BARGE)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("call_control_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionSwitchSupervisorRoleParams.builder()
                .callControlId("call_control_id")
                .role(ActionSwitchSupervisorRoleParams.Role.BARGE)
                .build()

        val body = params._body()

        assertThat(body.role()).isEqualTo(ActionSwitchSupervisorRoleParams.Role.BARGE)
    }
}
