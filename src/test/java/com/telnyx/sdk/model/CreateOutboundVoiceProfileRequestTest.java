/*
 * Telnyx API
 * SIP trunking, SMS, MMS, Call Control and Telephony Data Services.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: support@telnyx.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.telnyx.sdk.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.telnyx.sdk.model.OutboundCallRecording;
import com.telnyx.sdk.model.ServicePlan;
import com.telnyx.sdk.model.TrafficType;
import com.telnyx.sdk.model.UsagePaymentMethod;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Model tests for CreateOutboundVoiceProfileRequest
 */
public class CreateOutboundVoiceProfileRequestTest {

    private final CreateOutboundVoiceProfileRequest model =
        new CreateOutboundVoiceProfileRequest();

    /**
     * Model tests for CreateOutboundVoiceProfileRequest
     */
    @Test
    public void testCreateOutboundVoiceProfileRequest() {
        // TODO: test CreateOutboundVoiceProfileRequest
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'trafficType'
     */
    @Test
    public void trafficTypeTest() {
        // TODO: test trafficType
    }

    /**
     * Test the property 'servicePlan'
     */
    @Test
    public void servicePlanTest() {
        // TODO: test servicePlan
    }

    /**
     * Test the property 'concurrentCallLimit'
     */
    @Test
    public void concurrentCallLimitTest() {
        // TODO: test concurrentCallLimit
    }

    /**
     * Test the property 'enabled'
     */
    @Test
    public void enabledTest() {
        // TODO: test enabled
    }

    /**
     * Test the property 'tags'
     */
    @Test
    public void tagsTest() {
        // TODO: test tags
    }

    /**
     * Test the property 'usagePaymentMethod'
     */
    @Test
    public void usagePaymentMethodTest() {
        // TODO: test usagePaymentMethod
    }

    /**
     * Test the property 'whitelistedDestinations'
     */
    @Test
    public void whitelistedDestinationsTest() {
        // TODO: test whitelistedDestinations
    }

    /**
     * Test the property 'maxDestinationRate'
     */
    @Test
    public void maxDestinationRateTest() {
        // TODO: test maxDestinationRate
    }

    /**
     * Test the property 'dailySpendLimit'
     */
    @Test
    public void dailySpendLimitTest() {
        // TODO: test dailySpendLimit
    }

    /**
     * Test the property 'dailySpendLimitEnabled'
     */
    @Test
    public void dailySpendLimitEnabledTest() {
        // TODO: test dailySpendLimitEnabled
    }

    /**
     * Test the property 'callRecording'
     */
    @Test
    public void callRecordingTest() {
        // TODO: test callRecording
    }

    /**
     * Test the property 'billingGroupId'
     */
    @Test
    public void billingGroupIdTest() {
        // TODO: test billingGroupId
    }
}
