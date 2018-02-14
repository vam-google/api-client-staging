/*
 * Copyright 2016 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.logging.v2;

import com.google.common.base.Preconditions;
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.api.resourcenames.ResourceNameType;
import java.io.IOException;
import java.util.Map;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@javax.annotation.Generated("by GAPIC protoc plugin")
public class ExclusionName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("projects/{project}/exclusions/{exclusion}");

  private final String project;
  private final String exclusion;

  public String getProject() {
    return project;
  }

  public String getExclusion() {
    return exclusion;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private ExclusionName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    exclusion = Preconditions.checkNotNull(builder.getExclusion());
  }

  public static ExclusionName of(String project, String exclusion) {
    return newBuilder()
      .setProject(project)
      .setExclusion(exclusion)
      .build();
  }

  /**
   * @deprecated Use {@link #of(String, String)} instead.
   */
  @Deprecated
  public static ExclusionName create(String project, String exclusion) {
    return of(project, exclusion);
  }

  public static ExclusionName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "ExclusionName.parse: formattedString not in valid format");
    return of(matchMap.get("project"), matchMap.get("exclusion"));
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  @Override
  public ResourceNameType getType() {
    return ExclusionNameType.instance();
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate("project", project, "exclusion", exclusion);
  }

  /** Builder for ExclusionName. */
  public static class Builder {

    private String project;
    private String exclusion;

    public String getProject() {
      return project;
    }

    public String getExclusion() {
      return exclusion;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setExclusion(String exclusion) {
      this.exclusion = exclusion;
      return this;
    }

    private Builder() {
    }

    private Builder(ExclusionName exclusionName) {
      project = exclusionName.project;
      exclusion = exclusionName.exclusion;
    }

    public ExclusionName build() {
      return new ExclusionName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ExclusionName) {
      ExclusionName that = (ExclusionName) o;
      return (this.project.equals(that.project))
          && (this.exclusion.equals(that.exclusion));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= project.hashCode();
    h *= 1000003;
    h ^= exclusion.hashCode();
    return h;
  }
}

