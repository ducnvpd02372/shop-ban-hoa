package group.shop.config;


import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;




@Configuration

@EnableScheduling
public class WebMvcConfig implements WebMvcConfigurer {
 
      
	@Bean(name = "messageSource")
    public MessageSource getMessageResource() {
        ReloadableResourceBundleMessageSource messageResource = new ReloadableResourceBundleMessageSource();
 
        // Đọc vào file i18n/messages_xxx.properties
        // Ví dụ: i18n/message_en.properties
        messageResource.setBasename("classpath:i18n/messages");
        messageResource.setDefaultEncoding("UTF-8");
        return messageResource;
    }
 
    // To solver URL like:
    // /SomeContextPath/en/login2
    // /SomeContextPath/vi/login2
    // /SomeContextPath/fr/login2
    @Bean(name = "localeResolver")
    public LocaleResolver getLocaleResolver() {
        LocaleResolver resolver = new UrlLocaleResolver();
        return resolver;
    }
 
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
 
        UrlLocaleInterceptor localeInterceptor = new UrlLocaleInterceptor();
 
        registry.addInterceptor(localeInterceptor).addPathPatterns("/en/*", "/vi/*");
    }
    

    
}