package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

@Target({ElementType.TYPE}) // Class、Interface、Enumにこのアノテーションを使うことが出来る
@Retention(java.lang.annotation.RetentionPolicy.RUNTIME) // アノテーションの読み込みタイミング。実行時にVMに読み込まれる
@SpringBootTest
@Inherited // 継承されたクラスにもこのアノテーションが適用される
@AutoConfigureMockMvc // ドキュメントみてもよく分からん系。MockMvcを使う時に必要なやつだと思う。
@Transactional
@Rollback
//@ActiveProfiles("test") // application-test.ymlを適用する
public @interface DefauldTest {
    String properties() default "";
}
