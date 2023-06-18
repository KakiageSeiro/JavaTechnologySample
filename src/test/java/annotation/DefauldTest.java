package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.example.JavaTechnologySample.JavaTechnologySampleApplication;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.AliasFor;

@Target({ElementType.TYPE}) // Class、Interface、Enumにこのアノテーションを使うことが出来る
@Retention(java.lang.annotation.RetentionPolicy.RUNTIME) // アノテーションの読み込みタイミング。実行時にVMに読み込まれる
@SpringBootTest(classes = JavaTechnologySampleApplication.class) // ここで指定したクラス配下がSpringのBeanの検索範囲になることに注意。
@Inherited // 継承されたクラスにもこのアノテーションが適用される
//@AutoConfigureMockMvc // ドキュメントみてもよく分からん系。MockMvcを使う時に必要なやつだと思う。
//@Transactional
//@Rollback
//@ActiveProfiles("test") // application-test.ymlを適用する
public @interface DefauldTest {
}
