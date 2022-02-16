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
import io.swagger.client.model.FormDataContentDisposition;
import io.swagger.client.model.OAuthSettings;
import io.swagger.client.model.RestResponseAuthenticationSettingsResponse;
import io.swagger.client.model.RestResponseBoolean;
import io.swagger.client.model.RestResponseLoginTypeResponse;
import io.swagger.client.model.RestResponsePasswordStrengthPolicy;
import io.swagger.client.model.RestResponseSSOConfig;
import io.swagger.client.model.TwoFactorAdminOverrideSettings;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for AuthenticationSettingsApi
 */
@Ignore
public class AuthenticationSettingsApiTest {

    private final AuthenticationSettingsApi api = new AuthenticationSettingsApi();

    /**
     * Deletes SAML meta data by accountIdentifier
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteSamlMetaDataTest() throws Exception {
        String accountIdentifier = null;
        RestResponseSSOConfig response = api.deleteSamlMetaData(accountIdentifier);

        // TODO: test validations
    }
    /**
     * Get the authentication settings by accountIdentifier
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAuthenticationSettingsTest() throws Exception {
        String accountIdentifier = null;
        RestResponseAuthenticationSettingsResponse response = api.getAuthenticationSettings(accountIdentifier);

        // TODO: test validations
    }
    /**
     * Get the password strength settings by accountIdentifier
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getPasswordStrengthSettingsTest() throws Exception {
        String accountIdentifier = null;
        RestResponsePasswordStrengthPolicy response = api.getPasswordStrengthSettings(accountIdentifier);

        // TODO: test validations
    }
    /**
     * Get the SAML login test by accountId
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getSamlLoginTestTest() throws Exception {
        String accountId = null;
        RestResponseLoginTypeResponse response = api.getSamlLoginTest(accountId);

        // TODO: test validations
    }
    /**
     * Deletes OAuth mechanism by accountIdentifier
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void removeOauthMechanismTest() throws Exception {
        String accountIdentifier = null;
        RestResponseBoolean response = api.removeOauthMechanism(accountIdentifier);

        // TODO: test validations
    }
    /**
     * Set two factor auth at account lever by accountIdentifier
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void setTwoFactorAuthAtAccountLevelTest() throws Exception {
        TwoFactorAdminOverrideSettings body = null;
        String accountIdentifier = null;
        RestResponseBoolean response = api.setTwoFactorAuthAtAccountLevel(body, accountIdentifier);

        // TODO: test validations
    }
    /**
     * Updates the Auth mechanism by accountIdentifier
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateAuthMechanismTest() throws Exception {
        String accountIdentifier = null;
        String authenticationMechanism = null;
        RestResponseBoolean response = api.updateAuthMechanism(accountIdentifier, authenticationMechanism);

        // TODO: test validations
    }
    /**
     * Updates the Oauth providers by accountIdentifier
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateOauthProvidersTest() throws Exception {
        OAuthSettings body = null;
        String accountIdentifier = null;
        RestResponseBoolean response = api.updateOauthProviders(body, accountIdentifier);

        // TODO: test validations
    }
    /**
     * Updates the SAML metadata by accountId
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateSamlMetaDataTest() throws Exception {
        String accountId = null;
        Object file = null;
        FormDataContentDisposition fileMetadata = null;
        String displayName = null;
        String groupMembershipAttr = null;
        Boolean authorizationEnabled = null;
        String logoutUrl = null;
        String entityIdentifier = null;
        String samlProviderType = null;
        String clientId = null;
        String clientSecret = null;
        RestResponseSSOConfig response = api.updateSamlMetaData(accountId, file, fileMetadata, displayName, groupMembershipAttr, authorizationEnabled, logoutUrl, entityIdentifier, samlProviderType, clientId, clientSecret);

        // TODO: test validations
    }
    /**
     * Updates the Whitelisted domains by accountIdentifier
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateWhitelistedDomainsTest() throws Exception {
        String accountIdentifier = null;
        List<String> body = null;
        RestResponseBoolean response = api.updateWhitelistedDomains(accountIdentifier, body);

        // TODO: test validations
    }
    /**
     * Uploads the SAML metadata by accountId
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void uploadSamlMetaDataTest() throws Exception {
        String accountId = null;
        Object file = null;
        FormDataContentDisposition fileMetadata = null;
        String displayName = null;
        String groupMembershipAttr = null;
        Boolean authorizationEnabled = null;
        String logoutUrl = null;
        String entityIdentifier = null;
        String samlProviderType = null;
        String clientId = null;
        String clientSecret = null;
        RestResponseSSOConfig response = api.uploadSamlMetaData(accountId, file, fileMetadata, displayName, groupMembershipAttr, authorizationEnabled, logoutUrl, entityIdentifier, samlProviderType, clientId, clientSecret);

        // TODO: test validations
    }
}
