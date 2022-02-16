# VaultConnector

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authToken** | **String** |  |  [optional]
**basePath** | **String** | This is the location of the Vault directory where Secret will be stored. |  [optional]
**vaultUrl** | **String** | URL of the Vault. |  [optional]
**isReadOnly** | **Boolean** | Boolean value to indicate if the Secret Manager created is read only. |  [optional]
**renewalIntervalMinutes** | **Long** | This is the time interval for token renewal. |  [optional]
**secretEngineManuallyConfigured** | **Boolean** | Manually entered Secret Engine. |  [optional]
**secretEngineName** | **String** | Name of the Secret Engine. |  [optional]
**appRoleId** | **String** | ID of App Role. |  [optional]
**secretId** | **String** |  |  [optional]
**isDefault** | **Boolean** |  |  [optional]
**secretEngineVersion** | **Integer** | Version of Secret Engine. |  [optional]
**delegateSelectors** | **List&lt;String&gt;** | List of Delegate Selectors that belong to the same Delegate and are used to connect to the Secret Manager. |  [optional]
**namespace** | **String** | This is the Vault namespace where Secret will be created. |  [optional]
**sinkPath** | **String** |  |  [optional]
**useVaultAgent** | **Boolean** | Boolean value to indicate if Vault Agent is used for authentication. |  [optional]
**_default** | **Boolean** |  |  [optional]
**accessType** | [**AccessTypeEnum**](#AccessTypeEnum) |  |  [optional]
**readOnly** | **Boolean** |  |  [optional]

<a name="AccessTypeEnum"></a>
## Enum: AccessTypeEnum
Name | Value
---- | -----
APP_ROLE | &quot;APP_ROLE&quot;
TOKEN | &quot;TOKEN&quot;
VAULT_AGENT | &quot;VAULT_AGENT&quot;
