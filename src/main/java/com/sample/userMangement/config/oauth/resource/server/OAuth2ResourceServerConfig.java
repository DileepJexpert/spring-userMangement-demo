package com.sample.userMangement.config.oauth.resource.server;

//@Configuration
/*@EnableResourceServer
public class OAuth2ResourceServerConfig  extends ResourceServerConfigurerAdapter{
	private static final String RESOURCE_ID = "blog_resource";
	  @Override // [3]
      public void configure(HttpSecurity http) throws Exception {
           // @formatter:off
           http
           // Just for laughs, apply OAuth protection to only 2 resources
           .requestMatchers().antMatchers("/","/admin/beans").and()
           .authorizeRequests()
           .anyRequest().access("#oauth2.hasScope('read')"); //[4]
           // @formatter:on
      }

      @Override
      public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
           resources.resourceId(RESOURCE_ID).stateless(false);
      }

}
*/