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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * This contains metadata about step.
 */
@Schema(description = "This contains metadata about step.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class StepData {
  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("disabled")
  private Boolean disabled = null;

  /**
   * Gets or Sets featureRestrictionName
   */
  @JsonAdapter(FeatureRestrictionNameEnum.Adapter.class)
  public enum FeatureRestrictionNameEnum {
    TEST1("TEST1"),
    TEST2("TEST2"),
    TEST3("TEST3"),
    TEST4("TEST4"),
    TEST5("TEST5"),
    TEST6("TEST6"),
    TEST7("TEST7"),
    PERSPECTIVES("PERSPECTIVES"),
    CCM_K8S_CLUSTERS("CCM_K8S_CLUSTERS"),
    CCM_AUTOSTOPPING_RULES("CCM_AUTOSTOPPING_RULES"),
    MULTIPLE_ORGANIZATIONS("MULTIPLE_ORGANIZATIONS"),
    MULTIPLE_PROJECTS("MULTIPLE_PROJECTS"),
    INTEGRATED_APPROVALS_WITH_HARNESS_UI("INTEGRATED_APPROVALS_WITH_HARNESS_UI"),
    INTEGRATED_APPROVALS_WITH_JIRA("INTEGRATED_APPROVALS_WITH_JIRA"),
    SECRET_MANAGERS("SECRET_MANAGERS"),
    DEPLOYMENTS("DEPLOYMENTS"),
    INITIAL_DEPLOYMENTS("INITIAL_DEPLOYMENTS"),
    DEPLOYMENTS_PER_MONTH("DEPLOYMENTS_PER_MONTH"),
    SERVICES("SERVICES"),
    BUILDS("BUILDS"),
    SAML_SUPPORT("SAML_SUPPORT"),
    OAUTH_SUPPORT("OAUTH_SUPPORT"),
    LDAP_SUPPORT("LDAP_SUPPORT"),
    TWO_FACTOR_AUTH_SUPPORT("TWO_FACTOR_AUTH_SUPPORT"),
    CUSTOM_ROLES("CUSTOM_ROLES"),
    CUSTOM_RESOURCE_GROUPS("CUSTOM_RESOURCE_GROUPS"),
    MAX_TOTAL_BUILDS("MAX_TOTAL_BUILDS"),
    MAX_BUILDS_PER_MONTH("MAX_BUILDS_PER_MONTH"),
    ACTIVE_COMMITTERS("ACTIVE_COMMITTERS"),
    TEST_INTELLIGENCE("TEST_INTELLIGENCE"),
    TEMPLATE_SERVICE("TEMPLATE_SERVICE"),
    K8S_BG_SWAP_SERVICES("K8S_BG_SWAP_SERVICES"),
    K8S_BLUE_GREEN_DEPLOY("K8S_BLUE_GREEN_DEPLOY"),
    K8S_APPLY("K8S_APPLY"),
    K8S_DELETE("K8S_DELETE"),
    K8S_CANARY_DELETE("K8S_CANARY_DELETE"),
    K8S_ROLLING_DEPLOY("K8S_ROLLING_DEPLOY"),
    K8S_CANARY_DEPLOY("K8S_CANARY_DEPLOY"),
    K8S_SCALE("K8S_SCALE"),
    K8S_ROLLING_ROLLBACK("K8S_ROLLING_ROLLBACK"),
    TERRAFORM_APPLY("TERRAFORM_APPLY"),
    TERRAFORM_PLAN("TERRAFORM_PLAN"),
    TERRAFORM_DESTROY("TERRAFORM_DESTROY"),
    TERRAFORM_ROLLBACK("TERRAFORM_ROLLBACK"),
    INTEGRATED_APPROVALS_WITH_SERVICE_NOW("INTEGRATED_APPROVALS_WITH_SERVICE_NOW"),
    DEVELOPERS("DEVELOPERS"),
    MONTHLY_ACTIVE_USERS("MONTHLY_ACTIVE_USERS");

    private String value;

    FeatureRestrictionNameEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static FeatureRestrictionNameEnum fromValue(String input) {
      for (FeatureRestrictionNameEnum b : FeatureRestrictionNameEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<FeatureRestrictionNameEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FeatureRestrictionNameEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public FeatureRestrictionNameEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return FeatureRestrictionNameEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("featureRestrictionName")
  private FeatureRestrictionNameEnum featureRestrictionName = null;

  public StepData name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StepData type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public StepData disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

   /**
   * Get disabled
   * @return disabled
  **/
  @Schema(description = "")
  public Boolean isDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  public StepData featureRestrictionName(FeatureRestrictionNameEnum featureRestrictionName) {
    this.featureRestrictionName = featureRestrictionName;
    return this;
  }

   /**
   * Get featureRestrictionName
   * @return featureRestrictionName
  **/
  @Schema(description = "")
  public FeatureRestrictionNameEnum getFeatureRestrictionName() {
    return featureRestrictionName;
  }

  public void setFeatureRestrictionName(FeatureRestrictionNameEnum featureRestrictionName) {
    this.featureRestrictionName = featureRestrictionName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StepData stepData = (StepData) o;
    return Objects.equals(this.name, stepData.name) &&
        Objects.equals(this.type, stepData.type) &&
        Objects.equals(this.disabled, stepData.disabled) &&
        Objects.equals(this.featureRestrictionName, stepData.featureRestrictionName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, disabled, featureRestrictionName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StepData {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    featureRestrictionName: ").append(toIndentedString(featureRestrictionName)).append("\n");
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