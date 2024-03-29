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
import io.swagger.client.model.SecretSpec;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * This is details of the secret entity defined in Harness.
 */
@Schema(description = "This is details of the secret entity defined in Harness.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class Secret {
  /**
   * This specifies the type of secret
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    SECRETFILE("SecretFile"),
    SECRETTEXT("SecretText"),
    SSHKEY("SSHKey");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TypeEnum fromValue(String input) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("identifier")
  private String identifier = null;

  @SerializedName("orgIdentifier")
  private String orgIdentifier = null;

  @SerializedName("projectIdentifier")
  private String projectIdentifier = null;

  @SerializedName("tags")
  private Map<String, String> tags = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("spec")
  private SecretSpec spec = null;

  public Secret type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * This specifies the type of secret
   * @return type
  **/
  @Schema(required = true, description = "This specifies the type of secret")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Secret name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the Secret
   * @return name
  **/
  @Schema(required = true, description = "Name of the Secret")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Secret identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * Identifier of the Secret
   * @return identifier
  **/
  @Schema(required = true, description = "Identifier of the Secret")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public Secret orgIdentifier(String orgIdentifier) {
    this.orgIdentifier = orgIdentifier;
    return this;
  }

   /**
   * Organization Identifier for the Entity
   * @return orgIdentifier
  **/
  @Schema(description = "Organization Identifier for the Entity")
  public String getOrgIdentifier() {
    return orgIdentifier;
  }

  public void setOrgIdentifier(String orgIdentifier) {
    this.orgIdentifier = orgIdentifier;
  }

  public Secret projectIdentifier(String projectIdentifier) {
    this.projectIdentifier = projectIdentifier;
    return this;
  }

   /**
   * Project Identifier for the Entity
   * @return projectIdentifier
  **/
  @Schema(description = "Project Identifier for the Entity")
  public String getProjectIdentifier() {
    return projectIdentifier;
  }

  public void setProjectIdentifier(String projectIdentifier) {
    this.projectIdentifier = projectIdentifier;
  }

  public Secret tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public Secret putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<String, String>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

   /**
   * Tags
   * @return tags
  **/
  @Schema(description = "Tags")
  public Map<String, String> getTags() {
    return tags;
  }

  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }

  public Secret description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the Secret
   * @return description
  **/
  @Schema(description = "Description of the Secret")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Secret spec(SecretSpec spec) {
    this.spec = spec;
    return this;
  }

   /**
   * Get spec
   * @return spec
  **/
  @Schema(required = true, description = "")
  public SecretSpec getSpec() {
    return spec;
  }

  public void setSpec(SecretSpec spec) {
    this.spec = spec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Secret secret = (Secret) o;
    return Objects.equals(this.type, secret.type) &&
        Objects.equals(this.name, secret.name) &&
        Objects.equals(this.identifier, secret.identifier) &&
        Objects.equals(this.orgIdentifier, secret.orgIdentifier) &&
        Objects.equals(this.projectIdentifier, secret.projectIdentifier) &&
        Objects.equals(this.tags, secret.tags) &&
        Objects.equals(this.description, secret.description) &&
        Objects.equals(this.spec, secret.spec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, identifier, orgIdentifier, projectIdentifier, tags, description, spec);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Secret {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    orgIdentifier: ").append(toIndentedString(orgIdentifier)).append("\n");
    sb.append("    projectIdentifier: ").append(toIndentedString(projectIdentifier)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
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
