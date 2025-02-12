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

package com.telnyx.sdk.api;

import com.telnyx.sdk.*;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.GetBucketUsage200Response;
import com.telnyx.sdk.model.GetStorageAPIUsage200Response;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for BucketUsageApi
 */
public class BucketUsageApiTest {

    private final BucketUsageApi api = new BucketUsageApi();

    /**
     * Get Bucket Usage
     *
     * Returns the amount of storage space and number of files a bucket takes up.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBucketUsageTest() throws ApiException {
        //String bucketName = null;
        //GetBucketUsage200Response response = api.getBucketUsage(bucketName);
        // TODO: test validations
    }

    /**
     * Get API Usage
     *
     * Returns the detail on API usage on a bucket of a particular time period, group by method category.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStorageAPIUsageTest() throws ApiException {
        //String bucketName = null;
        //OffsetDateTime filterStartTime = null;
        //OffsetDateTime filterEndTime = null;
        //GetStorageAPIUsage200Response response = api.getStorageAPIUsage(bucketName, filterStartTime, filterEndTime);
        // TODO: test validations
    }
}
