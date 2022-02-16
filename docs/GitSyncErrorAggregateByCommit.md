# GitSyncErrorAggregateByCommit

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**gitCommitId** | **String** | Commit Id |  [optional]
**failedCount** | **Integer** | The number of active errors in a commit |  [optional]
**repoId** | **String** | Git Sync Config Id |  [optional]
**branchName** | **String** | Branch Name |  [optional]
**commitMessage** | **String** | Commit Message |  [optional]
**createdAt** | **Long** | This is the time at which the Git Sync error was logged |  [optional]
**errorsForSummaryView** | [**List&lt;GitSyncError&gt;**](GitSyncError.md) | This has the list of Git Sync errors corresponding to a specific Commit Id |  [optional]
