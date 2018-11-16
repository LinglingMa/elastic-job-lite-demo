package io.elasticjob.lite.springboot.annotation;

import io.elasticjob.lite.springboot.autoconfigure.JobParserAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author malingling <malingling@kuaishou.com>
 * Created on 2018-11-16
 */

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({JobParserAutoConfiguration.class})
public @interface EnableElasticJob {
}
