# GitPRCreateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sourceBranch** | **String** | Source Branch for pull request | 
**targetBranch** | **String** | Target Branch for pull request | 
**title** | **String** | PR title | 
**yamlGitConfigRef** | **String** | Git Sync Config Id | 
**accountIdentifier** | **String** | Account Identifier for the Entity |  [optional]
**orgIdentifier** | **String** | Organization Identifier for the Entity |  [optional]
**projectIdentifier** | **String** | Project Identifier for the Entity |  [optional]
**useUserFromToken** | **Boolean** | Specifies which token to use. If True, the SCM token will be used, else the Git Connector token will be used |  [optional]
