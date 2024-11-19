/*
 * Telnyx API
 * Notifications and Notification Settings.
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
import com.telnyx.sdk.model.CreateFineTuningJobRequest;
import com.telnyx.sdk.model.FineTuningJob;
import com.telnyx.sdk.model.FineTuningJobsListData;
import com.telnyx.sdk.model.HTTPValidationError;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FineTuningApi
 */
public class FineTuningApiTest {

    private final FineTuningApi api = new FineTuningApi();

    /**
     * Cancel a fine tuning job
     *
     * Cancel a fine tuning job.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelNewFinetuningjobPublicFinetuningPostTest() throws ApiException {
        //String jobId = null;
        //FineTuningJob response = api.cancelNewFinetuningjobPublicFinetuningPost(jobId);
        // TODO: test validations
    }

    /**
     * Create a fine tuning job
     *
     * Create a new fine tuning job.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNewFinetuningjobPublicFinetuningPostTest() throws ApiException {
        //CreateFineTuningJobRequest createFineTuningJobRequest = null;
        //FineTuningJob response = api.createNewFinetuningjobPublicFinetuningPost(createFineTuningJobRequest);
        // TODO: test validations
    }

    /**
     * List fine tuning jobs
     *
     * Retrieve a list of all fine tuning jobs created by the user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFinetuningjobPublicFinetuningGetTest() throws ApiException {
        //FineTuningJobsListData response = api.getFinetuningjobPublicFinetuningGet();
        // TODO: test validations
    }

    /**
     * Get a fine tuning job
     *
     * Retrieve a fine tuning job by &#x60;job_id&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFinetuningjobPublicFinetuningJobIdGetTest() throws ApiException {
        //String jobId = null;
        //FineTuningJob response = api.getFinetuningjobPublicFinetuningJobIdGet(jobId);
        // TODO: test validations
    }

}
