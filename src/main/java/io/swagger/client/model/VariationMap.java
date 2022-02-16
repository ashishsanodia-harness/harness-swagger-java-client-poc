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
import io.swagger.client.model.TargetMap;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * A mapping of variations to targets and target groups (segments).  The targets listed here should receive this variation.
 */
@Schema(description = "A mapping of variations to targets and target groups (segments).  The targets listed here should receive this variation.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class VariationMap {
  @SerializedName("targetSegments")
  private List<String> targetSegments = null;

  @SerializedName("targets")
  private List<TargetMap> targets = null;

  @SerializedName("variation")
  private String variation = null;

  public VariationMap targetSegments(List<String> targetSegments) {
    this.targetSegments = targetSegments;
    return this;
  }

  public VariationMap addTargetSegmentsItem(String targetSegmentsItem) {
    if (this.targetSegments == null) {
      this.targetSegments = new ArrayList<String>();
    }
    this.targetSegments.add(targetSegmentsItem);
    return this;
  }

   /**
   * A list of target groups (segments)
   * @return targetSegments
  **/
  @Schema(description = "A list of target groups (segments)")
  public List<String> getTargetSegments() {
    return targetSegments;
  }

  public void setTargetSegments(List<String> targetSegments) {
    this.targetSegments = targetSegments;
  }

  public VariationMap targets(List<TargetMap> targets) {
    this.targets = targets;
    return this;
  }

  public VariationMap addTargetsItem(TargetMap targetsItem) {
    if (this.targets == null) {
      this.targets = new ArrayList<TargetMap>();
    }
    this.targets.add(targetsItem);
    return this;
  }

   /**
   * A list of target mappings
   * @return targets
  **/
  @Schema(description = "A list of target mappings")
  public List<TargetMap> getTargets() {
    return targets;
  }

  public void setTargets(List<TargetMap> targets) {
    this.targets = targets;
  }

  public VariationMap variation(String variation) {
    this.variation = variation;
    return this;
  }

   /**
   * The variation identifier
   * @return variation
  **/
  @Schema(example = "off-variation", required = true, description = "The variation identifier")
  public String getVariation() {
    return variation;
  }

  public void setVariation(String variation) {
    this.variation = variation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariationMap variationMap = (VariationMap) o;
    return Objects.equals(this.targetSegments, variationMap.targetSegments) &&
        Objects.equals(this.targets, variationMap.targets) &&
        Objects.equals(this.variation, variationMap.variation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetSegments, targets, variation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariationMap {\n");
    
    sb.append("    targetSegments: ").append(toIndentedString(targetSegments)).append("\n");
    sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
    sb.append("    variation: ").append(toIndentedString(variation)).append("\n");
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
