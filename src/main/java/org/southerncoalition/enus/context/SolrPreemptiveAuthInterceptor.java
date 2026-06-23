package org.southerncoalition.enus.context;

import java.io.IOException;

import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.AuthState;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpCoreContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SolrPreemptiveAuthInterceptor implements HttpRequestInterceptor {

    final static Logger log = LoggerFactory.getLogger(SolrPreemptiveAuthInterceptor.class); 

    private final String username;
    private final String password;

    public SolrPreemptiveAuthInterceptor(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public void process(HttpRequest request, HttpContext context) throws HttpException, IOException {
         AuthState authState = (AuthState) context.getAttribute(HttpClientContext.TARGET_AUTH_STATE);
            // If no auth scheme available yet, try to initialize it preemptively
            if (authState.getAuthScheme() == null) {
                log.info("No AuthState: set Basic Auth");

                HttpHost targetHost = (HttpHost) context.getAttribute(HttpCoreContext.HTTP_TARGET_HOST);
                AuthScope authScope = new AuthScope(targetHost.getHostName(), targetHost.getPort());

                CredentialsProvider credsProvider = (CredentialsProvider) context.getAttribute(HttpClientContext.CREDS_PROVIDER);

                Credentials creds = credsProvider.getCredentials(authScope);
                if(creds == null){
                    log.info("No Basic Auth credentials: add them");
                    creds = getCredentials(authScope);
                }
                authState.update(new BasicScheme(), creds);
            }

    }


    private Credentials getCredentials(AuthScope authScope) {


        UsernamePasswordCredentials creds = new UsernamePasswordCredentials(username, password);

        CredentialsProvider credsProvider = new BasicCredentialsProvider();
        credsProvider.setCredentials(authScope, creds);
        log.info("Creating Basic Auth credentials for user {}", username);

        return credsProvider.getCredentials(authScope);
    }

}