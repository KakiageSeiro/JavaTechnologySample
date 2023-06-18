package EventListener;

import annotation.DefauldTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DefauldTest
@DisplayName("ほにゃららドメインサービス型Test") // 別名みたいなもの。テストの結果が文字数などで見づらくなったときとかに、class名を適当に変えてこのアノテーションで人間に対して説明する。
class ほにゃららドメインサービス型Test {

    @Test
    void ほにゃららを更新する() {
        ほにゃららドメインサービス型 ほにゃららドメインサービス = new ほにゃららドメインサービス型();

        // 呼ぶだけ。ログ出力の順番を確認して、イベント発火によってリスナーが動いていることを見る。
        ほにゃららドメインサービス.ほにゃららを更新する("ほにゃらら更新コマンドだよ〜");
    }
}