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
import io.swagger.client.model.Clause;
import io.swagger.client.model.Tag;
import io.swagger.client.model.Target;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * A Target Group (Segment) response
 */
@Schema(description = "A Target Group (Segment) response")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class Segment {
  @SerializedName("createdAt")
  private Long createdAt = null;

  @SerializedName("environment")
  private String environment = null;

  @SerializedName("excluded")
  private List<Target> excluded = null;

  @SerializedName("identifier")
  private String identifier = null;

  @SerializedName("included")
  private List<Target> included = null;

  @SerializedName("modifiedAt")
  private Long modifiedAt = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("rules")
  private List<Clause> rules = null;

  @SerializedName("tags")
  private List<Tag> tags = null;

  @SerializedName("version")
  private Long version = null;

  public Segment createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The data and time in milliseconds when the group was created
   * @return createdAt
  **/
  @Schema(description = "The data and time in milliseconds when the group was created")
  public Long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  public Segment environment(String environment) {
    this.environment = environment;
    return this;
  }

   /**
   * The environment this target group belongs to
   * @return environment
  **/
  @Schema(example = "Production", description = "The environment this target group belongs to")
  public String getEnvironment() {
    return environment;
  }

  public void setEnvironment(String environment) {
    this.environment = environment;
  }

  public Segment excluded(List<Target> excluded) {
    this.excluded = excluded;
    return this;
  }

  public Segment addExcludedItem(Target excludedItem) {
    if (this.excluded == null) {
      this.excluded = new ArrayList<Target>();
    }
    this.excluded.add(excludedItem);
    return this;
  }

   /**
   * A list of Targets who are excluded from this target group
   * @return excluded
  **/
  @Schema(description = "A list of Targets who are excluded from this target group")
  public List<Target> getExcluded() {
    return excluded;
  }

  public void setExcluded(List<Target> excluded) {
    this.excluded = excluded;
  }

  public Segment identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * Unique identifier for the target group.
   * @return identifier
  **/
  @Schema(required = true, description = "Unique identifier for the target group.")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public Segment included(List<Target> included) {
    this.included = included;
    return this;
  }

  public Segment addIncludedItem(Target includedItem) {
    if (this.included == null) {
      this.included = new ArrayList<Target>();
    }
    this.included.add(includedItem);
    return this;
  }

   /**
   * A list of Targets who belong to this target group
   * @return included
  **/
  @Schema(description = "A list of Targets who belong to this target group")
  public List<Target> getIncluded() {
    return included;
  }

  public void setIncluded(List<Target> included) {
    this.included = included;
  }

  public Segment modifiedAt(Long modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

   /**
   * The data and time in milliseconds when the group was last modified
   * @return modifiedAt
  **/
  @Schema(description = "The data and time in milliseconds when the group was last modified")
  public Long getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(Long modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public Segment name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the target group.
   * @return name
  **/
  @Schema(example = "Beta Testers", required = true, description = "Name of the target group.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Segment rules(List<Clause> rules) {
    this.rules = rules;
    return this;
  }

  public Segment addRulesItem(Clause rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<Clause>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * An array of rules that can cause a user to be included in this segment.
   * @return rules
  **/
  @Schema(description = "An array of rules that can cause a user to be included in this segment.")
  public List<Clause> getRules() {
    return rules;
  }

  public void setRules(List<Clause> rules) {
    this.rules = rules;
  }

  public Segment tags(List<Tag> tags) {
    this.tags = tags;
    return this;
  }

  public Segment addTagsItem(Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<Tag>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Tags for this target group
   * @return tags
  **/
  @Schema(description = "Tags for this target group")
  public List<Tag> getTags() {
    return tags;
  }

  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }

  public Segment version(Long version) {
    this.version = version;
    return this;
  }

   /**
   * The version of this group.  Each time it is modified the version is incremented
   * @return version
  **/
  @Schema(example = "1", description = "The version of this group.  Each time it is modified the version is incremented")
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
    Segment segment = (Segment) o;
    return Objects.equals(this.createdAt, segment.createdAt) &&
        Objects.equals(this.environment, segment.environment) &&
        Objects.equals(this.excluded, segment.excluded) &&
        Objects.equals(this.identifier, segment.identifier) &&
        Objects.equals(this.included, segment.included) &&
        Objects.equals(this.modifiedAt, segment.modifiedAt) &&
        Objects.equals(this.name, segment.name) &&
        Objects.equals(this.rules, segment.rules) &&
        Objects.equals(this.tags, segment.tags) &&
        Objects.equals(this.version, segment.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, environment, excluded, identifier, included, modifiedAt, name, rules, tags, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Segment {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    excluded: ").append(toIndentedString(excluded)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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