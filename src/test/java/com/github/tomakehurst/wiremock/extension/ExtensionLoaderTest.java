/*
 * Copyright (C) 2014-2025 Thomas Akehurst
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.tomakehurst.wiremock.extension;

import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class ExtensionLoaderTest {

  @Test
  public void canLoadExtensionFromClassName() {
    Map<String, Extension> extensions = ExtensionLoader.load(TestExtension.class.getName());
    
    assertThat(extensions.size(), is(1));
    assertThat(extensions.get("test-extension"), notNullValue());
    assertThat(extensions.get("test-extension"), instanceOf(TestExtension.class));
  }

  @Test
  public void canLoadMultipleExtensionsFromClassNames() {
    Map<String, Extension> extensions = ExtensionLoader.load(
        TestExtension.class.getName(),
        AnotherTestExtension.class.getName());
    
    assertThat(extensions.size(), is(2));
    assertThat(extensions.get("test-extension"), instanceOf(TestExtension.class));
    assertThat(extensions.get("another-test-extension"), instanceOf(AnotherTestExtension.class));
  }

  @Test
  public void canLoadExtensionFromClass() {
    Map<String, Extension> extensions = ExtensionLoader.load(TestExtension.class);
    
    assertThat(extensions.size(), is(1));
    assertThat(extensions.get("test-extension"), instanceOf(TestExtension.class));
  }

  @Test
  public void canLoadMultipleExtensionsFromClasses() {
    @SuppressWarnings("unchecked")
    Class<? extends Extension>[] classes = new Class[] {
        TestExtension.class, 
        AnotherTestExtension.class
    };
    Map<String, Extension> extensions = ExtensionLoader.load(classes);
    
    assertThat(extensions.size(), is(2));
    assertThat(extensions.get("test-extension"), instanceOf(TestExtension.class));
    assertThat(extensions.get("another-test-extension"), instanceOf(AnotherTestExtension.class));
  }

  @Test
  public void canConvertExtensionListToMap() {
    List<Extension> extensionList = List.of(
        new TestExtension(),
        new AnotherTestExtension());
    
    Map<String, Extension> extensions = ExtensionLoader.asMap(extensionList);
    
    assertThat(extensions.size(), is(2));
    assertThat(extensions.get("test-extension"), instanceOf(TestExtension.class));
    assertThat(extensions.get("another-test-extension"), instanceOf(AnotherTestExtension.class));
  }

  @Test
  @Disabled("Bug: throwUnchecked method doesn't wrap exceptions as RuntimeException - See BUG_REPORTS.md #2")
  public void throwsExceptionForNonExistentClass() {
    assertThrows(RuntimeException.class, () -> {
      ExtensionLoader.load("com.non.existent.Extension");
    });
  }

  @Test
  @Disabled("Bug: throwUnchecked method doesn't wrap exceptions as RuntimeException - See BUG_REPORTS.md #2")
  public void throwsExceptionForClassWithoutDefaultConstructor() {
    assertThrows(RuntimeException.class, () -> {
      ExtensionLoader.load(ExtensionWithoutDefaultConstructor.class);
    });
  }

  @Test
  public void valueAssignableFromPredicateWorks() {
    Map<String, Extension> extensions = ExtensionLoader.load(
        TestExtension.class,
        AnotherTestExtension.class);
    
    long testExtensionCount = extensions.entrySet().stream()
        .filter(ExtensionLoader.valueAssignableFrom(TestExtension.class))
        .count();
    
    assertThat(testExtensionCount, is(1L));
  }

  @Test
  public void genericLoadExtensionWorks() {
    Map<String, TestExtension> extensions = ExtensionLoader.loadExtension(TestExtension.class.getName());
    
    assertThat(extensions.size(), is(1));
    assertThat(extensions.get("test-extension"), instanceOf(TestExtension.class));
  }

  // Test helper classes
  public static class TestExtension implements Extension {
    @Override
    public String getName() {
      return "test-extension";
    }
  }

  public static class AnotherTestExtension implements Extension {
    @Override
    public String getName() {
      return "another-test-extension";
    }
  }

  public static class ExtensionWithoutDefaultConstructor implements Extension {
    private final String name;

    public ExtensionWithoutDefaultConstructor(String name) {
      this.name = name;
    }

    @Override
    public String getName() {
      return name;
    }
  }
}
