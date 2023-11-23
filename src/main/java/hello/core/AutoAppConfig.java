package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration      //Configuration 안에 Component가 포함되고 있다
@ComponentScan(    //Component 어노테이션이 붙은걸 자동으로 굵어와준다
         //어디서 부터 찾는지 지정, 여러개도 지정 가능, delfault는 1번쨰줄 패키지, basePackages = "hello.core",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
        //긁어와주는 것을 필터링 한다 (AppConfig 제외)
)
public class AutoAppConfig {
}
