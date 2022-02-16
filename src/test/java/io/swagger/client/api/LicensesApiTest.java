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

import io.swagger.client.model.Error;
import io.swagger.client.model.Failure;
import io.swagger.client.model.ResponseDTOAccountLicense;
import io.swagger.client.model.ResponseDTOLicensesWithSummary;
import io.swagger.client.model.ResponseDTOListModuleLicense;
import io.swagger.client.model.ResponseDTOMapEditionSetEditionAction;
import io.swagger.client.model.ResponseDTOMapModuleTypeLong;
import io.swagger.client.model.ResponseDTOModuleLicense;
import io.swagger.client.model.StartTrial;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for LicensesApi
 */
@Ignore
public class LicensesApiTest {

    private final LicensesApi api = new LicensesApi();

    /**
     * Extends Trial License For A Module
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void extendTrialLicenseTest() throws Exception {
        StartTrial body = null;
        String accountIdentifier = null;
        ResponseDTOModuleLicense response = api.extendTrialLicense(body, accountIdentifier);

        // TODO: test validations
    }
    /**
     * Gets All Module License Information in Account
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAccountLicensesTest() throws Exception {
        String accountIdentifier = null;
        ResponseDTOAccountLicense response = api.getAccountLicenses(accountIdentifier);

        // TODO: test validations
    }
    /**
     * Get Allowed Actions Under Each Edition
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getEditionActionsTest() throws Exception {
        String accountIdentifier = null;
        String moduleType = null;
        ResponseDTOMapEditionSetEditionAction response = api.getEditionActions(accountIdentifier, moduleType);

        // TODO: test validations
    }
    /**
     * Get Last Modified Time Under Each ModuleType
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLastModifiedTimeForAllModuleTypesTest() throws Exception {
        String accountIdentifier = null;
        ResponseDTOMapModuleTypeLong response = api.getLastModifiedTimeForAllModuleTypes(accountIdentifier);

        // TODO: test validations
    }
    /**
     * Gets Module Licenses With Summary By Account And ModuleType
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLicensesAndSummaryTest() throws Exception {
        String accountIdentifier = null;
        String moduleType = null;
        ResponseDTOLicensesWithSummary response = api.getLicensesAndSummary(accountIdentifier, moduleType);

        // TODO: test validations
    }
    /**
     * Gets Module License
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getModuleLicenseByIdTest() throws Exception {
        String identifier = null;
        String accountIdentifier = null;
        ResponseDTOModuleLicense response = api.getModuleLicenseById(identifier, accountIdentifier);

        // TODO: test validations
    }
    /**
     * Gets Module Licenses By Account And ModuleType
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getModuleLicensesByAccountAndModuleTypeTest() throws Exception {
        String accountIdentifier = null;
        String moduleType = null;
        ResponseDTOListModuleLicense response = api.getModuleLicensesByAccountAndModuleType(accountIdentifier, moduleType);

        // TODO: test validations
    }
    /**
     * Starts Free License For A Module
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void startFreeLicenseTest() throws Exception {
        String accountIdentifier = null;
        String moduleType = null;
        ResponseDTOModuleLicense response = api.startFreeLicense(accountIdentifier, moduleType);

        // TODO: test validations
    }
    /**
     * Starts Trial License For A Module
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void startTrialLicenseTest() throws Exception {
        StartTrial body = null;
        String accountIdentifier = null;
        ResponseDTOModuleLicense response = api.startTrialLicense(body, accountIdentifier);

        // TODO: test validations
    }
}
