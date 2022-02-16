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
import io.swagger.client.model.FeatureState;
import io.swagger.client.model.Serve;
import io.swagger.client.model.ServingRule;
import io.swagger.client.model.VariationMap;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * The Feature Flag rules for a given environment
 */
@Schema(description = "The Feature Flag rules for a given environment")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class FeatureEnvProperties {
  @SerializedName("defaultServe")
  private Serve defaultServe = null;

  @SerializedName("environment")
  private String environment = null;

  @SerializedName("modifiedAt")
  private Long modifiedAt = null;

  @SerializedName("offVariation")
  private String offVariation = null;

  @SerializedName("rules")
  private List<ServingRule> rules = null;

  @SerializedName("state")
  private FeatureState state = null;

  @SerializedName("variationMap")
  private List<VariationMap> variationMap = null;

  @SerializedName("version")
  private Long version = null;

  public FeatureEnvProperties defaultServe(Serve defaultServe) {
    this.defaultServe = defaultServe;
    return this;
  }

   /**
   * Get defaultServe
   * @return defaultServe
  **/
  @Schema(required = true, description = "")
  public Serve getDefaultServe() {
    return defaultServe;
  }

  public void setDefaultServe(Serve defaultServe) {
    this.defaultServe = defaultServe;
  }

  public FeatureEnvProperties environment(String environment) {
    this.environment = environment;
    return this;
  }

   /**
   * The environment identifier
   * @return environment
  **/
  @Schema(required = true, description = "The environment identifier")
  public String getEnvironment() {
    return environment;
  }

  public void setEnvironment(String environment) {
    this.environment = environment;
  }

  public FeatureEnvProperties modifiedAt(Long modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

   /**
   * The last time the flag was modified in this environment
   * @return modifiedAt
  **/
  @Schema(required = true, description = "The last time the flag was modified in this environment")
  public Long getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(Long modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public FeatureEnvProperties offVariation(String offVariation) {
    this.offVariation = offVariation;
    return this;
  }

   /**
   * The variation to serve for this flag in this environment when the flag is off
   * @return offVariation
  **/
  @Schema(required = true, description = "The variation to serve for this flag in this environment when the flag is off")
  public String getOffVariation() {
    return offVariation;
  }

  public void setOffVariation(String offVariation) {
    this.offVariation = offVariation;
  }

  public FeatureEnvProperties rules(List<ServingRule> rules) {
    this.rules = rules;
    return this;
  }

  public FeatureEnvProperties addRulesItem(ServingRule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<ServingRule>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * A list of rules to use when evaluating this flag in this environment
   * @return rules
  **/
  @Schema(description = "A list of rules to use when evaluating this flag in this environment")
  public List<ServingRule> getRules() {
    return rules;
  }

  public void setRules(List<ServingRule> rules) {
    this.rules = rules;
  }

  public FeatureEnvProperties state(FeatureState state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @Schema(required = true, description = "")
  public FeatureState getState() {
    return state;
  }

  public void setState(FeatureState state) {
    this.state = state;
  }

  public FeatureEnvProperties variationMap(List<VariationMap> variationMap) {
    this.variationMap = variationMap;
    return this;
  }

  public FeatureEnvProperties addVariationMapItem(VariationMap variationMapItem) {
    if (this.variationMap == null) {
      this.variationMap = new ArrayList<VariationMap>();
    }
    this.variationMap.add(variationMapItem);
    return this;
  }

   /**
   * A list of the variations that will be served to specific targets or target groups in an environment.
   * @return variationMap
  **/
  @Schema(description = "A list of the variations that will be served to specific targets or target groups in an environment.")
  public List<VariationMap> getVariationMap() {
    return variationMap;
  }

  public void setVariationMap(List<VariationMap> variationMap) {
    this.variationMap = variationMap;
  }

  public FeatureEnvProperties version(Long version) {
    this.version = version;
    return this;
  }

   /**
   * The version of the flag.  This is incremented each time it is changed
   * @return version
  **/
  @Schema(description = "The version of the flag.  This is incremented each time it is changed")
  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureEnvProperties featureEnvProperties = (FeatureEnvProperties) o;
    return Objects.equals(this.defaultServe, featureEnvProperties.defaultServe) &&
        Objects.equals(this.environment, featureEnvProperties.environment) &&
        Objects.equals(this.modifiedAt, featureEnvProperties.modifiedAt) &&
        Objects.equals(this.offVariation, featureEnvProperties.offVariation) &&
        Objects.equals(this.rules, featureEnvProperties.rules) &&
        Objects.equals(this.state, featureEnvProperties.state) &&
        Objects.equals(this.variationMap, featureEnvProperties.variationMap) &&
        Objects.equals(this.version, featureEnvProperties.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultServe, environment, modifiedAt, offVariation, rules, state, variationMap, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureEnvProperties {\n");
    
    sb.append("    defaultServe: ").append(toIndentedString(defaultServe)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    offVariation: ").append(toIndentedString(offVariation)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    variationMap: ").append(toIndentedString(variationMap)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
