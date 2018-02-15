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

package com.google.cloud.oslogin.v1;

import com.google.common.base.Preconditions;
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.api.resourcenames.ResourceNameType;
import java.io.IOException;
import java.util.Map;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@javax.annotation.Generated("by GAPIC protoc plugin")
public class UserName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("users/{user}");

  private final String user;

  public String getUser() {
    return user;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private UserName(Builder builder) {
    user = Preconditions.checkNotNull(builder.getUser());
  }

  public static UserName of(String user) {
    return newBuilder()
      .setUser(user)
      .build();
  }

  /**
   * @deprecated Use {@link #of(String)} instead.
   */
  @Deprecated
  public static UserName create(String user) {
    return of(user);
  }

  public static UserName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "UserName.parse: formattedString not in valid format");
    return of(matchMap.get("user"));
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  @Override
  public ResourceNameType getType() {
    return UserNameType.instance();
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate("user", user);
  }

  /** Builder for UserName. */
  public static class Builder {

    private String user;

    public String getUser() {
      return user;
    }

    public Builder setUser(String user) {
      this.user = user;
      return this;
    }

    private Builder() {
    }

    private Builder(UserName userName) {
      user = userName.user;
    }

    public UserName build() {
      return new UserName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof UserName) {
      UserName that = (UserName) o;
      return (this.user.equals(that.user));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= user.hashCode();
    return h;
  }
}

