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

import static org.junit.Assert.assertEquals;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.Test;

/**
 * Model tests for Fax
 */
public class FaxTest {

    private final Fax model = new Fax();

    /**
     * Model tests for Fax
     */
    @Test
    public void testFax() {
        // TODO: test Fax
    }

    /**
     * Test the property 'recordType'
     */
    @Test
    public void recordTypeTest() {
        // TODO: test recordType
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'connectionId'
     */
    @Test
    public void connectionIdTest() {
        // TODO: test connectionId
    }

    /**
     * Test the property 'direction'
     */
    @Test
    public void directionTest() {
        // TODO: test direction
    }

    /**
     * Test the property 'mediaUrl'
     */
    @Test
    public void mediaUrlTest() {
        // TODO: test mediaUrl
    }

    /**
     * Test the property 'to'
     */
    @Test
    public void toTest() {
        // TODO: test to
    }

    /**
     * Test the property 'from'
     */
    @Test
    public void fromTest() {
        // TODO: test from
    }

    /**
     * Test the property 'quality'
     */
    @Test
    public void qualityTest() {
        // TODO: test quality
    }

    /**
     * Test the property 'status'
     */
    @Test
    public void statusTest() {
        //valid outbound statuses
        assertEquals(Fax.StatusEnum.QUEUED, Fax.StatusEnum.fromValue("queued"));
        assertEquals(
            Fax.StatusEnum.MEDIA_PROCESSED,
            Fax.StatusEnum.fromValue("media.processed")
        );
        assertEquals(
            Fax.StatusEnum.SENDING,
            Fax.StatusEnum.fromValue("sending")
        );
        assertEquals(
            Fax.StatusEnum.DELIVERED,
            Fax.StatusEnum.fromValue("delivered")
        );
        assertEquals(Fax.StatusEnum.FAILED, Fax.StatusEnum.fromValue("failed"));

        //valid inbound statuses
        assertEquals(
            Fax.StatusEnum.INITIATED,
            Fax.StatusEnum.fromValue("initiated")
        );
        assertEquals(
            Fax.StatusEnum.RECEIVING,
            Fax.StatusEnum.fromValue("receiving")
        );
        assertEquals(
            Fax.StatusEnum.MEDIA_PROCESSING,
            Fax.StatusEnum.fromValue("media.processing")
        );
        assertEquals(
            Fax.StatusEnum.RECEIVED,
            Fax.StatusEnum.fromValue("received")
        );
        assertEquals(Fax.StatusEnum.FAILED, Fax.StatusEnum.fromValue("failed"));
    }

    /**
     * Test the property 'webhookUrl'
     */
    @Test
    public void webhookUrlTest() {
        // TODO: test webhookUrl
    }

    /**
     * Test the property 'webhookFailoverUrl'
     */
    @Test
    public void webhookFailoverUrlTest() {
        // TODO: test webhookFailoverUrl
    }

    /**
     * Test the property 'storeMedia'
     */
    @Test
    public void storeMediaTest() {
        // TODO: test storeMedia
    }

    /**
     * Test the property 'storedMediaUrl'
     */
    @Test
    public void storedMediaUrlTest() {
        // TODO: test storedMediaUrl
    }

    /**
     * Test the property 'createdAt'
     */
    @Test
    public void createdAtTest() {
        // TODO: test createdAt
    }

    /**
     * Test the property 'updatedAt'
     */
    @Test
    public void updatedAtTest() {
        // TODO: test updatedAt
    }
}
