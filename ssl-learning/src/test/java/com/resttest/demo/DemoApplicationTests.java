package com.resttest.demo;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;

import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ssl.SSLContextBuilder;
import org.apache.http.conn.ssl.SSLContexts;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils; 
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class DemoApplicationTests {

	private static final String JAVA_KEYSTORE = "jks";   
    private static final String CLIENT_TRUSTSTORE = "ssl/client_truststore.jks";  
    private static final char[] storePassword = "P@ssw0rd".toCharArray();   
    
//	private static final boolean ONE_WAY_SSL = false; // no client certificates
//	private static final String SERVER_KEYSTORE = "ssl/server_keystore.jks"; 
    
    private CloseableHttpClient httpclient; 
	
    /**
     * Rigorous Test :-)
     */
    @Test
    public void main() throws Exception {
    	
	}
}
