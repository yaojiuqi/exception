package com.yjq.exception;

import org.springframework.boot.autoconfigure.web.ResourceProperties;
import org.springframework.boot.autoconfigure.web.servlet.error.DefaultErrorViewResolver;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Component
public class MyErrorViewResolver extends DefaultErrorViewResolver {
    /**
     * Create a new {@link DefaultErrorViewResolver} instance.
     *
     * @param applicationContext the source application context
     * @param resourceProperties resource properties
     */
    public MyErrorViewResolver(ApplicationContext applicationContext, ResourceProperties resourceProperties) {
        super(applicationContext, resourceProperties);
    }

    @Override
    public ModelAndView resolveErrorView(HttpServletRequest request, HttpStatus status, Map<String, Object> model) {
        ModelAndView mv = super.resolveErrorView(request, status, model);
        mv.setViewName("error");
        mv.addAllObjects(model);
        return mv;
    }
}
