# AzureKeyVaultConnector

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientId** | **String** | Application ID of the Azure App. | 
**secretKey** | **String** |  | 
**tenantId** | **String** | The Azure Active Directory (AAD) directory ID where you created your application. | 
**vaultName** | **String** | The Azure Active Directory (AAD) directory ID where you created your application. | 
**subscription** | **String** | Azure Subscription ID. | 
**isDefault** | **Boolean** | Boolean value to indicate if the Secret Manager is your default Secret Manager. |  [optional]
**azureEnvironmentType** | [**AzureEnvironmentTypeEnum**](#AzureEnvironmentTypeEnum) | This specifies the Azure Environment type, which is AZURE by default. |  [optional]
**delegateSelectors** | **List&lt;String&gt;** | List of Delegate Selectors that belong to the same Delegate and are used to connect to the Secret Manager. |  [optional]
**_default** | **Boolean** |  |  [optional]

<a name="AzureEnvironmentTypeEnum"></a>
## Enum: AzureEnvironmentTypeEnum
Name | Value
---- | -----
AZURE | &quot;AZURE&quot;
AZURE_US_GOVERNMENT | &quot;AZURE_US_GOVERNMENT&quot;
