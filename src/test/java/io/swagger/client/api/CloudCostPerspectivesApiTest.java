/*
 * CD NextGen API Reference
 * This is the Open Api Spec 3 for the NextGen Manager. This is under active development. Beware of the breaking change with respect to the generated code stub  # Authentication  <!-- ReDoc-Inject: <security-definitions> -->
 *
 * OpenAPI spec version: 3.0
 * Contact: contact@harness.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.model.CEView;
import io.swagger.client.model.Error;
import io.swagger.client.model.Failure;
import io.swagger.client.model.ResponseDTOCEView;
import io.swagger.client.model.ResponseDTODouble;
import io.swagger.client.model.ResponseDTOString;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for CloudCostPerspectivesApi
 */
@Ignore
public class CloudCostPerspectivesApiTest {

    private final CloudCostPerspectivesApi api = new CloudCostPerspectivesApi();

    /**
     * Create a Perspective
     *
     * Create a Perspective. You can set the clone parameter as true to clone a Perspective.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createPerspectiveTest() throws Exception {
        CEView body = null;
        String accountIdentifier = null;
        Boolean clone = null;
        ResponseDTOCEView response = api.createPerspective(body, accountIdentifier, clone);

        // TODO: test validations
    }
    /**
     * Delete a Perspective
     *
     * Delete a Perspective for the given Perspective ID.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deletePerspectiveTest() throws Exception {
        String accountIdentifier = null;
        String perspectiveId = null;
        ResponseDTOString response = api.deletePerspective(accountIdentifier, perspectiveId);

        // TODO: test validations
    }
    /**
     * Get the forecasted cost of a Perspective for given period
     *
     * Get the forecasted cost of a Perspective for next period
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getForecastCostForPeriodTest() throws Exception {
        String accountIdentifier = null;
        String perspectiveId = null;
        Long startTime = null;
        String period = null;
        ResponseDTODouble response = api.getForecastCostForPeriod(accountIdentifier, perspectiveId, startTime, period);

        // TODO: test validations
    }
    /**
     * Fetch forecasted cost details of a Perspective
     *
     * Fetch forecasted cost details of a Perspective for the next 30 days for the given Perspective ID.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getForecastCostV2Test() throws Exception {
        String accountIdentifier = null;
        String perspectiveId = null;
        ResponseDTODouble response = api.getForecastCostV2(accountIdentifier, perspectiveId);

        // TODO: test validations
    }
    /**
     * Fetch cost details of a Perspective for the previous month
     *
     * Fetch cost details of a Perspective for the previous month for the given  Perspective ID.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLastMonthCostV2Test() throws Exception {
        String accountIdentifier = null;
        String perspectiveId = null;
        ResponseDTODouble response = api.getLastMonthCostV2(accountIdentifier, perspectiveId);

        // TODO: test validations
    }
    /**
     * Get the last period cost for a Perspective
     *
     * Get last period cost for a Perspective
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLastPeriodCostTest() throws Exception {
        String accountIdentifier = null;
        String perspectiveId = null;
        Long startTime = null;
        String period = null;
        ResponseDTODouble response = api.getLastPeriodCost(accountIdentifier, perspectiveId, startTime, period);

        // TODO: test validations
    }
    /**
     * Fetch details of a Perspective
     *
     * Fetch details of a Perspective for the given Perspective ID.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getPerspectiveTest() throws Exception {
        String accountIdentifier = null;
        String perspectiveId = null;
        ResponseDTOCEView response = api.getPerspective(accountIdentifier, perspectiveId);

        // TODO: test validations
    }
    /**
     * Update a Perspective
     *
     * Update a Perspective. It accepts a CEView object and upserts it using the uuid mentioned in the definition.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updatePerspectiveTest() throws Exception {
        CEView body = null;
        String accountIdentifier = null;
        ResponseDTOCEView response = api.updatePerspective(body, accountIdentifier);

        // TODO: test validations
    }
}
