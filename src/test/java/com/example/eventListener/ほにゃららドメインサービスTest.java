package com.example.eventListener;

import annotation.DefauldTest;
import com.example.JavaTechnologySample.EventListener.ほにゃららドメインサービス型;
import com.example.JavaTechnologySample.EventListener.自分が定義したイベント型;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@DefauldTest
@DisplayName("ほにゃららドメインサービス型Test") // 別名みたいなもの。テストの結果が文字数などで見づらくなったときとかに、class名を適当に変えてこのアノテーションで人間に対して説明する。
class ほにゃららドメインサービスTest {

    @Autowired
    ほにゃららドメインサービス型 ほにゃららドメインサービス;

    @Test
    void 更新テスト() {
        // 呼ぶだけ。ログ出力の順番を確認して、イベント発火によってリスナーが動いていることを見る。
        自分が定義したイベント型 イベント = ほにゃららドメインサービス.ほにゃららを更新する("ほにゃらら更新コマンドだよ〜");
    }
}