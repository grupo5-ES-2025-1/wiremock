import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        com.github.tomakehurst.wiremock.matching.RequestPatternBuilder requestPatternBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.tomakehurst.wiremock.client.WireMock.verify(requestPatternBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.github.tomakehurst.wiremock.matching.RequestPatternBuilder.build()\" because \"requestPatternBuilder\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.github.tomakehurst.wiremock.common.DataTruncationSettings dataTruncationSettings1 = com.github.tomakehurst.wiremock.common.DataTruncationSettings.NO_TRUNCATION;
        com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder responseDefinitionBuilder6 = com.github.tomakehurst.wiremock.client.WireMock.okTextXml("hi!");
        com.github.tomakehurst.wiremock.recording.RecordSpecBuilder recordSpecBuilder10 = new com.github.tomakehurst.wiremock.recording.RecordSpecBuilder();
        java.lang.Object[] objArray12 = new java.lang.Object[] { 0.0f, dataTruncationSettings1, 100, (byte) 0, 100.0f, responseDefinitionBuilder6, (byte) 1, 0L, 1.0d, recordSpecBuilder10, '#' };
        java.util.ArrayList<java.lang.Object> objList13 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList13, objArray12);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator15 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList13.replaceAll(objUnaryOperator15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataTruncationSettings1);
        org.junit.Assert.assertNotNull(responseDefinitionBuilder6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.github.tomakehurst.wiremock.matching.AfterDateTimePattern afterDateTimePattern1 = com.github.tomakehurst.wiremock.client.WireMock.after("");
        org.junit.Assert.assertNotNull(afterDateTimePattern1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.github.tomakehurst.wiremock.security.BasicAuthenticator basicAuthenticator2 = new com.github.tomakehurst.wiremock.security.BasicAuthenticator("hi!", "");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.time.LocalDateTime localDateTime0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.tomakehurst.wiremock.matching.EqualToDateTimePattern equalToDateTimePattern1 = new com.github.tomakehurst.wiremock.matching.EqualToDateTimePattern(localDateTime0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.toString()\" because \"localDateTime\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.github.tomakehurst.wiremock.stubbing.StubImport.Options.DuplicatePolicy duplicatePolicy0 = com.github.tomakehurst.wiremock.stubbing.StubImport.Options.DuplicatePolicy.OVERWRITE;
        org.junit.Assert.assertTrue("'" + duplicatePolicy0 + "' != '" + com.github.tomakehurst.wiremock.stubbing.StubImport.Options.DuplicatePolicy.OVERWRITE + "'", duplicatePolicy0.equals(com.github.tomakehurst.wiremock.stubbing.StubImport.Options.DuplicatePolicy.OVERWRITE));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.github.tomakehurst.wiremock.extension.responsetemplating.SystemKeyAuthoriser systemKeyAuthoriser0 = null;
        com.github.tomakehurst.wiremock.extension.responsetemplating.helpers.SystemValueHelper systemValueHelper1 = new com.github.tomakehurst.wiremock.extension.responsetemplating.helpers.SystemValueHelper(systemKeyAuthoriser0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.github.tomakehurst.wiremock.extension.responsetemplating.helpers.ArrayAddHelper arrayAddHelper0 = new com.github.tomakehurst.wiremock.extension.responsetemplating.helpers.ArrayAddHelper();
        com.github.tomakehurst.wiremock.store.StoreEvent<com.github.tomakehurst.wiremock.extension.responsetemplating.helpers.AbstractArrayHelper, java.lang.Object> abstractArrayHelperStoreEvent3 = com.github.tomakehurst.wiremock.store.StoreEvent.set((com.github.tomakehurst.wiremock.extension.responsetemplating.helpers.AbstractArrayHelper) arrayAddHelper0, (java.lang.Object) 10, (java.lang.Object) (short) -1);
        org.junit.Assert.assertNotNull(abstractArrayHelperStoreEvent3);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        // The following exception was thrown during execution in test generation
        try {
            com.github.tomakehurst.wiremock.WireMockServer wireMockServer1 = new com.github.tomakehurst.wiremock.WireMockServer((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: resource keystore not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.github.tomakehurst.wiremock.admin.StartRecordingTask startRecordingTask0 = new com.github.tomakehurst.wiremock.admin.StartRecordingTask();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.github.tomakehurst.wiremock.http.ssl.SSLContextBuilder sSLContextBuilder0 = new com.github.tomakehurst.wiremock.http.ssl.SSLContextBuilder();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.lang.String str0 = com.github.tomakehurst.wiremock.common.ContentTypes.LOCATION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Location" + "'", str0, "Location");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder responseDefinitionBuilder0 = com.github.tomakehurst.wiremock.client.WireMock.created();
        org.junit.Assert.assertNotNull(responseDefinitionBuilder0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.lang.String str1 = com.github.tomakehurst.wiremock.common.Strings.randomAlphanumeric((int) (byte) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H9W4Mw3mHK" + "'", str1, "H9W4Mw3mHK");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.github.tomakehurst.wiremock.security.NoAuthenticator noAuthenticator0 = new com.github.tomakehurst.wiremock.security.NoAuthenticator();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.github.tomakehurst.wiremock.http.Response response0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.tomakehurst.wiremock.http.Response.Builder builder1 = com.github.tomakehurst.wiremock.http.Response.Builder.like(response0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.github.tomakehurst.wiremock.http.Response.getStatus()\" because \"response\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.github.tomakehurst.wiremock.stubbing.StubMappings stubMappings0 = null;
        com.github.tomakehurst.wiremock.verification.RequestJournal requestJournal1 = null;
        com.github.tomakehurst.wiremock.stubbing.Scenarios scenarios2 = null;
        com.github.tomakehurst.wiremock.verification.NearMissCalculator nearMissCalculator3 = new com.github.tomakehurst.wiremock.verification.NearMissCalculator(stubMappings0, requestJournal1, scenarios2);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        // The following exception was thrown during execution in test generation
        try {
            org.w3c.dom.Document document1 = com.github.tomakehurst.wiremock.common.xml.Xml.read("hi!");
            org.junit.Assert.fail("Expected exception of type com.github.tomakehurst.wiremock.common.xml.XmlException; message: {?  \"errors\" : [ {?    \"code\" : 50,?    \"title\" : \"O conteu?do na?o e? permitido no pro?logo.\",?    \"detail\" : \"O conteu?do na?o e? permitido no pro?logo.; line 1; column 1\"?  } ]?}");
        } catch (com.github.tomakehurst.wiremock.common.xml.XmlException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.github.tomakehurst.wiremock.store.Stores stores0 = null;
        com.github.tomakehurst.wiremock.admin.tasks.EditStubFileTask editStubFileTask1 = new com.github.tomakehurst.wiremock.admin.tasks.EditStubFileTask(stores0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.lang.String str0 = com.github.tomakehurst.wiremock.extension.responsetemplating.helpers.HandlebarsHelper.ERROR_SUFFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "]" + "'", str0, "]");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder responseDefinitionBuilder0 = new com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.github.tomakehurst.wiremock.http.RequestMethod requestMethod0 = com.github.tomakehurst.wiremock.http.RequestMethod.PUT;
        org.junit.Assert.assertNotNull(requestMethod0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        byte[] byteArray1 = com.github.tomakehurst.wiremock.common.Strings.bytesFromString("and");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[97, 110, 100]");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.github.tomakehurst.wiremock.matching.XPathPatternJsonSerializer xPathPatternJsonSerializer0 = new com.github.tomakehurst.wiremock.matching.XPathPatternJsonSerializer();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.github.tomakehurst.wiremock.common.DateTimeParser dateTimeParser1 = com.github.tomakehurst.wiremock.common.DateTimeParser.forFormat("H9W4Mw3mHK");
        org.junit.Assert.assertNotNull(dateTimeParser1);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.github.tomakehurst.wiremock.core.StubServer stubServer0 = null;
        com.github.tomakehurst.wiremock.http.ResponseRenderer responseRenderer1 = null;
        com.github.tomakehurst.wiremock.core.Admin admin2 = null;
        java.util.Map<java.lang.String, com.github.tomakehurst.wiremock.extension.PostServeAction> strMap3 = null;
        java.util.Map<java.lang.String, com.github.tomakehurst.wiremock.extension.ServeEventListener> strMap4 = null;
        com.github.tomakehurst.wiremock.verification.RequestJournal requestJournal5 = null;
        com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter[] requestFilterArray6 = new com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter[] {};
        java.util.ArrayList<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter> requestFilterList7 = new java.util.ArrayList<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter>) requestFilterList7, requestFilterArray6);
        com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilterV2[] requestFilterV2Array9 = new com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilterV2[] {};
        java.util.ArrayList<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilterV2> requestFilterV2List10 = new java.util.ArrayList<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilterV2>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilterV2>) requestFilterV2List10, requestFilterV2Array9);
        com.github.tomakehurst.wiremock.common.DataTruncationSettings dataTruncationSettings13 = com.github.tomakehurst.wiremock.common.DataTruncationSettings.NO_TRUNCATION;
        com.github.tomakehurst.wiremock.verification.notmatched.NotMatchedRenderer notMatchedRenderer14 = null;
        com.github.tomakehurst.wiremock.http.StubRequestHandler stubRequestHandler15 = new com.github.tomakehurst.wiremock.http.StubRequestHandler(stubServer0, responseRenderer1, admin2, strMap3, strMap4, requestJournal5, (java.util.List<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter>) requestFilterList7, (java.util.List<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilterV2>) requestFilterV2List10, false, dataTruncationSettings13, notMatchedRenderer14);
        java.util.Iterator<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter> requestFilterItor16 = requestFilterList7.iterator();
        com.github.tomakehurst.wiremock.core.StubServer stubServer17 = null;
        com.github.tomakehurst.wiremock.http.ResponseRenderer responseRenderer18 = null;
        com.github.tomakehurst.wiremock.core.Admin admin19 = null;
        java.util.Map<java.lang.String, com.github.tomakehurst.wiremock.extension.PostServeAction> strMap20 = null;
        java.util.Map<java.lang.String, com.github.tomakehurst.wiremock.extension.ServeEventListener> strMap21 = null;
        com.github.tomakehurst.wiremock.verification.RequestJournal requestJournal22 = null;
        com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter[] requestFilterArray23 = new com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter[] {};
        java.util.ArrayList<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter> requestFilterList24 = new java.util.ArrayList<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter>) requestFilterList24, requestFilterArray23);
        com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilterV2[] requestFilterV2Array26 = new com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilterV2[] {};
        java.util.ArrayList<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilterV2> requestFilterV2List27 = new java.util.ArrayList<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilterV2>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilterV2>) requestFilterV2List27, requestFilterV2Array26);
        com.github.tomakehurst.wiremock.common.DataTruncationSettings dataTruncationSettings30 = com.github.tomakehurst.wiremock.common.DataTruncationSettings.NO_TRUNCATION;
        com.github.tomakehurst.wiremock.verification.notmatched.NotMatchedRenderer notMatchedRenderer31 = null;
        com.github.tomakehurst.wiremock.http.StubRequestHandler stubRequestHandler32 = new com.github.tomakehurst.wiremock.http.StubRequestHandler(stubServer17, responseRenderer18, admin19, strMap20, strMap21, requestJournal22, (java.util.List<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter>) requestFilterList24, (java.util.List<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilterV2>) requestFilterV2List27, false, dataTruncationSettings30, notMatchedRenderer31);
        com.github.tomakehurst.wiremock.core.StubServer stubServer33 = null;
        com.github.tomakehurst.wiremock.http.ResponseRenderer responseRenderer34 = null;
        com.github.tomakehurst.wiremock.core.Admin admin35 = null;
        java.util.Map<java.lang.String, com.github.tomakehurst.wiremock.extension.PostServeAction> strMap36 = null;
        java.util.Map<java.lang.String, com.github.tomakehurst.wiremock.extension.ServeEventListener> strMap37 = null;
        com.github.tomakehurst.wiremock.verification.RequestJournal requestJournal38 = null;
        com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter[] requestFilterArray39 = new com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter[] {};
        java.util.ArrayList<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter> requestFilterList40 = new java.util.ArrayList<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter>) requestFilterList40, requestFilterArray39);
        com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilterV2[] requestFilterV2Array42 = new com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilterV2[] {};
        java.util.ArrayList<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilterV2> requestFilterV2List43 = new java.util.ArrayList<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilterV2>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilterV2>) requestFilterV2List43, requestFilterV2Array42);
        com.github.tomakehurst.wiremock.common.DataTruncationSettings dataTruncationSettings46 = com.github.tomakehurst.wiremock.common.DataTruncationSettings.NO_TRUNCATION;
        com.github.tomakehurst.wiremock.verification.notmatched.NotMatchedRenderer notMatchedRenderer47 = null;
        com.github.tomakehurst.wiremock.http.StubRequestHandler stubRequestHandler48 = new com.github.tomakehurst.wiremock.http.StubRequestHandler(stubServer33, responseRenderer34, admin35, strMap36, strMap37, requestJournal38, (java.util.List<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter>) requestFilterList40, (java.util.List<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilterV2>) requestFilterV2List43, false, dataTruncationSettings46, notMatchedRenderer47);
        com.github.tomakehurst.wiremock.core.StubServer stubServer49 = null;
        com.github.tomakehurst.wiremock.http.ResponseRenderer responseRenderer50 = null;
        com.github.tomakehurst.wiremock.core.Admin admin51 = null;
        java.util.Map<java.lang.String, com.github.tomakehurst.wiremock.extension.PostServeAction> strMap52 = null;
        java.util.Map<java.lang.String, com.github.tomakehurst.wiremock.extension.ServeEventListener> strMap53 = null;
        com.github.tomakehurst.wiremock.verification.RequestJournal requestJournal54 = null;
        com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter[] requestFilterArray55 = new com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter[] {};
        java.util.ArrayList<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter> requestFilterList56 = new java.util.ArrayList<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter>) requestFilterList56, requestFilterArray55);
        com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilterV2[] requestFilterV2Array58 = new com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilterV2[] {};
        java.util.ArrayList<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilterV2> requestFilterV2List59 = new java.util.ArrayList<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilterV2>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilterV2>) requestFilterV2List59, requestFilterV2Array58);
        com.github.tomakehurst.wiremock.common.DataTruncationSettings dataTruncationSettings62 = com.github.tomakehurst.wiremock.common.DataTruncationSettings.NO_TRUNCATION;
        com.github.tomakehurst.wiremock.verification.notmatched.NotMatchedRenderer notMatchedRenderer63 = null;
        com.github.tomakehurst.wiremock.http.StubRequestHandler stubRequestHandler64 = new com.github.tomakehurst.wiremock.http.StubRequestHandler(stubServer49, responseRenderer50, admin51, strMap52, strMap53, requestJournal54, (java.util.List<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter>) requestFilterList56, (java.util.List<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilterV2>) requestFilterV2List59, false, dataTruncationSettings62, notMatchedRenderer63);
        com.github.tomakehurst.wiremock.http.AbstractRequestHandler[] abstractRequestHandlerArray65 = new com.github.tomakehurst.wiremock.http.AbstractRequestHandler[] { stubRequestHandler32, stubRequestHandler48, stubRequestHandler64 };
        com.github.tomakehurst.wiremock.http.AbstractRequestHandler[] abstractRequestHandlerArray66 = requestFilterList7.toArray(abstractRequestHandlerArray65);
        org.junit.Assert.assertNotNull(requestFilterArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(requestFilterV2Array9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dataTruncationSettings13);
        org.junit.Assert.assertNotNull(requestFilterItor16);
        org.junit.Assert.assertNotNull(requestFilterArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(requestFilterV2Array26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dataTruncationSettings30);
        org.junit.Assert.assertNotNull(requestFilterArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(requestFilterV2Array42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(dataTruncationSettings46);
        org.junit.Assert.assertNotNull(requestFilterArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(requestFilterV2Array58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(dataTruncationSettings62);
        org.junit.Assert.assertNotNull(abstractRequestHandlerArray65);
        org.junit.Assert.assertNotNull(abstractRequestHandlerArray66);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.github.tomakehurst.wiremock.http.trafficlistener.CollectingNetworkTrafficListener collectingNetworkTrafficListener0 = new com.github.tomakehurst.wiremock.http.trafficlistener.CollectingNetworkTrafficListener();
        java.lang.String str1 = collectingNetworkTrafficListener0.getAllRequests();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.github.tomakehurst.wiremock.core.StubServer stubServer0 = null;
        com.github.tomakehurst.wiremock.http.ResponseRenderer responseRenderer1 = null;
        com.github.tomakehurst.wiremock.core.Admin admin2 = null;
        java.util.Map<java.lang.String, com.github.tomakehurst.wiremock.extension.PostServeAction> strMap3 = null;
        java.util.Map<java.lang.String, com.github.tomakehurst.wiremock.extension.ServeEventListener> strMap4 = null;
        com.github.tomakehurst.wiremock.verification.RequestJournal requestJournal5 = null;
        com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter[] requestFilterArray6 = new com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter[] {};
        java.util.ArrayList<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter> requestFilterList7 = new java.util.ArrayList<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter>) requestFilterList7, requestFilterArray6);
        java.util.List<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilterV2> requestFilterV2List9 = null;
        com.github.tomakehurst.wiremock.common.DataTruncationSettings dataTruncationSettings11 = null;
        com.github.tomakehurst.wiremock.verification.notmatched.NotMatchedRenderer notMatchedRenderer12 = null;
        com.github.tomakehurst.wiremock.http.StubRequestHandler stubRequestHandler13 = new com.github.tomakehurst.wiremock.http.StubRequestHandler(stubServer0, responseRenderer1, admin2, strMap3, strMap4, requestJournal5, (java.util.List<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter>) requestFilterList7, requestFilterV2List9, true, dataTruncationSettings11, notMatchedRenderer12);
        org.junit.Assert.assertNotNull(requestFilterArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.github.tomakehurst.wiremock.common.filemaker.FilenameMaker filenameMaker0 = new com.github.tomakehurst.wiremock.common.filemaker.FilenameMaker();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.github.tomakehurst.wiremock.matching.UrlPattern urlPattern0 = null;
        com.github.tomakehurst.wiremock.client.MappingBuilder mappingBuilder1 = com.github.tomakehurst.wiremock.client.WireMock.getOrHead(urlPattern0);
        com.github.tomakehurst.wiremock.common.Metadata metadata2 = null;
        com.github.tomakehurst.wiremock.client.MappingBuilder mappingBuilder3 = mappingBuilder1.withMetadata(metadata2);
        org.junit.Assert.assertNotNull(mappingBuilder1);
        org.junit.Assert.assertNotNull(mappingBuilder3);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.github.tomakehurst.wiremock.store.ScenariosStore scenariosStore0 = null;
        com.github.tomakehurst.wiremock.stubbing.InMemoryScenarios inMemoryScenarios1 = new com.github.tomakehurst.wiremock.stubbing.InMemoryScenarios(scenariosStore0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.github.tomakehurst.wiremock.matching.RequestPatternBuilder requestPatternBuilder0 = com.github.tomakehurst.wiremock.matching.RequestPatternBuilder.newRequestPattern();
        org.junit.Assert.assertNotNull(requestPatternBuilder0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.lang.String str1 = com.github.tomakehurst.wiremock.common.Strings.randomAlphanumeric((int) '4');
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zrcDq42e1ud4nWIEcxneEUF3oopZCEHrvuQrkkg5yua3hb5Kl4AI" + "'", str1, "zrcDq42e1ud4nWIEcxneEUF3oopZCEHrvuQrkkg5yua3hb5Kl4AI");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.util.Optional<com.github.tomakehurst.wiremock.stubbing.StubMapping> stubMappingOptional0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.tomakehurst.wiremock.admin.model.SingleStubMappingResult singleStubMappingResult1 = com.github.tomakehurst.wiremock.admin.model.SingleStubMappingResult.fromOptional(stubMappingOptional0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Optional.orElse(Object)\" because \"optional\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.github.tomakehurst.wiremock.common.RequestCache.onRequestEnd();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.github.tomakehurst.wiremock.admin.tasks.GetUnmatchedStubMappingsTask getUnmatchedStubMappingsTask0 = new com.github.tomakehurst.wiremock.admin.tasks.GetUnmatchedStubMappingsTask();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.github.tomakehurst.wiremock.common.FileSource fileSource0 = null;
        com.github.tomakehurst.wiremock.store.files.FileSourceBlobStore fileSourceBlobStore1 = new com.github.tomakehurst.wiremock.store.files.FileSourceBlobStore(fileSource0);
        // The following exception was thrown during execution in test generation
        try {
            fileSourceBlobStore1.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.github.tomakehurst.wiremock.common.FileSource.listFilesRecursively()\" because \"this.fileSource\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        // The following exception was thrown during execution in test generation
        try {
            com.github.tomakehurst.wiremock.http.LogNormal logNormal3 = new com.github.tomakehurst.wiremock.http.LogNormal((double) 10.0f, (double) 100.0f, (java.lang.Double) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The max value (-1.0) has to be greater than or equal to the median (10.0). Sigma: 100.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.lang.Iterable<com.github.tomakehurst.wiremock.extension.StubMappingTransformer> stubMappingTransformerIterable0 = null;
        com.github.tomakehurst.wiremock.recording.SnapshotStubMappingTransformerRunner snapshotStubMappingTransformerRunner1 = new com.github.tomakehurst.wiremock.recording.SnapshotStubMappingTransformerRunner(stubMappingTransformerIterable0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.lang.Object obj0 = null;
        byte[] byteArray1 = com.github.tomakehurst.wiremock.common.Json.toByteArray(obj0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[110, 117, 108, 108]");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        // The following exception was thrown during execution in test generation
        try {
            com.github.tomakehurst.wiremock.WireMockServer wireMockServer1 = new com.github.tomakehurst.wiremock.WireMockServer((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: resource keystore not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.github.tomakehurst.wiremock.stubbing.StubMapping stubMapping0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.tomakehurst.wiremock.admin.model.ServeEventQuery serveEventQuery1 = com.github.tomakehurst.wiremock.admin.model.ServeEventQuery.forStubMapping(stubMapping0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.github.tomakehurst.wiremock.stubbing.StubMapping.getId()\" because \"stubMapping\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.github.tomakehurst.wiremock.common.KeyLocks keyLocks0 = new com.github.tomakehurst.wiremock.common.KeyLocks();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.lang.String str0 = com.github.tomakehurst.wiremock.extension.responsetemplating.ResponseTemplateTransformer.NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "response-template" + "'", str0, "response-template");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.github.tomakehurst.wiremock.extension.responsetemplating.helpers.WireMockHelpers wireMockHelpers0 = com.github.tomakehurst.wiremock.extension.responsetemplating.helpers.WireMockHelpers.formatJson;
        org.junit.Assert.assertNotNull(wireMockHelpers0);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.github.tomakehurst.wiremock.admin.tasks.FindNearMissesForRequestPatternTask findNearMissesForRequestPatternTask0 = new com.github.tomakehurst.wiremock.admin.tasks.FindNearMissesForRequestPatternTask();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.github.tomakehurst.wiremock.http.Cookie cookie0 = com.github.tomakehurst.wiremock.http.Cookie.absent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = cookie0.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No value for null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cookie0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.github.tomakehurst.wiremock.http.ResponseDefinition responseDefinition0 = com.github.tomakehurst.wiremock.http.ResponseDefinition.notConfigured();
        org.junit.Assert.assertNotNull(responseDefinition0);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.github.tomakehurst.wiremock.store.Stores.PersistenceType persistenceType0 = com.github.tomakehurst.wiremock.store.Stores.PersistenceType.EPHEMERAL;
        org.junit.Assert.assertTrue("'" + persistenceType0 + "' != '" + com.github.tomakehurst.wiremock.store.Stores.PersistenceType.EPHEMERAL + "'", persistenceType0.equals(com.github.tomakehurst.wiremock.store.Stores.PersistenceType.EPHEMERAL));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.github.tomakehurst.wiremock.extension.responsetemplating.helpers.WireMockHelpers wireMockHelpers0 = com.github.tomakehurst.wiremock.extension.responsetemplating.helpers.WireMockHelpers.val;
        org.junit.Assert.assertNotNull(wireMockHelpers0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.github.tomakehurst.wiremock.common.Errors.Error error2 = new com.github.tomakehurst.wiremock.common.Errors.Error((int) (short) 10, "");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.util.Map<java.lang.String, com.github.tomakehurst.wiremock.http.QueryParameter> strMap1 = com.github.tomakehurst.wiremock.common.Urls.splitQuery("");
        org.junit.Assert.assertNotNull(strMap1);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.github.tomakehurst.wiremock.common.TextType textType1 = com.github.tomakehurst.wiremock.common.ContentTypes.determineTextType("and");
        org.junit.Assert.assertTrue("'" + textType1 + "' != '" + com.github.tomakehurst.wiremock.common.TextType.PLAIN_TEXT + "'", textType1.equals(com.github.tomakehurst.wiremock.common.TextType.PLAIN_TEXT));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        // The following exception was thrown during execution in test generation
        try {
            com.github.tomakehurst.wiremock.recording.SnapshotOutputFormatter snapshotOutputFormatter1 = com.github.tomakehurst.wiremock.recording.SnapshotOutputFormatter.fromString(" exactly ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid output format");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.github.tomakehurst.wiremock.http.ImmutableRequest.Builder builder0 = new com.github.tomakehurst.wiremock.http.ImmutableRequest.Builder();
        com.github.tomakehurst.wiremock.http.ImmutableRequest.Builder builder2 = builder0.withAbsoluteUrl("");
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.github.tomakehurst.wiremock.common.FileSource fileSource0 = null;
        com.github.tomakehurst.wiremock.store.files.FileSourceBlobStore fileSourceBlobStore1 = new com.github.tomakehurst.wiremock.store.files.FileSourceBlobStore(fileSource0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<byte[]> byteArrayOptional3 = fileSourceBlobStore1.get("H9W4Mw3mHK");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.github.tomakehurst.wiremock.common.FileSource.getBinaryFileNamed(String)\" because \"this.fileSource\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.github.tomakehurst.wiremock.matching.CustomMatcherDefinition customMatcherDefinition0 = null;
        com.github.tomakehurst.wiremock.matching.RequestPattern requestPattern1 = new com.github.tomakehurst.wiremock.matching.RequestPattern(customMatcherDefinition0);
        boolean boolean2 = requestPattern1.hasNamedCustomMatcher();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.lang.String str0 = com.github.tomakehurst.wiremock.common.ContentTypes.OCTET_STREAM;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "application/octet-stream" + "'", str0, "application/octet-stream");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.github.tomakehurst.wiremock.client.WireMock wireMock4 = new com.github.tomakehurst.wiremock.client.WireMock("Location", " exactly ", (int) (byte) -1, "zrcDq42e1ud4nWIEcxneEUF3oopZCEHrvuQrkkg5yua3hb5Kl4AI");
        // The following exception was thrown during execution in test generation
        try {
            com.github.tomakehurst.wiremock.recording.RecordingStatusResult recordingStatusResult5 = wireMock4.getStubRecordingStatus();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in authority at index 11: Location:// exactly zrcDq42e1ud4nWIEcxneEUF3oopZCEHrvuQrkkg5yua3hb5Kl4AI/__admin/recordings/status");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder responseDefinitionBuilder0 = com.github.tomakehurst.wiremock.client.WireMock.badRequest();
        org.junit.Assert.assertNotNull(responseDefinitionBuilder0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.github.tomakehurst.wiremock.global.GlobalSettings globalSettings0 = com.github.tomakehurst.wiremock.global.GlobalSettings.defaults();
        com.github.tomakehurst.wiremock.admin.model.GetGlobalSettingsResult getGlobalSettingsResult1 = new com.github.tomakehurst.wiremock.admin.model.GetGlobalSettingsResult(globalSettings0);
        org.junit.Assert.assertNotNull(globalSettings0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.github.tomakehurst.wiremock.extension.ServeEventListener.RequestPhase requestPhase0 = com.github.tomakehurst.wiremock.extension.ServeEventListener.RequestPhase.AFTER_MATCH;
        org.junit.Assert.assertTrue("'" + requestPhase0 + "' != '" + com.github.tomakehurst.wiremock.extension.ServeEventListener.RequestPhase.AFTER_MATCH + "'", requestPhase0.equals(com.github.tomakehurst.wiremock.extension.ServeEventListener.RequestPhase.AFTER_MATCH));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.hc.core5.http.ClassicHttpResponse classicHttpResponse0 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray1 = com.github.tomakehurst.wiremock.common.HttpClientUtils.getEntityAsByteArrayAndCloseStream(classicHttpResponse0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.hc.core5.http.ClassicHttpResponse.getEntity()\" because \"httpResponse\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.github.tomakehurst.wiremock.global.GlobalSettings.Builder builder0 = new com.github.tomakehurst.wiremock.global.GlobalSettings.Builder();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.github.tomakehurst.wiremock.extension.responsetemplating.helpers.WireMockHelpers wireMockHelpers0 = com.github.tomakehurst.wiremock.extension.responsetemplating.helpers.WireMockHelpers.formatXml;
        org.junit.Assert.assertNotNull(wireMockHelpers0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.github.tomakehurst.wiremock.matching.UrlPattern urlPattern0 = null;
        com.github.tomakehurst.wiremock.client.MappingBuilder mappingBuilder1 = com.github.tomakehurst.wiremock.client.WireMock.getOrHead(urlPattern0);
        com.github.tomakehurst.wiremock.client.MappingBuilder mappingBuilder3 = mappingBuilder1.withScheme(" exactly ");
        com.github.tomakehurst.wiremock.matching.MultipartValuePatternBuilder multipartValuePatternBuilder4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.tomakehurst.wiremock.client.MappingBuilder mappingBuilder5 = mappingBuilder1.withMultipartRequestBody(multipartValuePatternBuilder4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.github.tomakehurst.wiremock.matching.MultipartValuePatternBuilder.build()\" because \"multipartPatternBuilder\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mappingBuilder1);
        org.junit.Assert.assertNotNull(mappingBuilder3);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.github.tomakehurst.wiremock.common.BrowserProxySettings browserProxySettings0 = null;
        com.github.tomakehurst.wiremock.common.BrowserProxySettings.DISABLED = browserProxySettings0;
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.github.tomakehurst.wiremock.servlet.WireMockWebContextListener wireMockWebContextListener0 = new com.github.tomakehurst.wiremock.servlet.WireMockWebContextListener();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.github.tomakehurst.wiremock.common.HttpsSettings httpsSettings0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.eclipse.jetty.util.ssl.SslContextFactory.Server server1 = com.github.tomakehurst.wiremock.jetty11.SslContexts.buildHttp2SslContextFactory(httpsSettings0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.github.tomakehurst.wiremock.common.HttpsSettings.keyStore()\" because \"httpsSettings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.github.tomakehurst.wiremock.matching.EqualToPatternWithCaseInsensitivePrefix equalToPatternWithCaseInsensitivePrefix2 = new com.github.tomakehurst.wiremock.matching.EqualToPatternWithCaseInsensitivePrefix("Location", "Location");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.github.tomakehurst.wiremock.extension.responsetemplating.helpers.FormatXmlHelper formatXmlHelper0 = new com.github.tomakehurst.wiremock.extension.responsetemplating.helpers.FormatXmlHelper();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.github.tomakehurst.wiremock.http.RequestMethod requestMethod0 = com.github.tomakehurst.wiremock.http.RequestMethod.POST;
        org.junit.Assert.assertNotNull(requestMethod0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.github.tomakehurst.wiremock.admin.tasks.ResetRequestsTask resetRequestsTask0 = new com.github.tomakehurst.wiremock.admin.tasks.ResetRequestsTask();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.github.tomakehurst.wiremock.http.Fault fault0 = com.github.tomakehurst.wiremock.http.Fault.MALFORMED_RESPONSE_CHUNK;
        org.junit.Assert.assertNotNull(fault0);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.lang.String str0 = com.github.tomakehurst.wiremock.extension.responsetemplating.helpers.HandlebarsHelper.ERROR_PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "[ERROR: " + "'", str0, "[ERROR: ");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        jakarta.servlet.ServletContext servletContext0 = null;
        com.github.tomakehurst.wiremock.servlet.WarConfiguration warConfiguration1 = new com.github.tomakehurst.wiremock.servlet.WarConfiguration(servletContext0);
        boolean boolean2 = warConfiguration1.getHttp2TlsDisabled();
        com.github.tomakehurst.wiremock.common.NetworkAddressRules networkAddressRules3 = warConfiguration1.getProxyTargetRules();
        int int4 = warConfiguration1.containerThreads();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(networkAddressRules3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.github.tomakehurst.wiremock.extension.responsetemplating.helpers.WireMockHelpers wireMockHelpers0 = com.github.tomakehurst.wiremock.extension.responsetemplating.helpers.WireMockHelpers.arrayRemove;
        org.junit.Assert.assertNotNull(wireMockHelpers0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.lang.String str0 = com.github.tomakehurst.wiremock.common.ContentTypes.TRANSFER_ENCODING;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Transfer-Encoding" + "'", str0, "Transfer-Encoding");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        jakarta.servlet.ServletContext servletContext0 = null;
        com.github.tomakehurst.wiremock.servlet.WarConfiguration warConfiguration1 = new com.github.tomakehurst.wiremock.servlet.WarConfiguration(servletContext0);
        boolean boolean2 = warConfiguration1.getHttp2TlsDisabled();
        com.github.tomakehurst.wiremock.common.NetworkAddressRules networkAddressRules3 = warConfiguration1.getProxyTargetRules();
        com.github.tomakehurst.wiremock.http.AdminRequestHandler adminRequestHandler4 = null;
        com.github.tomakehurst.wiremock.core.StubServer stubServer5 = null;
        com.github.tomakehurst.wiremock.http.ResponseRenderer responseRenderer6 = null;
        com.github.tomakehurst.wiremock.core.Admin admin7 = null;
        java.util.Map<java.lang.String, com.github.tomakehurst.wiremock.extension.PostServeAction> strMap8 = null;
        java.util.Map<java.lang.String, com.github.tomakehurst.wiremock.extension.ServeEventListener> strMap9 = null;
        com.github.tomakehurst.wiremock.verification.RequestJournal requestJournal10 = null;
        com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter[] requestFilterArray11 = new com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter[] {};
        java.util.ArrayList<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter> requestFilterList12 = new java.util.ArrayList<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter>) requestFilterList12, requestFilterArray11);
        com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilterV2[] requestFilterV2Array14 = new com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilterV2[] {};
        java.util.ArrayList<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilterV2> requestFilterV2List15 = new java.util.ArrayList<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilterV2>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilterV2>) requestFilterV2List15, requestFilterV2Array14);
        com.github.tomakehurst.wiremock.common.DataTruncationSettings dataTruncationSettings18 = com.github.tomakehurst.wiremock.common.DataTruncationSettings.NO_TRUNCATION;
        com.github.tomakehurst.wiremock.verification.notmatched.NotMatchedRenderer notMatchedRenderer19 = null;
        com.github.tomakehurst.wiremock.http.StubRequestHandler stubRequestHandler20 = new com.github.tomakehurst.wiremock.http.StubRequestHandler(stubServer5, responseRenderer6, admin7, strMap8, strMap9, requestJournal10, (java.util.List<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter>) requestFilterList12, (java.util.List<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilterV2>) requestFilterV2List15, false, dataTruncationSettings18, notMatchedRenderer19);
        // The following exception was thrown during execution in test generation
        try {
            com.github.tomakehurst.wiremock.jetty11.Jetty11HttpServer jetty11HttpServer21 = new com.github.tomakehurst.wiremock.jetty11.Jetty11HttpServer((com.github.tomakehurst.wiremock.core.Options) warConfiguration1, adminRequestHandler4, stubRequestHandler20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.github.tomakehurst.wiremock.common.JettySettings.getStopTimeout()\" because \"jettySettings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(networkAddressRules3);
        org.junit.Assert.assertNotNull(requestFilterArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(requestFilterV2Array14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dataTruncationSettings18);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.lang.String str0 = com.github.tomakehurst.wiremock.servlet.FaultInjectorFactory.INJECTOR_CLASS_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "FaultHandlerFactoryClass" + "'", str0, "FaultHandlerFactoryClass");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.github.tomakehurst.wiremock.extension.Parameters parameters1 = null;
        com.github.tomakehurst.wiremock.matching.RequestPatternBuilder requestPatternBuilder2 = new com.github.tomakehurst.wiremock.matching.RequestPatternBuilder("]", parameters1);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.github.tomakehurst.wiremock.common.Errors errors0 = null;
        com.github.tomakehurst.wiremock.http.ResponseDefinition responseDefinition1 = com.github.tomakehurst.wiremock.http.ResponseDefinition.notPermitted(errors0);
        org.junit.Assert.assertNotNull(responseDefinition1);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.lang.String str5 = com.github.tomakehurst.wiremock.common.Strings.wrap("Location", (int) (short) 100, "H9W4Mw3mHK", false, "path equalTo zrcDq42e1ud4nWIEcxneEUF3oopZCEHrvuQrkkg5yua3hb5Kl4AI");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Location" + "'", str5, "Location");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.github.tomakehurst.wiremock.stubbing.InMemoryStubMappings inMemoryStubMappings0 = new com.github.tomakehurst.wiremock.stubbing.InMemoryStubMappings();
        java.util.UUID uUID1 = null;
        java.util.Optional<com.github.tomakehurst.wiremock.stubbing.StubMapping> stubMappingOptional2 = inMemoryStubMappings0.get(uUID1);
        java.util.List<com.github.tomakehurst.wiremock.stubbing.Scenario> scenarioList3 = inMemoryStubMappings0.getAllScenarios();
        org.junit.Assert.assertNotNull(stubMappingOptional2);
        org.junit.Assert.assertNotNull(scenarioList3);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.github.tomakehurst.wiremock.matching.MultipartValuePatternBuilder multipartValuePatternBuilder0 = new com.github.tomakehurst.wiremock.matching.MultipartValuePatternBuilder();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.github.tomakehurst.wiremock.core.StubServer stubServer0 = null;
        com.github.tomakehurst.wiremock.http.ResponseRenderer responseRenderer1 = null;
        com.github.tomakehurst.wiremock.core.Admin admin2 = null;
        java.util.Map<java.lang.String, com.github.tomakehurst.wiremock.extension.PostServeAction> strMap3 = null;
        java.util.Map<java.lang.String, com.github.tomakehurst.wiremock.extension.ServeEventListener> strMap4 = null;
        com.github.tomakehurst.wiremock.verification.RequestJournal requestJournal5 = null;
        com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter[] requestFilterArray6 = new com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter[] {};
        java.util.ArrayList<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter> requestFilterList7 = new java.util.ArrayList<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter>) requestFilterList7, requestFilterArray6);
        com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilterV2[] requestFilterV2Array9 = new com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilterV2[] {};
        java.util.ArrayList<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilterV2> requestFilterV2List10 = new java.util.ArrayList<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilterV2>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilterV2>) requestFilterV2List10, requestFilterV2Array9);
        com.github.tomakehurst.wiremock.common.DataTruncationSettings dataTruncationSettings13 = com.github.tomakehurst.wiremock.common.DataTruncationSettings.NO_TRUNCATION;
        com.github.tomakehurst.wiremock.verification.notmatched.NotMatchedRenderer notMatchedRenderer14 = null;
        com.github.tomakehurst.wiremock.http.StubRequestHandler stubRequestHandler15 = new com.github.tomakehurst.wiremock.http.StubRequestHandler(stubServer0, responseRenderer1, admin2, strMap3, strMap4, requestJournal5, (java.util.List<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter>) requestFilterList7, (java.util.List<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilterV2>) requestFilterV2List10, false, dataTruncationSettings13, notMatchedRenderer14);
        com.github.tomakehurst.wiremock.http.RequestListener requestListener16 = null;
        stubRequestHandler15.addRequestListener(requestListener16);
        org.junit.Assert.assertNotNull(requestFilterArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(requestFilterV2Array9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dataTruncationSettings13);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.github.tomakehurst.wiremock.http.multipart.PartParser partParser0 = new com.github.tomakehurst.wiremock.http.multipart.PartParser();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.github.tomakehurst.wiremock.extension.responsetemplating.helpers.WireMockHelpers wireMockHelpers0 = com.github.tomakehurst.wiremock.extension.responsetemplating.helpers.WireMockHelpers.matches;
        org.junit.Assert.assertNotNull(wireMockHelpers0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.github.tomakehurst.wiremock.verification.LoggedRequest[] loggedRequestArray0 = new com.github.tomakehurst.wiremock.verification.LoggedRequest[] {};
        java.util.ArrayList<com.github.tomakehurst.wiremock.verification.LoggedRequest> loggedRequestList1 = new java.util.ArrayList<com.github.tomakehurst.wiremock.verification.LoggedRequest>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.github.tomakehurst.wiremock.verification.LoggedRequest>) loggedRequestList1, loggedRequestArray0);
        com.github.tomakehurst.wiremock.verification.FindRequestsResult findRequestsResult4 = new com.github.tomakehurst.wiremock.verification.FindRequestsResult((java.util.List<com.github.tomakehurst.wiremock.verification.LoggedRequest>) loggedRequestList1, false);
        org.junit.Assert.assertNotNull(loggedRequestArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.github.tomakehurst.wiremock.common.url.QueryParams queryParams0 = new com.github.tomakehurst.wiremock.common.url.QueryParams();
        java.util.Set<java.lang.String> strSet1 = queryParams0.keySet();
        org.junit.Assert.assertNotNull(strSet1);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.github.tomakehurst.wiremock.common.FileSource fileSource0 = null;
        com.github.tomakehurst.wiremock.store.files.FileSourceBlobStore fileSourceBlobStore1 = new com.github.tomakehurst.wiremock.store.files.FileSourceBlobStore(fileSource0);
        com.github.tomakehurst.wiremock.common.InputStreamSource inputStreamSource3 = com.github.tomakehurst.wiremock.common.StreamSources.forBlobStoreItem((com.github.tomakehurst.wiremock.store.BlobStore) fileSourceBlobStore1, " exactly ");
        // The following exception was thrown during execution in test generation
        try {
            fileSourceBlobStore1.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.github.tomakehurst.wiremock.common.FileSource.listFilesRecursively()\" because \"this.fileSource\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStreamSource3);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.github.tomakehurst.wiremock.matching.UrlPathPattern urlPathPattern2 = com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo("zrcDq42e1ud4nWIEcxneEUF3oopZCEHrvuQrkkg5yua3hb5Kl4AI");
        java.lang.String str3 = urlPathPattern2.toString();
        com.github.tomakehurst.wiremock.matching.RequestPatternBuilder requestPatternBuilder4 = com.github.tomakehurst.wiremock.client.WireMock.requestedFor("response-template", (com.github.tomakehurst.wiremock.matching.UrlPattern) urlPathPattern2);
        com.github.tomakehurst.wiremock.extension.Parameters parameters6 = null;
        com.github.tomakehurst.wiremock.matching.RequestPatternBuilder requestPatternBuilder7 = requestPatternBuilder4.andMatching("path equalTo zrcDq42e1ud4nWIEcxneEUF3oopZCEHrvuQrkkg5yua3hb5Kl4AI", parameters6);
        org.junit.Assert.assertNotNull(urlPathPattern2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "path equalTo zrcDq42e1ud4nWIEcxneEUF3oopZCEHrvuQrkkg5yua3hb5Kl4AI" + "'", str3, "path equalTo zrcDq42e1ud4nWIEcxneEUF3oopZCEHrvuQrkkg5yua3hb5Kl4AI");
        org.junit.Assert.assertNotNull(requestPatternBuilder4);
        org.junit.Assert.assertNotNull(requestPatternBuilder7);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.github.tomakehurst.wiremock.extension.Parameters parameters0 = null;
        com.github.tomakehurst.wiremock.admin.model.ExtendedSettingsWrapper extendedSettingsWrapper1 = new com.github.tomakehurst.wiremock.admin.model.ExtendedSettingsWrapper(parameters0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.lang.String str0 = com.github.tomakehurst.wiremock.jetty11.HttpsProxyDetectingHandler.IS_HTTPS_PROXY_REQUEST_ATTRIBUTE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "wiremock.isHttpsProxyRequest" + "'", str0, "wiremock.isHttpsProxyRequest");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.github.tomakehurst.wiremock.common.TextType textType0 = com.github.tomakehurst.wiremock.common.TextType.JSON;
        org.junit.Assert.assertTrue("'" + textType0 + "' != '" + com.github.tomakehurst.wiremock.common.TextType.JSON + "'", textType0.equals(com.github.tomakehurst.wiremock.common.TextType.JSON));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.github.tomakehurst.wiremock.client.WireMock.configureFor((int) (short) 10);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.github.tomakehurst.wiremock.http.trafficlistener.DoNothingWiremockNetworkTrafficListener doNothingWiremockNetworkTrafficListener0 = new com.github.tomakehurst.wiremock.http.trafficlistener.DoNothingWiremockNetworkTrafficListener();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.github.tomakehurst.wiremock.client.HttpAdminClient httpAdminClient5 = new com.github.tomakehurst.wiremock.client.HttpAdminClient("[ERROR: ", "]", (int) (byte) 10, "H9W4Mw3mHK", " exactly ");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.github.tomakehurst.wiremock.security.ClientAuthenticator clientAuthenticator7 = null;
        com.github.tomakehurst.wiremock.client.WireMock wireMock8 = new com.github.tomakehurst.wiremock.client.WireMock("hi!", "FaultHandlerFactoryClass", (int) (byte) 0, "", "H9W4Mw3mHK", "zrcDq42e1ud4nWIEcxneEUF3oopZCEHrvuQrkkg5yua3hb5Kl4AI", (int) (short) 10, clientAuthenticator7);
        // The following exception was thrown during execution in test generation
        try {
            wireMock8.resetRequests();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in scheme name at index 2: hi!://FaultHandlerFactoryClass:0/__admin/requests");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.github.tomakehurst.wiremock.admin.tasks.GlobalSettingsUpdateTask globalSettingsUpdateTask0 = new com.github.tomakehurst.wiremock.admin.tasks.GlobalSettingsUpdateTask();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.github.tomakehurst.wiremock.common.NotWritableException notWritableException1 = new com.github.tomakehurst.wiremock.common.NotWritableException("H9W4Mw3mHK");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.github.tomakehurst.wiremock.extension.responsetemplating.helpers.WireMockHelpers wireMockHelpers0 = com.github.tomakehurst.wiremock.extension.responsetemplating.helpers.WireMockHelpers.truncateDate;
        org.junit.Assert.assertNotNull(wireMockHelpers0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.github.tomakehurst.wiremock.common.ProhibitedNetworkAddressException prohibitedNetworkAddressException0 = new com.github.tomakehurst.wiremock.common.ProhibitedNetworkAddressException();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.github.tomakehurst.wiremock.matching.WeightedMatchResult[] weightedMatchResultArray0 = new com.github.tomakehurst.wiremock.matching.WeightedMatchResult[] {};
        java.util.ArrayList<com.github.tomakehurst.wiremock.matching.WeightedMatchResult> weightedMatchResultList1 = new java.util.ArrayList<com.github.tomakehurst.wiremock.matching.WeightedMatchResult>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.github.tomakehurst.wiremock.matching.WeightedMatchResult>) weightedMatchResultList1, weightedMatchResultArray0);
        com.github.tomakehurst.wiremock.matching.WeightedAggregateMatchResult weightedAggregateMatchResult3 = new com.github.tomakehurst.wiremock.matching.WeightedAggregateMatchResult((java.util.List<com.github.tomakehurst.wiremock.matching.WeightedMatchResult>) weightedMatchResultList1);
        java.util.List<com.github.tomakehurst.wiremock.stubbing.SubEvent> subEventList4 = weightedAggregateMatchResult3.getSubEvents();
        org.junit.Assert.assertNotNull(weightedMatchResultArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(subEventList4);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        com.github.tomakehurst.wiremock.extension.responsetemplating.helpers.JsonData.MapJsonData mapJsonData1 = new com.github.tomakehurst.wiremock.extension.responsetemplating.helpers.JsonData.MapJsonData(strMap0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        byte[] byteArray1 = com.github.tomakehurst.wiremock.common.Json.toByteArray((java.lang.Object) (byte) 100);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[49, 48, 48]");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.util.function.Predicate<com.github.tomakehurst.wiremock.common.BinaryFile> binaryFilePredicate1 = com.github.tomakehurst.wiremock.common.AbstractFileSource.byFileExtension("");
        org.junit.Assert.assertNotNull(binaryFilePredicate1);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.github.tomakehurst.wiremock.matching.UrlPathPattern urlPathPattern1 = com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo("zrcDq42e1ud4nWIEcxneEUF3oopZCEHrvuQrkkg5yua3hb5Kl4AI");
        com.github.tomakehurst.wiremock.matching.RequestPatternBuilder requestPatternBuilder2 = com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor((com.github.tomakehurst.wiremock.matching.UrlPattern) urlPathPattern1);
        org.junit.Assert.assertNotNull(urlPathPattern1);
        org.junit.Assert.assertNotNull(requestPatternBuilder2);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.github.tomakehurst.wiremock.security.ClientAuthenticator clientAuthenticator7 = null;
        com.github.tomakehurst.wiremock.client.WireMock wireMock8 = new com.github.tomakehurst.wiremock.client.WireMock("hi!", "FaultHandlerFactoryClass", (int) (byte) 0, "", "H9W4Mw3mHK", "zrcDq42e1ud4nWIEcxneEUF3oopZCEHrvuQrkkg5yua3hb5Kl4AI", (int) (short) 10, clientAuthenticator7);
        com.github.tomakehurst.wiremock.matching.UrlPattern urlPattern9 = null;
        com.github.tomakehurst.wiremock.client.MappingBuilder mappingBuilder10 = com.github.tomakehurst.wiremock.client.WireMock.getOrHead(urlPattern9);
        com.github.tomakehurst.wiremock.client.MappingBuilder mappingBuilder12 = mappingBuilder10.andMatching("");
        // The following exception was thrown during execution in test generation
        try {
            com.github.tomakehurst.wiremock.stubbing.StubMapping stubMapping13 = wireMock8.register(mappingBuilder12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in scheme name at index 2: hi!://FaultHandlerFactoryClass:0/__admin/mappings");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mappingBuilder10);
        org.junit.Assert.assertNotNull(mappingBuilder12);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        jakarta.servlet.ServletContext servletContext0 = null;
        com.github.tomakehurst.wiremock.servlet.WarConfiguration warConfiguration1 = new com.github.tomakehurst.wiremock.servlet.WarConfiguration(servletContext0);
        com.github.tomakehurst.wiremock.common.ProxySettings proxySettings2 = warConfiguration1.proxyVia();
        boolean boolean3 = warConfiguration1.getHttp2TlsDisabled();
        org.junit.Assert.assertNotNull(proxySettings2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.github.tomakehurst.wiremock.global.GlobalSettings.Builder builder0 = com.github.tomakehurst.wiremock.global.GlobalSettings.builder();
        org.junit.Assert.assertNotNull(builder0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.github.tomakehurst.wiremock.matching.RequestPattern requestPattern0 = com.github.tomakehurst.wiremock.matching.RequestPattern.everything();
        org.junit.Assert.assertNotNull(requestPattern0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.util.UUID uUID0 = null;
        com.github.tomakehurst.wiremock.verification.LoggedRequest loggedRequest1 = null;
        com.github.tomakehurst.wiremock.stubbing.StubMapping stubMapping2 = null;
        byte[] byteArray5 = new byte[] { (byte) 10 };
        com.github.tomakehurst.wiremock.http.ResponseDefinition responseDefinition6 = new com.github.tomakehurst.wiremock.http.ResponseDefinition((int) (byte) -1, byteArray5);
        com.github.tomakehurst.wiremock.http.LoggedResponse loggedResponse7 = null;
        com.github.tomakehurst.wiremock.common.Timing timing9 = null;
        com.github.tomakehurst.wiremock.stubbing.SubEvent[] subEventArray10 = new com.github.tomakehurst.wiremock.stubbing.SubEvent[] {};
        java.util.LinkedList<com.github.tomakehurst.wiremock.stubbing.SubEvent> subEventList11 = new java.util.LinkedList<com.github.tomakehurst.wiremock.stubbing.SubEvent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.github.tomakehurst.wiremock.stubbing.SubEvent>) subEventList11, subEventArray10);
        com.github.tomakehurst.wiremock.stubbing.ServeEvent serveEvent13 = new com.github.tomakehurst.wiremock.stubbing.ServeEvent(uUID0, loggedRequest1, stubMapping2, responseDefinition6, loggedResponse7, true, timing9, (java.util.Queue<com.github.tomakehurst.wiremock.stubbing.SubEvent>) subEventList11);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10]");
        org.junit.Assert.assertNotNull(subEventArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        jakarta.servlet.ServletContext servletContext0 = null;
        com.github.tomakehurst.wiremock.servlet.WarConfiguration warConfiguration1 = new com.github.tomakehurst.wiremock.servlet.WarConfiguration(servletContext0);
        boolean boolean2 = warConfiguration1.getHttp2TlsDisabled();
        com.github.tomakehurst.wiremock.common.NetworkAddressRules networkAddressRules3 = warConfiguration1.getProxyTargetRules();
        // The following exception was thrown during execution in test generation
        try {
            com.github.tomakehurst.wiremock.WireMockServer wireMockServer4 = new com.github.tomakehurst.wiremock.WireMockServer((com.github.tomakehurst.wiremock.core.Options) warConfiguration1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"jakarta.servlet.ServletContext.getInitParameter(String)\" because \"this.servletContext\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(networkAddressRules3);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        jakarta.servlet.ServletContext servletContext0 = null;
        com.github.tomakehurst.wiremock.servlet.WarConfiguration warConfiguration1 = new com.github.tomakehurst.wiremock.servlet.WarConfiguration(servletContext0);
        com.github.tomakehurst.wiremock.common.ProxySettings proxySettings2 = warConfiguration1.proxyVia();
        int int3 = proxySettings2.port();
        org.junit.Assert.assertNotNull(proxySettings2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.lang.String str0 = org.eclipse.jetty.util.component.AbstractLifeCycle.STOPPED;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "STOPPED" + "'", str0, "STOPPED");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        jakarta.servlet.ServletContext servletContext0 = null;
        com.github.tomakehurst.wiremock.servlet.WarConfiguration warConfiguration1 = new com.github.tomakehurst.wiremock.servlet.WarConfiguration(servletContext0);
        com.github.tomakehurst.wiremock.common.ProxySettings proxySettings2 = warConfiguration1.proxyVia();
        proxySettings2.setPassword("zrcDq42e1ud4nWIEcxneEUF3oopZCEHrvuQrkkg5yua3hb5Kl4AI");
        org.junit.Assert.assertNotNull(proxySettings2);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.github.tomakehurst.wiremock.extension.responsetemplating.helpers.WireMockHelpers wireMockHelpers0 = com.github.tomakehurst.wiremock.extension.responsetemplating.helpers.WireMockHelpers.range;
        org.junit.Assert.assertNotNull(wireMockHelpers0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.github.tomakehurst.wiremock.stubbing.SubEvent[] subEventArray1 = new com.github.tomakehurst.wiremock.stubbing.SubEvent[] {};
        java.util.ArrayList<com.github.tomakehurst.wiremock.stubbing.SubEvent> subEventList2 = new java.util.ArrayList<com.github.tomakehurst.wiremock.stubbing.SubEvent>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.github.tomakehurst.wiremock.stubbing.SubEvent>) subEventList2, subEventArray1);
        com.github.tomakehurst.wiremock.matching.MatchResult matchResult4 = com.github.tomakehurst.wiremock.matching.MatchResult.partialMatch(100.0d, (java.util.List<com.github.tomakehurst.wiremock.stubbing.SubEvent>) subEventList2);
        com.github.tomakehurst.wiremock.matching.WeightedMatchResult weightedMatchResult6 = new com.github.tomakehurst.wiremock.matching.WeightedMatchResult(matchResult4, (double) (byte) 10);
        double double7 = weightedMatchResult6.getDistance();
        org.junit.Assert.assertNotNull(subEventArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(matchResult4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1000.0d + "'", double7 == 1000.0d);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.github.tomakehurst.wiremock.common.Errors errors0 = null;
        com.github.tomakehurst.wiremock.http.ResponseDefinition responseDefinition1 = com.github.tomakehurst.wiremock.http.ResponseDefinition.badRequestEntity(errors0);
        org.junit.Assert.assertNotNull(responseDefinition1);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.github.tomakehurst.wiremock.store.files.FileSourceJsonObjectStore fileSourceJsonObjectStore1 = new com.github.tomakehurst.wiremock.store.files.FileSourceJsonObjectStore("and");
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.Stream<java.lang.String> strStream2 = fileSourceJsonObjectStore1.getAllKeys();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: and does not exist");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.github.tomakehurst.wiremock.common.Message message1 = new com.github.tomakehurst.wiremock.common.Message("Location");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        // The following exception was thrown during execution in test generation
        try {
            com.github.tomakehurst.wiremock.junit5.WireMockExtension.Builder builder0 = com.github.tomakehurst.wiremock.junit5.WireMockExtension.extensionOptions();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: resource keystore not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.github.tomakehurst.wiremock.http.CaseInsensitiveKey caseInsensitiveKey1 = com.github.tomakehurst.wiremock.http.CaseInsensitiveKey.from("hi!");
        org.junit.Assert.assertNotNull(caseInsensitiveKey1);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.lang.String str0 = org.eclipse.jetty.server.handler.ErrorHandler.ERROR_PAGE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "org.eclipse.jetty.server.error_page" + "'", str0, "org.eclipse.jetty.server.error_page");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.github.tomakehurst.wiremock.recording.RecordSpecBuilder recordSpecBuilder0 = new com.github.tomakehurst.wiremock.recording.RecordSpecBuilder();
        com.github.tomakehurst.wiremock.recording.RecordSpecBuilder recordSpecBuilder3 = recordSpecBuilder0.matchRequestBodyWithEqualToJson((java.lang.Boolean) true, (java.lang.Boolean) false);
        com.github.tomakehurst.wiremock.recording.RecordSpecBuilder recordSpecBuilder6 = recordSpecBuilder0.matchRequestBodyWithEqualToJson((java.lang.Boolean) false, (java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(recordSpecBuilder3);
        org.junit.Assert.assertNotNull(recordSpecBuilder6);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.github.tomakehurst.wiremock.security.ClientAuthenticator clientAuthenticator7 = null;
        com.github.tomakehurst.wiremock.client.HttpAdminClient httpAdminClient8 = new com.github.tomakehurst.wiremock.client.HttpAdminClient("]", " exactly ", 0, "[ERROR: ", "application/octet-stream", "Transfer-Encoding", (-1), clientAuthenticator7);
        int int9 = httpAdminClient8.port();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.github.tomakehurst.wiremock.verification.NearMiss[] nearMissArray0 = new com.github.tomakehurst.wiremock.verification.NearMiss[] {};
        java.util.ArrayList<com.github.tomakehurst.wiremock.verification.NearMiss> nearMissList1 = new java.util.ArrayList<com.github.tomakehurst.wiremock.verification.NearMiss>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.github.tomakehurst.wiremock.verification.NearMiss>) nearMissList1, nearMissArray0);
        com.github.tomakehurst.wiremock.client.VerificationException verificationException3 = com.github.tomakehurst.wiremock.client.VerificationException.forUnmatchedNearMisses((java.util.List<com.github.tomakehurst.wiremock.verification.NearMiss>) nearMissList1);
        org.junit.Assert.assertNotNull(nearMissArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(verificationException3);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.github.tomakehurst.wiremock.common.AsynchronousResponseSettings asynchronousResponseSettings2 = new com.github.tomakehurst.wiremock.common.AsynchronousResponseSettings(true, (int) (short) 1);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.github.tomakehurst.wiremock.common.url.QueryParams queryParams0 = new com.github.tomakehurst.wiremock.common.url.QueryParams();
        com.github.tomakehurst.wiremock.client.WireMock.JsonSchemaVersion jsonSchemaVersion1 = com.github.tomakehurst.wiremock.client.WireMock.JsonSchemaVersion.V201909;
        boolean boolean2 = queryParams0.equals((java.lang.Object) jsonSchemaVersion1);
        org.junit.Assert.assertTrue("'" + jsonSchemaVersion1 + "' != '" + com.github.tomakehurst.wiremock.client.WireMock.JsonSchemaVersion.V201909 + "'", jsonSchemaVersion1.equals(com.github.tomakehurst.wiremock.client.WireMock.JsonSchemaVersion.V201909));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.github.tomakehurst.wiremock.matching.UrlPattern urlPattern0 = null;
        com.github.tomakehurst.wiremock.client.MappingBuilder mappingBuilder1 = com.github.tomakehurst.wiremock.client.WireMock.head(urlPattern0);
        org.junit.Assert.assertNotNull(mappingBuilder1);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.lang.String str2 = com.github.tomakehurst.wiremock.common.Strings.wrapIfLongestLineExceedsLimit("application/octet-stream", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a\np\np\nl\ni\nc\na\nt\ni\no\nn\n/\no\nc\nt\ne\nt\n-\ns\nt\nr\ne\na\nm" + "'", str2, "a\np\np\nl\ni\nc\na\nt\ni\no\nn\n/\no\nc\nt\ne\nt\n-\ns\nt\nr\ne\na\nm");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.github.tomakehurst.wiremock.core.StubServer stubServer0 = null;
        com.github.tomakehurst.wiremock.http.ResponseRenderer responseRenderer1 = null;
        com.github.tomakehurst.wiremock.core.Admin admin2 = null;
        java.util.Map<java.lang.String, com.github.tomakehurst.wiremock.extension.PostServeAction> strMap3 = null;
        java.util.Map<java.lang.String, com.github.tomakehurst.wiremock.extension.ServeEventListener> strMap4 = null;
        com.github.tomakehurst.wiremock.verification.RequestJournal requestJournal5 = null;
        com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter[] requestFilterArray6 = new com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter[] {};
        java.util.ArrayList<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter> requestFilterList7 = new java.util.ArrayList<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter>) requestFilterList7, requestFilterArray6);
        com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilterV2[] requestFilterV2Array9 = new com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilterV2[] {};
        java.util.ArrayList<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilterV2> requestFilterV2List10 = new java.util.ArrayList<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilterV2>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilterV2>) requestFilterV2List10, requestFilterV2Array9);
        com.github.tomakehurst.wiremock.common.DataTruncationSettings dataTruncationSettings13 = com.github.tomakehurst.wiremock.common.DataTruncationSettings.NO_TRUNCATION;
        com.github.tomakehurst.wiremock.verification.notmatched.NotMatchedRenderer notMatchedRenderer14 = null;
        com.github.tomakehurst.wiremock.http.StubRequestHandler stubRequestHandler15 = new com.github.tomakehurst.wiremock.http.StubRequestHandler(stubServer0, responseRenderer1, admin2, strMap3, strMap4, requestJournal5, (java.util.List<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter>) requestFilterList7, (java.util.List<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilterV2>) requestFilterV2List10, false, dataTruncationSettings13, notMatchedRenderer14);
        com.github.tomakehurst.wiremock.http.RequestListener requestListener16 = null;
        stubRequestHandler15.addRequestListener(requestListener16);
        org.junit.Assert.assertNotNull(requestFilterArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(requestFilterV2Array9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dataTruncationSettings13);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.github.tomakehurst.wiremock.matching.AfterDateTimePattern afterDateTimePattern0 = com.github.tomakehurst.wiremock.client.WireMock.afterNow();
        org.junit.Assert.assertNotNull(afterDateTimePattern0);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.github.tomakehurst.wiremock.http.trafficlistener.CollectingNetworkTrafficListener collectingNetworkTrafficListener0 = new com.github.tomakehurst.wiremock.http.trafficlistener.CollectingNetworkTrafficListener();
        java.lang.String str1 = collectingNetworkTrafficListener0.getAllRequests();
        com.github.tomakehurst.wiremock.http.trafficlistener.CollectingNetworkTrafficListener collectingNetworkTrafficListener2 = new com.github.tomakehurst.wiremock.http.trafficlistener.CollectingNetworkTrafficListener();
        java.lang.String str3 = collectingNetworkTrafficListener2.getAllRequests();
        com.github.tomakehurst.wiremock.http.trafficlistener.CollectingNetworkTrafficListener[] collectingNetworkTrafficListenerArray4 = new com.github.tomakehurst.wiremock.http.trafficlistener.CollectingNetworkTrafficListener[] { collectingNetworkTrafficListener0, collectingNetworkTrafficListener2 };
        java.util.ArrayList<com.github.tomakehurst.wiremock.http.trafficlistener.CollectingNetworkTrafficListener> collectingNetworkTrafficListenerList5 = new java.util.ArrayList<com.github.tomakehurst.wiremock.http.trafficlistener.CollectingNetworkTrafficListener>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.github.tomakehurst.wiremock.http.trafficlistener.CollectingNetworkTrafficListener>) collectingNetworkTrafficListenerList5, collectingNetworkTrafficListenerArray4);
        com.github.tomakehurst.wiremock.admin.LimitAndOffsetPaginator<com.github.tomakehurst.wiremock.http.trafficlistener.CollectingNetworkTrafficListener> collectingNetworkTrafficListenerLimitAndOffsetPaginator9 = new com.github.tomakehurst.wiremock.admin.LimitAndOffsetPaginator<com.github.tomakehurst.wiremock.http.trafficlistener.CollectingNetworkTrafficListener>((java.util.List<com.github.tomakehurst.wiremock.http.trafficlistener.CollectingNetworkTrafficListener>) collectingNetworkTrafficListenerList5, (java.lang.Integer) 100, (java.lang.Integer) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(collectingNetworkTrafficListenerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.github.tomakehurst.wiremock.stubbing.StubImport.Options options0 = com.github.tomakehurst.wiremock.stubbing.StubImport.Options.DEFAULTS;
        org.junit.Assert.assertNotNull(options0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.github.tomakehurst.wiremock.common.FileSource fileSource0 = null;
        com.github.tomakehurst.wiremock.store.files.FileSourceBlobStore fileSourceBlobStore1 = new com.github.tomakehurst.wiremock.store.files.FileSourceBlobStore(fileSource0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.Stream<java.lang.String> strStream2 = fileSourceBlobStore1.getAllKeys();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.github.tomakehurst.wiremock.common.FileSource.getUri()\" because \"this.fileSource\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.github.tomakehurst.wiremock.http.ResponseDefinition responseDefinition0 = com.github.tomakehurst.wiremock.http.ResponseDefinition.noContent();
        org.junit.Assert.assertNotNull(responseDefinition0);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        jakarta.servlet.ServletContext servletContext0 = null;
        com.github.tomakehurst.wiremock.servlet.WarConfiguration warConfiguration1 = new com.github.tomakehurst.wiremock.servlet.WarConfiguration(servletContext0);
        java.util.Set<java.lang.String> strSet2 = warConfiguration1.getSupportedProxyEncodings();
        boolean boolean3 = warConfiguration1.getResponseTemplatingGlobal();
        com.github.tomakehurst.wiremock.core.MappingsSaver mappingsSaver4 = warConfiguration1.mappingsSaver();
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(mappingsSaver4);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.github.tomakehurst.wiremock.security.ClientBasicAuthenticator clientBasicAuthenticator2 = new com.github.tomakehurst.wiremock.security.ClientBasicAuthenticator("wiremock.isHttpsProxyRequest", "H9W4Mw3mHK");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.github.tomakehurst.wiremock.http.Request request0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.tomakehurst.wiremock.http.ResponseDefinition responseDefinition1 = com.github.tomakehurst.wiremock.http.ResponseDefinition.browserProxy(request0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.github.tomakehurst.wiremock.http.Request.getAbsoluteUrl()\" because \"originalRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.lang.String str0 = org.eclipse.jetty.util.component.Dumpable.KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "key: +- bean, += managed, +~ unmanaged, +? auto, +: iterable, +] array, +@ map, +> undefined" + "'", str0, "key: +- bean, += managed, +~ unmanaged, +? auto, +: iterable, +] array, +@ map, +> undefined");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.github.tomakehurst.wiremock.http.ssl.TrustSelfSignedStrategy trustSelfSignedStrategy0 = new com.github.tomakehurst.wiremock.http.ssl.TrustSelfSignedStrategy();
        com.github.tomakehurst.wiremock.http.ssl.TrustSelfSignedStrategy trustSelfSignedStrategy1 = new com.github.tomakehurst.wiremock.http.ssl.TrustSelfSignedStrategy();
        java.security.cert.X509Certificate x509Certificate2 = null;
        java.security.cert.X509Certificate[] x509CertificateArray3 = new java.security.cert.X509Certificate[] { x509Certificate2 };
        javax.net.ssl.SSLEngine sSLEngine5 = null;
        boolean boolean6 = trustSelfSignedStrategy1.isTrusted(x509CertificateArray3, "path equalTo zrcDq42e1ud4nWIEcxneEUF3oopZCEHrvuQrkkg5yua3hb5Kl4AI", sSLEngine5);
        javax.net.ssl.SSLEngine sSLEngine8 = null;
        boolean boolean9 = trustSelfSignedStrategy0.isTrusted(x509CertificateArray3, "Location", sSLEngine8);
        com.github.tomakehurst.wiremock.http.ssl.TrustSelfSignedStrategy trustSelfSignedStrategy10 = new com.github.tomakehurst.wiremock.http.ssl.TrustSelfSignedStrategy();
        com.github.tomakehurst.wiremock.http.ssl.TrustSelfSignedStrategy trustSelfSignedStrategy11 = new com.github.tomakehurst.wiremock.http.ssl.TrustSelfSignedStrategy();
        java.security.cert.X509Certificate x509Certificate12 = null;
        java.security.cert.X509Certificate[] x509CertificateArray13 = new java.security.cert.X509Certificate[] { x509Certificate12 };
        javax.net.ssl.SSLEngine sSLEngine15 = null;
        boolean boolean16 = trustSelfSignedStrategy11.isTrusted(x509CertificateArray13, "path equalTo zrcDq42e1ud4nWIEcxneEUF3oopZCEHrvuQrkkg5yua3hb5Kl4AI", sSLEngine15);
        javax.net.ssl.SSLEngine sSLEngine18 = null;
        boolean boolean19 = trustSelfSignedStrategy10.isTrusted(x509CertificateArray13, "Location", sSLEngine18);
        boolean boolean21 = trustSelfSignedStrategy0.isTrusted(x509CertificateArray13, "and");
        org.junit.Assert.assertNotNull(x509CertificateArray3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(x509CertificateArray13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder responseDefinitionBuilder1 = com.github.tomakehurst.wiremock.client.WireMock.okTextXml("hi!");
        com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder responseDefinitionBuilder4 = responseDefinitionBuilder1.withChunkedDribbleDelay((int) (short) -1, (int) (byte) -1);
        com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder responseDefinitionBuilder6 = responseDefinitionBuilder4.withStatusMessage(" exactly ");
        com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder responseDefinitionBuilder8 = responseDefinitionBuilder4.withStatus((-1));
        org.junit.Assert.assertNotNull(responseDefinitionBuilder1);
        org.junit.Assert.assertNotNull(responseDefinitionBuilder4);
        org.junit.Assert.assertNotNull(responseDefinitionBuilder6);
        org.junit.Assert.assertNotNull(responseDefinitionBuilder8);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.github.tomakehurst.wiremock.security.ClientAuthenticator clientAuthenticator7 = null;
        com.github.tomakehurst.wiremock.client.WireMock wireMock8 = new com.github.tomakehurst.wiremock.client.WireMock("hi!", "FaultHandlerFactoryClass", (int) (byte) 0, "", "H9W4Mw3mHK", "zrcDq42e1ud4nWIEcxneEUF3oopZCEHrvuQrkkg5yua3hb5Kl4AI", (int) (short) 10, clientAuthenticator7);
        // The following exception was thrown during execution in test generation
        try {
            wireMock8.loadMappingsFrom("path equalTo zrcDq42e1ud4nWIEcxneEUF3oopZCEHrvuQrkkg5yua3hb5Kl4AI");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: path equalTo zrcDq42e1ud4nWIEcxneEUF3oopZCEHrvuQrkkg5yua3hb5Kl4AI/mappings does not exist");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.time.LocalDateTime localDateTime0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.tomakehurst.wiremock.matching.AfterDateTimePattern afterDateTimePattern1 = new com.github.tomakehurst.wiremock.matching.AfterDateTimePattern(localDateTime0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.toString()\" because \"localDateTime\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.github.tomakehurst.wiremock.store.files.FileSourceJsonObjectStore fileSourceJsonObjectStore1 = new com.github.tomakehurst.wiremock.store.files.FileSourceJsonObjectStore("and");
        java.lang.String str2 = fileSourceJsonObjectStore1.getPath();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "and" + "'", str2, "and");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.github.tomakehurst.wiremock.common.HttpsSettings httpsSettings0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.eclipse.jetty.util.ssl.SslContextFactory.Server server1 = com.github.tomakehurst.wiremock.jetty11.SslContexts.buildHttp1_1SslContextFactory(httpsSettings0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.github.tomakehurst.wiremock.common.HttpsSettings.keyStore()\" because \"httpsSettings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.github.tomakehurst.wiremock.stubbing.InMemoryStubMappings inMemoryStubMappings0 = new com.github.tomakehurst.wiremock.stubbing.InMemoryStubMappings();
        java.util.UUID uUID1 = null;
        java.util.Optional<com.github.tomakehurst.wiremock.stubbing.StubMapping> stubMappingOptional2 = inMemoryStubMappings0.get(uUID1);
        java.util.Optional<com.github.tomakehurst.wiremock.stubbing.StubMapping> stubMappingOptional4 = com.github.tomakehurst.wiremock.common.ParameterUtils.checkNotNull(stubMappingOptional2, "[ERROR: ");
        org.junit.Assert.assertNotNull(stubMappingOptional2);
        org.junit.Assert.assertNotNull(stubMappingOptional4);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.time.ZonedDateTime zonedDateTime0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.tomakehurst.wiremock.matching.AfterDateTimePattern afterDateTimePattern1 = com.github.tomakehurst.wiremock.client.WireMock.after(zonedDateTime0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.ZonedDateTime.toString()\" because \"zonedDateTime\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.github.tomakehurst.wiremock.client.WireMock wireMock0 = new com.github.tomakehurst.wiremock.client.WireMock();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.github.tomakehurst.wiremock.client.WireMockBuilder wireMockBuilder0 = new com.github.tomakehurst.wiremock.client.WireMockBuilder();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        jakarta.servlet.ServletContext servletContext0 = null;
        com.github.tomakehurst.wiremock.servlet.WarConfiguration warConfiguration1 = new com.github.tomakehurst.wiremock.servlet.WarConfiguration(servletContext0);
        com.github.tomakehurst.wiremock.common.ProxySettings proxySettings2 = warConfiguration1.proxyVia();
        com.github.tomakehurst.wiremock.http.trafficlistener.WiremockNetworkTrafficListener wiremockNetworkTrafficListener3 = warConfiguration1.networkTrafficListener();
        org.junit.Assert.assertNotNull(proxySettings2);
        org.junit.Assert.assertNotNull(wiremockNetworkTrafficListener3);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        // The following exception was thrown during execution in test generation
        try {
            com.github.tomakehurst.wiremock.recording.SnapshotOutputFormatter snapshotOutputFormatter1 = com.github.tomakehurst.wiremock.recording.SnapshotOutputFormatter.fromString("path equalTo zrcDq42e1ud4nWIEcxneEUF3oopZCEHrvuQrkkg5yua3hb5Kl4AI");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid output format");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.github.tomakehurst.wiremock.core.StubServer stubServer0 = null;
        com.github.tomakehurst.wiremock.http.ResponseRenderer responseRenderer1 = null;
        com.github.tomakehurst.wiremock.core.Admin admin2 = null;
        java.util.Map<java.lang.String, com.github.tomakehurst.wiremock.extension.PostServeAction> strMap3 = null;
        java.util.Map<java.lang.String, com.github.tomakehurst.wiremock.extension.ServeEventListener> strMap4 = null;
        com.github.tomakehurst.wiremock.verification.RequestJournal requestJournal5 = null;
        com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter[] requestFilterArray6 = new com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter[] {};
        java.util.ArrayList<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter> requestFilterList7 = new java.util.ArrayList<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter>) requestFilterList7, requestFilterArray6);
        com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilterV2[] requestFilterV2Array9 = new com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilterV2[] {};
        java.util.ArrayList<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilterV2> requestFilterV2List10 = new java.util.ArrayList<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilterV2>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilterV2>) requestFilterV2List10, requestFilterV2Array9);
        com.github.tomakehurst.wiremock.common.DataTruncationSettings dataTruncationSettings13 = com.github.tomakehurst.wiremock.common.DataTruncationSettings.NO_TRUNCATION;
        com.github.tomakehurst.wiremock.verification.notmatched.NotMatchedRenderer notMatchedRenderer14 = null;
        com.github.tomakehurst.wiremock.http.StubRequestHandler stubRequestHandler15 = new com.github.tomakehurst.wiremock.http.StubRequestHandler(stubServer0, responseRenderer1, admin2, strMap3, strMap4, requestJournal5, (java.util.List<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter>) requestFilterList7, (java.util.List<com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilterV2>) requestFilterV2List10, false, dataTruncationSettings13, notMatchedRenderer14);
        // The following exception was thrown during execution in test generation
        try {
            com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilter requestFilter17 = requestFilterList7.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestFilterArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(requestFilterV2Array9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dataTruncationSettings13);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.github.tomakehurst.wiremock.recording.RequestPatternTransformer requestPatternTransformer0 = null;
        com.github.tomakehurst.wiremock.recording.LoggedResponseDefinitionTransformer loggedResponseDefinitionTransformer1 = new com.github.tomakehurst.wiremock.recording.LoggedResponseDefinitionTransformer();
        com.github.tomakehurst.wiremock.recording.SnapshotStubMappingGenerator snapshotStubMappingGenerator2 = new com.github.tomakehurst.wiremock.recording.SnapshotStubMappingGenerator(requestPatternTransformer0, loggedResponseDefinitionTransformer1);
    }
}
