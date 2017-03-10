package com.sample.userMangement.config.oauth.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/*
//@Configuration
@PropertySource({ "classpath:persistence.properties" })
@EnableAuthorizationServer
public class OAuth2AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {
	private static final String RESOURCE_ID = "blog_resource";
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	 private static String REALM="EXAMPLE_REALM";
	 
	 @Autowired
	 private TokenStore tokenStore;
	 
	 @Autowired
	 private UserApprovalHandler handler;

	@Override // [2]
	public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
		endpoints.authenticationManager(authenticationManager);
	}

	@Override // [3]
	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
		// @formatter:off
		clients.inMemory().withClient("client-with-registered-redirect").authorizedGrantTypes("authorization_code")
				.authorities("ROLE_CLIENT").scopes("read", "trust").resourceIds(RESOURCE_ID)
				.redirectUris("http://anywhere?key=value").secret("secret123").and().withClient("my-client-with-secret")
				.authorizedGrantTypes("client_credentials", "password").authorities("ROLE_CLIENT").scopes("read")
				.resourceIds(RESOURCE_ID).secret("secret");
		// @formatter:on
	}
}
*/