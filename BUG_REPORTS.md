# Bug Reports - WireMock Test Coverage Analysis

## Bug Report #1: SingleHeaderAuthenticator Always Checks Authorization Header

**Severity:** Medium  
**Component:** `com.github.tomakehurst.wiremock.security.SingleHeaderAuthenticator`  
**File:** `wiremock-common/src/main/java/com/github/tomakehurst/wiremock/security/SingleHeaderAuthenticator.java`

### Description
The `SingleHeaderAuthenticator` implementation has a bug where it always checks for the presence of the "Authorization" header, regardless of what header key was configured during construction.

### Current Code (Line 42)
```java
return request.containsHeader(AUTHORIZATION) && headerValues.contains(value);
```

### Expected Behavior
The authenticator should check for the presence of the configured header key, not always "Authorization".

### Proposed Fix
```java
return request.containsHeader(key) && headerValues.contains(value);
```

### Impact
- `TokenAuthenticator` is also affected since it extends `SingleHeaderAuthenticator`
- Custom header authentication scenarios fail when using non-Authorization headers
- Tests reveal this inconsistency in expected vs actual behavior

---

## Bug Report #2: ExtensionLoader Exception Handling Inconsistency

**Severity:** Low  
**Component:** `com.github.tomakehurst.wiremock.extension.ExtensionLoader`  
**File:** `wiremock-common/src/main/java/com/github/tomakehurst/wiremock/extension/ExtensionLoader.java`

### Description
The `throwUnchecked` utility method used in ExtensionLoader doesn't consistently wrap exceptions as `RuntimeException`, causing test expectations to fail.

### Current Behavior
- `ClassNotFoundException` and `NoSuchMethodException` are thrown directly
- Tests expect `RuntimeException` wrapping

### Impact
- Inconsistent exception handling in extension loading
- Test expectations don't match actual behavior

---

## Bug Report #3: ServeEvent JSON Serialization with Null ResponseDefinition

**Severity:** Medium  
**Component:** `com.github.tomakehurst.wiremock.stubbing.ServeEvent`

### Description
When serializing `ServeEvent` objects to JSON, a `NullPointerException` occurs when trying to access `responseDefinition.wasConfigured()` because `responseDefinition` is null.

### Error Stack Trace
```
java.lang.NullPointerException: Cannot invoke "com.github.tomakehurst.wiremock.http.ResponseDefinition.wasConfigured()" because "this.responseDefinition" is null
    at com.github.tomakehurst.wiremock.stubbing.ServeEvent.getWasMatched(ServeEvent.java:182)
```

### Impact
- JSON serialization fails for ServeEvent objects created without proper ResponseDefinition initialization
- Affects FindServeEventsResult serialization tests

---

## Bug Report #4: VerificationResult JSON Property Name Mismatch

**Severity:** Low  
**Component:** `com.github.tomakehurst.wiremock.verification.VerificationResult`

### Description
The JSON serialization test expects certain property names in the JSON output that may not match the actual serialized format.

### Impact
- JSON serialization tests fail due to property name expectations
- May indicate inconsistency in JSON API contract

