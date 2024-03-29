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

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.ErrorMetadata;
import io.swagger.client.model.PermissionCheck;
import io.swagger.client.model.ResponseMessage;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * AccessDeniedError
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class AccessDeniedError {
  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    SUCCESS("SUCCESS"),
    FAILURE("FAILURE"),
    ERROR("ERROR");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StatusEnum fromValue(String input) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return StatusEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("status")
  private StatusEnum status = null;

  /**
   * Gets or Sets code
   */
  @JsonAdapter(CodeEnum.Adapter.class)
  public enum CodeEnum {
    DEFAULT_ERROR_CODE("DEFAULT_ERROR_CODE"),
    INVALID_ARGUMENT("INVALID_ARGUMENT"),
    INVALID_EMAIL("INVALID_EMAIL"),
    DOMAIN_NOT_ALLOWED_TO_REGISTER("DOMAIN_NOT_ALLOWED_TO_REGISTER"),
    COMMNITY_EDITION_NOT_FOUND("COMMNITY_EDITION_NOT_FOUND"),
    DEPLOY_MODE_IS_NOT_ON_PREM("DEPLOY_MODE_IS_NOT_ON_PREM"),
    USER_ALREADY_REGISTERED("USER_ALREADY_REGISTERED"),
    USER_INVITATION_DOES_NOT_EXIST("USER_INVITATION_DOES_NOT_EXIST"),
    USER_DOES_NOT_EXIST("USER_DOES_NOT_EXIST"),
    USER_INVITE_OPERATION_FAILED("USER_INVITE_OPERATION_FAILED"),
    USER_DISABLED("USER_DISABLED"),
    ACCOUNT_DOES_NOT_EXIST("ACCOUNT_DOES_NOT_EXIST"),
    INACTIVE_ACCOUNT("INACTIVE_ACCOUNT"),
    ACCOUNT_MIGRATED("ACCOUNT_MIGRATED"),
    USER_DOMAIN_NOT_ALLOWED("USER_DOMAIN_NOT_ALLOWED"),
    MAX_FAILED_ATTEMPT_COUNT_EXCEEDED("MAX_FAILED_ATTEMPT_COUNT_EXCEEDED"),
    RESOURCE_NOT_FOUND("RESOURCE_NOT_FOUND"),
    ROLE_DOES_NOT_EXIST("ROLE_DOES_NOT_EXIST"),
    EMAIL_NOT_VERIFIED("EMAIL_NOT_VERIFIED"),
    EMAIL_VERIFICATION_TOKEN_NOT_FOUND("EMAIL_VERIFICATION_TOKEN_NOT_FOUND"),
    INVALID_TOKEN("INVALID_TOKEN"),
    REVOKED_TOKEN("REVOKED_TOKEN"),
    INVALID_CAPTCHA_TOKEN("INVALID_CAPTCHA_TOKEN"),
    NOT_ACCOUNT_MGR_NOR_HAS_ALL_APP_ACCESS("NOT_ACCOUNT_MGR_NOR_HAS_ALL_APP_ACCESS"),
    EXPIRED_TOKEN("EXPIRED_TOKEN"),
    TOKEN_ALREADY_REFRESHED_ONCE("TOKEN_ALREADY_REFRESHED_ONCE"),
    ACCESS_DENIED("ACCESS_DENIED"),
    NG_ACCESS_DENIED("NG_ACCESS_DENIED"),
    INVALID_CREDENTIAL("INVALID_CREDENTIAL"),
    INVALID_CREDENTIALS_THIRD_PARTY("INVALID_CREDENTIALS_THIRD_PARTY"),
    INVALID_KEY("INVALID_KEY"),
    INVALID_CONNECTOR_TYPE("INVALID_CONNECTOR_TYPE"),
    INVALID_KEYPATH("INVALID_KEYPATH"),
    INVALID_VARIABLE("INVALID_VARIABLE"),
    UNKNOWN_HOST("UNKNOWN_HOST"),
    UNREACHABLE_HOST("UNREACHABLE_HOST"),
    INVALID_PORT("INVALID_PORT"),
    SSH_SESSION_TIMEOUT("SSH_SESSION_TIMEOUT"),
    SOCKET_CONNECTION_ERROR("SOCKET_CONNECTION_ERROR"),
    CONNECTION_ERROR("CONNECTION_ERROR"),
    SOCKET_CONNECTION_TIMEOUT("SOCKET_CONNECTION_TIMEOUT"),
    CONNECTION_TIMEOUT("CONNECTION_TIMEOUT"),
    SSH_CONNECTION_ERROR("SSH_CONNECTION_ERROR"),
    USER_GROUP_ERROR("USER_GROUP_ERROR"),
    INVALID_EXECUTION_ID("INVALID_EXECUTION_ID"),
    ERROR_IN_GETTING_CHANNEL_STREAMS("ERROR_IN_GETTING_CHANNEL_STREAMS"),
    UNEXPECTED("UNEXPECTED"),
    UNKNOWN_ERROR("UNKNOWN_ERROR"),
    UNKNOWN_EXECUTOR_TYPE_ERROR("UNKNOWN_EXECUTOR_TYPE_ERROR"),
    DUPLICATE_STATE_NAMES("DUPLICATE_STATE_NAMES"),
    TRANSITION_NOT_LINKED("TRANSITION_NOT_LINKED"),
    TRANSITION_TO_INCORRECT_STATE("TRANSITION_TO_INCORRECT_STATE"),
    TRANSITION_TYPE_NULL("TRANSITION_TYPE_NULL"),
    STATES_WITH_DUP_TRANSITIONS("STATES_WITH_DUP_TRANSITIONS"),
    BARRIERS_NOT_RUNNING_CONCURRENTLY("BARRIERS_NOT_RUNNING_CONCURRENTLY"),
    NON_FORK_STATES("NON_FORK_STATES"),
    NON_REPEAT_STATES("NON_REPEAT_STATES"),
    INITIAL_STATE_NOT_DEFINED("INITIAL_STATE_NOT_DEFINED"),
    FILE_INTEGRITY_CHECK_FAILED("FILE_INTEGRITY_CHECK_FAILED"),
    INVALID_URL("INVALID_URL"),
    FILE_DOWNLOAD_FAILED("FILE_DOWNLOAD_FAILED"),
    PLATFORM_SOFTWARE_DELETE_ERROR("PLATFORM_SOFTWARE_DELETE_ERROR"),
    INVALID_CSV_FILE("INVALID_CSV_FILE"),
    INVALID_REQUEST("INVALID_REQUEST"),
    SCHEMA_VALIDATION_FAILED("SCHEMA_VALIDATION_FAILED"),
    FILTER_CREATION_ERROR("FILTER_CREATION_ERROR"),
    INVALID_YAML_ERROR("INVALID_YAML_ERROR"),
    PLAN_CREATION_ERROR("PLAN_CREATION_ERROR"),
    INVALID_INFRA_STATE("INVALID_INFRA_STATE"),
    PIPELINE_ALREADY_TRIGGERED("PIPELINE_ALREADY_TRIGGERED"),
    NON_EXISTING_PIPELINE("NON_EXISTING_PIPELINE"),
    DUPLICATE_COMMAND_NAMES("DUPLICATE_COMMAND_NAMES"),
    INVALID_PIPELINE("INVALID_PIPELINE"),
    COMMAND_DOES_NOT_EXIST("COMMAND_DOES_NOT_EXIST"),
    DUPLICATE_ARTIFACTSTREAM_NAMES("DUPLICATE_ARTIFACTSTREAM_NAMES"),
    DUPLICATE_HOST_NAMES("DUPLICATE_HOST_NAMES"),
    STATE_NOT_FOR_TYPE("STATE_NOT_FOR_TYPE"),
    STATE_MACHINE_ISSUE("STATE_MACHINE_ISSUE"),
    STATE_DISCONTINUE_FAILED("STATE_DISCONTINUE_FAILED"),
    STATE_PAUSE_FAILED("STATE_PAUSE_FAILED"),
    PAUSE_ALL_ALREADY("PAUSE_ALL_ALREADY"),
    RESUME_ALL_ALREADY("RESUME_ALL_ALREADY"),
    ROLLBACK_ALREADY("ROLLBACK_ALREADY"),
    ABORT_ALL_ALREADY("ABORT_ALL_ALREADY"),
    EXPIRE_ALL_ALREADY("EXPIRE_ALL_ALREADY"),
    RETRY_FAILED("RETRY_FAILED"),
    UNKNOWN_ARTIFACT_TYPE("UNKNOWN_ARTIFACT_TYPE"),
    UNKNOWN_STAGE_ELEMENT_WRAPPER_TYPE("UNKNOWN_STAGE_ELEMENT_WRAPPER_TYPE"),
    INIT_TIMEOUT("INIT_TIMEOUT"),
    LICENSE_EXPIRED("LICENSE_EXPIRED"),
    NOT_LICENSED("NOT_LICENSED"),
    REQUEST_TIMEOUT("REQUEST_TIMEOUT"),
    WORKFLOW_ALREADY_TRIGGERED("WORKFLOW_ALREADY_TRIGGERED"),
    JENKINS_ERROR("JENKINS_ERROR"),
    INVALID_ARTIFACT_SOURCE("INVALID_ARTIFACT_SOURCE"),
    INVALID_ARTIFACT_SERVER("INVALID_ARTIFACT_SERVER"),
    INVALID_CLOUD_PROVIDER("INVALID_CLOUD_PROVIDER"),
    UPDATE_NOT_ALLOWED("UPDATE_NOT_ALLOWED"),
    DELETE_NOT_ALLOWED("DELETE_NOT_ALLOWED"),
    APPDYNAMICS_CONFIGURATION_ERROR("APPDYNAMICS_CONFIGURATION_ERROR"),
    APM_CONFIGURATION_ERROR("APM_CONFIGURATION_ERROR"),
    SPLUNK_CONFIGURATION_ERROR("SPLUNK_CONFIGURATION_ERROR"),
    ELK_CONFIGURATION_ERROR("ELK_CONFIGURATION_ERROR"),
    LOGZ_CONFIGURATION_ERROR("LOGZ_CONFIGURATION_ERROR"),
    SUMO_CONFIGURATION_ERROR("SUMO_CONFIGURATION_ERROR"),
    INSTANA_CONFIGURATION_ERROR("INSTANA_CONFIGURATION_ERROR"),
    APPDYNAMICS_ERROR("APPDYNAMICS_ERROR"),
    STACKDRIVER_ERROR("STACKDRIVER_ERROR"),
    STACKDRIVER_CONFIGURATION_ERROR("STACKDRIVER_CONFIGURATION_ERROR"),
    NEWRELIC_CONFIGURATION_ERROR("NEWRELIC_CONFIGURATION_ERROR"),
    NEWRELIC_ERROR("NEWRELIC_ERROR"),
    DYNA_TRACE_CONFIGURATION_ERROR("DYNA_TRACE_CONFIGURATION_ERROR"),
    DYNA_TRACE_ERROR("DYNA_TRACE_ERROR"),
    CLOUDWATCH_ERROR("CLOUDWATCH_ERROR"),
    CLOUDWATCH_CONFIGURATION_ERROR("CLOUDWATCH_CONFIGURATION_ERROR"),
    PROMETHEUS_CONFIGURATION_ERROR("PROMETHEUS_CONFIGURATION_ERROR"),
    DATA_DOG_CONFIGURATION_ERROR("DATA_DOG_CONFIGURATION_ERROR"),
    SERVICE_GUARD_CONFIGURATION_ERROR("SERVICE_GUARD_CONFIGURATION_ERROR"),
    ENCRYPTION_NOT_CONFIGURED("ENCRYPTION_NOT_CONFIGURED"),
    UNAVAILABLE_DELEGATES("UNAVAILABLE_DELEGATES"),
    WORKFLOW_EXECUTION_IN_PROGRESS("WORKFLOW_EXECUTION_IN_PROGRESS"),
    PIPELINE_EXECUTION_IN_PROGRESS("PIPELINE_EXECUTION_IN_PROGRESS"),
    AWS_ACCESS_DENIED("AWS_ACCESS_DENIED"),
    AWS_CLUSTER_NOT_FOUND("AWS_CLUSTER_NOT_FOUND"),
    AWS_SERVICE_NOT_FOUND("AWS_SERVICE_NOT_FOUND"),
    IMAGE_NOT_FOUND("IMAGE_NOT_FOUND"),
    ILLEGAL_ARGUMENT("ILLEGAL_ARGUMENT"),
    IMAGE_TAG_NOT_FOUND("IMAGE_TAG_NOT_FOUND"),
    DELEGATE_NOT_AVAILABLE("DELEGATE_NOT_AVAILABLE"),
    INVALID_YAML_PAYLOAD("INVALID_YAML_PAYLOAD"),
    AUTHENTICATION_ERROR("AUTHENTICATION_ERROR"),
    AUTHORIZATION_ERROR("AUTHORIZATION_ERROR"),
    UNRECOGNIZED_YAML_FIELDS("UNRECOGNIZED_YAML_FIELDS"),
    COULD_NOT_MAP_BEFORE_YAML("COULD_NOT_MAP_BEFORE_YAML"),
    MISSING_BEFORE_YAML("MISSING_BEFORE_YAML"),
    MISSING_YAML("MISSING_YAML"),
    NON_EMPTY_DELETIONS("NON_EMPTY_DELETIONS"),
    GENERAL_YAML_ERROR("GENERAL_YAML_ERROR"),
    GENERAL_YAML_INFO("GENERAL_YAML_INFO"),
    YAML_GIT_SYNC_ERROR("YAML_GIT_SYNC_ERROR"),
    GIT_CONNECTION_ERROR("GIT_CONNECTION_ERROR"),
    GIT_ERROR("GIT_ERROR"),
    ARTIFACT_SERVER_ERROR("ARTIFACT_SERVER_ERROR"),
    ENCRYPT_DECRYPT_ERROR("ENCRYPT_DECRYPT_ERROR"),
    SECRET_MANAGEMENT_ERROR("SECRET_MANAGEMENT_ERROR"),
    SECRET_NOT_FOUND("SECRET_NOT_FOUND"),
    KMS_OPERATION_ERROR("KMS_OPERATION_ERROR"),
    GCP_KMS_OPERATION_ERROR("GCP_KMS_OPERATION_ERROR"),
    VAULT_OPERATION_ERROR("VAULT_OPERATION_ERROR"),
    AWS_SECRETS_MANAGER_OPERATION_ERROR("AWS_SECRETS_MANAGER_OPERATION_ERROR"),
    AZURE_KEY_VAULT_OPERATION_ERROR("AZURE_KEY_VAULT_OPERATION_ERROR"),
    CYBERARK_OPERATION_ERROR("CYBERARK_OPERATION_ERROR"),
    UNSUPPORTED_OPERATION_EXCEPTION("UNSUPPORTED_OPERATION_EXCEPTION"),
    FEATURE_UNAVAILABLE("FEATURE_UNAVAILABLE"),
    GENERAL_ERROR("GENERAL_ERROR"),
    BASELINE_CONFIGURATION_ERROR("BASELINE_CONFIGURATION_ERROR"),
    SAML_IDP_CONFIGURATION_NOT_AVAILABLE("SAML_IDP_CONFIGURATION_NOT_AVAILABLE"),
    INVALID_AUTHENTICATION_MECHANISM("INVALID_AUTHENTICATION_MECHANISM"),
    INVALID_SAML_CONFIGURATION("INVALID_SAML_CONFIGURATION"),
    INVALID_OAUTH_CONFIGURATION("INVALID_OAUTH_CONFIGURATION"),
    INVALID_LDAP_CONFIGURATION("INVALID_LDAP_CONFIGURATION"),
    USER_GROUP_SYNC_FAILURE("USER_GROUP_SYNC_FAILURE"),
    USER_GROUP_ALREADY_EXIST("USER_GROUP_ALREADY_EXIST"),
    INVALID_TWO_FACTOR_AUTHENTICATION_CONFIGURATION("INVALID_TWO_FACTOR_AUTHENTICATION_CONFIGURATION"),
    EXPLANATION("EXPLANATION"),
    HINT("HINT"),
    NOT_WHITELISTED_IP("NOT_WHITELISTED_IP"),
    INVALID_TOTP_TOKEN("INVALID_TOTP_TOKEN"),
    EMAIL_FAILED("EMAIL_FAILED"),
    SSL_HANDSHAKE_FAILED("SSL_HANDSHAKE_FAILED"),
    NO_APPS_ASSIGNED("NO_APPS_ASSIGNED"),
    INVALID_INFRA_CONFIGURATION("INVALID_INFRA_CONFIGURATION"),
    TEMPLATES_LINKED("TEMPLATES_LINKED"),
    USER_HAS_NO_PERMISSIONS("USER_HAS_NO_PERMISSIONS"),
    USER_NOT_AUTHORIZED("USER_NOT_AUTHORIZED"),
    USER_ALREADY_PRESENT("USER_ALREADY_PRESENT"),
    INVALID_USAGE_RESTRICTION("INVALID_USAGE_RESTRICTION"),
    USAGE_RESTRICTION_ERROR("USAGE_RESTRICTION_ERROR"),
    STATE_EXECUTION_INSTANCE_NOT_FOUND("STATE_EXECUTION_INSTANCE_NOT_FOUND"),
    DELEGATE_TASK_RETRY("DELEGATE_TASK_RETRY"),
    KUBERNETES_API_TASK_EXCEPTION("KUBERNETES_API_TASK_EXCEPTION"),
    KUBERNETES_TASK_EXCEPTION("KUBERNETES_TASK_EXCEPTION"),
    KUBERNETES_YAML_ERROR("KUBERNETES_YAML_ERROR"),
    SAVE_FILE_INTO_GCP_STORAGE_FAILED("SAVE_FILE_INTO_GCP_STORAGE_FAILED"),
    READ_FILE_FROM_GCP_STORAGE_FAILED("READ_FILE_FROM_GCP_STORAGE_FAILED"),
    FILE_NOT_FOUND_ERROR("FILE_NOT_FOUND_ERROR"),
    USAGE_LIMITS_EXCEEDED("USAGE_LIMITS_EXCEEDED"),
    EVENT_PUBLISH_FAILED("EVENT_PUBLISH_FAILED"),
    JIRA_ERROR("JIRA_ERROR"),
    EXPRESSION_EVALUATION_FAILED("EXPRESSION_EVALUATION_FAILED"),
    KUBERNETES_VALUES_ERROR("KUBERNETES_VALUES_ERROR"),
    KUBERNETES_CLUSTER_ERROR("KUBERNETES_CLUSTER_ERROR"),
    INCORRECT_SIGN_IN_MECHANISM("INCORRECT_SIGN_IN_MECHANISM"),
    OAUTH_LOGIN_FAILED("OAUTH_LOGIN_FAILED"),
    INVALID_TERRAFORM_TARGETS_REQUEST("INVALID_TERRAFORM_TARGETS_REQUEST"),
    TERRAFORM_EXECUTION_ERROR("TERRAFORM_EXECUTION_ERROR"),
    FILE_READ_FAILED("FILE_READ_FAILED"),
    FILE_SIZE_EXCEEDS_LIMIT("FILE_SIZE_EXCEEDS_LIMIT"),
    CLUSTER_NOT_FOUND("CLUSTER_NOT_FOUND"),
    MARKETPLACE_TOKEN_NOT_FOUND("MARKETPLACE_TOKEN_NOT_FOUND"),
    INVALID_MARKETPLACE_TOKEN("INVALID_MARKETPLACE_TOKEN"),
    INVALID_TICKETING_SERVER("INVALID_TICKETING_SERVER"),
    SERVICENOW_ERROR("SERVICENOW_ERROR"),
    PASSWORD_EXPIRED("PASSWORD_EXPIRED"),
    USER_LOCKED("USER_LOCKED"),
    PASSWORD_STRENGTH_CHECK_FAILED("PASSWORD_STRENGTH_CHECK_FAILED"),
    ACCOUNT_DISABLED("ACCOUNT_DISABLED"),
    INVALID_ACCOUNT_PERMISSION("INVALID_ACCOUNT_PERMISSION"),
    PAGERDUTY_ERROR("PAGERDUTY_ERROR"),
    HEALTH_ERROR("HEALTH_ERROR"),
    SAML_TEST_SUCCESS_MECHANISM_NOT_ENABLED("SAML_TEST_SUCCESS_MECHANISM_NOT_ENABLED"),
    DOMAIN_WHITELIST_FILTER_CHECK_FAILED("DOMAIN_WHITELIST_FILTER_CHECK_FAILED"),
    INVALID_DASHBOARD_UPDATE_REQUEST("INVALID_DASHBOARD_UPDATE_REQUEST"),
    DUPLICATE_FIELD("DUPLICATE_FIELD"),
    INVALID_AZURE_VAULT_CONFIGURATION("INVALID_AZURE_VAULT_CONFIGURATION"),
    USER_NOT_AUTHORIZED_DUE_TO_USAGE_RESTRICTIONS("USER_NOT_AUTHORIZED_DUE_TO_USAGE_RESTRICTIONS"),
    INVALID_ROLLBACK("INVALID_ROLLBACK"),
    DATA_COLLECTION_ERROR("DATA_COLLECTION_ERROR"),
    SUMO_DATA_COLLECTION_ERROR("SUMO_DATA_COLLECTION_ERROR"),
    DEPLOYMENT_GOVERNANCE_ERROR("DEPLOYMENT_GOVERNANCE_ERROR"),
    BATCH_PROCESSING_ERROR("BATCH_PROCESSING_ERROR"),
    GRAPHQL_ERROR("GRAPHQL_ERROR"),
    FILE_CREATE_ERROR("FILE_CREATE_ERROR"),
    ILLEGAL_STATE("ILLEGAL_STATE"),
    GIT_DIFF_COMMIT_NOT_IN_ORDER("GIT_DIFF_COMMIT_NOT_IN_ORDER"),
    FAILED_TO_ACQUIRE_PERSISTENT_LOCK("FAILED_TO_ACQUIRE_PERSISTENT_LOCK"),
    FAILED_TO_ACQUIRE_NON_PERSISTENT_LOCK("FAILED_TO_ACQUIRE_NON_PERSISTENT_LOCK"),
    POD_NOT_FOUND_ERROR("POD_NOT_FOUND_ERROR"),
    COMMAND_EXECUTION_ERROR("COMMAND_EXECUTION_ERROR"),
    REGISTRY_EXCEPTION("REGISTRY_EXCEPTION"),
    ENGINE_INTERRUPT_PROCESSING_EXCEPTION("ENGINE_INTERRUPT_PROCESSING_EXCEPTION"),
    ENGINE_IO_EXCEPTION("ENGINE_IO_EXCEPTION"),
    ENGINE_OUTCOME_EXCEPTION("ENGINE_OUTCOME_EXCEPTION"),
    ENGINE_SWEEPING_OUTPUT_EXCEPTION("ENGINE_SWEEPING_OUTPUT_EXCEPTION"),
    CACHE_NOT_FOUND_EXCEPTION("CACHE_NOT_FOUND_EXCEPTION"),
    ENGINE_ENTITY_UPDATE_EXCEPTION("ENGINE_ENTITY_UPDATE_EXCEPTION"),
    SHELL_EXECUTION_EXCEPTION("SHELL_EXECUTION_EXCEPTION"),
    TEMPLATE_NOT_FOUND("TEMPLATE_NOT_FOUND"),
    AZURE_SERVICE_EXCEPTION("AZURE_SERVICE_EXCEPTION"),
    AZURE_CLIENT_EXCEPTION("AZURE_CLIENT_EXCEPTION"),
    GIT_UNSEEN_REMOTE_HEAD_COMMIT("GIT_UNSEEN_REMOTE_HEAD_COMMIT"),
    TIMEOUT_ENGINE_EXCEPTION("TIMEOUT_ENGINE_EXCEPTION"),
    NO_AVAILABLE_DELEGATES("NO_AVAILABLE_DELEGATES"),
    NO_INSTALLED_DELEGATES("NO_INSTALLED_DELEGATES"),
    DUPLICATE_DELEGATE_EXCEPTION("DUPLICATE_DELEGATE_EXCEPTION"),
    GCP_MARKETPLACE_EXCEPTION("GCP_MARKETPLACE_EXCEPTION"),
    MISSING_DEFAULT_GOOGLE_CREDENTIALS("MISSING_DEFAULT_GOOGLE_CREDENTIALS"),
    INCORRECT_DEFAULT_GOOGLE_CREDENTIALS("INCORRECT_DEFAULT_GOOGLE_CREDENTIALS"),
    OPTIMISTIC_LOCKING_EXCEPTION("OPTIMISTIC_LOCKING_EXCEPTION"),
    NG_PIPELINE_EXECUTION_EXCEPTION("NG_PIPELINE_EXECUTION_EXCEPTION"),
    NG_PIPELINE_CREATE_EXCEPTION("NG_PIPELINE_CREATE_EXCEPTION"),
    RESOURCE_NOT_FOUND_EXCEPTION("RESOURCE_NOT_FOUND_EXCEPTION"),
    PMS_INITIALIZE_SDK_EXCEPTION("PMS_INITIALIZE_SDK_EXCEPTION"),
    UNEXPECTED_SNIPPET_EXCEPTION("UNEXPECTED_SNIPPET_EXCEPTION"),
    UNEXPECTED_SCHEMA_EXCEPTION("UNEXPECTED_SCHEMA_EXCEPTION"),
    CONNECTOR_VALIDATION_EXCEPTION("CONNECTOR_VALIDATION_EXCEPTION"),
    TIMESCALE_NOT_AVAILABLE("TIMESCALE_NOT_AVAILABLE"),
    MIGRATION_EXCEPTION("MIGRATION_EXCEPTION"),
    REQUEST_PROCESSING_INTERRUPTED("REQUEST_PROCESSING_INTERRUPTED"),
    SECRET_MANAGER_ID_NOT_FOUND("SECRET_MANAGER_ID_NOT_FOUND"),
    GCP_SECRET_MANAGER_OPERATION_ERROR("GCP_SECRET_MANAGER_OPERATION_ERROR"),
    GCP_SECRET_OPERATION_ERROR("GCP_SECRET_OPERATION_ERROR"),
    GIT_OPERATION_ERROR("GIT_OPERATION_ERROR"),
    TASK_FAILURE_ERROR("TASK_FAILURE_ERROR"),
    INSTANCE_STATS_PROCESS_ERROR("INSTANCE_STATS_PROCESS_ERROR"),
    INSTANCE_STATS_MIGRATION_ERROR("INSTANCE_STATS_MIGRATION_ERROR"),
    DEPLOYMENT_MIGRATION_ERROR("DEPLOYMENT_MIGRATION_ERROR"),
    INSTANCE_STATS_AGGREGATION_ERROR("INSTANCE_STATS_AGGREGATION_ERROR"),
    UNRESOLVED_EXPRESSIONS_ERROR("UNRESOLVED_EXPRESSIONS_ERROR"),
    KRYO_HANDLER_NOT_FOUND_ERROR("KRYO_HANDLER_NOT_FOUND_ERROR"),
    DELEGATE_ERROR_HANDLER_EXCEPTION("DELEGATE_ERROR_HANDLER_EXCEPTION"),
    UNEXPECTED_TYPE_ERROR("UNEXPECTED_TYPE_ERROR"),
    EXCEPTION_HANDLER_NOT_FOUND("EXCEPTION_HANDLER_NOT_FOUND"),
    CONNECTOR_NOT_FOUND_EXCEPTION("CONNECTOR_NOT_FOUND_EXCEPTION"),
    GCP_SERVER_ERROR("GCP_SERVER_ERROR"),
    HTTP_RESPONSE_EXCEPTION("HTTP_RESPONSE_EXCEPTION"),
    SCM_NOT_FOUND_ERROR("SCM_NOT_FOUND_ERROR"),
    SCM_CONFLICT_ERROR("SCM_CONFLICT_ERROR"),
    SCM_UNPROCESSABLE_ENTITY("SCM_UNPROCESSABLE_ENTITY"),
    PROCESS_EXECUTION_EXCEPTION("PROCESS_EXECUTION_EXCEPTION"),
    SCM_UNAUTHORIZED("SCM_UNAUTHORIZED"),
    DATA("DATA"),
    CONTEXT("CONTEXT"),
    PR_CREATION_ERROR("PR_CREATION_ERROR"),
    URL_NOT_REACHABLE("URL_NOT_REACHABLE"),
    URL_NOT_PROVIDED("URL_NOT_PROVIDED"),
    ENGINE_EXPRESSION_EVALUATION_ERROR("ENGINE_EXPRESSION_EVALUATION_ERROR"),
    ENGINE_FUNCTOR_ERROR("ENGINE_FUNCTOR_ERROR"),
    JIRA_CLIENT_ERROR("JIRA_CLIENT_ERROR"),
    SCM_NOT_MODIFIED("SCM_NOT_MODIFIED"),
    APPROVAL_STEP_NG_ERROR("APPROVAL_STEP_NG_ERROR"),
    BUCKET_SERVER_ERROR("BUCKET_SERVER_ERROR"),
    GIT_SYNC_ERROR("GIT_SYNC_ERROR"),
    TEMPLATE_EXCEPTION("TEMPLATE_EXCEPTION"),
    ENTITY_REFERENCE_EXCEPTION("ENTITY_REFERENCE_EXCEPTION");

    private String value;

    CodeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static CodeEnum fromValue(String input) {
      for (CodeEnum b : CodeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<CodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CodeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public CodeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return CodeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("code")
  private CodeEnum code = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("correlationId")
  private String correlationId = null;

  @SerializedName("detailedMessage")
  private String detailedMessage = null;

  @SerializedName("responseMessages")
  private List<ResponseMessage> responseMessages = null;

  @SerializedName("metadata")
  private ErrorMetadata metadata = null;

  @SerializedName("failedPermissionChecks")
  private List<PermissionCheck> failedPermissionChecks = null;

  public AccessDeniedError status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public AccessDeniedError code(CodeEnum code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @Schema(description = "")
  public CodeEnum getCode() {
    return code;
  }

  public void setCode(CodeEnum code) {
    this.code = code;
  }

  public AccessDeniedError message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @Schema(description = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public AccessDeniedError correlationId(String correlationId) {
    this.correlationId = correlationId;
    return this;
  }

   /**
   * Get correlationId
   * @return correlationId
  **/
  @Schema(description = "")
  public String getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }

  public AccessDeniedError detailedMessage(String detailedMessage) {
    this.detailedMessage = detailedMessage;
    return this;
  }

   /**
   * Get detailedMessage
   * @return detailedMessage
  **/
  @Schema(description = "")
  public String getDetailedMessage() {
    return detailedMessage;
  }

  public void setDetailedMessage(String detailedMessage) {
    this.detailedMessage = detailedMessage;
  }

  public AccessDeniedError responseMessages(List<ResponseMessage> responseMessages) {
    this.responseMessages = responseMessages;
    return this;
  }

  public AccessDeniedError addResponseMessagesItem(ResponseMessage responseMessagesItem) {
    if (this.responseMessages == null) {
      this.responseMessages = new ArrayList<ResponseMessage>();
    }
    this.responseMessages.add(responseMessagesItem);
    return this;
  }

   /**
   * Get responseMessages
   * @return responseMessages
  **/
  @Schema(description = "")
  public List<ResponseMessage> getResponseMessages() {
    return responseMessages;
  }

  public void setResponseMessages(List<ResponseMessage> responseMessages) {
    this.responseMessages = responseMessages;
  }

  public AccessDeniedError metadata(ErrorMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @Schema(description = "")
  public ErrorMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(ErrorMetadata metadata) {
    this.metadata = metadata;
  }

  public AccessDeniedError failedPermissionChecks(List<PermissionCheck> failedPermissionChecks) {
    this.failedPermissionChecks = failedPermissionChecks;
    return this;
  }

  public AccessDeniedError addFailedPermissionChecksItem(PermissionCheck failedPermissionChecksItem) {
    if (this.failedPermissionChecks == null) {
      this.failedPermissionChecks = new ArrayList<PermissionCheck>();
    }
    this.failedPermissionChecks.add(failedPermissionChecksItem);
    return this;
  }

   /**
   * Get failedPermissionChecks
   * @return failedPermissionChecks
  **/
  @Schema(description = "")
  public List<PermissionCheck> getFailedPermissionChecks() {
    return failedPermissionChecks;
  }

  public void setFailedPermissionChecks(List<PermissionCheck> failedPermissionChecks) {
    this.failedPermissionChecks = failedPermissionChecks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessDeniedError accessDeniedError = (AccessDeniedError) o;
    return Objects.equals(this.status, accessDeniedError.status) &&
        Objects.equals(this.code, accessDeniedError.code) &&
        Objects.equals(this.message, accessDeniedError.message) &&
        Objects.equals(this.correlationId, accessDeniedError.correlationId) &&
        Objects.equals(this.detailedMessage, accessDeniedError.detailedMessage) &&
        Objects.equals(this.responseMessages, accessDeniedError.responseMessages) &&
        Objects.equals(this.metadata, accessDeniedError.metadata) &&
        Objects.equals(this.failedPermissionChecks, accessDeniedError.failedPermissionChecks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, code, message, correlationId, detailedMessage, responseMessages, metadata, failedPermissionChecks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessDeniedError {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    detailedMessage: ").append(toIndentedString(detailedMessage)).append("\n");
    sb.append("    responseMessages: ").append(toIndentedString(responseMessages)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    failedPermissionChecks: ").append(toIndentedString(failedPermissionChecks)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
